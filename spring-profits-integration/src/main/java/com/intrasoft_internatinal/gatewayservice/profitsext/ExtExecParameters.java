
package com.intrasoft_internatinal.gatewayservice.profitsext;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ExtExecParameters complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExtExecParameters">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ChannelId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Password" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UniqueId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CultureName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ForcastFlag" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="ReferenceKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SotfOtp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BranchCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ExtUniqueUserId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ExtDeviceAuthCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExtExecParameters", propOrder = {
    "channelId",
    "password",
    "uniqueId",
    "cultureName",
    "forcastFlag",
    "referenceKey",
    "sotfOtp",
    "branchCode",
    "extUniqueUserId",
    "extDeviceAuthCode"
})
public class ExtExecParameters {

    @XmlElement(name = "ChannelId")
    protected int channelId;
    @XmlElement(name = "Password")
    protected String password;
    @XmlElement(name = "UniqueId")
    protected String uniqueId;
    @XmlElement(name = "CultureName")
    protected String cultureName;
    @XmlElement(name = "ForcastFlag")
    protected boolean forcastFlag;
    @XmlElement(name = "ReferenceKey")
    protected String referenceKey;
    @XmlElement(name = "SotfOtp")
    protected String sotfOtp;
    @XmlElement(name = "BranchCode")
    protected String branchCode;
    @XmlElement(name = "ExtUniqueUserId")
    protected String extUniqueUserId;
    @XmlElement(name = "ExtDeviceAuthCode")
    protected String extDeviceAuthCode;

    /**
     * Gets the value of the channelId property.
     * 
     */
    public int getChannelId() {
        return channelId;
    }

    /**
     * Sets the value of the channelId property.
     * 
     */
    public void setChannelId(int value) {
        this.channelId = value;
    }

    /**
     * Gets the value of the password property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassword() {
        return password;
    }

    /**
     * Sets the value of the password property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassword(String value) {
        this.password = value;
    }

    /**
     * Gets the value of the uniqueId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniqueId() {
        return uniqueId;
    }

    /**
     * Sets the value of the uniqueId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniqueId(String value) {
        this.uniqueId = value;
    }

    /**
     * Gets the value of the cultureName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCultureName() {
        return cultureName;
    }

    /**
     * Sets the value of the cultureName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCultureName(String value) {
        this.cultureName = value;
    }

    /**
     * Gets the value of the forcastFlag property.
     * 
     */
    public boolean isForcastFlag() {
        return forcastFlag;
    }

    /**
     * Sets the value of the forcastFlag property.
     * 
     */
    public void setForcastFlag(boolean value) {
        this.forcastFlag = value;
    }

    /**
     * Gets the value of the referenceKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferenceKey() {
        return referenceKey;
    }

    /**
     * Sets the value of the referenceKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferenceKey(String value) {
        this.referenceKey = value;
    }

    /**
     * Gets the value of the sotfOtp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSotfOtp() {
        return sotfOtp;
    }

    /**
     * Sets the value of the sotfOtp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSotfOtp(String value) {
        this.sotfOtp = value;
    }

    /**
     * Gets the value of the branchCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBranchCode() {
        return branchCode;
    }

    /**
     * Sets the value of the branchCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBranchCode(String value) {
        this.branchCode = value;
    }

    /**
     * Gets the value of the extUniqueUserId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtUniqueUserId() {
        return extUniqueUserId;
    }

    /**
     * Sets the value of the extUniqueUserId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtUniqueUserId(String value) {
        this.extUniqueUserId = value;
    }

    /**
     * Gets the value of the extDeviceAuthCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtDeviceAuthCode() {
        return extDeviceAuthCode;
    }

    /**
     * Sets the value of the extDeviceAuthCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtDeviceAuthCode(String value) {
        this.extDeviceAuthCode = value;
    }

}
