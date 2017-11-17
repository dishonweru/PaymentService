
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for T2151VInsuranceCommitmentMaintenanceExport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="T2151VInsuranceCommitmentMaintenanceExport">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}BaseExport">
 *       &lt;sequence>
 *         &lt;element name="LocCreateDamageIssDamageDtlDamageAmnt" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="LocCreateDamageIssDamageDtlReplaced" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LocCreateDamageIssDamageDtlTpSoIdentifier" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="LocCreateDamageIssDamageDtlTypeCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="LocCreateDamageIssDamageDtlYear" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutCanamParmsFilename" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCancelUsrBankemployeeLastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCrAccountDepositAccountAccountNumber" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OutCrAccountDepositAccountCDigit" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutCrCustAccCurencyCurrencyIdCurrency" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutCrCustAccCurencyCurrencyShortDescr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCrCustomerCDigit" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutCrCustomerCustId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutCrCustomerDepositAccountCDigit" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutCrCustomerDepositAccountDesignation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCrCustomerListSetDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCusCatGenericDetailDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustomer2DepositAccountCDigit" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutCustomer2DepositAccountDesignation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustomer3DepositAccountCDigit" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutCustomer3DepositAccountDesignation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustomerCategoryGenericDetailDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutDrAfmOtherAfmAfmNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutDrCustAccCurrencyCurrencyIdCurrency" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutDrCustAccCurrencyCurrencyShortDescr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutDrCustAddressCustAddressAddress1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutDrCustAddressCustAddressAddress2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutDrCustAddressCustAddressCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutDrCustAddressCustAddressTelephone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutDrCustAddressCustAddressZipCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutDrCustomerAccountDepositAccountAccountNumber" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OutDrCustomerAccountDepositAccountCDigit" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutDrCustomerAccountDepositAccountDesignation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutDrCustomerCounrtyGenericDetailDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutDrCustomerCustomerCDigit" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutDrCustomerCustomerCustId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutDrCustomerCustomerDateOfBirth" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutDrCustomerCustomerMobileTel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutDrCustomerCustomerSurname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutDrCustomerCustomerTelephone1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutDrCustomerTaxTaxOfficeTaxOfficeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutDrCustomerCustomerCustType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpDamage" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}ArrayOfOutGrpDamageItem" minOccurs="0"/>
 *         &lt;element name="OutGrpHousingTheft" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}ArrayOfOutGrpHousingTheftItem" minOccurs="0"/>
 *         &lt;element name="OutGrpIssComApp" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}ArrayOfOutGrpIssComAppItem" minOccurs="0"/>
 *         &lt;element name="OutHouseRoofGenericDetailDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutHouseSkeletonGenericDetailDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutHouseTypeGenericDetailDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutHouseWaleGenericDetailDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutHousingDetailsAddress1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutHousingDetailsAddress2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutHousingDetailsCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutHousingDetailsFloor" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutHousingDetailsHouseType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutHousingDetailsHouseUse" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutHousingDetailsNoFloors" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutHousingDetailsPartailComments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutHousingDetailsPartial" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutHousingDetailsRoof" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutHousingDetailsSkeleton" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutHousingDetailsSquare" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutHousingDetailsUseBasement" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutHousingDetailsUseFloor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutHousingDetailsUseGroundFloor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutHousingDetailsWale" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutHousingDetailsZipCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutHousingDetailsIssHousingDetailsAddress1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutHousingDetailsIssHousingDetailsAddress2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutHousingDetailsIssHousingDetailsBlockAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutHousingDetailsIssHousingDetailsBlockAmount2" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutHousingDetailsIssHousingDetailsBlockAmount3" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutHousingDetailsIssHousingDetailsCancelledContr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutHousingDetailsIssHousingDetailsCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutHousingDetailsIssHousingDetailsConstrDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutHousingDetailsIssHousingDetailsContrComments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutHousingDetailsIssHousingDetailsDamageInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutHousingDetailsIssHousingDetailsEarthquakeCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutHousingDetailsIssHousingDetailsFloor" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutHousingDetailsIssHousingDetailsHouseType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutHousingDetailsIssHousingDetailsHouseUse" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutHousingDetailsIssHousingDetailsHsIssuanceAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutHousingDetailsIssHousingDetailsHsIssuanceCapital" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutHousingDetailsIssHousingDetailsLnsAccCd2" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutHousingDetailsIssHousingDetailsLnsAccCd3" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutHousingDetailsIssHousingDetailsLnsAccSn2" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutHousingDetailsIssHousingDetailsLnsAccSn3" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutHousingDetailsIssHousingDetailsLnsAccType2" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutHousingDetailsIssHousingDetailsLnsAccType3" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutHousingDetailsIssHousingDetailsLnsAccUnit2" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutHousingDetailsIssHousingDetailsLnsAccUnit3" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutHousingDetailsIssHousingDetailsLoanAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutHousingDetailsIssHousingDetailsLoanAmount2" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutHousingDetailsIssHousingDetailsLoanAmount3" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutHousingDetailsIssHousingDetailsLoanExpDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutHousingDetailsIssHousingDetailsLoanExpDt2" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutHousingDetailsIssHousingDetailsLoanExpDt3" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutHousingDetailsIssHousingDetailsNoFloors" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutHousingDetailsIssHousingDetailsOtherCustComment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutHousingDetailsIssHousingDetailsOtherCustInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutHousingDetailsIssHousingDetailsPartial" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutHousingDetailsIssHousingDetailsPartialComments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutHousingDetailsIssHousingDetailsRoof" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutHousingDetailsIssHousingDetailsSkeleton" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutHousingDetailsIssHousingDetailsSquere" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutHousingDetailsIssHousingDetailsTpSoIdentifier" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OutHousingDetailsIssHousingDetailsUseBasement" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutHousingDetailsIssHousingDetailsUseFloor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutHousingDetailsIssHousingDetailsUseGround" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutHousingDetailsIssHousingDetailsWale" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutHousingDetailsIssHousingDetailsZipCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutHoustypCatGenericDetailDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutHsdamCatGenericDetailDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutHsqukCatGenericDetailDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutInsuranceIssCommitmentActivationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutInsuranceIssCommitmentCancelationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutInsuranceIssCommitmentChargeAmnPerPay" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutInsuranceIssCommitmentChargeMethod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutInsuranceIssCommitmentComments1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutInsuranceIssCommitmentComments2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutInsuranceIssCommitmentCoverRatio" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutInsuranceIssCommitmentCrAccCustomerId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutInsuranceIssCommitmentCrDepAccount" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OutInsuranceIssCommitmentCreditCardNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutInsuranceIssCommitmentDrAccCustomerId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutInsuranceIssCommitmentEntryStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutInsuranceIssCommitmentExpirationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutInsuranceIssCommitmentFinalizeDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutInsuranceIssCommitmentFixAmnPay" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutInsuranceIssCommitmentFkAccCd" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutInsuranceIssCommitmentFkAccSn" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutInsuranceIssCommitmentFkAccType" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutInsuranceIssCommitmentFkAccUnit" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutInsuranceIssCommitmentFkCategory" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutInsuranceIssCommitmentFkCnlUsr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutInsuranceIssCommitmentFkDebitAccount" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OutInsuranceIssCommitmentFkFinalizeUsr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutInsuranceIssCommitmentFkGenDetSerNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutInsuranceIssCommitmentFkGenericHeadpar" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutInsuranceIssCommitmentFkResponsibleUnit" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutInsuranceIssCommitmentFkUpdUsr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutInsuranceIssCommitmentFrequency" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutInsuranceIssCommitmentFrequencyUnit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutInsuranceIssCommitmentGradAppExpRatio" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutInsuranceIssCommitmentInsuranceValue" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutInsuranceIssCommitmentIssuanceNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutInsuranceIssCommitmentIssueDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutInsuranceIssCommitmentIssueType" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutInsuranceIssCommitmentLastUpdateDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutInsuranceIssCommitmentLoanAccUntermRa" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutInsuranceIssCommitmentLoanInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutInsuranceIssCommitmentMainTpSoId" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OutInsuranceIssCommitmentMaxNumberAttempts" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutInsuranceIssCommitmentNumberOfAttempts" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutInsuranceIssCommitmentOnceOnlyCharge" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutInsuranceIssCommitmentOtherOutstBal" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutInsuranceIssCommitmentPEntryStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutInsuranceIssCommitmentPayableAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutInsuranceIssCommitmentRenewalDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutInsuranceIssCommitmentReqCount" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutInsuranceIssCommitmentSaleUser" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutInsuranceIssCommitmentSecondaryCustId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutInsuranceIssCommitmentServiceProduct" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutInsuranceIssCommitmentThirdCustId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutInsuranceIssCommitmentTpSoIdentifier" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OutInsuranceIssCommitmentTransactSm" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutInsuranceIssCommitmentValuePayRate" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutInsuranceIssCommitmentTmstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutInsuranceProfitsAccountAccountCd" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutInsuranceProfitsAccountAccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutIssCommitmentAppApprDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutIssCommitmentAppApprUser" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutIssCommitmentAppDocId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutIssCommitmentAppEntryStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutIssCommitmentAppIdAppr" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutIssCommitmentAppTpSoIdentifier" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OutIssPremiumCalcAddInstalmAmnt" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutIssPremiumCalcAnnualPremium" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutIssPremiumCalcDailyPremium" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutIssPremiumCalcLoadingAmnt" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutIssPremiumCalcMonthlyPremium" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutIssPremiumCalcProrataPremium" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutIssPremiumCalcRemainingAmnt" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutIssProdDocIssProdDocDescr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutIssProdDocIssProdDocId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutIssProdDocIssProdDocProduct" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutIssuProdCustDefaultInd" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutIssuProdDetSrcFieldName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutIssuProdDetSrcId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutIssuanceCreditCardFlg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutIssuanceFixAmnPay" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutIssuanceGradAppOnceConfirm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutIssuanceGradAppOnceExpense" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutIssuanceInvoiceProduct" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutIssuanceLoanAccUntermRate" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutIssuanceLoanExistence" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutIssuanceMaxAttempts" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutIssuanceMaxRetries" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutIssuanceProdType" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutIssuanceValuePayRate" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutLoanProfitsAccountAccountCd" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutLoanProfitsAccountAccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutLoanProfitsAccountLnsOpenUnit" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutLoanProfitsAccountLnsSn" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutLoanProfitsAccountLnsType" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutPackageIdPackage" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutPackagePackageDescr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutPersonProfitsAccountAccountCd" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutPersonProfitsAccountAccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutResponsibleUnitUnitCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutResponsibleUnitUnitUnitName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutRmUsrBankemployeeLastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSaleBankemployeeFirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSaleBankemployeeLastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutServiceProductProductDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSogecapCounterIssCommitmentTpSoIdentifier" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OutStatusIefSuppliedActionEntryDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutStatusIefSuppliedActionEntryMsg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutTheftCatGenericDetailDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutUpdateUsrBankemployeeLastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCoinsuredGrp" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}ArrayOfOutCoinsuredGrpOutCoinsuredGrmIssCommitmentCoinsItem" minOccurs="0"/>
 *         &lt;element name="OutFailureDetailsKeyval1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutFailureDetailsKeyval2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutFailureDetailsKeyval3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutFailureDetailsComment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutInsuranceValueCurrencyIdCurrency" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutInsuranceValueCurrencyShortDescr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutInsuranceIssCommitmentCalculationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "T2151VInsuranceCommitmentMaintenanceExport", propOrder = {
    "locCreateDamageIssDamageDtlDamageAmnt",
    "locCreateDamageIssDamageDtlReplaced",
    "locCreateDamageIssDamageDtlTpSoIdentifier",
    "locCreateDamageIssDamageDtlTypeCode",
    "locCreateDamageIssDamageDtlYear",
    "outCanamParmsFilename",
    "outCancelUsrBankemployeeLastName",
    "outCrAccountDepositAccountAccountNumber",
    "outCrAccountDepositAccountCDigit",
    "outCrCustAccCurencyCurrencyIdCurrency",
    "outCrCustAccCurencyCurrencyShortDescr",
    "outCrCustomerCDigit",
    "outCrCustomerCustId",
    "outCrCustomerDepositAccountCDigit",
    "outCrCustomerDepositAccountDesignation",
    "outCrCustomerListSetDescription",
    "outCusCatGenericDetailDescription",
    "outCustomer2DepositAccountCDigit",
    "outCustomer2DepositAccountDesignation",
    "outCustomer3DepositAccountCDigit",
    "outCustomer3DepositAccountDesignation",
    "outCustomerCategoryGenericDetailDescription",
    "outDrAfmOtherAfmAfmNo",
    "outDrCustAccCurrencyCurrencyIdCurrency",
    "outDrCustAccCurrencyCurrencyShortDescr",
    "outDrCustAddressCustAddressAddress1",
    "outDrCustAddressCustAddressAddress2",
    "outDrCustAddressCustAddressCity",
    "outDrCustAddressCustAddressTelephone",
    "outDrCustAddressCustAddressZipCode",
    "outDrCustomerAccountDepositAccountAccountNumber",
    "outDrCustomerAccountDepositAccountCDigit",
    "outDrCustomerAccountDepositAccountDesignation",
    "outDrCustomerCounrtyGenericDetailDescription",
    "outDrCustomerCustomerCDigit",
    "outDrCustomerCustomerCustId",
    "outDrCustomerCustomerDateOfBirth",
    "outDrCustomerCustomerMobileTel",
    "outDrCustomerCustomerSurname",
    "outDrCustomerCustomerTelephone1",
    "outDrCustomerTaxTaxOfficeTaxOfficeName",
    "outDrCustomerCustomerCustType",
    "outGrpDamage",
    "outGrpHousingTheft",
    "outGrpIssComApp",
    "outHouseRoofGenericDetailDescription",
    "outHouseSkeletonGenericDetailDescription",
    "outHouseTypeGenericDetailDescription",
    "outHouseWaleGenericDetailDescription",
    "outHousingDetailsAddress1",
    "outHousingDetailsAddress2",
    "outHousingDetailsCity",
    "outHousingDetailsFloor",
    "outHousingDetailsHouseType",
    "outHousingDetailsHouseUse",
    "outHousingDetailsNoFloors",
    "outHousingDetailsPartailComments",
    "outHousingDetailsPartial",
    "outHousingDetailsRoof",
    "outHousingDetailsSkeleton",
    "outHousingDetailsSquare",
    "outHousingDetailsUseBasement",
    "outHousingDetailsUseFloor",
    "outHousingDetailsUseGroundFloor",
    "outHousingDetailsWale",
    "outHousingDetailsZipCode",
    "outHousingDetailsIssHousingDetailsAddress1",
    "outHousingDetailsIssHousingDetailsAddress2",
    "outHousingDetailsIssHousingDetailsBlockAmount",
    "outHousingDetailsIssHousingDetailsBlockAmount2",
    "outHousingDetailsIssHousingDetailsBlockAmount3",
    "outHousingDetailsIssHousingDetailsCancelledContr",
    "outHousingDetailsIssHousingDetailsCity",
    "outHousingDetailsIssHousingDetailsConstrDate",
    "outHousingDetailsIssHousingDetailsContrComments",
    "outHousingDetailsIssHousingDetailsDamageInd",
    "outHousingDetailsIssHousingDetailsEarthquakeCode",
    "outHousingDetailsIssHousingDetailsFloor",
    "outHousingDetailsIssHousingDetailsHouseType",
    "outHousingDetailsIssHousingDetailsHouseUse",
    "outHousingDetailsIssHousingDetailsHsIssuanceAmount",
    "outHousingDetailsIssHousingDetailsHsIssuanceCapital",
    "outHousingDetailsIssHousingDetailsLnsAccCd2",
    "outHousingDetailsIssHousingDetailsLnsAccCd3",
    "outHousingDetailsIssHousingDetailsLnsAccSn2",
    "outHousingDetailsIssHousingDetailsLnsAccSn3",
    "outHousingDetailsIssHousingDetailsLnsAccType2",
    "outHousingDetailsIssHousingDetailsLnsAccType3",
    "outHousingDetailsIssHousingDetailsLnsAccUnit2",
    "outHousingDetailsIssHousingDetailsLnsAccUnit3",
    "outHousingDetailsIssHousingDetailsLoanAmount",
    "outHousingDetailsIssHousingDetailsLoanAmount2",
    "outHousingDetailsIssHousingDetailsLoanAmount3",
    "outHousingDetailsIssHousingDetailsLoanExpDt",
    "outHousingDetailsIssHousingDetailsLoanExpDt2",
    "outHousingDetailsIssHousingDetailsLoanExpDt3",
    "outHousingDetailsIssHousingDetailsNoFloors",
    "outHousingDetailsIssHousingDetailsOtherCustComment",
    "outHousingDetailsIssHousingDetailsOtherCustInd",
    "outHousingDetailsIssHousingDetailsPartial",
    "outHousingDetailsIssHousingDetailsPartialComments",
    "outHousingDetailsIssHousingDetailsRoof",
    "outHousingDetailsIssHousingDetailsSkeleton",
    "outHousingDetailsIssHousingDetailsSquere",
    "outHousingDetailsIssHousingDetailsTpSoIdentifier",
    "outHousingDetailsIssHousingDetailsUseBasement",
    "outHousingDetailsIssHousingDetailsUseFloor",
    "outHousingDetailsIssHousingDetailsUseGround",
    "outHousingDetailsIssHousingDetailsWale",
    "outHousingDetailsIssHousingDetailsZipCode",
    "outHoustypCatGenericDetailDescription",
    "outHsdamCatGenericDetailDescription",
    "outHsqukCatGenericDetailDescription",
    "outInsuranceIssCommitmentActivationDate",
    "outInsuranceIssCommitmentCancelationDate",
    "outInsuranceIssCommitmentChargeAmnPerPay",
    "outInsuranceIssCommitmentChargeMethod",
    "outInsuranceIssCommitmentComments1",
    "outInsuranceIssCommitmentComments2",
    "outInsuranceIssCommitmentCoverRatio",
    "outInsuranceIssCommitmentCrAccCustomerId",
    "outInsuranceIssCommitmentCrDepAccount",
    "outInsuranceIssCommitmentCreditCardNo",
    "outInsuranceIssCommitmentDrAccCustomerId",
    "outInsuranceIssCommitmentEntryStatus",
    "outInsuranceIssCommitmentExpirationDate",
    "outInsuranceIssCommitmentFinalizeDate",
    "outInsuranceIssCommitmentFixAmnPay",
    "outInsuranceIssCommitmentFkAccCd",
    "outInsuranceIssCommitmentFkAccSn",
    "outInsuranceIssCommitmentFkAccType",
    "outInsuranceIssCommitmentFkAccUnit",
    "outInsuranceIssCommitmentFkCategory",
    "outInsuranceIssCommitmentFkCnlUsr",
    "outInsuranceIssCommitmentFkDebitAccount",
    "outInsuranceIssCommitmentFkFinalizeUsr",
    "outInsuranceIssCommitmentFkGenDetSerNum",
    "outInsuranceIssCommitmentFkGenericHeadpar",
    "outInsuranceIssCommitmentFkResponsibleUnit",
    "outInsuranceIssCommitmentFkUpdUsr",
    "outInsuranceIssCommitmentFrequency",
    "outInsuranceIssCommitmentFrequencyUnit",
    "outInsuranceIssCommitmentGradAppExpRatio",
    "outInsuranceIssCommitmentInsuranceValue",
    "outInsuranceIssCommitmentIssuanceNumber",
    "outInsuranceIssCommitmentIssueDate",
    "outInsuranceIssCommitmentIssueType",
    "outInsuranceIssCommitmentLastUpdateDate",
    "outInsuranceIssCommitmentLoanAccUntermRa",
    "outInsuranceIssCommitmentLoanInd",
    "outInsuranceIssCommitmentMainTpSoId",
    "outInsuranceIssCommitmentMaxNumberAttempts",
    "outInsuranceIssCommitmentNumberOfAttempts",
    "outInsuranceIssCommitmentOnceOnlyCharge",
    "outInsuranceIssCommitmentOtherOutstBal",
    "outInsuranceIssCommitmentPEntryStatus",
    "outInsuranceIssCommitmentPayableAmount",
    "outInsuranceIssCommitmentRenewalDate",
    "outInsuranceIssCommitmentReqCount",
    "outInsuranceIssCommitmentSaleUser",
    "outInsuranceIssCommitmentSecondaryCustId",
    "outInsuranceIssCommitmentServiceProduct",
    "outInsuranceIssCommitmentThirdCustId",
    "outInsuranceIssCommitmentTpSoIdentifier",
    "outInsuranceIssCommitmentTransactSm",
    "outInsuranceIssCommitmentValuePayRate",
    "outInsuranceIssCommitmentTmstamp",
    "outInsuranceProfitsAccountAccountCd",
    "outInsuranceProfitsAccountAccountNumber",
    "outIssCommitmentAppApprDate",
    "outIssCommitmentAppApprUser",
    "outIssCommitmentAppDocId",
    "outIssCommitmentAppEntryStatus",
    "outIssCommitmentAppIdAppr",
    "outIssCommitmentAppTpSoIdentifier",
    "outIssPremiumCalcAddInstalmAmnt",
    "outIssPremiumCalcAnnualPremium",
    "outIssPremiumCalcDailyPremium",
    "outIssPremiumCalcLoadingAmnt",
    "outIssPremiumCalcMonthlyPremium",
    "outIssPremiumCalcProrataPremium",
    "outIssPremiumCalcRemainingAmnt",
    "outIssProdDocIssProdDocDescr",
    "outIssProdDocIssProdDocId",
    "outIssProdDocIssProdDocProduct",
    "outIssuProdCustDefaultInd",
    "outIssuProdDetSrcFieldName",
    "outIssuProdDetSrcId",
    "outIssuanceCreditCardFlg",
    "outIssuanceFixAmnPay",
    "outIssuanceGradAppOnceConfirm",
    "outIssuanceGradAppOnceExpense",
    "outIssuanceInvoiceProduct",
    "outIssuanceLoanAccUntermRate",
    "outIssuanceLoanExistence",
    "outIssuanceMaxAttempts",
    "outIssuanceMaxRetries",
    "outIssuanceProdType",
    "outIssuanceValuePayRate",
    "outLoanProfitsAccountAccountCd",
    "outLoanProfitsAccountAccountNumber",
    "outLoanProfitsAccountLnsOpenUnit",
    "outLoanProfitsAccountLnsSn",
    "outLoanProfitsAccountLnsType",
    "outPackageIdPackage",
    "outPackagePackageDescr",
    "outPersonProfitsAccountAccountCd",
    "outPersonProfitsAccountAccountNumber",
    "outResponsibleUnitUnitCode",
    "outResponsibleUnitUnitUnitName",
    "outRmUsrBankemployeeLastName",
    "outSaleBankemployeeFirstName",
    "outSaleBankemployeeLastName",
    "outServiceProductProductDescription",
    "outSogecapCounterIssCommitmentTpSoIdentifier",
    "outStatusIefSuppliedActionEntryDesc",
    "outStatusIefSuppliedActionEntryMsg",
    "outTheftCatGenericDetailDescription",
    "outUpdateUsrBankemployeeLastName",
    "outCoinsuredGrp",
    "outFailureDetailsKeyval1",
    "outFailureDetailsKeyval2",
    "outFailureDetailsKeyval3",
    "outFailureDetailsComment",
    "outInsuranceValueCurrencyIdCurrency",
    "outInsuranceValueCurrencyShortDescr",
    "outInsuranceIssCommitmentCalculationDate"
})
public class T2151VInsuranceCommitmentMaintenanceExport
    extends BaseExport
{

    @XmlElement(name = "LocCreateDamageIssDamageDtlDamageAmnt", required = true)
    protected BigDecimal locCreateDamageIssDamageDtlDamageAmnt;
    @XmlElement(name = "LocCreateDamageIssDamageDtlReplaced")
    protected String locCreateDamageIssDamageDtlReplaced;
    @XmlElement(name = "LocCreateDamageIssDamageDtlTpSoIdentifier")
    protected double locCreateDamageIssDamageDtlTpSoIdentifier;
    @XmlElement(name = "LocCreateDamageIssDamageDtlTypeCode")
    protected int locCreateDamageIssDamageDtlTypeCode;
    @XmlElement(name = "LocCreateDamageIssDamageDtlYear")
    protected short locCreateDamageIssDamageDtlYear;
    @XmlElement(name = "OutCanamParmsFilename")
    protected String outCanamParmsFilename;
    @XmlElement(name = "OutCancelUsrBankemployeeLastName")
    protected String outCancelUsrBankemployeeLastName;
    @XmlElement(name = "OutCrAccountDepositAccountAccountNumber")
    protected double outCrAccountDepositAccountAccountNumber;
    @XmlElement(name = "OutCrAccountDepositAccountCDigit")
    protected short outCrAccountDepositAccountCDigit;
    @XmlElement(name = "OutCrCustAccCurencyCurrencyIdCurrency")
    protected int outCrCustAccCurencyCurrencyIdCurrency;
    @XmlElement(name = "OutCrCustAccCurencyCurrencyShortDescr")
    protected String outCrCustAccCurencyCurrencyShortDescr;
    @XmlElement(name = "OutCrCustomerCDigit")
    protected short outCrCustomerCDigit;
    @XmlElement(name = "OutCrCustomerCustId")
    protected int outCrCustomerCustId;
    @XmlElement(name = "OutCrCustomerDepositAccountCDigit")
    protected short outCrCustomerDepositAccountCDigit;
    @XmlElement(name = "OutCrCustomerDepositAccountDesignation")
    protected String outCrCustomerDepositAccountDesignation;
    @XmlElement(name = "OutCrCustomerListSetDescription")
    protected String outCrCustomerListSetDescription;
    @XmlElement(name = "OutCusCatGenericDetailDescription")
    protected String outCusCatGenericDetailDescription;
    @XmlElement(name = "OutCustomer2DepositAccountCDigit")
    protected short outCustomer2DepositAccountCDigit;
    @XmlElement(name = "OutCustomer2DepositAccountDesignation")
    protected String outCustomer2DepositAccountDesignation;
    @XmlElement(name = "OutCustomer3DepositAccountCDigit")
    protected short outCustomer3DepositAccountCDigit;
    @XmlElement(name = "OutCustomer3DepositAccountDesignation")
    protected String outCustomer3DepositAccountDesignation;
    @XmlElement(name = "OutCustomerCategoryGenericDetailDescription")
    protected String outCustomerCategoryGenericDetailDescription;
    @XmlElement(name = "OutDrAfmOtherAfmAfmNo")
    protected String outDrAfmOtherAfmAfmNo;
    @XmlElement(name = "OutDrCustAccCurrencyCurrencyIdCurrency")
    protected int outDrCustAccCurrencyCurrencyIdCurrency;
    @XmlElement(name = "OutDrCustAccCurrencyCurrencyShortDescr")
    protected String outDrCustAccCurrencyCurrencyShortDescr;
    @XmlElement(name = "OutDrCustAddressCustAddressAddress1")
    protected String outDrCustAddressCustAddressAddress1;
    @XmlElement(name = "OutDrCustAddressCustAddressAddress2")
    protected String outDrCustAddressCustAddressAddress2;
    @XmlElement(name = "OutDrCustAddressCustAddressCity")
    protected String outDrCustAddressCustAddressCity;
    @XmlElement(name = "OutDrCustAddressCustAddressTelephone")
    protected String outDrCustAddressCustAddressTelephone;
    @XmlElement(name = "OutDrCustAddressCustAddressZipCode")
    protected String outDrCustAddressCustAddressZipCode;
    @XmlElement(name = "OutDrCustomerAccountDepositAccountAccountNumber")
    protected double outDrCustomerAccountDepositAccountAccountNumber;
    @XmlElement(name = "OutDrCustomerAccountDepositAccountCDigit")
    protected short outDrCustomerAccountDepositAccountCDigit;
    @XmlElement(name = "OutDrCustomerAccountDepositAccountDesignation")
    protected String outDrCustomerAccountDepositAccountDesignation;
    @XmlElement(name = "OutDrCustomerCounrtyGenericDetailDescription")
    protected String outDrCustomerCounrtyGenericDetailDescription;
    @XmlElement(name = "OutDrCustomerCustomerCDigit")
    protected short outDrCustomerCustomerCDigit;
    @XmlElement(name = "OutDrCustomerCustomerCustId")
    protected int outDrCustomerCustomerCustId;
    @XmlElement(name = "OutDrCustomerCustomerDateOfBirth", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outDrCustomerCustomerDateOfBirth;
    @XmlElement(name = "OutDrCustomerCustomerMobileTel")
    protected String outDrCustomerCustomerMobileTel;
    @XmlElement(name = "OutDrCustomerCustomerSurname")
    protected String outDrCustomerCustomerSurname;
    @XmlElement(name = "OutDrCustomerCustomerTelephone1")
    protected String outDrCustomerCustomerTelephone1;
    @XmlElement(name = "OutDrCustomerTaxTaxOfficeTaxOfficeName")
    protected String outDrCustomerTaxTaxOfficeTaxOfficeName;
    @XmlElement(name = "OutDrCustomerCustomerCustType")
    protected String outDrCustomerCustomerCustType;
    @XmlElement(name = "OutGrpDamage")
    protected ArrayOfOutGrpDamageItem outGrpDamage;
    @XmlElement(name = "OutGrpHousingTheft")
    protected ArrayOfOutGrpHousingTheftItem outGrpHousingTheft;
    @XmlElement(name = "OutGrpIssComApp")
    protected ArrayOfOutGrpIssComAppItem outGrpIssComApp;
    @XmlElement(name = "OutHouseRoofGenericDetailDescription")
    protected String outHouseRoofGenericDetailDescription;
    @XmlElement(name = "OutHouseSkeletonGenericDetailDescription")
    protected String outHouseSkeletonGenericDetailDescription;
    @XmlElement(name = "OutHouseTypeGenericDetailDescription")
    protected String outHouseTypeGenericDetailDescription;
    @XmlElement(name = "OutHouseWaleGenericDetailDescription")
    protected String outHouseWaleGenericDetailDescription;
    @XmlElement(name = "OutHousingDetailsAddress1")
    protected String outHousingDetailsAddress1;
    @XmlElement(name = "OutHousingDetailsAddress2")
    protected String outHousingDetailsAddress2;
    @XmlElement(name = "OutHousingDetailsCity")
    protected String outHousingDetailsCity;
    @XmlElement(name = "OutHousingDetailsFloor")
    protected short outHousingDetailsFloor;
    @XmlElement(name = "OutHousingDetailsHouseType")
    protected int outHousingDetailsHouseType;
    @XmlElement(name = "OutHousingDetailsHouseUse")
    protected String outHousingDetailsHouseUse;
    @XmlElement(name = "OutHousingDetailsNoFloors")
    protected short outHousingDetailsNoFloors;
    @XmlElement(name = "OutHousingDetailsPartailComments")
    protected String outHousingDetailsPartailComments;
    @XmlElement(name = "OutHousingDetailsPartial")
    protected String outHousingDetailsPartial;
    @XmlElement(name = "OutHousingDetailsRoof")
    protected int outHousingDetailsRoof;
    @XmlElement(name = "OutHousingDetailsSkeleton")
    protected int outHousingDetailsSkeleton;
    @XmlElement(name = "OutHousingDetailsSquare")
    protected short outHousingDetailsSquare;
    @XmlElement(name = "OutHousingDetailsUseBasement")
    protected String outHousingDetailsUseBasement;
    @XmlElement(name = "OutHousingDetailsUseFloor")
    protected String outHousingDetailsUseFloor;
    @XmlElement(name = "OutHousingDetailsUseGroundFloor")
    protected String outHousingDetailsUseGroundFloor;
    @XmlElement(name = "OutHousingDetailsWale")
    protected int outHousingDetailsWale;
    @XmlElement(name = "OutHousingDetailsZipCode")
    protected String outHousingDetailsZipCode;
    @XmlElement(name = "OutHousingDetailsIssHousingDetailsAddress1")
    protected String outHousingDetailsIssHousingDetailsAddress1;
    @XmlElement(name = "OutHousingDetailsIssHousingDetailsAddress2")
    protected String outHousingDetailsIssHousingDetailsAddress2;
    @XmlElement(name = "OutHousingDetailsIssHousingDetailsBlockAmount", required = true)
    protected BigDecimal outHousingDetailsIssHousingDetailsBlockAmount;
    @XmlElement(name = "OutHousingDetailsIssHousingDetailsBlockAmount2", required = true)
    protected BigDecimal outHousingDetailsIssHousingDetailsBlockAmount2;
    @XmlElement(name = "OutHousingDetailsIssHousingDetailsBlockAmount3", required = true)
    protected BigDecimal outHousingDetailsIssHousingDetailsBlockAmount3;
    @XmlElement(name = "OutHousingDetailsIssHousingDetailsCancelledContr")
    protected String outHousingDetailsIssHousingDetailsCancelledContr;
    @XmlElement(name = "OutHousingDetailsIssHousingDetailsCity")
    protected String outHousingDetailsIssHousingDetailsCity;
    @XmlElement(name = "OutHousingDetailsIssHousingDetailsConstrDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outHousingDetailsIssHousingDetailsConstrDate;
    @XmlElement(name = "OutHousingDetailsIssHousingDetailsContrComments")
    protected String outHousingDetailsIssHousingDetailsContrComments;
    @XmlElement(name = "OutHousingDetailsIssHousingDetailsDamageInd")
    protected String outHousingDetailsIssHousingDetailsDamageInd;
    @XmlElement(name = "OutHousingDetailsIssHousingDetailsEarthquakeCode")
    protected int outHousingDetailsIssHousingDetailsEarthquakeCode;
    @XmlElement(name = "OutHousingDetailsIssHousingDetailsFloor")
    protected short outHousingDetailsIssHousingDetailsFloor;
    @XmlElement(name = "OutHousingDetailsIssHousingDetailsHouseType")
    protected int outHousingDetailsIssHousingDetailsHouseType;
    @XmlElement(name = "OutHousingDetailsIssHousingDetailsHouseUse")
    protected String outHousingDetailsIssHousingDetailsHouseUse;
    @XmlElement(name = "OutHousingDetailsIssHousingDetailsHsIssuanceAmount", required = true)
    protected BigDecimal outHousingDetailsIssHousingDetailsHsIssuanceAmount;
    @XmlElement(name = "OutHousingDetailsIssHousingDetailsHsIssuanceCapital", required = true)
    protected BigDecimal outHousingDetailsIssHousingDetailsHsIssuanceCapital;
    @XmlElement(name = "OutHousingDetailsIssHousingDetailsLnsAccCd2")
    protected short outHousingDetailsIssHousingDetailsLnsAccCd2;
    @XmlElement(name = "OutHousingDetailsIssHousingDetailsLnsAccCd3")
    protected short outHousingDetailsIssHousingDetailsLnsAccCd3;
    @XmlElement(name = "OutHousingDetailsIssHousingDetailsLnsAccSn2")
    protected int outHousingDetailsIssHousingDetailsLnsAccSn2;
    @XmlElement(name = "OutHousingDetailsIssHousingDetailsLnsAccSn3")
    protected int outHousingDetailsIssHousingDetailsLnsAccSn3;
    @XmlElement(name = "OutHousingDetailsIssHousingDetailsLnsAccType2")
    protected short outHousingDetailsIssHousingDetailsLnsAccType2;
    @XmlElement(name = "OutHousingDetailsIssHousingDetailsLnsAccType3")
    protected short outHousingDetailsIssHousingDetailsLnsAccType3;
    @XmlElement(name = "OutHousingDetailsIssHousingDetailsLnsAccUnit2")
    protected int outHousingDetailsIssHousingDetailsLnsAccUnit2;
    @XmlElement(name = "OutHousingDetailsIssHousingDetailsLnsAccUnit3")
    protected int outHousingDetailsIssHousingDetailsLnsAccUnit3;
    @XmlElement(name = "OutHousingDetailsIssHousingDetailsLoanAmount", required = true)
    protected BigDecimal outHousingDetailsIssHousingDetailsLoanAmount;
    @XmlElement(name = "OutHousingDetailsIssHousingDetailsLoanAmount2", required = true)
    protected BigDecimal outHousingDetailsIssHousingDetailsLoanAmount2;
    @XmlElement(name = "OutHousingDetailsIssHousingDetailsLoanAmount3", required = true)
    protected BigDecimal outHousingDetailsIssHousingDetailsLoanAmount3;
    @XmlElement(name = "OutHousingDetailsIssHousingDetailsLoanExpDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outHousingDetailsIssHousingDetailsLoanExpDt;
    @XmlElement(name = "OutHousingDetailsIssHousingDetailsLoanExpDt2", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outHousingDetailsIssHousingDetailsLoanExpDt2;
    @XmlElement(name = "OutHousingDetailsIssHousingDetailsLoanExpDt3", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outHousingDetailsIssHousingDetailsLoanExpDt3;
    @XmlElement(name = "OutHousingDetailsIssHousingDetailsNoFloors")
    protected short outHousingDetailsIssHousingDetailsNoFloors;
    @XmlElement(name = "OutHousingDetailsIssHousingDetailsOtherCustComment")
    protected String outHousingDetailsIssHousingDetailsOtherCustComment;
    @XmlElement(name = "OutHousingDetailsIssHousingDetailsOtherCustInd")
    protected String outHousingDetailsIssHousingDetailsOtherCustInd;
    @XmlElement(name = "OutHousingDetailsIssHousingDetailsPartial")
    protected String outHousingDetailsIssHousingDetailsPartial;
    @XmlElement(name = "OutHousingDetailsIssHousingDetailsPartialComments")
    protected String outHousingDetailsIssHousingDetailsPartialComments;
    @XmlElement(name = "OutHousingDetailsIssHousingDetailsRoof")
    protected int outHousingDetailsIssHousingDetailsRoof;
    @XmlElement(name = "OutHousingDetailsIssHousingDetailsSkeleton")
    protected int outHousingDetailsIssHousingDetailsSkeleton;
    @XmlElement(name = "OutHousingDetailsIssHousingDetailsSquere")
    protected short outHousingDetailsIssHousingDetailsSquere;
    @XmlElement(name = "OutHousingDetailsIssHousingDetailsTpSoIdentifier")
    protected double outHousingDetailsIssHousingDetailsTpSoIdentifier;
    @XmlElement(name = "OutHousingDetailsIssHousingDetailsUseBasement")
    protected String outHousingDetailsIssHousingDetailsUseBasement;
    @XmlElement(name = "OutHousingDetailsIssHousingDetailsUseFloor")
    protected String outHousingDetailsIssHousingDetailsUseFloor;
    @XmlElement(name = "OutHousingDetailsIssHousingDetailsUseGround")
    protected String outHousingDetailsIssHousingDetailsUseGround;
    @XmlElement(name = "OutHousingDetailsIssHousingDetailsWale")
    protected int outHousingDetailsIssHousingDetailsWale;
    @XmlElement(name = "OutHousingDetailsIssHousingDetailsZipCode")
    protected String outHousingDetailsIssHousingDetailsZipCode;
    @XmlElement(name = "OutHoustypCatGenericDetailDescription")
    protected String outHoustypCatGenericDetailDescription;
    @XmlElement(name = "OutHsdamCatGenericDetailDescription")
    protected String outHsdamCatGenericDetailDescription;
    @XmlElement(name = "OutHsqukCatGenericDetailDescription")
    protected String outHsqukCatGenericDetailDescription;
    @XmlElement(name = "OutInsuranceIssCommitmentActivationDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outInsuranceIssCommitmentActivationDate;
    @XmlElement(name = "OutInsuranceIssCommitmentCancelationDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outInsuranceIssCommitmentCancelationDate;
    @XmlElement(name = "OutInsuranceIssCommitmentChargeAmnPerPay", required = true)
    protected BigDecimal outInsuranceIssCommitmentChargeAmnPerPay;
    @XmlElement(name = "OutInsuranceIssCommitmentChargeMethod")
    protected String outInsuranceIssCommitmentChargeMethod;
    @XmlElement(name = "OutInsuranceIssCommitmentComments1")
    protected String outInsuranceIssCommitmentComments1;
    @XmlElement(name = "OutInsuranceIssCommitmentComments2")
    protected String outInsuranceIssCommitmentComments2;
    @XmlElement(name = "OutInsuranceIssCommitmentCoverRatio", required = true)
    protected BigDecimal outInsuranceIssCommitmentCoverRatio;
    @XmlElement(name = "OutInsuranceIssCommitmentCrAccCustomerId")
    protected int outInsuranceIssCommitmentCrAccCustomerId;
    @XmlElement(name = "OutInsuranceIssCommitmentCrDepAccount")
    protected double outInsuranceIssCommitmentCrDepAccount;
    @XmlElement(name = "OutInsuranceIssCommitmentCreditCardNo")
    protected String outInsuranceIssCommitmentCreditCardNo;
    @XmlElement(name = "OutInsuranceIssCommitmentDrAccCustomerId")
    protected int outInsuranceIssCommitmentDrAccCustomerId;
    @XmlElement(name = "OutInsuranceIssCommitmentEntryStatus")
    protected String outInsuranceIssCommitmentEntryStatus;
    @XmlElement(name = "OutInsuranceIssCommitmentExpirationDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outInsuranceIssCommitmentExpirationDate;
    @XmlElement(name = "OutInsuranceIssCommitmentFinalizeDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outInsuranceIssCommitmentFinalizeDate;
    @XmlElement(name = "OutInsuranceIssCommitmentFixAmnPay", required = true)
    protected BigDecimal outInsuranceIssCommitmentFixAmnPay;
    @XmlElement(name = "OutInsuranceIssCommitmentFkAccCd")
    protected short outInsuranceIssCommitmentFkAccCd;
    @XmlElement(name = "OutInsuranceIssCommitmentFkAccSn")
    protected int outInsuranceIssCommitmentFkAccSn;
    @XmlElement(name = "OutInsuranceIssCommitmentFkAccType")
    protected short outInsuranceIssCommitmentFkAccType;
    @XmlElement(name = "OutInsuranceIssCommitmentFkAccUnit")
    protected int outInsuranceIssCommitmentFkAccUnit;
    @XmlElement(name = "OutInsuranceIssCommitmentFkCategory")
    protected int outInsuranceIssCommitmentFkCategory;
    @XmlElement(name = "OutInsuranceIssCommitmentFkCnlUsr")
    protected String outInsuranceIssCommitmentFkCnlUsr;
    @XmlElement(name = "OutInsuranceIssCommitmentFkDebitAccount")
    protected double outInsuranceIssCommitmentFkDebitAccount;
    @XmlElement(name = "OutInsuranceIssCommitmentFkFinalizeUsr")
    protected String outInsuranceIssCommitmentFkFinalizeUsr;
    @XmlElement(name = "OutInsuranceIssCommitmentFkGenDetSerNum")
    protected int outInsuranceIssCommitmentFkGenDetSerNum;
    @XmlElement(name = "OutInsuranceIssCommitmentFkGenericHeadpar")
    protected String outInsuranceIssCommitmentFkGenericHeadpar;
    @XmlElement(name = "OutInsuranceIssCommitmentFkResponsibleUnit")
    protected int outInsuranceIssCommitmentFkResponsibleUnit;
    @XmlElement(name = "OutInsuranceIssCommitmentFkUpdUsr")
    protected String outInsuranceIssCommitmentFkUpdUsr;
    @XmlElement(name = "OutInsuranceIssCommitmentFrequency")
    protected short outInsuranceIssCommitmentFrequency;
    @XmlElement(name = "OutInsuranceIssCommitmentFrequencyUnit")
    protected String outInsuranceIssCommitmentFrequencyUnit;
    @XmlElement(name = "OutInsuranceIssCommitmentGradAppExpRatio", required = true)
    protected BigDecimal outInsuranceIssCommitmentGradAppExpRatio;
    @XmlElement(name = "OutInsuranceIssCommitmentInsuranceValue", required = true)
    protected BigDecimal outInsuranceIssCommitmentInsuranceValue;
    @XmlElement(name = "OutInsuranceIssCommitmentIssuanceNumber")
    protected String outInsuranceIssCommitmentIssuanceNumber;
    @XmlElement(name = "OutInsuranceIssCommitmentIssueDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outInsuranceIssCommitmentIssueDate;
    @XmlElement(name = "OutInsuranceIssCommitmentIssueType")
    protected short outInsuranceIssCommitmentIssueType;
    @XmlElement(name = "OutInsuranceIssCommitmentLastUpdateDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outInsuranceIssCommitmentLastUpdateDate;
    @XmlElement(name = "OutInsuranceIssCommitmentLoanAccUntermRa", required = true)
    protected BigDecimal outInsuranceIssCommitmentLoanAccUntermRa;
    @XmlElement(name = "OutInsuranceIssCommitmentLoanInd")
    protected String outInsuranceIssCommitmentLoanInd;
    @XmlElement(name = "OutInsuranceIssCommitmentMainTpSoId")
    protected double outInsuranceIssCommitmentMainTpSoId;
    @XmlElement(name = "OutInsuranceIssCommitmentMaxNumberAttempts")
    protected int outInsuranceIssCommitmentMaxNumberAttempts;
    @XmlElement(name = "OutInsuranceIssCommitmentNumberOfAttempts")
    protected short outInsuranceIssCommitmentNumberOfAttempts;
    @XmlElement(name = "OutInsuranceIssCommitmentOnceOnlyCharge", required = true)
    protected BigDecimal outInsuranceIssCommitmentOnceOnlyCharge;
    @XmlElement(name = "OutInsuranceIssCommitmentOtherOutstBal", required = true)
    protected BigDecimal outInsuranceIssCommitmentOtherOutstBal;
    @XmlElement(name = "OutInsuranceIssCommitmentPEntryStatus")
    protected String outInsuranceIssCommitmentPEntryStatus;
    @XmlElement(name = "OutInsuranceIssCommitmentPayableAmount", required = true)
    protected BigDecimal outInsuranceIssCommitmentPayableAmount;
    @XmlElement(name = "OutInsuranceIssCommitmentRenewalDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outInsuranceIssCommitmentRenewalDate;
    @XmlElement(name = "OutInsuranceIssCommitmentReqCount")
    protected short outInsuranceIssCommitmentReqCount;
    @XmlElement(name = "OutInsuranceIssCommitmentSaleUser")
    protected String outInsuranceIssCommitmentSaleUser;
    @XmlElement(name = "OutInsuranceIssCommitmentSecondaryCustId")
    protected int outInsuranceIssCommitmentSecondaryCustId;
    @XmlElement(name = "OutInsuranceIssCommitmentServiceProduct")
    protected int outInsuranceIssCommitmentServiceProduct;
    @XmlElement(name = "OutInsuranceIssCommitmentThirdCustId")
    protected int outInsuranceIssCommitmentThirdCustId;
    @XmlElement(name = "OutInsuranceIssCommitmentTpSoIdentifier")
    protected double outInsuranceIssCommitmentTpSoIdentifier;
    @XmlElement(name = "OutInsuranceIssCommitmentTransactSm")
    protected int outInsuranceIssCommitmentTransactSm;
    @XmlElement(name = "OutInsuranceIssCommitmentValuePayRate", required = true)
    protected BigDecimal outInsuranceIssCommitmentValuePayRate;
    @XmlElement(name = "OutInsuranceIssCommitmentTmstamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outInsuranceIssCommitmentTmstamp;
    @XmlElement(name = "OutInsuranceProfitsAccountAccountCd")
    protected short outInsuranceProfitsAccountAccountCd;
    @XmlElement(name = "OutInsuranceProfitsAccountAccountNumber")
    protected String outInsuranceProfitsAccountAccountNumber;
    @XmlElement(name = "OutIssCommitmentAppApprDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outIssCommitmentAppApprDate;
    @XmlElement(name = "OutIssCommitmentAppApprUser")
    protected String outIssCommitmentAppApprUser;
    @XmlElement(name = "OutIssCommitmentAppDocId")
    protected int outIssCommitmentAppDocId;
    @XmlElement(name = "OutIssCommitmentAppEntryStatus")
    protected String outIssCommitmentAppEntryStatus;
    @XmlElement(name = "OutIssCommitmentAppIdAppr")
    protected int outIssCommitmentAppIdAppr;
    @XmlElement(name = "OutIssCommitmentAppTpSoIdentifier")
    protected double outIssCommitmentAppTpSoIdentifier;
    @XmlElement(name = "OutIssPremiumCalcAddInstalmAmnt", required = true)
    protected BigDecimal outIssPremiumCalcAddInstalmAmnt;
    @XmlElement(name = "OutIssPremiumCalcAnnualPremium", required = true)
    protected BigDecimal outIssPremiumCalcAnnualPremium;
    @XmlElement(name = "OutIssPremiumCalcDailyPremium", required = true)
    protected BigDecimal outIssPremiumCalcDailyPremium;
    @XmlElement(name = "OutIssPremiumCalcLoadingAmnt", required = true)
    protected BigDecimal outIssPremiumCalcLoadingAmnt;
    @XmlElement(name = "OutIssPremiumCalcMonthlyPremium", required = true)
    protected BigDecimal outIssPremiumCalcMonthlyPremium;
    @XmlElement(name = "OutIssPremiumCalcProrataPremium", required = true)
    protected BigDecimal outIssPremiumCalcProrataPremium;
    @XmlElement(name = "OutIssPremiumCalcRemainingAmnt", required = true)
    protected BigDecimal outIssPremiumCalcRemainingAmnt;
    @XmlElement(name = "OutIssProdDocIssProdDocDescr")
    protected String outIssProdDocIssProdDocDescr;
    @XmlElement(name = "OutIssProdDocIssProdDocId")
    protected int outIssProdDocIssProdDocId;
    @XmlElement(name = "OutIssProdDocIssProdDocProduct")
    protected int outIssProdDocIssProdDocProduct;
    @XmlElement(name = "OutIssuProdCustDefaultInd")
    protected short outIssuProdCustDefaultInd;
    @XmlElement(name = "OutIssuProdDetSrcFieldName")
    protected String outIssuProdDetSrcFieldName;
    @XmlElement(name = "OutIssuProdDetSrcId")
    protected int outIssuProdDetSrcId;
    @XmlElement(name = "OutIssuanceCreditCardFlg")
    protected String outIssuanceCreditCardFlg;
    @XmlElement(name = "OutIssuanceFixAmnPay", required = true)
    protected BigDecimal outIssuanceFixAmnPay;
    @XmlElement(name = "OutIssuanceGradAppOnceConfirm")
    protected String outIssuanceGradAppOnceConfirm;
    @XmlElement(name = "OutIssuanceGradAppOnceExpense")
    protected String outIssuanceGradAppOnceExpense;
    @XmlElement(name = "OutIssuanceInvoiceProduct")
    protected String outIssuanceInvoiceProduct;
    @XmlElement(name = "OutIssuanceLoanAccUntermRate", required = true)
    protected BigDecimal outIssuanceLoanAccUntermRate;
    @XmlElement(name = "OutIssuanceLoanExistence")
    protected String outIssuanceLoanExistence;
    @XmlElement(name = "OutIssuanceMaxAttempts")
    protected int outIssuanceMaxAttempts;
    @XmlElement(name = "OutIssuanceMaxRetries")
    protected int outIssuanceMaxRetries;
    @XmlElement(name = "OutIssuanceProdType")
    protected short outIssuanceProdType;
    @XmlElement(name = "OutIssuanceValuePayRate", required = true)
    protected BigDecimal outIssuanceValuePayRate;
    @XmlElement(name = "OutLoanProfitsAccountAccountCd")
    protected short outLoanProfitsAccountAccountCd;
    @XmlElement(name = "OutLoanProfitsAccountAccountNumber")
    protected String outLoanProfitsAccountAccountNumber;
    @XmlElement(name = "OutLoanProfitsAccountLnsOpenUnit")
    protected int outLoanProfitsAccountLnsOpenUnit;
    @XmlElement(name = "OutLoanProfitsAccountLnsSn")
    protected int outLoanProfitsAccountLnsSn;
    @XmlElement(name = "OutLoanProfitsAccountLnsType")
    protected short outLoanProfitsAccountLnsType;
    @XmlElement(name = "OutPackageIdPackage")
    protected int outPackageIdPackage;
    @XmlElement(name = "OutPackagePackageDescr")
    protected String outPackagePackageDescr;
    @XmlElement(name = "OutPersonProfitsAccountAccountCd")
    protected short outPersonProfitsAccountAccountCd;
    @XmlElement(name = "OutPersonProfitsAccountAccountNumber")
    protected String outPersonProfitsAccountAccountNumber;
    @XmlElement(name = "OutResponsibleUnitUnitCode")
    protected int outResponsibleUnitUnitCode;
    @XmlElement(name = "OutResponsibleUnitUnitUnitName")
    protected String outResponsibleUnitUnitUnitName;
    @XmlElement(name = "OutRmUsrBankemployeeLastName")
    protected String outRmUsrBankemployeeLastName;
    @XmlElement(name = "OutSaleBankemployeeFirstName")
    protected String outSaleBankemployeeFirstName;
    @XmlElement(name = "OutSaleBankemployeeLastName")
    protected String outSaleBankemployeeLastName;
    @XmlElement(name = "OutServiceProductProductDescription")
    protected String outServiceProductProductDescription;
    @XmlElement(name = "OutSogecapCounterIssCommitmentTpSoIdentifier")
    protected double outSogecapCounterIssCommitmentTpSoIdentifier;
    @XmlElement(name = "OutStatusIefSuppliedActionEntryDesc")
    protected String outStatusIefSuppliedActionEntryDesc;
    @XmlElement(name = "OutStatusIefSuppliedActionEntryMsg")
    protected String outStatusIefSuppliedActionEntryMsg;
    @XmlElement(name = "OutTheftCatGenericDetailDescription")
    protected String outTheftCatGenericDetailDescription;
    @XmlElement(name = "OutUpdateUsrBankemployeeLastName")
    protected String outUpdateUsrBankemployeeLastName;
    @XmlElement(name = "OutCoinsuredGrp")
    protected ArrayOfOutCoinsuredGrpOutCoinsuredGrmIssCommitmentCoinsItem outCoinsuredGrp;
    @XmlElement(name = "OutFailureDetailsKeyval1")
    protected String outFailureDetailsKeyval1;
    @XmlElement(name = "OutFailureDetailsKeyval2")
    protected String outFailureDetailsKeyval2;
    @XmlElement(name = "OutFailureDetailsKeyval3")
    protected String outFailureDetailsKeyval3;
    @XmlElement(name = "OutFailureDetailsComment")
    protected String outFailureDetailsComment;
    @XmlElement(name = "OutInsuranceValueCurrencyIdCurrency")
    protected int outInsuranceValueCurrencyIdCurrency;
    @XmlElement(name = "OutInsuranceValueCurrencyShortDescr")
    protected String outInsuranceValueCurrencyShortDescr;
    @XmlElement(name = "OutInsuranceIssCommitmentCalculationDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outInsuranceIssCommitmentCalculationDate;

    /**
     * Gets the value of the locCreateDamageIssDamageDtlDamageAmnt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLocCreateDamageIssDamageDtlDamageAmnt() {
        return locCreateDamageIssDamageDtlDamageAmnt;
    }

    /**
     * Sets the value of the locCreateDamageIssDamageDtlDamageAmnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLocCreateDamageIssDamageDtlDamageAmnt(BigDecimal value) {
        this.locCreateDamageIssDamageDtlDamageAmnt = value;
    }

    /**
     * Gets the value of the locCreateDamageIssDamageDtlReplaced property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocCreateDamageIssDamageDtlReplaced() {
        return locCreateDamageIssDamageDtlReplaced;
    }

    /**
     * Sets the value of the locCreateDamageIssDamageDtlReplaced property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocCreateDamageIssDamageDtlReplaced(String value) {
        this.locCreateDamageIssDamageDtlReplaced = value;
    }

    /**
     * Gets the value of the locCreateDamageIssDamageDtlTpSoIdentifier property.
     * 
     */
    public double getLocCreateDamageIssDamageDtlTpSoIdentifier() {
        return locCreateDamageIssDamageDtlTpSoIdentifier;
    }

    /**
     * Sets the value of the locCreateDamageIssDamageDtlTpSoIdentifier property.
     * 
     */
    public void setLocCreateDamageIssDamageDtlTpSoIdentifier(double value) {
        this.locCreateDamageIssDamageDtlTpSoIdentifier = value;
    }

    /**
     * Gets the value of the locCreateDamageIssDamageDtlTypeCode property.
     * 
     */
    public int getLocCreateDamageIssDamageDtlTypeCode() {
        return locCreateDamageIssDamageDtlTypeCode;
    }

    /**
     * Sets the value of the locCreateDamageIssDamageDtlTypeCode property.
     * 
     */
    public void setLocCreateDamageIssDamageDtlTypeCode(int value) {
        this.locCreateDamageIssDamageDtlTypeCode = value;
    }

    /**
     * Gets the value of the locCreateDamageIssDamageDtlYear property.
     * 
     */
    public short getLocCreateDamageIssDamageDtlYear() {
        return locCreateDamageIssDamageDtlYear;
    }

    /**
     * Sets the value of the locCreateDamageIssDamageDtlYear property.
     * 
     */
    public void setLocCreateDamageIssDamageDtlYear(short value) {
        this.locCreateDamageIssDamageDtlYear = value;
    }

    /**
     * Gets the value of the outCanamParmsFilename property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCanamParmsFilename() {
        return outCanamParmsFilename;
    }

    /**
     * Sets the value of the outCanamParmsFilename property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCanamParmsFilename(String value) {
        this.outCanamParmsFilename = value;
    }

    /**
     * Gets the value of the outCancelUsrBankemployeeLastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCancelUsrBankemployeeLastName() {
        return outCancelUsrBankemployeeLastName;
    }

    /**
     * Sets the value of the outCancelUsrBankemployeeLastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCancelUsrBankemployeeLastName(String value) {
        this.outCancelUsrBankemployeeLastName = value;
    }

    /**
     * Gets the value of the outCrAccountDepositAccountAccountNumber property.
     * 
     */
    public double getOutCrAccountDepositAccountAccountNumber() {
        return outCrAccountDepositAccountAccountNumber;
    }

    /**
     * Sets the value of the outCrAccountDepositAccountAccountNumber property.
     * 
     */
    public void setOutCrAccountDepositAccountAccountNumber(double value) {
        this.outCrAccountDepositAccountAccountNumber = value;
    }

    /**
     * Gets the value of the outCrAccountDepositAccountCDigit property.
     * 
     */
    public short getOutCrAccountDepositAccountCDigit() {
        return outCrAccountDepositAccountCDigit;
    }

    /**
     * Sets the value of the outCrAccountDepositAccountCDigit property.
     * 
     */
    public void setOutCrAccountDepositAccountCDigit(short value) {
        this.outCrAccountDepositAccountCDigit = value;
    }

    /**
     * Gets the value of the outCrCustAccCurencyCurrencyIdCurrency property.
     * 
     */
    public int getOutCrCustAccCurencyCurrencyIdCurrency() {
        return outCrCustAccCurencyCurrencyIdCurrency;
    }

    /**
     * Sets the value of the outCrCustAccCurencyCurrencyIdCurrency property.
     * 
     */
    public void setOutCrCustAccCurencyCurrencyIdCurrency(int value) {
        this.outCrCustAccCurencyCurrencyIdCurrency = value;
    }

    /**
     * Gets the value of the outCrCustAccCurencyCurrencyShortDescr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCrCustAccCurencyCurrencyShortDescr() {
        return outCrCustAccCurencyCurrencyShortDescr;
    }

    /**
     * Sets the value of the outCrCustAccCurencyCurrencyShortDescr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCrCustAccCurencyCurrencyShortDescr(String value) {
        this.outCrCustAccCurencyCurrencyShortDescr = value;
    }

    /**
     * Gets the value of the outCrCustomerCDigit property.
     * 
     */
    public short getOutCrCustomerCDigit() {
        return outCrCustomerCDigit;
    }

    /**
     * Sets the value of the outCrCustomerCDigit property.
     * 
     */
    public void setOutCrCustomerCDigit(short value) {
        this.outCrCustomerCDigit = value;
    }

    /**
     * Gets the value of the outCrCustomerCustId property.
     * 
     */
    public int getOutCrCustomerCustId() {
        return outCrCustomerCustId;
    }

    /**
     * Sets the value of the outCrCustomerCustId property.
     * 
     */
    public void setOutCrCustomerCustId(int value) {
        this.outCrCustomerCustId = value;
    }

    /**
     * Gets the value of the outCrCustomerDepositAccountCDigit property.
     * 
     */
    public short getOutCrCustomerDepositAccountCDigit() {
        return outCrCustomerDepositAccountCDigit;
    }

    /**
     * Sets the value of the outCrCustomerDepositAccountCDigit property.
     * 
     */
    public void setOutCrCustomerDepositAccountCDigit(short value) {
        this.outCrCustomerDepositAccountCDigit = value;
    }

    /**
     * Gets the value of the outCrCustomerDepositAccountDesignation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCrCustomerDepositAccountDesignation() {
        return outCrCustomerDepositAccountDesignation;
    }

    /**
     * Sets the value of the outCrCustomerDepositAccountDesignation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCrCustomerDepositAccountDesignation(String value) {
        this.outCrCustomerDepositAccountDesignation = value;
    }

    /**
     * Gets the value of the outCrCustomerListSetDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCrCustomerListSetDescription() {
        return outCrCustomerListSetDescription;
    }

    /**
     * Sets the value of the outCrCustomerListSetDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCrCustomerListSetDescription(String value) {
        this.outCrCustomerListSetDescription = value;
    }

    /**
     * Gets the value of the outCusCatGenericDetailDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCusCatGenericDetailDescription() {
        return outCusCatGenericDetailDescription;
    }

    /**
     * Sets the value of the outCusCatGenericDetailDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCusCatGenericDetailDescription(String value) {
        this.outCusCatGenericDetailDescription = value;
    }

    /**
     * Gets the value of the outCustomer2DepositAccountCDigit property.
     * 
     */
    public short getOutCustomer2DepositAccountCDigit() {
        return outCustomer2DepositAccountCDigit;
    }

    /**
     * Sets the value of the outCustomer2DepositAccountCDigit property.
     * 
     */
    public void setOutCustomer2DepositAccountCDigit(short value) {
        this.outCustomer2DepositAccountCDigit = value;
    }

    /**
     * Gets the value of the outCustomer2DepositAccountDesignation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCustomer2DepositAccountDesignation() {
        return outCustomer2DepositAccountDesignation;
    }

    /**
     * Sets the value of the outCustomer2DepositAccountDesignation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCustomer2DepositAccountDesignation(String value) {
        this.outCustomer2DepositAccountDesignation = value;
    }

    /**
     * Gets the value of the outCustomer3DepositAccountCDigit property.
     * 
     */
    public short getOutCustomer3DepositAccountCDigit() {
        return outCustomer3DepositAccountCDigit;
    }

    /**
     * Sets the value of the outCustomer3DepositAccountCDigit property.
     * 
     */
    public void setOutCustomer3DepositAccountCDigit(short value) {
        this.outCustomer3DepositAccountCDigit = value;
    }

    /**
     * Gets the value of the outCustomer3DepositAccountDesignation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCustomer3DepositAccountDesignation() {
        return outCustomer3DepositAccountDesignation;
    }

    /**
     * Sets the value of the outCustomer3DepositAccountDesignation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCustomer3DepositAccountDesignation(String value) {
        this.outCustomer3DepositAccountDesignation = value;
    }

    /**
     * Gets the value of the outCustomerCategoryGenericDetailDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCustomerCategoryGenericDetailDescription() {
        return outCustomerCategoryGenericDetailDescription;
    }

    /**
     * Sets the value of the outCustomerCategoryGenericDetailDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCustomerCategoryGenericDetailDescription(String value) {
        this.outCustomerCategoryGenericDetailDescription = value;
    }

    /**
     * Gets the value of the outDrAfmOtherAfmAfmNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutDrAfmOtherAfmAfmNo() {
        return outDrAfmOtherAfmAfmNo;
    }

    /**
     * Sets the value of the outDrAfmOtherAfmAfmNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutDrAfmOtherAfmAfmNo(String value) {
        this.outDrAfmOtherAfmAfmNo = value;
    }

    /**
     * Gets the value of the outDrCustAccCurrencyCurrencyIdCurrency property.
     * 
     */
    public int getOutDrCustAccCurrencyCurrencyIdCurrency() {
        return outDrCustAccCurrencyCurrencyIdCurrency;
    }

    /**
     * Sets the value of the outDrCustAccCurrencyCurrencyIdCurrency property.
     * 
     */
    public void setOutDrCustAccCurrencyCurrencyIdCurrency(int value) {
        this.outDrCustAccCurrencyCurrencyIdCurrency = value;
    }

    /**
     * Gets the value of the outDrCustAccCurrencyCurrencyShortDescr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutDrCustAccCurrencyCurrencyShortDescr() {
        return outDrCustAccCurrencyCurrencyShortDescr;
    }

    /**
     * Sets the value of the outDrCustAccCurrencyCurrencyShortDescr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutDrCustAccCurrencyCurrencyShortDescr(String value) {
        this.outDrCustAccCurrencyCurrencyShortDescr = value;
    }

    /**
     * Gets the value of the outDrCustAddressCustAddressAddress1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutDrCustAddressCustAddressAddress1() {
        return outDrCustAddressCustAddressAddress1;
    }

    /**
     * Sets the value of the outDrCustAddressCustAddressAddress1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutDrCustAddressCustAddressAddress1(String value) {
        this.outDrCustAddressCustAddressAddress1 = value;
    }

    /**
     * Gets the value of the outDrCustAddressCustAddressAddress2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutDrCustAddressCustAddressAddress2() {
        return outDrCustAddressCustAddressAddress2;
    }

    /**
     * Sets the value of the outDrCustAddressCustAddressAddress2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutDrCustAddressCustAddressAddress2(String value) {
        this.outDrCustAddressCustAddressAddress2 = value;
    }

    /**
     * Gets the value of the outDrCustAddressCustAddressCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutDrCustAddressCustAddressCity() {
        return outDrCustAddressCustAddressCity;
    }

    /**
     * Sets the value of the outDrCustAddressCustAddressCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutDrCustAddressCustAddressCity(String value) {
        this.outDrCustAddressCustAddressCity = value;
    }

    /**
     * Gets the value of the outDrCustAddressCustAddressTelephone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutDrCustAddressCustAddressTelephone() {
        return outDrCustAddressCustAddressTelephone;
    }

    /**
     * Sets the value of the outDrCustAddressCustAddressTelephone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutDrCustAddressCustAddressTelephone(String value) {
        this.outDrCustAddressCustAddressTelephone = value;
    }

    /**
     * Gets the value of the outDrCustAddressCustAddressZipCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutDrCustAddressCustAddressZipCode() {
        return outDrCustAddressCustAddressZipCode;
    }

    /**
     * Sets the value of the outDrCustAddressCustAddressZipCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutDrCustAddressCustAddressZipCode(String value) {
        this.outDrCustAddressCustAddressZipCode = value;
    }

    /**
     * Gets the value of the outDrCustomerAccountDepositAccountAccountNumber property.
     * 
     */
    public double getOutDrCustomerAccountDepositAccountAccountNumber() {
        return outDrCustomerAccountDepositAccountAccountNumber;
    }

    /**
     * Sets the value of the outDrCustomerAccountDepositAccountAccountNumber property.
     * 
     */
    public void setOutDrCustomerAccountDepositAccountAccountNumber(double value) {
        this.outDrCustomerAccountDepositAccountAccountNumber = value;
    }

    /**
     * Gets the value of the outDrCustomerAccountDepositAccountCDigit property.
     * 
     */
    public short getOutDrCustomerAccountDepositAccountCDigit() {
        return outDrCustomerAccountDepositAccountCDigit;
    }

    /**
     * Sets the value of the outDrCustomerAccountDepositAccountCDigit property.
     * 
     */
    public void setOutDrCustomerAccountDepositAccountCDigit(short value) {
        this.outDrCustomerAccountDepositAccountCDigit = value;
    }

    /**
     * Gets the value of the outDrCustomerAccountDepositAccountDesignation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutDrCustomerAccountDepositAccountDesignation() {
        return outDrCustomerAccountDepositAccountDesignation;
    }

    /**
     * Sets the value of the outDrCustomerAccountDepositAccountDesignation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutDrCustomerAccountDepositAccountDesignation(String value) {
        this.outDrCustomerAccountDepositAccountDesignation = value;
    }

    /**
     * Gets the value of the outDrCustomerCounrtyGenericDetailDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutDrCustomerCounrtyGenericDetailDescription() {
        return outDrCustomerCounrtyGenericDetailDescription;
    }

    /**
     * Sets the value of the outDrCustomerCounrtyGenericDetailDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutDrCustomerCounrtyGenericDetailDescription(String value) {
        this.outDrCustomerCounrtyGenericDetailDescription = value;
    }

    /**
     * Gets the value of the outDrCustomerCustomerCDigit property.
     * 
     */
    public short getOutDrCustomerCustomerCDigit() {
        return outDrCustomerCustomerCDigit;
    }

    /**
     * Sets the value of the outDrCustomerCustomerCDigit property.
     * 
     */
    public void setOutDrCustomerCustomerCDigit(short value) {
        this.outDrCustomerCustomerCDigit = value;
    }

    /**
     * Gets the value of the outDrCustomerCustomerCustId property.
     * 
     */
    public int getOutDrCustomerCustomerCustId() {
        return outDrCustomerCustomerCustId;
    }

    /**
     * Sets the value of the outDrCustomerCustomerCustId property.
     * 
     */
    public void setOutDrCustomerCustomerCustId(int value) {
        this.outDrCustomerCustomerCustId = value;
    }

    /**
     * Gets the value of the outDrCustomerCustomerDateOfBirth property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutDrCustomerCustomerDateOfBirth() {
        return outDrCustomerCustomerDateOfBirth;
    }

    /**
     * Sets the value of the outDrCustomerCustomerDateOfBirth property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutDrCustomerCustomerDateOfBirth(XMLGregorianCalendar value) {
        this.outDrCustomerCustomerDateOfBirth = value;
    }

    /**
     * Gets the value of the outDrCustomerCustomerMobileTel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutDrCustomerCustomerMobileTel() {
        return outDrCustomerCustomerMobileTel;
    }

    /**
     * Sets the value of the outDrCustomerCustomerMobileTel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutDrCustomerCustomerMobileTel(String value) {
        this.outDrCustomerCustomerMobileTel = value;
    }

    /**
     * Gets the value of the outDrCustomerCustomerSurname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutDrCustomerCustomerSurname() {
        return outDrCustomerCustomerSurname;
    }

    /**
     * Sets the value of the outDrCustomerCustomerSurname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutDrCustomerCustomerSurname(String value) {
        this.outDrCustomerCustomerSurname = value;
    }

    /**
     * Gets the value of the outDrCustomerCustomerTelephone1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutDrCustomerCustomerTelephone1() {
        return outDrCustomerCustomerTelephone1;
    }

    /**
     * Sets the value of the outDrCustomerCustomerTelephone1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutDrCustomerCustomerTelephone1(String value) {
        this.outDrCustomerCustomerTelephone1 = value;
    }

    /**
     * Gets the value of the outDrCustomerTaxTaxOfficeTaxOfficeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutDrCustomerTaxTaxOfficeTaxOfficeName() {
        return outDrCustomerTaxTaxOfficeTaxOfficeName;
    }

    /**
     * Sets the value of the outDrCustomerTaxTaxOfficeTaxOfficeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutDrCustomerTaxTaxOfficeTaxOfficeName(String value) {
        this.outDrCustomerTaxTaxOfficeTaxOfficeName = value;
    }

    /**
     * Gets the value of the outDrCustomerCustomerCustType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutDrCustomerCustomerCustType() {
        return outDrCustomerCustomerCustType;
    }

    /**
     * Sets the value of the outDrCustomerCustomerCustType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutDrCustomerCustomerCustType(String value) {
        this.outDrCustomerCustomerCustType = value;
    }

    /**
     * Gets the value of the outGrpDamage property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfOutGrpDamageItem }
     *     
     */
    public ArrayOfOutGrpDamageItem getOutGrpDamage() {
        return outGrpDamage;
    }

    /**
     * Sets the value of the outGrpDamage property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfOutGrpDamageItem }
     *     
     */
    public void setOutGrpDamage(ArrayOfOutGrpDamageItem value) {
        this.outGrpDamage = value;
    }

    /**
     * Gets the value of the outGrpHousingTheft property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfOutGrpHousingTheftItem }
     *     
     */
    public ArrayOfOutGrpHousingTheftItem getOutGrpHousingTheft() {
        return outGrpHousingTheft;
    }

    /**
     * Sets the value of the outGrpHousingTheft property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfOutGrpHousingTheftItem }
     *     
     */
    public void setOutGrpHousingTheft(ArrayOfOutGrpHousingTheftItem value) {
        this.outGrpHousingTheft = value;
    }

    /**
     * Gets the value of the outGrpIssComApp property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfOutGrpIssComAppItem }
     *     
     */
    public ArrayOfOutGrpIssComAppItem getOutGrpIssComApp() {
        return outGrpIssComApp;
    }

    /**
     * Sets the value of the outGrpIssComApp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfOutGrpIssComAppItem }
     *     
     */
    public void setOutGrpIssComApp(ArrayOfOutGrpIssComAppItem value) {
        this.outGrpIssComApp = value;
    }

    /**
     * Gets the value of the outHouseRoofGenericDetailDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutHouseRoofGenericDetailDescription() {
        return outHouseRoofGenericDetailDescription;
    }

    /**
     * Sets the value of the outHouseRoofGenericDetailDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutHouseRoofGenericDetailDescription(String value) {
        this.outHouseRoofGenericDetailDescription = value;
    }

    /**
     * Gets the value of the outHouseSkeletonGenericDetailDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutHouseSkeletonGenericDetailDescription() {
        return outHouseSkeletonGenericDetailDescription;
    }

    /**
     * Sets the value of the outHouseSkeletonGenericDetailDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutHouseSkeletonGenericDetailDescription(String value) {
        this.outHouseSkeletonGenericDetailDescription = value;
    }

    /**
     * Gets the value of the outHouseTypeGenericDetailDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutHouseTypeGenericDetailDescription() {
        return outHouseTypeGenericDetailDescription;
    }

    /**
     * Sets the value of the outHouseTypeGenericDetailDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutHouseTypeGenericDetailDescription(String value) {
        this.outHouseTypeGenericDetailDescription = value;
    }

    /**
     * Gets the value of the outHouseWaleGenericDetailDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutHouseWaleGenericDetailDescription() {
        return outHouseWaleGenericDetailDescription;
    }

    /**
     * Sets the value of the outHouseWaleGenericDetailDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutHouseWaleGenericDetailDescription(String value) {
        this.outHouseWaleGenericDetailDescription = value;
    }

    /**
     * Gets the value of the outHousingDetailsAddress1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutHousingDetailsAddress1() {
        return outHousingDetailsAddress1;
    }

    /**
     * Sets the value of the outHousingDetailsAddress1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutHousingDetailsAddress1(String value) {
        this.outHousingDetailsAddress1 = value;
    }

    /**
     * Gets the value of the outHousingDetailsAddress2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutHousingDetailsAddress2() {
        return outHousingDetailsAddress2;
    }

    /**
     * Sets the value of the outHousingDetailsAddress2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutHousingDetailsAddress2(String value) {
        this.outHousingDetailsAddress2 = value;
    }

    /**
     * Gets the value of the outHousingDetailsCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutHousingDetailsCity() {
        return outHousingDetailsCity;
    }

    /**
     * Sets the value of the outHousingDetailsCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutHousingDetailsCity(String value) {
        this.outHousingDetailsCity = value;
    }

    /**
     * Gets the value of the outHousingDetailsFloor property.
     * 
     */
    public short getOutHousingDetailsFloor() {
        return outHousingDetailsFloor;
    }

    /**
     * Sets the value of the outHousingDetailsFloor property.
     * 
     */
    public void setOutHousingDetailsFloor(short value) {
        this.outHousingDetailsFloor = value;
    }

    /**
     * Gets the value of the outHousingDetailsHouseType property.
     * 
     */
    public int getOutHousingDetailsHouseType() {
        return outHousingDetailsHouseType;
    }

    /**
     * Sets the value of the outHousingDetailsHouseType property.
     * 
     */
    public void setOutHousingDetailsHouseType(int value) {
        this.outHousingDetailsHouseType = value;
    }

    /**
     * Gets the value of the outHousingDetailsHouseUse property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutHousingDetailsHouseUse() {
        return outHousingDetailsHouseUse;
    }

    /**
     * Sets the value of the outHousingDetailsHouseUse property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutHousingDetailsHouseUse(String value) {
        this.outHousingDetailsHouseUse = value;
    }

    /**
     * Gets the value of the outHousingDetailsNoFloors property.
     * 
     */
    public short getOutHousingDetailsNoFloors() {
        return outHousingDetailsNoFloors;
    }

    /**
     * Sets the value of the outHousingDetailsNoFloors property.
     * 
     */
    public void setOutHousingDetailsNoFloors(short value) {
        this.outHousingDetailsNoFloors = value;
    }

    /**
     * Gets the value of the outHousingDetailsPartailComments property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutHousingDetailsPartailComments() {
        return outHousingDetailsPartailComments;
    }

    /**
     * Sets the value of the outHousingDetailsPartailComments property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutHousingDetailsPartailComments(String value) {
        this.outHousingDetailsPartailComments = value;
    }

    /**
     * Gets the value of the outHousingDetailsPartial property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutHousingDetailsPartial() {
        return outHousingDetailsPartial;
    }

    /**
     * Sets the value of the outHousingDetailsPartial property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutHousingDetailsPartial(String value) {
        this.outHousingDetailsPartial = value;
    }

    /**
     * Gets the value of the outHousingDetailsRoof property.
     * 
     */
    public int getOutHousingDetailsRoof() {
        return outHousingDetailsRoof;
    }

    /**
     * Sets the value of the outHousingDetailsRoof property.
     * 
     */
    public void setOutHousingDetailsRoof(int value) {
        this.outHousingDetailsRoof = value;
    }

    /**
     * Gets the value of the outHousingDetailsSkeleton property.
     * 
     */
    public int getOutHousingDetailsSkeleton() {
        return outHousingDetailsSkeleton;
    }

    /**
     * Sets the value of the outHousingDetailsSkeleton property.
     * 
     */
    public void setOutHousingDetailsSkeleton(int value) {
        this.outHousingDetailsSkeleton = value;
    }

    /**
     * Gets the value of the outHousingDetailsSquare property.
     * 
     */
    public short getOutHousingDetailsSquare() {
        return outHousingDetailsSquare;
    }

    /**
     * Sets the value of the outHousingDetailsSquare property.
     * 
     */
    public void setOutHousingDetailsSquare(short value) {
        this.outHousingDetailsSquare = value;
    }

    /**
     * Gets the value of the outHousingDetailsUseBasement property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutHousingDetailsUseBasement() {
        return outHousingDetailsUseBasement;
    }

    /**
     * Sets the value of the outHousingDetailsUseBasement property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutHousingDetailsUseBasement(String value) {
        this.outHousingDetailsUseBasement = value;
    }

    /**
     * Gets the value of the outHousingDetailsUseFloor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutHousingDetailsUseFloor() {
        return outHousingDetailsUseFloor;
    }

    /**
     * Sets the value of the outHousingDetailsUseFloor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutHousingDetailsUseFloor(String value) {
        this.outHousingDetailsUseFloor = value;
    }

    /**
     * Gets the value of the outHousingDetailsUseGroundFloor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutHousingDetailsUseGroundFloor() {
        return outHousingDetailsUseGroundFloor;
    }

    /**
     * Sets the value of the outHousingDetailsUseGroundFloor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutHousingDetailsUseGroundFloor(String value) {
        this.outHousingDetailsUseGroundFloor = value;
    }

    /**
     * Gets the value of the outHousingDetailsWale property.
     * 
     */
    public int getOutHousingDetailsWale() {
        return outHousingDetailsWale;
    }

    /**
     * Sets the value of the outHousingDetailsWale property.
     * 
     */
    public void setOutHousingDetailsWale(int value) {
        this.outHousingDetailsWale = value;
    }

    /**
     * Gets the value of the outHousingDetailsZipCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutHousingDetailsZipCode() {
        return outHousingDetailsZipCode;
    }

    /**
     * Sets the value of the outHousingDetailsZipCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutHousingDetailsZipCode(String value) {
        this.outHousingDetailsZipCode = value;
    }

    /**
     * Gets the value of the outHousingDetailsIssHousingDetailsAddress1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutHousingDetailsIssHousingDetailsAddress1() {
        return outHousingDetailsIssHousingDetailsAddress1;
    }

    /**
     * Sets the value of the outHousingDetailsIssHousingDetailsAddress1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutHousingDetailsIssHousingDetailsAddress1(String value) {
        this.outHousingDetailsIssHousingDetailsAddress1 = value;
    }

    /**
     * Gets the value of the outHousingDetailsIssHousingDetailsAddress2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutHousingDetailsIssHousingDetailsAddress2() {
        return outHousingDetailsIssHousingDetailsAddress2;
    }

    /**
     * Sets the value of the outHousingDetailsIssHousingDetailsAddress2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutHousingDetailsIssHousingDetailsAddress2(String value) {
        this.outHousingDetailsIssHousingDetailsAddress2 = value;
    }

    /**
     * Gets the value of the outHousingDetailsIssHousingDetailsBlockAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutHousingDetailsIssHousingDetailsBlockAmount() {
        return outHousingDetailsIssHousingDetailsBlockAmount;
    }

    /**
     * Sets the value of the outHousingDetailsIssHousingDetailsBlockAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutHousingDetailsIssHousingDetailsBlockAmount(BigDecimal value) {
        this.outHousingDetailsIssHousingDetailsBlockAmount = value;
    }

    /**
     * Gets the value of the outHousingDetailsIssHousingDetailsBlockAmount2 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutHousingDetailsIssHousingDetailsBlockAmount2() {
        return outHousingDetailsIssHousingDetailsBlockAmount2;
    }

    /**
     * Sets the value of the outHousingDetailsIssHousingDetailsBlockAmount2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutHousingDetailsIssHousingDetailsBlockAmount2(BigDecimal value) {
        this.outHousingDetailsIssHousingDetailsBlockAmount2 = value;
    }

    /**
     * Gets the value of the outHousingDetailsIssHousingDetailsBlockAmount3 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutHousingDetailsIssHousingDetailsBlockAmount3() {
        return outHousingDetailsIssHousingDetailsBlockAmount3;
    }

    /**
     * Sets the value of the outHousingDetailsIssHousingDetailsBlockAmount3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutHousingDetailsIssHousingDetailsBlockAmount3(BigDecimal value) {
        this.outHousingDetailsIssHousingDetailsBlockAmount3 = value;
    }

    /**
     * Gets the value of the outHousingDetailsIssHousingDetailsCancelledContr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutHousingDetailsIssHousingDetailsCancelledContr() {
        return outHousingDetailsIssHousingDetailsCancelledContr;
    }

    /**
     * Sets the value of the outHousingDetailsIssHousingDetailsCancelledContr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutHousingDetailsIssHousingDetailsCancelledContr(String value) {
        this.outHousingDetailsIssHousingDetailsCancelledContr = value;
    }

    /**
     * Gets the value of the outHousingDetailsIssHousingDetailsCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutHousingDetailsIssHousingDetailsCity() {
        return outHousingDetailsIssHousingDetailsCity;
    }

    /**
     * Sets the value of the outHousingDetailsIssHousingDetailsCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutHousingDetailsIssHousingDetailsCity(String value) {
        this.outHousingDetailsIssHousingDetailsCity = value;
    }

    /**
     * Gets the value of the outHousingDetailsIssHousingDetailsConstrDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutHousingDetailsIssHousingDetailsConstrDate() {
        return outHousingDetailsIssHousingDetailsConstrDate;
    }

    /**
     * Sets the value of the outHousingDetailsIssHousingDetailsConstrDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutHousingDetailsIssHousingDetailsConstrDate(XMLGregorianCalendar value) {
        this.outHousingDetailsIssHousingDetailsConstrDate = value;
    }

    /**
     * Gets the value of the outHousingDetailsIssHousingDetailsContrComments property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutHousingDetailsIssHousingDetailsContrComments() {
        return outHousingDetailsIssHousingDetailsContrComments;
    }

    /**
     * Sets the value of the outHousingDetailsIssHousingDetailsContrComments property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutHousingDetailsIssHousingDetailsContrComments(String value) {
        this.outHousingDetailsIssHousingDetailsContrComments = value;
    }

    /**
     * Gets the value of the outHousingDetailsIssHousingDetailsDamageInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutHousingDetailsIssHousingDetailsDamageInd() {
        return outHousingDetailsIssHousingDetailsDamageInd;
    }

    /**
     * Sets the value of the outHousingDetailsIssHousingDetailsDamageInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutHousingDetailsIssHousingDetailsDamageInd(String value) {
        this.outHousingDetailsIssHousingDetailsDamageInd = value;
    }

    /**
     * Gets the value of the outHousingDetailsIssHousingDetailsEarthquakeCode property.
     * 
     */
    public int getOutHousingDetailsIssHousingDetailsEarthquakeCode() {
        return outHousingDetailsIssHousingDetailsEarthquakeCode;
    }

    /**
     * Sets the value of the outHousingDetailsIssHousingDetailsEarthquakeCode property.
     * 
     */
    public void setOutHousingDetailsIssHousingDetailsEarthquakeCode(int value) {
        this.outHousingDetailsIssHousingDetailsEarthquakeCode = value;
    }

    /**
     * Gets the value of the outHousingDetailsIssHousingDetailsFloor property.
     * 
     */
    public short getOutHousingDetailsIssHousingDetailsFloor() {
        return outHousingDetailsIssHousingDetailsFloor;
    }

    /**
     * Sets the value of the outHousingDetailsIssHousingDetailsFloor property.
     * 
     */
    public void setOutHousingDetailsIssHousingDetailsFloor(short value) {
        this.outHousingDetailsIssHousingDetailsFloor = value;
    }

    /**
     * Gets the value of the outHousingDetailsIssHousingDetailsHouseType property.
     * 
     */
    public int getOutHousingDetailsIssHousingDetailsHouseType() {
        return outHousingDetailsIssHousingDetailsHouseType;
    }

    /**
     * Sets the value of the outHousingDetailsIssHousingDetailsHouseType property.
     * 
     */
    public void setOutHousingDetailsIssHousingDetailsHouseType(int value) {
        this.outHousingDetailsIssHousingDetailsHouseType = value;
    }

    /**
     * Gets the value of the outHousingDetailsIssHousingDetailsHouseUse property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutHousingDetailsIssHousingDetailsHouseUse() {
        return outHousingDetailsIssHousingDetailsHouseUse;
    }

    /**
     * Sets the value of the outHousingDetailsIssHousingDetailsHouseUse property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutHousingDetailsIssHousingDetailsHouseUse(String value) {
        this.outHousingDetailsIssHousingDetailsHouseUse = value;
    }

    /**
     * Gets the value of the outHousingDetailsIssHousingDetailsHsIssuanceAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutHousingDetailsIssHousingDetailsHsIssuanceAmount() {
        return outHousingDetailsIssHousingDetailsHsIssuanceAmount;
    }

    /**
     * Sets the value of the outHousingDetailsIssHousingDetailsHsIssuanceAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutHousingDetailsIssHousingDetailsHsIssuanceAmount(BigDecimal value) {
        this.outHousingDetailsIssHousingDetailsHsIssuanceAmount = value;
    }

    /**
     * Gets the value of the outHousingDetailsIssHousingDetailsHsIssuanceCapital property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutHousingDetailsIssHousingDetailsHsIssuanceCapital() {
        return outHousingDetailsIssHousingDetailsHsIssuanceCapital;
    }

    /**
     * Sets the value of the outHousingDetailsIssHousingDetailsHsIssuanceCapital property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutHousingDetailsIssHousingDetailsHsIssuanceCapital(BigDecimal value) {
        this.outHousingDetailsIssHousingDetailsHsIssuanceCapital = value;
    }

    /**
     * Gets the value of the outHousingDetailsIssHousingDetailsLnsAccCd2 property.
     * 
     */
    public short getOutHousingDetailsIssHousingDetailsLnsAccCd2() {
        return outHousingDetailsIssHousingDetailsLnsAccCd2;
    }

    /**
     * Sets the value of the outHousingDetailsIssHousingDetailsLnsAccCd2 property.
     * 
     */
    public void setOutHousingDetailsIssHousingDetailsLnsAccCd2(short value) {
        this.outHousingDetailsIssHousingDetailsLnsAccCd2 = value;
    }

    /**
     * Gets the value of the outHousingDetailsIssHousingDetailsLnsAccCd3 property.
     * 
     */
    public short getOutHousingDetailsIssHousingDetailsLnsAccCd3() {
        return outHousingDetailsIssHousingDetailsLnsAccCd3;
    }

    /**
     * Sets the value of the outHousingDetailsIssHousingDetailsLnsAccCd3 property.
     * 
     */
    public void setOutHousingDetailsIssHousingDetailsLnsAccCd3(short value) {
        this.outHousingDetailsIssHousingDetailsLnsAccCd3 = value;
    }

    /**
     * Gets the value of the outHousingDetailsIssHousingDetailsLnsAccSn2 property.
     * 
     */
    public int getOutHousingDetailsIssHousingDetailsLnsAccSn2() {
        return outHousingDetailsIssHousingDetailsLnsAccSn2;
    }

    /**
     * Sets the value of the outHousingDetailsIssHousingDetailsLnsAccSn2 property.
     * 
     */
    public void setOutHousingDetailsIssHousingDetailsLnsAccSn2(int value) {
        this.outHousingDetailsIssHousingDetailsLnsAccSn2 = value;
    }

    /**
     * Gets the value of the outHousingDetailsIssHousingDetailsLnsAccSn3 property.
     * 
     */
    public int getOutHousingDetailsIssHousingDetailsLnsAccSn3() {
        return outHousingDetailsIssHousingDetailsLnsAccSn3;
    }

    /**
     * Sets the value of the outHousingDetailsIssHousingDetailsLnsAccSn3 property.
     * 
     */
    public void setOutHousingDetailsIssHousingDetailsLnsAccSn3(int value) {
        this.outHousingDetailsIssHousingDetailsLnsAccSn3 = value;
    }

    /**
     * Gets the value of the outHousingDetailsIssHousingDetailsLnsAccType2 property.
     * 
     */
    public short getOutHousingDetailsIssHousingDetailsLnsAccType2() {
        return outHousingDetailsIssHousingDetailsLnsAccType2;
    }

    /**
     * Sets the value of the outHousingDetailsIssHousingDetailsLnsAccType2 property.
     * 
     */
    public void setOutHousingDetailsIssHousingDetailsLnsAccType2(short value) {
        this.outHousingDetailsIssHousingDetailsLnsAccType2 = value;
    }

    /**
     * Gets the value of the outHousingDetailsIssHousingDetailsLnsAccType3 property.
     * 
     */
    public short getOutHousingDetailsIssHousingDetailsLnsAccType3() {
        return outHousingDetailsIssHousingDetailsLnsAccType3;
    }

    /**
     * Sets the value of the outHousingDetailsIssHousingDetailsLnsAccType3 property.
     * 
     */
    public void setOutHousingDetailsIssHousingDetailsLnsAccType3(short value) {
        this.outHousingDetailsIssHousingDetailsLnsAccType3 = value;
    }

    /**
     * Gets the value of the outHousingDetailsIssHousingDetailsLnsAccUnit2 property.
     * 
     */
    public int getOutHousingDetailsIssHousingDetailsLnsAccUnit2() {
        return outHousingDetailsIssHousingDetailsLnsAccUnit2;
    }

    /**
     * Sets the value of the outHousingDetailsIssHousingDetailsLnsAccUnit2 property.
     * 
     */
    public void setOutHousingDetailsIssHousingDetailsLnsAccUnit2(int value) {
        this.outHousingDetailsIssHousingDetailsLnsAccUnit2 = value;
    }

    /**
     * Gets the value of the outHousingDetailsIssHousingDetailsLnsAccUnit3 property.
     * 
     */
    public int getOutHousingDetailsIssHousingDetailsLnsAccUnit3() {
        return outHousingDetailsIssHousingDetailsLnsAccUnit3;
    }

    /**
     * Sets the value of the outHousingDetailsIssHousingDetailsLnsAccUnit3 property.
     * 
     */
    public void setOutHousingDetailsIssHousingDetailsLnsAccUnit3(int value) {
        this.outHousingDetailsIssHousingDetailsLnsAccUnit3 = value;
    }

    /**
     * Gets the value of the outHousingDetailsIssHousingDetailsLoanAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutHousingDetailsIssHousingDetailsLoanAmount() {
        return outHousingDetailsIssHousingDetailsLoanAmount;
    }

    /**
     * Sets the value of the outHousingDetailsIssHousingDetailsLoanAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutHousingDetailsIssHousingDetailsLoanAmount(BigDecimal value) {
        this.outHousingDetailsIssHousingDetailsLoanAmount = value;
    }

    /**
     * Gets the value of the outHousingDetailsIssHousingDetailsLoanAmount2 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutHousingDetailsIssHousingDetailsLoanAmount2() {
        return outHousingDetailsIssHousingDetailsLoanAmount2;
    }

    /**
     * Sets the value of the outHousingDetailsIssHousingDetailsLoanAmount2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutHousingDetailsIssHousingDetailsLoanAmount2(BigDecimal value) {
        this.outHousingDetailsIssHousingDetailsLoanAmount2 = value;
    }

    /**
     * Gets the value of the outHousingDetailsIssHousingDetailsLoanAmount3 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutHousingDetailsIssHousingDetailsLoanAmount3() {
        return outHousingDetailsIssHousingDetailsLoanAmount3;
    }

    /**
     * Sets the value of the outHousingDetailsIssHousingDetailsLoanAmount3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutHousingDetailsIssHousingDetailsLoanAmount3(BigDecimal value) {
        this.outHousingDetailsIssHousingDetailsLoanAmount3 = value;
    }

    /**
     * Gets the value of the outHousingDetailsIssHousingDetailsLoanExpDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutHousingDetailsIssHousingDetailsLoanExpDt() {
        return outHousingDetailsIssHousingDetailsLoanExpDt;
    }

    /**
     * Sets the value of the outHousingDetailsIssHousingDetailsLoanExpDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutHousingDetailsIssHousingDetailsLoanExpDt(XMLGregorianCalendar value) {
        this.outHousingDetailsIssHousingDetailsLoanExpDt = value;
    }

    /**
     * Gets the value of the outHousingDetailsIssHousingDetailsLoanExpDt2 property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutHousingDetailsIssHousingDetailsLoanExpDt2() {
        return outHousingDetailsIssHousingDetailsLoanExpDt2;
    }

    /**
     * Sets the value of the outHousingDetailsIssHousingDetailsLoanExpDt2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutHousingDetailsIssHousingDetailsLoanExpDt2(XMLGregorianCalendar value) {
        this.outHousingDetailsIssHousingDetailsLoanExpDt2 = value;
    }

    /**
     * Gets the value of the outHousingDetailsIssHousingDetailsLoanExpDt3 property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutHousingDetailsIssHousingDetailsLoanExpDt3() {
        return outHousingDetailsIssHousingDetailsLoanExpDt3;
    }

    /**
     * Sets the value of the outHousingDetailsIssHousingDetailsLoanExpDt3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutHousingDetailsIssHousingDetailsLoanExpDt3(XMLGregorianCalendar value) {
        this.outHousingDetailsIssHousingDetailsLoanExpDt3 = value;
    }

    /**
     * Gets the value of the outHousingDetailsIssHousingDetailsNoFloors property.
     * 
     */
    public short getOutHousingDetailsIssHousingDetailsNoFloors() {
        return outHousingDetailsIssHousingDetailsNoFloors;
    }

    /**
     * Sets the value of the outHousingDetailsIssHousingDetailsNoFloors property.
     * 
     */
    public void setOutHousingDetailsIssHousingDetailsNoFloors(short value) {
        this.outHousingDetailsIssHousingDetailsNoFloors = value;
    }

    /**
     * Gets the value of the outHousingDetailsIssHousingDetailsOtherCustComment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutHousingDetailsIssHousingDetailsOtherCustComment() {
        return outHousingDetailsIssHousingDetailsOtherCustComment;
    }

    /**
     * Sets the value of the outHousingDetailsIssHousingDetailsOtherCustComment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutHousingDetailsIssHousingDetailsOtherCustComment(String value) {
        this.outHousingDetailsIssHousingDetailsOtherCustComment = value;
    }

    /**
     * Gets the value of the outHousingDetailsIssHousingDetailsOtherCustInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutHousingDetailsIssHousingDetailsOtherCustInd() {
        return outHousingDetailsIssHousingDetailsOtherCustInd;
    }

    /**
     * Sets the value of the outHousingDetailsIssHousingDetailsOtherCustInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutHousingDetailsIssHousingDetailsOtherCustInd(String value) {
        this.outHousingDetailsIssHousingDetailsOtherCustInd = value;
    }

    /**
     * Gets the value of the outHousingDetailsIssHousingDetailsPartial property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutHousingDetailsIssHousingDetailsPartial() {
        return outHousingDetailsIssHousingDetailsPartial;
    }

    /**
     * Sets the value of the outHousingDetailsIssHousingDetailsPartial property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutHousingDetailsIssHousingDetailsPartial(String value) {
        this.outHousingDetailsIssHousingDetailsPartial = value;
    }

    /**
     * Gets the value of the outHousingDetailsIssHousingDetailsPartialComments property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutHousingDetailsIssHousingDetailsPartialComments() {
        return outHousingDetailsIssHousingDetailsPartialComments;
    }

    /**
     * Sets the value of the outHousingDetailsIssHousingDetailsPartialComments property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutHousingDetailsIssHousingDetailsPartialComments(String value) {
        this.outHousingDetailsIssHousingDetailsPartialComments = value;
    }

    /**
     * Gets the value of the outHousingDetailsIssHousingDetailsRoof property.
     * 
     */
    public int getOutHousingDetailsIssHousingDetailsRoof() {
        return outHousingDetailsIssHousingDetailsRoof;
    }

    /**
     * Sets the value of the outHousingDetailsIssHousingDetailsRoof property.
     * 
     */
    public void setOutHousingDetailsIssHousingDetailsRoof(int value) {
        this.outHousingDetailsIssHousingDetailsRoof = value;
    }

    /**
     * Gets the value of the outHousingDetailsIssHousingDetailsSkeleton property.
     * 
     */
    public int getOutHousingDetailsIssHousingDetailsSkeleton() {
        return outHousingDetailsIssHousingDetailsSkeleton;
    }

    /**
     * Sets the value of the outHousingDetailsIssHousingDetailsSkeleton property.
     * 
     */
    public void setOutHousingDetailsIssHousingDetailsSkeleton(int value) {
        this.outHousingDetailsIssHousingDetailsSkeleton = value;
    }

    /**
     * Gets the value of the outHousingDetailsIssHousingDetailsSquere property.
     * 
     */
    public short getOutHousingDetailsIssHousingDetailsSquere() {
        return outHousingDetailsIssHousingDetailsSquere;
    }

    /**
     * Sets the value of the outHousingDetailsIssHousingDetailsSquere property.
     * 
     */
    public void setOutHousingDetailsIssHousingDetailsSquere(short value) {
        this.outHousingDetailsIssHousingDetailsSquere = value;
    }

    /**
     * Gets the value of the outHousingDetailsIssHousingDetailsTpSoIdentifier property.
     * 
     */
    public double getOutHousingDetailsIssHousingDetailsTpSoIdentifier() {
        return outHousingDetailsIssHousingDetailsTpSoIdentifier;
    }

    /**
     * Sets the value of the outHousingDetailsIssHousingDetailsTpSoIdentifier property.
     * 
     */
    public void setOutHousingDetailsIssHousingDetailsTpSoIdentifier(double value) {
        this.outHousingDetailsIssHousingDetailsTpSoIdentifier = value;
    }

    /**
     * Gets the value of the outHousingDetailsIssHousingDetailsUseBasement property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutHousingDetailsIssHousingDetailsUseBasement() {
        return outHousingDetailsIssHousingDetailsUseBasement;
    }

    /**
     * Sets the value of the outHousingDetailsIssHousingDetailsUseBasement property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutHousingDetailsIssHousingDetailsUseBasement(String value) {
        this.outHousingDetailsIssHousingDetailsUseBasement = value;
    }

    /**
     * Gets the value of the outHousingDetailsIssHousingDetailsUseFloor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutHousingDetailsIssHousingDetailsUseFloor() {
        return outHousingDetailsIssHousingDetailsUseFloor;
    }

    /**
     * Sets the value of the outHousingDetailsIssHousingDetailsUseFloor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutHousingDetailsIssHousingDetailsUseFloor(String value) {
        this.outHousingDetailsIssHousingDetailsUseFloor = value;
    }

    /**
     * Gets the value of the outHousingDetailsIssHousingDetailsUseGround property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutHousingDetailsIssHousingDetailsUseGround() {
        return outHousingDetailsIssHousingDetailsUseGround;
    }

    /**
     * Sets the value of the outHousingDetailsIssHousingDetailsUseGround property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutHousingDetailsIssHousingDetailsUseGround(String value) {
        this.outHousingDetailsIssHousingDetailsUseGround = value;
    }

    /**
     * Gets the value of the outHousingDetailsIssHousingDetailsWale property.
     * 
     */
    public int getOutHousingDetailsIssHousingDetailsWale() {
        return outHousingDetailsIssHousingDetailsWale;
    }

    /**
     * Sets the value of the outHousingDetailsIssHousingDetailsWale property.
     * 
     */
    public void setOutHousingDetailsIssHousingDetailsWale(int value) {
        this.outHousingDetailsIssHousingDetailsWale = value;
    }

    /**
     * Gets the value of the outHousingDetailsIssHousingDetailsZipCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutHousingDetailsIssHousingDetailsZipCode() {
        return outHousingDetailsIssHousingDetailsZipCode;
    }

    /**
     * Sets the value of the outHousingDetailsIssHousingDetailsZipCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutHousingDetailsIssHousingDetailsZipCode(String value) {
        this.outHousingDetailsIssHousingDetailsZipCode = value;
    }

    /**
     * Gets the value of the outHoustypCatGenericDetailDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutHoustypCatGenericDetailDescription() {
        return outHoustypCatGenericDetailDescription;
    }

    /**
     * Sets the value of the outHoustypCatGenericDetailDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutHoustypCatGenericDetailDescription(String value) {
        this.outHoustypCatGenericDetailDescription = value;
    }

    /**
     * Gets the value of the outHsdamCatGenericDetailDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutHsdamCatGenericDetailDescription() {
        return outHsdamCatGenericDetailDescription;
    }

    /**
     * Sets the value of the outHsdamCatGenericDetailDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutHsdamCatGenericDetailDescription(String value) {
        this.outHsdamCatGenericDetailDescription = value;
    }

    /**
     * Gets the value of the outHsqukCatGenericDetailDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutHsqukCatGenericDetailDescription() {
        return outHsqukCatGenericDetailDescription;
    }

    /**
     * Sets the value of the outHsqukCatGenericDetailDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutHsqukCatGenericDetailDescription(String value) {
        this.outHsqukCatGenericDetailDescription = value;
    }

    /**
     * Gets the value of the outInsuranceIssCommitmentActivationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutInsuranceIssCommitmentActivationDate() {
        return outInsuranceIssCommitmentActivationDate;
    }

    /**
     * Sets the value of the outInsuranceIssCommitmentActivationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutInsuranceIssCommitmentActivationDate(XMLGregorianCalendar value) {
        this.outInsuranceIssCommitmentActivationDate = value;
    }

    /**
     * Gets the value of the outInsuranceIssCommitmentCancelationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutInsuranceIssCommitmentCancelationDate() {
        return outInsuranceIssCommitmentCancelationDate;
    }

    /**
     * Sets the value of the outInsuranceIssCommitmentCancelationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutInsuranceIssCommitmentCancelationDate(XMLGregorianCalendar value) {
        this.outInsuranceIssCommitmentCancelationDate = value;
    }

    /**
     * Gets the value of the outInsuranceIssCommitmentChargeAmnPerPay property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutInsuranceIssCommitmentChargeAmnPerPay() {
        return outInsuranceIssCommitmentChargeAmnPerPay;
    }

    /**
     * Sets the value of the outInsuranceIssCommitmentChargeAmnPerPay property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutInsuranceIssCommitmentChargeAmnPerPay(BigDecimal value) {
        this.outInsuranceIssCommitmentChargeAmnPerPay = value;
    }

    /**
     * Gets the value of the outInsuranceIssCommitmentChargeMethod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutInsuranceIssCommitmentChargeMethod() {
        return outInsuranceIssCommitmentChargeMethod;
    }

    /**
     * Sets the value of the outInsuranceIssCommitmentChargeMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutInsuranceIssCommitmentChargeMethod(String value) {
        this.outInsuranceIssCommitmentChargeMethod = value;
    }

    /**
     * Gets the value of the outInsuranceIssCommitmentComments1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutInsuranceIssCommitmentComments1() {
        return outInsuranceIssCommitmentComments1;
    }

    /**
     * Sets the value of the outInsuranceIssCommitmentComments1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutInsuranceIssCommitmentComments1(String value) {
        this.outInsuranceIssCommitmentComments1 = value;
    }

    /**
     * Gets the value of the outInsuranceIssCommitmentComments2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutInsuranceIssCommitmentComments2() {
        return outInsuranceIssCommitmentComments2;
    }

    /**
     * Sets the value of the outInsuranceIssCommitmentComments2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutInsuranceIssCommitmentComments2(String value) {
        this.outInsuranceIssCommitmentComments2 = value;
    }

    /**
     * Gets the value of the outInsuranceIssCommitmentCoverRatio property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutInsuranceIssCommitmentCoverRatio() {
        return outInsuranceIssCommitmentCoverRatio;
    }

    /**
     * Sets the value of the outInsuranceIssCommitmentCoverRatio property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutInsuranceIssCommitmentCoverRatio(BigDecimal value) {
        this.outInsuranceIssCommitmentCoverRatio = value;
    }

    /**
     * Gets the value of the outInsuranceIssCommitmentCrAccCustomerId property.
     * 
     */
    public int getOutInsuranceIssCommitmentCrAccCustomerId() {
        return outInsuranceIssCommitmentCrAccCustomerId;
    }

    /**
     * Sets the value of the outInsuranceIssCommitmentCrAccCustomerId property.
     * 
     */
    public void setOutInsuranceIssCommitmentCrAccCustomerId(int value) {
        this.outInsuranceIssCommitmentCrAccCustomerId = value;
    }

    /**
     * Gets the value of the outInsuranceIssCommitmentCrDepAccount property.
     * 
     */
    public double getOutInsuranceIssCommitmentCrDepAccount() {
        return outInsuranceIssCommitmentCrDepAccount;
    }

    /**
     * Sets the value of the outInsuranceIssCommitmentCrDepAccount property.
     * 
     */
    public void setOutInsuranceIssCommitmentCrDepAccount(double value) {
        this.outInsuranceIssCommitmentCrDepAccount = value;
    }

    /**
     * Gets the value of the outInsuranceIssCommitmentCreditCardNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutInsuranceIssCommitmentCreditCardNo() {
        return outInsuranceIssCommitmentCreditCardNo;
    }

    /**
     * Sets the value of the outInsuranceIssCommitmentCreditCardNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutInsuranceIssCommitmentCreditCardNo(String value) {
        this.outInsuranceIssCommitmentCreditCardNo = value;
    }

    /**
     * Gets the value of the outInsuranceIssCommitmentDrAccCustomerId property.
     * 
     */
    public int getOutInsuranceIssCommitmentDrAccCustomerId() {
        return outInsuranceIssCommitmentDrAccCustomerId;
    }

    /**
     * Sets the value of the outInsuranceIssCommitmentDrAccCustomerId property.
     * 
     */
    public void setOutInsuranceIssCommitmentDrAccCustomerId(int value) {
        this.outInsuranceIssCommitmentDrAccCustomerId = value;
    }

    /**
     * Gets the value of the outInsuranceIssCommitmentEntryStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutInsuranceIssCommitmentEntryStatus() {
        return outInsuranceIssCommitmentEntryStatus;
    }

    /**
     * Sets the value of the outInsuranceIssCommitmentEntryStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutInsuranceIssCommitmentEntryStatus(String value) {
        this.outInsuranceIssCommitmentEntryStatus = value;
    }

    /**
     * Gets the value of the outInsuranceIssCommitmentExpirationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutInsuranceIssCommitmentExpirationDate() {
        return outInsuranceIssCommitmentExpirationDate;
    }

    /**
     * Sets the value of the outInsuranceIssCommitmentExpirationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutInsuranceIssCommitmentExpirationDate(XMLGregorianCalendar value) {
        this.outInsuranceIssCommitmentExpirationDate = value;
    }

    /**
     * Gets the value of the outInsuranceIssCommitmentFinalizeDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutInsuranceIssCommitmentFinalizeDate() {
        return outInsuranceIssCommitmentFinalizeDate;
    }

    /**
     * Sets the value of the outInsuranceIssCommitmentFinalizeDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutInsuranceIssCommitmentFinalizeDate(XMLGregorianCalendar value) {
        this.outInsuranceIssCommitmentFinalizeDate = value;
    }

    /**
     * Gets the value of the outInsuranceIssCommitmentFixAmnPay property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutInsuranceIssCommitmentFixAmnPay() {
        return outInsuranceIssCommitmentFixAmnPay;
    }

    /**
     * Sets the value of the outInsuranceIssCommitmentFixAmnPay property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutInsuranceIssCommitmentFixAmnPay(BigDecimal value) {
        this.outInsuranceIssCommitmentFixAmnPay = value;
    }

    /**
     * Gets the value of the outInsuranceIssCommitmentFkAccCd property.
     * 
     */
    public short getOutInsuranceIssCommitmentFkAccCd() {
        return outInsuranceIssCommitmentFkAccCd;
    }

    /**
     * Sets the value of the outInsuranceIssCommitmentFkAccCd property.
     * 
     */
    public void setOutInsuranceIssCommitmentFkAccCd(short value) {
        this.outInsuranceIssCommitmentFkAccCd = value;
    }

    /**
     * Gets the value of the outInsuranceIssCommitmentFkAccSn property.
     * 
     */
    public int getOutInsuranceIssCommitmentFkAccSn() {
        return outInsuranceIssCommitmentFkAccSn;
    }

    /**
     * Sets the value of the outInsuranceIssCommitmentFkAccSn property.
     * 
     */
    public void setOutInsuranceIssCommitmentFkAccSn(int value) {
        this.outInsuranceIssCommitmentFkAccSn = value;
    }

    /**
     * Gets the value of the outInsuranceIssCommitmentFkAccType property.
     * 
     */
    public short getOutInsuranceIssCommitmentFkAccType() {
        return outInsuranceIssCommitmentFkAccType;
    }

    /**
     * Sets the value of the outInsuranceIssCommitmentFkAccType property.
     * 
     */
    public void setOutInsuranceIssCommitmentFkAccType(short value) {
        this.outInsuranceIssCommitmentFkAccType = value;
    }

    /**
     * Gets the value of the outInsuranceIssCommitmentFkAccUnit property.
     * 
     */
    public int getOutInsuranceIssCommitmentFkAccUnit() {
        return outInsuranceIssCommitmentFkAccUnit;
    }

    /**
     * Sets the value of the outInsuranceIssCommitmentFkAccUnit property.
     * 
     */
    public void setOutInsuranceIssCommitmentFkAccUnit(int value) {
        this.outInsuranceIssCommitmentFkAccUnit = value;
    }

    /**
     * Gets the value of the outInsuranceIssCommitmentFkCategory property.
     * 
     */
    public int getOutInsuranceIssCommitmentFkCategory() {
        return outInsuranceIssCommitmentFkCategory;
    }

    /**
     * Sets the value of the outInsuranceIssCommitmentFkCategory property.
     * 
     */
    public void setOutInsuranceIssCommitmentFkCategory(int value) {
        this.outInsuranceIssCommitmentFkCategory = value;
    }

    /**
     * Gets the value of the outInsuranceIssCommitmentFkCnlUsr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutInsuranceIssCommitmentFkCnlUsr() {
        return outInsuranceIssCommitmentFkCnlUsr;
    }

    /**
     * Sets the value of the outInsuranceIssCommitmentFkCnlUsr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutInsuranceIssCommitmentFkCnlUsr(String value) {
        this.outInsuranceIssCommitmentFkCnlUsr = value;
    }

    /**
     * Gets the value of the outInsuranceIssCommitmentFkDebitAccount property.
     * 
     */
    public double getOutInsuranceIssCommitmentFkDebitAccount() {
        return outInsuranceIssCommitmentFkDebitAccount;
    }

    /**
     * Sets the value of the outInsuranceIssCommitmentFkDebitAccount property.
     * 
     */
    public void setOutInsuranceIssCommitmentFkDebitAccount(double value) {
        this.outInsuranceIssCommitmentFkDebitAccount = value;
    }

    /**
     * Gets the value of the outInsuranceIssCommitmentFkFinalizeUsr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutInsuranceIssCommitmentFkFinalizeUsr() {
        return outInsuranceIssCommitmentFkFinalizeUsr;
    }

    /**
     * Sets the value of the outInsuranceIssCommitmentFkFinalizeUsr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutInsuranceIssCommitmentFkFinalizeUsr(String value) {
        this.outInsuranceIssCommitmentFkFinalizeUsr = value;
    }

    /**
     * Gets the value of the outInsuranceIssCommitmentFkGenDetSerNum property.
     * 
     */
    public int getOutInsuranceIssCommitmentFkGenDetSerNum() {
        return outInsuranceIssCommitmentFkGenDetSerNum;
    }

    /**
     * Sets the value of the outInsuranceIssCommitmentFkGenDetSerNum property.
     * 
     */
    public void setOutInsuranceIssCommitmentFkGenDetSerNum(int value) {
        this.outInsuranceIssCommitmentFkGenDetSerNum = value;
    }

    /**
     * Gets the value of the outInsuranceIssCommitmentFkGenericHeadpar property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutInsuranceIssCommitmentFkGenericHeadpar() {
        return outInsuranceIssCommitmentFkGenericHeadpar;
    }

    /**
     * Sets the value of the outInsuranceIssCommitmentFkGenericHeadpar property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutInsuranceIssCommitmentFkGenericHeadpar(String value) {
        this.outInsuranceIssCommitmentFkGenericHeadpar = value;
    }

    /**
     * Gets the value of the outInsuranceIssCommitmentFkResponsibleUnit property.
     * 
     */
    public int getOutInsuranceIssCommitmentFkResponsibleUnit() {
        return outInsuranceIssCommitmentFkResponsibleUnit;
    }

    /**
     * Sets the value of the outInsuranceIssCommitmentFkResponsibleUnit property.
     * 
     */
    public void setOutInsuranceIssCommitmentFkResponsibleUnit(int value) {
        this.outInsuranceIssCommitmentFkResponsibleUnit = value;
    }

    /**
     * Gets the value of the outInsuranceIssCommitmentFkUpdUsr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutInsuranceIssCommitmentFkUpdUsr() {
        return outInsuranceIssCommitmentFkUpdUsr;
    }

    /**
     * Sets the value of the outInsuranceIssCommitmentFkUpdUsr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutInsuranceIssCommitmentFkUpdUsr(String value) {
        this.outInsuranceIssCommitmentFkUpdUsr = value;
    }

    /**
     * Gets the value of the outInsuranceIssCommitmentFrequency property.
     * 
     */
    public short getOutInsuranceIssCommitmentFrequency() {
        return outInsuranceIssCommitmentFrequency;
    }

    /**
     * Sets the value of the outInsuranceIssCommitmentFrequency property.
     * 
     */
    public void setOutInsuranceIssCommitmentFrequency(short value) {
        this.outInsuranceIssCommitmentFrequency = value;
    }

    /**
     * Gets the value of the outInsuranceIssCommitmentFrequencyUnit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutInsuranceIssCommitmentFrequencyUnit() {
        return outInsuranceIssCommitmentFrequencyUnit;
    }

    /**
     * Sets the value of the outInsuranceIssCommitmentFrequencyUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutInsuranceIssCommitmentFrequencyUnit(String value) {
        this.outInsuranceIssCommitmentFrequencyUnit = value;
    }

    /**
     * Gets the value of the outInsuranceIssCommitmentGradAppExpRatio property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutInsuranceIssCommitmentGradAppExpRatio() {
        return outInsuranceIssCommitmentGradAppExpRatio;
    }

    /**
     * Sets the value of the outInsuranceIssCommitmentGradAppExpRatio property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutInsuranceIssCommitmentGradAppExpRatio(BigDecimal value) {
        this.outInsuranceIssCommitmentGradAppExpRatio = value;
    }

    /**
     * Gets the value of the outInsuranceIssCommitmentInsuranceValue property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutInsuranceIssCommitmentInsuranceValue() {
        return outInsuranceIssCommitmentInsuranceValue;
    }

    /**
     * Sets the value of the outInsuranceIssCommitmentInsuranceValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutInsuranceIssCommitmentInsuranceValue(BigDecimal value) {
        this.outInsuranceIssCommitmentInsuranceValue = value;
    }

    /**
     * Gets the value of the outInsuranceIssCommitmentIssuanceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutInsuranceIssCommitmentIssuanceNumber() {
        return outInsuranceIssCommitmentIssuanceNumber;
    }

    /**
     * Sets the value of the outInsuranceIssCommitmentIssuanceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutInsuranceIssCommitmentIssuanceNumber(String value) {
        this.outInsuranceIssCommitmentIssuanceNumber = value;
    }

    /**
     * Gets the value of the outInsuranceIssCommitmentIssueDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutInsuranceIssCommitmentIssueDate() {
        return outInsuranceIssCommitmentIssueDate;
    }

    /**
     * Sets the value of the outInsuranceIssCommitmentIssueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutInsuranceIssCommitmentIssueDate(XMLGregorianCalendar value) {
        this.outInsuranceIssCommitmentIssueDate = value;
    }

    /**
     * Gets the value of the outInsuranceIssCommitmentIssueType property.
     * 
     */
    public short getOutInsuranceIssCommitmentIssueType() {
        return outInsuranceIssCommitmentIssueType;
    }

    /**
     * Sets the value of the outInsuranceIssCommitmentIssueType property.
     * 
     */
    public void setOutInsuranceIssCommitmentIssueType(short value) {
        this.outInsuranceIssCommitmentIssueType = value;
    }

    /**
     * Gets the value of the outInsuranceIssCommitmentLastUpdateDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutInsuranceIssCommitmentLastUpdateDate() {
        return outInsuranceIssCommitmentLastUpdateDate;
    }

    /**
     * Sets the value of the outInsuranceIssCommitmentLastUpdateDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutInsuranceIssCommitmentLastUpdateDate(XMLGregorianCalendar value) {
        this.outInsuranceIssCommitmentLastUpdateDate = value;
    }

    /**
     * Gets the value of the outInsuranceIssCommitmentLoanAccUntermRa property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutInsuranceIssCommitmentLoanAccUntermRa() {
        return outInsuranceIssCommitmentLoanAccUntermRa;
    }

    /**
     * Sets the value of the outInsuranceIssCommitmentLoanAccUntermRa property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutInsuranceIssCommitmentLoanAccUntermRa(BigDecimal value) {
        this.outInsuranceIssCommitmentLoanAccUntermRa = value;
    }

    /**
     * Gets the value of the outInsuranceIssCommitmentLoanInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutInsuranceIssCommitmentLoanInd() {
        return outInsuranceIssCommitmentLoanInd;
    }

    /**
     * Sets the value of the outInsuranceIssCommitmentLoanInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutInsuranceIssCommitmentLoanInd(String value) {
        this.outInsuranceIssCommitmentLoanInd = value;
    }

    /**
     * Gets the value of the outInsuranceIssCommitmentMainTpSoId property.
     * 
     */
    public double getOutInsuranceIssCommitmentMainTpSoId() {
        return outInsuranceIssCommitmentMainTpSoId;
    }

    /**
     * Sets the value of the outInsuranceIssCommitmentMainTpSoId property.
     * 
     */
    public void setOutInsuranceIssCommitmentMainTpSoId(double value) {
        this.outInsuranceIssCommitmentMainTpSoId = value;
    }

    /**
     * Gets the value of the outInsuranceIssCommitmentMaxNumberAttempts property.
     * 
     */
    public int getOutInsuranceIssCommitmentMaxNumberAttempts() {
        return outInsuranceIssCommitmentMaxNumberAttempts;
    }

    /**
     * Sets the value of the outInsuranceIssCommitmentMaxNumberAttempts property.
     * 
     */
    public void setOutInsuranceIssCommitmentMaxNumberAttempts(int value) {
        this.outInsuranceIssCommitmentMaxNumberAttempts = value;
    }

    /**
     * Gets the value of the outInsuranceIssCommitmentNumberOfAttempts property.
     * 
     */
    public short getOutInsuranceIssCommitmentNumberOfAttempts() {
        return outInsuranceIssCommitmentNumberOfAttempts;
    }

    /**
     * Sets the value of the outInsuranceIssCommitmentNumberOfAttempts property.
     * 
     */
    public void setOutInsuranceIssCommitmentNumberOfAttempts(short value) {
        this.outInsuranceIssCommitmentNumberOfAttempts = value;
    }

    /**
     * Gets the value of the outInsuranceIssCommitmentOnceOnlyCharge property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutInsuranceIssCommitmentOnceOnlyCharge() {
        return outInsuranceIssCommitmentOnceOnlyCharge;
    }

    /**
     * Sets the value of the outInsuranceIssCommitmentOnceOnlyCharge property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutInsuranceIssCommitmentOnceOnlyCharge(BigDecimal value) {
        this.outInsuranceIssCommitmentOnceOnlyCharge = value;
    }

    /**
     * Gets the value of the outInsuranceIssCommitmentOtherOutstBal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutInsuranceIssCommitmentOtherOutstBal() {
        return outInsuranceIssCommitmentOtherOutstBal;
    }

    /**
     * Sets the value of the outInsuranceIssCommitmentOtherOutstBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutInsuranceIssCommitmentOtherOutstBal(BigDecimal value) {
        this.outInsuranceIssCommitmentOtherOutstBal = value;
    }

    /**
     * Gets the value of the outInsuranceIssCommitmentPEntryStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutInsuranceIssCommitmentPEntryStatus() {
        return outInsuranceIssCommitmentPEntryStatus;
    }

    /**
     * Sets the value of the outInsuranceIssCommitmentPEntryStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutInsuranceIssCommitmentPEntryStatus(String value) {
        this.outInsuranceIssCommitmentPEntryStatus = value;
    }

    /**
     * Gets the value of the outInsuranceIssCommitmentPayableAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutInsuranceIssCommitmentPayableAmount() {
        return outInsuranceIssCommitmentPayableAmount;
    }

    /**
     * Sets the value of the outInsuranceIssCommitmentPayableAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutInsuranceIssCommitmentPayableAmount(BigDecimal value) {
        this.outInsuranceIssCommitmentPayableAmount = value;
    }

    /**
     * Gets the value of the outInsuranceIssCommitmentRenewalDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutInsuranceIssCommitmentRenewalDate() {
        return outInsuranceIssCommitmentRenewalDate;
    }

    /**
     * Sets the value of the outInsuranceIssCommitmentRenewalDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutInsuranceIssCommitmentRenewalDate(XMLGregorianCalendar value) {
        this.outInsuranceIssCommitmentRenewalDate = value;
    }

    /**
     * Gets the value of the outInsuranceIssCommitmentReqCount property.
     * 
     */
    public short getOutInsuranceIssCommitmentReqCount() {
        return outInsuranceIssCommitmentReqCount;
    }

    /**
     * Sets the value of the outInsuranceIssCommitmentReqCount property.
     * 
     */
    public void setOutInsuranceIssCommitmentReqCount(short value) {
        this.outInsuranceIssCommitmentReqCount = value;
    }

    /**
     * Gets the value of the outInsuranceIssCommitmentSaleUser property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutInsuranceIssCommitmentSaleUser() {
        return outInsuranceIssCommitmentSaleUser;
    }

    /**
     * Sets the value of the outInsuranceIssCommitmentSaleUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutInsuranceIssCommitmentSaleUser(String value) {
        this.outInsuranceIssCommitmentSaleUser = value;
    }

    /**
     * Gets the value of the outInsuranceIssCommitmentSecondaryCustId property.
     * 
     */
    public int getOutInsuranceIssCommitmentSecondaryCustId() {
        return outInsuranceIssCommitmentSecondaryCustId;
    }

    /**
     * Sets the value of the outInsuranceIssCommitmentSecondaryCustId property.
     * 
     */
    public void setOutInsuranceIssCommitmentSecondaryCustId(int value) {
        this.outInsuranceIssCommitmentSecondaryCustId = value;
    }

    /**
     * Gets the value of the outInsuranceIssCommitmentServiceProduct property.
     * 
     */
    public int getOutInsuranceIssCommitmentServiceProduct() {
        return outInsuranceIssCommitmentServiceProduct;
    }

    /**
     * Sets the value of the outInsuranceIssCommitmentServiceProduct property.
     * 
     */
    public void setOutInsuranceIssCommitmentServiceProduct(int value) {
        this.outInsuranceIssCommitmentServiceProduct = value;
    }

    /**
     * Gets the value of the outInsuranceIssCommitmentThirdCustId property.
     * 
     */
    public int getOutInsuranceIssCommitmentThirdCustId() {
        return outInsuranceIssCommitmentThirdCustId;
    }

    /**
     * Sets the value of the outInsuranceIssCommitmentThirdCustId property.
     * 
     */
    public void setOutInsuranceIssCommitmentThirdCustId(int value) {
        this.outInsuranceIssCommitmentThirdCustId = value;
    }

    /**
     * Gets the value of the outInsuranceIssCommitmentTpSoIdentifier property.
     * 
     */
    public double getOutInsuranceIssCommitmentTpSoIdentifier() {
        return outInsuranceIssCommitmentTpSoIdentifier;
    }

    /**
     * Sets the value of the outInsuranceIssCommitmentTpSoIdentifier property.
     * 
     */
    public void setOutInsuranceIssCommitmentTpSoIdentifier(double value) {
        this.outInsuranceIssCommitmentTpSoIdentifier = value;
    }

    /**
     * Gets the value of the outInsuranceIssCommitmentTransactSm property.
     * 
     */
    public int getOutInsuranceIssCommitmentTransactSm() {
        return outInsuranceIssCommitmentTransactSm;
    }

    /**
     * Sets the value of the outInsuranceIssCommitmentTransactSm property.
     * 
     */
    public void setOutInsuranceIssCommitmentTransactSm(int value) {
        this.outInsuranceIssCommitmentTransactSm = value;
    }

    /**
     * Gets the value of the outInsuranceIssCommitmentValuePayRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutInsuranceIssCommitmentValuePayRate() {
        return outInsuranceIssCommitmentValuePayRate;
    }

    /**
     * Sets the value of the outInsuranceIssCommitmentValuePayRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutInsuranceIssCommitmentValuePayRate(BigDecimal value) {
        this.outInsuranceIssCommitmentValuePayRate = value;
    }

    /**
     * Gets the value of the outInsuranceIssCommitmentTmstamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutInsuranceIssCommitmentTmstamp() {
        return outInsuranceIssCommitmentTmstamp;
    }

    /**
     * Sets the value of the outInsuranceIssCommitmentTmstamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutInsuranceIssCommitmentTmstamp(XMLGregorianCalendar value) {
        this.outInsuranceIssCommitmentTmstamp = value;
    }

    /**
     * Gets the value of the outInsuranceProfitsAccountAccountCd property.
     * 
     */
    public short getOutInsuranceProfitsAccountAccountCd() {
        return outInsuranceProfitsAccountAccountCd;
    }

    /**
     * Sets the value of the outInsuranceProfitsAccountAccountCd property.
     * 
     */
    public void setOutInsuranceProfitsAccountAccountCd(short value) {
        this.outInsuranceProfitsAccountAccountCd = value;
    }

    /**
     * Gets the value of the outInsuranceProfitsAccountAccountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutInsuranceProfitsAccountAccountNumber() {
        return outInsuranceProfitsAccountAccountNumber;
    }

    /**
     * Sets the value of the outInsuranceProfitsAccountAccountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutInsuranceProfitsAccountAccountNumber(String value) {
        this.outInsuranceProfitsAccountAccountNumber = value;
    }

    /**
     * Gets the value of the outIssCommitmentAppApprDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutIssCommitmentAppApprDate() {
        return outIssCommitmentAppApprDate;
    }

    /**
     * Sets the value of the outIssCommitmentAppApprDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutIssCommitmentAppApprDate(XMLGregorianCalendar value) {
        this.outIssCommitmentAppApprDate = value;
    }

    /**
     * Gets the value of the outIssCommitmentAppApprUser property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutIssCommitmentAppApprUser() {
        return outIssCommitmentAppApprUser;
    }

    /**
     * Sets the value of the outIssCommitmentAppApprUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutIssCommitmentAppApprUser(String value) {
        this.outIssCommitmentAppApprUser = value;
    }

    /**
     * Gets the value of the outIssCommitmentAppDocId property.
     * 
     */
    public int getOutIssCommitmentAppDocId() {
        return outIssCommitmentAppDocId;
    }

    /**
     * Sets the value of the outIssCommitmentAppDocId property.
     * 
     */
    public void setOutIssCommitmentAppDocId(int value) {
        this.outIssCommitmentAppDocId = value;
    }

    /**
     * Gets the value of the outIssCommitmentAppEntryStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutIssCommitmentAppEntryStatus() {
        return outIssCommitmentAppEntryStatus;
    }

    /**
     * Sets the value of the outIssCommitmentAppEntryStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutIssCommitmentAppEntryStatus(String value) {
        this.outIssCommitmentAppEntryStatus = value;
    }

    /**
     * Gets the value of the outIssCommitmentAppIdAppr property.
     * 
     */
    public int getOutIssCommitmentAppIdAppr() {
        return outIssCommitmentAppIdAppr;
    }

    /**
     * Sets the value of the outIssCommitmentAppIdAppr property.
     * 
     */
    public void setOutIssCommitmentAppIdAppr(int value) {
        this.outIssCommitmentAppIdAppr = value;
    }

    /**
     * Gets the value of the outIssCommitmentAppTpSoIdentifier property.
     * 
     */
    public double getOutIssCommitmentAppTpSoIdentifier() {
        return outIssCommitmentAppTpSoIdentifier;
    }

    /**
     * Sets the value of the outIssCommitmentAppTpSoIdentifier property.
     * 
     */
    public void setOutIssCommitmentAppTpSoIdentifier(double value) {
        this.outIssCommitmentAppTpSoIdentifier = value;
    }

    /**
     * Gets the value of the outIssPremiumCalcAddInstalmAmnt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutIssPremiumCalcAddInstalmAmnt() {
        return outIssPremiumCalcAddInstalmAmnt;
    }

    /**
     * Sets the value of the outIssPremiumCalcAddInstalmAmnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutIssPremiumCalcAddInstalmAmnt(BigDecimal value) {
        this.outIssPremiumCalcAddInstalmAmnt = value;
    }

    /**
     * Gets the value of the outIssPremiumCalcAnnualPremium property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutIssPremiumCalcAnnualPremium() {
        return outIssPremiumCalcAnnualPremium;
    }

    /**
     * Sets the value of the outIssPremiumCalcAnnualPremium property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutIssPremiumCalcAnnualPremium(BigDecimal value) {
        this.outIssPremiumCalcAnnualPremium = value;
    }

    /**
     * Gets the value of the outIssPremiumCalcDailyPremium property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutIssPremiumCalcDailyPremium() {
        return outIssPremiumCalcDailyPremium;
    }

    /**
     * Sets the value of the outIssPremiumCalcDailyPremium property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutIssPremiumCalcDailyPremium(BigDecimal value) {
        this.outIssPremiumCalcDailyPremium = value;
    }

    /**
     * Gets the value of the outIssPremiumCalcLoadingAmnt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutIssPremiumCalcLoadingAmnt() {
        return outIssPremiumCalcLoadingAmnt;
    }

    /**
     * Sets the value of the outIssPremiumCalcLoadingAmnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutIssPremiumCalcLoadingAmnt(BigDecimal value) {
        this.outIssPremiumCalcLoadingAmnt = value;
    }

    /**
     * Gets the value of the outIssPremiumCalcMonthlyPremium property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutIssPremiumCalcMonthlyPremium() {
        return outIssPremiumCalcMonthlyPremium;
    }

    /**
     * Sets the value of the outIssPremiumCalcMonthlyPremium property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutIssPremiumCalcMonthlyPremium(BigDecimal value) {
        this.outIssPremiumCalcMonthlyPremium = value;
    }

    /**
     * Gets the value of the outIssPremiumCalcProrataPremium property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutIssPremiumCalcProrataPremium() {
        return outIssPremiumCalcProrataPremium;
    }

    /**
     * Sets the value of the outIssPremiumCalcProrataPremium property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutIssPremiumCalcProrataPremium(BigDecimal value) {
        this.outIssPremiumCalcProrataPremium = value;
    }

    /**
     * Gets the value of the outIssPremiumCalcRemainingAmnt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutIssPremiumCalcRemainingAmnt() {
        return outIssPremiumCalcRemainingAmnt;
    }

    /**
     * Sets the value of the outIssPremiumCalcRemainingAmnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutIssPremiumCalcRemainingAmnt(BigDecimal value) {
        this.outIssPremiumCalcRemainingAmnt = value;
    }

    /**
     * Gets the value of the outIssProdDocIssProdDocDescr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutIssProdDocIssProdDocDescr() {
        return outIssProdDocIssProdDocDescr;
    }

    /**
     * Sets the value of the outIssProdDocIssProdDocDescr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutIssProdDocIssProdDocDescr(String value) {
        this.outIssProdDocIssProdDocDescr = value;
    }

    /**
     * Gets the value of the outIssProdDocIssProdDocId property.
     * 
     */
    public int getOutIssProdDocIssProdDocId() {
        return outIssProdDocIssProdDocId;
    }

    /**
     * Sets the value of the outIssProdDocIssProdDocId property.
     * 
     */
    public void setOutIssProdDocIssProdDocId(int value) {
        this.outIssProdDocIssProdDocId = value;
    }

    /**
     * Gets the value of the outIssProdDocIssProdDocProduct property.
     * 
     */
    public int getOutIssProdDocIssProdDocProduct() {
        return outIssProdDocIssProdDocProduct;
    }

    /**
     * Sets the value of the outIssProdDocIssProdDocProduct property.
     * 
     */
    public void setOutIssProdDocIssProdDocProduct(int value) {
        this.outIssProdDocIssProdDocProduct = value;
    }

    /**
     * Gets the value of the outIssuProdCustDefaultInd property.
     * 
     */
    public short getOutIssuProdCustDefaultInd() {
        return outIssuProdCustDefaultInd;
    }

    /**
     * Sets the value of the outIssuProdCustDefaultInd property.
     * 
     */
    public void setOutIssuProdCustDefaultInd(short value) {
        this.outIssuProdCustDefaultInd = value;
    }

    /**
     * Gets the value of the outIssuProdDetSrcFieldName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutIssuProdDetSrcFieldName() {
        return outIssuProdDetSrcFieldName;
    }

    /**
     * Sets the value of the outIssuProdDetSrcFieldName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutIssuProdDetSrcFieldName(String value) {
        this.outIssuProdDetSrcFieldName = value;
    }

    /**
     * Gets the value of the outIssuProdDetSrcId property.
     * 
     */
    public int getOutIssuProdDetSrcId() {
        return outIssuProdDetSrcId;
    }

    /**
     * Sets the value of the outIssuProdDetSrcId property.
     * 
     */
    public void setOutIssuProdDetSrcId(int value) {
        this.outIssuProdDetSrcId = value;
    }

    /**
     * Gets the value of the outIssuanceCreditCardFlg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutIssuanceCreditCardFlg() {
        return outIssuanceCreditCardFlg;
    }

    /**
     * Sets the value of the outIssuanceCreditCardFlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutIssuanceCreditCardFlg(String value) {
        this.outIssuanceCreditCardFlg = value;
    }

    /**
     * Gets the value of the outIssuanceFixAmnPay property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutIssuanceFixAmnPay() {
        return outIssuanceFixAmnPay;
    }

    /**
     * Sets the value of the outIssuanceFixAmnPay property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutIssuanceFixAmnPay(BigDecimal value) {
        this.outIssuanceFixAmnPay = value;
    }

    /**
     * Gets the value of the outIssuanceGradAppOnceConfirm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutIssuanceGradAppOnceConfirm() {
        return outIssuanceGradAppOnceConfirm;
    }

    /**
     * Sets the value of the outIssuanceGradAppOnceConfirm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutIssuanceGradAppOnceConfirm(String value) {
        this.outIssuanceGradAppOnceConfirm = value;
    }

    /**
     * Gets the value of the outIssuanceGradAppOnceExpense property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutIssuanceGradAppOnceExpense() {
        return outIssuanceGradAppOnceExpense;
    }

    /**
     * Sets the value of the outIssuanceGradAppOnceExpense property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutIssuanceGradAppOnceExpense(String value) {
        this.outIssuanceGradAppOnceExpense = value;
    }

    /**
     * Gets the value of the outIssuanceInvoiceProduct property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutIssuanceInvoiceProduct() {
        return outIssuanceInvoiceProduct;
    }

    /**
     * Sets the value of the outIssuanceInvoiceProduct property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutIssuanceInvoiceProduct(String value) {
        this.outIssuanceInvoiceProduct = value;
    }

    /**
     * Gets the value of the outIssuanceLoanAccUntermRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutIssuanceLoanAccUntermRate() {
        return outIssuanceLoanAccUntermRate;
    }

    /**
     * Sets the value of the outIssuanceLoanAccUntermRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutIssuanceLoanAccUntermRate(BigDecimal value) {
        this.outIssuanceLoanAccUntermRate = value;
    }

    /**
     * Gets the value of the outIssuanceLoanExistence property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutIssuanceLoanExistence() {
        return outIssuanceLoanExistence;
    }

    /**
     * Sets the value of the outIssuanceLoanExistence property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutIssuanceLoanExistence(String value) {
        this.outIssuanceLoanExistence = value;
    }

    /**
     * Gets the value of the outIssuanceMaxAttempts property.
     * 
     */
    public int getOutIssuanceMaxAttempts() {
        return outIssuanceMaxAttempts;
    }

    /**
     * Sets the value of the outIssuanceMaxAttempts property.
     * 
     */
    public void setOutIssuanceMaxAttempts(int value) {
        this.outIssuanceMaxAttempts = value;
    }

    /**
     * Gets the value of the outIssuanceMaxRetries property.
     * 
     */
    public int getOutIssuanceMaxRetries() {
        return outIssuanceMaxRetries;
    }

    /**
     * Sets the value of the outIssuanceMaxRetries property.
     * 
     */
    public void setOutIssuanceMaxRetries(int value) {
        this.outIssuanceMaxRetries = value;
    }

    /**
     * Gets the value of the outIssuanceProdType property.
     * 
     */
    public short getOutIssuanceProdType() {
        return outIssuanceProdType;
    }

    /**
     * Sets the value of the outIssuanceProdType property.
     * 
     */
    public void setOutIssuanceProdType(short value) {
        this.outIssuanceProdType = value;
    }

    /**
     * Gets the value of the outIssuanceValuePayRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutIssuanceValuePayRate() {
        return outIssuanceValuePayRate;
    }

    /**
     * Sets the value of the outIssuanceValuePayRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutIssuanceValuePayRate(BigDecimal value) {
        this.outIssuanceValuePayRate = value;
    }

    /**
     * Gets the value of the outLoanProfitsAccountAccountCd property.
     * 
     */
    public short getOutLoanProfitsAccountAccountCd() {
        return outLoanProfitsAccountAccountCd;
    }

    /**
     * Sets the value of the outLoanProfitsAccountAccountCd property.
     * 
     */
    public void setOutLoanProfitsAccountAccountCd(short value) {
        this.outLoanProfitsAccountAccountCd = value;
    }

    /**
     * Gets the value of the outLoanProfitsAccountAccountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutLoanProfitsAccountAccountNumber() {
        return outLoanProfitsAccountAccountNumber;
    }

    /**
     * Sets the value of the outLoanProfitsAccountAccountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutLoanProfitsAccountAccountNumber(String value) {
        this.outLoanProfitsAccountAccountNumber = value;
    }

    /**
     * Gets the value of the outLoanProfitsAccountLnsOpenUnit property.
     * 
     */
    public int getOutLoanProfitsAccountLnsOpenUnit() {
        return outLoanProfitsAccountLnsOpenUnit;
    }

    /**
     * Sets the value of the outLoanProfitsAccountLnsOpenUnit property.
     * 
     */
    public void setOutLoanProfitsAccountLnsOpenUnit(int value) {
        this.outLoanProfitsAccountLnsOpenUnit = value;
    }

    /**
     * Gets the value of the outLoanProfitsAccountLnsSn property.
     * 
     */
    public int getOutLoanProfitsAccountLnsSn() {
        return outLoanProfitsAccountLnsSn;
    }

    /**
     * Sets the value of the outLoanProfitsAccountLnsSn property.
     * 
     */
    public void setOutLoanProfitsAccountLnsSn(int value) {
        this.outLoanProfitsAccountLnsSn = value;
    }

    /**
     * Gets the value of the outLoanProfitsAccountLnsType property.
     * 
     */
    public short getOutLoanProfitsAccountLnsType() {
        return outLoanProfitsAccountLnsType;
    }

    /**
     * Sets the value of the outLoanProfitsAccountLnsType property.
     * 
     */
    public void setOutLoanProfitsAccountLnsType(short value) {
        this.outLoanProfitsAccountLnsType = value;
    }

    /**
     * Gets the value of the outPackageIdPackage property.
     * 
     */
    public int getOutPackageIdPackage() {
        return outPackageIdPackage;
    }

    /**
     * Sets the value of the outPackageIdPackage property.
     * 
     */
    public void setOutPackageIdPackage(int value) {
        this.outPackageIdPackage = value;
    }

    /**
     * Gets the value of the outPackagePackageDescr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutPackagePackageDescr() {
        return outPackagePackageDescr;
    }

    /**
     * Sets the value of the outPackagePackageDescr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutPackagePackageDescr(String value) {
        this.outPackagePackageDescr = value;
    }

    /**
     * Gets the value of the outPersonProfitsAccountAccountCd property.
     * 
     */
    public short getOutPersonProfitsAccountAccountCd() {
        return outPersonProfitsAccountAccountCd;
    }

    /**
     * Sets the value of the outPersonProfitsAccountAccountCd property.
     * 
     */
    public void setOutPersonProfitsAccountAccountCd(short value) {
        this.outPersonProfitsAccountAccountCd = value;
    }

    /**
     * Gets the value of the outPersonProfitsAccountAccountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutPersonProfitsAccountAccountNumber() {
        return outPersonProfitsAccountAccountNumber;
    }

    /**
     * Sets the value of the outPersonProfitsAccountAccountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutPersonProfitsAccountAccountNumber(String value) {
        this.outPersonProfitsAccountAccountNumber = value;
    }

    /**
     * Gets the value of the outResponsibleUnitUnitCode property.
     * 
     */
    public int getOutResponsibleUnitUnitCode() {
        return outResponsibleUnitUnitCode;
    }

    /**
     * Sets the value of the outResponsibleUnitUnitCode property.
     * 
     */
    public void setOutResponsibleUnitUnitCode(int value) {
        this.outResponsibleUnitUnitCode = value;
    }

    /**
     * Gets the value of the outResponsibleUnitUnitUnitName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutResponsibleUnitUnitUnitName() {
        return outResponsibleUnitUnitUnitName;
    }

    /**
     * Sets the value of the outResponsibleUnitUnitUnitName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutResponsibleUnitUnitUnitName(String value) {
        this.outResponsibleUnitUnitUnitName = value;
    }

    /**
     * Gets the value of the outRmUsrBankemployeeLastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutRmUsrBankemployeeLastName() {
        return outRmUsrBankemployeeLastName;
    }

    /**
     * Sets the value of the outRmUsrBankemployeeLastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutRmUsrBankemployeeLastName(String value) {
        this.outRmUsrBankemployeeLastName = value;
    }

    /**
     * Gets the value of the outSaleBankemployeeFirstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSaleBankemployeeFirstName() {
        return outSaleBankemployeeFirstName;
    }

    /**
     * Sets the value of the outSaleBankemployeeFirstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSaleBankemployeeFirstName(String value) {
        this.outSaleBankemployeeFirstName = value;
    }

    /**
     * Gets the value of the outSaleBankemployeeLastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSaleBankemployeeLastName() {
        return outSaleBankemployeeLastName;
    }

    /**
     * Sets the value of the outSaleBankemployeeLastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSaleBankemployeeLastName(String value) {
        this.outSaleBankemployeeLastName = value;
    }

    /**
     * Gets the value of the outServiceProductProductDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutServiceProductProductDescription() {
        return outServiceProductProductDescription;
    }

    /**
     * Sets the value of the outServiceProductProductDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutServiceProductProductDescription(String value) {
        this.outServiceProductProductDescription = value;
    }

    /**
     * Gets the value of the outSogecapCounterIssCommitmentTpSoIdentifier property.
     * 
     */
    public double getOutSogecapCounterIssCommitmentTpSoIdentifier() {
        return outSogecapCounterIssCommitmentTpSoIdentifier;
    }

    /**
     * Sets the value of the outSogecapCounterIssCommitmentTpSoIdentifier property.
     * 
     */
    public void setOutSogecapCounterIssCommitmentTpSoIdentifier(double value) {
        this.outSogecapCounterIssCommitmentTpSoIdentifier = value;
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
     * Gets the value of the outTheftCatGenericDetailDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutTheftCatGenericDetailDescription() {
        return outTheftCatGenericDetailDescription;
    }

    /**
     * Sets the value of the outTheftCatGenericDetailDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutTheftCatGenericDetailDescription(String value) {
        this.outTheftCatGenericDetailDescription = value;
    }

    /**
     * Gets the value of the outUpdateUsrBankemployeeLastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutUpdateUsrBankemployeeLastName() {
        return outUpdateUsrBankemployeeLastName;
    }

    /**
     * Sets the value of the outUpdateUsrBankemployeeLastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutUpdateUsrBankemployeeLastName(String value) {
        this.outUpdateUsrBankemployeeLastName = value;
    }

    /**
     * Gets the value of the outCoinsuredGrp property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfOutCoinsuredGrpOutCoinsuredGrmIssCommitmentCoinsItem }
     *     
     */
    public ArrayOfOutCoinsuredGrpOutCoinsuredGrmIssCommitmentCoinsItem getOutCoinsuredGrp() {
        return outCoinsuredGrp;
    }

    /**
     * Sets the value of the outCoinsuredGrp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfOutCoinsuredGrpOutCoinsuredGrmIssCommitmentCoinsItem }
     *     
     */
    public void setOutCoinsuredGrp(ArrayOfOutCoinsuredGrpOutCoinsuredGrmIssCommitmentCoinsItem value) {
        this.outCoinsuredGrp = value;
    }

    /**
     * Gets the value of the outFailureDetailsKeyval1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutFailureDetailsKeyval1() {
        return outFailureDetailsKeyval1;
    }

    /**
     * Sets the value of the outFailureDetailsKeyval1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutFailureDetailsKeyval1(String value) {
        this.outFailureDetailsKeyval1 = value;
    }

    /**
     * Gets the value of the outFailureDetailsKeyval2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutFailureDetailsKeyval2() {
        return outFailureDetailsKeyval2;
    }

    /**
     * Sets the value of the outFailureDetailsKeyval2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutFailureDetailsKeyval2(String value) {
        this.outFailureDetailsKeyval2 = value;
    }

    /**
     * Gets the value of the outFailureDetailsKeyval3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutFailureDetailsKeyval3() {
        return outFailureDetailsKeyval3;
    }

    /**
     * Sets the value of the outFailureDetailsKeyval3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutFailureDetailsKeyval3(String value) {
        this.outFailureDetailsKeyval3 = value;
    }

    /**
     * Gets the value of the outFailureDetailsComment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutFailureDetailsComment() {
        return outFailureDetailsComment;
    }

    /**
     * Sets the value of the outFailureDetailsComment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutFailureDetailsComment(String value) {
        this.outFailureDetailsComment = value;
    }

    /**
     * Gets the value of the outInsuranceValueCurrencyIdCurrency property.
     * 
     */
    public int getOutInsuranceValueCurrencyIdCurrency() {
        return outInsuranceValueCurrencyIdCurrency;
    }

    /**
     * Sets the value of the outInsuranceValueCurrencyIdCurrency property.
     * 
     */
    public void setOutInsuranceValueCurrencyIdCurrency(int value) {
        this.outInsuranceValueCurrencyIdCurrency = value;
    }

    /**
     * Gets the value of the outInsuranceValueCurrencyShortDescr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutInsuranceValueCurrencyShortDescr() {
        return outInsuranceValueCurrencyShortDescr;
    }

    /**
     * Sets the value of the outInsuranceValueCurrencyShortDescr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutInsuranceValueCurrencyShortDescr(String value) {
        this.outInsuranceValueCurrencyShortDescr = value;
    }

    /**
     * Gets the value of the outInsuranceIssCommitmentCalculationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutInsuranceIssCommitmentCalculationDate() {
        return outInsuranceIssCommitmentCalculationDate;
    }

    /**
     * Sets the value of the outInsuranceIssCommitmentCalculationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutInsuranceIssCommitmentCalculationDate(XMLGregorianCalendar value) {
        this.outInsuranceIssCommitmentCalculationDate = value;
    }

}
