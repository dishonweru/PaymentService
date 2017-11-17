
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for IndividualCustomerMaintenanceExport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IndividualCustomerMaintenanceExport">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}BaseExport">
 *       &lt;sequence>
 *         &lt;element name="Out2ndCitizenshipCustomerCategoryTmstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="Out2ndCitizenshipGenericDetailDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Out2ndCitizenshipGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Out2ndProfessionCustomerCategoryTmstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="Out2ndProfessionGenericDetailDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Out2ndProfessionGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutActivityCustomerCategoryTmstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutActivityGenericDetailDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutActivityGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutActivityTypeCustomerCategoryTmstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutActivityTypeGenericDetailDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutActivityTypeGenericDetailEntryStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutActivityTypeGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutActivityTypeGenericDetailShortDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutAddressCountryGenericDetailDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutAddressCountryGenericDetailShortDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutAddressDistrictGenericDetailDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutAddressDistrictGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutAfmIssueCountryGenericDetailDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutAfmIssueCountryGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutAfmIssueCountryGenericDetailShortDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutAtenetCustCardInfoCardNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutAtenetCustCardInfoEndDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutAtenetCustCardInfoStartDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutAtenetCustCardInfoTmstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutAttractionBankemployeeFirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutAttractionBankemployeeLastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutAttractionCustomerCategoryTmstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutAttractionGenericDetailDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutAttractionGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutAttractionUsrCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutBankemployeeFirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutBankemployeeId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutBankemployeeLastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutBankParametersBankParametersBankCode" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutBankParametersBankParametersWordPrint" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutBasileiaCustomerCategoryTmstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutBasileiaGenericDetailDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutBasileiaGenericDetailEntryStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutBasileiaGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutBasileiaGenericDetailShortDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutBirthCountryCustomerCategoryTmstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutBirthCountryGenericDetailDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutBirthCountryGenericDetailShortDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutBranchPortfolioBranch" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutBranchPortfolioDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutBranchPortfolioPortfolioCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutChamberAuthorityCustomerCategoryTmstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutChamberAuthorityGenericDetailDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutChamberAuthorityGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutCitizenshipCustomerCategoryTmstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutCitizenshipGenericDetailDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCitizenshipGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutCommunicationLangCustomerCategoryTmstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutCommunicationLangGenericDetailDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCommunicationLangGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutCompanyCategCustomerCategoryTmstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutCompanyCategGenericDetailDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCompanyCategGenericDetailEntryStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCompanyCategGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutCompanyCategGenericDetailShortDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutConditionsMembershipCustomerCategoryTmstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutConditionsMembershipGenericDetailDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutConditionsMembershipGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutConditionsMembershipGenericDetailShortDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustAddressAddress1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustAddressAddress2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustAddressAddressType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustAddressCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustAddressEntryComments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustAddressFaxNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustAddressMailBox" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustAddressRegion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustAddressSegmFlags" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustAddressSerialNum" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutCustAddressTelephone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustAddressTmstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutCustAddressZipCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustomerAttractionDetails" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustomerAttractionPerson" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustomerBaselDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustomerBaselStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustomerBirthplace" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustomerBlacklistedInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustomerBusinessInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustomerCertificCust" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustomerCertificDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutCustomerChamberComments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustomerChamberId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustomerChildrenAbove18" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutCustomerConsolidStatmFlg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustomerCustId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutCustomerCustStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustomerCustType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustomerDaiNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustomerDateOfBirth" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutCustomerDocExpireDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutCustomerEMail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustomerEmployementStartDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutCustomerEmployer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustomerEmployerAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustomerEntryComments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustomerEntryStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustomerFamilyMembers" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutCustomerFatherName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustomerFatherSurname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustomerFicliCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutCustomerFicliDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustomerFinRange" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutCustomerFinRangeDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutCustomerFirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustomerIncompleteUComnt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustomerInternetAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustomerLastUpdate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutCustomerLatinFirstname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustomerLatinSurname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustomerMailInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustomerMajorBeneficiary" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustomerMarketingReminder" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustomerMiddleName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustomerMobileTel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustomerMotherName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustomerMotherSurname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustomerNoAfm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustomerNonRegistered" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustomerNonResident" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustomerNonResidentForRep" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustomerNumOfChildren" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutCustomerPensionerInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustomerPromocode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustomerSecondSurname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustomerSegmFlags" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustomerSepaAgrDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutCustomerSepaAgrFlg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustomerSex" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustomerShortName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustomerSpmNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustomerSurname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustomerTelephone1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustomerTelex" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustomerTelexConnection" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustomerTitle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustomerTmstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutCustomerVipInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustStockInfoInvestorCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutCustStockInfoNoOfShares" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutCustStockInfoShareholderInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutEconomyGroupCustomerCategoryTmstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutEconomyGroupGenericDetailDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutEconomyGroupGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutEducationLevelCustomerCategoryTmstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutEducationLevelGenericDetailDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutEducationLevelGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutEuroIdOtherIdIdNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutEuroIdOtherIdIssueAuthority" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutEuroIdOtherIdIssueDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutEvalResultTeamInformationAuthorizationType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutEvalResultTeamInformationEvaluationResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutEvalResultTeamInformationRequiredProfile1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutEvalResultTeamInformationRequiredProfile2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutFamilyStatusCustomerCategoryTmstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutFamilyStatusGenericDetailDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutFamilyStatusGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGrpCustcatLength" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGrpLogLength" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGrpSameAfmLength" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGrpSameIdLength" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutIdCountryGenericDetailDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutIdCountryGenericDetailShortDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutIdOtherIdIdNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutIdOtherIdIssueAuthority" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutIdOtherIdIssueDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutIdTypeGenericDetailDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutIdTypeGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutIncomeLevelCustomerCategoryTmstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutIncomeLevelGenericDetailDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutIncomeLevelGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutKeyCustomerCDigit" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutKeyCustomerCustId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutKeyOtherCustomerCDigit" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutKeyOtherCustomerCustId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutMarketGenericDetailDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutMarketGenericDetailEntryStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutMarketGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutMonitoringBankemployeeFirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutMonitoringBankemployeeId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutMonitoringBankemployeeLastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutMonitoringUnitCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutMonitoringUnitUnitName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutNationalityCustomerCategoryTmstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutNationalityGenericDetailDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutNationalityGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutOtherAfmAfmNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutOtherAfmSerialNo" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutOtherAfmTmstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutOtherIdExpiryDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutOtherIdIdNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutOtherIdIssueAuthority" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutOtherIdIssueDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutOtherIdSerialNo" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutOtherIdTmstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutPassportOtherIdExpiryDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutPassportOtherIdIdNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutPassportOtherIdIssueAuthority" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutPassportOtherIdIssueDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutProfessionCategoryCustomerCategoryTmstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutProfessionCategoryGenericDetailDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutProfessionCategoryGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutProfessionCustomerCategoryTmstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutProfessionGenericDetailDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutProfessionGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutProfessionStatusCustomerCategoryTmstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutProfessionStatusGenericDetailDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutProfessionStatusGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutRcountryCustomerCategoryTmstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutRcountryGenericDetailDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutRcountryGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutRcountryGenericDetailShortDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutRegionCustomerCategoryTmstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutRegionGenericDetailDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutRegionGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutResidenceCountryCustomerCategoryTmstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutResidenceCountryGenericDetailDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutResidenceCountryGenericDetailEntryStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutResidenceCountryGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutResidenceCountryGenericDetailShortDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutRmBankemployeeFirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutRmBankemployeeLastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutRmUsrCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSegmentGenericDetailDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSegmentGenericDetailEntryStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSegmentGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutStatusIefSuppliedActionEntry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutStatusIefSuppliedSrvStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSubCategoryCustomerCategoryTmstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutSubCategoryGenericDetailDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSubCategoryGenericDetailEntryStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSubCategoryGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutSubCategoryGenericDetailShortDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutTaxOfficeDomTaxOffice" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutTaxOfficeId" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutTaxOfficeTaxOfficeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutThinkingCurrencyIdCurrency" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutThinkingCurrencyShortDescr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutTimePrintLineTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutWifeHusbCustomerFirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutWifeHusbCustomerSurname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutWifeHusbOtherIdIdNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustomerEnableFor24c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustomerCustOpenDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutGrpCustcat" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}ArrayOfOutGrpCustcat" minOccurs="0"/>
 *         &lt;element name="OutGrpSameAfm" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}ArrayOfOutGrpSameAfm" minOccurs="0"/>
 *         &lt;element name="OutGrpSameId" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}ArrayOfOutGrpSameId" minOccurs="0"/>
 *         &lt;element name="OutCustAddressAccomodationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutCustAddressInternetAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustAddressEMail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustAddressTelephone3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustAddressTelephone2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustAddressAddress6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustAddressAddress5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustAddressAddress4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustAddressAddress3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustAddressLatinInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustAddressPtsInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustAddressCommunicationAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustAddressEntryStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustomerOwnershipIndication" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustomerContractExpiryDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutCustomerContract" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustomerMobileTel2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustomerEMail2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutEmployerCustAddressSerialNum" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutEmployerCustAddressAddressType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutEmployerCustAddressFaxNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutEmployerCustAddressCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutEmployerCustAddressZipCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutEmployerCustAddressTelephone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutEmployerCustAddressCommunicationAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutEmployerCustAddressEntryStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutEmployerCustAddressTmstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutEmployerCustAddressRegion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutEmployerCustAddressAddress1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutEmployerCustAddressAddress2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutEmployerCustAddressEntryComments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutEmployerCustAddressMailBox" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutEmployerCustAddressSegmFlags" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutEmployerCustAddressAccomodationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutEmployerCustAddressInternetAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutEmployerCustAddressEMail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutEmployerCustAddressTelephone3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutEmployerCustAddressTelephone2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutEmployerCustAddressAddress6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutEmployerCustAddressAddress5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutEmployerCustAddressAddress4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutEmployerCustAddressAddress3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutEmployerCustAddressLatinInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutEmployerCustAddressPtsInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutEmployerAddressDistrictGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutEmployerAddressDistrictGenericDetailDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutEmployerAddressCountryGenericDetailDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutEmployerAddressCountryGenericDetailShortDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutEmployerCustAddrParrelDCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutEmployerCustAddrParrelDSn" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutCustAddrParrelDCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustAddrParrelDSn" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutEmployerCustAddrParrelDP01Desc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutEmployerCustAddrParrelDP02Desc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutEmployerCustAddrParrelDP03Desc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutEmployerCustAddrParrelDP04Desc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutEmployerCustAddrParrelDP05Desc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutEmployerCustAddrParrelDP06Desc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutEmployerCustAddrParrelDP07Desc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutEmployerCustAddrParrelDP08Desc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutEmployerCustAddrParrelDP09Desc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutEmployerCustAddrParrelDP10Desc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustAddrParrelDP01Desc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustAddrParrelDP02Desc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustAddrParrelDP03Desc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustAddrParrelDP04Desc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustAddrParrelDP05Desc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustAddrParrelDP06Desc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustAddrParrelDP07Desc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustAddrParrelDP08Desc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustAddrParrelDP09Desc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustAddrParrelDP10Desc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustomerCommunMethod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustomerCbsId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustomerIapplyId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustomerCrmId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IndividualCustomerMaintenanceExport", propOrder = {
    "out2NdCitizenshipCustomerCategoryTmstamp",
    "out2NdCitizenshipGenericDetailDescription",
    "out2NdCitizenshipGenericDetailSerialNum",
    "out2NdProfessionCustomerCategoryTmstamp",
    "out2NdProfessionGenericDetailDescription",
    "out2NdProfessionGenericDetailSerialNum",
    "outActivityCustomerCategoryTmstamp",
    "outActivityGenericDetailDescription",
    "outActivityGenericDetailSerialNum",
    "outActivityTypeCustomerCategoryTmstamp",
    "outActivityTypeGenericDetailDescription",
    "outActivityTypeGenericDetailEntryStatus",
    "outActivityTypeGenericDetailSerialNum",
    "outActivityTypeGenericDetailShortDescription",
    "outAddressCountryGenericDetailDescription",
    "outAddressCountryGenericDetailShortDescription",
    "outAddressDistrictGenericDetailDescription",
    "outAddressDistrictGenericDetailSerialNum",
    "outAfmIssueCountryGenericDetailDescription",
    "outAfmIssueCountryGenericDetailSerialNum",
    "outAfmIssueCountryGenericDetailShortDescription",
    "outAtenetCustCardInfoCardNo",
    "outAtenetCustCardInfoEndDate",
    "outAtenetCustCardInfoStartDate",
    "outAtenetCustCardInfoTmstamp",
    "outAttractionBankemployeeFirstName",
    "outAttractionBankemployeeLastName",
    "outAttractionCustomerCategoryTmstamp",
    "outAttractionGenericDetailDescription",
    "outAttractionGenericDetailSerialNum",
    "outAttractionUsrCode",
    "outBankemployeeFirstName",
    "outBankemployeeId",
    "outBankemployeeLastName",
    "outBankParametersBankParametersBankCode",
    "outBankParametersBankParametersWordPrint",
    "outBasileiaCustomerCategoryTmstamp",
    "outBasileiaGenericDetailDescription",
    "outBasileiaGenericDetailEntryStatus",
    "outBasileiaGenericDetailSerialNum",
    "outBasileiaGenericDetailShortDescription",
    "outBirthCountryCustomerCategoryTmstamp",
    "outBirthCountryGenericDetailDescription",
    "outBirthCountryGenericDetailShortDescription",
    "outBranchPortfolioBranch",
    "outBranchPortfolioDescription",
    "outBranchPortfolioPortfolioCode",
    "outChamberAuthorityCustomerCategoryTmstamp",
    "outChamberAuthorityGenericDetailDescription",
    "outChamberAuthorityGenericDetailSerialNum",
    "outCitizenshipCustomerCategoryTmstamp",
    "outCitizenshipGenericDetailDescription",
    "outCitizenshipGenericDetailSerialNum",
    "outCommunicationLangCustomerCategoryTmstamp",
    "outCommunicationLangGenericDetailDescription",
    "outCommunicationLangGenericDetailSerialNum",
    "outCompanyCategCustomerCategoryTmstamp",
    "outCompanyCategGenericDetailDescription",
    "outCompanyCategGenericDetailEntryStatus",
    "outCompanyCategGenericDetailSerialNum",
    "outCompanyCategGenericDetailShortDescription",
    "outConditionsMembershipCustomerCategoryTmstamp",
    "outConditionsMembershipGenericDetailDescription",
    "outConditionsMembershipGenericDetailSerialNum",
    "outConditionsMembershipGenericDetailShortDescription",
    "outCustAddressAddress1",
    "outCustAddressAddress2",
    "outCustAddressAddressType",
    "outCustAddressCity",
    "outCustAddressEntryComments",
    "outCustAddressFaxNo",
    "outCustAddressMailBox",
    "outCustAddressRegion",
    "outCustAddressSegmFlags",
    "outCustAddressSerialNum",
    "outCustAddressTelephone",
    "outCustAddressTmstamp",
    "outCustAddressZipCode",
    "outCustomerAttractionDetails",
    "outCustomerAttractionPerson",
    "outCustomerBaselDescription",
    "outCustomerBaselStatus",
    "outCustomerBirthplace",
    "outCustomerBlacklistedInd",
    "outCustomerBusinessInd",
    "outCustomerCertificCust",
    "outCustomerCertificDate",
    "outCustomerChamberComments",
    "outCustomerChamberId",
    "outCustomerChildrenAbove18",
    "outCustomerConsolidStatmFlg",
    "outCustomerCustId",
    "outCustomerCustStatus",
    "outCustomerCustType",
    "outCustomerDaiNumber",
    "outCustomerDateOfBirth",
    "outCustomerDocExpireDate",
    "outCustomerEMail",
    "outCustomerEmployementStartDate",
    "outCustomerEmployer",
    "outCustomerEmployerAddress",
    "outCustomerEntryComments",
    "outCustomerEntryStatus",
    "outCustomerFamilyMembers",
    "outCustomerFatherName",
    "outCustomerFatherSurname",
    "outCustomerFicliCode",
    "outCustomerFicliDesc",
    "outCustomerFinRange",
    "outCustomerFinRangeDt",
    "outCustomerFirstName",
    "outCustomerIncompleteUComnt",
    "outCustomerInternetAddress",
    "outCustomerLastUpdate",
    "outCustomerLatinFirstname",
    "outCustomerLatinSurname",
    "outCustomerMailInd",
    "outCustomerMajorBeneficiary",
    "outCustomerMarketingReminder",
    "outCustomerMiddleName",
    "outCustomerMobileTel",
    "outCustomerMotherName",
    "outCustomerMotherSurname",
    "outCustomerNoAfm",
    "outCustomerNonRegistered",
    "outCustomerNonResident",
    "outCustomerNonResidentForRep",
    "outCustomerNumOfChildren",
    "outCustomerPensionerInd",
    "outCustomerPromocode",
    "outCustomerSecondSurname",
    "outCustomerSegmFlags",
    "outCustomerSepaAgrDt",
    "outCustomerSepaAgrFlg",
    "outCustomerSex",
    "outCustomerShortName",
    "outCustomerSpmNumber",
    "outCustomerSurname",
    "outCustomerTelephone1",
    "outCustomerTelex",
    "outCustomerTelexConnection",
    "outCustomerTitle",
    "outCustomerTmstamp",
    "outCustomerVipInd",
    "outCustStockInfoInvestorCode",
    "outCustStockInfoNoOfShares",
    "outCustStockInfoShareholderInd",
    "outEconomyGroupCustomerCategoryTmstamp",
    "outEconomyGroupGenericDetailDescription",
    "outEconomyGroupGenericDetailSerialNum",
    "outEducationLevelCustomerCategoryTmstamp",
    "outEducationLevelGenericDetailDescription",
    "outEducationLevelGenericDetailSerialNum",
    "outEuroIdOtherIdIdNo",
    "outEuroIdOtherIdIssueAuthority",
    "outEuroIdOtherIdIssueDate",
    "outEvalResultTeamInformationAuthorizationType",
    "outEvalResultTeamInformationEvaluationResult",
    "outEvalResultTeamInformationRequiredProfile1",
    "outEvalResultTeamInformationRequiredProfile2",
    "outFamilyStatusCustomerCategoryTmstamp",
    "outFamilyStatusGenericDetailDescription",
    "outFamilyStatusGenericDetailSerialNum",
    "outGrpCustcatLength",
    "outGrpLogLength",
    "outGrpSameAfmLength",
    "outGrpSameIdLength",
    "outIdCountryGenericDetailDescription",
    "outIdCountryGenericDetailShortDescription",
    "outIdOtherIdIdNo",
    "outIdOtherIdIssueAuthority",
    "outIdOtherIdIssueDate",
    "outIdTypeGenericDetailDescription",
    "outIdTypeGenericDetailSerialNum",
    "outIncomeLevelCustomerCategoryTmstamp",
    "outIncomeLevelGenericDetailDescription",
    "outIncomeLevelGenericDetailSerialNum",
    "outKeyCustomerCDigit",
    "outKeyCustomerCustId",
    "outKeyOtherCustomerCDigit",
    "outKeyOtherCustomerCustId",
    "outMarketGenericDetailDescription",
    "outMarketGenericDetailEntryStatus",
    "outMarketGenericDetailSerialNum",
    "outMonitoringBankemployeeFirstName",
    "outMonitoringBankemployeeId",
    "outMonitoringBankemployeeLastName",
    "outMonitoringUnitCode",
    "outMonitoringUnitUnitName",
    "outNationalityCustomerCategoryTmstamp",
    "outNationalityGenericDetailDescription",
    "outNationalityGenericDetailSerialNum",
    "outOtherAfmAfmNo",
    "outOtherAfmSerialNo",
    "outOtherAfmTmstamp",
    "outOtherIdExpiryDate",
    "outOtherIdIdNo",
    "outOtherIdIssueAuthority",
    "outOtherIdIssueDate",
    "outOtherIdSerialNo",
    "outOtherIdTmstamp",
    "outPassportOtherIdExpiryDate",
    "outPassportOtherIdIdNo",
    "outPassportOtherIdIssueAuthority",
    "outPassportOtherIdIssueDate",
    "outProfessionCategoryCustomerCategoryTmstamp",
    "outProfessionCategoryGenericDetailDescription",
    "outProfessionCategoryGenericDetailSerialNum",
    "outProfessionCustomerCategoryTmstamp",
    "outProfessionGenericDetailDescription",
    "outProfessionGenericDetailSerialNum",
    "outProfessionStatusCustomerCategoryTmstamp",
    "outProfessionStatusGenericDetailDescription",
    "outProfessionStatusGenericDetailSerialNum",
    "outRcountryCustomerCategoryTmstamp",
    "outRcountryGenericDetailDescription",
    "outRcountryGenericDetailSerialNum",
    "outRcountryGenericDetailShortDescription",
    "outRegionCustomerCategoryTmstamp",
    "outRegionGenericDetailDescription",
    "outRegionGenericDetailSerialNum",
    "outResidenceCountryCustomerCategoryTmstamp",
    "outResidenceCountryGenericDetailDescription",
    "outResidenceCountryGenericDetailEntryStatus",
    "outResidenceCountryGenericDetailSerialNum",
    "outResidenceCountryGenericDetailShortDescription",
    "outRmBankemployeeFirstName",
    "outRmBankemployeeLastName",
    "outRmUsrCode",
    "outSegmentGenericDetailDescription",
    "outSegmentGenericDetailEntryStatus",
    "outSegmentGenericDetailSerialNum",
    "outStatusIefSuppliedActionEntry",
    "outStatusIefSuppliedSrvStatus",
    "outSubCategoryCustomerCategoryTmstamp",
    "outSubCategoryGenericDetailDescription",
    "outSubCategoryGenericDetailEntryStatus",
    "outSubCategoryGenericDetailSerialNum",
    "outSubCategoryGenericDetailShortDescription",
    "outTaxOfficeDomTaxOffice",
    "outTaxOfficeId",
    "outTaxOfficeTaxOfficeName",
    "outThinkingCurrencyIdCurrency",
    "outThinkingCurrencyShortDescr",
    "outTimePrintLineTime",
    "outWifeHusbCustomerFirstName",
    "outWifeHusbCustomerSurname",
    "outWifeHusbOtherIdIdNo",
    "outCustomerEnableFor24C",
    "outCustomerCustOpenDate",
    "outGrpCustcat",
    "outGrpSameAfm",
    "outGrpSameId",
    "outCustAddressAccomodationDate",
    "outCustAddressInternetAddress",
    "outCustAddressEMail",
    "outCustAddressTelephone3",
    "outCustAddressTelephone2",
    "outCustAddressAddress6",
    "outCustAddressAddress5",
    "outCustAddressAddress4",
    "outCustAddressAddress3",
    "outCustAddressLatinInd",
    "outCustAddressPtsInd",
    "outCustAddressCommunicationAddress",
    "outCustAddressEntryStatus",
    "outCustomerOwnershipIndication",
    "outCustomerContractExpiryDate",
    "outCustomerContract",
    "outCustomerMobileTel2",
    "outCustomerEMail2",
    "outEmployerCustAddressSerialNum",
    "outEmployerCustAddressAddressType",
    "outEmployerCustAddressFaxNo",
    "outEmployerCustAddressCity",
    "outEmployerCustAddressZipCode",
    "outEmployerCustAddressTelephone",
    "outEmployerCustAddressCommunicationAddress",
    "outEmployerCustAddressEntryStatus",
    "outEmployerCustAddressTmstamp",
    "outEmployerCustAddressRegion",
    "outEmployerCustAddressAddress1",
    "outEmployerCustAddressAddress2",
    "outEmployerCustAddressEntryComments",
    "outEmployerCustAddressMailBox",
    "outEmployerCustAddressSegmFlags",
    "outEmployerCustAddressAccomodationDate",
    "outEmployerCustAddressInternetAddress",
    "outEmployerCustAddressEMail",
    "outEmployerCustAddressTelephone3",
    "outEmployerCustAddressTelephone2",
    "outEmployerCustAddressAddress6",
    "outEmployerCustAddressAddress5",
    "outEmployerCustAddressAddress4",
    "outEmployerCustAddressAddress3",
    "outEmployerCustAddressLatinInd",
    "outEmployerCustAddressPtsInd",
    "outEmployerAddressDistrictGenericDetailSerialNum",
    "outEmployerAddressDistrictGenericDetailDescription",
    "outEmployerAddressCountryGenericDetailDescription",
    "outEmployerAddressCountryGenericDetailShortDescription",
    "outEmployerCustAddrParrelDCode",
    "outEmployerCustAddrParrelDSn",
    "outCustAddrParrelDCode",
    "outCustAddrParrelDSn",
    "outEmployerCustAddrParrelDP01Desc",
    "outEmployerCustAddrParrelDP02Desc",
    "outEmployerCustAddrParrelDP03Desc",
    "outEmployerCustAddrParrelDP04Desc",
    "outEmployerCustAddrParrelDP05Desc",
    "outEmployerCustAddrParrelDP06Desc",
    "outEmployerCustAddrParrelDP07Desc",
    "outEmployerCustAddrParrelDP08Desc",
    "outEmployerCustAddrParrelDP09Desc",
    "outEmployerCustAddrParrelDP10Desc",
    "outCustAddrParrelDP01Desc",
    "outCustAddrParrelDP02Desc",
    "outCustAddrParrelDP03Desc",
    "outCustAddrParrelDP04Desc",
    "outCustAddrParrelDP05Desc",
    "outCustAddrParrelDP06Desc",
    "outCustAddrParrelDP07Desc",
    "outCustAddrParrelDP08Desc",
    "outCustAddrParrelDP09Desc",
    "outCustAddrParrelDP10Desc",
    "outCustomerCommunMethod",
    "outCustomerCbsId",
    "outCustomerIapplyId",
    "outCustomerCrmId"
})
public class IndividualCustomerMaintenanceExport
    extends BaseExport
{

    @XmlElement(name = "Out2ndCitizenshipCustomerCategoryTmstamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar out2NdCitizenshipCustomerCategoryTmstamp;
    @XmlElement(name = "Out2ndCitizenshipGenericDetailDescription")
    protected String out2NdCitizenshipGenericDetailDescription;
    @XmlElement(name = "Out2ndCitizenshipGenericDetailSerialNum")
    protected int out2NdCitizenshipGenericDetailSerialNum;
    @XmlElement(name = "Out2ndProfessionCustomerCategoryTmstamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar out2NdProfessionCustomerCategoryTmstamp;
    @XmlElement(name = "Out2ndProfessionGenericDetailDescription")
    protected String out2NdProfessionGenericDetailDescription;
    @XmlElement(name = "Out2ndProfessionGenericDetailSerialNum")
    protected int out2NdProfessionGenericDetailSerialNum;
    @XmlElement(name = "OutActivityCustomerCategoryTmstamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outActivityCustomerCategoryTmstamp;
    @XmlElement(name = "OutActivityGenericDetailDescription")
    protected String outActivityGenericDetailDescription;
    @XmlElement(name = "OutActivityGenericDetailSerialNum")
    protected int outActivityGenericDetailSerialNum;
    @XmlElement(name = "OutActivityTypeCustomerCategoryTmstamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outActivityTypeCustomerCategoryTmstamp;
    @XmlElement(name = "OutActivityTypeGenericDetailDescription")
    protected String outActivityTypeGenericDetailDescription;
    @XmlElement(name = "OutActivityTypeGenericDetailEntryStatus")
    protected String outActivityTypeGenericDetailEntryStatus;
    @XmlElement(name = "OutActivityTypeGenericDetailSerialNum")
    protected int outActivityTypeGenericDetailSerialNum;
    @XmlElement(name = "OutActivityTypeGenericDetailShortDescription")
    protected String outActivityTypeGenericDetailShortDescription;
    @XmlElement(name = "OutAddressCountryGenericDetailDescription")
    protected String outAddressCountryGenericDetailDescription;
    @XmlElement(name = "OutAddressCountryGenericDetailShortDescription")
    protected String outAddressCountryGenericDetailShortDescription;
    @XmlElement(name = "OutAddressDistrictGenericDetailDescription")
    protected String outAddressDistrictGenericDetailDescription;
    @XmlElement(name = "OutAddressDistrictGenericDetailSerialNum")
    protected int outAddressDistrictGenericDetailSerialNum;
    @XmlElement(name = "OutAfmIssueCountryGenericDetailDescription")
    protected String outAfmIssueCountryGenericDetailDescription;
    @XmlElement(name = "OutAfmIssueCountryGenericDetailSerialNum")
    protected int outAfmIssueCountryGenericDetailSerialNum;
    @XmlElement(name = "OutAfmIssueCountryGenericDetailShortDescription")
    protected String outAfmIssueCountryGenericDetailShortDescription;
    @XmlElement(name = "OutAtenetCustCardInfoCardNo")
    protected String outAtenetCustCardInfoCardNo;
    @XmlElement(name = "OutAtenetCustCardInfoEndDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outAtenetCustCardInfoEndDate;
    @XmlElement(name = "OutAtenetCustCardInfoStartDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outAtenetCustCardInfoStartDate;
    @XmlElement(name = "OutAtenetCustCardInfoTmstamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outAtenetCustCardInfoTmstamp;
    @XmlElement(name = "OutAttractionBankemployeeFirstName")
    protected String outAttractionBankemployeeFirstName;
    @XmlElement(name = "OutAttractionBankemployeeLastName")
    protected String outAttractionBankemployeeLastName;
    @XmlElement(name = "OutAttractionCustomerCategoryTmstamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outAttractionCustomerCategoryTmstamp;
    @XmlElement(name = "OutAttractionGenericDetailDescription")
    protected String outAttractionGenericDetailDescription;
    @XmlElement(name = "OutAttractionGenericDetailSerialNum")
    protected int outAttractionGenericDetailSerialNum;
    @XmlElement(name = "OutAttractionUsrCode")
    protected String outAttractionUsrCode;
    @XmlElement(name = "OutBankemployeeFirstName")
    protected String outBankemployeeFirstName;
    @XmlElement(name = "OutBankemployeeId")
    protected String outBankemployeeId;
    @XmlElement(name = "OutBankemployeeLastName")
    protected String outBankemployeeLastName;
    @XmlElement(name = "OutBankParametersBankParametersBankCode")
    protected short outBankParametersBankParametersBankCode;
    @XmlElement(name = "OutBankParametersBankParametersWordPrint")
    protected String outBankParametersBankParametersWordPrint;
    @XmlElement(name = "OutBasileiaCustomerCategoryTmstamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outBasileiaCustomerCategoryTmstamp;
    @XmlElement(name = "OutBasileiaGenericDetailDescription")
    protected String outBasileiaGenericDetailDescription;
    @XmlElement(name = "OutBasileiaGenericDetailEntryStatus")
    protected String outBasileiaGenericDetailEntryStatus;
    @XmlElement(name = "OutBasileiaGenericDetailSerialNum")
    protected int outBasileiaGenericDetailSerialNum;
    @XmlElement(name = "OutBasileiaGenericDetailShortDescription")
    protected String outBasileiaGenericDetailShortDescription;
    @XmlElement(name = "OutBirthCountryCustomerCategoryTmstamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outBirthCountryCustomerCategoryTmstamp;
    @XmlElement(name = "OutBirthCountryGenericDetailDescription")
    protected String outBirthCountryGenericDetailDescription;
    @XmlElement(name = "OutBirthCountryGenericDetailShortDescription")
    protected String outBirthCountryGenericDetailShortDescription;
    @XmlElement(name = "OutBranchPortfolioBranch")
    protected int outBranchPortfolioBranch;
    @XmlElement(name = "OutBranchPortfolioDescription")
    protected String outBranchPortfolioDescription;
    @XmlElement(name = "OutBranchPortfolioPortfolioCode")
    protected int outBranchPortfolioPortfolioCode;
    @XmlElement(name = "OutChamberAuthorityCustomerCategoryTmstamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outChamberAuthorityCustomerCategoryTmstamp;
    @XmlElement(name = "OutChamberAuthorityGenericDetailDescription")
    protected String outChamberAuthorityGenericDetailDescription;
    @XmlElement(name = "OutChamberAuthorityGenericDetailSerialNum")
    protected int outChamberAuthorityGenericDetailSerialNum;
    @XmlElement(name = "OutCitizenshipCustomerCategoryTmstamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outCitizenshipCustomerCategoryTmstamp;
    @XmlElement(name = "OutCitizenshipGenericDetailDescription")
    protected String outCitizenshipGenericDetailDescription;
    @XmlElement(name = "OutCitizenshipGenericDetailSerialNum")
    protected int outCitizenshipGenericDetailSerialNum;
    @XmlElement(name = "OutCommunicationLangCustomerCategoryTmstamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outCommunicationLangCustomerCategoryTmstamp;
    @XmlElement(name = "OutCommunicationLangGenericDetailDescription")
    protected String outCommunicationLangGenericDetailDescription;
    @XmlElement(name = "OutCommunicationLangGenericDetailSerialNum")
    protected int outCommunicationLangGenericDetailSerialNum;
    @XmlElement(name = "OutCompanyCategCustomerCategoryTmstamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outCompanyCategCustomerCategoryTmstamp;
    @XmlElement(name = "OutCompanyCategGenericDetailDescription")
    protected String outCompanyCategGenericDetailDescription;
    @XmlElement(name = "OutCompanyCategGenericDetailEntryStatus")
    protected String outCompanyCategGenericDetailEntryStatus;
    @XmlElement(name = "OutCompanyCategGenericDetailSerialNum")
    protected int outCompanyCategGenericDetailSerialNum;
    @XmlElement(name = "OutCompanyCategGenericDetailShortDescription")
    protected String outCompanyCategGenericDetailShortDescription;
    @XmlElement(name = "OutConditionsMembershipCustomerCategoryTmstamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outConditionsMembershipCustomerCategoryTmstamp;
    @XmlElement(name = "OutConditionsMembershipGenericDetailDescription")
    protected String outConditionsMembershipGenericDetailDescription;
    @XmlElement(name = "OutConditionsMembershipGenericDetailSerialNum")
    protected int outConditionsMembershipGenericDetailSerialNum;
    @XmlElement(name = "OutConditionsMembershipGenericDetailShortDescription")
    protected String outConditionsMembershipGenericDetailShortDescription;
    @XmlElement(name = "OutCustAddressAddress1")
    protected String outCustAddressAddress1;
    @XmlElement(name = "OutCustAddressAddress2")
    protected String outCustAddressAddress2;
    @XmlElement(name = "OutCustAddressAddressType")
    protected String outCustAddressAddressType;
    @XmlElement(name = "OutCustAddressCity")
    protected String outCustAddressCity;
    @XmlElement(name = "OutCustAddressEntryComments")
    protected String outCustAddressEntryComments;
    @XmlElement(name = "OutCustAddressFaxNo")
    protected String outCustAddressFaxNo;
    @XmlElement(name = "OutCustAddressMailBox")
    protected String outCustAddressMailBox;
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
    @XmlElement(name = "OutCustomerAttractionDetails")
    protected String outCustomerAttractionDetails;
    @XmlElement(name = "OutCustomerAttractionPerson")
    protected String outCustomerAttractionPerson;
    @XmlElement(name = "OutCustomerBaselDescription")
    protected String outCustomerBaselDescription;
    @XmlElement(name = "OutCustomerBaselStatus")
    protected String outCustomerBaselStatus;
    @XmlElement(name = "OutCustomerBirthplace")
    protected String outCustomerBirthplace;
    @XmlElement(name = "OutCustomerBlacklistedInd")
    protected String outCustomerBlacklistedInd;
    @XmlElement(name = "OutCustomerBusinessInd")
    protected String outCustomerBusinessInd;
    @XmlElement(name = "OutCustomerCertificCust")
    protected String outCustomerCertificCust;
    @XmlElement(name = "OutCustomerCertificDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outCustomerCertificDate;
    @XmlElement(name = "OutCustomerChamberComments")
    protected String outCustomerChamberComments;
    @XmlElement(name = "OutCustomerChamberId")
    protected String outCustomerChamberId;
    @XmlElement(name = "OutCustomerChildrenAbove18")
    protected short outCustomerChildrenAbove18;
    @XmlElement(name = "OutCustomerConsolidStatmFlg")
    protected String outCustomerConsolidStatmFlg;
    @XmlElement(name = "OutCustomerCustId")
    protected int outCustomerCustId;
    @XmlElement(name = "OutCustomerCustStatus")
    protected String outCustomerCustStatus;
    @XmlElement(name = "OutCustomerCustType")
    protected String outCustomerCustType;
    @XmlElement(name = "OutCustomerDaiNumber")
    protected String outCustomerDaiNumber;
    @XmlElement(name = "OutCustomerDateOfBirth", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outCustomerDateOfBirth;
    @XmlElement(name = "OutCustomerDocExpireDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outCustomerDocExpireDate;
    @XmlElement(name = "OutCustomerEMail")
    protected String outCustomerEMail;
    @XmlElement(name = "OutCustomerEmployementStartDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outCustomerEmployementStartDate;
    @XmlElement(name = "OutCustomerEmployer")
    protected String outCustomerEmployer;
    @XmlElement(name = "OutCustomerEmployerAddress")
    protected String outCustomerEmployerAddress;
    @XmlElement(name = "OutCustomerEntryComments")
    protected String outCustomerEntryComments;
    @XmlElement(name = "OutCustomerEntryStatus")
    protected String outCustomerEntryStatus;
    @XmlElement(name = "OutCustomerFamilyMembers")
    protected short outCustomerFamilyMembers;
    @XmlElement(name = "OutCustomerFatherName")
    protected String outCustomerFatherName;
    @XmlElement(name = "OutCustomerFatherSurname")
    protected String outCustomerFatherSurname;
    @XmlElement(name = "OutCustomerFicliCode")
    protected int outCustomerFicliCode;
    @XmlElement(name = "OutCustomerFicliDesc")
    protected String outCustomerFicliDesc;
    @XmlElement(name = "OutCustomerFinRange", required = true)
    protected BigDecimal outCustomerFinRange;
    @XmlElement(name = "OutCustomerFinRangeDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outCustomerFinRangeDt;
    @XmlElement(name = "OutCustomerFirstName")
    protected String outCustomerFirstName;
    @XmlElement(name = "OutCustomerIncompleteUComnt")
    protected String outCustomerIncompleteUComnt;
    @XmlElement(name = "OutCustomerInternetAddress")
    protected String outCustomerInternetAddress;
    @XmlElement(name = "OutCustomerLastUpdate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outCustomerLastUpdate;
    @XmlElement(name = "OutCustomerLatinFirstname")
    protected String outCustomerLatinFirstname;
    @XmlElement(name = "OutCustomerLatinSurname")
    protected String outCustomerLatinSurname;
    @XmlElement(name = "OutCustomerMailInd")
    protected String outCustomerMailInd;
    @XmlElement(name = "OutCustomerMajorBeneficiary")
    protected String outCustomerMajorBeneficiary;
    @XmlElement(name = "OutCustomerMarketingReminder")
    protected String outCustomerMarketingReminder;
    @XmlElement(name = "OutCustomerMiddleName")
    protected String outCustomerMiddleName;
    @XmlElement(name = "OutCustomerMobileTel")
    protected String outCustomerMobileTel;
    @XmlElement(name = "OutCustomerMotherName")
    protected String outCustomerMotherName;
    @XmlElement(name = "OutCustomerMotherSurname")
    protected String outCustomerMotherSurname;
    @XmlElement(name = "OutCustomerNoAfm")
    protected String outCustomerNoAfm;
    @XmlElement(name = "OutCustomerNonRegistered")
    protected String outCustomerNonRegistered;
    @XmlElement(name = "OutCustomerNonResident")
    protected String outCustomerNonResident;
    @XmlElement(name = "OutCustomerNonResidentForRep")
    protected String outCustomerNonResidentForRep;
    @XmlElement(name = "OutCustomerNumOfChildren")
    protected short outCustomerNumOfChildren;
    @XmlElement(name = "OutCustomerPensionerInd")
    protected String outCustomerPensionerInd;
    @XmlElement(name = "OutCustomerPromocode")
    protected String outCustomerPromocode;
    @XmlElement(name = "OutCustomerSecondSurname")
    protected String outCustomerSecondSurname;
    @XmlElement(name = "OutCustomerSegmFlags")
    protected String outCustomerSegmFlags;
    @XmlElement(name = "OutCustomerSepaAgrDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outCustomerSepaAgrDt;
    @XmlElement(name = "OutCustomerSepaAgrFlg")
    protected String outCustomerSepaAgrFlg;
    @XmlElement(name = "OutCustomerSex")
    protected String outCustomerSex;
    @XmlElement(name = "OutCustomerShortName")
    protected String outCustomerShortName;
    @XmlElement(name = "OutCustomerSpmNumber")
    protected String outCustomerSpmNumber;
    @XmlElement(name = "OutCustomerSurname")
    protected String outCustomerSurname;
    @XmlElement(name = "OutCustomerTelephone1")
    protected String outCustomerTelephone1;
    @XmlElement(name = "OutCustomerTelex")
    protected String outCustomerTelex;
    @XmlElement(name = "OutCustomerTelexConnection")
    protected String outCustomerTelexConnection;
    @XmlElement(name = "OutCustomerTitle")
    protected String outCustomerTitle;
    @XmlElement(name = "OutCustomerTmstamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outCustomerTmstamp;
    @XmlElement(name = "OutCustomerVipInd")
    protected String outCustomerVipInd;
    @XmlElement(name = "OutCustStockInfoInvestorCode")
    protected int outCustStockInfoInvestorCode;
    @XmlElement(name = "OutCustStockInfoNoOfShares")
    protected int outCustStockInfoNoOfShares;
    @XmlElement(name = "OutCustStockInfoShareholderInd")
    protected String outCustStockInfoShareholderInd;
    @XmlElement(name = "OutEconomyGroupCustomerCategoryTmstamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outEconomyGroupCustomerCategoryTmstamp;
    @XmlElement(name = "OutEconomyGroupGenericDetailDescription")
    protected String outEconomyGroupGenericDetailDescription;
    @XmlElement(name = "OutEconomyGroupGenericDetailSerialNum")
    protected int outEconomyGroupGenericDetailSerialNum;
    @XmlElement(name = "OutEducationLevelCustomerCategoryTmstamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outEducationLevelCustomerCategoryTmstamp;
    @XmlElement(name = "OutEducationLevelGenericDetailDescription")
    protected String outEducationLevelGenericDetailDescription;
    @XmlElement(name = "OutEducationLevelGenericDetailSerialNum")
    protected int outEducationLevelGenericDetailSerialNum;
    @XmlElement(name = "OutEuroIdOtherIdIdNo")
    protected String outEuroIdOtherIdIdNo;
    @XmlElement(name = "OutEuroIdOtherIdIssueAuthority")
    protected String outEuroIdOtherIdIssueAuthority;
    @XmlElement(name = "OutEuroIdOtherIdIssueDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outEuroIdOtherIdIssueDate;
    @XmlElement(name = "OutEvalResultTeamInformationAuthorizationType")
    protected String outEvalResultTeamInformationAuthorizationType;
    @XmlElement(name = "OutEvalResultTeamInformationEvaluationResult")
    protected String outEvalResultTeamInformationEvaluationResult;
    @XmlElement(name = "OutEvalResultTeamInformationRequiredProfile1")
    protected String outEvalResultTeamInformationRequiredProfile1;
    @XmlElement(name = "OutEvalResultTeamInformationRequiredProfile2")
    protected String outEvalResultTeamInformationRequiredProfile2;
    @XmlElement(name = "OutFamilyStatusCustomerCategoryTmstamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outFamilyStatusCustomerCategoryTmstamp;
    @XmlElement(name = "OutFamilyStatusGenericDetailDescription")
    protected String outFamilyStatusGenericDetailDescription;
    @XmlElement(name = "OutFamilyStatusGenericDetailSerialNum")
    protected int outFamilyStatusGenericDetailSerialNum;
    @XmlElement(name = "OutGrpCustcatLength")
    protected int outGrpCustcatLength;
    @XmlElement(name = "OutGrpLogLength")
    protected int outGrpLogLength;
    @XmlElement(name = "OutGrpSameAfmLength")
    protected int outGrpSameAfmLength;
    @XmlElement(name = "OutGrpSameIdLength")
    protected int outGrpSameIdLength;
    @XmlElement(name = "OutIdCountryGenericDetailDescription")
    protected String outIdCountryGenericDetailDescription;
    @XmlElement(name = "OutIdCountryGenericDetailShortDescription")
    protected String outIdCountryGenericDetailShortDescription;
    @XmlElement(name = "OutIdOtherIdIdNo")
    protected String outIdOtherIdIdNo;
    @XmlElement(name = "OutIdOtherIdIssueAuthority")
    protected String outIdOtherIdIssueAuthority;
    @XmlElement(name = "OutIdOtherIdIssueDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outIdOtherIdIssueDate;
    @XmlElement(name = "OutIdTypeGenericDetailDescription")
    protected String outIdTypeGenericDetailDescription;
    @XmlElement(name = "OutIdTypeGenericDetailSerialNum")
    protected int outIdTypeGenericDetailSerialNum;
    @XmlElement(name = "OutIncomeLevelCustomerCategoryTmstamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outIncomeLevelCustomerCategoryTmstamp;
    @XmlElement(name = "OutIncomeLevelGenericDetailDescription")
    protected String outIncomeLevelGenericDetailDescription;
    @XmlElement(name = "OutIncomeLevelGenericDetailSerialNum")
    protected int outIncomeLevelGenericDetailSerialNum;
    @XmlElement(name = "OutKeyCustomerCDigit")
    protected short outKeyCustomerCDigit;
    @XmlElement(name = "OutKeyCustomerCustId")
    protected int outKeyCustomerCustId;
    @XmlElement(name = "OutKeyOtherCustomerCDigit")
    protected short outKeyOtherCustomerCDigit;
    @XmlElement(name = "OutKeyOtherCustomerCustId")
    protected int outKeyOtherCustomerCustId;
    @XmlElement(name = "OutMarketGenericDetailDescription")
    protected String outMarketGenericDetailDescription;
    @XmlElement(name = "OutMarketGenericDetailEntryStatus")
    protected String outMarketGenericDetailEntryStatus;
    @XmlElement(name = "OutMarketGenericDetailSerialNum")
    protected int outMarketGenericDetailSerialNum;
    @XmlElement(name = "OutMonitoringBankemployeeFirstName")
    protected String outMonitoringBankemployeeFirstName;
    @XmlElement(name = "OutMonitoringBankemployeeId")
    protected String outMonitoringBankemployeeId;
    @XmlElement(name = "OutMonitoringBankemployeeLastName")
    protected String outMonitoringBankemployeeLastName;
    @XmlElement(name = "OutMonitoringUnitCode")
    protected int outMonitoringUnitCode;
    @XmlElement(name = "OutMonitoringUnitUnitName")
    protected String outMonitoringUnitUnitName;
    @XmlElement(name = "OutNationalityCustomerCategoryTmstamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outNationalityCustomerCategoryTmstamp;
    @XmlElement(name = "OutNationalityGenericDetailDescription")
    protected String outNationalityGenericDetailDescription;
    @XmlElement(name = "OutNationalityGenericDetailSerialNum")
    protected int outNationalityGenericDetailSerialNum;
    @XmlElement(name = "OutOtherAfmAfmNo")
    protected String outOtherAfmAfmNo;
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
    @XmlElement(name = "OutOtherIdSerialNo")
    protected short outOtherIdSerialNo;
    @XmlElement(name = "OutOtherIdTmstamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outOtherIdTmstamp;
    @XmlElement(name = "OutPassportOtherIdExpiryDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outPassportOtherIdExpiryDate;
    @XmlElement(name = "OutPassportOtherIdIdNo")
    protected String outPassportOtherIdIdNo;
    @XmlElement(name = "OutPassportOtherIdIssueAuthority")
    protected String outPassportOtherIdIssueAuthority;
    @XmlElement(name = "OutPassportOtherIdIssueDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outPassportOtherIdIssueDate;
    @XmlElement(name = "OutProfessionCategoryCustomerCategoryTmstamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outProfessionCategoryCustomerCategoryTmstamp;
    @XmlElement(name = "OutProfessionCategoryGenericDetailDescription")
    protected String outProfessionCategoryGenericDetailDescription;
    @XmlElement(name = "OutProfessionCategoryGenericDetailSerialNum")
    protected int outProfessionCategoryGenericDetailSerialNum;
    @XmlElement(name = "OutProfessionCustomerCategoryTmstamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outProfessionCustomerCategoryTmstamp;
    @XmlElement(name = "OutProfessionGenericDetailDescription")
    protected String outProfessionGenericDetailDescription;
    @XmlElement(name = "OutProfessionGenericDetailSerialNum")
    protected int outProfessionGenericDetailSerialNum;
    @XmlElement(name = "OutProfessionStatusCustomerCategoryTmstamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outProfessionStatusCustomerCategoryTmstamp;
    @XmlElement(name = "OutProfessionStatusGenericDetailDescription")
    protected String outProfessionStatusGenericDetailDescription;
    @XmlElement(name = "OutProfessionStatusGenericDetailSerialNum")
    protected int outProfessionStatusGenericDetailSerialNum;
    @XmlElement(name = "OutRcountryCustomerCategoryTmstamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outRcountryCustomerCategoryTmstamp;
    @XmlElement(name = "OutRcountryGenericDetailDescription")
    protected String outRcountryGenericDetailDescription;
    @XmlElement(name = "OutRcountryGenericDetailSerialNum")
    protected int outRcountryGenericDetailSerialNum;
    @XmlElement(name = "OutRcountryGenericDetailShortDescription")
    protected String outRcountryGenericDetailShortDescription;
    @XmlElement(name = "OutRegionCustomerCategoryTmstamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outRegionCustomerCategoryTmstamp;
    @XmlElement(name = "OutRegionGenericDetailDescription")
    protected String outRegionGenericDetailDescription;
    @XmlElement(name = "OutRegionGenericDetailSerialNum")
    protected int outRegionGenericDetailSerialNum;
    @XmlElement(name = "OutResidenceCountryCustomerCategoryTmstamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outResidenceCountryCustomerCategoryTmstamp;
    @XmlElement(name = "OutResidenceCountryGenericDetailDescription")
    protected String outResidenceCountryGenericDetailDescription;
    @XmlElement(name = "OutResidenceCountryGenericDetailEntryStatus")
    protected String outResidenceCountryGenericDetailEntryStatus;
    @XmlElement(name = "OutResidenceCountryGenericDetailSerialNum")
    protected int outResidenceCountryGenericDetailSerialNum;
    @XmlElement(name = "OutResidenceCountryGenericDetailShortDescription")
    protected String outResidenceCountryGenericDetailShortDescription;
    @XmlElement(name = "OutRmBankemployeeFirstName")
    protected String outRmBankemployeeFirstName;
    @XmlElement(name = "OutRmBankemployeeLastName")
    protected String outRmBankemployeeLastName;
    @XmlElement(name = "OutRmUsrCode")
    protected String outRmUsrCode;
    @XmlElement(name = "OutSegmentGenericDetailDescription")
    protected String outSegmentGenericDetailDescription;
    @XmlElement(name = "OutSegmentGenericDetailEntryStatus")
    protected String outSegmentGenericDetailEntryStatus;
    @XmlElement(name = "OutSegmentGenericDetailSerialNum")
    protected int outSegmentGenericDetailSerialNum;
    @XmlElement(name = "OutStatusIefSuppliedActionEntry")
    protected String outStatusIefSuppliedActionEntry;
    @XmlElement(name = "OutStatusIefSuppliedSrvStatus")
    protected String outStatusIefSuppliedSrvStatus;
    @XmlElement(name = "OutSubCategoryCustomerCategoryTmstamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outSubCategoryCustomerCategoryTmstamp;
    @XmlElement(name = "OutSubCategoryGenericDetailDescription")
    protected String outSubCategoryGenericDetailDescription;
    @XmlElement(name = "OutSubCategoryGenericDetailEntryStatus")
    protected String outSubCategoryGenericDetailEntryStatus;
    @XmlElement(name = "OutSubCategoryGenericDetailSerialNum")
    protected int outSubCategoryGenericDetailSerialNum;
    @XmlElement(name = "OutSubCategoryGenericDetailShortDescription")
    protected String outSubCategoryGenericDetailShortDescription;
    @XmlElement(name = "OutTaxOfficeDomTaxOffice")
    protected String outTaxOfficeDomTaxOffice;
    @XmlElement(name = "OutTaxOfficeId")
    protected short outTaxOfficeId;
    @XmlElement(name = "OutTaxOfficeTaxOfficeName")
    protected String outTaxOfficeTaxOfficeName;
    @XmlElement(name = "OutThinkingCurrencyIdCurrency")
    protected int outThinkingCurrencyIdCurrency;
    @XmlElement(name = "OutThinkingCurrencyShortDescr")
    protected String outThinkingCurrencyShortDescr;
    @XmlElement(name = "OutTimePrintLineTime", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outTimePrintLineTime;
    @XmlElement(name = "OutWifeHusbCustomerFirstName")
    protected String outWifeHusbCustomerFirstName;
    @XmlElement(name = "OutWifeHusbCustomerSurname")
    protected String outWifeHusbCustomerSurname;
    @XmlElement(name = "OutWifeHusbOtherIdIdNo")
    protected String outWifeHusbOtherIdIdNo;
    @XmlElement(name = "OutCustomerEnableFor24c")
    protected String outCustomerEnableFor24C;
    @XmlElement(name = "OutCustomerCustOpenDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outCustomerCustOpenDate;
    @XmlElement(name = "OutGrpCustcat")
    protected ArrayOfOutGrpCustcat outGrpCustcat;
    @XmlElement(name = "OutGrpSameAfm")
    protected ArrayOfOutGrpSameAfm outGrpSameAfm;
    @XmlElement(name = "OutGrpSameId")
    protected ArrayOfOutGrpSameId outGrpSameId;
    @XmlElement(name = "OutCustAddressAccomodationDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outCustAddressAccomodationDate;
    @XmlElement(name = "OutCustAddressInternetAddress")
    protected String outCustAddressInternetAddress;
    @XmlElement(name = "OutCustAddressEMail")
    protected String outCustAddressEMail;
    @XmlElement(name = "OutCustAddressTelephone3")
    protected String outCustAddressTelephone3;
    @XmlElement(name = "OutCustAddressTelephone2")
    protected String outCustAddressTelephone2;
    @XmlElement(name = "OutCustAddressAddress6")
    protected String outCustAddressAddress6;
    @XmlElement(name = "OutCustAddressAddress5")
    protected String outCustAddressAddress5;
    @XmlElement(name = "OutCustAddressAddress4")
    protected String outCustAddressAddress4;
    @XmlElement(name = "OutCustAddressAddress3")
    protected String outCustAddressAddress3;
    @XmlElement(name = "OutCustAddressLatinInd")
    protected String outCustAddressLatinInd;
    @XmlElement(name = "OutCustAddressPtsInd")
    protected String outCustAddressPtsInd;
    @XmlElement(name = "OutCustAddressCommunicationAddress")
    protected String outCustAddressCommunicationAddress;
    @XmlElement(name = "OutCustAddressEntryStatus")
    protected String outCustAddressEntryStatus;
    @XmlElement(name = "OutCustomerOwnershipIndication")
    protected String outCustomerOwnershipIndication;
    @XmlElement(name = "OutCustomerContractExpiryDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outCustomerContractExpiryDate;
    @XmlElement(name = "OutCustomerContract")
    protected String outCustomerContract;
    @XmlElement(name = "OutCustomerMobileTel2")
    protected String outCustomerMobileTel2;
    @XmlElement(name = "OutCustomerEMail2")
    protected String outCustomerEMail2;
    @XmlElement(name = "OutEmployerCustAddressSerialNum")
    protected short outEmployerCustAddressSerialNum;
    @XmlElement(name = "OutEmployerCustAddressAddressType")
    protected String outEmployerCustAddressAddressType;
    @XmlElement(name = "OutEmployerCustAddressFaxNo")
    protected String outEmployerCustAddressFaxNo;
    @XmlElement(name = "OutEmployerCustAddressCity")
    protected String outEmployerCustAddressCity;
    @XmlElement(name = "OutEmployerCustAddressZipCode")
    protected String outEmployerCustAddressZipCode;
    @XmlElement(name = "OutEmployerCustAddressTelephone")
    protected String outEmployerCustAddressTelephone;
    @XmlElement(name = "OutEmployerCustAddressCommunicationAddress")
    protected String outEmployerCustAddressCommunicationAddress;
    @XmlElement(name = "OutEmployerCustAddressEntryStatus")
    protected String outEmployerCustAddressEntryStatus;
    @XmlElement(name = "OutEmployerCustAddressTmstamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outEmployerCustAddressTmstamp;
    @XmlElement(name = "OutEmployerCustAddressRegion")
    protected String outEmployerCustAddressRegion;
    @XmlElement(name = "OutEmployerCustAddressAddress1")
    protected String outEmployerCustAddressAddress1;
    @XmlElement(name = "OutEmployerCustAddressAddress2")
    protected String outEmployerCustAddressAddress2;
    @XmlElement(name = "OutEmployerCustAddressEntryComments")
    protected String outEmployerCustAddressEntryComments;
    @XmlElement(name = "OutEmployerCustAddressMailBox")
    protected String outEmployerCustAddressMailBox;
    @XmlElement(name = "OutEmployerCustAddressSegmFlags")
    protected String outEmployerCustAddressSegmFlags;
    @XmlElement(name = "OutEmployerCustAddressAccomodationDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outEmployerCustAddressAccomodationDate;
    @XmlElement(name = "OutEmployerCustAddressInternetAddress")
    protected String outEmployerCustAddressInternetAddress;
    @XmlElement(name = "OutEmployerCustAddressEMail")
    protected String outEmployerCustAddressEMail;
    @XmlElement(name = "OutEmployerCustAddressTelephone3")
    protected String outEmployerCustAddressTelephone3;
    @XmlElement(name = "OutEmployerCustAddressTelephone2")
    protected String outEmployerCustAddressTelephone2;
    @XmlElement(name = "OutEmployerCustAddressAddress6")
    protected String outEmployerCustAddressAddress6;
    @XmlElement(name = "OutEmployerCustAddressAddress5")
    protected String outEmployerCustAddressAddress5;
    @XmlElement(name = "OutEmployerCustAddressAddress4")
    protected String outEmployerCustAddressAddress4;
    @XmlElement(name = "OutEmployerCustAddressAddress3")
    protected String outEmployerCustAddressAddress3;
    @XmlElement(name = "OutEmployerCustAddressLatinInd")
    protected String outEmployerCustAddressLatinInd;
    @XmlElement(name = "OutEmployerCustAddressPtsInd")
    protected String outEmployerCustAddressPtsInd;
    @XmlElement(name = "OutEmployerAddressDistrictGenericDetailSerialNum")
    protected int outEmployerAddressDistrictGenericDetailSerialNum;
    @XmlElement(name = "OutEmployerAddressDistrictGenericDetailDescription")
    protected String outEmployerAddressDistrictGenericDetailDescription;
    @XmlElement(name = "OutEmployerAddressCountryGenericDetailDescription")
    protected String outEmployerAddressCountryGenericDetailDescription;
    @XmlElement(name = "OutEmployerAddressCountryGenericDetailShortDescription")
    protected String outEmployerAddressCountryGenericDetailShortDescription;
    @XmlElement(name = "OutEmployerCustAddrParrelDCode")
    protected String outEmployerCustAddrParrelDCode;
    @XmlElement(name = "OutEmployerCustAddrParrelDSn")
    protected int outEmployerCustAddrParrelDSn;
    @XmlElement(name = "OutCustAddrParrelDCode")
    protected String outCustAddrParrelDCode;
    @XmlElement(name = "OutCustAddrParrelDSn")
    protected int outCustAddrParrelDSn;
    @XmlElement(name = "OutEmployerCustAddrParrelDP01Desc")
    protected String outEmployerCustAddrParrelDP01Desc;
    @XmlElement(name = "OutEmployerCustAddrParrelDP02Desc")
    protected String outEmployerCustAddrParrelDP02Desc;
    @XmlElement(name = "OutEmployerCustAddrParrelDP03Desc")
    protected String outEmployerCustAddrParrelDP03Desc;
    @XmlElement(name = "OutEmployerCustAddrParrelDP04Desc")
    protected String outEmployerCustAddrParrelDP04Desc;
    @XmlElement(name = "OutEmployerCustAddrParrelDP05Desc")
    protected String outEmployerCustAddrParrelDP05Desc;
    @XmlElement(name = "OutEmployerCustAddrParrelDP06Desc")
    protected String outEmployerCustAddrParrelDP06Desc;
    @XmlElement(name = "OutEmployerCustAddrParrelDP07Desc")
    protected String outEmployerCustAddrParrelDP07Desc;
    @XmlElement(name = "OutEmployerCustAddrParrelDP08Desc")
    protected String outEmployerCustAddrParrelDP08Desc;
    @XmlElement(name = "OutEmployerCustAddrParrelDP09Desc")
    protected String outEmployerCustAddrParrelDP09Desc;
    @XmlElement(name = "OutEmployerCustAddrParrelDP10Desc")
    protected String outEmployerCustAddrParrelDP10Desc;
    @XmlElement(name = "OutCustAddrParrelDP01Desc")
    protected String outCustAddrParrelDP01Desc;
    @XmlElement(name = "OutCustAddrParrelDP02Desc")
    protected String outCustAddrParrelDP02Desc;
    @XmlElement(name = "OutCustAddrParrelDP03Desc")
    protected String outCustAddrParrelDP03Desc;
    @XmlElement(name = "OutCustAddrParrelDP04Desc")
    protected String outCustAddrParrelDP04Desc;
    @XmlElement(name = "OutCustAddrParrelDP05Desc")
    protected String outCustAddrParrelDP05Desc;
    @XmlElement(name = "OutCustAddrParrelDP06Desc")
    protected String outCustAddrParrelDP06Desc;
    @XmlElement(name = "OutCustAddrParrelDP07Desc")
    protected String outCustAddrParrelDP07Desc;
    @XmlElement(name = "OutCustAddrParrelDP08Desc")
    protected String outCustAddrParrelDP08Desc;
    @XmlElement(name = "OutCustAddrParrelDP09Desc")
    protected String outCustAddrParrelDP09Desc;
    @XmlElement(name = "OutCustAddrParrelDP10Desc")
    protected String outCustAddrParrelDP10Desc;
    @XmlElement(name = "OutCustomerCommunMethod")
    protected String outCustomerCommunMethod;
    @XmlElement(name = "OutCustomerCbsId")
    protected String outCustomerCbsId;
    @XmlElement(name = "OutCustomerIapplyId")
    protected String outCustomerIapplyId;
    @XmlElement(name = "OutCustomerCrmId")
    protected String outCustomerCrmId;

    /**
     * Gets the value of the out2NdCitizenshipCustomerCategoryTmstamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOut2NdCitizenshipCustomerCategoryTmstamp() {
        return out2NdCitizenshipCustomerCategoryTmstamp;
    }

    /**
     * Sets the value of the out2NdCitizenshipCustomerCategoryTmstamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOut2NdCitizenshipCustomerCategoryTmstamp(XMLGregorianCalendar value) {
        this.out2NdCitizenshipCustomerCategoryTmstamp = value;
    }

    /**
     * Gets the value of the out2NdCitizenshipGenericDetailDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOut2NdCitizenshipGenericDetailDescription() {
        return out2NdCitizenshipGenericDetailDescription;
    }

    /**
     * Sets the value of the out2NdCitizenshipGenericDetailDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOut2NdCitizenshipGenericDetailDescription(String value) {
        this.out2NdCitizenshipGenericDetailDescription = value;
    }

    /**
     * Gets the value of the out2NdCitizenshipGenericDetailSerialNum property.
     * 
     */
    public int getOut2NdCitizenshipGenericDetailSerialNum() {
        return out2NdCitizenshipGenericDetailSerialNum;
    }

    /**
     * Sets the value of the out2NdCitizenshipGenericDetailSerialNum property.
     * 
     */
    public void setOut2NdCitizenshipGenericDetailSerialNum(int value) {
        this.out2NdCitizenshipGenericDetailSerialNum = value;
    }

    /**
     * Gets the value of the out2NdProfessionCustomerCategoryTmstamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOut2NdProfessionCustomerCategoryTmstamp() {
        return out2NdProfessionCustomerCategoryTmstamp;
    }

    /**
     * Sets the value of the out2NdProfessionCustomerCategoryTmstamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOut2NdProfessionCustomerCategoryTmstamp(XMLGregorianCalendar value) {
        this.out2NdProfessionCustomerCategoryTmstamp = value;
    }

    /**
     * Gets the value of the out2NdProfessionGenericDetailDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOut2NdProfessionGenericDetailDescription() {
        return out2NdProfessionGenericDetailDescription;
    }

    /**
     * Sets the value of the out2NdProfessionGenericDetailDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOut2NdProfessionGenericDetailDescription(String value) {
        this.out2NdProfessionGenericDetailDescription = value;
    }

    /**
     * Gets the value of the out2NdProfessionGenericDetailSerialNum property.
     * 
     */
    public int getOut2NdProfessionGenericDetailSerialNum() {
        return out2NdProfessionGenericDetailSerialNum;
    }

    /**
     * Sets the value of the out2NdProfessionGenericDetailSerialNum property.
     * 
     */
    public void setOut2NdProfessionGenericDetailSerialNum(int value) {
        this.out2NdProfessionGenericDetailSerialNum = value;
    }

    /**
     * Gets the value of the outActivityCustomerCategoryTmstamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutActivityCustomerCategoryTmstamp() {
        return outActivityCustomerCategoryTmstamp;
    }

    /**
     * Sets the value of the outActivityCustomerCategoryTmstamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutActivityCustomerCategoryTmstamp(XMLGregorianCalendar value) {
        this.outActivityCustomerCategoryTmstamp = value;
    }

    /**
     * Gets the value of the outActivityGenericDetailDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutActivityGenericDetailDescription() {
        return outActivityGenericDetailDescription;
    }

    /**
     * Sets the value of the outActivityGenericDetailDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutActivityGenericDetailDescription(String value) {
        this.outActivityGenericDetailDescription = value;
    }

    /**
     * Gets the value of the outActivityGenericDetailSerialNum property.
     * 
     */
    public int getOutActivityGenericDetailSerialNum() {
        return outActivityGenericDetailSerialNum;
    }

    /**
     * Sets the value of the outActivityGenericDetailSerialNum property.
     * 
     */
    public void setOutActivityGenericDetailSerialNum(int value) {
        this.outActivityGenericDetailSerialNum = value;
    }

    /**
     * Gets the value of the outActivityTypeCustomerCategoryTmstamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutActivityTypeCustomerCategoryTmstamp() {
        return outActivityTypeCustomerCategoryTmstamp;
    }

    /**
     * Sets the value of the outActivityTypeCustomerCategoryTmstamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutActivityTypeCustomerCategoryTmstamp(XMLGregorianCalendar value) {
        this.outActivityTypeCustomerCategoryTmstamp = value;
    }

    /**
     * Gets the value of the outActivityTypeGenericDetailDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutActivityTypeGenericDetailDescription() {
        return outActivityTypeGenericDetailDescription;
    }

    /**
     * Sets the value of the outActivityTypeGenericDetailDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutActivityTypeGenericDetailDescription(String value) {
        this.outActivityTypeGenericDetailDescription = value;
    }

    /**
     * Gets the value of the outActivityTypeGenericDetailEntryStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutActivityTypeGenericDetailEntryStatus() {
        return outActivityTypeGenericDetailEntryStatus;
    }

    /**
     * Sets the value of the outActivityTypeGenericDetailEntryStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutActivityTypeGenericDetailEntryStatus(String value) {
        this.outActivityTypeGenericDetailEntryStatus = value;
    }

    /**
     * Gets the value of the outActivityTypeGenericDetailSerialNum property.
     * 
     */
    public int getOutActivityTypeGenericDetailSerialNum() {
        return outActivityTypeGenericDetailSerialNum;
    }

    /**
     * Sets the value of the outActivityTypeGenericDetailSerialNum property.
     * 
     */
    public void setOutActivityTypeGenericDetailSerialNum(int value) {
        this.outActivityTypeGenericDetailSerialNum = value;
    }

    /**
     * Gets the value of the outActivityTypeGenericDetailShortDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutActivityTypeGenericDetailShortDescription() {
        return outActivityTypeGenericDetailShortDescription;
    }

    /**
     * Sets the value of the outActivityTypeGenericDetailShortDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutActivityTypeGenericDetailShortDescription(String value) {
        this.outActivityTypeGenericDetailShortDescription = value;
    }

    /**
     * Gets the value of the outAddressCountryGenericDetailDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutAddressCountryGenericDetailDescription() {
        return outAddressCountryGenericDetailDescription;
    }

    /**
     * Sets the value of the outAddressCountryGenericDetailDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutAddressCountryGenericDetailDescription(String value) {
        this.outAddressCountryGenericDetailDescription = value;
    }

    /**
     * Gets the value of the outAddressCountryGenericDetailShortDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutAddressCountryGenericDetailShortDescription() {
        return outAddressCountryGenericDetailShortDescription;
    }

    /**
     * Sets the value of the outAddressCountryGenericDetailShortDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutAddressCountryGenericDetailShortDescription(String value) {
        this.outAddressCountryGenericDetailShortDescription = value;
    }

    /**
     * Gets the value of the outAddressDistrictGenericDetailDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutAddressDistrictGenericDetailDescription() {
        return outAddressDistrictGenericDetailDescription;
    }

    /**
     * Sets the value of the outAddressDistrictGenericDetailDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutAddressDistrictGenericDetailDescription(String value) {
        this.outAddressDistrictGenericDetailDescription = value;
    }

    /**
     * Gets the value of the outAddressDistrictGenericDetailSerialNum property.
     * 
     */
    public int getOutAddressDistrictGenericDetailSerialNum() {
        return outAddressDistrictGenericDetailSerialNum;
    }

    /**
     * Sets the value of the outAddressDistrictGenericDetailSerialNum property.
     * 
     */
    public void setOutAddressDistrictGenericDetailSerialNum(int value) {
        this.outAddressDistrictGenericDetailSerialNum = value;
    }

    /**
     * Gets the value of the outAfmIssueCountryGenericDetailDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutAfmIssueCountryGenericDetailDescription() {
        return outAfmIssueCountryGenericDetailDescription;
    }

    /**
     * Sets the value of the outAfmIssueCountryGenericDetailDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutAfmIssueCountryGenericDetailDescription(String value) {
        this.outAfmIssueCountryGenericDetailDescription = value;
    }

    /**
     * Gets the value of the outAfmIssueCountryGenericDetailSerialNum property.
     * 
     */
    public int getOutAfmIssueCountryGenericDetailSerialNum() {
        return outAfmIssueCountryGenericDetailSerialNum;
    }

    /**
     * Sets the value of the outAfmIssueCountryGenericDetailSerialNum property.
     * 
     */
    public void setOutAfmIssueCountryGenericDetailSerialNum(int value) {
        this.outAfmIssueCountryGenericDetailSerialNum = value;
    }

    /**
     * Gets the value of the outAfmIssueCountryGenericDetailShortDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutAfmIssueCountryGenericDetailShortDescription() {
        return outAfmIssueCountryGenericDetailShortDescription;
    }

    /**
     * Sets the value of the outAfmIssueCountryGenericDetailShortDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutAfmIssueCountryGenericDetailShortDescription(String value) {
        this.outAfmIssueCountryGenericDetailShortDescription = value;
    }

    /**
     * Gets the value of the outAtenetCustCardInfoCardNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutAtenetCustCardInfoCardNo() {
        return outAtenetCustCardInfoCardNo;
    }

    /**
     * Sets the value of the outAtenetCustCardInfoCardNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutAtenetCustCardInfoCardNo(String value) {
        this.outAtenetCustCardInfoCardNo = value;
    }

    /**
     * Gets the value of the outAtenetCustCardInfoEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutAtenetCustCardInfoEndDate() {
        return outAtenetCustCardInfoEndDate;
    }

    /**
     * Sets the value of the outAtenetCustCardInfoEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutAtenetCustCardInfoEndDate(XMLGregorianCalendar value) {
        this.outAtenetCustCardInfoEndDate = value;
    }

    /**
     * Gets the value of the outAtenetCustCardInfoStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutAtenetCustCardInfoStartDate() {
        return outAtenetCustCardInfoStartDate;
    }

    /**
     * Sets the value of the outAtenetCustCardInfoStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutAtenetCustCardInfoStartDate(XMLGregorianCalendar value) {
        this.outAtenetCustCardInfoStartDate = value;
    }

    /**
     * Gets the value of the outAtenetCustCardInfoTmstamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutAtenetCustCardInfoTmstamp() {
        return outAtenetCustCardInfoTmstamp;
    }

    /**
     * Sets the value of the outAtenetCustCardInfoTmstamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutAtenetCustCardInfoTmstamp(XMLGregorianCalendar value) {
        this.outAtenetCustCardInfoTmstamp = value;
    }

    /**
     * Gets the value of the outAttractionBankemployeeFirstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutAttractionBankemployeeFirstName() {
        return outAttractionBankemployeeFirstName;
    }

    /**
     * Sets the value of the outAttractionBankemployeeFirstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutAttractionBankemployeeFirstName(String value) {
        this.outAttractionBankemployeeFirstName = value;
    }

    /**
     * Gets the value of the outAttractionBankemployeeLastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutAttractionBankemployeeLastName() {
        return outAttractionBankemployeeLastName;
    }

    /**
     * Sets the value of the outAttractionBankemployeeLastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutAttractionBankemployeeLastName(String value) {
        this.outAttractionBankemployeeLastName = value;
    }

    /**
     * Gets the value of the outAttractionCustomerCategoryTmstamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutAttractionCustomerCategoryTmstamp() {
        return outAttractionCustomerCategoryTmstamp;
    }

    /**
     * Sets the value of the outAttractionCustomerCategoryTmstamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutAttractionCustomerCategoryTmstamp(XMLGregorianCalendar value) {
        this.outAttractionCustomerCategoryTmstamp = value;
    }

    /**
     * Gets the value of the outAttractionGenericDetailDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutAttractionGenericDetailDescription() {
        return outAttractionGenericDetailDescription;
    }

    /**
     * Sets the value of the outAttractionGenericDetailDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutAttractionGenericDetailDescription(String value) {
        this.outAttractionGenericDetailDescription = value;
    }

    /**
     * Gets the value of the outAttractionGenericDetailSerialNum property.
     * 
     */
    public int getOutAttractionGenericDetailSerialNum() {
        return outAttractionGenericDetailSerialNum;
    }

    /**
     * Sets the value of the outAttractionGenericDetailSerialNum property.
     * 
     */
    public void setOutAttractionGenericDetailSerialNum(int value) {
        this.outAttractionGenericDetailSerialNum = value;
    }

    /**
     * Gets the value of the outAttractionUsrCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutAttractionUsrCode() {
        return outAttractionUsrCode;
    }

    /**
     * Sets the value of the outAttractionUsrCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutAttractionUsrCode(String value) {
        this.outAttractionUsrCode = value;
    }

    /**
     * Gets the value of the outBankemployeeFirstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutBankemployeeFirstName() {
        return outBankemployeeFirstName;
    }

    /**
     * Sets the value of the outBankemployeeFirstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutBankemployeeFirstName(String value) {
        this.outBankemployeeFirstName = value;
    }

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
     * Gets the value of the outBankemployeeLastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutBankemployeeLastName() {
        return outBankemployeeLastName;
    }

    /**
     * Sets the value of the outBankemployeeLastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutBankemployeeLastName(String value) {
        this.outBankemployeeLastName = value;
    }

    /**
     * Gets the value of the outBankParametersBankParametersBankCode property.
     * 
     */
    public short getOutBankParametersBankParametersBankCode() {
        return outBankParametersBankParametersBankCode;
    }

    /**
     * Sets the value of the outBankParametersBankParametersBankCode property.
     * 
     */
    public void setOutBankParametersBankParametersBankCode(short value) {
        this.outBankParametersBankParametersBankCode = value;
    }

    /**
     * Gets the value of the outBankParametersBankParametersWordPrint property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutBankParametersBankParametersWordPrint() {
        return outBankParametersBankParametersWordPrint;
    }

    /**
     * Sets the value of the outBankParametersBankParametersWordPrint property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutBankParametersBankParametersWordPrint(String value) {
        this.outBankParametersBankParametersWordPrint = value;
    }

    /**
     * Gets the value of the outBasileiaCustomerCategoryTmstamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutBasileiaCustomerCategoryTmstamp() {
        return outBasileiaCustomerCategoryTmstamp;
    }

    /**
     * Sets the value of the outBasileiaCustomerCategoryTmstamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutBasileiaCustomerCategoryTmstamp(XMLGregorianCalendar value) {
        this.outBasileiaCustomerCategoryTmstamp = value;
    }

    /**
     * Gets the value of the outBasileiaGenericDetailDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutBasileiaGenericDetailDescription() {
        return outBasileiaGenericDetailDescription;
    }

    /**
     * Sets the value of the outBasileiaGenericDetailDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutBasileiaGenericDetailDescription(String value) {
        this.outBasileiaGenericDetailDescription = value;
    }

    /**
     * Gets the value of the outBasileiaGenericDetailEntryStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutBasileiaGenericDetailEntryStatus() {
        return outBasileiaGenericDetailEntryStatus;
    }

    /**
     * Sets the value of the outBasileiaGenericDetailEntryStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutBasileiaGenericDetailEntryStatus(String value) {
        this.outBasileiaGenericDetailEntryStatus = value;
    }

    /**
     * Gets the value of the outBasileiaGenericDetailSerialNum property.
     * 
     */
    public int getOutBasileiaGenericDetailSerialNum() {
        return outBasileiaGenericDetailSerialNum;
    }

    /**
     * Sets the value of the outBasileiaGenericDetailSerialNum property.
     * 
     */
    public void setOutBasileiaGenericDetailSerialNum(int value) {
        this.outBasileiaGenericDetailSerialNum = value;
    }

    /**
     * Gets the value of the outBasileiaGenericDetailShortDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutBasileiaGenericDetailShortDescription() {
        return outBasileiaGenericDetailShortDescription;
    }

    /**
     * Sets the value of the outBasileiaGenericDetailShortDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutBasileiaGenericDetailShortDescription(String value) {
        this.outBasileiaGenericDetailShortDescription = value;
    }

    /**
     * Gets the value of the outBirthCountryCustomerCategoryTmstamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutBirthCountryCustomerCategoryTmstamp() {
        return outBirthCountryCustomerCategoryTmstamp;
    }

    /**
     * Sets the value of the outBirthCountryCustomerCategoryTmstamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutBirthCountryCustomerCategoryTmstamp(XMLGregorianCalendar value) {
        this.outBirthCountryCustomerCategoryTmstamp = value;
    }

    /**
     * Gets the value of the outBirthCountryGenericDetailDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutBirthCountryGenericDetailDescription() {
        return outBirthCountryGenericDetailDescription;
    }

    /**
     * Sets the value of the outBirthCountryGenericDetailDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutBirthCountryGenericDetailDescription(String value) {
        this.outBirthCountryGenericDetailDescription = value;
    }

    /**
     * Gets the value of the outBirthCountryGenericDetailShortDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutBirthCountryGenericDetailShortDescription() {
        return outBirthCountryGenericDetailShortDescription;
    }

    /**
     * Sets the value of the outBirthCountryGenericDetailShortDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutBirthCountryGenericDetailShortDescription(String value) {
        this.outBirthCountryGenericDetailShortDescription = value;
    }

    /**
     * Gets the value of the outBranchPortfolioBranch property.
     * 
     */
    public int getOutBranchPortfolioBranch() {
        return outBranchPortfolioBranch;
    }

    /**
     * Sets the value of the outBranchPortfolioBranch property.
     * 
     */
    public void setOutBranchPortfolioBranch(int value) {
        this.outBranchPortfolioBranch = value;
    }

    /**
     * Gets the value of the outBranchPortfolioDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutBranchPortfolioDescription() {
        return outBranchPortfolioDescription;
    }

    /**
     * Sets the value of the outBranchPortfolioDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutBranchPortfolioDescription(String value) {
        this.outBranchPortfolioDescription = value;
    }

    /**
     * Gets the value of the outBranchPortfolioPortfolioCode property.
     * 
     */
    public int getOutBranchPortfolioPortfolioCode() {
        return outBranchPortfolioPortfolioCode;
    }

    /**
     * Sets the value of the outBranchPortfolioPortfolioCode property.
     * 
     */
    public void setOutBranchPortfolioPortfolioCode(int value) {
        this.outBranchPortfolioPortfolioCode = value;
    }

    /**
     * Gets the value of the outChamberAuthorityCustomerCategoryTmstamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutChamberAuthorityCustomerCategoryTmstamp() {
        return outChamberAuthorityCustomerCategoryTmstamp;
    }

    /**
     * Sets the value of the outChamberAuthorityCustomerCategoryTmstamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutChamberAuthorityCustomerCategoryTmstamp(XMLGregorianCalendar value) {
        this.outChamberAuthorityCustomerCategoryTmstamp = value;
    }

    /**
     * Gets the value of the outChamberAuthorityGenericDetailDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutChamberAuthorityGenericDetailDescription() {
        return outChamberAuthorityGenericDetailDescription;
    }

    /**
     * Sets the value of the outChamberAuthorityGenericDetailDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutChamberAuthorityGenericDetailDescription(String value) {
        this.outChamberAuthorityGenericDetailDescription = value;
    }

    /**
     * Gets the value of the outChamberAuthorityGenericDetailSerialNum property.
     * 
     */
    public int getOutChamberAuthorityGenericDetailSerialNum() {
        return outChamberAuthorityGenericDetailSerialNum;
    }

    /**
     * Sets the value of the outChamberAuthorityGenericDetailSerialNum property.
     * 
     */
    public void setOutChamberAuthorityGenericDetailSerialNum(int value) {
        this.outChamberAuthorityGenericDetailSerialNum = value;
    }

    /**
     * Gets the value of the outCitizenshipCustomerCategoryTmstamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutCitizenshipCustomerCategoryTmstamp() {
        return outCitizenshipCustomerCategoryTmstamp;
    }

    /**
     * Sets the value of the outCitizenshipCustomerCategoryTmstamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutCitizenshipCustomerCategoryTmstamp(XMLGregorianCalendar value) {
        this.outCitizenshipCustomerCategoryTmstamp = value;
    }

    /**
     * Gets the value of the outCitizenshipGenericDetailDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCitizenshipGenericDetailDescription() {
        return outCitizenshipGenericDetailDescription;
    }

    /**
     * Sets the value of the outCitizenshipGenericDetailDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCitizenshipGenericDetailDescription(String value) {
        this.outCitizenshipGenericDetailDescription = value;
    }

    /**
     * Gets the value of the outCitizenshipGenericDetailSerialNum property.
     * 
     */
    public int getOutCitizenshipGenericDetailSerialNum() {
        return outCitizenshipGenericDetailSerialNum;
    }

    /**
     * Sets the value of the outCitizenshipGenericDetailSerialNum property.
     * 
     */
    public void setOutCitizenshipGenericDetailSerialNum(int value) {
        this.outCitizenshipGenericDetailSerialNum = value;
    }

    /**
     * Gets the value of the outCommunicationLangCustomerCategoryTmstamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutCommunicationLangCustomerCategoryTmstamp() {
        return outCommunicationLangCustomerCategoryTmstamp;
    }

    /**
     * Sets the value of the outCommunicationLangCustomerCategoryTmstamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutCommunicationLangCustomerCategoryTmstamp(XMLGregorianCalendar value) {
        this.outCommunicationLangCustomerCategoryTmstamp = value;
    }

    /**
     * Gets the value of the outCommunicationLangGenericDetailDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCommunicationLangGenericDetailDescription() {
        return outCommunicationLangGenericDetailDescription;
    }

    /**
     * Sets the value of the outCommunicationLangGenericDetailDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCommunicationLangGenericDetailDescription(String value) {
        this.outCommunicationLangGenericDetailDescription = value;
    }

    /**
     * Gets the value of the outCommunicationLangGenericDetailSerialNum property.
     * 
     */
    public int getOutCommunicationLangGenericDetailSerialNum() {
        return outCommunicationLangGenericDetailSerialNum;
    }

    /**
     * Sets the value of the outCommunicationLangGenericDetailSerialNum property.
     * 
     */
    public void setOutCommunicationLangGenericDetailSerialNum(int value) {
        this.outCommunicationLangGenericDetailSerialNum = value;
    }

    /**
     * Gets the value of the outCompanyCategCustomerCategoryTmstamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutCompanyCategCustomerCategoryTmstamp() {
        return outCompanyCategCustomerCategoryTmstamp;
    }

    /**
     * Sets the value of the outCompanyCategCustomerCategoryTmstamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutCompanyCategCustomerCategoryTmstamp(XMLGregorianCalendar value) {
        this.outCompanyCategCustomerCategoryTmstamp = value;
    }

    /**
     * Gets the value of the outCompanyCategGenericDetailDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCompanyCategGenericDetailDescription() {
        return outCompanyCategGenericDetailDescription;
    }

    /**
     * Sets the value of the outCompanyCategGenericDetailDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCompanyCategGenericDetailDescription(String value) {
        this.outCompanyCategGenericDetailDescription = value;
    }

    /**
     * Gets the value of the outCompanyCategGenericDetailEntryStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCompanyCategGenericDetailEntryStatus() {
        return outCompanyCategGenericDetailEntryStatus;
    }

    /**
     * Sets the value of the outCompanyCategGenericDetailEntryStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCompanyCategGenericDetailEntryStatus(String value) {
        this.outCompanyCategGenericDetailEntryStatus = value;
    }

    /**
     * Gets the value of the outCompanyCategGenericDetailSerialNum property.
     * 
     */
    public int getOutCompanyCategGenericDetailSerialNum() {
        return outCompanyCategGenericDetailSerialNum;
    }

    /**
     * Sets the value of the outCompanyCategGenericDetailSerialNum property.
     * 
     */
    public void setOutCompanyCategGenericDetailSerialNum(int value) {
        this.outCompanyCategGenericDetailSerialNum = value;
    }

    /**
     * Gets the value of the outCompanyCategGenericDetailShortDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCompanyCategGenericDetailShortDescription() {
        return outCompanyCategGenericDetailShortDescription;
    }

    /**
     * Sets the value of the outCompanyCategGenericDetailShortDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCompanyCategGenericDetailShortDescription(String value) {
        this.outCompanyCategGenericDetailShortDescription = value;
    }

    /**
     * Gets the value of the outConditionsMembershipCustomerCategoryTmstamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutConditionsMembershipCustomerCategoryTmstamp() {
        return outConditionsMembershipCustomerCategoryTmstamp;
    }

    /**
     * Sets the value of the outConditionsMembershipCustomerCategoryTmstamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutConditionsMembershipCustomerCategoryTmstamp(XMLGregorianCalendar value) {
        this.outConditionsMembershipCustomerCategoryTmstamp = value;
    }

    /**
     * Gets the value of the outConditionsMembershipGenericDetailDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutConditionsMembershipGenericDetailDescription() {
        return outConditionsMembershipGenericDetailDescription;
    }

    /**
     * Sets the value of the outConditionsMembershipGenericDetailDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutConditionsMembershipGenericDetailDescription(String value) {
        this.outConditionsMembershipGenericDetailDescription = value;
    }

    /**
     * Gets the value of the outConditionsMembershipGenericDetailSerialNum property.
     * 
     */
    public int getOutConditionsMembershipGenericDetailSerialNum() {
        return outConditionsMembershipGenericDetailSerialNum;
    }

    /**
     * Sets the value of the outConditionsMembershipGenericDetailSerialNum property.
     * 
     */
    public void setOutConditionsMembershipGenericDetailSerialNum(int value) {
        this.outConditionsMembershipGenericDetailSerialNum = value;
    }

    /**
     * Gets the value of the outConditionsMembershipGenericDetailShortDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutConditionsMembershipGenericDetailShortDescription() {
        return outConditionsMembershipGenericDetailShortDescription;
    }

    /**
     * Sets the value of the outConditionsMembershipGenericDetailShortDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutConditionsMembershipGenericDetailShortDescription(String value) {
        this.outConditionsMembershipGenericDetailShortDescription = value;
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
     * Gets the value of the outCustomerAttractionDetails property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCustomerAttractionDetails() {
        return outCustomerAttractionDetails;
    }

    /**
     * Sets the value of the outCustomerAttractionDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCustomerAttractionDetails(String value) {
        this.outCustomerAttractionDetails = value;
    }

    /**
     * Gets the value of the outCustomerAttractionPerson property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCustomerAttractionPerson() {
        return outCustomerAttractionPerson;
    }

    /**
     * Sets the value of the outCustomerAttractionPerson property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCustomerAttractionPerson(String value) {
        this.outCustomerAttractionPerson = value;
    }

    /**
     * Gets the value of the outCustomerBaselDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCustomerBaselDescription() {
        return outCustomerBaselDescription;
    }

    /**
     * Sets the value of the outCustomerBaselDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCustomerBaselDescription(String value) {
        this.outCustomerBaselDescription = value;
    }

    /**
     * Gets the value of the outCustomerBaselStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCustomerBaselStatus() {
        return outCustomerBaselStatus;
    }

    /**
     * Sets the value of the outCustomerBaselStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCustomerBaselStatus(String value) {
        this.outCustomerBaselStatus = value;
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
     * Gets the value of the outCustomerBlacklistedInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCustomerBlacklistedInd() {
        return outCustomerBlacklistedInd;
    }

    /**
     * Sets the value of the outCustomerBlacklistedInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCustomerBlacklistedInd(String value) {
        this.outCustomerBlacklistedInd = value;
    }

    /**
     * Gets the value of the outCustomerBusinessInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCustomerBusinessInd() {
        return outCustomerBusinessInd;
    }

    /**
     * Sets the value of the outCustomerBusinessInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCustomerBusinessInd(String value) {
        this.outCustomerBusinessInd = value;
    }

    /**
     * Gets the value of the outCustomerCertificCust property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCustomerCertificCust() {
        return outCustomerCertificCust;
    }

    /**
     * Sets the value of the outCustomerCertificCust property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCustomerCertificCust(String value) {
        this.outCustomerCertificCust = value;
    }

    /**
     * Gets the value of the outCustomerCertificDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutCustomerCertificDate() {
        return outCustomerCertificDate;
    }

    /**
     * Sets the value of the outCustomerCertificDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutCustomerCertificDate(XMLGregorianCalendar value) {
        this.outCustomerCertificDate = value;
    }

    /**
     * Gets the value of the outCustomerChamberComments property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCustomerChamberComments() {
        return outCustomerChamberComments;
    }

    /**
     * Sets the value of the outCustomerChamberComments property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCustomerChamberComments(String value) {
        this.outCustomerChamberComments = value;
    }

    /**
     * Gets the value of the outCustomerChamberId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCustomerChamberId() {
        return outCustomerChamberId;
    }

    /**
     * Sets the value of the outCustomerChamberId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCustomerChamberId(String value) {
        this.outCustomerChamberId = value;
    }

    /**
     * Gets the value of the outCustomerChildrenAbove18 property.
     * 
     */
    public short getOutCustomerChildrenAbove18() {
        return outCustomerChildrenAbove18;
    }

    /**
     * Sets the value of the outCustomerChildrenAbove18 property.
     * 
     */
    public void setOutCustomerChildrenAbove18(short value) {
        this.outCustomerChildrenAbove18 = value;
    }

    /**
     * Gets the value of the outCustomerConsolidStatmFlg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCustomerConsolidStatmFlg() {
        return outCustomerConsolidStatmFlg;
    }

    /**
     * Sets the value of the outCustomerConsolidStatmFlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCustomerConsolidStatmFlg(String value) {
        this.outCustomerConsolidStatmFlg = value;
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
     * Gets the value of the outCustomerCustStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCustomerCustStatus() {
        return outCustomerCustStatus;
    }

    /**
     * Sets the value of the outCustomerCustStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCustomerCustStatus(String value) {
        this.outCustomerCustStatus = value;
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
     * Gets the value of the outCustomerDaiNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCustomerDaiNumber() {
        return outCustomerDaiNumber;
    }

    /**
     * Sets the value of the outCustomerDaiNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCustomerDaiNumber(String value) {
        this.outCustomerDaiNumber = value;
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
     * Gets the value of the outCustomerEmployementStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutCustomerEmployementStartDate() {
        return outCustomerEmployementStartDate;
    }

    /**
     * Sets the value of the outCustomerEmployementStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutCustomerEmployementStartDate(XMLGregorianCalendar value) {
        this.outCustomerEmployementStartDate = value;
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
     * Gets the value of the outCustomerEmployerAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCustomerEmployerAddress() {
        return outCustomerEmployerAddress;
    }

    /**
     * Sets the value of the outCustomerEmployerAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCustomerEmployerAddress(String value) {
        this.outCustomerEmployerAddress = value;
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
     * Gets the value of the outCustomerFamilyMembers property.
     * 
     */
    public short getOutCustomerFamilyMembers() {
        return outCustomerFamilyMembers;
    }

    /**
     * Sets the value of the outCustomerFamilyMembers property.
     * 
     */
    public void setOutCustomerFamilyMembers(short value) {
        this.outCustomerFamilyMembers = value;
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
     * Gets the value of the outCustomerFatherSurname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCustomerFatherSurname() {
        return outCustomerFatherSurname;
    }

    /**
     * Sets the value of the outCustomerFatherSurname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCustomerFatherSurname(String value) {
        this.outCustomerFatherSurname = value;
    }

    /**
     * Gets the value of the outCustomerFicliCode property.
     * 
     */
    public int getOutCustomerFicliCode() {
        return outCustomerFicliCode;
    }

    /**
     * Sets the value of the outCustomerFicliCode property.
     * 
     */
    public void setOutCustomerFicliCode(int value) {
        this.outCustomerFicliCode = value;
    }

    /**
     * Gets the value of the outCustomerFicliDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCustomerFicliDesc() {
        return outCustomerFicliDesc;
    }

    /**
     * Sets the value of the outCustomerFicliDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCustomerFicliDesc(String value) {
        this.outCustomerFicliDesc = value;
    }

    /**
     * Gets the value of the outCustomerFinRange property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutCustomerFinRange() {
        return outCustomerFinRange;
    }

    /**
     * Sets the value of the outCustomerFinRange property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutCustomerFinRange(BigDecimal value) {
        this.outCustomerFinRange = value;
    }

    /**
     * Gets the value of the outCustomerFinRangeDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutCustomerFinRangeDt() {
        return outCustomerFinRangeDt;
    }

    /**
     * Sets the value of the outCustomerFinRangeDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutCustomerFinRangeDt(XMLGregorianCalendar value) {
        this.outCustomerFinRangeDt = value;
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
     * Gets the value of the outCustomerIncompleteUComnt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCustomerIncompleteUComnt() {
        return outCustomerIncompleteUComnt;
    }

    /**
     * Sets the value of the outCustomerIncompleteUComnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCustomerIncompleteUComnt(String value) {
        this.outCustomerIncompleteUComnt = value;
    }

    /**
     * Gets the value of the outCustomerInternetAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCustomerInternetAddress() {
        return outCustomerInternetAddress;
    }

    /**
     * Sets the value of the outCustomerInternetAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCustomerInternetAddress(String value) {
        this.outCustomerInternetAddress = value;
    }

    /**
     * Gets the value of the outCustomerLastUpdate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutCustomerLastUpdate() {
        return outCustomerLastUpdate;
    }

    /**
     * Sets the value of the outCustomerLastUpdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutCustomerLastUpdate(XMLGregorianCalendar value) {
        this.outCustomerLastUpdate = value;
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
     * Gets the value of the outCustomerMailInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCustomerMailInd() {
        return outCustomerMailInd;
    }

    /**
     * Sets the value of the outCustomerMailInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCustomerMailInd(String value) {
        this.outCustomerMailInd = value;
    }

    /**
     * Gets the value of the outCustomerMajorBeneficiary property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCustomerMajorBeneficiary() {
        return outCustomerMajorBeneficiary;
    }

    /**
     * Sets the value of the outCustomerMajorBeneficiary property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCustomerMajorBeneficiary(String value) {
        this.outCustomerMajorBeneficiary = value;
    }

    /**
     * Gets the value of the outCustomerMarketingReminder property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCustomerMarketingReminder() {
        return outCustomerMarketingReminder;
    }

    /**
     * Sets the value of the outCustomerMarketingReminder property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCustomerMarketingReminder(String value) {
        this.outCustomerMarketingReminder = value;
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
     * Gets the value of the outCustomerMotherSurname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCustomerMotherSurname() {
        return outCustomerMotherSurname;
    }

    /**
     * Sets the value of the outCustomerMotherSurname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCustomerMotherSurname(String value) {
        this.outCustomerMotherSurname = value;
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
     * Gets the value of the outCustomerNonRegistered property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCustomerNonRegistered() {
        return outCustomerNonRegistered;
    }

    /**
     * Sets the value of the outCustomerNonRegistered property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCustomerNonRegistered(String value) {
        this.outCustomerNonRegistered = value;
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
     * Gets the value of the outCustomerNumOfChildren property.
     * 
     */
    public short getOutCustomerNumOfChildren() {
        return outCustomerNumOfChildren;
    }

    /**
     * Sets the value of the outCustomerNumOfChildren property.
     * 
     */
    public void setOutCustomerNumOfChildren(short value) {
        this.outCustomerNumOfChildren = value;
    }

    /**
     * Gets the value of the outCustomerPensionerInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCustomerPensionerInd() {
        return outCustomerPensionerInd;
    }

    /**
     * Sets the value of the outCustomerPensionerInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCustomerPensionerInd(String value) {
        this.outCustomerPensionerInd = value;
    }

    /**
     * Gets the value of the outCustomerPromocode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCustomerPromocode() {
        return outCustomerPromocode;
    }

    /**
     * Sets the value of the outCustomerPromocode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCustomerPromocode(String value) {
        this.outCustomerPromocode = value;
    }

    /**
     * Gets the value of the outCustomerSecondSurname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCustomerSecondSurname() {
        return outCustomerSecondSurname;
    }

    /**
     * Sets the value of the outCustomerSecondSurname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCustomerSecondSurname(String value) {
        this.outCustomerSecondSurname = value;
    }

    /**
     * Gets the value of the outCustomerSegmFlags property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCustomerSegmFlags() {
        return outCustomerSegmFlags;
    }

    /**
     * Sets the value of the outCustomerSegmFlags property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCustomerSegmFlags(String value) {
        this.outCustomerSegmFlags = value;
    }

    /**
     * Gets the value of the outCustomerSepaAgrDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutCustomerSepaAgrDt() {
        return outCustomerSepaAgrDt;
    }

    /**
     * Sets the value of the outCustomerSepaAgrDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutCustomerSepaAgrDt(XMLGregorianCalendar value) {
        this.outCustomerSepaAgrDt = value;
    }

    /**
     * Gets the value of the outCustomerSepaAgrFlg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCustomerSepaAgrFlg() {
        return outCustomerSepaAgrFlg;
    }

    /**
     * Sets the value of the outCustomerSepaAgrFlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCustomerSepaAgrFlg(String value) {
        this.outCustomerSepaAgrFlg = value;
    }

    /**
     * Gets the value of the outCustomerSex property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCustomerSex() {
        return outCustomerSex;
    }

    /**
     * Sets the value of the outCustomerSex property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCustomerSex(String value) {
        this.outCustomerSex = value;
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
     * Gets the value of the outCustomerSpmNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCustomerSpmNumber() {
        return outCustomerSpmNumber;
    }

    /**
     * Sets the value of the outCustomerSpmNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCustomerSpmNumber(String value) {
        this.outCustomerSpmNumber = value;
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
     * Gets the value of the outCustomerTelex property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCustomerTelex() {
        return outCustomerTelex;
    }

    /**
     * Sets the value of the outCustomerTelex property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCustomerTelex(String value) {
        this.outCustomerTelex = value;
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
     * Gets the value of the outCustomerTmstamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutCustomerTmstamp() {
        return outCustomerTmstamp;
    }

    /**
     * Sets the value of the outCustomerTmstamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutCustomerTmstamp(XMLGregorianCalendar value) {
        this.outCustomerTmstamp = value;
    }

    /**
     * Gets the value of the outCustomerVipInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCustomerVipInd() {
        return outCustomerVipInd;
    }

    /**
     * Sets the value of the outCustomerVipInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCustomerVipInd(String value) {
        this.outCustomerVipInd = value;
    }

    /**
     * Gets the value of the outCustStockInfoInvestorCode property.
     * 
     */
    public int getOutCustStockInfoInvestorCode() {
        return outCustStockInfoInvestorCode;
    }

    /**
     * Sets the value of the outCustStockInfoInvestorCode property.
     * 
     */
    public void setOutCustStockInfoInvestorCode(int value) {
        this.outCustStockInfoInvestorCode = value;
    }

    /**
     * Gets the value of the outCustStockInfoNoOfShares property.
     * 
     */
    public int getOutCustStockInfoNoOfShares() {
        return outCustStockInfoNoOfShares;
    }

    /**
     * Sets the value of the outCustStockInfoNoOfShares property.
     * 
     */
    public void setOutCustStockInfoNoOfShares(int value) {
        this.outCustStockInfoNoOfShares = value;
    }

    /**
     * Gets the value of the outCustStockInfoShareholderInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCustStockInfoShareholderInd() {
        return outCustStockInfoShareholderInd;
    }

    /**
     * Sets the value of the outCustStockInfoShareholderInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCustStockInfoShareholderInd(String value) {
        this.outCustStockInfoShareholderInd = value;
    }

    /**
     * Gets the value of the outEconomyGroupCustomerCategoryTmstamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutEconomyGroupCustomerCategoryTmstamp() {
        return outEconomyGroupCustomerCategoryTmstamp;
    }

    /**
     * Sets the value of the outEconomyGroupCustomerCategoryTmstamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutEconomyGroupCustomerCategoryTmstamp(XMLGregorianCalendar value) {
        this.outEconomyGroupCustomerCategoryTmstamp = value;
    }

    /**
     * Gets the value of the outEconomyGroupGenericDetailDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutEconomyGroupGenericDetailDescription() {
        return outEconomyGroupGenericDetailDescription;
    }

    /**
     * Sets the value of the outEconomyGroupGenericDetailDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutEconomyGroupGenericDetailDescription(String value) {
        this.outEconomyGroupGenericDetailDescription = value;
    }

    /**
     * Gets the value of the outEconomyGroupGenericDetailSerialNum property.
     * 
     */
    public int getOutEconomyGroupGenericDetailSerialNum() {
        return outEconomyGroupGenericDetailSerialNum;
    }

    /**
     * Sets the value of the outEconomyGroupGenericDetailSerialNum property.
     * 
     */
    public void setOutEconomyGroupGenericDetailSerialNum(int value) {
        this.outEconomyGroupGenericDetailSerialNum = value;
    }

    /**
     * Gets the value of the outEducationLevelCustomerCategoryTmstamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutEducationLevelCustomerCategoryTmstamp() {
        return outEducationLevelCustomerCategoryTmstamp;
    }

    /**
     * Sets the value of the outEducationLevelCustomerCategoryTmstamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutEducationLevelCustomerCategoryTmstamp(XMLGregorianCalendar value) {
        this.outEducationLevelCustomerCategoryTmstamp = value;
    }

    /**
     * Gets the value of the outEducationLevelGenericDetailDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutEducationLevelGenericDetailDescription() {
        return outEducationLevelGenericDetailDescription;
    }

    /**
     * Sets the value of the outEducationLevelGenericDetailDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutEducationLevelGenericDetailDescription(String value) {
        this.outEducationLevelGenericDetailDescription = value;
    }

    /**
     * Gets the value of the outEducationLevelGenericDetailSerialNum property.
     * 
     */
    public int getOutEducationLevelGenericDetailSerialNum() {
        return outEducationLevelGenericDetailSerialNum;
    }

    /**
     * Sets the value of the outEducationLevelGenericDetailSerialNum property.
     * 
     */
    public void setOutEducationLevelGenericDetailSerialNum(int value) {
        this.outEducationLevelGenericDetailSerialNum = value;
    }

    /**
     * Gets the value of the outEuroIdOtherIdIdNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutEuroIdOtherIdIdNo() {
        return outEuroIdOtherIdIdNo;
    }

    /**
     * Sets the value of the outEuroIdOtherIdIdNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutEuroIdOtherIdIdNo(String value) {
        this.outEuroIdOtherIdIdNo = value;
    }

    /**
     * Gets the value of the outEuroIdOtherIdIssueAuthority property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutEuroIdOtherIdIssueAuthority() {
        return outEuroIdOtherIdIssueAuthority;
    }

    /**
     * Sets the value of the outEuroIdOtherIdIssueAuthority property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutEuroIdOtherIdIssueAuthority(String value) {
        this.outEuroIdOtherIdIssueAuthority = value;
    }

    /**
     * Gets the value of the outEuroIdOtherIdIssueDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutEuroIdOtherIdIssueDate() {
        return outEuroIdOtherIdIssueDate;
    }

    /**
     * Sets the value of the outEuroIdOtherIdIssueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutEuroIdOtherIdIssueDate(XMLGregorianCalendar value) {
        this.outEuroIdOtherIdIssueDate = value;
    }

    /**
     * Gets the value of the outEvalResultTeamInformationAuthorizationType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutEvalResultTeamInformationAuthorizationType() {
        return outEvalResultTeamInformationAuthorizationType;
    }

    /**
     * Sets the value of the outEvalResultTeamInformationAuthorizationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutEvalResultTeamInformationAuthorizationType(String value) {
        this.outEvalResultTeamInformationAuthorizationType = value;
    }

    /**
     * Gets the value of the outEvalResultTeamInformationEvaluationResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutEvalResultTeamInformationEvaluationResult() {
        return outEvalResultTeamInformationEvaluationResult;
    }

    /**
     * Sets the value of the outEvalResultTeamInformationEvaluationResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutEvalResultTeamInformationEvaluationResult(String value) {
        this.outEvalResultTeamInformationEvaluationResult = value;
    }

    /**
     * Gets the value of the outEvalResultTeamInformationRequiredProfile1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutEvalResultTeamInformationRequiredProfile1() {
        return outEvalResultTeamInformationRequiredProfile1;
    }

    /**
     * Sets the value of the outEvalResultTeamInformationRequiredProfile1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutEvalResultTeamInformationRequiredProfile1(String value) {
        this.outEvalResultTeamInformationRequiredProfile1 = value;
    }

    /**
     * Gets the value of the outEvalResultTeamInformationRequiredProfile2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutEvalResultTeamInformationRequiredProfile2() {
        return outEvalResultTeamInformationRequiredProfile2;
    }

    /**
     * Sets the value of the outEvalResultTeamInformationRequiredProfile2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutEvalResultTeamInformationRequiredProfile2(String value) {
        this.outEvalResultTeamInformationRequiredProfile2 = value;
    }

    /**
     * Gets the value of the outFamilyStatusCustomerCategoryTmstamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutFamilyStatusCustomerCategoryTmstamp() {
        return outFamilyStatusCustomerCategoryTmstamp;
    }

    /**
     * Sets the value of the outFamilyStatusCustomerCategoryTmstamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutFamilyStatusCustomerCategoryTmstamp(XMLGregorianCalendar value) {
        this.outFamilyStatusCustomerCategoryTmstamp = value;
    }

    /**
     * Gets the value of the outFamilyStatusGenericDetailDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutFamilyStatusGenericDetailDescription() {
        return outFamilyStatusGenericDetailDescription;
    }

    /**
     * Sets the value of the outFamilyStatusGenericDetailDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutFamilyStatusGenericDetailDescription(String value) {
        this.outFamilyStatusGenericDetailDescription = value;
    }

    /**
     * Gets the value of the outFamilyStatusGenericDetailSerialNum property.
     * 
     */
    public int getOutFamilyStatusGenericDetailSerialNum() {
        return outFamilyStatusGenericDetailSerialNum;
    }

    /**
     * Sets the value of the outFamilyStatusGenericDetailSerialNum property.
     * 
     */
    public void setOutFamilyStatusGenericDetailSerialNum(int value) {
        this.outFamilyStatusGenericDetailSerialNum = value;
    }

    /**
     * Gets the value of the outGrpCustcatLength property.
     * 
     */
    public int getOutGrpCustcatLength() {
        return outGrpCustcatLength;
    }

    /**
     * Sets the value of the outGrpCustcatLength property.
     * 
     */
    public void setOutGrpCustcatLength(int value) {
        this.outGrpCustcatLength = value;
    }

    /**
     * Gets the value of the outGrpLogLength property.
     * 
     */
    public int getOutGrpLogLength() {
        return outGrpLogLength;
    }

    /**
     * Sets the value of the outGrpLogLength property.
     * 
     */
    public void setOutGrpLogLength(int value) {
        this.outGrpLogLength = value;
    }

    /**
     * Gets the value of the outGrpSameAfmLength property.
     * 
     */
    public int getOutGrpSameAfmLength() {
        return outGrpSameAfmLength;
    }

    /**
     * Sets the value of the outGrpSameAfmLength property.
     * 
     */
    public void setOutGrpSameAfmLength(int value) {
        this.outGrpSameAfmLength = value;
    }

    /**
     * Gets the value of the outGrpSameIdLength property.
     * 
     */
    public int getOutGrpSameIdLength() {
        return outGrpSameIdLength;
    }

    /**
     * Sets the value of the outGrpSameIdLength property.
     * 
     */
    public void setOutGrpSameIdLength(int value) {
        this.outGrpSameIdLength = value;
    }

    /**
     * Gets the value of the outIdCountryGenericDetailDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutIdCountryGenericDetailDescription() {
        return outIdCountryGenericDetailDescription;
    }

    /**
     * Sets the value of the outIdCountryGenericDetailDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutIdCountryGenericDetailDescription(String value) {
        this.outIdCountryGenericDetailDescription = value;
    }

    /**
     * Gets the value of the outIdCountryGenericDetailShortDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutIdCountryGenericDetailShortDescription() {
        return outIdCountryGenericDetailShortDescription;
    }

    /**
     * Sets the value of the outIdCountryGenericDetailShortDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutIdCountryGenericDetailShortDescription(String value) {
        this.outIdCountryGenericDetailShortDescription = value;
    }

    /**
     * Gets the value of the outIdOtherIdIdNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutIdOtherIdIdNo() {
        return outIdOtherIdIdNo;
    }

    /**
     * Sets the value of the outIdOtherIdIdNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutIdOtherIdIdNo(String value) {
        this.outIdOtherIdIdNo = value;
    }

    /**
     * Gets the value of the outIdOtherIdIssueAuthority property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutIdOtherIdIssueAuthority() {
        return outIdOtherIdIssueAuthority;
    }

    /**
     * Sets the value of the outIdOtherIdIssueAuthority property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutIdOtherIdIssueAuthority(String value) {
        this.outIdOtherIdIssueAuthority = value;
    }

    /**
     * Gets the value of the outIdOtherIdIssueDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutIdOtherIdIssueDate() {
        return outIdOtherIdIssueDate;
    }

    /**
     * Sets the value of the outIdOtherIdIssueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutIdOtherIdIssueDate(XMLGregorianCalendar value) {
        this.outIdOtherIdIssueDate = value;
    }

    /**
     * Gets the value of the outIdTypeGenericDetailDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutIdTypeGenericDetailDescription() {
        return outIdTypeGenericDetailDescription;
    }

    /**
     * Sets the value of the outIdTypeGenericDetailDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutIdTypeGenericDetailDescription(String value) {
        this.outIdTypeGenericDetailDescription = value;
    }

    /**
     * Gets the value of the outIdTypeGenericDetailSerialNum property.
     * 
     */
    public int getOutIdTypeGenericDetailSerialNum() {
        return outIdTypeGenericDetailSerialNum;
    }

    /**
     * Sets the value of the outIdTypeGenericDetailSerialNum property.
     * 
     */
    public void setOutIdTypeGenericDetailSerialNum(int value) {
        this.outIdTypeGenericDetailSerialNum = value;
    }

    /**
     * Gets the value of the outIncomeLevelCustomerCategoryTmstamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutIncomeLevelCustomerCategoryTmstamp() {
        return outIncomeLevelCustomerCategoryTmstamp;
    }

    /**
     * Sets the value of the outIncomeLevelCustomerCategoryTmstamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutIncomeLevelCustomerCategoryTmstamp(XMLGregorianCalendar value) {
        this.outIncomeLevelCustomerCategoryTmstamp = value;
    }

    /**
     * Gets the value of the outIncomeLevelGenericDetailDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutIncomeLevelGenericDetailDescription() {
        return outIncomeLevelGenericDetailDescription;
    }

    /**
     * Sets the value of the outIncomeLevelGenericDetailDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutIncomeLevelGenericDetailDescription(String value) {
        this.outIncomeLevelGenericDetailDescription = value;
    }

    /**
     * Gets the value of the outIncomeLevelGenericDetailSerialNum property.
     * 
     */
    public int getOutIncomeLevelGenericDetailSerialNum() {
        return outIncomeLevelGenericDetailSerialNum;
    }

    /**
     * Sets the value of the outIncomeLevelGenericDetailSerialNum property.
     * 
     */
    public void setOutIncomeLevelGenericDetailSerialNum(int value) {
        this.outIncomeLevelGenericDetailSerialNum = value;
    }

    /**
     * Gets the value of the outKeyCustomerCDigit property.
     * 
     */
    public short getOutKeyCustomerCDigit() {
        return outKeyCustomerCDigit;
    }

    /**
     * Sets the value of the outKeyCustomerCDigit property.
     * 
     */
    public void setOutKeyCustomerCDigit(short value) {
        this.outKeyCustomerCDigit = value;
    }

    /**
     * Gets the value of the outKeyCustomerCustId property.
     * 
     */
    public int getOutKeyCustomerCustId() {
        return outKeyCustomerCustId;
    }

    /**
     * Sets the value of the outKeyCustomerCustId property.
     * 
     */
    public void setOutKeyCustomerCustId(int value) {
        this.outKeyCustomerCustId = value;
    }

    /**
     * Gets the value of the outKeyOtherCustomerCDigit property.
     * 
     */
    public short getOutKeyOtherCustomerCDigit() {
        return outKeyOtherCustomerCDigit;
    }

    /**
     * Sets the value of the outKeyOtherCustomerCDigit property.
     * 
     */
    public void setOutKeyOtherCustomerCDigit(short value) {
        this.outKeyOtherCustomerCDigit = value;
    }

    /**
     * Gets the value of the outKeyOtherCustomerCustId property.
     * 
     */
    public int getOutKeyOtherCustomerCustId() {
        return outKeyOtherCustomerCustId;
    }

    /**
     * Sets the value of the outKeyOtherCustomerCustId property.
     * 
     */
    public void setOutKeyOtherCustomerCustId(int value) {
        this.outKeyOtherCustomerCustId = value;
    }

    /**
     * Gets the value of the outMarketGenericDetailDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutMarketGenericDetailDescription() {
        return outMarketGenericDetailDescription;
    }

    /**
     * Sets the value of the outMarketGenericDetailDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutMarketGenericDetailDescription(String value) {
        this.outMarketGenericDetailDescription = value;
    }

    /**
     * Gets the value of the outMarketGenericDetailEntryStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutMarketGenericDetailEntryStatus() {
        return outMarketGenericDetailEntryStatus;
    }

    /**
     * Sets the value of the outMarketGenericDetailEntryStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutMarketGenericDetailEntryStatus(String value) {
        this.outMarketGenericDetailEntryStatus = value;
    }

    /**
     * Gets the value of the outMarketGenericDetailSerialNum property.
     * 
     */
    public int getOutMarketGenericDetailSerialNum() {
        return outMarketGenericDetailSerialNum;
    }

    /**
     * Sets the value of the outMarketGenericDetailSerialNum property.
     * 
     */
    public void setOutMarketGenericDetailSerialNum(int value) {
        this.outMarketGenericDetailSerialNum = value;
    }

    /**
     * Gets the value of the outMonitoringBankemployeeFirstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutMonitoringBankemployeeFirstName() {
        return outMonitoringBankemployeeFirstName;
    }

    /**
     * Sets the value of the outMonitoringBankemployeeFirstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutMonitoringBankemployeeFirstName(String value) {
        this.outMonitoringBankemployeeFirstName = value;
    }

    /**
     * Gets the value of the outMonitoringBankemployeeId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutMonitoringBankemployeeId() {
        return outMonitoringBankemployeeId;
    }

    /**
     * Sets the value of the outMonitoringBankemployeeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutMonitoringBankemployeeId(String value) {
        this.outMonitoringBankemployeeId = value;
    }

    /**
     * Gets the value of the outMonitoringBankemployeeLastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutMonitoringBankemployeeLastName() {
        return outMonitoringBankemployeeLastName;
    }

    /**
     * Sets the value of the outMonitoringBankemployeeLastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutMonitoringBankemployeeLastName(String value) {
        this.outMonitoringBankemployeeLastName = value;
    }

    /**
     * Gets the value of the outMonitoringUnitCode property.
     * 
     */
    public int getOutMonitoringUnitCode() {
        return outMonitoringUnitCode;
    }

    /**
     * Sets the value of the outMonitoringUnitCode property.
     * 
     */
    public void setOutMonitoringUnitCode(int value) {
        this.outMonitoringUnitCode = value;
    }

    /**
     * Gets the value of the outMonitoringUnitUnitName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutMonitoringUnitUnitName() {
        return outMonitoringUnitUnitName;
    }

    /**
     * Sets the value of the outMonitoringUnitUnitName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutMonitoringUnitUnitName(String value) {
        this.outMonitoringUnitUnitName = value;
    }

    /**
     * Gets the value of the outNationalityCustomerCategoryTmstamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutNationalityCustomerCategoryTmstamp() {
        return outNationalityCustomerCategoryTmstamp;
    }

    /**
     * Sets the value of the outNationalityCustomerCategoryTmstamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutNationalityCustomerCategoryTmstamp(XMLGregorianCalendar value) {
        this.outNationalityCustomerCategoryTmstamp = value;
    }

    /**
     * Gets the value of the outNationalityGenericDetailDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutNationalityGenericDetailDescription() {
        return outNationalityGenericDetailDescription;
    }

    /**
     * Sets the value of the outNationalityGenericDetailDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutNationalityGenericDetailDescription(String value) {
        this.outNationalityGenericDetailDescription = value;
    }

    /**
     * Gets the value of the outNationalityGenericDetailSerialNum property.
     * 
     */
    public int getOutNationalityGenericDetailSerialNum() {
        return outNationalityGenericDetailSerialNum;
    }

    /**
     * Sets the value of the outNationalityGenericDetailSerialNum property.
     * 
     */
    public void setOutNationalityGenericDetailSerialNum(int value) {
        this.outNationalityGenericDetailSerialNum = value;
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
     * Gets the value of the outPassportOtherIdExpiryDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutPassportOtherIdExpiryDate() {
        return outPassportOtherIdExpiryDate;
    }

    /**
     * Sets the value of the outPassportOtherIdExpiryDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutPassportOtherIdExpiryDate(XMLGregorianCalendar value) {
        this.outPassportOtherIdExpiryDate = value;
    }

    /**
     * Gets the value of the outPassportOtherIdIdNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutPassportOtherIdIdNo() {
        return outPassportOtherIdIdNo;
    }

    /**
     * Sets the value of the outPassportOtherIdIdNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutPassportOtherIdIdNo(String value) {
        this.outPassportOtherIdIdNo = value;
    }

    /**
     * Gets the value of the outPassportOtherIdIssueAuthority property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutPassportOtherIdIssueAuthority() {
        return outPassportOtherIdIssueAuthority;
    }

    /**
     * Sets the value of the outPassportOtherIdIssueAuthority property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutPassportOtherIdIssueAuthority(String value) {
        this.outPassportOtherIdIssueAuthority = value;
    }

    /**
     * Gets the value of the outPassportOtherIdIssueDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutPassportOtherIdIssueDate() {
        return outPassportOtherIdIssueDate;
    }

    /**
     * Sets the value of the outPassportOtherIdIssueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutPassportOtherIdIssueDate(XMLGregorianCalendar value) {
        this.outPassportOtherIdIssueDate = value;
    }

    /**
     * Gets the value of the outProfessionCategoryCustomerCategoryTmstamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutProfessionCategoryCustomerCategoryTmstamp() {
        return outProfessionCategoryCustomerCategoryTmstamp;
    }

    /**
     * Sets the value of the outProfessionCategoryCustomerCategoryTmstamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutProfessionCategoryCustomerCategoryTmstamp(XMLGregorianCalendar value) {
        this.outProfessionCategoryCustomerCategoryTmstamp = value;
    }

    /**
     * Gets the value of the outProfessionCategoryGenericDetailDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutProfessionCategoryGenericDetailDescription() {
        return outProfessionCategoryGenericDetailDescription;
    }

    /**
     * Sets the value of the outProfessionCategoryGenericDetailDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutProfessionCategoryGenericDetailDescription(String value) {
        this.outProfessionCategoryGenericDetailDescription = value;
    }

    /**
     * Gets the value of the outProfessionCategoryGenericDetailSerialNum property.
     * 
     */
    public int getOutProfessionCategoryGenericDetailSerialNum() {
        return outProfessionCategoryGenericDetailSerialNum;
    }

    /**
     * Sets the value of the outProfessionCategoryGenericDetailSerialNum property.
     * 
     */
    public void setOutProfessionCategoryGenericDetailSerialNum(int value) {
        this.outProfessionCategoryGenericDetailSerialNum = value;
    }

    /**
     * Gets the value of the outProfessionCustomerCategoryTmstamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutProfessionCustomerCategoryTmstamp() {
        return outProfessionCustomerCategoryTmstamp;
    }

    /**
     * Sets the value of the outProfessionCustomerCategoryTmstamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutProfessionCustomerCategoryTmstamp(XMLGregorianCalendar value) {
        this.outProfessionCustomerCategoryTmstamp = value;
    }

    /**
     * Gets the value of the outProfessionGenericDetailDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutProfessionGenericDetailDescription() {
        return outProfessionGenericDetailDescription;
    }

    /**
     * Sets the value of the outProfessionGenericDetailDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutProfessionGenericDetailDescription(String value) {
        this.outProfessionGenericDetailDescription = value;
    }

    /**
     * Gets the value of the outProfessionGenericDetailSerialNum property.
     * 
     */
    public int getOutProfessionGenericDetailSerialNum() {
        return outProfessionGenericDetailSerialNum;
    }

    /**
     * Sets the value of the outProfessionGenericDetailSerialNum property.
     * 
     */
    public void setOutProfessionGenericDetailSerialNum(int value) {
        this.outProfessionGenericDetailSerialNum = value;
    }

    /**
     * Gets the value of the outProfessionStatusCustomerCategoryTmstamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutProfessionStatusCustomerCategoryTmstamp() {
        return outProfessionStatusCustomerCategoryTmstamp;
    }

    /**
     * Sets the value of the outProfessionStatusCustomerCategoryTmstamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutProfessionStatusCustomerCategoryTmstamp(XMLGregorianCalendar value) {
        this.outProfessionStatusCustomerCategoryTmstamp = value;
    }

    /**
     * Gets the value of the outProfessionStatusGenericDetailDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutProfessionStatusGenericDetailDescription() {
        return outProfessionStatusGenericDetailDescription;
    }

    /**
     * Sets the value of the outProfessionStatusGenericDetailDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutProfessionStatusGenericDetailDescription(String value) {
        this.outProfessionStatusGenericDetailDescription = value;
    }

    /**
     * Gets the value of the outProfessionStatusGenericDetailSerialNum property.
     * 
     */
    public int getOutProfessionStatusGenericDetailSerialNum() {
        return outProfessionStatusGenericDetailSerialNum;
    }

    /**
     * Sets the value of the outProfessionStatusGenericDetailSerialNum property.
     * 
     */
    public void setOutProfessionStatusGenericDetailSerialNum(int value) {
        this.outProfessionStatusGenericDetailSerialNum = value;
    }

    /**
     * Gets the value of the outRcountryCustomerCategoryTmstamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutRcountryCustomerCategoryTmstamp() {
        return outRcountryCustomerCategoryTmstamp;
    }

    /**
     * Sets the value of the outRcountryCustomerCategoryTmstamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutRcountryCustomerCategoryTmstamp(XMLGregorianCalendar value) {
        this.outRcountryCustomerCategoryTmstamp = value;
    }

    /**
     * Gets the value of the outRcountryGenericDetailDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutRcountryGenericDetailDescription() {
        return outRcountryGenericDetailDescription;
    }

    /**
     * Sets the value of the outRcountryGenericDetailDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutRcountryGenericDetailDescription(String value) {
        this.outRcountryGenericDetailDescription = value;
    }

    /**
     * Gets the value of the outRcountryGenericDetailSerialNum property.
     * 
     */
    public int getOutRcountryGenericDetailSerialNum() {
        return outRcountryGenericDetailSerialNum;
    }

    /**
     * Sets the value of the outRcountryGenericDetailSerialNum property.
     * 
     */
    public void setOutRcountryGenericDetailSerialNum(int value) {
        this.outRcountryGenericDetailSerialNum = value;
    }

    /**
     * Gets the value of the outRcountryGenericDetailShortDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutRcountryGenericDetailShortDescription() {
        return outRcountryGenericDetailShortDescription;
    }

    /**
     * Sets the value of the outRcountryGenericDetailShortDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutRcountryGenericDetailShortDescription(String value) {
        this.outRcountryGenericDetailShortDescription = value;
    }

    /**
     * Gets the value of the outRegionCustomerCategoryTmstamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutRegionCustomerCategoryTmstamp() {
        return outRegionCustomerCategoryTmstamp;
    }

    /**
     * Sets the value of the outRegionCustomerCategoryTmstamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutRegionCustomerCategoryTmstamp(XMLGregorianCalendar value) {
        this.outRegionCustomerCategoryTmstamp = value;
    }

    /**
     * Gets the value of the outRegionGenericDetailDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutRegionGenericDetailDescription() {
        return outRegionGenericDetailDescription;
    }

    /**
     * Sets the value of the outRegionGenericDetailDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutRegionGenericDetailDescription(String value) {
        this.outRegionGenericDetailDescription = value;
    }

    /**
     * Gets the value of the outRegionGenericDetailSerialNum property.
     * 
     */
    public int getOutRegionGenericDetailSerialNum() {
        return outRegionGenericDetailSerialNum;
    }

    /**
     * Sets the value of the outRegionGenericDetailSerialNum property.
     * 
     */
    public void setOutRegionGenericDetailSerialNum(int value) {
        this.outRegionGenericDetailSerialNum = value;
    }

    /**
     * Gets the value of the outResidenceCountryCustomerCategoryTmstamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutResidenceCountryCustomerCategoryTmstamp() {
        return outResidenceCountryCustomerCategoryTmstamp;
    }

    /**
     * Sets the value of the outResidenceCountryCustomerCategoryTmstamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutResidenceCountryCustomerCategoryTmstamp(XMLGregorianCalendar value) {
        this.outResidenceCountryCustomerCategoryTmstamp = value;
    }

    /**
     * Gets the value of the outResidenceCountryGenericDetailDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutResidenceCountryGenericDetailDescription() {
        return outResidenceCountryGenericDetailDescription;
    }

    /**
     * Sets the value of the outResidenceCountryGenericDetailDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutResidenceCountryGenericDetailDescription(String value) {
        this.outResidenceCountryGenericDetailDescription = value;
    }

    /**
     * Gets the value of the outResidenceCountryGenericDetailEntryStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutResidenceCountryGenericDetailEntryStatus() {
        return outResidenceCountryGenericDetailEntryStatus;
    }

    /**
     * Sets the value of the outResidenceCountryGenericDetailEntryStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutResidenceCountryGenericDetailEntryStatus(String value) {
        this.outResidenceCountryGenericDetailEntryStatus = value;
    }

    /**
     * Gets the value of the outResidenceCountryGenericDetailSerialNum property.
     * 
     */
    public int getOutResidenceCountryGenericDetailSerialNum() {
        return outResidenceCountryGenericDetailSerialNum;
    }

    /**
     * Sets the value of the outResidenceCountryGenericDetailSerialNum property.
     * 
     */
    public void setOutResidenceCountryGenericDetailSerialNum(int value) {
        this.outResidenceCountryGenericDetailSerialNum = value;
    }

    /**
     * Gets the value of the outResidenceCountryGenericDetailShortDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutResidenceCountryGenericDetailShortDescription() {
        return outResidenceCountryGenericDetailShortDescription;
    }

    /**
     * Sets the value of the outResidenceCountryGenericDetailShortDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutResidenceCountryGenericDetailShortDescription(String value) {
        this.outResidenceCountryGenericDetailShortDescription = value;
    }

    /**
     * Gets the value of the outRmBankemployeeFirstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutRmBankemployeeFirstName() {
        return outRmBankemployeeFirstName;
    }

    /**
     * Sets the value of the outRmBankemployeeFirstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutRmBankemployeeFirstName(String value) {
        this.outRmBankemployeeFirstName = value;
    }

    /**
     * Gets the value of the outRmBankemployeeLastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutRmBankemployeeLastName() {
        return outRmBankemployeeLastName;
    }

    /**
     * Sets the value of the outRmBankemployeeLastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutRmBankemployeeLastName(String value) {
        this.outRmBankemployeeLastName = value;
    }

    /**
     * Gets the value of the outRmUsrCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutRmUsrCode() {
        return outRmUsrCode;
    }

    /**
     * Sets the value of the outRmUsrCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutRmUsrCode(String value) {
        this.outRmUsrCode = value;
    }

    /**
     * Gets the value of the outSegmentGenericDetailDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSegmentGenericDetailDescription() {
        return outSegmentGenericDetailDescription;
    }

    /**
     * Sets the value of the outSegmentGenericDetailDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSegmentGenericDetailDescription(String value) {
        this.outSegmentGenericDetailDescription = value;
    }

    /**
     * Gets the value of the outSegmentGenericDetailEntryStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSegmentGenericDetailEntryStatus() {
        return outSegmentGenericDetailEntryStatus;
    }

    /**
     * Sets the value of the outSegmentGenericDetailEntryStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSegmentGenericDetailEntryStatus(String value) {
        this.outSegmentGenericDetailEntryStatus = value;
    }

    /**
     * Gets the value of the outSegmentGenericDetailSerialNum property.
     * 
     */
    public int getOutSegmentGenericDetailSerialNum() {
        return outSegmentGenericDetailSerialNum;
    }

    /**
     * Sets the value of the outSegmentGenericDetailSerialNum property.
     * 
     */
    public void setOutSegmentGenericDetailSerialNum(int value) {
        this.outSegmentGenericDetailSerialNum = value;
    }

    /**
     * Gets the value of the outStatusIefSuppliedActionEntry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutStatusIefSuppliedActionEntry() {
        return outStatusIefSuppliedActionEntry;
    }

    /**
     * Sets the value of the outStatusIefSuppliedActionEntry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutStatusIefSuppliedActionEntry(String value) {
        this.outStatusIefSuppliedActionEntry = value;
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
     * Gets the value of the outSubCategoryCustomerCategoryTmstamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutSubCategoryCustomerCategoryTmstamp() {
        return outSubCategoryCustomerCategoryTmstamp;
    }

    /**
     * Sets the value of the outSubCategoryCustomerCategoryTmstamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutSubCategoryCustomerCategoryTmstamp(XMLGregorianCalendar value) {
        this.outSubCategoryCustomerCategoryTmstamp = value;
    }

    /**
     * Gets the value of the outSubCategoryGenericDetailDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSubCategoryGenericDetailDescription() {
        return outSubCategoryGenericDetailDescription;
    }

    /**
     * Sets the value of the outSubCategoryGenericDetailDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSubCategoryGenericDetailDescription(String value) {
        this.outSubCategoryGenericDetailDescription = value;
    }

    /**
     * Gets the value of the outSubCategoryGenericDetailEntryStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSubCategoryGenericDetailEntryStatus() {
        return outSubCategoryGenericDetailEntryStatus;
    }

    /**
     * Sets the value of the outSubCategoryGenericDetailEntryStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSubCategoryGenericDetailEntryStatus(String value) {
        this.outSubCategoryGenericDetailEntryStatus = value;
    }

    /**
     * Gets the value of the outSubCategoryGenericDetailSerialNum property.
     * 
     */
    public int getOutSubCategoryGenericDetailSerialNum() {
        return outSubCategoryGenericDetailSerialNum;
    }

    /**
     * Sets the value of the outSubCategoryGenericDetailSerialNum property.
     * 
     */
    public void setOutSubCategoryGenericDetailSerialNum(int value) {
        this.outSubCategoryGenericDetailSerialNum = value;
    }

    /**
     * Gets the value of the outSubCategoryGenericDetailShortDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSubCategoryGenericDetailShortDescription() {
        return outSubCategoryGenericDetailShortDescription;
    }

    /**
     * Sets the value of the outSubCategoryGenericDetailShortDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSubCategoryGenericDetailShortDescription(String value) {
        this.outSubCategoryGenericDetailShortDescription = value;
    }

    /**
     * Gets the value of the outTaxOfficeDomTaxOffice property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutTaxOfficeDomTaxOffice() {
        return outTaxOfficeDomTaxOffice;
    }

    /**
     * Sets the value of the outTaxOfficeDomTaxOffice property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutTaxOfficeDomTaxOffice(String value) {
        this.outTaxOfficeDomTaxOffice = value;
    }

    /**
     * Gets the value of the outTaxOfficeId property.
     * 
     */
    public short getOutTaxOfficeId() {
        return outTaxOfficeId;
    }

    /**
     * Sets the value of the outTaxOfficeId property.
     * 
     */
    public void setOutTaxOfficeId(short value) {
        this.outTaxOfficeId = value;
    }

    /**
     * Gets the value of the outTaxOfficeTaxOfficeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutTaxOfficeTaxOfficeName() {
        return outTaxOfficeTaxOfficeName;
    }

    /**
     * Sets the value of the outTaxOfficeTaxOfficeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutTaxOfficeTaxOfficeName(String value) {
        this.outTaxOfficeTaxOfficeName = value;
    }

    /**
     * Gets the value of the outThinkingCurrencyIdCurrency property.
     * 
     */
    public int getOutThinkingCurrencyIdCurrency() {
        return outThinkingCurrencyIdCurrency;
    }

    /**
     * Sets the value of the outThinkingCurrencyIdCurrency property.
     * 
     */
    public void setOutThinkingCurrencyIdCurrency(int value) {
        this.outThinkingCurrencyIdCurrency = value;
    }

    /**
     * Gets the value of the outThinkingCurrencyShortDescr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutThinkingCurrencyShortDescr() {
        return outThinkingCurrencyShortDescr;
    }

    /**
     * Sets the value of the outThinkingCurrencyShortDescr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutThinkingCurrencyShortDescr(String value) {
        this.outThinkingCurrencyShortDescr = value;
    }

    /**
     * Gets the value of the outTimePrintLineTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutTimePrintLineTime() {
        return outTimePrintLineTime;
    }

    /**
     * Sets the value of the outTimePrintLineTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutTimePrintLineTime(XMLGregorianCalendar value) {
        this.outTimePrintLineTime = value;
    }

    /**
     * Gets the value of the outWifeHusbCustomerFirstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutWifeHusbCustomerFirstName() {
        return outWifeHusbCustomerFirstName;
    }

    /**
     * Sets the value of the outWifeHusbCustomerFirstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutWifeHusbCustomerFirstName(String value) {
        this.outWifeHusbCustomerFirstName = value;
    }

    /**
     * Gets the value of the outWifeHusbCustomerSurname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutWifeHusbCustomerSurname() {
        return outWifeHusbCustomerSurname;
    }

    /**
     * Sets the value of the outWifeHusbCustomerSurname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutWifeHusbCustomerSurname(String value) {
        this.outWifeHusbCustomerSurname = value;
    }

    /**
     * Gets the value of the outWifeHusbOtherIdIdNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutWifeHusbOtherIdIdNo() {
        return outWifeHusbOtherIdIdNo;
    }

    /**
     * Sets the value of the outWifeHusbOtherIdIdNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutWifeHusbOtherIdIdNo(String value) {
        this.outWifeHusbOtherIdIdNo = value;
    }

    /**
     * Gets the value of the outCustomerEnableFor24C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCustomerEnableFor24C() {
        return outCustomerEnableFor24C;
    }

    /**
     * Sets the value of the outCustomerEnableFor24C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCustomerEnableFor24C(String value) {
        this.outCustomerEnableFor24C = value;
    }

    /**
     * Gets the value of the outCustomerCustOpenDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutCustomerCustOpenDate() {
        return outCustomerCustOpenDate;
    }

    /**
     * Sets the value of the outCustomerCustOpenDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutCustomerCustOpenDate(XMLGregorianCalendar value) {
        this.outCustomerCustOpenDate = value;
    }

    /**
     * Gets the value of the outGrpCustcat property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfOutGrpCustcat }
     *     
     */
    public ArrayOfOutGrpCustcat getOutGrpCustcat() {
        return outGrpCustcat;
    }

    /**
     * Sets the value of the outGrpCustcat property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfOutGrpCustcat }
     *     
     */
    public void setOutGrpCustcat(ArrayOfOutGrpCustcat value) {
        this.outGrpCustcat = value;
    }

    /**
     * Gets the value of the outGrpSameAfm property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfOutGrpSameAfm }
     *     
     */
    public ArrayOfOutGrpSameAfm getOutGrpSameAfm() {
        return outGrpSameAfm;
    }

    /**
     * Sets the value of the outGrpSameAfm property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfOutGrpSameAfm }
     *     
     */
    public void setOutGrpSameAfm(ArrayOfOutGrpSameAfm value) {
        this.outGrpSameAfm = value;
    }

    /**
     * Gets the value of the outGrpSameId property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfOutGrpSameId }
     *     
     */
    public ArrayOfOutGrpSameId getOutGrpSameId() {
        return outGrpSameId;
    }

    /**
     * Sets the value of the outGrpSameId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfOutGrpSameId }
     *     
     */
    public void setOutGrpSameId(ArrayOfOutGrpSameId value) {
        this.outGrpSameId = value;
    }

    /**
     * Gets the value of the outCustAddressAccomodationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutCustAddressAccomodationDate() {
        return outCustAddressAccomodationDate;
    }

    /**
     * Sets the value of the outCustAddressAccomodationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutCustAddressAccomodationDate(XMLGregorianCalendar value) {
        this.outCustAddressAccomodationDate = value;
    }

    /**
     * Gets the value of the outCustAddressInternetAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCustAddressInternetAddress() {
        return outCustAddressInternetAddress;
    }

    /**
     * Sets the value of the outCustAddressInternetAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCustAddressInternetAddress(String value) {
        this.outCustAddressInternetAddress = value;
    }

    /**
     * Gets the value of the outCustAddressEMail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCustAddressEMail() {
        return outCustAddressEMail;
    }

    /**
     * Sets the value of the outCustAddressEMail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCustAddressEMail(String value) {
        this.outCustAddressEMail = value;
    }

    /**
     * Gets the value of the outCustAddressTelephone3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCustAddressTelephone3() {
        return outCustAddressTelephone3;
    }

    /**
     * Sets the value of the outCustAddressTelephone3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCustAddressTelephone3(String value) {
        this.outCustAddressTelephone3 = value;
    }

    /**
     * Gets the value of the outCustAddressTelephone2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCustAddressTelephone2() {
        return outCustAddressTelephone2;
    }

    /**
     * Sets the value of the outCustAddressTelephone2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCustAddressTelephone2(String value) {
        this.outCustAddressTelephone2 = value;
    }

    /**
     * Gets the value of the outCustAddressAddress6 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCustAddressAddress6() {
        return outCustAddressAddress6;
    }

    /**
     * Sets the value of the outCustAddressAddress6 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCustAddressAddress6(String value) {
        this.outCustAddressAddress6 = value;
    }

    /**
     * Gets the value of the outCustAddressAddress5 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCustAddressAddress5() {
        return outCustAddressAddress5;
    }

    /**
     * Sets the value of the outCustAddressAddress5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCustAddressAddress5(String value) {
        this.outCustAddressAddress5 = value;
    }

    /**
     * Gets the value of the outCustAddressAddress4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCustAddressAddress4() {
        return outCustAddressAddress4;
    }

    /**
     * Sets the value of the outCustAddressAddress4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCustAddressAddress4(String value) {
        this.outCustAddressAddress4 = value;
    }

    /**
     * Gets the value of the outCustAddressAddress3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCustAddressAddress3() {
        return outCustAddressAddress3;
    }

    /**
     * Sets the value of the outCustAddressAddress3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCustAddressAddress3(String value) {
        this.outCustAddressAddress3 = value;
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
     * Gets the value of the outCustomerOwnershipIndication property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCustomerOwnershipIndication() {
        return outCustomerOwnershipIndication;
    }

    /**
     * Sets the value of the outCustomerOwnershipIndication property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCustomerOwnershipIndication(String value) {
        this.outCustomerOwnershipIndication = value;
    }

    /**
     * Gets the value of the outCustomerContractExpiryDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutCustomerContractExpiryDate() {
        return outCustomerContractExpiryDate;
    }

    /**
     * Sets the value of the outCustomerContractExpiryDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutCustomerContractExpiryDate(XMLGregorianCalendar value) {
        this.outCustomerContractExpiryDate = value;
    }

    /**
     * Gets the value of the outCustomerContract property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCustomerContract() {
        return outCustomerContract;
    }

    /**
     * Sets the value of the outCustomerContract property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCustomerContract(String value) {
        this.outCustomerContract = value;
    }

    /**
     * Gets the value of the outCustomerMobileTel2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCustomerMobileTel2() {
        return outCustomerMobileTel2;
    }

    /**
     * Sets the value of the outCustomerMobileTel2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCustomerMobileTel2(String value) {
        this.outCustomerMobileTel2 = value;
    }

    /**
     * Gets the value of the outCustomerEMail2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCustomerEMail2() {
        return outCustomerEMail2;
    }

    /**
     * Sets the value of the outCustomerEMail2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCustomerEMail2(String value) {
        this.outCustomerEMail2 = value;
    }

    /**
     * Gets the value of the outEmployerCustAddressSerialNum property.
     * 
     */
    public short getOutEmployerCustAddressSerialNum() {
        return outEmployerCustAddressSerialNum;
    }

    /**
     * Sets the value of the outEmployerCustAddressSerialNum property.
     * 
     */
    public void setOutEmployerCustAddressSerialNum(short value) {
        this.outEmployerCustAddressSerialNum = value;
    }

    /**
     * Gets the value of the outEmployerCustAddressAddressType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutEmployerCustAddressAddressType() {
        return outEmployerCustAddressAddressType;
    }

    /**
     * Sets the value of the outEmployerCustAddressAddressType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutEmployerCustAddressAddressType(String value) {
        this.outEmployerCustAddressAddressType = value;
    }

    /**
     * Gets the value of the outEmployerCustAddressFaxNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutEmployerCustAddressFaxNo() {
        return outEmployerCustAddressFaxNo;
    }

    /**
     * Sets the value of the outEmployerCustAddressFaxNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutEmployerCustAddressFaxNo(String value) {
        this.outEmployerCustAddressFaxNo = value;
    }

    /**
     * Gets the value of the outEmployerCustAddressCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutEmployerCustAddressCity() {
        return outEmployerCustAddressCity;
    }

    /**
     * Sets the value of the outEmployerCustAddressCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutEmployerCustAddressCity(String value) {
        this.outEmployerCustAddressCity = value;
    }

    /**
     * Gets the value of the outEmployerCustAddressZipCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutEmployerCustAddressZipCode() {
        return outEmployerCustAddressZipCode;
    }

    /**
     * Sets the value of the outEmployerCustAddressZipCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutEmployerCustAddressZipCode(String value) {
        this.outEmployerCustAddressZipCode = value;
    }

    /**
     * Gets the value of the outEmployerCustAddressTelephone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutEmployerCustAddressTelephone() {
        return outEmployerCustAddressTelephone;
    }

    /**
     * Sets the value of the outEmployerCustAddressTelephone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutEmployerCustAddressTelephone(String value) {
        this.outEmployerCustAddressTelephone = value;
    }

    /**
     * Gets the value of the outEmployerCustAddressCommunicationAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutEmployerCustAddressCommunicationAddress() {
        return outEmployerCustAddressCommunicationAddress;
    }

    /**
     * Sets the value of the outEmployerCustAddressCommunicationAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutEmployerCustAddressCommunicationAddress(String value) {
        this.outEmployerCustAddressCommunicationAddress = value;
    }

    /**
     * Gets the value of the outEmployerCustAddressEntryStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutEmployerCustAddressEntryStatus() {
        return outEmployerCustAddressEntryStatus;
    }

    /**
     * Sets the value of the outEmployerCustAddressEntryStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutEmployerCustAddressEntryStatus(String value) {
        this.outEmployerCustAddressEntryStatus = value;
    }

    /**
     * Gets the value of the outEmployerCustAddressTmstamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutEmployerCustAddressTmstamp() {
        return outEmployerCustAddressTmstamp;
    }

    /**
     * Sets the value of the outEmployerCustAddressTmstamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutEmployerCustAddressTmstamp(XMLGregorianCalendar value) {
        this.outEmployerCustAddressTmstamp = value;
    }

    /**
     * Gets the value of the outEmployerCustAddressRegion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutEmployerCustAddressRegion() {
        return outEmployerCustAddressRegion;
    }

    /**
     * Sets the value of the outEmployerCustAddressRegion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutEmployerCustAddressRegion(String value) {
        this.outEmployerCustAddressRegion = value;
    }

    /**
     * Gets the value of the outEmployerCustAddressAddress1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutEmployerCustAddressAddress1() {
        return outEmployerCustAddressAddress1;
    }

    /**
     * Sets the value of the outEmployerCustAddressAddress1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutEmployerCustAddressAddress1(String value) {
        this.outEmployerCustAddressAddress1 = value;
    }

    /**
     * Gets the value of the outEmployerCustAddressAddress2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutEmployerCustAddressAddress2() {
        return outEmployerCustAddressAddress2;
    }

    /**
     * Sets the value of the outEmployerCustAddressAddress2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutEmployerCustAddressAddress2(String value) {
        this.outEmployerCustAddressAddress2 = value;
    }

    /**
     * Gets the value of the outEmployerCustAddressEntryComments property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutEmployerCustAddressEntryComments() {
        return outEmployerCustAddressEntryComments;
    }

    /**
     * Sets the value of the outEmployerCustAddressEntryComments property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutEmployerCustAddressEntryComments(String value) {
        this.outEmployerCustAddressEntryComments = value;
    }

    /**
     * Gets the value of the outEmployerCustAddressMailBox property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutEmployerCustAddressMailBox() {
        return outEmployerCustAddressMailBox;
    }

    /**
     * Sets the value of the outEmployerCustAddressMailBox property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutEmployerCustAddressMailBox(String value) {
        this.outEmployerCustAddressMailBox = value;
    }

    /**
     * Gets the value of the outEmployerCustAddressSegmFlags property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutEmployerCustAddressSegmFlags() {
        return outEmployerCustAddressSegmFlags;
    }

    /**
     * Sets the value of the outEmployerCustAddressSegmFlags property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutEmployerCustAddressSegmFlags(String value) {
        this.outEmployerCustAddressSegmFlags = value;
    }

    /**
     * Gets the value of the outEmployerCustAddressAccomodationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutEmployerCustAddressAccomodationDate() {
        return outEmployerCustAddressAccomodationDate;
    }

    /**
     * Sets the value of the outEmployerCustAddressAccomodationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutEmployerCustAddressAccomodationDate(XMLGregorianCalendar value) {
        this.outEmployerCustAddressAccomodationDate = value;
    }

    /**
     * Gets the value of the outEmployerCustAddressInternetAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutEmployerCustAddressInternetAddress() {
        return outEmployerCustAddressInternetAddress;
    }

    /**
     * Sets the value of the outEmployerCustAddressInternetAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutEmployerCustAddressInternetAddress(String value) {
        this.outEmployerCustAddressInternetAddress = value;
    }

    /**
     * Gets the value of the outEmployerCustAddressEMail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutEmployerCustAddressEMail() {
        return outEmployerCustAddressEMail;
    }

    /**
     * Sets the value of the outEmployerCustAddressEMail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutEmployerCustAddressEMail(String value) {
        this.outEmployerCustAddressEMail = value;
    }

    /**
     * Gets the value of the outEmployerCustAddressTelephone3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutEmployerCustAddressTelephone3() {
        return outEmployerCustAddressTelephone3;
    }

    /**
     * Sets the value of the outEmployerCustAddressTelephone3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutEmployerCustAddressTelephone3(String value) {
        this.outEmployerCustAddressTelephone3 = value;
    }

    /**
     * Gets the value of the outEmployerCustAddressTelephone2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutEmployerCustAddressTelephone2() {
        return outEmployerCustAddressTelephone2;
    }

    /**
     * Sets the value of the outEmployerCustAddressTelephone2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutEmployerCustAddressTelephone2(String value) {
        this.outEmployerCustAddressTelephone2 = value;
    }

    /**
     * Gets the value of the outEmployerCustAddressAddress6 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutEmployerCustAddressAddress6() {
        return outEmployerCustAddressAddress6;
    }

    /**
     * Sets the value of the outEmployerCustAddressAddress6 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutEmployerCustAddressAddress6(String value) {
        this.outEmployerCustAddressAddress6 = value;
    }

    /**
     * Gets the value of the outEmployerCustAddressAddress5 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutEmployerCustAddressAddress5() {
        return outEmployerCustAddressAddress5;
    }

    /**
     * Sets the value of the outEmployerCustAddressAddress5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutEmployerCustAddressAddress5(String value) {
        this.outEmployerCustAddressAddress5 = value;
    }

    /**
     * Gets the value of the outEmployerCustAddressAddress4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutEmployerCustAddressAddress4() {
        return outEmployerCustAddressAddress4;
    }

    /**
     * Sets the value of the outEmployerCustAddressAddress4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutEmployerCustAddressAddress4(String value) {
        this.outEmployerCustAddressAddress4 = value;
    }

    /**
     * Gets the value of the outEmployerCustAddressAddress3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutEmployerCustAddressAddress3() {
        return outEmployerCustAddressAddress3;
    }

    /**
     * Sets the value of the outEmployerCustAddressAddress3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutEmployerCustAddressAddress3(String value) {
        this.outEmployerCustAddressAddress3 = value;
    }

    /**
     * Gets the value of the outEmployerCustAddressLatinInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutEmployerCustAddressLatinInd() {
        return outEmployerCustAddressLatinInd;
    }

    /**
     * Sets the value of the outEmployerCustAddressLatinInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutEmployerCustAddressLatinInd(String value) {
        this.outEmployerCustAddressLatinInd = value;
    }

    /**
     * Gets the value of the outEmployerCustAddressPtsInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutEmployerCustAddressPtsInd() {
        return outEmployerCustAddressPtsInd;
    }

    /**
     * Sets the value of the outEmployerCustAddressPtsInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutEmployerCustAddressPtsInd(String value) {
        this.outEmployerCustAddressPtsInd = value;
    }

    /**
     * Gets the value of the outEmployerAddressDistrictGenericDetailSerialNum property.
     * 
     */
    public int getOutEmployerAddressDistrictGenericDetailSerialNum() {
        return outEmployerAddressDistrictGenericDetailSerialNum;
    }

    /**
     * Sets the value of the outEmployerAddressDistrictGenericDetailSerialNum property.
     * 
     */
    public void setOutEmployerAddressDistrictGenericDetailSerialNum(int value) {
        this.outEmployerAddressDistrictGenericDetailSerialNum = value;
    }

    /**
     * Gets the value of the outEmployerAddressDistrictGenericDetailDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutEmployerAddressDistrictGenericDetailDescription() {
        return outEmployerAddressDistrictGenericDetailDescription;
    }

    /**
     * Sets the value of the outEmployerAddressDistrictGenericDetailDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutEmployerAddressDistrictGenericDetailDescription(String value) {
        this.outEmployerAddressDistrictGenericDetailDescription = value;
    }

    /**
     * Gets the value of the outEmployerAddressCountryGenericDetailDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutEmployerAddressCountryGenericDetailDescription() {
        return outEmployerAddressCountryGenericDetailDescription;
    }

    /**
     * Sets the value of the outEmployerAddressCountryGenericDetailDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutEmployerAddressCountryGenericDetailDescription(String value) {
        this.outEmployerAddressCountryGenericDetailDescription = value;
    }

    /**
     * Gets the value of the outEmployerAddressCountryGenericDetailShortDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutEmployerAddressCountryGenericDetailShortDescription() {
        return outEmployerAddressCountryGenericDetailShortDescription;
    }

    /**
     * Sets the value of the outEmployerAddressCountryGenericDetailShortDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutEmployerAddressCountryGenericDetailShortDescription(String value) {
        this.outEmployerAddressCountryGenericDetailShortDescription = value;
    }

    /**
     * Gets the value of the outEmployerCustAddrParrelDCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutEmployerCustAddrParrelDCode() {
        return outEmployerCustAddrParrelDCode;
    }

    /**
     * Sets the value of the outEmployerCustAddrParrelDCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutEmployerCustAddrParrelDCode(String value) {
        this.outEmployerCustAddrParrelDCode = value;
    }

    /**
     * Gets the value of the outEmployerCustAddrParrelDSn property.
     * 
     */
    public int getOutEmployerCustAddrParrelDSn() {
        return outEmployerCustAddrParrelDSn;
    }

    /**
     * Sets the value of the outEmployerCustAddrParrelDSn property.
     * 
     */
    public void setOutEmployerCustAddrParrelDSn(int value) {
        this.outEmployerCustAddrParrelDSn = value;
    }

    /**
     * Gets the value of the outCustAddrParrelDCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCustAddrParrelDCode() {
        return outCustAddrParrelDCode;
    }

    /**
     * Sets the value of the outCustAddrParrelDCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCustAddrParrelDCode(String value) {
        this.outCustAddrParrelDCode = value;
    }

    /**
     * Gets the value of the outCustAddrParrelDSn property.
     * 
     */
    public int getOutCustAddrParrelDSn() {
        return outCustAddrParrelDSn;
    }

    /**
     * Sets the value of the outCustAddrParrelDSn property.
     * 
     */
    public void setOutCustAddrParrelDSn(int value) {
        this.outCustAddrParrelDSn = value;
    }

    /**
     * Gets the value of the outEmployerCustAddrParrelDP01Desc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutEmployerCustAddrParrelDP01Desc() {
        return outEmployerCustAddrParrelDP01Desc;
    }

    /**
     * Sets the value of the outEmployerCustAddrParrelDP01Desc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutEmployerCustAddrParrelDP01Desc(String value) {
        this.outEmployerCustAddrParrelDP01Desc = value;
    }

    /**
     * Gets the value of the outEmployerCustAddrParrelDP02Desc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutEmployerCustAddrParrelDP02Desc() {
        return outEmployerCustAddrParrelDP02Desc;
    }

    /**
     * Sets the value of the outEmployerCustAddrParrelDP02Desc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutEmployerCustAddrParrelDP02Desc(String value) {
        this.outEmployerCustAddrParrelDP02Desc = value;
    }

    /**
     * Gets the value of the outEmployerCustAddrParrelDP03Desc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutEmployerCustAddrParrelDP03Desc() {
        return outEmployerCustAddrParrelDP03Desc;
    }

    /**
     * Sets the value of the outEmployerCustAddrParrelDP03Desc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutEmployerCustAddrParrelDP03Desc(String value) {
        this.outEmployerCustAddrParrelDP03Desc = value;
    }

    /**
     * Gets the value of the outEmployerCustAddrParrelDP04Desc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutEmployerCustAddrParrelDP04Desc() {
        return outEmployerCustAddrParrelDP04Desc;
    }

    /**
     * Sets the value of the outEmployerCustAddrParrelDP04Desc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutEmployerCustAddrParrelDP04Desc(String value) {
        this.outEmployerCustAddrParrelDP04Desc = value;
    }

    /**
     * Gets the value of the outEmployerCustAddrParrelDP05Desc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutEmployerCustAddrParrelDP05Desc() {
        return outEmployerCustAddrParrelDP05Desc;
    }

    /**
     * Sets the value of the outEmployerCustAddrParrelDP05Desc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutEmployerCustAddrParrelDP05Desc(String value) {
        this.outEmployerCustAddrParrelDP05Desc = value;
    }

    /**
     * Gets the value of the outEmployerCustAddrParrelDP06Desc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutEmployerCustAddrParrelDP06Desc() {
        return outEmployerCustAddrParrelDP06Desc;
    }

    /**
     * Sets the value of the outEmployerCustAddrParrelDP06Desc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutEmployerCustAddrParrelDP06Desc(String value) {
        this.outEmployerCustAddrParrelDP06Desc = value;
    }

    /**
     * Gets the value of the outEmployerCustAddrParrelDP07Desc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutEmployerCustAddrParrelDP07Desc() {
        return outEmployerCustAddrParrelDP07Desc;
    }

    /**
     * Sets the value of the outEmployerCustAddrParrelDP07Desc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutEmployerCustAddrParrelDP07Desc(String value) {
        this.outEmployerCustAddrParrelDP07Desc = value;
    }

    /**
     * Gets the value of the outEmployerCustAddrParrelDP08Desc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutEmployerCustAddrParrelDP08Desc() {
        return outEmployerCustAddrParrelDP08Desc;
    }

    /**
     * Sets the value of the outEmployerCustAddrParrelDP08Desc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutEmployerCustAddrParrelDP08Desc(String value) {
        this.outEmployerCustAddrParrelDP08Desc = value;
    }

    /**
     * Gets the value of the outEmployerCustAddrParrelDP09Desc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutEmployerCustAddrParrelDP09Desc() {
        return outEmployerCustAddrParrelDP09Desc;
    }

    /**
     * Sets the value of the outEmployerCustAddrParrelDP09Desc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutEmployerCustAddrParrelDP09Desc(String value) {
        this.outEmployerCustAddrParrelDP09Desc = value;
    }

    /**
     * Gets the value of the outEmployerCustAddrParrelDP10Desc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutEmployerCustAddrParrelDP10Desc() {
        return outEmployerCustAddrParrelDP10Desc;
    }

    /**
     * Sets the value of the outEmployerCustAddrParrelDP10Desc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutEmployerCustAddrParrelDP10Desc(String value) {
        this.outEmployerCustAddrParrelDP10Desc = value;
    }

    /**
     * Gets the value of the outCustAddrParrelDP01Desc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCustAddrParrelDP01Desc() {
        return outCustAddrParrelDP01Desc;
    }

    /**
     * Sets the value of the outCustAddrParrelDP01Desc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCustAddrParrelDP01Desc(String value) {
        this.outCustAddrParrelDP01Desc = value;
    }

    /**
     * Gets the value of the outCustAddrParrelDP02Desc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCustAddrParrelDP02Desc() {
        return outCustAddrParrelDP02Desc;
    }

    /**
     * Sets the value of the outCustAddrParrelDP02Desc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCustAddrParrelDP02Desc(String value) {
        this.outCustAddrParrelDP02Desc = value;
    }

    /**
     * Gets the value of the outCustAddrParrelDP03Desc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCustAddrParrelDP03Desc() {
        return outCustAddrParrelDP03Desc;
    }

    /**
     * Sets the value of the outCustAddrParrelDP03Desc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCustAddrParrelDP03Desc(String value) {
        this.outCustAddrParrelDP03Desc = value;
    }

    /**
     * Gets the value of the outCustAddrParrelDP04Desc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCustAddrParrelDP04Desc() {
        return outCustAddrParrelDP04Desc;
    }

    /**
     * Sets the value of the outCustAddrParrelDP04Desc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCustAddrParrelDP04Desc(String value) {
        this.outCustAddrParrelDP04Desc = value;
    }

    /**
     * Gets the value of the outCustAddrParrelDP05Desc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCustAddrParrelDP05Desc() {
        return outCustAddrParrelDP05Desc;
    }

    /**
     * Sets the value of the outCustAddrParrelDP05Desc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCustAddrParrelDP05Desc(String value) {
        this.outCustAddrParrelDP05Desc = value;
    }

    /**
     * Gets the value of the outCustAddrParrelDP06Desc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCustAddrParrelDP06Desc() {
        return outCustAddrParrelDP06Desc;
    }

    /**
     * Sets the value of the outCustAddrParrelDP06Desc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCustAddrParrelDP06Desc(String value) {
        this.outCustAddrParrelDP06Desc = value;
    }

    /**
     * Gets the value of the outCustAddrParrelDP07Desc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCustAddrParrelDP07Desc() {
        return outCustAddrParrelDP07Desc;
    }

    /**
     * Sets the value of the outCustAddrParrelDP07Desc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCustAddrParrelDP07Desc(String value) {
        this.outCustAddrParrelDP07Desc = value;
    }

    /**
     * Gets the value of the outCustAddrParrelDP08Desc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCustAddrParrelDP08Desc() {
        return outCustAddrParrelDP08Desc;
    }

    /**
     * Sets the value of the outCustAddrParrelDP08Desc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCustAddrParrelDP08Desc(String value) {
        this.outCustAddrParrelDP08Desc = value;
    }

    /**
     * Gets the value of the outCustAddrParrelDP09Desc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCustAddrParrelDP09Desc() {
        return outCustAddrParrelDP09Desc;
    }

    /**
     * Sets the value of the outCustAddrParrelDP09Desc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCustAddrParrelDP09Desc(String value) {
        this.outCustAddrParrelDP09Desc = value;
    }

    /**
     * Gets the value of the outCustAddrParrelDP10Desc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCustAddrParrelDP10Desc() {
        return outCustAddrParrelDP10Desc;
    }

    /**
     * Sets the value of the outCustAddrParrelDP10Desc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCustAddrParrelDP10Desc(String value) {
        this.outCustAddrParrelDP10Desc = value;
    }

    /**
     * Gets the value of the outCustomerCommunMethod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCustomerCommunMethod() {
        return outCustomerCommunMethod;
    }

    /**
     * Sets the value of the outCustomerCommunMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCustomerCommunMethod(String value) {
        this.outCustomerCommunMethod = value;
    }

    /**
     * Gets the value of the outCustomerCbsId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCustomerCbsId() {
        return outCustomerCbsId;
    }

    /**
     * Sets the value of the outCustomerCbsId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCustomerCbsId(String value) {
        this.outCustomerCbsId = value;
    }

    /**
     * Gets the value of the outCustomerIapplyId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCustomerIapplyId() {
        return outCustomerIapplyId;
    }

    /**
     * Sets the value of the outCustomerIapplyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCustomerIapplyId(String value) {
        this.outCustomerIapplyId = value;
    }

    /**
     * Gets the value of the outCustomerCrmId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCustomerCrmId() {
        return outCustomerCrmId;
    }

    /**
     * Sets the value of the outCustomerCrmId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCustomerCrmId(String value) {
        this.outCustomerCrmId = value;
    }

}
