
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for D0301VDepositAccountInsertExport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="D0301VDepositAccountInsertExport">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}BaseExport">
 *       &lt;sequence>
 *         &lt;element name="OutBankemployeeId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCapitalDisposalProfitsAccountAccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutChooseAtmIefSuppliedFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCoben2LnsSuppliedName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCoben3LnsSuppliedName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCoben4LnsSuppliedName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCoben5LnsSuppliedName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCollateralFlgIefSuppliedFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCountryGenericDetailDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCrDbInterestProfitsAccountAccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCrIntHintScalePercentage00" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutCustAddressAddress1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustAddressAddress2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustAddressCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustAddressSerialNum" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutCustAddressZipCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustomerLnsSuppliedName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutDbIntHintScalePercentage00" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutDepAccTrAccTrAccCd" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutDepAccTrAccTrAccSn" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutDepAccTrAccTrAccType" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutDepAccTrAccTrAccUnit" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutDepMntRecordingTrxUsrSn" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutDepositChequeBookFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutDepositMFCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutDepositMaxCustDpPer" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutDepositMaxProdDpPer" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutDepositMaxUpdate" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutDepositMinCustMFPer" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutDepositMinDayAvailBalance" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutDepositMinDayDistrAmnt" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutDepositMinProdMFPer" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutDepositMinTrxAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutDepositPassbookFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutDepositAccountAccountNumber" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OutDepositAccountAccountType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutDepositAccountCDigit" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutDepositAccountCorrChqDetail1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutDepositAccountCorrChqDetail2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutDepositAccountDesignation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutDepositAccountEntryStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutDepositAccountIncomeAmnt" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutDepositAccountIncomeFrequency" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutDepositAccountOpeningDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutDepositAccountPassbookFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutDepositAccountTdInterPercentChg" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutDepositAccountTdInterSprdChg" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutEconomForFifthCustGenericDetailDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutEconomForFifthCustGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutEconomForFirstCustGenericDetailDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutEconomForFirstCustGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutEconomForFourthCustGenericDetailDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutEconomForFourthCustGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutEconomForSecCustGenericDetailDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutEconomForSecCustGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutEconomForThirdCustGenericDetailDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutEconomForThirdCustGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutEvaluationTeamInformationAuthorizationType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutEvaluationTeamInformationRequiredProfile1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutEvaluationTeamInformationRequiredProfile2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutFifthCustCustAddressAddress1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutFifthCustCustAddressAddress2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutFifthCustCustAddressCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutFifthCustCustAddressEntryStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutFifthCustCustAddressSerialNum" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutFifthCustCustAddressTelephone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutFifthCustCustAddressZipCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutFifthCustOtherAfmAfmNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutFifthCustOtherAfmMainFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutFifthCustomerCDigit" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutFifthCustomerCustId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutFifthCustomerCustType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutFifthCustomerDateOfBirth" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutFifthCustomerFatherName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutFifthOtherIdIdNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutFinalCrHintScalePercentage00" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutFinalDbExcIntHintScalePercentage00" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutFinalDbHintScalePercentage00" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutFirstCurrencyEntryStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutFirstCurrencyIdCurrency" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutFirstCurrencyShortDescr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutFirstCustCustAddressAddress1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutFirstCustCustAddressAddress2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutFirstCustCustAddressCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutFirstCustCustAddressEntryStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutFirstCustCustAddressSerialNum" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutFirstCustCustAddressTelephone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutFirstCustCustAddressZipCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutFirstCustOtherAfmAfmNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutFirstCustOtherAfmMainFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutFirstCustomerCDigit" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutFirstCustomerCustId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutFirstCustomerCustType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutFirstCustomerDateOfBirth" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutFirstCustomerFatherName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutFirstOtherIdIdNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutForExcAccLimitIefSuppliedFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutFourthCustCustAddressAddress1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutFourthCustCustAddressAddress2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutFourthCustCustAddressCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutFourthCustCustAddressEntryStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutFourthCustCustAddressSerialNum" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutFourthCustCustAddressTelephone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutFourthCustCustAddressZipCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutFourthCustOtherAfmAfmNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutFourthCustOtherAfmMainFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutFourthCustomerCDigit" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutFourthCustomerCustId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutFourthCustomerCustType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutFourthCustomerDateOfBirth" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutFourthCustomerFatherName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutFourthOtherIdIdNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutIssueOfficeUnitCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutIssueOfficeUnitUnitName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutLnsCommissionIdCommission" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutLoanDurationUnit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutLoanLoanType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutLoanMaxLoanDurat" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutLoanProductIdProduct" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutLoanProductValidityDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutNatioForFifthCustGenericDetailDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutNatioForFirstCustGenericDetailDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutNatioForFourthCustGenericDetailDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutNatioForSecCustGenericDetailDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutNatioForThirdCustGenericDetailDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutOdDbIntHintScalePercentage00" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutPrintLineDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutPrintLineTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutProffForFifthCustGenericDetailDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutProffForFifthCustGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutProffForFirstCustGenericDetailDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutProffForFirstCustGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutProffForFourthCustGenericDetailDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutProffForFourthCustGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutProffForSecCustGenericDetailDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutProffForSecCustGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutProffForThirdCustGenericDetailDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutProffForThirdCustGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutProfitsAccountAccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSaleUnitGenericDetailDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSaleUnitGenericDetailEntryStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSaleUnitGenericDetailParameterType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSaleUnitGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutSaleUnitGenericDetailShortDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSaleUnitGenericDetailTmstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutSecondCustCustAddressAddress1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSecondCustCustAddressAddress2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSecondCustCustAddressCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSecondCustCustAddressEntryStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSecondCustCustAddressSerialNum" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutSecondCustCustAddressTelephone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSecondCustCustAddressZipCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSecondCustOtherAfmAfmNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSecondCustOtherAfmMainFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSecondCustomerCDigit" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutSecondCustomerCustId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutSecondCustomerCustType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSecondCustomerDateOfBirth" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutSecondCustomerFatherName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSecondOtherIdIdNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutServiceProfitsAccountAccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutThirdCustCustAddressAddress1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutThirdCustCustAddressAddress2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutThirdCustCustAddressCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutThirdCustCustAddressEntryStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutThirdCustCustAddressSerialNum" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutThirdCustCustAddressTelephone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutThirdCustCustAddressZipCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutThirdCustOtherAfmAfmNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutThirdCustOtherAfmMainFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutThirdCustomerCDigit" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutThirdCustomerCustId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutThirdCustomerCustType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutThirdCustomerDateOfBirth" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutThirdCustomerFatherName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutThirdOtherIdIdNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutUsedInputCharSuppliedChar37" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "D0301VDepositAccountInsertExport", propOrder = {
    "outBankemployeeId",
    "outCapitalDisposalProfitsAccountAccountNumber",
    "outChooseAtmIefSuppliedFlag",
    "outCoben2LnsSuppliedName",
    "outCoben3LnsSuppliedName",
    "outCoben4LnsSuppliedName",
    "outCoben5LnsSuppliedName",
    "outCollateralFlgIefSuppliedFlag",
    "outCountryGenericDetailDescription",
    "outCrDbInterestProfitsAccountAccountNumber",
    "outCrIntHintScalePercentage00",
    "outCustAddressAddress1",
    "outCustAddressAddress2",
    "outCustAddressCity",
    "outCustAddressSerialNum",
    "outCustAddressZipCode",
    "outCustomerLnsSuppliedName",
    "outDbIntHintScalePercentage00",
    "outDepAccTrAccTrAccCd",
    "outDepAccTrAccTrAccSn",
    "outDepAccTrAccTrAccType",
    "outDepAccTrAccTrAccUnit",
    "outDepMntRecordingTrxUsrSn",
    "outDepositChequeBookFlag",
    "outDepositMFCode",
    "outDepositMaxCustDpPer",
    "outDepositMaxProdDpPer",
    "outDepositMaxUpdate",
    "outDepositMinCustMFPer",
    "outDepositMinDayAvailBalance",
    "outDepositMinDayDistrAmnt",
    "outDepositMinProdMFPer",
    "outDepositMinTrxAmount",
    "outDepositPassbookFlag",
    "outDepositAccountAccountNumber",
    "outDepositAccountAccountType",
    "outDepositAccountCDigit",
    "outDepositAccountCorrChqDetail1",
    "outDepositAccountCorrChqDetail2",
    "outDepositAccountDesignation",
    "outDepositAccountEntryStatus",
    "outDepositAccountIncomeAmnt",
    "outDepositAccountIncomeFrequency",
    "outDepositAccountOpeningDate",
    "outDepositAccountPassbookFlag",
    "outDepositAccountTdInterPercentChg",
    "outDepositAccountTdInterSprdChg",
    "outEconomForFifthCustGenericDetailDescription",
    "outEconomForFifthCustGenericDetailSerialNum",
    "outEconomForFirstCustGenericDetailDescription",
    "outEconomForFirstCustGenericDetailSerialNum",
    "outEconomForFourthCustGenericDetailDescription",
    "outEconomForFourthCustGenericDetailSerialNum",
    "outEconomForSecCustGenericDetailDescription",
    "outEconomForSecCustGenericDetailSerialNum",
    "outEconomForThirdCustGenericDetailDescription",
    "outEconomForThirdCustGenericDetailSerialNum",
    "outEvaluationTeamInformationAuthorizationType",
    "outEvaluationTeamInformationRequiredProfile1",
    "outEvaluationTeamInformationRequiredProfile2",
    "outFifthCustCustAddressAddress1",
    "outFifthCustCustAddressAddress2",
    "outFifthCustCustAddressCity",
    "outFifthCustCustAddressEntryStatus",
    "outFifthCustCustAddressSerialNum",
    "outFifthCustCustAddressTelephone",
    "outFifthCustCustAddressZipCode",
    "outFifthCustOtherAfmAfmNo",
    "outFifthCustOtherAfmMainFlag",
    "outFifthCustomerCDigit",
    "outFifthCustomerCustId",
    "outFifthCustomerCustType",
    "outFifthCustomerDateOfBirth",
    "outFifthCustomerFatherName",
    "outFifthOtherIdIdNo",
    "outFinalCrHintScalePercentage00",
    "outFinalDbExcIntHintScalePercentage00",
    "outFinalDbHintScalePercentage00",
    "outFirstCurrencyEntryStatus",
    "outFirstCurrencyIdCurrency",
    "outFirstCurrencyShortDescr",
    "outFirstCustCustAddressAddress1",
    "outFirstCustCustAddressAddress2",
    "outFirstCustCustAddressCity",
    "outFirstCustCustAddressEntryStatus",
    "outFirstCustCustAddressSerialNum",
    "outFirstCustCustAddressTelephone",
    "outFirstCustCustAddressZipCode",
    "outFirstCustOtherAfmAfmNo",
    "outFirstCustOtherAfmMainFlag",
    "outFirstCustomerCDigit",
    "outFirstCustomerCustId",
    "outFirstCustomerCustType",
    "outFirstCustomerDateOfBirth",
    "outFirstCustomerFatherName",
    "outFirstOtherIdIdNo",
    "outForExcAccLimitIefSuppliedFlag",
    "outFourthCustCustAddressAddress1",
    "outFourthCustCustAddressAddress2",
    "outFourthCustCustAddressCity",
    "outFourthCustCustAddressEntryStatus",
    "outFourthCustCustAddressSerialNum",
    "outFourthCustCustAddressTelephone",
    "outFourthCustCustAddressZipCode",
    "outFourthCustOtherAfmAfmNo",
    "outFourthCustOtherAfmMainFlag",
    "outFourthCustomerCDigit",
    "outFourthCustomerCustId",
    "outFourthCustomerCustType",
    "outFourthCustomerDateOfBirth",
    "outFourthCustomerFatherName",
    "outFourthOtherIdIdNo",
    "outIssueOfficeUnitCode",
    "outIssueOfficeUnitUnitName",
    "outLnsCommissionIdCommission",
    "outLoanDurationUnit",
    "outLoanLoanType",
    "outLoanMaxLoanDurat",
    "outLoanProductIdProduct",
    "outLoanProductValidityDate",
    "outNatioForFifthCustGenericDetailDescription",
    "outNatioForFirstCustGenericDetailDescription",
    "outNatioForFourthCustGenericDetailDescription",
    "outNatioForSecCustGenericDetailDescription",
    "outNatioForThirdCustGenericDetailDescription",
    "outOdDbIntHintScalePercentage00",
    "outPrintLineDate",
    "outPrintLineTime",
    "outProffForFifthCustGenericDetailDescription",
    "outProffForFifthCustGenericDetailSerialNum",
    "outProffForFirstCustGenericDetailDescription",
    "outProffForFirstCustGenericDetailSerialNum",
    "outProffForFourthCustGenericDetailDescription",
    "outProffForFourthCustGenericDetailSerialNum",
    "outProffForSecCustGenericDetailDescription",
    "outProffForSecCustGenericDetailSerialNum",
    "outProffForThirdCustGenericDetailDescription",
    "outProffForThirdCustGenericDetailSerialNum",
    "outProfitsAccountAccountNumber",
    "outSaleUnitGenericDetailDescription",
    "outSaleUnitGenericDetailEntryStatus",
    "outSaleUnitGenericDetailParameterType",
    "outSaleUnitGenericDetailSerialNum",
    "outSaleUnitGenericDetailShortDescription",
    "outSaleUnitGenericDetailTmstamp",
    "outSecondCustCustAddressAddress1",
    "outSecondCustCustAddressAddress2",
    "outSecondCustCustAddressCity",
    "outSecondCustCustAddressEntryStatus",
    "outSecondCustCustAddressSerialNum",
    "outSecondCustCustAddressTelephone",
    "outSecondCustCustAddressZipCode",
    "outSecondCustOtherAfmAfmNo",
    "outSecondCustOtherAfmMainFlag",
    "outSecondCustomerCDigit",
    "outSecondCustomerCustId",
    "outSecondCustomerCustType",
    "outSecondCustomerDateOfBirth",
    "outSecondCustomerFatherName",
    "outSecondOtherIdIdNo",
    "outServiceProfitsAccountAccountNumber",
    "outThirdCustCustAddressAddress1",
    "outThirdCustCustAddressAddress2",
    "outThirdCustCustAddressCity",
    "outThirdCustCustAddressEntryStatus",
    "outThirdCustCustAddressSerialNum",
    "outThirdCustCustAddressTelephone",
    "outThirdCustCustAddressZipCode",
    "outThirdCustOtherAfmAfmNo",
    "outThirdCustOtherAfmMainFlag",
    "outThirdCustomerCDigit",
    "outThirdCustomerCustId",
    "outThirdCustomerCustType",
    "outThirdCustomerDateOfBirth",
    "outThirdCustomerFatherName",
    "outThirdOtherIdIdNo",
    "outUsedInputCharSuppliedChar37"
})
public class D0301VDepositAccountInsertExport
    extends BaseExport
{

    @XmlElement(name = "OutBankemployeeId")
    protected String outBankemployeeId;
    @XmlElement(name = "OutCapitalDisposalProfitsAccountAccountNumber")
    protected String outCapitalDisposalProfitsAccountAccountNumber;
    @XmlElement(name = "OutChooseAtmIefSuppliedFlag")
    protected String outChooseAtmIefSuppliedFlag;
    @XmlElement(name = "OutCoben2LnsSuppliedName")
    protected String outCoben2LnsSuppliedName;
    @XmlElement(name = "OutCoben3LnsSuppliedName")
    protected String outCoben3LnsSuppliedName;
    @XmlElement(name = "OutCoben4LnsSuppliedName")
    protected String outCoben4LnsSuppliedName;
    @XmlElement(name = "OutCoben5LnsSuppliedName")
    protected String outCoben5LnsSuppliedName;
    @XmlElement(name = "OutCollateralFlgIefSuppliedFlag")
    protected String outCollateralFlgIefSuppliedFlag;
    @XmlElement(name = "OutCountryGenericDetailDescription")
    protected String outCountryGenericDetailDescription;
    @XmlElement(name = "OutCrDbInterestProfitsAccountAccountNumber")
    protected String outCrDbInterestProfitsAccountAccountNumber;
    @XmlElement(name = "OutCrIntHintScalePercentage00", required = true)
    protected BigDecimal outCrIntHintScalePercentage00;
    @XmlElement(name = "OutCustAddressAddress1")
    protected String outCustAddressAddress1;
    @XmlElement(name = "OutCustAddressAddress2")
    protected String outCustAddressAddress2;
    @XmlElement(name = "OutCustAddressCity")
    protected String outCustAddressCity;
    @XmlElement(name = "OutCustAddressSerialNum")
    protected short outCustAddressSerialNum;
    @XmlElement(name = "OutCustAddressZipCode")
    protected String outCustAddressZipCode;
    @XmlElement(name = "OutCustomerLnsSuppliedName")
    protected String outCustomerLnsSuppliedName;
    @XmlElement(name = "OutDbIntHintScalePercentage00", required = true)
    protected BigDecimal outDbIntHintScalePercentage00;
    @XmlElement(name = "OutDepAccTrAccTrAccCd")
    protected short outDepAccTrAccTrAccCd;
    @XmlElement(name = "OutDepAccTrAccTrAccSn")
    protected int outDepAccTrAccTrAccSn;
    @XmlElement(name = "OutDepAccTrAccTrAccType")
    protected short outDepAccTrAccTrAccType;
    @XmlElement(name = "OutDepAccTrAccTrAccUnit")
    protected int outDepAccTrAccTrAccUnit;
    @XmlElement(name = "OutDepMntRecordingTrxUsrSn")
    protected int outDepMntRecordingTrxUsrSn;
    @XmlElement(name = "OutDepositChequeBookFlag")
    protected String outDepositChequeBookFlag;
    @XmlElement(name = "OutDepositMFCode")
    protected String outDepositMFCode;
    @XmlElement(name = "OutDepositMaxCustDpPer", required = true)
    protected BigDecimal outDepositMaxCustDpPer;
    @XmlElement(name = "OutDepositMaxProdDpPer", required = true)
    protected BigDecimal outDepositMaxProdDpPer;
    @XmlElement(name = "OutDepositMaxUpdate")
    protected short outDepositMaxUpdate;
    @XmlElement(name = "OutDepositMinCustMFPer", required = true)
    protected BigDecimal outDepositMinCustMFPer;
    @XmlElement(name = "OutDepositMinDayAvailBalance", required = true)
    protected BigDecimal outDepositMinDayAvailBalance;
    @XmlElement(name = "OutDepositMinDayDistrAmnt", required = true)
    protected BigDecimal outDepositMinDayDistrAmnt;
    @XmlElement(name = "OutDepositMinProdMFPer", required = true)
    protected BigDecimal outDepositMinProdMFPer;
    @XmlElement(name = "OutDepositMinTrxAmount", required = true)
    protected BigDecimal outDepositMinTrxAmount;
    @XmlElement(name = "OutDepositPassbookFlag")
    protected String outDepositPassbookFlag;
    @XmlElement(name = "OutDepositAccountAccountNumber")
    protected double outDepositAccountAccountNumber;
    @XmlElement(name = "OutDepositAccountAccountType")
    protected String outDepositAccountAccountType;
    @XmlElement(name = "OutDepositAccountCDigit")
    protected short outDepositAccountCDigit;
    @XmlElement(name = "OutDepositAccountCorrChqDetail1")
    protected String outDepositAccountCorrChqDetail1;
    @XmlElement(name = "OutDepositAccountCorrChqDetail2")
    protected String outDepositAccountCorrChqDetail2;
    @XmlElement(name = "OutDepositAccountDesignation")
    protected String outDepositAccountDesignation;
    @XmlElement(name = "OutDepositAccountEntryStatus")
    protected String outDepositAccountEntryStatus;
    @XmlElement(name = "OutDepositAccountIncomeAmnt", required = true)
    protected BigDecimal outDepositAccountIncomeAmnt;
    @XmlElement(name = "OutDepositAccountIncomeFrequency")
    protected int outDepositAccountIncomeFrequency;
    @XmlElement(name = "OutDepositAccountOpeningDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outDepositAccountOpeningDate;
    @XmlElement(name = "OutDepositAccountPassbookFlag")
    protected String outDepositAccountPassbookFlag;
    @XmlElement(name = "OutDepositAccountTdInterPercentChg", required = true)
    protected BigDecimal outDepositAccountTdInterPercentChg;
    @XmlElement(name = "OutDepositAccountTdInterSprdChg", required = true)
    protected BigDecimal outDepositAccountTdInterSprdChg;
    @XmlElement(name = "OutEconomForFifthCustGenericDetailDescription")
    protected String outEconomForFifthCustGenericDetailDescription;
    @XmlElement(name = "OutEconomForFifthCustGenericDetailSerialNum")
    protected int outEconomForFifthCustGenericDetailSerialNum;
    @XmlElement(name = "OutEconomForFirstCustGenericDetailDescription")
    protected String outEconomForFirstCustGenericDetailDescription;
    @XmlElement(name = "OutEconomForFirstCustGenericDetailSerialNum")
    protected int outEconomForFirstCustGenericDetailSerialNum;
    @XmlElement(name = "OutEconomForFourthCustGenericDetailDescription")
    protected String outEconomForFourthCustGenericDetailDescription;
    @XmlElement(name = "OutEconomForFourthCustGenericDetailSerialNum")
    protected int outEconomForFourthCustGenericDetailSerialNum;
    @XmlElement(name = "OutEconomForSecCustGenericDetailDescription")
    protected String outEconomForSecCustGenericDetailDescription;
    @XmlElement(name = "OutEconomForSecCustGenericDetailSerialNum")
    protected int outEconomForSecCustGenericDetailSerialNum;
    @XmlElement(name = "OutEconomForThirdCustGenericDetailDescription")
    protected String outEconomForThirdCustGenericDetailDescription;
    @XmlElement(name = "OutEconomForThirdCustGenericDetailSerialNum")
    protected int outEconomForThirdCustGenericDetailSerialNum;
    @XmlElement(name = "OutEvaluationTeamInformationAuthorizationType")
    protected String outEvaluationTeamInformationAuthorizationType;
    @XmlElement(name = "OutEvaluationTeamInformationRequiredProfile1")
    protected String outEvaluationTeamInformationRequiredProfile1;
    @XmlElement(name = "OutEvaluationTeamInformationRequiredProfile2")
    protected String outEvaluationTeamInformationRequiredProfile2;
    @XmlElement(name = "OutFifthCustCustAddressAddress1")
    protected String outFifthCustCustAddressAddress1;
    @XmlElement(name = "OutFifthCustCustAddressAddress2")
    protected String outFifthCustCustAddressAddress2;
    @XmlElement(name = "OutFifthCustCustAddressCity")
    protected String outFifthCustCustAddressCity;
    @XmlElement(name = "OutFifthCustCustAddressEntryStatus")
    protected String outFifthCustCustAddressEntryStatus;
    @XmlElement(name = "OutFifthCustCustAddressSerialNum")
    protected short outFifthCustCustAddressSerialNum;
    @XmlElement(name = "OutFifthCustCustAddressTelephone")
    protected String outFifthCustCustAddressTelephone;
    @XmlElement(name = "OutFifthCustCustAddressZipCode")
    protected String outFifthCustCustAddressZipCode;
    @XmlElement(name = "OutFifthCustOtherAfmAfmNo")
    protected String outFifthCustOtherAfmAfmNo;
    @XmlElement(name = "OutFifthCustOtherAfmMainFlag")
    protected String outFifthCustOtherAfmMainFlag;
    @XmlElement(name = "OutFifthCustomerCDigit")
    protected short outFifthCustomerCDigit;
    @XmlElement(name = "OutFifthCustomerCustId")
    protected int outFifthCustomerCustId;
    @XmlElement(name = "OutFifthCustomerCustType")
    protected String outFifthCustomerCustType;
    @XmlElement(name = "OutFifthCustomerDateOfBirth", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outFifthCustomerDateOfBirth;
    @XmlElement(name = "OutFifthCustomerFatherName")
    protected String outFifthCustomerFatherName;
    @XmlElement(name = "OutFifthOtherIdIdNo")
    protected String outFifthOtherIdIdNo;
    @XmlElement(name = "OutFinalCrHintScalePercentage00", required = true)
    protected BigDecimal outFinalCrHintScalePercentage00;
    @XmlElement(name = "OutFinalDbExcIntHintScalePercentage00", required = true)
    protected BigDecimal outFinalDbExcIntHintScalePercentage00;
    @XmlElement(name = "OutFinalDbHintScalePercentage00", required = true)
    protected BigDecimal outFinalDbHintScalePercentage00;
    @XmlElement(name = "OutFirstCurrencyEntryStatus")
    protected String outFirstCurrencyEntryStatus;
    @XmlElement(name = "OutFirstCurrencyIdCurrency")
    protected int outFirstCurrencyIdCurrency;
    @XmlElement(name = "OutFirstCurrencyShortDescr")
    protected String outFirstCurrencyShortDescr;
    @XmlElement(name = "OutFirstCustCustAddressAddress1")
    protected String outFirstCustCustAddressAddress1;
    @XmlElement(name = "OutFirstCustCustAddressAddress2")
    protected String outFirstCustCustAddressAddress2;
    @XmlElement(name = "OutFirstCustCustAddressCity")
    protected String outFirstCustCustAddressCity;
    @XmlElement(name = "OutFirstCustCustAddressEntryStatus")
    protected String outFirstCustCustAddressEntryStatus;
    @XmlElement(name = "OutFirstCustCustAddressSerialNum")
    protected short outFirstCustCustAddressSerialNum;
    @XmlElement(name = "OutFirstCustCustAddressTelephone")
    protected String outFirstCustCustAddressTelephone;
    @XmlElement(name = "OutFirstCustCustAddressZipCode")
    protected String outFirstCustCustAddressZipCode;
    @XmlElement(name = "OutFirstCustOtherAfmAfmNo")
    protected String outFirstCustOtherAfmAfmNo;
    @XmlElement(name = "OutFirstCustOtherAfmMainFlag")
    protected String outFirstCustOtherAfmMainFlag;
    @XmlElement(name = "OutFirstCustomerCDigit")
    protected short outFirstCustomerCDigit;
    @XmlElement(name = "OutFirstCustomerCustId")
    protected int outFirstCustomerCustId;
    @XmlElement(name = "OutFirstCustomerCustType")
    protected String outFirstCustomerCustType;
    @XmlElement(name = "OutFirstCustomerDateOfBirth", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outFirstCustomerDateOfBirth;
    @XmlElement(name = "OutFirstCustomerFatherName")
    protected String outFirstCustomerFatherName;
    @XmlElement(name = "OutFirstOtherIdIdNo")
    protected String outFirstOtherIdIdNo;
    @XmlElement(name = "OutForExcAccLimitIefSuppliedFlag")
    protected String outForExcAccLimitIefSuppliedFlag;
    @XmlElement(name = "OutFourthCustCustAddressAddress1")
    protected String outFourthCustCustAddressAddress1;
    @XmlElement(name = "OutFourthCustCustAddressAddress2")
    protected String outFourthCustCustAddressAddress2;
    @XmlElement(name = "OutFourthCustCustAddressCity")
    protected String outFourthCustCustAddressCity;
    @XmlElement(name = "OutFourthCustCustAddressEntryStatus")
    protected String outFourthCustCustAddressEntryStatus;
    @XmlElement(name = "OutFourthCustCustAddressSerialNum")
    protected short outFourthCustCustAddressSerialNum;
    @XmlElement(name = "OutFourthCustCustAddressTelephone")
    protected String outFourthCustCustAddressTelephone;
    @XmlElement(name = "OutFourthCustCustAddressZipCode")
    protected String outFourthCustCustAddressZipCode;
    @XmlElement(name = "OutFourthCustOtherAfmAfmNo")
    protected String outFourthCustOtherAfmAfmNo;
    @XmlElement(name = "OutFourthCustOtherAfmMainFlag")
    protected String outFourthCustOtherAfmMainFlag;
    @XmlElement(name = "OutFourthCustomerCDigit")
    protected short outFourthCustomerCDigit;
    @XmlElement(name = "OutFourthCustomerCustId")
    protected int outFourthCustomerCustId;
    @XmlElement(name = "OutFourthCustomerCustType")
    protected String outFourthCustomerCustType;
    @XmlElement(name = "OutFourthCustomerDateOfBirth", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outFourthCustomerDateOfBirth;
    @XmlElement(name = "OutFourthCustomerFatherName")
    protected String outFourthCustomerFatherName;
    @XmlElement(name = "OutFourthOtherIdIdNo")
    protected String outFourthOtherIdIdNo;
    @XmlElement(name = "OutIssueOfficeUnitCode")
    protected int outIssueOfficeUnitCode;
    @XmlElement(name = "OutIssueOfficeUnitUnitName")
    protected String outIssueOfficeUnitUnitName;
    @XmlElement(name = "OutLnsCommissionIdCommission")
    protected int outLnsCommissionIdCommission;
    @XmlElement(name = "OutLoanDurationUnit")
    protected String outLoanDurationUnit;
    @XmlElement(name = "OutLoanLoanType")
    protected String outLoanLoanType;
    @XmlElement(name = "OutLoanMaxLoanDurat")
    protected short outLoanMaxLoanDurat;
    @XmlElement(name = "OutLoanProductIdProduct")
    protected int outLoanProductIdProduct;
    @XmlElement(name = "OutLoanProductValidityDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outLoanProductValidityDate;
    @XmlElement(name = "OutNatioForFifthCustGenericDetailDescription")
    protected String outNatioForFifthCustGenericDetailDescription;
    @XmlElement(name = "OutNatioForFirstCustGenericDetailDescription")
    protected String outNatioForFirstCustGenericDetailDescription;
    @XmlElement(name = "OutNatioForFourthCustGenericDetailDescription")
    protected String outNatioForFourthCustGenericDetailDescription;
    @XmlElement(name = "OutNatioForSecCustGenericDetailDescription")
    protected String outNatioForSecCustGenericDetailDescription;
    @XmlElement(name = "OutNatioForThirdCustGenericDetailDescription")
    protected String outNatioForThirdCustGenericDetailDescription;
    @XmlElement(name = "OutOdDbIntHintScalePercentage00", required = true)
    protected BigDecimal outOdDbIntHintScalePercentage00;
    @XmlElement(name = "OutPrintLineDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outPrintLineDate;
    @XmlElement(name = "OutPrintLineTime", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outPrintLineTime;
    @XmlElement(name = "OutProffForFifthCustGenericDetailDescription")
    protected String outProffForFifthCustGenericDetailDescription;
    @XmlElement(name = "OutProffForFifthCustGenericDetailSerialNum")
    protected int outProffForFifthCustGenericDetailSerialNum;
    @XmlElement(name = "OutProffForFirstCustGenericDetailDescription")
    protected String outProffForFirstCustGenericDetailDescription;
    @XmlElement(name = "OutProffForFirstCustGenericDetailSerialNum")
    protected int outProffForFirstCustGenericDetailSerialNum;
    @XmlElement(name = "OutProffForFourthCustGenericDetailDescription")
    protected String outProffForFourthCustGenericDetailDescription;
    @XmlElement(name = "OutProffForFourthCustGenericDetailSerialNum")
    protected int outProffForFourthCustGenericDetailSerialNum;
    @XmlElement(name = "OutProffForSecCustGenericDetailDescription")
    protected String outProffForSecCustGenericDetailDescription;
    @XmlElement(name = "OutProffForSecCustGenericDetailSerialNum")
    protected int outProffForSecCustGenericDetailSerialNum;
    @XmlElement(name = "OutProffForThirdCustGenericDetailDescription")
    protected String outProffForThirdCustGenericDetailDescription;
    @XmlElement(name = "OutProffForThirdCustGenericDetailSerialNum")
    protected int outProffForThirdCustGenericDetailSerialNum;
    @XmlElement(name = "OutProfitsAccountAccountNumber")
    protected String outProfitsAccountAccountNumber;
    @XmlElement(name = "OutSaleUnitGenericDetailDescription")
    protected String outSaleUnitGenericDetailDescription;
    @XmlElement(name = "OutSaleUnitGenericDetailEntryStatus")
    protected String outSaleUnitGenericDetailEntryStatus;
    @XmlElement(name = "OutSaleUnitGenericDetailParameterType")
    protected String outSaleUnitGenericDetailParameterType;
    @XmlElement(name = "OutSaleUnitGenericDetailSerialNum")
    protected int outSaleUnitGenericDetailSerialNum;
    @XmlElement(name = "OutSaleUnitGenericDetailShortDescription")
    protected String outSaleUnitGenericDetailShortDescription;
    @XmlElement(name = "OutSaleUnitGenericDetailTmstamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outSaleUnitGenericDetailTmstamp;
    @XmlElement(name = "OutSecondCustCustAddressAddress1")
    protected String outSecondCustCustAddressAddress1;
    @XmlElement(name = "OutSecondCustCustAddressAddress2")
    protected String outSecondCustCustAddressAddress2;
    @XmlElement(name = "OutSecondCustCustAddressCity")
    protected String outSecondCustCustAddressCity;
    @XmlElement(name = "OutSecondCustCustAddressEntryStatus")
    protected String outSecondCustCustAddressEntryStatus;
    @XmlElement(name = "OutSecondCustCustAddressSerialNum")
    protected short outSecondCustCustAddressSerialNum;
    @XmlElement(name = "OutSecondCustCustAddressTelephone")
    protected String outSecondCustCustAddressTelephone;
    @XmlElement(name = "OutSecondCustCustAddressZipCode")
    protected String outSecondCustCustAddressZipCode;
    @XmlElement(name = "OutSecondCustOtherAfmAfmNo")
    protected String outSecondCustOtherAfmAfmNo;
    @XmlElement(name = "OutSecondCustOtherAfmMainFlag")
    protected String outSecondCustOtherAfmMainFlag;
    @XmlElement(name = "OutSecondCustomerCDigit")
    protected short outSecondCustomerCDigit;
    @XmlElement(name = "OutSecondCustomerCustId")
    protected int outSecondCustomerCustId;
    @XmlElement(name = "OutSecondCustomerCustType")
    protected String outSecondCustomerCustType;
    @XmlElement(name = "OutSecondCustomerDateOfBirth", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outSecondCustomerDateOfBirth;
    @XmlElement(name = "OutSecondCustomerFatherName")
    protected String outSecondCustomerFatherName;
    @XmlElement(name = "OutSecondOtherIdIdNo")
    protected String outSecondOtherIdIdNo;
    @XmlElement(name = "OutServiceProfitsAccountAccountNumber")
    protected String outServiceProfitsAccountAccountNumber;
    @XmlElement(name = "OutThirdCustCustAddressAddress1")
    protected String outThirdCustCustAddressAddress1;
    @XmlElement(name = "OutThirdCustCustAddressAddress2")
    protected String outThirdCustCustAddressAddress2;
    @XmlElement(name = "OutThirdCustCustAddressCity")
    protected String outThirdCustCustAddressCity;
    @XmlElement(name = "OutThirdCustCustAddressEntryStatus")
    protected String outThirdCustCustAddressEntryStatus;
    @XmlElement(name = "OutThirdCustCustAddressSerialNum")
    protected short outThirdCustCustAddressSerialNum;
    @XmlElement(name = "OutThirdCustCustAddressTelephone")
    protected String outThirdCustCustAddressTelephone;
    @XmlElement(name = "OutThirdCustCustAddressZipCode")
    protected String outThirdCustCustAddressZipCode;
    @XmlElement(name = "OutThirdCustOtherAfmAfmNo")
    protected String outThirdCustOtherAfmAfmNo;
    @XmlElement(name = "OutThirdCustOtherAfmMainFlag")
    protected String outThirdCustOtherAfmMainFlag;
    @XmlElement(name = "OutThirdCustomerCDigit")
    protected short outThirdCustomerCDigit;
    @XmlElement(name = "OutThirdCustomerCustId")
    protected int outThirdCustomerCustId;
    @XmlElement(name = "OutThirdCustomerCustType")
    protected String outThirdCustomerCustType;
    @XmlElement(name = "OutThirdCustomerDateOfBirth", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outThirdCustomerDateOfBirth;
    @XmlElement(name = "OutThirdCustomerFatherName")
    protected String outThirdCustomerFatherName;
    @XmlElement(name = "OutThirdOtherIdIdNo")
    protected String outThirdOtherIdIdNo;
    @XmlElement(name = "OutUsedInputCharSuppliedChar37")
    protected String outUsedInputCharSuppliedChar37;

    /**
     * Gets the value of the outBankemployeeId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutBankemployeeId() {
        return outBankemployeeId;
    }

    /**
     * Sets the value of the outBankemployeeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutBankemployeeId(String value) {
        this.outBankemployeeId = value;
    }

    /**
     * Gets the value of the outCapitalDisposalProfitsAccountAccountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCapitalDisposalProfitsAccountAccountNumber() {
        return outCapitalDisposalProfitsAccountAccountNumber;
    }

    /**
     * Sets the value of the outCapitalDisposalProfitsAccountAccountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCapitalDisposalProfitsAccountAccountNumber(String value) {
        this.outCapitalDisposalProfitsAccountAccountNumber = value;
    }

    /**
     * Gets the value of the outChooseAtmIefSuppliedFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutChooseAtmIefSuppliedFlag() {
        return outChooseAtmIefSuppliedFlag;
    }

    /**
     * Sets the value of the outChooseAtmIefSuppliedFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutChooseAtmIefSuppliedFlag(String value) {
        this.outChooseAtmIefSuppliedFlag = value;
    }

    /**
     * Gets the value of the outCoben2LnsSuppliedName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCoben2LnsSuppliedName() {
        return outCoben2LnsSuppliedName;
    }

    /**
     * Sets the value of the outCoben2LnsSuppliedName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCoben2LnsSuppliedName(String value) {
        this.outCoben2LnsSuppliedName = value;
    }

    /**
     * Gets the value of the outCoben3LnsSuppliedName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCoben3LnsSuppliedName() {
        return outCoben3LnsSuppliedName;
    }

    /**
     * Sets the value of the outCoben3LnsSuppliedName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCoben3LnsSuppliedName(String value) {
        this.outCoben3LnsSuppliedName = value;
    }

    /**
     * Gets the value of the outCoben4LnsSuppliedName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCoben4LnsSuppliedName() {
        return outCoben4LnsSuppliedName;
    }

    /**
     * Sets the value of the outCoben4LnsSuppliedName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCoben4LnsSuppliedName(String value) {
        this.outCoben4LnsSuppliedName = value;
    }

    /**
     * Gets the value of the outCoben5LnsSuppliedName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCoben5LnsSuppliedName() {
        return outCoben5LnsSuppliedName;
    }

    /**
     * Sets the value of the outCoben5LnsSuppliedName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCoben5LnsSuppliedName(String value) {
        this.outCoben5LnsSuppliedName = value;
    }

    /**
     * Gets the value of the outCollateralFlgIefSuppliedFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCollateralFlgIefSuppliedFlag() {
        return outCollateralFlgIefSuppliedFlag;
    }

    /**
     * Sets the value of the outCollateralFlgIefSuppliedFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCollateralFlgIefSuppliedFlag(String value) {
        this.outCollateralFlgIefSuppliedFlag = value;
    }

    /**
     * Gets the value of the outCountryGenericDetailDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCountryGenericDetailDescription() {
        return outCountryGenericDetailDescription;
    }

    /**
     * Sets the value of the outCountryGenericDetailDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCountryGenericDetailDescription(String value) {
        this.outCountryGenericDetailDescription = value;
    }

    /**
     * Gets the value of the outCrDbInterestProfitsAccountAccountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCrDbInterestProfitsAccountAccountNumber() {
        return outCrDbInterestProfitsAccountAccountNumber;
    }

    /**
     * Sets the value of the outCrDbInterestProfitsAccountAccountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCrDbInterestProfitsAccountAccountNumber(String value) {
        this.outCrDbInterestProfitsAccountAccountNumber = value;
    }

    /**
     * Gets the value of the outCrIntHintScalePercentage00 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutCrIntHintScalePercentage00() {
        return outCrIntHintScalePercentage00;
    }

    /**
     * Sets the value of the outCrIntHintScalePercentage00 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutCrIntHintScalePercentage00(BigDecimal value) {
        this.outCrIntHintScalePercentage00 = value;
    }

    /**
     * Gets the value of the outCustAddressAddress1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCustAddressAddress1() {
        return outCustAddressAddress1;
    }

    /**
     * Sets the value of the outCustAddressAddress1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCustAddressAddress1(String value) {
        this.outCustAddressAddress1 = value;
    }

    /**
     * Gets the value of the outCustAddressAddress2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCustAddressAddress2() {
        return outCustAddressAddress2;
    }

    /**
     * Sets the value of the outCustAddressAddress2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCustAddressAddress2(String value) {
        this.outCustAddressAddress2 = value;
    }

    /**
     * Gets the value of the outCustAddressCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCustAddressCity() {
        return outCustAddressCity;
    }

    /**
     * Sets the value of the outCustAddressCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCustAddressCity(String value) {
        this.outCustAddressCity = value;
    }

    /**
     * Gets the value of the outCustAddressSerialNum property.
     * 
     */
    public short getOutCustAddressSerialNum() {
        return outCustAddressSerialNum;
    }

    /**
     * Sets the value of the outCustAddressSerialNum property.
     * 
     */
    public void setOutCustAddressSerialNum(short value) {
        this.outCustAddressSerialNum = value;
    }

    /**
     * Gets the value of the outCustAddressZipCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCustAddressZipCode() {
        return outCustAddressZipCode;
    }

    /**
     * Sets the value of the outCustAddressZipCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCustAddressZipCode(String value) {
        this.outCustAddressZipCode = value;
    }

    /**
     * Gets the value of the outCustomerLnsSuppliedName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCustomerLnsSuppliedName() {
        return outCustomerLnsSuppliedName;
    }

    /**
     * Sets the value of the outCustomerLnsSuppliedName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCustomerLnsSuppliedName(String value) {
        this.outCustomerLnsSuppliedName = value;
    }

    /**
     * Gets the value of the outDbIntHintScalePercentage00 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutDbIntHintScalePercentage00() {
        return outDbIntHintScalePercentage00;
    }

    /**
     * Sets the value of the outDbIntHintScalePercentage00 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutDbIntHintScalePercentage00(BigDecimal value) {
        this.outDbIntHintScalePercentage00 = value;
    }

    /**
     * Gets the value of the outDepAccTrAccTrAccCd property.
     * 
     */
    public short getOutDepAccTrAccTrAccCd() {
        return outDepAccTrAccTrAccCd;
    }

    /**
     * Sets the value of the outDepAccTrAccTrAccCd property.
     * 
     */
    public void setOutDepAccTrAccTrAccCd(short value) {
        this.outDepAccTrAccTrAccCd = value;
    }

    /**
     * Gets the value of the outDepAccTrAccTrAccSn property.
     * 
     */
    public int getOutDepAccTrAccTrAccSn() {
        return outDepAccTrAccTrAccSn;
    }

    /**
     * Sets the value of the outDepAccTrAccTrAccSn property.
     * 
     */
    public void setOutDepAccTrAccTrAccSn(int value) {
        this.outDepAccTrAccTrAccSn = value;
    }

    /**
     * Gets the value of the outDepAccTrAccTrAccType property.
     * 
     */
    public short getOutDepAccTrAccTrAccType() {
        return outDepAccTrAccTrAccType;
    }

    /**
     * Sets the value of the outDepAccTrAccTrAccType property.
     * 
     */
    public void setOutDepAccTrAccTrAccType(short value) {
        this.outDepAccTrAccTrAccType = value;
    }

    /**
     * Gets the value of the outDepAccTrAccTrAccUnit property.
     * 
     */
    public int getOutDepAccTrAccTrAccUnit() {
        return outDepAccTrAccTrAccUnit;
    }

    /**
     * Sets the value of the outDepAccTrAccTrAccUnit property.
     * 
     */
    public void setOutDepAccTrAccTrAccUnit(int value) {
        this.outDepAccTrAccTrAccUnit = value;
    }

    /**
     * Gets the value of the outDepMntRecordingTrxUsrSn property.
     * 
     */
    public int getOutDepMntRecordingTrxUsrSn() {
        return outDepMntRecordingTrxUsrSn;
    }

    /**
     * Sets the value of the outDepMntRecordingTrxUsrSn property.
     * 
     */
    public void setOutDepMntRecordingTrxUsrSn(int value) {
        this.outDepMntRecordingTrxUsrSn = value;
    }

    /**
     * Gets the value of the outDepositChequeBookFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutDepositChequeBookFlag() {
        return outDepositChequeBookFlag;
    }

    /**
     * Sets the value of the outDepositChequeBookFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutDepositChequeBookFlag(String value) {
        this.outDepositChequeBookFlag = value;
    }

    /**
     * Gets the value of the outDepositMFCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutDepositMFCode() {
        return outDepositMFCode;
    }

    /**
     * Sets the value of the outDepositMFCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutDepositMFCode(String value) {
        this.outDepositMFCode = value;
    }

    /**
     * Gets the value of the outDepositMaxCustDpPer property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutDepositMaxCustDpPer() {
        return outDepositMaxCustDpPer;
    }

    /**
     * Sets the value of the outDepositMaxCustDpPer property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutDepositMaxCustDpPer(BigDecimal value) {
        this.outDepositMaxCustDpPer = value;
    }

    /**
     * Gets the value of the outDepositMaxProdDpPer property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutDepositMaxProdDpPer() {
        return outDepositMaxProdDpPer;
    }

    /**
     * Sets the value of the outDepositMaxProdDpPer property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutDepositMaxProdDpPer(BigDecimal value) {
        this.outDepositMaxProdDpPer = value;
    }

    /**
     * Gets the value of the outDepositMaxUpdate property.
     * 
     */
    public short getOutDepositMaxUpdate() {
        return outDepositMaxUpdate;
    }

    /**
     * Sets the value of the outDepositMaxUpdate property.
     * 
     */
    public void setOutDepositMaxUpdate(short value) {
        this.outDepositMaxUpdate = value;
    }

    /**
     * Gets the value of the outDepositMinCustMFPer property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutDepositMinCustMFPer() {
        return outDepositMinCustMFPer;
    }

    /**
     * Sets the value of the outDepositMinCustMFPer property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutDepositMinCustMFPer(BigDecimal value) {
        this.outDepositMinCustMFPer = value;
    }

    /**
     * Gets the value of the outDepositMinDayAvailBalance property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutDepositMinDayAvailBalance() {
        return outDepositMinDayAvailBalance;
    }

    /**
     * Sets the value of the outDepositMinDayAvailBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutDepositMinDayAvailBalance(BigDecimal value) {
        this.outDepositMinDayAvailBalance = value;
    }

    /**
     * Gets the value of the outDepositMinDayDistrAmnt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutDepositMinDayDistrAmnt() {
        return outDepositMinDayDistrAmnt;
    }

    /**
     * Sets the value of the outDepositMinDayDistrAmnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutDepositMinDayDistrAmnt(BigDecimal value) {
        this.outDepositMinDayDistrAmnt = value;
    }

    /**
     * Gets the value of the outDepositMinProdMFPer property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutDepositMinProdMFPer() {
        return outDepositMinProdMFPer;
    }

    /**
     * Sets the value of the outDepositMinProdMFPer property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutDepositMinProdMFPer(BigDecimal value) {
        this.outDepositMinProdMFPer = value;
    }

    /**
     * Gets the value of the outDepositMinTrxAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutDepositMinTrxAmount() {
        return outDepositMinTrxAmount;
    }

    /**
     * Sets the value of the outDepositMinTrxAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutDepositMinTrxAmount(BigDecimal value) {
        this.outDepositMinTrxAmount = value;
    }

    /**
     * Gets the value of the outDepositPassbookFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutDepositPassbookFlag() {
        return outDepositPassbookFlag;
    }

    /**
     * Sets the value of the outDepositPassbookFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutDepositPassbookFlag(String value) {
        this.outDepositPassbookFlag = value;
    }

    /**
     * Gets the value of the outDepositAccountAccountNumber property.
     * 
     */
    public double getOutDepositAccountAccountNumber() {
        return outDepositAccountAccountNumber;
    }

    /**
     * Sets the value of the outDepositAccountAccountNumber property.
     * 
     */
    public void setOutDepositAccountAccountNumber(double value) {
        this.outDepositAccountAccountNumber = value;
    }

    /**
     * Gets the value of the outDepositAccountAccountType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutDepositAccountAccountType() {
        return outDepositAccountAccountType;
    }

    /**
     * Sets the value of the outDepositAccountAccountType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutDepositAccountAccountType(String value) {
        this.outDepositAccountAccountType = value;
    }

    /**
     * Gets the value of the outDepositAccountCDigit property.
     * 
     */
    public short getOutDepositAccountCDigit() {
        return outDepositAccountCDigit;
    }

    /**
     * Sets the value of the outDepositAccountCDigit property.
     * 
     */
    public void setOutDepositAccountCDigit(short value) {
        this.outDepositAccountCDigit = value;
    }

    /**
     * Gets the value of the outDepositAccountCorrChqDetail1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutDepositAccountCorrChqDetail1() {
        return outDepositAccountCorrChqDetail1;
    }

    /**
     * Sets the value of the outDepositAccountCorrChqDetail1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutDepositAccountCorrChqDetail1(String value) {
        this.outDepositAccountCorrChqDetail1 = value;
    }

    /**
     * Gets the value of the outDepositAccountCorrChqDetail2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutDepositAccountCorrChqDetail2() {
        return outDepositAccountCorrChqDetail2;
    }

    /**
     * Sets the value of the outDepositAccountCorrChqDetail2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutDepositAccountCorrChqDetail2(String value) {
        this.outDepositAccountCorrChqDetail2 = value;
    }

    /**
     * Gets the value of the outDepositAccountDesignation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutDepositAccountDesignation() {
        return outDepositAccountDesignation;
    }

    /**
     * Sets the value of the outDepositAccountDesignation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutDepositAccountDesignation(String value) {
        this.outDepositAccountDesignation = value;
    }

    /**
     * Gets the value of the outDepositAccountEntryStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutDepositAccountEntryStatus() {
        return outDepositAccountEntryStatus;
    }

    /**
     * Sets the value of the outDepositAccountEntryStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutDepositAccountEntryStatus(String value) {
        this.outDepositAccountEntryStatus = value;
    }

    /**
     * Gets the value of the outDepositAccountIncomeAmnt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutDepositAccountIncomeAmnt() {
        return outDepositAccountIncomeAmnt;
    }

    /**
     * Sets the value of the outDepositAccountIncomeAmnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutDepositAccountIncomeAmnt(BigDecimal value) {
        this.outDepositAccountIncomeAmnt = value;
    }

    /**
     * Gets the value of the outDepositAccountIncomeFrequency property.
     * 
     */
    public int getOutDepositAccountIncomeFrequency() {
        return outDepositAccountIncomeFrequency;
    }

    /**
     * Sets the value of the outDepositAccountIncomeFrequency property.
     * 
     */
    public void setOutDepositAccountIncomeFrequency(int value) {
        this.outDepositAccountIncomeFrequency = value;
    }

    /**
     * Gets the value of the outDepositAccountOpeningDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutDepositAccountOpeningDate() {
        return outDepositAccountOpeningDate;
    }

    /**
     * Sets the value of the outDepositAccountOpeningDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutDepositAccountOpeningDate(XMLGregorianCalendar value) {
        this.outDepositAccountOpeningDate = value;
    }

    /**
     * Gets the value of the outDepositAccountPassbookFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutDepositAccountPassbookFlag() {
        return outDepositAccountPassbookFlag;
    }

    /**
     * Sets the value of the outDepositAccountPassbookFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutDepositAccountPassbookFlag(String value) {
        this.outDepositAccountPassbookFlag = value;
    }

    /**
     * Gets the value of the outDepositAccountTdInterPercentChg property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutDepositAccountTdInterPercentChg() {
        return outDepositAccountTdInterPercentChg;
    }

    /**
     * Sets the value of the outDepositAccountTdInterPercentChg property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutDepositAccountTdInterPercentChg(BigDecimal value) {
        this.outDepositAccountTdInterPercentChg = value;
    }

    /**
     * Gets the value of the outDepositAccountTdInterSprdChg property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutDepositAccountTdInterSprdChg() {
        return outDepositAccountTdInterSprdChg;
    }

    /**
     * Sets the value of the outDepositAccountTdInterSprdChg property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutDepositAccountTdInterSprdChg(BigDecimal value) {
        this.outDepositAccountTdInterSprdChg = value;
    }

    /**
     * Gets the value of the outEconomForFifthCustGenericDetailDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutEconomForFifthCustGenericDetailDescription() {
        return outEconomForFifthCustGenericDetailDescription;
    }

    /**
     * Sets the value of the outEconomForFifthCustGenericDetailDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutEconomForFifthCustGenericDetailDescription(String value) {
        this.outEconomForFifthCustGenericDetailDescription = value;
    }

    /**
     * Gets the value of the outEconomForFifthCustGenericDetailSerialNum property.
     * 
     */
    public int getOutEconomForFifthCustGenericDetailSerialNum() {
        return outEconomForFifthCustGenericDetailSerialNum;
    }

    /**
     * Sets the value of the outEconomForFifthCustGenericDetailSerialNum property.
     * 
     */
    public void setOutEconomForFifthCustGenericDetailSerialNum(int value) {
        this.outEconomForFifthCustGenericDetailSerialNum = value;
    }

    /**
     * Gets the value of the outEconomForFirstCustGenericDetailDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutEconomForFirstCustGenericDetailDescription() {
        return outEconomForFirstCustGenericDetailDescription;
    }

    /**
     * Sets the value of the outEconomForFirstCustGenericDetailDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutEconomForFirstCustGenericDetailDescription(String value) {
        this.outEconomForFirstCustGenericDetailDescription = value;
    }

    /**
     * Gets the value of the outEconomForFirstCustGenericDetailSerialNum property.
     * 
     */
    public int getOutEconomForFirstCustGenericDetailSerialNum() {
        return outEconomForFirstCustGenericDetailSerialNum;
    }

    /**
     * Sets the value of the outEconomForFirstCustGenericDetailSerialNum property.
     * 
     */
    public void setOutEconomForFirstCustGenericDetailSerialNum(int value) {
        this.outEconomForFirstCustGenericDetailSerialNum = value;
    }

    /**
     * Gets the value of the outEconomForFourthCustGenericDetailDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutEconomForFourthCustGenericDetailDescription() {
        return outEconomForFourthCustGenericDetailDescription;
    }

    /**
     * Sets the value of the outEconomForFourthCustGenericDetailDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutEconomForFourthCustGenericDetailDescription(String value) {
        this.outEconomForFourthCustGenericDetailDescription = value;
    }

    /**
     * Gets the value of the outEconomForFourthCustGenericDetailSerialNum property.
     * 
     */
    public int getOutEconomForFourthCustGenericDetailSerialNum() {
        return outEconomForFourthCustGenericDetailSerialNum;
    }

    /**
     * Sets the value of the outEconomForFourthCustGenericDetailSerialNum property.
     * 
     */
    public void setOutEconomForFourthCustGenericDetailSerialNum(int value) {
        this.outEconomForFourthCustGenericDetailSerialNum = value;
    }

    /**
     * Gets the value of the outEconomForSecCustGenericDetailDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutEconomForSecCustGenericDetailDescription() {
        return outEconomForSecCustGenericDetailDescription;
    }

    /**
     * Sets the value of the outEconomForSecCustGenericDetailDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutEconomForSecCustGenericDetailDescription(String value) {
        this.outEconomForSecCustGenericDetailDescription = value;
    }

    /**
     * Gets the value of the outEconomForSecCustGenericDetailSerialNum property.
     * 
     */
    public int getOutEconomForSecCustGenericDetailSerialNum() {
        return outEconomForSecCustGenericDetailSerialNum;
    }

    /**
     * Sets the value of the outEconomForSecCustGenericDetailSerialNum property.
     * 
     */
    public void setOutEconomForSecCustGenericDetailSerialNum(int value) {
        this.outEconomForSecCustGenericDetailSerialNum = value;
    }

    /**
     * Gets the value of the outEconomForThirdCustGenericDetailDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutEconomForThirdCustGenericDetailDescription() {
        return outEconomForThirdCustGenericDetailDescription;
    }

    /**
     * Sets the value of the outEconomForThirdCustGenericDetailDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutEconomForThirdCustGenericDetailDescription(String value) {
        this.outEconomForThirdCustGenericDetailDescription = value;
    }

    /**
     * Gets the value of the outEconomForThirdCustGenericDetailSerialNum property.
     * 
     */
    public int getOutEconomForThirdCustGenericDetailSerialNum() {
        return outEconomForThirdCustGenericDetailSerialNum;
    }

    /**
     * Sets the value of the outEconomForThirdCustGenericDetailSerialNum property.
     * 
     */
    public void setOutEconomForThirdCustGenericDetailSerialNum(int value) {
        this.outEconomForThirdCustGenericDetailSerialNum = value;
    }

    /**
     * Gets the value of the outEvaluationTeamInformationAuthorizationType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutEvaluationTeamInformationAuthorizationType() {
        return outEvaluationTeamInformationAuthorizationType;
    }

    /**
     * Sets the value of the outEvaluationTeamInformationAuthorizationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutEvaluationTeamInformationAuthorizationType(String value) {
        this.outEvaluationTeamInformationAuthorizationType = value;
    }

    /**
     * Gets the value of the outEvaluationTeamInformationRequiredProfile1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutEvaluationTeamInformationRequiredProfile1() {
        return outEvaluationTeamInformationRequiredProfile1;
    }

    /**
     * Sets the value of the outEvaluationTeamInformationRequiredProfile1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutEvaluationTeamInformationRequiredProfile1(String value) {
        this.outEvaluationTeamInformationRequiredProfile1 = value;
    }

    /**
     * Gets the value of the outEvaluationTeamInformationRequiredProfile2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutEvaluationTeamInformationRequiredProfile2() {
        return outEvaluationTeamInformationRequiredProfile2;
    }

    /**
     * Sets the value of the outEvaluationTeamInformationRequiredProfile2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutEvaluationTeamInformationRequiredProfile2(String value) {
        this.outEvaluationTeamInformationRequiredProfile2 = value;
    }

    /**
     * Gets the value of the outFifthCustCustAddressAddress1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutFifthCustCustAddressAddress1() {
        return outFifthCustCustAddressAddress1;
    }

    /**
     * Sets the value of the outFifthCustCustAddressAddress1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutFifthCustCustAddressAddress1(String value) {
        this.outFifthCustCustAddressAddress1 = value;
    }

    /**
     * Gets the value of the outFifthCustCustAddressAddress2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutFifthCustCustAddressAddress2() {
        return outFifthCustCustAddressAddress2;
    }

    /**
     * Sets the value of the outFifthCustCustAddressAddress2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutFifthCustCustAddressAddress2(String value) {
        this.outFifthCustCustAddressAddress2 = value;
    }

    /**
     * Gets the value of the outFifthCustCustAddressCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutFifthCustCustAddressCity() {
        return outFifthCustCustAddressCity;
    }

    /**
     * Sets the value of the outFifthCustCustAddressCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutFifthCustCustAddressCity(String value) {
        this.outFifthCustCustAddressCity = value;
    }

    /**
     * Gets the value of the outFifthCustCustAddressEntryStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutFifthCustCustAddressEntryStatus() {
        return outFifthCustCustAddressEntryStatus;
    }

    /**
     * Sets the value of the outFifthCustCustAddressEntryStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutFifthCustCustAddressEntryStatus(String value) {
        this.outFifthCustCustAddressEntryStatus = value;
    }

    /**
     * Gets the value of the outFifthCustCustAddressSerialNum property.
     * 
     */
    public short getOutFifthCustCustAddressSerialNum() {
        return outFifthCustCustAddressSerialNum;
    }

    /**
     * Sets the value of the outFifthCustCustAddressSerialNum property.
     * 
     */
    public void setOutFifthCustCustAddressSerialNum(short value) {
        this.outFifthCustCustAddressSerialNum = value;
    }

    /**
     * Gets the value of the outFifthCustCustAddressTelephone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutFifthCustCustAddressTelephone() {
        return outFifthCustCustAddressTelephone;
    }

    /**
     * Sets the value of the outFifthCustCustAddressTelephone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutFifthCustCustAddressTelephone(String value) {
        this.outFifthCustCustAddressTelephone = value;
    }

    /**
     * Gets the value of the outFifthCustCustAddressZipCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutFifthCustCustAddressZipCode() {
        return outFifthCustCustAddressZipCode;
    }

    /**
     * Sets the value of the outFifthCustCustAddressZipCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutFifthCustCustAddressZipCode(String value) {
        this.outFifthCustCustAddressZipCode = value;
    }

    /**
     * Gets the value of the outFifthCustOtherAfmAfmNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutFifthCustOtherAfmAfmNo() {
        return outFifthCustOtherAfmAfmNo;
    }

    /**
     * Sets the value of the outFifthCustOtherAfmAfmNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutFifthCustOtherAfmAfmNo(String value) {
        this.outFifthCustOtherAfmAfmNo = value;
    }

    /**
     * Gets the value of the outFifthCustOtherAfmMainFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutFifthCustOtherAfmMainFlag() {
        return outFifthCustOtherAfmMainFlag;
    }

    /**
     * Sets the value of the outFifthCustOtherAfmMainFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutFifthCustOtherAfmMainFlag(String value) {
        this.outFifthCustOtherAfmMainFlag = value;
    }

    /**
     * Gets the value of the outFifthCustomerCDigit property.
     * 
     */
    public short getOutFifthCustomerCDigit() {
        return outFifthCustomerCDigit;
    }

    /**
     * Sets the value of the outFifthCustomerCDigit property.
     * 
     */
    public void setOutFifthCustomerCDigit(short value) {
        this.outFifthCustomerCDigit = value;
    }

    /**
     * Gets the value of the outFifthCustomerCustId property.
     * 
     */
    public int getOutFifthCustomerCustId() {
        return outFifthCustomerCustId;
    }

    /**
     * Sets the value of the outFifthCustomerCustId property.
     * 
     */
    public void setOutFifthCustomerCustId(int value) {
        this.outFifthCustomerCustId = value;
    }

    /**
     * Gets the value of the outFifthCustomerCustType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutFifthCustomerCustType() {
        return outFifthCustomerCustType;
    }

    /**
     * Sets the value of the outFifthCustomerCustType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutFifthCustomerCustType(String value) {
        this.outFifthCustomerCustType = value;
    }

    /**
     * Gets the value of the outFifthCustomerDateOfBirth property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutFifthCustomerDateOfBirth() {
        return outFifthCustomerDateOfBirth;
    }

    /**
     * Sets the value of the outFifthCustomerDateOfBirth property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutFifthCustomerDateOfBirth(XMLGregorianCalendar value) {
        this.outFifthCustomerDateOfBirth = value;
    }

    /**
     * Gets the value of the outFifthCustomerFatherName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutFifthCustomerFatherName() {
        return outFifthCustomerFatherName;
    }

    /**
     * Sets the value of the outFifthCustomerFatherName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutFifthCustomerFatherName(String value) {
        this.outFifthCustomerFatherName = value;
    }

    /**
     * Gets the value of the outFifthOtherIdIdNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutFifthOtherIdIdNo() {
        return outFifthOtherIdIdNo;
    }

    /**
     * Sets the value of the outFifthOtherIdIdNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutFifthOtherIdIdNo(String value) {
        this.outFifthOtherIdIdNo = value;
    }

    /**
     * Gets the value of the outFinalCrHintScalePercentage00 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutFinalCrHintScalePercentage00() {
        return outFinalCrHintScalePercentage00;
    }

    /**
     * Sets the value of the outFinalCrHintScalePercentage00 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutFinalCrHintScalePercentage00(BigDecimal value) {
        this.outFinalCrHintScalePercentage00 = value;
    }

    /**
     * Gets the value of the outFinalDbExcIntHintScalePercentage00 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutFinalDbExcIntHintScalePercentage00() {
        return outFinalDbExcIntHintScalePercentage00;
    }

    /**
     * Sets the value of the outFinalDbExcIntHintScalePercentage00 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutFinalDbExcIntHintScalePercentage00(BigDecimal value) {
        this.outFinalDbExcIntHintScalePercentage00 = value;
    }

    /**
     * Gets the value of the outFinalDbHintScalePercentage00 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutFinalDbHintScalePercentage00() {
        return outFinalDbHintScalePercentage00;
    }

    /**
     * Sets the value of the outFinalDbHintScalePercentage00 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutFinalDbHintScalePercentage00(BigDecimal value) {
        this.outFinalDbHintScalePercentage00 = value;
    }

    /**
     * Gets the value of the outFirstCurrencyEntryStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutFirstCurrencyEntryStatus() {
        return outFirstCurrencyEntryStatus;
    }

    /**
     * Sets the value of the outFirstCurrencyEntryStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutFirstCurrencyEntryStatus(String value) {
        this.outFirstCurrencyEntryStatus = value;
    }

    /**
     * Gets the value of the outFirstCurrencyIdCurrency property.
     * 
     */
    public int getOutFirstCurrencyIdCurrency() {
        return outFirstCurrencyIdCurrency;
    }

    /**
     * Sets the value of the outFirstCurrencyIdCurrency property.
     * 
     */
    public void setOutFirstCurrencyIdCurrency(int value) {
        this.outFirstCurrencyIdCurrency = value;
    }

    /**
     * Gets the value of the outFirstCurrencyShortDescr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutFirstCurrencyShortDescr() {
        return outFirstCurrencyShortDescr;
    }

    /**
     * Sets the value of the outFirstCurrencyShortDescr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutFirstCurrencyShortDescr(String value) {
        this.outFirstCurrencyShortDescr = value;
    }

    /**
     * Gets the value of the outFirstCustCustAddressAddress1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutFirstCustCustAddressAddress1() {
        return outFirstCustCustAddressAddress1;
    }

    /**
     * Sets the value of the outFirstCustCustAddressAddress1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutFirstCustCustAddressAddress1(String value) {
        this.outFirstCustCustAddressAddress1 = value;
    }

    /**
     * Gets the value of the outFirstCustCustAddressAddress2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutFirstCustCustAddressAddress2() {
        return outFirstCustCustAddressAddress2;
    }

    /**
     * Sets the value of the outFirstCustCustAddressAddress2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutFirstCustCustAddressAddress2(String value) {
        this.outFirstCustCustAddressAddress2 = value;
    }

    /**
     * Gets the value of the outFirstCustCustAddressCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutFirstCustCustAddressCity() {
        return outFirstCustCustAddressCity;
    }

    /**
     * Sets the value of the outFirstCustCustAddressCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutFirstCustCustAddressCity(String value) {
        this.outFirstCustCustAddressCity = value;
    }

    /**
     * Gets the value of the outFirstCustCustAddressEntryStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutFirstCustCustAddressEntryStatus() {
        return outFirstCustCustAddressEntryStatus;
    }

    /**
     * Sets the value of the outFirstCustCustAddressEntryStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutFirstCustCustAddressEntryStatus(String value) {
        this.outFirstCustCustAddressEntryStatus = value;
    }

    /**
     * Gets the value of the outFirstCustCustAddressSerialNum property.
     * 
     */
    public short getOutFirstCustCustAddressSerialNum() {
        return outFirstCustCustAddressSerialNum;
    }

    /**
     * Sets the value of the outFirstCustCustAddressSerialNum property.
     * 
     */
    public void setOutFirstCustCustAddressSerialNum(short value) {
        this.outFirstCustCustAddressSerialNum = value;
    }

    /**
     * Gets the value of the outFirstCustCustAddressTelephone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutFirstCustCustAddressTelephone() {
        return outFirstCustCustAddressTelephone;
    }

    /**
     * Sets the value of the outFirstCustCustAddressTelephone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutFirstCustCustAddressTelephone(String value) {
        this.outFirstCustCustAddressTelephone = value;
    }

    /**
     * Gets the value of the outFirstCustCustAddressZipCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutFirstCustCustAddressZipCode() {
        return outFirstCustCustAddressZipCode;
    }

    /**
     * Sets the value of the outFirstCustCustAddressZipCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutFirstCustCustAddressZipCode(String value) {
        this.outFirstCustCustAddressZipCode = value;
    }

    /**
     * Gets the value of the outFirstCustOtherAfmAfmNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutFirstCustOtherAfmAfmNo() {
        return outFirstCustOtherAfmAfmNo;
    }

    /**
     * Sets the value of the outFirstCustOtherAfmAfmNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutFirstCustOtherAfmAfmNo(String value) {
        this.outFirstCustOtherAfmAfmNo = value;
    }

    /**
     * Gets the value of the outFirstCustOtherAfmMainFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutFirstCustOtherAfmMainFlag() {
        return outFirstCustOtherAfmMainFlag;
    }

    /**
     * Sets the value of the outFirstCustOtherAfmMainFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutFirstCustOtherAfmMainFlag(String value) {
        this.outFirstCustOtherAfmMainFlag = value;
    }

    /**
     * Gets the value of the outFirstCustomerCDigit property.
     * 
     */
    public short getOutFirstCustomerCDigit() {
        return outFirstCustomerCDigit;
    }

    /**
     * Sets the value of the outFirstCustomerCDigit property.
     * 
     */
    public void setOutFirstCustomerCDigit(short value) {
        this.outFirstCustomerCDigit = value;
    }

    /**
     * Gets the value of the outFirstCustomerCustId property.
     * 
     */
    public int getOutFirstCustomerCustId() {
        return outFirstCustomerCustId;
    }

    /**
     * Sets the value of the outFirstCustomerCustId property.
     * 
     */
    public void setOutFirstCustomerCustId(int value) {
        this.outFirstCustomerCustId = value;
    }

    /**
     * Gets the value of the outFirstCustomerCustType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutFirstCustomerCustType() {
        return outFirstCustomerCustType;
    }

    /**
     * Sets the value of the outFirstCustomerCustType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutFirstCustomerCustType(String value) {
        this.outFirstCustomerCustType = value;
    }

    /**
     * Gets the value of the outFirstCustomerDateOfBirth property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutFirstCustomerDateOfBirth() {
        return outFirstCustomerDateOfBirth;
    }

    /**
     * Sets the value of the outFirstCustomerDateOfBirth property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutFirstCustomerDateOfBirth(XMLGregorianCalendar value) {
        this.outFirstCustomerDateOfBirth = value;
    }

    /**
     * Gets the value of the outFirstCustomerFatherName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutFirstCustomerFatherName() {
        return outFirstCustomerFatherName;
    }

    /**
     * Sets the value of the outFirstCustomerFatherName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutFirstCustomerFatherName(String value) {
        this.outFirstCustomerFatherName = value;
    }

    /**
     * Gets the value of the outFirstOtherIdIdNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutFirstOtherIdIdNo() {
        return outFirstOtherIdIdNo;
    }

    /**
     * Sets the value of the outFirstOtherIdIdNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutFirstOtherIdIdNo(String value) {
        this.outFirstOtherIdIdNo = value;
    }

    /**
     * Gets the value of the outForExcAccLimitIefSuppliedFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutForExcAccLimitIefSuppliedFlag() {
        return outForExcAccLimitIefSuppliedFlag;
    }

    /**
     * Sets the value of the outForExcAccLimitIefSuppliedFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutForExcAccLimitIefSuppliedFlag(String value) {
        this.outForExcAccLimitIefSuppliedFlag = value;
    }

    /**
     * Gets the value of the outFourthCustCustAddressAddress1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutFourthCustCustAddressAddress1() {
        return outFourthCustCustAddressAddress1;
    }

    /**
     * Sets the value of the outFourthCustCustAddressAddress1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutFourthCustCustAddressAddress1(String value) {
        this.outFourthCustCustAddressAddress1 = value;
    }

    /**
     * Gets the value of the outFourthCustCustAddressAddress2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutFourthCustCustAddressAddress2() {
        return outFourthCustCustAddressAddress2;
    }

    /**
     * Sets the value of the outFourthCustCustAddressAddress2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutFourthCustCustAddressAddress2(String value) {
        this.outFourthCustCustAddressAddress2 = value;
    }

    /**
     * Gets the value of the outFourthCustCustAddressCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutFourthCustCustAddressCity() {
        return outFourthCustCustAddressCity;
    }

    /**
     * Sets the value of the outFourthCustCustAddressCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutFourthCustCustAddressCity(String value) {
        this.outFourthCustCustAddressCity = value;
    }

    /**
     * Gets the value of the outFourthCustCustAddressEntryStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutFourthCustCustAddressEntryStatus() {
        return outFourthCustCustAddressEntryStatus;
    }

    /**
     * Sets the value of the outFourthCustCustAddressEntryStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutFourthCustCustAddressEntryStatus(String value) {
        this.outFourthCustCustAddressEntryStatus = value;
    }

    /**
     * Gets the value of the outFourthCustCustAddressSerialNum property.
     * 
     */
    public short getOutFourthCustCustAddressSerialNum() {
        return outFourthCustCustAddressSerialNum;
    }

    /**
     * Sets the value of the outFourthCustCustAddressSerialNum property.
     * 
     */
    public void setOutFourthCustCustAddressSerialNum(short value) {
        this.outFourthCustCustAddressSerialNum = value;
    }

    /**
     * Gets the value of the outFourthCustCustAddressTelephone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutFourthCustCustAddressTelephone() {
        return outFourthCustCustAddressTelephone;
    }

    /**
     * Sets the value of the outFourthCustCustAddressTelephone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutFourthCustCustAddressTelephone(String value) {
        this.outFourthCustCustAddressTelephone = value;
    }

    /**
     * Gets the value of the outFourthCustCustAddressZipCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutFourthCustCustAddressZipCode() {
        return outFourthCustCustAddressZipCode;
    }

    /**
     * Sets the value of the outFourthCustCustAddressZipCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutFourthCustCustAddressZipCode(String value) {
        this.outFourthCustCustAddressZipCode = value;
    }

    /**
     * Gets the value of the outFourthCustOtherAfmAfmNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutFourthCustOtherAfmAfmNo() {
        return outFourthCustOtherAfmAfmNo;
    }

    /**
     * Sets the value of the outFourthCustOtherAfmAfmNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutFourthCustOtherAfmAfmNo(String value) {
        this.outFourthCustOtherAfmAfmNo = value;
    }

    /**
     * Gets the value of the outFourthCustOtherAfmMainFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutFourthCustOtherAfmMainFlag() {
        return outFourthCustOtherAfmMainFlag;
    }

    /**
     * Sets the value of the outFourthCustOtherAfmMainFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutFourthCustOtherAfmMainFlag(String value) {
        this.outFourthCustOtherAfmMainFlag = value;
    }

    /**
     * Gets the value of the outFourthCustomerCDigit property.
     * 
     */
    public short getOutFourthCustomerCDigit() {
        return outFourthCustomerCDigit;
    }

    /**
     * Sets the value of the outFourthCustomerCDigit property.
     * 
     */
    public void setOutFourthCustomerCDigit(short value) {
        this.outFourthCustomerCDigit = value;
    }

    /**
     * Gets the value of the outFourthCustomerCustId property.
     * 
     */
    public int getOutFourthCustomerCustId() {
        return outFourthCustomerCustId;
    }

    /**
     * Sets the value of the outFourthCustomerCustId property.
     * 
     */
    public void setOutFourthCustomerCustId(int value) {
        this.outFourthCustomerCustId = value;
    }

    /**
     * Gets the value of the outFourthCustomerCustType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutFourthCustomerCustType() {
        return outFourthCustomerCustType;
    }

    /**
     * Sets the value of the outFourthCustomerCustType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutFourthCustomerCustType(String value) {
        this.outFourthCustomerCustType = value;
    }

    /**
     * Gets the value of the outFourthCustomerDateOfBirth property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutFourthCustomerDateOfBirth() {
        return outFourthCustomerDateOfBirth;
    }

    /**
     * Sets the value of the outFourthCustomerDateOfBirth property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutFourthCustomerDateOfBirth(XMLGregorianCalendar value) {
        this.outFourthCustomerDateOfBirth = value;
    }

    /**
     * Gets the value of the outFourthCustomerFatherName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutFourthCustomerFatherName() {
        return outFourthCustomerFatherName;
    }

    /**
     * Sets the value of the outFourthCustomerFatherName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutFourthCustomerFatherName(String value) {
        this.outFourthCustomerFatherName = value;
    }

    /**
     * Gets the value of the outFourthOtherIdIdNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutFourthOtherIdIdNo() {
        return outFourthOtherIdIdNo;
    }

    /**
     * Sets the value of the outFourthOtherIdIdNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutFourthOtherIdIdNo(String value) {
        this.outFourthOtherIdIdNo = value;
    }

    /**
     * Gets the value of the outIssueOfficeUnitCode property.
     * 
     */
    public int getOutIssueOfficeUnitCode() {
        return outIssueOfficeUnitCode;
    }

    /**
     * Sets the value of the outIssueOfficeUnitCode property.
     * 
     */
    public void setOutIssueOfficeUnitCode(int value) {
        this.outIssueOfficeUnitCode = value;
    }

    /**
     * Gets the value of the outIssueOfficeUnitUnitName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutIssueOfficeUnitUnitName() {
        return outIssueOfficeUnitUnitName;
    }

    /**
     * Sets the value of the outIssueOfficeUnitUnitName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutIssueOfficeUnitUnitName(String value) {
        this.outIssueOfficeUnitUnitName = value;
    }

    /**
     * Gets the value of the outLnsCommissionIdCommission property.
     * 
     */
    public int getOutLnsCommissionIdCommission() {
        return outLnsCommissionIdCommission;
    }

    /**
     * Sets the value of the outLnsCommissionIdCommission property.
     * 
     */
    public void setOutLnsCommissionIdCommission(int value) {
        this.outLnsCommissionIdCommission = value;
    }

    /**
     * Gets the value of the outLoanDurationUnit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutLoanDurationUnit() {
        return outLoanDurationUnit;
    }

    /**
     * Sets the value of the outLoanDurationUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutLoanDurationUnit(String value) {
        this.outLoanDurationUnit = value;
    }

    /**
     * Gets the value of the outLoanLoanType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutLoanLoanType() {
        return outLoanLoanType;
    }

    /**
     * Sets the value of the outLoanLoanType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutLoanLoanType(String value) {
        this.outLoanLoanType = value;
    }

    /**
     * Gets the value of the outLoanMaxLoanDurat property.
     * 
     */
    public short getOutLoanMaxLoanDurat() {
        return outLoanMaxLoanDurat;
    }

    /**
     * Sets the value of the outLoanMaxLoanDurat property.
     * 
     */
    public void setOutLoanMaxLoanDurat(short value) {
        this.outLoanMaxLoanDurat = value;
    }

    /**
     * Gets the value of the outLoanProductIdProduct property.
     * 
     */
    public int getOutLoanProductIdProduct() {
        return outLoanProductIdProduct;
    }

    /**
     * Sets the value of the outLoanProductIdProduct property.
     * 
     */
    public void setOutLoanProductIdProduct(int value) {
        this.outLoanProductIdProduct = value;
    }

    /**
     * Gets the value of the outLoanProductValidityDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutLoanProductValidityDate() {
        return outLoanProductValidityDate;
    }

    /**
     * Sets the value of the outLoanProductValidityDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutLoanProductValidityDate(XMLGregorianCalendar value) {
        this.outLoanProductValidityDate = value;
    }

    /**
     * Gets the value of the outNatioForFifthCustGenericDetailDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutNatioForFifthCustGenericDetailDescription() {
        return outNatioForFifthCustGenericDetailDescription;
    }

    /**
     * Sets the value of the outNatioForFifthCustGenericDetailDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutNatioForFifthCustGenericDetailDescription(String value) {
        this.outNatioForFifthCustGenericDetailDescription = value;
    }

    /**
     * Gets the value of the outNatioForFirstCustGenericDetailDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutNatioForFirstCustGenericDetailDescription() {
        return outNatioForFirstCustGenericDetailDescription;
    }

    /**
     * Sets the value of the outNatioForFirstCustGenericDetailDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutNatioForFirstCustGenericDetailDescription(String value) {
        this.outNatioForFirstCustGenericDetailDescription = value;
    }

    /**
     * Gets the value of the outNatioForFourthCustGenericDetailDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutNatioForFourthCustGenericDetailDescription() {
        return outNatioForFourthCustGenericDetailDescription;
    }

    /**
     * Sets the value of the outNatioForFourthCustGenericDetailDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutNatioForFourthCustGenericDetailDescription(String value) {
        this.outNatioForFourthCustGenericDetailDescription = value;
    }

    /**
     * Gets the value of the outNatioForSecCustGenericDetailDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutNatioForSecCustGenericDetailDescription() {
        return outNatioForSecCustGenericDetailDescription;
    }

    /**
     * Sets the value of the outNatioForSecCustGenericDetailDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutNatioForSecCustGenericDetailDescription(String value) {
        this.outNatioForSecCustGenericDetailDescription = value;
    }

    /**
     * Gets the value of the outNatioForThirdCustGenericDetailDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutNatioForThirdCustGenericDetailDescription() {
        return outNatioForThirdCustGenericDetailDescription;
    }

    /**
     * Sets the value of the outNatioForThirdCustGenericDetailDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutNatioForThirdCustGenericDetailDescription(String value) {
        this.outNatioForThirdCustGenericDetailDescription = value;
    }

    /**
     * Gets the value of the outOdDbIntHintScalePercentage00 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutOdDbIntHintScalePercentage00() {
        return outOdDbIntHintScalePercentage00;
    }

    /**
     * Sets the value of the outOdDbIntHintScalePercentage00 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutOdDbIntHintScalePercentage00(BigDecimal value) {
        this.outOdDbIntHintScalePercentage00 = value;
    }

    /**
     * Gets the value of the outPrintLineDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutPrintLineDate() {
        return outPrintLineDate;
    }

    /**
     * Sets the value of the outPrintLineDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutPrintLineDate(XMLGregorianCalendar value) {
        this.outPrintLineDate = value;
    }

    /**
     * Gets the value of the outPrintLineTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutPrintLineTime() {
        return outPrintLineTime;
    }

    /**
     * Sets the value of the outPrintLineTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutPrintLineTime(XMLGregorianCalendar value) {
        this.outPrintLineTime = value;
    }

    /**
     * Gets the value of the outProffForFifthCustGenericDetailDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutProffForFifthCustGenericDetailDescription() {
        return outProffForFifthCustGenericDetailDescription;
    }

    /**
     * Sets the value of the outProffForFifthCustGenericDetailDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutProffForFifthCustGenericDetailDescription(String value) {
        this.outProffForFifthCustGenericDetailDescription = value;
    }

    /**
     * Gets the value of the outProffForFifthCustGenericDetailSerialNum property.
     * 
     */
    public int getOutProffForFifthCustGenericDetailSerialNum() {
        return outProffForFifthCustGenericDetailSerialNum;
    }

    /**
     * Sets the value of the outProffForFifthCustGenericDetailSerialNum property.
     * 
     */
    public void setOutProffForFifthCustGenericDetailSerialNum(int value) {
        this.outProffForFifthCustGenericDetailSerialNum = value;
    }

    /**
     * Gets the value of the outProffForFirstCustGenericDetailDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutProffForFirstCustGenericDetailDescription() {
        return outProffForFirstCustGenericDetailDescription;
    }

    /**
     * Sets the value of the outProffForFirstCustGenericDetailDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutProffForFirstCustGenericDetailDescription(String value) {
        this.outProffForFirstCustGenericDetailDescription = value;
    }

    /**
     * Gets the value of the outProffForFirstCustGenericDetailSerialNum property.
     * 
     */
    public int getOutProffForFirstCustGenericDetailSerialNum() {
        return outProffForFirstCustGenericDetailSerialNum;
    }

    /**
     * Sets the value of the outProffForFirstCustGenericDetailSerialNum property.
     * 
     */
    public void setOutProffForFirstCustGenericDetailSerialNum(int value) {
        this.outProffForFirstCustGenericDetailSerialNum = value;
    }

    /**
     * Gets the value of the outProffForFourthCustGenericDetailDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutProffForFourthCustGenericDetailDescription() {
        return outProffForFourthCustGenericDetailDescription;
    }

    /**
     * Sets the value of the outProffForFourthCustGenericDetailDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutProffForFourthCustGenericDetailDescription(String value) {
        this.outProffForFourthCustGenericDetailDescription = value;
    }

    /**
     * Gets the value of the outProffForFourthCustGenericDetailSerialNum property.
     * 
     */
    public int getOutProffForFourthCustGenericDetailSerialNum() {
        return outProffForFourthCustGenericDetailSerialNum;
    }

    /**
     * Sets the value of the outProffForFourthCustGenericDetailSerialNum property.
     * 
     */
    public void setOutProffForFourthCustGenericDetailSerialNum(int value) {
        this.outProffForFourthCustGenericDetailSerialNum = value;
    }

    /**
     * Gets the value of the outProffForSecCustGenericDetailDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutProffForSecCustGenericDetailDescription() {
        return outProffForSecCustGenericDetailDescription;
    }

    /**
     * Sets the value of the outProffForSecCustGenericDetailDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutProffForSecCustGenericDetailDescription(String value) {
        this.outProffForSecCustGenericDetailDescription = value;
    }

    /**
     * Gets the value of the outProffForSecCustGenericDetailSerialNum property.
     * 
     */
    public int getOutProffForSecCustGenericDetailSerialNum() {
        return outProffForSecCustGenericDetailSerialNum;
    }

    /**
     * Sets the value of the outProffForSecCustGenericDetailSerialNum property.
     * 
     */
    public void setOutProffForSecCustGenericDetailSerialNum(int value) {
        this.outProffForSecCustGenericDetailSerialNum = value;
    }

    /**
     * Gets the value of the outProffForThirdCustGenericDetailDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutProffForThirdCustGenericDetailDescription() {
        return outProffForThirdCustGenericDetailDescription;
    }

    /**
     * Sets the value of the outProffForThirdCustGenericDetailDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutProffForThirdCustGenericDetailDescription(String value) {
        this.outProffForThirdCustGenericDetailDescription = value;
    }

    /**
     * Gets the value of the outProffForThirdCustGenericDetailSerialNum property.
     * 
     */
    public int getOutProffForThirdCustGenericDetailSerialNum() {
        return outProffForThirdCustGenericDetailSerialNum;
    }

    /**
     * Sets the value of the outProffForThirdCustGenericDetailSerialNum property.
     * 
     */
    public void setOutProffForThirdCustGenericDetailSerialNum(int value) {
        this.outProffForThirdCustGenericDetailSerialNum = value;
    }

    /**
     * Gets the value of the outProfitsAccountAccountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutProfitsAccountAccountNumber() {
        return outProfitsAccountAccountNumber;
    }

    /**
     * Sets the value of the outProfitsAccountAccountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutProfitsAccountAccountNumber(String value) {
        this.outProfitsAccountAccountNumber = value;
    }

    /**
     * Gets the value of the outSaleUnitGenericDetailDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSaleUnitGenericDetailDescription() {
        return outSaleUnitGenericDetailDescription;
    }

    /**
     * Sets the value of the outSaleUnitGenericDetailDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSaleUnitGenericDetailDescription(String value) {
        this.outSaleUnitGenericDetailDescription = value;
    }

    /**
     * Gets the value of the outSaleUnitGenericDetailEntryStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSaleUnitGenericDetailEntryStatus() {
        return outSaleUnitGenericDetailEntryStatus;
    }

    /**
     * Sets the value of the outSaleUnitGenericDetailEntryStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSaleUnitGenericDetailEntryStatus(String value) {
        this.outSaleUnitGenericDetailEntryStatus = value;
    }

    /**
     * Gets the value of the outSaleUnitGenericDetailParameterType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSaleUnitGenericDetailParameterType() {
        return outSaleUnitGenericDetailParameterType;
    }

    /**
     * Sets the value of the outSaleUnitGenericDetailParameterType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSaleUnitGenericDetailParameterType(String value) {
        this.outSaleUnitGenericDetailParameterType = value;
    }

    /**
     * Gets the value of the outSaleUnitGenericDetailSerialNum property.
     * 
     */
    public int getOutSaleUnitGenericDetailSerialNum() {
        return outSaleUnitGenericDetailSerialNum;
    }

    /**
     * Sets the value of the outSaleUnitGenericDetailSerialNum property.
     * 
     */
    public void setOutSaleUnitGenericDetailSerialNum(int value) {
        this.outSaleUnitGenericDetailSerialNum = value;
    }

    /**
     * Gets the value of the outSaleUnitGenericDetailShortDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSaleUnitGenericDetailShortDescription() {
        return outSaleUnitGenericDetailShortDescription;
    }

    /**
     * Sets the value of the outSaleUnitGenericDetailShortDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSaleUnitGenericDetailShortDescription(String value) {
        this.outSaleUnitGenericDetailShortDescription = value;
    }

    /**
     * Gets the value of the outSaleUnitGenericDetailTmstamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutSaleUnitGenericDetailTmstamp() {
        return outSaleUnitGenericDetailTmstamp;
    }

    /**
     * Sets the value of the outSaleUnitGenericDetailTmstamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutSaleUnitGenericDetailTmstamp(XMLGregorianCalendar value) {
        this.outSaleUnitGenericDetailTmstamp = value;
    }

    /**
     * Gets the value of the outSecondCustCustAddressAddress1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSecondCustCustAddressAddress1() {
        return outSecondCustCustAddressAddress1;
    }

    /**
     * Sets the value of the outSecondCustCustAddressAddress1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSecondCustCustAddressAddress1(String value) {
        this.outSecondCustCustAddressAddress1 = value;
    }

    /**
     * Gets the value of the outSecondCustCustAddressAddress2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSecondCustCustAddressAddress2() {
        return outSecondCustCustAddressAddress2;
    }

    /**
     * Sets the value of the outSecondCustCustAddressAddress2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSecondCustCustAddressAddress2(String value) {
        this.outSecondCustCustAddressAddress2 = value;
    }

    /**
     * Gets the value of the outSecondCustCustAddressCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSecondCustCustAddressCity() {
        return outSecondCustCustAddressCity;
    }

    /**
     * Sets the value of the outSecondCustCustAddressCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSecondCustCustAddressCity(String value) {
        this.outSecondCustCustAddressCity = value;
    }

    /**
     * Gets the value of the outSecondCustCustAddressEntryStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSecondCustCustAddressEntryStatus() {
        return outSecondCustCustAddressEntryStatus;
    }

    /**
     * Sets the value of the outSecondCustCustAddressEntryStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSecondCustCustAddressEntryStatus(String value) {
        this.outSecondCustCustAddressEntryStatus = value;
    }

    /**
     * Gets the value of the outSecondCustCustAddressSerialNum property.
     * 
     */
    public short getOutSecondCustCustAddressSerialNum() {
        return outSecondCustCustAddressSerialNum;
    }

    /**
     * Sets the value of the outSecondCustCustAddressSerialNum property.
     * 
     */
    public void setOutSecondCustCustAddressSerialNum(short value) {
        this.outSecondCustCustAddressSerialNum = value;
    }

    /**
     * Gets the value of the outSecondCustCustAddressTelephone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSecondCustCustAddressTelephone() {
        return outSecondCustCustAddressTelephone;
    }

    /**
     * Sets the value of the outSecondCustCustAddressTelephone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSecondCustCustAddressTelephone(String value) {
        this.outSecondCustCustAddressTelephone = value;
    }

    /**
     * Gets the value of the outSecondCustCustAddressZipCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSecondCustCustAddressZipCode() {
        return outSecondCustCustAddressZipCode;
    }

    /**
     * Sets the value of the outSecondCustCustAddressZipCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSecondCustCustAddressZipCode(String value) {
        this.outSecondCustCustAddressZipCode = value;
    }

    /**
     * Gets the value of the outSecondCustOtherAfmAfmNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSecondCustOtherAfmAfmNo() {
        return outSecondCustOtherAfmAfmNo;
    }

    /**
     * Sets the value of the outSecondCustOtherAfmAfmNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSecondCustOtherAfmAfmNo(String value) {
        this.outSecondCustOtherAfmAfmNo = value;
    }

    /**
     * Gets the value of the outSecondCustOtherAfmMainFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSecondCustOtherAfmMainFlag() {
        return outSecondCustOtherAfmMainFlag;
    }

    /**
     * Sets the value of the outSecondCustOtherAfmMainFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSecondCustOtherAfmMainFlag(String value) {
        this.outSecondCustOtherAfmMainFlag = value;
    }

    /**
     * Gets the value of the outSecondCustomerCDigit property.
     * 
     */
    public short getOutSecondCustomerCDigit() {
        return outSecondCustomerCDigit;
    }

    /**
     * Sets the value of the outSecondCustomerCDigit property.
     * 
     */
    public void setOutSecondCustomerCDigit(short value) {
        this.outSecondCustomerCDigit = value;
    }

    /**
     * Gets the value of the outSecondCustomerCustId property.
     * 
     */
    public int getOutSecondCustomerCustId() {
        return outSecondCustomerCustId;
    }

    /**
     * Sets the value of the outSecondCustomerCustId property.
     * 
     */
    public void setOutSecondCustomerCustId(int value) {
        this.outSecondCustomerCustId = value;
    }

    /**
     * Gets the value of the outSecondCustomerCustType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSecondCustomerCustType() {
        return outSecondCustomerCustType;
    }

    /**
     * Sets the value of the outSecondCustomerCustType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSecondCustomerCustType(String value) {
        this.outSecondCustomerCustType = value;
    }

    /**
     * Gets the value of the outSecondCustomerDateOfBirth property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutSecondCustomerDateOfBirth() {
        return outSecondCustomerDateOfBirth;
    }

    /**
     * Sets the value of the outSecondCustomerDateOfBirth property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutSecondCustomerDateOfBirth(XMLGregorianCalendar value) {
        this.outSecondCustomerDateOfBirth = value;
    }

    /**
     * Gets the value of the outSecondCustomerFatherName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSecondCustomerFatherName() {
        return outSecondCustomerFatherName;
    }

    /**
     * Sets the value of the outSecondCustomerFatherName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSecondCustomerFatherName(String value) {
        this.outSecondCustomerFatherName = value;
    }

    /**
     * Gets the value of the outSecondOtherIdIdNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSecondOtherIdIdNo() {
        return outSecondOtherIdIdNo;
    }

    /**
     * Sets the value of the outSecondOtherIdIdNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSecondOtherIdIdNo(String value) {
        this.outSecondOtherIdIdNo = value;
    }

    /**
     * Gets the value of the outServiceProfitsAccountAccountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutServiceProfitsAccountAccountNumber() {
        return outServiceProfitsAccountAccountNumber;
    }

    /**
     * Sets the value of the outServiceProfitsAccountAccountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutServiceProfitsAccountAccountNumber(String value) {
        this.outServiceProfitsAccountAccountNumber = value;
    }

    /**
     * Gets the value of the outThirdCustCustAddressAddress1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutThirdCustCustAddressAddress1() {
        return outThirdCustCustAddressAddress1;
    }

    /**
     * Sets the value of the outThirdCustCustAddressAddress1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutThirdCustCustAddressAddress1(String value) {
        this.outThirdCustCustAddressAddress1 = value;
    }

    /**
     * Gets the value of the outThirdCustCustAddressAddress2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutThirdCustCustAddressAddress2() {
        return outThirdCustCustAddressAddress2;
    }

    /**
     * Sets the value of the outThirdCustCustAddressAddress2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutThirdCustCustAddressAddress2(String value) {
        this.outThirdCustCustAddressAddress2 = value;
    }

    /**
     * Gets the value of the outThirdCustCustAddressCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutThirdCustCustAddressCity() {
        return outThirdCustCustAddressCity;
    }

    /**
     * Sets the value of the outThirdCustCustAddressCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutThirdCustCustAddressCity(String value) {
        this.outThirdCustCustAddressCity = value;
    }

    /**
     * Gets the value of the outThirdCustCustAddressEntryStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutThirdCustCustAddressEntryStatus() {
        return outThirdCustCustAddressEntryStatus;
    }

    /**
     * Sets the value of the outThirdCustCustAddressEntryStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutThirdCustCustAddressEntryStatus(String value) {
        this.outThirdCustCustAddressEntryStatus = value;
    }

    /**
     * Gets the value of the outThirdCustCustAddressSerialNum property.
     * 
     */
    public short getOutThirdCustCustAddressSerialNum() {
        return outThirdCustCustAddressSerialNum;
    }

    /**
     * Sets the value of the outThirdCustCustAddressSerialNum property.
     * 
     */
    public void setOutThirdCustCustAddressSerialNum(short value) {
        this.outThirdCustCustAddressSerialNum = value;
    }

    /**
     * Gets the value of the outThirdCustCustAddressTelephone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutThirdCustCustAddressTelephone() {
        return outThirdCustCustAddressTelephone;
    }

    /**
     * Sets the value of the outThirdCustCustAddressTelephone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutThirdCustCustAddressTelephone(String value) {
        this.outThirdCustCustAddressTelephone = value;
    }

    /**
     * Gets the value of the outThirdCustCustAddressZipCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutThirdCustCustAddressZipCode() {
        return outThirdCustCustAddressZipCode;
    }

    /**
     * Sets the value of the outThirdCustCustAddressZipCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutThirdCustCustAddressZipCode(String value) {
        this.outThirdCustCustAddressZipCode = value;
    }

    /**
     * Gets the value of the outThirdCustOtherAfmAfmNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutThirdCustOtherAfmAfmNo() {
        return outThirdCustOtherAfmAfmNo;
    }

    /**
     * Sets the value of the outThirdCustOtherAfmAfmNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutThirdCustOtherAfmAfmNo(String value) {
        this.outThirdCustOtherAfmAfmNo = value;
    }

    /**
     * Gets the value of the outThirdCustOtherAfmMainFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutThirdCustOtherAfmMainFlag() {
        return outThirdCustOtherAfmMainFlag;
    }

    /**
     * Sets the value of the outThirdCustOtherAfmMainFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutThirdCustOtherAfmMainFlag(String value) {
        this.outThirdCustOtherAfmMainFlag = value;
    }

    /**
     * Gets the value of the outThirdCustomerCDigit property.
     * 
     */
    public short getOutThirdCustomerCDigit() {
        return outThirdCustomerCDigit;
    }

    /**
     * Sets the value of the outThirdCustomerCDigit property.
     * 
     */
    public void setOutThirdCustomerCDigit(short value) {
        this.outThirdCustomerCDigit = value;
    }

    /**
     * Gets the value of the outThirdCustomerCustId property.
     * 
     */
    public int getOutThirdCustomerCustId() {
        return outThirdCustomerCustId;
    }

    /**
     * Sets the value of the outThirdCustomerCustId property.
     * 
     */
    public void setOutThirdCustomerCustId(int value) {
        this.outThirdCustomerCustId = value;
    }

    /**
     * Gets the value of the outThirdCustomerCustType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutThirdCustomerCustType() {
        return outThirdCustomerCustType;
    }

    /**
     * Sets the value of the outThirdCustomerCustType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutThirdCustomerCustType(String value) {
        this.outThirdCustomerCustType = value;
    }

    /**
     * Gets the value of the outThirdCustomerDateOfBirth property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutThirdCustomerDateOfBirth() {
        return outThirdCustomerDateOfBirth;
    }

    /**
     * Sets the value of the outThirdCustomerDateOfBirth property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutThirdCustomerDateOfBirth(XMLGregorianCalendar value) {
        this.outThirdCustomerDateOfBirth = value;
    }

    /**
     * Gets the value of the outThirdCustomerFatherName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutThirdCustomerFatherName() {
        return outThirdCustomerFatherName;
    }

    /**
     * Sets the value of the outThirdCustomerFatherName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutThirdCustomerFatherName(String value) {
        this.outThirdCustomerFatherName = value;
    }

    /**
     * Gets the value of the outThirdOtherIdIdNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutThirdOtherIdIdNo() {
        return outThirdOtherIdIdNo;
    }

    /**
     * Sets the value of the outThirdOtherIdIdNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutThirdOtherIdIdNo(String value) {
        this.outThirdOtherIdIdNo = value;
    }

    /**
     * Gets the value of the outUsedInputCharSuppliedChar37 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutUsedInputCharSuppliedChar37() {
        return outUsedInputCharSuppliedChar37;
    }

    /**
     * Sets the value of the outUsedInputCharSuppliedChar37 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutUsedInputCharSuppliedChar37(String value) {
        this.outUsedInputCharSuppliedChar37 = value;
    }

}
