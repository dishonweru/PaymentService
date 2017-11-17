
package com.intrasoft_internatinal.gatewayservice.profitsext;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BIP003VBulkprocessinstructionsImport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BIP003VBulkprocessinstructionsImport">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}BaseImport">
 *       &lt;sequence>
 *         &lt;element name="InAutomoreLastBlkFileDataDataRowSn" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InBankParametersRateUsage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InBlkFileDataByPassFlg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InBlkFileDataDataMechanism" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InBlkFileDataDataRowSn" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InBlkFileDataFileHash" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InBlkFileDataFileName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InBlkFileDataRejectionReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCommandIefSuppliedCommand" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCommandPrevIefSuppliedCommand" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InFilterNameDiffersIefSuppliedFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InTerminalTerminalNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BIP003VBulkprocessinstructionsImport", propOrder = {
    "inAutomoreLastBlkFileDataDataRowSn",
    "inBankParametersRateUsage",
    "inBlkFileDataByPassFlg",
    "inBlkFileDataDataMechanism",
    "inBlkFileDataDataRowSn",
    "inBlkFileDataFileHash",
    "inBlkFileDataFileName",
    "inBlkFileDataRejectionReason",
    "inCommandIefSuppliedCommand",
    "inCommandPrevIefSuppliedCommand",
    "inFilterNameDiffersIefSuppliedFlag",
    "inTerminalTerminalNumber"
})
public class BIP003VBulkprocessinstructionsImport
    extends BaseImport
{

    @XmlElement(name = "InAutomoreLastBlkFileDataDataRowSn")
    protected int inAutomoreLastBlkFileDataDataRowSn;
    @XmlElement(name = "InBankParametersRateUsage")
    protected String inBankParametersRateUsage;
    @XmlElement(name = "InBlkFileDataByPassFlg")
    protected String inBlkFileDataByPassFlg;
    @XmlElement(name = "InBlkFileDataDataMechanism")
    protected String inBlkFileDataDataMechanism;
    @XmlElement(name = "InBlkFileDataDataRowSn")
    protected int inBlkFileDataDataRowSn;
    @XmlElement(name = "InBlkFileDataFileHash")
    protected String inBlkFileDataFileHash;
    @XmlElement(name = "InBlkFileDataFileName")
    protected String inBlkFileDataFileName;
    @XmlElement(name = "InBlkFileDataRejectionReason")
    protected String inBlkFileDataRejectionReason;
    @XmlElement(name = "InCommandIefSuppliedCommand")
    protected String inCommandIefSuppliedCommand;
    @XmlElement(name = "InCommandPrevIefSuppliedCommand")
    protected String inCommandPrevIefSuppliedCommand;
    @XmlElement(name = "InFilterNameDiffersIefSuppliedFlag")
    protected String inFilterNameDiffersIefSuppliedFlag;
    @XmlElement(name = "InTerminalTerminalNumber")
    protected String inTerminalTerminalNumber;

    /**
     * Gets the value of the inAutomoreLastBlkFileDataDataRowSn property.
     * 
     */
    public int getInAutomoreLastBlkFileDataDataRowSn() {
        return inAutomoreLastBlkFileDataDataRowSn;
    }

    /**
     * Sets the value of the inAutomoreLastBlkFileDataDataRowSn property.
     * 
     */
    public void setInAutomoreLastBlkFileDataDataRowSn(int value) {
        this.inAutomoreLastBlkFileDataDataRowSn = value;
    }

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
     * Gets the value of the inBlkFileDataByPassFlg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInBlkFileDataByPassFlg() {
        return inBlkFileDataByPassFlg;
    }

    /**
     * Sets the value of the inBlkFileDataByPassFlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInBlkFileDataByPassFlg(String value) {
        this.inBlkFileDataByPassFlg = value;
    }

    /**
     * Gets the value of the inBlkFileDataDataMechanism property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInBlkFileDataDataMechanism() {
        return inBlkFileDataDataMechanism;
    }

    /**
     * Sets the value of the inBlkFileDataDataMechanism property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInBlkFileDataDataMechanism(String value) {
        this.inBlkFileDataDataMechanism = value;
    }

    /**
     * Gets the value of the inBlkFileDataDataRowSn property.
     * 
     */
    public int getInBlkFileDataDataRowSn() {
        return inBlkFileDataDataRowSn;
    }

    /**
     * Sets the value of the inBlkFileDataDataRowSn property.
     * 
     */
    public void setInBlkFileDataDataRowSn(int value) {
        this.inBlkFileDataDataRowSn = value;
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
     * Gets the value of the inBlkFileDataRejectionReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInBlkFileDataRejectionReason() {
        return inBlkFileDataRejectionReason;
    }

    /**
     * Sets the value of the inBlkFileDataRejectionReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInBlkFileDataRejectionReason(String value) {
        this.inBlkFileDataRejectionReason = value;
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
     * Gets the value of the inCommandPrevIefSuppliedCommand property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCommandPrevIefSuppliedCommand() {
        return inCommandPrevIefSuppliedCommand;
    }

    /**
     * Sets the value of the inCommandPrevIefSuppliedCommand property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCommandPrevIefSuppliedCommand(String value) {
        this.inCommandPrevIefSuppliedCommand = value;
    }

    /**
     * Gets the value of the inFilterNameDiffersIefSuppliedFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInFilterNameDiffersIefSuppliedFlag() {
        return inFilterNameDiffersIefSuppliedFlag;
    }

    /**
     * Sets the value of the inFilterNameDiffersIefSuppliedFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInFilterNameDiffersIefSuppliedFlag(String value) {
        this.inFilterNameDiffersIefSuppliedFlag = value;
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

}
