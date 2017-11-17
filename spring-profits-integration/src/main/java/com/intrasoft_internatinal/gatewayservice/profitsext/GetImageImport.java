
package com.intrasoft_internatinal.gatewayservice.profitsext;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetImageImport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetImageImport">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}BaseImport">
 *       &lt;sequence>
 *         &lt;element name="Command" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InContinueScannedImagePartImagePartNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InDetailScannedImagePartImagePartData" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InDetailScannedImagePartImagePartNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InGrpParametersInGrmTerminalTerminalNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InGrpParametersInGrmTrxCountTrxCounter" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InImgScannedImageActive" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InImgScannedImageImageId" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="InImgScannedImageImageLength" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InImgScannedImageImageType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InImgScannedImageObjectId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InImgScannedImageStoreStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InIefSuppliedString255" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetImageImport", propOrder = {
    "command",
    "inContinueScannedImagePartImagePartNumber",
    "inDetailScannedImagePartImagePartData",
    "inDetailScannedImagePartImagePartNumber",
    "inGrpParametersInGrmTerminalTerminalNumber",
    "inGrpParametersInGrmTrxCountTrxCounter",
    "inImgScannedImageActive",
    "inImgScannedImageImageId",
    "inImgScannedImageImageLength",
    "inImgScannedImageImageType",
    "inImgScannedImageObjectId",
    "inImgScannedImageStoreStatus",
    "inIefSuppliedString255"
})
public class GetImageImport
    extends BaseImport
{

    @XmlElement(name = "Command")
    protected String command;
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
    @XmlElement(name = "InIefSuppliedString255")
    protected String inIefSuppliedString255;

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

}
