
package com.intrasoft_internatinal.gatewayservice.profitsext;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DTF078VOutGrpFrtAddressItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DTF078VOutGrpFrtAddressItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OutGrpFrtAddressOutGrmFrtAddressFrtSwiftAddressParticipantBank" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpFrtAddressOutGrmFrtAddressFrtSwiftAddressParticipantBankCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpFrtAddressOutGrmFrtAddressFrtSwiftAddressBankName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpFrtAddressOutGrmFrtAddressFrtSwiftAddressCountryOfBank" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpFrtAddressOutGrmFrtAddressFrtSwiftAddressSettlementBank" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpFrtAddressOutGrmFrtAddressFrtSwiftAddressProduct" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpFrtAddressOutGrmCountryGenericDetailDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpFrtAddressOutGrmFrtAddressIefSuppliedSelectChar" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DTF078VOutGrpFrtAddressItem", propOrder = {
    "outGrpFrtAddressOutGrmFrtAddressFrtSwiftAddressParticipantBank",
    "outGrpFrtAddressOutGrmFrtAddressFrtSwiftAddressParticipantBankCode",
    "outGrpFrtAddressOutGrmFrtAddressFrtSwiftAddressBankName",
    "outGrpFrtAddressOutGrmFrtAddressFrtSwiftAddressCountryOfBank",
    "outGrpFrtAddressOutGrmFrtAddressFrtSwiftAddressSettlementBank",
    "outGrpFrtAddressOutGrmFrtAddressFrtSwiftAddressProduct",
    "outGrpFrtAddressOutGrmCountryGenericDetailDescription",
    "outGrpFrtAddressOutGrmFrtAddressIefSuppliedSelectChar"
})
public class DTF078VOutGrpFrtAddressItem {

    @XmlElement(name = "OutGrpFrtAddressOutGrmFrtAddressFrtSwiftAddressParticipantBank")
    protected String outGrpFrtAddressOutGrmFrtAddressFrtSwiftAddressParticipantBank;
    @XmlElement(name = "OutGrpFrtAddressOutGrmFrtAddressFrtSwiftAddressParticipantBankCode")
    protected String outGrpFrtAddressOutGrmFrtAddressFrtSwiftAddressParticipantBankCode;
    @XmlElement(name = "OutGrpFrtAddressOutGrmFrtAddressFrtSwiftAddressBankName")
    protected String outGrpFrtAddressOutGrmFrtAddressFrtSwiftAddressBankName;
    @XmlElement(name = "OutGrpFrtAddressOutGrmFrtAddressFrtSwiftAddressCountryOfBank")
    protected String outGrpFrtAddressOutGrmFrtAddressFrtSwiftAddressCountryOfBank;
    @XmlElement(name = "OutGrpFrtAddressOutGrmFrtAddressFrtSwiftAddressSettlementBank")
    protected String outGrpFrtAddressOutGrmFrtAddressFrtSwiftAddressSettlementBank;
    @XmlElement(name = "OutGrpFrtAddressOutGrmFrtAddressFrtSwiftAddressProduct")
    protected String outGrpFrtAddressOutGrmFrtAddressFrtSwiftAddressProduct;
    @XmlElement(name = "OutGrpFrtAddressOutGrmCountryGenericDetailDescription")
    protected String outGrpFrtAddressOutGrmCountryGenericDetailDescription;
    @XmlElement(name = "OutGrpFrtAddressOutGrmFrtAddressIefSuppliedSelectChar")
    protected String outGrpFrtAddressOutGrmFrtAddressIefSuppliedSelectChar;

    /**
     * Gets the value of the outGrpFrtAddressOutGrmFrtAddressFrtSwiftAddressParticipantBank property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpFrtAddressOutGrmFrtAddressFrtSwiftAddressParticipantBank() {
        return outGrpFrtAddressOutGrmFrtAddressFrtSwiftAddressParticipantBank;
    }

    /**
     * Sets the value of the outGrpFrtAddressOutGrmFrtAddressFrtSwiftAddressParticipantBank property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpFrtAddressOutGrmFrtAddressFrtSwiftAddressParticipantBank(String value) {
        this.outGrpFrtAddressOutGrmFrtAddressFrtSwiftAddressParticipantBank = value;
    }

    /**
     * Gets the value of the outGrpFrtAddressOutGrmFrtAddressFrtSwiftAddressParticipantBankCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpFrtAddressOutGrmFrtAddressFrtSwiftAddressParticipantBankCode() {
        return outGrpFrtAddressOutGrmFrtAddressFrtSwiftAddressParticipantBankCode;
    }

    /**
     * Sets the value of the outGrpFrtAddressOutGrmFrtAddressFrtSwiftAddressParticipantBankCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpFrtAddressOutGrmFrtAddressFrtSwiftAddressParticipantBankCode(String value) {
        this.outGrpFrtAddressOutGrmFrtAddressFrtSwiftAddressParticipantBankCode = value;
    }

    /**
     * Gets the value of the outGrpFrtAddressOutGrmFrtAddressFrtSwiftAddressBankName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpFrtAddressOutGrmFrtAddressFrtSwiftAddressBankName() {
        return outGrpFrtAddressOutGrmFrtAddressFrtSwiftAddressBankName;
    }

    /**
     * Sets the value of the outGrpFrtAddressOutGrmFrtAddressFrtSwiftAddressBankName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpFrtAddressOutGrmFrtAddressFrtSwiftAddressBankName(String value) {
        this.outGrpFrtAddressOutGrmFrtAddressFrtSwiftAddressBankName = value;
    }

    /**
     * Gets the value of the outGrpFrtAddressOutGrmFrtAddressFrtSwiftAddressCountryOfBank property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpFrtAddressOutGrmFrtAddressFrtSwiftAddressCountryOfBank() {
        return outGrpFrtAddressOutGrmFrtAddressFrtSwiftAddressCountryOfBank;
    }

    /**
     * Sets the value of the outGrpFrtAddressOutGrmFrtAddressFrtSwiftAddressCountryOfBank property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpFrtAddressOutGrmFrtAddressFrtSwiftAddressCountryOfBank(String value) {
        this.outGrpFrtAddressOutGrmFrtAddressFrtSwiftAddressCountryOfBank = value;
    }

    /**
     * Gets the value of the outGrpFrtAddressOutGrmFrtAddressFrtSwiftAddressSettlementBank property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpFrtAddressOutGrmFrtAddressFrtSwiftAddressSettlementBank() {
        return outGrpFrtAddressOutGrmFrtAddressFrtSwiftAddressSettlementBank;
    }

    /**
     * Sets the value of the outGrpFrtAddressOutGrmFrtAddressFrtSwiftAddressSettlementBank property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpFrtAddressOutGrmFrtAddressFrtSwiftAddressSettlementBank(String value) {
        this.outGrpFrtAddressOutGrmFrtAddressFrtSwiftAddressSettlementBank = value;
    }

    /**
     * Gets the value of the outGrpFrtAddressOutGrmFrtAddressFrtSwiftAddressProduct property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpFrtAddressOutGrmFrtAddressFrtSwiftAddressProduct() {
        return outGrpFrtAddressOutGrmFrtAddressFrtSwiftAddressProduct;
    }

    /**
     * Sets the value of the outGrpFrtAddressOutGrmFrtAddressFrtSwiftAddressProduct property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpFrtAddressOutGrmFrtAddressFrtSwiftAddressProduct(String value) {
        this.outGrpFrtAddressOutGrmFrtAddressFrtSwiftAddressProduct = value;
    }

    /**
     * Gets the value of the outGrpFrtAddressOutGrmCountryGenericDetailDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpFrtAddressOutGrmCountryGenericDetailDescription() {
        return outGrpFrtAddressOutGrmCountryGenericDetailDescription;
    }

    /**
     * Sets the value of the outGrpFrtAddressOutGrmCountryGenericDetailDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpFrtAddressOutGrmCountryGenericDetailDescription(String value) {
        this.outGrpFrtAddressOutGrmCountryGenericDetailDescription = value;
    }

    /**
     * Gets the value of the outGrpFrtAddressOutGrmFrtAddressIefSuppliedSelectChar property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpFrtAddressOutGrmFrtAddressIefSuppliedSelectChar() {
        return outGrpFrtAddressOutGrmFrtAddressIefSuppliedSelectChar;
    }

    /**
     * Sets the value of the outGrpFrtAddressOutGrmFrtAddressIefSuppliedSelectChar property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpFrtAddressOutGrmFrtAddressIefSuppliedSelectChar(String value) {
        this.outGrpFrtAddressOutGrmFrtAddressIefSuppliedSelectChar = value;
    }

}
