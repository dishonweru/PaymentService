
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for T2102V_StandingOrderTransferImport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="T2102V_StandingOrderTransferImport">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}BaseImport">
 *       &lt;sequence>
 *         &lt;element name="Command" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InAcctWithBankIefSuppliedNumber5" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InCollBankIefSuppliedNumber5" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InCommandIefSuppliedCommand" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCorrespDebitedCurrencyDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCorrespDebitedCurrencyIdCurrency" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InCorrespDebitedCurrencyShortDescr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCorrespondentBankCustomerCDigit" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InCorrespondentBankCustomerCustId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InCorrespondentBankCustomerCustType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCrAccountListProfitsAccountDepAccAccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCrAccountListProfitsAccountDepAccCheckDigit" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InCrDepositListJustificIdJustific" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InDctIpsMessageStageBenefAddressCountry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InDctIpsMessageStageBenefAddressLine1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InDctIpsMessageStageBenefAddressLine2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InDctIpsMessageStageBenefAddressPostCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InDctIpsMessageStageBenefBankAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InDctIpsMessageStageBenefBicAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InDctIpsMessageStageBenefFullname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InDctIpsMessageStageBenefIdentificationType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InDctIpsMessageStageBenefIdentificationValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InDctIpsMessageStageBenefResident" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InDctIpsMessageStageOrderChargeBearer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InDctIpsMessageStageOrderClearingSystem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InDctIpsMessageStageOrderCurrency" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InDctIpsMessageStageOrderInstrNextAgent3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InDctIpsMessageStageOrderInstrumentCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InDctIpsMessageStageOrderInstrumentJustificId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InDctIpsMessageStageOrderPurposeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InDctIpsMessageStageOrderRemmitanceInfo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InDctIpsMessageStageTpSoIdentifier" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="InDomBankIefSuppliedFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InDrAccountListProfitsAccountDepAccAccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InDrAccountListProfitsAccountDepAccCheckDigit" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InDrCustNameListSetDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InDrDepositListJustificIdJustific" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InIbanCountryCharSuppliedChar2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InIbanCountryContinueCharSuppliedChar16" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InIbanCountryContinueCharSuppliedChar2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InIbanCountryContinueCharSuppliedChar3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InIbanCountryContinueCharSuppliedChar4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InJustificOfDepositCreditJustificIdJustific" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InMontranTpSoBankId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InMontranTpSoBenefAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InMontranTpSoGround" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InMontranTpSoInformation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InMontranTpSoTaxNoTax" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InMontranTpSoTerritoryCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InMontranTpSoTpSoIdentifier" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="InMontranTpSoTreasury" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InOtherAchBankListBankParametersBankName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InOutgoingOrderProdListProductIdProduct" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InOutgoingOrdersAccWithBankSwif" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InOutgoingOrdersAccountWithInstitution" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InOutgoingOrdersBenefAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InOutgoingOrdersCoveringMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InOutgoingOrdersFbCharges" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InOutgoingOrdersStpFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InParametersInBankParametersRateUsage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InParametersInTerminalTerminalNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InPrevTpSoCommitmentEntryStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InPrevTpSoCommitmentTrxUser" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InProfitsAccountAccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InResponsibleUnitCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InSecondaryDebitProfitsAccountDepAccAccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InSecondaryDebitProfitsAccountDepAccCheckDigit" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InServJustifListJustificIdJustific" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InServProdListProductIdProduct" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InSoSwiftCrAccountDtl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InSoSwiftDetailOfCharge" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InSoSwiftFreeText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InSoSwiftInformation1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InSoSwiftInformation2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InSoSwiftInformation3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InSoSwiftInformation4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InSoSwiftInformation5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InSoSwiftInformation6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InSoSwiftJustific1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InSoSwiftJustific2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InSoSwiftJustific3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InSoSwiftJustific4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InSoSwiftOriginCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InSoSwiftReceiverDiasUnit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InSoSwiftServiceCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InSoSwiftTpSoIdentifier" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="InSoSwiftTransCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InSoSwiftValueDays" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InSoSwift103AccWithInsti57a" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InSoSwift103BankOperCod23b" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InSoSwift103BenefCustomer59a" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InSoSwift103Chk13c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InSoSwift103Chk20" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InSoSwift103Chk23b" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InSoSwift103Chk23e" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InSoSwift103Chk26t" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InSoSwift103Chk32a" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InSoSwift103Chk33b" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InSoSwift103Chk36" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InSoSwift103Chk50a" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InSoSwift103Chk51a" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InSoSwift103Chk52a" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InSoSwift103Chk53a" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InSoSwift103Chk54a" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InSoSwift103Chk55a" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InSoSwift103Chk56a" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InSoSwift103Chk57a" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InSoSwift103Chk59a" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InSoSwift103Chk70" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InSoSwift103Chk71a" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InSoSwift103Chk71f" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InSoSwift103Chk71g" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InSoSwift103Chk72" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InSoSwift103Chk77b" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InSoSwift103Chk77t" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InSoSwift103CoveringMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InSoSwift103CurInstrAmn33b" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InSoSwift103DetOfCharges71a" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InSoSwift103EnvlCnts77t" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InSoSwift103ExchangeRate36" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InSoSwift103InstrCode23e" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InSoSwift103IntermInstit56a" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InSoSwift103OrderingCust50a" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InSoSwift103OrderingInsti52a" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InSoSwift103OutgBenefAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InSoSwift103PriorityCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InSoSwift103RcvrsCharges71g" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InSoSwift103RcvrsCorr54a" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InSoSwift103ReceiverBic" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InSoSwift103RegulRpt77b" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InSoSwift103RemtnceInform70" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InSoSwift103SenderBic" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InSoSwift103SendersCorr53a" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InSoSwift103SendingInstit51a" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InSoSwift103SndrToRcvr72" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InSoSwift103SndrsCharges71f" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InSoSwift103StpFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InSoSwift103ThirdReimbIn55a" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InSoSwift103TimeIndicatio13c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InSoSwift103TpSoIdentifier" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="InSoSwift103TrxRefNo20" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InSoSwift103TrxTypeCode26t" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InSoSwift103ValueCurAmn32a" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InSoSwift103ValueDays" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InSoSwift202AccWithInsti57a" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InSoSwift202SndrToRcvr72" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InSoSwift202TpSoIdentifier" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="InSwiftDiasBpProdListProductIdProduct" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InTpSoCommitmentAccProductType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InTpSoCommitmentAchBankCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InTpSoCommitmentActivationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InTpSoCommitmentAdvancesRelated" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InTpSoCommitmentAllowNotExTries" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InTpSoCommitmentBillPayabJustId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InTpSoCommitmentBillPayabProdId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InTpSoCommitmentBookBalanceMargin" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InTpSoCommitmentBopCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InTpSoCommitmentBpBenefAddress1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InTpSoCommitmentBpBenefAddress2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InTpSoCommitmentBpBenefAddress3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InTpSoCommitmentBpBenefCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InTpSoCommitmentBpBenefCountry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InTpSoCommitmentBpBenefName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InTpSoCommitmentBpBenefZipCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InTpSoCommitmentCancelComments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InTpSoCommitmentCommisionDiscount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InTpSoCommitmentCountryCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InTpSoCommitmentCrAccComments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InTpSoCommitmentCrAccCurrency" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InTpSoCommitmentCrAccCustomerCd" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InTpSoCommitmentCrAccCustomerId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InTpSoCommitmentCrBonusCommCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InTpSoCommitmentCrBonusCommDisc" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InTpSoCommitmentCrChargeType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InTpSoCommitmentCrNonResident" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InTpSoCommitmentCrPrintAdvice" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InTpSoCommitmentDataField1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InTpSoCommitmentDataField2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InTpSoCommitmentDataField3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InTpSoCommitmentDataField4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InTpSoCommitmentDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InTpSoCommitmentDiscountCost" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InTpSoCommitmentDrAccComments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InTpSoCommitmentDrAccCurrency" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InTpSoCommitmentDrAccCustomerCd" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InTpSoCommitmentDrAccCustomerId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InTpSoCommitmentDrPrintAdvice" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InTpSoCommitmentEntryStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InTpSoCommitmentFinalizeFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InTpSoCommitmentFirstPaymentAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InTpSoCommitmentFirstPaymentDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InTpSoCommitmentFrequency" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InTpSoCommitmentFrequencyUnit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InTpSoCommitmentGeneralComments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InTpSoCommitmentHolidayInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InTpSoCommitmentInsuffChargeCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InTpSoCommitmentInsuffChargeDisc" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InTpSoCommitmentIssueDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InTpSoCommitmentLastPaymentAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InTpSoCommitmentLastPaymentDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InTpSoCommitmentLastTransferDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InTpSoCommitmentLastUpdateDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InTpSoCommitmentMaxNoOfAttempts" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InTpSoCommitmentNormalActiveDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InTpSoCommitmentOrderIssueJustid" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InTpSoCommitmentOrderIssueProdid" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InTpSoCommitmentOrderSendrecInfo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InTpSoCommitmentOrderSpecialTerm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InTpSoCommitmentOtherBankAccCd" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InTpSoCommitmentOtherBankAccNo" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="InTpSoCommitmentOtherBankAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InTpSoCommitmentOtherBankCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InTpSoCommitmentOtherBankUnit" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InTpSoCommitmentPayeeBank" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InTpSoCommitmentPaymentAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InTpSoCommitmentPaymentsCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InTpSoCommitmentPoFbCharges" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InTpSoCommitmentPrivilegedFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InTpSoCommitmentSectorCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InTpSoCommitmentSoCrChargesInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InTpSoCommitmentSoDrChargesInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InTpSoCommitmentSoSwiftStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InTpSoCommitmentStandOrderMethod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InTpSoCommitmentSuspensDateFrom" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InTpSoCommitmentSuspensDateTo" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InTpSoCommitmentSuspensExecutions" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InTpSoCommitmentTimestmp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InTpSoCommitmentTotalAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InTpSoCommitmentTotalAvailableTr" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InTpSoCommitmentTpCrDrIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InTpSoCommitmentTpSoIdentifier" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="InTpSoCommitmentTpSoIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InTpSoMandateDbAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InTpSoMandateDbBank" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InTpSoMandateDbBranch" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InTpSoMandateOriginatorReference" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InTpSoMandatePolicyNumber1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InTpSoMandatePolicyNumber2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InTpSoMandateRemarks" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InTpSoMandateTpSoIdentifier" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="InGrmMtBics" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}ArrayOfT2102VInGrmMtBicsItem" minOccurs="0"/>
 *         &lt;element name="InGrpDays" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}ArrayOfT2102VInGrpDaysItem" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "T2102V_StandingOrderTransferImport", propOrder = {
    "command",
    "inAcctWithBankIefSuppliedNumber5",
    "inCollBankIefSuppliedNumber5",
    "inCommandIefSuppliedCommand",
    "inCorrespDebitedCurrencyDescription",
    "inCorrespDebitedCurrencyIdCurrency",
    "inCorrespDebitedCurrencyShortDescr",
    "inCorrespondentBankCustomerCDigit",
    "inCorrespondentBankCustomerCustId",
    "inCorrespondentBankCustomerCustType",
    "inCrAccountListProfitsAccountDepAccAccountNumber",
    "inCrAccountListProfitsAccountDepAccCheckDigit",
    "inCrDepositListJustificIdJustific",
    "inDctIpsMessageStageBenefAddressCountry",
    "inDctIpsMessageStageBenefAddressLine1",
    "inDctIpsMessageStageBenefAddressLine2",
    "inDctIpsMessageStageBenefAddressPostCode",
    "inDctIpsMessageStageBenefBankAccount",
    "inDctIpsMessageStageBenefBicAddress",
    "inDctIpsMessageStageBenefFullname",
    "inDctIpsMessageStageBenefIdentificationType",
    "inDctIpsMessageStageBenefIdentificationValue",
    "inDctIpsMessageStageBenefResident",
    "inDctIpsMessageStageOrderChargeBearer",
    "inDctIpsMessageStageOrderClearingSystem",
    "inDctIpsMessageStageOrderCurrency",
    "inDctIpsMessageStageOrderInstrNextAgent3",
    "inDctIpsMessageStageOrderInstrumentCode",
    "inDctIpsMessageStageOrderInstrumentJustificId",
    "inDctIpsMessageStageOrderPurposeCode",
    "inDctIpsMessageStageOrderRemmitanceInfo",
    "inDctIpsMessageStageTpSoIdentifier",
    "inDomBankIefSuppliedFlag",
    "inDrAccountListProfitsAccountDepAccAccountNumber",
    "inDrAccountListProfitsAccountDepAccCheckDigit",
    "inDrCustNameListSetDescription",
    "inDrDepositListJustificIdJustific",
    "inIbanCountryCharSuppliedChar2",
    "inIbanCountryContinueCharSuppliedChar16",
    "inIbanCountryContinueCharSuppliedChar2",
    "inIbanCountryContinueCharSuppliedChar3",
    "inIbanCountryContinueCharSuppliedChar4",
    "inJustificOfDepositCreditJustificIdJustific",
    "inMontranTpSoBankId",
    "inMontranTpSoBenefAccount",
    "inMontranTpSoGround",
    "inMontranTpSoInformation",
    "inMontranTpSoTaxNoTax",
    "inMontranTpSoTerritoryCode",
    "inMontranTpSoTpSoIdentifier",
    "inMontranTpSoTreasury",
    "inOtherAchBankListBankParametersBankName",
    "inOutgoingOrderProdListProductIdProduct",
    "inOutgoingOrdersAccWithBankSwif",
    "inOutgoingOrdersAccountWithInstitution",
    "inOutgoingOrdersBenefAccount",
    "inOutgoingOrdersCoveringMessage",
    "inOutgoingOrdersFbCharges",
    "inOutgoingOrdersStpFlag",
    "inParametersInBankParametersRateUsage",
    "inParametersInTerminalTerminalNumber",
    "inPrevTpSoCommitmentEntryStatus",
    "inPrevTpSoCommitmentTrxUser",
    "inProfitsAccountAccountNumber",
    "inResponsibleUnitCode",
    "inSecondaryDebitProfitsAccountDepAccAccountNumber",
    "inSecondaryDebitProfitsAccountDepAccCheckDigit",
    "inServJustifListJustificIdJustific",
    "inServProdListProductIdProduct",
    "inSoSwiftCrAccountDtl",
    "inSoSwiftDetailOfCharge",
    "inSoSwiftFreeText",
    "inSoSwiftInformation1",
    "inSoSwiftInformation2",
    "inSoSwiftInformation3",
    "inSoSwiftInformation4",
    "inSoSwiftInformation5",
    "inSoSwiftInformation6",
    "inSoSwiftJustific1",
    "inSoSwiftJustific2",
    "inSoSwiftJustific3",
    "inSoSwiftJustific4",
    "inSoSwiftOriginCode",
    "inSoSwiftReceiverDiasUnit",
    "inSoSwiftServiceCode",
    "inSoSwiftTpSoIdentifier",
    "inSoSwiftTransCode",
    "inSoSwiftValueDays",
    "inSoSwift103AccWithInsti57A",
    "inSoSwift103BankOperCod23B",
    "inSoSwift103BenefCustomer59A",
    "inSoSwift103Chk13C",
    "inSoSwift103Chk20",
    "inSoSwift103Chk23B",
    "inSoSwift103Chk23E",
    "inSoSwift103Chk26T",
    "inSoSwift103Chk32A",
    "inSoSwift103Chk33B",
    "inSoSwift103Chk36",
    "inSoSwift103Chk50A",
    "inSoSwift103Chk51A",
    "inSoSwift103Chk52A",
    "inSoSwift103Chk53A",
    "inSoSwift103Chk54A",
    "inSoSwift103Chk55A",
    "inSoSwift103Chk56A",
    "inSoSwift103Chk57A",
    "inSoSwift103Chk59A",
    "inSoSwift103Chk70",
    "inSoSwift103Chk71A",
    "inSoSwift103Chk71F",
    "inSoSwift103Chk71G",
    "inSoSwift103Chk72",
    "inSoSwift103Chk77B",
    "inSoSwift103Chk77T",
    "inSoSwift103CoveringMessage",
    "inSoSwift103CurInstrAmn33B",
    "inSoSwift103DetOfCharges71A",
    "inSoSwift103EnvlCnts77T",
    "inSoSwift103ExchangeRate36",
    "inSoSwift103InstrCode23E",
    "inSoSwift103IntermInstit56A",
    "inSoSwift103OrderingCust50A",
    "inSoSwift103OrderingInsti52A",
    "inSoSwift103OutgBenefAccount",
    "inSoSwift103PriorityCode",
    "inSoSwift103RcvrsCharges71G",
    "inSoSwift103RcvrsCorr54A",
    "inSoSwift103ReceiverBic",
    "inSoSwift103RegulRpt77B",
    "inSoSwift103RemtnceInform70",
    "inSoSwift103SenderBic",
    "inSoSwift103SendersCorr53A",
    "inSoSwift103SendingInstit51A",
    "inSoSwift103SndrToRcvr72",
    "inSoSwift103SndrsCharges71F",
    "inSoSwift103StpFlag",
    "inSoSwift103ThirdReimbIn55A",
    "inSoSwift103TimeIndicatio13C",
    "inSoSwift103TpSoIdentifier",
    "inSoSwift103TrxRefNo20",
    "inSoSwift103TrxTypeCode26T",
    "inSoSwift103ValueCurAmn32A",
    "inSoSwift103ValueDays",
    "inSoSwift202AccWithInsti57A",
    "inSoSwift202SndrToRcvr72",
    "inSoSwift202TpSoIdentifier",
    "inSwiftDiasBpProdListProductIdProduct",
    "inTpSoCommitmentAccProductType",
    "inTpSoCommitmentAchBankCode",
    "inTpSoCommitmentActivationDate",
    "inTpSoCommitmentAdvancesRelated",
    "inTpSoCommitmentAllowNotExTries",
    "inTpSoCommitmentBillPayabJustId",
    "inTpSoCommitmentBillPayabProdId",
    "inTpSoCommitmentBookBalanceMargin",
    "inTpSoCommitmentBopCode",
    "inTpSoCommitmentBpBenefAddress1",
    "inTpSoCommitmentBpBenefAddress2",
    "inTpSoCommitmentBpBenefAddress3",
    "inTpSoCommitmentBpBenefCity",
    "inTpSoCommitmentBpBenefCountry",
    "inTpSoCommitmentBpBenefName",
    "inTpSoCommitmentBpBenefZipCode",
    "inTpSoCommitmentCancelComments",
    "inTpSoCommitmentCommisionDiscount",
    "inTpSoCommitmentCountryCode",
    "inTpSoCommitmentCrAccComments",
    "inTpSoCommitmentCrAccCurrency",
    "inTpSoCommitmentCrAccCustomerCd",
    "inTpSoCommitmentCrAccCustomerId",
    "inTpSoCommitmentCrBonusCommCode",
    "inTpSoCommitmentCrBonusCommDisc",
    "inTpSoCommitmentCrChargeType",
    "inTpSoCommitmentCrNonResident",
    "inTpSoCommitmentCrPrintAdvice",
    "inTpSoCommitmentDataField1",
    "inTpSoCommitmentDataField2",
    "inTpSoCommitmentDataField3",
    "inTpSoCommitmentDataField4",
    "inTpSoCommitmentDescription",
    "inTpSoCommitmentDiscountCost",
    "inTpSoCommitmentDrAccComments",
    "inTpSoCommitmentDrAccCurrency",
    "inTpSoCommitmentDrAccCustomerCd",
    "inTpSoCommitmentDrAccCustomerId",
    "inTpSoCommitmentDrPrintAdvice",
    "inTpSoCommitmentEntryStatus",
    "inTpSoCommitmentFinalizeFlag",
    "inTpSoCommitmentFirstPaymentAmn",
    "inTpSoCommitmentFirstPaymentDate",
    "inTpSoCommitmentFrequency",
    "inTpSoCommitmentFrequencyUnit",
    "inTpSoCommitmentGeneralComments",
    "inTpSoCommitmentHolidayInd",
    "inTpSoCommitmentInsuffChargeCode",
    "inTpSoCommitmentInsuffChargeDisc",
    "inTpSoCommitmentIssueDate",
    "inTpSoCommitmentLastPaymentAmn",
    "inTpSoCommitmentLastPaymentDate",
    "inTpSoCommitmentLastTransferDate",
    "inTpSoCommitmentLastUpdateDate",
    "inTpSoCommitmentMaxNoOfAttempts",
    "inTpSoCommitmentNormalActiveDate",
    "inTpSoCommitmentOrderIssueJustid",
    "inTpSoCommitmentOrderIssueProdid",
    "inTpSoCommitmentOrderSendrecInfo",
    "inTpSoCommitmentOrderSpecialTerm",
    "inTpSoCommitmentOtherBankAccCd",
    "inTpSoCommitmentOtherBankAccNo",
    "inTpSoCommitmentOtherBankAddress",
    "inTpSoCommitmentOtherBankCode",
    "inTpSoCommitmentOtherBankUnit",
    "inTpSoCommitmentPayeeBank",
    "inTpSoCommitmentPaymentAmount",
    "inTpSoCommitmentPaymentsCount",
    "inTpSoCommitmentPoFbCharges",
    "inTpSoCommitmentPrivilegedFlag",
    "inTpSoCommitmentSectorCode",
    "inTpSoCommitmentSoCrChargesInd",
    "inTpSoCommitmentSoDrChargesInd",
    "inTpSoCommitmentSoSwiftStatus",
    "inTpSoCommitmentStandOrderMethod",
    "inTpSoCommitmentSuspensDateFrom",
    "inTpSoCommitmentSuspensDateTo",
    "inTpSoCommitmentSuspensExecutions",
    "inTpSoCommitmentTimestmp",
    "inTpSoCommitmentTotalAmount",
    "inTpSoCommitmentTotalAvailableTr",
    "inTpSoCommitmentTpCrDrIndicator",
    "inTpSoCommitmentTpSoIdentifier",
    "inTpSoCommitmentTpSoIndicator",
    "inTpSoMandateDbAccount",
    "inTpSoMandateDbBank",
    "inTpSoMandateDbBranch",
    "inTpSoMandateOriginatorReference",
    "inTpSoMandatePolicyNumber1",
    "inTpSoMandatePolicyNumber2",
    "inTpSoMandateRemarks",
    "inTpSoMandateTpSoIdentifier",
    "inGrmMtBics",
    "inGrpDays"
})
public class T2102VStandingOrderTransferImport
    extends BaseImport
{

    @XmlElement(name = "Command")
    protected String command;
    @XmlElement(name = "InAcctWithBankIefSuppliedNumber5")
    protected int inAcctWithBankIefSuppliedNumber5;
    @XmlElement(name = "InCollBankIefSuppliedNumber5")
    protected int inCollBankIefSuppliedNumber5;
    @XmlElement(name = "InCommandIefSuppliedCommand")
    protected String inCommandIefSuppliedCommand;
    @XmlElement(name = "InCorrespDebitedCurrencyDescription")
    protected String inCorrespDebitedCurrencyDescription;
    @XmlElement(name = "InCorrespDebitedCurrencyIdCurrency")
    protected int inCorrespDebitedCurrencyIdCurrency;
    @XmlElement(name = "InCorrespDebitedCurrencyShortDescr")
    protected String inCorrespDebitedCurrencyShortDescr;
    @XmlElement(name = "InCorrespondentBankCustomerCDigit")
    protected short inCorrespondentBankCustomerCDigit;
    @XmlElement(name = "InCorrespondentBankCustomerCustId")
    protected int inCorrespondentBankCustomerCustId;
    @XmlElement(name = "InCorrespondentBankCustomerCustType")
    protected String inCorrespondentBankCustomerCustType;
    @XmlElement(name = "InCrAccountListProfitsAccountDepAccAccountNumber")
    protected String inCrAccountListProfitsAccountDepAccAccountNumber;
    @XmlElement(name = "InCrAccountListProfitsAccountDepAccCheckDigit")
    protected short inCrAccountListProfitsAccountDepAccCheckDigit;
    @XmlElement(name = "InCrDepositListJustificIdJustific")
    protected int inCrDepositListJustificIdJustific;
    @XmlElement(name = "InDctIpsMessageStageBenefAddressCountry")
    protected String inDctIpsMessageStageBenefAddressCountry;
    @XmlElement(name = "InDctIpsMessageStageBenefAddressLine1")
    protected String inDctIpsMessageStageBenefAddressLine1;
    @XmlElement(name = "InDctIpsMessageStageBenefAddressLine2")
    protected String inDctIpsMessageStageBenefAddressLine2;
    @XmlElement(name = "InDctIpsMessageStageBenefAddressPostCode")
    protected String inDctIpsMessageStageBenefAddressPostCode;
    @XmlElement(name = "InDctIpsMessageStageBenefBankAccount")
    protected String inDctIpsMessageStageBenefBankAccount;
    @XmlElement(name = "InDctIpsMessageStageBenefBicAddress")
    protected String inDctIpsMessageStageBenefBicAddress;
    @XmlElement(name = "InDctIpsMessageStageBenefFullname")
    protected String inDctIpsMessageStageBenefFullname;
    @XmlElement(name = "InDctIpsMessageStageBenefIdentificationType")
    protected String inDctIpsMessageStageBenefIdentificationType;
    @XmlElement(name = "InDctIpsMessageStageBenefIdentificationValue")
    protected String inDctIpsMessageStageBenefIdentificationValue;
    @XmlElement(name = "InDctIpsMessageStageBenefResident")
    protected String inDctIpsMessageStageBenefResident;
    @XmlElement(name = "InDctIpsMessageStageOrderChargeBearer")
    protected String inDctIpsMessageStageOrderChargeBearer;
    @XmlElement(name = "InDctIpsMessageStageOrderClearingSystem")
    protected String inDctIpsMessageStageOrderClearingSystem;
    @XmlElement(name = "InDctIpsMessageStageOrderCurrency")
    protected int inDctIpsMessageStageOrderCurrency;
    @XmlElement(name = "InDctIpsMessageStageOrderInstrNextAgent3")
    protected String inDctIpsMessageStageOrderInstrNextAgent3;
    @XmlElement(name = "InDctIpsMessageStageOrderInstrumentCode")
    protected String inDctIpsMessageStageOrderInstrumentCode;
    @XmlElement(name = "InDctIpsMessageStageOrderInstrumentJustificId")
    protected int inDctIpsMessageStageOrderInstrumentJustificId;
    @XmlElement(name = "InDctIpsMessageStageOrderPurposeCode")
    protected String inDctIpsMessageStageOrderPurposeCode;
    @XmlElement(name = "InDctIpsMessageStageOrderRemmitanceInfo")
    protected String inDctIpsMessageStageOrderRemmitanceInfo;
    @XmlElement(name = "InDctIpsMessageStageTpSoIdentifier")
    protected double inDctIpsMessageStageTpSoIdentifier;
    @XmlElement(name = "InDomBankIefSuppliedFlag")
    protected String inDomBankIefSuppliedFlag;
    @XmlElement(name = "InDrAccountListProfitsAccountDepAccAccountNumber")
    protected String inDrAccountListProfitsAccountDepAccAccountNumber;
    @XmlElement(name = "InDrAccountListProfitsAccountDepAccCheckDigit")
    protected short inDrAccountListProfitsAccountDepAccCheckDigit;
    @XmlElement(name = "InDrCustNameListSetDescription")
    protected String inDrCustNameListSetDescription;
    @XmlElement(name = "InDrDepositListJustificIdJustific")
    protected int inDrDepositListJustificIdJustific;
    @XmlElement(name = "InIbanCountryCharSuppliedChar2")
    protected String inIbanCountryCharSuppliedChar2;
    @XmlElement(name = "InIbanCountryContinueCharSuppliedChar16")
    protected String inIbanCountryContinueCharSuppliedChar16;
    @XmlElement(name = "InIbanCountryContinueCharSuppliedChar2")
    protected String inIbanCountryContinueCharSuppliedChar2;
    @XmlElement(name = "InIbanCountryContinueCharSuppliedChar3")
    protected String inIbanCountryContinueCharSuppliedChar3;
    @XmlElement(name = "InIbanCountryContinueCharSuppliedChar4")
    protected String inIbanCountryContinueCharSuppliedChar4;
    @XmlElement(name = "InJustificOfDepositCreditJustificIdJustific")
    protected int inJustificOfDepositCreditJustificIdJustific;
    @XmlElement(name = "InMontranTpSoBankId")
    protected String inMontranTpSoBankId;
    @XmlElement(name = "InMontranTpSoBenefAccount")
    protected String inMontranTpSoBenefAccount;
    @XmlElement(name = "InMontranTpSoGround")
    protected String inMontranTpSoGround;
    @XmlElement(name = "InMontranTpSoInformation")
    protected String inMontranTpSoInformation;
    @XmlElement(name = "InMontranTpSoTaxNoTax")
    protected int inMontranTpSoTaxNoTax;
    @XmlElement(name = "InMontranTpSoTerritoryCode")
    protected int inMontranTpSoTerritoryCode;
    @XmlElement(name = "InMontranTpSoTpSoIdentifier")
    protected double inMontranTpSoTpSoIdentifier;
    @XmlElement(name = "InMontranTpSoTreasury")
    protected int inMontranTpSoTreasury;
    @XmlElement(name = "InOtherAchBankListBankParametersBankName")
    protected String inOtherAchBankListBankParametersBankName;
    @XmlElement(name = "InOutgoingOrderProdListProductIdProduct")
    protected int inOutgoingOrderProdListProductIdProduct;
    @XmlElement(name = "InOutgoingOrdersAccWithBankSwif")
    protected String inOutgoingOrdersAccWithBankSwif;
    @XmlElement(name = "InOutgoingOrdersAccountWithInstitution")
    protected String inOutgoingOrdersAccountWithInstitution;
    @XmlElement(name = "InOutgoingOrdersBenefAccount")
    protected String inOutgoingOrdersBenefAccount;
    @XmlElement(name = "InOutgoingOrdersCoveringMessage")
    protected String inOutgoingOrdersCoveringMessage;
    @XmlElement(name = "InOutgoingOrdersFbCharges")
    protected String inOutgoingOrdersFbCharges;
    @XmlElement(name = "InOutgoingOrdersStpFlag")
    protected String inOutgoingOrdersStpFlag;
    @XmlElement(name = "InParametersInBankParametersRateUsage")
    protected String inParametersInBankParametersRateUsage;
    @XmlElement(name = "InParametersInTerminalTerminalNumber")
    protected String inParametersInTerminalTerminalNumber;
    @XmlElement(name = "InPrevTpSoCommitmentEntryStatus")
    protected String inPrevTpSoCommitmentEntryStatus;
    @XmlElement(name = "InPrevTpSoCommitmentTrxUser")
    protected String inPrevTpSoCommitmentTrxUser;
    @XmlElement(name = "InProfitsAccountAccountNumber")
    protected String inProfitsAccountAccountNumber;
    @XmlElement(name = "InResponsibleUnitCode")
    protected int inResponsibleUnitCode;
    @XmlElement(name = "InSecondaryDebitProfitsAccountDepAccAccountNumber")
    protected String inSecondaryDebitProfitsAccountDepAccAccountNumber;
    @XmlElement(name = "InSecondaryDebitProfitsAccountDepAccCheckDigit")
    protected short inSecondaryDebitProfitsAccountDepAccCheckDigit;
    @XmlElement(name = "InServJustifListJustificIdJustific")
    protected int inServJustifListJustificIdJustific;
    @XmlElement(name = "InServProdListProductIdProduct")
    protected int inServProdListProductIdProduct;
    @XmlElement(name = "InSoSwiftCrAccountDtl")
    protected String inSoSwiftCrAccountDtl;
    @XmlElement(name = "InSoSwiftDetailOfCharge")
    protected String inSoSwiftDetailOfCharge;
    @XmlElement(name = "InSoSwiftFreeText")
    protected String inSoSwiftFreeText;
    @XmlElement(name = "InSoSwiftInformation1")
    protected String inSoSwiftInformation1;
    @XmlElement(name = "InSoSwiftInformation2")
    protected String inSoSwiftInformation2;
    @XmlElement(name = "InSoSwiftInformation3")
    protected String inSoSwiftInformation3;
    @XmlElement(name = "InSoSwiftInformation4")
    protected String inSoSwiftInformation4;
    @XmlElement(name = "InSoSwiftInformation5")
    protected String inSoSwiftInformation5;
    @XmlElement(name = "InSoSwiftInformation6")
    protected String inSoSwiftInformation6;
    @XmlElement(name = "InSoSwiftJustific1")
    protected String inSoSwiftJustific1;
    @XmlElement(name = "InSoSwiftJustific2")
    protected String inSoSwiftJustific2;
    @XmlElement(name = "InSoSwiftJustific3")
    protected String inSoSwiftJustific3;
    @XmlElement(name = "InSoSwiftJustific4")
    protected String inSoSwiftJustific4;
    @XmlElement(name = "InSoSwiftOriginCode")
    protected String inSoSwiftOriginCode;
    @XmlElement(name = "InSoSwiftReceiverDiasUnit")
    protected String inSoSwiftReceiverDiasUnit;
    @XmlElement(name = "InSoSwiftServiceCode")
    protected String inSoSwiftServiceCode;
    @XmlElement(name = "InSoSwiftTpSoIdentifier")
    protected double inSoSwiftTpSoIdentifier;
    @XmlElement(name = "InSoSwiftTransCode")
    protected String inSoSwiftTransCode;
    @XmlElement(name = "InSoSwiftValueDays")
    protected short inSoSwiftValueDays;
    @XmlElement(name = "InSoSwift103AccWithInsti57a")
    protected String inSoSwift103AccWithInsti57A;
    @XmlElement(name = "InSoSwift103BankOperCod23b")
    protected String inSoSwift103BankOperCod23B;
    @XmlElement(name = "InSoSwift103BenefCustomer59a")
    protected String inSoSwift103BenefCustomer59A;
    @XmlElement(name = "InSoSwift103Chk13c")
    protected String inSoSwift103Chk13C;
    @XmlElement(name = "InSoSwift103Chk20")
    protected String inSoSwift103Chk20;
    @XmlElement(name = "InSoSwift103Chk23b")
    protected String inSoSwift103Chk23B;
    @XmlElement(name = "InSoSwift103Chk23e")
    protected String inSoSwift103Chk23E;
    @XmlElement(name = "InSoSwift103Chk26t")
    protected String inSoSwift103Chk26T;
    @XmlElement(name = "InSoSwift103Chk32a")
    protected String inSoSwift103Chk32A;
    @XmlElement(name = "InSoSwift103Chk33b")
    protected String inSoSwift103Chk33B;
    @XmlElement(name = "InSoSwift103Chk36")
    protected String inSoSwift103Chk36;
    @XmlElement(name = "InSoSwift103Chk50a")
    protected String inSoSwift103Chk50A;
    @XmlElement(name = "InSoSwift103Chk51a")
    protected String inSoSwift103Chk51A;
    @XmlElement(name = "InSoSwift103Chk52a")
    protected String inSoSwift103Chk52A;
    @XmlElement(name = "InSoSwift103Chk53a")
    protected String inSoSwift103Chk53A;
    @XmlElement(name = "InSoSwift103Chk54a")
    protected String inSoSwift103Chk54A;
    @XmlElement(name = "InSoSwift103Chk55a")
    protected String inSoSwift103Chk55A;
    @XmlElement(name = "InSoSwift103Chk56a")
    protected String inSoSwift103Chk56A;
    @XmlElement(name = "InSoSwift103Chk57a")
    protected String inSoSwift103Chk57A;
    @XmlElement(name = "InSoSwift103Chk59a")
    protected String inSoSwift103Chk59A;
    @XmlElement(name = "InSoSwift103Chk70")
    protected String inSoSwift103Chk70;
    @XmlElement(name = "InSoSwift103Chk71a")
    protected String inSoSwift103Chk71A;
    @XmlElement(name = "InSoSwift103Chk71f")
    protected String inSoSwift103Chk71F;
    @XmlElement(name = "InSoSwift103Chk71g")
    protected String inSoSwift103Chk71G;
    @XmlElement(name = "InSoSwift103Chk72")
    protected String inSoSwift103Chk72;
    @XmlElement(name = "InSoSwift103Chk77b")
    protected String inSoSwift103Chk77B;
    @XmlElement(name = "InSoSwift103Chk77t")
    protected String inSoSwift103Chk77T;
    @XmlElement(name = "InSoSwift103CoveringMessage")
    protected String inSoSwift103CoveringMessage;
    @XmlElement(name = "InSoSwift103CurInstrAmn33b")
    protected String inSoSwift103CurInstrAmn33B;
    @XmlElement(name = "InSoSwift103DetOfCharges71a")
    protected String inSoSwift103DetOfCharges71A;
    @XmlElement(name = "InSoSwift103EnvlCnts77t")
    protected String inSoSwift103EnvlCnts77T;
    @XmlElement(name = "InSoSwift103ExchangeRate36")
    protected String inSoSwift103ExchangeRate36;
    @XmlElement(name = "InSoSwift103InstrCode23e")
    protected String inSoSwift103InstrCode23E;
    @XmlElement(name = "InSoSwift103IntermInstit56a")
    protected String inSoSwift103IntermInstit56A;
    @XmlElement(name = "InSoSwift103OrderingCust50a")
    protected String inSoSwift103OrderingCust50A;
    @XmlElement(name = "InSoSwift103OrderingInsti52a")
    protected String inSoSwift103OrderingInsti52A;
    @XmlElement(name = "InSoSwift103OutgBenefAccount")
    protected String inSoSwift103OutgBenefAccount;
    @XmlElement(name = "InSoSwift103PriorityCode")
    protected String inSoSwift103PriorityCode;
    @XmlElement(name = "InSoSwift103RcvrsCharges71g")
    protected String inSoSwift103RcvrsCharges71G;
    @XmlElement(name = "InSoSwift103RcvrsCorr54a")
    protected String inSoSwift103RcvrsCorr54A;
    @XmlElement(name = "InSoSwift103ReceiverBic")
    protected String inSoSwift103ReceiverBic;
    @XmlElement(name = "InSoSwift103RegulRpt77b")
    protected String inSoSwift103RegulRpt77B;
    @XmlElement(name = "InSoSwift103RemtnceInform70")
    protected String inSoSwift103RemtnceInform70;
    @XmlElement(name = "InSoSwift103SenderBic")
    protected String inSoSwift103SenderBic;
    @XmlElement(name = "InSoSwift103SendersCorr53a")
    protected String inSoSwift103SendersCorr53A;
    @XmlElement(name = "InSoSwift103SendingInstit51a")
    protected String inSoSwift103SendingInstit51A;
    @XmlElement(name = "InSoSwift103SndrToRcvr72")
    protected String inSoSwift103SndrToRcvr72;
    @XmlElement(name = "InSoSwift103SndrsCharges71f")
    protected String inSoSwift103SndrsCharges71F;
    @XmlElement(name = "InSoSwift103StpFlag")
    protected String inSoSwift103StpFlag;
    @XmlElement(name = "InSoSwift103ThirdReimbIn55a")
    protected String inSoSwift103ThirdReimbIn55A;
    @XmlElement(name = "InSoSwift103TimeIndicatio13c")
    protected String inSoSwift103TimeIndicatio13C;
    @XmlElement(name = "InSoSwift103TpSoIdentifier")
    protected double inSoSwift103TpSoIdentifier;
    @XmlElement(name = "InSoSwift103TrxRefNo20")
    protected String inSoSwift103TrxRefNo20;
    @XmlElement(name = "InSoSwift103TrxTypeCode26t")
    protected String inSoSwift103TrxTypeCode26T;
    @XmlElement(name = "InSoSwift103ValueCurAmn32a")
    protected String inSoSwift103ValueCurAmn32A;
    @XmlElement(name = "InSoSwift103ValueDays")
    protected short inSoSwift103ValueDays;
    @XmlElement(name = "InSoSwift202AccWithInsti57a")
    protected String inSoSwift202AccWithInsti57A;
    @XmlElement(name = "InSoSwift202SndrToRcvr72")
    protected String inSoSwift202SndrToRcvr72;
    @XmlElement(name = "InSoSwift202TpSoIdentifier")
    protected double inSoSwift202TpSoIdentifier;
    @XmlElement(name = "InSwiftDiasBpProdListProductIdProduct")
    protected int inSwiftDiasBpProdListProductIdProduct;
    @XmlElement(name = "InTpSoCommitmentAccProductType")
    protected String inTpSoCommitmentAccProductType;
    @XmlElement(name = "InTpSoCommitmentAchBankCode")
    protected String inTpSoCommitmentAchBankCode;
    @XmlElement(name = "InTpSoCommitmentActivationDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inTpSoCommitmentActivationDate;
    @XmlElement(name = "InTpSoCommitmentAdvancesRelated")
    protected String inTpSoCommitmentAdvancesRelated;
    @XmlElement(name = "InTpSoCommitmentAllowNotExTries")
    protected int inTpSoCommitmentAllowNotExTries;
    @XmlElement(name = "InTpSoCommitmentBillPayabJustId")
    protected int inTpSoCommitmentBillPayabJustId;
    @XmlElement(name = "InTpSoCommitmentBillPayabProdId")
    protected int inTpSoCommitmentBillPayabProdId;
    @XmlElement(name = "InTpSoCommitmentBookBalanceMargin", required = true)
    protected BigDecimal inTpSoCommitmentBookBalanceMargin;
    @XmlElement(name = "InTpSoCommitmentBopCode")
    protected String inTpSoCommitmentBopCode;
    @XmlElement(name = "InTpSoCommitmentBpBenefAddress1")
    protected String inTpSoCommitmentBpBenefAddress1;
    @XmlElement(name = "InTpSoCommitmentBpBenefAddress2")
    protected String inTpSoCommitmentBpBenefAddress2;
    @XmlElement(name = "InTpSoCommitmentBpBenefAddress3")
    protected String inTpSoCommitmentBpBenefAddress3;
    @XmlElement(name = "InTpSoCommitmentBpBenefCity")
    protected String inTpSoCommitmentBpBenefCity;
    @XmlElement(name = "InTpSoCommitmentBpBenefCountry")
    protected String inTpSoCommitmentBpBenefCountry;
    @XmlElement(name = "InTpSoCommitmentBpBenefName")
    protected String inTpSoCommitmentBpBenefName;
    @XmlElement(name = "InTpSoCommitmentBpBenefZipCode")
    protected String inTpSoCommitmentBpBenefZipCode;
    @XmlElement(name = "InTpSoCommitmentCancelComments")
    protected String inTpSoCommitmentCancelComments;
    @XmlElement(name = "InTpSoCommitmentCommisionDiscount", required = true)
    protected BigDecimal inTpSoCommitmentCommisionDiscount;
    @XmlElement(name = "InTpSoCommitmentCountryCode")
    protected String inTpSoCommitmentCountryCode;
    @XmlElement(name = "InTpSoCommitmentCrAccComments")
    protected String inTpSoCommitmentCrAccComments;
    @XmlElement(name = "InTpSoCommitmentCrAccCurrency")
    protected int inTpSoCommitmentCrAccCurrency;
    @XmlElement(name = "InTpSoCommitmentCrAccCustomerCd")
    protected short inTpSoCommitmentCrAccCustomerCd;
    @XmlElement(name = "InTpSoCommitmentCrAccCustomerId")
    protected int inTpSoCommitmentCrAccCustomerId;
    @XmlElement(name = "InTpSoCommitmentCrBonusCommCode")
    protected int inTpSoCommitmentCrBonusCommCode;
    @XmlElement(name = "InTpSoCommitmentCrBonusCommDisc", required = true)
    protected BigDecimal inTpSoCommitmentCrBonusCommDisc;
    @XmlElement(name = "InTpSoCommitmentCrChargeType")
    protected String inTpSoCommitmentCrChargeType;
    @XmlElement(name = "InTpSoCommitmentCrNonResident")
    protected String inTpSoCommitmentCrNonResident;
    @XmlElement(name = "InTpSoCommitmentCrPrintAdvice")
    protected String inTpSoCommitmentCrPrintAdvice;
    @XmlElement(name = "InTpSoCommitmentDataField1")
    protected String inTpSoCommitmentDataField1;
    @XmlElement(name = "InTpSoCommitmentDataField2")
    protected String inTpSoCommitmentDataField2;
    @XmlElement(name = "InTpSoCommitmentDataField3")
    protected String inTpSoCommitmentDataField3;
    @XmlElement(name = "InTpSoCommitmentDataField4")
    protected String inTpSoCommitmentDataField4;
    @XmlElement(name = "InTpSoCommitmentDescription")
    protected String inTpSoCommitmentDescription;
    @XmlElement(name = "InTpSoCommitmentDiscountCost", required = true)
    protected BigDecimal inTpSoCommitmentDiscountCost;
    @XmlElement(name = "InTpSoCommitmentDrAccComments")
    protected String inTpSoCommitmentDrAccComments;
    @XmlElement(name = "InTpSoCommitmentDrAccCurrency")
    protected int inTpSoCommitmentDrAccCurrency;
    @XmlElement(name = "InTpSoCommitmentDrAccCustomerCd")
    protected short inTpSoCommitmentDrAccCustomerCd;
    @XmlElement(name = "InTpSoCommitmentDrAccCustomerId")
    protected int inTpSoCommitmentDrAccCustomerId;
    @XmlElement(name = "InTpSoCommitmentDrPrintAdvice")
    protected String inTpSoCommitmentDrPrintAdvice;
    @XmlElement(name = "InTpSoCommitmentEntryStatus")
    protected String inTpSoCommitmentEntryStatus;
    @XmlElement(name = "InTpSoCommitmentFinalizeFlag")
    protected String inTpSoCommitmentFinalizeFlag;
    @XmlElement(name = "InTpSoCommitmentFirstPaymentAmn", required = true)
    protected BigDecimal inTpSoCommitmentFirstPaymentAmn;
    @XmlElement(name = "InTpSoCommitmentFirstPaymentDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inTpSoCommitmentFirstPaymentDate;
    @XmlElement(name = "InTpSoCommitmentFrequency")
    protected short inTpSoCommitmentFrequency;
    @XmlElement(name = "InTpSoCommitmentFrequencyUnit")
    protected String inTpSoCommitmentFrequencyUnit;
    @XmlElement(name = "InTpSoCommitmentGeneralComments")
    protected String inTpSoCommitmentGeneralComments;
    @XmlElement(name = "InTpSoCommitmentHolidayInd")
    protected String inTpSoCommitmentHolidayInd;
    @XmlElement(name = "InTpSoCommitmentInsuffChargeCode")
    protected int inTpSoCommitmentInsuffChargeCode;
    @XmlElement(name = "InTpSoCommitmentInsuffChargeDisc", required = true)
    protected BigDecimal inTpSoCommitmentInsuffChargeDisc;
    @XmlElement(name = "InTpSoCommitmentIssueDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inTpSoCommitmentIssueDate;
    @XmlElement(name = "InTpSoCommitmentLastPaymentAmn", required = true)
    protected BigDecimal inTpSoCommitmentLastPaymentAmn;
    @XmlElement(name = "InTpSoCommitmentLastPaymentDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inTpSoCommitmentLastPaymentDate;
    @XmlElement(name = "InTpSoCommitmentLastTransferDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inTpSoCommitmentLastTransferDate;
    @XmlElement(name = "InTpSoCommitmentLastUpdateDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inTpSoCommitmentLastUpdateDate;
    @XmlElement(name = "InTpSoCommitmentMaxNoOfAttempts")
    protected short inTpSoCommitmentMaxNoOfAttempts;
    @XmlElement(name = "InTpSoCommitmentNormalActiveDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inTpSoCommitmentNormalActiveDate;
    @XmlElement(name = "InTpSoCommitmentOrderIssueJustid")
    protected int inTpSoCommitmentOrderIssueJustid;
    @XmlElement(name = "InTpSoCommitmentOrderIssueProdid")
    protected int inTpSoCommitmentOrderIssueProdid;
    @XmlElement(name = "InTpSoCommitmentOrderSendrecInfo")
    protected String inTpSoCommitmentOrderSendrecInfo;
    @XmlElement(name = "InTpSoCommitmentOrderSpecialTerm")
    protected String inTpSoCommitmentOrderSpecialTerm;
    @XmlElement(name = "InTpSoCommitmentOtherBankAccCd")
    protected short inTpSoCommitmentOtherBankAccCd;
    @XmlElement(name = "InTpSoCommitmentOtherBankAccNo")
    protected double inTpSoCommitmentOtherBankAccNo;
    @XmlElement(name = "InTpSoCommitmentOtherBankAddress")
    protected String inTpSoCommitmentOtherBankAddress;
    @XmlElement(name = "InTpSoCommitmentOtherBankCode")
    protected int inTpSoCommitmentOtherBankCode;
    @XmlElement(name = "InTpSoCommitmentOtherBankUnit")
    protected int inTpSoCommitmentOtherBankUnit;
    @XmlElement(name = "InTpSoCommitmentPayeeBank")
    protected String inTpSoCommitmentPayeeBank;
    @XmlElement(name = "InTpSoCommitmentPaymentAmount", required = true)
    protected BigDecimal inTpSoCommitmentPaymentAmount;
    @XmlElement(name = "InTpSoCommitmentPaymentsCount")
    protected int inTpSoCommitmentPaymentsCount;
    @XmlElement(name = "InTpSoCommitmentPoFbCharges")
    protected String inTpSoCommitmentPoFbCharges;
    @XmlElement(name = "InTpSoCommitmentPrivilegedFlag")
    protected String inTpSoCommitmentPrivilegedFlag;
    @XmlElement(name = "InTpSoCommitmentSectorCode")
    protected String inTpSoCommitmentSectorCode;
    @XmlElement(name = "InTpSoCommitmentSoCrChargesInd")
    protected String inTpSoCommitmentSoCrChargesInd;
    @XmlElement(name = "InTpSoCommitmentSoDrChargesInd")
    protected String inTpSoCommitmentSoDrChargesInd;
    @XmlElement(name = "InTpSoCommitmentSoSwiftStatus")
    protected String inTpSoCommitmentSoSwiftStatus;
    @XmlElement(name = "InTpSoCommitmentStandOrderMethod")
    protected String inTpSoCommitmentStandOrderMethod;
    @XmlElement(name = "InTpSoCommitmentSuspensDateFrom", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inTpSoCommitmentSuspensDateFrom;
    @XmlElement(name = "InTpSoCommitmentSuspensDateTo", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inTpSoCommitmentSuspensDateTo;
    @XmlElement(name = "InTpSoCommitmentSuspensExecutions")
    protected String inTpSoCommitmentSuspensExecutions;
    @XmlElement(name = "InTpSoCommitmentTimestmp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inTpSoCommitmentTimestmp;
    @XmlElement(name = "InTpSoCommitmentTotalAmount", required = true)
    protected BigDecimal inTpSoCommitmentTotalAmount;
    @XmlElement(name = "InTpSoCommitmentTotalAvailableTr")
    protected int inTpSoCommitmentTotalAvailableTr;
    @XmlElement(name = "InTpSoCommitmentTpCrDrIndicator")
    protected String inTpSoCommitmentTpCrDrIndicator;
    @XmlElement(name = "InTpSoCommitmentTpSoIdentifier")
    protected double inTpSoCommitmentTpSoIdentifier;
    @XmlElement(name = "InTpSoCommitmentTpSoIndicator")
    protected String inTpSoCommitmentTpSoIndicator;
    @XmlElement(name = "InTpSoMandateDbAccount")
    protected String inTpSoMandateDbAccount;
    @XmlElement(name = "InTpSoMandateDbBank")
    protected String inTpSoMandateDbBank;
    @XmlElement(name = "InTpSoMandateDbBranch")
    protected String inTpSoMandateDbBranch;
    @XmlElement(name = "InTpSoMandateOriginatorReference")
    protected String inTpSoMandateOriginatorReference;
    @XmlElement(name = "InTpSoMandatePolicyNumber1")
    protected String inTpSoMandatePolicyNumber1;
    @XmlElement(name = "InTpSoMandatePolicyNumber2")
    protected String inTpSoMandatePolicyNumber2;
    @XmlElement(name = "InTpSoMandateRemarks")
    protected String inTpSoMandateRemarks;
    @XmlElement(name = "InTpSoMandateTpSoIdentifier")
    protected double inTpSoMandateTpSoIdentifier;
    @XmlElement(name = "InGrmMtBics")
    protected ArrayOfT2102VInGrmMtBicsItem inGrmMtBics;
    @XmlElement(name = "InGrpDays")
    protected ArrayOfT2102VInGrpDaysItem inGrpDays;

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
     * Gets the value of the inAcctWithBankIefSuppliedNumber5 property.
     * 
     */
    public int getInAcctWithBankIefSuppliedNumber5() {
        return inAcctWithBankIefSuppliedNumber5;
    }

    /**
     * Sets the value of the inAcctWithBankIefSuppliedNumber5 property.
     * 
     */
    public void setInAcctWithBankIefSuppliedNumber5(int value) {
        this.inAcctWithBankIefSuppliedNumber5 = value;
    }

    /**
     * Gets the value of the inCollBankIefSuppliedNumber5 property.
     * 
     */
    public int getInCollBankIefSuppliedNumber5() {
        return inCollBankIefSuppliedNumber5;
    }

    /**
     * Sets the value of the inCollBankIefSuppliedNumber5 property.
     * 
     */
    public void setInCollBankIefSuppliedNumber5(int value) {
        this.inCollBankIefSuppliedNumber5 = value;
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
     * Gets the value of the inCorrespDebitedCurrencyDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCorrespDebitedCurrencyDescription() {
        return inCorrespDebitedCurrencyDescription;
    }

    /**
     * Sets the value of the inCorrespDebitedCurrencyDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCorrespDebitedCurrencyDescription(String value) {
        this.inCorrespDebitedCurrencyDescription = value;
    }

    /**
     * Gets the value of the inCorrespDebitedCurrencyIdCurrency property.
     * 
     */
    public int getInCorrespDebitedCurrencyIdCurrency() {
        return inCorrespDebitedCurrencyIdCurrency;
    }

    /**
     * Sets the value of the inCorrespDebitedCurrencyIdCurrency property.
     * 
     */
    public void setInCorrespDebitedCurrencyIdCurrency(int value) {
        this.inCorrespDebitedCurrencyIdCurrency = value;
    }

    /**
     * Gets the value of the inCorrespDebitedCurrencyShortDescr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCorrespDebitedCurrencyShortDescr() {
        return inCorrespDebitedCurrencyShortDescr;
    }

    /**
     * Sets the value of the inCorrespDebitedCurrencyShortDescr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCorrespDebitedCurrencyShortDescr(String value) {
        this.inCorrespDebitedCurrencyShortDescr = value;
    }

    /**
     * Gets the value of the inCorrespondentBankCustomerCDigit property.
     * 
     */
    public short getInCorrespondentBankCustomerCDigit() {
        return inCorrespondentBankCustomerCDigit;
    }

    /**
     * Sets the value of the inCorrespondentBankCustomerCDigit property.
     * 
     */
    public void setInCorrespondentBankCustomerCDigit(short value) {
        this.inCorrespondentBankCustomerCDigit = value;
    }

    /**
     * Gets the value of the inCorrespondentBankCustomerCustId property.
     * 
     */
    public int getInCorrespondentBankCustomerCustId() {
        return inCorrespondentBankCustomerCustId;
    }

    /**
     * Sets the value of the inCorrespondentBankCustomerCustId property.
     * 
     */
    public void setInCorrespondentBankCustomerCustId(int value) {
        this.inCorrespondentBankCustomerCustId = value;
    }

    /**
     * Gets the value of the inCorrespondentBankCustomerCustType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCorrespondentBankCustomerCustType() {
        return inCorrespondentBankCustomerCustType;
    }

    /**
     * Sets the value of the inCorrespondentBankCustomerCustType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCorrespondentBankCustomerCustType(String value) {
        this.inCorrespondentBankCustomerCustType = value;
    }

    /**
     * Gets the value of the inCrAccountListProfitsAccountDepAccAccountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCrAccountListProfitsAccountDepAccAccountNumber() {
        return inCrAccountListProfitsAccountDepAccAccountNumber;
    }

    /**
     * Sets the value of the inCrAccountListProfitsAccountDepAccAccountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCrAccountListProfitsAccountDepAccAccountNumber(String value) {
        this.inCrAccountListProfitsAccountDepAccAccountNumber = value;
    }

    /**
     * Gets the value of the inCrAccountListProfitsAccountDepAccCheckDigit property.
     * 
     */
    public short getInCrAccountListProfitsAccountDepAccCheckDigit() {
        return inCrAccountListProfitsAccountDepAccCheckDigit;
    }

    /**
     * Sets the value of the inCrAccountListProfitsAccountDepAccCheckDigit property.
     * 
     */
    public void setInCrAccountListProfitsAccountDepAccCheckDigit(short value) {
        this.inCrAccountListProfitsAccountDepAccCheckDigit = value;
    }

    /**
     * Gets the value of the inCrDepositListJustificIdJustific property.
     * 
     */
    public int getInCrDepositListJustificIdJustific() {
        return inCrDepositListJustificIdJustific;
    }

    /**
     * Sets the value of the inCrDepositListJustificIdJustific property.
     * 
     */
    public void setInCrDepositListJustificIdJustific(int value) {
        this.inCrDepositListJustificIdJustific = value;
    }

    /**
     * Gets the value of the inDctIpsMessageStageBenefAddressCountry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInDctIpsMessageStageBenefAddressCountry() {
        return inDctIpsMessageStageBenefAddressCountry;
    }

    /**
     * Sets the value of the inDctIpsMessageStageBenefAddressCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInDctIpsMessageStageBenefAddressCountry(String value) {
        this.inDctIpsMessageStageBenefAddressCountry = value;
    }

    /**
     * Gets the value of the inDctIpsMessageStageBenefAddressLine1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInDctIpsMessageStageBenefAddressLine1() {
        return inDctIpsMessageStageBenefAddressLine1;
    }

    /**
     * Sets the value of the inDctIpsMessageStageBenefAddressLine1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInDctIpsMessageStageBenefAddressLine1(String value) {
        this.inDctIpsMessageStageBenefAddressLine1 = value;
    }

    /**
     * Gets the value of the inDctIpsMessageStageBenefAddressLine2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInDctIpsMessageStageBenefAddressLine2() {
        return inDctIpsMessageStageBenefAddressLine2;
    }

    /**
     * Sets the value of the inDctIpsMessageStageBenefAddressLine2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInDctIpsMessageStageBenefAddressLine2(String value) {
        this.inDctIpsMessageStageBenefAddressLine2 = value;
    }

    /**
     * Gets the value of the inDctIpsMessageStageBenefAddressPostCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInDctIpsMessageStageBenefAddressPostCode() {
        return inDctIpsMessageStageBenefAddressPostCode;
    }

    /**
     * Sets the value of the inDctIpsMessageStageBenefAddressPostCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInDctIpsMessageStageBenefAddressPostCode(String value) {
        this.inDctIpsMessageStageBenefAddressPostCode = value;
    }

    /**
     * Gets the value of the inDctIpsMessageStageBenefBankAccount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInDctIpsMessageStageBenefBankAccount() {
        return inDctIpsMessageStageBenefBankAccount;
    }

    /**
     * Sets the value of the inDctIpsMessageStageBenefBankAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInDctIpsMessageStageBenefBankAccount(String value) {
        this.inDctIpsMessageStageBenefBankAccount = value;
    }

    /**
     * Gets the value of the inDctIpsMessageStageBenefBicAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInDctIpsMessageStageBenefBicAddress() {
        return inDctIpsMessageStageBenefBicAddress;
    }

    /**
     * Sets the value of the inDctIpsMessageStageBenefBicAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInDctIpsMessageStageBenefBicAddress(String value) {
        this.inDctIpsMessageStageBenefBicAddress = value;
    }

    /**
     * Gets the value of the inDctIpsMessageStageBenefFullname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInDctIpsMessageStageBenefFullname() {
        return inDctIpsMessageStageBenefFullname;
    }

    /**
     * Sets the value of the inDctIpsMessageStageBenefFullname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInDctIpsMessageStageBenefFullname(String value) {
        this.inDctIpsMessageStageBenefFullname = value;
    }

    /**
     * Gets the value of the inDctIpsMessageStageBenefIdentificationType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInDctIpsMessageStageBenefIdentificationType() {
        return inDctIpsMessageStageBenefIdentificationType;
    }

    /**
     * Sets the value of the inDctIpsMessageStageBenefIdentificationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInDctIpsMessageStageBenefIdentificationType(String value) {
        this.inDctIpsMessageStageBenefIdentificationType = value;
    }

    /**
     * Gets the value of the inDctIpsMessageStageBenefIdentificationValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInDctIpsMessageStageBenefIdentificationValue() {
        return inDctIpsMessageStageBenefIdentificationValue;
    }

    /**
     * Sets the value of the inDctIpsMessageStageBenefIdentificationValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInDctIpsMessageStageBenefIdentificationValue(String value) {
        this.inDctIpsMessageStageBenefIdentificationValue = value;
    }

    /**
     * Gets the value of the inDctIpsMessageStageBenefResident property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInDctIpsMessageStageBenefResident() {
        return inDctIpsMessageStageBenefResident;
    }

    /**
     * Sets the value of the inDctIpsMessageStageBenefResident property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInDctIpsMessageStageBenefResident(String value) {
        this.inDctIpsMessageStageBenefResident = value;
    }

    /**
     * Gets the value of the inDctIpsMessageStageOrderChargeBearer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInDctIpsMessageStageOrderChargeBearer() {
        return inDctIpsMessageStageOrderChargeBearer;
    }

    /**
     * Sets the value of the inDctIpsMessageStageOrderChargeBearer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInDctIpsMessageStageOrderChargeBearer(String value) {
        this.inDctIpsMessageStageOrderChargeBearer = value;
    }

    /**
     * Gets the value of the inDctIpsMessageStageOrderClearingSystem property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInDctIpsMessageStageOrderClearingSystem() {
        return inDctIpsMessageStageOrderClearingSystem;
    }

    /**
     * Sets the value of the inDctIpsMessageStageOrderClearingSystem property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInDctIpsMessageStageOrderClearingSystem(String value) {
        this.inDctIpsMessageStageOrderClearingSystem = value;
    }

    /**
     * Gets the value of the inDctIpsMessageStageOrderCurrency property.
     * 
     */
    public int getInDctIpsMessageStageOrderCurrency() {
        return inDctIpsMessageStageOrderCurrency;
    }

    /**
     * Sets the value of the inDctIpsMessageStageOrderCurrency property.
     * 
     */
    public void setInDctIpsMessageStageOrderCurrency(int value) {
        this.inDctIpsMessageStageOrderCurrency = value;
    }

    /**
     * Gets the value of the inDctIpsMessageStageOrderInstrNextAgent3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInDctIpsMessageStageOrderInstrNextAgent3() {
        return inDctIpsMessageStageOrderInstrNextAgent3;
    }

    /**
     * Sets the value of the inDctIpsMessageStageOrderInstrNextAgent3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInDctIpsMessageStageOrderInstrNextAgent3(String value) {
        this.inDctIpsMessageStageOrderInstrNextAgent3 = value;
    }

    /**
     * Gets the value of the inDctIpsMessageStageOrderInstrumentCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInDctIpsMessageStageOrderInstrumentCode() {
        return inDctIpsMessageStageOrderInstrumentCode;
    }

    /**
     * Sets the value of the inDctIpsMessageStageOrderInstrumentCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInDctIpsMessageStageOrderInstrumentCode(String value) {
        this.inDctIpsMessageStageOrderInstrumentCode = value;
    }

    /**
     * Gets the value of the inDctIpsMessageStageOrderInstrumentJustificId property.
     * 
     */
    public int getInDctIpsMessageStageOrderInstrumentJustificId() {
        return inDctIpsMessageStageOrderInstrumentJustificId;
    }

    /**
     * Sets the value of the inDctIpsMessageStageOrderInstrumentJustificId property.
     * 
     */
    public void setInDctIpsMessageStageOrderInstrumentJustificId(int value) {
        this.inDctIpsMessageStageOrderInstrumentJustificId = value;
    }

    /**
     * Gets the value of the inDctIpsMessageStageOrderPurposeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInDctIpsMessageStageOrderPurposeCode() {
        return inDctIpsMessageStageOrderPurposeCode;
    }

    /**
     * Sets the value of the inDctIpsMessageStageOrderPurposeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInDctIpsMessageStageOrderPurposeCode(String value) {
        this.inDctIpsMessageStageOrderPurposeCode = value;
    }

    /**
     * Gets the value of the inDctIpsMessageStageOrderRemmitanceInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInDctIpsMessageStageOrderRemmitanceInfo() {
        return inDctIpsMessageStageOrderRemmitanceInfo;
    }

    /**
     * Sets the value of the inDctIpsMessageStageOrderRemmitanceInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInDctIpsMessageStageOrderRemmitanceInfo(String value) {
        this.inDctIpsMessageStageOrderRemmitanceInfo = value;
    }

    /**
     * Gets the value of the inDctIpsMessageStageTpSoIdentifier property.
     * 
     */
    public double getInDctIpsMessageStageTpSoIdentifier() {
        return inDctIpsMessageStageTpSoIdentifier;
    }

    /**
     * Sets the value of the inDctIpsMessageStageTpSoIdentifier property.
     * 
     */
    public void setInDctIpsMessageStageTpSoIdentifier(double value) {
        this.inDctIpsMessageStageTpSoIdentifier = value;
    }

    /**
     * Gets the value of the inDomBankIefSuppliedFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInDomBankIefSuppliedFlag() {
        return inDomBankIefSuppliedFlag;
    }

    /**
     * Sets the value of the inDomBankIefSuppliedFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInDomBankIefSuppliedFlag(String value) {
        this.inDomBankIefSuppliedFlag = value;
    }

    /**
     * Gets the value of the inDrAccountListProfitsAccountDepAccAccountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInDrAccountListProfitsAccountDepAccAccountNumber() {
        return inDrAccountListProfitsAccountDepAccAccountNumber;
    }

    /**
     * Sets the value of the inDrAccountListProfitsAccountDepAccAccountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInDrAccountListProfitsAccountDepAccAccountNumber(String value) {
        this.inDrAccountListProfitsAccountDepAccAccountNumber = value;
    }

    /**
     * Gets the value of the inDrAccountListProfitsAccountDepAccCheckDigit property.
     * 
     */
    public short getInDrAccountListProfitsAccountDepAccCheckDigit() {
        return inDrAccountListProfitsAccountDepAccCheckDigit;
    }

    /**
     * Sets the value of the inDrAccountListProfitsAccountDepAccCheckDigit property.
     * 
     */
    public void setInDrAccountListProfitsAccountDepAccCheckDigit(short value) {
        this.inDrAccountListProfitsAccountDepAccCheckDigit = value;
    }

    /**
     * Gets the value of the inDrCustNameListSetDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInDrCustNameListSetDescription() {
        return inDrCustNameListSetDescription;
    }

    /**
     * Sets the value of the inDrCustNameListSetDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInDrCustNameListSetDescription(String value) {
        this.inDrCustNameListSetDescription = value;
    }

    /**
     * Gets the value of the inDrDepositListJustificIdJustific property.
     * 
     */
    public int getInDrDepositListJustificIdJustific() {
        return inDrDepositListJustificIdJustific;
    }

    /**
     * Sets the value of the inDrDepositListJustificIdJustific property.
     * 
     */
    public void setInDrDepositListJustificIdJustific(int value) {
        this.inDrDepositListJustificIdJustific = value;
    }

    /**
     * Gets the value of the inIbanCountryCharSuppliedChar2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInIbanCountryCharSuppliedChar2() {
        return inIbanCountryCharSuppliedChar2;
    }

    /**
     * Sets the value of the inIbanCountryCharSuppliedChar2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInIbanCountryCharSuppliedChar2(String value) {
        this.inIbanCountryCharSuppliedChar2 = value;
    }

    /**
     * Gets the value of the inIbanCountryContinueCharSuppliedChar16 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInIbanCountryContinueCharSuppliedChar16() {
        return inIbanCountryContinueCharSuppliedChar16;
    }

    /**
     * Sets the value of the inIbanCountryContinueCharSuppliedChar16 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInIbanCountryContinueCharSuppliedChar16(String value) {
        this.inIbanCountryContinueCharSuppliedChar16 = value;
    }

    /**
     * Gets the value of the inIbanCountryContinueCharSuppliedChar2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInIbanCountryContinueCharSuppliedChar2() {
        return inIbanCountryContinueCharSuppliedChar2;
    }

    /**
     * Sets the value of the inIbanCountryContinueCharSuppliedChar2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInIbanCountryContinueCharSuppliedChar2(String value) {
        this.inIbanCountryContinueCharSuppliedChar2 = value;
    }

    /**
     * Gets the value of the inIbanCountryContinueCharSuppliedChar3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInIbanCountryContinueCharSuppliedChar3() {
        return inIbanCountryContinueCharSuppliedChar3;
    }

    /**
     * Sets the value of the inIbanCountryContinueCharSuppliedChar3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInIbanCountryContinueCharSuppliedChar3(String value) {
        this.inIbanCountryContinueCharSuppliedChar3 = value;
    }

    /**
     * Gets the value of the inIbanCountryContinueCharSuppliedChar4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInIbanCountryContinueCharSuppliedChar4() {
        return inIbanCountryContinueCharSuppliedChar4;
    }

    /**
     * Sets the value of the inIbanCountryContinueCharSuppliedChar4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInIbanCountryContinueCharSuppliedChar4(String value) {
        this.inIbanCountryContinueCharSuppliedChar4 = value;
    }

    /**
     * Gets the value of the inJustificOfDepositCreditJustificIdJustific property.
     * 
     */
    public int getInJustificOfDepositCreditJustificIdJustific() {
        return inJustificOfDepositCreditJustificIdJustific;
    }

    /**
     * Sets the value of the inJustificOfDepositCreditJustificIdJustific property.
     * 
     */
    public void setInJustificOfDepositCreditJustificIdJustific(int value) {
        this.inJustificOfDepositCreditJustificIdJustific = value;
    }

    /**
     * Gets the value of the inMontranTpSoBankId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInMontranTpSoBankId() {
        return inMontranTpSoBankId;
    }

    /**
     * Sets the value of the inMontranTpSoBankId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInMontranTpSoBankId(String value) {
        this.inMontranTpSoBankId = value;
    }

    /**
     * Gets the value of the inMontranTpSoBenefAccount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInMontranTpSoBenefAccount() {
        return inMontranTpSoBenefAccount;
    }

    /**
     * Sets the value of the inMontranTpSoBenefAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInMontranTpSoBenefAccount(String value) {
        this.inMontranTpSoBenefAccount = value;
    }

    /**
     * Gets the value of the inMontranTpSoGround property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInMontranTpSoGround() {
        return inMontranTpSoGround;
    }

    /**
     * Sets the value of the inMontranTpSoGround property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInMontranTpSoGround(String value) {
        this.inMontranTpSoGround = value;
    }

    /**
     * Gets the value of the inMontranTpSoInformation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInMontranTpSoInformation() {
        return inMontranTpSoInformation;
    }

    /**
     * Sets the value of the inMontranTpSoInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInMontranTpSoInformation(String value) {
        this.inMontranTpSoInformation = value;
    }

    /**
     * Gets the value of the inMontranTpSoTaxNoTax property.
     * 
     */
    public int getInMontranTpSoTaxNoTax() {
        return inMontranTpSoTaxNoTax;
    }

    /**
     * Sets the value of the inMontranTpSoTaxNoTax property.
     * 
     */
    public void setInMontranTpSoTaxNoTax(int value) {
        this.inMontranTpSoTaxNoTax = value;
    }

    /**
     * Gets the value of the inMontranTpSoTerritoryCode property.
     * 
     */
    public int getInMontranTpSoTerritoryCode() {
        return inMontranTpSoTerritoryCode;
    }

    /**
     * Sets the value of the inMontranTpSoTerritoryCode property.
     * 
     */
    public void setInMontranTpSoTerritoryCode(int value) {
        this.inMontranTpSoTerritoryCode = value;
    }

    /**
     * Gets the value of the inMontranTpSoTpSoIdentifier property.
     * 
     */
    public double getInMontranTpSoTpSoIdentifier() {
        return inMontranTpSoTpSoIdentifier;
    }

    /**
     * Sets the value of the inMontranTpSoTpSoIdentifier property.
     * 
     */
    public void setInMontranTpSoTpSoIdentifier(double value) {
        this.inMontranTpSoTpSoIdentifier = value;
    }

    /**
     * Gets the value of the inMontranTpSoTreasury property.
     * 
     */
    public int getInMontranTpSoTreasury() {
        return inMontranTpSoTreasury;
    }

    /**
     * Sets the value of the inMontranTpSoTreasury property.
     * 
     */
    public void setInMontranTpSoTreasury(int value) {
        this.inMontranTpSoTreasury = value;
    }

    /**
     * Gets the value of the inOtherAchBankListBankParametersBankName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInOtherAchBankListBankParametersBankName() {
        return inOtherAchBankListBankParametersBankName;
    }

    /**
     * Sets the value of the inOtherAchBankListBankParametersBankName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInOtherAchBankListBankParametersBankName(String value) {
        this.inOtherAchBankListBankParametersBankName = value;
    }

    /**
     * Gets the value of the inOutgoingOrderProdListProductIdProduct property.
     * 
     */
    public int getInOutgoingOrderProdListProductIdProduct() {
        return inOutgoingOrderProdListProductIdProduct;
    }

    /**
     * Sets the value of the inOutgoingOrderProdListProductIdProduct property.
     * 
     */
    public void setInOutgoingOrderProdListProductIdProduct(int value) {
        this.inOutgoingOrderProdListProductIdProduct = value;
    }

    /**
     * Gets the value of the inOutgoingOrdersAccWithBankSwif property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInOutgoingOrdersAccWithBankSwif() {
        return inOutgoingOrdersAccWithBankSwif;
    }

    /**
     * Sets the value of the inOutgoingOrdersAccWithBankSwif property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInOutgoingOrdersAccWithBankSwif(String value) {
        this.inOutgoingOrdersAccWithBankSwif = value;
    }

    /**
     * Gets the value of the inOutgoingOrdersAccountWithInstitution property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInOutgoingOrdersAccountWithInstitution() {
        return inOutgoingOrdersAccountWithInstitution;
    }

    /**
     * Sets the value of the inOutgoingOrdersAccountWithInstitution property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInOutgoingOrdersAccountWithInstitution(String value) {
        this.inOutgoingOrdersAccountWithInstitution = value;
    }

    /**
     * Gets the value of the inOutgoingOrdersBenefAccount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInOutgoingOrdersBenefAccount() {
        return inOutgoingOrdersBenefAccount;
    }

    /**
     * Sets the value of the inOutgoingOrdersBenefAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInOutgoingOrdersBenefAccount(String value) {
        this.inOutgoingOrdersBenefAccount = value;
    }

    /**
     * Gets the value of the inOutgoingOrdersCoveringMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInOutgoingOrdersCoveringMessage() {
        return inOutgoingOrdersCoveringMessage;
    }

    /**
     * Sets the value of the inOutgoingOrdersCoveringMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInOutgoingOrdersCoveringMessage(String value) {
        this.inOutgoingOrdersCoveringMessage = value;
    }

    /**
     * Gets the value of the inOutgoingOrdersFbCharges property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInOutgoingOrdersFbCharges() {
        return inOutgoingOrdersFbCharges;
    }

    /**
     * Sets the value of the inOutgoingOrdersFbCharges property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInOutgoingOrdersFbCharges(String value) {
        this.inOutgoingOrdersFbCharges = value;
    }

    /**
     * Gets the value of the inOutgoingOrdersStpFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInOutgoingOrdersStpFlag() {
        return inOutgoingOrdersStpFlag;
    }

    /**
     * Sets the value of the inOutgoingOrdersStpFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInOutgoingOrdersStpFlag(String value) {
        this.inOutgoingOrdersStpFlag = value;
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
     * Gets the value of the inPrevTpSoCommitmentEntryStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInPrevTpSoCommitmentEntryStatus() {
        return inPrevTpSoCommitmentEntryStatus;
    }

    /**
     * Sets the value of the inPrevTpSoCommitmentEntryStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInPrevTpSoCommitmentEntryStatus(String value) {
        this.inPrevTpSoCommitmentEntryStatus = value;
    }

    /**
     * Gets the value of the inPrevTpSoCommitmentTrxUser property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInPrevTpSoCommitmentTrxUser() {
        return inPrevTpSoCommitmentTrxUser;
    }

    /**
     * Sets the value of the inPrevTpSoCommitmentTrxUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInPrevTpSoCommitmentTrxUser(String value) {
        this.inPrevTpSoCommitmentTrxUser = value;
    }

    /**
     * Gets the value of the inProfitsAccountAccountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInProfitsAccountAccountNumber() {
        return inProfitsAccountAccountNumber;
    }

    /**
     * Sets the value of the inProfitsAccountAccountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInProfitsAccountAccountNumber(String value) {
        this.inProfitsAccountAccountNumber = value;
    }

    /**
     * Gets the value of the inResponsibleUnitCode property.
     * 
     */
    public int getInResponsibleUnitCode() {
        return inResponsibleUnitCode;
    }

    /**
     * Sets the value of the inResponsibleUnitCode property.
     * 
     */
    public void setInResponsibleUnitCode(int value) {
        this.inResponsibleUnitCode = value;
    }

    /**
     * Gets the value of the inSecondaryDebitProfitsAccountDepAccAccountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInSecondaryDebitProfitsAccountDepAccAccountNumber() {
        return inSecondaryDebitProfitsAccountDepAccAccountNumber;
    }

    /**
     * Sets the value of the inSecondaryDebitProfitsAccountDepAccAccountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInSecondaryDebitProfitsAccountDepAccAccountNumber(String value) {
        this.inSecondaryDebitProfitsAccountDepAccAccountNumber = value;
    }

    /**
     * Gets the value of the inSecondaryDebitProfitsAccountDepAccCheckDigit property.
     * 
     */
    public short getInSecondaryDebitProfitsAccountDepAccCheckDigit() {
        return inSecondaryDebitProfitsAccountDepAccCheckDigit;
    }

    /**
     * Sets the value of the inSecondaryDebitProfitsAccountDepAccCheckDigit property.
     * 
     */
    public void setInSecondaryDebitProfitsAccountDepAccCheckDigit(short value) {
        this.inSecondaryDebitProfitsAccountDepAccCheckDigit = value;
    }

    /**
     * Gets the value of the inServJustifListJustificIdJustific property.
     * 
     */
    public int getInServJustifListJustificIdJustific() {
        return inServJustifListJustificIdJustific;
    }

    /**
     * Sets the value of the inServJustifListJustificIdJustific property.
     * 
     */
    public void setInServJustifListJustificIdJustific(int value) {
        this.inServJustifListJustificIdJustific = value;
    }

    /**
     * Gets the value of the inServProdListProductIdProduct property.
     * 
     */
    public int getInServProdListProductIdProduct() {
        return inServProdListProductIdProduct;
    }

    /**
     * Sets the value of the inServProdListProductIdProduct property.
     * 
     */
    public void setInServProdListProductIdProduct(int value) {
        this.inServProdListProductIdProduct = value;
    }

    /**
     * Gets the value of the inSoSwiftCrAccountDtl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInSoSwiftCrAccountDtl() {
        return inSoSwiftCrAccountDtl;
    }

    /**
     * Sets the value of the inSoSwiftCrAccountDtl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInSoSwiftCrAccountDtl(String value) {
        this.inSoSwiftCrAccountDtl = value;
    }

    /**
     * Gets the value of the inSoSwiftDetailOfCharge property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInSoSwiftDetailOfCharge() {
        return inSoSwiftDetailOfCharge;
    }

    /**
     * Sets the value of the inSoSwiftDetailOfCharge property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInSoSwiftDetailOfCharge(String value) {
        this.inSoSwiftDetailOfCharge = value;
    }

    /**
     * Gets the value of the inSoSwiftFreeText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInSoSwiftFreeText() {
        return inSoSwiftFreeText;
    }

    /**
     * Sets the value of the inSoSwiftFreeText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInSoSwiftFreeText(String value) {
        this.inSoSwiftFreeText = value;
    }

    /**
     * Gets the value of the inSoSwiftInformation1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInSoSwiftInformation1() {
        return inSoSwiftInformation1;
    }

    /**
     * Sets the value of the inSoSwiftInformation1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInSoSwiftInformation1(String value) {
        this.inSoSwiftInformation1 = value;
    }

    /**
     * Gets the value of the inSoSwiftInformation2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInSoSwiftInformation2() {
        return inSoSwiftInformation2;
    }

    /**
     * Sets the value of the inSoSwiftInformation2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInSoSwiftInformation2(String value) {
        this.inSoSwiftInformation2 = value;
    }

    /**
     * Gets the value of the inSoSwiftInformation3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInSoSwiftInformation3() {
        return inSoSwiftInformation3;
    }

    /**
     * Sets the value of the inSoSwiftInformation3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInSoSwiftInformation3(String value) {
        this.inSoSwiftInformation3 = value;
    }

    /**
     * Gets the value of the inSoSwiftInformation4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInSoSwiftInformation4() {
        return inSoSwiftInformation4;
    }

    /**
     * Sets the value of the inSoSwiftInformation4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInSoSwiftInformation4(String value) {
        this.inSoSwiftInformation4 = value;
    }

    /**
     * Gets the value of the inSoSwiftInformation5 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInSoSwiftInformation5() {
        return inSoSwiftInformation5;
    }

    /**
     * Sets the value of the inSoSwiftInformation5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInSoSwiftInformation5(String value) {
        this.inSoSwiftInformation5 = value;
    }

    /**
     * Gets the value of the inSoSwiftInformation6 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInSoSwiftInformation6() {
        return inSoSwiftInformation6;
    }

    /**
     * Sets the value of the inSoSwiftInformation6 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInSoSwiftInformation6(String value) {
        this.inSoSwiftInformation6 = value;
    }

    /**
     * Gets the value of the inSoSwiftJustific1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInSoSwiftJustific1() {
        return inSoSwiftJustific1;
    }

    /**
     * Sets the value of the inSoSwiftJustific1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInSoSwiftJustific1(String value) {
        this.inSoSwiftJustific1 = value;
    }

    /**
     * Gets the value of the inSoSwiftJustific2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInSoSwiftJustific2() {
        return inSoSwiftJustific2;
    }

    /**
     * Sets the value of the inSoSwiftJustific2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInSoSwiftJustific2(String value) {
        this.inSoSwiftJustific2 = value;
    }

    /**
     * Gets the value of the inSoSwiftJustific3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInSoSwiftJustific3() {
        return inSoSwiftJustific3;
    }

    /**
     * Sets the value of the inSoSwiftJustific3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInSoSwiftJustific3(String value) {
        this.inSoSwiftJustific3 = value;
    }

    /**
     * Gets the value of the inSoSwiftJustific4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInSoSwiftJustific4() {
        return inSoSwiftJustific4;
    }

    /**
     * Sets the value of the inSoSwiftJustific4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInSoSwiftJustific4(String value) {
        this.inSoSwiftJustific4 = value;
    }

    /**
     * Gets the value of the inSoSwiftOriginCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInSoSwiftOriginCode() {
        return inSoSwiftOriginCode;
    }

    /**
     * Sets the value of the inSoSwiftOriginCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInSoSwiftOriginCode(String value) {
        this.inSoSwiftOriginCode = value;
    }

    /**
     * Gets the value of the inSoSwiftReceiverDiasUnit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInSoSwiftReceiverDiasUnit() {
        return inSoSwiftReceiverDiasUnit;
    }

    /**
     * Sets the value of the inSoSwiftReceiverDiasUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInSoSwiftReceiverDiasUnit(String value) {
        this.inSoSwiftReceiverDiasUnit = value;
    }

    /**
     * Gets the value of the inSoSwiftServiceCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInSoSwiftServiceCode() {
        return inSoSwiftServiceCode;
    }

    /**
     * Sets the value of the inSoSwiftServiceCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInSoSwiftServiceCode(String value) {
        this.inSoSwiftServiceCode = value;
    }

    /**
     * Gets the value of the inSoSwiftTpSoIdentifier property.
     * 
     */
    public double getInSoSwiftTpSoIdentifier() {
        return inSoSwiftTpSoIdentifier;
    }

    /**
     * Sets the value of the inSoSwiftTpSoIdentifier property.
     * 
     */
    public void setInSoSwiftTpSoIdentifier(double value) {
        this.inSoSwiftTpSoIdentifier = value;
    }

    /**
     * Gets the value of the inSoSwiftTransCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInSoSwiftTransCode() {
        return inSoSwiftTransCode;
    }

    /**
     * Sets the value of the inSoSwiftTransCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInSoSwiftTransCode(String value) {
        this.inSoSwiftTransCode = value;
    }

    /**
     * Gets the value of the inSoSwiftValueDays property.
     * 
     */
    public short getInSoSwiftValueDays() {
        return inSoSwiftValueDays;
    }

    /**
     * Sets the value of the inSoSwiftValueDays property.
     * 
     */
    public void setInSoSwiftValueDays(short value) {
        this.inSoSwiftValueDays = value;
    }

    /**
     * Gets the value of the inSoSwift103AccWithInsti57A property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInSoSwift103AccWithInsti57A() {
        return inSoSwift103AccWithInsti57A;
    }

    /**
     * Sets the value of the inSoSwift103AccWithInsti57A property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInSoSwift103AccWithInsti57A(String value) {
        this.inSoSwift103AccWithInsti57A = value;
    }

    /**
     * Gets the value of the inSoSwift103BankOperCod23B property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInSoSwift103BankOperCod23B() {
        return inSoSwift103BankOperCod23B;
    }

    /**
     * Sets the value of the inSoSwift103BankOperCod23B property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInSoSwift103BankOperCod23B(String value) {
        this.inSoSwift103BankOperCod23B = value;
    }

    /**
     * Gets the value of the inSoSwift103BenefCustomer59A property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInSoSwift103BenefCustomer59A() {
        return inSoSwift103BenefCustomer59A;
    }

    /**
     * Sets the value of the inSoSwift103BenefCustomer59A property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInSoSwift103BenefCustomer59A(String value) {
        this.inSoSwift103BenefCustomer59A = value;
    }

    /**
     * Gets the value of the inSoSwift103Chk13C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInSoSwift103Chk13C() {
        return inSoSwift103Chk13C;
    }

    /**
     * Sets the value of the inSoSwift103Chk13C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInSoSwift103Chk13C(String value) {
        this.inSoSwift103Chk13C = value;
    }

    /**
     * Gets the value of the inSoSwift103Chk20 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInSoSwift103Chk20() {
        return inSoSwift103Chk20;
    }

    /**
     * Sets the value of the inSoSwift103Chk20 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInSoSwift103Chk20(String value) {
        this.inSoSwift103Chk20 = value;
    }

    /**
     * Gets the value of the inSoSwift103Chk23B property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInSoSwift103Chk23B() {
        return inSoSwift103Chk23B;
    }

    /**
     * Sets the value of the inSoSwift103Chk23B property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInSoSwift103Chk23B(String value) {
        this.inSoSwift103Chk23B = value;
    }

    /**
     * Gets the value of the inSoSwift103Chk23E property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInSoSwift103Chk23E() {
        return inSoSwift103Chk23E;
    }

    /**
     * Sets the value of the inSoSwift103Chk23E property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInSoSwift103Chk23E(String value) {
        this.inSoSwift103Chk23E = value;
    }

    /**
     * Gets the value of the inSoSwift103Chk26T property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInSoSwift103Chk26T() {
        return inSoSwift103Chk26T;
    }

    /**
     * Sets the value of the inSoSwift103Chk26T property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInSoSwift103Chk26T(String value) {
        this.inSoSwift103Chk26T = value;
    }

    /**
     * Gets the value of the inSoSwift103Chk32A property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInSoSwift103Chk32A() {
        return inSoSwift103Chk32A;
    }

    /**
     * Sets the value of the inSoSwift103Chk32A property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInSoSwift103Chk32A(String value) {
        this.inSoSwift103Chk32A = value;
    }

    /**
     * Gets the value of the inSoSwift103Chk33B property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInSoSwift103Chk33B() {
        return inSoSwift103Chk33B;
    }

    /**
     * Sets the value of the inSoSwift103Chk33B property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInSoSwift103Chk33B(String value) {
        this.inSoSwift103Chk33B = value;
    }

    /**
     * Gets the value of the inSoSwift103Chk36 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInSoSwift103Chk36() {
        return inSoSwift103Chk36;
    }

    /**
     * Sets the value of the inSoSwift103Chk36 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInSoSwift103Chk36(String value) {
        this.inSoSwift103Chk36 = value;
    }

    /**
     * Gets the value of the inSoSwift103Chk50A property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInSoSwift103Chk50A() {
        return inSoSwift103Chk50A;
    }

    /**
     * Sets the value of the inSoSwift103Chk50A property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInSoSwift103Chk50A(String value) {
        this.inSoSwift103Chk50A = value;
    }

    /**
     * Gets the value of the inSoSwift103Chk51A property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInSoSwift103Chk51A() {
        return inSoSwift103Chk51A;
    }

    /**
     * Sets the value of the inSoSwift103Chk51A property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInSoSwift103Chk51A(String value) {
        this.inSoSwift103Chk51A = value;
    }

    /**
     * Gets the value of the inSoSwift103Chk52A property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInSoSwift103Chk52A() {
        return inSoSwift103Chk52A;
    }

    /**
     * Sets the value of the inSoSwift103Chk52A property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInSoSwift103Chk52A(String value) {
        this.inSoSwift103Chk52A = value;
    }

    /**
     * Gets the value of the inSoSwift103Chk53A property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInSoSwift103Chk53A() {
        return inSoSwift103Chk53A;
    }

    /**
     * Sets the value of the inSoSwift103Chk53A property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInSoSwift103Chk53A(String value) {
        this.inSoSwift103Chk53A = value;
    }

    /**
     * Gets the value of the inSoSwift103Chk54A property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInSoSwift103Chk54A() {
        return inSoSwift103Chk54A;
    }

    /**
     * Sets the value of the inSoSwift103Chk54A property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInSoSwift103Chk54A(String value) {
        this.inSoSwift103Chk54A = value;
    }

    /**
     * Gets the value of the inSoSwift103Chk55A property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInSoSwift103Chk55A() {
        return inSoSwift103Chk55A;
    }

    /**
     * Sets the value of the inSoSwift103Chk55A property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInSoSwift103Chk55A(String value) {
        this.inSoSwift103Chk55A = value;
    }

    /**
     * Gets the value of the inSoSwift103Chk56A property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInSoSwift103Chk56A() {
        return inSoSwift103Chk56A;
    }

    /**
     * Sets the value of the inSoSwift103Chk56A property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInSoSwift103Chk56A(String value) {
        this.inSoSwift103Chk56A = value;
    }

    /**
     * Gets the value of the inSoSwift103Chk57A property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInSoSwift103Chk57A() {
        return inSoSwift103Chk57A;
    }

    /**
     * Sets the value of the inSoSwift103Chk57A property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInSoSwift103Chk57A(String value) {
        this.inSoSwift103Chk57A = value;
    }

    /**
     * Gets the value of the inSoSwift103Chk59A property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInSoSwift103Chk59A() {
        return inSoSwift103Chk59A;
    }

    /**
     * Sets the value of the inSoSwift103Chk59A property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInSoSwift103Chk59A(String value) {
        this.inSoSwift103Chk59A = value;
    }

    /**
     * Gets the value of the inSoSwift103Chk70 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInSoSwift103Chk70() {
        return inSoSwift103Chk70;
    }

    /**
     * Sets the value of the inSoSwift103Chk70 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInSoSwift103Chk70(String value) {
        this.inSoSwift103Chk70 = value;
    }

    /**
     * Gets the value of the inSoSwift103Chk71A property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInSoSwift103Chk71A() {
        return inSoSwift103Chk71A;
    }

    /**
     * Sets the value of the inSoSwift103Chk71A property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInSoSwift103Chk71A(String value) {
        this.inSoSwift103Chk71A = value;
    }

    /**
     * Gets the value of the inSoSwift103Chk71F property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInSoSwift103Chk71F() {
        return inSoSwift103Chk71F;
    }

    /**
     * Sets the value of the inSoSwift103Chk71F property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInSoSwift103Chk71F(String value) {
        this.inSoSwift103Chk71F = value;
    }

    /**
     * Gets the value of the inSoSwift103Chk71G property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInSoSwift103Chk71G() {
        return inSoSwift103Chk71G;
    }

    /**
     * Sets the value of the inSoSwift103Chk71G property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInSoSwift103Chk71G(String value) {
        this.inSoSwift103Chk71G = value;
    }

    /**
     * Gets the value of the inSoSwift103Chk72 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInSoSwift103Chk72() {
        return inSoSwift103Chk72;
    }

    /**
     * Sets the value of the inSoSwift103Chk72 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInSoSwift103Chk72(String value) {
        this.inSoSwift103Chk72 = value;
    }

    /**
     * Gets the value of the inSoSwift103Chk77B property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInSoSwift103Chk77B() {
        return inSoSwift103Chk77B;
    }

    /**
     * Sets the value of the inSoSwift103Chk77B property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInSoSwift103Chk77B(String value) {
        this.inSoSwift103Chk77B = value;
    }

    /**
     * Gets the value of the inSoSwift103Chk77T property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInSoSwift103Chk77T() {
        return inSoSwift103Chk77T;
    }

    /**
     * Sets the value of the inSoSwift103Chk77T property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInSoSwift103Chk77T(String value) {
        this.inSoSwift103Chk77T = value;
    }

    /**
     * Gets the value of the inSoSwift103CoveringMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInSoSwift103CoveringMessage() {
        return inSoSwift103CoveringMessage;
    }

    /**
     * Sets the value of the inSoSwift103CoveringMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInSoSwift103CoveringMessage(String value) {
        this.inSoSwift103CoveringMessage = value;
    }

    /**
     * Gets the value of the inSoSwift103CurInstrAmn33B property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInSoSwift103CurInstrAmn33B() {
        return inSoSwift103CurInstrAmn33B;
    }

    /**
     * Sets the value of the inSoSwift103CurInstrAmn33B property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInSoSwift103CurInstrAmn33B(String value) {
        this.inSoSwift103CurInstrAmn33B = value;
    }

    /**
     * Gets the value of the inSoSwift103DetOfCharges71A property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInSoSwift103DetOfCharges71A() {
        return inSoSwift103DetOfCharges71A;
    }

    /**
     * Sets the value of the inSoSwift103DetOfCharges71A property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInSoSwift103DetOfCharges71A(String value) {
        this.inSoSwift103DetOfCharges71A = value;
    }

    /**
     * Gets the value of the inSoSwift103EnvlCnts77T property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInSoSwift103EnvlCnts77T() {
        return inSoSwift103EnvlCnts77T;
    }

    /**
     * Sets the value of the inSoSwift103EnvlCnts77T property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInSoSwift103EnvlCnts77T(String value) {
        this.inSoSwift103EnvlCnts77T = value;
    }

    /**
     * Gets the value of the inSoSwift103ExchangeRate36 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInSoSwift103ExchangeRate36() {
        return inSoSwift103ExchangeRate36;
    }

    /**
     * Sets the value of the inSoSwift103ExchangeRate36 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInSoSwift103ExchangeRate36(String value) {
        this.inSoSwift103ExchangeRate36 = value;
    }

    /**
     * Gets the value of the inSoSwift103InstrCode23E property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInSoSwift103InstrCode23E() {
        return inSoSwift103InstrCode23E;
    }

    /**
     * Sets the value of the inSoSwift103InstrCode23E property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInSoSwift103InstrCode23E(String value) {
        this.inSoSwift103InstrCode23E = value;
    }

    /**
     * Gets the value of the inSoSwift103IntermInstit56A property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInSoSwift103IntermInstit56A() {
        return inSoSwift103IntermInstit56A;
    }

    /**
     * Sets the value of the inSoSwift103IntermInstit56A property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInSoSwift103IntermInstit56A(String value) {
        this.inSoSwift103IntermInstit56A = value;
    }

    /**
     * Gets the value of the inSoSwift103OrderingCust50A property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInSoSwift103OrderingCust50A() {
        return inSoSwift103OrderingCust50A;
    }

    /**
     * Sets the value of the inSoSwift103OrderingCust50A property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInSoSwift103OrderingCust50A(String value) {
        this.inSoSwift103OrderingCust50A = value;
    }

    /**
     * Gets the value of the inSoSwift103OrderingInsti52A property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInSoSwift103OrderingInsti52A() {
        return inSoSwift103OrderingInsti52A;
    }

    /**
     * Sets the value of the inSoSwift103OrderingInsti52A property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInSoSwift103OrderingInsti52A(String value) {
        this.inSoSwift103OrderingInsti52A = value;
    }

    /**
     * Gets the value of the inSoSwift103OutgBenefAccount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInSoSwift103OutgBenefAccount() {
        return inSoSwift103OutgBenefAccount;
    }

    /**
     * Sets the value of the inSoSwift103OutgBenefAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInSoSwift103OutgBenefAccount(String value) {
        this.inSoSwift103OutgBenefAccount = value;
    }

    /**
     * Gets the value of the inSoSwift103PriorityCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInSoSwift103PriorityCode() {
        return inSoSwift103PriorityCode;
    }

    /**
     * Sets the value of the inSoSwift103PriorityCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInSoSwift103PriorityCode(String value) {
        this.inSoSwift103PriorityCode = value;
    }

    /**
     * Gets the value of the inSoSwift103RcvrsCharges71G property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInSoSwift103RcvrsCharges71G() {
        return inSoSwift103RcvrsCharges71G;
    }

    /**
     * Sets the value of the inSoSwift103RcvrsCharges71G property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInSoSwift103RcvrsCharges71G(String value) {
        this.inSoSwift103RcvrsCharges71G = value;
    }

    /**
     * Gets the value of the inSoSwift103RcvrsCorr54A property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInSoSwift103RcvrsCorr54A() {
        return inSoSwift103RcvrsCorr54A;
    }

    /**
     * Sets the value of the inSoSwift103RcvrsCorr54A property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInSoSwift103RcvrsCorr54A(String value) {
        this.inSoSwift103RcvrsCorr54A = value;
    }

    /**
     * Gets the value of the inSoSwift103ReceiverBic property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInSoSwift103ReceiverBic() {
        return inSoSwift103ReceiverBic;
    }

    /**
     * Sets the value of the inSoSwift103ReceiverBic property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInSoSwift103ReceiverBic(String value) {
        this.inSoSwift103ReceiverBic = value;
    }

    /**
     * Gets the value of the inSoSwift103RegulRpt77B property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInSoSwift103RegulRpt77B() {
        return inSoSwift103RegulRpt77B;
    }

    /**
     * Sets the value of the inSoSwift103RegulRpt77B property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInSoSwift103RegulRpt77B(String value) {
        this.inSoSwift103RegulRpt77B = value;
    }

    /**
     * Gets the value of the inSoSwift103RemtnceInform70 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInSoSwift103RemtnceInform70() {
        return inSoSwift103RemtnceInform70;
    }

    /**
     * Sets the value of the inSoSwift103RemtnceInform70 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInSoSwift103RemtnceInform70(String value) {
        this.inSoSwift103RemtnceInform70 = value;
    }

    /**
     * Gets the value of the inSoSwift103SenderBic property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInSoSwift103SenderBic() {
        return inSoSwift103SenderBic;
    }

    /**
     * Sets the value of the inSoSwift103SenderBic property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInSoSwift103SenderBic(String value) {
        this.inSoSwift103SenderBic = value;
    }

    /**
     * Gets the value of the inSoSwift103SendersCorr53A property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInSoSwift103SendersCorr53A() {
        return inSoSwift103SendersCorr53A;
    }

    /**
     * Sets the value of the inSoSwift103SendersCorr53A property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInSoSwift103SendersCorr53A(String value) {
        this.inSoSwift103SendersCorr53A = value;
    }

    /**
     * Gets the value of the inSoSwift103SendingInstit51A property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInSoSwift103SendingInstit51A() {
        return inSoSwift103SendingInstit51A;
    }

    /**
     * Sets the value of the inSoSwift103SendingInstit51A property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInSoSwift103SendingInstit51A(String value) {
        this.inSoSwift103SendingInstit51A = value;
    }

    /**
     * Gets the value of the inSoSwift103SndrToRcvr72 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInSoSwift103SndrToRcvr72() {
        return inSoSwift103SndrToRcvr72;
    }

    /**
     * Sets the value of the inSoSwift103SndrToRcvr72 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInSoSwift103SndrToRcvr72(String value) {
        this.inSoSwift103SndrToRcvr72 = value;
    }

    /**
     * Gets the value of the inSoSwift103SndrsCharges71F property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInSoSwift103SndrsCharges71F() {
        return inSoSwift103SndrsCharges71F;
    }

    /**
     * Sets the value of the inSoSwift103SndrsCharges71F property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInSoSwift103SndrsCharges71F(String value) {
        this.inSoSwift103SndrsCharges71F = value;
    }

    /**
     * Gets the value of the inSoSwift103StpFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInSoSwift103StpFlag() {
        return inSoSwift103StpFlag;
    }

    /**
     * Sets the value of the inSoSwift103StpFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInSoSwift103StpFlag(String value) {
        this.inSoSwift103StpFlag = value;
    }

    /**
     * Gets the value of the inSoSwift103ThirdReimbIn55A property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInSoSwift103ThirdReimbIn55A() {
        return inSoSwift103ThirdReimbIn55A;
    }

    /**
     * Sets the value of the inSoSwift103ThirdReimbIn55A property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInSoSwift103ThirdReimbIn55A(String value) {
        this.inSoSwift103ThirdReimbIn55A = value;
    }

    /**
     * Gets the value of the inSoSwift103TimeIndicatio13C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInSoSwift103TimeIndicatio13C() {
        return inSoSwift103TimeIndicatio13C;
    }

    /**
     * Sets the value of the inSoSwift103TimeIndicatio13C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInSoSwift103TimeIndicatio13C(String value) {
        this.inSoSwift103TimeIndicatio13C = value;
    }

    /**
     * Gets the value of the inSoSwift103TpSoIdentifier property.
     * 
     */
    public double getInSoSwift103TpSoIdentifier() {
        return inSoSwift103TpSoIdentifier;
    }

    /**
     * Sets the value of the inSoSwift103TpSoIdentifier property.
     * 
     */
    public void setInSoSwift103TpSoIdentifier(double value) {
        this.inSoSwift103TpSoIdentifier = value;
    }

    /**
     * Gets the value of the inSoSwift103TrxRefNo20 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInSoSwift103TrxRefNo20() {
        return inSoSwift103TrxRefNo20;
    }

    /**
     * Sets the value of the inSoSwift103TrxRefNo20 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInSoSwift103TrxRefNo20(String value) {
        this.inSoSwift103TrxRefNo20 = value;
    }

    /**
     * Gets the value of the inSoSwift103TrxTypeCode26T property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInSoSwift103TrxTypeCode26T() {
        return inSoSwift103TrxTypeCode26T;
    }

    /**
     * Sets the value of the inSoSwift103TrxTypeCode26T property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInSoSwift103TrxTypeCode26T(String value) {
        this.inSoSwift103TrxTypeCode26T = value;
    }

    /**
     * Gets the value of the inSoSwift103ValueCurAmn32A property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInSoSwift103ValueCurAmn32A() {
        return inSoSwift103ValueCurAmn32A;
    }

    /**
     * Sets the value of the inSoSwift103ValueCurAmn32A property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInSoSwift103ValueCurAmn32A(String value) {
        this.inSoSwift103ValueCurAmn32A = value;
    }

    /**
     * Gets the value of the inSoSwift103ValueDays property.
     * 
     */
    public short getInSoSwift103ValueDays() {
        return inSoSwift103ValueDays;
    }

    /**
     * Sets the value of the inSoSwift103ValueDays property.
     * 
     */
    public void setInSoSwift103ValueDays(short value) {
        this.inSoSwift103ValueDays = value;
    }

    /**
     * Gets the value of the inSoSwift202AccWithInsti57A property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInSoSwift202AccWithInsti57A() {
        return inSoSwift202AccWithInsti57A;
    }

    /**
     * Sets the value of the inSoSwift202AccWithInsti57A property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInSoSwift202AccWithInsti57A(String value) {
        this.inSoSwift202AccWithInsti57A = value;
    }

    /**
     * Gets the value of the inSoSwift202SndrToRcvr72 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInSoSwift202SndrToRcvr72() {
        return inSoSwift202SndrToRcvr72;
    }

    /**
     * Sets the value of the inSoSwift202SndrToRcvr72 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInSoSwift202SndrToRcvr72(String value) {
        this.inSoSwift202SndrToRcvr72 = value;
    }

    /**
     * Gets the value of the inSoSwift202TpSoIdentifier property.
     * 
     */
    public double getInSoSwift202TpSoIdentifier() {
        return inSoSwift202TpSoIdentifier;
    }

    /**
     * Sets the value of the inSoSwift202TpSoIdentifier property.
     * 
     */
    public void setInSoSwift202TpSoIdentifier(double value) {
        this.inSoSwift202TpSoIdentifier = value;
    }

    /**
     * Gets the value of the inSwiftDiasBpProdListProductIdProduct property.
     * 
     */
    public int getInSwiftDiasBpProdListProductIdProduct() {
        return inSwiftDiasBpProdListProductIdProduct;
    }

    /**
     * Sets the value of the inSwiftDiasBpProdListProductIdProduct property.
     * 
     */
    public void setInSwiftDiasBpProdListProductIdProduct(int value) {
        this.inSwiftDiasBpProdListProductIdProduct = value;
    }

    /**
     * Gets the value of the inTpSoCommitmentAccProductType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInTpSoCommitmentAccProductType() {
        return inTpSoCommitmentAccProductType;
    }

    /**
     * Sets the value of the inTpSoCommitmentAccProductType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInTpSoCommitmentAccProductType(String value) {
        this.inTpSoCommitmentAccProductType = value;
    }

    /**
     * Gets the value of the inTpSoCommitmentAchBankCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInTpSoCommitmentAchBankCode() {
        return inTpSoCommitmentAchBankCode;
    }

    /**
     * Sets the value of the inTpSoCommitmentAchBankCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInTpSoCommitmentAchBankCode(String value) {
        this.inTpSoCommitmentAchBankCode = value;
    }

    /**
     * Gets the value of the inTpSoCommitmentActivationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInTpSoCommitmentActivationDate() {
        return inTpSoCommitmentActivationDate;
    }

    /**
     * Sets the value of the inTpSoCommitmentActivationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInTpSoCommitmentActivationDate(XMLGregorianCalendar value) {
        this.inTpSoCommitmentActivationDate = value;
    }

    /**
     * Gets the value of the inTpSoCommitmentAdvancesRelated property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInTpSoCommitmentAdvancesRelated() {
        return inTpSoCommitmentAdvancesRelated;
    }

    /**
     * Sets the value of the inTpSoCommitmentAdvancesRelated property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInTpSoCommitmentAdvancesRelated(String value) {
        this.inTpSoCommitmentAdvancesRelated = value;
    }

    /**
     * Gets the value of the inTpSoCommitmentAllowNotExTries property.
     * 
     */
    public int getInTpSoCommitmentAllowNotExTries() {
        return inTpSoCommitmentAllowNotExTries;
    }

    /**
     * Sets the value of the inTpSoCommitmentAllowNotExTries property.
     * 
     */
    public void setInTpSoCommitmentAllowNotExTries(int value) {
        this.inTpSoCommitmentAllowNotExTries = value;
    }

    /**
     * Gets the value of the inTpSoCommitmentBillPayabJustId property.
     * 
     */
    public int getInTpSoCommitmentBillPayabJustId() {
        return inTpSoCommitmentBillPayabJustId;
    }

    /**
     * Sets the value of the inTpSoCommitmentBillPayabJustId property.
     * 
     */
    public void setInTpSoCommitmentBillPayabJustId(int value) {
        this.inTpSoCommitmentBillPayabJustId = value;
    }

    /**
     * Gets the value of the inTpSoCommitmentBillPayabProdId property.
     * 
     */
    public int getInTpSoCommitmentBillPayabProdId() {
        return inTpSoCommitmentBillPayabProdId;
    }

    /**
     * Sets the value of the inTpSoCommitmentBillPayabProdId property.
     * 
     */
    public void setInTpSoCommitmentBillPayabProdId(int value) {
        this.inTpSoCommitmentBillPayabProdId = value;
    }

    /**
     * Gets the value of the inTpSoCommitmentBookBalanceMargin property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInTpSoCommitmentBookBalanceMargin() {
        return inTpSoCommitmentBookBalanceMargin;
    }

    /**
     * Sets the value of the inTpSoCommitmentBookBalanceMargin property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInTpSoCommitmentBookBalanceMargin(BigDecimal value) {
        this.inTpSoCommitmentBookBalanceMargin = value;
    }

    /**
     * Gets the value of the inTpSoCommitmentBopCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInTpSoCommitmentBopCode() {
        return inTpSoCommitmentBopCode;
    }

    /**
     * Sets the value of the inTpSoCommitmentBopCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInTpSoCommitmentBopCode(String value) {
        this.inTpSoCommitmentBopCode = value;
    }

    /**
     * Gets the value of the inTpSoCommitmentBpBenefAddress1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInTpSoCommitmentBpBenefAddress1() {
        return inTpSoCommitmentBpBenefAddress1;
    }

    /**
     * Sets the value of the inTpSoCommitmentBpBenefAddress1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInTpSoCommitmentBpBenefAddress1(String value) {
        this.inTpSoCommitmentBpBenefAddress1 = value;
    }

    /**
     * Gets the value of the inTpSoCommitmentBpBenefAddress2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInTpSoCommitmentBpBenefAddress2() {
        return inTpSoCommitmentBpBenefAddress2;
    }

    /**
     * Sets the value of the inTpSoCommitmentBpBenefAddress2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInTpSoCommitmentBpBenefAddress2(String value) {
        this.inTpSoCommitmentBpBenefAddress2 = value;
    }

    /**
     * Gets the value of the inTpSoCommitmentBpBenefAddress3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInTpSoCommitmentBpBenefAddress3() {
        return inTpSoCommitmentBpBenefAddress3;
    }

    /**
     * Sets the value of the inTpSoCommitmentBpBenefAddress3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInTpSoCommitmentBpBenefAddress3(String value) {
        this.inTpSoCommitmentBpBenefAddress3 = value;
    }

    /**
     * Gets the value of the inTpSoCommitmentBpBenefCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInTpSoCommitmentBpBenefCity() {
        return inTpSoCommitmentBpBenefCity;
    }

    /**
     * Sets the value of the inTpSoCommitmentBpBenefCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInTpSoCommitmentBpBenefCity(String value) {
        this.inTpSoCommitmentBpBenefCity = value;
    }

    /**
     * Gets the value of the inTpSoCommitmentBpBenefCountry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInTpSoCommitmentBpBenefCountry() {
        return inTpSoCommitmentBpBenefCountry;
    }

    /**
     * Sets the value of the inTpSoCommitmentBpBenefCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInTpSoCommitmentBpBenefCountry(String value) {
        this.inTpSoCommitmentBpBenefCountry = value;
    }

    /**
     * Gets the value of the inTpSoCommitmentBpBenefName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInTpSoCommitmentBpBenefName() {
        return inTpSoCommitmentBpBenefName;
    }

    /**
     * Sets the value of the inTpSoCommitmentBpBenefName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInTpSoCommitmentBpBenefName(String value) {
        this.inTpSoCommitmentBpBenefName = value;
    }

    /**
     * Gets the value of the inTpSoCommitmentBpBenefZipCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInTpSoCommitmentBpBenefZipCode() {
        return inTpSoCommitmentBpBenefZipCode;
    }

    /**
     * Sets the value of the inTpSoCommitmentBpBenefZipCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInTpSoCommitmentBpBenefZipCode(String value) {
        this.inTpSoCommitmentBpBenefZipCode = value;
    }

    /**
     * Gets the value of the inTpSoCommitmentCancelComments property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInTpSoCommitmentCancelComments() {
        return inTpSoCommitmentCancelComments;
    }

    /**
     * Sets the value of the inTpSoCommitmentCancelComments property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInTpSoCommitmentCancelComments(String value) {
        this.inTpSoCommitmentCancelComments = value;
    }

    /**
     * Gets the value of the inTpSoCommitmentCommisionDiscount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInTpSoCommitmentCommisionDiscount() {
        return inTpSoCommitmentCommisionDiscount;
    }

    /**
     * Sets the value of the inTpSoCommitmentCommisionDiscount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInTpSoCommitmentCommisionDiscount(BigDecimal value) {
        this.inTpSoCommitmentCommisionDiscount = value;
    }

    /**
     * Gets the value of the inTpSoCommitmentCountryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInTpSoCommitmentCountryCode() {
        return inTpSoCommitmentCountryCode;
    }

    /**
     * Sets the value of the inTpSoCommitmentCountryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInTpSoCommitmentCountryCode(String value) {
        this.inTpSoCommitmentCountryCode = value;
    }

    /**
     * Gets the value of the inTpSoCommitmentCrAccComments property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInTpSoCommitmentCrAccComments() {
        return inTpSoCommitmentCrAccComments;
    }

    /**
     * Sets the value of the inTpSoCommitmentCrAccComments property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInTpSoCommitmentCrAccComments(String value) {
        this.inTpSoCommitmentCrAccComments = value;
    }

    /**
     * Gets the value of the inTpSoCommitmentCrAccCurrency property.
     * 
     */
    public int getInTpSoCommitmentCrAccCurrency() {
        return inTpSoCommitmentCrAccCurrency;
    }

    /**
     * Sets the value of the inTpSoCommitmentCrAccCurrency property.
     * 
     */
    public void setInTpSoCommitmentCrAccCurrency(int value) {
        this.inTpSoCommitmentCrAccCurrency = value;
    }

    /**
     * Gets the value of the inTpSoCommitmentCrAccCustomerCd property.
     * 
     */
    public short getInTpSoCommitmentCrAccCustomerCd() {
        return inTpSoCommitmentCrAccCustomerCd;
    }

    /**
     * Sets the value of the inTpSoCommitmentCrAccCustomerCd property.
     * 
     */
    public void setInTpSoCommitmentCrAccCustomerCd(short value) {
        this.inTpSoCommitmentCrAccCustomerCd = value;
    }

    /**
     * Gets the value of the inTpSoCommitmentCrAccCustomerId property.
     * 
     */
    public int getInTpSoCommitmentCrAccCustomerId() {
        return inTpSoCommitmentCrAccCustomerId;
    }

    /**
     * Sets the value of the inTpSoCommitmentCrAccCustomerId property.
     * 
     */
    public void setInTpSoCommitmentCrAccCustomerId(int value) {
        this.inTpSoCommitmentCrAccCustomerId = value;
    }

    /**
     * Gets the value of the inTpSoCommitmentCrBonusCommCode property.
     * 
     */
    public int getInTpSoCommitmentCrBonusCommCode() {
        return inTpSoCommitmentCrBonusCommCode;
    }

    /**
     * Sets the value of the inTpSoCommitmentCrBonusCommCode property.
     * 
     */
    public void setInTpSoCommitmentCrBonusCommCode(int value) {
        this.inTpSoCommitmentCrBonusCommCode = value;
    }

    /**
     * Gets the value of the inTpSoCommitmentCrBonusCommDisc property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInTpSoCommitmentCrBonusCommDisc() {
        return inTpSoCommitmentCrBonusCommDisc;
    }

    /**
     * Sets the value of the inTpSoCommitmentCrBonusCommDisc property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInTpSoCommitmentCrBonusCommDisc(BigDecimal value) {
        this.inTpSoCommitmentCrBonusCommDisc = value;
    }

    /**
     * Gets the value of the inTpSoCommitmentCrChargeType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInTpSoCommitmentCrChargeType() {
        return inTpSoCommitmentCrChargeType;
    }

    /**
     * Sets the value of the inTpSoCommitmentCrChargeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInTpSoCommitmentCrChargeType(String value) {
        this.inTpSoCommitmentCrChargeType = value;
    }

    /**
     * Gets the value of the inTpSoCommitmentCrNonResident property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInTpSoCommitmentCrNonResident() {
        return inTpSoCommitmentCrNonResident;
    }

    /**
     * Sets the value of the inTpSoCommitmentCrNonResident property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInTpSoCommitmentCrNonResident(String value) {
        this.inTpSoCommitmentCrNonResident = value;
    }

    /**
     * Gets the value of the inTpSoCommitmentCrPrintAdvice property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInTpSoCommitmentCrPrintAdvice() {
        return inTpSoCommitmentCrPrintAdvice;
    }

    /**
     * Sets the value of the inTpSoCommitmentCrPrintAdvice property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInTpSoCommitmentCrPrintAdvice(String value) {
        this.inTpSoCommitmentCrPrintAdvice = value;
    }

    /**
     * Gets the value of the inTpSoCommitmentDataField1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInTpSoCommitmentDataField1() {
        return inTpSoCommitmentDataField1;
    }

    /**
     * Sets the value of the inTpSoCommitmentDataField1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInTpSoCommitmentDataField1(String value) {
        this.inTpSoCommitmentDataField1 = value;
    }

    /**
     * Gets the value of the inTpSoCommitmentDataField2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInTpSoCommitmentDataField2() {
        return inTpSoCommitmentDataField2;
    }

    /**
     * Sets the value of the inTpSoCommitmentDataField2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInTpSoCommitmentDataField2(String value) {
        this.inTpSoCommitmentDataField2 = value;
    }

    /**
     * Gets the value of the inTpSoCommitmentDataField3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInTpSoCommitmentDataField3() {
        return inTpSoCommitmentDataField3;
    }

    /**
     * Sets the value of the inTpSoCommitmentDataField3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInTpSoCommitmentDataField3(String value) {
        this.inTpSoCommitmentDataField3 = value;
    }

    /**
     * Gets the value of the inTpSoCommitmentDataField4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInTpSoCommitmentDataField4() {
        return inTpSoCommitmentDataField4;
    }

    /**
     * Sets the value of the inTpSoCommitmentDataField4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInTpSoCommitmentDataField4(String value) {
        this.inTpSoCommitmentDataField4 = value;
    }

    /**
     * Gets the value of the inTpSoCommitmentDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInTpSoCommitmentDescription() {
        return inTpSoCommitmentDescription;
    }

    /**
     * Sets the value of the inTpSoCommitmentDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInTpSoCommitmentDescription(String value) {
        this.inTpSoCommitmentDescription = value;
    }

    /**
     * Gets the value of the inTpSoCommitmentDiscountCost property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInTpSoCommitmentDiscountCost() {
        return inTpSoCommitmentDiscountCost;
    }

    /**
     * Sets the value of the inTpSoCommitmentDiscountCost property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInTpSoCommitmentDiscountCost(BigDecimal value) {
        this.inTpSoCommitmentDiscountCost = value;
    }

    /**
     * Gets the value of the inTpSoCommitmentDrAccComments property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInTpSoCommitmentDrAccComments() {
        return inTpSoCommitmentDrAccComments;
    }

    /**
     * Sets the value of the inTpSoCommitmentDrAccComments property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInTpSoCommitmentDrAccComments(String value) {
        this.inTpSoCommitmentDrAccComments = value;
    }

    /**
     * Gets the value of the inTpSoCommitmentDrAccCurrency property.
     * 
     */
    public int getInTpSoCommitmentDrAccCurrency() {
        return inTpSoCommitmentDrAccCurrency;
    }

    /**
     * Sets the value of the inTpSoCommitmentDrAccCurrency property.
     * 
     */
    public void setInTpSoCommitmentDrAccCurrency(int value) {
        this.inTpSoCommitmentDrAccCurrency = value;
    }

    /**
     * Gets the value of the inTpSoCommitmentDrAccCustomerCd property.
     * 
     */
    public short getInTpSoCommitmentDrAccCustomerCd() {
        return inTpSoCommitmentDrAccCustomerCd;
    }

    /**
     * Sets the value of the inTpSoCommitmentDrAccCustomerCd property.
     * 
     */
    public void setInTpSoCommitmentDrAccCustomerCd(short value) {
        this.inTpSoCommitmentDrAccCustomerCd = value;
    }

    /**
     * Gets the value of the inTpSoCommitmentDrAccCustomerId property.
     * 
     */
    public int getInTpSoCommitmentDrAccCustomerId() {
        return inTpSoCommitmentDrAccCustomerId;
    }

    /**
     * Sets the value of the inTpSoCommitmentDrAccCustomerId property.
     * 
     */
    public void setInTpSoCommitmentDrAccCustomerId(int value) {
        this.inTpSoCommitmentDrAccCustomerId = value;
    }

    /**
     * Gets the value of the inTpSoCommitmentDrPrintAdvice property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInTpSoCommitmentDrPrintAdvice() {
        return inTpSoCommitmentDrPrintAdvice;
    }

    /**
     * Sets the value of the inTpSoCommitmentDrPrintAdvice property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInTpSoCommitmentDrPrintAdvice(String value) {
        this.inTpSoCommitmentDrPrintAdvice = value;
    }

    /**
     * Gets the value of the inTpSoCommitmentEntryStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInTpSoCommitmentEntryStatus() {
        return inTpSoCommitmentEntryStatus;
    }

    /**
     * Sets the value of the inTpSoCommitmentEntryStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInTpSoCommitmentEntryStatus(String value) {
        this.inTpSoCommitmentEntryStatus = value;
    }

    /**
     * Gets the value of the inTpSoCommitmentFinalizeFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInTpSoCommitmentFinalizeFlag() {
        return inTpSoCommitmentFinalizeFlag;
    }

    /**
     * Sets the value of the inTpSoCommitmentFinalizeFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInTpSoCommitmentFinalizeFlag(String value) {
        this.inTpSoCommitmentFinalizeFlag = value;
    }

    /**
     * Gets the value of the inTpSoCommitmentFirstPaymentAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInTpSoCommitmentFirstPaymentAmn() {
        return inTpSoCommitmentFirstPaymentAmn;
    }

    /**
     * Sets the value of the inTpSoCommitmentFirstPaymentAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInTpSoCommitmentFirstPaymentAmn(BigDecimal value) {
        this.inTpSoCommitmentFirstPaymentAmn = value;
    }

    /**
     * Gets the value of the inTpSoCommitmentFirstPaymentDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInTpSoCommitmentFirstPaymentDate() {
        return inTpSoCommitmentFirstPaymentDate;
    }

    /**
     * Sets the value of the inTpSoCommitmentFirstPaymentDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInTpSoCommitmentFirstPaymentDate(XMLGregorianCalendar value) {
        this.inTpSoCommitmentFirstPaymentDate = value;
    }

    /**
     * Gets the value of the inTpSoCommitmentFrequency property.
     * 
     */
    public short getInTpSoCommitmentFrequency() {
        return inTpSoCommitmentFrequency;
    }

    /**
     * Sets the value of the inTpSoCommitmentFrequency property.
     * 
     */
    public void setInTpSoCommitmentFrequency(short value) {
        this.inTpSoCommitmentFrequency = value;
    }

    /**
     * Gets the value of the inTpSoCommitmentFrequencyUnit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInTpSoCommitmentFrequencyUnit() {
        return inTpSoCommitmentFrequencyUnit;
    }

    /**
     * Sets the value of the inTpSoCommitmentFrequencyUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInTpSoCommitmentFrequencyUnit(String value) {
        this.inTpSoCommitmentFrequencyUnit = value;
    }

    /**
     * Gets the value of the inTpSoCommitmentGeneralComments property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInTpSoCommitmentGeneralComments() {
        return inTpSoCommitmentGeneralComments;
    }

    /**
     * Sets the value of the inTpSoCommitmentGeneralComments property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInTpSoCommitmentGeneralComments(String value) {
        this.inTpSoCommitmentGeneralComments = value;
    }

    /**
     * Gets the value of the inTpSoCommitmentHolidayInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInTpSoCommitmentHolidayInd() {
        return inTpSoCommitmentHolidayInd;
    }

    /**
     * Sets the value of the inTpSoCommitmentHolidayInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInTpSoCommitmentHolidayInd(String value) {
        this.inTpSoCommitmentHolidayInd = value;
    }

    /**
     * Gets the value of the inTpSoCommitmentInsuffChargeCode property.
     * 
     */
    public int getInTpSoCommitmentInsuffChargeCode() {
        return inTpSoCommitmentInsuffChargeCode;
    }

    /**
     * Sets the value of the inTpSoCommitmentInsuffChargeCode property.
     * 
     */
    public void setInTpSoCommitmentInsuffChargeCode(int value) {
        this.inTpSoCommitmentInsuffChargeCode = value;
    }

    /**
     * Gets the value of the inTpSoCommitmentInsuffChargeDisc property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInTpSoCommitmentInsuffChargeDisc() {
        return inTpSoCommitmentInsuffChargeDisc;
    }

    /**
     * Sets the value of the inTpSoCommitmentInsuffChargeDisc property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInTpSoCommitmentInsuffChargeDisc(BigDecimal value) {
        this.inTpSoCommitmentInsuffChargeDisc = value;
    }

    /**
     * Gets the value of the inTpSoCommitmentIssueDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInTpSoCommitmentIssueDate() {
        return inTpSoCommitmentIssueDate;
    }

    /**
     * Sets the value of the inTpSoCommitmentIssueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInTpSoCommitmentIssueDate(XMLGregorianCalendar value) {
        this.inTpSoCommitmentIssueDate = value;
    }

    /**
     * Gets the value of the inTpSoCommitmentLastPaymentAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInTpSoCommitmentLastPaymentAmn() {
        return inTpSoCommitmentLastPaymentAmn;
    }

    /**
     * Sets the value of the inTpSoCommitmentLastPaymentAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInTpSoCommitmentLastPaymentAmn(BigDecimal value) {
        this.inTpSoCommitmentLastPaymentAmn = value;
    }

    /**
     * Gets the value of the inTpSoCommitmentLastPaymentDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInTpSoCommitmentLastPaymentDate() {
        return inTpSoCommitmentLastPaymentDate;
    }

    /**
     * Sets the value of the inTpSoCommitmentLastPaymentDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInTpSoCommitmentLastPaymentDate(XMLGregorianCalendar value) {
        this.inTpSoCommitmentLastPaymentDate = value;
    }

    /**
     * Gets the value of the inTpSoCommitmentLastTransferDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInTpSoCommitmentLastTransferDate() {
        return inTpSoCommitmentLastTransferDate;
    }

    /**
     * Sets the value of the inTpSoCommitmentLastTransferDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInTpSoCommitmentLastTransferDate(XMLGregorianCalendar value) {
        this.inTpSoCommitmentLastTransferDate = value;
    }

    /**
     * Gets the value of the inTpSoCommitmentLastUpdateDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInTpSoCommitmentLastUpdateDate() {
        return inTpSoCommitmentLastUpdateDate;
    }

    /**
     * Sets the value of the inTpSoCommitmentLastUpdateDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInTpSoCommitmentLastUpdateDate(XMLGregorianCalendar value) {
        this.inTpSoCommitmentLastUpdateDate = value;
    }

    /**
     * Gets the value of the inTpSoCommitmentMaxNoOfAttempts property.
     * 
     */
    public short getInTpSoCommitmentMaxNoOfAttempts() {
        return inTpSoCommitmentMaxNoOfAttempts;
    }

    /**
     * Sets the value of the inTpSoCommitmentMaxNoOfAttempts property.
     * 
     */
    public void setInTpSoCommitmentMaxNoOfAttempts(short value) {
        this.inTpSoCommitmentMaxNoOfAttempts = value;
    }

    /**
     * Gets the value of the inTpSoCommitmentNormalActiveDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInTpSoCommitmentNormalActiveDate() {
        return inTpSoCommitmentNormalActiveDate;
    }

    /**
     * Sets the value of the inTpSoCommitmentNormalActiveDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInTpSoCommitmentNormalActiveDate(XMLGregorianCalendar value) {
        this.inTpSoCommitmentNormalActiveDate = value;
    }

    /**
     * Gets the value of the inTpSoCommitmentOrderIssueJustid property.
     * 
     */
    public int getInTpSoCommitmentOrderIssueJustid() {
        return inTpSoCommitmentOrderIssueJustid;
    }

    /**
     * Sets the value of the inTpSoCommitmentOrderIssueJustid property.
     * 
     */
    public void setInTpSoCommitmentOrderIssueJustid(int value) {
        this.inTpSoCommitmentOrderIssueJustid = value;
    }

    /**
     * Gets the value of the inTpSoCommitmentOrderIssueProdid property.
     * 
     */
    public int getInTpSoCommitmentOrderIssueProdid() {
        return inTpSoCommitmentOrderIssueProdid;
    }

    /**
     * Sets the value of the inTpSoCommitmentOrderIssueProdid property.
     * 
     */
    public void setInTpSoCommitmentOrderIssueProdid(int value) {
        this.inTpSoCommitmentOrderIssueProdid = value;
    }

    /**
     * Gets the value of the inTpSoCommitmentOrderSendrecInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInTpSoCommitmentOrderSendrecInfo() {
        return inTpSoCommitmentOrderSendrecInfo;
    }

    /**
     * Sets the value of the inTpSoCommitmentOrderSendrecInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInTpSoCommitmentOrderSendrecInfo(String value) {
        this.inTpSoCommitmentOrderSendrecInfo = value;
    }

    /**
     * Gets the value of the inTpSoCommitmentOrderSpecialTerm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInTpSoCommitmentOrderSpecialTerm() {
        return inTpSoCommitmentOrderSpecialTerm;
    }

    /**
     * Sets the value of the inTpSoCommitmentOrderSpecialTerm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInTpSoCommitmentOrderSpecialTerm(String value) {
        this.inTpSoCommitmentOrderSpecialTerm = value;
    }

    /**
     * Gets the value of the inTpSoCommitmentOtherBankAccCd property.
     * 
     */
    public short getInTpSoCommitmentOtherBankAccCd() {
        return inTpSoCommitmentOtherBankAccCd;
    }

    /**
     * Sets the value of the inTpSoCommitmentOtherBankAccCd property.
     * 
     */
    public void setInTpSoCommitmentOtherBankAccCd(short value) {
        this.inTpSoCommitmentOtherBankAccCd = value;
    }

    /**
     * Gets the value of the inTpSoCommitmentOtherBankAccNo property.
     * 
     */
    public double getInTpSoCommitmentOtherBankAccNo() {
        return inTpSoCommitmentOtherBankAccNo;
    }

    /**
     * Sets the value of the inTpSoCommitmentOtherBankAccNo property.
     * 
     */
    public void setInTpSoCommitmentOtherBankAccNo(double value) {
        this.inTpSoCommitmentOtherBankAccNo = value;
    }

    /**
     * Gets the value of the inTpSoCommitmentOtherBankAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInTpSoCommitmentOtherBankAddress() {
        return inTpSoCommitmentOtherBankAddress;
    }

    /**
     * Sets the value of the inTpSoCommitmentOtherBankAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInTpSoCommitmentOtherBankAddress(String value) {
        this.inTpSoCommitmentOtherBankAddress = value;
    }

    /**
     * Gets the value of the inTpSoCommitmentOtherBankCode property.
     * 
     */
    public int getInTpSoCommitmentOtherBankCode() {
        return inTpSoCommitmentOtherBankCode;
    }

    /**
     * Sets the value of the inTpSoCommitmentOtherBankCode property.
     * 
     */
    public void setInTpSoCommitmentOtherBankCode(int value) {
        this.inTpSoCommitmentOtherBankCode = value;
    }

    /**
     * Gets the value of the inTpSoCommitmentOtherBankUnit property.
     * 
     */
    public int getInTpSoCommitmentOtherBankUnit() {
        return inTpSoCommitmentOtherBankUnit;
    }

    /**
     * Sets the value of the inTpSoCommitmentOtherBankUnit property.
     * 
     */
    public void setInTpSoCommitmentOtherBankUnit(int value) {
        this.inTpSoCommitmentOtherBankUnit = value;
    }

    /**
     * Gets the value of the inTpSoCommitmentPayeeBank property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInTpSoCommitmentPayeeBank() {
        return inTpSoCommitmentPayeeBank;
    }

    /**
     * Sets the value of the inTpSoCommitmentPayeeBank property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInTpSoCommitmentPayeeBank(String value) {
        this.inTpSoCommitmentPayeeBank = value;
    }

    /**
     * Gets the value of the inTpSoCommitmentPaymentAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInTpSoCommitmentPaymentAmount() {
        return inTpSoCommitmentPaymentAmount;
    }

    /**
     * Sets the value of the inTpSoCommitmentPaymentAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInTpSoCommitmentPaymentAmount(BigDecimal value) {
        this.inTpSoCommitmentPaymentAmount = value;
    }

    /**
     * Gets the value of the inTpSoCommitmentPaymentsCount property.
     * 
     */
    public int getInTpSoCommitmentPaymentsCount() {
        return inTpSoCommitmentPaymentsCount;
    }

    /**
     * Sets the value of the inTpSoCommitmentPaymentsCount property.
     * 
     */
    public void setInTpSoCommitmentPaymentsCount(int value) {
        this.inTpSoCommitmentPaymentsCount = value;
    }

    /**
     * Gets the value of the inTpSoCommitmentPoFbCharges property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInTpSoCommitmentPoFbCharges() {
        return inTpSoCommitmentPoFbCharges;
    }

    /**
     * Sets the value of the inTpSoCommitmentPoFbCharges property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInTpSoCommitmentPoFbCharges(String value) {
        this.inTpSoCommitmentPoFbCharges = value;
    }

    /**
     * Gets the value of the inTpSoCommitmentPrivilegedFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInTpSoCommitmentPrivilegedFlag() {
        return inTpSoCommitmentPrivilegedFlag;
    }

    /**
     * Sets the value of the inTpSoCommitmentPrivilegedFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInTpSoCommitmentPrivilegedFlag(String value) {
        this.inTpSoCommitmentPrivilegedFlag = value;
    }

    /**
     * Gets the value of the inTpSoCommitmentSectorCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInTpSoCommitmentSectorCode() {
        return inTpSoCommitmentSectorCode;
    }

    /**
     * Sets the value of the inTpSoCommitmentSectorCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInTpSoCommitmentSectorCode(String value) {
        this.inTpSoCommitmentSectorCode = value;
    }

    /**
     * Gets the value of the inTpSoCommitmentSoCrChargesInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInTpSoCommitmentSoCrChargesInd() {
        return inTpSoCommitmentSoCrChargesInd;
    }

    /**
     * Sets the value of the inTpSoCommitmentSoCrChargesInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInTpSoCommitmentSoCrChargesInd(String value) {
        this.inTpSoCommitmentSoCrChargesInd = value;
    }

    /**
     * Gets the value of the inTpSoCommitmentSoDrChargesInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInTpSoCommitmentSoDrChargesInd() {
        return inTpSoCommitmentSoDrChargesInd;
    }

    /**
     * Sets the value of the inTpSoCommitmentSoDrChargesInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInTpSoCommitmentSoDrChargesInd(String value) {
        this.inTpSoCommitmentSoDrChargesInd = value;
    }

    /**
     * Gets the value of the inTpSoCommitmentSoSwiftStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInTpSoCommitmentSoSwiftStatus() {
        return inTpSoCommitmentSoSwiftStatus;
    }

    /**
     * Sets the value of the inTpSoCommitmentSoSwiftStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInTpSoCommitmentSoSwiftStatus(String value) {
        this.inTpSoCommitmentSoSwiftStatus = value;
    }

    /**
     * Gets the value of the inTpSoCommitmentStandOrderMethod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInTpSoCommitmentStandOrderMethod() {
        return inTpSoCommitmentStandOrderMethod;
    }

    /**
     * Sets the value of the inTpSoCommitmentStandOrderMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInTpSoCommitmentStandOrderMethod(String value) {
        this.inTpSoCommitmentStandOrderMethod = value;
    }

    /**
     * Gets the value of the inTpSoCommitmentSuspensDateFrom property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInTpSoCommitmentSuspensDateFrom() {
        return inTpSoCommitmentSuspensDateFrom;
    }

    /**
     * Sets the value of the inTpSoCommitmentSuspensDateFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInTpSoCommitmentSuspensDateFrom(XMLGregorianCalendar value) {
        this.inTpSoCommitmentSuspensDateFrom = value;
    }

    /**
     * Gets the value of the inTpSoCommitmentSuspensDateTo property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInTpSoCommitmentSuspensDateTo() {
        return inTpSoCommitmentSuspensDateTo;
    }

    /**
     * Sets the value of the inTpSoCommitmentSuspensDateTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInTpSoCommitmentSuspensDateTo(XMLGregorianCalendar value) {
        this.inTpSoCommitmentSuspensDateTo = value;
    }

    /**
     * Gets the value of the inTpSoCommitmentSuspensExecutions property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInTpSoCommitmentSuspensExecutions() {
        return inTpSoCommitmentSuspensExecutions;
    }

    /**
     * Sets the value of the inTpSoCommitmentSuspensExecutions property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInTpSoCommitmentSuspensExecutions(String value) {
        this.inTpSoCommitmentSuspensExecutions = value;
    }

    /**
     * Gets the value of the inTpSoCommitmentTimestmp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInTpSoCommitmentTimestmp() {
        return inTpSoCommitmentTimestmp;
    }

    /**
     * Sets the value of the inTpSoCommitmentTimestmp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInTpSoCommitmentTimestmp(XMLGregorianCalendar value) {
        this.inTpSoCommitmentTimestmp = value;
    }

    /**
     * Gets the value of the inTpSoCommitmentTotalAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInTpSoCommitmentTotalAmount() {
        return inTpSoCommitmentTotalAmount;
    }

    /**
     * Sets the value of the inTpSoCommitmentTotalAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInTpSoCommitmentTotalAmount(BigDecimal value) {
        this.inTpSoCommitmentTotalAmount = value;
    }

    /**
     * Gets the value of the inTpSoCommitmentTotalAvailableTr property.
     * 
     */
    public int getInTpSoCommitmentTotalAvailableTr() {
        return inTpSoCommitmentTotalAvailableTr;
    }

    /**
     * Sets the value of the inTpSoCommitmentTotalAvailableTr property.
     * 
     */
    public void setInTpSoCommitmentTotalAvailableTr(int value) {
        this.inTpSoCommitmentTotalAvailableTr = value;
    }

    /**
     * Gets the value of the inTpSoCommitmentTpCrDrIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInTpSoCommitmentTpCrDrIndicator() {
        return inTpSoCommitmentTpCrDrIndicator;
    }

    /**
     * Sets the value of the inTpSoCommitmentTpCrDrIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInTpSoCommitmentTpCrDrIndicator(String value) {
        this.inTpSoCommitmentTpCrDrIndicator = value;
    }

    /**
     * Gets the value of the inTpSoCommitmentTpSoIdentifier property.
     * 
     */
    public double getInTpSoCommitmentTpSoIdentifier() {
        return inTpSoCommitmentTpSoIdentifier;
    }

    /**
     * Sets the value of the inTpSoCommitmentTpSoIdentifier property.
     * 
     */
    public void setInTpSoCommitmentTpSoIdentifier(double value) {
        this.inTpSoCommitmentTpSoIdentifier = value;
    }

    /**
     * Gets the value of the inTpSoCommitmentTpSoIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInTpSoCommitmentTpSoIndicator() {
        return inTpSoCommitmentTpSoIndicator;
    }

    /**
     * Sets the value of the inTpSoCommitmentTpSoIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInTpSoCommitmentTpSoIndicator(String value) {
        this.inTpSoCommitmentTpSoIndicator = value;
    }

    /**
     * Gets the value of the inTpSoMandateDbAccount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInTpSoMandateDbAccount() {
        return inTpSoMandateDbAccount;
    }

    /**
     * Sets the value of the inTpSoMandateDbAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInTpSoMandateDbAccount(String value) {
        this.inTpSoMandateDbAccount = value;
    }

    /**
     * Gets the value of the inTpSoMandateDbBank property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInTpSoMandateDbBank() {
        return inTpSoMandateDbBank;
    }

    /**
     * Sets the value of the inTpSoMandateDbBank property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInTpSoMandateDbBank(String value) {
        this.inTpSoMandateDbBank = value;
    }

    /**
     * Gets the value of the inTpSoMandateDbBranch property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInTpSoMandateDbBranch() {
        return inTpSoMandateDbBranch;
    }

    /**
     * Sets the value of the inTpSoMandateDbBranch property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInTpSoMandateDbBranch(String value) {
        this.inTpSoMandateDbBranch = value;
    }

    /**
     * Gets the value of the inTpSoMandateOriginatorReference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInTpSoMandateOriginatorReference() {
        return inTpSoMandateOriginatorReference;
    }

    /**
     * Sets the value of the inTpSoMandateOriginatorReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInTpSoMandateOriginatorReference(String value) {
        this.inTpSoMandateOriginatorReference = value;
    }

    /**
     * Gets the value of the inTpSoMandatePolicyNumber1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInTpSoMandatePolicyNumber1() {
        return inTpSoMandatePolicyNumber1;
    }

    /**
     * Sets the value of the inTpSoMandatePolicyNumber1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInTpSoMandatePolicyNumber1(String value) {
        this.inTpSoMandatePolicyNumber1 = value;
    }

    /**
     * Gets the value of the inTpSoMandatePolicyNumber2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInTpSoMandatePolicyNumber2() {
        return inTpSoMandatePolicyNumber2;
    }

    /**
     * Sets the value of the inTpSoMandatePolicyNumber2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInTpSoMandatePolicyNumber2(String value) {
        this.inTpSoMandatePolicyNumber2 = value;
    }

    /**
     * Gets the value of the inTpSoMandateRemarks property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInTpSoMandateRemarks() {
        return inTpSoMandateRemarks;
    }

    /**
     * Sets the value of the inTpSoMandateRemarks property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInTpSoMandateRemarks(String value) {
        this.inTpSoMandateRemarks = value;
    }

    /**
     * Gets the value of the inTpSoMandateTpSoIdentifier property.
     * 
     */
    public double getInTpSoMandateTpSoIdentifier() {
        return inTpSoMandateTpSoIdentifier;
    }

    /**
     * Sets the value of the inTpSoMandateTpSoIdentifier property.
     * 
     */
    public void setInTpSoMandateTpSoIdentifier(double value) {
        this.inTpSoMandateTpSoIdentifier = value;
    }

    /**
     * Gets the value of the inGrmMtBics property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfT2102VInGrmMtBicsItem }
     *     
     */
    public ArrayOfT2102VInGrmMtBicsItem getInGrmMtBics() {
        return inGrmMtBics;
    }

    /**
     * Sets the value of the inGrmMtBics property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfT2102VInGrmMtBicsItem }
     *     
     */
    public void setInGrmMtBics(ArrayOfT2102VInGrmMtBicsItem value) {
        this.inGrmMtBics = value;
    }

    /**
     * Gets the value of the inGrpDays property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfT2102VInGrpDaysItem }
     *     
     */
    public ArrayOfT2102VInGrpDaysItem getInGrpDays() {
        return inGrpDays;
    }

    /**
     * Sets the value of the inGrpDays property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfT2102VInGrpDaysItem }
     *     
     */
    public void setInGrpDays(ArrayOfT2102VInGrpDaysItem value) {
        this.inGrpDays = value;
    }

}
