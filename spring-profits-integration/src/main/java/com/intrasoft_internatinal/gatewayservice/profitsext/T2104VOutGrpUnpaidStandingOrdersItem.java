
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for T2104VOutGrpUnpaidStandingOrdersItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="T2104VOutGrpUnpaidStandingOrdersItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OutGrpUnpaidStandingOrdersOutGrmAvailBalanceNowDepositAccountBookBalance" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpUnpaidStandingOrdersOutGrmCrAccountListDepositAccountAccountNumber" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OutGrpUnpaidStandingOrdersOutGrmCrAccountListDepositAccountAvailableBalance" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpUnpaidStandingOrdersOutGrmCrAccountListDepositAccountCDigit" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutGrpUnpaidStandingOrdersOutGrmCrCustomerCustomerCustId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGrpUnpaidStandingOrdersOutGrmCrProfitsAccountAccountCd" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutGrpUnpaidStandingOrdersOutGrmCrProfitsAccountAccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpUnpaidStandingOrdersOutGrmCustNameLnsSuppliedName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpUnpaidStandingOrdersOutGrmDpProfitsAccountAccountCd" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutGrpUnpaidStandingOrdersOutGrmDpProfitsAccountAccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpUnpaidStandingOrdersOutGrmDrAccountListDepositAccountAccountNumber" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OutGrpUnpaidStandingOrdersOutGrmDrAccountListDepositAccountAvailableBalance" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpUnpaidStandingOrdersOutGrmDrAccountListDepositAccountCDigit" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutGrpUnpaidStandingOrdersOutGrmDrCustomerCDigit" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutGrpUnpaidStandingOrdersOutGrmDrCustomerCustId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGrpUnpaidStandingOrdersOutGrmDrDepositListJustificDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpUnpaidStandingOrdersOutGrmDrJustificDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpUnpaidStandingOrdersOutGrmDrJustificIdJustific" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGrpUnpaidStandingOrdersOutGrmHistSoCommitmentActualPaymentAmnt" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpUnpaidStandingOrdersOutGrmHistSoCommitmentAvailableBalance" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpUnpaidStandingOrdersOutGrmHistSoCommitmentCrAccountNumber" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OutGrpUnpaidStandingOrdersOutGrmHistSoCommitmentDrAccountNumber" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OutGrpUnpaidStandingOrdersOutGrmHistSoCommitmentEntryStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpUnpaidStandingOrdersOutGrmHistSoCommitmentExecutionDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutGrpUnpaidStandingOrdersOutGrmHistSoCommitmentOrderNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGrpUnpaidStandingOrdersOutGrmHistSoCommitmentPaymentAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpUnpaidStandingOrdersOutGrmIefSuppliedComments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpUnpaidStandingOrdersOutGrmJustificNotExecJustificDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpUnpaidStandingOrdersOutGrmLoanProfitsAccountAccountCd" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutGrpUnpaidStandingOrdersOutGrmLoanProfitsAccountAccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpUnpaidStandingOrdersOutGrmRmUsrCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpUnpaidStandingOrdersOutGrmSelectionIefSuppliedSelectChar" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpUnpaidStandingOrdersOutGrmStandingOrderTpSoCommitmentActivationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutGrpUnpaidStandingOrdersOutGrmStandingOrderTpSoCommitmentBpBenefAddress1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpUnpaidStandingOrdersOutGrmStandingOrderTpSoCommitmentBpBenefAddress2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpUnpaidStandingOrdersOutGrmStandingOrderTpSoCommitmentBpBenefAddress3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpUnpaidStandingOrdersOutGrmStandingOrderTpSoCommitmentBpBenefCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpUnpaidStandingOrdersOutGrmStandingOrderTpSoCommitmentBpBenefCountry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpUnpaidStandingOrdersOutGrmStandingOrderTpSoCommitmentBpBenefName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpUnpaidStandingOrdersOutGrmStandingOrderTpSoCommitmentBpBenefZipCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpUnpaidStandingOrdersOutGrmStandingOrderTpSoCommitmentCountryCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpUnpaidStandingOrdersOutGrmStandingOrderTpSoCommitmentCrAccCustomerCd" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutGrpUnpaidStandingOrdersOutGrmStandingOrderTpSoCommitmentCrAccCustomerId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGrpUnpaidStandingOrdersOutGrmStandingOrderTpSoCommitmentDrAccCustomerCd" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutGrpUnpaidStandingOrdersOutGrmStandingOrderTpSoCommitmentDrAccCustomerId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGrpUnpaidStandingOrdersOutGrmStandingOrderTpSoCommitmentEntryStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpUnpaidStandingOrdersOutGrmStandingOrderTpSoCommitmentFirstPaymentAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpUnpaidStandingOrdersOutGrmStandingOrderTpSoCommitmentFirstPaymentDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutGrpUnpaidStandingOrdersOutGrmStandingOrderTpSoCommitmentFrequency" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutGrpUnpaidStandingOrdersOutGrmStandingOrderTpSoCommitmentFrequencyUnit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpUnpaidStandingOrdersOutGrmStandingOrderTpSoCommitmentIssueDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutGrpUnpaidStandingOrdersOutGrmStandingOrderTpSoCommitmentLastPaymentAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpUnpaidStandingOrdersOutGrmStandingOrderTpSoCommitmentLastPaymentDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutGrpUnpaidStandingOrdersOutGrmStandingOrderTpSoCommitmentLastTransferDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutGrpUnpaidStandingOrdersOutGrmStandingOrderTpSoCommitmentLastUpdateDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutGrpUnpaidStandingOrdersOutGrmStandingOrderTpSoCommitmentMaxNoOfAttempts" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutGrpUnpaidStandingOrdersOutGrmStandingOrderTpSoCommitmentPaymentAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpUnpaidStandingOrdersOutGrmStandingOrderTpSoCommitmentStandOrderMethod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpUnpaidStandingOrdersOutGrmStandingOrderTpSoCommitmentSuspensDateFrom" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutGrpUnpaidStandingOrdersOutGrmStandingOrderTpSoCommitmentSuspensDateTo" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutGrpUnpaidStandingOrdersOutGrmStandingOrderTpSoCommitmentSuspensExecutions" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpUnpaidStandingOrdersOutGrmStandingOrderTpSoCommitmentTotalAvailableTr" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGrpUnpaidStandingOrdersOutGrmStandingOrderTpSoCommitmentTpSoIdentifier" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OutGrpUnpaidStandingOrdersOutGrmTpCrAccCurrencyIdCurrency" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGrpUnpaidStandingOrdersOutGrmTpCrAccCurrencyShortDescr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpUnpaidStandingOrdersOutGrmTpCrCustCurrencyIdCurrency" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGrpUnpaidStandingOrdersOutGrmTpCrCustCurrencyShortDescr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpUnpaidStandingOrdersOutGrmTpDrAccCurrencyIdCurrency" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGrpUnpaidStandingOrdersOutGrmTpDrAccCurrencyShortDescr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpUnpaidStandingOrdersOutGrmTpDrCustCurrencyIdCurrency" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGrpUnpaidStandingOrdersOutGrmTpDrCustCurrencyShortDescr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpUnpaidStandingOrdersOutGrmUnitUnitCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "T2104VOutGrpUnpaidStandingOrdersItem", propOrder = {
    "outGrpUnpaidStandingOrdersOutGrmAvailBalanceNowDepositAccountBookBalance",
    "outGrpUnpaidStandingOrdersOutGrmCrAccountListDepositAccountAccountNumber",
    "outGrpUnpaidStandingOrdersOutGrmCrAccountListDepositAccountAvailableBalance",
    "outGrpUnpaidStandingOrdersOutGrmCrAccountListDepositAccountCDigit",
    "outGrpUnpaidStandingOrdersOutGrmCrCustomerCustomerCustId",
    "outGrpUnpaidStandingOrdersOutGrmCrProfitsAccountAccountCd",
    "outGrpUnpaidStandingOrdersOutGrmCrProfitsAccountAccountNumber",
    "outGrpUnpaidStandingOrdersOutGrmCustNameLnsSuppliedName",
    "outGrpUnpaidStandingOrdersOutGrmDpProfitsAccountAccountCd",
    "outGrpUnpaidStandingOrdersOutGrmDpProfitsAccountAccountNumber",
    "outGrpUnpaidStandingOrdersOutGrmDrAccountListDepositAccountAccountNumber",
    "outGrpUnpaidStandingOrdersOutGrmDrAccountListDepositAccountAvailableBalance",
    "outGrpUnpaidStandingOrdersOutGrmDrAccountListDepositAccountCDigit",
    "outGrpUnpaidStandingOrdersOutGrmDrCustomerCDigit",
    "outGrpUnpaidStandingOrdersOutGrmDrCustomerCustId",
    "outGrpUnpaidStandingOrdersOutGrmDrDepositListJustificDescription",
    "outGrpUnpaidStandingOrdersOutGrmDrJustificDescription",
    "outGrpUnpaidStandingOrdersOutGrmDrJustificIdJustific",
    "outGrpUnpaidStandingOrdersOutGrmHistSoCommitmentActualPaymentAmnt",
    "outGrpUnpaidStandingOrdersOutGrmHistSoCommitmentAvailableBalance",
    "outGrpUnpaidStandingOrdersOutGrmHistSoCommitmentCrAccountNumber",
    "outGrpUnpaidStandingOrdersOutGrmHistSoCommitmentDrAccountNumber",
    "outGrpUnpaidStandingOrdersOutGrmHistSoCommitmentEntryStatus",
    "outGrpUnpaidStandingOrdersOutGrmHistSoCommitmentExecutionDate",
    "outGrpUnpaidStandingOrdersOutGrmHistSoCommitmentOrderNumber",
    "outGrpUnpaidStandingOrdersOutGrmHistSoCommitmentPaymentAmount",
    "outGrpUnpaidStandingOrdersOutGrmIefSuppliedComments",
    "outGrpUnpaidStandingOrdersOutGrmJustificNotExecJustificDescription",
    "outGrpUnpaidStandingOrdersOutGrmLoanProfitsAccountAccountCd",
    "outGrpUnpaidStandingOrdersOutGrmLoanProfitsAccountAccountNumber",
    "outGrpUnpaidStandingOrdersOutGrmRmUsrCode",
    "outGrpUnpaidStandingOrdersOutGrmSelectionIefSuppliedSelectChar",
    "outGrpUnpaidStandingOrdersOutGrmStandingOrderTpSoCommitmentActivationDate",
    "outGrpUnpaidStandingOrdersOutGrmStandingOrderTpSoCommitmentBpBenefAddress1",
    "outGrpUnpaidStandingOrdersOutGrmStandingOrderTpSoCommitmentBpBenefAddress2",
    "outGrpUnpaidStandingOrdersOutGrmStandingOrderTpSoCommitmentBpBenefAddress3",
    "outGrpUnpaidStandingOrdersOutGrmStandingOrderTpSoCommitmentBpBenefCity",
    "outGrpUnpaidStandingOrdersOutGrmStandingOrderTpSoCommitmentBpBenefCountry",
    "outGrpUnpaidStandingOrdersOutGrmStandingOrderTpSoCommitmentBpBenefName",
    "outGrpUnpaidStandingOrdersOutGrmStandingOrderTpSoCommitmentBpBenefZipCode",
    "outGrpUnpaidStandingOrdersOutGrmStandingOrderTpSoCommitmentCountryCode",
    "outGrpUnpaidStandingOrdersOutGrmStandingOrderTpSoCommitmentCrAccCustomerCd",
    "outGrpUnpaidStandingOrdersOutGrmStandingOrderTpSoCommitmentCrAccCustomerId",
    "outGrpUnpaidStandingOrdersOutGrmStandingOrderTpSoCommitmentDrAccCustomerCd",
    "outGrpUnpaidStandingOrdersOutGrmStandingOrderTpSoCommitmentDrAccCustomerId",
    "outGrpUnpaidStandingOrdersOutGrmStandingOrderTpSoCommitmentEntryStatus",
    "outGrpUnpaidStandingOrdersOutGrmStandingOrderTpSoCommitmentFirstPaymentAmn",
    "outGrpUnpaidStandingOrdersOutGrmStandingOrderTpSoCommitmentFirstPaymentDate",
    "outGrpUnpaidStandingOrdersOutGrmStandingOrderTpSoCommitmentFrequency",
    "outGrpUnpaidStandingOrdersOutGrmStandingOrderTpSoCommitmentFrequencyUnit",
    "outGrpUnpaidStandingOrdersOutGrmStandingOrderTpSoCommitmentIssueDate",
    "outGrpUnpaidStandingOrdersOutGrmStandingOrderTpSoCommitmentLastPaymentAmn",
    "outGrpUnpaidStandingOrdersOutGrmStandingOrderTpSoCommitmentLastPaymentDate",
    "outGrpUnpaidStandingOrdersOutGrmStandingOrderTpSoCommitmentLastTransferDate",
    "outGrpUnpaidStandingOrdersOutGrmStandingOrderTpSoCommitmentLastUpdateDate",
    "outGrpUnpaidStandingOrdersOutGrmStandingOrderTpSoCommitmentMaxNoOfAttempts",
    "outGrpUnpaidStandingOrdersOutGrmStandingOrderTpSoCommitmentPaymentAmount",
    "outGrpUnpaidStandingOrdersOutGrmStandingOrderTpSoCommitmentStandOrderMethod",
    "outGrpUnpaidStandingOrdersOutGrmStandingOrderTpSoCommitmentSuspensDateFrom",
    "outGrpUnpaidStandingOrdersOutGrmStandingOrderTpSoCommitmentSuspensDateTo",
    "outGrpUnpaidStandingOrdersOutGrmStandingOrderTpSoCommitmentSuspensExecutions",
    "outGrpUnpaidStandingOrdersOutGrmStandingOrderTpSoCommitmentTotalAvailableTr",
    "outGrpUnpaidStandingOrdersOutGrmStandingOrderTpSoCommitmentTpSoIdentifier",
    "outGrpUnpaidStandingOrdersOutGrmTpCrAccCurrencyIdCurrency",
    "outGrpUnpaidStandingOrdersOutGrmTpCrAccCurrencyShortDescr",
    "outGrpUnpaidStandingOrdersOutGrmTpCrCustCurrencyIdCurrency",
    "outGrpUnpaidStandingOrdersOutGrmTpCrCustCurrencyShortDescr",
    "outGrpUnpaidStandingOrdersOutGrmTpDrAccCurrencyIdCurrency",
    "outGrpUnpaidStandingOrdersOutGrmTpDrAccCurrencyShortDescr",
    "outGrpUnpaidStandingOrdersOutGrmTpDrCustCurrencyIdCurrency",
    "outGrpUnpaidStandingOrdersOutGrmTpDrCustCurrencyShortDescr",
    "outGrpUnpaidStandingOrdersOutGrmUnitUnitCode"
})
public class T2104VOutGrpUnpaidStandingOrdersItem {

    @XmlElement(name = "OutGrpUnpaidStandingOrdersOutGrmAvailBalanceNowDepositAccountBookBalance", required = true)
    protected BigDecimal outGrpUnpaidStandingOrdersOutGrmAvailBalanceNowDepositAccountBookBalance;
    @XmlElement(name = "OutGrpUnpaidStandingOrdersOutGrmCrAccountListDepositAccountAccountNumber")
    protected double outGrpUnpaidStandingOrdersOutGrmCrAccountListDepositAccountAccountNumber;
    @XmlElement(name = "OutGrpUnpaidStandingOrdersOutGrmCrAccountListDepositAccountAvailableBalance", required = true)
    protected BigDecimal outGrpUnpaidStandingOrdersOutGrmCrAccountListDepositAccountAvailableBalance;
    @XmlElement(name = "OutGrpUnpaidStandingOrdersOutGrmCrAccountListDepositAccountCDigit")
    protected short outGrpUnpaidStandingOrdersOutGrmCrAccountListDepositAccountCDigit;
    @XmlElement(name = "OutGrpUnpaidStandingOrdersOutGrmCrCustomerCustomerCustId")
    protected int outGrpUnpaidStandingOrdersOutGrmCrCustomerCustomerCustId;
    @XmlElement(name = "OutGrpUnpaidStandingOrdersOutGrmCrProfitsAccountAccountCd")
    protected short outGrpUnpaidStandingOrdersOutGrmCrProfitsAccountAccountCd;
    @XmlElement(name = "OutGrpUnpaidStandingOrdersOutGrmCrProfitsAccountAccountNumber")
    protected String outGrpUnpaidStandingOrdersOutGrmCrProfitsAccountAccountNumber;
    @XmlElement(name = "OutGrpUnpaidStandingOrdersOutGrmCustNameLnsSuppliedName")
    protected String outGrpUnpaidStandingOrdersOutGrmCustNameLnsSuppliedName;
    @XmlElement(name = "OutGrpUnpaidStandingOrdersOutGrmDpProfitsAccountAccountCd")
    protected short outGrpUnpaidStandingOrdersOutGrmDpProfitsAccountAccountCd;
    @XmlElement(name = "OutGrpUnpaidStandingOrdersOutGrmDpProfitsAccountAccountNumber")
    protected String outGrpUnpaidStandingOrdersOutGrmDpProfitsAccountAccountNumber;
    @XmlElement(name = "OutGrpUnpaidStandingOrdersOutGrmDrAccountListDepositAccountAccountNumber")
    protected double outGrpUnpaidStandingOrdersOutGrmDrAccountListDepositAccountAccountNumber;
    @XmlElement(name = "OutGrpUnpaidStandingOrdersOutGrmDrAccountListDepositAccountAvailableBalance", required = true)
    protected BigDecimal outGrpUnpaidStandingOrdersOutGrmDrAccountListDepositAccountAvailableBalance;
    @XmlElement(name = "OutGrpUnpaidStandingOrdersOutGrmDrAccountListDepositAccountCDigit")
    protected short outGrpUnpaidStandingOrdersOutGrmDrAccountListDepositAccountCDigit;
    @XmlElement(name = "OutGrpUnpaidStandingOrdersOutGrmDrCustomerCDigit")
    protected short outGrpUnpaidStandingOrdersOutGrmDrCustomerCDigit;
    @XmlElement(name = "OutGrpUnpaidStandingOrdersOutGrmDrCustomerCustId")
    protected int outGrpUnpaidStandingOrdersOutGrmDrCustomerCustId;
    @XmlElement(name = "OutGrpUnpaidStandingOrdersOutGrmDrDepositListJustificDescription")
    protected String outGrpUnpaidStandingOrdersOutGrmDrDepositListJustificDescription;
    @XmlElement(name = "OutGrpUnpaidStandingOrdersOutGrmDrJustificDescription")
    protected String outGrpUnpaidStandingOrdersOutGrmDrJustificDescription;
    @XmlElement(name = "OutGrpUnpaidStandingOrdersOutGrmDrJustificIdJustific")
    protected int outGrpUnpaidStandingOrdersOutGrmDrJustificIdJustific;
    @XmlElement(name = "OutGrpUnpaidStandingOrdersOutGrmHistSoCommitmentActualPaymentAmnt", required = true)
    protected BigDecimal outGrpUnpaidStandingOrdersOutGrmHistSoCommitmentActualPaymentAmnt;
    @XmlElement(name = "OutGrpUnpaidStandingOrdersOutGrmHistSoCommitmentAvailableBalance", required = true)
    protected BigDecimal outGrpUnpaidStandingOrdersOutGrmHistSoCommitmentAvailableBalance;
    @XmlElement(name = "OutGrpUnpaidStandingOrdersOutGrmHistSoCommitmentCrAccountNumber")
    protected double outGrpUnpaidStandingOrdersOutGrmHistSoCommitmentCrAccountNumber;
    @XmlElement(name = "OutGrpUnpaidStandingOrdersOutGrmHistSoCommitmentDrAccountNumber")
    protected double outGrpUnpaidStandingOrdersOutGrmHistSoCommitmentDrAccountNumber;
    @XmlElement(name = "OutGrpUnpaidStandingOrdersOutGrmHistSoCommitmentEntryStatus")
    protected String outGrpUnpaidStandingOrdersOutGrmHistSoCommitmentEntryStatus;
    @XmlElement(name = "OutGrpUnpaidStandingOrdersOutGrmHistSoCommitmentExecutionDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outGrpUnpaidStandingOrdersOutGrmHistSoCommitmentExecutionDate;
    @XmlElement(name = "OutGrpUnpaidStandingOrdersOutGrmHistSoCommitmentOrderNumber")
    protected int outGrpUnpaidStandingOrdersOutGrmHistSoCommitmentOrderNumber;
    @XmlElement(name = "OutGrpUnpaidStandingOrdersOutGrmHistSoCommitmentPaymentAmount", required = true)
    protected BigDecimal outGrpUnpaidStandingOrdersOutGrmHistSoCommitmentPaymentAmount;
    @XmlElement(name = "OutGrpUnpaidStandingOrdersOutGrmIefSuppliedComments")
    protected String outGrpUnpaidStandingOrdersOutGrmIefSuppliedComments;
    @XmlElement(name = "OutGrpUnpaidStandingOrdersOutGrmJustificNotExecJustificDescription")
    protected String outGrpUnpaidStandingOrdersOutGrmJustificNotExecJustificDescription;
    @XmlElement(name = "OutGrpUnpaidStandingOrdersOutGrmLoanProfitsAccountAccountCd")
    protected short outGrpUnpaidStandingOrdersOutGrmLoanProfitsAccountAccountCd;
    @XmlElement(name = "OutGrpUnpaidStandingOrdersOutGrmLoanProfitsAccountAccountNumber")
    protected String outGrpUnpaidStandingOrdersOutGrmLoanProfitsAccountAccountNumber;
    @XmlElement(name = "OutGrpUnpaidStandingOrdersOutGrmRmUsrCode")
    protected String outGrpUnpaidStandingOrdersOutGrmRmUsrCode;
    @XmlElement(name = "OutGrpUnpaidStandingOrdersOutGrmSelectionIefSuppliedSelectChar")
    protected String outGrpUnpaidStandingOrdersOutGrmSelectionIefSuppliedSelectChar;
    @XmlElement(name = "OutGrpUnpaidStandingOrdersOutGrmStandingOrderTpSoCommitmentActivationDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outGrpUnpaidStandingOrdersOutGrmStandingOrderTpSoCommitmentActivationDate;
    @XmlElement(name = "OutGrpUnpaidStandingOrdersOutGrmStandingOrderTpSoCommitmentBpBenefAddress1")
    protected String outGrpUnpaidStandingOrdersOutGrmStandingOrderTpSoCommitmentBpBenefAddress1;
    @XmlElement(name = "OutGrpUnpaidStandingOrdersOutGrmStandingOrderTpSoCommitmentBpBenefAddress2")
    protected String outGrpUnpaidStandingOrdersOutGrmStandingOrderTpSoCommitmentBpBenefAddress2;
    @XmlElement(name = "OutGrpUnpaidStandingOrdersOutGrmStandingOrderTpSoCommitmentBpBenefAddress3")
    protected String outGrpUnpaidStandingOrdersOutGrmStandingOrderTpSoCommitmentBpBenefAddress3;
    @XmlElement(name = "OutGrpUnpaidStandingOrdersOutGrmStandingOrderTpSoCommitmentBpBenefCity")
    protected String outGrpUnpaidStandingOrdersOutGrmStandingOrderTpSoCommitmentBpBenefCity;
    @XmlElement(name = "OutGrpUnpaidStandingOrdersOutGrmStandingOrderTpSoCommitmentBpBenefCountry")
    protected String outGrpUnpaidStandingOrdersOutGrmStandingOrderTpSoCommitmentBpBenefCountry;
    @XmlElement(name = "OutGrpUnpaidStandingOrdersOutGrmStandingOrderTpSoCommitmentBpBenefName")
    protected String outGrpUnpaidStandingOrdersOutGrmStandingOrderTpSoCommitmentBpBenefName;
    @XmlElement(name = "OutGrpUnpaidStandingOrdersOutGrmStandingOrderTpSoCommitmentBpBenefZipCode")
    protected String outGrpUnpaidStandingOrdersOutGrmStandingOrderTpSoCommitmentBpBenefZipCode;
    @XmlElement(name = "OutGrpUnpaidStandingOrdersOutGrmStandingOrderTpSoCommitmentCountryCode")
    protected String outGrpUnpaidStandingOrdersOutGrmStandingOrderTpSoCommitmentCountryCode;
    @XmlElement(name = "OutGrpUnpaidStandingOrdersOutGrmStandingOrderTpSoCommitmentCrAccCustomerCd")
    protected short outGrpUnpaidStandingOrdersOutGrmStandingOrderTpSoCommitmentCrAccCustomerCd;
    @XmlElement(name = "OutGrpUnpaidStandingOrdersOutGrmStandingOrderTpSoCommitmentCrAccCustomerId")
    protected int outGrpUnpaidStandingOrdersOutGrmStandingOrderTpSoCommitmentCrAccCustomerId;
    @XmlElement(name = "OutGrpUnpaidStandingOrdersOutGrmStandingOrderTpSoCommitmentDrAccCustomerCd")
    protected short outGrpUnpaidStandingOrdersOutGrmStandingOrderTpSoCommitmentDrAccCustomerCd;
    @XmlElement(name = "OutGrpUnpaidStandingOrdersOutGrmStandingOrderTpSoCommitmentDrAccCustomerId")
    protected int outGrpUnpaidStandingOrdersOutGrmStandingOrderTpSoCommitmentDrAccCustomerId;
    @XmlElement(name = "OutGrpUnpaidStandingOrdersOutGrmStandingOrderTpSoCommitmentEntryStatus")
    protected String outGrpUnpaidStandingOrdersOutGrmStandingOrderTpSoCommitmentEntryStatus;
    @XmlElement(name = "OutGrpUnpaidStandingOrdersOutGrmStandingOrderTpSoCommitmentFirstPaymentAmn", required = true)
    protected BigDecimal outGrpUnpaidStandingOrdersOutGrmStandingOrderTpSoCommitmentFirstPaymentAmn;
    @XmlElement(name = "OutGrpUnpaidStandingOrdersOutGrmStandingOrderTpSoCommitmentFirstPaymentDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outGrpUnpaidStandingOrdersOutGrmStandingOrderTpSoCommitmentFirstPaymentDate;
    @XmlElement(name = "OutGrpUnpaidStandingOrdersOutGrmStandingOrderTpSoCommitmentFrequency")
    protected short outGrpUnpaidStandingOrdersOutGrmStandingOrderTpSoCommitmentFrequency;
    @XmlElement(name = "OutGrpUnpaidStandingOrdersOutGrmStandingOrderTpSoCommitmentFrequencyUnit")
    protected String outGrpUnpaidStandingOrdersOutGrmStandingOrderTpSoCommitmentFrequencyUnit;
    @XmlElement(name = "OutGrpUnpaidStandingOrdersOutGrmStandingOrderTpSoCommitmentIssueDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outGrpUnpaidStandingOrdersOutGrmStandingOrderTpSoCommitmentIssueDate;
    @XmlElement(name = "OutGrpUnpaidStandingOrdersOutGrmStandingOrderTpSoCommitmentLastPaymentAmn", required = true)
    protected BigDecimal outGrpUnpaidStandingOrdersOutGrmStandingOrderTpSoCommitmentLastPaymentAmn;
    @XmlElement(name = "OutGrpUnpaidStandingOrdersOutGrmStandingOrderTpSoCommitmentLastPaymentDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outGrpUnpaidStandingOrdersOutGrmStandingOrderTpSoCommitmentLastPaymentDate;
    @XmlElement(name = "OutGrpUnpaidStandingOrdersOutGrmStandingOrderTpSoCommitmentLastTransferDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outGrpUnpaidStandingOrdersOutGrmStandingOrderTpSoCommitmentLastTransferDate;
    @XmlElement(name = "OutGrpUnpaidStandingOrdersOutGrmStandingOrderTpSoCommitmentLastUpdateDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outGrpUnpaidStandingOrdersOutGrmStandingOrderTpSoCommitmentLastUpdateDate;
    @XmlElement(name = "OutGrpUnpaidStandingOrdersOutGrmStandingOrderTpSoCommitmentMaxNoOfAttempts")
    protected short outGrpUnpaidStandingOrdersOutGrmStandingOrderTpSoCommitmentMaxNoOfAttempts;
    @XmlElement(name = "OutGrpUnpaidStandingOrdersOutGrmStandingOrderTpSoCommitmentPaymentAmount", required = true)
    protected BigDecimal outGrpUnpaidStandingOrdersOutGrmStandingOrderTpSoCommitmentPaymentAmount;
    @XmlElement(name = "OutGrpUnpaidStandingOrdersOutGrmStandingOrderTpSoCommitmentStandOrderMethod")
    protected String outGrpUnpaidStandingOrdersOutGrmStandingOrderTpSoCommitmentStandOrderMethod;
    @XmlElement(name = "OutGrpUnpaidStandingOrdersOutGrmStandingOrderTpSoCommitmentSuspensDateFrom", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outGrpUnpaidStandingOrdersOutGrmStandingOrderTpSoCommitmentSuspensDateFrom;
    @XmlElement(name = "OutGrpUnpaidStandingOrdersOutGrmStandingOrderTpSoCommitmentSuspensDateTo", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outGrpUnpaidStandingOrdersOutGrmStandingOrderTpSoCommitmentSuspensDateTo;
    @XmlElement(name = "OutGrpUnpaidStandingOrdersOutGrmStandingOrderTpSoCommitmentSuspensExecutions")
    protected String outGrpUnpaidStandingOrdersOutGrmStandingOrderTpSoCommitmentSuspensExecutions;
    @XmlElement(name = "OutGrpUnpaidStandingOrdersOutGrmStandingOrderTpSoCommitmentTotalAvailableTr")
    protected int outGrpUnpaidStandingOrdersOutGrmStandingOrderTpSoCommitmentTotalAvailableTr;
    @XmlElement(name = "OutGrpUnpaidStandingOrdersOutGrmStandingOrderTpSoCommitmentTpSoIdentifier")
    protected double outGrpUnpaidStandingOrdersOutGrmStandingOrderTpSoCommitmentTpSoIdentifier;
    @XmlElement(name = "OutGrpUnpaidStandingOrdersOutGrmTpCrAccCurrencyIdCurrency")
    protected int outGrpUnpaidStandingOrdersOutGrmTpCrAccCurrencyIdCurrency;
    @XmlElement(name = "OutGrpUnpaidStandingOrdersOutGrmTpCrAccCurrencyShortDescr")
    protected String outGrpUnpaidStandingOrdersOutGrmTpCrAccCurrencyShortDescr;
    @XmlElement(name = "OutGrpUnpaidStandingOrdersOutGrmTpCrCustCurrencyIdCurrency")
    protected int outGrpUnpaidStandingOrdersOutGrmTpCrCustCurrencyIdCurrency;
    @XmlElement(name = "OutGrpUnpaidStandingOrdersOutGrmTpCrCustCurrencyShortDescr")
    protected String outGrpUnpaidStandingOrdersOutGrmTpCrCustCurrencyShortDescr;
    @XmlElement(name = "OutGrpUnpaidStandingOrdersOutGrmTpDrAccCurrencyIdCurrency")
    protected int outGrpUnpaidStandingOrdersOutGrmTpDrAccCurrencyIdCurrency;
    @XmlElement(name = "OutGrpUnpaidStandingOrdersOutGrmTpDrAccCurrencyShortDescr")
    protected String outGrpUnpaidStandingOrdersOutGrmTpDrAccCurrencyShortDescr;
    @XmlElement(name = "OutGrpUnpaidStandingOrdersOutGrmTpDrCustCurrencyIdCurrency")
    protected int outGrpUnpaidStandingOrdersOutGrmTpDrCustCurrencyIdCurrency;
    @XmlElement(name = "OutGrpUnpaidStandingOrdersOutGrmTpDrCustCurrencyShortDescr")
    protected String outGrpUnpaidStandingOrdersOutGrmTpDrCustCurrencyShortDescr;
    @XmlElement(name = "OutGrpUnpaidStandingOrdersOutGrmUnitUnitCode")
    protected int outGrpUnpaidStandingOrdersOutGrmUnitUnitCode;

    /**
     * Gets the value of the outGrpUnpaidStandingOrdersOutGrmAvailBalanceNowDepositAccountBookBalance property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpUnpaidStandingOrdersOutGrmAvailBalanceNowDepositAccountBookBalance() {
        return outGrpUnpaidStandingOrdersOutGrmAvailBalanceNowDepositAccountBookBalance;
    }

    /**
     * Sets the value of the outGrpUnpaidStandingOrdersOutGrmAvailBalanceNowDepositAccountBookBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpUnpaidStandingOrdersOutGrmAvailBalanceNowDepositAccountBookBalance(BigDecimal value) {
        this.outGrpUnpaidStandingOrdersOutGrmAvailBalanceNowDepositAccountBookBalance = value;
    }

    /**
     * Gets the value of the outGrpUnpaidStandingOrdersOutGrmCrAccountListDepositAccountAccountNumber property.
     * 
     */
    public double getOutGrpUnpaidStandingOrdersOutGrmCrAccountListDepositAccountAccountNumber() {
        return outGrpUnpaidStandingOrdersOutGrmCrAccountListDepositAccountAccountNumber;
    }

    /**
     * Sets the value of the outGrpUnpaidStandingOrdersOutGrmCrAccountListDepositAccountAccountNumber property.
     * 
     */
    public void setOutGrpUnpaidStandingOrdersOutGrmCrAccountListDepositAccountAccountNumber(double value) {
        this.outGrpUnpaidStandingOrdersOutGrmCrAccountListDepositAccountAccountNumber = value;
    }

    /**
     * Gets the value of the outGrpUnpaidStandingOrdersOutGrmCrAccountListDepositAccountAvailableBalance property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpUnpaidStandingOrdersOutGrmCrAccountListDepositAccountAvailableBalance() {
        return outGrpUnpaidStandingOrdersOutGrmCrAccountListDepositAccountAvailableBalance;
    }

    /**
     * Sets the value of the outGrpUnpaidStandingOrdersOutGrmCrAccountListDepositAccountAvailableBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpUnpaidStandingOrdersOutGrmCrAccountListDepositAccountAvailableBalance(BigDecimal value) {
        this.outGrpUnpaidStandingOrdersOutGrmCrAccountListDepositAccountAvailableBalance = value;
    }

    /**
     * Gets the value of the outGrpUnpaidStandingOrdersOutGrmCrAccountListDepositAccountCDigit property.
     * 
     */
    public short getOutGrpUnpaidStandingOrdersOutGrmCrAccountListDepositAccountCDigit() {
        return outGrpUnpaidStandingOrdersOutGrmCrAccountListDepositAccountCDigit;
    }

    /**
     * Sets the value of the outGrpUnpaidStandingOrdersOutGrmCrAccountListDepositAccountCDigit property.
     * 
     */
    public void setOutGrpUnpaidStandingOrdersOutGrmCrAccountListDepositAccountCDigit(short value) {
        this.outGrpUnpaidStandingOrdersOutGrmCrAccountListDepositAccountCDigit = value;
    }

    /**
     * Gets the value of the outGrpUnpaidStandingOrdersOutGrmCrCustomerCustomerCustId property.
     * 
     */
    public int getOutGrpUnpaidStandingOrdersOutGrmCrCustomerCustomerCustId() {
        return outGrpUnpaidStandingOrdersOutGrmCrCustomerCustomerCustId;
    }

    /**
     * Sets the value of the outGrpUnpaidStandingOrdersOutGrmCrCustomerCustomerCustId property.
     * 
     */
    public void setOutGrpUnpaidStandingOrdersOutGrmCrCustomerCustomerCustId(int value) {
        this.outGrpUnpaidStandingOrdersOutGrmCrCustomerCustomerCustId = value;
    }

    /**
     * Gets the value of the outGrpUnpaidStandingOrdersOutGrmCrProfitsAccountAccountCd property.
     * 
     */
    public short getOutGrpUnpaidStandingOrdersOutGrmCrProfitsAccountAccountCd() {
        return outGrpUnpaidStandingOrdersOutGrmCrProfitsAccountAccountCd;
    }

    /**
     * Sets the value of the outGrpUnpaidStandingOrdersOutGrmCrProfitsAccountAccountCd property.
     * 
     */
    public void setOutGrpUnpaidStandingOrdersOutGrmCrProfitsAccountAccountCd(short value) {
        this.outGrpUnpaidStandingOrdersOutGrmCrProfitsAccountAccountCd = value;
    }

    /**
     * Gets the value of the outGrpUnpaidStandingOrdersOutGrmCrProfitsAccountAccountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpUnpaidStandingOrdersOutGrmCrProfitsAccountAccountNumber() {
        return outGrpUnpaidStandingOrdersOutGrmCrProfitsAccountAccountNumber;
    }

    /**
     * Sets the value of the outGrpUnpaidStandingOrdersOutGrmCrProfitsAccountAccountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpUnpaidStandingOrdersOutGrmCrProfitsAccountAccountNumber(String value) {
        this.outGrpUnpaidStandingOrdersOutGrmCrProfitsAccountAccountNumber = value;
    }

    /**
     * Gets the value of the outGrpUnpaidStandingOrdersOutGrmCustNameLnsSuppliedName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpUnpaidStandingOrdersOutGrmCustNameLnsSuppliedName() {
        return outGrpUnpaidStandingOrdersOutGrmCustNameLnsSuppliedName;
    }

    /**
     * Sets the value of the outGrpUnpaidStandingOrdersOutGrmCustNameLnsSuppliedName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpUnpaidStandingOrdersOutGrmCustNameLnsSuppliedName(String value) {
        this.outGrpUnpaidStandingOrdersOutGrmCustNameLnsSuppliedName = value;
    }

    /**
     * Gets the value of the outGrpUnpaidStandingOrdersOutGrmDpProfitsAccountAccountCd property.
     * 
     */
    public short getOutGrpUnpaidStandingOrdersOutGrmDpProfitsAccountAccountCd() {
        return outGrpUnpaidStandingOrdersOutGrmDpProfitsAccountAccountCd;
    }

    /**
     * Sets the value of the outGrpUnpaidStandingOrdersOutGrmDpProfitsAccountAccountCd property.
     * 
     */
    public void setOutGrpUnpaidStandingOrdersOutGrmDpProfitsAccountAccountCd(short value) {
        this.outGrpUnpaidStandingOrdersOutGrmDpProfitsAccountAccountCd = value;
    }

    /**
     * Gets the value of the outGrpUnpaidStandingOrdersOutGrmDpProfitsAccountAccountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpUnpaidStandingOrdersOutGrmDpProfitsAccountAccountNumber() {
        return outGrpUnpaidStandingOrdersOutGrmDpProfitsAccountAccountNumber;
    }

    /**
     * Sets the value of the outGrpUnpaidStandingOrdersOutGrmDpProfitsAccountAccountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpUnpaidStandingOrdersOutGrmDpProfitsAccountAccountNumber(String value) {
        this.outGrpUnpaidStandingOrdersOutGrmDpProfitsAccountAccountNumber = value;
    }

    /**
     * Gets the value of the outGrpUnpaidStandingOrdersOutGrmDrAccountListDepositAccountAccountNumber property.
     * 
     */
    public double getOutGrpUnpaidStandingOrdersOutGrmDrAccountListDepositAccountAccountNumber() {
        return outGrpUnpaidStandingOrdersOutGrmDrAccountListDepositAccountAccountNumber;
    }

    /**
     * Sets the value of the outGrpUnpaidStandingOrdersOutGrmDrAccountListDepositAccountAccountNumber property.
     * 
     */
    public void setOutGrpUnpaidStandingOrdersOutGrmDrAccountListDepositAccountAccountNumber(double value) {
        this.outGrpUnpaidStandingOrdersOutGrmDrAccountListDepositAccountAccountNumber = value;
    }

    /**
     * Gets the value of the outGrpUnpaidStandingOrdersOutGrmDrAccountListDepositAccountAvailableBalance property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpUnpaidStandingOrdersOutGrmDrAccountListDepositAccountAvailableBalance() {
        return outGrpUnpaidStandingOrdersOutGrmDrAccountListDepositAccountAvailableBalance;
    }

    /**
     * Sets the value of the outGrpUnpaidStandingOrdersOutGrmDrAccountListDepositAccountAvailableBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpUnpaidStandingOrdersOutGrmDrAccountListDepositAccountAvailableBalance(BigDecimal value) {
        this.outGrpUnpaidStandingOrdersOutGrmDrAccountListDepositAccountAvailableBalance = value;
    }

    /**
     * Gets the value of the outGrpUnpaidStandingOrdersOutGrmDrAccountListDepositAccountCDigit property.
     * 
     */
    public short getOutGrpUnpaidStandingOrdersOutGrmDrAccountListDepositAccountCDigit() {
        return outGrpUnpaidStandingOrdersOutGrmDrAccountListDepositAccountCDigit;
    }

    /**
     * Sets the value of the outGrpUnpaidStandingOrdersOutGrmDrAccountListDepositAccountCDigit property.
     * 
     */
    public void setOutGrpUnpaidStandingOrdersOutGrmDrAccountListDepositAccountCDigit(short value) {
        this.outGrpUnpaidStandingOrdersOutGrmDrAccountListDepositAccountCDigit = value;
    }

    /**
     * Gets the value of the outGrpUnpaidStandingOrdersOutGrmDrCustomerCDigit property.
     * 
     */
    public short getOutGrpUnpaidStandingOrdersOutGrmDrCustomerCDigit() {
        return outGrpUnpaidStandingOrdersOutGrmDrCustomerCDigit;
    }

    /**
     * Sets the value of the outGrpUnpaidStandingOrdersOutGrmDrCustomerCDigit property.
     * 
     */
    public void setOutGrpUnpaidStandingOrdersOutGrmDrCustomerCDigit(short value) {
        this.outGrpUnpaidStandingOrdersOutGrmDrCustomerCDigit = value;
    }

    /**
     * Gets the value of the outGrpUnpaidStandingOrdersOutGrmDrCustomerCustId property.
     * 
     */
    public int getOutGrpUnpaidStandingOrdersOutGrmDrCustomerCustId() {
        return outGrpUnpaidStandingOrdersOutGrmDrCustomerCustId;
    }

    /**
     * Sets the value of the outGrpUnpaidStandingOrdersOutGrmDrCustomerCustId property.
     * 
     */
    public void setOutGrpUnpaidStandingOrdersOutGrmDrCustomerCustId(int value) {
        this.outGrpUnpaidStandingOrdersOutGrmDrCustomerCustId = value;
    }

    /**
     * Gets the value of the outGrpUnpaidStandingOrdersOutGrmDrDepositListJustificDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpUnpaidStandingOrdersOutGrmDrDepositListJustificDescription() {
        return outGrpUnpaidStandingOrdersOutGrmDrDepositListJustificDescription;
    }

    /**
     * Sets the value of the outGrpUnpaidStandingOrdersOutGrmDrDepositListJustificDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpUnpaidStandingOrdersOutGrmDrDepositListJustificDescription(String value) {
        this.outGrpUnpaidStandingOrdersOutGrmDrDepositListJustificDescription = value;
    }

    /**
     * Gets the value of the outGrpUnpaidStandingOrdersOutGrmDrJustificDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpUnpaidStandingOrdersOutGrmDrJustificDescription() {
        return outGrpUnpaidStandingOrdersOutGrmDrJustificDescription;
    }

    /**
     * Sets the value of the outGrpUnpaidStandingOrdersOutGrmDrJustificDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpUnpaidStandingOrdersOutGrmDrJustificDescription(String value) {
        this.outGrpUnpaidStandingOrdersOutGrmDrJustificDescription = value;
    }

    /**
     * Gets the value of the outGrpUnpaidStandingOrdersOutGrmDrJustificIdJustific property.
     * 
     */
    public int getOutGrpUnpaidStandingOrdersOutGrmDrJustificIdJustific() {
        return outGrpUnpaidStandingOrdersOutGrmDrJustificIdJustific;
    }

    /**
     * Sets the value of the outGrpUnpaidStandingOrdersOutGrmDrJustificIdJustific property.
     * 
     */
    public void setOutGrpUnpaidStandingOrdersOutGrmDrJustificIdJustific(int value) {
        this.outGrpUnpaidStandingOrdersOutGrmDrJustificIdJustific = value;
    }

    /**
     * Gets the value of the outGrpUnpaidStandingOrdersOutGrmHistSoCommitmentActualPaymentAmnt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpUnpaidStandingOrdersOutGrmHistSoCommitmentActualPaymentAmnt() {
        return outGrpUnpaidStandingOrdersOutGrmHistSoCommitmentActualPaymentAmnt;
    }

    /**
     * Sets the value of the outGrpUnpaidStandingOrdersOutGrmHistSoCommitmentActualPaymentAmnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpUnpaidStandingOrdersOutGrmHistSoCommitmentActualPaymentAmnt(BigDecimal value) {
        this.outGrpUnpaidStandingOrdersOutGrmHistSoCommitmentActualPaymentAmnt = value;
    }

    /**
     * Gets the value of the outGrpUnpaidStandingOrdersOutGrmHistSoCommitmentAvailableBalance property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpUnpaidStandingOrdersOutGrmHistSoCommitmentAvailableBalance() {
        return outGrpUnpaidStandingOrdersOutGrmHistSoCommitmentAvailableBalance;
    }

    /**
     * Sets the value of the outGrpUnpaidStandingOrdersOutGrmHistSoCommitmentAvailableBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpUnpaidStandingOrdersOutGrmHistSoCommitmentAvailableBalance(BigDecimal value) {
        this.outGrpUnpaidStandingOrdersOutGrmHistSoCommitmentAvailableBalance = value;
    }

    /**
     * Gets the value of the outGrpUnpaidStandingOrdersOutGrmHistSoCommitmentCrAccountNumber property.
     * 
     */
    public double getOutGrpUnpaidStandingOrdersOutGrmHistSoCommitmentCrAccountNumber() {
        return outGrpUnpaidStandingOrdersOutGrmHistSoCommitmentCrAccountNumber;
    }

    /**
     * Sets the value of the outGrpUnpaidStandingOrdersOutGrmHistSoCommitmentCrAccountNumber property.
     * 
     */
    public void setOutGrpUnpaidStandingOrdersOutGrmHistSoCommitmentCrAccountNumber(double value) {
        this.outGrpUnpaidStandingOrdersOutGrmHistSoCommitmentCrAccountNumber = value;
    }

    /**
     * Gets the value of the outGrpUnpaidStandingOrdersOutGrmHistSoCommitmentDrAccountNumber property.
     * 
     */
    public double getOutGrpUnpaidStandingOrdersOutGrmHistSoCommitmentDrAccountNumber() {
        return outGrpUnpaidStandingOrdersOutGrmHistSoCommitmentDrAccountNumber;
    }

    /**
     * Sets the value of the outGrpUnpaidStandingOrdersOutGrmHistSoCommitmentDrAccountNumber property.
     * 
     */
    public void setOutGrpUnpaidStandingOrdersOutGrmHistSoCommitmentDrAccountNumber(double value) {
        this.outGrpUnpaidStandingOrdersOutGrmHistSoCommitmentDrAccountNumber = value;
    }

    /**
     * Gets the value of the outGrpUnpaidStandingOrdersOutGrmHistSoCommitmentEntryStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpUnpaidStandingOrdersOutGrmHistSoCommitmentEntryStatus() {
        return outGrpUnpaidStandingOrdersOutGrmHistSoCommitmentEntryStatus;
    }

    /**
     * Sets the value of the outGrpUnpaidStandingOrdersOutGrmHistSoCommitmentEntryStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpUnpaidStandingOrdersOutGrmHistSoCommitmentEntryStatus(String value) {
        this.outGrpUnpaidStandingOrdersOutGrmHistSoCommitmentEntryStatus = value;
    }

    /**
     * Gets the value of the outGrpUnpaidStandingOrdersOutGrmHistSoCommitmentExecutionDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutGrpUnpaidStandingOrdersOutGrmHistSoCommitmentExecutionDate() {
        return outGrpUnpaidStandingOrdersOutGrmHistSoCommitmentExecutionDate;
    }

    /**
     * Sets the value of the outGrpUnpaidStandingOrdersOutGrmHistSoCommitmentExecutionDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutGrpUnpaidStandingOrdersOutGrmHistSoCommitmentExecutionDate(XMLGregorianCalendar value) {
        this.outGrpUnpaidStandingOrdersOutGrmHistSoCommitmentExecutionDate = value;
    }

    /**
     * Gets the value of the outGrpUnpaidStandingOrdersOutGrmHistSoCommitmentOrderNumber property.
     * 
     */
    public int getOutGrpUnpaidStandingOrdersOutGrmHistSoCommitmentOrderNumber() {
        return outGrpUnpaidStandingOrdersOutGrmHistSoCommitmentOrderNumber;
    }

    /**
     * Sets the value of the outGrpUnpaidStandingOrdersOutGrmHistSoCommitmentOrderNumber property.
     * 
     */
    public void setOutGrpUnpaidStandingOrdersOutGrmHistSoCommitmentOrderNumber(int value) {
        this.outGrpUnpaidStandingOrdersOutGrmHistSoCommitmentOrderNumber = value;
    }

    /**
     * Gets the value of the outGrpUnpaidStandingOrdersOutGrmHistSoCommitmentPaymentAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpUnpaidStandingOrdersOutGrmHistSoCommitmentPaymentAmount() {
        return outGrpUnpaidStandingOrdersOutGrmHistSoCommitmentPaymentAmount;
    }

    /**
     * Sets the value of the outGrpUnpaidStandingOrdersOutGrmHistSoCommitmentPaymentAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpUnpaidStandingOrdersOutGrmHistSoCommitmentPaymentAmount(BigDecimal value) {
        this.outGrpUnpaidStandingOrdersOutGrmHistSoCommitmentPaymentAmount = value;
    }

    /**
     * Gets the value of the outGrpUnpaidStandingOrdersOutGrmIefSuppliedComments property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpUnpaidStandingOrdersOutGrmIefSuppliedComments() {
        return outGrpUnpaidStandingOrdersOutGrmIefSuppliedComments;
    }

    /**
     * Sets the value of the outGrpUnpaidStandingOrdersOutGrmIefSuppliedComments property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpUnpaidStandingOrdersOutGrmIefSuppliedComments(String value) {
        this.outGrpUnpaidStandingOrdersOutGrmIefSuppliedComments = value;
    }

    /**
     * Gets the value of the outGrpUnpaidStandingOrdersOutGrmJustificNotExecJustificDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpUnpaidStandingOrdersOutGrmJustificNotExecJustificDescription() {
        return outGrpUnpaidStandingOrdersOutGrmJustificNotExecJustificDescription;
    }

    /**
     * Sets the value of the outGrpUnpaidStandingOrdersOutGrmJustificNotExecJustificDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpUnpaidStandingOrdersOutGrmJustificNotExecJustificDescription(String value) {
        this.outGrpUnpaidStandingOrdersOutGrmJustificNotExecJustificDescription = value;
    }

    /**
     * Gets the value of the outGrpUnpaidStandingOrdersOutGrmLoanProfitsAccountAccountCd property.
     * 
     */
    public short getOutGrpUnpaidStandingOrdersOutGrmLoanProfitsAccountAccountCd() {
        return outGrpUnpaidStandingOrdersOutGrmLoanProfitsAccountAccountCd;
    }

    /**
     * Sets the value of the outGrpUnpaidStandingOrdersOutGrmLoanProfitsAccountAccountCd property.
     * 
     */
    public void setOutGrpUnpaidStandingOrdersOutGrmLoanProfitsAccountAccountCd(short value) {
        this.outGrpUnpaidStandingOrdersOutGrmLoanProfitsAccountAccountCd = value;
    }

    /**
     * Gets the value of the outGrpUnpaidStandingOrdersOutGrmLoanProfitsAccountAccountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpUnpaidStandingOrdersOutGrmLoanProfitsAccountAccountNumber() {
        return outGrpUnpaidStandingOrdersOutGrmLoanProfitsAccountAccountNumber;
    }

    /**
     * Sets the value of the outGrpUnpaidStandingOrdersOutGrmLoanProfitsAccountAccountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpUnpaidStandingOrdersOutGrmLoanProfitsAccountAccountNumber(String value) {
        this.outGrpUnpaidStandingOrdersOutGrmLoanProfitsAccountAccountNumber = value;
    }

    /**
     * Gets the value of the outGrpUnpaidStandingOrdersOutGrmRmUsrCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpUnpaidStandingOrdersOutGrmRmUsrCode() {
        return outGrpUnpaidStandingOrdersOutGrmRmUsrCode;
    }

    /**
     * Sets the value of the outGrpUnpaidStandingOrdersOutGrmRmUsrCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpUnpaidStandingOrdersOutGrmRmUsrCode(String value) {
        this.outGrpUnpaidStandingOrdersOutGrmRmUsrCode = value;
    }

    /**
     * Gets the value of the outGrpUnpaidStandingOrdersOutGrmSelectionIefSuppliedSelectChar property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpUnpaidStandingOrdersOutGrmSelectionIefSuppliedSelectChar() {
        return outGrpUnpaidStandingOrdersOutGrmSelectionIefSuppliedSelectChar;
    }

    /**
     * Sets the value of the outGrpUnpaidStandingOrdersOutGrmSelectionIefSuppliedSelectChar property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpUnpaidStandingOrdersOutGrmSelectionIefSuppliedSelectChar(String value) {
        this.outGrpUnpaidStandingOrdersOutGrmSelectionIefSuppliedSelectChar = value;
    }

    /**
     * Gets the value of the outGrpUnpaidStandingOrdersOutGrmStandingOrderTpSoCommitmentActivationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutGrpUnpaidStandingOrdersOutGrmStandingOrderTpSoCommitmentActivationDate() {
        return outGrpUnpaidStandingOrdersOutGrmStandingOrderTpSoCommitmentActivationDate;
    }

    /**
     * Sets the value of the outGrpUnpaidStandingOrdersOutGrmStandingOrderTpSoCommitmentActivationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutGrpUnpaidStandingOrdersOutGrmStandingOrderTpSoCommitmentActivationDate(XMLGregorianCalendar value) {
        this.outGrpUnpaidStandingOrdersOutGrmStandingOrderTpSoCommitmentActivationDate = value;
    }

    /**
     * Gets the value of the outGrpUnpaidStandingOrdersOutGrmStandingOrderTpSoCommitmentBpBenefAddress1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpUnpaidStandingOrdersOutGrmStandingOrderTpSoCommitmentBpBenefAddress1() {
        return outGrpUnpaidStandingOrdersOutGrmStandingOrderTpSoCommitmentBpBenefAddress1;
    }

    /**
     * Sets the value of the outGrpUnpaidStandingOrdersOutGrmStandingOrderTpSoCommitmentBpBenefAddress1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpUnpaidStandingOrdersOutGrmStandingOrderTpSoCommitmentBpBenefAddress1(String value) {
        this.outGrpUnpaidStandingOrdersOutGrmStandingOrderTpSoCommitmentBpBenefAddress1 = value;
    }

    /**
     * Gets the value of the outGrpUnpaidStandingOrdersOutGrmStandingOrderTpSoCommitmentBpBenefAddress2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpUnpaidStandingOrdersOutGrmStandingOrderTpSoCommitmentBpBenefAddress2() {
        return outGrpUnpaidStandingOrdersOutGrmStandingOrderTpSoCommitmentBpBenefAddress2;
    }

    /**
     * Sets the value of the outGrpUnpaidStandingOrdersOutGrmStandingOrderTpSoCommitmentBpBenefAddress2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpUnpaidStandingOrdersOutGrmStandingOrderTpSoCommitmentBpBenefAddress2(String value) {
        this.outGrpUnpaidStandingOrdersOutGrmStandingOrderTpSoCommitmentBpBenefAddress2 = value;
    }

    /**
     * Gets the value of the outGrpUnpaidStandingOrdersOutGrmStandingOrderTpSoCommitmentBpBenefAddress3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpUnpaidStandingOrdersOutGrmStandingOrderTpSoCommitmentBpBenefAddress3() {
        return outGrpUnpaidStandingOrdersOutGrmStandingOrderTpSoCommitmentBpBenefAddress3;
    }

    /**
     * Sets the value of the outGrpUnpaidStandingOrdersOutGrmStandingOrderTpSoCommitmentBpBenefAddress3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpUnpaidStandingOrdersOutGrmStandingOrderTpSoCommitmentBpBenefAddress3(String value) {
        this.outGrpUnpaidStandingOrdersOutGrmStandingOrderTpSoCommitmentBpBenefAddress3 = value;
    }

    /**
     * Gets the value of the outGrpUnpaidStandingOrdersOutGrmStandingOrderTpSoCommitmentBpBenefCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpUnpaidStandingOrdersOutGrmStandingOrderTpSoCommitmentBpBenefCity() {
        return outGrpUnpaidStandingOrdersOutGrmStandingOrderTpSoCommitmentBpBenefCity;
    }

    /**
     * Sets the value of the outGrpUnpaidStandingOrdersOutGrmStandingOrderTpSoCommitmentBpBenefCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpUnpaidStandingOrdersOutGrmStandingOrderTpSoCommitmentBpBenefCity(String value) {
        this.outGrpUnpaidStandingOrdersOutGrmStandingOrderTpSoCommitmentBpBenefCity = value;
    }

    /**
     * Gets the value of the outGrpUnpaidStandingOrdersOutGrmStandingOrderTpSoCommitmentBpBenefCountry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpUnpaidStandingOrdersOutGrmStandingOrderTpSoCommitmentBpBenefCountry() {
        return outGrpUnpaidStandingOrdersOutGrmStandingOrderTpSoCommitmentBpBenefCountry;
    }

    /**
     * Sets the value of the outGrpUnpaidStandingOrdersOutGrmStandingOrderTpSoCommitmentBpBenefCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpUnpaidStandingOrdersOutGrmStandingOrderTpSoCommitmentBpBenefCountry(String value) {
        this.outGrpUnpaidStandingOrdersOutGrmStandingOrderTpSoCommitmentBpBenefCountry = value;
    }

    /**
     * Gets the value of the outGrpUnpaidStandingOrdersOutGrmStandingOrderTpSoCommitmentBpBenefName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpUnpaidStandingOrdersOutGrmStandingOrderTpSoCommitmentBpBenefName() {
        return outGrpUnpaidStandingOrdersOutGrmStandingOrderTpSoCommitmentBpBenefName;
    }

    /**
     * Sets the value of the outGrpUnpaidStandingOrdersOutGrmStandingOrderTpSoCommitmentBpBenefName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpUnpaidStandingOrdersOutGrmStandingOrderTpSoCommitmentBpBenefName(String value) {
        this.outGrpUnpaidStandingOrdersOutGrmStandingOrderTpSoCommitmentBpBenefName = value;
    }

    /**
     * Gets the value of the outGrpUnpaidStandingOrdersOutGrmStandingOrderTpSoCommitmentBpBenefZipCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpUnpaidStandingOrdersOutGrmStandingOrderTpSoCommitmentBpBenefZipCode() {
        return outGrpUnpaidStandingOrdersOutGrmStandingOrderTpSoCommitmentBpBenefZipCode;
    }

    /**
     * Sets the value of the outGrpUnpaidStandingOrdersOutGrmStandingOrderTpSoCommitmentBpBenefZipCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpUnpaidStandingOrdersOutGrmStandingOrderTpSoCommitmentBpBenefZipCode(String value) {
        this.outGrpUnpaidStandingOrdersOutGrmStandingOrderTpSoCommitmentBpBenefZipCode = value;
    }

    /**
     * Gets the value of the outGrpUnpaidStandingOrdersOutGrmStandingOrderTpSoCommitmentCountryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpUnpaidStandingOrdersOutGrmStandingOrderTpSoCommitmentCountryCode() {
        return outGrpUnpaidStandingOrdersOutGrmStandingOrderTpSoCommitmentCountryCode;
    }

    /**
     * Sets the value of the outGrpUnpaidStandingOrdersOutGrmStandingOrderTpSoCommitmentCountryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpUnpaidStandingOrdersOutGrmStandingOrderTpSoCommitmentCountryCode(String value) {
        this.outGrpUnpaidStandingOrdersOutGrmStandingOrderTpSoCommitmentCountryCode = value;
    }

    /**
     * Gets the value of the outGrpUnpaidStandingOrdersOutGrmStandingOrderTpSoCommitmentCrAccCustomerCd property.
     * 
     */
    public short getOutGrpUnpaidStandingOrdersOutGrmStandingOrderTpSoCommitmentCrAccCustomerCd() {
        return outGrpUnpaidStandingOrdersOutGrmStandingOrderTpSoCommitmentCrAccCustomerCd;
    }

    /**
     * Sets the value of the outGrpUnpaidStandingOrdersOutGrmStandingOrderTpSoCommitmentCrAccCustomerCd property.
     * 
     */
    public void setOutGrpUnpaidStandingOrdersOutGrmStandingOrderTpSoCommitmentCrAccCustomerCd(short value) {
        this.outGrpUnpaidStandingOrdersOutGrmStandingOrderTpSoCommitmentCrAccCustomerCd = value;
    }

    /**
     * Gets the value of the outGrpUnpaidStandingOrdersOutGrmStandingOrderTpSoCommitmentCrAccCustomerId property.
     * 
     */
    public int getOutGrpUnpaidStandingOrdersOutGrmStandingOrderTpSoCommitmentCrAccCustomerId() {
        return outGrpUnpaidStandingOrdersOutGrmStandingOrderTpSoCommitmentCrAccCustomerId;
    }

    /**
     * Sets the value of the outGrpUnpaidStandingOrdersOutGrmStandingOrderTpSoCommitmentCrAccCustomerId property.
     * 
     */
    public void setOutGrpUnpaidStandingOrdersOutGrmStandingOrderTpSoCommitmentCrAccCustomerId(int value) {
        this.outGrpUnpaidStandingOrdersOutGrmStandingOrderTpSoCommitmentCrAccCustomerId = value;
    }

    /**
     * Gets the value of the outGrpUnpaidStandingOrdersOutGrmStandingOrderTpSoCommitmentDrAccCustomerCd property.
     * 
     */
    public short getOutGrpUnpaidStandingOrdersOutGrmStandingOrderTpSoCommitmentDrAccCustomerCd() {
        return outGrpUnpaidStandingOrdersOutGrmStandingOrderTpSoCommitmentDrAccCustomerCd;
    }

    /**
     * Sets the value of the outGrpUnpaidStandingOrdersOutGrmStandingOrderTpSoCommitmentDrAccCustomerCd property.
     * 
     */
    public void setOutGrpUnpaidStandingOrdersOutGrmStandingOrderTpSoCommitmentDrAccCustomerCd(short value) {
        this.outGrpUnpaidStandingOrdersOutGrmStandingOrderTpSoCommitmentDrAccCustomerCd = value;
    }

    /**
     * Gets the value of the outGrpUnpaidStandingOrdersOutGrmStandingOrderTpSoCommitmentDrAccCustomerId property.
     * 
     */
    public int getOutGrpUnpaidStandingOrdersOutGrmStandingOrderTpSoCommitmentDrAccCustomerId() {
        return outGrpUnpaidStandingOrdersOutGrmStandingOrderTpSoCommitmentDrAccCustomerId;
    }

    /**
     * Sets the value of the outGrpUnpaidStandingOrdersOutGrmStandingOrderTpSoCommitmentDrAccCustomerId property.
     * 
     */
    public void setOutGrpUnpaidStandingOrdersOutGrmStandingOrderTpSoCommitmentDrAccCustomerId(int value) {
        this.outGrpUnpaidStandingOrdersOutGrmStandingOrderTpSoCommitmentDrAccCustomerId = value;
    }

    /**
     * Gets the value of the outGrpUnpaidStandingOrdersOutGrmStandingOrderTpSoCommitmentEntryStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpUnpaidStandingOrdersOutGrmStandingOrderTpSoCommitmentEntryStatus() {
        return outGrpUnpaidStandingOrdersOutGrmStandingOrderTpSoCommitmentEntryStatus;
    }

    /**
     * Sets the value of the outGrpUnpaidStandingOrdersOutGrmStandingOrderTpSoCommitmentEntryStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpUnpaidStandingOrdersOutGrmStandingOrderTpSoCommitmentEntryStatus(String value) {
        this.outGrpUnpaidStandingOrdersOutGrmStandingOrderTpSoCommitmentEntryStatus = value;
    }

    /**
     * Gets the value of the outGrpUnpaidStandingOrdersOutGrmStandingOrderTpSoCommitmentFirstPaymentAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpUnpaidStandingOrdersOutGrmStandingOrderTpSoCommitmentFirstPaymentAmn() {
        return outGrpUnpaidStandingOrdersOutGrmStandingOrderTpSoCommitmentFirstPaymentAmn;
    }

    /**
     * Sets the value of the outGrpUnpaidStandingOrdersOutGrmStandingOrderTpSoCommitmentFirstPaymentAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpUnpaidStandingOrdersOutGrmStandingOrderTpSoCommitmentFirstPaymentAmn(BigDecimal value) {
        this.outGrpUnpaidStandingOrdersOutGrmStandingOrderTpSoCommitmentFirstPaymentAmn = value;
    }

    /**
     * Gets the value of the outGrpUnpaidStandingOrdersOutGrmStandingOrderTpSoCommitmentFirstPaymentDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutGrpUnpaidStandingOrdersOutGrmStandingOrderTpSoCommitmentFirstPaymentDate() {
        return outGrpUnpaidStandingOrdersOutGrmStandingOrderTpSoCommitmentFirstPaymentDate;
    }

    /**
     * Sets the value of the outGrpUnpaidStandingOrdersOutGrmStandingOrderTpSoCommitmentFirstPaymentDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutGrpUnpaidStandingOrdersOutGrmStandingOrderTpSoCommitmentFirstPaymentDate(XMLGregorianCalendar value) {
        this.outGrpUnpaidStandingOrdersOutGrmStandingOrderTpSoCommitmentFirstPaymentDate = value;
    }

    /**
     * Gets the value of the outGrpUnpaidStandingOrdersOutGrmStandingOrderTpSoCommitmentFrequency property.
     * 
     */
    public short getOutGrpUnpaidStandingOrdersOutGrmStandingOrderTpSoCommitmentFrequency() {
        return outGrpUnpaidStandingOrdersOutGrmStandingOrderTpSoCommitmentFrequency;
    }

    /**
     * Sets the value of the outGrpUnpaidStandingOrdersOutGrmStandingOrderTpSoCommitmentFrequency property.
     * 
     */
    public void setOutGrpUnpaidStandingOrdersOutGrmStandingOrderTpSoCommitmentFrequency(short value) {
        this.outGrpUnpaidStandingOrdersOutGrmStandingOrderTpSoCommitmentFrequency = value;
    }

    /**
     * Gets the value of the outGrpUnpaidStandingOrdersOutGrmStandingOrderTpSoCommitmentFrequencyUnit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpUnpaidStandingOrdersOutGrmStandingOrderTpSoCommitmentFrequencyUnit() {
        return outGrpUnpaidStandingOrdersOutGrmStandingOrderTpSoCommitmentFrequencyUnit;
    }

    /**
     * Sets the value of the outGrpUnpaidStandingOrdersOutGrmStandingOrderTpSoCommitmentFrequencyUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpUnpaidStandingOrdersOutGrmStandingOrderTpSoCommitmentFrequencyUnit(String value) {
        this.outGrpUnpaidStandingOrdersOutGrmStandingOrderTpSoCommitmentFrequencyUnit = value;
    }

    /**
     * Gets the value of the outGrpUnpaidStandingOrdersOutGrmStandingOrderTpSoCommitmentIssueDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutGrpUnpaidStandingOrdersOutGrmStandingOrderTpSoCommitmentIssueDate() {
        return outGrpUnpaidStandingOrdersOutGrmStandingOrderTpSoCommitmentIssueDate;
    }

    /**
     * Sets the value of the outGrpUnpaidStandingOrdersOutGrmStandingOrderTpSoCommitmentIssueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutGrpUnpaidStandingOrdersOutGrmStandingOrderTpSoCommitmentIssueDate(XMLGregorianCalendar value) {
        this.outGrpUnpaidStandingOrdersOutGrmStandingOrderTpSoCommitmentIssueDate = value;
    }

    /**
     * Gets the value of the outGrpUnpaidStandingOrdersOutGrmStandingOrderTpSoCommitmentLastPaymentAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpUnpaidStandingOrdersOutGrmStandingOrderTpSoCommitmentLastPaymentAmn() {
        return outGrpUnpaidStandingOrdersOutGrmStandingOrderTpSoCommitmentLastPaymentAmn;
    }

    /**
     * Sets the value of the outGrpUnpaidStandingOrdersOutGrmStandingOrderTpSoCommitmentLastPaymentAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpUnpaidStandingOrdersOutGrmStandingOrderTpSoCommitmentLastPaymentAmn(BigDecimal value) {
        this.outGrpUnpaidStandingOrdersOutGrmStandingOrderTpSoCommitmentLastPaymentAmn = value;
    }

    /**
     * Gets the value of the outGrpUnpaidStandingOrdersOutGrmStandingOrderTpSoCommitmentLastPaymentDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutGrpUnpaidStandingOrdersOutGrmStandingOrderTpSoCommitmentLastPaymentDate() {
        return outGrpUnpaidStandingOrdersOutGrmStandingOrderTpSoCommitmentLastPaymentDate;
    }

    /**
     * Sets the value of the outGrpUnpaidStandingOrdersOutGrmStandingOrderTpSoCommitmentLastPaymentDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutGrpUnpaidStandingOrdersOutGrmStandingOrderTpSoCommitmentLastPaymentDate(XMLGregorianCalendar value) {
        this.outGrpUnpaidStandingOrdersOutGrmStandingOrderTpSoCommitmentLastPaymentDate = value;
    }

    /**
     * Gets the value of the outGrpUnpaidStandingOrdersOutGrmStandingOrderTpSoCommitmentLastTransferDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutGrpUnpaidStandingOrdersOutGrmStandingOrderTpSoCommitmentLastTransferDate() {
        return outGrpUnpaidStandingOrdersOutGrmStandingOrderTpSoCommitmentLastTransferDate;
    }

    /**
     * Sets the value of the outGrpUnpaidStandingOrdersOutGrmStandingOrderTpSoCommitmentLastTransferDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutGrpUnpaidStandingOrdersOutGrmStandingOrderTpSoCommitmentLastTransferDate(XMLGregorianCalendar value) {
        this.outGrpUnpaidStandingOrdersOutGrmStandingOrderTpSoCommitmentLastTransferDate = value;
    }

    /**
     * Gets the value of the outGrpUnpaidStandingOrdersOutGrmStandingOrderTpSoCommitmentLastUpdateDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutGrpUnpaidStandingOrdersOutGrmStandingOrderTpSoCommitmentLastUpdateDate() {
        return outGrpUnpaidStandingOrdersOutGrmStandingOrderTpSoCommitmentLastUpdateDate;
    }

    /**
     * Sets the value of the outGrpUnpaidStandingOrdersOutGrmStandingOrderTpSoCommitmentLastUpdateDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutGrpUnpaidStandingOrdersOutGrmStandingOrderTpSoCommitmentLastUpdateDate(XMLGregorianCalendar value) {
        this.outGrpUnpaidStandingOrdersOutGrmStandingOrderTpSoCommitmentLastUpdateDate = value;
    }

    /**
     * Gets the value of the outGrpUnpaidStandingOrdersOutGrmStandingOrderTpSoCommitmentMaxNoOfAttempts property.
     * 
     */
    public short getOutGrpUnpaidStandingOrdersOutGrmStandingOrderTpSoCommitmentMaxNoOfAttempts() {
        return outGrpUnpaidStandingOrdersOutGrmStandingOrderTpSoCommitmentMaxNoOfAttempts;
    }

    /**
     * Sets the value of the outGrpUnpaidStandingOrdersOutGrmStandingOrderTpSoCommitmentMaxNoOfAttempts property.
     * 
     */
    public void setOutGrpUnpaidStandingOrdersOutGrmStandingOrderTpSoCommitmentMaxNoOfAttempts(short value) {
        this.outGrpUnpaidStandingOrdersOutGrmStandingOrderTpSoCommitmentMaxNoOfAttempts = value;
    }

    /**
     * Gets the value of the outGrpUnpaidStandingOrdersOutGrmStandingOrderTpSoCommitmentPaymentAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpUnpaidStandingOrdersOutGrmStandingOrderTpSoCommitmentPaymentAmount() {
        return outGrpUnpaidStandingOrdersOutGrmStandingOrderTpSoCommitmentPaymentAmount;
    }

    /**
     * Sets the value of the outGrpUnpaidStandingOrdersOutGrmStandingOrderTpSoCommitmentPaymentAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpUnpaidStandingOrdersOutGrmStandingOrderTpSoCommitmentPaymentAmount(BigDecimal value) {
        this.outGrpUnpaidStandingOrdersOutGrmStandingOrderTpSoCommitmentPaymentAmount = value;
    }

    /**
     * Gets the value of the outGrpUnpaidStandingOrdersOutGrmStandingOrderTpSoCommitmentStandOrderMethod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpUnpaidStandingOrdersOutGrmStandingOrderTpSoCommitmentStandOrderMethod() {
        return outGrpUnpaidStandingOrdersOutGrmStandingOrderTpSoCommitmentStandOrderMethod;
    }

    /**
     * Sets the value of the outGrpUnpaidStandingOrdersOutGrmStandingOrderTpSoCommitmentStandOrderMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpUnpaidStandingOrdersOutGrmStandingOrderTpSoCommitmentStandOrderMethod(String value) {
        this.outGrpUnpaidStandingOrdersOutGrmStandingOrderTpSoCommitmentStandOrderMethod = value;
    }

    /**
     * Gets the value of the outGrpUnpaidStandingOrdersOutGrmStandingOrderTpSoCommitmentSuspensDateFrom property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutGrpUnpaidStandingOrdersOutGrmStandingOrderTpSoCommitmentSuspensDateFrom() {
        return outGrpUnpaidStandingOrdersOutGrmStandingOrderTpSoCommitmentSuspensDateFrom;
    }

    /**
     * Sets the value of the outGrpUnpaidStandingOrdersOutGrmStandingOrderTpSoCommitmentSuspensDateFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutGrpUnpaidStandingOrdersOutGrmStandingOrderTpSoCommitmentSuspensDateFrom(XMLGregorianCalendar value) {
        this.outGrpUnpaidStandingOrdersOutGrmStandingOrderTpSoCommitmentSuspensDateFrom = value;
    }

    /**
     * Gets the value of the outGrpUnpaidStandingOrdersOutGrmStandingOrderTpSoCommitmentSuspensDateTo property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutGrpUnpaidStandingOrdersOutGrmStandingOrderTpSoCommitmentSuspensDateTo() {
        return outGrpUnpaidStandingOrdersOutGrmStandingOrderTpSoCommitmentSuspensDateTo;
    }

    /**
     * Sets the value of the outGrpUnpaidStandingOrdersOutGrmStandingOrderTpSoCommitmentSuspensDateTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutGrpUnpaidStandingOrdersOutGrmStandingOrderTpSoCommitmentSuspensDateTo(XMLGregorianCalendar value) {
        this.outGrpUnpaidStandingOrdersOutGrmStandingOrderTpSoCommitmentSuspensDateTo = value;
    }

    /**
     * Gets the value of the outGrpUnpaidStandingOrdersOutGrmStandingOrderTpSoCommitmentSuspensExecutions property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpUnpaidStandingOrdersOutGrmStandingOrderTpSoCommitmentSuspensExecutions() {
        return outGrpUnpaidStandingOrdersOutGrmStandingOrderTpSoCommitmentSuspensExecutions;
    }

    /**
     * Sets the value of the outGrpUnpaidStandingOrdersOutGrmStandingOrderTpSoCommitmentSuspensExecutions property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpUnpaidStandingOrdersOutGrmStandingOrderTpSoCommitmentSuspensExecutions(String value) {
        this.outGrpUnpaidStandingOrdersOutGrmStandingOrderTpSoCommitmentSuspensExecutions = value;
    }

    /**
     * Gets the value of the outGrpUnpaidStandingOrdersOutGrmStandingOrderTpSoCommitmentTotalAvailableTr property.
     * 
     */
    public int getOutGrpUnpaidStandingOrdersOutGrmStandingOrderTpSoCommitmentTotalAvailableTr() {
        return outGrpUnpaidStandingOrdersOutGrmStandingOrderTpSoCommitmentTotalAvailableTr;
    }

    /**
     * Sets the value of the outGrpUnpaidStandingOrdersOutGrmStandingOrderTpSoCommitmentTotalAvailableTr property.
     * 
     */
    public void setOutGrpUnpaidStandingOrdersOutGrmStandingOrderTpSoCommitmentTotalAvailableTr(int value) {
        this.outGrpUnpaidStandingOrdersOutGrmStandingOrderTpSoCommitmentTotalAvailableTr = value;
    }

    /**
     * Gets the value of the outGrpUnpaidStandingOrdersOutGrmStandingOrderTpSoCommitmentTpSoIdentifier property.
     * 
     */
    public double getOutGrpUnpaidStandingOrdersOutGrmStandingOrderTpSoCommitmentTpSoIdentifier() {
        return outGrpUnpaidStandingOrdersOutGrmStandingOrderTpSoCommitmentTpSoIdentifier;
    }

    /**
     * Sets the value of the outGrpUnpaidStandingOrdersOutGrmStandingOrderTpSoCommitmentTpSoIdentifier property.
     * 
     */
    public void setOutGrpUnpaidStandingOrdersOutGrmStandingOrderTpSoCommitmentTpSoIdentifier(double value) {
        this.outGrpUnpaidStandingOrdersOutGrmStandingOrderTpSoCommitmentTpSoIdentifier = value;
    }

    /**
     * Gets the value of the outGrpUnpaidStandingOrdersOutGrmTpCrAccCurrencyIdCurrency property.
     * 
     */
    public int getOutGrpUnpaidStandingOrdersOutGrmTpCrAccCurrencyIdCurrency() {
        return outGrpUnpaidStandingOrdersOutGrmTpCrAccCurrencyIdCurrency;
    }

    /**
     * Sets the value of the outGrpUnpaidStandingOrdersOutGrmTpCrAccCurrencyIdCurrency property.
     * 
     */
    public void setOutGrpUnpaidStandingOrdersOutGrmTpCrAccCurrencyIdCurrency(int value) {
        this.outGrpUnpaidStandingOrdersOutGrmTpCrAccCurrencyIdCurrency = value;
    }

    /**
     * Gets the value of the outGrpUnpaidStandingOrdersOutGrmTpCrAccCurrencyShortDescr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpUnpaidStandingOrdersOutGrmTpCrAccCurrencyShortDescr() {
        return outGrpUnpaidStandingOrdersOutGrmTpCrAccCurrencyShortDescr;
    }

    /**
     * Sets the value of the outGrpUnpaidStandingOrdersOutGrmTpCrAccCurrencyShortDescr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpUnpaidStandingOrdersOutGrmTpCrAccCurrencyShortDescr(String value) {
        this.outGrpUnpaidStandingOrdersOutGrmTpCrAccCurrencyShortDescr = value;
    }

    /**
     * Gets the value of the outGrpUnpaidStandingOrdersOutGrmTpCrCustCurrencyIdCurrency property.
     * 
     */
    public int getOutGrpUnpaidStandingOrdersOutGrmTpCrCustCurrencyIdCurrency() {
        return outGrpUnpaidStandingOrdersOutGrmTpCrCustCurrencyIdCurrency;
    }

    /**
     * Sets the value of the outGrpUnpaidStandingOrdersOutGrmTpCrCustCurrencyIdCurrency property.
     * 
     */
    public void setOutGrpUnpaidStandingOrdersOutGrmTpCrCustCurrencyIdCurrency(int value) {
        this.outGrpUnpaidStandingOrdersOutGrmTpCrCustCurrencyIdCurrency = value;
    }

    /**
     * Gets the value of the outGrpUnpaidStandingOrdersOutGrmTpCrCustCurrencyShortDescr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpUnpaidStandingOrdersOutGrmTpCrCustCurrencyShortDescr() {
        return outGrpUnpaidStandingOrdersOutGrmTpCrCustCurrencyShortDescr;
    }

    /**
     * Sets the value of the outGrpUnpaidStandingOrdersOutGrmTpCrCustCurrencyShortDescr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpUnpaidStandingOrdersOutGrmTpCrCustCurrencyShortDescr(String value) {
        this.outGrpUnpaidStandingOrdersOutGrmTpCrCustCurrencyShortDescr = value;
    }

    /**
     * Gets the value of the outGrpUnpaidStandingOrdersOutGrmTpDrAccCurrencyIdCurrency property.
     * 
     */
    public int getOutGrpUnpaidStandingOrdersOutGrmTpDrAccCurrencyIdCurrency() {
        return outGrpUnpaidStandingOrdersOutGrmTpDrAccCurrencyIdCurrency;
    }

    /**
     * Sets the value of the outGrpUnpaidStandingOrdersOutGrmTpDrAccCurrencyIdCurrency property.
     * 
     */
    public void setOutGrpUnpaidStandingOrdersOutGrmTpDrAccCurrencyIdCurrency(int value) {
        this.outGrpUnpaidStandingOrdersOutGrmTpDrAccCurrencyIdCurrency = value;
    }

    /**
     * Gets the value of the outGrpUnpaidStandingOrdersOutGrmTpDrAccCurrencyShortDescr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpUnpaidStandingOrdersOutGrmTpDrAccCurrencyShortDescr() {
        return outGrpUnpaidStandingOrdersOutGrmTpDrAccCurrencyShortDescr;
    }

    /**
     * Sets the value of the outGrpUnpaidStandingOrdersOutGrmTpDrAccCurrencyShortDescr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpUnpaidStandingOrdersOutGrmTpDrAccCurrencyShortDescr(String value) {
        this.outGrpUnpaidStandingOrdersOutGrmTpDrAccCurrencyShortDescr = value;
    }

    /**
     * Gets the value of the outGrpUnpaidStandingOrdersOutGrmTpDrCustCurrencyIdCurrency property.
     * 
     */
    public int getOutGrpUnpaidStandingOrdersOutGrmTpDrCustCurrencyIdCurrency() {
        return outGrpUnpaidStandingOrdersOutGrmTpDrCustCurrencyIdCurrency;
    }

    /**
     * Sets the value of the outGrpUnpaidStandingOrdersOutGrmTpDrCustCurrencyIdCurrency property.
     * 
     */
    public void setOutGrpUnpaidStandingOrdersOutGrmTpDrCustCurrencyIdCurrency(int value) {
        this.outGrpUnpaidStandingOrdersOutGrmTpDrCustCurrencyIdCurrency = value;
    }

    /**
     * Gets the value of the outGrpUnpaidStandingOrdersOutGrmTpDrCustCurrencyShortDescr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpUnpaidStandingOrdersOutGrmTpDrCustCurrencyShortDescr() {
        return outGrpUnpaidStandingOrdersOutGrmTpDrCustCurrencyShortDescr;
    }

    /**
     * Sets the value of the outGrpUnpaidStandingOrdersOutGrmTpDrCustCurrencyShortDescr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpUnpaidStandingOrdersOutGrmTpDrCustCurrencyShortDescr(String value) {
        this.outGrpUnpaidStandingOrdersOutGrmTpDrCustCurrencyShortDescr = value;
    }

    /**
     * Gets the value of the outGrpUnpaidStandingOrdersOutGrmUnitUnitCode property.
     * 
     */
    public int getOutGrpUnpaidStandingOrdersOutGrmUnitUnitCode() {
        return outGrpUnpaidStandingOrdersOutGrmUnitUnitCode;
    }

    /**
     * Sets the value of the outGrpUnpaidStandingOrdersOutGrmUnitUnitCode property.
     * 
     */
    public void setOutGrpUnpaidStandingOrdersOutGrmUnitUnitCode(int value) {
        this.outGrpUnpaidStandingOrdersOutGrmUnitUnitCode = value;
    }

}
