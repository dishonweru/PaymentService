
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for CMS3601V_NewCardApplicationManagement_V2Export complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CMS3601V_NewCardApplicationManagement_V2Export">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}BaseExport">
 *       &lt;sequence>
 *         &lt;element name="OurCartpGenericDetailDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OurCartpGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutCmsCardApplApplicationSn" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OutCmsCardApplCardAtmbin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCmsCardApplCardCount" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OutCmsCardApplCardNameLatin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCmsCardApplCardSn" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OutCmsCardApplCardSurnameLatin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCmsCardApplComments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCmsCardApplCreationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutCmsCardApplCreationUnit" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutCmsCardApplCreationUser" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCmsCardApplEmail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCmsCardApplEntryStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCmsCardApplExpAccCd" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutCmsCardApplExpAccNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCmsCardApplExpAccPrfsys" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutCmsCardApplExpTmstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutCmsCardApplExpTunDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutCmsCardApplExpTunUnit" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutCmsCardApplExpTunUsr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCmsCardApplExpTunUsrIntSn" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutCmsCardApplExpTunUsrSn" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutCmsCardApplExpiryDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutCmsCardApplFathernameLatin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCmsCardApplFinalizationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutCmsCardApplMobile" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCmsCardApplPinIssuanceFlg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCmsCardApplTmstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutCmsCardApplTunAprvDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutCmsCardApplTunAprvUnit" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutCmsCardApplTunAprvUsr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCmsCardApplTunAprvUsrInSn" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutCmsCardApplTunAprvUsrSn" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutCmsCardApplTunDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutCmsCardApplTunUnit" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutCmsCardApplTunUsr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCmsCardApplTunUsrIntSn" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutCmsCardApplTunUsrSn" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutCmsLimitHdCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCmsLimitHdDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCmsStatusDescrCharSuppliedChar20" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCmsStatusDescrCharSuppliedChar30" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCntryGenericDetailDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustAddressAddress1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustAddressAddress2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustAddressAddressType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustAddressCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustAddressCommunicationAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustAddressEntryComments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustAddressEntryStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustAddressFaxNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustAddressLatinInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustAddressMailBox" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustAddressPtsInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustAddressRegion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustAddressSegmFlags" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustAddressSerialNum" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutCustAddressTelephone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustAddressTmstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutCustAddressZipCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustTitleListSetDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustomerBirthplace" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustomerCDigit" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutCustomerCustId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutCustomerCustType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustomerDateOfBirth" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutCustomerFatherName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustomerFirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustomerLatinFirstname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustomerLatinSurname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustomerMiddleName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustomerMobileTel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustomerMotherName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustomerNoAfm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustomerShortName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustomerSurname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustomerTitle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutDeltpGenericDetailDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutDeltpGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutDepTrxRecordingOFinalAccAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutDepTrxRecordingTrxUsrSn" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutDepTrxRecordingTunInternalSn" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutDepTrxRecordingUUserTotalsAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutDomCurrencyIdCurrency" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutDomCurrencyShortDescr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutDoyGenericDetailDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutErrorMessageIefSuppliedActionEntryMsg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutExpAccDetailsProfitsAccountDepOpenUnit" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutExpAccDetailsProfitsAccountLnsOpenUnit" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutExpAccDetailsProfitsAccountMonotoringUnit" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutExpAccDetailsProfitsAccountMovementCurrency" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutExpAccDetailsProfitsAccountPrftSystem" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutExpAccDetailsProfitsAccountProductId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutFoundIefSuppliedFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutIefSuppliedActionEntryDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutIefSuppliedSrvStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutMntRecordingAuthorizer1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutMntRecordingAuthorizer2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutMntRecordingChannelId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutMntRecordingGrpSubscript" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutMntRecordingIdJustific" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutMntRecordingIdProduct" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutMntRecordingPrftSystem" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutMntRecordingReversalFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutMntRecordingTerminalNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutMntRecordingTmstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutMntRecordingTrxCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutMntRecordingTrxDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutMntRecordingTrxDetails" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutMntRecordingTrxUnit" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutMntRecordingTrxUser" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutMntRecordingTrxUsrSn" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutOidtpGenericDetailDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutOtherAfmAfmNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutOtherAfmMainFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutOtherIdExpiryDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutOtherIdIdNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutOtherIdIncompleteUComnt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutOtherIdIssueAuthority" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutOtherIdIssueDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutOtherIdMainFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutOtherIdSerialNo" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutParVoucherRunVoucherLine" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSelectedProfitsAccountAccStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSelectedProfitsAccountAccountCd" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutSelectedProfitsAccountAccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSelectedProfitsAccountAccountSerNum" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OutSelectedProfitsAccountAgrMembershipSn" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutSelectedProfitsAccountAgrSn" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutSelectedProfitsAccountAgrUnit" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutSelectedProfitsAccountAgrYear" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutSelectedProfitsAccountCDigit" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutSelectedProfitsAccountCustId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutSelectedProfitsAccountDepAccNumber" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OutSelectedProfitsAccountDepOpenUnit" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutSelectedProfitsAccountIban" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSelectedProfitsAccountIdPackage" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
 *         &lt;element name="OutSuccessfulTransactionWorkAdviceCounter" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutTeamInformationAccountCode" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OutTeamInformationAuthorizationResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutTeamInformationChargeDiscount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutTeamInformationCommissionDiscount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutTeamInformationCustomerCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutTeamInformationCustomerSurname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutTeamInformationEvaluationResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutTeamInformationJustificationDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutTeamInformationJustificationId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutTeamInformationProductDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutTeamInformationProductId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutTeamInformationRequiredProfile1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutTeamInformationRequiredProfile2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutTeamInformationTransactionDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutTeamInformationTransactionId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutTeamInformationTrsAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutTeamInformationUnitCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutTeamInformationUserCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutTeamInformationUserProfile1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutTeamInformationUserProfile2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutTeamInformationUserProfile3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCmsCardApplCardReissueFlg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutPrintStatusIefSuppliedChar2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCmsOrdInventoryPan" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutAccGrp" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}ArrayOfCMS3601VOutAccGrpItem_V2" minOccurs="0"/>
 *         &lt;element name="OutCnctypGrp" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}ArrayOfCMS3601VOutCnctypGrpItem_V2" minOccurs="0"/>
 *         &lt;element name="OutCrdtypGrp" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}ArrayOfCMS3601VOutCrdtypGrpItem_V2" minOccurs="0"/>
 *         &lt;element name="OutDeltypGrp" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}ArrayOfCMS3601VOutDeltypGrpItem_V2" minOccurs="0"/>
 *         &lt;element name="OutTransGrp" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}ArrayOfCMS3601VOutTransGrpItem_V2" minOccurs="0"/>
 *         &lt;element name="OutTrstypGrp" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}ArrayOfCMS3601VOutTrstypGrpItem_V2" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CMS3601V_NewCardApplicationManagement_V2Export", propOrder = {
    "ourCartpGenericDetailDescription",
    "ourCartpGenericDetailSerialNum",
    "outCmsCardApplApplicationSn",
    "outCmsCardApplCardAtmbin",
    "outCmsCardApplCardCount",
    "outCmsCardApplCardNameLatin",
    "outCmsCardApplCardSn",
    "outCmsCardApplCardSurnameLatin",
    "outCmsCardApplComments",
    "outCmsCardApplCreationDate",
    "outCmsCardApplCreationUnit",
    "outCmsCardApplCreationUser",
    "outCmsCardApplEmail",
    "outCmsCardApplEntryStatus",
    "outCmsCardApplExpAccCd",
    "outCmsCardApplExpAccNumber",
    "outCmsCardApplExpAccPrfsys",
    "outCmsCardApplExpTmstamp",
    "outCmsCardApplExpTunDate",
    "outCmsCardApplExpTunUnit",
    "outCmsCardApplExpTunUsr",
    "outCmsCardApplExpTunUsrIntSn",
    "outCmsCardApplExpTunUsrSn",
    "outCmsCardApplExpiryDate",
    "outCmsCardApplFathernameLatin",
    "outCmsCardApplFinalizationDate",
    "outCmsCardApplMobile",
    "outCmsCardApplPinIssuanceFlg",
    "outCmsCardApplTmstamp",
    "outCmsCardApplTunAprvDate",
    "outCmsCardApplTunAprvUnit",
    "outCmsCardApplTunAprvUsr",
    "outCmsCardApplTunAprvUsrInSn",
    "outCmsCardApplTunAprvUsrSn",
    "outCmsCardApplTunDate",
    "outCmsCardApplTunUnit",
    "outCmsCardApplTunUsr",
    "outCmsCardApplTunUsrIntSn",
    "outCmsCardApplTunUsrSn",
    "outCmsLimitHdCode",
    "outCmsLimitHdDescription",
    "outCmsStatusDescrCharSuppliedChar20",
    "outCmsStatusDescrCharSuppliedChar30",
    "outCntryGenericDetailDescription",
    "outCustAddressAddress1",
    "outCustAddressAddress2",
    "outCustAddressAddressType",
    "outCustAddressCity",
    "outCustAddressCommunicationAddress",
    "outCustAddressEntryComments",
    "outCustAddressEntryStatus",
    "outCustAddressFaxNo",
    "outCustAddressLatinInd",
    "outCustAddressMailBox",
    "outCustAddressPtsInd",
    "outCustAddressRegion",
    "outCustAddressSegmFlags",
    "outCustAddressSerialNum",
    "outCustAddressTelephone",
    "outCustAddressTmstamp",
    "outCustAddressZipCode",
    "outCustTitleListSetDescription",
    "outCustomerBirthplace",
    "outCustomerCDigit",
    "outCustomerCustId",
    "outCustomerCustType",
    "outCustomerDateOfBirth",
    "outCustomerFatherName",
    "outCustomerFirstName",
    "outCustomerLatinFirstname",
    "outCustomerLatinSurname",
    "outCustomerMiddleName",
    "outCustomerMobileTel",
    "outCustomerMotherName",
    "outCustomerNoAfm",
    "outCustomerShortName",
    "outCustomerSurname",
    "outCustomerTitle",
    "outDeltpGenericDetailDescription",
    "outDeltpGenericDetailSerialNum",
    "outDepTrxRecordingOFinalAccAmount",
    "outDepTrxRecordingTrxUsrSn",
    "outDepTrxRecordingTunInternalSn",
    "outDepTrxRecordingUUserTotalsAmn",
    "outDomCurrencyIdCurrency",
    "outDomCurrencyShortDescr",
    "outDoyGenericDetailDescription",
    "outErrorMessageIefSuppliedActionEntryMsg",
    "outExpAccDetailsProfitsAccountDepOpenUnit",
    "outExpAccDetailsProfitsAccountLnsOpenUnit",
    "outExpAccDetailsProfitsAccountMonotoringUnit",
    "outExpAccDetailsProfitsAccountMovementCurrency",
    "outExpAccDetailsProfitsAccountPrftSystem",
    "outExpAccDetailsProfitsAccountProductId",
    "outFoundIefSuppliedFlag",
    "outIefSuppliedActionEntryDesc",
    "outIefSuppliedSrvStatus",
    "outMntRecordingAuthorizer1",
    "outMntRecordingAuthorizer2",
    "outMntRecordingChannelId",
    "outMntRecordingGrpSubscript",
    "outMntRecordingIdJustific",
    "outMntRecordingIdProduct",
    "outMntRecordingPrftSystem",
    "outMntRecordingReversalFlag",
    "outMntRecordingTerminalNumber",
    "outMntRecordingTmstamp",
    "outMntRecordingTrxCode",
    "outMntRecordingTrxDate",
    "outMntRecordingTrxDetails",
    "outMntRecordingTrxUnit",
    "outMntRecordingTrxUser",
    "outMntRecordingTrxUsrSn",
    "outOidtpGenericDetailDescription",
    "outOtherAfmAfmNo",
    "outOtherAfmMainFlag",
    "outOtherIdExpiryDate",
    "outOtherIdIdNo",
    "outOtherIdIncompleteUComnt",
    "outOtherIdIssueAuthority",
    "outOtherIdIssueDate",
    "outOtherIdMainFlag",
    "outOtherIdSerialNo",
    "outParVoucherRunVoucherLine",
    "outSelectedProfitsAccountAccStatus",
    "outSelectedProfitsAccountAccountCd",
    "outSelectedProfitsAccountAccountNumber",
    "outSelectedProfitsAccountAccountSerNum",
    "outSelectedProfitsAccountAgrMembershipSn",
    "outSelectedProfitsAccountAgrSn",
    "outSelectedProfitsAccountAgrUnit",
    "outSelectedProfitsAccountAgrYear",
    "outSelectedProfitsAccountCDigit",
    "outSelectedProfitsAccountCustId",
    "outSelectedProfitsAccountDepAccNumber",
    "outSelectedProfitsAccountDepOpenUnit",
    "outSelectedProfitsAccountIban",
    "outSelectedProfitsAccountIdPackage",
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
    "outSuccessfulTransactionWorkAdviceCounter",
    "outTeamInformationAccountCode",
    "outTeamInformationAuthorizationResult",
    "outTeamInformationChargeDiscount",
    "outTeamInformationCommissionDiscount",
    "outTeamInformationCustomerCode",
    "outTeamInformationCustomerSurname",
    "outTeamInformationEvaluationResult",
    "outTeamInformationJustificationDescription",
    "outTeamInformationJustificationId",
    "outTeamInformationProductDescription",
    "outTeamInformationProductId",
    "outTeamInformationRequiredProfile1",
    "outTeamInformationRequiredProfile2",
    "outTeamInformationTransactionDescription",
    "outTeamInformationTransactionId",
    "outTeamInformationTrsAmount",
    "outTeamInformationUnitCode",
    "outTeamInformationUserCode",
    "outTeamInformationUserProfile1",
    "outTeamInformationUserProfile2",
    "outTeamInformationUserProfile3",
    "outCmsCardApplCardReissueFlg",
    "outPrintStatusIefSuppliedChar2",
    "outCmsOrdInventoryPan",
    "outAccGrp",
    "outCnctypGrp",
    "outCrdtypGrp",
    "outDeltypGrp",
    "outTransGrp",
    "outTrstypGrp"
})
public class CMS3601VNewCardApplicationManagementV2Export
    extends BaseExport
{

    @XmlElement(name = "OurCartpGenericDetailDescription")
    protected String ourCartpGenericDetailDescription;
    @XmlElement(name = "OurCartpGenericDetailSerialNum")
    protected int ourCartpGenericDetailSerialNum;
    @XmlElement(name = "OutCmsCardApplApplicationSn")
    protected double outCmsCardApplApplicationSn;
    @XmlElement(name = "OutCmsCardApplCardAtmbin")
    protected String outCmsCardApplCardAtmbin;
    @XmlElement(name = "OutCmsCardApplCardCount")
    protected double outCmsCardApplCardCount;
    @XmlElement(name = "OutCmsCardApplCardNameLatin")
    protected String outCmsCardApplCardNameLatin;
    @XmlElement(name = "OutCmsCardApplCardSn")
    protected double outCmsCardApplCardSn;
    @XmlElement(name = "OutCmsCardApplCardSurnameLatin")
    protected String outCmsCardApplCardSurnameLatin;
    @XmlElement(name = "OutCmsCardApplComments")
    protected String outCmsCardApplComments;
    @XmlElement(name = "OutCmsCardApplCreationDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outCmsCardApplCreationDate;
    @XmlElement(name = "OutCmsCardApplCreationUnit")
    protected int outCmsCardApplCreationUnit;
    @XmlElement(name = "OutCmsCardApplCreationUser")
    protected String outCmsCardApplCreationUser;
    @XmlElement(name = "OutCmsCardApplEmail")
    protected String outCmsCardApplEmail;
    @XmlElement(name = "OutCmsCardApplEntryStatus")
    protected String outCmsCardApplEntryStatus;
    @XmlElement(name = "OutCmsCardApplExpAccCd")
    protected short outCmsCardApplExpAccCd;
    @XmlElement(name = "OutCmsCardApplExpAccNumber")
    protected String outCmsCardApplExpAccNumber;
    @XmlElement(name = "OutCmsCardApplExpAccPrfsys")
    protected short outCmsCardApplExpAccPrfsys;
    @XmlElement(name = "OutCmsCardApplExpTmstamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outCmsCardApplExpTmstamp;
    @XmlElement(name = "OutCmsCardApplExpTunDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outCmsCardApplExpTunDate;
    @XmlElement(name = "OutCmsCardApplExpTunUnit")
    protected int outCmsCardApplExpTunUnit;
    @XmlElement(name = "OutCmsCardApplExpTunUsr")
    protected String outCmsCardApplExpTunUsr;
    @XmlElement(name = "OutCmsCardApplExpTunUsrIntSn")
    protected short outCmsCardApplExpTunUsrIntSn;
    @XmlElement(name = "OutCmsCardApplExpTunUsrSn")
    protected int outCmsCardApplExpTunUsrSn;
    @XmlElement(name = "OutCmsCardApplExpiryDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outCmsCardApplExpiryDate;
    @XmlElement(name = "OutCmsCardApplFathernameLatin")
    protected String outCmsCardApplFathernameLatin;
    @XmlElement(name = "OutCmsCardApplFinalizationDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outCmsCardApplFinalizationDate;
    @XmlElement(name = "OutCmsCardApplMobile")
    protected String outCmsCardApplMobile;
    @XmlElement(name = "OutCmsCardApplPinIssuanceFlg")
    protected String outCmsCardApplPinIssuanceFlg;
    @XmlElement(name = "OutCmsCardApplTmstamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outCmsCardApplTmstamp;
    @XmlElement(name = "OutCmsCardApplTunAprvDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outCmsCardApplTunAprvDate;
    @XmlElement(name = "OutCmsCardApplTunAprvUnit")
    protected int outCmsCardApplTunAprvUnit;
    @XmlElement(name = "OutCmsCardApplTunAprvUsr")
    protected String outCmsCardApplTunAprvUsr;
    @XmlElement(name = "OutCmsCardApplTunAprvUsrInSn")
    protected short outCmsCardApplTunAprvUsrInSn;
    @XmlElement(name = "OutCmsCardApplTunAprvUsrSn")
    protected int outCmsCardApplTunAprvUsrSn;
    @XmlElement(name = "OutCmsCardApplTunDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outCmsCardApplTunDate;
    @XmlElement(name = "OutCmsCardApplTunUnit")
    protected int outCmsCardApplTunUnit;
    @XmlElement(name = "OutCmsCardApplTunUsr")
    protected String outCmsCardApplTunUsr;
    @XmlElement(name = "OutCmsCardApplTunUsrIntSn")
    protected short outCmsCardApplTunUsrIntSn;
    @XmlElement(name = "OutCmsCardApplTunUsrSn")
    protected int outCmsCardApplTunUsrSn;
    @XmlElement(name = "OutCmsLimitHdCode")
    protected String outCmsLimitHdCode;
    @XmlElement(name = "OutCmsLimitHdDescription")
    protected String outCmsLimitHdDescription;
    @XmlElement(name = "OutCmsStatusDescrCharSuppliedChar20")
    protected String outCmsStatusDescrCharSuppliedChar20;
    @XmlElement(name = "OutCmsStatusDescrCharSuppliedChar30")
    protected String outCmsStatusDescrCharSuppliedChar30;
    @XmlElement(name = "OutCntryGenericDetailDescription")
    protected String outCntryGenericDetailDescription;
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
    @XmlElement(name = "OutCustAddressEntryComments")
    protected String outCustAddressEntryComments;
    @XmlElement(name = "OutCustAddressEntryStatus")
    protected String outCustAddressEntryStatus;
    @XmlElement(name = "OutCustAddressFaxNo")
    protected String outCustAddressFaxNo;
    @XmlElement(name = "OutCustAddressLatinInd")
    protected String outCustAddressLatinInd;
    @XmlElement(name = "OutCustAddressMailBox")
    protected String outCustAddressMailBox;
    @XmlElement(name = "OutCustAddressPtsInd")
    protected String outCustAddressPtsInd;
    @XmlElement(name = "OutCustAddressRegion")
    protected String outCustAddressRegion;
    @XmlElement(name = "OutCustAddressSegmFlags")
    protected String outCustAddressSegmFlags;
    @XmlElement(name = "OutCustAddressSerialNum")
    protected short outCustAddressSerialNum;
    @XmlElement(name = "OutCustAddressTelephone")
    protected String outCustAddressTelephone;
    @XmlElement(name = "OutCustAddressTmstamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outCustAddressTmstamp;
    @XmlElement(name = "OutCustAddressZipCode")
    protected String outCustAddressZipCode;
    @XmlElement(name = "OutCustTitleListSetDescription")
    protected String outCustTitleListSetDescription;
    @XmlElement(name = "OutCustomerBirthplace")
    protected String outCustomerBirthplace;
    @XmlElement(name = "OutCustomerCDigit")
    protected short outCustomerCDigit;
    @XmlElement(name = "OutCustomerCustId")
    protected int outCustomerCustId;
    @XmlElement(name = "OutCustomerCustType")
    protected String outCustomerCustType;
    @XmlElement(name = "OutCustomerDateOfBirth", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outCustomerDateOfBirth;
    @XmlElement(name = "OutCustomerFatherName")
    protected String outCustomerFatherName;
    @XmlElement(name = "OutCustomerFirstName")
    protected String outCustomerFirstName;
    @XmlElement(name = "OutCustomerLatinFirstname")
    protected String outCustomerLatinFirstname;
    @XmlElement(name = "OutCustomerLatinSurname")
    protected String outCustomerLatinSurname;
    @XmlElement(name = "OutCustomerMiddleName")
    protected String outCustomerMiddleName;
    @XmlElement(name = "OutCustomerMobileTel")
    protected String outCustomerMobileTel;
    @XmlElement(name = "OutCustomerMotherName")
    protected String outCustomerMotherName;
    @XmlElement(name = "OutCustomerNoAfm")
    protected String outCustomerNoAfm;
    @XmlElement(name = "OutCustomerShortName")
    protected String outCustomerShortName;
    @XmlElement(name = "OutCustomerSurname")
    protected String outCustomerSurname;
    @XmlElement(name = "OutCustomerTitle")
    protected String outCustomerTitle;
    @XmlElement(name = "OutDeltpGenericDetailDescription")
    protected String outDeltpGenericDetailDescription;
    @XmlElement(name = "OutDeltpGenericDetailSerialNum")
    protected int outDeltpGenericDetailSerialNum;
    @XmlElement(name = "OutDepTrxRecordingOFinalAccAmount", required = true)
    protected BigDecimal outDepTrxRecordingOFinalAccAmount;
    @XmlElement(name = "OutDepTrxRecordingTrxUsrSn")
    protected int outDepTrxRecordingTrxUsrSn;
    @XmlElement(name = "OutDepTrxRecordingTunInternalSn")
    protected short outDepTrxRecordingTunInternalSn;
    @XmlElement(name = "OutDepTrxRecordingUUserTotalsAmn", required = true)
    protected BigDecimal outDepTrxRecordingUUserTotalsAmn;
    @XmlElement(name = "OutDomCurrencyIdCurrency")
    protected int outDomCurrencyIdCurrency;
    @XmlElement(name = "OutDomCurrencyShortDescr")
    protected String outDomCurrencyShortDescr;
    @XmlElement(name = "OutDoyGenericDetailDescription")
    protected String outDoyGenericDetailDescription;
    @XmlElement(name = "OutErrorMessageIefSuppliedActionEntryMsg")
    protected String outErrorMessageIefSuppliedActionEntryMsg;
    @XmlElement(name = "OutExpAccDetailsProfitsAccountDepOpenUnit")
    protected int outExpAccDetailsProfitsAccountDepOpenUnit;
    @XmlElement(name = "OutExpAccDetailsProfitsAccountLnsOpenUnit")
    protected int outExpAccDetailsProfitsAccountLnsOpenUnit;
    @XmlElement(name = "OutExpAccDetailsProfitsAccountMonotoringUnit")
    protected int outExpAccDetailsProfitsAccountMonotoringUnit;
    @XmlElement(name = "OutExpAccDetailsProfitsAccountMovementCurrency")
    protected int outExpAccDetailsProfitsAccountMovementCurrency;
    @XmlElement(name = "OutExpAccDetailsProfitsAccountPrftSystem")
    protected short outExpAccDetailsProfitsAccountPrftSystem;
    @XmlElement(name = "OutExpAccDetailsProfitsAccountProductId")
    protected int outExpAccDetailsProfitsAccountProductId;
    @XmlElement(name = "OutFoundIefSuppliedFlag")
    protected String outFoundIefSuppliedFlag;
    @XmlElement(name = "OutIefSuppliedActionEntryDesc")
    protected String outIefSuppliedActionEntryDesc;
    @XmlElement(name = "OutIefSuppliedSrvStatus")
    protected String outIefSuppliedSrvStatus;
    @XmlElement(name = "OutMntRecordingAuthorizer1")
    protected String outMntRecordingAuthorizer1;
    @XmlElement(name = "OutMntRecordingAuthorizer2")
    protected String outMntRecordingAuthorizer2;
    @XmlElement(name = "OutMntRecordingChannelId")
    protected int outMntRecordingChannelId;
    @XmlElement(name = "OutMntRecordingGrpSubscript")
    protected short outMntRecordingGrpSubscript;
    @XmlElement(name = "OutMntRecordingIdJustific")
    protected int outMntRecordingIdJustific;
    @XmlElement(name = "OutMntRecordingIdProduct")
    protected int outMntRecordingIdProduct;
    @XmlElement(name = "OutMntRecordingPrftSystem")
    protected short outMntRecordingPrftSystem;
    @XmlElement(name = "OutMntRecordingReversalFlag")
    protected String outMntRecordingReversalFlag;
    @XmlElement(name = "OutMntRecordingTerminalNumber")
    protected String outMntRecordingTerminalNumber;
    @XmlElement(name = "OutMntRecordingTmstamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outMntRecordingTmstamp;
    @XmlElement(name = "OutMntRecordingTrxCode")
    protected int outMntRecordingTrxCode;
    @XmlElement(name = "OutMntRecordingTrxDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outMntRecordingTrxDate;
    @XmlElement(name = "OutMntRecordingTrxDetails")
    protected String outMntRecordingTrxDetails;
    @XmlElement(name = "OutMntRecordingTrxUnit")
    protected int outMntRecordingTrxUnit;
    @XmlElement(name = "OutMntRecordingTrxUser")
    protected String outMntRecordingTrxUser;
    @XmlElement(name = "OutMntRecordingTrxUsrSn")
    protected int outMntRecordingTrxUsrSn;
    @XmlElement(name = "OutOidtpGenericDetailDescription")
    protected String outOidtpGenericDetailDescription;
    @XmlElement(name = "OutOtherAfmAfmNo")
    protected String outOtherAfmAfmNo;
    @XmlElement(name = "OutOtherAfmMainFlag")
    protected String outOtherAfmMainFlag;
    @XmlElement(name = "OutOtherIdExpiryDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outOtherIdExpiryDate;
    @XmlElement(name = "OutOtherIdIdNo")
    protected String outOtherIdIdNo;
    @XmlElement(name = "OutOtherIdIncompleteUComnt")
    protected String outOtherIdIncompleteUComnt;
    @XmlElement(name = "OutOtherIdIssueAuthority")
    protected String outOtherIdIssueAuthority;
    @XmlElement(name = "OutOtherIdIssueDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outOtherIdIssueDate;
    @XmlElement(name = "OutOtherIdMainFlag")
    protected String outOtherIdMainFlag;
    @XmlElement(name = "OutOtherIdSerialNo")
    protected short outOtherIdSerialNo;
    @XmlElement(name = "OutParVoucherRunVoucherLine")
    protected String outParVoucherRunVoucherLine;
    @XmlElement(name = "OutSelectedProfitsAccountAccStatus")
    protected String outSelectedProfitsAccountAccStatus;
    @XmlElement(name = "OutSelectedProfitsAccountAccountCd")
    protected short outSelectedProfitsAccountAccountCd;
    @XmlElement(name = "OutSelectedProfitsAccountAccountNumber")
    protected String outSelectedProfitsAccountAccountNumber;
    @XmlElement(name = "OutSelectedProfitsAccountAccountSerNum")
    protected double outSelectedProfitsAccountAccountSerNum;
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
    @XmlElement(name = "OutSelectedProfitsAccountIban")
    protected String outSelectedProfitsAccountIban;
    @XmlElement(name = "OutSelectedProfitsAccountIdPackage")
    protected int outSelectedProfitsAccountIdPackage;
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
    @XmlElement(name = "OutSuccessfulTransactionWorkAdviceCounter")
    protected int outSuccessfulTransactionWorkAdviceCounter;
    @XmlElement(name = "OutTeamInformationAccountCode")
    protected double outTeamInformationAccountCode;
    @XmlElement(name = "OutTeamInformationAuthorizationResult")
    protected String outTeamInformationAuthorizationResult;
    @XmlElement(name = "OutTeamInformationChargeDiscount", required = true)
    protected BigDecimal outTeamInformationChargeDiscount;
    @XmlElement(name = "OutTeamInformationCommissionDiscount", required = true)
    protected BigDecimal outTeamInformationCommissionDiscount;
    @XmlElement(name = "OutTeamInformationCustomerCode")
    protected int outTeamInformationCustomerCode;
    @XmlElement(name = "OutTeamInformationCustomerSurname")
    protected String outTeamInformationCustomerSurname;
    @XmlElement(name = "OutTeamInformationEvaluationResult")
    protected String outTeamInformationEvaluationResult;
    @XmlElement(name = "OutTeamInformationJustificationDescription")
    protected String outTeamInformationJustificationDescription;
    @XmlElement(name = "OutTeamInformationJustificationId")
    protected int outTeamInformationJustificationId;
    @XmlElement(name = "OutTeamInformationProductDescription")
    protected String outTeamInformationProductDescription;
    @XmlElement(name = "OutTeamInformationProductId")
    protected int outTeamInformationProductId;
    @XmlElement(name = "OutTeamInformationRequiredProfile1")
    protected String outTeamInformationRequiredProfile1;
    @XmlElement(name = "OutTeamInformationRequiredProfile2")
    protected String outTeamInformationRequiredProfile2;
    @XmlElement(name = "OutTeamInformationTransactionDescription")
    protected String outTeamInformationTransactionDescription;
    @XmlElement(name = "OutTeamInformationTransactionId")
    protected int outTeamInformationTransactionId;
    @XmlElement(name = "OutTeamInformationTrsAmount", required = true)
    protected BigDecimal outTeamInformationTrsAmount;
    @XmlElement(name = "OutTeamInformationUnitCode")
    protected int outTeamInformationUnitCode;
    @XmlElement(name = "OutTeamInformationUserCode")
    protected String outTeamInformationUserCode;
    @XmlElement(name = "OutTeamInformationUserProfile1")
    protected String outTeamInformationUserProfile1;
    @XmlElement(name = "OutTeamInformationUserProfile2")
    protected String outTeamInformationUserProfile2;
    @XmlElement(name = "OutTeamInformationUserProfile3")
    protected String outTeamInformationUserProfile3;
    @XmlElement(name = "OutCmsCardApplCardReissueFlg")
    protected String outCmsCardApplCardReissueFlg;
    @XmlElement(name = "OutPrintStatusIefSuppliedChar2")
    protected String outPrintStatusIefSuppliedChar2;
    @XmlElement(name = "OutCmsOrdInventoryPan")
    protected String outCmsOrdInventoryPan;
    @XmlElement(name = "OutAccGrp")
    protected ArrayOfCMS3601VOutAccGrpItemV2 outAccGrp;
    @XmlElement(name = "OutCnctypGrp")
    protected ArrayOfCMS3601VOutCnctypGrpItemV2 outCnctypGrp;
    @XmlElement(name = "OutCrdtypGrp")
    protected ArrayOfCMS3601VOutCrdtypGrpItemV2 outCrdtypGrp;
    @XmlElement(name = "OutDeltypGrp")
    protected ArrayOfCMS3601VOutDeltypGrpItemV2 outDeltypGrp;
    @XmlElement(name = "OutTransGrp")
    protected ArrayOfCMS3601VOutTransGrpItemV2 outTransGrp;
    @XmlElement(name = "OutTrstypGrp")
    protected ArrayOfCMS3601VOutTrstypGrpItemV2 outTrstypGrp;

    /**
     * Gets the value of the ourCartpGenericDetailDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOurCartpGenericDetailDescription() {
        return ourCartpGenericDetailDescription;
    }

    /**
     * Sets the value of the ourCartpGenericDetailDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOurCartpGenericDetailDescription(String value) {
        this.ourCartpGenericDetailDescription = value;
    }

    /**
     * Gets the value of the ourCartpGenericDetailSerialNum property.
     * 
     */
    public int getOurCartpGenericDetailSerialNum() {
        return ourCartpGenericDetailSerialNum;
    }

    /**
     * Sets the value of the ourCartpGenericDetailSerialNum property.
     * 
     */
    public void setOurCartpGenericDetailSerialNum(int value) {
        this.ourCartpGenericDetailSerialNum = value;
    }

    /**
     * Gets the value of the outCmsCardApplApplicationSn property.
     * 
     */
    public double getOutCmsCardApplApplicationSn() {
        return outCmsCardApplApplicationSn;
    }

    /**
     * Sets the value of the outCmsCardApplApplicationSn property.
     * 
     */
    public void setOutCmsCardApplApplicationSn(double value) {
        this.outCmsCardApplApplicationSn = value;
    }

    /**
     * Gets the value of the outCmsCardApplCardAtmbin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCmsCardApplCardAtmbin() {
        return outCmsCardApplCardAtmbin;
    }

    /**
     * Sets the value of the outCmsCardApplCardAtmbin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCmsCardApplCardAtmbin(String value) {
        this.outCmsCardApplCardAtmbin = value;
    }

    /**
     * Gets the value of the outCmsCardApplCardCount property.
     * 
     */
    public double getOutCmsCardApplCardCount() {
        return outCmsCardApplCardCount;
    }

    /**
     * Sets the value of the outCmsCardApplCardCount property.
     * 
     */
    public void setOutCmsCardApplCardCount(double value) {
        this.outCmsCardApplCardCount = value;
    }

    /**
     * Gets the value of the outCmsCardApplCardNameLatin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCmsCardApplCardNameLatin() {
        return outCmsCardApplCardNameLatin;
    }

    /**
     * Sets the value of the outCmsCardApplCardNameLatin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCmsCardApplCardNameLatin(String value) {
        this.outCmsCardApplCardNameLatin = value;
    }

    /**
     * Gets the value of the outCmsCardApplCardSn property.
     * 
     */
    public double getOutCmsCardApplCardSn() {
        return outCmsCardApplCardSn;
    }

    /**
     * Sets the value of the outCmsCardApplCardSn property.
     * 
     */
    public void setOutCmsCardApplCardSn(double value) {
        this.outCmsCardApplCardSn = value;
    }

    /**
     * Gets the value of the outCmsCardApplCardSurnameLatin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCmsCardApplCardSurnameLatin() {
        return outCmsCardApplCardSurnameLatin;
    }

    /**
     * Sets the value of the outCmsCardApplCardSurnameLatin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCmsCardApplCardSurnameLatin(String value) {
        this.outCmsCardApplCardSurnameLatin = value;
    }

    /**
     * Gets the value of the outCmsCardApplComments property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCmsCardApplComments() {
        return outCmsCardApplComments;
    }

    /**
     * Sets the value of the outCmsCardApplComments property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCmsCardApplComments(String value) {
        this.outCmsCardApplComments = value;
    }

    /**
     * Gets the value of the outCmsCardApplCreationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutCmsCardApplCreationDate() {
        return outCmsCardApplCreationDate;
    }

    /**
     * Sets the value of the outCmsCardApplCreationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutCmsCardApplCreationDate(XMLGregorianCalendar value) {
        this.outCmsCardApplCreationDate = value;
    }

    /**
     * Gets the value of the outCmsCardApplCreationUnit property.
     * 
     */
    public int getOutCmsCardApplCreationUnit() {
        return outCmsCardApplCreationUnit;
    }

    /**
     * Sets the value of the outCmsCardApplCreationUnit property.
     * 
     */
    public void setOutCmsCardApplCreationUnit(int value) {
        this.outCmsCardApplCreationUnit = value;
    }

    /**
     * Gets the value of the outCmsCardApplCreationUser property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCmsCardApplCreationUser() {
        return outCmsCardApplCreationUser;
    }

    /**
     * Sets the value of the outCmsCardApplCreationUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCmsCardApplCreationUser(String value) {
        this.outCmsCardApplCreationUser = value;
    }

    /**
     * Gets the value of the outCmsCardApplEmail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCmsCardApplEmail() {
        return outCmsCardApplEmail;
    }

    /**
     * Sets the value of the outCmsCardApplEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCmsCardApplEmail(String value) {
        this.outCmsCardApplEmail = value;
    }

    /**
     * Gets the value of the outCmsCardApplEntryStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCmsCardApplEntryStatus() {
        return outCmsCardApplEntryStatus;
    }

    /**
     * Sets the value of the outCmsCardApplEntryStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCmsCardApplEntryStatus(String value) {
        this.outCmsCardApplEntryStatus = value;
    }

    /**
     * Gets the value of the outCmsCardApplExpAccCd property.
     * 
     */
    public short getOutCmsCardApplExpAccCd() {
        return outCmsCardApplExpAccCd;
    }

    /**
     * Sets the value of the outCmsCardApplExpAccCd property.
     * 
     */
    public void setOutCmsCardApplExpAccCd(short value) {
        this.outCmsCardApplExpAccCd = value;
    }

    /**
     * Gets the value of the outCmsCardApplExpAccNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCmsCardApplExpAccNumber() {
        return outCmsCardApplExpAccNumber;
    }

    /**
     * Sets the value of the outCmsCardApplExpAccNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCmsCardApplExpAccNumber(String value) {
        this.outCmsCardApplExpAccNumber = value;
    }

    /**
     * Gets the value of the outCmsCardApplExpAccPrfsys property.
     * 
     */
    public short getOutCmsCardApplExpAccPrfsys() {
        return outCmsCardApplExpAccPrfsys;
    }

    /**
     * Sets the value of the outCmsCardApplExpAccPrfsys property.
     * 
     */
    public void setOutCmsCardApplExpAccPrfsys(short value) {
        this.outCmsCardApplExpAccPrfsys = value;
    }

    /**
     * Gets the value of the outCmsCardApplExpTmstamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutCmsCardApplExpTmstamp() {
        return outCmsCardApplExpTmstamp;
    }

    /**
     * Sets the value of the outCmsCardApplExpTmstamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutCmsCardApplExpTmstamp(XMLGregorianCalendar value) {
        this.outCmsCardApplExpTmstamp = value;
    }

    /**
     * Gets the value of the outCmsCardApplExpTunDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutCmsCardApplExpTunDate() {
        return outCmsCardApplExpTunDate;
    }

    /**
     * Sets the value of the outCmsCardApplExpTunDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutCmsCardApplExpTunDate(XMLGregorianCalendar value) {
        this.outCmsCardApplExpTunDate = value;
    }

    /**
     * Gets the value of the outCmsCardApplExpTunUnit property.
     * 
     */
    public int getOutCmsCardApplExpTunUnit() {
        return outCmsCardApplExpTunUnit;
    }

    /**
     * Sets the value of the outCmsCardApplExpTunUnit property.
     * 
     */
    public void setOutCmsCardApplExpTunUnit(int value) {
        this.outCmsCardApplExpTunUnit = value;
    }

    /**
     * Gets the value of the outCmsCardApplExpTunUsr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCmsCardApplExpTunUsr() {
        return outCmsCardApplExpTunUsr;
    }

    /**
     * Sets the value of the outCmsCardApplExpTunUsr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCmsCardApplExpTunUsr(String value) {
        this.outCmsCardApplExpTunUsr = value;
    }

    /**
     * Gets the value of the outCmsCardApplExpTunUsrIntSn property.
     * 
     */
    public short getOutCmsCardApplExpTunUsrIntSn() {
        return outCmsCardApplExpTunUsrIntSn;
    }

    /**
     * Sets the value of the outCmsCardApplExpTunUsrIntSn property.
     * 
     */
    public void setOutCmsCardApplExpTunUsrIntSn(short value) {
        this.outCmsCardApplExpTunUsrIntSn = value;
    }

    /**
     * Gets the value of the outCmsCardApplExpTunUsrSn property.
     * 
     */
    public int getOutCmsCardApplExpTunUsrSn() {
        return outCmsCardApplExpTunUsrSn;
    }

    /**
     * Sets the value of the outCmsCardApplExpTunUsrSn property.
     * 
     */
    public void setOutCmsCardApplExpTunUsrSn(int value) {
        this.outCmsCardApplExpTunUsrSn = value;
    }

    /**
     * Gets the value of the outCmsCardApplExpiryDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutCmsCardApplExpiryDate() {
        return outCmsCardApplExpiryDate;
    }

    /**
     * Sets the value of the outCmsCardApplExpiryDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutCmsCardApplExpiryDate(XMLGregorianCalendar value) {
        this.outCmsCardApplExpiryDate = value;
    }

    /**
     * Gets the value of the outCmsCardApplFathernameLatin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCmsCardApplFathernameLatin() {
        return outCmsCardApplFathernameLatin;
    }

    /**
     * Sets the value of the outCmsCardApplFathernameLatin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCmsCardApplFathernameLatin(String value) {
        this.outCmsCardApplFathernameLatin = value;
    }

    /**
     * Gets the value of the outCmsCardApplFinalizationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutCmsCardApplFinalizationDate() {
        return outCmsCardApplFinalizationDate;
    }

    /**
     * Sets the value of the outCmsCardApplFinalizationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutCmsCardApplFinalizationDate(XMLGregorianCalendar value) {
        this.outCmsCardApplFinalizationDate = value;
    }

    /**
     * Gets the value of the outCmsCardApplMobile property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCmsCardApplMobile() {
        return outCmsCardApplMobile;
    }

    /**
     * Sets the value of the outCmsCardApplMobile property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCmsCardApplMobile(String value) {
        this.outCmsCardApplMobile = value;
    }

    /**
     * Gets the value of the outCmsCardApplPinIssuanceFlg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCmsCardApplPinIssuanceFlg() {
        return outCmsCardApplPinIssuanceFlg;
    }

    /**
     * Sets the value of the outCmsCardApplPinIssuanceFlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCmsCardApplPinIssuanceFlg(String value) {
        this.outCmsCardApplPinIssuanceFlg = value;
    }

    /**
     * Gets the value of the outCmsCardApplTmstamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutCmsCardApplTmstamp() {
        return outCmsCardApplTmstamp;
    }

    /**
     * Sets the value of the outCmsCardApplTmstamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutCmsCardApplTmstamp(XMLGregorianCalendar value) {
        this.outCmsCardApplTmstamp = value;
    }

    /**
     * Gets the value of the outCmsCardApplTunAprvDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutCmsCardApplTunAprvDate() {
        return outCmsCardApplTunAprvDate;
    }

    /**
     * Sets the value of the outCmsCardApplTunAprvDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutCmsCardApplTunAprvDate(XMLGregorianCalendar value) {
        this.outCmsCardApplTunAprvDate = value;
    }

    /**
     * Gets the value of the outCmsCardApplTunAprvUnit property.
     * 
     */
    public int getOutCmsCardApplTunAprvUnit() {
        return outCmsCardApplTunAprvUnit;
    }

    /**
     * Sets the value of the outCmsCardApplTunAprvUnit property.
     * 
     */
    public void setOutCmsCardApplTunAprvUnit(int value) {
        this.outCmsCardApplTunAprvUnit = value;
    }

    /**
     * Gets the value of the outCmsCardApplTunAprvUsr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCmsCardApplTunAprvUsr() {
        return outCmsCardApplTunAprvUsr;
    }

    /**
     * Sets the value of the outCmsCardApplTunAprvUsr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCmsCardApplTunAprvUsr(String value) {
        this.outCmsCardApplTunAprvUsr = value;
    }

    /**
     * Gets the value of the outCmsCardApplTunAprvUsrInSn property.
     * 
     */
    public short getOutCmsCardApplTunAprvUsrInSn() {
        return outCmsCardApplTunAprvUsrInSn;
    }

    /**
     * Sets the value of the outCmsCardApplTunAprvUsrInSn property.
     * 
     */
    public void setOutCmsCardApplTunAprvUsrInSn(short value) {
        this.outCmsCardApplTunAprvUsrInSn = value;
    }

    /**
     * Gets the value of the outCmsCardApplTunAprvUsrSn property.
     * 
     */
    public int getOutCmsCardApplTunAprvUsrSn() {
        return outCmsCardApplTunAprvUsrSn;
    }

    /**
     * Sets the value of the outCmsCardApplTunAprvUsrSn property.
     * 
     */
    public void setOutCmsCardApplTunAprvUsrSn(int value) {
        this.outCmsCardApplTunAprvUsrSn = value;
    }

    /**
     * Gets the value of the outCmsCardApplTunDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutCmsCardApplTunDate() {
        return outCmsCardApplTunDate;
    }

    /**
     * Sets the value of the outCmsCardApplTunDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutCmsCardApplTunDate(XMLGregorianCalendar value) {
        this.outCmsCardApplTunDate = value;
    }

    /**
     * Gets the value of the outCmsCardApplTunUnit property.
     * 
     */
    public int getOutCmsCardApplTunUnit() {
        return outCmsCardApplTunUnit;
    }

    /**
     * Sets the value of the outCmsCardApplTunUnit property.
     * 
     */
    public void setOutCmsCardApplTunUnit(int value) {
        this.outCmsCardApplTunUnit = value;
    }

    /**
     * Gets the value of the outCmsCardApplTunUsr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCmsCardApplTunUsr() {
        return outCmsCardApplTunUsr;
    }

    /**
     * Sets the value of the outCmsCardApplTunUsr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCmsCardApplTunUsr(String value) {
        this.outCmsCardApplTunUsr = value;
    }

    /**
     * Gets the value of the outCmsCardApplTunUsrIntSn property.
     * 
     */
    public short getOutCmsCardApplTunUsrIntSn() {
        return outCmsCardApplTunUsrIntSn;
    }

    /**
     * Sets the value of the outCmsCardApplTunUsrIntSn property.
     * 
     */
    public void setOutCmsCardApplTunUsrIntSn(short value) {
        this.outCmsCardApplTunUsrIntSn = value;
    }

    /**
     * Gets the value of the outCmsCardApplTunUsrSn property.
     * 
     */
    public int getOutCmsCardApplTunUsrSn() {
        return outCmsCardApplTunUsrSn;
    }

    /**
     * Sets the value of the outCmsCardApplTunUsrSn property.
     * 
     */
    public void setOutCmsCardApplTunUsrSn(int value) {
        this.outCmsCardApplTunUsrSn = value;
    }

    /**
     * Gets the value of the outCmsLimitHdCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCmsLimitHdCode() {
        return outCmsLimitHdCode;
    }

    /**
     * Sets the value of the outCmsLimitHdCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCmsLimitHdCode(String value) {
        this.outCmsLimitHdCode = value;
    }

    /**
     * Gets the value of the outCmsLimitHdDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCmsLimitHdDescription() {
        return outCmsLimitHdDescription;
    }

    /**
     * Sets the value of the outCmsLimitHdDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCmsLimitHdDescription(String value) {
        this.outCmsLimitHdDescription = value;
    }

    /**
     * Gets the value of the outCmsStatusDescrCharSuppliedChar20 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCmsStatusDescrCharSuppliedChar20() {
        return outCmsStatusDescrCharSuppliedChar20;
    }

    /**
     * Sets the value of the outCmsStatusDescrCharSuppliedChar20 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCmsStatusDescrCharSuppliedChar20(String value) {
        this.outCmsStatusDescrCharSuppliedChar20 = value;
    }

    /**
     * Gets the value of the outCmsStatusDescrCharSuppliedChar30 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCmsStatusDescrCharSuppliedChar30() {
        return outCmsStatusDescrCharSuppliedChar30;
    }

    /**
     * Sets the value of the outCmsStatusDescrCharSuppliedChar30 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCmsStatusDescrCharSuppliedChar30(String value) {
        this.outCmsStatusDescrCharSuppliedChar30 = value;
    }

    /**
     * Gets the value of the outCntryGenericDetailDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCntryGenericDetailDescription() {
        return outCntryGenericDetailDescription;
    }

    /**
     * Sets the value of the outCntryGenericDetailDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCntryGenericDetailDescription(String value) {
        this.outCntryGenericDetailDescription = value;
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
     * Gets the value of the outCustAddressEntryComments property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCustAddressEntryComments() {
        return outCustAddressEntryComments;
    }

    /**
     * Sets the value of the outCustAddressEntryComments property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCustAddressEntryComments(String value) {
        this.outCustAddressEntryComments = value;
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
     * Gets the value of the outCustAddressMailBox property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCustAddressMailBox() {
        return outCustAddressMailBox;
    }

    /**
     * Sets the value of the outCustAddressMailBox property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCustAddressMailBox(String value) {
        this.outCustAddressMailBox = value;
    }

    /**
     * Gets the value of the outCustAddressPtsInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCustAddressPtsInd() {
        return outCustAddressPtsInd;
    }

    /**
     * Sets the value of the outCustAddressPtsInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCustAddressPtsInd(String value) {
        this.outCustAddressPtsInd = value;
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
     * Gets the value of the outCustAddressSegmFlags property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCustAddressSegmFlags() {
        return outCustAddressSegmFlags;
    }

    /**
     * Sets the value of the outCustAddressSegmFlags property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCustAddressSegmFlags(String value) {
        this.outCustAddressSegmFlags = value;
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
     * Gets the value of the outCustTitleListSetDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCustTitleListSetDescription() {
        return outCustTitleListSetDescription;
    }

    /**
     * Sets the value of the outCustTitleListSetDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCustTitleListSetDescription(String value) {
        this.outCustTitleListSetDescription = value;
    }

    /**
     * Gets the value of the outCustomerBirthplace property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCustomerBirthplace() {
        return outCustomerBirthplace;
    }

    /**
     * Sets the value of the outCustomerBirthplace property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCustomerBirthplace(String value) {
        this.outCustomerBirthplace = value;
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
     * Gets the value of the outCustomerCustType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCustomerCustType() {
        return outCustomerCustType;
    }

    /**
     * Sets the value of the outCustomerCustType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCustomerCustType(String value) {
        this.outCustomerCustType = value;
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
     * Gets the value of the outCustomerLatinFirstname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCustomerLatinFirstname() {
        return outCustomerLatinFirstname;
    }

    /**
     * Sets the value of the outCustomerLatinFirstname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCustomerLatinFirstname(String value) {
        this.outCustomerLatinFirstname = value;
    }

    /**
     * Gets the value of the outCustomerLatinSurname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCustomerLatinSurname() {
        return outCustomerLatinSurname;
    }

    /**
     * Sets the value of the outCustomerLatinSurname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCustomerLatinSurname(String value) {
        this.outCustomerLatinSurname = value;
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
     * Gets the value of the outCustomerNoAfm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCustomerNoAfm() {
        return outCustomerNoAfm;
    }

    /**
     * Sets the value of the outCustomerNoAfm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCustomerNoAfm(String value) {
        this.outCustomerNoAfm = value;
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
     * Gets the value of the outDeltpGenericDetailDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutDeltpGenericDetailDescription() {
        return outDeltpGenericDetailDescription;
    }

    /**
     * Sets the value of the outDeltpGenericDetailDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutDeltpGenericDetailDescription(String value) {
        this.outDeltpGenericDetailDescription = value;
    }

    /**
     * Gets the value of the outDeltpGenericDetailSerialNum property.
     * 
     */
    public int getOutDeltpGenericDetailSerialNum() {
        return outDeltpGenericDetailSerialNum;
    }

    /**
     * Sets the value of the outDeltpGenericDetailSerialNum property.
     * 
     */
    public void setOutDeltpGenericDetailSerialNum(int value) {
        this.outDeltpGenericDetailSerialNum = value;
    }

    /**
     * Gets the value of the outDepTrxRecordingOFinalAccAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutDepTrxRecordingOFinalAccAmount() {
        return outDepTrxRecordingOFinalAccAmount;
    }

    /**
     * Sets the value of the outDepTrxRecordingOFinalAccAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutDepTrxRecordingOFinalAccAmount(BigDecimal value) {
        this.outDepTrxRecordingOFinalAccAmount = value;
    }

    /**
     * Gets the value of the outDepTrxRecordingTrxUsrSn property.
     * 
     */
    public int getOutDepTrxRecordingTrxUsrSn() {
        return outDepTrxRecordingTrxUsrSn;
    }

    /**
     * Sets the value of the outDepTrxRecordingTrxUsrSn property.
     * 
     */
    public void setOutDepTrxRecordingTrxUsrSn(int value) {
        this.outDepTrxRecordingTrxUsrSn = value;
    }

    /**
     * Gets the value of the outDepTrxRecordingTunInternalSn property.
     * 
     */
    public short getOutDepTrxRecordingTunInternalSn() {
        return outDepTrxRecordingTunInternalSn;
    }

    /**
     * Sets the value of the outDepTrxRecordingTunInternalSn property.
     * 
     */
    public void setOutDepTrxRecordingTunInternalSn(short value) {
        this.outDepTrxRecordingTunInternalSn = value;
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
     * Gets the value of the outDomCurrencyIdCurrency property.
     * 
     */
    public int getOutDomCurrencyIdCurrency() {
        return outDomCurrencyIdCurrency;
    }

    /**
     * Sets the value of the outDomCurrencyIdCurrency property.
     * 
     */
    public void setOutDomCurrencyIdCurrency(int value) {
        this.outDomCurrencyIdCurrency = value;
    }

    /**
     * Gets the value of the outDomCurrencyShortDescr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutDomCurrencyShortDescr() {
        return outDomCurrencyShortDescr;
    }

    /**
     * Sets the value of the outDomCurrencyShortDescr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutDomCurrencyShortDescr(String value) {
        this.outDomCurrencyShortDescr = value;
    }

    /**
     * Gets the value of the outDoyGenericDetailDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutDoyGenericDetailDescription() {
        return outDoyGenericDetailDescription;
    }

    /**
     * Sets the value of the outDoyGenericDetailDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutDoyGenericDetailDescription(String value) {
        this.outDoyGenericDetailDescription = value;
    }

    /**
     * Gets the value of the outErrorMessageIefSuppliedActionEntryMsg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutErrorMessageIefSuppliedActionEntryMsg() {
        return outErrorMessageIefSuppliedActionEntryMsg;
    }

    /**
     * Sets the value of the outErrorMessageIefSuppliedActionEntryMsg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutErrorMessageIefSuppliedActionEntryMsg(String value) {
        this.outErrorMessageIefSuppliedActionEntryMsg = value;
    }

    /**
     * Gets the value of the outExpAccDetailsProfitsAccountDepOpenUnit property.
     * 
     */
    public int getOutExpAccDetailsProfitsAccountDepOpenUnit() {
        return outExpAccDetailsProfitsAccountDepOpenUnit;
    }

    /**
     * Sets the value of the outExpAccDetailsProfitsAccountDepOpenUnit property.
     * 
     */
    public void setOutExpAccDetailsProfitsAccountDepOpenUnit(int value) {
        this.outExpAccDetailsProfitsAccountDepOpenUnit = value;
    }

    /**
     * Gets the value of the outExpAccDetailsProfitsAccountLnsOpenUnit property.
     * 
     */
    public int getOutExpAccDetailsProfitsAccountLnsOpenUnit() {
        return outExpAccDetailsProfitsAccountLnsOpenUnit;
    }

    /**
     * Sets the value of the outExpAccDetailsProfitsAccountLnsOpenUnit property.
     * 
     */
    public void setOutExpAccDetailsProfitsAccountLnsOpenUnit(int value) {
        this.outExpAccDetailsProfitsAccountLnsOpenUnit = value;
    }

    /**
     * Gets the value of the outExpAccDetailsProfitsAccountMonotoringUnit property.
     * 
     */
    public int getOutExpAccDetailsProfitsAccountMonotoringUnit() {
        return outExpAccDetailsProfitsAccountMonotoringUnit;
    }

    /**
     * Sets the value of the outExpAccDetailsProfitsAccountMonotoringUnit property.
     * 
     */
    public void setOutExpAccDetailsProfitsAccountMonotoringUnit(int value) {
        this.outExpAccDetailsProfitsAccountMonotoringUnit = value;
    }

    /**
     * Gets the value of the outExpAccDetailsProfitsAccountMovementCurrency property.
     * 
     */
    public int getOutExpAccDetailsProfitsAccountMovementCurrency() {
        return outExpAccDetailsProfitsAccountMovementCurrency;
    }

    /**
     * Sets the value of the outExpAccDetailsProfitsAccountMovementCurrency property.
     * 
     */
    public void setOutExpAccDetailsProfitsAccountMovementCurrency(int value) {
        this.outExpAccDetailsProfitsAccountMovementCurrency = value;
    }

    /**
     * Gets the value of the outExpAccDetailsProfitsAccountPrftSystem property.
     * 
     */
    public short getOutExpAccDetailsProfitsAccountPrftSystem() {
        return outExpAccDetailsProfitsAccountPrftSystem;
    }

    /**
     * Sets the value of the outExpAccDetailsProfitsAccountPrftSystem property.
     * 
     */
    public void setOutExpAccDetailsProfitsAccountPrftSystem(short value) {
        this.outExpAccDetailsProfitsAccountPrftSystem = value;
    }

    /**
     * Gets the value of the outExpAccDetailsProfitsAccountProductId property.
     * 
     */
    public int getOutExpAccDetailsProfitsAccountProductId() {
        return outExpAccDetailsProfitsAccountProductId;
    }

    /**
     * Sets the value of the outExpAccDetailsProfitsAccountProductId property.
     * 
     */
    public void setOutExpAccDetailsProfitsAccountProductId(int value) {
        this.outExpAccDetailsProfitsAccountProductId = value;
    }

    /**
     * Gets the value of the outFoundIefSuppliedFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutFoundIefSuppliedFlag() {
        return outFoundIefSuppliedFlag;
    }

    /**
     * Sets the value of the outFoundIefSuppliedFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutFoundIefSuppliedFlag(String value) {
        this.outFoundIefSuppliedFlag = value;
    }

    /**
     * Gets the value of the outIefSuppliedActionEntryDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutIefSuppliedActionEntryDesc() {
        return outIefSuppliedActionEntryDesc;
    }

    /**
     * Sets the value of the outIefSuppliedActionEntryDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutIefSuppliedActionEntryDesc(String value) {
        this.outIefSuppliedActionEntryDesc = value;
    }

    /**
     * Gets the value of the outIefSuppliedSrvStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutIefSuppliedSrvStatus() {
        return outIefSuppliedSrvStatus;
    }

    /**
     * Sets the value of the outIefSuppliedSrvStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutIefSuppliedSrvStatus(String value) {
        this.outIefSuppliedSrvStatus = value;
    }

    /**
     * Gets the value of the outMntRecordingAuthorizer1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutMntRecordingAuthorizer1() {
        return outMntRecordingAuthorizer1;
    }

    /**
     * Sets the value of the outMntRecordingAuthorizer1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutMntRecordingAuthorizer1(String value) {
        this.outMntRecordingAuthorizer1 = value;
    }

    /**
     * Gets the value of the outMntRecordingAuthorizer2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutMntRecordingAuthorizer2() {
        return outMntRecordingAuthorizer2;
    }

    /**
     * Sets the value of the outMntRecordingAuthorizer2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutMntRecordingAuthorizer2(String value) {
        this.outMntRecordingAuthorizer2 = value;
    }

    /**
     * Gets the value of the outMntRecordingChannelId property.
     * 
     */
    public int getOutMntRecordingChannelId() {
        return outMntRecordingChannelId;
    }

    /**
     * Sets the value of the outMntRecordingChannelId property.
     * 
     */
    public void setOutMntRecordingChannelId(int value) {
        this.outMntRecordingChannelId = value;
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
     * Gets the value of the outMntRecordingPrftSystem property.
     * 
     */
    public short getOutMntRecordingPrftSystem() {
        return outMntRecordingPrftSystem;
    }

    /**
     * Sets the value of the outMntRecordingPrftSystem property.
     * 
     */
    public void setOutMntRecordingPrftSystem(short value) {
        this.outMntRecordingPrftSystem = value;
    }

    /**
     * Gets the value of the outMntRecordingReversalFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutMntRecordingReversalFlag() {
        return outMntRecordingReversalFlag;
    }

    /**
     * Sets the value of the outMntRecordingReversalFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutMntRecordingReversalFlag(String value) {
        this.outMntRecordingReversalFlag = value;
    }

    /**
     * Gets the value of the outMntRecordingTerminalNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutMntRecordingTerminalNumber() {
        return outMntRecordingTerminalNumber;
    }

    /**
     * Sets the value of the outMntRecordingTerminalNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutMntRecordingTerminalNumber(String value) {
        this.outMntRecordingTerminalNumber = value;
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
     * Gets the value of the outMntRecordingTrxCode property.
     * 
     */
    public int getOutMntRecordingTrxCode() {
        return outMntRecordingTrxCode;
    }

    /**
     * Sets the value of the outMntRecordingTrxCode property.
     * 
     */
    public void setOutMntRecordingTrxCode(int value) {
        this.outMntRecordingTrxCode = value;
    }

    /**
     * Gets the value of the outMntRecordingTrxDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutMntRecordingTrxDate() {
        return outMntRecordingTrxDate;
    }

    /**
     * Sets the value of the outMntRecordingTrxDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutMntRecordingTrxDate(XMLGregorianCalendar value) {
        this.outMntRecordingTrxDate = value;
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
     * Gets the value of the outMntRecordingTrxUnit property.
     * 
     */
    public int getOutMntRecordingTrxUnit() {
        return outMntRecordingTrxUnit;
    }

    /**
     * Sets the value of the outMntRecordingTrxUnit property.
     * 
     */
    public void setOutMntRecordingTrxUnit(int value) {
        this.outMntRecordingTrxUnit = value;
    }

    /**
     * Gets the value of the outMntRecordingTrxUser property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutMntRecordingTrxUser() {
        return outMntRecordingTrxUser;
    }

    /**
     * Sets the value of the outMntRecordingTrxUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutMntRecordingTrxUser(String value) {
        this.outMntRecordingTrxUser = value;
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
     * Gets the value of the outOidtpGenericDetailDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutOidtpGenericDetailDescription() {
        return outOidtpGenericDetailDescription;
    }

    /**
     * Sets the value of the outOidtpGenericDetailDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutOidtpGenericDetailDescription(String value) {
        this.outOidtpGenericDetailDescription = value;
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
     * Gets the value of the outOtherIdIncompleteUComnt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutOtherIdIncompleteUComnt() {
        return outOtherIdIncompleteUComnt;
    }

    /**
     * Sets the value of the outOtherIdIncompleteUComnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutOtherIdIncompleteUComnt(String value) {
        this.outOtherIdIncompleteUComnt = value;
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
     * Gets the value of the outParVoucherRunVoucherLine property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutParVoucherRunVoucherLine() {
        return outParVoucherRunVoucherLine;
    }

    /**
     * Sets the value of the outParVoucherRunVoucherLine property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutParVoucherRunVoucherLine(String value) {
        this.outParVoucherRunVoucherLine = value;
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
     * Gets the value of the outSelectedProfitsAccountAccountSerNum property.
     * 
     */
    public double getOutSelectedProfitsAccountAccountSerNum() {
        return outSelectedProfitsAccountAccountSerNum;
    }

    /**
     * Sets the value of the outSelectedProfitsAccountAccountSerNum property.
     * 
     */
    public void setOutSelectedProfitsAccountAccountSerNum(double value) {
        this.outSelectedProfitsAccountAccountSerNum = value;
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
     * Gets the value of the outSelectedProfitsAccountIban property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSelectedProfitsAccountIban() {
        return outSelectedProfitsAccountIban;
    }

    /**
     * Sets the value of the outSelectedProfitsAccountIban property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSelectedProfitsAccountIban(String value) {
        this.outSelectedProfitsAccountIban = value;
    }

    /**
     * Gets the value of the outSelectedProfitsAccountIdPackage property.
     * 
     */
    public int getOutSelectedProfitsAccountIdPackage() {
        return outSelectedProfitsAccountIdPackage;
    }

    /**
     * Sets the value of the outSelectedProfitsAccountIdPackage property.
     * 
     */
    public void setOutSelectedProfitsAccountIdPackage(int value) {
        this.outSelectedProfitsAccountIdPackage = value;
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
     * Gets the value of the outSuccessfulTransactionWorkAdviceCounter property.
     * 
     */
    public int getOutSuccessfulTransactionWorkAdviceCounter() {
        return outSuccessfulTransactionWorkAdviceCounter;
    }

    /**
     * Sets the value of the outSuccessfulTransactionWorkAdviceCounter property.
     * 
     */
    public void setOutSuccessfulTransactionWorkAdviceCounter(int value) {
        this.outSuccessfulTransactionWorkAdviceCounter = value;
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
     * Gets the value of the outCmsCardApplCardReissueFlg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCmsCardApplCardReissueFlg() {
        return outCmsCardApplCardReissueFlg;
    }

    /**
     * Sets the value of the outCmsCardApplCardReissueFlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCmsCardApplCardReissueFlg(String value) {
        this.outCmsCardApplCardReissueFlg = value;
    }

    /**
     * Gets the value of the outPrintStatusIefSuppliedChar2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutPrintStatusIefSuppliedChar2() {
        return outPrintStatusIefSuppliedChar2;
    }

    /**
     * Sets the value of the outPrintStatusIefSuppliedChar2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutPrintStatusIefSuppliedChar2(String value) {
        this.outPrintStatusIefSuppliedChar2 = value;
    }

    /**
     * Gets the value of the outCmsOrdInventoryPan property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCmsOrdInventoryPan() {
        return outCmsOrdInventoryPan;
    }

    /**
     * Sets the value of the outCmsOrdInventoryPan property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCmsOrdInventoryPan(String value) {
        this.outCmsOrdInventoryPan = value;
    }

    /**
     * Gets the value of the outAccGrp property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCMS3601VOutAccGrpItemV2 }
     *     
     */
    public ArrayOfCMS3601VOutAccGrpItemV2 getOutAccGrp() {
        return outAccGrp;
    }

    /**
     * Sets the value of the outAccGrp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCMS3601VOutAccGrpItemV2 }
     *     
     */
    public void setOutAccGrp(ArrayOfCMS3601VOutAccGrpItemV2 value) {
        this.outAccGrp = value;
    }

    /**
     * Gets the value of the outCnctypGrp property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCMS3601VOutCnctypGrpItemV2 }
     *     
     */
    public ArrayOfCMS3601VOutCnctypGrpItemV2 getOutCnctypGrp() {
        return outCnctypGrp;
    }

    /**
     * Sets the value of the outCnctypGrp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCMS3601VOutCnctypGrpItemV2 }
     *     
     */
    public void setOutCnctypGrp(ArrayOfCMS3601VOutCnctypGrpItemV2 value) {
        this.outCnctypGrp = value;
    }

    /**
     * Gets the value of the outCrdtypGrp property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCMS3601VOutCrdtypGrpItemV2 }
     *     
     */
    public ArrayOfCMS3601VOutCrdtypGrpItemV2 getOutCrdtypGrp() {
        return outCrdtypGrp;
    }

    /**
     * Sets the value of the outCrdtypGrp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCMS3601VOutCrdtypGrpItemV2 }
     *     
     */
    public void setOutCrdtypGrp(ArrayOfCMS3601VOutCrdtypGrpItemV2 value) {
        this.outCrdtypGrp = value;
    }

    /**
     * Gets the value of the outDeltypGrp property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCMS3601VOutDeltypGrpItemV2 }
     *     
     */
    public ArrayOfCMS3601VOutDeltypGrpItemV2 getOutDeltypGrp() {
        return outDeltypGrp;
    }

    /**
     * Sets the value of the outDeltypGrp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCMS3601VOutDeltypGrpItemV2 }
     *     
     */
    public void setOutDeltypGrp(ArrayOfCMS3601VOutDeltypGrpItemV2 value) {
        this.outDeltypGrp = value;
    }

    /**
     * Gets the value of the outTransGrp property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCMS3601VOutTransGrpItemV2 }
     *     
     */
    public ArrayOfCMS3601VOutTransGrpItemV2 getOutTransGrp() {
        return outTransGrp;
    }

    /**
     * Sets the value of the outTransGrp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCMS3601VOutTransGrpItemV2 }
     *     
     */
    public void setOutTransGrp(ArrayOfCMS3601VOutTransGrpItemV2 value) {
        this.outTransGrp = value;
    }

    /**
     * Gets the value of the outTrstypGrp property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCMS3601VOutTrstypGrpItemV2 }
     *     
     */
    public ArrayOfCMS3601VOutTrstypGrpItemV2 getOutTrstypGrp() {
        return outTrstypGrp;
    }

    /**
     * Sets the value of the outTrstypGrp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCMS3601VOutTrstypGrpItemV2 }
     *     
     */
    public void setOutTrstypGrp(ArrayOfCMS3601VOutTrstypGrpItemV2 value) {
        this.outTrstypGrp = value;
    }

}
