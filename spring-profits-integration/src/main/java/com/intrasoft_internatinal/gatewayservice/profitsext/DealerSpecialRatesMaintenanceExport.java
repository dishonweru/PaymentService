
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DealerSpecialRatesMaintenanceExport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DealerSpecialRatesMaintenanceExport">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}BaseExport">
 *       &lt;sequence>
 *         &lt;element name="OutCommIefSuppliedChar6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutDealerSpecialRateAnaggelia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutDealerSpecialRateCurrencyRate" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutDealerSpecialRateDealerRefNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutDealerSpecialRateEntryComments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutDealerSpecialRatePenaltyAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutDealerSpecialRateSourceAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutDealerSpecialRateTargetAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutDealerUsrCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutRequestUnitUnitCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutRequestUnitUnitUnitName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutRequestUsrCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutServiceTrxjustFxType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSourceCountersCntr" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OutSourceCurrencyEuroLockedRate" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutSourceCurrencyIdCurrency" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutSourceCurrencyNationalFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSourceCurrencyShortDescr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSourceGenericDetailDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSourceGenericDetailShortDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutStatusIefSuppliedActionEntryDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutStatusIefSuppliedSrvStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutTargetCountersCntr" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OutTargetCurrencyEuroLockedRate" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutTargetCurrencyIdCurrency" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutTargetCurrencyNationalFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutTargetCurrencyShortDescr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutTargetGenericDetailDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutTargetGenericDetailShortDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutTeamInformationAccountCode" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OutTeamInformationAuthorisationType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutTeamInformationAuthorizationResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutTeamInformationAuthorizationType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutTeamInformationAvailableDateSpread" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutTeamInformationChargeDiscount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutTeamInformationCommissionDiscount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutTeamInformationCreditInterestRateSpread" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutTeamInformationCustomerCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutTeamInformationCustomerSurname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutTeamInformationDebitInterestRateSpread" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutTeamInformationEvaluationResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutTeamInformationInterestRate" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutTeamInformationJustificationDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutTeamInformationJustificationId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutTeamInformationLoanStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutTeamInformationOverdraftAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutTeamInformationOverdraftSpread" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutTeamInformationPenaltyDiscount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutTeamInformationPenaltyRate" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutTeamInformationProductDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutTeamInformationProductId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutTeamInformationRequiredProfile1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutTeamInformationRequiredProfile2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutTeamInformationServicePenaltySpread" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutTeamInformationSuper1Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutTeamInformationSuper1TerminalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutTeamInformationSuper2Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutTeamInformationSuper2TerminalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutTeamInformationTeamComments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutTeamInformationTransactionDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutTeamInformationTransactionId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutTeamInformationTrsAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutTeamInformationUnclearWithdrawalFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutTeamInformationUnitCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutTeamInformationUserCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutTeamInformationUserProfile1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutTeamInformationUserProfile2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutTeamInformationUserProfile3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutTeamInformationUserSurname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutTeamInformationUserTerminalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutTeamInformationValueDateSpread" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutTrxCountTrxCounter" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DealerSpecialRatesMaintenanceExport", propOrder = {
    "outCommIefSuppliedChar6",
    "outDealerSpecialRateAnaggelia",
    "outDealerSpecialRateCurrencyRate",
    "outDealerSpecialRateDealerRefNo",
    "outDealerSpecialRateEntryComments",
    "outDealerSpecialRatePenaltyAmount",
    "outDealerSpecialRateSourceAmount",
    "outDealerSpecialRateTargetAmount",
    "outDealerUsrCode",
    "outRequestUnitUnitCode",
    "outRequestUnitUnitUnitName",
    "outRequestUsrCode",
    "outServiceTrxjustFxType",
    "outSourceCountersCntr",
    "outSourceCurrencyEuroLockedRate",
    "outSourceCurrencyIdCurrency",
    "outSourceCurrencyNationalFlag",
    "outSourceCurrencyShortDescr",
    "outSourceGenericDetailDescription",
    "outSourceGenericDetailShortDescription",
    "outStatusIefSuppliedActionEntryDesc",
    "outStatusIefSuppliedSrvStatus",
    "outTargetCountersCntr",
    "outTargetCurrencyEuroLockedRate",
    "outTargetCurrencyIdCurrency",
    "outTargetCurrencyNationalFlag",
    "outTargetCurrencyShortDescr",
    "outTargetGenericDetailDescription",
    "outTargetGenericDetailShortDescription",
    "outTeamInformationAccountCode",
    "outTeamInformationAuthorisationType",
    "outTeamInformationAuthorizationResult",
    "outTeamInformationAuthorizationType",
    "outTeamInformationAvailableDateSpread",
    "outTeamInformationChargeDiscount",
    "outTeamInformationCommissionDiscount",
    "outTeamInformationCreditInterestRateSpread",
    "outTeamInformationCustomerCode",
    "outTeamInformationCustomerSurname",
    "outTeamInformationDebitInterestRateSpread",
    "outTeamInformationEvaluationResult",
    "outTeamInformationInterestRate",
    "outTeamInformationJustificationDescription",
    "outTeamInformationJustificationId",
    "outTeamInformationLoanStatus",
    "outTeamInformationOverdraftAmount",
    "outTeamInformationOverdraftSpread",
    "outTeamInformationPenaltyDiscount",
    "outTeamInformationPenaltyRate",
    "outTeamInformationProductDescription",
    "outTeamInformationProductId",
    "outTeamInformationRequiredProfile1",
    "outTeamInformationRequiredProfile2",
    "outTeamInformationServicePenaltySpread",
    "outTeamInformationSuper1Code",
    "outTeamInformationSuper1TerminalId",
    "outTeamInformationSuper2Code",
    "outTeamInformationSuper2TerminalId",
    "outTeamInformationTeamComments",
    "outTeamInformationTransactionDescription",
    "outTeamInformationTransactionId",
    "outTeamInformationTrsAmount",
    "outTeamInformationUnclearWithdrawalFlag",
    "outTeamInformationUnitCode",
    "outTeamInformationUserCode",
    "outTeamInformationUserProfile1",
    "outTeamInformationUserProfile2",
    "outTeamInformationUserProfile3",
    "outTeamInformationUserSurname",
    "outTeamInformationUserTerminalId",
    "outTeamInformationValueDateSpread",
    "outTrxCountTrxCounter"
})
public class DealerSpecialRatesMaintenanceExport
    extends BaseExport
{

    @XmlElement(name = "OutCommIefSuppliedChar6")
    protected String outCommIefSuppliedChar6;
    @XmlElement(name = "OutDealerSpecialRateAnaggelia")
    protected String outDealerSpecialRateAnaggelia;
    @XmlElement(name = "OutDealerSpecialRateCurrencyRate", required = true)
    protected BigDecimal outDealerSpecialRateCurrencyRate;
    @XmlElement(name = "OutDealerSpecialRateDealerRefNo")
    protected String outDealerSpecialRateDealerRefNo;
    @XmlElement(name = "OutDealerSpecialRateEntryComments")
    protected String outDealerSpecialRateEntryComments;
    @XmlElement(name = "OutDealerSpecialRatePenaltyAmount", required = true)
    protected BigDecimal outDealerSpecialRatePenaltyAmount;
    @XmlElement(name = "OutDealerSpecialRateSourceAmount", required = true)
    protected BigDecimal outDealerSpecialRateSourceAmount;
    @XmlElement(name = "OutDealerSpecialRateTargetAmount", required = true)
    protected BigDecimal outDealerSpecialRateTargetAmount;
    @XmlElement(name = "OutDealerUsrCode")
    protected String outDealerUsrCode;
    @XmlElement(name = "OutRequestUnitUnitCode")
    protected int outRequestUnitUnitCode;
    @XmlElement(name = "OutRequestUnitUnitUnitName")
    protected String outRequestUnitUnitUnitName;
    @XmlElement(name = "OutRequestUsrCode")
    protected String outRequestUsrCode;
    @XmlElement(name = "OutServiceTrxjustFxType")
    protected String outServiceTrxjustFxType;
    @XmlElement(name = "OutSourceCountersCntr")
    protected double outSourceCountersCntr;
    @XmlElement(name = "OutSourceCurrencyEuroLockedRate", required = true)
    protected BigDecimal outSourceCurrencyEuroLockedRate;
    @XmlElement(name = "OutSourceCurrencyIdCurrency")
    protected int outSourceCurrencyIdCurrency;
    @XmlElement(name = "OutSourceCurrencyNationalFlag")
    protected String outSourceCurrencyNationalFlag;
    @XmlElement(name = "OutSourceCurrencyShortDescr")
    protected String outSourceCurrencyShortDescr;
    @XmlElement(name = "OutSourceGenericDetailDescription")
    protected String outSourceGenericDetailDescription;
    @XmlElement(name = "OutSourceGenericDetailShortDescription")
    protected String outSourceGenericDetailShortDescription;
    @XmlElement(name = "OutStatusIefSuppliedActionEntryDesc")
    protected String outStatusIefSuppliedActionEntryDesc;
    @XmlElement(name = "OutStatusIefSuppliedSrvStatus")
    protected String outStatusIefSuppliedSrvStatus;
    @XmlElement(name = "OutTargetCountersCntr")
    protected double outTargetCountersCntr;
    @XmlElement(name = "OutTargetCurrencyEuroLockedRate", required = true)
    protected BigDecimal outTargetCurrencyEuroLockedRate;
    @XmlElement(name = "OutTargetCurrencyIdCurrency")
    protected int outTargetCurrencyIdCurrency;
    @XmlElement(name = "OutTargetCurrencyNationalFlag")
    protected String outTargetCurrencyNationalFlag;
    @XmlElement(name = "OutTargetCurrencyShortDescr")
    protected String outTargetCurrencyShortDescr;
    @XmlElement(name = "OutTargetGenericDetailDescription")
    protected String outTargetGenericDetailDescription;
    @XmlElement(name = "OutTargetGenericDetailShortDescription")
    protected String outTargetGenericDetailShortDescription;
    @XmlElement(name = "OutTeamInformationAccountCode")
    protected double outTeamInformationAccountCode;
    @XmlElement(name = "OutTeamInformationAuthorisationType")
    protected String outTeamInformationAuthorisationType;
    @XmlElement(name = "OutTeamInformationAuthorizationResult")
    protected String outTeamInformationAuthorizationResult;
    @XmlElement(name = "OutTeamInformationAuthorizationType")
    protected String outTeamInformationAuthorizationType;
    @XmlElement(name = "OutTeamInformationAvailableDateSpread")
    protected short outTeamInformationAvailableDateSpread;
    @XmlElement(name = "OutTeamInformationChargeDiscount", required = true)
    protected BigDecimal outTeamInformationChargeDiscount;
    @XmlElement(name = "OutTeamInformationCommissionDiscount", required = true)
    protected BigDecimal outTeamInformationCommissionDiscount;
    @XmlElement(name = "OutTeamInformationCreditInterestRateSpread", required = true)
    protected BigDecimal outTeamInformationCreditInterestRateSpread;
    @XmlElement(name = "OutTeamInformationCustomerCode")
    protected int outTeamInformationCustomerCode;
    @XmlElement(name = "OutTeamInformationCustomerSurname")
    protected String outTeamInformationCustomerSurname;
    @XmlElement(name = "OutTeamInformationDebitInterestRateSpread", required = true)
    protected BigDecimal outTeamInformationDebitInterestRateSpread;
    @XmlElement(name = "OutTeamInformationEvaluationResult")
    protected String outTeamInformationEvaluationResult;
    @XmlElement(name = "OutTeamInformationInterestRate", required = true)
    protected BigDecimal outTeamInformationInterestRate;
    @XmlElement(name = "OutTeamInformationJustificationDescription")
    protected String outTeamInformationJustificationDescription;
    @XmlElement(name = "OutTeamInformationJustificationId")
    protected int outTeamInformationJustificationId;
    @XmlElement(name = "OutTeamInformationLoanStatus")
    protected String outTeamInformationLoanStatus;
    @XmlElement(name = "OutTeamInformationOverdraftAmount", required = true)
    protected BigDecimal outTeamInformationOverdraftAmount;
    @XmlElement(name = "OutTeamInformationOverdraftSpread", required = true)
    protected BigDecimal outTeamInformationOverdraftSpread;
    @XmlElement(name = "OutTeamInformationPenaltyDiscount", required = true)
    protected BigDecimal outTeamInformationPenaltyDiscount;
    @XmlElement(name = "OutTeamInformationPenaltyRate", required = true)
    protected BigDecimal outTeamInformationPenaltyRate;
    @XmlElement(name = "OutTeamInformationProductDescription")
    protected String outTeamInformationProductDescription;
    @XmlElement(name = "OutTeamInformationProductId")
    protected int outTeamInformationProductId;
    @XmlElement(name = "OutTeamInformationRequiredProfile1")
    protected String outTeamInformationRequiredProfile1;
    @XmlElement(name = "OutTeamInformationRequiredProfile2")
    protected String outTeamInformationRequiredProfile2;
    @XmlElement(name = "OutTeamInformationServicePenaltySpread", required = true)
    protected BigDecimal outTeamInformationServicePenaltySpread;
    @XmlElement(name = "OutTeamInformationSuper1Code")
    protected String outTeamInformationSuper1Code;
    @XmlElement(name = "OutTeamInformationSuper1TerminalId")
    protected String outTeamInformationSuper1TerminalId;
    @XmlElement(name = "OutTeamInformationSuper2Code")
    protected String outTeamInformationSuper2Code;
    @XmlElement(name = "OutTeamInformationSuper2TerminalId")
    protected String outTeamInformationSuper2TerminalId;
    @XmlElement(name = "OutTeamInformationTeamComments")
    protected String outTeamInformationTeamComments;
    @XmlElement(name = "OutTeamInformationTransactionDescription")
    protected String outTeamInformationTransactionDescription;
    @XmlElement(name = "OutTeamInformationTransactionId")
    protected int outTeamInformationTransactionId;
    @XmlElement(name = "OutTeamInformationTrsAmount", required = true)
    protected BigDecimal outTeamInformationTrsAmount;
    @XmlElement(name = "OutTeamInformationUnclearWithdrawalFlag")
    protected String outTeamInformationUnclearWithdrawalFlag;
    @XmlElement(name = "OutTeamInformationUnitCode")
    protected int outTeamInformationUnitCode;
    @XmlElement(name = "OutTeamInformationUserCode")
    protected String outTeamInformationUserCode;
    @XmlElement(name = "OutTeamInformationUserProfile1")
    protected String outTeamInformationUserProfile1;
    @XmlElement(name = "OutTeamInformationUserProfile2")
    protected String outTeamInformationUserProfile2;
    @XmlElement(name = "OutTeamInformationUserProfile3")
    protected String outTeamInformationUserProfile3;
    @XmlElement(name = "OutTeamInformationUserSurname")
    protected String outTeamInformationUserSurname;
    @XmlElement(name = "OutTeamInformationUserTerminalId")
    protected String outTeamInformationUserTerminalId;
    @XmlElement(name = "OutTeamInformationValueDateSpread")
    protected short outTeamInformationValueDateSpread;
    @XmlElement(name = "OutTrxCountTrxCounter")
    protected int outTrxCountTrxCounter;

    /**
     * Gets the value of the outCommIefSuppliedChar6 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCommIefSuppliedChar6() {
        return outCommIefSuppliedChar6;
    }

    /**
     * Sets the value of the outCommIefSuppliedChar6 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCommIefSuppliedChar6(String value) {
        this.outCommIefSuppliedChar6 = value;
    }

    /**
     * Gets the value of the outDealerSpecialRateAnaggelia property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutDealerSpecialRateAnaggelia() {
        return outDealerSpecialRateAnaggelia;
    }

    /**
     * Sets the value of the outDealerSpecialRateAnaggelia property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutDealerSpecialRateAnaggelia(String value) {
        this.outDealerSpecialRateAnaggelia = value;
    }

    /**
     * Gets the value of the outDealerSpecialRateCurrencyRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutDealerSpecialRateCurrencyRate() {
        return outDealerSpecialRateCurrencyRate;
    }

    /**
     * Sets the value of the outDealerSpecialRateCurrencyRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutDealerSpecialRateCurrencyRate(BigDecimal value) {
        this.outDealerSpecialRateCurrencyRate = value;
    }

    /**
     * Gets the value of the outDealerSpecialRateDealerRefNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutDealerSpecialRateDealerRefNo() {
        return outDealerSpecialRateDealerRefNo;
    }

    /**
     * Sets the value of the outDealerSpecialRateDealerRefNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutDealerSpecialRateDealerRefNo(String value) {
        this.outDealerSpecialRateDealerRefNo = value;
    }

    /**
     * Gets the value of the outDealerSpecialRateEntryComments property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutDealerSpecialRateEntryComments() {
        return outDealerSpecialRateEntryComments;
    }

    /**
     * Sets the value of the outDealerSpecialRateEntryComments property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutDealerSpecialRateEntryComments(String value) {
        this.outDealerSpecialRateEntryComments = value;
    }

    /**
     * Gets the value of the outDealerSpecialRatePenaltyAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutDealerSpecialRatePenaltyAmount() {
        return outDealerSpecialRatePenaltyAmount;
    }

    /**
     * Sets the value of the outDealerSpecialRatePenaltyAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutDealerSpecialRatePenaltyAmount(BigDecimal value) {
        this.outDealerSpecialRatePenaltyAmount = value;
    }

    /**
     * Gets the value of the outDealerSpecialRateSourceAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutDealerSpecialRateSourceAmount() {
        return outDealerSpecialRateSourceAmount;
    }

    /**
     * Sets the value of the outDealerSpecialRateSourceAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutDealerSpecialRateSourceAmount(BigDecimal value) {
        this.outDealerSpecialRateSourceAmount = value;
    }

    /**
     * Gets the value of the outDealerSpecialRateTargetAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutDealerSpecialRateTargetAmount() {
        return outDealerSpecialRateTargetAmount;
    }

    /**
     * Sets the value of the outDealerSpecialRateTargetAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutDealerSpecialRateTargetAmount(BigDecimal value) {
        this.outDealerSpecialRateTargetAmount = value;
    }

    /**
     * Gets the value of the outDealerUsrCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutDealerUsrCode() {
        return outDealerUsrCode;
    }

    /**
     * Sets the value of the outDealerUsrCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutDealerUsrCode(String value) {
        this.outDealerUsrCode = value;
    }

    /**
     * Gets the value of the outRequestUnitUnitCode property.
     * 
     */
    public int getOutRequestUnitUnitCode() {
        return outRequestUnitUnitCode;
    }

    /**
     * Sets the value of the outRequestUnitUnitCode property.
     * 
     */
    public void setOutRequestUnitUnitCode(int value) {
        this.outRequestUnitUnitCode = value;
    }

    /**
     * Gets the value of the outRequestUnitUnitUnitName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutRequestUnitUnitUnitName() {
        return outRequestUnitUnitUnitName;
    }

    /**
     * Sets the value of the outRequestUnitUnitUnitName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutRequestUnitUnitUnitName(String value) {
        this.outRequestUnitUnitUnitName = value;
    }

    /**
     * Gets the value of the outRequestUsrCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutRequestUsrCode() {
        return outRequestUsrCode;
    }

    /**
     * Sets the value of the outRequestUsrCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutRequestUsrCode(String value) {
        this.outRequestUsrCode = value;
    }

    /**
     * Gets the value of the outServiceTrxjustFxType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutServiceTrxjustFxType() {
        return outServiceTrxjustFxType;
    }

    /**
     * Sets the value of the outServiceTrxjustFxType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutServiceTrxjustFxType(String value) {
        this.outServiceTrxjustFxType = value;
    }

    /**
     * Gets the value of the outSourceCountersCntr property.
     * 
     */
    public double getOutSourceCountersCntr() {
        return outSourceCountersCntr;
    }

    /**
     * Sets the value of the outSourceCountersCntr property.
     * 
     */
    public void setOutSourceCountersCntr(double value) {
        this.outSourceCountersCntr = value;
    }

    /**
     * Gets the value of the outSourceCurrencyEuroLockedRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutSourceCurrencyEuroLockedRate() {
        return outSourceCurrencyEuroLockedRate;
    }

    /**
     * Sets the value of the outSourceCurrencyEuroLockedRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutSourceCurrencyEuroLockedRate(BigDecimal value) {
        this.outSourceCurrencyEuroLockedRate = value;
    }

    /**
     * Gets the value of the outSourceCurrencyIdCurrency property.
     * 
     */
    public int getOutSourceCurrencyIdCurrency() {
        return outSourceCurrencyIdCurrency;
    }

    /**
     * Sets the value of the outSourceCurrencyIdCurrency property.
     * 
     */
    public void setOutSourceCurrencyIdCurrency(int value) {
        this.outSourceCurrencyIdCurrency = value;
    }

    /**
     * Gets the value of the outSourceCurrencyNationalFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSourceCurrencyNationalFlag() {
        return outSourceCurrencyNationalFlag;
    }

    /**
     * Sets the value of the outSourceCurrencyNationalFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSourceCurrencyNationalFlag(String value) {
        this.outSourceCurrencyNationalFlag = value;
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
     * Gets the value of the outSourceGenericDetailDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSourceGenericDetailDescription() {
        return outSourceGenericDetailDescription;
    }

    /**
     * Sets the value of the outSourceGenericDetailDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSourceGenericDetailDescription(String value) {
        this.outSourceGenericDetailDescription = value;
    }

    /**
     * Gets the value of the outSourceGenericDetailShortDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSourceGenericDetailShortDescription() {
        return outSourceGenericDetailShortDescription;
    }

    /**
     * Sets the value of the outSourceGenericDetailShortDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSourceGenericDetailShortDescription(String value) {
        this.outSourceGenericDetailShortDescription = value;
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
     * Gets the value of the outTargetCountersCntr property.
     * 
     */
    public double getOutTargetCountersCntr() {
        return outTargetCountersCntr;
    }

    /**
     * Sets the value of the outTargetCountersCntr property.
     * 
     */
    public void setOutTargetCountersCntr(double value) {
        this.outTargetCountersCntr = value;
    }

    /**
     * Gets the value of the outTargetCurrencyEuroLockedRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutTargetCurrencyEuroLockedRate() {
        return outTargetCurrencyEuroLockedRate;
    }

    /**
     * Sets the value of the outTargetCurrencyEuroLockedRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutTargetCurrencyEuroLockedRate(BigDecimal value) {
        this.outTargetCurrencyEuroLockedRate = value;
    }

    /**
     * Gets the value of the outTargetCurrencyIdCurrency property.
     * 
     */
    public int getOutTargetCurrencyIdCurrency() {
        return outTargetCurrencyIdCurrency;
    }

    /**
     * Sets the value of the outTargetCurrencyIdCurrency property.
     * 
     */
    public void setOutTargetCurrencyIdCurrency(int value) {
        this.outTargetCurrencyIdCurrency = value;
    }

    /**
     * Gets the value of the outTargetCurrencyNationalFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutTargetCurrencyNationalFlag() {
        return outTargetCurrencyNationalFlag;
    }

    /**
     * Sets the value of the outTargetCurrencyNationalFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutTargetCurrencyNationalFlag(String value) {
        this.outTargetCurrencyNationalFlag = value;
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
     * Gets the value of the outTargetGenericDetailDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutTargetGenericDetailDescription() {
        return outTargetGenericDetailDescription;
    }

    /**
     * Sets the value of the outTargetGenericDetailDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutTargetGenericDetailDescription(String value) {
        this.outTargetGenericDetailDescription = value;
    }

    /**
     * Gets the value of the outTargetGenericDetailShortDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutTargetGenericDetailShortDescription() {
        return outTargetGenericDetailShortDescription;
    }

    /**
     * Sets the value of the outTargetGenericDetailShortDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutTargetGenericDetailShortDescription(String value) {
        this.outTargetGenericDetailShortDescription = value;
    }

    /**
     * Gets the value of the outTeamInformationAccountCode property.
     * 
     */
    public double getOutTeamInformationAccountCode() {
        return outTeamInformationAccountCode;
    }

    /**
     * Sets the value of the outTeamInformationAccountCode property.
     * 
     */
    public void setOutTeamInformationAccountCode(double value) {
        this.outTeamInformationAccountCode = value;
    }

    /**
     * Gets the value of the outTeamInformationAuthorisationType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutTeamInformationAuthorisationType() {
        return outTeamInformationAuthorisationType;
    }

    /**
     * Sets the value of the outTeamInformationAuthorisationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutTeamInformationAuthorisationType(String value) {
        this.outTeamInformationAuthorisationType = value;
    }

    /**
     * Gets the value of the outTeamInformationAuthorizationResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutTeamInformationAuthorizationResult() {
        return outTeamInformationAuthorizationResult;
    }

    /**
     * Sets the value of the outTeamInformationAuthorizationResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutTeamInformationAuthorizationResult(String value) {
        this.outTeamInformationAuthorizationResult = value;
    }

    /**
     * Gets the value of the outTeamInformationAuthorizationType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutTeamInformationAuthorizationType() {
        return outTeamInformationAuthorizationType;
    }

    /**
     * Sets the value of the outTeamInformationAuthorizationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutTeamInformationAuthorizationType(String value) {
        this.outTeamInformationAuthorizationType = value;
    }

    /**
     * Gets the value of the outTeamInformationAvailableDateSpread property.
     * 
     */
    public short getOutTeamInformationAvailableDateSpread() {
        return outTeamInformationAvailableDateSpread;
    }

    /**
     * Sets the value of the outTeamInformationAvailableDateSpread property.
     * 
     */
    public void setOutTeamInformationAvailableDateSpread(short value) {
        this.outTeamInformationAvailableDateSpread = value;
    }

    /**
     * Gets the value of the outTeamInformationChargeDiscount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutTeamInformationChargeDiscount() {
        return outTeamInformationChargeDiscount;
    }

    /**
     * Sets the value of the outTeamInformationChargeDiscount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutTeamInformationChargeDiscount(BigDecimal value) {
        this.outTeamInformationChargeDiscount = value;
    }

    /**
     * Gets the value of the outTeamInformationCommissionDiscount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutTeamInformationCommissionDiscount() {
        return outTeamInformationCommissionDiscount;
    }

    /**
     * Sets the value of the outTeamInformationCommissionDiscount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutTeamInformationCommissionDiscount(BigDecimal value) {
        this.outTeamInformationCommissionDiscount = value;
    }

    /**
     * Gets the value of the outTeamInformationCreditInterestRateSpread property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutTeamInformationCreditInterestRateSpread() {
        return outTeamInformationCreditInterestRateSpread;
    }

    /**
     * Sets the value of the outTeamInformationCreditInterestRateSpread property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutTeamInformationCreditInterestRateSpread(BigDecimal value) {
        this.outTeamInformationCreditInterestRateSpread = value;
    }

    /**
     * Gets the value of the outTeamInformationCustomerCode property.
     * 
     */
    public int getOutTeamInformationCustomerCode() {
        return outTeamInformationCustomerCode;
    }

    /**
     * Sets the value of the outTeamInformationCustomerCode property.
     * 
     */
    public void setOutTeamInformationCustomerCode(int value) {
        this.outTeamInformationCustomerCode = value;
    }

    /**
     * Gets the value of the outTeamInformationCustomerSurname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutTeamInformationCustomerSurname() {
        return outTeamInformationCustomerSurname;
    }

    /**
     * Sets the value of the outTeamInformationCustomerSurname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutTeamInformationCustomerSurname(String value) {
        this.outTeamInformationCustomerSurname = value;
    }

    /**
     * Gets the value of the outTeamInformationDebitInterestRateSpread property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutTeamInformationDebitInterestRateSpread() {
        return outTeamInformationDebitInterestRateSpread;
    }

    /**
     * Sets the value of the outTeamInformationDebitInterestRateSpread property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutTeamInformationDebitInterestRateSpread(BigDecimal value) {
        this.outTeamInformationDebitInterestRateSpread = value;
    }

    /**
     * Gets the value of the outTeamInformationEvaluationResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutTeamInformationEvaluationResult() {
        return outTeamInformationEvaluationResult;
    }

    /**
     * Sets the value of the outTeamInformationEvaluationResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutTeamInformationEvaluationResult(String value) {
        this.outTeamInformationEvaluationResult = value;
    }

    /**
     * Gets the value of the outTeamInformationInterestRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutTeamInformationInterestRate() {
        return outTeamInformationInterestRate;
    }

    /**
     * Sets the value of the outTeamInformationInterestRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutTeamInformationInterestRate(BigDecimal value) {
        this.outTeamInformationInterestRate = value;
    }

    /**
     * Gets the value of the outTeamInformationJustificationDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutTeamInformationJustificationDescription() {
        return outTeamInformationJustificationDescription;
    }

    /**
     * Sets the value of the outTeamInformationJustificationDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutTeamInformationJustificationDescription(String value) {
        this.outTeamInformationJustificationDescription = value;
    }

    /**
     * Gets the value of the outTeamInformationJustificationId property.
     * 
     */
    public int getOutTeamInformationJustificationId() {
        return outTeamInformationJustificationId;
    }

    /**
     * Sets the value of the outTeamInformationJustificationId property.
     * 
     */
    public void setOutTeamInformationJustificationId(int value) {
        this.outTeamInformationJustificationId = value;
    }

    /**
     * Gets the value of the outTeamInformationLoanStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutTeamInformationLoanStatus() {
        return outTeamInformationLoanStatus;
    }

    /**
     * Sets the value of the outTeamInformationLoanStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutTeamInformationLoanStatus(String value) {
        this.outTeamInformationLoanStatus = value;
    }

    /**
     * Gets the value of the outTeamInformationOverdraftAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutTeamInformationOverdraftAmount() {
        return outTeamInformationOverdraftAmount;
    }

    /**
     * Sets the value of the outTeamInformationOverdraftAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutTeamInformationOverdraftAmount(BigDecimal value) {
        this.outTeamInformationOverdraftAmount = value;
    }

    /**
     * Gets the value of the outTeamInformationOverdraftSpread property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutTeamInformationOverdraftSpread() {
        return outTeamInformationOverdraftSpread;
    }

    /**
     * Sets the value of the outTeamInformationOverdraftSpread property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutTeamInformationOverdraftSpread(BigDecimal value) {
        this.outTeamInformationOverdraftSpread = value;
    }

    /**
     * Gets the value of the outTeamInformationPenaltyDiscount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutTeamInformationPenaltyDiscount() {
        return outTeamInformationPenaltyDiscount;
    }

    /**
     * Sets the value of the outTeamInformationPenaltyDiscount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutTeamInformationPenaltyDiscount(BigDecimal value) {
        this.outTeamInformationPenaltyDiscount = value;
    }

    /**
     * Gets the value of the outTeamInformationPenaltyRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutTeamInformationPenaltyRate() {
        return outTeamInformationPenaltyRate;
    }

    /**
     * Sets the value of the outTeamInformationPenaltyRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutTeamInformationPenaltyRate(BigDecimal value) {
        this.outTeamInformationPenaltyRate = value;
    }

    /**
     * Gets the value of the outTeamInformationProductDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutTeamInformationProductDescription() {
        return outTeamInformationProductDescription;
    }

    /**
     * Sets the value of the outTeamInformationProductDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutTeamInformationProductDescription(String value) {
        this.outTeamInformationProductDescription = value;
    }

    /**
     * Gets the value of the outTeamInformationProductId property.
     * 
     */
    public int getOutTeamInformationProductId() {
        return outTeamInformationProductId;
    }

    /**
     * Sets the value of the outTeamInformationProductId property.
     * 
     */
    public void setOutTeamInformationProductId(int value) {
        this.outTeamInformationProductId = value;
    }

    /**
     * Gets the value of the outTeamInformationRequiredProfile1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutTeamInformationRequiredProfile1() {
        return outTeamInformationRequiredProfile1;
    }

    /**
     * Sets the value of the outTeamInformationRequiredProfile1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutTeamInformationRequiredProfile1(String value) {
        this.outTeamInformationRequiredProfile1 = value;
    }

    /**
     * Gets the value of the outTeamInformationRequiredProfile2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutTeamInformationRequiredProfile2() {
        return outTeamInformationRequiredProfile2;
    }

    /**
     * Sets the value of the outTeamInformationRequiredProfile2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutTeamInformationRequiredProfile2(String value) {
        this.outTeamInformationRequiredProfile2 = value;
    }

    /**
     * Gets the value of the outTeamInformationServicePenaltySpread property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutTeamInformationServicePenaltySpread() {
        return outTeamInformationServicePenaltySpread;
    }

    /**
     * Sets the value of the outTeamInformationServicePenaltySpread property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutTeamInformationServicePenaltySpread(BigDecimal value) {
        this.outTeamInformationServicePenaltySpread = value;
    }

    /**
     * Gets the value of the outTeamInformationSuper1Code property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutTeamInformationSuper1Code() {
        return outTeamInformationSuper1Code;
    }

    /**
     * Sets the value of the outTeamInformationSuper1Code property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutTeamInformationSuper1Code(String value) {
        this.outTeamInformationSuper1Code = value;
    }

    /**
     * Gets the value of the outTeamInformationSuper1TerminalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutTeamInformationSuper1TerminalId() {
        return outTeamInformationSuper1TerminalId;
    }

    /**
     * Sets the value of the outTeamInformationSuper1TerminalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutTeamInformationSuper1TerminalId(String value) {
        this.outTeamInformationSuper1TerminalId = value;
    }

    /**
     * Gets the value of the outTeamInformationSuper2Code property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutTeamInformationSuper2Code() {
        return outTeamInformationSuper2Code;
    }

    /**
     * Sets the value of the outTeamInformationSuper2Code property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutTeamInformationSuper2Code(String value) {
        this.outTeamInformationSuper2Code = value;
    }

    /**
     * Gets the value of the outTeamInformationSuper2TerminalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutTeamInformationSuper2TerminalId() {
        return outTeamInformationSuper2TerminalId;
    }

    /**
     * Sets the value of the outTeamInformationSuper2TerminalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutTeamInformationSuper2TerminalId(String value) {
        this.outTeamInformationSuper2TerminalId = value;
    }

    /**
     * Gets the value of the outTeamInformationTeamComments property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutTeamInformationTeamComments() {
        return outTeamInformationTeamComments;
    }

    /**
     * Sets the value of the outTeamInformationTeamComments property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutTeamInformationTeamComments(String value) {
        this.outTeamInformationTeamComments = value;
    }

    /**
     * Gets the value of the outTeamInformationTransactionDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutTeamInformationTransactionDescription() {
        return outTeamInformationTransactionDescription;
    }

    /**
     * Sets the value of the outTeamInformationTransactionDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutTeamInformationTransactionDescription(String value) {
        this.outTeamInformationTransactionDescription = value;
    }

    /**
     * Gets the value of the outTeamInformationTransactionId property.
     * 
     */
    public int getOutTeamInformationTransactionId() {
        return outTeamInformationTransactionId;
    }

    /**
     * Sets the value of the outTeamInformationTransactionId property.
     * 
     */
    public void setOutTeamInformationTransactionId(int value) {
        this.outTeamInformationTransactionId = value;
    }

    /**
     * Gets the value of the outTeamInformationTrsAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutTeamInformationTrsAmount() {
        return outTeamInformationTrsAmount;
    }

    /**
     * Sets the value of the outTeamInformationTrsAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutTeamInformationTrsAmount(BigDecimal value) {
        this.outTeamInformationTrsAmount = value;
    }

    /**
     * Gets the value of the outTeamInformationUnclearWithdrawalFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutTeamInformationUnclearWithdrawalFlag() {
        return outTeamInformationUnclearWithdrawalFlag;
    }

    /**
     * Sets the value of the outTeamInformationUnclearWithdrawalFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutTeamInformationUnclearWithdrawalFlag(String value) {
        this.outTeamInformationUnclearWithdrawalFlag = value;
    }

    /**
     * Gets the value of the outTeamInformationUnitCode property.
     * 
     */
    public int getOutTeamInformationUnitCode() {
        return outTeamInformationUnitCode;
    }

    /**
     * Sets the value of the outTeamInformationUnitCode property.
     * 
     */
    public void setOutTeamInformationUnitCode(int value) {
        this.outTeamInformationUnitCode = value;
    }

    /**
     * Gets the value of the outTeamInformationUserCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutTeamInformationUserCode() {
        return outTeamInformationUserCode;
    }

    /**
     * Sets the value of the outTeamInformationUserCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutTeamInformationUserCode(String value) {
        this.outTeamInformationUserCode = value;
    }

    /**
     * Gets the value of the outTeamInformationUserProfile1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutTeamInformationUserProfile1() {
        return outTeamInformationUserProfile1;
    }

    /**
     * Sets the value of the outTeamInformationUserProfile1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutTeamInformationUserProfile1(String value) {
        this.outTeamInformationUserProfile1 = value;
    }

    /**
     * Gets the value of the outTeamInformationUserProfile2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutTeamInformationUserProfile2() {
        return outTeamInformationUserProfile2;
    }

    /**
     * Sets the value of the outTeamInformationUserProfile2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutTeamInformationUserProfile2(String value) {
        this.outTeamInformationUserProfile2 = value;
    }

    /**
     * Gets the value of the outTeamInformationUserProfile3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutTeamInformationUserProfile3() {
        return outTeamInformationUserProfile3;
    }

    /**
     * Sets the value of the outTeamInformationUserProfile3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutTeamInformationUserProfile3(String value) {
        this.outTeamInformationUserProfile3 = value;
    }

    /**
     * Gets the value of the outTeamInformationUserSurname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutTeamInformationUserSurname() {
        return outTeamInformationUserSurname;
    }

    /**
     * Sets the value of the outTeamInformationUserSurname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutTeamInformationUserSurname(String value) {
        this.outTeamInformationUserSurname = value;
    }

    /**
     * Gets the value of the outTeamInformationUserTerminalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutTeamInformationUserTerminalId() {
        return outTeamInformationUserTerminalId;
    }

    /**
     * Sets the value of the outTeamInformationUserTerminalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutTeamInformationUserTerminalId(String value) {
        this.outTeamInformationUserTerminalId = value;
    }

    /**
     * Gets the value of the outTeamInformationValueDateSpread property.
     * 
     */
    public short getOutTeamInformationValueDateSpread() {
        return outTeamInformationValueDateSpread;
    }

    /**
     * Sets the value of the outTeamInformationValueDateSpread property.
     * 
     */
    public void setOutTeamInformationValueDateSpread(short value) {
        this.outTeamInformationValueDateSpread = value;
    }

    /**
     * Gets the value of the outTrxCountTrxCounter property.
     * 
     */
    public int getOutTrxCountTrxCounter() {
        return outTrxCountTrxCounter;
    }

    /**
     * Sets the value of the outTrxCountTrxCounter property.
     * 
     */
    public void setOutTrxCountTrxCounter(int value) {
        this.outTrxCountTrxCounter = value;
    }

}
