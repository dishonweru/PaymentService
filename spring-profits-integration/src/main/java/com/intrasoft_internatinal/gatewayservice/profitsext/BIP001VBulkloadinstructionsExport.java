
package com.intrasoft_internatinal.gatewayservice.profitsext;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BIP001VBulkloadinstructionsExport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BIP001VBulkloadinstructionsExport">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}BaseExport">
 *       &lt;sequence>
 *         &lt;element name="OutBlkFileDataDataColumn8" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutBlkTemplateHeaderDataRowStart" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutBlkTemplateHeaderDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutBlkTemplateHeaderEnabled" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutBlkTemplateHeaderFileFormat" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutBlkTemplateHeaderName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutBlkTemplateHeaderTemplateId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGrpTemplateDetail" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}ArrayOfBIP001VOutGrpTemplateDetailItem" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BIP001VBulkloadinstructionsExport", propOrder = {
    "outBlkFileDataDataColumn8",
    "outBlkTemplateHeaderDataRowStart",
    "outBlkTemplateHeaderDescription",
    "outBlkTemplateHeaderEnabled",
    "outBlkTemplateHeaderFileFormat",
    "outBlkTemplateHeaderName",
    "outBlkTemplateHeaderTemplateId",
    "outGrpTemplateDetail"
})
public class BIP001VBulkloadinstructionsExport
    extends BaseExport
{

    @XmlElement(name = "OutBlkFileDataDataColumn8")
    protected String outBlkFileDataDataColumn8;
    @XmlElement(name = "OutBlkTemplateHeaderDataRowStart")
    protected int outBlkTemplateHeaderDataRowStart;
    @XmlElement(name = "OutBlkTemplateHeaderDescription")
    protected String outBlkTemplateHeaderDescription;
    @XmlElement(name = "OutBlkTemplateHeaderEnabled")
    protected String outBlkTemplateHeaderEnabled;
    @XmlElement(name = "OutBlkTemplateHeaderFileFormat")
    protected String outBlkTemplateHeaderFileFormat;
    @XmlElement(name = "OutBlkTemplateHeaderName")
    protected String outBlkTemplateHeaderName;
    @XmlElement(name = "OutBlkTemplateHeaderTemplateId")
    protected int outBlkTemplateHeaderTemplateId;
    @XmlElement(name = "OutGrpTemplateDetail")
    protected ArrayOfBIP001VOutGrpTemplateDetailItem outGrpTemplateDetail;

    /**
     * Gets the value of the outBlkFileDataDataColumn8 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutBlkFileDataDataColumn8() {
        return outBlkFileDataDataColumn8;
    }

    /**
     * Sets the value of the outBlkFileDataDataColumn8 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutBlkFileDataDataColumn8(String value) {
        this.outBlkFileDataDataColumn8 = value;
    }

    /**
     * Gets the value of the outBlkTemplateHeaderDataRowStart property.
     * 
     */
    public int getOutBlkTemplateHeaderDataRowStart() {
        return outBlkTemplateHeaderDataRowStart;
    }

    /**
     * Sets the value of the outBlkTemplateHeaderDataRowStart property.
     * 
     */
    public void setOutBlkTemplateHeaderDataRowStart(int value) {
        this.outBlkTemplateHeaderDataRowStart = value;
    }

    /**
     * Gets the value of the outBlkTemplateHeaderDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutBlkTemplateHeaderDescription() {
        return outBlkTemplateHeaderDescription;
    }

    /**
     * Sets the value of the outBlkTemplateHeaderDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutBlkTemplateHeaderDescription(String value) {
        this.outBlkTemplateHeaderDescription = value;
    }

    /**
     * Gets the value of the outBlkTemplateHeaderEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutBlkTemplateHeaderEnabled() {
        return outBlkTemplateHeaderEnabled;
    }

    /**
     * Sets the value of the outBlkTemplateHeaderEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutBlkTemplateHeaderEnabled(String value) {
        this.outBlkTemplateHeaderEnabled = value;
    }

    /**
     * Gets the value of the outBlkTemplateHeaderFileFormat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutBlkTemplateHeaderFileFormat() {
        return outBlkTemplateHeaderFileFormat;
    }

    /**
     * Sets the value of the outBlkTemplateHeaderFileFormat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutBlkTemplateHeaderFileFormat(String value) {
        this.outBlkTemplateHeaderFileFormat = value;
    }

    /**
     * Gets the value of the outBlkTemplateHeaderName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutBlkTemplateHeaderName() {
        return outBlkTemplateHeaderName;
    }

    /**
     * Sets the value of the outBlkTemplateHeaderName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutBlkTemplateHeaderName(String value) {
        this.outBlkTemplateHeaderName = value;
    }

    /**
     * Gets the value of the outBlkTemplateHeaderTemplateId property.
     * 
     */
    public int getOutBlkTemplateHeaderTemplateId() {
        return outBlkTemplateHeaderTemplateId;
    }

    /**
     * Sets the value of the outBlkTemplateHeaderTemplateId property.
     * 
     */
    public void setOutBlkTemplateHeaderTemplateId(int value) {
        this.outBlkTemplateHeaderTemplateId = value;
    }

    /**
     * Gets the value of the outGrpTemplateDetail property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfBIP001VOutGrpTemplateDetailItem }
     *     
     */
    public ArrayOfBIP001VOutGrpTemplateDetailItem getOutGrpTemplateDetail() {
        return outGrpTemplateDetail;
    }

    /**
     * Sets the value of the outGrpTemplateDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfBIP001VOutGrpTemplateDetailItem }
     *     
     */
    public void setOutGrpTemplateDetail(ArrayOfBIP001VOutGrpTemplateDetailItem value) {
        this.outGrpTemplateDetail = value;
    }

}
