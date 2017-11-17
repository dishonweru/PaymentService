
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for T2103VOutGroupItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="T2103VOutGroupItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OutGroupOutGrmCrDepositAccountAccountNumber" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OutGroupOutGrmCrDepositAccountCDigit" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutGroupOutGrmCrJustificIdJustific" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGroupOutGrmCrProfitsAccountAccountCd" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutGroupOutGrmCrProfitsAccountAccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGroupOutGrmCustomerLnsSuppliedName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGroupOutGrmDrDepositAccountAccountNumber" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OutGroupOutGrmDrDepositAccountCDigit" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutGroupOutGrmDrJustificIdJustific" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGroupOutGrmDrProfitsAccountAccountCd" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutGroupOutGrmDrProfitsAccountAccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGroupOutGrmIefSuppliedChar2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGroupOutGrmIefSuppliedComments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGroupOutGrmIefSuppliedDescStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGroupOutGrmIefSuppliedFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGroupOutGrmMontranBanksBankCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGroupOutGrmMontranBanksDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGroupOutGrmSelectIefSuppliedSelectChar" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGroupOutGrmThirdpartyTemplatPrompt1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGroupOutGrmThirdpartyTemplatPrompt2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGroupOutGrmThirdpartyTemplatPrompt3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGroupOutGrmThirdpartyTemplatPrompt4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGroupOutGrmTpCrAccCurrencyShortDescr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGroupOutGrmTpCrCustCurrencyShortDescr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGroupOutGrmTpDrAccCurrencyShortDescr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGroupOutGrmTpDrCustCurrencyShortDescr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGroupOutGrmTpSoCommitmentActivationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutGroupOutGrmTpSoCommitmentAdvancesRelated" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGroupOutGrmTpSoCommitmentBpBenefAddress1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGroupOutGrmTpSoCommitmentBpBenefAddress2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGroupOutGrmTpSoCommitmentBpBenefCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGroupOutGrmTpSoCommitmentBpBenefCountry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGroupOutGrmTpSoCommitmentBpBenefName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGroupOutGrmTpSoCommitmentBpBenefZipCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGroupOutGrmTpSoCommitmentCrAccComments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGroupOutGrmTpSoCommitmentCrAccCustomerCd" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutGroupOutGrmTpSoCommitmentCrAccCustomerId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGroupOutGrmTpSoCommitmentCrChargeType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGroupOutGrmTpSoCommitmentCrPrintAdvice" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGroupOutGrmTpSoCommitmentDataField1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGroupOutGrmTpSoCommitmentDataField2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGroupOutGrmTpSoCommitmentDataField3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGroupOutGrmTpSoCommitmentDataField4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGroupOutGrmTpSoCommitmentDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGroupOutGrmTpSoCommitmentDrAccComments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGroupOutGrmTpSoCommitmentDrAccCustomerCd" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutGroupOutGrmTpSoCommitmentDrAccCustomerId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGroupOutGrmTpSoCommitmentDrPrintAdvice" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGroupOutGrmTpSoCommitmentEntryStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGroupOutGrmTpSoCommitmentFirstPaymentAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGroupOutGrmTpSoCommitmentFirstPaymentDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutGroupOutGrmTpSoCommitmentFrequency" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutGroupOutGrmTpSoCommitmentFrequencyUnit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGroupOutGrmTpSoCommitmentLastPaymentAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGroupOutGrmTpSoCommitmentLastPaymentDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutGroupOutGrmTpSoCommitmentMaxNoOfAttempts" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutGroupOutGrmTpSoCommitmentOtherBankAccCd" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutGroupOutGrmTpSoCommitmentOtherBankAccNo" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OutGroupOutGrmTpSoCommitmentOtherBankCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGroupOutGrmTpSoCommitmentOtherBankUnit" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGroupOutGrmTpSoCommitmentPaymentAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGroupOutGrmTpSoCommitmentPaymentsCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGroupOutGrmTpSoCommitmentPoFbCharges" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGroupOutGrmTpSoCommitmentPrivilegedFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGroupOutGrmTpSoCommitmentStandOrderMethod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGroupOutGrmTpSoCommitmentSuspensDateFrom" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutGroupOutGrmTpSoCommitmentSuspensDateTo" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutGroupOutGrmTpSoCommitmentSuspensExecutions" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGroupOutGrmTpSoCommitmentTotalAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGroupOutGrmTpSoCommitmentTpSoIdentifier" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OutGroupOutGrmTpSoCommitmentTpSoIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGroupOutGrmUnitCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "T2103VOutGroupItem", propOrder = {
    "outGroupOutGrmCrDepositAccountAccountNumber",
    "outGroupOutGrmCrDepositAccountCDigit",
    "outGroupOutGrmCrJustificIdJustific",
    "outGroupOutGrmCrProfitsAccountAccountCd",
    "outGroupOutGrmCrProfitsAccountAccountNumber",
    "outGroupOutGrmCustomerLnsSuppliedName",
    "outGroupOutGrmDrDepositAccountAccountNumber",
    "outGroupOutGrmDrDepositAccountCDigit",
    "outGroupOutGrmDrJustificIdJustific",
    "outGroupOutGrmDrProfitsAccountAccountCd",
    "outGroupOutGrmDrProfitsAccountAccountNumber",
    "outGroupOutGrmIefSuppliedChar2",
    "outGroupOutGrmIefSuppliedComments",
    "outGroupOutGrmIefSuppliedDescStatus",
    "outGroupOutGrmIefSuppliedFlag",
    "outGroupOutGrmMontranBanksBankCode",
    "outGroupOutGrmMontranBanksDescription",
    "outGroupOutGrmSelectIefSuppliedSelectChar",
    "outGroupOutGrmThirdpartyTemplatPrompt1",
    "outGroupOutGrmThirdpartyTemplatPrompt2",
    "outGroupOutGrmThirdpartyTemplatPrompt3",
    "outGroupOutGrmThirdpartyTemplatPrompt4",
    "outGroupOutGrmTpCrAccCurrencyShortDescr",
    "outGroupOutGrmTpCrCustCurrencyShortDescr",
    "outGroupOutGrmTpDrAccCurrencyShortDescr",
    "outGroupOutGrmTpDrCustCurrencyShortDescr",
    "outGroupOutGrmTpSoCommitmentActivationDate",
    "outGroupOutGrmTpSoCommitmentAdvancesRelated",
    "outGroupOutGrmTpSoCommitmentBpBenefAddress1",
    "outGroupOutGrmTpSoCommitmentBpBenefAddress2",
    "outGroupOutGrmTpSoCommitmentBpBenefCity",
    "outGroupOutGrmTpSoCommitmentBpBenefCountry",
    "outGroupOutGrmTpSoCommitmentBpBenefName",
    "outGroupOutGrmTpSoCommitmentBpBenefZipCode",
    "outGroupOutGrmTpSoCommitmentCrAccComments",
    "outGroupOutGrmTpSoCommitmentCrAccCustomerCd",
    "outGroupOutGrmTpSoCommitmentCrAccCustomerId",
    "outGroupOutGrmTpSoCommitmentCrChargeType",
    "outGroupOutGrmTpSoCommitmentCrPrintAdvice",
    "outGroupOutGrmTpSoCommitmentDataField1",
    "outGroupOutGrmTpSoCommitmentDataField2",
    "outGroupOutGrmTpSoCommitmentDataField3",
    "outGroupOutGrmTpSoCommitmentDataField4",
    "outGroupOutGrmTpSoCommitmentDescription",
    "outGroupOutGrmTpSoCommitmentDrAccComments",
    "outGroupOutGrmTpSoCommitmentDrAccCustomerCd",
    "outGroupOutGrmTpSoCommitmentDrAccCustomerId",
    "outGroupOutGrmTpSoCommitmentDrPrintAdvice",
    "outGroupOutGrmTpSoCommitmentEntryStatus",
    "outGroupOutGrmTpSoCommitmentFirstPaymentAmn",
    "outGroupOutGrmTpSoCommitmentFirstPaymentDate",
    "outGroupOutGrmTpSoCommitmentFrequency",
    "outGroupOutGrmTpSoCommitmentFrequencyUnit",
    "outGroupOutGrmTpSoCommitmentLastPaymentAmn",
    "outGroupOutGrmTpSoCommitmentLastPaymentDate",
    "outGroupOutGrmTpSoCommitmentMaxNoOfAttempts",
    "outGroupOutGrmTpSoCommitmentOtherBankAccCd",
    "outGroupOutGrmTpSoCommitmentOtherBankAccNo",
    "outGroupOutGrmTpSoCommitmentOtherBankCode",
    "outGroupOutGrmTpSoCommitmentOtherBankUnit",
    "outGroupOutGrmTpSoCommitmentPaymentAmount",
    "outGroupOutGrmTpSoCommitmentPaymentsCount",
    "outGroupOutGrmTpSoCommitmentPoFbCharges",
    "outGroupOutGrmTpSoCommitmentPrivilegedFlag",
    "outGroupOutGrmTpSoCommitmentStandOrderMethod",
    "outGroupOutGrmTpSoCommitmentSuspensDateFrom",
    "outGroupOutGrmTpSoCommitmentSuspensDateTo",
    "outGroupOutGrmTpSoCommitmentSuspensExecutions",
    "outGroupOutGrmTpSoCommitmentTotalAmount",
    "outGroupOutGrmTpSoCommitmentTpSoIdentifier",
    "outGroupOutGrmTpSoCommitmentTpSoIndicator",
    "outGroupOutGrmUnitCode"
})
public class T2103VOutGroupItem {

    @XmlElement(name = "OutGroupOutGrmCrDepositAccountAccountNumber")
    protected double outGroupOutGrmCrDepositAccountAccountNumber;
    @XmlElement(name = "OutGroupOutGrmCrDepositAccountCDigit")
    protected short outGroupOutGrmCrDepositAccountCDigit;
    @XmlElement(name = "OutGroupOutGrmCrJustificIdJustific")
    protected int outGroupOutGrmCrJustificIdJustific;
    @XmlElement(name = "OutGroupOutGrmCrProfitsAccountAccountCd")
    protected short outGroupOutGrmCrProfitsAccountAccountCd;
    @XmlElement(name = "OutGroupOutGrmCrProfitsAccountAccountNumber")
    protected String outGroupOutGrmCrProfitsAccountAccountNumber;
    @XmlElement(name = "OutGroupOutGrmCustomerLnsSuppliedName")
    protected String outGroupOutGrmCustomerLnsSuppliedName;
    @XmlElement(name = "OutGroupOutGrmDrDepositAccountAccountNumber")
    protected double outGroupOutGrmDrDepositAccountAccountNumber;
    @XmlElement(name = "OutGroupOutGrmDrDepositAccountCDigit")
    protected short outGroupOutGrmDrDepositAccountCDigit;
    @XmlElement(name = "OutGroupOutGrmDrJustificIdJustific")
    protected int outGroupOutGrmDrJustificIdJustific;
    @XmlElement(name = "OutGroupOutGrmDrProfitsAccountAccountCd")
    protected short outGroupOutGrmDrProfitsAccountAccountCd;
    @XmlElement(name = "OutGroupOutGrmDrProfitsAccountAccountNumber")
    protected String outGroupOutGrmDrProfitsAccountAccountNumber;
    @XmlElement(name = "OutGroupOutGrmIefSuppliedChar2")
    protected String outGroupOutGrmIefSuppliedChar2;
    @XmlElement(name = "OutGroupOutGrmIefSuppliedComments")
    protected String outGroupOutGrmIefSuppliedComments;
    @XmlElement(name = "OutGroupOutGrmIefSuppliedDescStatus")
    protected String outGroupOutGrmIefSuppliedDescStatus;
    @XmlElement(name = "OutGroupOutGrmIefSuppliedFlag")
    protected String outGroupOutGrmIefSuppliedFlag;
    @XmlElement(name = "OutGroupOutGrmMontranBanksBankCode")
    protected String outGroupOutGrmMontranBanksBankCode;
    @XmlElement(name = "OutGroupOutGrmMontranBanksDescription")
    protected String outGroupOutGrmMontranBanksDescription;
    @XmlElement(name = "OutGroupOutGrmSelectIefSuppliedSelectChar")
    protected String outGroupOutGrmSelectIefSuppliedSelectChar;
    @XmlElement(name = "OutGroupOutGrmThirdpartyTemplatPrompt1")
    protected String outGroupOutGrmThirdpartyTemplatPrompt1;
    @XmlElement(name = "OutGroupOutGrmThirdpartyTemplatPrompt2")
    protected String outGroupOutGrmThirdpartyTemplatPrompt2;
    @XmlElement(name = "OutGroupOutGrmThirdpartyTemplatPrompt3")
    protected String outGroupOutGrmThirdpartyTemplatPrompt3;
    @XmlElement(name = "OutGroupOutGrmThirdpartyTemplatPrompt4")
    protected String outGroupOutGrmThirdpartyTemplatPrompt4;
    @XmlElement(name = "OutGroupOutGrmTpCrAccCurrencyShortDescr")
    protected String outGroupOutGrmTpCrAccCurrencyShortDescr;
    @XmlElement(name = "OutGroupOutGrmTpCrCustCurrencyShortDescr")
    protected String outGroupOutGrmTpCrCustCurrencyShortDescr;
    @XmlElement(name = "OutGroupOutGrmTpDrAccCurrencyShortDescr")
    protected String outGroupOutGrmTpDrAccCurrencyShortDescr;
    @XmlElement(name = "OutGroupOutGrmTpDrCustCurrencyShortDescr")
    protected String outGroupOutGrmTpDrCustCurrencyShortDescr;
    @XmlElement(name = "OutGroupOutGrmTpSoCommitmentActivationDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outGroupOutGrmTpSoCommitmentActivationDate;
    @XmlElement(name = "OutGroupOutGrmTpSoCommitmentAdvancesRelated")
    protected String outGroupOutGrmTpSoCommitmentAdvancesRelated;
    @XmlElement(name = "OutGroupOutGrmTpSoCommitmentBpBenefAddress1")
    protected String outGroupOutGrmTpSoCommitmentBpBenefAddress1;
    @XmlElement(name = "OutGroupOutGrmTpSoCommitmentBpBenefAddress2")
    protected String outGroupOutGrmTpSoCommitmentBpBenefAddress2;
    @XmlElement(name = "OutGroupOutGrmTpSoCommitmentBpBenefCity")
    protected String outGroupOutGrmTpSoCommitmentBpBenefCity;
    @XmlElement(name = "OutGroupOutGrmTpSoCommitmentBpBenefCountry")
    protected String outGroupOutGrmTpSoCommitmentBpBenefCountry;
    @XmlElement(name = "OutGroupOutGrmTpSoCommitmentBpBenefName")
    protected String outGroupOutGrmTpSoCommitmentBpBenefName;
    @XmlElement(name = "OutGroupOutGrmTpSoCommitmentBpBenefZipCode")
    protected String outGroupOutGrmTpSoCommitmentBpBenefZipCode;
    @XmlElement(name = "OutGroupOutGrmTpSoCommitmentCrAccComments")
    protected String outGroupOutGrmTpSoCommitmentCrAccComments;
    @XmlElement(name = "OutGroupOutGrmTpSoCommitmentCrAccCustomerCd")
    protected short outGroupOutGrmTpSoCommitmentCrAccCustomerCd;
    @XmlElement(name = "OutGroupOutGrmTpSoCommitmentCrAccCustomerId")
    protected int outGroupOutGrmTpSoCommitmentCrAccCustomerId;
    @XmlElement(name = "OutGroupOutGrmTpSoCommitmentCrChargeType")
    protected String outGroupOutGrmTpSoCommitmentCrChargeType;
    @XmlElement(name = "OutGroupOutGrmTpSoCommitmentCrPrintAdvice")
    protected String outGroupOutGrmTpSoCommitmentCrPrintAdvice;
    @XmlElement(name = "OutGroupOutGrmTpSoCommitmentDataField1")
    protected String outGroupOutGrmTpSoCommitmentDataField1;
    @XmlElement(name = "OutGroupOutGrmTpSoCommitmentDataField2")
    protected String outGroupOutGrmTpSoCommitmentDataField2;
    @XmlElement(name = "OutGroupOutGrmTpSoCommitmentDataField3")
    protected String outGroupOutGrmTpSoCommitmentDataField3;
    @XmlElement(name = "OutGroupOutGrmTpSoCommitmentDataField4")
    protected String outGroupOutGrmTpSoCommitmentDataField4;
    @XmlElement(name = "OutGroupOutGrmTpSoCommitmentDescription")
    protected String outGroupOutGrmTpSoCommitmentDescription;
    @XmlElement(name = "OutGroupOutGrmTpSoCommitmentDrAccComments")
    protected String outGroupOutGrmTpSoCommitmentDrAccComments;
    @XmlElement(name = "OutGroupOutGrmTpSoCommitmentDrAccCustomerCd")
    protected short outGroupOutGrmTpSoCommitmentDrAccCustomerCd;
    @XmlElement(name = "OutGroupOutGrmTpSoCommitmentDrAccCustomerId")
    protected int outGroupOutGrmTpSoCommitmentDrAccCustomerId;
    @XmlElement(name = "OutGroupOutGrmTpSoCommitmentDrPrintAdvice")
    protected String outGroupOutGrmTpSoCommitmentDrPrintAdvice;
    @XmlElement(name = "OutGroupOutGrmTpSoCommitmentEntryStatus")
    protected String outGroupOutGrmTpSoCommitmentEntryStatus;
    @XmlElement(name = "OutGroupOutGrmTpSoCommitmentFirstPaymentAmn", required = true)
    protected BigDecimal outGroupOutGrmTpSoCommitmentFirstPaymentAmn;
    @XmlElement(name = "OutGroupOutGrmTpSoCommitmentFirstPaymentDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outGroupOutGrmTpSoCommitmentFirstPaymentDate;
    @XmlElement(name = "OutGroupOutGrmTpSoCommitmentFrequency")
    protected short outGroupOutGrmTpSoCommitmentFrequency;
    @XmlElement(name = "OutGroupOutGrmTpSoCommitmentFrequencyUnit")
    protected String outGroupOutGrmTpSoCommitmentFrequencyUnit;
    @XmlElement(name = "OutGroupOutGrmTpSoCommitmentLastPaymentAmn", required = true)
    protected BigDecimal outGroupOutGrmTpSoCommitmentLastPaymentAmn;
    @XmlElement(name = "OutGroupOutGrmTpSoCommitmentLastPaymentDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outGroupOutGrmTpSoCommitmentLastPaymentDate;
    @XmlElement(name = "OutGroupOutGrmTpSoCommitmentMaxNoOfAttempts")
    protected short outGroupOutGrmTpSoCommitmentMaxNoOfAttempts;
    @XmlElement(name = "OutGroupOutGrmTpSoCommitmentOtherBankAccCd")
    protected short outGroupOutGrmTpSoCommitmentOtherBankAccCd;
    @XmlElement(name = "OutGroupOutGrmTpSoCommitmentOtherBankAccNo")
    protected double outGroupOutGrmTpSoCommitmentOtherBankAccNo;
    @XmlElement(name = "OutGroupOutGrmTpSoCommitmentOtherBankCode")
    protected int outGroupOutGrmTpSoCommitmentOtherBankCode;
    @XmlElement(name = "OutGroupOutGrmTpSoCommitmentOtherBankUnit")
    protected int outGroupOutGrmTpSoCommitmentOtherBankUnit;
    @XmlElement(name = "OutGroupOutGrmTpSoCommitmentPaymentAmount", required = true)
    protected BigDecimal outGroupOutGrmTpSoCommitmentPaymentAmount;
    @XmlElement(name = "OutGroupOutGrmTpSoCommitmentPaymentsCount")
    protected int outGroupOutGrmTpSoCommitmentPaymentsCount;
    @XmlElement(name = "OutGroupOutGrmTpSoCommitmentPoFbCharges")
    protected String outGroupOutGrmTpSoCommitmentPoFbCharges;
    @XmlElement(name = "OutGroupOutGrmTpSoCommitmentPrivilegedFlag")
    protected String outGroupOutGrmTpSoCommitmentPrivilegedFlag;
    @XmlElement(name = "OutGroupOutGrmTpSoCommitmentStandOrderMethod")
    protected String outGroupOutGrmTpSoCommitmentStandOrderMethod;
    @XmlElement(name = "OutGroupOutGrmTpSoCommitmentSuspensDateFrom", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outGroupOutGrmTpSoCommitmentSuspensDateFrom;
    @XmlElement(name = "OutGroupOutGrmTpSoCommitmentSuspensDateTo", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outGroupOutGrmTpSoCommitmentSuspensDateTo;
    @XmlElement(name = "OutGroupOutGrmTpSoCommitmentSuspensExecutions")
    protected String outGroupOutGrmTpSoCommitmentSuspensExecutions;
    @XmlElement(name = "OutGroupOutGrmTpSoCommitmentTotalAmount", required = true)
    protected BigDecimal outGroupOutGrmTpSoCommitmentTotalAmount;
    @XmlElement(name = "OutGroupOutGrmTpSoCommitmentTpSoIdentifier")
    protected double outGroupOutGrmTpSoCommitmentTpSoIdentifier;
    @XmlElement(name = "OutGroupOutGrmTpSoCommitmentTpSoIndicator")
    protected String outGroupOutGrmTpSoCommitmentTpSoIndicator;
    @XmlElement(name = "OutGroupOutGrmUnitCode")
    protected int outGroupOutGrmUnitCode;

    /**
     * Gets the value of the outGroupOutGrmCrDepositAccountAccountNumber property.
     * 
     */
    public double getOutGroupOutGrmCrDepositAccountAccountNumber() {
        return outGroupOutGrmCrDepositAccountAccountNumber;
    }

    /**
     * Sets the value of the outGroupOutGrmCrDepositAccountAccountNumber property.
     * 
     */
    public void setOutGroupOutGrmCrDepositAccountAccountNumber(double value) {
        this.outGroupOutGrmCrDepositAccountAccountNumber = value;
    }

    /**
     * Gets the value of the outGroupOutGrmCrDepositAccountCDigit property.
     * 
     */
    public short getOutGroupOutGrmCrDepositAccountCDigit() {
        return outGroupOutGrmCrDepositAccountCDigit;
    }

    /**
     * Sets the value of the outGroupOutGrmCrDepositAccountCDigit property.
     * 
     */
    public void setOutGroupOutGrmCrDepositAccountCDigit(short value) {
        this.outGroupOutGrmCrDepositAccountCDigit = value;
    }

    /**
     * Gets the value of the outGroupOutGrmCrJustificIdJustific property.
     * 
     */
    public int getOutGroupOutGrmCrJustificIdJustific() {
        return outGroupOutGrmCrJustificIdJustific;
    }

    /**
     * Sets the value of the outGroupOutGrmCrJustificIdJustific property.
     * 
     */
    public void setOutGroupOutGrmCrJustificIdJustific(int value) {
        this.outGroupOutGrmCrJustificIdJustific = value;
    }

    /**
     * Gets the value of the outGroupOutGrmCrProfitsAccountAccountCd property.
     * 
     */
    public short getOutGroupOutGrmCrProfitsAccountAccountCd() {
        return outGroupOutGrmCrProfitsAccountAccountCd;
    }

    /**
     * Sets the value of the outGroupOutGrmCrProfitsAccountAccountCd property.
     * 
     */
    public void setOutGroupOutGrmCrProfitsAccountAccountCd(short value) {
        this.outGroupOutGrmCrProfitsAccountAccountCd = value;
    }

    /**
     * Gets the value of the outGroupOutGrmCrProfitsAccountAccountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGroupOutGrmCrProfitsAccountAccountNumber() {
        return outGroupOutGrmCrProfitsAccountAccountNumber;
    }

    /**
     * Sets the value of the outGroupOutGrmCrProfitsAccountAccountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGroupOutGrmCrProfitsAccountAccountNumber(String value) {
        this.outGroupOutGrmCrProfitsAccountAccountNumber = value;
    }

    /**
     * Gets the value of the outGroupOutGrmCustomerLnsSuppliedName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGroupOutGrmCustomerLnsSuppliedName() {
        return outGroupOutGrmCustomerLnsSuppliedName;
    }

    /**
     * Sets the value of the outGroupOutGrmCustomerLnsSuppliedName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGroupOutGrmCustomerLnsSuppliedName(String value) {
        this.outGroupOutGrmCustomerLnsSuppliedName = value;
    }

    /**
     * Gets the value of the outGroupOutGrmDrDepositAccountAccountNumber property.
     * 
     */
    public double getOutGroupOutGrmDrDepositAccountAccountNumber() {
        return outGroupOutGrmDrDepositAccountAccountNumber;
    }

    /**
     * Sets the value of the outGroupOutGrmDrDepositAccountAccountNumber property.
     * 
     */
    public void setOutGroupOutGrmDrDepositAccountAccountNumber(double value) {
        this.outGroupOutGrmDrDepositAccountAccountNumber = value;
    }

    /**
     * Gets the value of the outGroupOutGrmDrDepositAccountCDigit property.
     * 
     */
    public short getOutGroupOutGrmDrDepositAccountCDigit() {
        return outGroupOutGrmDrDepositAccountCDigit;
    }

    /**
     * Sets the value of the outGroupOutGrmDrDepositAccountCDigit property.
     * 
     */
    public void setOutGroupOutGrmDrDepositAccountCDigit(short value) {
        this.outGroupOutGrmDrDepositAccountCDigit = value;
    }

    /**
     * Gets the value of the outGroupOutGrmDrJustificIdJustific property.
     * 
     */
    public int getOutGroupOutGrmDrJustificIdJustific() {
        return outGroupOutGrmDrJustificIdJustific;
    }

    /**
     * Sets the value of the outGroupOutGrmDrJustificIdJustific property.
     * 
     */
    public void setOutGroupOutGrmDrJustificIdJustific(int value) {
        this.outGroupOutGrmDrJustificIdJustific = value;
    }

    /**
     * Gets the value of the outGroupOutGrmDrProfitsAccountAccountCd property.
     * 
     */
    public short getOutGroupOutGrmDrProfitsAccountAccountCd() {
        return outGroupOutGrmDrProfitsAccountAccountCd;
    }

    /**
     * Sets the value of the outGroupOutGrmDrProfitsAccountAccountCd property.
     * 
     */
    public void setOutGroupOutGrmDrProfitsAccountAccountCd(short value) {
        this.outGroupOutGrmDrProfitsAccountAccountCd = value;
    }

    /**
     * Gets the value of the outGroupOutGrmDrProfitsAccountAccountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGroupOutGrmDrProfitsAccountAccountNumber() {
        return outGroupOutGrmDrProfitsAccountAccountNumber;
    }

    /**
     * Sets the value of the outGroupOutGrmDrProfitsAccountAccountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGroupOutGrmDrProfitsAccountAccountNumber(String value) {
        this.outGroupOutGrmDrProfitsAccountAccountNumber = value;
    }

    /**
     * Gets the value of the outGroupOutGrmIefSuppliedChar2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGroupOutGrmIefSuppliedChar2() {
        return outGroupOutGrmIefSuppliedChar2;
    }

    /**
     * Sets the value of the outGroupOutGrmIefSuppliedChar2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGroupOutGrmIefSuppliedChar2(String value) {
        this.outGroupOutGrmIefSuppliedChar2 = value;
    }

    /**
     * Gets the value of the outGroupOutGrmIefSuppliedComments property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGroupOutGrmIefSuppliedComments() {
        return outGroupOutGrmIefSuppliedComments;
    }

    /**
     * Sets the value of the outGroupOutGrmIefSuppliedComments property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGroupOutGrmIefSuppliedComments(String value) {
        this.outGroupOutGrmIefSuppliedComments = value;
    }

    /**
     * Gets the value of the outGroupOutGrmIefSuppliedDescStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGroupOutGrmIefSuppliedDescStatus() {
        return outGroupOutGrmIefSuppliedDescStatus;
    }

    /**
     * Sets the value of the outGroupOutGrmIefSuppliedDescStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGroupOutGrmIefSuppliedDescStatus(String value) {
        this.outGroupOutGrmIefSuppliedDescStatus = value;
    }

    /**
     * Gets the value of the outGroupOutGrmIefSuppliedFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGroupOutGrmIefSuppliedFlag() {
        return outGroupOutGrmIefSuppliedFlag;
    }

    /**
     * Sets the value of the outGroupOutGrmIefSuppliedFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGroupOutGrmIefSuppliedFlag(String value) {
        this.outGroupOutGrmIefSuppliedFlag = value;
    }

    /**
     * Gets the value of the outGroupOutGrmMontranBanksBankCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGroupOutGrmMontranBanksBankCode() {
        return outGroupOutGrmMontranBanksBankCode;
    }

    /**
     * Sets the value of the outGroupOutGrmMontranBanksBankCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGroupOutGrmMontranBanksBankCode(String value) {
        this.outGroupOutGrmMontranBanksBankCode = value;
    }

    /**
     * Gets the value of the outGroupOutGrmMontranBanksDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGroupOutGrmMontranBanksDescription() {
        return outGroupOutGrmMontranBanksDescription;
    }

    /**
     * Sets the value of the outGroupOutGrmMontranBanksDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGroupOutGrmMontranBanksDescription(String value) {
        this.outGroupOutGrmMontranBanksDescription = value;
    }

    /**
     * Gets the value of the outGroupOutGrmSelectIefSuppliedSelectChar property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGroupOutGrmSelectIefSuppliedSelectChar() {
        return outGroupOutGrmSelectIefSuppliedSelectChar;
    }

    /**
     * Sets the value of the outGroupOutGrmSelectIefSuppliedSelectChar property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGroupOutGrmSelectIefSuppliedSelectChar(String value) {
        this.outGroupOutGrmSelectIefSuppliedSelectChar = value;
    }

    /**
     * Gets the value of the outGroupOutGrmThirdpartyTemplatPrompt1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGroupOutGrmThirdpartyTemplatPrompt1() {
        return outGroupOutGrmThirdpartyTemplatPrompt1;
    }

    /**
     * Sets the value of the outGroupOutGrmThirdpartyTemplatPrompt1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGroupOutGrmThirdpartyTemplatPrompt1(String value) {
        this.outGroupOutGrmThirdpartyTemplatPrompt1 = value;
    }

    /**
     * Gets the value of the outGroupOutGrmThirdpartyTemplatPrompt2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGroupOutGrmThirdpartyTemplatPrompt2() {
        return outGroupOutGrmThirdpartyTemplatPrompt2;
    }

    /**
     * Sets the value of the outGroupOutGrmThirdpartyTemplatPrompt2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGroupOutGrmThirdpartyTemplatPrompt2(String value) {
        this.outGroupOutGrmThirdpartyTemplatPrompt2 = value;
    }

    /**
     * Gets the value of the outGroupOutGrmThirdpartyTemplatPrompt3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGroupOutGrmThirdpartyTemplatPrompt3() {
        return outGroupOutGrmThirdpartyTemplatPrompt3;
    }

    /**
     * Sets the value of the outGroupOutGrmThirdpartyTemplatPrompt3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGroupOutGrmThirdpartyTemplatPrompt3(String value) {
        this.outGroupOutGrmThirdpartyTemplatPrompt3 = value;
    }

    /**
     * Gets the value of the outGroupOutGrmThirdpartyTemplatPrompt4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGroupOutGrmThirdpartyTemplatPrompt4() {
        return outGroupOutGrmThirdpartyTemplatPrompt4;
    }

    /**
     * Sets the value of the outGroupOutGrmThirdpartyTemplatPrompt4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGroupOutGrmThirdpartyTemplatPrompt4(String value) {
        this.outGroupOutGrmThirdpartyTemplatPrompt4 = value;
    }

    /**
     * Gets the value of the outGroupOutGrmTpCrAccCurrencyShortDescr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGroupOutGrmTpCrAccCurrencyShortDescr() {
        return outGroupOutGrmTpCrAccCurrencyShortDescr;
    }

    /**
     * Sets the value of the outGroupOutGrmTpCrAccCurrencyShortDescr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGroupOutGrmTpCrAccCurrencyShortDescr(String value) {
        this.outGroupOutGrmTpCrAccCurrencyShortDescr = value;
    }

    /**
     * Gets the value of the outGroupOutGrmTpCrCustCurrencyShortDescr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGroupOutGrmTpCrCustCurrencyShortDescr() {
        return outGroupOutGrmTpCrCustCurrencyShortDescr;
    }

    /**
     * Sets the value of the outGroupOutGrmTpCrCustCurrencyShortDescr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGroupOutGrmTpCrCustCurrencyShortDescr(String value) {
        this.outGroupOutGrmTpCrCustCurrencyShortDescr = value;
    }

    /**
     * Gets the value of the outGroupOutGrmTpDrAccCurrencyShortDescr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGroupOutGrmTpDrAccCurrencyShortDescr() {
        return outGroupOutGrmTpDrAccCurrencyShortDescr;
    }

    /**
     * Sets the value of the outGroupOutGrmTpDrAccCurrencyShortDescr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGroupOutGrmTpDrAccCurrencyShortDescr(String value) {
        this.outGroupOutGrmTpDrAccCurrencyShortDescr = value;
    }

    /**
     * Gets the value of the outGroupOutGrmTpDrCustCurrencyShortDescr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGroupOutGrmTpDrCustCurrencyShortDescr() {
        return outGroupOutGrmTpDrCustCurrencyShortDescr;
    }

    /**
     * Sets the value of the outGroupOutGrmTpDrCustCurrencyShortDescr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGroupOutGrmTpDrCustCurrencyShortDescr(String value) {
        this.outGroupOutGrmTpDrCustCurrencyShortDescr = value;
    }

    /**
     * Gets the value of the outGroupOutGrmTpSoCommitmentActivationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutGroupOutGrmTpSoCommitmentActivationDate() {
        return outGroupOutGrmTpSoCommitmentActivationDate;
    }

    /**
     * Sets the value of the outGroupOutGrmTpSoCommitmentActivationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutGroupOutGrmTpSoCommitmentActivationDate(XMLGregorianCalendar value) {
        this.outGroupOutGrmTpSoCommitmentActivationDate = value;
    }

    /**
     * Gets the value of the outGroupOutGrmTpSoCommitmentAdvancesRelated property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGroupOutGrmTpSoCommitmentAdvancesRelated() {
        return outGroupOutGrmTpSoCommitmentAdvancesRelated;
    }

    /**
     * Sets the value of the outGroupOutGrmTpSoCommitmentAdvancesRelated property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGroupOutGrmTpSoCommitmentAdvancesRelated(String value) {
        this.outGroupOutGrmTpSoCommitmentAdvancesRelated = value;
    }

    /**
     * Gets the value of the outGroupOutGrmTpSoCommitmentBpBenefAddress1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGroupOutGrmTpSoCommitmentBpBenefAddress1() {
        return outGroupOutGrmTpSoCommitmentBpBenefAddress1;
    }

    /**
     * Sets the value of the outGroupOutGrmTpSoCommitmentBpBenefAddress1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGroupOutGrmTpSoCommitmentBpBenefAddress1(String value) {
        this.outGroupOutGrmTpSoCommitmentBpBenefAddress1 = value;
    }

    /**
     * Gets the value of the outGroupOutGrmTpSoCommitmentBpBenefAddress2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGroupOutGrmTpSoCommitmentBpBenefAddress2() {
        return outGroupOutGrmTpSoCommitmentBpBenefAddress2;
    }

    /**
     * Sets the value of the outGroupOutGrmTpSoCommitmentBpBenefAddress2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGroupOutGrmTpSoCommitmentBpBenefAddress2(String value) {
        this.outGroupOutGrmTpSoCommitmentBpBenefAddress2 = value;
    }

    /**
     * Gets the value of the outGroupOutGrmTpSoCommitmentBpBenefCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGroupOutGrmTpSoCommitmentBpBenefCity() {
        return outGroupOutGrmTpSoCommitmentBpBenefCity;
    }

    /**
     * Sets the value of the outGroupOutGrmTpSoCommitmentBpBenefCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGroupOutGrmTpSoCommitmentBpBenefCity(String value) {
        this.outGroupOutGrmTpSoCommitmentBpBenefCity = value;
    }

    /**
     * Gets the value of the outGroupOutGrmTpSoCommitmentBpBenefCountry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGroupOutGrmTpSoCommitmentBpBenefCountry() {
        return outGroupOutGrmTpSoCommitmentBpBenefCountry;
    }

    /**
     * Sets the value of the outGroupOutGrmTpSoCommitmentBpBenefCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGroupOutGrmTpSoCommitmentBpBenefCountry(String value) {
        this.outGroupOutGrmTpSoCommitmentBpBenefCountry = value;
    }

    /**
     * Gets the value of the outGroupOutGrmTpSoCommitmentBpBenefName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGroupOutGrmTpSoCommitmentBpBenefName() {
        return outGroupOutGrmTpSoCommitmentBpBenefName;
    }

    /**
     * Sets the value of the outGroupOutGrmTpSoCommitmentBpBenefName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGroupOutGrmTpSoCommitmentBpBenefName(String value) {
        this.outGroupOutGrmTpSoCommitmentBpBenefName = value;
    }

    /**
     * Gets the value of the outGroupOutGrmTpSoCommitmentBpBenefZipCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGroupOutGrmTpSoCommitmentBpBenefZipCode() {
        return outGroupOutGrmTpSoCommitmentBpBenefZipCode;
    }

    /**
     * Sets the value of the outGroupOutGrmTpSoCommitmentBpBenefZipCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGroupOutGrmTpSoCommitmentBpBenefZipCode(String value) {
        this.outGroupOutGrmTpSoCommitmentBpBenefZipCode = value;
    }

    /**
     * Gets the value of the outGroupOutGrmTpSoCommitmentCrAccComments property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGroupOutGrmTpSoCommitmentCrAccComments() {
        return outGroupOutGrmTpSoCommitmentCrAccComments;
    }

    /**
     * Sets the value of the outGroupOutGrmTpSoCommitmentCrAccComments property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGroupOutGrmTpSoCommitmentCrAccComments(String value) {
        this.outGroupOutGrmTpSoCommitmentCrAccComments = value;
    }

    /**
     * Gets the value of the outGroupOutGrmTpSoCommitmentCrAccCustomerCd property.
     * 
     */
    public short getOutGroupOutGrmTpSoCommitmentCrAccCustomerCd() {
        return outGroupOutGrmTpSoCommitmentCrAccCustomerCd;
    }

    /**
     * Sets the value of the outGroupOutGrmTpSoCommitmentCrAccCustomerCd property.
     * 
     */
    public void setOutGroupOutGrmTpSoCommitmentCrAccCustomerCd(short value) {
        this.outGroupOutGrmTpSoCommitmentCrAccCustomerCd = value;
    }

    /**
     * Gets the value of the outGroupOutGrmTpSoCommitmentCrAccCustomerId property.
     * 
     */
    public int getOutGroupOutGrmTpSoCommitmentCrAccCustomerId() {
        return outGroupOutGrmTpSoCommitmentCrAccCustomerId;
    }

    /**
     * Sets the value of the outGroupOutGrmTpSoCommitmentCrAccCustomerId property.
     * 
     */
    public void setOutGroupOutGrmTpSoCommitmentCrAccCustomerId(int value) {
        this.outGroupOutGrmTpSoCommitmentCrAccCustomerId = value;
    }

    /**
     * Gets the value of the outGroupOutGrmTpSoCommitmentCrChargeType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGroupOutGrmTpSoCommitmentCrChargeType() {
        return outGroupOutGrmTpSoCommitmentCrChargeType;
    }

    /**
     * Sets the value of the outGroupOutGrmTpSoCommitmentCrChargeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGroupOutGrmTpSoCommitmentCrChargeType(String value) {
        this.outGroupOutGrmTpSoCommitmentCrChargeType = value;
    }

    /**
     * Gets the value of the outGroupOutGrmTpSoCommitmentCrPrintAdvice property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGroupOutGrmTpSoCommitmentCrPrintAdvice() {
        return outGroupOutGrmTpSoCommitmentCrPrintAdvice;
    }

    /**
     * Sets the value of the outGroupOutGrmTpSoCommitmentCrPrintAdvice property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGroupOutGrmTpSoCommitmentCrPrintAdvice(String value) {
        this.outGroupOutGrmTpSoCommitmentCrPrintAdvice = value;
    }

    /**
     * Gets the value of the outGroupOutGrmTpSoCommitmentDataField1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGroupOutGrmTpSoCommitmentDataField1() {
        return outGroupOutGrmTpSoCommitmentDataField1;
    }

    /**
     * Sets the value of the outGroupOutGrmTpSoCommitmentDataField1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGroupOutGrmTpSoCommitmentDataField1(String value) {
        this.outGroupOutGrmTpSoCommitmentDataField1 = value;
    }

    /**
     * Gets the value of the outGroupOutGrmTpSoCommitmentDataField2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGroupOutGrmTpSoCommitmentDataField2() {
        return outGroupOutGrmTpSoCommitmentDataField2;
    }

    /**
     * Sets the value of the outGroupOutGrmTpSoCommitmentDataField2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGroupOutGrmTpSoCommitmentDataField2(String value) {
        this.outGroupOutGrmTpSoCommitmentDataField2 = value;
    }

    /**
     * Gets the value of the outGroupOutGrmTpSoCommitmentDataField3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGroupOutGrmTpSoCommitmentDataField3() {
        return outGroupOutGrmTpSoCommitmentDataField3;
    }

    /**
     * Sets the value of the outGroupOutGrmTpSoCommitmentDataField3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGroupOutGrmTpSoCommitmentDataField3(String value) {
        this.outGroupOutGrmTpSoCommitmentDataField3 = value;
    }

    /**
     * Gets the value of the outGroupOutGrmTpSoCommitmentDataField4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGroupOutGrmTpSoCommitmentDataField4() {
        return outGroupOutGrmTpSoCommitmentDataField4;
    }

    /**
     * Sets the value of the outGroupOutGrmTpSoCommitmentDataField4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGroupOutGrmTpSoCommitmentDataField4(String value) {
        this.outGroupOutGrmTpSoCommitmentDataField4 = value;
    }

    /**
     * Gets the value of the outGroupOutGrmTpSoCommitmentDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGroupOutGrmTpSoCommitmentDescription() {
        return outGroupOutGrmTpSoCommitmentDescription;
    }

    /**
     * Sets the value of the outGroupOutGrmTpSoCommitmentDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGroupOutGrmTpSoCommitmentDescription(String value) {
        this.outGroupOutGrmTpSoCommitmentDescription = value;
    }

    /**
     * Gets the value of the outGroupOutGrmTpSoCommitmentDrAccComments property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGroupOutGrmTpSoCommitmentDrAccComments() {
        return outGroupOutGrmTpSoCommitmentDrAccComments;
    }

    /**
     * Sets the value of the outGroupOutGrmTpSoCommitmentDrAccComments property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGroupOutGrmTpSoCommitmentDrAccComments(String value) {
        this.outGroupOutGrmTpSoCommitmentDrAccComments = value;
    }

    /**
     * Gets the value of the outGroupOutGrmTpSoCommitmentDrAccCustomerCd property.
     * 
     */
    public short getOutGroupOutGrmTpSoCommitmentDrAccCustomerCd() {
        return outGroupOutGrmTpSoCommitmentDrAccCustomerCd;
    }

    /**
     * Sets the value of the outGroupOutGrmTpSoCommitmentDrAccCustomerCd property.
     * 
     */
    public void setOutGroupOutGrmTpSoCommitmentDrAccCustomerCd(short value) {
        this.outGroupOutGrmTpSoCommitmentDrAccCustomerCd = value;
    }

    /**
     * Gets the value of the outGroupOutGrmTpSoCommitmentDrAccCustomerId property.
     * 
     */
    public int getOutGroupOutGrmTpSoCommitmentDrAccCustomerId() {
        return outGroupOutGrmTpSoCommitmentDrAccCustomerId;
    }

    /**
     * Sets the value of the outGroupOutGrmTpSoCommitmentDrAccCustomerId property.
     * 
     */
    public void setOutGroupOutGrmTpSoCommitmentDrAccCustomerId(int value) {
        this.outGroupOutGrmTpSoCommitmentDrAccCustomerId = value;
    }

    /**
     * Gets the value of the outGroupOutGrmTpSoCommitmentDrPrintAdvice property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGroupOutGrmTpSoCommitmentDrPrintAdvice() {
        return outGroupOutGrmTpSoCommitmentDrPrintAdvice;
    }

    /**
     * Sets the value of the outGroupOutGrmTpSoCommitmentDrPrintAdvice property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGroupOutGrmTpSoCommitmentDrPrintAdvice(String value) {
        this.outGroupOutGrmTpSoCommitmentDrPrintAdvice = value;
    }

    /**
     * Gets the value of the outGroupOutGrmTpSoCommitmentEntryStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGroupOutGrmTpSoCommitmentEntryStatus() {
        return outGroupOutGrmTpSoCommitmentEntryStatus;
    }

    /**
     * Sets the value of the outGroupOutGrmTpSoCommitmentEntryStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGroupOutGrmTpSoCommitmentEntryStatus(String value) {
        this.outGroupOutGrmTpSoCommitmentEntryStatus = value;
    }

    /**
     * Gets the value of the outGroupOutGrmTpSoCommitmentFirstPaymentAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGroupOutGrmTpSoCommitmentFirstPaymentAmn() {
        return outGroupOutGrmTpSoCommitmentFirstPaymentAmn;
    }

    /**
     * Sets the value of the outGroupOutGrmTpSoCommitmentFirstPaymentAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGroupOutGrmTpSoCommitmentFirstPaymentAmn(BigDecimal value) {
        this.outGroupOutGrmTpSoCommitmentFirstPaymentAmn = value;
    }

    /**
     * Gets the value of the outGroupOutGrmTpSoCommitmentFirstPaymentDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutGroupOutGrmTpSoCommitmentFirstPaymentDate() {
        return outGroupOutGrmTpSoCommitmentFirstPaymentDate;
    }

    /**
     * Sets the value of the outGroupOutGrmTpSoCommitmentFirstPaymentDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutGroupOutGrmTpSoCommitmentFirstPaymentDate(XMLGregorianCalendar value) {
        this.outGroupOutGrmTpSoCommitmentFirstPaymentDate = value;
    }

    /**
     * Gets the value of the outGroupOutGrmTpSoCommitmentFrequency property.
     * 
     */
    public short getOutGroupOutGrmTpSoCommitmentFrequency() {
        return outGroupOutGrmTpSoCommitmentFrequency;
    }

    /**
     * Sets the value of the outGroupOutGrmTpSoCommitmentFrequency property.
     * 
     */
    public void setOutGroupOutGrmTpSoCommitmentFrequency(short value) {
        this.outGroupOutGrmTpSoCommitmentFrequency = value;
    }

    /**
     * Gets the value of the outGroupOutGrmTpSoCommitmentFrequencyUnit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGroupOutGrmTpSoCommitmentFrequencyUnit() {
        return outGroupOutGrmTpSoCommitmentFrequencyUnit;
    }

    /**
     * Sets the value of the outGroupOutGrmTpSoCommitmentFrequencyUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGroupOutGrmTpSoCommitmentFrequencyUnit(String value) {
        this.outGroupOutGrmTpSoCommitmentFrequencyUnit = value;
    }

    /**
     * Gets the value of the outGroupOutGrmTpSoCommitmentLastPaymentAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGroupOutGrmTpSoCommitmentLastPaymentAmn() {
        return outGroupOutGrmTpSoCommitmentLastPaymentAmn;
    }

    /**
     * Sets the value of the outGroupOutGrmTpSoCommitmentLastPaymentAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGroupOutGrmTpSoCommitmentLastPaymentAmn(BigDecimal value) {
        this.outGroupOutGrmTpSoCommitmentLastPaymentAmn = value;
    }

    /**
     * Gets the value of the outGroupOutGrmTpSoCommitmentLastPaymentDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutGroupOutGrmTpSoCommitmentLastPaymentDate() {
        return outGroupOutGrmTpSoCommitmentLastPaymentDate;
    }

    /**
     * Sets the value of the outGroupOutGrmTpSoCommitmentLastPaymentDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutGroupOutGrmTpSoCommitmentLastPaymentDate(XMLGregorianCalendar value) {
        this.outGroupOutGrmTpSoCommitmentLastPaymentDate = value;
    }

    /**
     * Gets the value of the outGroupOutGrmTpSoCommitmentMaxNoOfAttempts property.
     * 
     */
    public short getOutGroupOutGrmTpSoCommitmentMaxNoOfAttempts() {
        return outGroupOutGrmTpSoCommitmentMaxNoOfAttempts;
    }

    /**
     * Sets the value of the outGroupOutGrmTpSoCommitmentMaxNoOfAttempts property.
     * 
     */
    public void setOutGroupOutGrmTpSoCommitmentMaxNoOfAttempts(short value) {
        this.outGroupOutGrmTpSoCommitmentMaxNoOfAttempts = value;
    }

    /**
     * Gets the value of the outGroupOutGrmTpSoCommitmentOtherBankAccCd property.
     * 
     */
    public short getOutGroupOutGrmTpSoCommitmentOtherBankAccCd() {
        return outGroupOutGrmTpSoCommitmentOtherBankAccCd;
    }

    /**
     * Sets the value of the outGroupOutGrmTpSoCommitmentOtherBankAccCd property.
     * 
     */
    public void setOutGroupOutGrmTpSoCommitmentOtherBankAccCd(short value) {
        this.outGroupOutGrmTpSoCommitmentOtherBankAccCd = value;
    }

    /**
     * Gets the value of the outGroupOutGrmTpSoCommitmentOtherBankAccNo property.
     * 
     */
    public double getOutGroupOutGrmTpSoCommitmentOtherBankAccNo() {
        return outGroupOutGrmTpSoCommitmentOtherBankAccNo;
    }

    /**
     * Sets the value of the outGroupOutGrmTpSoCommitmentOtherBankAccNo property.
     * 
     */
    public void setOutGroupOutGrmTpSoCommitmentOtherBankAccNo(double value) {
        this.outGroupOutGrmTpSoCommitmentOtherBankAccNo = value;
    }

    /**
     * Gets the value of the outGroupOutGrmTpSoCommitmentOtherBankCode property.
     * 
     */
    public int getOutGroupOutGrmTpSoCommitmentOtherBankCode() {
        return outGroupOutGrmTpSoCommitmentOtherBankCode;
    }

    /**
     * Sets the value of the outGroupOutGrmTpSoCommitmentOtherBankCode property.
     * 
     */
    public void setOutGroupOutGrmTpSoCommitmentOtherBankCode(int value) {
        this.outGroupOutGrmTpSoCommitmentOtherBankCode = value;
    }

    /**
     * Gets the value of the outGroupOutGrmTpSoCommitmentOtherBankUnit property.
     * 
     */
    public int getOutGroupOutGrmTpSoCommitmentOtherBankUnit() {
        return outGroupOutGrmTpSoCommitmentOtherBankUnit;
    }

    /**
     * Sets the value of the outGroupOutGrmTpSoCommitmentOtherBankUnit property.
     * 
     */
    public void setOutGroupOutGrmTpSoCommitmentOtherBankUnit(int value) {
        this.outGroupOutGrmTpSoCommitmentOtherBankUnit = value;
    }

    /**
     * Gets the value of the outGroupOutGrmTpSoCommitmentPaymentAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGroupOutGrmTpSoCommitmentPaymentAmount() {
        return outGroupOutGrmTpSoCommitmentPaymentAmount;
    }

    /**
     * Sets the value of the outGroupOutGrmTpSoCommitmentPaymentAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGroupOutGrmTpSoCommitmentPaymentAmount(BigDecimal value) {
        this.outGroupOutGrmTpSoCommitmentPaymentAmount = value;
    }

    /**
     * Gets the value of the outGroupOutGrmTpSoCommitmentPaymentsCount property.
     * 
     */
    public int getOutGroupOutGrmTpSoCommitmentPaymentsCount() {
        return outGroupOutGrmTpSoCommitmentPaymentsCount;
    }

    /**
     * Sets the value of the outGroupOutGrmTpSoCommitmentPaymentsCount property.
     * 
     */
    public void setOutGroupOutGrmTpSoCommitmentPaymentsCount(int value) {
        this.outGroupOutGrmTpSoCommitmentPaymentsCount = value;
    }

    /**
     * Gets the value of the outGroupOutGrmTpSoCommitmentPoFbCharges property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGroupOutGrmTpSoCommitmentPoFbCharges() {
        return outGroupOutGrmTpSoCommitmentPoFbCharges;
    }

    /**
     * Sets the value of the outGroupOutGrmTpSoCommitmentPoFbCharges property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGroupOutGrmTpSoCommitmentPoFbCharges(String value) {
        this.outGroupOutGrmTpSoCommitmentPoFbCharges = value;
    }

    /**
     * Gets the value of the outGroupOutGrmTpSoCommitmentPrivilegedFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGroupOutGrmTpSoCommitmentPrivilegedFlag() {
        return outGroupOutGrmTpSoCommitmentPrivilegedFlag;
    }

    /**
     * Sets the value of the outGroupOutGrmTpSoCommitmentPrivilegedFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGroupOutGrmTpSoCommitmentPrivilegedFlag(String value) {
        this.outGroupOutGrmTpSoCommitmentPrivilegedFlag = value;
    }

    /**
     * Gets the value of the outGroupOutGrmTpSoCommitmentStandOrderMethod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGroupOutGrmTpSoCommitmentStandOrderMethod() {
        return outGroupOutGrmTpSoCommitmentStandOrderMethod;
    }

    /**
     * Sets the value of the outGroupOutGrmTpSoCommitmentStandOrderMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGroupOutGrmTpSoCommitmentStandOrderMethod(String value) {
        this.outGroupOutGrmTpSoCommitmentStandOrderMethod = value;
    }

    /**
     * Gets the value of the outGroupOutGrmTpSoCommitmentSuspensDateFrom property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutGroupOutGrmTpSoCommitmentSuspensDateFrom() {
        return outGroupOutGrmTpSoCommitmentSuspensDateFrom;
    }

    /**
     * Sets the value of the outGroupOutGrmTpSoCommitmentSuspensDateFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutGroupOutGrmTpSoCommitmentSuspensDateFrom(XMLGregorianCalendar value) {
        this.outGroupOutGrmTpSoCommitmentSuspensDateFrom = value;
    }

    /**
     * Gets the value of the outGroupOutGrmTpSoCommitmentSuspensDateTo property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutGroupOutGrmTpSoCommitmentSuspensDateTo() {
        return outGroupOutGrmTpSoCommitmentSuspensDateTo;
    }

    /**
     * Sets the value of the outGroupOutGrmTpSoCommitmentSuspensDateTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutGroupOutGrmTpSoCommitmentSuspensDateTo(XMLGregorianCalendar value) {
        this.outGroupOutGrmTpSoCommitmentSuspensDateTo = value;
    }

    /**
     * Gets the value of the outGroupOutGrmTpSoCommitmentSuspensExecutions property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGroupOutGrmTpSoCommitmentSuspensExecutions() {
        return outGroupOutGrmTpSoCommitmentSuspensExecutions;
    }

    /**
     * Sets the value of the outGroupOutGrmTpSoCommitmentSuspensExecutions property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGroupOutGrmTpSoCommitmentSuspensExecutions(String value) {
        this.outGroupOutGrmTpSoCommitmentSuspensExecutions = value;
    }

    /**
     * Gets the value of the outGroupOutGrmTpSoCommitmentTotalAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGroupOutGrmTpSoCommitmentTotalAmount() {
        return outGroupOutGrmTpSoCommitmentTotalAmount;
    }

    /**
     * Sets the value of the outGroupOutGrmTpSoCommitmentTotalAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGroupOutGrmTpSoCommitmentTotalAmount(BigDecimal value) {
        this.outGroupOutGrmTpSoCommitmentTotalAmount = value;
    }

    /**
     * Gets the value of the outGroupOutGrmTpSoCommitmentTpSoIdentifier property.
     * 
     */
    public double getOutGroupOutGrmTpSoCommitmentTpSoIdentifier() {
        return outGroupOutGrmTpSoCommitmentTpSoIdentifier;
    }

    /**
     * Sets the value of the outGroupOutGrmTpSoCommitmentTpSoIdentifier property.
     * 
     */
    public void setOutGroupOutGrmTpSoCommitmentTpSoIdentifier(double value) {
        this.outGroupOutGrmTpSoCommitmentTpSoIdentifier = value;
    }

    /**
     * Gets the value of the outGroupOutGrmTpSoCommitmentTpSoIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGroupOutGrmTpSoCommitmentTpSoIndicator() {
        return outGroupOutGrmTpSoCommitmentTpSoIndicator;
    }

    /**
     * Sets the value of the outGroupOutGrmTpSoCommitmentTpSoIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGroupOutGrmTpSoCommitmentTpSoIndicator(String value) {
        this.outGroupOutGrmTpSoCommitmentTpSoIndicator = value;
    }

    /**
     * Gets the value of the outGroupOutGrmUnitCode property.
     * 
     */
    public int getOutGroupOutGrmUnitCode() {
        return outGroupOutGrmUnitCode;
    }

    /**
     * Sets the value of the outGroupOutGrmUnitCode property.
     * 
     */
    public void setOutGroupOutGrmUnitCode(int value) {
        this.outGroupOutGrmUnitCode = value;
    }

}
