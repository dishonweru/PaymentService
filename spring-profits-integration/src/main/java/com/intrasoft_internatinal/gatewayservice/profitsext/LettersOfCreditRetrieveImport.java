
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for LettersOfCreditRetrieveImport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LettersOfCreditRetrieveImport">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}BaseImport">
 *       &lt;sequence>
 *         &lt;element name="ProfitsAccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProfitsAccountCd" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InGrpTfShipment" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}ArrayOfInGrpTfShipment" minOccurs="0"/>
 *         &lt;element name="InGrpTfDestination" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}ArrayOfInGrpTfDestination" minOccurs="0"/>
 *         &lt;element name="InGrpParametersInGrmWorkDatesProductionDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InGrpParametersInGrmUnitCategoryGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InGrpParametersInGrmTerminalTerminalNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InGrpParametersInGrmTrxCountTrxCounter" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InAdvisingSwiftAllnceBicsBankDescr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InAdvisingSwiftAllnceBicsBic" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InAgrCurrencyIdCurrency" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InAgrCurrencyShortDescr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InAgreementAgrLimit" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InAgreementAgrMembershipSn" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InAgreementAgrSn" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InAgreementAgrUtilisedLimit" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InAgreementAgrYear" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InAgrProfitsAccountAccountCd" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InAgrProfitsAccountAccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InAgrProfitsAccountAgrMembershipSn" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InAgrProfitsAccountAgrSn" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InAgrProfitsAccountAgrUnit" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InAgrProfitsAccountAgrYear" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InAgrProfitsAccountPrftSystem" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InAgrUnitCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InBeneficiaryCustomerCDigit" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InBeneficiaryCustomerCustId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InBeneficiaryProfitsAccountAccountCd" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InBeneficiaryProfitsAccountAccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InBeneficiaryProfitsAccountPrftSystem" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InChargingCurrencyIdCurrency" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InChargingCurrencyShortDescr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCommandIefSuppliedCommand" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCommLangGenericDetailDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCommLangGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InConfirmingSwiftAllnceBicsBankDescr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InConfirmingSwiftAllnceBicsBic" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCorrespondentProfitsAccountAccountCd" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InCorrespondentProfitsAccountAccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCorrespondentProfitsAccountPrftSystem" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InCurrencyIdCurrency" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InCurrencyShortDescr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCustomerCustId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InDocumentTemplateCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InDocumentTemplateDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InDocumentTemplatePrftSystem" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InGenericCurrencyIdCurrency" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InGenericCurrencyShortDescr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InGrpTfDestinationLength" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InGrpTfShipmentLength" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InInvoiceTypeGenericDetailDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InInvoiceTypeGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InIssuingSwiftAllnceBicsBankDescr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InIssuingSwiftAllnceBicsBic" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InJustificIdJustific" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InLcAccountAssignOfProceed" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InLcAccountCommChrgFrq" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InLcAccountCommChrgFrqt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InLcAccountComments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InLcAccountConfirmFlg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InLcAccountExpiryDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InLcAccountExpiryPlace" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InLcAccountIncomingLcRefNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InLcAccountInvoicePerc" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InLcAccountIrrevocableFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InLcAccountIssueDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InLcAccountLcAccStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InLcAccountLcAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InLcAccountLcFirstIssueAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InLcAccountLcTotalIssueAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InLcAccountLcType" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InLcAccountLnsSn" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InLcAccountLnsType" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InLcAccountLnsUnit" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InLcAccountOpeningDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InLcAccountPartialShipmntFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InLcAccountRedClause" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InLcAccountReprAddress1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InLcAccountReprAddress2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InLcAccountReprCountry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InLcAccountReprName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InLcAccountReprRegion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InLcAccountReprResident" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InLcAccountReprTel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InLcAccountReprZipCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InLcAccountRevolvingInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InLcAccountSettlementMode" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InLcAccountTmstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InLcAccountTolerance" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InLcAccountTransferLcAcc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InLcAccountTranshipmntFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InLcAccountTransmission" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InMonitoringUnitCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InMonitoringUnitUnitName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InMovingCurrencyIdCurrency" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InMovingCurrencyShortDescr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InNegotiatingSwiftAllnceBicsBankDescr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InNegotiatingSwiftAllnceBicsBic" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InOpeningUnitCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InOpeningUnitUnitName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InPrftTransactionIdTransact" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InPrincipalCustomerCDigit" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InPrincipalCustomerCustId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InPrincipalProfitsAccountAccountCd" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InPrincipalProfitsAccountAccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InPrincipalProfitsAccountPrftSystem" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InProductDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InProductIdProduct" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InTfTypeIefSuppliedFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InTradeFinanceBenefAccCd" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InTradeFinanceBenefAccNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InTradeFinanceBenefAccPrftSys" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InTradeFinanceBenefCommAddr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InTradeFinanceBeneficiaryName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InTradeFinanceComments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InTradeFinanceCorrBankAccCd" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InTradeFinanceCorrBankAccNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InTradeFinanceCorreAccPrftSys" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InTradeFinanceCorrespondentName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InTradeFinancePrincAccPrftSys" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InTradeFinancePrincipalAccCd" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InTradeFinancePrincipalAccNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InTradeFinancePrincipalCommAddr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InTradeFinancePrinicipalName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InTradeFinanceRefNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InTradeFinanceStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InTradeFinanceTfAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InTradeFinanceTfCd" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InTradeFinanceTfConfirmDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InTradeFinanceTfNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InTradeFinanceTfOpenDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InTradeFinanceTfType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InTradeFinanceTmpstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LettersOfCreditRetrieveImport", propOrder = {
    "profitsAccountNumber",
    "profitsAccountCd",
    "inGrpTfShipment",
    "inGrpTfDestination",
    "inGrpParametersInGrmWorkDatesProductionDate",
    "inGrpParametersInGrmUnitCategoryGenericDetailSerialNum",
    "inGrpParametersInGrmTerminalTerminalNumber",
    "inGrpParametersInGrmTrxCountTrxCounter",
    "inAdvisingSwiftAllnceBicsBankDescr",
    "inAdvisingSwiftAllnceBicsBic",
    "inAgrCurrencyIdCurrency",
    "inAgrCurrencyShortDescr",
    "inAgreementAgrLimit",
    "inAgreementAgrMembershipSn",
    "inAgreementAgrSn",
    "inAgreementAgrUtilisedLimit",
    "inAgreementAgrYear",
    "inAgrProfitsAccountAccountCd",
    "inAgrProfitsAccountAccountNumber",
    "inAgrProfitsAccountAgrMembershipSn",
    "inAgrProfitsAccountAgrSn",
    "inAgrProfitsAccountAgrUnit",
    "inAgrProfitsAccountAgrYear",
    "inAgrProfitsAccountPrftSystem",
    "inAgrUnitCode",
    "inBeneficiaryCustomerCDigit",
    "inBeneficiaryCustomerCustId",
    "inBeneficiaryProfitsAccountAccountCd",
    "inBeneficiaryProfitsAccountAccountNumber",
    "inBeneficiaryProfitsAccountPrftSystem",
    "inChargingCurrencyIdCurrency",
    "inChargingCurrencyShortDescr",
    "inCommandIefSuppliedCommand",
    "inCommLangGenericDetailDescription",
    "inCommLangGenericDetailSerialNum",
    "inConfirmingSwiftAllnceBicsBankDescr",
    "inConfirmingSwiftAllnceBicsBic",
    "inCorrespondentProfitsAccountAccountCd",
    "inCorrespondentProfitsAccountAccountNumber",
    "inCorrespondentProfitsAccountPrftSystem",
    "inCurrencyIdCurrency",
    "inCurrencyShortDescr",
    "inCustomerCustId",
    "inDocumentTemplateCode",
    "inDocumentTemplateDescription",
    "inDocumentTemplatePrftSystem",
    "inGenericCurrencyIdCurrency",
    "inGenericCurrencyShortDescr",
    "inGrpTfDestinationLength",
    "inGrpTfShipmentLength",
    "inInvoiceTypeGenericDetailDescription",
    "inInvoiceTypeGenericDetailSerialNum",
    "inIssuingSwiftAllnceBicsBankDescr",
    "inIssuingSwiftAllnceBicsBic",
    "inJustificIdJustific",
    "inLcAccountAssignOfProceed",
    "inLcAccountCommChrgFrq",
    "inLcAccountCommChrgFrqt",
    "inLcAccountComments",
    "inLcAccountConfirmFlg",
    "inLcAccountExpiryDate",
    "inLcAccountExpiryPlace",
    "inLcAccountIncomingLcRefNo",
    "inLcAccountInvoicePerc",
    "inLcAccountIrrevocableFlag",
    "inLcAccountIssueDate",
    "inLcAccountLcAccStatus",
    "inLcAccountLcAmount",
    "inLcAccountLcFirstIssueAmn",
    "inLcAccountLcTotalIssueAmn",
    "inLcAccountLcType",
    "inLcAccountLnsSn",
    "inLcAccountLnsType",
    "inLcAccountLnsUnit",
    "inLcAccountOpeningDate",
    "inLcAccountPartialShipmntFlag",
    "inLcAccountRedClause",
    "inLcAccountReprAddress1",
    "inLcAccountReprAddress2",
    "inLcAccountReprCountry",
    "inLcAccountReprName",
    "inLcAccountReprRegion",
    "inLcAccountReprResident",
    "inLcAccountReprTel",
    "inLcAccountReprZipCode",
    "inLcAccountRevolvingInd",
    "inLcAccountSettlementMode",
    "inLcAccountTmstamp",
    "inLcAccountTolerance",
    "inLcAccountTransferLcAcc",
    "inLcAccountTranshipmntFlag",
    "inLcAccountTransmission",
    "inMonitoringUnitCode",
    "inMonitoringUnitUnitName",
    "inMovingCurrencyIdCurrency",
    "inMovingCurrencyShortDescr",
    "inNegotiatingSwiftAllnceBicsBankDescr",
    "inNegotiatingSwiftAllnceBicsBic",
    "inOpeningUnitCode",
    "inOpeningUnitUnitName",
    "inPrftTransactionIdTransact",
    "inPrincipalCustomerCDigit",
    "inPrincipalCustomerCustId",
    "inPrincipalProfitsAccountAccountCd",
    "inPrincipalProfitsAccountAccountNumber",
    "inPrincipalProfitsAccountPrftSystem",
    "inProductDescription",
    "inProductIdProduct",
    "inTfTypeIefSuppliedFlag",
    "inTradeFinanceBenefAccCd",
    "inTradeFinanceBenefAccNum",
    "inTradeFinanceBenefAccPrftSys",
    "inTradeFinanceBenefCommAddr",
    "inTradeFinanceBeneficiaryName",
    "inTradeFinanceComments",
    "inTradeFinanceCorrBankAccCd",
    "inTradeFinanceCorrBankAccNum",
    "inTradeFinanceCorreAccPrftSys",
    "inTradeFinanceCorrespondentName",
    "inTradeFinancePrincAccPrftSys",
    "inTradeFinancePrincipalAccCd",
    "inTradeFinancePrincipalAccNum",
    "inTradeFinancePrincipalCommAddr",
    "inTradeFinancePrinicipalName",
    "inTradeFinanceRefNo",
    "inTradeFinanceStatus",
    "inTradeFinanceTfAmount",
    "inTradeFinanceTfCd",
    "inTradeFinanceTfConfirmDate",
    "inTradeFinanceTfNumber",
    "inTradeFinanceTfOpenDate",
    "inTradeFinanceTfType",
    "inTradeFinanceTmpstamp"
})
public class LettersOfCreditRetrieveImport
    extends BaseImport
{

    @XmlElement(name = "ProfitsAccountNumber")
    protected String profitsAccountNumber;
    @XmlElement(name = "ProfitsAccountCd")
    protected short profitsAccountCd;
    @XmlElement(name = "InGrpTfShipment")
    protected ArrayOfInGrpTfShipment inGrpTfShipment;
    @XmlElement(name = "InGrpTfDestination")
    protected ArrayOfInGrpTfDestination inGrpTfDestination;
    @XmlElement(name = "InGrpParametersInGrmWorkDatesProductionDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inGrpParametersInGrmWorkDatesProductionDate;
    @XmlElement(name = "InGrpParametersInGrmUnitCategoryGenericDetailSerialNum")
    protected int inGrpParametersInGrmUnitCategoryGenericDetailSerialNum;
    @XmlElement(name = "InGrpParametersInGrmTerminalTerminalNumber")
    protected String inGrpParametersInGrmTerminalTerminalNumber;
    @XmlElement(name = "InGrpParametersInGrmTrxCountTrxCounter")
    protected int inGrpParametersInGrmTrxCountTrxCounter;
    @XmlElement(name = "InAdvisingSwiftAllnceBicsBankDescr")
    protected String inAdvisingSwiftAllnceBicsBankDescr;
    @XmlElement(name = "InAdvisingSwiftAllnceBicsBic")
    protected String inAdvisingSwiftAllnceBicsBic;
    @XmlElement(name = "InAgrCurrencyIdCurrency")
    protected int inAgrCurrencyIdCurrency;
    @XmlElement(name = "InAgrCurrencyShortDescr")
    protected String inAgrCurrencyShortDescr;
    @XmlElement(name = "InAgreementAgrLimit", required = true)
    protected BigDecimal inAgreementAgrLimit;
    @XmlElement(name = "InAgreementAgrMembershipSn")
    protected int inAgreementAgrMembershipSn;
    @XmlElement(name = "InAgreementAgrSn")
    protected int inAgreementAgrSn;
    @XmlElement(name = "InAgreementAgrUtilisedLimit", required = true)
    protected BigDecimal inAgreementAgrUtilisedLimit;
    @XmlElement(name = "InAgreementAgrYear")
    protected short inAgreementAgrYear;
    @XmlElement(name = "InAgrProfitsAccountAccountCd")
    protected short inAgrProfitsAccountAccountCd;
    @XmlElement(name = "InAgrProfitsAccountAccountNumber")
    protected String inAgrProfitsAccountAccountNumber;
    @XmlElement(name = "InAgrProfitsAccountAgrMembershipSn")
    protected int inAgrProfitsAccountAgrMembershipSn;
    @XmlElement(name = "InAgrProfitsAccountAgrSn")
    protected int inAgrProfitsAccountAgrSn;
    @XmlElement(name = "InAgrProfitsAccountAgrUnit")
    protected int inAgrProfitsAccountAgrUnit;
    @XmlElement(name = "InAgrProfitsAccountAgrYear")
    protected short inAgrProfitsAccountAgrYear;
    @XmlElement(name = "InAgrProfitsAccountPrftSystem")
    protected short inAgrProfitsAccountPrftSystem;
    @XmlElement(name = "InAgrUnitCode")
    protected int inAgrUnitCode;
    @XmlElement(name = "InBeneficiaryCustomerCDigit")
    protected short inBeneficiaryCustomerCDigit;
    @XmlElement(name = "InBeneficiaryCustomerCustId")
    protected int inBeneficiaryCustomerCustId;
    @XmlElement(name = "InBeneficiaryProfitsAccountAccountCd")
    protected short inBeneficiaryProfitsAccountAccountCd;
    @XmlElement(name = "InBeneficiaryProfitsAccountAccountNumber")
    protected String inBeneficiaryProfitsAccountAccountNumber;
    @XmlElement(name = "InBeneficiaryProfitsAccountPrftSystem")
    protected short inBeneficiaryProfitsAccountPrftSystem;
    @XmlElement(name = "InChargingCurrencyIdCurrency")
    protected int inChargingCurrencyIdCurrency;
    @XmlElement(name = "InChargingCurrencyShortDescr")
    protected String inChargingCurrencyShortDescr;
    @XmlElement(name = "InCommandIefSuppliedCommand")
    protected String inCommandIefSuppliedCommand;
    @XmlElement(name = "InCommLangGenericDetailDescription")
    protected String inCommLangGenericDetailDescription;
    @XmlElement(name = "InCommLangGenericDetailSerialNum")
    protected int inCommLangGenericDetailSerialNum;
    @XmlElement(name = "InConfirmingSwiftAllnceBicsBankDescr")
    protected String inConfirmingSwiftAllnceBicsBankDescr;
    @XmlElement(name = "InConfirmingSwiftAllnceBicsBic")
    protected String inConfirmingSwiftAllnceBicsBic;
    @XmlElement(name = "InCorrespondentProfitsAccountAccountCd")
    protected short inCorrespondentProfitsAccountAccountCd;
    @XmlElement(name = "InCorrespondentProfitsAccountAccountNumber")
    protected String inCorrespondentProfitsAccountAccountNumber;
    @XmlElement(name = "InCorrespondentProfitsAccountPrftSystem")
    protected short inCorrespondentProfitsAccountPrftSystem;
    @XmlElement(name = "InCurrencyIdCurrency")
    protected int inCurrencyIdCurrency;
    @XmlElement(name = "InCurrencyShortDescr")
    protected String inCurrencyShortDescr;
    @XmlElement(name = "InCustomerCustId")
    protected int inCustomerCustId;
    @XmlElement(name = "InDocumentTemplateCode")
    protected int inDocumentTemplateCode;
    @XmlElement(name = "InDocumentTemplateDescription")
    protected String inDocumentTemplateDescription;
    @XmlElement(name = "InDocumentTemplatePrftSystem")
    protected short inDocumentTemplatePrftSystem;
    @XmlElement(name = "InGenericCurrencyIdCurrency")
    protected int inGenericCurrencyIdCurrency;
    @XmlElement(name = "InGenericCurrencyShortDescr")
    protected String inGenericCurrencyShortDescr;
    @XmlElement(name = "InGrpTfDestinationLength")
    protected int inGrpTfDestinationLength;
    @XmlElement(name = "InGrpTfShipmentLength")
    protected int inGrpTfShipmentLength;
    @XmlElement(name = "InInvoiceTypeGenericDetailDescription")
    protected String inInvoiceTypeGenericDetailDescription;
    @XmlElement(name = "InInvoiceTypeGenericDetailSerialNum")
    protected int inInvoiceTypeGenericDetailSerialNum;
    @XmlElement(name = "InIssuingSwiftAllnceBicsBankDescr")
    protected String inIssuingSwiftAllnceBicsBankDescr;
    @XmlElement(name = "InIssuingSwiftAllnceBicsBic")
    protected String inIssuingSwiftAllnceBicsBic;
    @XmlElement(name = "InJustificIdJustific")
    protected int inJustificIdJustific;
    @XmlElement(name = "InLcAccountAssignOfProceed")
    protected String inLcAccountAssignOfProceed;
    @XmlElement(name = "InLcAccountCommChrgFrq")
    protected short inLcAccountCommChrgFrq;
    @XmlElement(name = "InLcAccountCommChrgFrqt")
    protected String inLcAccountCommChrgFrqt;
    @XmlElement(name = "InLcAccountComments")
    protected String inLcAccountComments;
    @XmlElement(name = "InLcAccountConfirmFlg")
    protected String inLcAccountConfirmFlg;
    @XmlElement(name = "InLcAccountExpiryDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inLcAccountExpiryDate;
    @XmlElement(name = "InLcAccountExpiryPlace")
    protected String inLcAccountExpiryPlace;
    @XmlElement(name = "InLcAccountIncomingLcRefNo")
    protected String inLcAccountIncomingLcRefNo;
    @XmlElement(name = "InLcAccountInvoicePerc", required = true)
    protected BigDecimal inLcAccountInvoicePerc;
    @XmlElement(name = "InLcAccountIrrevocableFlag")
    protected String inLcAccountIrrevocableFlag;
    @XmlElement(name = "InLcAccountIssueDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inLcAccountIssueDate;
    @XmlElement(name = "InLcAccountLcAccStatus")
    protected String inLcAccountLcAccStatus;
    @XmlElement(name = "InLcAccountLcAmount", required = true)
    protected BigDecimal inLcAccountLcAmount;
    @XmlElement(name = "InLcAccountLcFirstIssueAmn", required = true)
    protected BigDecimal inLcAccountLcFirstIssueAmn;
    @XmlElement(name = "InLcAccountLcTotalIssueAmn", required = true)
    protected BigDecimal inLcAccountLcTotalIssueAmn;
    @XmlElement(name = "InLcAccountLcType")
    protected short inLcAccountLcType;
    @XmlElement(name = "InLcAccountLnsSn")
    protected int inLcAccountLnsSn;
    @XmlElement(name = "InLcAccountLnsType")
    protected short inLcAccountLnsType;
    @XmlElement(name = "InLcAccountLnsUnit")
    protected int inLcAccountLnsUnit;
    @XmlElement(name = "InLcAccountOpeningDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inLcAccountOpeningDate;
    @XmlElement(name = "InLcAccountPartialShipmntFlag")
    protected String inLcAccountPartialShipmntFlag;
    @XmlElement(name = "InLcAccountRedClause")
    protected String inLcAccountRedClause;
    @XmlElement(name = "InLcAccountReprAddress1")
    protected String inLcAccountReprAddress1;
    @XmlElement(name = "InLcAccountReprAddress2")
    protected String inLcAccountReprAddress2;
    @XmlElement(name = "InLcAccountReprCountry")
    protected String inLcAccountReprCountry;
    @XmlElement(name = "InLcAccountReprName")
    protected String inLcAccountReprName;
    @XmlElement(name = "InLcAccountReprRegion")
    protected String inLcAccountReprRegion;
    @XmlElement(name = "InLcAccountReprResident")
    protected String inLcAccountReprResident;
    @XmlElement(name = "InLcAccountReprTel")
    protected String inLcAccountReprTel;
    @XmlElement(name = "InLcAccountReprZipCode")
    protected String inLcAccountReprZipCode;
    @XmlElement(name = "InLcAccountRevolvingInd")
    protected String inLcAccountRevolvingInd;
    @XmlElement(name = "InLcAccountSettlementMode")
    protected short inLcAccountSettlementMode;
    @XmlElement(name = "InLcAccountTmstamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inLcAccountTmstamp;
    @XmlElement(name = "InLcAccountTolerance", required = true)
    protected BigDecimal inLcAccountTolerance;
    @XmlElement(name = "InLcAccountTransferLcAcc")
    protected String inLcAccountTransferLcAcc;
    @XmlElement(name = "InLcAccountTranshipmntFlag")
    protected String inLcAccountTranshipmntFlag;
    @XmlElement(name = "InLcAccountTransmission")
    protected short inLcAccountTransmission;
    @XmlElement(name = "InMonitoringUnitCode")
    protected int inMonitoringUnitCode;
    @XmlElement(name = "InMonitoringUnitUnitName")
    protected String inMonitoringUnitUnitName;
    @XmlElement(name = "InMovingCurrencyIdCurrency")
    protected int inMovingCurrencyIdCurrency;
    @XmlElement(name = "InMovingCurrencyShortDescr")
    protected String inMovingCurrencyShortDescr;
    @XmlElement(name = "InNegotiatingSwiftAllnceBicsBankDescr")
    protected String inNegotiatingSwiftAllnceBicsBankDescr;
    @XmlElement(name = "InNegotiatingSwiftAllnceBicsBic")
    protected String inNegotiatingSwiftAllnceBicsBic;
    @XmlElement(name = "InOpeningUnitCode")
    protected int inOpeningUnitCode;
    @XmlElement(name = "InOpeningUnitUnitName")
    protected String inOpeningUnitUnitName;
    @XmlElement(name = "InPrftTransactionIdTransact")
    protected int inPrftTransactionIdTransact;
    @XmlElement(name = "InPrincipalCustomerCDigit")
    protected short inPrincipalCustomerCDigit;
    @XmlElement(name = "InPrincipalCustomerCustId")
    protected int inPrincipalCustomerCustId;
    @XmlElement(name = "InPrincipalProfitsAccountAccountCd")
    protected short inPrincipalProfitsAccountAccountCd;
    @XmlElement(name = "InPrincipalProfitsAccountAccountNumber")
    protected String inPrincipalProfitsAccountAccountNumber;
    @XmlElement(name = "InPrincipalProfitsAccountPrftSystem")
    protected short inPrincipalProfitsAccountPrftSystem;
    @XmlElement(name = "InProductDescription")
    protected String inProductDescription;
    @XmlElement(name = "InProductIdProduct")
    protected int inProductIdProduct;
    @XmlElement(name = "InTfTypeIefSuppliedFlag")
    protected String inTfTypeIefSuppliedFlag;
    @XmlElement(name = "InTradeFinanceBenefAccCd")
    protected short inTradeFinanceBenefAccCd;
    @XmlElement(name = "InTradeFinanceBenefAccNum")
    protected String inTradeFinanceBenefAccNum;
    @XmlElement(name = "InTradeFinanceBenefAccPrftSys")
    protected short inTradeFinanceBenefAccPrftSys;
    @XmlElement(name = "InTradeFinanceBenefCommAddr")
    protected String inTradeFinanceBenefCommAddr;
    @XmlElement(name = "InTradeFinanceBeneficiaryName")
    protected String inTradeFinanceBeneficiaryName;
    @XmlElement(name = "InTradeFinanceComments")
    protected String inTradeFinanceComments;
    @XmlElement(name = "InTradeFinanceCorrBankAccCd")
    protected short inTradeFinanceCorrBankAccCd;
    @XmlElement(name = "InTradeFinanceCorrBankAccNum")
    protected String inTradeFinanceCorrBankAccNum;
    @XmlElement(name = "InTradeFinanceCorreAccPrftSys")
    protected short inTradeFinanceCorreAccPrftSys;
    @XmlElement(name = "InTradeFinanceCorrespondentName")
    protected String inTradeFinanceCorrespondentName;
    @XmlElement(name = "InTradeFinancePrincAccPrftSys")
    protected short inTradeFinancePrincAccPrftSys;
    @XmlElement(name = "InTradeFinancePrincipalAccCd")
    protected short inTradeFinancePrincipalAccCd;
    @XmlElement(name = "InTradeFinancePrincipalAccNum")
    protected String inTradeFinancePrincipalAccNum;
    @XmlElement(name = "InTradeFinancePrincipalCommAddr")
    protected String inTradeFinancePrincipalCommAddr;
    @XmlElement(name = "InTradeFinancePrinicipalName")
    protected String inTradeFinancePrinicipalName;
    @XmlElement(name = "InTradeFinanceRefNo")
    protected String inTradeFinanceRefNo;
    @XmlElement(name = "InTradeFinanceStatus")
    protected String inTradeFinanceStatus;
    @XmlElement(name = "InTradeFinanceTfAmount", required = true)
    protected BigDecimal inTradeFinanceTfAmount;
    @XmlElement(name = "InTradeFinanceTfCd")
    protected short inTradeFinanceTfCd;
    @XmlElement(name = "InTradeFinanceTfConfirmDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inTradeFinanceTfConfirmDate;
    @XmlElement(name = "InTradeFinanceTfNumber")
    protected String inTradeFinanceTfNumber;
    @XmlElement(name = "InTradeFinanceTfOpenDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inTradeFinanceTfOpenDate;
    @XmlElement(name = "InTradeFinanceTfType")
    protected String inTradeFinanceTfType;
    @XmlElement(name = "InTradeFinanceTmpstamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inTradeFinanceTmpstamp;

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
     * Gets the value of the inGrpTfShipment property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfInGrpTfShipment }
     *     
     */
    public ArrayOfInGrpTfShipment getInGrpTfShipment() {
        return inGrpTfShipment;
    }

    /**
     * Sets the value of the inGrpTfShipment property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfInGrpTfShipment }
     *     
     */
    public void setInGrpTfShipment(ArrayOfInGrpTfShipment value) {
        this.inGrpTfShipment = value;
    }

    /**
     * Gets the value of the inGrpTfDestination property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfInGrpTfDestination }
     *     
     */
    public ArrayOfInGrpTfDestination getInGrpTfDestination() {
        return inGrpTfDestination;
    }

    /**
     * Sets the value of the inGrpTfDestination property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfInGrpTfDestination }
     *     
     */
    public void setInGrpTfDestination(ArrayOfInGrpTfDestination value) {
        this.inGrpTfDestination = value;
    }

    /**
     * Gets the value of the inGrpParametersInGrmWorkDatesProductionDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInGrpParametersInGrmWorkDatesProductionDate() {
        return inGrpParametersInGrmWorkDatesProductionDate;
    }

    /**
     * Sets the value of the inGrpParametersInGrmWorkDatesProductionDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInGrpParametersInGrmWorkDatesProductionDate(XMLGregorianCalendar value) {
        this.inGrpParametersInGrmWorkDatesProductionDate = value;
    }

    /**
     * Gets the value of the inGrpParametersInGrmUnitCategoryGenericDetailSerialNum property.
     * 
     */
    public int getInGrpParametersInGrmUnitCategoryGenericDetailSerialNum() {
        return inGrpParametersInGrmUnitCategoryGenericDetailSerialNum;
    }

    /**
     * Sets the value of the inGrpParametersInGrmUnitCategoryGenericDetailSerialNum property.
     * 
     */
    public void setInGrpParametersInGrmUnitCategoryGenericDetailSerialNum(int value) {
        this.inGrpParametersInGrmUnitCategoryGenericDetailSerialNum = value;
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
     * Gets the value of the inAdvisingSwiftAllnceBicsBankDescr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInAdvisingSwiftAllnceBicsBankDescr() {
        return inAdvisingSwiftAllnceBicsBankDescr;
    }

    /**
     * Sets the value of the inAdvisingSwiftAllnceBicsBankDescr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInAdvisingSwiftAllnceBicsBankDescr(String value) {
        this.inAdvisingSwiftAllnceBicsBankDescr = value;
    }

    /**
     * Gets the value of the inAdvisingSwiftAllnceBicsBic property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInAdvisingSwiftAllnceBicsBic() {
        return inAdvisingSwiftAllnceBicsBic;
    }

    /**
     * Sets the value of the inAdvisingSwiftAllnceBicsBic property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInAdvisingSwiftAllnceBicsBic(String value) {
        this.inAdvisingSwiftAllnceBicsBic = value;
    }

    /**
     * Gets the value of the inAgrCurrencyIdCurrency property.
     * 
     */
    public int getInAgrCurrencyIdCurrency() {
        return inAgrCurrencyIdCurrency;
    }

    /**
     * Sets the value of the inAgrCurrencyIdCurrency property.
     * 
     */
    public void setInAgrCurrencyIdCurrency(int value) {
        this.inAgrCurrencyIdCurrency = value;
    }

    /**
     * Gets the value of the inAgrCurrencyShortDescr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInAgrCurrencyShortDescr() {
        return inAgrCurrencyShortDescr;
    }

    /**
     * Sets the value of the inAgrCurrencyShortDescr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInAgrCurrencyShortDescr(String value) {
        this.inAgrCurrencyShortDescr = value;
    }

    /**
     * Gets the value of the inAgreementAgrLimit property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInAgreementAgrLimit() {
        return inAgreementAgrLimit;
    }

    /**
     * Sets the value of the inAgreementAgrLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInAgreementAgrLimit(BigDecimal value) {
        this.inAgreementAgrLimit = value;
    }

    /**
     * Gets the value of the inAgreementAgrMembershipSn property.
     * 
     */
    public int getInAgreementAgrMembershipSn() {
        return inAgreementAgrMembershipSn;
    }

    /**
     * Sets the value of the inAgreementAgrMembershipSn property.
     * 
     */
    public void setInAgreementAgrMembershipSn(int value) {
        this.inAgreementAgrMembershipSn = value;
    }

    /**
     * Gets the value of the inAgreementAgrSn property.
     * 
     */
    public int getInAgreementAgrSn() {
        return inAgreementAgrSn;
    }

    /**
     * Sets the value of the inAgreementAgrSn property.
     * 
     */
    public void setInAgreementAgrSn(int value) {
        this.inAgreementAgrSn = value;
    }

    /**
     * Gets the value of the inAgreementAgrUtilisedLimit property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInAgreementAgrUtilisedLimit() {
        return inAgreementAgrUtilisedLimit;
    }

    /**
     * Sets the value of the inAgreementAgrUtilisedLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInAgreementAgrUtilisedLimit(BigDecimal value) {
        this.inAgreementAgrUtilisedLimit = value;
    }

    /**
     * Gets the value of the inAgreementAgrYear property.
     * 
     */
    public short getInAgreementAgrYear() {
        return inAgreementAgrYear;
    }

    /**
     * Sets the value of the inAgreementAgrYear property.
     * 
     */
    public void setInAgreementAgrYear(short value) {
        this.inAgreementAgrYear = value;
    }

    /**
     * Gets the value of the inAgrProfitsAccountAccountCd property.
     * 
     */
    public short getInAgrProfitsAccountAccountCd() {
        return inAgrProfitsAccountAccountCd;
    }

    /**
     * Sets the value of the inAgrProfitsAccountAccountCd property.
     * 
     */
    public void setInAgrProfitsAccountAccountCd(short value) {
        this.inAgrProfitsAccountAccountCd = value;
    }

    /**
     * Gets the value of the inAgrProfitsAccountAccountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInAgrProfitsAccountAccountNumber() {
        return inAgrProfitsAccountAccountNumber;
    }

    /**
     * Sets the value of the inAgrProfitsAccountAccountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInAgrProfitsAccountAccountNumber(String value) {
        this.inAgrProfitsAccountAccountNumber = value;
    }

    /**
     * Gets the value of the inAgrProfitsAccountAgrMembershipSn property.
     * 
     */
    public int getInAgrProfitsAccountAgrMembershipSn() {
        return inAgrProfitsAccountAgrMembershipSn;
    }

    /**
     * Sets the value of the inAgrProfitsAccountAgrMembershipSn property.
     * 
     */
    public void setInAgrProfitsAccountAgrMembershipSn(int value) {
        this.inAgrProfitsAccountAgrMembershipSn = value;
    }

    /**
     * Gets the value of the inAgrProfitsAccountAgrSn property.
     * 
     */
    public int getInAgrProfitsAccountAgrSn() {
        return inAgrProfitsAccountAgrSn;
    }

    /**
     * Sets the value of the inAgrProfitsAccountAgrSn property.
     * 
     */
    public void setInAgrProfitsAccountAgrSn(int value) {
        this.inAgrProfitsAccountAgrSn = value;
    }

    /**
     * Gets the value of the inAgrProfitsAccountAgrUnit property.
     * 
     */
    public int getInAgrProfitsAccountAgrUnit() {
        return inAgrProfitsAccountAgrUnit;
    }

    /**
     * Sets the value of the inAgrProfitsAccountAgrUnit property.
     * 
     */
    public void setInAgrProfitsAccountAgrUnit(int value) {
        this.inAgrProfitsAccountAgrUnit = value;
    }

    /**
     * Gets the value of the inAgrProfitsAccountAgrYear property.
     * 
     */
    public short getInAgrProfitsAccountAgrYear() {
        return inAgrProfitsAccountAgrYear;
    }

    /**
     * Sets the value of the inAgrProfitsAccountAgrYear property.
     * 
     */
    public void setInAgrProfitsAccountAgrYear(short value) {
        this.inAgrProfitsAccountAgrYear = value;
    }

    /**
     * Gets the value of the inAgrProfitsAccountPrftSystem property.
     * 
     */
    public short getInAgrProfitsAccountPrftSystem() {
        return inAgrProfitsAccountPrftSystem;
    }

    /**
     * Sets the value of the inAgrProfitsAccountPrftSystem property.
     * 
     */
    public void setInAgrProfitsAccountPrftSystem(short value) {
        this.inAgrProfitsAccountPrftSystem = value;
    }

    /**
     * Gets the value of the inAgrUnitCode property.
     * 
     */
    public int getInAgrUnitCode() {
        return inAgrUnitCode;
    }

    /**
     * Sets the value of the inAgrUnitCode property.
     * 
     */
    public void setInAgrUnitCode(int value) {
        this.inAgrUnitCode = value;
    }

    /**
     * Gets the value of the inBeneficiaryCustomerCDigit property.
     * 
     */
    public short getInBeneficiaryCustomerCDigit() {
        return inBeneficiaryCustomerCDigit;
    }

    /**
     * Sets the value of the inBeneficiaryCustomerCDigit property.
     * 
     */
    public void setInBeneficiaryCustomerCDigit(short value) {
        this.inBeneficiaryCustomerCDigit = value;
    }

    /**
     * Gets the value of the inBeneficiaryCustomerCustId property.
     * 
     */
    public int getInBeneficiaryCustomerCustId() {
        return inBeneficiaryCustomerCustId;
    }

    /**
     * Sets the value of the inBeneficiaryCustomerCustId property.
     * 
     */
    public void setInBeneficiaryCustomerCustId(int value) {
        this.inBeneficiaryCustomerCustId = value;
    }

    /**
     * Gets the value of the inBeneficiaryProfitsAccountAccountCd property.
     * 
     */
    public short getInBeneficiaryProfitsAccountAccountCd() {
        return inBeneficiaryProfitsAccountAccountCd;
    }

    /**
     * Sets the value of the inBeneficiaryProfitsAccountAccountCd property.
     * 
     */
    public void setInBeneficiaryProfitsAccountAccountCd(short value) {
        this.inBeneficiaryProfitsAccountAccountCd = value;
    }

    /**
     * Gets the value of the inBeneficiaryProfitsAccountAccountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInBeneficiaryProfitsAccountAccountNumber() {
        return inBeneficiaryProfitsAccountAccountNumber;
    }

    /**
     * Sets the value of the inBeneficiaryProfitsAccountAccountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInBeneficiaryProfitsAccountAccountNumber(String value) {
        this.inBeneficiaryProfitsAccountAccountNumber = value;
    }

    /**
     * Gets the value of the inBeneficiaryProfitsAccountPrftSystem property.
     * 
     */
    public short getInBeneficiaryProfitsAccountPrftSystem() {
        return inBeneficiaryProfitsAccountPrftSystem;
    }

    /**
     * Sets the value of the inBeneficiaryProfitsAccountPrftSystem property.
     * 
     */
    public void setInBeneficiaryProfitsAccountPrftSystem(short value) {
        this.inBeneficiaryProfitsAccountPrftSystem = value;
    }

    /**
     * Gets the value of the inChargingCurrencyIdCurrency property.
     * 
     */
    public int getInChargingCurrencyIdCurrency() {
        return inChargingCurrencyIdCurrency;
    }

    /**
     * Sets the value of the inChargingCurrencyIdCurrency property.
     * 
     */
    public void setInChargingCurrencyIdCurrency(int value) {
        this.inChargingCurrencyIdCurrency = value;
    }

    /**
     * Gets the value of the inChargingCurrencyShortDescr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInChargingCurrencyShortDescr() {
        return inChargingCurrencyShortDescr;
    }

    /**
     * Sets the value of the inChargingCurrencyShortDescr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInChargingCurrencyShortDescr(String value) {
        this.inChargingCurrencyShortDescr = value;
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
     * Gets the value of the inCommLangGenericDetailDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCommLangGenericDetailDescription() {
        return inCommLangGenericDetailDescription;
    }

    /**
     * Sets the value of the inCommLangGenericDetailDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCommLangGenericDetailDescription(String value) {
        this.inCommLangGenericDetailDescription = value;
    }

    /**
     * Gets the value of the inCommLangGenericDetailSerialNum property.
     * 
     */
    public int getInCommLangGenericDetailSerialNum() {
        return inCommLangGenericDetailSerialNum;
    }

    /**
     * Sets the value of the inCommLangGenericDetailSerialNum property.
     * 
     */
    public void setInCommLangGenericDetailSerialNum(int value) {
        this.inCommLangGenericDetailSerialNum = value;
    }

    /**
     * Gets the value of the inConfirmingSwiftAllnceBicsBankDescr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInConfirmingSwiftAllnceBicsBankDescr() {
        return inConfirmingSwiftAllnceBicsBankDescr;
    }

    /**
     * Sets the value of the inConfirmingSwiftAllnceBicsBankDescr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInConfirmingSwiftAllnceBicsBankDescr(String value) {
        this.inConfirmingSwiftAllnceBicsBankDescr = value;
    }

    /**
     * Gets the value of the inConfirmingSwiftAllnceBicsBic property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInConfirmingSwiftAllnceBicsBic() {
        return inConfirmingSwiftAllnceBicsBic;
    }

    /**
     * Sets the value of the inConfirmingSwiftAllnceBicsBic property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInConfirmingSwiftAllnceBicsBic(String value) {
        this.inConfirmingSwiftAllnceBicsBic = value;
    }

    /**
     * Gets the value of the inCorrespondentProfitsAccountAccountCd property.
     * 
     */
    public short getInCorrespondentProfitsAccountAccountCd() {
        return inCorrespondentProfitsAccountAccountCd;
    }

    /**
     * Sets the value of the inCorrespondentProfitsAccountAccountCd property.
     * 
     */
    public void setInCorrespondentProfitsAccountAccountCd(short value) {
        this.inCorrespondentProfitsAccountAccountCd = value;
    }

    /**
     * Gets the value of the inCorrespondentProfitsAccountAccountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCorrespondentProfitsAccountAccountNumber() {
        return inCorrespondentProfitsAccountAccountNumber;
    }

    /**
     * Sets the value of the inCorrespondentProfitsAccountAccountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCorrespondentProfitsAccountAccountNumber(String value) {
        this.inCorrespondentProfitsAccountAccountNumber = value;
    }

    /**
     * Gets the value of the inCorrespondentProfitsAccountPrftSystem property.
     * 
     */
    public short getInCorrespondentProfitsAccountPrftSystem() {
        return inCorrespondentProfitsAccountPrftSystem;
    }

    /**
     * Sets the value of the inCorrespondentProfitsAccountPrftSystem property.
     * 
     */
    public void setInCorrespondentProfitsAccountPrftSystem(short value) {
        this.inCorrespondentProfitsAccountPrftSystem = value;
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
     * Gets the value of the inDocumentTemplateCode property.
     * 
     */
    public int getInDocumentTemplateCode() {
        return inDocumentTemplateCode;
    }

    /**
     * Sets the value of the inDocumentTemplateCode property.
     * 
     */
    public void setInDocumentTemplateCode(int value) {
        this.inDocumentTemplateCode = value;
    }

    /**
     * Gets the value of the inDocumentTemplateDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInDocumentTemplateDescription() {
        return inDocumentTemplateDescription;
    }

    /**
     * Sets the value of the inDocumentTemplateDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInDocumentTemplateDescription(String value) {
        this.inDocumentTemplateDescription = value;
    }

    /**
     * Gets the value of the inDocumentTemplatePrftSystem property.
     * 
     */
    public short getInDocumentTemplatePrftSystem() {
        return inDocumentTemplatePrftSystem;
    }

    /**
     * Sets the value of the inDocumentTemplatePrftSystem property.
     * 
     */
    public void setInDocumentTemplatePrftSystem(short value) {
        this.inDocumentTemplatePrftSystem = value;
    }

    /**
     * Gets the value of the inGenericCurrencyIdCurrency property.
     * 
     */
    public int getInGenericCurrencyIdCurrency() {
        return inGenericCurrencyIdCurrency;
    }

    /**
     * Sets the value of the inGenericCurrencyIdCurrency property.
     * 
     */
    public void setInGenericCurrencyIdCurrency(int value) {
        this.inGenericCurrencyIdCurrency = value;
    }

    /**
     * Gets the value of the inGenericCurrencyShortDescr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInGenericCurrencyShortDescr() {
        return inGenericCurrencyShortDescr;
    }

    /**
     * Sets the value of the inGenericCurrencyShortDescr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInGenericCurrencyShortDescr(String value) {
        this.inGenericCurrencyShortDescr = value;
    }

    /**
     * Gets the value of the inGrpTfDestinationLength property.
     * 
     */
    public int getInGrpTfDestinationLength() {
        return inGrpTfDestinationLength;
    }

    /**
     * Sets the value of the inGrpTfDestinationLength property.
     * 
     */
    public void setInGrpTfDestinationLength(int value) {
        this.inGrpTfDestinationLength = value;
    }

    /**
     * Gets the value of the inGrpTfShipmentLength property.
     * 
     */
    public int getInGrpTfShipmentLength() {
        return inGrpTfShipmentLength;
    }

    /**
     * Sets the value of the inGrpTfShipmentLength property.
     * 
     */
    public void setInGrpTfShipmentLength(int value) {
        this.inGrpTfShipmentLength = value;
    }

    /**
     * Gets the value of the inInvoiceTypeGenericDetailDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInInvoiceTypeGenericDetailDescription() {
        return inInvoiceTypeGenericDetailDescription;
    }

    /**
     * Sets the value of the inInvoiceTypeGenericDetailDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInInvoiceTypeGenericDetailDescription(String value) {
        this.inInvoiceTypeGenericDetailDescription = value;
    }

    /**
     * Gets the value of the inInvoiceTypeGenericDetailSerialNum property.
     * 
     */
    public int getInInvoiceTypeGenericDetailSerialNum() {
        return inInvoiceTypeGenericDetailSerialNum;
    }

    /**
     * Sets the value of the inInvoiceTypeGenericDetailSerialNum property.
     * 
     */
    public void setInInvoiceTypeGenericDetailSerialNum(int value) {
        this.inInvoiceTypeGenericDetailSerialNum = value;
    }

    /**
     * Gets the value of the inIssuingSwiftAllnceBicsBankDescr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInIssuingSwiftAllnceBicsBankDescr() {
        return inIssuingSwiftAllnceBicsBankDescr;
    }

    /**
     * Sets the value of the inIssuingSwiftAllnceBicsBankDescr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInIssuingSwiftAllnceBicsBankDescr(String value) {
        this.inIssuingSwiftAllnceBicsBankDescr = value;
    }

    /**
     * Gets the value of the inIssuingSwiftAllnceBicsBic property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInIssuingSwiftAllnceBicsBic() {
        return inIssuingSwiftAllnceBicsBic;
    }

    /**
     * Sets the value of the inIssuingSwiftAllnceBicsBic property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInIssuingSwiftAllnceBicsBic(String value) {
        this.inIssuingSwiftAllnceBicsBic = value;
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
     * Gets the value of the inLcAccountAssignOfProceed property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInLcAccountAssignOfProceed() {
        return inLcAccountAssignOfProceed;
    }

    /**
     * Sets the value of the inLcAccountAssignOfProceed property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInLcAccountAssignOfProceed(String value) {
        this.inLcAccountAssignOfProceed = value;
    }

    /**
     * Gets the value of the inLcAccountCommChrgFrq property.
     * 
     */
    public short getInLcAccountCommChrgFrq() {
        return inLcAccountCommChrgFrq;
    }

    /**
     * Sets the value of the inLcAccountCommChrgFrq property.
     * 
     */
    public void setInLcAccountCommChrgFrq(short value) {
        this.inLcAccountCommChrgFrq = value;
    }

    /**
     * Gets the value of the inLcAccountCommChrgFrqt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInLcAccountCommChrgFrqt() {
        return inLcAccountCommChrgFrqt;
    }

    /**
     * Sets the value of the inLcAccountCommChrgFrqt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInLcAccountCommChrgFrqt(String value) {
        this.inLcAccountCommChrgFrqt = value;
    }

    /**
     * Gets the value of the inLcAccountComments property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInLcAccountComments() {
        return inLcAccountComments;
    }

    /**
     * Sets the value of the inLcAccountComments property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInLcAccountComments(String value) {
        this.inLcAccountComments = value;
    }

    /**
     * Gets the value of the inLcAccountConfirmFlg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInLcAccountConfirmFlg() {
        return inLcAccountConfirmFlg;
    }

    /**
     * Sets the value of the inLcAccountConfirmFlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInLcAccountConfirmFlg(String value) {
        this.inLcAccountConfirmFlg = value;
    }

    /**
     * Gets the value of the inLcAccountExpiryDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInLcAccountExpiryDate() {
        return inLcAccountExpiryDate;
    }

    /**
     * Sets the value of the inLcAccountExpiryDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInLcAccountExpiryDate(XMLGregorianCalendar value) {
        this.inLcAccountExpiryDate = value;
    }

    /**
     * Gets the value of the inLcAccountExpiryPlace property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInLcAccountExpiryPlace() {
        return inLcAccountExpiryPlace;
    }

    /**
     * Sets the value of the inLcAccountExpiryPlace property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInLcAccountExpiryPlace(String value) {
        this.inLcAccountExpiryPlace = value;
    }

    /**
     * Gets the value of the inLcAccountIncomingLcRefNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInLcAccountIncomingLcRefNo() {
        return inLcAccountIncomingLcRefNo;
    }

    /**
     * Sets the value of the inLcAccountIncomingLcRefNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInLcAccountIncomingLcRefNo(String value) {
        this.inLcAccountIncomingLcRefNo = value;
    }

    /**
     * Gets the value of the inLcAccountInvoicePerc property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInLcAccountInvoicePerc() {
        return inLcAccountInvoicePerc;
    }

    /**
     * Sets the value of the inLcAccountInvoicePerc property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInLcAccountInvoicePerc(BigDecimal value) {
        this.inLcAccountInvoicePerc = value;
    }

    /**
     * Gets the value of the inLcAccountIrrevocableFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInLcAccountIrrevocableFlag() {
        return inLcAccountIrrevocableFlag;
    }

    /**
     * Sets the value of the inLcAccountIrrevocableFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInLcAccountIrrevocableFlag(String value) {
        this.inLcAccountIrrevocableFlag = value;
    }

    /**
     * Gets the value of the inLcAccountIssueDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInLcAccountIssueDate() {
        return inLcAccountIssueDate;
    }

    /**
     * Sets the value of the inLcAccountIssueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInLcAccountIssueDate(XMLGregorianCalendar value) {
        this.inLcAccountIssueDate = value;
    }

    /**
     * Gets the value of the inLcAccountLcAccStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInLcAccountLcAccStatus() {
        return inLcAccountLcAccStatus;
    }

    /**
     * Sets the value of the inLcAccountLcAccStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInLcAccountLcAccStatus(String value) {
        this.inLcAccountLcAccStatus = value;
    }

    /**
     * Gets the value of the inLcAccountLcAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInLcAccountLcAmount() {
        return inLcAccountLcAmount;
    }

    /**
     * Sets the value of the inLcAccountLcAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInLcAccountLcAmount(BigDecimal value) {
        this.inLcAccountLcAmount = value;
    }

    /**
     * Gets the value of the inLcAccountLcFirstIssueAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInLcAccountLcFirstIssueAmn() {
        return inLcAccountLcFirstIssueAmn;
    }

    /**
     * Sets the value of the inLcAccountLcFirstIssueAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInLcAccountLcFirstIssueAmn(BigDecimal value) {
        this.inLcAccountLcFirstIssueAmn = value;
    }

    /**
     * Gets the value of the inLcAccountLcTotalIssueAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInLcAccountLcTotalIssueAmn() {
        return inLcAccountLcTotalIssueAmn;
    }

    /**
     * Sets the value of the inLcAccountLcTotalIssueAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInLcAccountLcTotalIssueAmn(BigDecimal value) {
        this.inLcAccountLcTotalIssueAmn = value;
    }

    /**
     * Gets the value of the inLcAccountLcType property.
     * 
     */
    public short getInLcAccountLcType() {
        return inLcAccountLcType;
    }

    /**
     * Sets the value of the inLcAccountLcType property.
     * 
     */
    public void setInLcAccountLcType(short value) {
        this.inLcAccountLcType = value;
    }

    /**
     * Gets the value of the inLcAccountLnsSn property.
     * 
     */
    public int getInLcAccountLnsSn() {
        return inLcAccountLnsSn;
    }

    /**
     * Sets the value of the inLcAccountLnsSn property.
     * 
     */
    public void setInLcAccountLnsSn(int value) {
        this.inLcAccountLnsSn = value;
    }

    /**
     * Gets the value of the inLcAccountLnsType property.
     * 
     */
    public short getInLcAccountLnsType() {
        return inLcAccountLnsType;
    }

    /**
     * Sets the value of the inLcAccountLnsType property.
     * 
     */
    public void setInLcAccountLnsType(short value) {
        this.inLcAccountLnsType = value;
    }

    /**
     * Gets the value of the inLcAccountLnsUnit property.
     * 
     */
    public int getInLcAccountLnsUnit() {
        return inLcAccountLnsUnit;
    }

    /**
     * Sets the value of the inLcAccountLnsUnit property.
     * 
     */
    public void setInLcAccountLnsUnit(int value) {
        this.inLcAccountLnsUnit = value;
    }

    /**
     * Gets the value of the inLcAccountOpeningDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInLcAccountOpeningDate() {
        return inLcAccountOpeningDate;
    }

    /**
     * Sets the value of the inLcAccountOpeningDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInLcAccountOpeningDate(XMLGregorianCalendar value) {
        this.inLcAccountOpeningDate = value;
    }

    /**
     * Gets the value of the inLcAccountPartialShipmntFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInLcAccountPartialShipmntFlag() {
        return inLcAccountPartialShipmntFlag;
    }

    /**
     * Sets the value of the inLcAccountPartialShipmntFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInLcAccountPartialShipmntFlag(String value) {
        this.inLcAccountPartialShipmntFlag = value;
    }

    /**
     * Gets the value of the inLcAccountRedClause property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInLcAccountRedClause() {
        return inLcAccountRedClause;
    }

    /**
     * Sets the value of the inLcAccountRedClause property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInLcAccountRedClause(String value) {
        this.inLcAccountRedClause = value;
    }

    /**
     * Gets the value of the inLcAccountReprAddress1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInLcAccountReprAddress1() {
        return inLcAccountReprAddress1;
    }

    /**
     * Sets the value of the inLcAccountReprAddress1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInLcAccountReprAddress1(String value) {
        this.inLcAccountReprAddress1 = value;
    }

    /**
     * Gets the value of the inLcAccountReprAddress2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInLcAccountReprAddress2() {
        return inLcAccountReprAddress2;
    }

    /**
     * Sets the value of the inLcAccountReprAddress2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInLcAccountReprAddress2(String value) {
        this.inLcAccountReprAddress2 = value;
    }

    /**
     * Gets the value of the inLcAccountReprCountry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInLcAccountReprCountry() {
        return inLcAccountReprCountry;
    }

    /**
     * Sets the value of the inLcAccountReprCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInLcAccountReprCountry(String value) {
        this.inLcAccountReprCountry = value;
    }

    /**
     * Gets the value of the inLcAccountReprName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInLcAccountReprName() {
        return inLcAccountReprName;
    }

    /**
     * Sets the value of the inLcAccountReprName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInLcAccountReprName(String value) {
        this.inLcAccountReprName = value;
    }

    /**
     * Gets the value of the inLcAccountReprRegion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInLcAccountReprRegion() {
        return inLcAccountReprRegion;
    }

    /**
     * Sets the value of the inLcAccountReprRegion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInLcAccountReprRegion(String value) {
        this.inLcAccountReprRegion = value;
    }

    /**
     * Gets the value of the inLcAccountReprResident property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInLcAccountReprResident() {
        return inLcAccountReprResident;
    }

    /**
     * Sets the value of the inLcAccountReprResident property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInLcAccountReprResident(String value) {
        this.inLcAccountReprResident = value;
    }

    /**
     * Gets the value of the inLcAccountReprTel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInLcAccountReprTel() {
        return inLcAccountReprTel;
    }

    /**
     * Sets the value of the inLcAccountReprTel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInLcAccountReprTel(String value) {
        this.inLcAccountReprTel = value;
    }

    /**
     * Gets the value of the inLcAccountReprZipCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInLcAccountReprZipCode() {
        return inLcAccountReprZipCode;
    }

    /**
     * Sets the value of the inLcAccountReprZipCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInLcAccountReprZipCode(String value) {
        this.inLcAccountReprZipCode = value;
    }

    /**
     * Gets the value of the inLcAccountRevolvingInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInLcAccountRevolvingInd() {
        return inLcAccountRevolvingInd;
    }

    /**
     * Sets the value of the inLcAccountRevolvingInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInLcAccountRevolvingInd(String value) {
        this.inLcAccountRevolvingInd = value;
    }

    /**
     * Gets the value of the inLcAccountSettlementMode property.
     * 
     */
    public short getInLcAccountSettlementMode() {
        return inLcAccountSettlementMode;
    }

    /**
     * Sets the value of the inLcAccountSettlementMode property.
     * 
     */
    public void setInLcAccountSettlementMode(short value) {
        this.inLcAccountSettlementMode = value;
    }

    /**
     * Gets the value of the inLcAccountTmstamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInLcAccountTmstamp() {
        return inLcAccountTmstamp;
    }

    /**
     * Sets the value of the inLcAccountTmstamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInLcAccountTmstamp(XMLGregorianCalendar value) {
        this.inLcAccountTmstamp = value;
    }

    /**
     * Gets the value of the inLcAccountTolerance property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInLcAccountTolerance() {
        return inLcAccountTolerance;
    }

    /**
     * Sets the value of the inLcAccountTolerance property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInLcAccountTolerance(BigDecimal value) {
        this.inLcAccountTolerance = value;
    }

    /**
     * Gets the value of the inLcAccountTransferLcAcc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInLcAccountTransferLcAcc() {
        return inLcAccountTransferLcAcc;
    }

    /**
     * Sets the value of the inLcAccountTransferLcAcc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInLcAccountTransferLcAcc(String value) {
        this.inLcAccountTransferLcAcc = value;
    }

    /**
     * Gets the value of the inLcAccountTranshipmntFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInLcAccountTranshipmntFlag() {
        return inLcAccountTranshipmntFlag;
    }

    /**
     * Sets the value of the inLcAccountTranshipmntFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInLcAccountTranshipmntFlag(String value) {
        this.inLcAccountTranshipmntFlag = value;
    }

    /**
     * Gets the value of the inLcAccountTransmission property.
     * 
     */
    public short getInLcAccountTransmission() {
        return inLcAccountTransmission;
    }

    /**
     * Sets the value of the inLcAccountTransmission property.
     * 
     */
    public void setInLcAccountTransmission(short value) {
        this.inLcAccountTransmission = value;
    }

    /**
     * Gets the value of the inMonitoringUnitCode property.
     * 
     */
    public int getInMonitoringUnitCode() {
        return inMonitoringUnitCode;
    }

    /**
     * Sets the value of the inMonitoringUnitCode property.
     * 
     */
    public void setInMonitoringUnitCode(int value) {
        this.inMonitoringUnitCode = value;
    }

    /**
     * Gets the value of the inMonitoringUnitUnitName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInMonitoringUnitUnitName() {
        return inMonitoringUnitUnitName;
    }

    /**
     * Sets the value of the inMonitoringUnitUnitName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInMonitoringUnitUnitName(String value) {
        this.inMonitoringUnitUnitName = value;
    }

    /**
     * Gets the value of the inMovingCurrencyIdCurrency property.
     * 
     */
    public int getInMovingCurrencyIdCurrency() {
        return inMovingCurrencyIdCurrency;
    }

    /**
     * Sets the value of the inMovingCurrencyIdCurrency property.
     * 
     */
    public void setInMovingCurrencyIdCurrency(int value) {
        this.inMovingCurrencyIdCurrency = value;
    }

    /**
     * Gets the value of the inMovingCurrencyShortDescr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInMovingCurrencyShortDescr() {
        return inMovingCurrencyShortDescr;
    }

    /**
     * Sets the value of the inMovingCurrencyShortDescr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInMovingCurrencyShortDescr(String value) {
        this.inMovingCurrencyShortDescr = value;
    }

    /**
     * Gets the value of the inNegotiatingSwiftAllnceBicsBankDescr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInNegotiatingSwiftAllnceBicsBankDescr() {
        return inNegotiatingSwiftAllnceBicsBankDescr;
    }

    /**
     * Sets the value of the inNegotiatingSwiftAllnceBicsBankDescr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInNegotiatingSwiftAllnceBicsBankDescr(String value) {
        this.inNegotiatingSwiftAllnceBicsBankDescr = value;
    }

    /**
     * Gets the value of the inNegotiatingSwiftAllnceBicsBic property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInNegotiatingSwiftAllnceBicsBic() {
        return inNegotiatingSwiftAllnceBicsBic;
    }

    /**
     * Sets the value of the inNegotiatingSwiftAllnceBicsBic property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInNegotiatingSwiftAllnceBicsBic(String value) {
        this.inNegotiatingSwiftAllnceBicsBic = value;
    }

    /**
     * Gets the value of the inOpeningUnitCode property.
     * 
     */
    public int getInOpeningUnitCode() {
        return inOpeningUnitCode;
    }

    /**
     * Sets the value of the inOpeningUnitCode property.
     * 
     */
    public void setInOpeningUnitCode(int value) {
        this.inOpeningUnitCode = value;
    }

    /**
     * Gets the value of the inOpeningUnitUnitName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInOpeningUnitUnitName() {
        return inOpeningUnitUnitName;
    }

    /**
     * Sets the value of the inOpeningUnitUnitName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInOpeningUnitUnitName(String value) {
        this.inOpeningUnitUnitName = value;
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
     * Gets the value of the inPrincipalCustomerCDigit property.
     * 
     */
    public short getInPrincipalCustomerCDigit() {
        return inPrincipalCustomerCDigit;
    }

    /**
     * Sets the value of the inPrincipalCustomerCDigit property.
     * 
     */
    public void setInPrincipalCustomerCDigit(short value) {
        this.inPrincipalCustomerCDigit = value;
    }

    /**
     * Gets the value of the inPrincipalCustomerCustId property.
     * 
     */
    public int getInPrincipalCustomerCustId() {
        return inPrincipalCustomerCustId;
    }

    /**
     * Sets the value of the inPrincipalCustomerCustId property.
     * 
     */
    public void setInPrincipalCustomerCustId(int value) {
        this.inPrincipalCustomerCustId = value;
    }

    /**
     * Gets the value of the inPrincipalProfitsAccountAccountCd property.
     * 
     */
    public short getInPrincipalProfitsAccountAccountCd() {
        return inPrincipalProfitsAccountAccountCd;
    }

    /**
     * Sets the value of the inPrincipalProfitsAccountAccountCd property.
     * 
     */
    public void setInPrincipalProfitsAccountAccountCd(short value) {
        this.inPrincipalProfitsAccountAccountCd = value;
    }

    /**
     * Gets the value of the inPrincipalProfitsAccountAccountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInPrincipalProfitsAccountAccountNumber() {
        return inPrincipalProfitsAccountAccountNumber;
    }

    /**
     * Sets the value of the inPrincipalProfitsAccountAccountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInPrincipalProfitsAccountAccountNumber(String value) {
        this.inPrincipalProfitsAccountAccountNumber = value;
    }

    /**
     * Gets the value of the inPrincipalProfitsAccountPrftSystem property.
     * 
     */
    public short getInPrincipalProfitsAccountPrftSystem() {
        return inPrincipalProfitsAccountPrftSystem;
    }

    /**
     * Sets the value of the inPrincipalProfitsAccountPrftSystem property.
     * 
     */
    public void setInPrincipalProfitsAccountPrftSystem(short value) {
        this.inPrincipalProfitsAccountPrftSystem = value;
    }

    /**
     * Gets the value of the inProductDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInProductDescription() {
        return inProductDescription;
    }

    /**
     * Sets the value of the inProductDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInProductDescription(String value) {
        this.inProductDescription = value;
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
     * Gets the value of the inTfTypeIefSuppliedFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInTfTypeIefSuppliedFlag() {
        return inTfTypeIefSuppliedFlag;
    }

    /**
     * Sets the value of the inTfTypeIefSuppliedFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInTfTypeIefSuppliedFlag(String value) {
        this.inTfTypeIefSuppliedFlag = value;
    }

    /**
     * Gets the value of the inTradeFinanceBenefAccCd property.
     * 
     */
    public short getInTradeFinanceBenefAccCd() {
        return inTradeFinanceBenefAccCd;
    }

    /**
     * Sets the value of the inTradeFinanceBenefAccCd property.
     * 
     */
    public void setInTradeFinanceBenefAccCd(short value) {
        this.inTradeFinanceBenefAccCd = value;
    }

    /**
     * Gets the value of the inTradeFinanceBenefAccNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInTradeFinanceBenefAccNum() {
        return inTradeFinanceBenefAccNum;
    }

    /**
     * Sets the value of the inTradeFinanceBenefAccNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInTradeFinanceBenefAccNum(String value) {
        this.inTradeFinanceBenefAccNum = value;
    }

    /**
     * Gets the value of the inTradeFinanceBenefAccPrftSys property.
     * 
     */
    public short getInTradeFinanceBenefAccPrftSys() {
        return inTradeFinanceBenefAccPrftSys;
    }

    /**
     * Sets the value of the inTradeFinanceBenefAccPrftSys property.
     * 
     */
    public void setInTradeFinanceBenefAccPrftSys(short value) {
        this.inTradeFinanceBenefAccPrftSys = value;
    }

    /**
     * Gets the value of the inTradeFinanceBenefCommAddr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInTradeFinanceBenefCommAddr() {
        return inTradeFinanceBenefCommAddr;
    }

    /**
     * Sets the value of the inTradeFinanceBenefCommAddr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInTradeFinanceBenefCommAddr(String value) {
        this.inTradeFinanceBenefCommAddr = value;
    }

    /**
     * Gets the value of the inTradeFinanceBeneficiaryName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInTradeFinanceBeneficiaryName() {
        return inTradeFinanceBeneficiaryName;
    }

    /**
     * Sets the value of the inTradeFinanceBeneficiaryName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInTradeFinanceBeneficiaryName(String value) {
        this.inTradeFinanceBeneficiaryName = value;
    }

    /**
     * Gets the value of the inTradeFinanceComments property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInTradeFinanceComments() {
        return inTradeFinanceComments;
    }

    /**
     * Sets the value of the inTradeFinanceComments property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInTradeFinanceComments(String value) {
        this.inTradeFinanceComments = value;
    }

    /**
     * Gets the value of the inTradeFinanceCorrBankAccCd property.
     * 
     */
    public short getInTradeFinanceCorrBankAccCd() {
        return inTradeFinanceCorrBankAccCd;
    }

    /**
     * Sets the value of the inTradeFinanceCorrBankAccCd property.
     * 
     */
    public void setInTradeFinanceCorrBankAccCd(short value) {
        this.inTradeFinanceCorrBankAccCd = value;
    }

    /**
     * Gets the value of the inTradeFinanceCorrBankAccNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInTradeFinanceCorrBankAccNum() {
        return inTradeFinanceCorrBankAccNum;
    }

    /**
     * Sets the value of the inTradeFinanceCorrBankAccNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInTradeFinanceCorrBankAccNum(String value) {
        this.inTradeFinanceCorrBankAccNum = value;
    }

    /**
     * Gets the value of the inTradeFinanceCorreAccPrftSys property.
     * 
     */
    public short getInTradeFinanceCorreAccPrftSys() {
        return inTradeFinanceCorreAccPrftSys;
    }

    /**
     * Sets the value of the inTradeFinanceCorreAccPrftSys property.
     * 
     */
    public void setInTradeFinanceCorreAccPrftSys(short value) {
        this.inTradeFinanceCorreAccPrftSys = value;
    }

    /**
     * Gets the value of the inTradeFinanceCorrespondentName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInTradeFinanceCorrespondentName() {
        return inTradeFinanceCorrespondentName;
    }

    /**
     * Sets the value of the inTradeFinanceCorrespondentName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInTradeFinanceCorrespondentName(String value) {
        this.inTradeFinanceCorrespondentName = value;
    }

    /**
     * Gets the value of the inTradeFinancePrincAccPrftSys property.
     * 
     */
    public short getInTradeFinancePrincAccPrftSys() {
        return inTradeFinancePrincAccPrftSys;
    }

    /**
     * Sets the value of the inTradeFinancePrincAccPrftSys property.
     * 
     */
    public void setInTradeFinancePrincAccPrftSys(short value) {
        this.inTradeFinancePrincAccPrftSys = value;
    }

    /**
     * Gets the value of the inTradeFinancePrincipalAccCd property.
     * 
     */
    public short getInTradeFinancePrincipalAccCd() {
        return inTradeFinancePrincipalAccCd;
    }

    /**
     * Sets the value of the inTradeFinancePrincipalAccCd property.
     * 
     */
    public void setInTradeFinancePrincipalAccCd(short value) {
        this.inTradeFinancePrincipalAccCd = value;
    }

    /**
     * Gets the value of the inTradeFinancePrincipalAccNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInTradeFinancePrincipalAccNum() {
        return inTradeFinancePrincipalAccNum;
    }

    /**
     * Sets the value of the inTradeFinancePrincipalAccNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInTradeFinancePrincipalAccNum(String value) {
        this.inTradeFinancePrincipalAccNum = value;
    }

    /**
     * Gets the value of the inTradeFinancePrincipalCommAddr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInTradeFinancePrincipalCommAddr() {
        return inTradeFinancePrincipalCommAddr;
    }

    /**
     * Sets the value of the inTradeFinancePrincipalCommAddr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInTradeFinancePrincipalCommAddr(String value) {
        this.inTradeFinancePrincipalCommAddr = value;
    }

    /**
     * Gets the value of the inTradeFinancePrinicipalName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInTradeFinancePrinicipalName() {
        return inTradeFinancePrinicipalName;
    }

    /**
     * Sets the value of the inTradeFinancePrinicipalName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInTradeFinancePrinicipalName(String value) {
        this.inTradeFinancePrinicipalName = value;
    }

    /**
     * Gets the value of the inTradeFinanceRefNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInTradeFinanceRefNo() {
        return inTradeFinanceRefNo;
    }

    /**
     * Sets the value of the inTradeFinanceRefNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInTradeFinanceRefNo(String value) {
        this.inTradeFinanceRefNo = value;
    }

    /**
     * Gets the value of the inTradeFinanceStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInTradeFinanceStatus() {
        return inTradeFinanceStatus;
    }

    /**
     * Sets the value of the inTradeFinanceStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInTradeFinanceStatus(String value) {
        this.inTradeFinanceStatus = value;
    }

    /**
     * Gets the value of the inTradeFinanceTfAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInTradeFinanceTfAmount() {
        return inTradeFinanceTfAmount;
    }

    /**
     * Sets the value of the inTradeFinanceTfAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInTradeFinanceTfAmount(BigDecimal value) {
        this.inTradeFinanceTfAmount = value;
    }

    /**
     * Gets the value of the inTradeFinanceTfCd property.
     * 
     */
    public short getInTradeFinanceTfCd() {
        return inTradeFinanceTfCd;
    }

    /**
     * Sets the value of the inTradeFinanceTfCd property.
     * 
     */
    public void setInTradeFinanceTfCd(short value) {
        this.inTradeFinanceTfCd = value;
    }

    /**
     * Gets the value of the inTradeFinanceTfConfirmDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInTradeFinanceTfConfirmDate() {
        return inTradeFinanceTfConfirmDate;
    }

    /**
     * Sets the value of the inTradeFinanceTfConfirmDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInTradeFinanceTfConfirmDate(XMLGregorianCalendar value) {
        this.inTradeFinanceTfConfirmDate = value;
    }

    /**
     * Gets the value of the inTradeFinanceTfNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInTradeFinanceTfNumber() {
        return inTradeFinanceTfNumber;
    }

    /**
     * Sets the value of the inTradeFinanceTfNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInTradeFinanceTfNumber(String value) {
        this.inTradeFinanceTfNumber = value;
    }

    /**
     * Gets the value of the inTradeFinanceTfOpenDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInTradeFinanceTfOpenDate() {
        return inTradeFinanceTfOpenDate;
    }

    /**
     * Sets the value of the inTradeFinanceTfOpenDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInTradeFinanceTfOpenDate(XMLGregorianCalendar value) {
        this.inTradeFinanceTfOpenDate = value;
    }

    /**
     * Gets the value of the inTradeFinanceTfType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInTradeFinanceTfType() {
        return inTradeFinanceTfType;
    }

    /**
     * Sets the value of the inTradeFinanceTfType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInTradeFinanceTfType(String value) {
        this.inTradeFinanceTfType = value;
    }

    /**
     * Gets the value of the inTradeFinanceTmpstamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInTradeFinanceTmpstamp() {
        return inTradeFinanceTmpstamp;
    }

    /**
     * Sets the value of the inTradeFinanceTmpstamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInTradeFinanceTmpstamp(XMLGregorianCalendar value) {
        this.inTradeFinanceTmpstamp = value;
    }

}
