
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for Mc2006VPropertyManagementExport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Mc2006VPropertyManagementExport">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}BaseExport">
 *       &lt;sequence>
 *         &lt;element name="OutAccountBalanceIefSuppliedAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutAccountCurrencyShortDescr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutAdddiGenericDetailDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutAdddiGenericDetailParameterType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutAdddiGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutAgreementAgrMembershipSn" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutAgreementAgrSn" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutAgreementAgrYear" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutAgrUnitCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutBaselGenericDetailDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutBaselGenericDetailParameterType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutBaselGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutCntryGenericDetailDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCntryGenericDetailParameterType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCntryGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutCollateralTypeAssociationInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCollateralTypeAssurValCalcInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCollateralTypeLandRegistryInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCollateralTypeReliabilityCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCollateralTypeReliabilityFct" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutCollateralTypeValueFct" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutCollateralWorkEstimatedAccountLossAc" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutCollateralWorkEstimatedAccountLossDc" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutCollateralWorkEstimatedInsurValueAc" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutCollateralWorkEstimatedInsurValueDc" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutCollateralWorkEstimatedValueAc" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutCollateralWorkEstimatedValueDc" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutCreatedRealEstateId" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OutCustomerCDigit" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutCustomerCustId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutCustomerFirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustomerSurname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpAuxSpace" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}ArrayOfMc2006VOutGrpAuxSpaceItem" minOccurs="0"/>
 *         &lt;element name="OutGrpCustomer" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}ArrayOfMc2006VOutGrpCustomerItem" minOccurs="0"/>
 *         &lt;element name="OutGrpDefRealEst" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}ArrayOfMc2006VOutGrpDefRealEstItem" minOccurs="0"/>
 *         &lt;element name="OutGrpEval" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}ArrayOfMc2006VOutGrpEvalItem" minOccurs="0"/>
 *         &lt;element name="OutGrpQualInfo" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}ArrayOfMc2006VOutGrpQualInfoItem" minOccurs="0"/>
 *         &lt;element name="OutGrpValuers" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}ArrayOfMc2006VOutGrpValuersItem" minOccurs="0"/>
 *         &lt;element name="OutInsertUnitCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutInsertUnitUnitName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutInsUsrCharSuppliedChar40" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutLastCommCurrCurrencyShortDescr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutLastEsrIncCurrCurrencyShortDescr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutLastInsurAmnCurrCurrencyShortDescr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutLastInvCurrIdCurrencyShortDescr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutLastMortAmnCurrCurrencyShortDescr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutLastObjCurrCurrencyShortDescr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutLastPrpermeCurrCurrencyShortDescr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutLastRealEstateAddDescr1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutLastRealEstateAddDescr2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutLastRealEstateAddDescr3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutLastRealEstateAddDescr4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutLastRealEstateAddDescr5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutLastRealEstateAdditionalArea" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutLastRealEstateAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutLastRealEstateAddressNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutLastRealEstateAgreementValue" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutLastRealEstateApartmentNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutLastRealEstateBuilding" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutLastRealEstateCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutLastRealEstateCommercialValAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutLastRealEstateConstructionYear" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutLastRealEstateCourt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutLastRealEstateDistrictRegistry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutLastRealEstateEntryStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutLastRealEstateEstate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutLastRealEstateEvalluationInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutLastRealEstateFrontageInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutLastRealEstateId" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OutLastRealEstateInsertionDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutLastRealEstateInsertionUsr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutLastRealEstateInsOriginalAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutLastRealEstateInsuranceAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutLastRealEstateInsuranceDescr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutLastRealEstateInsuranceEd" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutLastRealEstateInsuranceSd" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutLastRealEstateMainArea" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutLastRealEstateModificationDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutLastRealEstateModificationUsr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutLastRealEstateMunicipality" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutLastRealEstateOwnershipInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutLastRealEstateParLandRegistId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutLastRealEstateRealEstateCat" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutLastRealEstateRealEstateDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutLastRealEstateRealEstateType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutLastRealEstateReevalFreq" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutLastRealEstateRegion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutLastRealEstateRegistry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutLastRealEstateRegistryTitleNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutLastRealEstateTitleExpiryDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutLastRealEstateTitleIssueDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutLastRealEstateTitleNatureType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutLastRealEstateTitleTerm" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutLastRealEstateTrxUnit" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutLastRealEstateUnitNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutLastRealEstateZipCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutLastRealEstateApprslAdoptionValDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutLastRealEstateApprslApraisalCmnts" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutLastRealEstateApprslCommercValue" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutLastRealEstateApprslEntryStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutLastRealEstateApprslEstInsurAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutLastRealEstateApprslEstRentalIncAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutLastRealEstateApprslEvaluationDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutLastRealEstateApprslEvaluator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutLastRealEstateApprslInternalSn" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OutLastRealEstateApprslInvestmentAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutLastRealEstateApprslMortgageValue" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutLastRealEstateApprslObjectiveAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutLastRealEstateApprslPricePerMeter" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutLastRealEstateApprslSellValue" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutLastSelAmnCurrCurrencyShortDescr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutLastValuationTypeGenericDetailDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutLeas2GenericDetailDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutLeas2GenericDetailParameterType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutLeas2GenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutLoanAccountAccCd" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutLoanAccountAccSn" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutLoanAccountAccType" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutLoanAccUnitCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutLoanAccUnitEntryStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutLoanAccUnitUnitName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutLoanProductDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutLoanProductIdProduct" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutLoopFlagIefSuppliedFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutNatureTitleGenericDetailDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutNatureTitleGenericDetailParameterType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutNatureTitleGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutRecatGenericDetailDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutRecatGenericDetailParameterType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutRecatGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutRecbkGenericDetailDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutRecbkGenericDetailParameterType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutRecbkGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutReincGenericDetailDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutReincGenericDetailParameterType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutReincGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutReinsGenericDetailDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutReinsGenericDetailParameterType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutReinsGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutRelocGenericDetailDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutRelocGenericDetailParameterType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutRelocGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutRetypGenericDetailDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutRetypGenericDetailParameterType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutRetypGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutSelectedRealEstateAddDescr1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSelectedRealEstateAddDescr2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSelectedRealEstateAddDescr3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSelectedRealEstateAddDescr4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSelectedRealEstateAddDescr5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSelectedRealEstateAdditionalArea" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutSelectedRealEstateAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSelectedRealEstateAddressNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSelectedRealEstateAgreementValue" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutSelectedRealEstateAnnualRentAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutSelectedRealEstateApartmentNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSelectedRealEstateBuilding" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSelectedRealEstateBuildLicenceid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSelectedRealEstateCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSelectedRealEstateCommercialValAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutSelectedRealEstateConstrCostAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutSelectedRealEstateConstructionYear" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutSelectedRealEstateCourt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSelectedRealEstateDistrictRegistry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSelectedRealEstateEntryStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSelectedRealEstateEstate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSelectedRealEstateEvalluationInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSelectedRealEstateFrontageInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSelectedRealEstateId" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OutSelectedRealEstateInsertionDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutSelectedRealEstateInsertionUsr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSelectedRealEstateInsOriginalAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutSelectedRealEstateInsuranceAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutSelectedRealEstateInsuranceDescr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSelectedRealEstateInsuranceEd" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutSelectedRealEstateInsuranceSd" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutSelectedRealEstateIssueYear" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutSelectedRealEstateLandRegistId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSelectedRealEstateLegalProblems" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSelectedRealEstateMainArea" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutSelectedRealEstateModificationDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutSelectedRealEstateModificationUsr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSelectedRealEstateMonTotParkNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutSelectedRealEstateMonTotStoreNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutSelectedRealEstateMortgageArea" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutSelectedRealEstateMunicipality" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSelectedRealEstateOutdoorAtticA" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutSelectedRealEstateOwnershipInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSelectedRealEstateParkingValAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutSelectedRealEstateParLandRegistId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSelectedRealEstateRealEstateCat" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSelectedRealEstateRealEstateDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSelectedRealEstateRealEstateType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSelectedRealEstateRealEstValAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutSelectedRealEstateReevalFreq" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutSelectedRealEstateRegion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSelectedRealEstateRegistry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSelectedRealEstateRegistryTitleNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSelectedRealEstateRentalDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutSelectedRealEstateRentingComments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSelectedRealEstateSiteValueAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutSelectedRealEstateStoreRoomNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutSelectedRealEstateStoreValueAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutSelectedRealEstateTitleExpiryDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutSelectedRealEstateTitleIssueDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutSelectedRealEstateTitleNatureType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSelectedRealEstateTitleTerm" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutSelectedRealEstateTotalSiteArea" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutSelectedRealEstateTotalValueAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutSelectedRealEstateTotParkArea" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutSelectedRealEstateTotParkNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutSelectedRealEstateTotStoreArea" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutSelectedRealEstateTrxUnit" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutSelectedRealEstateUnitNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSelectedRealEstateUrbanPlanPro" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSelectedRealEstateValueDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutSelectedRealEstateZipCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutToContinueGenericDetailParameterType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutToContinueGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutUpdUsrCharSuppliedChar40" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutValuerInternalFlg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutValuerValuerAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutValuerValuerEmail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutValuerValuerId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutValuerValuerMobile" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutValuerValuerName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutValuerValuerPhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutValuerCountyGenericDetailDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutValuerCountyGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutLastRealEstateApprslEvalluationInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutLastRealEstateApprslReevalFreq" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutCollatParametersGenericDetFlg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutTotalSiteAreaGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutTotalSiteAreaGenericDetailShortDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutTotalSiteAreaGenericDetailParameterType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutTotalSiteAreaGenericDetailDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutMainAreaGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutMainAreaGenericDetailShortDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutMainAreaGenericDetailParameterType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutMainAreaGenericDetailDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutOutdoorAtticAreaGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutOutdoorAtticAreaGenericDetailShortDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutOutdoorAtticAreaGenericDetailParameterType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutOutdoorAtticAreaGenericDetailDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutAdditionalAreaGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutAdditionalAreaGenericDetailShortDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutAdditionalAreaGenericDetailParameterType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutAdditionalAreaGenericDetailDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutMortgageAreaGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutMortgageAreaGenericDetailShortDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutMortgageAreaGenericDetailParameterType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutMortgageAreaGenericDetailDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutTotStoreAreaGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutTotStoreAreaGenericDetailShortDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutTotStoreAreaGenericDetailParameterType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutTotStoreAreaGenericDetailDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutTotParkAreaGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutTotParkAreaGenericDetailShortDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutTotParkAreaGenericDetailParameterType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutTotParkAreaGenericDetailDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSelectedRealEstatePlotNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSelectedRealEstateBlockNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSelectedRealEstateCondPlanNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSelectedRealEstateInstrumentNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSelectedRealEstateMarketability" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSelectedRealEstateGpsCoord" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSelectedRealEstateCopyOfTitle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSelectedRealEstateTitleSubmDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutSelectedRealEstateTitleReturnDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutSelectedRealEstateInsurPolicyNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
 *         &lt;element name="OutTitleCustAddrParrelDCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutTitleCustAddrParrelDSn" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutTitleCustAddrParrelDP01Desc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutTitleCustAddrParrelDP02Desc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutTitleCustAddrParrelDP03Desc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutTitleCustAddrParrelDP04Desc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutTitleCustAddrParrelDP05Desc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutTitleCustAddrParrelDP06Desc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutTitleCustAddrParrelDP07Desc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutTitleCustAddrParrelDP08Desc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutTitleCustAddrParrelDP09Desc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutTitleCustAddrParrelDP10Desc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSelectedRealEstateFolio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSelectedRealEstateInsurAnnualAmnt" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Mc2006VPropertyManagementExport", propOrder = {
    "outAccountBalanceIefSuppliedAmount",
    "outAccountCurrencyShortDescr",
    "outAdddiGenericDetailDescription",
    "outAdddiGenericDetailParameterType",
    "outAdddiGenericDetailSerialNum",
    "outAgreementAgrMembershipSn",
    "outAgreementAgrSn",
    "outAgreementAgrYear",
    "outAgrUnitCode",
    "outBaselGenericDetailDescription",
    "outBaselGenericDetailParameterType",
    "outBaselGenericDetailSerialNum",
    "outCntryGenericDetailDescription",
    "outCntryGenericDetailParameterType",
    "outCntryGenericDetailSerialNum",
    "outCollateralTypeAssociationInd",
    "outCollateralTypeAssurValCalcInd",
    "outCollateralTypeLandRegistryInd",
    "outCollateralTypeReliabilityCode",
    "outCollateralTypeReliabilityFct",
    "outCollateralTypeValueFct",
    "outCollateralWorkEstimatedAccountLossAc",
    "outCollateralWorkEstimatedAccountLossDc",
    "outCollateralWorkEstimatedInsurValueAc",
    "outCollateralWorkEstimatedInsurValueDc",
    "outCollateralWorkEstimatedValueAc",
    "outCollateralWorkEstimatedValueDc",
    "outCreatedRealEstateId",
    "outCustomerCDigit",
    "outCustomerCustId",
    "outCustomerFirstName",
    "outCustomerSurname",
    "outGrpAuxSpace",
    "outGrpCustomer",
    "outGrpDefRealEst",
    "outGrpEval",
    "outGrpQualInfo",
    "outGrpValuers",
    "outInsertUnitCode",
    "outInsertUnitUnitName",
    "outInsUsrCharSuppliedChar40",
    "outLastCommCurrCurrencyShortDescr",
    "outLastEsrIncCurrCurrencyShortDescr",
    "outLastInsurAmnCurrCurrencyShortDescr",
    "outLastInvCurrIdCurrencyShortDescr",
    "outLastMortAmnCurrCurrencyShortDescr",
    "outLastObjCurrCurrencyShortDescr",
    "outLastPrpermeCurrCurrencyShortDescr",
    "outLastRealEstateAddDescr1",
    "outLastRealEstateAddDescr2",
    "outLastRealEstateAddDescr3",
    "outLastRealEstateAddDescr4",
    "outLastRealEstateAddDescr5",
    "outLastRealEstateAdditionalArea",
    "outLastRealEstateAddress",
    "outLastRealEstateAddressNum",
    "outLastRealEstateAgreementValue",
    "outLastRealEstateApartmentNum",
    "outLastRealEstateBuilding",
    "outLastRealEstateCity",
    "outLastRealEstateCommercialValAmn",
    "outLastRealEstateConstructionYear",
    "outLastRealEstateCourt",
    "outLastRealEstateDistrictRegistry",
    "outLastRealEstateEntryStatus",
    "outLastRealEstateEstate",
    "outLastRealEstateEvalluationInd",
    "outLastRealEstateFrontageInd",
    "outLastRealEstateId",
    "outLastRealEstateInsertionDt",
    "outLastRealEstateInsertionUsr",
    "outLastRealEstateInsOriginalAmn",
    "outLastRealEstateInsuranceAmn",
    "outLastRealEstateInsuranceDescr",
    "outLastRealEstateInsuranceEd",
    "outLastRealEstateInsuranceSd",
    "outLastRealEstateMainArea",
    "outLastRealEstateModificationDt",
    "outLastRealEstateModificationUsr",
    "outLastRealEstateMunicipality",
    "outLastRealEstateOwnershipInd",
    "outLastRealEstateParLandRegistId",
    "outLastRealEstateRealEstateCat",
    "outLastRealEstateRealEstateDesc",
    "outLastRealEstateRealEstateType",
    "outLastRealEstateReevalFreq",
    "outLastRealEstateRegion",
    "outLastRealEstateRegistry",
    "outLastRealEstateRegistryTitleNo",
    "outLastRealEstateTitleExpiryDt",
    "outLastRealEstateTitleIssueDt",
    "outLastRealEstateTitleNatureType",
    "outLastRealEstateTitleTerm",
    "outLastRealEstateTrxUnit",
    "outLastRealEstateUnitNo",
    "outLastRealEstateZipCode",
    "outLastRealEstateApprslAdoptionValDt",
    "outLastRealEstateApprslApraisalCmnts",
    "outLastRealEstateApprslCommercValue",
    "outLastRealEstateApprslEntryStatus",
    "outLastRealEstateApprslEstInsurAmn",
    "outLastRealEstateApprslEstRentalIncAmn",
    "outLastRealEstateApprslEvaluationDt",
    "outLastRealEstateApprslEvaluator",
    "outLastRealEstateApprslInternalSn",
    "outLastRealEstateApprslInvestmentAmn",
    "outLastRealEstateApprslMortgageValue",
    "outLastRealEstateApprslObjectiveAmn",
    "outLastRealEstateApprslPricePerMeter",
    "outLastRealEstateApprslSellValue",
    "outLastSelAmnCurrCurrencyShortDescr",
    "outLastValuationTypeGenericDetailDescription",
    "outLeas2GenericDetailDescription",
    "outLeas2GenericDetailParameterType",
    "outLeas2GenericDetailSerialNum",
    "outLoanAccountAccCd",
    "outLoanAccountAccSn",
    "outLoanAccountAccType",
    "outLoanAccUnitCode",
    "outLoanAccUnitEntryStatus",
    "outLoanAccUnitUnitName",
    "outLoanProductDescription",
    "outLoanProductIdProduct",
    "outLoopFlagIefSuppliedFlag",
    "outNatureTitleGenericDetailDescription",
    "outNatureTitleGenericDetailParameterType",
    "outNatureTitleGenericDetailSerialNum",
    "outRecatGenericDetailDescription",
    "outRecatGenericDetailParameterType",
    "outRecatGenericDetailSerialNum",
    "outRecbkGenericDetailDescription",
    "outRecbkGenericDetailParameterType",
    "outRecbkGenericDetailSerialNum",
    "outReincGenericDetailDescription",
    "outReincGenericDetailParameterType",
    "outReincGenericDetailSerialNum",
    "outReinsGenericDetailDescription",
    "outReinsGenericDetailParameterType",
    "outReinsGenericDetailSerialNum",
    "outRelocGenericDetailDescription",
    "outRelocGenericDetailParameterType",
    "outRelocGenericDetailSerialNum",
    "outRetypGenericDetailDescription",
    "outRetypGenericDetailParameterType",
    "outRetypGenericDetailSerialNum",
    "outSelectedRealEstateAddDescr1",
    "outSelectedRealEstateAddDescr2",
    "outSelectedRealEstateAddDescr3",
    "outSelectedRealEstateAddDescr4",
    "outSelectedRealEstateAddDescr5",
    "outSelectedRealEstateAdditionalArea",
    "outSelectedRealEstateAddress",
    "outSelectedRealEstateAddressNum",
    "outSelectedRealEstateAgreementValue",
    "outSelectedRealEstateAnnualRentAmn",
    "outSelectedRealEstateApartmentNum",
    "outSelectedRealEstateBuilding",
    "outSelectedRealEstateBuildLicenceid",
    "outSelectedRealEstateCity",
    "outSelectedRealEstateCommercialValAmn",
    "outSelectedRealEstateConstrCostAmn",
    "outSelectedRealEstateConstructionYear",
    "outSelectedRealEstateCourt",
    "outSelectedRealEstateDistrictRegistry",
    "outSelectedRealEstateEntryStatus",
    "outSelectedRealEstateEstate",
    "outSelectedRealEstateEvalluationInd",
    "outSelectedRealEstateFrontageInd",
    "outSelectedRealEstateId",
    "outSelectedRealEstateInsertionDt",
    "outSelectedRealEstateInsertionUsr",
    "outSelectedRealEstateInsOriginalAmn",
    "outSelectedRealEstateInsuranceAmn",
    "outSelectedRealEstateInsuranceDescr",
    "outSelectedRealEstateInsuranceEd",
    "outSelectedRealEstateInsuranceSd",
    "outSelectedRealEstateIssueYear",
    "outSelectedRealEstateLandRegistId",
    "outSelectedRealEstateLegalProblems",
    "outSelectedRealEstateMainArea",
    "outSelectedRealEstateModificationDt",
    "outSelectedRealEstateModificationUsr",
    "outSelectedRealEstateMonTotParkNum",
    "outSelectedRealEstateMonTotStoreNum",
    "outSelectedRealEstateMortgageArea",
    "outSelectedRealEstateMunicipality",
    "outSelectedRealEstateOutdoorAtticA",
    "outSelectedRealEstateOwnershipInd",
    "outSelectedRealEstateParkingValAmn",
    "outSelectedRealEstateParLandRegistId",
    "outSelectedRealEstateRealEstateCat",
    "outSelectedRealEstateRealEstateDesc",
    "outSelectedRealEstateRealEstateType",
    "outSelectedRealEstateRealEstValAmn",
    "outSelectedRealEstateReevalFreq",
    "outSelectedRealEstateRegion",
    "outSelectedRealEstateRegistry",
    "outSelectedRealEstateRegistryTitleNo",
    "outSelectedRealEstateRentalDate",
    "outSelectedRealEstateRentingComments",
    "outSelectedRealEstateSiteValueAmn",
    "outSelectedRealEstateStoreRoomNum",
    "outSelectedRealEstateStoreValueAmn",
    "outSelectedRealEstateTitleExpiryDt",
    "outSelectedRealEstateTitleIssueDt",
    "outSelectedRealEstateTitleNatureType",
    "outSelectedRealEstateTitleTerm",
    "outSelectedRealEstateTotalSiteArea",
    "outSelectedRealEstateTotalValueAmn",
    "outSelectedRealEstateTotParkArea",
    "outSelectedRealEstateTotParkNum",
    "outSelectedRealEstateTotStoreArea",
    "outSelectedRealEstateTrxUnit",
    "outSelectedRealEstateUnitNo",
    "outSelectedRealEstateUrbanPlanPro",
    "outSelectedRealEstateValueDate",
    "outSelectedRealEstateZipCode",
    "outToContinueGenericDetailParameterType",
    "outToContinueGenericDetailSerialNum",
    "outUpdUsrCharSuppliedChar40",
    "outValuerInternalFlg",
    "outValuerValuerAddress",
    "outValuerValuerEmail",
    "outValuerValuerId",
    "outValuerValuerMobile",
    "outValuerValuerName",
    "outValuerValuerPhone",
    "outValuerCountyGenericDetailDescription",
    "outValuerCountyGenericDetailSerialNum",
    "outLastRealEstateApprslEvalluationInd",
    "outLastRealEstateApprslReevalFreq",
    "outCollatParametersGenericDetFlg",
    "outTotalSiteAreaGenericDetailSerialNum",
    "outTotalSiteAreaGenericDetailShortDescription",
    "outTotalSiteAreaGenericDetailParameterType",
    "outTotalSiteAreaGenericDetailDescription",
    "outMainAreaGenericDetailSerialNum",
    "outMainAreaGenericDetailShortDescription",
    "outMainAreaGenericDetailParameterType",
    "outMainAreaGenericDetailDescription",
    "outOutdoorAtticAreaGenericDetailSerialNum",
    "outOutdoorAtticAreaGenericDetailShortDescription",
    "outOutdoorAtticAreaGenericDetailParameterType",
    "outOutdoorAtticAreaGenericDetailDescription",
    "outAdditionalAreaGenericDetailSerialNum",
    "outAdditionalAreaGenericDetailShortDescription",
    "outAdditionalAreaGenericDetailParameterType",
    "outAdditionalAreaGenericDetailDescription",
    "outMortgageAreaGenericDetailSerialNum",
    "outMortgageAreaGenericDetailShortDescription",
    "outMortgageAreaGenericDetailParameterType",
    "outMortgageAreaGenericDetailDescription",
    "outTotStoreAreaGenericDetailSerialNum",
    "outTotStoreAreaGenericDetailShortDescription",
    "outTotStoreAreaGenericDetailParameterType",
    "outTotStoreAreaGenericDetailDescription",
    "outTotParkAreaGenericDetailSerialNum",
    "outTotParkAreaGenericDetailShortDescription",
    "outTotParkAreaGenericDetailParameterType",
    "outTotParkAreaGenericDetailDescription",
    "outSelectedRealEstatePlotNumber",
    "outSelectedRealEstateBlockNumber",
    "outSelectedRealEstateCondPlanNo",
    "outSelectedRealEstateInstrumentNo",
    "outSelectedRealEstateMarketability",
    "outSelectedRealEstateGpsCoord",
    "outSelectedRealEstateCopyOfTitle",
    "outSelectedRealEstateTitleSubmDt",
    "outSelectedRealEstateTitleReturnDt",
    "outSelectedRealEstateInsurPolicyNo",
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
    "outTitleCustAddrParrelDCode",
    "outTitleCustAddrParrelDSn",
    "outTitleCustAddrParrelDP01Desc",
    "outTitleCustAddrParrelDP02Desc",
    "outTitleCustAddrParrelDP03Desc",
    "outTitleCustAddrParrelDP04Desc",
    "outTitleCustAddrParrelDP05Desc",
    "outTitleCustAddrParrelDP06Desc",
    "outTitleCustAddrParrelDP07Desc",
    "outTitleCustAddrParrelDP08Desc",
    "outTitleCustAddrParrelDP09Desc",
    "outTitleCustAddrParrelDP10Desc",
    "outSelectedRealEstateFolio",
    "outSelectedRealEstateInsurAnnualAmnt"
})
public class Mc2006VPropertyManagementExport
    extends BaseExport
{

    @XmlElement(name = "OutAccountBalanceIefSuppliedAmount", required = true)
    protected BigDecimal outAccountBalanceIefSuppliedAmount;
    @XmlElement(name = "OutAccountCurrencyShortDescr")
    protected String outAccountCurrencyShortDescr;
    @XmlElement(name = "OutAdddiGenericDetailDescription")
    protected String outAdddiGenericDetailDescription;
    @XmlElement(name = "OutAdddiGenericDetailParameterType")
    protected String outAdddiGenericDetailParameterType;
    @XmlElement(name = "OutAdddiGenericDetailSerialNum")
    protected int outAdddiGenericDetailSerialNum;
    @XmlElement(name = "OutAgreementAgrMembershipSn")
    protected int outAgreementAgrMembershipSn;
    @XmlElement(name = "OutAgreementAgrSn")
    protected int outAgreementAgrSn;
    @XmlElement(name = "OutAgreementAgrYear")
    protected short outAgreementAgrYear;
    @XmlElement(name = "OutAgrUnitCode")
    protected int outAgrUnitCode;
    @XmlElement(name = "OutBaselGenericDetailDescription")
    protected String outBaselGenericDetailDescription;
    @XmlElement(name = "OutBaselGenericDetailParameterType")
    protected String outBaselGenericDetailParameterType;
    @XmlElement(name = "OutBaselGenericDetailSerialNum")
    protected int outBaselGenericDetailSerialNum;
    @XmlElement(name = "OutCntryGenericDetailDescription")
    protected String outCntryGenericDetailDescription;
    @XmlElement(name = "OutCntryGenericDetailParameterType")
    protected String outCntryGenericDetailParameterType;
    @XmlElement(name = "OutCntryGenericDetailSerialNum")
    protected int outCntryGenericDetailSerialNum;
    @XmlElement(name = "OutCollateralTypeAssociationInd")
    protected String outCollateralTypeAssociationInd;
    @XmlElement(name = "OutCollateralTypeAssurValCalcInd")
    protected String outCollateralTypeAssurValCalcInd;
    @XmlElement(name = "OutCollateralTypeLandRegistryInd")
    protected String outCollateralTypeLandRegistryInd;
    @XmlElement(name = "OutCollateralTypeReliabilityCode")
    protected String outCollateralTypeReliabilityCode;
    @XmlElement(name = "OutCollateralTypeReliabilityFct", required = true)
    protected BigDecimal outCollateralTypeReliabilityFct;
    @XmlElement(name = "OutCollateralTypeValueFct", required = true)
    protected BigDecimal outCollateralTypeValueFct;
    @XmlElement(name = "OutCollateralWorkEstimatedAccountLossAc", required = true)
    protected BigDecimal outCollateralWorkEstimatedAccountLossAc;
    @XmlElement(name = "OutCollateralWorkEstimatedAccountLossDc", required = true)
    protected BigDecimal outCollateralWorkEstimatedAccountLossDc;
    @XmlElement(name = "OutCollateralWorkEstimatedInsurValueAc", required = true)
    protected BigDecimal outCollateralWorkEstimatedInsurValueAc;
    @XmlElement(name = "OutCollateralWorkEstimatedInsurValueDc", required = true)
    protected BigDecimal outCollateralWorkEstimatedInsurValueDc;
    @XmlElement(name = "OutCollateralWorkEstimatedValueAc", required = true)
    protected BigDecimal outCollateralWorkEstimatedValueAc;
    @XmlElement(name = "OutCollateralWorkEstimatedValueDc", required = true)
    protected BigDecimal outCollateralWorkEstimatedValueDc;
    @XmlElement(name = "OutCreatedRealEstateId")
    protected double outCreatedRealEstateId;
    @XmlElement(name = "OutCustomerCDigit")
    protected short outCustomerCDigit;
    @XmlElement(name = "OutCustomerCustId")
    protected int outCustomerCustId;
    @XmlElement(name = "OutCustomerFirstName")
    protected String outCustomerFirstName;
    @XmlElement(name = "OutCustomerSurname")
    protected String outCustomerSurname;
    @XmlElement(name = "OutGrpAuxSpace")
    protected ArrayOfMc2006VOutGrpAuxSpaceItem outGrpAuxSpace;
    @XmlElement(name = "OutGrpCustomer")
    protected ArrayOfMc2006VOutGrpCustomerItem outGrpCustomer;
    @XmlElement(name = "OutGrpDefRealEst")
    protected ArrayOfMc2006VOutGrpDefRealEstItem outGrpDefRealEst;
    @XmlElement(name = "OutGrpEval")
    protected ArrayOfMc2006VOutGrpEvalItem outGrpEval;
    @XmlElement(name = "OutGrpQualInfo")
    protected ArrayOfMc2006VOutGrpQualInfoItem outGrpQualInfo;
    @XmlElement(name = "OutGrpValuers")
    protected ArrayOfMc2006VOutGrpValuersItem outGrpValuers;
    @XmlElement(name = "OutInsertUnitCode")
    protected int outInsertUnitCode;
    @XmlElement(name = "OutInsertUnitUnitName")
    protected String outInsertUnitUnitName;
    @XmlElement(name = "OutInsUsrCharSuppliedChar40")
    protected String outInsUsrCharSuppliedChar40;
    @XmlElement(name = "OutLastCommCurrCurrencyShortDescr")
    protected String outLastCommCurrCurrencyShortDescr;
    @XmlElement(name = "OutLastEsrIncCurrCurrencyShortDescr")
    protected String outLastEsrIncCurrCurrencyShortDescr;
    @XmlElement(name = "OutLastInsurAmnCurrCurrencyShortDescr")
    protected String outLastInsurAmnCurrCurrencyShortDescr;
    @XmlElement(name = "OutLastInvCurrIdCurrencyShortDescr")
    protected String outLastInvCurrIdCurrencyShortDescr;
    @XmlElement(name = "OutLastMortAmnCurrCurrencyShortDescr")
    protected String outLastMortAmnCurrCurrencyShortDescr;
    @XmlElement(name = "OutLastObjCurrCurrencyShortDescr")
    protected String outLastObjCurrCurrencyShortDescr;
    @XmlElement(name = "OutLastPrpermeCurrCurrencyShortDescr")
    protected String outLastPrpermeCurrCurrencyShortDescr;
    @XmlElement(name = "OutLastRealEstateAddDescr1")
    protected String outLastRealEstateAddDescr1;
    @XmlElement(name = "OutLastRealEstateAddDescr2")
    protected String outLastRealEstateAddDescr2;
    @XmlElement(name = "OutLastRealEstateAddDescr3")
    protected String outLastRealEstateAddDescr3;
    @XmlElement(name = "OutLastRealEstateAddDescr4")
    protected String outLastRealEstateAddDescr4;
    @XmlElement(name = "OutLastRealEstateAddDescr5")
    protected String outLastRealEstateAddDescr5;
    @XmlElement(name = "OutLastRealEstateAdditionalArea", required = true)
    protected BigDecimal outLastRealEstateAdditionalArea;
    @XmlElement(name = "OutLastRealEstateAddress")
    protected String outLastRealEstateAddress;
    @XmlElement(name = "OutLastRealEstateAddressNum")
    protected String outLastRealEstateAddressNum;
    @XmlElement(name = "OutLastRealEstateAgreementValue", required = true)
    protected BigDecimal outLastRealEstateAgreementValue;
    @XmlElement(name = "OutLastRealEstateApartmentNum")
    protected String outLastRealEstateApartmentNum;
    @XmlElement(name = "OutLastRealEstateBuilding")
    protected String outLastRealEstateBuilding;
    @XmlElement(name = "OutLastRealEstateCity")
    protected String outLastRealEstateCity;
    @XmlElement(name = "OutLastRealEstateCommercialValAmn", required = true)
    protected BigDecimal outLastRealEstateCommercialValAmn;
    @XmlElement(name = "OutLastRealEstateConstructionYear")
    protected short outLastRealEstateConstructionYear;
    @XmlElement(name = "OutLastRealEstateCourt")
    protected String outLastRealEstateCourt;
    @XmlElement(name = "OutLastRealEstateDistrictRegistry")
    protected String outLastRealEstateDistrictRegistry;
    @XmlElement(name = "OutLastRealEstateEntryStatus")
    protected String outLastRealEstateEntryStatus;
    @XmlElement(name = "OutLastRealEstateEstate")
    protected String outLastRealEstateEstate;
    @XmlElement(name = "OutLastRealEstateEvalluationInd")
    protected String outLastRealEstateEvalluationInd;
    @XmlElement(name = "OutLastRealEstateFrontageInd")
    protected String outLastRealEstateFrontageInd;
    @XmlElement(name = "OutLastRealEstateId")
    protected double outLastRealEstateId;
    @XmlElement(name = "OutLastRealEstateInsertionDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outLastRealEstateInsertionDt;
    @XmlElement(name = "OutLastRealEstateInsertionUsr")
    protected String outLastRealEstateInsertionUsr;
    @XmlElement(name = "OutLastRealEstateInsOriginalAmn", required = true)
    protected BigDecimal outLastRealEstateInsOriginalAmn;
    @XmlElement(name = "OutLastRealEstateInsuranceAmn", required = true)
    protected BigDecimal outLastRealEstateInsuranceAmn;
    @XmlElement(name = "OutLastRealEstateInsuranceDescr")
    protected String outLastRealEstateInsuranceDescr;
    @XmlElement(name = "OutLastRealEstateInsuranceEd", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outLastRealEstateInsuranceEd;
    @XmlElement(name = "OutLastRealEstateInsuranceSd", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outLastRealEstateInsuranceSd;
    @XmlElement(name = "OutLastRealEstateMainArea", required = true)
    protected BigDecimal outLastRealEstateMainArea;
    @XmlElement(name = "OutLastRealEstateModificationDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outLastRealEstateModificationDt;
    @XmlElement(name = "OutLastRealEstateModificationUsr")
    protected String outLastRealEstateModificationUsr;
    @XmlElement(name = "OutLastRealEstateMunicipality")
    protected String outLastRealEstateMunicipality;
    @XmlElement(name = "OutLastRealEstateOwnershipInd")
    protected String outLastRealEstateOwnershipInd;
    @XmlElement(name = "OutLastRealEstateParLandRegistId")
    protected String outLastRealEstateParLandRegistId;
    @XmlElement(name = "OutLastRealEstateRealEstateCat")
    protected String outLastRealEstateRealEstateCat;
    @XmlElement(name = "OutLastRealEstateRealEstateDesc")
    protected String outLastRealEstateRealEstateDesc;
    @XmlElement(name = "OutLastRealEstateRealEstateType")
    protected String outLastRealEstateRealEstateType;
    @XmlElement(name = "OutLastRealEstateReevalFreq")
    protected short outLastRealEstateReevalFreq;
    @XmlElement(name = "OutLastRealEstateRegion")
    protected String outLastRealEstateRegion;
    @XmlElement(name = "OutLastRealEstateRegistry")
    protected String outLastRealEstateRegistry;
    @XmlElement(name = "OutLastRealEstateRegistryTitleNo")
    protected String outLastRealEstateRegistryTitleNo;
    @XmlElement(name = "OutLastRealEstateTitleExpiryDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outLastRealEstateTitleExpiryDt;
    @XmlElement(name = "OutLastRealEstateTitleIssueDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outLastRealEstateTitleIssueDt;
    @XmlElement(name = "OutLastRealEstateTitleNatureType")
    protected String outLastRealEstateTitleNatureType;
    @XmlElement(name = "OutLastRealEstateTitleTerm")
    protected int outLastRealEstateTitleTerm;
    @XmlElement(name = "OutLastRealEstateTrxUnit")
    protected int outLastRealEstateTrxUnit;
    @XmlElement(name = "OutLastRealEstateUnitNo")
    protected String outLastRealEstateUnitNo;
    @XmlElement(name = "OutLastRealEstateZipCode")
    protected String outLastRealEstateZipCode;
    @XmlElement(name = "OutLastRealEstateApprslAdoptionValDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outLastRealEstateApprslAdoptionValDt;
    @XmlElement(name = "OutLastRealEstateApprslApraisalCmnts")
    protected String outLastRealEstateApprslApraisalCmnts;
    @XmlElement(name = "OutLastRealEstateApprslCommercValue", required = true)
    protected BigDecimal outLastRealEstateApprslCommercValue;
    @XmlElement(name = "OutLastRealEstateApprslEntryStatus")
    protected String outLastRealEstateApprslEntryStatus;
    @XmlElement(name = "OutLastRealEstateApprslEstInsurAmn", required = true)
    protected BigDecimal outLastRealEstateApprslEstInsurAmn;
    @XmlElement(name = "OutLastRealEstateApprslEstRentalIncAmn", required = true)
    protected BigDecimal outLastRealEstateApprslEstRentalIncAmn;
    @XmlElement(name = "OutLastRealEstateApprslEvaluationDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outLastRealEstateApprslEvaluationDt;
    @XmlElement(name = "OutLastRealEstateApprslEvaluator")
    protected String outLastRealEstateApprslEvaluator;
    @XmlElement(name = "OutLastRealEstateApprslInternalSn")
    protected double outLastRealEstateApprslInternalSn;
    @XmlElement(name = "OutLastRealEstateApprslInvestmentAmn", required = true)
    protected BigDecimal outLastRealEstateApprslInvestmentAmn;
    @XmlElement(name = "OutLastRealEstateApprslMortgageValue", required = true)
    protected BigDecimal outLastRealEstateApprslMortgageValue;
    @XmlElement(name = "OutLastRealEstateApprslObjectiveAmn", required = true)
    protected BigDecimal outLastRealEstateApprslObjectiveAmn;
    @XmlElement(name = "OutLastRealEstateApprslPricePerMeter", required = true)
    protected BigDecimal outLastRealEstateApprslPricePerMeter;
    @XmlElement(name = "OutLastRealEstateApprslSellValue", required = true)
    protected BigDecimal outLastRealEstateApprslSellValue;
    @XmlElement(name = "OutLastSelAmnCurrCurrencyShortDescr")
    protected String outLastSelAmnCurrCurrencyShortDescr;
    @XmlElement(name = "OutLastValuationTypeGenericDetailDescription")
    protected String outLastValuationTypeGenericDetailDescription;
    @XmlElement(name = "OutLeas2GenericDetailDescription")
    protected String outLeas2GenericDetailDescription;
    @XmlElement(name = "OutLeas2GenericDetailParameterType")
    protected String outLeas2GenericDetailParameterType;
    @XmlElement(name = "OutLeas2GenericDetailSerialNum")
    protected int outLeas2GenericDetailSerialNum;
    @XmlElement(name = "OutLoanAccountAccCd")
    protected short outLoanAccountAccCd;
    @XmlElement(name = "OutLoanAccountAccSn")
    protected int outLoanAccountAccSn;
    @XmlElement(name = "OutLoanAccountAccType")
    protected short outLoanAccountAccType;
    @XmlElement(name = "OutLoanAccUnitCode")
    protected int outLoanAccUnitCode;
    @XmlElement(name = "OutLoanAccUnitEntryStatus")
    protected String outLoanAccUnitEntryStatus;
    @XmlElement(name = "OutLoanAccUnitUnitName")
    protected String outLoanAccUnitUnitName;
    @XmlElement(name = "OutLoanProductDescription")
    protected String outLoanProductDescription;
    @XmlElement(name = "OutLoanProductIdProduct")
    protected int outLoanProductIdProduct;
    @XmlElement(name = "OutLoopFlagIefSuppliedFlag")
    protected String outLoopFlagIefSuppliedFlag;
    @XmlElement(name = "OutNatureTitleGenericDetailDescription")
    protected String outNatureTitleGenericDetailDescription;
    @XmlElement(name = "OutNatureTitleGenericDetailParameterType")
    protected String outNatureTitleGenericDetailParameterType;
    @XmlElement(name = "OutNatureTitleGenericDetailSerialNum")
    protected int outNatureTitleGenericDetailSerialNum;
    @XmlElement(name = "OutRecatGenericDetailDescription")
    protected String outRecatGenericDetailDescription;
    @XmlElement(name = "OutRecatGenericDetailParameterType")
    protected String outRecatGenericDetailParameterType;
    @XmlElement(name = "OutRecatGenericDetailSerialNum")
    protected int outRecatGenericDetailSerialNum;
    @XmlElement(name = "OutRecbkGenericDetailDescription")
    protected String outRecbkGenericDetailDescription;
    @XmlElement(name = "OutRecbkGenericDetailParameterType")
    protected String outRecbkGenericDetailParameterType;
    @XmlElement(name = "OutRecbkGenericDetailSerialNum")
    protected int outRecbkGenericDetailSerialNum;
    @XmlElement(name = "OutReincGenericDetailDescription")
    protected String outReincGenericDetailDescription;
    @XmlElement(name = "OutReincGenericDetailParameterType")
    protected String outReincGenericDetailParameterType;
    @XmlElement(name = "OutReincGenericDetailSerialNum")
    protected int outReincGenericDetailSerialNum;
    @XmlElement(name = "OutReinsGenericDetailDescription")
    protected String outReinsGenericDetailDescription;
    @XmlElement(name = "OutReinsGenericDetailParameterType")
    protected String outReinsGenericDetailParameterType;
    @XmlElement(name = "OutReinsGenericDetailSerialNum")
    protected int outReinsGenericDetailSerialNum;
    @XmlElement(name = "OutRelocGenericDetailDescription")
    protected String outRelocGenericDetailDescription;
    @XmlElement(name = "OutRelocGenericDetailParameterType")
    protected String outRelocGenericDetailParameterType;
    @XmlElement(name = "OutRelocGenericDetailSerialNum")
    protected int outRelocGenericDetailSerialNum;
    @XmlElement(name = "OutRetypGenericDetailDescription")
    protected String outRetypGenericDetailDescription;
    @XmlElement(name = "OutRetypGenericDetailParameterType")
    protected String outRetypGenericDetailParameterType;
    @XmlElement(name = "OutRetypGenericDetailSerialNum")
    protected int outRetypGenericDetailSerialNum;
    @XmlElement(name = "OutSelectedRealEstateAddDescr1")
    protected String outSelectedRealEstateAddDescr1;
    @XmlElement(name = "OutSelectedRealEstateAddDescr2")
    protected String outSelectedRealEstateAddDescr2;
    @XmlElement(name = "OutSelectedRealEstateAddDescr3")
    protected String outSelectedRealEstateAddDescr3;
    @XmlElement(name = "OutSelectedRealEstateAddDescr4")
    protected String outSelectedRealEstateAddDescr4;
    @XmlElement(name = "OutSelectedRealEstateAddDescr5")
    protected String outSelectedRealEstateAddDescr5;
    @XmlElement(name = "OutSelectedRealEstateAdditionalArea", required = true)
    protected BigDecimal outSelectedRealEstateAdditionalArea;
    @XmlElement(name = "OutSelectedRealEstateAddress")
    protected String outSelectedRealEstateAddress;
    @XmlElement(name = "OutSelectedRealEstateAddressNum")
    protected String outSelectedRealEstateAddressNum;
    @XmlElement(name = "OutSelectedRealEstateAgreementValue", required = true)
    protected BigDecimal outSelectedRealEstateAgreementValue;
    @XmlElement(name = "OutSelectedRealEstateAnnualRentAmn", required = true)
    protected BigDecimal outSelectedRealEstateAnnualRentAmn;
    @XmlElement(name = "OutSelectedRealEstateApartmentNum")
    protected String outSelectedRealEstateApartmentNum;
    @XmlElement(name = "OutSelectedRealEstateBuilding")
    protected String outSelectedRealEstateBuilding;
    @XmlElement(name = "OutSelectedRealEstateBuildLicenceid")
    protected String outSelectedRealEstateBuildLicenceid;
    @XmlElement(name = "OutSelectedRealEstateCity")
    protected String outSelectedRealEstateCity;
    @XmlElement(name = "OutSelectedRealEstateCommercialValAmn", required = true)
    protected BigDecimal outSelectedRealEstateCommercialValAmn;
    @XmlElement(name = "OutSelectedRealEstateConstrCostAmn", required = true)
    protected BigDecimal outSelectedRealEstateConstrCostAmn;
    @XmlElement(name = "OutSelectedRealEstateConstructionYear")
    protected short outSelectedRealEstateConstructionYear;
    @XmlElement(name = "OutSelectedRealEstateCourt")
    protected String outSelectedRealEstateCourt;
    @XmlElement(name = "OutSelectedRealEstateDistrictRegistry")
    protected String outSelectedRealEstateDistrictRegistry;
    @XmlElement(name = "OutSelectedRealEstateEntryStatus")
    protected String outSelectedRealEstateEntryStatus;
    @XmlElement(name = "OutSelectedRealEstateEstate")
    protected String outSelectedRealEstateEstate;
    @XmlElement(name = "OutSelectedRealEstateEvalluationInd")
    protected String outSelectedRealEstateEvalluationInd;
    @XmlElement(name = "OutSelectedRealEstateFrontageInd")
    protected String outSelectedRealEstateFrontageInd;
    @XmlElement(name = "OutSelectedRealEstateId")
    protected double outSelectedRealEstateId;
    @XmlElement(name = "OutSelectedRealEstateInsertionDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outSelectedRealEstateInsertionDt;
    @XmlElement(name = "OutSelectedRealEstateInsertionUsr")
    protected String outSelectedRealEstateInsertionUsr;
    @XmlElement(name = "OutSelectedRealEstateInsOriginalAmn", required = true)
    protected BigDecimal outSelectedRealEstateInsOriginalAmn;
    @XmlElement(name = "OutSelectedRealEstateInsuranceAmn", required = true)
    protected BigDecimal outSelectedRealEstateInsuranceAmn;
    @XmlElement(name = "OutSelectedRealEstateInsuranceDescr")
    protected String outSelectedRealEstateInsuranceDescr;
    @XmlElement(name = "OutSelectedRealEstateInsuranceEd", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outSelectedRealEstateInsuranceEd;
    @XmlElement(name = "OutSelectedRealEstateInsuranceSd", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outSelectedRealEstateInsuranceSd;
    @XmlElement(name = "OutSelectedRealEstateIssueYear")
    protected short outSelectedRealEstateIssueYear;
    @XmlElement(name = "OutSelectedRealEstateLandRegistId")
    protected String outSelectedRealEstateLandRegistId;
    @XmlElement(name = "OutSelectedRealEstateLegalProblems")
    protected String outSelectedRealEstateLegalProblems;
    @XmlElement(name = "OutSelectedRealEstateMainArea", required = true)
    protected BigDecimal outSelectedRealEstateMainArea;
    @XmlElement(name = "OutSelectedRealEstateModificationDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outSelectedRealEstateModificationDt;
    @XmlElement(name = "OutSelectedRealEstateModificationUsr")
    protected String outSelectedRealEstateModificationUsr;
    @XmlElement(name = "OutSelectedRealEstateMonTotParkNum")
    protected int outSelectedRealEstateMonTotParkNum;
    @XmlElement(name = "OutSelectedRealEstateMonTotStoreNum")
    protected int outSelectedRealEstateMonTotStoreNum;
    @XmlElement(name = "OutSelectedRealEstateMortgageArea", required = true)
    protected BigDecimal outSelectedRealEstateMortgageArea;
    @XmlElement(name = "OutSelectedRealEstateMunicipality")
    protected String outSelectedRealEstateMunicipality;
    @XmlElement(name = "OutSelectedRealEstateOutdoorAtticA", required = true)
    protected BigDecimal outSelectedRealEstateOutdoorAtticA;
    @XmlElement(name = "OutSelectedRealEstateOwnershipInd")
    protected String outSelectedRealEstateOwnershipInd;
    @XmlElement(name = "OutSelectedRealEstateParkingValAmn", required = true)
    protected BigDecimal outSelectedRealEstateParkingValAmn;
    @XmlElement(name = "OutSelectedRealEstateParLandRegistId")
    protected String outSelectedRealEstateParLandRegistId;
    @XmlElement(name = "OutSelectedRealEstateRealEstateCat")
    protected String outSelectedRealEstateRealEstateCat;
    @XmlElement(name = "OutSelectedRealEstateRealEstateDesc")
    protected String outSelectedRealEstateRealEstateDesc;
    @XmlElement(name = "OutSelectedRealEstateRealEstateType")
    protected String outSelectedRealEstateRealEstateType;
    @XmlElement(name = "OutSelectedRealEstateRealEstValAmn", required = true)
    protected BigDecimal outSelectedRealEstateRealEstValAmn;
    @XmlElement(name = "OutSelectedRealEstateReevalFreq")
    protected short outSelectedRealEstateReevalFreq;
    @XmlElement(name = "OutSelectedRealEstateRegion")
    protected String outSelectedRealEstateRegion;
    @XmlElement(name = "OutSelectedRealEstateRegistry")
    protected String outSelectedRealEstateRegistry;
    @XmlElement(name = "OutSelectedRealEstateRegistryTitleNo")
    protected String outSelectedRealEstateRegistryTitleNo;
    @XmlElement(name = "OutSelectedRealEstateRentalDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outSelectedRealEstateRentalDate;
    @XmlElement(name = "OutSelectedRealEstateRentingComments")
    protected String outSelectedRealEstateRentingComments;
    @XmlElement(name = "OutSelectedRealEstateSiteValueAmn", required = true)
    protected BigDecimal outSelectedRealEstateSiteValueAmn;
    @XmlElement(name = "OutSelectedRealEstateStoreRoomNum")
    protected int outSelectedRealEstateStoreRoomNum;
    @XmlElement(name = "OutSelectedRealEstateStoreValueAmn", required = true)
    protected BigDecimal outSelectedRealEstateStoreValueAmn;
    @XmlElement(name = "OutSelectedRealEstateTitleExpiryDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outSelectedRealEstateTitleExpiryDt;
    @XmlElement(name = "OutSelectedRealEstateTitleIssueDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outSelectedRealEstateTitleIssueDt;
    @XmlElement(name = "OutSelectedRealEstateTitleNatureType")
    protected String outSelectedRealEstateTitleNatureType;
    @XmlElement(name = "OutSelectedRealEstateTitleTerm")
    protected int outSelectedRealEstateTitleTerm;
    @XmlElement(name = "OutSelectedRealEstateTotalSiteArea", required = true)
    protected BigDecimal outSelectedRealEstateTotalSiteArea;
    @XmlElement(name = "OutSelectedRealEstateTotalValueAmn", required = true)
    protected BigDecimal outSelectedRealEstateTotalValueAmn;
    @XmlElement(name = "OutSelectedRealEstateTotParkArea", required = true)
    protected BigDecimal outSelectedRealEstateTotParkArea;
    @XmlElement(name = "OutSelectedRealEstateTotParkNum")
    protected int outSelectedRealEstateTotParkNum;
    @XmlElement(name = "OutSelectedRealEstateTotStoreArea", required = true)
    protected BigDecimal outSelectedRealEstateTotStoreArea;
    @XmlElement(name = "OutSelectedRealEstateTrxUnit")
    protected int outSelectedRealEstateTrxUnit;
    @XmlElement(name = "OutSelectedRealEstateUnitNo")
    protected String outSelectedRealEstateUnitNo;
    @XmlElement(name = "OutSelectedRealEstateUrbanPlanPro")
    protected String outSelectedRealEstateUrbanPlanPro;
    @XmlElement(name = "OutSelectedRealEstateValueDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outSelectedRealEstateValueDate;
    @XmlElement(name = "OutSelectedRealEstateZipCode")
    protected String outSelectedRealEstateZipCode;
    @XmlElement(name = "OutToContinueGenericDetailParameterType")
    protected String outToContinueGenericDetailParameterType;
    @XmlElement(name = "OutToContinueGenericDetailSerialNum")
    protected int outToContinueGenericDetailSerialNum;
    @XmlElement(name = "OutUpdUsrCharSuppliedChar40")
    protected String outUpdUsrCharSuppliedChar40;
    @XmlElement(name = "OutValuerInternalFlg")
    protected String outValuerInternalFlg;
    @XmlElement(name = "OutValuerValuerAddress")
    protected String outValuerValuerAddress;
    @XmlElement(name = "OutValuerValuerEmail")
    protected String outValuerValuerEmail;
    @XmlElement(name = "OutValuerValuerId")
    protected int outValuerValuerId;
    @XmlElement(name = "OutValuerValuerMobile")
    protected String outValuerValuerMobile;
    @XmlElement(name = "OutValuerValuerName")
    protected String outValuerValuerName;
    @XmlElement(name = "OutValuerValuerPhone")
    protected String outValuerValuerPhone;
    @XmlElement(name = "OutValuerCountyGenericDetailDescription")
    protected String outValuerCountyGenericDetailDescription;
    @XmlElement(name = "OutValuerCountyGenericDetailSerialNum")
    protected int outValuerCountyGenericDetailSerialNum;
    @XmlElement(name = "OutLastRealEstateApprslEvalluationInd")
    protected String outLastRealEstateApprslEvalluationInd;
    @XmlElement(name = "OutLastRealEstateApprslReevalFreq")
    protected short outLastRealEstateApprslReevalFreq;
    @XmlElement(name = "OutCollatParametersGenericDetFlg")
    protected String outCollatParametersGenericDetFlg;
    @XmlElement(name = "OutTotalSiteAreaGenericDetailSerialNum")
    protected int outTotalSiteAreaGenericDetailSerialNum;
    @XmlElement(name = "OutTotalSiteAreaGenericDetailShortDescription")
    protected String outTotalSiteAreaGenericDetailShortDescription;
    @XmlElement(name = "OutTotalSiteAreaGenericDetailParameterType")
    protected String outTotalSiteAreaGenericDetailParameterType;
    @XmlElement(name = "OutTotalSiteAreaGenericDetailDescription")
    protected String outTotalSiteAreaGenericDetailDescription;
    @XmlElement(name = "OutMainAreaGenericDetailSerialNum")
    protected int outMainAreaGenericDetailSerialNum;
    @XmlElement(name = "OutMainAreaGenericDetailShortDescription")
    protected String outMainAreaGenericDetailShortDescription;
    @XmlElement(name = "OutMainAreaGenericDetailParameterType")
    protected String outMainAreaGenericDetailParameterType;
    @XmlElement(name = "OutMainAreaGenericDetailDescription")
    protected String outMainAreaGenericDetailDescription;
    @XmlElement(name = "OutOutdoorAtticAreaGenericDetailSerialNum")
    protected int outOutdoorAtticAreaGenericDetailSerialNum;
    @XmlElement(name = "OutOutdoorAtticAreaGenericDetailShortDescription")
    protected String outOutdoorAtticAreaGenericDetailShortDescription;
    @XmlElement(name = "OutOutdoorAtticAreaGenericDetailParameterType")
    protected String outOutdoorAtticAreaGenericDetailParameterType;
    @XmlElement(name = "OutOutdoorAtticAreaGenericDetailDescription")
    protected String outOutdoorAtticAreaGenericDetailDescription;
    @XmlElement(name = "OutAdditionalAreaGenericDetailSerialNum")
    protected int outAdditionalAreaGenericDetailSerialNum;
    @XmlElement(name = "OutAdditionalAreaGenericDetailShortDescription")
    protected String outAdditionalAreaGenericDetailShortDescription;
    @XmlElement(name = "OutAdditionalAreaGenericDetailParameterType")
    protected String outAdditionalAreaGenericDetailParameterType;
    @XmlElement(name = "OutAdditionalAreaGenericDetailDescription")
    protected String outAdditionalAreaGenericDetailDescription;
    @XmlElement(name = "OutMortgageAreaGenericDetailSerialNum")
    protected int outMortgageAreaGenericDetailSerialNum;
    @XmlElement(name = "OutMortgageAreaGenericDetailShortDescription")
    protected String outMortgageAreaGenericDetailShortDescription;
    @XmlElement(name = "OutMortgageAreaGenericDetailParameterType")
    protected String outMortgageAreaGenericDetailParameterType;
    @XmlElement(name = "OutMortgageAreaGenericDetailDescription")
    protected String outMortgageAreaGenericDetailDescription;
    @XmlElement(name = "OutTotStoreAreaGenericDetailSerialNum")
    protected int outTotStoreAreaGenericDetailSerialNum;
    @XmlElement(name = "OutTotStoreAreaGenericDetailShortDescription")
    protected String outTotStoreAreaGenericDetailShortDescription;
    @XmlElement(name = "OutTotStoreAreaGenericDetailParameterType")
    protected String outTotStoreAreaGenericDetailParameterType;
    @XmlElement(name = "OutTotStoreAreaGenericDetailDescription")
    protected String outTotStoreAreaGenericDetailDescription;
    @XmlElement(name = "OutTotParkAreaGenericDetailSerialNum")
    protected int outTotParkAreaGenericDetailSerialNum;
    @XmlElement(name = "OutTotParkAreaGenericDetailShortDescription")
    protected String outTotParkAreaGenericDetailShortDescription;
    @XmlElement(name = "OutTotParkAreaGenericDetailParameterType")
    protected String outTotParkAreaGenericDetailParameterType;
    @XmlElement(name = "OutTotParkAreaGenericDetailDescription")
    protected String outTotParkAreaGenericDetailDescription;
    @XmlElement(name = "OutSelectedRealEstatePlotNumber")
    protected String outSelectedRealEstatePlotNumber;
    @XmlElement(name = "OutSelectedRealEstateBlockNumber")
    protected String outSelectedRealEstateBlockNumber;
    @XmlElement(name = "OutSelectedRealEstateCondPlanNo")
    protected String outSelectedRealEstateCondPlanNo;
    @XmlElement(name = "OutSelectedRealEstateInstrumentNo")
    protected String outSelectedRealEstateInstrumentNo;
    @XmlElement(name = "OutSelectedRealEstateMarketability")
    protected String outSelectedRealEstateMarketability;
    @XmlElement(name = "OutSelectedRealEstateGpsCoord")
    protected String outSelectedRealEstateGpsCoord;
    @XmlElement(name = "OutSelectedRealEstateCopyOfTitle")
    protected String outSelectedRealEstateCopyOfTitle;
    @XmlElement(name = "OutSelectedRealEstateTitleSubmDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outSelectedRealEstateTitleSubmDt;
    @XmlElement(name = "OutSelectedRealEstateTitleReturnDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outSelectedRealEstateTitleReturnDt;
    @XmlElement(name = "OutSelectedRealEstateInsurPolicyNo")
    protected String outSelectedRealEstateInsurPolicyNo;
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
    @XmlElement(name = "OutTitleCustAddrParrelDCode")
    protected String outTitleCustAddrParrelDCode;
    @XmlElement(name = "OutTitleCustAddrParrelDSn")
    protected int outTitleCustAddrParrelDSn;
    @XmlElement(name = "OutTitleCustAddrParrelDP01Desc")
    protected String outTitleCustAddrParrelDP01Desc;
    @XmlElement(name = "OutTitleCustAddrParrelDP02Desc")
    protected String outTitleCustAddrParrelDP02Desc;
    @XmlElement(name = "OutTitleCustAddrParrelDP03Desc")
    protected String outTitleCustAddrParrelDP03Desc;
    @XmlElement(name = "OutTitleCustAddrParrelDP04Desc")
    protected String outTitleCustAddrParrelDP04Desc;
    @XmlElement(name = "OutTitleCustAddrParrelDP05Desc")
    protected String outTitleCustAddrParrelDP05Desc;
    @XmlElement(name = "OutTitleCustAddrParrelDP06Desc")
    protected String outTitleCustAddrParrelDP06Desc;
    @XmlElement(name = "OutTitleCustAddrParrelDP07Desc")
    protected String outTitleCustAddrParrelDP07Desc;
    @XmlElement(name = "OutTitleCustAddrParrelDP08Desc")
    protected String outTitleCustAddrParrelDP08Desc;
    @XmlElement(name = "OutTitleCustAddrParrelDP09Desc")
    protected String outTitleCustAddrParrelDP09Desc;
    @XmlElement(name = "OutTitleCustAddrParrelDP10Desc")
    protected String outTitleCustAddrParrelDP10Desc;
    @XmlElement(name = "OutSelectedRealEstateFolio")
    protected String outSelectedRealEstateFolio;
    @XmlElement(name = "OutSelectedRealEstateInsurAnnualAmnt", required = true)
    protected BigDecimal outSelectedRealEstateInsurAnnualAmnt;

    /**
     * Gets the value of the outAccountBalanceIefSuppliedAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutAccountBalanceIefSuppliedAmount() {
        return outAccountBalanceIefSuppliedAmount;
    }

    /**
     * Sets the value of the outAccountBalanceIefSuppliedAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutAccountBalanceIefSuppliedAmount(BigDecimal value) {
        this.outAccountBalanceIefSuppliedAmount = value;
    }

    /**
     * Gets the value of the outAccountCurrencyShortDescr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutAccountCurrencyShortDescr() {
        return outAccountCurrencyShortDescr;
    }

    /**
     * Sets the value of the outAccountCurrencyShortDescr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutAccountCurrencyShortDescr(String value) {
        this.outAccountCurrencyShortDescr = value;
    }

    /**
     * Gets the value of the outAdddiGenericDetailDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutAdddiGenericDetailDescription() {
        return outAdddiGenericDetailDescription;
    }

    /**
     * Sets the value of the outAdddiGenericDetailDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutAdddiGenericDetailDescription(String value) {
        this.outAdddiGenericDetailDescription = value;
    }

    /**
     * Gets the value of the outAdddiGenericDetailParameterType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutAdddiGenericDetailParameterType() {
        return outAdddiGenericDetailParameterType;
    }

    /**
     * Sets the value of the outAdddiGenericDetailParameterType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutAdddiGenericDetailParameterType(String value) {
        this.outAdddiGenericDetailParameterType = value;
    }

    /**
     * Gets the value of the outAdddiGenericDetailSerialNum property.
     * 
     */
    public int getOutAdddiGenericDetailSerialNum() {
        return outAdddiGenericDetailSerialNum;
    }

    /**
     * Sets the value of the outAdddiGenericDetailSerialNum property.
     * 
     */
    public void setOutAdddiGenericDetailSerialNum(int value) {
        this.outAdddiGenericDetailSerialNum = value;
    }

    /**
     * Gets the value of the outAgreementAgrMembershipSn property.
     * 
     */
    public int getOutAgreementAgrMembershipSn() {
        return outAgreementAgrMembershipSn;
    }

    /**
     * Sets the value of the outAgreementAgrMembershipSn property.
     * 
     */
    public void setOutAgreementAgrMembershipSn(int value) {
        this.outAgreementAgrMembershipSn = value;
    }

    /**
     * Gets the value of the outAgreementAgrSn property.
     * 
     */
    public int getOutAgreementAgrSn() {
        return outAgreementAgrSn;
    }

    /**
     * Sets the value of the outAgreementAgrSn property.
     * 
     */
    public void setOutAgreementAgrSn(int value) {
        this.outAgreementAgrSn = value;
    }

    /**
     * Gets the value of the outAgreementAgrYear property.
     * 
     */
    public short getOutAgreementAgrYear() {
        return outAgreementAgrYear;
    }

    /**
     * Sets the value of the outAgreementAgrYear property.
     * 
     */
    public void setOutAgreementAgrYear(short value) {
        this.outAgreementAgrYear = value;
    }

    /**
     * Gets the value of the outAgrUnitCode property.
     * 
     */
    public int getOutAgrUnitCode() {
        return outAgrUnitCode;
    }

    /**
     * Sets the value of the outAgrUnitCode property.
     * 
     */
    public void setOutAgrUnitCode(int value) {
        this.outAgrUnitCode = value;
    }

    /**
     * Gets the value of the outBaselGenericDetailDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutBaselGenericDetailDescription() {
        return outBaselGenericDetailDescription;
    }

    /**
     * Sets the value of the outBaselGenericDetailDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutBaselGenericDetailDescription(String value) {
        this.outBaselGenericDetailDescription = value;
    }

    /**
     * Gets the value of the outBaselGenericDetailParameterType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutBaselGenericDetailParameterType() {
        return outBaselGenericDetailParameterType;
    }

    /**
     * Sets the value of the outBaselGenericDetailParameterType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutBaselGenericDetailParameterType(String value) {
        this.outBaselGenericDetailParameterType = value;
    }

    /**
     * Gets the value of the outBaselGenericDetailSerialNum property.
     * 
     */
    public int getOutBaselGenericDetailSerialNum() {
        return outBaselGenericDetailSerialNum;
    }

    /**
     * Sets the value of the outBaselGenericDetailSerialNum property.
     * 
     */
    public void setOutBaselGenericDetailSerialNum(int value) {
        this.outBaselGenericDetailSerialNum = value;
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
     * Gets the value of the outCntryGenericDetailParameterType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCntryGenericDetailParameterType() {
        return outCntryGenericDetailParameterType;
    }

    /**
     * Sets the value of the outCntryGenericDetailParameterType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCntryGenericDetailParameterType(String value) {
        this.outCntryGenericDetailParameterType = value;
    }

    /**
     * Gets the value of the outCntryGenericDetailSerialNum property.
     * 
     */
    public int getOutCntryGenericDetailSerialNum() {
        return outCntryGenericDetailSerialNum;
    }

    /**
     * Sets the value of the outCntryGenericDetailSerialNum property.
     * 
     */
    public void setOutCntryGenericDetailSerialNum(int value) {
        this.outCntryGenericDetailSerialNum = value;
    }

    /**
     * Gets the value of the outCollateralTypeAssociationInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCollateralTypeAssociationInd() {
        return outCollateralTypeAssociationInd;
    }

    /**
     * Sets the value of the outCollateralTypeAssociationInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCollateralTypeAssociationInd(String value) {
        this.outCollateralTypeAssociationInd = value;
    }

    /**
     * Gets the value of the outCollateralTypeAssurValCalcInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCollateralTypeAssurValCalcInd() {
        return outCollateralTypeAssurValCalcInd;
    }

    /**
     * Sets the value of the outCollateralTypeAssurValCalcInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCollateralTypeAssurValCalcInd(String value) {
        this.outCollateralTypeAssurValCalcInd = value;
    }

    /**
     * Gets the value of the outCollateralTypeLandRegistryInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCollateralTypeLandRegistryInd() {
        return outCollateralTypeLandRegistryInd;
    }

    /**
     * Sets the value of the outCollateralTypeLandRegistryInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCollateralTypeLandRegistryInd(String value) {
        this.outCollateralTypeLandRegistryInd = value;
    }

    /**
     * Gets the value of the outCollateralTypeReliabilityCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCollateralTypeReliabilityCode() {
        return outCollateralTypeReliabilityCode;
    }

    /**
     * Sets the value of the outCollateralTypeReliabilityCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCollateralTypeReliabilityCode(String value) {
        this.outCollateralTypeReliabilityCode = value;
    }

    /**
     * Gets the value of the outCollateralTypeReliabilityFct property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutCollateralTypeReliabilityFct() {
        return outCollateralTypeReliabilityFct;
    }

    /**
     * Sets the value of the outCollateralTypeReliabilityFct property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutCollateralTypeReliabilityFct(BigDecimal value) {
        this.outCollateralTypeReliabilityFct = value;
    }

    /**
     * Gets the value of the outCollateralTypeValueFct property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutCollateralTypeValueFct() {
        return outCollateralTypeValueFct;
    }

    /**
     * Sets the value of the outCollateralTypeValueFct property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutCollateralTypeValueFct(BigDecimal value) {
        this.outCollateralTypeValueFct = value;
    }

    /**
     * Gets the value of the outCollateralWorkEstimatedAccountLossAc property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutCollateralWorkEstimatedAccountLossAc() {
        return outCollateralWorkEstimatedAccountLossAc;
    }

    /**
     * Sets the value of the outCollateralWorkEstimatedAccountLossAc property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutCollateralWorkEstimatedAccountLossAc(BigDecimal value) {
        this.outCollateralWorkEstimatedAccountLossAc = value;
    }

    /**
     * Gets the value of the outCollateralWorkEstimatedAccountLossDc property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutCollateralWorkEstimatedAccountLossDc() {
        return outCollateralWorkEstimatedAccountLossDc;
    }

    /**
     * Sets the value of the outCollateralWorkEstimatedAccountLossDc property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutCollateralWorkEstimatedAccountLossDc(BigDecimal value) {
        this.outCollateralWorkEstimatedAccountLossDc = value;
    }

    /**
     * Gets the value of the outCollateralWorkEstimatedInsurValueAc property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutCollateralWorkEstimatedInsurValueAc() {
        return outCollateralWorkEstimatedInsurValueAc;
    }

    /**
     * Sets the value of the outCollateralWorkEstimatedInsurValueAc property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutCollateralWorkEstimatedInsurValueAc(BigDecimal value) {
        this.outCollateralWorkEstimatedInsurValueAc = value;
    }

    /**
     * Gets the value of the outCollateralWorkEstimatedInsurValueDc property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutCollateralWorkEstimatedInsurValueDc() {
        return outCollateralWorkEstimatedInsurValueDc;
    }

    /**
     * Sets the value of the outCollateralWorkEstimatedInsurValueDc property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutCollateralWorkEstimatedInsurValueDc(BigDecimal value) {
        this.outCollateralWorkEstimatedInsurValueDc = value;
    }

    /**
     * Gets the value of the outCollateralWorkEstimatedValueAc property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutCollateralWorkEstimatedValueAc() {
        return outCollateralWorkEstimatedValueAc;
    }

    /**
     * Sets the value of the outCollateralWorkEstimatedValueAc property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutCollateralWorkEstimatedValueAc(BigDecimal value) {
        this.outCollateralWorkEstimatedValueAc = value;
    }

    /**
     * Gets the value of the outCollateralWorkEstimatedValueDc property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutCollateralWorkEstimatedValueDc() {
        return outCollateralWorkEstimatedValueDc;
    }

    /**
     * Sets the value of the outCollateralWorkEstimatedValueDc property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutCollateralWorkEstimatedValueDc(BigDecimal value) {
        this.outCollateralWorkEstimatedValueDc = value;
    }

    /**
     * Gets the value of the outCreatedRealEstateId property.
     * 
     */
    public double getOutCreatedRealEstateId() {
        return outCreatedRealEstateId;
    }

    /**
     * Sets the value of the outCreatedRealEstateId property.
     * 
     */
    public void setOutCreatedRealEstateId(double value) {
        this.outCreatedRealEstateId = value;
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
     * Gets the value of the outGrpAuxSpace property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfMc2006VOutGrpAuxSpaceItem }
     *     
     */
    public ArrayOfMc2006VOutGrpAuxSpaceItem getOutGrpAuxSpace() {
        return outGrpAuxSpace;
    }

    /**
     * Sets the value of the outGrpAuxSpace property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfMc2006VOutGrpAuxSpaceItem }
     *     
     */
    public void setOutGrpAuxSpace(ArrayOfMc2006VOutGrpAuxSpaceItem value) {
        this.outGrpAuxSpace = value;
    }

    /**
     * Gets the value of the outGrpCustomer property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfMc2006VOutGrpCustomerItem }
     *     
     */
    public ArrayOfMc2006VOutGrpCustomerItem getOutGrpCustomer() {
        return outGrpCustomer;
    }

    /**
     * Sets the value of the outGrpCustomer property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfMc2006VOutGrpCustomerItem }
     *     
     */
    public void setOutGrpCustomer(ArrayOfMc2006VOutGrpCustomerItem value) {
        this.outGrpCustomer = value;
    }

    /**
     * Gets the value of the outGrpDefRealEst property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfMc2006VOutGrpDefRealEstItem }
     *     
     */
    public ArrayOfMc2006VOutGrpDefRealEstItem getOutGrpDefRealEst() {
        return outGrpDefRealEst;
    }

    /**
     * Sets the value of the outGrpDefRealEst property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfMc2006VOutGrpDefRealEstItem }
     *     
     */
    public void setOutGrpDefRealEst(ArrayOfMc2006VOutGrpDefRealEstItem value) {
        this.outGrpDefRealEst = value;
    }

    /**
     * Gets the value of the outGrpEval property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfMc2006VOutGrpEvalItem }
     *     
     */
    public ArrayOfMc2006VOutGrpEvalItem getOutGrpEval() {
        return outGrpEval;
    }

    /**
     * Sets the value of the outGrpEval property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfMc2006VOutGrpEvalItem }
     *     
     */
    public void setOutGrpEval(ArrayOfMc2006VOutGrpEvalItem value) {
        this.outGrpEval = value;
    }

    /**
     * Gets the value of the outGrpQualInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfMc2006VOutGrpQualInfoItem }
     *     
     */
    public ArrayOfMc2006VOutGrpQualInfoItem getOutGrpQualInfo() {
        return outGrpQualInfo;
    }

    /**
     * Sets the value of the outGrpQualInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfMc2006VOutGrpQualInfoItem }
     *     
     */
    public void setOutGrpQualInfo(ArrayOfMc2006VOutGrpQualInfoItem value) {
        this.outGrpQualInfo = value;
    }

    /**
     * Gets the value of the outGrpValuers property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfMc2006VOutGrpValuersItem }
     *     
     */
    public ArrayOfMc2006VOutGrpValuersItem getOutGrpValuers() {
        return outGrpValuers;
    }

    /**
     * Sets the value of the outGrpValuers property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfMc2006VOutGrpValuersItem }
     *     
     */
    public void setOutGrpValuers(ArrayOfMc2006VOutGrpValuersItem value) {
        this.outGrpValuers = value;
    }

    /**
     * Gets the value of the outInsertUnitCode property.
     * 
     */
    public int getOutInsertUnitCode() {
        return outInsertUnitCode;
    }

    /**
     * Sets the value of the outInsertUnitCode property.
     * 
     */
    public void setOutInsertUnitCode(int value) {
        this.outInsertUnitCode = value;
    }

    /**
     * Gets the value of the outInsertUnitUnitName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutInsertUnitUnitName() {
        return outInsertUnitUnitName;
    }

    /**
     * Sets the value of the outInsertUnitUnitName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutInsertUnitUnitName(String value) {
        this.outInsertUnitUnitName = value;
    }

    /**
     * Gets the value of the outInsUsrCharSuppliedChar40 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutInsUsrCharSuppliedChar40() {
        return outInsUsrCharSuppliedChar40;
    }

    /**
     * Sets the value of the outInsUsrCharSuppliedChar40 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutInsUsrCharSuppliedChar40(String value) {
        this.outInsUsrCharSuppliedChar40 = value;
    }

    /**
     * Gets the value of the outLastCommCurrCurrencyShortDescr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutLastCommCurrCurrencyShortDescr() {
        return outLastCommCurrCurrencyShortDescr;
    }

    /**
     * Sets the value of the outLastCommCurrCurrencyShortDescr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutLastCommCurrCurrencyShortDescr(String value) {
        this.outLastCommCurrCurrencyShortDescr = value;
    }

    /**
     * Gets the value of the outLastEsrIncCurrCurrencyShortDescr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutLastEsrIncCurrCurrencyShortDescr() {
        return outLastEsrIncCurrCurrencyShortDescr;
    }

    /**
     * Sets the value of the outLastEsrIncCurrCurrencyShortDescr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutLastEsrIncCurrCurrencyShortDescr(String value) {
        this.outLastEsrIncCurrCurrencyShortDescr = value;
    }

    /**
     * Gets the value of the outLastInsurAmnCurrCurrencyShortDescr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutLastInsurAmnCurrCurrencyShortDescr() {
        return outLastInsurAmnCurrCurrencyShortDescr;
    }

    /**
     * Sets the value of the outLastInsurAmnCurrCurrencyShortDescr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutLastInsurAmnCurrCurrencyShortDescr(String value) {
        this.outLastInsurAmnCurrCurrencyShortDescr = value;
    }

    /**
     * Gets the value of the outLastInvCurrIdCurrencyShortDescr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutLastInvCurrIdCurrencyShortDescr() {
        return outLastInvCurrIdCurrencyShortDescr;
    }

    /**
     * Sets the value of the outLastInvCurrIdCurrencyShortDescr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutLastInvCurrIdCurrencyShortDescr(String value) {
        this.outLastInvCurrIdCurrencyShortDescr = value;
    }

    /**
     * Gets the value of the outLastMortAmnCurrCurrencyShortDescr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutLastMortAmnCurrCurrencyShortDescr() {
        return outLastMortAmnCurrCurrencyShortDescr;
    }

    /**
     * Sets the value of the outLastMortAmnCurrCurrencyShortDescr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutLastMortAmnCurrCurrencyShortDescr(String value) {
        this.outLastMortAmnCurrCurrencyShortDescr = value;
    }

    /**
     * Gets the value of the outLastObjCurrCurrencyShortDescr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutLastObjCurrCurrencyShortDescr() {
        return outLastObjCurrCurrencyShortDescr;
    }

    /**
     * Sets the value of the outLastObjCurrCurrencyShortDescr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutLastObjCurrCurrencyShortDescr(String value) {
        this.outLastObjCurrCurrencyShortDescr = value;
    }

    /**
     * Gets the value of the outLastPrpermeCurrCurrencyShortDescr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutLastPrpermeCurrCurrencyShortDescr() {
        return outLastPrpermeCurrCurrencyShortDescr;
    }

    /**
     * Sets the value of the outLastPrpermeCurrCurrencyShortDescr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutLastPrpermeCurrCurrencyShortDescr(String value) {
        this.outLastPrpermeCurrCurrencyShortDescr = value;
    }

    /**
     * Gets the value of the outLastRealEstateAddDescr1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutLastRealEstateAddDescr1() {
        return outLastRealEstateAddDescr1;
    }

    /**
     * Sets the value of the outLastRealEstateAddDescr1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutLastRealEstateAddDescr1(String value) {
        this.outLastRealEstateAddDescr1 = value;
    }

    /**
     * Gets the value of the outLastRealEstateAddDescr2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutLastRealEstateAddDescr2() {
        return outLastRealEstateAddDescr2;
    }

    /**
     * Sets the value of the outLastRealEstateAddDescr2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutLastRealEstateAddDescr2(String value) {
        this.outLastRealEstateAddDescr2 = value;
    }

    /**
     * Gets the value of the outLastRealEstateAddDescr3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutLastRealEstateAddDescr3() {
        return outLastRealEstateAddDescr3;
    }

    /**
     * Sets the value of the outLastRealEstateAddDescr3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutLastRealEstateAddDescr3(String value) {
        this.outLastRealEstateAddDescr3 = value;
    }

    /**
     * Gets the value of the outLastRealEstateAddDescr4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutLastRealEstateAddDescr4() {
        return outLastRealEstateAddDescr4;
    }

    /**
     * Sets the value of the outLastRealEstateAddDescr4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutLastRealEstateAddDescr4(String value) {
        this.outLastRealEstateAddDescr4 = value;
    }

    /**
     * Gets the value of the outLastRealEstateAddDescr5 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutLastRealEstateAddDescr5() {
        return outLastRealEstateAddDescr5;
    }

    /**
     * Sets the value of the outLastRealEstateAddDescr5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutLastRealEstateAddDescr5(String value) {
        this.outLastRealEstateAddDescr5 = value;
    }

    /**
     * Gets the value of the outLastRealEstateAdditionalArea property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutLastRealEstateAdditionalArea() {
        return outLastRealEstateAdditionalArea;
    }

    /**
     * Sets the value of the outLastRealEstateAdditionalArea property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutLastRealEstateAdditionalArea(BigDecimal value) {
        this.outLastRealEstateAdditionalArea = value;
    }

    /**
     * Gets the value of the outLastRealEstateAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutLastRealEstateAddress() {
        return outLastRealEstateAddress;
    }

    /**
     * Sets the value of the outLastRealEstateAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutLastRealEstateAddress(String value) {
        this.outLastRealEstateAddress = value;
    }

    /**
     * Gets the value of the outLastRealEstateAddressNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutLastRealEstateAddressNum() {
        return outLastRealEstateAddressNum;
    }

    /**
     * Sets the value of the outLastRealEstateAddressNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutLastRealEstateAddressNum(String value) {
        this.outLastRealEstateAddressNum = value;
    }

    /**
     * Gets the value of the outLastRealEstateAgreementValue property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutLastRealEstateAgreementValue() {
        return outLastRealEstateAgreementValue;
    }

    /**
     * Sets the value of the outLastRealEstateAgreementValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutLastRealEstateAgreementValue(BigDecimal value) {
        this.outLastRealEstateAgreementValue = value;
    }

    /**
     * Gets the value of the outLastRealEstateApartmentNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutLastRealEstateApartmentNum() {
        return outLastRealEstateApartmentNum;
    }

    /**
     * Sets the value of the outLastRealEstateApartmentNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutLastRealEstateApartmentNum(String value) {
        this.outLastRealEstateApartmentNum = value;
    }

    /**
     * Gets the value of the outLastRealEstateBuilding property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutLastRealEstateBuilding() {
        return outLastRealEstateBuilding;
    }

    /**
     * Sets the value of the outLastRealEstateBuilding property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutLastRealEstateBuilding(String value) {
        this.outLastRealEstateBuilding = value;
    }

    /**
     * Gets the value of the outLastRealEstateCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutLastRealEstateCity() {
        return outLastRealEstateCity;
    }

    /**
     * Sets the value of the outLastRealEstateCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutLastRealEstateCity(String value) {
        this.outLastRealEstateCity = value;
    }

    /**
     * Gets the value of the outLastRealEstateCommercialValAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutLastRealEstateCommercialValAmn() {
        return outLastRealEstateCommercialValAmn;
    }

    /**
     * Sets the value of the outLastRealEstateCommercialValAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutLastRealEstateCommercialValAmn(BigDecimal value) {
        this.outLastRealEstateCommercialValAmn = value;
    }

    /**
     * Gets the value of the outLastRealEstateConstructionYear property.
     * 
     */
    public short getOutLastRealEstateConstructionYear() {
        return outLastRealEstateConstructionYear;
    }

    /**
     * Sets the value of the outLastRealEstateConstructionYear property.
     * 
     */
    public void setOutLastRealEstateConstructionYear(short value) {
        this.outLastRealEstateConstructionYear = value;
    }

    /**
     * Gets the value of the outLastRealEstateCourt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutLastRealEstateCourt() {
        return outLastRealEstateCourt;
    }

    /**
     * Sets the value of the outLastRealEstateCourt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutLastRealEstateCourt(String value) {
        this.outLastRealEstateCourt = value;
    }

    /**
     * Gets the value of the outLastRealEstateDistrictRegistry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutLastRealEstateDistrictRegistry() {
        return outLastRealEstateDistrictRegistry;
    }

    /**
     * Sets the value of the outLastRealEstateDistrictRegistry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutLastRealEstateDistrictRegistry(String value) {
        this.outLastRealEstateDistrictRegistry = value;
    }

    /**
     * Gets the value of the outLastRealEstateEntryStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutLastRealEstateEntryStatus() {
        return outLastRealEstateEntryStatus;
    }

    /**
     * Sets the value of the outLastRealEstateEntryStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutLastRealEstateEntryStatus(String value) {
        this.outLastRealEstateEntryStatus = value;
    }

    /**
     * Gets the value of the outLastRealEstateEstate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutLastRealEstateEstate() {
        return outLastRealEstateEstate;
    }

    /**
     * Sets the value of the outLastRealEstateEstate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutLastRealEstateEstate(String value) {
        this.outLastRealEstateEstate = value;
    }

    /**
     * Gets the value of the outLastRealEstateEvalluationInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutLastRealEstateEvalluationInd() {
        return outLastRealEstateEvalluationInd;
    }

    /**
     * Sets the value of the outLastRealEstateEvalluationInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutLastRealEstateEvalluationInd(String value) {
        this.outLastRealEstateEvalluationInd = value;
    }

    /**
     * Gets the value of the outLastRealEstateFrontageInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutLastRealEstateFrontageInd() {
        return outLastRealEstateFrontageInd;
    }

    /**
     * Sets the value of the outLastRealEstateFrontageInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutLastRealEstateFrontageInd(String value) {
        this.outLastRealEstateFrontageInd = value;
    }

    /**
     * Gets the value of the outLastRealEstateId property.
     * 
     */
    public double getOutLastRealEstateId() {
        return outLastRealEstateId;
    }

    /**
     * Sets the value of the outLastRealEstateId property.
     * 
     */
    public void setOutLastRealEstateId(double value) {
        this.outLastRealEstateId = value;
    }

    /**
     * Gets the value of the outLastRealEstateInsertionDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutLastRealEstateInsertionDt() {
        return outLastRealEstateInsertionDt;
    }

    /**
     * Sets the value of the outLastRealEstateInsertionDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutLastRealEstateInsertionDt(XMLGregorianCalendar value) {
        this.outLastRealEstateInsertionDt = value;
    }

    /**
     * Gets the value of the outLastRealEstateInsertionUsr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutLastRealEstateInsertionUsr() {
        return outLastRealEstateInsertionUsr;
    }

    /**
     * Sets the value of the outLastRealEstateInsertionUsr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutLastRealEstateInsertionUsr(String value) {
        this.outLastRealEstateInsertionUsr = value;
    }

    /**
     * Gets the value of the outLastRealEstateInsOriginalAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutLastRealEstateInsOriginalAmn() {
        return outLastRealEstateInsOriginalAmn;
    }

    /**
     * Sets the value of the outLastRealEstateInsOriginalAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutLastRealEstateInsOriginalAmn(BigDecimal value) {
        this.outLastRealEstateInsOriginalAmn = value;
    }

    /**
     * Gets the value of the outLastRealEstateInsuranceAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutLastRealEstateInsuranceAmn() {
        return outLastRealEstateInsuranceAmn;
    }

    /**
     * Sets the value of the outLastRealEstateInsuranceAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutLastRealEstateInsuranceAmn(BigDecimal value) {
        this.outLastRealEstateInsuranceAmn = value;
    }

    /**
     * Gets the value of the outLastRealEstateInsuranceDescr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutLastRealEstateInsuranceDescr() {
        return outLastRealEstateInsuranceDescr;
    }

    /**
     * Sets the value of the outLastRealEstateInsuranceDescr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutLastRealEstateInsuranceDescr(String value) {
        this.outLastRealEstateInsuranceDescr = value;
    }

    /**
     * Gets the value of the outLastRealEstateInsuranceEd property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutLastRealEstateInsuranceEd() {
        return outLastRealEstateInsuranceEd;
    }

    /**
     * Sets the value of the outLastRealEstateInsuranceEd property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutLastRealEstateInsuranceEd(XMLGregorianCalendar value) {
        this.outLastRealEstateInsuranceEd = value;
    }

    /**
     * Gets the value of the outLastRealEstateInsuranceSd property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutLastRealEstateInsuranceSd() {
        return outLastRealEstateInsuranceSd;
    }

    /**
     * Sets the value of the outLastRealEstateInsuranceSd property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutLastRealEstateInsuranceSd(XMLGregorianCalendar value) {
        this.outLastRealEstateInsuranceSd = value;
    }

    /**
     * Gets the value of the outLastRealEstateMainArea property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutLastRealEstateMainArea() {
        return outLastRealEstateMainArea;
    }

    /**
     * Sets the value of the outLastRealEstateMainArea property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutLastRealEstateMainArea(BigDecimal value) {
        this.outLastRealEstateMainArea = value;
    }

    /**
     * Gets the value of the outLastRealEstateModificationDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutLastRealEstateModificationDt() {
        return outLastRealEstateModificationDt;
    }

    /**
     * Sets the value of the outLastRealEstateModificationDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutLastRealEstateModificationDt(XMLGregorianCalendar value) {
        this.outLastRealEstateModificationDt = value;
    }

    /**
     * Gets the value of the outLastRealEstateModificationUsr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutLastRealEstateModificationUsr() {
        return outLastRealEstateModificationUsr;
    }

    /**
     * Sets the value of the outLastRealEstateModificationUsr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutLastRealEstateModificationUsr(String value) {
        this.outLastRealEstateModificationUsr = value;
    }

    /**
     * Gets the value of the outLastRealEstateMunicipality property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutLastRealEstateMunicipality() {
        return outLastRealEstateMunicipality;
    }

    /**
     * Sets the value of the outLastRealEstateMunicipality property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutLastRealEstateMunicipality(String value) {
        this.outLastRealEstateMunicipality = value;
    }

    /**
     * Gets the value of the outLastRealEstateOwnershipInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutLastRealEstateOwnershipInd() {
        return outLastRealEstateOwnershipInd;
    }

    /**
     * Sets the value of the outLastRealEstateOwnershipInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutLastRealEstateOwnershipInd(String value) {
        this.outLastRealEstateOwnershipInd = value;
    }

    /**
     * Gets the value of the outLastRealEstateParLandRegistId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutLastRealEstateParLandRegistId() {
        return outLastRealEstateParLandRegistId;
    }

    /**
     * Sets the value of the outLastRealEstateParLandRegistId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutLastRealEstateParLandRegistId(String value) {
        this.outLastRealEstateParLandRegistId = value;
    }

    /**
     * Gets the value of the outLastRealEstateRealEstateCat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutLastRealEstateRealEstateCat() {
        return outLastRealEstateRealEstateCat;
    }

    /**
     * Sets the value of the outLastRealEstateRealEstateCat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutLastRealEstateRealEstateCat(String value) {
        this.outLastRealEstateRealEstateCat = value;
    }

    /**
     * Gets the value of the outLastRealEstateRealEstateDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutLastRealEstateRealEstateDesc() {
        return outLastRealEstateRealEstateDesc;
    }

    /**
     * Sets the value of the outLastRealEstateRealEstateDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutLastRealEstateRealEstateDesc(String value) {
        this.outLastRealEstateRealEstateDesc = value;
    }

    /**
     * Gets the value of the outLastRealEstateRealEstateType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutLastRealEstateRealEstateType() {
        return outLastRealEstateRealEstateType;
    }

    /**
     * Sets the value of the outLastRealEstateRealEstateType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutLastRealEstateRealEstateType(String value) {
        this.outLastRealEstateRealEstateType = value;
    }

    /**
     * Gets the value of the outLastRealEstateReevalFreq property.
     * 
     */
    public short getOutLastRealEstateReevalFreq() {
        return outLastRealEstateReevalFreq;
    }

    /**
     * Sets the value of the outLastRealEstateReevalFreq property.
     * 
     */
    public void setOutLastRealEstateReevalFreq(short value) {
        this.outLastRealEstateReevalFreq = value;
    }

    /**
     * Gets the value of the outLastRealEstateRegion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutLastRealEstateRegion() {
        return outLastRealEstateRegion;
    }

    /**
     * Sets the value of the outLastRealEstateRegion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutLastRealEstateRegion(String value) {
        this.outLastRealEstateRegion = value;
    }

    /**
     * Gets the value of the outLastRealEstateRegistry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutLastRealEstateRegistry() {
        return outLastRealEstateRegistry;
    }

    /**
     * Sets the value of the outLastRealEstateRegistry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutLastRealEstateRegistry(String value) {
        this.outLastRealEstateRegistry = value;
    }

    /**
     * Gets the value of the outLastRealEstateRegistryTitleNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutLastRealEstateRegistryTitleNo() {
        return outLastRealEstateRegistryTitleNo;
    }

    /**
     * Sets the value of the outLastRealEstateRegistryTitleNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutLastRealEstateRegistryTitleNo(String value) {
        this.outLastRealEstateRegistryTitleNo = value;
    }

    /**
     * Gets the value of the outLastRealEstateTitleExpiryDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutLastRealEstateTitleExpiryDt() {
        return outLastRealEstateTitleExpiryDt;
    }

    /**
     * Sets the value of the outLastRealEstateTitleExpiryDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutLastRealEstateTitleExpiryDt(XMLGregorianCalendar value) {
        this.outLastRealEstateTitleExpiryDt = value;
    }

    /**
     * Gets the value of the outLastRealEstateTitleIssueDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutLastRealEstateTitleIssueDt() {
        return outLastRealEstateTitleIssueDt;
    }

    /**
     * Sets the value of the outLastRealEstateTitleIssueDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutLastRealEstateTitleIssueDt(XMLGregorianCalendar value) {
        this.outLastRealEstateTitleIssueDt = value;
    }

    /**
     * Gets the value of the outLastRealEstateTitleNatureType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutLastRealEstateTitleNatureType() {
        return outLastRealEstateTitleNatureType;
    }

    /**
     * Sets the value of the outLastRealEstateTitleNatureType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutLastRealEstateTitleNatureType(String value) {
        this.outLastRealEstateTitleNatureType = value;
    }

    /**
     * Gets the value of the outLastRealEstateTitleTerm property.
     * 
     */
    public int getOutLastRealEstateTitleTerm() {
        return outLastRealEstateTitleTerm;
    }

    /**
     * Sets the value of the outLastRealEstateTitleTerm property.
     * 
     */
    public void setOutLastRealEstateTitleTerm(int value) {
        this.outLastRealEstateTitleTerm = value;
    }

    /**
     * Gets the value of the outLastRealEstateTrxUnit property.
     * 
     */
    public int getOutLastRealEstateTrxUnit() {
        return outLastRealEstateTrxUnit;
    }

    /**
     * Sets the value of the outLastRealEstateTrxUnit property.
     * 
     */
    public void setOutLastRealEstateTrxUnit(int value) {
        this.outLastRealEstateTrxUnit = value;
    }

    /**
     * Gets the value of the outLastRealEstateUnitNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutLastRealEstateUnitNo() {
        return outLastRealEstateUnitNo;
    }

    /**
     * Sets the value of the outLastRealEstateUnitNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutLastRealEstateUnitNo(String value) {
        this.outLastRealEstateUnitNo = value;
    }

    /**
     * Gets the value of the outLastRealEstateZipCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutLastRealEstateZipCode() {
        return outLastRealEstateZipCode;
    }

    /**
     * Sets the value of the outLastRealEstateZipCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutLastRealEstateZipCode(String value) {
        this.outLastRealEstateZipCode = value;
    }

    /**
     * Gets the value of the outLastRealEstateApprslAdoptionValDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutLastRealEstateApprslAdoptionValDt() {
        return outLastRealEstateApprslAdoptionValDt;
    }

    /**
     * Sets the value of the outLastRealEstateApprslAdoptionValDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutLastRealEstateApprslAdoptionValDt(XMLGregorianCalendar value) {
        this.outLastRealEstateApprslAdoptionValDt = value;
    }

    /**
     * Gets the value of the outLastRealEstateApprslApraisalCmnts property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutLastRealEstateApprslApraisalCmnts() {
        return outLastRealEstateApprslApraisalCmnts;
    }

    /**
     * Sets the value of the outLastRealEstateApprslApraisalCmnts property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutLastRealEstateApprslApraisalCmnts(String value) {
        this.outLastRealEstateApprslApraisalCmnts = value;
    }

    /**
     * Gets the value of the outLastRealEstateApprslCommercValue property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutLastRealEstateApprslCommercValue() {
        return outLastRealEstateApprslCommercValue;
    }

    /**
     * Sets the value of the outLastRealEstateApprslCommercValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutLastRealEstateApprslCommercValue(BigDecimal value) {
        this.outLastRealEstateApprslCommercValue = value;
    }

    /**
     * Gets the value of the outLastRealEstateApprslEntryStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutLastRealEstateApprslEntryStatus() {
        return outLastRealEstateApprslEntryStatus;
    }

    /**
     * Sets the value of the outLastRealEstateApprslEntryStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutLastRealEstateApprslEntryStatus(String value) {
        this.outLastRealEstateApprslEntryStatus = value;
    }

    /**
     * Gets the value of the outLastRealEstateApprslEstInsurAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutLastRealEstateApprslEstInsurAmn() {
        return outLastRealEstateApprslEstInsurAmn;
    }

    /**
     * Sets the value of the outLastRealEstateApprslEstInsurAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutLastRealEstateApprslEstInsurAmn(BigDecimal value) {
        this.outLastRealEstateApprslEstInsurAmn = value;
    }

    /**
     * Gets the value of the outLastRealEstateApprslEstRentalIncAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutLastRealEstateApprslEstRentalIncAmn() {
        return outLastRealEstateApprslEstRentalIncAmn;
    }

    /**
     * Sets the value of the outLastRealEstateApprslEstRentalIncAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutLastRealEstateApprslEstRentalIncAmn(BigDecimal value) {
        this.outLastRealEstateApprslEstRentalIncAmn = value;
    }

    /**
     * Gets the value of the outLastRealEstateApprslEvaluationDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutLastRealEstateApprslEvaluationDt() {
        return outLastRealEstateApprslEvaluationDt;
    }

    /**
     * Sets the value of the outLastRealEstateApprslEvaluationDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutLastRealEstateApprslEvaluationDt(XMLGregorianCalendar value) {
        this.outLastRealEstateApprslEvaluationDt = value;
    }

    /**
     * Gets the value of the outLastRealEstateApprslEvaluator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutLastRealEstateApprslEvaluator() {
        return outLastRealEstateApprslEvaluator;
    }

    /**
     * Sets the value of the outLastRealEstateApprslEvaluator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutLastRealEstateApprslEvaluator(String value) {
        this.outLastRealEstateApprslEvaluator = value;
    }

    /**
     * Gets the value of the outLastRealEstateApprslInternalSn property.
     * 
     */
    public double getOutLastRealEstateApprslInternalSn() {
        return outLastRealEstateApprslInternalSn;
    }

    /**
     * Sets the value of the outLastRealEstateApprslInternalSn property.
     * 
     */
    public void setOutLastRealEstateApprslInternalSn(double value) {
        this.outLastRealEstateApprslInternalSn = value;
    }

    /**
     * Gets the value of the outLastRealEstateApprslInvestmentAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutLastRealEstateApprslInvestmentAmn() {
        return outLastRealEstateApprslInvestmentAmn;
    }

    /**
     * Sets the value of the outLastRealEstateApprslInvestmentAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutLastRealEstateApprslInvestmentAmn(BigDecimal value) {
        this.outLastRealEstateApprslInvestmentAmn = value;
    }

    /**
     * Gets the value of the outLastRealEstateApprslMortgageValue property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutLastRealEstateApprslMortgageValue() {
        return outLastRealEstateApprslMortgageValue;
    }

    /**
     * Sets the value of the outLastRealEstateApprslMortgageValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutLastRealEstateApprslMortgageValue(BigDecimal value) {
        this.outLastRealEstateApprslMortgageValue = value;
    }

    /**
     * Gets the value of the outLastRealEstateApprslObjectiveAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutLastRealEstateApprslObjectiveAmn() {
        return outLastRealEstateApprslObjectiveAmn;
    }

    /**
     * Sets the value of the outLastRealEstateApprslObjectiveAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutLastRealEstateApprslObjectiveAmn(BigDecimal value) {
        this.outLastRealEstateApprslObjectiveAmn = value;
    }

    /**
     * Gets the value of the outLastRealEstateApprslPricePerMeter property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutLastRealEstateApprslPricePerMeter() {
        return outLastRealEstateApprslPricePerMeter;
    }

    /**
     * Sets the value of the outLastRealEstateApprslPricePerMeter property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutLastRealEstateApprslPricePerMeter(BigDecimal value) {
        this.outLastRealEstateApprslPricePerMeter = value;
    }

    /**
     * Gets the value of the outLastRealEstateApprslSellValue property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutLastRealEstateApprslSellValue() {
        return outLastRealEstateApprslSellValue;
    }

    /**
     * Sets the value of the outLastRealEstateApprslSellValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutLastRealEstateApprslSellValue(BigDecimal value) {
        this.outLastRealEstateApprslSellValue = value;
    }

    /**
     * Gets the value of the outLastSelAmnCurrCurrencyShortDescr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutLastSelAmnCurrCurrencyShortDescr() {
        return outLastSelAmnCurrCurrencyShortDescr;
    }

    /**
     * Sets the value of the outLastSelAmnCurrCurrencyShortDescr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutLastSelAmnCurrCurrencyShortDescr(String value) {
        this.outLastSelAmnCurrCurrencyShortDescr = value;
    }

    /**
     * Gets the value of the outLastValuationTypeGenericDetailDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutLastValuationTypeGenericDetailDescription() {
        return outLastValuationTypeGenericDetailDescription;
    }

    /**
     * Sets the value of the outLastValuationTypeGenericDetailDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutLastValuationTypeGenericDetailDescription(String value) {
        this.outLastValuationTypeGenericDetailDescription = value;
    }

    /**
     * Gets the value of the outLeas2GenericDetailDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutLeas2GenericDetailDescription() {
        return outLeas2GenericDetailDescription;
    }

    /**
     * Sets the value of the outLeas2GenericDetailDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutLeas2GenericDetailDescription(String value) {
        this.outLeas2GenericDetailDescription = value;
    }

    /**
     * Gets the value of the outLeas2GenericDetailParameterType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutLeas2GenericDetailParameterType() {
        return outLeas2GenericDetailParameterType;
    }

    /**
     * Sets the value of the outLeas2GenericDetailParameterType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutLeas2GenericDetailParameterType(String value) {
        this.outLeas2GenericDetailParameterType = value;
    }

    /**
     * Gets the value of the outLeas2GenericDetailSerialNum property.
     * 
     */
    public int getOutLeas2GenericDetailSerialNum() {
        return outLeas2GenericDetailSerialNum;
    }

    /**
     * Sets the value of the outLeas2GenericDetailSerialNum property.
     * 
     */
    public void setOutLeas2GenericDetailSerialNum(int value) {
        this.outLeas2GenericDetailSerialNum = value;
    }

    /**
     * Gets the value of the outLoanAccountAccCd property.
     * 
     */
    public short getOutLoanAccountAccCd() {
        return outLoanAccountAccCd;
    }

    /**
     * Sets the value of the outLoanAccountAccCd property.
     * 
     */
    public void setOutLoanAccountAccCd(short value) {
        this.outLoanAccountAccCd = value;
    }

    /**
     * Gets the value of the outLoanAccountAccSn property.
     * 
     */
    public int getOutLoanAccountAccSn() {
        return outLoanAccountAccSn;
    }

    /**
     * Sets the value of the outLoanAccountAccSn property.
     * 
     */
    public void setOutLoanAccountAccSn(int value) {
        this.outLoanAccountAccSn = value;
    }

    /**
     * Gets the value of the outLoanAccountAccType property.
     * 
     */
    public short getOutLoanAccountAccType() {
        return outLoanAccountAccType;
    }

    /**
     * Sets the value of the outLoanAccountAccType property.
     * 
     */
    public void setOutLoanAccountAccType(short value) {
        this.outLoanAccountAccType = value;
    }

    /**
     * Gets the value of the outLoanAccUnitCode property.
     * 
     */
    public int getOutLoanAccUnitCode() {
        return outLoanAccUnitCode;
    }

    /**
     * Sets the value of the outLoanAccUnitCode property.
     * 
     */
    public void setOutLoanAccUnitCode(int value) {
        this.outLoanAccUnitCode = value;
    }

    /**
     * Gets the value of the outLoanAccUnitEntryStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutLoanAccUnitEntryStatus() {
        return outLoanAccUnitEntryStatus;
    }

    /**
     * Sets the value of the outLoanAccUnitEntryStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutLoanAccUnitEntryStatus(String value) {
        this.outLoanAccUnitEntryStatus = value;
    }

    /**
     * Gets the value of the outLoanAccUnitUnitName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutLoanAccUnitUnitName() {
        return outLoanAccUnitUnitName;
    }

    /**
     * Sets the value of the outLoanAccUnitUnitName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutLoanAccUnitUnitName(String value) {
        this.outLoanAccUnitUnitName = value;
    }

    /**
     * Gets the value of the outLoanProductDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutLoanProductDescription() {
        return outLoanProductDescription;
    }

    /**
     * Sets the value of the outLoanProductDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutLoanProductDescription(String value) {
        this.outLoanProductDescription = value;
    }

    /**
     * Gets the value of the outLoanProductIdProduct property.
     * 
     */
    public int getOutLoanProductIdProduct() {
        return outLoanProductIdProduct;
    }

    /**
     * Sets the value of the outLoanProductIdProduct property.
     * 
     */
    public void setOutLoanProductIdProduct(int value) {
        this.outLoanProductIdProduct = value;
    }

    /**
     * Gets the value of the outLoopFlagIefSuppliedFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutLoopFlagIefSuppliedFlag() {
        return outLoopFlagIefSuppliedFlag;
    }

    /**
     * Sets the value of the outLoopFlagIefSuppliedFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutLoopFlagIefSuppliedFlag(String value) {
        this.outLoopFlagIefSuppliedFlag = value;
    }

    /**
     * Gets the value of the outNatureTitleGenericDetailDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutNatureTitleGenericDetailDescription() {
        return outNatureTitleGenericDetailDescription;
    }

    /**
     * Sets the value of the outNatureTitleGenericDetailDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutNatureTitleGenericDetailDescription(String value) {
        this.outNatureTitleGenericDetailDescription = value;
    }

    /**
     * Gets the value of the outNatureTitleGenericDetailParameterType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutNatureTitleGenericDetailParameterType() {
        return outNatureTitleGenericDetailParameterType;
    }

    /**
     * Sets the value of the outNatureTitleGenericDetailParameterType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutNatureTitleGenericDetailParameterType(String value) {
        this.outNatureTitleGenericDetailParameterType = value;
    }

    /**
     * Gets the value of the outNatureTitleGenericDetailSerialNum property.
     * 
     */
    public int getOutNatureTitleGenericDetailSerialNum() {
        return outNatureTitleGenericDetailSerialNum;
    }

    /**
     * Sets the value of the outNatureTitleGenericDetailSerialNum property.
     * 
     */
    public void setOutNatureTitleGenericDetailSerialNum(int value) {
        this.outNatureTitleGenericDetailSerialNum = value;
    }

    /**
     * Gets the value of the outRecatGenericDetailDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutRecatGenericDetailDescription() {
        return outRecatGenericDetailDescription;
    }

    /**
     * Sets the value of the outRecatGenericDetailDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutRecatGenericDetailDescription(String value) {
        this.outRecatGenericDetailDescription = value;
    }

    /**
     * Gets the value of the outRecatGenericDetailParameterType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutRecatGenericDetailParameterType() {
        return outRecatGenericDetailParameterType;
    }

    /**
     * Sets the value of the outRecatGenericDetailParameterType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutRecatGenericDetailParameterType(String value) {
        this.outRecatGenericDetailParameterType = value;
    }

    /**
     * Gets the value of the outRecatGenericDetailSerialNum property.
     * 
     */
    public int getOutRecatGenericDetailSerialNum() {
        return outRecatGenericDetailSerialNum;
    }

    /**
     * Sets the value of the outRecatGenericDetailSerialNum property.
     * 
     */
    public void setOutRecatGenericDetailSerialNum(int value) {
        this.outRecatGenericDetailSerialNum = value;
    }

    /**
     * Gets the value of the outRecbkGenericDetailDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutRecbkGenericDetailDescription() {
        return outRecbkGenericDetailDescription;
    }

    /**
     * Sets the value of the outRecbkGenericDetailDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutRecbkGenericDetailDescription(String value) {
        this.outRecbkGenericDetailDescription = value;
    }

    /**
     * Gets the value of the outRecbkGenericDetailParameterType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutRecbkGenericDetailParameterType() {
        return outRecbkGenericDetailParameterType;
    }

    /**
     * Sets the value of the outRecbkGenericDetailParameterType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutRecbkGenericDetailParameterType(String value) {
        this.outRecbkGenericDetailParameterType = value;
    }

    /**
     * Gets the value of the outRecbkGenericDetailSerialNum property.
     * 
     */
    public int getOutRecbkGenericDetailSerialNum() {
        return outRecbkGenericDetailSerialNum;
    }

    /**
     * Sets the value of the outRecbkGenericDetailSerialNum property.
     * 
     */
    public void setOutRecbkGenericDetailSerialNum(int value) {
        this.outRecbkGenericDetailSerialNum = value;
    }

    /**
     * Gets the value of the outReincGenericDetailDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutReincGenericDetailDescription() {
        return outReincGenericDetailDescription;
    }

    /**
     * Sets the value of the outReincGenericDetailDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutReincGenericDetailDescription(String value) {
        this.outReincGenericDetailDescription = value;
    }

    /**
     * Gets the value of the outReincGenericDetailParameterType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutReincGenericDetailParameterType() {
        return outReincGenericDetailParameterType;
    }

    /**
     * Sets the value of the outReincGenericDetailParameterType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutReincGenericDetailParameterType(String value) {
        this.outReincGenericDetailParameterType = value;
    }

    /**
     * Gets the value of the outReincGenericDetailSerialNum property.
     * 
     */
    public int getOutReincGenericDetailSerialNum() {
        return outReincGenericDetailSerialNum;
    }

    /**
     * Sets the value of the outReincGenericDetailSerialNum property.
     * 
     */
    public void setOutReincGenericDetailSerialNum(int value) {
        this.outReincGenericDetailSerialNum = value;
    }

    /**
     * Gets the value of the outReinsGenericDetailDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutReinsGenericDetailDescription() {
        return outReinsGenericDetailDescription;
    }

    /**
     * Sets the value of the outReinsGenericDetailDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutReinsGenericDetailDescription(String value) {
        this.outReinsGenericDetailDescription = value;
    }

    /**
     * Gets the value of the outReinsGenericDetailParameterType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutReinsGenericDetailParameterType() {
        return outReinsGenericDetailParameterType;
    }

    /**
     * Sets the value of the outReinsGenericDetailParameterType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutReinsGenericDetailParameterType(String value) {
        this.outReinsGenericDetailParameterType = value;
    }

    /**
     * Gets the value of the outReinsGenericDetailSerialNum property.
     * 
     */
    public int getOutReinsGenericDetailSerialNum() {
        return outReinsGenericDetailSerialNum;
    }

    /**
     * Sets the value of the outReinsGenericDetailSerialNum property.
     * 
     */
    public void setOutReinsGenericDetailSerialNum(int value) {
        this.outReinsGenericDetailSerialNum = value;
    }

    /**
     * Gets the value of the outRelocGenericDetailDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutRelocGenericDetailDescription() {
        return outRelocGenericDetailDescription;
    }

    /**
     * Sets the value of the outRelocGenericDetailDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutRelocGenericDetailDescription(String value) {
        this.outRelocGenericDetailDescription = value;
    }

    /**
     * Gets the value of the outRelocGenericDetailParameterType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutRelocGenericDetailParameterType() {
        return outRelocGenericDetailParameterType;
    }

    /**
     * Sets the value of the outRelocGenericDetailParameterType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutRelocGenericDetailParameterType(String value) {
        this.outRelocGenericDetailParameterType = value;
    }

    /**
     * Gets the value of the outRelocGenericDetailSerialNum property.
     * 
     */
    public int getOutRelocGenericDetailSerialNum() {
        return outRelocGenericDetailSerialNum;
    }

    /**
     * Sets the value of the outRelocGenericDetailSerialNum property.
     * 
     */
    public void setOutRelocGenericDetailSerialNum(int value) {
        this.outRelocGenericDetailSerialNum = value;
    }

    /**
     * Gets the value of the outRetypGenericDetailDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutRetypGenericDetailDescription() {
        return outRetypGenericDetailDescription;
    }

    /**
     * Sets the value of the outRetypGenericDetailDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutRetypGenericDetailDescription(String value) {
        this.outRetypGenericDetailDescription = value;
    }

    /**
     * Gets the value of the outRetypGenericDetailParameterType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutRetypGenericDetailParameterType() {
        return outRetypGenericDetailParameterType;
    }

    /**
     * Sets the value of the outRetypGenericDetailParameterType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutRetypGenericDetailParameterType(String value) {
        this.outRetypGenericDetailParameterType = value;
    }

    /**
     * Gets the value of the outRetypGenericDetailSerialNum property.
     * 
     */
    public int getOutRetypGenericDetailSerialNum() {
        return outRetypGenericDetailSerialNum;
    }

    /**
     * Sets the value of the outRetypGenericDetailSerialNum property.
     * 
     */
    public void setOutRetypGenericDetailSerialNum(int value) {
        this.outRetypGenericDetailSerialNum = value;
    }

    /**
     * Gets the value of the outSelectedRealEstateAddDescr1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSelectedRealEstateAddDescr1() {
        return outSelectedRealEstateAddDescr1;
    }

    /**
     * Sets the value of the outSelectedRealEstateAddDescr1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSelectedRealEstateAddDescr1(String value) {
        this.outSelectedRealEstateAddDescr1 = value;
    }

    /**
     * Gets the value of the outSelectedRealEstateAddDescr2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSelectedRealEstateAddDescr2() {
        return outSelectedRealEstateAddDescr2;
    }

    /**
     * Sets the value of the outSelectedRealEstateAddDescr2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSelectedRealEstateAddDescr2(String value) {
        this.outSelectedRealEstateAddDescr2 = value;
    }

    /**
     * Gets the value of the outSelectedRealEstateAddDescr3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSelectedRealEstateAddDescr3() {
        return outSelectedRealEstateAddDescr3;
    }

    /**
     * Sets the value of the outSelectedRealEstateAddDescr3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSelectedRealEstateAddDescr3(String value) {
        this.outSelectedRealEstateAddDescr3 = value;
    }

    /**
     * Gets the value of the outSelectedRealEstateAddDescr4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSelectedRealEstateAddDescr4() {
        return outSelectedRealEstateAddDescr4;
    }

    /**
     * Sets the value of the outSelectedRealEstateAddDescr4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSelectedRealEstateAddDescr4(String value) {
        this.outSelectedRealEstateAddDescr4 = value;
    }

    /**
     * Gets the value of the outSelectedRealEstateAddDescr5 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSelectedRealEstateAddDescr5() {
        return outSelectedRealEstateAddDescr5;
    }

    /**
     * Sets the value of the outSelectedRealEstateAddDescr5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSelectedRealEstateAddDescr5(String value) {
        this.outSelectedRealEstateAddDescr5 = value;
    }

    /**
     * Gets the value of the outSelectedRealEstateAdditionalArea property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutSelectedRealEstateAdditionalArea() {
        return outSelectedRealEstateAdditionalArea;
    }

    /**
     * Sets the value of the outSelectedRealEstateAdditionalArea property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutSelectedRealEstateAdditionalArea(BigDecimal value) {
        this.outSelectedRealEstateAdditionalArea = value;
    }

    /**
     * Gets the value of the outSelectedRealEstateAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSelectedRealEstateAddress() {
        return outSelectedRealEstateAddress;
    }

    /**
     * Sets the value of the outSelectedRealEstateAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSelectedRealEstateAddress(String value) {
        this.outSelectedRealEstateAddress = value;
    }

    /**
     * Gets the value of the outSelectedRealEstateAddressNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSelectedRealEstateAddressNum() {
        return outSelectedRealEstateAddressNum;
    }

    /**
     * Sets the value of the outSelectedRealEstateAddressNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSelectedRealEstateAddressNum(String value) {
        this.outSelectedRealEstateAddressNum = value;
    }

    /**
     * Gets the value of the outSelectedRealEstateAgreementValue property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutSelectedRealEstateAgreementValue() {
        return outSelectedRealEstateAgreementValue;
    }

    /**
     * Sets the value of the outSelectedRealEstateAgreementValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutSelectedRealEstateAgreementValue(BigDecimal value) {
        this.outSelectedRealEstateAgreementValue = value;
    }

    /**
     * Gets the value of the outSelectedRealEstateAnnualRentAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutSelectedRealEstateAnnualRentAmn() {
        return outSelectedRealEstateAnnualRentAmn;
    }

    /**
     * Sets the value of the outSelectedRealEstateAnnualRentAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutSelectedRealEstateAnnualRentAmn(BigDecimal value) {
        this.outSelectedRealEstateAnnualRentAmn = value;
    }

    /**
     * Gets the value of the outSelectedRealEstateApartmentNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSelectedRealEstateApartmentNum() {
        return outSelectedRealEstateApartmentNum;
    }

    /**
     * Sets the value of the outSelectedRealEstateApartmentNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSelectedRealEstateApartmentNum(String value) {
        this.outSelectedRealEstateApartmentNum = value;
    }

    /**
     * Gets the value of the outSelectedRealEstateBuilding property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSelectedRealEstateBuilding() {
        return outSelectedRealEstateBuilding;
    }

    /**
     * Sets the value of the outSelectedRealEstateBuilding property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSelectedRealEstateBuilding(String value) {
        this.outSelectedRealEstateBuilding = value;
    }

    /**
     * Gets the value of the outSelectedRealEstateBuildLicenceid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSelectedRealEstateBuildLicenceid() {
        return outSelectedRealEstateBuildLicenceid;
    }

    /**
     * Sets the value of the outSelectedRealEstateBuildLicenceid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSelectedRealEstateBuildLicenceid(String value) {
        this.outSelectedRealEstateBuildLicenceid = value;
    }

    /**
     * Gets the value of the outSelectedRealEstateCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSelectedRealEstateCity() {
        return outSelectedRealEstateCity;
    }

    /**
     * Sets the value of the outSelectedRealEstateCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSelectedRealEstateCity(String value) {
        this.outSelectedRealEstateCity = value;
    }

    /**
     * Gets the value of the outSelectedRealEstateCommercialValAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutSelectedRealEstateCommercialValAmn() {
        return outSelectedRealEstateCommercialValAmn;
    }

    /**
     * Sets the value of the outSelectedRealEstateCommercialValAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutSelectedRealEstateCommercialValAmn(BigDecimal value) {
        this.outSelectedRealEstateCommercialValAmn = value;
    }

    /**
     * Gets the value of the outSelectedRealEstateConstrCostAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutSelectedRealEstateConstrCostAmn() {
        return outSelectedRealEstateConstrCostAmn;
    }

    /**
     * Sets the value of the outSelectedRealEstateConstrCostAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutSelectedRealEstateConstrCostAmn(BigDecimal value) {
        this.outSelectedRealEstateConstrCostAmn = value;
    }

    /**
     * Gets the value of the outSelectedRealEstateConstructionYear property.
     * 
     */
    public short getOutSelectedRealEstateConstructionYear() {
        return outSelectedRealEstateConstructionYear;
    }

    /**
     * Sets the value of the outSelectedRealEstateConstructionYear property.
     * 
     */
    public void setOutSelectedRealEstateConstructionYear(short value) {
        this.outSelectedRealEstateConstructionYear = value;
    }

    /**
     * Gets the value of the outSelectedRealEstateCourt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSelectedRealEstateCourt() {
        return outSelectedRealEstateCourt;
    }

    /**
     * Sets the value of the outSelectedRealEstateCourt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSelectedRealEstateCourt(String value) {
        this.outSelectedRealEstateCourt = value;
    }

    /**
     * Gets the value of the outSelectedRealEstateDistrictRegistry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSelectedRealEstateDistrictRegistry() {
        return outSelectedRealEstateDistrictRegistry;
    }

    /**
     * Sets the value of the outSelectedRealEstateDistrictRegistry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSelectedRealEstateDistrictRegistry(String value) {
        this.outSelectedRealEstateDistrictRegistry = value;
    }

    /**
     * Gets the value of the outSelectedRealEstateEntryStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSelectedRealEstateEntryStatus() {
        return outSelectedRealEstateEntryStatus;
    }

    /**
     * Sets the value of the outSelectedRealEstateEntryStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSelectedRealEstateEntryStatus(String value) {
        this.outSelectedRealEstateEntryStatus = value;
    }

    /**
     * Gets the value of the outSelectedRealEstateEstate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSelectedRealEstateEstate() {
        return outSelectedRealEstateEstate;
    }

    /**
     * Sets the value of the outSelectedRealEstateEstate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSelectedRealEstateEstate(String value) {
        this.outSelectedRealEstateEstate = value;
    }

    /**
     * Gets the value of the outSelectedRealEstateEvalluationInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSelectedRealEstateEvalluationInd() {
        return outSelectedRealEstateEvalluationInd;
    }

    /**
     * Sets the value of the outSelectedRealEstateEvalluationInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSelectedRealEstateEvalluationInd(String value) {
        this.outSelectedRealEstateEvalluationInd = value;
    }

    /**
     * Gets the value of the outSelectedRealEstateFrontageInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSelectedRealEstateFrontageInd() {
        return outSelectedRealEstateFrontageInd;
    }

    /**
     * Sets the value of the outSelectedRealEstateFrontageInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSelectedRealEstateFrontageInd(String value) {
        this.outSelectedRealEstateFrontageInd = value;
    }

    /**
     * Gets the value of the outSelectedRealEstateId property.
     * 
     */
    public double getOutSelectedRealEstateId() {
        return outSelectedRealEstateId;
    }

    /**
     * Sets the value of the outSelectedRealEstateId property.
     * 
     */
    public void setOutSelectedRealEstateId(double value) {
        this.outSelectedRealEstateId = value;
    }

    /**
     * Gets the value of the outSelectedRealEstateInsertionDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutSelectedRealEstateInsertionDt() {
        return outSelectedRealEstateInsertionDt;
    }

    /**
     * Sets the value of the outSelectedRealEstateInsertionDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutSelectedRealEstateInsertionDt(XMLGregorianCalendar value) {
        this.outSelectedRealEstateInsertionDt = value;
    }

    /**
     * Gets the value of the outSelectedRealEstateInsertionUsr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSelectedRealEstateInsertionUsr() {
        return outSelectedRealEstateInsertionUsr;
    }

    /**
     * Sets the value of the outSelectedRealEstateInsertionUsr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSelectedRealEstateInsertionUsr(String value) {
        this.outSelectedRealEstateInsertionUsr = value;
    }

    /**
     * Gets the value of the outSelectedRealEstateInsOriginalAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutSelectedRealEstateInsOriginalAmn() {
        return outSelectedRealEstateInsOriginalAmn;
    }

    /**
     * Sets the value of the outSelectedRealEstateInsOriginalAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutSelectedRealEstateInsOriginalAmn(BigDecimal value) {
        this.outSelectedRealEstateInsOriginalAmn = value;
    }

    /**
     * Gets the value of the outSelectedRealEstateInsuranceAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutSelectedRealEstateInsuranceAmn() {
        return outSelectedRealEstateInsuranceAmn;
    }

    /**
     * Sets the value of the outSelectedRealEstateInsuranceAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutSelectedRealEstateInsuranceAmn(BigDecimal value) {
        this.outSelectedRealEstateInsuranceAmn = value;
    }

    /**
     * Gets the value of the outSelectedRealEstateInsuranceDescr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSelectedRealEstateInsuranceDescr() {
        return outSelectedRealEstateInsuranceDescr;
    }

    /**
     * Sets the value of the outSelectedRealEstateInsuranceDescr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSelectedRealEstateInsuranceDescr(String value) {
        this.outSelectedRealEstateInsuranceDescr = value;
    }

    /**
     * Gets the value of the outSelectedRealEstateInsuranceEd property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutSelectedRealEstateInsuranceEd() {
        return outSelectedRealEstateInsuranceEd;
    }

    /**
     * Sets the value of the outSelectedRealEstateInsuranceEd property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutSelectedRealEstateInsuranceEd(XMLGregorianCalendar value) {
        this.outSelectedRealEstateInsuranceEd = value;
    }

    /**
     * Gets the value of the outSelectedRealEstateInsuranceSd property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutSelectedRealEstateInsuranceSd() {
        return outSelectedRealEstateInsuranceSd;
    }

    /**
     * Sets the value of the outSelectedRealEstateInsuranceSd property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutSelectedRealEstateInsuranceSd(XMLGregorianCalendar value) {
        this.outSelectedRealEstateInsuranceSd = value;
    }

    /**
     * Gets the value of the outSelectedRealEstateIssueYear property.
     * 
     */
    public short getOutSelectedRealEstateIssueYear() {
        return outSelectedRealEstateIssueYear;
    }

    /**
     * Sets the value of the outSelectedRealEstateIssueYear property.
     * 
     */
    public void setOutSelectedRealEstateIssueYear(short value) {
        this.outSelectedRealEstateIssueYear = value;
    }

    /**
     * Gets the value of the outSelectedRealEstateLandRegistId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSelectedRealEstateLandRegistId() {
        return outSelectedRealEstateLandRegistId;
    }

    /**
     * Sets the value of the outSelectedRealEstateLandRegistId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSelectedRealEstateLandRegistId(String value) {
        this.outSelectedRealEstateLandRegistId = value;
    }

    /**
     * Gets the value of the outSelectedRealEstateLegalProblems property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSelectedRealEstateLegalProblems() {
        return outSelectedRealEstateLegalProblems;
    }

    /**
     * Sets the value of the outSelectedRealEstateLegalProblems property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSelectedRealEstateLegalProblems(String value) {
        this.outSelectedRealEstateLegalProblems = value;
    }

    /**
     * Gets the value of the outSelectedRealEstateMainArea property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutSelectedRealEstateMainArea() {
        return outSelectedRealEstateMainArea;
    }

    /**
     * Sets the value of the outSelectedRealEstateMainArea property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutSelectedRealEstateMainArea(BigDecimal value) {
        this.outSelectedRealEstateMainArea = value;
    }

    /**
     * Gets the value of the outSelectedRealEstateModificationDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutSelectedRealEstateModificationDt() {
        return outSelectedRealEstateModificationDt;
    }

    /**
     * Sets the value of the outSelectedRealEstateModificationDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutSelectedRealEstateModificationDt(XMLGregorianCalendar value) {
        this.outSelectedRealEstateModificationDt = value;
    }

    /**
     * Gets the value of the outSelectedRealEstateModificationUsr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSelectedRealEstateModificationUsr() {
        return outSelectedRealEstateModificationUsr;
    }

    /**
     * Sets the value of the outSelectedRealEstateModificationUsr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSelectedRealEstateModificationUsr(String value) {
        this.outSelectedRealEstateModificationUsr = value;
    }

    /**
     * Gets the value of the outSelectedRealEstateMonTotParkNum property.
     * 
     */
    public int getOutSelectedRealEstateMonTotParkNum() {
        return outSelectedRealEstateMonTotParkNum;
    }

    /**
     * Sets the value of the outSelectedRealEstateMonTotParkNum property.
     * 
     */
    public void setOutSelectedRealEstateMonTotParkNum(int value) {
        this.outSelectedRealEstateMonTotParkNum = value;
    }

    /**
     * Gets the value of the outSelectedRealEstateMonTotStoreNum property.
     * 
     */
    public int getOutSelectedRealEstateMonTotStoreNum() {
        return outSelectedRealEstateMonTotStoreNum;
    }

    /**
     * Sets the value of the outSelectedRealEstateMonTotStoreNum property.
     * 
     */
    public void setOutSelectedRealEstateMonTotStoreNum(int value) {
        this.outSelectedRealEstateMonTotStoreNum = value;
    }

    /**
     * Gets the value of the outSelectedRealEstateMortgageArea property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutSelectedRealEstateMortgageArea() {
        return outSelectedRealEstateMortgageArea;
    }

    /**
     * Sets the value of the outSelectedRealEstateMortgageArea property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutSelectedRealEstateMortgageArea(BigDecimal value) {
        this.outSelectedRealEstateMortgageArea = value;
    }

    /**
     * Gets the value of the outSelectedRealEstateMunicipality property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSelectedRealEstateMunicipality() {
        return outSelectedRealEstateMunicipality;
    }

    /**
     * Sets the value of the outSelectedRealEstateMunicipality property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSelectedRealEstateMunicipality(String value) {
        this.outSelectedRealEstateMunicipality = value;
    }

    /**
     * Gets the value of the outSelectedRealEstateOutdoorAtticA property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutSelectedRealEstateOutdoorAtticA() {
        return outSelectedRealEstateOutdoorAtticA;
    }

    /**
     * Sets the value of the outSelectedRealEstateOutdoorAtticA property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutSelectedRealEstateOutdoorAtticA(BigDecimal value) {
        this.outSelectedRealEstateOutdoorAtticA = value;
    }

    /**
     * Gets the value of the outSelectedRealEstateOwnershipInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSelectedRealEstateOwnershipInd() {
        return outSelectedRealEstateOwnershipInd;
    }

    /**
     * Sets the value of the outSelectedRealEstateOwnershipInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSelectedRealEstateOwnershipInd(String value) {
        this.outSelectedRealEstateOwnershipInd = value;
    }

    /**
     * Gets the value of the outSelectedRealEstateParkingValAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutSelectedRealEstateParkingValAmn() {
        return outSelectedRealEstateParkingValAmn;
    }

    /**
     * Sets the value of the outSelectedRealEstateParkingValAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutSelectedRealEstateParkingValAmn(BigDecimal value) {
        this.outSelectedRealEstateParkingValAmn = value;
    }

    /**
     * Gets the value of the outSelectedRealEstateParLandRegistId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSelectedRealEstateParLandRegistId() {
        return outSelectedRealEstateParLandRegistId;
    }

    /**
     * Sets the value of the outSelectedRealEstateParLandRegistId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSelectedRealEstateParLandRegistId(String value) {
        this.outSelectedRealEstateParLandRegistId = value;
    }

    /**
     * Gets the value of the outSelectedRealEstateRealEstateCat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSelectedRealEstateRealEstateCat() {
        return outSelectedRealEstateRealEstateCat;
    }

    /**
     * Sets the value of the outSelectedRealEstateRealEstateCat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSelectedRealEstateRealEstateCat(String value) {
        this.outSelectedRealEstateRealEstateCat = value;
    }

    /**
     * Gets the value of the outSelectedRealEstateRealEstateDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSelectedRealEstateRealEstateDesc() {
        return outSelectedRealEstateRealEstateDesc;
    }

    /**
     * Sets the value of the outSelectedRealEstateRealEstateDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSelectedRealEstateRealEstateDesc(String value) {
        this.outSelectedRealEstateRealEstateDesc = value;
    }

    /**
     * Gets the value of the outSelectedRealEstateRealEstateType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSelectedRealEstateRealEstateType() {
        return outSelectedRealEstateRealEstateType;
    }

    /**
     * Sets the value of the outSelectedRealEstateRealEstateType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSelectedRealEstateRealEstateType(String value) {
        this.outSelectedRealEstateRealEstateType = value;
    }

    /**
     * Gets the value of the outSelectedRealEstateRealEstValAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutSelectedRealEstateRealEstValAmn() {
        return outSelectedRealEstateRealEstValAmn;
    }

    /**
     * Sets the value of the outSelectedRealEstateRealEstValAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutSelectedRealEstateRealEstValAmn(BigDecimal value) {
        this.outSelectedRealEstateRealEstValAmn = value;
    }

    /**
     * Gets the value of the outSelectedRealEstateReevalFreq property.
     * 
     */
    public short getOutSelectedRealEstateReevalFreq() {
        return outSelectedRealEstateReevalFreq;
    }

    /**
     * Sets the value of the outSelectedRealEstateReevalFreq property.
     * 
     */
    public void setOutSelectedRealEstateReevalFreq(short value) {
        this.outSelectedRealEstateReevalFreq = value;
    }

    /**
     * Gets the value of the outSelectedRealEstateRegion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSelectedRealEstateRegion() {
        return outSelectedRealEstateRegion;
    }

    /**
     * Sets the value of the outSelectedRealEstateRegion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSelectedRealEstateRegion(String value) {
        this.outSelectedRealEstateRegion = value;
    }

    /**
     * Gets the value of the outSelectedRealEstateRegistry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSelectedRealEstateRegistry() {
        return outSelectedRealEstateRegistry;
    }

    /**
     * Sets the value of the outSelectedRealEstateRegistry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSelectedRealEstateRegistry(String value) {
        this.outSelectedRealEstateRegistry = value;
    }

    /**
     * Gets the value of the outSelectedRealEstateRegistryTitleNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSelectedRealEstateRegistryTitleNo() {
        return outSelectedRealEstateRegistryTitleNo;
    }

    /**
     * Sets the value of the outSelectedRealEstateRegistryTitleNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSelectedRealEstateRegistryTitleNo(String value) {
        this.outSelectedRealEstateRegistryTitleNo = value;
    }

    /**
     * Gets the value of the outSelectedRealEstateRentalDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutSelectedRealEstateRentalDate() {
        return outSelectedRealEstateRentalDate;
    }

    /**
     * Sets the value of the outSelectedRealEstateRentalDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutSelectedRealEstateRentalDate(XMLGregorianCalendar value) {
        this.outSelectedRealEstateRentalDate = value;
    }

    /**
     * Gets the value of the outSelectedRealEstateRentingComments property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSelectedRealEstateRentingComments() {
        return outSelectedRealEstateRentingComments;
    }

    /**
     * Sets the value of the outSelectedRealEstateRentingComments property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSelectedRealEstateRentingComments(String value) {
        this.outSelectedRealEstateRentingComments = value;
    }

    /**
     * Gets the value of the outSelectedRealEstateSiteValueAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutSelectedRealEstateSiteValueAmn() {
        return outSelectedRealEstateSiteValueAmn;
    }

    /**
     * Sets the value of the outSelectedRealEstateSiteValueAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutSelectedRealEstateSiteValueAmn(BigDecimal value) {
        this.outSelectedRealEstateSiteValueAmn = value;
    }

    /**
     * Gets the value of the outSelectedRealEstateStoreRoomNum property.
     * 
     */
    public int getOutSelectedRealEstateStoreRoomNum() {
        return outSelectedRealEstateStoreRoomNum;
    }

    /**
     * Sets the value of the outSelectedRealEstateStoreRoomNum property.
     * 
     */
    public void setOutSelectedRealEstateStoreRoomNum(int value) {
        this.outSelectedRealEstateStoreRoomNum = value;
    }

    /**
     * Gets the value of the outSelectedRealEstateStoreValueAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutSelectedRealEstateStoreValueAmn() {
        return outSelectedRealEstateStoreValueAmn;
    }

    /**
     * Sets the value of the outSelectedRealEstateStoreValueAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutSelectedRealEstateStoreValueAmn(BigDecimal value) {
        this.outSelectedRealEstateStoreValueAmn = value;
    }

    /**
     * Gets the value of the outSelectedRealEstateTitleExpiryDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutSelectedRealEstateTitleExpiryDt() {
        return outSelectedRealEstateTitleExpiryDt;
    }

    /**
     * Sets the value of the outSelectedRealEstateTitleExpiryDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutSelectedRealEstateTitleExpiryDt(XMLGregorianCalendar value) {
        this.outSelectedRealEstateTitleExpiryDt = value;
    }

    /**
     * Gets the value of the outSelectedRealEstateTitleIssueDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutSelectedRealEstateTitleIssueDt() {
        return outSelectedRealEstateTitleIssueDt;
    }

    /**
     * Sets the value of the outSelectedRealEstateTitleIssueDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutSelectedRealEstateTitleIssueDt(XMLGregorianCalendar value) {
        this.outSelectedRealEstateTitleIssueDt = value;
    }

    /**
     * Gets the value of the outSelectedRealEstateTitleNatureType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSelectedRealEstateTitleNatureType() {
        return outSelectedRealEstateTitleNatureType;
    }

    /**
     * Sets the value of the outSelectedRealEstateTitleNatureType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSelectedRealEstateTitleNatureType(String value) {
        this.outSelectedRealEstateTitleNatureType = value;
    }

    /**
     * Gets the value of the outSelectedRealEstateTitleTerm property.
     * 
     */
    public int getOutSelectedRealEstateTitleTerm() {
        return outSelectedRealEstateTitleTerm;
    }

    /**
     * Sets the value of the outSelectedRealEstateTitleTerm property.
     * 
     */
    public void setOutSelectedRealEstateTitleTerm(int value) {
        this.outSelectedRealEstateTitleTerm = value;
    }

    /**
     * Gets the value of the outSelectedRealEstateTotalSiteArea property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutSelectedRealEstateTotalSiteArea() {
        return outSelectedRealEstateTotalSiteArea;
    }

    /**
     * Sets the value of the outSelectedRealEstateTotalSiteArea property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutSelectedRealEstateTotalSiteArea(BigDecimal value) {
        this.outSelectedRealEstateTotalSiteArea = value;
    }

    /**
     * Gets the value of the outSelectedRealEstateTotalValueAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutSelectedRealEstateTotalValueAmn() {
        return outSelectedRealEstateTotalValueAmn;
    }

    /**
     * Sets the value of the outSelectedRealEstateTotalValueAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutSelectedRealEstateTotalValueAmn(BigDecimal value) {
        this.outSelectedRealEstateTotalValueAmn = value;
    }

    /**
     * Gets the value of the outSelectedRealEstateTotParkArea property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutSelectedRealEstateTotParkArea() {
        return outSelectedRealEstateTotParkArea;
    }

    /**
     * Sets the value of the outSelectedRealEstateTotParkArea property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutSelectedRealEstateTotParkArea(BigDecimal value) {
        this.outSelectedRealEstateTotParkArea = value;
    }

    /**
     * Gets the value of the outSelectedRealEstateTotParkNum property.
     * 
     */
    public int getOutSelectedRealEstateTotParkNum() {
        return outSelectedRealEstateTotParkNum;
    }

    /**
     * Sets the value of the outSelectedRealEstateTotParkNum property.
     * 
     */
    public void setOutSelectedRealEstateTotParkNum(int value) {
        this.outSelectedRealEstateTotParkNum = value;
    }

    /**
     * Gets the value of the outSelectedRealEstateTotStoreArea property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutSelectedRealEstateTotStoreArea() {
        return outSelectedRealEstateTotStoreArea;
    }

    /**
     * Sets the value of the outSelectedRealEstateTotStoreArea property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutSelectedRealEstateTotStoreArea(BigDecimal value) {
        this.outSelectedRealEstateTotStoreArea = value;
    }

    /**
     * Gets the value of the outSelectedRealEstateTrxUnit property.
     * 
     */
    public int getOutSelectedRealEstateTrxUnit() {
        return outSelectedRealEstateTrxUnit;
    }

    /**
     * Sets the value of the outSelectedRealEstateTrxUnit property.
     * 
     */
    public void setOutSelectedRealEstateTrxUnit(int value) {
        this.outSelectedRealEstateTrxUnit = value;
    }

    /**
     * Gets the value of the outSelectedRealEstateUnitNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSelectedRealEstateUnitNo() {
        return outSelectedRealEstateUnitNo;
    }

    /**
     * Sets the value of the outSelectedRealEstateUnitNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSelectedRealEstateUnitNo(String value) {
        this.outSelectedRealEstateUnitNo = value;
    }

    /**
     * Gets the value of the outSelectedRealEstateUrbanPlanPro property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSelectedRealEstateUrbanPlanPro() {
        return outSelectedRealEstateUrbanPlanPro;
    }

    /**
     * Sets the value of the outSelectedRealEstateUrbanPlanPro property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSelectedRealEstateUrbanPlanPro(String value) {
        this.outSelectedRealEstateUrbanPlanPro = value;
    }

    /**
     * Gets the value of the outSelectedRealEstateValueDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutSelectedRealEstateValueDate() {
        return outSelectedRealEstateValueDate;
    }

    /**
     * Sets the value of the outSelectedRealEstateValueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutSelectedRealEstateValueDate(XMLGregorianCalendar value) {
        this.outSelectedRealEstateValueDate = value;
    }

    /**
     * Gets the value of the outSelectedRealEstateZipCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSelectedRealEstateZipCode() {
        return outSelectedRealEstateZipCode;
    }

    /**
     * Sets the value of the outSelectedRealEstateZipCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSelectedRealEstateZipCode(String value) {
        this.outSelectedRealEstateZipCode = value;
    }

    /**
     * Gets the value of the outToContinueGenericDetailParameterType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutToContinueGenericDetailParameterType() {
        return outToContinueGenericDetailParameterType;
    }

    /**
     * Sets the value of the outToContinueGenericDetailParameterType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutToContinueGenericDetailParameterType(String value) {
        this.outToContinueGenericDetailParameterType = value;
    }

    /**
     * Gets the value of the outToContinueGenericDetailSerialNum property.
     * 
     */
    public int getOutToContinueGenericDetailSerialNum() {
        return outToContinueGenericDetailSerialNum;
    }

    /**
     * Sets the value of the outToContinueGenericDetailSerialNum property.
     * 
     */
    public void setOutToContinueGenericDetailSerialNum(int value) {
        this.outToContinueGenericDetailSerialNum = value;
    }

    /**
     * Gets the value of the outUpdUsrCharSuppliedChar40 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutUpdUsrCharSuppliedChar40() {
        return outUpdUsrCharSuppliedChar40;
    }

    /**
     * Sets the value of the outUpdUsrCharSuppliedChar40 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutUpdUsrCharSuppliedChar40(String value) {
        this.outUpdUsrCharSuppliedChar40 = value;
    }

    /**
     * Gets the value of the outValuerInternalFlg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutValuerInternalFlg() {
        return outValuerInternalFlg;
    }

    /**
     * Sets the value of the outValuerInternalFlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutValuerInternalFlg(String value) {
        this.outValuerInternalFlg = value;
    }

    /**
     * Gets the value of the outValuerValuerAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutValuerValuerAddress() {
        return outValuerValuerAddress;
    }

    /**
     * Sets the value of the outValuerValuerAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutValuerValuerAddress(String value) {
        this.outValuerValuerAddress = value;
    }

    /**
     * Gets the value of the outValuerValuerEmail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutValuerValuerEmail() {
        return outValuerValuerEmail;
    }

    /**
     * Sets the value of the outValuerValuerEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutValuerValuerEmail(String value) {
        this.outValuerValuerEmail = value;
    }

    /**
     * Gets the value of the outValuerValuerId property.
     * 
     */
    public int getOutValuerValuerId() {
        return outValuerValuerId;
    }

    /**
     * Sets the value of the outValuerValuerId property.
     * 
     */
    public void setOutValuerValuerId(int value) {
        this.outValuerValuerId = value;
    }

    /**
     * Gets the value of the outValuerValuerMobile property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutValuerValuerMobile() {
        return outValuerValuerMobile;
    }

    /**
     * Sets the value of the outValuerValuerMobile property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutValuerValuerMobile(String value) {
        this.outValuerValuerMobile = value;
    }

    /**
     * Gets the value of the outValuerValuerName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutValuerValuerName() {
        return outValuerValuerName;
    }

    /**
     * Sets the value of the outValuerValuerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutValuerValuerName(String value) {
        this.outValuerValuerName = value;
    }

    /**
     * Gets the value of the outValuerValuerPhone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutValuerValuerPhone() {
        return outValuerValuerPhone;
    }

    /**
     * Sets the value of the outValuerValuerPhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutValuerValuerPhone(String value) {
        this.outValuerValuerPhone = value;
    }

    /**
     * Gets the value of the outValuerCountyGenericDetailDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutValuerCountyGenericDetailDescription() {
        return outValuerCountyGenericDetailDescription;
    }

    /**
     * Sets the value of the outValuerCountyGenericDetailDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutValuerCountyGenericDetailDescription(String value) {
        this.outValuerCountyGenericDetailDescription = value;
    }

    /**
     * Gets the value of the outValuerCountyGenericDetailSerialNum property.
     * 
     */
    public int getOutValuerCountyGenericDetailSerialNum() {
        return outValuerCountyGenericDetailSerialNum;
    }

    /**
     * Sets the value of the outValuerCountyGenericDetailSerialNum property.
     * 
     */
    public void setOutValuerCountyGenericDetailSerialNum(int value) {
        this.outValuerCountyGenericDetailSerialNum = value;
    }

    /**
     * Gets the value of the outLastRealEstateApprslEvalluationInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutLastRealEstateApprslEvalluationInd() {
        return outLastRealEstateApprslEvalluationInd;
    }

    /**
     * Sets the value of the outLastRealEstateApprslEvalluationInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutLastRealEstateApprslEvalluationInd(String value) {
        this.outLastRealEstateApprslEvalluationInd = value;
    }

    /**
     * Gets the value of the outLastRealEstateApprslReevalFreq property.
     * 
     */
    public short getOutLastRealEstateApprslReevalFreq() {
        return outLastRealEstateApprslReevalFreq;
    }

    /**
     * Sets the value of the outLastRealEstateApprslReevalFreq property.
     * 
     */
    public void setOutLastRealEstateApprslReevalFreq(short value) {
        this.outLastRealEstateApprslReevalFreq = value;
    }

    /**
     * Gets the value of the outCollatParametersGenericDetFlg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCollatParametersGenericDetFlg() {
        return outCollatParametersGenericDetFlg;
    }

    /**
     * Sets the value of the outCollatParametersGenericDetFlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCollatParametersGenericDetFlg(String value) {
        this.outCollatParametersGenericDetFlg = value;
    }

    /**
     * Gets the value of the outTotalSiteAreaGenericDetailSerialNum property.
     * 
     */
    public int getOutTotalSiteAreaGenericDetailSerialNum() {
        return outTotalSiteAreaGenericDetailSerialNum;
    }

    /**
     * Sets the value of the outTotalSiteAreaGenericDetailSerialNum property.
     * 
     */
    public void setOutTotalSiteAreaGenericDetailSerialNum(int value) {
        this.outTotalSiteAreaGenericDetailSerialNum = value;
    }

    /**
     * Gets the value of the outTotalSiteAreaGenericDetailShortDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutTotalSiteAreaGenericDetailShortDescription() {
        return outTotalSiteAreaGenericDetailShortDescription;
    }

    /**
     * Sets the value of the outTotalSiteAreaGenericDetailShortDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutTotalSiteAreaGenericDetailShortDescription(String value) {
        this.outTotalSiteAreaGenericDetailShortDescription = value;
    }

    /**
     * Gets the value of the outTotalSiteAreaGenericDetailParameterType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutTotalSiteAreaGenericDetailParameterType() {
        return outTotalSiteAreaGenericDetailParameterType;
    }

    /**
     * Sets the value of the outTotalSiteAreaGenericDetailParameterType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutTotalSiteAreaGenericDetailParameterType(String value) {
        this.outTotalSiteAreaGenericDetailParameterType = value;
    }

    /**
     * Gets the value of the outTotalSiteAreaGenericDetailDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutTotalSiteAreaGenericDetailDescription() {
        return outTotalSiteAreaGenericDetailDescription;
    }

    /**
     * Sets the value of the outTotalSiteAreaGenericDetailDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutTotalSiteAreaGenericDetailDescription(String value) {
        this.outTotalSiteAreaGenericDetailDescription = value;
    }

    /**
     * Gets the value of the outMainAreaGenericDetailSerialNum property.
     * 
     */
    public int getOutMainAreaGenericDetailSerialNum() {
        return outMainAreaGenericDetailSerialNum;
    }

    /**
     * Sets the value of the outMainAreaGenericDetailSerialNum property.
     * 
     */
    public void setOutMainAreaGenericDetailSerialNum(int value) {
        this.outMainAreaGenericDetailSerialNum = value;
    }

    /**
     * Gets the value of the outMainAreaGenericDetailShortDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutMainAreaGenericDetailShortDescription() {
        return outMainAreaGenericDetailShortDescription;
    }

    /**
     * Sets the value of the outMainAreaGenericDetailShortDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutMainAreaGenericDetailShortDescription(String value) {
        this.outMainAreaGenericDetailShortDescription = value;
    }

    /**
     * Gets the value of the outMainAreaGenericDetailParameterType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutMainAreaGenericDetailParameterType() {
        return outMainAreaGenericDetailParameterType;
    }

    /**
     * Sets the value of the outMainAreaGenericDetailParameterType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutMainAreaGenericDetailParameterType(String value) {
        this.outMainAreaGenericDetailParameterType = value;
    }

    /**
     * Gets the value of the outMainAreaGenericDetailDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutMainAreaGenericDetailDescription() {
        return outMainAreaGenericDetailDescription;
    }

    /**
     * Sets the value of the outMainAreaGenericDetailDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutMainAreaGenericDetailDescription(String value) {
        this.outMainAreaGenericDetailDescription = value;
    }

    /**
     * Gets the value of the outOutdoorAtticAreaGenericDetailSerialNum property.
     * 
     */
    public int getOutOutdoorAtticAreaGenericDetailSerialNum() {
        return outOutdoorAtticAreaGenericDetailSerialNum;
    }

    /**
     * Sets the value of the outOutdoorAtticAreaGenericDetailSerialNum property.
     * 
     */
    public void setOutOutdoorAtticAreaGenericDetailSerialNum(int value) {
        this.outOutdoorAtticAreaGenericDetailSerialNum = value;
    }

    /**
     * Gets the value of the outOutdoorAtticAreaGenericDetailShortDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutOutdoorAtticAreaGenericDetailShortDescription() {
        return outOutdoorAtticAreaGenericDetailShortDescription;
    }

    /**
     * Sets the value of the outOutdoorAtticAreaGenericDetailShortDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutOutdoorAtticAreaGenericDetailShortDescription(String value) {
        this.outOutdoorAtticAreaGenericDetailShortDescription = value;
    }

    /**
     * Gets the value of the outOutdoorAtticAreaGenericDetailParameterType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutOutdoorAtticAreaGenericDetailParameterType() {
        return outOutdoorAtticAreaGenericDetailParameterType;
    }

    /**
     * Sets the value of the outOutdoorAtticAreaGenericDetailParameterType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutOutdoorAtticAreaGenericDetailParameterType(String value) {
        this.outOutdoorAtticAreaGenericDetailParameterType = value;
    }

    /**
     * Gets the value of the outOutdoorAtticAreaGenericDetailDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutOutdoorAtticAreaGenericDetailDescription() {
        return outOutdoorAtticAreaGenericDetailDescription;
    }

    /**
     * Sets the value of the outOutdoorAtticAreaGenericDetailDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutOutdoorAtticAreaGenericDetailDescription(String value) {
        this.outOutdoorAtticAreaGenericDetailDescription = value;
    }

    /**
     * Gets the value of the outAdditionalAreaGenericDetailSerialNum property.
     * 
     */
    public int getOutAdditionalAreaGenericDetailSerialNum() {
        return outAdditionalAreaGenericDetailSerialNum;
    }

    /**
     * Sets the value of the outAdditionalAreaGenericDetailSerialNum property.
     * 
     */
    public void setOutAdditionalAreaGenericDetailSerialNum(int value) {
        this.outAdditionalAreaGenericDetailSerialNum = value;
    }

    /**
     * Gets the value of the outAdditionalAreaGenericDetailShortDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutAdditionalAreaGenericDetailShortDescription() {
        return outAdditionalAreaGenericDetailShortDescription;
    }

    /**
     * Sets the value of the outAdditionalAreaGenericDetailShortDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutAdditionalAreaGenericDetailShortDescription(String value) {
        this.outAdditionalAreaGenericDetailShortDescription = value;
    }

    /**
     * Gets the value of the outAdditionalAreaGenericDetailParameterType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutAdditionalAreaGenericDetailParameterType() {
        return outAdditionalAreaGenericDetailParameterType;
    }

    /**
     * Sets the value of the outAdditionalAreaGenericDetailParameterType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutAdditionalAreaGenericDetailParameterType(String value) {
        this.outAdditionalAreaGenericDetailParameterType = value;
    }

    /**
     * Gets the value of the outAdditionalAreaGenericDetailDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutAdditionalAreaGenericDetailDescription() {
        return outAdditionalAreaGenericDetailDescription;
    }

    /**
     * Sets the value of the outAdditionalAreaGenericDetailDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutAdditionalAreaGenericDetailDescription(String value) {
        this.outAdditionalAreaGenericDetailDescription = value;
    }

    /**
     * Gets the value of the outMortgageAreaGenericDetailSerialNum property.
     * 
     */
    public int getOutMortgageAreaGenericDetailSerialNum() {
        return outMortgageAreaGenericDetailSerialNum;
    }

    /**
     * Sets the value of the outMortgageAreaGenericDetailSerialNum property.
     * 
     */
    public void setOutMortgageAreaGenericDetailSerialNum(int value) {
        this.outMortgageAreaGenericDetailSerialNum = value;
    }

    /**
     * Gets the value of the outMortgageAreaGenericDetailShortDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutMortgageAreaGenericDetailShortDescription() {
        return outMortgageAreaGenericDetailShortDescription;
    }

    /**
     * Sets the value of the outMortgageAreaGenericDetailShortDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutMortgageAreaGenericDetailShortDescription(String value) {
        this.outMortgageAreaGenericDetailShortDescription = value;
    }

    /**
     * Gets the value of the outMortgageAreaGenericDetailParameterType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutMortgageAreaGenericDetailParameterType() {
        return outMortgageAreaGenericDetailParameterType;
    }

    /**
     * Sets the value of the outMortgageAreaGenericDetailParameterType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutMortgageAreaGenericDetailParameterType(String value) {
        this.outMortgageAreaGenericDetailParameterType = value;
    }

    /**
     * Gets the value of the outMortgageAreaGenericDetailDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutMortgageAreaGenericDetailDescription() {
        return outMortgageAreaGenericDetailDescription;
    }

    /**
     * Sets the value of the outMortgageAreaGenericDetailDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutMortgageAreaGenericDetailDescription(String value) {
        this.outMortgageAreaGenericDetailDescription = value;
    }

    /**
     * Gets the value of the outTotStoreAreaGenericDetailSerialNum property.
     * 
     */
    public int getOutTotStoreAreaGenericDetailSerialNum() {
        return outTotStoreAreaGenericDetailSerialNum;
    }

    /**
     * Sets the value of the outTotStoreAreaGenericDetailSerialNum property.
     * 
     */
    public void setOutTotStoreAreaGenericDetailSerialNum(int value) {
        this.outTotStoreAreaGenericDetailSerialNum = value;
    }

    /**
     * Gets the value of the outTotStoreAreaGenericDetailShortDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutTotStoreAreaGenericDetailShortDescription() {
        return outTotStoreAreaGenericDetailShortDescription;
    }

    /**
     * Sets the value of the outTotStoreAreaGenericDetailShortDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutTotStoreAreaGenericDetailShortDescription(String value) {
        this.outTotStoreAreaGenericDetailShortDescription = value;
    }

    /**
     * Gets the value of the outTotStoreAreaGenericDetailParameterType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutTotStoreAreaGenericDetailParameterType() {
        return outTotStoreAreaGenericDetailParameterType;
    }

    /**
     * Sets the value of the outTotStoreAreaGenericDetailParameterType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutTotStoreAreaGenericDetailParameterType(String value) {
        this.outTotStoreAreaGenericDetailParameterType = value;
    }

    /**
     * Gets the value of the outTotStoreAreaGenericDetailDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutTotStoreAreaGenericDetailDescription() {
        return outTotStoreAreaGenericDetailDescription;
    }

    /**
     * Sets the value of the outTotStoreAreaGenericDetailDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutTotStoreAreaGenericDetailDescription(String value) {
        this.outTotStoreAreaGenericDetailDescription = value;
    }

    /**
     * Gets the value of the outTotParkAreaGenericDetailSerialNum property.
     * 
     */
    public int getOutTotParkAreaGenericDetailSerialNum() {
        return outTotParkAreaGenericDetailSerialNum;
    }

    /**
     * Sets the value of the outTotParkAreaGenericDetailSerialNum property.
     * 
     */
    public void setOutTotParkAreaGenericDetailSerialNum(int value) {
        this.outTotParkAreaGenericDetailSerialNum = value;
    }

    /**
     * Gets the value of the outTotParkAreaGenericDetailShortDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutTotParkAreaGenericDetailShortDescription() {
        return outTotParkAreaGenericDetailShortDescription;
    }

    /**
     * Sets the value of the outTotParkAreaGenericDetailShortDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutTotParkAreaGenericDetailShortDescription(String value) {
        this.outTotParkAreaGenericDetailShortDescription = value;
    }

    /**
     * Gets the value of the outTotParkAreaGenericDetailParameterType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutTotParkAreaGenericDetailParameterType() {
        return outTotParkAreaGenericDetailParameterType;
    }

    /**
     * Sets the value of the outTotParkAreaGenericDetailParameterType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutTotParkAreaGenericDetailParameterType(String value) {
        this.outTotParkAreaGenericDetailParameterType = value;
    }

    /**
     * Gets the value of the outTotParkAreaGenericDetailDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutTotParkAreaGenericDetailDescription() {
        return outTotParkAreaGenericDetailDescription;
    }

    /**
     * Sets the value of the outTotParkAreaGenericDetailDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutTotParkAreaGenericDetailDescription(String value) {
        this.outTotParkAreaGenericDetailDescription = value;
    }

    /**
     * Gets the value of the outSelectedRealEstatePlotNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSelectedRealEstatePlotNumber() {
        return outSelectedRealEstatePlotNumber;
    }

    /**
     * Sets the value of the outSelectedRealEstatePlotNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSelectedRealEstatePlotNumber(String value) {
        this.outSelectedRealEstatePlotNumber = value;
    }

    /**
     * Gets the value of the outSelectedRealEstateBlockNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSelectedRealEstateBlockNumber() {
        return outSelectedRealEstateBlockNumber;
    }

    /**
     * Sets the value of the outSelectedRealEstateBlockNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSelectedRealEstateBlockNumber(String value) {
        this.outSelectedRealEstateBlockNumber = value;
    }

    /**
     * Gets the value of the outSelectedRealEstateCondPlanNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSelectedRealEstateCondPlanNo() {
        return outSelectedRealEstateCondPlanNo;
    }

    /**
     * Sets the value of the outSelectedRealEstateCondPlanNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSelectedRealEstateCondPlanNo(String value) {
        this.outSelectedRealEstateCondPlanNo = value;
    }

    /**
     * Gets the value of the outSelectedRealEstateInstrumentNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSelectedRealEstateInstrumentNo() {
        return outSelectedRealEstateInstrumentNo;
    }

    /**
     * Sets the value of the outSelectedRealEstateInstrumentNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSelectedRealEstateInstrumentNo(String value) {
        this.outSelectedRealEstateInstrumentNo = value;
    }

    /**
     * Gets the value of the outSelectedRealEstateMarketability property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSelectedRealEstateMarketability() {
        return outSelectedRealEstateMarketability;
    }

    /**
     * Sets the value of the outSelectedRealEstateMarketability property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSelectedRealEstateMarketability(String value) {
        this.outSelectedRealEstateMarketability = value;
    }

    /**
     * Gets the value of the outSelectedRealEstateGpsCoord property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSelectedRealEstateGpsCoord() {
        return outSelectedRealEstateGpsCoord;
    }

    /**
     * Sets the value of the outSelectedRealEstateGpsCoord property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSelectedRealEstateGpsCoord(String value) {
        this.outSelectedRealEstateGpsCoord = value;
    }

    /**
     * Gets the value of the outSelectedRealEstateCopyOfTitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSelectedRealEstateCopyOfTitle() {
        return outSelectedRealEstateCopyOfTitle;
    }

    /**
     * Sets the value of the outSelectedRealEstateCopyOfTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSelectedRealEstateCopyOfTitle(String value) {
        this.outSelectedRealEstateCopyOfTitle = value;
    }

    /**
     * Gets the value of the outSelectedRealEstateTitleSubmDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutSelectedRealEstateTitleSubmDt() {
        return outSelectedRealEstateTitleSubmDt;
    }

    /**
     * Sets the value of the outSelectedRealEstateTitleSubmDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutSelectedRealEstateTitleSubmDt(XMLGregorianCalendar value) {
        this.outSelectedRealEstateTitleSubmDt = value;
    }

    /**
     * Gets the value of the outSelectedRealEstateTitleReturnDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutSelectedRealEstateTitleReturnDt() {
        return outSelectedRealEstateTitleReturnDt;
    }

    /**
     * Sets the value of the outSelectedRealEstateTitleReturnDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutSelectedRealEstateTitleReturnDt(XMLGregorianCalendar value) {
        this.outSelectedRealEstateTitleReturnDt = value;
    }

    /**
     * Gets the value of the outSelectedRealEstateInsurPolicyNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSelectedRealEstateInsurPolicyNo() {
        return outSelectedRealEstateInsurPolicyNo;
    }

    /**
     * Sets the value of the outSelectedRealEstateInsurPolicyNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSelectedRealEstateInsurPolicyNo(String value) {
        this.outSelectedRealEstateInsurPolicyNo = value;
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
     * Gets the value of the outTitleCustAddrParrelDCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutTitleCustAddrParrelDCode() {
        return outTitleCustAddrParrelDCode;
    }

    /**
     * Sets the value of the outTitleCustAddrParrelDCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutTitleCustAddrParrelDCode(String value) {
        this.outTitleCustAddrParrelDCode = value;
    }

    /**
     * Gets the value of the outTitleCustAddrParrelDSn property.
     * 
     */
    public int getOutTitleCustAddrParrelDSn() {
        return outTitleCustAddrParrelDSn;
    }

    /**
     * Sets the value of the outTitleCustAddrParrelDSn property.
     * 
     */
    public void setOutTitleCustAddrParrelDSn(int value) {
        this.outTitleCustAddrParrelDSn = value;
    }

    /**
     * Gets the value of the outTitleCustAddrParrelDP01Desc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutTitleCustAddrParrelDP01Desc() {
        return outTitleCustAddrParrelDP01Desc;
    }

    /**
     * Sets the value of the outTitleCustAddrParrelDP01Desc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutTitleCustAddrParrelDP01Desc(String value) {
        this.outTitleCustAddrParrelDP01Desc = value;
    }

    /**
     * Gets the value of the outTitleCustAddrParrelDP02Desc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutTitleCustAddrParrelDP02Desc() {
        return outTitleCustAddrParrelDP02Desc;
    }

    /**
     * Sets the value of the outTitleCustAddrParrelDP02Desc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutTitleCustAddrParrelDP02Desc(String value) {
        this.outTitleCustAddrParrelDP02Desc = value;
    }

    /**
     * Gets the value of the outTitleCustAddrParrelDP03Desc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutTitleCustAddrParrelDP03Desc() {
        return outTitleCustAddrParrelDP03Desc;
    }

    /**
     * Sets the value of the outTitleCustAddrParrelDP03Desc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutTitleCustAddrParrelDP03Desc(String value) {
        this.outTitleCustAddrParrelDP03Desc = value;
    }

    /**
     * Gets the value of the outTitleCustAddrParrelDP04Desc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutTitleCustAddrParrelDP04Desc() {
        return outTitleCustAddrParrelDP04Desc;
    }

    /**
     * Sets the value of the outTitleCustAddrParrelDP04Desc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutTitleCustAddrParrelDP04Desc(String value) {
        this.outTitleCustAddrParrelDP04Desc = value;
    }

    /**
     * Gets the value of the outTitleCustAddrParrelDP05Desc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutTitleCustAddrParrelDP05Desc() {
        return outTitleCustAddrParrelDP05Desc;
    }

    /**
     * Sets the value of the outTitleCustAddrParrelDP05Desc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutTitleCustAddrParrelDP05Desc(String value) {
        this.outTitleCustAddrParrelDP05Desc = value;
    }

    /**
     * Gets the value of the outTitleCustAddrParrelDP06Desc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutTitleCustAddrParrelDP06Desc() {
        return outTitleCustAddrParrelDP06Desc;
    }

    /**
     * Sets the value of the outTitleCustAddrParrelDP06Desc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutTitleCustAddrParrelDP06Desc(String value) {
        this.outTitleCustAddrParrelDP06Desc = value;
    }

    /**
     * Gets the value of the outTitleCustAddrParrelDP07Desc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutTitleCustAddrParrelDP07Desc() {
        return outTitleCustAddrParrelDP07Desc;
    }

    /**
     * Sets the value of the outTitleCustAddrParrelDP07Desc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutTitleCustAddrParrelDP07Desc(String value) {
        this.outTitleCustAddrParrelDP07Desc = value;
    }

    /**
     * Gets the value of the outTitleCustAddrParrelDP08Desc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutTitleCustAddrParrelDP08Desc() {
        return outTitleCustAddrParrelDP08Desc;
    }

    /**
     * Sets the value of the outTitleCustAddrParrelDP08Desc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutTitleCustAddrParrelDP08Desc(String value) {
        this.outTitleCustAddrParrelDP08Desc = value;
    }

    /**
     * Gets the value of the outTitleCustAddrParrelDP09Desc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutTitleCustAddrParrelDP09Desc() {
        return outTitleCustAddrParrelDP09Desc;
    }

    /**
     * Sets the value of the outTitleCustAddrParrelDP09Desc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutTitleCustAddrParrelDP09Desc(String value) {
        this.outTitleCustAddrParrelDP09Desc = value;
    }

    /**
     * Gets the value of the outTitleCustAddrParrelDP10Desc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutTitleCustAddrParrelDP10Desc() {
        return outTitleCustAddrParrelDP10Desc;
    }

    /**
     * Sets the value of the outTitleCustAddrParrelDP10Desc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutTitleCustAddrParrelDP10Desc(String value) {
        this.outTitleCustAddrParrelDP10Desc = value;
    }

    /**
     * Gets the value of the outSelectedRealEstateFolio property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSelectedRealEstateFolio() {
        return outSelectedRealEstateFolio;
    }

    /**
     * Sets the value of the outSelectedRealEstateFolio property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSelectedRealEstateFolio(String value) {
        this.outSelectedRealEstateFolio = value;
    }

    /**
     * Gets the value of the outSelectedRealEstateInsurAnnualAmnt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutSelectedRealEstateInsurAnnualAmnt() {
        return outSelectedRealEstateInsurAnnualAmnt;
    }

    /**
     * Sets the value of the outSelectedRealEstateInsurAnnualAmnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutSelectedRealEstateInsurAnnualAmnt(BigDecimal value) {
        this.outSelectedRealEstateInsurAnnualAmnt = value;
    }

}
