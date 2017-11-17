
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for T2102V_StandingOrderTransferExport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="T2102V_StandingOrderTransferExport">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}BaseExport">
 *       &lt;sequence>
 *         &lt;element name="OurCrAccountListCurrencyShortDescr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutAcctWithBankIefSuppliedNumber5" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutAmountInsertIefSuppliedPayableAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutCollaborationBankCollaborationBanksBankId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutCollaborationBankCollaborationBanksBankName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCorrespDebitedCurrencyDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCorrespDebitedCurrencyIdCurrency" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutCorrespDebitedCurrencyShortDescr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCorrespDebitedProfitsAccountAccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCorrespondentBankCustomerCDigit" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutCorrespondentBankCustomerCustId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutCorrespondentBankCustomerSurname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCounterOfTpSoCommitmentTpSoIdentifier" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OutCrAccountListDepositAccountAccountNumber" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OutCrAccountListDepositAccountCDigit" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutCrAccountListDepositAccountDesignation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCrAccountListProductIdProduct" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutCrAccountListProfitsAccountAccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCrAccountListUnitCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutCrCustomerNameListListSetDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCrDepositListJustificDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCrDepositListJustificIdJustific" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutCrOtherAfmAfmNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCrOtherIdIdNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutDctFrtSwiftAddressBankName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutDctFrtSwiftAddressParticipantBank" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutDctIpsInstrumentDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutDctIpsInstrumentInstrumJustific" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutDctIpsMessageStageBenefAddressCountry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutDctIpsMessageStageBenefAddressLine1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutDctIpsMessageStageBenefAddressLine2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutDctIpsMessageStageBenefAddressPostCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutDctIpsMessageStageBenefBankAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutDctIpsMessageStageBenefBicAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutDctIpsMessageStageBenefFullname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutDctIpsMessageStageBenefIdentificationType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutDctIpsMessageStageBenefIdentificationValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutDctIpsMessageStageBenefResident" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutDctIpsMessageStageOrderChargeBearer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutDctIpsMessageStageOrderClearingSystem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutDctIpsMessageStageOrderCurrency" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutDctIpsMessageStageOrderInstrNextAgent3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutDctIpsMessageStageOrderInstrumentCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutDctIpsMessageStageOrderInstrumentJustificId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutDctIpsMessageStageOrderPurposeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutDctIpsMessageStageOrderRemmitanceInfo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutDctIpsMessageStageTpSoIdentifier" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OutDefaultCreditJustificJustificDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutDefaultCreditJustificJustificEntryStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutDefaultCreditJustificJustificIdJustific" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutDefaultCreditJustificJustificShortDescr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutDefaultDebitJustificJustificDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutDefaultDebitJustificJustificEntryStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutDefaultDebitJustificJustificIdJustific" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutDefaultDebitJustificJustificShortDescr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutDepTrxRecordingUUserTotalsAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutDiasSwiftJustificDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutDiasSwiftJustificIdJustific" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutDrAccountListCurrencyShortDescr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutDrAccountListDepositAccountAccountNumber" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OutDrAccountListDepositAccountCDigit" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutDrAccountListDepositAccountDesignation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutDrAccountListProductIdProduct" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutDrAccountListProfitsAccountAccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutDrAccountListUnitCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutDrCntryGenericDetailDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutDrCustAddressAddress1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutDrCustAddressCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutDrCustAddressZipCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutDrCustomerNameListListSetDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutDrDepositListJustificDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutDrDepositListJustificIdJustific" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutDrOtherAfmAfmNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutDrOtherIdIdNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutIbanCountryCharSuppliedChar2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutIbanCountryContinueCharSuppliedChar16" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutIbanCountryContinueCharSuppliedChar2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutIbanCountryContinueCharSuppliedChar3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutIbanCountryContinueCharSuppliedChar4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutIbanWorkSetChar37" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutJustificOfDepositCreditJustificIdJustific" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutLnsExpenseDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutMontranBanksBankCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutMontranBanksDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutMontranBanksGovernmentBank" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutMontranTpSoBankId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutMontranTpSoBenefAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutMontranTpSoGround" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutMontranTpSoInformation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutMontranTpSoTaxNoTax" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutMontranTpSoTerritoryCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutMontranTpSoTpSoIdentifier" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OutMontranTpSoTreasury" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutOutgoingOrderProdListProductDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutOutgoingOrderProdListProductIdProduct" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutOutgoingOrdersAccWithBankSwif" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutOutgoingOrdersAccountWithInstitution" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutOutgoingOrdersBenefAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutOutgoingOrdersCoveringMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutOutgoingOrdersFbCharges" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutOutgoingOrdersStpFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutResponsibleUnitCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutSecDrAccListCurrencyShortDescr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSecondaryDebitDepositAccountAccountNumber" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OutSecondaryDebitDepositAccountCDigit" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutSecondaryDebitDepositAccountDesignation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSecondaryDebitProfitsAccountAccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutServJustifListJustificDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutServJustifListJustificIdJustific" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutServProdListProductDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutServProdListProductIdProduct" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutSoSwiftCrAccountDtl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSoSwiftDetailOfCharge" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSoSwiftFreeText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSoSwiftIban" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSoSwiftInformation1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSoSwiftInformation2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSoSwiftInformation3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSoSwiftInformation4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSoSwiftInformation5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSoSwiftInformation6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSoSwiftJustific1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSoSwiftJustific2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSoSwiftJustific3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSoSwiftJustific4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSoSwiftOriginCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSoSwiftReceiverDiasUnit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSoSwiftServiceCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSoSwiftTpSoIdentifier" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OutSoSwiftTransCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSoSwiftValueDays" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutSoSwift103AccWithInsti57a" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSoSwift103BankOperCod23b" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSoSwift103BenefCustomer59a" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSoSwift103Chk13c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSoSwift103Chk20" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSoSwift103Chk23b" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSoSwift103Chk23e" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSoSwift103Chk26t" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSoSwift103Chk32a" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSoSwift103Chk33b" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSoSwift103Chk36" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSoSwift103Chk50a" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSoSwift103Chk51a" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSoSwift103Chk52a" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSoSwift103Chk53a" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSoSwift103Chk54a" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSoSwift103Chk55a" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSoSwift103Chk56a" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSoSwift103Chk57a" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSoSwift103Chk59a" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSoSwift103Chk70" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSoSwift103Chk71a" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSoSwift103Chk71f" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSoSwift103Chk71g" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSoSwift103Chk72" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSoSwift103Chk77b" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSoSwift103Chk77t" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSoSwift103CoveringMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSoSwift103CurInstrAmn33b" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSoSwift103DetOfCharges71a" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSoSwift103EnvlCnts77t" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSoSwift103ExchangeRate36" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSoSwift103InstrCode23e" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSoSwift103IntermInstit56a" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSoSwift103OrderingCust50a" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSoSwift103OrderingInsti52a" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSoSwift103OutgBenefAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSoSwift103PriorityCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSoSwift103RcvrsCharges71g" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSoSwift103RcvrsCorr54a" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSoSwift103ReceiverBic" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSoSwift103RegulRpt77b" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSoSwift103RemtnceInform70" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSoSwift103SenderBic" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSoSwift103SendersCorr53a" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSoSwift103SendingInstit51a" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSoSwift103SndrToRcvr72" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSoSwift103SndrsCharges71f" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSoSwift103StpFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSoSwift103ThirdReimbIn55a" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSoSwift103TimeIndicatio13c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSoSwift103TpSoIdentifier" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OutSoSwift103TrxRefNo20" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSoSwift103TrxTypeCode26t" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSoSwift103ValueCurAmn32a" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSoSwift103ValueDays" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutSoSwift202AccWithInsti57a" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSoSwift202SndrToRcvr72" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSoSwift202TpSoIdentifier" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OutStatusIefSuppliedActionEntryDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutStatusIefSuppliedActionEntryMsg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutStatusIefSuppliedSrvStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSwiftBillPayableProdListProductDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSwiftBillPayableProdListProductIdProduct" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutSwiftDepositAccJustificJustificDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSwiftDepositAccJustificJustificIdJustific" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutTaxNoTaxGenericDetailDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutTaxNoTaxGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutTerritoryCodeGenericDetailDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutTerritoryCodeGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutTpSoCommitmentAccProductType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutTpSoCommitmentAchBankCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutTpSoCommitmentActivationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutTpSoCommitmentAdvancesRelated" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutTpSoCommitmentAllowNotExTries" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutTpSoCommitmentBillPayabJustId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutTpSoCommitmentBillPayabProdId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutTpSoCommitmentBookBalanceMargin" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutTpSoCommitmentBopCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutTpSoCommitmentBpBenefAddress1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutTpSoCommitmentBpBenefAddress2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutTpSoCommitmentBpBenefAddress3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutTpSoCommitmentBpBenefCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutTpSoCommitmentBpBenefCountry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutTpSoCommitmentBpBenefName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutTpSoCommitmentBpBenefZipCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutTpSoCommitmentCancelComments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutTpSoCommitmentCommisionDiscount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutTpSoCommitmentCountryCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutTpSoCommitmentCrAccComments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutTpSoCommitmentCrAccCurrency" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutTpSoCommitmentCrAccCustomerCd" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutTpSoCommitmentCrAccCustomerId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutTpSoCommitmentCrBonusCommCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutTpSoCommitmentCrBonusCommDisc" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutTpSoCommitmentCrChargeType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutTpSoCommitmentCrNonResident" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutTpSoCommitmentCrPrintAdvice" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutTpSoCommitmentDataField1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutTpSoCommitmentDataField2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutTpSoCommitmentDataField3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutTpSoCommitmentDataField4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutTpSoCommitmentDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutTpSoCommitmentDiscountCost" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutTpSoCommitmentDrAccComments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutTpSoCommitmentDrAccCurrency" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutTpSoCommitmentDrAccCustomerCd" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutTpSoCommitmentDrAccCustomerId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutTpSoCommitmentDrPrintAdvice" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutTpSoCommitmentEntryStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutTpSoCommitmentFinalizeFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutTpSoCommitmentFirstPaymentAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutTpSoCommitmentFirstPaymentDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutTpSoCommitmentFrequency" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutTpSoCommitmentFrequencyUnit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutTpSoCommitmentGeneralComments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutTpSoCommitmentHolidayInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutTpSoCommitmentInsuffChargeCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutTpSoCommitmentInsuffChargeDisc" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutTpSoCommitmentIssueDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutTpSoCommitmentLastPaymentAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutTpSoCommitmentLastPaymentDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutTpSoCommitmentLastTransferDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutTpSoCommitmentLastUpdateDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutTpSoCommitmentMaxNoOfAttempts" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutTpSoCommitmentNormalActiveDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutTpSoCommitmentOrderIssueJustid" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutTpSoCommitmentOrderIssueProdid" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutTpSoCommitmentOrderSendrecInfo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutTpSoCommitmentOrderSpecialTerm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutTpSoCommitmentOtherBankAccCd" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutTpSoCommitmentOtherBankAccNo" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OutTpSoCommitmentOtherBankAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutTpSoCommitmentOtherBankCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutTpSoCommitmentOtherBankUnit" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutTpSoCommitmentPayeeBank" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutTpSoCommitmentPaymentAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutTpSoCommitmentPaymentsCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutTpSoCommitmentPoFbCharges" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutTpSoCommitmentPrivilegedFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutTpSoCommitmentSectorCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutTpSoCommitmentSoCrChargesInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutTpSoCommitmentSoDrChargesInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutTpSoCommitmentSoSwiftStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutTpSoCommitmentStandOrderMethod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutTpSoCommitmentSuspensDateFrom" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutTpSoCommitmentSuspensDateTo" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutTpSoCommitmentSuspensExecutions" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutTpSoCommitmentTimestmp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutTpSoCommitmentTotalAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutTpSoCommitmentTotalAvailableTr" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutTpSoCommitmentTpCrDrIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutTpSoCommitmentTpSoIdentifier" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OutTpSoCommitmentTpSoIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutTpSoCommitmentTrxUser" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutTpSoMandateDbAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutTpSoMandateDbBank" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutTpSoMandateDbBranch" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutTpSoMandateOriginatorReference" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutTpSoMandatePolicyNumber1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutTpSoMandatePolicyNumber2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutTpSoMandateRemarks" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutTpSoMandateTpSoIdentifier" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OutTreasuryGenericDetailDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutTreasuryGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutVlOutClientProfitsExitStateWorkActualMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutVlOutClientProfitsExitStateWorkId" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OutVlOutClientProfitsExitStateWorkLanguage" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutVlOutClientProfitsExitStateWorkMessageType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutVlOutClientProfitsExitStateWorkPrftSystem" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutVlOutClientProfitsExitStateWorkRoutineSn" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OutVlOutClientProfitsExitStateWorkTerminationAction" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutVlOutClientProfitsExitStateWorkValruleId" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OutVlOutClientProfitsExitStateWorkValruleSnum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGrpDays" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}ArrayOfT2102VOutGrpDaysItem" minOccurs="0"/>
 *         &lt;element name="OutGrpMessageErrors" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}ArrayOfT2102VOutGrpMessageErrorsItem" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "T2102V_StandingOrderTransferExport", propOrder = {
    "ourCrAccountListCurrencyShortDescr",
    "outAcctWithBankIefSuppliedNumber5",
    "outAmountInsertIefSuppliedPayableAmount",
    "outCollaborationBankCollaborationBanksBankId",
    "outCollaborationBankCollaborationBanksBankName",
    "outCorrespDebitedCurrencyDescription",
    "outCorrespDebitedCurrencyIdCurrency",
    "outCorrespDebitedCurrencyShortDescr",
    "outCorrespDebitedProfitsAccountAccountNumber",
    "outCorrespondentBankCustomerCDigit",
    "outCorrespondentBankCustomerCustId",
    "outCorrespondentBankCustomerSurname",
    "outCounterOfTpSoCommitmentTpSoIdentifier",
    "outCrAccountListDepositAccountAccountNumber",
    "outCrAccountListDepositAccountCDigit",
    "outCrAccountListDepositAccountDesignation",
    "outCrAccountListProductIdProduct",
    "outCrAccountListProfitsAccountAccountNumber",
    "outCrAccountListUnitCode",
    "outCrCustomerNameListListSetDescription",
    "outCrDepositListJustificDescription",
    "outCrDepositListJustificIdJustific",
    "outCrOtherAfmAfmNo",
    "outCrOtherIdIdNo",
    "outDctFrtSwiftAddressBankName",
    "outDctFrtSwiftAddressParticipantBank",
    "outDctIpsInstrumentDescription",
    "outDctIpsInstrumentInstrumJustific",
    "outDctIpsMessageStageBenefAddressCountry",
    "outDctIpsMessageStageBenefAddressLine1",
    "outDctIpsMessageStageBenefAddressLine2",
    "outDctIpsMessageStageBenefAddressPostCode",
    "outDctIpsMessageStageBenefBankAccount",
    "outDctIpsMessageStageBenefBicAddress",
    "outDctIpsMessageStageBenefFullname",
    "outDctIpsMessageStageBenefIdentificationType",
    "outDctIpsMessageStageBenefIdentificationValue",
    "outDctIpsMessageStageBenefResident",
    "outDctIpsMessageStageOrderChargeBearer",
    "outDctIpsMessageStageOrderClearingSystem",
    "outDctIpsMessageStageOrderCurrency",
    "outDctIpsMessageStageOrderInstrNextAgent3",
    "outDctIpsMessageStageOrderInstrumentCode",
    "outDctIpsMessageStageOrderInstrumentJustificId",
    "outDctIpsMessageStageOrderPurposeCode",
    "outDctIpsMessageStageOrderRemmitanceInfo",
    "outDctIpsMessageStageTpSoIdentifier",
    "outDefaultCreditJustificJustificDescription",
    "outDefaultCreditJustificJustificEntryStatus",
    "outDefaultCreditJustificJustificIdJustific",
    "outDefaultCreditJustificJustificShortDescr",
    "outDefaultDebitJustificJustificDescription",
    "outDefaultDebitJustificJustificEntryStatus",
    "outDefaultDebitJustificJustificIdJustific",
    "outDefaultDebitJustificJustificShortDescr",
    "outDepTrxRecordingUUserTotalsAmn",
    "outDiasSwiftJustificDescription",
    "outDiasSwiftJustificIdJustific",
    "outDrAccountListCurrencyShortDescr",
    "outDrAccountListDepositAccountAccountNumber",
    "outDrAccountListDepositAccountCDigit",
    "outDrAccountListDepositAccountDesignation",
    "outDrAccountListProductIdProduct",
    "outDrAccountListProfitsAccountAccountNumber",
    "outDrAccountListUnitCode",
    "outDrCntryGenericDetailDescription",
    "outDrCustAddressAddress1",
    "outDrCustAddressCity",
    "outDrCustAddressZipCode",
    "outDrCustomerNameListListSetDescription",
    "outDrDepositListJustificDescription",
    "outDrDepositListJustificIdJustific",
    "outDrOtherAfmAfmNo",
    "outDrOtherIdIdNo",
    "outIbanCountryCharSuppliedChar2",
    "outIbanCountryContinueCharSuppliedChar16",
    "outIbanCountryContinueCharSuppliedChar2",
    "outIbanCountryContinueCharSuppliedChar3",
    "outIbanCountryContinueCharSuppliedChar4",
    "outIbanWorkSetChar37",
    "outJustificOfDepositCreditJustificIdJustific",
    "outLnsExpenseDescription",
    "outMontranBanksBankCode",
    "outMontranBanksDescription",
    "outMontranBanksGovernmentBank",
    "outMontranTpSoBankId",
    "outMontranTpSoBenefAccount",
    "outMontranTpSoGround",
    "outMontranTpSoInformation",
    "outMontranTpSoTaxNoTax",
    "outMontranTpSoTerritoryCode",
    "outMontranTpSoTpSoIdentifier",
    "outMontranTpSoTreasury",
    "outOutgoingOrderProdListProductDescription",
    "outOutgoingOrderProdListProductIdProduct",
    "outOutgoingOrdersAccWithBankSwif",
    "outOutgoingOrdersAccountWithInstitution",
    "outOutgoingOrdersBenefAccount",
    "outOutgoingOrdersCoveringMessage",
    "outOutgoingOrdersFbCharges",
    "outOutgoingOrdersStpFlag",
    "outResponsibleUnitCode",
    "outSecDrAccListCurrencyShortDescr",
    "outSecondaryDebitDepositAccountAccountNumber",
    "outSecondaryDebitDepositAccountCDigit",
    "outSecondaryDebitDepositAccountDesignation",
    "outSecondaryDebitProfitsAccountAccountNumber",
    "outServJustifListJustificDescription",
    "outServJustifListJustificIdJustific",
    "outServProdListProductDescription",
    "outServProdListProductIdProduct",
    "outSoSwiftCrAccountDtl",
    "outSoSwiftDetailOfCharge",
    "outSoSwiftFreeText",
    "outSoSwiftIban",
    "outSoSwiftInformation1",
    "outSoSwiftInformation2",
    "outSoSwiftInformation3",
    "outSoSwiftInformation4",
    "outSoSwiftInformation5",
    "outSoSwiftInformation6",
    "outSoSwiftJustific1",
    "outSoSwiftJustific2",
    "outSoSwiftJustific3",
    "outSoSwiftJustific4",
    "outSoSwiftOriginCode",
    "outSoSwiftReceiverDiasUnit",
    "outSoSwiftServiceCode",
    "outSoSwiftTpSoIdentifier",
    "outSoSwiftTransCode",
    "outSoSwiftValueDays",
    "outSoSwift103AccWithInsti57A",
    "outSoSwift103BankOperCod23B",
    "outSoSwift103BenefCustomer59A",
    "outSoSwift103Chk13C",
    "outSoSwift103Chk20",
    "outSoSwift103Chk23B",
    "outSoSwift103Chk23E",
    "outSoSwift103Chk26T",
    "outSoSwift103Chk32A",
    "outSoSwift103Chk33B",
    "outSoSwift103Chk36",
    "outSoSwift103Chk50A",
    "outSoSwift103Chk51A",
    "outSoSwift103Chk52A",
    "outSoSwift103Chk53A",
    "outSoSwift103Chk54A",
    "outSoSwift103Chk55A",
    "outSoSwift103Chk56A",
    "outSoSwift103Chk57A",
    "outSoSwift103Chk59A",
    "outSoSwift103Chk70",
    "outSoSwift103Chk71A",
    "outSoSwift103Chk71F",
    "outSoSwift103Chk71G",
    "outSoSwift103Chk72",
    "outSoSwift103Chk77B",
    "outSoSwift103Chk77T",
    "outSoSwift103CoveringMessage",
    "outSoSwift103CurInstrAmn33B",
    "outSoSwift103DetOfCharges71A",
    "outSoSwift103EnvlCnts77T",
    "outSoSwift103ExchangeRate36",
    "outSoSwift103InstrCode23E",
    "outSoSwift103IntermInstit56A",
    "outSoSwift103OrderingCust50A",
    "outSoSwift103OrderingInsti52A",
    "outSoSwift103OutgBenefAccount",
    "outSoSwift103PriorityCode",
    "outSoSwift103RcvrsCharges71G",
    "outSoSwift103RcvrsCorr54A",
    "outSoSwift103ReceiverBic",
    "outSoSwift103RegulRpt77B",
    "outSoSwift103RemtnceInform70",
    "outSoSwift103SenderBic",
    "outSoSwift103SendersCorr53A",
    "outSoSwift103SendingInstit51A",
    "outSoSwift103SndrToRcvr72",
    "outSoSwift103SndrsCharges71F",
    "outSoSwift103StpFlag",
    "outSoSwift103ThirdReimbIn55A",
    "outSoSwift103TimeIndicatio13C",
    "outSoSwift103TpSoIdentifier",
    "outSoSwift103TrxRefNo20",
    "outSoSwift103TrxTypeCode26T",
    "outSoSwift103ValueCurAmn32A",
    "outSoSwift103ValueDays",
    "outSoSwift202AccWithInsti57A",
    "outSoSwift202SndrToRcvr72",
    "outSoSwift202TpSoIdentifier",
    "outStatusIefSuppliedActionEntryDesc",
    "outStatusIefSuppliedActionEntryMsg",
    "outStatusIefSuppliedSrvStatus",
    "outSwiftBillPayableProdListProductDescription",
    "outSwiftBillPayableProdListProductIdProduct",
    "outSwiftDepositAccJustificJustificDescription",
    "outSwiftDepositAccJustificJustificIdJustific",
    "outTaxNoTaxGenericDetailDescription",
    "outTaxNoTaxGenericDetailSerialNum",
    "outTerritoryCodeGenericDetailDescription",
    "outTerritoryCodeGenericDetailSerialNum",
    "outTpSoCommitmentAccProductType",
    "outTpSoCommitmentAchBankCode",
    "outTpSoCommitmentActivationDate",
    "outTpSoCommitmentAdvancesRelated",
    "outTpSoCommitmentAllowNotExTries",
    "outTpSoCommitmentBillPayabJustId",
    "outTpSoCommitmentBillPayabProdId",
    "outTpSoCommitmentBookBalanceMargin",
    "outTpSoCommitmentBopCode",
    "outTpSoCommitmentBpBenefAddress1",
    "outTpSoCommitmentBpBenefAddress2",
    "outTpSoCommitmentBpBenefAddress3",
    "outTpSoCommitmentBpBenefCity",
    "outTpSoCommitmentBpBenefCountry",
    "outTpSoCommitmentBpBenefName",
    "outTpSoCommitmentBpBenefZipCode",
    "outTpSoCommitmentCancelComments",
    "outTpSoCommitmentCommisionDiscount",
    "outTpSoCommitmentCountryCode",
    "outTpSoCommitmentCrAccComments",
    "outTpSoCommitmentCrAccCurrency",
    "outTpSoCommitmentCrAccCustomerCd",
    "outTpSoCommitmentCrAccCustomerId",
    "outTpSoCommitmentCrBonusCommCode",
    "outTpSoCommitmentCrBonusCommDisc",
    "outTpSoCommitmentCrChargeType",
    "outTpSoCommitmentCrNonResident",
    "outTpSoCommitmentCrPrintAdvice",
    "outTpSoCommitmentDataField1",
    "outTpSoCommitmentDataField2",
    "outTpSoCommitmentDataField3",
    "outTpSoCommitmentDataField4",
    "outTpSoCommitmentDescription",
    "outTpSoCommitmentDiscountCost",
    "outTpSoCommitmentDrAccComments",
    "outTpSoCommitmentDrAccCurrency",
    "outTpSoCommitmentDrAccCustomerCd",
    "outTpSoCommitmentDrAccCustomerId",
    "outTpSoCommitmentDrPrintAdvice",
    "outTpSoCommitmentEntryStatus",
    "outTpSoCommitmentFinalizeFlag",
    "outTpSoCommitmentFirstPaymentAmn",
    "outTpSoCommitmentFirstPaymentDate",
    "outTpSoCommitmentFrequency",
    "outTpSoCommitmentFrequencyUnit",
    "outTpSoCommitmentGeneralComments",
    "outTpSoCommitmentHolidayInd",
    "outTpSoCommitmentInsuffChargeCode",
    "outTpSoCommitmentInsuffChargeDisc",
    "outTpSoCommitmentIssueDate",
    "outTpSoCommitmentLastPaymentAmn",
    "outTpSoCommitmentLastPaymentDate",
    "outTpSoCommitmentLastTransferDate",
    "outTpSoCommitmentLastUpdateDate",
    "outTpSoCommitmentMaxNoOfAttempts",
    "outTpSoCommitmentNormalActiveDate",
    "outTpSoCommitmentOrderIssueJustid",
    "outTpSoCommitmentOrderIssueProdid",
    "outTpSoCommitmentOrderSendrecInfo",
    "outTpSoCommitmentOrderSpecialTerm",
    "outTpSoCommitmentOtherBankAccCd",
    "outTpSoCommitmentOtherBankAccNo",
    "outTpSoCommitmentOtherBankAddress",
    "outTpSoCommitmentOtherBankCode",
    "outTpSoCommitmentOtherBankUnit",
    "outTpSoCommitmentPayeeBank",
    "outTpSoCommitmentPaymentAmount",
    "outTpSoCommitmentPaymentsCount",
    "outTpSoCommitmentPoFbCharges",
    "outTpSoCommitmentPrivilegedFlag",
    "outTpSoCommitmentSectorCode",
    "outTpSoCommitmentSoCrChargesInd",
    "outTpSoCommitmentSoDrChargesInd",
    "outTpSoCommitmentSoSwiftStatus",
    "outTpSoCommitmentStandOrderMethod",
    "outTpSoCommitmentSuspensDateFrom",
    "outTpSoCommitmentSuspensDateTo",
    "outTpSoCommitmentSuspensExecutions",
    "outTpSoCommitmentTimestmp",
    "outTpSoCommitmentTotalAmount",
    "outTpSoCommitmentTotalAvailableTr",
    "outTpSoCommitmentTpCrDrIndicator",
    "outTpSoCommitmentTpSoIdentifier",
    "outTpSoCommitmentTpSoIndicator",
    "outTpSoCommitmentTrxUser",
    "outTpSoMandateDbAccount",
    "outTpSoMandateDbBank",
    "outTpSoMandateDbBranch",
    "outTpSoMandateOriginatorReference",
    "outTpSoMandatePolicyNumber1",
    "outTpSoMandatePolicyNumber2",
    "outTpSoMandateRemarks",
    "outTpSoMandateTpSoIdentifier",
    "outTreasuryGenericDetailDescription",
    "outTreasuryGenericDetailSerialNum",
    "outVlOutClientProfitsExitStateWorkActualMessage",
    "outVlOutClientProfitsExitStateWorkId",
    "outVlOutClientProfitsExitStateWorkLanguage",
    "outVlOutClientProfitsExitStateWorkMessageType",
    "outVlOutClientProfitsExitStateWorkPrftSystem",
    "outVlOutClientProfitsExitStateWorkRoutineSn",
    "outVlOutClientProfitsExitStateWorkTerminationAction",
    "outVlOutClientProfitsExitStateWorkValruleId",
    "outVlOutClientProfitsExitStateWorkValruleSnum",
    "outGrpDays",
    "outGrpMessageErrors"
})
public class T2102VStandingOrderTransferExport
    extends BaseExport
{

    @XmlElement(name = "OurCrAccountListCurrencyShortDescr")
    protected String ourCrAccountListCurrencyShortDescr;
    @XmlElement(name = "OutAcctWithBankIefSuppliedNumber5")
    protected int outAcctWithBankIefSuppliedNumber5;
    @XmlElement(name = "OutAmountInsertIefSuppliedPayableAmount", required = true)
    protected BigDecimal outAmountInsertIefSuppliedPayableAmount;
    @XmlElement(name = "OutCollaborationBankCollaborationBanksBankId")
    protected int outCollaborationBankCollaborationBanksBankId;
    @XmlElement(name = "OutCollaborationBankCollaborationBanksBankName")
    protected String outCollaborationBankCollaborationBanksBankName;
    @XmlElement(name = "OutCorrespDebitedCurrencyDescription")
    protected String outCorrespDebitedCurrencyDescription;
    @XmlElement(name = "OutCorrespDebitedCurrencyIdCurrency")
    protected int outCorrespDebitedCurrencyIdCurrency;
    @XmlElement(name = "OutCorrespDebitedCurrencyShortDescr")
    protected String outCorrespDebitedCurrencyShortDescr;
    @XmlElement(name = "OutCorrespDebitedProfitsAccountAccountNumber")
    protected String outCorrespDebitedProfitsAccountAccountNumber;
    @XmlElement(name = "OutCorrespondentBankCustomerCDigit")
    protected short outCorrespondentBankCustomerCDigit;
    @XmlElement(name = "OutCorrespondentBankCustomerCustId")
    protected int outCorrespondentBankCustomerCustId;
    @XmlElement(name = "OutCorrespondentBankCustomerSurname")
    protected String outCorrespondentBankCustomerSurname;
    @XmlElement(name = "OutCounterOfTpSoCommitmentTpSoIdentifier")
    protected double outCounterOfTpSoCommitmentTpSoIdentifier;
    @XmlElement(name = "OutCrAccountListDepositAccountAccountNumber")
    protected double outCrAccountListDepositAccountAccountNumber;
    @XmlElement(name = "OutCrAccountListDepositAccountCDigit")
    protected short outCrAccountListDepositAccountCDigit;
    @XmlElement(name = "OutCrAccountListDepositAccountDesignation")
    protected String outCrAccountListDepositAccountDesignation;
    @XmlElement(name = "OutCrAccountListProductIdProduct")
    protected int outCrAccountListProductIdProduct;
    @XmlElement(name = "OutCrAccountListProfitsAccountAccountNumber")
    protected String outCrAccountListProfitsAccountAccountNumber;
    @XmlElement(name = "OutCrAccountListUnitCode")
    protected int outCrAccountListUnitCode;
    @XmlElement(name = "OutCrCustomerNameListListSetDescription")
    protected String outCrCustomerNameListListSetDescription;
    @XmlElement(name = "OutCrDepositListJustificDescription")
    protected String outCrDepositListJustificDescription;
    @XmlElement(name = "OutCrDepositListJustificIdJustific")
    protected int outCrDepositListJustificIdJustific;
    @XmlElement(name = "OutCrOtherAfmAfmNo")
    protected String outCrOtherAfmAfmNo;
    @XmlElement(name = "OutCrOtherIdIdNo")
    protected String outCrOtherIdIdNo;
    @XmlElement(name = "OutDctFrtSwiftAddressBankName")
    protected String outDctFrtSwiftAddressBankName;
    @XmlElement(name = "OutDctFrtSwiftAddressParticipantBank")
    protected String outDctFrtSwiftAddressParticipantBank;
    @XmlElement(name = "OutDctIpsInstrumentDescription")
    protected String outDctIpsInstrumentDescription;
    @XmlElement(name = "OutDctIpsInstrumentInstrumJustific")
    protected int outDctIpsInstrumentInstrumJustific;
    @XmlElement(name = "OutDctIpsMessageStageBenefAddressCountry")
    protected String outDctIpsMessageStageBenefAddressCountry;
    @XmlElement(name = "OutDctIpsMessageStageBenefAddressLine1")
    protected String outDctIpsMessageStageBenefAddressLine1;
    @XmlElement(name = "OutDctIpsMessageStageBenefAddressLine2")
    protected String outDctIpsMessageStageBenefAddressLine2;
    @XmlElement(name = "OutDctIpsMessageStageBenefAddressPostCode")
    protected String outDctIpsMessageStageBenefAddressPostCode;
    @XmlElement(name = "OutDctIpsMessageStageBenefBankAccount")
    protected String outDctIpsMessageStageBenefBankAccount;
    @XmlElement(name = "OutDctIpsMessageStageBenefBicAddress")
    protected String outDctIpsMessageStageBenefBicAddress;
    @XmlElement(name = "OutDctIpsMessageStageBenefFullname")
    protected String outDctIpsMessageStageBenefFullname;
    @XmlElement(name = "OutDctIpsMessageStageBenefIdentificationType")
    protected String outDctIpsMessageStageBenefIdentificationType;
    @XmlElement(name = "OutDctIpsMessageStageBenefIdentificationValue")
    protected String outDctIpsMessageStageBenefIdentificationValue;
    @XmlElement(name = "OutDctIpsMessageStageBenefResident")
    protected String outDctIpsMessageStageBenefResident;
    @XmlElement(name = "OutDctIpsMessageStageOrderChargeBearer")
    protected String outDctIpsMessageStageOrderChargeBearer;
    @XmlElement(name = "OutDctIpsMessageStageOrderClearingSystem")
    protected String outDctIpsMessageStageOrderClearingSystem;
    @XmlElement(name = "OutDctIpsMessageStageOrderCurrency")
    protected int outDctIpsMessageStageOrderCurrency;
    @XmlElement(name = "OutDctIpsMessageStageOrderInstrNextAgent3")
    protected String outDctIpsMessageStageOrderInstrNextAgent3;
    @XmlElement(name = "OutDctIpsMessageStageOrderInstrumentCode")
    protected String outDctIpsMessageStageOrderInstrumentCode;
    @XmlElement(name = "OutDctIpsMessageStageOrderInstrumentJustificId")
    protected int outDctIpsMessageStageOrderInstrumentJustificId;
    @XmlElement(name = "OutDctIpsMessageStageOrderPurposeCode")
    protected String outDctIpsMessageStageOrderPurposeCode;
    @XmlElement(name = "OutDctIpsMessageStageOrderRemmitanceInfo")
    protected String outDctIpsMessageStageOrderRemmitanceInfo;
    @XmlElement(name = "OutDctIpsMessageStageTpSoIdentifier")
    protected double outDctIpsMessageStageTpSoIdentifier;
    @XmlElement(name = "OutDefaultCreditJustificJustificDescription")
    protected String outDefaultCreditJustificJustificDescription;
    @XmlElement(name = "OutDefaultCreditJustificJustificEntryStatus")
    protected String outDefaultCreditJustificJustificEntryStatus;
    @XmlElement(name = "OutDefaultCreditJustificJustificIdJustific")
    protected int outDefaultCreditJustificJustificIdJustific;
    @XmlElement(name = "OutDefaultCreditJustificJustificShortDescr")
    protected String outDefaultCreditJustificJustificShortDescr;
    @XmlElement(name = "OutDefaultDebitJustificJustificDescription")
    protected String outDefaultDebitJustificJustificDescription;
    @XmlElement(name = "OutDefaultDebitJustificJustificEntryStatus")
    protected String outDefaultDebitJustificJustificEntryStatus;
    @XmlElement(name = "OutDefaultDebitJustificJustificIdJustific")
    protected int outDefaultDebitJustificJustificIdJustific;
    @XmlElement(name = "OutDefaultDebitJustificJustificShortDescr")
    protected String outDefaultDebitJustificJustificShortDescr;
    @XmlElement(name = "OutDepTrxRecordingUUserTotalsAmn", required = true)
    protected BigDecimal outDepTrxRecordingUUserTotalsAmn;
    @XmlElement(name = "OutDiasSwiftJustificDescription")
    protected String outDiasSwiftJustificDescription;
    @XmlElement(name = "OutDiasSwiftJustificIdJustific")
    protected int outDiasSwiftJustificIdJustific;
    @XmlElement(name = "OutDrAccountListCurrencyShortDescr")
    protected String outDrAccountListCurrencyShortDescr;
    @XmlElement(name = "OutDrAccountListDepositAccountAccountNumber")
    protected double outDrAccountListDepositAccountAccountNumber;
    @XmlElement(name = "OutDrAccountListDepositAccountCDigit")
    protected short outDrAccountListDepositAccountCDigit;
    @XmlElement(name = "OutDrAccountListDepositAccountDesignation")
    protected String outDrAccountListDepositAccountDesignation;
    @XmlElement(name = "OutDrAccountListProductIdProduct")
    protected int outDrAccountListProductIdProduct;
    @XmlElement(name = "OutDrAccountListProfitsAccountAccountNumber")
    protected String outDrAccountListProfitsAccountAccountNumber;
    @XmlElement(name = "OutDrAccountListUnitCode")
    protected int outDrAccountListUnitCode;
    @XmlElement(name = "OutDrCntryGenericDetailDescription")
    protected String outDrCntryGenericDetailDescription;
    @XmlElement(name = "OutDrCustAddressAddress1")
    protected String outDrCustAddressAddress1;
    @XmlElement(name = "OutDrCustAddressCity")
    protected String outDrCustAddressCity;
    @XmlElement(name = "OutDrCustAddressZipCode")
    protected String outDrCustAddressZipCode;
    @XmlElement(name = "OutDrCustomerNameListListSetDescription")
    protected String outDrCustomerNameListListSetDescription;
    @XmlElement(name = "OutDrDepositListJustificDescription")
    protected String outDrDepositListJustificDescription;
    @XmlElement(name = "OutDrDepositListJustificIdJustific")
    protected int outDrDepositListJustificIdJustific;
    @XmlElement(name = "OutDrOtherAfmAfmNo")
    protected String outDrOtherAfmAfmNo;
    @XmlElement(name = "OutDrOtherIdIdNo")
    protected String outDrOtherIdIdNo;
    @XmlElement(name = "OutIbanCountryCharSuppliedChar2")
    protected String outIbanCountryCharSuppliedChar2;
    @XmlElement(name = "OutIbanCountryContinueCharSuppliedChar16")
    protected String outIbanCountryContinueCharSuppliedChar16;
    @XmlElement(name = "OutIbanCountryContinueCharSuppliedChar2")
    protected String outIbanCountryContinueCharSuppliedChar2;
    @XmlElement(name = "OutIbanCountryContinueCharSuppliedChar3")
    protected String outIbanCountryContinueCharSuppliedChar3;
    @XmlElement(name = "OutIbanCountryContinueCharSuppliedChar4")
    protected String outIbanCountryContinueCharSuppliedChar4;
    @XmlElement(name = "OutIbanWorkSetChar37")
    protected String outIbanWorkSetChar37;
    @XmlElement(name = "OutJustificOfDepositCreditJustificIdJustific")
    protected int outJustificOfDepositCreditJustificIdJustific;
    @XmlElement(name = "OutLnsExpenseDescription")
    protected String outLnsExpenseDescription;
    @XmlElement(name = "OutMontranBanksBankCode")
    protected String outMontranBanksBankCode;
    @XmlElement(name = "OutMontranBanksDescription")
    protected String outMontranBanksDescription;
    @XmlElement(name = "OutMontranBanksGovernmentBank")
    protected String outMontranBanksGovernmentBank;
    @XmlElement(name = "OutMontranTpSoBankId")
    protected String outMontranTpSoBankId;
    @XmlElement(name = "OutMontranTpSoBenefAccount")
    protected String outMontranTpSoBenefAccount;
    @XmlElement(name = "OutMontranTpSoGround")
    protected String outMontranTpSoGround;
    @XmlElement(name = "OutMontranTpSoInformation")
    protected String outMontranTpSoInformation;
    @XmlElement(name = "OutMontranTpSoTaxNoTax")
    protected int outMontranTpSoTaxNoTax;
    @XmlElement(name = "OutMontranTpSoTerritoryCode")
    protected int outMontranTpSoTerritoryCode;
    @XmlElement(name = "OutMontranTpSoTpSoIdentifier")
    protected double outMontranTpSoTpSoIdentifier;
    @XmlElement(name = "OutMontranTpSoTreasury")
    protected int outMontranTpSoTreasury;
    @XmlElement(name = "OutOutgoingOrderProdListProductDescription")
    protected String outOutgoingOrderProdListProductDescription;
    @XmlElement(name = "OutOutgoingOrderProdListProductIdProduct")
    protected int outOutgoingOrderProdListProductIdProduct;
    @XmlElement(name = "OutOutgoingOrdersAccWithBankSwif")
    protected String outOutgoingOrdersAccWithBankSwif;
    @XmlElement(name = "OutOutgoingOrdersAccountWithInstitution")
    protected String outOutgoingOrdersAccountWithInstitution;
    @XmlElement(name = "OutOutgoingOrdersBenefAccount")
    protected String outOutgoingOrdersBenefAccount;
    @XmlElement(name = "OutOutgoingOrdersCoveringMessage")
    protected String outOutgoingOrdersCoveringMessage;
    @XmlElement(name = "OutOutgoingOrdersFbCharges")
    protected String outOutgoingOrdersFbCharges;
    @XmlElement(name = "OutOutgoingOrdersStpFlag")
    protected String outOutgoingOrdersStpFlag;
    @XmlElement(name = "OutResponsibleUnitCode")
    protected int outResponsibleUnitCode;
    @XmlElement(name = "OutSecDrAccListCurrencyShortDescr")
    protected String outSecDrAccListCurrencyShortDescr;
    @XmlElement(name = "OutSecondaryDebitDepositAccountAccountNumber")
    protected double outSecondaryDebitDepositAccountAccountNumber;
    @XmlElement(name = "OutSecondaryDebitDepositAccountCDigit")
    protected short outSecondaryDebitDepositAccountCDigit;
    @XmlElement(name = "OutSecondaryDebitDepositAccountDesignation")
    protected String outSecondaryDebitDepositAccountDesignation;
    @XmlElement(name = "OutSecondaryDebitProfitsAccountAccountNumber")
    protected String outSecondaryDebitProfitsAccountAccountNumber;
    @XmlElement(name = "OutServJustifListJustificDescription")
    protected String outServJustifListJustificDescription;
    @XmlElement(name = "OutServJustifListJustificIdJustific")
    protected int outServJustifListJustificIdJustific;
    @XmlElement(name = "OutServProdListProductDescription")
    protected String outServProdListProductDescription;
    @XmlElement(name = "OutServProdListProductIdProduct")
    protected int outServProdListProductIdProduct;
    @XmlElement(name = "OutSoSwiftCrAccountDtl")
    protected String outSoSwiftCrAccountDtl;
    @XmlElement(name = "OutSoSwiftDetailOfCharge")
    protected String outSoSwiftDetailOfCharge;
    @XmlElement(name = "OutSoSwiftFreeText")
    protected String outSoSwiftFreeText;
    @XmlElement(name = "OutSoSwiftIban")
    protected String outSoSwiftIban;
    @XmlElement(name = "OutSoSwiftInformation1")
    protected String outSoSwiftInformation1;
    @XmlElement(name = "OutSoSwiftInformation2")
    protected String outSoSwiftInformation2;
    @XmlElement(name = "OutSoSwiftInformation3")
    protected String outSoSwiftInformation3;
    @XmlElement(name = "OutSoSwiftInformation4")
    protected String outSoSwiftInformation4;
    @XmlElement(name = "OutSoSwiftInformation5")
    protected String outSoSwiftInformation5;
    @XmlElement(name = "OutSoSwiftInformation6")
    protected String outSoSwiftInformation6;
    @XmlElement(name = "OutSoSwiftJustific1")
    protected String outSoSwiftJustific1;
    @XmlElement(name = "OutSoSwiftJustific2")
    protected String outSoSwiftJustific2;
    @XmlElement(name = "OutSoSwiftJustific3")
    protected String outSoSwiftJustific3;
    @XmlElement(name = "OutSoSwiftJustific4")
    protected String outSoSwiftJustific4;
    @XmlElement(name = "OutSoSwiftOriginCode")
    protected String outSoSwiftOriginCode;
    @XmlElement(name = "OutSoSwiftReceiverDiasUnit")
    protected String outSoSwiftReceiverDiasUnit;
    @XmlElement(name = "OutSoSwiftServiceCode")
    protected String outSoSwiftServiceCode;
    @XmlElement(name = "OutSoSwiftTpSoIdentifier")
    protected double outSoSwiftTpSoIdentifier;
    @XmlElement(name = "OutSoSwiftTransCode")
    protected String outSoSwiftTransCode;
    @XmlElement(name = "OutSoSwiftValueDays")
    protected short outSoSwiftValueDays;
    @XmlElement(name = "OutSoSwift103AccWithInsti57a")
    protected String outSoSwift103AccWithInsti57A;
    @XmlElement(name = "OutSoSwift103BankOperCod23b")
    protected String outSoSwift103BankOperCod23B;
    @XmlElement(name = "OutSoSwift103BenefCustomer59a")
    protected String outSoSwift103BenefCustomer59A;
    @XmlElement(name = "OutSoSwift103Chk13c")
    protected String outSoSwift103Chk13C;
    @XmlElement(name = "OutSoSwift103Chk20")
    protected String outSoSwift103Chk20;
    @XmlElement(name = "OutSoSwift103Chk23b")
    protected String outSoSwift103Chk23B;
    @XmlElement(name = "OutSoSwift103Chk23e")
    protected String outSoSwift103Chk23E;
    @XmlElement(name = "OutSoSwift103Chk26t")
    protected String outSoSwift103Chk26T;
    @XmlElement(name = "OutSoSwift103Chk32a")
    protected String outSoSwift103Chk32A;
    @XmlElement(name = "OutSoSwift103Chk33b")
    protected String outSoSwift103Chk33B;
    @XmlElement(name = "OutSoSwift103Chk36")
    protected String outSoSwift103Chk36;
    @XmlElement(name = "OutSoSwift103Chk50a")
    protected String outSoSwift103Chk50A;
    @XmlElement(name = "OutSoSwift103Chk51a")
    protected String outSoSwift103Chk51A;
    @XmlElement(name = "OutSoSwift103Chk52a")
    protected String outSoSwift103Chk52A;
    @XmlElement(name = "OutSoSwift103Chk53a")
    protected String outSoSwift103Chk53A;
    @XmlElement(name = "OutSoSwift103Chk54a")
    protected String outSoSwift103Chk54A;
    @XmlElement(name = "OutSoSwift103Chk55a")
    protected String outSoSwift103Chk55A;
    @XmlElement(name = "OutSoSwift103Chk56a")
    protected String outSoSwift103Chk56A;
    @XmlElement(name = "OutSoSwift103Chk57a")
    protected String outSoSwift103Chk57A;
    @XmlElement(name = "OutSoSwift103Chk59a")
    protected String outSoSwift103Chk59A;
    @XmlElement(name = "OutSoSwift103Chk70")
    protected String outSoSwift103Chk70;
    @XmlElement(name = "OutSoSwift103Chk71a")
    protected String outSoSwift103Chk71A;
    @XmlElement(name = "OutSoSwift103Chk71f")
    protected String outSoSwift103Chk71F;
    @XmlElement(name = "OutSoSwift103Chk71g")
    protected String outSoSwift103Chk71G;
    @XmlElement(name = "OutSoSwift103Chk72")
    protected String outSoSwift103Chk72;
    @XmlElement(name = "OutSoSwift103Chk77b")
    protected String outSoSwift103Chk77B;
    @XmlElement(name = "OutSoSwift103Chk77t")
    protected String outSoSwift103Chk77T;
    @XmlElement(name = "OutSoSwift103CoveringMessage")
    protected String outSoSwift103CoveringMessage;
    @XmlElement(name = "OutSoSwift103CurInstrAmn33b")
    protected String outSoSwift103CurInstrAmn33B;
    @XmlElement(name = "OutSoSwift103DetOfCharges71a")
    protected String outSoSwift103DetOfCharges71A;
    @XmlElement(name = "OutSoSwift103EnvlCnts77t")
    protected String outSoSwift103EnvlCnts77T;
    @XmlElement(name = "OutSoSwift103ExchangeRate36")
    protected String outSoSwift103ExchangeRate36;
    @XmlElement(name = "OutSoSwift103InstrCode23e")
    protected String outSoSwift103InstrCode23E;
    @XmlElement(name = "OutSoSwift103IntermInstit56a")
    protected String outSoSwift103IntermInstit56A;
    @XmlElement(name = "OutSoSwift103OrderingCust50a")
    protected String outSoSwift103OrderingCust50A;
    @XmlElement(name = "OutSoSwift103OrderingInsti52a")
    protected String outSoSwift103OrderingInsti52A;
    @XmlElement(name = "OutSoSwift103OutgBenefAccount")
    protected String outSoSwift103OutgBenefAccount;
    @XmlElement(name = "OutSoSwift103PriorityCode")
    protected String outSoSwift103PriorityCode;
    @XmlElement(name = "OutSoSwift103RcvrsCharges71g")
    protected String outSoSwift103RcvrsCharges71G;
    @XmlElement(name = "OutSoSwift103RcvrsCorr54a")
    protected String outSoSwift103RcvrsCorr54A;
    @XmlElement(name = "OutSoSwift103ReceiverBic")
    protected String outSoSwift103ReceiverBic;
    @XmlElement(name = "OutSoSwift103RegulRpt77b")
    protected String outSoSwift103RegulRpt77B;
    @XmlElement(name = "OutSoSwift103RemtnceInform70")
    protected String outSoSwift103RemtnceInform70;
    @XmlElement(name = "OutSoSwift103SenderBic")
    protected String outSoSwift103SenderBic;
    @XmlElement(name = "OutSoSwift103SendersCorr53a")
    protected String outSoSwift103SendersCorr53A;
    @XmlElement(name = "OutSoSwift103SendingInstit51a")
    protected String outSoSwift103SendingInstit51A;
    @XmlElement(name = "OutSoSwift103SndrToRcvr72")
    protected String outSoSwift103SndrToRcvr72;
    @XmlElement(name = "OutSoSwift103SndrsCharges71f")
    protected String outSoSwift103SndrsCharges71F;
    @XmlElement(name = "OutSoSwift103StpFlag")
    protected String outSoSwift103StpFlag;
    @XmlElement(name = "OutSoSwift103ThirdReimbIn55a")
    protected String outSoSwift103ThirdReimbIn55A;
    @XmlElement(name = "OutSoSwift103TimeIndicatio13c")
    protected String outSoSwift103TimeIndicatio13C;
    @XmlElement(name = "OutSoSwift103TpSoIdentifier")
    protected double outSoSwift103TpSoIdentifier;
    @XmlElement(name = "OutSoSwift103TrxRefNo20")
    protected String outSoSwift103TrxRefNo20;
    @XmlElement(name = "OutSoSwift103TrxTypeCode26t")
    protected String outSoSwift103TrxTypeCode26T;
    @XmlElement(name = "OutSoSwift103ValueCurAmn32a")
    protected String outSoSwift103ValueCurAmn32A;
    @XmlElement(name = "OutSoSwift103ValueDays")
    protected short outSoSwift103ValueDays;
    @XmlElement(name = "OutSoSwift202AccWithInsti57a")
    protected String outSoSwift202AccWithInsti57A;
    @XmlElement(name = "OutSoSwift202SndrToRcvr72")
    protected String outSoSwift202SndrToRcvr72;
    @XmlElement(name = "OutSoSwift202TpSoIdentifier")
    protected double outSoSwift202TpSoIdentifier;
    @XmlElement(name = "OutStatusIefSuppliedActionEntryDesc")
    protected String outStatusIefSuppliedActionEntryDesc;
    @XmlElement(name = "OutStatusIefSuppliedActionEntryMsg")
    protected String outStatusIefSuppliedActionEntryMsg;
    @XmlElement(name = "OutStatusIefSuppliedSrvStatus")
    protected String outStatusIefSuppliedSrvStatus;
    @XmlElement(name = "OutSwiftBillPayableProdListProductDescription")
    protected String outSwiftBillPayableProdListProductDescription;
    @XmlElement(name = "OutSwiftBillPayableProdListProductIdProduct")
    protected int outSwiftBillPayableProdListProductIdProduct;
    @XmlElement(name = "OutSwiftDepositAccJustificJustificDescription")
    protected String outSwiftDepositAccJustificJustificDescription;
    @XmlElement(name = "OutSwiftDepositAccJustificJustificIdJustific")
    protected int outSwiftDepositAccJustificJustificIdJustific;
    @XmlElement(name = "OutTaxNoTaxGenericDetailDescription")
    protected String outTaxNoTaxGenericDetailDescription;
    @XmlElement(name = "OutTaxNoTaxGenericDetailSerialNum")
    protected int outTaxNoTaxGenericDetailSerialNum;
    @XmlElement(name = "OutTerritoryCodeGenericDetailDescription")
    protected String outTerritoryCodeGenericDetailDescription;
    @XmlElement(name = "OutTerritoryCodeGenericDetailSerialNum")
    protected int outTerritoryCodeGenericDetailSerialNum;
    @XmlElement(name = "OutTpSoCommitmentAccProductType")
    protected String outTpSoCommitmentAccProductType;
    @XmlElement(name = "OutTpSoCommitmentAchBankCode")
    protected String outTpSoCommitmentAchBankCode;
    @XmlElement(name = "OutTpSoCommitmentActivationDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outTpSoCommitmentActivationDate;
    @XmlElement(name = "OutTpSoCommitmentAdvancesRelated")
    protected String outTpSoCommitmentAdvancesRelated;
    @XmlElement(name = "OutTpSoCommitmentAllowNotExTries")
    protected int outTpSoCommitmentAllowNotExTries;
    @XmlElement(name = "OutTpSoCommitmentBillPayabJustId")
    protected int outTpSoCommitmentBillPayabJustId;
    @XmlElement(name = "OutTpSoCommitmentBillPayabProdId")
    protected int outTpSoCommitmentBillPayabProdId;
    @XmlElement(name = "OutTpSoCommitmentBookBalanceMargin", required = true)
    protected BigDecimal outTpSoCommitmentBookBalanceMargin;
    @XmlElement(name = "OutTpSoCommitmentBopCode")
    protected String outTpSoCommitmentBopCode;
    @XmlElement(name = "OutTpSoCommitmentBpBenefAddress1")
    protected String outTpSoCommitmentBpBenefAddress1;
    @XmlElement(name = "OutTpSoCommitmentBpBenefAddress2")
    protected String outTpSoCommitmentBpBenefAddress2;
    @XmlElement(name = "OutTpSoCommitmentBpBenefAddress3")
    protected String outTpSoCommitmentBpBenefAddress3;
    @XmlElement(name = "OutTpSoCommitmentBpBenefCity")
    protected String outTpSoCommitmentBpBenefCity;
    @XmlElement(name = "OutTpSoCommitmentBpBenefCountry")
    protected String outTpSoCommitmentBpBenefCountry;
    @XmlElement(name = "OutTpSoCommitmentBpBenefName")
    protected String outTpSoCommitmentBpBenefName;
    @XmlElement(name = "OutTpSoCommitmentBpBenefZipCode")
    protected String outTpSoCommitmentBpBenefZipCode;
    @XmlElement(name = "OutTpSoCommitmentCancelComments")
    protected String outTpSoCommitmentCancelComments;
    @XmlElement(name = "OutTpSoCommitmentCommisionDiscount", required = true)
    protected BigDecimal outTpSoCommitmentCommisionDiscount;
    @XmlElement(name = "OutTpSoCommitmentCountryCode")
    protected String outTpSoCommitmentCountryCode;
    @XmlElement(name = "OutTpSoCommitmentCrAccComments")
    protected String outTpSoCommitmentCrAccComments;
    @XmlElement(name = "OutTpSoCommitmentCrAccCurrency")
    protected int outTpSoCommitmentCrAccCurrency;
    @XmlElement(name = "OutTpSoCommitmentCrAccCustomerCd")
    protected short outTpSoCommitmentCrAccCustomerCd;
    @XmlElement(name = "OutTpSoCommitmentCrAccCustomerId")
    protected int outTpSoCommitmentCrAccCustomerId;
    @XmlElement(name = "OutTpSoCommitmentCrBonusCommCode")
    protected int outTpSoCommitmentCrBonusCommCode;
    @XmlElement(name = "OutTpSoCommitmentCrBonusCommDisc", required = true)
    protected BigDecimal outTpSoCommitmentCrBonusCommDisc;
    @XmlElement(name = "OutTpSoCommitmentCrChargeType")
    protected String outTpSoCommitmentCrChargeType;
    @XmlElement(name = "OutTpSoCommitmentCrNonResident")
    protected String outTpSoCommitmentCrNonResident;
    @XmlElement(name = "OutTpSoCommitmentCrPrintAdvice")
    protected String outTpSoCommitmentCrPrintAdvice;
    @XmlElement(name = "OutTpSoCommitmentDataField1")
    protected String outTpSoCommitmentDataField1;
    @XmlElement(name = "OutTpSoCommitmentDataField2")
    protected String outTpSoCommitmentDataField2;
    @XmlElement(name = "OutTpSoCommitmentDataField3")
    protected String outTpSoCommitmentDataField3;
    @XmlElement(name = "OutTpSoCommitmentDataField4")
    protected String outTpSoCommitmentDataField4;
    @XmlElement(name = "OutTpSoCommitmentDescription")
    protected String outTpSoCommitmentDescription;
    @XmlElement(name = "OutTpSoCommitmentDiscountCost", required = true)
    protected BigDecimal outTpSoCommitmentDiscountCost;
    @XmlElement(name = "OutTpSoCommitmentDrAccComments")
    protected String outTpSoCommitmentDrAccComments;
    @XmlElement(name = "OutTpSoCommitmentDrAccCurrency")
    protected int outTpSoCommitmentDrAccCurrency;
    @XmlElement(name = "OutTpSoCommitmentDrAccCustomerCd")
    protected short outTpSoCommitmentDrAccCustomerCd;
    @XmlElement(name = "OutTpSoCommitmentDrAccCustomerId")
    protected int outTpSoCommitmentDrAccCustomerId;
    @XmlElement(name = "OutTpSoCommitmentDrPrintAdvice")
    protected String outTpSoCommitmentDrPrintAdvice;
    @XmlElement(name = "OutTpSoCommitmentEntryStatus")
    protected String outTpSoCommitmentEntryStatus;
    @XmlElement(name = "OutTpSoCommitmentFinalizeFlag")
    protected String outTpSoCommitmentFinalizeFlag;
    @XmlElement(name = "OutTpSoCommitmentFirstPaymentAmn", required = true)
    protected BigDecimal outTpSoCommitmentFirstPaymentAmn;
    @XmlElement(name = "OutTpSoCommitmentFirstPaymentDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outTpSoCommitmentFirstPaymentDate;
    @XmlElement(name = "OutTpSoCommitmentFrequency")
    protected short outTpSoCommitmentFrequency;
    @XmlElement(name = "OutTpSoCommitmentFrequencyUnit")
    protected String outTpSoCommitmentFrequencyUnit;
    @XmlElement(name = "OutTpSoCommitmentGeneralComments")
    protected String outTpSoCommitmentGeneralComments;
    @XmlElement(name = "OutTpSoCommitmentHolidayInd")
    protected String outTpSoCommitmentHolidayInd;
    @XmlElement(name = "OutTpSoCommitmentInsuffChargeCode")
    protected int outTpSoCommitmentInsuffChargeCode;
    @XmlElement(name = "OutTpSoCommitmentInsuffChargeDisc", required = true)
    protected BigDecimal outTpSoCommitmentInsuffChargeDisc;
    @XmlElement(name = "OutTpSoCommitmentIssueDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outTpSoCommitmentIssueDate;
    @XmlElement(name = "OutTpSoCommitmentLastPaymentAmn", required = true)
    protected BigDecimal outTpSoCommitmentLastPaymentAmn;
    @XmlElement(name = "OutTpSoCommitmentLastPaymentDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outTpSoCommitmentLastPaymentDate;
    @XmlElement(name = "OutTpSoCommitmentLastTransferDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outTpSoCommitmentLastTransferDate;
    @XmlElement(name = "OutTpSoCommitmentLastUpdateDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outTpSoCommitmentLastUpdateDate;
    @XmlElement(name = "OutTpSoCommitmentMaxNoOfAttempts")
    protected short outTpSoCommitmentMaxNoOfAttempts;
    @XmlElement(name = "OutTpSoCommitmentNormalActiveDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outTpSoCommitmentNormalActiveDate;
    @XmlElement(name = "OutTpSoCommitmentOrderIssueJustid")
    protected int outTpSoCommitmentOrderIssueJustid;
    @XmlElement(name = "OutTpSoCommitmentOrderIssueProdid")
    protected int outTpSoCommitmentOrderIssueProdid;
    @XmlElement(name = "OutTpSoCommitmentOrderSendrecInfo")
    protected String outTpSoCommitmentOrderSendrecInfo;
    @XmlElement(name = "OutTpSoCommitmentOrderSpecialTerm")
    protected String outTpSoCommitmentOrderSpecialTerm;
    @XmlElement(name = "OutTpSoCommitmentOtherBankAccCd")
    protected short outTpSoCommitmentOtherBankAccCd;
    @XmlElement(name = "OutTpSoCommitmentOtherBankAccNo")
    protected double outTpSoCommitmentOtherBankAccNo;
    @XmlElement(name = "OutTpSoCommitmentOtherBankAddress")
    protected String outTpSoCommitmentOtherBankAddress;
    @XmlElement(name = "OutTpSoCommitmentOtherBankCode")
    protected int outTpSoCommitmentOtherBankCode;
    @XmlElement(name = "OutTpSoCommitmentOtherBankUnit")
    protected int outTpSoCommitmentOtherBankUnit;
    @XmlElement(name = "OutTpSoCommitmentPayeeBank")
    protected String outTpSoCommitmentPayeeBank;
    @XmlElement(name = "OutTpSoCommitmentPaymentAmount", required = true)
    protected BigDecimal outTpSoCommitmentPaymentAmount;
    @XmlElement(name = "OutTpSoCommitmentPaymentsCount")
    protected int outTpSoCommitmentPaymentsCount;
    @XmlElement(name = "OutTpSoCommitmentPoFbCharges")
    protected String outTpSoCommitmentPoFbCharges;
    @XmlElement(name = "OutTpSoCommitmentPrivilegedFlag")
    protected String outTpSoCommitmentPrivilegedFlag;
    @XmlElement(name = "OutTpSoCommitmentSectorCode")
    protected String outTpSoCommitmentSectorCode;
    @XmlElement(name = "OutTpSoCommitmentSoCrChargesInd")
    protected String outTpSoCommitmentSoCrChargesInd;
    @XmlElement(name = "OutTpSoCommitmentSoDrChargesInd")
    protected String outTpSoCommitmentSoDrChargesInd;
    @XmlElement(name = "OutTpSoCommitmentSoSwiftStatus")
    protected String outTpSoCommitmentSoSwiftStatus;
    @XmlElement(name = "OutTpSoCommitmentStandOrderMethod")
    protected String outTpSoCommitmentStandOrderMethod;
    @XmlElement(name = "OutTpSoCommitmentSuspensDateFrom", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outTpSoCommitmentSuspensDateFrom;
    @XmlElement(name = "OutTpSoCommitmentSuspensDateTo", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outTpSoCommitmentSuspensDateTo;
    @XmlElement(name = "OutTpSoCommitmentSuspensExecutions")
    protected String outTpSoCommitmentSuspensExecutions;
    @XmlElement(name = "OutTpSoCommitmentTimestmp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outTpSoCommitmentTimestmp;
    @XmlElement(name = "OutTpSoCommitmentTotalAmount", required = true)
    protected BigDecimal outTpSoCommitmentTotalAmount;
    @XmlElement(name = "OutTpSoCommitmentTotalAvailableTr")
    protected int outTpSoCommitmentTotalAvailableTr;
    @XmlElement(name = "OutTpSoCommitmentTpCrDrIndicator")
    protected String outTpSoCommitmentTpCrDrIndicator;
    @XmlElement(name = "OutTpSoCommitmentTpSoIdentifier")
    protected double outTpSoCommitmentTpSoIdentifier;
    @XmlElement(name = "OutTpSoCommitmentTpSoIndicator")
    protected String outTpSoCommitmentTpSoIndicator;
    @XmlElement(name = "OutTpSoCommitmentTrxUser")
    protected String outTpSoCommitmentTrxUser;
    @XmlElement(name = "OutTpSoMandateDbAccount")
    protected String outTpSoMandateDbAccount;
    @XmlElement(name = "OutTpSoMandateDbBank")
    protected String outTpSoMandateDbBank;
    @XmlElement(name = "OutTpSoMandateDbBranch")
    protected String outTpSoMandateDbBranch;
    @XmlElement(name = "OutTpSoMandateOriginatorReference")
    protected String outTpSoMandateOriginatorReference;
    @XmlElement(name = "OutTpSoMandatePolicyNumber1")
    protected String outTpSoMandatePolicyNumber1;
    @XmlElement(name = "OutTpSoMandatePolicyNumber2")
    protected String outTpSoMandatePolicyNumber2;
    @XmlElement(name = "OutTpSoMandateRemarks")
    protected String outTpSoMandateRemarks;
    @XmlElement(name = "OutTpSoMandateTpSoIdentifier")
    protected double outTpSoMandateTpSoIdentifier;
    @XmlElement(name = "OutTreasuryGenericDetailDescription")
    protected String outTreasuryGenericDetailDescription;
    @XmlElement(name = "OutTreasuryGenericDetailSerialNum")
    protected int outTreasuryGenericDetailSerialNum;
    @XmlElement(name = "OutVlOutClientProfitsExitStateWorkActualMessage")
    protected String outVlOutClientProfitsExitStateWorkActualMessage;
    @XmlElement(name = "OutVlOutClientProfitsExitStateWorkId")
    protected double outVlOutClientProfitsExitStateWorkId;
    @XmlElement(name = "OutVlOutClientProfitsExitStateWorkLanguage")
    protected int outVlOutClientProfitsExitStateWorkLanguage;
    @XmlElement(name = "OutVlOutClientProfitsExitStateWorkMessageType")
    protected String outVlOutClientProfitsExitStateWorkMessageType;
    @XmlElement(name = "OutVlOutClientProfitsExitStateWorkPrftSystem")
    protected short outVlOutClientProfitsExitStateWorkPrftSystem;
    @XmlElement(name = "OutVlOutClientProfitsExitStateWorkRoutineSn")
    protected double outVlOutClientProfitsExitStateWorkRoutineSn;
    @XmlElement(name = "OutVlOutClientProfitsExitStateWorkTerminationAction")
    protected String outVlOutClientProfitsExitStateWorkTerminationAction;
    @XmlElement(name = "OutVlOutClientProfitsExitStateWorkValruleId")
    protected double outVlOutClientProfitsExitStateWorkValruleId;
    @XmlElement(name = "OutVlOutClientProfitsExitStateWorkValruleSnum")
    protected int outVlOutClientProfitsExitStateWorkValruleSnum;
    @XmlElement(name = "OutGrpDays")
    protected ArrayOfT2102VOutGrpDaysItem outGrpDays;
    @XmlElement(name = "OutGrpMessageErrors")
    protected ArrayOfT2102VOutGrpMessageErrorsItem outGrpMessageErrors;

    /**
     * Gets the value of the ourCrAccountListCurrencyShortDescr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOurCrAccountListCurrencyShortDescr() {
        return ourCrAccountListCurrencyShortDescr;
    }

    /**
     * Sets the value of the ourCrAccountListCurrencyShortDescr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOurCrAccountListCurrencyShortDescr(String value) {
        this.ourCrAccountListCurrencyShortDescr = value;
    }

    /**
     * Gets the value of the outAcctWithBankIefSuppliedNumber5 property.
     * 
     */
    public int getOutAcctWithBankIefSuppliedNumber5() {
        return outAcctWithBankIefSuppliedNumber5;
    }

    /**
     * Sets the value of the outAcctWithBankIefSuppliedNumber5 property.
     * 
     */
    public void setOutAcctWithBankIefSuppliedNumber5(int value) {
        this.outAcctWithBankIefSuppliedNumber5 = value;
    }

    /**
     * Gets the value of the outAmountInsertIefSuppliedPayableAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutAmountInsertIefSuppliedPayableAmount() {
        return outAmountInsertIefSuppliedPayableAmount;
    }

    /**
     * Sets the value of the outAmountInsertIefSuppliedPayableAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutAmountInsertIefSuppliedPayableAmount(BigDecimal value) {
        this.outAmountInsertIefSuppliedPayableAmount = value;
    }

    /**
     * Gets the value of the outCollaborationBankCollaborationBanksBankId property.
     * 
     */
    public int getOutCollaborationBankCollaborationBanksBankId() {
        return outCollaborationBankCollaborationBanksBankId;
    }

    /**
     * Sets the value of the outCollaborationBankCollaborationBanksBankId property.
     * 
     */
    public void setOutCollaborationBankCollaborationBanksBankId(int value) {
        this.outCollaborationBankCollaborationBanksBankId = value;
    }

    /**
     * Gets the value of the outCollaborationBankCollaborationBanksBankName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCollaborationBankCollaborationBanksBankName() {
        return outCollaborationBankCollaborationBanksBankName;
    }

    /**
     * Sets the value of the outCollaborationBankCollaborationBanksBankName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCollaborationBankCollaborationBanksBankName(String value) {
        this.outCollaborationBankCollaborationBanksBankName = value;
    }

    /**
     * Gets the value of the outCorrespDebitedCurrencyDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCorrespDebitedCurrencyDescription() {
        return outCorrespDebitedCurrencyDescription;
    }

    /**
     * Sets the value of the outCorrespDebitedCurrencyDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCorrespDebitedCurrencyDescription(String value) {
        this.outCorrespDebitedCurrencyDescription = value;
    }

    /**
     * Gets the value of the outCorrespDebitedCurrencyIdCurrency property.
     * 
     */
    public int getOutCorrespDebitedCurrencyIdCurrency() {
        return outCorrespDebitedCurrencyIdCurrency;
    }

    /**
     * Sets the value of the outCorrespDebitedCurrencyIdCurrency property.
     * 
     */
    public void setOutCorrespDebitedCurrencyIdCurrency(int value) {
        this.outCorrespDebitedCurrencyIdCurrency = value;
    }

    /**
     * Gets the value of the outCorrespDebitedCurrencyShortDescr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCorrespDebitedCurrencyShortDescr() {
        return outCorrespDebitedCurrencyShortDescr;
    }

    /**
     * Sets the value of the outCorrespDebitedCurrencyShortDescr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCorrespDebitedCurrencyShortDescr(String value) {
        this.outCorrespDebitedCurrencyShortDescr = value;
    }

    /**
     * Gets the value of the outCorrespDebitedProfitsAccountAccountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCorrespDebitedProfitsAccountAccountNumber() {
        return outCorrespDebitedProfitsAccountAccountNumber;
    }

    /**
     * Sets the value of the outCorrespDebitedProfitsAccountAccountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCorrespDebitedProfitsAccountAccountNumber(String value) {
        this.outCorrespDebitedProfitsAccountAccountNumber = value;
    }

    /**
     * Gets the value of the outCorrespondentBankCustomerCDigit property.
     * 
     */
    public short getOutCorrespondentBankCustomerCDigit() {
        return outCorrespondentBankCustomerCDigit;
    }

    /**
     * Sets the value of the outCorrespondentBankCustomerCDigit property.
     * 
     */
    public void setOutCorrespondentBankCustomerCDigit(short value) {
        this.outCorrespondentBankCustomerCDigit = value;
    }

    /**
     * Gets the value of the outCorrespondentBankCustomerCustId property.
     * 
     */
    public int getOutCorrespondentBankCustomerCustId() {
        return outCorrespondentBankCustomerCustId;
    }

    /**
     * Sets the value of the outCorrespondentBankCustomerCustId property.
     * 
     */
    public void setOutCorrespondentBankCustomerCustId(int value) {
        this.outCorrespondentBankCustomerCustId = value;
    }

    /**
     * Gets the value of the outCorrespondentBankCustomerSurname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCorrespondentBankCustomerSurname() {
        return outCorrespondentBankCustomerSurname;
    }

    /**
     * Sets the value of the outCorrespondentBankCustomerSurname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCorrespondentBankCustomerSurname(String value) {
        this.outCorrespondentBankCustomerSurname = value;
    }

    /**
     * Gets the value of the outCounterOfTpSoCommitmentTpSoIdentifier property.
     * 
     */
    public double getOutCounterOfTpSoCommitmentTpSoIdentifier() {
        return outCounterOfTpSoCommitmentTpSoIdentifier;
    }

    /**
     * Sets the value of the outCounterOfTpSoCommitmentTpSoIdentifier property.
     * 
     */
    public void setOutCounterOfTpSoCommitmentTpSoIdentifier(double value) {
        this.outCounterOfTpSoCommitmentTpSoIdentifier = value;
    }

    /**
     * Gets the value of the outCrAccountListDepositAccountAccountNumber property.
     * 
     */
    public double getOutCrAccountListDepositAccountAccountNumber() {
        return outCrAccountListDepositAccountAccountNumber;
    }

    /**
     * Sets the value of the outCrAccountListDepositAccountAccountNumber property.
     * 
     */
    public void setOutCrAccountListDepositAccountAccountNumber(double value) {
        this.outCrAccountListDepositAccountAccountNumber = value;
    }

    /**
     * Gets the value of the outCrAccountListDepositAccountCDigit property.
     * 
     */
    public short getOutCrAccountListDepositAccountCDigit() {
        return outCrAccountListDepositAccountCDigit;
    }

    /**
     * Sets the value of the outCrAccountListDepositAccountCDigit property.
     * 
     */
    public void setOutCrAccountListDepositAccountCDigit(short value) {
        this.outCrAccountListDepositAccountCDigit = value;
    }

    /**
     * Gets the value of the outCrAccountListDepositAccountDesignation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCrAccountListDepositAccountDesignation() {
        return outCrAccountListDepositAccountDesignation;
    }

    /**
     * Sets the value of the outCrAccountListDepositAccountDesignation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCrAccountListDepositAccountDesignation(String value) {
        this.outCrAccountListDepositAccountDesignation = value;
    }

    /**
     * Gets the value of the outCrAccountListProductIdProduct property.
     * 
     */
    public int getOutCrAccountListProductIdProduct() {
        return outCrAccountListProductIdProduct;
    }

    /**
     * Sets the value of the outCrAccountListProductIdProduct property.
     * 
     */
    public void setOutCrAccountListProductIdProduct(int value) {
        this.outCrAccountListProductIdProduct = value;
    }

    /**
     * Gets the value of the outCrAccountListProfitsAccountAccountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCrAccountListProfitsAccountAccountNumber() {
        return outCrAccountListProfitsAccountAccountNumber;
    }

    /**
     * Sets the value of the outCrAccountListProfitsAccountAccountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCrAccountListProfitsAccountAccountNumber(String value) {
        this.outCrAccountListProfitsAccountAccountNumber = value;
    }

    /**
     * Gets the value of the outCrAccountListUnitCode property.
     * 
     */
    public int getOutCrAccountListUnitCode() {
        return outCrAccountListUnitCode;
    }

    /**
     * Sets the value of the outCrAccountListUnitCode property.
     * 
     */
    public void setOutCrAccountListUnitCode(int value) {
        this.outCrAccountListUnitCode = value;
    }

    /**
     * Gets the value of the outCrCustomerNameListListSetDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCrCustomerNameListListSetDescription() {
        return outCrCustomerNameListListSetDescription;
    }

    /**
     * Sets the value of the outCrCustomerNameListListSetDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCrCustomerNameListListSetDescription(String value) {
        this.outCrCustomerNameListListSetDescription = value;
    }

    /**
     * Gets the value of the outCrDepositListJustificDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCrDepositListJustificDescription() {
        return outCrDepositListJustificDescription;
    }

    /**
     * Sets the value of the outCrDepositListJustificDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCrDepositListJustificDescription(String value) {
        this.outCrDepositListJustificDescription = value;
    }

    /**
     * Gets the value of the outCrDepositListJustificIdJustific property.
     * 
     */
    public int getOutCrDepositListJustificIdJustific() {
        return outCrDepositListJustificIdJustific;
    }

    /**
     * Sets the value of the outCrDepositListJustificIdJustific property.
     * 
     */
    public void setOutCrDepositListJustificIdJustific(int value) {
        this.outCrDepositListJustificIdJustific = value;
    }

    /**
     * Gets the value of the outCrOtherAfmAfmNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCrOtherAfmAfmNo() {
        return outCrOtherAfmAfmNo;
    }

    /**
     * Sets the value of the outCrOtherAfmAfmNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCrOtherAfmAfmNo(String value) {
        this.outCrOtherAfmAfmNo = value;
    }

    /**
     * Gets the value of the outCrOtherIdIdNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCrOtherIdIdNo() {
        return outCrOtherIdIdNo;
    }

    /**
     * Sets the value of the outCrOtherIdIdNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCrOtherIdIdNo(String value) {
        this.outCrOtherIdIdNo = value;
    }

    /**
     * Gets the value of the outDctFrtSwiftAddressBankName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutDctFrtSwiftAddressBankName() {
        return outDctFrtSwiftAddressBankName;
    }

    /**
     * Sets the value of the outDctFrtSwiftAddressBankName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutDctFrtSwiftAddressBankName(String value) {
        this.outDctFrtSwiftAddressBankName = value;
    }

    /**
     * Gets the value of the outDctFrtSwiftAddressParticipantBank property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutDctFrtSwiftAddressParticipantBank() {
        return outDctFrtSwiftAddressParticipantBank;
    }

    /**
     * Sets the value of the outDctFrtSwiftAddressParticipantBank property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutDctFrtSwiftAddressParticipantBank(String value) {
        this.outDctFrtSwiftAddressParticipantBank = value;
    }

    /**
     * Gets the value of the outDctIpsInstrumentDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutDctIpsInstrumentDescription() {
        return outDctIpsInstrumentDescription;
    }

    /**
     * Sets the value of the outDctIpsInstrumentDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutDctIpsInstrumentDescription(String value) {
        this.outDctIpsInstrumentDescription = value;
    }

    /**
     * Gets the value of the outDctIpsInstrumentInstrumJustific property.
     * 
     */
    public int getOutDctIpsInstrumentInstrumJustific() {
        return outDctIpsInstrumentInstrumJustific;
    }

    /**
     * Sets the value of the outDctIpsInstrumentInstrumJustific property.
     * 
     */
    public void setOutDctIpsInstrumentInstrumJustific(int value) {
        this.outDctIpsInstrumentInstrumJustific = value;
    }

    /**
     * Gets the value of the outDctIpsMessageStageBenefAddressCountry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutDctIpsMessageStageBenefAddressCountry() {
        return outDctIpsMessageStageBenefAddressCountry;
    }

    /**
     * Sets the value of the outDctIpsMessageStageBenefAddressCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutDctIpsMessageStageBenefAddressCountry(String value) {
        this.outDctIpsMessageStageBenefAddressCountry = value;
    }

    /**
     * Gets the value of the outDctIpsMessageStageBenefAddressLine1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutDctIpsMessageStageBenefAddressLine1() {
        return outDctIpsMessageStageBenefAddressLine1;
    }

    /**
     * Sets the value of the outDctIpsMessageStageBenefAddressLine1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutDctIpsMessageStageBenefAddressLine1(String value) {
        this.outDctIpsMessageStageBenefAddressLine1 = value;
    }

    /**
     * Gets the value of the outDctIpsMessageStageBenefAddressLine2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutDctIpsMessageStageBenefAddressLine2() {
        return outDctIpsMessageStageBenefAddressLine2;
    }

    /**
     * Sets the value of the outDctIpsMessageStageBenefAddressLine2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutDctIpsMessageStageBenefAddressLine2(String value) {
        this.outDctIpsMessageStageBenefAddressLine2 = value;
    }

    /**
     * Gets the value of the outDctIpsMessageStageBenefAddressPostCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutDctIpsMessageStageBenefAddressPostCode() {
        return outDctIpsMessageStageBenefAddressPostCode;
    }

    /**
     * Sets the value of the outDctIpsMessageStageBenefAddressPostCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutDctIpsMessageStageBenefAddressPostCode(String value) {
        this.outDctIpsMessageStageBenefAddressPostCode = value;
    }

    /**
     * Gets the value of the outDctIpsMessageStageBenefBankAccount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutDctIpsMessageStageBenefBankAccount() {
        return outDctIpsMessageStageBenefBankAccount;
    }

    /**
     * Sets the value of the outDctIpsMessageStageBenefBankAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutDctIpsMessageStageBenefBankAccount(String value) {
        this.outDctIpsMessageStageBenefBankAccount = value;
    }

    /**
     * Gets the value of the outDctIpsMessageStageBenefBicAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutDctIpsMessageStageBenefBicAddress() {
        return outDctIpsMessageStageBenefBicAddress;
    }

    /**
     * Sets the value of the outDctIpsMessageStageBenefBicAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutDctIpsMessageStageBenefBicAddress(String value) {
        this.outDctIpsMessageStageBenefBicAddress = value;
    }

    /**
     * Gets the value of the outDctIpsMessageStageBenefFullname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutDctIpsMessageStageBenefFullname() {
        return outDctIpsMessageStageBenefFullname;
    }

    /**
     * Sets the value of the outDctIpsMessageStageBenefFullname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutDctIpsMessageStageBenefFullname(String value) {
        this.outDctIpsMessageStageBenefFullname = value;
    }

    /**
     * Gets the value of the outDctIpsMessageStageBenefIdentificationType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutDctIpsMessageStageBenefIdentificationType() {
        return outDctIpsMessageStageBenefIdentificationType;
    }

    /**
     * Sets the value of the outDctIpsMessageStageBenefIdentificationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutDctIpsMessageStageBenefIdentificationType(String value) {
        this.outDctIpsMessageStageBenefIdentificationType = value;
    }

    /**
     * Gets the value of the outDctIpsMessageStageBenefIdentificationValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutDctIpsMessageStageBenefIdentificationValue() {
        return outDctIpsMessageStageBenefIdentificationValue;
    }

    /**
     * Sets the value of the outDctIpsMessageStageBenefIdentificationValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutDctIpsMessageStageBenefIdentificationValue(String value) {
        this.outDctIpsMessageStageBenefIdentificationValue = value;
    }

    /**
     * Gets the value of the outDctIpsMessageStageBenefResident property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutDctIpsMessageStageBenefResident() {
        return outDctIpsMessageStageBenefResident;
    }

    /**
     * Sets the value of the outDctIpsMessageStageBenefResident property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutDctIpsMessageStageBenefResident(String value) {
        this.outDctIpsMessageStageBenefResident = value;
    }

    /**
     * Gets the value of the outDctIpsMessageStageOrderChargeBearer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutDctIpsMessageStageOrderChargeBearer() {
        return outDctIpsMessageStageOrderChargeBearer;
    }

    /**
     * Sets the value of the outDctIpsMessageStageOrderChargeBearer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutDctIpsMessageStageOrderChargeBearer(String value) {
        this.outDctIpsMessageStageOrderChargeBearer = value;
    }

    /**
     * Gets the value of the outDctIpsMessageStageOrderClearingSystem property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutDctIpsMessageStageOrderClearingSystem() {
        return outDctIpsMessageStageOrderClearingSystem;
    }

    /**
     * Sets the value of the outDctIpsMessageStageOrderClearingSystem property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutDctIpsMessageStageOrderClearingSystem(String value) {
        this.outDctIpsMessageStageOrderClearingSystem = value;
    }

    /**
     * Gets the value of the outDctIpsMessageStageOrderCurrency property.
     * 
     */
    public int getOutDctIpsMessageStageOrderCurrency() {
        return outDctIpsMessageStageOrderCurrency;
    }

    /**
     * Sets the value of the outDctIpsMessageStageOrderCurrency property.
     * 
     */
    public void setOutDctIpsMessageStageOrderCurrency(int value) {
        this.outDctIpsMessageStageOrderCurrency = value;
    }

    /**
     * Gets the value of the outDctIpsMessageStageOrderInstrNextAgent3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutDctIpsMessageStageOrderInstrNextAgent3() {
        return outDctIpsMessageStageOrderInstrNextAgent3;
    }

    /**
     * Sets the value of the outDctIpsMessageStageOrderInstrNextAgent3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutDctIpsMessageStageOrderInstrNextAgent3(String value) {
        this.outDctIpsMessageStageOrderInstrNextAgent3 = value;
    }

    /**
     * Gets the value of the outDctIpsMessageStageOrderInstrumentCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutDctIpsMessageStageOrderInstrumentCode() {
        return outDctIpsMessageStageOrderInstrumentCode;
    }

    /**
     * Sets the value of the outDctIpsMessageStageOrderInstrumentCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutDctIpsMessageStageOrderInstrumentCode(String value) {
        this.outDctIpsMessageStageOrderInstrumentCode = value;
    }

    /**
     * Gets the value of the outDctIpsMessageStageOrderInstrumentJustificId property.
     * 
     */
    public int getOutDctIpsMessageStageOrderInstrumentJustificId() {
        return outDctIpsMessageStageOrderInstrumentJustificId;
    }

    /**
     * Sets the value of the outDctIpsMessageStageOrderInstrumentJustificId property.
     * 
     */
    public void setOutDctIpsMessageStageOrderInstrumentJustificId(int value) {
        this.outDctIpsMessageStageOrderInstrumentJustificId = value;
    }

    /**
     * Gets the value of the outDctIpsMessageStageOrderPurposeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutDctIpsMessageStageOrderPurposeCode() {
        return outDctIpsMessageStageOrderPurposeCode;
    }

    /**
     * Sets the value of the outDctIpsMessageStageOrderPurposeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutDctIpsMessageStageOrderPurposeCode(String value) {
        this.outDctIpsMessageStageOrderPurposeCode = value;
    }

    /**
     * Gets the value of the outDctIpsMessageStageOrderRemmitanceInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutDctIpsMessageStageOrderRemmitanceInfo() {
        return outDctIpsMessageStageOrderRemmitanceInfo;
    }

    /**
     * Sets the value of the outDctIpsMessageStageOrderRemmitanceInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutDctIpsMessageStageOrderRemmitanceInfo(String value) {
        this.outDctIpsMessageStageOrderRemmitanceInfo = value;
    }

    /**
     * Gets the value of the outDctIpsMessageStageTpSoIdentifier property.
     * 
     */
    public double getOutDctIpsMessageStageTpSoIdentifier() {
        return outDctIpsMessageStageTpSoIdentifier;
    }

    /**
     * Sets the value of the outDctIpsMessageStageTpSoIdentifier property.
     * 
     */
    public void setOutDctIpsMessageStageTpSoIdentifier(double value) {
        this.outDctIpsMessageStageTpSoIdentifier = value;
    }

    /**
     * Gets the value of the outDefaultCreditJustificJustificDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutDefaultCreditJustificJustificDescription() {
        return outDefaultCreditJustificJustificDescription;
    }

    /**
     * Sets the value of the outDefaultCreditJustificJustificDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutDefaultCreditJustificJustificDescription(String value) {
        this.outDefaultCreditJustificJustificDescription = value;
    }

    /**
     * Gets the value of the outDefaultCreditJustificJustificEntryStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutDefaultCreditJustificJustificEntryStatus() {
        return outDefaultCreditJustificJustificEntryStatus;
    }

    /**
     * Sets the value of the outDefaultCreditJustificJustificEntryStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutDefaultCreditJustificJustificEntryStatus(String value) {
        this.outDefaultCreditJustificJustificEntryStatus = value;
    }

    /**
     * Gets the value of the outDefaultCreditJustificJustificIdJustific property.
     * 
     */
    public int getOutDefaultCreditJustificJustificIdJustific() {
        return outDefaultCreditJustificJustificIdJustific;
    }

    /**
     * Sets the value of the outDefaultCreditJustificJustificIdJustific property.
     * 
     */
    public void setOutDefaultCreditJustificJustificIdJustific(int value) {
        this.outDefaultCreditJustificJustificIdJustific = value;
    }

    /**
     * Gets the value of the outDefaultCreditJustificJustificShortDescr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutDefaultCreditJustificJustificShortDescr() {
        return outDefaultCreditJustificJustificShortDescr;
    }

    /**
     * Sets the value of the outDefaultCreditJustificJustificShortDescr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutDefaultCreditJustificJustificShortDescr(String value) {
        this.outDefaultCreditJustificJustificShortDescr = value;
    }

    /**
     * Gets the value of the outDefaultDebitJustificJustificDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutDefaultDebitJustificJustificDescription() {
        return outDefaultDebitJustificJustificDescription;
    }

    /**
     * Sets the value of the outDefaultDebitJustificJustificDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutDefaultDebitJustificJustificDescription(String value) {
        this.outDefaultDebitJustificJustificDescription = value;
    }

    /**
     * Gets the value of the outDefaultDebitJustificJustificEntryStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutDefaultDebitJustificJustificEntryStatus() {
        return outDefaultDebitJustificJustificEntryStatus;
    }

    /**
     * Sets the value of the outDefaultDebitJustificJustificEntryStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutDefaultDebitJustificJustificEntryStatus(String value) {
        this.outDefaultDebitJustificJustificEntryStatus = value;
    }

    /**
     * Gets the value of the outDefaultDebitJustificJustificIdJustific property.
     * 
     */
    public int getOutDefaultDebitJustificJustificIdJustific() {
        return outDefaultDebitJustificJustificIdJustific;
    }

    /**
     * Sets the value of the outDefaultDebitJustificJustificIdJustific property.
     * 
     */
    public void setOutDefaultDebitJustificJustificIdJustific(int value) {
        this.outDefaultDebitJustificJustificIdJustific = value;
    }

    /**
     * Gets the value of the outDefaultDebitJustificJustificShortDescr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutDefaultDebitJustificJustificShortDescr() {
        return outDefaultDebitJustificJustificShortDescr;
    }

    /**
     * Sets the value of the outDefaultDebitJustificJustificShortDescr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutDefaultDebitJustificJustificShortDescr(String value) {
        this.outDefaultDebitJustificJustificShortDescr = value;
    }

    /**
     * Gets the value of the outDepTrxRecordingUUserTotalsAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutDepTrxRecordingUUserTotalsAmn() {
        return outDepTrxRecordingUUserTotalsAmn;
    }

    /**
     * Sets the value of the outDepTrxRecordingUUserTotalsAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutDepTrxRecordingUUserTotalsAmn(BigDecimal value) {
        this.outDepTrxRecordingUUserTotalsAmn = value;
    }

    /**
     * Gets the value of the outDiasSwiftJustificDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutDiasSwiftJustificDescription() {
        return outDiasSwiftJustificDescription;
    }

    /**
     * Sets the value of the outDiasSwiftJustificDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutDiasSwiftJustificDescription(String value) {
        this.outDiasSwiftJustificDescription = value;
    }

    /**
     * Gets the value of the outDiasSwiftJustificIdJustific property.
     * 
     */
    public int getOutDiasSwiftJustificIdJustific() {
        return outDiasSwiftJustificIdJustific;
    }

    /**
     * Sets the value of the outDiasSwiftJustificIdJustific property.
     * 
     */
    public void setOutDiasSwiftJustificIdJustific(int value) {
        this.outDiasSwiftJustificIdJustific = value;
    }

    /**
     * Gets the value of the outDrAccountListCurrencyShortDescr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutDrAccountListCurrencyShortDescr() {
        return outDrAccountListCurrencyShortDescr;
    }

    /**
     * Sets the value of the outDrAccountListCurrencyShortDescr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutDrAccountListCurrencyShortDescr(String value) {
        this.outDrAccountListCurrencyShortDescr = value;
    }

    /**
     * Gets the value of the outDrAccountListDepositAccountAccountNumber property.
     * 
     */
    public double getOutDrAccountListDepositAccountAccountNumber() {
        return outDrAccountListDepositAccountAccountNumber;
    }

    /**
     * Sets the value of the outDrAccountListDepositAccountAccountNumber property.
     * 
     */
    public void setOutDrAccountListDepositAccountAccountNumber(double value) {
        this.outDrAccountListDepositAccountAccountNumber = value;
    }

    /**
     * Gets the value of the outDrAccountListDepositAccountCDigit property.
     * 
     */
    public short getOutDrAccountListDepositAccountCDigit() {
        return outDrAccountListDepositAccountCDigit;
    }

    /**
     * Sets the value of the outDrAccountListDepositAccountCDigit property.
     * 
     */
    public void setOutDrAccountListDepositAccountCDigit(short value) {
        this.outDrAccountListDepositAccountCDigit = value;
    }

    /**
     * Gets the value of the outDrAccountListDepositAccountDesignation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutDrAccountListDepositAccountDesignation() {
        return outDrAccountListDepositAccountDesignation;
    }

    /**
     * Sets the value of the outDrAccountListDepositAccountDesignation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutDrAccountListDepositAccountDesignation(String value) {
        this.outDrAccountListDepositAccountDesignation = value;
    }

    /**
     * Gets the value of the outDrAccountListProductIdProduct property.
     * 
     */
    public int getOutDrAccountListProductIdProduct() {
        return outDrAccountListProductIdProduct;
    }

    /**
     * Sets the value of the outDrAccountListProductIdProduct property.
     * 
     */
    public void setOutDrAccountListProductIdProduct(int value) {
        this.outDrAccountListProductIdProduct = value;
    }

    /**
     * Gets the value of the outDrAccountListProfitsAccountAccountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutDrAccountListProfitsAccountAccountNumber() {
        return outDrAccountListProfitsAccountAccountNumber;
    }

    /**
     * Sets the value of the outDrAccountListProfitsAccountAccountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutDrAccountListProfitsAccountAccountNumber(String value) {
        this.outDrAccountListProfitsAccountAccountNumber = value;
    }

    /**
     * Gets the value of the outDrAccountListUnitCode property.
     * 
     */
    public int getOutDrAccountListUnitCode() {
        return outDrAccountListUnitCode;
    }

    /**
     * Sets the value of the outDrAccountListUnitCode property.
     * 
     */
    public void setOutDrAccountListUnitCode(int value) {
        this.outDrAccountListUnitCode = value;
    }

    /**
     * Gets the value of the outDrCntryGenericDetailDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutDrCntryGenericDetailDescription() {
        return outDrCntryGenericDetailDescription;
    }

    /**
     * Sets the value of the outDrCntryGenericDetailDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutDrCntryGenericDetailDescription(String value) {
        this.outDrCntryGenericDetailDescription = value;
    }

    /**
     * Gets the value of the outDrCustAddressAddress1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutDrCustAddressAddress1() {
        return outDrCustAddressAddress1;
    }

    /**
     * Sets the value of the outDrCustAddressAddress1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutDrCustAddressAddress1(String value) {
        this.outDrCustAddressAddress1 = value;
    }

    /**
     * Gets the value of the outDrCustAddressCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutDrCustAddressCity() {
        return outDrCustAddressCity;
    }

    /**
     * Sets the value of the outDrCustAddressCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutDrCustAddressCity(String value) {
        this.outDrCustAddressCity = value;
    }

    /**
     * Gets the value of the outDrCustAddressZipCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutDrCustAddressZipCode() {
        return outDrCustAddressZipCode;
    }

    /**
     * Sets the value of the outDrCustAddressZipCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutDrCustAddressZipCode(String value) {
        this.outDrCustAddressZipCode = value;
    }

    /**
     * Gets the value of the outDrCustomerNameListListSetDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutDrCustomerNameListListSetDescription() {
        return outDrCustomerNameListListSetDescription;
    }

    /**
     * Sets the value of the outDrCustomerNameListListSetDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutDrCustomerNameListListSetDescription(String value) {
        this.outDrCustomerNameListListSetDescription = value;
    }

    /**
     * Gets the value of the outDrDepositListJustificDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutDrDepositListJustificDescription() {
        return outDrDepositListJustificDescription;
    }

    /**
     * Sets the value of the outDrDepositListJustificDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutDrDepositListJustificDescription(String value) {
        this.outDrDepositListJustificDescription = value;
    }

    /**
     * Gets the value of the outDrDepositListJustificIdJustific property.
     * 
     */
    public int getOutDrDepositListJustificIdJustific() {
        return outDrDepositListJustificIdJustific;
    }

    /**
     * Sets the value of the outDrDepositListJustificIdJustific property.
     * 
     */
    public void setOutDrDepositListJustificIdJustific(int value) {
        this.outDrDepositListJustificIdJustific = value;
    }

    /**
     * Gets the value of the outDrOtherAfmAfmNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutDrOtherAfmAfmNo() {
        return outDrOtherAfmAfmNo;
    }

    /**
     * Sets the value of the outDrOtherAfmAfmNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutDrOtherAfmAfmNo(String value) {
        this.outDrOtherAfmAfmNo = value;
    }

    /**
     * Gets the value of the outDrOtherIdIdNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutDrOtherIdIdNo() {
        return outDrOtherIdIdNo;
    }

    /**
     * Sets the value of the outDrOtherIdIdNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutDrOtherIdIdNo(String value) {
        this.outDrOtherIdIdNo = value;
    }

    /**
     * Gets the value of the outIbanCountryCharSuppliedChar2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutIbanCountryCharSuppliedChar2() {
        return outIbanCountryCharSuppliedChar2;
    }

    /**
     * Sets the value of the outIbanCountryCharSuppliedChar2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutIbanCountryCharSuppliedChar2(String value) {
        this.outIbanCountryCharSuppliedChar2 = value;
    }

    /**
     * Gets the value of the outIbanCountryContinueCharSuppliedChar16 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutIbanCountryContinueCharSuppliedChar16() {
        return outIbanCountryContinueCharSuppliedChar16;
    }

    /**
     * Sets the value of the outIbanCountryContinueCharSuppliedChar16 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutIbanCountryContinueCharSuppliedChar16(String value) {
        this.outIbanCountryContinueCharSuppliedChar16 = value;
    }

    /**
     * Gets the value of the outIbanCountryContinueCharSuppliedChar2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutIbanCountryContinueCharSuppliedChar2() {
        return outIbanCountryContinueCharSuppliedChar2;
    }

    /**
     * Sets the value of the outIbanCountryContinueCharSuppliedChar2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutIbanCountryContinueCharSuppliedChar2(String value) {
        this.outIbanCountryContinueCharSuppliedChar2 = value;
    }

    /**
     * Gets the value of the outIbanCountryContinueCharSuppliedChar3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutIbanCountryContinueCharSuppliedChar3() {
        return outIbanCountryContinueCharSuppliedChar3;
    }

    /**
     * Sets the value of the outIbanCountryContinueCharSuppliedChar3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutIbanCountryContinueCharSuppliedChar3(String value) {
        this.outIbanCountryContinueCharSuppliedChar3 = value;
    }

    /**
     * Gets the value of the outIbanCountryContinueCharSuppliedChar4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutIbanCountryContinueCharSuppliedChar4() {
        return outIbanCountryContinueCharSuppliedChar4;
    }

    /**
     * Sets the value of the outIbanCountryContinueCharSuppliedChar4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutIbanCountryContinueCharSuppliedChar4(String value) {
        this.outIbanCountryContinueCharSuppliedChar4 = value;
    }

    /**
     * Gets the value of the outIbanWorkSetChar37 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutIbanWorkSetChar37() {
        return outIbanWorkSetChar37;
    }

    /**
     * Sets the value of the outIbanWorkSetChar37 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutIbanWorkSetChar37(String value) {
        this.outIbanWorkSetChar37 = value;
    }

    /**
     * Gets the value of the outJustificOfDepositCreditJustificIdJustific property.
     * 
     */
    public int getOutJustificOfDepositCreditJustificIdJustific() {
        return outJustificOfDepositCreditJustificIdJustific;
    }

    /**
     * Sets the value of the outJustificOfDepositCreditJustificIdJustific property.
     * 
     */
    public void setOutJustificOfDepositCreditJustificIdJustific(int value) {
        this.outJustificOfDepositCreditJustificIdJustific = value;
    }

    /**
     * Gets the value of the outLnsExpenseDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutLnsExpenseDescription() {
        return outLnsExpenseDescription;
    }

    /**
     * Sets the value of the outLnsExpenseDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutLnsExpenseDescription(String value) {
        this.outLnsExpenseDescription = value;
    }

    /**
     * Gets the value of the outMontranBanksBankCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutMontranBanksBankCode() {
        return outMontranBanksBankCode;
    }

    /**
     * Sets the value of the outMontranBanksBankCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutMontranBanksBankCode(String value) {
        this.outMontranBanksBankCode = value;
    }

    /**
     * Gets the value of the outMontranBanksDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutMontranBanksDescription() {
        return outMontranBanksDescription;
    }

    /**
     * Sets the value of the outMontranBanksDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutMontranBanksDescription(String value) {
        this.outMontranBanksDescription = value;
    }

    /**
     * Gets the value of the outMontranBanksGovernmentBank property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutMontranBanksGovernmentBank() {
        return outMontranBanksGovernmentBank;
    }

    /**
     * Sets the value of the outMontranBanksGovernmentBank property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutMontranBanksGovernmentBank(String value) {
        this.outMontranBanksGovernmentBank = value;
    }

    /**
     * Gets the value of the outMontranTpSoBankId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutMontranTpSoBankId() {
        return outMontranTpSoBankId;
    }

    /**
     * Sets the value of the outMontranTpSoBankId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutMontranTpSoBankId(String value) {
        this.outMontranTpSoBankId = value;
    }

    /**
     * Gets the value of the outMontranTpSoBenefAccount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutMontranTpSoBenefAccount() {
        return outMontranTpSoBenefAccount;
    }

    /**
     * Sets the value of the outMontranTpSoBenefAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutMontranTpSoBenefAccount(String value) {
        this.outMontranTpSoBenefAccount = value;
    }

    /**
     * Gets the value of the outMontranTpSoGround property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutMontranTpSoGround() {
        return outMontranTpSoGround;
    }

    /**
     * Sets the value of the outMontranTpSoGround property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutMontranTpSoGround(String value) {
        this.outMontranTpSoGround = value;
    }

    /**
     * Gets the value of the outMontranTpSoInformation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutMontranTpSoInformation() {
        return outMontranTpSoInformation;
    }

    /**
     * Sets the value of the outMontranTpSoInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutMontranTpSoInformation(String value) {
        this.outMontranTpSoInformation = value;
    }

    /**
     * Gets the value of the outMontranTpSoTaxNoTax property.
     * 
     */
    public int getOutMontranTpSoTaxNoTax() {
        return outMontranTpSoTaxNoTax;
    }

    /**
     * Sets the value of the outMontranTpSoTaxNoTax property.
     * 
     */
    public void setOutMontranTpSoTaxNoTax(int value) {
        this.outMontranTpSoTaxNoTax = value;
    }

    /**
     * Gets the value of the outMontranTpSoTerritoryCode property.
     * 
     */
    public int getOutMontranTpSoTerritoryCode() {
        return outMontranTpSoTerritoryCode;
    }

    /**
     * Sets the value of the outMontranTpSoTerritoryCode property.
     * 
     */
    public void setOutMontranTpSoTerritoryCode(int value) {
        this.outMontranTpSoTerritoryCode = value;
    }

    /**
     * Gets the value of the outMontranTpSoTpSoIdentifier property.
     * 
     */
    public double getOutMontranTpSoTpSoIdentifier() {
        return outMontranTpSoTpSoIdentifier;
    }

    /**
     * Sets the value of the outMontranTpSoTpSoIdentifier property.
     * 
     */
    public void setOutMontranTpSoTpSoIdentifier(double value) {
        this.outMontranTpSoTpSoIdentifier = value;
    }

    /**
     * Gets the value of the outMontranTpSoTreasury property.
     * 
     */
    public int getOutMontranTpSoTreasury() {
        return outMontranTpSoTreasury;
    }

    /**
     * Sets the value of the outMontranTpSoTreasury property.
     * 
     */
    public void setOutMontranTpSoTreasury(int value) {
        this.outMontranTpSoTreasury = value;
    }

    /**
     * Gets the value of the outOutgoingOrderProdListProductDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutOutgoingOrderProdListProductDescription() {
        return outOutgoingOrderProdListProductDescription;
    }

    /**
     * Sets the value of the outOutgoingOrderProdListProductDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutOutgoingOrderProdListProductDescription(String value) {
        this.outOutgoingOrderProdListProductDescription = value;
    }

    /**
     * Gets the value of the outOutgoingOrderProdListProductIdProduct property.
     * 
     */
    public int getOutOutgoingOrderProdListProductIdProduct() {
        return outOutgoingOrderProdListProductIdProduct;
    }

    /**
     * Sets the value of the outOutgoingOrderProdListProductIdProduct property.
     * 
     */
    public void setOutOutgoingOrderProdListProductIdProduct(int value) {
        this.outOutgoingOrderProdListProductIdProduct = value;
    }

    /**
     * Gets the value of the outOutgoingOrdersAccWithBankSwif property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutOutgoingOrdersAccWithBankSwif() {
        return outOutgoingOrdersAccWithBankSwif;
    }

    /**
     * Sets the value of the outOutgoingOrdersAccWithBankSwif property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutOutgoingOrdersAccWithBankSwif(String value) {
        this.outOutgoingOrdersAccWithBankSwif = value;
    }

    /**
     * Gets the value of the outOutgoingOrdersAccountWithInstitution property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutOutgoingOrdersAccountWithInstitution() {
        return outOutgoingOrdersAccountWithInstitution;
    }

    /**
     * Sets the value of the outOutgoingOrdersAccountWithInstitution property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutOutgoingOrdersAccountWithInstitution(String value) {
        this.outOutgoingOrdersAccountWithInstitution = value;
    }

    /**
     * Gets the value of the outOutgoingOrdersBenefAccount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutOutgoingOrdersBenefAccount() {
        return outOutgoingOrdersBenefAccount;
    }

    /**
     * Sets the value of the outOutgoingOrdersBenefAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutOutgoingOrdersBenefAccount(String value) {
        this.outOutgoingOrdersBenefAccount = value;
    }

    /**
     * Gets the value of the outOutgoingOrdersCoveringMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutOutgoingOrdersCoveringMessage() {
        return outOutgoingOrdersCoveringMessage;
    }

    /**
     * Sets the value of the outOutgoingOrdersCoveringMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutOutgoingOrdersCoveringMessage(String value) {
        this.outOutgoingOrdersCoveringMessage = value;
    }

    /**
     * Gets the value of the outOutgoingOrdersFbCharges property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutOutgoingOrdersFbCharges() {
        return outOutgoingOrdersFbCharges;
    }

    /**
     * Sets the value of the outOutgoingOrdersFbCharges property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutOutgoingOrdersFbCharges(String value) {
        this.outOutgoingOrdersFbCharges = value;
    }

    /**
     * Gets the value of the outOutgoingOrdersStpFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutOutgoingOrdersStpFlag() {
        return outOutgoingOrdersStpFlag;
    }

    /**
     * Sets the value of the outOutgoingOrdersStpFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutOutgoingOrdersStpFlag(String value) {
        this.outOutgoingOrdersStpFlag = value;
    }

    /**
     * Gets the value of the outResponsibleUnitCode property.
     * 
     */
    public int getOutResponsibleUnitCode() {
        return outResponsibleUnitCode;
    }

    /**
     * Sets the value of the outResponsibleUnitCode property.
     * 
     */
    public void setOutResponsibleUnitCode(int value) {
        this.outResponsibleUnitCode = value;
    }

    /**
     * Gets the value of the outSecDrAccListCurrencyShortDescr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSecDrAccListCurrencyShortDescr() {
        return outSecDrAccListCurrencyShortDescr;
    }

    /**
     * Sets the value of the outSecDrAccListCurrencyShortDescr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSecDrAccListCurrencyShortDescr(String value) {
        this.outSecDrAccListCurrencyShortDescr = value;
    }

    /**
     * Gets the value of the outSecondaryDebitDepositAccountAccountNumber property.
     * 
     */
    public double getOutSecondaryDebitDepositAccountAccountNumber() {
        return outSecondaryDebitDepositAccountAccountNumber;
    }

    /**
     * Sets the value of the outSecondaryDebitDepositAccountAccountNumber property.
     * 
     */
    public void setOutSecondaryDebitDepositAccountAccountNumber(double value) {
        this.outSecondaryDebitDepositAccountAccountNumber = value;
    }

    /**
     * Gets the value of the outSecondaryDebitDepositAccountCDigit property.
     * 
     */
    public short getOutSecondaryDebitDepositAccountCDigit() {
        return outSecondaryDebitDepositAccountCDigit;
    }

    /**
     * Sets the value of the outSecondaryDebitDepositAccountCDigit property.
     * 
     */
    public void setOutSecondaryDebitDepositAccountCDigit(short value) {
        this.outSecondaryDebitDepositAccountCDigit = value;
    }

    /**
     * Gets the value of the outSecondaryDebitDepositAccountDesignation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSecondaryDebitDepositAccountDesignation() {
        return outSecondaryDebitDepositAccountDesignation;
    }

    /**
     * Sets the value of the outSecondaryDebitDepositAccountDesignation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSecondaryDebitDepositAccountDesignation(String value) {
        this.outSecondaryDebitDepositAccountDesignation = value;
    }

    /**
     * Gets the value of the outSecondaryDebitProfitsAccountAccountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSecondaryDebitProfitsAccountAccountNumber() {
        return outSecondaryDebitProfitsAccountAccountNumber;
    }

    /**
     * Sets the value of the outSecondaryDebitProfitsAccountAccountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSecondaryDebitProfitsAccountAccountNumber(String value) {
        this.outSecondaryDebitProfitsAccountAccountNumber = value;
    }

    /**
     * Gets the value of the outServJustifListJustificDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutServJustifListJustificDescription() {
        return outServJustifListJustificDescription;
    }

    /**
     * Sets the value of the outServJustifListJustificDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutServJustifListJustificDescription(String value) {
        this.outServJustifListJustificDescription = value;
    }

    /**
     * Gets the value of the outServJustifListJustificIdJustific property.
     * 
     */
    public int getOutServJustifListJustificIdJustific() {
        return outServJustifListJustificIdJustific;
    }

    /**
     * Sets the value of the outServJustifListJustificIdJustific property.
     * 
     */
    public void setOutServJustifListJustificIdJustific(int value) {
        this.outServJustifListJustificIdJustific = value;
    }

    /**
     * Gets the value of the outServProdListProductDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutServProdListProductDescription() {
        return outServProdListProductDescription;
    }

    /**
     * Sets the value of the outServProdListProductDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutServProdListProductDescription(String value) {
        this.outServProdListProductDescription = value;
    }

    /**
     * Gets the value of the outServProdListProductIdProduct property.
     * 
     */
    public int getOutServProdListProductIdProduct() {
        return outServProdListProductIdProduct;
    }

    /**
     * Sets the value of the outServProdListProductIdProduct property.
     * 
     */
    public void setOutServProdListProductIdProduct(int value) {
        this.outServProdListProductIdProduct = value;
    }

    /**
     * Gets the value of the outSoSwiftCrAccountDtl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSoSwiftCrAccountDtl() {
        return outSoSwiftCrAccountDtl;
    }

    /**
     * Sets the value of the outSoSwiftCrAccountDtl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSoSwiftCrAccountDtl(String value) {
        this.outSoSwiftCrAccountDtl = value;
    }

    /**
     * Gets the value of the outSoSwiftDetailOfCharge property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSoSwiftDetailOfCharge() {
        return outSoSwiftDetailOfCharge;
    }

    /**
     * Sets the value of the outSoSwiftDetailOfCharge property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSoSwiftDetailOfCharge(String value) {
        this.outSoSwiftDetailOfCharge = value;
    }

    /**
     * Gets the value of the outSoSwiftFreeText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSoSwiftFreeText() {
        return outSoSwiftFreeText;
    }

    /**
     * Sets the value of the outSoSwiftFreeText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSoSwiftFreeText(String value) {
        this.outSoSwiftFreeText = value;
    }

    /**
     * Gets the value of the outSoSwiftIban property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSoSwiftIban() {
        return outSoSwiftIban;
    }

    /**
     * Sets the value of the outSoSwiftIban property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSoSwiftIban(String value) {
        this.outSoSwiftIban = value;
    }

    /**
     * Gets the value of the outSoSwiftInformation1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSoSwiftInformation1() {
        return outSoSwiftInformation1;
    }

    /**
     * Sets the value of the outSoSwiftInformation1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSoSwiftInformation1(String value) {
        this.outSoSwiftInformation1 = value;
    }

    /**
     * Gets the value of the outSoSwiftInformation2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSoSwiftInformation2() {
        return outSoSwiftInformation2;
    }

    /**
     * Sets the value of the outSoSwiftInformation2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSoSwiftInformation2(String value) {
        this.outSoSwiftInformation2 = value;
    }

    /**
     * Gets the value of the outSoSwiftInformation3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSoSwiftInformation3() {
        return outSoSwiftInformation3;
    }

    /**
     * Sets the value of the outSoSwiftInformation3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSoSwiftInformation3(String value) {
        this.outSoSwiftInformation3 = value;
    }

    /**
     * Gets the value of the outSoSwiftInformation4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSoSwiftInformation4() {
        return outSoSwiftInformation4;
    }

    /**
     * Sets the value of the outSoSwiftInformation4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSoSwiftInformation4(String value) {
        this.outSoSwiftInformation4 = value;
    }

    /**
     * Gets the value of the outSoSwiftInformation5 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSoSwiftInformation5() {
        return outSoSwiftInformation5;
    }

    /**
     * Sets the value of the outSoSwiftInformation5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSoSwiftInformation5(String value) {
        this.outSoSwiftInformation5 = value;
    }

    /**
     * Gets the value of the outSoSwiftInformation6 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSoSwiftInformation6() {
        return outSoSwiftInformation6;
    }

    /**
     * Sets the value of the outSoSwiftInformation6 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSoSwiftInformation6(String value) {
        this.outSoSwiftInformation6 = value;
    }

    /**
     * Gets the value of the outSoSwiftJustific1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSoSwiftJustific1() {
        return outSoSwiftJustific1;
    }

    /**
     * Sets the value of the outSoSwiftJustific1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSoSwiftJustific1(String value) {
        this.outSoSwiftJustific1 = value;
    }

    /**
     * Gets the value of the outSoSwiftJustific2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSoSwiftJustific2() {
        return outSoSwiftJustific2;
    }

    /**
     * Sets the value of the outSoSwiftJustific2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSoSwiftJustific2(String value) {
        this.outSoSwiftJustific2 = value;
    }

    /**
     * Gets the value of the outSoSwiftJustific3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSoSwiftJustific3() {
        return outSoSwiftJustific3;
    }

    /**
     * Sets the value of the outSoSwiftJustific3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSoSwiftJustific3(String value) {
        this.outSoSwiftJustific3 = value;
    }

    /**
     * Gets the value of the outSoSwiftJustific4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSoSwiftJustific4() {
        return outSoSwiftJustific4;
    }

    /**
     * Sets the value of the outSoSwiftJustific4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSoSwiftJustific4(String value) {
        this.outSoSwiftJustific4 = value;
    }

    /**
     * Gets the value of the outSoSwiftOriginCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSoSwiftOriginCode() {
        return outSoSwiftOriginCode;
    }

    /**
     * Sets the value of the outSoSwiftOriginCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSoSwiftOriginCode(String value) {
        this.outSoSwiftOriginCode = value;
    }

    /**
     * Gets the value of the outSoSwiftReceiverDiasUnit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSoSwiftReceiverDiasUnit() {
        return outSoSwiftReceiverDiasUnit;
    }

    /**
     * Sets the value of the outSoSwiftReceiverDiasUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSoSwiftReceiverDiasUnit(String value) {
        this.outSoSwiftReceiverDiasUnit = value;
    }

    /**
     * Gets the value of the outSoSwiftServiceCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSoSwiftServiceCode() {
        return outSoSwiftServiceCode;
    }

    /**
     * Sets the value of the outSoSwiftServiceCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSoSwiftServiceCode(String value) {
        this.outSoSwiftServiceCode = value;
    }

    /**
     * Gets the value of the outSoSwiftTpSoIdentifier property.
     * 
     */
    public double getOutSoSwiftTpSoIdentifier() {
        return outSoSwiftTpSoIdentifier;
    }

    /**
     * Sets the value of the outSoSwiftTpSoIdentifier property.
     * 
     */
    public void setOutSoSwiftTpSoIdentifier(double value) {
        this.outSoSwiftTpSoIdentifier = value;
    }

    /**
     * Gets the value of the outSoSwiftTransCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSoSwiftTransCode() {
        return outSoSwiftTransCode;
    }

    /**
     * Sets the value of the outSoSwiftTransCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSoSwiftTransCode(String value) {
        this.outSoSwiftTransCode = value;
    }

    /**
     * Gets the value of the outSoSwiftValueDays property.
     * 
     */
    public short getOutSoSwiftValueDays() {
        return outSoSwiftValueDays;
    }

    /**
     * Sets the value of the outSoSwiftValueDays property.
     * 
     */
    public void setOutSoSwiftValueDays(short value) {
        this.outSoSwiftValueDays = value;
    }

    /**
     * Gets the value of the outSoSwift103AccWithInsti57A property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSoSwift103AccWithInsti57A() {
        return outSoSwift103AccWithInsti57A;
    }

    /**
     * Sets the value of the outSoSwift103AccWithInsti57A property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSoSwift103AccWithInsti57A(String value) {
        this.outSoSwift103AccWithInsti57A = value;
    }

    /**
     * Gets the value of the outSoSwift103BankOperCod23B property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSoSwift103BankOperCod23B() {
        return outSoSwift103BankOperCod23B;
    }

    /**
     * Sets the value of the outSoSwift103BankOperCod23B property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSoSwift103BankOperCod23B(String value) {
        this.outSoSwift103BankOperCod23B = value;
    }

    /**
     * Gets the value of the outSoSwift103BenefCustomer59A property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSoSwift103BenefCustomer59A() {
        return outSoSwift103BenefCustomer59A;
    }

    /**
     * Sets the value of the outSoSwift103BenefCustomer59A property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSoSwift103BenefCustomer59A(String value) {
        this.outSoSwift103BenefCustomer59A = value;
    }

    /**
     * Gets the value of the outSoSwift103Chk13C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSoSwift103Chk13C() {
        return outSoSwift103Chk13C;
    }

    /**
     * Sets the value of the outSoSwift103Chk13C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSoSwift103Chk13C(String value) {
        this.outSoSwift103Chk13C = value;
    }

    /**
     * Gets the value of the outSoSwift103Chk20 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSoSwift103Chk20() {
        return outSoSwift103Chk20;
    }

    /**
     * Sets the value of the outSoSwift103Chk20 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSoSwift103Chk20(String value) {
        this.outSoSwift103Chk20 = value;
    }

    /**
     * Gets the value of the outSoSwift103Chk23B property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSoSwift103Chk23B() {
        return outSoSwift103Chk23B;
    }

    /**
     * Sets the value of the outSoSwift103Chk23B property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSoSwift103Chk23B(String value) {
        this.outSoSwift103Chk23B = value;
    }

    /**
     * Gets the value of the outSoSwift103Chk23E property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSoSwift103Chk23E() {
        return outSoSwift103Chk23E;
    }

    /**
     * Sets the value of the outSoSwift103Chk23E property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSoSwift103Chk23E(String value) {
        this.outSoSwift103Chk23E = value;
    }

    /**
     * Gets the value of the outSoSwift103Chk26T property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSoSwift103Chk26T() {
        return outSoSwift103Chk26T;
    }

    /**
     * Sets the value of the outSoSwift103Chk26T property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSoSwift103Chk26T(String value) {
        this.outSoSwift103Chk26T = value;
    }

    /**
     * Gets the value of the outSoSwift103Chk32A property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSoSwift103Chk32A() {
        return outSoSwift103Chk32A;
    }

    /**
     * Sets the value of the outSoSwift103Chk32A property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSoSwift103Chk32A(String value) {
        this.outSoSwift103Chk32A = value;
    }

    /**
     * Gets the value of the outSoSwift103Chk33B property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSoSwift103Chk33B() {
        return outSoSwift103Chk33B;
    }

    /**
     * Sets the value of the outSoSwift103Chk33B property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSoSwift103Chk33B(String value) {
        this.outSoSwift103Chk33B = value;
    }

    /**
     * Gets the value of the outSoSwift103Chk36 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSoSwift103Chk36() {
        return outSoSwift103Chk36;
    }

    /**
     * Sets the value of the outSoSwift103Chk36 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSoSwift103Chk36(String value) {
        this.outSoSwift103Chk36 = value;
    }

    /**
     * Gets the value of the outSoSwift103Chk50A property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSoSwift103Chk50A() {
        return outSoSwift103Chk50A;
    }

    /**
     * Sets the value of the outSoSwift103Chk50A property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSoSwift103Chk50A(String value) {
        this.outSoSwift103Chk50A = value;
    }

    /**
     * Gets the value of the outSoSwift103Chk51A property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSoSwift103Chk51A() {
        return outSoSwift103Chk51A;
    }

    /**
     * Sets the value of the outSoSwift103Chk51A property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSoSwift103Chk51A(String value) {
        this.outSoSwift103Chk51A = value;
    }

    /**
     * Gets the value of the outSoSwift103Chk52A property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSoSwift103Chk52A() {
        return outSoSwift103Chk52A;
    }

    /**
     * Sets the value of the outSoSwift103Chk52A property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSoSwift103Chk52A(String value) {
        this.outSoSwift103Chk52A = value;
    }

    /**
     * Gets the value of the outSoSwift103Chk53A property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSoSwift103Chk53A() {
        return outSoSwift103Chk53A;
    }

    /**
     * Sets the value of the outSoSwift103Chk53A property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSoSwift103Chk53A(String value) {
        this.outSoSwift103Chk53A = value;
    }

    /**
     * Gets the value of the outSoSwift103Chk54A property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSoSwift103Chk54A() {
        return outSoSwift103Chk54A;
    }

    /**
     * Sets the value of the outSoSwift103Chk54A property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSoSwift103Chk54A(String value) {
        this.outSoSwift103Chk54A = value;
    }

    /**
     * Gets the value of the outSoSwift103Chk55A property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSoSwift103Chk55A() {
        return outSoSwift103Chk55A;
    }

    /**
     * Sets the value of the outSoSwift103Chk55A property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSoSwift103Chk55A(String value) {
        this.outSoSwift103Chk55A = value;
    }

    /**
     * Gets the value of the outSoSwift103Chk56A property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSoSwift103Chk56A() {
        return outSoSwift103Chk56A;
    }

    /**
     * Sets the value of the outSoSwift103Chk56A property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSoSwift103Chk56A(String value) {
        this.outSoSwift103Chk56A = value;
    }

    /**
     * Gets the value of the outSoSwift103Chk57A property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSoSwift103Chk57A() {
        return outSoSwift103Chk57A;
    }

    /**
     * Sets the value of the outSoSwift103Chk57A property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSoSwift103Chk57A(String value) {
        this.outSoSwift103Chk57A = value;
    }

    /**
     * Gets the value of the outSoSwift103Chk59A property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSoSwift103Chk59A() {
        return outSoSwift103Chk59A;
    }

    /**
     * Sets the value of the outSoSwift103Chk59A property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSoSwift103Chk59A(String value) {
        this.outSoSwift103Chk59A = value;
    }

    /**
     * Gets the value of the outSoSwift103Chk70 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSoSwift103Chk70() {
        return outSoSwift103Chk70;
    }

    /**
     * Sets the value of the outSoSwift103Chk70 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSoSwift103Chk70(String value) {
        this.outSoSwift103Chk70 = value;
    }

    /**
     * Gets the value of the outSoSwift103Chk71A property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSoSwift103Chk71A() {
        return outSoSwift103Chk71A;
    }

    /**
     * Sets the value of the outSoSwift103Chk71A property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSoSwift103Chk71A(String value) {
        this.outSoSwift103Chk71A = value;
    }

    /**
     * Gets the value of the outSoSwift103Chk71F property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSoSwift103Chk71F() {
        return outSoSwift103Chk71F;
    }

    /**
     * Sets the value of the outSoSwift103Chk71F property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSoSwift103Chk71F(String value) {
        this.outSoSwift103Chk71F = value;
    }

    /**
     * Gets the value of the outSoSwift103Chk71G property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSoSwift103Chk71G() {
        return outSoSwift103Chk71G;
    }

    /**
     * Sets the value of the outSoSwift103Chk71G property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSoSwift103Chk71G(String value) {
        this.outSoSwift103Chk71G = value;
    }

    /**
     * Gets the value of the outSoSwift103Chk72 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSoSwift103Chk72() {
        return outSoSwift103Chk72;
    }

    /**
     * Sets the value of the outSoSwift103Chk72 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSoSwift103Chk72(String value) {
        this.outSoSwift103Chk72 = value;
    }

    /**
     * Gets the value of the outSoSwift103Chk77B property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSoSwift103Chk77B() {
        return outSoSwift103Chk77B;
    }

    /**
     * Sets the value of the outSoSwift103Chk77B property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSoSwift103Chk77B(String value) {
        this.outSoSwift103Chk77B = value;
    }

    /**
     * Gets the value of the outSoSwift103Chk77T property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSoSwift103Chk77T() {
        return outSoSwift103Chk77T;
    }

    /**
     * Sets the value of the outSoSwift103Chk77T property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSoSwift103Chk77T(String value) {
        this.outSoSwift103Chk77T = value;
    }

    /**
     * Gets the value of the outSoSwift103CoveringMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSoSwift103CoveringMessage() {
        return outSoSwift103CoveringMessage;
    }

    /**
     * Sets the value of the outSoSwift103CoveringMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSoSwift103CoveringMessage(String value) {
        this.outSoSwift103CoveringMessage = value;
    }

    /**
     * Gets the value of the outSoSwift103CurInstrAmn33B property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSoSwift103CurInstrAmn33B() {
        return outSoSwift103CurInstrAmn33B;
    }

    /**
     * Sets the value of the outSoSwift103CurInstrAmn33B property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSoSwift103CurInstrAmn33B(String value) {
        this.outSoSwift103CurInstrAmn33B = value;
    }

    /**
     * Gets the value of the outSoSwift103DetOfCharges71A property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSoSwift103DetOfCharges71A() {
        return outSoSwift103DetOfCharges71A;
    }

    /**
     * Sets the value of the outSoSwift103DetOfCharges71A property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSoSwift103DetOfCharges71A(String value) {
        this.outSoSwift103DetOfCharges71A = value;
    }

    /**
     * Gets the value of the outSoSwift103EnvlCnts77T property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSoSwift103EnvlCnts77T() {
        return outSoSwift103EnvlCnts77T;
    }

    /**
     * Sets the value of the outSoSwift103EnvlCnts77T property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSoSwift103EnvlCnts77T(String value) {
        this.outSoSwift103EnvlCnts77T = value;
    }

    /**
     * Gets the value of the outSoSwift103ExchangeRate36 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSoSwift103ExchangeRate36() {
        return outSoSwift103ExchangeRate36;
    }

    /**
     * Sets the value of the outSoSwift103ExchangeRate36 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSoSwift103ExchangeRate36(String value) {
        this.outSoSwift103ExchangeRate36 = value;
    }

    /**
     * Gets the value of the outSoSwift103InstrCode23E property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSoSwift103InstrCode23E() {
        return outSoSwift103InstrCode23E;
    }

    /**
     * Sets the value of the outSoSwift103InstrCode23E property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSoSwift103InstrCode23E(String value) {
        this.outSoSwift103InstrCode23E = value;
    }

    /**
     * Gets the value of the outSoSwift103IntermInstit56A property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSoSwift103IntermInstit56A() {
        return outSoSwift103IntermInstit56A;
    }

    /**
     * Sets the value of the outSoSwift103IntermInstit56A property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSoSwift103IntermInstit56A(String value) {
        this.outSoSwift103IntermInstit56A = value;
    }

    /**
     * Gets the value of the outSoSwift103OrderingCust50A property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSoSwift103OrderingCust50A() {
        return outSoSwift103OrderingCust50A;
    }

    /**
     * Sets the value of the outSoSwift103OrderingCust50A property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSoSwift103OrderingCust50A(String value) {
        this.outSoSwift103OrderingCust50A = value;
    }

    /**
     * Gets the value of the outSoSwift103OrderingInsti52A property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSoSwift103OrderingInsti52A() {
        return outSoSwift103OrderingInsti52A;
    }

    /**
     * Sets the value of the outSoSwift103OrderingInsti52A property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSoSwift103OrderingInsti52A(String value) {
        this.outSoSwift103OrderingInsti52A = value;
    }

    /**
     * Gets the value of the outSoSwift103OutgBenefAccount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSoSwift103OutgBenefAccount() {
        return outSoSwift103OutgBenefAccount;
    }

    /**
     * Sets the value of the outSoSwift103OutgBenefAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSoSwift103OutgBenefAccount(String value) {
        this.outSoSwift103OutgBenefAccount = value;
    }

    /**
     * Gets the value of the outSoSwift103PriorityCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSoSwift103PriorityCode() {
        return outSoSwift103PriorityCode;
    }

    /**
     * Sets the value of the outSoSwift103PriorityCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSoSwift103PriorityCode(String value) {
        this.outSoSwift103PriorityCode = value;
    }

    /**
     * Gets the value of the outSoSwift103RcvrsCharges71G property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSoSwift103RcvrsCharges71G() {
        return outSoSwift103RcvrsCharges71G;
    }

    /**
     * Sets the value of the outSoSwift103RcvrsCharges71G property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSoSwift103RcvrsCharges71G(String value) {
        this.outSoSwift103RcvrsCharges71G = value;
    }

    /**
     * Gets the value of the outSoSwift103RcvrsCorr54A property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSoSwift103RcvrsCorr54A() {
        return outSoSwift103RcvrsCorr54A;
    }

    /**
     * Sets the value of the outSoSwift103RcvrsCorr54A property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSoSwift103RcvrsCorr54A(String value) {
        this.outSoSwift103RcvrsCorr54A = value;
    }

    /**
     * Gets the value of the outSoSwift103ReceiverBic property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSoSwift103ReceiverBic() {
        return outSoSwift103ReceiverBic;
    }

    /**
     * Sets the value of the outSoSwift103ReceiverBic property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSoSwift103ReceiverBic(String value) {
        this.outSoSwift103ReceiverBic = value;
    }

    /**
     * Gets the value of the outSoSwift103RegulRpt77B property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSoSwift103RegulRpt77B() {
        return outSoSwift103RegulRpt77B;
    }

    /**
     * Sets the value of the outSoSwift103RegulRpt77B property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSoSwift103RegulRpt77B(String value) {
        this.outSoSwift103RegulRpt77B = value;
    }

    /**
     * Gets the value of the outSoSwift103RemtnceInform70 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSoSwift103RemtnceInform70() {
        return outSoSwift103RemtnceInform70;
    }

    /**
     * Sets the value of the outSoSwift103RemtnceInform70 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSoSwift103RemtnceInform70(String value) {
        this.outSoSwift103RemtnceInform70 = value;
    }

    /**
     * Gets the value of the outSoSwift103SenderBic property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSoSwift103SenderBic() {
        return outSoSwift103SenderBic;
    }

    /**
     * Sets the value of the outSoSwift103SenderBic property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSoSwift103SenderBic(String value) {
        this.outSoSwift103SenderBic = value;
    }

    /**
     * Gets the value of the outSoSwift103SendersCorr53A property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSoSwift103SendersCorr53A() {
        return outSoSwift103SendersCorr53A;
    }

    /**
     * Sets the value of the outSoSwift103SendersCorr53A property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSoSwift103SendersCorr53A(String value) {
        this.outSoSwift103SendersCorr53A = value;
    }

    /**
     * Gets the value of the outSoSwift103SendingInstit51A property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSoSwift103SendingInstit51A() {
        return outSoSwift103SendingInstit51A;
    }

    /**
     * Sets the value of the outSoSwift103SendingInstit51A property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSoSwift103SendingInstit51A(String value) {
        this.outSoSwift103SendingInstit51A = value;
    }

    /**
     * Gets the value of the outSoSwift103SndrToRcvr72 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSoSwift103SndrToRcvr72() {
        return outSoSwift103SndrToRcvr72;
    }

    /**
     * Sets the value of the outSoSwift103SndrToRcvr72 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSoSwift103SndrToRcvr72(String value) {
        this.outSoSwift103SndrToRcvr72 = value;
    }

    /**
     * Gets the value of the outSoSwift103SndrsCharges71F property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSoSwift103SndrsCharges71F() {
        return outSoSwift103SndrsCharges71F;
    }

    /**
     * Sets the value of the outSoSwift103SndrsCharges71F property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSoSwift103SndrsCharges71F(String value) {
        this.outSoSwift103SndrsCharges71F = value;
    }

    /**
     * Gets the value of the outSoSwift103StpFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSoSwift103StpFlag() {
        return outSoSwift103StpFlag;
    }

    /**
     * Sets the value of the outSoSwift103StpFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSoSwift103StpFlag(String value) {
        this.outSoSwift103StpFlag = value;
    }

    /**
     * Gets the value of the outSoSwift103ThirdReimbIn55A property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSoSwift103ThirdReimbIn55A() {
        return outSoSwift103ThirdReimbIn55A;
    }

    /**
     * Sets the value of the outSoSwift103ThirdReimbIn55A property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSoSwift103ThirdReimbIn55A(String value) {
        this.outSoSwift103ThirdReimbIn55A = value;
    }

    /**
     * Gets the value of the outSoSwift103TimeIndicatio13C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSoSwift103TimeIndicatio13C() {
        return outSoSwift103TimeIndicatio13C;
    }

    /**
     * Sets the value of the outSoSwift103TimeIndicatio13C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSoSwift103TimeIndicatio13C(String value) {
        this.outSoSwift103TimeIndicatio13C = value;
    }

    /**
     * Gets the value of the outSoSwift103TpSoIdentifier property.
     * 
     */
    public double getOutSoSwift103TpSoIdentifier() {
        return outSoSwift103TpSoIdentifier;
    }

    /**
     * Sets the value of the outSoSwift103TpSoIdentifier property.
     * 
     */
    public void setOutSoSwift103TpSoIdentifier(double value) {
        this.outSoSwift103TpSoIdentifier = value;
    }

    /**
     * Gets the value of the outSoSwift103TrxRefNo20 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSoSwift103TrxRefNo20() {
        return outSoSwift103TrxRefNo20;
    }

    /**
     * Sets the value of the outSoSwift103TrxRefNo20 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSoSwift103TrxRefNo20(String value) {
        this.outSoSwift103TrxRefNo20 = value;
    }

    /**
     * Gets the value of the outSoSwift103TrxTypeCode26T property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSoSwift103TrxTypeCode26T() {
        return outSoSwift103TrxTypeCode26T;
    }

    /**
     * Sets the value of the outSoSwift103TrxTypeCode26T property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSoSwift103TrxTypeCode26T(String value) {
        this.outSoSwift103TrxTypeCode26T = value;
    }

    /**
     * Gets the value of the outSoSwift103ValueCurAmn32A property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSoSwift103ValueCurAmn32A() {
        return outSoSwift103ValueCurAmn32A;
    }

    /**
     * Sets the value of the outSoSwift103ValueCurAmn32A property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSoSwift103ValueCurAmn32A(String value) {
        this.outSoSwift103ValueCurAmn32A = value;
    }

    /**
     * Gets the value of the outSoSwift103ValueDays property.
     * 
     */
    public short getOutSoSwift103ValueDays() {
        return outSoSwift103ValueDays;
    }

    /**
     * Sets the value of the outSoSwift103ValueDays property.
     * 
     */
    public void setOutSoSwift103ValueDays(short value) {
        this.outSoSwift103ValueDays = value;
    }

    /**
     * Gets the value of the outSoSwift202AccWithInsti57A property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSoSwift202AccWithInsti57A() {
        return outSoSwift202AccWithInsti57A;
    }

    /**
     * Sets the value of the outSoSwift202AccWithInsti57A property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSoSwift202AccWithInsti57A(String value) {
        this.outSoSwift202AccWithInsti57A = value;
    }

    /**
     * Gets the value of the outSoSwift202SndrToRcvr72 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSoSwift202SndrToRcvr72() {
        return outSoSwift202SndrToRcvr72;
    }

    /**
     * Sets the value of the outSoSwift202SndrToRcvr72 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSoSwift202SndrToRcvr72(String value) {
        this.outSoSwift202SndrToRcvr72 = value;
    }

    /**
     * Gets the value of the outSoSwift202TpSoIdentifier property.
     * 
     */
    public double getOutSoSwift202TpSoIdentifier() {
        return outSoSwift202TpSoIdentifier;
    }

    /**
     * Sets the value of the outSoSwift202TpSoIdentifier property.
     * 
     */
    public void setOutSoSwift202TpSoIdentifier(double value) {
        this.outSoSwift202TpSoIdentifier = value;
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
     * Gets the value of the outStatusIefSuppliedActionEntryMsg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutStatusIefSuppliedActionEntryMsg() {
        return outStatusIefSuppliedActionEntryMsg;
    }

    /**
     * Sets the value of the outStatusIefSuppliedActionEntryMsg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutStatusIefSuppliedActionEntryMsg(String value) {
        this.outStatusIefSuppliedActionEntryMsg = value;
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
     * Gets the value of the outSwiftBillPayableProdListProductDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSwiftBillPayableProdListProductDescription() {
        return outSwiftBillPayableProdListProductDescription;
    }

    /**
     * Sets the value of the outSwiftBillPayableProdListProductDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSwiftBillPayableProdListProductDescription(String value) {
        this.outSwiftBillPayableProdListProductDescription = value;
    }

    /**
     * Gets the value of the outSwiftBillPayableProdListProductIdProduct property.
     * 
     */
    public int getOutSwiftBillPayableProdListProductIdProduct() {
        return outSwiftBillPayableProdListProductIdProduct;
    }

    /**
     * Sets the value of the outSwiftBillPayableProdListProductIdProduct property.
     * 
     */
    public void setOutSwiftBillPayableProdListProductIdProduct(int value) {
        this.outSwiftBillPayableProdListProductIdProduct = value;
    }

    /**
     * Gets the value of the outSwiftDepositAccJustificJustificDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSwiftDepositAccJustificJustificDescription() {
        return outSwiftDepositAccJustificJustificDescription;
    }

    /**
     * Sets the value of the outSwiftDepositAccJustificJustificDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSwiftDepositAccJustificJustificDescription(String value) {
        this.outSwiftDepositAccJustificJustificDescription = value;
    }

    /**
     * Gets the value of the outSwiftDepositAccJustificJustificIdJustific property.
     * 
     */
    public int getOutSwiftDepositAccJustificJustificIdJustific() {
        return outSwiftDepositAccJustificJustificIdJustific;
    }

    /**
     * Sets the value of the outSwiftDepositAccJustificJustificIdJustific property.
     * 
     */
    public void setOutSwiftDepositAccJustificJustificIdJustific(int value) {
        this.outSwiftDepositAccJustificJustificIdJustific = value;
    }

    /**
     * Gets the value of the outTaxNoTaxGenericDetailDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutTaxNoTaxGenericDetailDescription() {
        return outTaxNoTaxGenericDetailDescription;
    }

    /**
     * Sets the value of the outTaxNoTaxGenericDetailDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutTaxNoTaxGenericDetailDescription(String value) {
        this.outTaxNoTaxGenericDetailDescription = value;
    }

    /**
     * Gets the value of the outTaxNoTaxGenericDetailSerialNum property.
     * 
     */
    public int getOutTaxNoTaxGenericDetailSerialNum() {
        return outTaxNoTaxGenericDetailSerialNum;
    }

    /**
     * Sets the value of the outTaxNoTaxGenericDetailSerialNum property.
     * 
     */
    public void setOutTaxNoTaxGenericDetailSerialNum(int value) {
        this.outTaxNoTaxGenericDetailSerialNum = value;
    }

    /**
     * Gets the value of the outTerritoryCodeGenericDetailDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutTerritoryCodeGenericDetailDescription() {
        return outTerritoryCodeGenericDetailDescription;
    }

    /**
     * Sets the value of the outTerritoryCodeGenericDetailDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutTerritoryCodeGenericDetailDescription(String value) {
        this.outTerritoryCodeGenericDetailDescription = value;
    }

    /**
     * Gets the value of the outTerritoryCodeGenericDetailSerialNum property.
     * 
     */
    public int getOutTerritoryCodeGenericDetailSerialNum() {
        return outTerritoryCodeGenericDetailSerialNum;
    }

    /**
     * Sets the value of the outTerritoryCodeGenericDetailSerialNum property.
     * 
     */
    public void setOutTerritoryCodeGenericDetailSerialNum(int value) {
        this.outTerritoryCodeGenericDetailSerialNum = value;
    }

    /**
     * Gets the value of the outTpSoCommitmentAccProductType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutTpSoCommitmentAccProductType() {
        return outTpSoCommitmentAccProductType;
    }

    /**
     * Sets the value of the outTpSoCommitmentAccProductType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutTpSoCommitmentAccProductType(String value) {
        this.outTpSoCommitmentAccProductType = value;
    }

    /**
     * Gets the value of the outTpSoCommitmentAchBankCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutTpSoCommitmentAchBankCode() {
        return outTpSoCommitmentAchBankCode;
    }

    /**
     * Sets the value of the outTpSoCommitmentAchBankCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutTpSoCommitmentAchBankCode(String value) {
        this.outTpSoCommitmentAchBankCode = value;
    }

    /**
     * Gets the value of the outTpSoCommitmentActivationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutTpSoCommitmentActivationDate() {
        return outTpSoCommitmentActivationDate;
    }

    /**
     * Sets the value of the outTpSoCommitmentActivationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutTpSoCommitmentActivationDate(XMLGregorianCalendar value) {
        this.outTpSoCommitmentActivationDate = value;
    }

    /**
     * Gets the value of the outTpSoCommitmentAdvancesRelated property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutTpSoCommitmentAdvancesRelated() {
        return outTpSoCommitmentAdvancesRelated;
    }

    /**
     * Sets the value of the outTpSoCommitmentAdvancesRelated property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutTpSoCommitmentAdvancesRelated(String value) {
        this.outTpSoCommitmentAdvancesRelated = value;
    }

    /**
     * Gets the value of the outTpSoCommitmentAllowNotExTries property.
     * 
     */
    public int getOutTpSoCommitmentAllowNotExTries() {
        return outTpSoCommitmentAllowNotExTries;
    }

    /**
     * Sets the value of the outTpSoCommitmentAllowNotExTries property.
     * 
     */
    public void setOutTpSoCommitmentAllowNotExTries(int value) {
        this.outTpSoCommitmentAllowNotExTries = value;
    }

    /**
     * Gets the value of the outTpSoCommitmentBillPayabJustId property.
     * 
     */
    public int getOutTpSoCommitmentBillPayabJustId() {
        return outTpSoCommitmentBillPayabJustId;
    }

    /**
     * Sets the value of the outTpSoCommitmentBillPayabJustId property.
     * 
     */
    public void setOutTpSoCommitmentBillPayabJustId(int value) {
        this.outTpSoCommitmentBillPayabJustId = value;
    }

    /**
     * Gets the value of the outTpSoCommitmentBillPayabProdId property.
     * 
     */
    public int getOutTpSoCommitmentBillPayabProdId() {
        return outTpSoCommitmentBillPayabProdId;
    }

    /**
     * Sets the value of the outTpSoCommitmentBillPayabProdId property.
     * 
     */
    public void setOutTpSoCommitmentBillPayabProdId(int value) {
        this.outTpSoCommitmentBillPayabProdId = value;
    }

    /**
     * Gets the value of the outTpSoCommitmentBookBalanceMargin property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutTpSoCommitmentBookBalanceMargin() {
        return outTpSoCommitmentBookBalanceMargin;
    }

    /**
     * Sets the value of the outTpSoCommitmentBookBalanceMargin property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutTpSoCommitmentBookBalanceMargin(BigDecimal value) {
        this.outTpSoCommitmentBookBalanceMargin = value;
    }

    /**
     * Gets the value of the outTpSoCommitmentBopCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutTpSoCommitmentBopCode() {
        return outTpSoCommitmentBopCode;
    }

    /**
     * Sets the value of the outTpSoCommitmentBopCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutTpSoCommitmentBopCode(String value) {
        this.outTpSoCommitmentBopCode = value;
    }

    /**
     * Gets the value of the outTpSoCommitmentBpBenefAddress1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutTpSoCommitmentBpBenefAddress1() {
        return outTpSoCommitmentBpBenefAddress1;
    }

    /**
     * Sets the value of the outTpSoCommitmentBpBenefAddress1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutTpSoCommitmentBpBenefAddress1(String value) {
        this.outTpSoCommitmentBpBenefAddress1 = value;
    }

    /**
     * Gets the value of the outTpSoCommitmentBpBenefAddress2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutTpSoCommitmentBpBenefAddress2() {
        return outTpSoCommitmentBpBenefAddress2;
    }

    /**
     * Sets the value of the outTpSoCommitmentBpBenefAddress2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutTpSoCommitmentBpBenefAddress2(String value) {
        this.outTpSoCommitmentBpBenefAddress2 = value;
    }

    /**
     * Gets the value of the outTpSoCommitmentBpBenefAddress3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutTpSoCommitmentBpBenefAddress3() {
        return outTpSoCommitmentBpBenefAddress3;
    }

    /**
     * Sets the value of the outTpSoCommitmentBpBenefAddress3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutTpSoCommitmentBpBenefAddress3(String value) {
        this.outTpSoCommitmentBpBenefAddress3 = value;
    }

    /**
     * Gets the value of the outTpSoCommitmentBpBenefCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutTpSoCommitmentBpBenefCity() {
        return outTpSoCommitmentBpBenefCity;
    }

    /**
     * Sets the value of the outTpSoCommitmentBpBenefCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutTpSoCommitmentBpBenefCity(String value) {
        this.outTpSoCommitmentBpBenefCity = value;
    }

    /**
     * Gets the value of the outTpSoCommitmentBpBenefCountry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutTpSoCommitmentBpBenefCountry() {
        return outTpSoCommitmentBpBenefCountry;
    }

    /**
     * Sets the value of the outTpSoCommitmentBpBenefCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutTpSoCommitmentBpBenefCountry(String value) {
        this.outTpSoCommitmentBpBenefCountry = value;
    }

    /**
     * Gets the value of the outTpSoCommitmentBpBenefName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutTpSoCommitmentBpBenefName() {
        return outTpSoCommitmentBpBenefName;
    }

    /**
     * Sets the value of the outTpSoCommitmentBpBenefName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutTpSoCommitmentBpBenefName(String value) {
        this.outTpSoCommitmentBpBenefName = value;
    }

    /**
     * Gets the value of the outTpSoCommitmentBpBenefZipCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutTpSoCommitmentBpBenefZipCode() {
        return outTpSoCommitmentBpBenefZipCode;
    }

    /**
     * Sets the value of the outTpSoCommitmentBpBenefZipCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutTpSoCommitmentBpBenefZipCode(String value) {
        this.outTpSoCommitmentBpBenefZipCode = value;
    }

    /**
     * Gets the value of the outTpSoCommitmentCancelComments property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutTpSoCommitmentCancelComments() {
        return outTpSoCommitmentCancelComments;
    }

    /**
     * Sets the value of the outTpSoCommitmentCancelComments property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutTpSoCommitmentCancelComments(String value) {
        this.outTpSoCommitmentCancelComments = value;
    }

    /**
     * Gets the value of the outTpSoCommitmentCommisionDiscount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutTpSoCommitmentCommisionDiscount() {
        return outTpSoCommitmentCommisionDiscount;
    }

    /**
     * Sets the value of the outTpSoCommitmentCommisionDiscount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutTpSoCommitmentCommisionDiscount(BigDecimal value) {
        this.outTpSoCommitmentCommisionDiscount = value;
    }

    /**
     * Gets the value of the outTpSoCommitmentCountryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutTpSoCommitmentCountryCode() {
        return outTpSoCommitmentCountryCode;
    }

    /**
     * Sets the value of the outTpSoCommitmentCountryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutTpSoCommitmentCountryCode(String value) {
        this.outTpSoCommitmentCountryCode = value;
    }

    /**
     * Gets the value of the outTpSoCommitmentCrAccComments property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutTpSoCommitmentCrAccComments() {
        return outTpSoCommitmentCrAccComments;
    }

    /**
     * Sets the value of the outTpSoCommitmentCrAccComments property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutTpSoCommitmentCrAccComments(String value) {
        this.outTpSoCommitmentCrAccComments = value;
    }

    /**
     * Gets the value of the outTpSoCommitmentCrAccCurrency property.
     * 
     */
    public int getOutTpSoCommitmentCrAccCurrency() {
        return outTpSoCommitmentCrAccCurrency;
    }

    /**
     * Sets the value of the outTpSoCommitmentCrAccCurrency property.
     * 
     */
    public void setOutTpSoCommitmentCrAccCurrency(int value) {
        this.outTpSoCommitmentCrAccCurrency = value;
    }

    /**
     * Gets the value of the outTpSoCommitmentCrAccCustomerCd property.
     * 
     */
    public short getOutTpSoCommitmentCrAccCustomerCd() {
        return outTpSoCommitmentCrAccCustomerCd;
    }

    /**
     * Sets the value of the outTpSoCommitmentCrAccCustomerCd property.
     * 
     */
    public void setOutTpSoCommitmentCrAccCustomerCd(short value) {
        this.outTpSoCommitmentCrAccCustomerCd = value;
    }

    /**
     * Gets the value of the outTpSoCommitmentCrAccCustomerId property.
     * 
     */
    public int getOutTpSoCommitmentCrAccCustomerId() {
        return outTpSoCommitmentCrAccCustomerId;
    }

    /**
     * Sets the value of the outTpSoCommitmentCrAccCustomerId property.
     * 
     */
    public void setOutTpSoCommitmentCrAccCustomerId(int value) {
        this.outTpSoCommitmentCrAccCustomerId = value;
    }

    /**
     * Gets the value of the outTpSoCommitmentCrBonusCommCode property.
     * 
     */
    public int getOutTpSoCommitmentCrBonusCommCode() {
        return outTpSoCommitmentCrBonusCommCode;
    }

    /**
     * Sets the value of the outTpSoCommitmentCrBonusCommCode property.
     * 
     */
    public void setOutTpSoCommitmentCrBonusCommCode(int value) {
        this.outTpSoCommitmentCrBonusCommCode = value;
    }

    /**
     * Gets the value of the outTpSoCommitmentCrBonusCommDisc property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutTpSoCommitmentCrBonusCommDisc() {
        return outTpSoCommitmentCrBonusCommDisc;
    }

    /**
     * Sets the value of the outTpSoCommitmentCrBonusCommDisc property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutTpSoCommitmentCrBonusCommDisc(BigDecimal value) {
        this.outTpSoCommitmentCrBonusCommDisc = value;
    }

    /**
     * Gets the value of the outTpSoCommitmentCrChargeType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutTpSoCommitmentCrChargeType() {
        return outTpSoCommitmentCrChargeType;
    }

    /**
     * Sets the value of the outTpSoCommitmentCrChargeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutTpSoCommitmentCrChargeType(String value) {
        this.outTpSoCommitmentCrChargeType = value;
    }

    /**
     * Gets the value of the outTpSoCommitmentCrNonResident property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutTpSoCommitmentCrNonResident() {
        return outTpSoCommitmentCrNonResident;
    }

    /**
     * Sets the value of the outTpSoCommitmentCrNonResident property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutTpSoCommitmentCrNonResident(String value) {
        this.outTpSoCommitmentCrNonResident = value;
    }

    /**
     * Gets the value of the outTpSoCommitmentCrPrintAdvice property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutTpSoCommitmentCrPrintAdvice() {
        return outTpSoCommitmentCrPrintAdvice;
    }

    /**
     * Sets the value of the outTpSoCommitmentCrPrintAdvice property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutTpSoCommitmentCrPrintAdvice(String value) {
        this.outTpSoCommitmentCrPrintAdvice = value;
    }

    /**
     * Gets the value of the outTpSoCommitmentDataField1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutTpSoCommitmentDataField1() {
        return outTpSoCommitmentDataField1;
    }

    /**
     * Sets the value of the outTpSoCommitmentDataField1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutTpSoCommitmentDataField1(String value) {
        this.outTpSoCommitmentDataField1 = value;
    }

    /**
     * Gets the value of the outTpSoCommitmentDataField2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutTpSoCommitmentDataField2() {
        return outTpSoCommitmentDataField2;
    }

    /**
     * Sets the value of the outTpSoCommitmentDataField2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutTpSoCommitmentDataField2(String value) {
        this.outTpSoCommitmentDataField2 = value;
    }

    /**
     * Gets the value of the outTpSoCommitmentDataField3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutTpSoCommitmentDataField3() {
        return outTpSoCommitmentDataField3;
    }

    /**
     * Sets the value of the outTpSoCommitmentDataField3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutTpSoCommitmentDataField3(String value) {
        this.outTpSoCommitmentDataField3 = value;
    }

    /**
     * Gets the value of the outTpSoCommitmentDataField4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutTpSoCommitmentDataField4() {
        return outTpSoCommitmentDataField4;
    }

    /**
     * Sets the value of the outTpSoCommitmentDataField4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutTpSoCommitmentDataField4(String value) {
        this.outTpSoCommitmentDataField4 = value;
    }

    /**
     * Gets the value of the outTpSoCommitmentDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutTpSoCommitmentDescription() {
        return outTpSoCommitmentDescription;
    }

    /**
     * Sets the value of the outTpSoCommitmentDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutTpSoCommitmentDescription(String value) {
        this.outTpSoCommitmentDescription = value;
    }

    /**
     * Gets the value of the outTpSoCommitmentDiscountCost property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutTpSoCommitmentDiscountCost() {
        return outTpSoCommitmentDiscountCost;
    }

    /**
     * Sets the value of the outTpSoCommitmentDiscountCost property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutTpSoCommitmentDiscountCost(BigDecimal value) {
        this.outTpSoCommitmentDiscountCost = value;
    }

    /**
     * Gets the value of the outTpSoCommitmentDrAccComments property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutTpSoCommitmentDrAccComments() {
        return outTpSoCommitmentDrAccComments;
    }

    /**
     * Sets the value of the outTpSoCommitmentDrAccComments property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutTpSoCommitmentDrAccComments(String value) {
        this.outTpSoCommitmentDrAccComments = value;
    }

    /**
     * Gets the value of the outTpSoCommitmentDrAccCurrency property.
     * 
     */
    public int getOutTpSoCommitmentDrAccCurrency() {
        return outTpSoCommitmentDrAccCurrency;
    }

    /**
     * Sets the value of the outTpSoCommitmentDrAccCurrency property.
     * 
     */
    public void setOutTpSoCommitmentDrAccCurrency(int value) {
        this.outTpSoCommitmentDrAccCurrency = value;
    }

    /**
     * Gets the value of the outTpSoCommitmentDrAccCustomerCd property.
     * 
     */
    public short getOutTpSoCommitmentDrAccCustomerCd() {
        return outTpSoCommitmentDrAccCustomerCd;
    }

    /**
     * Sets the value of the outTpSoCommitmentDrAccCustomerCd property.
     * 
     */
    public void setOutTpSoCommitmentDrAccCustomerCd(short value) {
        this.outTpSoCommitmentDrAccCustomerCd = value;
    }

    /**
     * Gets the value of the outTpSoCommitmentDrAccCustomerId property.
     * 
     */
    public int getOutTpSoCommitmentDrAccCustomerId() {
        return outTpSoCommitmentDrAccCustomerId;
    }

    /**
     * Sets the value of the outTpSoCommitmentDrAccCustomerId property.
     * 
     */
    public void setOutTpSoCommitmentDrAccCustomerId(int value) {
        this.outTpSoCommitmentDrAccCustomerId = value;
    }

    /**
     * Gets the value of the outTpSoCommitmentDrPrintAdvice property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutTpSoCommitmentDrPrintAdvice() {
        return outTpSoCommitmentDrPrintAdvice;
    }

    /**
     * Sets the value of the outTpSoCommitmentDrPrintAdvice property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutTpSoCommitmentDrPrintAdvice(String value) {
        this.outTpSoCommitmentDrPrintAdvice = value;
    }

    /**
     * Gets the value of the outTpSoCommitmentEntryStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutTpSoCommitmentEntryStatus() {
        return outTpSoCommitmentEntryStatus;
    }

    /**
     * Sets the value of the outTpSoCommitmentEntryStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutTpSoCommitmentEntryStatus(String value) {
        this.outTpSoCommitmentEntryStatus = value;
    }

    /**
     * Gets the value of the outTpSoCommitmentFinalizeFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutTpSoCommitmentFinalizeFlag() {
        return outTpSoCommitmentFinalizeFlag;
    }

    /**
     * Sets the value of the outTpSoCommitmentFinalizeFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutTpSoCommitmentFinalizeFlag(String value) {
        this.outTpSoCommitmentFinalizeFlag = value;
    }

    /**
     * Gets the value of the outTpSoCommitmentFirstPaymentAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutTpSoCommitmentFirstPaymentAmn() {
        return outTpSoCommitmentFirstPaymentAmn;
    }

    /**
     * Sets the value of the outTpSoCommitmentFirstPaymentAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutTpSoCommitmentFirstPaymentAmn(BigDecimal value) {
        this.outTpSoCommitmentFirstPaymentAmn = value;
    }

    /**
     * Gets the value of the outTpSoCommitmentFirstPaymentDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutTpSoCommitmentFirstPaymentDate() {
        return outTpSoCommitmentFirstPaymentDate;
    }

    /**
     * Sets the value of the outTpSoCommitmentFirstPaymentDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutTpSoCommitmentFirstPaymentDate(XMLGregorianCalendar value) {
        this.outTpSoCommitmentFirstPaymentDate = value;
    }

    /**
     * Gets the value of the outTpSoCommitmentFrequency property.
     * 
     */
    public short getOutTpSoCommitmentFrequency() {
        return outTpSoCommitmentFrequency;
    }

    /**
     * Sets the value of the outTpSoCommitmentFrequency property.
     * 
     */
    public void setOutTpSoCommitmentFrequency(short value) {
        this.outTpSoCommitmentFrequency = value;
    }

    /**
     * Gets the value of the outTpSoCommitmentFrequencyUnit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutTpSoCommitmentFrequencyUnit() {
        return outTpSoCommitmentFrequencyUnit;
    }

    /**
     * Sets the value of the outTpSoCommitmentFrequencyUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutTpSoCommitmentFrequencyUnit(String value) {
        this.outTpSoCommitmentFrequencyUnit = value;
    }

    /**
     * Gets the value of the outTpSoCommitmentGeneralComments property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutTpSoCommitmentGeneralComments() {
        return outTpSoCommitmentGeneralComments;
    }

    /**
     * Sets the value of the outTpSoCommitmentGeneralComments property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutTpSoCommitmentGeneralComments(String value) {
        this.outTpSoCommitmentGeneralComments = value;
    }

    /**
     * Gets the value of the outTpSoCommitmentHolidayInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutTpSoCommitmentHolidayInd() {
        return outTpSoCommitmentHolidayInd;
    }

    /**
     * Sets the value of the outTpSoCommitmentHolidayInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutTpSoCommitmentHolidayInd(String value) {
        this.outTpSoCommitmentHolidayInd = value;
    }

    /**
     * Gets the value of the outTpSoCommitmentInsuffChargeCode property.
     * 
     */
    public int getOutTpSoCommitmentInsuffChargeCode() {
        return outTpSoCommitmentInsuffChargeCode;
    }

    /**
     * Sets the value of the outTpSoCommitmentInsuffChargeCode property.
     * 
     */
    public void setOutTpSoCommitmentInsuffChargeCode(int value) {
        this.outTpSoCommitmentInsuffChargeCode = value;
    }

    /**
     * Gets the value of the outTpSoCommitmentInsuffChargeDisc property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutTpSoCommitmentInsuffChargeDisc() {
        return outTpSoCommitmentInsuffChargeDisc;
    }

    /**
     * Sets the value of the outTpSoCommitmentInsuffChargeDisc property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutTpSoCommitmentInsuffChargeDisc(BigDecimal value) {
        this.outTpSoCommitmentInsuffChargeDisc = value;
    }

    /**
     * Gets the value of the outTpSoCommitmentIssueDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutTpSoCommitmentIssueDate() {
        return outTpSoCommitmentIssueDate;
    }

    /**
     * Sets the value of the outTpSoCommitmentIssueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutTpSoCommitmentIssueDate(XMLGregorianCalendar value) {
        this.outTpSoCommitmentIssueDate = value;
    }

    /**
     * Gets the value of the outTpSoCommitmentLastPaymentAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutTpSoCommitmentLastPaymentAmn() {
        return outTpSoCommitmentLastPaymentAmn;
    }

    /**
     * Sets the value of the outTpSoCommitmentLastPaymentAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutTpSoCommitmentLastPaymentAmn(BigDecimal value) {
        this.outTpSoCommitmentLastPaymentAmn = value;
    }

    /**
     * Gets the value of the outTpSoCommitmentLastPaymentDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutTpSoCommitmentLastPaymentDate() {
        return outTpSoCommitmentLastPaymentDate;
    }

    /**
     * Sets the value of the outTpSoCommitmentLastPaymentDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutTpSoCommitmentLastPaymentDate(XMLGregorianCalendar value) {
        this.outTpSoCommitmentLastPaymentDate = value;
    }

    /**
     * Gets the value of the outTpSoCommitmentLastTransferDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutTpSoCommitmentLastTransferDate() {
        return outTpSoCommitmentLastTransferDate;
    }

    /**
     * Sets the value of the outTpSoCommitmentLastTransferDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutTpSoCommitmentLastTransferDate(XMLGregorianCalendar value) {
        this.outTpSoCommitmentLastTransferDate = value;
    }

    /**
     * Gets the value of the outTpSoCommitmentLastUpdateDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutTpSoCommitmentLastUpdateDate() {
        return outTpSoCommitmentLastUpdateDate;
    }

    /**
     * Sets the value of the outTpSoCommitmentLastUpdateDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutTpSoCommitmentLastUpdateDate(XMLGregorianCalendar value) {
        this.outTpSoCommitmentLastUpdateDate = value;
    }

    /**
     * Gets the value of the outTpSoCommitmentMaxNoOfAttempts property.
     * 
     */
    public short getOutTpSoCommitmentMaxNoOfAttempts() {
        return outTpSoCommitmentMaxNoOfAttempts;
    }

    /**
     * Sets the value of the outTpSoCommitmentMaxNoOfAttempts property.
     * 
     */
    public void setOutTpSoCommitmentMaxNoOfAttempts(short value) {
        this.outTpSoCommitmentMaxNoOfAttempts = value;
    }

    /**
     * Gets the value of the outTpSoCommitmentNormalActiveDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutTpSoCommitmentNormalActiveDate() {
        return outTpSoCommitmentNormalActiveDate;
    }

    /**
     * Sets the value of the outTpSoCommitmentNormalActiveDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutTpSoCommitmentNormalActiveDate(XMLGregorianCalendar value) {
        this.outTpSoCommitmentNormalActiveDate = value;
    }

    /**
     * Gets the value of the outTpSoCommitmentOrderIssueJustid property.
     * 
     */
    public int getOutTpSoCommitmentOrderIssueJustid() {
        return outTpSoCommitmentOrderIssueJustid;
    }

    /**
     * Sets the value of the outTpSoCommitmentOrderIssueJustid property.
     * 
     */
    public void setOutTpSoCommitmentOrderIssueJustid(int value) {
        this.outTpSoCommitmentOrderIssueJustid = value;
    }

    /**
     * Gets the value of the outTpSoCommitmentOrderIssueProdid property.
     * 
     */
    public int getOutTpSoCommitmentOrderIssueProdid() {
        return outTpSoCommitmentOrderIssueProdid;
    }

    /**
     * Sets the value of the outTpSoCommitmentOrderIssueProdid property.
     * 
     */
    public void setOutTpSoCommitmentOrderIssueProdid(int value) {
        this.outTpSoCommitmentOrderIssueProdid = value;
    }

    /**
     * Gets the value of the outTpSoCommitmentOrderSendrecInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutTpSoCommitmentOrderSendrecInfo() {
        return outTpSoCommitmentOrderSendrecInfo;
    }

    /**
     * Sets the value of the outTpSoCommitmentOrderSendrecInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutTpSoCommitmentOrderSendrecInfo(String value) {
        this.outTpSoCommitmentOrderSendrecInfo = value;
    }

    /**
     * Gets the value of the outTpSoCommitmentOrderSpecialTerm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutTpSoCommitmentOrderSpecialTerm() {
        return outTpSoCommitmentOrderSpecialTerm;
    }

    /**
     * Sets the value of the outTpSoCommitmentOrderSpecialTerm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutTpSoCommitmentOrderSpecialTerm(String value) {
        this.outTpSoCommitmentOrderSpecialTerm = value;
    }

    /**
     * Gets the value of the outTpSoCommitmentOtherBankAccCd property.
     * 
     */
    public short getOutTpSoCommitmentOtherBankAccCd() {
        return outTpSoCommitmentOtherBankAccCd;
    }

    /**
     * Sets the value of the outTpSoCommitmentOtherBankAccCd property.
     * 
     */
    public void setOutTpSoCommitmentOtherBankAccCd(short value) {
        this.outTpSoCommitmentOtherBankAccCd = value;
    }

    /**
     * Gets the value of the outTpSoCommitmentOtherBankAccNo property.
     * 
     */
    public double getOutTpSoCommitmentOtherBankAccNo() {
        return outTpSoCommitmentOtherBankAccNo;
    }

    /**
     * Sets the value of the outTpSoCommitmentOtherBankAccNo property.
     * 
     */
    public void setOutTpSoCommitmentOtherBankAccNo(double value) {
        this.outTpSoCommitmentOtherBankAccNo = value;
    }

    /**
     * Gets the value of the outTpSoCommitmentOtherBankAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutTpSoCommitmentOtherBankAddress() {
        return outTpSoCommitmentOtherBankAddress;
    }

    /**
     * Sets the value of the outTpSoCommitmentOtherBankAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutTpSoCommitmentOtherBankAddress(String value) {
        this.outTpSoCommitmentOtherBankAddress = value;
    }

    /**
     * Gets the value of the outTpSoCommitmentOtherBankCode property.
     * 
     */
    public int getOutTpSoCommitmentOtherBankCode() {
        return outTpSoCommitmentOtherBankCode;
    }

    /**
     * Sets the value of the outTpSoCommitmentOtherBankCode property.
     * 
     */
    public void setOutTpSoCommitmentOtherBankCode(int value) {
        this.outTpSoCommitmentOtherBankCode = value;
    }

    /**
     * Gets the value of the outTpSoCommitmentOtherBankUnit property.
     * 
     */
    public int getOutTpSoCommitmentOtherBankUnit() {
        return outTpSoCommitmentOtherBankUnit;
    }

    /**
     * Sets the value of the outTpSoCommitmentOtherBankUnit property.
     * 
     */
    public void setOutTpSoCommitmentOtherBankUnit(int value) {
        this.outTpSoCommitmentOtherBankUnit = value;
    }

    /**
     * Gets the value of the outTpSoCommitmentPayeeBank property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutTpSoCommitmentPayeeBank() {
        return outTpSoCommitmentPayeeBank;
    }

    /**
     * Sets the value of the outTpSoCommitmentPayeeBank property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutTpSoCommitmentPayeeBank(String value) {
        this.outTpSoCommitmentPayeeBank = value;
    }

    /**
     * Gets the value of the outTpSoCommitmentPaymentAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutTpSoCommitmentPaymentAmount() {
        return outTpSoCommitmentPaymentAmount;
    }

    /**
     * Sets the value of the outTpSoCommitmentPaymentAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutTpSoCommitmentPaymentAmount(BigDecimal value) {
        this.outTpSoCommitmentPaymentAmount = value;
    }

    /**
     * Gets the value of the outTpSoCommitmentPaymentsCount property.
     * 
     */
    public int getOutTpSoCommitmentPaymentsCount() {
        return outTpSoCommitmentPaymentsCount;
    }

    /**
     * Sets the value of the outTpSoCommitmentPaymentsCount property.
     * 
     */
    public void setOutTpSoCommitmentPaymentsCount(int value) {
        this.outTpSoCommitmentPaymentsCount = value;
    }

    /**
     * Gets the value of the outTpSoCommitmentPoFbCharges property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutTpSoCommitmentPoFbCharges() {
        return outTpSoCommitmentPoFbCharges;
    }

    /**
     * Sets the value of the outTpSoCommitmentPoFbCharges property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutTpSoCommitmentPoFbCharges(String value) {
        this.outTpSoCommitmentPoFbCharges = value;
    }

    /**
     * Gets the value of the outTpSoCommitmentPrivilegedFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutTpSoCommitmentPrivilegedFlag() {
        return outTpSoCommitmentPrivilegedFlag;
    }

    /**
     * Sets the value of the outTpSoCommitmentPrivilegedFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutTpSoCommitmentPrivilegedFlag(String value) {
        this.outTpSoCommitmentPrivilegedFlag = value;
    }

    /**
     * Gets the value of the outTpSoCommitmentSectorCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutTpSoCommitmentSectorCode() {
        return outTpSoCommitmentSectorCode;
    }

    /**
     * Sets the value of the outTpSoCommitmentSectorCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutTpSoCommitmentSectorCode(String value) {
        this.outTpSoCommitmentSectorCode = value;
    }

    /**
     * Gets the value of the outTpSoCommitmentSoCrChargesInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutTpSoCommitmentSoCrChargesInd() {
        return outTpSoCommitmentSoCrChargesInd;
    }

    /**
     * Sets the value of the outTpSoCommitmentSoCrChargesInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutTpSoCommitmentSoCrChargesInd(String value) {
        this.outTpSoCommitmentSoCrChargesInd = value;
    }

    /**
     * Gets the value of the outTpSoCommitmentSoDrChargesInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutTpSoCommitmentSoDrChargesInd() {
        return outTpSoCommitmentSoDrChargesInd;
    }

    /**
     * Sets the value of the outTpSoCommitmentSoDrChargesInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutTpSoCommitmentSoDrChargesInd(String value) {
        this.outTpSoCommitmentSoDrChargesInd = value;
    }

    /**
     * Gets the value of the outTpSoCommitmentSoSwiftStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutTpSoCommitmentSoSwiftStatus() {
        return outTpSoCommitmentSoSwiftStatus;
    }

    /**
     * Sets the value of the outTpSoCommitmentSoSwiftStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutTpSoCommitmentSoSwiftStatus(String value) {
        this.outTpSoCommitmentSoSwiftStatus = value;
    }

    /**
     * Gets the value of the outTpSoCommitmentStandOrderMethod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutTpSoCommitmentStandOrderMethod() {
        return outTpSoCommitmentStandOrderMethod;
    }

    /**
     * Sets the value of the outTpSoCommitmentStandOrderMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutTpSoCommitmentStandOrderMethod(String value) {
        this.outTpSoCommitmentStandOrderMethod = value;
    }

    /**
     * Gets the value of the outTpSoCommitmentSuspensDateFrom property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutTpSoCommitmentSuspensDateFrom() {
        return outTpSoCommitmentSuspensDateFrom;
    }

    /**
     * Sets the value of the outTpSoCommitmentSuspensDateFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutTpSoCommitmentSuspensDateFrom(XMLGregorianCalendar value) {
        this.outTpSoCommitmentSuspensDateFrom = value;
    }

    /**
     * Gets the value of the outTpSoCommitmentSuspensDateTo property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutTpSoCommitmentSuspensDateTo() {
        return outTpSoCommitmentSuspensDateTo;
    }

    /**
     * Sets the value of the outTpSoCommitmentSuspensDateTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutTpSoCommitmentSuspensDateTo(XMLGregorianCalendar value) {
        this.outTpSoCommitmentSuspensDateTo = value;
    }

    /**
     * Gets the value of the outTpSoCommitmentSuspensExecutions property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutTpSoCommitmentSuspensExecutions() {
        return outTpSoCommitmentSuspensExecutions;
    }

    /**
     * Sets the value of the outTpSoCommitmentSuspensExecutions property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutTpSoCommitmentSuspensExecutions(String value) {
        this.outTpSoCommitmentSuspensExecutions = value;
    }

    /**
     * Gets the value of the outTpSoCommitmentTimestmp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutTpSoCommitmentTimestmp() {
        return outTpSoCommitmentTimestmp;
    }

    /**
     * Sets the value of the outTpSoCommitmentTimestmp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutTpSoCommitmentTimestmp(XMLGregorianCalendar value) {
        this.outTpSoCommitmentTimestmp = value;
    }

    /**
     * Gets the value of the outTpSoCommitmentTotalAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutTpSoCommitmentTotalAmount() {
        return outTpSoCommitmentTotalAmount;
    }

    /**
     * Sets the value of the outTpSoCommitmentTotalAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutTpSoCommitmentTotalAmount(BigDecimal value) {
        this.outTpSoCommitmentTotalAmount = value;
    }

    /**
     * Gets the value of the outTpSoCommitmentTotalAvailableTr property.
     * 
     */
    public int getOutTpSoCommitmentTotalAvailableTr() {
        return outTpSoCommitmentTotalAvailableTr;
    }

    /**
     * Sets the value of the outTpSoCommitmentTotalAvailableTr property.
     * 
     */
    public void setOutTpSoCommitmentTotalAvailableTr(int value) {
        this.outTpSoCommitmentTotalAvailableTr = value;
    }

    /**
     * Gets the value of the outTpSoCommitmentTpCrDrIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutTpSoCommitmentTpCrDrIndicator() {
        return outTpSoCommitmentTpCrDrIndicator;
    }

    /**
     * Sets the value of the outTpSoCommitmentTpCrDrIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutTpSoCommitmentTpCrDrIndicator(String value) {
        this.outTpSoCommitmentTpCrDrIndicator = value;
    }

    /**
     * Gets the value of the outTpSoCommitmentTpSoIdentifier property.
     * 
     */
    public double getOutTpSoCommitmentTpSoIdentifier() {
        return outTpSoCommitmentTpSoIdentifier;
    }

    /**
     * Sets the value of the outTpSoCommitmentTpSoIdentifier property.
     * 
     */
    public void setOutTpSoCommitmentTpSoIdentifier(double value) {
        this.outTpSoCommitmentTpSoIdentifier = value;
    }

    /**
     * Gets the value of the outTpSoCommitmentTpSoIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutTpSoCommitmentTpSoIndicator() {
        return outTpSoCommitmentTpSoIndicator;
    }

    /**
     * Sets the value of the outTpSoCommitmentTpSoIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutTpSoCommitmentTpSoIndicator(String value) {
        this.outTpSoCommitmentTpSoIndicator = value;
    }

    /**
     * Gets the value of the outTpSoCommitmentTrxUser property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutTpSoCommitmentTrxUser() {
        return outTpSoCommitmentTrxUser;
    }

    /**
     * Sets the value of the outTpSoCommitmentTrxUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutTpSoCommitmentTrxUser(String value) {
        this.outTpSoCommitmentTrxUser = value;
    }

    /**
     * Gets the value of the outTpSoMandateDbAccount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutTpSoMandateDbAccount() {
        return outTpSoMandateDbAccount;
    }

    /**
     * Sets the value of the outTpSoMandateDbAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutTpSoMandateDbAccount(String value) {
        this.outTpSoMandateDbAccount = value;
    }

    /**
     * Gets the value of the outTpSoMandateDbBank property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutTpSoMandateDbBank() {
        return outTpSoMandateDbBank;
    }

    /**
     * Sets the value of the outTpSoMandateDbBank property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutTpSoMandateDbBank(String value) {
        this.outTpSoMandateDbBank = value;
    }

    /**
     * Gets the value of the outTpSoMandateDbBranch property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutTpSoMandateDbBranch() {
        return outTpSoMandateDbBranch;
    }

    /**
     * Sets the value of the outTpSoMandateDbBranch property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutTpSoMandateDbBranch(String value) {
        this.outTpSoMandateDbBranch = value;
    }

    /**
     * Gets the value of the outTpSoMandateOriginatorReference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutTpSoMandateOriginatorReference() {
        return outTpSoMandateOriginatorReference;
    }

    /**
     * Sets the value of the outTpSoMandateOriginatorReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutTpSoMandateOriginatorReference(String value) {
        this.outTpSoMandateOriginatorReference = value;
    }

    /**
     * Gets the value of the outTpSoMandatePolicyNumber1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutTpSoMandatePolicyNumber1() {
        return outTpSoMandatePolicyNumber1;
    }

    /**
     * Sets the value of the outTpSoMandatePolicyNumber1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutTpSoMandatePolicyNumber1(String value) {
        this.outTpSoMandatePolicyNumber1 = value;
    }

    /**
     * Gets the value of the outTpSoMandatePolicyNumber2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutTpSoMandatePolicyNumber2() {
        return outTpSoMandatePolicyNumber2;
    }

    /**
     * Sets the value of the outTpSoMandatePolicyNumber2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutTpSoMandatePolicyNumber2(String value) {
        this.outTpSoMandatePolicyNumber2 = value;
    }

    /**
     * Gets the value of the outTpSoMandateRemarks property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutTpSoMandateRemarks() {
        return outTpSoMandateRemarks;
    }

    /**
     * Sets the value of the outTpSoMandateRemarks property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutTpSoMandateRemarks(String value) {
        this.outTpSoMandateRemarks = value;
    }

    /**
     * Gets the value of the outTpSoMandateTpSoIdentifier property.
     * 
     */
    public double getOutTpSoMandateTpSoIdentifier() {
        return outTpSoMandateTpSoIdentifier;
    }

    /**
     * Sets the value of the outTpSoMandateTpSoIdentifier property.
     * 
     */
    public void setOutTpSoMandateTpSoIdentifier(double value) {
        this.outTpSoMandateTpSoIdentifier = value;
    }

    /**
     * Gets the value of the outTreasuryGenericDetailDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutTreasuryGenericDetailDescription() {
        return outTreasuryGenericDetailDescription;
    }

    /**
     * Sets the value of the outTreasuryGenericDetailDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutTreasuryGenericDetailDescription(String value) {
        this.outTreasuryGenericDetailDescription = value;
    }

    /**
     * Gets the value of the outTreasuryGenericDetailSerialNum property.
     * 
     */
    public int getOutTreasuryGenericDetailSerialNum() {
        return outTreasuryGenericDetailSerialNum;
    }

    /**
     * Sets the value of the outTreasuryGenericDetailSerialNum property.
     * 
     */
    public void setOutTreasuryGenericDetailSerialNum(int value) {
        this.outTreasuryGenericDetailSerialNum = value;
    }

    /**
     * Gets the value of the outVlOutClientProfitsExitStateWorkActualMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutVlOutClientProfitsExitStateWorkActualMessage() {
        return outVlOutClientProfitsExitStateWorkActualMessage;
    }

    /**
     * Sets the value of the outVlOutClientProfitsExitStateWorkActualMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutVlOutClientProfitsExitStateWorkActualMessage(String value) {
        this.outVlOutClientProfitsExitStateWorkActualMessage = value;
    }

    /**
     * Gets the value of the outVlOutClientProfitsExitStateWorkId property.
     * 
     */
    public double getOutVlOutClientProfitsExitStateWorkId() {
        return outVlOutClientProfitsExitStateWorkId;
    }

    /**
     * Sets the value of the outVlOutClientProfitsExitStateWorkId property.
     * 
     */
    public void setOutVlOutClientProfitsExitStateWorkId(double value) {
        this.outVlOutClientProfitsExitStateWorkId = value;
    }

    /**
     * Gets the value of the outVlOutClientProfitsExitStateWorkLanguage property.
     * 
     */
    public int getOutVlOutClientProfitsExitStateWorkLanguage() {
        return outVlOutClientProfitsExitStateWorkLanguage;
    }

    /**
     * Sets the value of the outVlOutClientProfitsExitStateWorkLanguage property.
     * 
     */
    public void setOutVlOutClientProfitsExitStateWorkLanguage(int value) {
        this.outVlOutClientProfitsExitStateWorkLanguage = value;
    }

    /**
     * Gets the value of the outVlOutClientProfitsExitStateWorkMessageType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutVlOutClientProfitsExitStateWorkMessageType() {
        return outVlOutClientProfitsExitStateWorkMessageType;
    }

    /**
     * Sets the value of the outVlOutClientProfitsExitStateWorkMessageType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutVlOutClientProfitsExitStateWorkMessageType(String value) {
        this.outVlOutClientProfitsExitStateWorkMessageType = value;
    }

    /**
     * Gets the value of the outVlOutClientProfitsExitStateWorkPrftSystem property.
     * 
     */
    public short getOutVlOutClientProfitsExitStateWorkPrftSystem() {
        return outVlOutClientProfitsExitStateWorkPrftSystem;
    }

    /**
     * Sets the value of the outVlOutClientProfitsExitStateWorkPrftSystem property.
     * 
     */
    public void setOutVlOutClientProfitsExitStateWorkPrftSystem(short value) {
        this.outVlOutClientProfitsExitStateWorkPrftSystem = value;
    }

    /**
     * Gets the value of the outVlOutClientProfitsExitStateWorkRoutineSn property.
     * 
     */
    public double getOutVlOutClientProfitsExitStateWorkRoutineSn() {
        return outVlOutClientProfitsExitStateWorkRoutineSn;
    }

    /**
     * Sets the value of the outVlOutClientProfitsExitStateWorkRoutineSn property.
     * 
     */
    public void setOutVlOutClientProfitsExitStateWorkRoutineSn(double value) {
        this.outVlOutClientProfitsExitStateWorkRoutineSn = value;
    }

    /**
     * Gets the value of the outVlOutClientProfitsExitStateWorkTerminationAction property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutVlOutClientProfitsExitStateWorkTerminationAction() {
        return outVlOutClientProfitsExitStateWorkTerminationAction;
    }

    /**
     * Sets the value of the outVlOutClientProfitsExitStateWorkTerminationAction property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutVlOutClientProfitsExitStateWorkTerminationAction(String value) {
        this.outVlOutClientProfitsExitStateWorkTerminationAction = value;
    }

    /**
     * Gets the value of the outVlOutClientProfitsExitStateWorkValruleId property.
     * 
     */
    public double getOutVlOutClientProfitsExitStateWorkValruleId() {
        return outVlOutClientProfitsExitStateWorkValruleId;
    }

    /**
     * Sets the value of the outVlOutClientProfitsExitStateWorkValruleId property.
     * 
     */
    public void setOutVlOutClientProfitsExitStateWorkValruleId(double value) {
        this.outVlOutClientProfitsExitStateWorkValruleId = value;
    }

    /**
     * Gets the value of the outVlOutClientProfitsExitStateWorkValruleSnum property.
     * 
     */
    public int getOutVlOutClientProfitsExitStateWorkValruleSnum() {
        return outVlOutClientProfitsExitStateWorkValruleSnum;
    }

    /**
     * Sets the value of the outVlOutClientProfitsExitStateWorkValruleSnum property.
     * 
     */
    public void setOutVlOutClientProfitsExitStateWorkValruleSnum(int value) {
        this.outVlOutClientProfitsExitStateWorkValruleSnum = value;
    }

    /**
     * Gets the value of the outGrpDays property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfT2102VOutGrpDaysItem }
     *     
     */
    public ArrayOfT2102VOutGrpDaysItem getOutGrpDays() {
        return outGrpDays;
    }

    /**
     * Sets the value of the outGrpDays property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfT2102VOutGrpDaysItem }
     *     
     */
    public void setOutGrpDays(ArrayOfT2102VOutGrpDaysItem value) {
        this.outGrpDays = value;
    }

    /**
     * Gets the value of the outGrpMessageErrors property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfT2102VOutGrpMessageErrorsItem }
     *     
     */
    public ArrayOfT2102VOutGrpMessageErrorsItem getOutGrpMessageErrors() {
        return outGrpMessageErrors;
    }

    /**
     * Sets the value of the outGrpMessageErrors property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfT2102VOutGrpMessageErrorsItem }
     *     
     */
    public void setOutGrpMessageErrors(ArrayOfT2102VOutGrpMessageErrorsItem value) {
        this.outGrpMessageErrors = value;
    }

}
