
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for CollateralFinancialForAgreementAccountImport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CollateralFinancialForAgreementAccountImport">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}BaseImport">
 *       &lt;sequence>
 *         &lt;element name="InGrp" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}ArrayOfInGrp" minOccurs="0"/>
 *         &lt;element name="InTrxJustificDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InTrxJustificIdJustific" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InTrxPrftTransactionIdTransact" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InTrxSsSecurityCmcbPrftSystem" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InTrxTerminalTerminalNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="In2090ActionIefSuppliedFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="In2090ProductIdProduct" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InAccountCollateralAccountCollateralAccountCd" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InAccountCollateralAccountCollateralAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InAccountCollateralAccountCollateralAfmNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InAccountCollateralAccountCollateralBankCode" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InAccountCollateralAccountCollateralCbInsuranceAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InAccountCollateralAccountCollateralDepAccInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InAccountCollateralAccountCollateralEntryStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InAccountCollateralAccountCollateralEstInsuranceAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InAccountCollateralAccountCollateralEstValueAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InAccountCollateralAccountCollateralExpiryDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InAccountCollateralAccountCollateralFirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InAccountCollateralAccountCollateralInsertionDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InAccountCollateralAccountCollateralInternalSn" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InAccountCollateralAccountCollateralIssuerAccount" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="InAccountCollateralAccountCollateralItemsCnt" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InAccountCollateralAccountCollateralNoteStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InAccountCollateralAccountCollateralPrftAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InAccountCollateralAccountCollateralProfitsSystem" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InAccountCollateralAccountCollateralReferenceNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InAccountCollateralAccountCollateralRevalCurrFixRat" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InAccountCollateralAccountCollateralRevalInitFixRat" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InAccountCollateralAccountCollateralRevalInitSv" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InAccountCollateralAccountCollateralRevaluationCurrid" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InAccountCollateralAccountCollateralSurname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InAccountCollateralAccountCollateralTmstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InAccountCollateralAccountCollateralUnitCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InAccountCollateralAccountCollateralUserCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InAccountCollateralAccountCollateralYieldLimitAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InAccountCollateralAccountCollateralYieldPerc" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InAccountCollateralAccountCollateralYieldUtilisedAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InAppraiserBankemployeeId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InAuthGrantedIefSuppliedFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCbAssurIefSuppliedFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCollateralBaselIiAcpt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCollateralCbInsuranceAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InCollateralColEstInsuranceAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InCollateralColEstValueAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InCollateralCollateralCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCollateralCollateralDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCollateralCollateralSn" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="InCollateralCollateralStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCollateralEstimationDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InCollateralItemsCnt" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InCollateralRevalCurrFixRat" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InCollateralRevalInitFixRat" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InCollateralRevalInitSv" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InCollateralRevaluationCurrid" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InCollateralReviseDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InCollateralTmstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InCollateralUserCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCollateralYieldLimitAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InCollateralYieldPerc" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InCollateralYieldUtilisedAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InCollateralRevalChrgAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InCollateralProductIdProduct" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InCollateralTypeBaselIiAcpt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCollateralTypeCbAssurCalcInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCollateralTypeProductDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCollateralTypeProductIdProduct" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InCollUnitCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InCurrencyIdCurrency" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InCurrencyNationalFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCurrencyShortDescr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCustomerCustId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InCustomerCustStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InFinalizeFlgIefSuppliedFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InGrpLength" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InIefSuppliedCommand" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InKeyCollateralCollateralSn" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="InLandRegistryGenericDetailDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InLandRegistryGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InMonitoringUnitCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InNewColltblCollateralTableInternalSn" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="InNewColltblCollateralTableRecordType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InNewColltblCustomerCDigit" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InNewColltblCustomerCustId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InNewCustomerCustId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InProfitsAccountAccStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InReversalIefSuppliedFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InTrxAuthResultTeamInformationSuper1Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InTrxAuthResultTeamInformationSuper2Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InAccountCollateralAccountCollateralMortgageAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InAccountCollateralAccountCollateralMortgageClass" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InAccountCollateralAccountCollateralMortgageDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CollateralFinancialForAgreementAccountImport", propOrder = {
    "inGrp",
    "inTrxJustificDescription",
    "inTrxJustificIdJustific",
    "inTrxPrftTransactionIdTransact",
    "inTrxSsSecurityCmcbPrftSystem",
    "inTrxTerminalTerminalNumber",
    "in2090ActionIefSuppliedFlag",
    "in2090ProductIdProduct",
    "inAccountCollateralAccountCollateralAccountCd",
    "inAccountCollateralAccountCollateralAddress",
    "inAccountCollateralAccountCollateralAfmNo",
    "inAccountCollateralAccountCollateralBankCode",
    "inAccountCollateralAccountCollateralCbInsuranceAmn",
    "inAccountCollateralAccountCollateralDepAccInd",
    "inAccountCollateralAccountCollateralEntryStatus",
    "inAccountCollateralAccountCollateralEstInsuranceAmn",
    "inAccountCollateralAccountCollateralEstValueAmn",
    "inAccountCollateralAccountCollateralExpiryDt",
    "inAccountCollateralAccountCollateralFirstName",
    "inAccountCollateralAccountCollateralInsertionDt",
    "inAccountCollateralAccountCollateralInternalSn",
    "inAccountCollateralAccountCollateralIssuerAccount",
    "inAccountCollateralAccountCollateralItemsCnt",
    "inAccountCollateralAccountCollateralNoteStatus",
    "inAccountCollateralAccountCollateralPrftAccount",
    "inAccountCollateralAccountCollateralProfitsSystem",
    "inAccountCollateralAccountCollateralReferenceNumber",
    "inAccountCollateralAccountCollateralRevalCurrFixRat",
    "inAccountCollateralAccountCollateralRevalInitFixRat",
    "inAccountCollateralAccountCollateralRevalInitSv",
    "inAccountCollateralAccountCollateralRevaluationCurrid",
    "inAccountCollateralAccountCollateralSurname",
    "inAccountCollateralAccountCollateralTmstamp",
    "inAccountCollateralAccountCollateralUnitCode",
    "inAccountCollateralAccountCollateralUserCode",
    "inAccountCollateralAccountCollateralYieldLimitAmn",
    "inAccountCollateralAccountCollateralYieldPerc",
    "inAccountCollateralAccountCollateralYieldUtilisedAmn",
    "inAppraiserBankemployeeId",
    "inAuthGrantedIefSuppliedFlag",
    "inCbAssurIefSuppliedFlag",
    "inCollateralBaselIiAcpt",
    "inCollateralCbInsuranceAmn",
    "inCollateralColEstInsuranceAmn",
    "inCollateralColEstValueAmn",
    "inCollateralCollateralCode",
    "inCollateralCollateralDesc",
    "inCollateralCollateralSn",
    "inCollateralCollateralStatus",
    "inCollateralEstimationDt",
    "inCollateralItemsCnt",
    "inCollateralRevalCurrFixRat",
    "inCollateralRevalInitFixRat",
    "inCollateralRevalInitSv",
    "inCollateralRevaluationCurrid",
    "inCollateralReviseDt",
    "inCollateralTmstamp",
    "inCollateralUserCode",
    "inCollateralYieldLimitAmn",
    "inCollateralYieldPerc",
    "inCollateralYieldUtilisedAmn",
    "inCollateralRevalChrgAmn",
    "inCollateralProductIdProduct",
    "inCollateralTypeBaselIiAcpt",
    "inCollateralTypeCbAssurCalcInd",
    "inCollateralTypeProductDescription",
    "inCollateralTypeProductIdProduct",
    "inCollUnitCode",
    "inCurrencyIdCurrency",
    "inCurrencyNationalFlag",
    "inCurrencyShortDescr",
    "inCustomerCustId",
    "inCustomerCustStatus",
    "inFinalizeFlgIefSuppliedFlag",
    "inGrpLength",
    "inIefSuppliedCommand",
    "inKeyCollateralCollateralSn",
    "inLandRegistryGenericDetailDescription",
    "inLandRegistryGenericDetailSerialNum",
    "inMonitoringUnitCode",
    "inNewColltblCollateralTableInternalSn",
    "inNewColltblCollateralTableRecordType",
    "inNewColltblCustomerCDigit",
    "inNewColltblCustomerCustId",
    "inNewCustomerCustId",
    "inProfitsAccountAccStatus",
    "inReversalIefSuppliedFlag",
    "inTrxAuthResultTeamInformationSuper1Code",
    "inTrxAuthResultTeamInformationSuper2Code",
    "inAccountCollateralAccountCollateralMortgageAmn",
    "inAccountCollateralAccountCollateralMortgageClass",
    "inAccountCollateralAccountCollateralMortgageDate"
})
public class CollateralFinancialForAgreementAccountImport
    extends BaseImport
{

    @XmlElement(name = "InGrp")
    protected ArrayOfInGrp inGrp;
    @XmlElement(name = "InTrxJustificDescription")
    protected String inTrxJustificDescription;
    @XmlElement(name = "InTrxJustificIdJustific")
    protected int inTrxJustificIdJustific;
    @XmlElement(name = "InTrxPrftTransactionIdTransact")
    protected int inTrxPrftTransactionIdTransact;
    @XmlElement(name = "InTrxSsSecurityCmcbPrftSystem")
    protected short inTrxSsSecurityCmcbPrftSystem;
    @XmlElement(name = "InTrxTerminalTerminalNumber")
    protected String inTrxTerminalTerminalNumber;
    @XmlElement(name = "In2090ActionIefSuppliedFlag")
    protected String in2090ActionIefSuppliedFlag;
    @XmlElement(name = "In2090ProductIdProduct")
    protected int in2090ProductIdProduct;
    @XmlElement(name = "InAccountCollateralAccountCollateralAccountCd")
    protected short inAccountCollateralAccountCollateralAccountCd;
    @XmlElement(name = "InAccountCollateralAccountCollateralAddress")
    protected String inAccountCollateralAccountCollateralAddress;
    @XmlElement(name = "InAccountCollateralAccountCollateralAfmNo")
    protected String inAccountCollateralAccountCollateralAfmNo;
    @XmlElement(name = "InAccountCollateralAccountCollateralBankCode")
    protected short inAccountCollateralAccountCollateralBankCode;
    @XmlElement(name = "InAccountCollateralAccountCollateralCbInsuranceAmn", required = true)
    protected BigDecimal inAccountCollateralAccountCollateralCbInsuranceAmn;
    @XmlElement(name = "InAccountCollateralAccountCollateralDepAccInd")
    protected String inAccountCollateralAccountCollateralDepAccInd;
    @XmlElement(name = "InAccountCollateralAccountCollateralEntryStatus")
    protected String inAccountCollateralAccountCollateralEntryStatus;
    @XmlElement(name = "InAccountCollateralAccountCollateralEstInsuranceAmn", required = true)
    protected BigDecimal inAccountCollateralAccountCollateralEstInsuranceAmn;
    @XmlElement(name = "InAccountCollateralAccountCollateralEstValueAmn", required = true)
    protected BigDecimal inAccountCollateralAccountCollateralEstValueAmn;
    @XmlElement(name = "InAccountCollateralAccountCollateralExpiryDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inAccountCollateralAccountCollateralExpiryDt;
    @XmlElement(name = "InAccountCollateralAccountCollateralFirstName")
    protected String inAccountCollateralAccountCollateralFirstName;
    @XmlElement(name = "InAccountCollateralAccountCollateralInsertionDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inAccountCollateralAccountCollateralInsertionDt;
    @XmlElement(name = "InAccountCollateralAccountCollateralInternalSn")
    protected short inAccountCollateralAccountCollateralInternalSn;
    @XmlElement(name = "InAccountCollateralAccountCollateralIssuerAccount")
    protected double inAccountCollateralAccountCollateralIssuerAccount;
    @XmlElement(name = "InAccountCollateralAccountCollateralItemsCnt")
    protected int inAccountCollateralAccountCollateralItemsCnt;
    @XmlElement(name = "InAccountCollateralAccountCollateralNoteStatus")
    protected String inAccountCollateralAccountCollateralNoteStatus;
    @XmlElement(name = "InAccountCollateralAccountCollateralPrftAccount")
    protected String inAccountCollateralAccountCollateralPrftAccount;
    @XmlElement(name = "InAccountCollateralAccountCollateralProfitsSystem")
    protected int inAccountCollateralAccountCollateralProfitsSystem;
    @XmlElement(name = "InAccountCollateralAccountCollateralReferenceNumber")
    protected String inAccountCollateralAccountCollateralReferenceNumber;
    @XmlElement(name = "InAccountCollateralAccountCollateralRevalCurrFixRat", required = true)
    protected BigDecimal inAccountCollateralAccountCollateralRevalCurrFixRat;
    @XmlElement(name = "InAccountCollateralAccountCollateralRevalInitFixRat", required = true)
    protected BigDecimal inAccountCollateralAccountCollateralRevalInitFixRat;
    @XmlElement(name = "InAccountCollateralAccountCollateralRevalInitSv", required = true)
    protected BigDecimal inAccountCollateralAccountCollateralRevalInitSv;
    @XmlElement(name = "InAccountCollateralAccountCollateralRevaluationCurrid")
    protected int inAccountCollateralAccountCollateralRevaluationCurrid;
    @XmlElement(name = "InAccountCollateralAccountCollateralSurname")
    protected String inAccountCollateralAccountCollateralSurname;
    @XmlElement(name = "InAccountCollateralAccountCollateralTmstamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inAccountCollateralAccountCollateralTmstamp;
    @XmlElement(name = "InAccountCollateralAccountCollateralUnitCode")
    protected int inAccountCollateralAccountCollateralUnitCode;
    @XmlElement(name = "InAccountCollateralAccountCollateralUserCode")
    protected String inAccountCollateralAccountCollateralUserCode;
    @XmlElement(name = "InAccountCollateralAccountCollateralYieldLimitAmn", required = true)
    protected BigDecimal inAccountCollateralAccountCollateralYieldLimitAmn;
    @XmlElement(name = "InAccountCollateralAccountCollateralYieldPerc", required = true)
    protected BigDecimal inAccountCollateralAccountCollateralYieldPerc;
    @XmlElement(name = "InAccountCollateralAccountCollateralYieldUtilisedAmn", required = true)
    protected BigDecimal inAccountCollateralAccountCollateralYieldUtilisedAmn;
    @XmlElement(name = "InAppraiserBankemployeeId")
    protected String inAppraiserBankemployeeId;
    @XmlElement(name = "InAuthGrantedIefSuppliedFlag")
    protected String inAuthGrantedIefSuppliedFlag;
    @XmlElement(name = "InCbAssurIefSuppliedFlag")
    protected String inCbAssurIefSuppliedFlag;
    @XmlElement(name = "InCollateralBaselIiAcpt")
    protected String inCollateralBaselIiAcpt;
    @XmlElement(name = "InCollateralCbInsuranceAmn", required = true)
    protected BigDecimal inCollateralCbInsuranceAmn;
    @XmlElement(name = "InCollateralColEstInsuranceAmn", required = true)
    protected BigDecimal inCollateralColEstInsuranceAmn;
    @XmlElement(name = "InCollateralColEstValueAmn", required = true)
    protected BigDecimal inCollateralColEstValueAmn;
    @XmlElement(name = "InCollateralCollateralCode")
    protected String inCollateralCollateralCode;
    @XmlElement(name = "InCollateralCollateralDesc")
    protected String inCollateralCollateralDesc;
    @XmlElement(name = "InCollateralCollateralSn")
    protected double inCollateralCollateralSn;
    @XmlElement(name = "InCollateralCollateralStatus")
    protected String inCollateralCollateralStatus;
    @XmlElement(name = "InCollateralEstimationDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inCollateralEstimationDt;
    @XmlElement(name = "InCollateralItemsCnt")
    protected int inCollateralItemsCnt;
    @XmlElement(name = "InCollateralRevalCurrFixRat", required = true)
    protected BigDecimal inCollateralRevalCurrFixRat;
    @XmlElement(name = "InCollateralRevalInitFixRat", required = true)
    protected BigDecimal inCollateralRevalInitFixRat;
    @XmlElement(name = "InCollateralRevalInitSv", required = true)
    protected BigDecimal inCollateralRevalInitSv;
    @XmlElement(name = "InCollateralRevaluationCurrid")
    protected int inCollateralRevaluationCurrid;
    @XmlElement(name = "InCollateralReviseDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inCollateralReviseDt;
    @XmlElement(name = "InCollateralTmstamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inCollateralTmstamp;
    @XmlElement(name = "InCollateralUserCode")
    protected String inCollateralUserCode;
    @XmlElement(name = "InCollateralYieldLimitAmn", required = true)
    protected BigDecimal inCollateralYieldLimitAmn;
    @XmlElement(name = "InCollateralYieldPerc", required = true)
    protected BigDecimal inCollateralYieldPerc;
    @XmlElement(name = "InCollateralYieldUtilisedAmn", required = true)
    protected BigDecimal inCollateralYieldUtilisedAmn;
    @XmlElement(name = "InCollateralRevalChrgAmn", required = true)
    protected BigDecimal inCollateralRevalChrgAmn;
    @XmlElement(name = "InCollateralProductIdProduct")
    protected int inCollateralProductIdProduct;
    @XmlElement(name = "InCollateralTypeBaselIiAcpt")
    protected String inCollateralTypeBaselIiAcpt;
    @XmlElement(name = "InCollateralTypeCbAssurCalcInd")
    protected String inCollateralTypeCbAssurCalcInd;
    @XmlElement(name = "InCollateralTypeProductDescription")
    protected String inCollateralTypeProductDescription;
    @XmlElement(name = "InCollateralTypeProductIdProduct")
    protected int inCollateralTypeProductIdProduct;
    @XmlElement(name = "InCollUnitCode")
    protected int inCollUnitCode;
    @XmlElement(name = "InCurrencyIdCurrency")
    protected int inCurrencyIdCurrency;
    @XmlElement(name = "InCurrencyNationalFlag")
    protected String inCurrencyNationalFlag;
    @XmlElement(name = "InCurrencyShortDescr")
    protected String inCurrencyShortDescr;
    @XmlElement(name = "InCustomerCustId")
    protected int inCustomerCustId;
    @XmlElement(name = "InCustomerCustStatus")
    protected String inCustomerCustStatus;
    @XmlElement(name = "InFinalizeFlgIefSuppliedFlag")
    protected String inFinalizeFlgIefSuppliedFlag;
    @XmlElement(name = "InGrpLength")
    protected int inGrpLength;
    @XmlElement(name = "InIefSuppliedCommand")
    protected String inIefSuppliedCommand;
    @XmlElement(name = "InKeyCollateralCollateralSn")
    protected double inKeyCollateralCollateralSn;
    @XmlElement(name = "InLandRegistryGenericDetailDescription")
    protected String inLandRegistryGenericDetailDescription;
    @XmlElement(name = "InLandRegistryGenericDetailSerialNum")
    protected int inLandRegistryGenericDetailSerialNum;
    @XmlElement(name = "InMonitoringUnitCode")
    protected int inMonitoringUnitCode;
    @XmlElement(name = "InNewColltblCollateralTableInternalSn")
    protected double inNewColltblCollateralTableInternalSn;
    @XmlElement(name = "InNewColltblCollateralTableRecordType")
    protected String inNewColltblCollateralTableRecordType;
    @XmlElement(name = "InNewColltblCustomerCDigit")
    protected short inNewColltblCustomerCDigit;
    @XmlElement(name = "InNewColltblCustomerCustId")
    protected int inNewColltblCustomerCustId;
    @XmlElement(name = "InNewCustomerCustId")
    protected int inNewCustomerCustId;
    @XmlElement(name = "InProfitsAccountAccStatus")
    protected String inProfitsAccountAccStatus;
    @XmlElement(name = "InReversalIefSuppliedFlag")
    protected String inReversalIefSuppliedFlag;
    @XmlElement(name = "InTrxAuthResultTeamInformationSuper1Code")
    protected String inTrxAuthResultTeamInformationSuper1Code;
    @XmlElement(name = "InTrxAuthResultTeamInformationSuper2Code")
    protected String inTrxAuthResultTeamInformationSuper2Code;
    @XmlElement(name = "InAccountCollateralAccountCollateralMortgageAmn", required = true)
    protected BigDecimal inAccountCollateralAccountCollateralMortgageAmn;
    @XmlElement(name = "InAccountCollateralAccountCollateralMortgageClass")
    protected String inAccountCollateralAccountCollateralMortgageClass;
    @XmlElement(name = "InAccountCollateralAccountCollateralMortgageDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inAccountCollateralAccountCollateralMortgageDate;

    /**
     * Gets the value of the inGrp property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfInGrp }
     *     
     */
    public ArrayOfInGrp getInGrp() {
        return inGrp;
    }

    /**
     * Sets the value of the inGrp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfInGrp }
     *     
     */
    public void setInGrp(ArrayOfInGrp value) {
        this.inGrp = value;
    }

    /**
     * Gets the value of the inTrxJustificDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInTrxJustificDescription() {
        return inTrxJustificDescription;
    }

    /**
     * Sets the value of the inTrxJustificDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInTrxJustificDescription(String value) {
        this.inTrxJustificDescription = value;
    }

    /**
     * Gets the value of the inTrxJustificIdJustific property.
     * 
     */
    public int getInTrxJustificIdJustific() {
        return inTrxJustificIdJustific;
    }

    /**
     * Sets the value of the inTrxJustificIdJustific property.
     * 
     */
    public void setInTrxJustificIdJustific(int value) {
        this.inTrxJustificIdJustific = value;
    }

    /**
     * Gets the value of the inTrxPrftTransactionIdTransact property.
     * 
     */
    public int getInTrxPrftTransactionIdTransact() {
        return inTrxPrftTransactionIdTransact;
    }

    /**
     * Sets the value of the inTrxPrftTransactionIdTransact property.
     * 
     */
    public void setInTrxPrftTransactionIdTransact(int value) {
        this.inTrxPrftTransactionIdTransact = value;
    }

    /**
     * Gets the value of the inTrxSsSecurityCmcbPrftSystem property.
     * 
     */
    public short getInTrxSsSecurityCmcbPrftSystem() {
        return inTrxSsSecurityCmcbPrftSystem;
    }

    /**
     * Sets the value of the inTrxSsSecurityCmcbPrftSystem property.
     * 
     */
    public void setInTrxSsSecurityCmcbPrftSystem(short value) {
        this.inTrxSsSecurityCmcbPrftSystem = value;
    }

    /**
     * Gets the value of the inTrxTerminalTerminalNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInTrxTerminalTerminalNumber() {
        return inTrxTerminalTerminalNumber;
    }

    /**
     * Sets the value of the inTrxTerminalTerminalNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInTrxTerminalTerminalNumber(String value) {
        this.inTrxTerminalTerminalNumber = value;
    }

    /**
     * Gets the value of the in2090ActionIefSuppliedFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIn2090ActionIefSuppliedFlag() {
        return in2090ActionIefSuppliedFlag;
    }

    /**
     * Sets the value of the in2090ActionIefSuppliedFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIn2090ActionIefSuppliedFlag(String value) {
        this.in2090ActionIefSuppliedFlag = value;
    }

    /**
     * Gets the value of the in2090ProductIdProduct property.
     * 
     */
    public int getIn2090ProductIdProduct() {
        return in2090ProductIdProduct;
    }

    /**
     * Sets the value of the in2090ProductIdProduct property.
     * 
     */
    public void setIn2090ProductIdProduct(int value) {
        this.in2090ProductIdProduct = value;
    }

    /**
     * Gets the value of the inAccountCollateralAccountCollateralAccountCd property.
     * 
     */
    public short getInAccountCollateralAccountCollateralAccountCd() {
        return inAccountCollateralAccountCollateralAccountCd;
    }

    /**
     * Sets the value of the inAccountCollateralAccountCollateralAccountCd property.
     * 
     */
    public void setInAccountCollateralAccountCollateralAccountCd(short value) {
        this.inAccountCollateralAccountCollateralAccountCd = value;
    }

    /**
     * Gets the value of the inAccountCollateralAccountCollateralAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInAccountCollateralAccountCollateralAddress() {
        return inAccountCollateralAccountCollateralAddress;
    }

    /**
     * Sets the value of the inAccountCollateralAccountCollateralAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInAccountCollateralAccountCollateralAddress(String value) {
        this.inAccountCollateralAccountCollateralAddress = value;
    }

    /**
     * Gets the value of the inAccountCollateralAccountCollateralAfmNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInAccountCollateralAccountCollateralAfmNo() {
        return inAccountCollateralAccountCollateralAfmNo;
    }

    /**
     * Sets the value of the inAccountCollateralAccountCollateralAfmNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInAccountCollateralAccountCollateralAfmNo(String value) {
        this.inAccountCollateralAccountCollateralAfmNo = value;
    }

    /**
     * Gets the value of the inAccountCollateralAccountCollateralBankCode property.
     * 
     */
    public short getInAccountCollateralAccountCollateralBankCode() {
        return inAccountCollateralAccountCollateralBankCode;
    }

    /**
     * Sets the value of the inAccountCollateralAccountCollateralBankCode property.
     * 
     */
    public void setInAccountCollateralAccountCollateralBankCode(short value) {
        this.inAccountCollateralAccountCollateralBankCode = value;
    }

    /**
     * Gets the value of the inAccountCollateralAccountCollateralCbInsuranceAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInAccountCollateralAccountCollateralCbInsuranceAmn() {
        return inAccountCollateralAccountCollateralCbInsuranceAmn;
    }

    /**
     * Sets the value of the inAccountCollateralAccountCollateralCbInsuranceAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInAccountCollateralAccountCollateralCbInsuranceAmn(BigDecimal value) {
        this.inAccountCollateralAccountCollateralCbInsuranceAmn = value;
    }

    /**
     * Gets the value of the inAccountCollateralAccountCollateralDepAccInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInAccountCollateralAccountCollateralDepAccInd() {
        return inAccountCollateralAccountCollateralDepAccInd;
    }

    /**
     * Sets the value of the inAccountCollateralAccountCollateralDepAccInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInAccountCollateralAccountCollateralDepAccInd(String value) {
        this.inAccountCollateralAccountCollateralDepAccInd = value;
    }

    /**
     * Gets the value of the inAccountCollateralAccountCollateralEntryStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInAccountCollateralAccountCollateralEntryStatus() {
        return inAccountCollateralAccountCollateralEntryStatus;
    }

    /**
     * Sets the value of the inAccountCollateralAccountCollateralEntryStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInAccountCollateralAccountCollateralEntryStatus(String value) {
        this.inAccountCollateralAccountCollateralEntryStatus = value;
    }

    /**
     * Gets the value of the inAccountCollateralAccountCollateralEstInsuranceAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInAccountCollateralAccountCollateralEstInsuranceAmn() {
        return inAccountCollateralAccountCollateralEstInsuranceAmn;
    }

    /**
     * Sets the value of the inAccountCollateralAccountCollateralEstInsuranceAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInAccountCollateralAccountCollateralEstInsuranceAmn(BigDecimal value) {
        this.inAccountCollateralAccountCollateralEstInsuranceAmn = value;
    }

    /**
     * Gets the value of the inAccountCollateralAccountCollateralEstValueAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInAccountCollateralAccountCollateralEstValueAmn() {
        return inAccountCollateralAccountCollateralEstValueAmn;
    }

    /**
     * Sets the value of the inAccountCollateralAccountCollateralEstValueAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInAccountCollateralAccountCollateralEstValueAmn(BigDecimal value) {
        this.inAccountCollateralAccountCollateralEstValueAmn = value;
    }

    /**
     * Gets the value of the inAccountCollateralAccountCollateralExpiryDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInAccountCollateralAccountCollateralExpiryDt() {
        return inAccountCollateralAccountCollateralExpiryDt;
    }

    /**
     * Sets the value of the inAccountCollateralAccountCollateralExpiryDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInAccountCollateralAccountCollateralExpiryDt(XMLGregorianCalendar value) {
        this.inAccountCollateralAccountCollateralExpiryDt = value;
    }

    /**
     * Gets the value of the inAccountCollateralAccountCollateralFirstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInAccountCollateralAccountCollateralFirstName() {
        return inAccountCollateralAccountCollateralFirstName;
    }

    /**
     * Sets the value of the inAccountCollateralAccountCollateralFirstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInAccountCollateralAccountCollateralFirstName(String value) {
        this.inAccountCollateralAccountCollateralFirstName = value;
    }

    /**
     * Gets the value of the inAccountCollateralAccountCollateralInsertionDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInAccountCollateralAccountCollateralInsertionDt() {
        return inAccountCollateralAccountCollateralInsertionDt;
    }

    /**
     * Sets the value of the inAccountCollateralAccountCollateralInsertionDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInAccountCollateralAccountCollateralInsertionDt(XMLGregorianCalendar value) {
        this.inAccountCollateralAccountCollateralInsertionDt = value;
    }

    /**
     * Gets the value of the inAccountCollateralAccountCollateralInternalSn property.
     * 
     */
    public short getInAccountCollateralAccountCollateralInternalSn() {
        return inAccountCollateralAccountCollateralInternalSn;
    }

    /**
     * Sets the value of the inAccountCollateralAccountCollateralInternalSn property.
     * 
     */
    public void setInAccountCollateralAccountCollateralInternalSn(short value) {
        this.inAccountCollateralAccountCollateralInternalSn = value;
    }

    /**
     * Gets the value of the inAccountCollateralAccountCollateralIssuerAccount property.
     * 
     */
    public double getInAccountCollateralAccountCollateralIssuerAccount() {
        return inAccountCollateralAccountCollateralIssuerAccount;
    }

    /**
     * Sets the value of the inAccountCollateralAccountCollateralIssuerAccount property.
     * 
     */
    public void setInAccountCollateralAccountCollateralIssuerAccount(double value) {
        this.inAccountCollateralAccountCollateralIssuerAccount = value;
    }

    /**
     * Gets the value of the inAccountCollateralAccountCollateralItemsCnt property.
     * 
     */
    public int getInAccountCollateralAccountCollateralItemsCnt() {
        return inAccountCollateralAccountCollateralItemsCnt;
    }

    /**
     * Sets the value of the inAccountCollateralAccountCollateralItemsCnt property.
     * 
     */
    public void setInAccountCollateralAccountCollateralItemsCnt(int value) {
        this.inAccountCollateralAccountCollateralItemsCnt = value;
    }

    /**
     * Gets the value of the inAccountCollateralAccountCollateralNoteStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInAccountCollateralAccountCollateralNoteStatus() {
        return inAccountCollateralAccountCollateralNoteStatus;
    }

    /**
     * Sets the value of the inAccountCollateralAccountCollateralNoteStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInAccountCollateralAccountCollateralNoteStatus(String value) {
        this.inAccountCollateralAccountCollateralNoteStatus = value;
    }

    /**
     * Gets the value of the inAccountCollateralAccountCollateralPrftAccount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInAccountCollateralAccountCollateralPrftAccount() {
        return inAccountCollateralAccountCollateralPrftAccount;
    }

    /**
     * Sets the value of the inAccountCollateralAccountCollateralPrftAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInAccountCollateralAccountCollateralPrftAccount(String value) {
        this.inAccountCollateralAccountCollateralPrftAccount = value;
    }

    /**
     * Gets the value of the inAccountCollateralAccountCollateralProfitsSystem property.
     * 
     */
    public int getInAccountCollateralAccountCollateralProfitsSystem() {
        return inAccountCollateralAccountCollateralProfitsSystem;
    }

    /**
     * Sets the value of the inAccountCollateralAccountCollateralProfitsSystem property.
     * 
     */
    public void setInAccountCollateralAccountCollateralProfitsSystem(int value) {
        this.inAccountCollateralAccountCollateralProfitsSystem = value;
    }

    /**
     * Gets the value of the inAccountCollateralAccountCollateralReferenceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInAccountCollateralAccountCollateralReferenceNumber() {
        return inAccountCollateralAccountCollateralReferenceNumber;
    }

    /**
     * Sets the value of the inAccountCollateralAccountCollateralReferenceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInAccountCollateralAccountCollateralReferenceNumber(String value) {
        this.inAccountCollateralAccountCollateralReferenceNumber = value;
    }

    /**
     * Gets the value of the inAccountCollateralAccountCollateralRevalCurrFixRat property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInAccountCollateralAccountCollateralRevalCurrFixRat() {
        return inAccountCollateralAccountCollateralRevalCurrFixRat;
    }

    /**
     * Sets the value of the inAccountCollateralAccountCollateralRevalCurrFixRat property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInAccountCollateralAccountCollateralRevalCurrFixRat(BigDecimal value) {
        this.inAccountCollateralAccountCollateralRevalCurrFixRat = value;
    }

    /**
     * Gets the value of the inAccountCollateralAccountCollateralRevalInitFixRat property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInAccountCollateralAccountCollateralRevalInitFixRat() {
        return inAccountCollateralAccountCollateralRevalInitFixRat;
    }

    /**
     * Sets the value of the inAccountCollateralAccountCollateralRevalInitFixRat property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInAccountCollateralAccountCollateralRevalInitFixRat(BigDecimal value) {
        this.inAccountCollateralAccountCollateralRevalInitFixRat = value;
    }

    /**
     * Gets the value of the inAccountCollateralAccountCollateralRevalInitSv property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInAccountCollateralAccountCollateralRevalInitSv() {
        return inAccountCollateralAccountCollateralRevalInitSv;
    }

    /**
     * Sets the value of the inAccountCollateralAccountCollateralRevalInitSv property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInAccountCollateralAccountCollateralRevalInitSv(BigDecimal value) {
        this.inAccountCollateralAccountCollateralRevalInitSv = value;
    }

    /**
     * Gets the value of the inAccountCollateralAccountCollateralRevaluationCurrid property.
     * 
     */
    public int getInAccountCollateralAccountCollateralRevaluationCurrid() {
        return inAccountCollateralAccountCollateralRevaluationCurrid;
    }

    /**
     * Sets the value of the inAccountCollateralAccountCollateralRevaluationCurrid property.
     * 
     */
    public void setInAccountCollateralAccountCollateralRevaluationCurrid(int value) {
        this.inAccountCollateralAccountCollateralRevaluationCurrid = value;
    }

    /**
     * Gets the value of the inAccountCollateralAccountCollateralSurname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInAccountCollateralAccountCollateralSurname() {
        return inAccountCollateralAccountCollateralSurname;
    }

    /**
     * Sets the value of the inAccountCollateralAccountCollateralSurname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInAccountCollateralAccountCollateralSurname(String value) {
        this.inAccountCollateralAccountCollateralSurname = value;
    }

    /**
     * Gets the value of the inAccountCollateralAccountCollateralTmstamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInAccountCollateralAccountCollateralTmstamp() {
        return inAccountCollateralAccountCollateralTmstamp;
    }

    /**
     * Sets the value of the inAccountCollateralAccountCollateralTmstamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInAccountCollateralAccountCollateralTmstamp(XMLGregorianCalendar value) {
        this.inAccountCollateralAccountCollateralTmstamp = value;
    }

    /**
     * Gets the value of the inAccountCollateralAccountCollateralUnitCode property.
     * 
     */
    public int getInAccountCollateralAccountCollateralUnitCode() {
        return inAccountCollateralAccountCollateralUnitCode;
    }

    /**
     * Sets the value of the inAccountCollateralAccountCollateralUnitCode property.
     * 
     */
    public void setInAccountCollateralAccountCollateralUnitCode(int value) {
        this.inAccountCollateralAccountCollateralUnitCode = value;
    }

    /**
     * Gets the value of the inAccountCollateralAccountCollateralUserCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInAccountCollateralAccountCollateralUserCode() {
        return inAccountCollateralAccountCollateralUserCode;
    }

    /**
     * Sets the value of the inAccountCollateralAccountCollateralUserCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInAccountCollateralAccountCollateralUserCode(String value) {
        this.inAccountCollateralAccountCollateralUserCode = value;
    }

    /**
     * Gets the value of the inAccountCollateralAccountCollateralYieldLimitAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInAccountCollateralAccountCollateralYieldLimitAmn() {
        return inAccountCollateralAccountCollateralYieldLimitAmn;
    }

    /**
     * Sets the value of the inAccountCollateralAccountCollateralYieldLimitAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInAccountCollateralAccountCollateralYieldLimitAmn(BigDecimal value) {
        this.inAccountCollateralAccountCollateralYieldLimitAmn = value;
    }

    /**
     * Gets the value of the inAccountCollateralAccountCollateralYieldPerc property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInAccountCollateralAccountCollateralYieldPerc() {
        return inAccountCollateralAccountCollateralYieldPerc;
    }

    /**
     * Sets the value of the inAccountCollateralAccountCollateralYieldPerc property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInAccountCollateralAccountCollateralYieldPerc(BigDecimal value) {
        this.inAccountCollateralAccountCollateralYieldPerc = value;
    }

    /**
     * Gets the value of the inAccountCollateralAccountCollateralYieldUtilisedAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInAccountCollateralAccountCollateralYieldUtilisedAmn() {
        return inAccountCollateralAccountCollateralYieldUtilisedAmn;
    }

    /**
     * Sets the value of the inAccountCollateralAccountCollateralYieldUtilisedAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInAccountCollateralAccountCollateralYieldUtilisedAmn(BigDecimal value) {
        this.inAccountCollateralAccountCollateralYieldUtilisedAmn = value;
    }

    /**
     * Gets the value of the inAppraiserBankemployeeId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInAppraiserBankemployeeId() {
        return inAppraiserBankemployeeId;
    }

    /**
     * Sets the value of the inAppraiserBankemployeeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInAppraiserBankemployeeId(String value) {
        this.inAppraiserBankemployeeId = value;
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
     * Gets the value of the inCbAssurIefSuppliedFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCbAssurIefSuppliedFlag() {
        return inCbAssurIefSuppliedFlag;
    }

    /**
     * Sets the value of the inCbAssurIefSuppliedFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCbAssurIefSuppliedFlag(String value) {
        this.inCbAssurIefSuppliedFlag = value;
    }

    /**
     * Gets the value of the inCollateralBaselIiAcpt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCollateralBaselIiAcpt() {
        return inCollateralBaselIiAcpt;
    }

    /**
     * Sets the value of the inCollateralBaselIiAcpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCollateralBaselIiAcpt(String value) {
        this.inCollateralBaselIiAcpt = value;
    }

    /**
     * Gets the value of the inCollateralCbInsuranceAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInCollateralCbInsuranceAmn() {
        return inCollateralCbInsuranceAmn;
    }

    /**
     * Sets the value of the inCollateralCbInsuranceAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInCollateralCbInsuranceAmn(BigDecimal value) {
        this.inCollateralCbInsuranceAmn = value;
    }

    /**
     * Gets the value of the inCollateralColEstInsuranceAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInCollateralColEstInsuranceAmn() {
        return inCollateralColEstInsuranceAmn;
    }

    /**
     * Sets the value of the inCollateralColEstInsuranceAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInCollateralColEstInsuranceAmn(BigDecimal value) {
        this.inCollateralColEstInsuranceAmn = value;
    }

    /**
     * Gets the value of the inCollateralColEstValueAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInCollateralColEstValueAmn() {
        return inCollateralColEstValueAmn;
    }

    /**
     * Sets the value of the inCollateralColEstValueAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInCollateralColEstValueAmn(BigDecimal value) {
        this.inCollateralColEstValueAmn = value;
    }

    /**
     * Gets the value of the inCollateralCollateralCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCollateralCollateralCode() {
        return inCollateralCollateralCode;
    }

    /**
     * Sets the value of the inCollateralCollateralCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCollateralCollateralCode(String value) {
        this.inCollateralCollateralCode = value;
    }

    /**
     * Gets the value of the inCollateralCollateralDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCollateralCollateralDesc() {
        return inCollateralCollateralDesc;
    }

    /**
     * Sets the value of the inCollateralCollateralDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCollateralCollateralDesc(String value) {
        this.inCollateralCollateralDesc = value;
    }

    /**
     * Gets the value of the inCollateralCollateralSn property.
     * 
     */
    public double getInCollateralCollateralSn() {
        return inCollateralCollateralSn;
    }

    /**
     * Sets the value of the inCollateralCollateralSn property.
     * 
     */
    public void setInCollateralCollateralSn(double value) {
        this.inCollateralCollateralSn = value;
    }

    /**
     * Gets the value of the inCollateralCollateralStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCollateralCollateralStatus() {
        return inCollateralCollateralStatus;
    }

    /**
     * Sets the value of the inCollateralCollateralStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCollateralCollateralStatus(String value) {
        this.inCollateralCollateralStatus = value;
    }

    /**
     * Gets the value of the inCollateralEstimationDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInCollateralEstimationDt() {
        return inCollateralEstimationDt;
    }

    /**
     * Sets the value of the inCollateralEstimationDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInCollateralEstimationDt(XMLGregorianCalendar value) {
        this.inCollateralEstimationDt = value;
    }

    /**
     * Gets the value of the inCollateralItemsCnt property.
     * 
     */
    public int getInCollateralItemsCnt() {
        return inCollateralItemsCnt;
    }

    /**
     * Sets the value of the inCollateralItemsCnt property.
     * 
     */
    public void setInCollateralItemsCnt(int value) {
        this.inCollateralItemsCnt = value;
    }

    /**
     * Gets the value of the inCollateralRevalCurrFixRat property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInCollateralRevalCurrFixRat() {
        return inCollateralRevalCurrFixRat;
    }

    /**
     * Sets the value of the inCollateralRevalCurrFixRat property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInCollateralRevalCurrFixRat(BigDecimal value) {
        this.inCollateralRevalCurrFixRat = value;
    }

    /**
     * Gets the value of the inCollateralRevalInitFixRat property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInCollateralRevalInitFixRat() {
        return inCollateralRevalInitFixRat;
    }

    /**
     * Sets the value of the inCollateralRevalInitFixRat property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInCollateralRevalInitFixRat(BigDecimal value) {
        this.inCollateralRevalInitFixRat = value;
    }

    /**
     * Gets the value of the inCollateralRevalInitSv property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInCollateralRevalInitSv() {
        return inCollateralRevalInitSv;
    }

    /**
     * Sets the value of the inCollateralRevalInitSv property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInCollateralRevalInitSv(BigDecimal value) {
        this.inCollateralRevalInitSv = value;
    }

    /**
     * Gets the value of the inCollateralRevaluationCurrid property.
     * 
     */
    public int getInCollateralRevaluationCurrid() {
        return inCollateralRevaluationCurrid;
    }

    /**
     * Sets the value of the inCollateralRevaluationCurrid property.
     * 
     */
    public void setInCollateralRevaluationCurrid(int value) {
        this.inCollateralRevaluationCurrid = value;
    }

    /**
     * Gets the value of the inCollateralReviseDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInCollateralReviseDt() {
        return inCollateralReviseDt;
    }

    /**
     * Sets the value of the inCollateralReviseDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInCollateralReviseDt(XMLGregorianCalendar value) {
        this.inCollateralReviseDt = value;
    }

    /**
     * Gets the value of the inCollateralTmstamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInCollateralTmstamp() {
        return inCollateralTmstamp;
    }

    /**
     * Sets the value of the inCollateralTmstamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInCollateralTmstamp(XMLGregorianCalendar value) {
        this.inCollateralTmstamp = value;
    }

    /**
     * Gets the value of the inCollateralUserCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCollateralUserCode() {
        return inCollateralUserCode;
    }

    /**
     * Sets the value of the inCollateralUserCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCollateralUserCode(String value) {
        this.inCollateralUserCode = value;
    }

    /**
     * Gets the value of the inCollateralYieldLimitAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInCollateralYieldLimitAmn() {
        return inCollateralYieldLimitAmn;
    }

    /**
     * Sets the value of the inCollateralYieldLimitAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInCollateralYieldLimitAmn(BigDecimal value) {
        this.inCollateralYieldLimitAmn = value;
    }

    /**
     * Gets the value of the inCollateralYieldPerc property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInCollateralYieldPerc() {
        return inCollateralYieldPerc;
    }

    /**
     * Sets the value of the inCollateralYieldPerc property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInCollateralYieldPerc(BigDecimal value) {
        this.inCollateralYieldPerc = value;
    }

    /**
     * Gets the value of the inCollateralYieldUtilisedAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInCollateralYieldUtilisedAmn() {
        return inCollateralYieldUtilisedAmn;
    }

    /**
     * Sets the value of the inCollateralYieldUtilisedAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInCollateralYieldUtilisedAmn(BigDecimal value) {
        this.inCollateralYieldUtilisedAmn = value;
    }

    /**
     * Gets the value of the inCollateralRevalChrgAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInCollateralRevalChrgAmn() {
        return inCollateralRevalChrgAmn;
    }

    /**
     * Sets the value of the inCollateralRevalChrgAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInCollateralRevalChrgAmn(BigDecimal value) {
        this.inCollateralRevalChrgAmn = value;
    }

    /**
     * Gets the value of the inCollateralProductIdProduct property.
     * 
     */
    public int getInCollateralProductIdProduct() {
        return inCollateralProductIdProduct;
    }

    /**
     * Sets the value of the inCollateralProductIdProduct property.
     * 
     */
    public void setInCollateralProductIdProduct(int value) {
        this.inCollateralProductIdProduct = value;
    }

    /**
     * Gets the value of the inCollateralTypeBaselIiAcpt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCollateralTypeBaselIiAcpt() {
        return inCollateralTypeBaselIiAcpt;
    }

    /**
     * Sets the value of the inCollateralTypeBaselIiAcpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCollateralTypeBaselIiAcpt(String value) {
        this.inCollateralTypeBaselIiAcpt = value;
    }

    /**
     * Gets the value of the inCollateralTypeCbAssurCalcInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCollateralTypeCbAssurCalcInd() {
        return inCollateralTypeCbAssurCalcInd;
    }

    /**
     * Sets the value of the inCollateralTypeCbAssurCalcInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCollateralTypeCbAssurCalcInd(String value) {
        this.inCollateralTypeCbAssurCalcInd = value;
    }

    /**
     * Gets the value of the inCollateralTypeProductDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCollateralTypeProductDescription() {
        return inCollateralTypeProductDescription;
    }

    /**
     * Sets the value of the inCollateralTypeProductDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCollateralTypeProductDescription(String value) {
        this.inCollateralTypeProductDescription = value;
    }

    /**
     * Gets the value of the inCollateralTypeProductIdProduct property.
     * 
     */
    public int getInCollateralTypeProductIdProduct() {
        return inCollateralTypeProductIdProduct;
    }

    /**
     * Sets the value of the inCollateralTypeProductIdProduct property.
     * 
     */
    public void setInCollateralTypeProductIdProduct(int value) {
        this.inCollateralTypeProductIdProduct = value;
    }

    /**
     * Gets the value of the inCollUnitCode property.
     * 
     */
    public int getInCollUnitCode() {
        return inCollUnitCode;
    }

    /**
     * Sets the value of the inCollUnitCode property.
     * 
     */
    public void setInCollUnitCode(int value) {
        this.inCollUnitCode = value;
    }

    /**
     * Gets the value of the inCurrencyIdCurrency property.
     * 
     */
    public int getInCurrencyIdCurrency() {
        return inCurrencyIdCurrency;
    }

    /**
     * Sets the value of the inCurrencyIdCurrency property.
     * 
     */
    public void setInCurrencyIdCurrency(int value) {
        this.inCurrencyIdCurrency = value;
    }

    /**
     * Gets the value of the inCurrencyNationalFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCurrencyNationalFlag() {
        return inCurrencyNationalFlag;
    }

    /**
     * Sets the value of the inCurrencyNationalFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCurrencyNationalFlag(String value) {
        this.inCurrencyNationalFlag = value;
    }

    /**
     * Gets the value of the inCurrencyShortDescr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCurrencyShortDescr() {
        return inCurrencyShortDescr;
    }

    /**
     * Sets the value of the inCurrencyShortDescr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCurrencyShortDescr(String value) {
        this.inCurrencyShortDescr = value;
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
     * Gets the value of the inFinalizeFlgIefSuppliedFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInFinalizeFlgIefSuppliedFlag() {
        return inFinalizeFlgIefSuppliedFlag;
    }

    /**
     * Sets the value of the inFinalizeFlgIefSuppliedFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInFinalizeFlgIefSuppliedFlag(String value) {
        this.inFinalizeFlgIefSuppliedFlag = value;
    }

    /**
     * Gets the value of the inGrpLength property.
     * 
     */
    public int getInGrpLength() {
        return inGrpLength;
    }

    /**
     * Sets the value of the inGrpLength property.
     * 
     */
    public void setInGrpLength(int value) {
        this.inGrpLength = value;
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
     * Gets the value of the inKeyCollateralCollateralSn property.
     * 
     */
    public double getInKeyCollateralCollateralSn() {
        return inKeyCollateralCollateralSn;
    }

    /**
     * Sets the value of the inKeyCollateralCollateralSn property.
     * 
     */
    public void setInKeyCollateralCollateralSn(double value) {
        this.inKeyCollateralCollateralSn = value;
    }

    /**
     * Gets the value of the inLandRegistryGenericDetailDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInLandRegistryGenericDetailDescription() {
        return inLandRegistryGenericDetailDescription;
    }

    /**
     * Sets the value of the inLandRegistryGenericDetailDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInLandRegistryGenericDetailDescription(String value) {
        this.inLandRegistryGenericDetailDescription = value;
    }

    /**
     * Gets the value of the inLandRegistryGenericDetailSerialNum property.
     * 
     */
    public int getInLandRegistryGenericDetailSerialNum() {
        return inLandRegistryGenericDetailSerialNum;
    }

    /**
     * Sets the value of the inLandRegistryGenericDetailSerialNum property.
     * 
     */
    public void setInLandRegistryGenericDetailSerialNum(int value) {
        this.inLandRegistryGenericDetailSerialNum = value;
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
     * Gets the value of the inNewColltblCollateralTableInternalSn property.
     * 
     */
    public double getInNewColltblCollateralTableInternalSn() {
        return inNewColltblCollateralTableInternalSn;
    }

    /**
     * Sets the value of the inNewColltblCollateralTableInternalSn property.
     * 
     */
    public void setInNewColltblCollateralTableInternalSn(double value) {
        this.inNewColltblCollateralTableInternalSn = value;
    }

    /**
     * Gets the value of the inNewColltblCollateralTableRecordType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInNewColltblCollateralTableRecordType() {
        return inNewColltblCollateralTableRecordType;
    }

    /**
     * Sets the value of the inNewColltblCollateralTableRecordType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInNewColltblCollateralTableRecordType(String value) {
        this.inNewColltblCollateralTableRecordType = value;
    }

    /**
     * Gets the value of the inNewColltblCustomerCDigit property.
     * 
     */
    public short getInNewColltblCustomerCDigit() {
        return inNewColltblCustomerCDigit;
    }

    /**
     * Sets the value of the inNewColltblCustomerCDigit property.
     * 
     */
    public void setInNewColltblCustomerCDigit(short value) {
        this.inNewColltblCustomerCDigit = value;
    }

    /**
     * Gets the value of the inNewColltblCustomerCustId property.
     * 
     */
    public int getInNewColltblCustomerCustId() {
        return inNewColltblCustomerCustId;
    }

    /**
     * Sets the value of the inNewColltblCustomerCustId property.
     * 
     */
    public void setInNewColltblCustomerCustId(int value) {
        this.inNewColltblCustomerCustId = value;
    }

    /**
     * Gets the value of the inNewCustomerCustId property.
     * 
     */
    public int getInNewCustomerCustId() {
        return inNewCustomerCustId;
    }

    /**
     * Sets the value of the inNewCustomerCustId property.
     * 
     */
    public void setInNewCustomerCustId(int value) {
        this.inNewCustomerCustId = value;
    }

    /**
     * Gets the value of the inProfitsAccountAccStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInProfitsAccountAccStatus() {
        return inProfitsAccountAccStatus;
    }

    /**
     * Sets the value of the inProfitsAccountAccStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInProfitsAccountAccStatus(String value) {
        this.inProfitsAccountAccStatus = value;
    }

    /**
     * Gets the value of the inReversalIefSuppliedFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInReversalIefSuppliedFlag() {
        return inReversalIefSuppliedFlag;
    }

    /**
     * Sets the value of the inReversalIefSuppliedFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInReversalIefSuppliedFlag(String value) {
        this.inReversalIefSuppliedFlag = value;
    }

    /**
     * Gets the value of the inTrxAuthResultTeamInformationSuper1Code property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInTrxAuthResultTeamInformationSuper1Code() {
        return inTrxAuthResultTeamInformationSuper1Code;
    }

    /**
     * Sets the value of the inTrxAuthResultTeamInformationSuper1Code property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInTrxAuthResultTeamInformationSuper1Code(String value) {
        this.inTrxAuthResultTeamInformationSuper1Code = value;
    }

    /**
     * Gets the value of the inTrxAuthResultTeamInformationSuper2Code property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInTrxAuthResultTeamInformationSuper2Code() {
        return inTrxAuthResultTeamInformationSuper2Code;
    }

    /**
     * Sets the value of the inTrxAuthResultTeamInformationSuper2Code property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInTrxAuthResultTeamInformationSuper2Code(String value) {
        this.inTrxAuthResultTeamInformationSuper2Code = value;
    }

    /**
     * Gets the value of the inAccountCollateralAccountCollateralMortgageAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInAccountCollateralAccountCollateralMortgageAmn() {
        return inAccountCollateralAccountCollateralMortgageAmn;
    }

    /**
     * Sets the value of the inAccountCollateralAccountCollateralMortgageAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInAccountCollateralAccountCollateralMortgageAmn(BigDecimal value) {
        this.inAccountCollateralAccountCollateralMortgageAmn = value;
    }

    /**
     * Gets the value of the inAccountCollateralAccountCollateralMortgageClass property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInAccountCollateralAccountCollateralMortgageClass() {
        return inAccountCollateralAccountCollateralMortgageClass;
    }

    /**
     * Sets the value of the inAccountCollateralAccountCollateralMortgageClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInAccountCollateralAccountCollateralMortgageClass(String value) {
        this.inAccountCollateralAccountCollateralMortgageClass = value;
    }

    /**
     * Gets the value of the inAccountCollateralAccountCollateralMortgageDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInAccountCollateralAccountCollateralMortgageDate() {
        return inAccountCollateralAccountCollateralMortgageDate;
    }

    /**
     * Sets the value of the inAccountCollateralAccountCollateralMortgageDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInAccountCollateralAccountCollateralMortgageDate(XMLGregorianCalendar value) {
        this.inAccountCollateralAccountCollateralMortgageDate = value;
    }

}
