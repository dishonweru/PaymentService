
package com.intrasoft_internatinal.gatewayservice.profitsext;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BIP001VOutGrpTemplateDetailItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BIP001VOutGrpTemplateDetailItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OutGrpTemplateDetailOutGrmTemplateDetailBlkTemplateDetailDataDefaultValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpTemplateDetailOutGrmTemplateDetailBlkTemplateDetailDataFileColumn" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGrpTemplateDetailOutGrmTemplateDetailBlkTemplateDetailDataLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpTemplateDetailOutGrmTemplateDetailBlkTemplateDetailDataName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpTemplateDetailOutGrmTemplateDetailBlkTemplateDetailDataSn" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutGrpTemplateDetailOutGrmTemplateDetailBlkTemplateDetailDataType" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BIP001VOutGrpTemplateDetailItem", propOrder = {
    "outGrpTemplateDetailOutGrmTemplateDetailBlkTemplateDetailDataDefaultValue",
    "outGrpTemplateDetailOutGrmTemplateDetailBlkTemplateDetailDataFileColumn",
    "outGrpTemplateDetailOutGrmTemplateDetailBlkTemplateDetailDataLabel",
    "outGrpTemplateDetailOutGrmTemplateDetailBlkTemplateDetailDataName",
    "outGrpTemplateDetailOutGrmTemplateDetailBlkTemplateDetailDataSn",
    "outGrpTemplateDetailOutGrmTemplateDetailBlkTemplateDetailDataType"
})
public class BIP001VOutGrpTemplateDetailItem {

    @XmlElement(name = "OutGrpTemplateDetailOutGrmTemplateDetailBlkTemplateDetailDataDefaultValue")
    protected String outGrpTemplateDetailOutGrmTemplateDetailBlkTemplateDetailDataDefaultValue;
    @XmlElement(name = "OutGrpTemplateDetailOutGrmTemplateDetailBlkTemplateDetailDataFileColumn")
    protected int outGrpTemplateDetailOutGrmTemplateDetailBlkTemplateDetailDataFileColumn;
    @XmlElement(name = "OutGrpTemplateDetailOutGrmTemplateDetailBlkTemplateDetailDataLabel")
    protected String outGrpTemplateDetailOutGrmTemplateDetailBlkTemplateDetailDataLabel;
    @XmlElement(name = "OutGrpTemplateDetailOutGrmTemplateDetailBlkTemplateDetailDataName")
    protected String outGrpTemplateDetailOutGrmTemplateDetailBlkTemplateDetailDataName;
    @XmlElement(name = "OutGrpTemplateDetailOutGrmTemplateDetailBlkTemplateDetailDataSn")
    protected short outGrpTemplateDetailOutGrmTemplateDetailBlkTemplateDetailDataSn;
    @XmlElement(name = "OutGrpTemplateDetailOutGrmTemplateDetailBlkTemplateDetailDataType")
    protected short outGrpTemplateDetailOutGrmTemplateDetailBlkTemplateDetailDataType;

    /**
     * Gets the value of the outGrpTemplateDetailOutGrmTemplateDetailBlkTemplateDetailDataDefaultValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpTemplateDetailOutGrmTemplateDetailBlkTemplateDetailDataDefaultValue() {
        return outGrpTemplateDetailOutGrmTemplateDetailBlkTemplateDetailDataDefaultValue;
    }

    /**
     * Sets the value of the outGrpTemplateDetailOutGrmTemplateDetailBlkTemplateDetailDataDefaultValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpTemplateDetailOutGrmTemplateDetailBlkTemplateDetailDataDefaultValue(String value) {
        this.outGrpTemplateDetailOutGrmTemplateDetailBlkTemplateDetailDataDefaultValue = value;
    }

    /**
     * Gets the value of the outGrpTemplateDetailOutGrmTemplateDetailBlkTemplateDetailDataFileColumn property.
     * 
     */
    public int getOutGrpTemplateDetailOutGrmTemplateDetailBlkTemplateDetailDataFileColumn() {
        return outGrpTemplateDetailOutGrmTemplateDetailBlkTemplateDetailDataFileColumn;
    }

    /**
     * Sets the value of the outGrpTemplateDetailOutGrmTemplateDetailBlkTemplateDetailDataFileColumn property.
     * 
     */
    public void setOutGrpTemplateDetailOutGrmTemplateDetailBlkTemplateDetailDataFileColumn(int value) {
        this.outGrpTemplateDetailOutGrmTemplateDetailBlkTemplateDetailDataFileColumn = value;
    }

    /**
     * Gets the value of the outGrpTemplateDetailOutGrmTemplateDetailBlkTemplateDetailDataLabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpTemplateDetailOutGrmTemplateDetailBlkTemplateDetailDataLabel() {
        return outGrpTemplateDetailOutGrmTemplateDetailBlkTemplateDetailDataLabel;
    }

    /**
     * Sets the value of the outGrpTemplateDetailOutGrmTemplateDetailBlkTemplateDetailDataLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpTemplateDetailOutGrmTemplateDetailBlkTemplateDetailDataLabel(String value) {
        this.outGrpTemplateDetailOutGrmTemplateDetailBlkTemplateDetailDataLabel = value;
    }

    /**
     * Gets the value of the outGrpTemplateDetailOutGrmTemplateDetailBlkTemplateDetailDataName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpTemplateDetailOutGrmTemplateDetailBlkTemplateDetailDataName() {
        return outGrpTemplateDetailOutGrmTemplateDetailBlkTemplateDetailDataName;
    }

    /**
     * Sets the value of the outGrpTemplateDetailOutGrmTemplateDetailBlkTemplateDetailDataName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpTemplateDetailOutGrmTemplateDetailBlkTemplateDetailDataName(String value) {
        this.outGrpTemplateDetailOutGrmTemplateDetailBlkTemplateDetailDataName = value;
    }

    /**
     * Gets the value of the outGrpTemplateDetailOutGrmTemplateDetailBlkTemplateDetailDataSn property.
     * 
     */
    public short getOutGrpTemplateDetailOutGrmTemplateDetailBlkTemplateDetailDataSn() {
        return outGrpTemplateDetailOutGrmTemplateDetailBlkTemplateDetailDataSn;
    }

    /**
     * Sets the value of the outGrpTemplateDetailOutGrmTemplateDetailBlkTemplateDetailDataSn property.
     * 
     */
    public void setOutGrpTemplateDetailOutGrmTemplateDetailBlkTemplateDetailDataSn(short value) {
        this.outGrpTemplateDetailOutGrmTemplateDetailBlkTemplateDetailDataSn = value;
    }

    /**
     * Gets the value of the outGrpTemplateDetailOutGrmTemplateDetailBlkTemplateDetailDataType property.
     * 
     */
    public short getOutGrpTemplateDetailOutGrmTemplateDetailBlkTemplateDetailDataType() {
        return outGrpTemplateDetailOutGrmTemplateDetailBlkTemplateDetailDataType;
    }

    /**
     * Sets the value of the outGrpTemplateDetailOutGrmTemplateDetailBlkTemplateDetailDataType property.
     * 
     */
    public void setOutGrpTemplateDetailOutGrmTemplateDetailBlkTemplateDetailDataType(short value) {
        this.outGrpTemplateDetailOutGrmTemplateDetailBlkTemplateDetailDataType = value;
    }

}
