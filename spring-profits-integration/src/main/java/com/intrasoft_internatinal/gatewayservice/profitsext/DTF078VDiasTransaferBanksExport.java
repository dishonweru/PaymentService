
package com.intrasoft_internatinal.gatewayservice.profitsext;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DTF078V_DiasTransaferBanksExport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DTF078V_DiasTransaferBanksExport">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}BaseExport">
 *       &lt;sequence>
 *         &lt;element name="OutCountryCodeIefSuppliedChar2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutLastAutomoreFrtSwiftAddressCsmCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutLastAutomoreFrtSwiftAddressProduct" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutLastAutomoreFrtSwiftAddressParticipantBank" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutProfitsBicFrtSwiftAddressParticipantBank" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSelectedFrtSwiftAddressCsmCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSelectedFrtSwiftAddressCsmName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSelectedFrtSwiftAddressProduct" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSelectedFrtSwiftAddressParticipantBank" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSelectedFrtSwiftAddressParticipantBankCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSelectedFrtSwiftAddressBankName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSelectedFrtSwiftAddressCountryOfBank" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSelectedFrtSwiftAddressSettlementBank" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSelectedFrtSwiftAddressLatestCutoff" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutSelectedFrtSwiftAddressNationalCharSet" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpFrtAddress" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}ArrayOfDTF078VOutGrpFrtAddressItem" minOccurs="0"/>
 *         &lt;element name="OutGrpClearingSystem" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}ArrayOfDTF078VOutGrpClearingSystemItem" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DTF078V_DiasTransaferBanksExport", propOrder = {
    "outCountryCodeIefSuppliedChar2",
    "outLastAutomoreFrtSwiftAddressCsmCode",
    "outLastAutomoreFrtSwiftAddressProduct",
    "outLastAutomoreFrtSwiftAddressParticipantBank",
    "outProfitsBicFrtSwiftAddressParticipantBank",
    "outSelectedFrtSwiftAddressCsmCode",
    "outSelectedFrtSwiftAddressCsmName",
    "outSelectedFrtSwiftAddressProduct",
    "outSelectedFrtSwiftAddressParticipantBank",
    "outSelectedFrtSwiftAddressParticipantBankCode",
    "outSelectedFrtSwiftAddressBankName",
    "outSelectedFrtSwiftAddressCountryOfBank",
    "outSelectedFrtSwiftAddressSettlementBank",
    "outSelectedFrtSwiftAddressLatestCutoff",
    "outSelectedFrtSwiftAddressNationalCharSet",
    "outGrpFrtAddress",
    "outGrpClearingSystem"
})
public class DTF078VDiasTransaferBanksExport
    extends BaseExport
{

    @XmlElement(name = "OutCountryCodeIefSuppliedChar2")
    protected String outCountryCodeIefSuppliedChar2;
    @XmlElement(name = "OutLastAutomoreFrtSwiftAddressCsmCode")
    protected String outLastAutomoreFrtSwiftAddressCsmCode;
    @XmlElement(name = "OutLastAutomoreFrtSwiftAddressProduct")
    protected String outLastAutomoreFrtSwiftAddressProduct;
    @XmlElement(name = "OutLastAutomoreFrtSwiftAddressParticipantBank")
    protected String outLastAutomoreFrtSwiftAddressParticipantBank;
    @XmlElement(name = "OutProfitsBicFrtSwiftAddressParticipantBank")
    protected String outProfitsBicFrtSwiftAddressParticipantBank;
    @XmlElement(name = "OutSelectedFrtSwiftAddressCsmCode")
    protected String outSelectedFrtSwiftAddressCsmCode;
    @XmlElement(name = "OutSelectedFrtSwiftAddressCsmName")
    protected String outSelectedFrtSwiftAddressCsmName;
    @XmlElement(name = "OutSelectedFrtSwiftAddressProduct")
    protected String outSelectedFrtSwiftAddressProduct;
    @XmlElement(name = "OutSelectedFrtSwiftAddressParticipantBank")
    protected String outSelectedFrtSwiftAddressParticipantBank;
    @XmlElement(name = "OutSelectedFrtSwiftAddressParticipantBankCode")
    protected String outSelectedFrtSwiftAddressParticipantBankCode;
    @XmlElement(name = "OutSelectedFrtSwiftAddressBankName")
    protected String outSelectedFrtSwiftAddressBankName;
    @XmlElement(name = "OutSelectedFrtSwiftAddressCountryOfBank")
    protected String outSelectedFrtSwiftAddressCountryOfBank;
    @XmlElement(name = "OutSelectedFrtSwiftAddressSettlementBank")
    protected String outSelectedFrtSwiftAddressSettlementBank;
    @XmlElement(name = "OutSelectedFrtSwiftAddressLatestCutoff")
    protected short outSelectedFrtSwiftAddressLatestCutoff;
    @XmlElement(name = "OutSelectedFrtSwiftAddressNationalCharSet")
    protected String outSelectedFrtSwiftAddressNationalCharSet;
    @XmlElement(name = "OutGrpFrtAddress")
    protected ArrayOfDTF078VOutGrpFrtAddressItem outGrpFrtAddress;
    @XmlElement(name = "OutGrpClearingSystem")
    protected ArrayOfDTF078VOutGrpClearingSystemItem outGrpClearingSystem;

    /**
     * Gets the value of the outCountryCodeIefSuppliedChar2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCountryCodeIefSuppliedChar2() {
        return outCountryCodeIefSuppliedChar2;
    }

    /**
     * Sets the value of the outCountryCodeIefSuppliedChar2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCountryCodeIefSuppliedChar2(String value) {
        this.outCountryCodeIefSuppliedChar2 = value;
    }

    /**
     * Gets the value of the outLastAutomoreFrtSwiftAddressCsmCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutLastAutomoreFrtSwiftAddressCsmCode() {
        return outLastAutomoreFrtSwiftAddressCsmCode;
    }

    /**
     * Sets the value of the outLastAutomoreFrtSwiftAddressCsmCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutLastAutomoreFrtSwiftAddressCsmCode(String value) {
        this.outLastAutomoreFrtSwiftAddressCsmCode = value;
    }

    /**
     * Gets the value of the outLastAutomoreFrtSwiftAddressProduct property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutLastAutomoreFrtSwiftAddressProduct() {
        return outLastAutomoreFrtSwiftAddressProduct;
    }

    /**
     * Sets the value of the outLastAutomoreFrtSwiftAddressProduct property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutLastAutomoreFrtSwiftAddressProduct(String value) {
        this.outLastAutomoreFrtSwiftAddressProduct = value;
    }

    /**
     * Gets the value of the outLastAutomoreFrtSwiftAddressParticipantBank property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutLastAutomoreFrtSwiftAddressParticipantBank() {
        return outLastAutomoreFrtSwiftAddressParticipantBank;
    }

    /**
     * Sets the value of the outLastAutomoreFrtSwiftAddressParticipantBank property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutLastAutomoreFrtSwiftAddressParticipantBank(String value) {
        this.outLastAutomoreFrtSwiftAddressParticipantBank = value;
    }

    /**
     * Gets the value of the outProfitsBicFrtSwiftAddressParticipantBank property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutProfitsBicFrtSwiftAddressParticipantBank() {
        return outProfitsBicFrtSwiftAddressParticipantBank;
    }

    /**
     * Sets the value of the outProfitsBicFrtSwiftAddressParticipantBank property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutProfitsBicFrtSwiftAddressParticipantBank(String value) {
        this.outProfitsBicFrtSwiftAddressParticipantBank = value;
    }

    /**
     * Gets the value of the outSelectedFrtSwiftAddressCsmCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSelectedFrtSwiftAddressCsmCode() {
        return outSelectedFrtSwiftAddressCsmCode;
    }

    /**
     * Sets the value of the outSelectedFrtSwiftAddressCsmCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSelectedFrtSwiftAddressCsmCode(String value) {
        this.outSelectedFrtSwiftAddressCsmCode = value;
    }

    /**
     * Gets the value of the outSelectedFrtSwiftAddressCsmName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSelectedFrtSwiftAddressCsmName() {
        return outSelectedFrtSwiftAddressCsmName;
    }

    /**
     * Sets the value of the outSelectedFrtSwiftAddressCsmName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSelectedFrtSwiftAddressCsmName(String value) {
        this.outSelectedFrtSwiftAddressCsmName = value;
    }

    /**
     * Gets the value of the outSelectedFrtSwiftAddressProduct property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSelectedFrtSwiftAddressProduct() {
        return outSelectedFrtSwiftAddressProduct;
    }

    /**
     * Sets the value of the outSelectedFrtSwiftAddressProduct property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSelectedFrtSwiftAddressProduct(String value) {
        this.outSelectedFrtSwiftAddressProduct = value;
    }

    /**
     * Gets the value of the outSelectedFrtSwiftAddressParticipantBank property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSelectedFrtSwiftAddressParticipantBank() {
        return outSelectedFrtSwiftAddressParticipantBank;
    }

    /**
     * Sets the value of the outSelectedFrtSwiftAddressParticipantBank property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSelectedFrtSwiftAddressParticipantBank(String value) {
        this.outSelectedFrtSwiftAddressParticipantBank = value;
    }

    /**
     * Gets the value of the outSelectedFrtSwiftAddressParticipantBankCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSelectedFrtSwiftAddressParticipantBankCode() {
        return outSelectedFrtSwiftAddressParticipantBankCode;
    }

    /**
     * Sets the value of the outSelectedFrtSwiftAddressParticipantBankCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSelectedFrtSwiftAddressParticipantBankCode(String value) {
        this.outSelectedFrtSwiftAddressParticipantBankCode = value;
    }

    /**
     * Gets the value of the outSelectedFrtSwiftAddressBankName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSelectedFrtSwiftAddressBankName() {
        return outSelectedFrtSwiftAddressBankName;
    }

    /**
     * Sets the value of the outSelectedFrtSwiftAddressBankName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSelectedFrtSwiftAddressBankName(String value) {
        this.outSelectedFrtSwiftAddressBankName = value;
    }

    /**
     * Gets the value of the outSelectedFrtSwiftAddressCountryOfBank property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSelectedFrtSwiftAddressCountryOfBank() {
        return outSelectedFrtSwiftAddressCountryOfBank;
    }

    /**
     * Sets the value of the outSelectedFrtSwiftAddressCountryOfBank property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSelectedFrtSwiftAddressCountryOfBank(String value) {
        this.outSelectedFrtSwiftAddressCountryOfBank = value;
    }

    /**
     * Gets the value of the outSelectedFrtSwiftAddressSettlementBank property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSelectedFrtSwiftAddressSettlementBank() {
        return outSelectedFrtSwiftAddressSettlementBank;
    }

    /**
     * Sets the value of the outSelectedFrtSwiftAddressSettlementBank property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSelectedFrtSwiftAddressSettlementBank(String value) {
        this.outSelectedFrtSwiftAddressSettlementBank = value;
    }

    /**
     * Gets the value of the outSelectedFrtSwiftAddressLatestCutoff property.
     * 
     */
    public short getOutSelectedFrtSwiftAddressLatestCutoff() {
        return outSelectedFrtSwiftAddressLatestCutoff;
    }

    /**
     * Sets the value of the outSelectedFrtSwiftAddressLatestCutoff property.
     * 
     */
    public void setOutSelectedFrtSwiftAddressLatestCutoff(short value) {
        this.outSelectedFrtSwiftAddressLatestCutoff = value;
    }

    /**
     * Gets the value of the outSelectedFrtSwiftAddressNationalCharSet property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSelectedFrtSwiftAddressNationalCharSet() {
        return outSelectedFrtSwiftAddressNationalCharSet;
    }

    /**
     * Sets the value of the outSelectedFrtSwiftAddressNationalCharSet property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSelectedFrtSwiftAddressNationalCharSet(String value) {
        this.outSelectedFrtSwiftAddressNationalCharSet = value;
    }

    /**
     * Gets the value of the outGrpFrtAddress property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDTF078VOutGrpFrtAddressItem }
     *     
     */
    public ArrayOfDTF078VOutGrpFrtAddressItem getOutGrpFrtAddress() {
        return outGrpFrtAddress;
    }

    /**
     * Sets the value of the outGrpFrtAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDTF078VOutGrpFrtAddressItem }
     *     
     */
    public void setOutGrpFrtAddress(ArrayOfDTF078VOutGrpFrtAddressItem value) {
        this.outGrpFrtAddress = value;
    }

    /**
     * Gets the value of the outGrpClearingSystem property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDTF078VOutGrpClearingSystemItem }
     *     
     */
    public ArrayOfDTF078VOutGrpClearingSystemItem getOutGrpClearingSystem() {
        return outGrpClearingSystem;
    }

    /**
     * Sets the value of the outGrpClearingSystem property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDTF078VOutGrpClearingSystemItem }
     *     
     */
    public void setOutGrpClearingSystem(ArrayOfDTF078VOutGrpClearingSystemItem value) {
        this.outGrpClearingSystem = value;
    }

}
