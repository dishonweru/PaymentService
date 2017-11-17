
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for SecuritiesAccountRetrieveExport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SecuritiesAccountRetrieveExport">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}BaseExport">
 *       &lt;sequence>
 *         &lt;element name="OutBlockJustificDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutBlockJustificIdJustific" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutBondCurrencyIdCurrency" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutBondCurrencyShortDescr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutBondEntryStatusIefSuppliedText15" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutBondMaturityJustificDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutBondMaturityJustificIdJustific" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutCategGenericDetailDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCategGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutCommDepositAccountAccountNumber" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OutCommDepositAccountCDigit" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutCorrespCustListSetDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCorrespCustomerCDigit" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutCorrespCustomerCustId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutCorrespDepositAccountAccountNumber" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OutCorrespDepositAccountCDigit" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutCustRetrievedCustAddressAddress1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustRetrievedCustAddressAddress2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustRetrievedCustAddressAddressType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustRetrievedCustAddressCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustRetrievedCustAddressCommunicationAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustRetrievedCustAddressFaxNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustRetrievedCustAddressRegion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustRetrievedCustAddressTelephone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustRetrievedCustAddressZipCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustRetrievedCustomerCDigit" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutCustRetrievedCustomerCustId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutCustRetrievedCustomerCustType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustRetrievedCustomerDateOfBirth" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutCustRetrievedCustomerEMail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustRetrievedCustomerFatherName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustRetrievedCustomerFirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustRetrievedCustomerMotherName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustRetrievedCustomerNonResident" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustRetrievedCustomerSex" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustRetrievedCustomerShortName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustRetrievedCustomerSurname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustRetrievedCustomerTelephone1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustRetrievedOtherAfmAfmNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutDepAccCdCommIefSuppliedCheckDigit" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutDepAccCdCorrespIefSuppliedCheckDigit" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutDepAccCommCurrencyIdCurrency" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutDepAccCommCurrencyShortDescr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutDepAccCommProductIdProduct" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutDepAccCommUnitCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutDepAccCorrespCurrencyIdCurrency" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutDepAccCorrespCurrencyShortDescr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutDepAccCorrespProductIdProduct" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutDepAccCorrespUnitCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutEnableFieldsIefSuppliedFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutEvalResultTeamInformationAuthorizationType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutEvalResultTeamInformationEvaluationResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutEvalResultTeamInformationRequiredProfile1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutEvalResultTeamInformationRequiredProfile2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutFaceValueCurrencyIdCurrency" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutFaceValueCurrencyShortDescr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutFinscGenericDetailDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutFinscGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGroupGenericDetailDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGroupGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGrpLength" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutLiquitLnsCommissionDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutLiquitLnsCommissionIdCommission" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutMutualFundCustomerCDigit" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutMutualFundCustomerCustId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutMutualFundListSetDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutNontradeTrbondBondDescGr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutParticDepositAccountAccountNumber" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OutParticDepositAccountCDigit" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutParticLnsCommissionDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutParticLnsCommissionIdCommission" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutProductDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutProductIdProduct" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutReplyTrbondBondCurrCoupon" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutRightsTrbondBondDescGr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSecuritiesTypeTypeDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSecuritiesTypeTypeId" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutSelectedCustListSetDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSelectedDepCommProfitsAccountAccountCd" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutSelectedDepCommProfitsAccountAccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSelectedDepCommProfitsAccountPrftSystem" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutSelectedDepCorrespProfitsAccountAccountCd" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutSelectedDepCorrespProfitsAccountAccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSelectedDepCorrespProfitsAccountPrftSystem" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutSelectedDepProfitsAccountAccountCd" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutSelectedDepProfitsAccountAccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSrvGrpLogLength" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutSubcategGenericDetailDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSubcategGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutTrbondBondAddress1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutTrbondBondAddress2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutTrbondBondCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutTrbondBondCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutTrbondBondCompany" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutTrbondBondCountry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutTrbondBondCoupons" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutTrbondBondCurrCoupon" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutTrbondBondDenomination" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutTrbondBondDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutTrbondBondDescGr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutTrbondBondDurationUnit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutTrbondBondDurationVal" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutTrbondBondFlagResident" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutTrbondBondFmtEnd" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutTrbondBondFmtStart" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutTrbondBondInterestFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutTrbondBondInterestPctg" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutTrbondBondIsin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutTrbondBondPhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutTrbondBondRenewalFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutTrbondBondReutersCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutTrbondBondTaxRegNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutTrbondBondXaaCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutTrbondBondZip" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutTrbondCustomerFlags" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutTrbondDisposalAccCd" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutTrbondDisposalAccSn" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutTrbondDisposalAccType" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutTrbondDisposalAccUnit" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutTrbondDisposalAdminFlg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutTrbondDistrEndDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutTrbondDistrStartDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutTrbondEndOfOrdersTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutTrbondEntryStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutTrbondInitDistrValue" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutTrbondInitialBondCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutTrbondIntCalcDaysbase" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutTrbondIntCalcDurDays" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutTrbondLastTrxUnit" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutTrbondLastTrxUsr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutTrbondMaxAcquisitionAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutTrbondMinTradingQty" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutTrbondNonTradeableBond" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutTrbondRegisterFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutTrbondRightsBond" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutTrbondSecuritiesType" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutTrbondShareType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutTrbondTaxPctgNonResid" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutTrbondTaxPctgResident" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutTrbondTmstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutTrbondTradingAccCd" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutTrbondTradingAccSn" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutTrbondTradingAccType" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutTrbondTradingAccUnit" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutTrnsfLnsCommissionDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutTrnsfLnsCommissionIdCommission" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutUnblockJustificDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutUnblockJustificIdJustific" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGrp" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}ArrayOfOutGrpTf" minOccurs="0"/>
 *         &lt;element name="OutSrvGrpLog" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}ArrayOfOutSrvGrpLog" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecuritiesAccountRetrieveExport", propOrder = {
    "outBlockJustificDescription",
    "outBlockJustificIdJustific",
    "outBondCurrencyIdCurrency",
    "outBondCurrencyShortDescr",
    "outBondEntryStatusIefSuppliedText15",
    "outBondMaturityJustificDescription",
    "outBondMaturityJustificIdJustific",
    "outCategGenericDetailDescription",
    "outCategGenericDetailSerialNum",
    "outCommDepositAccountAccountNumber",
    "outCommDepositAccountCDigit",
    "outCorrespCustListSetDescription",
    "outCorrespCustomerCDigit",
    "outCorrespCustomerCustId",
    "outCorrespDepositAccountAccountNumber",
    "outCorrespDepositAccountCDigit",
    "outCustRetrievedCustAddressAddress1",
    "outCustRetrievedCustAddressAddress2",
    "outCustRetrievedCustAddressAddressType",
    "outCustRetrievedCustAddressCity",
    "outCustRetrievedCustAddressCommunicationAddress",
    "outCustRetrievedCustAddressFaxNo",
    "outCustRetrievedCustAddressRegion",
    "outCustRetrievedCustAddressTelephone",
    "outCustRetrievedCustAddressZipCode",
    "outCustRetrievedCustomerCDigit",
    "outCustRetrievedCustomerCustId",
    "outCustRetrievedCustomerCustType",
    "outCustRetrievedCustomerDateOfBirth",
    "outCustRetrievedCustomerEMail",
    "outCustRetrievedCustomerFatherName",
    "outCustRetrievedCustomerFirstName",
    "outCustRetrievedCustomerMotherName",
    "outCustRetrievedCustomerNonResident",
    "outCustRetrievedCustomerSex",
    "outCustRetrievedCustomerShortName",
    "outCustRetrievedCustomerSurname",
    "outCustRetrievedCustomerTelephone1",
    "outCustRetrievedOtherAfmAfmNo",
    "outDepAccCdCommIefSuppliedCheckDigit",
    "outDepAccCdCorrespIefSuppliedCheckDigit",
    "outDepAccCommCurrencyIdCurrency",
    "outDepAccCommCurrencyShortDescr",
    "outDepAccCommProductIdProduct",
    "outDepAccCommUnitCode",
    "outDepAccCorrespCurrencyIdCurrency",
    "outDepAccCorrespCurrencyShortDescr",
    "outDepAccCorrespProductIdProduct",
    "outDepAccCorrespUnitCode",
    "outEnableFieldsIefSuppliedFlag",
    "outEvalResultTeamInformationAuthorizationType",
    "outEvalResultTeamInformationEvaluationResult",
    "outEvalResultTeamInformationRequiredProfile1",
    "outEvalResultTeamInformationRequiredProfile2",
    "outFaceValueCurrencyIdCurrency",
    "outFaceValueCurrencyShortDescr",
    "outFinscGenericDetailDescription",
    "outFinscGenericDetailSerialNum",
    "outGroupGenericDetailDescription",
    "outGroupGenericDetailSerialNum",
    "outGrpLength",
    "outLiquitLnsCommissionDescription",
    "outLiquitLnsCommissionIdCommission",
    "outMutualFundCustomerCDigit",
    "outMutualFundCustomerCustId",
    "outMutualFundListSetDescription",
    "outNontradeTrbondBondDescGr",
    "outParticDepositAccountAccountNumber",
    "outParticDepositAccountCDigit",
    "outParticLnsCommissionDescription",
    "outParticLnsCommissionIdCommission",
    "outProductDescription",
    "outProductIdProduct",
    "outReplyTrbondBondCurrCoupon",
    "outRightsTrbondBondDescGr",
    "outSecuritiesTypeTypeDesc",
    "outSecuritiesTypeTypeId",
    "outSelectedCustListSetDescription",
    "outSelectedDepCommProfitsAccountAccountCd",
    "outSelectedDepCommProfitsAccountAccountNumber",
    "outSelectedDepCommProfitsAccountPrftSystem",
    "outSelectedDepCorrespProfitsAccountAccountCd",
    "outSelectedDepCorrespProfitsAccountAccountNumber",
    "outSelectedDepCorrespProfitsAccountPrftSystem",
    "outSelectedDepProfitsAccountAccountCd",
    "outSelectedDepProfitsAccountAccountNumber",
    "outSrvGrpLogLength",
    "outSubcategGenericDetailDescription",
    "outSubcategGenericDetailSerialNum",
    "outTrbondBondAddress1",
    "outTrbondBondAddress2",
    "outTrbondBondCity",
    "outTrbondBondCode",
    "outTrbondBondCompany",
    "outTrbondBondCountry",
    "outTrbondBondCoupons",
    "outTrbondBondCurrCoupon",
    "outTrbondBondDenomination",
    "outTrbondBondDesc",
    "outTrbondBondDescGr",
    "outTrbondBondDurationUnit",
    "outTrbondBondDurationVal",
    "outTrbondBondFlagResident",
    "outTrbondBondFmtEnd",
    "outTrbondBondFmtStart",
    "outTrbondBondInterestFlag",
    "outTrbondBondInterestPctg",
    "outTrbondBondIsin",
    "outTrbondBondPhone",
    "outTrbondBondRenewalFlag",
    "outTrbondBondReutersCode",
    "outTrbondBondTaxRegNo",
    "outTrbondBondXaaCode",
    "outTrbondBondZip",
    "outTrbondCustomerFlags",
    "outTrbondDisposalAccCd",
    "outTrbondDisposalAccSn",
    "outTrbondDisposalAccType",
    "outTrbondDisposalAccUnit",
    "outTrbondDisposalAdminFlg",
    "outTrbondDistrEndDate",
    "outTrbondDistrStartDate",
    "outTrbondEndOfOrdersTime",
    "outTrbondEntryStatus",
    "outTrbondInitDistrValue",
    "outTrbondInitialBondCode",
    "outTrbondIntCalcDaysbase",
    "outTrbondIntCalcDurDays",
    "outTrbondLastTrxUnit",
    "outTrbondLastTrxUsr",
    "outTrbondMaxAcquisitionAmount",
    "outTrbondMinTradingQty",
    "outTrbondNonTradeableBond",
    "outTrbondRegisterFlag",
    "outTrbondRightsBond",
    "outTrbondSecuritiesType",
    "outTrbondShareType",
    "outTrbondTaxPctgNonResid",
    "outTrbondTaxPctgResident",
    "outTrbondTmstamp",
    "outTrbondTradingAccCd",
    "outTrbondTradingAccSn",
    "outTrbondTradingAccType",
    "outTrbondTradingAccUnit",
    "outTrnsfLnsCommissionDescription",
    "outTrnsfLnsCommissionIdCommission",
    "outUnblockJustificDescription",
    "outUnblockJustificIdJustific",
    "outGrp",
    "outSrvGrpLog"
})
public class SecuritiesAccountRetrieveExport
    extends BaseExport
{

    @XmlElement(name = "OutBlockJustificDescription")
    protected String outBlockJustificDescription;
    @XmlElement(name = "OutBlockJustificIdJustific")
    protected int outBlockJustificIdJustific;
    @XmlElement(name = "OutBondCurrencyIdCurrency")
    protected int outBondCurrencyIdCurrency;
    @XmlElement(name = "OutBondCurrencyShortDescr")
    protected String outBondCurrencyShortDescr;
    @XmlElement(name = "OutBondEntryStatusIefSuppliedText15")
    protected String outBondEntryStatusIefSuppliedText15;
    @XmlElement(name = "OutBondMaturityJustificDescription")
    protected String outBondMaturityJustificDescription;
    @XmlElement(name = "OutBondMaturityJustificIdJustific")
    protected int outBondMaturityJustificIdJustific;
    @XmlElement(name = "OutCategGenericDetailDescription")
    protected String outCategGenericDetailDescription;
    @XmlElement(name = "OutCategGenericDetailSerialNum")
    protected int outCategGenericDetailSerialNum;
    @XmlElement(name = "OutCommDepositAccountAccountNumber")
    protected double outCommDepositAccountAccountNumber;
    @XmlElement(name = "OutCommDepositAccountCDigit")
    protected short outCommDepositAccountCDigit;
    @XmlElement(name = "OutCorrespCustListSetDescription")
    protected String outCorrespCustListSetDescription;
    @XmlElement(name = "OutCorrespCustomerCDigit")
    protected short outCorrespCustomerCDigit;
    @XmlElement(name = "OutCorrespCustomerCustId")
    protected int outCorrespCustomerCustId;
    @XmlElement(name = "OutCorrespDepositAccountAccountNumber")
    protected double outCorrespDepositAccountAccountNumber;
    @XmlElement(name = "OutCorrespDepositAccountCDigit")
    protected short outCorrespDepositAccountCDigit;
    @XmlElement(name = "OutCustRetrievedCustAddressAddress1")
    protected String outCustRetrievedCustAddressAddress1;
    @XmlElement(name = "OutCustRetrievedCustAddressAddress2")
    protected String outCustRetrievedCustAddressAddress2;
    @XmlElement(name = "OutCustRetrievedCustAddressAddressType")
    protected String outCustRetrievedCustAddressAddressType;
    @XmlElement(name = "OutCustRetrievedCustAddressCity")
    protected String outCustRetrievedCustAddressCity;
    @XmlElement(name = "OutCustRetrievedCustAddressCommunicationAddress")
    protected String outCustRetrievedCustAddressCommunicationAddress;
    @XmlElement(name = "OutCustRetrievedCustAddressFaxNo")
    protected String outCustRetrievedCustAddressFaxNo;
    @XmlElement(name = "OutCustRetrievedCustAddressRegion")
    protected String outCustRetrievedCustAddressRegion;
    @XmlElement(name = "OutCustRetrievedCustAddressTelephone")
    protected String outCustRetrievedCustAddressTelephone;
    @XmlElement(name = "OutCustRetrievedCustAddressZipCode")
    protected String outCustRetrievedCustAddressZipCode;
    @XmlElement(name = "OutCustRetrievedCustomerCDigit")
    protected short outCustRetrievedCustomerCDigit;
    @XmlElement(name = "OutCustRetrievedCustomerCustId")
    protected int outCustRetrievedCustomerCustId;
    @XmlElement(name = "OutCustRetrievedCustomerCustType")
    protected String outCustRetrievedCustomerCustType;
    @XmlElement(name = "OutCustRetrievedCustomerDateOfBirth", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outCustRetrievedCustomerDateOfBirth;
    @XmlElement(name = "OutCustRetrievedCustomerEMail")
    protected String outCustRetrievedCustomerEMail;
    @XmlElement(name = "OutCustRetrievedCustomerFatherName")
    protected String outCustRetrievedCustomerFatherName;
    @XmlElement(name = "OutCustRetrievedCustomerFirstName")
    protected String outCustRetrievedCustomerFirstName;
    @XmlElement(name = "OutCustRetrievedCustomerMotherName")
    protected String outCustRetrievedCustomerMotherName;
    @XmlElement(name = "OutCustRetrievedCustomerNonResident")
    protected String outCustRetrievedCustomerNonResident;
    @XmlElement(name = "OutCustRetrievedCustomerSex")
    protected String outCustRetrievedCustomerSex;
    @XmlElement(name = "OutCustRetrievedCustomerShortName")
    protected String outCustRetrievedCustomerShortName;
    @XmlElement(name = "OutCustRetrievedCustomerSurname")
    protected String outCustRetrievedCustomerSurname;
    @XmlElement(name = "OutCustRetrievedCustomerTelephone1")
    protected String outCustRetrievedCustomerTelephone1;
    @XmlElement(name = "OutCustRetrievedOtherAfmAfmNo")
    protected String outCustRetrievedOtherAfmAfmNo;
    @XmlElement(name = "OutDepAccCdCommIefSuppliedCheckDigit")
    protected short outDepAccCdCommIefSuppliedCheckDigit;
    @XmlElement(name = "OutDepAccCdCorrespIefSuppliedCheckDigit")
    protected short outDepAccCdCorrespIefSuppliedCheckDigit;
    @XmlElement(name = "OutDepAccCommCurrencyIdCurrency")
    protected int outDepAccCommCurrencyIdCurrency;
    @XmlElement(name = "OutDepAccCommCurrencyShortDescr")
    protected String outDepAccCommCurrencyShortDescr;
    @XmlElement(name = "OutDepAccCommProductIdProduct")
    protected int outDepAccCommProductIdProduct;
    @XmlElement(name = "OutDepAccCommUnitCode")
    protected int outDepAccCommUnitCode;
    @XmlElement(name = "OutDepAccCorrespCurrencyIdCurrency")
    protected int outDepAccCorrespCurrencyIdCurrency;
    @XmlElement(name = "OutDepAccCorrespCurrencyShortDescr")
    protected String outDepAccCorrespCurrencyShortDescr;
    @XmlElement(name = "OutDepAccCorrespProductIdProduct")
    protected int outDepAccCorrespProductIdProduct;
    @XmlElement(name = "OutDepAccCorrespUnitCode")
    protected int outDepAccCorrespUnitCode;
    @XmlElement(name = "OutEnableFieldsIefSuppliedFlag")
    protected String outEnableFieldsIefSuppliedFlag;
    @XmlElement(name = "OutEvalResultTeamInformationAuthorizationType")
    protected String outEvalResultTeamInformationAuthorizationType;
    @XmlElement(name = "OutEvalResultTeamInformationEvaluationResult")
    protected String outEvalResultTeamInformationEvaluationResult;
    @XmlElement(name = "OutEvalResultTeamInformationRequiredProfile1")
    protected String outEvalResultTeamInformationRequiredProfile1;
    @XmlElement(name = "OutEvalResultTeamInformationRequiredProfile2")
    protected String outEvalResultTeamInformationRequiredProfile2;
    @XmlElement(name = "OutFaceValueCurrencyIdCurrency")
    protected int outFaceValueCurrencyIdCurrency;
    @XmlElement(name = "OutFaceValueCurrencyShortDescr")
    protected String outFaceValueCurrencyShortDescr;
    @XmlElement(name = "OutFinscGenericDetailDescription")
    protected String outFinscGenericDetailDescription;
    @XmlElement(name = "OutFinscGenericDetailSerialNum")
    protected int outFinscGenericDetailSerialNum;
    @XmlElement(name = "OutGroupGenericDetailDescription")
    protected String outGroupGenericDetailDescription;
    @XmlElement(name = "OutGroupGenericDetailSerialNum")
    protected int outGroupGenericDetailSerialNum;
    @XmlElement(name = "OutGrpLength")
    protected int outGrpLength;
    @XmlElement(name = "OutLiquitLnsCommissionDescription")
    protected String outLiquitLnsCommissionDescription;
    @XmlElement(name = "OutLiquitLnsCommissionIdCommission")
    protected int outLiquitLnsCommissionIdCommission;
    @XmlElement(name = "OutMutualFundCustomerCDigit")
    protected short outMutualFundCustomerCDigit;
    @XmlElement(name = "OutMutualFundCustomerCustId")
    protected int outMutualFundCustomerCustId;
    @XmlElement(name = "OutMutualFundListSetDescription")
    protected String outMutualFundListSetDescription;
    @XmlElement(name = "OutNontradeTrbondBondDescGr")
    protected String outNontradeTrbondBondDescGr;
    @XmlElement(name = "OutParticDepositAccountAccountNumber")
    protected double outParticDepositAccountAccountNumber;
    @XmlElement(name = "OutParticDepositAccountCDigit")
    protected short outParticDepositAccountCDigit;
    @XmlElement(name = "OutParticLnsCommissionDescription")
    protected String outParticLnsCommissionDescription;
    @XmlElement(name = "OutParticLnsCommissionIdCommission")
    protected int outParticLnsCommissionIdCommission;
    @XmlElement(name = "OutProductDescription")
    protected String outProductDescription;
    @XmlElement(name = "OutProductIdProduct")
    protected int outProductIdProduct;
    @XmlElement(name = "OutReplyTrbondBondCurrCoupon")
    protected short outReplyTrbondBondCurrCoupon;
    @XmlElement(name = "OutRightsTrbondBondDescGr")
    protected String outRightsTrbondBondDescGr;
    @XmlElement(name = "OutSecuritiesTypeTypeDesc")
    protected String outSecuritiesTypeTypeDesc;
    @XmlElement(name = "OutSecuritiesTypeTypeId")
    protected short outSecuritiesTypeTypeId;
    @XmlElement(name = "OutSelectedCustListSetDescription")
    protected String outSelectedCustListSetDescription;
    @XmlElement(name = "OutSelectedDepCommProfitsAccountAccountCd")
    protected short outSelectedDepCommProfitsAccountAccountCd;
    @XmlElement(name = "OutSelectedDepCommProfitsAccountAccountNumber")
    protected String outSelectedDepCommProfitsAccountAccountNumber;
    @XmlElement(name = "OutSelectedDepCommProfitsAccountPrftSystem")
    protected short outSelectedDepCommProfitsAccountPrftSystem;
    @XmlElement(name = "OutSelectedDepCorrespProfitsAccountAccountCd")
    protected short outSelectedDepCorrespProfitsAccountAccountCd;
    @XmlElement(name = "OutSelectedDepCorrespProfitsAccountAccountNumber")
    protected String outSelectedDepCorrespProfitsAccountAccountNumber;
    @XmlElement(name = "OutSelectedDepCorrespProfitsAccountPrftSystem")
    protected short outSelectedDepCorrespProfitsAccountPrftSystem;
    @XmlElement(name = "OutSelectedDepProfitsAccountAccountCd")
    protected short outSelectedDepProfitsAccountAccountCd;
    @XmlElement(name = "OutSelectedDepProfitsAccountAccountNumber")
    protected String outSelectedDepProfitsAccountAccountNumber;
    @XmlElement(name = "OutSrvGrpLogLength")
    protected int outSrvGrpLogLength;
    @XmlElement(name = "OutSubcategGenericDetailDescription")
    protected String outSubcategGenericDetailDescription;
    @XmlElement(name = "OutSubcategGenericDetailSerialNum")
    protected int outSubcategGenericDetailSerialNum;
    @XmlElement(name = "OutTrbondBondAddress1")
    protected String outTrbondBondAddress1;
    @XmlElement(name = "OutTrbondBondAddress2")
    protected String outTrbondBondAddress2;
    @XmlElement(name = "OutTrbondBondCity")
    protected String outTrbondBondCity;
    @XmlElement(name = "OutTrbondBondCode")
    protected String outTrbondBondCode;
    @XmlElement(name = "OutTrbondBondCompany")
    protected String outTrbondBondCompany;
    @XmlElement(name = "OutTrbondBondCountry")
    protected String outTrbondBondCountry;
    @XmlElement(name = "OutTrbondBondCoupons")
    protected short outTrbondBondCoupons;
    @XmlElement(name = "OutTrbondBondCurrCoupon")
    protected short outTrbondBondCurrCoupon;
    @XmlElement(name = "OutTrbondBondDenomination", required = true)
    protected BigDecimal outTrbondBondDenomination;
    @XmlElement(name = "OutTrbondBondDesc")
    protected String outTrbondBondDesc;
    @XmlElement(name = "OutTrbondBondDescGr")
    protected String outTrbondBondDescGr;
    @XmlElement(name = "OutTrbondBondDurationUnit")
    protected String outTrbondBondDurationUnit;
    @XmlElement(name = "OutTrbondBondDurationVal")
    protected short outTrbondBondDurationVal;
    @XmlElement(name = "OutTrbondBondFlagResident")
    protected String outTrbondBondFlagResident;
    @XmlElement(name = "OutTrbondBondFmtEnd", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outTrbondBondFmtEnd;
    @XmlElement(name = "OutTrbondBondFmtStart", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outTrbondBondFmtStart;
    @XmlElement(name = "OutTrbondBondInterestFlag")
    protected String outTrbondBondInterestFlag;
    @XmlElement(name = "OutTrbondBondInterestPctg", required = true)
    protected BigDecimal outTrbondBondInterestPctg;
    @XmlElement(name = "OutTrbondBondIsin")
    protected String outTrbondBondIsin;
    @XmlElement(name = "OutTrbondBondPhone")
    protected String outTrbondBondPhone;
    @XmlElement(name = "OutTrbondBondRenewalFlag")
    protected String outTrbondBondRenewalFlag;
    @XmlElement(name = "OutTrbondBondReutersCode")
    protected String outTrbondBondReutersCode;
    @XmlElement(name = "OutTrbondBondTaxRegNo")
    protected String outTrbondBondTaxRegNo;
    @XmlElement(name = "OutTrbondBondXaaCode")
    protected String outTrbondBondXaaCode;
    @XmlElement(name = "OutTrbondBondZip")
    protected String outTrbondBondZip;
    @XmlElement(name = "OutTrbondCustomerFlags")
    protected String outTrbondCustomerFlags;
    @XmlElement(name = "OutTrbondDisposalAccCd")
    protected short outTrbondDisposalAccCd;
    @XmlElement(name = "OutTrbondDisposalAccSn")
    protected int outTrbondDisposalAccSn;
    @XmlElement(name = "OutTrbondDisposalAccType")
    protected short outTrbondDisposalAccType;
    @XmlElement(name = "OutTrbondDisposalAccUnit")
    protected int outTrbondDisposalAccUnit;
    @XmlElement(name = "OutTrbondDisposalAdminFlg")
    protected String outTrbondDisposalAdminFlg;
    @XmlElement(name = "OutTrbondDistrEndDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outTrbondDistrEndDate;
    @XmlElement(name = "OutTrbondDistrStartDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outTrbondDistrStartDate;
    @XmlElement(name = "OutTrbondEndOfOrdersTime", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outTrbondEndOfOrdersTime;
    @XmlElement(name = "OutTrbondEntryStatus")
    protected String outTrbondEntryStatus;
    @XmlElement(name = "OutTrbondInitDistrValue", required = true)
    protected BigDecimal outTrbondInitDistrValue;
    @XmlElement(name = "OutTrbondInitialBondCode")
    protected String outTrbondInitialBondCode;
    @XmlElement(name = "OutTrbondIntCalcDaysbase")
    protected short outTrbondIntCalcDaysbase;
    @XmlElement(name = "OutTrbondIntCalcDurDays")
    protected short outTrbondIntCalcDurDays;
    @XmlElement(name = "OutTrbondLastTrxUnit")
    protected int outTrbondLastTrxUnit;
    @XmlElement(name = "OutTrbondLastTrxUsr")
    protected String outTrbondLastTrxUsr;
    @XmlElement(name = "OutTrbondMaxAcquisitionAmount", required = true)
    protected BigDecimal outTrbondMaxAcquisitionAmount;
    @XmlElement(name = "OutTrbondMinTradingQty", required = true)
    protected BigDecimal outTrbondMinTradingQty;
    @XmlElement(name = "OutTrbondNonTradeableBond")
    protected String outTrbondNonTradeableBond;
    @XmlElement(name = "OutTrbondRegisterFlag")
    protected String outTrbondRegisterFlag;
    @XmlElement(name = "OutTrbondRightsBond")
    protected String outTrbondRightsBond;
    @XmlElement(name = "OutTrbondSecuritiesType")
    protected short outTrbondSecuritiesType;
    @XmlElement(name = "OutTrbondShareType")
    protected String outTrbondShareType;
    @XmlElement(name = "OutTrbondTaxPctgNonResid", required = true)
    protected BigDecimal outTrbondTaxPctgNonResid;
    @XmlElement(name = "OutTrbondTaxPctgResident", required = true)
    protected BigDecimal outTrbondTaxPctgResident;
    @XmlElement(name = "OutTrbondTmstamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outTrbondTmstamp;
    @XmlElement(name = "OutTrbondTradingAccCd")
    protected short outTrbondTradingAccCd;
    @XmlElement(name = "OutTrbondTradingAccSn")
    protected int outTrbondTradingAccSn;
    @XmlElement(name = "OutTrbondTradingAccType")
    protected short outTrbondTradingAccType;
    @XmlElement(name = "OutTrbondTradingAccUnit")
    protected int outTrbondTradingAccUnit;
    @XmlElement(name = "OutTrnsfLnsCommissionDescription")
    protected String outTrnsfLnsCommissionDescription;
    @XmlElement(name = "OutTrnsfLnsCommissionIdCommission")
    protected int outTrnsfLnsCommissionIdCommission;
    @XmlElement(name = "OutUnblockJustificDescription")
    protected String outUnblockJustificDescription;
    @XmlElement(name = "OutUnblockJustificIdJustific")
    protected int outUnblockJustificIdJustific;
    @XmlElement(name = "OutGrp")
    protected ArrayOfOutGrpTf outGrp;
    @XmlElement(name = "OutSrvGrpLog")
    protected ArrayOfOutSrvGrpLog outSrvGrpLog;

    /**
     * Gets the value of the outBlockJustificDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutBlockJustificDescription() {
        return outBlockJustificDescription;
    }

    /**
     * Sets the value of the outBlockJustificDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutBlockJustificDescription(String value) {
        this.outBlockJustificDescription = value;
    }

    /**
     * Gets the value of the outBlockJustificIdJustific property.
     * 
     */
    public int getOutBlockJustificIdJustific() {
        return outBlockJustificIdJustific;
    }

    /**
     * Sets the value of the outBlockJustificIdJustific property.
     * 
     */
    public void setOutBlockJustificIdJustific(int value) {
        this.outBlockJustificIdJustific = value;
    }

    /**
     * Gets the value of the outBondCurrencyIdCurrency property.
     * 
     */
    public int getOutBondCurrencyIdCurrency() {
        return outBondCurrencyIdCurrency;
    }

    /**
     * Sets the value of the outBondCurrencyIdCurrency property.
     * 
     */
    public void setOutBondCurrencyIdCurrency(int value) {
        this.outBondCurrencyIdCurrency = value;
    }

    /**
     * Gets the value of the outBondCurrencyShortDescr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutBondCurrencyShortDescr() {
        return outBondCurrencyShortDescr;
    }

    /**
     * Sets the value of the outBondCurrencyShortDescr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutBondCurrencyShortDescr(String value) {
        this.outBondCurrencyShortDescr = value;
    }

    /**
     * Gets the value of the outBondEntryStatusIefSuppliedText15 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutBondEntryStatusIefSuppliedText15() {
        return outBondEntryStatusIefSuppliedText15;
    }

    /**
     * Sets the value of the outBondEntryStatusIefSuppliedText15 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutBondEntryStatusIefSuppliedText15(String value) {
        this.outBondEntryStatusIefSuppliedText15 = value;
    }

    /**
     * Gets the value of the outBondMaturityJustificDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutBondMaturityJustificDescription() {
        return outBondMaturityJustificDescription;
    }

    /**
     * Sets the value of the outBondMaturityJustificDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutBondMaturityJustificDescription(String value) {
        this.outBondMaturityJustificDescription = value;
    }

    /**
     * Gets the value of the outBondMaturityJustificIdJustific property.
     * 
     */
    public int getOutBondMaturityJustificIdJustific() {
        return outBondMaturityJustificIdJustific;
    }

    /**
     * Sets the value of the outBondMaturityJustificIdJustific property.
     * 
     */
    public void setOutBondMaturityJustificIdJustific(int value) {
        this.outBondMaturityJustificIdJustific = value;
    }

    /**
     * Gets the value of the outCategGenericDetailDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCategGenericDetailDescription() {
        return outCategGenericDetailDescription;
    }

    /**
     * Sets the value of the outCategGenericDetailDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCategGenericDetailDescription(String value) {
        this.outCategGenericDetailDescription = value;
    }

    /**
     * Gets the value of the outCategGenericDetailSerialNum property.
     * 
     */
    public int getOutCategGenericDetailSerialNum() {
        return outCategGenericDetailSerialNum;
    }

    /**
     * Sets the value of the outCategGenericDetailSerialNum property.
     * 
     */
    public void setOutCategGenericDetailSerialNum(int value) {
        this.outCategGenericDetailSerialNum = value;
    }

    /**
     * Gets the value of the outCommDepositAccountAccountNumber property.
     * 
     */
    public double getOutCommDepositAccountAccountNumber() {
        return outCommDepositAccountAccountNumber;
    }

    /**
     * Sets the value of the outCommDepositAccountAccountNumber property.
     * 
     */
    public void setOutCommDepositAccountAccountNumber(double value) {
        this.outCommDepositAccountAccountNumber = value;
    }

    /**
     * Gets the value of the outCommDepositAccountCDigit property.
     * 
     */
    public short getOutCommDepositAccountCDigit() {
        return outCommDepositAccountCDigit;
    }

    /**
     * Sets the value of the outCommDepositAccountCDigit property.
     * 
     */
    public void setOutCommDepositAccountCDigit(short value) {
        this.outCommDepositAccountCDigit = value;
    }

    /**
     * Gets the value of the outCorrespCustListSetDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCorrespCustListSetDescription() {
        return outCorrespCustListSetDescription;
    }

    /**
     * Sets the value of the outCorrespCustListSetDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCorrespCustListSetDescription(String value) {
        this.outCorrespCustListSetDescription = value;
    }

    /**
     * Gets the value of the outCorrespCustomerCDigit property.
     * 
     */
    public short getOutCorrespCustomerCDigit() {
        return outCorrespCustomerCDigit;
    }

    /**
     * Sets the value of the outCorrespCustomerCDigit property.
     * 
     */
    public void setOutCorrespCustomerCDigit(short value) {
        this.outCorrespCustomerCDigit = value;
    }

    /**
     * Gets the value of the outCorrespCustomerCustId property.
     * 
     */
    public int getOutCorrespCustomerCustId() {
        return outCorrespCustomerCustId;
    }

    /**
     * Sets the value of the outCorrespCustomerCustId property.
     * 
     */
    public void setOutCorrespCustomerCustId(int value) {
        this.outCorrespCustomerCustId = value;
    }

    /**
     * Gets the value of the outCorrespDepositAccountAccountNumber property.
     * 
     */
    public double getOutCorrespDepositAccountAccountNumber() {
        return outCorrespDepositAccountAccountNumber;
    }

    /**
     * Sets the value of the outCorrespDepositAccountAccountNumber property.
     * 
     */
    public void setOutCorrespDepositAccountAccountNumber(double value) {
        this.outCorrespDepositAccountAccountNumber = value;
    }

    /**
     * Gets the value of the outCorrespDepositAccountCDigit property.
     * 
     */
    public short getOutCorrespDepositAccountCDigit() {
        return outCorrespDepositAccountCDigit;
    }

    /**
     * Sets the value of the outCorrespDepositAccountCDigit property.
     * 
     */
    public void setOutCorrespDepositAccountCDigit(short value) {
        this.outCorrespDepositAccountCDigit = value;
    }

    /**
     * Gets the value of the outCustRetrievedCustAddressAddress1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCustRetrievedCustAddressAddress1() {
        return outCustRetrievedCustAddressAddress1;
    }

    /**
     * Sets the value of the outCustRetrievedCustAddressAddress1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCustRetrievedCustAddressAddress1(String value) {
        this.outCustRetrievedCustAddressAddress1 = value;
    }

    /**
     * Gets the value of the outCustRetrievedCustAddressAddress2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCustRetrievedCustAddressAddress2() {
        return outCustRetrievedCustAddressAddress2;
    }

    /**
     * Sets the value of the outCustRetrievedCustAddressAddress2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCustRetrievedCustAddressAddress2(String value) {
        this.outCustRetrievedCustAddressAddress2 = value;
    }

    /**
     * Gets the value of the outCustRetrievedCustAddressAddressType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCustRetrievedCustAddressAddressType() {
        return outCustRetrievedCustAddressAddressType;
    }

    /**
     * Sets the value of the outCustRetrievedCustAddressAddressType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCustRetrievedCustAddressAddressType(String value) {
        this.outCustRetrievedCustAddressAddressType = value;
    }

    /**
     * Gets the value of the outCustRetrievedCustAddressCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCustRetrievedCustAddressCity() {
        return outCustRetrievedCustAddressCity;
    }

    /**
     * Sets the value of the outCustRetrievedCustAddressCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCustRetrievedCustAddressCity(String value) {
        this.outCustRetrievedCustAddressCity = value;
    }

    /**
     * Gets the value of the outCustRetrievedCustAddressCommunicationAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCustRetrievedCustAddressCommunicationAddress() {
        return outCustRetrievedCustAddressCommunicationAddress;
    }

    /**
     * Sets the value of the outCustRetrievedCustAddressCommunicationAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCustRetrievedCustAddressCommunicationAddress(String value) {
        this.outCustRetrievedCustAddressCommunicationAddress = value;
    }

    /**
     * Gets the value of the outCustRetrievedCustAddressFaxNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCustRetrievedCustAddressFaxNo() {
        return outCustRetrievedCustAddressFaxNo;
    }

    /**
     * Sets the value of the outCustRetrievedCustAddressFaxNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCustRetrievedCustAddressFaxNo(String value) {
        this.outCustRetrievedCustAddressFaxNo = value;
    }

    /**
     * Gets the value of the outCustRetrievedCustAddressRegion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCustRetrievedCustAddressRegion() {
        return outCustRetrievedCustAddressRegion;
    }

    /**
     * Sets the value of the outCustRetrievedCustAddressRegion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCustRetrievedCustAddressRegion(String value) {
        this.outCustRetrievedCustAddressRegion = value;
    }

    /**
     * Gets the value of the outCustRetrievedCustAddressTelephone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCustRetrievedCustAddressTelephone() {
        return outCustRetrievedCustAddressTelephone;
    }

    /**
     * Sets the value of the outCustRetrievedCustAddressTelephone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCustRetrievedCustAddressTelephone(String value) {
        this.outCustRetrievedCustAddressTelephone = value;
    }

    /**
     * Gets the value of the outCustRetrievedCustAddressZipCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCustRetrievedCustAddressZipCode() {
        return outCustRetrievedCustAddressZipCode;
    }

    /**
     * Sets the value of the outCustRetrievedCustAddressZipCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCustRetrievedCustAddressZipCode(String value) {
        this.outCustRetrievedCustAddressZipCode = value;
    }

    /**
     * Gets the value of the outCustRetrievedCustomerCDigit property.
     * 
     */
    public short getOutCustRetrievedCustomerCDigit() {
        return outCustRetrievedCustomerCDigit;
    }

    /**
     * Sets the value of the outCustRetrievedCustomerCDigit property.
     * 
     */
    public void setOutCustRetrievedCustomerCDigit(short value) {
        this.outCustRetrievedCustomerCDigit = value;
    }

    /**
     * Gets the value of the outCustRetrievedCustomerCustId property.
     * 
     */
    public int getOutCustRetrievedCustomerCustId() {
        return outCustRetrievedCustomerCustId;
    }

    /**
     * Sets the value of the outCustRetrievedCustomerCustId property.
     * 
     */
    public void setOutCustRetrievedCustomerCustId(int value) {
        this.outCustRetrievedCustomerCustId = value;
    }

    /**
     * Gets the value of the outCustRetrievedCustomerCustType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCustRetrievedCustomerCustType() {
        return outCustRetrievedCustomerCustType;
    }

    /**
     * Sets the value of the outCustRetrievedCustomerCustType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCustRetrievedCustomerCustType(String value) {
        this.outCustRetrievedCustomerCustType = value;
    }

    /**
     * Gets the value of the outCustRetrievedCustomerDateOfBirth property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutCustRetrievedCustomerDateOfBirth() {
        return outCustRetrievedCustomerDateOfBirth;
    }

    /**
     * Sets the value of the outCustRetrievedCustomerDateOfBirth property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutCustRetrievedCustomerDateOfBirth(XMLGregorianCalendar value) {
        this.outCustRetrievedCustomerDateOfBirth = value;
    }

    /**
     * Gets the value of the outCustRetrievedCustomerEMail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCustRetrievedCustomerEMail() {
        return outCustRetrievedCustomerEMail;
    }

    /**
     * Sets the value of the outCustRetrievedCustomerEMail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCustRetrievedCustomerEMail(String value) {
        this.outCustRetrievedCustomerEMail = value;
    }

    /**
     * Gets the value of the outCustRetrievedCustomerFatherName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCustRetrievedCustomerFatherName() {
        return outCustRetrievedCustomerFatherName;
    }

    /**
     * Sets the value of the outCustRetrievedCustomerFatherName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCustRetrievedCustomerFatherName(String value) {
        this.outCustRetrievedCustomerFatherName = value;
    }

    /**
     * Gets the value of the outCustRetrievedCustomerFirstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCustRetrievedCustomerFirstName() {
        return outCustRetrievedCustomerFirstName;
    }

    /**
     * Sets the value of the outCustRetrievedCustomerFirstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCustRetrievedCustomerFirstName(String value) {
        this.outCustRetrievedCustomerFirstName = value;
    }

    /**
     * Gets the value of the outCustRetrievedCustomerMotherName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCustRetrievedCustomerMotherName() {
        return outCustRetrievedCustomerMotherName;
    }

    /**
     * Sets the value of the outCustRetrievedCustomerMotherName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCustRetrievedCustomerMotherName(String value) {
        this.outCustRetrievedCustomerMotherName = value;
    }

    /**
     * Gets the value of the outCustRetrievedCustomerNonResident property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCustRetrievedCustomerNonResident() {
        return outCustRetrievedCustomerNonResident;
    }

    /**
     * Sets the value of the outCustRetrievedCustomerNonResident property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCustRetrievedCustomerNonResident(String value) {
        this.outCustRetrievedCustomerNonResident = value;
    }

    /**
     * Gets the value of the outCustRetrievedCustomerSex property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCustRetrievedCustomerSex() {
        return outCustRetrievedCustomerSex;
    }

    /**
     * Sets the value of the outCustRetrievedCustomerSex property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCustRetrievedCustomerSex(String value) {
        this.outCustRetrievedCustomerSex = value;
    }

    /**
     * Gets the value of the outCustRetrievedCustomerShortName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCustRetrievedCustomerShortName() {
        return outCustRetrievedCustomerShortName;
    }

    /**
     * Sets the value of the outCustRetrievedCustomerShortName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCustRetrievedCustomerShortName(String value) {
        this.outCustRetrievedCustomerShortName = value;
    }

    /**
     * Gets the value of the outCustRetrievedCustomerSurname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCustRetrievedCustomerSurname() {
        return outCustRetrievedCustomerSurname;
    }

    /**
     * Sets the value of the outCustRetrievedCustomerSurname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCustRetrievedCustomerSurname(String value) {
        this.outCustRetrievedCustomerSurname = value;
    }

    /**
     * Gets the value of the outCustRetrievedCustomerTelephone1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCustRetrievedCustomerTelephone1() {
        return outCustRetrievedCustomerTelephone1;
    }

    /**
     * Sets the value of the outCustRetrievedCustomerTelephone1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCustRetrievedCustomerTelephone1(String value) {
        this.outCustRetrievedCustomerTelephone1 = value;
    }

    /**
     * Gets the value of the outCustRetrievedOtherAfmAfmNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCustRetrievedOtherAfmAfmNo() {
        return outCustRetrievedOtherAfmAfmNo;
    }

    /**
     * Sets the value of the outCustRetrievedOtherAfmAfmNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCustRetrievedOtherAfmAfmNo(String value) {
        this.outCustRetrievedOtherAfmAfmNo = value;
    }

    /**
     * Gets the value of the outDepAccCdCommIefSuppliedCheckDigit property.
     * 
     */
    public short getOutDepAccCdCommIefSuppliedCheckDigit() {
        return outDepAccCdCommIefSuppliedCheckDigit;
    }

    /**
     * Sets the value of the outDepAccCdCommIefSuppliedCheckDigit property.
     * 
     */
    public void setOutDepAccCdCommIefSuppliedCheckDigit(short value) {
        this.outDepAccCdCommIefSuppliedCheckDigit = value;
    }

    /**
     * Gets the value of the outDepAccCdCorrespIefSuppliedCheckDigit property.
     * 
     */
    public short getOutDepAccCdCorrespIefSuppliedCheckDigit() {
        return outDepAccCdCorrespIefSuppliedCheckDigit;
    }

    /**
     * Sets the value of the outDepAccCdCorrespIefSuppliedCheckDigit property.
     * 
     */
    public void setOutDepAccCdCorrespIefSuppliedCheckDigit(short value) {
        this.outDepAccCdCorrespIefSuppliedCheckDigit = value;
    }

    /**
     * Gets the value of the outDepAccCommCurrencyIdCurrency property.
     * 
     */
    public int getOutDepAccCommCurrencyIdCurrency() {
        return outDepAccCommCurrencyIdCurrency;
    }

    /**
     * Sets the value of the outDepAccCommCurrencyIdCurrency property.
     * 
     */
    public void setOutDepAccCommCurrencyIdCurrency(int value) {
        this.outDepAccCommCurrencyIdCurrency = value;
    }

    /**
     * Gets the value of the outDepAccCommCurrencyShortDescr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutDepAccCommCurrencyShortDescr() {
        return outDepAccCommCurrencyShortDescr;
    }

    /**
     * Sets the value of the outDepAccCommCurrencyShortDescr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutDepAccCommCurrencyShortDescr(String value) {
        this.outDepAccCommCurrencyShortDescr = value;
    }

    /**
     * Gets the value of the outDepAccCommProductIdProduct property.
     * 
     */
    public int getOutDepAccCommProductIdProduct() {
        return outDepAccCommProductIdProduct;
    }

    /**
     * Sets the value of the outDepAccCommProductIdProduct property.
     * 
     */
    public void setOutDepAccCommProductIdProduct(int value) {
        this.outDepAccCommProductIdProduct = value;
    }

    /**
     * Gets the value of the outDepAccCommUnitCode property.
     * 
     */
    public int getOutDepAccCommUnitCode() {
        return outDepAccCommUnitCode;
    }

    /**
     * Sets the value of the outDepAccCommUnitCode property.
     * 
     */
    public void setOutDepAccCommUnitCode(int value) {
        this.outDepAccCommUnitCode = value;
    }

    /**
     * Gets the value of the outDepAccCorrespCurrencyIdCurrency property.
     * 
     */
    public int getOutDepAccCorrespCurrencyIdCurrency() {
        return outDepAccCorrespCurrencyIdCurrency;
    }

    /**
     * Sets the value of the outDepAccCorrespCurrencyIdCurrency property.
     * 
     */
    public void setOutDepAccCorrespCurrencyIdCurrency(int value) {
        this.outDepAccCorrespCurrencyIdCurrency = value;
    }

    /**
     * Gets the value of the outDepAccCorrespCurrencyShortDescr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutDepAccCorrespCurrencyShortDescr() {
        return outDepAccCorrespCurrencyShortDescr;
    }

    /**
     * Sets the value of the outDepAccCorrespCurrencyShortDescr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutDepAccCorrespCurrencyShortDescr(String value) {
        this.outDepAccCorrespCurrencyShortDescr = value;
    }

    /**
     * Gets the value of the outDepAccCorrespProductIdProduct property.
     * 
     */
    public int getOutDepAccCorrespProductIdProduct() {
        return outDepAccCorrespProductIdProduct;
    }

    /**
     * Sets the value of the outDepAccCorrespProductIdProduct property.
     * 
     */
    public void setOutDepAccCorrespProductIdProduct(int value) {
        this.outDepAccCorrespProductIdProduct = value;
    }

    /**
     * Gets the value of the outDepAccCorrespUnitCode property.
     * 
     */
    public int getOutDepAccCorrespUnitCode() {
        return outDepAccCorrespUnitCode;
    }

    /**
     * Sets the value of the outDepAccCorrespUnitCode property.
     * 
     */
    public void setOutDepAccCorrespUnitCode(int value) {
        this.outDepAccCorrespUnitCode = value;
    }

    /**
     * Gets the value of the outEnableFieldsIefSuppliedFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutEnableFieldsIefSuppliedFlag() {
        return outEnableFieldsIefSuppliedFlag;
    }

    /**
     * Sets the value of the outEnableFieldsIefSuppliedFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutEnableFieldsIefSuppliedFlag(String value) {
        this.outEnableFieldsIefSuppliedFlag = value;
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
     * Gets the value of the outFaceValueCurrencyIdCurrency property.
     * 
     */
    public int getOutFaceValueCurrencyIdCurrency() {
        return outFaceValueCurrencyIdCurrency;
    }

    /**
     * Sets the value of the outFaceValueCurrencyIdCurrency property.
     * 
     */
    public void setOutFaceValueCurrencyIdCurrency(int value) {
        this.outFaceValueCurrencyIdCurrency = value;
    }

    /**
     * Gets the value of the outFaceValueCurrencyShortDescr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutFaceValueCurrencyShortDescr() {
        return outFaceValueCurrencyShortDescr;
    }

    /**
     * Sets the value of the outFaceValueCurrencyShortDescr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutFaceValueCurrencyShortDescr(String value) {
        this.outFaceValueCurrencyShortDescr = value;
    }

    /**
     * Gets the value of the outFinscGenericDetailDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutFinscGenericDetailDescription() {
        return outFinscGenericDetailDescription;
    }

    /**
     * Sets the value of the outFinscGenericDetailDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutFinscGenericDetailDescription(String value) {
        this.outFinscGenericDetailDescription = value;
    }

    /**
     * Gets the value of the outFinscGenericDetailSerialNum property.
     * 
     */
    public int getOutFinscGenericDetailSerialNum() {
        return outFinscGenericDetailSerialNum;
    }

    /**
     * Sets the value of the outFinscGenericDetailSerialNum property.
     * 
     */
    public void setOutFinscGenericDetailSerialNum(int value) {
        this.outFinscGenericDetailSerialNum = value;
    }

    /**
     * Gets the value of the outGroupGenericDetailDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGroupGenericDetailDescription() {
        return outGroupGenericDetailDescription;
    }

    /**
     * Sets the value of the outGroupGenericDetailDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGroupGenericDetailDescription(String value) {
        this.outGroupGenericDetailDescription = value;
    }

    /**
     * Gets the value of the outGroupGenericDetailSerialNum property.
     * 
     */
    public int getOutGroupGenericDetailSerialNum() {
        return outGroupGenericDetailSerialNum;
    }

    /**
     * Sets the value of the outGroupGenericDetailSerialNum property.
     * 
     */
    public void setOutGroupGenericDetailSerialNum(int value) {
        this.outGroupGenericDetailSerialNum = value;
    }

    /**
     * Gets the value of the outGrpLength property.
     * 
     */
    public int getOutGrpLength() {
        return outGrpLength;
    }

    /**
     * Sets the value of the outGrpLength property.
     * 
     */
    public void setOutGrpLength(int value) {
        this.outGrpLength = value;
    }

    /**
     * Gets the value of the outLiquitLnsCommissionDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutLiquitLnsCommissionDescription() {
        return outLiquitLnsCommissionDescription;
    }

    /**
     * Sets the value of the outLiquitLnsCommissionDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutLiquitLnsCommissionDescription(String value) {
        this.outLiquitLnsCommissionDescription = value;
    }

    /**
     * Gets the value of the outLiquitLnsCommissionIdCommission property.
     * 
     */
    public int getOutLiquitLnsCommissionIdCommission() {
        return outLiquitLnsCommissionIdCommission;
    }

    /**
     * Sets the value of the outLiquitLnsCommissionIdCommission property.
     * 
     */
    public void setOutLiquitLnsCommissionIdCommission(int value) {
        this.outLiquitLnsCommissionIdCommission = value;
    }

    /**
     * Gets the value of the outMutualFundCustomerCDigit property.
     * 
     */
    public short getOutMutualFundCustomerCDigit() {
        return outMutualFundCustomerCDigit;
    }

    /**
     * Sets the value of the outMutualFundCustomerCDigit property.
     * 
     */
    public void setOutMutualFundCustomerCDigit(short value) {
        this.outMutualFundCustomerCDigit = value;
    }

    /**
     * Gets the value of the outMutualFundCustomerCustId property.
     * 
     */
    public int getOutMutualFundCustomerCustId() {
        return outMutualFundCustomerCustId;
    }

    /**
     * Sets the value of the outMutualFundCustomerCustId property.
     * 
     */
    public void setOutMutualFundCustomerCustId(int value) {
        this.outMutualFundCustomerCustId = value;
    }

    /**
     * Gets the value of the outMutualFundListSetDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutMutualFundListSetDescription() {
        return outMutualFundListSetDescription;
    }

    /**
     * Sets the value of the outMutualFundListSetDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutMutualFundListSetDescription(String value) {
        this.outMutualFundListSetDescription = value;
    }

    /**
     * Gets the value of the outNontradeTrbondBondDescGr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutNontradeTrbondBondDescGr() {
        return outNontradeTrbondBondDescGr;
    }

    /**
     * Sets the value of the outNontradeTrbondBondDescGr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutNontradeTrbondBondDescGr(String value) {
        this.outNontradeTrbondBondDescGr = value;
    }

    /**
     * Gets the value of the outParticDepositAccountAccountNumber property.
     * 
     */
    public double getOutParticDepositAccountAccountNumber() {
        return outParticDepositAccountAccountNumber;
    }

    /**
     * Sets the value of the outParticDepositAccountAccountNumber property.
     * 
     */
    public void setOutParticDepositAccountAccountNumber(double value) {
        this.outParticDepositAccountAccountNumber = value;
    }

    /**
     * Gets the value of the outParticDepositAccountCDigit property.
     * 
     */
    public short getOutParticDepositAccountCDigit() {
        return outParticDepositAccountCDigit;
    }

    /**
     * Sets the value of the outParticDepositAccountCDigit property.
     * 
     */
    public void setOutParticDepositAccountCDigit(short value) {
        this.outParticDepositAccountCDigit = value;
    }

    /**
     * Gets the value of the outParticLnsCommissionDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutParticLnsCommissionDescription() {
        return outParticLnsCommissionDescription;
    }

    /**
     * Sets the value of the outParticLnsCommissionDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutParticLnsCommissionDescription(String value) {
        this.outParticLnsCommissionDescription = value;
    }

    /**
     * Gets the value of the outParticLnsCommissionIdCommission property.
     * 
     */
    public int getOutParticLnsCommissionIdCommission() {
        return outParticLnsCommissionIdCommission;
    }

    /**
     * Sets the value of the outParticLnsCommissionIdCommission property.
     * 
     */
    public void setOutParticLnsCommissionIdCommission(int value) {
        this.outParticLnsCommissionIdCommission = value;
    }

    /**
     * Gets the value of the outProductDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutProductDescription() {
        return outProductDescription;
    }

    /**
     * Sets the value of the outProductDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutProductDescription(String value) {
        this.outProductDescription = value;
    }

    /**
     * Gets the value of the outProductIdProduct property.
     * 
     */
    public int getOutProductIdProduct() {
        return outProductIdProduct;
    }

    /**
     * Sets the value of the outProductIdProduct property.
     * 
     */
    public void setOutProductIdProduct(int value) {
        this.outProductIdProduct = value;
    }

    /**
     * Gets the value of the outReplyTrbondBondCurrCoupon property.
     * 
     */
    public short getOutReplyTrbondBondCurrCoupon() {
        return outReplyTrbondBondCurrCoupon;
    }

    /**
     * Sets the value of the outReplyTrbondBondCurrCoupon property.
     * 
     */
    public void setOutReplyTrbondBondCurrCoupon(short value) {
        this.outReplyTrbondBondCurrCoupon = value;
    }

    /**
     * Gets the value of the outRightsTrbondBondDescGr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutRightsTrbondBondDescGr() {
        return outRightsTrbondBondDescGr;
    }

    /**
     * Sets the value of the outRightsTrbondBondDescGr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutRightsTrbondBondDescGr(String value) {
        this.outRightsTrbondBondDescGr = value;
    }

    /**
     * Gets the value of the outSecuritiesTypeTypeDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSecuritiesTypeTypeDesc() {
        return outSecuritiesTypeTypeDesc;
    }

    /**
     * Sets the value of the outSecuritiesTypeTypeDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSecuritiesTypeTypeDesc(String value) {
        this.outSecuritiesTypeTypeDesc = value;
    }

    /**
     * Gets the value of the outSecuritiesTypeTypeId property.
     * 
     */
    public short getOutSecuritiesTypeTypeId() {
        return outSecuritiesTypeTypeId;
    }

    /**
     * Sets the value of the outSecuritiesTypeTypeId property.
     * 
     */
    public void setOutSecuritiesTypeTypeId(short value) {
        this.outSecuritiesTypeTypeId = value;
    }

    /**
     * Gets the value of the outSelectedCustListSetDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSelectedCustListSetDescription() {
        return outSelectedCustListSetDescription;
    }

    /**
     * Sets the value of the outSelectedCustListSetDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSelectedCustListSetDescription(String value) {
        this.outSelectedCustListSetDescription = value;
    }

    /**
     * Gets the value of the outSelectedDepCommProfitsAccountAccountCd property.
     * 
     */
    public short getOutSelectedDepCommProfitsAccountAccountCd() {
        return outSelectedDepCommProfitsAccountAccountCd;
    }

    /**
     * Sets the value of the outSelectedDepCommProfitsAccountAccountCd property.
     * 
     */
    public void setOutSelectedDepCommProfitsAccountAccountCd(short value) {
        this.outSelectedDepCommProfitsAccountAccountCd = value;
    }

    /**
     * Gets the value of the outSelectedDepCommProfitsAccountAccountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSelectedDepCommProfitsAccountAccountNumber() {
        return outSelectedDepCommProfitsAccountAccountNumber;
    }

    /**
     * Sets the value of the outSelectedDepCommProfitsAccountAccountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSelectedDepCommProfitsAccountAccountNumber(String value) {
        this.outSelectedDepCommProfitsAccountAccountNumber = value;
    }

    /**
     * Gets the value of the outSelectedDepCommProfitsAccountPrftSystem property.
     * 
     */
    public short getOutSelectedDepCommProfitsAccountPrftSystem() {
        return outSelectedDepCommProfitsAccountPrftSystem;
    }

    /**
     * Sets the value of the outSelectedDepCommProfitsAccountPrftSystem property.
     * 
     */
    public void setOutSelectedDepCommProfitsAccountPrftSystem(short value) {
        this.outSelectedDepCommProfitsAccountPrftSystem = value;
    }

    /**
     * Gets the value of the outSelectedDepCorrespProfitsAccountAccountCd property.
     * 
     */
    public short getOutSelectedDepCorrespProfitsAccountAccountCd() {
        return outSelectedDepCorrespProfitsAccountAccountCd;
    }

    /**
     * Sets the value of the outSelectedDepCorrespProfitsAccountAccountCd property.
     * 
     */
    public void setOutSelectedDepCorrespProfitsAccountAccountCd(short value) {
        this.outSelectedDepCorrespProfitsAccountAccountCd = value;
    }

    /**
     * Gets the value of the outSelectedDepCorrespProfitsAccountAccountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSelectedDepCorrespProfitsAccountAccountNumber() {
        return outSelectedDepCorrespProfitsAccountAccountNumber;
    }

    /**
     * Sets the value of the outSelectedDepCorrespProfitsAccountAccountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSelectedDepCorrespProfitsAccountAccountNumber(String value) {
        this.outSelectedDepCorrespProfitsAccountAccountNumber = value;
    }

    /**
     * Gets the value of the outSelectedDepCorrespProfitsAccountPrftSystem property.
     * 
     */
    public short getOutSelectedDepCorrespProfitsAccountPrftSystem() {
        return outSelectedDepCorrespProfitsAccountPrftSystem;
    }

    /**
     * Sets the value of the outSelectedDepCorrespProfitsAccountPrftSystem property.
     * 
     */
    public void setOutSelectedDepCorrespProfitsAccountPrftSystem(short value) {
        this.outSelectedDepCorrespProfitsAccountPrftSystem = value;
    }

    /**
     * Gets the value of the outSelectedDepProfitsAccountAccountCd property.
     * 
     */
    public short getOutSelectedDepProfitsAccountAccountCd() {
        return outSelectedDepProfitsAccountAccountCd;
    }

    /**
     * Sets the value of the outSelectedDepProfitsAccountAccountCd property.
     * 
     */
    public void setOutSelectedDepProfitsAccountAccountCd(short value) {
        this.outSelectedDepProfitsAccountAccountCd = value;
    }

    /**
     * Gets the value of the outSelectedDepProfitsAccountAccountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSelectedDepProfitsAccountAccountNumber() {
        return outSelectedDepProfitsAccountAccountNumber;
    }

    /**
     * Sets the value of the outSelectedDepProfitsAccountAccountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSelectedDepProfitsAccountAccountNumber(String value) {
        this.outSelectedDepProfitsAccountAccountNumber = value;
    }

    /**
     * Gets the value of the outSrvGrpLogLength property.
     * 
     */
    public int getOutSrvGrpLogLength() {
        return outSrvGrpLogLength;
    }

    /**
     * Sets the value of the outSrvGrpLogLength property.
     * 
     */
    public void setOutSrvGrpLogLength(int value) {
        this.outSrvGrpLogLength = value;
    }

    /**
     * Gets the value of the outSubcategGenericDetailDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSubcategGenericDetailDescription() {
        return outSubcategGenericDetailDescription;
    }

    /**
     * Sets the value of the outSubcategGenericDetailDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSubcategGenericDetailDescription(String value) {
        this.outSubcategGenericDetailDescription = value;
    }

    /**
     * Gets the value of the outSubcategGenericDetailSerialNum property.
     * 
     */
    public int getOutSubcategGenericDetailSerialNum() {
        return outSubcategGenericDetailSerialNum;
    }

    /**
     * Sets the value of the outSubcategGenericDetailSerialNum property.
     * 
     */
    public void setOutSubcategGenericDetailSerialNum(int value) {
        this.outSubcategGenericDetailSerialNum = value;
    }

    /**
     * Gets the value of the outTrbondBondAddress1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutTrbondBondAddress1() {
        return outTrbondBondAddress1;
    }

    /**
     * Sets the value of the outTrbondBondAddress1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutTrbondBondAddress1(String value) {
        this.outTrbondBondAddress1 = value;
    }

    /**
     * Gets the value of the outTrbondBondAddress2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutTrbondBondAddress2() {
        return outTrbondBondAddress2;
    }

    /**
     * Sets the value of the outTrbondBondAddress2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutTrbondBondAddress2(String value) {
        this.outTrbondBondAddress2 = value;
    }

    /**
     * Gets the value of the outTrbondBondCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutTrbondBondCity() {
        return outTrbondBondCity;
    }

    /**
     * Sets the value of the outTrbondBondCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutTrbondBondCity(String value) {
        this.outTrbondBondCity = value;
    }

    /**
     * Gets the value of the outTrbondBondCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutTrbondBondCode() {
        return outTrbondBondCode;
    }

    /**
     * Sets the value of the outTrbondBondCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutTrbondBondCode(String value) {
        this.outTrbondBondCode = value;
    }

    /**
     * Gets the value of the outTrbondBondCompany property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutTrbondBondCompany() {
        return outTrbondBondCompany;
    }

    /**
     * Sets the value of the outTrbondBondCompany property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutTrbondBondCompany(String value) {
        this.outTrbondBondCompany = value;
    }

    /**
     * Gets the value of the outTrbondBondCountry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutTrbondBondCountry() {
        return outTrbondBondCountry;
    }

    /**
     * Sets the value of the outTrbondBondCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutTrbondBondCountry(String value) {
        this.outTrbondBondCountry = value;
    }

    /**
     * Gets the value of the outTrbondBondCoupons property.
     * 
     */
    public short getOutTrbondBondCoupons() {
        return outTrbondBondCoupons;
    }

    /**
     * Sets the value of the outTrbondBondCoupons property.
     * 
     */
    public void setOutTrbondBondCoupons(short value) {
        this.outTrbondBondCoupons = value;
    }

    /**
     * Gets the value of the outTrbondBondCurrCoupon property.
     * 
     */
    public short getOutTrbondBondCurrCoupon() {
        return outTrbondBondCurrCoupon;
    }

    /**
     * Sets the value of the outTrbondBondCurrCoupon property.
     * 
     */
    public void setOutTrbondBondCurrCoupon(short value) {
        this.outTrbondBondCurrCoupon = value;
    }

    /**
     * Gets the value of the outTrbondBondDenomination property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutTrbondBondDenomination() {
        return outTrbondBondDenomination;
    }

    /**
     * Sets the value of the outTrbondBondDenomination property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutTrbondBondDenomination(BigDecimal value) {
        this.outTrbondBondDenomination = value;
    }

    /**
     * Gets the value of the outTrbondBondDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutTrbondBondDesc() {
        return outTrbondBondDesc;
    }

    /**
     * Sets the value of the outTrbondBondDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutTrbondBondDesc(String value) {
        this.outTrbondBondDesc = value;
    }

    /**
     * Gets the value of the outTrbondBondDescGr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutTrbondBondDescGr() {
        return outTrbondBondDescGr;
    }

    /**
     * Sets the value of the outTrbondBondDescGr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutTrbondBondDescGr(String value) {
        this.outTrbondBondDescGr = value;
    }

    /**
     * Gets the value of the outTrbondBondDurationUnit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutTrbondBondDurationUnit() {
        return outTrbondBondDurationUnit;
    }

    /**
     * Sets the value of the outTrbondBondDurationUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutTrbondBondDurationUnit(String value) {
        this.outTrbondBondDurationUnit = value;
    }

    /**
     * Gets the value of the outTrbondBondDurationVal property.
     * 
     */
    public short getOutTrbondBondDurationVal() {
        return outTrbondBondDurationVal;
    }

    /**
     * Sets the value of the outTrbondBondDurationVal property.
     * 
     */
    public void setOutTrbondBondDurationVal(short value) {
        this.outTrbondBondDurationVal = value;
    }

    /**
     * Gets the value of the outTrbondBondFlagResident property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutTrbondBondFlagResident() {
        return outTrbondBondFlagResident;
    }

    /**
     * Sets the value of the outTrbondBondFlagResident property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutTrbondBondFlagResident(String value) {
        this.outTrbondBondFlagResident = value;
    }

    /**
     * Gets the value of the outTrbondBondFmtEnd property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutTrbondBondFmtEnd() {
        return outTrbondBondFmtEnd;
    }

    /**
     * Sets the value of the outTrbondBondFmtEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutTrbondBondFmtEnd(XMLGregorianCalendar value) {
        this.outTrbondBondFmtEnd = value;
    }

    /**
     * Gets the value of the outTrbondBondFmtStart property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutTrbondBondFmtStart() {
        return outTrbondBondFmtStart;
    }

    /**
     * Sets the value of the outTrbondBondFmtStart property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutTrbondBondFmtStart(XMLGregorianCalendar value) {
        this.outTrbondBondFmtStart = value;
    }

    /**
     * Gets the value of the outTrbondBondInterestFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutTrbondBondInterestFlag() {
        return outTrbondBondInterestFlag;
    }

    /**
     * Sets the value of the outTrbondBondInterestFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutTrbondBondInterestFlag(String value) {
        this.outTrbondBondInterestFlag = value;
    }

    /**
     * Gets the value of the outTrbondBondInterestPctg property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutTrbondBondInterestPctg() {
        return outTrbondBondInterestPctg;
    }

    /**
     * Sets the value of the outTrbondBondInterestPctg property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutTrbondBondInterestPctg(BigDecimal value) {
        this.outTrbondBondInterestPctg = value;
    }

    /**
     * Gets the value of the outTrbondBondIsin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutTrbondBondIsin() {
        return outTrbondBondIsin;
    }

    /**
     * Sets the value of the outTrbondBondIsin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutTrbondBondIsin(String value) {
        this.outTrbondBondIsin = value;
    }

    /**
     * Gets the value of the outTrbondBondPhone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutTrbondBondPhone() {
        return outTrbondBondPhone;
    }

    /**
     * Sets the value of the outTrbondBondPhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutTrbondBondPhone(String value) {
        this.outTrbondBondPhone = value;
    }

    /**
     * Gets the value of the outTrbondBondRenewalFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutTrbondBondRenewalFlag() {
        return outTrbondBondRenewalFlag;
    }

    /**
     * Sets the value of the outTrbondBondRenewalFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutTrbondBondRenewalFlag(String value) {
        this.outTrbondBondRenewalFlag = value;
    }

    /**
     * Gets the value of the outTrbondBondReutersCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutTrbondBondReutersCode() {
        return outTrbondBondReutersCode;
    }

    /**
     * Sets the value of the outTrbondBondReutersCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutTrbondBondReutersCode(String value) {
        this.outTrbondBondReutersCode = value;
    }

    /**
     * Gets the value of the outTrbondBondTaxRegNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutTrbondBondTaxRegNo() {
        return outTrbondBondTaxRegNo;
    }

    /**
     * Sets the value of the outTrbondBondTaxRegNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutTrbondBondTaxRegNo(String value) {
        this.outTrbondBondTaxRegNo = value;
    }

    /**
     * Gets the value of the outTrbondBondXaaCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutTrbondBondXaaCode() {
        return outTrbondBondXaaCode;
    }

    /**
     * Sets the value of the outTrbondBondXaaCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutTrbondBondXaaCode(String value) {
        this.outTrbondBondXaaCode = value;
    }

    /**
     * Gets the value of the outTrbondBondZip property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutTrbondBondZip() {
        return outTrbondBondZip;
    }

    /**
     * Sets the value of the outTrbondBondZip property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutTrbondBondZip(String value) {
        this.outTrbondBondZip = value;
    }

    /**
     * Gets the value of the outTrbondCustomerFlags property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutTrbondCustomerFlags() {
        return outTrbondCustomerFlags;
    }

    /**
     * Sets the value of the outTrbondCustomerFlags property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutTrbondCustomerFlags(String value) {
        this.outTrbondCustomerFlags = value;
    }

    /**
     * Gets the value of the outTrbondDisposalAccCd property.
     * 
     */
    public short getOutTrbondDisposalAccCd() {
        return outTrbondDisposalAccCd;
    }

    /**
     * Sets the value of the outTrbondDisposalAccCd property.
     * 
     */
    public void setOutTrbondDisposalAccCd(short value) {
        this.outTrbondDisposalAccCd = value;
    }

    /**
     * Gets the value of the outTrbondDisposalAccSn property.
     * 
     */
    public int getOutTrbondDisposalAccSn() {
        return outTrbondDisposalAccSn;
    }

    /**
     * Sets the value of the outTrbondDisposalAccSn property.
     * 
     */
    public void setOutTrbondDisposalAccSn(int value) {
        this.outTrbondDisposalAccSn = value;
    }

    /**
     * Gets the value of the outTrbondDisposalAccType property.
     * 
     */
    public short getOutTrbondDisposalAccType() {
        return outTrbondDisposalAccType;
    }

    /**
     * Sets the value of the outTrbondDisposalAccType property.
     * 
     */
    public void setOutTrbondDisposalAccType(short value) {
        this.outTrbondDisposalAccType = value;
    }

    /**
     * Gets the value of the outTrbondDisposalAccUnit property.
     * 
     */
    public int getOutTrbondDisposalAccUnit() {
        return outTrbondDisposalAccUnit;
    }

    /**
     * Sets the value of the outTrbondDisposalAccUnit property.
     * 
     */
    public void setOutTrbondDisposalAccUnit(int value) {
        this.outTrbondDisposalAccUnit = value;
    }

    /**
     * Gets the value of the outTrbondDisposalAdminFlg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutTrbondDisposalAdminFlg() {
        return outTrbondDisposalAdminFlg;
    }

    /**
     * Sets the value of the outTrbondDisposalAdminFlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutTrbondDisposalAdminFlg(String value) {
        this.outTrbondDisposalAdminFlg = value;
    }

    /**
     * Gets the value of the outTrbondDistrEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutTrbondDistrEndDate() {
        return outTrbondDistrEndDate;
    }

    /**
     * Sets the value of the outTrbondDistrEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutTrbondDistrEndDate(XMLGregorianCalendar value) {
        this.outTrbondDistrEndDate = value;
    }

    /**
     * Gets the value of the outTrbondDistrStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutTrbondDistrStartDate() {
        return outTrbondDistrStartDate;
    }

    /**
     * Sets the value of the outTrbondDistrStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutTrbondDistrStartDate(XMLGregorianCalendar value) {
        this.outTrbondDistrStartDate = value;
    }

    /**
     * Gets the value of the outTrbondEndOfOrdersTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutTrbondEndOfOrdersTime() {
        return outTrbondEndOfOrdersTime;
    }

    /**
     * Sets the value of the outTrbondEndOfOrdersTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutTrbondEndOfOrdersTime(XMLGregorianCalendar value) {
        this.outTrbondEndOfOrdersTime = value;
    }

    /**
     * Gets the value of the outTrbondEntryStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutTrbondEntryStatus() {
        return outTrbondEntryStatus;
    }

    /**
     * Sets the value of the outTrbondEntryStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutTrbondEntryStatus(String value) {
        this.outTrbondEntryStatus = value;
    }

    /**
     * Gets the value of the outTrbondInitDistrValue property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutTrbondInitDistrValue() {
        return outTrbondInitDistrValue;
    }

    /**
     * Sets the value of the outTrbondInitDistrValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutTrbondInitDistrValue(BigDecimal value) {
        this.outTrbondInitDistrValue = value;
    }

    /**
     * Gets the value of the outTrbondInitialBondCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutTrbondInitialBondCode() {
        return outTrbondInitialBondCode;
    }

    /**
     * Sets the value of the outTrbondInitialBondCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutTrbondInitialBondCode(String value) {
        this.outTrbondInitialBondCode = value;
    }

    /**
     * Gets the value of the outTrbondIntCalcDaysbase property.
     * 
     */
    public short getOutTrbondIntCalcDaysbase() {
        return outTrbondIntCalcDaysbase;
    }

    /**
     * Sets the value of the outTrbondIntCalcDaysbase property.
     * 
     */
    public void setOutTrbondIntCalcDaysbase(short value) {
        this.outTrbondIntCalcDaysbase = value;
    }

    /**
     * Gets the value of the outTrbondIntCalcDurDays property.
     * 
     */
    public short getOutTrbondIntCalcDurDays() {
        return outTrbondIntCalcDurDays;
    }

    /**
     * Sets the value of the outTrbondIntCalcDurDays property.
     * 
     */
    public void setOutTrbondIntCalcDurDays(short value) {
        this.outTrbondIntCalcDurDays = value;
    }

    /**
     * Gets the value of the outTrbondLastTrxUnit property.
     * 
     */
    public int getOutTrbondLastTrxUnit() {
        return outTrbondLastTrxUnit;
    }

    /**
     * Sets the value of the outTrbondLastTrxUnit property.
     * 
     */
    public void setOutTrbondLastTrxUnit(int value) {
        this.outTrbondLastTrxUnit = value;
    }

    /**
     * Gets the value of the outTrbondLastTrxUsr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutTrbondLastTrxUsr() {
        return outTrbondLastTrxUsr;
    }

    /**
     * Sets the value of the outTrbondLastTrxUsr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutTrbondLastTrxUsr(String value) {
        this.outTrbondLastTrxUsr = value;
    }

    /**
     * Gets the value of the outTrbondMaxAcquisitionAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutTrbondMaxAcquisitionAmount() {
        return outTrbondMaxAcquisitionAmount;
    }

    /**
     * Sets the value of the outTrbondMaxAcquisitionAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutTrbondMaxAcquisitionAmount(BigDecimal value) {
        this.outTrbondMaxAcquisitionAmount = value;
    }

    /**
     * Gets the value of the outTrbondMinTradingQty property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutTrbondMinTradingQty() {
        return outTrbondMinTradingQty;
    }

    /**
     * Sets the value of the outTrbondMinTradingQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutTrbondMinTradingQty(BigDecimal value) {
        this.outTrbondMinTradingQty = value;
    }

    /**
     * Gets the value of the outTrbondNonTradeableBond property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutTrbondNonTradeableBond() {
        return outTrbondNonTradeableBond;
    }

    /**
     * Sets the value of the outTrbondNonTradeableBond property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutTrbondNonTradeableBond(String value) {
        this.outTrbondNonTradeableBond = value;
    }

    /**
     * Gets the value of the outTrbondRegisterFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutTrbondRegisterFlag() {
        return outTrbondRegisterFlag;
    }

    /**
     * Sets the value of the outTrbondRegisterFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutTrbondRegisterFlag(String value) {
        this.outTrbondRegisterFlag = value;
    }

    /**
     * Gets the value of the outTrbondRightsBond property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutTrbondRightsBond() {
        return outTrbondRightsBond;
    }

    /**
     * Sets the value of the outTrbondRightsBond property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutTrbondRightsBond(String value) {
        this.outTrbondRightsBond = value;
    }

    /**
     * Gets the value of the outTrbondSecuritiesType property.
     * 
     */
    public short getOutTrbondSecuritiesType() {
        return outTrbondSecuritiesType;
    }

    /**
     * Sets the value of the outTrbondSecuritiesType property.
     * 
     */
    public void setOutTrbondSecuritiesType(short value) {
        this.outTrbondSecuritiesType = value;
    }

    /**
     * Gets the value of the outTrbondShareType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutTrbondShareType() {
        return outTrbondShareType;
    }

    /**
     * Sets the value of the outTrbondShareType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutTrbondShareType(String value) {
        this.outTrbondShareType = value;
    }

    /**
     * Gets the value of the outTrbondTaxPctgNonResid property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutTrbondTaxPctgNonResid() {
        return outTrbondTaxPctgNonResid;
    }

    /**
     * Sets the value of the outTrbondTaxPctgNonResid property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutTrbondTaxPctgNonResid(BigDecimal value) {
        this.outTrbondTaxPctgNonResid = value;
    }

    /**
     * Gets the value of the outTrbondTaxPctgResident property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutTrbondTaxPctgResident() {
        return outTrbondTaxPctgResident;
    }

    /**
     * Sets the value of the outTrbondTaxPctgResident property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutTrbondTaxPctgResident(BigDecimal value) {
        this.outTrbondTaxPctgResident = value;
    }

    /**
     * Gets the value of the outTrbondTmstamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutTrbondTmstamp() {
        return outTrbondTmstamp;
    }

    /**
     * Sets the value of the outTrbondTmstamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutTrbondTmstamp(XMLGregorianCalendar value) {
        this.outTrbondTmstamp = value;
    }

    /**
     * Gets the value of the outTrbondTradingAccCd property.
     * 
     */
    public short getOutTrbondTradingAccCd() {
        return outTrbondTradingAccCd;
    }

    /**
     * Sets the value of the outTrbondTradingAccCd property.
     * 
     */
    public void setOutTrbondTradingAccCd(short value) {
        this.outTrbondTradingAccCd = value;
    }

    /**
     * Gets the value of the outTrbondTradingAccSn property.
     * 
     */
    public int getOutTrbondTradingAccSn() {
        return outTrbondTradingAccSn;
    }

    /**
     * Sets the value of the outTrbondTradingAccSn property.
     * 
     */
    public void setOutTrbondTradingAccSn(int value) {
        this.outTrbondTradingAccSn = value;
    }

    /**
     * Gets the value of the outTrbondTradingAccType property.
     * 
     */
    public short getOutTrbondTradingAccType() {
        return outTrbondTradingAccType;
    }

    /**
     * Sets the value of the outTrbondTradingAccType property.
     * 
     */
    public void setOutTrbondTradingAccType(short value) {
        this.outTrbondTradingAccType = value;
    }

    /**
     * Gets the value of the outTrbondTradingAccUnit property.
     * 
     */
    public int getOutTrbondTradingAccUnit() {
        return outTrbondTradingAccUnit;
    }

    /**
     * Sets the value of the outTrbondTradingAccUnit property.
     * 
     */
    public void setOutTrbondTradingAccUnit(int value) {
        this.outTrbondTradingAccUnit = value;
    }

    /**
     * Gets the value of the outTrnsfLnsCommissionDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutTrnsfLnsCommissionDescription() {
        return outTrnsfLnsCommissionDescription;
    }

    /**
     * Sets the value of the outTrnsfLnsCommissionDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutTrnsfLnsCommissionDescription(String value) {
        this.outTrnsfLnsCommissionDescription = value;
    }

    /**
     * Gets the value of the outTrnsfLnsCommissionIdCommission property.
     * 
     */
    public int getOutTrnsfLnsCommissionIdCommission() {
        return outTrnsfLnsCommissionIdCommission;
    }

    /**
     * Sets the value of the outTrnsfLnsCommissionIdCommission property.
     * 
     */
    public void setOutTrnsfLnsCommissionIdCommission(int value) {
        this.outTrnsfLnsCommissionIdCommission = value;
    }

    /**
     * Gets the value of the outUnblockJustificDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutUnblockJustificDescription() {
        return outUnblockJustificDescription;
    }

    /**
     * Sets the value of the outUnblockJustificDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutUnblockJustificDescription(String value) {
        this.outUnblockJustificDescription = value;
    }

    /**
     * Gets the value of the outUnblockJustificIdJustific property.
     * 
     */
    public int getOutUnblockJustificIdJustific() {
        return outUnblockJustificIdJustific;
    }

    /**
     * Sets the value of the outUnblockJustificIdJustific property.
     * 
     */
    public void setOutUnblockJustificIdJustific(int value) {
        this.outUnblockJustificIdJustific = value;
    }

    /**
     * Gets the value of the outGrp property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfOutGrpTf }
     *     
     */
    public ArrayOfOutGrpTf getOutGrp() {
        return outGrp;
    }

    /**
     * Sets the value of the outGrp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfOutGrpTf }
     *     
     */
    public void setOutGrp(ArrayOfOutGrpTf value) {
        this.outGrp = value;
    }

    /**
     * Gets the value of the outSrvGrpLog property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfOutSrvGrpLog }
     *     
     */
    public ArrayOfOutSrvGrpLog getOutSrvGrpLog() {
        return outSrvGrpLog;
    }

    /**
     * Sets the value of the outSrvGrpLog property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfOutSrvGrpLog }
     *     
     */
    public void setOutSrvGrpLog(ArrayOfOutSrvGrpLog value) {
        this.outSrvGrpLog = value;
    }

}
