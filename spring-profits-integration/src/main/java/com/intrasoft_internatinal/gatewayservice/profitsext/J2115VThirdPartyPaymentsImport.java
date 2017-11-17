
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for J2115V_ThirdPartyPaymentsImport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="J2115V_ThirdPartyPaymentsImport">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}BaseImport">
 *       &lt;sequence>
 *         &lt;element name="Command" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InAmountCurrencyIdCurrency" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InChargesDiscountIefSuppliedGenPercentage" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InChequeBookItemChequeCd" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InChequesForCollectionChequeNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCommissionDiscountIefSuppliedGenPercentage" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InCpAgreementCpAgreementNo" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="InCpOlCollectionBenPassportType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCpOlCollectionBenefAddress1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCpOlCollectionBenefAddress2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCpOlCollectionBenefCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCpOlCollectionBenefCountry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCpOlCollectionBenefName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCpOlCollectionBenefPassport" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCpOlCollectionBenefTelephone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCpOlCollectionBenefZipCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCpOlCollectionCrCardApproval" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCpOlCollectionCreditCardNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCpOlCollectionDataField1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCpOlCollectionDataField2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCpOlCollectionDataField3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCpOlCollectionDataField4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCpOlCollectionEntryComments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCpOlCollectionEydapChannel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCpOlCollectionOrgAmnt" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InCpOlGroupEntryEntryNo" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="InCpOlPaymentBenPassportType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCpOlPaymentBenefAddress1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCpOlPaymentBenefAddress2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCpOlPaymentBenefCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCpOlPaymentBenefCountry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCpOlPaymentBenefName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCpOlPaymentBenefPassport" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCpOlPaymentBenefTelephone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCpOlPaymentBenefZipCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCpOlPaymentDataField1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCpOlPaymentDataField2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCpOlPaymentDataField3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCpOlPaymentDataField4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCpPrftTransactionIdTransact" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InCustomerCDigit" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InCustomerCustId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ProfitsAccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProfitsAccountCd" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InDpTrxSpecialAgrValueDateSpread" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InFdValeurBalanceValueDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InForecastIefSuppliedFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InParametersInTerminalTerminalNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InParametersInBankParametersRateUsage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InAuthGrantedIefSuppliedFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "J2115V_ThirdPartyPaymentsImport", propOrder = {
    "command",
    "inAmountCurrencyIdCurrency",
    "inChargesDiscountIefSuppliedGenPercentage",
    "inChequeBookItemChequeCd",
    "inChequesForCollectionChequeNumber",
    "inCommissionDiscountIefSuppliedGenPercentage",
    "inCpAgreementCpAgreementNo",
    "inCpOlCollectionBenPassportType",
    "inCpOlCollectionBenefAddress1",
    "inCpOlCollectionBenefAddress2",
    "inCpOlCollectionBenefCity",
    "inCpOlCollectionBenefCountry",
    "inCpOlCollectionBenefName",
    "inCpOlCollectionBenefPassport",
    "inCpOlCollectionBenefTelephone",
    "inCpOlCollectionBenefZipCode",
    "inCpOlCollectionCrCardApproval",
    "inCpOlCollectionCreditCardNo",
    "inCpOlCollectionDataField1",
    "inCpOlCollectionDataField2",
    "inCpOlCollectionDataField3",
    "inCpOlCollectionDataField4",
    "inCpOlCollectionEntryComments",
    "inCpOlCollectionEydapChannel",
    "inCpOlCollectionOrgAmnt",
    "inCpOlGroupEntryEntryNo",
    "inCpOlPaymentBenPassportType",
    "inCpOlPaymentBenefAddress1",
    "inCpOlPaymentBenefAddress2",
    "inCpOlPaymentBenefCity",
    "inCpOlPaymentBenefCountry",
    "inCpOlPaymentBenefName",
    "inCpOlPaymentBenefPassport",
    "inCpOlPaymentBenefTelephone",
    "inCpOlPaymentBenefZipCode",
    "inCpOlPaymentDataField1",
    "inCpOlPaymentDataField2",
    "inCpOlPaymentDataField3",
    "inCpOlPaymentDataField4",
    "inCpPrftTransactionIdTransact",
    "inCustomerCDigit",
    "inCustomerCustId",
    "profitsAccountNumber",
    "profitsAccountCd",
    "inDpTrxSpecialAgrValueDateSpread",
    "inFdValeurBalanceValueDate",
    "inForecastIefSuppliedFlag",
    "inParametersInTerminalTerminalNumber",
    "inParametersInBankParametersRateUsage",
    "inAuthGrantedIefSuppliedFlag"
})
public class J2115VThirdPartyPaymentsImport
    extends BaseImport
{

    @XmlElement(name = "Command")
    protected String command;
    @XmlElement(name = "InAmountCurrencyIdCurrency")
    protected int inAmountCurrencyIdCurrency;
    @XmlElement(name = "InChargesDiscountIefSuppliedGenPercentage", required = true)
    protected BigDecimal inChargesDiscountIefSuppliedGenPercentage;
    @XmlElement(name = "InChequeBookItemChequeCd")
    protected short inChequeBookItemChequeCd;
    @XmlElement(name = "InChequesForCollectionChequeNumber")
    protected String inChequesForCollectionChequeNumber;
    @XmlElement(name = "InCommissionDiscountIefSuppliedGenPercentage", required = true)
    protected BigDecimal inCommissionDiscountIefSuppliedGenPercentage;
    @XmlElement(name = "InCpAgreementCpAgreementNo")
    protected double inCpAgreementCpAgreementNo;
    @XmlElement(name = "InCpOlCollectionBenPassportType")
    protected String inCpOlCollectionBenPassportType;
    @XmlElement(name = "InCpOlCollectionBenefAddress1")
    protected String inCpOlCollectionBenefAddress1;
    @XmlElement(name = "InCpOlCollectionBenefAddress2")
    protected String inCpOlCollectionBenefAddress2;
    @XmlElement(name = "InCpOlCollectionBenefCity")
    protected String inCpOlCollectionBenefCity;
    @XmlElement(name = "InCpOlCollectionBenefCountry")
    protected String inCpOlCollectionBenefCountry;
    @XmlElement(name = "InCpOlCollectionBenefName")
    protected String inCpOlCollectionBenefName;
    @XmlElement(name = "InCpOlCollectionBenefPassport")
    protected String inCpOlCollectionBenefPassport;
    @XmlElement(name = "InCpOlCollectionBenefTelephone")
    protected String inCpOlCollectionBenefTelephone;
    @XmlElement(name = "InCpOlCollectionBenefZipCode")
    protected String inCpOlCollectionBenefZipCode;
    @XmlElement(name = "InCpOlCollectionCrCardApproval")
    protected String inCpOlCollectionCrCardApproval;
    @XmlElement(name = "InCpOlCollectionCreditCardNo")
    protected String inCpOlCollectionCreditCardNo;
    @XmlElement(name = "InCpOlCollectionDataField1")
    protected String inCpOlCollectionDataField1;
    @XmlElement(name = "InCpOlCollectionDataField2")
    protected String inCpOlCollectionDataField2;
    @XmlElement(name = "InCpOlCollectionDataField3")
    protected String inCpOlCollectionDataField3;
    @XmlElement(name = "InCpOlCollectionDataField4")
    protected String inCpOlCollectionDataField4;
    @XmlElement(name = "InCpOlCollectionEntryComments")
    protected String inCpOlCollectionEntryComments;
    @XmlElement(name = "InCpOlCollectionEydapChannel")
    protected String inCpOlCollectionEydapChannel;
    @XmlElement(name = "InCpOlCollectionOrgAmnt", required = true)
    protected BigDecimal inCpOlCollectionOrgAmnt;
    @XmlElement(name = "InCpOlGroupEntryEntryNo")
    protected double inCpOlGroupEntryEntryNo;
    @XmlElement(name = "InCpOlPaymentBenPassportType")
    protected String inCpOlPaymentBenPassportType;
    @XmlElement(name = "InCpOlPaymentBenefAddress1")
    protected String inCpOlPaymentBenefAddress1;
    @XmlElement(name = "InCpOlPaymentBenefAddress2")
    protected String inCpOlPaymentBenefAddress2;
    @XmlElement(name = "InCpOlPaymentBenefCity")
    protected String inCpOlPaymentBenefCity;
    @XmlElement(name = "InCpOlPaymentBenefCountry")
    protected String inCpOlPaymentBenefCountry;
    @XmlElement(name = "InCpOlPaymentBenefName")
    protected String inCpOlPaymentBenefName;
    @XmlElement(name = "InCpOlPaymentBenefPassport")
    protected String inCpOlPaymentBenefPassport;
    @XmlElement(name = "InCpOlPaymentBenefTelephone")
    protected String inCpOlPaymentBenefTelephone;
    @XmlElement(name = "InCpOlPaymentBenefZipCode")
    protected String inCpOlPaymentBenefZipCode;
    @XmlElement(name = "InCpOlPaymentDataField1")
    protected String inCpOlPaymentDataField1;
    @XmlElement(name = "InCpOlPaymentDataField2")
    protected String inCpOlPaymentDataField2;
    @XmlElement(name = "InCpOlPaymentDataField3")
    protected String inCpOlPaymentDataField3;
    @XmlElement(name = "InCpOlPaymentDataField4")
    protected String inCpOlPaymentDataField4;
    @XmlElement(name = "InCpPrftTransactionIdTransact")
    protected int inCpPrftTransactionIdTransact;
    @XmlElement(name = "InCustomerCDigit")
    protected short inCustomerCDigit;
    @XmlElement(name = "InCustomerCustId")
    protected int inCustomerCustId;
    @XmlElement(name = "ProfitsAccountNumber")
    protected String profitsAccountNumber;
    @XmlElement(name = "ProfitsAccountCd")
    protected short profitsAccountCd;
    @XmlElement(name = "InDpTrxSpecialAgrValueDateSpread")
    protected short inDpTrxSpecialAgrValueDateSpread;
    @XmlElement(name = "InFdValeurBalanceValueDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inFdValeurBalanceValueDate;
    @XmlElement(name = "InForecastIefSuppliedFlag")
    protected String inForecastIefSuppliedFlag;
    @XmlElement(name = "InParametersInTerminalTerminalNumber")
    protected String inParametersInTerminalTerminalNumber;
    @XmlElement(name = "InParametersInBankParametersRateUsage")
    protected String inParametersInBankParametersRateUsage;
    @XmlElement(name = "InAuthGrantedIefSuppliedFlag")
    protected String inAuthGrantedIefSuppliedFlag;

    /**
     * Gets the value of the command property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommand() {
        return command;
    }

    /**
     * Sets the value of the command property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommand(String value) {
        this.command = value;
    }

    /**
     * Gets the value of the inAmountCurrencyIdCurrency property.
     * 
     */
    public int getInAmountCurrencyIdCurrency() {
        return inAmountCurrencyIdCurrency;
    }

    /**
     * Sets the value of the inAmountCurrencyIdCurrency property.
     * 
     */
    public void setInAmountCurrencyIdCurrency(int value) {
        this.inAmountCurrencyIdCurrency = value;
    }

    /**
     * Gets the value of the inChargesDiscountIefSuppliedGenPercentage property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInChargesDiscountIefSuppliedGenPercentage() {
        return inChargesDiscountIefSuppliedGenPercentage;
    }

    /**
     * Sets the value of the inChargesDiscountIefSuppliedGenPercentage property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInChargesDiscountIefSuppliedGenPercentage(BigDecimal value) {
        this.inChargesDiscountIefSuppliedGenPercentage = value;
    }

    /**
     * Gets the value of the inChequeBookItemChequeCd property.
     * 
     */
    public short getInChequeBookItemChequeCd() {
        return inChequeBookItemChequeCd;
    }

    /**
     * Sets the value of the inChequeBookItemChequeCd property.
     * 
     */
    public void setInChequeBookItemChequeCd(short value) {
        this.inChequeBookItemChequeCd = value;
    }

    /**
     * Gets the value of the inChequesForCollectionChequeNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInChequesForCollectionChequeNumber() {
        return inChequesForCollectionChequeNumber;
    }

    /**
     * Sets the value of the inChequesForCollectionChequeNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInChequesForCollectionChequeNumber(String value) {
        this.inChequesForCollectionChequeNumber = value;
    }

    /**
     * Gets the value of the inCommissionDiscountIefSuppliedGenPercentage property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInCommissionDiscountIefSuppliedGenPercentage() {
        return inCommissionDiscountIefSuppliedGenPercentage;
    }

    /**
     * Sets the value of the inCommissionDiscountIefSuppliedGenPercentage property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInCommissionDiscountIefSuppliedGenPercentage(BigDecimal value) {
        this.inCommissionDiscountIefSuppliedGenPercentage = value;
    }

    /**
     * Gets the value of the inCpAgreementCpAgreementNo property.
     * 
     */
    public double getInCpAgreementCpAgreementNo() {
        return inCpAgreementCpAgreementNo;
    }

    /**
     * Sets the value of the inCpAgreementCpAgreementNo property.
     * 
     */
    public void setInCpAgreementCpAgreementNo(double value) {
        this.inCpAgreementCpAgreementNo = value;
    }

    /**
     * Gets the value of the inCpOlCollectionBenPassportType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCpOlCollectionBenPassportType() {
        return inCpOlCollectionBenPassportType;
    }

    /**
     * Sets the value of the inCpOlCollectionBenPassportType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCpOlCollectionBenPassportType(String value) {
        this.inCpOlCollectionBenPassportType = value;
    }

    /**
     * Gets the value of the inCpOlCollectionBenefAddress1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCpOlCollectionBenefAddress1() {
        return inCpOlCollectionBenefAddress1;
    }

    /**
     * Sets the value of the inCpOlCollectionBenefAddress1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCpOlCollectionBenefAddress1(String value) {
        this.inCpOlCollectionBenefAddress1 = value;
    }

    /**
     * Gets the value of the inCpOlCollectionBenefAddress2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCpOlCollectionBenefAddress2() {
        return inCpOlCollectionBenefAddress2;
    }

    /**
     * Sets the value of the inCpOlCollectionBenefAddress2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCpOlCollectionBenefAddress2(String value) {
        this.inCpOlCollectionBenefAddress2 = value;
    }

    /**
     * Gets the value of the inCpOlCollectionBenefCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCpOlCollectionBenefCity() {
        return inCpOlCollectionBenefCity;
    }

    /**
     * Sets the value of the inCpOlCollectionBenefCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCpOlCollectionBenefCity(String value) {
        this.inCpOlCollectionBenefCity = value;
    }

    /**
     * Gets the value of the inCpOlCollectionBenefCountry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCpOlCollectionBenefCountry() {
        return inCpOlCollectionBenefCountry;
    }

    /**
     * Sets the value of the inCpOlCollectionBenefCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCpOlCollectionBenefCountry(String value) {
        this.inCpOlCollectionBenefCountry = value;
    }

    /**
     * Gets the value of the inCpOlCollectionBenefName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCpOlCollectionBenefName() {
        return inCpOlCollectionBenefName;
    }

    /**
     * Sets the value of the inCpOlCollectionBenefName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCpOlCollectionBenefName(String value) {
        this.inCpOlCollectionBenefName = value;
    }

    /**
     * Gets the value of the inCpOlCollectionBenefPassport property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCpOlCollectionBenefPassport() {
        return inCpOlCollectionBenefPassport;
    }

    /**
     * Sets the value of the inCpOlCollectionBenefPassport property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCpOlCollectionBenefPassport(String value) {
        this.inCpOlCollectionBenefPassport = value;
    }

    /**
     * Gets the value of the inCpOlCollectionBenefTelephone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCpOlCollectionBenefTelephone() {
        return inCpOlCollectionBenefTelephone;
    }

    /**
     * Sets the value of the inCpOlCollectionBenefTelephone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCpOlCollectionBenefTelephone(String value) {
        this.inCpOlCollectionBenefTelephone = value;
    }

    /**
     * Gets the value of the inCpOlCollectionBenefZipCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCpOlCollectionBenefZipCode() {
        return inCpOlCollectionBenefZipCode;
    }

    /**
     * Sets the value of the inCpOlCollectionBenefZipCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCpOlCollectionBenefZipCode(String value) {
        this.inCpOlCollectionBenefZipCode = value;
    }

    /**
     * Gets the value of the inCpOlCollectionCrCardApproval property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCpOlCollectionCrCardApproval() {
        return inCpOlCollectionCrCardApproval;
    }

    /**
     * Sets the value of the inCpOlCollectionCrCardApproval property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCpOlCollectionCrCardApproval(String value) {
        this.inCpOlCollectionCrCardApproval = value;
    }

    /**
     * Gets the value of the inCpOlCollectionCreditCardNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCpOlCollectionCreditCardNo() {
        return inCpOlCollectionCreditCardNo;
    }

    /**
     * Sets the value of the inCpOlCollectionCreditCardNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCpOlCollectionCreditCardNo(String value) {
        this.inCpOlCollectionCreditCardNo = value;
    }

    /**
     * Gets the value of the inCpOlCollectionDataField1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCpOlCollectionDataField1() {
        return inCpOlCollectionDataField1;
    }

    /**
     * Sets the value of the inCpOlCollectionDataField1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCpOlCollectionDataField1(String value) {
        this.inCpOlCollectionDataField1 = value;
    }

    /**
     * Gets the value of the inCpOlCollectionDataField2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCpOlCollectionDataField2() {
        return inCpOlCollectionDataField2;
    }

    /**
     * Sets the value of the inCpOlCollectionDataField2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCpOlCollectionDataField2(String value) {
        this.inCpOlCollectionDataField2 = value;
    }

    /**
     * Gets the value of the inCpOlCollectionDataField3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCpOlCollectionDataField3() {
        return inCpOlCollectionDataField3;
    }

    /**
     * Sets the value of the inCpOlCollectionDataField3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCpOlCollectionDataField3(String value) {
        this.inCpOlCollectionDataField3 = value;
    }

    /**
     * Gets the value of the inCpOlCollectionDataField4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCpOlCollectionDataField4() {
        return inCpOlCollectionDataField4;
    }

    /**
     * Sets the value of the inCpOlCollectionDataField4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCpOlCollectionDataField4(String value) {
        this.inCpOlCollectionDataField4 = value;
    }

    /**
     * Gets the value of the inCpOlCollectionEntryComments property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCpOlCollectionEntryComments() {
        return inCpOlCollectionEntryComments;
    }

    /**
     * Sets the value of the inCpOlCollectionEntryComments property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCpOlCollectionEntryComments(String value) {
        this.inCpOlCollectionEntryComments = value;
    }

    /**
     * Gets the value of the inCpOlCollectionEydapChannel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCpOlCollectionEydapChannel() {
        return inCpOlCollectionEydapChannel;
    }

    /**
     * Sets the value of the inCpOlCollectionEydapChannel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCpOlCollectionEydapChannel(String value) {
        this.inCpOlCollectionEydapChannel = value;
    }

    /**
     * Gets the value of the inCpOlCollectionOrgAmnt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInCpOlCollectionOrgAmnt() {
        return inCpOlCollectionOrgAmnt;
    }

    /**
     * Sets the value of the inCpOlCollectionOrgAmnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInCpOlCollectionOrgAmnt(BigDecimal value) {
        this.inCpOlCollectionOrgAmnt = value;
    }

    /**
     * Gets the value of the inCpOlGroupEntryEntryNo property.
     * 
     */
    public double getInCpOlGroupEntryEntryNo() {
        return inCpOlGroupEntryEntryNo;
    }

    /**
     * Sets the value of the inCpOlGroupEntryEntryNo property.
     * 
     */
    public void setInCpOlGroupEntryEntryNo(double value) {
        this.inCpOlGroupEntryEntryNo = value;
    }

    /**
     * Gets the value of the inCpOlPaymentBenPassportType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCpOlPaymentBenPassportType() {
        return inCpOlPaymentBenPassportType;
    }

    /**
     * Sets the value of the inCpOlPaymentBenPassportType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCpOlPaymentBenPassportType(String value) {
        this.inCpOlPaymentBenPassportType = value;
    }

    /**
     * Gets the value of the inCpOlPaymentBenefAddress1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCpOlPaymentBenefAddress1() {
        return inCpOlPaymentBenefAddress1;
    }

    /**
     * Sets the value of the inCpOlPaymentBenefAddress1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCpOlPaymentBenefAddress1(String value) {
        this.inCpOlPaymentBenefAddress1 = value;
    }

    /**
     * Gets the value of the inCpOlPaymentBenefAddress2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCpOlPaymentBenefAddress2() {
        return inCpOlPaymentBenefAddress2;
    }

    /**
     * Sets the value of the inCpOlPaymentBenefAddress2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCpOlPaymentBenefAddress2(String value) {
        this.inCpOlPaymentBenefAddress2 = value;
    }

    /**
     * Gets the value of the inCpOlPaymentBenefCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCpOlPaymentBenefCity() {
        return inCpOlPaymentBenefCity;
    }

    /**
     * Sets the value of the inCpOlPaymentBenefCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCpOlPaymentBenefCity(String value) {
        this.inCpOlPaymentBenefCity = value;
    }

    /**
     * Gets the value of the inCpOlPaymentBenefCountry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCpOlPaymentBenefCountry() {
        return inCpOlPaymentBenefCountry;
    }

    /**
     * Sets the value of the inCpOlPaymentBenefCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCpOlPaymentBenefCountry(String value) {
        this.inCpOlPaymentBenefCountry = value;
    }

    /**
     * Gets the value of the inCpOlPaymentBenefName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCpOlPaymentBenefName() {
        return inCpOlPaymentBenefName;
    }

    /**
     * Sets the value of the inCpOlPaymentBenefName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCpOlPaymentBenefName(String value) {
        this.inCpOlPaymentBenefName = value;
    }

    /**
     * Gets the value of the inCpOlPaymentBenefPassport property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCpOlPaymentBenefPassport() {
        return inCpOlPaymentBenefPassport;
    }

    /**
     * Sets the value of the inCpOlPaymentBenefPassport property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCpOlPaymentBenefPassport(String value) {
        this.inCpOlPaymentBenefPassport = value;
    }

    /**
     * Gets the value of the inCpOlPaymentBenefTelephone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCpOlPaymentBenefTelephone() {
        return inCpOlPaymentBenefTelephone;
    }

    /**
     * Sets the value of the inCpOlPaymentBenefTelephone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCpOlPaymentBenefTelephone(String value) {
        this.inCpOlPaymentBenefTelephone = value;
    }

    /**
     * Gets the value of the inCpOlPaymentBenefZipCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCpOlPaymentBenefZipCode() {
        return inCpOlPaymentBenefZipCode;
    }

    /**
     * Sets the value of the inCpOlPaymentBenefZipCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCpOlPaymentBenefZipCode(String value) {
        this.inCpOlPaymentBenefZipCode = value;
    }

    /**
     * Gets the value of the inCpOlPaymentDataField1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCpOlPaymentDataField1() {
        return inCpOlPaymentDataField1;
    }

    /**
     * Sets the value of the inCpOlPaymentDataField1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCpOlPaymentDataField1(String value) {
        this.inCpOlPaymentDataField1 = value;
    }

    /**
     * Gets the value of the inCpOlPaymentDataField2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCpOlPaymentDataField2() {
        return inCpOlPaymentDataField2;
    }

    /**
     * Sets the value of the inCpOlPaymentDataField2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCpOlPaymentDataField2(String value) {
        this.inCpOlPaymentDataField2 = value;
    }

    /**
     * Gets the value of the inCpOlPaymentDataField3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCpOlPaymentDataField3() {
        return inCpOlPaymentDataField3;
    }

    /**
     * Sets the value of the inCpOlPaymentDataField3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCpOlPaymentDataField3(String value) {
        this.inCpOlPaymentDataField3 = value;
    }

    /**
     * Gets the value of the inCpOlPaymentDataField4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCpOlPaymentDataField4() {
        return inCpOlPaymentDataField4;
    }

    /**
     * Sets the value of the inCpOlPaymentDataField4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCpOlPaymentDataField4(String value) {
        this.inCpOlPaymentDataField4 = value;
    }

    /**
     * Gets the value of the inCpPrftTransactionIdTransact property.
     * 
     */
    public int getInCpPrftTransactionIdTransact() {
        return inCpPrftTransactionIdTransact;
    }

    /**
     * Sets the value of the inCpPrftTransactionIdTransact property.
     * 
     */
    public void setInCpPrftTransactionIdTransact(int value) {
        this.inCpPrftTransactionIdTransact = value;
    }

    /**
     * Gets the value of the inCustomerCDigit property.
     * 
     */
    public short getInCustomerCDigit() {
        return inCustomerCDigit;
    }

    /**
     * Sets the value of the inCustomerCDigit property.
     * 
     */
    public void setInCustomerCDigit(short value) {
        this.inCustomerCDigit = value;
    }

    /**
     * Gets the value of the inCustomerCustId property.
     * 
     */
    public int getInCustomerCustId() {
        return inCustomerCustId;
    }

    /**
     * Sets the value of the inCustomerCustId property.
     * 
     */
    public void setInCustomerCustId(int value) {
        this.inCustomerCustId = value;
    }

    /**
     * Gets the value of the profitsAccountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProfitsAccountNumber() {
        return profitsAccountNumber;
    }

    /**
     * Sets the value of the profitsAccountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProfitsAccountNumber(String value) {
        this.profitsAccountNumber = value;
    }

    /**
     * Gets the value of the profitsAccountCd property.
     * 
     */
    public short getProfitsAccountCd() {
        return profitsAccountCd;
    }

    /**
     * Sets the value of the profitsAccountCd property.
     * 
     */
    public void setProfitsAccountCd(short value) {
        this.profitsAccountCd = value;
    }

    /**
     * Gets the value of the inDpTrxSpecialAgrValueDateSpread property.
     * 
     */
    public short getInDpTrxSpecialAgrValueDateSpread() {
        return inDpTrxSpecialAgrValueDateSpread;
    }

    /**
     * Sets the value of the inDpTrxSpecialAgrValueDateSpread property.
     * 
     */
    public void setInDpTrxSpecialAgrValueDateSpread(short value) {
        this.inDpTrxSpecialAgrValueDateSpread = value;
    }

    /**
     * Gets the value of the inFdValeurBalanceValueDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInFdValeurBalanceValueDate() {
        return inFdValeurBalanceValueDate;
    }

    /**
     * Sets the value of the inFdValeurBalanceValueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInFdValeurBalanceValueDate(XMLGregorianCalendar value) {
        this.inFdValeurBalanceValueDate = value;
    }

    /**
     * Gets the value of the inForecastIefSuppliedFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInForecastIefSuppliedFlag() {
        return inForecastIefSuppliedFlag;
    }

    /**
     * Sets the value of the inForecastIefSuppliedFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInForecastIefSuppliedFlag(String value) {
        this.inForecastIefSuppliedFlag = value;
    }

    /**
     * Gets the value of the inParametersInTerminalTerminalNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInParametersInTerminalTerminalNumber() {
        return inParametersInTerminalTerminalNumber;
    }

    /**
     * Sets the value of the inParametersInTerminalTerminalNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInParametersInTerminalTerminalNumber(String value) {
        this.inParametersInTerminalTerminalNumber = value;
    }

    /**
     * Gets the value of the inParametersInBankParametersRateUsage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInParametersInBankParametersRateUsage() {
        return inParametersInBankParametersRateUsage;
    }

    /**
     * Sets the value of the inParametersInBankParametersRateUsage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInParametersInBankParametersRateUsage(String value) {
        this.inParametersInBankParametersRateUsage = value;
    }

    /**
     * Gets the value of the inAuthGrantedIefSuppliedFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInAuthGrantedIefSuppliedFlag() {
        return inAuthGrantedIefSuppliedFlag;
    }

    /**
     * Sets the value of the inAuthGrantedIefSuppliedFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInAuthGrantedIefSuppliedFlag(String value) {
        this.inAuthGrantedIefSuppliedFlag = value;
    }

}
