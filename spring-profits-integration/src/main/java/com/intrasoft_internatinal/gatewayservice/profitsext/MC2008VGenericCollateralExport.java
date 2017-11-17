
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for MC2008VGenericCollateralExport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MC2008VGenericCollateralExport">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}BaseExport">
 *       &lt;sequence>
 *         &lt;element name="OutAccountBalanceIefSuppliedAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutAccountCurrencyShortDescr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutAgrUnitCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutAgreementAgrMembershipSn" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutAgreementAgrSn" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutAgreementAgrYear" type="{http://www.w3.org/2001/XMLSchema}short"/>
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
 *         &lt;element name="OutCustomerCustId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutCustomerFirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustomerSurname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutInsertBankemployeeLastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutInsertUnitUnitName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutLoanAccUnitCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutLoanAccUnitEntryStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutLoanAccUnitUnitName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutLoanAccountAccCd" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutLoanAccountAccSn" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutLoanAccountAccType" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutLoanProductDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutLoanProductIdProduct" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutSelectedCollateralTableAccountCd1" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutSelectedCollateralTableAccountCd2" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutSelectedCollateralTableAmount1" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutSelectedCollateralTableAmount10" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutSelectedCollateralTableAmount1841" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutSelectedCollateralTableAmount1842" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutSelectedCollateralTableAmount1843" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutSelectedCollateralTableAmount2" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutSelectedCollateralTableAmount3" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutSelectedCollateralTableAmount4" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutSelectedCollateralTableAmount5" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutSelectedCollateralTableAmount6" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutSelectedCollateralTableAmount7" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutSelectedCollateralTableAmount8" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutSelectedCollateralTableAmount9" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutSelectedCollateralTableBondCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSelectedCollateralTableCDigit1" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutSelectedCollateralTableCDigit2" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutSelectedCollateralTableCollaborationBank" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutSelectedCollateralTableCollateralUsage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSelectedCollateralTableCurrencyId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutSelectedCollateralTableCustId1" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutSelectedCollateralTableCustId2" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutSelectedCollateralTableDate1" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutSelectedCollateralTableDate10" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutSelectedCollateralTableDate2" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutSelectedCollateralTableDate3" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutSelectedCollateralTableDate4" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutSelectedCollateralTableDate5" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutSelectedCollateralTableDate6" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutSelectedCollateralTableDate7" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutSelectedCollateralTableDate8" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutSelectedCollateralTableDate9" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutSelectedCollateralTableDescr1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSelectedCollateralTableDescr10" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSelectedCollateralTableDescr11" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSelectedCollateralTableDescr12" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSelectedCollateralTableDescr13" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSelectedCollateralTableDescr14" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSelectedCollateralTableDescr15" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSelectedCollateralTableDescr16" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSelectedCollateralTableDescr17" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSelectedCollateralTableDescr18" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSelectedCollateralTableDescr19" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSelectedCollateralTableDescr2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSelectedCollateralTableDescr20" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSelectedCollateralTableDescr3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSelectedCollateralTableDescr4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSelectedCollateralTableDescr5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSelectedCollateralTableDescr6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSelectedCollateralTableDescr7" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSelectedCollateralTableDescr8" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSelectedCollateralTableDescr9" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSelectedCollateralTableEntryStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSelectedCollateralTableFlag1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSelectedCollateralTableFlag10" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSelectedCollateralTableFlag2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSelectedCollateralTableFlag3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSelectedCollateralTableFlag4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSelectedCollateralTableFlag5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSelectedCollateralTableFlag6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSelectedCollateralTableFlag7" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSelectedCollateralTableFlag8" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSelectedCollateralTableFlag9" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSelectedCollateralTableGdParType1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSelectedCollateralTableGdParType2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSelectedCollateralTableGdParType3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSelectedCollateralTableGdParType4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSelectedCollateralTableGdParType5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSelectedCollateralTableGdParType6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSelectedCollateralTableGdSerialNum1" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutSelectedCollateralTableGdSerialNum2" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutSelectedCollateralTableGdSerialNum3" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutSelectedCollateralTableGdSerialNum4" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutSelectedCollateralTableGdSerialNum5" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutSelectedCollateralTableGdSerialNum6" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutSelectedCollateralTableInsertionDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutSelectedCollateralTableInsertionUsr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSelectedCollateralTableInternalSn" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OutSelectedCollateralTableLagreDescr2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSelectedCollateralTableLargeDescr1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSelectedCollateralTableLargeDescr3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSelectedCollateralTableModificationDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutSelectedCollateralTableModificationUsr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSelectedCollateralTableNumber1" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OutSelectedCollateralTableNumber10" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OutSelectedCollateralTableNumber2" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OutSelectedCollateralTableNumber3" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OutSelectedCollateralTableNumber4" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OutSelectedCollateralTableNumber5" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OutSelectedCollateralTableNumber6" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OutSelectedCollateralTableNumber7" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OutSelectedCollateralTableNumber8" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OutSelectedCollateralTableNumber9" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OutSelectedCollateralTablePrftSystem1" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutSelectedCollateralTablePrftSystem2" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutSelectedCollateralTableProfitsAccount1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSelectedCollateralTableProfitsAccount2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSelectedCollateralTableRealEstateId" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OutSelectedCollateralTableRecordDescr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSelectedCollateralTableRecordType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSelectedCollateralTableTrxUnit" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutUpdateBankemployeeLastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutUsedCollateralColEstValueAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutUsedCollateralCollateralSn" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OutUsedProductDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutUsedProductIdProduct" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutUsedUnitCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutUsedUnitUnitName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpSrvLog" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}ArrayOfMC2008VOutGrpSrvLogItem" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MC2008VGenericCollateralExport", propOrder = {
    "outAccountBalanceIefSuppliedAmount",
    "outAccountCurrencyShortDescr",
    "outAgrUnitCode",
    "outAgreementAgrMembershipSn",
    "outAgreementAgrSn",
    "outAgreementAgrYear",
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
    "outCustomerCustId",
    "outCustomerFirstName",
    "outCustomerSurname",
    "outInsertBankemployeeLastName",
    "outInsertUnitUnitName",
    "outLoanAccUnitCode",
    "outLoanAccUnitEntryStatus",
    "outLoanAccUnitUnitName",
    "outLoanAccountAccCd",
    "outLoanAccountAccSn",
    "outLoanAccountAccType",
    "outLoanProductDescription",
    "outLoanProductIdProduct",
    "outSelectedCollateralTableAccountCd1",
    "outSelectedCollateralTableAccountCd2",
    "outSelectedCollateralTableAmount1",
    "outSelectedCollateralTableAmount10",
    "outSelectedCollateralTableAmount1841",
    "outSelectedCollateralTableAmount1842",
    "outSelectedCollateralTableAmount1843",
    "outSelectedCollateralTableAmount2",
    "outSelectedCollateralTableAmount3",
    "outSelectedCollateralTableAmount4",
    "outSelectedCollateralTableAmount5",
    "outSelectedCollateralTableAmount6",
    "outSelectedCollateralTableAmount7",
    "outSelectedCollateralTableAmount8",
    "outSelectedCollateralTableAmount9",
    "outSelectedCollateralTableBondCode",
    "outSelectedCollateralTableCDigit1",
    "outSelectedCollateralTableCDigit2",
    "outSelectedCollateralTableCollaborationBank",
    "outSelectedCollateralTableCollateralUsage",
    "outSelectedCollateralTableCurrencyId",
    "outSelectedCollateralTableCustId1",
    "outSelectedCollateralTableCustId2",
    "outSelectedCollateralTableDate1",
    "outSelectedCollateralTableDate10",
    "outSelectedCollateralTableDate2",
    "outSelectedCollateralTableDate3",
    "outSelectedCollateralTableDate4",
    "outSelectedCollateralTableDate5",
    "outSelectedCollateralTableDate6",
    "outSelectedCollateralTableDate7",
    "outSelectedCollateralTableDate8",
    "outSelectedCollateralTableDate9",
    "outSelectedCollateralTableDescr1",
    "outSelectedCollateralTableDescr10",
    "outSelectedCollateralTableDescr11",
    "outSelectedCollateralTableDescr12",
    "outSelectedCollateralTableDescr13",
    "outSelectedCollateralTableDescr14",
    "outSelectedCollateralTableDescr15",
    "outSelectedCollateralTableDescr16",
    "outSelectedCollateralTableDescr17",
    "outSelectedCollateralTableDescr18",
    "outSelectedCollateralTableDescr19",
    "outSelectedCollateralTableDescr2",
    "outSelectedCollateralTableDescr20",
    "outSelectedCollateralTableDescr3",
    "outSelectedCollateralTableDescr4",
    "outSelectedCollateralTableDescr5",
    "outSelectedCollateralTableDescr6",
    "outSelectedCollateralTableDescr7",
    "outSelectedCollateralTableDescr8",
    "outSelectedCollateralTableDescr9",
    "outSelectedCollateralTableEntryStatus",
    "outSelectedCollateralTableFlag1",
    "outSelectedCollateralTableFlag10",
    "outSelectedCollateralTableFlag2",
    "outSelectedCollateralTableFlag3",
    "outSelectedCollateralTableFlag4",
    "outSelectedCollateralTableFlag5",
    "outSelectedCollateralTableFlag6",
    "outSelectedCollateralTableFlag7",
    "outSelectedCollateralTableFlag8",
    "outSelectedCollateralTableFlag9",
    "outSelectedCollateralTableGdParType1",
    "outSelectedCollateralTableGdParType2",
    "outSelectedCollateralTableGdParType3",
    "outSelectedCollateralTableGdParType4",
    "outSelectedCollateralTableGdParType5",
    "outSelectedCollateralTableGdParType6",
    "outSelectedCollateralTableGdSerialNum1",
    "outSelectedCollateralTableGdSerialNum2",
    "outSelectedCollateralTableGdSerialNum3",
    "outSelectedCollateralTableGdSerialNum4",
    "outSelectedCollateralTableGdSerialNum5",
    "outSelectedCollateralTableGdSerialNum6",
    "outSelectedCollateralTableInsertionDt",
    "outSelectedCollateralTableInsertionUsr",
    "outSelectedCollateralTableInternalSn",
    "outSelectedCollateralTableLagreDescr2",
    "outSelectedCollateralTableLargeDescr1",
    "outSelectedCollateralTableLargeDescr3",
    "outSelectedCollateralTableModificationDt",
    "outSelectedCollateralTableModificationUsr",
    "outSelectedCollateralTableNumber1",
    "outSelectedCollateralTableNumber10",
    "outSelectedCollateralTableNumber2",
    "outSelectedCollateralTableNumber3",
    "outSelectedCollateralTableNumber4",
    "outSelectedCollateralTableNumber5",
    "outSelectedCollateralTableNumber6",
    "outSelectedCollateralTableNumber7",
    "outSelectedCollateralTableNumber8",
    "outSelectedCollateralTableNumber9",
    "outSelectedCollateralTablePrftSystem1",
    "outSelectedCollateralTablePrftSystem2",
    "outSelectedCollateralTableProfitsAccount1",
    "outSelectedCollateralTableProfitsAccount2",
    "outSelectedCollateralTableRealEstateId",
    "outSelectedCollateralTableRecordDescr",
    "outSelectedCollateralTableRecordType",
    "outSelectedCollateralTableTrxUnit",
    "outUpdateBankemployeeLastName",
    "outUsedCollateralColEstValueAmn",
    "outUsedCollateralCollateralSn",
    "outUsedProductDescription",
    "outUsedProductIdProduct",
    "outUsedUnitCode",
    "outUsedUnitUnitName",
    "outGrpSrvLog"
})
public class MC2008VGenericCollateralExport
    extends BaseExport
{

    @XmlElement(name = "OutAccountBalanceIefSuppliedAmount", required = true)
    protected BigDecimal outAccountBalanceIefSuppliedAmount;
    @XmlElement(name = "OutAccountCurrencyShortDescr")
    protected String outAccountCurrencyShortDescr;
    @XmlElement(name = "OutAgrUnitCode")
    protected int outAgrUnitCode;
    @XmlElement(name = "OutAgreementAgrMembershipSn")
    protected int outAgreementAgrMembershipSn;
    @XmlElement(name = "OutAgreementAgrSn")
    protected int outAgreementAgrSn;
    @XmlElement(name = "OutAgreementAgrYear")
    protected short outAgreementAgrYear;
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
    @XmlElement(name = "OutCustomerCustId")
    protected int outCustomerCustId;
    @XmlElement(name = "OutCustomerFirstName")
    protected String outCustomerFirstName;
    @XmlElement(name = "OutCustomerSurname")
    protected String outCustomerSurname;
    @XmlElement(name = "OutInsertBankemployeeLastName")
    protected String outInsertBankemployeeLastName;
    @XmlElement(name = "OutInsertUnitUnitName")
    protected String outInsertUnitUnitName;
    @XmlElement(name = "OutLoanAccUnitCode")
    protected int outLoanAccUnitCode;
    @XmlElement(name = "OutLoanAccUnitEntryStatus")
    protected String outLoanAccUnitEntryStatus;
    @XmlElement(name = "OutLoanAccUnitUnitName")
    protected String outLoanAccUnitUnitName;
    @XmlElement(name = "OutLoanAccountAccCd")
    protected short outLoanAccountAccCd;
    @XmlElement(name = "OutLoanAccountAccSn")
    protected int outLoanAccountAccSn;
    @XmlElement(name = "OutLoanAccountAccType")
    protected short outLoanAccountAccType;
    @XmlElement(name = "OutLoanProductDescription")
    protected String outLoanProductDescription;
    @XmlElement(name = "OutLoanProductIdProduct")
    protected int outLoanProductIdProduct;
    @XmlElement(name = "OutSelectedCollateralTableAccountCd1")
    protected short outSelectedCollateralTableAccountCd1;
    @XmlElement(name = "OutSelectedCollateralTableAccountCd2")
    protected short outSelectedCollateralTableAccountCd2;
    @XmlElement(name = "OutSelectedCollateralTableAmount1", required = true)
    protected BigDecimal outSelectedCollateralTableAmount1;
    @XmlElement(name = "OutSelectedCollateralTableAmount10", required = true)
    protected BigDecimal outSelectedCollateralTableAmount10;
    @XmlElement(name = "OutSelectedCollateralTableAmount1841", required = true)
    protected BigDecimal outSelectedCollateralTableAmount1841;
    @XmlElement(name = "OutSelectedCollateralTableAmount1842", required = true)
    protected BigDecimal outSelectedCollateralTableAmount1842;
    @XmlElement(name = "OutSelectedCollateralTableAmount1843", required = true)
    protected BigDecimal outSelectedCollateralTableAmount1843;
    @XmlElement(name = "OutSelectedCollateralTableAmount2", required = true)
    protected BigDecimal outSelectedCollateralTableAmount2;
    @XmlElement(name = "OutSelectedCollateralTableAmount3", required = true)
    protected BigDecimal outSelectedCollateralTableAmount3;
    @XmlElement(name = "OutSelectedCollateralTableAmount4", required = true)
    protected BigDecimal outSelectedCollateralTableAmount4;
    @XmlElement(name = "OutSelectedCollateralTableAmount5", required = true)
    protected BigDecimal outSelectedCollateralTableAmount5;
    @XmlElement(name = "OutSelectedCollateralTableAmount6", required = true)
    protected BigDecimal outSelectedCollateralTableAmount6;
    @XmlElement(name = "OutSelectedCollateralTableAmount7", required = true)
    protected BigDecimal outSelectedCollateralTableAmount7;
    @XmlElement(name = "OutSelectedCollateralTableAmount8", required = true)
    protected BigDecimal outSelectedCollateralTableAmount8;
    @XmlElement(name = "OutSelectedCollateralTableAmount9", required = true)
    protected BigDecimal outSelectedCollateralTableAmount9;
    @XmlElement(name = "OutSelectedCollateralTableBondCode")
    protected String outSelectedCollateralTableBondCode;
    @XmlElement(name = "OutSelectedCollateralTableCDigit1")
    protected short outSelectedCollateralTableCDigit1;
    @XmlElement(name = "OutSelectedCollateralTableCDigit2")
    protected short outSelectedCollateralTableCDigit2;
    @XmlElement(name = "OutSelectedCollateralTableCollaborationBank")
    protected int outSelectedCollateralTableCollaborationBank;
    @XmlElement(name = "OutSelectedCollateralTableCollateralUsage")
    protected String outSelectedCollateralTableCollateralUsage;
    @XmlElement(name = "OutSelectedCollateralTableCurrencyId")
    protected int outSelectedCollateralTableCurrencyId;
    @XmlElement(name = "OutSelectedCollateralTableCustId1")
    protected int outSelectedCollateralTableCustId1;
    @XmlElement(name = "OutSelectedCollateralTableCustId2")
    protected int outSelectedCollateralTableCustId2;
    @XmlElement(name = "OutSelectedCollateralTableDate1", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outSelectedCollateralTableDate1;
    @XmlElement(name = "OutSelectedCollateralTableDate10", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outSelectedCollateralTableDate10;
    @XmlElement(name = "OutSelectedCollateralTableDate2", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outSelectedCollateralTableDate2;
    @XmlElement(name = "OutSelectedCollateralTableDate3", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outSelectedCollateralTableDate3;
    @XmlElement(name = "OutSelectedCollateralTableDate4", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outSelectedCollateralTableDate4;
    @XmlElement(name = "OutSelectedCollateralTableDate5", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outSelectedCollateralTableDate5;
    @XmlElement(name = "OutSelectedCollateralTableDate6", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outSelectedCollateralTableDate6;
    @XmlElement(name = "OutSelectedCollateralTableDate7", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outSelectedCollateralTableDate7;
    @XmlElement(name = "OutSelectedCollateralTableDate8", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outSelectedCollateralTableDate8;
    @XmlElement(name = "OutSelectedCollateralTableDate9", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outSelectedCollateralTableDate9;
    @XmlElement(name = "OutSelectedCollateralTableDescr1")
    protected String outSelectedCollateralTableDescr1;
    @XmlElement(name = "OutSelectedCollateralTableDescr10")
    protected String outSelectedCollateralTableDescr10;
    @XmlElement(name = "OutSelectedCollateralTableDescr11")
    protected String outSelectedCollateralTableDescr11;
    @XmlElement(name = "OutSelectedCollateralTableDescr12")
    protected String outSelectedCollateralTableDescr12;
    @XmlElement(name = "OutSelectedCollateralTableDescr13")
    protected String outSelectedCollateralTableDescr13;
    @XmlElement(name = "OutSelectedCollateralTableDescr14")
    protected String outSelectedCollateralTableDescr14;
    @XmlElement(name = "OutSelectedCollateralTableDescr15")
    protected String outSelectedCollateralTableDescr15;
    @XmlElement(name = "OutSelectedCollateralTableDescr16")
    protected String outSelectedCollateralTableDescr16;
    @XmlElement(name = "OutSelectedCollateralTableDescr17")
    protected String outSelectedCollateralTableDescr17;
    @XmlElement(name = "OutSelectedCollateralTableDescr18")
    protected String outSelectedCollateralTableDescr18;
    @XmlElement(name = "OutSelectedCollateralTableDescr19")
    protected String outSelectedCollateralTableDescr19;
    @XmlElement(name = "OutSelectedCollateralTableDescr2")
    protected String outSelectedCollateralTableDescr2;
    @XmlElement(name = "OutSelectedCollateralTableDescr20")
    protected String outSelectedCollateralTableDescr20;
    @XmlElement(name = "OutSelectedCollateralTableDescr3")
    protected String outSelectedCollateralTableDescr3;
    @XmlElement(name = "OutSelectedCollateralTableDescr4")
    protected String outSelectedCollateralTableDescr4;
    @XmlElement(name = "OutSelectedCollateralTableDescr5")
    protected String outSelectedCollateralTableDescr5;
    @XmlElement(name = "OutSelectedCollateralTableDescr6")
    protected String outSelectedCollateralTableDescr6;
    @XmlElement(name = "OutSelectedCollateralTableDescr7")
    protected String outSelectedCollateralTableDescr7;
    @XmlElement(name = "OutSelectedCollateralTableDescr8")
    protected String outSelectedCollateralTableDescr8;
    @XmlElement(name = "OutSelectedCollateralTableDescr9")
    protected String outSelectedCollateralTableDescr9;
    @XmlElement(name = "OutSelectedCollateralTableEntryStatus")
    protected String outSelectedCollateralTableEntryStatus;
    @XmlElement(name = "OutSelectedCollateralTableFlag1")
    protected String outSelectedCollateralTableFlag1;
    @XmlElement(name = "OutSelectedCollateralTableFlag10")
    protected String outSelectedCollateralTableFlag10;
    @XmlElement(name = "OutSelectedCollateralTableFlag2")
    protected String outSelectedCollateralTableFlag2;
    @XmlElement(name = "OutSelectedCollateralTableFlag3")
    protected String outSelectedCollateralTableFlag3;
    @XmlElement(name = "OutSelectedCollateralTableFlag4")
    protected String outSelectedCollateralTableFlag4;
    @XmlElement(name = "OutSelectedCollateralTableFlag5")
    protected String outSelectedCollateralTableFlag5;
    @XmlElement(name = "OutSelectedCollateralTableFlag6")
    protected String outSelectedCollateralTableFlag6;
    @XmlElement(name = "OutSelectedCollateralTableFlag7")
    protected String outSelectedCollateralTableFlag7;
    @XmlElement(name = "OutSelectedCollateralTableFlag8")
    protected String outSelectedCollateralTableFlag8;
    @XmlElement(name = "OutSelectedCollateralTableFlag9")
    protected String outSelectedCollateralTableFlag9;
    @XmlElement(name = "OutSelectedCollateralTableGdParType1")
    protected String outSelectedCollateralTableGdParType1;
    @XmlElement(name = "OutSelectedCollateralTableGdParType2")
    protected String outSelectedCollateralTableGdParType2;
    @XmlElement(name = "OutSelectedCollateralTableGdParType3")
    protected String outSelectedCollateralTableGdParType3;
    @XmlElement(name = "OutSelectedCollateralTableGdParType4")
    protected String outSelectedCollateralTableGdParType4;
    @XmlElement(name = "OutSelectedCollateralTableGdParType5")
    protected String outSelectedCollateralTableGdParType5;
    @XmlElement(name = "OutSelectedCollateralTableGdParType6")
    protected String outSelectedCollateralTableGdParType6;
    @XmlElement(name = "OutSelectedCollateralTableGdSerialNum1")
    protected int outSelectedCollateralTableGdSerialNum1;
    @XmlElement(name = "OutSelectedCollateralTableGdSerialNum2")
    protected int outSelectedCollateralTableGdSerialNum2;
    @XmlElement(name = "OutSelectedCollateralTableGdSerialNum3")
    protected int outSelectedCollateralTableGdSerialNum3;
    @XmlElement(name = "OutSelectedCollateralTableGdSerialNum4")
    protected int outSelectedCollateralTableGdSerialNum4;
    @XmlElement(name = "OutSelectedCollateralTableGdSerialNum5")
    protected int outSelectedCollateralTableGdSerialNum5;
    @XmlElement(name = "OutSelectedCollateralTableGdSerialNum6")
    protected int outSelectedCollateralTableGdSerialNum6;
    @XmlElement(name = "OutSelectedCollateralTableInsertionDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outSelectedCollateralTableInsertionDt;
    @XmlElement(name = "OutSelectedCollateralTableInsertionUsr")
    protected String outSelectedCollateralTableInsertionUsr;
    @XmlElement(name = "OutSelectedCollateralTableInternalSn")
    protected double outSelectedCollateralTableInternalSn;
    @XmlElement(name = "OutSelectedCollateralTableLagreDescr2")
    protected String outSelectedCollateralTableLagreDescr2;
    @XmlElement(name = "OutSelectedCollateralTableLargeDescr1")
    protected String outSelectedCollateralTableLargeDescr1;
    @XmlElement(name = "OutSelectedCollateralTableLargeDescr3")
    protected String outSelectedCollateralTableLargeDescr3;
    @XmlElement(name = "OutSelectedCollateralTableModificationDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outSelectedCollateralTableModificationDt;
    @XmlElement(name = "OutSelectedCollateralTableModificationUsr")
    protected String outSelectedCollateralTableModificationUsr;
    @XmlElement(name = "OutSelectedCollateralTableNumber1")
    protected double outSelectedCollateralTableNumber1;
    @XmlElement(name = "OutSelectedCollateralTableNumber10")
    protected double outSelectedCollateralTableNumber10;
    @XmlElement(name = "OutSelectedCollateralTableNumber2")
    protected double outSelectedCollateralTableNumber2;
    @XmlElement(name = "OutSelectedCollateralTableNumber3")
    protected double outSelectedCollateralTableNumber3;
    @XmlElement(name = "OutSelectedCollateralTableNumber4")
    protected double outSelectedCollateralTableNumber4;
    @XmlElement(name = "OutSelectedCollateralTableNumber5")
    protected double outSelectedCollateralTableNumber5;
    @XmlElement(name = "OutSelectedCollateralTableNumber6")
    protected double outSelectedCollateralTableNumber6;
    @XmlElement(name = "OutSelectedCollateralTableNumber7")
    protected double outSelectedCollateralTableNumber7;
    @XmlElement(name = "OutSelectedCollateralTableNumber8")
    protected double outSelectedCollateralTableNumber8;
    @XmlElement(name = "OutSelectedCollateralTableNumber9")
    protected double outSelectedCollateralTableNumber9;
    @XmlElement(name = "OutSelectedCollateralTablePrftSystem1")
    protected short outSelectedCollateralTablePrftSystem1;
    @XmlElement(name = "OutSelectedCollateralTablePrftSystem2")
    protected short outSelectedCollateralTablePrftSystem2;
    @XmlElement(name = "OutSelectedCollateralTableProfitsAccount1")
    protected String outSelectedCollateralTableProfitsAccount1;
    @XmlElement(name = "OutSelectedCollateralTableProfitsAccount2")
    protected String outSelectedCollateralTableProfitsAccount2;
    @XmlElement(name = "OutSelectedCollateralTableRealEstateId")
    protected double outSelectedCollateralTableRealEstateId;
    @XmlElement(name = "OutSelectedCollateralTableRecordDescr")
    protected String outSelectedCollateralTableRecordDescr;
    @XmlElement(name = "OutSelectedCollateralTableRecordType")
    protected String outSelectedCollateralTableRecordType;
    @XmlElement(name = "OutSelectedCollateralTableTrxUnit")
    protected int outSelectedCollateralTableTrxUnit;
    @XmlElement(name = "OutUpdateBankemployeeLastName")
    protected String outUpdateBankemployeeLastName;
    @XmlElement(name = "OutUsedCollateralColEstValueAmn", required = true)
    protected BigDecimal outUsedCollateralColEstValueAmn;
    @XmlElement(name = "OutUsedCollateralCollateralSn")
    protected double outUsedCollateralCollateralSn;
    @XmlElement(name = "OutUsedProductDescription")
    protected String outUsedProductDescription;
    @XmlElement(name = "OutUsedProductIdProduct")
    protected int outUsedProductIdProduct;
    @XmlElement(name = "OutUsedUnitCode")
    protected int outUsedUnitCode;
    @XmlElement(name = "OutUsedUnitUnitName")
    protected String outUsedUnitUnitName;
    @XmlElement(name = "OutGrpSrvLog")
    protected ArrayOfMC2008VOutGrpSrvLogItem outGrpSrvLog;

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
     * Gets the value of the outInsertBankemployeeLastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutInsertBankemployeeLastName() {
        return outInsertBankemployeeLastName;
    }

    /**
     * Sets the value of the outInsertBankemployeeLastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutInsertBankemployeeLastName(String value) {
        this.outInsertBankemployeeLastName = value;
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
     * Gets the value of the outSelectedCollateralTableAccountCd1 property.
     * 
     */
    public short getOutSelectedCollateralTableAccountCd1() {
        return outSelectedCollateralTableAccountCd1;
    }

    /**
     * Sets the value of the outSelectedCollateralTableAccountCd1 property.
     * 
     */
    public void setOutSelectedCollateralTableAccountCd1(short value) {
        this.outSelectedCollateralTableAccountCd1 = value;
    }

    /**
     * Gets the value of the outSelectedCollateralTableAccountCd2 property.
     * 
     */
    public short getOutSelectedCollateralTableAccountCd2() {
        return outSelectedCollateralTableAccountCd2;
    }

    /**
     * Sets the value of the outSelectedCollateralTableAccountCd2 property.
     * 
     */
    public void setOutSelectedCollateralTableAccountCd2(short value) {
        this.outSelectedCollateralTableAccountCd2 = value;
    }

    /**
     * Gets the value of the outSelectedCollateralTableAmount1 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutSelectedCollateralTableAmount1() {
        return outSelectedCollateralTableAmount1;
    }

    /**
     * Sets the value of the outSelectedCollateralTableAmount1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutSelectedCollateralTableAmount1(BigDecimal value) {
        this.outSelectedCollateralTableAmount1 = value;
    }

    /**
     * Gets the value of the outSelectedCollateralTableAmount10 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutSelectedCollateralTableAmount10() {
        return outSelectedCollateralTableAmount10;
    }

    /**
     * Sets the value of the outSelectedCollateralTableAmount10 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutSelectedCollateralTableAmount10(BigDecimal value) {
        this.outSelectedCollateralTableAmount10 = value;
    }

    /**
     * Gets the value of the outSelectedCollateralTableAmount1841 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutSelectedCollateralTableAmount1841() {
        return outSelectedCollateralTableAmount1841;
    }

    /**
     * Sets the value of the outSelectedCollateralTableAmount1841 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutSelectedCollateralTableAmount1841(BigDecimal value) {
        this.outSelectedCollateralTableAmount1841 = value;
    }

    /**
     * Gets the value of the outSelectedCollateralTableAmount1842 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutSelectedCollateralTableAmount1842() {
        return outSelectedCollateralTableAmount1842;
    }

    /**
     * Sets the value of the outSelectedCollateralTableAmount1842 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutSelectedCollateralTableAmount1842(BigDecimal value) {
        this.outSelectedCollateralTableAmount1842 = value;
    }

    /**
     * Gets the value of the outSelectedCollateralTableAmount1843 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutSelectedCollateralTableAmount1843() {
        return outSelectedCollateralTableAmount1843;
    }

    /**
     * Sets the value of the outSelectedCollateralTableAmount1843 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutSelectedCollateralTableAmount1843(BigDecimal value) {
        this.outSelectedCollateralTableAmount1843 = value;
    }

    /**
     * Gets the value of the outSelectedCollateralTableAmount2 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutSelectedCollateralTableAmount2() {
        return outSelectedCollateralTableAmount2;
    }

    /**
     * Sets the value of the outSelectedCollateralTableAmount2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutSelectedCollateralTableAmount2(BigDecimal value) {
        this.outSelectedCollateralTableAmount2 = value;
    }

    /**
     * Gets the value of the outSelectedCollateralTableAmount3 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutSelectedCollateralTableAmount3() {
        return outSelectedCollateralTableAmount3;
    }

    /**
     * Sets the value of the outSelectedCollateralTableAmount3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutSelectedCollateralTableAmount3(BigDecimal value) {
        this.outSelectedCollateralTableAmount3 = value;
    }

    /**
     * Gets the value of the outSelectedCollateralTableAmount4 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutSelectedCollateralTableAmount4() {
        return outSelectedCollateralTableAmount4;
    }

    /**
     * Sets the value of the outSelectedCollateralTableAmount4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutSelectedCollateralTableAmount4(BigDecimal value) {
        this.outSelectedCollateralTableAmount4 = value;
    }

    /**
     * Gets the value of the outSelectedCollateralTableAmount5 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutSelectedCollateralTableAmount5() {
        return outSelectedCollateralTableAmount5;
    }

    /**
     * Sets the value of the outSelectedCollateralTableAmount5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutSelectedCollateralTableAmount5(BigDecimal value) {
        this.outSelectedCollateralTableAmount5 = value;
    }

    /**
     * Gets the value of the outSelectedCollateralTableAmount6 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutSelectedCollateralTableAmount6() {
        return outSelectedCollateralTableAmount6;
    }

    /**
     * Sets the value of the outSelectedCollateralTableAmount6 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutSelectedCollateralTableAmount6(BigDecimal value) {
        this.outSelectedCollateralTableAmount6 = value;
    }

    /**
     * Gets the value of the outSelectedCollateralTableAmount7 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutSelectedCollateralTableAmount7() {
        return outSelectedCollateralTableAmount7;
    }

    /**
     * Sets the value of the outSelectedCollateralTableAmount7 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutSelectedCollateralTableAmount7(BigDecimal value) {
        this.outSelectedCollateralTableAmount7 = value;
    }

    /**
     * Gets the value of the outSelectedCollateralTableAmount8 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutSelectedCollateralTableAmount8() {
        return outSelectedCollateralTableAmount8;
    }

    /**
     * Sets the value of the outSelectedCollateralTableAmount8 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutSelectedCollateralTableAmount8(BigDecimal value) {
        this.outSelectedCollateralTableAmount8 = value;
    }

    /**
     * Gets the value of the outSelectedCollateralTableAmount9 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutSelectedCollateralTableAmount9() {
        return outSelectedCollateralTableAmount9;
    }

    /**
     * Sets the value of the outSelectedCollateralTableAmount9 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutSelectedCollateralTableAmount9(BigDecimal value) {
        this.outSelectedCollateralTableAmount9 = value;
    }

    /**
     * Gets the value of the outSelectedCollateralTableBondCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSelectedCollateralTableBondCode() {
        return outSelectedCollateralTableBondCode;
    }

    /**
     * Sets the value of the outSelectedCollateralTableBondCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSelectedCollateralTableBondCode(String value) {
        this.outSelectedCollateralTableBondCode = value;
    }

    /**
     * Gets the value of the outSelectedCollateralTableCDigit1 property.
     * 
     */
    public short getOutSelectedCollateralTableCDigit1() {
        return outSelectedCollateralTableCDigit1;
    }

    /**
     * Sets the value of the outSelectedCollateralTableCDigit1 property.
     * 
     */
    public void setOutSelectedCollateralTableCDigit1(short value) {
        this.outSelectedCollateralTableCDigit1 = value;
    }

    /**
     * Gets the value of the outSelectedCollateralTableCDigit2 property.
     * 
     */
    public short getOutSelectedCollateralTableCDigit2() {
        return outSelectedCollateralTableCDigit2;
    }

    /**
     * Sets the value of the outSelectedCollateralTableCDigit2 property.
     * 
     */
    public void setOutSelectedCollateralTableCDigit2(short value) {
        this.outSelectedCollateralTableCDigit2 = value;
    }

    /**
     * Gets the value of the outSelectedCollateralTableCollaborationBank property.
     * 
     */
    public int getOutSelectedCollateralTableCollaborationBank() {
        return outSelectedCollateralTableCollaborationBank;
    }

    /**
     * Sets the value of the outSelectedCollateralTableCollaborationBank property.
     * 
     */
    public void setOutSelectedCollateralTableCollaborationBank(int value) {
        this.outSelectedCollateralTableCollaborationBank = value;
    }

    /**
     * Gets the value of the outSelectedCollateralTableCollateralUsage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSelectedCollateralTableCollateralUsage() {
        return outSelectedCollateralTableCollateralUsage;
    }

    /**
     * Sets the value of the outSelectedCollateralTableCollateralUsage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSelectedCollateralTableCollateralUsage(String value) {
        this.outSelectedCollateralTableCollateralUsage = value;
    }

    /**
     * Gets the value of the outSelectedCollateralTableCurrencyId property.
     * 
     */
    public int getOutSelectedCollateralTableCurrencyId() {
        return outSelectedCollateralTableCurrencyId;
    }

    /**
     * Sets the value of the outSelectedCollateralTableCurrencyId property.
     * 
     */
    public void setOutSelectedCollateralTableCurrencyId(int value) {
        this.outSelectedCollateralTableCurrencyId = value;
    }

    /**
     * Gets the value of the outSelectedCollateralTableCustId1 property.
     * 
     */
    public int getOutSelectedCollateralTableCustId1() {
        return outSelectedCollateralTableCustId1;
    }

    /**
     * Sets the value of the outSelectedCollateralTableCustId1 property.
     * 
     */
    public void setOutSelectedCollateralTableCustId1(int value) {
        this.outSelectedCollateralTableCustId1 = value;
    }

    /**
     * Gets the value of the outSelectedCollateralTableCustId2 property.
     * 
     */
    public int getOutSelectedCollateralTableCustId2() {
        return outSelectedCollateralTableCustId2;
    }

    /**
     * Sets the value of the outSelectedCollateralTableCustId2 property.
     * 
     */
    public void setOutSelectedCollateralTableCustId2(int value) {
        this.outSelectedCollateralTableCustId2 = value;
    }

    /**
     * Gets the value of the outSelectedCollateralTableDate1 property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutSelectedCollateralTableDate1() {
        return outSelectedCollateralTableDate1;
    }

    /**
     * Sets the value of the outSelectedCollateralTableDate1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutSelectedCollateralTableDate1(XMLGregorianCalendar value) {
        this.outSelectedCollateralTableDate1 = value;
    }

    /**
     * Gets the value of the outSelectedCollateralTableDate10 property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutSelectedCollateralTableDate10() {
        return outSelectedCollateralTableDate10;
    }

    /**
     * Sets the value of the outSelectedCollateralTableDate10 property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutSelectedCollateralTableDate10(XMLGregorianCalendar value) {
        this.outSelectedCollateralTableDate10 = value;
    }

    /**
     * Gets the value of the outSelectedCollateralTableDate2 property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutSelectedCollateralTableDate2() {
        return outSelectedCollateralTableDate2;
    }

    /**
     * Sets the value of the outSelectedCollateralTableDate2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutSelectedCollateralTableDate2(XMLGregorianCalendar value) {
        this.outSelectedCollateralTableDate2 = value;
    }

    /**
     * Gets the value of the outSelectedCollateralTableDate3 property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutSelectedCollateralTableDate3() {
        return outSelectedCollateralTableDate3;
    }

    /**
     * Sets the value of the outSelectedCollateralTableDate3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutSelectedCollateralTableDate3(XMLGregorianCalendar value) {
        this.outSelectedCollateralTableDate3 = value;
    }

    /**
     * Gets the value of the outSelectedCollateralTableDate4 property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutSelectedCollateralTableDate4() {
        return outSelectedCollateralTableDate4;
    }

    /**
     * Sets the value of the outSelectedCollateralTableDate4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutSelectedCollateralTableDate4(XMLGregorianCalendar value) {
        this.outSelectedCollateralTableDate4 = value;
    }

    /**
     * Gets the value of the outSelectedCollateralTableDate5 property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutSelectedCollateralTableDate5() {
        return outSelectedCollateralTableDate5;
    }

    /**
     * Sets the value of the outSelectedCollateralTableDate5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutSelectedCollateralTableDate5(XMLGregorianCalendar value) {
        this.outSelectedCollateralTableDate5 = value;
    }

    /**
     * Gets the value of the outSelectedCollateralTableDate6 property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutSelectedCollateralTableDate6() {
        return outSelectedCollateralTableDate6;
    }

    /**
     * Sets the value of the outSelectedCollateralTableDate6 property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutSelectedCollateralTableDate6(XMLGregorianCalendar value) {
        this.outSelectedCollateralTableDate6 = value;
    }

    /**
     * Gets the value of the outSelectedCollateralTableDate7 property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutSelectedCollateralTableDate7() {
        return outSelectedCollateralTableDate7;
    }

    /**
     * Sets the value of the outSelectedCollateralTableDate7 property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutSelectedCollateralTableDate7(XMLGregorianCalendar value) {
        this.outSelectedCollateralTableDate7 = value;
    }

    /**
     * Gets the value of the outSelectedCollateralTableDate8 property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutSelectedCollateralTableDate8() {
        return outSelectedCollateralTableDate8;
    }

    /**
     * Sets the value of the outSelectedCollateralTableDate8 property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutSelectedCollateralTableDate8(XMLGregorianCalendar value) {
        this.outSelectedCollateralTableDate8 = value;
    }

    /**
     * Gets the value of the outSelectedCollateralTableDate9 property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutSelectedCollateralTableDate9() {
        return outSelectedCollateralTableDate9;
    }

    /**
     * Sets the value of the outSelectedCollateralTableDate9 property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutSelectedCollateralTableDate9(XMLGregorianCalendar value) {
        this.outSelectedCollateralTableDate9 = value;
    }

    /**
     * Gets the value of the outSelectedCollateralTableDescr1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSelectedCollateralTableDescr1() {
        return outSelectedCollateralTableDescr1;
    }

    /**
     * Sets the value of the outSelectedCollateralTableDescr1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSelectedCollateralTableDescr1(String value) {
        this.outSelectedCollateralTableDescr1 = value;
    }

    /**
     * Gets the value of the outSelectedCollateralTableDescr10 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSelectedCollateralTableDescr10() {
        return outSelectedCollateralTableDescr10;
    }

    /**
     * Sets the value of the outSelectedCollateralTableDescr10 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSelectedCollateralTableDescr10(String value) {
        this.outSelectedCollateralTableDescr10 = value;
    }

    /**
     * Gets the value of the outSelectedCollateralTableDescr11 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSelectedCollateralTableDescr11() {
        return outSelectedCollateralTableDescr11;
    }

    /**
     * Sets the value of the outSelectedCollateralTableDescr11 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSelectedCollateralTableDescr11(String value) {
        this.outSelectedCollateralTableDescr11 = value;
    }

    /**
     * Gets the value of the outSelectedCollateralTableDescr12 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSelectedCollateralTableDescr12() {
        return outSelectedCollateralTableDescr12;
    }

    /**
     * Sets the value of the outSelectedCollateralTableDescr12 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSelectedCollateralTableDescr12(String value) {
        this.outSelectedCollateralTableDescr12 = value;
    }

    /**
     * Gets the value of the outSelectedCollateralTableDescr13 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSelectedCollateralTableDescr13() {
        return outSelectedCollateralTableDescr13;
    }

    /**
     * Sets the value of the outSelectedCollateralTableDescr13 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSelectedCollateralTableDescr13(String value) {
        this.outSelectedCollateralTableDescr13 = value;
    }

    /**
     * Gets the value of the outSelectedCollateralTableDescr14 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSelectedCollateralTableDescr14() {
        return outSelectedCollateralTableDescr14;
    }

    /**
     * Sets the value of the outSelectedCollateralTableDescr14 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSelectedCollateralTableDescr14(String value) {
        this.outSelectedCollateralTableDescr14 = value;
    }

    /**
     * Gets the value of the outSelectedCollateralTableDescr15 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSelectedCollateralTableDescr15() {
        return outSelectedCollateralTableDescr15;
    }

    /**
     * Sets the value of the outSelectedCollateralTableDescr15 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSelectedCollateralTableDescr15(String value) {
        this.outSelectedCollateralTableDescr15 = value;
    }

    /**
     * Gets the value of the outSelectedCollateralTableDescr16 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSelectedCollateralTableDescr16() {
        return outSelectedCollateralTableDescr16;
    }

    /**
     * Sets the value of the outSelectedCollateralTableDescr16 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSelectedCollateralTableDescr16(String value) {
        this.outSelectedCollateralTableDescr16 = value;
    }

    /**
     * Gets the value of the outSelectedCollateralTableDescr17 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSelectedCollateralTableDescr17() {
        return outSelectedCollateralTableDescr17;
    }

    /**
     * Sets the value of the outSelectedCollateralTableDescr17 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSelectedCollateralTableDescr17(String value) {
        this.outSelectedCollateralTableDescr17 = value;
    }

    /**
     * Gets the value of the outSelectedCollateralTableDescr18 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSelectedCollateralTableDescr18() {
        return outSelectedCollateralTableDescr18;
    }

    /**
     * Sets the value of the outSelectedCollateralTableDescr18 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSelectedCollateralTableDescr18(String value) {
        this.outSelectedCollateralTableDescr18 = value;
    }

    /**
     * Gets the value of the outSelectedCollateralTableDescr19 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSelectedCollateralTableDescr19() {
        return outSelectedCollateralTableDescr19;
    }

    /**
     * Sets the value of the outSelectedCollateralTableDescr19 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSelectedCollateralTableDescr19(String value) {
        this.outSelectedCollateralTableDescr19 = value;
    }

    /**
     * Gets the value of the outSelectedCollateralTableDescr2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSelectedCollateralTableDescr2() {
        return outSelectedCollateralTableDescr2;
    }

    /**
     * Sets the value of the outSelectedCollateralTableDescr2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSelectedCollateralTableDescr2(String value) {
        this.outSelectedCollateralTableDescr2 = value;
    }

    /**
     * Gets the value of the outSelectedCollateralTableDescr20 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSelectedCollateralTableDescr20() {
        return outSelectedCollateralTableDescr20;
    }

    /**
     * Sets the value of the outSelectedCollateralTableDescr20 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSelectedCollateralTableDescr20(String value) {
        this.outSelectedCollateralTableDescr20 = value;
    }

    /**
     * Gets the value of the outSelectedCollateralTableDescr3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSelectedCollateralTableDescr3() {
        return outSelectedCollateralTableDescr3;
    }

    /**
     * Sets the value of the outSelectedCollateralTableDescr3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSelectedCollateralTableDescr3(String value) {
        this.outSelectedCollateralTableDescr3 = value;
    }

    /**
     * Gets the value of the outSelectedCollateralTableDescr4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSelectedCollateralTableDescr4() {
        return outSelectedCollateralTableDescr4;
    }

    /**
     * Sets the value of the outSelectedCollateralTableDescr4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSelectedCollateralTableDescr4(String value) {
        this.outSelectedCollateralTableDescr4 = value;
    }

    /**
     * Gets the value of the outSelectedCollateralTableDescr5 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSelectedCollateralTableDescr5() {
        return outSelectedCollateralTableDescr5;
    }

    /**
     * Sets the value of the outSelectedCollateralTableDescr5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSelectedCollateralTableDescr5(String value) {
        this.outSelectedCollateralTableDescr5 = value;
    }

    /**
     * Gets the value of the outSelectedCollateralTableDescr6 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSelectedCollateralTableDescr6() {
        return outSelectedCollateralTableDescr6;
    }

    /**
     * Sets the value of the outSelectedCollateralTableDescr6 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSelectedCollateralTableDescr6(String value) {
        this.outSelectedCollateralTableDescr6 = value;
    }

    /**
     * Gets the value of the outSelectedCollateralTableDescr7 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSelectedCollateralTableDescr7() {
        return outSelectedCollateralTableDescr7;
    }

    /**
     * Sets the value of the outSelectedCollateralTableDescr7 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSelectedCollateralTableDescr7(String value) {
        this.outSelectedCollateralTableDescr7 = value;
    }

    /**
     * Gets the value of the outSelectedCollateralTableDescr8 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSelectedCollateralTableDescr8() {
        return outSelectedCollateralTableDescr8;
    }

    /**
     * Sets the value of the outSelectedCollateralTableDescr8 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSelectedCollateralTableDescr8(String value) {
        this.outSelectedCollateralTableDescr8 = value;
    }

    /**
     * Gets the value of the outSelectedCollateralTableDescr9 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSelectedCollateralTableDescr9() {
        return outSelectedCollateralTableDescr9;
    }

    /**
     * Sets the value of the outSelectedCollateralTableDescr9 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSelectedCollateralTableDescr9(String value) {
        this.outSelectedCollateralTableDescr9 = value;
    }

    /**
     * Gets the value of the outSelectedCollateralTableEntryStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSelectedCollateralTableEntryStatus() {
        return outSelectedCollateralTableEntryStatus;
    }

    /**
     * Sets the value of the outSelectedCollateralTableEntryStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSelectedCollateralTableEntryStatus(String value) {
        this.outSelectedCollateralTableEntryStatus = value;
    }

    /**
     * Gets the value of the outSelectedCollateralTableFlag1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSelectedCollateralTableFlag1() {
        return outSelectedCollateralTableFlag1;
    }

    /**
     * Sets the value of the outSelectedCollateralTableFlag1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSelectedCollateralTableFlag1(String value) {
        this.outSelectedCollateralTableFlag1 = value;
    }

    /**
     * Gets the value of the outSelectedCollateralTableFlag10 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSelectedCollateralTableFlag10() {
        return outSelectedCollateralTableFlag10;
    }

    /**
     * Sets the value of the outSelectedCollateralTableFlag10 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSelectedCollateralTableFlag10(String value) {
        this.outSelectedCollateralTableFlag10 = value;
    }

    /**
     * Gets the value of the outSelectedCollateralTableFlag2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSelectedCollateralTableFlag2() {
        return outSelectedCollateralTableFlag2;
    }

    /**
     * Sets the value of the outSelectedCollateralTableFlag2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSelectedCollateralTableFlag2(String value) {
        this.outSelectedCollateralTableFlag2 = value;
    }

    /**
     * Gets the value of the outSelectedCollateralTableFlag3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSelectedCollateralTableFlag3() {
        return outSelectedCollateralTableFlag3;
    }

    /**
     * Sets the value of the outSelectedCollateralTableFlag3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSelectedCollateralTableFlag3(String value) {
        this.outSelectedCollateralTableFlag3 = value;
    }

    /**
     * Gets the value of the outSelectedCollateralTableFlag4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSelectedCollateralTableFlag4() {
        return outSelectedCollateralTableFlag4;
    }

    /**
     * Sets the value of the outSelectedCollateralTableFlag4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSelectedCollateralTableFlag4(String value) {
        this.outSelectedCollateralTableFlag4 = value;
    }

    /**
     * Gets the value of the outSelectedCollateralTableFlag5 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSelectedCollateralTableFlag5() {
        return outSelectedCollateralTableFlag5;
    }

    /**
     * Sets the value of the outSelectedCollateralTableFlag5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSelectedCollateralTableFlag5(String value) {
        this.outSelectedCollateralTableFlag5 = value;
    }

    /**
     * Gets the value of the outSelectedCollateralTableFlag6 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSelectedCollateralTableFlag6() {
        return outSelectedCollateralTableFlag6;
    }

    /**
     * Sets the value of the outSelectedCollateralTableFlag6 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSelectedCollateralTableFlag6(String value) {
        this.outSelectedCollateralTableFlag6 = value;
    }

    /**
     * Gets the value of the outSelectedCollateralTableFlag7 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSelectedCollateralTableFlag7() {
        return outSelectedCollateralTableFlag7;
    }

    /**
     * Sets the value of the outSelectedCollateralTableFlag7 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSelectedCollateralTableFlag7(String value) {
        this.outSelectedCollateralTableFlag7 = value;
    }

    /**
     * Gets the value of the outSelectedCollateralTableFlag8 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSelectedCollateralTableFlag8() {
        return outSelectedCollateralTableFlag8;
    }

    /**
     * Sets the value of the outSelectedCollateralTableFlag8 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSelectedCollateralTableFlag8(String value) {
        this.outSelectedCollateralTableFlag8 = value;
    }

    /**
     * Gets the value of the outSelectedCollateralTableFlag9 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSelectedCollateralTableFlag9() {
        return outSelectedCollateralTableFlag9;
    }

    /**
     * Sets the value of the outSelectedCollateralTableFlag9 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSelectedCollateralTableFlag9(String value) {
        this.outSelectedCollateralTableFlag9 = value;
    }

    /**
     * Gets the value of the outSelectedCollateralTableGdParType1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSelectedCollateralTableGdParType1() {
        return outSelectedCollateralTableGdParType1;
    }

    /**
     * Sets the value of the outSelectedCollateralTableGdParType1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSelectedCollateralTableGdParType1(String value) {
        this.outSelectedCollateralTableGdParType1 = value;
    }

    /**
     * Gets the value of the outSelectedCollateralTableGdParType2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSelectedCollateralTableGdParType2() {
        return outSelectedCollateralTableGdParType2;
    }

    /**
     * Sets the value of the outSelectedCollateralTableGdParType2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSelectedCollateralTableGdParType2(String value) {
        this.outSelectedCollateralTableGdParType2 = value;
    }

    /**
     * Gets the value of the outSelectedCollateralTableGdParType3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSelectedCollateralTableGdParType3() {
        return outSelectedCollateralTableGdParType3;
    }

    /**
     * Sets the value of the outSelectedCollateralTableGdParType3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSelectedCollateralTableGdParType3(String value) {
        this.outSelectedCollateralTableGdParType3 = value;
    }

    /**
     * Gets the value of the outSelectedCollateralTableGdParType4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSelectedCollateralTableGdParType4() {
        return outSelectedCollateralTableGdParType4;
    }

    /**
     * Sets the value of the outSelectedCollateralTableGdParType4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSelectedCollateralTableGdParType4(String value) {
        this.outSelectedCollateralTableGdParType4 = value;
    }

    /**
     * Gets the value of the outSelectedCollateralTableGdParType5 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSelectedCollateralTableGdParType5() {
        return outSelectedCollateralTableGdParType5;
    }

    /**
     * Sets the value of the outSelectedCollateralTableGdParType5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSelectedCollateralTableGdParType5(String value) {
        this.outSelectedCollateralTableGdParType5 = value;
    }

    /**
     * Gets the value of the outSelectedCollateralTableGdParType6 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSelectedCollateralTableGdParType6() {
        return outSelectedCollateralTableGdParType6;
    }

    /**
     * Sets the value of the outSelectedCollateralTableGdParType6 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSelectedCollateralTableGdParType6(String value) {
        this.outSelectedCollateralTableGdParType6 = value;
    }

    /**
     * Gets the value of the outSelectedCollateralTableGdSerialNum1 property.
     * 
     */
    public int getOutSelectedCollateralTableGdSerialNum1() {
        return outSelectedCollateralTableGdSerialNum1;
    }

    /**
     * Sets the value of the outSelectedCollateralTableGdSerialNum1 property.
     * 
     */
    public void setOutSelectedCollateralTableGdSerialNum1(int value) {
        this.outSelectedCollateralTableGdSerialNum1 = value;
    }

    /**
     * Gets the value of the outSelectedCollateralTableGdSerialNum2 property.
     * 
     */
    public int getOutSelectedCollateralTableGdSerialNum2() {
        return outSelectedCollateralTableGdSerialNum2;
    }

    /**
     * Sets the value of the outSelectedCollateralTableGdSerialNum2 property.
     * 
     */
    public void setOutSelectedCollateralTableGdSerialNum2(int value) {
        this.outSelectedCollateralTableGdSerialNum2 = value;
    }

    /**
     * Gets the value of the outSelectedCollateralTableGdSerialNum3 property.
     * 
     */
    public int getOutSelectedCollateralTableGdSerialNum3() {
        return outSelectedCollateralTableGdSerialNum3;
    }

    /**
     * Sets the value of the outSelectedCollateralTableGdSerialNum3 property.
     * 
     */
    public void setOutSelectedCollateralTableGdSerialNum3(int value) {
        this.outSelectedCollateralTableGdSerialNum3 = value;
    }

    /**
     * Gets the value of the outSelectedCollateralTableGdSerialNum4 property.
     * 
     */
    public int getOutSelectedCollateralTableGdSerialNum4() {
        return outSelectedCollateralTableGdSerialNum4;
    }

    /**
     * Sets the value of the outSelectedCollateralTableGdSerialNum4 property.
     * 
     */
    public void setOutSelectedCollateralTableGdSerialNum4(int value) {
        this.outSelectedCollateralTableGdSerialNum4 = value;
    }

    /**
     * Gets the value of the outSelectedCollateralTableGdSerialNum5 property.
     * 
     */
    public int getOutSelectedCollateralTableGdSerialNum5() {
        return outSelectedCollateralTableGdSerialNum5;
    }

    /**
     * Sets the value of the outSelectedCollateralTableGdSerialNum5 property.
     * 
     */
    public void setOutSelectedCollateralTableGdSerialNum5(int value) {
        this.outSelectedCollateralTableGdSerialNum5 = value;
    }

    /**
     * Gets the value of the outSelectedCollateralTableGdSerialNum6 property.
     * 
     */
    public int getOutSelectedCollateralTableGdSerialNum6() {
        return outSelectedCollateralTableGdSerialNum6;
    }

    /**
     * Sets the value of the outSelectedCollateralTableGdSerialNum6 property.
     * 
     */
    public void setOutSelectedCollateralTableGdSerialNum6(int value) {
        this.outSelectedCollateralTableGdSerialNum6 = value;
    }

    /**
     * Gets the value of the outSelectedCollateralTableInsertionDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutSelectedCollateralTableInsertionDt() {
        return outSelectedCollateralTableInsertionDt;
    }

    /**
     * Sets the value of the outSelectedCollateralTableInsertionDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutSelectedCollateralTableInsertionDt(XMLGregorianCalendar value) {
        this.outSelectedCollateralTableInsertionDt = value;
    }

    /**
     * Gets the value of the outSelectedCollateralTableInsertionUsr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSelectedCollateralTableInsertionUsr() {
        return outSelectedCollateralTableInsertionUsr;
    }

    /**
     * Sets the value of the outSelectedCollateralTableInsertionUsr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSelectedCollateralTableInsertionUsr(String value) {
        this.outSelectedCollateralTableInsertionUsr = value;
    }

    /**
     * Gets the value of the outSelectedCollateralTableInternalSn property.
     * 
     */
    public double getOutSelectedCollateralTableInternalSn() {
        return outSelectedCollateralTableInternalSn;
    }

    /**
     * Sets the value of the outSelectedCollateralTableInternalSn property.
     * 
     */
    public void setOutSelectedCollateralTableInternalSn(double value) {
        this.outSelectedCollateralTableInternalSn = value;
    }

    /**
     * Gets the value of the outSelectedCollateralTableLagreDescr2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSelectedCollateralTableLagreDescr2() {
        return outSelectedCollateralTableLagreDescr2;
    }

    /**
     * Sets the value of the outSelectedCollateralTableLagreDescr2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSelectedCollateralTableLagreDescr2(String value) {
        this.outSelectedCollateralTableLagreDescr2 = value;
    }

    /**
     * Gets the value of the outSelectedCollateralTableLargeDescr1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSelectedCollateralTableLargeDescr1() {
        return outSelectedCollateralTableLargeDescr1;
    }

    /**
     * Sets the value of the outSelectedCollateralTableLargeDescr1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSelectedCollateralTableLargeDescr1(String value) {
        this.outSelectedCollateralTableLargeDescr1 = value;
    }

    /**
     * Gets the value of the outSelectedCollateralTableLargeDescr3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSelectedCollateralTableLargeDescr3() {
        return outSelectedCollateralTableLargeDescr3;
    }

    /**
     * Sets the value of the outSelectedCollateralTableLargeDescr3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSelectedCollateralTableLargeDescr3(String value) {
        this.outSelectedCollateralTableLargeDescr3 = value;
    }

    /**
     * Gets the value of the outSelectedCollateralTableModificationDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutSelectedCollateralTableModificationDt() {
        return outSelectedCollateralTableModificationDt;
    }

    /**
     * Sets the value of the outSelectedCollateralTableModificationDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutSelectedCollateralTableModificationDt(XMLGregorianCalendar value) {
        this.outSelectedCollateralTableModificationDt = value;
    }

    /**
     * Gets the value of the outSelectedCollateralTableModificationUsr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSelectedCollateralTableModificationUsr() {
        return outSelectedCollateralTableModificationUsr;
    }

    /**
     * Sets the value of the outSelectedCollateralTableModificationUsr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSelectedCollateralTableModificationUsr(String value) {
        this.outSelectedCollateralTableModificationUsr = value;
    }

    /**
     * Gets the value of the outSelectedCollateralTableNumber1 property.
     * 
     */
    public double getOutSelectedCollateralTableNumber1() {
        return outSelectedCollateralTableNumber1;
    }

    /**
     * Sets the value of the outSelectedCollateralTableNumber1 property.
     * 
     */
    public void setOutSelectedCollateralTableNumber1(double value) {
        this.outSelectedCollateralTableNumber1 = value;
    }

    /**
     * Gets the value of the outSelectedCollateralTableNumber10 property.
     * 
     */
    public double getOutSelectedCollateralTableNumber10() {
        return outSelectedCollateralTableNumber10;
    }

    /**
     * Sets the value of the outSelectedCollateralTableNumber10 property.
     * 
     */
    public void setOutSelectedCollateralTableNumber10(double value) {
        this.outSelectedCollateralTableNumber10 = value;
    }

    /**
     * Gets the value of the outSelectedCollateralTableNumber2 property.
     * 
     */
    public double getOutSelectedCollateralTableNumber2() {
        return outSelectedCollateralTableNumber2;
    }

    /**
     * Sets the value of the outSelectedCollateralTableNumber2 property.
     * 
     */
    public void setOutSelectedCollateralTableNumber2(double value) {
        this.outSelectedCollateralTableNumber2 = value;
    }

    /**
     * Gets the value of the outSelectedCollateralTableNumber3 property.
     * 
     */
    public double getOutSelectedCollateralTableNumber3() {
        return outSelectedCollateralTableNumber3;
    }

    /**
     * Sets the value of the outSelectedCollateralTableNumber3 property.
     * 
     */
    public void setOutSelectedCollateralTableNumber3(double value) {
        this.outSelectedCollateralTableNumber3 = value;
    }

    /**
     * Gets the value of the outSelectedCollateralTableNumber4 property.
     * 
     */
    public double getOutSelectedCollateralTableNumber4() {
        return outSelectedCollateralTableNumber4;
    }

    /**
     * Sets the value of the outSelectedCollateralTableNumber4 property.
     * 
     */
    public void setOutSelectedCollateralTableNumber4(double value) {
        this.outSelectedCollateralTableNumber4 = value;
    }

    /**
     * Gets the value of the outSelectedCollateralTableNumber5 property.
     * 
     */
    public double getOutSelectedCollateralTableNumber5() {
        return outSelectedCollateralTableNumber5;
    }

    /**
     * Sets the value of the outSelectedCollateralTableNumber5 property.
     * 
     */
    public void setOutSelectedCollateralTableNumber5(double value) {
        this.outSelectedCollateralTableNumber5 = value;
    }

    /**
     * Gets the value of the outSelectedCollateralTableNumber6 property.
     * 
     */
    public double getOutSelectedCollateralTableNumber6() {
        return outSelectedCollateralTableNumber6;
    }

    /**
     * Sets the value of the outSelectedCollateralTableNumber6 property.
     * 
     */
    public void setOutSelectedCollateralTableNumber6(double value) {
        this.outSelectedCollateralTableNumber6 = value;
    }

    /**
     * Gets the value of the outSelectedCollateralTableNumber7 property.
     * 
     */
    public double getOutSelectedCollateralTableNumber7() {
        return outSelectedCollateralTableNumber7;
    }

    /**
     * Sets the value of the outSelectedCollateralTableNumber7 property.
     * 
     */
    public void setOutSelectedCollateralTableNumber7(double value) {
        this.outSelectedCollateralTableNumber7 = value;
    }

    /**
     * Gets the value of the outSelectedCollateralTableNumber8 property.
     * 
     */
    public double getOutSelectedCollateralTableNumber8() {
        return outSelectedCollateralTableNumber8;
    }

    /**
     * Sets the value of the outSelectedCollateralTableNumber8 property.
     * 
     */
    public void setOutSelectedCollateralTableNumber8(double value) {
        this.outSelectedCollateralTableNumber8 = value;
    }

    /**
     * Gets the value of the outSelectedCollateralTableNumber9 property.
     * 
     */
    public double getOutSelectedCollateralTableNumber9() {
        return outSelectedCollateralTableNumber9;
    }

    /**
     * Sets the value of the outSelectedCollateralTableNumber9 property.
     * 
     */
    public void setOutSelectedCollateralTableNumber9(double value) {
        this.outSelectedCollateralTableNumber9 = value;
    }

    /**
     * Gets the value of the outSelectedCollateralTablePrftSystem1 property.
     * 
     */
    public short getOutSelectedCollateralTablePrftSystem1() {
        return outSelectedCollateralTablePrftSystem1;
    }

    /**
     * Sets the value of the outSelectedCollateralTablePrftSystem1 property.
     * 
     */
    public void setOutSelectedCollateralTablePrftSystem1(short value) {
        this.outSelectedCollateralTablePrftSystem1 = value;
    }

    /**
     * Gets the value of the outSelectedCollateralTablePrftSystem2 property.
     * 
     */
    public short getOutSelectedCollateralTablePrftSystem2() {
        return outSelectedCollateralTablePrftSystem2;
    }

    /**
     * Sets the value of the outSelectedCollateralTablePrftSystem2 property.
     * 
     */
    public void setOutSelectedCollateralTablePrftSystem2(short value) {
        this.outSelectedCollateralTablePrftSystem2 = value;
    }

    /**
     * Gets the value of the outSelectedCollateralTableProfitsAccount1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSelectedCollateralTableProfitsAccount1() {
        return outSelectedCollateralTableProfitsAccount1;
    }

    /**
     * Sets the value of the outSelectedCollateralTableProfitsAccount1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSelectedCollateralTableProfitsAccount1(String value) {
        this.outSelectedCollateralTableProfitsAccount1 = value;
    }

    /**
     * Gets the value of the outSelectedCollateralTableProfitsAccount2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSelectedCollateralTableProfitsAccount2() {
        return outSelectedCollateralTableProfitsAccount2;
    }

    /**
     * Sets the value of the outSelectedCollateralTableProfitsAccount2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSelectedCollateralTableProfitsAccount2(String value) {
        this.outSelectedCollateralTableProfitsAccount2 = value;
    }

    /**
     * Gets the value of the outSelectedCollateralTableRealEstateId property.
     * 
     */
    public double getOutSelectedCollateralTableRealEstateId() {
        return outSelectedCollateralTableRealEstateId;
    }

    /**
     * Sets the value of the outSelectedCollateralTableRealEstateId property.
     * 
     */
    public void setOutSelectedCollateralTableRealEstateId(double value) {
        this.outSelectedCollateralTableRealEstateId = value;
    }

    /**
     * Gets the value of the outSelectedCollateralTableRecordDescr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSelectedCollateralTableRecordDescr() {
        return outSelectedCollateralTableRecordDescr;
    }

    /**
     * Sets the value of the outSelectedCollateralTableRecordDescr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSelectedCollateralTableRecordDescr(String value) {
        this.outSelectedCollateralTableRecordDescr = value;
    }

    /**
     * Gets the value of the outSelectedCollateralTableRecordType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSelectedCollateralTableRecordType() {
        return outSelectedCollateralTableRecordType;
    }

    /**
     * Sets the value of the outSelectedCollateralTableRecordType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSelectedCollateralTableRecordType(String value) {
        this.outSelectedCollateralTableRecordType = value;
    }

    /**
     * Gets the value of the outSelectedCollateralTableTrxUnit property.
     * 
     */
    public int getOutSelectedCollateralTableTrxUnit() {
        return outSelectedCollateralTableTrxUnit;
    }

    /**
     * Sets the value of the outSelectedCollateralTableTrxUnit property.
     * 
     */
    public void setOutSelectedCollateralTableTrxUnit(int value) {
        this.outSelectedCollateralTableTrxUnit = value;
    }

    /**
     * Gets the value of the outUpdateBankemployeeLastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutUpdateBankemployeeLastName() {
        return outUpdateBankemployeeLastName;
    }

    /**
     * Sets the value of the outUpdateBankemployeeLastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutUpdateBankemployeeLastName(String value) {
        this.outUpdateBankemployeeLastName = value;
    }

    /**
     * Gets the value of the outUsedCollateralColEstValueAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutUsedCollateralColEstValueAmn() {
        return outUsedCollateralColEstValueAmn;
    }

    /**
     * Sets the value of the outUsedCollateralColEstValueAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutUsedCollateralColEstValueAmn(BigDecimal value) {
        this.outUsedCollateralColEstValueAmn = value;
    }

    /**
     * Gets the value of the outUsedCollateralCollateralSn property.
     * 
     */
    public double getOutUsedCollateralCollateralSn() {
        return outUsedCollateralCollateralSn;
    }

    /**
     * Sets the value of the outUsedCollateralCollateralSn property.
     * 
     */
    public void setOutUsedCollateralCollateralSn(double value) {
        this.outUsedCollateralCollateralSn = value;
    }

    /**
     * Gets the value of the outUsedProductDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutUsedProductDescription() {
        return outUsedProductDescription;
    }

    /**
     * Sets the value of the outUsedProductDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutUsedProductDescription(String value) {
        this.outUsedProductDescription = value;
    }

    /**
     * Gets the value of the outUsedProductIdProduct property.
     * 
     */
    public int getOutUsedProductIdProduct() {
        return outUsedProductIdProduct;
    }

    /**
     * Sets the value of the outUsedProductIdProduct property.
     * 
     */
    public void setOutUsedProductIdProduct(int value) {
        this.outUsedProductIdProduct = value;
    }

    /**
     * Gets the value of the outUsedUnitCode property.
     * 
     */
    public int getOutUsedUnitCode() {
        return outUsedUnitCode;
    }

    /**
     * Sets the value of the outUsedUnitCode property.
     * 
     */
    public void setOutUsedUnitCode(int value) {
        this.outUsedUnitCode = value;
    }

    /**
     * Gets the value of the outUsedUnitUnitName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutUsedUnitUnitName() {
        return outUsedUnitUnitName;
    }

    /**
     * Sets the value of the outUsedUnitUnitName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutUsedUnitUnitName(String value) {
        this.outUsedUnitUnitName = value;
    }

    /**
     * Gets the value of the outGrpSrvLog property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfMC2008VOutGrpSrvLogItem }
     *     
     */
    public ArrayOfMC2008VOutGrpSrvLogItem getOutGrpSrvLog() {
        return outGrpSrvLog;
    }

    /**
     * Sets the value of the outGrpSrvLog property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfMC2008VOutGrpSrvLogItem }
     *     
     */
    public void setOutGrpSrvLog(ArrayOfMC2008VOutGrpSrvLogItem value) {
        this.outGrpSrvLog = value;
    }

}
