
package com.intrasoft_internatinal.gatewayservice.profitsext;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PFG004VFFLOutGrpHeaderItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PFG004VFFLOutGrpHeaderItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OutGrpHeaderOutGrmPfgSetupDetailTagSetCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpHeaderOutGrmPfgSetupDetailTag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpHeaderOutGrmPfgSetupDetailSetSn" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGrpHeaderOutGrmPfgSetupDetailSubtagSn" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutGrpHeaderOutGrmPfgSetupDetailShowOrder" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGrpHeaderOutGrmPfgSetupDetailTagFieldType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpHeaderOutGrmPfgSetupDetailTagFieldFormat" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpHeaderOutGrmPfgSetupDetailTagLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpHeaderOutGrmPfgSetupDetailTagDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpHeaderOutGrmPfgSetupDetailTagFieldLength" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGrpHeaderOutGrmPfgSetupDetailTagMandatory" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpHeaderOutGrmPfgSetupDetailTagUseList" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpHeaderOutGrmPfgSetupDetailTagUseValidation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpHeaderOutGrmPfgSetupDetailTagRepetitive" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpHeaderOutGrmPfgSetupDetailTagVerification" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpHeaderOutGrmPfgSetupDetailTagSameLine" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpHeaderOutGrmPfgSetupDetailTagNextLine" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpHeaderOutGrmPfgSetupDetailTagValueAndData" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpHeaderOutGrmPfgSetupDetailNeedMessageType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpHeaderOutGrmPfgSetupDetailNeedMandatory" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpHeaderOutGrmPfgSetupDetailNeedDisabled" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpHeaderOutGrmPfgSetupDetailNeedSums" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpHeaderOutGrmPfgSetupDetailNeedCharCheck" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpHeaderOutGrmPfgSetupDetailNeedValues" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpHeaderOutGrmPfgSetupDetailNeedValueDisable" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpHeaderOutGrmPfgSetupDetailNeedValVsVal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpHeaderOutGrmPfgSetupDetailTagRepeatNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGrpHeaderOutGrmPfgSetupDetailRepetativeRef" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGrpHeaderOutGrmPfgSetupDetailCheckCurrStag" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutGrpHeaderOutGrmPfgSetupDetailCheckCurrTag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpHeaderOutGrmPfgSetupDetailCheckCurrDec" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpHeaderOutGrmPfgSetupDetailCheckEquality" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpHeaderOutGrmPfgSetupDetailRefFldFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpHeaderOutGrmPfgSetupDetailProtectedFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpHeaderOutGrmPfgSetupDetailNeedMandaFunc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpHeaderOutGrmPfgSetupDetailPrftRefNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpHeaderOutGrmPfgSetupDetailTagReceiver" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpHeaderOutGrmPfgSetupDetailTagSender" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpHeaderOutGrmPfgSetupDetailTagStp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpHeaderOutGrmPfgSetupDetailSetCategory" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpHeaderOutGrmPfgSetupDetailTagPriority" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpHeaderOutGrmPfgSetupDetailMurField" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpHeaderOutGrmPfgSetupDetailFkValidateDcdId" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OutGrpHeaderOutGrmPfgSetupDetailExceptionCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpHeaderOutGrmPfgSetupDetailCheckExtCharSet" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpHeaderOutGrmPfgSetupDetailShowToUser" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpHeaderOutGrmPfgSetupDetailExactLength" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PFG004VFFLOutGrpHeaderItem", propOrder = {
    "outGrpHeaderOutGrmPfgSetupDetailTagSetCode",
    "outGrpHeaderOutGrmPfgSetupDetailTag",
    "outGrpHeaderOutGrmPfgSetupDetailSetSn",
    "outGrpHeaderOutGrmPfgSetupDetailSubtagSn",
    "outGrpHeaderOutGrmPfgSetupDetailShowOrder",
    "outGrpHeaderOutGrmPfgSetupDetailTagFieldType",
    "outGrpHeaderOutGrmPfgSetupDetailTagFieldFormat",
    "outGrpHeaderOutGrmPfgSetupDetailTagLabel",
    "outGrpHeaderOutGrmPfgSetupDetailTagDescription",
    "outGrpHeaderOutGrmPfgSetupDetailTagFieldLength",
    "outGrpHeaderOutGrmPfgSetupDetailTagMandatory",
    "outGrpHeaderOutGrmPfgSetupDetailTagUseList",
    "outGrpHeaderOutGrmPfgSetupDetailTagUseValidation",
    "outGrpHeaderOutGrmPfgSetupDetailTagRepetitive",
    "outGrpHeaderOutGrmPfgSetupDetailTagVerification",
    "outGrpHeaderOutGrmPfgSetupDetailTagSameLine",
    "outGrpHeaderOutGrmPfgSetupDetailTagNextLine",
    "outGrpHeaderOutGrmPfgSetupDetailTagValueAndData",
    "outGrpHeaderOutGrmPfgSetupDetailNeedMessageType",
    "outGrpHeaderOutGrmPfgSetupDetailNeedMandatory",
    "outGrpHeaderOutGrmPfgSetupDetailNeedDisabled",
    "outGrpHeaderOutGrmPfgSetupDetailNeedSums",
    "outGrpHeaderOutGrmPfgSetupDetailNeedCharCheck",
    "outGrpHeaderOutGrmPfgSetupDetailNeedValues",
    "outGrpHeaderOutGrmPfgSetupDetailNeedValueDisable",
    "outGrpHeaderOutGrmPfgSetupDetailNeedValVsVal",
    "outGrpHeaderOutGrmPfgSetupDetailTagRepeatNumber",
    "outGrpHeaderOutGrmPfgSetupDetailRepetativeRef",
    "outGrpHeaderOutGrmPfgSetupDetailCheckCurrStag",
    "outGrpHeaderOutGrmPfgSetupDetailCheckCurrTag",
    "outGrpHeaderOutGrmPfgSetupDetailCheckCurrDec",
    "outGrpHeaderOutGrmPfgSetupDetailCheckEquality",
    "outGrpHeaderOutGrmPfgSetupDetailRefFldFlag",
    "outGrpHeaderOutGrmPfgSetupDetailProtectedFlag",
    "outGrpHeaderOutGrmPfgSetupDetailNeedMandaFunc",
    "outGrpHeaderOutGrmPfgSetupDetailPrftRefNo",
    "outGrpHeaderOutGrmPfgSetupDetailTagReceiver",
    "outGrpHeaderOutGrmPfgSetupDetailTagSender",
    "outGrpHeaderOutGrmPfgSetupDetailTagStp",
    "outGrpHeaderOutGrmPfgSetupDetailSetCategory",
    "outGrpHeaderOutGrmPfgSetupDetailTagPriority",
    "outGrpHeaderOutGrmPfgSetupDetailMurField",
    "outGrpHeaderOutGrmPfgSetupDetailFkValidateDcdId",
    "outGrpHeaderOutGrmPfgSetupDetailExceptionCode",
    "outGrpHeaderOutGrmPfgSetupDetailCheckExtCharSet",
    "outGrpHeaderOutGrmPfgSetupDetailShowToUser",
    "outGrpHeaderOutGrmPfgSetupDetailExactLength"
})
public class PFG004VFFLOutGrpHeaderItem {

    @XmlElement(name = "OutGrpHeaderOutGrmPfgSetupDetailTagSetCode")
    protected String outGrpHeaderOutGrmPfgSetupDetailTagSetCode;
    @XmlElement(name = "OutGrpHeaderOutGrmPfgSetupDetailTag")
    protected String outGrpHeaderOutGrmPfgSetupDetailTag;
    @XmlElement(name = "OutGrpHeaderOutGrmPfgSetupDetailSetSn")
    protected int outGrpHeaderOutGrmPfgSetupDetailSetSn;
    @XmlElement(name = "OutGrpHeaderOutGrmPfgSetupDetailSubtagSn")
    protected short outGrpHeaderOutGrmPfgSetupDetailSubtagSn;
    @XmlElement(name = "OutGrpHeaderOutGrmPfgSetupDetailShowOrder")
    protected int outGrpHeaderOutGrmPfgSetupDetailShowOrder;
    @XmlElement(name = "OutGrpHeaderOutGrmPfgSetupDetailTagFieldType")
    protected String outGrpHeaderOutGrmPfgSetupDetailTagFieldType;
    @XmlElement(name = "OutGrpHeaderOutGrmPfgSetupDetailTagFieldFormat")
    protected String outGrpHeaderOutGrmPfgSetupDetailTagFieldFormat;
    @XmlElement(name = "OutGrpHeaderOutGrmPfgSetupDetailTagLabel")
    protected String outGrpHeaderOutGrmPfgSetupDetailTagLabel;
    @XmlElement(name = "OutGrpHeaderOutGrmPfgSetupDetailTagDescription")
    protected String outGrpHeaderOutGrmPfgSetupDetailTagDescription;
    @XmlElement(name = "OutGrpHeaderOutGrmPfgSetupDetailTagFieldLength")
    protected int outGrpHeaderOutGrmPfgSetupDetailTagFieldLength;
    @XmlElement(name = "OutGrpHeaderOutGrmPfgSetupDetailTagMandatory")
    protected String outGrpHeaderOutGrmPfgSetupDetailTagMandatory;
    @XmlElement(name = "OutGrpHeaderOutGrmPfgSetupDetailTagUseList")
    protected String outGrpHeaderOutGrmPfgSetupDetailTagUseList;
    @XmlElement(name = "OutGrpHeaderOutGrmPfgSetupDetailTagUseValidation")
    protected String outGrpHeaderOutGrmPfgSetupDetailTagUseValidation;
    @XmlElement(name = "OutGrpHeaderOutGrmPfgSetupDetailTagRepetitive")
    protected String outGrpHeaderOutGrmPfgSetupDetailTagRepetitive;
    @XmlElement(name = "OutGrpHeaderOutGrmPfgSetupDetailTagVerification")
    protected String outGrpHeaderOutGrmPfgSetupDetailTagVerification;
    @XmlElement(name = "OutGrpHeaderOutGrmPfgSetupDetailTagSameLine")
    protected String outGrpHeaderOutGrmPfgSetupDetailTagSameLine;
    @XmlElement(name = "OutGrpHeaderOutGrmPfgSetupDetailTagNextLine")
    protected String outGrpHeaderOutGrmPfgSetupDetailTagNextLine;
    @XmlElement(name = "OutGrpHeaderOutGrmPfgSetupDetailTagValueAndData")
    protected String outGrpHeaderOutGrmPfgSetupDetailTagValueAndData;
    @XmlElement(name = "OutGrpHeaderOutGrmPfgSetupDetailNeedMessageType")
    protected String outGrpHeaderOutGrmPfgSetupDetailNeedMessageType;
    @XmlElement(name = "OutGrpHeaderOutGrmPfgSetupDetailNeedMandatory")
    protected String outGrpHeaderOutGrmPfgSetupDetailNeedMandatory;
    @XmlElement(name = "OutGrpHeaderOutGrmPfgSetupDetailNeedDisabled")
    protected String outGrpHeaderOutGrmPfgSetupDetailNeedDisabled;
    @XmlElement(name = "OutGrpHeaderOutGrmPfgSetupDetailNeedSums")
    protected String outGrpHeaderOutGrmPfgSetupDetailNeedSums;
    @XmlElement(name = "OutGrpHeaderOutGrmPfgSetupDetailNeedCharCheck")
    protected String outGrpHeaderOutGrmPfgSetupDetailNeedCharCheck;
    @XmlElement(name = "OutGrpHeaderOutGrmPfgSetupDetailNeedValues")
    protected String outGrpHeaderOutGrmPfgSetupDetailNeedValues;
    @XmlElement(name = "OutGrpHeaderOutGrmPfgSetupDetailNeedValueDisable")
    protected String outGrpHeaderOutGrmPfgSetupDetailNeedValueDisable;
    @XmlElement(name = "OutGrpHeaderOutGrmPfgSetupDetailNeedValVsVal")
    protected String outGrpHeaderOutGrmPfgSetupDetailNeedValVsVal;
    @XmlElement(name = "OutGrpHeaderOutGrmPfgSetupDetailTagRepeatNumber")
    protected int outGrpHeaderOutGrmPfgSetupDetailTagRepeatNumber;
    @XmlElement(name = "OutGrpHeaderOutGrmPfgSetupDetailRepetativeRef")
    protected int outGrpHeaderOutGrmPfgSetupDetailRepetativeRef;
    @XmlElement(name = "OutGrpHeaderOutGrmPfgSetupDetailCheckCurrStag")
    protected short outGrpHeaderOutGrmPfgSetupDetailCheckCurrStag;
    @XmlElement(name = "OutGrpHeaderOutGrmPfgSetupDetailCheckCurrTag")
    protected String outGrpHeaderOutGrmPfgSetupDetailCheckCurrTag;
    @XmlElement(name = "OutGrpHeaderOutGrmPfgSetupDetailCheckCurrDec")
    protected String outGrpHeaderOutGrmPfgSetupDetailCheckCurrDec;
    @XmlElement(name = "OutGrpHeaderOutGrmPfgSetupDetailCheckEquality")
    protected String outGrpHeaderOutGrmPfgSetupDetailCheckEquality;
    @XmlElement(name = "OutGrpHeaderOutGrmPfgSetupDetailRefFldFlag")
    protected String outGrpHeaderOutGrmPfgSetupDetailRefFldFlag;
    @XmlElement(name = "OutGrpHeaderOutGrmPfgSetupDetailProtectedFlag")
    protected String outGrpHeaderOutGrmPfgSetupDetailProtectedFlag;
    @XmlElement(name = "OutGrpHeaderOutGrmPfgSetupDetailNeedMandaFunc")
    protected String outGrpHeaderOutGrmPfgSetupDetailNeedMandaFunc;
    @XmlElement(name = "OutGrpHeaderOutGrmPfgSetupDetailPrftRefNo")
    protected String outGrpHeaderOutGrmPfgSetupDetailPrftRefNo;
    @XmlElement(name = "OutGrpHeaderOutGrmPfgSetupDetailTagReceiver")
    protected String outGrpHeaderOutGrmPfgSetupDetailTagReceiver;
    @XmlElement(name = "OutGrpHeaderOutGrmPfgSetupDetailTagSender")
    protected String outGrpHeaderOutGrmPfgSetupDetailTagSender;
    @XmlElement(name = "OutGrpHeaderOutGrmPfgSetupDetailTagStp")
    protected String outGrpHeaderOutGrmPfgSetupDetailTagStp;
    @XmlElement(name = "OutGrpHeaderOutGrmPfgSetupDetailSetCategory")
    protected String outGrpHeaderOutGrmPfgSetupDetailSetCategory;
    @XmlElement(name = "OutGrpHeaderOutGrmPfgSetupDetailTagPriority")
    protected String outGrpHeaderOutGrmPfgSetupDetailTagPriority;
    @XmlElement(name = "OutGrpHeaderOutGrmPfgSetupDetailMurField")
    protected String outGrpHeaderOutGrmPfgSetupDetailMurField;
    @XmlElement(name = "OutGrpHeaderOutGrmPfgSetupDetailFkValidateDcdId")
    protected double outGrpHeaderOutGrmPfgSetupDetailFkValidateDcdId;
    @XmlElement(name = "OutGrpHeaderOutGrmPfgSetupDetailExceptionCode")
    protected String outGrpHeaderOutGrmPfgSetupDetailExceptionCode;
    @XmlElement(name = "OutGrpHeaderOutGrmPfgSetupDetailCheckExtCharSet")
    protected String outGrpHeaderOutGrmPfgSetupDetailCheckExtCharSet;
    @XmlElement(name = "OutGrpHeaderOutGrmPfgSetupDetailShowToUser")
    protected String outGrpHeaderOutGrmPfgSetupDetailShowToUser;
    @XmlElement(name = "OutGrpHeaderOutGrmPfgSetupDetailExactLength")
    protected String outGrpHeaderOutGrmPfgSetupDetailExactLength;

    /**
     * Gets the value of the outGrpHeaderOutGrmPfgSetupDetailTagSetCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpHeaderOutGrmPfgSetupDetailTagSetCode() {
        return outGrpHeaderOutGrmPfgSetupDetailTagSetCode;
    }

    /**
     * Sets the value of the outGrpHeaderOutGrmPfgSetupDetailTagSetCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpHeaderOutGrmPfgSetupDetailTagSetCode(String value) {
        this.outGrpHeaderOutGrmPfgSetupDetailTagSetCode = value;
    }

    /**
     * Gets the value of the outGrpHeaderOutGrmPfgSetupDetailTag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpHeaderOutGrmPfgSetupDetailTag() {
        return outGrpHeaderOutGrmPfgSetupDetailTag;
    }

    /**
     * Sets the value of the outGrpHeaderOutGrmPfgSetupDetailTag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpHeaderOutGrmPfgSetupDetailTag(String value) {
        this.outGrpHeaderOutGrmPfgSetupDetailTag = value;
    }

    /**
     * Gets the value of the outGrpHeaderOutGrmPfgSetupDetailSetSn property.
     * 
     */
    public int getOutGrpHeaderOutGrmPfgSetupDetailSetSn() {
        return outGrpHeaderOutGrmPfgSetupDetailSetSn;
    }

    /**
     * Sets the value of the outGrpHeaderOutGrmPfgSetupDetailSetSn property.
     * 
     */
    public void setOutGrpHeaderOutGrmPfgSetupDetailSetSn(int value) {
        this.outGrpHeaderOutGrmPfgSetupDetailSetSn = value;
    }

    /**
     * Gets the value of the outGrpHeaderOutGrmPfgSetupDetailSubtagSn property.
     * 
     */
    public short getOutGrpHeaderOutGrmPfgSetupDetailSubtagSn() {
        return outGrpHeaderOutGrmPfgSetupDetailSubtagSn;
    }

    /**
     * Sets the value of the outGrpHeaderOutGrmPfgSetupDetailSubtagSn property.
     * 
     */
    public void setOutGrpHeaderOutGrmPfgSetupDetailSubtagSn(short value) {
        this.outGrpHeaderOutGrmPfgSetupDetailSubtagSn = value;
    }

    /**
     * Gets the value of the outGrpHeaderOutGrmPfgSetupDetailShowOrder property.
     * 
     */
    public int getOutGrpHeaderOutGrmPfgSetupDetailShowOrder() {
        return outGrpHeaderOutGrmPfgSetupDetailShowOrder;
    }

    /**
     * Sets the value of the outGrpHeaderOutGrmPfgSetupDetailShowOrder property.
     * 
     */
    public void setOutGrpHeaderOutGrmPfgSetupDetailShowOrder(int value) {
        this.outGrpHeaderOutGrmPfgSetupDetailShowOrder = value;
    }

    /**
     * Gets the value of the outGrpHeaderOutGrmPfgSetupDetailTagFieldType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpHeaderOutGrmPfgSetupDetailTagFieldType() {
        return outGrpHeaderOutGrmPfgSetupDetailTagFieldType;
    }

    /**
     * Sets the value of the outGrpHeaderOutGrmPfgSetupDetailTagFieldType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpHeaderOutGrmPfgSetupDetailTagFieldType(String value) {
        this.outGrpHeaderOutGrmPfgSetupDetailTagFieldType = value;
    }

    /**
     * Gets the value of the outGrpHeaderOutGrmPfgSetupDetailTagFieldFormat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpHeaderOutGrmPfgSetupDetailTagFieldFormat() {
        return outGrpHeaderOutGrmPfgSetupDetailTagFieldFormat;
    }

    /**
     * Sets the value of the outGrpHeaderOutGrmPfgSetupDetailTagFieldFormat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpHeaderOutGrmPfgSetupDetailTagFieldFormat(String value) {
        this.outGrpHeaderOutGrmPfgSetupDetailTagFieldFormat = value;
    }

    /**
     * Gets the value of the outGrpHeaderOutGrmPfgSetupDetailTagLabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpHeaderOutGrmPfgSetupDetailTagLabel() {
        return outGrpHeaderOutGrmPfgSetupDetailTagLabel;
    }

    /**
     * Sets the value of the outGrpHeaderOutGrmPfgSetupDetailTagLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpHeaderOutGrmPfgSetupDetailTagLabel(String value) {
        this.outGrpHeaderOutGrmPfgSetupDetailTagLabel = value;
    }

    /**
     * Gets the value of the outGrpHeaderOutGrmPfgSetupDetailTagDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpHeaderOutGrmPfgSetupDetailTagDescription() {
        return outGrpHeaderOutGrmPfgSetupDetailTagDescription;
    }

    /**
     * Sets the value of the outGrpHeaderOutGrmPfgSetupDetailTagDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpHeaderOutGrmPfgSetupDetailTagDescription(String value) {
        this.outGrpHeaderOutGrmPfgSetupDetailTagDescription = value;
    }

    /**
     * Gets the value of the outGrpHeaderOutGrmPfgSetupDetailTagFieldLength property.
     * 
     */
    public int getOutGrpHeaderOutGrmPfgSetupDetailTagFieldLength() {
        return outGrpHeaderOutGrmPfgSetupDetailTagFieldLength;
    }

    /**
     * Sets the value of the outGrpHeaderOutGrmPfgSetupDetailTagFieldLength property.
     * 
     */
    public void setOutGrpHeaderOutGrmPfgSetupDetailTagFieldLength(int value) {
        this.outGrpHeaderOutGrmPfgSetupDetailTagFieldLength = value;
    }

    /**
     * Gets the value of the outGrpHeaderOutGrmPfgSetupDetailTagMandatory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpHeaderOutGrmPfgSetupDetailTagMandatory() {
        return outGrpHeaderOutGrmPfgSetupDetailTagMandatory;
    }

    /**
     * Sets the value of the outGrpHeaderOutGrmPfgSetupDetailTagMandatory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpHeaderOutGrmPfgSetupDetailTagMandatory(String value) {
        this.outGrpHeaderOutGrmPfgSetupDetailTagMandatory = value;
    }

    /**
     * Gets the value of the outGrpHeaderOutGrmPfgSetupDetailTagUseList property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpHeaderOutGrmPfgSetupDetailTagUseList() {
        return outGrpHeaderOutGrmPfgSetupDetailTagUseList;
    }

    /**
     * Sets the value of the outGrpHeaderOutGrmPfgSetupDetailTagUseList property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpHeaderOutGrmPfgSetupDetailTagUseList(String value) {
        this.outGrpHeaderOutGrmPfgSetupDetailTagUseList = value;
    }

    /**
     * Gets the value of the outGrpHeaderOutGrmPfgSetupDetailTagUseValidation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpHeaderOutGrmPfgSetupDetailTagUseValidation() {
        return outGrpHeaderOutGrmPfgSetupDetailTagUseValidation;
    }

    /**
     * Sets the value of the outGrpHeaderOutGrmPfgSetupDetailTagUseValidation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpHeaderOutGrmPfgSetupDetailTagUseValidation(String value) {
        this.outGrpHeaderOutGrmPfgSetupDetailTagUseValidation = value;
    }

    /**
     * Gets the value of the outGrpHeaderOutGrmPfgSetupDetailTagRepetitive property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpHeaderOutGrmPfgSetupDetailTagRepetitive() {
        return outGrpHeaderOutGrmPfgSetupDetailTagRepetitive;
    }

    /**
     * Sets the value of the outGrpHeaderOutGrmPfgSetupDetailTagRepetitive property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpHeaderOutGrmPfgSetupDetailTagRepetitive(String value) {
        this.outGrpHeaderOutGrmPfgSetupDetailTagRepetitive = value;
    }

    /**
     * Gets the value of the outGrpHeaderOutGrmPfgSetupDetailTagVerification property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpHeaderOutGrmPfgSetupDetailTagVerification() {
        return outGrpHeaderOutGrmPfgSetupDetailTagVerification;
    }

    /**
     * Sets the value of the outGrpHeaderOutGrmPfgSetupDetailTagVerification property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpHeaderOutGrmPfgSetupDetailTagVerification(String value) {
        this.outGrpHeaderOutGrmPfgSetupDetailTagVerification = value;
    }

    /**
     * Gets the value of the outGrpHeaderOutGrmPfgSetupDetailTagSameLine property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpHeaderOutGrmPfgSetupDetailTagSameLine() {
        return outGrpHeaderOutGrmPfgSetupDetailTagSameLine;
    }

    /**
     * Sets the value of the outGrpHeaderOutGrmPfgSetupDetailTagSameLine property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpHeaderOutGrmPfgSetupDetailTagSameLine(String value) {
        this.outGrpHeaderOutGrmPfgSetupDetailTagSameLine = value;
    }

    /**
     * Gets the value of the outGrpHeaderOutGrmPfgSetupDetailTagNextLine property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpHeaderOutGrmPfgSetupDetailTagNextLine() {
        return outGrpHeaderOutGrmPfgSetupDetailTagNextLine;
    }

    /**
     * Sets the value of the outGrpHeaderOutGrmPfgSetupDetailTagNextLine property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpHeaderOutGrmPfgSetupDetailTagNextLine(String value) {
        this.outGrpHeaderOutGrmPfgSetupDetailTagNextLine = value;
    }

    /**
     * Gets the value of the outGrpHeaderOutGrmPfgSetupDetailTagValueAndData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpHeaderOutGrmPfgSetupDetailTagValueAndData() {
        return outGrpHeaderOutGrmPfgSetupDetailTagValueAndData;
    }

    /**
     * Sets the value of the outGrpHeaderOutGrmPfgSetupDetailTagValueAndData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpHeaderOutGrmPfgSetupDetailTagValueAndData(String value) {
        this.outGrpHeaderOutGrmPfgSetupDetailTagValueAndData = value;
    }

    /**
     * Gets the value of the outGrpHeaderOutGrmPfgSetupDetailNeedMessageType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpHeaderOutGrmPfgSetupDetailNeedMessageType() {
        return outGrpHeaderOutGrmPfgSetupDetailNeedMessageType;
    }

    /**
     * Sets the value of the outGrpHeaderOutGrmPfgSetupDetailNeedMessageType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpHeaderOutGrmPfgSetupDetailNeedMessageType(String value) {
        this.outGrpHeaderOutGrmPfgSetupDetailNeedMessageType = value;
    }

    /**
     * Gets the value of the outGrpHeaderOutGrmPfgSetupDetailNeedMandatory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpHeaderOutGrmPfgSetupDetailNeedMandatory() {
        return outGrpHeaderOutGrmPfgSetupDetailNeedMandatory;
    }

    /**
     * Sets the value of the outGrpHeaderOutGrmPfgSetupDetailNeedMandatory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpHeaderOutGrmPfgSetupDetailNeedMandatory(String value) {
        this.outGrpHeaderOutGrmPfgSetupDetailNeedMandatory = value;
    }

    /**
     * Gets the value of the outGrpHeaderOutGrmPfgSetupDetailNeedDisabled property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpHeaderOutGrmPfgSetupDetailNeedDisabled() {
        return outGrpHeaderOutGrmPfgSetupDetailNeedDisabled;
    }

    /**
     * Sets the value of the outGrpHeaderOutGrmPfgSetupDetailNeedDisabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpHeaderOutGrmPfgSetupDetailNeedDisabled(String value) {
        this.outGrpHeaderOutGrmPfgSetupDetailNeedDisabled = value;
    }

    /**
     * Gets the value of the outGrpHeaderOutGrmPfgSetupDetailNeedSums property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpHeaderOutGrmPfgSetupDetailNeedSums() {
        return outGrpHeaderOutGrmPfgSetupDetailNeedSums;
    }

    /**
     * Sets the value of the outGrpHeaderOutGrmPfgSetupDetailNeedSums property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpHeaderOutGrmPfgSetupDetailNeedSums(String value) {
        this.outGrpHeaderOutGrmPfgSetupDetailNeedSums = value;
    }

    /**
     * Gets the value of the outGrpHeaderOutGrmPfgSetupDetailNeedCharCheck property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpHeaderOutGrmPfgSetupDetailNeedCharCheck() {
        return outGrpHeaderOutGrmPfgSetupDetailNeedCharCheck;
    }

    /**
     * Sets the value of the outGrpHeaderOutGrmPfgSetupDetailNeedCharCheck property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpHeaderOutGrmPfgSetupDetailNeedCharCheck(String value) {
        this.outGrpHeaderOutGrmPfgSetupDetailNeedCharCheck = value;
    }

    /**
     * Gets the value of the outGrpHeaderOutGrmPfgSetupDetailNeedValues property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpHeaderOutGrmPfgSetupDetailNeedValues() {
        return outGrpHeaderOutGrmPfgSetupDetailNeedValues;
    }

    /**
     * Sets the value of the outGrpHeaderOutGrmPfgSetupDetailNeedValues property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpHeaderOutGrmPfgSetupDetailNeedValues(String value) {
        this.outGrpHeaderOutGrmPfgSetupDetailNeedValues = value;
    }

    /**
     * Gets the value of the outGrpHeaderOutGrmPfgSetupDetailNeedValueDisable property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpHeaderOutGrmPfgSetupDetailNeedValueDisable() {
        return outGrpHeaderOutGrmPfgSetupDetailNeedValueDisable;
    }

    /**
     * Sets the value of the outGrpHeaderOutGrmPfgSetupDetailNeedValueDisable property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpHeaderOutGrmPfgSetupDetailNeedValueDisable(String value) {
        this.outGrpHeaderOutGrmPfgSetupDetailNeedValueDisable = value;
    }

    /**
     * Gets the value of the outGrpHeaderOutGrmPfgSetupDetailNeedValVsVal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpHeaderOutGrmPfgSetupDetailNeedValVsVal() {
        return outGrpHeaderOutGrmPfgSetupDetailNeedValVsVal;
    }

    /**
     * Sets the value of the outGrpHeaderOutGrmPfgSetupDetailNeedValVsVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpHeaderOutGrmPfgSetupDetailNeedValVsVal(String value) {
        this.outGrpHeaderOutGrmPfgSetupDetailNeedValVsVal = value;
    }

    /**
     * Gets the value of the outGrpHeaderOutGrmPfgSetupDetailTagRepeatNumber property.
     * 
     */
    public int getOutGrpHeaderOutGrmPfgSetupDetailTagRepeatNumber() {
        return outGrpHeaderOutGrmPfgSetupDetailTagRepeatNumber;
    }

    /**
     * Sets the value of the outGrpHeaderOutGrmPfgSetupDetailTagRepeatNumber property.
     * 
     */
    public void setOutGrpHeaderOutGrmPfgSetupDetailTagRepeatNumber(int value) {
        this.outGrpHeaderOutGrmPfgSetupDetailTagRepeatNumber = value;
    }

    /**
     * Gets the value of the outGrpHeaderOutGrmPfgSetupDetailRepetativeRef property.
     * 
     */
    public int getOutGrpHeaderOutGrmPfgSetupDetailRepetativeRef() {
        return outGrpHeaderOutGrmPfgSetupDetailRepetativeRef;
    }

    /**
     * Sets the value of the outGrpHeaderOutGrmPfgSetupDetailRepetativeRef property.
     * 
     */
    public void setOutGrpHeaderOutGrmPfgSetupDetailRepetativeRef(int value) {
        this.outGrpHeaderOutGrmPfgSetupDetailRepetativeRef = value;
    }

    /**
     * Gets the value of the outGrpHeaderOutGrmPfgSetupDetailCheckCurrStag property.
     * 
     */
    public short getOutGrpHeaderOutGrmPfgSetupDetailCheckCurrStag() {
        return outGrpHeaderOutGrmPfgSetupDetailCheckCurrStag;
    }

    /**
     * Sets the value of the outGrpHeaderOutGrmPfgSetupDetailCheckCurrStag property.
     * 
     */
    public void setOutGrpHeaderOutGrmPfgSetupDetailCheckCurrStag(short value) {
        this.outGrpHeaderOutGrmPfgSetupDetailCheckCurrStag = value;
    }

    /**
     * Gets the value of the outGrpHeaderOutGrmPfgSetupDetailCheckCurrTag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpHeaderOutGrmPfgSetupDetailCheckCurrTag() {
        return outGrpHeaderOutGrmPfgSetupDetailCheckCurrTag;
    }

    /**
     * Sets the value of the outGrpHeaderOutGrmPfgSetupDetailCheckCurrTag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpHeaderOutGrmPfgSetupDetailCheckCurrTag(String value) {
        this.outGrpHeaderOutGrmPfgSetupDetailCheckCurrTag = value;
    }

    /**
     * Gets the value of the outGrpHeaderOutGrmPfgSetupDetailCheckCurrDec property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpHeaderOutGrmPfgSetupDetailCheckCurrDec() {
        return outGrpHeaderOutGrmPfgSetupDetailCheckCurrDec;
    }

    /**
     * Sets the value of the outGrpHeaderOutGrmPfgSetupDetailCheckCurrDec property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpHeaderOutGrmPfgSetupDetailCheckCurrDec(String value) {
        this.outGrpHeaderOutGrmPfgSetupDetailCheckCurrDec = value;
    }

    /**
     * Gets the value of the outGrpHeaderOutGrmPfgSetupDetailCheckEquality property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpHeaderOutGrmPfgSetupDetailCheckEquality() {
        return outGrpHeaderOutGrmPfgSetupDetailCheckEquality;
    }

    /**
     * Sets the value of the outGrpHeaderOutGrmPfgSetupDetailCheckEquality property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpHeaderOutGrmPfgSetupDetailCheckEquality(String value) {
        this.outGrpHeaderOutGrmPfgSetupDetailCheckEquality = value;
    }

    /**
     * Gets the value of the outGrpHeaderOutGrmPfgSetupDetailRefFldFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpHeaderOutGrmPfgSetupDetailRefFldFlag() {
        return outGrpHeaderOutGrmPfgSetupDetailRefFldFlag;
    }

    /**
     * Sets the value of the outGrpHeaderOutGrmPfgSetupDetailRefFldFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpHeaderOutGrmPfgSetupDetailRefFldFlag(String value) {
        this.outGrpHeaderOutGrmPfgSetupDetailRefFldFlag = value;
    }

    /**
     * Gets the value of the outGrpHeaderOutGrmPfgSetupDetailProtectedFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpHeaderOutGrmPfgSetupDetailProtectedFlag() {
        return outGrpHeaderOutGrmPfgSetupDetailProtectedFlag;
    }

    /**
     * Sets the value of the outGrpHeaderOutGrmPfgSetupDetailProtectedFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpHeaderOutGrmPfgSetupDetailProtectedFlag(String value) {
        this.outGrpHeaderOutGrmPfgSetupDetailProtectedFlag = value;
    }

    /**
     * Gets the value of the outGrpHeaderOutGrmPfgSetupDetailNeedMandaFunc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpHeaderOutGrmPfgSetupDetailNeedMandaFunc() {
        return outGrpHeaderOutGrmPfgSetupDetailNeedMandaFunc;
    }

    /**
     * Sets the value of the outGrpHeaderOutGrmPfgSetupDetailNeedMandaFunc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpHeaderOutGrmPfgSetupDetailNeedMandaFunc(String value) {
        this.outGrpHeaderOutGrmPfgSetupDetailNeedMandaFunc = value;
    }

    /**
     * Gets the value of the outGrpHeaderOutGrmPfgSetupDetailPrftRefNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpHeaderOutGrmPfgSetupDetailPrftRefNo() {
        return outGrpHeaderOutGrmPfgSetupDetailPrftRefNo;
    }

    /**
     * Sets the value of the outGrpHeaderOutGrmPfgSetupDetailPrftRefNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpHeaderOutGrmPfgSetupDetailPrftRefNo(String value) {
        this.outGrpHeaderOutGrmPfgSetupDetailPrftRefNo = value;
    }

    /**
     * Gets the value of the outGrpHeaderOutGrmPfgSetupDetailTagReceiver property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpHeaderOutGrmPfgSetupDetailTagReceiver() {
        return outGrpHeaderOutGrmPfgSetupDetailTagReceiver;
    }

    /**
     * Sets the value of the outGrpHeaderOutGrmPfgSetupDetailTagReceiver property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpHeaderOutGrmPfgSetupDetailTagReceiver(String value) {
        this.outGrpHeaderOutGrmPfgSetupDetailTagReceiver = value;
    }

    /**
     * Gets the value of the outGrpHeaderOutGrmPfgSetupDetailTagSender property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpHeaderOutGrmPfgSetupDetailTagSender() {
        return outGrpHeaderOutGrmPfgSetupDetailTagSender;
    }

    /**
     * Sets the value of the outGrpHeaderOutGrmPfgSetupDetailTagSender property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpHeaderOutGrmPfgSetupDetailTagSender(String value) {
        this.outGrpHeaderOutGrmPfgSetupDetailTagSender = value;
    }

    /**
     * Gets the value of the outGrpHeaderOutGrmPfgSetupDetailTagStp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpHeaderOutGrmPfgSetupDetailTagStp() {
        return outGrpHeaderOutGrmPfgSetupDetailTagStp;
    }

    /**
     * Sets the value of the outGrpHeaderOutGrmPfgSetupDetailTagStp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpHeaderOutGrmPfgSetupDetailTagStp(String value) {
        this.outGrpHeaderOutGrmPfgSetupDetailTagStp = value;
    }

    /**
     * Gets the value of the outGrpHeaderOutGrmPfgSetupDetailSetCategory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpHeaderOutGrmPfgSetupDetailSetCategory() {
        return outGrpHeaderOutGrmPfgSetupDetailSetCategory;
    }

    /**
     * Sets the value of the outGrpHeaderOutGrmPfgSetupDetailSetCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpHeaderOutGrmPfgSetupDetailSetCategory(String value) {
        this.outGrpHeaderOutGrmPfgSetupDetailSetCategory = value;
    }

    /**
     * Gets the value of the outGrpHeaderOutGrmPfgSetupDetailTagPriority property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpHeaderOutGrmPfgSetupDetailTagPriority() {
        return outGrpHeaderOutGrmPfgSetupDetailTagPriority;
    }

    /**
     * Sets the value of the outGrpHeaderOutGrmPfgSetupDetailTagPriority property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpHeaderOutGrmPfgSetupDetailTagPriority(String value) {
        this.outGrpHeaderOutGrmPfgSetupDetailTagPriority = value;
    }

    /**
     * Gets the value of the outGrpHeaderOutGrmPfgSetupDetailMurField property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpHeaderOutGrmPfgSetupDetailMurField() {
        return outGrpHeaderOutGrmPfgSetupDetailMurField;
    }

    /**
     * Sets the value of the outGrpHeaderOutGrmPfgSetupDetailMurField property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpHeaderOutGrmPfgSetupDetailMurField(String value) {
        this.outGrpHeaderOutGrmPfgSetupDetailMurField = value;
    }

    /**
     * Gets the value of the outGrpHeaderOutGrmPfgSetupDetailFkValidateDcdId property.
     * 
     */
    public double getOutGrpHeaderOutGrmPfgSetupDetailFkValidateDcdId() {
        return outGrpHeaderOutGrmPfgSetupDetailFkValidateDcdId;
    }

    /**
     * Sets the value of the outGrpHeaderOutGrmPfgSetupDetailFkValidateDcdId property.
     * 
     */
    public void setOutGrpHeaderOutGrmPfgSetupDetailFkValidateDcdId(double value) {
        this.outGrpHeaderOutGrmPfgSetupDetailFkValidateDcdId = value;
    }

    /**
     * Gets the value of the outGrpHeaderOutGrmPfgSetupDetailExceptionCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpHeaderOutGrmPfgSetupDetailExceptionCode() {
        return outGrpHeaderOutGrmPfgSetupDetailExceptionCode;
    }

    /**
     * Sets the value of the outGrpHeaderOutGrmPfgSetupDetailExceptionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpHeaderOutGrmPfgSetupDetailExceptionCode(String value) {
        this.outGrpHeaderOutGrmPfgSetupDetailExceptionCode = value;
    }

    /**
     * Gets the value of the outGrpHeaderOutGrmPfgSetupDetailCheckExtCharSet property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpHeaderOutGrmPfgSetupDetailCheckExtCharSet() {
        return outGrpHeaderOutGrmPfgSetupDetailCheckExtCharSet;
    }

    /**
     * Sets the value of the outGrpHeaderOutGrmPfgSetupDetailCheckExtCharSet property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpHeaderOutGrmPfgSetupDetailCheckExtCharSet(String value) {
        this.outGrpHeaderOutGrmPfgSetupDetailCheckExtCharSet = value;
    }

    /**
     * Gets the value of the outGrpHeaderOutGrmPfgSetupDetailShowToUser property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpHeaderOutGrmPfgSetupDetailShowToUser() {
        return outGrpHeaderOutGrmPfgSetupDetailShowToUser;
    }

    /**
     * Sets the value of the outGrpHeaderOutGrmPfgSetupDetailShowToUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpHeaderOutGrmPfgSetupDetailShowToUser(String value) {
        this.outGrpHeaderOutGrmPfgSetupDetailShowToUser = value;
    }

    /**
     * Gets the value of the outGrpHeaderOutGrmPfgSetupDetailExactLength property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpHeaderOutGrmPfgSetupDetailExactLength() {
        return outGrpHeaderOutGrmPfgSetupDetailExactLength;
    }

    /**
     * Sets the value of the outGrpHeaderOutGrmPfgSetupDetailExactLength property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpHeaderOutGrmPfgSetupDetailExactLength(String value) {
        this.outGrpHeaderOutGrmPfgSetupDetailExactLength = value;
    }

}
