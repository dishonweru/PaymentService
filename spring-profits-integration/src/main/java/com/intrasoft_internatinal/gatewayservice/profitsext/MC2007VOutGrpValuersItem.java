
package com.intrasoft_internatinal.gatewayservice.profitsext;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MC2007VOutGrpValuersItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MC2007VOutGrpValuersItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OutGrpValuersOutGrm1IefSuppliedSelectChar" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpValuersOutGrm1ValuerValuerId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGrpValuersOutGrm1ValuerInternalFlg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpValuersOutGrm1ValuerValuerName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpValuersOutGrm1ValuerValuerPhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpValuersOutGrm1ValuerValuerMobile" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpValuersOutGrm1ValuerValuerAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpValuersOutGrm1ValuerValuerEmail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpValuersOutGrm1ValuerEntryStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpValuersOutGrm1ValTypeIefSuppliedChar20" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpValuersOutGrm1BeBankemployeeId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MC2007VOutGrpValuersItem", propOrder = {
    "outGrpValuersOutGrm1IefSuppliedSelectChar",
    "outGrpValuersOutGrm1ValuerValuerId",
    "outGrpValuersOutGrm1ValuerInternalFlg",
    "outGrpValuersOutGrm1ValuerValuerName",
    "outGrpValuersOutGrm1ValuerValuerPhone",
    "outGrpValuersOutGrm1ValuerValuerMobile",
    "outGrpValuersOutGrm1ValuerValuerAddress",
    "outGrpValuersOutGrm1ValuerValuerEmail",
    "outGrpValuersOutGrm1ValuerEntryStatus",
    "outGrpValuersOutGrm1ValTypeIefSuppliedChar20",
    "outGrpValuersOutGrm1BeBankemployeeId"
})
public class MC2007VOutGrpValuersItem {

    @XmlElement(name = "OutGrpValuersOutGrm1IefSuppliedSelectChar")
    protected String outGrpValuersOutGrm1IefSuppliedSelectChar;
    @XmlElement(name = "OutGrpValuersOutGrm1ValuerValuerId")
    protected int outGrpValuersOutGrm1ValuerValuerId;
    @XmlElement(name = "OutGrpValuersOutGrm1ValuerInternalFlg")
    protected String outGrpValuersOutGrm1ValuerInternalFlg;
    @XmlElement(name = "OutGrpValuersOutGrm1ValuerValuerName")
    protected String outGrpValuersOutGrm1ValuerValuerName;
    @XmlElement(name = "OutGrpValuersOutGrm1ValuerValuerPhone")
    protected String outGrpValuersOutGrm1ValuerValuerPhone;
    @XmlElement(name = "OutGrpValuersOutGrm1ValuerValuerMobile")
    protected String outGrpValuersOutGrm1ValuerValuerMobile;
    @XmlElement(name = "OutGrpValuersOutGrm1ValuerValuerAddress")
    protected String outGrpValuersOutGrm1ValuerValuerAddress;
    @XmlElement(name = "OutGrpValuersOutGrm1ValuerValuerEmail")
    protected String outGrpValuersOutGrm1ValuerValuerEmail;
    @XmlElement(name = "OutGrpValuersOutGrm1ValuerEntryStatus")
    protected String outGrpValuersOutGrm1ValuerEntryStatus;
    @XmlElement(name = "OutGrpValuersOutGrm1ValTypeIefSuppliedChar20")
    protected String outGrpValuersOutGrm1ValTypeIefSuppliedChar20;
    @XmlElement(name = "OutGrpValuersOutGrm1BeBankemployeeId")
    protected String outGrpValuersOutGrm1BeBankemployeeId;

    /**
     * Gets the value of the outGrpValuersOutGrm1IefSuppliedSelectChar property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpValuersOutGrm1IefSuppliedSelectChar() {
        return outGrpValuersOutGrm1IefSuppliedSelectChar;
    }

    /**
     * Sets the value of the outGrpValuersOutGrm1IefSuppliedSelectChar property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpValuersOutGrm1IefSuppliedSelectChar(String value) {
        this.outGrpValuersOutGrm1IefSuppliedSelectChar = value;
    }

    /**
     * Gets the value of the outGrpValuersOutGrm1ValuerValuerId property.
     * 
     */
    public int getOutGrpValuersOutGrm1ValuerValuerId() {
        return outGrpValuersOutGrm1ValuerValuerId;
    }

    /**
     * Sets the value of the outGrpValuersOutGrm1ValuerValuerId property.
     * 
     */
    public void setOutGrpValuersOutGrm1ValuerValuerId(int value) {
        this.outGrpValuersOutGrm1ValuerValuerId = value;
    }

    /**
     * Gets the value of the outGrpValuersOutGrm1ValuerInternalFlg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpValuersOutGrm1ValuerInternalFlg() {
        return outGrpValuersOutGrm1ValuerInternalFlg;
    }

    /**
     * Sets the value of the outGrpValuersOutGrm1ValuerInternalFlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpValuersOutGrm1ValuerInternalFlg(String value) {
        this.outGrpValuersOutGrm1ValuerInternalFlg = value;
    }

    /**
     * Gets the value of the outGrpValuersOutGrm1ValuerValuerName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpValuersOutGrm1ValuerValuerName() {
        return outGrpValuersOutGrm1ValuerValuerName;
    }

    /**
     * Sets the value of the outGrpValuersOutGrm1ValuerValuerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpValuersOutGrm1ValuerValuerName(String value) {
        this.outGrpValuersOutGrm1ValuerValuerName = value;
    }

    /**
     * Gets the value of the outGrpValuersOutGrm1ValuerValuerPhone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpValuersOutGrm1ValuerValuerPhone() {
        return outGrpValuersOutGrm1ValuerValuerPhone;
    }

    /**
     * Sets the value of the outGrpValuersOutGrm1ValuerValuerPhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpValuersOutGrm1ValuerValuerPhone(String value) {
        this.outGrpValuersOutGrm1ValuerValuerPhone = value;
    }

    /**
     * Gets the value of the outGrpValuersOutGrm1ValuerValuerMobile property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpValuersOutGrm1ValuerValuerMobile() {
        return outGrpValuersOutGrm1ValuerValuerMobile;
    }

    /**
     * Sets the value of the outGrpValuersOutGrm1ValuerValuerMobile property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpValuersOutGrm1ValuerValuerMobile(String value) {
        this.outGrpValuersOutGrm1ValuerValuerMobile = value;
    }

    /**
     * Gets the value of the outGrpValuersOutGrm1ValuerValuerAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpValuersOutGrm1ValuerValuerAddress() {
        return outGrpValuersOutGrm1ValuerValuerAddress;
    }

    /**
     * Sets the value of the outGrpValuersOutGrm1ValuerValuerAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpValuersOutGrm1ValuerValuerAddress(String value) {
        this.outGrpValuersOutGrm1ValuerValuerAddress = value;
    }

    /**
     * Gets the value of the outGrpValuersOutGrm1ValuerValuerEmail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpValuersOutGrm1ValuerValuerEmail() {
        return outGrpValuersOutGrm1ValuerValuerEmail;
    }

    /**
     * Sets the value of the outGrpValuersOutGrm1ValuerValuerEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpValuersOutGrm1ValuerValuerEmail(String value) {
        this.outGrpValuersOutGrm1ValuerValuerEmail = value;
    }

    /**
     * Gets the value of the outGrpValuersOutGrm1ValuerEntryStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpValuersOutGrm1ValuerEntryStatus() {
        return outGrpValuersOutGrm1ValuerEntryStatus;
    }

    /**
     * Sets the value of the outGrpValuersOutGrm1ValuerEntryStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpValuersOutGrm1ValuerEntryStatus(String value) {
        this.outGrpValuersOutGrm1ValuerEntryStatus = value;
    }

    /**
     * Gets the value of the outGrpValuersOutGrm1ValTypeIefSuppliedChar20 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpValuersOutGrm1ValTypeIefSuppliedChar20() {
        return outGrpValuersOutGrm1ValTypeIefSuppliedChar20;
    }

    /**
     * Sets the value of the outGrpValuersOutGrm1ValTypeIefSuppliedChar20 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpValuersOutGrm1ValTypeIefSuppliedChar20(String value) {
        this.outGrpValuersOutGrm1ValTypeIefSuppliedChar20 = value;
    }

    /**
     * Gets the value of the outGrpValuersOutGrm1BeBankemployeeId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpValuersOutGrm1BeBankemployeeId() {
        return outGrpValuersOutGrm1BeBankemployeeId;
    }

    /**
     * Sets the value of the outGrpValuersOutGrm1BeBankemployeeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpValuersOutGrm1BeBankemployeeId(String value) {
        this.outGrpValuersOutGrm1BeBankemployeeId = value;
    }

}
