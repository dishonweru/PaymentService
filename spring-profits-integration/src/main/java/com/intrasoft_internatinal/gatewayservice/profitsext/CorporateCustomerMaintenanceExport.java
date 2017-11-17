
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for CorporateCustomerMaintenanceExport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CorporateCustomerMaintenanceExport">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}BaseExport">
 *       &lt;sequence>
 *         &lt;element name="OutCustomerSpmNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CheckCustomerMemberGroupIefSuppliedComments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutActivityCustomerCategoryTmstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutActivityGenericDetailDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutActivityGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutActivityTypeCustomerCategoryTmstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutActivityTypeGenericDetailDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutActivityTypeGenericDetailEntryStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutActivityTypeGenericDetailShortDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutAddressDistrictGenericDetailDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutAddressDistrictGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutAfmIssueCountryGenericDetailDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutAfmIssueCountryGenericDetailShortDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutAtenetCustCardInfoCardNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutAtenetCustCardInfoEndDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutAtenetCustCardInfoStartDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutAtractionGenericDetailDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutAtractionGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutAttractionBankemployeeFirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutAttractionBankemployeeLastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutAttractionCustomerCategoryTmstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutAttractionUsrCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutBankParametersBankParametersBankCode" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutBankParametersBankParametersWordPrint" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutBasileiaCustomerCategoryTmstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutBasileiaGenericDetailDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutBasileiaGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutBasileiaGenericDetailShortDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutBopCountryCustomerCategoryTmstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutBopCountryGenericDetailDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutBopCountryGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutBopCountryGenericDetailShortDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
 *         &lt;element name="OutCompanyCategGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutCompanyCategGenericDetailShortDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCompanySubcategCustomerCategoryTmstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutCompanySubcategGenericDetailDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCompanySubcategGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutCompanySubcategGenericDetailShortDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCompanyTypeCustomerCategoryTmstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutCompanyTypeGenericDetailDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCompanyTypeGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutConditionsMembershipCustomerCategoryTmstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutConditionsMembershipGenericDetailDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutConditionsMembershipGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutConditionsMembershipGenericDetailShortDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutConfirmDoubtAfmIefSuppliedFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCountryGenericDetailDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCountryGenericDetailShortDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustAddressAddress1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustAddressAddress2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustAddressAddressType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustAddressCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustAddressEntryComments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustAddressFaxNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
 *         &lt;element name="OutCustomerCertificCust" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustomerCertificDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutCustomerChamberComments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustomerChamberId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustomerCustStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustomerDaiNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustomerDateOfBirth" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutCustomerEMail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustomerEntryComments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustomerEntryStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustomerExpireDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutCustomerFaxIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustomerFicliCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutCustomerFicliDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustomerFinRange" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutCustomerFinRangeDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutCustomerFirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustomerIncompleteUComnt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustomerInstituteInvInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustomerInternetAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustomerLastUpdate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutCustomerLatinFirstname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustomerLatinSurname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustomerMobileTel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustomerNoAfm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustomerNonProfit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustomerNonRegistered" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustomerNonResident" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustomerNonResidentForRep" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustomerPromocode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustomerReprFirstname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustomerReprPhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustomerReprSurname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustomerSegmFlags" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustomerSepaAgrDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutCustomerSepaAgrFlg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustomerShortName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustomerSurname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustomerSwiftAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustomerSwiftConnectionInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustomerTelephone1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustomerTelex" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustomerTelexConnection" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustomerTmstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutCustomerVipInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustomerShareholdersSerialNum" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutCustomerShareholdersShareholderIdNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustomerShareholdersShareholderIdType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustomerShareholdersShareholderName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustomerShareholdersSharesPerc" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutCustStockInfoNoOfShares" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutCustStockInfoShareholderInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutEconomicGroupCustomerCategoryTmstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutEconomicGroupGenericDetailDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutEconomicGroupGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutEvalResultTeamInformationAuthorizationType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutEvalResultTeamInformationEvaluationResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutEvalResultTeamInformationRequiredProfile1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutEvalResultTeamInformationRequiredProfile2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpCustcatLength" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGrpCustomerShareholdersLength" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGrpLogLength" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGrpSameAfmLength" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutKeyCustomerCDigit" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutKeyCustomerCustId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutKeyOtherCustomerCDigit" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutKeyOtherCustomerCustId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutLegalTypeCustomerCategoryTmstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutLegalTypeGenericDetailDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutLegalTypeGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutMarketCustomerCategoryTmstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutMarketGenericDetailDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutMarketGenericDetailEntryStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutMarketGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutMonitoringUnitCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutMonitoringUnitUnitName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutOfficeCountryGenericDetailDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutOfficeCountryGenericDetailShortDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutOfficeCustAddressAddress1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutOfficeCustAddressAddressType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutOfficeCustAddressCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutOfficeCustAddressEntryComments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutOfficeCustAddressEntryStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutOfficeCustAddressMailBox" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutOfficeCustAddressSerialNum" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutOfficeCustAddressTmstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutOfficeCustAddressZipCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutOtherAfmAfmNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutOtherAfmSerialNo" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutOtherAfmTmstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutPrintLineTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutRegionCustomerCategoryTmstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutRegionGenericDetailDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutRegionGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutRegistryCountryGenericDetailDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutRegistryCountryGenericDetailShortDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutRegistryOtherIdExpiryDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutRegistryOtherIdIdNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutRegistryOtherIdIssueAuthority" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutRegistryOtherIdIssueDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutRegistryOtherIdSerialNo" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutRegistryOtherIdTmstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutRmBankemployeeFirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutRmBankemployeeLastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutRmUsrCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSegmentCustomerCategoryTmstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutSegmentGenericDetailDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSegmentGenericDetailEntryStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSegmentGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutTaxOfficeId" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutTaxOfficeTaxOfficeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutThinkingCurrencyIdCurrency" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutThinkingCurrencyShortDescr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustomerEnableFor24c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustomerCustOpenDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutGrpCustcat" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}ArrayOfOutGrpCustcatC" minOccurs="0"/>
 *         &lt;element name="OutGrpCustomerShareholders" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}ArrayOfOutGrpCustomerShareholders" minOccurs="0"/>
 *         &lt;element name="OutGrpSameAfm" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}ArrayOfOutGrpSameAfmC" minOccurs="0"/>
 *         &lt;element name="OutMonitoringBankemployeeId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutMonitoringBankemployeeFirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutMonitoringBankemployeeLastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutOfficeAddressDistrictGenericDetailDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutOfficeAddressDistrictGenericDetailShortDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutOfficeAddressDistrictGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutOfficeCustAddressAccomodationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutOfficeCustAddressInternetAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutOfficeCustAddressEMail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutOfficeCustAddressTelephone3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutOfficeCustAddressTelephone2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutOfficeCustAddressAddress6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutOfficeCustAddressAddress5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutOfficeCustAddressAddress4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutOfficeCustAddressAddress3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutOfficeCustAddressSegmFlags" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutOfficeCustAddressLatinInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutOfficeCustAddressPtsInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutOfficeCustAddressFaxNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutOfficeCustAddressTelephone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutOfficeCustAddressCommunicationAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutOfficeCustAddressRegion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutOfficeCustAddressAddress2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
 *         &lt;element name="OutCustAddressMailBox" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustAddressPtsInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustAddressCommunicationAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustAddressEntryStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustomerNoOfBusinesses" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutCustomerMobileTel2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustomerEMail2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutOfficeCustAddrParrelDCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutOfficeCustAddrParrelDSn" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutOfficeCustAddrParrelDP01Desc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutOfficeCustAddrParrelDP02Desc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutOfficeCustAddrParrelDP03Desc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutOfficeCustAddrParrelDP04Desc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutOfficeCustAddrParrelDP05Desc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutOfficeCustAddrParrelDP06Desc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutOfficeCustAddrParrelDP07Desc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutOfficeCustAddrParrelDP08Desc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutOfficeCustAddrParrelDP09Desc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutOfficeCustAddrParrelDP10Desc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustAddrParrelDCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustAddrParrelDSn" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
 *         &lt;element name="OutCustomerNumOfChildren" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutCustomerFamilyMembers" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutCustomerNoOfEmployees" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutCustomerPermEmployees" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CorporateCustomerMaintenanceExport", propOrder = {
    "outCustomerSpmNumber",
    "checkCustomerMemberGroupIefSuppliedComments",
    "outActivityCustomerCategoryTmstamp",
    "outActivityGenericDetailDescription",
    "outActivityGenericDetailSerialNum",
    "outActivityTypeCustomerCategoryTmstamp",
    "outActivityTypeGenericDetailDescription",
    "outActivityTypeGenericDetailEntryStatus",
    "outActivityTypeGenericDetailShortDescription",
    "outAddressDistrictGenericDetailDescription",
    "outAddressDistrictGenericDetailSerialNum",
    "outAfmIssueCountryGenericDetailDescription",
    "outAfmIssueCountryGenericDetailShortDescription",
    "outAtenetCustCardInfoCardNo",
    "outAtenetCustCardInfoEndDate",
    "outAtenetCustCardInfoStartDate",
    "outAtractionGenericDetailDescription",
    "outAtractionGenericDetailSerialNum",
    "outAttractionBankemployeeFirstName",
    "outAttractionBankemployeeLastName",
    "outAttractionCustomerCategoryTmstamp",
    "outAttractionUsrCode",
    "outBankParametersBankParametersBankCode",
    "outBankParametersBankParametersWordPrint",
    "outBasileiaCustomerCategoryTmstamp",
    "outBasileiaGenericDetailDescription",
    "outBasileiaGenericDetailSerialNum",
    "outBasileiaGenericDetailShortDescription",
    "outBopCountryCustomerCategoryTmstamp",
    "outBopCountryGenericDetailDescription",
    "outBopCountryGenericDetailSerialNum",
    "outBopCountryGenericDetailShortDescription",
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
    "outCompanyCategGenericDetailSerialNum",
    "outCompanyCategGenericDetailShortDescription",
    "outCompanySubcategCustomerCategoryTmstamp",
    "outCompanySubcategGenericDetailDescription",
    "outCompanySubcategGenericDetailSerialNum",
    "outCompanySubcategGenericDetailShortDescription",
    "outCompanyTypeCustomerCategoryTmstamp",
    "outCompanyTypeGenericDetailDescription",
    "outCompanyTypeGenericDetailSerialNum",
    "outConditionsMembershipCustomerCategoryTmstamp",
    "outConditionsMembershipGenericDetailDescription",
    "outConditionsMembershipGenericDetailSerialNum",
    "outConditionsMembershipGenericDetailShortDescription",
    "outConfirmDoubtAfmIefSuppliedFlag",
    "outCountryGenericDetailDescription",
    "outCountryGenericDetailShortDescription",
    "outCustAddressAddress1",
    "outCustAddressAddress2",
    "outCustAddressAddressType",
    "outCustAddressCity",
    "outCustAddressEntryComments",
    "outCustAddressFaxNo",
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
    "outCustomerCertificCust",
    "outCustomerCertificDate",
    "outCustomerChamberComments",
    "outCustomerChamberId",
    "outCustomerCustStatus",
    "outCustomerDaiNumber",
    "outCustomerDateOfBirth",
    "outCustomerEMail",
    "outCustomerEntryComments",
    "outCustomerEntryStatus",
    "outCustomerExpireDate",
    "outCustomerFaxIndicator",
    "outCustomerFicliCode",
    "outCustomerFicliDesc",
    "outCustomerFinRange",
    "outCustomerFinRangeDt",
    "outCustomerFirstName",
    "outCustomerIncompleteUComnt",
    "outCustomerInstituteInvInd",
    "outCustomerInternetAddress",
    "outCustomerLastUpdate",
    "outCustomerLatinFirstname",
    "outCustomerLatinSurname",
    "outCustomerMobileTel",
    "outCustomerNoAfm",
    "outCustomerNonProfit",
    "outCustomerNonRegistered",
    "outCustomerNonResident",
    "outCustomerNonResidentForRep",
    "outCustomerPromocode",
    "outCustomerReprFirstname",
    "outCustomerReprPhone",
    "outCustomerReprSurname",
    "outCustomerSegmFlags",
    "outCustomerSepaAgrDt",
    "outCustomerSepaAgrFlg",
    "outCustomerShortName",
    "outCustomerSurname",
    "outCustomerSwiftAddress",
    "outCustomerSwiftConnectionInd",
    "outCustomerTelephone1",
    "outCustomerTelex",
    "outCustomerTelexConnection",
    "outCustomerTmstamp",
    "outCustomerVipInd",
    "outCustomerShareholdersSerialNum",
    "outCustomerShareholdersShareholderIdNumber",
    "outCustomerShareholdersShareholderIdType",
    "outCustomerShareholdersShareholderName",
    "outCustomerShareholdersSharesPerc",
    "outCustStockInfoNoOfShares",
    "outCustStockInfoShareholderInd",
    "outEconomicGroupCustomerCategoryTmstamp",
    "outEconomicGroupGenericDetailDescription",
    "outEconomicGroupGenericDetailSerialNum",
    "outEvalResultTeamInformationAuthorizationType",
    "outEvalResultTeamInformationEvaluationResult",
    "outEvalResultTeamInformationRequiredProfile1",
    "outEvalResultTeamInformationRequiredProfile2",
    "outGrpCustcatLength",
    "outGrpCustomerShareholdersLength",
    "outGrpLogLength",
    "outGrpSameAfmLength",
    "outKeyCustomerCDigit",
    "outKeyCustomerCustId",
    "outKeyOtherCustomerCDigit",
    "outKeyOtherCustomerCustId",
    "outLegalTypeCustomerCategoryTmstamp",
    "outLegalTypeGenericDetailDescription",
    "outLegalTypeGenericDetailSerialNum",
    "outMarketCustomerCategoryTmstamp",
    "outMarketGenericDetailDescription",
    "outMarketGenericDetailEntryStatus",
    "outMarketGenericDetailSerialNum",
    "outMonitoringUnitCode",
    "outMonitoringUnitUnitName",
    "outOfficeCountryGenericDetailDescription",
    "outOfficeCountryGenericDetailShortDescription",
    "outOfficeCustAddressAddress1",
    "outOfficeCustAddressAddressType",
    "outOfficeCustAddressCity",
    "outOfficeCustAddressEntryComments",
    "outOfficeCustAddressEntryStatus",
    "outOfficeCustAddressMailBox",
    "outOfficeCustAddressSerialNum",
    "outOfficeCustAddressTmstamp",
    "outOfficeCustAddressZipCode",
    "outOtherAfmAfmNo",
    "outOtherAfmSerialNo",
    "outOtherAfmTmstamp",
    "outPrintLineTime",
    "outRegionCustomerCategoryTmstamp",
    "outRegionGenericDetailDescription",
    "outRegionGenericDetailSerialNum",
    "outRegistryCountryGenericDetailDescription",
    "outRegistryCountryGenericDetailShortDescription",
    "outRegistryOtherIdExpiryDate",
    "outRegistryOtherIdIdNo",
    "outRegistryOtherIdIssueAuthority",
    "outRegistryOtherIdIssueDate",
    "outRegistryOtherIdSerialNo",
    "outRegistryOtherIdTmstamp",
    "outRmBankemployeeFirstName",
    "outRmBankemployeeLastName",
    "outRmUsrCode",
    "outSegmentCustomerCategoryTmstamp",
    "outSegmentGenericDetailDescription",
    "outSegmentGenericDetailEntryStatus",
    "outSegmentGenericDetailSerialNum",
    "outTaxOfficeId",
    "outTaxOfficeTaxOfficeName",
    "outThinkingCurrencyIdCurrency",
    "outThinkingCurrencyShortDescr",
    "outCustomerEnableFor24C",
    "outCustomerCustOpenDate",
    "outGrpCustcat",
    "outGrpCustomerShareholders",
    "outGrpSameAfm",
    "outMonitoringBankemployeeId",
    "outMonitoringBankemployeeFirstName",
    "outMonitoringBankemployeeLastName",
    "outOfficeAddressDistrictGenericDetailDescription",
    "outOfficeAddressDistrictGenericDetailShortDescription",
    "outOfficeAddressDistrictGenericDetailSerialNum",
    "outOfficeCustAddressAccomodationDate",
    "outOfficeCustAddressInternetAddress",
    "outOfficeCustAddressEMail",
    "outOfficeCustAddressTelephone3",
    "outOfficeCustAddressTelephone2",
    "outOfficeCustAddressAddress6",
    "outOfficeCustAddressAddress5",
    "outOfficeCustAddressAddress4",
    "outOfficeCustAddressAddress3",
    "outOfficeCustAddressSegmFlags",
    "outOfficeCustAddressLatinInd",
    "outOfficeCustAddressPtsInd",
    "outOfficeCustAddressFaxNo",
    "outOfficeCustAddressTelephone",
    "outOfficeCustAddressCommunicationAddress",
    "outOfficeCustAddressRegion",
    "outOfficeCustAddressAddress2",
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
    "outCustAddressMailBox",
    "outCustAddressPtsInd",
    "outCustAddressCommunicationAddress",
    "outCustAddressEntryStatus",
    "outCustomerNoOfBusinesses",
    "outCustomerMobileTel2",
    "outCustomerEMail2",
    "outOfficeCustAddrParrelDCode",
    "outOfficeCustAddrParrelDSn",
    "outOfficeCustAddrParrelDP01Desc",
    "outOfficeCustAddrParrelDP02Desc",
    "outOfficeCustAddrParrelDP03Desc",
    "outOfficeCustAddrParrelDP04Desc",
    "outOfficeCustAddrParrelDP05Desc",
    "outOfficeCustAddrParrelDP06Desc",
    "outOfficeCustAddrParrelDP07Desc",
    "outOfficeCustAddrParrelDP08Desc",
    "outOfficeCustAddrParrelDP09Desc",
    "outOfficeCustAddrParrelDP10Desc",
    "outCustAddrParrelDCode",
    "outCustAddrParrelDSn",
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
    "outCustomerCrmId",
    "outCustomerNumOfChildren",
    "outCustomerFamilyMembers",
    "outCustomerNoOfEmployees",
    "outCustomerPermEmployees"
})
public class CorporateCustomerMaintenanceExport
    extends BaseExport
{

    @XmlElement(name = "OutCustomerSpmNumber")
    protected String outCustomerSpmNumber;
    @XmlElement(name = "CheckCustomerMemberGroupIefSuppliedComments")
    protected String checkCustomerMemberGroupIefSuppliedComments;
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
    @XmlElement(name = "OutActivityTypeGenericDetailShortDescription")
    protected String outActivityTypeGenericDetailShortDescription;
    @XmlElement(name = "OutAddressDistrictGenericDetailDescription")
    protected String outAddressDistrictGenericDetailDescription;
    @XmlElement(name = "OutAddressDistrictGenericDetailSerialNum")
    protected int outAddressDistrictGenericDetailSerialNum;
    @XmlElement(name = "OutAfmIssueCountryGenericDetailDescription")
    protected String outAfmIssueCountryGenericDetailDescription;
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
    @XmlElement(name = "OutAtractionGenericDetailDescription")
    protected String outAtractionGenericDetailDescription;
    @XmlElement(name = "OutAtractionGenericDetailSerialNum")
    protected int outAtractionGenericDetailSerialNum;
    @XmlElement(name = "OutAttractionBankemployeeFirstName")
    protected String outAttractionBankemployeeFirstName;
    @XmlElement(name = "OutAttractionBankemployeeLastName")
    protected String outAttractionBankemployeeLastName;
    @XmlElement(name = "OutAttractionCustomerCategoryTmstamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outAttractionCustomerCategoryTmstamp;
    @XmlElement(name = "OutAttractionUsrCode")
    protected String outAttractionUsrCode;
    @XmlElement(name = "OutBankParametersBankParametersBankCode")
    protected short outBankParametersBankParametersBankCode;
    @XmlElement(name = "OutBankParametersBankParametersWordPrint")
    protected String outBankParametersBankParametersWordPrint;
    @XmlElement(name = "OutBasileiaCustomerCategoryTmstamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outBasileiaCustomerCategoryTmstamp;
    @XmlElement(name = "OutBasileiaGenericDetailDescription")
    protected String outBasileiaGenericDetailDescription;
    @XmlElement(name = "OutBasileiaGenericDetailSerialNum")
    protected int outBasileiaGenericDetailSerialNum;
    @XmlElement(name = "OutBasileiaGenericDetailShortDescription")
    protected String outBasileiaGenericDetailShortDescription;
    @XmlElement(name = "OutBopCountryCustomerCategoryTmstamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outBopCountryCustomerCategoryTmstamp;
    @XmlElement(name = "OutBopCountryGenericDetailDescription")
    protected String outBopCountryGenericDetailDescription;
    @XmlElement(name = "OutBopCountryGenericDetailSerialNum")
    protected int outBopCountryGenericDetailSerialNum;
    @XmlElement(name = "OutBopCountryGenericDetailShortDescription")
    protected String outBopCountryGenericDetailShortDescription;
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
    @XmlElement(name = "OutCompanyCategGenericDetailSerialNum")
    protected int outCompanyCategGenericDetailSerialNum;
    @XmlElement(name = "OutCompanyCategGenericDetailShortDescription")
    protected String outCompanyCategGenericDetailShortDescription;
    @XmlElement(name = "OutCompanySubcategCustomerCategoryTmstamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outCompanySubcategCustomerCategoryTmstamp;
    @XmlElement(name = "OutCompanySubcategGenericDetailDescription")
    protected String outCompanySubcategGenericDetailDescription;
    @XmlElement(name = "OutCompanySubcategGenericDetailSerialNum")
    protected int outCompanySubcategGenericDetailSerialNum;
    @XmlElement(name = "OutCompanySubcategGenericDetailShortDescription")
    protected String outCompanySubcategGenericDetailShortDescription;
    @XmlElement(name = "OutCompanyTypeCustomerCategoryTmstamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outCompanyTypeCustomerCategoryTmstamp;
    @XmlElement(name = "OutCompanyTypeGenericDetailDescription")
    protected String outCompanyTypeGenericDetailDescription;
    @XmlElement(name = "OutCompanyTypeGenericDetailSerialNum")
    protected int outCompanyTypeGenericDetailSerialNum;
    @XmlElement(name = "OutConditionsMembershipCustomerCategoryTmstamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outConditionsMembershipCustomerCategoryTmstamp;
    @XmlElement(name = "OutConditionsMembershipGenericDetailDescription")
    protected String outConditionsMembershipGenericDetailDescription;
    @XmlElement(name = "OutConditionsMembershipGenericDetailSerialNum")
    protected int outConditionsMembershipGenericDetailSerialNum;
    @XmlElement(name = "OutConditionsMembershipGenericDetailShortDescription")
    protected String outConditionsMembershipGenericDetailShortDescription;
    @XmlElement(name = "OutConfirmDoubtAfmIefSuppliedFlag")
    protected String outConfirmDoubtAfmIefSuppliedFlag;
    @XmlElement(name = "OutCountryGenericDetailDescription")
    protected String outCountryGenericDetailDescription;
    @XmlElement(name = "OutCountryGenericDetailShortDescription")
    protected String outCountryGenericDetailShortDescription;
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
    @XmlElement(name = "OutCustomerCertificCust")
    protected String outCustomerCertificCust;
    @XmlElement(name = "OutCustomerCertificDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outCustomerCertificDate;
    @XmlElement(name = "OutCustomerChamberComments")
    protected String outCustomerChamberComments;
    @XmlElement(name = "OutCustomerChamberId")
    protected String outCustomerChamberId;
    @XmlElement(name = "OutCustomerCustStatus")
    protected String outCustomerCustStatus;
    @XmlElement(name = "OutCustomerDaiNumber")
    protected String outCustomerDaiNumber;
    @XmlElement(name = "OutCustomerDateOfBirth", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outCustomerDateOfBirth;
    @XmlElement(name = "OutCustomerEMail")
    protected String outCustomerEMail;
    @XmlElement(name = "OutCustomerEntryComments")
    protected String outCustomerEntryComments;
    @XmlElement(name = "OutCustomerEntryStatus")
    protected String outCustomerEntryStatus;
    @XmlElement(name = "OutCustomerExpireDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outCustomerExpireDate;
    @XmlElement(name = "OutCustomerFaxIndicator")
    protected String outCustomerFaxIndicator;
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
    @XmlElement(name = "OutCustomerInstituteInvInd")
    protected String outCustomerInstituteInvInd;
    @XmlElement(name = "OutCustomerInternetAddress")
    protected String outCustomerInternetAddress;
    @XmlElement(name = "OutCustomerLastUpdate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outCustomerLastUpdate;
    @XmlElement(name = "OutCustomerLatinFirstname")
    protected String outCustomerLatinFirstname;
    @XmlElement(name = "OutCustomerLatinSurname")
    protected String outCustomerLatinSurname;
    @XmlElement(name = "OutCustomerMobileTel")
    protected String outCustomerMobileTel;
    @XmlElement(name = "OutCustomerNoAfm")
    protected String outCustomerNoAfm;
    @XmlElement(name = "OutCustomerNonProfit")
    protected String outCustomerNonProfit;
    @XmlElement(name = "OutCustomerNonRegistered")
    protected String outCustomerNonRegistered;
    @XmlElement(name = "OutCustomerNonResident")
    protected String outCustomerNonResident;
    @XmlElement(name = "OutCustomerNonResidentForRep")
    protected String outCustomerNonResidentForRep;
    @XmlElement(name = "OutCustomerPromocode")
    protected String outCustomerPromocode;
    @XmlElement(name = "OutCustomerReprFirstname")
    protected String outCustomerReprFirstname;
    @XmlElement(name = "OutCustomerReprPhone")
    protected String outCustomerReprPhone;
    @XmlElement(name = "OutCustomerReprSurname")
    protected String outCustomerReprSurname;
    @XmlElement(name = "OutCustomerSegmFlags")
    protected String outCustomerSegmFlags;
    @XmlElement(name = "OutCustomerSepaAgrDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outCustomerSepaAgrDt;
    @XmlElement(name = "OutCustomerSepaAgrFlg")
    protected String outCustomerSepaAgrFlg;
    @XmlElement(name = "OutCustomerShortName")
    protected String outCustomerShortName;
    @XmlElement(name = "OutCustomerSurname")
    protected String outCustomerSurname;
    @XmlElement(name = "OutCustomerSwiftAddress")
    protected String outCustomerSwiftAddress;
    @XmlElement(name = "OutCustomerSwiftConnectionInd")
    protected String outCustomerSwiftConnectionInd;
    @XmlElement(name = "OutCustomerTelephone1")
    protected String outCustomerTelephone1;
    @XmlElement(name = "OutCustomerTelex")
    protected String outCustomerTelex;
    @XmlElement(name = "OutCustomerTelexConnection")
    protected String outCustomerTelexConnection;
    @XmlElement(name = "OutCustomerTmstamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outCustomerTmstamp;
    @XmlElement(name = "OutCustomerVipInd")
    protected String outCustomerVipInd;
    @XmlElement(name = "OutCustomerShareholdersSerialNum")
    protected short outCustomerShareholdersSerialNum;
    @XmlElement(name = "OutCustomerShareholdersShareholderIdNumber")
    protected String outCustomerShareholdersShareholderIdNumber;
    @XmlElement(name = "OutCustomerShareholdersShareholderIdType")
    protected String outCustomerShareholdersShareholderIdType;
    @XmlElement(name = "OutCustomerShareholdersShareholderName")
    protected String outCustomerShareholdersShareholderName;
    @XmlElement(name = "OutCustomerShareholdersSharesPerc", required = true)
    protected BigDecimal outCustomerShareholdersSharesPerc;
    @XmlElement(name = "OutCustStockInfoNoOfShares")
    protected int outCustStockInfoNoOfShares;
    @XmlElement(name = "OutCustStockInfoShareholderInd")
    protected String outCustStockInfoShareholderInd;
    @XmlElement(name = "OutEconomicGroupCustomerCategoryTmstamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outEconomicGroupCustomerCategoryTmstamp;
    @XmlElement(name = "OutEconomicGroupGenericDetailDescription")
    protected String outEconomicGroupGenericDetailDescription;
    @XmlElement(name = "OutEconomicGroupGenericDetailSerialNum")
    protected int outEconomicGroupGenericDetailSerialNum;
    @XmlElement(name = "OutEvalResultTeamInformationAuthorizationType")
    protected String outEvalResultTeamInformationAuthorizationType;
    @XmlElement(name = "OutEvalResultTeamInformationEvaluationResult")
    protected String outEvalResultTeamInformationEvaluationResult;
    @XmlElement(name = "OutEvalResultTeamInformationRequiredProfile1")
    protected String outEvalResultTeamInformationRequiredProfile1;
    @XmlElement(name = "OutEvalResultTeamInformationRequiredProfile2")
    protected String outEvalResultTeamInformationRequiredProfile2;
    @XmlElement(name = "OutGrpCustcatLength")
    protected int outGrpCustcatLength;
    @XmlElement(name = "OutGrpCustomerShareholdersLength")
    protected int outGrpCustomerShareholdersLength;
    @XmlElement(name = "OutGrpLogLength")
    protected int outGrpLogLength;
    @XmlElement(name = "OutGrpSameAfmLength")
    protected int outGrpSameAfmLength;
    @XmlElement(name = "OutKeyCustomerCDigit")
    protected short outKeyCustomerCDigit;
    @XmlElement(name = "OutKeyCustomerCustId")
    protected int outKeyCustomerCustId;
    @XmlElement(name = "OutKeyOtherCustomerCDigit")
    protected short outKeyOtherCustomerCDigit;
    @XmlElement(name = "OutKeyOtherCustomerCustId")
    protected int outKeyOtherCustomerCustId;
    @XmlElement(name = "OutLegalTypeCustomerCategoryTmstamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outLegalTypeCustomerCategoryTmstamp;
    @XmlElement(name = "OutLegalTypeGenericDetailDescription")
    protected String outLegalTypeGenericDetailDescription;
    @XmlElement(name = "OutLegalTypeGenericDetailSerialNum")
    protected int outLegalTypeGenericDetailSerialNum;
    @XmlElement(name = "OutMarketCustomerCategoryTmstamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outMarketCustomerCategoryTmstamp;
    @XmlElement(name = "OutMarketGenericDetailDescription")
    protected String outMarketGenericDetailDescription;
    @XmlElement(name = "OutMarketGenericDetailEntryStatus")
    protected String outMarketGenericDetailEntryStatus;
    @XmlElement(name = "OutMarketGenericDetailSerialNum")
    protected int outMarketGenericDetailSerialNum;
    @XmlElement(name = "OutMonitoringUnitCode")
    protected int outMonitoringUnitCode;
    @XmlElement(name = "OutMonitoringUnitUnitName")
    protected String outMonitoringUnitUnitName;
    @XmlElement(name = "OutOfficeCountryGenericDetailDescription")
    protected String outOfficeCountryGenericDetailDescription;
    @XmlElement(name = "OutOfficeCountryGenericDetailShortDescription")
    protected String outOfficeCountryGenericDetailShortDescription;
    @XmlElement(name = "OutOfficeCustAddressAddress1")
    protected String outOfficeCustAddressAddress1;
    @XmlElement(name = "OutOfficeCustAddressAddressType")
    protected String outOfficeCustAddressAddressType;
    @XmlElement(name = "OutOfficeCustAddressCity")
    protected String outOfficeCustAddressCity;
    @XmlElement(name = "OutOfficeCustAddressEntryComments")
    protected String outOfficeCustAddressEntryComments;
    @XmlElement(name = "OutOfficeCustAddressEntryStatus")
    protected String outOfficeCustAddressEntryStatus;
    @XmlElement(name = "OutOfficeCustAddressMailBox")
    protected String outOfficeCustAddressMailBox;
    @XmlElement(name = "OutOfficeCustAddressSerialNum")
    protected short outOfficeCustAddressSerialNum;
    @XmlElement(name = "OutOfficeCustAddressTmstamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outOfficeCustAddressTmstamp;
    @XmlElement(name = "OutOfficeCustAddressZipCode")
    protected String outOfficeCustAddressZipCode;
    @XmlElement(name = "OutOtherAfmAfmNo")
    protected String outOtherAfmAfmNo;
    @XmlElement(name = "OutOtherAfmSerialNo")
    protected short outOtherAfmSerialNo;
    @XmlElement(name = "OutOtherAfmTmstamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outOtherAfmTmstamp;
    @XmlElement(name = "OutPrintLineTime", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outPrintLineTime;
    @XmlElement(name = "OutRegionCustomerCategoryTmstamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outRegionCustomerCategoryTmstamp;
    @XmlElement(name = "OutRegionGenericDetailDescription")
    protected String outRegionGenericDetailDescription;
    @XmlElement(name = "OutRegionGenericDetailSerialNum")
    protected int outRegionGenericDetailSerialNum;
    @XmlElement(name = "OutRegistryCountryGenericDetailDescription")
    protected String outRegistryCountryGenericDetailDescription;
    @XmlElement(name = "OutRegistryCountryGenericDetailShortDescription")
    protected String outRegistryCountryGenericDetailShortDescription;
    @XmlElement(name = "OutRegistryOtherIdExpiryDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outRegistryOtherIdExpiryDate;
    @XmlElement(name = "OutRegistryOtherIdIdNo")
    protected String outRegistryOtherIdIdNo;
    @XmlElement(name = "OutRegistryOtherIdIssueAuthority")
    protected String outRegistryOtherIdIssueAuthority;
    @XmlElement(name = "OutRegistryOtherIdIssueDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outRegistryOtherIdIssueDate;
    @XmlElement(name = "OutRegistryOtherIdSerialNo")
    protected short outRegistryOtherIdSerialNo;
    @XmlElement(name = "OutRegistryOtherIdTmstamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outRegistryOtherIdTmstamp;
    @XmlElement(name = "OutRmBankemployeeFirstName")
    protected String outRmBankemployeeFirstName;
    @XmlElement(name = "OutRmBankemployeeLastName")
    protected String outRmBankemployeeLastName;
    @XmlElement(name = "OutRmUsrCode")
    protected String outRmUsrCode;
    @XmlElement(name = "OutSegmentCustomerCategoryTmstamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outSegmentCustomerCategoryTmstamp;
    @XmlElement(name = "OutSegmentGenericDetailDescription")
    protected String outSegmentGenericDetailDescription;
    @XmlElement(name = "OutSegmentGenericDetailEntryStatus")
    protected String outSegmentGenericDetailEntryStatus;
    @XmlElement(name = "OutSegmentGenericDetailSerialNum")
    protected int outSegmentGenericDetailSerialNum;
    @XmlElement(name = "OutTaxOfficeId")
    protected short outTaxOfficeId;
    @XmlElement(name = "OutTaxOfficeTaxOfficeName")
    protected String outTaxOfficeTaxOfficeName;
    @XmlElement(name = "OutThinkingCurrencyIdCurrency")
    protected int outThinkingCurrencyIdCurrency;
    @XmlElement(name = "OutThinkingCurrencyShortDescr")
    protected String outThinkingCurrencyShortDescr;
    @XmlElement(name = "OutCustomerEnableFor24c")
    protected String outCustomerEnableFor24C;
    @XmlElement(name = "OutCustomerCustOpenDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outCustomerCustOpenDate;
    @XmlElement(name = "OutGrpCustcat")
    protected ArrayOfOutGrpCustcatC outGrpCustcat;
    @XmlElement(name = "OutGrpCustomerShareholders")
    protected ArrayOfOutGrpCustomerShareholders outGrpCustomerShareholders;
    @XmlElement(name = "OutGrpSameAfm")
    protected ArrayOfOutGrpSameAfmC outGrpSameAfm;
    @XmlElement(name = "OutMonitoringBankemployeeId")
    protected String outMonitoringBankemployeeId;
    @XmlElement(name = "OutMonitoringBankemployeeFirstName")
    protected String outMonitoringBankemployeeFirstName;
    @XmlElement(name = "OutMonitoringBankemployeeLastName")
    protected String outMonitoringBankemployeeLastName;
    @XmlElement(name = "OutOfficeAddressDistrictGenericDetailDescription")
    protected String outOfficeAddressDistrictGenericDetailDescription;
    @XmlElement(name = "OutOfficeAddressDistrictGenericDetailShortDescription")
    protected String outOfficeAddressDistrictGenericDetailShortDescription;
    @XmlElement(name = "OutOfficeAddressDistrictGenericDetailSerialNum")
    protected int outOfficeAddressDistrictGenericDetailSerialNum;
    @XmlElement(name = "OutOfficeCustAddressAccomodationDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outOfficeCustAddressAccomodationDate;
    @XmlElement(name = "OutOfficeCustAddressInternetAddress")
    protected String outOfficeCustAddressInternetAddress;
    @XmlElement(name = "OutOfficeCustAddressEMail")
    protected String outOfficeCustAddressEMail;
    @XmlElement(name = "OutOfficeCustAddressTelephone3")
    protected String outOfficeCustAddressTelephone3;
    @XmlElement(name = "OutOfficeCustAddressTelephone2")
    protected String outOfficeCustAddressTelephone2;
    @XmlElement(name = "OutOfficeCustAddressAddress6")
    protected String outOfficeCustAddressAddress6;
    @XmlElement(name = "OutOfficeCustAddressAddress5")
    protected String outOfficeCustAddressAddress5;
    @XmlElement(name = "OutOfficeCustAddressAddress4")
    protected String outOfficeCustAddressAddress4;
    @XmlElement(name = "OutOfficeCustAddressAddress3")
    protected String outOfficeCustAddressAddress3;
    @XmlElement(name = "OutOfficeCustAddressSegmFlags")
    protected String outOfficeCustAddressSegmFlags;
    @XmlElement(name = "OutOfficeCustAddressLatinInd")
    protected String outOfficeCustAddressLatinInd;
    @XmlElement(name = "OutOfficeCustAddressPtsInd")
    protected String outOfficeCustAddressPtsInd;
    @XmlElement(name = "OutOfficeCustAddressFaxNo")
    protected String outOfficeCustAddressFaxNo;
    @XmlElement(name = "OutOfficeCustAddressTelephone")
    protected String outOfficeCustAddressTelephone;
    @XmlElement(name = "OutOfficeCustAddressCommunicationAddress")
    protected String outOfficeCustAddressCommunicationAddress;
    @XmlElement(name = "OutOfficeCustAddressRegion")
    protected String outOfficeCustAddressRegion;
    @XmlElement(name = "OutOfficeCustAddressAddress2")
    protected String outOfficeCustAddressAddress2;
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
    @XmlElement(name = "OutCustAddressMailBox")
    protected String outCustAddressMailBox;
    @XmlElement(name = "OutCustAddressPtsInd")
    protected String outCustAddressPtsInd;
    @XmlElement(name = "OutCustAddressCommunicationAddress")
    protected String outCustAddressCommunicationAddress;
    @XmlElement(name = "OutCustAddressEntryStatus")
    protected String outCustAddressEntryStatus;
    @XmlElement(name = "OutCustomerNoOfBusinesses")
    protected int outCustomerNoOfBusinesses;
    @XmlElement(name = "OutCustomerMobileTel2")
    protected String outCustomerMobileTel2;
    @XmlElement(name = "OutCustomerEMail2")
    protected String outCustomerEMail2;
    @XmlElement(name = "OutOfficeCustAddrParrelDCode")
    protected String outOfficeCustAddrParrelDCode;
    @XmlElement(name = "OutOfficeCustAddrParrelDSn")
    protected int outOfficeCustAddrParrelDSn;
    @XmlElement(name = "OutOfficeCustAddrParrelDP01Desc")
    protected String outOfficeCustAddrParrelDP01Desc;
    @XmlElement(name = "OutOfficeCustAddrParrelDP02Desc")
    protected String outOfficeCustAddrParrelDP02Desc;
    @XmlElement(name = "OutOfficeCustAddrParrelDP03Desc")
    protected String outOfficeCustAddrParrelDP03Desc;
    @XmlElement(name = "OutOfficeCustAddrParrelDP04Desc")
    protected String outOfficeCustAddrParrelDP04Desc;
    @XmlElement(name = "OutOfficeCustAddrParrelDP05Desc")
    protected String outOfficeCustAddrParrelDP05Desc;
    @XmlElement(name = "OutOfficeCustAddrParrelDP06Desc")
    protected String outOfficeCustAddrParrelDP06Desc;
    @XmlElement(name = "OutOfficeCustAddrParrelDP07Desc")
    protected String outOfficeCustAddrParrelDP07Desc;
    @XmlElement(name = "OutOfficeCustAddrParrelDP08Desc")
    protected String outOfficeCustAddrParrelDP08Desc;
    @XmlElement(name = "OutOfficeCustAddrParrelDP09Desc")
    protected String outOfficeCustAddrParrelDP09Desc;
    @XmlElement(name = "OutOfficeCustAddrParrelDP10Desc")
    protected String outOfficeCustAddrParrelDP10Desc;
    @XmlElement(name = "OutCustAddrParrelDCode")
    protected String outCustAddrParrelDCode;
    @XmlElement(name = "OutCustAddrParrelDSn")
    protected int outCustAddrParrelDSn;
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
    @XmlElement(name = "OutCustomerNumOfChildren")
    protected short outCustomerNumOfChildren;
    @XmlElement(name = "OutCustomerFamilyMembers")
    protected short outCustomerFamilyMembers;
    @XmlElement(name = "OutCustomerNoOfEmployees")
    protected int outCustomerNoOfEmployees;
    @XmlElement(name = "OutCustomerPermEmployees")
    protected int outCustomerPermEmployees;

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
     * Gets the value of the checkCustomerMemberGroupIefSuppliedComments property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCheckCustomerMemberGroupIefSuppliedComments() {
        return checkCustomerMemberGroupIefSuppliedComments;
    }

    /**
     * Sets the value of the checkCustomerMemberGroupIefSuppliedComments property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCheckCustomerMemberGroupIefSuppliedComments(String value) {
        this.checkCustomerMemberGroupIefSuppliedComments = value;
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
     * Gets the value of the outAtractionGenericDetailDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutAtractionGenericDetailDescription() {
        return outAtractionGenericDetailDescription;
    }

    /**
     * Sets the value of the outAtractionGenericDetailDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutAtractionGenericDetailDescription(String value) {
        this.outAtractionGenericDetailDescription = value;
    }

    /**
     * Gets the value of the outAtractionGenericDetailSerialNum property.
     * 
     */
    public int getOutAtractionGenericDetailSerialNum() {
        return outAtractionGenericDetailSerialNum;
    }

    /**
     * Sets the value of the outAtractionGenericDetailSerialNum property.
     * 
     */
    public void setOutAtractionGenericDetailSerialNum(int value) {
        this.outAtractionGenericDetailSerialNum = value;
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
     * Gets the value of the outBopCountryCustomerCategoryTmstamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutBopCountryCustomerCategoryTmstamp() {
        return outBopCountryCustomerCategoryTmstamp;
    }

    /**
     * Sets the value of the outBopCountryCustomerCategoryTmstamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutBopCountryCustomerCategoryTmstamp(XMLGregorianCalendar value) {
        this.outBopCountryCustomerCategoryTmstamp = value;
    }

    /**
     * Gets the value of the outBopCountryGenericDetailDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutBopCountryGenericDetailDescription() {
        return outBopCountryGenericDetailDescription;
    }

    /**
     * Sets the value of the outBopCountryGenericDetailDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutBopCountryGenericDetailDescription(String value) {
        this.outBopCountryGenericDetailDescription = value;
    }

    /**
     * Gets the value of the outBopCountryGenericDetailSerialNum property.
     * 
     */
    public int getOutBopCountryGenericDetailSerialNum() {
        return outBopCountryGenericDetailSerialNum;
    }

    /**
     * Sets the value of the outBopCountryGenericDetailSerialNum property.
     * 
     */
    public void setOutBopCountryGenericDetailSerialNum(int value) {
        this.outBopCountryGenericDetailSerialNum = value;
    }

    /**
     * Gets the value of the outBopCountryGenericDetailShortDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutBopCountryGenericDetailShortDescription() {
        return outBopCountryGenericDetailShortDescription;
    }

    /**
     * Sets the value of the outBopCountryGenericDetailShortDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutBopCountryGenericDetailShortDescription(String value) {
        this.outBopCountryGenericDetailShortDescription = value;
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
     * Gets the value of the outCompanySubcategCustomerCategoryTmstamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutCompanySubcategCustomerCategoryTmstamp() {
        return outCompanySubcategCustomerCategoryTmstamp;
    }

    /**
     * Sets the value of the outCompanySubcategCustomerCategoryTmstamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutCompanySubcategCustomerCategoryTmstamp(XMLGregorianCalendar value) {
        this.outCompanySubcategCustomerCategoryTmstamp = value;
    }

    /**
     * Gets the value of the outCompanySubcategGenericDetailDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCompanySubcategGenericDetailDescription() {
        return outCompanySubcategGenericDetailDescription;
    }

    /**
     * Sets the value of the outCompanySubcategGenericDetailDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCompanySubcategGenericDetailDescription(String value) {
        this.outCompanySubcategGenericDetailDescription = value;
    }

    /**
     * Gets the value of the outCompanySubcategGenericDetailSerialNum property.
     * 
     */
    public int getOutCompanySubcategGenericDetailSerialNum() {
        return outCompanySubcategGenericDetailSerialNum;
    }

    /**
     * Sets the value of the outCompanySubcategGenericDetailSerialNum property.
     * 
     */
    public void setOutCompanySubcategGenericDetailSerialNum(int value) {
        this.outCompanySubcategGenericDetailSerialNum = value;
    }

    /**
     * Gets the value of the outCompanySubcategGenericDetailShortDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCompanySubcategGenericDetailShortDescription() {
        return outCompanySubcategGenericDetailShortDescription;
    }

    /**
     * Sets the value of the outCompanySubcategGenericDetailShortDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCompanySubcategGenericDetailShortDescription(String value) {
        this.outCompanySubcategGenericDetailShortDescription = value;
    }

    /**
     * Gets the value of the outCompanyTypeCustomerCategoryTmstamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutCompanyTypeCustomerCategoryTmstamp() {
        return outCompanyTypeCustomerCategoryTmstamp;
    }

    /**
     * Sets the value of the outCompanyTypeCustomerCategoryTmstamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutCompanyTypeCustomerCategoryTmstamp(XMLGregorianCalendar value) {
        this.outCompanyTypeCustomerCategoryTmstamp = value;
    }

    /**
     * Gets the value of the outCompanyTypeGenericDetailDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCompanyTypeGenericDetailDescription() {
        return outCompanyTypeGenericDetailDescription;
    }

    /**
     * Sets the value of the outCompanyTypeGenericDetailDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCompanyTypeGenericDetailDescription(String value) {
        this.outCompanyTypeGenericDetailDescription = value;
    }

    /**
     * Gets the value of the outCompanyTypeGenericDetailSerialNum property.
     * 
     */
    public int getOutCompanyTypeGenericDetailSerialNum() {
        return outCompanyTypeGenericDetailSerialNum;
    }

    /**
     * Sets the value of the outCompanyTypeGenericDetailSerialNum property.
     * 
     */
    public void setOutCompanyTypeGenericDetailSerialNum(int value) {
        this.outCompanyTypeGenericDetailSerialNum = value;
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
     * Gets the value of the outConfirmDoubtAfmIefSuppliedFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutConfirmDoubtAfmIefSuppliedFlag() {
        return outConfirmDoubtAfmIefSuppliedFlag;
    }

    /**
     * Sets the value of the outConfirmDoubtAfmIefSuppliedFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutConfirmDoubtAfmIefSuppliedFlag(String value) {
        this.outConfirmDoubtAfmIefSuppliedFlag = value;
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
     * Gets the value of the outCountryGenericDetailShortDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCountryGenericDetailShortDescription() {
        return outCountryGenericDetailShortDescription;
    }

    /**
     * Sets the value of the outCountryGenericDetailShortDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCountryGenericDetailShortDescription(String value) {
        this.outCountryGenericDetailShortDescription = value;
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
     * Gets the value of the outCustomerFaxIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCustomerFaxIndicator() {
        return outCustomerFaxIndicator;
    }

    /**
     * Sets the value of the outCustomerFaxIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCustomerFaxIndicator(String value) {
        this.outCustomerFaxIndicator = value;
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
     * Gets the value of the outCustomerInstituteInvInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCustomerInstituteInvInd() {
        return outCustomerInstituteInvInd;
    }

    /**
     * Sets the value of the outCustomerInstituteInvInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCustomerInstituteInvInd(String value) {
        this.outCustomerInstituteInvInd = value;
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
     * Gets the value of the outCustomerNonProfit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCustomerNonProfit() {
        return outCustomerNonProfit;
    }

    /**
     * Sets the value of the outCustomerNonProfit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCustomerNonProfit(String value) {
        this.outCustomerNonProfit = value;
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
     * Gets the value of the outCustomerReprFirstname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCustomerReprFirstname() {
        return outCustomerReprFirstname;
    }

    /**
     * Sets the value of the outCustomerReprFirstname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCustomerReprFirstname(String value) {
        this.outCustomerReprFirstname = value;
    }

    /**
     * Gets the value of the outCustomerReprPhone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCustomerReprPhone() {
        return outCustomerReprPhone;
    }

    /**
     * Sets the value of the outCustomerReprPhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCustomerReprPhone(String value) {
        this.outCustomerReprPhone = value;
    }

    /**
     * Gets the value of the outCustomerReprSurname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCustomerReprSurname() {
        return outCustomerReprSurname;
    }

    /**
     * Sets the value of the outCustomerReprSurname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCustomerReprSurname(String value) {
        this.outCustomerReprSurname = value;
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
     * Gets the value of the outCustomerSwiftConnectionInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCustomerSwiftConnectionInd() {
        return outCustomerSwiftConnectionInd;
    }

    /**
     * Sets the value of the outCustomerSwiftConnectionInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCustomerSwiftConnectionInd(String value) {
        this.outCustomerSwiftConnectionInd = value;
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
     * Gets the value of the outCustomerShareholdersSerialNum property.
     * 
     */
    public short getOutCustomerShareholdersSerialNum() {
        return outCustomerShareholdersSerialNum;
    }

    /**
     * Sets the value of the outCustomerShareholdersSerialNum property.
     * 
     */
    public void setOutCustomerShareholdersSerialNum(short value) {
        this.outCustomerShareholdersSerialNum = value;
    }

    /**
     * Gets the value of the outCustomerShareholdersShareholderIdNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCustomerShareholdersShareholderIdNumber() {
        return outCustomerShareholdersShareholderIdNumber;
    }

    /**
     * Sets the value of the outCustomerShareholdersShareholderIdNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCustomerShareholdersShareholderIdNumber(String value) {
        this.outCustomerShareholdersShareholderIdNumber = value;
    }

    /**
     * Gets the value of the outCustomerShareholdersShareholderIdType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCustomerShareholdersShareholderIdType() {
        return outCustomerShareholdersShareholderIdType;
    }

    /**
     * Sets the value of the outCustomerShareholdersShareholderIdType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCustomerShareholdersShareholderIdType(String value) {
        this.outCustomerShareholdersShareholderIdType = value;
    }

    /**
     * Gets the value of the outCustomerShareholdersShareholderName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCustomerShareholdersShareholderName() {
        return outCustomerShareholdersShareholderName;
    }

    /**
     * Sets the value of the outCustomerShareholdersShareholderName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCustomerShareholdersShareholderName(String value) {
        this.outCustomerShareholdersShareholderName = value;
    }

    /**
     * Gets the value of the outCustomerShareholdersSharesPerc property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutCustomerShareholdersSharesPerc() {
        return outCustomerShareholdersSharesPerc;
    }

    /**
     * Sets the value of the outCustomerShareholdersSharesPerc property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutCustomerShareholdersSharesPerc(BigDecimal value) {
        this.outCustomerShareholdersSharesPerc = value;
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
     * Gets the value of the outEconomicGroupCustomerCategoryTmstamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutEconomicGroupCustomerCategoryTmstamp() {
        return outEconomicGroupCustomerCategoryTmstamp;
    }

    /**
     * Sets the value of the outEconomicGroupCustomerCategoryTmstamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutEconomicGroupCustomerCategoryTmstamp(XMLGregorianCalendar value) {
        this.outEconomicGroupCustomerCategoryTmstamp = value;
    }

    /**
     * Gets the value of the outEconomicGroupGenericDetailDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutEconomicGroupGenericDetailDescription() {
        return outEconomicGroupGenericDetailDescription;
    }

    /**
     * Sets the value of the outEconomicGroupGenericDetailDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutEconomicGroupGenericDetailDescription(String value) {
        this.outEconomicGroupGenericDetailDescription = value;
    }

    /**
     * Gets the value of the outEconomicGroupGenericDetailSerialNum property.
     * 
     */
    public int getOutEconomicGroupGenericDetailSerialNum() {
        return outEconomicGroupGenericDetailSerialNum;
    }

    /**
     * Sets the value of the outEconomicGroupGenericDetailSerialNum property.
     * 
     */
    public void setOutEconomicGroupGenericDetailSerialNum(int value) {
        this.outEconomicGroupGenericDetailSerialNum = value;
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
     * Gets the value of the outGrpCustomerShareholdersLength property.
     * 
     */
    public int getOutGrpCustomerShareholdersLength() {
        return outGrpCustomerShareholdersLength;
    }

    /**
     * Sets the value of the outGrpCustomerShareholdersLength property.
     * 
     */
    public void setOutGrpCustomerShareholdersLength(int value) {
        this.outGrpCustomerShareholdersLength = value;
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
     * Gets the value of the outLegalTypeCustomerCategoryTmstamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutLegalTypeCustomerCategoryTmstamp() {
        return outLegalTypeCustomerCategoryTmstamp;
    }

    /**
     * Sets the value of the outLegalTypeCustomerCategoryTmstamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutLegalTypeCustomerCategoryTmstamp(XMLGregorianCalendar value) {
        this.outLegalTypeCustomerCategoryTmstamp = value;
    }

    /**
     * Gets the value of the outLegalTypeGenericDetailDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutLegalTypeGenericDetailDescription() {
        return outLegalTypeGenericDetailDescription;
    }

    /**
     * Sets the value of the outLegalTypeGenericDetailDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutLegalTypeGenericDetailDescription(String value) {
        this.outLegalTypeGenericDetailDescription = value;
    }

    /**
     * Gets the value of the outLegalTypeGenericDetailSerialNum property.
     * 
     */
    public int getOutLegalTypeGenericDetailSerialNum() {
        return outLegalTypeGenericDetailSerialNum;
    }

    /**
     * Sets the value of the outLegalTypeGenericDetailSerialNum property.
     * 
     */
    public void setOutLegalTypeGenericDetailSerialNum(int value) {
        this.outLegalTypeGenericDetailSerialNum = value;
    }

    /**
     * Gets the value of the outMarketCustomerCategoryTmstamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutMarketCustomerCategoryTmstamp() {
        return outMarketCustomerCategoryTmstamp;
    }

    /**
     * Sets the value of the outMarketCustomerCategoryTmstamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutMarketCustomerCategoryTmstamp(XMLGregorianCalendar value) {
        this.outMarketCustomerCategoryTmstamp = value;
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
     * Gets the value of the outOfficeCountryGenericDetailDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutOfficeCountryGenericDetailDescription() {
        return outOfficeCountryGenericDetailDescription;
    }

    /**
     * Sets the value of the outOfficeCountryGenericDetailDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutOfficeCountryGenericDetailDescription(String value) {
        this.outOfficeCountryGenericDetailDescription = value;
    }

    /**
     * Gets the value of the outOfficeCountryGenericDetailShortDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutOfficeCountryGenericDetailShortDescription() {
        return outOfficeCountryGenericDetailShortDescription;
    }

    /**
     * Sets the value of the outOfficeCountryGenericDetailShortDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutOfficeCountryGenericDetailShortDescription(String value) {
        this.outOfficeCountryGenericDetailShortDescription = value;
    }

    /**
     * Gets the value of the outOfficeCustAddressAddress1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutOfficeCustAddressAddress1() {
        return outOfficeCustAddressAddress1;
    }

    /**
     * Sets the value of the outOfficeCustAddressAddress1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutOfficeCustAddressAddress1(String value) {
        this.outOfficeCustAddressAddress1 = value;
    }

    /**
     * Gets the value of the outOfficeCustAddressAddressType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutOfficeCustAddressAddressType() {
        return outOfficeCustAddressAddressType;
    }

    /**
     * Sets the value of the outOfficeCustAddressAddressType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutOfficeCustAddressAddressType(String value) {
        this.outOfficeCustAddressAddressType = value;
    }

    /**
     * Gets the value of the outOfficeCustAddressCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutOfficeCustAddressCity() {
        return outOfficeCustAddressCity;
    }

    /**
     * Sets the value of the outOfficeCustAddressCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutOfficeCustAddressCity(String value) {
        this.outOfficeCustAddressCity = value;
    }

    /**
     * Gets the value of the outOfficeCustAddressEntryComments property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutOfficeCustAddressEntryComments() {
        return outOfficeCustAddressEntryComments;
    }

    /**
     * Sets the value of the outOfficeCustAddressEntryComments property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutOfficeCustAddressEntryComments(String value) {
        this.outOfficeCustAddressEntryComments = value;
    }

    /**
     * Gets the value of the outOfficeCustAddressEntryStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutOfficeCustAddressEntryStatus() {
        return outOfficeCustAddressEntryStatus;
    }

    /**
     * Sets the value of the outOfficeCustAddressEntryStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutOfficeCustAddressEntryStatus(String value) {
        this.outOfficeCustAddressEntryStatus = value;
    }

    /**
     * Gets the value of the outOfficeCustAddressMailBox property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutOfficeCustAddressMailBox() {
        return outOfficeCustAddressMailBox;
    }

    /**
     * Sets the value of the outOfficeCustAddressMailBox property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutOfficeCustAddressMailBox(String value) {
        this.outOfficeCustAddressMailBox = value;
    }

    /**
     * Gets the value of the outOfficeCustAddressSerialNum property.
     * 
     */
    public short getOutOfficeCustAddressSerialNum() {
        return outOfficeCustAddressSerialNum;
    }

    /**
     * Sets the value of the outOfficeCustAddressSerialNum property.
     * 
     */
    public void setOutOfficeCustAddressSerialNum(short value) {
        this.outOfficeCustAddressSerialNum = value;
    }

    /**
     * Gets the value of the outOfficeCustAddressTmstamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutOfficeCustAddressTmstamp() {
        return outOfficeCustAddressTmstamp;
    }

    /**
     * Sets the value of the outOfficeCustAddressTmstamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutOfficeCustAddressTmstamp(XMLGregorianCalendar value) {
        this.outOfficeCustAddressTmstamp = value;
    }

    /**
     * Gets the value of the outOfficeCustAddressZipCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutOfficeCustAddressZipCode() {
        return outOfficeCustAddressZipCode;
    }

    /**
     * Sets the value of the outOfficeCustAddressZipCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutOfficeCustAddressZipCode(String value) {
        this.outOfficeCustAddressZipCode = value;
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
     * Gets the value of the outRegistryCountryGenericDetailDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutRegistryCountryGenericDetailDescription() {
        return outRegistryCountryGenericDetailDescription;
    }

    /**
     * Sets the value of the outRegistryCountryGenericDetailDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutRegistryCountryGenericDetailDescription(String value) {
        this.outRegistryCountryGenericDetailDescription = value;
    }

    /**
     * Gets the value of the outRegistryCountryGenericDetailShortDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutRegistryCountryGenericDetailShortDescription() {
        return outRegistryCountryGenericDetailShortDescription;
    }

    /**
     * Sets the value of the outRegistryCountryGenericDetailShortDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutRegistryCountryGenericDetailShortDescription(String value) {
        this.outRegistryCountryGenericDetailShortDescription = value;
    }

    /**
     * Gets the value of the outRegistryOtherIdExpiryDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutRegistryOtherIdExpiryDate() {
        return outRegistryOtherIdExpiryDate;
    }

    /**
     * Sets the value of the outRegistryOtherIdExpiryDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutRegistryOtherIdExpiryDate(XMLGregorianCalendar value) {
        this.outRegistryOtherIdExpiryDate = value;
    }

    /**
     * Gets the value of the outRegistryOtherIdIdNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutRegistryOtherIdIdNo() {
        return outRegistryOtherIdIdNo;
    }

    /**
     * Sets the value of the outRegistryOtherIdIdNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutRegistryOtherIdIdNo(String value) {
        this.outRegistryOtherIdIdNo = value;
    }

    /**
     * Gets the value of the outRegistryOtherIdIssueAuthority property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutRegistryOtherIdIssueAuthority() {
        return outRegistryOtherIdIssueAuthority;
    }

    /**
     * Sets the value of the outRegistryOtherIdIssueAuthority property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutRegistryOtherIdIssueAuthority(String value) {
        this.outRegistryOtherIdIssueAuthority = value;
    }

    /**
     * Gets the value of the outRegistryOtherIdIssueDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutRegistryOtherIdIssueDate() {
        return outRegistryOtherIdIssueDate;
    }

    /**
     * Sets the value of the outRegistryOtherIdIssueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutRegistryOtherIdIssueDate(XMLGregorianCalendar value) {
        this.outRegistryOtherIdIssueDate = value;
    }

    /**
     * Gets the value of the outRegistryOtherIdSerialNo property.
     * 
     */
    public short getOutRegistryOtherIdSerialNo() {
        return outRegistryOtherIdSerialNo;
    }

    /**
     * Sets the value of the outRegistryOtherIdSerialNo property.
     * 
     */
    public void setOutRegistryOtherIdSerialNo(short value) {
        this.outRegistryOtherIdSerialNo = value;
    }

    /**
     * Gets the value of the outRegistryOtherIdTmstamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutRegistryOtherIdTmstamp() {
        return outRegistryOtherIdTmstamp;
    }

    /**
     * Sets the value of the outRegistryOtherIdTmstamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutRegistryOtherIdTmstamp(XMLGregorianCalendar value) {
        this.outRegistryOtherIdTmstamp = value;
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
     * Gets the value of the outSegmentCustomerCategoryTmstamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutSegmentCustomerCategoryTmstamp() {
        return outSegmentCustomerCategoryTmstamp;
    }

    /**
     * Sets the value of the outSegmentCustomerCategoryTmstamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutSegmentCustomerCategoryTmstamp(XMLGregorianCalendar value) {
        this.outSegmentCustomerCategoryTmstamp = value;
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
     *     {@link ArrayOfOutGrpCustcatC }
     *     
     */
    public ArrayOfOutGrpCustcatC getOutGrpCustcat() {
        return outGrpCustcat;
    }

    /**
     * Sets the value of the outGrpCustcat property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfOutGrpCustcatC }
     *     
     */
    public void setOutGrpCustcat(ArrayOfOutGrpCustcatC value) {
        this.outGrpCustcat = value;
    }

    /**
     * Gets the value of the outGrpCustomerShareholders property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfOutGrpCustomerShareholders }
     *     
     */
    public ArrayOfOutGrpCustomerShareholders getOutGrpCustomerShareholders() {
        return outGrpCustomerShareholders;
    }

    /**
     * Sets the value of the outGrpCustomerShareholders property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfOutGrpCustomerShareholders }
     *     
     */
    public void setOutGrpCustomerShareholders(ArrayOfOutGrpCustomerShareholders value) {
        this.outGrpCustomerShareholders = value;
    }

    /**
     * Gets the value of the outGrpSameAfm property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfOutGrpSameAfmC }
     *     
     */
    public ArrayOfOutGrpSameAfmC getOutGrpSameAfm() {
        return outGrpSameAfm;
    }

    /**
     * Sets the value of the outGrpSameAfm property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfOutGrpSameAfmC }
     *     
     */
    public void setOutGrpSameAfm(ArrayOfOutGrpSameAfmC value) {
        this.outGrpSameAfm = value;
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
     * Gets the value of the outOfficeAddressDistrictGenericDetailDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutOfficeAddressDistrictGenericDetailDescription() {
        return outOfficeAddressDistrictGenericDetailDescription;
    }

    /**
     * Sets the value of the outOfficeAddressDistrictGenericDetailDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutOfficeAddressDistrictGenericDetailDescription(String value) {
        this.outOfficeAddressDistrictGenericDetailDescription = value;
    }

    /**
     * Gets the value of the outOfficeAddressDistrictGenericDetailShortDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutOfficeAddressDistrictGenericDetailShortDescription() {
        return outOfficeAddressDistrictGenericDetailShortDescription;
    }

    /**
     * Sets the value of the outOfficeAddressDistrictGenericDetailShortDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutOfficeAddressDistrictGenericDetailShortDescription(String value) {
        this.outOfficeAddressDistrictGenericDetailShortDescription = value;
    }

    /**
     * Gets the value of the outOfficeAddressDistrictGenericDetailSerialNum property.
     * 
     */
    public int getOutOfficeAddressDistrictGenericDetailSerialNum() {
        return outOfficeAddressDistrictGenericDetailSerialNum;
    }

    /**
     * Sets the value of the outOfficeAddressDistrictGenericDetailSerialNum property.
     * 
     */
    public void setOutOfficeAddressDistrictGenericDetailSerialNum(int value) {
        this.outOfficeAddressDistrictGenericDetailSerialNum = value;
    }

    /**
     * Gets the value of the outOfficeCustAddressAccomodationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutOfficeCustAddressAccomodationDate() {
        return outOfficeCustAddressAccomodationDate;
    }

    /**
     * Sets the value of the outOfficeCustAddressAccomodationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutOfficeCustAddressAccomodationDate(XMLGregorianCalendar value) {
        this.outOfficeCustAddressAccomodationDate = value;
    }

    /**
     * Gets the value of the outOfficeCustAddressInternetAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutOfficeCustAddressInternetAddress() {
        return outOfficeCustAddressInternetAddress;
    }

    /**
     * Sets the value of the outOfficeCustAddressInternetAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutOfficeCustAddressInternetAddress(String value) {
        this.outOfficeCustAddressInternetAddress = value;
    }

    /**
     * Gets the value of the outOfficeCustAddressEMail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutOfficeCustAddressEMail() {
        return outOfficeCustAddressEMail;
    }

    /**
     * Sets the value of the outOfficeCustAddressEMail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutOfficeCustAddressEMail(String value) {
        this.outOfficeCustAddressEMail = value;
    }

    /**
     * Gets the value of the outOfficeCustAddressTelephone3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutOfficeCustAddressTelephone3() {
        return outOfficeCustAddressTelephone3;
    }

    /**
     * Sets the value of the outOfficeCustAddressTelephone3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutOfficeCustAddressTelephone3(String value) {
        this.outOfficeCustAddressTelephone3 = value;
    }

    /**
     * Gets the value of the outOfficeCustAddressTelephone2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutOfficeCustAddressTelephone2() {
        return outOfficeCustAddressTelephone2;
    }

    /**
     * Sets the value of the outOfficeCustAddressTelephone2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutOfficeCustAddressTelephone2(String value) {
        this.outOfficeCustAddressTelephone2 = value;
    }

    /**
     * Gets the value of the outOfficeCustAddressAddress6 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutOfficeCustAddressAddress6() {
        return outOfficeCustAddressAddress6;
    }

    /**
     * Sets the value of the outOfficeCustAddressAddress6 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutOfficeCustAddressAddress6(String value) {
        this.outOfficeCustAddressAddress6 = value;
    }

    /**
     * Gets the value of the outOfficeCustAddressAddress5 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutOfficeCustAddressAddress5() {
        return outOfficeCustAddressAddress5;
    }

    /**
     * Sets the value of the outOfficeCustAddressAddress5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutOfficeCustAddressAddress5(String value) {
        this.outOfficeCustAddressAddress5 = value;
    }

    /**
     * Gets the value of the outOfficeCustAddressAddress4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutOfficeCustAddressAddress4() {
        return outOfficeCustAddressAddress4;
    }

    /**
     * Sets the value of the outOfficeCustAddressAddress4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutOfficeCustAddressAddress4(String value) {
        this.outOfficeCustAddressAddress4 = value;
    }

    /**
     * Gets the value of the outOfficeCustAddressAddress3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutOfficeCustAddressAddress3() {
        return outOfficeCustAddressAddress3;
    }

    /**
     * Sets the value of the outOfficeCustAddressAddress3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutOfficeCustAddressAddress3(String value) {
        this.outOfficeCustAddressAddress3 = value;
    }

    /**
     * Gets the value of the outOfficeCustAddressSegmFlags property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutOfficeCustAddressSegmFlags() {
        return outOfficeCustAddressSegmFlags;
    }

    /**
     * Sets the value of the outOfficeCustAddressSegmFlags property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutOfficeCustAddressSegmFlags(String value) {
        this.outOfficeCustAddressSegmFlags = value;
    }

    /**
     * Gets the value of the outOfficeCustAddressLatinInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutOfficeCustAddressLatinInd() {
        return outOfficeCustAddressLatinInd;
    }

    /**
     * Sets the value of the outOfficeCustAddressLatinInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutOfficeCustAddressLatinInd(String value) {
        this.outOfficeCustAddressLatinInd = value;
    }

    /**
     * Gets the value of the outOfficeCustAddressPtsInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutOfficeCustAddressPtsInd() {
        return outOfficeCustAddressPtsInd;
    }

    /**
     * Sets the value of the outOfficeCustAddressPtsInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutOfficeCustAddressPtsInd(String value) {
        this.outOfficeCustAddressPtsInd = value;
    }

    /**
     * Gets the value of the outOfficeCustAddressFaxNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutOfficeCustAddressFaxNo() {
        return outOfficeCustAddressFaxNo;
    }

    /**
     * Sets the value of the outOfficeCustAddressFaxNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutOfficeCustAddressFaxNo(String value) {
        this.outOfficeCustAddressFaxNo = value;
    }

    /**
     * Gets the value of the outOfficeCustAddressTelephone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutOfficeCustAddressTelephone() {
        return outOfficeCustAddressTelephone;
    }

    /**
     * Sets the value of the outOfficeCustAddressTelephone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutOfficeCustAddressTelephone(String value) {
        this.outOfficeCustAddressTelephone = value;
    }

    /**
     * Gets the value of the outOfficeCustAddressCommunicationAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutOfficeCustAddressCommunicationAddress() {
        return outOfficeCustAddressCommunicationAddress;
    }

    /**
     * Sets the value of the outOfficeCustAddressCommunicationAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutOfficeCustAddressCommunicationAddress(String value) {
        this.outOfficeCustAddressCommunicationAddress = value;
    }

    /**
     * Gets the value of the outOfficeCustAddressRegion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutOfficeCustAddressRegion() {
        return outOfficeCustAddressRegion;
    }

    /**
     * Sets the value of the outOfficeCustAddressRegion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutOfficeCustAddressRegion(String value) {
        this.outOfficeCustAddressRegion = value;
    }

    /**
     * Gets the value of the outOfficeCustAddressAddress2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutOfficeCustAddressAddress2() {
        return outOfficeCustAddressAddress2;
    }

    /**
     * Sets the value of the outOfficeCustAddressAddress2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutOfficeCustAddressAddress2(String value) {
        this.outOfficeCustAddressAddress2 = value;
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
     * Gets the value of the outCustomerNoOfBusinesses property.
     * 
     */
    public int getOutCustomerNoOfBusinesses() {
        return outCustomerNoOfBusinesses;
    }

    /**
     * Sets the value of the outCustomerNoOfBusinesses property.
     * 
     */
    public void setOutCustomerNoOfBusinesses(int value) {
        this.outCustomerNoOfBusinesses = value;
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
     * Gets the value of the outOfficeCustAddrParrelDCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutOfficeCustAddrParrelDCode() {
        return outOfficeCustAddrParrelDCode;
    }

    /**
     * Sets the value of the outOfficeCustAddrParrelDCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutOfficeCustAddrParrelDCode(String value) {
        this.outOfficeCustAddrParrelDCode = value;
    }

    /**
     * Gets the value of the outOfficeCustAddrParrelDSn property.
     * 
     */
    public int getOutOfficeCustAddrParrelDSn() {
        return outOfficeCustAddrParrelDSn;
    }

    /**
     * Sets the value of the outOfficeCustAddrParrelDSn property.
     * 
     */
    public void setOutOfficeCustAddrParrelDSn(int value) {
        this.outOfficeCustAddrParrelDSn = value;
    }

    /**
     * Gets the value of the outOfficeCustAddrParrelDP01Desc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutOfficeCustAddrParrelDP01Desc() {
        return outOfficeCustAddrParrelDP01Desc;
    }

    /**
     * Sets the value of the outOfficeCustAddrParrelDP01Desc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutOfficeCustAddrParrelDP01Desc(String value) {
        this.outOfficeCustAddrParrelDP01Desc = value;
    }

    /**
     * Gets the value of the outOfficeCustAddrParrelDP02Desc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutOfficeCustAddrParrelDP02Desc() {
        return outOfficeCustAddrParrelDP02Desc;
    }

    /**
     * Sets the value of the outOfficeCustAddrParrelDP02Desc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutOfficeCustAddrParrelDP02Desc(String value) {
        this.outOfficeCustAddrParrelDP02Desc = value;
    }

    /**
     * Gets the value of the outOfficeCustAddrParrelDP03Desc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutOfficeCustAddrParrelDP03Desc() {
        return outOfficeCustAddrParrelDP03Desc;
    }

    /**
     * Sets the value of the outOfficeCustAddrParrelDP03Desc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutOfficeCustAddrParrelDP03Desc(String value) {
        this.outOfficeCustAddrParrelDP03Desc = value;
    }

    /**
     * Gets the value of the outOfficeCustAddrParrelDP04Desc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutOfficeCustAddrParrelDP04Desc() {
        return outOfficeCustAddrParrelDP04Desc;
    }

    /**
     * Sets the value of the outOfficeCustAddrParrelDP04Desc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutOfficeCustAddrParrelDP04Desc(String value) {
        this.outOfficeCustAddrParrelDP04Desc = value;
    }

    /**
     * Gets the value of the outOfficeCustAddrParrelDP05Desc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutOfficeCustAddrParrelDP05Desc() {
        return outOfficeCustAddrParrelDP05Desc;
    }

    /**
     * Sets the value of the outOfficeCustAddrParrelDP05Desc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutOfficeCustAddrParrelDP05Desc(String value) {
        this.outOfficeCustAddrParrelDP05Desc = value;
    }

    /**
     * Gets the value of the outOfficeCustAddrParrelDP06Desc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutOfficeCustAddrParrelDP06Desc() {
        return outOfficeCustAddrParrelDP06Desc;
    }

    /**
     * Sets the value of the outOfficeCustAddrParrelDP06Desc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutOfficeCustAddrParrelDP06Desc(String value) {
        this.outOfficeCustAddrParrelDP06Desc = value;
    }

    /**
     * Gets the value of the outOfficeCustAddrParrelDP07Desc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutOfficeCustAddrParrelDP07Desc() {
        return outOfficeCustAddrParrelDP07Desc;
    }

    /**
     * Sets the value of the outOfficeCustAddrParrelDP07Desc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutOfficeCustAddrParrelDP07Desc(String value) {
        this.outOfficeCustAddrParrelDP07Desc = value;
    }

    /**
     * Gets the value of the outOfficeCustAddrParrelDP08Desc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutOfficeCustAddrParrelDP08Desc() {
        return outOfficeCustAddrParrelDP08Desc;
    }

    /**
     * Sets the value of the outOfficeCustAddrParrelDP08Desc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutOfficeCustAddrParrelDP08Desc(String value) {
        this.outOfficeCustAddrParrelDP08Desc = value;
    }

    /**
     * Gets the value of the outOfficeCustAddrParrelDP09Desc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutOfficeCustAddrParrelDP09Desc() {
        return outOfficeCustAddrParrelDP09Desc;
    }

    /**
     * Sets the value of the outOfficeCustAddrParrelDP09Desc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutOfficeCustAddrParrelDP09Desc(String value) {
        this.outOfficeCustAddrParrelDP09Desc = value;
    }

    /**
     * Gets the value of the outOfficeCustAddrParrelDP10Desc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutOfficeCustAddrParrelDP10Desc() {
        return outOfficeCustAddrParrelDP10Desc;
    }

    /**
     * Sets the value of the outOfficeCustAddrParrelDP10Desc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutOfficeCustAddrParrelDP10Desc(String value) {
        this.outOfficeCustAddrParrelDP10Desc = value;
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
     * Gets the value of the outCustomerNoOfEmployees property.
     * 
     */
    public int getOutCustomerNoOfEmployees() {
        return outCustomerNoOfEmployees;
    }

    /**
     * Sets the value of the outCustomerNoOfEmployees property.
     * 
     */
    public void setOutCustomerNoOfEmployees(int value) {
        this.outCustomerNoOfEmployees = value;
    }

    /**
     * Gets the value of the outCustomerPermEmployees property.
     * 
     */
    public int getOutCustomerPermEmployees() {
        return outCustomerPermEmployees;
    }

    /**
     * Sets the value of the outCustomerPermEmployees property.
     * 
     */
    public void setOutCustomerPermEmployees(int value) {
        this.outCustomerPermEmployees = value;
    }

}
