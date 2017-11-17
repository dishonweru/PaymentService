
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for I0172VProfitabilityExport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="I0172VProfitabilityExport">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}BaseExport">
 *       &lt;sequence>
 *         &lt;element name="OutSetupCustomerProfitabilityYearTo" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutSetupCustomerProfitabilityYearFrom" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutSetupCustomerProfitabilityTotValeurProdDb" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutSetupCustomerProfitabilityTotValeurProdCr" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutSetupCustomerProfitabilityTotPenalty" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutSetupCustomerProfitabilityTotInterestDb" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutSetupCustomerProfitabilityTotInterestCr" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutSetupCustomerProfitabilityTotExpenses" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutSetupCustomerProfitabilityTotCommission" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutSetupCustomerProfitabilityTotCapitalDb" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutSetupCustomerProfitabilityTotCapitalCr" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutSetupCustomerProfitabilityTotAccProdDb" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutSetupCustomerProfitabilityTotAccProdCr" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutSetupCustomerProfitabilityTotAccLimit" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutSetupCustomerProfitabilityMonthTo" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutSetupCustomerProfitabilityMonthFrom" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutSetupCustomerProfitabilityCalcWeighted" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutSetupCustomerProfitabilityCalcMonthDuration" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutSetupCustomerProfitabilityCalcIncome" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutSetupCustomerProfitabilityCalcComposite" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutSetupCustomerProfitabilityCalcAvDbBal" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutPrintoutValidationInputVoucherLine" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutContinueCustomerPositionPosYear" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutContinueAccountCustomerPositionPosYear" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutContinueAccountCustomerPositionAccProdNumber" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OutClientProfitsExitStateWorkValruleSnum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutClientProfitsExitStateWorkValruleId" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OutClientProfitsExitStateWorkTerminationAction" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutClientProfitsExitStateWorkRoutineSn" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OutClientProfitsExitStateWorkPrftSystem" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutClientProfitsExitStateWorkMessageType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutClientProfitsExitStateWorkLanguage" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutClientProfitsExitStateWorkId" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OutClientProfitsExitStateWorkActualMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Out1GrpYear" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}ArrayOfOut1GrpYearItem" minOccurs="0"/>
 *         &lt;element name="Out2GrpMonth" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}ArrayOfOut2GrpMonthItem" minOccurs="0"/>
 *         &lt;element name="Out3GrpAccountYear" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}ArrayOfOut3GrpAccountYearItem" minOccurs="0"/>
 *         &lt;element name="Out4GrpAccountMonth" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}ArrayOfOut4GrpAccountMonthItem" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "I0172VProfitabilityExport", propOrder = {
    "outSetupCustomerProfitabilityYearTo",
    "outSetupCustomerProfitabilityYearFrom",
    "outSetupCustomerProfitabilityTotValeurProdDb",
    "outSetupCustomerProfitabilityTotValeurProdCr",
    "outSetupCustomerProfitabilityTotPenalty",
    "outSetupCustomerProfitabilityTotInterestDb",
    "outSetupCustomerProfitabilityTotInterestCr",
    "outSetupCustomerProfitabilityTotExpenses",
    "outSetupCustomerProfitabilityTotCommission",
    "outSetupCustomerProfitabilityTotCapitalDb",
    "outSetupCustomerProfitabilityTotCapitalCr",
    "outSetupCustomerProfitabilityTotAccProdDb",
    "outSetupCustomerProfitabilityTotAccProdCr",
    "outSetupCustomerProfitabilityTotAccLimit",
    "outSetupCustomerProfitabilityMonthTo",
    "outSetupCustomerProfitabilityMonthFrom",
    "outSetupCustomerProfitabilityCalcWeighted",
    "outSetupCustomerProfitabilityCalcMonthDuration",
    "outSetupCustomerProfitabilityCalcIncome",
    "outSetupCustomerProfitabilityCalcComposite",
    "outSetupCustomerProfitabilityCalcAvDbBal",
    "outPrintoutValidationInputVoucherLine",
    "outContinueCustomerPositionPosYear",
    "outContinueAccountCustomerPositionPosYear",
    "outContinueAccountCustomerPositionAccProdNumber",
    "outClientProfitsExitStateWorkValruleSnum",
    "outClientProfitsExitStateWorkValruleId",
    "outClientProfitsExitStateWorkTerminationAction",
    "outClientProfitsExitStateWorkRoutineSn",
    "outClientProfitsExitStateWorkPrftSystem",
    "outClientProfitsExitStateWorkMessageType",
    "outClientProfitsExitStateWorkLanguage",
    "outClientProfitsExitStateWorkId",
    "outClientProfitsExitStateWorkActualMessage",
    "out1GrpYear",
    "out2GrpMonth",
    "out3GrpAccountYear",
    "out4GrpAccountMonth"
})
public class I0172VProfitabilityExport
    extends BaseExport
{

    @XmlElement(name = "OutSetupCustomerProfitabilityYearTo")
    protected short outSetupCustomerProfitabilityYearTo;
    @XmlElement(name = "OutSetupCustomerProfitabilityYearFrom")
    protected short outSetupCustomerProfitabilityYearFrom;
    @XmlElement(name = "OutSetupCustomerProfitabilityTotValeurProdDb", required = true)
    protected BigDecimal outSetupCustomerProfitabilityTotValeurProdDb;
    @XmlElement(name = "OutSetupCustomerProfitabilityTotValeurProdCr", required = true)
    protected BigDecimal outSetupCustomerProfitabilityTotValeurProdCr;
    @XmlElement(name = "OutSetupCustomerProfitabilityTotPenalty", required = true)
    protected BigDecimal outSetupCustomerProfitabilityTotPenalty;
    @XmlElement(name = "OutSetupCustomerProfitabilityTotInterestDb", required = true)
    protected BigDecimal outSetupCustomerProfitabilityTotInterestDb;
    @XmlElement(name = "OutSetupCustomerProfitabilityTotInterestCr", required = true)
    protected BigDecimal outSetupCustomerProfitabilityTotInterestCr;
    @XmlElement(name = "OutSetupCustomerProfitabilityTotExpenses", required = true)
    protected BigDecimal outSetupCustomerProfitabilityTotExpenses;
    @XmlElement(name = "OutSetupCustomerProfitabilityTotCommission", required = true)
    protected BigDecimal outSetupCustomerProfitabilityTotCommission;
    @XmlElement(name = "OutSetupCustomerProfitabilityTotCapitalDb", required = true)
    protected BigDecimal outSetupCustomerProfitabilityTotCapitalDb;
    @XmlElement(name = "OutSetupCustomerProfitabilityTotCapitalCr", required = true)
    protected BigDecimal outSetupCustomerProfitabilityTotCapitalCr;
    @XmlElement(name = "OutSetupCustomerProfitabilityTotAccProdDb", required = true)
    protected BigDecimal outSetupCustomerProfitabilityTotAccProdDb;
    @XmlElement(name = "OutSetupCustomerProfitabilityTotAccProdCr", required = true)
    protected BigDecimal outSetupCustomerProfitabilityTotAccProdCr;
    @XmlElement(name = "OutSetupCustomerProfitabilityTotAccLimit", required = true)
    protected BigDecimal outSetupCustomerProfitabilityTotAccLimit;
    @XmlElement(name = "OutSetupCustomerProfitabilityMonthTo")
    protected short outSetupCustomerProfitabilityMonthTo;
    @XmlElement(name = "OutSetupCustomerProfitabilityMonthFrom")
    protected short outSetupCustomerProfitabilityMonthFrom;
    @XmlElement(name = "OutSetupCustomerProfitabilityCalcWeighted", required = true)
    protected BigDecimal outSetupCustomerProfitabilityCalcWeighted;
    @XmlElement(name = "OutSetupCustomerProfitabilityCalcMonthDuration")
    protected int outSetupCustomerProfitabilityCalcMonthDuration;
    @XmlElement(name = "OutSetupCustomerProfitabilityCalcIncome", required = true)
    protected BigDecimal outSetupCustomerProfitabilityCalcIncome;
    @XmlElement(name = "OutSetupCustomerProfitabilityCalcComposite", required = true)
    protected BigDecimal outSetupCustomerProfitabilityCalcComposite;
    @XmlElement(name = "OutSetupCustomerProfitabilityCalcAvDbBal", required = true)
    protected BigDecimal outSetupCustomerProfitabilityCalcAvDbBal;
    @XmlElement(name = "OutPrintoutValidationInputVoucherLine")
    protected String outPrintoutValidationInputVoucherLine;
    @XmlElement(name = "OutContinueCustomerPositionPosYear")
    protected short outContinueCustomerPositionPosYear;
    @XmlElement(name = "OutContinueAccountCustomerPositionPosYear")
    protected short outContinueAccountCustomerPositionPosYear;
    @XmlElement(name = "OutContinueAccountCustomerPositionAccProdNumber")
    protected double outContinueAccountCustomerPositionAccProdNumber;
    @XmlElement(name = "OutClientProfitsExitStateWorkValruleSnum")
    protected int outClientProfitsExitStateWorkValruleSnum;
    @XmlElement(name = "OutClientProfitsExitStateWorkValruleId")
    protected double outClientProfitsExitStateWorkValruleId;
    @XmlElement(name = "OutClientProfitsExitStateWorkTerminationAction")
    protected String outClientProfitsExitStateWorkTerminationAction;
    @XmlElement(name = "OutClientProfitsExitStateWorkRoutineSn")
    protected double outClientProfitsExitStateWorkRoutineSn;
    @XmlElement(name = "OutClientProfitsExitStateWorkPrftSystem")
    protected short outClientProfitsExitStateWorkPrftSystem;
    @XmlElement(name = "OutClientProfitsExitStateWorkMessageType")
    protected String outClientProfitsExitStateWorkMessageType;
    @XmlElement(name = "OutClientProfitsExitStateWorkLanguage")
    protected int outClientProfitsExitStateWorkLanguage;
    @XmlElement(name = "OutClientProfitsExitStateWorkId")
    protected double outClientProfitsExitStateWorkId;
    @XmlElement(name = "OutClientProfitsExitStateWorkActualMessage")
    protected String outClientProfitsExitStateWorkActualMessage;
    @XmlElement(name = "Out1GrpYear")
    protected ArrayOfOut1GrpYearItem out1GrpYear;
    @XmlElement(name = "Out2GrpMonth")
    protected ArrayOfOut2GrpMonthItem out2GrpMonth;
    @XmlElement(name = "Out3GrpAccountYear")
    protected ArrayOfOut3GrpAccountYearItem out3GrpAccountYear;
    @XmlElement(name = "Out4GrpAccountMonth")
    protected ArrayOfOut4GrpAccountMonthItem out4GrpAccountMonth;

    /**
     * Gets the value of the outSetupCustomerProfitabilityYearTo property.
     * 
     */
    public short getOutSetupCustomerProfitabilityYearTo() {
        return outSetupCustomerProfitabilityYearTo;
    }

    /**
     * Sets the value of the outSetupCustomerProfitabilityYearTo property.
     * 
     */
    public void setOutSetupCustomerProfitabilityYearTo(short value) {
        this.outSetupCustomerProfitabilityYearTo = value;
    }

    /**
     * Gets the value of the outSetupCustomerProfitabilityYearFrom property.
     * 
     */
    public short getOutSetupCustomerProfitabilityYearFrom() {
        return outSetupCustomerProfitabilityYearFrom;
    }

    /**
     * Sets the value of the outSetupCustomerProfitabilityYearFrom property.
     * 
     */
    public void setOutSetupCustomerProfitabilityYearFrom(short value) {
        this.outSetupCustomerProfitabilityYearFrom = value;
    }

    /**
     * Gets the value of the outSetupCustomerProfitabilityTotValeurProdDb property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutSetupCustomerProfitabilityTotValeurProdDb() {
        return outSetupCustomerProfitabilityTotValeurProdDb;
    }

    /**
     * Sets the value of the outSetupCustomerProfitabilityTotValeurProdDb property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutSetupCustomerProfitabilityTotValeurProdDb(BigDecimal value) {
        this.outSetupCustomerProfitabilityTotValeurProdDb = value;
    }

    /**
     * Gets the value of the outSetupCustomerProfitabilityTotValeurProdCr property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutSetupCustomerProfitabilityTotValeurProdCr() {
        return outSetupCustomerProfitabilityTotValeurProdCr;
    }

    /**
     * Sets the value of the outSetupCustomerProfitabilityTotValeurProdCr property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutSetupCustomerProfitabilityTotValeurProdCr(BigDecimal value) {
        this.outSetupCustomerProfitabilityTotValeurProdCr = value;
    }

    /**
     * Gets the value of the outSetupCustomerProfitabilityTotPenalty property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutSetupCustomerProfitabilityTotPenalty() {
        return outSetupCustomerProfitabilityTotPenalty;
    }

    /**
     * Sets the value of the outSetupCustomerProfitabilityTotPenalty property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutSetupCustomerProfitabilityTotPenalty(BigDecimal value) {
        this.outSetupCustomerProfitabilityTotPenalty = value;
    }

    /**
     * Gets the value of the outSetupCustomerProfitabilityTotInterestDb property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutSetupCustomerProfitabilityTotInterestDb() {
        return outSetupCustomerProfitabilityTotInterestDb;
    }

    /**
     * Sets the value of the outSetupCustomerProfitabilityTotInterestDb property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutSetupCustomerProfitabilityTotInterestDb(BigDecimal value) {
        this.outSetupCustomerProfitabilityTotInterestDb = value;
    }

    /**
     * Gets the value of the outSetupCustomerProfitabilityTotInterestCr property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutSetupCustomerProfitabilityTotInterestCr() {
        return outSetupCustomerProfitabilityTotInterestCr;
    }

    /**
     * Sets the value of the outSetupCustomerProfitabilityTotInterestCr property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutSetupCustomerProfitabilityTotInterestCr(BigDecimal value) {
        this.outSetupCustomerProfitabilityTotInterestCr = value;
    }

    /**
     * Gets the value of the outSetupCustomerProfitabilityTotExpenses property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutSetupCustomerProfitabilityTotExpenses() {
        return outSetupCustomerProfitabilityTotExpenses;
    }

    /**
     * Sets the value of the outSetupCustomerProfitabilityTotExpenses property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutSetupCustomerProfitabilityTotExpenses(BigDecimal value) {
        this.outSetupCustomerProfitabilityTotExpenses = value;
    }

    /**
     * Gets the value of the outSetupCustomerProfitabilityTotCommission property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutSetupCustomerProfitabilityTotCommission() {
        return outSetupCustomerProfitabilityTotCommission;
    }

    /**
     * Sets the value of the outSetupCustomerProfitabilityTotCommission property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutSetupCustomerProfitabilityTotCommission(BigDecimal value) {
        this.outSetupCustomerProfitabilityTotCommission = value;
    }

    /**
     * Gets the value of the outSetupCustomerProfitabilityTotCapitalDb property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutSetupCustomerProfitabilityTotCapitalDb() {
        return outSetupCustomerProfitabilityTotCapitalDb;
    }

    /**
     * Sets the value of the outSetupCustomerProfitabilityTotCapitalDb property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutSetupCustomerProfitabilityTotCapitalDb(BigDecimal value) {
        this.outSetupCustomerProfitabilityTotCapitalDb = value;
    }

    /**
     * Gets the value of the outSetupCustomerProfitabilityTotCapitalCr property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutSetupCustomerProfitabilityTotCapitalCr() {
        return outSetupCustomerProfitabilityTotCapitalCr;
    }

    /**
     * Sets the value of the outSetupCustomerProfitabilityTotCapitalCr property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutSetupCustomerProfitabilityTotCapitalCr(BigDecimal value) {
        this.outSetupCustomerProfitabilityTotCapitalCr = value;
    }

    /**
     * Gets the value of the outSetupCustomerProfitabilityTotAccProdDb property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutSetupCustomerProfitabilityTotAccProdDb() {
        return outSetupCustomerProfitabilityTotAccProdDb;
    }

    /**
     * Sets the value of the outSetupCustomerProfitabilityTotAccProdDb property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutSetupCustomerProfitabilityTotAccProdDb(BigDecimal value) {
        this.outSetupCustomerProfitabilityTotAccProdDb = value;
    }

    /**
     * Gets the value of the outSetupCustomerProfitabilityTotAccProdCr property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutSetupCustomerProfitabilityTotAccProdCr() {
        return outSetupCustomerProfitabilityTotAccProdCr;
    }

    /**
     * Sets the value of the outSetupCustomerProfitabilityTotAccProdCr property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutSetupCustomerProfitabilityTotAccProdCr(BigDecimal value) {
        this.outSetupCustomerProfitabilityTotAccProdCr = value;
    }

    /**
     * Gets the value of the outSetupCustomerProfitabilityTotAccLimit property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutSetupCustomerProfitabilityTotAccLimit() {
        return outSetupCustomerProfitabilityTotAccLimit;
    }

    /**
     * Sets the value of the outSetupCustomerProfitabilityTotAccLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutSetupCustomerProfitabilityTotAccLimit(BigDecimal value) {
        this.outSetupCustomerProfitabilityTotAccLimit = value;
    }

    /**
     * Gets the value of the outSetupCustomerProfitabilityMonthTo property.
     * 
     */
    public short getOutSetupCustomerProfitabilityMonthTo() {
        return outSetupCustomerProfitabilityMonthTo;
    }

    /**
     * Sets the value of the outSetupCustomerProfitabilityMonthTo property.
     * 
     */
    public void setOutSetupCustomerProfitabilityMonthTo(short value) {
        this.outSetupCustomerProfitabilityMonthTo = value;
    }

    /**
     * Gets the value of the outSetupCustomerProfitabilityMonthFrom property.
     * 
     */
    public short getOutSetupCustomerProfitabilityMonthFrom() {
        return outSetupCustomerProfitabilityMonthFrom;
    }

    /**
     * Sets the value of the outSetupCustomerProfitabilityMonthFrom property.
     * 
     */
    public void setOutSetupCustomerProfitabilityMonthFrom(short value) {
        this.outSetupCustomerProfitabilityMonthFrom = value;
    }

    /**
     * Gets the value of the outSetupCustomerProfitabilityCalcWeighted property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutSetupCustomerProfitabilityCalcWeighted() {
        return outSetupCustomerProfitabilityCalcWeighted;
    }

    /**
     * Sets the value of the outSetupCustomerProfitabilityCalcWeighted property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutSetupCustomerProfitabilityCalcWeighted(BigDecimal value) {
        this.outSetupCustomerProfitabilityCalcWeighted = value;
    }

    /**
     * Gets the value of the outSetupCustomerProfitabilityCalcMonthDuration property.
     * 
     */
    public int getOutSetupCustomerProfitabilityCalcMonthDuration() {
        return outSetupCustomerProfitabilityCalcMonthDuration;
    }

    /**
     * Sets the value of the outSetupCustomerProfitabilityCalcMonthDuration property.
     * 
     */
    public void setOutSetupCustomerProfitabilityCalcMonthDuration(int value) {
        this.outSetupCustomerProfitabilityCalcMonthDuration = value;
    }

    /**
     * Gets the value of the outSetupCustomerProfitabilityCalcIncome property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutSetupCustomerProfitabilityCalcIncome() {
        return outSetupCustomerProfitabilityCalcIncome;
    }

    /**
     * Sets the value of the outSetupCustomerProfitabilityCalcIncome property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutSetupCustomerProfitabilityCalcIncome(BigDecimal value) {
        this.outSetupCustomerProfitabilityCalcIncome = value;
    }

    /**
     * Gets the value of the outSetupCustomerProfitabilityCalcComposite property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutSetupCustomerProfitabilityCalcComposite() {
        return outSetupCustomerProfitabilityCalcComposite;
    }

    /**
     * Sets the value of the outSetupCustomerProfitabilityCalcComposite property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutSetupCustomerProfitabilityCalcComposite(BigDecimal value) {
        this.outSetupCustomerProfitabilityCalcComposite = value;
    }

    /**
     * Gets the value of the outSetupCustomerProfitabilityCalcAvDbBal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutSetupCustomerProfitabilityCalcAvDbBal() {
        return outSetupCustomerProfitabilityCalcAvDbBal;
    }

    /**
     * Sets the value of the outSetupCustomerProfitabilityCalcAvDbBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutSetupCustomerProfitabilityCalcAvDbBal(BigDecimal value) {
        this.outSetupCustomerProfitabilityCalcAvDbBal = value;
    }

    /**
     * Gets the value of the outPrintoutValidationInputVoucherLine property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutPrintoutValidationInputVoucherLine() {
        return outPrintoutValidationInputVoucherLine;
    }

    /**
     * Sets the value of the outPrintoutValidationInputVoucherLine property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutPrintoutValidationInputVoucherLine(String value) {
        this.outPrintoutValidationInputVoucherLine = value;
    }

    /**
     * Gets the value of the outContinueCustomerPositionPosYear property.
     * 
     */
    public short getOutContinueCustomerPositionPosYear() {
        return outContinueCustomerPositionPosYear;
    }

    /**
     * Sets the value of the outContinueCustomerPositionPosYear property.
     * 
     */
    public void setOutContinueCustomerPositionPosYear(short value) {
        this.outContinueCustomerPositionPosYear = value;
    }

    /**
     * Gets the value of the outContinueAccountCustomerPositionPosYear property.
     * 
     */
    public short getOutContinueAccountCustomerPositionPosYear() {
        return outContinueAccountCustomerPositionPosYear;
    }

    /**
     * Sets the value of the outContinueAccountCustomerPositionPosYear property.
     * 
     */
    public void setOutContinueAccountCustomerPositionPosYear(short value) {
        this.outContinueAccountCustomerPositionPosYear = value;
    }

    /**
     * Gets the value of the outContinueAccountCustomerPositionAccProdNumber property.
     * 
     */
    public double getOutContinueAccountCustomerPositionAccProdNumber() {
        return outContinueAccountCustomerPositionAccProdNumber;
    }

    /**
     * Sets the value of the outContinueAccountCustomerPositionAccProdNumber property.
     * 
     */
    public void setOutContinueAccountCustomerPositionAccProdNumber(double value) {
        this.outContinueAccountCustomerPositionAccProdNumber = value;
    }

    /**
     * Gets the value of the outClientProfitsExitStateWorkValruleSnum property.
     * 
     */
    public int getOutClientProfitsExitStateWorkValruleSnum() {
        return outClientProfitsExitStateWorkValruleSnum;
    }

    /**
     * Sets the value of the outClientProfitsExitStateWorkValruleSnum property.
     * 
     */
    public void setOutClientProfitsExitStateWorkValruleSnum(int value) {
        this.outClientProfitsExitStateWorkValruleSnum = value;
    }

    /**
     * Gets the value of the outClientProfitsExitStateWorkValruleId property.
     * 
     */
    public double getOutClientProfitsExitStateWorkValruleId() {
        return outClientProfitsExitStateWorkValruleId;
    }

    /**
     * Sets the value of the outClientProfitsExitStateWorkValruleId property.
     * 
     */
    public void setOutClientProfitsExitStateWorkValruleId(double value) {
        this.outClientProfitsExitStateWorkValruleId = value;
    }

    /**
     * Gets the value of the outClientProfitsExitStateWorkTerminationAction property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutClientProfitsExitStateWorkTerminationAction() {
        return outClientProfitsExitStateWorkTerminationAction;
    }

    /**
     * Sets the value of the outClientProfitsExitStateWorkTerminationAction property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutClientProfitsExitStateWorkTerminationAction(String value) {
        this.outClientProfitsExitStateWorkTerminationAction = value;
    }

    /**
     * Gets the value of the outClientProfitsExitStateWorkRoutineSn property.
     * 
     */
    public double getOutClientProfitsExitStateWorkRoutineSn() {
        return outClientProfitsExitStateWorkRoutineSn;
    }

    /**
     * Sets the value of the outClientProfitsExitStateWorkRoutineSn property.
     * 
     */
    public void setOutClientProfitsExitStateWorkRoutineSn(double value) {
        this.outClientProfitsExitStateWorkRoutineSn = value;
    }

    /**
     * Gets the value of the outClientProfitsExitStateWorkPrftSystem property.
     * 
     */
    public short getOutClientProfitsExitStateWorkPrftSystem() {
        return outClientProfitsExitStateWorkPrftSystem;
    }

    /**
     * Sets the value of the outClientProfitsExitStateWorkPrftSystem property.
     * 
     */
    public void setOutClientProfitsExitStateWorkPrftSystem(short value) {
        this.outClientProfitsExitStateWorkPrftSystem = value;
    }

    /**
     * Gets the value of the outClientProfitsExitStateWorkMessageType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutClientProfitsExitStateWorkMessageType() {
        return outClientProfitsExitStateWorkMessageType;
    }

    /**
     * Sets the value of the outClientProfitsExitStateWorkMessageType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutClientProfitsExitStateWorkMessageType(String value) {
        this.outClientProfitsExitStateWorkMessageType = value;
    }

    /**
     * Gets the value of the outClientProfitsExitStateWorkLanguage property.
     * 
     */
    public int getOutClientProfitsExitStateWorkLanguage() {
        return outClientProfitsExitStateWorkLanguage;
    }

    /**
     * Sets the value of the outClientProfitsExitStateWorkLanguage property.
     * 
     */
    public void setOutClientProfitsExitStateWorkLanguage(int value) {
        this.outClientProfitsExitStateWorkLanguage = value;
    }

    /**
     * Gets the value of the outClientProfitsExitStateWorkId property.
     * 
     */
    public double getOutClientProfitsExitStateWorkId() {
        return outClientProfitsExitStateWorkId;
    }

    /**
     * Sets the value of the outClientProfitsExitStateWorkId property.
     * 
     */
    public void setOutClientProfitsExitStateWorkId(double value) {
        this.outClientProfitsExitStateWorkId = value;
    }

    /**
     * Gets the value of the outClientProfitsExitStateWorkActualMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutClientProfitsExitStateWorkActualMessage() {
        return outClientProfitsExitStateWorkActualMessage;
    }

    /**
     * Sets the value of the outClientProfitsExitStateWorkActualMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutClientProfitsExitStateWorkActualMessage(String value) {
        this.outClientProfitsExitStateWorkActualMessage = value;
    }

    /**
     * Gets the value of the out1GrpYear property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfOut1GrpYearItem }
     *     
     */
    public ArrayOfOut1GrpYearItem getOut1GrpYear() {
        return out1GrpYear;
    }

    /**
     * Sets the value of the out1GrpYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfOut1GrpYearItem }
     *     
     */
    public void setOut1GrpYear(ArrayOfOut1GrpYearItem value) {
        this.out1GrpYear = value;
    }

    /**
     * Gets the value of the out2GrpMonth property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfOut2GrpMonthItem }
     *     
     */
    public ArrayOfOut2GrpMonthItem getOut2GrpMonth() {
        return out2GrpMonth;
    }

    /**
     * Sets the value of the out2GrpMonth property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfOut2GrpMonthItem }
     *     
     */
    public void setOut2GrpMonth(ArrayOfOut2GrpMonthItem value) {
        this.out2GrpMonth = value;
    }

    /**
     * Gets the value of the out3GrpAccountYear property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfOut3GrpAccountYearItem }
     *     
     */
    public ArrayOfOut3GrpAccountYearItem getOut3GrpAccountYear() {
        return out3GrpAccountYear;
    }

    /**
     * Sets the value of the out3GrpAccountYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfOut3GrpAccountYearItem }
     *     
     */
    public void setOut3GrpAccountYear(ArrayOfOut3GrpAccountYearItem value) {
        this.out3GrpAccountYear = value;
    }

    /**
     * Gets the value of the out4GrpAccountMonth property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfOut4GrpAccountMonthItem }
     *     
     */
    public ArrayOfOut4GrpAccountMonthItem getOut4GrpAccountMonth() {
        return out4GrpAccountMonth;
    }

    /**
     * Sets the value of the out4GrpAccountMonth property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfOut4GrpAccountMonthItem }
     *     
     */
    public void setOut4GrpAccountMonth(ArrayOfOut4GrpAccountMonthItem value) {
        this.out4GrpAccountMonth = value;
    }

}
