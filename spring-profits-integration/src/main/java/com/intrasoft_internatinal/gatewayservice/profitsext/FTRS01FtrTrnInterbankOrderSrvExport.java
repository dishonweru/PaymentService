
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for FTRS01_FtrTrnInterbankOrderSrvExport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FTRS01_FtrTrnInterbankOrderSrvExport">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}BaseExport">
 *       &lt;sequence>
 *         &lt;element name="OutBeneficiaryNameListSetDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCreditIefSuppliedPayableAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutDebitIefSuppliedPayableAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutDomComchartaxIefSuppliedFinalCharges" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutDomComchartaxIefSuppliedFinalCommission" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutDomComchartaxIefSuppliedGenAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutDomesticCurrencyDisplayedDecimalPlaces" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutDomesticCurrencyIdCurrency" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutDomesticCurrencyMinNegotUnit" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutDomesticCurrencyNationalFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutDomesticCurrencyShortDescr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutOrderingAddressCountryGenericDetailDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutOrderingCustAddressAddress1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutOrderingCustAddressAddress2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutOrderingCustAddressCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutOrderingCustAddressTelephone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutOrderingCustAddressZipCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutOrderingCustomerAlertMsg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutOrderingCustomerCDigit" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutOrderingCustomerCustId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutOrderingCustomerNonResident" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutOrderingNameListSetDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutParVoucherRunVoucherLine" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSourceCurrencyShortDescr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutTargetCurrencyShortDescr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutStatusIefSuppliedActionEntryDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutStatusIefSuppliedSrvStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSuccessfulTransactionWorkAdviceCounter" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutSuccessfulTransactionWorkAdviceTitle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSuccessfulTransactionWorkDatetimestamp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSuccessfulTransactionWorkTrxDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutSuccessfulTransactionWorkTrxUnit" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutSuccessfulTransactionWorkTrxUser" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSuccessfulTransactionWorkTrxUsrSn" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutSuccessfulTransactionWorkTunInternalSn" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutTaxPercentageIefSuppliedRate" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpListTag72Row" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}ArrayOfOutGrpListTag72RowOutGrmRowGenericDetailItem" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FTRS01_FtrTrnInterbankOrderSrvExport", propOrder = {
    "outBeneficiaryNameListSetDescription",
    "outCreditIefSuppliedPayableAmount",
    "outDebitIefSuppliedPayableAmount",
    "outDomComchartaxIefSuppliedFinalCharges",
    "outDomComchartaxIefSuppliedFinalCommission",
    "outDomComchartaxIefSuppliedGenAmount",
    "outDomesticCurrencyDisplayedDecimalPlaces",
    "outDomesticCurrencyIdCurrency",
    "outDomesticCurrencyMinNegotUnit",
    "outDomesticCurrencyNationalFlag",
    "outDomesticCurrencyShortDescr",
    "outOrderingAddressCountryGenericDetailDescription",
    "outOrderingCustAddressAddress1",
    "outOrderingCustAddressAddress2",
    "outOrderingCustAddressCity",
    "outOrderingCustAddressTelephone",
    "outOrderingCustAddressZipCode",
    "outOrderingCustomerAlertMsg",
    "outOrderingCustomerCDigit",
    "outOrderingCustomerCustId",
    "outOrderingCustomerNonResident",
    "outOrderingNameListSetDescription",
    "outParVoucherRunVoucherLine",
    "outSourceCurrencyShortDescr",
    "outTargetCurrencyShortDescr",
    "outStatusIefSuppliedActionEntryDesc",
    "outStatusIefSuppliedSrvStatus",
    "outSuccessfulTransactionWorkAdviceCounter",
    "outSuccessfulTransactionWorkAdviceTitle",
    "outSuccessfulTransactionWorkDatetimestamp",
    "outSuccessfulTransactionWorkTrxDate",
    "outSuccessfulTransactionWorkTrxUnit",
    "outSuccessfulTransactionWorkTrxUser",
    "outSuccessfulTransactionWorkTrxUsrSn",
    "outSuccessfulTransactionWorkTunInternalSn",
    "outTaxPercentageIefSuppliedRate",
    "outGrpListTag72Row"
})
public class FTRS01FtrTrnInterbankOrderSrvExport
    extends BaseExport
{

    @XmlElement(name = "OutBeneficiaryNameListSetDescription")
    protected String outBeneficiaryNameListSetDescription;
    @XmlElement(name = "OutCreditIefSuppliedPayableAmount", required = true)
    protected BigDecimal outCreditIefSuppliedPayableAmount;
    @XmlElement(name = "OutDebitIefSuppliedPayableAmount", required = true)
    protected BigDecimal outDebitIefSuppliedPayableAmount;
    @XmlElement(name = "OutDomComchartaxIefSuppliedFinalCharges", required = true)
    protected BigDecimal outDomComchartaxIefSuppliedFinalCharges;
    @XmlElement(name = "OutDomComchartaxIefSuppliedFinalCommission", required = true)
    protected BigDecimal outDomComchartaxIefSuppliedFinalCommission;
    @XmlElement(name = "OutDomComchartaxIefSuppliedGenAmount", required = true)
    protected BigDecimal outDomComchartaxIefSuppliedGenAmount;
    @XmlElement(name = "OutDomesticCurrencyDisplayedDecimalPlaces")
    protected short outDomesticCurrencyDisplayedDecimalPlaces;
    @XmlElement(name = "OutDomesticCurrencyIdCurrency")
    protected int outDomesticCurrencyIdCurrency;
    @XmlElement(name = "OutDomesticCurrencyMinNegotUnit")
    protected short outDomesticCurrencyMinNegotUnit;
    @XmlElement(name = "OutDomesticCurrencyNationalFlag")
    protected String outDomesticCurrencyNationalFlag;
    @XmlElement(name = "OutDomesticCurrencyShortDescr")
    protected String outDomesticCurrencyShortDescr;
    @XmlElement(name = "OutOrderingAddressCountryGenericDetailDescription")
    protected String outOrderingAddressCountryGenericDetailDescription;
    @XmlElement(name = "OutOrderingCustAddressAddress1")
    protected String outOrderingCustAddressAddress1;
    @XmlElement(name = "OutOrderingCustAddressAddress2")
    protected String outOrderingCustAddressAddress2;
    @XmlElement(name = "OutOrderingCustAddressCity")
    protected String outOrderingCustAddressCity;
    @XmlElement(name = "OutOrderingCustAddressTelephone")
    protected String outOrderingCustAddressTelephone;
    @XmlElement(name = "OutOrderingCustAddressZipCode")
    protected String outOrderingCustAddressZipCode;
    @XmlElement(name = "OutOrderingCustomerAlertMsg")
    protected String outOrderingCustomerAlertMsg;
    @XmlElement(name = "OutOrderingCustomerCDigit")
    protected short outOrderingCustomerCDigit;
    @XmlElement(name = "OutOrderingCustomerCustId")
    protected int outOrderingCustomerCustId;
    @XmlElement(name = "OutOrderingCustomerNonResident")
    protected String outOrderingCustomerNonResident;
    @XmlElement(name = "OutOrderingNameListSetDescription")
    protected String outOrderingNameListSetDescription;
    @XmlElement(name = "OutParVoucherRunVoucherLine")
    protected String outParVoucherRunVoucherLine;
    @XmlElement(name = "OutSourceCurrencyShortDescr")
    protected String outSourceCurrencyShortDescr;
    @XmlElement(name = "OutTargetCurrencyShortDescr")
    protected String outTargetCurrencyShortDescr;
    @XmlElement(name = "OutStatusIefSuppliedActionEntryDesc")
    protected String outStatusIefSuppliedActionEntryDesc;
    @XmlElement(name = "OutStatusIefSuppliedSrvStatus")
    protected String outStatusIefSuppliedSrvStatus;
    @XmlElement(name = "OutSuccessfulTransactionWorkAdviceCounter")
    protected int outSuccessfulTransactionWorkAdviceCounter;
    @XmlElement(name = "OutSuccessfulTransactionWorkAdviceTitle")
    protected String outSuccessfulTransactionWorkAdviceTitle;
    @XmlElement(name = "OutSuccessfulTransactionWorkDatetimestamp")
    protected String outSuccessfulTransactionWorkDatetimestamp;
    @XmlElement(name = "OutSuccessfulTransactionWorkTrxDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outSuccessfulTransactionWorkTrxDate;
    @XmlElement(name = "OutSuccessfulTransactionWorkTrxUnit")
    protected int outSuccessfulTransactionWorkTrxUnit;
    @XmlElement(name = "OutSuccessfulTransactionWorkTrxUser")
    protected String outSuccessfulTransactionWorkTrxUser;
    @XmlElement(name = "OutSuccessfulTransactionWorkTrxUsrSn")
    protected int outSuccessfulTransactionWorkTrxUsrSn;
    @XmlElement(name = "OutSuccessfulTransactionWorkTunInternalSn")
    protected short outSuccessfulTransactionWorkTunInternalSn;
    @XmlElement(name = "OutTaxPercentageIefSuppliedRate", required = true)
    protected BigDecimal outTaxPercentageIefSuppliedRate;
    @XmlElement(name = "OutGrpListTag72Row")
    protected ArrayOfOutGrpListTag72RowOutGrmRowGenericDetailItem outGrpListTag72Row;

    /**
     * Gets the value of the outBeneficiaryNameListSetDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutBeneficiaryNameListSetDescription() {
        return outBeneficiaryNameListSetDescription;
    }

    /**
     * Sets the value of the outBeneficiaryNameListSetDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutBeneficiaryNameListSetDescription(String value) {
        this.outBeneficiaryNameListSetDescription = value;
    }

    /**
     * Gets the value of the outCreditIefSuppliedPayableAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutCreditIefSuppliedPayableAmount() {
        return outCreditIefSuppliedPayableAmount;
    }

    /**
     * Sets the value of the outCreditIefSuppliedPayableAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutCreditIefSuppliedPayableAmount(BigDecimal value) {
        this.outCreditIefSuppliedPayableAmount = value;
    }

    /**
     * Gets the value of the outDebitIefSuppliedPayableAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutDebitIefSuppliedPayableAmount() {
        return outDebitIefSuppliedPayableAmount;
    }

    /**
     * Sets the value of the outDebitIefSuppliedPayableAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutDebitIefSuppliedPayableAmount(BigDecimal value) {
        this.outDebitIefSuppliedPayableAmount = value;
    }

    /**
     * Gets the value of the outDomComchartaxIefSuppliedFinalCharges property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutDomComchartaxIefSuppliedFinalCharges() {
        return outDomComchartaxIefSuppliedFinalCharges;
    }

    /**
     * Sets the value of the outDomComchartaxIefSuppliedFinalCharges property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutDomComchartaxIefSuppliedFinalCharges(BigDecimal value) {
        this.outDomComchartaxIefSuppliedFinalCharges = value;
    }

    /**
     * Gets the value of the outDomComchartaxIefSuppliedFinalCommission property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutDomComchartaxIefSuppliedFinalCommission() {
        return outDomComchartaxIefSuppliedFinalCommission;
    }

    /**
     * Sets the value of the outDomComchartaxIefSuppliedFinalCommission property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutDomComchartaxIefSuppliedFinalCommission(BigDecimal value) {
        this.outDomComchartaxIefSuppliedFinalCommission = value;
    }

    /**
     * Gets the value of the outDomComchartaxIefSuppliedGenAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutDomComchartaxIefSuppliedGenAmount() {
        return outDomComchartaxIefSuppliedGenAmount;
    }

    /**
     * Sets the value of the outDomComchartaxIefSuppliedGenAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutDomComchartaxIefSuppliedGenAmount(BigDecimal value) {
        this.outDomComchartaxIefSuppliedGenAmount = value;
    }

    /**
     * Gets the value of the outDomesticCurrencyDisplayedDecimalPlaces property.
     * 
     */
    public short getOutDomesticCurrencyDisplayedDecimalPlaces() {
        return outDomesticCurrencyDisplayedDecimalPlaces;
    }

    /**
     * Sets the value of the outDomesticCurrencyDisplayedDecimalPlaces property.
     * 
     */
    public void setOutDomesticCurrencyDisplayedDecimalPlaces(short value) {
        this.outDomesticCurrencyDisplayedDecimalPlaces = value;
    }

    /**
     * Gets the value of the outDomesticCurrencyIdCurrency property.
     * 
     */
    public int getOutDomesticCurrencyIdCurrency() {
        return outDomesticCurrencyIdCurrency;
    }

    /**
     * Sets the value of the outDomesticCurrencyIdCurrency property.
     * 
     */
    public void setOutDomesticCurrencyIdCurrency(int value) {
        this.outDomesticCurrencyIdCurrency = value;
    }

    /**
     * Gets the value of the outDomesticCurrencyMinNegotUnit property.
     * 
     */
    public short getOutDomesticCurrencyMinNegotUnit() {
        return outDomesticCurrencyMinNegotUnit;
    }

    /**
     * Sets the value of the outDomesticCurrencyMinNegotUnit property.
     * 
     */
    public void setOutDomesticCurrencyMinNegotUnit(short value) {
        this.outDomesticCurrencyMinNegotUnit = value;
    }

    /**
     * Gets the value of the outDomesticCurrencyNationalFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutDomesticCurrencyNationalFlag() {
        return outDomesticCurrencyNationalFlag;
    }

    /**
     * Sets the value of the outDomesticCurrencyNationalFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutDomesticCurrencyNationalFlag(String value) {
        this.outDomesticCurrencyNationalFlag = value;
    }

    /**
     * Gets the value of the outDomesticCurrencyShortDescr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutDomesticCurrencyShortDescr() {
        return outDomesticCurrencyShortDescr;
    }

    /**
     * Sets the value of the outDomesticCurrencyShortDescr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutDomesticCurrencyShortDescr(String value) {
        this.outDomesticCurrencyShortDescr = value;
    }

    /**
     * Gets the value of the outOrderingAddressCountryGenericDetailDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutOrderingAddressCountryGenericDetailDescription() {
        return outOrderingAddressCountryGenericDetailDescription;
    }

    /**
     * Sets the value of the outOrderingAddressCountryGenericDetailDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutOrderingAddressCountryGenericDetailDescription(String value) {
        this.outOrderingAddressCountryGenericDetailDescription = value;
    }

    /**
     * Gets the value of the outOrderingCustAddressAddress1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutOrderingCustAddressAddress1() {
        return outOrderingCustAddressAddress1;
    }

    /**
     * Sets the value of the outOrderingCustAddressAddress1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutOrderingCustAddressAddress1(String value) {
        this.outOrderingCustAddressAddress1 = value;
    }

    /**
     * Gets the value of the outOrderingCustAddressAddress2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutOrderingCustAddressAddress2() {
        return outOrderingCustAddressAddress2;
    }

    /**
     * Sets the value of the outOrderingCustAddressAddress2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutOrderingCustAddressAddress2(String value) {
        this.outOrderingCustAddressAddress2 = value;
    }

    /**
     * Gets the value of the outOrderingCustAddressCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutOrderingCustAddressCity() {
        return outOrderingCustAddressCity;
    }

    /**
     * Sets the value of the outOrderingCustAddressCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutOrderingCustAddressCity(String value) {
        this.outOrderingCustAddressCity = value;
    }

    /**
     * Gets the value of the outOrderingCustAddressTelephone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutOrderingCustAddressTelephone() {
        return outOrderingCustAddressTelephone;
    }

    /**
     * Sets the value of the outOrderingCustAddressTelephone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutOrderingCustAddressTelephone(String value) {
        this.outOrderingCustAddressTelephone = value;
    }

    /**
     * Gets the value of the outOrderingCustAddressZipCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutOrderingCustAddressZipCode() {
        return outOrderingCustAddressZipCode;
    }

    /**
     * Sets the value of the outOrderingCustAddressZipCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutOrderingCustAddressZipCode(String value) {
        this.outOrderingCustAddressZipCode = value;
    }

    /**
     * Gets the value of the outOrderingCustomerAlertMsg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutOrderingCustomerAlertMsg() {
        return outOrderingCustomerAlertMsg;
    }

    /**
     * Sets the value of the outOrderingCustomerAlertMsg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutOrderingCustomerAlertMsg(String value) {
        this.outOrderingCustomerAlertMsg = value;
    }

    /**
     * Gets the value of the outOrderingCustomerCDigit property.
     * 
     */
    public short getOutOrderingCustomerCDigit() {
        return outOrderingCustomerCDigit;
    }

    /**
     * Sets the value of the outOrderingCustomerCDigit property.
     * 
     */
    public void setOutOrderingCustomerCDigit(short value) {
        this.outOrderingCustomerCDigit = value;
    }

    /**
     * Gets the value of the outOrderingCustomerCustId property.
     * 
     */
    public int getOutOrderingCustomerCustId() {
        return outOrderingCustomerCustId;
    }

    /**
     * Sets the value of the outOrderingCustomerCustId property.
     * 
     */
    public void setOutOrderingCustomerCustId(int value) {
        this.outOrderingCustomerCustId = value;
    }

    /**
     * Gets the value of the outOrderingCustomerNonResident property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutOrderingCustomerNonResident() {
        return outOrderingCustomerNonResident;
    }

    /**
     * Sets the value of the outOrderingCustomerNonResident property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutOrderingCustomerNonResident(String value) {
        this.outOrderingCustomerNonResident = value;
    }

    /**
     * Gets the value of the outOrderingNameListSetDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutOrderingNameListSetDescription() {
        return outOrderingNameListSetDescription;
    }

    /**
     * Sets the value of the outOrderingNameListSetDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutOrderingNameListSetDescription(String value) {
        this.outOrderingNameListSetDescription = value;
    }

    /**
     * Gets the value of the outParVoucherRunVoucherLine property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutParVoucherRunVoucherLine() {
        return outParVoucherRunVoucherLine;
    }

    /**
     * Sets the value of the outParVoucherRunVoucherLine property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutParVoucherRunVoucherLine(String value) {
        this.outParVoucherRunVoucherLine = value;
    }

    /**
     * Gets the value of the outSourceCurrencyShortDescr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSourceCurrencyShortDescr() {
        return outSourceCurrencyShortDescr;
    }

    /**
     * Sets the value of the outSourceCurrencyShortDescr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSourceCurrencyShortDescr(String value) {
        this.outSourceCurrencyShortDescr = value;
    }

    /**
     * Gets the value of the outTargetCurrencyShortDescr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutTargetCurrencyShortDescr() {
        return outTargetCurrencyShortDescr;
    }

    /**
     * Sets the value of the outTargetCurrencyShortDescr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutTargetCurrencyShortDescr(String value) {
        this.outTargetCurrencyShortDescr = value;
    }

    /**
     * Gets the value of the outStatusIefSuppliedActionEntryDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutStatusIefSuppliedActionEntryDesc() {
        return outStatusIefSuppliedActionEntryDesc;
    }

    /**
     * Sets the value of the outStatusIefSuppliedActionEntryDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutStatusIefSuppliedActionEntryDesc(String value) {
        this.outStatusIefSuppliedActionEntryDesc = value;
    }

    /**
     * Gets the value of the outStatusIefSuppliedSrvStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutStatusIefSuppliedSrvStatus() {
        return outStatusIefSuppliedSrvStatus;
    }

    /**
     * Sets the value of the outStatusIefSuppliedSrvStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutStatusIefSuppliedSrvStatus(String value) {
        this.outStatusIefSuppliedSrvStatus = value;
    }

    /**
     * Gets the value of the outSuccessfulTransactionWorkAdviceCounter property.
     * 
     */
    public int getOutSuccessfulTransactionWorkAdviceCounter() {
        return outSuccessfulTransactionWorkAdviceCounter;
    }

    /**
     * Sets the value of the outSuccessfulTransactionWorkAdviceCounter property.
     * 
     */
    public void setOutSuccessfulTransactionWorkAdviceCounter(int value) {
        this.outSuccessfulTransactionWorkAdviceCounter = value;
    }

    /**
     * Gets the value of the outSuccessfulTransactionWorkAdviceTitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSuccessfulTransactionWorkAdviceTitle() {
        return outSuccessfulTransactionWorkAdviceTitle;
    }

    /**
     * Sets the value of the outSuccessfulTransactionWorkAdviceTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSuccessfulTransactionWorkAdviceTitle(String value) {
        this.outSuccessfulTransactionWorkAdviceTitle = value;
    }

    /**
     * Gets the value of the outSuccessfulTransactionWorkDatetimestamp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSuccessfulTransactionWorkDatetimestamp() {
        return outSuccessfulTransactionWorkDatetimestamp;
    }

    /**
     * Sets the value of the outSuccessfulTransactionWorkDatetimestamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSuccessfulTransactionWorkDatetimestamp(String value) {
        this.outSuccessfulTransactionWorkDatetimestamp = value;
    }

    /**
     * Gets the value of the outSuccessfulTransactionWorkTrxDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutSuccessfulTransactionWorkTrxDate() {
        return outSuccessfulTransactionWorkTrxDate;
    }

    /**
     * Sets the value of the outSuccessfulTransactionWorkTrxDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutSuccessfulTransactionWorkTrxDate(XMLGregorianCalendar value) {
        this.outSuccessfulTransactionWorkTrxDate = value;
    }

    /**
     * Gets the value of the outSuccessfulTransactionWorkTrxUnit property.
     * 
     */
    public int getOutSuccessfulTransactionWorkTrxUnit() {
        return outSuccessfulTransactionWorkTrxUnit;
    }

    /**
     * Sets the value of the outSuccessfulTransactionWorkTrxUnit property.
     * 
     */
    public void setOutSuccessfulTransactionWorkTrxUnit(int value) {
        this.outSuccessfulTransactionWorkTrxUnit = value;
    }

    /**
     * Gets the value of the outSuccessfulTransactionWorkTrxUser property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSuccessfulTransactionWorkTrxUser() {
        return outSuccessfulTransactionWorkTrxUser;
    }

    /**
     * Sets the value of the outSuccessfulTransactionWorkTrxUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSuccessfulTransactionWorkTrxUser(String value) {
        this.outSuccessfulTransactionWorkTrxUser = value;
    }

    /**
     * Gets the value of the outSuccessfulTransactionWorkTrxUsrSn property.
     * 
     */
    public int getOutSuccessfulTransactionWorkTrxUsrSn() {
        return outSuccessfulTransactionWorkTrxUsrSn;
    }

    /**
     * Sets the value of the outSuccessfulTransactionWorkTrxUsrSn property.
     * 
     */
    public void setOutSuccessfulTransactionWorkTrxUsrSn(int value) {
        this.outSuccessfulTransactionWorkTrxUsrSn = value;
    }

    /**
     * Gets the value of the outSuccessfulTransactionWorkTunInternalSn property.
     * 
     */
    public short getOutSuccessfulTransactionWorkTunInternalSn() {
        return outSuccessfulTransactionWorkTunInternalSn;
    }

    /**
     * Sets the value of the outSuccessfulTransactionWorkTunInternalSn property.
     * 
     */
    public void setOutSuccessfulTransactionWorkTunInternalSn(short value) {
        this.outSuccessfulTransactionWorkTunInternalSn = value;
    }

    /**
     * Gets the value of the outTaxPercentageIefSuppliedRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutTaxPercentageIefSuppliedRate() {
        return outTaxPercentageIefSuppliedRate;
    }

    /**
     * Sets the value of the outTaxPercentageIefSuppliedRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutTaxPercentageIefSuppliedRate(BigDecimal value) {
        this.outTaxPercentageIefSuppliedRate = value;
    }

    /**
     * Gets the value of the outGrpListTag72Row property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfOutGrpListTag72RowOutGrmRowGenericDetailItem }
     *     
     */
    public ArrayOfOutGrpListTag72RowOutGrmRowGenericDetailItem getOutGrpListTag72Row() {
        return outGrpListTag72Row;
    }

    /**
     * Sets the value of the outGrpListTag72Row property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfOutGrpListTag72RowOutGrmRowGenericDetailItem }
     *     
     */
    public void setOutGrpListTag72Row(ArrayOfOutGrpListTag72RowOutGrmRowGenericDetailItem value) {
        this.outGrpListTag72Row = value;
    }

}
