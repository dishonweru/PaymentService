
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for BillsChequeUploadExport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BillsChequeUploadExport">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}BaseExport">
 *       &lt;sequence>
 *         &lt;element name="OutBillBillSerialNum" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OutBillErrorLogGrpLength" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutBillGroupInRegGrpLength" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutBillInRegGrpLength" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutBillMassRegisterBmasBillanalFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutBillMassRegisterBmasCarrierId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutBillMassRegisterBmasCarrierName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutBillMassRegisterBmasCarrierNotes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutBillMassRegisterBmasCarrierTitle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutBillMassRegisterBmasEntryStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutBillMassRegisterBmasFinalDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutBillMassRegisterBmasInsDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutBillMassRegisterBmasRefNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutBillMassRegisterBmasSerialNum" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OutBillMassRegisterBmasTotbillAmnt" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutBillMassRegisterBmasTotbillCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutBillMassRegisterCommDiscount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutBillMassRegisterExpaccCd" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutBillMassRegisterExpaccInterdate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutBillMassRegisterExpaccNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutBillMassRegisterExpaccPrfsys" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutBillMassRegisterExpDiscount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutBillMassRegisterTmstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutCollaborationBanksBankId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutCollaborationBanksBankName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCollaborationBanksOurBankFlg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCommAmntIefSuppliedGenAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutCustAddressAddress1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustAddressAddress2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustAddressAddressType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustAddressCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustAddressCommunicationAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustAddressEntryStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustAddressFaxNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustAddressLatinInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustAddressRegion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustAddressSerialNum" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutCustAddressTelephone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustAddressTmstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutCustAddressZipCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustomerAlertMsg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustomerCDigit" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutCustomerCustId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutCustomerDateOfBirth" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutCustomerDocExpireDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutCustomerEMail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustomerEmployer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustomerEntryComments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustomerEntryStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustomerExpireDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutCustomerFatherName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustomerFirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustomerMiddleName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustomerMobileTel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustomerMotherName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustomerNonResident" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustomerNonResidentForRep" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustomerShortName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustomerSpouseName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustomerSurname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustomerSwiftAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustomerTelephone1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustomerTelexConnection" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustomerTitle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutDescCpfield1CharSuppliedChar30" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutDescCpfield2CharSuppliedChar30" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutDescCpfield3CharSuppliedChar30" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutDescCpfield4CharSuppliedChar30" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutDescrCpAgreementCpAgreementDescr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutDetailsProfitsAccountCustId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutDetailsProfitsAccountDepOpenUnit" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutDetailsProfitsAccountLnsOpenUnit" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutDetailsProfitsAccountMonotoringUnit" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutDetailsProfitsAccountMovementCurrency" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutDetailsProfitsAccountPrftSystem" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutDetailsProfitsAccountProductId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutExpAmntIefSuppliedGenAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpLength" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutMntRecordingGrpSubscript" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutMntRecordingIdJustific" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutMntRecordingIdProduct" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutMntRecordingTmstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutMntRecordingTrxDetails" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutMntRecordingTrxUsrSn" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutMoreRecordsExistIefSuppliedFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutOtherAfmAfmNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutOtherAfmExpiryDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutOtherAfmIssueDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutOtherAfmMainFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutOtherAfmSerialNo" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutOtherAfmTmstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutOtherIdExpiryDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutOtherIdIdNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutOtherIdIssueAuthority" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutOtherIdIssueDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutOtherIdMainFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutOtherIdSerialNo" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutOtherIdTmstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutOwnbankUnpaidLength" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutProductIdProduct" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutProductProductType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutRegSegmGrpLength" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutResultIefSuppliedFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSelectedProfitsAccountAccountCd" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutSelectedProfitsAccountAccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSelectedProfitsAccountAccStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSelectedProfitsAccountAgrMembershipSn" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutSelectedProfitsAccountAgrSn" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutSelectedProfitsAccountAgrUnit" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutSelectedProfitsAccountAgrYear" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutSelectedProfitsAccountCDigit" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutSelectedProfitsAccountCustId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutSelectedProfitsAccountDepAccNumber" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OutSelectedProfitsAccountDepOpenUnit" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutSelectedProfitsAccountLgAccSn" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OutSelectedProfitsAccountLgOpenUnit" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutSelectedProfitsAccountLimitCurrency" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutSelectedProfitsAccountLnsOpenUnit" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutSelectedProfitsAccountLnsSn" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutSelectedProfitsAccountLnsType" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutSelectedProfitsAccountMonotoringUnit" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutSelectedProfitsAccountMovementCurrency" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutSelectedProfitsAccountPrftSystem" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutSelectedProfitsAccountProductId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutSelectedProfitsAccountTrOpenUnit" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutSelectedProfitsAccountTrSn" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutSelectedProfitsAccountTrType" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutTaxAmntIefSuppliedGenAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutUnitCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutUnitUnitName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutTeamInformationBankDraftNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutTeamInformationWthdrawSpread" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutTeamInformationNotifSpreadDayB" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutTeamInformationNotifSpreadDays" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutTeamInformationWithdrawAmnt" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutTeamInformationRestrictAccFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutTeamInformationStatementIssFreq" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutTeamInformationBeneficiarySn" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutTeamInformationRepresentativeSn" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutTeamInformationAccCd" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutTeamInformationAccSn" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutTeamInformationAccType" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutTeamInformationAccUnitCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutTeamInformationCheqIssueDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutTeamInformationDbInterestPer" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutTeamInformationCrInterestPer" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutTeamInformationAccountPsbSn" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutTeamInformationFromCheqCd" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutTeamInformationToCheqCd" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutTeamInformationBlockTransactExpDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutTeamInformationAccountHomeBranch" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutTeamInformationCrInterestId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutTeamInformationDbInterestId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutTeamInformationAccountCobenefSnMail" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutTeamInformationAccountBenefAddressSn" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutTeamInformationFromCheqItemSerialNum" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OutTeamInformationToCheqItemSerialNum" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OutTeamInformationCheqAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutTeamInformationCheqStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutTeamInformationTeamComments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutTeamInformationDepAccStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutTeamInformationEncroachTolerance" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutTeamInformationProductId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutTeamInformationProductDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutTeamInformationTransactionId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutTeamInformationTransactionDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutTeamInformationJustificationId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutTeamInformationJustificationDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutTeamInformationUnitCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutTeamInformationUserCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutTeamInformationUserSurname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutTeamInformationUserProfile1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutTeamInformationUserProfile2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutTeamInformationUserProfile3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutTeamInformationUserTerminalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutTeamInformationRequiredProfile1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutTeamInformationRequiredProfile2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutTeamInformationAuthorizationType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutTeamInformationAuthorisationType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutTeamInformationSuper1Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutTeamInformationSuper1TerminalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutTeamInformationSuper2Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutTeamInformationSuper2TerminalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutTeamInformationAuthorizationResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutTeamInformationAuthorisationResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutTeamInformationEvaluationResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutTeamInformationCustomerCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutTeamInformationCustomerSurname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutTeamInformationAccountCode" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OutTeamInformationCreditInterestRateSpread" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutTeamInformationDebitInterestRateSpread" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutTeamInformationOverdraftSpread" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutTeamInformationServicePenaltySpread" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutTeamInformationUnclearWithdrawalFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutTeamInformationValueDateSpread" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutTeamInformationAvailableDateSpread" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutTeamInformationCommissionDiscount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutTeamInformationChargeDiscount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutTeamInformationPenaltyDiscount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutTeamInformationTrsAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutTeamInformationOverdraftAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutTeamInformationInterestRate" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutTeamInformationPenaltyRate" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutTeamInformationLoanStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutBillErrorLogGrp" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}ArrayOfOutBillErrorLogGrp" minOccurs="0"/>
 *         &lt;element name="OutBillGroupInRegGrp" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}ArrayOfOutBillGroupInRegGrp" minOccurs="0"/>
 *         &lt;element name="OutBillInRegGrp" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}ArrayOfOutBillInRegGrp" minOccurs="0"/>
 *         &lt;element name="OutGrp" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}ArrayOfOutGrp" minOccurs="0"/>
 *         &lt;element name="OutOwnbankUnpaid" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}ArrayOfOutOwnbankUnpaid" minOccurs="0"/>
 *         &lt;element name="OutRegSegmGrp" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}ArrayOfOutRegSegmGrp" minOccurs="0"/>
 *         &lt;element name="OutBillMassRegisterBmasRegCcy" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutCurrencyIdCurrency" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutCurrencyShortDescr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCurrencyDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCurrencyIsoCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutTargetAmountIefSuppliedTargetAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutRateIefSuppliedRate" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutDomesticCurrencyIdCurrency" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BillsChequeUploadExport", propOrder = {
    "outBillBillSerialNum",
    "outBillErrorLogGrpLength",
    "outBillGroupInRegGrpLength",
    "outBillInRegGrpLength",
    "outBillMassRegisterBmasBillanalFlag",
    "outBillMassRegisterBmasCarrierId",
    "outBillMassRegisterBmasCarrierName",
    "outBillMassRegisterBmasCarrierNotes",
    "outBillMassRegisterBmasCarrierTitle",
    "outBillMassRegisterBmasEntryStatus",
    "outBillMassRegisterBmasFinalDate",
    "outBillMassRegisterBmasInsDate",
    "outBillMassRegisterBmasRefNo",
    "outBillMassRegisterBmasSerialNum",
    "outBillMassRegisterBmasTotbillAmnt",
    "outBillMassRegisterBmasTotbillCount",
    "outBillMassRegisterCommDiscount",
    "outBillMassRegisterExpaccCd",
    "outBillMassRegisterExpaccInterdate",
    "outBillMassRegisterExpaccNumber",
    "outBillMassRegisterExpaccPrfsys",
    "outBillMassRegisterExpDiscount",
    "outBillMassRegisterTmstamp",
    "outCollaborationBanksBankId",
    "outCollaborationBanksBankName",
    "outCollaborationBanksOurBankFlg",
    "outCommAmntIefSuppliedGenAmount",
    "outCustAddressAddress1",
    "outCustAddressAddress2",
    "outCustAddressAddressType",
    "outCustAddressCity",
    "outCustAddressCommunicationAddress",
    "outCustAddressEntryStatus",
    "outCustAddressFaxNo",
    "outCustAddressLatinInd",
    "outCustAddressRegion",
    "outCustAddressSerialNum",
    "outCustAddressTelephone",
    "outCustAddressTmstamp",
    "outCustAddressZipCode",
    "outCustomerAlertMsg",
    "outCustomerCDigit",
    "outCustomerCustId",
    "outCustomerDateOfBirth",
    "outCustomerDocExpireDate",
    "outCustomerEMail",
    "outCustomerEmployer",
    "outCustomerEntryComments",
    "outCustomerEntryStatus",
    "outCustomerExpireDate",
    "outCustomerFatherName",
    "outCustomerFirstName",
    "outCustomerMiddleName",
    "outCustomerMobileTel",
    "outCustomerMotherName",
    "outCustomerNonResident",
    "outCustomerNonResidentForRep",
    "outCustomerShortName",
    "outCustomerSpouseName",
    "outCustomerSurname",
    "outCustomerSwiftAddress",
    "outCustomerTelephone1",
    "outCustomerTelexConnection",
    "outCustomerTitle",
    "outDescCpfield1CharSuppliedChar30",
    "outDescCpfield2CharSuppliedChar30",
    "outDescCpfield3CharSuppliedChar30",
    "outDescCpfield4CharSuppliedChar30",
    "outDescrCpAgreementCpAgreementDescr",
    "outDetailsProfitsAccountCustId",
    "outDetailsProfitsAccountDepOpenUnit",
    "outDetailsProfitsAccountLnsOpenUnit",
    "outDetailsProfitsAccountMonotoringUnit",
    "outDetailsProfitsAccountMovementCurrency",
    "outDetailsProfitsAccountPrftSystem",
    "outDetailsProfitsAccountProductId",
    "outExpAmntIefSuppliedGenAmount",
    "outGrpLength",
    "outMntRecordingGrpSubscript",
    "outMntRecordingIdJustific",
    "outMntRecordingIdProduct",
    "outMntRecordingTmstamp",
    "outMntRecordingTrxDetails",
    "outMntRecordingTrxUsrSn",
    "outMoreRecordsExistIefSuppliedFlag",
    "outOtherAfmAfmNo",
    "outOtherAfmExpiryDate",
    "outOtherAfmIssueDate",
    "outOtherAfmMainFlag",
    "outOtherAfmSerialNo",
    "outOtherAfmTmstamp",
    "outOtherIdExpiryDate",
    "outOtherIdIdNo",
    "outOtherIdIssueAuthority",
    "outOtherIdIssueDate",
    "outOtherIdMainFlag",
    "outOtherIdSerialNo",
    "outOtherIdTmstamp",
    "outOwnbankUnpaidLength",
    "outProductIdProduct",
    "outProductProductType",
    "outRegSegmGrpLength",
    "outResultIefSuppliedFlag",
    "outSelectedProfitsAccountAccountCd",
    "outSelectedProfitsAccountAccountNumber",
    "outSelectedProfitsAccountAccStatus",
    "outSelectedProfitsAccountAgrMembershipSn",
    "outSelectedProfitsAccountAgrSn",
    "outSelectedProfitsAccountAgrUnit",
    "outSelectedProfitsAccountAgrYear",
    "outSelectedProfitsAccountCDigit",
    "outSelectedProfitsAccountCustId",
    "outSelectedProfitsAccountDepAccNumber",
    "outSelectedProfitsAccountDepOpenUnit",
    "outSelectedProfitsAccountLgAccSn",
    "outSelectedProfitsAccountLgOpenUnit",
    "outSelectedProfitsAccountLimitCurrency",
    "outSelectedProfitsAccountLnsOpenUnit",
    "outSelectedProfitsAccountLnsSn",
    "outSelectedProfitsAccountLnsType",
    "outSelectedProfitsAccountMonotoringUnit",
    "outSelectedProfitsAccountMovementCurrency",
    "outSelectedProfitsAccountPrftSystem",
    "outSelectedProfitsAccountProductId",
    "outSelectedProfitsAccountTrOpenUnit",
    "outSelectedProfitsAccountTrSn",
    "outSelectedProfitsAccountTrType",
    "outTaxAmntIefSuppliedGenAmount",
    "outUnitCode",
    "outUnitUnitName",
    "outTeamInformationBankDraftNo",
    "outTeamInformationWthdrawSpread",
    "outTeamInformationNotifSpreadDayB",
    "outTeamInformationNotifSpreadDays",
    "outTeamInformationWithdrawAmnt",
    "outTeamInformationRestrictAccFlag",
    "outTeamInformationStatementIssFreq",
    "outTeamInformationBeneficiarySn",
    "outTeamInformationRepresentativeSn",
    "outTeamInformationAccCd",
    "outTeamInformationAccSn",
    "outTeamInformationAccType",
    "outTeamInformationAccUnitCode",
    "outTeamInformationCheqIssueDate",
    "outTeamInformationDbInterestPer",
    "outTeamInformationCrInterestPer",
    "outTeamInformationAccountPsbSn",
    "outTeamInformationFromCheqCd",
    "outTeamInformationToCheqCd",
    "outTeamInformationBlockTransactExpDate",
    "outTeamInformationAccountHomeBranch",
    "outTeamInformationCrInterestId",
    "outTeamInformationDbInterestId",
    "outTeamInformationAccountCobenefSnMail",
    "outTeamInformationAccountBenefAddressSn",
    "outTeamInformationFromCheqItemSerialNum",
    "outTeamInformationToCheqItemSerialNum",
    "outTeamInformationCheqAmount",
    "outTeamInformationCheqStatus",
    "outTeamInformationTeamComments",
    "outTeamInformationDepAccStatus",
    "outTeamInformationEncroachTolerance",
    "outTeamInformationProductId",
    "outTeamInformationProductDescription",
    "outTeamInformationTransactionId",
    "outTeamInformationTransactionDescription",
    "outTeamInformationJustificationId",
    "outTeamInformationJustificationDescription",
    "outTeamInformationUnitCode",
    "outTeamInformationUserCode",
    "outTeamInformationUserSurname",
    "outTeamInformationUserProfile1",
    "outTeamInformationUserProfile2",
    "outTeamInformationUserProfile3",
    "outTeamInformationUserTerminalId",
    "outTeamInformationRequiredProfile1",
    "outTeamInformationRequiredProfile2",
    "outTeamInformationAuthorizationType",
    "outTeamInformationAuthorisationType",
    "outTeamInformationSuper1Code",
    "outTeamInformationSuper1TerminalId",
    "outTeamInformationSuper2Code",
    "outTeamInformationSuper2TerminalId",
    "outTeamInformationAuthorizationResult",
    "outTeamInformationAuthorisationResult",
    "outTeamInformationEvaluationResult",
    "outTeamInformationCustomerCode",
    "outTeamInformationCustomerSurname",
    "outTeamInformationAccountCode",
    "outTeamInformationCreditInterestRateSpread",
    "outTeamInformationDebitInterestRateSpread",
    "outTeamInformationOverdraftSpread",
    "outTeamInformationServicePenaltySpread",
    "outTeamInformationUnclearWithdrawalFlag",
    "outTeamInformationValueDateSpread",
    "outTeamInformationAvailableDateSpread",
    "outTeamInformationCommissionDiscount",
    "outTeamInformationChargeDiscount",
    "outTeamInformationPenaltyDiscount",
    "outTeamInformationTrsAmount",
    "outTeamInformationOverdraftAmount",
    "outTeamInformationInterestRate",
    "outTeamInformationPenaltyRate",
    "outTeamInformationLoanStatus",
    "outBillErrorLogGrp",
    "outBillGroupInRegGrp",
    "outBillInRegGrp",
    "outGrp",
    "outOwnbankUnpaid",
    "outRegSegmGrp",
    "outBillMassRegisterBmasRegCcy",
    "outCurrencyIdCurrency",
    "outCurrencyShortDescr",
    "outCurrencyDescription",
    "outCurrencyIsoCode",
    "outTargetAmountIefSuppliedTargetAmount",
    "outRateIefSuppliedRate",
    "outDomesticCurrencyIdCurrency"
})
public class BillsChequeUploadExport
    extends BaseExport
{

    @XmlElement(name = "OutBillBillSerialNum")
    protected double outBillBillSerialNum;
    @XmlElement(name = "OutBillErrorLogGrpLength")
    protected int outBillErrorLogGrpLength;
    @XmlElement(name = "OutBillGroupInRegGrpLength")
    protected int outBillGroupInRegGrpLength;
    @XmlElement(name = "OutBillInRegGrpLength")
    protected int outBillInRegGrpLength;
    @XmlElement(name = "OutBillMassRegisterBmasBillanalFlag")
    protected String outBillMassRegisterBmasBillanalFlag;
    @XmlElement(name = "OutBillMassRegisterBmasCarrierId")
    protected String outBillMassRegisterBmasCarrierId;
    @XmlElement(name = "OutBillMassRegisterBmasCarrierName")
    protected String outBillMassRegisterBmasCarrierName;
    @XmlElement(name = "OutBillMassRegisterBmasCarrierNotes")
    protected String outBillMassRegisterBmasCarrierNotes;
    @XmlElement(name = "OutBillMassRegisterBmasCarrierTitle")
    protected String outBillMassRegisterBmasCarrierTitle;
    @XmlElement(name = "OutBillMassRegisterBmasEntryStatus")
    protected String outBillMassRegisterBmasEntryStatus;
    @XmlElement(name = "OutBillMassRegisterBmasFinalDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outBillMassRegisterBmasFinalDate;
    @XmlElement(name = "OutBillMassRegisterBmasInsDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outBillMassRegisterBmasInsDate;
    @XmlElement(name = "OutBillMassRegisterBmasRefNo")
    protected String outBillMassRegisterBmasRefNo;
    @XmlElement(name = "OutBillMassRegisterBmasSerialNum")
    protected double outBillMassRegisterBmasSerialNum;
    @XmlElement(name = "OutBillMassRegisterBmasTotbillAmnt", required = true)
    protected BigDecimal outBillMassRegisterBmasTotbillAmnt;
    @XmlElement(name = "OutBillMassRegisterBmasTotbillCount")
    protected int outBillMassRegisterBmasTotbillCount;
    @XmlElement(name = "OutBillMassRegisterCommDiscount", required = true)
    protected BigDecimal outBillMassRegisterCommDiscount;
    @XmlElement(name = "OutBillMassRegisterExpaccCd")
    protected short outBillMassRegisterExpaccCd;
    @XmlElement(name = "OutBillMassRegisterExpaccInterdate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outBillMassRegisterExpaccInterdate;
    @XmlElement(name = "OutBillMassRegisterExpaccNumber")
    protected String outBillMassRegisterExpaccNumber;
    @XmlElement(name = "OutBillMassRegisterExpaccPrfsys")
    protected short outBillMassRegisterExpaccPrfsys;
    @XmlElement(name = "OutBillMassRegisterExpDiscount", required = true)
    protected BigDecimal outBillMassRegisterExpDiscount;
    @XmlElement(name = "OutBillMassRegisterTmstamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outBillMassRegisterTmstamp;
    @XmlElement(name = "OutCollaborationBanksBankId")
    protected int outCollaborationBanksBankId;
    @XmlElement(name = "OutCollaborationBanksBankName")
    protected String outCollaborationBanksBankName;
    @XmlElement(name = "OutCollaborationBanksOurBankFlg")
    protected String outCollaborationBanksOurBankFlg;
    @XmlElement(name = "OutCommAmntIefSuppliedGenAmount", required = true)
    protected BigDecimal outCommAmntIefSuppliedGenAmount;
    @XmlElement(name = "OutCustAddressAddress1")
    protected String outCustAddressAddress1;
    @XmlElement(name = "OutCustAddressAddress2")
    protected String outCustAddressAddress2;
    @XmlElement(name = "OutCustAddressAddressType")
    protected String outCustAddressAddressType;
    @XmlElement(name = "OutCustAddressCity")
    protected String outCustAddressCity;
    @XmlElement(name = "OutCustAddressCommunicationAddress")
    protected String outCustAddressCommunicationAddress;
    @XmlElement(name = "OutCustAddressEntryStatus")
    protected String outCustAddressEntryStatus;
    @XmlElement(name = "OutCustAddressFaxNo")
    protected String outCustAddressFaxNo;
    @XmlElement(name = "OutCustAddressLatinInd")
    protected String outCustAddressLatinInd;
    @XmlElement(name = "OutCustAddressRegion")
    protected String outCustAddressRegion;
    @XmlElement(name = "OutCustAddressSerialNum")
    protected short outCustAddressSerialNum;
    @XmlElement(name = "OutCustAddressTelephone")
    protected String outCustAddressTelephone;
    @XmlElement(name = "OutCustAddressTmstamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outCustAddressTmstamp;
    @XmlElement(name = "OutCustAddressZipCode")
    protected String outCustAddressZipCode;
    @XmlElement(name = "OutCustomerAlertMsg")
    protected String outCustomerAlertMsg;
    @XmlElement(name = "OutCustomerCDigit")
    protected short outCustomerCDigit;
    @XmlElement(name = "OutCustomerCustId")
    protected int outCustomerCustId;
    @XmlElement(name = "OutCustomerDateOfBirth", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outCustomerDateOfBirth;
    @XmlElement(name = "OutCustomerDocExpireDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outCustomerDocExpireDate;
    @XmlElement(name = "OutCustomerEMail")
    protected String outCustomerEMail;
    @XmlElement(name = "OutCustomerEmployer")
    protected String outCustomerEmployer;
    @XmlElement(name = "OutCustomerEntryComments")
    protected String outCustomerEntryComments;
    @XmlElement(name = "OutCustomerEntryStatus")
    protected String outCustomerEntryStatus;
    @XmlElement(name = "OutCustomerExpireDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outCustomerExpireDate;
    @XmlElement(name = "OutCustomerFatherName")
    protected String outCustomerFatherName;
    @XmlElement(name = "OutCustomerFirstName")
    protected String outCustomerFirstName;
    @XmlElement(name = "OutCustomerMiddleName")
    protected String outCustomerMiddleName;
    @XmlElement(name = "OutCustomerMobileTel")
    protected String outCustomerMobileTel;
    @XmlElement(name = "OutCustomerMotherName")
    protected String outCustomerMotherName;
    @XmlElement(name = "OutCustomerNonResident")
    protected String outCustomerNonResident;
    @XmlElement(name = "OutCustomerNonResidentForRep")
    protected String outCustomerNonResidentForRep;
    @XmlElement(name = "OutCustomerShortName")
    protected String outCustomerShortName;
    @XmlElement(name = "OutCustomerSpouseName")
    protected String outCustomerSpouseName;
    @XmlElement(name = "OutCustomerSurname")
    protected String outCustomerSurname;
    @XmlElement(name = "OutCustomerSwiftAddress")
    protected String outCustomerSwiftAddress;
    @XmlElement(name = "OutCustomerTelephone1")
    protected String outCustomerTelephone1;
    @XmlElement(name = "OutCustomerTelexConnection")
    protected String outCustomerTelexConnection;
    @XmlElement(name = "OutCustomerTitle")
    protected String outCustomerTitle;
    @XmlElement(name = "OutDescCpfield1CharSuppliedChar30")
    protected String outDescCpfield1CharSuppliedChar30;
    @XmlElement(name = "OutDescCpfield2CharSuppliedChar30")
    protected String outDescCpfield2CharSuppliedChar30;
    @XmlElement(name = "OutDescCpfield3CharSuppliedChar30")
    protected String outDescCpfield3CharSuppliedChar30;
    @XmlElement(name = "OutDescCpfield4CharSuppliedChar30")
    protected String outDescCpfield4CharSuppliedChar30;
    @XmlElement(name = "OutDescrCpAgreementCpAgreementDescr")
    protected String outDescrCpAgreementCpAgreementDescr;
    @XmlElement(name = "OutDetailsProfitsAccountCustId")
    protected int outDetailsProfitsAccountCustId;
    @XmlElement(name = "OutDetailsProfitsAccountDepOpenUnit")
    protected int outDetailsProfitsAccountDepOpenUnit;
    @XmlElement(name = "OutDetailsProfitsAccountLnsOpenUnit")
    protected int outDetailsProfitsAccountLnsOpenUnit;
    @XmlElement(name = "OutDetailsProfitsAccountMonotoringUnit")
    protected int outDetailsProfitsAccountMonotoringUnit;
    @XmlElement(name = "OutDetailsProfitsAccountMovementCurrency")
    protected int outDetailsProfitsAccountMovementCurrency;
    @XmlElement(name = "OutDetailsProfitsAccountPrftSystem")
    protected short outDetailsProfitsAccountPrftSystem;
    @XmlElement(name = "OutDetailsProfitsAccountProductId")
    protected int outDetailsProfitsAccountProductId;
    @XmlElement(name = "OutExpAmntIefSuppliedGenAmount", required = true)
    protected BigDecimal outExpAmntIefSuppliedGenAmount;
    @XmlElement(name = "OutGrpLength")
    protected int outGrpLength;
    @XmlElement(name = "OutMntRecordingGrpSubscript")
    protected short outMntRecordingGrpSubscript;
    @XmlElement(name = "OutMntRecordingIdJustific")
    protected int outMntRecordingIdJustific;
    @XmlElement(name = "OutMntRecordingIdProduct")
    protected int outMntRecordingIdProduct;
    @XmlElement(name = "OutMntRecordingTmstamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outMntRecordingTmstamp;
    @XmlElement(name = "OutMntRecordingTrxDetails")
    protected String outMntRecordingTrxDetails;
    @XmlElement(name = "OutMntRecordingTrxUsrSn")
    protected int outMntRecordingTrxUsrSn;
    @XmlElement(name = "OutMoreRecordsExistIefSuppliedFlag")
    protected String outMoreRecordsExistIefSuppliedFlag;
    @XmlElement(name = "OutOtherAfmAfmNo")
    protected String outOtherAfmAfmNo;
    @XmlElement(name = "OutOtherAfmExpiryDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outOtherAfmExpiryDate;
    @XmlElement(name = "OutOtherAfmIssueDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outOtherAfmIssueDate;
    @XmlElement(name = "OutOtherAfmMainFlag")
    protected String outOtherAfmMainFlag;
    @XmlElement(name = "OutOtherAfmSerialNo")
    protected short outOtherAfmSerialNo;
    @XmlElement(name = "OutOtherAfmTmstamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outOtherAfmTmstamp;
    @XmlElement(name = "OutOtherIdExpiryDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outOtherIdExpiryDate;
    @XmlElement(name = "OutOtherIdIdNo")
    protected String outOtherIdIdNo;
    @XmlElement(name = "OutOtherIdIssueAuthority")
    protected String outOtherIdIssueAuthority;
    @XmlElement(name = "OutOtherIdIssueDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outOtherIdIssueDate;
    @XmlElement(name = "OutOtherIdMainFlag")
    protected String outOtherIdMainFlag;
    @XmlElement(name = "OutOtherIdSerialNo")
    protected short outOtherIdSerialNo;
    @XmlElement(name = "OutOtherIdTmstamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outOtherIdTmstamp;
    @XmlElement(name = "OutOwnbankUnpaidLength")
    protected int outOwnbankUnpaidLength;
    @XmlElement(name = "OutProductIdProduct")
    protected int outProductIdProduct;
    @XmlElement(name = "OutProductProductType")
    protected String outProductProductType;
    @XmlElement(name = "OutRegSegmGrpLength")
    protected int outRegSegmGrpLength;
    @XmlElement(name = "OutResultIefSuppliedFlag")
    protected String outResultIefSuppliedFlag;
    @XmlElement(name = "OutSelectedProfitsAccountAccountCd")
    protected short outSelectedProfitsAccountAccountCd;
    @XmlElement(name = "OutSelectedProfitsAccountAccountNumber")
    protected String outSelectedProfitsAccountAccountNumber;
    @XmlElement(name = "OutSelectedProfitsAccountAccStatus")
    protected String outSelectedProfitsAccountAccStatus;
    @XmlElement(name = "OutSelectedProfitsAccountAgrMembershipSn")
    protected int outSelectedProfitsAccountAgrMembershipSn;
    @XmlElement(name = "OutSelectedProfitsAccountAgrSn")
    protected int outSelectedProfitsAccountAgrSn;
    @XmlElement(name = "OutSelectedProfitsAccountAgrUnit")
    protected int outSelectedProfitsAccountAgrUnit;
    @XmlElement(name = "OutSelectedProfitsAccountAgrYear")
    protected short outSelectedProfitsAccountAgrYear;
    @XmlElement(name = "OutSelectedProfitsAccountCDigit")
    protected short outSelectedProfitsAccountCDigit;
    @XmlElement(name = "OutSelectedProfitsAccountCustId")
    protected int outSelectedProfitsAccountCustId;
    @XmlElement(name = "OutSelectedProfitsAccountDepAccNumber")
    protected double outSelectedProfitsAccountDepAccNumber;
    @XmlElement(name = "OutSelectedProfitsAccountDepOpenUnit")
    protected int outSelectedProfitsAccountDepOpenUnit;
    @XmlElement(name = "OutSelectedProfitsAccountLgAccSn")
    protected double outSelectedProfitsAccountLgAccSn;
    @XmlElement(name = "OutSelectedProfitsAccountLgOpenUnit")
    protected int outSelectedProfitsAccountLgOpenUnit;
    @XmlElement(name = "OutSelectedProfitsAccountLimitCurrency")
    protected int outSelectedProfitsAccountLimitCurrency;
    @XmlElement(name = "OutSelectedProfitsAccountLnsOpenUnit")
    protected int outSelectedProfitsAccountLnsOpenUnit;
    @XmlElement(name = "OutSelectedProfitsAccountLnsSn")
    protected int outSelectedProfitsAccountLnsSn;
    @XmlElement(name = "OutSelectedProfitsAccountLnsType")
    protected short outSelectedProfitsAccountLnsType;
    @XmlElement(name = "OutSelectedProfitsAccountMonotoringUnit")
    protected int outSelectedProfitsAccountMonotoringUnit;
    @XmlElement(name = "OutSelectedProfitsAccountMovementCurrency")
    protected int outSelectedProfitsAccountMovementCurrency;
    @XmlElement(name = "OutSelectedProfitsAccountPrftSystem")
    protected short outSelectedProfitsAccountPrftSystem;
    @XmlElement(name = "OutSelectedProfitsAccountProductId")
    protected int outSelectedProfitsAccountProductId;
    @XmlElement(name = "OutSelectedProfitsAccountTrOpenUnit")
    protected int outSelectedProfitsAccountTrOpenUnit;
    @XmlElement(name = "OutSelectedProfitsAccountTrSn")
    protected int outSelectedProfitsAccountTrSn;
    @XmlElement(name = "OutSelectedProfitsAccountTrType")
    protected short outSelectedProfitsAccountTrType;
    @XmlElement(name = "OutTaxAmntIefSuppliedGenAmount", required = true)
    protected BigDecimal outTaxAmntIefSuppliedGenAmount;
    @XmlElement(name = "OutUnitCode")
    protected int outUnitCode;
    @XmlElement(name = "OutUnitUnitName")
    protected String outUnitUnitName;
    @XmlElement(name = "OutTeamInformationBankDraftNo")
    protected String outTeamInformationBankDraftNo;
    @XmlElement(name = "OutTeamInformationWthdrawSpread")
    protected short outTeamInformationWthdrawSpread;
    @XmlElement(name = "OutTeamInformationNotifSpreadDayB")
    protected short outTeamInformationNotifSpreadDayB;
    @XmlElement(name = "OutTeamInformationNotifSpreadDays")
    protected short outTeamInformationNotifSpreadDays;
    @XmlElement(name = "OutTeamInformationWithdrawAmnt", required = true)
    protected BigDecimal outTeamInformationWithdrawAmnt;
    @XmlElement(name = "OutTeamInformationRestrictAccFlag")
    protected String outTeamInformationRestrictAccFlag;
    @XmlElement(name = "OutTeamInformationStatementIssFreq")
    protected String outTeamInformationStatementIssFreq;
    @XmlElement(name = "OutTeamInformationBeneficiarySn")
    protected short outTeamInformationBeneficiarySn;
    @XmlElement(name = "OutTeamInformationRepresentativeSn")
    protected short outTeamInformationRepresentativeSn;
    @XmlElement(name = "OutTeamInformationAccCd")
    protected short outTeamInformationAccCd;
    @XmlElement(name = "OutTeamInformationAccSn")
    protected int outTeamInformationAccSn;
    @XmlElement(name = "OutTeamInformationAccType")
    protected short outTeamInformationAccType;
    @XmlElement(name = "OutTeamInformationAccUnitCode")
    protected int outTeamInformationAccUnitCode;
    @XmlElement(name = "OutTeamInformationCheqIssueDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outTeamInformationCheqIssueDate;
    @XmlElement(name = "OutTeamInformationDbInterestPer", required = true)
    protected BigDecimal outTeamInformationDbInterestPer;
    @XmlElement(name = "OutTeamInformationCrInterestPer", required = true)
    protected BigDecimal outTeamInformationCrInterestPer;
    @XmlElement(name = "OutTeamInformationAccountPsbSn")
    protected int outTeamInformationAccountPsbSn;
    @XmlElement(name = "OutTeamInformationFromCheqCd")
    protected short outTeamInformationFromCheqCd;
    @XmlElement(name = "OutTeamInformationToCheqCd")
    protected short outTeamInformationToCheqCd;
    @XmlElement(name = "OutTeamInformationBlockTransactExpDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outTeamInformationBlockTransactExpDate;
    @XmlElement(name = "OutTeamInformationAccountHomeBranch")
    protected String outTeamInformationAccountHomeBranch;
    @XmlElement(name = "OutTeamInformationCrInterestId")
    protected int outTeamInformationCrInterestId;
    @XmlElement(name = "OutTeamInformationDbInterestId")
    protected int outTeamInformationDbInterestId;
    @XmlElement(name = "OutTeamInformationAccountCobenefSnMail")
    protected short outTeamInformationAccountCobenefSnMail;
    @XmlElement(name = "OutTeamInformationAccountBenefAddressSn")
    protected short outTeamInformationAccountBenefAddressSn;
    @XmlElement(name = "OutTeamInformationFromCheqItemSerialNum")
    protected double outTeamInformationFromCheqItemSerialNum;
    @XmlElement(name = "OutTeamInformationToCheqItemSerialNum")
    protected double outTeamInformationToCheqItemSerialNum;
    @XmlElement(name = "OutTeamInformationCheqAmount", required = true)
    protected BigDecimal outTeamInformationCheqAmount;
    @XmlElement(name = "OutTeamInformationCheqStatus")
    protected String outTeamInformationCheqStatus;
    @XmlElement(name = "OutTeamInformationTeamComments")
    protected String outTeamInformationTeamComments;
    @XmlElement(name = "OutTeamInformationDepAccStatus")
    protected String outTeamInformationDepAccStatus;
    @XmlElement(name = "OutTeamInformationEncroachTolerance", required = true)
    protected BigDecimal outTeamInformationEncroachTolerance;
    @XmlElement(name = "OutTeamInformationProductId")
    protected int outTeamInformationProductId;
    @XmlElement(name = "OutTeamInformationProductDescription")
    protected String outTeamInformationProductDescription;
    @XmlElement(name = "OutTeamInformationTransactionId")
    protected int outTeamInformationTransactionId;
    @XmlElement(name = "OutTeamInformationTransactionDescription")
    protected String outTeamInformationTransactionDescription;
    @XmlElement(name = "OutTeamInformationJustificationId")
    protected int outTeamInformationJustificationId;
    @XmlElement(name = "OutTeamInformationJustificationDescription")
    protected String outTeamInformationJustificationDescription;
    @XmlElement(name = "OutTeamInformationUnitCode")
    protected int outTeamInformationUnitCode;
    @XmlElement(name = "OutTeamInformationUserCode")
    protected String outTeamInformationUserCode;
    @XmlElement(name = "OutTeamInformationUserSurname")
    protected String outTeamInformationUserSurname;
    @XmlElement(name = "OutTeamInformationUserProfile1")
    protected String outTeamInformationUserProfile1;
    @XmlElement(name = "OutTeamInformationUserProfile2")
    protected String outTeamInformationUserProfile2;
    @XmlElement(name = "OutTeamInformationUserProfile3")
    protected String outTeamInformationUserProfile3;
    @XmlElement(name = "OutTeamInformationUserTerminalId")
    protected String outTeamInformationUserTerminalId;
    @XmlElement(name = "OutTeamInformationRequiredProfile1")
    protected String outTeamInformationRequiredProfile1;
    @XmlElement(name = "OutTeamInformationRequiredProfile2")
    protected String outTeamInformationRequiredProfile2;
    @XmlElement(name = "OutTeamInformationAuthorizationType")
    protected String outTeamInformationAuthorizationType;
    @XmlElement(name = "OutTeamInformationAuthorisationType")
    protected String outTeamInformationAuthorisationType;
    @XmlElement(name = "OutTeamInformationSuper1Code")
    protected String outTeamInformationSuper1Code;
    @XmlElement(name = "OutTeamInformationSuper1TerminalId")
    protected String outTeamInformationSuper1TerminalId;
    @XmlElement(name = "OutTeamInformationSuper2Code")
    protected String outTeamInformationSuper2Code;
    @XmlElement(name = "OutTeamInformationSuper2TerminalId")
    protected String outTeamInformationSuper2TerminalId;
    @XmlElement(name = "OutTeamInformationAuthorizationResult")
    protected String outTeamInformationAuthorizationResult;
    @XmlElement(name = "OutTeamInformationAuthorisationResult")
    protected String outTeamInformationAuthorisationResult;
    @XmlElement(name = "OutTeamInformationEvaluationResult")
    protected String outTeamInformationEvaluationResult;
    @XmlElement(name = "OutTeamInformationCustomerCode")
    protected int outTeamInformationCustomerCode;
    @XmlElement(name = "OutTeamInformationCustomerSurname")
    protected String outTeamInformationCustomerSurname;
    @XmlElement(name = "OutTeamInformationAccountCode")
    protected double outTeamInformationAccountCode;
    @XmlElement(name = "OutTeamInformationCreditInterestRateSpread", required = true)
    protected BigDecimal outTeamInformationCreditInterestRateSpread;
    @XmlElement(name = "OutTeamInformationDebitInterestRateSpread", required = true)
    protected BigDecimal outTeamInformationDebitInterestRateSpread;
    @XmlElement(name = "OutTeamInformationOverdraftSpread", required = true)
    protected BigDecimal outTeamInformationOverdraftSpread;
    @XmlElement(name = "OutTeamInformationServicePenaltySpread", required = true)
    protected BigDecimal outTeamInformationServicePenaltySpread;
    @XmlElement(name = "OutTeamInformationUnclearWithdrawalFlag")
    protected String outTeamInformationUnclearWithdrawalFlag;
    @XmlElement(name = "OutTeamInformationValueDateSpread")
    protected short outTeamInformationValueDateSpread;
    @XmlElement(name = "OutTeamInformationAvailableDateSpread")
    protected short outTeamInformationAvailableDateSpread;
    @XmlElement(name = "OutTeamInformationCommissionDiscount", required = true)
    protected BigDecimal outTeamInformationCommissionDiscount;
    @XmlElement(name = "OutTeamInformationChargeDiscount", required = true)
    protected BigDecimal outTeamInformationChargeDiscount;
    @XmlElement(name = "OutTeamInformationPenaltyDiscount", required = true)
    protected BigDecimal outTeamInformationPenaltyDiscount;
    @XmlElement(name = "OutTeamInformationTrsAmount", required = true)
    protected BigDecimal outTeamInformationTrsAmount;
    @XmlElement(name = "OutTeamInformationOverdraftAmount", required = true)
    protected BigDecimal outTeamInformationOverdraftAmount;
    @XmlElement(name = "OutTeamInformationInterestRate", required = true)
    protected BigDecimal outTeamInformationInterestRate;
    @XmlElement(name = "OutTeamInformationPenaltyRate", required = true)
    protected BigDecimal outTeamInformationPenaltyRate;
    @XmlElement(name = "OutTeamInformationLoanStatus")
    protected String outTeamInformationLoanStatus;
    @XmlElement(name = "OutBillErrorLogGrp")
    protected ArrayOfOutBillErrorLogGrp outBillErrorLogGrp;
    @XmlElement(name = "OutBillGroupInRegGrp")
    protected ArrayOfOutBillGroupInRegGrp outBillGroupInRegGrp;
    @XmlElement(name = "OutBillInRegGrp")
    protected ArrayOfOutBillInRegGrp outBillInRegGrp;
    @XmlElement(name = "OutGrp")
    protected ArrayOfOutGrp outGrp;
    @XmlElement(name = "OutOwnbankUnpaid")
    protected ArrayOfOutOwnbankUnpaid outOwnbankUnpaid;
    @XmlElement(name = "OutRegSegmGrp")
    protected ArrayOfOutRegSegmGrp outRegSegmGrp;
    @XmlElement(name = "OutBillMassRegisterBmasRegCcy")
    protected int outBillMassRegisterBmasRegCcy;
    @XmlElement(name = "OutCurrencyIdCurrency")
    protected int outCurrencyIdCurrency;
    @XmlElement(name = "OutCurrencyShortDescr")
    protected String outCurrencyShortDescr;
    @XmlElement(name = "OutCurrencyDescription")
    protected String outCurrencyDescription;
    @XmlElement(name = "OutCurrencyIsoCode")
    protected int outCurrencyIsoCode;
    @XmlElement(name = "OutTargetAmountIefSuppliedTargetAmount", required = true)
    protected BigDecimal outTargetAmountIefSuppliedTargetAmount;
    @XmlElement(name = "OutRateIefSuppliedRate", required = true)
    protected BigDecimal outRateIefSuppliedRate;
    @XmlElement(name = "OutDomesticCurrencyIdCurrency")
    protected int outDomesticCurrencyIdCurrency;

    /**
     * Gets the value of the outBillBillSerialNum property.
     * 
     */
    public double getOutBillBillSerialNum() {
        return outBillBillSerialNum;
    }

    /**
     * Sets the value of the outBillBillSerialNum property.
     * 
     */
    public void setOutBillBillSerialNum(double value) {
        this.outBillBillSerialNum = value;
    }

    /**
     * Gets the value of the outBillErrorLogGrpLength property.
     * 
     */
    public int getOutBillErrorLogGrpLength() {
        return outBillErrorLogGrpLength;
    }

    /**
     * Sets the value of the outBillErrorLogGrpLength property.
     * 
     */
    public void setOutBillErrorLogGrpLength(int value) {
        this.outBillErrorLogGrpLength = value;
    }

    /**
     * Gets the value of the outBillGroupInRegGrpLength property.
     * 
     */
    public int getOutBillGroupInRegGrpLength() {
        return outBillGroupInRegGrpLength;
    }

    /**
     * Sets the value of the outBillGroupInRegGrpLength property.
     * 
     */
    public void setOutBillGroupInRegGrpLength(int value) {
        this.outBillGroupInRegGrpLength = value;
    }

    /**
     * Gets the value of the outBillInRegGrpLength property.
     * 
     */
    public int getOutBillInRegGrpLength() {
        return outBillInRegGrpLength;
    }

    /**
     * Sets the value of the outBillInRegGrpLength property.
     * 
     */
    public void setOutBillInRegGrpLength(int value) {
        this.outBillInRegGrpLength = value;
    }

    /**
     * Gets the value of the outBillMassRegisterBmasBillanalFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutBillMassRegisterBmasBillanalFlag() {
        return outBillMassRegisterBmasBillanalFlag;
    }

    /**
     * Sets the value of the outBillMassRegisterBmasBillanalFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutBillMassRegisterBmasBillanalFlag(String value) {
        this.outBillMassRegisterBmasBillanalFlag = value;
    }

    /**
     * Gets the value of the outBillMassRegisterBmasCarrierId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutBillMassRegisterBmasCarrierId() {
        return outBillMassRegisterBmasCarrierId;
    }

    /**
     * Sets the value of the outBillMassRegisterBmasCarrierId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutBillMassRegisterBmasCarrierId(String value) {
        this.outBillMassRegisterBmasCarrierId = value;
    }

    /**
     * Gets the value of the outBillMassRegisterBmasCarrierName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutBillMassRegisterBmasCarrierName() {
        return outBillMassRegisterBmasCarrierName;
    }

    /**
     * Sets the value of the outBillMassRegisterBmasCarrierName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutBillMassRegisterBmasCarrierName(String value) {
        this.outBillMassRegisterBmasCarrierName = value;
    }

    /**
     * Gets the value of the outBillMassRegisterBmasCarrierNotes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutBillMassRegisterBmasCarrierNotes() {
        return outBillMassRegisterBmasCarrierNotes;
    }

    /**
     * Sets the value of the outBillMassRegisterBmasCarrierNotes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutBillMassRegisterBmasCarrierNotes(String value) {
        this.outBillMassRegisterBmasCarrierNotes = value;
    }

    /**
     * Gets the value of the outBillMassRegisterBmasCarrierTitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutBillMassRegisterBmasCarrierTitle() {
        return outBillMassRegisterBmasCarrierTitle;
    }

    /**
     * Sets the value of the outBillMassRegisterBmasCarrierTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutBillMassRegisterBmasCarrierTitle(String value) {
        this.outBillMassRegisterBmasCarrierTitle = value;
    }

    /**
     * Gets the value of the outBillMassRegisterBmasEntryStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutBillMassRegisterBmasEntryStatus() {
        return outBillMassRegisterBmasEntryStatus;
    }

    /**
     * Sets the value of the outBillMassRegisterBmasEntryStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutBillMassRegisterBmasEntryStatus(String value) {
        this.outBillMassRegisterBmasEntryStatus = value;
    }

    /**
     * Gets the value of the outBillMassRegisterBmasFinalDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutBillMassRegisterBmasFinalDate() {
        return outBillMassRegisterBmasFinalDate;
    }

    /**
     * Sets the value of the outBillMassRegisterBmasFinalDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutBillMassRegisterBmasFinalDate(XMLGregorianCalendar value) {
        this.outBillMassRegisterBmasFinalDate = value;
    }

    /**
     * Gets the value of the outBillMassRegisterBmasInsDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutBillMassRegisterBmasInsDate() {
        return outBillMassRegisterBmasInsDate;
    }

    /**
     * Sets the value of the outBillMassRegisterBmasInsDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutBillMassRegisterBmasInsDate(XMLGregorianCalendar value) {
        this.outBillMassRegisterBmasInsDate = value;
    }

    /**
     * Gets the value of the outBillMassRegisterBmasRefNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutBillMassRegisterBmasRefNo() {
        return outBillMassRegisterBmasRefNo;
    }

    /**
     * Sets the value of the outBillMassRegisterBmasRefNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutBillMassRegisterBmasRefNo(String value) {
        this.outBillMassRegisterBmasRefNo = value;
    }

    /**
     * Gets the value of the outBillMassRegisterBmasSerialNum property.
     * 
     */
    public double getOutBillMassRegisterBmasSerialNum() {
        return outBillMassRegisterBmasSerialNum;
    }

    /**
     * Sets the value of the outBillMassRegisterBmasSerialNum property.
     * 
     */
    public void setOutBillMassRegisterBmasSerialNum(double value) {
        this.outBillMassRegisterBmasSerialNum = value;
    }

    /**
     * Gets the value of the outBillMassRegisterBmasTotbillAmnt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutBillMassRegisterBmasTotbillAmnt() {
        return outBillMassRegisterBmasTotbillAmnt;
    }

    /**
     * Sets the value of the outBillMassRegisterBmasTotbillAmnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutBillMassRegisterBmasTotbillAmnt(BigDecimal value) {
        this.outBillMassRegisterBmasTotbillAmnt = value;
    }

    /**
     * Gets the value of the outBillMassRegisterBmasTotbillCount property.
     * 
     */
    public int getOutBillMassRegisterBmasTotbillCount() {
        return outBillMassRegisterBmasTotbillCount;
    }

    /**
     * Sets the value of the outBillMassRegisterBmasTotbillCount property.
     * 
     */
    public void setOutBillMassRegisterBmasTotbillCount(int value) {
        this.outBillMassRegisterBmasTotbillCount = value;
    }

    /**
     * Gets the value of the outBillMassRegisterCommDiscount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutBillMassRegisterCommDiscount() {
        return outBillMassRegisterCommDiscount;
    }

    /**
     * Sets the value of the outBillMassRegisterCommDiscount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutBillMassRegisterCommDiscount(BigDecimal value) {
        this.outBillMassRegisterCommDiscount = value;
    }

    /**
     * Gets the value of the outBillMassRegisterExpaccCd property.
     * 
     */
    public short getOutBillMassRegisterExpaccCd() {
        return outBillMassRegisterExpaccCd;
    }

    /**
     * Sets the value of the outBillMassRegisterExpaccCd property.
     * 
     */
    public void setOutBillMassRegisterExpaccCd(short value) {
        this.outBillMassRegisterExpaccCd = value;
    }

    /**
     * Gets the value of the outBillMassRegisterExpaccInterdate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutBillMassRegisterExpaccInterdate() {
        return outBillMassRegisterExpaccInterdate;
    }

    /**
     * Sets the value of the outBillMassRegisterExpaccInterdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutBillMassRegisterExpaccInterdate(XMLGregorianCalendar value) {
        this.outBillMassRegisterExpaccInterdate = value;
    }

    /**
     * Gets the value of the outBillMassRegisterExpaccNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutBillMassRegisterExpaccNumber() {
        return outBillMassRegisterExpaccNumber;
    }

    /**
     * Sets the value of the outBillMassRegisterExpaccNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutBillMassRegisterExpaccNumber(String value) {
        this.outBillMassRegisterExpaccNumber = value;
    }

    /**
     * Gets the value of the outBillMassRegisterExpaccPrfsys property.
     * 
     */
    public short getOutBillMassRegisterExpaccPrfsys() {
        return outBillMassRegisterExpaccPrfsys;
    }

    /**
     * Sets the value of the outBillMassRegisterExpaccPrfsys property.
     * 
     */
    public void setOutBillMassRegisterExpaccPrfsys(short value) {
        this.outBillMassRegisterExpaccPrfsys = value;
    }

    /**
     * Gets the value of the outBillMassRegisterExpDiscount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutBillMassRegisterExpDiscount() {
        return outBillMassRegisterExpDiscount;
    }

    /**
     * Sets the value of the outBillMassRegisterExpDiscount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutBillMassRegisterExpDiscount(BigDecimal value) {
        this.outBillMassRegisterExpDiscount = value;
    }

    /**
     * Gets the value of the outBillMassRegisterTmstamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutBillMassRegisterTmstamp() {
        return outBillMassRegisterTmstamp;
    }

    /**
     * Sets the value of the outBillMassRegisterTmstamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutBillMassRegisterTmstamp(XMLGregorianCalendar value) {
        this.outBillMassRegisterTmstamp = value;
    }

    /**
     * Gets the value of the outCollaborationBanksBankId property.
     * 
     */
    public int getOutCollaborationBanksBankId() {
        return outCollaborationBanksBankId;
    }

    /**
     * Sets the value of the outCollaborationBanksBankId property.
     * 
     */
    public void setOutCollaborationBanksBankId(int value) {
        this.outCollaborationBanksBankId = value;
    }

    /**
     * Gets the value of the outCollaborationBanksBankName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCollaborationBanksBankName() {
        return outCollaborationBanksBankName;
    }

    /**
     * Sets the value of the outCollaborationBanksBankName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCollaborationBanksBankName(String value) {
        this.outCollaborationBanksBankName = value;
    }

    /**
     * Gets the value of the outCollaborationBanksOurBankFlg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCollaborationBanksOurBankFlg() {
        return outCollaborationBanksOurBankFlg;
    }

    /**
     * Sets the value of the outCollaborationBanksOurBankFlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCollaborationBanksOurBankFlg(String value) {
        this.outCollaborationBanksOurBankFlg = value;
    }

    /**
     * Gets the value of the outCommAmntIefSuppliedGenAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutCommAmntIefSuppliedGenAmount() {
        return outCommAmntIefSuppliedGenAmount;
    }

    /**
     * Sets the value of the outCommAmntIefSuppliedGenAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutCommAmntIefSuppliedGenAmount(BigDecimal value) {
        this.outCommAmntIefSuppliedGenAmount = value;
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
     * Gets the value of the outCustAddressAddressType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCustAddressAddressType() {
        return outCustAddressAddressType;
    }

    /**
     * Sets the value of the outCustAddressAddressType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCustAddressAddressType(String value) {
        this.outCustAddressAddressType = value;
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
     * Gets the value of the outCustAddressCommunicationAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCustAddressCommunicationAddress() {
        return outCustAddressCommunicationAddress;
    }

    /**
     * Sets the value of the outCustAddressCommunicationAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCustAddressCommunicationAddress(String value) {
        this.outCustAddressCommunicationAddress = value;
    }

    /**
     * Gets the value of the outCustAddressEntryStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCustAddressEntryStatus() {
        return outCustAddressEntryStatus;
    }

    /**
     * Sets the value of the outCustAddressEntryStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCustAddressEntryStatus(String value) {
        this.outCustAddressEntryStatus = value;
    }

    /**
     * Gets the value of the outCustAddressFaxNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCustAddressFaxNo() {
        return outCustAddressFaxNo;
    }

    /**
     * Sets the value of the outCustAddressFaxNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCustAddressFaxNo(String value) {
        this.outCustAddressFaxNo = value;
    }

    /**
     * Gets the value of the outCustAddressLatinInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCustAddressLatinInd() {
        return outCustAddressLatinInd;
    }

    /**
     * Sets the value of the outCustAddressLatinInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCustAddressLatinInd(String value) {
        this.outCustAddressLatinInd = value;
    }

    /**
     * Gets the value of the outCustAddressRegion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCustAddressRegion() {
        return outCustAddressRegion;
    }

    /**
     * Sets the value of the outCustAddressRegion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCustAddressRegion(String value) {
        this.outCustAddressRegion = value;
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
     * Gets the value of the outCustAddressTelephone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCustAddressTelephone() {
        return outCustAddressTelephone;
    }

    /**
     * Sets the value of the outCustAddressTelephone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCustAddressTelephone(String value) {
        this.outCustAddressTelephone = value;
    }

    /**
     * Gets the value of the outCustAddressTmstamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutCustAddressTmstamp() {
        return outCustAddressTmstamp;
    }

    /**
     * Sets the value of the outCustAddressTmstamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutCustAddressTmstamp(XMLGregorianCalendar value) {
        this.outCustAddressTmstamp = value;
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
     * Gets the value of the outCustomerAlertMsg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCustomerAlertMsg() {
        return outCustomerAlertMsg;
    }

    /**
     * Sets the value of the outCustomerAlertMsg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCustomerAlertMsg(String value) {
        this.outCustomerAlertMsg = value;
    }

    /**
     * Gets the value of the outCustomerCDigit property.
     * 
     */
    public short getOutCustomerCDigit() {
        return outCustomerCDigit;
    }

    /**
     * Sets the value of the outCustomerCDigit property.
     * 
     */
    public void setOutCustomerCDigit(short value) {
        this.outCustomerCDigit = value;
    }

    /**
     * Gets the value of the outCustomerCustId property.
     * 
     */
    public int getOutCustomerCustId() {
        return outCustomerCustId;
    }

    /**
     * Sets the value of the outCustomerCustId property.
     * 
     */
    public void setOutCustomerCustId(int value) {
        this.outCustomerCustId = value;
    }

    /**
     * Gets the value of the outCustomerDateOfBirth property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutCustomerDateOfBirth() {
        return outCustomerDateOfBirth;
    }

    /**
     * Sets the value of the outCustomerDateOfBirth property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutCustomerDateOfBirth(XMLGregorianCalendar value) {
        this.outCustomerDateOfBirth = value;
    }

    /**
     * Gets the value of the outCustomerDocExpireDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutCustomerDocExpireDate() {
        return outCustomerDocExpireDate;
    }

    /**
     * Sets the value of the outCustomerDocExpireDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutCustomerDocExpireDate(XMLGregorianCalendar value) {
        this.outCustomerDocExpireDate = value;
    }

    /**
     * Gets the value of the outCustomerEMail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCustomerEMail() {
        return outCustomerEMail;
    }

    /**
     * Sets the value of the outCustomerEMail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCustomerEMail(String value) {
        this.outCustomerEMail = value;
    }

    /**
     * Gets the value of the outCustomerEmployer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCustomerEmployer() {
        return outCustomerEmployer;
    }

    /**
     * Sets the value of the outCustomerEmployer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCustomerEmployer(String value) {
        this.outCustomerEmployer = value;
    }

    /**
     * Gets the value of the outCustomerEntryComments property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCustomerEntryComments() {
        return outCustomerEntryComments;
    }

    /**
     * Sets the value of the outCustomerEntryComments property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCustomerEntryComments(String value) {
        this.outCustomerEntryComments = value;
    }

    /**
     * Gets the value of the outCustomerEntryStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCustomerEntryStatus() {
        return outCustomerEntryStatus;
    }

    /**
     * Sets the value of the outCustomerEntryStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCustomerEntryStatus(String value) {
        this.outCustomerEntryStatus = value;
    }

    /**
     * Gets the value of the outCustomerExpireDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutCustomerExpireDate() {
        return outCustomerExpireDate;
    }

    /**
     * Sets the value of the outCustomerExpireDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutCustomerExpireDate(XMLGregorianCalendar value) {
        this.outCustomerExpireDate = value;
    }

    /**
     * Gets the value of the outCustomerFatherName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCustomerFatherName() {
        return outCustomerFatherName;
    }

    /**
     * Sets the value of the outCustomerFatherName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCustomerFatherName(String value) {
        this.outCustomerFatherName = value;
    }

    /**
     * Gets the value of the outCustomerFirstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCustomerFirstName() {
        return outCustomerFirstName;
    }

    /**
     * Sets the value of the outCustomerFirstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCustomerFirstName(String value) {
        this.outCustomerFirstName = value;
    }

    /**
     * Gets the value of the outCustomerMiddleName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCustomerMiddleName() {
        return outCustomerMiddleName;
    }

    /**
     * Sets the value of the outCustomerMiddleName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCustomerMiddleName(String value) {
        this.outCustomerMiddleName = value;
    }

    /**
     * Gets the value of the outCustomerMobileTel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCustomerMobileTel() {
        return outCustomerMobileTel;
    }

    /**
     * Sets the value of the outCustomerMobileTel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCustomerMobileTel(String value) {
        this.outCustomerMobileTel = value;
    }

    /**
     * Gets the value of the outCustomerMotherName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCustomerMotherName() {
        return outCustomerMotherName;
    }

    /**
     * Sets the value of the outCustomerMotherName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCustomerMotherName(String value) {
        this.outCustomerMotherName = value;
    }

    /**
     * Gets the value of the outCustomerNonResident property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCustomerNonResident() {
        return outCustomerNonResident;
    }

    /**
     * Sets the value of the outCustomerNonResident property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCustomerNonResident(String value) {
        this.outCustomerNonResident = value;
    }

    /**
     * Gets the value of the outCustomerNonResidentForRep property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCustomerNonResidentForRep() {
        return outCustomerNonResidentForRep;
    }

    /**
     * Sets the value of the outCustomerNonResidentForRep property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCustomerNonResidentForRep(String value) {
        this.outCustomerNonResidentForRep = value;
    }

    /**
     * Gets the value of the outCustomerShortName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCustomerShortName() {
        return outCustomerShortName;
    }

    /**
     * Sets the value of the outCustomerShortName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCustomerShortName(String value) {
        this.outCustomerShortName = value;
    }

    /**
     * Gets the value of the outCustomerSpouseName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCustomerSpouseName() {
        return outCustomerSpouseName;
    }

    /**
     * Sets the value of the outCustomerSpouseName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCustomerSpouseName(String value) {
        this.outCustomerSpouseName = value;
    }

    /**
     * Gets the value of the outCustomerSurname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCustomerSurname() {
        return outCustomerSurname;
    }

    /**
     * Sets the value of the outCustomerSurname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCustomerSurname(String value) {
        this.outCustomerSurname = value;
    }

    /**
     * Gets the value of the outCustomerSwiftAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCustomerSwiftAddress() {
        return outCustomerSwiftAddress;
    }

    /**
     * Sets the value of the outCustomerSwiftAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCustomerSwiftAddress(String value) {
        this.outCustomerSwiftAddress = value;
    }

    /**
     * Gets the value of the outCustomerTelephone1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCustomerTelephone1() {
        return outCustomerTelephone1;
    }

    /**
     * Sets the value of the outCustomerTelephone1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCustomerTelephone1(String value) {
        this.outCustomerTelephone1 = value;
    }

    /**
     * Gets the value of the outCustomerTelexConnection property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCustomerTelexConnection() {
        return outCustomerTelexConnection;
    }

    /**
     * Sets the value of the outCustomerTelexConnection property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCustomerTelexConnection(String value) {
        this.outCustomerTelexConnection = value;
    }

    /**
     * Gets the value of the outCustomerTitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCustomerTitle() {
        return outCustomerTitle;
    }

    /**
     * Sets the value of the outCustomerTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCustomerTitle(String value) {
        this.outCustomerTitle = value;
    }

    /**
     * Gets the value of the outDescCpfield1CharSuppliedChar30 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutDescCpfield1CharSuppliedChar30() {
        return outDescCpfield1CharSuppliedChar30;
    }

    /**
     * Sets the value of the outDescCpfield1CharSuppliedChar30 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutDescCpfield1CharSuppliedChar30(String value) {
        this.outDescCpfield1CharSuppliedChar30 = value;
    }

    /**
     * Gets the value of the outDescCpfield2CharSuppliedChar30 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutDescCpfield2CharSuppliedChar30() {
        return outDescCpfield2CharSuppliedChar30;
    }

    /**
     * Sets the value of the outDescCpfield2CharSuppliedChar30 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutDescCpfield2CharSuppliedChar30(String value) {
        this.outDescCpfield2CharSuppliedChar30 = value;
    }

    /**
     * Gets the value of the outDescCpfield3CharSuppliedChar30 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutDescCpfield3CharSuppliedChar30() {
        return outDescCpfield3CharSuppliedChar30;
    }

    /**
     * Sets the value of the outDescCpfield3CharSuppliedChar30 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutDescCpfield3CharSuppliedChar30(String value) {
        this.outDescCpfield3CharSuppliedChar30 = value;
    }

    /**
     * Gets the value of the outDescCpfield4CharSuppliedChar30 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutDescCpfield4CharSuppliedChar30() {
        return outDescCpfield4CharSuppliedChar30;
    }

    /**
     * Sets the value of the outDescCpfield4CharSuppliedChar30 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutDescCpfield4CharSuppliedChar30(String value) {
        this.outDescCpfield4CharSuppliedChar30 = value;
    }

    /**
     * Gets the value of the outDescrCpAgreementCpAgreementDescr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutDescrCpAgreementCpAgreementDescr() {
        return outDescrCpAgreementCpAgreementDescr;
    }

    /**
     * Sets the value of the outDescrCpAgreementCpAgreementDescr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutDescrCpAgreementCpAgreementDescr(String value) {
        this.outDescrCpAgreementCpAgreementDescr = value;
    }

    /**
     * Gets the value of the outDetailsProfitsAccountCustId property.
     * 
     */
    public int getOutDetailsProfitsAccountCustId() {
        return outDetailsProfitsAccountCustId;
    }

    /**
     * Sets the value of the outDetailsProfitsAccountCustId property.
     * 
     */
    public void setOutDetailsProfitsAccountCustId(int value) {
        this.outDetailsProfitsAccountCustId = value;
    }

    /**
     * Gets the value of the outDetailsProfitsAccountDepOpenUnit property.
     * 
     */
    public int getOutDetailsProfitsAccountDepOpenUnit() {
        return outDetailsProfitsAccountDepOpenUnit;
    }

    /**
     * Sets the value of the outDetailsProfitsAccountDepOpenUnit property.
     * 
     */
    public void setOutDetailsProfitsAccountDepOpenUnit(int value) {
        this.outDetailsProfitsAccountDepOpenUnit = value;
    }

    /**
     * Gets the value of the outDetailsProfitsAccountLnsOpenUnit property.
     * 
     */
    public int getOutDetailsProfitsAccountLnsOpenUnit() {
        return outDetailsProfitsAccountLnsOpenUnit;
    }

    /**
     * Sets the value of the outDetailsProfitsAccountLnsOpenUnit property.
     * 
     */
    public void setOutDetailsProfitsAccountLnsOpenUnit(int value) {
        this.outDetailsProfitsAccountLnsOpenUnit = value;
    }

    /**
     * Gets the value of the outDetailsProfitsAccountMonotoringUnit property.
     * 
     */
    public int getOutDetailsProfitsAccountMonotoringUnit() {
        return outDetailsProfitsAccountMonotoringUnit;
    }

    /**
     * Sets the value of the outDetailsProfitsAccountMonotoringUnit property.
     * 
     */
    public void setOutDetailsProfitsAccountMonotoringUnit(int value) {
        this.outDetailsProfitsAccountMonotoringUnit = value;
    }

    /**
     * Gets the value of the outDetailsProfitsAccountMovementCurrency property.
     * 
     */
    public int getOutDetailsProfitsAccountMovementCurrency() {
        return outDetailsProfitsAccountMovementCurrency;
    }

    /**
     * Sets the value of the outDetailsProfitsAccountMovementCurrency property.
     * 
     */
    public void setOutDetailsProfitsAccountMovementCurrency(int value) {
        this.outDetailsProfitsAccountMovementCurrency = value;
    }

    /**
     * Gets the value of the outDetailsProfitsAccountPrftSystem property.
     * 
     */
    public short getOutDetailsProfitsAccountPrftSystem() {
        return outDetailsProfitsAccountPrftSystem;
    }

    /**
     * Sets the value of the outDetailsProfitsAccountPrftSystem property.
     * 
     */
    public void setOutDetailsProfitsAccountPrftSystem(short value) {
        this.outDetailsProfitsAccountPrftSystem = value;
    }

    /**
     * Gets the value of the outDetailsProfitsAccountProductId property.
     * 
     */
    public int getOutDetailsProfitsAccountProductId() {
        return outDetailsProfitsAccountProductId;
    }

    /**
     * Sets the value of the outDetailsProfitsAccountProductId property.
     * 
     */
    public void setOutDetailsProfitsAccountProductId(int value) {
        this.outDetailsProfitsAccountProductId = value;
    }

    /**
     * Gets the value of the outExpAmntIefSuppliedGenAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutExpAmntIefSuppliedGenAmount() {
        return outExpAmntIefSuppliedGenAmount;
    }

    /**
     * Sets the value of the outExpAmntIefSuppliedGenAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutExpAmntIefSuppliedGenAmount(BigDecimal value) {
        this.outExpAmntIefSuppliedGenAmount = value;
    }

    /**
     * Gets the value of the outGrpLength property.
     * 
     */
    public int getOutGrpLength() {
        return outGrpLength;
    }

    /**
     * Sets the value of the outGrpLength property.
     * 
     */
    public void setOutGrpLength(int value) {
        this.outGrpLength = value;
    }

    /**
     * Gets the value of the outMntRecordingGrpSubscript property.
     * 
     */
    public short getOutMntRecordingGrpSubscript() {
        return outMntRecordingGrpSubscript;
    }

    /**
     * Sets the value of the outMntRecordingGrpSubscript property.
     * 
     */
    public void setOutMntRecordingGrpSubscript(short value) {
        this.outMntRecordingGrpSubscript = value;
    }

    /**
     * Gets the value of the outMntRecordingIdJustific property.
     * 
     */
    public int getOutMntRecordingIdJustific() {
        return outMntRecordingIdJustific;
    }

    /**
     * Sets the value of the outMntRecordingIdJustific property.
     * 
     */
    public void setOutMntRecordingIdJustific(int value) {
        this.outMntRecordingIdJustific = value;
    }

    /**
     * Gets the value of the outMntRecordingIdProduct property.
     * 
     */
    public int getOutMntRecordingIdProduct() {
        return outMntRecordingIdProduct;
    }

    /**
     * Sets the value of the outMntRecordingIdProduct property.
     * 
     */
    public void setOutMntRecordingIdProduct(int value) {
        this.outMntRecordingIdProduct = value;
    }

    /**
     * Gets the value of the outMntRecordingTmstamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutMntRecordingTmstamp() {
        return outMntRecordingTmstamp;
    }

    /**
     * Sets the value of the outMntRecordingTmstamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutMntRecordingTmstamp(XMLGregorianCalendar value) {
        this.outMntRecordingTmstamp = value;
    }

    /**
     * Gets the value of the outMntRecordingTrxDetails property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutMntRecordingTrxDetails() {
        return outMntRecordingTrxDetails;
    }

    /**
     * Sets the value of the outMntRecordingTrxDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutMntRecordingTrxDetails(String value) {
        this.outMntRecordingTrxDetails = value;
    }

    /**
     * Gets the value of the outMntRecordingTrxUsrSn property.
     * 
     */
    public int getOutMntRecordingTrxUsrSn() {
        return outMntRecordingTrxUsrSn;
    }

    /**
     * Sets the value of the outMntRecordingTrxUsrSn property.
     * 
     */
    public void setOutMntRecordingTrxUsrSn(int value) {
        this.outMntRecordingTrxUsrSn = value;
    }

    /**
     * Gets the value of the outMoreRecordsExistIefSuppliedFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutMoreRecordsExistIefSuppliedFlag() {
        return outMoreRecordsExistIefSuppliedFlag;
    }

    /**
     * Sets the value of the outMoreRecordsExistIefSuppliedFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutMoreRecordsExistIefSuppliedFlag(String value) {
        this.outMoreRecordsExistIefSuppliedFlag = value;
    }

    /**
     * Gets the value of the outOtherAfmAfmNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutOtherAfmAfmNo() {
        return outOtherAfmAfmNo;
    }

    /**
     * Sets the value of the outOtherAfmAfmNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutOtherAfmAfmNo(String value) {
        this.outOtherAfmAfmNo = value;
    }

    /**
     * Gets the value of the outOtherAfmExpiryDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutOtherAfmExpiryDate() {
        return outOtherAfmExpiryDate;
    }

    /**
     * Sets the value of the outOtherAfmExpiryDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutOtherAfmExpiryDate(XMLGregorianCalendar value) {
        this.outOtherAfmExpiryDate = value;
    }

    /**
     * Gets the value of the outOtherAfmIssueDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutOtherAfmIssueDate() {
        return outOtherAfmIssueDate;
    }

    /**
     * Sets the value of the outOtherAfmIssueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutOtherAfmIssueDate(XMLGregorianCalendar value) {
        this.outOtherAfmIssueDate = value;
    }

    /**
     * Gets the value of the outOtherAfmMainFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutOtherAfmMainFlag() {
        return outOtherAfmMainFlag;
    }

    /**
     * Sets the value of the outOtherAfmMainFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutOtherAfmMainFlag(String value) {
        this.outOtherAfmMainFlag = value;
    }

    /**
     * Gets the value of the outOtherAfmSerialNo property.
     * 
     */
    public short getOutOtherAfmSerialNo() {
        return outOtherAfmSerialNo;
    }

    /**
     * Sets the value of the outOtherAfmSerialNo property.
     * 
     */
    public void setOutOtherAfmSerialNo(short value) {
        this.outOtherAfmSerialNo = value;
    }

    /**
     * Gets the value of the outOtherAfmTmstamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutOtherAfmTmstamp() {
        return outOtherAfmTmstamp;
    }

    /**
     * Sets the value of the outOtherAfmTmstamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutOtherAfmTmstamp(XMLGregorianCalendar value) {
        this.outOtherAfmTmstamp = value;
    }

    /**
     * Gets the value of the outOtherIdExpiryDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutOtherIdExpiryDate() {
        return outOtherIdExpiryDate;
    }

    /**
     * Sets the value of the outOtherIdExpiryDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutOtherIdExpiryDate(XMLGregorianCalendar value) {
        this.outOtherIdExpiryDate = value;
    }

    /**
     * Gets the value of the outOtherIdIdNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutOtherIdIdNo() {
        return outOtherIdIdNo;
    }

    /**
     * Sets the value of the outOtherIdIdNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutOtherIdIdNo(String value) {
        this.outOtherIdIdNo = value;
    }

    /**
     * Gets the value of the outOtherIdIssueAuthority property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutOtherIdIssueAuthority() {
        return outOtherIdIssueAuthority;
    }

    /**
     * Sets the value of the outOtherIdIssueAuthority property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutOtherIdIssueAuthority(String value) {
        this.outOtherIdIssueAuthority = value;
    }

    /**
     * Gets the value of the outOtherIdIssueDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutOtherIdIssueDate() {
        return outOtherIdIssueDate;
    }

    /**
     * Sets the value of the outOtherIdIssueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutOtherIdIssueDate(XMLGregorianCalendar value) {
        this.outOtherIdIssueDate = value;
    }

    /**
     * Gets the value of the outOtherIdMainFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutOtherIdMainFlag() {
        return outOtherIdMainFlag;
    }

    /**
     * Sets the value of the outOtherIdMainFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutOtherIdMainFlag(String value) {
        this.outOtherIdMainFlag = value;
    }

    /**
     * Gets the value of the outOtherIdSerialNo property.
     * 
     */
    public short getOutOtherIdSerialNo() {
        return outOtherIdSerialNo;
    }

    /**
     * Sets the value of the outOtherIdSerialNo property.
     * 
     */
    public void setOutOtherIdSerialNo(short value) {
        this.outOtherIdSerialNo = value;
    }

    /**
     * Gets the value of the outOtherIdTmstamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutOtherIdTmstamp() {
        return outOtherIdTmstamp;
    }

    /**
     * Sets the value of the outOtherIdTmstamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutOtherIdTmstamp(XMLGregorianCalendar value) {
        this.outOtherIdTmstamp = value;
    }

    /**
     * Gets the value of the outOwnbankUnpaidLength property.
     * 
     */
    public int getOutOwnbankUnpaidLength() {
        return outOwnbankUnpaidLength;
    }

    /**
     * Sets the value of the outOwnbankUnpaidLength property.
     * 
     */
    public void setOutOwnbankUnpaidLength(int value) {
        this.outOwnbankUnpaidLength = value;
    }

    /**
     * Gets the value of the outProductIdProduct property.
     * 
     */
    public int getOutProductIdProduct() {
        return outProductIdProduct;
    }

    /**
     * Sets the value of the outProductIdProduct property.
     * 
     */
    public void setOutProductIdProduct(int value) {
        this.outProductIdProduct = value;
    }

    /**
     * Gets the value of the outProductProductType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutProductProductType() {
        return outProductProductType;
    }

    /**
     * Sets the value of the outProductProductType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutProductProductType(String value) {
        this.outProductProductType = value;
    }

    /**
     * Gets the value of the outRegSegmGrpLength property.
     * 
     */
    public int getOutRegSegmGrpLength() {
        return outRegSegmGrpLength;
    }

    /**
     * Sets the value of the outRegSegmGrpLength property.
     * 
     */
    public void setOutRegSegmGrpLength(int value) {
        this.outRegSegmGrpLength = value;
    }

    /**
     * Gets the value of the outResultIefSuppliedFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutResultIefSuppliedFlag() {
        return outResultIefSuppliedFlag;
    }

    /**
     * Sets the value of the outResultIefSuppliedFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutResultIefSuppliedFlag(String value) {
        this.outResultIefSuppliedFlag = value;
    }

    /**
     * Gets the value of the outSelectedProfitsAccountAccountCd property.
     * 
     */
    public short getOutSelectedProfitsAccountAccountCd() {
        return outSelectedProfitsAccountAccountCd;
    }

    /**
     * Sets the value of the outSelectedProfitsAccountAccountCd property.
     * 
     */
    public void setOutSelectedProfitsAccountAccountCd(short value) {
        this.outSelectedProfitsAccountAccountCd = value;
    }

    /**
     * Gets the value of the outSelectedProfitsAccountAccountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSelectedProfitsAccountAccountNumber() {
        return outSelectedProfitsAccountAccountNumber;
    }

    /**
     * Sets the value of the outSelectedProfitsAccountAccountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSelectedProfitsAccountAccountNumber(String value) {
        this.outSelectedProfitsAccountAccountNumber = value;
    }

    /**
     * Gets the value of the outSelectedProfitsAccountAccStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSelectedProfitsAccountAccStatus() {
        return outSelectedProfitsAccountAccStatus;
    }

    /**
     * Sets the value of the outSelectedProfitsAccountAccStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSelectedProfitsAccountAccStatus(String value) {
        this.outSelectedProfitsAccountAccStatus = value;
    }

    /**
     * Gets the value of the outSelectedProfitsAccountAgrMembershipSn property.
     * 
     */
    public int getOutSelectedProfitsAccountAgrMembershipSn() {
        return outSelectedProfitsAccountAgrMembershipSn;
    }

    /**
     * Sets the value of the outSelectedProfitsAccountAgrMembershipSn property.
     * 
     */
    public void setOutSelectedProfitsAccountAgrMembershipSn(int value) {
        this.outSelectedProfitsAccountAgrMembershipSn = value;
    }

    /**
     * Gets the value of the outSelectedProfitsAccountAgrSn property.
     * 
     */
    public int getOutSelectedProfitsAccountAgrSn() {
        return outSelectedProfitsAccountAgrSn;
    }

    /**
     * Sets the value of the outSelectedProfitsAccountAgrSn property.
     * 
     */
    public void setOutSelectedProfitsAccountAgrSn(int value) {
        this.outSelectedProfitsAccountAgrSn = value;
    }

    /**
     * Gets the value of the outSelectedProfitsAccountAgrUnit property.
     * 
     */
    public int getOutSelectedProfitsAccountAgrUnit() {
        return outSelectedProfitsAccountAgrUnit;
    }

    /**
     * Sets the value of the outSelectedProfitsAccountAgrUnit property.
     * 
     */
    public void setOutSelectedProfitsAccountAgrUnit(int value) {
        this.outSelectedProfitsAccountAgrUnit = value;
    }

    /**
     * Gets the value of the outSelectedProfitsAccountAgrYear property.
     * 
     */
    public short getOutSelectedProfitsAccountAgrYear() {
        return outSelectedProfitsAccountAgrYear;
    }

    /**
     * Sets the value of the outSelectedProfitsAccountAgrYear property.
     * 
     */
    public void setOutSelectedProfitsAccountAgrYear(short value) {
        this.outSelectedProfitsAccountAgrYear = value;
    }

    /**
     * Gets the value of the outSelectedProfitsAccountCDigit property.
     * 
     */
    public short getOutSelectedProfitsAccountCDigit() {
        return outSelectedProfitsAccountCDigit;
    }

    /**
     * Sets the value of the outSelectedProfitsAccountCDigit property.
     * 
     */
    public void setOutSelectedProfitsAccountCDigit(short value) {
        this.outSelectedProfitsAccountCDigit = value;
    }

    /**
     * Gets the value of the outSelectedProfitsAccountCustId property.
     * 
     */
    public int getOutSelectedProfitsAccountCustId() {
        return outSelectedProfitsAccountCustId;
    }

    /**
     * Sets the value of the outSelectedProfitsAccountCustId property.
     * 
     */
    public void setOutSelectedProfitsAccountCustId(int value) {
        this.outSelectedProfitsAccountCustId = value;
    }

    /**
     * Gets the value of the outSelectedProfitsAccountDepAccNumber property.
     * 
     */
    public double getOutSelectedProfitsAccountDepAccNumber() {
        return outSelectedProfitsAccountDepAccNumber;
    }

    /**
     * Sets the value of the outSelectedProfitsAccountDepAccNumber property.
     * 
     */
    public void setOutSelectedProfitsAccountDepAccNumber(double value) {
        this.outSelectedProfitsAccountDepAccNumber = value;
    }

    /**
     * Gets the value of the outSelectedProfitsAccountDepOpenUnit property.
     * 
     */
    public int getOutSelectedProfitsAccountDepOpenUnit() {
        return outSelectedProfitsAccountDepOpenUnit;
    }

    /**
     * Sets the value of the outSelectedProfitsAccountDepOpenUnit property.
     * 
     */
    public void setOutSelectedProfitsAccountDepOpenUnit(int value) {
        this.outSelectedProfitsAccountDepOpenUnit = value;
    }

    /**
     * Gets the value of the outSelectedProfitsAccountLgAccSn property.
     * 
     */
    public double getOutSelectedProfitsAccountLgAccSn() {
        return outSelectedProfitsAccountLgAccSn;
    }

    /**
     * Sets the value of the outSelectedProfitsAccountLgAccSn property.
     * 
     */
    public void setOutSelectedProfitsAccountLgAccSn(double value) {
        this.outSelectedProfitsAccountLgAccSn = value;
    }

    /**
     * Gets the value of the outSelectedProfitsAccountLgOpenUnit property.
     * 
     */
    public int getOutSelectedProfitsAccountLgOpenUnit() {
        return outSelectedProfitsAccountLgOpenUnit;
    }

    /**
     * Sets the value of the outSelectedProfitsAccountLgOpenUnit property.
     * 
     */
    public void setOutSelectedProfitsAccountLgOpenUnit(int value) {
        this.outSelectedProfitsAccountLgOpenUnit = value;
    }

    /**
     * Gets the value of the outSelectedProfitsAccountLimitCurrency property.
     * 
     */
    public int getOutSelectedProfitsAccountLimitCurrency() {
        return outSelectedProfitsAccountLimitCurrency;
    }

    /**
     * Sets the value of the outSelectedProfitsAccountLimitCurrency property.
     * 
     */
    public void setOutSelectedProfitsAccountLimitCurrency(int value) {
        this.outSelectedProfitsAccountLimitCurrency = value;
    }

    /**
     * Gets the value of the outSelectedProfitsAccountLnsOpenUnit property.
     * 
     */
    public int getOutSelectedProfitsAccountLnsOpenUnit() {
        return outSelectedProfitsAccountLnsOpenUnit;
    }

    /**
     * Sets the value of the outSelectedProfitsAccountLnsOpenUnit property.
     * 
     */
    public void setOutSelectedProfitsAccountLnsOpenUnit(int value) {
        this.outSelectedProfitsAccountLnsOpenUnit = value;
    }

    /**
     * Gets the value of the outSelectedProfitsAccountLnsSn property.
     * 
     */
    public int getOutSelectedProfitsAccountLnsSn() {
        return outSelectedProfitsAccountLnsSn;
    }

    /**
     * Sets the value of the outSelectedProfitsAccountLnsSn property.
     * 
     */
    public void setOutSelectedProfitsAccountLnsSn(int value) {
        this.outSelectedProfitsAccountLnsSn = value;
    }

    /**
     * Gets the value of the outSelectedProfitsAccountLnsType property.
     * 
     */
    public short getOutSelectedProfitsAccountLnsType() {
        return outSelectedProfitsAccountLnsType;
    }

    /**
     * Sets the value of the outSelectedProfitsAccountLnsType property.
     * 
     */
    public void setOutSelectedProfitsAccountLnsType(short value) {
        this.outSelectedProfitsAccountLnsType = value;
    }

    /**
     * Gets the value of the outSelectedProfitsAccountMonotoringUnit property.
     * 
     */
    public int getOutSelectedProfitsAccountMonotoringUnit() {
        return outSelectedProfitsAccountMonotoringUnit;
    }

    /**
     * Sets the value of the outSelectedProfitsAccountMonotoringUnit property.
     * 
     */
    public void setOutSelectedProfitsAccountMonotoringUnit(int value) {
        this.outSelectedProfitsAccountMonotoringUnit = value;
    }

    /**
     * Gets the value of the outSelectedProfitsAccountMovementCurrency property.
     * 
     */
    public int getOutSelectedProfitsAccountMovementCurrency() {
        return outSelectedProfitsAccountMovementCurrency;
    }

    /**
     * Sets the value of the outSelectedProfitsAccountMovementCurrency property.
     * 
     */
    public void setOutSelectedProfitsAccountMovementCurrency(int value) {
        this.outSelectedProfitsAccountMovementCurrency = value;
    }

    /**
     * Gets the value of the outSelectedProfitsAccountPrftSystem property.
     * 
     */
    public short getOutSelectedProfitsAccountPrftSystem() {
        return outSelectedProfitsAccountPrftSystem;
    }

    /**
     * Sets the value of the outSelectedProfitsAccountPrftSystem property.
     * 
     */
    public void setOutSelectedProfitsAccountPrftSystem(short value) {
        this.outSelectedProfitsAccountPrftSystem = value;
    }

    /**
     * Gets the value of the outSelectedProfitsAccountProductId property.
     * 
     */
    public int getOutSelectedProfitsAccountProductId() {
        return outSelectedProfitsAccountProductId;
    }

    /**
     * Sets the value of the outSelectedProfitsAccountProductId property.
     * 
     */
    public void setOutSelectedProfitsAccountProductId(int value) {
        this.outSelectedProfitsAccountProductId = value;
    }

    /**
     * Gets the value of the outSelectedProfitsAccountTrOpenUnit property.
     * 
     */
    public int getOutSelectedProfitsAccountTrOpenUnit() {
        return outSelectedProfitsAccountTrOpenUnit;
    }

    /**
     * Sets the value of the outSelectedProfitsAccountTrOpenUnit property.
     * 
     */
    public void setOutSelectedProfitsAccountTrOpenUnit(int value) {
        this.outSelectedProfitsAccountTrOpenUnit = value;
    }

    /**
     * Gets the value of the outSelectedProfitsAccountTrSn property.
     * 
     */
    public int getOutSelectedProfitsAccountTrSn() {
        return outSelectedProfitsAccountTrSn;
    }

    /**
     * Sets the value of the outSelectedProfitsAccountTrSn property.
     * 
     */
    public void setOutSelectedProfitsAccountTrSn(int value) {
        this.outSelectedProfitsAccountTrSn = value;
    }

    /**
     * Gets the value of the outSelectedProfitsAccountTrType property.
     * 
     */
    public short getOutSelectedProfitsAccountTrType() {
        return outSelectedProfitsAccountTrType;
    }

    /**
     * Sets the value of the outSelectedProfitsAccountTrType property.
     * 
     */
    public void setOutSelectedProfitsAccountTrType(short value) {
        this.outSelectedProfitsAccountTrType = value;
    }

    /**
     * Gets the value of the outTaxAmntIefSuppliedGenAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutTaxAmntIefSuppliedGenAmount() {
        return outTaxAmntIefSuppliedGenAmount;
    }

    /**
     * Sets the value of the outTaxAmntIefSuppliedGenAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutTaxAmntIefSuppliedGenAmount(BigDecimal value) {
        this.outTaxAmntIefSuppliedGenAmount = value;
    }

    /**
     * Gets the value of the outUnitCode property.
     * 
     */
    public int getOutUnitCode() {
        return outUnitCode;
    }

    /**
     * Sets the value of the outUnitCode property.
     * 
     */
    public void setOutUnitCode(int value) {
        this.outUnitCode = value;
    }

    /**
     * Gets the value of the outUnitUnitName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutUnitUnitName() {
        return outUnitUnitName;
    }

    /**
     * Sets the value of the outUnitUnitName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutUnitUnitName(String value) {
        this.outUnitUnitName = value;
    }

    /**
     * Gets the value of the outTeamInformationBankDraftNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutTeamInformationBankDraftNo() {
        return outTeamInformationBankDraftNo;
    }

    /**
     * Sets the value of the outTeamInformationBankDraftNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutTeamInformationBankDraftNo(String value) {
        this.outTeamInformationBankDraftNo = value;
    }

    /**
     * Gets the value of the outTeamInformationWthdrawSpread property.
     * 
     */
    public short getOutTeamInformationWthdrawSpread() {
        return outTeamInformationWthdrawSpread;
    }

    /**
     * Sets the value of the outTeamInformationWthdrawSpread property.
     * 
     */
    public void setOutTeamInformationWthdrawSpread(short value) {
        this.outTeamInformationWthdrawSpread = value;
    }

    /**
     * Gets the value of the outTeamInformationNotifSpreadDayB property.
     * 
     */
    public short getOutTeamInformationNotifSpreadDayB() {
        return outTeamInformationNotifSpreadDayB;
    }

    /**
     * Sets the value of the outTeamInformationNotifSpreadDayB property.
     * 
     */
    public void setOutTeamInformationNotifSpreadDayB(short value) {
        this.outTeamInformationNotifSpreadDayB = value;
    }

    /**
     * Gets the value of the outTeamInformationNotifSpreadDays property.
     * 
     */
    public short getOutTeamInformationNotifSpreadDays() {
        return outTeamInformationNotifSpreadDays;
    }

    /**
     * Sets the value of the outTeamInformationNotifSpreadDays property.
     * 
     */
    public void setOutTeamInformationNotifSpreadDays(short value) {
        this.outTeamInformationNotifSpreadDays = value;
    }

    /**
     * Gets the value of the outTeamInformationWithdrawAmnt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutTeamInformationWithdrawAmnt() {
        return outTeamInformationWithdrawAmnt;
    }

    /**
     * Sets the value of the outTeamInformationWithdrawAmnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutTeamInformationWithdrawAmnt(BigDecimal value) {
        this.outTeamInformationWithdrawAmnt = value;
    }

    /**
     * Gets the value of the outTeamInformationRestrictAccFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutTeamInformationRestrictAccFlag() {
        return outTeamInformationRestrictAccFlag;
    }

    /**
     * Sets the value of the outTeamInformationRestrictAccFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutTeamInformationRestrictAccFlag(String value) {
        this.outTeamInformationRestrictAccFlag = value;
    }

    /**
     * Gets the value of the outTeamInformationStatementIssFreq property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutTeamInformationStatementIssFreq() {
        return outTeamInformationStatementIssFreq;
    }

    /**
     * Sets the value of the outTeamInformationStatementIssFreq property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutTeamInformationStatementIssFreq(String value) {
        this.outTeamInformationStatementIssFreq = value;
    }

    /**
     * Gets the value of the outTeamInformationBeneficiarySn property.
     * 
     */
    public short getOutTeamInformationBeneficiarySn() {
        return outTeamInformationBeneficiarySn;
    }

    /**
     * Sets the value of the outTeamInformationBeneficiarySn property.
     * 
     */
    public void setOutTeamInformationBeneficiarySn(short value) {
        this.outTeamInformationBeneficiarySn = value;
    }

    /**
     * Gets the value of the outTeamInformationRepresentativeSn property.
     * 
     */
    public short getOutTeamInformationRepresentativeSn() {
        return outTeamInformationRepresentativeSn;
    }

    /**
     * Sets the value of the outTeamInformationRepresentativeSn property.
     * 
     */
    public void setOutTeamInformationRepresentativeSn(short value) {
        this.outTeamInformationRepresentativeSn = value;
    }

    /**
     * Gets the value of the outTeamInformationAccCd property.
     * 
     */
    public short getOutTeamInformationAccCd() {
        return outTeamInformationAccCd;
    }

    /**
     * Sets the value of the outTeamInformationAccCd property.
     * 
     */
    public void setOutTeamInformationAccCd(short value) {
        this.outTeamInformationAccCd = value;
    }

    /**
     * Gets the value of the outTeamInformationAccSn property.
     * 
     */
    public int getOutTeamInformationAccSn() {
        return outTeamInformationAccSn;
    }

    /**
     * Sets the value of the outTeamInformationAccSn property.
     * 
     */
    public void setOutTeamInformationAccSn(int value) {
        this.outTeamInformationAccSn = value;
    }

    /**
     * Gets the value of the outTeamInformationAccType property.
     * 
     */
    public short getOutTeamInformationAccType() {
        return outTeamInformationAccType;
    }

    /**
     * Sets the value of the outTeamInformationAccType property.
     * 
     */
    public void setOutTeamInformationAccType(short value) {
        this.outTeamInformationAccType = value;
    }

    /**
     * Gets the value of the outTeamInformationAccUnitCode property.
     * 
     */
    public int getOutTeamInformationAccUnitCode() {
        return outTeamInformationAccUnitCode;
    }

    /**
     * Sets the value of the outTeamInformationAccUnitCode property.
     * 
     */
    public void setOutTeamInformationAccUnitCode(int value) {
        this.outTeamInformationAccUnitCode = value;
    }

    /**
     * Gets the value of the outTeamInformationCheqIssueDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutTeamInformationCheqIssueDate() {
        return outTeamInformationCheqIssueDate;
    }

    /**
     * Sets the value of the outTeamInformationCheqIssueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutTeamInformationCheqIssueDate(XMLGregorianCalendar value) {
        this.outTeamInformationCheqIssueDate = value;
    }

    /**
     * Gets the value of the outTeamInformationDbInterestPer property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutTeamInformationDbInterestPer() {
        return outTeamInformationDbInterestPer;
    }

    /**
     * Sets the value of the outTeamInformationDbInterestPer property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutTeamInformationDbInterestPer(BigDecimal value) {
        this.outTeamInformationDbInterestPer = value;
    }

    /**
     * Gets the value of the outTeamInformationCrInterestPer property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutTeamInformationCrInterestPer() {
        return outTeamInformationCrInterestPer;
    }

    /**
     * Sets the value of the outTeamInformationCrInterestPer property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutTeamInformationCrInterestPer(BigDecimal value) {
        this.outTeamInformationCrInterestPer = value;
    }

    /**
     * Gets the value of the outTeamInformationAccountPsbSn property.
     * 
     */
    public int getOutTeamInformationAccountPsbSn() {
        return outTeamInformationAccountPsbSn;
    }

    /**
     * Sets the value of the outTeamInformationAccountPsbSn property.
     * 
     */
    public void setOutTeamInformationAccountPsbSn(int value) {
        this.outTeamInformationAccountPsbSn = value;
    }

    /**
     * Gets the value of the outTeamInformationFromCheqCd property.
     * 
     */
    public short getOutTeamInformationFromCheqCd() {
        return outTeamInformationFromCheqCd;
    }

    /**
     * Sets the value of the outTeamInformationFromCheqCd property.
     * 
     */
    public void setOutTeamInformationFromCheqCd(short value) {
        this.outTeamInformationFromCheqCd = value;
    }

    /**
     * Gets the value of the outTeamInformationToCheqCd property.
     * 
     */
    public short getOutTeamInformationToCheqCd() {
        return outTeamInformationToCheqCd;
    }

    /**
     * Sets the value of the outTeamInformationToCheqCd property.
     * 
     */
    public void setOutTeamInformationToCheqCd(short value) {
        this.outTeamInformationToCheqCd = value;
    }

    /**
     * Gets the value of the outTeamInformationBlockTransactExpDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutTeamInformationBlockTransactExpDate() {
        return outTeamInformationBlockTransactExpDate;
    }

    /**
     * Sets the value of the outTeamInformationBlockTransactExpDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutTeamInformationBlockTransactExpDate(XMLGregorianCalendar value) {
        this.outTeamInformationBlockTransactExpDate = value;
    }

    /**
     * Gets the value of the outTeamInformationAccountHomeBranch property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutTeamInformationAccountHomeBranch() {
        return outTeamInformationAccountHomeBranch;
    }

    /**
     * Sets the value of the outTeamInformationAccountHomeBranch property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutTeamInformationAccountHomeBranch(String value) {
        this.outTeamInformationAccountHomeBranch = value;
    }

    /**
     * Gets the value of the outTeamInformationCrInterestId property.
     * 
     */
    public int getOutTeamInformationCrInterestId() {
        return outTeamInformationCrInterestId;
    }

    /**
     * Sets the value of the outTeamInformationCrInterestId property.
     * 
     */
    public void setOutTeamInformationCrInterestId(int value) {
        this.outTeamInformationCrInterestId = value;
    }

    /**
     * Gets the value of the outTeamInformationDbInterestId property.
     * 
     */
    public int getOutTeamInformationDbInterestId() {
        return outTeamInformationDbInterestId;
    }

    /**
     * Sets the value of the outTeamInformationDbInterestId property.
     * 
     */
    public void setOutTeamInformationDbInterestId(int value) {
        this.outTeamInformationDbInterestId = value;
    }

    /**
     * Gets the value of the outTeamInformationAccountCobenefSnMail property.
     * 
     */
    public short getOutTeamInformationAccountCobenefSnMail() {
        return outTeamInformationAccountCobenefSnMail;
    }

    /**
     * Sets the value of the outTeamInformationAccountCobenefSnMail property.
     * 
     */
    public void setOutTeamInformationAccountCobenefSnMail(short value) {
        this.outTeamInformationAccountCobenefSnMail = value;
    }

    /**
     * Gets the value of the outTeamInformationAccountBenefAddressSn property.
     * 
     */
    public short getOutTeamInformationAccountBenefAddressSn() {
        return outTeamInformationAccountBenefAddressSn;
    }

    /**
     * Sets the value of the outTeamInformationAccountBenefAddressSn property.
     * 
     */
    public void setOutTeamInformationAccountBenefAddressSn(short value) {
        this.outTeamInformationAccountBenefAddressSn = value;
    }

    /**
     * Gets the value of the outTeamInformationFromCheqItemSerialNum property.
     * 
     */
    public double getOutTeamInformationFromCheqItemSerialNum() {
        return outTeamInformationFromCheqItemSerialNum;
    }

    /**
     * Sets the value of the outTeamInformationFromCheqItemSerialNum property.
     * 
     */
    public void setOutTeamInformationFromCheqItemSerialNum(double value) {
        this.outTeamInformationFromCheqItemSerialNum = value;
    }

    /**
     * Gets the value of the outTeamInformationToCheqItemSerialNum property.
     * 
     */
    public double getOutTeamInformationToCheqItemSerialNum() {
        return outTeamInformationToCheqItemSerialNum;
    }

    /**
     * Sets the value of the outTeamInformationToCheqItemSerialNum property.
     * 
     */
    public void setOutTeamInformationToCheqItemSerialNum(double value) {
        this.outTeamInformationToCheqItemSerialNum = value;
    }

    /**
     * Gets the value of the outTeamInformationCheqAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutTeamInformationCheqAmount() {
        return outTeamInformationCheqAmount;
    }

    /**
     * Sets the value of the outTeamInformationCheqAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutTeamInformationCheqAmount(BigDecimal value) {
        this.outTeamInformationCheqAmount = value;
    }

    /**
     * Gets the value of the outTeamInformationCheqStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutTeamInformationCheqStatus() {
        return outTeamInformationCheqStatus;
    }

    /**
     * Sets the value of the outTeamInformationCheqStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutTeamInformationCheqStatus(String value) {
        this.outTeamInformationCheqStatus = value;
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
     * Gets the value of the outTeamInformationDepAccStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutTeamInformationDepAccStatus() {
        return outTeamInformationDepAccStatus;
    }

    /**
     * Sets the value of the outTeamInformationDepAccStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutTeamInformationDepAccStatus(String value) {
        this.outTeamInformationDepAccStatus = value;
    }

    /**
     * Gets the value of the outTeamInformationEncroachTolerance property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutTeamInformationEncroachTolerance() {
        return outTeamInformationEncroachTolerance;
    }

    /**
     * Sets the value of the outTeamInformationEncroachTolerance property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutTeamInformationEncroachTolerance(BigDecimal value) {
        this.outTeamInformationEncroachTolerance = value;
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
     * Gets the value of the outTeamInformationAuthorisationResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutTeamInformationAuthorisationResult() {
        return outTeamInformationAuthorisationResult;
    }

    /**
     * Sets the value of the outTeamInformationAuthorisationResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutTeamInformationAuthorisationResult(String value) {
        this.outTeamInformationAuthorisationResult = value;
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
     * Gets the value of the outBillErrorLogGrp property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfOutBillErrorLogGrp }
     *     
     */
    public ArrayOfOutBillErrorLogGrp getOutBillErrorLogGrp() {
        return outBillErrorLogGrp;
    }

    /**
     * Sets the value of the outBillErrorLogGrp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfOutBillErrorLogGrp }
     *     
     */
    public void setOutBillErrorLogGrp(ArrayOfOutBillErrorLogGrp value) {
        this.outBillErrorLogGrp = value;
    }

    /**
     * Gets the value of the outBillGroupInRegGrp property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfOutBillGroupInRegGrp }
     *     
     */
    public ArrayOfOutBillGroupInRegGrp getOutBillGroupInRegGrp() {
        return outBillGroupInRegGrp;
    }

    /**
     * Sets the value of the outBillGroupInRegGrp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfOutBillGroupInRegGrp }
     *     
     */
    public void setOutBillGroupInRegGrp(ArrayOfOutBillGroupInRegGrp value) {
        this.outBillGroupInRegGrp = value;
    }

    /**
     * Gets the value of the outBillInRegGrp property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfOutBillInRegGrp }
     *     
     */
    public ArrayOfOutBillInRegGrp getOutBillInRegGrp() {
        return outBillInRegGrp;
    }

    /**
     * Sets the value of the outBillInRegGrp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfOutBillInRegGrp }
     *     
     */
    public void setOutBillInRegGrp(ArrayOfOutBillInRegGrp value) {
        this.outBillInRegGrp = value;
    }

    /**
     * Gets the value of the outGrp property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfOutGrp }
     *     
     */
    public ArrayOfOutGrp getOutGrp() {
        return outGrp;
    }

    /**
     * Sets the value of the outGrp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfOutGrp }
     *     
     */
    public void setOutGrp(ArrayOfOutGrp value) {
        this.outGrp = value;
    }

    /**
     * Gets the value of the outOwnbankUnpaid property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfOutOwnbankUnpaid }
     *     
     */
    public ArrayOfOutOwnbankUnpaid getOutOwnbankUnpaid() {
        return outOwnbankUnpaid;
    }

    /**
     * Sets the value of the outOwnbankUnpaid property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfOutOwnbankUnpaid }
     *     
     */
    public void setOutOwnbankUnpaid(ArrayOfOutOwnbankUnpaid value) {
        this.outOwnbankUnpaid = value;
    }

    /**
     * Gets the value of the outRegSegmGrp property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfOutRegSegmGrp }
     *     
     */
    public ArrayOfOutRegSegmGrp getOutRegSegmGrp() {
        return outRegSegmGrp;
    }

    /**
     * Sets the value of the outRegSegmGrp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfOutRegSegmGrp }
     *     
     */
    public void setOutRegSegmGrp(ArrayOfOutRegSegmGrp value) {
        this.outRegSegmGrp = value;
    }

    /**
     * Gets the value of the outBillMassRegisterBmasRegCcy property.
     * 
     */
    public int getOutBillMassRegisterBmasRegCcy() {
        return outBillMassRegisterBmasRegCcy;
    }

    /**
     * Sets the value of the outBillMassRegisterBmasRegCcy property.
     * 
     */
    public void setOutBillMassRegisterBmasRegCcy(int value) {
        this.outBillMassRegisterBmasRegCcy = value;
    }

    /**
     * Gets the value of the outCurrencyIdCurrency property.
     * 
     */
    public int getOutCurrencyIdCurrency() {
        return outCurrencyIdCurrency;
    }

    /**
     * Sets the value of the outCurrencyIdCurrency property.
     * 
     */
    public void setOutCurrencyIdCurrency(int value) {
        this.outCurrencyIdCurrency = value;
    }

    /**
     * Gets the value of the outCurrencyShortDescr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCurrencyShortDescr() {
        return outCurrencyShortDescr;
    }

    /**
     * Sets the value of the outCurrencyShortDescr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCurrencyShortDescr(String value) {
        this.outCurrencyShortDescr = value;
    }

    /**
     * Gets the value of the outCurrencyDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCurrencyDescription() {
        return outCurrencyDescription;
    }

    /**
     * Sets the value of the outCurrencyDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCurrencyDescription(String value) {
        this.outCurrencyDescription = value;
    }

    /**
     * Gets the value of the outCurrencyIsoCode property.
     * 
     */
    public int getOutCurrencyIsoCode() {
        return outCurrencyIsoCode;
    }

    /**
     * Sets the value of the outCurrencyIsoCode property.
     * 
     */
    public void setOutCurrencyIsoCode(int value) {
        this.outCurrencyIsoCode = value;
    }

    /**
     * Gets the value of the outTargetAmountIefSuppliedTargetAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutTargetAmountIefSuppliedTargetAmount() {
        return outTargetAmountIefSuppliedTargetAmount;
    }

    /**
     * Sets the value of the outTargetAmountIefSuppliedTargetAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutTargetAmountIefSuppliedTargetAmount(BigDecimal value) {
        this.outTargetAmountIefSuppliedTargetAmount = value;
    }

    /**
     * Gets the value of the outRateIefSuppliedRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutRateIefSuppliedRate() {
        return outRateIefSuppliedRate;
    }

    /**
     * Sets the value of the outRateIefSuppliedRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutRateIefSuppliedRate(BigDecimal value) {
        this.outRateIefSuppliedRate = value;
    }

    /**
     * Gets the value of the outDomesticCurrencyIdCurrency property.
     * 
     */
    public int getOutDomesticCurrencyIdCurrency() {
        return outDomesticCurrencyIdCurrency;
    }

    /**
     * Sets the value of the outDomesticCurrencyIdCurrency property.
     * 
     */
    public void setOutDomesticCurrencyIdCurrency(int value) {
        this.outDomesticCurrencyIdCurrency = value;
    }

}
