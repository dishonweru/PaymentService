
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for T2151VInsuranceCommitmentMaintenanceImport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="T2151VInsuranceCommitmentMaintenanceImport">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}BaseImport">
 *       &lt;sequence>
 *         &lt;element name="Command" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCustomerCatGenericDetailDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCustomerCatGenericDetailParameterType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCustomerCatGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InDrCustomerCustomerCDigit" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InDrCustomerCustomerCustId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InDrCustomerCustomerDateOfBirth" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InDrCustomerCustomerMobileTel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InDrCustomerCustomerSurname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InDrCustomerCustomerTelephone1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InHousetypCatGenericDetailDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InHousetypCatGenericDetailParameterType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InHousetypCatGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InHousingDetailsAddress1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InHousingDetailsAddress2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InHousingDetailsCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InHousingDetailsFloor" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InHousingDetailsHouseType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InHousingDetailsHouseUse" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InHousingDetailsNoFloors" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InHousingDetailsPartailComments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InHousingDetailsPartial" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InHousingDetailsRoof" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InHousingDetailsSkeleton" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InHousingDetailsSquare" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InHousingDetailsUseBasement" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InHousingDetailsUseFloor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InHousingDetailsUseGroundFloor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InHousingDetailsWale" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InHousingDetailsZipCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InHousingDtlsIssHousingDetailsAddress1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InHousingDtlsIssHousingDetailsAddress2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InHousingDtlsIssHousingDetailsBlockAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InHousingDtlsIssHousingDetailsBlockAmount2" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InHousingDtlsIssHousingDetailsBlockAmount3" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InHousingDtlsIssHousingDetailsCancelledContr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InHousingDtlsIssHousingDetailsCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InHousingDtlsIssHousingDetailsConstrDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InHousingDtlsIssHousingDetailsContrComments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InHousingDtlsIssHousingDetailsDamageInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InHousingDtlsIssHousingDetailsEarthquakeCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InHousingDtlsIssHousingDetailsFloor" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InHousingDtlsIssHousingDetailsHouseType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InHousingDtlsIssHousingDetailsHouseUse" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InHousingDtlsIssHousingDetailsHsIssuanceAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InHousingDtlsIssHousingDetailsHsIssuanceCapital" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InHousingDtlsIssHousingDetailsLnsAccCd2" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InHousingDtlsIssHousingDetailsLnsAccCd3" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InHousingDtlsIssHousingDetailsLnsAccSn2" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InHousingDtlsIssHousingDetailsLnsAccSn3" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InHousingDtlsIssHousingDetailsLnsAccType2" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InHousingDtlsIssHousingDetailsLnsAccType3" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InHousingDtlsIssHousingDetailsLnsAccUnit2" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InHousingDtlsIssHousingDetailsLnsAccUnit3" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InHousingDtlsIssHousingDetailsLoanAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InHousingDtlsIssHousingDetailsLoanAmount2" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InHousingDtlsIssHousingDetailsLoanAmount3" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InHousingDtlsIssHousingDetailsLoanExpDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InHousingDtlsIssHousingDetailsLoanExpDt2" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InHousingDtlsIssHousingDetailsLoanExpDt3" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InHousingDtlsIssHousingDetailsNoFloors" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InHousingDtlsIssHousingDetailsOtherCustComment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InHousingDtlsIssHousingDetailsOtherCustInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InHousingDtlsIssHousingDetailsPartial" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InHousingDtlsIssHousingDetailsPartialComments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InHousingDtlsIssHousingDetailsRoof" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InHousingDtlsIssHousingDetailsSkeleton" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InHousingDtlsIssHousingDetailsSquere" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InHousingDtlsIssHousingDetailsTpSoIdentifier" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="InHousingDtlsIssHousingDetailsUseBasement" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InHousingDtlsIssHousingDetailsUseFloor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InHousingDtlsIssHousingDetailsUseGround" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InHousingDtlsIssHousingDetailsWale" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InHousingDtlsIssHousingDetailsZipCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InInsuranceProductIssCommitmentActivationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InInsuranceProductIssCommitmentCancelationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InInsuranceProductIssCommitmentChargeAmnPerPay" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InInsuranceProductIssCommitmentChargeMethod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InInsuranceProductIssCommitmentComments1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InInsuranceProductIssCommitmentComments2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InInsuranceProductIssCommitmentCoverRatio" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InInsuranceProductIssCommitmentCrAccCustomerId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InInsuranceProductIssCommitmentCrDepAccount" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="InInsuranceProductIssCommitmentCreditCardNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InInsuranceProductIssCommitmentDrAccCustomerId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InInsuranceProductIssCommitmentEntryStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InInsuranceProductIssCommitmentExpirationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InInsuranceProductIssCommitmentFinalizeDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InInsuranceProductIssCommitmentFixAmnPay" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InInsuranceProductIssCommitmentFkAccCd" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InInsuranceProductIssCommitmentFkAccSn" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InInsuranceProductIssCommitmentFkAccType" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InInsuranceProductIssCommitmentFkAccUnit" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InInsuranceProductIssCommitmentFkCategory" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InInsuranceProductIssCommitmentFkCnlUsr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InInsuranceProductIssCommitmentFkDebitAccount" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="InInsuranceProductIssCommitmentFkFinalizeUsr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InInsuranceProductIssCommitmentFkGenDetSerNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InInsuranceProductIssCommitmentFkGenericHeadpar" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InInsuranceProductIssCommitmentFkResponsibleUnit" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InInsuranceProductIssCommitmentFkUpdUsr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InInsuranceProductIssCommitmentFrequency" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InInsuranceProductIssCommitmentFrequencyUnit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InInsuranceProductIssCommitmentGradAppExpRatio" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InInsuranceProductIssCommitmentInsuranceValue" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InInsuranceProductIssCommitmentIssuanceNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InInsuranceProductIssCommitmentIssueDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InInsuranceProductIssCommitmentIssueType" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InInsuranceProductIssCommitmentLastUpdateDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InInsuranceProductIssCommitmentLoadingCalc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InInsuranceProductIssCommitmentLoanAccUntermRa" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InInsuranceProductIssCommitmentLoanInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InInsuranceProductIssCommitmentMainTpSoId" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="InInsuranceProductIssCommitmentMaxNumberAttempts" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InInsuranceProductIssCommitmentNumberOfAttempts" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InInsuranceProductIssCommitmentOnceOnlyCharge" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InInsuranceProductIssCommitmentOtherOutstBal" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InInsuranceProductIssCommitmentPayableAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InInsuranceProductIssCommitmentPEntryStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InInsuranceProductIssCommitmentReinstatementVal" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InInsuranceProductIssCommitmentRenewalDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InInsuranceProductIssCommitmentReqCount" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InInsuranceProductIssCommitmentSaleUser" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InInsuranceProductIssCommitmentSecondaryCustId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InInsuranceProductIssCommitmentServiceProduct" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InInsuranceProductIssCommitmentThirdCustId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InInsuranceProductIssCommitmentTpSoIdentifier" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="InInsuranceProductIssCommitmentTransactSm" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InInsuranceProductIssCommitmentValuePayRate" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InInsuranceProductIssCommitmentTmstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InIssComitmentAprIssCommitmentAppApprDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InIssComitmentAprIssCommitmentAppApprUser" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InIssComitmentAprIssCommitmentAppDocId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InIssComitmentAprIssCommitmentAppEntryStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InIssComitmentAprIssCommitmentAppTpSoIdentifier" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="InPackageIdPackage" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InProxyCommandIefSuppliedCommand" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InTheftCodeGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InUpdDamgsIssDamageDtlDamageAmnt" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InUpdDamgsIssDamageDtlReplaced" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InUpdDamgsIssDamageDtlTpSoIdentifier" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="InUpdDamgsIssDamageDtlTypeCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InUpdDamgsIssDamageDtlYear" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InLoanAccProfitsAccountAccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InLoanAccProfitsAccountAccountCd" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InLoanAccProfitsAccountPrftSystem" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InDepositAccProfitsAccountAccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InDepositAccProfitsAccountAccountCd" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InDepositAccProfitsAccountPrftSystem" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InCrDepProfitsAccountAccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCrDepProfitsAccountAccountCd" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InCrDepProfitsAccountPrftSystem" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InCoinsuredGrp" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}ArrayOfInCoinsuredGrpInCoinsuredGrmIssCommitmentCoinsItem" minOccurs="0"/>
 *         &lt;element name="InInsuranceProductIssCommitmentFkInsurValCurr" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InInsuranceAmountCurrencyIdCurrency" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InInsuranceAmountCurrencyShortDescr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InInsuranceAmountCurrencyIsoCode" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InPrftTransactionIdTransact" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InInsuranceProductIssCommitmentCalculationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "T2151VInsuranceCommitmentMaintenanceImport", propOrder = {
    "command",
    "inCustomerCatGenericDetailDescription",
    "inCustomerCatGenericDetailParameterType",
    "inCustomerCatGenericDetailSerialNum",
    "inDrCustomerCustomerCDigit",
    "inDrCustomerCustomerCustId",
    "inDrCustomerCustomerDateOfBirth",
    "inDrCustomerCustomerMobileTel",
    "inDrCustomerCustomerSurname",
    "inDrCustomerCustomerTelephone1",
    "inHousetypCatGenericDetailDescription",
    "inHousetypCatGenericDetailParameterType",
    "inHousetypCatGenericDetailSerialNum",
    "inHousingDetailsAddress1",
    "inHousingDetailsAddress2",
    "inHousingDetailsCity",
    "inHousingDetailsFloor",
    "inHousingDetailsHouseType",
    "inHousingDetailsHouseUse",
    "inHousingDetailsNoFloors",
    "inHousingDetailsPartailComments",
    "inHousingDetailsPartial",
    "inHousingDetailsRoof",
    "inHousingDetailsSkeleton",
    "inHousingDetailsSquare",
    "inHousingDetailsUseBasement",
    "inHousingDetailsUseFloor",
    "inHousingDetailsUseGroundFloor",
    "inHousingDetailsWale",
    "inHousingDetailsZipCode",
    "inHousingDtlsIssHousingDetailsAddress1",
    "inHousingDtlsIssHousingDetailsAddress2",
    "inHousingDtlsIssHousingDetailsBlockAmount",
    "inHousingDtlsIssHousingDetailsBlockAmount2",
    "inHousingDtlsIssHousingDetailsBlockAmount3",
    "inHousingDtlsIssHousingDetailsCancelledContr",
    "inHousingDtlsIssHousingDetailsCity",
    "inHousingDtlsIssHousingDetailsConstrDate",
    "inHousingDtlsIssHousingDetailsContrComments",
    "inHousingDtlsIssHousingDetailsDamageInd",
    "inHousingDtlsIssHousingDetailsEarthquakeCode",
    "inHousingDtlsIssHousingDetailsFloor",
    "inHousingDtlsIssHousingDetailsHouseType",
    "inHousingDtlsIssHousingDetailsHouseUse",
    "inHousingDtlsIssHousingDetailsHsIssuanceAmount",
    "inHousingDtlsIssHousingDetailsHsIssuanceCapital",
    "inHousingDtlsIssHousingDetailsLnsAccCd2",
    "inHousingDtlsIssHousingDetailsLnsAccCd3",
    "inHousingDtlsIssHousingDetailsLnsAccSn2",
    "inHousingDtlsIssHousingDetailsLnsAccSn3",
    "inHousingDtlsIssHousingDetailsLnsAccType2",
    "inHousingDtlsIssHousingDetailsLnsAccType3",
    "inHousingDtlsIssHousingDetailsLnsAccUnit2",
    "inHousingDtlsIssHousingDetailsLnsAccUnit3",
    "inHousingDtlsIssHousingDetailsLoanAmount",
    "inHousingDtlsIssHousingDetailsLoanAmount2",
    "inHousingDtlsIssHousingDetailsLoanAmount3",
    "inHousingDtlsIssHousingDetailsLoanExpDt",
    "inHousingDtlsIssHousingDetailsLoanExpDt2",
    "inHousingDtlsIssHousingDetailsLoanExpDt3",
    "inHousingDtlsIssHousingDetailsNoFloors",
    "inHousingDtlsIssHousingDetailsOtherCustComment",
    "inHousingDtlsIssHousingDetailsOtherCustInd",
    "inHousingDtlsIssHousingDetailsPartial",
    "inHousingDtlsIssHousingDetailsPartialComments",
    "inHousingDtlsIssHousingDetailsRoof",
    "inHousingDtlsIssHousingDetailsSkeleton",
    "inHousingDtlsIssHousingDetailsSquere",
    "inHousingDtlsIssHousingDetailsTpSoIdentifier",
    "inHousingDtlsIssHousingDetailsUseBasement",
    "inHousingDtlsIssHousingDetailsUseFloor",
    "inHousingDtlsIssHousingDetailsUseGround",
    "inHousingDtlsIssHousingDetailsWale",
    "inHousingDtlsIssHousingDetailsZipCode",
    "inInsuranceProductIssCommitmentActivationDate",
    "inInsuranceProductIssCommitmentCancelationDate",
    "inInsuranceProductIssCommitmentChargeAmnPerPay",
    "inInsuranceProductIssCommitmentChargeMethod",
    "inInsuranceProductIssCommitmentComments1",
    "inInsuranceProductIssCommitmentComments2",
    "inInsuranceProductIssCommitmentCoverRatio",
    "inInsuranceProductIssCommitmentCrAccCustomerId",
    "inInsuranceProductIssCommitmentCrDepAccount",
    "inInsuranceProductIssCommitmentCreditCardNo",
    "inInsuranceProductIssCommitmentDrAccCustomerId",
    "inInsuranceProductIssCommitmentEntryStatus",
    "inInsuranceProductIssCommitmentExpirationDate",
    "inInsuranceProductIssCommitmentFinalizeDate",
    "inInsuranceProductIssCommitmentFixAmnPay",
    "inInsuranceProductIssCommitmentFkAccCd",
    "inInsuranceProductIssCommitmentFkAccSn",
    "inInsuranceProductIssCommitmentFkAccType",
    "inInsuranceProductIssCommitmentFkAccUnit",
    "inInsuranceProductIssCommitmentFkCategory",
    "inInsuranceProductIssCommitmentFkCnlUsr",
    "inInsuranceProductIssCommitmentFkDebitAccount",
    "inInsuranceProductIssCommitmentFkFinalizeUsr",
    "inInsuranceProductIssCommitmentFkGenDetSerNum",
    "inInsuranceProductIssCommitmentFkGenericHeadpar",
    "inInsuranceProductIssCommitmentFkResponsibleUnit",
    "inInsuranceProductIssCommitmentFkUpdUsr",
    "inInsuranceProductIssCommitmentFrequency",
    "inInsuranceProductIssCommitmentFrequencyUnit",
    "inInsuranceProductIssCommitmentGradAppExpRatio",
    "inInsuranceProductIssCommitmentInsuranceValue",
    "inInsuranceProductIssCommitmentIssuanceNumber",
    "inInsuranceProductIssCommitmentIssueDate",
    "inInsuranceProductIssCommitmentIssueType",
    "inInsuranceProductIssCommitmentLastUpdateDate",
    "inInsuranceProductIssCommitmentLoadingCalc",
    "inInsuranceProductIssCommitmentLoanAccUntermRa",
    "inInsuranceProductIssCommitmentLoanInd",
    "inInsuranceProductIssCommitmentMainTpSoId",
    "inInsuranceProductIssCommitmentMaxNumberAttempts",
    "inInsuranceProductIssCommitmentNumberOfAttempts",
    "inInsuranceProductIssCommitmentOnceOnlyCharge",
    "inInsuranceProductIssCommitmentOtherOutstBal",
    "inInsuranceProductIssCommitmentPayableAmount",
    "inInsuranceProductIssCommitmentPEntryStatus",
    "inInsuranceProductIssCommitmentReinstatementVal",
    "inInsuranceProductIssCommitmentRenewalDate",
    "inInsuranceProductIssCommitmentReqCount",
    "inInsuranceProductIssCommitmentSaleUser",
    "inInsuranceProductIssCommitmentSecondaryCustId",
    "inInsuranceProductIssCommitmentServiceProduct",
    "inInsuranceProductIssCommitmentThirdCustId",
    "inInsuranceProductIssCommitmentTpSoIdentifier",
    "inInsuranceProductIssCommitmentTransactSm",
    "inInsuranceProductIssCommitmentValuePayRate",
    "inInsuranceProductIssCommitmentTmstamp",
    "inIssComitmentAprIssCommitmentAppApprDate",
    "inIssComitmentAprIssCommitmentAppApprUser",
    "inIssComitmentAprIssCommitmentAppDocId",
    "inIssComitmentAprIssCommitmentAppEntryStatus",
    "inIssComitmentAprIssCommitmentAppTpSoIdentifier",
    "inPackageIdPackage",
    "inProxyCommandIefSuppliedCommand",
    "inTheftCodeGenericDetailSerialNum",
    "inUpdDamgsIssDamageDtlDamageAmnt",
    "inUpdDamgsIssDamageDtlReplaced",
    "inUpdDamgsIssDamageDtlTpSoIdentifier",
    "inUpdDamgsIssDamageDtlTypeCode",
    "inUpdDamgsIssDamageDtlYear",
    "inLoanAccProfitsAccountAccountNumber",
    "inLoanAccProfitsAccountAccountCd",
    "inLoanAccProfitsAccountPrftSystem",
    "inDepositAccProfitsAccountAccountNumber",
    "inDepositAccProfitsAccountAccountCd",
    "inDepositAccProfitsAccountPrftSystem",
    "inCrDepProfitsAccountAccountNumber",
    "inCrDepProfitsAccountAccountCd",
    "inCrDepProfitsAccountPrftSystem",
    "inCoinsuredGrp",
    "inInsuranceProductIssCommitmentFkInsurValCurr",
    "inInsuranceAmountCurrencyIdCurrency",
    "inInsuranceAmountCurrencyShortDescr",
    "inInsuranceAmountCurrencyIsoCode",
    "inPrftTransactionIdTransact",
    "inInsuranceProductIssCommitmentCalculationDate"
})
public class T2151VInsuranceCommitmentMaintenanceImport
    extends BaseImport
{

    @XmlElement(name = "Command")
    protected String command;
    @XmlElement(name = "InCustomerCatGenericDetailDescription")
    protected String inCustomerCatGenericDetailDescription;
    @XmlElement(name = "InCustomerCatGenericDetailParameterType")
    protected String inCustomerCatGenericDetailParameterType;
    @XmlElement(name = "InCustomerCatGenericDetailSerialNum")
    protected int inCustomerCatGenericDetailSerialNum;
    @XmlElement(name = "InDrCustomerCustomerCDigit")
    protected short inDrCustomerCustomerCDigit;
    @XmlElement(name = "InDrCustomerCustomerCustId")
    protected int inDrCustomerCustomerCustId;
    @XmlElement(name = "InDrCustomerCustomerDateOfBirth", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inDrCustomerCustomerDateOfBirth;
    @XmlElement(name = "InDrCustomerCustomerMobileTel")
    protected String inDrCustomerCustomerMobileTel;
    @XmlElement(name = "InDrCustomerCustomerSurname")
    protected String inDrCustomerCustomerSurname;
    @XmlElement(name = "InDrCustomerCustomerTelephone1")
    protected String inDrCustomerCustomerTelephone1;
    @XmlElement(name = "InHousetypCatGenericDetailDescription")
    protected String inHousetypCatGenericDetailDescription;
    @XmlElement(name = "InHousetypCatGenericDetailParameterType")
    protected String inHousetypCatGenericDetailParameterType;
    @XmlElement(name = "InHousetypCatGenericDetailSerialNum")
    protected int inHousetypCatGenericDetailSerialNum;
    @XmlElement(name = "InHousingDetailsAddress1")
    protected String inHousingDetailsAddress1;
    @XmlElement(name = "InHousingDetailsAddress2")
    protected String inHousingDetailsAddress2;
    @XmlElement(name = "InHousingDetailsCity")
    protected String inHousingDetailsCity;
    @XmlElement(name = "InHousingDetailsFloor")
    protected short inHousingDetailsFloor;
    @XmlElement(name = "InHousingDetailsHouseType")
    protected int inHousingDetailsHouseType;
    @XmlElement(name = "InHousingDetailsHouseUse")
    protected String inHousingDetailsHouseUse;
    @XmlElement(name = "InHousingDetailsNoFloors")
    protected short inHousingDetailsNoFloors;
    @XmlElement(name = "InHousingDetailsPartailComments")
    protected String inHousingDetailsPartailComments;
    @XmlElement(name = "InHousingDetailsPartial")
    protected String inHousingDetailsPartial;
    @XmlElement(name = "InHousingDetailsRoof")
    protected int inHousingDetailsRoof;
    @XmlElement(name = "InHousingDetailsSkeleton")
    protected int inHousingDetailsSkeleton;
    @XmlElement(name = "InHousingDetailsSquare")
    protected short inHousingDetailsSquare;
    @XmlElement(name = "InHousingDetailsUseBasement")
    protected String inHousingDetailsUseBasement;
    @XmlElement(name = "InHousingDetailsUseFloor")
    protected String inHousingDetailsUseFloor;
    @XmlElement(name = "InHousingDetailsUseGroundFloor")
    protected String inHousingDetailsUseGroundFloor;
    @XmlElement(name = "InHousingDetailsWale")
    protected int inHousingDetailsWale;
    @XmlElement(name = "InHousingDetailsZipCode")
    protected String inHousingDetailsZipCode;
    @XmlElement(name = "InHousingDtlsIssHousingDetailsAddress1")
    protected String inHousingDtlsIssHousingDetailsAddress1;
    @XmlElement(name = "InHousingDtlsIssHousingDetailsAddress2")
    protected String inHousingDtlsIssHousingDetailsAddress2;
    @XmlElement(name = "InHousingDtlsIssHousingDetailsBlockAmount", required = true)
    protected BigDecimal inHousingDtlsIssHousingDetailsBlockAmount;
    @XmlElement(name = "InHousingDtlsIssHousingDetailsBlockAmount2", required = true)
    protected BigDecimal inHousingDtlsIssHousingDetailsBlockAmount2;
    @XmlElement(name = "InHousingDtlsIssHousingDetailsBlockAmount3", required = true)
    protected BigDecimal inHousingDtlsIssHousingDetailsBlockAmount3;
    @XmlElement(name = "InHousingDtlsIssHousingDetailsCancelledContr")
    protected String inHousingDtlsIssHousingDetailsCancelledContr;
    @XmlElement(name = "InHousingDtlsIssHousingDetailsCity")
    protected String inHousingDtlsIssHousingDetailsCity;
    @XmlElement(name = "InHousingDtlsIssHousingDetailsConstrDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inHousingDtlsIssHousingDetailsConstrDate;
    @XmlElement(name = "InHousingDtlsIssHousingDetailsContrComments")
    protected String inHousingDtlsIssHousingDetailsContrComments;
    @XmlElement(name = "InHousingDtlsIssHousingDetailsDamageInd")
    protected String inHousingDtlsIssHousingDetailsDamageInd;
    @XmlElement(name = "InHousingDtlsIssHousingDetailsEarthquakeCode")
    protected int inHousingDtlsIssHousingDetailsEarthquakeCode;
    @XmlElement(name = "InHousingDtlsIssHousingDetailsFloor")
    protected short inHousingDtlsIssHousingDetailsFloor;
    @XmlElement(name = "InHousingDtlsIssHousingDetailsHouseType")
    protected int inHousingDtlsIssHousingDetailsHouseType;
    @XmlElement(name = "InHousingDtlsIssHousingDetailsHouseUse")
    protected String inHousingDtlsIssHousingDetailsHouseUse;
    @XmlElement(name = "InHousingDtlsIssHousingDetailsHsIssuanceAmount", required = true)
    protected BigDecimal inHousingDtlsIssHousingDetailsHsIssuanceAmount;
    @XmlElement(name = "InHousingDtlsIssHousingDetailsHsIssuanceCapital", required = true)
    protected BigDecimal inHousingDtlsIssHousingDetailsHsIssuanceCapital;
    @XmlElement(name = "InHousingDtlsIssHousingDetailsLnsAccCd2")
    protected short inHousingDtlsIssHousingDetailsLnsAccCd2;
    @XmlElement(name = "InHousingDtlsIssHousingDetailsLnsAccCd3")
    protected short inHousingDtlsIssHousingDetailsLnsAccCd3;
    @XmlElement(name = "InHousingDtlsIssHousingDetailsLnsAccSn2")
    protected int inHousingDtlsIssHousingDetailsLnsAccSn2;
    @XmlElement(name = "InHousingDtlsIssHousingDetailsLnsAccSn3")
    protected int inHousingDtlsIssHousingDetailsLnsAccSn3;
    @XmlElement(name = "InHousingDtlsIssHousingDetailsLnsAccType2")
    protected short inHousingDtlsIssHousingDetailsLnsAccType2;
    @XmlElement(name = "InHousingDtlsIssHousingDetailsLnsAccType3")
    protected short inHousingDtlsIssHousingDetailsLnsAccType3;
    @XmlElement(name = "InHousingDtlsIssHousingDetailsLnsAccUnit2")
    protected int inHousingDtlsIssHousingDetailsLnsAccUnit2;
    @XmlElement(name = "InHousingDtlsIssHousingDetailsLnsAccUnit3")
    protected int inHousingDtlsIssHousingDetailsLnsAccUnit3;
    @XmlElement(name = "InHousingDtlsIssHousingDetailsLoanAmount", required = true)
    protected BigDecimal inHousingDtlsIssHousingDetailsLoanAmount;
    @XmlElement(name = "InHousingDtlsIssHousingDetailsLoanAmount2", required = true)
    protected BigDecimal inHousingDtlsIssHousingDetailsLoanAmount2;
    @XmlElement(name = "InHousingDtlsIssHousingDetailsLoanAmount3", required = true)
    protected BigDecimal inHousingDtlsIssHousingDetailsLoanAmount3;
    @XmlElement(name = "InHousingDtlsIssHousingDetailsLoanExpDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inHousingDtlsIssHousingDetailsLoanExpDt;
    @XmlElement(name = "InHousingDtlsIssHousingDetailsLoanExpDt2", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inHousingDtlsIssHousingDetailsLoanExpDt2;
    @XmlElement(name = "InHousingDtlsIssHousingDetailsLoanExpDt3", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inHousingDtlsIssHousingDetailsLoanExpDt3;
    @XmlElement(name = "InHousingDtlsIssHousingDetailsNoFloors")
    protected short inHousingDtlsIssHousingDetailsNoFloors;
    @XmlElement(name = "InHousingDtlsIssHousingDetailsOtherCustComment")
    protected String inHousingDtlsIssHousingDetailsOtherCustComment;
    @XmlElement(name = "InHousingDtlsIssHousingDetailsOtherCustInd")
    protected String inHousingDtlsIssHousingDetailsOtherCustInd;
    @XmlElement(name = "InHousingDtlsIssHousingDetailsPartial")
    protected String inHousingDtlsIssHousingDetailsPartial;
    @XmlElement(name = "InHousingDtlsIssHousingDetailsPartialComments")
    protected String inHousingDtlsIssHousingDetailsPartialComments;
    @XmlElement(name = "InHousingDtlsIssHousingDetailsRoof")
    protected int inHousingDtlsIssHousingDetailsRoof;
    @XmlElement(name = "InHousingDtlsIssHousingDetailsSkeleton")
    protected int inHousingDtlsIssHousingDetailsSkeleton;
    @XmlElement(name = "InHousingDtlsIssHousingDetailsSquere")
    protected short inHousingDtlsIssHousingDetailsSquere;
    @XmlElement(name = "InHousingDtlsIssHousingDetailsTpSoIdentifier")
    protected double inHousingDtlsIssHousingDetailsTpSoIdentifier;
    @XmlElement(name = "InHousingDtlsIssHousingDetailsUseBasement")
    protected String inHousingDtlsIssHousingDetailsUseBasement;
    @XmlElement(name = "InHousingDtlsIssHousingDetailsUseFloor")
    protected String inHousingDtlsIssHousingDetailsUseFloor;
    @XmlElement(name = "InHousingDtlsIssHousingDetailsUseGround")
    protected String inHousingDtlsIssHousingDetailsUseGround;
    @XmlElement(name = "InHousingDtlsIssHousingDetailsWale")
    protected int inHousingDtlsIssHousingDetailsWale;
    @XmlElement(name = "InHousingDtlsIssHousingDetailsZipCode")
    protected String inHousingDtlsIssHousingDetailsZipCode;
    @XmlElement(name = "InInsuranceProductIssCommitmentActivationDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inInsuranceProductIssCommitmentActivationDate;
    @XmlElement(name = "InInsuranceProductIssCommitmentCancelationDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inInsuranceProductIssCommitmentCancelationDate;
    @XmlElement(name = "InInsuranceProductIssCommitmentChargeAmnPerPay", required = true)
    protected BigDecimal inInsuranceProductIssCommitmentChargeAmnPerPay;
    @XmlElement(name = "InInsuranceProductIssCommitmentChargeMethod")
    protected String inInsuranceProductIssCommitmentChargeMethod;
    @XmlElement(name = "InInsuranceProductIssCommitmentComments1")
    protected String inInsuranceProductIssCommitmentComments1;
    @XmlElement(name = "InInsuranceProductIssCommitmentComments2")
    protected String inInsuranceProductIssCommitmentComments2;
    @XmlElement(name = "InInsuranceProductIssCommitmentCoverRatio", required = true)
    protected BigDecimal inInsuranceProductIssCommitmentCoverRatio;
    @XmlElement(name = "InInsuranceProductIssCommitmentCrAccCustomerId")
    protected int inInsuranceProductIssCommitmentCrAccCustomerId;
    @XmlElement(name = "InInsuranceProductIssCommitmentCrDepAccount")
    protected double inInsuranceProductIssCommitmentCrDepAccount;
    @XmlElement(name = "InInsuranceProductIssCommitmentCreditCardNo")
    protected String inInsuranceProductIssCommitmentCreditCardNo;
    @XmlElement(name = "InInsuranceProductIssCommitmentDrAccCustomerId")
    protected int inInsuranceProductIssCommitmentDrAccCustomerId;
    @XmlElement(name = "InInsuranceProductIssCommitmentEntryStatus")
    protected String inInsuranceProductIssCommitmentEntryStatus;
    @XmlElement(name = "InInsuranceProductIssCommitmentExpirationDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inInsuranceProductIssCommitmentExpirationDate;
    @XmlElement(name = "InInsuranceProductIssCommitmentFinalizeDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inInsuranceProductIssCommitmentFinalizeDate;
    @XmlElement(name = "InInsuranceProductIssCommitmentFixAmnPay", required = true)
    protected BigDecimal inInsuranceProductIssCommitmentFixAmnPay;
    @XmlElement(name = "InInsuranceProductIssCommitmentFkAccCd")
    protected short inInsuranceProductIssCommitmentFkAccCd;
    @XmlElement(name = "InInsuranceProductIssCommitmentFkAccSn")
    protected int inInsuranceProductIssCommitmentFkAccSn;
    @XmlElement(name = "InInsuranceProductIssCommitmentFkAccType")
    protected short inInsuranceProductIssCommitmentFkAccType;
    @XmlElement(name = "InInsuranceProductIssCommitmentFkAccUnit")
    protected int inInsuranceProductIssCommitmentFkAccUnit;
    @XmlElement(name = "InInsuranceProductIssCommitmentFkCategory")
    protected int inInsuranceProductIssCommitmentFkCategory;
    @XmlElement(name = "InInsuranceProductIssCommitmentFkCnlUsr")
    protected String inInsuranceProductIssCommitmentFkCnlUsr;
    @XmlElement(name = "InInsuranceProductIssCommitmentFkDebitAccount")
    protected double inInsuranceProductIssCommitmentFkDebitAccount;
    @XmlElement(name = "InInsuranceProductIssCommitmentFkFinalizeUsr")
    protected String inInsuranceProductIssCommitmentFkFinalizeUsr;
    @XmlElement(name = "InInsuranceProductIssCommitmentFkGenDetSerNum")
    protected int inInsuranceProductIssCommitmentFkGenDetSerNum;
    @XmlElement(name = "InInsuranceProductIssCommitmentFkGenericHeadpar")
    protected String inInsuranceProductIssCommitmentFkGenericHeadpar;
    @XmlElement(name = "InInsuranceProductIssCommitmentFkResponsibleUnit")
    protected int inInsuranceProductIssCommitmentFkResponsibleUnit;
    @XmlElement(name = "InInsuranceProductIssCommitmentFkUpdUsr")
    protected String inInsuranceProductIssCommitmentFkUpdUsr;
    @XmlElement(name = "InInsuranceProductIssCommitmentFrequency")
    protected short inInsuranceProductIssCommitmentFrequency;
    @XmlElement(name = "InInsuranceProductIssCommitmentFrequencyUnit")
    protected String inInsuranceProductIssCommitmentFrequencyUnit;
    @XmlElement(name = "InInsuranceProductIssCommitmentGradAppExpRatio", required = true)
    protected BigDecimal inInsuranceProductIssCommitmentGradAppExpRatio;
    @XmlElement(name = "InInsuranceProductIssCommitmentInsuranceValue", required = true)
    protected BigDecimal inInsuranceProductIssCommitmentInsuranceValue;
    @XmlElement(name = "InInsuranceProductIssCommitmentIssuanceNumber")
    protected String inInsuranceProductIssCommitmentIssuanceNumber;
    @XmlElement(name = "InInsuranceProductIssCommitmentIssueDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inInsuranceProductIssCommitmentIssueDate;
    @XmlElement(name = "InInsuranceProductIssCommitmentIssueType")
    protected short inInsuranceProductIssCommitmentIssueType;
    @XmlElement(name = "InInsuranceProductIssCommitmentLastUpdateDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inInsuranceProductIssCommitmentLastUpdateDate;
    @XmlElement(name = "InInsuranceProductIssCommitmentLoadingCalc")
    protected String inInsuranceProductIssCommitmentLoadingCalc;
    @XmlElement(name = "InInsuranceProductIssCommitmentLoanAccUntermRa", required = true)
    protected BigDecimal inInsuranceProductIssCommitmentLoanAccUntermRa;
    @XmlElement(name = "InInsuranceProductIssCommitmentLoanInd")
    protected String inInsuranceProductIssCommitmentLoanInd;
    @XmlElement(name = "InInsuranceProductIssCommitmentMainTpSoId")
    protected double inInsuranceProductIssCommitmentMainTpSoId;
    @XmlElement(name = "InInsuranceProductIssCommitmentMaxNumberAttempts")
    protected int inInsuranceProductIssCommitmentMaxNumberAttempts;
    @XmlElement(name = "InInsuranceProductIssCommitmentNumberOfAttempts")
    protected short inInsuranceProductIssCommitmentNumberOfAttempts;
    @XmlElement(name = "InInsuranceProductIssCommitmentOnceOnlyCharge", required = true)
    protected BigDecimal inInsuranceProductIssCommitmentOnceOnlyCharge;
    @XmlElement(name = "InInsuranceProductIssCommitmentOtherOutstBal", required = true)
    protected BigDecimal inInsuranceProductIssCommitmentOtherOutstBal;
    @XmlElement(name = "InInsuranceProductIssCommitmentPayableAmount", required = true)
    protected BigDecimal inInsuranceProductIssCommitmentPayableAmount;
    @XmlElement(name = "InInsuranceProductIssCommitmentPEntryStatus")
    protected String inInsuranceProductIssCommitmentPEntryStatus;
    @XmlElement(name = "InInsuranceProductIssCommitmentReinstatementVal", required = true)
    protected BigDecimal inInsuranceProductIssCommitmentReinstatementVal;
    @XmlElement(name = "InInsuranceProductIssCommitmentRenewalDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inInsuranceProductIssCommitmentRenewalDate;
    @XmlElement(name = "InInsuranceProductIssCommitmentReqCount")
    protected short inInsuranceProductIssCommitmentReqCount;
    @XmlElement(name = "InInsuranceProductIssCommitmentSaleUser")
    protected String inInsuranceProductIssCommitmentSaleUser;
    @XmlElement(name = "InInsuranceProductIssCommitmentSecondaryCustId")
    protected int inInsuranceProductIssCommitmentSecondaryCustId;
    @XmlElement(name = "InInsuranceProductIssCommitmentServiceProduct")
    protected int inInsuranceProductIssCommitmentServiceProduct;
    @XmlElement(name = "InInsuranceProductIssCommitmentThirdCustId")
    protected int inInsuranceProductIssCommitmentThirdCustId;
    @XmlElement(name = "InInsuranceProductIssCommitmentTpSoIdentifier")
    protected double inInsuranceProductIssCommitmentTpSoIdentifier;
    @XmlElement(name = "InInsuranceProductIssCommitmentTransactSm")
    protected int inInsuranceProductIssCommitmentTransactSm;
    @XmlElement(name = "InInsuranceProductIssCommitmentValuePayRate", required = true)
    protected BigDecimal inInsuranceProductIssCommitmentValuePayRate;
    @XmlElement(name = "InInsuranceProductIssCommitmentTmstamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inInsuranceProductIssCommitmentTmstamp;
    @XmlElement(name = "InIssComitmentAprIssCommitmentAppApprDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inIssComitmentAprIssCommitmentAppApprDate;
    @XmlElement(name = "InIssComitmentAprIssCommitmentAppApprUser")
    protected String inIssComitmentAprIssCommitmentAppApprUser;
    @XmlElement(name = "InIssComitmentAprIssCommitmentAppDocId")
    protected int inIssComitmentAprIssCommitmentAppDocId;
    @XmlElement(name = "InIssComitmentAprIssCommitmentAppEntryStatus")
    protected String inIssComitmentAprIssCommitmentAppEntryStatus;
    @XmlElement(name = "InIssComitmentAprIssCommitmentAppTpSoIdentifier")
    protected double inIssComitmentAprIssCommitmentAppTpSoIdentifier;
    @XmlElement(name = "InPackageIdPackage")
    protected int inPackageIdPackage;
    @XmlElement(name = "InProxyCommandIefSuppliedCommand")
    protected String inProxyCommandIefSuppliedCommand;
    @XmlElement(name = "InTheftCodeGenericDetailSerialNum")
    protected int inTheftCodeGenericDetailSerialNum;
    @XmlElement(name = "InUpdDamgsIssDamageDtlDamageAmnt", required = true)
    protected BigDecimal inUpdDamgsIssDamageDtlDamageAmnt;
    @XmlElement(name = "InUpdDamgsIssDamageDtlReplaced")
    protected String inUpdDamgsIssDamageDtlReplaced;
    @XmlElement(name = "InUpdDamgsIssDamageDtlTpSoIdentifier")
    protected double inUpdDamgsIssDamageDtlTpSoIdentifier;
    @XmlElement(name = "InUpdDamgsIssDamageDtlTypeCode")
    protected int inUpdDamgsIssDamageDtlTypeCode;
    @XmlElement(name = "InUpdDamgsIssDamageDtlYear")
    protected short inUpdDamgsIssDamageDtlYear;
    @XmlElement(name = "InLoanAccProfitsAccountAccountNumber")
    protected String inLoanAccProfitsAccountAccountNumber;
    @XmlElement(name = "InLoanAccProfitsAccountAccountCd")
    protected short inLoanAccProfitsAccountAccountCd;
    @XmlElement(name = "InLoanAccProfitsAccountPrftSystem")
    protected short inLoanAccProfitsAccountPrftSystem;
    @XmlElement(name = "InDepositAccProfitsAccountAccountNumber")
    protected String inDepositAccProfitsAccountAccountNumber;
    @XmlElement(name = "InDepositAccProfitsAccountAccountCd")
    protected short inDepositAccProfitsAccountAccountCd;
    @XmlElement(name = "InDepositAccProfitsAccountPrftSystem")
    protected short inDepositAccProfitsAccountPrftSystem;
    @XmlElement(name = "InCrDepProfitsAccountAccountNumber")
    protected String inCrDepProfitsAccountAccountNumber;
    @XmlElement(name = "InCrDepProfitsAccountAccountCd")
    protected short inCrDepProfitsAccountAccountCd;
    @XmlElement(name = "InCrDepProfitsAccountPrftSystem")
    protected short inCrDepProfitsAccountPrftSystem;
    @XmlElement(name = "InCoinsuredGrp")
    protected ArrayOfInCoinsuredGrpInCoinsuredGrmIssCommitmentCoinsItem inCoinsuredGrp;
    @XmlElement(name = "InInsuranceProductIssCommitmentFkInsurValCurr")
    protected int inInsuranceProductIssCommitmentFkInsurValCurr;
    @XmlElement(name = "InInsuranceAmountCurrencyIdCurrency")
    protected int inInsuranceAmountCurrencyIdCurrency;
    @XmlElement(name = "InInsuranceAmountCurrencyShortDescr")
    protected String inInsuranceAmountCurrencyShortDescr;
    @XmlElement(name = "InInsuranceAmountCurrencyIsoCode")
    protected short inInsuranceAmountCurrencyIsoCode;
    @XmlElement(name = "InPrftTransactionIdTransact")
    protected int inPrftTransactionIdTransact;
    @XmlElement(name = "InInsuranceProductIssCommitmentCalculationDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inInsuranceProductIssCommitmentCalculationDate;

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
     * Gets the value of the inCustomerCatGenericDetailDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCustomerCatGenericDetailDescription() {
        return inCustomerCatGenericDetailDescription;
    }

    /**
     * Sets the value of the inCustomerCatGenericDetailDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCustomerCatGenericDetailDescription(String value) {
        this.inCustomerCatGenericDetailDescription = value;
    }

    /**
     * Gets the value of the inCustomerCatGenericDetailParameterType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCustomerCatGenericDetailParameterType() {
        return inCustomerCatGenericDetailParameterType;
    }

    /**
     * Sets the value of the inCustomerCatGenericDetailParameterType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCustomerCatGenericDetailParameterType(String value) {
        this.inCustomerCatGenericDetailParameterType = value;
    }

    /**
     * Gets the value of the inCustomerCatGenericDetailSerialNum property.
     * 
     */
    public int getInCustomerCatGenericDetailSerialNum() {
        return inCustomerCatGenericDetailSerialNum;
    }

    /**
     * Sets the value of the inCustomerCatGenericDetailSerialNum property.
     * 
     */
    public void setInCustomerCatGenericDetailSerialNum(int value) {
        this.inCustomerCatGenericDetailSerialNum = value;
    }

    /**
     * Gets the value of the inDrCustomerCustomerCDigit property.
     * 
     */
    public short getInDrCustomerCustomerCDigit() {
        return inDrCustomerCustomerCDigit;
    }

    /**
     * Sets the value of the inDrCustomerCustomerCDigit property.
     * 
     */
    public void setInDrCustomerCustomerCDigit(short value) {
        this.inDrCustomerCustomerCDigit = value;
    }

    /**
     * Gets the value of the inDrCustomerCustomerCustId property.
     * 
     */
    public int getInDrCustomerCustomerCustId() {
        return inDrCustomerCustomerCustId;
    }

    /**
     * Sets the value of the inDrCustomerCustomerCustId property.
     * 
     */
    public void setInDrCustomerCustomerCustId(int value) {
        this.inDrCustomerCustomerCustId = value;
    }

    /**
     * Gets the value of the inDrCustomerCustomerDateOfBirth property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInDrCustomerCustomerDateOfBirth() {
        return inDrCustomerCustomerDateOfBirth;
    }

    /**
     * Sets the value of the inDrCustomerCustomerDateOfBirth property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInDrCustomerCustomerDateOfBirth(XMLGregorianCalendar value) {
        this.inDrCustomerCustomerDateOfBirth = value;
    }

    /**
     * Gets the value of the inDrCustomerCustomerMobileTel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInDrCustomerCustomerMobileTel() {
        return inDrCustomerCustomerMobileTel;
    }

    /**
     * Sets the value of the inDrCustomerCustomerMobileTel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInDrCustomerCustomerMobileTel(String value) {
        this.inDrCustomerCustomerMobileTel = value;
    }

    /**
     * Gets the value of the inDrCustomerCustomerSurname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInDrCustomerCustomerSurname() {
        return inDrCustomerCustomerSurname;
    }

    /**
     * Sets the value of the inDrCustomerCustomerSurname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInDrCustomerCustomerSurname(String value) {
        this.inDrCustomerCustomerSurname = value;
    }

    /**
     * Gets the value of the inDrCustomerCustomerTelephone1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInDrCustomerCustomerTelephone1() {
        return inDrCustomerCustomerTelephone1;
    }

    /**
     * Sets the value of the inDrCustomerCustomerTelephone1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInDrCustomerCustomerTelephone1(String value) {
        this.inDrCustomerCustomerTelephone1 = value;
    }

    /**
     * Gets the value of the inHousetypCatGenericDetailDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInHousetypCatGenericDetailDescription() {
        return inHousetypCatGenericDetailDescription;
    }

    /**
     * Sets the value of the inHousetypCatGenericDetailDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInHousetypCatGenericDetailDescription(String value) {
        this.inHousetypCatGenericDetailDescription = value;
    }

    /**
     * Gets the value of the inHousetypCatGenericDetailParameterType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInHousetypCatGenericDetailParameterType() {
        return inHousetypCatGenericDetailParameterType;
    }

    /**
     * Sets the value of the inHousetypCatGenericDetailParameterType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInHousetypCatGenericDetailParameterType(String value) {
        this.inHousetypCatGenericDetailParameterType = value;
    }

    /**
     * Gets the value of the inHousetypCatGenericDetailSerialNum property.
     * 
     */
    public int getInHousetypCatGenericDetailSerialNum() {
        return inHousetypCatGenericDetailSerialNum;
    }

    /**
     * Sets the value of the inHousetypCatGenericDetailSerialNum property.
     * 
     */
    public void setInHousetypCatGenericDetailSerialNum(int value) {
        this.inHousetypCatGenericDetailSerialNum = value;
    }

    /**
     * Gets the value of the inHousingDetailsAddress1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInHousingDetailsAddress1() {
        return inHousingDetailsAddress1;
    }

    /**
     * Sets the value of the inHousingDetailsAddress1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInHousingDetailsAddress1(String value) {
        this.inHousingDetailsAddress1 = value;
    }

    /**
     * Gets the value of the inHousingDetailsAddress2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInHousingDetailsAddress2() {
        return inHousingDetailsAddress2;
    }

    /**
     * Sets the value of the inHousingDetailsAddress2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInHousingDetailsAddress2(String value) {
        this.inHousingDetailsAddress2 = value;
    }

    /**
     * Gets the value of the inHousingDetailsCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInHousingDetailsCity() {
        return inHousingDetailsCity;
    }

    /**
     * Sets the value of the inHousingDetailsCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInHousingDetailsCity(String value) {
        this.inHousingDetailsCity = value;
    }

    /**
     * Gets the value of the inHousingDetailsFloor property.
     * 
     */
    public short getInHousingDetailsFloor() {
        return inHousingDetailsFloor;
    }

    /**
     * Sets the value of the inHousingDetailsFloor property.
     * 
     */
    public void setInHousingDetailsFloor(short value) {
        this.inHousingDetailsFloor = value;
    }

    /**
     * Gets the value of the inHousingDetailsHouseType property.
     * 
     */
    public int getInHousingDetailsHouseType() {
        return inHousingDetailsHouseType;
    }

    /**
     * Sets the value of the inHousingDetailsHouseType property.
     * 
     */
    public void setInHousingDetailsHouseType(int value) {
        this.inHousingDetailsHouseType = value;
    }

    /**
     * Gets the value of the inHousingDetailsHouseUse property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInHousingDetailsHouseUse() {
        return inHousingDetailsHouseUse;
    }

    /**
     * Sets the value of the inHousingDetailsHouseUse property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInHousingDetailsHouseUse(String value) {
        this.inHousingDetailsHouseUse = value;
    }

    /**
     * Gets the value of the inHousingDetailsNoFloors property.
     * 
     */
    public short getInHousingDetailsNoFloors() {
        return inHousingDetailsNoFloors;
    }

    /**
     * Sets the value of the inHousingDetailsNoFloors property.
     * 
     */
    public void setInHousingDetailsNoFloors(short value) {
        this.inHousingDetailsNoFloors = value;
    }

    /**
     * Gets the value of the inHousingDetailsPartailComments property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInHousingDetailsPartailComments() {
        return inHousingDetailsPartailComments;
    }

    /**
     * Sets the value of the inHousingDetailsPartailComments property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInHousingDetailsPartailComments(String value) {
        this.inHousingDetailsPartailComments = value;
    }

    /**
     * Gets the value of the inHousingDetailsPartial property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInHousingDetailsPartial() {
        return inHousingDetailsPartial;
    }

    /**
     * Sets the value of the inHousingDetailsPartial property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInHousingDetailsPartial(String value) {
        this.inHousingDetailsPartial = value;
    }

    /**
     * Gets the value of the inHousingDetailsRoof property.
     * 
     */
    public int getInHousingDetailsRoof() {
        return inHousingDetailsRoof;
    }

    /**
     * Sets the value of the inHousingDetailsRoof property.
     * 
     */
    public void setInHousingDetailsRoof(int value) {
        this.inHousingDetailsRoof = value;
    }

    /**
     * Gets the value of the inHousingDetailsSkeleton property.
     * 
     */
    public int getInHousingDetailsSkeleton() {
        return inHousingDetailsSkeleton;
    }

    /**
     * Sets the value of the inHousingDetailsSkeleton property.
     * 
     */
    public void setInHousingDetailsSkeleton(int value) {
        this.inHousingDetailsSkeleton = value;
    }

    /**
     * Gets the value of the inHousingDetailsSquare property.
     * 
     */
    public short getInHousingDetailsSquare() {
        return inHousingDetailsSquare;
    }

    /**
     * Sets the value of the inHousingDetailsSquare property.
     * 
     */
    public void setInHousingDetailsSquare(short value) {
        this.inHousingDetailsSquare = value;
    }

    /**
     * Gets the value of the inHousingDetailsUseBasement property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInHousingDetailsUseBasement() {
        return inHousingDetailsUseBasement;
    }

    /**
     * Sets the value of the inHousingDetailsUseBasement property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInHousingDetailsUseBasement(String value) {
        this.inHousingDetailsUseBasement = value;
    }

    /**
     * Gets the value of the inHousingDetailsUseFloor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInHousingDetailsUseFloor() {
        return inHousingDetailsUseFloor;
    }

    /**
     * Sets the value of the inHousingDetailsUseFloor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInHousingDetailsUseFloor(String value) {
        this.inHousingDetailsUseFloor = value;
    }

    /**
     * Gets the value of the inHousingDetailsUseGroundFloor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInHousingDetailsUseGroundFloor() {
        return inHousingDetailsUseGroundFloor;
    }

    /**
     * Sets the value of the inHousingDetailsUseGroundFloor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInHousingDetailsUseGroundFloor(String value) {
        this.inHousingDetailsUseGroundFloor = value;
    }

    /**
     * Gets the value of the inHousingDetailsWale property.
     * 
     */
    public int getInHousingDetailsWale() {
        return inHousingDetailsWale;
    }

    /**
     * Sets the value of the inHousingDetailsWale property.
     * 
     */
    public void setInHousingDetailsWale(int value) {
        this.inHousingDetailsWale = value;
    }

    /**
     * Gets the value of the inHousingDetailsZipCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInHousingDetailsZipCode() {
        return inHousingDetailsZipCode;
    }

    /**
     * Sets the value of the inHousingDetailsZipCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInHousingDetailsZipCode(String value) {
        this.inHousingDetailsZipCode = value;
    }

    /**
     * Gets the value of the inHousingDtlsIssHousingDetailsAddress1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInHousingDtlsIssHousingDetailsAddress1() {
        return inHousingDtlsIssHousingDetailsAddress1;
    }

    /**
     * Sets the value of the inHousingDtlsIssHousingDetailsAddress1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInHousingDtlsIssHousingDetailsAddress1(String value) {
        this.inHousingDtlsIssHousingDetailsAddress1 = value;
    }

    /**
     * Gets the value of the inHousingDtlsIssHousingDetailsAddress2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInHousingDtlsIssHousingDetailsAddress2() {
        return inHousingDtlsIssHousingDetailsAddress2;
    }

    /**
     * Sets the value of the inHousingDtlsIssHousingDetailsAddress2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInHousingDtlsIssHousingDetailsAddress2(String value) {
        this.inHousingDtlsIssHousingDetailsAddress2 = value;
    }

    /**
     * Gets the value of the inHousingDtlsIssHousingDetailsBlockAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInHousingDtlsIssHousingDetailsBlockAmount() {
        return inHousingDtlsIssHousingDetailsBlockAmount;
    }

    /**
     * Sets the value of the inHousingDtlsIssHousingDetailsBlockAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInHousingDtlsIssHousingDetailsBlockAmount(BigDecimal value) {
        this.inHousingDtlsIssHousingDetailsBlockAmount = value;
    }

    /**
     * Gets the value of the inHousingDtlsIssHousingDetailsBlockAmount2 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInHousingDtlsIssHousingDetailsBlockAmount2() {
        return inHousingDtlsIssHousingDetailsBlockAmount2;
    }

    /**
     * Sets the value of the inHousingDtlsIssHousingDetailsBlockAmount2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInHousingDtlsIssHousingDetailsBlockAmount2(BigDecimal value) {
        this.inHousingDtlsIssHousingDetailsBlockAmount2 = value;
    }

    /**
     * Gets the value of the inHousingDtlsIssHousingDetailsBlockAmount3 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInHousingDtlsIssHousingDetailsBlockAmount3() {
        return inHousingDtlsIssHousingDetailsBlockAmount3;
    }

    /**
     * Sets the value of the inHousingDtlsIssHousingDetailsBlockAmount3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInHousingDtlsIssHousingDetailsBlockAmount3(BigDecimal value) {
        this.inHousingDtlsIssHousingDetailsBlockAmount3 = value;
    }

    /**
     * Gets the value of the inHousingDtlsIssHousingDetailsCancelledContr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInHousingDtlsIssHousingDetailsCancelledContr() {
        return inHousingDtlsIssHousingDetailsCancelledContr;
    }

    /**
     * Sets the value of the inHousingDtlsIssHousingDetailsCancelledContr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInHousingDtlsIssHousingDetailsCancelledContr(String value) {
        this.inHousingDtlsIssHousingDetailsCancelledContr = value;
    }

    /**
     * Gets the value of the inHousingDtlsIssHousingDetailsCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInHousingDtlsIssHousingDetailsCity() {
        return inHousingDtlsIssHousingDetailsCity;
    }

    /**
     * Sets the value of the inHousingDtlsIssHousingDetailsCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInHousingDtlsIssHousingDetailsCity(String value) {
        this.inHousingDtlsIssHousingDetailsCity = value;
    }

    /**
     * Gets the value of the inHousingDtlsIssHousingDetailsConstrDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInHousingDtlsIssHousingDetailsConstrDate() {
        return inHousingDtlsIssHousingDetailsConstrDate;
    }

    /**
     * Sets the value of the inHousingDtlsIssHousingDetailsConstrDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInHousingDtlsIssHousingDetailsConstrDate(XMLGregorianCalendar value) {
        this.inHousingDtlsIssHousingDetailsConstrDate = value;
    }

    /**
     * Gets the value of the inHousingDtlsIssHousingDetailsContrComments property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInHousingDtlsIssHousingDetailsContrComments() {
        return inHousingDtlsIssHousingDetailsContrComments;
    }

    /**
     * Sets the value of the inHousingDtlsIssHousingDetailsContrComments property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInHousingDtlsIssHousingDetailsContrComments(String value) {
        this.inHousingDtlsIssHousingDetailsContrComments = value;
    }

    /**
     * Gets the value of the inHousingDtlsIssHousingDetailsDamageInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInHousingDtlsIssHousingDetailsDamageInd() {
        return inHousingDtlsIssHousingDetailsDamageInd;
    }

    /**
     * Sets the value of the inHousingDtlsIssHousingDetailsDamageInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInHousingDtlsIssHousingDetailsDamageInd(String value) {
        this.inHousingDtlsIssHousingDetailsDamageInd = value;
    }

    /**
     * Gets the value of the inHousingDtlsIssHousingDetailsEarthquakeCode property.
     * 
     */
    public int getInHousingDtlsIssHousingDetailsEarthquakeCode() {
        return inHousingDtlsIssHousingDetailsEarthquakeCode;
    }

    /**
     * Sets the value of the inHousingDtlsIssHousingDetailsEarthquakeCode property.
     * 
     */
    public void setInHousingDtlsIssHousingDetailsEarthquakeCode(int value) {
        this.inHousingDtlsIssHousingDetailsEarthquakeCode = value;
    }

    /**
     * Gets the value of the inHousingDtlsIssHousingDetailsFloor property.
     * 
     */
    public short getInHousingDtlsIssHousingDetailsFloor() {
        return inHousingDtlsIssHousingDetailsFloor;
    }

    /**
     * Sets the value of the inHousingDtlsIssHousingDetailsFloor property.
     * 
     */
    public void setInHousingDtlsIssHousingDetailsFloor(short value) {
        this.inHousingDtlsIssHousingDetailsFloor = value;
    }

    /**
     * Gets the value of the inHousingDtlsIssHousingDetailsHouseType property.
     * 
     */
    public int getInHousingDtlsIssHousingDetailsHouseType() {
        return inHousingDtlsIssHousingDetailsHouseType;
    }

    /**
     * Sets the value of the inHousingDtlsIssHousingDetailsHouseType property.
     * 
     */
    public void setInHousingDtlsIssHousingDetailsHouseType(int value) {
        this.inHousingDtlsIssHousingDetailsHouseType = value;
    }

    /**
     * Gets the value of the inHousingDtlsIssHousingDetailsHouseUse property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInHousingDtlsIssHousingDetailsHouseUse() {
        return inHousingDtlsIssHousingDetailsHouseUse;
    }

    /**
     * Sets the value of the inHousingDtlsIssHousingDetailsHouseUse property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInHousingDtlsIssHousingDetailsHouseUse(String value) {
        this.inHousingDtlsIssHousingDetailsHouseUse = value;
    }

    /**
     * Gets the value of the inHousingDtlsIssHousingDetailsHsIssuanceAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInHousingDtlsIssHousingDetailsHsIssuanceAmount() {
        return inHousingDtlsIssHousingDetailsHsIssuanceAmount;
    }

    /**
     * Sets the value of the inHousingDtlsIssHousingDetailsHsIssuanceAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInHousingDtlsIssHousingDetailsHsIssuanceAmount(BigDecimal value) {
        this.inHousingDtlsIssHousingDetailsHsIssuanceAmount = value;
    }

    /**
     * Gets the value of the inHousingDtlsIssHousingDetailsHsIssuanceCapital property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInHousingDtlsIssHousingDetailsHsIssuanceCapital() {
        return inHousingDtlsIssHousingDetailsHsIssuanceCapital;
    }

    /**
     * Sets the value of the inHousingDtlsIssHousingDetailsHsIssuanceCapital property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInHousingDtlsIssHousingDetailsHsIssuanceCapital(BigDecimal value) {
        this.inHousingDtlsIssHousingDetailsHsIssuanceCapital = value;
    }

    /**
     * Gets the value of the inHousingDtlsIssHousingDetailsLnsAccCd2 property.
     * 
     */
    public short getInHousingDtlsIssHousingDetailsLnsAccCd2() {
        return inHousingDtlsIssHousingDetailsLnsAccCd2;
    }

    /**
     * Sets the value of the inHousingDtlsIssHousingDetailsLnsAccCd2 property.
     * 
     */
    public void setInHousingDtlsIssHousingDetailsLnsAccCd2(short value) {
        this.inHousingDtlsIssHousingDetailsLnsAccCd2 = value;
    }

    /**
     * Gets the value of the inHousingDtlsIssHousingDetailsLnsAccCd3 property.
     * 
     */
    public short getInHousingDtlsIssHousingDetailsLnsAccCd3() {
        return inHousingDtlsIssHousingDetailsLnsAccCd3;
    }

    /**
     * Sets the value of the inHousingDtlsIssHousingDetailsLnsAccCd3 property.
     * 
     */
    public void setInHousingDtlsIssHousingDetailsLnsAccCd3(short value) {
        this.inHousingDtlsIssHousingDetailsLnsAccCd3 = value;
    }

    /**
     * Gets the value of the inHousingDtlsIssHousingDetailsLnsAccSn2 property.
     * 
     */
    public int getInHousingDtlsIssHousingDetailsLnsAccSn2() {
        return inHousingDtlsIssHousingDetailsLnsAccSn2;
    }

    /**
     * Sets the value of the inHousingDtlsIssHousingDetailsLnsAccSn2 property.
     * 
     */
    public void setInHousingDtlsIssHousingDetailsLnsAccSn2(int value) {
        this.inHousingDtlsIssHousingDetailsLnsAccSn2 = value;
    }

    /**
     * Gets the value of the inHousingDtlsIssHousingDetailsLnsAccSn3 property.
     * 
     */
    public int getInHousingDtlsIssHousingDetailsLnsAccSn3() {
        return inHousingDtlsIssHousingDetailsLnsAccSn3;
    }

    /**
     * Sets the value of the inHousingDtlsIssHousingDetailsLnsAccSn3 property.
     * 
     */
    public void setInHousingDtlsIssHousingDetailsLnsAccSn3(int value) {
        this.inHousingDtlsIssHousingDetailsLnsAccSn3 = value;
    }

    /**
     * Gets the value of the inHousingDtlsIssHousingDetailsLnsAccType2 property.
     * 
     */
    public short getInHousingDtlsIssHousingDetailsLnsAccType2() {
        return inHousingDtlsIssHousingDetailsLnsAccType2;
    }

    /**
     * Sets the value of the inHousingDtlsIssHousingDetailsLnsAccType2 property.
     * 
     */
    public void setInHousingDtlsIssHousingDetailsLnsAccType2(short value) {
        this.inHousingDtlsIssHousingDetailsLnsAccType2 = value;
    }

    /**
     * Gets the value of the inHousingDtlsIssHousingDetailsLnsAccType3 property.
     * 
     */
    public short getInHousingDtlsIssHousingDetailsLnsAccType3() {
        return inHousingDtlsIssHousingDetailsLnsAccType3;
    }

    /**
     * Sets the value of the inHousingDtlsIssHousingDetailsLnsAccType3 property.
     * 
     */
    public void setInHousingDtlsIssHousingDetailsLnsAccType3(short value) {
        this.inHousingDtlsIssHousingDetailsLnsAccType3 = value;
    }

    /**
     * Gets the value of the inHousingDtlsIssHousingDetailsLnsAccUnit2 property.
     * 
     */
    public int getInHousingDtlsIssHousingDetailsLnsAccUnit2() {
        return inHousingDtlsIssHousingDetailsLnsAccUnit2;
    }

    /**
     * Sets the value of the inHousingDtlsIssHousingDetailsLnsAccUnit2 property.
     * 
     */
    public void setInHousingDtlsIssHousingDetailsLnsAccUnit2(int value) {
        this.inHousingDtlsIssHousingDetailsLnsAccUnit2 = value;
    }

    /**
     * Gets the value of the inHousingDtlsIssHousingDetailsLnsAccUnit3 property.
     * 
     */
    public int getInHousingDtlsIssHousingDetailsLnsAccUnit3() {
        return inHousingDtlsIssHousingDetailsLnsAccUnit3;
    }

    /**
     * Sets the value of the inHousingDtlsIssHousingDetailsLnsAccUnit3 property.
     * 
     */
    public void setInHousingDtlsIssHousingDetailsLnsAccUnit3(int value) {
        this.inHousingDtlsIssHousingDetailsLnsAccUnit3 = value;
    }

    /**
     * Gets the value of the inHousingDtlsIssHousingDetailsLoanAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInHousingDtlsIssHousingDetailsLoanAmount() {
        return inHousingDtlsIssHousingDetailsLoanAmount;
    }

    /**
     * Sets the value of the inHousingDtlsIssHousingDetailsLoanAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInHousingDtlsIssHousingDetailsLoanAmount(BigDecimal value) {
        this.inHousingDtlsIssHousingDetailsLoanAmount = value;
    }

    /**
     * Gets the value of the inHousingDtlsIssHousingDetailsLoanAmount2 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInHousingDtlsIssHousingDetailsLoanAmount2() {
        return inHousingDtlsIssHousingDetailsLoanAmount2;
    }

    /**
     * Sets the value of the inHousingDtlsIssHousingDetailsLoanAmount2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInHousingDtlsIssHousingDetailsLoanAmount2(BigDecimal value) {
        this.inHousingDtlsIssHousingDetailsLoanAmount2 = value;
    }

    /**
     * Gets the value of the inHousingDtlsIssHousingDetailsLoanAmount3 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInHousingDtlsIssHousingDetailsLoanAmount3() {
        return inHousingDtlsIssHousingDetailsLoanAmount3;
    }

    /**
     * Sets the value of the inHousingDtlsIssHousingDetailsLoanAmount3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInHousingDtlsIssHousingDetailsLoanAmount3(BigDecimal value) {
        this.inHousingDtlsIssHousingDetailsLoanAmount3 = value;
    }

    /**
     * Gets the value of the inHousingDtlsIssHousingDetailsLoanExpDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInHousingDtlsIssHousingDetailsLoanExpDt() {
        return inHousingDtlsIssHousingDetailsLoanExpDt;
    }

    /**
     * Sets the value of the inHousingDtlsIssHousingDetailsLoanExpDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInHousingDtlsIssHousingDetailsLoanExpDt(XMLGregorianCalendar value) {
        this.inHousingDtlsIssHousingDetailsLoanExpDt = value;
    }

    /**
     * Gets the value of the inHousingDtlsIssHousingDetailsLoanExpDt2 property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInHousingDtlsIssHousingDetailsLoanExpDt2() {
        return inHousingDtlsIssHousingDetailsLoanExpDt2;
    }

    /**
     * Sets the value of the inHousingDtlsIssHousingDetailsLoanExpDt2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInHousingDtlsIssHousingDetailsLoanExpDt2(XMLGregorianCalendar value) {
        this.inHousingDtlsIssHousingDetailsLoanExpDt2 = value;
    }

    /**
     * Gets the value of the inHousingDtlsIssHousingDetailsLoanExpDt3 property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInHousingDtlsIssHousingDetailsLoanExpDt3() {
        return inHousingDtlsIssHousingDetailsLoanExpDt3;
    }

    /**
     * Sets the value of the inHousingDtlsIssHousingDetailsLoanExpDt3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInHousingDtlsIssHousingDetailsLoanExpDt3(XMLGregorianCalendar value) {
        this.inHousingDtlsIssHousingDetailsLoanExpDt3 = value;
    }

    /**
     * Gets the value of the inHousingDtlsIssHousingDetailsNoFloors property.
     * 
     */
    public short getInHousingDtlsIssHousingDetailsNoFloors() {
        return inHousingDtlsIssHousingDetailsNoFloors;
    }

    /**
     * Sets the value of the inHousingDtlsIssHousingDetailsNoFloors property.
     * 
     */
    public void setInHousingDtlsIssHousingDetailsNoFloors(short value) {
        this.inHousingDtlsIssHousingDetailsNoFloors = value;
    }

    /**
     * Gets the value of the inHousingDtlsIssHousingDetailsOtherCustComment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInHousingDtlsIssHousingDetailsOtherCustComment() {
        return inHousingDtlsIssHousingDetailsOtherCustComment;
    }

    /**
     * Sets the value of the inHousingDtlsIssHousingDetailsOtherCustComment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInHousingDtlsIssHousingDetailsOtherCustComment(String value) {
        this.inHousingDtlsIssHousingDetailsOtherCustComment = value;
    }

    /**
     * Gets the value of the inHousingDtlsIssHousingDetailsOtherCustInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInHousingDtlsIssHousingDetailsOtherCustInd() {
        return inHousingDtlsIssHousingDetailsOtherCustInd;
    }

    /**
     * Sets the value of the inHousingDtlsIssHousingDetailsOtherCustInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInHousingDtlsIssHousingDetailsOtherCustInd(String value) {
        this.inHousingDtlsIssHousingDetailsOtherCustInd = value;
    }

    /**
     * Gets the value of the inHousingDtlsIssHousingDetailsPartial property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInHousingDtlsIssHousingDetailsPartial() {
        return inHousingDtlsIssHousingDetailsPartial;
    }

    /**
     * Sets the value of the inHousingDtlsIssHousingDetailsPartial property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInHousingDtlsIssHousingDetailsPartial(String value) {
        this.inHousingDtlsIssHousingDetailsPartial = value;
    }

    /**
     * Gets the value of the inHousingDtlsIssHousingDetailsPartialComments property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInHousingDtlsIssHousingDetailsPartialComments() {
        return inHousingDtlsIssHousingDetailsPartialComments;
    }

    /**
     * Sets the value of the inHousingDtlsIssHousingDetailsPartialComments property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInHousingDtlsIssHousingDetailsPartialComments(String value) {
        this.inHousingDtlsIssHousingDetailsPartialComments = value;
    }

    /**
     * Gets the value of the inHousingDtlsIssHousingDetailsRoof property.
     * 
     */
    public int getInHousingDtlsIssHousingDetailsRoof() {
        return inHousingDtlsIssHousingDetailsRoof;
    }

    /**
     * Sets the value of the inHousingDtlsIssHousingDetailsRoof property.
     * 
     */
    public void setInHousingDtlsIssHousingDetailsRoof(int value) {
        this.inHousingDtlsIssHousingDetailsRoof = value;
    }

    /**
     * Gets the value of the inHousingDtlsIssHousingDetailsSkeleton property.
     * 
     */
    public int getInHousingDtlsIssHousingDetailsSkeleton() {
        return inHousingDtlsIssHousingDetailsSkeleton;
    }

    /**
     * Sets the value of the inHousingDtlsIssHousingDetailsSkeleton property.
     * 
     */
    public void setInHousingDtlsIssHousingDetailsSkeleton(int value) {
        this.inHousingDtlsIssHousingDetailsSkeleton = value;
    }

    /**
     * Gets the value of the inHousingDtlsIssHousingDetailsSquere property.
     * 
     */
    public short getInHousingDtlsIssHousingDetailsSquere() {
        return inHousingDtlsIssHousingDetailsSquere;
    }

    /**
     * Sets the value of the inHousingDtlsIssHousingDetailsSquere property.
     * 
     */
    public void setInHousingDtlsIssHousingDetailsSquere(short value) {
        this.inHousingDtlsIssHousingDetailsSquere = value;
    }

    /**
     * Gets the value of the inHousingDtlsIssHousingDetailsTpSoIdentifier property.
     * 
     */
    public double getInHousingDtlsIssHousingDetailsTpSoIdentifier() {
        return inHousingDtlsIssHousingDetailsTpSoIdentifier;
    }

    /**
     * Sets the value of the inHousingDtlsIssHousingDetailsTpSoIdentifier property.
     * 
     */
    public void setInHousingDtlsIssHousingDetailsTpSoIdentifier(double value) {
        this.inHousingDtlsIssHousingDetailsTpSoIdentifier = value;
    }

    /**
     * Gets the value of the inHousingDtlsIssHousingDetailsUseBasement property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInHousingDtlsIssHousingDetailsUseBasement() {
        return inHousingDtlsIssHousingDetailsUseBasement;
    }

    /**
     * Sets the value of the inHousingDtlsIssHousingDetailsUseBasement property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInHousingDtlsIssHousingDetailsUseBasement(String value) {
        this.inHousingDtlsIssHousingDetailsUseBasement = value;
    }

    /**
     * Gets the value of the inHousingDtlsIssHousingDetailsUseFloor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInHousingDtlsIssHousingDetailsUseFloor() {
        return inHousingDtlsIssHousingDetailsUseFloor;
    }

    /**
     * Sets the value of the inHousingDtlsIssHousingDetailsUseFloor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInHousingDtlsIssHousingDetailsUseFloor(String value) {
        this.inHousingDtlsIssHousingDetailsUseFloor = value;
    }

    /**
     * Gets the value of the inHousingDtlsIssHousingDetailsUseGround property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInHousingDtlsIssHousingDetailsUseGround() {
        return inHousingDtlsIssHousingDetailsUseGround;
    }

    /**
     * Sets the value of the inHousingDtlsIssHousingDetailsUseGround property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInHousingDtlsIssHousingDetailsUseGround(String value) {
        this.inHousingDtlsIssHousingDetailsUseGround = value;
    }

    /**
     * Gets the value of the inHousingDtlsIssHousingDetailsWale property.
     * 
     */
    public int getInHousingDtlsIssHousingDetailsWale() {
        return inHousingDtlsIssHousingDetailsWale;
    }

    /**
     * Sets the value of the inHousingDtlsIssHousingDetailsWale property.
     * 
     */
    public void setInHousingDtlsIssHousingDetailsWale(int value) {
        this.inHousingDtlsIssHousingDetailsWale = value;
    }

    /**
     * Gets the value of the inHousingDtlsIssHousingDetailsZipCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInHousingDtlsIssHousingDetailsZipCode() {
        return inHousingDtlsIssHousingDetailsZipCode;
    }

    /**
     * Sets the value of the inHousingDtlsIssHousingDetailsZipCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInHousingDtlsIssHousingDetailsZipCode(String value) {
        this.inHousingDtlsIssHousingDetailsZipCode = value;
    }

    /**
     * Gets the value of the inInsuranceProductIssCommitmentActivationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInInsuranceProductIssCommitmentActivationDate() {
        return inInsuranceProductIssCommitmentActivationDate;
    }

    /**
     * Sets the value of the inInsuranceProductIssCommitmentActivationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInInsuranceProductIssCommitmentActivationDate(XMLGregorianCalendar value) {
        this.inInsuranceProductIssCommitmentActivationDate = value;
    }

    /**
     * Gets the value of the inInsuranceProductIssCommitmentCancelationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInInsuranceProductIssCommitmentCancelationDate() {
        return inInsuranceProductIssCommitmentCancelationDate;
    }

    /**
     * Sets the value of the inInsuranceProductIssCommitmentCancelationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInInsuranceProductIssCommitmentCancelationDate(XMLGregorianCalendar value) {
        this.inInsuranceProductIssCommitmentCancelationDate = value;
    }

    /**
     * Gets the value of the inInsuranceProductIssCommitmentChargeAmnPerPay property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInInsuranceProductIssCommitmentChargeAmnPerPay() {
        return inInsuranceProductIssCommitmentChargeAmnPerPay;
    }

    /**
     * Sets the value of the inInsuranceProductIssCommitmentChargeAmnPerPay property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInInsuranceProductIssCommitmentChargeAmnPerPay(BigDecimal value) {
        this.inInsuranceProductIssCommitmentChargeAmnPerPay = value;
    }

    /**
     * Gets the value of the inInsuranceProductIssCommitmentChargeMethod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInInsuranceProductIssCommitmentChargeMethod() {
        return inInsuranceProductIssCommitmentChargeMethod;
    }

    /**
     * Sets the value of the inInsuranceProductIssCommitmentChargeMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInInsuranceProductIssCommitmentChargeMethod(String value) {
        this.inInsuranceProductIssCommitmentChargeMethod = value;
    }

    /**
     * Gets the value of the inInsuranceProductIssCommitmentComments1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInInsuranceProductIssCommitmentComments1() {
        return inInsuranceProductIssCommitmentComments1;
    }

    /**
     * Sets the value of the inInsuranceProductIssCommitmentComments1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInInsuranceProductIssCommitmentComments1(String value) {
        this.inInsuranceProductIssCommitmentComments1 = value;
    }

    /**
     * Gets the value of the inInsuranceProductIssCommitmentComments2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInInsuranceProductIssCommitmentComments2() {
        return inInsuranceProductIssCommitmentComments2;
    }

    /**
     * Sets the value of the inInsuranceProductIssCommitmentComments2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInInsuranceProductIssCommitmentComments2(String value) {
        this.inInsuranceProductIssCommitmentComments2 = value;
    }

    /**
     * Gets the value of the inInsuranceProductIssCommitmentCoverRatio property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInInsuranceProductIssCommitmentCoverRatio() {
        return inInsuranceProductIssCommitmentCoverRatio;
    }

    /**
     * Sets the value of the inInsuranceProductIssCommitmentCoverRatio property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInInsuranceProductIssCommitmentCoverRatio(BigDecimal value) {
        this.inInsuranceProductIssCommitmentCoverRatio = value;
    }

    /**
     * Gets the value of the inInsuranceProductIssCommitmentCrAccCustomerId property.
     * 
     */
    public int getInInsuranceProductIssCommitmentCrAccCustomerId() {
        return inInsuranceProductIssCommitmentCrAccCustomerId;
    }

    /**
     * Sets the value of the inInsuranceProductIssCommitmentCrAccCustomerId property.
     * 
     */
    public void setInInsuranceProductIssCommitmentCrAccCustomerId(int value) {
        this.inInsuranceProductIssCommitmentCrAccCustomerId = value;
    }

    /**
     * Gets the value of the inInsuranceProductIssCommitmentCrDepAccount property.
     * 
     */
    public double getInInsuranceProductIssCommitmentCrDepAccount() {
        return inInsuranceProductIssCommitmentCrDepAccount;
    }

    /**
     * Sets the value of the inInsuranceProductIssCommitmentCrDepAccount property.
     * 
     */
    public void setInInsuranceProductIssCommitmentCrDepAccount(double value) {
        this.inInsuranceProductIssCommitmentCrDepAccount = value;
    }

    /**
     * Gets the value of the inInsuranceProductIssCommitmentCreditCardNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInInsuranceProductIssCommitmentCreditCardNo() {
        return inInsuranceProductIssCommitmentCreditCardNo;
    }

    /**
     * Sets the value of the inInsuranceProductIssCommitmentCreditCardNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInInsuranceProductIssCommitmentCreditCardNo(String value) {
        this.inInsuranceProductIssCommitmentCreditCardNo = value;
    }

    /**
     * Gets the value of the inInsuranceProductIssCommitmentDrAccCustomerId property.
     * 
     */
    public int getInInsuranceProductIssCommitmentDrAccCustomerId() {
        return inInsuranceProductIssCommitmentDrAccCustomerId;
    }

    /**
     * Sets the value of the inInsuranceProductIssCommitmentDrAccCustomerId property.
     * 
     */
    public void setInInsuranceProductIssCommitmentDrAccCustomerId(int value) {
        this.inInsuranceProductIssCommitmentDrAccCustomerId = value;
    }

    /**
     * Gets the value of the inInsuranceProductIssCommitmentEntryStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInInsuranceProductIssCommitmentEntryStatus() {
        return inInsuranceProductIssCommitmentEntryStatus;
    }

    /**
     * Sets the value of the inInsuranceProductIssCommitmentEntryStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInInsuranceProductIssCommitmentEntryStatus(String value) {
        this.inInsuranceProductIssCommitmentEntryStatus = value;
    }

    /**
     * Gets the value of the inInsuranceProductIssCommitmentExpirationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInInsuranceProductIssCommitmentExpirationDate() {
        return inInsuranceProductIssCommitmentExpirationDate;
    }

    /**
     * Sets the value of the inInsuranceProductIssCommitmentExpirationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInInsuranceProductIssCommitmentExpirationDate(XMLGregorianCalendar value) {
        this.inInsuranceProductIssCommitmentExpirationDate = value;
    }

    /**
     * Gets the value of the inInsuranceProductIssCommitmentFinalizeDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInInsuranceProductIssCommitmentFinalizeDate() {
        return inInsuranceProductIssCommitmentFinalizeDate;
    }

    /**
     * Sets the value of the inInsuranceProductIssCommitmentFinalizeDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInInsuranceProductIssCommitmentFinalizeDate(XMLGregorianCalendar value) {
        this.inInsuranceProductIssCommitmentFinalizeDate = value;
    }

    /**
     * Gets the value of the inInsuranceProductIssCommitmentFixAmnPay property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInInsuranceProductIssCommitmentFixAmnPay() {
        return inInsuranceProductIssCommitmentFixAmnPay;
    }

    /**
     * Sets the value of the inInsuranceProductIssCommitmentFixAmnPay property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInInsuranceProductIssCommitmentFixAmnPay(BigDecimal value) {
        this.inInsuranceProductIssCommitmentFixAmnPay = value;
    }

    /**
     * Gets the value of the inInsuranceProductIssCommitmentFkAccCd property.
     * 
     */
    public short getInInsuranceProductIssCommitmentFkAccCd() {
        return inInsuranceProductIssCommitmentFkAccCd;
    }

    /**
     * Sets the value of the inInsuranceProductIssCommitmentFkAccCd property.
     * 
     */
    public void setInInsuranceProductIssCommitmentFkAccCd(short value) {
        this.inInsuranceProductIssCommitmentFkAccCd = value;
    }

    /**
     * Gets the value of the inInsuranceProductIssCommitmentFkAccSn property.
     * 
     */
    public int getInInsuranceProductIssCommitmentFkAccSn() {
        return inInsuranceProductIssCommitmentFkAccSn;
    }

    /**
     * Sets the value of the inInsuranceProductIssCommitmentFkAccSn property.
     * 
     */
    public void setInInsuranceProductIssCommitmentFkAccSn(int value) {
        this.inInsuranceProductIssCommitmentFkAccSn = value;
    }

    /**
     * Gets the value of the inInsuranceProductIssCommitmentFkAccType property.
     * 
     */
    public short getInInsuranceProductIssCommitmentFkAccType() {
        return inInsuranceProductIssCommitmentFkAccType;
    }

    /**
     * Sets the value of the inInsuranceProductIssCommitmentFkAccType property.
     * 
     */
    public void setInInsuranceProductIssCommitmentFkAccType(short value) {
        this.inInsuranceProductIssCommitmentFkAccType = value;
    }

    /**
     * Gets the value of the inInsuranceProductIssCommitmentFkAccUnit property.
     * 
     */
    public int getInInsuranceProductIssCommitmentFkAccUnit() {
        return inInsuranceProductIssCommitmentFkAccUnit;
    }

    /**
     * Sets the value of the inInsuranceProductIssCommitmentFkAccUnit property.
     * 
     */
    public void setInInsuranceProductIssCommitmentFkAccUnit(int value) {
        this.inInsuranceProductIssCommitmentFkAccUnit = value;
    }

    /**
     * Gets the value of the inInsuranceProductIssCommitmentFkCategory property.
     * 
     */
    public int getInInsuranceProductIssCommitmentFkCategory() {
        return inInsuranceProductIssCommitmentFkCategory;
    }

    /**
     * Sets the value of the inInsuranceProductIssCommitmentFkCategory property.
     * 
     */
    public void setInInsuranceProductIssCommitmentFkCategory(int value) {
        this.inInsuranceProductIssCommitmentFkCategory = value;
    }

    /**
     * Gets the value of the inInsuranceProductIssCommitmentFkCnlUsr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInInsuranceProductIssCommitmentFkCnlUsr() {
        return inInsuranceProductIssCommitmentFkCnlUsr;
    }

    /**
     * Sets the value of the inInsuranceProductIssCommitmentFkCnlUsr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInInsuranceProductIssCommitmentFkCnlUsr(String value) {
        this.inInsuranceProductIssCommitmentFkCnlUsr = value;
    }

    /**
     * Gets the value of the inInsuranceProductIssCommitmentFkDebitAccount property.
     * 
     */
    public double getInInsuranceProductIssCommitmentFkDebitAccount() {
        return inInsuranceProductIssCommitmentFkDebitAccount;
    }

    /**
     * Sets the value of the inInsuranceProductIssCommitmentFkDebitAccount property.
     * 
     */
    public void setInInsuranceProductIssCommitmentFkDebitAccount(double value) {
        this.inInsuranceProductIssCommitmentFkDebitAccount = value;
    }

    /**
     * Gets the value of the inInsuranceProductIssCommitmentFkFinalizeUsr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInInsuranceProductIssCommitmentFkFinalizeUsr() {
        return inInsuranceProductIssCommitmentFkFinalizeUsr;
    }

    /**
     * Sets the value of the inInsuranceProductIssCommitmentFkFinalizeUsr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInInsuranceProductIssCommitmentFkFinalizeUsr(String value) {
        this.inInsuranceProductIssCommitmentFkFinalizeUsr = value;
    }

    /**
     * Gets the value of the inInsuranceProductIssCommitmentFkGenDetSerNum property.
     * 
     */
    public int getInInsuranceProductIssCommitmentFkGenDetSerNum() {
        return inInsuranceProductIssCommitmentFkGenDetSerNum;
    }

    /**
     * Sets the value of the inInsuranceProductIssCommitmentFkGenDetSerNum property.
     * 
     */
    public void setInInsuranceProductIssCommitmentFkGenDetSerNum(int value) {
        this.inInsuranceProductIssCommitmentFkGenDetSerNum = value;
    }

    /**
     * Gets the value of the inInsuranceProductIssCommitmentFkGenericHeadpar property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInInsuranceProductIssCommitmentFkGenericHeadpar() {
        return inInsuranceProductIssCommitmentFkGenericHeadpar;
    }

    /**
     * Sets the value of the inInsuranceProductIssCommitmentFkGenericHeadpar property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInInsuranceProductIssCommitmentFkGenericHeadpar(String value) {
        this.inInsuranceProductIssCommitmentFkGenericHeadpar = value;
    }

    /**
     * Gets the value of the inInsuranceProductIssCommitmentFkResponsibleUnit property.
     * 
     */
    public int getInInsuranceProductIssCommitmentFkResponsibleUnit() {
        return inInsuranceProductIssCommitmentFkResponsibleUnit;
    }

    /**
     * Sets the value of the inInsuranceProductIssCommitmentFkResponsibleUnit property.
     * 
     */
    public void setInInsuranceProductIssCommitmentFkResponsibleUnit(int value) {
        this.inInsuranceProductIssCommitmentFkResponsibleUnit = value;
    }

    /**
     * Gets the value of the inInsuranceProductIssCommitmentFkUpdUsr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInInsuranceProductIssCommitmentFkUpdUsr() {
        return inInsuranceProductIssCommitmentFkUpdUsr;
    }

    /**
     * Sets the value of the inInsuranceProductIssCommitmentFkUpdUsr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInInsuranceProductIssCommitmentFkUpdUsr(String value) {
        this.inInsuranceProductIssCommitmentFkUpdUsr = value;
    }

    /**
     * Gets the value of the inInsuranceProductIssCommitmentFrequency property.
     * 
     */
    public short getInInsuranceProductIssCommitmentFrequency() {
        return inInsuranceProductIssCommitmentFrequency;
    }

    /**
     * Sets the value of the inInsuranceProductIssCommitmentFrequency property.
     * 
     */
    public void setInInsuranceProductIssCommitmentFrequency(short value) {
        this.inInsuranceProductIssCommitmentFrequency = value;
    }

    /**
     * Gets the value of the inInsuranceProductIssCommitmentFrequencyUnit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInInsuranceProductIssCommitmentFrequencyUnit() {
        return inInsuranceProductIssCommitmentFrequencyUnit;
    }

    /**
     * Sets the value of the inInsuranceProductIssCommitmentFrequencyUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInInsuranceProductIssCommitmentFrequencyUnit(String value) {
        this.inInsuranceProductIssCommitmentFrequencyUnit = value;
    }

    /**
     * Gets the value of the inInsuranceProductIssCommitmentGradAppExpRatio property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInInsuranceProductIssCommitmentGradAppExpRatio() {
        return inInsuranceProductIssCommitmentGradAppExpRatio;
    }

    /**
     * Sets the value of the inInsuranceProductIssCommitmentGradAppExpRatio property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInInsuranceProductIssCommitmentGradAppExpRatio(BigDecimal value) {
        this.inInsuranceProductIssCommitmentGradAppExpRatio = value;
    }

    /**
     * Gets the value of the inInsuranceProductIssCommitmentInsuranceValue property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInInsuranceProductIssCommitmentInsuranceValue() {
        return inInsuranceProductIssCommitmentInsuranceValue;
    }

    /**
     * Sets the value of the inInsuranceProductIssCommitmentInsuranceValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInInsuranceProductIssCommitmentInsuranceValue(BigDecimal value) {
        this.inInsuranceProductIssCommitmentInsuranceValue = value;
    }

    /**
     * Gets the value of the inInsuranceProductIssCommitmentIssuanceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInInsuranceProductIssCommitmentIssuanceNumber() {
        return inInsuranceProductIssCommitmentIssuanceNumber;
    }

    /**
     * Sets the value of the inInsuranceProductIssCommitmentIssuanceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInInsuranceProductIssCommitmentIssuanceNumber(String value) {
        this.inInsuranceProductIssCommitmentIssuanceNumber = value;
    }

    /**
     * Gets the value of the inInsuranceProductIssCommitmentIssueDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInInsuranceProductIssCommitmentIssueDate() {
        return inInsuranceProductIssCommitmentIssueDate;
    }

    /**
     * Sets the value of the inInsuranceProductIssCommitmentIssueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInInsuranceProductIssCommitmentIssueDate(XMLGregorianCalendar value) {
        this.inInsuranceProductIssCommitmentIssueDate = value;
    }

    /**
     * Gets the value of the inInsuranceProductIssCommitmentIssueType property.
     * 
     */
    public short getInInsuranceProductIssCommitmentIssueType() {
        return inInsuranceProductIssCommitmentIssueType;
    }

    /**
     * Sets the value of the inInsuranceProductIssCommitmentIssueType property.
     * 
     */
    public void setInInsuranceProductIssCommitmentIssueType(short value) {
        this.inInsuranceProductIssCommitmentIssueType = value;
    }

    /**
     * Gets the value of the inInsuranceProductIssCommitmentLastUpdateDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInInsuranceProductIssCommitmentLastUpdateDate() {
        return inInsuranceProductIssCommitmentLastUpdateDate;
    }

    /**
     * Sets the value of the inInsuranceProductIssCommitmentLastUpdateDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInInsuranceProductIssCommitmentLastUpdateDate(XMLGregorianCalendar value) {
        this.inInsuranceProductIssCommitmentLastUpdateDate = value;
    }

    /**
     * Gets the value of the inInsuranceProductIssCommitmentLoadingCalc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInInsuranceProductIssCommitmentLoadingCalc() {
        return inInsuranceProductIssCommitmentLoadingCalc;
    }

    /**
     * Sets the value of the inInsuranceProductIssCommitmentLoadingCalc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInInsuranceProductIssCommitmentLoadingCalc(String value) {
        this.inInsuranceProductIssCommitmentLoadingCalc = value;
    }

    /**
     * Gets the value of the inInsuranceProductIssCommitmentLoanAccUntermRa property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInInsuranceProductIssCommitmentLoanAccUntermRa() {
        return inInsuranceProductIssCommitmentLoanAccUntermRa;
    }

    /**
     * Sets the value of the inInsuranceProductIssCommitmentLoanAccUntermRa property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInInsuranceProductIssCommitmentLoanAccUntermRa(BigDecimal value) {
        this.inInsuranceProductIssCommitmentLoanAccUntermRa = value;
    }

    /**
     * Gets the value of the inInsuranceProductIssCommitmentLoanInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInInsuranceProductIssCommitmentLoanInd() {
        return inInsuranceProductIssCommitmentLoanInd;
    }

    /**
     * Sets the value of the inInsuranceProductIssCommitmentLoanInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInInsuranceProductIssCommitmentLoanInd(String value) {
        this.inInsuranceProductIssCommitmentLoanInd = value;
    }

    /**
     * Gets the value of the inInsuranceProductIssCommitmentMainTpSoId property.
     * 
     */
    public double getInInsuranceProductIssCommitmentMainTpSoId() {
        return inInsuranceProductIssCommitmentMainTpSoId;
    }

    /**
     * Sets the value of the inInsuranceProductIssCommitmentMainTpSoId property.
     * 
     */
    public void setInInsuranceProductIssCommitmentMainTpSoId(double value) {
        this.inInsuranceProductIssCommitmentMainTpSoId = value;
    }

    /**
     * Gets the value of the inInsuranceProductIssCommitmentMaxNumberAttempts property.
     * 
     */
    public int getInInsuranceProductIssCommitmentMaxNumberAttempts() {
        return inInsuranceProductIssCommitmentMaxNumberAttempts;
    }

    /**
     * Sets the value of the inInsuranceProductIssCommitmentMaxNumberAttempts property.
     * 
     */
    public void setInInsuranceProductIssCommitmentMaxNumberAttempts(int value) {
        this.inInsuranceProductIssCommitmentMaxNumberAttempts = value;
    }

    /**
     * Gets the value of the inInsuranceProductIssCommitmentNumberOfAttempts property.
     * 
     */
    public short getInInsuranceProductIssCommitmentNumberOfAttempts() {
        return inInsuranceProductIssCommitmentNumberOfAttempts;
    }

    /**
     * Sets the value of the inInsuranceProductIssCommitmentNumberOfAttempts property.
     * 
     */
    public void setInInsuranceProductIssCommitmentNumberOfAttempts(short value) {
        this.inInsuranceProductIssCommitmentNumberOfAttempts = value;
    }

    /**
     * Gets the value of the inInsuranceProductIssCommitmentOnceOnlyCharge property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInInsuranceProductIssCommitmentOnceOnlyCharge() {
        return inInsuranceProductIssCommitmentOnceOnlyCharge;
    }

    /**
     * Sets the value of the inInsuranceProductIssCommitmentOnceOnlyCharge property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInInsuranceProductIssCommitmentOnceOnlyCharge(BigDecimal value) {
        this.inInsuranceProductIssCommitmentOnceOnlyCharge = value;
    }

    /**
     * Gets the value of the inInsuranceProductIssCommitmentOtherOutstBal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInInsuranceProductIssCommitmentOtherOutstBal() {
        return inInsuranceProductIssCommitmentOtherOutstBal;
    }

    /**
     * Sets the value of the inInsuranceProductIssCommitmentOtherOutstBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInInsuranceProductIssCommitmentOtherOutstBal(BigDecimal value) {
        this.inInsuranceProductIssCommitmentOtherOutstBal = value;
    }

    /**
     * Gets the value of the inInsuranceProductIssCommitmentPayableAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInInsuranceProductIssCommitmentPayableAmount() {
        return inInsuranceProductIssCommitmentPayableAmount;
    }

    /**
     * Sets the value of the inInsuranceProductIssCommitmentPayableAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInInsuranceProductIssCommitmentPayableAmount(BigDecimal value) {
        this.inInsuranceProductIssCommitmentPayableAmount = value;
    }

    /**
     * Gets the value of the inInsuranceProductIssCommitmentPEntryStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInInsuranceProductIssCommitmentPEntryStatus() {
        return inInsuranceProductIssCommitmentPEntryStatus;
    }

    /**
     * Sets the value of the inInsuranceProductIssCommitmentPEntryStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInInsuranceProductIssCommitmentPEntryStatus(String value) {
        this.inInsuranceProductIssCommitmentPEntryStatus = value;
    }

    /**
     * Gets the value of the inInsuranceProductIssCommitmentReinstatementVal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInInsuranceProductIssCommitmentReinstatementVal() {
        return inInsuranceProductIssCommitmentReinstatementVal;
    }

    /**
     * Sets the value of the inInsuranceProductIssCommitmentReinstatementVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInInsuranceProductIssCommitmentReinstatementVal(BigDecimal value) {
        this.inInsuranceProductIssCommitmentReinstatementVal = value;
    }

    /**
     * Gets the value of the inInsuranceProductIssCommitmentRenewalDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInInsuranceProductIssCommitmentRenewalDate() {
        return inInsuranceProductIssCommitmentRenewalDate;
    }

    /**
     * Sets the value of the inInsuranceProductIssCommitmentRenewalDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInInsuranceProductIssCommitmentRenewalDate(XMLGregorianCalendar value) {
        this.inInsuranceProductIssCommitmentRenewalDate = value;
    }

    /**
     * Gets the value of the inInsuranceProductIssCommitmentReqCount property.
     * 
     */
    public short getInInsuranceProductIssCommitmentReqCount() {
        return inInsuranceProductIssCommitmentReqCount;
    }

    /**
     * Sets the value of the inInsuranceProductIssCommitmentReqCount property.
     * 
     */
    public void setInInsuranceProductIssCommitmentReqCount(short value) {
        this.inInsuranceProductIssCommitmentReqCount = value;
    }

    /**
     * Gets the value of the inInsuranceProductIssCommitmentSaleUser property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInInsuranceProductIssCommitmentSaleUser() {
        return inInsuranceProductIssCommitmentSaleUser;
    }

    /**
     * Sets the value of the inInsuranceProductIssCommitmentSaleUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInInsuranceProductIssCommitmentSaleUser(String value) {
        this.inInsuranceProductIssCommitmentSaleUser = value;
    }

    /**
     * Gets the value of the inInsuranceProductIssCommitmentSecondaryCustId property.
     * 
     */
    public int getInInsuranceProductIssCommitmentSecondaryCustId() {
        return inInsuranceProductIssCommitmentSecondaryCustId;
    }

    /**
     * Sets the value of the inInsuranceProductIssCommitmentSecondaryCustId property.
     * 
     */
    public void setInInsuranceProductIssCommitmentSecondaryCustId(int value) {
        this.inInsuranceProductIssCommitmentSecondaryCustId = value;
    }

    /**
     * Gets the value of the inInsuranceProductIssCommitmentServiceProduct property.
     * 
     */
    public int getInInsuranceProductIssCommitmentServiceProduct() {
        return inInsuranceProductIssCommitmentServiceProduct;
    }

    /**
     * Sets the value of the inInsuranceProductIssCommitmentServiceProduct property.
     * 
     */
    public void setInInsuranceProductIssCommitmentServiceProduct(int value) {
        this.inInsuranceProductIssCommitmentServiceProduct = value;
    }

    /**
     * Gets the value of the inInsuranceProductIssCommitmentThirdCustId property.
     * 
     */
    public int getInInsuranceProductIssCommitmentThirdCustId() {
        return inInsuranceProductIssCommitmentThirdCustId;
    }

    /**
     * Sets the value of the inInsuranceProductIssCommitmentThirdCustId property.
     * 
     */
    public void setInInsuranceProductIssCommitmentThirdCustId(int value) {
        this.inInsuranceProductIssCommitmentThirdCustId = value;
    }

    /**
     * Gets the value of the inInsuranceProductIssCommitmentTpSoIdentifier property.
     * 
     */
    public double getInInsuranceProductIssCommitmentTpSoIdentifier() {
        return inInsuranceProductIssCommitmentTpSoIdentifier;
    }

    /**
     * Sets the value of the inInsuranceProductIssCommitmentTpSoIdentifier property.
     * 
     */
    public void setInInsuranceProductIssCommitmentTpSoIdentifier(double value) {
        this.inInsuranceProductIssCommitmentTpSoIdentifier = value;
    }

    /**
     * Gets the value of the inInsuranceProductIssCommitmentTransactSm property.
     * 
     */
    public int getInInsuranceProductIssCommitmentTransactSm() {
        return inInsuranceProductIssCommitmentTransactSm;
    }

    /**
     * Sets the value of the inInsuranceProductIssCommitmentTransactSm property.
     * 
     */
    public void setInInsuranceProductIssCommitmentTransactSm(int value) {
        this.inInsuranceProductIssCommitmentTransactSm = value;
    }

    /**
     * Gets the value of the inInsuranceProductIssCommitmentValuePayRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInInsuranceProductIssCommitmentValuePayRate() {
        return inInsuranceProductIssCommitmentValuePayRate;
    }

    /**
     * Sets the value of the inInsuranceProductIssCommitmentValuePayRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInInsuranceProductIssCommitmentValuePayRate(BigDecimal value) {
        this.inInsuranceProductIssCommitmentValuePayRate = value;
    }

    /**
     * Gets the value of the inInsuranceProductIssCommitmentTmstamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInInsuranceProductIssCommitmentTmstamp() {
        return inInsuranceProductIssCommitmentTmstamp;
    }

    /**
     * Sets the value of the inInsuranceProductIssCommitmentTmstamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInInsuranceProductIssCommitmentTmstamp(XMLGregorianCalendar value) {
        this.inInsuranceProductIssCommitmentTmstamp = value;
    }

    /**
     * Gets the value of the inIssComitmentAprIssCommitmentAppApprDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInIssComitmentAprIssCommitmentAppApprDate() {
        return inIssComitmentAprIssCommitmentAppApprDate;
    }

    /**
     * Sets the value of the inIssComitmentAprIssCommitmentAppApprDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInIssComitmentAprIssCommitmentAppApprDate(XMLGregorianCalendar value) {
        this.inIssComitmentAprIssCommitmentAppApprDate = value;
    }

    /**
     * Gets the value of the inIssComitmentAprIssCommitmentAppApprUser property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInIssComitmentAprIssCommitmentAppApprUser() {
        return inIssComitmentAprIssCommitmentAppApprUser;
    }

    /**
     * Sets the value of the inIssComitmentAprIssCommitmentAppApprUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInIssComitmentAprIssCommitmentAppApprUser(String value) {
        this.inIssComitmentAprIssCommitmentAppApprUser = value;
    }

    /**
     * Gets the value of the inIssComitmentAprIssCommitmentAppDocId property.
     * 
     */
    public int getInIssComitmentAprIssCommitmentAppDocId() {
        return inIssComitmentAprIssCommitmentAppDocId;
    }

    /**
     * Sets the value of the inIssComitmentAprIssCommitmentAppDocId property.
     * 
     */
    public void setInIssComitmentAprIssCommitmentAppDocId(int value) {
        this.inIssComitmentAprIssCommitmentAppDocId = value;
    }

    /**
     * Gets the value of the inIssComitmentAprIssCommitmentAppEntryStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInIssComitmentAprIssCommitmentAppEntryStatus() {
        return inIssComitmentAprIssCommitmentAppEntryStatus;
    }

    /**
     * Sets the value of the inIssComitmentAprIssCommitmentAppEntryStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInIssComitmentAprIssCommitmentAppEntryStatus(String value) {
        this.inIssComitmentAprIssCommitmentAppEntryStatus = value;
    }

    /**
     * Gets the value of the inIssComitmentAprIssCommitmentAppTpSoIdentifier property.
     * 
     */
    public double getInIssComitmentAprIssCommitmentAppTpSoIdentifier() {
        return inIssComitmentAprIssCommitmentAppTpSoIdentifier;
    }

    /**
     * Sets the value of the inIssComitmentAprIssCommitmentAppTpSoIdentifier property.
     * 
     */
    public void setInIssComitmentAprIssCommitmentAppTpSoIdentifier(double value) {
        this.inIssComitmentAprIssCommitmentAppTpSoIdentifier = value;
    }

    /**
     * Gets the value of the inPackageIdPackage property.
     * 
     */
    public int getInPackageIdPackage() {
        return inPackageIdPackage;
    }

    /**
     * Sets the value of the inPackageIdPackage property.
     * 
     */
    public void setInPackageIdPackage(int value) {
        this.inPackageIdPackage = value;
    }

    /**
     * Gets the value of the inProxyCommandIefSuppliedCommand property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInProxyCommandIefSuppliedCommand() {
        return inProxyCommandIefSuppliedCommand;
    }

    /**
     * Sets the value of the inProxyCommandIefSuppliedCommand property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInProxyCommandIefSuppliedCommand(String value) {
        this.inProxyCommandIefSuppliedCommand = value;
    }

    /**
     * Gets the value of the inTheftCodeGenericDetailSerialNum property.
     * 
     */
    public int getInTheftCodeGenericDetailSerialNum() {
        return inTheftCodeGenericDetailSerialNum;
    }

    /**
     * Sets the value of the inTheftCodeGenericDetailSerialNum property.
     * 
     */
    public void setInTheftCodeGenericDetailSerialNum(int value) {
        this.inTheftCodeGenericDetailSerialNum = value;
    }

    /**
     * Gets the value of the inUpdDamgsIssDamageDtlDamageAmnt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInUpdDamgsIssDamageDtlDamageAmnt() {
        return inUpdDamgsIssDamageDtlDamageAmnt;
    }

    /**
     * Sets the value of the inUpdDamgsIssDamageDtlDamageAmnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInUpdDamgsIssDamageDtlDamageAmnt(BigDecimal value) {
        this.inUpdDamgsIssDamageDtlDamageAmnt = value;
    }

    /**
     * Gets the value of the inUpdDamgsIssDamageDtlReplaced property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInUpdDamgsIssDamageDtlReplaced() {
        return inUpdDamgsIssDamageDtlReplaced;
    }

    /**
     * Sets the value of the inUpdDamgsIssDamageDtlReplaced property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInUpdDamgsIssDamageDtlReplaced(String value) {
        this.inUpdDamgsIssDamageDtlReplaced = value;
    }

    /**
     * Gets the value of the inUpdDamgsIssDamageDtlTpSoIdentifier property.
     * 
     */
    public double getInUpdDamgsIssDamageDtlTpSoIdentifier() {
        return inUpdDamgsIssDamageDtlTpSoIdentifier;
    }

    /**
     * Sets the value of the inUpdDamgsIssDamageDtlTpSoIdentifier property.
     * 
     */
    public void setInUpdDamgsIssDamageDtlTpSoIdentifier(double value) {
        this.inUpdDamgsIssDamageDtlTpSoIdentifier = value;
    }

    /**
     * Gets the value of the inUpdDamgsIssDamageDtlTypeCode property.
     * 
     */
    public int getInUpdDamgsIssDamageDtlTypeCode() {
        return inUpdDamgsIssDamageDtlTypeCode;
    }

    /**
     * Sets the value of the inUpdDamgsIssDamageDtlTypeCode property.
     * 
     */
    public void setInUpdDamgsIssDamageDtlTypeCode(int value) {
        this.inUpdDamgsIssDamageDtlTypeCode = value;
    }

    /**
     * Gets the value of the inUpdDamgsIssDamageDtlYear property.
     * 
     */
    public short getInUpdDamgsIssDamageDtlYear() {
        return inUpdDamgsIssDamageDtlYear;
    }

    /**
     * Sets the value of the inUpdDamgsIssDamageDtlYear property.
     * 
     */
    public void setInUpdDamgsIssDamageDtlYear(short value) {
        this.inUpdDamgsIssDamageDtlYear = value;
    }

    /**
     * Gets the value of the inLoanAccProfitsAccountAccountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInLoanAccProfitsAccountAccountNumber() {
        return inLoanAccProfitsAccountAccountNumber;
    }

    /**
     * Sets the value of the inLoanAccProfitsAccountAccountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInLoanAccProfitsAccountAccountNumber(String value) {
        this.inLoanAccProfitsAccountAccountNumber = value;
    }

    /**
     * Gets the value of the inLoanAccProfitsAccountAccountCd property.
     * 
     */
    public short getInLoanAccProfitsAccountAccountCd() {
        return inLoanAccProfitsAccountAccountCd;
    }

    /**
     * Sets the value of the inLoanAccProfitsAccountAccountCd property.
     * 
     */
    public void setInLoanAccProfitsAccountAccountCd(short value) {
        this.inLoanAccProfitsAccountAccountCd = value;
    }

    /**
     * Gets the value of the inLoanAccProfitsAccountPrftSystem property.
     * 
     */
    public short getInLoanAccProfitsAccountPrftSystem() {
        return inLoanAccProfitsAccountPrftSystem;
    }

    /**
     * Sets the value of the inLoanAccProfitsAccountPrftSystem property.
     * 
     */
    public void setInLoanAccProfitsAccountPrftSystem(short value) {
        this.inLoanAccProfitsAccountPrftSystem = value;
    }

    /**
     * Gets the value of the inDepositAccProfitsAccountAccountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInDepositAccProfitsAccountAccountNumber() {
        return inDepositAccProfitsAccountAccountNumber;
    }

    /**
     * Sets the value of the inDepositAccProfitsAccountAccountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInDepositAccProfitsAccountAccountNumber(String value) {
        this.inDepositAccProfitsAccountAccountNumber = value;
    }

    /**
     * Gets the value of the inDepositAccProfitsAccountAccountCd property.
     * 
     */
    public short getInDepositAccProfitsAccountAccountCd() {
        return inDepositAccProfitsAccountAccountCd;
    }

    /**
     * Sets the value of the inDepositAccProfitsAccountAccountCd property.
     * 
     */
    public void setInDepositAccProfitsAccountAccountCd(short value) {
        this.inDepositAccProfitsAccountAccountCd = value;
    }

    /**
     * Gets the value of the inDepositAccProfitsAccountPrftSystem property.
     * 
     */
    public short getInDepositAccProfitsAccountPrftSystem() {
        return inDepositAccProfitsAccountPrftSystem;
    }

    /**
     * Sets the value of the inDepositAccProfitsAccountPrftSystem property.
     * 
     */
    public void setInDepositAccProfitsAccountPrftSystem(short value) {
        this.inDepositAccProfitsAccountPrftSystem = value;
    }

    /**
     * Gets the value of the inCrDepProfitsAccountAccountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCrDepProfitsAccountAccountNumber() {
        return inCrDepProfitsAccountAccountNumber;
    }

    /**
     * Sets the value of the inCrDepProfitsAccountAccountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCrDepProfitsAccountAccountNumber(String value) {
        this.inCrDepProfitsAccountAccountNumber = value;
    }

    /**
     * Gets the value of the inCrDepProfitsAccountAccountCd property.
     * 
     */
    public short getInCrDepProfitsAccountAccountCd() {
        return inCrDepProfitsAccountAccountCd;
    }

    /**
     * Sets the value of the inCrDepProfitsAccountAccountCd property.
     * 
     */
    public void setInCrDepProfitsAccountAccountCd(short value) {
        this.inCrDepProfitsAccountAccountCd = value;
    }

    /**
     * Gets the value of the inCrDepProfitsAccountPrftSystem property.
     * 
     */
    public short getInCrDepProfitsAccountPrftSystem() {
        return inCrDepProfitsAccountPrftSystem;
    }

    /**
     * Sets the value of the inCrDepProfitsAccountPrftSystem property.
     * 
     */
    public void setInCrDepProfitsAccountPrftSystem(short value) {
        this.inCrDepProfitsAccountPrftSystem = value;
    }

    /**
     * Gets the value of the inCoinsuredGrp property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfInCoinsuredGrpInCoinsuredGrmIssCommitmentCoinsItem }
     *     
     */
    public ArrayOfInCoinsuredGrpInCoinsuredGrmIssCommitmentCoinsItem getInCoinsuredGrp() {
        return inCoinsuredGrp;
    }

    /**
     * Sets the value of the inCoinsuredGrp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfInCoinsuredGrpInCoinsuredGrmIssCommitmentCoinsItem }
     *     
     */
    public void setInCoinsuredGrp(ArrayOfInCoinsuredGrpInCoinsuredGrmIssCommitmentCoinsItem value) {
        this.inCoinsuredGrp = value;
    }

    /**
     * Gets the value of the inInsuranceProductIssCommitmentFkInsurValCurr property.
     * 
     */
    public int getInInsuranceProductIssCommitmentFkInsurValCurr() {
        return inInsuranceProductIssCommitmentFkInsurValCurr;
    }

    /**
     * Sets the value of the inInsuranceProductIssCommitmentFkInsurValCurr property.
     * 
     */
    public void setInInsuranceProductIssCommitmentFkInsurValCurr(int value) {
        this.inInsuranceProductIssCommitmentFkInsurValCurr = value;
    }

    /**
     * Gets the value of the inInsuranceAmountCurrencyIdCurrency property.
     * 
     */
    public int getInInsuranceAmountCurrencyIdCurrency() {
        return inInsuranceAmountCurrencyIdCurrency;
    }

    /**
     * Sets the value of the inInsuranceAmountCurrencyIdCurrency property.
     * 
     */
    public void setInInsuranceAmountCurrencyIdCurrency(int value) {
        this.inInsuranceAmountCurrencyIdCurrency = value;
    }

    /**
     * Gets the value of the inInsuranceAmountCurrencyShortDescr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInInsuranceAmountCurrencyShortDescr() {
        return inInsuranceAmountCurrencyShortDescr;
    }

    /**
     * Sets the value of the inInsuranceAmountCurrencyShortDescr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInInsuranceAmountCurrencyShortDescr(String value) {
        this.inInsuranceAmountCurrencyShortDescr = value;
    }

    /**
     * Gets the value of the inInsuranceAmountCurrencyIsoCode property.
     * 
     */
    public short getInInsuranceAmountCurrencyIsoCode() {
        return inInsuranceAmountCurrencyIsoCode;
    }

    /**
     * Sets the value of the inInsuranceAmountCurrencyIsoCode property.
     * 
     */
    public void setInInsuranceAmountCurrencyIsoCode(short value) {
        this.inInsuranceAmountCurrencyIsoCode = value;
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
     * Gets the value of the inInsuranceProductIssCommitmentCalculationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInInsuranceProductIssCommitmentCalculationDate() {
        return inInsuranceProductIssCommitmentCalculationDate;
    }

    /**
     * Sets the value of the inInsuranceProductIssCommitmentCalculationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInInsuranceProductIssCommitmentCalculationDate(XMLGregorianCalendar value) {
        this.inInsuranceProductIssCommitmentCalculationDate = value;
    }

}
