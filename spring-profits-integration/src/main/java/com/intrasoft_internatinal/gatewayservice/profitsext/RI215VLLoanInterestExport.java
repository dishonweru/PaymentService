
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RI215VL_LoanInterestExport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RI215VL_LoanInterestExport">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}BaseExport">
 *       &lt;sequence>
 *         &lt;element name="OutAccountTypeGenericDetailDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutAccountTypeGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutContinueLnsInterestIdInterest" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutCreditLineGenericDetailDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCreditLineGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutCurrencyDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCurrencyIdCurrency" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutCurrencyShortDescr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutProductDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutProductIdProduct" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutProductLoanLoanAdjBalloonInstal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutProductLoanLoanAdjGracePeriod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutProductLoanLoanAdjMaxInstCnt" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutProductLoanLoanAdjMaxInstFreq" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutProductLoanLoanAdjMaxInterCnt" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutProductLoanLoanAdjMaxInterFrq" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutProductLoanLoanAdjMinInstCnt" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutProductLoanLoanAdjMinInstFreq" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutProductLoanLoanAdjMinInterCnt" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutProductLoanLoanAdjMinInterFrq" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutProductLoanLoanAtmCardFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutProductLoanLoanAutFixIntRenew" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutProductLoanLoanCollRequestLimit" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutProductLoanLoanCostOfOptionMax" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutProductLoanLoanCostOfOptionMin" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutProductLoanLoanCurFxIntInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutProductLoanLoanDepositAccFlg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutProductLoanLoanDurationType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutProductLoanLoanDurationUnit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutProductLoanLoanGracePrdUnit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutProductLoanLoanInstallMechFlg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutProductLoanLoanInstallUnit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutProductLoanLoanIntCapitalFlg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutProductLoanLoanIntPayableFlg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutProductLoanLoanInterDaysInst" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutProductLoanLoanLoanType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutProductLoanLoanLumpDrawdown" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutProductLoanLoanM6PeriodNrmint" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutProductLoanLoanMaxFluctuation" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutProductLoanLoanMaxGracePrdFrq" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutProductLoanLoanMaxInstallCnt" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutProductLoanLoanMaxInstallFrq" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutProductLoanLoanMaxInterestFrq" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutProductLoanLoanMaxLoanDurat" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutProductLoanLoanMaxRecycleDurat" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutProductLoanLoanMaxSkipPerMonth" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutProductLoanLoanMaxSkipPerYear" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutProductLoanLoanMinFluctuation" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutProductLoanLoanMinGracePrdFrq" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutProductLoanLoanMinInstallCnt" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutProductLoanLoanMinInstallFrq" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutProductLoanLoanMinInterestFrq" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutProductLoanLoanMinLoanDurat" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutProductLoanLoanMinPaymentAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutProductLoanLoanMinPaymentPerc" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutProductLoanLoanMinRecycleDurat" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutProductLoanLoanMoratIntPayFlg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutProductLoanLoanNoIntMoratorFlg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutProductLoanLoanNonIntCapitFlg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutProductLoanLoanNrmInterestFreq" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutProductLoanLoanNrmInterestUnit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutProductLoanLoanOvInterestFreq" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutProductLoanLoanOvInterestUnit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutProductLoanLoanPeriodicIntFlg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutProductLoanLoanRecycleUnit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutProductLoanLoanRecyclingLmtFlg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutProductLoanLoanRenewalInterFlg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutProductLoanLoanSelectIntFlg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutProductLoanLoanTolDays1" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutProductLoanLoanTolDays2" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutProductLoanLoanTolDays3" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutProductLoanLoanTolDays5" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutProductLoanLoanToleranceDays" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutGrpInterest" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}ArrayOfRI215VLOutGrpInterestItem" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RI215VL_LoanInterestExport", propOrder = {
    "outAccountTypeGenericDetailDescription",
    "outAccountTypeGenericDetailSerialNum",
    "outContinueLnsInterestIdInterest",
    "outCreditLineGenericDetailDescription",
    "outCreditLineGenericDetailSerialNum",
    "outCurrencyDescription",
    "outCurrencyIdCurrency",
    "outCurrencyShortDescr",
    "outProductDescription",
    "outProductIdProduct",
    "outProductLoanLoanAdjBalloonInstal",
    "outProductLoanLoanAdjGracePeriod",
    "outProductLoanLoanAdjMaxInstCnt",
    "outProductLoanLoanAdjMaxInstFreq",
    "outProductLoanLoanAdjMaxInterCnt",
    "outProductLoanLoanAdjMaxInterFrq",
    "outProductLoanLoanAdjMinInstCnt",
    "outProductLoanLoanAdjMinInstFreq",
    "outProductLoanLoanAdjMinInterCnt",
    "outProductLoanLoanAdjMinInterFrq",
    "outProductLoanLoanAtmCardFlag",
    "outProductLoanLoanAutFixIntRenew",
    "outProductLoanLoanCollRequestLimit",
    "outProductLoanLoanCostOfOptionMax",
    "outProductLoanLoanCostOfOptionMin",
    "outProductLoanLoanCurFxIntInd",
    "outProductLoanLoanDepositAccFlg",
    "outProductLoanLoanDurationType",
    "outProductLoanLoanDurationUnit",
    "outProductLoanLoanGracePrdUnit",
    "outProductLoanLoanInstallMechFlg",
    "outProductLoanLoanInstallUnit",
    "outProductLoanLoanIntCapitalFlg",
    "outProductLoanLoanIntPayableFlg",
    "outProductLoanLoanInterDaysInst",
    "outProductLoanLoanLoanType",
    "outProductLoanLoanLumpDrawdown",
    "outProductLoanLoanM6PeriodNrmint",
    "outProductLoanLoanMaxFluctuation",
    "outProductLoanLoanMaxGracePrdFrq",
    "outProductLoanLoanMaxInstallCnt",
    "outProductLoanLoanMaxInstallFrq",
    "outProductLoanLoanMaxInterestFrq",
    "outProductLoanLoanMaxLoanDurat",
    "outProductLoanLoanMaxRecycleDurat",
    "outProductLoanLoanMaxSkipPerMonth",
    "outProductLoanLoanMaxSkipPerYear",
    "outProductLoanLoanMinFluctuation",
    "outProductLoanLoanMinGracePrdFrq",
    "outProductLoanLoanMinInstallCnt",
    "outProductLoanLoanMinInstallFrq",
    "outProductLoanLoanMinInterestFrq",
    "outProductLoanLoanMinLoanDurat",
    "outProductLoanLoanMinPaymentAmn",
    "outProductLoanLoanMinPaymentPerc",
    "outProductLoanLoanMinRecycleDurat",
    "outProductLoanLoanMoratIntPayFlg",
    "outProductLoanLoanNoIntMoratorFlg",
    "outProductLoanLoanNonIntCapitFlg",
    "outProductLoanLoanNrmInterestFreq",
    "outProductLoanLoanNrmInterestUnit",
    "outProductLoanLoanOvInterestFreq",
    "outProductLoanLoanOvInterestUnit",
    "outProductLoanLoanPeriodicIntFlg",
    "outProductLoanLoanRecycleUnit",
    "outProductLoanLoanRecyclingLmtFlg",
    "outProductLoanLoanRenewalInterFlg",
    "outProductLoanLoanSelectIntFlg",
    "outProductLoanLoanTolDays1",
    "outProductLoanLoanTolDays2",
    "outProductLoanLoanTolDays3",
    "outProductLoanLoanTolDays5",
    "outProductLoanLoanToleranceDays",
    "outGrpInterest"
})
public class RI215VLLoanInterestExport
    extends BaseExport
{

    @XmlElement(name = "OutAccountTypeGenericDetailDescription")
    protected String outAccountTypeGenericDetailDescription;
    @XmlElement(name = "OutAccountTypeGenericDetailSerialNum")
    protected int outAccountTypeGenericDetailSerialNum;
    @XmlElement(name = "OutContinueLnsInterestIdInterest")
    protected int outContinueLnsInterestIdInterest;
    @XmlElement(name = "OutCreditLineGenericDetailDescription")
    protected String outCreditLineGenericDetailDescription;
    @XmlElement(name = "OutCreditLineGenericDetailSerialNum")
    protected int outCreditLineGenericDetailSerialNum;
    @XmlElement(name = "OutCurrencyDescription")
    protected String outCurrencyDescription;
    @XmlElement(name = "OutCurrencyIdCurrency")
    protected int outCurrencyIdCurrency;
    @XmlElement(name = "OutCurrencyShortDescr")
    protected String outCurrencyShortDescr;
    @XmlElement(name = "OutProductDescription")
    protected String outProductDescription;
    @XmlElement(name = "OutProductIdProduct")
    protected int outProductIdProduct;
    @XmlElement(name = "OutProductLoanLoanAdjBalloonInstal")
    protected String outProductLoanLoanAdjBalloonInstal;
    @XmlElement(name = "OutProductLoanLoanAdjGracePeriod")
    protected String outProductLoanLoanAdjGracePeriod;
    @XmlElement(name = "OutProductLoanLoanAdjMaxInstCnt")
    protected short outProductLoanLoanAdjMaxInstCnt;
    @XmlElement(name = "OutProductLoanLoanAdjMaxInstFreq")
    protected short outProductLoanLoanAdjMaxInstFreq;
    @XmlElement(name = "OutProductLoanLoanAdjMaxInterCnt")
    protected short outProductLoanLoanAdjMaxInterCnt;
    @XmlElement(name = "OutProductLoanLoanAdjMaxInterFrq")
    protected short outProductLoanLoanAdjMaxInterFrq;
    @XmlElement(name = "OutProductLoanLoanAdjMinInstCnt")
    protected short outProductLoanLoanAdjMinInstCnt;
    @XmlElement(name = "OutProductLoanLoanAdjMinInstFreq")
    protected short outProductLoanLoanAdjMinInstFreq;
    @XmlElement(name = "OutProductLoanLoanAdjMinInterCnt")
    protected short outProductLoanLoanAdjMinInterCnt;
    @XmlElement(name = "OutProductLoanLoanAdjMinInterFrq")
    protected short outProductLoanLoanAdjMinInterFrq;
    @XmlElement(name = "OutProductLoanLoanAtmCardFlag")
    protected String outProductLoanLoanAtmCardFlag;
    @XmlElement(name = "OutProductLoanLoanAutFixIntRenew")
    protected String outProductLoanLoanAutFixIntRenew;
    @XmlElement(name = "OutProductLoanLoanCollRequestLimit")
    protected short outProductLoanLoanCollRequestLimit;
    @XmlElement(name = "OutProductLoanLoanCostOfOptionMax", required = true)
    protected BigDecimal outProductLoanLoanCostOfOptionMax;
    @XmlElement(name = "OutProductLoanLoanCostOfOptionMin", required = true)
    protected BigDecimal outProductLoanLoanCostOfOptionMin;
    @XmlElement(name = "OutProductLoanLoanCurFxIntInd")
    protected String outProductLoanLoanCurFxIntInd;
    @XmlElement(name = "OutProductLoanLoanDepositAccFlg")
    protected String outProductLoanLoanDepositAccFlg;
    @XmlElement(name = "OutProductLoanLoanDurationType")
    protected String outProductLoanLoanDurationType;
    @XmlElement(name = "OutProductLoanLoanDurationUnit")
    protected String outProductLoanLoanDurationUnit;
    @XmlElement(name = "OutProductLoanLoanGracePrdUnit")
    protected String outProductLoanLoanGracePrdUnit;
    @XmlElement(name = "OutProductLoanLoanInstallMechFlg")
    protected String outProductLoanLoanInstallMechFlg;
    @XmlElement(name = "OutProductLoanLoanInstallUnit")
    protected String outProductLoanLoanInstallUnit;
    @XmlElement(name = "OutProductLoanLoanIntCapitalFlg")
    protected String outProductLoanLoanIntCapitalFlg;
    @XmlElement(name = "OutProductLoanLoanIntPayableFlg")
    protected String outProductLoanLoanIntPayableFlg;
    @XmlElement(name = "OutProductLoanLoanInterDaysInst")
    protected String outProductLoanLoanInterDaysInst;
    @XmlElement(name = "OutProductLoanLoanLoanType")
    protected String outProductLoanLoanLoanType;
    @XmlElement(name = "OutProductLoanLoanLumpDrawdown")
    protected String outProductLoanLoanLumpDrawdown;
    @XmlElement(name = "OutProductLoanLoanM6PeriodNrmint")
    protected String outProductLoanLoanM6PeriodNrmint;
    @XmlElement(name = "OutProductLoanLoanMaxFluctuation", required = true)
    protected BigDecimal outProductLoanLoanMaxFluctuation;
    @XmlElement(name = "OutProductLoanLoanMaxGracePrdFrq")
    protected short outProductLoanLoanMaxGracePrdFrq;
    @XmlElement(name = "OutProductLoanLoanMaxInstallCnt")
    protected short outProductLoanLoanMaxInstallCnt;
    @XmlElement(name = "OutProductLoanLoanMaxInstallFrq")
    protected short outProductLoanLoanMaxInstallFrq;
    @XmlElement(name = "OutProductLoanLoanMaxInterestFrq")
    protected short outProductLoanLoanMaxInterestFrq;
    @XmlElement(name = "OutProductLoanLoanMaxLoanDurat")
    protected short outProductLoanLoanMaxLoanDurat;
    @XmlElement(name = "OutProductLoanLoanMaxRecycleDurat")
    protected short outProductLoanLoanMaxRecycleDurat;
    @XmlElement(name = "OutProductLoanLoanMaxSkipPerMonth")
    protected short outProductLoanLoanMaxSkipPerMonth;
    @XmlElement(name = "OutProductLoanLoanMaxSkipPerYear")
    protected short outProductLoanLoanMaxSkipPerYear;
    @XmlElement(name = "OutProductLoanLoanMinFluctuation", required = true)
    protected BigDecimal outProductLoanLoanMinFluctuation;
    @XmlElement(name = "OutProductLoanLoanMinGracePrdFrq")
    protected short outProductLoanLoanMinGracePrdFrq;
    @XmlElement(name = "OutProductLoanLoanMinInstallCnt")
    protected short outProductLoanLoanMinInstallCnt;
    @XmlElement(name = "OutProductLoanLoanMinInstallFrq")
    protected short outProductLoanLoanMinInstallFrq;
    @XmlElement(name = "OutProductLoanLoanMinInterestFrq")
    protected short outProductLoanLoanMinInterestFrq;
    @XmlElement(name = "OutProductLoanLoanMinLoanDurat")
    protected short outProductLoanLoanMinLoanDurat;
    @XmlElement(name = "OutProductLoanLoanMinPaymentAmn", required = true)
    protected BigDecimal outProductLoanLoanMinPaymentAmn;
    @XmlElement(name = "OutProductLoanLoanMinPaymentPerc", required = true)
    protected BigDecimal outProductLoanLoanMinPaymentPerc;
    @XmlElement(name = "OutProductLoanLoanMinRecycleDurat")
    protected short outProductLoanLoanMinRecycleDurat;
    @XmlElement(name = "OutProductLoanLoanMoratIntPayFlg")
    protected String outProductLoanLoanMoratIntPayFlg;
    @XmlElement(name = "OutProductLoanLoanNoIntMoratorFlg")
    protected String outProductLoanLoanNoIntMoratorFlg;
    @XmlElement(name = "OutProductLoanLoanNonIntCapitFlg")
    protected String outProductLoanLoanNonIntCapitFlg;
    @XmlElement(name = "OutProductLoanLoanNrmInterestFreq")
    protected short outProductLoanLoanNrmInterestFreq;
    @XmlElement(name = "OutProductLoanLoanNrmInterestUnit")
    protected String outProductLoanLoanNrmInterestUnit;
    @XmlElement(name = "OutProductLoanLoanOvInterestFreq")
    protected short outProductLoanLoanOvInterestFreq;
    @XmlElement(name = "OutProductLoanLoanOvInterestUnit")
    protected String outProductLoanLoanOvInterestUnit;
    @XmlElement(name = "OutProductLoanLoanPeriodicIntFlg")
    protected String outProductLoanLoanPeriodicIntFlg;
    @XmlElement(name = "OutProductLoanLoanRecycleUnit")
    protected String outProductLoanLoanRecycleUnit;
    @XmlElement(name = "OutProductLoanLoanRecyclingLmtFlg")
    protected String outProductLoanLoanRecyclingLmtFlg;
    @XmlElement(name = "OutProductLoanLoanRenewalInterFlg")
    protected String outProductLoanLoanRenewalInterFlg;
    @XmlElement(name = "OutProductLoanLoanSelectIntFlg")
    protected String outProductLoanLoanSelectIntFlg;
    @XmlElement(name = "OutProductLoanLoanTolDays1")
    protected short outProductLoanLoanTolDays1;
    @XmlElement(name = "OutProductLoanLoanTolDays2")
    protected short outProductLoanLoanTolDays2;
    @XmlElement(name = "OutProductLoanLoanTolDays3")
    protected short outProductLoanLoanTolDays3;
    @XmlElement(name = "OutProductLoanLoanTolDays5")
    protected short outProductLoanLoanTolDays5;
    @XmlElement(name = "OutProductLoanLoanToleranceDays")
    protected short outProductLoanLoanToleranceDays;
    @XmlElement(name = "OutGrpInterest")
    protected ArrayOfRI215VLOutGrpInterestItem outGrpInterest;

    /**
     * Gets the value of the outAccountTypeGenericDetailDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutAccountTypeGenericDetailDescription() {
        return outAccountTypeGenericDetailDescription;
    }

    /**
     * Sets the value of the outAccountTypeGenericDetailDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutAccountTypeGenericDetailDescription(String value) {
        this.outAccountTypeGenericDetailDescription = value;
    }

    /**
     * Gets the value of the outAccountTypeGenericDetailSerialNum property.
     * 
     */
    public int getOutAccountTypeGenericDetailSerialNum() {
        return outAccountTypeGenericDetailSerialNum;
    }

    /**
     * Sets the value of the outAccountTypeGenericDetailSerialNum property.
     * 
     */
    public void setOutAccountTypeGenericDetailSerialNum(int value) {
        this.outAccountTypeGenericDetailSerialNum = value;
    }

    /**
     * Gets the value of the outContinueLnsInterestIdInterest property.
     * 
     */
    public int getOutContinueLnsInterestIdInterest() {
        return outContinueLnsInterestIdInterest;
    }

    /**
     * Sets the value of the outContinueLnsInterestIdInterest property.
     * 
     */
    public void setOutContinueLnsInterestIdInterest(int value) {
        this.outContinueLnsInterestIdInterest = value;
    }

    /**
     * Gets the value of the outCreditLineGenericDetailDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCreditLineGenericDetailDescription() {
        return outCreditLineGenericDetailDescription;
    }

    /**
     * Sets the value of the outCreditLineGenericDetailDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCreditLineGenericDetailDescription(String value) {
        this.outCreditLineGenericDetailDescription = value;
    }

    /**
     * Gets the value of the outCreditLineGenericDetailSerialNum property.
     * 
     */
    public int getOutCreditLineGenericDetailSerialNum() {
        return outCreditLineGenericDetailSerialNum;
    }

    /**
     * Sets the value of the outCreditLineGenericDetailSerialNum property.
     * 
     */
    public void setOutCreditLineGenericDetailSerialNum(int value) {
        this.outCreditLineGenericDetailSerialNum = value;
    }

    /**
     * Gets the value of the outCurrencyDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCurrencyDescription() {
        return outCurrencyDescription;
    }

    /**
     * Sets the value of the outCurrencyDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCurrencyDescription(String value) {
        this.outCurrencyDescription = value;
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
     * Gets the value of the outProductLoanLoanAdjBalloonInstal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutProductLoanLoanAdjBalloonInstal() {
        return outProductLoanLoanAdjBalloonInstal;
    }

    /**
     * Sets the value of the outProductLoanLoanAdjBalloonInstal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutProductLoanLoanAdjBalloonInstal(String value) {
        this.outProductLoanLoanAdjBalloonInstal = value;
    }

    /**
     * Gets the value of the outProductLoanLoanAdjGracePeriod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutProductLoanLoanAdjGracePeriod() {
        return outProductLoanLoanAdjGracePeriod;
    }

    /**
     * Sets the value of the outProductLoanLoanAdjGracePeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutProductLoanLoanAdjGracePeriod(String value) {
        this.outProductLoanLoanAdjGracePeriod = value;
    }

    /**
     * Gets the value of the outProductLoanLoanAdjMaxInstCnt property.
     * 
     */
    public short getOutProductLoanLoanAdjMaxInstCnt() {
        return outProductLoanLoanAdjMaxInstCnt;
    }

    /**
     * Sets the value of the outProductLoanLoanAdjMaxInstCnt property.
     * 
     */
    public void setOutProductLoanLoanAdjMaxInstCnt(short value) {
        this.outProductLoanLoanAdjMaxInstCnt = value;
    }

    /**
     * Gets the value of the outProductLoanLoanAdjMaxInstFreq property.
     * 
     */
    public short getOutProductLoanLoanAdjMaxInstFreq() {
        return outProductLoanLoanAdjMaxInstFreq;
    }

    /**
     * Sets the value of the outProductLoanLoanAdjMaxInstFreq property.
     * 
     */
    public void setOutProductLoanLoanAdjMaxInstFreq(short value) {
        this.outProductLoanLoanAdjMaxInstFreq = value;
    }

    /**
     * Gets the value of the outProductLoanLoanAdjMaxInterCnt property.
     * 
     */
    public short getOutProductLoanLoanAdjMaxInterCnt() {
        return outProductLoanLoanAdjMaxInterCnt;
    }

    /**
     * Sets the value of the outProductLoanLoanAdjMaxInterCnt property.
     * 
     */
    public void setOutProductLoanLoanAdjMaxInterCnt(short value) {
        this.outProductLoanLoanAdjMaxInterCnt = value;
    }

    /**
     * Gets the value of the outProductLoanLoanAdjMaxInterFrq property.
     * 
     */
    public short getOutProductLoanLoanAdjMaxInterFrq() {
        return outProductLoanLoanAdjMaxInterFrq;
    }

    /**
     * Sets the value of the outProductLoanLoanAdjMaxInterFrq property.
     * 
     */
    public void setOutProductLoanLoanAdjMaxInterFrq(short value) {
        this.outProductLoanLoanAdjMaxInterFrq = value;
    }

    /**
     * Gets the value of the outProductLoanLoanAdjMinInstCnt property.
     * 
     */
    public short getOutProductLoanLoanAdjMinInstCnt() {
        return outProductLoanLoanAdjMinInstCnt;
    }

    /**
     * Sets the value of the outProductLoanLoanAdjMinInstCnt property.
     * 
     */
    public void setOutProductLoanLoanAdjMinInstCnt(short value) {
        this.outProductLoanLoanAdjMinInstCnt = value;
    }

    /**
     * Gets the value of the outProductLoanLoanAdjMinInstFreq property.
     * 
     */
    public short getOutProductLoanLoanAdjMinInstFreq() {
        return outProductLoanLoanAdjMinInstFreq;
    }

    /**
     * Sets the value of the outProductLoanLoanAdjMinInstFreq property.
     * 
     */
    public void setOutProductLoanLoanAdjMinInstFreq(short value) {
        this.outProductLoanLoanAdjMinInstFreq = value;
    }

    /**
     * Gets the value of the outProductLoanLoanAdjMinInterCnt property.
     * 
     */
    public short getOutProductLoanLoanAdjMinInterCnt() {
        return outProductLoanLoanAdjMinInterCnt;
    }

    /**
     * Sets the value of the outProductLoanLoanAdjMinInterCnt property.
     * 
     */
    public void setOutProductLoanLoanAdjMinInterCnt(short value) {
        this.outProductLoanLoanAdjMinInterCnt = value;
    }

    /**
     * Gets the value of the outProductLoanLoanAdjMinInterFrq property.
     * 
     */
    public short getOutProductLoanLoanAdjMinInterFrq() {
        return outProductLoanLoanAdjMinInterFrq;
    }

    /**
     * Sets the value of the outProductLoanLoanAdjMinInterFrq property.
     * 
     */
    public void setOutProductLoanLoanAdjMinInterFrq(short value) {
        this.outProductLoanLoanAdjMinInterFrq = value;
    }

    /**
     * Gets the value of the outProductLoanLoanAtmCardFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutProductLoanLoanAtmCardFlag() {
        return outProductLoanLoanAtmCardFlag;
    }

    /**
     * Sets the value of the outProductLoanLoanAtmCardFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutProductLoanLoanAtmCardFlag(String value) {
        this.outProductLoanLoanAtmCardFlag = value;
    }

    /**
     * Gets the value of the outProductLoanLoanAutFixIntRenew property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutProductLoanLoanAutFixIntRenew() {
        return outProductLoanLoanAutFixIntRenew;
    }

    /**
     * Sets the value of the outProductLoanLoanAutFixIntRenew property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutProductLoanLoanAutFixIntRenew(String value) {
        this.outProductLoanLoanAutFixIntRenew = value;
    }

    /**
     * Gets the value of the outProductLoanLoanCollRequestLimit property.
     * 
     */
    public short getOutProductLoanLoanCollRequestLimit() {
        return outProductLoanLoanCollRequestLimit;
    }

    /**
     * Sets the value of the outProductLoanLoanCollRequestLimit property.
     * 
     */
    public void setOutProductLoanLoanCollRequestLimit(short value) {
        this.outProductLoanLoanCollRequestLimit = value;
    }

    /**
     * Gets the value of the outProductLoanLoanCostOfOptionMax property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutProductLoanLoanCostOfOptionMax() {
        return outProductLoanLoanCostOfOptionMax;
    }

    /**
     * Sets the value of the outProductLoanLoanCostOfOptionMax property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutProductLoanLoanCostOfOptionMax(BigDecimal value) {
        this.outProductLoanLoanCostOfOptionMax = value;
    }

    /**
     * Gets the value of the outProductLoanLoanCostOfOptionMin property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutProductLoanLoanCostOfOptionMin() {
        return outProductLoanLoanCostOfOptionMin;
    }

    /**
     * Sets the value of the outProductLoanLoanCostOfOptionMin property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutProductLoanLoanCostOfOptionMin(BigDecimal value) {
        this.outProductLoanLoanCostOfOptionMin = value;
    }

    /**
     * Gets the value of the outProductLoanLoanCurFxIntInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutProductLoanLoanCurFxIntInd() {
        return outProductLoanLoanCurFxIntInd;
    }

    /**
     * Sets the value of the outProductLoanLoanCurFxIntInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutProductLoanLoanCurFxIntInd(String value) {
        this.outProductLoanLoanCurFxIntInd = value;
    }

    /**
     * Gets the value of the outProductLoanLoanDepositAccFlg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutProductLoanLoanDepositAccFlg() {
        return outProductLoanLoanDepositAccFlg;
    }

    /**
     * Sets the value of the outProductLoanLoanDepositAccFlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutProductLoanLoanDepositAccFlg(String value) {
        this.outProductLoanLoanDepositAccFlg = value;
    }

    /**
     * Gets the value of the outProductLoanLoanDurationType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutProductLoanLoanDurationType() {
        return outProductLoanLoanDurationType;
    }

    /**
     * Sets the value of the outProductLoanLoanDurationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutProductLoanLoanDurationType(String value) {
        this.outProductLoanLoanDurationType = value;
    }

    /**
     * Gets the value of the outProductLoanLoanDurationUnit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutProductLoanLoanDurationUnit() {
        return outProductLoanLoanDurationUnit;
    }

    /**
     * Sets the value of the outProductLoanLoanDurationUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutProductLoanLoanDurationUnit(String value) {
        this.outProductLoanLoanDurationUnit = value;
    }

    /**
     * Gets the value of the outProductLoanLoanGracePrdUnit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutProductLoanLoanGracePrdUnit() {
        return outProductLoanLoanGracePrdUnit;
    }

    /**
     * Sets the value of the outProductLoanLoanGracePrdUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutProductLoanLoanGracePrdUnit(String value) {
        this.outProductLoanLoanGracePrdUnit = value;
    }

    /**
     * Gets the value of the outProductLoanLoanInstallMechFlg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutProductLoanLoanInstallMechFlg() {
        return outProductLoanLoanInstallMechFlg;
    }

    /**
     * Sets the value of the outProductLoanLoanInstallMechFlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutProductLoanLoanInstallMechFlg(String value) {
        this.outProductLoanLoanInstallMechFlg = value;
    }

    /**
     * Gets the value of the outProductLoanLoanInstallUnit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutProductLoanLoanInstallUnit() {
        return outProductLoanLoanInstallUnit;
    }

    /**
     * Sets the value of the outProductLoanLoanInstallUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutProductLoanLoanInstallUnit(String value) {
        this.outProductLoanLoanInstallUnit = value;
    }

    /**
     * Gets the value of the outProductLoanLoanIntCapitalFlg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutProductLoanLoanIntCapitalFlg() {
        return outProductLoanLoanIntCapitalFlg;
    }

    /**
     * Sets the value of the outProductLoanLoanIntCapitalFlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutProductLoanLoanIntCapitalFlg(String value) {
        this.outProductLoanLoanIntCapitalFlg = value;
    }

    /**
     * Gets the value of the outProductLoanLoanIntPayableFlg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutProductLoanLoanIntPayableFlg() {
        return outProductLoanLoanIntPayableFlg;
    }

    /**
     * Sets the value of the outProductLoanLoanIntPayableFlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutProductLoanLoanIntPayableFlg(String value) {
        this.outProductLoanLoanIntPayableFlg = value;
    }

    /**
     * Gets the value of the outProductLoanLoanInterDaysInst property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutProductLoanLoanInterDaysInst() {
        return outProductLoanLoanInterDaysInst;
    }

    /**
     * Sets the value of the outProductLoanLoanInterDaysInst property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutProductLoanLoanInterDaysInst(String value) {
        this.outProductLoanLoanInterDaysInst = value;
    }

    /**
     * Gets the value of the outProductLoanLoanLoanType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutProductLoanLoanLoanType() {
        return outProductLoanLoanLoanType;
    }

    /**
     * Sets the value of the outProductLoanLoanLoanType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutProductLoanLoanLoanType(String value) {
        this.outProductLoanLoanLoanType = value;
    }

    /**
     * Gets the value of the outProductLoanLoanLumpDrawdown property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutProductLoanLoanLumpDrawdown() {
        return outProductLoanLoanLumpDrawdown;
    }

    /**
     * Sets the value of the outProductLoanLoanLumpDrawdown property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutProductLoanLoanLumpDrawdown(String value) {
        this.outProductLoanLoanLumpDrawdown = value;
    }

    /**
     * Gets the value of the outProductLoanLoanM6PeriodNrmint property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutProductLoanLoanM6PeriodNrmint() {
        return outProductLoanLoanM6PeriodNrmint;
    }

    /**
     * Sets the value of the outProductLoanLoanM6PeriodNrmint property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutProductLoanLoanM6PeriodNrmint(String value) {
        this.outProductLoanLoanM6PeriodNrmint = value;
    }

    /**
     * Gets the value of the outProductLoanLoanMaxFluctuation property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutProductLoanLoanMaxFluctuation() {
        return outProductLoanLoanMaxFluctuation;
    }

    /**
     * Sets the value of the outProductLoanLoanMaxFluctuation property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutProductLoanLoanMaxFluctuation(BigDecimal value) {
        this.outProductLoanLoanMaxFluctuation = value;
    }

    /**
     * Gets the value of the outProductLoanLoanMaxGracePrdFrq property.
     * 
     */
    public short getOutProductLoanLoanMaxGracePrdFrq() {
        return outProductLoanLoanMaxGracePrdFrq;
    }

    /**
     * Sets the value of the outProductLoanLoanMaxGracePrdFrq property.
     * 
     */
    public void setOutProductLoanLoanMaxGracePrdFrq(short value) {
        this.outProductLoanLoanMaxGracePrdFrq = value;
    }

    /**
     * Gets the value of the outProductLoanLoanMaxInstallCnt property.
     * 
     */
    public short getOutProductLoanLoanMaxInstallCnt() {
        return outProductLoanLoanMaxInstallCnt;
    }

    /**
     * Sets the value of the outProductLoanLoanMaxInstallCnt property.
     * 
     */
    public void setOutProductLoanLoanMaxInstallCnt(short value) {
        this.outProductLoanLoanMaxInstallCnt = value;
    }

    /**
     * Gets the value of the outProductLoanLoanMaxInstallFrq property.
     * 
     */
    public short getOutProductLoanLoanMaxInstallFrq() {
        return outProductLoanLoanMaxInstallFrq;
    }

    /**
     * Sets the value of the outProductLoanLoanMaxInstallFrq property.
     * 
     */
    public void setOutProductLoanLoanMaxInstallFrq(short value) {
        this.outProductLoanLoanMaxInstallFrq = value;
    }

    /**
     * Gets the value of the outProductLoanLoanMaxInterestFrq property.
     * 
     */
    public short getOutProductLoanLoanMaxInterestFrq() {
        return outProductLoanLoanMaxInterestFrq;
    }

    /**
     * Sets the value of the outProductLoanLoanMaxInterestFrq property.
     * 
     */
    public void setOutProductLoanLoanMaxInterestFrq(short value) {
        this.outProductLoanLoanMaxInterestFrq = value;
    }

    /**
     * Gets the value of the outProductLoanLoanMaxLoanDurat property.
     * 
     */
    public short getOutProductLoanLoanMaxLoanDurat() {
        return outProductLoanLoanMaxLoanDurat;
    }

    /**
     * Sets the value of the outProductLoanLoanMaxLoanDurat property.
     * 
     */
    public void setOutProductLoanLoanMaxLoanDurat(short value) {
        this.outProductLoanLoanMaxLoanDurat = value;
    }

    /**
     * Gets the value of the outProductLoanLoanMaxRecycleDurat property.
     * 
     */
    public short getOutProductLoanLoanMaxRecycleDurat() {
        return outProductLoanLoanMaxRecycleDurat;
    }

    /**
     * Sets the value of the outProductLoanLoanMaxRecycleDurat property.
     * 
     */
    public void setOutProductLoanLoanMaxRecycleDurat(short value) {
        this.outProductLoanLoanMaxRecycleDurat = value;
    }

    /**
     * Gets the value of the outProductLoanLoanMaxSkipPerMonth property.
     * 
     */
    public short getOutProductLoanLoanMaxSkipPerMonth() {
        return outProductLoanLoanMaxSkipPerMonth;
    }

    /**
     * Sets the value of the outProductLoanLoanMaxSkipPerMonth property.
     * 
     */
    public void setOutProductLoanLoanMaxSkipPerMonth(short value) {
        this.outProductLoanLoanMaxSkipPerMonth = value;
    }

    /**
     * Gets the value of the outProductLoanLoanMaxSkipPerYear property.
     * 
     */
    public short getOutProductLoanLoanMaxSkipPerYear() {
        return outProductLoanLoanMaxSkipPerYear;
    }

    /**
     * Sets the value of the outProductLoanLoanMaxSkipPerYear property.
     * 
     */
    public void setOutProductLoanLoanMaxSkipPerYear(short value) {
        this.outProductLoanLoanMaxSkipPerYear = value;
    }

    /**
     * Gets the value of the outProductLoanLoanMinFluctuation property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutProductLoanLoanMinFluctuation() {
        return outProductLoanLoanMinFluctuation;
    }

    /**
     * Sets the value of the outProductLoanLoanMinFluctuation property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutProductLoanLoanMinFluctuation(BigDecimal value) {
        this.outProductLoanLoanMinFluctuation = value;
    }

    /**
     * Gets the value of the outProductLoanLoanMinGracePrdFrq property.
     * 
     */
    public short getOutProductLoanLoanMinGracePrdFrq() {
        return outProductLoanLoanMinGracePrdFrq;
    }

    /**
     * Sets the value of the outProductLoanLoanMinGracePrdFrq property.
     * 
     */
    public void setOutProductLoanLoanMinGracePrdFrq(short value) {
        this.outProductLoanLoanMinGracePrdFrq = value;
    }

    /**
     * Gets the value of the outProductLoanLoanMinInstallCnt property.
     * 
     */
    public short getOutProductLoanLoanMinInstallCnt() {
        return outProductLoanLoanMinInstallCnt;
    }

    /**
     * Sets the value of the outProductLoanLoanMinInstallCnt property.
     * 
     */
    public void setOutProductLoanLoanMinInstallCnt(short value) {
        this.outProductLoanLoanMinInstallCnt = value;
    }

    /**
     * Gets the value of the outProductLoanLoanMinInstallFrq property.
     * 
     */
    public short getOutProductLoanLoanMinInstallFrq() {
        return outProductLoanLoanMinInstallFrq;
    }

    /**
     * Sets the value of the outProductLoanLoanMinInstallFrq property.
     * 
     */
    public void setOutProductLoanLoanMinInstallFrq(short value) {
        this.outProductLoanLoanMinInstallFrq = value;
    }

    /**
     * Gets the value of the outProductLoanLoanMinInterestFrq property.
     * 
     */
    public short getOutProductLoanLoanMinInterestFrq() {
        return outProductLoanLoanMinInterestFrq;
    }

    /**
     * Sets the value of the outProductLoanLoanMinInterestFrq property.
     * 
     */
    public void setOutProductLoanLoanMinInterestFrq(short value) {
        this.outProductLoanLoanMinInterestFrq = value;
    }

    /**
     * Gets the value of the outProductLoanLoanMinLoanDurat property.
     * 
     */
    public short getOutProductLoanLoanMinLoanDurat() {
        return outProductLoanLoanMinLoanDurat;
    }

    /**
     * Sets the value of the outProductLoanLoanMinLoanDurat property.
     * 
     */
    public void setOutProductLoanLoanMinLoanDurat(short value) {
        this.outProductLoanLoanMinLoanDurat = value;
    }

    /**
     * Gets the value of the outProductLoanLoanMinPaymentAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutProductLoanLoanMinPaymentAmn() {
        return outProductLoanLoanMinPaymentAmn;
    }

    /**
     * Sets the value of the outProductLoanLoanMinPaymentAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutProductLoanLoanMinPaymentAmn(BigDecimal value) {
        this.outProductLoanLoanMinPaymentAmn = value;
    }

    /**
     * Gets the value of the outProductLoanLoanMinPaymentPerc property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutProductLoanLoanMinPaymentPerc() {
        return outProductLoanLoanMinPaymentPerc;
    }

    /**
     * Sets the value of the outProductLoanLoanMinPaymentPerc property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutProductLoanLoanMinPaymentPerc(BigDecimal value) {
        this.outProductLoanLoanMinPaymentPerc = value;
    }

    /**
     * Gets the value of the outProductLoanLoanMinRecycleDurat property.
     * 
     */
    public short getOutProductLoanLoanMinRecycleDurat() {
        return outProductLoanLoanMinRecycleDurat;
    }

    /**
     * Sets the value of the outProductLoanLoanMinRecycleDurat property.
     * 
     */
    public void setOutProductLoanLoanMinRecycleDurat(short value) {
        this.outProductLoanLoanMinRecycleDurat = value;
    }

    /**
     * Gets the value of the outProductLoanLoanMoratIntPayFlg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutProductLoanLoanMoratIntPayFlg() {
        return outProductLoanLoanMoratIntPayFlg;
    }

    /**
     * Sets the value of the outProductLoanLoanMoratIntPayFlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutProductLoanLoanMoratIntPayFlg(String value) {
        this.outProductLoanLoanMoratIntPayFlg = value;
    }

    /**
     * Gets the value of the outProductLoanLoanNoIntMoratorFlg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutProductLoanLoanNoIntMoratorFlg() {
        return outProductLoanLoanNoIntMoratorFlg;
    }

    /**
     * Sets the value of the outProductLoanLoanNoIntMoratorFlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutProductLoanLoanNoIntMoratorFlg(String value) {
        this.outProductLoanLoanNoIntMoratorFlg = value;
    }

    /**
     * Gets the value of the outProductLoanLoanNonIntCapitFlg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutProductLoanLoanNonIntCapitFlg() {
        return outProductLoanLoanNonIntCapitFlg;
    }

    /**
     * Sets the value of the outProductLoanLoanNonIntCapitFlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutProductLoanLoanNonIntCapitFlg(String value) {
        this.outProductLoanLoanNonIntCapitFlg = value;
    }

    /**
     * Gets the value of the outProductLoanLoanNrmInterestFreq property.
     * 
     */
    public short getOutProductLoanLoanNrmInterestFreq() {
        return outProductLoanLoanNrmInterestFreq;
    }

    /**
     * Sets the value of the outProductLoanLoanNrmInterestFreq property.
     * 
     */
    public void setOutProductLoanLoanNrmInterestFreq(short value) {
        this.outProductLoanLoanNrmInterestFreq = value;
    }

    /**
     * Gets the value of the outProductLoanLoanNrmInterestUnit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutProductLoanLoanNrmInterestUnit() {
        return outProductLoanLoanNrmInterestUnit;
    }

    /**
     * Sets the value of the outProductLoanLoanNrmInterestUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutProductLoanLoanNrmInterestUnit(String value) {
        this.outProductLoanLoanNrmInterestUnit = value;
    }

    /**
     * Gets the value of the outProductLoanLoanOvInterestFreq property.
     * 
     */
    public short getOutProductLoanLoanOvInterestFreq() {
        return outProductLoanLoanOvInterestFreq;
    }

    /**
     * Sets the value of the outProductLoanLoanOvInterestFreq property.
     * 
     */
    public void setOutProductLoanLoanOvInterestFreq(short value) {
        this.outProductLoanLoanOvInterestFreq = value;
    }

    /**
     * Gets the value of the outProductLoanLoanOvInterestUnit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutProductLoanLoanOvInterestUnit() {
        return outProductLoanLoanOvInterestUnit;
    }

    /**
     * Sets the value of the outProductLoanLoanOvInterestUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutProductLoanLoanOvInterestUnit(String value) {
        this.outProductLoanLoanOvInterestUnit = value;
    }

    /**
     * Gets the value of the outProductLoanLoanPeriodicIntFlg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutProductLoanLoanPeriodicIntFlg() {
        return outProductLoanLoanPeriodicIntFlg;
    }

    /**
     * Sets the value of the outProductLoanLoanPeriodicIntFlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutProductLoanLoanPeriodicIntFlg(String value) {
        this.outProductLoanLoanPeriodicIntFlg = value;
    }

    /**
     * Gets the value of the outProductLoanLoanRecycleUnit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutProductLoanLoanRecycleUnit() {
        return outProductLoanLoanRecycleUnit;
    }

    /**
     * Sets the value of the outProductLoanLoanRecycleUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutProductLoanLoanRecycleUnit(String value) {
        this.outProductLoanLoanRecycleUnit = value;
    }

    /**
     * Gets the value of the outProductLoanLoanRecyclingLmtFlg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutProductLoanLoanRecyclingLmtFlg() {
        return outProductLoanLoanRecyclingLmtFlg;
    }

    /**
     * Sets the value of the outProductLoanLoanRecyclingLmtFlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutProductLoanLoanRecyclingLmtFlg(String value) {
        this.outProductLoanLoanRecyclingLmtFlg = value;
    }

    /**
     * Gets the value of the outProductLoanLoanRenewalInterFlg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutProductLoanLoanRenewalInterFlg() {
        return outProductLoanLoanRenewalInterFlg;
    }

    /**
     * Sets the value of the outProductLoanLoanRenewalInterFlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutProductLoanLoanRenewalInterFlg(String value) {
        this.outProductLoanLoanRenewalInterFlg = value;
    }

    /**
     * Gets the value of the outProductLoanLoanSelectIntFlg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutProductLoanLoanSelectIntFlg() {
        return outProductLoanLoanSelectIntFlg;
    }

    /**
     * Sets the value of the outProductLoanLoanSelectIntFlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutProductLoanLoanSelectIntFlg(String value) {
        this.outProductLoanLoanSelectIntFlg = value;
    }

    /**
     * Gets the value of the outProductLoanLoanTolDays1 property.
     * 
     */
    public short getOutProductLoanLoanTolDays1() {
        return outProductLoanLoanTolDays1;
    }

    /**
     * Sets the value of the outProductLoanLoanTolDays1 property.
     * 
     */
    public void setOutProductLoanLoanTolDays1(short value) {
        this.outProductLoanLoanTolDays1 = value;
    }

    /**
     * Gets the value of the outProductLoanLoanTolDays2 property.
     * 
     */
    public short getOutProductLoanLoanTolDays2() {
        return outProductLoanLoanTolDays2;
    }

    /**
     * Sets the value of the outProductLoanLoanTolDays2 property.
     * 
     */
    public void setOutProductLoanLoanTolDays2(short value) {
        this.outProductLoanLoanTolDays2 = value;
    }

    /**
     * Gets the value of the outProductLoanLoanTolDays3 property.
     * 
     */
    public short getOutProductLoanLoanTolDays3() {
        return outProductLoanLoanTolDays3;
    }

    /**
     * Sets the value of the outProductLoanLoanTolDays3 property.
     * 
     */
    public void setOutProductLoanLoanTolDays3(short value) {
        this.outProductLoanLoanTolDays3 = value;
    }

    /**
     * Gets the value of the outProductLoanLoanTolDays5 property.
     * 
     */
    public short getOutProductLoanLoanTolDays5() {
        return outProductLoanLoanTolDays5;
    }

    /**
     * Sets the value of the outProductLoanLoanTolDays5 property.
     * 
     */
    public void setOutProductLoanLoanTolDays5(short value) {
        this.outProductLoanLoanTolDays5 = value;
    }

    /**
     * Gets the value of the outProductLoanLoanToleranceDays property.
     * 
     */
    public short getOutProductLoanLoanToleranceDays() {
        return outProductLoanLoanToleranceDays;
    }

    /**
     * Sets the value of the outProductLoanLoanToleranceDays property.
     * 
     */
    public void setOutProductLoanLoanToleranceDays(short value) {
        this.outProductLoanLoanToleranceDays = value;
    }

    /**
     * Gets the value of the outGrpInterest property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfRI215VLOutGrpInterestItem }
     *     
     */
    public ArrayOfRI215VLOutGrpInterestItem getOutGrpInterest() {
        return outGrpInterest;
    }

    /**
     * Sets the value of the outGrpInterest property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfRI215VLOutGrpInterestItem }
     *     
     */
    public void setOutGrpInterest(ArrayOfRI215VLOutGrpInterestItem value) {
        this.outGrpInterest = value;
    }

}
