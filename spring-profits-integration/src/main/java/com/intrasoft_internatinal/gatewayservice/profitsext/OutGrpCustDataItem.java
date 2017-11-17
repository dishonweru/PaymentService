
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for OutGrpCustDataItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OutGrpCustDataItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OutGrpCustDataOutGrmCharIefSuppliedSelectChar" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpCustDataOutGrmLoanScenarioDataAccExpDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutGrpCustDataOutGrmLoanScenarioDataAccOpetDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutGrpCustDataOutGrmLoanScenarioDataCDigit" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutGrpCustDataOutGrmLoanScenarioDataCurrShortDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpCustDataOutGrmLoanScenarioDataCustId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGrpCustDataOutGrmLoanScenarioDataDrawdownAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpCustDataOutGrmLoanScenarioDataFixDurationUnit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpCustDataOutGrmLoanScenarioDataFixIndDuration" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutGrpCustDataOutGrmLoanScenarioDataFixedIntExpDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutGrpCustDataOutGrmLoanScenarioDataFixedIntId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGrpCustDataOutGrmLoanScenarioDataFixedIntPrc" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpCustDataOutGrmLoanScenarioDataFixedIntStDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutGrpCustDataOutGrmLoanScenarioDataFloatingIntId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGrpCustDataOutGrmLoanScenarioDataFloatingIntPrc" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpCustDataOutGrmLoanScenarioDataGracePdInstCnt" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OutGrpCustDataOutGrmLoanScenarioDataIdCurrency" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGrpCustDataOutGrmLoanScenarioDataInstFirstDrwDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutGrpCustDataOutGrmLoanScenarioDataInstFlexFixAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpCustDataOutGrmLoanScenarioDataInstFlexStabOmit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpCustDataOutGrmLoanScenarioDataInstFlexVarOmit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpCustDataOutGrmLoanScenarioDataInstall13thPay" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpCustDataOutGrmLoanScenarioDataInstallChgNum" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutGrpCustDataOutGrmLoanScenarioDataInstallDouble" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpCustDataOutGrmLoanScenarioDataInstallDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutGrpCustDataOutGrmLoanScenarioDataInstallFirstDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutGrpCustDataOutGrmLoanScenarioDataInstallFlexFix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpCustDataOutGrmLoanScenarioDataInstallNormal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpCustDataOutGrmLoanScenarioDataInstallOmit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpCustDataOutGrmLoanScenarioDataInstallSn" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OutGrpCustDataOutGrmLoanScenarioDataIntCapitalFlg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpCustDataOutGrmLoanScenarioDataIntPayableFlg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpCustDataOutGrmLoanScenarioDataLoanInstTotInt" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OutGrpCustDataOutGrmLoanScenarioDataLoanInstallCnt" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutGrpCustDataOutGrmLoanScenarioDataLoanInstallFreq" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutGrpCustDataOutGrmLoanScenarioDataMaintainEqInst" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpCustDataOutGrmLoanScenarioDataMoratIntPayFlg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpCustDataOutGrmLoanScenarioDataMoratorEndDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutGrpCustDataOutGrmLoanScenarioDataMoratorIntFrq" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutGrpCustDataOutGrmLoanScenarioDataN128IntId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGrpCustDataOutGrmLoanScenarioDataN128IntPrc" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpCustDataOutGrmLoanScenarioDataNonIntCapitFlg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpCustDataOutGrmLoanScenarioDataProductId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGrpCustDataOutGrmLoanScenarioDataSpreadIntPrc" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpCustDataOutGrmLoanScenarioDataSubsidyId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGrpCustDataOutGrmLoanScenarioDataSubsidyPrc" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpCustDataOutGrmLoanScenarioDataTmstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutGrpCustDataOutGrmLoanScenarioDataAgrAccountNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpCustDataOutGrmLoanScenarioDataAgrAccountCd" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutGrpCustDataOutGrmLoanScenarioDataDepAccountNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpCustDataOutGrmLoanScenarioDataDepAccountCd" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutGrpCustDataOutGrmLoanScenarioDataCustCatSn" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGrpCustDataOutGrmLoanScenarioDataTransactInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpCustDataOutGrmLoanScenarioDataTransactSm" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGrpCustDataOutGrmPrddescIefSuppliedString255" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpCustDataOutGrmLoanScenarioDataFinscSn" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGrpCustDataOutGrmLoanScenarioDataActscSn" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGrpCustDataOutGrmLoanScenarioDataLpurpSn" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGrpCustDataOutGrmLoanScenarioDataBsectSn" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGrpCustDataOutGrmLoanScenarioDataCbpurSn" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGrpCustDataOutGrmLoanScenarioDataStatementFreq" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpCustDataOutGrmLoanScenarioDataApplicationId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpCustDataOutGrmLoanScenarioDataApplicationSts" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpCustDataOutGrmFinalIefSuppliedChar2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpCustDataOutGrmLoanScenarioDataSaleUnitSn" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGrpCustDataOutGrmLoanScenarioDataSalePersonSn" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGrpCustDataOutGrmLoanScenarioDataPenaltyIntId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGrpCustDataOutGrmLoanScenarioDataPenaltyIntPrc" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpCustDataOutGrmLoanScenarioDataMoratIntAmortized" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OutGrpCustDataItem", propOrder = {
    "outGrpCustDataOutGrmCharIefSuppliedSelectChar",
    "outGrpCustDataOutGrmLoanScenarioDataAccExpDt",
    "outGrpCustDataOutGrmLoanScenarioDataAccOpetDt",
    "outGrpCustDataOutGrmLoanScenarioDataCDigit",
    "outGrpCustDataOutGrmLoanScenarioDataCurrShortDesc",
    "outGrpCustDataOutGrmLoanScenarioDataCustId",
    "outGrpCustDataOutGrmLoanScenarioDataDrawdownAmn",
    "outGrpCustDataOutGrmLoanScenarioDataFixDurationUnit",
    "outGrpCustDataOutGrmLoanScenarioDataFixIndDuration",
    "outGrpCustDataOutGrmLoanScenarioDataFixedIntExpDt",
    "outGrpCustDataOutGrmLoanScenarioDataFixedIntId",
    "outGrpCustDataOutGrmLoanScenarioDataFixedIntPrc",
    "outGrpCustDataOutGrmLoanScenarioDataFixedIntStDt",
    "outGrpCustDataOutGrmLoanScenarioDataFloatingIntId",
    "outGrpCustDataOutGrmLoanScenarioDataFloatingIntPrc",
    "outGrpCustDataOutGrmLoanScenarioDataGracePdInstCnt",
    "outGrpCustDataOutGrmLoanScenarioDataIdCurrency",
    "outGrpCustDataOutGrmLoanScenarioDataInstFirstDrwDt",
    "outGrpCustDataOutGrmLoanScenarioDataInstFlexFixAmn",
    "outGrpCustDataOutGrmLoanScenarioDataInstFlexStabOmit",
    "outGrpCustDataOutGrmLoanScenarioDataInstFlexVarOmit",
    "outGrpCustDataOutGrmLoanScenarioDataInstall13ThPay",
    "outGrpCustDataOutGrmLoanScenarioDataInstallChgNum",
    "outGrpCustDataOutGrmLoanScenarioDataInstallDouble",
    "outGrpCustDataOutGrmLoanScenarioDataInstallDt",
    "outGrpCustDataOutGrmLoanScenarioDataInstallFirstDt",
    "outGrpCustDataOutGrmLoanScenarioDataInstallFlexFix",
    "outGrpCustDataOutGrmLoanScenarioDataInstallNormal",
    "outGrpCustDataOutGrmLoanScenarioDataInstallOmit",
    "outGrpCustDataOutGrmLoanScenarioDataInstallSn",
    "outGrpCustDataOutGrmLoanScenarioDataIntCapitalFlg",
    "outGrpCustDataOutGrmLoanScenarioDataIntPayableFlg",
    "outGrpCustDataOutGrmLoanScenarioDataLoanInstTotInt",
    "outGrpCustDataOutGrmLoanScenarioDataLoanInstallCnt",
    "outGrpCustDataOutGrmLoanScenarioDataLoanInstallFreq",
    "outGrpCustDataOutGrmLoanScenarioDataMaintainEqInst",
    "outGrpCustDataOutGrmLoanScenarioDataMoratIntPayFlg",
    "outGrpCustDataOutGrmLoanScenarioDataMoratorEndDt",
    "outGrpCustDataOutGrmLoanScenarioDataMoratorIntFrq",
    "outGrpCustDataOutGrmLoanScenarioDataN128IntId",
    "outGrpCustDataOutGrmLoanScenarioDataN128IntPrc",
    "outGrpCustDataOutGrmLoanScenarioDataNonIntCapitFlg",
    "outGrpCustDataOutGrmLoanScenarioDataProductId",
    "outGrpCustDataOutGrmLoanScenarioDataSpreadIntPrc",
    "outGrpCustDataOutGrmLoanScenarioDataSubsidyId",
    "outGrpCustDataOutGrmLoanScenarioDataSubsidyPrc",
    "outGrpCustDataOutGrmLoanScenarioDataTmstamp",
    "outGrpCustDataOutGrmLoanScenarioDataAgrAccountNum",
    "outGrpCustDataOutGrmLoanScenarioDataAgrAccountCd",
    "outGrpCustDataOutGrmLoanScenarioDataDepAccountNum",
    "outGrpCustDataOutGrmLoanScenarioDataDepAccountCd",
    "outGrpCustDataOutGrmLoanScenarioDataCustCatSn",
    "outGrpCustDataOutGrmLoanScenarioDataTransactInd",
    "outGrpCustDataOutGrmLoanScenarioDataTransactSm",
    "outGrpCustDataOutGrmPrddescIefSuppliedString255",
    "outGrpCustDataOutGrmLoanScenarioDataFinscSn",
    "outGrpCustDataOutGrmLoanScenarioDataActscSn",
    "outGrpCustDataOutGrmLoanScenarioDataLpurpSn",
    "outGrpCustDataOutGrmLoanScenarioDataBsectSn",
    "outGrpCustDataOutGrmLoanScenarioDataCbpurSn",
    "outGrpCustDataOutGrmLoanScenarioDataStatementFreq",
    "outGrpCustDataOutGrmLoanScenarioDataApplicationId",
    "outGrpCustDataOutGrmLoanScenarioDataApplicationSts",
    "outGrpCustDataOutGrmFinalIefSuppliedChar2",
    "outGrpCustDataOutGrmLoanScenarioDataSaleUnitSn",
    "outGrpCustDataOutGrmLoanScenarioDataSalePersonSn",
    "outGrpCustDataOutGrmLoanScenarioDataPenaltyIntId",
    "outGrpCustDataOutGrmLoanScenarioDataPenaltyIntPrc",
    "outGrpCustDataOutGrmLoanScenarioDataMoratIntAmortized"
})
public class OutGrpCustDataItem {

    @XmlElement(name = "OutGrpCustDataOutGrmCharIefSuppliedSelectChar")
    protected String outGrpCustDataOutGrmCharIefSuppliedSelectChar;
    @XmlElement(name = "OutGrpCustDataOutGrmLoanScenarioDataAccExpDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outGrpCustDataOutGrmLoanScenarioDataAccExpDt;
    @XmlElement(name = "OutGrpCustDataOutGrmLoanScenarioDataAccOpetDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outGrpCustDataOutGrmLoanScenarioDataAccOpetDt;
    @XmlElement(name = "OutGrpCustDataOutGrmLoanScenarioDataCDigit")
    protected short outGrpCustDataOutGrmLoanScenarioDataCDigit;
    @XmlElement(name = "OutGrpCustDataOutGrmLoanScenarioDataCurrShortDesc")
    protected String outGrpCustDataOutGrmLoanScenarioDataCurrShortDesc;
    @XmlElement(name = "OutGrpCustDataOutGrmLoanScenarioDataCustId")
    protected int outGrpCustDataOutGrmLoanScenarioDataCustId;
    @XmlElement(name = "OutGrpCustDataOutGrmLoanScenarioDataDrawdownAmn", required = true)
    protected BigDecimal outGrpCustDataOutGrmLoanScenarioDataDrawdownAmn;
    @XmlElement(name = "OutGrpCustDataOutGrmLoanScenarioDataFixDurationUnit")
    protected String outGrpCustDataOutGrmLoanScenarioDataFixDurationUnit;
    @XmlElement(name = "OutGrpCustDataOutGrmLoanScenarioDataFixIndDuration")
    protected short outGrpCustDataOutGrmLoanScenarioDataFixIndDuration;
    @XmlElement(name = "OutGrpCustDataOutGrmLoanScenarioDataFixedIntExpDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outGrpCustDataOutGrmLoanScenarioDataFixedIntExpDt;
    @XmlElement(name = "OutGrpCustDataOutGrmLoanScenarioDataFixedIntId")
    protected int outGrpCustDataOutGrmLoanScenarioDataFixedIntId;
    @XmlElement(name = "OutGrpCustDataOutGrmLoanScenarioDataFixedIntPrc", required = true)
    protected BigDecimal outGrpCustDataOutGrmLoanScenarioDataFixedIntPrc;
    @XmlElement(name = "OutGrpCustDataOutGrmLoanScenarioDataFixedIntStDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outGrpCustDataOutGrmLoanScenarioDataFixedIntStDt;
    @XmlElement(name = "OutGrpCustDataOutGrmLoanScenarioDataFloatingIntId")
    protected int outGrpCustDataOutGrmLoanScenarioDataFloatingIntId;
    @XmlElement(name = "OutGrpCustDataOutGrmLoanScenarioDataFloatingIntPrc", required = true)
    protected BigDecimal outGrpCustDataOutGrmLoanScenarioDataFloatingIntPrc;
    @XmlElement(name = "OutGrpCustDataOutGrmLoanScenarioDataGracePdInstCnt")
    protected double outGrpCustDataOutGrmLoanScenarioDataGracePdInstCnt;
    @XmlElement(name = "OutGrpCustDataOutGrmLoanScenarioDataIdCurrency")
    protected int outGrpCustDataOutGrmLoanScenarioDataIdCurrency;
    @XmlElement(name = "OutGrpCustDataOutGrmLoanScenarioDataInstFirstDrwDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outGrpCustDataOutGrmLoanScenarioDataInstFirstDrwDt;
    @XmlElement(name = "OutGrpCustDataOutGrmLoanScenarioDataInstFlexFixAmn", required = true)
    protected BigDecimal outGrpCustDataOutGrmLoanScenarioDataInstFlexFixAmn;
    @XmlElement(name = "OutGrpCustDataOutGrmLoanScenarioDataInstFlexStabOmit")
    protected String outGrpCustDataOutGrmLoanScenarioDataInstFlexStabOmit;
    @XmlElement(name = "OutGrpCustDataOutGrmLoanScenarioDataInstFlexVarOmit")
    protected String outGrpCustDataOutGrmLoanScenarioDataInstFlexVarOmit;
    @XmlElement(name = "OutGrpCustDataOutGrmLoanScenarioDataInstall13thPay")
    protected String outGrpCustDataOutGrmLoanScenarioDataInstall13ThPay;
    @XmlElement(name = "OutGrpCustDataOutGrmLoanScenarioDataInstallChgNum")
    protected short outGrpCustDataOutGrmLoanScenarioDataInstallChgNum;
    @XmlElement(name = "OutGrpCustDataOutGrmLoanScenarioDataInstallDouble")
    protected String outGrpCustDataOutGrmLoanScenarioDataInstallDouble;
    @XmlElement(name = "OutGrpCustDataOutGrmLoanScenarioDataInstallDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outGrpCustDataOutGrmLoanScenarioDataInstallDt;
    @XmlElement(name = "OutGrpCustDataOutGrmLoanScenarioDataInstallFirstDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outGrpCustDataOutGrmLoanScenarioDataInstallFirstDt;
    @XmlElement(name = "OutGrpCustDataOutGrmLoanScenarioDataInstallFlexFix")
    protected String outGrpCustDataOutGrmLoanScenarioDataInstallFlexFix;
    @XmlElement(name = "OutGrpCustDataOutGrmLoanScenarioDataInstallNormal")
    protected String outGrpCustDataOutGrmLoanScenarioDataInstallNormal;
    @XmlElement(name = "OutGrpCustDataOutGrmLoanScenarioDataInstallOmit")
    protected String outGrpCustDataOutGrmLoanScenarioDataInstallOmit;
    @XmlElement(name = "OutGrpCustDataOutGrmLoanScenarioDataInstallSn")
    protected double outGrpCustDataOutGrmLoanScenarioDataInstallSn;
    @XmlElement(name = "OutGrpCustDataOutGrmLoanScenarioDataIntCapitalFlg")
    protected String outGrpCustDataOutGrmLoanScenarioDataIntCapitalFlg;
    @XmlElement(name = "OutGrpCustDataOutGrmLoanScenarioDataIntPayableFlg")
    protected String outGrpCustDataOutGrmLoanScenarioDataIntPayableFlg;
    @XmlElement(name = "OutGrpCustDataOutGrmLoanScenarioDataLoanInstTotInt")
    protected double outGrpCustDataOutGrmLoanScenarioDataLoanInstTotInt;
    @XmlElement(name = "OutGrpCustDataOutGrmLoanScenarioDataLoanInstallCnt")
    protected short outGrpCustDataOutGrmLoanScenarioDataLoanInstallCnt;
    @XmlElement(name = "OutGrpCustDataOutGrmLoanScenarioDataLoanInstallFreq")
    protected short outGrpCustDataOutGrmLoanScenarioDataLoanInstallFreq;
    @XmlElement(name = "OutGrpCustDataOutGrmLoanScenarioDataMaintainEqInst")
    protected String outGrpCustDataOutGrmLoanScenarioDataMaintainEqInst;
    @XmlElement(name = "OutGrpCustDataOutGrmLoanScenarioDataMoratIntPayFlg")
    protected String outGrpCustDataOutGrmLoanScenarioDataMoratIntPayFlg;
    @XmlElement(name = "OutGrpCustDataOutGrmLoanScenarioDataMoratorEndDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outGrpCustDataOutGrmLoanScenarioDataMoratorEndDt;
    @XmlElement(name = "OutGrpCustDataOutGrmLoanScenarioDataMoratorIntFrq")
    protected short outGrpCustDataOutGrmLoanScenarioDataMoratorIntFrq;
    @XmlElement(name = "OutGrpCustDataOutGrmLoanScenarioDataN128IntId")
    protected int outGrpCustDataOutGrmLoanScenarioDataN128IntId;
    @XmlElement(name = "OutGrpCustDataOutGrmLoanScenarioDataN128IntPrc", required = true)
    protected BigDecimal outGrpCustDataOutGrmLoanScenarioDataN128IntPrc;
    @XmlElement(name = "OutGrpCustDataOutGrmLoanScenarioDataNonIntCapitFlg")
    protected String outGrpCustDataOutGrmLoanScenarioDataNonIntCapitFlg;
    @XmlElement(name = "OutGrpCustDataOutGrmLoanScenarioDataProductId")
    protected int outGrpCustDataOutGrmLoanScenarioDataProductId;
    @XmlElement(name = "OutGrpCustDataOutGrmLoanScenarioDataSpreadIntPrc", required = true)
    protected BigDecimal outGrpCustDataOutGrmLoanScenarioDataSpreadIntPrc;
    @XmlElement(name = "OutGrpCustDataOutGrmLoanScenarioDataSubsidyId")
    protected int outGrpCustDataOutGrmLoanScenarioDataSubsidyId;
    @XmlElement(name = "OutGrpCustDataOutGrmLoanScenarioDataSubsidyPrc", required = true)
    protected BigDecimal outGrpCustDataOutGrmLoanScenarioDataSubsidyPrc;
    @XmlElement(name = "OutGrpCustDataOutGrmLoanScenarioDataTmstamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outGrpCustDataOutGrmLoanScenarioDataTmstamp;
    @XmlElement(name = "OutGrpCustDataOutGrmLoanScenarioDataAgrAccountNum")
    protected String outGrpCustDataOutGrmLoanScenarioDataAgrAccountNum;
    @XmlElement(name = "OutGrpCustDataOutGrmLoanScenarioDataAgrAccountCd")
    protected short outGrpCustDataOutGrmLoanScenarioDataAgrAccountCd;
    @XmlElement(name = "OutGrpCustDataOutGrmLoanScenarioDataDepAccountNum")
    protected String outGrpCustDataOutGrmLoanScenarioDataDepAccountNum;
    @XmlElement(name = "OutGrpCustDataOutGrmLoanScenarioDataDepAccountCd")
    protected short outGrpCustDataOutGrmLoanScenarioDataDepAccountCd;
    @XmlElement(name = "OutGrpCustDataOutGrmLoanScenarioDataCustCatSn")
    protected int outGrpCustDataOutGrmLoanScenarioDataCustCatSn;
    @XmlElement(name = "OutGrpCustDataOutGrmLoanScenarioDataTransactInd")
    protected String outGrpCustDataOutGrmLoanScenarioDataTransactInd;
    @XmlElement(name = "OutGrpCustDataOutGrmLoanScenarioDataTransactSm")
    protected int outGrpCustDataOutGrmLoanScenarioDataTransactSm;
    @XmlElement(name = "OutGrpCustDataOutGrmPrddescIefSuppliedString255")
    protected String outGrpCustDataOutGrmPrddescIefSuppliedString255;
    @XmlElement(name = "OutGrpCustDataOutGrmLoanScenarioDataFinscSn")
    protected int outGrpCustDataOutGrmLoanScenarioDataFinscSn;
    @XmlElement(name = "OutGrpCustDataOutGrmLoanScenarioDataActscSn")
    protected int outGrpCustDataOutGrmLoanScenarioDataActscSn;
    @XmlElement(name = "OutGrpCustDataOutGrmLoanScenarioDataLpurpSn")
    protected int outGrpCustDataOutGrmLoanScenarioDataLpurpSn;
    @XmlElement(name = "OutGrpCustDataOutGrmLoanScenarioDataBsectSn")
    protected int outGrpCustDataOutGrmLoanScenarioDataBsectSn;
    @XmlElement(name = "OutGrpCustDataOutGrmLoanScenarioDataCbpurSn")
    protected int outGrpCustDataOutGrmLoanScenarioDataCbpurSn;
    @XmlElement(name = "OutGrpCustDataOutGrmLoanScenarioDataStatementFreq")
    protected String outGrpCustDataOutGrmLoanScenarioDataStatementFreq;
    @XmlElement(name = "OutGrpCustDataOutGrmLoanScenarioDataApplicationId")
    protected String outGrpCustDataOutGrmLoanScenarioDataApplicationId;
    @XmlElement(name = "OutGrpCustDataOutGrmLoanScenarioDataApplicationSts")
    protected String outGrpCustDataOutGrmLoanScenarioDataApplicationSts;
    @XmlElement(name = "OutGrpCustDataOutGrmFinalIefSuppliedChar2")
    protected String outGrpCustDataOutGrmFinalIefSuppliedChar2;
    @XmlElement(name = "OutGrpCustDataOutGrmLoanScenarioDataSaleUnitSn")
    protected int outGrpCustDataOutGrmLoanScenarioDataSaleUnitSn;
    @XmlElement(name = "OutGrpCustDataOutGrmLoanScenarioDataSalePersonSn")
    protected int outGrpCustDataOutGrmLoanScenarioDataSalePersonSn;
    @XmlElement(name = "OutGrpCustDataOutGrmLoanScenarioDataPenaltyIntId")
    protected int outGrpCustDataOutGrmLoanScenarioDataPenaltyIntId;
    @XmlElement(name = "OutGrpCustDataOutGrmLoanScenarioDataPenaltyIntPrc", required = true)
    protected BigDecimal outGrpCustDataOutGrmLoanScenarioDataPenaltyIntPrc;
    @XmlElement(name = "OutGrpCustDataOutGrmLoanScenarioDataMoratIntAmortized")
    protected String outGrpCustDataOutGrmLoanScenarioDataMoratIntAmortized;

    /**
     * Gets the value of the outGrpCustDataOutGrmCharIefSuppliedSelectChar property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpCustDataOutGrmCharIefSuppliedSelectChar() {
        return outGrpCustDataOutGrmCharIefSuppliedSelectChar;
    }

    /**
     * Sets the value of the outGrpCustDataOutGrmCharIefSuppliedSelectChar property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpCustDataOutGrmCharIefSuppliedSelectChar(String value) {
        this.outGrpCustDataOutGrmCharIefSuppliedSelectChar = value;
    }

    /**
     * Gets the value of the outGrpCustDataOutGrmLoanScenarioDataAccExpDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutGrpCustDataOutGrmLoanScenarioDataAccExpDt() {
        return outGrpCustDataOutGrmLoanScenarioDataAccExpDt;
    }

    /**
     * Sets the value of the outGrpCustDataOutGrmLoanScenarioDataAccExpDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutGrpCustDataOutGrmLoanScenarioDataAccExpDt(XMLGregorianCalendar value) {
        this.outGrpCustDataOutGrmLoanScenarioDataAccExpDt = value;
    }

    /**
     * Gets the value of the outGrpCustDataOutGrmLoanScenarioDataAccOpetDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutGrpCustDataOutGrmLoanScenarioDataAccOpetDt() {
        return outGrpCustDataOutGrmLoanScenarioDataAccOpetDt;
    }

    /**
     * Sets the value of the outGrpCustDataOutGrmLoanScenarioDataAccOpetDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutGrpCustDataOutGrmLoanScenarioDataAccOpetDt(XMLGregorianCalendar value) {
        this.outGrpCustDataOutGrmLoanScenarioDataAccOpetDt = value;
    }

    /**
     * Gets the value of the outGrpCustDataOutGrmLoanScenarioDataCDigit property.
     * 
     */
    public short getOutGrpCustDataOutGrmLoanScenarioDataCDigit() {
        return outGrpCustDataOutGrmLoanScenarioDataCDigit;
    }

    /**
     * Sets the value of the outGrpCustDataOutGrmLoanScenarioDataCDigit property.
     * 
     */
    public void setOutGrpCustDataOutGrmLoanScenarioDataCDigit(short value) {
        this.outGrpCustDataOutGrmLoanScenarioDataCDigit = value;
    }

    /**
     * Gets the value of the outGrpCustDataOutGrmLoanScenarioDataCurrShortDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpCustDataOutGrmLoanScenarioDataCurrShortDesc() {
        return outGrpCustDataOutGrmLoanScenarioDataCurrShortDesc;
    }

    /**
     * Sets the value of the outGrpCustDataOutGrmLoanScenarioDataCurrShortDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpCustDataOutGrmLoanScenarioDataCurrShortDesc(String value) {
        this.outGrpCustDataOutGrmLoanScenarioDataCurrShortDesc = value;
    }

    /**
     * Gets the value of the outGrpCustDataOutGrmLoanScenarioDataCustId property.
     * 
     */
    public int getOutGrpCustDataOutGrmLoanScenarioDataCustId() {
        return outGrpCustDataOutGrmLoanScenarioDataCustId;
    }

    /**
     * Sets the value of the outGrpCustDataOutGrmLoanScenarioDataCustId property.
     * 
     */
    public void setOutGrpCustDataOutGrmLoanScenarioDataCustId(int value) {
        this.outGrpCustDataOutGrmLoanScenarioDataCustId = value;
    }

    /**
     * Gets the value of the outGrpCustDataOutGrmLoanScenarioDataDrawdownAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpCustDataOutGrmLoanScenarioDataDrawdownAmn() {
        return outGrpCustDataOutGrmLoanScenarioDataDrawdownAmn;
    }

    /**
     * Sets the value of the outGrpCustDataOutGrmLoanScenarioDataDrawdownAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpCustDataOutGrmLoanScenarioDataDrawdownAmn(BigDecimal value) {
        this.outGrpCustDataOutGrmLoanScenarioDataDrawdownAmn = value;
    }

    /**
     * Gets the value of the outGrpCustDataOutGrmLoanScenarioDataFixDurationUnit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpCustDataOutGrmLoanScenarioDataFixDurationUnit() {
        return outGrpCustDataOutGrmLoanScenarioDataFixDurationUnit;
    }

    /**
     * Sets the value of the outGrpCustDataOutGrmLoanScenarioDataFixDurationUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpCustDataOutGrmLoanScenarioDataFixDurationUnit(String value) {
        this.outGrpCustDataOutGrmLoanScenarioDataFixDurationUnit = value;
    }

    /**
     * Gets the value of the outGrpCustDataOutGrmLoanScenarioDataFixIndDuration property.
     * 
     */
    public short getOutGrpCustDataOutGrmLoanScenarioDataFixIndDuration() {
        return outGrpCustDataOutGrmLoanScenarioDataFixIndDuration;
    }

    /**
     * Sets the value of the outGrpCustDataOutGrmLoanScenarioDataFixIndDuration property.
     * 
     */
    public void setOutGrpCustDataOutGrmLoanScenarioDataFixIndDuration(short value) {
        this.outGrpCustDataOutGrmLoanScenarioDataFixIndDuration = value;
    }

    /**
     * Gets the value of the outGrpCustDataOutGrmLoanScenarioDataFixedIntExpDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutGrpCustDataOutGrmLoanScenarioDataFixedIntExpDt() {
        return outGrpCustDataOutGrmLoanScenarioDataFixedIntExpDt;
    }

    /**
     * Sets the value of the outGrpCustDataOutGrmLoanScenarioDataFixedIntExpDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutGrpCustDataOutGrmLoanScenarioDataFixedIntExpDt(XMLGregorianCalendar value) {
        this.outGrpCustDataOutGrmLoanScenarioDataFixedIntExpDt = value;
    }

    /**
     * Gets the value of the outGrpCustDataOutGrmLoanScenarioDataFixedIntId property.
     * 
     */
    public int getOutGrpCustDataOutGrmLoanScenarioDataFixedIntId() {
        return outGrpCustDataOutGrmLoanScenarioDataFixedIntId;
    }

    /**
     * Sets the value of the outGrpCustDataOutGrmLoanScenarioDataFixedIntId property.
     * 
     */
    public void setOutGrpCustDataOutGrmLoanScenarioDataFixedIntId(int value) {
        this.outGrpCustDataOutGrmLoanScenarioDataFixedIntId = value;
    }

    /**
     * Gets the value of the outGrpCustDataOutGrmLoanScenarioDataFixedIntPrc property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpCustDataOutGrmLoanScenarioDataFixedIntPrc() {
        return outGrpCustDataOutGrmLoanScenarioDataFixedIntPrc;
    }

    /**
     * Sets the value of the outGrpCustDataOutGrmLoanScenarioDataFixedIntPrc property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpCustDataOutGrmLoanScenarioDataFixedIntPrc(BigDecimal value) {
        this.outGrpCustDataOutGrmLoanScenarioDataFixedIntPrc = value;
    }

    /**
     * Gets the value of the outGrpCustDataOutGrmLoanScenarioDataFixedIntStDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutGrpCustDataOutGrmLoanScenarioDataFixedIntStDt() {
        return outGrpCustDataOutGrmLoanScenarioDataFixedIntStDt;
    }

    /**
     * Sets the value of the outGrpCustDataOutGrmLoanScenarioDataFixedIntStDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutGrpCustDataOutGrmLoanScenarioDataFixedIntStDt(XMLGregorianCalendar value) {
        this.outGrpCustDataOutGrmLoanScenarioDataFixedIntStDt = value;
    }

    /**
     * Gets the value of the outGrpCustDataOutGrmLoanScenarioDataFloatingIntId property.
     * 
     */
    public int getOutGrpCustDataOutGrmLoanScenarioDataFloatingIntId() {
        return outGrpCustDataOutGrmLoanScenarioDataFloatingIntId;
    }

    /**
     * Sets the value of the outGrpCustDataOutGrmLoanScenarioDataFloatingIntId property.
     * 
     */
    public void setOutGrpCustDataOutGrmLoanScenarioDataFloatingIntId(int value) {
        this.outGrpCustDataOutGrmLoanScenarioDataFloatingIntId = value;
    }

    /**
     * Gets the value of the outGrpCustDataOutGrmLoanScenarioDataFloatingIntPrc property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpCustDataOutGrmLoanScenarioDataFloatingIntPrc() {
        return outGrpCustDataOutGrmLoanScenarioDataFloatingIntPrc;
    }

    /**
     * Sets the value of the outGrpCustDataOutGrmLoanScenarioDataFloatingIntPrc property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpCustDataOutGrmLoanScenarioDataFloatingIntPrc(BigDecimal value) {
        this.outGrpCustDataOutGrmLoanScenarioDataFloatingIntPrc = value;
    }

    /**
     * Gets the value of the outGrpCustDataOutGrmLoanScenarioDataGracePdInstCnt property.
     * 
     */
    public double getOutGrpCustDataOutGrmLoanScenarioDataGracePdInstCnt() {
        return outGrpCustDataOutGrmLoanScenarioDataGracePdInstCnt;
    }

    /**
     * Sets the value of the outGrpCustDataOutGrmLoanScenarioDataGracePdInstCnt property.
     * 
     */
    public void setOutGrpCustDataOutGrmLoanScenarioDataGracePdInstCnt(double value) {
        this.outGrpCustDataOutGrmLoanScenarioDataGracePdInstCnt = value;
    }

    /**
     * Gets the value of the outGrpCustDataOutGrmLoanScenarioDataIdCurrency property.
     * 
     */
    public int getOutGrpCustDataOutGrmLoanScenarioDataIdCurrency() {
        return outGrpCustDataOutGrmLoanScenarioDataIdCurrency;
    }

    /**
     * Sets the value of the outGrpCustDataOutGrmLoanScenarioDataIdCurrency property.
     * 
     */
    public void setOutGrpCustDataOutGrmLoanScenarioDataIdCurrency(int value) {
        this.outGrpCustDataOutGrmLoanScenarioDataIdCurrency = value;
    }

    /**
     * Gets the value of the outGrpCustDataOutGrmLoanScenarioDataInstFirstDrwDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutGrpCustDataOutGrmLoanScenarioDataInstFirstDrwDt() {
        return outGrpCustDataOutGrmLoanScenarioDataInstFirstDrwDt;
    }

    /**
     * Sets the value of the outGrpCustDataOutGrmLoanScenarioDataInstFirstDrwDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutGrpCustDataOutGrmLoanScenarioDataInstFirstDrwDt(XMLGregorianCalendar value) {
        this.outGrpCustDataOutGrmLoanScenarioDataInstFirstDrwDt = value;
    }

    /**
     * Gets the value of the outGrpCustDataOutGrmLoanScenarioDataInstFlexFixAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpCustDataOutGrmLoanScenarioDataInstFlexFixAmn() {
        return outGrpCustDataOutGrmLoanScenarioDataInstFlexFixAmn;
    }

    /**
     * Sets the value of the outGrpCustDataOutGrmLoanScenarioDataInstFlexFixAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpCustDataOutGrmLoanScenarioDataInstFlexFixAmn(BigDecimal value) {
        this.outGrpCustDataOutGrmLoanScenarioDataInstFlexFixAmn = value;
    }

    /**
     * Gets the value of the outGrpCustDataOutGrmLoanScenarioDataInstFlexStabOmit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpCustDataOutGrmLoanScenarioDataInstFlexStabOmit() {
        return outGrpCustDataOutGrmLoanScenarioDataInstFlexStabOmit;
    }

    /**
     * Sets the value of the outGrpCustDataOutGrmLoanScenarioDataInstFlexStabOmit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpCustDataOutGrmLoanScenarioDataInstFlexStabOmit(String value) {
        this.outGrpCustDataOutGrmLoanScenarioDataInstFlexStabOmit = value;
    }

    /**
     * Gets the value of the outGrpCustDataOutGrmLoanScenarioDataInstFlexVarOmit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpCustDataOutGrmLoanScenarioDataInstFlexVarOmit() {
        return outGrpCustDataOutGrmLoanScenarioDataInstFlexVarOmit;
    }

    /**
     * Sets the value of the outGrpCustDataOutGrmLoanScenarioDataInstFlexVarOmit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpCustDataOutGrmLoanScenarioDataInstFlexVarOmit(String value) {
        this.outGrpCustDataOutGrmLoanScenarioDataInstFlexVarOmit = value;
    }

    /**
     * Gets the value of the outGrpCustDataOutGrmLoanScenarioDataInstall13ThPay property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpCustDataOutGrmLoanScenarioDataInstall13ThPay() {
        return outGrpCustDataOutGrmLoanScenarioDataInstall13ThPay;
    }

    /**
     * Sets the value of the outGrpCustDataOutGrmLoanScenarioDataInstall13ThPay property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpCustDataOutGrmLoanScenarioDataInstall13ThPay(String value) {
        this.outGrpCustDataOutGrmLoanScenarioDataInstall13ThPay = value;
    }

    /**
     * Gets the value of the outGrpCustDataOutGrmLoanScenarioDataInstallChgNum property.
     * 
     */
    public short getOutGrpCustDataOutGrmLoanScenarioDataInstallChgNum() {
        return outGrpCustDataOutGrmLoanScenarioDataInstallChgNum;
    }

    /**
     * Sets the value of the outGrpCustDataOutGrmLoanScenarioDataInstallChgNum property.
     * 
     */
    public void setOutGrpCustDataOutGrmLoanScenarioDataInstallChgNum(short value) {
        this.outGrpCustDataOutGrmLoanScenarioDataInstallChgNum = value;
    }

    /**
     * Gets the value of the outGrpCustDataOutGrmLoanScenarioDataInstallDouble property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpCustDataOutGrmLoanScenarioDataInstallDouble() {
        return outGrpCustDataOutGrmLoanScenarioDataInstallDouble;
    }

    /**
     * Sets the value of the outGrpCustDataOutGrmLoanScenarioDataInstallDouble property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpCustDataOutGrmLoanScenarioDataInstallDouble(String value) {
        this.outGrpCustDataOutGrmLoanScenarioDataInstallDouble = value;
    }

    /**
     * Gets the value of the outGrpCustDataOutGrmLoanScenarioDataInstallDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutGrpCustDataOutGrmLoanScenarioDataInstallDt() {
        return outGrpCustDataOutGrmLoanScenarioDataInstallDt;
    }

    /**
     * Sets the value of the outGrpCustDataOutGrmLoanScenarioDataInstallDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutGrpCustDataOutGrmLoanScenarioDataInstallDt(XMLGregorianCalendar value) {
        this.outGrpCustDataOutGrmLoanScenarioDataInstallDt = value;
    }

    /**
     * Gets the value of the outGrpCustDataOutGrmLoanScenarioDataInstallFirstDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutGrpCustDataOutGrmLoanScenarioDataInstallFirstDt() {
        return outGrpCustDataOutGrmLoanScenarioDataInstallFirstDt;
    }

    /**
     * Sets the value of the outGrpCustDataOutGrmLoanScenarioDataInstallFirstDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutGrpCustDataOutGrmLoanScenarioDataInstallFirstDt(XMLGregorianCalendar value) {
        this.outGrpCustDataOutGrmLoanScenarioDataInstallFirstDt = value;
    }

    /**
     * Gets the value of the outGrpCustDataOutGrmLoanScenarioDataInstallFlexFix property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpCustDataOutGrmLoanScenarioDataInstallFlexFix() {
        return outGrpCustDataOutGrmLoanScenarioDataInstallFlexFix;
    }

    /**
     * Sets the value of the outGrpCustDataOutGrmLoanScenarioDataInstallFlexFix property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpCustDataOutGrmLoanScenarioDataInstallFlexFix(String value) {
        this.outGrpCustDataOutGrmLoanScenarioDataInstallFlexFix = value;
    }

    /**
     * Gets the value of the outGrpCustDataOutGrmLoanScenarioDataInstallNormal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpCustDataOutGrmLoanScenarioDataInstallNormal() {
        return outGrpCustDataOutGrmLoanScenarioDataInstallNormal;
    }

    /**
     * Sets the value of the outGrpCustDataOutGrmLoanScenarioDataInstallNormal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpCustDataOutGrmLoanScenarioDataInstallNormal(String value) {
        this.outGrpCustDataOutGrmLoanScenarioDataInstallNormal = value;
    }

    /**
     * Gets the value of the outGrpCustDataOutGrmLoanScenarioDataInstallOmit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpCustDataOutGrmLoanScenarioDataInstallOmit() {
        return outGrpCustDataOutGrmLoanScenarioDataInstallOmit;
    }

    /**
     * Sets the value of the outGrpCustDataOutGrmLoanScenarioDataInstallOmit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpCustDataOutGrmLoanScenarioDataInstallOmit(String value) {
        this.outGrpCustDataOutGrmLoanScenarioDataInstallOmit = value;
    }

    /**
     * Gets the value of the outGrpCustDataOutGrmLoanScenarioDataInstallSn property.
     * 
     */
    public double getOutGrpCustDataOutGrmLoanScenarioDataInstallSn() {
        return outGrpCustDataOutGrmLoanScenarioDataInstallSn;
    }

    /**
     * Sets the value of the outGrpCustDataOutGrmLoanScenarioDataInstallSn property.
     * 
     */
    public void setOutGrpCustDataOutGrmLoanScenarioDataInstallSn(double value) {
        this.outGrpCustDataOutGrmLoanScenarioDataInstallSn = value;
    }

    /**
     * Gets the value of the outGrpCustDataOutGrmLoanScenarioDataIntCapitalFlg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpCustDataOutGrmLoanScenarioDataIntCapitalFlg() {
        return outGrpCustDataOutGrmLoanScenarioDataIntCapitalFlg;
    }

    /**
     * Sets the value of the outGrpCustDataOutGrmLoanScenarioDataIntCapitalFlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpCustDataOutGrmLoanScenarioDataIntCapitalFlg(String value) {
        this.outGrpCustDataOutGrmLoanScenarioDataIntCapitalFlg = value;
    }

    /**
     * Gets the value of the outGrpCustDataOutGrmLoanScenarioDataIntPayableFlg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpCustDataOutGrmLoanScenarioDataIntPayableFlg() {
        return outGrpCustDataOutGrmLoanScenarioDataIntPayableFlg;
    }

    /**
     * Sets the value of the outGrpCustDataOutGrmLoanScenarioDataIntPayableFlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpCustDataOutGrmLoanScenarioDataIntPayableFlg(String value) {
        this.outGrpCustDataOutGrmLoanScenarioDataIntPayableFlg = value;
    }

    /**
     * Gets the value of the outGrpCustDataOutGrmLoanScenarioDataLoanInstTotInt property.
     * 
     */
    public double getOutGrpCustDataOutGrmLoanScenarioDataLoanInstTotInt() {
        return outGrpCustDataOutGrmLoanScenarioDataLoanInstTotInt;
    }

    /**
     * Sets the value of the outGrpCustDataOutGrmLoanScenarioDataLoanInstTotInt property.
     * 
     */
    public void setOutGrpCustDataOutGrmLoanScenarioDataLoanInstTotInt(double value) {
        this.outGrpCustDataOutGrmLoanScenarioDataLoanInstTotInt = value;
    }

    /**
     * Gets the value of the outGrpCustDataOutGrmLoanScenarioDataLoanInstallCnt property.
     * 
     */
    public short getOutGrpCustDataOutGrmLoanScenarioDataLoanInstallCnt() {
        return outGrpCustDataOutGrmLoanScenarioDataLoanInstallCnt;
    }

    /**
     * Sets the value of the outGrpCustDataOutGrmLoanScenarioDataLoanInstallCnt property.
     * 
     */
    public void setOutGrpCustDataOutGrmLoanScenarioDataLoanInstallCnt(short value) {
        this.outGrpCustDataOutGrmLoanScenarioDataLoanInstallCnt = value;
    }

    /**
     * Gets the value of the outGrpCustDataOutGrmLoanScenarioDataLoanInstallFreq property.
     * 
     */
    public short getOutGrpCustDataOutGrmLoanScenarioDataLoanInstallFreq() {
        return outGrpCustDataOutGrmLoanScenarioDataLoanInstallFreq;
    }

    /**
     * Sets the value of the outGrpCustDataOutGrmLoanScenarioDataLoanInstallFreq property.
     * 
     */
    public void setOutGrpCustDataOutGrmLoanScenarioDataLoanInstallFreq(short value) {
        this.outGrpCustDataOutGrmLoanScenarioDataLoanInstallFreq = value;
    }

    /**
     * Gets the value of the outGrpCustDataOutGrmLoanScenarioDataMaintainEqInst property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpCustDataOutGrmLoanScenarioDataMaintainEqInst() {
        return outGrpCustDataOutGrmLoanScenarioDataMaintainEqInst;
    }

    /**
     * Sets the value of the outGrpCustDataOutGrmLoanScenarioDataMaintainEqInst property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpCustDataOutGrmLoanScenarioDataMaintainEqInst(String value) {
        this.outGrpCustDataOutGrmLoanScenarioDataMaintainEqInst = value;
    }

    /**
     * Gets the value of the outGrpCustDataOutGrmLoanScenarioDataMoratIntPayFlg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpCustDataOutGrmLoanScenarioDataMoratIntPayFlg() {
        return outGrpCustDataOutGrmLoanScenarioDataMoratIntPayFlg;
    }

    /**
     * Sets the value of the outGrpCustDataOutGrmLoanScenarioDataMoratIntPayFlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpCustDataOutGrmLoanScenarioDataMoratIntPayFlg(String value) {
        this.outGrpCustDataOutGrmLoanScenarioDataMoratIntPayFlg = value;
    }

    /**
     * Gets the value of the outGrpCustDataOutGrmLoanScenarioDataMoratorEndDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutGrpCustDataOutGrmLoanScenarioDataMoratorEndDt() {
        return outGrpCustDataOutGrmLoanScenarioDataMoratorEndDt;
    }

    /**
     * Sets the value of the outGrpCustDataOutGrmLoanScenarioDataMoratorEndDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutGrpCustDataOutGrmLoanScenarioDataMoratorEndDt(XMLGregorianCalendar value) {
        this.outGrpCustDataOutGrmLoanScenarioDataMoratorEndDt = value;
    }

    /**
     * Gets the value of the outGrpCustDataOutGrmLoanScenarioDataMoratorIntFrq property.
     * 
     */
    public short getOutGrpCustDataOutGrmLoanScenarioDataMoratorIntFrq() {
        return outGrpCustDataOutGrmLoanScenarioDataMoratorIntFrq;
    }

    /**
     * Sets the value of the outGrpCustDataOutGrmLoanScenarioDataMoratorIntFrq property.
     * 
     */
    public void setOutGrpCustDataOutGrmLoanScenarioDataMoratorIntFrq(short value) {
        this.outGrpCustDataOutGrmLoanScenarioDataMoratorIntFrq = value;
    }

    /**
     * Gets the value of the outGrpCustDataOutGrmLoanScenarioDataN128IntId property.
     * 
     */
    public int getOutGrpCustDataOutGrmLoanScenarioDataN128IntId() {
        return outGrpCustDataOutGrmLoanScenarioDataN128IntId;
    }

    /**
     * Sets the value of the outGrpCustDataOutGrmLoanScenarioDataN128IntId property.
     * 
     */
    public void setOutGrpCustDataOutGrmLoanScenarioDataN128IntId(int value) {
        this.outGrpCustDataOutGrmLoanScenarioDataN128IntId = value;
    }

    /**
     * Gets the value of the outGrpCustDataOutGrmLoanScenarioDataN128IntPrc property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpCustDataOutGrmLoanScenarioDataN128IntPrc() {
        return outGrpCustDataOutGrmLoanScenarioDataN128IntPrc;
    }

    /**
     * Sets the value of the outGrpCustDataOutGrmLoanScenarioDataN128IntPrc property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpCustDataOutGrmLoanScenarioDataN128IntPrc(BigDecimal value) {
        this.outGrpCustDataOutGrmLoanScenarioDataN128IntPrc = value;
    }

    /**
     * Gets the value of the outGrpCustDataOutGrmLoanScenarioDataNonIntCapitFlg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpCustDataOutGrmLoanScenarioDataNonIntCapitFlg() {
        return outGrpCustDataOutGrmLoanScenarioDataNonIntCapitFlg;
    }

    /**
     * Sets the value of the outGrpCustDataOutGrmLoanScenarioDataNonIntCapitFlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpCustDataOutGrmLoanScenarioDataNonIntCapitFlg(String value) {
        this.outGrpCustDataOutGrmLoanScenarioDataNonIntCapitFlg = value;
    }

    /**
     * Gets the value of the outGrpCustDataOutGrmLoanScenarioDataProductId property.
     * 
     */
    public int getOutGrpCustDataOutGrmLoanScenarioDataProductId() {
        return outGrpCustDataOutGrmLoanScenarioDataProductId;
    }

    /**
     * Sets the value of the outGrpCustDataOutGrmLoanScenarioDataProductId property.
     * 
     */
    public void setOutGrpCustDataOutGrmLoanScenarioDataProductId(int value) {
        this.outGrpCustDataOutGrmLoanScenarioDataProductId = value;
    }

    /**
     * Gets the value of the outGrpCustDataOutGrmLoanScenarioDataSpreadIntPrc property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpCustDataOutGrmLoanScenarioDataSpreadIntPrc() {
        return outGrpCustDataOutGrmLoanScenarioDataSpreadIntPrc;
    }

    /**
     * Sets the value of the outGrpCustDataOutGrmLoanScenarioDataSpreadIntPrc property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpCustDataOutGrmLoanScenarioDataSpreadIntPrc(BigDecimal value) {
        this.outGrpCustDataOutGrmLoanScenarioDataSpreadIntPrc = value;
    }

    /**
     * Gets the value of the outGrpCustDataOutGrmLoanScenarioDataSubsidyId property.
     * 
     */
    public int getOutGrpCustDataOutGrmLoanScenarioDataSubsidyId() {
        return outGrpCustDataOutGrmLoanScenarioDataSubsidyId;
    }

    /**
     * Sets the value of the outGrpCustDataOutGrmLoanScenarioDataSubsidyId property.
     * 
     */
    public void setOutGrpCustDataOutGrmLoanScenarioDataSubsidyId(int value) {
        this.outGrpCustDataOutGrmLoanScenarioDataSubsidyId = value;
    }

    /**
     * Gets the value of the outGrpCustDataOutGrmLoanScenarioDataSubsidyPrc property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpCustDataOutGrmLoanScenarioDataSubsidyPrc() {
        return outGrpCustDataOutGrmLoanScenarioDataSubsidyPrc;
    }

    /**
     * Sets the value of the outGrpCustDataOutGrmLoanScenarioDataSubsidyPrc property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpCustDataOutGrmLoanScenarioDataSubsidyPrc(BigDecimal value) {
        this.outGrpCustDataOutGrmLoanScenarioDataSubsidyPrc = value;
    }

    /**
     * Gets the value of the outGrpCustDataOutGrmLoanScenarioDataTmstamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutGrpCustDataOutGrmLoanScenarioDataTmstamp() {
        return outGrpCustDataOutGrmLoanScenarioDataTmstamp;
    }

    /**
     * Sets the value of the outGrpCustDataOutGrmLoanScenarioDataTmstamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutGrpCustDataOutGrmLoanScenarioDataTmstamp(XMLGregorianCalendar value) {
        this.outGrpCustDataOutGrmLoanScenarioDataTmstamp = value;
    }

    /**
     * Gets the value of the outGrpCustDataOutGrmLoanScenarioDataAgrAccountNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpCustDataOutGrmLoanScenarioDataAgrAccountNum() {
        return outGrpCustDataOutGrmLoanScenarioDataAgrAccountNum;
    }

    /**
     * Sets the value of the outGrpCustDataOutGrmLoanScenarioDataAgrAccountNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpCustDataOutGrmLoanScenarioDataAgrAccountNum(String value) {
        this.outGrpCustDataOutGrmLoanScenarioDataAgrAccountNum = value;
    }

    /**
     * Gets the value of the outGrpCustDataOutGrmLoanScenarioDataAgrAccountCd property.
     * 
     */
    public short getOutGrpCustDataOutGrmLoanScenarioDataAgrAccountCd() {
        return outGrpCustDataOutGrmLoanScenarioDataAgrAccountCd;
    }

    /**
     * Sets the value of the outGrpCustDataOutGrmLoanScenarioDataAgrAccountCd property.
     * 
     */
    public void setOutGrpCustDataOutGrmLoanScenarioDataAgrAccountCd(short value) {
        this.outGrpCustDataOutGrmLoanScenarioDataAgrAccountCd = value;
    }

    /**
     * Gets the value of the outGrpCustDataOutGrmLoanScenarioDataDepAccountNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpCustDataOutGrmLoanScenarioDataDepAccountNum() {
        return outGrpCustDataOutGrmLoanScenarioDataDepAccountNum;
    }

    /**
     * Sets the value of the outGrpCustDataOutGrmLoanScenarioDataDepAccountNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpCustDataOutGrmLoanScenarioDataDepAccountNum(String value) {
        this.outGrpCustDataOutGrmLoanScenarioDataDepAccountNum = value;
    }

    /**
     * Gets the value of the outGrpCustDataOutGrmLoanScenarioDataDepAccountCd property.
     * 
     */
    public short getOutGrpCustDataOutGrmLoanScenarioDataDepAccountCd() {
        return outGrpCustDataOutGrmLoanScenarioDataDepAccountCd;
    }

    /**
     * Sets the value of the outGrpCustDataOutGrmLoanScenarioDataDepAccountCd property.
     * 
     */
    public void setOutGrpCustDataOutGrmLoanScenarioDataDepAccountCd(short value) {
        this.outGrpCustDataOutGrmLoanScenarioDataDepAccountCd = value;
    }

    /**
     * Gets the value of the outGrpCustDataOutGrmLoanScenarioDataCustCatSn property.
     * 
     */
    public int getOutGrpCustDataOutGrmLoanScenarioDataCustCatSn() {
        return outGrpCustDataOutGrmLoanScenarioDataCustCatSn;
    }

    /**
     * Sets the value of the outGrpCustDataOutGrmLoanScenarioDataCustCatSn property.
     * 
     */
    public void setOutGrpCustDataOutGrmLoanScenarioDataCustCatSn(int value) {
        this.outGrpCustDataOutGrmLoanScenarioDataCustCatSn = value;
    }

    /**
     * Gets the value of the outGrpCustDataOutGrmLoanScenarioDataTransactInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpCustDataOutGrmLoanScenarioDataTransactInd() {
        return outGrpCustDataOutGrmLoanScenarioDataTransactInd;
    }

    /**
     * Sets the value of the outGrpCustDataOutGrmLoanScenarioDataTransactInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpCustDataOutGrmLoanScenarioDataTransactInd(String value) {
        this.outGrpCustDataOutGrmLoanScenarioDataTransactInd = value;
    }

    /**
     * Gets the value of the outGrpCustDataOutGrmLoanScenarioDataTransactSm property.
     * 
     */
    public int getOutGrpCustDataOutGrmLoanScenarioDataTransactSm() {
        return outGrpCustDataOutGrmLoanScenarioDataTransactSm;
    }

    /**
     * Sets the value of the outGrpCustDataOutGrmLoanScenarioDataTransactSm property.
     * 
     */
    public void setOutGrpCustDataOutGrmLoanScenarioDataTransactSm(int value) {
        this.outGrpCustDataOutGrmLoanScenarioDataTransactSm = value;
    }

    /**
     * Gets the value of the outGrpCustDataOutGrmPrddescIefSuppliedString255 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpCustDataOutGrmPrddescIefSuppliedString255() {
        return outGrpCustDataOutGrmPrddescIefSuppliedString255;
    }

    /**
     * Sets the value of the outGrpCustDataOutGrmPrddescIefSuppliedString255 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpCustDataOutGrmPrddescIefSuppliedString255(String value) {
        this.outGrpCustDataOutGrmPrddescIefSuppliedString255 = value;
    }

    /**
     * Gets the value of the outGrpCustDataOutGrmLoanScenarioDataFinscSn property.
     * 
     */
    public int getOutGrpCustDataOutGrmLoanScenarioDataFinscSn() {
        return outGrpCustDataOutGrmLoanScenarioDataFinscSn;
    }

    /**
     * Sets the value of the outGrpCustDataOutGrmLoanScenarioDataFinscSn property.
     * 
     */
    public void setOutGrpCustDataOutGrmLoanScenarioDataFinscSn(int value) {
        this.outGrpCustDataOutGrmLoanScenarioDataFinscSn = value;
    }

    /**
     * Gets the value of the outGrpCustDataOutGrmLoanScenarioDataActscSn property.
     * 
     */
    public int getOutGrpCustDataOutGrmLoanScenarioDataActscSn() {
        return outGrpCustDataOutGrmLoanScenarioDataActscSn;
    }

    /**
     * Sets the value of the outGrpCustDataOutGrmLoanScenarioDataActscSn property.
     * 
     */
    public void setOutGrpCustDataOutGrmLoanScenarioDataActscSn(int value) {
        this.outGrpCustDataOutGrmLoanScenarioDataActscSn = value;
    }

    /**
     * Gets the value of the outGrpCustDataOutGrmLoanScenarioDataLpurpSn property.
     * 
     */
    public int getOutGrpCustDataOutGrmLoanScenarioDataLpurpSn() {
        return outGrpCustDataOutGrmLoanScenarioDataLpurpSn;
    }

    /**
     * Sets the value of the outGrpCustDataOutGrmLoanScenarioDataLpurpSn property.
     * 
     */
    public void setOutGrpCustDataOutGrmLoanScenarioDataLpurpSn(int value) {
        this.outGrpCustDataOutGrmLoanScenarioDataLpurpSn = value;
    }

    /**
     * Gets the value of the outGrpCustDataOutGrmLoanScenarioDataBsectSn property.
     * 
     */
    public int getOutGrpCustDataOutGrmLoanScenarioDataBsectSn() {
        return outGrpCustDataOutGrmLoanScenarioDataBsectSn;
    }

    /**
     * Sets the value of the outGrpCustDataOutGrmLoanScenarioDataBsectSn property.
     * 
     */
    public void setOutGrpCustDataOutGrmLoanScenarioDataBsectSn(int value) {
        this.outGrpCustDataOutGrmLoanScenarioDataBsectSn = value;
    }

    /**
     * Gets the value of the outGrpCustDataOutGrmLoanScenarioDataCbpurSn property.
     * 
     */
    public int getOutGrpCustDataOutGrmLoanScenarioDataCbpurSn() {
        return outGrpCustDataOutGrmLoanScenarioDataCbpurSn;
    }

    /**
     * Sets the value of the outGrpCustDataOutGrmLoanScenarioDataCbpurSn property.
     * 
     */
    public void setOutGrpCustDataOutGrmLoanScenarioDataCbpurSn(int value) {
        this.outGrpCustDataOutGrmLoanScenarioDataCbpurSn = value;
    }

    /**
     * Gets the value of the outGrpCustDataOutGrmLoanScenarioDataStatementFreq property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpCustDataOutGrmLoanScenarioDataStatementFreq() {
        return outGrpCustDataOutGrmLoanScenarioDataStatementFreq;
    }

    /**
     * Sets the value of the outGrpCustDataOutGrmLoanScenarioDataStatementFreq property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpCustDataOutGrmLoanScenarioDataStatementFreq(String value) {
        this.outGrpCustDataOutGrmLoanScenarioDataStatementFreq = value;
    }

    /**
     * Gets the value of the outGrpCustDataOutGrmLoanScenarioDataApplicationId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpCustDataOutGrmLoanScenarioDataApplicationId() {
        return outGrpCustDataOutGrmLoanScenarioDataApplicationId;
    }

    /**
     * Sets the value of the outGrpCustDataOutGrmLoanScenarioDataApplicationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpCustDataOutGrmLoanScenarioDataApplicationId(String value) {
        this.outGrpCustDataOutGrmLoanScenarioDataApplicationId = value;
    }

    /**
     * Gets the value of the outGrpCustDataOutGrmLoanScenarioDataApplicationSts property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpCustDataOutGrmLoanScenarioDataApplicationSts() {
        return outGrpCustDataOutGrmLoanScenarioDataApplicationSts;
    }

    /**
     * Sets the value of the outGrpCustDataOutGrmLoanScenarioDataApplicationSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpCustDataOutGrmLoanScenarioDataApplicationSts(String value) {
        this.outGrpCustDataOutGrmLoanScenarioDataApplicationSts = value;
    }

    /**
     * Gets the value of the outGrpCustDataOutGrmFinalIefSuppliedChar2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpCustDataOutGrmFinalIefSuppliedChar2() {
        return outGrpCustDataOutGrmFinalIefSuppliedChar2;
    }

    /**
     * Sets the value of the outGrpCustDataOutGrmFinalIefSuppliedChar2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpCustDataOutGrmFinalIefSuppliedChar2(String value) {
        this.outGrpCustDataOutGrmFinalIefSuppliedChar2 = value;
    }

    /**
     * Gets the value of the outGrpCustDataOutGrmLoanScenarioDataSaleUnitSn property.
     * 
     */
    public int getOutGrpCustDataOutGrmLoanScenarioDataSaleUnitSn() {
        return outGrpCustDataOutGrmLoanScenarioDataSaleUnitSn;
    }

    /**
     * Sets the value of the outGrpCustDataOutGrmLoanScenarioDataSaleUnitSn property.
     * 
     */
    public void setOutGrpCustDataOutGrmLoanScenarioDataSaleUnitSn(int value) {
        this.outGrpCustDataOutGrmLoanScenarioDataSaleUnitSn = value;
    }

    /**
     * Gets the value of the outGrpCustDataOutGrmLoanScenarioDataSalePersonSn property.
     * 
     */
    public int getOutGrpCustDataOutGrmLoanScenarioDataSalePersonSn() {
        return outGrpCustDataOutGrmLoanScenarioDataSalePersonSn;
    }

    /**
     * Sets the value of the outGrpCustDataOutGrmLoanScenarioDataSalePersonSn property.
     * 
     */
    public void setOutGrpCustDataOutGrmLoanScenarioDataSalePersonSn(int value) {
        this.outGrpCustDataOutGrmLoanScenarioDataSalePersonSn = value;
    }

    /**
     * Gets the value of the outGrpCustDataOutGrmLoanScenarioDataPenaltyIntId property.
     * 
     */
    public int getOutGrpCustDataOutGrmLoanScenarioDataPenaltyIntId() {
        return outGrpCustDataOutGrmLoanScenarioDataPenaltyIntId;
    }

    /**
     * Sets the value of the outGrpCustDataOutGrmLoanScenarioDataPenaltyIntId property.
     * 
     */
    public void setOutGrpCustDataOutGrmLoanScenarioDataPenaltyIntId(int value) {
        this.outGrpCustDataOutGrmLoanScenarioDataPenaltyIntId = value;
    }

    /**
     * Gets the value of the outGrpCustDataOutGrmLoanScenarioDataPenaltyIntPrc property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpCustDataOutGrmLoanScenarioDataPenaltyIntPrc() {
        return outGrpCustDataOutGrmLoanScenarioDataPenaltyIntPrc;
    }

    /**
     * Sets the value of the outGrpCustDataOutGrmLoanScenarioDataPenaltyIntPrc property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpCustDataOutGrmLoanScenarioDataPenaltyIntPrc(BigDecimal value) {
        this.outGrpCustDataOutGrmLoanScenarioDataPenaltyIntPrc = value;
    }

    /**
     * Gets the value of the outGrpCustDataOutGrmLoanScenarioDataMoratIntAmortized property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpCustDataOutGrmLoanScenarioDataMoratIntAmortized() {
        return outGrpCustDataOutGrmLoanScenarioDataMoratIntAmortized;
    }

    /**
     * Sets the value of the outGrpCustDataOutGrmLoanScenarioDataMoratIntAmortized property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpCustDataOutGrmLoanScenarioDataMoratIntAmortized(String value) {
        this.outGrpCustDataOutGrmLoanScenarioDataMoratIntAmortized = value;
    }

}
