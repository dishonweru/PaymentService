
package com.intrasoft_internatinal.gatewayservice.profitsext;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for BIP003VBulkprocessinstructionsExport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BIP003VBulkprocessinstructionsExport">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}BaseExport">
 *       &lt;sequence>
 *         &lt;element name="OutAutomoreLastBlkFileDataDataRowSn" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutBlkFileDataFileHash" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutBlkFileDataFileName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutBlkFileDataLoadTimestamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutBlkFileDataLoadTrxDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutBlkFileDataTemplateId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutBlkTemplateHeaderDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutBlkTemplateHeaderGroupColumnNumber" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutBlkTemplateHeaderMechanismCode" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutBlkTemplateHeaderName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutBlkTemplateHeaderTemplateId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutIefSuppliedActionEntryDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpFileData" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}ArrayOfBIP003VOutGrpFileDataItem" minOccurs="0"/>
 *         &lt;element name="OutGrpTemplateDetail" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}ArrayOfBIP003VOutGrpTemplateDetailItem" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BIP003VBulkprocessinstructionsExport", propOrder = {
    "outAutomoreLastBlkFileDataDataRowSn",
    "outBlkFileDataFileHash",
    "outBlkFileDataFileName",
    "outBlkFileDataLoadTimestamp",
    "outBlkFileDataLoadTrxDate",
    "outBlkFileDataTemplateId",
    "outBlkTemplateHeaderDescription",
    "outBlkTemplateHeaderGroupColumnNumber",
    "outBlkTemplateHeaderMechanismCode",
    "outBlkTemplateHeaderName",
    "outBlkTemplateHeaderTemplateId",
    "outIefSuppliedActionEntryDesc",
    "outGrpFileData",
    "outGrpTemplateDetail"
})
public class BIP003VBulkprocessinstructionsExport
    extends BaseExport
{

    @XmlElement(name = "OutAutomoreLastBlkFileDataDataRowSn")
    protected int outAutomoreLastBlkFileDataDataRowSn;
    @XmlElement(name = "OutBlkFileDataFileHash")
    protected String outBlkFileDataFileHash;
    @XmlElement(name = "OutBlkFileDataFileName")
    protected String outBlkFileDataFileName;
    @XmlElement(name = "OutBlkFileDataLoadTimestamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outBlkFileDataLoadTimestamp;
    @XmlElement(name = "OutBlkFileDataLoadTrxDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outBlkFileDataLoadTrxDate;
    @XmlElement(name = "OutBlkFileDataTemplateId")
    protected int outBlkFileDataTemplateId;
    @XmlElement(name = "OutBlkTemplateHeaderDescription")
    protected String outBlkTemplateHeaderDescription;
    @XmlElement(name = "OutBlkTemplateHeaderGroupColumnNumber")
    protected short outBlkTemplateHeaderGroupColumnNumber;
    @XmlElement(name = "OutBlkTemplateHeaderMechanismCode")
    protected short outBlkTemplateHeaderMechanismCode;
    @XmlElement(name = "OutBlkTemplateHeaderName")
    protected String outBlkTemplateHeaderName;
    @XmlElement(name = "OutBlkTemplateHeaderTemplateId")
    protected int outBlkTemplateHeaderTemplateId;
    @XmlElement(name = "OutIefSuppliedActionEntryDesc")
    protected String outIefSuppliedActionEntryDesc;
    @XmlElement(name = "OutGrpFileData")
    protected ArrayOfBIP003VOutGrpFileDataItem outGrpFileData;
    @XmlElement(name = "OutGrpTemplateDetail")
    protected ArrayOfBIP003VOutGrpTemplateDetailItem outGrpTemplateDetail;

    /**
     * Gets the value of the outAutomoreLastBlkFileDataDataRowSn property.
     * 
     */
    public int getOutAutomoreLastBlkFileDataDataRowSn() {
        return outAutomoreLastBlkFileDataDataRowSn;
    }

    /**
     * Sets the value of the outAutomoreLastBlkFileDataDataRowSn property.
     * 
     */
    public void setOutAutomoreLastBlkFileDataDataRowSn(int value) {
        this.outAutomoreLastBlkFileDataDataRowSn = value;
    }

    /**
     * Gets the value of the outBlkFileDataFileHash property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutBlkFileDataFileHash() {
        return outBlkFileDataFileHash;
    }

    /**
     * Sets the value of the outBlkFileDataFileHash property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutBlkFileDataFileHash(String value) {
        this.outBlkFileDataFileHash = value;
    }

    /**
     * Gets the value of the outBlkFileDataFileName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutBlkFileDataFileName() {
        return outBlkFileDataFileName;
    }

    /**
     * Sets the value of the outBlkFileDataFileName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutBlkFileDataFileName(String value) {
        this.outBlkFileDataFileName = value;
    }

    /**
     * Gets the value of the outBlkFileDataLoadTimestamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutBlkFileDataLoadTimestamp() {
        return outBlkFileDataLoadTimestamp;
    }

    /**
     * Sets the value of the outBlkFileDataLoadTimestamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutBlkFileDataLoadTimestamp(XMLGregorianCalendar value) {
        this.outBlkFileDataLoadTimestamp = value;
    }

    /**
     * Gets the value of the outBlkFileDataLoadTrxDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutBlkFileDataLoadTrxDate() {
        return outBlkFileDataLoadTrxDate;
    }

    /**
     * Sets the value of the outBlkFileDataLoadTrxDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutBlkFileDataLoadTrxDate(XMLGregorianCalendar value) {
        this.outBlkFileDataLoadTrxDate = value;
    }

    /**
     * Gets the value of the outBlkFileDataTemplateId property.
     * 
     */
    public int getOutBlkFileDataTemplateId() {
        return outBlkFileDataTemplateId;
    }

    /**
     * Sets the value of the outBlkFileDataTemplateId property.
     * 
     */
    public void setOutBlkFileDataTemplateId(int value) {
        this.outBlkFileDataTemplateId = value;
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
     * Gets the value of the outBlkTemplateHeaderGroupColumnNumber property.
     * 
     */
    public short getOutBlkTemplateHeaderGroupColumnNumber() {
        return outBlkTemplateHeaderGroupColumnNumber;
    }

    /**
     * Sets the value of the outBlkTemplateHeaderGroupColumnNumber property.
     * 
     */
    public void setOutBlkTemplateHeaderGroupColumnNumber(short value) {
        this.outBlkTemplateHeaderGroupColumnNumber = value;
    }

    /**
     * Gets the value of the outBlkTemplateHeaderMechanismCode property.
     * 
     */
    public short getOutBlkTemplateHeaderMechanismCode() {
        return outBlkTemplateHeaderMechanismCode;
    }

    /**
     * Sets the value of the outBlkTemplateHeaderMechanismCode property.
     * 
     */
    public void setOutBlkTemplateHeaderMechanismCode(short value) {
        this.outBlkTemplateHeaderMechanismCode = value;
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
     * Gets the value of the outIefSuppliedActionEntryDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutIefSuppliedActionEntryDesc() {
        return outIefSuppliedActionEntryDesc;
    }

    /**
     * Sets the value of the outIefSuppliedActionEntryDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutIefSuppliedActionEntryDesc(String value) {
        this.outIefSuppliedActionEntryDesc = value;
    }

    /**
     * Gets the value of the outGrpFileData property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfBIP003VOutGrpFileDataItem }
     *     
     */
    public ArrayOfBIP003VOutGrpFileDataItem getOutGrpFileData() {
        return outGrpFileData;
    }

    /**
     * Sets the value of the outGrpFileData property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfBIP003VOutGrpFileDataItem }
     *     
     */
    public void setOutGrpFileData(ArrayOfBIP003VOutGrpFileDataItem value) {
        this.outGrpFileData = value;
    }

    /**
     * Gets the value of the outGrpTemplateDetail property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfBIP003VOutGrpTemplateDetailItem }
     *     
     */
    public ArrayOfBIP003VOutGrpTemplateDetailItem getOutGrpTemplateDetail() {
        return outGrpTemplateDetail;
    }

    /**
     * Sets the value of the outGrpTemplateDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfBIP003VOutGrpTemplateDetailItem }
     *     
     */
    public void setOutGrpTemplateDetail(ArrayOfBIP003VOutGrpTemplateDetailItem value) {
        this.outGrpTemplateDetail = value;
    }

}
