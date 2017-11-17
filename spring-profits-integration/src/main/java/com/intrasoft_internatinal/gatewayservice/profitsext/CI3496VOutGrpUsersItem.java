
package com.intrasoft_internatinal.gatewayservice.profitsext;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CI3496VOutGrpUsersItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CI3496VOutGrpUsersItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OutGrpUsersOutGrmUsersDistrChannelDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpUsersOutGrmUsersDistrChannelIdChannel" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGrpUsersOutGrmUsersUsrAtmUser" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpUsersOutGrmUsersUsrBatchUser" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpUsersOutGrmUsersUsrCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpUsersOutGrmUsersUsrRmInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpUsersOutGrmUsersUsrVirtualUser" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CI3496VOutGrpUsersItem", propOrder = {
    "outGrpUsersOutGrmUsersDistrChannelDescription",
    "outGrpUsersOutGrmUsersDistrChannelIdChannel",
    "outGrpUsersOutGrmUsersUsrAtmUser",
    "outGrpUsersOutGrmUsersUsrBatchUser",
    "outGrpUsersOutGrmUsersUsrCode",
    "outGrpUsersOutGrmUsersUsrRmInd",
    "outGrpUsersOutGrmUsersUsrVirtualUser"
})
public class CI3496VOutGrpUsersItem {

    @XmlElement(name = "OutGrpUsersOutGrmUsersDistrChannelDescription")
    protected String outGrpUsersOutGrmUsersDistrChannelDescription;
    @XmlElement(name = "OutGrpUsersOutGrmUsersDistrChannelIdChannel")
    protected int outGrpUsersOutGrmUsersDistrChannelIdChannel;
    @XmlElement(name = "OutGrpUsersOutGrmUsersUsrAtmUser")
    protected String outGrpUsersOutGrmUsersUsrAtmUser;
    @XmlElement(name = "OutGrpUsersOutGrmUsersUsrBatchUser")
    protected String outGrpUsersOutGrmUsersUsrBatchUser;
    @XmlElement(name = "OutGrpUsersOutGrmUsersUsrCode")
    protected String outGrpUsersOutGrmUsersUsrCode;
    @XmlElement(name = "OutGrpUsersOutGrmUsersUsrRmInd")
    protected String outGrpUsersOutGrmUsersUsrRmInd;
    @XmlElement(name = "OutGrpUsersOutGrmUsersUsrVirtualUser")
    protected String outGrpUsersOutGrmUsersUsrVirtualUser;

    /**
     * Gets the value of the outGrpUsersOutGrmUsersDistrChannelDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpUsersOutGrmUsersDistrChannelDescription() {
        return outGrpUsersOutGrmUsersDistrChannelDescription;
    }

    /**
     * Sets the value of the outGrpUsersOutGrmUsersDistrChannelDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpUsersOutGrmUsersDistrChannelDescription(String value) {
        this.outGrpUsersOutGrmUsersDistrChannelDescription = value;
    }

    /**
     * Gets the value of the outGrpUsersOutGrmUsersDistrChannelIdChannel property.
     * 
     */
    public int getOutGrpUsersOutGrmUsersDistrChannelIdChannel() {
        return outGrpUsersOutGrmUsersDistrChannelIdChannel;
    }

    /**
     * Sets the value of the outGrpUsersOutGrmUsersDistrChannelIdChannel property.
     * 
     */
    public void setOutGrpUsersOutGrmUsersDistrChannelIdChannel(int value) {
        this.outGrpUsersOutGrmUsersDistrChannelIdChannel = value;
    }

    /**
     * Gets the value of the outGrpUsersOutGrmUsersUsrAtmUser property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpUsersOutGrmUsersUsrAtmUser() {
        return outGrpUsersOutGrmUsersUsrAtmUser;
    }

    /**
     * Sets the value of the outGrpUsersOutGrmUsersUsrAtmUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpUsersOutGrmUsersUsrAtmUser(String value) {
        this.outGrpUsersOutGrmUsersUsrAtmUser = value;
    }

    /**
     * Gets the value of the outGrpUsersOutGrmUsersUsrBatchUser property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpUsersOutGrmUsersUsrBatchUser() {
        return outGrpUsersOutGrmUsersUsrBatchUser;
    }

    /**
     * Sets the value of the outGrpUsersOutGrmUsersUsrBatchUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpUsersOutGrmUsersUsrBatchUser(String value) {
        this.outGrpUsersOutGrmUsersUsrBatchUser = value;
    }

    /**
     * Gets the value of the outGrpUsersOutGrmUsersUsrCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpUsersOutGrmUsersUsrCode() {
        return outGrpUsersOutGrmUsersUsrCode;
    }

    /**
     * Sets the value of the outGrpUsersOutGrmUsersUsrCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpUsersOutGrmUsersUsrCode(String value) {
        this.outGrpUsersOutGrmUsersUsrCode = value;
    }

    /**
     * Gets the value of the outGrpUsersOutGrmUsersUsrRmInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpUsersOutGrmUsersUsrRmInd() {
        return outGrpUsersOutGrmUsersUsrRmInd;
    }

    /**
     * Sets the value of the outGrpUsersOutGrmUsersUsrRmInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpUsersOutGrmUsersUsrRmInd(String value) {
        this.outGrpUsersOutGrmUsersUsrRmInd = value;
    }

    /**
     * Gets the value of the outGrpUsersOutGrmUsersUsrVirtualUser property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpUsersOutGrmUsersUsrVirtualUser() {
        return outGrpUsersOutGrmUsersUsrVirtualUser;
    }

    /**
     * Sets the value of the outGrpUsersOutGrmUsersUsrVirtualUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpUsersOutGrmUsersUsrVirtualUser(String value) {
        this.outGrpUsersOutGrmUsersUsrVirtualUser = value;
    }

}
