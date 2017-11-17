
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for BI1634VDhsseclearingImport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BI1634VDhsseclearingImport">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}BaseImport">
 *       &lt;sequence>
 *         &lt;element name="In4PayBillBillAccountNumb" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="In4PayBillBillAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="In4PayBillBillCheckDigit" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="In4PayBillBillIssueDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="In4PayDhsseIncomingAccCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="In4PayDhsseIncomingAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="In4PayDhsseIncomingBuyBankCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="In4PayDhsseIncomingBuyBranch" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="In4PayDhsseIncomingChqNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="In4PayDhsseIncomingCorrSendDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="In4PayDhsseIncomingCorrSettleDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="In4PayDhsseIncomingDhsseRef" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="In4PayDhsseIncomingEntryStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="In4PayDhsseIncomingFilename" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="In4PayDhsseIncomingIbanCd" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="In4PayDhsseIncomingIbanCntry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="In4PayDhsseIncomingIbanDigits" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="In4PayDhsseIncomingIdJustific" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="In4PayDhsseIncomingIdentifier" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="In4PayDhsseIncomingIssDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="In4PayDhsseIncomingOnlTmstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="In4PayDhsseIncomingOnlTunDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="In4PayDhsseIncomingOnlTunInternalSn" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="In4PayDhsseIncomingOnlTunUnit" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="In4PayDhsseIncomingOnlTunUsr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="In4PayDhsseIncomingOnlTunUsrSn" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="In4PayDhsseIncomingPayAccno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="In4PayDhsseIncomingPayBranch" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="In4PayDhsseIncomingPayCurrency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="In4PayDhsseIncomingSettleRef" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="In4PayDhsseIncomingTranCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="In4PayDhsseIncomingTranDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InAccCodeDhsseIncomingAccCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InAccCurrencyCurrencyIdCurrency" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InAccCurrencyCurrencyShortDescr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InAccountUnitCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InAllUnitsIefSuppliedFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InAuthResultTeamInformationAuthorisationResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InAuthResultTeamInformationAuthorizationResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InAuthResultTeamInformationSuper1Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InAuthResultTeamInformationSuper2Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InAuthorGrantedIefSuppliedFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InChequeBookItemItemSerialNumber" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="InCommandIefSuppliedCommand" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCorrSendDateIefSuppliedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InDiaerGenericDetailDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InDiaerGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InDlgAchBankCodeDhsseIncomingBuyBankCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InDlgDhsseIncomingIbanDigits" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InDlgDhsseIncomingIncludeInFile" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InDlgProfitsAccountAccountCd" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InDlgProfitsAccountAccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InDlgProfitsAccountPrftSystem" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InFinalIefSuppliedFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InLastDhsseIncomingChqNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InLastDhsseIncomingCorrSendDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InLastDhsseIncomingIdentifier" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InParametersInBankParametersEuroEchoDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InParametersInBankParametersIbanFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InParametersInBankParametersMaxAmntRateTbl" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InParametersInBankParametersRateUsage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InParametersInTerminalTerminalNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InParametersInTrxCountTrxCounter" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InParametersInUnitClearingHouseFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InParametersInUnitCategoryGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InParametersInUsrGlLevel" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InParametersInWorkDatesProductionDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InParametersToBeDeletedCurrencyIdCurrency" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InParametersToBeDeletedCurrencyShortDescr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InParametersToBeDeletedSecRoleCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InPrftTransactionDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InPrftTransactionIdTransact" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InQueryDhsseIncomingChqNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InQueryProfitsAccountAccountCd" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InQueryProfitsAccountAccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InRetrieveFlgIefSuppliedFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InSsSecurityCmcbPrftSystem" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InSsSecurityCmcbTranCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InUnitFromUnitCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InUnitToUnitCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InLastDhsseIncomingFileData" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InLastDhsseIncomingUpdatedFileData" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BI1634VDhsseclearingImport", propOrder = {
    "in4PayBillBillAccountNumb",
    "in4PayBillBillAmount",
    "in4PayBillBillCheckDigit",
    "in4PayBillBillIssueDate",
    "in4PayDhsseIncomingAccCode",
    "in4PayDhsseIncomingAmount",
    "in4PayDhsseIncomingBuyBankCode",
    "in4PayDhsseIncomingBuyBranch",
    "in4PayDhsseIncomingChqNo",
    "in4PayDhsseIncomingCorrSendDate",
    "in4PayDhsseIncomingCorrSettleDate",
    "in4PayDhsseIncomingDhsseRef",
    "in4PayDhsseIncomingEntryStatus",
    "in4PayDhsseIncomingFilename",
    "in4PayDhsseIncomingIbanCd",
    "in4PayDhsseIncomingIbanCntry",
    "in4PayDhsseIncomingIbanDigits",
    "in4PayDhsseIncomingIdJustific",
    "in4PayDhsseIncomingIdentifier",
    "in4PayDhsseIncomingIssDate",
    "in4PayDhsseIncomingOnlTmstamp",
    "in4PayDhsseIncomingOnlTunDate",
    "in4PayDhsseIncomingOnlTunInternalSn",
    "in4PayDhsseIncomingOnlTunUnit",
    "in4PayDhsseIncomingOnlTunUsr",
    "in4PayDhsseIncomingOnlTunUsrSn",
    "in4PayDhsseIncomingPayAccno",
    "in4PayDhsseIncomingPayBranch",
    "in4PayDhsseIncomingPayCurrency",
    "in4PayDhsseIncomingSettleRef",
    "in4PayDhsseIncomingTranCode",
    "in4PayDhsseIncomingTranDate",
    "inAccCodeDhsseIncomingAccCode",
    "inAccCurrencyCurrencyIdCurrency",
    "inAccCurrencyCurrencyShortDescr",
    "inAccountUnitCode",
    "inAllUnitsIefSuppliedFlag",
    "inAuthResultTeamInformationAuthorisationResult",
    "inAuthResultTeamInformationAuthorizationResult",
    "inAuthResultTeamInformationSuper1Code",
    "inAuthResultTeamInformationSuper2Code",
    "inAuthorGrantedIefSuppliedFlag",
    "inChequeBookItemItemSerialNumber",
    "inCommandIefSuppliedCommand",
    "inCorrSendDateIefSuppliedDate",
    "inDiaerGenericDetailDescription",
    "inDiaerGenericDetailSerialNum",
    "inDlgAchBankCodeDhsseIncomingBuyBankCode",
    "inDlgDhsseIncomingIbanDigits",
    "inDlgDhsseIncomingIncludeInFile",
    "inDlgProfitsAccountAccountCd",
    "inDlgProfitsAccountAccountNumber",
    "inDlgProfitsAccountPrftSystem",
    "inFinalIefSuppliedFlag",
    "inLastDhsseIncomingChqNo",
    "inLastDhsseIncomingCorrSendDate",
    "inLastDhsseIncomingIdentifier",
    "inParametersInBankParametersEuroEchoDesc",
    "inParametersInBankParametersIbanFlag",
    "inParametersInBankParametersMaxAmntRateTbl",
    "inParametersInBankParametersRateUsage",
    "inParametersInTerminalTerminalNumber",
    "inParametersInTrxCountTrxCounter",
    "inParametersInUnitClearingHouseFlag",
    "inParametersInUnitCategoryGenericDetailSerialNum",
    "inParametersInUsrGlLevel",
    "inParametersInWorkDatesProductionDate",
    "inParametersToBeDeletedCurrencyIdCurrency",
    "inParametersToBeDeletedCurrencyShortDescr",
    "inParametersToBeDeletedSecRoleCode",
    "inPrftTransactionDescription",
    "inPrftTransactionIdTransact",
    "inQueryDhsseIncomingChqNo",
    "inQueryProfitsAccountAccountCd",
    "inQueryProfitsAccountAccountNumber",
    "inRetrieveFlgIefSuppliedFlag",
    "inSsSecurityCmcbPrftSystem",
    "inSsSecurityCmcbTranCode",
    "inUnitFromUnitCode",
    "inUnitToUnitCode",
    "inLastDhsseIncomingFileData",
    "inLastDhsseIncomingUpdatedFileData"
})
public class BI1634VDhsseclearingImport
    extends BaseImport
{

    @XmlElement(name = "In4PayBillBillAccountNumb")
    protected String in4PayBillBillAccountNumb;
    @XmlElement(name = "In4PayBillBillAmount", required = true)
    protected BigDecimal in4PayBillBillAmount;
    @XmlElement(name = "In4PayBillBillCheckDigit")
    protected short in4PayBillBillCheckDigit;
    @XmlElement(name = "In4PayBillBillIssueDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar in4PayBillBillIssueDate;
    @XmlElement(name = "In4PayDhsseIncomingAccCode")
    protected String in4PayDhsseIncomingAccCode;
    @XmlElement(name = "In4PayDhsseIncomingAmount")
    protected String in4PayDhsseIncomingAmount;
    @XmlElement(name = "In4PayDhsseIncomingBuyBankCode")
    protected String in4PayDhsseIncomingBuyBankCode;
    @XmlElement(name = "In4PayDhsseIncomingBuyBranch")
    protected String in4PayDhsseIncomingBuyBranch;
    @XmlElement(name = "In4PayDhsseIncomingChqNo")
    protected String in4PayDhsseIncomingChqNo;
    @XmlElement(name = "In4PayDhsseIncomingCorrSendDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar in4PayDhsseIncomingCorrSendDate;
    @XmlElement(name = "In4PayDhsseIncomingCorrSettleDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar in4PayDhsseIncomingCorrSettleDate;
    @XmlElement(name = "In4PayDhsseIncomingDhsseRef")
    protected String in4PayDhsseIncomingDhsseRef;
    @XmlElement(name = "In4PayDhsseIncomingEntryStatus")
    protected String in4PayDhsseIncomingEntryStatus;
    @XmlElement(name = "In4PayDhsseIncomingFilename")
    protected String in4PayDhsseIncomingFilename;
    @XmlElement(name = "In4PayDhsseIncomingIbanCd")
    protected short in4PayDhsseIncomingIbanCd;
    @XmlElement(name = "In4PayDhsseIncomingIbanCntry")
    protected String in4PayDhsseIncomingIbanCntry;
    @XmlElement(name = "In4PayDhsseIncomingIbanDigits")
    protected String in4PayDhsseIncomingIbanDigits;
    @XmlElement(name = "In4PayDhsseIncomingIdJustific")
    protected int in4PayDhsseIncomingIdJustific;
    @XmlElement(name = "In4PayDhsseIncomingIdentifier")
    protected int in4PayDhsseIncomingIdentifier;
    @XmlElement(name = "In4PayDhsseIncomingIssDate")
    protected String in4PayDhsseIncomingIssDate;
    @XmlElement(name = "In4PayDhsseIncomingOnlTmstamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar in4PayDhsseIncomingOnlTmstamp;
    @XmlElement(name = "In4PayDhsseIncomingOnlTunDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar in4PayDhsseIncomingOnlTunDate;
    @XmlElement(name = "In4PayDhsseIncomingOnlTunInternalSn")
    protected short in4PayDhsseIncomingOnlTunInternalSn;
    @XmlElement(name = "In4PayDhsseIncomingOnlTunUnit")
    protected int in4PayDhsseIncomingOnlTunUnit;
    @XmlElement(name = "In4PayDhsseIncomingOnlTunUsr")
    protected String in4PayDhsseIncomingOnlTunUsr;
    @XmlElement(name = "In4PayDhsseIncomingOnlTunUsrSn")
    protected int in4PayDhsseIncomingOnlTunUsrSn;
    @XmlElement(name = "In4PayDhsseIncomingPayAccno")
    protected String in4PayDhsseIncomingPayAccno;
    @XmlElement(name = "In4PayDhsseIncomingPayBranch")
    protected String in4PayDhsseIncomingPayBranch;
    @XmlElement(name = "In4PayDhsseIncomingPayCurrency")
    protected String in4PayDhsseIncomingPayCurrency;
    @XmlElement(name = "In4PayDhsseIncomingSettleRef")
    protected String in4PayDhsseIncomingSettleRef;
    @XmlElement(name = "In4PayDhsseIncomingTranCode")
    protected String in4PayDhsseIncomingTranCode;
    @XmlElement(name = "In4PayDhsseIncomingTranDate")
    protected String in4PayDhsseIncomingTranDate;
    @XmlElement(name = "InAccCodeDhsseIncomingAccCode")
    protected String inAccCodeDhsseIncomingAccCode;
    @XmlElement(name = "InAccCurrencyCurrencyIdCurrency")
    protected int inAccCurrencyCurrencyIdCurrency;
    @XmlElement(name = "InAccCurrencyCurrencyShortDescr")
    protected String inAccCurrencyCurrencyShortDescr;
    @XmlElement(name = "InAccountUnitCode")
    protected int inAccountUnitCode;
    @XmlElement(name = "InAllUnitsIefSuppliedFlag")
    protected String inAllUnitsIefSuppliedFlag;
    @XmlElement(name = "InAuthResultTeamInformationAuthorisationResult")
    protected String inAuthResultTeamInformationAuthorisationResult;
    @XmlElement(name = "InAuthResultTeamInformationAuthorizationResult")
    protected String inAuthResultTeamInformationAuthorizationResult;
    @XmlElement(name = "InAuthResultTeamInformationSuper1Code")
    protected String inAuthResultTeamInformationSuper1Code;
    @XmlElement(name = "InAuthResultTeamInformationSuper2Code")
    protected String inAuthResultTeamInformationSuper2Code;
    @XmlElement(name = "InAuthorGrantedIefSuppliedFlag")
    protected String inAuthorGrantedIefSuppliedFlag;
    @XmlElement(name = "InChequeBookItemItemSerialNumber")
    protected double inChequeBookItemItemSerialNumber;
    @XmlElement(name = "InCommandIefSuppliedCommand")
    protected String inCommandIefSuppliedCommand;
    @XmlElement(name = "InCorrSendDateIefSuppliedDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inCorrSendDateIefSuppliedDate;
    @XmlElement(name = "InDiaerGenericDetailDescription")
    protected String inDiaerGenericDetailDescription;
    @XmlElement(name = "InDiaerGenericDetailSerialNum")
    protected int inDiaerGenericDetailSerialNum;
    @XmlElement(name = "InDlgAchBankCodeDhsseIncomingBuyBankCode")
    protected String inDlgAchBankCodeDhsseIncomingBuyBankCode;
    @XmlElement(name = "InDlgDhsseIncomingIbanDigits")
    protected String inDlgDhsseIncomingIbanDigits;
    @XmlElement(name = "InDlgDhsseIncomingIncludeInFile")
    protected String inDlgDhsseIncomingIncludeInFile;
    @XmlElement(name = "InDlgProfitsAccountAccountCd")
    protected short inDlgProfitsAccountAccountCd;
    @XmlElement(name = "InDlgProfitsAccountAccountNumber")
    protected String inDlgProfitsAccountAccountNumber;
    @XmlElement(name = "InDlgProfitsAccountPrftSystem")
    protected short inDlgProfitsAccountPrftSystem;
    @XmlElement(name = "InFinalIefSuppliedFlag")
    protected String inFinalIefSuppliedFlag;
    @XmlElement(name = "InLastDhsseIncomingChqNo")
    protected String inLastDhsseIncomingChqNo;
    @XmlElement(name = "InLastDhsseIncomingCorrSendDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inLastDhsseIncomingCorrSendDate;
    @XmlElement(name = "InLastDhsseIncomingIdentifier")
    protected int inLastDhsseIncomingIdentifier;
    @XmlElement(name = "InParametersInBankParametersEuroEchoDesc")
    protected String inParametersInBankParametersEuroEchoDesc;
    @XmlElement(name = "InParametersInBankParametersIbanFlag")
    protected String inParametersInBankParametersIbanFlag;
    @XmlElement(name = "InParametersInBankParametersMaxAmntRateTbl", required = true)
    protected BigDecimal inParametersInBankParametersMaxAmntRateTbl;
    @XmlElement(name = "InParametersInBankParametersRateUsage")
    protected String inParametersInBankParametersRateUsage;
    @XmlElement(name = "InParametersInTerminalTerminalNumber")
    protected String inParametersInTerminalTerminalNumber;
    @XmlElement(name = "InParametersInTrxCountTrxCounter")
    protected int inParametersInTrxCountTrxCounter;
    @XmlElement(name = "InParametersInUnitClearingHouseFlag")
    protected String inParametersInUnitClearingHouseFlag;
    @XmlElement(name = "InParametersInUnitCategoryGenericDetailSerialNum")
    protected int inParametersInUnitCategoryGenericDetailSerialNum;
    @XmlElement(name = "InParametersInUsrGlLevel")
    protected short inParametersInUsrGlLevel;
    @XmlElement(name = "InParametersInWorkDatesProductionDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inParametersInWorkDatesProductionDate;
    @XmlElement(name = "InParametersToBeDeletedCurrencyIdCurrency")
    protected int inParametersToBeDeletedCurrencyIdCurrency;
    @XmlElement(name = "InParametersToBeDeletedCurrencyShortDescr")
    protected String inParametersToBeDeletedCurrencyShortDescr;
    @XmlElement(name = "InParametersToBeDeletedSecRoleCode")
    protected int inParametersToBeDeletedSecRoleCode;
    @XmlElement(name = "InPrftTransactionDescription")
    protected String inPrftTransactionDescription;
    @XmlElement(name = "InPrftTransactionIdTransact")
    protected int inPrftTransactionIdTransact;
    @XmlElement(name = "InQueryDhsseIncomingChqNo")
    protected String inQueryDhsseIncomingChqNo;
    @XmlElement(name = "InQueryProfitsAccountAccountCd")
    protected short inQueryProfitsAccountAccountCd;
    @XmlElement(name = "InQueryProfitsAccountAccountNumber")
    protected String inQueryProfitsAccountAccountNumber;
    @XmlElement(name = "InRetrieveFlgIefSuppliedFlag")
    protected String inRetrieveFlgIefSuppliedFlag;
    @XmlElement(name = "InSsSecurityCmcbPrftSystem")
    protected short inSsSecurityCmcbPrftSystem;
    @XmlElement(name = "InSsSecurityCmcbTranCode")
    protected String inSsSecurityCmcbTranCode;
    @XmlElement(name = "InUnitFromUnitCode")
    protected int inUnitFromUnitCode;
    @XmlElement(name = "InUnitToUnitCode")
    protected int inUnitToUnitCode;
    @XmlElement(name = "InLastDhsseIncomingFileData")
    protected String inLastDhsseIncomingFileData;
    @XmlElement(name = "InLastDhsseIncomingUpdatedFileData")
    protected String inLastDhsseIncomingUpdatedFileData;

    /**
     * Gets the value of the in4PayBillBillAccountNumb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIn4PayBillBillAccountNumb() {
        return in4PayBillBillAccountNumb;
    }

    /**
     * Sets the value of the in4PayBillBillAccountNumb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIn4PayBillBillAccountNumb(String value) {
        this.in4PayBillBillAccountNumb = value;
    }

    /**
     * Gets the value of the in4PayBillBillAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getIn4PayBillBillAmount() {
        return in4PayBillBillAmount;
    }

    /**
     * Sets the value of the in4PayBillBillAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setIn4PayBillBillAmount(BigDecimal value) {
        this.in4PayBillBillAmount = value;
    }

    /**
     * Gets the value of the in4PayBillBillCheckDigit property.
     * 
     */
    public short getIn4PayBillBillCheckDigit() {
        return in4PayBillBillCheckDigit;
    }

    /**
     * Sets the value of the in4PayBillBillCheckDigit property.
     * 
     */
    public void setIn4PayBillBillCheckDigit(short value) {
        this.in4PayBillBillCheckDigit = value;
    }

    /**
     * Gets the value of the in4PayBillBillIssueDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getIn4PayBillBillIssueDate() {
        return in4PayBillBillIssueDate;
    }

    /**
     * Sets the value of the in4PayBillBillIssueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setIn4PayBillBillIssueDate(XMLGregorianCalendar value) {
        this.in4PayBillBillIssueDate = value;
    }

    /**
     * Gets the value of the in4PayDhsseIncomingAccCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIn4PayDhsseIncomingAccCode() {
        return in4PayDhsseIncomingAccCode;
    }

    /**
     * Sets the value of the in4PayDhsseIncomingAccCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIn4PayDhsseIncomingAccCode(String value) {
        this.in4PayDhsseIncomingAccCode = value;
    }

    /**
     * Gets the value of the in4PayDhsseIncomingAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIn4PayDhsseIncomingAmount() {
        return in4PayDhsseIncomingAmount;
    }

    /**
     * Sets the value of the in4PayDhsseIncomingAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIn4PayDhsseIncomingAmount(String value) {
        this.in4PayDhsseIncomingAmount = value;
    }

    /**
     * Gets the value of the in4PayDhsseIncomingBuyBankCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIn4PayDhsseIncomingBuyBankCode() {
        return in4PayDhsseIncomingBuyBankCode;
    }

    /**
     * Sets the value of the in4PayDhsseIncomingBuyBankCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIn4PayDhsseIncomingBuyBankCode(String value) {
        this.in4PayDhsseIncomingBuyBankCode = value;
    }

    /**
     * Gets the value of the in4PayDhsseIncomingBuyBranch property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIn4PayDhsseIncomingBuyBranch() {
        return in4PayDhsseIncomingBuyBranch;
    }

    /**
     * Sets the value of the in4PayDhsseIncomingBuyBranch property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIn4PayDhsseIncomingBuyBranch(String value) {
        this.in4PayDhsseIncomingBuyBranch = value;
    }

    /**
     * Gets the value of the in4PayDhsseIncomingChqNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIn4PayDhsseIncomingChqNo() {
        return in4PayDhsseIncomingChqNo;
    }

    /**
     * Sets the value of the in4PayDhsseIncomingChqNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIn4PayDhsseIncomingChqNo(String value) {
        this.in4PayDhsseIncomingChqNo = value;
    }

    /**
     * Gets the value of the in4PayDhsseIncomingCorrSendDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getIn4PayDhsseIncomingCorrSendDate() {
        return in4PayDhsseIncomingCorrSendDate;
    }

    /**
     * Sets the value of the in4PayDhsseIncomingCorrSendDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setIn4PayDhsseIncomingCorrSendDate(XMLGregorianCalendar value) {
        this.in4PayDhsseIncomingCorrSendDate = value;
    }

    /**
     * Gets the value of the in4PayDhsseIncomingCorrSettleDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getIn4PayDhsseIncomingCorrSettleDate() {
        return in4PayDhsseIncomingCorrSettleDate;
    }

    /**
     * Sets the value of the in4PayDhsseIncomingCorrSettleDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setIn4PayDhsseIncomingCorrSettleDate(XMLGregorianCalendar value) {
        this.in4PayDhsseIncomingCorrSettleDate = value;
    }

    /**
     * Gets the value of the in4PayDhsseIncomingDhsseRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIn4PayDhsseIncomingDhsseRef() {
        return in4PayDhsseIncomingDhsseRef;
    }

    /**
     * Sets the value of the in4PayDhsseIncomingDhsseRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIn4PayDhsseIncomingDhsseRef(String value) {
        this.in4PayDhsseIncomingDhsseRef = value;
    }

    /**
     * Gets the value of the in4PayDhsseIncomingEntryStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIn4PayDhsseIncomingEntryStatus() {
        return in4PayDhsseIncomingEntryStatus;
    }

    /**
     * Sets the value of the in4PayDhsseIncomingEntryStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIn4PayDhsseIncomingEntryStatus(String value) {
        this.in4PayDhsseIncomingEntryStatus = value;
    }

    /**
     * Gets the value of the in4PayDhsseIncomingFilename property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIn4PayDhsseIncomingFilename() {
        return in4PayDhsseIncomingFilename;
    }

    /**
     * Sets the value of the in4PayDhsseIncomingFilename property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIn4PayDhsseIncomingFilename(String value) {
        this.in4PayDhsseIncomingFilename = value;
    }

    /**
     * Gets the value of the in4PayDhsseIncomingIbanCd property.
     * 
     */
    public short getIn4PayDhsseIncomingIbanCd() {
        return in4PayDhsseIncomingIbanCd;
    }

    /**
     * Sets the value of the in4PayDhsseIncomingIbanCd property.
     * 
     */
    public void setIn4PayDhsseIncomingIbanCd(short value) {
        this.in4PayDhsseIncomingIbanCd = value;
    }

    /**
     * Gets the value of the in4PayDhsseIncomingIbanCntry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIn4PayDhsseIncomingIbanCntry() {
        return in4PayDhsseIncomingIbanCntry;
    }

    /**
     * Sets the value of the in4PayDhsseIncomingIbanCntry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIn4PayDhsseIncomingIbanCntry(String value) {
        this.in4PayDhsseIncomingIbanCntry = value;
    }

    /**
     * Gets the value of the in4PayDhsseIncomingIbanDigits property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIn4PayDhsseIncomingIbanDigits() {
        return in4PayDhsseIncomingIbanDigits;
    }

    /**
     * Sets the value of the in4PayDhsseIncomingIbanDigits property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIn4PayDhsseIncomingIbanDigits(String value) {
        this.in4PayDhsseIncomingIbanDigits = value;
    }

    /**
     * Gets the value of the in4PayDhsseIncomingIdJustific property.
     * 
     */
    public int getIn4PayDhsseIncomingIdJustific() {
        return in4PayDhsseIncomingIdJustific;
    }

    /**
     * Sets the value of the in4PayDhsseIncomingIdJustific property.
     * 
     */
    public void setIn4PayDhsseIncomingIdJustific(int value) {
        this.in4PayDhsseIncomingIdJustific = value;
    }

    /**
     * Gets the value of the in4PayDhsseIncomingIdentifier property.
     * 
     */
    public int getIn4PayDhsseIncomingIdentifier() {
        return in4PayDhsseIncomingIdentifier;
    }

    /**
     * Sets the value of the in4PayDhsseIncomingIdentifier property.
     * 
     */
    public void setIn4PayDhsseIncomingIdentifier(int value) {
        this.in4PayDhsseIncomingIdentifier = value;
    }

    /**
     * Gets the value of the in4PayDhsseIncomingIssDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIn4PayDhsseIncomingIssDate() {
        return in4PayDhsseIncomingIssDate;
    }

    /**
     * Sets the value of the in4PayDhsseIncomingIssDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIn4PayDhsseIncomingIssDate(String value) {
        this.in4PayDhsseIncomingIssDate = value;
    }

    /**
     * Gets the value of the in4PayDhsseIncomingOnlTmstamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getIn4PayDhsseIncomingOnlTmstamp() {
        return in4PayDhsseIncomingOnlTmstamp;
    }

    /**
     * Sets the value of the in4PayDhsseIncomingOnlTmstamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setIn4PayDhsseIncomingOnlTmstamp(XMLGregorianCalendar value) {
        this.in4PayDhsseIncomingOnlTmstamp = value;
    }

    /**
     * Gets the value of the in4PayDhsseIncomingOnlTunDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getIn4PayDhsseIncomingOnlTunDate() {
        return in4PayDhsseIncomingOnlTunDate;
    }

    /**
     * Sets the value of the in4PayDhsseIncomingOnlTunDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setIn4PayDhsseIncomingOnlTunDate(XMLGregorianCalendar value) {
        this.in4PayDhsseIncomingOnlTunDate = value;
    }

    /**
     * Gets the value of the in4PayDhsseIncomingOnlTunInternalSn property.
     * 
     */
    public short getIn4PayDhsseIncomingOnlTunInternalSn() {
        return in4PayDhsseIncomingOnlTunInternalSn;
    }

    /**
     * Sets the value of the in4PayDhsseIncomingOnlTunInternalSn property.
     * 
     */
    public void setIn4PayDhsseIncomingOnlTunInternalSn(short value) {
        this.in4PayDhsseIncomingOnlTunInternalSn = value;
    }

    /**
     * Gets the value of the in4PayDhsseIncomingOnlTunUnit property.
     * 
     */
    public int getIn4PayDhsseIncomingOnlTunUnit() {
        return in4PayDhsseIncomingOnlTunUnit;
    }

    /**
     * Sets the value of the in4PayDhsseIncomingOnlTunUnit property.
     * 
     */
    public void setIn4PayDhsseIncomingOnlTunUnit(int value) {
        this.in4PayDhsseIncomingOnlTunUnit = value;
    }

    /**
     * Gets the value of the in4PayDhsseIncomingOnlTunUsr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIn4PayDhsseIncomingOnlTunUsr() {
        return in4PayDhsseIncomingOnlTunUsr;
    }

    /**
     * Sets the value of the in4PayDhsseIncomingOnlTunUsr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIn4PayDhsseIncomingOnlTunUsr(String value) {
        this.in4PayDhsseIncomingOnlTunUsr = value;
    }

    /**
     * Gets the value of the in4PayDhsseIncomingOnlTunUsrSn property.
     * 
     */
    public int getIn4PayDhsseIncomingOnlTunUsrSn() {
        return in4PayDhsseIncomingOnlTunUsrSn;
    }

    /**
     * Sets the value of the in4PayDhsseIncomingOnlTunUsrSn property.
     * 
     */
    public void setIn4PayDhsseIncomingOnlTunUsrSn(int value) {
        this.in4PayDhsseIncomingOnlTunUsrSn = value;
    }

    /**
     * Gets the value of the in4PayDhsseIncomingPayAccno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIn4PayDhsseIncomingPayAccno() {
        return in4PayDhsseIncomingPayAccno;
    }

    /**
     * Sets the value of the in4PayDhsseIncomingPayAccno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIn4PayDhsseIncomingPayAccno(String value) {
        this.in4PayDhsseIncomingPayAccno = value;
    }

    /**
     * Gets the value of the in4PayDhsseIncomingPayBranch property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIn4PayDhsseIncomingPayBranch() {
        return in4PayDhsseIncomingPayBranch;
    }

    /**
     * Sets the value of the in4PayDhsseIncomingPayBranch property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIn4PayDhsseIncomingPayBranch(String value) {
        this.in4PayDhsseIncomingPayBranch = value;
    }

    /**
     * Gets the value of the in4PayDhsseIncomingPayCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIn4PayDhsseIncomingPayCurrency() {
        return in4PayDhsseIncomingPayCurrency;
    }

    /**
     * Sets the value of the in4PayDhsseIncomingPayCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIn4PayDhsseIncomingPayCurrency(String value) {
        this.in4PayDhsseIncomingPayCurrency = value;
    }

    /**
     * Gets the value of the in4PayDhsseIncomingSettleRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIn4PayDhsseIncomingSettleRef() {
        return in4PayDhsseIncomingSettleRef;
    }

    /**
     * Sets the value of the in4PayDhsseIncomingSettleRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIn4PayDhsseIncomingSettleRef(String value) {
        this.in4PayDhsseIncomingSettleRef = value;
    }

    /**
     * Gets the value of the in4PayDhsseIncomingTranCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIn4PayDhsseIncomingTranCode() {
        return in4PayDhsseIncomingTranCode;
    }

    /**
     * Sets the value of the in4PayDhsseIncomingTranCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIn4PayDhsseIncomingTranCode(String value) {
        this.in4PayDhsseIncomingTranCode = value;
    }

    /**
     * Gets the value of the in4PayDhsseIncomingTranDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIn4PayDhsseIncomingTranDate() {
        return in4PayDhsseIncomingTranDate;
    }

    /**
     * Sets the value of the in4PayDhsseIncomingTranDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIn4PayDhsseIncomingTranDate(String value) {
        this.in4PayDhsseIncomingTranDate = value;
    }

    /**
     * Gets the value of the inAccCodeDhsseIncomingAccCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInAccCodeDhsseIncomingAccCode() {
        return inAccCodeDhsseIncomingAccCode;
    }

    /**
     * Sets the value of the inAccCodeDhsseIncomingAccCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInAccCodeDhsseIncomingAccCode(String value) {
        this.inAccCodeDhsseIncomingAccCode = value;
    }

    /**
     * Gets the value of the inAccCurrencyCurrencyIdCurrency property.
     * 
     */
    public int getInAccCurrencyCurrencyIdCurrency() {
        return inAccCurrencyCurrencyIdCurrency;
    }

    /**
     * Sets the value of the inAccCurrencyCurrencyIdCurrency property.
     * 
     */
    public void setInAccCurrencyCurrencyIdCurrency(int value) {
        this.inAccCurrencyCurrencyIdCurrency = value;
    }

    /**
     * Gets the value of the inAccCurrencyCurrencyShortDescr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInAccCurrencyCurrencyShortDescr() {
        return inAccCurrencyCurrencyShortDescr;
    }

    /**
     * Sets the value of the inAccCurrencyCurrencyShortDescr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInAccCurrencyCurrencyShortDescr(String value) {
        this.inAccCurrencyCurrencyShortDescr = value;
    }

    /**
     * Gets the value of the inAccountUnitCode property.
     * 
     */
    public int getInAccountUnitCode() {
        return inAccountUnitCode;
    }

    /**
     * Sets the value of the inAccountUnitCode property.
     * 
     */
    public void setInAccountUnitCode(int value) {
        this.inAccountUnitCode = value;
    }

    /**
     * Gets the value of the inAllUnitsIefSuppliedFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInAllUnitsIefSuppliedFlag() {
        return inAllUnitsIefSuppliedFlag;
    }

    /**
     * Sets the value of the inAllUnitsIefSuppliedFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInAllUnitsIefSuppliedFlag(String value) {
        this.inAllUnitsIefSuppliedFlag = value;
    }

    /**
     * Gets the value of the inAuthResultTeamInformationAuthorisationResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInAuthResultTeamInformationAuthorisationResult() {
        return inAuthResultTeamInformationAuthorisationResult;
    }

    /**
     * Sets the value of the inAuthResultTeamInformationAuthorisationResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInAuthResultTeamInformationAuthorisationResult(String value) {
        this.inAuthResultTeamInformationAuthorisationResult = value;
    }

    /**
     * Gets the value of the inAuthResultTeamInformationAuthorizationResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInAuthResultTeamInformationAuthorizationResult() {
        return inAuthResultTeamInformationAuthorizationResult;
    }

    /**
     * Sets the value of the inAuthResultTeamInformationAuthorizationResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInAuthResultTeamInformationAuthorizationResult(String value) {
        this.inAuthResultTeamInformationAuthorizationResult = value;
    }

    /**
     * Gets the value of the inAuthResultTeamInformationSuper1Code property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInAuthResultTeamInformationSuper1Code() {
        return inAuthResultTeamInformationSuper1Code;
    }

    /**
     * Sets the value of the inAuthResultTeamInformationSuper1Code property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInAuthResultTeamInformationSuper1Code(String value) {
        this.inAuthResultTeamInformationSuper1Code = value;
    }

    /**
     * Gets the value of the inAuthResultTeamInformationSuper2Code property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInAuthResultTeamInformationSuper2Code() {
        return inAuthResultTeamInformationSuper2Code;
    }

    /**
     * Sets the value of the inAuthResultTeamInformationSuper2Code property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInAuthResultTeamInformationSuper2Code(String value) {
        this.inAuthResultTeamInformationSuper2Code = value;
    }

    /**
     * Gets the value of the inAuthorGrantedIefSuppliedFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInAuthorGrantedIefSuppliedFlag() {
        return inAuthorGrantedIefSuppliedFlag;
    }

    /**
     * Sets the value of the inAuthorGrantedIefSuppliedFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInAuthorGrantedIefSuppliedFlag(String value) {
        this.inAuthorGrantedIefSuppliedFlag = value;
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
     * Gets the value of the inCorrSendDateIefSuppliedDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInCorrSendDateIefSuppliedDate() {
        return inCorrSendDateIefSuppliedDate;
    }

    /**
     * Sets the value of the inCorrSendDateIefSuppliedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInCorrSendDateIefSuppliedDate(XMLGregorianCalendar value) {
        this.inCorrSendDateIefSuppliedDate = value;
    }

    /**
     * Gets the value of the inDiaerGenericDetailDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInDiaerGenericDetailDescription() {
        return inDiaerGenericDetailDescription;
    }

    /**
     * Sets the value of the inDiaerGenericDetailDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInDiaerGenericDetailDescription(String value) {
        this.inDiaerGenericDetailDescription = value;
    }

    /**
     * Gets the value of the inDiaerGenericDetailSerialNum property.
     * 
     */
    public int getInDiaerGenericDetailSerialNum() {
        return inDiaerGenericDetailSerialNum;
    }

    /**
     * Sets the value of the inDiaerGenericDetailSerialNum property.
     * 
     */
    public void setInDiaerGenericDetailSerialNum(int value) {
        this.inDiaerGenericDetailSerialNum = value;
    }

    /**
     * Gets the value of the inDlgAchBankCodeDhsseIncomingBuyBankCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInDlgAchBankCodeDhsseIncomingBuyBankCode() {
        return inDlgAchBankCodeDhsseIncomingBuyBankCode;
    }

    /**
     * Sets the value of the inDlgAchBankCodeDhsseIncomingBuyBankCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInDlgAchBankCodeDhsseIncomingBuyBankCode(String value) {
        this.inDlgAchBankCodeDhsseIncomingBuyBankCode = value;
    }

    /**
     * Gets the value of the inDlgDhsseIncomingIbanDigits property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInDlgDhsseIncomingIbanDigits() {
        return inDlgDhsseIncomingIbanDigits;
    }

    /**
     * Sets the value of the inDlgDhsseIncomingIbanDigits property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInDlgDhsseIncomingIbanDigits(String value) {
        this.inDlgDhsseIncomingIbanDigits = value;
    }

    /**
     * Gets the value of the inDlgDhsseIncomingIncludeInFile property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInDlgDhsseIncomingIncludeInFile() {
        return inDlgDhsseIncomingIncludeInFile;
    }

    /**
     * Sets the value of the inDlgDhsseIncomingIncludeInFile property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInDlgDhsseIncomingIncludeInFile(String value) {
        this.inDlgDhsseIncomingIncludeInFile = value;
    }

    /**
     * Gets the value of the inDlgProfitsAccountAccountCd property.
     * 
     */
    public short getInDlgProfitsAccountAccountCd() {
        return inDlgProfitsAccountAccountCd;
    }

    /**
     * Sets the value of the inDlgProfitsAccountAccountCd property.
     * 
     */
    public void setInDlgProfitsAccountAccountCd(short value) {
        this.inDlgProfitsAccountAccountCd = value;
    }

    /**
     * Gets the value of the inDlgProfitsAccountAccountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInDlgProfitsAccountAccountNumber() {
        return inDlgProfitsAccountAccountNumber;
    }

    /**
     * Sets the value of the inDlgProfitsAccountAccountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInDlgProfitsAccountAccountNumber(String value) {
        this.inDlgProfitsAccountAccountNumber = value;
    }

    /**
     * Gets the value of the inDlgProfitsAccountPrftSystem property.
     * 
     */
    public short getInDlgProfitsAccountPrftSystem() {
        return inDlgProfitsAccountPrftSystem;
    }

    /**
     * Sets the value of the inDlgProfitsAccountPrftSystem property.
     * 
     */
    public void setInDlgProfitsAccountPrftSystem(short value) {
        this.inDlgProfitsAccountPrftSystem = value;
    }

    /**
     * Gets the value of the inFinalIefSuppliedFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInFinalIefSuppliedFlag() {
        return inFinalIefSuppliedFlag;
    }

    /**
     * Sets the value of the inFinalIefSuppliedFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInFinalIefSuppliedFlag(String value) {
        this.inFinalIefSuppliedFlag = value;
    }

    /**
     * Gets the value of the inLastDhsseIncomingChqNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInLastDhsseIncomingChqNo() {
        return inLastDhsseIncomingChqNo;
    }

    /**
     * Sets the value of the inLastDhsseIncomingChqNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInLastDhsseIncomingChqNo(String value) {
        this.inLastDhsseIncomingChqNo = value;
    }

    /**
     * Gets the value of the inLastDhsseIncomingCorrSendDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInLastDhsseIncomingCorrSendDate() {
        return inLastDhsseIncomingCorrSendDate;
    }

    /**
     * Sets the value of the inLastDhsseIncomingCorrSendDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInLastDhsseIncomingCorrSendDate(XMLGregorianCalendar value) {
        this.inLastDhsseIncomingCorrSendDate = value;
    }

    /**
     * Gets the value of the inLastDhsseIncomingIdentifier property.
     * 
     */
    public int getInLastDhsseIncomingIdentifier() {
        return inLastDhsseIncomingIdentifier;
    }

    /**
     * Sets the value of the inLastDhsseIncomingIdentifier property.
     * 
     */
    public void setInLastDhsseIncomingIdentifier(int value) {
        this.inLastDhsseIncomingIdentifier = value;
    }

    /**
     * Gets the value of the inParametersInBankParametersEuroEchoDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInParametersInBankParametersEuroEchoDesc() {
        return inParametersInBankParametersEuroEchoDesc;
    }

    /**
     * Sets the value of the inParametersInBankParametersEuroEchoDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInParametersInBankParametersEuroEchoDesc(String value) {
        this.inParametersInBankParametersEuroEchoDesc = value;
    }

    /**
     * Gets the value of the inParametersInBankParametersIbanFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInParametersInBankParametersIbanFlag() {
        return inParametersInBankParametersIbanFlag;
    }

    /**
     * Sets the value of the inParametersInBankParametersIbanFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInParametersInBankParametersIbanFlag(String value) {
        this.inParametersInBankParametersIbanFlag = value;
    }

    /**
     * Gets the value of the inParametersInBankParametersMaxAmntRateTbl property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInParametersInBankParametersMaxAmntRateTbl() {
        return inParametersInBankParametersMaxAmntRateTbl;
    }

    /**
     * Sets the value of the inParametersInBankParametersMaxAmntRateTbl property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInParametersInBankParametersMaxAmntRateTbl(BigDecimal value) {
        this.inParametersInBankParametersMaxAmntRateTbl = value;
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
     * Gets the value of the inParametersInTrxCountTrxCounter property.
     * 
     */
    public int getInParametersInTrxCountTrxCounter() {
        return inParametersInTrxCountTrxCounter;
    }

    /**
     * Sets the value of the inParametersInTrxCountTrxCounter property.
     * 
     */
    public void setInParametersInTrxCountTrxCounter(int value) {
        this.inParametersInTrxCountTrxCounter = value;
    }

    /**
     * Gets the value of the inParametersInUnitClearingHouseFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInParametersInUnitClearingHouseFlag() {
        return inParametersInUnitClearingHouseFlag;
    }

    /**
     * Sets the value of the inParametersInUnitClearingHouseFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInParametersInUnitClearingHouseFlag(String value) {
        this.inParametersInUnitClearingHouseFlag = value;
    }

    /**
     * Gets the value of the inParametersInUnitCategoryGenericDetailSerialNum property.
     * 
     */
    public int getInParametersInUnitCategoryGenericDetailSerialNum() {
        return inParametersInUnitCategoryGenericDetailSerialNum;
    }

    /**
     * Sets the value of the inParametersInUnitCategoryGenericDetailSerialNum property.
     * 
     */
    public void setInParametersInUnitCategoryGenericDetailSerialNum(int value) {
        this.inParametersInUnitCategoryGenericDetailSerialNum = value;
    }

    /**
     * Gets the value of the inParametersInUsrGlLevel property.
     * 
     */
    public short getInParametersInUsrGlLevel() {
        return inParametersInUsrGlLevel;
    }

    /**
     * Sets the value of the inParametersInUsrGlLevel property.
     * 
     */
    public void setInParametersInUsrGlLevel(short value) {
        this.inParametersInUsrGlLevel = value;
    }

    /**
     * Gets the value of the inParametersInWorkDatesProductionDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInParametersInWorkDatesProductionDate() {
        return inParametersInWorkDatesProductionDate;
    }

    /**
     * Sets the value of the inParametersInWorkDatesProductionDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInParametersInWorkDatesProductionDate(XMLGregorianCalendar value) {
        this.inParametersInWorkDatesProductionDate = value;
    }

    /**
     * Gets the value of the inParametersToBeDeletedCurrencyIdCurrency property.
     * 
     */
    public int getInParametersToBeDeletedCurrencyIdCurrency() {
        return inParametersToBeDeletedCurrencyIdCurrency;
    }

    /**
     * Sets the value of the inParametersToBeDeletedCurrencyIdCurrency property.
     * 
     */
    public void setInParametersToBeDeletedCurrencyIdCurrency(int value) {
        this.inParametersToBeDeletedCurrencyIdCurrency = value;
    }

    /**
     * Gets the value of the inParametersToBeDeletedCurrencyShortDescr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInParametersToBeDeletedCurrencyShortDescr() {
        return inParametersToBeDeletedCurrencyShortDescr;
    }

    /**
     * Sets the value of the inParametersToBeDeletedCurrencyShortDescr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInParametersToBeDeletedCurrencyShortDescr(String value) {
        this.inParametersToBeDeletedCurrencyShortDescr = value;
    }

    /**
     * Gets the value of the inParametersToBeDeletedSecRoleCode property.
     * 
     */
    public int getInParametersToBeDeletedSecRoleCode() {
        return inParametersToBeDeletedSecRoleCode;
    }

    /**
     * Sets the value of the inParametersToBeDeletedSecRoleCode property.
     * 
     */
    public void setInParametersToBeDeletedSecRoleCode(int value) {
        this.inParametersToBeDeletedSecRoleCode = value;
    }

    /**
     * Gets the value of the inPrftTransactionDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInPrftTransactionDescription() {
        return inPrftTransactionDescription;
    }

    /**
     * Sets the value of the inPrftTransactionDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInPrftTransactionDescription(String value) {
        this.inPrftTransactionDescription = value;
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
     * Gets the value of the inQueryDhsseIncomingChqNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInQueryDhsseIncomingChqNo() {
        return inQueryDhsseIncomingChqNo;
    }

    /**
     * Sets the value of the inQueryDhsseIncomingChqNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInQueryDhsseIncomingChqNo(String value) {
        this.inQueryDhsseIncomingChqNo = value;
    }

    /**
     * Gets the value of the inQueryProfitsAccountAccountCd property.
     * 
     */
    public short getInQueryProfitsAccountAccountCd() {
        return inQueryProfitsAccountAccountCd;
    }

    /**
     * Sets the value of the inQueryProfitsAccountAccountCd property.
     * 
     */
    public void setInQueryProfitsAccountAccountCd(short value) {
        this.inQueryProfitsAccountAccountCd = value;
    }

    /**
     * Gets the value of the inQueryProfitsAccountAccountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInQueryProfitsAccountAccountNumber() {
        return inQueryProfitsAccountAccountNumber;
    }

    /**
     * Sets the value of the inQueryProfitsAccountAccountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInQueryProfitsAccountAccountNumber(String value) {
        this.inQueryProfitsAccountAccountNumber = value;
    }

    /**
     * Gets the value of the inRetrieveFlgIefSuppliedFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInRetrieveFlgIefSuppliedFlag() {
        return inRetrieveFlgIefSuppliedFlag;
    }

    /**
     * Sets the value of the inRetrieveFlgIefSuppliedFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInRetrieveFlgIefSuppliedFlag(String value) {
        this.inRetrieveFlgIefSuppliedFlag = value;
    }

    /**
     * Gets the value of the inSsSecurityCmcbPrftSystem property.
     * 
     */
    public short getInSsSecurityCmcbPrftSystem() {
        return inSsSecurityCmcbPrftSystem;
    }

    /**
     * Sets the value of the inSsSecurityCmcbPrftSystem property.
     * 
     */
    public void setInSsSecurityCmcbPrftSystem(short value) {
        this.inSsSecurityCmcbPrftSystem = value;
    }

    /**
     * Gets the value of the inSsSecurityCmcbTranCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInSsSecurityCmcbTranCode() {
        return inSsSecurityCmcbTranCode;
    }

    /**
     * Sets the value of the inSsSecurityCmcbTranCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInSsSecurityCmcbTranCode(String value) {
        this.inSsSecurityCmcbTranCode = value;
    }

    /**
     * Gets the value of the inUnitFromUnitCode property.
     * 
     */
    public int getInUnitFromUnitCode() {
        return inUnitFromUnitCode;
    }

    /**
     * Sets the value of the inUnitFromUnitCode property.
     * 
     */
    public void setInUnitFromUnitCode(int value) {
        this.inUnitFromUnitCode = value;
    }

    /**
     * Gets the value of the inUnitToUnitCode property.
     * 
     */
    public int getInUnitToUnitCode() {
        return inUnitToUnitCode;
    }

    /**
     * Sets the value of the inUnitToUnitCode property.
     * 
     */
    public void setInUnitToUnitCode(int value) {
        this.inUnitToUnitCode = value;
    }

    /**
     * Gets the value of the inLastDhsseIncomingFileData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInLastDhsseIncomingFileData() {
        return inLastDhsseIncomingFileData;
    }

    /**
     * Sets the value of the inLastDhsseIncomingFileData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInLastDhsseIncomingFileData(String value) {
        this.inLastDhsseIncomingFileData = value;
    }

    /**
     * Gets the value of the inLastDhsseIncomingUpdatedFileData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInLastDhsseIncomingUpdatedFileData() {
        return inLastDhsseIncomingUpdatedFileData;
    }

    /**
     * Sets the value of the inLastDhsseIncomingUpdatedFileData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInLastDhsseIncomingUpdatedFileData(String value) {
        this.inLastDhsseIncomingUpdatedFileData = value;
    }

}
