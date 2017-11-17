
package com.intrasoft_internatinal.gatewayservice.profitsext;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SCN001V_ExternalImageManagementExport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SCN001V_ExternalImageManagementExport">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}BaseExport">
 *       &lt;sequence>
 *         &lt;element name="OutImageBlobScannedImageImageId" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OutImageBlobScannedImageLength" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutImageBlobScannedImageImage" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *         &lt;element name="OutImageDetailsDocDetailsFilename" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutImageDetailsDocDetailsDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutImageDetailsDocDetailsComments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SCN001V_ExternalImageManagementExport", propOrder = {
    "outImageBlobScannedImageImageId",
    "outImageBlobScannedImageLength",
    "outImageBlobScannedImageImage",
    "outImageDetailsDocDetailsFilename",
    "outImageDetailsDocDetailsDescription",
    "outImageDetailsDocDetailsComments"
})
public class SCN001VExternalImageManagementExport
    extends BaseExport
{

    @XmlElement(name = "OutImageBlobScannedImageImageId")
    protected double outImageBlobScannedImageImageId;
    @XmlElement(name = "OutImageBlobScannedImageLength")
    protected int outImageBlobScannedImageLength;
    @XmlElement(name = "OutImageBlobScannedImageImage")
    protected byte[] outImageBlobScannedImageImage;
    @XmlElement(name = "OutImageDetailsDocDetailsFilename")
    protected String outImageDetailsDocDetailsFilename;
    @XmlElement(name = "OutImageDetailsDocDetailsDescription")
    protected String outImageDetailsDocDetailsDescription;
    @XmlElement(name = "OutImageDetailsDocDetailsComments")
    protected String outImageDetailsDocDetailsComments;

    /**
     * Gets the value of the outImageBlobScannedImageImageId property.
     * 
     */
    public double getOutImageBlobScannedImageImageId() {
        return outImageBlobScannedImageImageId;
    }

    /**
     * Sets the value of the outImageBlobScannedImageImageId property.
     * 
     */
    public void setOutImageBlobScannedImageImageId(double value) {
        this.outImageBlobScannedImageImageId = value;
    }

    /**
     * Gets the value of the outImageBlobScannedImageLength property.
     * 
     */
    public int getOutImageBlobScannedImageLength() {
        return outImageBlobScannedImageLength;
    }

    /**
     * Sets the value of the outImageBlobScannedImageLength property.
     * 
     */
    public void setOutImageBlobScannedImageLength(int value) {
        this.outImageBlobScannedImageLength = value;
    }

    /**
     * Gets the value of the outImageBlobScannedImageImage property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getOutImageBlobScannedImageImage() {
        return outImageBlobScannedImageImage;
    }

    /**
     * Sets the value of the outImageBlobScannedImageImage property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setOutImageBlobScannedImageImage(byte[] value) {
        this.outImageBlobScannedImageImage = value;
    }

    /**
     * Gets the value of the outImageDetailsDocDetailsFilename property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutImageDetailsDocDetailsFilename() {
        return outImageDetailsDocDetailsFilename;
    }

    /**
     * Sets the value of the outImageDetailsDocDetailsFilename property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutImageDetailsDocDetailsFilename(String value) {
        this.outImageDetailsDocDetailsFilename = value;
    }

    /**
     * Gets the value of the outImageDetailsDocDetailsDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutImageDetailsDocDetailsDescription() {
        return outImageDetailsDocDetailsDescription;
    }

    /**
     * Sets the value of the outImageDetailsDocDetailsDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutImageDetailsDocDetailsDescription(String value) {
        this.outImageDetailsDocDetailsDescription = value;
    }

    /**
     * Gets the value of the outImageDetailsDocDetailsComments property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutImageDetailsDocDetailsComments() {
        return outImageDetailsDocDetailsComments;
    }

    /**
     * Sets the value of the outImageDetailsDocDetailsComments property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutImageDetailsDocDetailsComments(String value) {
        this.outImageDetailsDocDetailsComments = value;
    }

}
