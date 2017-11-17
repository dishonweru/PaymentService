
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DTF099V_ElectronicFundsTransferImport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DTF099V_ElectronicFundsTransferImport">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}BaseImport">
 *       &lt;sequence>
 *         &lt;element name="InCommandIefSuppliedCommand" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InIpsMessageHeaderBenefFullname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InIpsMessageHeaderIssuerCustId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InIpsMessageHeaderOrderAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InIpsMessageHeaderPrftAccSystem" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InIpsMessageHeaderPrftAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InIpsMessageHeaderCreditBicAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InIpsMessageHeaderGenericAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InIpsMessageHeaderIssuerFullname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InIpsMessageHeaderIssuerIbanAcc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InIpsMessageHeaderRemittanceInfo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InIpsMessageHeaderChargeBearer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InIpsMessageHeaderChargesAccSystem" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InIpsMessageHeaderChargesAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InIpsMessageHeaderChargesDiscount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InIpsMessageHeaderCommissionDiscount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InIpsMessageHeaderChargesJustific" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InIpsMessageHeaderComboJustific" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InIpsMessageHeaderComboTransaction" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InIpsMessageHeaderJustificId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InIpsMessageHeaderTrxCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InIpsMessageHeaderExpenseJustific" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InIpsMetadataDatafield1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InIpsMetadataDatafield2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InIpsMetadataDatafield3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InIpsMetadataDatafield4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InIpsMetadataDatafield5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InIpsMetadataDatafield6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InIpsOrganizationOrganizationCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InTerminalTerminalNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DTF099V_ElectronicFundsTransferImport", propOrder = {
    "inCommandIefSuppliedCommand",
    "inIpsMessageHeaderBenefFullname",
    "inIpsMessageHeaderIssuerCustId",
    "inIpsMessageHeaderOrderAmount",
    "inIpsMessageHeaderPrftAccSystem",
    "inIpsMessageHeaderPrftAccount",
    "inIpsMessageHeaderCreditBicAddress",
    "inIpsMessageHeaderGenericAccount",
    "inIpsMessageHeaderIssuerFullname",
    "inIpsMessageHeaderIssuerIbanAcc",
    "inIpsMessageHeaderRemittanceInfo",
    "inIpsMessageHeaderChargeBearer",
    "inIpsMessageHeaderChargesAccSystem",
    "inIpsMessageHeaderChargesAccount",
    "inIpsMessageHeaderChargesDiscount",
    "inIpsMessageHeaderCommissionDiscount",
    "inIpsMessageHeaderChargesJustific",
    "inIpsMessageHeaderComboJustific",
    "inIpsMessageHeaderComboTransaction",
    "inIpsMessageHeaderJustificId",
    "inIpsMessageHeaderTrxCode",
    "inIpsMessageHeaderExpenseJustific",
    "inIpsMetadataDatafield1",
    "inIpsMetadataDatafield2",
    "inIpsMetadataDatafield3",
    "inIpsMetadataDatafield4",
    "inIpsMetadataDatafield5",
    "inIpsMetadataDatafield6",
    "inIpsOrganizationOrganizationCode",
    "inTerminalTerminalNumber"
})
public class DTF099VElectronicFundsTransferImport
    extends BaseImport
{

    @XmlElement(name = "InCommandIefSuppliedCommand")
    protected String inCommandIefSuppliedCommand;
    @XmlElement(name = "InIpsMessageHeaderBenefFullname")
    protected String inIpsMessageHeaderBenefFullname;
    @XmlElement(name = "InIpsMessageHeaderIssuerCustId")
    protected int inIpsMessageHeaderIssuerCustId;
    @XmlElement(name = "InIpsMessageHeaderOrderAmount", required = true)
    protected BigDecimal inIpsMessageHeaderOrderAmount;
    @XmlElement(name = "InIpsMessageHeaderPrftAccSystem")
    protected short inIpsMessageHeaderPrftAccSystem;
    @XmlElement(name = "InIpsMessageHeaderPrftAccount")
    protected String inIpsMessageHeaderPrftAccount;
    @XmlElement(name = "InIpsMessageHeaderCreditBicAddress")
    protected String inIpsMessageHeaderCreditBicAddress;
    @XmlElement(name = "InIpsMessageHeaderGenericAccount")
    protected String inIpsMessageHeaderGenericAccount;
    @XmlElement(name = "InIpsMessageHeaderIssuerFullname")
    protected String inIpsMessageHeaderIssuerFullname;
    @XmlElement(name = "InIpsMessageHeaderIssuerIbanAcc")
    protected String inIpsMessageHeaderIssuerIbanAcc;
    @XmlElement(name = "InIpsMessageHeaderRemittanceInfo")
    protected String inIpsMessageHeaderRemittanceInfo;
    @XmlElement(name = "InIpsMessageHeaderChargeBearer")
    protected String inIpsMessageHeaderChargeBearer;
    @XmlElement(name = "InIpsMessageHeaderChargesAccSystem")
    protected short inIpsMessageHeaderChargesAccSystem;
    @XmlElement(name = "InIpsMessageHeaderChargesAccount")
    protected String inIpsMessageHeaderChargesAccount;
    @XmlElement(name = "InIpsMessageHeaderChargesDiscount", required = true)
    protected BigDecimal inIpsMessageHeaderChargesDiscount;
    @XmlElement(name = "InIpsMessageHeaderCommissionDiscount", required = true)
    protected BigDecimal inIpsMessageHeaderCommissionDiscount;
    @XmlElement(name = "InIpsMessageHeaderChargesJustific")
    protected int inIpsMessageHeaderChargesJustific;
    @XmlElement(name = "InIpsMessageHeaderComboJustific")
    protected int inIpsMessageHeaderComboJustific;
    @XmlElement(name = "InIpsMessageHeaderComboTransaction")
    protected int inIpsMessageHeaderComboTransaction;
    @XmlElement(name = "InIpsMessageHeaderJustificId")
    protected int inIpsMessageHeaderJustificId;
    @XmlElement(name = "InIpsMessageHeaderTrxCode")
    protected int inIpsMessageHeaderTrxCode;
    @XmlElement(name = "InIpsMessageHeaderExpenseJustific")
    protected int inIpsMessageHeaderExpenseJustific;
    @XmlElement(name = "InIpsMetadataDatafield1")
    protected String inIpsMetadataDatafield1;
    @XmlElement(name = "InIpsMetadataDatafield2")
    protected String inIpsMetadataDatafield2;
    @XmlElement(name = "InIpsMetadataDatafield3")
    protected String inIpsMetadataDatafield3;
    @XmlElement(name = "InIpsMetadataDatafield4")
    protected String inIpsMetadataDatafield4;
    @XmlElement(name = "InIpsMetadataDatafield5")
    protected String inIpsMetadataDatafield5;
    @XmlElement(name = "InIpsMetadataDatafield6")
    protected String inIpsMetadataDatafield6;
    @XmlElement(name = "InIpsOrganizationOrganizationCode")
    protected int inIpsOrganizationOrganizationCode;
    @XmlElement(name = "InTerminalTerminalNumber")
    protected String inTerminalTerminalNumber;

    /**
     * Gets the value of the inCommandIefSuppliedCommand property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCommandIefSuppliedCommand() {
        return inCommandIefSuppliedCommand;
    }

    /**
     * Sets the value of the inCommandIefSuppliedCommand property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCommandIefSuppliedCommand(String value) {
        this.inCommandIefSuppliedCommand = value;
    }

    /**
     * Gets the value of the inIpsMessageHeaderBenefFullname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInIpsMessageHeaderBenefFullname() {
        return inIpsMessageHeaderBenefFullname;
    }

    /**
     * Sets the value of the inIpsMessageHeaderBenefFullname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInIpsMessageHeaderBenefFullname(String value) {
        this.inIpsMessageHeaderBenefFullname = value;
    }

    /**
     * Gets the value of the inIpsMessageHeaderIssuerCustId property.
     * 
     */
    public int getInIpsMessageHeaderIssuerCustId() {
        return inIpsMessageHeaderIssuerCustId;
    }

    /**
     * Sets the value of the inIpsMessageHeaderIssuerCustId property.
     * 
     */
    public void setInIpsMessageHeaderIssuerCustId(int value) {
        this.inIpsMessageHeaderIssuerCustId = value;
    }

    /**
     * Gets the value of the inIpsMessageHeaderOrderAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInIpsMessageHeaderOrderAmount() {
        return inIpsMessageHeaderOrderAmount;
    }

    /**
     * Sets the value of the inIpsMessageHeaderOrderAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInIpsMessageHeaderOrderAmount(BigDecimal value) {
        this.inIpsMessageHeaderOrderAmount = value;
    }

    /**
     * Gets the value of the inIpsMessageHeaderPrftAccSystem property.
     * 
     */
    public short getInIpsMessageHeaderPrftAccSystem() {
        return inIpsMessageHeaderPrftAccSystem;
    }

    /**
     * Sets the value of the inIpsMessageHeaderPrftAccSystem property.
     * 
     */
    public void setInIpsMessageHeaderPrftAccSystem(short value) {
        this.inIpsMessageHeaderPrftAccSystem = value;
    }

    /**
     * Gets the value of the inIpsMessageHeaderPrftAccount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInIpsMessageHeaderPrftAccount() {
        return inIpsMessageHeaderPrftAccount;
    }

    /**
     * Sets the value of the inIpsMessageHeaderPrftAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInIpsMessageHeaderPrftAccount(String value) {
        this.inIpsMessageHeaderPrftAccount = value;
    }

    /**
     * Gets the value of the inIpsMessageHeaderCreditBicAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInIpsMessageHeaderCreditBicAddress() {
        return inIpsMessageHeaderCreditBicAddress;
    }

    /**
     * Sets the value of the inIpsMessageHeaderCreditBicAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInIpsMessageHeaderCreditBicAddress(String value) {
        this.inIpsMessageHeaderCreditBicAddress = value;
    }

    /**
     * Gets the value of the inIpsMessageHeaderGenericAccount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInIpsMessageHeaderGenericAccount() {
        return inIpsMessageHeaderGenericAccount;
    }

    /**
     * Sets the value of the inIpsMessageHeaderGenericAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInIpsMessageHeaderGenericAccount(String value) {
        this.inIpsMessageHeaderGenericAccount = value;
    }

    /**
     * Gets the value of the inIpsMessageHeaderIssuerFullname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInIpsMessageHeaderIssuerFullname() {
        return inIpsMessageHeaderIssuerFullname;
    }

    /**
     * Sets the value of the inIpsMessageHeaderIssuerFullname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInIpsMessageHeaderIssuerFullname(String value) {
        this.inIpsMessageHeaderIssuerFullname = value;
    }

    /**
     * Gets the value of the inIpsMessageHeaderIssuerIbanAcc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInIpsMessageHeaderIssuerIbanAcc() {
        return inIpsMessageHeaderIssuerIbanAcc;
    }

    /**
     * Sets the value of the inIpsMessageHeaderIssuerIbanAcc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInIpsMessageHeaderIssuerIbanAcc(String value) {
        this.inIpsMessageHeaderIssuerIbanAcc = value;
    }

    /**
     * Gets the value of the inIpsMessageHeaderRemittanceInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInIpsMessageHeaderRemittanceInfo() {
        return inIpsMessageHeaderRemittanceInfo;
    }

    /**
     * Sets the value of the inIpsMessageHeaderRemittanceInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInIpsMessageHeaderRemittanceInfo(String value) {
        this.inIpsMessageHeaderRemittanceInfo = value;
    }

    /**
     * Gets the value of the inIpsMessageHeaderChargeBearer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInIpsMessageHeaderChargeBearer() {
        return inIpsMessageHeaderChargeBearer;
    }

    /**
     * Sets the value of the inIpsMessageHeaderChargeBearer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInIpsMessageHeaderChargeBearer(String value) {
        this.inIpsMessageHeaderChargeBearer = value;
    }

    /**
     * Gets the value of the inIpsMessageHeaderChargesAccSystem property.
     * 
     */
    public short getInIpsMessageHeaderChargesAccSystem() {
        return inIpsMessageHeaderChargesAccSystem;
    }

    /**
     * Sets the value of the inIpsMessageHeaderChargesAccSystem property.
     * 
     */
    public void setInIpsMessageHeaderChargesAccSystem(short value) {
        this.inIpsMessageHeaderChargesAccSystem = value;
    }

    /**
     * Gets the value of the inIpsMessageHeaderChargesAccount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInIpsMessageHeaderChargesAccount() {
        return inIpsMessageHeaderChargesAccount;
    }

    /**
     * Sets the value of the inIpsMessageHeaderChargesAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInIpsMessageHeaderChargesAccount(String value) {
        this.inIpsMessageHeaderChargesAccount = value;
    }

    /**
     * Gets the value of the inIpsMessageHeaderChargesDiscount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInIpsMessageHeaderChargesDiscount() {
        return inIpsMessageHeaderChargesDiscount;
    }

    /**
     * Sets the value of the inIpsMessageHeaderChargesDiscount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInIpsMessageHeaderChargesDiscount(BigDecimal value) {
        this.inIpsMessageHeaderChargesDiscount = value;
    }

    /**
     * Gets the value of the inIpsMessageHeaderCommissionDiscount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInIpsMessageHeaderCommissionDiscount() {
        return inIpsMessageHeaderCommissionDiscount;
    }

    /**
     * Sets the value of the inIpsMessageHeaderCommissionDiscount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInIpsMessageHeaderCommissionDiscount(BigDecimal value) {
        this.inIpsMessageHeaderCommissionDiscount = value;
    }

    /**
     * Gets the value of the inIpsMessageHeaderChargesJustific property.
     * 
     */
    public int getInIpsMessageHeaderChargesJustific() {
        return inIpsMessageHeaderChargesJustific;
    }

    /**
     * Sets the value of the inIpsMessageHeaderChargesJustific property.
     * 
     */
    public void setInIpsMessageHeaderChargesJustific(int value) {
        this.inIpsMessageHeaderChargesJustific = value;
    }

    /**
     * Gets the value of the inIpsMessageHeaderComboJustific property.
     * 
     */
    public int getInIpsMessageHeaderComboJustific() {
        return inIpsMessageHeaderComboJustific;
    }

    /**
     * Sets the value of the inIpsMessageHeaderComboJustific property.
     * 
     */
    public void setInIpsMessageHeaderComboJustific(int value) {
        this.inIpsMessageHeaderComboJustific = value;
    }

    /**
     * Gets the value of the inIpsMessageHeaderComboTransaction property.
     * 
     */
    public int getInIpsMessageHeaderComboTransaction() {
        return inIpsMessageHeaderComboTransaction;
    }

    /**
     * Sets the value of the inIpsMessageHeaderComboTransaction property.
     * 
     */
    public void setInIpsMessageHeaderComboTransaction(int value) {
        this.inIpsMessageHeaderComboTransaction = value;
    }

    /**
     * Gets the value of the inIpsMessageHeaderJustificId property.
     * 
     */
    public int getInIpsMessageHeaderJustificId() {
        return inIpsMessageHeaderJustificId;
    }

    /**
     * Sets the value of the inIpsMessageHeaderJustificId property.
     * 
     */
    public void setInIpsMessageHeaderJustificId(int value) {
        this.inIpsMessageHeaderJustificId = value;
    }

    /**
     * Gets the value of the inIpsMessageHeaderTrxCode property.
     * 
     */
    public int getInIpsMessageHeaderTrxCode() {
        return inIpsMessageHeaderTrxCode;
    }

    /**
     * Sets the value of the inIpsMessageHeaderTrxCode property.
     * 
     */
    public void setInIpsMessageHeaderTrxCode(int value) {
        this.inIpsMessageHeaderTrxCode = value;
    }

    /**
     * Gets the value of the inIpsMessageHeaderExpenseJustific property.
     * 
     */
    public int getInIpsMessageHeaderExpenseJustific() {
        return inIpsMessageHeaderExpenseJustific;
    }

    /**
     * Sets the value of the inIpsMessageHeaderExpenseJustific property.
     * 
     */
    public void setInIpsMessageHeaderExpenseJustific(int value) {
        this.inIpsMessageHeaderExpenseJustific = value;
    }

    /**
     * Gets the value of the inIpsMetadataDatafield1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInIpsMetadataDatafield1() {
        return inIpsMetadataDatafield1;
    }

    /**
     * Sets the value of the inIpsMetadataDatafield1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInIpsMetadataDatafield1(String value) {
        this.inIpsMetadataDatafield1 = value;
    }

    /**
     * Gets the value of the inIpsMetadataDatafield2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInIpsMetadataDatafield2() {
        return inIpsMetadataDatafield2;
    }

    /**
     * Sets the value of the inIpsMetadataDatafield2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInIpsMetadataDatafield2(String value) {
        this.inIpsMetadataDatafield2 = value;
    }

    /**
     * Gets the value of the inIpsMetadataDatafield3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInIpsMetadataDatafield3() {
        return inIpsMetadataDatafield3;
    }

    /**
     * Sets the value of the inIpsMetadataDatafield3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInIpsMetadataDatafield3(String value) {
        this.inIpsMetadataDatafield3 = value;
    }

    /**
     * Gets the value of the inIpsMetadataDatafield4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInIpsMetadataDatafield4() {
        return inIpsMetadataDatafield4;
    }

    /**
     * Sets the value of the inIpsMetadataDatafield4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInIpsMetadataDatafield4(String value) {
        this.inIpsMetadataDatafield4 = value;
    }

    /**
     * Gets the value of the inIpsMetadataDatafield5 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInIpsMetadataDatafield5() {
        return inIpsMetadataDatafield5;
    }

    /**
     * Sets the value of the inIpsMetadataDatafield5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInIpsMetadataDatafield5(String value) {
        this.inIpsMetadataDatafield5 = value;
    }

    /**
     * Gets the value of the inIpsMetadataDatafield6 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInIpsMetadataDatafield6() {
        return inIpsMetadataDatafield6;
    }

    /**
     * Sets the value of the inIpsMetadataDatafield6 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInIpsMetadataDatafield6(String value) {
        this.inIpsMetadataDatafield6 = value;
    }

    /**
     * Gets the value of the inIpsOrganizationOrganizationCode property.
     * 
     */
    public int getInIpsOrganizationOrganizationCode() {
        return inIpsOrganizationOrganizationCode;
    }

    /**
     * Sets the value of the inIpsOrganizationOrganizationCode property.
     * 
     */
    public void setInIpsOrganizationOrganizationCode(int value) {
        this.inIpsOrganizationOrganizationCode = value;
    }

    /**
     * Gets the value of the inTerminalTerminalNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInTerminalTerminalNumber() {
        return inTerminalTerminalNumber;
    }

    /**
     * Sets the value of the inTerminalTerminalNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInTerminalTerminalNumber(String value) {
        this.inTerminalTerminalNumber = value;
    }

}
