
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for Mc2006VPropertyManagementImport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Mc2006VPropertyManagementImport">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}BaseImport">
 *       &lt;sequence>
 *         &lt;element name="Command" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InManipulateRealEstateAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InManipulateRealEstateAddressNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InManipulateRealEstateZipCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InManipulateRealEstateCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InManipulateRealEstateRegion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InManipulateRealEstateMunicipality" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InManipulateRealEstateCommercialValAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InManipulateRealEstateEvalluationInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InManipulateRealEstateAddDescr1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InManipulateRealEstateAddDescr2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InManipulateRealEstateAddDescr3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InManipulateRealEstateAddDescr4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InManipulateRealEstateAddDescr5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InManipulateRealEstateEntryStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InManipulateRealEstateInsuranceEd" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InManipulateRealEstateInsuranceSd" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InManipulateRealEstateTotalSiteArea" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InManipulateRealEstateOutdoorAtticA" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InManipulateRealEstateMortgageArea" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InManipulateRealEstateIssueYear" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InManipulateRealEstateValueDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InManipulateRealEstateSiteValueAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InManipulateRealEstateRealEstValAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InManipulateRealEstateStoreValueAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InManipulateRealEstateParkingValAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InManipulateRealEstateConstrCostAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InManipulateRealEstateLegalProblems" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InManipulateRealEstateUrbanPlanPro" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InManipulateRealEstateReevalFreq" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InManipulateRealEstateAnnualRentAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InManipulateRealEstateRentalDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InManipulateRealEstateBuildLicenceid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InManipulateRealEstateLandRegistId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InManipulateRealEstateRentingComments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InManipulateRealEstateStoreRoomNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InManipulateRealEstateTotStoreArea" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InManipulateRealEstateTotParkNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InManipulateRealEstateTotParkArea" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InManipulateRealEstateMonTotStoreNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InManipulateRealEstateMonTotParkNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InManipulateRealEstateTotalValueAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InManipulateRealEstateParLandRegistId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InManipulateRealEstateRegistry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InManipulateRealEstateRegistryTitleNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InManipulateRealEstateDistrictRegistry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InManipulateRealEstateBuilding" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InManipulateRealEstateUnitNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InManipulateRealEstateEstate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InManipulateRealEstateCourt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InManipulateRealEstateTitleIssueDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InManipulateRealEstateTitleTerm" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InManipulateRealEstateTitleExpiryDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InManipulateRealEstateTitleNatureType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InGetRealEstateId" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="InDefaultProductIdProduct" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InDefaultJustificIdJustific" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InIefSuppliedCommand" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InLogMntRecordingTrxCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InLogMntRecordingReversalFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InLogMntRecordingTerminalNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InLogMntRecordingAuthorizer1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InLogMntRecordingAuthorizer2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InRealEstateCustInternalSn" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="InRealEstateCustEntryStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InRealEstateCustContractId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InRealEstateCustOwnershPerc" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InLeas2GenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InLeas2GenericDetailParameterType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InLeas2GenericDetailDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InBasakGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InBasakGenericDetailParameterType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InEikyrGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InEikyrGenericDetailParameterType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InRealEstateInfoCommandIefSuppliedCommand" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InAdditionalInfoGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InAdditionalInfoGenericDetailParameterType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InToContinueGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InToContinueGenericDetailParameterType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCommCurrCurrencyIdCurrency" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InCommCurrCurrencyShortDescr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InPricepermeterCurrCurrencyIdCurrency" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InPricepermeterCurrCurrencyShortDescr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InValuationTypeGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InValuationTypeGenericDetailShortDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InValuationTypeGenericDetailParameterType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InValuationTypeGenericDetailEntryStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InValuationTypeGenericDetailTmstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InValuationTypeGenericDetailDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InInvCurrIdCurrencyIdCurrency" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InInvCurrIdCurrencyShortDescr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InEsrIncCurrCurrencyIdCurrency" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InEsrIncCurrCurrencyShortDescr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InSelAmnCurrCurrencyIdCurrency" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InSelAmnCurrCurrencyShortDescr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InMortAmnCurrCurrencyIdCurrency" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InMortAmnCurrCurrencyShortDescr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InInsurAmnCurrCurrencyIdCurrency" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InInsurAmnCurrCurrencyShortDescr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InObjAmnCurrCurrencyIdCurrency" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InObjAmnCurrCurrencyShortDescr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InNatureTitleGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InNatureTitleGenericDetailShortDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InNatureTitleGenericDetailParameterType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InNatureTitleGenericDetailDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InValuerCommandIefSuppliedCommand" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InPreviousRealEstateApprslInternalSn" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="InPreviousRealEstateApprslEvaluationDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InValuerValuerValuerId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InAllValuersFlgIefSuppliedFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InGrpAuxSpace" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}ArrayOfMc2006VInGrpAuxSpaceItem" minOccurs="0"/>
 *         &lt;element name="InGrpDefRealEst" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}ArrayOfMc2006VInGrpDefRealEstItem" minOccurs="0"/>
 *         &lt;element name="InGrpQualInfo" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}ArrayOfMc2006VInGrpQualInfoItem" minOccurs="0"/>
 *         &lt;element name="InReinsGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InReinsGenericDetailParameterType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InReincGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InReincGenericDetailParameterType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCustRelapInsRealEstateApprslEvaluator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCustRelapInsRealEstateApprslEvaluationDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InCustRelapInsRealEstateApprslSellValue" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InCustRelapInsRealEstateApprslPricePerMeter" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InCustRelapInsRealEstateApprslApraisalCmnts" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCustRelapInsRealEstateApprslCommercValue" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InCustRelapInsRealEstateApprslMortgageValue" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InCustRelapInsRealEstateApprslEstRentalIncAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InCustRelapInsRealEstateApprslInvestmentAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InCustRelapInsRealEstateApprslAdoptionValDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InCustRelapInsRealEstateApprslEstInsurAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InCustRelapInsRealEstateApprslObjectiveAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InCustRelapInsRealEstateApprslEvalluationInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCustRelapInsRealEstateApprslReevalFreq" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InCustRelInsRealEstateCommercialValAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InCustRelInsRealEstateEvalluationInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCustRelInsRealEstateInsuranceEd" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InCustRelInsRealEstateInsuranceSd" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InCustRelInsRealEstateReevalFreq" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InRealEstateApprslReevalFreq" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InRealEstateApprslInternalSn" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="InRealEstateApprslEvaluator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InRealEstateApprslEvaluationDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InRealEstateApprslSellValue" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InRealEstateApprslPricePerMeter" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InRealEstateApprslApraisalCmnts" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InRealEstateApprslEntryStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InRealEstateApprslMortgageValue" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InRealEstateApprslEstRentalIncAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InRealEstateApprslInvestmentAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InRealEstateApprslAdoptionValDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InRealEstateApprslEvalluationInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InRealEstateApprslCommercValue" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InEvalCommandIefSuppliedCommand" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCustomerCustId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InCustomerFirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCustomerSurname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCustomerCDigit" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InCustomerCommandIefSuppliedCommand" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCntryGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InCntryGenericDetailParameterType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCntryGenericDetailDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InAdddiGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InAdddiGenericDetailParameterType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InAdddiGenericDetailDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InRelocGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InRelocGenericDetailParameterType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InRelocGenericDetailDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InRecbkGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InRecbkGenericDetailParameterType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InRecbkGenericDetailDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InRecatGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InRecatGenericDetailParameterType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InRecatGenericDetailDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InRetypGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InRetypGenericDetailParameterType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InRetypGenericDetailDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InManipulateRealEstateRealEstateDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InManipulateRealEstateRealEstateType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InManipulateRealEstateOwnershipInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InManipulateRealEstateRealEstateCat" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InManipulateRealEstateMainArea" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InManipulateRealEstateAdditionalArea" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InManipulateRealEstateApartmentNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InManipulateRealEstateConstructionYear" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InManipulateRealEstateFrontageInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InManipulateRealEstateInsuranceDescr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InManipulateRealEstateInsuranceAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InManipulateRealEstateInsOriginalAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InManipulateRealEstateAgreementValue" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InTotalSiteAreaGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InTotalSiteAreaGenericDetailShortDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InTotalSiteAreaGenericDetailParameterType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InTotalSiteAreaGenericDetailDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InMainAreaGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InMainAreaGenericDetailShortDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InMainAreaGenericDetailParameterType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InMainAreaGenericDetailDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InOutdoorAtticAreaGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InOutdoorAtticAreaGenericDetailShortDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InOutdoorAtticAreaGenericDetailParameterType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InOutdoorAtticAreaGenericDetailDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InAdditionalAreaGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InAdditionalAreaGenericDetailShortDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InAdditionalAreaGenericDetailParameterType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InAdditionalAreaGenericDetailDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InMortgageAreaGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InMortgageAreaGenericDetailShortDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InMortgageAreaGenericDetailParameterType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InMortgageAreaGenericDetailDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InTotStoreAreaGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InTotStoreAreaGenericDetailShortDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InTotStoreAreaGenericDetailParameterType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InTotStoreAreaGenericDetailDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InTotParkAreaGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InTotParkAreaGenericDetailShortDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InTotParkAreaGenericDetailParameterType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InTotParkAreaGenericDetailDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InManipulateRealEstatePlotNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InManipulateRealEstateBlockNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InManipulateRealEstateCondPlanNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InManipulateRealEstateInstrumentNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InManipulateRealEstateMarketability" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InManipulateRealEstateGpsCoord" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InManipulateRealEstateCopyOfTitle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InManipulateRealEstateTitleSubmDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InManipulateRealEstateTitleReturnDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InManipulateRealEstateInsurPolicyNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InAddrSnCustAddrParrelDSn" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InAddrSnCustAddrParrelDCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InRealEstateCustRegistProprietor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InManipulateRealEstateFolio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InManipulateRealEstateInsurAnnualAmnt" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InTitleAddrSnCustAddrParrelDSn" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InTitleAddrSnCustAddrParrelDCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Mc2006VPropertyManagementImport", propOrder = {
    "command",
    "inManipulateRealEstateAddress",
    "inManipulateRealEstateAddressNum",
    "inManipulateRealEstateZipCode",
    "inManipulateRealEstateCity",
    "inManipulateRealEstateRegion",
    "inManipulateRealEstateMunicipality",
    "inManipulateRealEstateCommercialValAmn",
    "inManipulateRealEstateEvalluationInd",
    "inManipulateRealEstateAddDescr1",
    "inManipulateRealEstateAddDescr2",
    "inManipulateRealEstateAddDescr3",
    "inManipulateRealEstateAddDescr4",
    "inManipulateRealEstateAddDescr5",
    "inManipulateRealEstateEntryStatus",
    "inManipulateRealEstateInsuranceEd",
    "inManipulateRealEstateInsuranceSd",
    "inManipulateRealEstateTotalSiteArea",
    "inManipulateRealEstateOutdoorAtticA",
    "inManipulateRealEstateMortgageArea",
    "inManipulateRealEstateIssueYear",
    "inManipulateRealEstateValueDate",
    "inManipulateRealEstateSiteValueAmn",
    "inManipulateRealEstateRealEstValAmn",
    "inManipulateRealEstateStoreValueAmn",
    "inManipulateRealEstateParkingValAmn",
    "inManipulateRealEstateConstrCostAmn",
    "inManipulateRealEstateLegalProblems",
    "inManipulateRealEstateUrbanPlanPro",
    "inManipulateRealEstateReevalFreq",
    "inManipulateRealEstateAnnualRentAmn",
    "inManipulateRealEstateRentalDate",
    "inManipulateRealEstateBuildLicenceid",
    "inManipulateRealEstateLandRegistId",
    "inManipulateRealEstateRentingComments",
    "inManipulateRealEstateStoreRoomNum",
    "inManipulateRealEstateTotStoreArea",
    "inManipulateRealEstateTotParkNum",
    "inManipulateRealEstateTotParkArea",
    "inManipulateRealEstateMonTotStoreNum",
    "inManipulateRealEstateMonTotParkNum",
    "inManipulateRealEstateTotalValueAmn",
    "inManipulateRealEstateParLandRegistId",
    "inManipulateRealEstateRegistry",
    "inManipulateRealEstateRegistryTitleNo",
    "inManipulateRealEstateDistrictRegistry",
    "inManipulateRealEstateBuilding",
    "inManipulateRealEstateUnitNo",
    "inManipulateRealEstateEstate",
    "inManipulateRealEstateCourt",
    "inManipulateRealEstateTitleIssueDt",
    "inManipulateRealEstateTitleTerm",
    "inManipulateRealEstateTitleExpiryDt",
    "inManipulateRealEstateTitleNatureType",
    "inGetRealEstateId",
    "inDefaultProductIdProduct",
    "inDefaultJustificIdJustific",
    "inIefSuppliedCommand",
    "inLogMntRecordingTrxCode",
    "inLogMntRecordingReversalFlag",
    "inLogMntRecordingTerminalNumber",
    "inLogMntRecordingAuthorizer1",
    "inLogMntRecordingAuthorizer2",
    "inRealEstateCustInternalSn",
    "inRealEstateCustEntryStatus",
    "inRealEstateCustContractId",
    "inRealEstateCustOwnershPerc",
    "inLeas2GenericDetailSerialNum",
    "inLeas2GenericDetailParameterType",
    "inLeas2GenericDetailDescription",
    "inBasakGenericDetailSerialNum",
    "inBasakGenericDetailParameterType",
    "inEikyrGenericDetailSerialNum",
    "inEikyrGenericDetailParameterType",
    "inRealEstateInfoCommandIefSuppliedCommand",
    "inAdditionalInfoGenericDetailSerialNum",
    "inAdditionalInfoGenericDetailParameterType",
    "inToContinueGenericDetailSerialNum",
    "inToContinueGenericDetailParameterType",
    "inCommCurrCurrencyIdCurrency",
    "inCommCurrCurrencyShortDescr",
    "inPricepermeterCurrCurrencyIdCurrency",
    "inPricepermeterCurrCurrencyShortDescr",
    "inValuationTypeGenericDetailSerialNum",
    "inValuationTypeGenericDetailShortDescription",
    "inValuationTypeGenericDetailParameterType",
    "inValuationTypeGenericDetailEntryStatus",
    "inValuationTypeGenericDetailTmstamp",
    "inValuationTypeGenericDetailDescription",
    "inInvCurrIdCurrencyIdCurrency",
    "inInvCurrIdCurrencyShortDescr",
    "inEsrIncCurrCurrencyIdCurrency",
    "inEsrIncCurrCurrencyShortDescr",
    "inSelAmnCurrCurrencyIdCurrency",
    "inSelAmnCurrCurrencyShortDescr",
    "inMortAmnCurrCurrencyIdCurrency",
    "inMortAmnCurrCurrencyShortDescr",
    "inInsurAmnCurrCurrencyIdCurrency",
    "inInsurAmnCurrCurrencyShortDescr",
    "inObjAmnCurrCurrencyIdCurrency",
    "inObjAmnCurrCurrencyShortDescr",
    "inNatureTitleGenericDetailSerialNum",
    "inNatureTitleGenericDetailShortDescription",
    "inNatureTitleGenericDetailParameterType",
    "inNatureTitleGenericDetailDescription",
    "inValuerCommandIefSuppliedCommand",
    "inPreviousRealEstateApprslInternalSn",
    "inPreviousRealEstateApprslEvaluationDt",
    "inValuerValuerValuerId",
    "inAllValuersFlgIefSuppliedFlag",
    "inGrpAuxSpace",
    "inGrpDefRealEst",
    "inGrpQualInfo",
    "inReinsGenericDetailSerialNum",
    "inReinsGenericDetailParameterType",
    "inReincGenericDetailSerialNum",
    "inReincGenericDetailParameterType",
    "inCustRelapInsRealEstateApprslEvaluator",
    "inCustRelapInsRealEstateApprslEvaluationDt",
    "inCustRelapInsRealEstateApprslSellValue",
    "inCustRelapInsRealEstateApprslPricePerMeter",
    "inCustRelapInsRealEstateApprslApraisalCmnts",
    "inCustRelapInsRealEstateApprslCommercValue",
    "inCustRelapInsRealEstateApprslMortgageValue",
    "inCustRelapInsRealEstateApprslEstRentalIncAmn",
    "inCustRelapInsRealEstateApprslInvestmentAmn",
    "inCustRelapInsRealEstateApprslAdoptionValDt",
    "inCustRelapInsRealEstateApprslEstInsurAmn",
    "inCustRelapInsRealEstateApprslObjectiveAmn",
    "inCustRelapInsRealEstateApprslEvalluationInd",
    "inCustRelapInsRealEstateApprslReevalFreq",
    "inCustRelInsRealEstateCommercialValAmn",
    "inCustRelInsRealEstateEvalluationInd",
    "inCustRelInsRealEstateInsuranceEd",
    "inCustRelInsRealEstateInsuranceSd",
    "inCustRelInsRealEstateReevalFreq",
    "inRealEstateApprslReevalFreq",
    "inRealEstateApprslInternalSn",
    "inRealEstateApprslEvaluator",
    "inRealEstateApprslEvaluationDt",
    "inRealEstateApprslSellValue",
    "inRealEstateApprslPricePerMeter",
    "inRealEstateApprslApraisalCmnts",
    "inRealEstateApprslEntryStatus",
    "inRealEstateApprslMortgageValue",
    "inRealEstateApprslEstRentalIncAmn",
    "inRealEstateApprslInvestmentAmn",
    "inRealEstateApprslAdoptionValDt",
    "inRealEstateApprslEvalluationInd",
    "inRealEstateApprslCommercValue",
    "inEvalCommandIefSuppliedCommand",
    "inCustomerCustId",
    "inCustomerFirstName",
    "inCustomerSurname",
    "inCustomerCDigit",
    "inCustomerCommandIefSuppliedCommand",
    "inCntryGenericDetailSerialNum",
    "inCntryGenericDetailParameterType",
    "inCntryGenericDetailDescription",
    "inAdddiGenericDetailSerialNum",
    "inAdddiGenericDetailParameterType",
    "inAdddiGenericDetailDescription",
    "inRelocGenericDetailSerialNum",
    "inRelocGenericDetailParameterType",
    "inRelocGenericDetailDescription",
    "inRecbkGenericDetailSerialNum",
    "inRecbkGenericDetailParameterType",
    "inRecbkGenericDetailDescription",
    "inRecatGenericDetailSerialNum",
    "inRecatGenericDetailParameterType",
    "inRecatGenericDetailDescription",
    "inRetypGenericDetailSerialNum",
    "inRetypGenericDetailParameterType",
    "inRetypGenericDetailDescription",
    "inManipulateRealEstateRealEstateDesc",
    "inManipulateRealEstateRealEstateType",
    "inManipulateRealEstateOwnershipInd",
    "inManipulateRealEstateRealEstateCat",
    "inManipulateRealEstateMainArea",
    "inManipulateRealEstateAdditionalArea",
    "inManipulateRealEstateApartmentNum",
    "inManipulateRealEstateConstructionYear",
    "inManipulateRealEstateFrontageInd",
    "inManipulateRealEstateInsuranceDescr",
    "inManipulateRealEstateInsuranceAmn",
    "inManipulateRealEstateInsOriginalAmn",
    "inManipulateRealEstateAgreementValue",
    "inTotalSiteAreaGenericDetailSerialNum",
    "inTotalSiteAreaGenericDetailShortDescription",
    "inTotalSiteAreaGenericDetailParameterType",
    "inTotalSiteAreaGenericDetailDescription",
    "inMainAreaGenericDetailSerialNum",
    "inMainAreaGenericDetailShortDescription",
    "inMainAreaGenericDetailParameterType",
    "inMainAreaGenericDetailDescription",
    "inOutdoorAtticAreaGenericDetailSerialNum",
    "inOutdoorAtticAreaGenericDetailShortDescription",
    "inOutdoorAtticAreaGenericDetailParameterType",
    "inOutdoorAtticAreaGenericDetailDescription",
    "inAdditionalAreaGenericDetailSerialNum",
    "inAdditionalAreaGenericDetailShortDescription",
    "inAdditionalAreaGenericDetailParameterType",
    "inAdditionalAreaGenericDetailDescription",
    "inMortgageAreaGenericDetailSerialNum",
    "inMortgageAreaGenericDetailShortDescription",
    "inMortgageAreaGenericDetailParameterType",
    "inMortgageAreaGenericDetailDescription",
    "inTotStoreAreaGenericDetailSerialNum",
    "inTotStoreAreaGenericDetailShortDescription",
    "inTotStoreAreaGenericDetailParameterType",
    "inTotStoreAreaGenericDetailDescription",
    "inTotParkAreaGenericDetailSerialNum",
    "inTotParkAreaGenericDetailShortDescription",
    "inTotParkAreaGenericDetailParameterType",
    "inTotParkAreaGenericDetailDescription",
    "inManipulateRealEstatePlotNumber",
    "inManipulateRealEstateBlockNumber",
    "inManipulateRealEstateCondPlanNo",
    "inManipulateRealEstateInstrumentNo",
    "inManipulateRealEstateMarketability",
    "inManipulateRealEstateGpsCoord",
    "inManipulateRealEstateCopyOfTitle",
    "inManipulateRealEstateTitleSubmDt",
    "inManipulateRealEstateTitleReturnDt",
    "inManipulateRealEstateInsurPolicyNo",
    "inAddrSnCustAddrParrelDSn",
    "inAddrSnCustAddrParrelDCode",
    "inRealEstateCustRegistProprietor",
    "inManipulateRealEstateFolio",
    "inManipulateRealEstateInsurAnnualAmnt",
    "inTitleAddrSnCustAddrParrelDSn",
    "inTitleAddrSnCustAddrParrelDCode"
})
public class Mc2006VPropertyManagementImport
    extends BaseImport
{

    @XmlElement(name = "Command")
    protected String command;
    @XmlElement(name = "InManipulateRealEstateAddress")
    protected String inManipulateRealEstateAddress;
    @XmlElement(name = "InManipulateRealEstateAddressNum")
    protected String inManipulateRealEstateAddressNum;
    @XmlElement(name = "InManipulateRealEstateZipCode")
    protected String inManipulateRealEstateZipCode;
    @XmlElement(name = "InManipulateRealEstateCity")
    protected String inManipulateRealEstateCity;
    @XmlElement(name = "InManipulateRealEstateRegion")
    protected String inManipulateRealEstateRegion;
    @XmlElement(name = "InManipulateRealEstateMunicipality")
    protected String inManipulateRealEstateMunicipality;
    @XmlElement(name = "InManipulateRealEstateCommercialValAmn", required = true)
    protected BigDecimal inManipulateRealEstateCommercialValAmn;
    @XmlElement(name = "InManipulateRealEstateEvalluationInd")
    protected String inManipulateRealEstateEvalluationInd;
    @XmlElement(name = "InManipulateRealEstateAddDescr1")
    protected String inManipulateRealEstateAddDescr1;
    @XmlElement(name = "InManipulateRealEstateAddDescr2")
    protected String inManipulateRealEstateAddDescr2;
    @XmlElement(name = "InManipulateRealEstateAddDescr3")
    protected String inManipulateRealEstateAddDescr3;
    @XmlElement(name = "InManipulateRealEstateAddDescr4")
    protected String inManipulateRealEstateAddDescr4;
    @XmlElement(name = "InManipulateRealEstateAddDescr5")
    protected String inManipulateRealEstateAddDescr5;
    @XmlElement(name = "InManipulateRealEstateEntryStatus")
    protected String inManipulateRealEstateEntryStatus;
    @XmlElement(name = "InManipulateRealEstateInsuranceEd", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inManipulateRealEstateInsuranceEd;
    @XmlElement(name = "InManipulateRealEstateInsuranceSd", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inManipulateRealEstateInsuranceSd;
    @XmlElement(name = "InManipulateRealEstateTotalSiteArea", required = true)
    protected BigDecimal inManipulateRealEstateTotalSiteArea;
    @XmlElement(name = "InManipulateRealEstateOutdoorAtticA", required = true)
    protected BigDecimal inManipulateRealEstateOutdoorAtticA;
    @XmlElement(name = "InManipulateRealEstateMortgageArea", required = true)
    protected BigDecimal inManipulateRealEstateMortgageArea;
    @XmlElement(name = "InManipulateRealEstateIssueYear")
    protected short inManipulateRealEstateIssueYear;
    @XmlElement(name = "InManipulateRealEstateValueDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inManipulateRealEstateValueDate;
    @XmlElement(name = "InManipulateRealEstateSiteValueAmn", required = true)
    protected BigDecimal inManipulateRealEstateSiteValueAmn;
    @XmlElement(name = "InManipulateRealEstateRealEstValAmn", required = true)
    protected BigDecimal inManipulateRealEstateRealEstValAmn;
    @XmlElement(name = "InManipulateRealEstateStoreValueAmn", required = true)
    protected BigDecimal inManipulateRealEstateStoreValueAmn;
    @XmlElement(name = "InManipulateRealEstateParkingValAmn", required = true)
    protected BigDecimal inManipulateRealEstateParkingValAmn;
    @XmlElement(name = "InManipulateRealEstateConstrCostAmn", required = true)
    protected BigDecimal inManipulateRealEstateConstrCostAmn;
    @XmlElement(name = "InManipulateRealEstateLegalProblems")
    protected String inManipulateRealEstateLegalProblems;
    @XmlElement(name = "InManipulateRealEstateUrbanPlanPro")
    protected String inManipulateRealEstateUrbanPlanPro;
    @XmlElement(name = "InManipulateRealEstateReevalFreq")
    protected short inManipulateRealEstateReevalFreq;
    @XmlElement(name = "InManipulateRealEstateAnnualRentAmn", required = true)
    protected BigDecimal inManipulateRealEstateAnnualRentAmn;
    @XmlElement(name = "InManipulateRealEstateRentalDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inManipulateRealEstateRentalDate;
    @XmlElement(name = "InManipulateRealEstateBuildLicenceid")
    protected String inManipulateRealEstateBuildLicenceid;
    @XmlElement(name = "InManipulateRealEstateLandRegistId")
    protected String inManipulateRealEstateLandRegistId;
    @XmlElement(name = "InManipulateRealEstateRentingComments")
    protected String inManipulateRealEstateRentingComments;
    @XmlElement(name = "InManipulateRealEstateStoreRoomNum")
    protected int inManipulateRealEstateStoreRoomNum;
    @XmlElement(name = "InManipulateRealEstateTotStoreArea", required = true)
    protected BigDecimal inManipulateRealEstateTotStoreArea;
    @XmlElement(name = "InManipulateRealEstateTotParkNum")
    protected int inManipulateRealEstateTotParkNum;
    @XmlElement(name = "InManipulateRealEstateTotParkArea", required = true)
    protected BigDecimal inManipulateRealEstateTotParkArea;
    @XmlElement(name = "InManipulateRealEstateMonTotStoreNum")
    protected int inManipulateRealEstateMonTotStoreNum;
    @XmlElement(name = "InManipulateRealEstateMonTotParkNum")
    protected int inManipulateRealEstateMonTotParkNum;
    @XmlElement(name = "InManipulateRealEstateTotalValueAmn", required = true)
    protected BigDecimal inManipulateRealEstateTotalValueAmn;
    @XmlElement(name = "InManipulateRealEstateParLandRegistId")
    protected String inManipulateRealEstateParLandRegistId;
    @XmlElement(name = "InManipulateRealEstateRegistry")
    protected String inManipulateRealEstateRegistry;
    @XmlElement(name = "InManipulateRealEstateRegistryTitleNo")
    protected String inManipulateRealEstateRegistryTitleNo;
    @XmlElement(name = "InManipulateRealEstateDistrictRegistry")
    protected String inManipulateRealEstateDistrictRegistry;
    @XmlElement(name = "InManipulateRealEstateBuilding")
    protected String inManipulateRealEstateBuilding;
    @XmlElement(name = "InManipulateRealEstateUnitNo")
    protected String inManipulateRealEstateUnitNo;
    @XmlElement(name = "InManipulateRealEstateEstate")
    protected String inManipulateRealEstateEstate;
    @XmlElement(name = "InManipulateRealEstateCourt")
    protected String inManipulateRealEstateCourt;
    @XmlElement(name = "InManipulateRealEstateTitleIssueDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inManipulateRealEstateTitleIssueDt;
    @XmlElement(name = "InManipulateRealEstateTitleTerm")
    protected int inManipulateRealEstateTitleTerm;
    @XmlElement(name = "InManipulateRealEstateTitleExpiryDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inManipulateRealEstateTitleExpiryDt;
    @XmlElement(name = "InManipulateRealEstateTitleNatureType")
    protected String inManipulateRealEstateTitleNatureType;
    @XmlElement(name = "InGetRealEstateId")
    protected double inGetRealEstateId;
    @XmlElement(name = "InDefaultProductIdProduct")
    protected int inDefaultProductIdProduct;
    @XmlElement(name = "InDefaultJustificIdJustific")
    protected int inDefaultJustificIdJustific;
    @XmlElement(name = "InIefSuppliedCommand")
    protected String inIefSuppliedCommand;
    @XmlElement(name = "InLogMntRecordingTrxCode")
    protected int inLogMntRecordingTrxCode;
    @XmlElement(name = "InLogMntRecordingReversalFlag")
    protected String inLogMntRecordingReversalFlag;
    @XmlElement(name = "InLogMntRecordingTerminalNumber")
    protected String inLogMntRecordingTerminalNumber;
    @XmlElement(name = "InLogMntRecordingAuthorizer1")
    protected String inLogMntRecordingAuthorizer1;
    @XmlElement(name = "InLogMntRecordingAuthorizer2")
    protected String inLogMntRecordingAuthorizer2;
    @XmlElement(name = "InRealEstateCustInternalSn")
    protected double inRealEstateCustInternalSn;
    @XmlElement(name = "InRealEstateCustEntryStatus")
    protected String inRealEstateCustEntryStatus;
    @XmlElement(name = "InRealEstateCustContractId")
    protected String inRealEstateCustContractId;
    @XmlElement(name = "InRealEstateCustOwnershPerc", required = true)
    protected BigDecimal inRealEstateCustOwnershPerc;
    @XmlElement(name = "InLeas2GenericDetailSerialNum")
    protected int inLeas2GenericDetailSerialNum;
    @XmlElement(name = "InLeas2GenericDetailParameterType")
    protected String inLeas2GenericDetailParameterType;
    @XmlElement(name = "InLeas2GenericDetailDescription")
    protected String inLeas2GenericDetailDescription;
    @XmlElement(name = "InBasakGenericDetailSerialNum")
    protected int inBasakGenericDetailSerialNum;
    @XmlElement(name = "InBasakGenericDetailParameterType")
    protected String inBasakGenericDetailParameterType;
    @XmlElement(name = "InEikyrGenericDetailSerialNum")
    protected int inEikyrGenericDetailSerialNum;
    @XmlElement(name = "InEikyrGenericDetailParameterType")
    protected String inEikyrGenericDetailParameterType;
    @XmlElement(name = "InRealEstateInfoCommandIefSuppliedCommand")
    protected String inRealEstateInfoCommandIefSuppliedCommand;
    @XmlElement(name = "InAdditionalInfoGenericDetailSerialNum")
    protected int inAdditionalInfoGenericDetailSerialNum;
    @XmlElement(name = "InAdditionalInfoGenericDetailParameterType")
    protected String inAdditionalInfoGenericDetailParameterType;
    @XmlElement(name = "InToContinueGenericDetailSerialNum")
    protected int inToContinueGenericDetailSerialNum;
    @XmlElement(name = "InToContinueGenericDetailParameterType")
    protected String inToContinueGenericDetailParameterType;
    @XmlElement(name = "InCommCurrCurrencyIdCurrency")
    protected int inCommCurrCurrencyIdCurrency;
    @XmlElement(name = "InCommCurrCurrencyShortDescr")
    protected String inCommCurrCurrencyShortDescr;
    @XmlElement(name = "InPricepermeterCurrCurrencyIdCurrency")
    protected int inPricepermeterCurrCurrencyIdCurrency;
    @XmlElement(name = "InPricepermeterCurrCurrencyShortDescr")
    protected String inPricepermeterCurrCurrencyShortDescr;
    @XmlElement(name = "InValuationTypeGenericDetailSerialNum")
    protected int inValuationTypeGenericDetailSerialNum;
    @XmlElement(name = "InValuationTypeGenericDetailShortDescription")
    protected String inValuationTypeGenericDetailShortDescription;
    @XmlElement(name = "InValuationTypeGenericDetailParameterType")
    protected String inValuationTypeGenericDetailParameterType;
    @XmlElement(name = "InValuationTypeGenericDetailEntryStatus")
    protected String inValuationTypeGenericDetailEntryStatus;
    @XmlElement(name = "InValuationTypeGenericDetailTmstamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inValuationTypeGenericDetailTmstamp;
    @XmlElement(name = "InValuationTypeGenericDetailDescription")
    protected String inValuationTypeGenericDetailDescription;
    @XmlElement(name = "InInvCurrIdCurrencyIdCurrency")
    protected int inInvCurrIdCurrencyIdCurrency;
    @XmlElement(name = "InInvCurrIdCurrencyShortDescr")
    protected String inInvCurrIdCurrencyShortDescr;
    @XmlElement(name = "InEsrIncCurrCurrencyIdCurrency")
    protected int inEsrIncCurrCurrencyIdCurrency;
    @XmlElement(name = "InEsrIncCurrCurrencyShortDescr")
    protected String inEsrIncCurrCurrencyShortDescr;
    @XmlElement(name = "InSelAmnCurrCurrencyIdCurrency")
    protected int inSelAmnCurrCurrencyIdCurrency;
    @XmlElement(name = "InSelAmnCurrCurrencyShortDescr")
    protected String inSelAmnCurrCurrencyShortDescr;
    @XmlElement(name = "InMortAmnCurrCurrencyIdCurrency")
    protected int inMortAmnCurrCurrencyIdCurrency;
    @XmlElement(name = "InMortAmnCurrCurrencyShortDescr")
    protected String inMortAmnCurrCurrencyShortDescr;
    @XmlElement(name = "InInsurAmnCurrCurrencyIdCurrency")
    protected int inInsurAmnCurrCurrencyIdCurrency;
    @XmlElement(name = "InInsurAmnCurrCurrencyShortDescr")
    protected String inInsurAmnCurrCurrencyShortDescr;
    @XmlElement(name = "InObjAmnCurrCurrencyIdCurrency")
    protected int inObjAmnCurrCurrencyIdCurrency;
    @XmlElement(name = "InObjAmnCurrCurrencyShortDescr")
    protected String inObjAmnCurrCurrencyShortDescr;
    @XmlElement(name = "InNatureTitleGenericDetailSerialNum")
    protected int inNatureTitleGenericDetailSerialNum;
    @XmlElement(name = "InNatureTitleGenericDetailShortDescription")
    protected String inNatureTitleGenericDetailShortDescription;
    @XmlElement(name = "InNatureTitleGenericDetailParameterType")
    protected String inNatureTitleGenericDetailParameterType;
    @XmlElement(name = "InNatureTitleGenericDetailDescription")
    protected String inNatureTitleGenericDetailDescription;
    @XmlElement(name = "InValuerCommandIefSuppliedCommand")
    protected String inValuerCommandIefSuppliedCommand;
    @XmlElement(name = "InPreviousRealEstateApprslInternalSn")
    protected double inPreviousRealEstateApprslInternalSn;
    @XmlElement(name = "InPreviousRealEstateApprslEvaluationDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inPreviousRealEstateApprslEvaluationDt;
    @XmlElement(name = "InValuerValuerValuerId")
    protected int inValuerValuerValuerId;
    @XmlElement(name = "InAllValuersFlgIefSuppliedFlag")
    protected String inAllValuersFlgIefSuppliedFlag;
    @XmlElement(name = "InGrpAuxSpace")
    protected ArrayOfMc2006VInGrpAuxSpaceItem inGrpAuxSpace;
    @XmlElement(name = "InGrpDefRealEst")
    protected ArrayOfMc2006VInGrpDefRealEstItem inGrpDefRealEst;
    @XmlElement(name = "InGrpQualInfo")
    protected ArrayOfMc2006VInGrpQualInfoItem inGrpQualInfo;
    @XmlElement(name = "InReinsGenericDetailSerialNum")
    protected int inReinsGenericDetailSerialNum;
    @XmlElement(name = "InReinsGenericDetailParameterType")
    protected String inReinsGenericDetailParameterType;
    @XmlElement(name = "InReincGenericDetailSerialNum")
    protected int inReincGenericDetailSerialNum;
    @XmlElement(name = "InReincGenericDetailParameterType")
    protected String inReincGenericDetailParameterType;
    @XmlElement(name = "InCustRelapInsRealEstateApprslEvaluator")
    protected String inCustRelapInsRealEstateApprslEvaluator;
    @XmlElement(name = "InCustRelapInsRealEstateApprslEvaluationDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inCustRelapInsRealEstateApprslEvaluationDt;
    @XmlElement(name = "InCustRelapInsRealEstateApprslSellValue", required = true)
    protected BigDecimal inCustRelapInsRealEstateApprslSellValue;
    @XmlElement(name = "InCustRelapInsRealEstateApprslPricePerMeter", required = true)
    protected BigDecimal inCustRelapInsRealEstateApprslPricePerMeter;
    @XmlElement(name = "InCustRelapInsRealEstateApprslApraisalCmnts")
    protected String inCustRelapInsRealEstateApprslApraisalCmnts;
    @XmlElement(name = "InCustRelapInsRealEstateApprslCommercValue", required = true)
    protected BigDecimal inCustRelapInsRealEstateApprslCommercValue;
    @XmlElement(name = "InCustRelapInsRealEstateApprslMortgageValue", required = true)
    protected BigDecimal inCustRelapInsRealEstateApprslMortgageValue;
    @XmlElement(name = "InCustRelapInsRealEstateApprslEstRentalIncAmn", required = true)
    protected BigDecimal inCustRelapInsRealEstateApprslEstRentalIncAmn;
    @XmlElement(name = "InCustRelapInsRealEstateApprslInvestmentAmn", required = true)
    protected BigDecimal inCustRelapInsRealEstateApprslInvestmentAmn;
    @XmlElement(name = "InCustRelapInsRealEstateApprslAdoptionValDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inCustRelapInsRealEstateApprslAdoptionValDt;
    @XmlElement(name = "InCustRelapInsRealEstateApprslEstInsurAmn", required = true)
    protected BigDecimal inCustRelapInsRealEstateApprslEstInsurAmn;
    @XmlElement(name = "InCustRelapInsRealEstateApprslObjectiveAmn", required = true)
    protected BigDecimal inCustRelapInsRealEstateApprslObjectiveAmn;
    @XmlElement(name = "InCustRelapInsRealEstateApprslEvalluationInd")
    protected String inCustRelapInsRealEstateApprslEvalluationInd;
    @XmlElement(name = "InCustRelapInsRealEstateApprslReevalFreq")
    protected short inCustRelapInsRealEstateApprslReevalFreq;
    @XmlElement(name = "InCustRelInsRealEstateCommercialValAmn", required = true)
    protected BigDecimal inCustRelInsRealEstateCommercialValAmn;
    @XmlElement(name = "InCustRelInsRealEstateEvalluationInd")
    protected String inCustRelInsRealEstateEvalluationInd;
    @XmlElement(name = "InCustRelInsRealEstateInsuranceEd", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inCustRelInsRealEstateInsuranceEd;
    @XmlElement(name = "InCustRelInsRealEstateInsuranceSd", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inCustRelInsRealEstateInsuranceSd;
    @XmlElement(name = "InCustRelInsRealEstateReevalFreq")
    protected short inCustRelInsRealEstateReevalFreq;
    @XmlElement(name = "InRealEstateApprslReevalFreq")
    protected short inRealEstateApprslReevalFreq;
    @XmlElement(name = "InRealEstateApprslInternalSn")
    protected double inRealEstateApprslInternalSn;
    @XmlElement(name = "InRealEstateApprslEvaluator")
    protected String inRealEstateApprslEvaluator;
    @XmlElement(name = "InRealEstateApprslEvaluationDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inRealEstateApprslEvaluationDt;
    @XmlElement(name = "InRealEstateApprslSellValue", required = true)
    protected BigDecimal inRealEstateApprslSellValue;
    @XmlElement(name = "InRealEstateApprslPricePerMeter", required = true)
    protected BigDecimal inRealEstateApprslPricePerMeter;
    @XmlElement(name = "InRealEstateApprslApraisalCmnts")
    protected String inRealEstateApprslApraisalCmnts;
    @XmlElement(name = "InRealEstateApprslEntryStatus")
    protected String inRealEstateApprslEntryStatus;
    @XmlElement(name = "InRealEstateApprslMortgageValue", required = true)
    protected BigDecimal inRealEstateApprslMortgageValue;
    @XmlElement(name = "InRealEstateApprslEstRentalIncAmn", required = true)
    protected BigDecimal inRealEstateApprslEstRentalIncAmn;
    @XmlElement(name = "InRealEstateApprslInvestmentAmn", required = true)
    protected BigDecimal inRealEstateApprslInvestmentAmn;
    @XmlElement(name = "InRealEstateApprslAdoptionValDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inRealEstateApprslAdoptionValDt;
    @XmlElement(name = "InRealEstateApprslEvalluationInd")
    protected String inRealEstateApprslEvalluationInd;
    @XmlElement(name = "InRealEstateApprslCommercValue", required = true)
    protected BigDecimal inRealEstateApprslCommercValue;
    @XmlElement(name = "InEvalCommandIefSuppliedCommand")
    protected String inEvalCommandIefSuppliedCommand;
    @XmlElement(name = "InCustomerCustId")
    protected int inCustomerCustId;
    @XmlElement(name = "InCustomerFirstName")
    protected String inCustomerFirstName;
    @XmlElement(name = "InCustomerSurname")
    protected String inCustomerSurname;
    @XmlElement(name = "InCustomerCDigit")
    protected short inCustomerCDigit;
    @XmlElement(name = "InCustomerCommandIefSuppliedCommand")
    protected String inCustomerCommandIefSuppliedCommand;
    @XmlElement(name = "InCntryGenericDetailSerialNum")
    protected int inCntryGenericDetailSerialNum;
    @XmlElement(name = "InCntryGenericDetailParameterType")
    protected String inCntryGenericDetailParameterType;
    @XmlElement(name = "InCntryGenericDetailDescription")
    protected String inCntryGenericDetailDescription;
    @XmlElement(name = "InAdddiGenericDetailSerialNum")
    protected int inAdddiGenericDetailSerialNum;
    @XmlElement(name = "InAdddiGenericDetailParameterType")
    protected String inAdddiGenericDetailParameterType;
    @XmlElement(name = "InAdddiGenericDetailDescription")
    protected String inAdddiGenericDetailDescription;
    @XmlElement(name = "InRelocGenericDetailSerialNum")
    protected int inRelocGenericDetailSerialNum;
    @XmlElement(name = "InRelocGenericDetailParameterType")
    protected String inRelocGenericDetailParameterType;
    @XmlElement(name = "InRelocGenericDetailDescription")
    protected String inRelocGenericDetailDescription;
    @XmlElement(name = "InRecbkGenericDetailSerialNum")
    protected int inRecbkGenericDetailSerialNum;
    @XmlElement(name = "InRecbkGenericDetailParameterType")
    protected String inRecbkGenericDetailParameterType;
    @XmlElement(name = "InRecbkGenericDetailDescription")
    protected String inRecbkGenericDetailDescription;
    @XmlElement(name = "InRecatGenericDetailSerialNum")
    protected int inRecatGenericDetailSerialNum;
    @XmlElement(name = "InRecatGenericDetailParameterType")
    protected String inRecatGenericDetailParameterType;
    @XmlElement(name = "InRecatGenericDetailDescription")
    protected String inRecatGenericDetailDescription;
    @XmlElement(name = "InRetypGenericDetailSerialNum")
    protected int inRetypGenericDetailSerialNum;
    @XmlElement(name = "InRetypGenericDetailParameterType")
    protected String inRetypGenericDetailParameterType;
    @XmlElement(name = "InRetypGenericDetailDescription")
    protected String inRetypGenericDetailDescription;
    @XmlElement(name = "InManipulateRealEstateRealEstateDesc")
    protected String inManipulateRealEstateRealEstateDesc;
    @XmlElement(name = "InManipulateRealEstateRealEstateType")
    protected String inManipulateRealEstateRealEstateType;
    @XmlElement(name = "InManipulateRealEstateOwnershipInd")
    protected String inManipulateRealEstateOwnershipInd;
    @XmlElement(name = "InManipulateRealEstateRealEstateCat")
    protected String inManipulateRealEstateRealEstateCat;
    @XmlElement(name = "InManipulateRealEstateMainArea", required = true)
    protected BigDecimal inManipulateRealEstateMainArea;
    @XmlElement(name = "InManipulateRealEstateAdditionalArea", required = true)
    protected BigDecimal inManipulateRealEstateAdditionalArea;
    @XmlElement(name = "InManipulateRealEstateApartmentNum")
    protected String inManipulateRealEstateApartmentNum;
    @XmlElement(name = "InManipulateRealEstateConstructionYear")
    protected short inManipulateRealEstateConstructionYear;
    @XmlElement(name = "InManipulateRealEstateFrontageInd")
    protected String inManipulateRealEstateFrontageInd;
    @XmlElement(name = "InManipulateRealEstateInsuranceDescr")
    protected String inManipulateRealEstateInsuranceDescr;
    @XmlElement(name = "InManipulateRealEstateInsuranceAmn", required = true)
    protected BigDecimal inManipulateRealEstateInsuranceAmn;
    @XmlElement(name = "InManipulateRealEstateInsOriginalAmn", required = true)
    protected BigDecimal inManipulateRealEstateInsOriginalAmn;
    @XmlElement(name = "InManipulateRealEstateAgreementValue", required = true)
    protected BigDecimal inManipulateRealEstateAgreementValue;
    @XmlElement(name = "InTotalSiteAreaGenericDetailSerialNum")
    protected int inTotalSiteAreaGenericDetailSerialNum;
    @XmlElement(name = "InTotalSiteAreaGenericDetailShortDescription")
    protected String inTotalSiteAreaGenericDetailShortDescription;
    @XmlElement(name = "InTotalSiteAreaGenericDetailParameterType")
    protected String inTotalSiteAreaGenericDetailParameterType;
    @XmlElement(name = "InTotalSiteAreaGenericDetailDescription")
    protected String inTotalSiteAreaGenericDetailDescription;
    @XmlElement(name = "InMainAreaGenericDetailSerialNum")
    protected int inMainAreaGenericDetailSerialNum;
    @XmlElement(name = "InMainAreaGenericDetailShortDescription")
    protected String inMainAreaGenericDetailShortDescription;
    @XmlElement(name = "InMainAreaGenericDetailParameterType")
    protected String inMainAreaGenericDetailParameterType;
    @XmlElement(name = "InMainAreaGenericDetailDescription")
    protected String inMainAreaGenericDetailDescription;
    @XmlElement(name = "InOutdoorAtticAreaGenericDetailSerialNum")
    protected int inOutdoorAtticAreaGenericDetailSerialNum;
    @XmlElement(name = "InOutdoorAtticAreaGenericDetailShortDescription")
    protected String inOutdoorAtticAreaGenericDetailShortDescription;
    @XmlElement(name = "InOutdoorAtticAreaGenericDetailParameterType")
    protected String inOutdoorAtticAreaGenericDetailParameterType;
    @XmlElement(name = "InOutdoorAtticAreaGenericDetailDescription")
    protected String inOutdoorAtticAreaGenericDetailDescription;
    @XmlElement(name = "InAdditionalAreaGenericDetailSerialNum")
    protected int inAdditionalAreaGenericDetailSerialNum;
    @XmlElement(name = "InAdditionalAreaGenericDetailShortDescription")
    protected String inAdditionalAreaGenericDetailShortDescription;
    @XmlElement(name = "InAdditionalAreaGenericDetailParameterType")
    protected String inAdditionalAreaGenericDetailParameterType;
    @XmlElement(name = "InAdditionalAreaGenericDetailDescription")
    protected String inAdditionalAreaGenericDetailDescription;
    @XmlElement(name = "InMortgageAreaGenericDetailSerialNum")
    protected int inMortgageAreaGenericDetailSerialNum;
    @XmlElement(name = "InMortgageAreaGenericDetailShortDescription")
    protected String inMortgageAreaGenericDetailShortDescription;
    @XmlElement(name = "InMortgageAreaGenericDetailParameterType")
    protected String inMortgageAreaGenericDetailParameterType;
    @XmlElement(name = "InMortgageAreaGenericDetailDescription")
    protected String inMortgageAreaGenericDetailDescription;
    @XmlElement(name = "InTotStoreAreaGenericDetailSerialNum")
    protected int inTotStoreAreaGenericDetailSerialNum;
    @XmlElement(name = "InTotStoreAreaGenericDetailShortDescription")
    protected String inTotStoreAreaGenericDetailShortDescription;
    @XmlElement(name = "InTotStoreAreaGenericDetailParameterType")
    protected String inTotStoreAreaGenericDetailParameterType;
    @XmlElement(name = "InTotStoreAreaGenericDetailDescription")
    protected String inTotStoreAreaGenericDetailDescription;
    @XmlElement(name = "InTotParkAreaGenericDetailSerialNum")
    protected int inTotParkAreaGenericDetailSerialNum;
    @XmlElement(name = "InTotParkAreaGenericDetailShortDescription")
    protected String inTotParkAreaGenericDetailShortDescription;
    @XmlElement(name = "InTotParkAreaGenericDetailParameterType")
    protected String inTotParkAreaGenericDetailParameterType;
    @XmlElement(name = "InTotParkAreaGenericDetailDescription")
    protected String inTotParkAreaGenericDetailDescription;
    @XmlElement(name = "InManipulateRealEstatePlotNumber")
    protected String inManipulateRealEstatePlotNumber;
    @XmlElement(name = "InManipulateRealEstateBlockNumber")
    protected String inManipulateRealEstateBlockNumber;
    @XmlElement(name = "InManipulateRealEstateCondPlanNo")
    protected String inManipulateRealEstateCondPlanNo;
    @XmlElement(name = "InManipulateRealEstateInstrumentNo")
    protected String inManipulateRealEstateInstrumentNo;
    @XmlElement(name = "InManipulateRealEstateMarketability")
    protected String inManipulateRealEstateMarketability;
    @XmlElement(name = "InManipulateRealEstateGpsCoord")
    protected String inManipulateRealEstateGpsCoord;
    @XmlElement(name = "InManipulateRealEstateCopyOfTitle")
    protected String inManipulateRealEstateCopyOfTitle;
    @XmlElement(name = "InManipulateRealEstateTitleSubmDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inManipulateRealEstateTitleSubmDt;
    @XmlElement(name = "InManipulateRealEstateTitleReturnDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inManipulateRealEstateTitleReturnDt;
    @XmlElement(name = "InManipulateRealEstateInsurPolicyNo")
    protected String inManipulateRealEstateInsurPolicyNo;
    @XmlElement(name = "InAddrSnCustAddrParrelDSn")
    protected int inAddrSnCustAddrParrelDSn;
    @XmlElement(name = "InAddrSnCustAddrParrelDCode")
    protected String inAddrSnCustAddrParrelDCode;
    @XmlElement(name = "InRealEstateCustRegistProprietor")
    protected String inRealEstateCustRegistProprietor;
    @XmlElement(name = "InManipulateRealEstateFolio")
    protected String inManipulateRealEstateFolio;
    @XmlElement(name = "InManipulateRealEstateInsurAnnualAmnt", required = true)
    protected BigDecimal inManipulateRealEstateInsurAnnualAmnt;
    @XmlElement(name = "InTitleAddrSnCustAddrParrelDSn")
    protected int inTitleAddrSnCustAddrParrelDSn;
    @XmlElement(name = "InTitleAddrSnCustAddrParrelDCode")
    protected String inTitleAddrSnCustAddrParrelDCode;

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
     * Gets the value of the inManipulateRealEstateAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInManipulateRealEstateAddress() {
        return inManipulateRealEstateAddress;
    }

    /**
     * Sets the value of the inManipulateRealEstateAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInManipulateRealEstateAddress(String value) {
        this.inManipulateRealEstateAddress = value;
    }

    /**
     * Gets the value of the inManipulateRealEstateAddressNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInManipulateRealEstateAddressNum() {
        return inManipulateRealEstateAddressNum;
    }

    /**
     * Sets the value of the inManipulateRealEstateAddressNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInManipulateRealEstateAddressNum(String value) {
        this.inManipulateRealEstateAddressNum = value;
    }

    /**
     * Gets the value of the inManipulateRealEstateZipCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInManipulateRealEstateZipCode() {
        return inManipulateRealEstateZipCode;
    }

    /**
     * Sets the value of the inManipulateRealEstateZipCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInManipulateRealEstateZipCode(String value) {
        this.inManipulateRealEstateZipCode = value;
    }

    /**
     * Gets the value of the inManipulateRealEstateCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInManipulateRealEstateCity() {
        return inManipulateRealEstateCity;
    }

    /**
     * Sets the value of the inManipulateRealEstateCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInManipulateRealEstateCity(String value) {
        this.inManipulateRealEstateCity = value;
    }

    /**
     * Gets the value of the inManipulateRealEstateRegion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInManipulateRealEstateRegion() {
        return inManipulateRealEstateRegion;
    }

    /**
     * Sets the value of the inManipulateRealEstateRegion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInManipulateRealEstateRegion(String value) {
        this.inManipulateRealEstateRegion = value;
    }

    /**
     * Gets the value of the inManipulateRealEstateMunicipality property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInManipulateRealEstateMunicipality() {
        return inManipulateRealEstateMunicipality;
    }

    /**
     * Sets the value of the inManipulateRealEstateMunicipality property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInManipulateRealEstateMunicipality(String value) {
        this.inManipulateRealEstateMunicipality = value;
    }

    /**
     * Gets the value of the inManipulateRealEstateCommercialValAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInManipulateRealEstateCommercialValAmn() {
        return inManipulateRealEstateCommercialValAmn;
    }

    /**
     * Sets the value of the inManipulateRealEstateCommercialValAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInManipulateRealEstateCommercialValAmn(BigDecimal value) {
        this.inManipulateRealEstateCommercialValAmn = value;
    }

    /**
     * Gets the value of the inManipulateRealEstateEvalluationInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInManipulateRealEstateEvalluationInd() {
        return inManipulateRealEstateEvalluationInd;
    }

    /**
     * Sets the value of the inManipulateRealEstateEvalluationInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInManipulateRealEstateEvalluationInd(String value) {
        this.inManipulateRealEstateEvalluationInd = value;
    }

    /**
     * Gets the value of the inManipulateRealEstateAddDescr1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInManipulateRealEstateAddDescr1() {
        return inManipulateRealEstateAddDescr1;
    }

    /**
     * Sets the value of the inManipulateRealEstateAddDescr1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInManipulateRealEstateAddDescr1(String value) {
        this.inManipulateRealEstateAddDescr1 = value;
    }

    /**
     * Gets the value of the inManipulateRealEstateAddDescr2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInManipulateRealEstateAddDescr2() {
        return inManipulateRealEstateAddDescr2;
    }

    /**
     * Sets the value of the inManipulateRealEstateAddDescr2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInManipulateRealEstateAddDescr2(String value) {
        this.inManipulateRealEstateAddDescr2 = value;
    }

    /**
     * Gets the value of the inManipulateRealEstateAddDescr3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInManipulateRealEstateAddDescr3() {
        return inManipulateRealEstateAddDescr3;
    }

    /**
     * Sets the value of the inManipulateRealEstateAddDescr3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInManipulateRealEstateAddDescr3(String value) {
        this.inManipulateRealEstateAddDescr3 = value;
    }

    /**
     * Gets the value of the inManipulateRealEstateAddDescr4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInManipulateRealEstateAddDescr4() {
        return inManipulateRealEstateAddDescr4;
    }

    /**
     * Sets the value of the inManipulateRealEstateAddDescr4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInManipulateRealEstateAddDescr4(String value) {
        this.inManipulateRealEstateAddDescr4 = value;
    }

    /**
     * Gets the value of the inManipulateRealEstateAddDescr5 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInManipulateRealEstateAddDescr5() {
        return inManipulateRealEstateAddDescr5;
    }

    /**
     * Sets the value of the inManipulateRealEstateAddDescr5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInManipulateRealEstateAddDescr5(String value) {
        this.inManipulateRealEstateAddDescr5 = value;
    }

    /**
     * Gets the value of the inManipulateRealEstateEntryStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInManipulateRealEstateEntryStatus() {
        return inManipulateRealEstateEntryStatus;
    }

    /**
     * Sets the value of the inManipulateRealEstateEntryStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInManipulateRealEstateEntryStatus(String value) {
        this.inManipulateRealEstateEntryStatus = value;
    }

    /**
     * Gets the value of the inManipulateRealEstateInsuranceEd property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInManipulateRealEstateInsuranceEd() {
        return inManipulateRealEstateInsuranceEd;
    }

    /**
     * Sets the value of the inManipulateRealEstateInsuranceEd property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInManipulateRealEstateInsuranceEd(XMLGregorianCalendar value) {
        this.inManipulateRealEstateInsuranceEd = value;
    }

    /**
     * Gets the value of the inManipulateRealEstateInsuranceSd property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInManipulateRealEstateInsuranceSd() {
        return inManipulateRealEstateInsuranceSd;
    }

    /**
     * Sets the value of the inManipulateRealEstateInsuranceSd property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInManipulateRealEstateInsuranceSd(XMLGregorianCalendar value) {
        this.inManipulateRealEstateInsuranceSd = value;
    }

    /**
     * Gets the value of the inManipulateRealEstateTotalSiteArea property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInManipulateRealEstateTotalSiteArea() {
        return inManipulateRealEstateTotalSiteArea;
    }

    /**
     * Sets the value of the inManipulateRealEstateTotalSiteArea property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInManipulateRealEstateTotalSiteArea(BigDecimal value) {
        this.inManipulateRealEstateTotalSiteArea = value;
    }

    /**
     * Gets the value of the inManipulateRealEstateOutdoorAtticA property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInManipulateRealEstateOutdoorAtticA() {
        return inManipulateRealEstateOutdoorAtticA;
    }

    /**
     * Sets the value of the inManipulateRealEstateOutdoorAtticA property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInManipulateRealEstateOutdoorAtticA(BigDecimal value) {
        this.inManipulateRealEstateOutdoorAtticA = value;
    }

    /**
     * Gets the value of the inManipulateRealEstateMortgageArea property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInManipulateRealEstateMortgageArea() {
        return inManipulateRealEstateMortgageArea;
    }

    /**
     * Sets the value of the inManipulateRealEstateMortgageArea property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInManipulateRealEstateMortgageArea(BigDecimal value) {
        this.inManipulateRealEstateMortgageArea = value;
    }

    /**
     * Gets the value of the inManipulateRealEstateIssueYear property.
     * 
     */
    public short getInManipulateRealEstateIssueYear() {
        return inManipulateRealEstateIssueYear;
    }

    /**
     * Sets the value of the inManipulateRealEstateIssueYear property.
     * 
     */
    public void setInManipulateRealEstateIssueYear(short value) {
        this.inManipulateRealEstateIssueYear = value;
    }

    /**
     * Gets the value of the inManipulateRealEstateValueDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInManipulateRealEstateValueDate() {
        return inManipulateRealEstateValueDate;
    }

    /**
     * Sets the value of the inManipulateRealEstateValueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInManipulateRealEstateValueDate(XMLGregorianCalendar value) {
        this.inManipulateRealEstateValueDate = value;
    }

    /**
     * Gets the value of the inManipulateRealEstateSiteValueAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInManipulateRealEstateSiteValueAmn() {
        return inManipulateRealEstateSiteValueAmn;
    }

    /**
     * Sets the value of the inManipulateRealEstateSiteValueAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInManipulateRealEstateSiteValueAmn(BigDecimal value) {
        this.inManipulateRealEstateSiteValueAmn = value;
    }

    /**
     * Gets the value of the inManipulateRealEstateRealEstValAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInManipulateRealEstateRealEstValAmn() {
        return inManipulateRealEstateRealEstValAmn;
    }

    /**
     * Sets the value of the inManipulateRealEstateRealEstValAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInManipulateRealEstateRealEstValAmn(BigDecimal value) {
        this.inManipulateRealEstateRealEstValAmn = value;
    }

    /**
     * Gets the value of the inManipulateRealEstateStoreValueAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInManipulateRealEstateStoreValueAmn() {
        return inManipulateRealEstateStoreValueAmn;
    }

    /**
     * Sets the value of the inManipulateRealEstateStoreValueAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInManipulateRealEstateStoreValueAmn(BigDecimal value) {
        this.inManipulateRealEstateStoreValueAmn = value;
    }

    /**
     * Gets the value of the inManipulateRealEstateParkingValAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInManipulateRealEstateParkingValAmn() {
        return inManipulateRealEstateParkingValAmn;
    }

    /**
     * Sets the value of the inManipulateRealEstateParkingValAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInManipulateRealEstateParkingValAmn(BigDecimal value) {
        this.inManipulateRealEstateParkingValAmn = value;
    }

    /**
     * Gets the value of the inManipulateRealEstateConstrCostAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInManipulateRealEstateConstrCostAmn() {
        return inManipulateRealEstateConstrCostAmn;
    }

    /**
     * Sets the value of the inManipulateRealEstateConstrCostAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInManipulateRealEstateConstrCostAmn(BigDecimal value) {
        this.inManipulateRealEstateConstrCostAmn = value;
    }

    /**
     * Gets the value of the inManipulateRealEstateLegalProblems property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInManipulateRealEstateLegalProblems() {
        return inManipulateRealEstateLegalProblems;
    }

    /**
     * Sets the value of the inManipulateRealEstateLegalProblems property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInManipulateRealEstateLegalProblems(String value) {
        this.inManipulateRealEstateLegalProblems = value;
    }

    /**
     * Gets the value of the inManipulateRealEstateUrbanPlanPro property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInManipulateRealEstateUrbanPlanPro() {
        return inManipulateRealEstateUrbanPlanPro;
    }

    /**
     * Sets the value of the inManipulateRealEstateUrbanPlanPro property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInManipulateRealEstateUrbanPlanPro(String value) {
        this.inManipulateRealEstateUrbanPlanPro = value;
    }

    /**
     * Gets the value of the inManipulateRealEstateReevalFreq property.
     * 
     */
    public short getInManipulateRealEstateReevalFreq() {
        return inManipulateRealEstateReevalFreq;
    }

    /**
     * Sets the value of the inManipulateRealEstateReevalFreq property.
     * 
     */
    public void setInManipulateRealEstateReevalFreq(short value) {
        this.inManipulateRealEstateReevalFreq = value;
    }

    /**
     * Gets the value of the inManipulateRealEstateAnnualRentAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInManipulateRealEstateAnnualRentAmn() {
        return inManipulateRealEstateAnnualRentAmn;
    }

    /**
     * Sets the value of the inManipulateRealEstateAnnualRentAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInManipulateRealEstateAnnualRentAmn(BigDecimal value) {
        this.inManipulateRealEstateAnnualRentAmn = value;
    }

    /**
     * Gets the value of the inManipulateRealEstateRentalDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInManipulateRealEstateRentalDate() {
        return inManipulateRealEstateRentalDate;
    }

    /**
     * Sets the value of the inManipulateRealEstateRentalDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInManipulateRealEstateRentalDate(XMLGregorianCalendar value) {
        this.inManipulateRealEstateRentalDate = value;
    }

    /**
     * Gets the value of the inManipulateRealEstateBuildLicenceid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInManipulateRealEstateBuildLicenceid() {
        return inManipulateRealEstateBuildLicenceid;
    }

    /**
     * Sets the value of the inManipulateRealEstateBuildLicenceid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInManipulateRealEstateBuildLicenceid(String value) {
        this.inManipulateRealEstateBuildLicenceid = value;
    }

    /**
     * Gets the value of the inManipulateRealEstateLandRegistId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInManipulateRealEstateLandRegistId() {
        return inManipulateRealEstateLandRegistId;
    }

    /**
     * Sets the value of the inManipulateRealEstateLandRegistId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInManipulateRealEstateLandRegistId(String value) {
        this.inManipulateRealEstateLandRegistId = value;
    }

    /**
     * Gets the value of the inManipulateRealEstateRentingComments property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInManipulateRealEstateRentingComments() {
        return inManipulateRealEstateRentingComments;
    }

    /**
     * Sets the value of the inManipulateRealEstateRentingComments property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInManipulateRealEstateRentingComments(String value) {
        this.inManipulateRealEstateRentingComments = value;
    }

    /**
     * Gets the value of the inManipulateRealEstateStoreRoomNum property.
     * 
     */
    public int getInManipulateRealEstateStoreRoomNum() {
        return inManipulateRealEstateStoreRoomNum;
    }

    /**
     * Sets the value of the inManipulateRealEstateStoreRoomNum property.
     * 
     */
    public void setInManipulateRealEstateStoreRoomNum(int value) {
        this.inManipulateRealEstateStoreRoomNum = value;
    }

    /**
     * Gets the value of the inManipulateRealEstateTotStoreArea property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInManipulateRealEstateTotStoreArea() {
        return inManipulateRealEstateTotStoreArea;
    }

    /**
     * Sets the value of the inManipulateRealEstateTotStoreArea property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInManipulateRealEstateTotStoreArea(BigDecimal value) {
        this.inManipulateRealEstateTotStoreArea = value;
    }

    /**
     * Gets the value of the inManipulateRealEstateTotParkNum property.
     * 
     */
    public int getInManipulateRealEstateTotParkNum() {
        return inManipulateRealEstateTotParkNum;
    }

    /**
     * Sets the value of the inManipulateRealEstateTotParkNum property.
     * 
     */
    public void setInManipulateRealEstateTotParkNum(int value) {
        this.inManipulateRealEstateTotParkNum = value;
    }

    /**
     * Gets the value of the inManipulateRealEstateTotParkArea property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInManipulateRealEstateTotParkArea() {
        return inManipulateRealEstateTotParkArea;
    }

    /**
     * Sets the value of the inManipulateRealEstateTotParkArea property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInManipulateRealEstateTotParkArea(BigDecimal value) {
        this.inManipulateRealEstateTotParkArea = value;
    }

    /**
     * Gets the value of the inManipulateRealEstateMonTotStoreNum property.
     * 
     */
    public int getInManipulateRealEstateMonTotStoreNum() {
        return inManipulateRealEstateMonTotStoreNum;
    }

    /**
     * Sets the value of the inManipulateRealEstateMonTotStoreNum property.
     * 
     */
    public void setInManipulateRealEstateMonTotStoreNum(int value) {
        this.inManipulateRealEstateMonTotStoreNum = value;
    }

    /**
     * Gets the value of the inManipulateRealEstateMonTotParkNum property.
     * 
     */
    public int getInManipulateRealEstateMonTotParkNum() {
        return inManipulateRealEstateMonTotParkNum;
    }

    /**
     * Sets the value of the inManipulateRealEstateMonTotParkNum property.
     * 
     */
    public void setInManipulateRealEstateMonTotParkNum(int value) {
        this.inManipulateRealEstateMonTotParkNum = value;
    }

    /**
     * Gets the value of the inManipulateRealEstateTotalValueAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInManipulateRealEstateTotalValueAmn() {
        return inManipulateRealEstateTotalValueAmn;
    }

    /**
     * Sets the value of the inManipulateRealEstateTotalValueAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInManipulateRealEstateTotalValueAmn(BigDecimal value) {
        this.inManipulateRealEstateTotalValueAmn = value;
    }

    /**
     * Gets the value of the inManipulateRealEstateParLandRegistId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInManipulateRealEstateParLandRegistId() {
        return inManipulateRealEstateParLandRegistId;
    }

    /**
     * Sets the value of the inManipulateRealEstateParLandRegistId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInManipulateRealEstateParLandRegistId(String value) {
        this.inManipulateRealEstateParLandRegistId = value;
    }

    /**
     * Gets the value of the inManipulateRealEstateRegistry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInManipulateRealEstateRegistry() {
        return inManipulateRealEstateRegistry;
    }

    /**
     * Sets the value of the inManipulateRealEstateRegistry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInManipulateRealEstateRegistry(String value) {
        this.inManipulateRealEstateRegistry = value;
    }

    /**
     * Gets the value of the inManipulateRealEstateRegistryTitleNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInManipulateRealEstateRegistryTitleNo() {
        return inManipulateRealEstateRegistryTitleNo;
    }

    /**
     * Sets the value of the inManipulateRealEstateRegistryTitleNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInManipulateRealEstateRegistryTitleNo(String value) {
        this.inManipulateRealEstateRegistryTitleNo = value;
    }

    /**
     * Gets the value of the inManipulateRealEstateDistrictRegistry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInManipulateRealEstateDistrictRegistry() {
        return inManipulateRealEstateDistrictRegistry;
    }

    /**
     * Sets the value of the inManipulateRealEstateDistrictRegistry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInManipulateRealEstateDistrictRegistry(String value) {
        this.inManipulateRealEstateDistrictRegistry = value;
    }

    /**
     * Gets the value of the inManipulateRealEstateBuilding property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInManipulateRealEstateBuilding() {
        return inManipulateRealEstateBuilding;
    }

    /**
     * Sets the value of the inManipulateRealEstateBuilding property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInManipulateRealEstateBuilding(String value) {
        this.inManipulateRealEstateBuilding = value;
    }

    /**
     * Gets the value of the inManipulateRealEstateUnitNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInManipulateRealEstateUnitNo() {
        return inManipulateRealEstateUnitNo;
    }

    /**
     * Sets the value of the inManipulateRealEstateUnitNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInManipulateRealEstateUnitNo(String value) {
        this.inManipulateRealEstateUnitNo = value;
    }

    /**
     * Gets the value of the inManipulateRealEstateEstate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInManipulateRealEstateEstate() {
        return inManipulateRealEstateEstate;
    }

    /**
     * Sets the value of the inManipulateRealEstateEstate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInManipulateRealEstateEstate(String value) {
        this.inManipulateRealEstateEstate = value;
    }

    /**
     * Gets the value of the inManipulateRealEstateCourt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInManipulateRealEstateCourt() {
        return inManipulateRealEstateCourt;
    }

    /**
     * Sets the value of the inManipulateRealEstateCourt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInManipulateRealEstateCourt(String value) {
        this.inManipulateRealEstateCourt = value;
    }

    /**
     * Gets the value of the inManipulateRealEstateTitleIssueDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInManipulateRealEstateTitleIssueDt() {
        return inManipulateRealEstateTitleIssueDt;
    }

    /**
     * Sets the value of the inManipulateRealEstateTitleIssueDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInManipulateRealEstateTitleIssueDt(XMLGregorianCalendar value) {
        this.inManipulateRealEstateTitleIssueDt = value;
    }

    /**
     * Gets the value of the inManipulateRealEstateTitleTerm property.
     * 
     */
    public int getInManipulateRealEstateTitleTerm() {
        return inManipulateRealEstateTitleTerm;
    }

    /**
     * Sets the value of the inManipulateRealEstateTitleTerm property.
     * 
     */
    public void setInManipulateRealEstateTitleTerm(int value) {
        this.inManipulateRealEstateTitleTerm = value;
    }

    /**
     * Gets the value of the inManipulateRealEstateTitleExpiryDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInManipulateRealEstateTitleExpiryDt() {
        return inManipulateRealEstateTitleExpiryDt;
    }

    /**
     * Sets the value of the inManipulateRealEstateTitleExpiryDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInManipulateRealEstateTitleExpiryDt(XMLGregorianCalendar value) {
        this.inManipulateRealEstateTitleExpiryDt = value;
    }

    /**
     * Gets the value of the inManipulateRealEstateTitleNatureType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInManipulateRealEstateTitleNatureType() {
        return inManipulateRealEstateTitleNatureType;
    }

    /**
     * Sets the value of the inManipulateRealEstateTitleNatureType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInManipulateRealEstateTitleNatureType(String value) {
        this.inManipulateRealEstateTitleNatureType = value;
    }

    /**
     * Gets the value of the inGetRealEstateId property.
     * 
     */
    public double getInGetRealEstateId() {
        return inGetRealEstateId;
    }

    /**
     * Sets the value of the inGetRealEstateId property.
     * 
     */
    public void setInGetRealEstateId(double value) {
        this.inGetRealEstateId = value;
    }

    /**
     * Gets the value of the inDefaultProductIdProduct property.
     * 
     */
    public int getInDefaultProductIdProduct() {
        return inDefaultProductIdProduct;
    }

    /**
     * Sets the value of the inDefaultProductIdProduct property.
     * 
     */
    public void setInDefaultProductIdProduct(int value) {
        this.inDefaultProductIdProduct = value;
    }

    /**
     * Gets the value of the inDefaultJustificIdJustific property.
     * 
     */
    public int getInDefaultJustificIdJustific() {
        return inDefaultJustificIdJustific;
    }

    /**
     * Sets the value of the inDefaultJustificIdJustific property.
     * 
     */
    public void setInDefaultJustificIdJustific(int value) {
        this.inDefaultJustificIdJustific = value;
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
     * Gets the value of the inLogMntRecordingTrxCode property.
     * 
     */
    public int getInLogMntRecordingTrxCode() {
        return inLogMntRecordingTrxCode;
    }

    /**
     * Sets the value of the inLogMntRecordingTrxCode property.
     * 
     */
    public void setInLogMntRecordingTrxCode(int value) {
        this.inLogMntRecordingTrxCode = value;
    }

    /**
     * Gets the value of the inLogMntRecordingReversalFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInLogMntRecordingReversalFlag() {
        return inLogMntRecordingReversalFlag;
    }

    /**
     * Sets the value of the inLogMntRecordingReversalFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInLogMntRecordingReversalFlag(String value) {
        this.inLogMntRecordingReversalFlag = value;
    }

    /**
     * Gets the value of the inLogMntRecordingTerminalNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInLogMntRecordingTerminalNumber() {
        return inLogMntRecordingTerminalNumber;
    }

    /**
     * Sets the value of the inLogMntRecordingTerminalNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInLogMntRecordingTerminalNumber(String value) {
        this.inLogMntRecordingTerminalNumber = value;
    }

    /**
     * Gets the value of the inLogMntRecordingAuthorizer1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInLogMntRecordingAuthorizer1() {
        return inLogMntRecordingAuthorizer1;
    }

    /**
     * Sets the value of the inLogMntRecordingAuthorizer1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInLogMntRecordingAuthorizer1(String value) {
        this.inLogMntRecordingAuthorizer1 = value;
    }

    /**
     * Gets the value of the inLogMntRecordingAuthorizer2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInLogMntRecordingAuthorizer2() {
        return inLogMntRecordingAuthorizer2;
    }

    /**
     * Sets the value of the inLogMntRecordingAuthorizer2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInLogMntRecordingAuthorizer2(String value) {
        this.inLogMntRecordingAuthorizer2 = value;
    }

    /**
     * Gets the value of the inRealEstateCustInternalSn property.
     * 
     */
    public double getInRealEstateCustInternalSn() {
        return inRealEstateCustInternalSn;
    }

    /**
     * Sets the value of the inRealEstateCustInternalSn property.
     * 
     */
    public void setInRealEstateCustInternalSn(double value) {
        this.inRealEstateCustInternalSn = value;
    }

    /**
     * Gets the value of the inRealEstateCustEntryStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInRealEstateCustEntryStatus() {
        return inRealEstateCustEntryStatus;
    }

    /**
     * Sets the value of the inRealEstateCustEntryStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInRealEstateCustEntryStatus(String value) {
        this.inRealEstateCustEntryStatus = value;
    }

    /**
     * Gets the value of the inRealEstateCustContractId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInRealEstateCustContractId() {
        return inRealEstateCustContractId;
    }

    /**
     * Sets the value of the inRealEstateCustContractId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInRealEstateCustContractId(String value) {
        this.inRealEstateCustContractId = value;
    }

    /**
     * Gets the value of the inRealEstateCustOwnershPerc property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInRealEstateCustOwnershPerc() {
        return inRealEstateCustOwnershPerc;
    }

    /**
     * Sets the value of the inRealEstateCustOwnershPerc property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInRealEstateCustOwnershPerc(BigDecimal value) {
        this.inRealEstateCustOwnershPerc = value;
    }

    /**
     * Gets the value of the inLeas2GenericDetailSerialNum property.
     * 
     */
    public int getInLeas2GenericDetailSerialNum() {
        return inLeas2GenericDetailSerialNum;
    }

    /**
     * Sets the value of the inLeas2GenericDetailSerialNum property.
     * 
     */
    public void setInLeas2GenericDetailSerialNum(int value) {
        this.inLeas2GenericDetailSerialNum = value;
    }

    /**
     * Gets the value of the inLeas2GenericDetailParameterType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInLeas2GenericDetailParameterType() {
        return inLeas2GenericDetailParameterType;
    }

    /**
     * Sets the value of the inLeas2GenericDetailParameterType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInLeas2GenericDetailParameterType(String value) {
        this.inLeas2GenericDetailParameterType = value;
    }

    /**
     * Gets the value of the inLeas2GenericDetailDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInLeas2GenericDetailDescription() {
        return inLeas2GenericDetailDescription;
    }

    /**
     * Sets the value of the inLeas2GenericDetailDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInLeas2GenericDetailDescription(String value) {
        this.inLeas2GenericDetailDescription = value;
    }

    /**
     * Gets the value of the inBasakGenericDetailSerialNum property.
     * 
     */
    public int getInBasakGenericDetailSerialNum() {
        return inBasakGenericDetailSerialNum;
    }

    /**
     * Sets the value of the inBasakGenericDetailSerialNum property.
     * 
     */
    public void setInBasakGenericDetailSerialNum(int value) {
        this.inBasakGenericDetailSerialNum = value;
    }

    /**
     * Gets the value of the inBasakGenericDetailParameterType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInBasakGenericDetailParameterType() {
        return inBasakGenericDetailParameterType;
    }

    /**
     * Sets the value of the inBasakGenericDetailParameterType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInBasakGenericDetailParameterType(String value) {
        this.inBasakGenericDetailParameterType = value;
    }

    /**
     * Gets the value of the inEikyrGenericDetailSerialNum property.
     * 
     */
    public int getInEikyrGenericDetailSerialNum() {
        return inEikyrGenericDetailSerialNum;
    }

    /**
     * Sets the value of the inEikyrGenericDetailSerialNum property.
     * 
     */
    public void setInEikyrGenericDetailSerialNum(int value) {
        this.inEikyrGenericDetailSerialNum = value;
    }

    /**
     * Gets the value of the inEikyrGenericDetailParameterType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInEikyrGenericDetailParameterType() {
        return inEikyrGenericDetailParameterType;
    }

    /**
     * Sets the value of the inEikyrGenericDetailParameterType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInEikyrGenericDetailParameterType(String value) {
        this.inEikyrGenericDetailParameterType = value;
    }

    /**
     * Gets the value of the inRealEstateInfoCommandIefSuppliedCommand property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInRealEstateInfoCommandIefSuppliedCommand() {
        return inRealEstateInfoCommandIefSuppliedCommand;
    }

    /**
     * Sets the value of the inRealEstateInfoCommandIefSuppliedCommand property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInRealEstateInfoCommandIefSuppliedCommand(String value) {
        this.inRealEstateInfoCommandIefSuppliedCommand = value;
    }

    /**
     * Gets the value of the inAdditionalInfoGenericDetailSerialNum property.
     * 
     */
    public int getInAdditionalInfoGenericDetailSerialNum() {
        return inAdditionalInfoGenericDetailSerialNum;
    }

    /**
     * Sets the value of the inAdditionalInfoGenericDetailSerialNum property.
     * 
     */
    public void setInAdditionalInfoGenericDetailSerialNum(int value) {
        this.inAdditionalInfoGenericDetailSerialNum = value;
    }

    /**
     * Gets the value of the inAdditionalInfoGenericDetailParameterType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInAdditionalInfoGenericDetailParameterType() {
        return inAdditionalInfoGenericDetailParameterType;
    }

    /**
     * Sets the value of the inAdditionalInfoGenericDetailParameterType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInAdditionalInfoGenericDetailParameterType(String value) {
        this.inAdditionalInfoGenericDetailParameterType = value;
    }

    /**
     * Gets the value of the inToContinueGenericDetailSerialNum property.
     * 
     */
    public int getInToContinueGenericDetailSerialNum() {
        return inToContinueGenericDetailSerialNum;
    }

    /**
     * Sets the value of the inToContinueGenericDetailSerialNum property.
     * 
     */
    public void setInToContinueGenericDetailSerialNum(int value) {
        this.inToContinueGenericDetailSerialNum = value;
    }

    /**
     * Gets the value of the inToContinueGenericDetailParameterType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInToContinueGenericDetailParameterType() {
        return inToContinueGenericDetailParameterType;
    }

    /**
     * Sets the value of the inToContinueGenericDetailParameterType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInToContinueGenericDetailParameterType(String value) {
        this.inToContinueGenericDetailParameterType = value;
    }

    /**
     * Gets the value of the inCommCurrCurrencyIdCurrency property.
     * 
     */
    public int getInCommCurrCurrencyIdCurrency() {
        return inCommCurrCurrencyIdCurrency;
    }

    /**
     * Sets the value of the inCommCurrCurrencyIdCurrency property.
     * 
     */
    public void setInCommCurrCurrencyIdCurrency(int value) {
        this.inCommCurrCurrencyIdCurrency = value;
    }

    /**
     * Gets the value of the inCommCurrCurrencyShortDescr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCommCurrCurrencyShortDescr() {
        return inCommCurrCurrencyShortDescr;
    }

    /**
     * Sets the value of the inCommCurrCurrencyShortDescr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCommCurrCurrencyShortDescr(String value) {
        this.inCommCurrCurrencyShortDescr = value;
    }

    /**
     * Gets the value of the inPricepermeterCurrCurrencyIdCurrency property.
     * 
     */
    public int getInPricepermeterCurrCurrencyIdCurrency() {
        return inPricepermeterCurrCurrencyIdCurrency;
    }

    /**
     * Sets the value of the inPricepermeterCurrCurrencyIdCurrency property.
     * 
     */
    public void setInPricepermeterCurrCurrencyIdCurrency(int value) {
        this.inPricepermeterCurrCurrencyIdCurrency = value;
    }

    /**
     * Gets the value of the inPricepermeterCurrCurrencyShortDescr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInPricepermeterCurrCurrencyShortDescr() {
        return inPricepermeterCurrCurrencyShortDescr;
    }

    /**
     * Sets the value of the inPricepermeterCurrCurrencyShortDescr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInPricepermeterCurrCurrencyShortDescr(String value) {
        this.inPricepermeterCurrCurrencyShortDescr = value;
    }

    /**
     * Gets the value of the inValuationTypeGenericDetailSerialNum property.
     * 
     */
    public int getInValuationTypeGenericDetailSerialNum() {
        return inValuationTypeGenericDetailSerialNum;
    }

    /**
     * Sets the value of the inValuationTypeGenericDetailSerialNum property.
     * 
     */
    public void setInValuationTypeGenericDetailSerialNum(int value) {
        this.inValuationTypeGenericDetailSerialNum = value;
    }

    /**
     * Gets the value of the inValuationTypeGenericDetailShortDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInValuationTypeGenericDetailShortDescription() {
        return inValuationTypeGenericDetailShortDescription;
    }

    /**
     * Sets the value of the inValuationTypeGenericDetailShortDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInValuationTypeGenericDetailShortDescription(String value) {
        this.inValuationTypeGenericDetailShortDescription = value;
    }

    /**
     * Gets the value of the inValuationTypeGenericDetailParameterType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInValuationTypeGenericDetailParameterType() {
        return inValuationTypeGenericDetailParameterType;
    }

    /**
     * Sets the value of the inValuationTypeGenericDetailParameterType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInValuationTypeGenericDetailParameterType(String value) {
        this.inValuationTypeGenericDetailParameterType = value;
    }

    /**
     * Gets the value of the inValuationTypeGenericDetailEntryStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInValuationTypeGenericDetailEntryStatus() {
        return inValuationTypeGenericDetailEntryStatus;
    }

    /**
     * Sets the value of the inValuationTypeGenericDetailEntryStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInValuationTypeGenericDetailEntryStatus(String value) {
        this.inValuationTypeGenericDetailEntryStatus = value;
    }

    /**
     * Gets the value of the inValuationTypeGenericDetailTmstamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInValuationTypeGenericDetailTmstamp() {
        return inValuationTypeGenericDetailTmstamp;
    }

    /**
     * Sets the value of the inValuationTypeGenericDetailTmstamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInValuationTypeGenericDetailTmstamp(XMLGregorianCalendar value) {
        this.inValuationTypeGenericDetailTmstamp = value;
    }

    /**
     * Gets the value of the inValuationTypeGenericDetailDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInValuationTypeGenericDetailDescription() {
        return inValuationTypeGenericDetailDescription;
    }

    /**
     * Sets the value of the inValuationTypeGenericDetailDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInValuationTypeGenericDetailDescription(String value) {
        this.inValuationTypeGenericDetailDescription = value;
    }

    /**
     * Gets the value of the inInvCurrIdCurrencyIdCurrency property.
     * 
     */
    public int getInInvCurrIdCurrencyIdCurrency() {
        return inInvCurrIdCurrencyIdCurrency;
    }

    /**
     * Sets the value of the inInvCurrIdCurrencyIdCurrency property.
     * 
     */
    public void setInInvCurrIdCurrencyIdCurrency(int value) {
        this.inInvCurrIdCurrencyIdCurrency = value;
    }

    /**
     * Gets the value of the inInvCurrIdCurrencyShortDescr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInInvCurrIdCurrencyShortDescr() {
        return inInvCurrIdCurrencyShortDescr;
    }

    /**
     * Sets the value of the inInvCurrIdCurrencyShortDescr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInInvCurrIdCurrencyShortDescr(String value) {
        this.inInvCurrIdCurrencyShortDescr = value;
    }

    /**
     * Gets the value of the inEsrIncCurrCurrencyIdCurrency property.
     * 
     */
    public int getInEsrIncCurrCurrencyIdCurrency() {
        return inEsrIncCurrCurrencyIdCurrency;
    }

    /**
     * Sets the value of the inEsrIncCurrCurrencyIdCurrency property.
     * 
     */
    public void setInEsrIncCurrCurrencyIdCurrency(int value) {
        this.inEsrIncCurrCurrencyIdCurrency = value;
    }

    /**
     * Gets the value of the inEsrIncCurrCurrencyShortDescr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInEsrIncCurrCurrencyShortDescr() {
        return inEsrIncCurrCurrencyShortDescr;
    }

    /**
     * Sets the value of the inEsrIncCurrCurrencyShortDescr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInEsrIncCurrCurrencyShortDescr(String value) {
        this.inEsrIncCurrCurrencyShortDescr = value;
    }

    /**
     * Gets the value of the inSelAmnCurrCurrencyIdCurrency property.
     * 
     */
    public int getInSelAmnCurrCurrencyIdCurrency() {
        return inSelAmnCurrCurrencyIdCurrency;
    }

    /**
     * Sets the value of the inSelAmnCurrCurrencyIdCurrency property.
     * 
     */
    public void setInSelAmnCurrCurrencyIdCurrency(int value) {
        this.inSelAmnCurrCurrencyIdCurrency = value;
    }

    /**
     * Gets the value of the inSelAmnCurrCurrencyShortDescr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInSelAmnCurrCurrencyShortDescr() {
        return inSelAmnCurrCurrencyShortDescr;
    }

    /**
     * Sets the value of the inSelAmnCurrCurrencyShortDescr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInSelAmnCurrCurrencyShortDescr(String value) {
        this.inSelAmnCurrCurrencyShortDescr = value;
    }

    /**
     * Gets the value of the inMortAmnCurrCurrencyIdCurrency property.
     * 
     */
    public int getInMortAmnCurrCurrencyIdCurrency() {
        return inMortAmnCurrCurrencyIdCurrency;
    }

    /**
     * Sets the value of the inMortAmnCurrCurrencyIdCurrency property.
     * 
     */
    public void setInMortAmnCurrCurrencyIdCurrency(int value) {
        this.inMortAmnCurrCurrencyIdCurrency = value;
    }

    /**
     * Gets the value of the inMortAmnCurrCurrencyShortDescr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInMortAmnCurrCurrencyShortDescr() {
        return inMortAmnCurrCurrencyShortDescr;
    }

    /**
     * Sets the value of the inMortAmnCurrCurrencyShortDescr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInMortAmnCurrCurrencyShortDescr(String value) {
        this.inMortAmnCurrCurrencyShortDescr = value;
    }

    /**
     * Gets the value of the inInsurAmnCurrCurrencyIdCurrency property.
     * 
     */
    public int getInInsurAmnCurrCurrencyIdCurrency() {
        return inInsurAmnCurrCurrencyIdCurrency;
    }

    /**
     * Sets the value of the inInsurAmnCurrCurrencyIdCurrency property.
     * 
     */
    public void setInInsurAmnCurrCurrencyIdCurrency(int value) {
        this.inInsurAmnCurrCurrencyIdCurrency = value;
    }

    /**
     * Gets the value of the inInsurAmnCurrCurrencyShortDescr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInInsurAmnCurrCurrencyShortDescr() {
        return inInsurAmnCurrCurrencyShortDescr;
    }

    /**
     * Sets the value of the inInsurAmnCurrCurrencyShortDescr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInInsurAmnCurrCurrencyShortDescr(String value) {
        this.inInsurAmnCurrCurrencyShortDescr = value;
    }

    /**
     * Gets the value of the inObjAmnCurrCurrencyIdCurrency property.
     * 
     */
    public int getInObjAmnCurrCurrencyIdCurrency() {
        return inObjAmnCurrCurrencyIdCurrency;
    }

    /**
     * Sets the value of the inObjAmnCurrCurrencyIdCurrency property.
     * 
     */
    public void setInObjAmnCurrCurrencyIdCurrency(int value) {
        this.inObjAmnCurrCurrencyIdCurrency = value;
    }

    /**
     * Gets the value of the inObjAmnCurrCurrencyShortDescr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInObjAmnCurrCurrencyShortDescr() {
        return inObjAmnCurrCurrencyShortDescr;
    }

    /**
     * Sets the value of the inObjAmnCurrCurrencyShortDescr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInObjAmnCurrCurrencyShortDescr(String value) {
        this.inObjAmnCurrCurrencyShortDescr = value;
    }

    /**
     * Gets the value of the inNatureTitleGenericDetailSerialNum property.
     * 
     */
    public int getInNatureTitleGenericDetailSerialNum() {
        return inNatureTitleGenericDetailSerialNum;
    }

    /**
     * Sets the value of the inNatureTitleGenericDetailSerialNum property.
     * 
     */
    public void setInNatureTitleGenericDetailSerialNum(int value) {
        this.inNatureTitleGenericDetailSerialNum = value;
    }

    /**
     * Gets the value of the inNatureTitleGenericDetailShortDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInNatureTitleGenericDetailShortDescription() {
        return inNatureTitleGenericDetailShortDescription;
    }

    /**
     * Sets the value of the inNatureTitleGenericDetailShortDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInNatureTitleGenericDetailShortDescription(String value) {
        this.inNatureTitleGenericDetailShortDescription = value;
    }

    /**
     * Gets the value of the inNatureTitleGenericDetailParameterType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInNatureTitleGenericDetailParameterType() {
        return inNatureTitleGenericDetailParameterType;
    }

    /**
     * Sets the value of the inNatureTitleGenericDetailParameterType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInNatureTitleGenericDetailParameterType(String value) {
        this.inNatureTitleGenericDetailParameterType = value;
    }

    /**
     * Gets the value of the inNatureTitleGenericDetailDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInNatureTitleGenericDetailDescription() {
        return inNatureTitleGenericDetailDescription;
    }

    /**
     * Sets the value of the inNatureTitleGenericDetailDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInNatureTitleGenericDetailDescription(String value) {
        this.inNatureTitleGenericDetailDescription = value;
    }

    /**
     * Gets the value of the inValuerCommandIefSuppliedCommand property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInValuerCommandIefSuppliedCommand() {
        return inValuerCommandIefSuppliedCommand;
    }

    /**
     * Sets the value of the inValuerCommandIefSuppliedCommand property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInValuerCommandIefSuppliedCommand(String value) {
        this.inValuerCommandIefSuppliedCommand = value;
    }

    /**
     * Gets the value of the inPreviousRealEstateApprslInternalSn property.
     * 
     */
    public double getInPreviousRealEstateApprslInternalSn() {
        return inPreviousRealEstateApprslInternalSn;
    }

    /**
     * Sets the value of the inPreviousRealEstateApprslInternalSn property.
     * 
     */
    public void setInPreviousRealEstateApprslInternalSn(double value) {
        this.inPreviousRealEstateApprslInternalSn = value;
    }

    /**
     * Gets the value of the inPreviousRealEstateApprslEvaluationDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInPreviousRealEstateApprslEvaluationDt() {
        return inPreviousRealEstateApprslEvaluationDt;
    }

    /**
     * Sets the value of the inPreviousRealEstateApprslEvaluationDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInPreviousRealEstateApprslEvaluationDt(XMLGregorianCalendar value) {
        this.inPreviousRealEstateApprslEvaluationDt = value;
    }

    /**
     * Gets the value of the inValuerValuerValuerId property.
     * 
     */
    public int getInValuerValuerValuerId() {
        return inValuerValuerValuerId;
    }

    /**
     * Sets the value of the inValuerValuerValuerId property.
     * 
     */
    public void setInValuerValuerValuerId(int value) {
        this.inValuerValuerValuerId = value;
    }

    /**
     * Gets the value of the inAllValuersFlgIefSuppliedFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInAllValuersFlgIefSuppliedFlag() {
        return inAllValuersFlgIefSuppliedFlag;
    }

    /**
     * Sets the value of the inAllValuersFlgIefSuppliedFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInAllValuersFlgIefSuppliedFlag(String value) {
        this.inAllValuersFlgIefSuppliedFlag = value;
    }

    /**
     * Gets the value of the inGrpAuxSpace property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfMc2006VInGrpAuxSpaceItem }
     *     
     */
    public ArrayOfMc2006VInGrpAuxSpaceItem getInGrpAuxSpace() {
        return inGrpAuxSpace;
    }

    /**
     * Sets the value of the inGrpAuxSpace property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfMc2006VInGrpAuxSpaceItem }
     *     
     */
    public void setInGrpAuxSpace(ArrayOfMc2006VInGrpAuxSpaceItem value) {
        this.inGrpAuxSpace = value;
    }

    /**
     * Gets the value of the inGrpDefRealEst property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfMc2006VInGrpDefRealEstItem }
     *     
     */
    public ArrayOfMc2006VInGrpDefRealEstItem getInGrpDefRealEst() {
        return inGrpDefRealEst;
    }

    /**
     * Sets the value of the inGrpDefRealEst property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfMc2006VInGrpDefRealEstItem }
     *     
     */
    public void setInGrpDefRealEst(ArrayOfMc2006VInGrpDefRealEstItem value) {
        this.inGrpDefRealEst = value;
    }

    /**
     * Gets the value of the inGrpQualInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfMc2006VInGrpQualInfoItem }
     *     
     */
    public ArrayOfMc2006VInGrpQualInfoItem getInGrpQualInfo() {
        return inGrpQualInfo;
    }

    /**
     * Sets the value of the inGrpQualInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfMc2006VInGrpQualInfoItem }
     *     
     */
    public void setInGrpQualInfo(ArrayOfMc2006VInGrpQualInfoItem value) {
        this.inGrpQualInfo = value;
    }

    /**
     * Gets the value of the inReinsGenericDetailSerialNum property.
     * 
     */
    public int getInReinsGenericDetailSerialNum() {
        return inReinsGenericDetailSerialNum;
    }

    /**
     * Sets the value of the inReinsGenericDetailSerialNum property.
     * 
     */
    public void setInReinsGenericDetailSerialNum(int value) {
        this.inReinsGenericDetailSerialNum = value;
    }

    /**
     * Gets the value of the inReinsGenericDetailParameterType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInReinsGenericDetailParameterType() {
        return inReinsGenericDetailParameterType;
    }

    /**
     * Sets the value of the inReinsGenericDetailParameterType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInReinsGenericDetailParameterType(String value) {
        this.inReinsGenericDetailParameterType = value;
    }

    /**
     * Gets the value of the inReincGenericDetailSerialNum property.
     * 
     */
    public int getInReincGenericDetailSerialNum() {
        return inReincGenericDetailSerialNum;
    }

    /**
     * Sets the value of the inReincGenericDetailSerialNum property.
     * 
     */
    public void setInReincGenericDetailSerialNum(int value) {
        this.inReincGenericDetailSerialNum = value;
    }

    /**
     * Gets the value of the inReincGenericDetailParameterType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInReincGenericDetailParameterType() {
        return inReincGenericDetailParameterType;
    }

    /**
     * Sets the value of the inReincGenericDetailParameterType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInReincGenericDetailParameterType(String value) {
        this.inReincGenericDetailParameterType = value;
    }

    /**
     * Gets the value of the inCustRelapInsRealEstateApprslEvaluator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCustRelapInsRealEstateApprslEvaluator() {
        return inCustRelapInsRealEstateApprslEvaluator;
    }

    /**
     * Sets the value of the inCustRelapInsRealEstateApprslEvaluator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCustRelapInsRealEstateApprslEvaluator(String value) {
        this.inCustRelapInsRealEstateApprslEvaluator = value;
    }

    /**
     * Gets the value of the inCustRelapInsRealEstateApprslEvaluationDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInCustRelapInsRealEstateApprslEvaluationDt() {
        return inCustRelapInsRealEstateApprslEvaluationDt;
    }

    /**
     * Sets the value of the inCustRelapInsRealEstateApprslEvaluationDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInCustRelapInsRealEstateApprslEvaluationDt(XMLGregorianCalendar value) {
        this.inCustRelapInsRealEstateApprslEvaluationDt = value;
    }

    /**
     * Gets the value of the inCustRelapInsRealEstateApprslSellValue property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInCustRelapInsRealEstateApprslSellValue() {
        return inCustRelapInsRealEstateApprslSellValue;
    }

    /**
     * Sets the value of the inCustRelapInsRealEstateApprslSellValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInCustRelapInsRealEstateApprslSellValue(BigDecimal value) {
        this.inCustRelapInsRealEstateApprslSellValue = value;
    }

    /**
     * Gets the value of the inCustRelapInsRealEstateApprslPricePerMeter property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInCustRelapInsRealEstateApprslPricePerMeter() {
        return inCustRelapInsRealEstateApprslPricePerMeter;
    }

    /**
     * Sets the value of the inCustRelapInsRealEstateApprslPricePerMeter property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInCustRelapInsRealEstateApprslPricePerMeter(BigDecimal value) {
        this.inCustRelapInsRealEstateApprslPricePerMeter = value;
    }

    /**
     * Gets the value of the inCustRelapInsRealEstateApprslApraisalCmnts property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCustRelapInsRealEstateApprslApraisalCmnts() {
        return inCustRelapInsRealEstateApprslApraisalCmnts;
    }

    /**
     * Sets the value of the inCustRelapInsRealEstateApprslApraisalCmnts property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCustRelapInsRealEstateApprslApraisalCmnts(String value) {
        this.inCustRelapInsRealEstateApprslApraisalCmnts = value;
    }

    /**
     * Gets the value of the inCustRelapInsRealEstateApprslCommercValue property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInCustRelapInsRealEstateApprslCommercValue() {
        return inCustRelapInsRealEstateApprslCommercValue;
    }

    /**
     * Sets the value of the inCustRelapInsRealEstateApprslCommercValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInCustRelapInsRealEstateApprslCommercValue(BigDecimal value) {
        this.inCustRelapInsRealEstateApprslCommercValue = value;
    }

    /**
     * Gets the value of the inCustRelapInsRealEstateApprslMortgageValue property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInCustRelapInsRealEstateApprslMortgageValue() {
        return inCustRelapInsRealEstateApprslMortgageValue;
    }

    /**
     * Sets the value of the inCustRelapInsRealEstateApprslMortgageValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInCustRelapInsRealEstateApprslMortgageValue(BigDecimal value) {
        this.inCustRelapInsRealEstateApprslMortgageValue = value;
    }

    /**
     * Gets the value of the inCustRelapInsRealEstateApprslEstRentalIncAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInCustRelapInsRealEstateApprslEstRentalIncAmn() {
        return inCustRelapInsRealEstateApprslEstRentalIncAmn;
    }

    /**
     * Sets the value of the inCustRelapInsRealEstateApprslEstRentalIncAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInCustRelapInsRealEstateApprslEstRentalIncAmn(BigDecimal value) {
        this.inCustRelapInsRealEstateApprslEstRentalIncAmn = value;
    }

    /**
     * Gets the value of the inCustRelapInsRealEstateApprslInvestmentAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInCustRelapInsRealEstateApprslInvestmentAmn() {
        return inCustRelapInsRealEstateApprslInvestmentAmn;
    }

    /**
     * Sets the value of the inCustRelapInsRealEstateApprslInvestmentAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInCustRelapInsRealEstateApprslInvestmentAmn(BigDecimal value) {
        this.inCustRelapInsRealEstateApprslInvestmentAmn = value;
    }

    /**
     * Gets the value of the inCustRelapInsRealEstateApprslAdoptionValDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInCustRelapInsRealEstateApprslAdoptionValDt() {
        return inCustRelapInsRealEstateApprslAdoptionValDt;
    }

    /**
     * Sets the value of the inCustRelapInsRealEstateApprslAdoptionValDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInCustRelapInsRealEstateApprslAdoptionValDt(XMLGregorianCalendar value) {
        this.inCustRelapInsRealEstateApprslAdoptionValDt = value;
    }

    /**
     * Gets the value of the inCustRelapInsRealEstateApprslEstInsurAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInCustRelapInsRealEstateApprslEstInsurAmn() {
        return inCustRelapInsRealEstateApprslEstInsurAmn;
    }

    /**
     * Sets the value of the inCustRelapInsRealEstateApprslEstInsurAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInCustRelapInsRealEstateApprslEstInsurAmn(BigDecimal value) {
        this.inCustRelapInsRealEstateApprslEstInsurAmn = value;
    }

    /**
     * Gets the value of the inCustRelapInsRealEstateApprslObjectiveAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInCustRelapInsRealEstateApprslObjectiveAmn() {
        return inCustRelapInsRealEstateApprslObjectiveAmn;
    }

    /**
     * Sets the value of the inCustRelapInsRealEstateApprslObjectiveAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInCustRelapInsRealEstateApprslObjectiveAmn(BigDecimal value) {
        this.inCustRelapInsRealEstateApprslObjectiveAmn = value;
    }

    /**
     * Gets the value of the inCustRelapInsRealEstateApprslEvalluationInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCustRelapInsRealEstateApprslEvalluationInd() {
        return inCustRelapInsRealEstateApprslEvalluationInd;
    }

    /**
     * Sets the value of the inCustRelapInsRealEstateApprslEvalluationInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCustRelapInsRealEstateApprslEvalluationInd(String value) {
        this.inCustRelapInsRealEstateApprslEvalluationInd = value;
    }

    /**
     * Gets the value of the inCustRelapInsRealEstateApprslReevalFreq property.
     * 
     */
    public short getInCustRelapInsRealEstateApprslReevalFreq() {
        return inCustRelapInsRealEstateApprslReevalFreq;
    }

    /**
     * Sets the value of the inCustRelapInsRealEstateApprslReevalFreq property.
     * 
     */
    public void setInCustRelapInsRealEstateApprslReevalFreq(short value) {
        this.inCustRelapInsRealEstateApprslReevalFreq = value;
    }

    /**
     * Gets the value of the inCustRelInsRealEstateCommercialValAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInCustRelInsRealEstateCommercialValAmn() {
        return inCustRelInsRealEstateCommercialValAmn;
    }

    /**
     * Sets the value of the inCustRelInsRealEstateCommercialValAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInCustRelInsRealEstateCommercialValAmn(BigDecimal value) {
        this.inCustRelInsRealEstateCommercialValAmn = value;
    }

    /**
     * Gets the value of the inCustRelInsRealEstateEvalluationInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCustRelInsRealEstateEvalluationInd() {
        return inCustRelInsRealEstateEvalluationInd;
    }

    /**
     * Sets the value of the inCustRelInsRealEstateEvalluationInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCustRelInsRealEstateEvalluationInd(String value) {
        this.inCustRelInsRealEstateEvalluationInd = value;
    }

    /**
     * Gets the value of the inCustRelInsRealEstateInsuranceEd property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInCustRelInsRealEstateInsuranceEd() {
        return inCustRelInsRealEstateInsuranceEd;
    }

    /**
     * Sets the value of the inCustRelInsRealEstateInsuranceEd property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInCustRelInsRealEstateInsuranceEd(XMLGregorianCalendar value) {
        this.inCustRelInsRealEstateInsuranceEd = value;
    }

    /**
     * Gets the value of the inCustRelInsRealEstateInsuranceSd property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInCustRelInsRealEstateInsuranceSd() {
        return inCustRelInsRealEstateInsuranceSd;
    }

    /**
     * Sets the value of the inCustRelInsRealEstateInsuranceSd property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInCustRelInsRealEstateInsuranceSd(XMLGregorianCalendar value) {
        this.inCustRelInsRealEstateInsuranceSd = value;
    }

    /**
     * Gets the value of the inCustRelInsRealEstateReevalFreq property.
     * 
     */
    public short getInCustRelInsRealEstateReevalFreq() {
        return inCustRelInsRealEstateReevalFreq;
    }

    /**
     * Sets the value of the inCustRelInsRealEstateReevalFreq property.
     * 
     */
    public void setInCustRelInsRealEstateReevalFreq(short value) {
        this.inCustRelInsRealEstateReevalFreq = value;
    }

    /**
     * Gets the value of the inRealEstateApprslReevalFreq property.
     * 
     */
    public short getInRealEstateApprslReevalFreq() {
        return inRealEstateApprslReevalFreq;
    }

    /**
     * Sets the value of the inRealEstateApprslReevalFreq property.
     * 
     */
    public void setInRealEstateApprslReevalFreq(short value) {
        this.inRealEstateApprslReevalFreq = value;
    }

    /**
     * Gets the value of the inRealEstateApprslInternalSn property.
     * 
     */
    public double getInRealEstateApprslInternalSn() {
        return inRealEstateApprslInternalSn;
    }

    /**
     * Sets the value of the inRealEstateApprslInternalSn property.
     * 
     */
    public void setInRealEstateApprslInternalSn(double value) {
        this.inRealEstateApprslInternalSn = value;
    }

    /**
     * Gets the value of the inRealEstateApprslEvaluator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInRealEstateApprslEvaluator() {
        return inRealEstateApprslEvaluator;
    }

    /**
     * Sets the value of the inRealEstateApprslEvaluator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInRealEstateApprslEvaluator(String value) {
        this.inRealEstateApprslEvaluator = value;
    }

    /**
     * Gets the value of the inRealEstateApprslEvaluationDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInRealEstateApprslEvaluationDt() {
        return inRealEstateApprslEvaluationDt;
    }

    /**
     * Sets the value of the inRealEstateApprslEvaluationDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInRealEstateApprslEvaluationDt(XMLGregorianCalendar value) {
        this.inRealEstateApprslEvaluationDt = value;
    }

    /**
     * Gets the value of the inRealEstateApprslSellValue property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInRealEstateApprslSellValue() {
        return inRealEstateApprslSellValue;
    }

    /**
     * Sets the value of the inRealEstateApprslSellValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInRealEstateApprslSellValue(BigDecimal value) {
        this.inRealEstateApprslSellValue = value;
    }

    /**
     * Gets the value of the inRealEstateApprslPricePerMeter property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInRealEstateApprslPricePerMeter() {
        return inRealEstateApprslPricePerMeter;
    }

    /**
     * Sets the value of the inRealEstateApprslPricePerMeter property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInRealEstateApprslPricePerMeter(BigDecimal value) {
        this.inRealEstateApprslPricePerMeter = value;
    }

    /**
     * Gets the value of the inRealEstateApprslApraisalCmnts property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInRealEstateApprslApraisalCmnts() {
        return inRealEstateApprslApraisalCmnts;
    }

    /**
     * Sets the value of the inRealEstateApprslApraisalCmnts property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInRealEstateApprslApraisalCmnts(String value) {
        this.inRealEstateApprslApraisalCmnts = value;
    }

    /**
     * Gets the value of the inRealEstateApprslEntryStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInRealEstateApprslEntryStatus() {
        return inRealEstateApprslEntryStatus;
    }

    /**
     * Sets the value of the inRealEstateApprslEntryStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInRealEstateApprslEntryStatus(String value) {
        this.inRealEstateApprslEntryStatus = value;
    }

    /**
     * Gets the value of the inRealEstateApprslMortgageValue property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInRealEstateApprslMortgageValue() {
        return inRealEstateApprslMortgageValue;
    }

    /**
     * Sets the value of the inRealEstateApprslMortgageValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInRealEstateApprslMortgageValue(BigDecimal value) {
        this.inRealEstateApprslMortgageValue = value;
    }

    /**
     * Gets the value of the inRealEstateApprslEstRentalIncAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInRealEstateApprslEstRentalIncAmn() {
        return inRealEstateApprslEstRentalIncAmn;
    }

    /**
     * Sets the value of the inRealEstateApprslEstRentalIncAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInRealEstateApprslEstRentalIncAmn(BigDecimal value) {
        this.inRealEstateApprslEstRentalIncAmn = value;
    }

    /**
     * Gets the value of the inRealEstateApprslInvestmentAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInRealEstateApprslInvestmentAmn() {
        return inRealEstateApprslInvestmentAmn;
    }

    /**
     * Sets the value of the inRealEstateApprslInvestmentAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInRealEstateApprslInvestmentAmn(BigDecimal value) {
        this.inRealEstateApprslInvestmentAmn = value;
    }

    /**
     * Gets the value of the inRealEstateApprslAdoptionValDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInRealEstateApprslAdoptionValDt() {
        return inRealEstateApprslAdoptionValDt;
    }

    /**
     * Sets the value of the inRealEstateApprslAdoptionValDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInRealEstateApprslAdoptionValDt(XMLGregorianCalendar value) {
        this.inRealEstateApprslAdoptionValDt = value;
    }

    /**
     * Gets the value of the inRealEstateApprslEvalluationInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInRealEstateApprslEvalluationInd() {
        return inRealEstateApprslEvalluationInd;
    }

    /**
     * Sets the value of the inRealEstateApprslEvalluationInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInRealEstateApprslEvalluationInd(String value) {
        this.inRealEstateApprslEvalluationInd = value;
    }

    /**
     * Gets the value of the inRealEstateApprslCommercValue property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInRealEstateApprslCommercValue() {
        return inRealEstateApprslCommercValue;
    }

    /**
     * Sets the value of the inRealEstateApprslCommercValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInRealEstateApprslCommercValue(BigDecimal value) {
        this.inRealEstateApprslCommercValue = value;
    }

    /**
     * Gets the value of the inEvalCommandIefSuppliedCommand property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInEvalCommandIefSuppliedCommand() {
        return inEvalCommandIefSuppliedCommand;
    }

    /**
     * Sets the value of the inEvalCommandIefSuppliedCommand property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInEvalCommandIefSuppliedCommand(String value) {
        this.inEvalCommandIefSuppliedCommand = value;
    }

    /**
     * Gets the value of the inCustomerCustId property.
     * 
     */
    public int getInCustomerCustId() {
        return inCustomerCustId;
    }

    /**
     * Sets the value of the inCustomerCustId property.
     * 
     */
    public void setInCustomerCustId(int value) {
        this.inCustomerCustId = value;
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
     * Gets the value of the inCustomerCDigit property.
     * 
     */
    public short getInCustomerCDigit() {
        return inCustomerCDigit;
    }

    /**
     * Sets the value of the inCustomerCDigit property.
     * 
     */
    public void setInCustomerCDigit(short value) {
        this.inCustomerCDigit = value;
    }

    /**
     * Gets the value of the inCustomerCommandIefSuppliedCommand property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCustomerCommandIefSuppliedCommand() {
        return inCustomerCommandIefSuppliedCommand;
    }

    /**
     * Sets the value of the inCustomerCommandIefSuppliedCommand property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCustomerCommandIefSuppliedCommand(String value) {
        this.inCustomerCommandIefSuppliedCommand = value;
    }

    /**
     * Gets the value of the inCntryGenericDetailSerialNum property.
     * 
     */
    public int getInCntryGenericDetailSerialNum() {
        return inCntryGenericDetailSerialNum;
    }

    /**
     * Sets the value of the inCntryGenericDetailSerialNum property.
     * 
     */
    public void setInCntryGenericDetailSerialNum(int value) {
        this.inCntryGenericDetailSerialNum = value;
    }

    /**
     * Gets the value of the inCntryGenericDetailParameterType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCntryGenericDetailParameterType() {
        return inCntryGenericDetailParameterType;
    }

    /**
     * Sets the value of the inCntryGenericDetailParameterType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCntryGenericDetailParameterType(String value) {
        this.inCntryGenericDetailParameterType = value;
    }

    /**
     * Gets the value of the inCntryGenericDetailDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCntryGenericDetailDescription() {
        return inCntryGenericDetailDescription;
    }

    /**
     * Sets the value of the inCntryGenericDetailDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCntryGenericDetailDescription(String value) {
        this.inCntryGenericDetailDescription = value;
    }

    /**
     * Gets the value of the inAdddiGenericDetailSerialNum property.
     * 
     */
    public int getInAdddiGenericDetailSerialNum() {
        return inAdddiGenericDetailSerialNum;
    }

    /**
     * Sets the value of the inAdddiGenericDetailSerialNum property.
     * 
     */
    public void setInAdddiGenericDetailSerialNum(int value) {
        this.inAdddiGenericDetailSerialNum = value;
    }

    /**
     * Gets the value of the inAdddiGenericDetailParameterType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInAdddiGenericDetailParameterType() {
        return inAdddiGenericDetailParameterType;
    }

    /**
     * Sets the value of the inAdddiGenericDetailParameterType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInAdddiGenericDetailParameterType(String value) {
        this.inAdddiGenericDetailParameterType = value;
    }

    /**
     * Gets the value of the inAdddiGenericDetailDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInAdddiGenericDetailDescription() {
        return inAdddiGenericDetailDescription;
    }

    /**
     * Sets the value of the inAdddiGenericDetailDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInAdddiGenericDetailDescription(String value) {
        this.inAdddiGenericDetailDescription = value;
    }

    /**
     * Gets the value of the inRelocGenericDetailSerialNum property.
     * 
     */
    public int getInRelocGenericDetailSerialNum() {
        return inRelocGenericDetailSerialNum;
    }

    /**
     * Sets the value of the inRelocGenericDetailSerialNum property.
     * 
     */
    public void setInRelocGenericDetailSerialNum(int value) {
        this.inRelocGenericDetailSerialNum = value;
    }

    /**
     * Gets the value of the inRelocGenericDetailParameterType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInRelocGenericDetailParameterType() {
        return inRelocGenericDetailParameterType;
    }

    /**
     * Sets the value of the inRelocGenericDetailParameterType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInRelocGenericDetailParameterType(String value) {
        this.inRelocGenericDetailParameterType = value;
    }

    /**
     * Gets the value of the inRelocGenericDetailDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInRelocGenericDetailDescription() {
        return inRelocGenericDetailDescription;
    }

    /**
     * Sets the value of the inRelocGenericDetailDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInRelocGenericDetailDescription(String value) {
        this.inRelocGenericDetailDescription = value;
    }

    /**
     * Gets the value of the inRecbkGenericDetailSerialNum property.
     * 
     */
    public int getInRecbkGenericDetailSerialNum() {
        return inRecbkGenericDetailSerialNum;
    }

    /**
     * Sets the value of the inRecbkGenericDetailSerialNum property.
     * 
     */
    public void setInRecbkGenericDetailSerialNum(int value) {
        this.inRecbkGenericDetailSerialNum = value;
    }

    /**
     * Gets the value of the inRecbkGenericDetailParameterType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInRecbkGenericDetailParameterType() {
        return inRecbkGenericDetailParameterType;
    }

    /**
     * Sets the value of the inRecbkGenericDetailParameterType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInRecbkGenericDetailParameterType(String value) {
        this.inRecbkGenericDetailParameterType = value;
    }

    /**
     * Gets the value of the inRecbkGenericDetailDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInRecbkGenericDetailDescription() {
        return inRecbkGenericDetailDescription;
    }

    /**
     * Sets the value of the inRecbkGenericDetailDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInRecbkGenericDetailDescription(String value) {
        this.inRecbkGenericDetailDescription = value;
    }

    /**
     * Gets the value of the inRecatGenericDetailSerialNum property.
     * 
     */
    public int getInRecatGenericDetailSerialNum() {
        return inRecatGenericDetailSerialNum;
    }

    /**
     * Sets the value of the inRecatGenericDetailSerialNum property.
     * 
     */
    public void setInRecatGenericDetailSerialNum(int value) {
        this.inRecatGenericDetailSerialNum = value;
    }

    /**
     * Gets the value of the inRecatGenericDetailParameterType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInRecatGenericDetailParameterType() {
        return inRecatGenericDetailParameterType;
    }

    /**
     * Sets the value of the inRecatGenericDetailParameterType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInRecatGenericDetailParameterType(String value) {
        this.inRecatGenericDetailParameterType = value;
    }

    /**
     * Gets the value of the inRecatGenericDetailDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInRecatGenericDetailDescription() {
        return inRecatGenericDetailDescription;
    }

    /**
     * Sets the value of the inRecatGenericDetailDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInRecatGenericDetailDescription(String value) {
        this.inRecatGenericDetailDescription = value;
    }

    /**
     * Gets the value of the inRetypGenericDetailSerialNum property.
     * 
     */
    public int getInRetypGenericDetailSerialNum() {
        return inRetypGenericDetailSerialNum;
    }

    /**
     * Sets the value of the inRetypGenericDetailSerialNum property.
     * 
     */
    public void setInRetypGenericDetailSerialNum(int value) {
        this.inRetypGenericDetailSerialNum = value;
    }

    /**
     * Gets the value of the inRetypGenericDetailParameterType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInRetypGenericDetailParameterType() {
        return inRetypGenericDetailParameterType;
    }

    /**
     * Sets the value of the inRetypGenericDetailParameterType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInRetypGenericDetailParameterType(String value) {
        this.inRetypGenericDetailParameterType = value;
    }

    /**
     * Gets the value of the inRetypGenericDetailDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInRetypGenericDetailDescription() {
        return inRetypGenericDetailDescription;
    }

    /**
     * Sets the value of the inRetypGenericDetailDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInRetypGenericDetailDescription(String value) {
        this.inRetypGenericDetailDescription = value;
    }

    /**
     * Gets the value of the inManipulateRealEstateRealEstateDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInManipulateRealEstateRealEstateDesc() {
        return inManipulateRealEstateRealEstateDesc;
    }

    /**
     * Sets the value of the inManipulateRealEstateRealEstateDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInManipulateRealEstateRealEstateDesc(String value) {
        this.inManipulateRealEstateRealEstateDesc = value;
    }

    /**
     * Gets the value of the inManipulateRealEstateRealEstateType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInManipulateRealEstateRealEstateType() {
        return inManipulateRealEstateRealEstateType;
    }

    /**
     * Sets the value of the inManipulateRealEstateRealEstateType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInManipulateRealEstateRealEstateType(String value) {
        this.inManipulateRealEstateRealEstateType = value;
    }

    /**
     * Gets the value of the inManipulateRealEstateOwnershipInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInManipulateRealEstateOwnershipInd() {
        return inManipulateRealEstateOwnershipInd;
    }

    /**
     * Sets the value of the inManipulateRealEstateOwnershipInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInManipulateRealEstateOwnershipInd(String value) {
        this.inManipulateRealEstateOwnershipInd = value;
    }

    /**
     * Gets the value of the inManipulateRealEstateRealEstateCat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInManipulateRealEstateRealEstateCat() {
        return inManipulateRealEstateRealEstateCat;
    }

    /**
     * Sets the value of the inManipulateRealEstateRealEstateCat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInManipulateRealEstateRealEstateCat(String value) {
        this.inManipulateRealEstateRealEstateCat = value;
    }

    /**
     * Gets the value of the inManipulateRealEstateMainArea property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInManipulateRealEstateMainArea() {
        return inManipulateRealEstateMainArea;
    }

    /**
     * Sets the value of the inManipulateRealEstateMainArea property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInManipulateRealEstateMainArea(BigDecimal value) {
        this.inManipulateRealEstateMainArea = value;
    }

    /**
     * Gets the value of the inManipulateRealEstateAdditionalArea property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInManipulateRealEstateAdditionalArea() {
        return inManipulateRealEstateAdditionalArea;
    }

    /**
     * Sets the value of the inManipulateRealEstateAdditionalArea property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInManipulateRealEstateAdditionalArea(BigDecimal value) {
        this.inManipulateRealEstateAdditionalArea = value;
    }

    /**
     * Gets the value of the inManipulateRealEstateApartmentNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInManipulateRealEstateApartmentNum() {
        return inManipulateRealEstateApartmentNum;
    }

    /**
     * Sets the value of the inManipulateRealEstateApartmentNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInManipulateRealEstateApartmentNum(String value) {
        this.inManipulateRealEstateApartmentNum = value;
    }

    /**
     * Gets the value of the inManipulateRealEstateConstructionYear property.
     * 
     */
    public short getInManipulateRealEstateConstructionYear() {
        return inManipulateRealEstateConstructionYear;
    }

    /**
     * Sets the value of the inManipulateRealEstateConstructionYear property.
     * 
     */
    public void setInManipulateRealEstateConstructionYear(short value) {
        this.inManipulateRealEstateConstructionYear = value;
    }

    /**
     * Gets the value of the inManipulateRealEstateFrontageInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInManipulateRealEstateFrontageInd() {
        return inManipulateRealEstateFrontageInd;
    }

    /**
     * Sets the value of the inManipulateRealEstateFrontageInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInManipulateRealEstateFrontageInd(String value) {
        this.inManipulateRealEstateFrontageInd = value;
    }

    /**
     * Gets the value of the inManipulateRealEstateInsuranceDescr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInManipulateRealEstateInsuranceDescr() {
        return inManipulateRealEstateInsuranceDescr;
    }

    /**
     * Sets the value of the inManipulateRealEstateInsuranceDescr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInManipulateRealEstateInsuranceDescr(String value) {
        this.inManipulateRealEstateInsuranceDescr = value;
    }

    /**
     * Gets the value of the inManipulateRealEstateInsuranceAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInManipulateRealEstateInsuranceAmn() {
        return inManipulateRealEstateInsuranceAmn;
    }

    /**
     * Sets the value of the inManipulateRealEstateInsuranceAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInManipulateRealEstateInsuranceAmn(BigDecimal value) {
        this.inManipulateRealEstateInsuranceAmn = value;
    }

    /**
     * Gets the value of the inManipulateRealEstateInsOriginalAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInManipulateRealEstateInsOriginalAmn() {
        return inManipulateRealEstateInsOriginalAmn;
    }

    /**
     * Sets the value of the inManipulateRealEstateInsOriginalAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInManipulateRealEstateInsOriginalAmn(BigDecimal value) {
        this.inManipulateRealEstateInsOriginalAmn = value;
    }

    /**
     * Gets the value of the inManipulateRealEstateAgreementValue property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInManipulateRealEstateAgreementValue() {
        return inManipulateRealEstateAgreementValue;
    }

    /**
     * Sets the value of the inManipulateRealEstateAgreementValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInManipulateRealEstateAgreementValue(BigDecimal value) {
        this.inManipulateRealEstateAgreementValue = value;
    }

    /**
     * Gets the value of the inTotalSiteAreaGenericDetailSerialNum property.
     * 
     */
    public int getInTotalSiteAreaGenericDetailSerialNum() {
        return inTotalSiteAreaGenericDetailSerialNum;
    }

    /**
     * Sets the value of the inTotalSiteAreaGenericDetailSerialNum property.
     * 
     */
    public void setInTotalSiteAreaGenericDetailSerialNum(int value) {
        this.inTotalSiteAreaGenericDetailSerialNum = value;
    }

    /**
     * Gets the value of the inTotalSiteAreaGenericDetailShortDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInTotalSiteAreaGenericDetailShortDescription() {
        return inTotalSiteAreaGenericDetailShortDescription;
    }

    /**
     * Sets the value of the inTotalSiteAreaGenericDetailShortDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInTotalSiteAreaGenericDetailShortDescription(String value) {
        this.inTotalSiteAreaGenericDetailShortDescription = value;
    }

    /**
     * Gets the value of the inTotalSiteAreaGenericDetailParameterType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInTotalSiteAreaGenericDetailParameterType() {
        return inTotalSiteAreaGenericDetailParameterType;
    }

    /**
     * Sets the value of the inTotalSiteAreaGenericDetailParameterType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInTotalSiteAreaGenericDetailParameterType(String value) {
        this.inTotalSiteAreaGenericDetailParameterType = value;
    }

    /**
     * Gets the value of the inTotalSiteAreaGenericDetailDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInTotalSiteAreaGenericDetailDescription() {
        return inTotalSiteAreaGenericDetailDescription;
    }

    /**
     * Sets the value of the inTotalSiteAreaGenericDetailDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInTotalSiteAreaGenericDetailDescription(String value) {
        this.inTotalSiteAreaGenericDetailDescription = value;
    }

    /**
     * Gets the value of the inMainAreaGenericDetailSerialNum property.
     * 
     */
    public int getInMainAreaGenericDetailSerialNum() {
        return inMainAreaGenericDetailSerialNum;
    }

    /**
     * Sets the value of the inMainAreaGenericDetailSerialNum property.
     * 
     */
    public void setInMainAreaGenericDetailSerialNum(int value) {
        this.inMainAreaGenericDetailSerialNum = value;
    }

    /**
     * Gets the value of the inMainAreaGenericDetailShortDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInMainAreaGenericDetailShortDescription() {
        return inMainAreaGenericDetailShortDescription;
    }

    /**
     * Sets the value of the inMainAreaGenericDetailShortDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInMainAreaGenericDetailShortDescription(String value) {
        this.inMainAreaGenericDetailShortDescription = value;
    }

    /**
     * Gets the value of the inMainAreaGenericDetailParameterType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInMainAreaGenericDetailParameterType() {
        return inMainAreaGenericDetailParameterType;
    }

    /**
     * Sets the value of the inMainAreaGenericDetailParameterType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInMainAreaGenericDetailParameterType(String value) {
        this.inMainAreaGenericDetailParameterType = value;
    }

    /**
     * Gets the value of the inMainAreaGenericDetailDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInMainAreaGenericDetailDescription() {
        return inMainAreaGenericDetailDescription;
    }

    /**
     * Sets the value of the inMainAreaGenericDetailDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInMainAreaGenericDetailDescription(String value) {
        this.inMainAreaGenericDetailDescription = value;
    }

    /**
     * Gets the value of the inOutdoorAtticAreaGenericDetailSerialNum property.
     * 
     */
    public int getInOutdoorAtticAreaGenericDetailSerialNum() {
        return inOutdoorAtticAreaGenericDetailSerialNum;
    }

    /**
     * Sets the value of the inOutdoorAtticAreaGenericDetailSerialNum property.
     * 
     */
    public void setInOutdoorAtticAreaGenericDetailSerialNum(int value) {
        this.inOutdoorAtticAreaGenericDetailSerialNum = value;
    }

    /**
     * Gets the value of the inOutdoorAtticAreaGenericDetailShortDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInOutdoorAtticAreaGenericDetailShortDescription() {
        return inOutdoorAtticAreaGenericDetailShortDescription;
    }

    /**
     * Sets the value of the inOutdoorAtticAreaGenericDetailShortDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInOutdoorAtticAreaGenericDetailShortDescription(String value) {
        this.inOutdoorAtticAreaGenericDetailShortDescription = value;
    }

    /**
     * Gets the value of the inOutdoorAtticAreaGenericDetailParameterType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInOutdoorAtticAreaGenericDetailParameterType() {
        return inOutdoorAtticAreaGenericDetailParameterType;
    }

    /**
     * Sets the value of the inOutdoorAtticAreaGenericDetailParameterType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInOutdoorAtticAreaGenericDetailParameterType(String value) {
        this.inOutdoorAtticAreaGenericDetailParameterType = value;
    }

    /**
     * Gets the value of the inOutdoorAtticAreaGenericDetailDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInOutdoorAtticAreaGenericDetailDescription() {
        return inOutdoorAtticAreaGenericDetailDescription;
    }

    /**
     * Sets the value of the inOutdoorAtticAreaGenericDetailDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInOutdoorAtticAreaGenericDetailDescription(String value) {
        this.inOutdoorAtticAreaGenericDetailDescription = value;
    }

    /**
     * Gets the value of the inAdditionalAreaGenericDetailSerialNum property.
     * 
     */
    public int getInAdditionalAreaGenericDetailSerialNum() {
        return inAdditionalAreaGenericDetailSerialNum;
    }

    /**
     * Sets the value of the inAdditionalAreaGenericDetailSerialNum property.
     * 
     */
    public void setInAdditionalAreaGenericDetailSerialNum(int value) {
        this.inAdditionalAreaGenericDetailSerialNum = value;
    }

    /**
     * Gets the value of the inAdditionalAreaGenericDetailShortDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInAdditionalAreaGenericDetailShortDescription() {
        return inAdditionalAreaGenericDetailShortDescription;
    }

    /**
     * Sets the value of the inAdditionalAreaGenericDetailShortDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInAdditionalAreaGenericDetailShortDescription(String value) {
        this.inAdditionalAreaGenericDetailShortDescription = value;
    }

    /**
     * Gets the value of the inAdditionalAreaGenericDetailParameterType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInAdditionalAreaGenericDetailParameterType() {
        return inAdditionalAreaGenericDetailParameterType;
    }

    /**
     * Sets the value of the inAdditionalAreaGenericDetailParameterType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInAdditionalAreaGenericDetailParameterType(String value) {
        this.inAdditionalAreaGenericDetailParameterType = value;
    }

    /**
     * Gets the value of the inAdditionalAreaGenericDetailDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInAdditionalAreaGenericDetailDescription() {
        return inAdditionalAreaGenericDetailDescription;
    }

    /**
     * Sets the value of the inAdditionalAreaGenericDetailDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInAdditionalAreaGenericDetailDescription(String value) {
        this.inAdditionalAreaGenericDetailDescription = value;
    }

    /**
     * Gets the value of the inMortgageAreaGenericDetailSerialNum property.
     * 
     */
    public int getInMortgageAreaGenericDetailSerialNum() {
        return inMortgageAreaGenericDetailSerialNum;
    }

    /**
     * Sets the value of the inMortgageAreaGenericDetailSerialNum property.
     * 
     */
    public void setInMortgageAreaGenericDetailSerialNum(int value) {
        this.inMortgageAreaGenericDetailSerialNum = value;
    }

    /**
     * Gets the value of the inMortgageAreaGenericDetailShortDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInMortgageAreaGenericDetailShortDescription() {
        return inMortgageAreaGenericDetailShortDescription;
    }

    /**
     * Sets the value of the inMortgageAreaGenericDetailShortDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInMortgageAreaGenericDetailShortDescription(String value) {
        this.inMortgageAreaGenericDetailShortDescription = value;
    }

    /**
     * Gets the value of the inMortgageAreaGenericDetailParameterType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInMortgageAreaGenericDetailParameterType() {
        return inMortgageAreaGenericDetailParameterType;
    }

    /**
     * Sets the value of the inMortgageAreaGenericDetailParameterType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInMortgageAreaGenericDetailParameterType(String value) {
        this.inMortgageAreaGenericDetailParameterType = value;
    }

    /**
     * Gets the value of the inMortgageAreaGenericDetailDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInMortgageAreaGenericDetailDescription() {
        return inMortgageAreaGenericDetailDescription;
    }

    /**
     * Sets the value of the inMortgageAreaGenericDetailDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInMortgageAreaGenericDetailDescription(String value) {
        this.inMortgageAreaGenericDetailDescription = value;
    }

    /**
     * Gets the value of the inTotStoreAreaGenericDetailSerialNum property.
     * 
     */
    public int getInTotStoreAreaGenericDetailSerialNum() {
        return inTotStoreAreaGenericDetailSerialNum;
    }

    /**
     * Sets the value of the inTotStoreAreaGenericDetailSerialNum property.
     * 
     */
    public void setInTotStoreAreaGenericDetailSerialNum(int value) {
        this.inTotStoreAreaGenericDetailSerialNum = value;
    }

    /**
     * Gets the value of the inTotStoreAreaGenericDetailShortDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInTotStoreAreaGenericDetailShortDescription() {
        return inTotStoreAreaGenericDetailShortDescription;
    }

    /**
     * Sets the value of the inTotStoreAreaGenericDetailShortDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInTotStoreAreaGenericDetailShortDescription(String value) {
        this.inTotStoreAreaGenericDetailShortDescription = value;
    }

    /**
     * Gets the value of the inTotStoreAreaGenericDetailParameterType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInTotStoreAreaGenericDetailParameterType() {
        return inTotStoreAreaGenericDetailParameterType;
    }

    /**
     * Sets the value of the inTotStoreAreaGenericDetailParameterType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInTotStoreAreaGenericDetailParameterType(String value) {
        this.inTotStoreAreaGenericDetailParameterType = value;
    }

    /**
     * Gets the value of the inTotStoreAreaGenericDetailDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInTotStoreAreaGenericDetailDescription() {
        return inTotStoreAreaGenericDetailDescription;
    }

    /**
     * Sets the value of the inTotStoreAreaGenericDetailDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInTotStoreAreaGenericDetailDescription(String value) {
        this.inTotStoreAreaGenericDetailDescription = value;
    }

    /**
     * Gets the value of the inTotParkAreaGenericDetailSerialNum property.
     * 
     */
    public int getInTotParkAreaGenericDetailSerialNum() {
        return inTotParkAreaGenericDetailSerialNum;
    }

    /**
     * Sets the value of the inTotParkAreaGenericDetailSerialNum property.
     * 
     */
    public void setInTotParkAreaGenericDetailSerialNum(int value) {
        this.inTotParkAreaGenericDetailSerialNum = value;
    }

    /**
     * Gets the value of the inTotParkAreaGenericDetailShortDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInTotParkAreaGenericDetailShortDescription() {
        return inTotParkAreaGenericDetailShortDescription;
    }

    /**
     * Sets the value of the inTotParkAreaGenericDetailShortDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInTotParkAreaGenericDetailShortDescription(String value) {
        this.inTotParkAreaGenericDetailShortDescription = value;
    }

    /**
     * Gets the value of the inTotParkAreaGenericDetailParameterType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInTotParkAreaGenericDetailParameterType() {
        return inTotParkAreaGenericDetailParameterType;
    }

    /**
     * Sets the value of the inTotParkAreaGenericDetailParameterType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInTotParkAreaGenericDetailParameterType(String value) {
        this.inTotParkAreaGenericDetailParameterType = value;
    }

    /**
     * Gets the value of the inTotParkAreaGenericDetailDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInTotParkAreaGenericDetailDescription() {
        return inTotParkAreaGenericDetailDescription;
    }

    /**
     * Sets the value of the inTotParkAreaGenericDetailDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInTotParkAreaGenericDetailDescription(String value) {
        this.inTotParkAreaGenericDetailDescription = value;
    }

    /**
     * Gets the value of the inManipulateRealEstatePlotNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInManipulateRealEstatePlotNumber() {
        return inManipulateRealEstatePlotNumber;
    }

    /**
     * Sets the value of the inManipulateRealEstatePlotNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInManipulateRealEstatePlotNumber(String value) {
        this.inManipulateRealEstatePlotNumber = value;
    }

    /**
     * Gets the value of the inManipulateRealEstateBlockNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInManipulateRealEstateBlockNumber() {
        return inManipulateRealEstateBlockNumber;
    }

    /**
     * Sets the value of the inManipulateRealEstateBlockNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInManipulateRealEstateBlockNumber(String value) {
        this.inManipulateRealEstateBlockNumber = value;
    }

    /**
     * Gets the value of the inManipulateRealEstateCondPlanNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInManipulateRealEstateCondPlanNo() {
        return inManipulateRealEstateCondPlanNo;
    }

    /**
     * Sets the value of the inManipulateRealEstateCondPlanNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInManipulateRealEstateCondPlanNo(String value) {
        this.inManipulateRealEstateCondPlanNo = value;
    }

    /**
     * Gets the value of the inManipulateRealEstateInstrumentNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInManipulateRealEstateInstrumentNo() {
        return inManipulateRealEstateInstrumentNo;
    }

    /**
     * Sets the value of the inManipulateRealEstateInstrumentNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInManipulateRealEstateInstrumentNo(String value) {
        this.inManipulateRealEstateInstrumentNo = value;
    }

    /**
     * Gets the value of the inManipulateRealEstateMarketability property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInManipulateRealEstateMarketability() {
        return inManipulateRealEstateMarketability;
    }

    /**
     * Sets the value of the inManipulateRealEstateMarketability property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInManipulateRealEstateMarketability(String value) {
        this.inManipulateRealEstateMarketability = value;
    }

    /**
     * Gets the value of the inManipulateRealEstateGpsCoord property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInManipulateRealEstateGpsCoord() {
        return inManipulateRealEstateGpsCoord;
    }

    /**
     * Sets the value of the inManipulateRealEstateGpsCoord property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInManipulateRealEstateGpsCoord(String value) {
        this.inManipulateRealEstateGpsCoord = value;
    }

    /**
     * Gets the value of the inManipulateRealEstateCopyOfTitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInManipulateRealEstateCopyOfTitle() {
        return inManipulateRealEstateCopyOfTitle;
    }

    /**
     * Sets the value of the inManipulateRealEstateCopyOfTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInManipulateRealEstateCopyOfTitle(String value) {
        this.inManipulateRealEstateCopyOfTitle = value;
    }

    /**
     * Gets the value of the inManipulateRealEstateTitleSubmDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInManipulateRealEstateTitleSubmDt() {
        return inManipulateRealEstateTitleSubmDt;
    }

    /**
     * Sets the value of the inManipulateRealEstateTitleSubmDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInManipulateRealEstateTitleSubmDt(XMLGregorianCalendar value) {
        this.inManipulateRealEstateTitleSubmDt = value;
    }

    /**
     * Gets the value of the inManipulateRealEstateTitleReturnDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInManipulateRealEstateTitleReturnDt() {
        return inManipulateRealEstateTitleReturnDt;
    }

    /**
     * Sets the value of the inManipulateRealEstateTitleReturnDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInManipulateRealEstateTitleReturnDt(XMLGregorianCalendar value) {
        this.inManipulateRealEstateTitleReturnDt = value;
    }

    /**
     * Gets the value of the inManipulateRealEstateInsurPolicyNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInManipulateRealEstateInsurPolicyNo() {
        return inManipulateRealEstateInsurPolicyNo;
    }

    /**
     * Sets the value of the inManipulateRealEstateInsurPolicyNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInManipulateRealEstateInsurPolicyNo(String value) {
        this.inManipulateRealEstateInsurPolicyNo = value;
    }

    /**
     * Gets the value of the inAddrSnCustAddrParrelDSn property.
     * 
     */
    public int getInAddrSnCustAddrParrelDSn() {
        return inAddrSnCustAddrParrelDSn;
    }

    /**
     * Sets the value of the inAddrSnCustAddrParrelDSn property.
     * 
     */
    public void setInAddrSnCustAddrParrelDSn(int value) {
        this.inAddrSnCustAddrParrelDSn = value;
    }

    /**
     * Gets the value of the inAddrSnCustAddrParrelDCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInAddrSnCustAddrParrelDCode() {
        return inAddrSnCustAddrParrelDCode;
    }

    /**
     * Sets the value of the inAddrSnCustAddrParrelDCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInAddrSnCustAddrParrelDCode(String value) {
        this.inAddrSnCustAddrParrelDCode = value;
    }

    /**
     * Gets the value of the inRealEstateCustRegistProprietor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInRealEstateCustRegistProprietor() {
        return inRealEstateCustRegistProprietor;
    }

    /**
     * Sets the value of the inRealEstateCustRegistProprietor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInRealEstateCustRegistProprietor(String value) {
        this.inRealEstateCustRegistProprietor = value;
    }

    /**
     * Gets the value of the inManipulateRealEstateFolio property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInManipulateRealEstateFolio() {
        return inManipulateRealEstateFolio;
    }

    /**
     * Sets the value of the inManipulateRealEstateFolio property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInManipulateRealEstateFolio(String value) {
        this.inManipulateRealEstateFolio = value;
    }

    /**
     * Gets the value of the inManipulateRealEstateInsurAnnualAmnt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInManipulateRealEstateInsurAnnualAmnt() {
        return inManipulateRealEstateInsurAnnualAmnt;
    }

    /**
     * Sets the value of the inManipulateRealEstateInsurAnnualAmnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInManipulateRealEstateInsurAnnualAmnt(BigDecimal value) {
        this.inManipulateRealEstateInsurAnnualAmnt = value;
    }

    /**
     * Gets the value of the inTitleAddrSnCustAddrParrelDSn property.
     * 
     */
    public int getInTitleAddrSnCustAddrParrelDSn() {
        return inTitleAddrSnCustAddrParrelDSn;
    }

    /**
     * Sets the value of the inTitleAddrSnCustAddrParrelDSn property.
     * 
     */
    public void setInTitleAddrSnCustAddrParrelDSn(int value) {
        this.inTitleAddrSnCustAddrParrelDSn = value;
    }

    /**
     * Gets the value of the inTitleAddrSnCustAddrParrelDCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInTitleAddrSnCustAddrParrelDCode() {
        return inTitleAddrSnCustAddrParrelDCode;
    }

    /**
     * Sets the value of the inTitleAddrSnCustAddrParrelDCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInTitleAddrSnCustAddrParrelDCode(String value) {
        this.inTitleAddrSnCustAddrParrelDCode = value;
    }

}
