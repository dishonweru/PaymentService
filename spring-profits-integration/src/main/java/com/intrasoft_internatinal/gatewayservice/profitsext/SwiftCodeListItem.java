
package com.intrasoft_internatinal.gatewayservice.profitsext;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SwiftCodeListItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SwiftCodeListItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Country" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CentralBank" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Prefix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Bic" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SwiftConnFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BankDescr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BankDept" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="City" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SubInfo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ValueAdded1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ValueAdded2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Address" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Location" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Address2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Address3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ZipCodeTown" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Pob" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ExtraAddrInfo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Country2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SwiftCodeListItem", propOrder = {
    "country",
    "centralBank",
    "prefix",
    "bic",
    "swiftConnFlag",
    "bankDescr",
    "bankDept",
    "city",
    "subInfo",
    "valueAdded1",
    "valueAdded2",
    "address",
    "location",
    "address2",
    "address3",
    "zipCodeTown",
    "pob",
    "extraAddrInfo",
    "country2"
})
public class SwiftCodeListItem {

    @XmlElement(name = "Country")
    protected String country;
    @XmlElement(name = "CentralBank")
    protected String centralBank;
    @XmlElement(name = "Prefix")
    protected String prefix;
    @XmlElement(name = "Bic")
    protected String bic;
    @XmlElement(name = "SwiftConnFlag")
    protected String swiftConnFlag;
    @XmlElement(name = "BankDescr")
    protected String bankDescr;
    @XmlElement(name = "BankDept")
    protected String bankDept;
    @XmlElement(name = "City")
    protected String city;
    @XmlElement(name = "SubInfo")
    protected String subInfo;
    @XmlElement(name = "ValueAdded1")
    protected String valueAdded1;
    @XmlElement(name = "ValueAdded2")
    protected String valueAdded2;
    @XmlElement(name = "Address")
    protected String address;
    @XmlElement(name = "Location")
    protected String location;
    @XmlElement(name = "Address2")
    protected String address2;
    @XmlElement(name = "Address3")
    protected String address3;
    @XmlElement(name = "ZipCodeTown")
    protected String zipCodeTown;
    @XmlElement(name = "Pob")
    protected String pob;
    @XmlElement(name = "ExtraAddrInfo")
    protected String extraAddrInfo;
    @XmlElement(name = "Country2")
    protected String country2;

    /**
     * Gets the value of the country property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountry() {
        return country;
    }

    /**
     * Sets the value of the country property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountry(String value) {
        this.country = value;
    }

    /**
     * Gets the value of the centralBank property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCentralBank() {
        return centralBank;
    }

    /**
     * Sets the value of the centralBank property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCentralBank(String value) {
        this.centralBank = value;
    }

    /**
     * Gets the value of the prefix property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrefix() {
        return prefix;
    }

    /**
     * Sets the value of the prefix property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrefix(String value) {
        this.prefix = value;
    }

    /**
     * Gets the value of the bic property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBic() {
        return bic;
    }

    /**
     * Sets the value of the bic property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBic(String value) {
        this.bic = value;
    }

    /**
     * Gets the value of the swiftConnFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSwiftConnFlag() {
        return swiftConnFlag;
    }

    /**
     * Sets the value of the swiftConnFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSwiftConnFlag(String value) {
        this.swiftConnFlag = value;
    }

    /**
     * Gets the value of the bankDescr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankDescr() {
        return bankDescr;
    }

    /**
     * Sets the value of the bankDescr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankDescr(String value) {
        this.bankDescr = value;
    }

    /**
     * Gets the value of the bankDept property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankDept() {
        return bankDept;
    }

    /**
     * Sets the value of the bankDept property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankDept(String value) {
        this.bankDept = value;
    }

    /**
     * Gets the value of the city property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCity() {
        return city;
    }

    /**
     * Sets the value of the city property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCity(String value) {
        this.city = value;
    }

    /**
     * Gets the value of the subInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubInfo() {
        return subInfo;
    }

    /**
     * Sets the value of the subInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubInfo(String value) {
        this.subInfo = value;
    }

    /**
     * Gets the value of the valueAdded1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValueAdded1() {
        return valueAdded1;
    }

    /**
     * Sets the value of the valueAdded1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValueAdded1(String value) {
        this.valueAdded1 = value;
    }

    /**
     * Gets the value of the valueAdded2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValueAdded2() {
        return valueAdded2;
    }

    /**
     * Sets the value of the valueAdded2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValueAdded2(String value) {
        this.valueAdded2 = value;
    }

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddress(String value) {
        this.address = value;
    }

    /**
     * Gets the value of the location property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocation() {
        return location;
    }

    /**
     * Sets the value of the location property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocation(String value) {
        this.location = value;
    }

    /**
     * Gets the value of the address2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddress2() {
        return address2;
    }

    /**
     * Sets the value of the address2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddress2(String value) {
        this.address2 = value;
    }

    /**
     * Gets the value of the address3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddress3() {
        return address3;
    }

    /**
     * Sets the value of the address3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddress3(String value) {
        this.address3 = value;
    }

    /**
     * Gets the value of the zipCodeTown property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZipCodeTown() {
        return zipCodeTown;
    }

    /**
     * Sets the value of the zipCodeTown property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZipCodeTown(String value) {
        this.zipCodeTown = value;
    }

    /**
     * Gets the value of the pob property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPob() {
        return pob;
    }

    /**
     * Sets the value of the pob property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPob(String value) {
        this.pob = value;
    }

    /**
     * Gets the value of the extraAddrInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtraAddrInfo() {
        return extraAddrInfo;
    }

    /**
     * Sets the value of the extraAddrInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtraAddrInfo(String value) {
        this.extraAddrInfo = value;
    }

    /**
     * Gets the value of the country2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountry2() {
        return country2;
    }

    /**
     * Sets the value of the country2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountry2(String value) {
        this.country2 = value;
    }

}
