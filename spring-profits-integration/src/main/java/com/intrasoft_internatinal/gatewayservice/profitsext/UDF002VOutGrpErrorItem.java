
package com.intrasoft_internatinal.gatewayservice.profitsext;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UDF002VOutGrpErrorItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UDF002VOutGrpErrorItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OutGrpErrorOutGrmErrorFailureDetailsComment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpErrorOutGrmErrorPfgSetupDetailExceptionCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpErrorOutGrmErrorPfgSetupDetailSetSn" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGrpErrorOutGrmErrorPfgSetupDetailSubtagSn" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutGrpErrorOutGrmErrorPfgSetupDetailTag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpErrorOutGrmErrorPfgSetupDetailTagLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UDF002VOutGrpErrorItem", propOrder = {
    "outGrpErrorOutGrmErrorFailureDetailsComment",
    "outGrpErrorOutGrmErrorPfgSetupDetailExceptionCode",
    "outGrpErrorOutGrmErrorPfgSetupDetailSetSn",
    "outGrpErrorOutGrmErrorPfgSetupDetailSubtagSn",
    "outGrpErrorOutGrmErrorPfgSetupDetailTag",
    "outGrpErrorOutGrmErrorPfgSetupDetailTagLabel"
})
public class UDF002VOutGrpErrorItem {

    @XmlElement(name = "OutGrpErrorOutGrmErrorFailureDetailsComment")
    protected String outGrpErrorOutGrmErrorFailureDetailsComment;
    @XmlElement(name = "OutGrpErrorOutGrmErrorPfgSetupDetailExceptionCode")
    protected String outGrpErrorOutGrmErrorPfgSetupDetailExceptionCode;
    @XmlElement(name = "OutGrpErrorOutGrmErrorPfgSetupDetailSetSn")
    protected int outGrpErrorOutGrmErrorPfgSetupDetailSetSn;
    @XmlElement(name = "OutGrpErrorOutGrmErrorPfgSetupDetailSubtagSn")
    protected short outGrpErrorOutGrmErrorPfgSetupDetailSubtagSn;
    @XmlElement(name = "OutGrpErrorOutGrmErrorPfgSetupDetailTag")
    protected String outGrpErrorOutGrmErrorPfgSetupDetailTag;
    @XmlElement(name = "OutGrpErrorOutGrmErrorPfgSetupDetailTagLabel")
    protected String outGrpErrorOutGrmErrorPfgSetupDetailTagLabel;

    /**
     * Gets the value of the outGrpErrorOutGrmErrorFailureDetailsComment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpErrorOutGrmErrorFailureDetailsComment() {
        return outGrpErrorOutGrmErrorFailureDetailsComment;
    }

    /**
     * Sets the value of the outGrpErrorOutGrmErrorFailureDetailsComment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpErrorOutGrmErrorFailureDetailsComment(String value) {
        this.outGrpErrorOutGrmErrorFailureDetailsComment = value;
    }

    /**
     * Gets the value of the outGrpErrorOutGrmErrorPfgSetupDetailExceptionCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpErrorOutGrmErrorPfgSetupDetailExceptionCode() {
        return outGrpErrorOutGrmErrorPfgSetupDetailExceptionCode;
    }

    /**
     * Sets the value of the outGrpErrorOutGrmErrorPfgSetupDetailExceptionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpErrorOutGrmErrorPfgSetupDetailExceptionCode(String value) {
        this.outGrpErrorOutGrmErrorPfgSetupDetailExceptionCode = value;
    }

    /**
     * Gets the value of the outGrpErrorOutGrmErrorPfgSetupDetailSetSn property.
     * 
     */
    public int getOutGrpErrorOutGrmErrorPfgSetupDetailSetSn() {
        return outGrpErrorOutGrmErrorPfgSetupDetailSetSn;
    }

    /**
     * Sets the value of the outGrpErrorOutGrmErrorPfgSetupDetailSetSn property.
     * 
     */
    public void setOutGrpErrorOutGrmErrorPfgSetupDetailSetSn(int value) {
        this.outGrpErrorOutGrmErrorPfgSetupDetailSetSn = value;
    }

    /**
     * Gets the value of the outGrpErrorOutGrmErrorPfgSetupDetailSubtagSn property.
     * 
     */
    public short getOutGrpErrorOutGrmErrorPfgSetupDetailSubtagSn() {
        return outGrpErrorOutGrmErrorPfgSetupDetailSubtagSn;
    }

    /**
     * Sets the value of the outGrpErrorOutGrmErrorPfgSetupDetailSubtagSn property.
     * 
     */
    public void setOutGrpErrorOutGrmErrorPfgSetupDetailSubtagSn(short value) {
        this.outGrpErrorOutGrmErrorPfgSetupDetailSubtagSn = value;
    }

    /**
     * Gets the value of the outGrpErrorOutGrmErrorPfgSetupDetailTag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpErrorOutGrmErrorPfgSetupDetailTag() {
        return outGrpErrorOutGrmErrorPfgSetupDetailTag;
    }

    /**
     * Sets the value of the outGrpErrorOutGrmErrorPfgSetupDetailTag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpErrorOutGrmErrorPfgSetupDetailTag(String value) {
        this.outGrpErrorOutGrmErrorPfgSetupDetailTag = value;
    }

    /**
     * Gets the value of the outGrpErrorOutGrmErrorPfgSetupDetailTagLabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpErrorOutGrmErrorPfgSetupDetailTagLabel() {
        return outGrpErrorOutGrmErrorPfgSetupDetailTagLabel;
    }

    /**
     * Sets the value of the outGrpErrorOutGrmErrorPfgSetupDetailTagLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpErrorOutGrmErrorPfgSetupDetailTagLabel(String value) {
        this.outGrpErrorOutGrmErrorPfgSetupDetailTagLabel = value;
    }

}
