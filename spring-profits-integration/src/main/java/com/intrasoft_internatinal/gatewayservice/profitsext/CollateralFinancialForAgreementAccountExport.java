
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for CollateralFinancialForAgreementAccountExport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CollateralFinancialForAgreementAccountExport">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}BaseExport">
 *       &lt;sequence>
 *         &lt;element name="OutAppraiserBankemployeeId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCollateralBaselIiAcpt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCollateralCbInsuranceAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutCollateralColEstInsuranceAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutCollateralColEstValueAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutCollateralCollateralCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCollateralCollateralDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCollateralCollateralSn" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OutCollateralCollateralStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCollateralColltblCDigit" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutCollateralColltblCustId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutCollateralColltblInternalSn" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OutCollateralColltblRecordType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCollateralEstimationDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutCollateralInsertionDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutCollateralItemsCnt" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutCollateralRevalCurrFixRat" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutCollateralRevalInitFixRat" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutCollateralRevalInitSv" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutCollateralRevaluationCurrid" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutCollateralReviseDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutCollateralTmstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutCollateralUserCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCollateralYieldLimitAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutCollateralYieldPerc" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutCollateralYieldUtilisedAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutCollateralRevalChrgAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutCollateralTypeAccNoInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCollateralTypeAssociationInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCollateralTypeAssocUniqueInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCollateralTypeAssurValCalcInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCollateralTypeBaselIiAcpt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCollateralTypeCbAssurCalcInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCollateralTypeCbAssurFactor" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutCollateralTypeCollateralCategor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCollateralTypeCollateralCodeInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCollateralTypeCollExpDtInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCollateralTypeItemCntInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCollateralTypeLandRegistryInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCollateralTypeReliabilityCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCollateralTypeReliabilityFct" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutCollateralTypeRevaluationDtInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCollateralTypeValueFct" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutCollateralTypeYieldPerc" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutCollateralTypeProductDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCollateralTypeProductIdProduct" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutCollValueGenericDetailDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCollValueGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutCurrencyIdCurrency" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutCurrencyShortDescr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustListSetDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustomerAlertMsg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustomerCustId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutCustomerCustStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustomerCustType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustomerShortName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutEvalTeamInformationAuthorizationType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutEvalTeamInformationEvaluationResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutEvalTeamInformationRequiredProfile1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutEvalTeamInformationRequiredProfile2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutExistIefSuppliedFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutFixingRateRate" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutFullCustNameListSetDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpLength" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGrpAdviceDetailLength" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGrpAdviceTotalLength" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGrpSrvLogLength" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGrpUserTotalLength" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutLandRegistryGenericDetailDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutLandRegistryGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutModifiedAccountCollateralAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutModifiedAccountCollateralEntryStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutModifiedAccountCollateralFirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutModifiedAccountCollateralInsertionDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutModifiedAccountCollateralInternalSn" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutModifiedAccountCollateralSurname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutModifiedAccountCollateralTmstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutModifiedAccountCollateralUserCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutModifiedByUnitCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutNewColltblCollateralTableInternalSn" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OutNewColltblCollateralTableRecordDescr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutNewColltblCollateralTableRecordType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutNewColltblCollateralTableTagSetCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutNewColltblCustomerCDigit" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutNewColltblCustomerCustId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutNewColltblListSetDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutPercentageIefSuppliedPercentage" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutPrftTransactionDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutPrftTransactionIdTransact" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutPrintErrorMsgIefSuppliedFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutRevaluationCurrCurrencyShortDescr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutTeamInformationAuthorizationType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutTeamInformationEvaluationResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutTeamInformationRequiredProfile1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutTeamInformationRequiredProfile2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutTmstampCollateralCbInsuranceAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutTmstampCollateralColEstInsuranceAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutTmstampCollateralColEstValueAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutTmstampCollateralItemsCnt" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutTmstampCollateralTmstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutTmstampCollateralUserCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutTrxTrxCountAdvCounter" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutTrxTrxCountTrxCounter" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutVoucherLineParVoucherRunVoucherLine" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCollatParametersBlockPerAccColl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCollatParametersAutoMarginProd" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutCollatParametersDispFinMortgage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrp" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}ArrayOfOutGrpT" minOccurs="0"/>
 *         &lt;element name="OutGrpAdviceDetail" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}ArrayOfOutGrpAdviceDetailT" minOccurs="0"/>
 *         &lt;element name="OutGrpAdviceTotal" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}ArrayOfOutGrpAdviceTotalT" minOccurs="0"/>
 *         &lt;element name="OutGrpSrvLog" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}ArrayOfOutGrpSrvLog" minOccurs="0"/>
 *         &lt;element name="OutGrpUserTotal" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}ArrayOfOutGrpUserTotalT" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CollateralFinancialForAgreementAccountExport", propOrder = {
    "outAppraiserBankemployeeId",
    "outCollateralBaselIiAcpt",
    "outCollateralCbInsuranceAmn",
    "outCollateralColEstInsuranceAmn",
    "outCollateralColEstValueAmn",
    "outCollateralCollateralCode",
    "outCollateralCollateralDesc",
    "outCollateralCollateralSn",
    "outCollateralCollateralStatus",
    "outCollateralColltblCDigit",
    "outCollateralColltblCustId",
    "outCollateralColltblInternalSn",
    "outCollateralColltblRecordType",
    "outCollateralEstimationDt",
    "outCollateralInsertionDt",
    "outCollateralItemsCnt",
    "outCollateralRevalCurrFixRat",
    "outCollateralRevalInitFixRat",
    "outCollateralRevalInitSv",
    "outCollateralRevaluationCurrid",
    "outCollateralReviseDt",
    "outCollateralTmstamp",
    "outCollateralUserCode",
    "outCollateralYieldLimitAmn",
    "outCollateralYieldPerc",
    "outCollateralYieldUtilisedAmn",
    "outCollateralRevalChrgAmn",
    "outCollateralTypeAccNoInd",
    "outCollateralTypeAssociationInd",
    "outCollateralTypeAssocUniqueInd",
    "outCollateralTypeAssurValCalcInd",
    "outCollateralTypeBaselIiAcpt",
    "outCollateralTypeCbAssurCalcInd",
    "outCollateralTypeCbAssurFactor",
    "outCollateralTypeCollateralCategor",
    "outCollateralTypeCollateralCodeInd",
    "outCollateralTypeCollExpDtInd",
    "outCollateralTypeItemCntInd",
    "outCollateralTypeLandRegistryInd",
    "outCollateralTypeReliabilityCode",
    "outCollateralTypeReliabilityFct",
    "outCollateralTypeRevaluationDtInd",
    "outCollateralTypeValueFct",
    "outCollateralTypeYieldPerc",
    "outCollateralTypeProductDescription",
    "outCollateralTypeProductIdProduct",
    "outCollValueGenericDetailDescription",
    "outCollValueGenericDetailSerialNum",
    "outCurrencyIdCurrency",
    "outCurrencyShortDescr",
    "outCustListSetDescription",
    "outCustomerAlertMsg",
    "outCustomerCustId",
    "outCustomerCustStatus",
    "outCustomerCustType",
    "outCustomerShortName",
    "outEvalTeamInformationAuthorizationType",
    "outEvalTeamInformationEvaluationResult",
    "outEvalTeamInformationRequiredProfile1",
    "outEvalTeamInformationRequiredProfile2",
    "outExistIefSuppliedFlag",
    "outFixingRateRate",
    "outFullCustNameListSetDescription",
    "outGrpLength",
    "outGrpAdviceDetailLength",
    "outGrpAdviceTotalLength",
    "outGrpSrvLogLength",
    "outGrpUserTotalLength",
    "outLandRegistryGenericDetailDescription",
    "outLandRegistryGenericDetailSerialNum",
    "outModifiedAccountCollateralAddress",
    "outModifiedAccountCollateralEntryStatus",
    "outModifiedAccountCollateralFirstName",
    "outModifiedAccountCollateralInsertionDt",
    "outModifiedAccountCollateralInternalSn",
    "outModifiedAccountCollateralSurname",
    "outModifiedAccountCollateralTmstamp",
    "outModifiedAccountCollateralUserCode",
    "outModifiedByUnitCode",
    "outNewColltblCollateralTableInternalSn",
    "outNewColltblCollateralTableRecordDescr",
    "outNewColltblCollateralTableRecordType",
    "outNewColltblCollateralTableTagSetCode",
    "outNewColltblCustomerCDigit",
    "outNewColltblCustomerCustId",
    "outNewColltblListSetDescription",
    "outPercentageIefSuppliedPercentage",
    "outPrftTransactionDescription",
    "outPrftTransactionIdTransact",
    "outPrintErrorMsgIefSuppliedFlag",
    "outRevaluationCurrCurrencyShortDescr",
    "outTeamInformationAuthorizationType",
    "outTeamInformationEvaluationResult",
    "outTeamInformationRequiredProfile1",
    "outTeamInformationRequiredProfile2",
    "outTmstampCollateralCbInsuranceAmn",
    "outTmstampCollateralColEstInsuranceAmn",
    "outTmstampCollateralColEstValueAmn",
    "outTmstampCollateralItemsCnt",
    "outTmstampCollateralTmstamp",
    "outTmstampCollateralUserCode",
    "outTrxTrxCountAdvCounter",
    "outTrxTrxCountTrxCounter",
    "outVoucherLineParVoucherRunVoucherLine",
    "outCollatParametersBlockPerAccColl",
    "outCollatParametersAutoMarginProd",
    "outCollatParametersDispFinMortgage",
    "outGrp",
    "outGrpAdviceDetail",
    "outGrpAdviceTotal",
    "outGrpSrvLog",
    "outGrpUserTotal"
})
public class CollateralFinancialForAgreementAccountExport
    extends BaseExport
{

    @XmlElement(name = "OutAppraiserBankemployeeId")
    protected String outAppraiserBankemployeeId;
    @XmlElement(name = "OutCollateralBaselIiAcpt")
    protected String outCollateralBaselIiAcpt;
    @XmlElement(name = "OutCollateralCbInsuranceAmn", required = true)
    protected BigDecimal outCollateralCbInsuranceAmn;
    @XmlElement(name = "OutCollateralColEstInsuranceAmn", required = true)
    protected BigDecimal outCollateralColEstInsuranceAmn;
    @XmlElement(name = "OutCollateralColEstValueAmn", required = true)
    protected BigDecimal outCollateralColEstValueAmn;
    @XmlElement(name = "OutCollateralCollateralCode")
    protected String outCollateralCollateralCode;
    @XmlElement(name = "OutCollateralCollateralDesc")
    protected String outCollateralCollateralDesc;
    @XmlElement(name = "OutCollateralCollateralSn")
    protected double outCollateralCollateralSn;
    @XmlElement(name = "OutCollateralCollateralStatus")
    protected String outCollateralCollateralStatus;
    @XmlElement(name = "OutCollateralColltblCDigit")
    protected short outCollateralColltblCDigit;
    @XmlElement(name = "OutCollateralColltblCustId")
    protected int outCollateralColltblCustId;
    @XmlElement(name = "OutCollateralColltblInternalSn")
    protected double outCollateralColltblInternalSn;
    @XmlElement(name = "OutCollateralColltblRecordType")
    protected String outCollateralColltblRecordType;
    @XmlElement(name = "OutCollateralEstimationDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outCollateralEstimationDt;
    @XmlElement(name = "OutCollateralInsertionDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outCollateralInsertionDt;
    @XmlElement(name = "OutCollateralItemsCnt")
    protected int outCollateralItemsCnt;
    @XmlElement(name = "OutCollateralRevalCurrFixRat", required = true)
    protected BigDecimal outCollateralRevalCurrFixRat;
    @XmlElement(name = "OutCollateralRevalInitFixRat", required = true)
    protected BigDecimal outCollateralRevalInitFixRat;
    @XmlElement(name = "OutCollateralRevalInitSv", required = true)
    protected BigDecimal outCollateralRevalInitSv;
    @XmlElement(name = "OutCollateralRevaluationCurrid")
    protected int outCollateralRevaluationCurrid;
    @XmlElement(name = "OutCollateralReviseDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outCollateralReviseDt;
    @XmlElement(name = "OutCollateralTmstamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outCollateralTmstamp;
    @XmlElement(name = "OutCollateralUserCode")
    protected String outCollateralUserCode;
    @XmlElement(name = "OutCollateralYieldLimitAmn", required = true)
    protected BigDecimal outCollateralYieldLimitAmn;
    @XmlElement(name = "OutCollateralYieldPerc", required = true)
    protected BigDecimal outCollateralYieldPerc;
    @XmlElement(name = "OutCollateralYieldUtilisedAmn", required = true)
    protected BigDecimal outCollateralYieldUtilisedAmn;
    @XmlElement(name = "OutCollateralRevalChrgAmn", required = true)
    protected BigDecimal outCollateralRevalChrgAmn;
    @XmlElement(name = "OutCollateralTypeAccNoInd")
    protected String outCollateralTypeAccNoInd;
    @XmlElement(name = "OutCollateralTypeAssociationInd")
    protected String outCollateralTypeAssociationInd;
    @XmlElement(name = "OutCollateralTypeAssocUniqueInd")
    protected String outCollateralTypeAssocUniqueInd;
    @XmlElement(name = "OutCollateralTypeAssurValCalcInd")
    protected String outCollateralTypeAssurValCalcInd;
    @XmlElement(name = "OutCollateralTypeBaselIiAcpt")
    protected String outCollateralTypeBaselIiAcpt;
    @XmlElement(name = "OutCollateralTypeCbAssurCalcInd")
    protected String outCollateralTypeCbAssurCalcInd;
    @XmlElement(name = "OutCollateralTypeCbAssurFactor", required = true)
    protected BigDecimal outCollateralTypeCbAssurFactor;
    @XmlElement(name = "OutCollateralTypeCollateralCategor")
    protected String outCollateralTypeCollateralCategor;
    @XmlElement(name = "OutCollateralTypeCollateralCodeInd")
    protected String outCollateralTypeCollateralCodeInd;
    @XmlElement(name = "OutCollateralTypeCollExpDtInd")
    protected String outCollateralTypeCollExpDtInd;
    @XmlElement(name = "OutCollateralTypeItemCntInd")
    protected String outCollateralTypeItemCntInd;
    @XmlElement(name = "OutCollateralTypeLandRegistryInd")
    protected String outCollateralTypeLandRegistryInd;
    @XmlElement(name = "OutCollateralTypeReliabilityCode")
    protected String outCollateralTypeReliabilityCode;
    @XmlElement(name = "OutCollateralTypeReliabilityFct", required = true)
    protected BigDecimal outCollateralTypeReliabilityFct;
    @XmlElement(name = "OutCollateralTypeRevaluationDtInd")
    protected String outCollateralTypeRevaluationDtInd;
    @XmlElement(name = "OutCollateralTypeValueFct", required = true)
    protected BigDecimal outCollateralTypeValueFct;
    @XmlElement(name = "OutCollateralTypeYieldPerc", required = true)
    protected BigDecimal outCollateralTypeYieldPerc;
    @XmlElement(name = "OutCollateralTypeProductDescription")
    protected String outCollateralTypeProductDescription;
    @XmlElement(name = "OutCollateralTypeProductIdProduct")
    protected int outCollateralTypeProductIdProduct;
    @XmlElement(name = "OutCollValueGenericDetailDescription")
    protected String outCollValueGenericDetailDescription;
    @XmlElement(name = "OutCollValueGenericDetailSerialNum")
    protected int outCollValueGenericDetailSerialNum;
    @XmlElement(name = "OutCurrencyIdCurrency")
    protected int outCurrencyIdCurrency;
    @XmlElement(name = "OutCurrencyShortDescr")
    protected String outCurrencyShortDescr;
    @XmlElement(name = "OutCustListSetDescription")
    protected String outCustListSetDescription;
    @XmlElement(name = "OutCustomerAlertMsg")
    protected String outCustomerAlertMsg;
    @XmlElement(name = "OutCustomerCustId")
    protected int outCustomerCustId;
    @XmlElement(name = "OutCustomerCustStatus")
    protected String outCustomerCustStatus;
    @XmlElement(name = "OutCustomerCustType")
    protected String outCustomerCustType;
    @XmlElement(name = "OutCustomerShortName")
    protected String outCustomerShortName;
    @XmlElement(name = "OutEvalTeamInformationAuthorizationType")
    protected String outEvalTeamInformationAuthorizationType;
    @XmlElement(name = "OutEvalTeamInformationEvaluationResult")
    protected String outEvalTeamInformationEvaluationResult;
    @XmlElement(name = "OutEvalTeamInformationRequiredProfile1")
    protected String outEvalTeamInformationRequiredProfile1;
    @XmlElement(name = "OutEvalTeamInformationRequiredProfile2")
    protected String outEvalTeamInformationRequiredProfile2;
    @XmlElement(name = "OutExistIefSuppliedFlag")
    protected String outExistIefSuppliedFlag;
    @XmlElement(name = "OutFixingRateRate", required = true)
    protected BigDecimal outFixingRateRate;
    @XmlElement(name = "OutFullCustNameListSetDescription")
    protected String outFullCustNameListSetDescription;
    @XmlElement(name = "OutGrpLength")
    protected int outGrpLength;
    @XmlElement(name = "OutGrpAdviceDetailLength")
    protected int outGrpAdviceDetailLength;
    @XmlElement(name = "OutGrpAdviceTotalLength")
    protected int outGrpAdviceTotalLength;
    @XmlElement(name = "OutGrpSrvLogLength")
    protected int outGrpSrvLogLength;
    @XmlElement(name = "OutGrpUserTotalLength")
    protected int outGrpUserTotalLength;
    @XmlElement(name = "OutLandRegistryGenericDetailDescription")
    protected String outLandRegistryGenericDetailDescription;
    @XmlElement(name = "OutLandRegistryGenericDetailSerialNum")
    protected int outLandRegistryGenericDetailSerialNum;
    @XmlElement(name = "OutModifiedAccountCollateralAddress")
    protected String outModifiedAccountCollateralAddress;
    @XmlElement(name = "OutModifiedAccountCollateralEntryStatus")
    protected String outModifiedAccountCollateralEntryStatus;
    @XmlElement(name = "OutModifiedAccountCollateralFirstName")
    protected String outModifiedAccountCollateralFirstName;
    @XmlElement(name = "OutModifiedAccountCollateralInsertionDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outModifiedAccountCollateralInsertionDt;
    @XmlElement(name = "OutModifiedAccountCollateralInternalSn")
    protected short outModifiedAccountCollateralInternalSn;
    @XmlElement(name = "OutModifiedAccountCollateralSurname")
    protected String outModifiedAccountCollateralSurname;
    @XmlElement(name = "OutModifiedAccountCollateralTmstamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outModifiedAccountCollateralTmstamp;
    @XmlElement(name = "OutModifiedAccountCollateralUserCode")
    protected String outModifiedAccountCollateralUserCode;
    @XmlElement(name = "OutModifiedByUnitCode")
    protected int outModifiedByUnitCode;
    @XmlElement(name = "OutNewColltblCollateralTableInternalSn")
    protected double outNewColltblCollateralTableInternalSn;
    @XmlElement(name = "OutNewColltblCollateralTableRecordDescr")
    protected String outNewColltblCollateralTableRecordDescr;
    @XmlElement(name = "OutNewColltblCollateralTableRecordType")
    protected String outNewColltblCollateralTableRecordType;
    @XmlElement(name = "OutNewColltblCollateralTableTagSetCode")
    protected String outNewColltblCollateralTableTagSetCode;
    @XmlElement(name = "OutNewColltblCustomerCDigit")
    protected short outNewColltblCustomerCDigit;
    @XmlElement(name = "OutNewColltblCustomerCustId")
    protected int outNewColltblCustomerCustId;
    @XmlElement(name = "OutNewColltblListSetDescription")
    protected String outNewColltblListSetDescription;
    @XmlElement(name = "OutPercentageIefSuppliedPercentage", required = true)
    protected BigDecimal outPercentageIefSuppliedPercentage;
    @XmlElement(name = "OutPrftTransactionDescription")
    protected String outPrftTransactionDescription;
    @XmlElement(name = "OutPrftTransactionIdTransact")
    protected int outPrftTransactionIdTransact;
    @XmlElement(name = "OutPrintErrorMsgIefSuppliedFlag")
    protected String outPrintErrorMsgIefSuppliedFlag;
    @XmlElement(name = "OutRevaluationCurrCurrencyShortDescr")
    protected String outRevaluationCurrCurrencyShortDescr;
    @XmlElement(name = "OutTeamInformationAuthorizationType")
    protected String outTeamInformationAuthorizationType;
    @XmlElement(name = "OutTeamInformationEvaluationResult")
    protected String outTeamInformationEvaluationResult;
    @XmlElement(name = "OutTeamInformationRequiredProfile1")
    protected String outTeamInformationRequiredProfile1;
    @XmlElement(name = "OutTeamInformationRequiredProfile2")
    protected String outTeamInformationRequiredProfile2;
    @XmlElement(name = "OutTmstampCollateralCbInsuranceAmn", required = true)
    protected BigDecimal outTmstampCollateralCbInsuranceAmn;
    @XmlElement(name = "OutTmstampCollateralColEstInsuranceAmn", required = true)
    protected BigDecimal outTmstampCollateralColEstInsuranceAmn;
    @XmlElement(name = "OutTmstampCollateralColEstValueAmn", required = true)
    protected BigDecimal outTmstampCollateralColEstValueAmn;
    @XmlElement(name = "OutTmstampCollateralItemsCnt")
    protected int outTmstampCollateralItemsCnt;
    @XmlElement(name = "OutTmstampCollateralTmstamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outTmstampCollateralTmstamp;
    @XmlElement(name = "OutTmstampCollateralUserCode")
    protected String outTmstampCollateralUserCode;
    @XmlElement(name = "OutTrxTrxCountAdvCounter")
    protected int outTrxTrxCountAdvCounter;
    @XmlElement(name = "OutTrxTrxCountTrxCounter")
    protected int outTrxTrxCountTrxCounter;
    @XmlElement(name = "OutVoucherLineParVoucherRunVoucherLine")
    protected String outVoucherLineParVoucherRunVoucherLine;
    @XmlElement(name = "OutCollatParametersBlockPerAccColl")
    protected String outCollatParametersBlockPerAccColl;
    @XmlElement(name = "OutCollatParametersAutoMarginProd")
    protected int outCollatParametersAutoMarginProd;
    @XmlElement(name = "OutCollatParametersDispFinMortgage")
    protected String outCollatParametersDispFinMortgage;
    @XmlElement(name = "OutGrp")
    protected ArrayOfOutGrpT outGrp;
    @XmlElement(name = "OutGrpAdviceDetail")
    protected ArrayOfOutGrpAdviceDetailT outGrpAdviceDetail;
    @XmlElement(name = "OutGrpAdviceTotal")
    protected ArrayOfOutGrpAdviceTotalT outGrpAdviceTotal;
    @XmlElement(name = "OutGrpSrvLog")
    protected ArrayOfOutGrpSrvLog outGrpSrvLog;
    @XmlElement(name = "OutGrpUserTotal")
    protected ArrayOfOutGrpUserTotalT outGrpUserTotal;

    /**
     * Gets the value of the outAppraiserBankemployeeId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutAppraiserBankemployeeId() {
        return outAppraiserBankemployeeId;
    }

    /**
     * Sets the value of the outAppraiserBankemployeeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutAppraiserBankemployeeId(String value) {
        this.outAppraiserBankemployeeId = value;
    }

    /**
     * Gets the value of the outCollateralBaselIiAcpt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCollateralBaselIiAcpt() {
        return outCollateralBaselIiAcpt;
    }

    /**
     * Sets the value of the outCollateralBaselIiAcpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCollateralBaselIiAcpt(String value) {
        this.outCollateralBaselIiAcpt = value;
    }

    /**
     * Gets the value of the outCollateralCbInsuranceAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutCollateralCbInsuranceAmn() {
        return outCollateralCbInsuranceAmn;
    }

    /**
     * Sets the value of the outCollateralCbInsuranceAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutCollateralCbInsuranceAmn(BigDecimal value) {
        this.outCollateralCbInsuranceAmn = value;
    }

    /**
     * Gets the value of the outCollateralColEstInsuranceAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutCollateralColEstInsuranceAmn() {
        return outCollateralColEstInsuranceAmn;
    }

    /**
     * Sets the value of the outCollateralColEstInsuranceAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutCollateralColEstInsuranceAmn(BigDecimal value) {
        this.outCollateralColEstInsuranceAmn = value;
    }

    /**
     * Gets the value of the outCollateralColEstValueAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutCollateralColEstValueAmn() {
        return outCollateralColEstValueAmn;
    }

    /**
     * Sets the value of the outCollateralColEstValueAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutCollateralColEstValueAmn(BigDecimal value) {
        this.outCollateralColEstValueAmn = value;
    }

    /**
     * Gets the value of the outCollateralCollateralCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCollateralCollateralCode() {
        return outCollateralCollateralCode;
    }

    /**
     * Sets the value of the outCollateralCollateralCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCollateralCollateralCode(String value) {
        this.outCollateralCollateralCode = value;
    }

    /**
     * Gets the value of the outCollateralCollateralDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCollateralCollateralDesc() {
        return outCollateralCollateralDesc;
    }

    /**
     * Sets the value of the outCollateralCollateralDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCollateralCollateralDesc(String value) {
        this.outCollateralCollateralDesc = value;
    }

    /**
     * Gets the value of the outCollateralCollateralSn property.
     * 
     */
    public double getOutCollateralCollateralSn() {
        return outCollateralCollateralSn;
    }

    /**
     * Sets the value of the outCollateralCollateralSn property.
     * 
     */
    public void setOutCollateralCollateralSn(double value) {
        this.outCollateralCollateralSn = value;
    }

    /**
     * Gets the value of the outCollateralCollateralStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCollateralCollateralStatus() {
        return outCollateralCollateralStatus;
    }

    /**
     * Sets the value of the outCollateralCollateralStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCollateralCollateralStatus(String value) {
        this.outCollateralCollateralStatus = value;
    }

    /**
     * Gets the value of the outCollateralColltblCDigit property.
     * 
     */
    public short getOutCollateralColltblCDigit() {
        return outCollateralColltblCDigit;
    }

    /**
     * Sets the value of the outCollateralColltblCDigit property.
     * 
     */
    public void setOutCollateralColltblCDigit(short value) {
        this.outCollateralColltblCDigit = value;
    }

    /**
     * Gets the value of the outCollateralColltblCustId property.
     * 
     */
    public int getOutCollateralColltblCustId() {
        return outCollateralColltblCustId;
    }

    /**
     * Sets the value of the outCollateralColltblCustId property.
     * 
     */
    public void setOutCollateralColltblCustId(int value) {
        this.outCollateralColltblCustId = value;
    }

    /**
     * Gets the value of the outCollateralColltblInternalSn property.
     * 
     */
    public double getOutCollateralColltblInternalSn() {
        return outCollateralColltblInternalSn;
    }

    /**
     * Sets the value of the outCollateralColltblInternalSn property.
     * 
     */
    public void setOutCollateralColltblInternalSn(double value) {
        this.outCollateralColltblInternalSn = value;
    }

    /**
     * Gets the value of the outCollateralColltblRecordType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCollateralColltblRecordType() {
        return outCollateralColltblRecordType;
    }

    /**
     * Sets the value of the outCollateralColltblRecordType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCollateralColltblRecordType(String value) {
        this.outCollateralColltblRecordType = value;
    }

    /**
     * Gets the value of the outCollateralEstimationDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutCollateralEstimationDt() {
        return outCollateralEstimationDt;
    }

    /**
     * Sets the value of the outCollateralEstimationDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutCollateralEstimationDt(XMLGregorianCalendar value) {
        this.outCollateralEstimationDt = value;
    }

    /**
     * Gets the value of the outCollateralInsertionDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutCollateralInsertionDt() {
        return outCollateralInsertionDt;
    }

    /**
     * Sets the value of the outCollateralInsertionDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutCollateralInsertionDt(XMLGregorianCalendar value) {
        this.outCollateralInsertionDt = value;
    }

    /**
     * Gets the value of the outCollateralItemsCnt property.
     * 
     */
    public int getOutCollateralItemsCnt() {
        return outCollateralItemsCnt;
    }

    /**
     * Sets the value of the outCollateralItemsCnt property.
     * 
     */
    public void setOutCollateralItemsCnt(int value) {
        this.outCollateralItemsCnt = value;
    }

    /**
     * Gets the value of the outCollateralRevalCurrFixRat property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutCollateralRevalCurrFixRat() {
        return outCollateralRevalCurrFixRat;
    }

    /**
     * Sets the value of the outCollateralRevalCurrFixRat property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutCollateralRevalCurrFixRat(BigDecimal value) {
        this.outCollateralRevalCurrFixRat = value;
    }

    /**
     * Gets the value of the outCollateralRevalInitFixRat property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutCollateralRevalInitFixRat() {
        return outCollateralRevalInitFixRat;
    }

    /**
     * Sets the value of the outCollateralRevalInitFixRat property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutCollateralRevalInitFixRat(BigDecimal value) {
        this.outCollateralRevalInitFixRat = value;
    }

    /**
     * Gets the value of the outCollateralRevalInitSv property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutCollateralRevalInitSv() {
        return outCollateralRevalInitSv;
    }

    /**
     * Sets the value of the outCollateralRevalInitSv property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutCollateralRevalInitSv(BigDecimal value) {
        this.outCollateralRevalInitSv = value;
    }

    /**
     * Gets the value of the outCollateralRevaluationCurrid property.
     * 
     */
    public int getOutCollateralRevaluationCurrid() {
        return outCollateralRevaluationCurrid;
    }

    /**
     * Sets the value of the outCollateralRevaluationCurrid property.
     * 
     */
    public void setOutCollateralRevaluationCurrid(int value) {
        this.outCollateralRevaluationCurrid = value;
    }

    /**
     * Gets the value of the outCollateralReviseDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutCollateralReviseDt() {
        return outCollateralReviseDt;
    }

    /**
     * Sets the value of the outCollateralReviseDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutCollateralReviseDt(XMLGregorianCalendar value) {
        this.outCollateralReviseDt = value;
    }

    /**
     * Gets the value of the outCollateralTmstamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutCollateralTmstamp() {
        return outCollateralTmstamp;
    }

    /**
     * Sets the value of the outCollateralTmstamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutCollateralTmstamp(XMLGregorianCalendar value) {
        this.outCollateralTmstamp = value;
    }

    /**
     * Gets the value of the outCollateralUserCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCollateralUserCode() {
        return outCollateralUserCode;
    }

    /**
     * Sets the value of the outCollateralUserCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCollateralUserCode(String value) {
        this.outCollateralUserCode = value;
    }

    /**
     * Gets the value of the outCollateralYieldLimitAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutCollateralYieldLimitAmn() {
        return outCollateralYieldLimitAmn;
    }

    /**
     * Sets the value of the outCollateralYieldLimitAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutCollateralYieldLimitAmn(BigDecimal value) {
        this.outCollateralYieldLimitAmn = value;
    }

    /**
     * Gets the value of the outCollateralYieldPerc property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutCollateralYieldPerc() {
        return outCollateralYieldPerc;
    }

    /**
     * Sets the value of the outCollateralYieldPerc property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutCollateralYieldPerc(BigDecimal value) {
        this.outCollateralYieldPerc = value;
    }

    /**
     * Gets the value of the outCollateralYieldUtilisedAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutCollateralYieldUtilisedAmn() {
        return outCollateralYieldUtilisedAmn;
    }

    /**
     * Sets the value of the outCollateralYieldUtilisedAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutCollateralYieldUtilisedAmn(BigDecimal value) {
        this.outCollateralYieldUtilisedAmn = value;
    }

    /**
     * Gets the value of the outCollateralRevalChrgAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutCollateralRevalChrgAmn() {
        return outCollateralRevalChrgAmn;
    }

    /**
     * Sets the value of the outCollateralRevalChrgAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutCollateralRevalChrgAmn(BigDecimal value) {
        this.outCollateralRevalChrgAmn = value;
    }

    /**
     * Gets the value of the outCollateralTypeAccNoInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCollateralTypeAccNoInd() {
        return outCollateralTypeAccNoInd;
    }

    /**
     * Sets the value of the outCollateralTypeAccNoInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCollateralTypeAccNoInd(String value) {
        this.outCollateralTypeAccNoInd = value;
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
     * Gets the value of the outCollateralTypeAssocUniqueInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCollateralTypeAssocUniqueInd() {
        return outCollateralTypeAssocUniqueInd;
    }

    /**
     * Sets the value of the outCollateralTypeAssocUniqueInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCollateralTypeAssocUniqueInd(String value) {
        this.outCollateralTypeAssocUniqueInd = value;
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
     * Gets the value of the outCollateralTypeBaselIiAcpt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCollateralTypeBaselIiAcpt() {
        return outCollateralTypeBaselIiAcpt;
    }

    /**
     * Sets the value of the outCollateralTypeBaselIiAcpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCollateralTypeBaselIiAcpt(String value) {
        this.outCollateralTypeBaselIiAcpt = value;
    }

    /**
     * Gets the value of the outCollateralTypeCbAssurCalcInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCollateralTypeCbAssurCalcInd() {
        return outCollateralTypeCbAssurCalcInd;
    }

    /**
     * Sets the value of the outCollateralTypeCbAssurCalcInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCollateralTypeCbAssurCalcInd(String value) {
        this.outCollateralTypeCbAssurCalcInd = value;
    }

    /**
     * Gets the value of the outCollateralTypeCbAssurFactor property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutCollateralTypeCbAssurFactor() {
        return outCollateralTypeCbAssurFactor;
    }

    /**
     * Sets the value of the outCollateralTypeCbAssurFactor property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutCollateralTypeCbAssurFactor(BigDecimal value) {
        this.outCollateralTypeCbAssurFactor = value;
    }

    /**
     * Gets the value of the outCollateralTypeCollateralCategor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCollateralTypeCollateralCategor() {
        return outCollateralTypeCollateralCategor;
    }

    /**
     * Sets the value of the outCollateralTypeCollateralCategor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCollateralTypeCollateralCategor(String value) {
        this.outCollateralTypeCollateralCategor = value;
    }

    /**
     * Gets the value of the outCollateralTypeCollateralCodeInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCollateralTypeCollateralCodeInd() {
        return outCollateralTypeCollateralCodeInd;
    }

    /**
     * Sets the value of the outCollateralTypeCollateralCodeInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCollateralTypeCollateralCodeInd(String value) {
        this.outCollateralTypeCollateralCodeInd = value;
    }

    /**
     * Gets the value of the outCollateralTypeCollExpDtInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCollateralTypeCollExpDtInd() {
        return outCollateralTypeCollExpDtInd;
    }

    /**
     * Sets the value of the outCollateralTypeCollExpDtInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCollateralTypeCollExpDtInd(String value) {
        this.outCollateralTypeCollExpDtInd = value;
    }

    /**
     * Gets the value of the outCollateralTypeItemCntInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCollateralTypeItemCntInd() {
        return outCollateralTypeItemCntInd;
    }

    /**
     * Sets the value of the outCollateralTypeItemCntInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCollateralTypeItemCntInd(String value) {
        this.outCollateralTypeItemCntInd = value;
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
     * Gets the value of the outCollateralTypeRevaluationDtInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCollateralTypeRevaluationDtInd() {
        return outCollateralTypeRevaluationDtInd;
    }

    /**
     * Sets the value of the outCollateralTypeRevaluationDtInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCollateralTypeRevaluationDtInd(String value) {
        this.outCollateralTypeRevaluationDtInd = value;
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
     * Gets the value of the outCollateralTypeYieldPerc property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutCollateralTypeYieldPerc() {
        return outCollateralTypeYieldPerc;
    }

    /**
     * Sets the value of the outCollateralTypeYieldPerc property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutCollateralTypeYieldPerc(BigDecimal value) {
        this.outCollateralTypeYieldPerc = value;
    }

    /**
     * Gets the value of the outCollateralTypeProductDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCollateralTypeProductDescription() {
        return outCollateralTypeProductDescription;
    }

    /**
     * Sets the value of the outCollateralTypeProductDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCollateralTypeProductDescription(String value) {
        this.outCollateralTypeProductDescription = value;
    }

    /**
     * Gets the value of the outCollateralTypeProductIdProduct property.
     * 
     */
    public int getOutCollateralTypeProductIdProduct() {
        return outCollateralTypeProductIdProduct;
    }

    /**
     * Sets the value of the outCollateralTypeProductIdProduct property.
     * 
     */
    public void setOutCollateralTypeProductIdProduct(int value) {
        this.outCollateralTypeProductIdProduct = value;
    }

    /**
     * Gets the value of the outCollValueGenericDetailDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCollValueGenericDetailDescription() {
        return outCollValueGenericDetailDescription;
    }

    /**
     * Sets the value of the outCollValueGenericDetailDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCollValueGenericDetailDescription(String value) {
        this.outCollValueGenericDetailDescription = value;
    }

    /**
     * Gets the value of the outCollValueGenericDetailSerialNum property.
     * 
     */
    public int getOutCollValueGenericDetailSerialNum() {
        return outCollValueGenericDetailSerialNum;
    }

    /**
     * Sets the value of the outCollValueGenericDetailSerialNum property.
     * 
     */
    public void setOutCollValueGenericDetailSerialNum(int value) {
        this.outCollValueGenericDetailSerialNum = value;
    }

    /**
     * Gets the value of the outCurrencyIdCurrency property.
     * 
     */
    public int getOutCurrencyIdCurrency() {
        return outCurrencyIdCurrency;
    }

    /**
     * Sets the value of the outCurrencyIdCurrency property.
     * 
     */
    public void setOutCurrencyIdCurrency(int value) {
        this.outCurrencyIdCurrency = value;
    }

    /**
     * Gets the value of the outCurrencyShortDescr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCurrencyShortDescr() {
        return outCurrencyShortDescr;
    }

    /**
     * Sets the value of the outCurrencyShortDescr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCurrencyShortDescr(String value) {
        this.outCurrencyShortDescr = value;
    }

    /**
     * Gets the value of the outCustListSetDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCustListSetDescription() {
        return outCustListSetDescription;
    }

    /**
     * Sets the value of the outCustListSetDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCustListSetDescription(String value) {
        this.outCustListSetDescription = value;
    }

    /**
     * Gets the value of the outCustomerAlertMsg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCustomerAlertMsg() {
        return outCustomerAlertMsg;
    }

    /**
     * Sets the value of the outCustomerAlertMsg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCustomerAlertMsg(String value) {
        this.outCustomerAlertMsg = value;
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
     * Gets the value of the outCustomerCustStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCustomerCustStatus() {
        return outCustomerCustStatus;
    }

    /**
     * Sets the value of the outCustomerCustStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCustomerCustStatus(String value) {
        this.outCustomerCustStatus = value;
    }

    /**
     * Gets the value of the outCustomerCustType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCustomerCustType() {
        return outCustomerCustType;
    }

    /**
     * Sets the value of the outCustomerCustType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCustomerCustType(String value) {
        this.outCustomerCustType = value;
    }

    /**
     * Gets the value of the outCustomerShortName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCustomerShortName() {
        return outCustomerShortName;
    }

    /**
     * Sets the value of the outCustomerShortName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCustomerShortName(String value) {
        this.outCustomerShortName = value;
    }

    /**
     * Gets the value of the outEvalTeamInformationAuthorizationType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutEvalTeamInformationAuthorizationType() {
        return outEvalTeamInformationAuthorizationType;
    }

    /**
     * Sets the value of the outEvalTeamInformationAuthorizationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutEvalTeamInformationAuthorizationType(String value) {
        this.outEvalTeamInformationAuthorizationType = value;
    }

    /**
     * Gets the value of the outEvalTeamInformationEvaluationResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutEvalTeamInformationEvaluationResult() {
        return outEvalTeamInformationEvaluationResult;
    }

    /**
     * Sets the value of the outEvalTeamInformationEvaluationResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutEvalTeamInformationEvaluationResult(String value) {
        this.outEvalTeamInformationEvaluationResult = value;
    }

    /**
     * Gets the value of the outEvalTeamInformationRequiredProfile1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutEvalTeamInformationRequiredProfile1() {
        return outEvalTeamInformationRequiredProfile1;
    }

    /**
     * Sets the value of the outEvalTeamInformationRequiredProfile1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutEvalTeamInformationRequiredProfile1(String value) {
        this.outEvalTeamInformationRequiredProfile1 = value;
    }

    /**
     * Gets the value of the outEvalTeamInformationRequiredProfile2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutEvalTeamInformationRequiredProfile2() {
        return outEvalTeamInformationRequiredProfile2;
    }

    /**
     * Sets the value of the outEvalTeamInformationRequiredProfile2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutEvalTeamInformationRequiredProfile2(String value) {
        this.outEvalTeamInformationRequiredProfile2 = value;
    }

    /**
     * Gets the value of the outExistIefSuppliedFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutExistIefSuppliedFlag() {
        return outExistIefSuppliedFlag;
    }

    /**
     * Sets the value of the outExistIefSuppliedFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutExistIefSuppliedFlag(String value) {
        this.outExistIefSuppliedFlag = value;
    }

    /**
     * Gets the value of the outFixingRateRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutFixingRateRate() {
        return outFixingRateRate;
    }

    /**
     * Sets the value of the outFixingRateRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutFixingRateRate(BigDecimal value) {
        this.outFixingRateRate = value;
    }

    /**
     * Gets the value of the outFullCustNameListSetDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutFullCustNameListSetDescription() {
        return outFullCustNameListSetDescription;
    }

    /**
     * Sets the value of the outFullCustNameListSetDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutFullCustNameListSetDescription(String value) {
        this.outFullCustNameListSetDescription = value;
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
     * Gets the value of the outGrpAdviceDetailLength property.
     * 
     */
    public int getOutGrpAdviceDetailLength() {
        return outGrpAdviceDetailLength;
    }

    /**
     * Sets the value of the outGrpAdviceDetailLength property.
     * 
     */
    public void setOutGrpAdviceDetailLength(int value) {
        this.outGrpAdviceDetailLength = value;
    }

    /**
     * Gets the value of the outGrpAdviceTotalLength property.
     * 
     */
    public int getOutGrpAdviceTotalLength() {
        return outGrpAdviceTotalLength;
    }

    /**
     * Sets the value of the outGrpAdviceTotalLength property.
     * 
     */
    public void setOutGrpAdviceTotalLength(int value) {
        this.outGrpAdviceTotalLength = value;
    }

    /**
     * Gets the value of the outGrpSrvLogLength property.
     * 
     */
    public int getOutGrpSrvLogLength() {
        return outGrpSrvLogLength;
    }

    /**
     * Sets the value of the outGrpSrvLogLength property.
     * 
     */
    public void setOutGrpSrvLogLength(int value) {
        this.outGrpSrvLogLength = value;
    }

    /**
     * Gets the value of the outGrpUserTotalLength property.
     * 
     */
    public int getOutGrpUserTotalLength() {
        return outGrpUserTotalLength;
    }

    /**
     * Sets the value of the outGrpUserTotalLength property.
     * 
     */
    public void setOutGrpUserTotalLength(int value) {
        this.outGrpUserTotalLength = value;
    }

    /**
     * Gets the value of the outLandRegistryGenericDetailDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutLandRegistryGenericDetailDescription() {
        return outLandRegistryGenericDetailDescription;
    }

    /**
     * Sets the value of the outLandRegistryGenericDetailDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutLandRegistryGenericDetailDescription(String value) {
        this.outLandRegistryGenericDetailDescription = value;
    }

    /**
     * Gets the value of the outLandRegistryGenericDetailSerialNum property.
     * 
     */
    public int getOutLandRegistryGenericDetailSerialNum() {
        return outLandRegistryGenericDetailSerialNum;
    }

    /**
     * Sets the value of the outLandRegistryGenericDetailSerialNum property.
     * 
     */
    public void setOutLandRegistryGenericDetailSerialNum(int value) {
        this.outLandRegistryGenericDetailSerialNum = value;
    }

    /**
     * Gets the value of the outModifiedAccountCollateralAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutModifiedAccountCollateralAddress() {
        return outModifiedAccountCollateralAddress;
    }

    /**
     * Sets the value of the outModifiedAccountCollateralAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutModifiedAccountCollateralAddress(String value) {
        this.outModifiedAccountCollateralAddress = value;
    }

    /**
     * Gets the value of the outModifiedAccountCollateralEntryStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutModifiedAccountCollateralEntryStatus() {
        return outModifiedAccountCollateralEntryStatus;
    }

    /**
     * Sets the value of the outModifiedAccountCollateralEntryStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutModifiedAccountCollateralEntryStatus(String value) {
        this.outModifiedAccountCollateralEntryStatus = value;
    }

    /**
     * Gets the value of the outModifiedAccountCollateralFirstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutModifiedAccountCollateralFirstName() {
        return outModifiedAccountCollateralFirstName;
    }

    /**
     * Sets the value of the outModifiedAccountCollateralFirstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutModifiedAccountCollateralFirstName(String value) {
        this.outModifiedAccountCollateralFirstName = value;
    }

    /**
     * Gets the value of the outModifiedAccountCollateralInsertionDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutModifiedAccountCollateralInsertionDt() {
        return outModifiedAccountCollateralInsertionDt;
    }

    /**
     * Sets the value of the outModifiedAccountCollateralInsertionDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutModifiedAccountCollateralInsertionDt(XMLGregorianCalendar value) {
        this.outModifiedAccountCollateralInsertionDt = value;
    }

    /**
     * Gets the value of the outModifiedAccountCollateralInternalSn property.
     * 
     */
    public short getOutModifiedAccountCollateralInternalSn() {
        return outModifiedAccountCollateralInternalSn;
    }

    /**
     * Sets the value of the outModifiedAccountCollateralInternalSn property.
     * 
     */
    public void setOutModifiedAccountCollateralInternalSn(short value) {
        this.outModifiedAccountCollateralInternalSn = value;
    }

    /**
     * Gets the value of the outModifiedAccountCollateralSurname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutModifiedAccountCollateralSurname() {
        return outModifiedAccountCollateralSurname;
    }

    /**
     * Sets the value of the outModifiedAccountCollateralSurname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutModifiedAccountCollateralSurname(String value) {
        this.outModifiedAccountCollateralSurname = value;
    }

    /**
     * Gets the value of the outModifiedAccountCollateralTmstamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutModifiedAccountCollateralTmstamp() {
        return outModifiedAccountCollateralTmstamp;
    }

    /**
     * Sets the value of the outModifiedAccountCollateralTmstamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutModifiedAccountCollateralTmstamp(XMLGregorianCalendar value) {
        this.outModifiedAccountCollateralTmstamp = value;
    }

    /**
     * Gets the value of the outModifiedAccountCollateralUserCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutModifiedAccountCollateralUserCode() {
        return outModifiedAccountCollateralUserCode;
    }

    /**
     * Sets the value of the outModifiedAccountCollateralUserCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutModifiedAccountCollateralUserCode(String value) {
        this.outModifiedAccountCollateralUserCode = value;
    }

    /**
     * Gets the value of the outModifiedByUnitCode property.
     * 
     */
    public int getOutModifiedByUnitCode() {
        return outModifiedByUnitCode;
    }

    /**
     * Sets the value of the outModifiedByUnitCode property.
     * 
     */
    public void setOutModifiedByUnitCode(int value) {
        this.outModifiedByUnitCode = value;
    }

    /**
     * Gets the value of the outNewColltblCollateralTableInternalSn property.
     * 
     */
    public double getOutNewColltblCollateralTableInternalSn() {
        return outNewColltblCollateralTableInternalSn;
    }

    /**
     * Sets the value of the outNewColltblCollateralTableInternalSn property.
     * 
     */
    public void setOutNewColltblCollateralTableInternalSn(double value) {
        this.outNewColltblCollateralTableInternalSn = value;
    }

    /**
     * Gets the value of the outNewColltblCollateralTableRecordDescr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutNewColltblCollateralTableRecordDescr() {
        return outNewColltblCollateralTableRecordDescr;
    }

    /**
     * Sets the value of the outNewColltblCollateralTableRecordDescr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutNewColltblCollateralTableRecordDescr(String value) {
        this.outNewColltblCollateralTableRecordDescr = value;
    }

    /**
     * Gets the value of the outNewColltblCollateralTableRecordType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutNewColltblCollateralTableRecordType() {
        return outNewColltblCollateralTableRecordType;
    }

    /**
     * Sets the value of the outNewColltblCollateralTableRecordType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutNewColltblCollateralTableRecordType(String value) {
        this.outNewColltblCollateralTableRecordType = value;
    }

    /**
     * Gets the value of the outNewColltblCollateralTableTagSetCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutNewColltblCollateralTableTagSetCode() {
        return outNewColltblCollateralTableTagSetCode;
    }

    /**
     * Sets the value of the outNewColltblCollateralTableTagSetCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutNewColltblCollateralTableTagSetCode(String value) {
        this.outNewColltblCollateralTableTagSetCode = value;
    }

    /**
     * Gets the value of the outNewColltblCustomerCDigit property.
     * 
     */
    public short getOutNewColltblCustomerCDigit() {
        return outNewColltblCustomerCDigit;
    }

    /**
     * Sets the value of the outNewColltblCustomerCDigit property.
     * 
     */
    public void setOutNewColltblCustomerCDigit(short value) {
        this.outNewColltblCustomerCDigit = value;
    }

    /**
     * Gets the value of the outNewColltblCustomerCustId property.
     * 
     */
    public int getOutNewColltblCustomerCustId() {
        return outNewColltblCustomerCustId;
    }

    /**
     * Sets the value of the outNewColltblCustomerCustId property.
     * 
     */
    public void setOutNewColltblCustomerCustId(int value) {
        this.outNewColltblCustomerCustId = value;
    }

    /**
     * Gets the value of the outNewColltblListSetDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutNewColltblListSetDescription() {
        return outNewColltblListSetDescription;
    }

    /**
     * Sets the value of the outNewColltblListSetDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutNewColltblListSetDescription(String value) {
        this.outNewColltblListSetDescription = value;
    }

    /**
     * Gets the value of the outPercentageIefSuppliedPercentage property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutPercentageIefSuppliedPercentage() {
        return outPercentageIefSuppliedPercentage;
    }

    /**
     * Sets the value of the outPercentageIefSuppliedPercentage property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutPercentageIefSuppliedPercentage(BigDecimal value) {
        this.outPercentageIefSuppliedPercentage = value;
    }

    /**
     * Gets the value of the outPrftTransactionDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutPrftTransactionDescription() {
        return outPrftTransactionDescription;
    }

    /**
     * Sets the value of the outPrftTransactionDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutPrftTransactionDescription(String value) {
        this.outPrftTransactionDescription = value;
    }

    /**
     * Gets the value of the outPrftTransactionIdTransact property.
     * 
     */
    public int getOutPrftTransactionIdTransact() {
        return outPrftTransactionIdTransact;
    }

    /**
     * Sets the value of the outPrftTransactionIdTransact property.
     * 
     */
    public void setOutPrftTransactionIdTransact(int value) {
        this.outPrftTransactionIdTransact = value;
    }

    /**
     * Gets the value of the outPrintErrorMsgIefSuppliedFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutPrintErrorMsgIefSuppliedFlag() {
        return outPrintErrorMsgIefSuppliedFlag;
    }

    /**
     * Sets the value of the outPrintErrorMsgIefSuppliedFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutPrintErrorMsgIefSuppliedFlag(String value) {
        this.outPrintErrorMsgIefSuppliedFlag = value;
    }

    /**
     * Gets the value of the outRevaluationCurrCurrencyShortDescr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutRevaluationCurrCurrencyShortDescr() {
        return outRevaluationCurrCurrencyShortDescr;
    }

    /**
     * Sets the value of the outRevaluationCurrCurrencyShortDescr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutRevaluationCurrCurrencyShortDescr(String value) {
        this.outRevaluationCurrCurrencyShortDescr = value;
    }

    /**
     * Gets the value of the outTeamInformationAuthorizationType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutTeamInformationAuthorizationType() {
        return outTeamInformationAuthorizationType;
    }

    /**
     * Sets the value of the outTeamInformationAuthorizationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutTeamInformationAuthorizationType(String value) {
        this.outTeamInformationAuthorizationType = value;
    }

    /**
     * Gets the value of the outTeamInformationEvaluationResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutTeamInformationEvaluationResult() {
        return outTeamInformationEvaluationResult;
    }

    /**
     * Sets the value of the outTeamInformationEvaluationResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutTeamInformationEvaluationResult(String value) {
        this.outTeamInformationEvaluationResult = value;
    }

    /**
     * Gets the value of the outTeamInformationRequiredProfile1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutTeamInformationRequiredProfile1() {
        return outTeamInformationRequiredProfile1;
    }

    /**
     * Sets the value of the outTeamInformationRequiredProfile1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutTeamInformationRequiredProfile1(String value) {
        this.outTeamInformationRequiredProfile1 = value;
    }

    /**
     * Gets the value of the outTeamInformationRequiredProfile2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutTeamInformationRequiredProfile2() {
        return outTeamInformationRequiredProfile2;
    }

    /**
     * Sets the value of the outTeamInformationRequiredProfile2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutTeamInformationRequiredProfile2(String value) {
        this.outTeamInformationRequiredProfile2 = value;
    }

    /**
     * Gets the value of the outTmstampCollateralCbInsuranceAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutTmstampCollateralCbInsuranceAmn() {
        return outTmstampCollateralCbInsuranceAmn;
    }

    /**
     * Sets the value of the outTmstampCollateralCbInsuranceAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutTmstampCollateralCbInsuranceAmn(BigDecimal value) {
        this.outTmstampCollateralCbInsuranceAmn = value;
    }

    /**
     * Gets the value of the outTmstampCollateralColEstInsuranceAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutTmstampCollateralColEstInsuranceAmn() {
        return outTmstampCollateralColEstInsuranceAmn;
    }

    /**
     * Sets the value of the outTmstampCollateralColEstInsuranceAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutTmstampCollateralColEstInsuranceAmn(BigDecimal value) {
        this.outTmstampCollateralColEstInsuranceAmn = value;
    }

    /**
     * Gets the value of the outTmstampCollateralColEstValueAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutTmstampCollateralColEstValueAmn() {
        return outTmstampCollateralColEstValueAmn;
    }

    /**
     * Sets the value of the outTmstampCollateralColEstValueAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutTmstampCollateralColEstValueAmn(BigDecimal value) {
        this.outTmstampCollateralColEstValueAmn = value;
    }

    /**
     * Gets the value of the outTmstampCollateralItemsCnt property.
     * 
     */
    public int getOutTmstampCollateralItemsCnt() {
        return outTmstampCollateralItemsCnt;
    }

    /**
     * Sets the value of the outTmstampCollateralItemsCnt property.
     * 
     */
    public void setOutTmstampCollateralItemsCnt(int value) {
        this.outTmstampCollateralItemsCnt = value;
    }

    /**
     * Gets the value of the outTmstampCollateralTmstamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutTmstampCollateralTmstamp() {
        return outTmstampCollateralTmstamp;
    }

    /**
     * Sets the value of the outTmstampCollateralTmstamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutTmstampCollateralTmstamp(XMLGregorianCalendar value) {
        this.outTmstampCollateralTmstamp = value;
    }

    /**
     * Gets the value of the outTmstampCollateralUserCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutTmstampCollateralUserCode() {
        return outTmstampCollateralUserCode;
    }

    /**
     * Sets the value of the outTmstampCollateralUserCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutTmstampCollateralUserCode(String value) {
        this.outTmstampCollateralUserCode = value;
    }

    /**
     * Gets the value of the outTrxTrxCountAdvCounter property.
     * 
     */
    public int getOutTrxTrxCountAdvCounter() {
        return outTrxTrxCountAdvCounter;
    }

    /**
     * Sets the value of the outTrxTrxCountAdvCounter property.
     * 
     */
    public void setOutTrxTrxCountAdvCounter(int value) {
        this.outTrxTrxCountAdvCounter = value;
    }

    /**
     * Gets the value of the outTrxTrxCountTrxCounter property.
     * 
     */
    public int getOutTrxTrxCountTrxCounter() {
        return outTrxTrxCountTrxCounter;
    }

    /**
     * Sets the value of the outTrxTrxCountTrxCounter property.
     * 
     */
    public void setOutTrxTrxCountTrxCounter(int value) {
        this.outTrxTrxCountTrxCounter = value;
    }

    /**
     * Gets the value of the outVoucherLineParVoucherRunVoucherLine property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutVoucherLineParVoucherRunVoucherLine() {
        return outVoucherLineParVoucherRunVoucherLine;
    }

    /**
     * Sets the value of the outVoucherLineParVoucherRunVoucherLine property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutVoucherLineParVoucherRunVoucherLine(String value) {
        this.outVoucherLineParVoucherRunVoucherLine = value;
    }

    /**
     * Gets the value of the outCollatParametersBlockPerAccColl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCollatParametersBlockPerAccColl() {
        return outCollatParametersBlockPerAccColl;
    }

    /**
     * Sets the value of the outCollatParametersBlockPerAccColl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCollatParametersBlockPerAccColl(String value) {
        this.outCollatParametersBlockPerAccColl = value;
    }

    /**
     * Gets the value of the outCollatParametersAutoMarginProd property.
     * 
     */
    public int getOutCollatParametersAutoMarginProd() {
        return outCollatParametersAutoMarginProd;
    }

    /**
     * Sets the value of the outCollatParametersAutoMarginProd property.
     * 
     */
    public void setOutCollatParametersAutoMarginProd(int value) {
        this.outCollatParametersAutoMarginProd = value;
    }

    /**
     * Gets the value of the outCollatParametersDispFinMortgage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCollatParametersDispFinMortgage() {
        return outCollatParametersDispFinMortgage;
    }

    /**
     * Sets the value of the outCollatParametersDispFinMortgage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCollatParametersDispFinMortgage(String value) {
        this.outCollatParametersDispFinMortgage = value;
    }

    /**
     * Gets the value of the outGrp property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfOutGrpT }
     *     
     */
    public ArrayOfOutGrpT getOutGrp() {
        return outGrp;
    }

    /**
     * Sets the value of the outGrp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfOutGrpT }
     *     
     */
    public void setOutGrp(ArrayOfOutGrpT value) {
        this.outGrp = value;
    }

    /**
     * Gets the value of the outGrpAdviceDetail property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfOutGrpAdviceDetailT }
     *     
     */
    public ArrayOfOutGrpAdviceDetailT getOutGrpAdviceDetail() {
        return outGrpAdviceDetail;
    }

    /**
     * Sets the value of the outGrpAdviceDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfOutGrpAdviceDetailT }
     *     
     */
    public void setOutGrpAdviceDetail(ArrayOfOutGrpAdviceDetailT value) {
        this.outGrpAdviceDetail = value;
    }

    /**
     * Gets the value of the outGrpAdviceTotal property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfOutGrpAdviceTotalT }
     *     
     */
    public ArrayOfOutGrpAdviceTotalT getOutGrpAdviceTotal() {
        return outGrpAdviceTotal;
    }

    /**
     * Sets the value of the outGrpAdviceTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfOutGrpAdviceTotalT }
     *     
     */
    public void setOutGrpAdviceTotal(ArrayOfOutGrpAdviceTotalT value) {
        this.outGrpAdviceTotal = value;
    }

    /**
     * Gets the value of the outGrpSrvLog property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfOutGrpSrvLog }
     *     
     */
    public ArrayOfOutGrpSrvLog getOutGrpSrvLog() {
        return outGrpSrvLog;
    }

    /**
     * Sets the value of the outGrpSrvLog property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfOutGrpSrvLog }
     *     
     */
    public void setOutGrpSrvLog(ArrayOfOutGrpSrvLog value) {
        this.outGrpSrvLog = value;
    }

    /**
     * Gets the value of the outGrpUserTotal property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfOutGrpUserTotalT }
     *     
     */
    public ArrayOfOutGrpUserTotalT getOutGrpUserTotal() {
        return outGrpUserTotal;
    }

    /**
     * Sets the value of the outGrpUserTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfOutGrpUserTotalT }
     *     
     */
    public void setOutGrpUserTotal(ArrayOfOutGrpUserTotalT value) {
        this.outGrpUserTotal = value;
    }

}
