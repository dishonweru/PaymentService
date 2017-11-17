
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for SecuritiesAccountRetrieveImport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SecuritiesAccountRetrieveImport">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}BaseImport">
 *       &lt;sequence>
 *         &lt;element name="ProfitsAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InAisinOnlyIefSuppliedFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InAuthGrantedIefSuppliedFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InBlockJustificIdJustific" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InBondCurrencyIdCurrency" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InBondMaturityJustificIdJustific" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InBondStatusFlagIefSuppliedFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCategGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InClientLogMntRecordingAuthorizer1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InClientLogMntRecordingAuthorizer2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InClientLogMntRecordingChannelId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InClientLogMntRecordingPrftSystem" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InClientLogMntRecordingReversalFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InClientLogMntRecordingTerminalNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InClientLogMntRecordingTrxCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InClientLogMntRecordingTrxDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InClientLogMntRecordingTrxUnit" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InClientLogMntRecordingTrxUser" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCmdIefSuppliedCommand" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCommDepositAccountAccountNumber" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="InCommDepositAccountCDigit" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InCorrespDepositAccountAccountNumber" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="InCorrespDepositAccountCDigit" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InCustomerCustId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InDefaultTrbondBondCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InDummyJustificIdJustific" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InDummyProductIdProduct" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InFaceValueCurrencyIdCurrency" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InFilterTrbondBondDescGr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InFilterTrbondBondIsin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InFinscGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InGroupGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InLiquitLnsCommissionDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InLiquitLnsCommissionIdCommission" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InParticDepositAccountAccountNumber" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="InParticDepositAccountCDigit" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InParticLnsCommissionDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InParticLnsCommissionIdCommission" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InPrftTransactionIdTransact" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InSecuritiesProductIdProduct" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InSecuritiesTypeTypeId" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InSubcategGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InTrbondBondAddress1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InTrbondBondAddress2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InTrbondBondCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InTrbondBondCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InTrbondBondCompany" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InTrbondBondCountry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InTrbondBondCoupons" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InTrbondBondCurrCoupon" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InTrbondBondDenomination" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InTrbondBondDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InTrbondBondDescGr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InTrbondBondDurationUnit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InTrbondBondDurationVal" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InTrbondBondFlagResident" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InTrbondBondFmtEnd" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InTrbondBondFmtStart" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InTrbondBondInterestFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InTrbondBondInterestPctg" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InTrbondBondIsin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InTrbondBondPhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InTrbondBondRenewalFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InTrbondBondReutersCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InTrbondBondTaxRegNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InTrbondBondXaaCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InTrbondBondZip" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InTrbondCustomerFlags" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InTrbondDisposalAccCd" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InTrbondDisposalAccSn" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InTrbondDisposalAccType" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InTrbondDisposalAccUnit" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InTrbondDisposalAdminFlg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InTrbondDistrEndDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InTrbondDistrStartDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InTrbondEndOfOrdersTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InTrbondEntryStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InTrbondInitDistrValue" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InTrbondInitialBondCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InTrbondIntCalcDaysbase" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InTrbondIntCalcDurDays" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InTrbondLastTrxUnit" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InTrbondLastTrxUsr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InTrbondMaxAcquisitionAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InTrbondMinTradingQty" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InTrbondNonTradeableBond" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InTrbondRegisterFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InTrbondRightsBond" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InTrbondSecuritiesType" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InTrbondShareType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InTrbondTaxPctgNonResid" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InTrbondTaxPctgResident" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InTrbondTmstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InTrbondTradingAccCd" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InTrbondTradingAccSn" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InTrbondTradingAccType" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InTrbondTradingAccUnit" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InTrnsfLnsCommissionDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InTrnsfLnsCommissionIdCommission" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InUnblockJustificIdJustific" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecuritiesAccountRetrieveImport", propOrder = {
    "profitsAccount",
    "inAisinOnlyIefSuppliedFlag",
    "inAuthGrantedIefSuppliedFlag",
    "inBlockJustificIdJustific",
    "inBondCurrencyIdCurrency",
    "inBondMaturityJustificIdJustific",
    "inBondStatusFlagIefSuppliedFlag",
    "inCategGenericDetailSerialNum",
    "inClientLogMntRecordingAuthorizer1",
    "inClientLogMntRecordingAuthorizer2",
    "inClientLogMntRecordingChannelId",
    "inClientLogMntRecordingPrftSystem",
    "inClientLogMntRecordingReversalFlag",
    "inClientLogMntRecordingTerminalNumber",
    "inClientLogMntRecordingTrxCode",
    "inClientLogMntRecordingTrxDate",
    "inClientLogMntRecordingTrxUnit",
    "inClientLogMntRecordingTrxUser",
    "inCmdIefSuppliedCommand",
    "inCommDepositAccountAccountNumber",
    "inCommDepositAccountCDigit",
    "inCorrespDepositAccountAccountNumber",
    "inCorrespDepositAccountCDigit",
    "inCustomerCustId",
    "inDefaultTrbondBondCode",
    "inDummyJustificIdJustific",
    "inDummyProductIdProduct",
    "inFaceValueCurrencyIdCurrency",
    "inFilterTrbondBondDescGr",
    "inFilterTrbondBondIsin",
    "inFinscGenericDetailSerialNum",
    "inGroupGenericDetailSerialNum",
    "inLiquitLnsCommissionDescription",
    "inLiquitLnsCommissionIdCommission",
    "inParticDepositAccountAccountNumber",
    "inParticDepositAccountCDigit",
    "inParticLnsCommissionDescription",
    "inParticLnsCommissionIdCommission",
    "inPrftTransactionIdTransact",
    "inSecuritiesProductIdProduct",
    "inSecuritiesTypeTypeId",
    "inSubcategGenericDetailSerialNum",
    "inTrbondBondAddress1",
    "inTrbondBondAddress2",
    "inTrbondBondCity",
    "inTrbondBondCode",
    "inTrbondBondCompany",
    "inTrbondBondCountry",
    "inTrbondBondCoupons",
    "inTrbondBondCurrCoupon",
    "inTrbondBondDenomination",
    "inTrbondBondDesc",
    "inTrbondBondDescGr",
    "inTrbondBondDurationUnit",
    "inTrbondBondDurationVal",
    "inTrbondBondFlagResident",
    "inTrbondBondFmtEnd",
    "inTrbondBondFmtStart",
    "inTrbondBondInterestFlag",
    "inTrbondBondInterestPctg",
    "inTrbondBondIsin",
    "inTrbondBondPhone",
    "inTrbondBondRenewalFlag",
    "inTrbondBondReutersCode",
    "inTrbondBondTaxRegNo",
    "inTrbondBondXaaCode",
    "inTrbondBondZip",
    "inTrbondCustomerFlags",
    "inTrbondDisposalAccCd",
    "inTrbondDisposalAccSn",
    "inTrbondDisposalAccType",
    "inTrbondDisposalAccUnit",
    "inTrbondDisposalAdminFlg",
    "inTrbondDistrEndDate",
    "inTrbondDistrStartDate",
    "inTrbondEndOfOrdersTime",
    "inTrbondEntryStatus",
    "inTrbondInitDistrValue",
    "inTrbondInitialBondCode",
    "inTrbondIntCalcDaysbase",
    "inTrbondIntCalcDurDays",
    "inTrbondLastTrxUnit",
    "inTrbondLastTrxUsr",
    "inTrbondMaxAcquisitionAmount",
    "inTrbondMinTradingQty",
    "inTrbondNonTradeableBond",
    "inTrbondRegisterFlag",
    "inTrbondRightsBond",
    "inTrbondSecuritiesType",
    "inTrbondShareType",
    "inTrbondTaxPctgNonResid",
    "inTrbondTaxPctgResident",
    "inTrbondTmstamp",
    "inTrbondTradingAccCd",
    "inTrbondTradingAccSn",
    "inTrbondTradingAccType",
    "inTrbondTradingAccUnit",
    "inTrnsfLnsCommissionDescription",
    "inTrnsfLnsCommissionIdCommission",
    "inUnblockJustificIdJustific"
})
public class SecuritiesAccountRetrieveImport
    extends BaseImport
{

    @XmlElement(name = "ProfitsAccount")
    protected String profitsAccount;
    @XmlElement(name = "InAisinOnlyIefSuppliedFlag")
    protected String inAisinOnlyIefSuppliedFlag;
    @XmlElement(name = "InAuthGrantedIefSuppliedFlag")
    protected String inAuthGrantedIefSuppliedFlag;
    @XmlElement(name = "InBlockJustificIdJustific")
    protected int inBlockJustificIdJustific;
    @XmlElement(name = "InBondCurrencyIdCurrency")
    protected int inBondCurrencyIdCurrency;
    @XmlElement(name = "InBondMaturityJustificIdJustific")
    protected int inBondMaturityJustificIdJustific;
    @XmlElement(name = "InBondStatusFlagIefSuppliedFlag")
    protected String inBondStatusFlagIefSuppliedFlag;
    @XmlElement(name = "InCategGenericDetailSerialNum")
    protected int inCategGenericDetailSerialNum;
    @XmlElement(name = "InClientLogMntRecordingAuthorizer1")
    protected String inClientLogMntRecordingAuthorizer1;
    @XmlElement(name = "InClientLogMntRecordingAuthorizer2")
    protected String inClientLogMntRecordingAuthorizer2;
    @XmlElement(name = "InClientLogMntRecordingChannelId")
    protected int inClientLogMntRecordingChannelId;
    @XmlElement(name = "InClientLogMntRecordingPrftSystem")
    protected short inClientLogMntRecordingPrftSystem;
    @XmlElement(name = "InClientLogMntRecordingReversalFlag")
    protected String inClientLogMntRecordingReversalFlag;
    @XmlElement(name = "InClientLogMntRecordingTerminalNumber")
    protected String inClientLogMntRecordingTerminalNumber;
    @XmlElement(name = "InClientLogMntRecordingTrxCode")
    protected int inClientLogMntRecordingTrxCode;
    @XmlElement(name = "InClientLogMntRecordingTrxDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inClientLogMntRecordingTrxDate;
    @XmlElement(name = "InClientLogMntRecordingTrxUnit")
    protected int inClientLogMntRecordingTrxUnit;
    @XmlElement(name = "InClientLogMntRecordingTrxUser")
    protected String inClientLogMntRecordingTrxUser;
    @XmlElement(name = "InCmdIefSuppliedCommand")
    protected String inCmdIefSuppliedCommand;
    @XmlElement(name = "InCommDepositAccountAccountNumber")
    protected double inCommDepositAccountAccountNumber;
    @XmlElement(name = "InCommDepositAccountCDigit")
    protected short inCommDepositAccountCDigit;
    @XmlElement(name = "InCorrespDepositAccountAccountNumber")
    protected double inCorrespDepositAccountAccountNumber;
    @XmlElement(name = "InCorrespDepositAccountCDigit")
    protected short inCorrespDepositAccountCDigit;
    @XmlElement(name = "InCustomerCustId")
    protected int inCustomerCustId;
    @XmlElement(name = "InDefaultTrbondBondCode")
    protected String inDefaultTrbondBondCode;
    @XmlElement(name = "InDummyJustificIdJustific")
    protected int inDummyJustificIdJustific;
    @XmlElement(name = "InDummyProductIdProduct")
    protected int inDummyProductIdProduct;
    @XmlElement(name = "InFaceValueCurrencyIdCurrency")
    protected int inFaceValueCurrencyIdCurrency;
    @XmlElement(name = "InFilterTrbondBondDescGr")
    protected String inFilterTrbondBondDescGr;
    @XmlElement(name = "InFilterTrbondBondIsin")
    protected String inFilterTrbondBondIsin;
    @XmlElement(name = "InFinscGenericDetailSerialNum")
    protected int inFinscGenericDetailSerialNum;
    @XmlElement(name = "InGroupGenericDetailSerialNum")
    protected int inGroupGenericDetailSerialNum;
    @XmlElement(name = "InLiquitLnsCommissionDescription")
    protected String inLiquitLnsCommissionDescription;
    @XmlElement(name = "InLiquitLnsCommissionIdCommission")
    protected int inLiquitLnsCommissionIdCommission;
    @XmlElement(name = "InParticDepositAccountAccountNumber")
    protected double inParticDepositAccountAccountNumber;
    @XmlElement(name = "InParticDepositAccountCDigit")
    protected short inParticDepositAccountCDigit;
    @XmlElement(name = "InParticLnsCommissionDescription")
    protected String inParticLnsCommissionDescription;
    @XmlElement(name = "InParticLnsCommissionIdCommission")
    protected int inParticLnsCommissionIdCommission;
    @XmlElement(name = "InPrftTransactionIdTransact")
    protected int inPrftTransactionIdTransact;
    @XmlElement(name = "InSecuritiesProductIdProduct")
    protected int inSecuritiesProductIdProduct;
    @XmlElement(name = "InSecuritiesTypeTypeId")
    protected short inSecuritiesTypeTypeId;
    @XmlElement(name = "InSubcategGenericDetailSerialNum")
    protected int inSubcategGenericDetailSerialNum;
    @XmlElement(name = "InTrbondBondAddress1")
    protected String inTrbondBondAddress1;
    @XmlElement(name = "InTrbondBondAddress2")
    protected String inTrbondBondAddress2;
    @XmlElement(name = "InTrbondBondCity")
    protected String inTrbondBondCity;
    @XmlElement(name = "InTrbondBondCode")
    protected String inTrbondBondCode;
    @XmlElement(name = "InTrbondBondCompany")
    protected String inTrbondBondCompany;
    @XmlElement(name = "InTrbondBondCountry")
    protected String inTrbondBondCountry;
    @XmlElement(name = "InTrbondBondCoupons")
    protected short inTrbondBondCoupons;
    @XmlElement(name = "InTrbondBondCurrCoupon")
    protected short inTrbondBondCurrCoupon;
    @XmlElement(name = "InTrbondBondDenomination", required = true)
    protected BigDecimal inTrbondBondDenomination;
    @XmlElement(name = "InTrbondBondDesc")
    protected String inTrbondBondDesc;
    @XmlElement(name = "InTrbondBondDescGr")
    protected String inTrbondBondDescGr;
    @XmlElement(name = "InTrbondBondDurationUnit")
    protected String inTrbondBondDurationUnit;
    @XmlElement(name = "InTrbondBondDurationVal")
    protected short inTrbondBondDurationVal;
    @XmlElement(name = "InTrbondBondFlagResident")
    protected String inTrbondBondFlagResident;
    @XmlElement(name = "InTrbondBondFmtEnd", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inTrbondBondFmtEnd;
    @XmlElement(name = "InTrbondBondFmtStart", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inTrbondBondFmtStart;
    @XmlElement(name = "InTrbondBondInterestFlag")
    protected String inTrbondBondInterestFlag;
    @XmlElement(name = "InTrbondBondInterestPctg", required = true)
    protected BigDecimal inTrbondBondInterestPctg;
    @XmlElement(name = "InTrbondBondIsin")
    protected String inTrbondBondIsin;
    @XmlElement(name = "InTrbondBondPhone")
    protected String inTrbondBondPhone;
    @XmlElement(name = "InTrbondBondRenewalFlag")
    protected String inTrbondBondRenewalFlag;
    @XmlElement(name = "InTrbondBondReutersCode")
    protected String inTrbondBondReutersCode;
    @XmlElement(name = "InTrbondBondTaxRegNo")
    protected String inTrbondBondTaxRegNo;
    @XmlElement(name = "InTrbondBondXaaCode")
    protected String inTrbondBondXaaCode;
    @XmlElement(name = "InTrbondBondZip")
    protected String inTrbondBondZip;
    @XmlElement(name = "InTrbondCustomerFlags")
    protected String inTrbondCustomerFlags;
    @XmlElement(name = "InTrbondDisposalAccCd")
    protected short inTrbondDisposalAccCd;
    @XmlElement(name = "InTrbondDisposalAccSn")
    protected int inTrbondDisposalAccSn;
    @XmlElement(name = "InTrbondDisposalAccType")
    protected short inTrbondDisposalAccType;
    @XmlElement(name = "InTrbondDisposalAccUnit")
    protected int inTrbondDisposalAccUnit;
    @XmlElement(name = "InTrbondDisposalAdminFlg")
    protected String inTrbondDisposalAdminFlg;
    @XmlElement(name = "InTrbondDistrEndDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inTrbondDistrEndDate;
    @XmlElement(name = "InTrbondDistrStartDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inTrbondDistrStartDate;
    @XmlElement(name = "InTrbondEndOfOrdersTime", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inTrbondEndOfOrdersTime;
    @XmlElement(name = "InTrbondEntryStatus")
    protected String inTrbondEntryStatus;
    @XmlElement(name = "InTrbondInitDistrValue", required = true)
    protected BigDecimal inTrbondInitDistrValue;
    @XmlElement(name = "InTrbondInitialBondCode")
    protected String inTrbondInitialBondCode;
    @XmlElement(name = "InTrbondIntCalcDaysbase")
    protected short inTrbondIntCalcDaysbase;
    @XmlElement(name = "InTrbondIntCalcDurDays")
    protected short inTrbondIntCalcDurDays;
    @XmlElement(name = "InTrbondLastTrxUnit")
    protected int inTrbondLastTrxUnit;
    @XmlElement(name = "InTrbondLastTrxUsr")
    protected String inTrbondLastTrxUsr;
    @XmlElement(name = "InTrbondMaxAcquisitionAmount", required = true)
    protected BigDecimal inTrbondMaxAcquisitionAmount;
    @XmlElement(name = "InTrbondMinTradingQty", required = true)
    protected BigDecimal inTrbondMinTradingQty;
    @XmlElement(name = "InTrbondNonTradeableBond")
    protected String inTrbondNonTradeableBond;
    @XmlElement(name = "InTrbondRegisterFlag")
    protected String inTrbondRegisterFlag;
    @XmlElement(name = "InTrbondRightsBond")
    protected String inTrbondRightsBond;
    @XmlElement(name = "InTrbondSecuritiesType")
    protected short inTrbondSecuritiesType;
    @XmlElement(name = "InTrbondShareType")
    protected String inTrbondShareType;
    @XmlElement(name = "InTrbondTaxPctgNonResid", required = true)
    protected BigDecimal inTrbondTaxPctgNonResid;
    @XmlElement(name = "InTrbondTaxPctgResident", required = true)
    protected BigDecimal inTrbondTaxPctgResident;
    @XmlElement(name = "InTrbondTmstamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inTrbondTmstamp;
    @XmlElement(name = "InTrbondTradingAccCd")
    protected short inTrbondTradingAccCd;
    @XmlElement(name = "InTrbondTradingAccSn")
    protected int inTrbondTradingAccSn;
    @XmlElement(name = "InTrbondTradingAccType")
    protected short inTrbondTradingAccType;
    @XmlElement(name = "InTrbondTradingAccUnit")
    protected int inTrbondTradingAccUnit;
    @XmlElement(name = "InTrnsfLnsCommissionDescription")
    protected String inTrnsfLnsCommissionDescription;
    @XmlElement(name = "InTrnsfLnsCommissionIdCommission")
    protected int inTrnsfLnsCommissionIdCommission;
    @XmlElement(name = "InUnblockJustificIdJustific")
    protected int inUnblockJustificIdJustific;

    /**
     * Gets the value of the profitsAccount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProfitsAccount() {
        return profitsAccount;
    }

    /**
     * Sets the value of the profitsAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProfitsAccount(String value) {
        this.profitsAccount = value;
    }

    /**
     * Gets the value of the inAisinOnlyIefSuppliedFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInAisinOnlyIefSuppliedFlag() {
        return inAisinOnlyIefSuppliedFlag;
    }

    /**
     * Sets the value of the inAisinOnlyIefSuppliedFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInAisinOnlyIefSuppliedFlag(String value) {
        this.inAisinOnlyIefSuppliedFlag = value;
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
     * Gets the value of the inBlockJustificIdJustific property.
     * 
     */
    public int getInBlockJustificIdJustific() {
        return inBlockJustificIdJustific;
    }

    /**
     * Sets the value of the inBlockJustificIdJustific property.
     * 
     */
    public void setInBlockJustificIdJustific(int value) {
        this.inBlockJustificIdJustific = value;
    }

    /**
     * Gets the value of the inBondCurrencyIdCurrency property.
     * 
     */
    public int getInBondCurrencyIdCurrency() {
        return inBondCurrencyIdCurrency;
    }

    /**
     * Sets the value of the inBondCurrencyIdCurrency property.
     * 
     */
    public void setInBondCurrencyIdCurrency(int value) {
        this.inBondCurrencyIdCurrency = value;
    }

    /**
     * Gets the value of the inBondMaturityJustificIdJustific property.
     * 
     */
    public int getInBondMaturityJustificIdJustific() {
        return inBondMaturityJustificIdJustific;
    }

    /**
     * Sets the value of the inBondMaturityJustificIdJustific property.
     * 
     */
    public void setInBondMaturityJustificIdJustific(int value) {
        this.inBondMaturityJustificIdJustific = value;
    }

    /**
     * Gets the value of the inBondStatusFlagIefSuppliedFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInBondStatusFlagIefSuppliedFlag() {
        return inBondStatusFlagIefSuppliedFlag;
    }

    /**
     * Sets the value of the inBondStatusFlagIefSuppliedFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInBondStatusFlagIefSuppliedFlag(String value) {
        this.inBondStatusFlagIefSuppliedFlag = value;
    }

    /**
     * Gets the value of the inCategGenericDetailSerialNum property.
     * 
     */
    public int getInCategGenericDetailSerialNum() {
        return inCategGenericDetailSerialNum;
    }

    /**
     * Sets the value of the inCategGenericDetailSerialNum property.
     * 
     */
    public void setInCategGenericDetailSerialNum(int value) {
        this.inCategGenericDetailSerialNum = value;
    }

    /**
     * Gets the value of the inClientLogMntRecordingAuthorizer1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInClientLogMntRecordingAuthorizer1() {
        return inClientLogMntRecordingAuthorizer1;
    }

    /**
     * Sets the value of the inClientLogMntRecordingAuthorizer1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInClientLogMntRecordingAuthorizer1(String value) {
        this.inClientLogMntRecordingAuthorizer1 = value;
    }

    /**
     * Gets the value of the inClientLogMntRecordingAuthorizer2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInClientLogMntRecordingAuthorizer2() {
        return inClientLogMntRecordingAuthorizer2;
    }

    /**
     * Sets the value of the inClientLogMntRecordingAuthorizer2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInClientLogMntRecordingAuthorizer2(String value) {
        this.inClientLogMntRecordingAuthorizer2 = value;
    }

    /**
     * Gets the value of the inClientLogMntRecordingChannelId property.
     * 
     */
    public int getInClientLogMntRecordingChannelId() {
        return inClientLogMntRecordingChannelId;
    }

    /**
     * Sets the value of the inClientLogMntRecordingChannelId property.
     * 
     */
    public void setInClientLogMntRecordingChannelId(int value) {
        this.inClientLogMntRecordingChannelId = value;
    }

    /**
     * Gets the value of the inClientLogMntRecordingPrftSystem property.
     * 
     */
    public short getInClientLogMntRecordingPrftSystem() {
        return inClientLogMntRecordingPrftSystem;
    }

    /**
     * Sets the value of the inClientLogMntRecordingPrftSystem property.
     * 
     */
    public void setInClientLogMntRecordingPrftSystem(short value) {
        this.inClientLogMntRecordingPrftSystem = value;
    }

    /**
     * Gets the value of the inClientLogMntRecordingReversalFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInClientLogMntRecordingReversalFlag() {
        return inClientLogMntRecordingReversalFlag;
    }

    /**
     * Sets the value of the inClientLogMntRecordingReversalFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInClientLogMntRecordingReversalFlag(String value) {
        this.inClientLogMntRecordingReversalFlag = value;
    }

    /**
     * Gets the value of the inClientLogMntRecordingTerminalNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInClientLogMntRecordingTerminalNumber() {
        return inClientLogMntRecordingTerminalNumber;
    }

    /**
     * Sets the value of the inClientLogMntRecordingTerminalNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInClientLogMntRecordingTerminalNumber(String value) {
        this.inClientLogMntRecordingTerminalNumber = value;
    }

    /**
     * Gets the value of the inClientLogMntRecordingTrxCode property.
     * 
     */
    public int getInClientLogMntRecordingTrxCode() {
        return inClientLogMntRecordingTrxCode;
    }

    /**
     * Sets the value of the inClientLogMntRecordingTrxCode property.
     * 
     */
    public void setInClientLogMntRecordingTrxCode(int value) {
        this.inClientLogMntRecordingTrxCode = value;
    }

    /**
     * Gets the value of the inClientLogMntRecordingTrxDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInClientLogMntRecordingTrxDate() {
        return inClientLogMntRecordingTrxDate;
    }

    /**
     * Sets the value of the inClientLogMntRecordingTrxDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInClientLogMntRecordingTrxDate(XMLGregorianCalendar value) {
        this.inClientLogMntRecordingTrxDate = value;
    }

    /**
     * Gets the value of the inClientLogMntRecordingTrxUnit property.
     * 
     */
    public int getInClientLogMntRecordingTrxUnit() {
        return inClientLogMntRecordingTrxUnit;
    }

    /**
     * Sets the value of the inClientLogMntRecordingTrxUnit property.
     * 
     */
    public void setInClientLogMntRecordingTrxUnit(int value) {
        this.inClientLogMntRecordingTrxUnit = value;
    }

    /**
     * Gets the value of the inClientLogMntRecordingTrxUser property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInClientLogMntRecordingTrxUser() {
        return inClientLogMntRecordingTrxUser;
    }

    /**
     * Sets the value of the inClientLogMntRecordingTrxUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInClientLogMntRecordingTrxUser(String value) {
        this.inClientLogMntRecordingTrxUser = value;
    }

    /**
     * Gets the value of the inCmdIefSuppliedCommand property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCmdIefSuppliedCommand() {
        return inCmdIefSuppliedCommand;
    }

    /**
     * Sets the value of the inCmdIefSuppliedCommand property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCmdIefSuppliedCommand(String value) {
        this.inCmdIefSuppliedCommand = value;
    }

    /**
     * Gets the value of the inCommDepositAccountAccountNumber property.
     * 
     */
    public double getInCommDepositAccountAccountNumber() {
        return inCommDepositAccountAccountNumber;
    }

    /**
     * Sets the value of the inCommDepositAccountAccountNumber property.
     * 
     */
    public void setInCommDepositAccountAccountNumber(double value) {
        this.inCommDepositAccountAccountNumber = value;
    }

    /**
     * Gets the value of the inCommDepositAccountCDigit property.
     * 
     */
    public short getInCommDepositAccountCDigit() {
        return inCommDepositAccountCDigit;
    }

    /**
     * Sets the value of the inCommDepositAccountCDigit property.
     * 
     */
    public void setInCommDepositAccountCDigit(short value) {
        this.inCommDepositAccountCDigit = value;
    }

    /**
     * Gets the value of the inCorrespDepositAccountAccountNumber property.
     * 
     */
    public double getInCorrespDepositAccountAccountNumber() {
        return inCorrespDepositAccountAccountNumber;
    }

    /**
     * Sets the value of the inCorrespDepositAccountAccountNumber property.
     * 
     */
    public void setInCorrespDepositAccountAccountNumber(double value) {
        this.inCorrespDepositAccountAccountNumber = value;
    }

    /**
     * Gets the value of the inCorrespDepositAccountCDigit property.
     * 
     */
    public short getInCorrespDepositAccountCDigit() {
        return inCorrespDepositAccountCDigit;
    }

    /**
     * Sets the value of the inCorrespDepositAccountCDigit property.
     * 
     */
    public void setInCorrespDepositAccountCDigit(short value) {
        this.inCorrespDepositAccountCDigit = value;
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
     * Gets the value of the inDefaultTrbondBondCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInDefaultTrbondBondCode() {
        return inDefaultTrbondBondCode;
    }

    /**
     * Sets the value of the inDefaultTrbondBondCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInDefaultTrbondBondCode(String value) {
        this.inDefaultTrbondBondCode = value;
    }

    /**
     * Gets the value of the inDummyJustificIdJustific property.
     * 
     */
    public int getInDummyJustificIdJustific() {
        return inDummyJustificIdJustific;
    }

    /**
     * Sets the value of the inDummyJustificIdJustific property.
     * 
     */
    public void setInDummyJustificIdJustific(int value) {
        this.inDummyJustificIdJustific = value;
    }

    /**
     * Gets the value of the inDummyProductIdProduct property.
     * 
     */
    public int getInDummyProductIdProduct() {
        return inDummyProductIdProduct;
    }

    /**
     * Sets the value of the inDummyProductIdProduct property.
     * 
     */
    public void setInDummyProductIdProduct(int value) {
        this.inDummyProductIdProduct = value;
    }

    /**
     * Gets the value of the inFaceValueCurrencyIdCurrency property.
     * 
     */
    public int getInFaceValueCurrencyIdCurrency() {
        return inFaceValueCurrencyIdCurrency;
    }

    /**
     * Sets the value of the inFaceValueCurrencyIdCurrency property.
     * 
     */
    public void setInFaceValueCurrencyIdCurrency(int value) {
        this.inFaceValueCurrencyIdCurrency = value;
    }

    /**
     * Gets the value of the inFilterTrbondBondDescGr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInFilterTrbondBondDescGr() {
        return inFilterTrbondBondDescGr;
    }

    /**
     * Sets the value of the inFilterTrbondBondDescGr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInFilterTrbondBondDescGr(String value) {
        this.inFilterTrbondBondDescGr = value;
    }

    /**
     * Gets the value of the inFilterTrbondBondIsin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInFilterTrbondBondIsin() {
        return inFilterTrbondBondIsin;
    }

    /**
     * Sets the value of the inFilterTrbondBondIsin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInFilterTrbondBondIsin(String value) {
        this.inFilterTrbondBondIsin = value;
    }

    /**
     * Gets the value of the inFinscGenericDetailSerialNum property.
     * 
     */
    public int getInFinscGenericDetailSerialNum() {
        return inFinscGenericDetailSerialNum;
    }

    /**
     * Sets the value of the inFinscGenericDetailSerialNum property.
     * 
     */
    public void setInFinscGenericDetailSerialNum(int value) {
        this.inFinscGenericDetailSerialNum = value;
    }

    /**
     * Gets the value of the inGroupGenericDetailSerialNum property.
     * 
     */
    public int getInGroupGenericDetailSerialNum() {
        return inGroupGenericDetailSerialNum;
    }

    /**
     * Sets the value of the inGroupGenericDetailSerialNum property.
     * 
     */
    public void setInGroupGenericDetailSerialNum(int value) {
        this.inGroupGenericDetailSerialNum = value;
    }

    /**
     * Gets the value of the inLiquitLnsCommissionDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInLiquitLnsCommissionDescription() {
        return inLiquitLnsCommissionDescription;
    }

    /**
     * Sets the value of the inLiquitLnsCommissionDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInLiquitLnsCommissionDescription(String value) {
        this.inLiquitLnsCommissionDescription = value;
    }

    /**
     * Gets the value of the inLiquitLnsCommissionIdCommission property.
     * 
     */
    public int getInLiquitLnsCommissionIdCommission() {
        return inLiquitLnsCommissionIdCommission;
    }

    /**
     * Sets the value of the inLiquitLnsCommissionIdCommission property.
     * 
     */
    public void setInLiquitLnsCommissionIdCommission(int value) {
        this.inLiquitLnsCommissionIdCommission = value;
    }

    /**
     * Gets the value of the inParticDepositAccountAccountNumber property.
     * 
     */
    public double getInParticDepositAccountAccountNumber() {
        return inParticDepositAccountAccountNumber;
    }

    /**
     * Sets the value of the inParticDepositAccountAccountNumber property.
     * 
     */
    public void setInParticDepositAccountAccountNumber(double value) {
        this.inParticDepositAccountAccountNumber = value;
    }

    /**
     * Gets the value of the inParticDepositAccountCDigit property.
     * 
     */
    public short getInParticDepositAccountCDigit() {
        return inParticDepositAccountCDigit;
    }

    /**
     * Sets the value of the inParticDepositAccountCDigit property.
     * 
     */
    public void setInParticDepositAccountCDigit(short value) {
        this.inParticDepositAccountCDigit = value;
    }

    /**
     * Gets the value of the inParticLnsCommissionDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInParticLnsCommissionDescription() {
        return inParticLnsCommissionDescription;
    }

    /**
     * Sets the value of the inParticLnsCommissionDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInParticLnsCommissionDescription(String value) {
        this.inParticLnsCommissionDescription = value;
    }

    /**
     * Gets the value of the inParticLnsCommissionIdCommission property.
     * 
     */
    public int getInParticLnsCommissionIdCommission() {
        return inParticLnsCommissionIdCommission;
    }

    /**
     * Sets the value of the inParticLnsCommissionIdCommission property.
     * 
     */
    public void setInParticLnsCommissionIdCommission(int value) {
        this.inParticLnsCommissionIdCommission = value;
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
     * Gets the value of the inSecuritiesProductIdProduct property.
     * 
     */
    public int getInSecuritiesProductIdProduct() {
        return inSecuritiesProductIdProduct;
    }

    /**
     * Sets the value of the inSecuritiesProductIdProduct property.
     * 
     */
    public void setInSecuritiesProductIdProduct(int value) {
        this.inSecuritiesProductIdProduct = value;
    }

    /**
     * Gets the value of the inSecuritiesTypeTypeId property.
     * 
     */
    public short getInSecuritiesTypeTypeId() {
        return inSecuritiesTypeTypeId;
    }

    /**
     * Sets the value of the inSecuritiesTypeTypeId property.
     * 
     */
    public void setInSecuritiesTypeTypeId(short value) {
        this.inSecuritiesTypeTypeId = value;
    }

    /**
     * Gets the value of the inSubcategGenericDetailSerialNum property.
     * 
     */
    public int getInSubcategGenericDetailSerialNum() {
        return inSubcategGenericDetailSerialNum;
    }

    /**
     * Sets the value of the inSubcategGenericDetailSerialNum property.
     * 
     */
    public void setInSubcategGenericDetailSerialNum(int value) {
        this.inSubcategGenericDetailSerialNum = value;
    }

    /**
     * Gets the value of the inTrbondBondAddress1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInTrbondBondAddress1() {
        return inTrbondBondAddress1;
    }

    /**
     * Sets the value of the inTrbondBondAddress1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInTrbondBondAddress1(String value) {
        this.inTrbondBondAddress1 = value;
    }

    /**
     * Gets the value of the inTrbondBondAddress2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInTrbondBondAddress2() {
        return inTrbondBondAddress2;
    }

    /**
     * Sets the value of the inTrbondBondAddress2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInTrbondBondAddress2(String value) {
        this.inTrbondBondAddress2 = value;
    }

    /**
     * Gets the value of the inTrbondBondCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInTrbondBondCity() {
        return inTrbondBondCity;
    }

    /**
     * Sets the value of the inTrbondBondCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInTrbondBondCity(String value) {
        this.inTrbondBondCity = value;
    }

    /**
     * Gets the value of the inTrbondBondCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInTrbondBondCode() {
        return inTrbondBondCode;
    }

    /**
     * Sets the value of the inTrbondBondCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInTrbondBondCode(String value) {
        this.inTrbondBondCode = value;
    }

    /**
     * Gets the value of the inTrbondBondCompany property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInTrbondBondCompany() {
        return inTrbondBondCompany;
    }

    /**
     * Sets the value of the inTrbondBondCompany property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInTrbondBondCompany(String value) {
        this.inTrbondBondCompany = value;
    }

    /**
     * Gets the value of the inTrbondBondCountry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInTrbondBondCountry() {
        return inTrbondBondCountry;
    }

    /**
     * Sets the value of the inTrbondBondCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInTrbondBondCountry(String value) {
        this.inTrbondBondCountry = value;
    }

    /**
     * Gets the value of the inTrbondBondCoupons property.
     * 
     */
    public short getInTrbondBondCoupons() {
        return inTrbondBondCoupons;
    }

    /**
     * Sets the value of the inTrbondBondCoupons property.
     * 
     */
    public void setInTrbondBondCoupons(short value) {
        this.inTrbondBondCoupons = value;
    }

    /**
     * Gets the value of the inTrbondBondCurrCoupon property.
     * 
     */
    public short getInTrbondBondCurrCoupon() {
        return inTrbondBondCurrCoupon;
    }

    /**
     * Sets the value of the inTrbondBondCurrCoupon property.
     * 
     */
    public void setInTrbondBondCurrCoupon(short value) {
        this.inTrbondBondCurrCoupon = value;
    }

    /**
     * Gets the value of the inTrbondBondDenomination property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInTrbondBondDenomination() {
        return inTrbondBondDenomination;
    }

    /**
     * Sets the value of the inTrbondBondDenomination property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInTrbondBondDenomination(BigDecimal value) {
        this.inTrbondBondDenomination = value;
    }

    /**
     * Gets the value of the inTrbondBondDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInTrbondBondDesc() {
        return inTrbondBondDesc;
    }

    /**
     * Sets the value of the inTrbondBondDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInTrbondBondDesc(String value) {
        this.inTrbondBondDesc = value;
    }

    /**
     * Gets the value of the inTrbondBondDescGr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInTrbondBondDescGr() {
        return inTrbondBondDescGr;
    }

    /**
     * Sets the value of the inTrbondBondDescGr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInTrbondBondDescGr(String value) {
        this.inTrbondBondDescGr = value;
    }

    /**
     * Gets the value of the inTrbondBondDurationUnit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInTrbondBondDurationUnit() {
        return inTrbondBondDurationUnit;
    }

    /**
     * Sets the value of the inTrbondBondDurationUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInTrbondBondDurationUnit(String value) {
        this.inTrbondBondDurationUnit = value;
    }

    /**
     * Gets the value of the inTrbondBondDurationVal property.
     * 
     */
    public short getInTrbondBondDurationVal() {
        return inTrbondBondDurationVal;
    }

    /**
     * Sets the value of the inTrbondBondDurationVal property.
     * 
     */
    public void setInTrbondBondDurationVal(short value) {
        this.inTrbondBondDurationVal = value;
    }

    /**
     * Gets the value of the inTrbondBondFlagResident property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInTrbondBondFlagResident() {
        return inTrbondBondFlagResident;
    }

    /**
     * Sets the value of the inTrbondBondFlagResident property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInTrbondBondFlagResident(String value) {
        this.inTrbondBondFlagResident = value;
    }

    /**
     * Gets the value of the inTrbondBondFmtEnd property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInTrbondBondFmtEnd() {
        return inTrbondBondFmtEnd;
    }

    /**
     * Sets the value of the inTrbondBondFmtEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInTrbondBondFmtEnd(XMLGregorianCalendar value) {
        this.inTrbondBondFmtEnd = value;
    }

    /**
     * Gets the value of the inTrbondBondFmtStart property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInTrbondBondFmtStart() {
        return inTrbondBondFmtStart;
    }

    /**
     * Sets the value of the inTrbondBondFmtStart property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInTrbondBondFmtStart(XMLGregorianCalendar value) {
        this.inTrbondBondFmtStart = value;
    }

    /**
     * Gets the value of the inTrbondBondInterestFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInTrbondBondInterestFlag() {
        return inTrbondBondInterestFlag;
    }

    /**
     * Sets the value of the inTrbondBondInterestFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInTrbondBondInterestFlag(String value) {
        this.inTrbondBondInterestFlag = value;
    }

    /**
     * Gets the value of the inTrbondBondInterestPctg property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInTrbondBondInterestPctg() {
        return inTrbondBondInterestPctg;
    }

    /**
     * Sets the value of the inTrbondBondInterestPctg property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInTrbondBondInterestPctg(BigDecimal value) {
        this.inTrbondBondInterestPctg = value;
    }

    /**
     * Gets the value of the inTrbondBondIsin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInTrbondBondIsin() {
        return inTrbondBondIsin;
    }

    /**
     * Sets the value of the inTrbondBondIsin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInTrbondBondIsin(String value) {
        this.inTrbondBondIsin = value;
    }

    /**
     * Gets the value of the inTrbondBondPhone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInTrbondBondPhone() {
        return inTrbondBondPhone;
    }

    /**
     * Sets the value of the inTrbondBondPhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInTrbondBondPhone(String value) {
        this.inTrbondBondPhone = value;
    }

    /**
     * Gets the value of the inTrbondBondRenewalFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInTrbondBondRenewalFlag() {
        return inTrbondBondRenewalFlag;
    }

    /**
     * Sets the value of the inTrbondBondRenewalFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInTrbondBondRenewalFlag(String value) {
        this.inTrbondBondRenewalFlag = value;
    }

    /**
     * Gets the value of the inTrbondBondReutersCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInTrbondBondReutersCode() {
        return inTrbondBondReutersCode;
    }

    /**
     * Sets the value of the inTrbondBondReutersCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInTrbondBondReutersCode(String value) {
        this.inTrbondBondReutersCode = value;
    }

    /**
     * Gets the value of the inTrbondBondTaxRegNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInTrbondBondTaxRegNo() {
        return inTrbondBondTaxRegNo;
    }

    /**
     * Sets the value of the inTrbondBondTaxRegNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInTrbondBondTaxRegNo(String value) {
        this.inTrbondBondTaxRegNo = value;
    }

    /**
     * Gets the value of the inTrbondBondXaaCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInTrbondBondXaaCode() {
        return inTrbondBondXaaCode;
    }

    /**
     * Sets the value of the inTrbondBondXaaCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInTrbondBondXaaCode(String value) {
        this.inTrbondBondXaaCode = value;
    }

    /**
     * Gets the value of the inTrbondBondZip property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInTrbondBondZip() {
        return inTrbondBondZip;
    }

    /**
     * Sets the value of the inTrbondBondZip property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInTrbondBondZip(String value) {
        this.inTrbondBondZip = value;
    }

    /**
     * Gets the value of the inTrbondCustomerFlags property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInTrbondCustomerFlags() {
        return inTrbondCustomerFlags;
    }

    /**
     * Sets the value of the inTrbondCustomerFlags property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInTrbondCustomerFlags(String value) {
        this.inTrbondCustomerFlags = value;
    }

    /**
     * Gets the value of the inTrbondDisposalAccCd property.
     * 
     */
    public short getInTrbondDisposalAccCd() {
        return inTrbondDisposalAccCd;
    }

    /**
     * Sets the value of the inTrbondDisposalAccCd property.
     * 
     */
    public void setInTrbondDisposalAccCd(short value) {
        this.inTrbondDisposalAccCd = value;
    }

    /**
     * Gets the value of the inTrbondDisposalAccSn property.
     * 
     */
    public int getInTrbondDisposalAccSn() {
        return inTrbondDisposalAccSn;
    }

    /**
     * Sets the value of the inTrbondDisposalAccSn property.
     * 
     */
    public void setInTrbondDisposalAccSn(int value) {
        this.inTrbondDisposalAccSn = value;
    }

    /**
     * Gets the value of the inTrbondDisposalAccType property.
     * 
     */
    public short getInTrbondDisposalAccType() {
        return inTrbondDisposalAccType;
    }

    /**
     * Sets the value of the inTrbondDisposalAccType property.
     * 
     */
    public void setInTrbondDisposalAccType(short value) {
        this.inTrbondDisposalAccType = value;
    }

    /**
     * Gets the value of the inTrbondDisposalAccUnit property.
     * 
     */
    public int getInTrbondDisposalAccUnit() {
        return inTrbondDisposalAccUnit;
    }

    /**
     * Sets the value of the inTrbondDisposalAccUnit property.
     * 
     */
    public void setInTrbondDisposalAccUnit(int value) {
        this.inTrbondDisposalAccUnit = value;
    }

    /**
     * Gets the value of the inTrbondDisposalAdminFlg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInTrbondDisposalAdminFlg() {
        return inTrbondDisposalAdminFlg;
    }

    /**
     * Sets the value of the inTrbondDisposalAdminFlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInTrbondDisposalAdminFlg(String value) {
        this.inTrbondDisposalAdminFlg = value;
    }

    /**
     * Gets the value of the inTrbondDistrEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInTrbondDistrEndDate() {
        return inTrbondDistrEndDate;
    }

    /**
     * Sets the value of the inTrbondDistrEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInTrbondDistrEndDate(XMLGregorianCalendar value) {
        this.inTrbondDistrEndDate = value;
    }

    /**
     * Gets the value of the inTrbondDistrStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInTrbondDistrStartDate() {
        return inTrbondDistrStartDate;
    }

    /**
     * Sets the value of the inTrbondDistrStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInTrbondDistrStartDate(XMLGregorianCalendar value) {
        this.inTrbondDistrStartDate = value;
    }

    /**
     * Gets the value of the inTrbondEndOfOrdersTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInTrbondEndOfOrdersTime() {
        return inTrbondEndOfOrdersTime;
    }

    /**
     * Sets the value of the inTrbondEndOfOrdersTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInTrbondEndOfOrdersTime(XMLGregorianCalendar value) {
        this.inTrbondEndOfOrdersTime = value;
    }

    /**
     * Gets the value of the inTrbondEntryStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInTrbondEntryStatus() {
        return inTrbondEntryStatus;
    }

    /**
     * Sets the value of the inTrbondEntryStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInTrbondEntryStatus(String value) {
        this.inTrbondEntryStatus = value;
    }

    /**
     * Gets the value of the inTrbondInitDistrValue property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInTrbondInitDistrValue() {
        return inTrbondInitDistrValue;
    }

    /**
     * Sets the value of the inTrbondInitDistrValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInTrbondInitDistrValue(BigDecimal value) {
        this.inTrbondInitDistrValue = value;
    }

    /**
     * Gets the value of the inTrbondInitialBondCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInTrbondInitialBondCode() {
        return inTrbondInitialBondCode;
    }

    /**
     * Sets the value of the inTrbondInitialBondCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInTrbondInitialBondCode(String value) {
        this.inTrbondInitialBondCode = value;
    }

    /**
     * Gets the value of the inTrbondIntCalcDaysbase property.
     * 
     */
    public short getInTrbondIntCalcDaysbase() {
        return inTrbondIntCalcDaysbase;
    }

    /**
     * Sets the value of the inTrbondIntCalcDaysbase property.
     * 
     */
    public void setInTrbondIntCalcDaysbase(short value) {
        this.inTrbondIntCalcDaysbase = value;
    }

    /**
     * Gets the value of the inTrbondIntCalcDurDays property.
     * 
     */
    public short getInTrbondIntCalcDurDays() {
        return inTrbondIntCalcDurDays;
    }

    /**
     * Sets the value of the inTrbondIntCalcDurDays property.
     * 
     */
    public void setInTrbondIntCalcDurDays(short value) {
        this.inTrbondIntCalcDurDays = value;
    }

    /**
     * Gets the value of the inTrbondLastTrxUnit property.
     * 
     */
    public int getInTrbondLastTrxUnit() {
        return inTrbondLastTrxUnit;
    }

    /**
     * Sets the value of the inTrbondLastTrxUnit property.
     * 
     */
    public void setInTrbondLastTrxUnit(int value) {
        this.inTrbondLastTrxUnit = value;
    }

    /**
     * Gets the value of the inTrbondLastTrxUsr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInTrbondLastTrxUsr() {
        return inTrbondLastTrxUsr;
    }

    /**
     * Sets the value of the inTrbondLastTrxUsr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInTrbondLastTrxUsr(String value) {
        this.inTrbondLastTrxUsr = value;
    }

    /**
     * Gets the value of the inTrbondMaxAcquisitionAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInTrbondMaxAcquisitionAmount() {
        return inTrbondMaxAcquisitionAmount;
    }

    /**
     * Sets the value of the inTrbondMaxAcquisitionAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInTrbondMaxAcquisitionAmount(BigDecimal value) {
        this.inTrbondMaxAcquisitionAmount = value;
    }

    /**
     * Gets the value of the inTrbondMinTradingQty property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInTrbondMinTradingQty() {
        return inTrbondMinTradingQty;
    }

    /**
     * Sets the value of the inTrbondMinTradingQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInTrbondMinTradingQty(BigDecimal value) {
        this.inTrbondMinTradingQty = value;
    }

    /**
     * Gets the value of the inTrbondNonTradeableBond property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInTrbondNonTradeableBond() {
        return inTrbondNonTradeableBond;
    }

    /**
     * Sets the value of the inTrbondNonTradeableBond property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInTrbondNonTradeableBond(String value) {
        this.inTrbondNonTradeableBond = value;
    }

    /**
     * Gets the value of the inTrbondRegisterFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInTrbondRegisterFlag() {
        return inTrbondRegisterFlag;
    }

    /**
     * Sets the value of the inTrbondRegisterFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInTrbondRegisterFlag(String value) {
        this.inTrbondRegisterFlag = value;
    }

    /**
     * Gets the value of the inTrbondRightsBond property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInTrbondRightsBond() {
        return inTrbondRightsBond;
    }

    /**
     * Sets the value of the inTrbondRightsBond property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInTrbondRightsBond(String value) {
        this.inTrbondRightsBond = value;
    }

    /**
     * Gets the value of the inTrbondSecuritiesType property.
     * 
     */
    public short getInTrbondSecuritiesType() {
        return inTrbondSecuritiesType;
    }

    /**
     * Sets the value of the inTrbondSecuritiesType property.
     * 
     */
    public void setInTrbondSecuritiesType(short value) {
        this.inTrbondSecuritiesType = value;
    }

    /**
     * Gets the value of the inTrbondShareType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInTrbondShareType() {
        return inTrbondShareType;
    }

    /**
     * Sets the value of the inTrbondShareType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInTrbondShareType(String value) {
        this.inTrbondShareType = value;
    }

    /**
     * Gets the value of the inTrbondTaxPctgNonResid property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInTrbondTaxPctgNonResid() {
        return inTrbondTaxPctgNonResid;
    }

    /**
     * Sets the value of the inTrbondTaxPctgNonResid property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInTrbondTaxPctgNonResid(BigDecimal value) {
        this.inTrbondTaxPctgNonResid = value;
    }

    /**
     * Gets the value of the inTrbondTaxPctgResident property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInTrbondTaxPctgResident() {
        return inTrbondTaxPctgResident;
    }

    /**
     * Sets the value of the inTrbondTaxPctgResident property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInTrbondTaxPctgResident(BigDecimal value) {
        this.inTrbondTaxPctgResident = value;
    }

    /**
     * Gets the value of the inTrbondTmstamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInTrbondTmstamp() {
        return inTrbondTmstamp;
    }

    /**
     * Sets the value of the inTrbondTmstamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInTrbondTmstamp(XMLGregorianCalendar value) {
        this.inTrbondTmstamp = value;
    }

    /**
     * Gets the value of the inTrbondTradingAccCd property.
     * 
     */
    public short getInTrbondTradingAccCd() {
        return inTrbondTradingAccCd;
    }

    /**
     * Sets the value of the inTrbondTradingAccCd property.
     * 
     */
    public void setInTrbondTradingAccCd(short value) {
        this.inTrbondTradingAccCd = value;
    }

    /**
     * Gets the value of the inTrbondTradingAccSn property.
     * 
     */
    public int getInTrbondTradingAccSn() {
        return inTrbondTradingAccSn;
    }

    /**
     * Sets the value of the inTrbondTradingAccSn property.
     * 
     */
    public void setInTrbondTradingAccSn(int value) {
        this.inTrbondTradingAccSn = value;
    }

    /**
     * Gets the value of the inTrbondTradingAccType property.
     * 
     */
    public short getInTrbondTradingAccType() {
        return inTrbondTradingAccType;
    }

    /**
     * Sets the value of the inTrbondTradingAccType property.
     * 
     */
    public void setInTrbondTradingAccType(short value) {
        this.inTrbondTradingAccType = value;
    }

    /**
     * Gets the value of the inTrbondTradingAccUnit property.
     * 
     */
    public int getInTrbondTradingAccUnit() {
        return inTrbondTradingAccUnit;
    }

    /**
     * Sets the value of the inTrbondTradingAccUnit property.
     * 
     */
    public void setInTrbondTradingAccUnit(int value) {
        this.inTrbondTradingAccUnit = value;
    }

    /**
     * Gets the value of the inTrnsfLnsCommissionDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInTrnsfLnsCommissionDescription() {
        return inTrnsfLnsCommissionDescription;
    }

    /**
     * Sets the value of the inTrnsfLnsCommissionDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInTrnsfLnsCommissionDescription(String value) {
        this.inTrnsfLnsCommissionDescription = value;
    }

    /**
     * Gets the value of the inTrnsfLnsCommissionIdCommission property.
     * 
     */
    public int getInTrnsfLnsCommissionIdCommission() {
        return inTrnsfLnsCommissionIdCommission;
    }

    /**
     * Sets the value of the inTrnsfLnsCommissionIdCommission property.
     * 
     */
    public void setInTrnsfLnsCommissionIdCommission(int value) {
        this.inTrnsfLnsCommissionIdCommission = value;
    }

    /**
     * Gets the value of the inUnblockJustificIdJustific property.
     * 
     */
    public int getInUnblockJustificIdJustific() {
        return inUnblockJustificIdJustific;
    }

    /**
     * Sets the value of the inUnblockJustificIdJustific property.
     * 
     */
    public void setInUnblockJustificIdJustific(int value) {
        this.inUnblockJustificIdJustific = value;
    }

}
