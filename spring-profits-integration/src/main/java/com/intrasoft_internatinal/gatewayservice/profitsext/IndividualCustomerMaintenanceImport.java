
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for IndividualCustomerMaintenanceImport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IndividualCustomerMaintenanceImport">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}BaseImport">
 *       &lt;sequence>
 *         &lt;element name="In2ndCitizenshipCustomerCategoryTmstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="In2ndCitizenshipGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="In2ndProfessionCustomerCategoryTmstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="In2ndProfessionGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InActivityCustomerCategoryTmstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InActivityGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InActivityTypeCustomerCategoryTmstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InActivityTypeGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InActivityTypeGenericDetailShortDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InAddressCountryGenericDetailShortDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InAddressDistrictGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InAfmIssueCountryGenericDetailShortDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InAtenetCustCardInfoCardNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InAtenetCustCardInfoEndDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InAtenetCustCardInfoStartDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InAttractionCustomerCategoryTmstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InAttractionGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InAttractionUsrCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InAuthGrantedIefSuppliedFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InBankemployeeId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InBasileiaCustomerCategoryTmstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InBasileiaGenericDetailDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InBasileiaGenericDetailEntryStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InBasileiaGenericDetailParameterType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InBasileiaGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InBasileiaGenericDetailShortDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InBasileiaGenericDetailTmstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InBirthCountryCustomerCategoryTmstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InBirthCountryGenericDetailShortDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InBopCountryCustomerCategoryTmstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InBopCountryGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InBopCountryGenericDetailShortDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InChamberAuthorityCustomerCategoryTmstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InChamberAuthorityGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InCitizenshipCustomerCategoryTmstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InCitizenshipGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InCommunicationLangCustomerCategoryTmstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InCommunicationLangGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InCompanyCategCustomerCategoryTmstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InCompanyCategGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InCompanyCategGenericDetailShortDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InConfirmBirthdataIefSuppliedFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InConfirmDoubtAfmIefSuppliedFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCustAddressAddress1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCustAddressAddress2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCustAddressAddressType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCustAddressCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCustAddressFaxNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCustAddressMailBox" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCustAddressRegion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCustAddressSegmFlags" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCustAddressSerialNum" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InCustAddressTelephone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCustAddressTmstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InCustAddressZipCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCustMarketCustomerCategoryTmstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InCustMarketGenericDetailDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCustMarketGenericDetailEntryStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCustMarketGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InCustomerAttractionDetails" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCustomerAttractionPerson" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCustomerBirthplace" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCustomerBlacklistedInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCustomerBusinessInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCustomerCertificCust" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCustomerCertificDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InCustomerChamberComments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCustomerChamberId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCustomerChildrenAbove18" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InCustomerConsolidStatmFlg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCustomerCustStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCustomerDaiNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCustomerDateOfBirth" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InCustomerDocExpireDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InCustomerEMail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCustomerEmployementStartDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InCustomerEmployer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCustomerEmployerAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCustomerEntryComments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCustomerEntryStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCustomerFamilyMembers" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InCustomerFatherName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCustomerFatherSurname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCustomerFicliCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InCustomerFicliDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCustomerFinRange" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InCustomerFinRangeDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InCustomerFirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCustomerIncompleteUComnt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCustomerInternetAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCustomerLastUpdate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InCustomerLatinFirstname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCustomerLatinSurname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCustomerMailInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCustomerMajorBeneficiary" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCustomerMarketingReminder" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCustomerMiddleName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCustomerMobileTel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCustomerMotherName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCustomerMotherSurname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCustomerNoAfm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCustomerNonRegistered" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCustomerNonResident" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCustomerNonResidentForRep" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCustomerNumOfChildren" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InCustomerPensionerInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCustomerPromocode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCustomerSecondSurname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCustomerSegmFlags" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCustomerSepaAgrDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InCustomerSepaAgrFlg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCustomerSex" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCustomerShortName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCustomerSpmNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCustomerSurname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCustomerTelephone1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCustomerTelex" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCustomerTelexConnection" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCustomerTitle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCustomerTmstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InCustomerVipInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCustSegmentCustomerCategoryTmstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InCustSegmentGenericDetailDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCustSegmentGenericDetailEntryStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCustSegmentGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InCustTypeIefSuppliedFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InDepositParametersBankCase" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InEconomyGroupCustomerCategoryTmstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InEconomyGroupGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InEducationLevelCustomerCategoryTmstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InEducationLevelGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InFamilyStatusCustomerCategoryTmstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InFamilyStatusGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InIdCountryGenericDetailShortDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InIdTypeGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InIefSuppliedCommand" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InIefSuppliedFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InIncomeLevelCustomerCategoryTmstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InIncomeLevelGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InJustificIdJustific" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InKeyCustomerCDigit" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InKeyCustomerCustId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InMntRecordingAuthorizer1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InMntRecordingAuthorizer2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InMntRecordingPrftSystem" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InMntRecordingReversalFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InMntRecordingTerminalNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InMntRecordingTrxCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InMonitoringBankemployeeId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InMonitoringUnitCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InNationalityCustomerCategoryTmstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InNationalityGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InOtherAfmAfmNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InOtherAfmSerialNo" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InOtherAfmTmstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InOtherIdExpiryDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InOtherIdIdNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InOtherIdIssueAuthority" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InOtherIdIssueDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InOtherIdSerialNo" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InOtherIdTmstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InPrftTransactionDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InPrftTransactionIdTransact" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InProductIdProduct" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InProfessionCategoryCustomerCategoryTmstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InProfessionCategoryGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InProfessionCustomerCategoryTmstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InProfessionGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InProfessionStatusCustomerCategoryTmstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InProfessionStatusGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InRcountryCustomerCategoryTmstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InRcountryGenericDetailDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InRcountryGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InRcountryGenericDetailShortDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InRegionCustomerCategoryTmstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InRegionGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InSubCategCustomerCategoryTmstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InSubCategGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InSubCategGenericDetailShortDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InSubCategoryGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InSubCategoryGenericDetailShortDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InTaxOfficeId" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InThinkingCurrencyIdCurrency" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InTimestampCustomerTmstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InCustomerEnableFor24c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCustomerCustOpenDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InGrpCustcat" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}ArrayOfInGrpCustcat" minOccurs="0"/>
 *         &lt;element name="InCustAddressAccomodationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InCustAddressInternetAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCustAddressEMail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCustAddressTelephone3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCustAddressTelephone2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCustAddressAddress6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCustAddressAddress5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCustAddressAddress4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCustAddressAddress3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCustAddressLatinInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCustAddressPtsInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCustAddressCommunicationAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCustAddressEntryStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCustAddressEntryComments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCustomerOwnershipIndication" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCustomerContractExpiryDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InCustomerContract" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCustomerMobileTel2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCustomerEMail2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InEmployerCustAddressSerialNum" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InEmployerCustAddressAddressType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InEmployerCustAddressFaxNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InEmployerCustAddressCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InEmployerCustAddressZipCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InEmployerCustAddressTelephone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InEmployerCustAddressCommunicationAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InEmployerCustAddressEntryStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InEmployerCustAddressTmstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InEmployerCustAddressRegion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InEmployerCustAddressAddress1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InEmployerCustAddressAddress2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InEmployerCustAddressEntryComments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InEmployerCustAddressMailBox" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InEmployerCustAddressSegmFlags" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InEmployerCustAddressAccomodationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InEmployerCustAddressInternetAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InEmployerCustAddressEMail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InEmployerCustAddressTelephone3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InEmployerCustAddressTelephone2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InEmployerCustAddressAddress6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InEmployerCustAddressAddress5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InEmployerCustAddressAddress4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InEmployerCustAddressAddress3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InEmployerCustAddressLatinInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InEmployerCustAddressPtsInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InEmployerAddressDistrictGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InEmployerAddressDistrictGenericDetailDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InEmployerAddressCountryGenericDetailDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InEmployerAddressCountryGenericDetailShortDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InEmployerCustAddrParrelDCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InEmployerCustAddrParrelDSn" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InCustAddrParrelDCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCustAddrParrelDSn" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InCustomerCommunMethod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCustomerCbsId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCustomerIapplyId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCustomerCrmId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IndividualCustomerMaintenanceImport", propOrder = {
    "in2NdCitizenshipCustomerCategoryTmstamp",
    "in2NdCitizenshipGenericDetailSerialNum",
    "in2NdProfessionCustomerCategoryTmstamp",
    "in2NdProfessionGenericDetailSerialNum",
    "inActivityCustomerCategoryTmstamp",
    "inActivityGenericDetailSerialNum",
    "inActivityTypeCustomerCategoryTmstamp",
    "inActivityTypeGenericDetailSerialNum",
    "inActivityTypeGenericDetailShortDescription",
    "inAddressCountryGenericDetailShortDescription",
    "inAddressDistrictGenericDetailSerialNum",
    "inAfmIssueCountryGenericDetailShortDescription",
    "inAtenetCustCardInfoCardNo",
    "inAtenetCustCardInfoEndDate",
    "inAtenetCustCardInfoStartDate",
    "inAttractionCustomerCategoryTmstamp",
    "inAttractionGenericDetailSerialNum",
    "inAttractionUsrCode",
    "inAuthGrantedIefSuppliedFlag",
    "inBankemployeeId",
    "inBasileiaCustomerCategoryTmstamp",
    "inBasileiaGenericDetailDescription",
    "inBasileiaGenericDetailEntryStatus",
    "inBasileiaGenericDetailParameterType",
    "inBasileiaGenericDetailSerialNum",
    "inBasileiaGenericDetailShortDescription",
    "inBasileiaGenericDetailTmstamp",
    "inBirthCountryCustomerCategoryTmstamp",
    "inBirthCountryGenericDetailShortDescription",
    "inBopCountryCustomerCategoryTmstamp",
    "inBopCountryGenericDetailSerialNum",
    "inBopCountryGenericDetailShortDescription",
    "inChamberAuthorityCustomerCategoryTmstamp",
    "inChamberAuthorityGenericDetailSerialNum",
    "inCitizenshipCustomerCategoryTmstamp",
    "inCitizenshipGenericDetailSerialNum",
    "inCommunicationLangCustomerCategoryTmstamp",
    "inCommunicationLangGenericDetailSerialNum",
    "inCompanyCategCustomerCategoryTmstamp",
    "inCompanyCategGenericDetailSerialNum",
    "inCompanyCategGenericDetailShortDescription",
    "inConfirmBirthdataIefSuppliedFlag",
    "inConfirmDoubtAfmIefSuppliedFlag",
    "inCustAddressAddress1",
    "inCustAddressAddress2",
    "inCustAddressAddressType",
    "inCustAddressCity",
    "inCustAddressFaxNo",
    "inCustAddressMailBox",
    "inCustAddressRegion",
    "inCustAddressSegmFlags",
    "inCustAddressSerialNum",
    "inCustAddressTelephone",
    "inCustAddressTmstamp",
    "inCustAddressZipCode",
    "inCustMarketCustomerCategoryTmstamp",
    "inCustMarketGenericDetailDescription",
    "inCustMarketGenericDetailEntryStatus",
    "inCustMarketGenericDetailSerialNum",
    "inCustomerAttractionDetails",
    "inCustomerAttractionPerson",
    "inCustomerBirthplace",
    "inCustomerBlacklistedInd",
    "inCustomerBusinessInd",
    "inCustomerCertificCust",
    "inCustomerCertificDate",
    "inCustomerChamberComments",
    "inCustomerChamberId",
    "inCustomerChildrenAbove18",
    "inCustomerConsolidStatmFlg",
    "inCustomerCustStatus",
    "inCustomerDaiNumber",
    "inCustomerDateOfBirth",
    "inCustomerDocExpireDate",
    "inCustomerEMail",
    "inCustomerEmployementStartDate",
    "inCustomerEmployer",
    "inCustomerEmployerAddress",
    "inCustomerEntryComments",
    "inCustomerEntryStatus",
    "inCustomerFamilyMembers",
    "inCustomerFatherName",
    "inCustomerFatherSurname",
    "inCustomerFicliCode",
    "inCustomerFicliDesc",
    "inCustomerFinRange",
    "inCustomerFinRangeDt",
    "inCustomerFirstName",
    "inCustomerIncompleteUComnt",
    "inCustomerInternetAddress",
    "inCustomerLastUpdate",
    "inCustomerLatinFirstname",
    "inCustomerLatinSurname",
    "inCustomerMailInd",
    "inCustomerMajorBeneficiary",
    "inCustomerMarketingReminder",
    "inCustomerMiddleName",
    "inCustomerMobileTel",
    "inCustomerMotherName",
    "inCustomerMotherSurname",
    "inCustomerNoAfm",
    "inCustomerNonRegistered",
    "inCustomerNonResident",
    "inCustomerNonResidentForRep",
    "inCustomerNumOfChildren",
    "inCustomerPensionerInd",
    "inCustomerPromocode",
    "inCustomerSecondSurname",
    "inCustomerSegmFlags",
    "inCustomerSepaAgrDt",
    "inCustomerSepaAgrFlg",
    "inCustomerSex",
    "inCustomerShortName",
    "inCustomerSpmNumber",
    "inCustomerSurname",
    "inCustomerTelephone1",
    "inCustomerTelex",
    "inCustomerTelexConnection",
    "inCustomerTitle",
    "inCustomerTmstamp",
    "inCustomerVipInd",
    "inCustSegmentCustomerCategoryTmstamp",
    "inCustSegmentGenericDetailDescription",
    "inCustSegmentGenericDetailEntryStatus",
    "inCustSegmentGenericDetailSerialNum",
    "inCustTypeIefSuppliedFlag",
    "inDepositParametersBankCase",
    "inEconomyGroupCustomerCategoryTmstamp",
    "inEconomyGroupGenericDetailSerialNum",
    "inEducationLevelCustomerCategoryTmstamp",
    "inEducationLevelGenericDetailSerialNum",
    "inFamilyStatusCustomerCategoryTmstamp",
    "inFamilyStatusGenericDetailSerialNum",
    "inIdCountryGenericDetailShortDescription",
    "inIdTypeGenericDetailSerialNum",
    "inIefSuppliedCommand",
    "inIefSuppliedFlag",
    "inIncomeLevelCustomerCategoryTmstamp",
    "inIncomeLevelGenericDetailSerialNum",
    "inJustificIdJustific",
    "inKeyCustomerCDigit",
    "inKeyCustomerCustId",
    "inMntRecordingAuthorizer1",
    "inMntRecordingAuthorizer2",
    "inMntRecordingPrftSystem",
    "inMntRecordingReversalFlag",
    "inMntRecordingTerminalNumber",
    "inMntRecordingTrxCode",
    "inMonitoringBankemployeeId",
    "inMonitoringUnitCode",
    "inNationalityCustomerCategoryTmstamp",
    "inNationalityGenericDetailSerialNum",
    "inOtherAfmAfmNo",
    "inOtherAfmSerialNo",
    "inOtherAfmTmstamp",
    "inOtherIdExpiryDate",
    "inOtherIdIdNo",
    "inOtherIdIssueAuthority",
    "inOtherIdIssueDate",
    "inOtherIdSerialNo",
    "inOtherIdTmstamp",
    "inPrftTransactionDescription",
    "inPrftTransactionIdTransact",
    "inProductIdProduct",
    "inProfessionCategoryCustomerCategoryTmstamp",
    "inProfessionCategoryGenericDetailSerialNum",
    "inProfessionCustomerCategoryTmstamp",
    "inProfessionGenericDetailSerialNum",
    "inProfessionStatusCustomerCategoryTmstamp",
    "inProfessionStatusGenericDetailSerialNum",
    "inRcountryCustomerCategoryTmstamp",
    "inRcountryGenericDetailDescription",
    "inRcountryGenericDetailSerialNum",
    "inRcountryGenericDetailShortDescription",
    "inRegionCustomerCategoryTmstamp",
    "inRegionGenericDetailSerialNum",
    "inSubCategCustomerCategoryTmstamp",
    "inSubCategGenericDetailSerialNum",
    "inSubCategGenericDetailShortDescription",
    "inSubCategoryGenericDetailSerialNum",
    "inSubCategoryGenericDetailShortDescription",
    "inTaxOfficeId",
    "inThinkingCurrencyIdCurrency",
    "inTimestampCustomerTmstamp",
    "inCustomerEnableFor24C",
    "inCustomerCustOpenDate",
    "inGrpCustcat",
    "inCustAddressAccomodationDate",
    "inCustAddressInternetAddress",
    "inCustAddressEMail",
    "inCustAddressTelephone3",
    "inCustAddressTelephone2",
    "inCustAddressAddress6",
    "inCustAddressAddress5",
    "inCustAddressAddress4",
    "inCustAddressAddress3",
    "inCustAddressLatinInd",
    "inCustAddressPtsInd",
    "inCustAddressCommunicationAddress",
    "inCustAddressEntryStatus",
    "inCustAddressEntryComments",
    "inCustomerOwnershipIndication",
    "inCustomerContractExpiryDate",
    "inCustomerContract",
    "inCustomerMobileTel2",
    "inCustomerEMail2",
    "inEmployerCustAddressSerialNum",
    "inEmployerCustAddressAddressType",
    "inEmployerCustAddressFaxNo",
    "inEmployerCustAddressCity",
    "inEmployerCustAddressZipCode",
    "inEmployerCustAddressTelephone",
    "inEmployerCustAddressCommunicationAddress",
    "inEmployerCustAddressEntryStatus",
    "inEmployerCustAddressTmstamp",
    "inEmployerCustAddressRegion",
    "inEmployerCustAddressAddress1",
    "inEmployerCustAddressAddress2",
    "inEmployerCustAddressEntryComments",
    "inEmployerCustAddressMailBox",
    "inEmployerCustAddressSegmFlags",
    "inEmployerCustAddressAccomodationDate",
    "inEmployerCustAddressInternetAddress",
    "inEmployerCustAddressEMail",
    "inEmployerCustAddressTelephone3",
    "inEmployerCustAddressTelephone2",
    "inEmployerCustAddressAddress6",
    "inEmployerCustAddressAddress5",
    "inEmployerCustAddressAddress4",
    "inEmployerCustAddressAddress3",
    "inEmployerCustAddressLatinInd",
    "inEmployerCustAddressPtsInd",
    "inEmployerAddressDistrictGenericDetailSerialNum",
    "inEmployerAddressDistrictGenericDetailDescription",
    "inEmployerAddressCountryGenericDetailDescription",
    "inEmployerAddressCountryGenericDetailShortDescription",
    "inEmployerCustAddrParrelDCode",
    "inEmployerCustAddrParrelDSn",
    "inCustAddrParrelDCode",
    "inCustAddrParrelDSn",
    "inCustomerCommunMethod",
    "inCustomerCbsId",
    "inCustomerIapplyId",
    "inCustomerCrmId"
})
public class IndividualCustomerMaintenanceImport
    extends BaseImport
{

    @XmlElement(name = "In2ndCitizenshipCustomerCategoryTmstamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar in2NdCitizenshipCustomerCategoryTmstamp;
    @XmlElement(name = "In2ndCitizenshipGenericDetailSerialNum")
    protected int in2NdCitizenshipGenericDetailSerialNum;
    @XmlElement(name = "In2ndProfessionCustomerCategoryTmstamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar in2NdProfessionCustomerCategoryTmstamp;
    @XmlElement(name = "In2ndProfessionGenericDetailSerialNum")
    protected int in2NdProfessionGenericDetailSerialNum;
    @XmlElement(name = "InActivityCustomerCategoryTmstamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inActivityCustomerCategoryTmstamp;
    @XmlElement(name = "InActivityGenericDetailSerialNum")
    protected int inActivityGenericDetailSerialNum;
    @XmlElement(name = "InActivityTypeCustomerCategoryTmstamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inActivityTypeCustomerCategoryTmstamp;
    @XmlElement(name = "InActivityTypeGenericDetailSerialNum")
    protected int inActivityTypeGenericDetailSerialNum;
    @XmlElement(name = "InActivityTypeGenericDetailShortDescription")
    protected String inActivityTypeGenericDetailShortDescription;
    @XmlElement(name = "InAddressCountryGenericDetailShortDescription")
    protected String inAddressCountryGenericDetailShortDescription;
    @XmlElement(name = "InAddressDistrictGenericDetailSerialNum")
    protected int inAddressDistrictGenericDetailSerialNum;
    @XmlElement(name = "InAfmIssueCountryGenericDetailShortDescription")
    protected String inAfmIssueCountryGenericDetailShortDescription;
    @XmlElement(name = "InAtenetCustCardInfoCardNo")
    protected String inAtenetCustCardInfoCardNo;
    @XmlElement(name = "InAtenetCustCardInfoEndDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inAtenetCustCardInfoEndDate;
    @XmlElement(name = "InAtenetCustCardInfoStartDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inAtenetCustCardInfoStartDate;
    @XmlElement(name = "InAttractionCustomerCategoryTmstamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inAttractionCustomerCategoryTmstamp;
    @XmlElement(name = "InAttractionGenericDetailSerialNum")
    protected int inAttractionGenericDetailSerialNum;
    @XmlElement(name = "InAttractionUsrCode")
    protected String inAttractionUsrCode;
    @XmlElement(name = "InAuthGrantedIefSuppliedFlag")
    protected String inAuthGrantedIefSuppliedFlag;
    @XmlElement(name = "InBankemployeeId")
    protected String inBankemployeeId;
    @XmlElement(name = "InBasileiaCustomerCategoryTmstamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inBasileiaCustomerCategoryTmstamp;
    @XmlElement(name = "InBasileiaGenericDetailDescription")
    protected String inBasileiaGenericDetailDescription;
    @XmlElement(name = "InBasileiaGenericDetailEntryStatus")
    protected String inBasileiaGenericDetailEntryStatus;
    @XmlElement(name = "InBasileiaGenericDetailParameterType")
    protected String inBasileiaGenericDetailParameterType;
    @XmlElement(name = "InBasileiaGenericDetailSerialNum")
    protected int inBasileiaGenericDetailSerialNum;
    @XmlElement(name = "InBasileiaGenericDetailShortDescription")
    protected String inBasileiaGenericDetailShortDescription;
    @XmlElement(name = "InBasileiaGenericDetailTmstamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inBasileiaGenericDetailTmstamp;
    @XmlElement(name = "InBirthCountryCustomerCategoryTmstamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inBirthCountryCustomerCategoryTmstamp;
    @XmlElement(name = "InBirthCountryGenericDetailShortDescription")
    protected String inBirthCountryGenericDetailShortDescription;
    @XmlElement(name = "InBopCountryCustomerCategoryTmstamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inBopCountryCustomerCategoryTmstamp;
    @XmlElement(name = "InBopCountryGenericDetailSerialNum")
    protected int inBopCountryGenericDetailSerialNum;
    @XmlElement(name = "InBopCountryGenericDetailShortDescription")
    protected String inBopCountryGenericDetailShortDescription;
    @XmlElement(name = "InChamberAuthorityCustomerCategoryTmstamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inChamberAuthorityCustomerCategoryTmstamp;
    @XmlElement(name = "InChamberAuthorityGenericDetailSerialNum")
    protected int inChamberAuthorityGenericDetailSerialNum;
    @XmlElement(name = "InCitizenshipCustomerCategoryTmstamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inCitizenshipCustomerCategoryTmstamp;
    @XmlElement(name = "InCitizenshipGenericDetailSerialNum")
    protected int inCitizenshipGenericDetailSerialNum;
    @XmlElement(name = "InCommunicationLangCustomerCategoryTmstamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inCommunicationLangCustomerCategoryTmstamp;
    @XmlElement(name = "InCommunicationLangGenericDetailSerialNum")
    protected int inCommunicationLangGenericDetailSerialNum;
    @XmlElement(name = "InCompanyCategCustomerCategoryTmstamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inCompanyCategCustomerCategoryTmstamp;
    @XmlElement(name = "InCompanyCategGenericDetailSerialNum")
    protected int inCompanyCategGenericDetailSerialNum;
    @XmlElement(name = "InCompanyCategGenericDetailShortDescription")
    protected String inCompanyCategGenericDetailShortDescription;
    @XmlElement(name = "InConfirmBirthdataIefSuppliedFlag")
    protected String inConfirmBirthdataIefSuppliedFlag;
    @XmlElement(name = "InConfirmDoubtAfmIefSuppliedFlag")
    protected String inConfirmDoubtAfmIefSuppliedFlag;
    @XmlElement(name = "InCustAddressAddress1")
    protected String inCustAddressAddress1;
    @XmlElement(name = "InCustAddressAddress2")
    protected String inCustAddressAddress2;
    @XmlElement(name = "InCustAddressAddressType")
    protected String inCustAddressAddressType;
    @XmlElement(name = "InCustAddressCity")
    protected String inCustAddressCity;
    @XmlElement(name = "InCustAddressFaxNo")
    protected String inCustAddressFaxNo;
    @XmlElement(name = "InCustAddressMailBox")
    protected String inCustAddressMailBox;
    @XmlElement(name = "InCustAddressRegion")
    protected String inCustAddressRegion;
    @XmlElement(name = "InCustAddressSegmFlags")
    protected String inCustAddressSegmFlags;
    @XmlElement(name = "InCustAddressSerialNum")
    protected short inCustAddressSerialNum;
    @XmlElement(name = "InCustAddressTelephone")
    protected String inCustAddressTelephone;
    @XmlElement(name = "InCustAddressTmstamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inCustAddressTmstamp;
    @XmlElement(name = "InCustAddressZipCode")
    protected String inCustAddressZipCode;
    @XmlElement(name = "InCustMarketCustomerCategoryTmstamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inCustMarketCustomerCategoryTmstamp;
    @XmlElement(name = "InCustMarketGenericDetailDescription")
    protected String inCustMarketGenericDetailDescription;
    @XmlElement(name = "InCustMarketGenericDetailEntryStatus")
    protected String inCustMarketGenericDetailEntryStatus;
    @XmlElement(name = "InCustMarketGenericDetailSerialNum")
    protected int inCustMarketGenericDetailSerialNum;
    @XmlElement(name = "InCustomerAttractionDetails")
    protected String inCustomerAttractionDetails;
    @XmlElement(name = "InCustomerAttractionPerson")
    protected String inCustomerAttractionPerson;
    @XmlElement(name = "InCustomerBirthplace")
    protected String inCustomerBirthplace;
    @XmlElement(name = "InCustomerBlacklistedInd")
    protected String inCustomerBlacklistedInd;
    @XmlElement(name = "InCustomerBusinessInd")
    protected String inCustomerBusinessInd;
    @XmlElement(name = "InCustomerCertificCust")
    protected String inCustomerCertificCust;
    @XmlElement(name = "InCustomerCertificDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inCustomerCertificDate;
    @XmlElement(name = "InCustomerChamberComments")
    protected String inCustomerChamberComments;
    @XmlElement(name = "InCustomerChamberId")
    protected String inCustomerChamberId;
    @XmlElement(name = "InCustomerChildrenAbove18")
    protected short inCustomerChildrenAbove18;
    @XmlElement(name = "InCustomerConsolidStatmFlg")
    protected String inCustomerConsolidStatmFlg;
    @XmlElement(name = "InCustomerCustStatus")
    protected String inCustomerCustStatus;
    @XmlElement(name = "InCustomerDaiNumber")
    protected String inCustomerDaiNumber;
    @XmlElement(name = "InCustomerDateOfBirth", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inCustomerDateOfBirth;
    @XmlElement(name = "InCustomerDocExpireDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inCustomerDocExpireDate;
    @XmlElement(name = "InCustomerEMail")
    protected String inCustomerEMail;
    @XmlElement(name = "InCustomerEmployementStartDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inCustomerEmployementStartDate;
    @XmlElement(name = "InCustomerEmployer")
    protected String inCustomerEmployer;
    @XmlElement(name = "InCustomerEmployerAddress")
    protected String inCustomerEmployerAddress;
    @XmlElement(name = "InCustomerEntryComments")
    protected String inCustomerEntryComments;
    @XmlElement(name = "InCustomerEntryStatus")
    protected String inCustomerEntryStatus;
    @XmlElement(name = "InCustomerFamilyMembers")
    protected short inCustomerFamilyMembers;
    @XmlElement(name = "InCustomerFatherName")
    protected String inCustomerFatherName;
    @XmlElement(name = "InCustomerFatherSurname")
    protected String inCustomerFatherSurname;
    @XmlElement(name = "InCustomerFicliCode")
    protected int inCustomerFicliCode;
    @XmlElement(name = "InCustomerFicliDesc")
    protected String inCustomerFicliDesc;
    @XmlElement(name = "InCustomerFinRange", required = true)
    protected BigDecimal inCustomerFinRange;
    @XmlElement(name = "InCustomerFinRangeDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inCustomerFinRangeDt;
    @XmlElement(name = "InCustomerFirstName")
    protected String inCustomerFirstName;
    @XmlElement(name = "InCustomerIncompleteUComnt")
    protected String inCustomerIncompleteUComnt;
    @XmlElement(name = "InCustomerInternetAddress")
    protected String inCustomerInternetAddress;
    @XmlElement(name = "InCustomerLastUpdate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inCustomerLastUpdate;
    @XmlElement(name = "InCustomerLatinFirstname")
    protected String inCustomerLatinFirstname;
    @XmlElement(name = "InCustomerLatinSurname")
    protected String inCustomerLatinSurname;
    @XmlElement(name = "InCustomerMailInd")
    protected String inCustomerMailInd;
    @XmlElement(name = "InCustomerMajorBeneficiary")
    protected String inCustomerMajorBeneficiary;
    @XmlElement(name = "InCustomerMarketingReminder")
    protected String inCustomerMarketingReminder;
    @XmlElement(name = "InCustomerMiddleName")
    protected String inCustomerMiddleName;
    @XmlElement(name = "InCustomerMobileTel")
    protected String inCustomerMobileTel;
    @XmlElement(name = "InCustomerMotherName")
    protected String inCustomerMotherName;
    @XmlElement(name = "InCustomerMotherSurname")
    protected String inCustomerMotherSurname;
    @XmlElement(name = "InCustomerNoAfm")
    protected String inCustomerNoAfm;
    @XmlElement(name = "InCustomerNonRegistered")
    protected String inCustomerNonRegistered;
    @XmlElement(name = "InCustomerNonResident")
    protected String inCustomerNonResident;
    @XmlElement(name = "InCustomerNonResidentForRep")
    protected String inCustomerNonResidentForRep;
    @XmlElement(name = "InCustomerNumOfChildren")
    protected short inCustomerNumOfChildren;
    @XmlElement(name = "InCustomerPensionerInd")
    protected String inCustomerPensionerInd;
    @XmlElement(name = "InCustomerPromocode")
    protected String inCustomerPromocode;
    @XmlElement(name = "InCustomerSecondSurname")
    protected String inCustomerSecondSurname;
    @XmlElement(name = "InCustomerSegmFlags")
    protected String inCustomerSegmFlags;
    @XmlElement(name = "InCustomerSepaAgrDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inCustomerSepaAgrDt;
    @XmlElement(name = "InCustomerSepaAgrFlg")
    protected String inCustomerSepaAgrFlg;
    @XmlElement(name = "InCustomerSex")
    protected String inCustomerSex;
    @XmlElement(name = "InCustomerShortName")
    protected String inCustomerShortName;
    @XmlElement(name = "InCustomerSpmNumber")
    protected String inCustomerSpmNumber;
    @XmlElement(name = "InCustomerSurname")
    protected String inCustomerSurname;
    @XmlElement(name = "InCustomerTelephone1")
    protected String inCustomerTelephone1;
    @XmlElement(name = "InCustomerTelex")
    protected String inCustomerTelex;
    @XmlElement(name = "InCustomerTelexConnection")
    protected String inCustomerTelexConnection;
    @XmlElement(name = "InCustomerTitle")
    protected String inCustomerTitle;
    @XmlElement(name = "InCustomerTmstamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inCustomerTmstamp;
    @XmlElement(name = "InCustomerVipInd")
    protected String inCustomerVipInd;
    @XmlElement(name = "InCustSegmentCustomerCategoryTmstamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inCustSegmentCustomerCategoryTmstamp;
    @XmlElement(name = "InCustSegmentGenericDetailDescription")
    protected String inCustSegmentGenericDetailDescription;
    @XmlElement(name = "InCustSegmentGenericDetailEntryStatus")
    protected String inCustSegmentGenericDetailEntryStatus;
    @XmlElement(name = "InCustSegmentGenericDetailSerialNum")
    protected int inCustSegmentGenericDetailSerialNum;
    @XmlElement(name = "InCustTypeIefSuppliedFlag")
    protected String inCustTypeIefSuppliedFlag;
    @XmlElement(name = "InDepositParametersBankCase")
    protected short inDepositParametersBankCase;
    @XmlElement(name = "InEconomyGroupCustomerCategoryTmstamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inEconomyGroupCustomerCategoryTmstamp;
    @XmlElement(name = "InEconomyGroupGenericDetailSerialNum")
    protected int inEconomyGroupGenericDetailSerialNum;
    @XmlElement(name = "InEducationLevelCustomerCategoryTmstamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inEducationLevelCustomerCategoryTmstamp;
    @XmlElement(name = "InEducationLevelGenericDetailSerialNum")
    protected int inEducationLevelGenericDetailSerialNum;
    @XmlElement(name = "InFamilyStatusCustomerCategoryTmstamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inFamilyStatusCustomerCategoryTmstamp;
    @XmlElement(name = "InFamilyStatusGenericDetailSerialNum")
    protected int inFamilyStatusGenericDetailSerialNum;
    @XmlElement(name = "InIdCountryGenericDetailShortDescription")
    protected String inIdCountryGenericDetailShortDescription;
    @XmlElement(name = "InIdTypeGenericDetailSerialNum")
    protected int inIdTypeGenericDetailSerialNum;
    @XmlElement(name = "InIefSuppliedCommand")
    protected String inIefSuppliedCommand;
    @XmlElement(name = "InIefSuppliedFlag")
    protected String inIefSuppliedFlag;
    @XmlElement(name = "InIncomeLevelCustomerCategoryTmstamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inIncomeLevelCustomerCategoryTmstamp;
    @XmlElement(name = "InIncomeLevelGenericDetailSerialNum")
    protected int inIncomeLevelGenericDetailSerialNum;
    @XmlElement(name = "InJustificIdJustific")
    protected int inJustificIdJustific;
    @XmlElement(name = "InKeyCustomerCDigit")
    protected short inKeyCustomerCDigit;
    @XmlElement(name = "InKeyCustomerCustId")
    protected int inKeyCustomerCustId;
    @XmlElement(name = "InMntRecordingAuthorizer1")
    protected String inMntRecordingAuthorizer1;
    @XmlElement(name = "InMntRecordingAuthorizer2")
    protected String inMntRecordingAuthorizer2;
    @XmlElement(name = "InMntRecordingPrftSystem")
    protected short inMntRecordingPrftSystem;
    @XmlElement(name = "InMntRecordingReversalFlag")
    protected String inMntRecordingReversalFlag;
    @XmlElement(name = "InMntRecordingTerminalNumber")
    protected String inMntRecordingTerminalNumber;
    @XmlElement(name = "InMntRecordingTrxCode")
    protected int inMntRecordingTrxCode;
    @XmlElement(name = "InMonitoringBankemployeeId")
    protected String inMonitoringBankemployeeId;
    @XmlElement(name = "InMonitoringUnitCode")
    protected int inMonitoringUnitCode;
    @XmlElement(name = "InNationalityCustomerCategoryTmstamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inNationalityCustomerCategoryTmstamp;
    @XmlElement(name = "InNationalityGenericDetailSerialNum")
    protected int inNationalityGenericDetailSerialNum;
    @XmlElement(name = "InOtherAfmAfmNo")
    protected String inOtherAfmAfmNo;
    @XmlElement(name = "InOtherAfmSerialNo")
    protected short inOtherAfmSerialNo;
    @XmlElement(name = "InOtherAfmTmstamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inOtherAfmTmstamp;
    @XmlElement(name = "InOtherIdExpiryDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inOtherIdExpiryDate;
    @XmlElement(name = "InOtherIdIdNo")
    protected String inOtherIdIdNo;
    @XmlElement(name = "InOtherIdIssueAuthority")
    protected String inOtherIdIssueAuthority;
    @XmlElement(name = "InOtherIdIssueDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inOtherIdIssueDate;
    @XmlElement(name = "InOtherIdSerialNo")
    protected short inOtherIdSerialNo;
    @XmlElement(name = "InOtherIdTmstamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inOtherIdTmstamp;
    @XmlElement(name = "InPrftTransactionDescription")
    protected String inPrftTransactionDescription;
    @XmlElement(name = "InPrftTransactionIdTransact")
    protected int inPrftTransactionIdTransact;
    @XmlElement(name = "InProductIdProduct")
    protected int inProductIdProduct;
    @XmlElement(name = "InProfessionCategoryCustomerCategoryTmstamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inProfessionCategoryCustomerCategoryTmstamp;
    @XmlElement(name = "InProfessionCategoryGenericDetailSerialNum")
    protected int inProfessionCategoryGenericDetailSerialNum;
    @XmlElement(name = "InProfessionCustomerCategoryTmstamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inProfessionCustomerCategoryTmstamp;
    @XmlElement(name = "InProfessionGenericDetailSerialNum")
    protected int inProfessionGenericDetailSerialNum;
    @XmlElement(name = "InProfessionStatusCustomerCategoryTmstamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inProfessionStatusCustomerCategoryTmstamp;
    @XmlElement(name = "InProfessionStatusGenericDetailSerialNum")
    protected int inProfessionStatusGenericDetailSerialNum;
    @XmlElement(name = "InRcountryCustomerCategoryTmstamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inRcountryCustomerCategoryTmstamp;
    @XmlElement(name = "InRcountryGenericDetailDescription")
    protected String inRcountryGenericDetailDescription;
    @XmlElement(name = "InRcountryGenericDetailSerialNum")
    protected int inRcountryGenericDetailSerialNum;
    @XmlElement(name = "InRcountryGenericDetailShortDescription")
    protected String inRcountryGenericDetailShortDescription;
    @XmlElement(name = "InRegionCustomerCategoryTmstamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inRegionCustomerCategoryTmstamp;
    @XmlElement(name = "InRegionGenericDetailSerialNum")
    protected int inRegionGenericDetailSerialNum;
    @XmlElement(name = "InSubCategCustomerCategoryTmstamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inSubCategCustomerCategoryTmstamp;
    @XmlElement(name = "InSubCategGenericDetailSerialNum")
    protected int inSubCategGenericDetailSerialNum;
    @XmlElement(name = "InSubCategGenericDetailShortDescription")
    protected String inSubCategGenericDetailShortDescription;
    @XmlElement(name = "InSubCategoryGenericDetailSerialNum")
    protected int inSubCategoryGenericDetailSerialNum;
    @XmlElement(name = "InSubCategoryGenericDetailShortDescription")
    protected String inSubCategoryGenericDetailShortDescription;
    @XmlElement(name = "InTaxOfficeId")
    protected short inTaxOfficeId;
    @XmlElement(name = "InThinkingCurrencyIdCurrency")
    protected int inThinkingCurrencyIdCurrency;
    @XmlElement(name = "InTimestampCustomerTmstamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inTimestampCustomerTmstamp;
    @XmlElement(name = "InCustomerEnableFor24c")
    protected String inCustomerEnableFor24C;
    @XmlElement(name = "InCustomerCustOpenDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inCustomerCustOpenDate;
    @XmlElement(name = "InGrpCustcat")
    protected ArrayOfInGrpCustcat inGrpCustcat;
    @XmlElement(name = "InCustAddressAccomodationDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inCustAddressAccomodationDate;
    @XmlElement(name = "InCustAddressInternetAddress")
    protected String inCustAddressInternetAddress;
    @XmlElement(name = "InCustAddressEMail")
    protected String inCustAddressEMail;
    @XmlElement(name = "InCustAddressTelephone3")
    protected String inCustAddressTelephone3;
    @XmlElement(name = "InCustAddressTelephone2")
    protected String inCustAddressTelephone2;
    @XmlElement(name = "InCustAddressAddress6")
    protected String inCustAddressAddress6;
    @XmlElement(name = "InCustAddressAddress5")
    protected String inCustAddressAddress5;
    @XmlElement(name = "InCustAddressAddress4")
    protected String inCustAddressAddress4;
    @XmlElement(name = "InCustAddressAddress3")
    protected String inCustAddressAddress3;
    @XmlElement(name = "InCustAddressLatinInd")
    protected String inCustAddressLatinInd;
    @XmlElement(name = "InCustAddressPtsInd")
    protected String inCustAddressPtsInd;
    @XmlElement(name = "InCustAddressCommunicationAddress")
    protected String inCustAddressCommunicationAddress;
    @XmlElement(name = "InCustAddressEntryStatus")
    protected String inCustAddressEntryStatus;
    @XmlElement(name = "InCustAddressEntryComments")
    protected String inCustAddressEntryComments;
    @XmlElement(name = "InCustomerOwnershipIndication")
    protected String inCustomerOwnershipIndication;
    @XmlElement(name = "InCustomerContractExpiryDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inCustomerContractExpiryDate;
    @XmlElement(name = "InCustomerContract")
    protected String inCustomerContract;
    @XmlElement(name = "InCustomerMobileTel2")
    protected String inCustomerMobileTel2;
    @XmlElement(name = "InCustomerEMail2")
    protected String inCustomerEMail2;
    @XmlElement(name = "InEmployerCustAddressSerialNum")
    protected short inEmployerCustAddressSerialNum;
    @XmlElement(name = "InEmployerCustAddressAddressType")
    protected String inEmployerCustAddressAddressType;
    @XmlElement(name = "InEmployerCustAddressFaxNo")
    protected String inEmployerCustAddressFaxNo;
    @XmlElement(name = "InEmployerCustAddressCity")
    protected String inEmployerCustAddressCity;
    @XmlElement(name = "InEmployerCustAddressZipCode")
    protected String inEmployerCustAddressZipCode;
    @XmlElement(name = "InEmployerCustAddressTelephone")
    protected String inEmployerCustAddressTelephone;
    @XmlElement(name = "InEmployerCustAddressCommunicationAddress")
    protected String inEmployerCustAddressCommunicationAddress;
    @XmlElement(name = "InEmployerCustAddressEntryStatus")
    protected String inEmployerCustAddressEntryStatus;
    @XmlElement(name = "InEmployerCustAddressTmstamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inEmployerCustAddressTmstamp;
    @XmlElement(name = "InEmployerCustAddressRegion")
    protected String inEmployerCustAddressRegion;
    @XmlElement(name = "InEmployerCustAddressAddress1")
    protected String inEmployerCustAddressAddress1;
    @XmlElement(name = "InEmployerCustAddressAddress2")
    protected String inEmployerCustAddressAddress2;
    @XmlElement(name = "InEmployerCustAddressEntryComments")
    protected String inEmployerCustAddressEntryComments;
    @XmlElement(name = "InEmployerCustAddressMailBox")
    protected String inEmployerCustAddressMailBox;
    @XmlElement(name = "InEmployerCustAddressSegmFlags")
    protected String inEmployerCustAddressSegmFlags;
    @XmlElement(name = "InEmployerCustAddressAccomodationDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inEmployerCustAddressAccomodationDate;
    @XmlElement(name = "InEmployerCustAddressInternetAddress")
    protected String inEmployerCustAddressInternetAddress;
    @XmlElement(name = "InEmployerCustAddressEMail")
    protected String inEmployerCustAddressEMail;
    @XmlElement(name = "InEmployerCustAddressTelephone3")
    protected String inEmployerCustAddressTelephone3;
    @XmlElement(name = "InEmployerCustAddressTelephone2")
    protected String inEmployerCustAddressTelephone2;
    @XmlElement(name = "InEmployerCustAddressAddress6")
    protected String inEmployerCustAddressAddress6;
    @XmlElement(name = "InEmployerCustAddressAddress5")
    protected String inEmployerCustAddressAddress5;
    @XmlElement(name = "InEmployerCustAddressAddress4")
    protected String inEmployerCustAddressAddress4;
    @XmlElement(name = "InEmployerCustAddressAddress3")
    protected String inEmployerCustAddressAddress3;
    @XmlElement(name = "InEmployerCustAddressLatinInd")
    protected String inEmployerCustAddressLatinInd;
    @XmlElement(name = "InEmployerCustAddressPtsInd")
    protected String inEmployerCustAddressPtsInd;
    @XmlElement(name = "InEmployerAddressDistrictGenericDetailSerialNum")
    protected int inEmployerAddressDistrictGenericDetailSerialNum;
    @XmlElement(name = "InEmployerAddressDistrictGenericDetailDescription")
    protected String inEmployerAddressDistrictGenericDetailDescription;
    @XmlElement(name = "InEmployerAddressCountryGenericDetailDescription")
    protected String inEmployerAddressCountryGenericDetailDescription;
    @XmlElement(name = "InEmployerAddressCountryGenericDetailShortDescription")
    protected String inEmployerAddressCountryGenericDetailShortDescription;
    @XmlElement(name = "InEmployerCustAddrParrelDCode")
    protected String inEmployerCustAddrParrelDCode;
    @XmlElement(name = "InEmployerCustAddrParrelDSn")
    protected int inEmployerCustAddrParrelDSn;
    @XmlElement(name = "InCustAddrParrelDCode")
    protected String inCustAddrParrelDCode;
    @XmlElement(name = "InCustAddrParrelDSn")
    protected int inCustAddrParrelDSn;
    @XmlElement(name = "InCustomerCommunMethod")
    protected String inCustomerCommunMethod;
    @XmlElement(name = "InCustomerCbsId")
    protected String inCustomerCbsId;
    @XmlElement(name = "InCustomerIapplyId")
    protected String inCustomerIapplyId;
    @XmlElement(name = "InCustomerCrmId")
    protected String inCustomerCrmId;

    /**
     * Gets the value of the in2NdCitizenshipCustomerCategoryTmstamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getIn2NdCitizenshipCustomerCategoryTmstamp() {
        return in2NdCitizenshipCustomerCategoryTmstamp;
    }

    /**
     * Sets the value of the in2NdCitizenshipCustomerCategoryTmstamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setIn2NdCitizenshipCustomerCategoryTmstamp(XMLGregorianCalendar value) {
        this.in2NdCitizenshipCustomerCategoryTmstamp = value;
    }

    /**
     * Gets the value of the in2NdCitizenshipGenericDetailSerialNum property.
     * 
     */
    public int getIn2NdCitizenshipGenericDetailSerialNum() {
        return in2NdCitizenshipGenericDetailSerialNum;
    }

    /**
     * Sets the value of the in2NdCitizenshipGenericDetailSerialNum property.
     * 
     */
    public void setIn2NdCitizenshipGenericDetailSerialNum(int value) {
        this.in2NdCitizenshipGenericDetailSerialNum = value;
    }

    /**
     * Gets the value of the in2NdProfessionCustomerCategoryTmstamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getIn2NdProfessionCustomerCategoryTmstamp() {
        return in2NdProfessionCustomerCategoryTmstamp;
    }

    /**
     * Sets the value of the in2NdProfessionCustomerCategoryTmstamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setIn2NdProfessionCustomerCategoryTmstamp(XMLGregorianCalendar value) {
        this.in2NdProfessionCustomerCategoryTmstamp = value;
    }

    /**
     * Gets the value of the in2NdProfessionGenericDetailSerialNum property.
     * 
     */
    public int getIn2NdProfessionGenericDetailSerialNum() {
        return in2NdProfessionGenericDetailSerialNum;
    }

    /**
     * Sets the value of the in2NdProfessionGenericDetailSerialNum property.
     * 
     */
    public void setIn2NdProfessionGenericDetailSerialNum(int value) {
        this.in2NdProfessionGenericDetailSerialNum = value;
    }

    /**
     * Gets the value of the inActivityCustomerCategoryTmstamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInActivityCustomerCategoryTmstamp() {
        return inActivityCustomerCategoryTmstamp;
    }

    /**
     * Sets the value of the inActivityCustomerCategoryTmstamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInActivityCustomerCategoryTmstamp(XMLGregorianCalendar value) {
        this.inActivityCustomerCategoryTmstamp = value;
    }

    /**
     * Gets the value of the inActivityGenericDetailSerialNum property.
     * 
     */
    public int getInActivityGenericDetailSerialNum() {
        return inActivityGenericDetailSerialNum;
    }

    /**
     * Sets the value of the inActivityGenericDetailSerialNum property.
     * 
     */
    public void setInActivityGenericDetailSerialNum(int value) {
        this.inActivityGenericDetailSerialNum = value;
    }

    /**
     * Gets the value of the inActivityTypeCustomerCategoryTmstamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInActivityTypeCustomerCategoryTmstamp() {
        return inActivityTypeCustomerCategoryTmstamp;
    }

    /**
     * Sets the value of the inActivityTypeCustomerCategoryTmstamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInActivityTypeCustomerCategoryTmstamp(XMLGregorianCalendar value) {
        this.inActivityTypeCustomerCategoryTmstamp = value;
    }

    /**
     * Gets the value of the inActivityTypeGenericDetailSerialNum property.
     * 
     */
    public int getInActivityTypeGenericDetailSerialNum() {
        return inActivityTypeGenericDetailSerialNum;
    }

    /**
     * Sets the value of the inActivityTypeGenericDetailSerialNum property.
     * 
     */
    public void setInActivityTypeGenericDetailSerialNum(int value) {
        this.inActivityTypeGenericDetailSerialNum = value;
    }

    /**
     * Gets the value of the inActivityTypeGenericDetailShortDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInActivityTypeGenericDetailShortDescription() {
        return inActivityTypeGenericDetailShortDescription;
    }

    /**
     * Sets the value of the inActivityTypeGenericDetailShortDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInActivityTypeGenericDetailShortDescription(String value) {
        this.inActivityTypeGenericDetailShortDescription = value;
    }

    /**
     * Gets the value of the inAddressCountryGenericDetailShortDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInAddressCountryGenericDetailShortDescription() {
        return inAddressCountryGenericDetailShortDescription;
    }

    /**
     * Sets the value of the inAddressCountryGenericDetailShortDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInAddressCountryGenericDetailShortDescription(String value) {
        this.inAddressCountryGenericDetailShortDescription = value;
    }

    /**
     * Gets the value of the inAddressDistrictGenericDetailSerialNum property.
     * 
     */
    public int getInAddressDistrictGenericDetailSerialNum() {
        return inAddressDistrictGenericDetailSerialNum;
    }

    /**
     * Sets the value of the inAddressDistrictGenericDetailSerialNum property.
     * 
     */
    public void setInAddressDistrictGenericDetailSerialNum(int value) {
        this.inAddressDistrictGenericDetailSerialNum = value;
    }

    /**
     * Gets the value of the inAfmIssueCountryGenericDetailShortDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInAfmIssueCountryGenericDetailShortDescription() {
        return inAfmIssueCountryGenericDetailShortDescription;
    }

    /**
     * Sets the value of the inAfmIssueCountryGenericDetailShortDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInAfmIssueCountryGenericDetailShortDescription(String value) {
        this.inAfmIssueCountryGenericDetailShortDescription = value;
    }

    /**
     * Gets the value of the inAtenetCustCardInfoCardNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInAtenetCustCardInfoCardNo() {
        return inAtenetCustCardInfoCardNo;
    }

    /**
     * Sets the value of the inAtenetCustCardInfoCardNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInAtenetCustCardInfoCardNo(String value) {
        this.inAtenetCustCardInfoCardNo = value;
    }

    /**
     * Gets the value of the inAtenetCustCardInfoEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInAtenetCustCardInfoEndDate() {
        return inAtenetCustCardInfoEndDate;
    }

    /**
     * Sets the value of the inAtenetCustCardInfoEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInAtenetCustCardInfoEndDate(XMLGregorianCalendar value) {
        this.inAtenetCustCardInfoEndDate = value;
    }

    /**
     * Gets the value of the inAtenetCustCardInfoStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInAtenetCustCardInfoStartDate() {
        return inAtenetCustCardInfoStartDate;
    }

    /**
     * Sets the value of the inAtenetCustCardInfoStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInAtenetCustCardInfoStartDate(XMLGregorianCalendar value) {
        this.inAtenetCustCardInfoStartDate = value;
    }

    /**
     * Gets the value of the inAttractionCustomerCategoryTmstamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInAttractionCustomerCategoryTmstamp() {
        return inAttractionCustomerCategoryTmstamp;
    }

    /**
     * Sets the value of the inAttractionCustomerCategoryTmstamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInAttractionCustomerCategoryTmstamp(XMLGregorianCalendar value) {
        this.inAttractionCustomerCategoryTmstamp = value;
    }

    /**
     * Gets the value of the inAttractionGenericDetailSerialNum property.
     * 
     */
    public int getInAttractionGenericDetailSerialNum() {
        return inAttractionGenericDetailSerialNum;
    }

    /**
     * Sets the value of the inAttractionGenericDetailSerialNum property.
     * 
     */
    public void setInAttractionGenericDetailSerialNum(int value) {
        this.inAttractionGenericDetailSerialNum = value;
    }

    /**
     * Gets the value of the inAttractionUsrCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInAttractionUsrCode() {
        return inAttractionUsrCode;
    }

    /**
     * Sets the value of the inAttractionUsrCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInAttractionUsrCode(String value) {
        this.inAttractionUsrCode = value;
    }

    /**
     * Gets the value of the inAuthGrantedIefSuppliedFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInAuthGrantedIefSuppliedFlag() {
        return inAuthGrantedIefSuppliedFlag;
    }

    /**
     * Sets the value of the inAuthGrantedIefSuppliedFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInAuthGrantedIefSuppliedFlag(String value) {
        this.inAuthGrantedIefSuppliedFlag = value;
    }

    /**
     * Gets the value of the inBankemployeeId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInBankemployeeId() {
        return inBankemployeeId;
    }

    /**
     * Sets the value of the inBankemployeeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInBankemployeeId(String value) {
        this.inBankemployeeId = value;
    }

    /**
     * Gets the value of the inBasileiaCustomerCategoryTmstamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInBasileiaCustomerCategoryTmstamp() {
        return inBasileiaCustomerCategoryTmstamp;
    }

    /**
     * Sets the value of the inBasileiaCustomerCategoryTmstamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInBasileiaCustomerCategoryTmstamp(XMLGregorianCalendar value) {
        this.inBasileiaCustomerCategoryTmstamp = value;
    }

    /**
     * Gets the value of the inBasileiaGenericDetailDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInBasileiaGenericDetailDescription() {
        return inBasileiaGenericDetailDescription;
    }

    /**
     * Sets the value of the inBasileiaGenericDetailDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInBasileiaGenericDetailDescription(String value) {
        this.inBasileiaGenericDetailDescription = value;
    }

    /**
     * Gets the value of the inBasileiaGenericDetailEntryStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInBasileiaGenericDetailEntryStatus() {
        return inBasileiaGenericDetailEntryStatus;
    }

    /**
     * Sets the value of the inBasileiaGenericDetailEntryStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInBasileiaGenericDetailEntryStatus(String value) {
        this.inBasileiaGenericDetailEntryStatus = value;
    }

    /**
     * Gets the value of the inBasileiaGenericDetailParameterType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInBasileiaGenericDetailParameterType() {
        return inBasileiaGenericDetailParameterType;
    }

    /**
     * Sets the value of the inBasileiaGenericDetailParameterType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInBasileiaGenericDetailParameterType(String value) {
        this.inBasileiaGenericDetailParameterType = value;
    }

    /**
     * Gets the value of the inBasileiaGenericDetailSerialNum property.
     * 
     */
    public int getInBasileiaGenericDetailSerialNum() {
        return inBasileiaGenericDetailSerialNum;
    }

    /**
     * Sets the value of the inBasileiaGenericDetailSerialNum property.
     * 
     */
    public void setInBasileiaGenericDetailSerialNum(int value) {
        this.inBasileiaGenericDetailSerialNum = value;
    }

    /**
     * Gets the value of the inBasileiaGenericDetailShortDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInBasileiaGenericDetailShortDescription() {
        return inBasileiaGenericDetailShortDescription;
    }

    /**
     * Sets the value of the inBasileiaGenericDetailShortDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInBasileiaGenericDetailShortDescription(String value) {
        this.inBasileiaGenericDetailShortDescription = value;
    }

    /**
     * Gets the value of the inBasileiaGenericDetailTmstamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInBasileiaGenericDetailTmstamp() {
        return inBasileiaGenericDetailTmstamp;
    }

    /**
     * Sets the value of the inBasileiaGenericDetailTmstamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInBasileiaGenericDetailTmstamp(XMLGregorianCalendar value) {
        this.inBasileiaGenericDetailTmstamp = value;
    }

    /**
     * Gets the value of the inBirthCountryCustomerCategoryTmstamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInBirthCountryCustomerCategoryTmstamp() {
        return inBirthCountryCustomerCategoryTmstamp;
    }

    /**
     * Sets the value of the inBirthCountryCustomerCategoryTmstamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInBirthCountryCustomerCategoryTmstamp(XMLGregorianCalendar value) {
        this.inBirthCountryCustomerCategoryTmstamp = value;
    }

    /**
     * Gets the value of the inBirthCountryGenericDetailShortDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInBirthCountryGenericDetailShortDescription() {
        return inBirthCountryGenericDetailShortDescription;
    }

    /**
     * Sets the value of the inBirthCountryGenericDetailShortDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInBirthCountryGenericDetailShortDescription(String value) {
        this.inBirthCountryGenericDetailShortDescription = value;
    }

    /**
     * Gets the value of the inBopCountryCustomerCategoryTmstamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInBopCountryCustomerCategoryTmstamp() {
        return inBopCountryCustomerCategoryTmstamp;
    }

    /**
     * Sets the value of the inBopCountryCustomerCategoryTmstamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInBopCountryCustomerCategoryTmstamp(XMLGregorianCalendar value) {
        this.inBopCountryCustomerCategoryTmstamp = value;
    }

    /**
     * Gets the value of the inBopCountryGenericDetailSerialNum property.
     * 
     */
    public int getInBopCountryGenericDetailSerialNum() {
        return inBopCountryGenericDetailSerialNum;
    }

    /**
     * Sets the value of the inBopCountryGenericDetailSerialNum property.
     * 
     */
    public void setInBopCountryGenericDetailSerialNum(int value) {
        this.inBopCountryGenericDetailSerialNum = value;
    }

    /**
     * Gets the value of the inBopCountryGenericDetailShortDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInBopCountryGenericDetailShortDescription() {
        return inBopCountryGenericDetailShortDescription;
    }

    /**
     * Sets the value of the inBopCountryGenericDetailShortDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInBopCountryGenericDetailShortDescription(String value) {
        this.inBopCountryGenericDetailShortDescription = value;
    }

    /**
     * Gets the value of the inChamberAuthorityCustomerCategoryTmstamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInChamberAuthorityCustomerCategoryTmstamp() {
        return inChamberAuthorityCustomerCategoryTmstamp;
    }

    /**
     * Sets the value of the inChamberAuthorityCustomerCategoryTmstamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInChamberAuthorityCustomerCategoryTmstamp(XMLGregorianCalendar value) {
        this.inChamberAuthorityCustomerCategoryTmstamp = value;
    }

    /**
     * Gets the value of the inChamberAuthorityGenericDetailSerialNum property.
     * 
     */
    public int getInChamberAuthorityGenericDetailSerialNum() {
        return inChamberAuthorityGenericDetailSerialNum;
    }

    /**
     * Sets the value of the inChamberAuthorityGenericDetailSerialNum property.
     * 
     */
    public void setInChamberAuthorityGenericDetailSerialNum(int value) {
        this.inChamberAuthorityGenericDetailSerialNum = value;
    }

    /**
     * Gets the value of the inCitizenshipCustomerCategoryTmstamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInCitizenshipCustomerCategoryTmstamp() {
        return inCitizenshipCustomerCategoryTmstamp;
    }

    /**
     * Sets the value of the inCitizenshipCustomerCategoryTmstamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInCitizenshipCustomerCategoryTmstamp(XMLGregorianCalendar value) {
        this.inCitizenshipCustomerCategoryTmstamp = value;
    }

    /**
     * Gets the value of the inCitizenshipGenericDetailSerialNum property.
     * 
     */
    public int getInCitizenshipGenericDetailSerialNum() {
        return inCitizenshipGenericDetailSerialNum;
    }

    /**
     * Sets the value of the inCitizenshipGenericDetailSerialNum property.
     * 
     */
    public void setInCitizenshipGenericDetailSerialNum(int value) {
        this.inCitizenshipGenericDetailSerialNum = value;
    }

    /**
     * Gets the value of the inCommunicationLangCustomerCategoryTmstamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInCommunicationLangCustomerCategoryTmstamp() {
        return inCommunicationLangCustomerCategoryTmstamp;
    }

    /**
     * Sets the value of the inCommunicationLangCustomerCategoryTmstamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInCommunicationLangCustomerCategoryTmstamp(XMLGregorianCalendar value) {
        this.inCommunicationLangCustomerCategoryTmstamp = value;
    }

    /**
     * Gets the value of the inCommunicationLangGenericDetailSerialNum property.
     * 
     */
    public int getInCommunicationLangGenericDetailSerialNum() {
        return inCommunicationLangGenericDetailSerialNum;
    }

    /**
     * Sets the value of the inCommunicationLangGenericDetailSerialNum property.
     * 
     */
    public void setInCommunicationLangGenericDetailSerialNum(int value) {
        this.inCommunicationLangGenericDetailSerialNum = value;
    }

    /**
     * Gets the value of the inCompanyCategCustomerCategoryTmstamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInCompanyCategCustomerCategoryTmstamp() {
        return inCompanyCategCustomerCategoryTmstamp;
    }

    /**
     * Sets the value of the inCompanyCategCustomerCategoryTmstamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInCompanyCategCustomerCategoryTmstamp(XMLGregorianCalendar value) {
        this.inCompanyCategCustomerCategoryTmstamp = value;
    }

    /**
     * Gets the value of the inCompanyCategGenericDetailSerialNum property.
     * 
     */
    public int getInCompanyCategGenericDetailSerialNum() {
        return inCompanyCategGenericDetailSerialNum;
    }

    /**
     * Sets the value of the inCompanyCategGenericDetailSerialNum property.
     * 
     */
    public void setInCompanyCategGenericDetailSerialNum(int value) {
        this.inCompanyCategGenericDetailSerialNum = value;
    }

    /**
     * Gets the value of the inCompanyCategGenericDetailShortDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCompanyCategGenericDetailShortDescription() {
        return inCompanyCategGenericDetailShortDescription;
    }

    /**
     * Sets the value of the inCompanyCategGenericDetailShortDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCompanyCategGenericDetailShortDescription(String value) {
        this.inCompanyCategGenericDetailShortDescription = value;
    }

    /**
     * Gets the value of the inConfirmBirthdataIefSuppliedFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInConfirmBirthdataIefSuppliedFlag() {
        return inConfirmBirthdataIefSuppliedFlag;
    }

    /**
     * Sets the value of the inConfirmBirthdataIefSuppliedFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInConfirmBirthdataIefSuppliedFlag(String value) {
        this.inConfirmBirthdataIefSuppliedFlag = value;
    }

    /**
     * Gets the value of the inConfirmDoubtAfmIefSuppliedFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInConfirmDoubtAfmIefSuppliedFlag() {
        return inConfirmDoubtAfmIefSuppliedFlag;
    }

    /**
     * Sets the value of the inConfirmDoubtAfmIefSuppliedFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInConfirmDoubtAfmIefSuppliedFlag(String value) {
        this.inConfirmDoubtAfmIefSuppliedFlag = value;
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
     * Gets the value of the inCustAddressAddressType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCustAddressAddressType() {
        return inCustAddressAddressType;
    }

    /**
     * Sets the value of the inCustAddressAddressType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCustAddressAddressType(String value) {
        this.inCustAddressAddressType = value;
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
     * Gets the value of the inCustAddressFaxNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCustAddressFaxNo() {
        return inCustAddressFaxNo;
    }

    /**
     * Sets the value of the inCustAddressFaxNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCustAddressFaxNo(String value) {
        this.inCustAddressFaxNo = value;
    }

    /**
     * Gets the value of the inCustAddressMailBox property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCustAddressMailBox() {
        return inCustAddressMailBox;
    }

    /**
     * Sets the value of the inCustAddressMailBox property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCustAddressMailBox(String value) {
        this.inCustAddressMailBox = value;
    }

    /**
     * Gets the value of the inCustAddressRegion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCustAddressRegion() {
        return inCustAddressRegion;
    }

    /**
     * Sets the value of the inCustAddressRegion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCustAddressRegion(String value) {
        this.inCustAddressRegion = value;
    }

    /**
     * Gets the value of the inCustAddressSegmFlags property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCustAddressSegmFlags() {
        return inCustAddressSegmFlags;
    }

    /**
     * Sets the value of the inCustAddressSegmFlags property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCustAddressSegmFlags(String value) {
        this.inCustAddressSegmFlags = value;
    }

    /**
     * Gets the value of the inCustAddressSerialNum property.
     * 
     */
    public short getInCustAddressSerialNum() {
        return inCustAddressSerialNum;
    }

    /**
     * Sets the value of the inCustAddressSerialNum property.
     * 
     */
    public void setInCustAddressSerialNum(short value) {
        this.inCustAddressSerialNum = value;
    }

    /**
     * Gets the value of the inCustAddressTelephone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCustAddressTelephone() {
        return inCustAddressTelephone;
    }

    /**
     * Sets the value of the inCustAddressTelephone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCustAddressTelephone(String value) {
        this.inCustAddressTelephone = value;
    }

    /**
     * Gets the value of the inCustAddressTmstamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInCustAddressTmstamp() {
        return inCustAddressTmstamp;
    }

    /**
     * Sets the value of the inCustAddressTmstamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInCustAddressTmstamp(XMLGregorianCalendar value) {
        this.inCustAddressTmstamp = value;
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
     * Gets the value of the inCustMarketCustomerCategoryTmstamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInCustMarketCustomerCategoryTmstamp() {
        return inCustMarketCustomerCategoryTmstamp;
    }

    /**
     * Sets the value of the inCustMarketCustomerCategoryTmstamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInCustMarketCustomerCategoryTmstamp(XMLGregorianCalendar value) {
        this.inCustMarketCustomerCategoryTmstamp = value;
    }

    /**
     * Gets the value of the inCustMarketGenericDetailDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCustMarketGenericDetailDescription() {
        return inCustMarketGenericDetailDescription;
    }

    /**
     * Sets the value of the inCustMarketGenericDetailDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCustMarketGenericDetailDescription(String value) {
        this.inCustMarketGenericDetailDescription = value;
    }

    /**
     * Gets the value of the inCustMarketGenericDetailEntryStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCustMarketGenericDetailEntryStatus() {
        return inCustMarketGenericDetailEntryStatus;
    }

    /**
     * Sets the value of the inCustMarketGenericDetailEntryStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCustMarketGenericDetailEntryStatus(String value) {
        this.inCustMarketGenericDetailEntryStatus = value;
    }

    /**
     * Gets the value of the inCustMarketGenericDetailSerialNum property.
     * 
     */
    public int getInCustMarketGenericDetailSerialNum() {
        return inCustMarketGenericDetailSerialNum;
    }

    /**
     * Sets the value of the inCustMarketGenericDetailSerialNum property.
     * 
     */
    public void setInCustMarketGenericDetailSerialNum(int value) {
        this.inCustMarketGenericDetailSerialNum = value;
    }

    /**
     * Gets the value of the inCustomerAttractionDetails property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCustomerAttractionDetails() {
        return inCustomerAttractionDetails;
    }

    /**
     * Sets the value of the inCustomerAttractionDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCustomerAttractionDetails(String value) {
        this.inCustomerAttractionDetails = value;
    }

    /**
     * Gets the value of the inCustomerAttractionPerson property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCustomerAttractionPerson() {
        return inCustomerAttractionPerson;
    }

    /**
     * Sets the value of the inCustomerAttractionPerson property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCustomerAttractionPerson(String value) {
        this.inCustomerAttractionPerson = value;
    }

    /**
     * Gets the value of the inCustomerBirthplace property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCustomerBirthplace() {
        return inCustomerBirthplace;
    }

    /**
     * Sets the value of the inCustomerBirthplace property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCustomerBirthplace(String value) {
        this.inCustomerBirthplace = value;
    }

    /**
     * Gets the value of the inCustomerBlacklistedInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCustomerBlacklistedInd() {
        return inCustomerBlacklistedInd;
    }

    /**
     * Sets the value of the inCustomerBlacklistedInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCustomerBlacklistedInd(String value) {
        this.inCustomerBlacklistedInd = value;
    }

    /**
     * Gets the value of the inCustomerBusinessInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCustomerBusinessInd() {
        return inCustomerBusinessInd;
    }

    /**
     * Sets the value of the inCustomerBusinessInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCustomerBusinessInd(String value) {
        this.inCustomerBusinessInd = value;
    }

    /**
     * Gets the value of the inCustomerCertificCust property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCustomerCertificCust() {
        return inCustomerCertificCust;
    }

    /**
     * Sets the value of the inCustomerCertificCust property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCustomerCertificCust(String value) {
        this.inCustomerCertificCust = value;
    }

    /**
     * Gets the value of the inCustomerCertificDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInCustomerCertificDate() {
        return inCustomerCertificDate;
    }

    /**
     * Sets the value of the inCustomerCertificDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInCustomerCertificDate(XMLGregorianCalendar value) {
        this.inCustomerCertificDate = value;
    }

    /**
     * Gets the value of the inCustomerChamberComments property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCustomerChamberComments() {
        return inCustomerChamberComments;
    }

    /**
     * Sets the value of the inCustomerChamberComments property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCustomerChamberComments(String value) {
        this.inCustomerChamberComments = value;
    }

    /**
     * Gets the value of the inCustomerChamberId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCustomerChamberId() {
        return inCustomerChamberId;
    }

    /**
     * Sets the value of the inCustomerChamberId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCustomerChamberId(String value) {
        this.inCustomerChamberId = value;
    }

    /**
     * Gets the value of the inCustomerChildrenAbove18 property.
     * 
     */
    public short getInCustomerChildrenAbove18() {
        return inCustomerChildrenAbove18;
    }

    /**
     * Sets the value of the inCustomerChildrenAbove18 property.
     * 
     */
    public void setInCustomerChildrenAbove18(short value) {
        this.inCustomerChildrenAbove18 = value;
    }

    /**
     * Gets the value of the inCustomerConsolidStatmFlg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCustomerConsolidStatmFlg() {
        return inCustomerConsolidStatmFlg;
    }

    /**
     * Sets the value of the inCustomerConsolidStatmFlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCustomerConsolidStatmFlg(String value) {
        this.inCustomerConsolidStatmFlg = value;
    }

    /**
     * Gets the value of the inCustomerCustStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCustomerCustStatus() {
        return inCustomerCustStatus;
    }

    /**
     * Sets the value of the inCustomerCustStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCustomerCustStatus(String value) {
        this.inCustomerCustStatus = value;
    }

    /**
     * Gets the value of the inCustomerDaiNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCustomerDaiNumber() {
        return inCustomerDaiNumber;
    }

    /**
     * Sets the value of the inCustomerDaiNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCustomerDaiNumber(String value) {
        this.inCustomerDaiNumber = value;
    }

    /**
     * Gets the value of the inCustomerDateOfBirth property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInCustomerDateOfBirth() {
        return inCustomerDateOfBirth;
    }

    /**
     * Sets the value of the inCustomerDateOfBirth property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInCustomerDateOfBirth(XMLGregorianCalendar value) {
        this.inCustomerDateOfBirth = value;
    }

    /**
     * Gets the value of the inCustomerDocExpireDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInCustomerDocExpireDate() {
        return inCustomerDocExpireDate;
    }

    /**
     * Sets the value of the inCustomerDocExpireDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInCustomerDocExpireDate(XMLGregorianCalendar value) {
        this.inCustomerDocExpireDate = value;
    }

    /**
     * Gets the value of the inCustomerEMail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCustomerEMail() {
        return inCustomerEMail;
    }

    /**
     * Sets the value of the inCustomerEMail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCustomerEMail(String value) {
        this.inCustomerEMail = value;
    }

    /**
     * Gets the value of the inCustomerEmployementStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInCustomerEmployementStartDate() {
        return inCustomerEmployementStartDate;
    }

    /**
     * Sets the value of the inCustomerEmployementStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInCustomerEmployementStartDate(XMLGregorianCalendar value) {
        this.inCustomerEmployementStartDate = value;
    }

    /**
     * Gets the value of the inCustomerEmployer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCustomerEmployer() {
        return inCustomerEmployer;
    }

    /**
     * Sets the value of the inCustomerEmployer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCustomerEmployer(String value) {
        this.inCustomerEmployer = value;
    }

    /**
     * Gets the value of the inCustomerEmployerAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCustomerEmployerAddress() {
        return inCustomerEmployerAddress;
    }

    /**
     * Sets the value of the inCustomerEmployerAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCustomerEmployerAddress(String value) {
        this.inCustomerEmployerAddress = value;
    }

    /**
     * Gets the value of the inCustomerEntryComments property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCustomerEntryComments() {
        return inCustomerEntryComments;
    }

    /**
     * Sets the value of the inCustomerEntryComments property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCustomerEntryComments(String value) {
        this.inCustomerEntryComments = value;
    }

    /**
     * Gets the value of the inCustomerEntryStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCustomerEntryStatus() {
        return inCustomerEntryStatus;
    }

    /**
     * Sets the value of the inCustomerEntryStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCustomerEntryStatus(String value) {
        this.inCustomerEntryStatus = value;
    }

    /**
     * Gets the value of the inCustomerFamilyMembers property.
     * 
     */
    public short getInCustomerFamilyMembers() {
        return inCustomerFamilyMembers;
    }

    /**
     * Sets the value of the inCustomerFamilyMembers property.
     * 
     */
    public void setInCustomerFamilyMembers(short value) {
        this.inCustomerFamilyMembers = value;
    }

    /**
     * Gets the value of the inCustomerFatherName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCustomerFatherName() {
        return inCustomerFatherName;
    }

    /**
     * Sets the value of the inCustomerFatherName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCustomerFatherName(String value) {
        this.inCustomerFatherName = value;
    }

    /**
     * Gets the value of the inCustomerFatherSurname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCustomerFatherSurname() {
        return inCustomerFatherSurname;
    }

    /**
     * Sets the value of the inCustomerFatherSurname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCustomerFatherSurname(String value) {
        this.inCustomerFatherSurname = value;
    }

    /**
     * Gets the value of the inCustomerFicliCode property.
     * 
     */
    public int getInCustomerFicliCode() {
        return inCustomerFicliCode;
    }

    /**
     * Sets the value of the inCustomerFicliCode property.
     * 
     */
    public void setInCustomerFicliCode(int value) {
        this.inCustomerFicliCode = value;
    }

    /**
     * Gets the value of the inCustomerFicliDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCustomerFicliDesc() {
        return inCustomerFicliDesc;
    }

    /**
     * Sets the value of the inCustomerFicliDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCustomerFicliDesc(String value) {
        this.inCustomerFicliDesc = value;
    }

    /**
     * Gets the value of the inCustomerFinRange property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInCustomerFinRange() {
        return inCustomerFinRange;
    }

    /**
     * Sets the value of the inCustomerFinRange property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInCustomerFinRange(BigDecimal value) {
        this.inCustomerFinRange = value;
    }

    /**
     * Gets the value of the inCustomerFinRangeDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInCustomerFinRangeDt() {
        return inCustomerFinRangeDt;
    }

    /**
     * Sets the value of the inCustomerFinRangeDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInCustomerFinRangeDt(XMLGregorianCalendar value) {
        this.inCustomerFinRangeDt = value;
    }

    /**
     * Gets the value of the inCustomerFirstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCustomerFirstName() {
        return inCustomerFirstName;
    }

    /**
     * Sets the value of the inCustomerFirstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCustomerFirstName(String value) {
        this.inCustomerFirstName = value;
    }

    /**
     * Gets the value of the inCustomerIncompleteUComnt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCustomerIncompleteUComnt() {
        return inCustomerIncompleteUComnt;
    }

    /**
     * Sets the value of the inCustomerIncompleteUComnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCustomerIncompleteUComnt(String value) {
        this.inCustomerIncompleteUComnt = value;
    }

    /**
     * Gets the value of the inCustomerInternetAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCustomerInternetAddress() {
        return inCustomerInternetAddress;
    }

    /**
     * Sets the value of the inCustomerInternetAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCustomerInternetAddress(String value) {
        this.inCustomerInternetAddress = value;
    }

    /**
     * Gets the value of the inCustomerLastUpdate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInCustomerLastUpdate() {
        return inCustomerLastUpdate;
    }

    /**
     * Sets the value of the inCustomerLastUpdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInCustomerLastUpdate(XMLGregorianCalendar value) {
        this.inCustomerLastUpdate = value;
    }

    /**
     * Gets the value of the inCustomerLatinFirstname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCustomerLatinFirstname() {
        return inCustomerLatinFirstname;
    }

    /**
     * Sets the value of the inCustomerLatinFirstname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCustomerLatinFirstname(String value) {
        this.inCustomerLatinFirstname = value;
    }

    /**
     * Gets the value of the inCustomerLatinSurname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCustomerLatinSurname() {
        return inCustomerLatinSurname;
    }

    /**
     * Sets the value of the inCustomerLatinSurname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCustomerLatinSurname(String value) {
        this.inCustomerLatinSurname = value;
    }

    /**
     * Gets the value of the inCustomerMailInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCustomerMailInd() {
        return inCustomerMailInd;
    }

    /**
     * Sets the value of the inCustomerMailInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCustomerMailInd(String value) {
        this.inCustomerMailInd = value;
    }

    /**
     * Gets the value of the inCustomerMajorBeneficiary property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCustomerMajorBeneficiary() {
        return inCustomerMajorBeneficiary;
    }

    /**
     * Sets the value of the inCustomerMajorBeneficiary property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCustomerMajorBeneficiary(String value) {
        this.inCustomerMajorBeneficiary = value;
    }

    /**
     * Gets the value of the inCustomerMarketingReminder property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCustomerMarketingReminder() {
        return inCustomerMarketingReminder;
    }

    /**
     * Sets the value of the inCustomerMarketingReminder property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCustomerMarketingReminder(String value) {
        this.inCustomerMarketingReminder = value;
    }

    /**
     * Gets the value of the inCustomerMiddleName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCustomerMiddleName() {
        return inCustomerMiddleName;
    }

    /**
     * Sets the value of the inCustomerMiddleName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCustomerMiddleName(String value) {
        this.inCustomerMiddleName = value;
    }

    /**
     * Gets the value of the inCustomerMobileTel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCustomerMobileTel() {
        return inCustomerMobileTel;
    }

    /**
     * Sets the value of the inCustomerMobileTel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCustomerMobileTel(String value) {
        this.inCustomerMobileTel = value;
    }

    /**
     * Gets the value of the inCustomerMotherName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCustomerMotherName() {
        return inCustomerMotherName;
    }

    /**
     * Sets the value of the inCustomerMotherName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCustomerMotherName(String value) {
        this.inCustomerMotherName = value;
    }

    /**
     * Gets the value of the inCustomerMotherSurname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCustomerMotherSurname() {
        return inCustomerMotherSurname;
    }

    /**
     * Sets the value of the inCustomerMotherSurname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCustomerMotherSurname(String value) {
        this.inCustomerMotherSurname = value;
    }

    /**
     * Gets the value of the inCustomerNoAfm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCustomerNoAfm() {
        return inCustomerNoAfm;
    }

    /**
     * Sets the value of the inCustomerNoAfm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCustomerNoAfm(String value) {
        this.inCustomerNoAfm = value;
    }

    /**
     * Gets the value of the inCustomerNonRegistered property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCustomerNonRegistered() {
        return inCustomerNonRegistered;
    }

    /**
     * Sets the value of the inCustomerNonRegistered property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCustomerNonRegistered(String value) {
        this.inCustomerNonRegistered = value;
    }

    /**
     * Gets the value of the inCustomerNonResident property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCustomerNonResident() {
        return inCustomerNonResident;
    }

    /**
     * Sets the value of the inCustomerNonResident property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCustomerNonResident(String value) {
        this.inCustomerNonResident = value;
    }

    /**
     * Gets the value of the inCustomerNonResidentForRep property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCustomerNonResidentForRep() {
        return inCustomerNonResidentForRep;
    }

    /**
     * Sets the value of the inCustomerNonResidentForRep property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCustomerNonResidentForRep(String value) {
        this.inCustomerNonResidentForRep = value;
    }

    /**
     * Gets the value of the inCustomerNumOfChildren property.
     * 
     */
    public short getInCustomerNumOfChildren() {
        return inCustomerNumOfChildren;
    }

    /**
     * Sets the value of the inCustomerNumOfChildren property.
     * 
     */
    public void setInCustomerNumOfChildren(short value) {
        this.inCustomerNumOfChildren = value;
    }

    /**
     * Gets the value of the inCustomerPensionerInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCustomerPensionerInd() {
        return inCustomerPensionerInd;
    }

    /**
     * Sets the value of the inCustomerPensionerInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCustomerPensionerInd(String value) {
        this.inCustomerPensionerInd = value;
    }

    /**
     * Gets the value of the inCustomerPromocode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCustomerPromocode() {
        return inCustomerPromocode;
    }

    /**
     * Sets the value of the inCustomerPromocode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCustomerPromocode(String value) {
        this.inCustomerPromocode = value;
    }

    /**
     * Gets the value of the inCustomerSecondSurname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCustomerSecondSurname() {
        return inCustomerSecondSurname;
    }

    /**
     * Sets the value of the inCustomerSecondSurname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCustomerSecondSurname(String value) {
        this.inCustomerSecondSurname = value;
    }

    /**
     * Gets the value of the inCustomerSegmFlags property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCustomerSegmFlags() {
        return inCustomerSegmFlags;
    }

    /**
     * Sets the value of the inCustomerSegmFlags property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCustomerSegmFlags(String value) {
        this.inCustomerSegmFlags = value;
    }

    /**
     * Gets the value of the inCustomerSepaAgrDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInCustomerSepaAgrDt() {
        return inCustomerSepaAgrDt;
    }

    /**
     * Sets the value of the inCustomerSepaAgrDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInCustomerSepaAgrDt(XMLGregorianCalendar value) {
        this.inCustomerSepaAgrDt = value;
    }

    /**
     * Gets the value of the inCustomerSepaAgrFlg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCustomerSepaAgrFlg() {
        return inCustomerSepaAgrFlg;
    }

    /**
     * Sets the value of the inCustomerSepaAgrFlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCustomerSepaAgrFlg(String value) {
        this.inCustomerSepaAgrFlg = value;
    }

    /**
     * Gets the value of the inCustomerSex property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCustomerSex() {
        return inCustomerSex;
    }

    /**
     * Sets the value of the inCustomerSex property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCustomerSex(String value) {
        this.inCustomerSex = value;
    }

    /**
     * Gets the value of the inCustomerShortName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCustomerShortName() {
        return inCustomerShortName;
    }

    /**
     * Sets the value of the inCustomerShortName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCustomerShortName(String value) {
        this.inCustomerShortName = value;
    }

    /**
     * Gets the value of the inCustomerSpmNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCustomerSpmNumber() {
        return inCustomerSpmNumber;
    }

    /**
     * Sets the value of the inCustomerSpmNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCustomerSpmNumber(String value) {
        this.inCustomerSpmNumber = value;
    }

    /**
     * Gets the value of the inCustomerSurname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCustomerSurname() {
        return inCustomerSurname;
    }

    /**
     * Sets the value of the inCustomerSurname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCustomerSurname(String value) {
        this.inCustomerSurname = value;
    }

    /**
     * Gets the value of the inCustomerTelephone1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCustomerTelephone1() {
        return inCustomerTelephone1;
    }

    /**
     * Sets the value of the inCustomerTelephone1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCustomerTelephone1(String value) {
        this.inCustomerTelephone1 = value;
    }

    /**
     * Gets the value of the inCustomerTelex property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCustomerTelex() {
        return inCustomerTelex;
    }

    /**
     * Sets the value of the inCustomerTelex property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCustomerTelex(String value) {
        this.inCustomerTelex = value;
    }

    /**
     * Gets the value of the inCustomerTelexConnection property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCustomerTelexConnection() {
        return inCustomerTelexConnection;
    }

    /**
     * Sets the value of the inCustomerTelexConnection property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCustomerTelexConnection(String value) {
        this.inCustomerTelexConnection = value;
    }

    /**
     * Gets the value of the inCustomerTitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCustomerTitle() {
        return inCustomerTitle;
    }

    /**
     * Sets the value of the inCustomerTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCustomerTitle(String value) {
        this.inCustomerTitle = value;
    }

    /**
     * Gets the value of the inCustomerTmstamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInCustomerTmstamp() {
        return inCustomerTmstamp;
    }

    /**
     * Sets the value of the inCustomerTmstamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInCustomerTmstamp(XMLGregorianCalendar value) {
        this.inCustomerTmstamp = value;
    }

    /**
     * Gets the value of the inCustomerVipInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCustomerVipInd() {
        return inCustomerVipInd;
    }

    /**
     * Sets the value of the inCustomerVipInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCustomerVipInd(String value) {
        this.inCustomerVipInd = value;
    }

    /**
     * Gets the value of the inCustSegmentCustomerCategoryTmstamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInCustSegmentCustomerCategoryTmstamp() {
        return inCustSegmentCustomerCategoryTmstamp;
    }

    /**
     * Sets the value of the inCustSegmentCustomerCategoryTmstamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInCustSegmentCustomerCategoryTmstamp(XMLGregorianCalendar value) {
        this.inCustSegmentCustomerCategoryTmstamp = value;
    }

    /**
     * Gets the value of the inCustSegmentGenericDetailDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCustSegmentGenericDetailDescription() {
        return inCustSegmentGenericDetailDescription;
    }

    /**
     * Sets the value of the inCustSegmentGenericDetailDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCustSegmentGenericDetailDescription(String value) {
        this.inCustSegmentGenericDetailDescription = value;
    }

    /**
     * Gets the value of the inCustSegmentGenericDetailEntryStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCustSegmentGenericDetailEntryStatus() {
        return inCustSegmentGenericDetailEntryStatus;
    }

    /**
     * Sets the value of the inCustSegmentGenericDetailEntryStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCustSegmentGenericDetailEntryStatus(String value) {
        this.inCustSegmentGenericDetailEntryStatus = value;
    }

    /**
     * Gets the value of the inCustSegmentGenericDetailSerialNum property.
     * 
     */
    public int getInCustSegmentGenericDetailSerialNum() {
        return inCustSegmentGenericDetailSerialNum;
    }

    /**
     * Sets the value of the inCustSegmentGenericDetailSerialNum property.
     * 
     */
    public void setInCustSegmentGenericDetailSerialNum(int value) {
        this.inCustSegmentGenericDetailSerialNum = value;
    }

    /**
     * Gets the value of the inCustTypeIefSuppliedFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCustTypeIefSuppliedFlag() {
        return inCustTypeIefSuppliedFlag;
    }

    /**
     * Sets the value of the inCustTypeIefSuppliedFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCustTypeIefSuppliedFlag(String value) {
        this.inCustTypeIefSuppliedFlag = value;
    }

    /**
     * Gets the value of the inDepositParametersBankCase property.
     * 
     */
    public short getInDepositParametersBankCase() {
        return inDepositParametersBankCase;
    }

    /**
     * Sets the value of the inDepositParametersBankCase property.
     * 
     */
    public void setInDepositParametersBankCase(short value) {
        this.inDepositParametersBankCase = value;
    }

    /**
     * Gets the value of the inEconomyGroupCustomerCategoryTmstamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInEconomyGroupCustomerCategoryTmstamp() {
        return inEconomyGroupCustomerCategoryTmstamp;
    }

    /**
     * Sets the value of the inEconomyGroupCustomerCategoryTmstamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInEconomyGroupCustomerCategoryTmstamp(XMLGregorianCalendar value) {
        this.inEconomyGroupCustomerCategoryTmstamp = value;
    }

    /**
     * Gets the value of the inEconomyGroupGenericDetailSerialNum property.
     * 
     */
    public int getInEconomyGroupGenericDetailSerialNum() {
        return inEconomyGroupGenericDetailSerialNum;
    }

    /**
     * Sets the value of the inEconomyGroupGenericDetailSerialNum property.
     * 
     */
    public void setInEconomyGroupGenericDetailSerialNum(int value) {
        this.inEconomyGroupGenericDetailSerialNum = value;
    }

    /**
     * Gets the value of the inEducationLevelCustomerCategoryTmstamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInEducationLevelCustomerCategoryTmstamp() {
        return inEducationLevelCustomerCategoryTmstamp;
    }

    /**
     * Sets the value of the inEducationLevelCustomerCategoryTmstamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInEducationLevelCustomerCategoryTmstamp(XMLGregorianCalendar value) {
        this.inEducationLevelCustomerCategoryTmstamp = value;
    }

    /**
     * Gets the value of the inEducationLevelGenericDetailSerialNum property.
     * 
     */
    public int getInEducationLevelGenericDetailSerialNum() {
        return inEducationLevelGenericDetailSerialNum;
    }

    /**
     * Sets the value of the inEducationLevelGenericDetailSerialNum property.
     * 
     */
    public void setInEducationLevelGenericDetailSerialNum(int value) {
        this.inEducationLevelGenericDetailSerialNum = value;
    }

    /**
     * Gets the value of the inFamilyStatusCustomerCategoryTmstamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInFamilyStatusCustomerCategoryTmstamp() {
        return inFamilyStatusCustomerCategoryTmstamp;
    }

    /**
     * Sets the value of the inFamilyStatusCustomerCategoryTmstamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInFamilyStatusCustomerCategoryTmstamp(XMLGregorianCalendar value) {
        this.inFamilyStatusCustomerCategoryTmstamp = value;
    }

    /**
     * Gets the value of the inFamilyStatusGenericDetailSerialNum property.
     * 
     */
    public int getInFamilyStatusGenericDetailSerialNum() {
        return inFamilyStatusGenericDetailSerialNum;
    }

    /**
     * Sets the value of the inFamilyStatusGenericDetailSerialNum property.
     * 
     */
    public void setInFamilyStatusGenericDetailSerialNum(int value) {
        this.inFamilyStatusGenericDetailSerialNum = value;
    }

    /**
     * Gets the value of the inIdCountryGenericDetailShortDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInIdCountryGenericDetailShortDescription() {
        return inIdCountryGenericDetailShortDescription;
    }

    /**
     * Sets the value of the inIdCountryGenericDetailShortDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInIdCountryGenericDetailShortDescription(String value) {
        this.inIdCountryGenericDetailShortDescription = value;
    }

    /**
     * Gets the value of the inIdTypeGenericDetailSerialNum property.
     * 
     */
    public int getInIdTypeGenericDetailSerialNum() {
        return inIdTypeGenericDetailSerialNum;
    }

    /**
     * Sets the value of the inIdTypeGenericDetailSerialNum property.
     * 
     */
    public void setInIdTypeGenericDetailSerialNum(int value) {
        this.inIdTypeGenericDetailSerialNum = value;
    }

    /**
     * Gets the value of the inIefSuppliedCommand property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInIefSuppliedCommand() {
        return inIefSuppliedCommand;
    }

    /**
     * Sets the value of the inIefSuppliedCommand property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInIefSuppliedCommand(String value) {
        this.inIefSuppliedCommand = value;
    }

    /**
     * Gets the value of the inIefSuppliedFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInIefSuppliedFlag() {
        return inIefSuppliedFlag;
    }

    /**
     * Sets the value of the inIefSuppliedFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInIefSuppliedFlag(String value) {
        this.inIefSuppliedFlag = value;
    }

    /**
     * Gets the value of the inIncomeLevelCustomerCategoryTmstamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInIncomeLevelCustomerCategoryTmstamp() {
        return inIncomeLevelCustomerCategoryTmstamp;
    }

    /**
     * Sets the value of the inIncomeLevelCustomerCategoryTmstamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInIncomeLevelCustomerCategoryTmstamp(XMLGregorianCalendar value) {
        this.inIncomeLevelCustomerCategoryTmstamp = value;
    }

    /**
     * Gets the value of the inIncomeLevelGenericDetailSerialNum property.
     * 
     */
    public int getInIncomeLevelGenericDetailSerialNum() {
        return inIncomeLevelGenericDetailSerialNum;
    }

    /**
     * Sets the value of the inIncomeLevelGenericDetailSerialNum property.
     * 
     */
    public void setInIncomeLevelGenericDetailSerialNum(int value) {
        this.inIncomeLevelGenericDetailSerialNum = value;
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
     * Gets the value of the inKeyCustomerCDigit property.
     * 
     */
    public short getInKeyCustomerCDigit() {
        return inKeyCustomerCDigit;
    }

    /**
     * Sets the value of the inKeyCustomerCDigit property.
     * 
     */
    public void setInKeyCustomerCDigit(short value) {
        this.inKeyCustomerCDigit = value;
    }

    /**
     * Gets the value of the inKeyCustomerCustId property.
     * 
     */
    public int getInKeyCustomerCustId() {
        return inKeyCustomerCustId;
    }

    /**
     * Sets the value of the inKeyCustomerCustId property.
     * 
     */
    public void setInKeyCustomerCustId(int value) {
        this.inKeyCustomerCustId = value;
    }

    /**
     * Gets the value of the inMntRecordingAuthorizer1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInMntRecordingAuthorizer1() {
        return inMntRecordingAuthorizer1;
    }

    /**
     * Sets the value of the inMntRecordingAuthorizer1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInMntRecordingAuthorizer1(String value) {
        this.inMntRecordingAuthorizer1 = value;
    }

    /**
     * Gets the value of the inMntRecordingAuthorizer2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInMntRecordingAuthorizer2() {
        return inMntRecordingAuthorizer2;
    }

    /**
     * Sets the value of the inMntRecordingAuthorizer2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInMntRecordingAuthorizer2(String value) {
        this.inMntRecordingAuthorizer2 = value;
    }

    /**
     * Gets the value of the inMntRecordingPrftSystem property.
     * 
     */
    public short getInMntRecordingPrftSystem() {
        return inMntRecordingPrftSystem;
    }

    /**
     * Sets the value of the inMntRecordingPrftSystem property.
     * 
     */
    public void setInMntRecordingPrftSystem(short value) {
        this.inMntRecordingPrftSystem = value;
    }

    /**
     * Gets the value of the inMntRecordingReversalFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInMntRecordingReversalFlag() {
        return inMntRecordingReversalFlag;
    }

    /**
     * Sets the value of the inMntRecordingReversalFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInMntRecordingReversalFlag(String value) {
        this.inMntRecordingReversalFlag = value;
    }

    /**
     * Gets the value of the inMntRecordingTerminalNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInMntRecordingTerminalNumber() {
        return inMntRecordingTerminalNumber;
    }

    /**
     * Sets the value of the inMntRecordingTerminalNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInMntRecordingTerminalNumber(String value) {
        this.inMntRecordingTerminalNumber = value;
    }

    /**
     * Gets the value of the inMntRecordingTrxCode property.
     * 
     */
    public int getInMntRecordingTrxCode() {
        return inMntRecordingTrxCode;
    }

    /**
     * Sets the value of the inMntRecordingTrxCode property.
     * 
     */
    public void setInMntRecordingTrxCode(int value) {
        this.inMntRecordingTrxCode = value;
    }

    /**
     * Gets the value of the inMonitoringBankemployeeId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInMonitoringBankemployeeId() {
        return inMonitoringBankemployeeId;
    }

    /**
     * Sets the value of the inMonitoringBankemployeeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInMonitoringBankemployeeId(String value) {
        this.inMonitoringBankemployeeId = value;
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
     * Gets the value of the inNationalityCustomerCategoryTmstamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInNationalityCustomerCategoryTmstamp() {
        return inNationalityCustomerCategoryTmstamp;
    }

    /**
     * Sets the value of the inNationalityCustomerCategoryTmstamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInNationalityCustomerCategoryTmstamp(XMLGregorianCalendar value) {
        this.inNationalityCustomerCategoryTmstamp = value;
    }

    /**
     * Gets the value of the inNationalityGenericDetailSerialNum property.
     * 
     */
    public int getInNationalityGenericDetailSerialNum() {
        return inNationalityGenericDetailSerialNum;
    }

    /**
     * Sets the value of the inNationalityGenericDetailSerialNum property.
     * 
     */
    public void setInNationalityGenericDetailSerialNum(int value) {
        this.inNationalityGenericDetailSerialNum = value;
    }

    /**
     * Gets the value of the inOtherAfmAfmNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInOtherAfmAfmNo() {
        return inOtherAfmAfmNo;
    }

    /**
     * Sets the value of the inOtherAfmAfmNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInOtherAfmAfmNo(String value) {
        this.inOtherAfmAfmNo = value;
    }

    /**
     * Gets the value of the inOtherAfmSerialNo property.
     * 
     */
    public short getInOtherAfmSerialNo() {
        return inOtherAfmSerialNo;
    }

    /**
     * Sets the value of the inOtherAfmSerialNo property.
     * 
     */
    public void setInOtherAfmSerialNo(short value) {
        this.inOtherAfmSerialNo = value;
    }

    /**
     * Gets the value of the inOtherAfmTmstamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInOtherAfmTmstamp() {
        return inOtherAfmTmstamp;
    }

    /**
     * Sets the value of the inOtherAfmTmstamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInOtherAfmTmstamp(XMLGregorianCalendar value) {
        this.inOtherAfmTmstamp = value;
    }

    /**
     * Gets the value of the inOtherIdExpiryDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInOtherIdExpiryDate() {
        return inOtherIdExpiryDate;
    }

    /**
     * Sets the value of the inOtherIdExpiryDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInOtherIdExpiryDate(XMLGregorianCalendar value) {
        this.inOtherIdExpiryDate = value;
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
     * Gets the value of the inOtherIdIssueAuthority property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInOtherIdIssueAuthority() {
        return inOtherIdIssueAuthority;
    }

    /**
     * Sets the value of the inOtherIdIssueAuthority property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInOtherIdIssueAuthority(String value) {
        this.inOtherIdIssueAuthority = value;
    }

    /**
     * Gets the value of the inOtherIdIssueDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInOtherIdIssueDate() {
        return inOtherIdIssueDate;
    }

    /**
     * Sets the value of the inOtherIdIssueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInOtherIdIssueDate(XMLGregorianCalendar value) {
        this.inOtherIdIssueDate = value;
    }

    /**
     * Gets the value of the inOtherIdSerialNo property.
     * 
     */
    public short getInOtherIdSerialNo() {
        return inOtherIdSerialNo;
    }

    /**
     * Sets the value of the inOtherIdSerialNo property.
     * 
     */
    public void setInOtherIdSerialNo(short value) {
        this.inOtherIdSerialNo = value;
    }

    /**
     * Gets the value of the inOtherIdTmstamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInOtherIdTmstamp() {
        return inOtherIdTmstamp;
    }

    /**
     * Sets the value of the inOtherIdTmstamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInOtherIdTmstamp(XMLGregorianCalendar value) {
        this.inOtherIdTmstamp = value;
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
     * Gets the value of the inProfessionCategoryCustomerCategoryTmstamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInProfessionCategoryCustomerCategoryTmstamp() {
        return inProfessionCategoryCustomerCategoryTmstamp;
    }

    /**
     * Sets the value of the inProfessionCategoryCustomerCategoryTmstamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInProfessionCategoryCustomerCategoryTmstamp(XMLGregorianCalendar value) {
        this.inProfessionCategoryCustomerCategoryTmstamp = value;
    }

    /**
     * Gets the value of the inProfessionCategoryGenericDetailSerialNum property.
     * 
     */
    public int getInProfessionCategoryGenericDetailSerialNum() {
        return inProfessionCategoryGenericDetailSerialNum;
    }

    /**
     * Sets the value of the inProfessionCategoryGenericDetailSerialNum property.
     * 
     */
    public void setInProfessionCategoryGenericDetailSerialNum(int value) {
        this.inProfessionCategoryGenericDetailSerialNum = value;
    }

    /**
     * Gets the value of the inProfessionCustomerCategoryTmstamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInProfessionCustomerCategoryTmstamp() {
        return inProfessionCustomerCategoryTmstamp;
    }

    /**
     * Sets the value of the inProfessionCustomerCategoryTmstamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInProfessionCustomerCategoryTmstamp(XMLGregorianCalendar value) {
        this.inProfessionCustomerCategoryTmstamp = value;
    }

    /**
     * Gets the value of the inProfessionGenericDetailSerialNum property.
     * 
     */
    public int getInProfessionGenericDetailSerialNum() {
        return inProfessionGenericDetailSerialNum;
    }

    /**
     * Sets the value of the inProfessionGenericDetailSerialNum property.
     * 
     */
    public void setInProfessionGenericDetailSerialNum(int value) {
        this.inProfessionGenericDetailSerialNum = value;
    }

    /**
     * Gets the value of the inProfessionStatusCustomerCategoryTmstamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInProfessionStatusCustomerCategoryTmstamp() {
        return inProfessionStatusCustomerCategoryTmstamp;
    }

    /**
     * Sets the value of the inProfessionStatusCustomerCategoryTmstamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInProfessionStatusCustomerCategoryTmstamp(XMLGregorianCalendar value) {
        this.inProfessionStatusCustomerCategoryTmstamp = value;
    }

    /**
     * Gets the value of the inProfessionStatusGenericDetailSerialNum property.
     * 
     */
    public int getInProfessionStatusGenericDetailSerialNum() {
        return inProfessionStatusGenericDetailSerialNum;
    }

    /**
     * Sets the value of the inProfessionStatusGenericDetailSerialNum property.
     * 
     */
    public void setInProfessionStatusGenericDetailSerialNum(int value) {
        this.inProfessionStatusGenericDetailSerialNum = value;
    }

    /**
     * Gets the value of the inRcountryCustomerCategoryTmstamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInRcountryCustomerCategoryTmstamp() {
        return inRcountryCustomerCategoryTmstamp;
    }

    /**
     * Sets the value of the inRcountryCustomerCategoryTmstamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInRcountryCustomerCategoryTmstamp(XMLGregorianCalendar value) {
        this.inRcountryCustomerCategoryTmstamp = value;
    }

    /**
     * Gets the value of the inRcountryGenericDetailDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInRcountryGenericDetailDescription() {
        return inRcountryGenericDetailDescription;
    }

    /**
     * Sets the value of the inRcountryGenericDetailDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInRcountryGenericDetailDescription(String value) {
        this.inRcountryGenericDetailDescription = value;
    }

    /**
     * Gets the value of the inRcountryGenericDetailSerialNum property.
     * 
     */
    public int getInRcountryGenericDetailSerialNum() {
        return inRcountryGenericDetailSerialNum;
    }

    /**
     * Sets the value of the inRcountryGenericDetailSerialNum property.
     * 
     */
    public void setInRcountryGenericDetailSerialNum(int value) {
        this.inRcountryGenericDetailSerialNum = value;
    }

    /**
     * Gets the value of the inRcountryGenericDetailShortDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInRcountryGenericDetailShortDescription() {
        return inRcountryGenericDetailShortDescription;
    }

    /**
     * Sets the value of the inRcountryGenericDetailShortDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInRcountryGenericDetailShortDescription(String value) {
        this.inRcountryGenericDetailShortDescription = value;
    }

    /**
     * Gets the value of the inRegionCustomerCategoryTmstamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInRegionCustomerCategoryTmstamp() {
        return inRegionCustomerCategoryTmstamp;
    }

    /**
     * Sets the value of the inRegionCustomerCategoryTmstamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInRegionCustomerCategoryTmstamp(XMLGregorianCalendar value) {
        this.inRegionCustomerCategoryTmstamp = value;
    }

    /**
     * Gets the value of the inRegionGenericDetailSerialNum property.
     * 
     */
    public int getInRegionGenericDetailSerialNum() {
        return inRegionGenericDetailSerialNum;
    }

    /**
     * Sets the value of the inRegionGenericDetailSerialNum property.
     * 
     */
    public void setInRegionGenericDetailSerialNum(int value) {
        this.inRegionGenericDetailSerialNum = value;
    }

    /**
     * Gets the value of the inSubCategCustomerCategoryTmstamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInSubCategCustomerCategoryTmstamp() {
        return inSubCategCustomerCategoryTmstamp;
    }

    /**
     * Sets the value of the inSubCategCustomerCategoryTmstamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInSubCategCustomerCategoryTmstamp(XMLGregorianCalendar value) {
        this.inSubCategCustomerCategoryTmstamp = value;
    }

    /**
     * Gets the value of the inSubCategGenericDetailSerialNum property.
     * 
     */
    public int getInSubCategGenericDetailSerialNum() {
        return inSubCategGenericDetailSerialNum;
    }

    /**
     * Sets the value of the inSubCategGenericDetailSerialNum property.
     * 
     */
    public void setInSubCategGenericDetailSerialNum(int value) {
        this.inSubCategGenericDetailSerialNum = value;
    }

    /**
     * Gets the value of the inSubCategGenericDetailShortDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInSubCategGenericDetailShortDescription() {
        return inSubCategGenericDetailShortDescription;
    }

    /**
     * Sets the value of the inSubCategGenericDetailShortDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInSubCategGenericDetailShortDescription(String value) {
        this.inSubCategGenericDetailShortDescription = value;
    }

    /**
     * Gets the value of the inSubCategoryGenericDetailSerialNum property.
     * 
     */
    public int getInSubCategoryGenericDetailSerialNum() {
        return inSubCategoryGenericDetailSerialNum;
    }

    /**
     * Sets the value of the inSubCategoryGenericDetailSerialNum property.
     * 
     */
    public void setInSubCategoryGenericDetailSerialNum(int value) {
        this.inSubCategoryGenericDetailSerialNum = value;
    }

    /**
     * Gets the value of the inSubCategoryGenericDetailShortDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInSubCategoryGenericDetailShortDescription() {
        return inSubCategoryGenericDetailShortDescription;
    }

    /**
     * Sets the value of the inSubCategoryGenericDetailShortDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInSubCategoryGenericDetailShortDescription(String value) {
        this.inSubCategoryGenericDetailShortDescription = value;
    }

    /**
     * Gets the value of the inTaxOfficeId property.
     * 
     */
    public short getInTaxOfficeId() {
        return inTaxOfficeId;
    }

    /**
     * Sets the value of the inTaxOfficeId property.
     * 
     */
    public void setInTaxOfficeId(short value) {
        this.inTaxOfficeId = value;
    }

    /**
     * Gets the value of the inThinkingCurrencyIdCurrency property.
     * 
     */
    public int getInThinkingCurrencyIdCurrency() {
        return inThinkingCurrencyIdCurrency;
    }

    /**
     * Sets the value of the inThinkingCurrencyIdCurrency property.
     * 
     */
    public void setInThinkingCurrencyIdCurrency(int value) {
        this.inThinkingCurrencyIdCurrency = value;
    }

    /**
     * Gets the value of the inTimestampCustomerTmstamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInTimestampCustomerTmstamp() {
        return inTimestampCustomerTmstamp;
    }

    /**
     * Sets the value of the inTimestampCustomerTmstamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInTimestampCustomerTmstamp(XMLGregorianCalendar value) {
        this.inTimestampCustomerTmstamp = value;
    }

    /**
     * Gets the value of the inCustomerEnableFor24C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCustomerEnableFor24C() {
        return inCustomerEnableFor24C;
    }

    /**
     * Sets the value of the inCustomerEnableFor24C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCustomerEnableFor24C(String value) {
        this.inCustomerEnableFor24C = value;
    }

    /**
     * Gets the value of the inCustomerCustOpenDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInCustomerCustOpenDate() {
        return inCustomerCustOpenDate;
    }

    /**
     * Sets the value of the inCustomerCustOpenDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInCustomerCustOpenDate(XMLGregorianCalendar value) {
        this.inCustomerCustOpenDate = value;
    }

    /**
     * Gets the value of the inGrpCustcat property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfInGrpCustcat }
     *     
     */
    public ArrayOfInGrpCustcat getInGrpCustcat() {
        return inGrpCustcat;
    }

    /**
     * Sets the value of the inGrpCustcat property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfInGrpCustcat }
     *     
     */
    public void setInGrpCustcat(ArrayOfInGrpCustcat value) {
        this.inGrpCustcat = value;
    }

    /**
     * Gets the value of the inCustAddressAccomodationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInCustAddressAccomodationDate() {
        return inCustAddressAccomodationDate;
    }

    /**
     * Sets the value of the inCustAddressAccomodationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInCustAddressAccomodationDate(XMLGregorianCalendar value) {
        this.inCustAddressAccomodationDate = value;
    }

    /**
     * Gets the value of the inCustAddressInternetAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCustAddressInternetAddress() {
        return inCustAddressInternetAddress;
    }

    /**
     * Sets the value of the inCustAddressInternetAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCustAddressInternetAddress(String value) {
        this.inCustAddressInternetAddress = value;
    }

    /**
     * Gets the value of the inCustAddressEMail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCustAddressEMail() {
        return inCustAddressEMail;
    }

    /**
     * Sets the value of the inCustAddressEMail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCustAddressEMail(String value) {
        this.inCustAddressEMail = value;
    }

    /**
     * Gets the value of the inCustAddressTelephone3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCustAddressTelephone3() {
        return inCustAddressTelephone3;
    }

    /**
     * Sets the value of the inCustAddressTelephone3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCustAddressTelephone3(String value) {
        this.inCustAddressTelephone3 = value;
    }

    /**
     * Gets the value of the inCustAddressTelephone2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCustAddressTelephone2() {
        return inCustAddressTelephone2;
    }

    /**
     * Sets the value of the inCustAddressTelephone2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCustAddressTelephone2(String value) {
        this.inCustAddressTelephone2 = value;
    }

    /**
     * Gets the value of the inCustAddressAddress6 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCustAddressAddress6() {
        return inCustAddressAddress6;
    }

    /**
     * Sets the value of the inCustAddressAddress6 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCustAddressAddress6(String value) {
        this.inCustAddressAddress6 = value;
    }

    /**
     * Gets the value of the inCustAddressAddress5 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCustAddressAddress5() {
        return inCustAddressAddress5;
    }

    /**
     * Sets the value of the inCustAddressAddress5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCustAddressAddress5(String value) {
        this.inCustAddressAddress5 = value;
    }

    /**
     * Gets the value of the inCustAddressAddress4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCustAddressAddress4() {
        return inCustAddressAddress4;
    }

    /**
     * Sets the value of the inCustAddressAddress4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCustAddressAddress4(String value) {
        this.inCustAddressAddress4 = value;
    }

    /**
     * Gets the value of the inCustAddressAddress3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCustAddressAddress3() {
        return inCustAddressAddress3;
    }

    /**
     * Sets the value of the inCustAddressAddress3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCustAddressAddress3(String value) {
        this.inCustAddressAddress3 = value;
    }

    /**
     * Gets the value of the inCustAddressLatinInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCustAddressLatinInd() {
        return inCustAddressLatinInd;
    }

    /**
     * Sets the value of the inCustAddressLatinInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCustAddressLatinInd(String value) {
        this.inCustAddressLatinInd = value;
    }

    /**
     * Gets the value of the inCustAddressPtsInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCustAddressPtsInd() {
        return inCustAddressPtsInd;
    }

    /**
     * Sets the value of the inCustAddressPtsInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCustAddressPtsInd(String value) {
        this.inCustAddressPtsInd = value;
    }

    /**
     * Gets the value of the inCustAddressCommunicationAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCustAddressCommunicationAddress() {
        return inCustAddressCommunicationAddress;
    }

    /**
     * Sets the value of the inCustAddressCommunicationAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCustAddressCommunicationAddress(String value) {
        this.inCustAddressCommunicationAddress = value;
    }

    /**
     * Gets the value of the inCustAddressEntryStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCustAddressEntryStatus() {
        return inCustAddressEntryStatus;
    }

    /**
     * Sets the value of the inCustAddressEntryStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCustAddressEntryStatus(String value) {
        this.inCustAddressEntryStatus = value;
    }

    /**
     * Gets the value of the inCustAddressEntryComments property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCustAddressEntryComments() {
        return inCustAddressEntryComments;
    }

    /**
     * Sets the value of the inCustAddressEntryComments property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCustAddressEntryComments(String value) {
        this.inCustAddressEntryComments = value;
    }

    /**
     * Gets the value of the inCustomerOwnershipIndication property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCustomerOwnershipIndication() {
        return inCustomerOwnershipIndication;
    }

    /**
     * Sets the value of the inCustomerOwnershipIndication property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCustomerOwnershipIndication(String value) {
        this.inCustomerOwnershipIndication = value;
    }

    /**
     * Gets the value of the inCustomerContractExpiryDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInCustomerContractExpiryDate() {
        return inCustomerContractExpiryDate;
    }

    /**
     * Sets the value of the inCustomerContractExpiryDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInCustomerContractExpiryDate(XMLGregorianCalendar value) {
        this.inCustomerContractExpiryDate = value;
    }

    /**
     * Gets the value of the inCustomerContract property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCustomerContract() {
        return inCustomerContract;
    }

    /**
     * Sets the value of the inCustomerContract property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCustomerContract(String value) {
        this.inCustomerContract = value;
    }

    /**
     * Gets the value of the inCustomerMobileTel2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCustomerMobileTel2() {
        return inCustomerMobileTel2;
    }

    /**
     * Sets the value of the inCustomerMobileTel2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCustomerMobileTel2(String value) {
        this.inCustomerMobileTel2 = value;
    }

    /**
     * Gets the value of the inCustomerEMail2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCustomerEMail2() {
        return inCustomerEMail2;
    }

    /**
     * Sets the value of the inCustomerEMail2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCustomerEMail2(String value) {
        this.inCustomerEMail2 = value;
    }

    /**
     * Gets the value of the inEmployerCustAddressSerialNum property.
     * 
     */
    public short getInEmployerCustAddressSerialNum() {
        return inEmployerCustAddressSerialNum;
    }

    /**
     * Sets the value of the inEmployerCustAddressSerialNum property.
     * 
     */
    public void setInEmployerCustAddressSerialNum(short value) {
        this.inEmployerCustAddressSerialNum = value;
    }

    /**
     * Gets the value of the inEmployerCustAddressAddressType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInEmployerCustAddressAddressType() {
        return inEmployerCustAddressAddressType;
    }

    /**
     * Sets the value of the inEmployerCustAddressAddressType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInEmployerCustAddressAddressType(String value) {
        this.inEmployerCustAddressAddressType = value;
    }

    /**
     * Gets the value of the inEmployerCustAddressFaxNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInEmployerCustAddressFaxNo() {
        return inEmployerCustAddressFaxNo;
    }

    /**
     * Sets the value of the inEmployerCustAddressFaxNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInEmployerCustAddressFaxNo(String value) {
        this.inEmployerCustAddressFaxNo = value;
    }

    /**
     * Gets the value of the inEmployerCustAddressCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInEmployerCustAddressCity() {
        return inEmployerCustAddressCity;
    }

    /**
     * Sets the value of the inEmployerCustAddressCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInEmployerCustAddressCity(String value) {
        this.inEmployerCustAddressCity = value;
    }

    /**
     * Gets the value of the inEmployerCustAddressZipCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInEmployerCustAddressZipCode() {
        return inEmployerCustAddressZipCode;
    }

    /**
     * Sets the value of the inEmployerCustAddressZipCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInEmployerCustAddressZipCode(String value) {
        this.inEmployerCustAddressZipCode = value;
    }

    /**
     * Gets the value of the inEmployerCustAddressTelephone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInEmployerCustAddressTelephone() {
        return inEmployerCustAddressTelephone;
    }

    /**
     * Sets the value of the inEmployerCustAddressTelephone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInEmployerCustAddressTelephone(String value) {
        this.inEmployerCustAddressTelephone = value;
    }

    /**
     * Gets the value of the inEmployerCustAddressCommunicationAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInEmployerCustAddressCommunicationAddress() {
        return inEmployerCustAddressCommunicationAddress;
    }

    /**
     * Sets the value of the inEmployerCustAddressCommunicationAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInEmployerCustAddressCommunicationAddress(String value) {
        this.inEmployerCustAddressCommunicationAddress = value;
    }

    /**
     * Gets the value of the inEmployerCustAddressEntryStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInEmployerCustAddressEntryStatus() {
        return inEmployerCustAddressEntryStatus;
    }

    /**
     * Sets the value of the inEmployerCustAddressEntryStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInEmployerCustAddressEntryStatus(String value) {
        this.inEmployerCustAddressEntryStatus = value;
    }

    /**
     * Gets the value of the inEmployerCustAddressTmstamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInEmployerCustAddressTmstamp() {
        return inEmployerCustAddressTmstamp;
    }

    /**
     * Sets the value of the inEmployerCustAddressTmstamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInEmployerCustAddressTmstamp(XMLGregorianCalendar value) {
        this.inEmployerCustAddressTmstamp = value;
    }

    /**
     * Gets the value of the inEmployerCustAddressRegion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInEmployerCustAddressRegion() {
        return inEmployerCustAddressRegion;
    }

    /**
     * Sets the value of the inEmployerCustAddressRegion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInEmployerCustAddressRegion(String value) {
        this.inEmployerCustAddressRegion = value;
    }

    /**
     * Gets the value of the inEmployerCustAddressAddress1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInEmployerCustAddressAddress1() {
        return inEmployerCustAddressAddress1;
    }

    /**
     * Sets the value of the inEmployerCustAddressAddress1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInEmployerCustAddressAddress1(String value) {
        this.inEmployerCustAddressAddress1 = value;
    }

    /**
     * Gets the value of the inEmployerCustAddressAddress2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInEmployerCustAddressAddress2() {
        return inEmployerCustAddressAddress2;
    }

    /**
     * Sets the value of the inEmployerCustAddressAddress2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInEmployerCustAddressAddress2(String value) {
        this.inEmployerCustAddressAddress2 = value;
    }

    /**
     * Gets the value of the inEmployerCustAddressEntryComments property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInEmployerCustAddressEntryComments() {
        return inEmployerCustAddressEntryComments;
    }

    /**
     * Sets the value of the inEmployerCustAddressEntryComments property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInEmployerCustAddressEntryComments(String value) {
        this.inEmployerCustAddressEntryComments = value;
    }

    /**
     * Gets the value of the inEmployerCustAddressMailBox property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInEmployerCustAddressMailBox() {
        return inEmployerCustAddressMailBox;
    }

    /**
     * Sets the value of the inEmployerCustAddressMailBox property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInEmployerCustAddressMailBox(String value) {
        this.inEmployerCustAddressMailBox = value;
    }

    /**
     * Gets the value of the inEmployerCustAddressSegmFlags property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInEmployerCustAddressSegmFlags() {
        return inEmployerCustAddressSegmFlags;
    }

    /**
     * Sets the value of the inEmployerCustAddressSegmFlags property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInEmployerCustAddressSegmFlags(String value) {
        this.inEmployerCustAddressSegmFlags = value;
    }

    /**
     * Gets the value of the inEmployerCustAddressAccomodationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInEmployerCustAddressAccomodationDate() {
        return inEmployerCustAddressAccomodationDate;
    }

    /**
     * Sets the value of the inEmployerCustAddressAccomodationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInEmployerCustAddressAccomodationDate(XMLGregorianCalendar value) {
        this.inEmployerCustAddressAccomodationDate = value;
    }

    /**
     * Gets the value of the inEmployerCustAddressInternetAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInEmployerCustAddressInternetAddress() {
        return inEmployerCustAddressInternetAddress;
    }

    /**
     * Sets the value of the inEmployerCustAddressInternetAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInEmployerCustAddressInternetAddress(String value) {
        this.inEmployerCustAddressInternetAddress = value;
    }

    /**
     * Gets the value of the inEmployerCustAddressEMail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInEmployerCustAddressEMail() {
        return inEmployerCustAddressEMail;
    }

    /**
     * Sets the value of the inEmployerCustAddressEMail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInEmployerCustAddressEMail(String value) {
        this.inEmployerCustAddressEMail = value;
    }

    /**
     * Gets the value of the inEmployerCustAddressTelephone3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInEmployerCustAddressTelephone3() {
        return inEmployerCustAddressTelephone3;
    }

    /**
     * Sets the value of the inEmployerCustAddressTelephone3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInEmployerCustAddressTelephone3(String value) {
        this.inEmployerCustAddressTelephone3 = value;
    }

    /**
     * Gets the value of the inEmployerCustAddressTelephone2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInEmployerCustAddressTelephone2() {
        return inEmployerCustAddressTelephone2;
    }

    /**
     * Sets the value of the inEmployerCustAddressTelephone2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInEmployerCustAddressTelephone2(String value) {
        this.inEmployerCustAddressTelephone2 = value;
    }

    /**
     * Gets the value of the inEmployerCustAddressAddress6 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInEmployerCustAddressAddress6() {
        return inEmployerCustAddressAddress6;
    }

    /**
     * Sets the value of the inEmployerCustAddressAddress6 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInEmployerCustAddressAddress6(String value) {
        this.inEmployerCustAddressAddress6 = value;
    }

    /**
     * Gets the value of the inEmployerCustAddressAddress5 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInEmployerCustAddressAddress5() {
        return inEmployerCustAddressAddress5;
    }

    /**
     * Sets the value of the inEmployerCustAddressAddress5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInEmployerCustAddressAddress5(String value) {
        this.inEmployerCustAddressAddress5 = value;
    }

    /**
     * Gets the value of the inEmployerCustAddressAddress4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInEmployerCustAddressAddress4() {
        return inEmployerCustAddressAddress4;
    }

    /**
     * Sets the value of the inEmployerCustAddressAddress4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInEmployerCustAddressAddress4(String value) {
        this.inEmployerCustAddressAddress4 = value;
    }

    /**
     * Gets the value of the inEmployerCustAddressAddress3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInEmployerCustAddressAddress3() {
        return inEmployerCustAddressAddress3;
    }

    /**
     * Sets the value of the inEmployerCustAddressAddress3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInEmployerCustAddressAddress3(String value) {
        this.inEmployerCustAddressAddress3 = value;
    }

    /**
     * Gets the value of the inEmployerCustAddressLatinInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInEmployerCustAddressLatinInd() {
        return inEmployerCustAddressLatinInd;
    }

    /**
     * Sets the value of the inEmployerCustAddressLatinInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInEmployerCustAddressLatinInd(String value) {
        this.inEmployerCustAddressLatinInd = value;
    }

    /**
     * Gets the value of the inEmployerCustAddressPtsInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInEmployerCustAddressPtsInd() {
        return inEmployerCustAddressPtsInd;
    }

    /**
     * Sets the value of the inEmployerCustAddressPtsInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInEmployerCustAddressPtsInd(String value) {
        this.inEmployerCustAddressPtsInd = value;
    }

    /**
     * Gets the value of the inEmployerAddressDistrictGenericDetailSerialNum property.
     * 
     */
    public int getInEmployerAddressDistrictGenericDetailSerialNum() {
        return inEmployerAddressDistrictGenericDetailSerialNum;
    }

    /**
     * Sets the value of the inEmployerAddressDistrictGenericDetailSerialNum property.
     * 
     */
    public void setInEmployerAddressDistrictGenericDetailSerialNum(int value) {
        this.inEmployerAddressDistrictGenericDetailSerialNum = value;
    }

    /**
     * Gets the value of the inEmployerAddressDistrictGenericDetailDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInEmployerAddressDistrictGenericDetailDescription() {
        return inEmployerAddressDistrictGenericDetailDescription;
    }

    /**
     * Sets the value of the inEmployerAddressDistrictGenericDetailDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInEmployerAddressDistrictGenericDetailDescription(String value) {
        this.inEmployerAddressDistrictGenericDetailDescription = value;
    }

    /**
     * Gets the value of the inEmployerAddressCountryGenericDetailDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInEmployerAddressCountryGenericDetailDescription() {
        return inEmployerAddressCountryGenericDetailDescription;
    }

    /**
     * Sets the value of the inEmployerAddressCountryGenericDetailDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInEmployerAddressCountryGenericDetailDescription(String value) {
        this.inEmployerAddressCountryGenericDetailDescription = value;
    }

    /**
     * Gets the value of the inEmployerAddressCountryGenericDetailShortDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInEmployerAddressCountryGenericDetailShortDescription() {
        return inEmployerAddressCountryGenericDetailShortDescription;
    }

    /**
     * Sets the value of the inEmployerAddressCountryGenericDetailShortDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInEmployerAddressCountryGenericDetailShortDescription(String value) {
        this.inEmployerAddressCountryGenericDetailShortDescription = value;
    }

    /**
     * Gets the value of the inEmployerCustAddrParrelDCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInEmployerCustAddrParrelDCode() {
        return inEmployerCustAddrParrelDCode;
    }

    /**
     * Sets the value of the inEmployerCustAddrParrelDCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInEmployerCustAddrParrelDCode(String value) {
        this.inEmployerCustAddrParrelDCode = value;
    }

    /**
     * Gets the value of the inEmployerCustAddrParrelDSn property.
     * 
     */
    public int getInEmployerCustAddrParrelDSn() {
        return inEmployerCustAddrParrelDSn;
    }

    /**
     * Sets the value of the inEmployerCustAddrParrelDSn property.
     * 
     */
    public void setInEmployerCustAddrParrelDSn(int value) {
        this.inEmployerCustAddrParrelDSn = value;
    }

    /**
     * Gets the value of the inCustAddrParrelDCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCustAddrParrelDCode() {
        return inCustAddrParrelDCode;
    }

    /**
     * Sets the value of the inCustAddrParrelDCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCustAddrParrelDCode(String value) {
        this.inCustAddrParrelDCode = value;
    }

    /**
     * Gets the value of the inCustAddrParrelDSn property.
     * 
     */
    public int getInCustAddrParrelDSn() {
        return inCustAddrParrelDSn;
    }

    /**
     * Sets the value of the inCustAddrParrelDSn property.
     * 
     */
    public void setInCustAddrParrelDSn(int value) {
        this.inCustAddrParrelDSn = value;
    }

    /**
     * Gets the value of the inCustomerCommunMethod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCustomerCommunMethod() {
        return inCustomerCommunMethod;
    }

    /**
     * Sets the value of the inCustomerCommunMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCustomerCommunMethod(String value) {
        this.inCustomerCommunMethod = value;
    }

    /**
     * Gets the value of the inCustomerCbsId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCustomerCbsId() {
        return inCustomerCbsId;
    }

    /**
     * Sets the value of the inCustomerCbsId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCustomerCbsId(String value) {
        this.inCustomerCbsId = value;
    }

    /**
     * Gets the value of the inCustomerIapplyId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCustomerIapplyId() {
        return inCustomerIapplyId;
    }

    /**
     * Sets the value of the inCustomerIapplyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCustomerIapplyId(String value) {
        this.inCustomerIapplyId = value;
    }

    /**
     * Gets the value of the inCustomerCrmId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCustomerCrmId() {
        return inCustomerCrmId;
    }

    /**
     * Sets the value of the inCustomerCrmId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCustomerCrmId(String value) {
        this.inCustomerCrmId = value;
    }

}
