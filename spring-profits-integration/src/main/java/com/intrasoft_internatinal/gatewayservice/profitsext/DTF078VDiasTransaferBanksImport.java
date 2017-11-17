
package com.intrasoft_internatinal.gatewayservice.profitsext;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DTF078V_DiasTransaferBanksImport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DTF078V_DiasTransaferBanksImport">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}BaseImport">
 *       &lt;sequence>
 *         &lt;element name="InActionIefSuppliedCommand" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InFilterFrtSwiftAddressCsmCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InFilterFrtSwiftAddressProduct" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InFilterFrtSwiftAddressParticipantBank" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InFilterFrtSwiftAddressParticipantBankCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InFilterFrtSwiftAddressCountryOfBank" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InLastAutomoreFrtSwiftAddressCsmCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InLastAutomoreFrtSwiftAddressProduct" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InLastAutomoreFrtSwiftAddressParticipantBank" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DTF078V_DiasTransaferBanksImport", propOrder = {
    "inActionIefSuppliedCommand",
    "inFilterFrtSwiftAddressCsmCode",
    "inFilterFrtSwiftAddressProduct",
    "inFilterFrtSwiftAddressParticipantBank",
    "inFilterFrtSwiftAddressParticipantBankCode",
    "inFilterFrtSwiftAddressCountryOfBank",
    "inLastAutomoreFrtSwiftAddressCsmCode",
    "inLastAutomoreFrtSwiftAddressProduct",
    "inLastAutomoreFrtSwiftAddressParticipantBank"
})
public class DTF078VDiasTransaferBanksImport
    extends BaseImport
{

    @XmlElement(name = "InActionIefSuppliedCommand")
    protected String inActionIefSuppliedCommand;
    @XmlElement(name = "InFilterFrtSwiftAddressCsmCode")
    protected String inFilterFrtSwiftAddressCsmCode;
    @XmlElement(name = "InFilterFrtSwiftAddressProduct")
    protected String inFilterFrtSwiftAddressProduct;
    @XmlElement(name = "InFilterFrtSwiftAddressParticipantBank")
    protected String inFilterFrtSwiftAddressParticipantBank;
    @XmlElement(name = "InFilterFrtSwiftAddressParticipantBankCode")
    protected String inFilterFrtSwiftAddressParticipantBankCode;
    @XmlElement(name = "InFilterFrtSwiftAddressCountryOfBank")
    protected String inFilterFrtSwiftAddressCountryOfBank;
    @XmlElement(name = "InLastAutomoreFrtSwiftAddressCsmCode")
    protected String inLastAutomoreFrtSwiftAddressCsmCode;
    @XmlElement(name = "InLastAutomoreFrtSwiftAddressProduct")
    protected String inLastAutomoreFrtSwiftAddressProduct;
    @XmlElement(name = "InLastAutomoreFrtSwiftAddressParticipantBank")
    protected String inLastAutomoreFrtSwiftAddressParticipantBank;

    /**
     * Gets the value of the inActionIefSuppliedCommand property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInActionIefSuppliedCommand() {
        return inActionIefSuppliedCommand;
    }

    /**
     * Sets the value of the inActionIefSuppliedCommand property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInActionIefSuppliedCommand(String value) {
        this.inActionIefSuppliedCommand = value;
    }

    /**
     * Gets the value of the inFilterFrtSwiftAddressCsmCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInFilterFrtSwiftAddressCsmCode() {
        return inFilterFrtSwiftAddressCsmCode;
    }

    /**
     * Sets the value of the inFilterFrtSwiftAddressCsmCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInFilterFrtSwiftAddressCsmCode(String value) {
        this.inFilterFrtSwiftAddressCsmCode = value;
    }

    /**
     * Gets the value of the inFilterFrtSwiftAddressProduct property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInFilterFrtSwiftAddressProduct() {
        return inFilterFrtSwiftAddressProduct;
    }

    /**
     * Sets the value of the inFilterFrtSwiftAddressProduct property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInFilterFrtSwiftAddressProduct(String value) {
        this.inFilterFrtSwiftAddressProduct = value;
    }

    /**
     * Gets the value of the inFilterFrtSwiftAddressParticipantBank property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInFilterFrtSwiftAddressParticipantBank() {
        return inFilterFrtSwiftAddressParticipantBank;
    }

    /**
     * Sets the value of the inFilterFrtSwiftAddressParticipantBank property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInFilterFrtSwiftAddressParticipantBank(String value) {
        this.inFilterFrtSwiftAddressParticipantBank = value;
    }

    /**
     * Gets the value of the inFilterFrtSwiftAddressParticipantBankCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInFilterFrtSwiftAddressParticipantBankCode() {
        return inFilterFrtSwiftAddressParticipantBankCode;
    }

    /**
     * Sets the value of the inFilterFrtSwiftAddressParticipantBankCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInFilterFrtSwiftAddressParticipantBankCode(String value) {
        this.inFilterFrtSwiftAddressParticipantBankCode = value;
    }

    /**
     * Gets the value of the inFilterFrtSwiftAddressCountryOfBank property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInFilterFrtSwiftAddressCountryOfBank() {
        return inFilterFrtSwiftAddressCountryOfBank;
    }

    /**
     * Sets the value of the inFilterFrtSwiftAddressCountryOfBank property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInFilterFrtSwiftAddressCountryOfBank(String value) {
        this.inFilterFrtSwiftAddressCountryOfBank = value;
    }

    /**
     * Gets the value of the inLastAutomoreFrtSwiftAddressCsmCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInLastAutomoreFrtSwiftAddressCsmCode() {
        return inLastAutomoreFrtSwiftAddressCsmCode;
    }

    /**
     * Sets the value of the inLastAutomoreFrtSwiftAddressCsmCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInLastAutomoreFrtSwiftAddressCsmCode(String value) {
        this.inLastAutomoreFrtSwiftAddressCsmCode = value;
    }

    /**
     * Gets the value of the inLastAutomoreFrtSwiftAddressProduct property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInLastAutomoreFrtSwiftAddressProduct() {
        return inLastAutomoreFrtSwiftAddressProduct;
    }

    /**
     * Sets the value of the inLastAutomoreFrtSwiftAddressProduct property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInLastAutomoreFrtSwiftAddressProduct(String value) {
        this.inLastAutomoreFrtSwiftAddressProduct = value;
    }

    /**
     * Gets the value of the inLastAutomoreFrtSwiftAddressParticipantBank property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInLastAutomoreFrtSwiftAddressParticipantBank() {
        return inLastAutomoreFrtSwiftAddressParticipantBank;
    }

    /**
     * Sets the value of the inLastAutomoreFrtSwiftAddressParticipantBank property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInLastAutomoreFrtSwiftAddressParticipantBank(String value) {
        this.inLastAutomoreFrtSwiftAddressParticipantBank = value;
    }

}
