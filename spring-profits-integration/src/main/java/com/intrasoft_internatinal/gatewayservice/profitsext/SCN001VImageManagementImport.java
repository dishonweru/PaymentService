
package com.intrasoft_internatinal.gatewayservice.profitsext;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SCN001V_ImageManagementImport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SCN001V_ImageManagementImport">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}BaseImport">
 *       &lt;sequence>
 *         &lt;element name="Command" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InActionIefSuppliedChar40" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InContinueScannedImagePartImagePartNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InDetailScannedImagePartImagePartData" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InDetailScannedImagePartImagePartNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InGrpParametersInGrmTerminalTerminalNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InGrpParametersInGrmTrxCountTrxCounter" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InIefSuppliedString255" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InSelectedDocCategoriesCategoryId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InSelectedDocCategoriesCategoryDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InSelectedDocCategoriesActiveFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InSelectedDocDetailsDocId" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="InSelectedDocDetailsImageId" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="InSelectedDocDetailsPrftObjType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InSelectedDocDetailsPrftObjValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InSelectedDocSystemsSystemId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InSelectedDocSystemsSystemDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InSelectedDocSystemsActiveFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InSsSecurityCmcbTranCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InSsSecurityCmcbPrftSystem" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InImgScannedImageActive" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InImgScannedImageImageId" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="InImgScannedImageImageLength" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InImgScannedImageImageType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InImgScannedImageObjectId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InImgScannedImageStoreStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InImgScannedImageImage" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SCN001V_ImageManagementImport", propOrder = {
    "command",
    "inActionIefSuppliedChar40",
    "inContinueScannedImagePartImagePartNumber",
    "inDetailScannedImagePartImagePartData",
    "inDetailScannedImagePartImagePartNumber",
    "inGrpParametersInGrmTerminalTerminalNumber",
    "inGrpParametersInGrmTrxCountTrxCounter",
    "inIefSuppliedString255",
    "inSelectedDocCategoriesCategoryId",
    "inSelectedDocCategoriesCategoryDesc",
    "inSelectedDocCategoriesActiveFlag",
    "inSelectedDocDetailsDocId",
    "inSelectedDocDetailsImageId",
    "inSelectedDocDetailsPrftObjType",
    "inSelectedDocDetailsPrftObjValue",
    "inSelectedDocSystemsSystemId",
    "inSelectedDocSystemsSystemDescription",
    "inSelectedDocSystemsActiveFlag",
    "inSsSecurityCmcbTranCode",
    "inSsSecurityCmcbPrftSystem",
    "inImgScannedImageActive",
    "inImgScannedImageImageId",
    "inImgScannedImageImageLength",
    "inImgScannedImageImageType",
    "inImgScannedImageObjectId",
    "inImgScannedImageStoreStatus",
    "inImgScannedImageImage"
})
public class SCN001VImageManagementImport
    extends BaseImport
{

    @XmlElement(name = "Command")
    protected String command;
    @XmlElement(name = "InActionIefSuppliedChar40")
    protected String inActionIefSuppliedChar40;
    @XmlElement(name = "InContinueScannedImagePartImagePartNumber")
    protected int inContinueScannedImagePartImagePartNumber;
    @XmlElement(name = "InDetailScannedImagePartImagePartData")
    protected String inDetailScannedImagePartImagePartData;
    @XmlElement(name = "InDetailScannedImagePartImagePartNumber")
    protected int inDetailScannedImagePartImagePartNumber;
    @XmlElement(name = "InGrpParametersInGrmTerminalTerminalNumber")
    protected String inGrpParametersInGrmTerminalTerminalNumber;
    @XmlElement(name = "InGrpParametersInGrmTrxCountTrxCounter")
    protected int inGrpParametersInGrmTrxCountTrxCounter;
    @XmlElement(name = "InIefSuppliedString255")
    protected String inIefSuppliedString255;
    @XmlElement(name = "InSelectedDocCategoriesCategoryId")
    protected String inSelectedDocCategoriesCategoryId;
    @XmlElement(name = "InSelectedDocCategoriesCategoryDesc")
    protected String inSelectedDocCategoriesCategoryDesc;
    @XmlElement(name = "InSelectedDocCategoriesActiveFlag")
    protected String inSelectedDocCategoriesActiveFlag;
    @XmlElement(name = "InSelectedDocDetailsDocId")
    protected double inSelectedDocDetailsDocId;
    @XmlElement(name = "InSelectedDocDetailsImageId")
    protected double inSelectedDocDetailsImageId;
    @XmlElement(name = "InSelectedDocDetailsPrftObjType")
    protected String inSelectedDocDetailsPrftObjType;
    @XmlElement(name = "InSelectedDocDetailsPrftObjValue")
    protected String inSelectedDocDetailsPrftObjValue;
    @XmlElement(name = "InSelectedDocSystemsSystemId")
    protected String inSelectedDocSystemsSystemId;
    @XmlElement(name = "InSelectedDocSystemsSystemDescription")
    protected String inSelectedDocSystemsSystemDescription;
    @XmlElement(name = "InSelectedDocSystemsActiveFlag")
    protected String inSelectedDocSystemsActiveFlag;
    @XmlElement(name = "InSsSecurityCmcbTranCode")
    protected String inSsSecurityCmcbTranCode;
    @XmlElement(name = "InSsSecurityCmcbPrftSystem")
    protected short inSsSecurityCmcbPrftSystem;
    @XmlElement(name = "InImgScannedImageActive")
    protected String inImgScannedImageActive;
    @XmlElement(name = "InImgScannedImageImageId")
    protected double inImgScannedImageImageId;
    @XmlElement(name = "InImgScannedImageImageLength")
    protected int inImgScannedImageImageLength;
    @XmlElement(name = "InImgScannedImageImageType")
    protected String inImgScannedImageImageType;
    @XmlElement(name = "InImgScannedImageObjectId")
    protected String inImgScannedImageObjectId;
    @XmlElement(name = "InImgScannedImageStoreStatus")
    protected String inImgScannedImageStoreStatus;
    @XmlElement(name = "InImgScannedImageImage")
    protected byte[] inImgScannedImageImage;

    /**
     * Gets the value of the command property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommand() {
        return command;
    }

    /**
     * Sets the value of the command property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommand(String value) {
        this.command = value;
    }

    /**
     * Gets the value of the inActionIefSuppliedChar40 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInActionIefSuppliedChar40() {
        return inActionIefSuppliedChar40;
    }

    /**
     * Sets the value of the inActionIefSuppliedChar40 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInActionIefSuppliedChar40(String value) {
        this.inActionIefSuppliedChar40 = value;
    }

    /**
     * Gets the value of the inContinueScannedImagePartImagePartNumber property.
     * 
     */
    public int getInContinueScannedImagePartImagePartNumber() {
        return inContinueScannedImagePartImagePartNumber;
    }

    /**
     * Sets the value of the inContinueScannedImagePartImagePartNumber property.
     * 
     */
    public void setInContinueScannedImagePartImagePartNumber(int value) {
        this.inContinueScannedImagePartImagePartNumber = value;
    }

    /**
     * Gets the value of the inDetailScannedImagePartImagePartData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInDetailScannedImagePartImagePartData() {
        return inDetailScannedImagePartImagePartData;
    }

    /**
     * Sets the value of the inDetailScannedImagePartImagePartData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInDetailScannedImagePartImagePartData(String value) {
        this.inDetailScannedImagePartImagePartData = value;
    }

    /**
     * Gets the value of the inDetailScannedImagePartImagePartNumber property.
     * 
     */
    public int getInDetailScannedImagePartImagePartNumber() {
        return inDetailScannedImagePartImagePartNumber;
    }

    /**
     * Sets the value of the inDetailScannedImagePartImagePartNumber property.
     * 
     */
    public void setInDetailScannedImagePartImagePartNumber(int value) {
        this.inDetailScannedImagePartImagePartNumber = value;
    }

    /**
     * Gets the value of the inGrpParametersInGrmTerminalTerminalNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInGrpParametersInGrmTerminalTerminalNumber() {
        return inGrpParametersInGrmTerminalTerminalNumber;
    }

    /**
     * Sets the value of the inGrpParametersInGrmTerminalTerminalNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInGrpParametersInGrmTerminalTerminalNumber(String value) {
        this.inGrpParametersInGrmTerminalTerminalNumber = value;
    }

    /**
     * Gets the value of the inGrpParametersInGrmTrxCountTrxCounter property.
     * 
     */
    public int getInGrpParametersInGrmTrxCountTrxCounter() {
        return inGrpParametersInGrmTrxCountTrxCounter;
    }

    /**
     * Sets the value of the inGrpParametersInGrmTrxCountTrxCounter property.
     * 
     */
    public void setInGrpParametersInGrmTrxCountTrxCounter(int value) {
        this.inGrpParametersInGrmTrxCountTrxCounter = value;
    }

    /**
     * Gets the value of the inIefSuppliedString255 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInIefSuppliedString255() {
        return inIefSuppliedString255;
    }

    /**
     * Sets the value of the inIefSuppliedString255 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInIefSuppliedString255(String value) {
        this.inIefSuppliedString255 = value;
    }

    /**
     * Gets the value of the inSelectedDocCategoriesCategoryId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInSelectedDocCategoriesCategoryId() {
        return inSelectedDocCategoriesCategoryId;
    }

    /**
     * Sets the value of the inSelectedDocCategoriesCategoryId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInSelectedDocCategoriesCategoryId(String value) {
        this.inSelectedDocCategoriesCategoryId = value;
    }

    /**
     * Gets the value of the inSelectedDocCategoriesCategoryDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInSelectedDocCategoriesCategoryDesc() {
        return inSelectedDocCategoriesCategoryDesc;
    }

    /**
     * Sets the value of the inSelectedDocCategoriesCategoryDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInSelectedDocCategoriesCategoryDesc(String value) {
        this.inSelectedDocCategoriesCategoryDesc = value;
    }

    /**
     * Gets the value of the inSelectedDocCategoriesActiveFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInSelectedDocCategoriesActiveFlag() {
        return inSelectedDocCategoriesActiveFlag;
    }

    /**
     * Sets the value of the inSelectedDocCategoriesActiveFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInSelectedDocCategoriesActiveFlag(String value) {
        this.inSelectedDocCategoriesActiveFlag = value;
    }

    /**
     * Gets the value of the inSelectedDocDetailsDocId property.
     * 
     */
    public double getInSelectedDocDetailsDocId() {
        return inSelectedDocDetailsDocId;
    }

    /**
     * Sets the value of the inSelectedDocDetailsDocId property.
     * 
     */
    public void setInSelectedDocDetailsDocId(double value) {
        this.inSelectedDocDetailsDocId = value;
    }

    /**
     * Gets the value of the inSelectedDocDetailsImageId property.
     * 
     */
    public double getInSelectedDocDetailsImageId() {
        return inSelectedDocDetailsImageId;
    }

    /**
     * Sets the value of the inSelectedDocDetailsImageId property.
     * 
     */
    public void setInSelectedDocDetailsImageId(double value) {
        this.inSelectedDocDetailsImageId = value;
    }

    /**
     * Gets the value of the inSelectedDocDetailsPrftObjType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInSelectedDocDetailsPrftObjType() {
        return inSelectedDocDetailsPrftObjType;
    }

    /**
     * Sets the value of the inSelectedDocDetailsPrftObjType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInSelectedDocDetailsPrftObjType(String value) {
        this.inSelectedDocDetailsPrftObjType = value;
    }

    /**
     * Gets the value of the inSelectedDocDetailsPrftObjValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInSelectedDocDetailsPrftObjValue() {
        return inSelectedDocDetailsPrftObjValue;
    }

    /**
     * Sets the value of the inSelectedDocDetailsPrftObjValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInSelectedDocDetailsPrftObjValue(String value) {
        this.inSelectedDocDetailsPrftObjValue = value;
    }

    /**
     * Gets the value of the inSelectedDocSystemsSystemId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInSelectedDocSystemsSystemId() {
        return inSelectedDocSystemsSystemId;
    }

    /**
     * Sets the value of the inSelectedDocSystemsSystemId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInSelectedDocSystemsSystemId(String value) {
        this.inSelectedDocSystemsSystemId = value;
    }

    /**
     * Gets the value of the inSelectedDocSystemsSystemDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInSelectedDocSystemsSystemDescription() {
        return inSelectedDocSystemsSystemDescription;
    }

    /**
     * Sets the value of the inSelectedDocSystemsSystemDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInSelectedDocSystemsSystemDescription(String value) {
        this.inSelectedDocSystemsSystemDescription = value;
    }

    /**
     * Gets the value of the inSelectedDocSystemsActiveFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInSelectedDocSystemsActiveFlag() {
        return inSelectedDocSystemsActiveFlag;
    }

    /**
     * Sets the value of the inSelectedDocSystemsActiveFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInSelectedDocSystemsActiveFlag(String value) {
        this.inSelectedDocSystemsActiveFlag = value;
    }

    /**
     * Gets the value of the inSsSecurityCmcbTranCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInSsSecurityCmcbTranCode() {
        return inSsSecurityCmcbTranCode;
    }

    /**
     * Sets the value of the inSsSecurityCmcbTranCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInSsSecurityCmcbTranCode(String value) {
        this.inSsSecurityCmcbTranCode = value;
    }

    /**
     * Gets the value of the inSsSecurityCmcbPrftSystem property.
     * 
     */
    public short getInSsSecurityCmcbPrftSystem() {
        return inSsSecurityCmcbPrftSystem;
    }

    /**
     * Sets the value of the inSsSecurityCmcbPrftSystem property.
     * 
     */
    public void setInSsSecurityCmcbPrftSystem(short value) {
        this.inSsSecurityCmcbPrftSystem = value;
    }

    /**
     * Gets the value of the inImgScannedImageActive property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInImgScannedImageActive() {
        return inImgScannedImageActive;
    }

    /**
     * Sets the value of the inImgScannedImageActive property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInImgScannedImageActive(String value) {
        this.inImgScannedImageActive = value;
    }

    /**
     * Gets the value of the inImgScannedImageImageId property.
     * 
     */
    public double getInImgScannedImageImageId() {
        return inImgScannedImageImageId;
    }

    /**
     * Sets the value of the inImgScannedImageImageId property.
     * 
     */
    public void setInImgScannedImageImageId(double value) {
        this.inImgScannedImageImageId = value;
    }

    /**
     * Gets the value of the inImgScannedImageImageLength property.
     * 
     */
    public int getInImgScannedImageImageLength() {
        return inImgScannedImageImageLength;
    }

    /**
     * Sets the value of the inImgScannedImageImageLength property.
     * 
     */
    public void setInImgScannedImageImageLength(int value) {
        this.inImgScannedImageImageLength = value;
    }

    /**
     * Gets the value of the inImgScannedImageImageType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInImgScannedImageImageType() {
        return inImgScannedImageImageType;
    }

    /**
     * Sets the value of the inImgScannedImageImageType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInImgScannedImageImageType(String value) {
        this.inImgScannedImageImageType = value;
    }

    /**
     * Gets the value of the inImgScannedImageObjectId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInImgScannedImageObjectId() {
        return inImgScannedImageObjectId;
    }

    /**
     * Sets the value of the inImgScannedImageObjectId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInImgScannedImageObjectId(String value) {
        this.inImgScannedImageObjectId = value;
    }

    /**
     * Gets the value of the inImgScannedImageStoreStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInImgScannedImageStoreStatus() {
        return inImgScannedImageStoreStatus;
    }

    /**
     * Sets the value of the inImgScannedImageStoreStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInImgScannedImageStoreStatus(String value) {
        this.inImgScannedImageStoreStatus = value;
    }

    /**
     * Gets the value of the inImgScannedImageImage property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getInImgScannedImageImage() {
        return inImgScannedImageImage;
    }

    /**
     * Sets the value of the inImgScannedImageImage property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setInImgScannedImageImage(byte[] value) {
        this.inImgScannedImageImage = value;
    }

}
