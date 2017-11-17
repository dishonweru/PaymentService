
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for BillsChequeUploadImport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BillsChequeUploadImport">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}BaseImport">
 *       &lt;sequence>
 *         &lt;element name="ProfitsAccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProfitsAccountCd" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InAuthResultTeamInformationAuthorizationResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InAuthResultTeamInformationSuper1Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InAuthResultTeamInformationSuper2Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InBatchIefSuppliedFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InBillBillAccountNumb" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InBillBillAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InBillBillBarcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InBillBillBranchCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InBillBillCheckDigit" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InBillBillClrtypeFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InBillBillCommDiscount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InBillBillExpDiscount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InBillBillIbanCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InBillBillIssueDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InBillBillNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InBillBillOwnbankFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InBillBillSerialNum" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="InBillBillSpecialChars" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InBillBillTypeFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InBillClrAgentCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InBillCpAgreementNo" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="InBillCpDataField1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InBillCpDataField2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InBillCpDataField3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InBillCpDataField4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InBillIssuerBissCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InBillMassRegisterBmasBillanalFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InBillMassRegisterBmasCarrierId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InBillMassRegisterBmasCarrierName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InBillMassRegisterBmasCarrierNotes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InBillMassRegisterBmasCarrierTitle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InBillMassRegisterBmasEntryStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InBillMassRegisterBmasFinalDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InBillMassRegisterBmasInsDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InBillMassRegisterBmasRefNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InBillMassRegisterBmasSerialNum" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="InBillMassRegisterBmasTotbillAmnt" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InBillMassRegisterBmasTotbillCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InBillMassRegisterCommDiscount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InBillMassRegisterExpaccCd" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InBillMassRegisterExpaccInterdate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InBillMassRegisterExpaccNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InBillMassRegisterExpaccPrfsys" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InBillMassRegisterExpDiscount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InBillMassRegisterTmstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InBillTempDeleteIefSuppliedFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCollaborationBanksBankId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InCommandIefSuppliedCommand" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCustomerCDigit" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InCustomerCustId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InDepositAccountAccountNumber" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="InFinalIefSuppliedFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InLastBillBillSerialNum" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="InLastBillMassregSegmMassegSerialNum" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="InParametersInUnitClearingHouseFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InParametersToBeDeletedSecRoleCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InParametersInBankParametersEuroEchoDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InParametersInBankemployeeFirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InParametersInUsrGlLevel" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InParametersInBankParametersIbanFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InParametersToBeDeletedCurrencyIdCurrency" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InParametersInBankemployeeLastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InParametersInBankParametersMaxAmntRateTbl" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InParametersInUsrPassword" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InParametersInWorkDatesProductionDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InParametersInBankParametersRateUsage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InParametersInUnitCategoryGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InParametersToBeDeletedCurrencyShortDescr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InParametersInBankParametersSwiftAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InParametersInBankParametersTaxRegNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InParametersInTerminalTerminalNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InParametersInTrxCountTrxCounter" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InParametersInUnitUnitName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InPrftTransactionDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InPrftTransactionIdTransact" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InProductIdProduct" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InRegUnitCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InSelectedProfitsAccountAccountCd" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InSelectedProfitsAccountAccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InSelectedProfitsAccountPrftSystem" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InSsSecurityCmcbPrftSystem" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InSsSecurityCmcbTranCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InTmstampBillTmpPTmstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InBillGrpSs" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}ArrayOfInBillGrpSs" minOccurs="0"/>
 *         &lt;element name="InKillBillGrp" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}ArrayOfInKillBillGrp" minOccurs="0"/>
 *         &lt;element name="InOwnbankUnpaid" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}ArrayOfInOwnbankUnpaid" minOccurs="0"/>
 *         &lt;element name="InRegSegmGrp" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}ArrayOfInRegSegmGrp" minOccurs="0"/>
 *         &lt;element name="InBillMassRegisterBmasRegCcy" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InCurrencyIdCurrency" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InCurrencyShortDescr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InPayCurrencyIdCurrency" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InPayCurrencyShortDescr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InClearingAgentAgentCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InBillBillJustificId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InAuthorGrantedIefSuppliedFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BillsChequeUploadImport", propOrder = {
    "profitsAccountNumber",
    "profitsAccountCd",
    "inAuthResultTeamInformationAuthorizationResult",
    "inAuthResultTeamInformationSuper1Code",
    "inAuthResultTeamInformationSuper2Code",
    "inBatchIefSuppliedFlag",
    "inBillBillAccountNumb",
    "inBillBillAmount",
    "inBillBillBarcode",
    "inBillBillBranchCode",
    "inBillBillCheckDigit",
    "inBillBillClrtypeFlag",
    "inBillBillCommDiscount",
    "inBillBillExpDiscount",
    "inBillBillIbanCode",
    "inBillBillIssueDate",
    "inBillBillNumber",
    "inBillBillOwnbankFlag",
    "inBillBillSerialNum",
    "inBillBillSpecialChars",
    "inBillBillTypeFlag",
    "inBillClrAgentCode",
    "inBillCpAgreementNo",
    "inBillCpDataField1",
    "inBillCpDataField2",
    "inBillCpDataField3",
    "inBillCpDataField4",
    "inBillIssuerBissCode",
    "inBillMassRegisterBmasBillanalFlag",
    "inBillMassRegisterBmasCarrierId",
    "inBillMassRegisterBmasCarrierName",
    "inBillMassRegisterBmasCarrierNotes",
    "inBillMassRegisterBmasCarrierTitle",
    "inBillMassRegisterBmasEntryStatus",
    "inBillMassRegisterBmasFinalDate",
    "inBillMassRegisterBmasInsDate",
    "inBillMassRegisterBmasRefNo",
    "inBillMassRegisterBmasSerialNum",
    "inBillMassRegisterBmasTotbillAmnt",
    "inBillMassRegisterBmasTotbillCount",
    "inBillMassRegisterCommDiscount",
    "inBillMassRegisterExpaccCd",
    "inBillMassRegisterExpaccInterdate",
    "inBillMassRegisterExpaccNumber",
    "inBillMassRegisterExpaccPrfsys",
    "inBillMassRegisterExpDiscount",
    "inBillMassRegisterTmstamp",
    "inBillTempDeleteIefSuppliedFlag",
    "inCollaborationBanksBankId",
    "inCommandIefSuppliedCommand",
    "inCustomerCDigit",
    "inCustomerCustId",
    "inDepositAccountAccountNumber",
    "inFinalIefSuppliedFlag",
    "inLastBillBillSerialNum",
    "inLastBillMassregSegmMassegSerialNum",
    "inParametersInUnitClearingHouseFlag",
    "inParametersToBeDeletedSecRoleCode",
    "inParametersInBankParametersEuroEchoDesc",
    "inParametersInBankemployeeFirstName",
    "inParametersInUsrGlLevel",
    "inParametersInBankParametersIbanFlag",
    "inParametersToBeDeletedCurrencyIdCurrency",
    "inParametersInBankemployeeLastName",
    "inParametersInBankParametersMaxAmntRateTbl",
    "inParametersInUsrPassword",
    "inParametersInWorkDatesProductionDate",
    "inParametersInBankParametersRateUsage",
    "inParametersInUnitCategoryGenericDetailSerialNum",
    "inParametersToBeDeletedCurrencyShortDescr",
    "inParametersInBankParametersSwiftAddress",
    "inParametersInBankParametersTaxRegNo",
    "inParametersInTerminalTerminalNumber",
    "inParametersInTrxCountTrxCounter",
    "inParametersInUnitUnitName",
    "inPrftTransactionDescription",
    "inPrftTransactionIdTransact",
    "inProductIdProduct",
    "inRegUnitCode",
    "inSelectedProfitsAccountAccountCd",
    "inSelectedProfitsAccountAccountNumber",
    "inSelectedProfitsAccountPrftSystem",
    "inSsSecurityCmcbPrftSystem",
    "inSsSecurityCmcbTranCode",
    "inTmstampBillTmpPTmstamp",
    "inBillGrpSs",
    "inKillBillGrp",
    "inOwnbankUnpaid",
    "inRegSegmGrp",
    "inBillMassRegisterBmasRegCcy",
    "inCurrencyIdCurrency",
    "inCurrencyShortDescr",
    "inPayCurrencyIdCurrency",
    "inPayCurrencyShortDescr",
    "inClearingAgentAgentCode",
    "inBillBillJustificId",
    "inAuthorGrantedIefSuppliedFlag"
})
public class BillsChequeUploadImport
    extends BaseImport
{

    @XmlElement(name = "ProfitsAccountNumber")
    protected String profitsAccountNumber;
    @XmlElement(name = "ProfitsAccountCd")
    protected short profitsAccountCd;
    @XmlElement(name = "InAuthResultTeamInformationAuthorizationResult")
    protected String inAuthResultTeamInformationAuthorizationResult;
    @XmlElement(name = "InAuthResultTeamInformationSuper1Code")
    protected String inAuthResultTeamInformationSuper1Code;
    @XmlElement(name = "InAuthResultTeamInformationSuper2Code")
    protected String inAuthResultTeamInformationSuper2Code;
    @XmlElement(name = "InBatchIefSuppliedFlag")
    protected String inBatchIefSuppliedFlag;
    @XmlElement(name = "InBillBillAccountNumb")
    protected String inBillBillAccountNumb;
    @XmlElement(name = "InBillBillAmount", required = true)
    protected BigDecimal inBillBillAmount;
    @XmlElement(name = "InBillBillBarcode")
    protected String inBillBillBarcode;
    @XmlElement(name = "InBillBillBranchCode")
    protected String inBillBillBranchCode;
    @XmlElement(name = "InBillBillCheckDigit")
    protected short inBillBillCheckDigit;
    @XmlElement(name = "InBillBillClrtypeFlag")
    protected String inBillBillClrtypeFlag;
    @XmlElement(name = "InBillBillCommDiscount", required = true)
    protected BigDecimal inBillBillCommDiscount;
    @XmlElement(name = "InBillBillExpDiscount", required = true)
    protected BigDecimal inBillBillExpDiscount;
    @XmlElement(name = "InBillBillIbanCode")
    protected String inBillBillIbanCode;
    @XmlElement(name = "InBillBillIssueDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inBillBillIssueDate;
    @XmlElement(name = "InBillBillNumber")
    protected String inBillBillNumber;
    @XmlElement(name = "InBillBillOwnbankFlag")
    protected String inBillBillOwnbankFlag;
    @XmlElement(name = "InBillBillSerialNum")
    protected double inBillBillSerialNum;
    @XmlElement(name = "InBillBillSpecialChars")
    protected String inBillBillSpecialChars;
    @XmlElement(name = "InBillBillTypeFlag")
    protected String inBillBillTypeFlag;
    @XmlElement(name = "InBillClrAgentCode")
    protected int inBillClrAgentCode;
    @XmlElement(name = "InBillCpAgreementNo")
    protected double inBillCpAgreementNo;
    @XmlElement(name = "InBillCpDataField1")
    protected String inBillCpDataField1;
    @XmlElement(name = "InBillCpDataField2")
    protected String inBillCpDataField2;
    @XmlElement(name = "InBillCpDataField3")
    protected String inBillCpDataField3;
    @XmlElement(name = "InBillCpDataField4")
    protected String inBillCpDataField4;
    @XmlElement(name = "InBillIssuerBissCode")
    protected int inBillIssuerBissCode;
    @XmlElement(name = "InBillMassRegisterBmasBillanalFlag")
    protected String inBillMassRegisterBmasBillanalFlag;
    @XmlElement(name = "InBillMassRegisterBmasCarrierId")
    protected String inBillMassRegisterBmasCarrierId;
    @XmlElement(name = "InBillMassRegisterBmasCarrierName")
    protected String inBillMassRegisterBmasCarrierName;
    @XmlElement(name = "InBillMassRegisterBmasCarrierNotes")
    protected String inBillMassRegisterBmasCarrierNotes;
    @XmlElement(name = "InBillMassRegisterBmasCarrierTitle")
    protected String inBillMassRegisterBmasCarrierTitle;
    @XmlElement(name = "InBillMassRegisterBmasEntryStatus")
    protected String inBillMassRegisterBmasEntryStatus;
    @XmlElement(name = "InBillMassRegisterBmasFinalDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inBillMassRegisterBmasFinalDate;
    @XmlElement(name = "InBillMassRegisterBmasInsDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inBillMassRegisterBmasInsDate;
    @XmlElement(name = "InBillMassRegisterBmasRefNo")
    protected String inBillMassRegisterBmasRefNo;
    @XmlElement(name = "InBillMassRegisterBmasSerialNum")
    protected double inBillMassRegisterBmasSerialNum;
    @XmlElement(name = "InBillMassRegisterBmasTotbillAmnt", required = true)
    protected BigDecimal inBillMassRegisterBmasTotbillAmnt;
    @XmlElement(name = "InBillMassRegisterBmasTotbillCount")
    protected int inBillMassRegisterBmasTotbillCount;
    @XmlElement(name = "InBillMassRegisterCommDiscount", required = true)
    protected BigDecimal inBillMassRegisterCommDiscount;
    @XmlElement(name = "InBillMassRegisterExpaccCd")
    protected short inBillMassRegisterExpaccCd;
    @XmlElement(name = "InBillMassRegisterExpaccInterdate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inBillMassRegisterExpaccInterdate;
    @XmlElement(name = "InBillMassRegisterExpaccNumber")
    protected String inBillMassRegisterExpaccNumber;
    @XmlElement(name = "InBillMassRegisterExpaccPrfsys")
    protected short inBillMassRegisterExpaccPrfsys;
    @XmlElement(name = "InBillMassRegisterExpDiscount", required = true)
    protected BigDecimal inBillMassRegisterExpDiscount;
    @XmlElement(name = "InBillMassRegisterTmstamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inBillMassRegisterTmstamp;
    @XmlElement(name = "InBillTempDeleteIefSuppliedFlag")
    protected String inBillTempDeleteIefSuppliedFlag;
    @XmlElement(name = "InCollaborationBanksBankId")
    protected int inCollaborationBanksBankId;
    @XmlElement(name = "InCommandIefSuppliedCommand")
    protected String inCommandIefSuppliedCommand;
    @XmlElement(name = "InCustomerCDigit")
    protected short inCustomerCDigit;
    @XmlElement(name = "InCustomerCustId")
    protected int inCustomerCustId;
    @XmlElement(name = "InDepositAccountAccountNumber")
    protected double inDepositAccountAccountNumber;
    @XmlElement(name = "InFinalIefSuppliedFlag")
    protected String inFinalIefSuppliedFlag;
    @XmlElement(name = "InLastBillBillSerialNum")
    protected double inLastBillBillSerialNum;
    @XmlElement(name = "InLastBillMassregSegmMassegSerialNum")
    protected double inLastBillMassregSegmMassegSerialNum;
    @XmlElement(name = "InParametersInUnitClearingHouseFlag")
    protected String inParametersInUnitClearingHouseFlag;
    @XmlElement(name = "InParametersToBeDeletedSecRoleCode")
    protected int inParametersToBeDeletedSecRoleCode;
    @XmlElement(name = "InParametersInBankParametersEuroEchoDesc")
    protected String inParametersInBankParametersEuroEchoDesc;
    @XmlElement(name = "InParametersInBankemployeeFirstName")
    protected String inParametersInBankemployeeFirstName;
    @XmlElement(name = "InParametersInUsrGlLevel")
    protected short inParametersInUsrGlLevel;
    @XmlElement(name = "InParametersInBankParametersIbanFlag")
    protected String inParametersInBankParametersIbanFlag;
    @XmlElement(name = "InParametersToBeDeletedCurrencyIdCurrency")
    protected int inParametersToBeDeletedCurrencyIdCurrency;
    @XmlElement(name = "InParametersInBankemployeeLastName")
    protected String inParametersInBankemployeeLastName;
    @XmlElement(name = "InParametersInBankParametersMaxAmntRateTbl", required = true)
    protected BigDecimal inParametersInBankParametersMaxAmntRateTbl;
    @XmlElement(name = "InParametersInUsrPassword")
    protected String inParametersInUsrPassword;
    @XmlElement(name = "InParametersInWorkDatesProductionDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inParametersInWorkDatesProductionDate;
    @XmlElement(name = "InParametersInBankParametersRateUsage")
    protected String inParametersInBankParametersRateUsage;
    @XmlElement(name = "InParametersInUnitCategoryGenericDetailSerialNum")
    protected int inParametersInUnitCategoryGenericDetailSerialNum;
    @XmlElement(name = "InParametersToBeDeletedCurrencyShortDescr")
    protected String inParametersToBeDeletedCurrencyShortDescr;
    @XmlElement(name = "InParametersInBankParametersSwiftAddress")
    protected String inParametersInBankParametersSwiftAddress;
    @XmlElement(name = "InParametersInBankParametersTaxRegNo")
    protected String inParametersInBankParametersTaxRegNo;
    @XmlElement(name = "InParametersInTerminalTerminalNumber")
    protected String inParametersInTerminalTerminalNumber;
    @XmlElement(name = "InParametersInTrxCountTrxCounter")
    protected int inParametersInTrxCountTrxCounter;
    @XmlElement(name = "InParametersInUnitUnitName")
    protected String inParametersInUnitUnitName;
    @XmlElement(name = "InPrftTransactionDescription")
    protected String inPrftTransactionDescription;
    @XmlElement(name = "InPrftTransactionIdTransact")
    protected int inPrftTransactionIdTransact;
    @XmlElement(name = "InProductIdProduct")
    protected int inProductIdProduct;
    @XmlElement(name = "InRegUnitCode")
    protected int inRegUnitCode;
    @XmlElement(name = "InSelectedProfitsAccountAccountCd")
    protected short inSelectedProfitsAccountAccountCd;
    @XmlElement(name = "InSelectedProfitsAccountAccountNumber")
    protected String inSelectedProfitsAccountAccountNumber;
    @XmlElement(name = "InSelectedProfitsAccountPrftSystem")
    protected short inSelectedProfitsAccountPrftSystem;
    @XmlElement(name = "InSsSecurityCmcbPrftSystem")
    protected short inSsSecurityCmcbPrftSystem;
    @XmlElement(name = "InSsSecurityCmcbTranCode")
    protected String inSsSecurityCmcbTranCode;
    @XmlElement(name = "InTmstampBillTmpPTmstamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inTmstampBillTmpPTmstamp;
    @XmlElement(name = "InBillGrpSs")
    protected ArrayOfInBillGrpSs inBillGrpSs;
    @XmlElement(name = "InKillBillGrp")
    protected ArrayOfInKillBillGrp inKillBillGrp;
    @XmlElement(name = "InOwnbankUnpaid")
    protected ArrayOfInOwnbankUnpaid inOwnbankUnpaid;
    @XmlElement(name = "InRegSegmGrp")
    protected ArrayOfInRegSegmGrp inRegSegmGrp;
    @XmlElement(name = "InBillMassRegisterBmasRegCcy")
    protected int inBillMassRegisterBmasRegCcy;
    @XmlElement(name = "InCurrencyIdCurrency")
    protected int inCurrencyIdCurrency;
    @XmlElement(name = "InCurrencyShortDescr")
    protected String inCurrencyShortDescr;
    @XmlElement(name = "InPayCurrencyIdCurrency")
    protected int inPayCurrencyIdCurrency;
    @XmlElement(name = "InPayCurrencyShortDescr")
    protected String inPayCurrencyShortDescr;
    @XmlElement(name = "InClearingAgentAgentCode")
    protected int inClearingAgentAgentCode;
    @XmlElement(name = "InBillBillJustificId")
    protected int inBillBillJustificId;
    @XmlElement(name = "InAuthorGrantedIefSuppliedFlag")
    protected String inAuthorGrantedIefSuppliedFlag;

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
     * Gets the value of the inBatchIefSuppliedFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInBatchIefSuppliedFlag() {
        return inBatchIefSuppliedFlag;
    }

    /**
     * Sets the value of the inBatchIefSuppliedFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInBatchIefSuppliedFlag(String value) {
        this.inBatchIefSuppliedFlag = value;
    }

    /**
     * Gets the value of the inBillBillAccountNumb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInBillBillAccountNumb() {
        return inBillBillAccountNumb;
    }

    /**
     * Sets the value of the inBillBillAccountNumb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInBillBillAccountNumb(String value) {
        this.inBillBillAccountNumb = value;
    }

    /**
     * Gets the value of the inBillBillAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInBillBillAmount() {
        return inBillBillAmount;
    }

    /**
     * Sets the value of the inBillBillAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInBillBillAmount(BigDecimal value) {
        this.inBillBillAmount = value;
    }

    /**
     * Gets the value of the inBillBillBarcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInBillBillBarcode() {
        return inBillBillBarcode;
    }

    /**
     * Sets the value of the inBillBillBarcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInBillBillBarcode(String value) {
        this.inBillBillBarcode = value;
    }

    /**
     * Gets the value of the inBillBillBranchCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInBillBillBranchCode() {
        return inBillBillBranchCode;
    }

    /**
     * Sets the value of the inBillBillBranchCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInBillBillBranchCode(String value) {
        this.inBillBillBranchCode = value;
    }

    /**
     * Gets the value of the inBillBillCheckDigit property.
     * 
     */
    public short getInBillBillCheckDigit() {
        return inBillBillCheckDigit;
    }

    /**
     * Sets the value of the inBillBillCheckDigit property.
     * 
     */
    public void setInBillBillCheckDigit(short value) {
        this.inBillBillCheckDigit = value;
    }

    /**
     * Gets the value of the inBillBillClrtypeFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInBillBillClrtypeFlag() {
        return inBillBillClrtypeFlag;
    }

    /**
     * Sets the value of the inBillBillClrtypeFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInBillBillClrtypeFlag(String value) {
        this.inBillBillClrtypeFlag = value;
    }

    /**
     * Gets the value of the inBillBillCommDiscount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInBillBillCommDiscount() {
        return inBillBillCommDiscount;
    }

    /**
     * Sets the value of the inBillBillCommDiscount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInBillBillCommDiscount(BigDecimal value) {
        this.inBillBillCommDiscount = value;
    }

    /**
     * Gets the value of the inBillBillExpDiscount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInBillBillExpDiscount() {
        return inBillBillExpDiscount;
    }

    /**
     * Sets the value of the inBillBillExpDiscount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInBillBillExpDiscount(BigDecimal value) {
        this.inBillBillExpDiscount = value;
    }

    /**
     * Gets the value of the inBillBillIbanCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInBillBillIbanCode() {
        return inBillBillIbanCode;
    }

    /**
     * Sets the value of the inBillBillIbanCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInBillBillIbanCode(String value) {
        this.inBillBillIbanCode = value;
    }

    /**
     * Gets the value of the inBillBillIssueDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInBillBillIssueDate() {
        return inBillBillIssueDate;
    }

    /**
     * Sets the value of the inBillBillIssueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInBillBillIssueDate(XMLGregorianCalendar value) {
        this.inBillBillIssueDate = value;
    }

    /**
     * Gets the value of the inBillBillNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInBillBillNumber() {
        return inBillBillNumber;
    }

    /**
     * Sets the value of the inBillBillNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInBillBillNumber(String value) {
        this.inBillBillNumber = value;
    }

    /**
     * Gets the value of the inBillBillOwnbankFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInBillBillOwnbankFlag() {
        return inBillBillOwnbankFlag;
    }

    /**
     * Sets the value of the inBillBillOwnbankFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInBillBillOwnbankFlag(String value) {
        this.inBillBillOwnbankFlag = value;
    }

    /**
     * Gets the value of the inBillBillSerialNum property.
     * 
     */
    public double getInBillBillSerialNum() {
        return inBillBillSerialNum;
    }

    /**
     * Sets the value of the inBillBillSerialNum property.
     * 
     */
    public void setInBillBillSerialNum(double value) {
        this.inBillBillSerialNum = value;
    }

    /**
     * Gets the value of the inBillBillSpecialChars property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInBillBillSpecialChars() {
        return inBillBillSpecialChars;
    }

    /**
     * Sets the value of the inBillBillSpecialChars property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInBillBillSpecialChars(String value) {
        this.inBillBillSpecialChars = value;
    }

    /**
     * Gets the value of the inBillBillTypeFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInBillBillTypeFlag() {
        return inBillBillTypeFlag;
    }

    /**
     * Sets the value of the inBillBillTypeFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInBillBillTypeFlag(String value) {
        this.inBillBillTypeFlag = value;
    }

    /**
     * Gets the value of the inBillClrAgentCode property.
     * 
     */
    public int getInBillClrAgentCode() {
        return inBillClrAgentCode;
    }

    /**
     * Sets the value of the inBillClrAgentCode property.
     * 
     */
    public void setInBillClrAgentCode(int value) {
        this.inBillClrAgentCode = value;
    }

    /**
     * Gets the value of the inBillCpAgreementNo property.
     * 
     */
    public double getInBillCpAgreementNo() {
        return inBillCpAgreementNo;
    }

    /**
     * Sets the value of the inBillCpAgreementNo property.
     * 
     */
    public void setInBillCpAgreementNo(double value) {
        this.inBillCpAgreementNo = value;
    }

    /**
     * Gets the value of the inBillCpDataField1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInBillCpDataField1() {
        return inBillCpDataField1;
    }

    /**
     * Sets the value of the inBillCpDataField1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInBillCpDataField1(String value) {
        this.inBillCpDataField1 = value;
    }

    /**
     * Gets the value of the inBillCpDataField2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInBillCpDataField2() {
        return inBillCpDataField2;
    }

    /**
     * Sets the value of the inBillCpDataField2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInBillCpDataField2(String value) {
        this.inBillCpDataField2 = value;
    }

    /**
     * Gets the value of the inBillCpDataField3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInBillCpDataField3() {
        return inBillCpDataField3;
    }

    /**
     * Sets the value of the inBillCpDataField3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInBillCpDataField3(String value) {
        this.inBillCpDataField3 = value;
    }

    /**
     * Gets the value of the inBillCpDataField4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInBillCpDataField4() {
        return inBillCpDataField4;
    }

    /**
     * Sets the value of the inBillCpDataField4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInBillCpDataField4(String value) {
        this.inBillCpDataField4 = value;
    }

    /**
     * Gets the value of the inBillIssuerBissCode property.
     * 
     */
    public int getInBillIssuerBissCode() {
        return inBillIssuerBissCode;
    }

    /**
     * Sets the value of the inBillIssuerBissCode property.
     * 
     */
    public void setInBillIssuerBissCode(int value) {
        this.inBillIssuerBissCode = value;
    }

    /**
     * Gets the value of the inBillMassRegisterBmasBillanalFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInBillMassRegisterBmasBillanalFlag() {
        return inBillMassRegisterBmasBillanalFlag;
    }

    /**
     * Sets the value of the inBillMassRegisterBmasBillanalFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInBillMassRegisterBmasBillanalFlag(String value) {
        this.inBillMassRegisterBmasBillanalFlag = value;
    }

    /**
     * Gets the value of the inBillMassRegisterBmasCarrierId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInBillMassRegisterBmasCarrierId() {
        return inBillMassRegisterBmasCarrierId;
    }

    /**
     * Sets the value of the inBillMassRegisterBmasCarrierId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInBillMassRegisterBmasCarrierId(String value) {
        this.inBillMassRegisterBmasCarrierId = value;
    }

    /**
     * Gets the value of the inBillMassRegisterBmasCarrierName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInBillMassRegisterBmasCarrierName() {
        return inBillMassRegisterBmasCarrierName;
    }

    /**
     * Sets the value of the inBillMassRegisterBmasCarrierName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInBillMassRegisterBmasCarrierName(String value) {
        this.inBillMassRegisterBmasCarrierName = value;
    }

    /**
     * Gets the value of the inBillMassRegisterBmasCarrierNotes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInBillMassRegisterBmasCarrierNotes() {
        return inBillMassRegisterBmasCarrierNotes;
    }

    /**
     * Sets the value of the inBillMassRegisterBmasCarrierNotes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInBillMassRegisterBmasCarrierNotes(String value) {
        this.inBillMassRegisterBmasCarrierNotes = value;
    }

    /**
     * Gets the value of the inBillMassRegisterBmasCarrierTitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInBillMassRegisterBmasCarrierTitle() {
        return inBillMassRegisterBmasCarrierTitle;
    }

    /**
     * Sets the value of the inBillMassRegisterBmasCarrierTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInBillMassRegisterBmasCarrierTitle(String value) {
        this.inBillMassRegisterBmasCarrierTitle = value;
    }

    /**
     * Gets the value of the inBillMassRegisterBmasEntryStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInBillMassRegisterBmasEntryStatus() {
        return inBillMassRegisterBmasEntryStatus;
    }

    /**
     * Sets the value of the inBillMassRegisterBmasEntryStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInBillMassRegisterBmasEntryStatus(String value) {
        this.inBillMassRegisterBmasEntryStatus = value;
    }

    /**
     * Gets the value of the inBillMassRegisterBmasFinalDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInBillMassRegisterBmasFinalDate() {
        return inBillMassRegisterBmasFinalDate;
    }

    /**
     * Sets the value of the inBillMassRegisterBmasFinalDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInBillMassRegisterBmasFinalDate(XMLGregorianCalendar value) {
        this.inBillMassRegisterBmasFinalDate = value;
    }

    /**
     * Gets the value of the inBillMassRegisterBmasInsDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInBillMassRegisterBmasInsDate() {
        return inBillMassRegisterBmasInsDate;
    }

    /**
     * Sets the value of the inBillMassRegisterBmasInsDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInBillMassRegisterBmasInsDate(XMLGregorianCalendar value) {
        this.inBillMassRegisterBmasInsDate = value;
    }

    /**
     * Gets the value of the inBillMassRegisterBmasRefNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInBillMassRegisterBmasRefNo() {
        return inBillMassRegisterBmasRefNo;
    }

    /**
     * Sets the value of the inBillMassRegisterBmasRefNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInBillMassRegisterBmasRefNo(String value) {
        this.inBillMassRegisterBmasRefNo = value;
    }

    /**
     * Gets the value of the inBillMassRegisterBmasSerialNum property.
     * 
     */
    public double getInBillMassRegisterBmasSerialNum() {
        return inBillMassRegisterBmasSerialNum;
    }

    /**
     * Sets the value of the inBillMassRegisterBmasSerialNum property.
     * 
     */
    public void setInBillMassRegisterBmasSerialNum(double value) {
        this.inBillMassRegisterBmasSerialNum = value;
    }

    /**
     * Gets the value of the inBillMassRegisterBmasTotbillAmnt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInBillMassRegisterBmasTotbillAmnt() {
        return inBillMassRegisterBmasTotbillAmnt;
    }

    /**
     * Sets the value of the inBillMassRegisterBmasTotbillAmnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInBillMassRegisterBmasTotbillAmnt(BigDecimal value) {
        this.inBillMassRegisterBmasTotbillAmnt = value;
    }

    /**
     * Gets the value of the inBillMassRegisterBmasTotbillCount property.
     * 
     */
    public int getInBillMassRegisterBmasTotbillCount() {
        return inBillMassRegisterBmasTotbillCount;
    }

    /**
     * Sets the value of the inBillMassRegisterBmasTotbillCount property.
     * 
     */
    public void setInBillMassRegisterBmasTotbillCount(int value) {
        this.inBillMassRegisterBmasTotbillCount = value;
    }

    /**
     * Gets the value of the inBillMassRegisterCommDiscount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInBillMassRegisterCommDiscount() {
        return inBillMassRegisterCommDiscount;
    }

    /**
     * Sets the value of the inBillMassRegisterCommDiscount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInBillMassRegisterCommDiscount(BigDecimal value) {
        this.inBillMassRegisterCommDiscount = value;
    }

    /**
     * Gets the value of the inBillMassRegisterExpaccCd property.
     * 
     */
    public short getInBillMassRegisterExpaccCd() {
        return inBillMassRegisterExpaccCd;
    }

    /**
     * Sets the value of the inBillMassRegisterExpaccCd property.
     * 
     */
    public void setInBillMassRegisterExpaccCd(short value) {
        this.inBillMassRegisterExpaccCd = value;
    }

    /**
     * Gets the value of the inBillMassRegisterExpaccInterdate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInBillMassRegisterExpaccInterdate() {
        return inBillMassRegisterExpaccInterdate;
    }

    /**
     * Sets the value of the inBillMassRegisterExpaccInterdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInBillMassRegisterExpaccInterdate(XMLGregorianCalendar value) {
        this.inBillMassRegisterExpaccInterdate = value;
    }

    /**
     * Gets the value of the inBillMassRegisterExpaccNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInBillMassRegisterExpaccNumber() {
        return inBillMassRegisterExpaccNumber;
    }

    /**
     * Sets the value of the inBillMassRegisterExpaccNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInBillMassRegisterExpaccNumber(String value) {
        this.inBillMassRegisterExpaccNumber = value;
    }

    /**
     * Gets the value of the inBillMassRegisterExpaccPrfsys property.
     * 
     */
    public short getInBillMassRegisterExpaccPrfsys() {
        return inBillMassRegisterExpaccPrfsys;
    }

    /**
     * Sets the value of the inBillMassRegisterExpaccPrfsys property.
     * 
     */
    public void setInBillMassRegisterExpaccPrfsys(short value) {
        this.inBillMassRegisterExpaccPrfsys = value;
    }

    /**
     * Gets the value of the inBillMassRegisterExpDiscount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInBillMassRegisterExpDiscount() {
        return inBillMassRegisterExpDiscount;
    }

    /**
     * Sets the value of the inBillMassRegisterExpDiscount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInBillMassRegisterExpDiscount(BigDecimal value) {
        this.inBillMassRegisterExpDiscount = value;
    }

    /**
     * Gets the value of the inBillMassRegisterTmstamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInBillMassRegisterTmstamp() {
        return inBillMassRegisterTmstamp;
    }

    /**
     * Sets the value of the inBillMassRegisterTmstamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInBillMassRegisterTmstamp(XMLGregorianCalendar value) {
        this.inBillMassRegisterTmstamp = value;
    }

    /**
     * Gets the value of the inBillTempDeleteIefSuppliedFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInBillTempDeleteIefSuppliedFlag() {
        return inBillTempDeleteIefSuppliedFlag;
    }

    /**
     * Sets the value of the inBillTempDeleteIefSuppliedFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInBillTempDeleteIefSuppliedFlag(String value) {
        this.inBillTempDeleteIefSuppliedFlag = value;
    }

    /**
     * Gets the value of the inCollaborationBanksBankId property.
     * 
     */
    public int getInCollaborationBanksBankId() {
        return inCollaborationBanksBankId;
    }

    /**
     * Sets the value of the inCollaborationBanksBankId property.
     * 
     */
    public void setInCollaborationBanksBankId(int value) {
        this.inCollaborationBanksBankId = value;
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
     * Gets the value of the inDepositAccountAccountNumber property.
     * 
     */
    public double getInDepositAccountAccountNumber() {
        return inDepositAccountAccountNumber;
    }

    /**
     * Sets the value of the inDepositAccountAccountNumber property.
     * 
     */
    public void setInDepositAccountAccountNumber(double value) {
        this.inDepositAccountAccountNumber = value;
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
     * Gets the value of the inLastBillBillSerialNum property.
     * 
     */
    public double getInLastBillBillSerialNum() {
        return inLastBillBillSerialNum;
    }

    /**
     * Sets the value of the inLastBillBillSerialNum property.
     * 
     */
    public void setInLastBillBillSerialNum(double value) {
        this.inLastBillBillSerialNum = value;
    }

    /**
     * Gets the value of the inLastBillMassregSegmMassegSerialNum property.
     * 
     */
    public double getInLastBillMassregSegmMassegSerialNum() {
        return inLastBillMassregSegmMassegSerialNum;
    }

    /**
     * Sets the value of the inLastBillMassregSegmMassegSerialNum property.
     * 
     */
    public void setInLastBillMassregSegmMassegSerialNum(double value) {
        this.inLastBillMassregSegmMassegSerialNum = value;
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
     * Gets the value of the inParametersInBankemployeeFirstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInParametersInBankemployeeFirstName() {
        return inParametersInBankemployeeFirstName;
    }

    /**
     * Sets the value of the inParametersInBankemployeeFirstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInParametersInBankemployeeFirstName(String value) {
        this.inParametersInBankemployeeFirstName = value;
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
     * Gets the value of the inParametersInBankemployeeLastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInParametersInBankemployeeLastName() {
        return inParametersInBankemployeeLastName;
    }

    /**
     * Sets the value of the inParametersInBankemployeeLastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInParametersInBankemployeeLastName(String value) {
        this.inParametersInBankemployeeLastName = value;
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
     * Gets the value of the inParametersInUsrPassword property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInParametersInUsrPassword() {
        return inParametersInUsrPassword;
    }

    /**
     * Sets the value of the inParametersInUsrPassword property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInParametersInUsrPassword(String value) {
        this.inParametersInUsrPassword = value;
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
     * Gets the value of the inParametersInBankParametersSwiftAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInParametersInBankParametersSwiftAddress() {
        return inParametersInBankParametersSwiftAddress;
    }

    /**
     * Sets the value of the inParametersInBankParametersSwiftAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInParametersInBankParametersSwiftAddress(String value) {
        this.inParametersInBankParametersSwiftAddress = value;
    }

    /**
     * Gets the value of the inParametersInBankParametersTaxRegNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInParametersInBankParametersTaxRegNo() {
        return inParametersInBankParametersTaxRegNo;
    }

    /**
     * Sets the value of the inParametersInBankParametersTaxRegNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInParametersInBankParametersTaxRegNo(String value) {
        this.inParametersInBankParametersTaxRegNo = value;
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
     * Gets the value of the inParametersInUnitUnitName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInParametersInUnitUnitName() {
        return inParametersInUnitUnitName;
    }

    /**
     * Sets the value of the inParametersInUnitUnitName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInParametersInUnitUnitName(String value) {
        this.inParametersInUnitUnitName = value;
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
     * Gets the value of the inRegUnitCode property.
     * 
     */
    public int getInRegUnitCode() {
        return inRegUnitCode;
    }

    /**
     * Sets the value of the inRegUnitCode property.
     * 
     */
    public void setInRegUnitCode(int value) {
        this.inRegUnitCode = value;
    }

    /**
     * Gets the value of the inSelectedProfitsAccountAccountCd property.
     * 
     */
    public short getInSelectedProfitsAccountAccountCd() {
        return inSelectedProfitsAccountAccountCd;
    }

    /**
     * Sets the value of the inSelectedProfitsAccountAccountCd property.
     * 
     */
    public void setInSelectedProfitsAccountAccountCd(short value) {
        this.inSelectedProfitsAccountAccountCd = value;
    }

    /**
     * Gets the value of the inSelectedProfitsAccountAccountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInSelectedProfitsAccountAccountNumber() {
        return inSelectedProfitsAccountAccountNumber;
    }

    /**
     * Sets the value of the inSelectedProfitsAccountAccountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInSelectedProfitsAccountAccountNumber(String value) {
        this.inSelectedProfitsAccountAccountNumber = value;
    }

    /**
     * Gets the value of the inSelectedProfitsAccountPrftSystem property.
     * 
     */
    public short getInSelectedProfitsAccountPrftSystem() {
        return inSelectedProfitsAccountPrftSystem;
    }

    /**
     * Sets the value of the inSelectedProfitsAccountPrftSystem property.
     * 
     */
    public void setInSelectedProfitsAccountPrftSystem(short value) {
        this.inSelectedProfitsAccountPrftSystem = value;
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
     * Gets the value of the inTmstampBillTmpPTmstamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInTmstampBillTmpPTmstamp() {
        return inTmstampBillTmpPTmstamp;
    }

    /**
     * Sets the value of the inTmstampBillTmpPTmstamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInTmstampBillTmpPTmstamp(XMLGregorianCalendar value) {
        this.inTmstampBillTmpPTmstamp = value;
    }

    /**
     * Gets the value of the inBillGrpSs property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfInBillGrpSs }
     *     
     */
    public ArrayOfInBillGrpSs getInBillGrpSs() {
        return inBillGrpSs;
    }

    /**
     * Sets the value of the inBillGrpSs property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfInBillGrpSs }
     *     
     */
    public void setInBillGrpSs(ArrayOfInBillGrpSs value) {
        this.inBillGrpSs = value;
    }

    /**
     * Gets the value of the inKillBillGrp property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfInKillBillGrp }
     *     
     */
    public ArrayOfInKillBillGrp getInKillBillGrp() {
        return inKillBillGrp;
    }

    /**
     * Sets the value of the inKillBillGrp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfInKillBillGrp }
     *     
     */
    public void setInKillBillGrp(ArrayOfInKillBillGrp value) {
        this.inKillBillGrp = value;
    }

    /**
     * Gets the value of the inOwnbankUnpaid property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfInOwnbankUnpaid }
     *     
     */
    public ArrayOfInOwnbankUnpaid getInOwnbankUnpaid() {
        return inOwnbankUnpaid;
    }

    /**
     * Sets the value of the inOwnbankUnpaid property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfInOwnbankUnpaid }
     *     
     */
    public void setInOwnbankUnpaid(ArrayOfInOwnbankUnpaid value) {
        this.inOwnbankUnpaid = value;
    }

    /**
     * Gets the value of the inRegSegmGrp property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfInRegSegmGrp }
     *     
     */
    public ArrayOfInRegSegmGrp getInRegSegmGrp() {
        return inRegSegmGrp;
    }

    /**
     * Sets the value of the inRegSegmGrp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfInRegSegmGrp }
     *     
     */
    public void setInRegSegmGrp(ArrayOfInRegSegmGrp value) {
        this.inRegSegmGrp = value;
    }

    /**
     * Gets the value of the inBillMassRegisterBmasRegCcy property.
     * 
     */
    public int getInBillMassRegisterBmasRegCcy() {
        return inBillMassRegisterBmasRegCcy;
    }

    /**
     * Sets the value of the inBillMassRegisterBmasRegCcy property.
     * 
     */
    public void setInBillMassRegisterBmasRegCcy(int value) {
        this.inBillMassRegisterBmasRegCcy = value;
    }

    /**
     * Gets the value of the inCurrencyIdCurrency property.
     * 
     */
    public int getInCurrencyIdCurrency() {
        return inCurrencyIdCurrency;
    }

    /**
     * Sets the value of the inCurrencyIdCurrency property.
     * 
     */
    public void setInCurrencyIdCurrency(int value) {
        this.inCurrencyIdCurrency = value;
    }

    /**
     * Gets the value of the inCurrencyShortDescr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCurrencyShortDescr() {
        return inCurrencyShortDescr;
    }

    /**
     * Sets the value of the inCurrencyShortDescr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCurrencyShortDescr(String value) {
        this.inCurrencyShortDescr = value;
    }

    /**
     * Gets the value of the inPayCurrencyIdCurrency property.
     * 
     */
    public int getInPayCurrencyIdCurrency() {
        return inPayCurrencyIdCurrency;
    }

    /**
     * Sets the value of the inPayCurrencyIdCurrency property.
     * 
     */
    public void setInPayCurrencyIdCurrency(int value) {
        this.inPayCurrencyIdCurrency = value;
    }

    /**
     * Gets the value of the inPayCurrencyShortDescr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInPayCurrencyShortDescr() {
        return inPayCurrencyShortDescr;
    }

    /**
     * Sets the value of the inPayCurrencyShortDescr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInPayCurrencyShortDescr(String value) {
        this.inPayCurrencyShortDescr = value;
    }

    /**
     * Gets the value of the inClearingAgentAgentCode property.
     * 
     */
    public int getInClearingAgentAgentCode() {
        return inClearingAgentAgentCode;
    }

    /**
     * Sets the value of the inClearingAgentAgentCode property.
     * 
     */
    public void setInClearingAgentAgentCode(int value) {
        this.inClearingAgentAgentCode = value;
    }

    /**
     * Gets the value of the inBillBillJustificId property.
     * 
     */
    public int getInBillBillJustificId() {
        return inBillBillJustificId;
    }

    /**
     * Sets the value of the inBillBillJustificId property.
     * 
     */
    public void setInBillBillJustificId(int value) {
        this.inBillBillJustificId = value;
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

}
