
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for T1423VLetterOfGuaranteeStatementExport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="T1423VLetterOfGuaranteeStatementExport">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}BaseExport">
 *       &lt;sequence>
 *         &lt;element name="OutAgreementAgrMembershipSn" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutAgreementAgrSn" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutAgreementAgrYear" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutAgreementProfitsAccountAccountCd" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutAgreementProfitsAccountAccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutBenefCustomerCustId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutBenefCustomerCustStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutBenefCustomerCustType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutBenefCustomerShortName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutBenefListSetDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutChargesCurrencyDisplayedDecimalPlaces" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutChargesCurrencyIdCurrency" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutChargesCurrencyNationalFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutChargesCurrencyShortDescr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustAddressAddress1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustAddressAddress2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustAddressCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustAddressRegion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustAddressTelephone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustAddressZipCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutDepositProfitsAccountAccountCd" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutDepositProfitsAccountAccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutLgAccountAccCd" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutLgAccountAccLimitAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutLgAccountAccOpenDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutLgAccountAccSn" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OutLgAccountAccSpcAgrFlg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutLgAccountAccStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutLgAccountAccType" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutLgAccountCancellationDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutLgAccountCifAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutLgAccountCifCurrency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutLgAccountComInAcBal" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutLgAccountComment1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutLgAccountComment2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutLgAccountCommissionBal" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutLgAccountCommissionSpread" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutLgAccountCusStmLstTrnDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutLgAccountCusStmNxtTrnDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutLgAccountDefaultAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutLgAccountDefaultDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutLgAccountDefaultType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutLgAccountDepAccCd" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutLgAccountDepAccSn" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OutLgAccountDepAccType" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutLgAccountDepAccUnit" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutLgAccountExpInAcBal" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutLgAccountExpenseBal" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutLgAccountExpirationType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutLgAccountExpiryDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutLgAccountGuaranteeDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutLgAccountIssuanceJustific" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutLgAccountLanguageCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutLgAccountLastUpdDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutLgAccountLgAmountBal" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutLgAccountLgDocCount" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutLgAccountLgFinalDocCnt" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutLgAccountLgInitialAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutLgAccountNextCommissDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutLgAccountObligationStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutLgAccountOldAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutLgAccountPendingModifCnt" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutLgAccountPostCharges" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutLgAccountPurchaseAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutLgAccountPurchaseAmtPcg" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutLgAccountPurchaseCurrency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutLgAccountPurchaseNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutLgAccountReleaseDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutLgAccountRqDefaultAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutLgAccountRqDefaultDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutLgAccountRqDefaultType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutLgAccountStampCharges" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutLgAccountTelegraphCharges" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutLgAccountTelephoneCharges" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutLgAccountTenderDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutLgAccountTenderNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutLgAccountThirdAddress1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutLgAccountThirdAddress2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutLgAccountThirdCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutLgAccountThirdCountry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutLgAccountThirdPartyNam" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutLgAccountThirdTelephone1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutLgAccountThirdZipCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutLgAccountTmstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutLgAccountTotComInCcAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutLgAccountTotCommissionAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutLgAccountTotExpInCcAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutLgAccountTotExpenseAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutLgAccountTotalTax" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutLgAccountUnit" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutLgProductDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutLgProductIdProduct" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutLgUnitCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutLgUnitUnitName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutMovedCurrencyDaysbase" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutMovedCurrencyDisplayedDecimalPlaces" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutMovedCurrencyFixedRate" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutMovedCurrencyIdCurrency" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutMovedCurrencyNationalFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutMovedCurrencyShortDescr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutOtherAfmAfmNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutPrLgComChargeFreq" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutPrLgLgType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutPrLgLstPrintTransDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutPrLgNxtPrintTransDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutProffGenericDetailDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutTaxOfficeTaxOfficeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpLgAccExtrait" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}ArrayOfT1423VOutGrpLgAccExtraitItem" minOccurs="0"/>
 *         &lt;element name="OutGrpLog" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}ArrayOfT1423VOutGrpLogItem" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "T1423VLetterOfGuaranteeStatementExport", propOrder = {
    "outAgreementAgrMembershipSn",
    "outAgreementAgrSn",
    "outAgreementAgrYear",
    "outAgreementProfitsAccountAccountCd",
    "outAgreementProfitsAccountAccountNumber",
    "outBenefCustomerCustId",
    "outBenefCustomerCustStatus",
    "outBenefCustomerCustType",
    "outBenefCustomerShortName",
    "outBenefListSetDescription",
    "outChargesCurrencyDisplayedDecimalPlaces",
    "outChargesCurrencyIdCurrency",
    "outChargesCurrencyNationalFlag",
    "outChargesCurrencyShortDescr",
    "outCustAddressAddress1",
    "outCustAddressAddress2",
    "outCustAddressCity",
    "outCustAddressRegion",
    "outCustAddressTelephone",
    "outCustAddressZipCode",
    "outDepositProfitsAccountAccountCd",
    "outDepositProfitsAccountAccountNumber",
    "outLgAccountAccCd",
    "outLgAccountAccLimitAmn",
    "outLgAccountAccOpenDt",
    "outLgAccountAccSn",
    "outLgAccountAccSpcAgrFlg",
    "outLgAccountAccStatus",
    "outLgAccountAccType",
    "outLgAccountCancellationDt",
    "outLgAccountCifAmount",
    "outLgAccountCifCurrency",
    "outLgAccountComInAcBal",
    "outLgAccountComment1",
    "outLgAccountComment2",
    "outLgAccountCommissionBal",
    "outLgAccountCommissionSpread",
    "outLgAccountCusStmLstTrnDt",
    "outLgAccountCusStmNxtTrnDt",
    "outLgAccountDefaultAmn",
    "outLgAccountDefaultDate",
    "outLgAccountDefaultType",
    "outLgAccountDepAccCd",
    "outLgAccountDepAccSn",
    "outLgAccountDepAccType",
    "outLgAccountDepAccUnit",
    "outLgAccountExpInAcBal",
    "outLgAccountExpenseBal",
    "outLgAccountExpirationType",
    "outLgAccountExpiryDt",
    "outLgAccountGuaranteeDt",
    "outLgAccountIssuanceJustific",
    "outLgAccountLanguageCode",
    "outLgAccountLastUpdDt",
    "outLgAccountLgAmountBal",
    "outLgAccountLgDocCount",
    "outLgAccountLgFinalDocCnt",
    "outLgAccountLgInitialAmn",
    "outLgAccountNextCommissDt",
    "outLgAccountObligationStatus",
    "outLgAccountOldAccount",
    "outLgAccountPendingModifCnt",
    "outLgAccountPostCharges",
    "outLgAccountPurchaseAmount",
    "outLgAccountPurchaseAmtPcg",
    "outLgAccountPurchaseCurrency",
    "outLgAccountPurchaseNo",
    "outLgAccountReleaseDt",
    "outLgAccountRqDefaultAmn",
    "outLgAccountRqDefaultDt",
    "outLgAccountRqDefaultType",
    "outLgAccountStampCharges",
    "outLgAccountTelegraphCharges",
    "outLgAccountTelephoneCharges",
    "outLgAccountTenderDate",
    "outLgAccountTenderNo",
    "outLgAccountThirdAddress1",
    "outLgAccountThirdAddress2",
    "outLgAccountThirdCity",
    "outLgAccountThirdCountry",
    "outLgAccountThirdPartyNam",
    "outLgAccountThirdTelephone1",
    "outLgAccountThirdZipCode",
    "outLgAccountTmstamp",
    "outLgAccountTotComInCcAmn",
    "outLgAccountTotCommissionAmn",
    "outLgAccountTotExpInCcAmn",
    "outLgAccountTotExpenseAmn",
    "outLgAccountTotalTax",
    "outLgAccountUnit",
    "outLgProductDescription",
    "outLgProductIdProduct",
    "outLgUnitCode",
    "outLgUnitUnitName",
    "outMovedCurrencyDaysbase",
    "outMovedCurrencyDisplayedDecimalPlaces",
    "outMovedCurrencyFixedRate",
    "outMovedCurrencyIdCurrency",
    "outMovedCurrencyNationalFlag",
    "outMovedCurrencyShortDescr",
    "outOtherAfmAfmNo",
    "outPrLgComChargeFreq",
    "outPrLgLgType",
    "outPrLgLstPrintTransDt",
    "outPrLgNxtPrintTransDt",
    "outProffGenericDetailDescription",
    "outTaxOfficeTaxOfficeName",
    "outGrpLgAccExtrait",
    "outGrpLog"
})
public class T1423VLetterOfGuaranteeStatementExport
    extends BaseExport
{

    @XmlElement(name = "OutAgreementAgrMembershipSn")
    protected int outAgreementAgrMembershipSn;
    @XmlElement(name = "OutAgreementAgrSn")
    protected int outAgreementAgrSn;
    @XmlElement(name = "OutAgreementAgrYear")
    protected short outAgreementAgrYear;
    @XmlElement(name = "OutAgreementProfitsAccountAccountCd")
    protected short outAgreementProfitsAccountAccountCd;
    @XmlElement(name = "OutAgreementProfitsAccountAccountNumber")
    protected String outAgreementProfitsAccountAccountNumber;
    @XmlElement(name = "OutBenefCustomerCustId")
    protected int outBenefCustomerCustId;
    @XmlElement(name = "OutBenefCustomerCustStatus")
    protected String outBenefCustomerCustStatus;
    @XmlElement(name = "OutBenefCustomerCustType")
    protected String outBenefCustomerCustType;
    @XmlElement(name = "OutBenefCustomerShortName")
    protected String outBenefCustomerShortName;
    @XmlElement(name = "OutBenefListSetDescription")
    protected String outBenefListSetDescription;
    @XmlElement(name = "OutChargesCurrencyDisplayedDecimalPlaces")
    protected short outChargesCurrencyDisplayedDecimalPlaces;
    @XmlElement(name = "OutChargesCurrencyIdCurrency")
    protected int outChargesCurrencyIdCurrency;
    @XmlElement(name = "OutChargesCurrencyNationalFlag")
    protected String outChargesCurrencyNationalFlag;
    @XmlElement(name = "OutChargesCurrencyShortDescr")
    protected String outChargesCurrencyShortDescr;
    @XmlElement(name = "OutCustAddressAddress1")
    protected String outCustAddressAddress1;
    @XmlElement(name = "OutCustAddressAddress2")
    protected String outCustAddressAddress2;
    @XmlElement(name = "OutCustAddressCity")
    protected String outCustAddressCity;
    @XmlElement(name = "OutCustAddressRegion")
    protected String outCustAddressRegion;
    @XmlElement(name = "OutCustAddressTelephone")
    protected String outCustAddressTelephone;
    @XmlElement(name = "OutCustAddressZipCode")
    protected String outCustAddressZipCode;
    @XmlElement(name = "OutDepositProfitsAccountAccountCd")
    protected short outDepositProfitsAccountAccountCd;
    @XmlElement(name = "OutDepositProfitsAccountAccountNumber")
    protected String outDepositProfitsAccountAccountNumber;
    @XmlElement(name = "OutLgAccountAccCd")
    protected short outLgAccountAccCd;
    @XmlElement(name = "OutLgAccountAccLimitAmn", required = true)
    protected BigDecimal outLgAccountAccLimitAmn;
    @XmlElement(name = "OutLgAccountAccOpenDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outLgAccountAccOpenDt;
    @XmlElement(name = "OutLgAccountAccSn")
    protected double outLgAccountAccSn;
    @XmlElement(name = "OutLgAccountAccSpcAgrFlg")
    protected String outLgAccountAccSpcAgrFlg;
    @XmlElement(name = "OutLgAccountAccStatus")
    protected String outLgAccountAccStatus;
    @XmlElement(name = "OutLgAccountAccType")
    protected short outLgAccountAccType;
    @XmlElement(name = "OutLgAccountCancellationDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outLgAccountCancellationDt;
    @XmlElement(name = "OutLgAccountCifAmount", required = true)
    protected BigDecimal outLgAccountCifAmount;
    @XmlElement(name = "OutLgAccountCifCurrency")
    protected String outLgAccountCifCurrency;
    @XmlElement(name = "OutLgAccountComInAcBal", required = true)
    protected BigDecimal outLgAccountComInAcBal;
    @XmlElement(name = "OutLgAccountComment1")
    protected String outLgAccountComment1;
    @XmlElement(name = "OutLgAccountComment2")
    protected String outLgAccountComment2;
    @XmlElement(name = "OutLgAccountCommissionBal", required = true)
    protected BigDecimal outLgAccountCommissionBal;
    @XmlElement(name = "OutLgAccountCommissionSpread", required = true)
    protected BigDecimal outLgAccountCommissionSpread;
    @XmlElement(name = "OutLgAccountCusStmLstTrnDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outLgAccountCusStmLstTrnDt;
    @XmlElement(name = "OutLgAccountCusStmNxtTrnDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outLgAccountCusStmNxtTrnDt;
    @XmlElement(name = "OutLgAccountDefaultAmn", required = true)
    protected BigDecimal outLgAccountDefaultAmn;
    @XmlElement(name = "OutLgAccountDefaultDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outLgAccountDefaultDate;
    @XmlElement(name = "OutLgAccountDefaultType")
    protected String outLgAccountDefaultType;
    @XmlElement(name = "OutLgAccountDepAccCd")
    protected short outLgAccountDepAccCd;
    @XmlElement(name = "OutLgAccountDepAccSn")
    protected double outLgAccountDepAccSn;
    @XmlElement(name = "OutLgAccountDepAccType")
    protected short outLgAccountDepAccType;
    @XmlElement(name = "OutLgAccountDepAccUnit")
    protected int outLgAccountDepAccUnit;
    @XmlElement(name = "OutLgAccountExpInAcBal", required = true)
    protected BigDecimal outLgAccountExpInAcBal;
    @XmlElement(name = "OutLgAccountExpenseBal", required = true)
    protected BigDecimal outLgAccountExpenseBal;
    @XmlElement(name = "OutLgAccountExpirationType")
    protected String outLgAccountExpirationType;
    @XmlElement(name = "OutLgAccountExpiryDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outLgAccountExpiryDt;
    @XmlElement(name = "OutLgAccountGuaranteeDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outLgAccountGuaranteeDt;
    @XmlElement(name = "OutLgAccountIssuanceJustific")
    protected String outLgAccountIssuanceJustific;
    @XmlElement(name = "OutLgAccountLanguageCode")
    protected int outLgAccountLanguageCode;
    @XmlElement(name = "OutLgAccountLastUpdDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outLgAccountLastUpdDt;
    @XmlElement(name = "OutLgAccountLgAmountBal", required = true)
    protected BigDecimal outLgAccountLgAmountBal;
    @XmlElement(name = "OutLgAccountLgDocCount")
    protected short outLgAccountLgDocCount;
    @XmlElement(name = "OutLgAccountLgFinalDocCnt")
    protected short outLgAccountLgFinalDocCnt;
    @XmlElement(name = "OutLgAccountLgInitialAmn", required = true)
    protected BigDecimal outLgAccountLgInitialAmn;
    @XmlElement(name = "OutLgAccountNextCommissDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outLgAccountNextCommissDt;
    @XmlElement(name = "OutLgAccountObligationStatus")
    protected String outLgAccountObligationStatus;
    @XmlElement(name = "OutLgAccountOldAccount")
    protected String outLgAccountOldAccount;
    @XmlElement(name = "OutLgAccountPendingModifCnt")
    protected short outLgAccountPendingModifCnt;
    @XmlElement(name = "OutLgAccountPostCharges", required = true)
    protected BigDecimal outLgAccountPostCharges;
    @XmlElement(name = "OutLgAccountPurchaseAmount", required = true)
    protected BigDecimal outLgAccountPurchaseAmount;
    @XmlElement(name = "OutLgAccountPurchaseAmtPcg", required = true)
    protected BigDecimal outLgAccountPurchaseAmtPcg;
    @XmlElement(name = "OutLgAccountPurchaseCurrency")
    protected String outLgAccountPurchaseCurrency;
    @XmlElement(name = "OutLgAccountPurchaseNo")
    protected String outLgAccountPurchaseNo;
    @XmlElement(name = "OutLgAccountReleaseDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outLgAccountReleaseDt;
    @XmlElement(name = "OutLgAccountRqDefaultAmn", required = true)
    protected BigDecimal outLgAccountRqDefaultAmn;
    @XmlElement(name = "OutLgAccountRqDefaultDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outLgAccountRqDefaultDt;
    @XmlElement(name = "OutLgAccountRqDefaultType")
    protected String outLgAccountRqDefaultType;
    @XmlElement(name = "OutLgAccountStampCharges", required = true)
    protected BigDecimal outLgAccountStampCharges;
    @XmlElement(name = "OutLgAccountTelegraphCharges", required = true)
    protected BigDecimal outLgAccountTelegraphCharges;
    @XmlElement(name = "OutLgAccountTelephoneCharges", required = true)
    protected BigDecimal outLgAccountTelephoneCharges;
    @XmlElement(name = "OutLgAccountTenderDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outLgAccountTenderDate;
    @XmlElement(name = "OutLgAccountTenderNo")
    protected String outLgAccountTenderNo;
    @XmlElement(name = "OutLgAccountThirdAddress1")
    protected String outLgAccountThirdAddress1;
    @XmlElement(name = "OutLgAccountThirdAddress2")
    protected String outLgAccountThirdAddress2;
    @XmlElement(name = "OutLgAccountThirdCity")
    protected String outLgAccountThirdCity;
    @XmlElement(name = "OutLgAccountThirdCountry")
    protected String outLgAccountThirdCountry;
    @XmlElement(name = "OutLgAccountThirdPartyNam")
    protected String outLgAccountThirdPartyNam;
    @XmlElement(name = "OutLgAccountThirdTelephone1")
    protected String outLgAccountThirdTelephone1;
    @XmlElement(name = "OutLgAccountThirdZipCode")
    protected String outLgAccountThirdZipCode;
    @XmlElement(name = "OutLgAccountTmstamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outLgAccountTmstamp;
    @XmlElement(name = "OutLgAccountTotComInCcAmn", required = true)
    protected BigDecimal outLgAccountTotComInCcAmn;
    @XmlElement(name = "OutLgAccountTotCommissionAmn", required = true)
    protected BigDecimal outLgAccountTotCommissionAmn;
    @XmlElement(name = "OutLgAccountTotExpInCcAmn", required = true)
    protected BigDecimal outLgAccountTotExpInCcAmn;
    @XmlElement(name = "OutLgAccountTotExpenseAmn", required = true)
    protected BigDecimal outLgAccountTotExpenseAmn;
    @XmlElement(name = "OutLgAccountTotalTax", required = true)
    protected BigDecimal outLgAccountTotalTax;
    @XmlElement(name = "OutLgAccountUnit")
    protected int outLgAccountUnit;
    @XmlElement(name = "OutLgProductDescription")
    protected String outLgProductDescription;
    @XmlElement(name = "OutLgProductIdProduct")
    protected int outLgProductIdProduct;
    @XmlElement(name = "OutLgUnitCode")
    protected int outLgUnitCode;
    @XmlElement(name = "OutLgUnitUnitName")
    protected String outLgUnitUnitName;
    @XmlElement(name = "OutMovedCurrencyDaysbase")
    protected short outMovedCurrencyDaysbase;
    @XmlElement(name = "OutMovedCurrencyDisplayedDecimalPlaces")
    protected short outMovedCurrencyDisplayedDecimalPlaces;
    @XmlElement(name = "OutMovedCurrencyFixedRate", required = true)
    protected BigDecimal outMovedCurrencyFixedRate;
    @XmlElement(name = "OutMovedCurrencyIdCurrency")
    protected int outMovedCurrencyIdCurrency;
    @XmlElement(name = "OutMovedCurrencyNationalFlag")
    protected String outMovedCurrencyNationalFlag;
    @XmlElement(name = "OutMovedCurrencyShortDescr")
    protected String outMovedCurrencyShortDescr;
    @XmlElement(name = "OutOtherAfmAfmNo")
    protected String outOtherAfmAfmNo;
    @XmlElement(name = "OutPrLgComChargeFreq")
    protected short outPrLgComChargeFreq;
    @XmlElement(name = "OutPrLgLgType")
    protected String outPrLgLgType;
    @XmlElement(name = "OutPrLgLstPrintTransDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outPrLgLstPrintTransDt;
    @XmlElement(name = "OutPrLgNxtPrintTransDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outPrLgNxtPrintTransDt;
    @XmlElement(name = "OutProffGenericDetailDescription")
    protected String outProffGenericDetailDescription;
    @XmlElement(name = "OutTaxOfficeTaxOfficeName")
    protected String outTaxOfficeTaxOfficeName;
    @XmlElement(name = "OutGrpLgAccExtrait")
    protected ArrayOfT1423VOutGrpLgAccExtraitItem outGrpLgAccExtrait;
    @XmlElement(name = "OutGrpLog")
    protected ArrayOfT1423VOutGrpLogItem outGrpLog;

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
     * Gets the value of the outAgreementProfitsAccountAccountCd property.
     * 
     */
    public short getOutAgreementProfitsAccountAccountCd() {
        return outAgreementProfitsAccountAccountCd;
    }

    /**
     * Sets the value of the outAgreementProfitsAccountAccountCd property.
     * 
     */
    public void setOutAgreementProfitsAccountAccountCd(short value) {
        this.outAgreementProfitsAccountAccountCd = value;
    }

    /**
     * Gets the value of the outAgreementProfitsAccountAccountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutAgreementProfitsAccountAccountNumber() {
        return outAgreementProfitsAccountAccountNumber;
    }

    /**
     * Sets the value of the outAgreementProfitsAccountAccountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutAgreementProfitsAccountAccountNumber(String value) {
        this.outAgreementProfitsAccountAccountNumber = value;
    }

    /**
     * Gets the value of the outBenefCustomerCustId property.
     * 
     */
    public int getOutBenefCustomerCustId() {
        return outBenefCustomerCustId;
    }

    /**
     * Sets the value of the outBenefCustomerCustId property.
     * 
     */
    public void setOutBenefCustomerCustId(int value) {
        this.outBenefCustomerCustId = value;
    }

    /**
     * Gets the value of the outBenefCustomerCustStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutBenefCustomerCustStatus() {
        return outBenefCustomerCustStatus;
    }

    /**
     * Sets the value of the outBenefCustomerCustStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutBenefCustomerCustStatus(String value) {
        this.outBenefCustomerCustStatus = value;
    }

    /**
     * Gets the value of the outBenefCustomerCustType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutBenefCustomerCustType() {
        return outBenefCustomerCustType;
    }

    /**
     * Sets the value of the outBenefCustomerCustType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutBenefCustomerCustType(String value) {
        this.outBenefCustomerCustType = value;
    }

    /**
     * Gets the value of the outBenefCustomerShortName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutBenefCustomerShortName() {
        return outBenefCustomerShortName;
    }

    /**
     * Sets the value of the outBenefCustomerShortName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutBenefCustomerShortName(String value) {
        this.outBenefCustomerShortName = value;
    }

    /**
     * Gets the value of the outBenefListSetDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutBenefListSetDescription() {
        return outBenefListSetDescription;
    }

    /**
     * Sets the value of the outBenefListSetDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutBenefListSetDescription(String value) {
        this.outBenefListSetDescription = value;
    }

    /**
     * Gets the value of the outChargesCurrencyDisplayedDecimalPlaces property.
     * 
     */
    public short getOutChargesCurrencyDisplayedDecimalPlaces() {
        return outChargesCurrencyDisplayedDecimalPlaces;
    }

    /**
     * Sets the value of the outChargesCurrencyDisplayedDecimalPlaces property.
     * 
     */
    public void setOutChargesCurrencyDisplayedDecimalPlaces(short value) {
        this.outChargesCurrencyDisplayedDecimalPlaces = value;
    }

    /**
     * Gets the value of the outChargesCurrencyIdCurrency property.
     * 
     */
    public int getOutChargesCurrencyIdCurrency() {
        return outChargesCurrencyIdCurrency;
    }

    /**
     * Sets the value of the outChargesCurrencyIdCurrency property.
     * 
     */
    public void setOutChargesCurrencyIdCurrency(int value) {
        this.outChargesCurrencyIdCurrency = value;
    }

    /**
     * Gets the value of the outChargesCurrencyNationalFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutChargesCurrencyNationalFlag() {
        return outChargesCurrencyNationalFlag;
    }

    /**
     * Sets the value of the outChargesCurrencyNationalFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutChargesCurrencyNationalFlag(String value) {
        this.outChargesCurrencyNationalFlag = value;
    }

    /**
     * Gets the value of the outChargesCurrencyShortDescr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutChargesCurrencyShortDescr() {
        return outChargesCurrencyShortDescr;
    }

    /**
     * Sets the value of the outChargesCurrencyShortDescr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutChargesCurrencyShortDescr(String value) {
        this.outChargesCurrencyShortDescr = value;
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
     * Gets the value of the outDepositProfitsAccountAccountCd property.
     * 
     */
    public short getOutDepositProfitsAccountAccountCd() {
        return outDepositProfitsAccountAccountCd;
    }

    /**
     * Sets the value of the outDepositProfitsAccountAccountCd property.
     * 
     */
    public void setOutDepositProfitsAccountAccountCd(short value) {
        this.outDepositProfitsAccountAccountCd = value;
    }

    /**
     * Gets the value of the outDepositProfitsAccountAccountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutDepositProfitsAccountAccountNumber() {
        return outDepositProfitsAccountAccountNumber;
    }

    /**
     * Sets the value of the outDepositProfitsAccountAccountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutDepositProfitsAccountAccountNumber(String value) {
        this.outDepositProfitsAccountAccountNumber = value;
    }

    /**
     * Gets the value of the outLgAccountAccCd property.
     * 
     */
    public short getOutLgAccountAccCd() {
        return outLgAccountAccCd;
    }

    /**
     * Sets the value of the outLgAccountAccCd property.
     * 
     */
    public void setOutLgAccountAccCd(short value) {
        this.outLgAccountAccCd = value;
    }

    /**
     * Gets the value of the outLgAccountAccLimitAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutLgAccountAccLimitAmn() {
        return outLgAccountAccLimitAmn;
    }

    /**
     * Sets the value of the outLgAccountAccLimitAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutLgAccountAccLimitAmn(BigDecimal value) {
        this.outLgAccountAccLimitAmn = value;
    }

    /**
     * Gets the value of the outLgAccountAccOpenDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutLgAccountAccOpenDt() {
        return outLgAccountAccOpenDt;
    }

    /**
     * Sets the value of the outLgAccountAccOpenDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutLgAccountAccOpenDt(XMLGregorianCalendar value) {
        this.outLgAccountAccOpenDt = value;
    }

    /**
     * Gets the value of the outLgAccountAccSn property.
     * 
     */
    public double getOutLgAccountAccSn() {
        return outLgAccountAccSn;
    }

    /**
     * Sets the value of the outLgAccountAccSn property.
     * 
     */
    public void setOutLgAccountAccSn(double value) {
        this.outLgAccountAccSn = value;
    }

    /**
     * Gets the value of the outLgAccountAccSpcAgrFlg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutLgAccountAccSpcAgrFlg() {
        return outLgAccountAccSpcAgrFlg;
    }

    /**
     * Sets the value of the outLgAccountAccSpcAgrFlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutLgAccountAccSpcAgrFlg(String value) {
        this.outLgAccountAccSpcAgrFlg = value;
    }

    /**
     * Gets the value of the outLgAccountAccStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutLgAccountAccStatus() {
        return outLgAccountAccStatus;
    }

    /**
     * Sets the value of the outLgAccountAccStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutLgAccountAccStatus(String value) {
        this.outLgAccountAccStatus = value;
    }

    /**
     * Gets the value of the outLgAccountAccType property.
     * 
     */
    public short getOutLgAccountAccType() {
        return outLgAccountAccType;
    }

    /**
     * Sets the value of the outLgAccountAccType property.
     * 
     */
    public void setOutLgAccountAccType(short value) {
        this.outLgAccountAccType = value;
    }

    /**
     * Gets the value of the outLgAccountCancellationDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutLgAccountCancellationDt() {
        return outLgAccountCancellationDt;
    }

    /**
     * Sets the value of the outLgAccountCancellationDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutLgAccountCancellationDt(XMLGregorianCalendar value) {
        this.outLgAccountCancellationDt = value;
    }

    /**
     * Gets the value of the outLgAccountCifAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutLgAccountCifAmount() {
        return outLgAccountCifAmount;
    }

    /**
     * Sets the value of the outLgAccountCifAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutLgAccountCifAmount(BigDecimal value) {
        this.outLgAccountCifAmount = value;
    }

    /**
     * Gets the value of the outLgAccountCifCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutLgAccountCifCurrency() {
        return outLgAccountCifCurrency;
    }

    /**
     * Sets the value of the outLgAccountCifCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutLgAccountCifCurrency(String value) {
        this.outLgAccountCifCurrency = value;
    }

    /**
     * Gets the value of the outLgAccountComInAcBal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutLgAccountComInAcBal() {
        return outLgAccountComInAcBal;
    }

    /**
     * Sets the value of the outLgAccountComInAcBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutLgAccountComInAcBal(BigDecimal value) {
        this.outLgAccountComInAcBal = value;
    }

    /**
     * Gets the value of the outLgAccountComment1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutLgAccountComment1() {
        return outLgAccountComment1;
    }

    /**
     * Sets the value of the outLgAccountComment1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutLgAccountComment1(String value) {
        this.outLgAccountComment1 = value;
    }

    /**
     * Gets the value of the outLgAccountComment2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutLgAccountComment2() {
        return outLgAccountComment2;
    }

    /**
     * Sets the value of the outLgAccountComment2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutLgAccountComment2(String value) {
        this.outLgAccountComment2 = value;
    }

    /**
     * Gets the value of the outLgAccountCommissionBal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutLgAccountCommissionBal() {
        return outLgAccountCommissionBal;
    }

    /**
     * Sets the value of the outLgAccountCommissionBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutLgAccountCommissionBal(BigDecimal value) {
        this.outLgAccountCommissionBal = value;
    }

    /**
     * Gets the value of the outLgAccountCommissionSpread property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutLgAccountCommissionSpread() {
        return outLgAccountCommissionSpread;
    }

    /**
     * Sets the value of the outLgAccountCommissionSpread property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutLgAccountCommissionSpread(BigDecimal value) {
        this.outLgAccountCommissionSpread = value;
    }

    /**
     * Gets the value of the outLgAccountCusStmLstTrnDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutLgAccountCusStmLstTrnDt() {
        return outLgAccountCusStmLstTrnDt;
    }

    /**
     * Sets the value of the outLgAccountCusStmLstTrnDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutLgAccountCusStmLstTrnDt(XMLGregorianCalendar value) {
        this.outLgAccountCusStmLstTrnDt = value;
    }

    /**
     * Gets the value of the outLgAccountCusStmNxtTrnDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutLgAccountCusStmNxtTrnDt() {
        return outLgAccountCusStmNxtTrnDt;
    }

    /**
     * Sets the value of the outLgAccountCusStmNxtTrnDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutLgAccountCusStmNxtTrnDt(XMLGregorianCalendar value) {
        this.outLgAccountCusStmNxtTrnDt = value;
    }

    /**
     * Gets the value of the outLgAccountDefaultAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutLgAccountDefaultAmn() {
        return outLgAccountDefaultAmn;
    }

    /**
     * Sets the value of the outLgAccountDefaultAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutLgAccountDefaultAmn(BigDecimal value) {
        this.outLgAccountDefaultAmn = value;
    }

    /**
     * Gets the value of the outLgAccountDefaultDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutLgAccountDefaultDate() {
        return outLgAccountDefaultDate;
    }

    /**
     * Sets the value of the outLgAccountDefaultDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutLgAccountDefaultDate(XMLGregorianCalendar value) {
        this.outLgAccountDefaultDate = value;
    }

    /**
     * Gets the value of the outLgAccountDefaultType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutLgAccountDefaultType() {
        return outLgAccountDefaultType;
    }

    /**
     * Sets the value of the outLgAccountDefaultType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutLgAccountDefaultType(String value) {
        this.outLgAccountDefaultType = value;
    }

    /**
     * Gets the value of the outLgAccountDepAccCd property.
     * 
     */
    public short getOutLgAccountDepAccCd() {
        return outLgAccountDepAccCd;
    }

    /**
     * Sets the value of the outLgAccountDepAccCd property.
     * 
     */
    public void setOutLgAccountDepAccCd(short value) {
        this.outLgAccountDepAccCd = value;
    }

    /**
     * Gets the value of the outLgAccountDepAccSn property.
     * 
     */
    public double getOutLgAccountDepAccSn() {
        return outLgAccountDepAccSn;
    }

    /**
     * Sets the value of the outLgAccountDepAccSn property.
     * 
     */
    public void setOutLgAccountDepAccSn(double value) {
        this.outLgAccountDepAccSn = value;
    }

    /**
     * Gets the value of the outLgAccountDepAccType property.
     * 
     */
    public short getOutLgAccountDepAccType() {
        return outLgAccountDepAccType;
    }

    /**
     * Sets the value of the outLgAccountDepAccType property.
     * 
     */
    public void setOutLgAccountDepAccType(short value) {
        this.outLgAccountDepAccType = value;
    }

    /**
     * Gets the value of the outLgAccountDepAccUnit property.
     * 
     */
    public int getOutLgAccountDepAccUnit() {
        return outLgAccountDepAccUnit;
    }

    /**
     * Sets the value of the outLgAccountDepAccUnit property.
     * 
     */
    public void setOutLgAccountDepAccUnit(int value) {
        this.outLgAccountDepAccUnit = value;
    }

    /**
     * Gets the value of the outLgAccountExpInAcBal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutLgAccountExpInAcBal() {
        return outLgAccountExpInAcBal;
    }

    /**
     * Sets the value of the outLgAccountExpInAcBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutLgAccountExpInAcBal(BigDecimal value) {
        this.outLgAccountExpInAcBal = value;
    }

    /**
     * Gets the value of the outLgAccountExpenseBal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutLgAccountExpenseBal() {
        return outLgAccountExpenseBal;
    }

    /**
     * Sets the value of the outLgAccountExpenseBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutLgAccountExpenseBal(BigDecimal value) {
        this.outLgAccountExpenseBal = value;
    }

    /**
     * Gets the value of the outLgAccountExpirationType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutLgAccountExpirationType() {
        return outLgAccountExpirationType;
    }

    /**
     * Sets the value of the outLgAccountExpirationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutLgAccountExpirationType(String value) {
        this.outLgAccountExpirationType = value;
    }

    /**
     * Gets the value of the outLgAccountExpiryDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutLgAccountExpiryDt() {
        return outLgAccountExpiryDt;
    }

    /**
     * Sets the value of the outLgAccountExpiryDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutLgAccountExpiryDt(XMLGregorianCalendar value) {
        this.outLgAccountExpiryDt = value;
    }

    /**
     * Gets the value of the outLgAccountGuaranteeDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutLgAccountGuaranteeDt() {
        return outLgAccountGuaranteeDt;
    }

    /**
     * Sets the value of the outLgAccountGuaranteeDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutLgAccountGuaranteeDt(XMLGregorianCalendar value) {
        this.outLgAccountGuaranteeDt = value;
    }

    /**
     * Gets the value of the outLgAccountIssuanceJustific property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutLgAccountIssuanceJustific() {
        return outLgAccountIssuanceJustific;
    }

    /**
     * Sets the value of the outLgAccountIssuanceJustific property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutLgAccountIssuanceJustific(String value) {
        this.outLgAccountIssuanceJustific = value;
    }

    /**
     * Gets the value of the outLgAccountLanguageCode property.
     * 
     */
    public int getOutLgAccountLanguageCode() {
        return outLgAccountLanguageCode;
    }

    /**
     * Sets the value of the outLgAccountLanguageCode property.
     * 
     */
    public void setOutLgAccountLanguageCode(int value) {
        this.outLgAccountLanguageCode = value;
    }

    /**
     * Gets the value of the outLgAccountLastUpdDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutLgAccountLastUpdDt() {
        return outLgAccountLastUpdDt;
    }

    /**
     * Sets the value of the outLgAccountLastUpdDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutLgAccountLastUpdDt(XMLGregorianCalendar value) {
        this.outLgAccountLastUpdDt = value;
    }

    /**
     * Gets the value of the outLgAccountLgAmountBal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutLgAccountLgAmountBal() {
        return outLgAccountLgAmountBal;
    }

    /**
     * Sets the value of the outLgAccountLgAmountBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutLgAccountLgAmountBal(BigDecimal value) {
        this.outLgAccountLgAmountBal = value;
    }

    /**
     * Gets the value of the outLgAccountLgDocCount property.
     * 
     */
    public short getOutLgAccountLgDocCount() {
        return outLgAccountLgDocCount;
    }

    /**
     * Sets the value of the outLgAccountLgDocCount property.
     * 
     */
    public void setOutLgAccountLgDocCount(short value) {
        this.outLgAccountLgDocCount = value;
    }

    /**
     * Gets the value of the outLgAccountLgFinalDocCnt property.
     * 
     */
    public short getOutLgAccountLgFinalDocCnt() {
        return outLgAccountLgFinalDocCnt;
    }

    /**
     * Sets the value of the outLgAccountLgFinalDocCnt property.
     * 
     */
    public void setOutLgAccountLgFinalDocCnt(short value) {
        this.outLgAccountLgFinalDocCnt = value;
    }

    /**
     * Gets the value of the outLgAccountLgInitialAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutLgAccountLgInitialAmn() {
        return outLgAccountLgInitialAmn;
    }

    /**
     * Sets the value of the outLgAccountLgInitialAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutLgAccountLgInitialAmn(BigDecimal value) {
        this.outLgAccountLgInitialAmn = value;
    }

    /**
     * Gets the value of the outLgAccountNextCommissDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutLgAccountNextCommissDt() {
        return outLgAccountNextCommissDt;
    }

    /**
     * Sets the value of the outLgAccountNextCommissDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutLgAccountNextCommissDt(XMLGregorianCalendar value) {
        this.outLgAccountNextCommissDt = value;
    }

    /**
     * Gets the value of the outLgAccountObligationStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutLgAccountObligationStatus() {
        return outLgAccountObligationStatus;
    }

    /**
     * Sets the value of the outLgAccountObligationStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutLgAccountObligationStatus(String value) {
        this.outLgAccountObligationStatus = value;
    }

    /**
     * Gets the value of the outLgAccountOldAccount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutLgAccountOldAccount() {
        return outLgAccountOldAccount;
    }

    /**
     * Sets the value of the outLgAccountOldAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutLgAccountOldAccount(String value) {
        this.outLgAccountOldAccount = value;
    }

    /**
     * Gets the value of the outLgAccountPendingModifCnt property.
     * 
     */
    public short getOutLgAccountPendingModifCnt() {
        return outLgAccountPendingModifCnt;
    }

    /**
     * Sets the value of the outLgAccountPendingModifCnt property.
     * 
     */
    public void setOutLgAccountPendingModifCnt(short value) {
        this.outLgAccountPendingModifCnt = value;
    }

    /**
     * Gets the value of the outLgAccountPostCharges property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutLgAccountPostCharges() {
        return outLgAccountPostCharges;
    }

    /**
     * Sets the value of the outLgAccountPostCharges property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutLgAccountPostCharges(BigDecimal value) {
        this.outLgAccountPostCharges = value;
    }

    /**
     * Gets the value of the outLgAccountPurchaseAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutLgAccountPurchaseAmount() {
        return outLgAccountPurchaseAmount;
    }

    /**
     * Sets the value of the outLgAccountPurchaseAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutLgAccountPurchaseAmount(BigDecimal value) {
        this.outLgAccountPurchaseAmount = value;
    }

    /**
     * Gets the value of the outLgAccountPurchaseAmtPcg property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutLgAccountPurchaseAmtPcg() {
        return outLgAccountPurchaseAmtPcg;
    }

    /**
     * Sets the value of the outLgAccountPurchaseAmtPcg property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutLgAccountPurchaseAmtPcg(BigDecimal value) {
        this.outLgAccountPurchaseAmtPcg = value;
    }

    /**
     * Gets the value of the outLgAccountPurchaseCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutLgAccountPurchaseCurrency() {
        return outLgAccountPurchaseCurrency;
    }

    /**
     * Sets the value of the outLgAccountPurchaseCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutLgAccountPurchaseCurrency(String value) {
        this.outLgAccountPurchaseCurrency = value;
    }

    /**
     * Gets the value of the outLgAccountPurchaseNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutLgAccountPurchaseNo() {
        return outLgAccountPurchaseNo;
    }

    /**
     * Sets the value of the outLgAccountPurchaseNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutLgAccountPurchaseNo(String value) {
        this.outLgAccountPurchaseNo = value;
    }

    /**
     * Gets the value of the outLgAccountReleaseDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutLgAccountReleaseDt() {
        return outLgAccountReleaseDt;
    }

    /**
     * Sets the value of the outLgAccountReleaseDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutLgAccountReleaseDt(XMLGregorianCalendar value) {
        this.outLgAccountReleaseDt = value;
    }

    /**
     * Gets the value of the outLgAccountRqDefaultAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutLgAccountRqDefaultAmn() {
        return outLgAccountRqDefaultAmn;
    }

    /**
     * Sets the value of the outLgAccountRqDefaultAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutLgAccountRqDefaultAmn(BigDecimal value) {
        this.outLgAccountRqDefaultAmn = value;
    }

    /**
     * Gets the value of the outLgAccountRqDefaultDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutLgAccountRqDefaultDt() {
        return outLgAccountRqDefaultDt;
    }

    /**
     * Sets the value of the outLgAccountRqDefaultDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutLgAccountRqDefaultDt(XMLGregorianCalendar value) {
        this.outLgAccountRqDefaultDt = value;
    }

    /**
     * Gets the value of the outLgAccountRqDefaultType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutLgAccountRqDefaultType() {
        return outLgAccountRqDefaultType;
    }

    /**
     * Sets the value of the outLgAccountRqDefaultType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutLgAccountRqDefaultType(String value) {
        this.outLgAccountRqDefaultType = value;
    }

    /**
     * Gets the value of the outLgAccountStampCharges property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutLgAccountStampCharges() {
        return outLgAccountStampCharges;
    }

    /**
     * Sets the value of the outLgAccountStampCharges property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutLgAccountStampCharges(BigDecimal value) {
        this.outLgAccountStampCharges = value;
    }

    /**
     * Gets the value of the outLgAccountTelegraphCharges property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutLgAccountTelegraphCharges() {
        return outLgAccountTelegraphCharges;
    }

    /**
     * Sets the value of the outLgAccountTelegraphCharges property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutLgAccountTelegraphCharges(BigDecimal value) {
        this.outLgAccountTelegraphCharges = value;
    }

    /**
     * Gets the value of the outLgAccountTelephoneCharges property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutLgAccountTelephoneCharges() {
        return outLgAccountTelephoneCharges;
    }

    /**
     * Sets the value of the outLgAccountTelephoneCharges property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutLgAccountTelephoneCharges(BigDecimal value) {
        this.outLgAccountTelephoneCharges = value;
    }

    /**
     * Gets the value of the outLgAccountTenderDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutLgAccountTenderDate() {
        return outLgAccountTenderDate;
    }

    /**
     * Sets the value of the outLgAccountTenderDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutLgAccountTenderDate(XMLGregorianCalendar value) {
        this.outLgAccountTenderDate = value;
    }

    /**
     * Gets the value of the outLgAccountTenderNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutLgAccountTenderNo() {
        return outLgAccountTenderNo;
    }

    /**
     * Sets the value of the outLgAccountTenderNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutLgAccountTenderNo(String value) {
        this.outLgAccountTenderNo = value;
    }

    /**
     * Gets the value of the outLgAccountThirdAddress1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutLgAccountThirdAddress1() {
        return outLgAccountThirdAddress1;
    }

    /**
     * Sets the value of the outLgAccountThirdAddress1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutLgAccountThirdAddress1(String value) {
        this.outLgAccountThirdAddress1 = value;
    }

    /**
     * Gets the value of the outLgAccountThirdAddress2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutLgAccountThirdAddress2() {
        return outLgAccountThirdAddress2;
    }

    /**
     * Sets the value of the outLgAccountThirdAddress2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutLgAccountThirdAddress2(String value) {
        this.outLgAccountThirdAddress2 = value;
    }

    /**
     * Gets the value of the outLgAccountThirdCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutLgAccountThirdCity() {
        return outLgAccountThirdCity;
    }

    /**
     * Sets the value of the outLgAccountThirdCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutLgAccountThirdCity(String value) {
        this.outLgAccountThirdCity = value;
    }

    /**
     * Gets the value of the outLgAccountThirdCountry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutLgAccountThirdCountry() {
        return outLgAccountThirdCountry;
    }

    /**
     * Sets the value of the outLgAccountThirdCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutLgAccountThirdCountry(String value) {
        this.outLgAccountThirdCountry = value;
    }

    /**
     * Gets the value of the outLgAccountThirdPartyNam property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutLgAccountThirdPartyNam() {
        return outLgAccountThirdPartyNam;
    }

    /**
     * Sets the value of the outLgAccountThirdPartyNam property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutLgAccountThirdPartyNam(String value) {
        this.outLgAccountThirdPartyNam = value;
    }

    /**
     * Gets the value of the outLgAccountThirdTelephone1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutLgAccountThirdTelephone1() {
        return outLgAccountThirdTelephone1;
    }

    /**
     * Sets the value of the outLgAccountThirdTelephone1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutLgAccountThirdTelephone1(String value) {
        this.outLgAccountThirdTelephone1 = value;
    }

    /**
     * Gets the value of the outLgAccountThirdZipCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutLgAccountThirdZipCode() {
        return outLgAccountThirdZipCode;
    }

    /**
     * Sets the value of the outLgAccountThirdZipCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutLgAccountThirdZipCode(String value) {
        this.outLgAccountThirdZipCode = value;
    }

    /**
     * Gets the value of the outLgAccountTmstamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutLgAccountTmstamp() {
        return outLgAccountTmstamp;
    }

    /**
     * Sets the value of the outLgAccountTmstamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutLgAccountTmstamp(XMLGregorianCalendar value) {
        this.outLgAccountTmstamp = value;
    }

    /**
     * Gets the value of the outLgAccountTotComInCcAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutLgAccountTotComInCcAmn() {
        return outLgAccountTotComInCcAmn;
    }

    /**
     * Sets the value of the outLgAccountTotComInCcAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutLgAccountTotComInCcAmn(BigDecimal value) {
        this.outLgAccountTotComInCcAmn = value;
    }

    /**
     * Gets the value of the outLgAccountTotCommissionAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutLgAccountTotCommissionAmn() {
        return outLgAccountTotCommissionAmn;
    }

    /**
     * Sets the value of the outLgAccountTotCommissionAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutLgAccountTotCommissionAmn(BigDecimal value) {
        this.outLgAccountTotCommissionAmn = value;
    }

    /**
     * Gets the value of the outLgAccountTotExpInCcAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutLgAccountTotExpInCcAmn() {
        return outLgAccountTotExpInCcAmn;
    }

    /**
     * Sets the value of the outLgAccountTotExpInCcAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutLgAccountTotExpInCcAmn(BigDecimal value) {
        this.outLgAccountTotExpInCcAmn = value;
    }

    /**
     * Gets the value of the outLgAccountTotExpenseAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutLgAccountTotExpenseAmn() {
        return outLgAccountTotExpenseAmn;
    }

    /**
     * Sets the value of the outLgAccountTotExpenseAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutLgAccountTotExpenseAmn(BigDecimal value) {
        this.outLgAccountTotExpenseAmn = value;
    }

    /**
     * Gets the value of the outLgAccountTotalTax property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutLgAccountTotalTax() {
        return outLgAccountTotalTax;
    }

    /**
     * Sets the value of the outLgAccountTotalTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutLgAccountTotalTax(BigDecimal value) {
        this.outLgAccountTotalTax = value;
    }

    /**
     * Gets the value of the outLgAccountUnit property.
     * 
     */
    public int getOutLgAccountUnit() {
        return outLgAccountUnit;
    }

    /**
     * Sets the value of the outLgAccountUnit property.
     * 
     */
    public void setOutLgAccountUnit(int value) {
        this.outLgAccountUnit = value;
    }

    /**
     * Gets the value of the outLgProductDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutLgProductDescription() {
        return outLgProductDescription;
    }

    /**
     * Sets the value of the outLgProductDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutLgProductDescription(String value) {
        this.outLgProductDescription = value;
    }

    /**
     * Gets the value of the outLgProductIdProduct property.
     * 
     */
    public int getOutLgProductIdProduct() {
        return outLgProductIdProduct;
    }

    /**
     * Sets the value of the outLgProductIdProduct property.
     * 
     */
    public void setOutLgProductIdProduct(int value) {
        this.outLgProductIdProduct = value;
    }

    /**
     * Gets the value of the outLgUnitCode property.
     * 
     */
    public int getOutLgUnitCode() {
        return outLgUnitCode;
    }

    /**
     * Sets the value of the outLgUnitCode property.
     * 
     */
    public void setOutLgUnitCode(int value) {
        this.outLgUnitCode = value;
    }

    /**
     * Gets the value of the outLgUnitUnitName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutLgUnitUnitName() {
        return outLgUnitUnitName;
    }

    /**
     * Sets the value of the outLgUnitUnitName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutLgUnitUnitName(String value) {
        this.outLgUnitUnitName = value;
    }

    /**
     * Gets the value of the outMovedCurrencyDaysbase property.
     * 
     */
    public short getOutMovedCurrencyDaysbase() {
        return outMovedCurrencyDaysbase;
    }

    /**
     * Sets the value of the outMovedCurrencyDaysbase property.
     * 
     */
    public void setOutMovedCurrencyDaysbase(short value) {
        this.outMovedCurrencyDaysbase = value;
    }

    /**
     * Gets the value of the outMovedCurrencyDisplayedDecimalPlaces property.
     * 
     */
    public short getOutMovedCurrencyDisplayedDecimalPlaces() {
        return outMovedCurrencyDisplayedDecimalPlaces;
    }

    /**
     * Sets the value of the outMovedCurrencyDisplayedDecimalPlaces property.
     * 
     */
    public void setOutMovedCurrencyDisplayedDecimalPlaces(short value) {
        this.outMovedCurrencyDisplayedDecimalPlaces = value;
    }

    /**
     * Gets the value of the outMovedCurrencyFixedRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutMovedCurrencyFixedRate() {
        return outMovedCurrencyFixedRate;
    }

    /**
     * Sets the value of the outMovedCurrencyFixedRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutMovedCurrencyFixedRate(BigDecimal value) {
        this.outMovedCurrencyFixedRate = value;
    }

    /**
     * Gets the value of the outMovedCurrencyIdCurrency property.
     * 
     */
    public int getOutMovedCurrencyIdCurrency() {
        return outMovedCurrencyIdCurrency;
    }

    /**
     * Sets the value of the outMovedCurrencyIdCurrency property.
     * 
     */
    public void setOutMovedCurrencyIdCurrency(int value) {
        this.outMovedCurrencyIdCurrency = value;
    }

    /**
     * Gets the value of the outMovedCurrencyNationalFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutMovedCurrencyNationalFlag() {
        return outMovedCurrencyNationalFlag;
    }

    /**
     * Sets the value of the outMovedCurrencyNationalFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutMovedCurrencyNationalFlag(String value) {
        this.outMovedCurrencyNationalFlag = value;
    }

    /**
     * Gets the value of the outMovedCurrencyShortDescr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutMovedCurrencyShortDescr() {
        return outMovedCurrencyShortDescr;
    }

    /**
     * Sets the value of the outMovedCurrencyShortDescr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutMovedCurrencyShortDescr(String value) {
        this.outMovedCurrencyShortDescr = value;
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
     * Gets the value of the outPrLgComChargeFreq property.
     * 
     */
    public short getOutPrLgComChargeFreq() {
        return outPrLgComChargeFreq;
    }

    /**
     * Sets the value of the outPrLgComChargeFreq property.
     * 
     */
    public void setOutPrLgComChargeFreq(short value) {
        this.outPrLgComChargeFreq = value;
    }

    /**
     * Gets the value of the outPrLgLgType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutPrLgLgType() {
        return outPrLgLgType;
    }

    /**
     * Sets the value of the outPrLgLgType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutPrLgLgType(String value) {
        this.outPrLgLgType = value;
    }

    /**
     * Gets the value of the outPrLgLstPrintTransDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutPrLgLstPrintTransDt() {
        return outPrLgLstPrintTransDt;
    }

    /**
     * Sets the value of the outPrLgLstPrintTransDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutPrLgLstPrintTransDt(XMLGregorianCalendar value) {
        this.outPrLgLstPrintTransDt = value;
    }

    /**
     * Gets the value of the outPrLgNxtPrintTransDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutPrLgNxtPrintTransDt() {
        return outPrLgNxtPrintTransDt;
    }

    /**
     * Sets the value of the outPrLgNxtPrintTransDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutPrLgNxtPrintTransDt(XMLGregorianCalendar value) {
        this.outPrLgNxtPrintTransDt = value;
    }

    /**
     * Gets the value of the outProffGenericDetailDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutProffGenericDetailDescription() {
        return outProffGenericDetailDescription;
    }

    /**
     * Sets the value of the outProffGenericDetailDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutProffGenericDetailDescription(String value) {
        this.outProffGenericDetailDescription = value;
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
     * Gets the value of the outGrpLgAccExtrait property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfT1423VOutGrpLgAccExtraitItem }
     *     
     */
    public ArrayOfT1423VOutGrpLgAccExtraitItem getOutGrpLgAccExtrait() {
        return outGrpLgAccExtrait;
    }

    /**
     * Sets the value of the outGrpLgAccExtrait property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfT1423VOutGrpLgAccExtraitItem }
     *     
     */
    public void setOutGrpLgAccExtrait(ArrayOfT1423VOutGrpLgAccExtraitItem value) {
        this.outGrpLgAccExtrait = value;
    }

    /**
     * Gets the value of the outGrpLog property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfT1423VOutGrpLogItem }
     *     
     */
    public ArrayOfT1423VOutGrpLogItem getOutGrpLog() {
        return outGrpLog;
    }

    /**
     * Sets the value of the outGrpLog property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfT1423VOutGrpLogItem }
     *     
     */
    public void setOutGrpLog(ArrayOfT1423VOutGrpLogItem value) {
        this.outGrpLog = value;
    }

}
