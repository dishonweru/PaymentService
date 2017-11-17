
package com.intrasoft_internatinal.gatewayservice.profitsext;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SCN001V_ImageManagementExport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SCN001V_ImageManagementExport">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}BaseExport">
 *       &lt;sequence>
 *         &lt;element name="OutImgScannedImageImageLength" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutImgScannedImageImageId" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OutImgScannedImageImage" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SCN001V_ImageManagementExport", propOrder = {
    "outImgScannedImageImageLength",
    "outImgScannedImageImageId",
    "outImgScannedImageImage"
})
public class SCN001VImageManagementExport
    extends BaseExport
{

    @XmlElement(name = "OutImgScannedImageImageLength")
    protected int outImgScannedImageImageLength;
    @XmlElement(name = "OutImgScannedImageImageId")
    protected double outImgScannedImageImageId;
    @XmlElement(name = "OutImgScannedImageImage")
    protected byte[] outImgScannedImageImage;

    /**
     * Gets the value of the outImgScannedImageImageLength property.
     * 
     */
    public int getOutImgScannedImageImageLength() {
        return outImgScannedImageImageLength;
    }

    /**
     * Sets the value of the outImgScannedImageImageLength property.
     * 
     */
    public void setOutImgScannedImageImageLength(int value) {
        this.outImgScannedImageImageLength = value;
    }

    /**
     * Gets the value of the outImgScannedImageImageId property.
     * 
     */
    public double getOutImgScannedImageImageId() {
        return outImgScannedImageImageId;
    }

    /**
     * Sets the value of the outImgScannedImageImageId property.
     * 
     */
    public void setOutImgScannedImageImageId(double value) {
        this.outImgScannedImageImageId = value;
    }

    /**
     * Gets the value of the outImgScannedImageImage property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getOutImgScannedImageImage() {
        return outImgScannedImageImage;
    }

    /**
     * Sets the value of the outImgScannedImageImage property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setOutImgScannedImageImage(byte[] value) {
        this.outImgScannedImageImage = value;
    }

}
