
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for FEXS01_FundsTransferWithExchangeImport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FEXS01_FundsTransferWithExchangeImport">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}BaseImport">
 *       &lt;sequence>
 *         &lt;element name="Command" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InAuthorIefSuppliedFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InBlackListIefSuppliedExchangePurchaseDocNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InBoughtAmountIefSuppliedCheckDigit" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InBoughtAmountIefSuppliedPayableAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InBoughtProfitsAccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InBoughtProfitsAccountCd" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InBoughtProfitsAccountPrftSystem" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InBoughtDepositAccountDesignation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InBoughtDepositAccountEntryStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InBoughtIbanWorkSetChar37" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InBoughtJustificIdJustific" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InBoughtPrftTransactionIdTransact" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InBoughtRepCustomerCDigit" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InBoughtRepCustomerCustId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InBoughtValueDaysIefSuppliedValueDays" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InBoughtValueWorkDatesProductionDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InChargesAccountIefSuppliedFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InChargesDiscountIefSuppliedGenPercentage" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InChequeBookItemIssueDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InChequeBookItemItemSerialNumber" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="InCommentsGenericDetailDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCommentsGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InCommissionsDiscountIefSuppliedGenPercentage" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InCreditDepTrxRecordingIComments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCustAdditionalCustomerTelephone1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCustAddressAddress1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCustAddressAddress2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCustAddressCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCustAddressZipCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCustCountryGenericDetailDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCustCountryGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InCustListSetDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCustNationalityGenericDetailDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCustNationalityGenericDetailParameterType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCustNationalityGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InCustOtherAfmAfmNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCustomerCDigit" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InCustomerCustId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InDealerPenaltyUsrCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InDealerSpecialRateDealerRefNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InDealerUsrCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InDebitDepTrxRecordingIComments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InDepositCDigitIefSuppliedCheckDigit" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InFwdSwapContractsContractDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InFwdSwapContractsCurrencyRate" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InFwdSwapContractsDealerRefNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InFwdSwapContractsEntryComments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InFwdSwapContractsEntryStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InFwdSwapContractsExecDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InFwdSwapContractsMaturityDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InFwdSwapContractsNotificationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InFwdSwapContractsOrgSourceAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InFwdSwapContractsOrgTargetAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InFwdSwapContractsReferenceNo" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InFwdSwapContractsSourceUtilBal" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InFwdSwapContractsStartDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InFwdSwapContractsTargetUtilBal" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InFwdSwapContractsWayOfUtilization" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InGenericIdIefSuppliedIdentificationType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InGenericIdIefSuppliedIdentityPassportNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InGenericIdIefSuppliedIssueAuthority" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InGrpParametersInGrmBankParametersMaxAmntRateTbl" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InGrpParametersInGrmGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InGrpParametersInGrmTerminalTerminalNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InGrpParametersInGrmTrxCountTrxCounter" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InGrpParametersInGrmWorkDaysWorkDatesProductionDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InIdentCountryGenericDetailDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InIdentCountryGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InJustificIdJustific" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InOtherIdIdNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InPenaltyDealerSpecialRateDealerRefNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InPostIefSuppliedFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InPrftTransactionIdTransact" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InProductIdProduct" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InResidentIefSuppliedFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InSoldAmountIefSuppliedPayableAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InSoldAvailabilityDaysIefSuppliedValueDays" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InSoldAvailabilityWorkDatesProductionDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InSoldProfitsAccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InSoldProfitsAccountCd" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InSoldProfitsAccountPrftSystem" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InSoldDepositAccountDesignation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InSoldDepositAccountEntryStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InSoldIbanWorkSetChar37" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InSoldJustificIdJustific" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InSoldPrftTransactionIdTransact" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InSoldRepCustomerCDigit" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InSoldRepCustomerCustId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InSoldValueDaysIefSuppliedValueDays" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InSoldValueWorkDatesProductionDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InSpecialRateTableIefSuppliedFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InTrxFxFtRecordingSourceTrnType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InTrxFxFtRecordingTargetTrnType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InUseWayIefSuppliedFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InGrpAuth" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}ArrayOfFEXS01InGrpAuthItem" minOccurs="0"/>
 *         &lt;element name="InGrpChargesRecording" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}ArrayOfFEXS01InGrpChargesRecordingItem" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FEXS01_FundsTransferWithExchangeImport", propOrder = {
    "command",
    "inAuthorIefSuppliedFlag",
    "inBlackListIefSuppliedExchangePurchaseDocNo",
    "inBoughtAmountIefSuppliedCheckDigit",
    "inBoughtAmountIefSuppliedPayableAmount",
    "inBoughtProfitsAccountNumber",
    "inBoughtProfitsAccountCd",
    "inBoughtProfitsAccountPrftSystem",
    "inBoughtDepositAccountDesignation",
    "inBoughtDepositAccountEntryStatus",
    "inBoughtIbanWorkSetChar37",
    "inBoughtJustificIdJustific",
    "inBoughtPrftTransactionIdTransact",
    "inBoughtRepCustomerCDigit",
    "inBoughtRepCustomerCustId",
    "inBoughtValueDaysIefSuppliedValueDays",
    "inBoughtValueWorkDatesProductionDate",
    "inChargesAccountIefSuppliedFlag",
    "inChargesDiscountIefSuppliedGenPercentage",
    "inChequeBookItemIssueDate",
    "inChequeBookItemItemSerialNumber",
    "inCommentsGenericDetailDescription",
    "inCommentsGenericDetailSerialNum",
    "inCommissionsDiscountIefSuppliedGenPercentage",
    "inCreditDepTrxRecordingIComments",
    "inCustAdditionalCustomerTelephone1",
    "inCustAddressAddress1",
    "inCustAddressAddress2",
    "inCustAddressCity",
    "inCustAddressZipCode",
    "inCustCountryGenericDetailDescription",
    "inCustCountryGenericDetailSerialNum",
    "inCustListSetDescription",
    "inCustNationalityGenericDetailDescription",
    "inCustNationalityGenericDetailParameterType",
    "inCustNationalityGenericDetailSerialNum",
    "inCustOtherAfmAfmNo",
    "inCustomerCDigit",
    "inCustomerCustId",
    "inDealerPenaltyUsrCode",
    "inDealerSpecialRateDealerRefNo",
    "inDealerUsrCode",
    "inDebitDepTrxRecordingIComments",
    "inDepositCDigitIefSuppliedCheckDigit",
    "inFwdSwapContractsContractDate",
    "inFwdSwapContractsCurrencyRate",
    "inFwdSwapContractsDealerRefNo",
    "inFwdSwapContractsEntryComments",
    "inFwdSwapContractsEntryStatus",
    "inFwdSwapContractsExecDate",
    "inFwdSwapContractsMaturityDate",
    "inFwdSwapContractsNotificationDate",
    "inFwdSwapContractsOrgSourceAmount",
    "inFwdSwapContractsOrgTargetAmount",
    "inFwdSwapContractsReferenceNo",
    "inFwdSwapContractsSourceUtilBal",
    "inFwdSwapContractsStartDate",
    "inFwdSwapContractsTargetUtilBal",
    "inFwdSwapContractsWayOfUtilization",
    "inGenericIdIefSuppliedIdentificationType",
    "inGenericIdIefSuppliedIdentityPassportNo",
    "inGenericIdIefSuppliedIssueAuthority",
    "inGrpParametersInGrmBankParametersMaxAmntRateTbl",
    "inGrpParametersInGrmGenericDetailSerialNum",
    "inGrpParametersInGrmTerminalTerminalNumber",
    "inGrpParametersInGrmTrxCountTrxCounter",
    "inGrpParametersInGrmWorkDaysWorkDatesProductionDate",
    "inIdentCountryGenericDetailDescription",
    "inIdentCountryGenericDetailSerialNum",
    "inJustificIdJustific",
    "inOtherIdIdNo",
    "inPenaltyDealerSpecialRateDealerRefNo",
    "inPostIefSuppliedFlag",
    "inPrftTransactionIdTransact",
    "inProductIdProduct",
    "inResidentIefSuppliedFlag",
    "inSoldAmountIefSuppliedPayableAmount",
    "inSoldAvailabilityDaysIefSuppliedValueDays",
    "inSoldAvailabilityWorkDatesProductionDate",
    "inSoldProfitsAccountNumber",
    "inSoldProfitsAccountCd",
    "inSoldProfitsAccountPrftSystem",
    "inSoldDepositAccountDesignation",
    "inSoldDepositAccountEntryStatus",
    "inSoldIbanWorkSetChar37",
    "inSoldJustificIdJustific",
    "inSoldPrftTransactionIdTransact",
    "inSoldRepCustomerCDigit",
    "inSoldRepCustomerCustId",
    "inSoldValueDaysIefSuppliedValueDays",
    "inSoldValueWorkDatesProductionDate",
    "inSpecialRateTableIefSuppliedFlag",
    "inTrxFxFtRecordingSourceTrnType",
    "inTrxFxFtRecordingTargetTrnType",
    "inUseWayIefSuppliedFlag",
    "inGrpAuth",
    "inGrpChargesRecording"
})
public class FEXS01FundsTransferWithExchangeImport
    extends BaseImport
{

    @XmlElement(name = "Command")
    protected String command;
    @XmlElement(name = "InAuthorIefSuppliedFlag")
    protected String inAuthorIefSuppliedFlag;
    @XmlElement(name = "InBlackListIefSuppliedExchangePurchaseDocNo")
    protected String inBlackListIefSuppliedExchangePurchaseDocNo;
    @XmlElement(name = "InBoughtAmountIefSuppliedCheckDigit")
    protected short inBoughtAmountIefSuppliedCheckDigit;
    @XmlElement(name = "InBoughtAmountIefSuppliedPayableAmount", required = true)
    protected BigDecimal inBoughtAmountIefSuppliedPayableAmount;
    @XmlElement(name = "InBoughtProfitsAccountNumber")
    protected String inBoughtProfitsAccountNumber;
    @XmlElement(name = "InBoughtProfitsAccountCd")
    protected short inBoughtProfitsAccountCd;
    @XmlElement(name = "InBoughtProfitsAccountPrftSystem")
    protected int inBoughtProfitsAccountPrftSystem;
    @XmlElement(name = "InBoughtDepositAccountDesignation")
    protected String inBoughtDepositAccountDesignation;
    @XmlElement(name = "InBoughtDepositAccountEntryStatus")
    protected String inBoughtDepositAccountEntryStatus;
    @XmlElement(name = "InBoughtIbanWorkSetChar37")
    protected String inBoughtIbanWorkSetChar37;
    @XmlElement(name = "InBoughtJustificIdJustific")
    protected int inBoughtJustificIdJustific;
    @XmlElement(name = "InBoughtPrftTransactionIdTransact")
    protected int inBoughtPrftTransactionIdTransact;
    @XmlElement(name = "InBoughtRepCustomerCDigit")
    protected short inBoughtRepCustomerCDigit;
    @XmlElement(name = "InBoughtRepCustomerCustId")
    protected int inBoughtRepCustomerCustId;
    @XmlElement(name = "InBoughtValueDaysIefSuppliedValueDays")
    protected short inBoughtValueDaysIefSuppliedValueDays;
    @XmlElement(name = "InBoughtValueWorkDatesProductionDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inBoughtValueWorkDatesProductionDate;
    @XmlElement(name = "InChargesAccountIefSuppliedFlag")
    protected String inChargesAccountIefSuppliedFlag;
    @XmlElement(name = "InChargesDiscountIefSuppliedGenPercentage", required = true)
    protected BigDecimal inChargesDiscountIefSuppliedGenPercentage;
    @XmlElement(name = "InChequeBookItemIssueDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inChequeBookItemIssueDate;
    @XmlElement(name = "InChequeBookItemItemSerialNumber")
    protected double inChequeBookItemItemSerialNumber;
    @XmlElement(name = "InCommentsGenericDetailDescription")
    protected String inCommentsGenericDetailDescription;
    @XmlElement(name = "InCommentsGenericDetailSerialNum")
    protected int inCommentsGenericDetailSerialNum;
    @XmlElement(name = "InCommissionsDiscountIefSuppliedGenPercentage", required = true)
    protected BigDecimal inCommissionsDiscountIefSuppliedGenPercentage;
    @XmlElement(name = "InCreditDepTrxRecordingIComments")
    protected String inCreditDepTrxRecordingIComments;
    @XmlElement(name = "InCustAdditionalCustomerTelephone1")
    protected String inCustAdditionalCustomerTelephone1;
    @XmlElement(name = "InCustAddressAddress1")
    protected String inCustAddressAddress1;
    @XmlElement(name = "InCustAddressAddress2")
    protected String inCustAddressAddress2;
    @XmlElement(name = "InCustAddressCity")
    protected String inCustAddressCity;
    @XmlElement(name = "InCustAddressZipCode")
    protected String inCustAddressZipCode;
    @XmlElement(name = "InCustCountryGenericDetailDescription")
    protected String inCustCountryGenericDetailDescription;
    @XmlElement(name = "InCustCountryGenericDetailSerialNum")
    protected int inCustCountryGenericDetailSerialNum;
    @XmlElement(name = "InCustListSetDescription")
    protected String inCustListSetDescription;
    @XmlElement(name = "InCustNationalityGenericDetailDescription")
    protected String inCustNationalityGenericDetailDescription;
    @XmlElement(name = "InCustNationalityGenericDetailParameterType")
    protected String inCustNationalityGenericDetailParameterType;
    @XmlElement(name = "InCustNationalityGenericDetailSerialNum")
    protected int inCustNationalityGenericDetailSerialNum;
    @XmlElement(name = "InCustOtherAfmAfmNo")
    protected String inCustOtherAfmAfmNo;
    @XmlElement(name = "InCustomerCDigit")
    protected short inCustomerCDigit;
    @XmlElement(name = "InCustomerCustId")
    protected int inCustomerCustId;
    @XmlElement(name = "InDealerPenaltyUsrCode")
    protected String inDealerPenaltyUsrCode;
    @XmlElement(name = "InDealerSpecialRateDealerRefNo")
    protected String inDealerSpecialRateDealerRefNo;
    @XmlElement(name = "InDealerUsrCode")
    protected String inDealerUsrCode;
    @XmlElement(name = "InDebitDepTrxRecordingIComments")
    protected String inDebitDepTrxRecordingIComments;
    @XmlElement(name = "InDepositCDigitIefSuppliedCheckDigit")
    protected short inDepositCDigitIefSuppliedCheckDigit;
    @XmlElement(name = "InFwdSwapContractsContractDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inFwdSwapContractsContractDate;
    @XmlElement(name = "InFwdSwapContractsCurrencyRate", required = true)
    protected BigDecimal inFwdSwapContractsCurrencyRate;
    @XmlElement(name = "InFwdSwapContractsDealerRefNo")
    protected String inFwdSwapContractsDealerRefNo;
    @XmlElement(name = "InFwdSwapContractsEntryComments")
    protected String inFwdSwapContractsEntryComments;
    @XmlElement(name = "InFwdSwapContractsEntryStatus")
    protected String inFwdSwapContractsEntryStatus;
    @XmlElement(name = "InFwdSwapContractsExecDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inFwdSwapContractsExecDate;
    @XmlElement(name = "InFwdSwapContractsMaturityDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inFwdSwapContractsMaturityDate;
    @XmlElement(name = "InFwdSwapContractsNotificationDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inFwdSwapContractsNotificationDate;
    @XmlElement(name = "InFwdSwapContractsOrgSourceAmount", required = true)
    protected BigDecimal inFwdSwapContractsOrgSourceAmount;
    @XmlElement(name = "InFwdSwapContractsOrgTargetAmount", required = true)
    protected BigDecimal inFwdSwapContractsOrgTargetAmount;
    @XmlElement(name = "InFwdSwapContractsReferenceNo")
    protected int inFwdSwapContractsReferenceNo;
    @XmlElement(name = "InFwdSwapContractsSourceUtilBal", required = true)
    protected BigDecimal inFwdSwapContractsSourceUtilBal;
    @XmlElement(name = "InFwdSwapContractsStartDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inFwdSwapContractsStartDate;
    @XmlElement(name = "InFwdSwapContractsTargetUtilBal", required = true)
    protected BigDecimal inFwdSwapContractsTargetUtilBal;
    @XmlElement(name = "InFwdSwapContractsWayOfUtilization")
    protected String inFwdSwapContractsWayOfUtilization;
    @XmlElement(name = "InGenericIdIefSuppliedIdentificationType")
    protected String inGenericIdIefSuppliedIdentificationType;
    @XmlElement(name = "InGenericIdIefSuppliedIdentityPassportNo")
    protected String inGenericIdIefSuppliedIdentityPassportNo;
    @XmlElement(name = "InGenericIdIefSuppliedIssueAuthority")
    protected String inGenericIdIefSuppliedIssueAuthority;
    @XmlElement(name = "InGrpParametersInGrmBankParametersMaxAmntRateTbl", required = true)
    protected BigDecimal inGrpParametersInGrmBankParametersMaxAmntRateTbl;
    @XmlElement(name = "InGrpParametersInGrmGenericDetailSerialNum")
    protected int inGrpParametersInGrmGenericDetailSerialNum;
    @XmlElement(name = "InGrpParametersInGrmTerminalTerminalNumber")
    protected String inGrpParametersInGrmTerminalTerminalNumber;
    @XmlElement(name = "InGrpParametersInGrmTrxCountTrxCounter")
    protected int inGrpParametersInGrmTrxCountTrxCounter;
    @XmlElement(name = "InGrpParametersInGrmWorkDaysWorkDatesProductionDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inGrpParametersInGrmWorkDaysWorkDatesProductionDate;
    @XmlElement(name = "InIdentCountryGenericDetailDescription")
    protected String inIdentCountryGenericDetailDescription;
    @XmlElement(name = "InIdentCountryGenericDetailSerialNum")
    protected int inIdentCountryGenericDetailSerialNum;
    @XmlElement(name = "InJustificIdJustific")
    protected int inJustificIdJustific;
    @XmlElement(name = "InOtherIdIdNo")
    protected String inOtherIdIdNo;
    @XmlElement(name = "InPenaltyDealerSpecialRateDealerRefNo")
    protected String inPenaltyDealerSpecialRateDealerRefNo;
    @XmlElement(name = "InPostIefSuppliedFlag")
    protected String inPostIefSuppliedFlag;
    @XmlElement(name = "InPrftTransactionIdTransact")
    protected int inPrftTransactionIdTransact;
    @XmlElement(name = "InProductIdProduct")
    protected int inProductIdProduct;
    @XmlElement(name = "InResidentIefSuppliedFlag")
    protected String inResidentIefSuppliedFlag;
    @XmlElement(name = "InSoldAmountIefSuppliedPayableAmount", required = true)
    protected BigDecimal inSoldAmountIefSuppliedPayableAmount;
    @XmlElement(name = "InSoldAvailabilityDaysIefSuppliedValueDays")
    protected short inSoldAvailabilityDaysIefSuppliedValueDays;
    @XmlElement(name = "InSoldAvailabilityWorkDatesProductionDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inSoldAvailabilityWorkDatesProductionDate;
    @XmlElement(name = "InSoldProfitsAccountNumber")
    protected String inSoldProfitsAccountNumber;
    @XmlElement(name = "InSoldProfitsAccountCd")
    protected short inSoldProfitsAccountCd;
    @XmlElement(name = "InSoldProfitsAccountPrftSystem")
    protected int inSoldProfitsAccountPrftSystem;
    @XmlElement(name = "InSoldDepositAccountDesignation")
    protected String inSoldDepositAccountDesignation;
    @XmlElement(name = "InSoldDepositAccountEntryStatus")
    protected String inSoldDepositAccountEntryStatus;
    @XmlElement(name = "InSoldIbanWorkSetChar37")
    protected String inSoldIbanWorkSetChar37;
    @XmlElement(name = "InSoldJustificIdJustific")
    protected int inSoldJustificIdJustific;
    @XmlElement(name = "InSoldPrftTransactionIdTransact")
    protected int inSoldPrftTransactionIdTransact;
    @XmlElement(name = "InSoldRepCustomerCDigit")
    protected short inSoldRepCustomerCDigit;
    @XmlElement(name = "InSoldRepCustomerCustId")
    protected int inSoldRepCustomerCustId;
    @XmlElement(name = "InSoldValueDaysIefSuppliedValueDays")
    protected short inSoldValueDaysIefSuppliedValueDays;
    @XmlElement(name = "InSoldValueWorkDatesProductionDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inSoldValueWorkDatesProductionDate;
    @XmlElement(name = "InSpecialRateTableIefSuppliedFlag")
    protected String inSpecialRateTableIefSuppliedFlag;
    @XmlElement(name = "InTrxFxFtRecordingSourceTrnType")
    protected String inTrxFxFtRecordingSourceTrnType;
    @XmlElement(name = "InTrxFxFtRecordingTargetTrnType")
    protected String inTrxFxFtRecordingTargetTrnType;
    @XmlElement(name = "InUseWayIefSuppliedFlag")
    protected String inUseWayIefSuppliedFlag;
    @XmlElement(name = "InGrpAuth")
    protected ArrayOfFEXS01InGrpAuthItem inGrpAuth;
    @XmlElement(name = "InGrpChargesRecording")
    protected ArrayOfFEXS01InGrpChargesRecordingItem inGrpChargesRecording;

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
     * Gets the value of the inAuthorIefSuppliedFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInAuthorIefSuppliedFlag() {
        return inAuthorIefSuppliedFlag;
    }

    /**
     * Sets the value of the inAuthorIefSuppliedFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInAuthorIefSuppliedFlag(String value) {
        this.inAuthorIefSuppliedFlag = value;
    }

    /**
     * Gets the value of the inBlackListIefSuppliedExchangePurchaseDocNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInBlackListIefSuppliedExchangePurchaseDocNo() {
        return inBlackListIefSuppliedExchangePurchaseDocNo;
    }

    /**
     * Sets the value of the inBlackListIefSuppliedExchangePurchaseDocNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInBlackListIefSuppliedExchangePurchaseDocNo(String value) {
        this.inBlackListIefSuppliedExchangePurchaseDocNo = value;
    }

    /**
     * Gets the value of the inBoughtAmountIefSuppliedCheckDigit property.
     * 
     */
    public short getInBoughtAmountIefSuppliedCheckDigit() {
        return inBoughtAmountIefSuppliedCheckDigit;
    }

    /**
     * Sets the value of the inBoughtAmountIefSuppliedCheckDigit property.
     * 
     */
    public void setInBoughtAmountIefSuppliedCheckDigit(short value) {
        this.inBoughtAmountIefSuppliedCheckDigit = value;
    }

    /**
     * Gets the value of the inBoughtAmountIefSuppliedPayableAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInBoughtAmountIefSuppliedPayableAmount() {
        return inBoughtAmountIefSuppliedPayableAmount;
    }

    /**
     * Sets the value of the inBoughtAmountIefSuppliedPayableAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInBoughtAmountIefSuppliedPayableAmount(BigDecimal value) {
        this.inBoughtAmountIefSuppliedPayableAmount = value;
    }

    /**
     * Gets the value of the inBoughtProfitsAccountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInBoughtProfitsAccountNumber() {
        return inBoughtProfitsAccountNumber;
    }

    /**
     * Sets the value of the inBoughtProfitsAccountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInBoughtProfitsAccountNumber(String value) {
        this.inBoughtProfitsAccountNumber = value;
    }

    /**
     * Gets the value of the inBoughtProfitsAccountCd property.
     * 
     */
    public short getInBoughtProfitsAccountCd() {
        return inBoughtProfitsAccountCd;
    }

    /**
     * Sets the value of the inBoughtProfitsAccountCd property.
     * 
     */
    public void setInBoughtProfitsAccountCd(short value) {
        this.inBoughtProfitsAccountCd = value;
    }

    /**
     * Gets the value of the inBoughtProfitsAccountPrftSystem property.
     * 
     */
    public int getInBoughtProfitsAccountPrftSystem() {
        return inBoughtProfitsAccountPrftSystem;
    }

    /**
     * Sets the value of the inBoughtProfitsAccountPrftSystem property.
     * 
     */
    public void setInBoughtProfitsAccountPrftSystem(int value) {
        this.inBoughtProfitsAccountPrftSystem = value;
    }

    /**
     * Gets the value of the inBoughtDepositAccountDesignation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInBoughtDepositAccountDesignation() {
        return inBoughtDepositAccountDesignation;
    }

    /**
     * Sets the value of the inBoughtDepositAccountDesignation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInBoughtDepositAccountDesignation(String value) {
        this.inBoughtDepositAccountDesignation = value;
    }

    /**
     * Gets the value of the inBoughtDepositAccountEntryStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInBoughtDepositAccountEntryStatus() {
        return inBoughtDepositAccountEntryStatus;
    }

    /**
     * Sets the value of the inBoughtDepositAccountEntryStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInBoughtDepositAccountEntryStatus(String value) {
        this.inBoughtDepositAccountEntryStatus = value;
    }

    /**
     * Gets the value of the inBoughtIbanWorkSetChar37 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInBoughtIbanWorkSetChar37() {
        return inBoughtIbanWorkSetChar37;
    }

    /**
     * Sets the value of the inBoughtIbanWorkSetChar37 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInBoughtIbanWorkSetChar37(String value) {
        this.inBoughtIbanWorkSetChar37 = value;
    }

    /**
     * Gets the value of the inBoughtJustificIdJustific property.
     * 
     */
    public int getInBoughtJustificIdJustific() {
        return inBoughtJustificIdJustific;
    }

    /**
     * Sets the value of the inBoughtJustificIdJustific property.
     * 
     */
    public void setInBoughtJustificIdJustific(int value) {
        this.inBoughtJustificIdJustific = value;
    }

    /**
     * Gets the value of the inBoughtPrftTransactionIdTransact property.
     * 
     */
    public int getInBoughtPrftTransactionIdTransact() {
        return inBoughtPrftTransactionIdTransact;
    }

    /**
     * Sets the value of the inBoughtPrftTransactionIdTransact property.
     * 
     */
    public void setInBoughtPrftTransactionIdTransact(int value) {
        this.inBoughtPrftTransactionIdTransact = value;
    }

    /**
     * Gets the value of the inBoughtRepCustomerCDigit property.
     * 
     */
    public short getInBoughtRepCustomerCDigit() {
        return inBoughtRepCustomerCDigit;
    }

    /**
     * Sets the value of the inBoughtRepCustomerCDigit property.
     * 
     */
    public void setInBoughtRepCustomerCDigit(short value) {
        this.inBoughtRepCustomerCDigit = value;
    }

    /**
     * Gets the value of the inBoughtRepCustomerCustId property.
     * 
     */
    public int getInBoughtRepCustomerCustId() {
        return inBoughtRepCustomerCustId;
    }

    /**
     * Sets the value of the inBoughtRepCustomerCustId property.
     * 
     */
    public void setInBoughtRepCustomerCustId(int value) {
        this.inBoughtRepCustomerCustId = value;
    }

    /**
     * Gets the value of the inBoughtValueDaysIefSuppliedValueDays property.
     * 
     */
    public short getInBoughtValueDaysIefSuppliedValueDays() {
        return inBoughtValueDaysIefSuppliedValueDays;
    }

    /**
     * Sets the value of the inBoughtValueDaysIefSuppliedValueDays property.
     * 
     */
    public void setInBoughtValueDaysIefSuppliedValueDays(short value) {
        this.inBoughtValueDaysIefSuppliedValueDays = value;
    }

    /**
     * Gets the value of the inBoughtValueWorkDatesProductionDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInBoughtValueWorkDatesProductionDate() {
        return inBoughtValueWorkDatesProductionDate;
    }

    /**
     * Sets the value of the inBoughtValueWorkDatesProductionDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInBoughtValueWorkDatesProductionDate(XMLGregorianCalendar value) {
        this.inBoughtValueWorkDatesProductionDate = value;
    }

    /**
     * Gets the value of the inChargesAccountIefSuppliedFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInChargesAccountIefSuppliedFlag() {
        return inChargesAccountIefSuppliedFlag;
    }

    /**
     * Sets the value of the inChargesAccountIefSuppliedFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInChargesAccountIefSuppliedFlag(String value) {
        this.inChargesAccountIefSuppliedFlag = value;
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
     * Gets the value of the inChequeBookItemIssueDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInChequeBookItemIssueDate() {
        return inChequeBookItemIssueDate;
    }

    /**
     * Sets the value of the inChequeBookItemIssueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInChequeBookItemIssueDate(XMLGregorianCalendar value) {
        this.inChequeBookItemIssueDate = value;
    }

    /**
     * Gets the value of the inChequeBookItemItemSerialNumber property.
     * 
     */
    public double getInChequeBookItemItemSerialNumber() {
        return inChequeBookItemItemSerialNumber;
    }

    /**
     * Sets the value of the inChequeBookItemItemSerialNumber property.
     * 
     */
    public void setInChequeBookItemItemSerialNumber(double value) {
        this.inChequeBookItemItemSerialNumber = value;
    }

    /**
     * Gets the value of the inCommentsGenericDetailDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCommentsGenericDetailDescription() {
        return inCommentsGenericDetailDescription;
    }

    /**
     * Sets the value of the inCommentsGenericDetailDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCommentsGenericDetailDescription(String value) {
        this.inCommentsGenericDetailDescription = value;
    }

    /**
     * Gets the value of the inCommentsGenericDetailSerialNum property.
     * 
     */
    public int getInCommentsGenericDetailSerialNum() {
        return inCommentsGenericDetailSerialNum;
    }

    /**
     * Sets the value of the inCommentsGenericDetailSerialNum property.
     * 
     */
    public void setInCommentsGenericDetailSerialNum(int value) {
        this.inCommentsGenericDetailSerialNum = value;
    }

    /**
     * Gets the value of the inCommissionsDiscountIefSuppliedGenPercentage property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInCommissionsDiscountIefSuppliedGenPercentage() {
        return inCommissionsDiscountIefSuppliedGenPercentage;
    }

    /**
     * Sets the value of the inCommissionsDiscountIefSuppliedGenPercentage property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInCommissionsDiscountIefSuppliedGenPercentage(BigDecimal value) {
        this.inCommissionsDiscountIefSuppliedGenPercentage = value;
    }

    /**
     * Gets the value of the inCreditDepTrxRecordingIComments property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCreditDepTrxRecordingIComments() {
        return inCreditDepTrxRecordingIComments;
    }

    /**
     * Sets the value of the inCreditDepTrxRecordingIComments property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCreditDepTrxRecordingIComments(String value) {
        this.inCreditDepTrxRecordingIComments = value;
    }

    /**
     * Gets the value of the inCustAdditionalCustomerTelephone1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCustAdditionalCustomerTelephone1() {
        return inCustAdditionalCustomerTelephone1;
    }

    /**
     * Sets the value of the inCustAdditionalCustomerTelephone1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCustAdditionalCustomerTelephone1(String value) {
        this.inCustAdditionalCustomerTelephone1 = value;
    }

    /**
     * Gets the value of the inCustAddressAddress1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCustAddressAddress1() {
        return inCustAddressAddress1;
    }

    /**
     * Sets the value of the inCustAddressAddress1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCustAddressAddress1(String value) {
        this.inCustAddressAddress1 = value;
    }

    /**
     * Gets the value of the inCustAddressAddress2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCustAddressAddress2() {
        return inCustAddressAddress2;
    }

    /**
     * Sets the value of the inCustAddressAddress2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCustAddressAddress2(String value) {
        this.inCustAddressAddress2 = value;
    }

    /**
     * Gets the value of the inCustAddressCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCustAddressCity() {
        return inCustAddressCity;
    }

    /**
     * Sets the value of the inCustAddressCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCustAddressCity(String value) {
        this.inCustAddressCity = value;
    }

    /**
     * Gets the value of the inCustAddressZipCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCustAddressZipCode() {
        return inCustAddressZipCode;
    }

    /**
     * Sets the value of the inCustAddressZipCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCustAddressZipCode(String value) {
        this.inCustAddressZipCode = value;
    }

    /**
     * Gets the value of the inCustCountryGenericDetailDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCustCountryGenericDetailDescription() {
        return inCustCountryGenericDetailDescription;
    }

    /**
     * Sets the value of the inCustCountryGenericDetailDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCustCountryGenericDetailDescription(String value) {
        this.inCustCountryGenericDetailDescription = value;
    }

    /**
     * Gets the value of the inCustCountryGenericDetailSerialNum property.
     * 
     */
    public int getInCustCountryGenericDetailSerialNum() {
        return inCustCountryGenericDetailSerialNum;
    }

    /**
     * Sets the value of the inCustCountryGenericDetailSerialNum property.
     * 
     */
    public void setInCustCountryGenericDetailSerialNum(int value) {
        this.inCustCountryGenericDetailSerialNum = value;
    }

    /**
     * Gets the value of the inCustListSetDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCustListSetDescription() {
        return inCustListSetDescription;
    }

    /**
     * Sets the value of the inCustListSetDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCustListSetDescription(String value) {
        this.inCustListSetDescription = value;
    }

    /**
     * Gets the value of the inCustNationalityGenericDetailDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCustNationalityGenericDetailDescription() {
        return inCustNationalityGenericDetailDescription;
    }

    /**
     * Sets the value of the inCustNationalityGenericDetailDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCustNationalityGenericDetailDescription(String value) {
        this.inCustNationalityGenericDetailDescription = value;
    }

    /**
     * Gets the value of the inCustNationalityGenericDetailParameterType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCustNationalityGenericDetailParameterType() {
        return inCustNationalityGenericDetailParameterType;
    }

    /**
     * Sets the value of the inCustNationalityGenericDetailParameterType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCustNationalityGenericDetailParameterType(String value) {
        this.inCustNationalityGenericDetailParameterType = value;
    }

    /**
     * Gets the value of the inCustNationalityGenericDetailSerialNum property.
     * 
     */
    public int getInCustNationalityGenericDetailSerialNum() {
        return inCustNationalityGenericDetailSerialNum;
    }

    /**
     * Sets the value of the inCustNationalityGenericDetailSerialNum property.
     * 
     */
    public void setInCustNationalityGenericDetailSerialNum(int value) {
        this.inCustNationalityGenericDetailSerialNum = value;
    }

    /**
     * Gets the value of the inCustOtherAfmAfmNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCustOtherAfmAfmNo() {
        return inCustOtherAfmAfmNo;
    }

    /**
     * Sets the value of the inCustOtherAfmAfmNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCustOtherAfmAfmNo(String value) {
        this.inCustOtherAfmAfmNo = value;
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
     * Gets the value of the inDealerPenaltyUsrCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInDealerPenaltyUsrCode() {
        return inDealerPenaltyUsrCode;
    }

    /**
     * Sets the value of the inDealerPenaltyUsrCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInDealerPenaltyUsrCode(String value) {
        this.inDealerPenaltyUsrCode = value;
    }

    /**
     * Gets the value of the inDealerSpecialRateDealerRefNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInDealerSpecialRateDealerRefNo() {
        return inDealerSpecialRateDealerRefNo;
    }

    /**
     * Sets the value of the inDealerSpecialRateDealerRefNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInDealerSpecialRateDealerRefNo(String value) {
        this.inDealerSpecialRateDealerRefNo = value;
    }

    /**
     * Gets the value of the inDealerUsrCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInDealerUsrCode() {
        return inDealerUsrCode;
    }

    /**
     * Sets the value of the inDealerUsrCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInDealerUsrCode(String value) {
        this.inDealerUsrCode = value;
    }

    /**
     * Gets the value of the inDebitDepTrxRecordingIComments property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInDebitDepTrxRecordingIComments() {
        return inDebitDepTrxRecordingIComments;
    }

    /**
     * Sets the value of the inDebitDepTrxRecordingIComments property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInDebitDepTrxRecordingIComments(String value) {
        this.inDebitDepTrxRecordingIComments = value;
    }

    /**
     * Gets the value of the inDepositCDigitIefSuppliedCheckDigit property.
     * 
     */
    public short getInDepositCDigitIefSuppliedCheckDigit() {
        return inDepositCDigitIefSuppliedCheckDigit;
    }

    /**
     * Sets the value of the inDepositCDigitIefSuppliedCheckDigit property.
     * 
     */
    public void setInDepositCDigitIefSuppliedCheckDigit(short value) {
        this.inDepositCDigitIefSuppliedCheckDigit = value;
    }

    /**
     * Gets the value of the inFwdSwapContractsContractDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInFwdSwapContractsContractDate() {
        return inFwdSwapContractsContractDate;
    }

    /**
     * Sets the value of the inFwdSwapContractsContractDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInFwdSwapContractsContractDate(XMLGregorianCalendar value) {
        this.inFwdSwapContractsContractDate = value;
    }

    /**
     * Gets the value of the inFwdSwapContractsCurrencyRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInFwdSwapContractsCurrencyRate() {
        return inFwdSwapContractsCurrencyRate;
    }

    /**
     * Sets the value of the inFwdSwapContractsCurrencyRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInFwdSwapContractsCurrencyRate(BigDecimal value) {
        this.inFwdSwapContractsCurrencyRate = value;
    }

    /**
     * Gets the value of the inFwdSwapContractsDealerRefNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInFwdSwapContractsDealerRefNo() {
        return inFwdSwapContractsDealerRefNo;
    }

    /**
     * Sets the value of the inFwdSwapContractsDealerRefNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInFwdSwapContractsDealerRefNo(String value) {
        this.inFwdSwapContractsDealerRefNo = value;
    }

    /**
     * Gets the value of the inFwdSwapContractsEntryComments property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInFwdSwapContractsEntryComments() {
        return inFwdSwapContractsEntryComments;
    }

    /**
     * Sets the value of the inFwdSwapContractsEntryComments property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInFwdSwapContractsEntryComments(String value) {
        this.inFwdSwapContractsEntryComments = value;
    }

    /**
     * Gets the value of the inFwdSwapContractsEntryStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInFwdSwapContractsEntryStatus() {
        return inFwdSwapContractsEntryStatus;
    }

    /**
     * Sets the value of the inFwdSwapContractsEntryStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInFwdSwapContractsEntryStatus(String value) {
        this.inFwdSwapContractsEntryStatus = value;
    }

    /**
     * Gets the value of the inFwdSwapContractsExecDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInFwdSwapContractsExecDate() {
        return inFwdSwapContractsExecDate;
    }

    /**
     * Sets the value of the inFwdSwapContractsExecDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInFwdSwapContractsExecDate(XMLGregorianCalendar value) {
        this.inFwdSwapContractsExecDate = value;
    }

    /**
     * Gets the value of the inFwdSwapContractsMaturityDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInFwdSwapContractsMaturityDate() {
        return inFwdSwapContractsMaturityDate;
    }

    /**
     * Sets the value of the inFwdSwapContractsMaturityDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInFwdSwapContractsMaturityDate(XMLGregorianCalendar value) {
        this.inFwdSwapContractsMaturityDate = value;
    }

    /**
     * Gets the value of the inFwdSwapContractsNotificationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInFwdSwapContractsNotificationDate() {
        return inFwdSwapContractsNotificationDate;
    }

    /**
     * Sets the value of the inFwdSwapContractsNotificationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInFwdSwapContractsNotificationDate(XMLGregorianCalendar value) {
        this.inFwdSwapContractsNotificationDate = value;
    }

    /**
     * Gets the value of the inFwdSwapContractsOrgSourceAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInFwdSwapContractsOrgSourceAmount() {
        return inFwdSwapContractsOrgSourceAmount;
    }

    /**
     * Sets the value of the inFwdSwapContractsOrgSourceAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInFwdSwapContractsOrgSourceAmount(BigDecimal value) {
        this.inFwdSwapContractsOrgSourceAmount = value;
    }

    /**
     * Gets the value of the inFwdSwapContractsOrgTargetAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInFwdSwapContractsOrgTargetAmount() {
        return inFwdSwapContractsOrgTargetAmount;
    }

    /**
     * Sets the value of the inFwdSwapContractsOrgTargetAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInFwdSwapContractsOrgTargetAmount(BigDecimal value) {
        this.inFwdSwapContractsOrgTargetAmount = value;
    }

    /**
     * Gets the value of the inFwdSwapContractsReferenceNo property.
     * 
     */
    public int getInFwdSwapContractsReferenceNo() {
        return inFwdSwapContractsReferenceNo;
    }

    /**
     * Sets the value of the inFwdSwapContractsReferenceNo property.
     * 
     */
    public void setInFwdSwapContractsReferenceNo(int value) {
        this.inFwdSwapContractsReferenceNo = value;
    }

    /**
     * Gets the value of the inFwdSwapContractsSourceUtilBal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInFwdSwapContractsSourceUtilBal() {
        return inFwdSwapContractsSourceUtilBal;
    }

    /**
     * Sets the value of the inFwdSwapContractsSourceUtilBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInFwdSwapContractsSourceUtilBal(BigDecimal value) {
        this.inFwdSwapContractsSourceUtilBal = value;
    }

    /**
     * Gets the value of the inFwdSwapContractsStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInFwdSwapContractsStartDate() {
        return inFwdSwapContractsStartDate;
    }

    /**
     * Sets the value of the inFwdSwapContractsStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInFwdSwapContractsStartDate(XMLGregorianCalendar value) {
        this.inFwdSwapContractsStartDate = value;
    }

    /**
     * Gets the value of the inFwdSwapContractsTargetUtilBal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInFwdSwapContractsTargetUtilBal() {
        return inFwdSwapContractsTargetUtilBal;
    }

    /**
     * Sets the value of the inFwdSwapContractsTargetUtilBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInFwdSwapContractsTargetUtilBal(BigDecimal value) {
        this.inFwdSwapContractsTargetUtilBal = value;
    }

    /**
     * Gets the value of the inFwdSwapContractsWayOfUtilization property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInFwdSwapContractsWayOfUtilization() {
        return inFwdSwapContractsWayOfUtilization;
    }

    /**
     * Sets the value of the inFwdSwapContractsWayOfUtilization property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInFwdSwapContractsWayOfUtilization(String value) {
        this.inFwdSwapContractsWayOfUtilization = value;
    }

    /**
     * Gets the value of the inGenericIdIefSuppliedIdentificationType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInGenericIdIefSuppliedIdentificationType() {
        return inGenericIdIefSuppliedIdentificationType;
    }

    /**
     * Sets the value of the inGenericIdIefSuppliedIdentificationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInGenericIdIefSuppliedIdentificationType(String value) {
        this.inGenericIdIefSuppliedIdentificationType = value;
    }

    /**
     * Gets the value of the inGenericIdIefSuppliedIdentityPassportNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInGenericIdIefSuppliedIdentityPassportNo() {
        return inGenericIdIefSuppliedIdentityPassportNo;
    }

    /**
     * Sets the value of the inGenericIdIefSuppliedIdentityPassportNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInGenericIdIefSuppliedIdentityPassportNo(String value) {
        this.inGenericIdIefSuppliedIdentityPassportNo = value;
    }

    /**
     * Gets the value of the inGenericIdIefSuppliedIssueAuthority property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInGenericIdIefSuppliedIssueAuthority() {
        return inGenericIdIefSuppliedIssueAuthority;
    }

    /**
     * Sets the value of the inGenericIdIefSuppliedIssueAuthority property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInGenericIdIefSuppliedIssueAuthority(String value) {
        this.inGenericIdIefSuppliedIssueAuthority = value;
    }

    /**
     * Gets the value of the inGrpParametersInGrmBankParametersMaxAmntRateTbl property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInGrpParametersInGrmBankParametersMaxAmntRateTbl() {
        return inGrpParametersInGrmBankParametersMaxAmntRateTbl;
    }

    /**
     * Sets the value of the inGrpParametersInGrmBankParametersMaxAmntRateTbl property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInGrpParametersInGrmBankParametersMaxAmntRateTbl(BigDecimal value) {
        this.inGrpParametersInGrmBankParametersMaxAmntRateTbl = value;
    }

    /**
     * Gets the value of the inGrpParametersInGrmGenericDetailSerialNum property.
     * 
     */
    public int getInGrpParametersInGrmGenericDetailSerialNum() {
        return inGrpParametersInGrmGenericDetailSerialNum;
    }

    /**
     * Sets the value of the inGrpParametersInGrmGenericDetailSerialNum property.
     * 
     */
    public void setInGrpParametersInGrmGenericDetailSerialNum(int value) {
        this.inGrpParametersInGrmGenericDetailSerialNum = value;
    }

    /**
     * Gets the value of the inGrpParametersInGrmTerminalTerminalNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInGrpParametersInGrmTerminalTerminalNumber() {
        return inGrpParametersInGrmTerminalTerminalNumber;
    }

    /**
     * Sets the value of the inGrpParametersInGrmTerminalTerminalNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInGrpParametersInGrmTerminalTerminalNumber(String value) {
        this.inGrpParametersInGrmTerminalTerminalNumber = value;
    }

    /**
     * Gets the value of the inGrpParametersInGrmTrxCountTrxCounter property.
     * 
     */
    public int getInGrpParametersInGrmTrxCountTrxCounter() {
        return inGrpParametersInGrmTrxCountTrxCounter;
    }

    /**
     * Sets the value of the inGrpParametersInGrmTrxCountTrxCounter property.
     * 
     */
    public void setInGrpParametersInGrmTrxCountTrxCounter(int value) {
        this.inGrpParametersInGrmTrxCountTrxCounter = value;
    }

    /**
     * Gets the value of the inGrpParametersInGrmWorkDaysWorkDatesProductionDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInGrpParametersInGrmWorkDaysWorkDatesProductionDate() {
        return inGrpParametersInGrmWorkDaysWorkDatesProductionDate;
    }

    /**
     * Sets the value of the inGrpParametersInGrmWorkDaysWorkDatesProductionDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInGrpParametersInGrmWorkDaysWorkDatesProductionDate(XMLGregorianCalendar value) {
        this.inGrpParametersInGrmWorkDaysWorkDatesProductionDate = value;
    }

    /**
     * Gets the value of the inIdentCountryGenericDetailDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInIdentCountryGenericDetailDescription() {
        return inIdentCountryGenericDetailDescription;
    }

    /**
     * Sets the value of the inIdentCountryGenericDetailDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInIdentCountryGenericDetailDescription(String value) {
        this.inIdentCountryGenericDetailDescription = value;
    }

    /**
     * Gets the value of the inIdentCountryGenericDetailSerialNum property.
     * 
     */
    public int getInIdentCountryGenericDetailSerialNum() {
        return inIdentCountryGenericDetailSerialNum;
    }

    /**
     * Sets the value of the inIdentCountryGenericDetailSerialNum property.
     * 
     */
    public void setInIdentCountryGenericDetailSerialNum(int value) {
        this.inIdentCountryGenericDetailSerialNum = value;
    }

    /**
     * Gets the value of the inJustificIdJustific property.
     * 
     */
    public int getInJustificIdJustific() {
        return inJustificIdJustific;
    }

    /**
     * Sets the value of the inJustificIdJustific property.
     * 
     */
    public void setInJustificIdJustific(int value) {
        this.inJustificIdJustific = value;
    }

    /**
     * Gets the value of the inOtherIdIdNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInOtherIdIdNo() {
        return inOtherIdIdNo;
    }

    /**
     * Sets the value of the inOtherIdIdNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInOtherIdIdNo(String value) {
        this.inOtherIdIdNo = value;
    }

    /**
     * Gets the value of the inPenaltyDealerSpecialRateDealerRefNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInPenaltyDealerSpecialRateDealerRefNo() {
        return inPenaltyDealerSpecialRateDealerRefNo;
    }

    /**
     * Sets the value of the inPenaltyDealerSpecialRateDealerRefNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInPenaltyDealerSpecialRateDealerRefNo(String value) {
        this.inPenaltyDealerSpecialRateDealerRefNo = value;
    }

    /**
     * Gets the value of the inPostIefSuppliedFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInPostIefSuppliedFlag() {
        return inPostIefSuppliedFlag;
    }

    /**
     * Sets the value of the inPostIefSuppliedFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInPostIefSuppliedFlag(String value) {
        this.inPostIefSuppliedFlag = value;
    }

    /**
     * Gets the value of the inPrftTransactionIdTransact property.
     * 
     */
    public int getInPrftTransactionIdTransact() {
        return inPrftTransactionIdTransact;
    }

    /**
     * Sets the value of the inPrftTransactionIdTransact property.
     * 
     */
    public void setInPrftTransactionIdTransact(int value) {
        this.inPrftTransactionIdTransact = value;
    }

    /**
     * Gets the value of the inProductIdProduct property.
     * 
     */
    public int getInProductIdProduct() {
        return inProductIdProduct;
    }

    /**
     * Sets the value of the inProductIdProduct property.
     * 
     */
    public void setInProductIdProduct(int value) {
        this.inProductIdProduct = value;
    }

    /**
     * Gets the value of the inResidentIefSuppliedFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInResidentIefSuppliedFlag() {
        return inResidentIefSuppliedFlag;
    }

    /**
     * Sets the value of the inResidentIefSuppliedFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInResidentIefSuppliedFlag(String value) {
        this.inResidentIefSuppliedFlag = value;
    }

    /**
     * Gets the value of the inSoldAmountIefSuppliedPayableAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInSoldAmountIefSuppliedPayableAmount() {
        return inSoldAmountIefSuppliedPayableAmount;
    }

    /**
     * Sets the value of the inSoldAmountIefSuppliedPayableAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInSoldAmountIefSuppliedPayableAmount(BigDecimal value) {
        this.inSoldAmountIefSuppliedPayableAmount = value;
    }

    /**
     * Gets the value of the inSoldAvailabilityDaysIefSuppliedValueDays property.
     * 
     */
    public short getInSoldAvailabilityDaysIefSuppliedValueDays() {
        return inSoldAvailabilityDaysIefSuppliedValueDays;
    }

    /**
     * Sets the value of the inSoldAvailabilityDaysIefSuppliedValueDays property.
     * 
     */
    public void setInSoldAvailabilityDaysIefSuppliedValueDays(short value) {
        this.inSoldAvailabilityDaysIefSuppliedValueDays = value;
    }

    /**
     * Gets the value of the inSoldAvailabilityWorkDatesProductionDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInSoldAvailabilityWorkDatesProductionDate() {
        return inSoldAvailabilityWorkDatesProductionDate;
    }

    /**
     * Sets the value of the inSoldAvailabilityWorkDatesProductionDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInSoldAvailabilityWorkDatesProductionDate(XMLGregorianCalendar value) {
        this.inSoldAvailabilityWorkDatesProductionDate = value;
    }

    /**
     * Gets the value of the inSoldProfitsAccountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInSoldProfitsAccountNumber() {
        return inSoldProfitsAccountNumber;
    }

    /**
     * Sets the value of the inSoldProfitsAccountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInSoldProfitsAccountNumber(String value) {
        this.inSoldProfitsAccountNumber = value;
    }

    /**
     * Gets the value of the inSoldProfitsAccountCd property.
     * 
     */
    public short getInSoldProfitsAccountCd() {
        return inSoldProfitsAccountCd;
    }

    /**
     * Sets the value of the inSoldProfitsAccountCd property.
     * 
     */
    public void setInSoldProfitsAccountCd(short value) {
        this.inSoldProfitsAccountCd = value;
    }

    /**
     * Gets the value of the inSoldProfitsAccountPrftSystem property.
     * 
     */
    public int getInSoldProfitsAccountPrftSystem() {
        return inSoldProfitsAccountPrftSystem;
    }

    /**
     * Sets the value of the inSoldProfitsAccountPrftSystem property.
     * 
     */
    public void setInSoldProfitsAccountPrftSystem(int value) {
        this.inSoldProfitsAccountPrftSystem = value;
    }

    /**
     * Gets the value of the inSoldDepositAccountDesignation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInSoldDepositAccountDesignation() {
        return inSoldDepositAccountDesignation;
    }

    /**
     * Sets the value of the inSoldDepositAccountDesignation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInSoldDepositAccountDesignation(String value) {
        this.inSoldDepositAccountDesignation = value;
    }

    /**
     * Gets the value of the inSoldDepositAccountEntryStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInSoldDepositAccountEntryStatus() {
        return inSoldDepositAccountEntryStatus;
    }

    /**
     * Sets the value of the inSoldDepositAccountEntryStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInSoldDepositAccountEntryStatus(String value) {
        this.inSoldDepositAccountEntryStatus = value;
    }

    /**
     * Gets the value of the inSoldIbanWorkSetChar37 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInSoldIbanWorkSetChar37() {
        return inSoldIbanWorkSetChar37;
    }

    /**
     * Sets the value of the inSoldIbanWorkSetChar37 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInSoldIbanWorkSetChar37(String value) {
        this.inSoldIbanWorkSetChar37 = value;
    }

    /**
     * Gets the value of the inSoldJustificIdJustific property.
     * 
     */
    public int getInSoldJustificIdJustific() {
        return inSoldJustificIdJustific;
    }

    /**
     * Sets the value of the inSoldJustificIdJustific property.
     * 
     */
    public void setInSoldJustificIdJustific(int value) {
        this.inSoldJustificIdJustific = value;
    }

    /**
     * Gets the value of the inSoldPrftTransactionIdTransact property.
     * 
     */
    public int getInSoldPrftTransactionIdTransact() {
        return inSoldPrftTransactionIdTransact;
    }

    /**
     * Sets the value of the inSoldPrftTransactionIdTransact property.
     * 
     */
    public void setInSoldPrftTransactionIdTransact(int value) {
        this.inSoldPrftTransactionIdTransact = value;
    }

    /**
     * Gets the value of the inSoldRepCustomerCDigit property.
     * 
     */
    public short getInSoldRepCustomerCDigit() {
        return inSoldRepCustomerCDigit;
    }

    /**
     * Sets the value of the inSoldRepCustomerCDigit property.
     * 
     */
    public void setInSoldRepCustomerCDigit(short value) {
        this.inSoldRepCustomerCDigit = value;
    }

    /**
     * Gets the value of the inSoldRepCustomerCustId property.
     * 
     */
    public int getInSoldRepCustomerCustId() {
        return inSoldRepCustomerCustId;
    }

    /**
     * Sets the value of the inSoldRepCustomerCustId property.
     * 
     */
    public void setInSoldRepCustomerCustId(int value) {
        this.inSoldRepCustomerCustId = value;
    }

    /**
     * Gets the value of the inSoldValueDaysIefSuppliedValueDays property.
     * 
     */
    public short getInSoldValueDaysIefSuppliedValueDays() {
        return inSoldValueDaysIefSuppliedValueDays;
    }

    /**
     * Sets the value of the inSoldValueDaysIefSuppliedValueDays property.
     * 
     */
    public void setInSoldValueDaysIefSuppliedValueDays(short value) {
        this.inSoldValueDaysIefSuppliedValueDays = value;
    }

    /**
     * Gets the value of the inSoldValueWorkDatesProductionDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInSoldValueWorkDatesProductionDate() {
        return inSoldValueWorkDatesProductionDate;
    }

    /**
     * Sets the value of the inSoldValueWorkDatesProductionDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInSoldValueWorkDatesProductionDate(XMLGregorianCalendar value) {
        this.inSoldValueWorkDatesProductionDate = value;
    }

    /**
     * Gets the value of the inSpecialRateTableIefSuppliedFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInSpecialRateTableIefSuppliedFlag() {
        return inSpecialRateTableIefSuppliedFlag;
    }

    /**
     * Sets the value of the inSpecialRateTableIefSuppliedFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInSpecialRateTableIefSuppliedFlag(String value) {
        this.inSpecialRateTableIefSuppliedFlag = value;
    }

    /**
     * Gets the value of the inTrxFxFtRecordingSourceTrnType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInTrxFxFtRecordingSourceTrnType() {
        return inTrxFxFtRecordingSourceTrnType;
    }

    /**
     * Sets the value of the inTrxFxFtRecordingSourceTrnType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInTrxFxFtRecordingSourceTrnType(String value) {
        this.inTrxFxFtRecordingSourceTrnType = value;
    }

    /**
     * Gets the value of the inTrxFxFtRecordingTargetTrnType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInTrxFxFtRecordingTargetTrnType() {
        return inTrxFxFtRecordingTargetTrnType;
    }

    /**
     * Sets the value of the inTrxFxFtRecordingTargetTrnType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInTrxFxFtRecordingTargetTrnType(String value) {
        this.inTrxFxFtRecordingTargetTrnType = value;
    }

    /**
     * Gets the value of the inUseWayIefSuppliedFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInUseWayIefSuppliedFlag() {
        return inUseWayIefSuppliedFlag;
    }

    /**
     * Sets the value of the inUseWayIefSuppliedFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInUseWayIefSuppliedFlag(String value) {
        this.inUseWayIefSuppliedFlag = value;
    }

    /**
     * Gets the value of the inGrpAuth property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfFEXS01InGrpAuthItem }
     *     
     */
    public ArrayOfFEXS01InGrpAuthItem getInGrpAuth() {
        return inGrpAuth;
    }

    /**
     * Sets the value of the inGrpAuth property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfFEXS01InGrpAuthItem }
     *     
     */
    public void setInGrpAuth(ArrayOfFEXS01InGrpAuthItem value) {
        this.inGrpAuth = value;
    }

    /**
     * Gets the value of the inGrpChargesRecording property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfFEXS01InGrpChargesRecordingItem }
     *     
     */
    public ArrayOfFEXS01InGrpChargesRecordingItem getInGrpChargesRecording() {
        return inGrpChargesRecording;
    }

    /**
     * Sets the value of the inGrpChargesRecording property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfFEXS01InGrpChargesRecordingItem }
     *     
     */
    public void setInGrpChargesRecording(ArrayOfFEXS01InGrpChargesRecordingItem value) {
        this.inGrpChargesRecording = value;
    }

}
