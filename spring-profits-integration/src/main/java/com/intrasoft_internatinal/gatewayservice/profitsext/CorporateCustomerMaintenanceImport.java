
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for CorporateCustomerMaintenanceImport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CorporateCustomerMaintenanceImport">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}BaseImport">
 *       &lt;sequence>
 *         &lt;element name="InActivityCustomerCategoryTmstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InActivityGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InActivityTypeCustomerCategoryTmstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InActivityTypeGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InActivityTypeGenericDetailShortDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InAddressCountryGenericDetailShortDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InAddressDistrictGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InAfmIssueCountryGenericDetailDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InAfmIssueCountryGenericDetailShortDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InAtenetCustCardInfoCardNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InAtenetCustCardInfoEndDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InAtenetCustCardInfoStartDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InAtractionGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InAttractionCustomerCategoryTmstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InAttractionUsrCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InAuthGrantedIefSuppliedFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InBasileiaCustomerCategoryTmstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InBasileiaGenericDetailDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InBasileiaGenericDetailParameterType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InBasileiaGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InBasileiaGenericDetailShortDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InBopCountryCustomerCategoryTmstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InBopCountryGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InBopCountryGenericDetailShortDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InBranchPortfolioBranch" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InBranchPortfolioDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InBranchPortfolioPortfolioCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InChamberAuthorityCustomerCategoryTmstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InChamberAuthorityGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InCitizenshipCustomerCategoryTmstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InCitizenshipGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InCommunicationLangCustomerCategoryTmstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InCommunicationLangGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InCompanyCategCustomerCategoryTmstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InCompanyCategGenericDetailDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCompanyCategGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InCompanyCategGenericDetailShortDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCompanySubcategCustomerCategoryTmstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InCompanySubcategGenericDetailDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCompanySubcategGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InCompanySubcategGenericDetailShortDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCompanyTypeCustomerCategoryTmstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InCompanyTypeGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InConditionsMembershipCustomerCategoryTmstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InConditionsMembershipGenericDetailDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InConditionsMembershipGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InConditionsMembershipGenericDetailShortDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InConfirmDoubtAfmIefSuppliedFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCustAddressAddress1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCustAddressAddress2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCustAddressAddressType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCustAddressCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCustAddressEntryComments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCustAddressFaxNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCustAddressRegion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCustAddressSegmFlags" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCustAddressSerialNum" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InCustAddressTelephone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCustAddressZipCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCustomerAttractionDetails" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCustomerAttractionPerson" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCustomerBaselDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCustomerBaselStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCustomerCertificCust" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCustomerCertificDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InCustomerChamberComments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCustomerChamberId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCustomerCustStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCustomerDaiNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCustomerDateOfBirth" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InCustomerEMail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCustomerEntryComments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCustomerEntryStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCustomerExpireDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InCustomerFaxIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCustomerFicliCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InCustomerFicliDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCustomerFinRange" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InCustomerFinRangeDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InCustomerFirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCustomerIncompleteUComnt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCustomerInstituteInvInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCustomerInternetAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCustomerLastUpdate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InCustomerLatinFirstname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCustomerLatinSurname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCustomerMobileTel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCustomerNoAfm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCustomerNonProfit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCustomerNonRegistered" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCustomerNonResident" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCustomerNonResidentForRep" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCustomerPromocode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCustomerReprFirstname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCustomerReprPhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCustomerReprSurname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCustomerSegmFlags" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCustomerSepaAgrDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InCustomerSepaAgrFlg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCustomerShortName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCustomerSpmNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCustomerSurname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCustomerSwiftAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCustomerSwiftConnectionInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCustomerTelephone1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCustomerTelex" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCustomerTelexConnection" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCustomerTmstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InCustomerVipInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCustTypeIefSuppliedFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InDateBankParametersCurrTrxDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InDateBankParametersLastClosedProdDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InDepositParametersBankCase" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InEconomicGroupCustomerCategoryTmstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InEconomicGroupGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InExternalSystemDataChannelId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InExternalSystemDataChannelPassword" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InExternalSystemDataChannelUser" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InExternalSystemDataProfitsUniqueId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InExternalSystemDataReferenceNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InExternalSystemDataSoftId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InExternalSystemDataWsId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InGrpCustcatLength" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InGrpCustomerShareholdersLength" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InIefSuppliedCommand" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InIefSuppliedFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InJustificIdJustific" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InKeyCustomerCDigit" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InKeyCustomerCustId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InLegalTypeCustomerCategoryTmstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InLegalTypeGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InMarketCustomerCategoryTmstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InMarketGenericDetailDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InMarketGenericDetailEntryStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InMarketGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InMntRecordingAuthorizer1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InMntRecordingAuthorizer2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InMntRecordingChannelId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InMntRecordingPrftSystem" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InMntRecordingReversalFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InMntRecordingTerminalNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InMntRecordingTrxCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InMntRecordingTrxDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InMntRecordingTrxUnit" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InMntRecordingTrxUser" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InMonitoringUnitCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InOfficeAddressCountryGenericDetailShortDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InOfficeCustAddressAddress1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InOfficeCustAddressAddressType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InOfficeCustAddressCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InOfficeCustAddressEntryComments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InOfficeCustAddressEntryStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InOfficeCustAddressMailBox" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InOfficeCustAddressSerialNum" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InOfficeCustAddressTmstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InOfficeCustAddressZipCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InOpenUnitCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InOtherAfmAfmNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InOtherAfmSerialNo" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InOtherAfmTmstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InPrftTransactionDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InPrftTransactionIdTransact" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InProductIdProduct" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InProfile1UnitCategoryPerRoleId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InProfile2UnitCategoryPerRoleId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InProfile3UnitCategoryPerRoleId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InRegionCustomerCategoryTmstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InRegionGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InRegistryCountryGenericDetailShortDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InRegistryOtherIdExpiryDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InRegistryOtherIdIdNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InRegistryOtherIdIssueAuthority" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InRegistryOtherIdIssueDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InRegistryOtherIdSerialNo" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InRegistryOtherIdTmstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InRmBankemployeeFirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InRmBankemployeeLastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InRmUsrCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InSegmentCustomerCategoryTmstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InSegmentGenericDetailDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InSegmentGenericDetailEntryStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InSegmentGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InTaxOfficeId" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InThinkingCurrencyIdCurrency" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InThinkingCurrencyShortDescr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InTimestampCustomerTmstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InCustomerEnableFor24c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCustomerCustOpenDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InGrpCustcat" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}ArrayOfInGrpCustcatC" minOccurs="0"/>
 *         &lt;element name="InGrpCustomerShareholders" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}ArrayOfInGrpCustomerShareholders" minOccurs="0"/>
 *         &lt;element name="InMonitoringBankemployeeId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InMonitoringBankemployeeFirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InMonitoringBankemployeeLastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InOfficeAddressDistrictGenericDetailDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InOfficeAddressDistrictGenericDetailShortDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InOfficeAddressDistrictGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InOfficeCustAddressAccomodationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InOfficeCustAddressInternetAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InOfficeCustAddressEMail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InOfficeCustAddressTelephone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InOfficeCustAddressTelephone2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InOfficeCustAddressTelephone3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InOfficeCustAddressAddress2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InOfficeCustAddressAddress3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InOfficeCustAddressAddress4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InOfficeCustAddressAddress5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InOfficeCustAddressAddress6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InOfficeCustAddressSegmFlags" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InOfficeCustAddressLatinInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InOfficeCustAddressPtsInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InOfficeCustAddressFaxNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InOfficeCustAddressCommunicationAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InOfficeCustAddressRegion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCustAddressAccomodationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InCustAddressInternetAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCustAddressEMail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCustAddressTelephone2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCustAddressTelephone3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCustAddressAddress3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCustAddressAddress4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCustAddressAddress5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCustAddressAddress6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCustAddressLatinInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCustAddressMailBox" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCustAddressPtsInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCustAddressCommunicationAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCustAddressEntryStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCustAddressTmstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InCustomerNoOfBusinesses" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InCustomerMobileTel2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCustomerEMail2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InOfficeCustAddrParrelDCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InOfficeCustAddrParrelDSn" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InCustAddrParrelDCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCustAddrParrelDSn" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InCustomerCommunMethod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCustomerCbsId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCustomerIapplyId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCustomerCrmId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCustomerNumOfChildren" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InCustomerFamilyMembers" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InCustomerNoOfEmployees" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InCustomerPermEmployees" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CorporateCustomerMaintenanceImport", propOrder = {
    "inActivityCustomerCategoryTmstamp",
    "inActivityGenericDetailSerialNum",
    "inActivityTypeCustomerCategoryTmstamp",
    "inActivityTypeGenericDetailSerialNum",
    "inActivityTypeGenericDetailShortDescription",
    "inAddressCountryGenericDetailShortDescription",
    "inAddressDistrictGenericDetailSerialNum",
    "inAfmIssueCountryGenericDetailDescription",
    "inAfmIssueCountryGenericDetailShortDescription",
    "inAtenetCustCardInfoCardNo",
    "inAtenetCustCardInfoEndDate",
    "inAtenetCustCardInfoStartDate",
    "inAtractionGenericDetailSerialNum",
    "inAttractionCustomerCategoryTmstamp",
    "inAttractionUsrCode",
    "inAuthGrantedIefSuppliedFlag",
    "inBasileiaCustomerCategoryTmstamp",
    "inBasileiaGenericDetailDescription",
    "inBasileiaGenericDetailParameterType",
    "inBasileiaGenericDetailSerialNum",
    "inBasileiaGenericDetailShortDescription",
    "inBopCountryCustomerCategoryTmstamp",
    "inBopCountryGenericDetailSerialNum",
    "inBopCountryGenericDetailShortDescription",
    "inBranchPortfolioBranch",
    "inBranchPortfolioDescription",
    "inBranchPortfolioPortfolioCode",
    "inChamberAuthorityCustomerCategoryTmstamp",
    "inChamberAuthorityGenericDetailSerialNum",
    "inCitizenshipCustomerCategoryTmstamp",
    "inCitizenshipGenericDetailSerialNum",
    "inCommunicationLangCustomerCategoryTmstamp",
    "inCommunicationLangGenericDetailSerialNum",
    "inCompanyCategCustomerCategoryTmstamp",
    "inCompanyCategGenericDetailDescription",
    "inCompanyCategGenericDetailSerialNum",
    "inCompanyCategGenericDetailShortDescription",
    "inCompanySubcategCustomerCategoryTmstamp",
    "inCompanySubcategGenericDetailDescription",
    "inCompanySubcategGenericDetailSerialNum",
    "inCompanySubcategGenericDetailShortDescription",
    "inCompanyTypeCustomerCategoryTmstamp",
    "inCompanyTypeGenericDetailSerialNum",
    "inConditionsMembershipCustomerCategoryTmstamp",
    "inConditionsMembershipGenericDetailDescription",
    "inConditionsMembershipGenericDetailSerialNum",
    "inConditionsMembershipGenericDetailShortDescription",
    "inConfirmDoubtAfmIefSuppliedFlag",
    "inCustAddressAddress1",
    "inCustAddressAddress2",
    "inCustAddressAddressType",
    "inCustAddressCity",
    "inCustAddressEntryComments",
    "inCustAddressFaxNo",
    "inCustAddressRegion",
    "inCustAddressSegmFlags",
    "inCustAddressSerialNum",
    "inCustAddressTelephone",
    "inCustAddressZipCode",
    "inCustomerAttractionDetails",
    "inCustomerAttractionPerson",
    "inCustomerBaselDescription",
    "inCustomerBaselStatus",
    "inCustomerCertificCust",
    "inCustomerCertificDate",
    "inCustomerChamberComments",
    "inCustomerChamberId",
    "inCustomerCustStatus",
    "inCustomerDaiNumber",
    "inCustomerDateOfBirth",
    "inCustomerEMail",
    "inCustomerEntryComments",
    "inCustomerEntryStatus",
    "inCustomerExpireDate",
    "inCustomerFaxIndicator",
    "inCustomerFicliCode",
    "inCustomerFicliDesc",
    "inCustomerFinRange",
    "inCustomerFinRangeDt",
    "inCustomerFirstName",
    "inCustomerIncompleteUComnt",
    "inCustomerInstituteInvInd",
    "inCustomerInternetAddress",
    "inCustomerLastUpdate",
    "inCustomerLatinFirstname",
    "inCustomerLatinSurname",
    "inCustomerMobileTel",
    "inCustomerNoAfm",
    "inCustomerNonProfit",
    "inCustomerNonRegistered",
    "inCustomerNonResident",
    "inCustomerNonResidentForRep",
    "inCustomerPromocode",
    "inCustomerReprFirstname",
    "inCustomerReprPhone",
    "inCustomerReprSurname",
    "inCustomerSegmFlags",
    "inCustomerSepaAgrDt",
    "inCustomerSepaAgrFlg",
    "inCustomerShortName",
    "inCustomerSpmNumber",
    "inCustomerSurname",
    "inCustomerSwiftAddress",
    "inCustomerSwiftConnectionInd",
    "inCustomerTelephone1",
    "inCustomerTelex",
    "inCustomerTelexConnection",
    "inCustomerTmstamp",
    "inCustomerVipInd",
    "inCustTypeIefSuppliedFlag",
    "inDateBankParametersCurrTrxDate",
    "inDateBankParametersLastClosedProdDate",
    "inDepositParametersBankCase",
    "inEconomicGroupCustomerCategoryTmstamp",
    "inEconomicGroupGenericDetailSerialNum",
    "inExternalSystemDataChannelId",
    "inExternalSystemDataChannelPassword",
    "inExternalSystemDataChannelUser",
    "inExternalSystemDataProfitsUniqueId",
    "inExternalSystemDataReferenceNumber",
    "inExternalSystemDataSoftId",
    "inExternalSystemDataWsId",
    "inGrpCustcatLength",
    "inGrpCustomerShareholdersLength",
    "inIefSuppliedCommand",
    "inIefSuppliedFlag",
    "inJustificIdJustific",
    "inKeyCustomerCDigit",
    "inKeyCustomerCustId",
    "inLegalTypeCustomerCategoryTmstamp",
    "inLegalTypeGenericDetailSerialNum",
    "inMarketCustomerCategoryTmstamp",
    "inMarketGenericDetailDescription",
    "inMarketGenericDetailEntryStatus",
    "inMarketGenericDetailSerialNum",
    "inMntRecordingAuthorizer1",
    "inMntRecordingAuthorizer2",
    "inMntRecordingChannelId",
    "inMntRecordingPrftSystem",
    "inMntRecordingReversalFlag",
    "inMntRecordingTerminalNumber",
    "inMntRecordingTrxCode",
    "inMntRecordingTrxDate",
    "inMntRecordingTrxUnit",
    "inMntRecordingTrxUser",
    "inMonitoringUnitCode",
    "inOfficeAddressCountryGenericDetailShortDescription",
    "inOfficeCustAddressAddress1",
    "inOfficeCustAddressAddressType",
    "inOfficeCustAddressCity",
    "inOfficeCustAddressEntryComments",
    "inOfficeCustAddressEntryStatus",
    "inOfficeCustAddressMailBox",
    "inOfficeCustAddressSerialNum",
    "inOfficeCustAddressTmstamp",
    "inOfficeCustAddressZipCode",
    "inOpenUnitCode",
    "inOtherAfmAfmNo",
    "inOtherAfmSerialNo",
    "inOtherAfmTmstamp",
    "inPrftTransactionDescription",
    "inPrftTransactionIdTransact",
    "inProductIdProduct",
    "inProfile1UnitCategoryPerRoleId",
    "inProfile2UnitCategoryPerRoleId",
    "inProfile3UnitCategoryPerRoleId",
    "inRegionCustomerCategoryTmstamp",
    "inRegionGenericDetailSerialNum",
    "inRegistryCountryGenericDetailShortDescription",
    "inRegistryOtherIdExpiryDate",
    "inRegistryOtherIdIdNo",
    "inRegistryOtherIdIssueAuthority",
    "inRegistryOtherIdIssueDate",
    "inRegistryOtherIdSerialNo",
    "inRegistryOtherIdTmstamp",
    "inRmBankemployeeFirstName",
    "inRmBankemployeeLastName",
    "inRmUsrCode",
    "inSegmentCustomerCategoryTmstamp",
    "inSegmentGenericDetailDescription",
    "inSegmentGenericDetailEntryStatus",
    "inSegmentGenericDetailSerialNum",
    "inTaxOfficeId",
    "inThinkingCurrencyIdCurrency",
    "inThinkingCurrencyShortDescr",
    "inTimestampCustomerTmstamp",
    "inCustomerEnableFor24C",
    "inCustomerCustOpenDate",
    "inGrpCustcat",
    "inGrpCustomerShareholders",
    "inMonitoringBankemployeeId",
    "inMonitoringBankemployeeFirstName",
    "inMonitoringBankemployeeLastName",
    "inOfficeAddressDistrictGenericDetailDescription",
    "inOfficeAddressDistrictGenericDetailShortDescription",
    "inOfficeAddressDistrictGenericDetailSerialNum",
    "inOfficeCustAddressAccomodationDate",
    "inOfficeCustAddressInternetAddress",
    "inOfficeCustAddressEMail",
    "inOfficeCustAddressTelephone",
    "inOfficeCustAddressTelephone2",
    "inOfficeCustAddressTelephone3",
    "inOfficeCustAddressAddress2",
    "inOfficeCustAddressAddress3",
    "inOfficeCustAddressAddress4",
    "inOfficeCustAddressAddress5",
    "inOfficeCustAddressAddress6",
    "inOfficeCustAddressSegmFlags",
    "inOfficeCustAddressLatinInd",
    "inOfficeCustAddressPtsInd",
    "inOfficeCustAddressFaxNo",
    "inOfficeCustAddressCommunicationAddress",
    "inOfficeCustAddressRegion",
    "inCustAddressAccomodationDate",
    "inCustAddressInternetAddress",
    "inCustAddressEMail",
    "inCustAddressTelephone2",
    "inCustAddressTelephone3",
    "inCustAddressAddress3",
    "inCustAddressAddress4",
    "inCustAddressAddress5",
    "inCustAddressAddress6",
    "inCustAddressLatinInd",
    "inCustAddressMailBox",
    "inCustAddressPtsInd",
    "inCustAddressCommunicationAddress",
    "inCustAddressEntryStatus",
    "inCustAddressTmstamp",
    "inCustomerNoOfBusinesses",
    "inCustomerMobileTel2",
    "inCustomerEMail2",
    "inOfficeCustAddrParrelDCode",
    "inOfficeCustAddrParrelDSn",
    "inCustAddrParrelDCode",
    "inCustAddrParrelDSn",
    "inCustomerCommunMethod",
    "inCustomerCbsId",
    "inCustomerIapplyId",
    "inCustomerCrmId",
    "inCustomerNumOfChildren",
    "inCustomerFamilyMembers",
    "inCustomerNoOfEmployees",
    "inCustomerPermEmployees"
})
public class CorporateCustomerMaintenanceImport
    extends BaseImport
{

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
    @XmlElement(name = "InAfmIssueCountryGenericDetailDescription")
    protected String inAfmIssueCountryGenericDetailDescription;
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
    @XmlElement(name = "InAtractionGenericDetailSerialNum")
    protected int inAtractionGenericDetailSerialNum;
    @XmlElement(name = "InAttractionCustomerCategoryTmstamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inAttractionCustomerCategoryTmstamp;
    @XmlElement(name = "InAttractionUsrCode")
    protected String inAttractionUsrCode;
    @XmlElement(name = "InAuthGrantedIefSuppliedFlag")
    protected String inAuthGrantedIefSuppliedFlag;
    @XmlElement(name = "InBasileiaCustomerCategoryTmstamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inBasileiaCustomerCategoryTmstamp;
    @XmlElement(name = "InBasileiaGenericDetailDescription")
    protected String inBasileiaGenericDetailDescription;
    @XmlElement(name = "InBasileiaGenericDetailParameterType")
    protected String inBasileiaGenericDetailParameterType;
    @XmlElement(name = "InBasileiaGenericDetailSerialNum")
    protected int inBasileiaGenericDetailSerialNum;
    @XmlElement(name = "InBasileiaGenericDetailShortDescription")
    protected String inBasileiaGenericDetailShortDescription;
    @XmlElement(name = "InBopCountryCustomerCategoryTmstamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inBopCountryCustomerCategoryTmstamp;
    @XmlElement(name = "InBopCountryGenericDetailSerialNum")
    protected int inBopCountryGenericDetailSerialNum;
    @XmlElement(name = "InBopCountryGenericDetailShortDescription")
    protected String inBopCountryGenericDetailShortDescription;
    @XmlElement(name = "InBranchPortfolioBranch")
    protected int inBranchPortfolioBranch;
    @XmlElement(name = "InBranchPortfolioDescription")
    protected String inBranchPortfolioDescription;
    @XmlElement(name = "InBranchPortfolioPortfolioCode")
    protected int inBranchPortfolioPortfolioCode;
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
    @XmlElement(name = "InCompanyCategGenericDetailDescription")
    protected String inCompanyCategGenericDetailDescription;
    @XmlElement(name = "InCompanyCategGenericDetailSerialNum")
    protected int inCompanyCategGenericDetailSerialNum;
    @XmlElement(name = "InCompanyCategGenericDetailShortDescription")
    protected String inCompanyCategGenericDetailShortDescription;
    @XmlElement(name = "InCompanySubcategCustomerCategoryTmstamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inCompanySubcategCustomerCategoryTmstamp;
    @XmlElement(name = "InCompanySubcategGenericDetailDescription")
    protected String inCompanySubcategGenericDetailDescription;
    @XmlElement(name = "InCompanySubcategGenericDetailSerialNum")
    protected int inCompanySubcategGenericDetailSerialNum;
    @XmlElement(name = "InCompanySubcategGenericDetailShortDescription")
    protected String inCompanySubcategGenericDetailShortDescription;
    @XmlElement(name = "InCompanyTypeCustomerCategoryTmstamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inCompanyTypeCustomerCategoryTmstamp;
    @XmlElement(name = "InCompanyTypeGenericDetailSerialNum")
    protected int inCompanyTypeGenericDetailSerialNum;
    @XmlElement(name = "InConditionsMembershipCustomerCategoryTmstamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inConditionsMembershipCustomerCategoryTmstamp;
    @XmlElement(name = "InConditionsMembershipGenericDetailDescription")
    protected String inConditionsMembershipGenericDetailDescription;
    @XmlElement(name = "InConditionsMembershipGenericDetailSerialNum")
    protected int inConditionsMembershipGenericDetailSerialNum;
    @XmlElement(name = "InConditionsMembershipGenericDetailShortDescription")
    protected String inConditionsMembershipGenericDetailShortDescription;
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
    @XmlElement(name = "InCustAddressEntryComments")
    protected String inCustAddressEntryComments;
    @XmlElement(name = "InCustAddressFaxNo")
    protected String inCustAddressFaxNo;
    @XmlElement(name = "InCustAddressRegion")
    protected String inCustAddressRegion;
    @XmlElement(name = "InCustAddressSegmFlags")
    protected String inCustAddressSegmFlags;
    @XmlElement(name = "InCustAddressSerialNum")
    protected short inCustAddressSerialNum;
    @XmlElement(name = "InCustAddressTelephone")
    protected String inCustAddressTelephone;
    @XmlElement(name = "InCustAddressZipCode")
    protected String inCustAddressZipCode;
    @XmlElement(name = "InCustomerAttractionDetails")
    protected String inCustomerAttractionDetails;
    @XmlElement(name = "InCustomerAttractionPerson")
    protected String inCustomerAttractionPerson;
    @XmlElement(name = "InCustomerBaselDescription")
    protected String inCustomerBaselDescription;
    @XmlElement(name = "InCustomerBaselStatus")
    protected String inCustomerBaselStatus;
    @XmlElement(name = "InCustomerCertificCust")
    protected String inCustomerCertificCust;
    @XmlElement(name = "InCustomerCertificDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inCustomerCertificDate;
    @XmlElement(name = "InCustomerChamberComments")
    protected String inCustomerChamberComments;
    @XmlElement(name = "InCustomerChamberId")
    protected String inCustomerChamberId;
    @XmlElement(name = "InCustomerCustStatus")
    protected String inCustomerCustStatus;
    @XmlElement(name = "InCustomerDaiNumber")
    protected String inCustomerDaiNumber;
    @XmlElement(name = "InCustomerDateOfBirth", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inCustomerDateOfBirth;
    @XmlElement(name = "InCustomerEMail")
    protected String inCustomerEMail;
    @XmlElement(name = "InCustomerEntryComments")
    protected String inCustomerEntryComments;
    @XmlElement(name = "InCustomerEntryStatus")
    protected String inCustomerEntryStatus;
    @XmlElement(name = "InCustomerExpireDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inCustomerExpireDate;
    @XmlElement(name = "InCustomerFaxIndicator")
    protected String inCustomerFaxIndicator;
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
    @XmlElement(name = "InCustomerInstituteInvInd")
    protected String inCustomerInstituteInvInd;
    @XmlElement(name = "InCustomerInternetAddress")
    protected String inCustomerInternetAddress;
    @XmlElement(name = "InCustomerLastUpdate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inCustomerLastUpdate;
    @XmlElement(name = "InCustomerLatinFirstname")
    protected String inCustomerLatinFirstname;
    @XmlElement(name = "InCustomerLatinSurname")
    protected String inCustomerLatinSurname;
    @XmlElement(name = "InCustomerMobileTel")
    protected String inCustomerMobileTel;
    @XmlElement(name = "InCustomerNoAfm")
    protected String inCustomerNoAfm;
    @XmlElement(name = "InCustomerNonProfit")
    protected String inCustomerNonProfit;
    @XmlElement(name = "InCustomerNonRegistered")
    protected String inCustomerNonRegistered;
    @XmlElement(name = "InCustomerNonResident")
    protected String inCustomerNonResident;
    @XmlElement(name = "InCustomerNonResidentForRep")
    protected String inCustomerNonResidentForRep;
    @XmlElement(name = "InCustomerPromocode")
    protected String inCustomerPromocode;
    @XmlElement(name = "InCustomerReprFirstname")
    protected String inCustomerReprFirstname;
    @XmlElement(name = "InCustomerReprPhone")
    protected String inCustomerReprPhone;
    @XmlElement(name = "InCustomerReprSurname")
    protected String inCustomerReprSurname;
    @XmlElement(name = "InCustomerSegmFlags")
    protected String inCustomerSegmFlags;
    @XmlElement(name = "InCustomerSepaAgrDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inCustomerSepaAgrDt;
    @XmlElement(name = "InCustomerSepaAgrFlg")
    protected String inCustomerSepaAgrFlg;
    @XmlElement(name = "InCustomerShortName")
    protected String inCustomerShortName;
    @XmlElement(name = "InCustomerSpmNumber")
    protected String inCustomerSpmNumber;
    @XmlElement(name = "InCustomerSurname")
    protected String inCustomerSurname;
    @XmlElement(name = "InCustomerSwiftAddress")
    protected String inCustomerSwiftAddress;
    @XmlElement(name = "InCustomerSwiftConnectionInd")
    protected String inCustomerSwiftConnectionInd;
    @XmlElement(name = "InCustomerTelephone1")
    protected String inCustomerTelephone1;
    @XmlElement(name = "InCustomerTelex")
    protected String inCustomerTelex;
    @XmlElement(name = "InCustomerTelexConnection")
    protected String inCustomerTelexConnection;
    @XmlElement(name = "InCustomerTmstamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inCustomerTmstamp;
    @XmlElement(name = "InCustomerVipInd")
    protected String inCustomerVipInd;
    @XmlElement(name = "InCustTypeIefSuppliedFlag")
    protected String inCustTypeIefSuppliedFlag;
    @XmlElement(name = "InDateBankParametersCurrTrxDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inDateBankParametersCurrTrxDate;
    @XmlElement(name = "InDateBankParametersLastClosedProdDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inDateBankParametersLastClosedProdDate;
    @XmlElement(name = "InDepositParametersBankCase")
    protected short inDepositParametersBankCase;
    @XmlElement(name = "InEconomicGroupCustomerCategoryTmstamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inEconomicGroupCustomerCategoryTmstamp;
    @XmlElement(name = "InEconomicGroupGenericDetailSerialNum")
    protected int inEconomicGroupGenericDetailSerialNum;
    @XmlElement(name = "InExternalSystemDataChannelId")
    protected int inExternalSystemDataChannelId;
    @XmlElement(name = "InExternalSystemDataChannelPassword")
    protected String inExternalSystemDataChannelPassword;
    @XmlElement(name = "InExternalSystemDataChannelUser")
    protected String inExternalSystemDataChannelUser;
    @XmlElement(name = "InExternalSystemDataProfitsUniqueId")
    protected String inExternalSystemDataProfitsUniqueId;
    @XmlElement(name = "InExternalSystemDataReferenceNumber")
    protected String inExternalSystemDataReferenceNumber;
    @XmlElement(name = "InExternalSystemDataSoftId")
    protected String inExternalSystemDataSoftId;
    @XmlElement(name = "InExternalSystemDataWsId")
    protected String inExternalSystemDataWsId;
    @XmlElement(name = "InGrpCustcatLength")
    protected int inGrpCustcatLength;
    @XmlElement(name = "InGrpCustomerShareholdersLength")
    protected int inGrpCustomerShareholdersLength;
    @XmlElement(name = "InIefSuppliedCommand")
    protected String inIefSuppliedCommand;
    @XmlElement(name = "InIefSuppliedFlag")
    protected String inIefSuppliedFlag;
    @XmlElement(name = "InJustificIdJustific")
    protected int inJustificIdJustific;
    @XmlElement(name = "InKeyCustomerCDigit")
    protected short inKeyCustomerCDigit;
    @XmlElement(name = "InKeyCustomerCustId")
    protected int inKeyCustomerCustId;
    @XmlElement(name = "InLegalTypeCustomerCategoryTmstamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inLegalTypeCustomerCategoryTmstamp;
    @XmlElement(name = "InLegalTypeGenericDetailSerialNum")
    protected int inLegalTypeGenericDetailSerialNum;
    @XmlElement(name = "InMarketCustomerCategoryTmstamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inMarketCustomerCategoryTmstamp;
    @XmlElement(name = "InMarketGenericDetailDescription")
    protected String inMarketGenericDetailDescription;
    @XmlElement(name = "InMarketGenericDetailEntryStatus")
    protected String inMarketGenericDetailEntryStatus;
    @XmlElement(name = "InMarketGenericDetailSerialNum")
    protected int inMarketGenericDetailSerialNum;
    @XmlElement(name = "InMntRecordingAuthorizer1")
    protected String inMntRecordingAuthorizer1;
    @XmlElement(name = "InMntRecordingAuthorizer2")
    protected String inMntRecordingAuthorizer2;
    @XmlElement(name = "InMntRecordingChannelId")
    protected int inMntRecordingChannelId;
    @XmlElement(name = "InMntRecordingPrftSystem")
    protected short inMntRecordingPrftSystem;
    @XmlElement(name = "InMntRecordingReversalFlag")
    protected String inMntRecordingReversalFlag;
    @XmlElement(name = "InMntRecordingTerminalNumber")
    protected String inMntRecordingTerminalNumber;
    @XmlElement(name = "InMntRecordingTrxCode")
    protected int inMntRecordingTrxCode;
    @XmlElement(name = "InMntRecordingTrxDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inMntRecordingTrxDate;
    @XmlElement(name = "InMntRecordingTrxUnit")
    protected int inMntRecordingTrxUnit;
    @XmlElement(name = "InMntRecordingTrxUser")
    protected String inMntRecordingTrxUser;
    @XmlElement(name = "InMonitoringUnitCode")
    protected int inMonitoringUnitCode;
    @XmlElement(name = "InOfficeAddressCountryGenericDetailShortDescription")
    protected String inOfficeAddressCountryGenericDetailShortDescription;
    @XmlElement(name = "InOfficeCustAddressAddress1")
    protected String inOfficeCustAddressAddress1;
    @XmlElement(name = "InOfficeCustAddressAddressType")
    protected String inOfficeCustAddressAddressType;
    @XmlElement(name = "InOfficeCustAddressCity")
    protected String inOfficeCustAddressCity;
    @XmlElement(name = "InOfficeCustAddressEntryComments")
    protected String inOfficeCustAddressEntryComments;
    @XmlElement(name = "InOfficeCustAddressEntryStatus")
    protected String inOfficeCustAddressEntryStatus;
    @XmlElement(name = "InOfficeCustAddressMailBox")
    protected String inOfficeCustAddressMailBox;
    @XmlElement(name = "InOfficeCustAddressSerialNum")
    protected short inOfficeCustAddressSerialNum;
    @XmlElement(name = "InOfficeCustAddressTmstamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inOfficeCustAddressTmstamp;
    @XmlElement(name = "InOfficeCustAddressZipCode")
    protected String inOfficeCustAddressZipCode;
    @XmlElement(name = "InOpenUnitCode")
    protected int inOpenUnitCode;
    @XmlElement(name = "InOtherAfmAfmNo")
    protected String inOtherAfmAfmNo;
    @XmlElement(name = "InOtherAfmSerialNo")
    protected short inOtherAfmSerialNo;
    @XmlElement(name = "InOtherAfmTmstamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inOtherAfmTmstamp;
    @XmlElement(name = "InPrftTransactionDescription")
    protected String inPrftTransactionDescription;
    @XmlElement(name = "InPrftTransactionIdTransact")
    protected int inPrftTransactionIdTransact;
    @XmlElement(name = "InProductIdProduct")
    protected int inProductIdProduct;
    @XmlElement(name = "InProfile1UnitCategoryPerRoleId")
    protected String inProfile1UnitCategoryPerRoleId;
    @XmlElement(name = "InProfile2UnitCategoryPerRoleId")
    protected String inProfile2UnitCategoryPerRoleId;
    @XmlElement(name = "InProfile3UnitCategoryPerRoleId")
    protected String inProfile3UnitCategoryPerRoleId;
    @XmlElement(name = "InRegionCustomerCategoryTmstamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inRegionCustomerCategoryTmstamp;
    @XmlElement(name = "InRegionGenericDetailSerialNum")
    protected int inRegionGenericDetailSerialNum;
    @XmlElement(name = "InRegistryCountryGenericDetailShortDescription")
    protected String inRegistryCountryGenericDetailShortDescription;
    @XmlElement(name = "InRegistryOtherIdExpiryDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inRegistryOtherIdExpiryDate;
    @XmlElement(name = "InRegistryOtherIdIdNo")
    protected String inRegistryOtherIdIdNo;
    @XmlElement(name = "InRegistryOtherIdIssueAuthority")
    protected String inRegistryOtherIdIssueAuthority;
    @XmlElement(name = "InRegistryOtherIdIssueDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inRegistryOtherIdIssueDate;
    @XmlElement(name = "InRegistryOtherIdSerialNo")
    protected short inRegistryOtherIdSerialNo;
    @XmlElement(name = "InRegistryOtherIdTmstamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inRegistryOtherIdTmstamp;
    @XmlElement(name = "InRmBankemployeeFirstName")
    protected String inRmBankemployeeFirstName;
    @XmlElement(name = "InRmBankemployeeLastName")
    protected String inRmBankemployeeLastName;
    @XmlElement(name = "InRmUsrCode")
    protected String inRmUsrCode;
    @XmlElement(name = "InSegmentCustomerCategoryTmstamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inSegmentCustomerCategoryTmstamp;
    @XmlElement(name = "InSegmentGenericDetailDescription")
    protected String inSegmentGenericDetailDescription;
    @XmlElement(name = "InSegmentGenericDetailEntryStatus")
    protected String inSegmentGenericDetailEntryStatus;
    @XmlElement(name = "InSegmentGenericDetailSerialNum")
    protected int inSegmentGenericDetailSerialNum;
    @XmlElement(name = "InTaxOfficeId")
    protected short inTaxOfficeId;
    @XmlElement(name = "InThinkingCurrencyIdCurrency")
    protected int inThinkingCurrencyIdCurrency;
    @XmlElement(name = "InThinkingCurrencyShortDescr")
    protected String inThinkingCurrencyShortDescr;
    @XmlElement(name = "InTimestampCustomerTmstamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inTimestampCustomerTmstamp;
    @XmlElement(name = "InCustomerEnableFor24c")
    protected String inCustomerEnableFor24C;
    @XmlElement(name = "InCustomerCustOpenDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inCustomerCustOpenDate;
    @XmlElement(name = "InGrpCustcat")
    protected ArrayOfInGrpCustcatC inGrpCustcat;
    @XmlElement(name = "InGrpCustomerShareholders")
    protected ArrayOfInGrpCustomerShareholders inGrpCustomerShareholders;
    @XmlElement(name = "InMonitoringBankemployeeId")
    protected String inMonitoringBankemployeeId;
    @XmlElement(name = "InMonitoringBankemployeeFirstName")
    protected String inMonitoringBankemployeeFirstName;
    @XmlElement(name = "InMonitoringBankemployeeLastName")
    protected String inMonitoringBankemployeeLastName;
    @XmlElement(name = "InOfficeAddressDistrictGenericDetailDescription")
    protected String inOfficeAddressDistrictGenericDetailDescription;
    @XmlElement(name = "InOfficeAddressDistrictGenericDetailShortDescription")
    protected String inOfficeAddressDistrictGenericDetailShortDescription;
    @XmlElement(name = "InOfficeAddressDistrictGenericDetailSerialNum")
    protected int inOfficeAddressDistrictGenericDetailSerialNum;
    @XmlElement(name = "InOfficeCustAddressAccomodationDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inOfficeCustAddressAccomodationDate;
    @XmlElement(name = "InOfficeCustAddressInternetAddress")
    protected String inOfficeCustAddressInternetAddress;
    @XmlElement(name = "InOfficeCustAddressEMail")
    protected String inOfficeCustAddressEMail;
    @XmlElement(name = "InOfficeCustAddressTelephone")
    protected String inOfficeCustAddressTelephone;
    @XmlElement(name = "InOfficeCustAddressTelephone2")
    protected String inOfficeCustAddressTelephone2;
    @XmlElement(name = "InOfficeCustAddressTelephone3")
    protected String inOfficeCustAddressTelephone3;
    @XmlElement(name = "InOfficeCustAddressAddress2")
    protected String inOfficeCustAddressAddress2;
    @XmlElement(name = "InOfficeCustAddressAddress3")
    protected String inOfficeCustAddressAddress3;
    @XmlElement(name = "InOfficeCustAddressAddress4")
    protected String inOfficeCustAddressAddress4;
    @XmlElement(name = "InOfficeCustAddressAddress5")
    protected String inOfficeCustAddressAddress5;
    @XmlElement(name = "InOfficeCustAddressAddress6")
    protected String inOfficeCustAddressAddress6;
    @XmlElement(name = "InOfficeCustAddressSegmFlags")
    protected String inOfficeCustAddressSegmFlags;
    @XmlElement(name = "InOfficeCustAddressLatinInd")
    protected String inOfficeCustAddressLatinInd;
    @XmlElement(name = "InOfficeCustAddressPtsInd")
    protected String inOfficeCustAddressPtsInd;
    @XmlElement(name = "InOfficeCustAddressFaxNo")
    protected String inOfficeCustAddressFaxNo;
    @XmlElement(name = "InOfficeCustAddressCommunicationAddress")
    protected String inOfficeCustAddressCommunicationAddress;
    @XmlElement(name = "InOfficeCustAddressRegion")
    protected String inOfficeCustAddressRegion;
    @XmlElement(name = "InCustAddressAccomodationDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inCustAddressAccomodationDate;
    @XmlElement(name = "InCustAddressInternetAddress")
    protected String inCustAddressInternetAddress;
    @XmlElement(name = "InCustAddressEMail")
    protected String inCustAddressEMail;
    @XmlElement(name = "InCustAddressTelephone2")
    protected String inCustAddressTelephone2;
    @XmlElement(name = "InCustAddressTelephone3")
    protected String inCustAddressTelephone3;
    @XmlElement(name = "InCustAddressAddress3")
    protected String inCustAddressAddress3;
    @XmlElement(name = "InCustAddressAddress4")
    protected String inCustAddressAddress4;
    @XmlElement(name = "InCustAddressAddress5")
    protected String inCustAddressAddress5;
    @XmlElement(name = "InCustAddressAddress6")
    protected String inCustAddressAddress6;
    @XmlElement(name = "InCustAddressLatinInd")
    protected String inCustAddressLatinInd;
    @XmlElement(name = "InCustAddressMailBox")
    protected String inCustAddressMailBox;
    @XmlElement(name = "InCustAddressPtsInd")
    protected String inCustAddressPtsInd;
    @XmlElement(name = "InCustAddressCommunicationAddress")
    protected String inCustAddressCommunicationAddress;
    @XmlElement(name = "InCustAddressEntryStatus")
    protected String inCustAddressEntryStatus;
    @XmlElement(name = "InCustAddressTmstamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inCustAddressTmstamp;
    @XmlElement(name = "InCustomerNoOfBusinesses")
    protected int inCustomerNoOfBusinesses;
    @XmlElement(name = "InCustomerMobileTel2")
    protected String inCustomerMobileTel2;
    @XmlElement(name = "InCustomerEMail2")
    protected String inCustomerEMail2;
    @XmlElement(name = "InOfficeCustAddrParrelDCode")
    protected String inOfficeCustAddrParrelDCode;
    @XmlElement(name = "InOfficeCustAddrParrelDSn")
    protected int inOfficeCustAddrParrelDSn;
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
    @XmlElement(name = "InCustomerNumOfChildren")
    protected short inCustomerNumOfChildren;
    @XmlElement(name = "InCustomerFamilyMembers")
    protected short inCustomerFamilyMembers;
    @XmlElement(name = "InCustomerNoOfEmployees")
    protected int inCustomerNoOfEmployees;
    @XmlElement(name = "InCustomerPermEmployees")
    protected int inCustomerPermEmployees;

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
     * Gets the value of the inAfmIssueCountryGenericDetailDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInAfmIssueCountryGenericDetailDescription() {
        return inAfmIssueCountryGenericDetailDescription;
    }

    /**
     * Sets the value of the inAfmIssueCountryGenericDetailDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInAfmIssueCountryGenericDetailDescription(String value) {
        this.inAfmIssueCountryGenericDetailDescription = value;
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
     * Gets the value of the inAtractionGenericDetailSerialNum property.
     * 
     */
    public int getInAtractionGenericDetailSerialNum() {
        return inAtractionGenericDetailSerialNum;
    }

    /**
     * Sets the value of the inAtractionGenericDetailSerialNum property.
     * 
     */
    public void setInAtractionGenericDetailSerialNum(int value) {
        this.inAtractionGenericDetailSerialNum = value;
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
     * Gets the value of the inBranchPortfolioBranch property.
     * 
     */
    public int getInBranchPortfolioBranch() {
        return inBranchPortfolioBranch;
    }

    /**
     * Sets the value of the inBranchPortfolioBranch property.
     * 
     */
    public void setInBranchPortfolioBranch(int value) {
        this.inBranchPortfolioBranch = value;
    }

    /**
     * Gets the value of the inBranchPortfolioDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInBranchPortfolioDescription() {
        return inBranchPortfolioDescription;
    }

    /**
     * Sets the value of the inBranchPortfolioDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInBranchPortfolioDescription(String value) {
        this.inBranchPortfolioDescription = value;
    }

    /**
     * Gets the value of the inBranchPortfolioPortfolioCode property.
     * 
     */
    public int getInBranchPortfolioPortfolioCode() {
        return inBranchPortfolioPortfolioCode;
    }

    /**
     * Sets the value of the inBranchPortfolioPortfolioCode property.
     * 
     */
    public void setInBranchPortfolioPortfolioCode(int value) {
        this.inBranchPortfolioPortfolioCode = value;
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
     * Gets the value of the inCompanyCategGenericDetailDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCompanyCategGenericDetailDescription() {
        return inCompanyCategGenericDetailDescription;
    }

    /**
     * Sets the value of the inCompanyCategGenericDetailDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCompanyCategGenericDetailDescription(String value) {
        this.inCompanyCategGenericDetailDescription = value;
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
     * Gets the value of the inCompanySubcategCustomerCategoryTmstamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInCompanySubcategCustomerCategoryTmstamp() {
        return inCompanySubcategCustomerCategoryTmstamp;
    }

    /**
     * Sets the value of the inCompanySubcategCustomerCategoryTmstamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInCompanySubcategCustomerCategoryTmstamp(XMLGregorianCalendar value) {
        this.inCompanySubcategCustomerCategoryTmstamp = value;
    }

    /**
     * Gets the value of the inCompanySubcategGenericDetailDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCompanySubcategGenericDetailDescription() {
        return inCompanySubcategGenericDetailDescription;
    }

    /**
     * Sets the value of the inCompanySubcategGenericDetailDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCompanySubcategGenericDetailDescription(String value) {
        this.inCompanySubcategGenericDetailDescription = value;
    }

    /**
     * Gets the value of the inCompanySubcategGenericDetailSerialNum property.
     * 
     */
    public int getInCompanySubcategGenericDetailSerialNum() {
        return inCompanySubcategGenericDetailSerialNum;
    }

    /**
     * Sets the value of the inCompanySubcategGenericDetailSerialNum property.
     * 
     */
    public void setInCompanySubcategGenericDetailSerialNum(int value) {
        this.inCompanySubcategGenericDetailSerialNum = value;
    }

    /**
     * Gets the value of the inCompanySubcategGenericDetailShortDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCompanySubcategGenericDetailShortDescription() {
        return inCompanySubcategGenericDetailShortDescription;
    }

    /**
     * Sets the value of the inCompanySubcategGenericDetailShortDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCompanySubcategGenericDetailShortDescription(String value) {
        this.inCompanySubcategGenericDetailShortDescription = value;
    }

    /**
     * Gets the value of the inCompanyTypeCustomerCategoryTmstamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInCompanyTypeCustomerCategoryTmstamp() {
        return inCompanyTypeCustomerCategoryTmstamp;
    }

    /**
     * Sets the value of the inCompanyTypeCustomerCategoryTmstamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInCompanyTypeCustomerCategoryTmstamp(XMLGregorianCalendar value) {
        this.inCompanyTypeCustomerCategoryTmstamp = value;
    }

    /**
     * Gets the value of the inCompanyTypeGenericDetailSerialNum property.
     * 
     */
    public int getInCompanyTypeGenericDetailSerialNum() {
        return inCompanyTypeGenericDetailSerialNum;
    }

    /**
     * Sets the value of the inCompanyTypeGenericDetailSerialNum property.
     * 
     */
    public void setInCompanyTypeGenericDetailSerialNum(int value) {
        this.inCompanyTypeGenericDetailSerialNum = value;
    }

    /**
     * Gets the value of the inConditionsMembershipCustomerCategoryTmstamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInConditionsMembershipCustomerCategoryTmstamp() {
        return inConditionsMembershipCustomerCategoryTmstamp;
    }

    /**
     * Sets the value of the inConditionsMembershipCustomerCategoryTmstamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInConditionsMembershipCustomerCategoryTmstamp(XMLGregorianCalendar value) {
        this.inConditionsMembershipCustomerCategoryTmstamp = value;
    }

    /**
     * Gets the value of the inConditionsMembershipGenericDetailDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInConditionsMembershipGenericDetailDescription() {
        return inConditionsMembershipGenericDetailDescription;
    }

    /**
     * Sets the value of the inConditionsMembershipGenericDetailDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInConditionsMembershipGenericDetailDescription(String value) {
        this.inConditionsMembershipGenericDetailDescription = value;
    }

    /**
     * Gets the value of the inConditionsMembershipGenericDetailSerialNum property.
     * 
     */
    public int getInConditionsMembershipGenericDetailSerialNum() {
        return inConditionsMembershipGenericDetailSerialNum;
    }

    /**
     * Sets the value of the inConditionsMembershipGenericDetailSerialNum property.
     * 
     */
    public void setInConditionsMembershipGenericDetailSerialNum(int value) {
        this.inConditionsMembershipGenericDetailSerialNum = value;
    }

    /**
     * Gets the value of the inConditionsMembershipGenericDetailShortDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInConditionsMembershipGenericDetailShortDescription() {
        return inConditionsMembershipGenericDetailShortDescription;
    }

    /**
     * Sets the value of the inConditionsMembershipGenericDetailShortDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInConditionsMembershipGenericDetailShortDescription(String value) {
        this.inConditionsMembershipGenericDetailShortDescription = value;
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
     * Gets the value of the inCustomerBaselDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCustomerBaselDescription() {
        return inCustomerBaselDescription;
    }

    /**
     * Sets the value of the inCustomerBaselDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCustomerBaselDescription(String value) {
        this.inCustomerBaselDescription = value;
    }

    /**
     * Gets the value of the inCustomerBaselStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCustomerBaselStatus() {
        return inCustomerBaselStatus;
    }

    /**
     * Sets the value of the inCustomerBaselStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCustomerBaselStatus(String value) {
        this.inCustomerBaselStatus = value;
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
     * Gets the value of the inCustomerExpireDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInCustomerExpireDate() {
        return inCustomerExpireDate;
    }

    /**
     * Sets the value of the inCustomerExpireDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInCustomerExpireDate(XMLGregorianCalendar value) {
        this.inCustomerExpireDate = value;
    }

    /**
     * Gets the value of the inCustomerFaxIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCustomerFaxIndicator() {
        return inCustomerFaxIndicator;
    }

    /**
     * Sets the value of the inCustomerFaxIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCustomerFaxIndicator(String value) {
        this.inCustomerFaxIndicator = value;
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
     * Gets the value of the inCustomerInstituteInvInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCustomerInstituteInvInd() {
        return inCustomerInstituteInvInd;
    }

    /**
     * Sets the value of the inCustomerInstituteInvInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCustomerInstituteInvInd(String value) {
        this.inCustomerInstituteInvInd = value;
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
     * Gets the value of the inCustomerNonProfit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCustomerNonProfit() {
        return inCustomerNonProfit;
    }

    /**
     * Sets the value of the inCustomerNonProfit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCustomerNonProfit(String value) {
        this.inCustomerNonProfit = value;
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
     * Gets the value of the inCustomerReprFirstname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCustomerReprFirstname() {
        return inCustomerReprFirstname;
    }

    /**
     * Sets the value of the inCustomerReprFirstname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCustomerReprFirstname(String value) {
        this.inCustomerReprFirstname = value;
    }

    /**
     * Gets the value of the inCustomerReprPhone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCustomerReprPhone() {
        return inCustomerReprPhone;
    }

    /**
     * Sets the value of the inCustomerReprPhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCustomerReprPhone(String value) {
        this.inCustomerReprPhone = value;
    }

    /**
     * Gets the value of the inCustomerReprSurname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCustomerReprSurname() {
        return inCustomerReprSurname;
    }

    /**
     * Sets the value of the inCustomerReprSurname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCustomerReprSurname(String value) {
        this.inCustomerReprSurname = value;
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
     * Gets the value of the inCustomerSwiftAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCustomerSwiftAddress() {
        return inCustomerSwiftAddress;
    }

    /**
     * Sets the value of the inCustomerSwiftAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCustomerSwiftAddress(String value) {
        this.inCustomerSwiftAddress = value;
    }

    /**
     * Gets the value of the inCustomerSwiftConnectionInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCustomerSwiftConnectionInd() {
        return inCustomerSwiftConnectionInd;
    }

    /**
     * Sets the value of the inCustomerSwiftConnectionInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCustomerSwiftConnectionInd(String value) {
        this.inCustomerSwiftConnectionInd = value;
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
     * Gets the value of the inDateBankParametersCurrTrxDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInDateBankParametersCurrTrxDate() {
        return inDateBankParametersCurrTrxDate;
    }

    /**
     * Sets the value of the inDateBankParametersCurrTrxDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInDateBankParametersCurrTrxDate(XMLGregorianCalendar value) {
        this.inDateBankParametersCurrTrxDate = value;
    }

    /**
     * Gets the value of the inDateBankParametersLastClosedProdDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInDateBankParametersLastClosedProdDate() {
        return inDateBankParametersLastClosedProdDate;
    }

    /**
     * Sets the value of the inDateBankParametersLastClosedProdDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInDateBankParametersLastClosedProdDate(XMLGregorianCalendar value) {
        this.inDateBankParametersLastClosedProdDate = value;
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
     * Gets the value of the inEconomicGroupCustomerCategoryTmstamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInEconomicGroupCustomerCategoryTmstamp() {
        return inEconomicGroupCustomerCategoryTmstamp;
    }

    /**
     * Sets the value of the inEconomicGroupCustomerCategoryTmstamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInEconomicGroupCustomerCategoryTmstamp(XMLGregorianCalendar value) {
        this.inEconomicGroupCustomerCategoryTmstamp = value;
    }

    /**
     * Gets the value of the inEconomicGroupGenericDetailSerialNum property.
     * 
     */
    public int getInEconomicGroupGenericDetailSerialNum() {
        return inEconomicGroupGenericDetailSerialNum;
    }

    /**
     * Sets the value of the inEconomicGroupGenericDetailSerialNum property.
     * 
     */
    public void setInEconomicGroupGenericDetailSerialNum(int value) {
        this.inEconomicGroupGenericDetailSerialNum = value;
    }

    /**
     * Gets the value of the inExternalSystemDataChannelId property.
     * 
     */
    public int getInExternalSystemDataChannelId() {
        return inExternalSystemDataChannelId;
    }

    /**
     * Sets the value of the inExternalSystemDataChannelId property.
     * 
     */
    public void setInExternalSystemDataChannelId(int value) {
        this.inExternalSystemDataChannelId = value;
    }

    /**
     * Gets the value of the inExternalSystemDataChannelPassword property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInExternalSystemDataChannelPassword() {
        return inExternalSystemDataChannelPassword;
    }

    /**
     * Sets the value of the inExternalSystemDataChannelPassword property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInExternalSystemDataChannelPassword(String value) {
        this.inExternalSystemDataChannelPassword = value;
    }

    /**
     * Gets the value of the inExternalSystemDataChannelUser property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInExternalSystemDataChannelUser() {
        return inExternalSystemDataChannelUser;
    }

    /**
     * Sets the value of the inExternalSystemDataChannelUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInExternalSystemDataChannelUser(String value) {
        this.inExternalSystemDataChannelUser = value;
    }

    /**
     * Gets the value of the inExternalSystemDataProfitsUniqueId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInExternalSystemDataProfitsUniqueId() {
        return inExternalSystemDataProfitsUniqueId;
    }

    /**
     * Sets the value of the inExternalSystemDataProfitsUniqueId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInExternalSystemDataProfitsUniqueId(String value) {
        this.inExternalSystemDataProfitsUniqueId = value;
    }

    /**
     * Gets the value of the inExternalSystemDataReferenceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInExternalSystemDataReferenceNumber() {
        return inExternalSystemDataReferenceNumber;
    }

    /**
     * Sets the value of the inExternalSystemDataReferenceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInExternalSystemDataReferenceNumber(String value) {
        this.inExternalSystemDataReferenceNumber = value;
    }

    /**
     * Gets the value of the inExternalSystemDataSoftId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInExternalSystemDataSoftId() {
        return inExternalSystemDataSoftId;
    }

    /**
     * Sets the value of the inExternalSystemDataSoftId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInExternalSystemDataSoftId(String value) {
        this.inExternalSystemDataSoftId = value;
    }

    /**
     * Gets the value of the inExternalSystemDataWsId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInExternalSystemDataWsId() {
        return inExternalSystemDataWsId;
    }

    /**
     * Sets the value of the inExternalSystemDataWsId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInExternalSystemDataWsId(String value) {
        this.inExternalSystemDataWsId = value;
    }

    /**
     * Gets the value of the inGrpCustcatLength property.
     * 
     */
    public int getInGrpCustcatLength() {
        return inGrpCustcatLength;
    }

    /**
     * Sets the value of the inGrpCustcatLength property.
     * 
     */
    public void setInGrpCustcatLength(int value) {
        this.inGrpCustcatLength = value;
    }

    /**
     * Gets the value of the inGrpCustomerShareholdersLength property.
     * 
     */
    public int getInGrpCustomerShareholdersLength() {
        return inGrpCustomerShareholdersLength;
    }

    /**
     * Sets the value of the inGrpCustomerShareholdersLength property.
     * 
     */
    public void setInGrpCustomerShareholdersLength(int value) {
        this.inGrpCustomerShareholdersLength = value;
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
     * Gets the value of the inLegalTypeCustomerCategoryTmstamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInLegalTypeCustomerCategoryTmstamp() {
        return inLegalTypeCustomerCategoryTmstamp;
    }

    /**
     * Sets the value of the inLegalTypeCustomerCategoryTmstamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInLegalTypeCustomerCategoryTmstamp(XMLGregorianCalendar value) {
        this.inLegalTypeCustomerCategoryTmstamp = value;
    }

    /**
     * Gets the value of the inLegalTypeGenericDetailSerialNum property.
     * 
     */
    public int getInLegalTypeGenericDetailSerialNum() {
        return inLegalTypeGenericDetailSerialNum;
    }

    /**
     * Sets the value of the inLegalTypeGenericDetailSerialNum property.
     * 
     */
    public void setInLegalTypeGenericDetailSerialNum(int value) {
        this.inLegalTypeGenericDetailSerialNum = value;
    }

    /**
     * Gets the value of the inMarketCustomerCategoryTmstamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInMarketCustomerCategoryTmstamp() {
        return inMarketCustomerCategoryTmstamp;
    }

    /**
     * Sets the value of the inMarketCustomerCategoryTmstamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInMarketCustomerCategoryTmstamp(XMLGregorianCalendar value) {
        this.inMarketCustomerCategoryTmstamp = value;
    }

    /**
     * Gets the value of the inMarketGenericDetailDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInMarketGenericDetailDescription() {
        return inMarketGenericDetailDescription;
    }

    /**
     * Sets the value of the inMarketGenericDetailDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInMarketGenericDetailDescription(String value) {
        this.inMarketGenericDetailDescription = value;
    }

    /**
     * Gets the value of the inMarketGenericDetailEntryStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInMarketGenericDetailEntryStatus() {
        return inMarketGenericDetailEntryStatus;
    }

    /**
     * Sets the value of the inMarketGenericDetailEntryStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInMarketGenericDetailEntryStatus(String value) {
        this.inMarketGenericDetailEntryStatus = value;
    }

    /**
     * Gets the value of the inMarketGenericDetailSerialNum property.
     * 
     */
    public int getInMarketGenericDetailSerialNum() {
        return inMarketGenericDetailSerialNum;
    }

    /**
     * Sets the value of the inMarketGenericDetailSerialNum property.
     * 
     */
    public void setInMarketGenericDetailSerialNum(int value) {
        this.inMarketGenericDetailSerialNum = value;
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
     * Gets the value of the inMntRecordingChannelId property.
     * 
     */
    public int getInMntRecordingChannelId() {
        return inMntRecordingChannelId;
    }

    /**
     * Sets the value of the inMntRecordingChannelId property.
     * 
     */
    public void setInMntRecordingChannelId(int value) {
        this.inMntRecordingChannelId = value;
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
     * Gets the value of the inMntRecordingTrxDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInMntRecordingTrxDate() {
        return inMntRecordingTrxDate;
    }

    /**
     * Sets the value of the inMntRecordingTrxDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInMntRecordingTrxDate(XMLGregorianCalendar value) {
        this.inMntRecordingTrxDate = value;
    }

    /**
     * Gets the value of the inMntRecordingTrxUnit property.
     * 
     */
    public int getInMntRecordingTrxUnit() {
        return inMntRecordingTrxUnit;
    }

    /**
     * Sets the value of the inMntRecordingTrxUnit property.
     * 
     */
    public void setInMntRecordingTrxUnit(int value) {
        this.inMntRecordingTrxUnit = value;
    }

    /**
     * Gets the value of the inMntRecordingTrxUser property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInMntRecordingTrxUser() {
        return inMntRecordingTrxUser;
    }

    /**
     * Sets the value of the inMntRecordingTrxUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInMntRecordingTrxUser(String value) {
        this.inMntRecordingTrxUser = value;
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
     * Gets the value of the inOfficeAddressCountryGenericDetailShortDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInOfficeAddressCountryGenericDetailShortDescription() {
        return inOfficeAddressCountryGenericDetailShortDescription;
    }

    /**
     * Sets the value of the inOfficeAddressCountryGenericDetailShortDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInOfficeAddressCountryGenericDetailShortDescription(String value) {
        this.inOfficeAddressCountryGenericDetailShortDescription = value;
    }

    /**
     * Gets the value of the inOfficeCustAddressAddress1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInOfficeCustAddressAddress1() {
        return inOfficeCustAddressAddress1;
    }

    /**
     * Sets the value of the inOfficeCustAddressAddress1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInOfficeCustAddressAddress1(String value) {
        this.inOfficeCustAddressAddress1 = value;
    }

    /**
     * Gets the value of the inOfficeCustAddressAddressType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInOfficeCustAddressAddressType() {
        return inOfficeCustAddressAddressType;
    }

    /**
     * Sets the value of the inOfficeCustAddressAddressType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInOfficeCustAddressAddressType(String value) {
        this.inOfficeCustAddressAddressType = value;
    }

    /**
     * Gets the value of the inOfficeCustAddressCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInOfficeCustAddressCity() {
        return inOfficeCustAddressCity;
    }

    /**
     * Sets the value of the inOfficeCustAddressCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInOfficeCustAddressCity(String value) {
        this.inOfficeCustAddressCity = value;
    }

    /**
     * Gets the value of the inOfficeCustAddressEntryComments property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInOfficeCustAddressEntryComments() {
        return inOfficeCustAddressEntryComments;
    }

    /**
     * Sets the value of the inOfficeCustAddressEntryComments property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInOfficeCustAddressEntryComments(String value) {
        this.inOfficeCustAddressEntryComments = value;
    }

    /**
     * Gets the value of the inOfficeCustAddressEntryStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInOfficeCustAddressEntryStatus() {
        return inOfficeCustAddressEntryStatus;
    }

    /**
     * Sets the value of the inOfficeCustAddressEntryStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInOfficeCustAddressEntryStatus(String value) {
        this.inOfficeCustAddressEntryStatus = value;
    }

    /**
     * Gets the value of the inOfficeCustAddressMailBox property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInOfficeCustAddressMailBox() {
        return inOfficeCustAddressMailBox;
    }

    /**
     * Sets the value of the inOfficeCustAddressMailBox property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInOfficeCustAddressMailBox(String value) {
        this.inOfficeCustAddressMailBox = value;
    }

    /**
     * Gets the value of the inOfficeCustAddressSerialNum property.
     * 
     */
    public short getInOfficeCustAddressSerialNum() {
        return inOfficeCustAddressSerialNum;
    }

    /**
     * Sets the value of the inOfficeCustAddressSerialNum property.
     * 
     */
    public void setInOfficeCustAddressSerialNum(short value) {
        this.inOfficeCustAddressSerialNum = value;
    }

    /**
     * Gets the value of the inOfficeCustAddressTmstamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInOfficeCustAddressTmstamp() {
        return inOfficeCustAddressTmstamp;
    }

    /**
     * Sets the value of the inOfficeCustAddressTmstamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInOfficeCustAddressTmstamp(XMLGregorianCalendar value) {
        this.inOfficeCustAddressTmstamp = value;
    }

    /**
     * Gets the value of the inOfficeCustAddressZipCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInOfficeCustAddressZipCode() {
        return inOfficeCustAddressZipCode;
    }

    /**
     * Sets the value of the inOfficeCustAddressZipCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInOfficeCustAddressZipCode(String value) {
        this.inOfficeCustAddressZipCode = value;
    }

    /**
     * Gets the value of the inOpenUnitCode property.
     * 
     */
    public int getInOpenUnitCode() {
        return inOpenUnitCode;
    }

    /**
     * Sets the value of the inOpenUnitCode property.
     * 
     */
    public void setInOpenUnitCode(int value) {
        this.inOpenUnitCode = value;
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
     * Gets the value of the inProfile1UnitCategoryPerRoleId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInProfile1UnitCategoryPerRoleId() {
        return inProfile1UnitCategoryPerRoleId;
    }

    /**
     * Sets the value of the inProfile1UnitCategoryPerRoleId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInProfile1UnitCategoryPerRoleId(String value) {
        this.inProfile1UnitCategoryPerRoleId = value;
    }

    /**
     * Gets the value of the inProfile2UnitCategoryPerRoleId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInProfile2UnitCategoryPerRoleId() {
        return inProfile2UnitCategoryPerRoleId;
    }

    /**
     * Sets the value of the inProfile2UnitCategoryPerRoleId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInProfile2UnitCategoryPerRoleId(String value) {
        this.inProfile2UnitCategoryPerRoleId = value;
    }

    /**
     * Gets the value of the inProfile3UnitCategoryPerRoleId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInProfile3UnitCategoryPerRoleId() {
        return inProfile3UnitCategoryPerRoleId;
    }

    /**
     * Sets the value of the inProfile3UnitCategoryPerRoleId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInProfile3UnitCategoryPerRoleId(String value) {
        this.inProfile3UnitCategoryPerRoleId = value;
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
     * Gets the value of the inRegistryCountryGenericDetailShortDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInRegistryCountryGenericDetailShortDescription() {
        return inRegistryCountryGenericDetailShortDescription;
    }

    /**
     * Sets the value of the inRegistryCountryGenericDetailShortDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInRegistryCountryGenericDetailShortDescription(String value) {
        this.inRegistryCountryGenericDetailShortDescription = value;
    }

    /**
     * Gets the value of the inRegistryOtherIdExpiryDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInRegistryOtherIdExpiryDate() {
        return inRegistryOtherIdExpiryDate;
    }

    /**
     * Sets the value of the inRegistryOtherIdExpiryDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInRegistryOtherIdExpiryDate(XMLGregorianCalendar value) {
        this.inRegistryOtherIdExpiryDate = value;
    }

    /**
     * Gets the value of the inRegistryOtherIdIdNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInRegistryOtherIdIdNo() {
        return inRegistryOtherIdIdNo;
    }

    /**
     * Sets the value of the inRegistryOtherIdIdNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInRegistryOtherIdIdNo(String value) {
        this.inRegistryOtherIdIdNo = value;
    }

    /**
     * Gets the value of the inRegistryOtherIdIssueAuthority property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInRegistryOtherIdIssueAuthority() {
        return inRegistryOtherIdIssueAuthority;
    }

    /**
     * Sets the value of the inRegistryOtherIdIssueAuthority property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInRegistryOtherIdIssueAuthority(String value) {
        this.inRegistryOtherIdIssueAuthority = value;
    }

    /**
     * Gets the value of the inRegistryOtherIdIssueDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInRegistryOtherIdIssueDate() {
        return inRegistryOtherIdIssueDate;
    }

    /**
     * Sets the value of the inRegistryOtherIdIssueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInRegistryOtherIdIssueDate(XMLGregorianCalendar value) {
        this.inRegistryOtherIdIssueDate = value;
    }

    /**
     * Gets the value of the inRegistryOtherIdSerialNo property.
     * 
     */
    public short getInRegistryOtherIdSerialNo() {
        return inRegistryOtherIdSerialNo;
    }

    /**
     * Sets the value of the inRegistryOtherIdSerialNo property.
     * 
     */
    public void setInRegistryOtherIdSerialNo(short value) {
        this.inRegistryOtherIdSerialNo = value;
    }

    /**
     * Gets the value of the inRegistryOtherIdTmstamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInRegistryOtherIdTmstamp() {
        return inRegistryOtherIdTmstamp;
    }

    /**
     * Sets the value of the inRegistryOtherIdTmstamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInRegistryOtherIdTmstamp(XMLGregorianCalendar value) {
        this.inRegistryOtherIdTmstamp = value;
    }

    /**
     * Gets the value of the inRmBankemployeeFirstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInRmBankemployeeFirstName() {
        return inRmBankemployeeFirstName;
    }

    /**
     * Sets the value of the inRmBankemployeeFirstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInRmBankemployeeFirstName(String value) {
        this.inRmBankemployeeFirstName = value;
    }

    /**
     * Gets the value of the inRmBankemployeeLastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInRmBankemployeeLastName() {
        return inRmBankemployeeLastName;
    }

    /**
     * Sets the value of the inRmBankemployeeLastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInRmBankemployeeLastName(String value) {
        this.inRmBankemployeeLastName = value;
    }

    /**
     * Gets the value of the inRmUsrCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInRmUsrCode() {
        return inRmUsrCode;
    }

    /**
     * Sets the value of the inRmUsrCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInRmUsrCode(String value) {
        this.inRmUsrCode = value;
    }

    /**
     * Gets the value of the inSegmentCustomerCategoryTmstamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInSegmentCustomerCategoryTmstamp() {
        return inSegmentCustomerCategoryTmstamp;
    }

    /**
     * Sets the value of the inSegmentCustomerCategoryTmstamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInSegmentCustomerCategoryTmstamp(XMLGregorianCalendar value) {
        this.inSegmentCustomerCategoryTmstamp = value;
    }

    /**
     * Gets the value of the inSegmentGenericDetailDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInSegmentGenericDetailDescription() {
        return inSegmentGenericDetailDescription;
    }

    /**
     * Sets the value of the inSegmentGenericDetailDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInSegmentGenericDetailDescription(String value) {
        this.inSegmentGenericDetailDescription = value;
    }

    /**
     * Gets the value of the inSegmentGenericDetailEntryStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInSegmentGenericDetailEntryStatus() {
        return inSegmentGenericDetailEntryStatus;
    }

    /**
     * Sets the value of the inSegmentGenericDetailEntryStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInSegmentGenericDetailEntryStatus(String value) {
        this.inSegmentGenericDetailEntryStatus = value;
    }

    /**
     * Gets the value of the inSegmentGenericDetailSerialNum property.
     * 
     */
    public int getInSegmentGenericDetailSerialNum() {
        return inSegmentGenericDetailSerialNum;
    }

    /**
     * Sets the value of the inSegmentGenericDetailSerialNum property.
     * 
     */
    public void setInSegmentGenericDetailSerialNum(int value) {
        this.inSegmentGenericDetailSerialNum = value;
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
     * Gets the value of the inThinkingCurrencyShortDescr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInThinkingCurrencyShortDescr() {
        return inThinkingCurrencyShortDescr;
    }

    /**
     * Sets the value of the inThinkingCurrencyShortDescr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInThinkingCurrencyShortDescr(String value) {
        this.inThinkingCurrencyShortDescr = value;
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
     *     {@link ArrayOfInGrpCustcatC }
     *     
     */
    public ArrayOfInGrpCustcatC getInGrpCustcat() {
        return inGrpCustcat;
    }

    /**
     * Sets the value of the inGrpCustcat property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfInGrpCustcatC }
     *     
     */
    public void setInGrpCustcat(ArrayOfInGrpCustcatC value) {
        this.inGrpCustcat = value;
    }

    /**
     * Gets the value of the inGrpCustomerShareholders property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfInGrpCustomerShareholders }
     *     
     */
    public ArrayOfInGrpCustomerShareholders getInGrpCustomerShareholders() {
        return inGrpCustomerShareholders;
    }

    /**
     * Sets the value of the inGrpCustomerShareholders property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfInGrpCustomerShareholders }
     *     
     */
    public void setInGrpCustomerShareholders(ArrayOfInGrpCustomerShareholders value) {
        this.inGrpCustomerShareholders = value;
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
     * Gets the value of the inMonitoringBankemployeeFirstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInMonitoringBankemployeeFirstName() {
        return inMonitoringBankemployeeFirstName;
    }

    /**
     * Sets the value of the inMonitoringBankemployeeFirstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInMonitoringBankemployeeFirstName(String value) {
        this.inMonitoringBankemployeeFirstName = value;
    }

    /**
     * Gets the value of the inMonitoringBankemployeeLastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInMonitoringBankemployeeLastName() {
        return inMonitoringBankemployeeLastName;
    }

    /**
     * Sets the value of the inMonitoringBankemployeeLastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInMonitoringBankemployeeLastName(String value) {
        this.inMonitoringBankemployeeLastName = value;
    }

    /**
     * Gets the value of the inOfficeAddressDistrictGenericDetailDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInOfficeAddressDistrictGenericDetailDescription() {
        return inOfficeAddressDistrictGenericDetailDescription;
    }

    /**
     * Sets the value of the inOfficeAddressDistrictGenericDetailDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInOfficeAddressDistrictGenericDetailDescription(String value) {
        this.inOfficeAddressDistrictGenericDetailDescription = value;
    }

    /**
     * Gets the value of the inOfficeAddressDistrictGenericDetailShortDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInOfficeAddressDistrictGenericDetailShortDescription() {
        return inOfficeAddressDistrictGenericDetailShortDescription;
    }

    /**
     * Sets the value of the inOfficeAddressDistrictGenericDetailShortDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInOfficeAddressDistrictGenericDetailShortDescription(String value) {
        this.inOfficeAddressDistrictGenericDetailShortDescription = value;
    }

    /**
     * Gets the value of the inOfficeAddressDistrictGenericDetailSerialNum property.
     * 
     */
    public int getInOfficeAddressDistrictGenericDetailSerialNum() {
        return inOfficeAddressDistrictGenericDetailSerialNum;
    }

    /**
     * Sets the value of the inOfficeAddressDistrictGenericDetailSerialNum property.
     * 
     */
    public void setInOfficeAddressDistrictGenericDetailSerialNum(int value) {
        this.inOfficeAddressDistrictGenericDetailSerialNum = value;
    }

    /**
     * Gets the value of the inOfficeCustAddressAccomodationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInOfficeCustAddressAccomodationDate() {
        return inOfficeCustAddressAccomodationDate;
    }

    /**
     * Sets the value of the inOfficeCustAddressAccomodationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInOfficeCustAddressAccomodationDate(XMLGregorianCalendar value) {
        this.inOfficeCustAddressAccomodationDate = value;
    }

    /**
     * Gets the value of the inOfficeCustAddressInternetAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInOfficeCustAddressInternetAddress() {
        return inOfficeCustAddressInternetAddress;
    }

    /**
     * Sets the value of the inOfficeCustAddressInternetAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInOfficeCustAddressInternetAddress(String value) {
        this.inOfficeCustAddressInternetAddress = value;
    }

    /**
     * Gets the value of the inOfficeCustAddressEMail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInOfficeCustAddressEMail() {
        return inOfficeCustAddressEMail;
    }

    /**
     * Sets the value of the inOfficeCustAddressEMail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInOfficeCustAddressEMail(String value) {
        this.inOfficeCustAddressEMail = value;
    }

    /**
     * Gets the value of the inOfficeCustAddressTelephone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInOfficeCustAddressTelephone() {
        return inOfficeCustAddressTelephone;
    }

    /**
     * Sets the value of the inOfficeCustAddressTelephone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInOfficeCustAddressTelephone(String value) {
        this.inOfficeCustAddressTelephone = value;
    }

    /**
     * Gets the value of the inOfficeCustAddressTelephone2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInOfficeCustAddressTelephone2() {
        return inOfficeCustAddressTelephone2;
    }

    /**
     * Sets the value of the inOfficeCustAddressTelephone2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInOfficeCustAddressTelephone2(String value) {
        this.inOfficeCustAddressTelephone2 = value;
    }

    /**
     * Gets the value of the inOfficeCustAddressTelephone3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInOfficeCustAddressTelephone3() {
        return inOfficeCustAddressTelephone3;
    }

    /**
     * Sets the value of the inOfficeCustAddressTelephone3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInOfficeCustAddressTelephone3(String value) {
        this.inOfficeCustAddressTelephone3 = value;
    }

    /**
     * Gets the value of the inOfficeCustAddressAddress2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInOfficeCustAddressAddress2() {
        return inOfficeCustAddressAddress2;
    }

    /**
     * Sets the value of the inOfficeCustAddressAddress2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInOfficeCustAddressAddress2(String value) {
        this.inOfficeCustAddressAddress2 = value;
    }

    /**
     * Gets the value of the inOfficeCustAddressAddress3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInOfficeCustAddressAddress3() {
        return inOfficeCustAddressAddress3;
    }

    /**
     * Sets the value of the inOfficeCustAddressAddress3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInOfficeCustAddressAddress3(String value) {
        this.inOfficeCustAddressAddress3 = value;
    }

    /**
     * Gets the value of the inOfficeCustAddressAddress4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInOfficeCustAddressAddress4() {
        return inOfficeCustAddressAddress4;
    }

    /**
     * Sets the value of the inOfficeCustAddressAddress4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInOfficeCustAddressAddress4(String value) {
        this.inOfficeCustAddressAddress4 = value;
    }

    /**
     * Gets the value of the inOfficeCustAddressAddress5 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInOfficeCustAddressAddress5() {
        return inOfficeCustAddressAddress5;
    }

    /**
     * Sets the value of the inOfficeCustAddressAddress5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInOfficeCustAddressAddress5(String value) {
        this.inOfficeCustAddressAddress5 = value;
    }

    /**
     * Gets the value of the inOfficeCustAddressAddress6 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInOfficeCustAddressAddress6() {
        return inOfficeCustAddressAddress6;
    }

    /**
     * Sets the value of the inOfficeCustAddressAddress6 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInOfficeCustAddressAddress6(String value) {
        this.inOfficeCustAddressAddress6 = value;
    }

    /**
     * Gets the value of the inOfficeCustAddressSegmFlags property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInOfficeCustAddressSegmFlags() {
        return inOfficeCustAddressSegmFlags;
    }

    /**
     * Sets the value of the inOfficeCustAddressSegmFlags property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInOfficeCustAddressSegmFlags(String value) {
        this.inOfficeCustAddressSegmFlags = value;
    }

    /**
     * Gets the value of the inOfficeCustAddressLatinInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInOfficeCustAddressLatinInd() {
        return inOfficeCustAddressLatinInd;
    }

    /**
     * Sets the value of the inOfficeCustAddressLatinInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInOfficeCustAddressLatinInd(String value) {
        this.inOfficeCustAddressLatinInd = value;
    }

    /**
     * Gets the value of the inOfficeCustAddressPtsInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInOfficeCustAddressPtsInd() {
        return inOfficeCustAddressPtsInd;
    }

    /**
     * Sets the value of the inOfficeCustAddressPtsInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInOfficeCustAddressPtsInd(String value) {
        this.inOfficeCustAddressPtsInd = value;
    }

    /**
     * Gets the value of the inOfficeCustAddressFaxNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInOfficeCustAddressFaxNo() {
        return inOfficeCustAddressFaxNo;
    }

    /**
     * Sets the value of the inOfficeCustAddressFaxNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInOfficeCustAddressFaxNo(String value) {
        this.inOfficeCustAddressFaxNo = value;
    }

    /**
     * Gets the value of the inOfficeCustAddressCommunicationAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInOfficeCustAddressCommunicationAddress() {
        return inOfficeCustAddressCommunicationAddress;
    }

    /**
     * Sets the value of the inOfficeCustAddressCommunicationAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInOfficeCustAddressCommunicationAddress(String value) {
        this.inOfficeCustAddressCommunicationAddress = value;
    }

    /**
     * Gets the value of the inOfficeCustAddressRegion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInOfficeCustAddressRegion() {
        return inOfficeCustAddressRegion;
    }

    /**
     * Sets the value of the inOfficeCustAddressRegion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInOfficeCustAddressRegion(String value) {
        this.inOfficeCustAddressRegion = value;
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
     * Gets the value of the inCustomerNoOfBusinesses property.
     * 
     */
    public int getInCustomerNoOfBusinesses() {
        return inCustomerNoOfBusinesses;
    }

    /**
     * Sets the value of the inCustomerNoOfBusinesses property.
     * 
     */
    public void setInCustomerNoOfBusinesses(int value) {
        this.inCustomerNoOfBusinesses = value;
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
     * Gets the value of the inOfficeCustAddrParrelDCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInOfficeCustAddrParrelDCode() {
        return inOfficeCustAddrParrelDCode;
    }

    /**
     * Sets the value of the inOfficeCustAddrParrelDCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInOfficeCustAddrParrelDCode(String value) {
        this.inOfficeCustAddrParrelDCode = value;
    }

    /**
     * Gets the value of the inOfficeCustAddrParrelDSn property.
     * 
     */
    public int getInOfficeCustAddrParrelDSn() {
        return inOfficeCustAddrParrelDSn;
    }

    /**
     * Sets the value of the inOfficeCustAddrParrelDSn property.
     * 
     */
    public void setInOfficeCustAddrParrelDSn(int value) {
        this.inOfficeCustAddrParrelDSn = value;
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
     * Gets the value of the inCustomerNoOfEmployees property.
     * 
     */
    public int getInCustomerNoOfEmployees() {
        return inCustomerNoOfEmployees;
    }

    /**
     * Sets the value of the inCustomerNoOfEmployees property.
     * 
     */
    public void setInCustomerNoOfEmployees(int value) {
        this.inCustomerNoOfEmployees = value;
    }

    /**
     * Gets the value of the inCustomerPermEmployees property.
     * 
     */
    public int getInCustomerPermEmployees() {
        return inCustomerPermEmployees;
    }

    /**
     * Sets the value of the inCustomerPermEmployees property.
     * 
     */
    public void setInCustomerPermEmployees(int value) {
        this.inCustomerPermEmployees = value;
    }

}
