
package com.intrasoft_internatinal.gatewayservice.profitsext;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BIP001VBulkloadinstructionsImport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BIP001VBulkloadinstructionsImport">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}BaseImport">
 *       &lt;sequence>
 *         &lt;element name="InBankParametersRateUsage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InBlkFileDataDataType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InBlkFileDataFileHash" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InBlkFileDataFileName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InBlkTemplateHeaderTemplateId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InCommandIefSuppliedCommand" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InTerminalTerminalNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InGrpCacheRecords" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}ArrayOfBIP001VInGrpCacheRecordsItem" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BIP001VBulkloadinstructionsImport", propOrder = {
    "inBankParametersRateUsage",
    "inBlkFileDataDataType",
    "inBlkFileDataFileHash",
    "inBlkFileDataFileName",
    "inBlkTemplateHeaderTemplateId",
    "inCommandIefSuppliedCommand",
    "inTerminalTerminalNumber",
    "inGrpCacheRecords"
})
public class BIP001VBulkloadinstructionsImport
    extends BaseImport
{

    @XmlElement(name = "InBankParametersRateUsage")
    protected String inBankParametersRateUsage;
    @XmlElement(name = "InBlkFileDataDataType")
    protected String inBlkFileDataDataType;
    @XmlElement(name = "InBlkFileDataFileHash")
    protected String inBlkFileDataFileHash;
    @XmlElement(name = "InBlkFileDataFileName")
    protected String inBlkFileDataFileName;
    @XmlElement(name = "InBlkTemplateHeaderTemplateId")
    protected int inBlkTemplateHeaderTemplateId;
    @XmlElement(name = "InCommandIefSuppliedCommand")
    protected String inCommandIefSuppliedCommand;
    @XmlElement(name = "InTerminalTerminalNumber")
    protected String inTerminalTerminalNumber;
    @XmlElement(name = "InGrpCacheRecords")
    protected ArrayOfBIP001VInGrpCacheRecordsItem inGrpCacheRecords;

    /**
     * Gets the value of the inBankParametersRateUsage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInBankParametersRateUsage() {
        return inBankParametersRateUsage;
    }

    /**
     * Sets the value of the inBankParametersRateUsage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInBankParametersRateUsage(String value) {
        this.inBankParametersRateUsage = value;
    }

    /**
     * Gets the value of the inBlkFileDataDataType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInBlkFileDataDataType() {
        return inBlkFileDataDataType;
    }

    /**
     * Sets the value of the inBlkFileDataDataType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInBlkFileDataDataType(String value) {
        this.inBlkFileDataDataType = value;
    }

    /**
     * Gets the value of the inBlkFileDataFileHash property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInBlkFileDataFileHash() {
        return inBlkFileDataFileHash;
    }

    /**
     * Sets the value of the inBlkFileDataFileHash property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInBlkFileDataFileHash(String value) {
        this.inBlkFileDataFileHash = value;
    }

    /**
     * Gets the value of the inBlkFileDataFileName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInBlkFileDataFileName() {
        return inBlkFileDataFileName;
    }

    /**
     * Sets the value of the inBlkFileDataFileName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInBlkFileDataFileName(String value) {
        this.inBlkFileDataFileName = value;
    }

    /**
     * Gets the value of the inBlkTemplateHeaderTemplateId property.
     * 
     */
    public int getInBlkTemplateHeaderTemplateId() {
        return inBlkTemplateHeaderTemplateId;
    }

    /**
     * Sets the value of the inBlkTemplateHeaderTemplateId property.
     * 
     */
    public void setInBlkTemplateHeaderTemplateId(int value) {
        this.inBlkTemplateHeaderTemplateId = value;
    }

    /**
     * Gets the value of the inCommandIefSuppliedCommand property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCommandIefSuppliedCommand() {
        return inCommandIefSuppliedCommand;
    }

    /**
     * Sets the value of the inCommandIefSuppliedCommand property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCommandIefSuppliedCommand(String value) {
        this.inCommandIefSuppliedCommand = value;
    }

    /**
     * Gets the value of the inTerminalTerminalNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInTerminalTerminalNumber() {
        return inTerminalTerminalNumber;
    }

    /**
     * Sets the value of the inTerminalTerminalNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInTerminalTerminalNumber(String value) {
        this.inTerminalTerminalNumber = value;
    }

    /**
     * Gets the value of the inGrpCacheRecords property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfBIP001VInGrpCacheRecordsItem }
     *     
     */
    public ArrayOfBIP001VInGrpCacheRecordsItem getInGrpCacheRecords() {
        return inGrpCacheRecords;
    }

    /**
     * Sets the value of the inGrpCacheRecords property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfBIP001VInGrpCacheRecordsItem }
     *     
     */
    public void setInGrpCacheRecords(ArrayOfBIP001VInGrpCacheRecordsItem value) {
        this.inGrpCacheRecords = value;
    }

}
