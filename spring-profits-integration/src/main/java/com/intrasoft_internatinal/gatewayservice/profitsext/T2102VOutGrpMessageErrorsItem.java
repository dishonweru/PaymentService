
package com.intrasoft_internatinal.gatewayservice.profitsext;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for T2102VOutGrpMessageErrorsItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="T2102VOutGrpMessageErrorsItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OutGrpMessageErrorsOutGrmErrorSelectIefSuppliedSelectChar" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpMessageErrorsOutGrmIpsMessageErrorsErrorComment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpMessageErrorsOutGrmIpsMessageErrorsTag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpMessageErrorsOutGrmMetadataSwiftSetupDetailTagLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "T2102VOutGrpMessageErrorsItem", propOrder = {
    "outGrpMessageErrorsOutGrmErrorSelectIefSuppliedSelectChar",
    "outGrpMessageErrorsOutGrmIpsMessageErrorsErrorComment",
    "outGrpMessageErrorsOutGrmIpsMessageErrorsTag",
    "outGrpMessageErrorsOutGrmMetadataSwiftSetupDetailTagLabel"
})
public class T2102VOutGrpMessageErrorsItem {

    @XmlElement(name = "OutGrpMessageErrorsOutGrmErrorSelectIefSuppliedSelectChar")
    protected String outGrpMessageErrorsOutGrmErrorSelectIefSuppliedSelectChar;
    @XmlElement(name = "OutGrpMessageErrorsOutGrmIpsMessageErrorsErrorComment")
    protected String outGrpMessageErrorsOutGrmIpsMessageErrorsErrorComment;
    @XmlElement(name = "OutGrpMessageErrorsOutGrmIpsMessageErrorsTag")
    protected String outGrpMessageErrorsOutGrmIpsMessageErrorsTag;
    @XmlElement(name = "OutGrpMessageErrorsOutGrmMetadataSwiftSetupDetailTagLabel")
    protected String outGrpMessageErrorsOutGrmMetadataSwiftSetupDetailTagLabel;

    /**
     * Gets the value of the outGrpMessageErrorsOutGrmErrorSelectIefSuppliedSelectChar property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpMessageErrorsOutGrmErrorSelectIefSuppliedSelectChar() {
        return outGrpMessageErrorsOutGrmErrorSelectIefSuppliedSelectChar;
    }

    /**
     * Sets the value of the outGrpMessageErrorsOutGrmErrorSelectIefSuppliedSelectChar property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpMessageErrorsOutGrmErrorSelectIefSuppliedSelectChar(String value) {
        this.outGrpMessageErrorsOutGrmErrorSelectIefSuppliedSelectChar = value;
    }

    /**
     * Gets the value of the outGrpMessageErrorsOutGrmIpsMessageErrorsErrorComment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpMessageErrorsOutGrmIpsMessageErrorsErrorComment() {
        return outGrpMessageErrorsOutGrmIpsMessageErrorsErrorComment;
    }

    /**
     * Sets the value of the outGrpMessageErrorsOutGrmIpsMessageErrorsErrorComment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpMessageErrorsOutGrmIpsMessageErrorsErrorComment(String value) {
        this.outGrpMessageErrorsOutGrmIpsMessageErrorsErrorComment = value;
    }

    /**
     * Gets the value of the outGrpMessageErrorsOutGrmIpsMessageErrorsTag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpMessageErrorsOutGrmIpsMessageErrorsTag() {
        return outGrpMessageErrorsOutGrmIpsMessageErrorsTag;
    }

    /**
     * Sets the value of the outGrpMessageErrorsOutGrmIpsMessageErrorsTag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpMessageErrorsOutGrmIpsMessageErrorsTag(String value) {
        this.outGrpMessageErrorsOutGrmIpsMessageErrorsTag = value;
    }

    /**
     * Gets the value of the outGrpMessageErrorsOutGrmMetadataSwiftSetupDetailTagLabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpMessageErrorsOutGrmMetadataSwiftSetupDetailTagLabel() {
        return outGrpMessageErrorsOutGrmMetadataSwiftSetupDetailTagLabel;
    }

    /**
     * Sets the value of the outGrpMessageErrorsOutGrmMetadataSwiftSetupDetailTagLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpMessageErrorsOutGrmMetadataSwiftSetupDetailTagLabel(String value) {
        this.outGrpMessageErrorsOutGrmMetadataSwiftSetupDetailTagLabel = value;
    }

}
