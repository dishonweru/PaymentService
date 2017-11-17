
package com.intrasoft_internatinal.gatewayservice.profitsext;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for I0172VProfitabilityImport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="I0172VProfitabilityImport">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}BaseImport">
 *       &lt;sequence>
 *         &lt;element name="Command" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCommandIefSuppliedCommand" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCriteriaCustomerProfitabilityMonthFrom" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InCriteriaCustomerProfitabilityYearFrom" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InCriteriaCustomerProfitabilityMonthTo" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InCriteriaCustomerProfitabilityYearTo" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InSelectedCustomerCustId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InSelectedCustomerCDigit" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InSelectedCustomerPositionAccProdNumber" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="InSelectedProfitsAccountAccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InSelectedProfitsAccountPrftSystem" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InSpecificAccountProfitsAccountAccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InSpecificAccountProfitsAccountPrftSystem" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InTrxDcdRuleId" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="InTrxDcdRulePrftSystem" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InTrxDcdRuleSnum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InTrxLanguageDcdLanguageId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InContinueAccountCustomerPositionPosYear" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InContinueAccountCustomerPositionAccProdNumber" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="InContinueCustomerPositionPosYear" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "I0172VProfitabilityImport", propOrder = {
    "command",
    "inCommandIefSuppliedCommand",
    "inCriteriaCustomerProfitabilityMonthFrom",
    "inCriteriaCustomerProfitabilityYearFrom",
    "inCriteriaCustomerProfitabilityMonthTo",
    "inCriteriaCustomerProfitabilityYearTo",
    "inSelectedCustomerCustId",
    "inSelectedCustomerCDigit",
    "inSelectedCustomerPositionAccProdNumber",
    "inSelectedProfitsAccountAccountNumber",
    "inSelectedProfitsAccountPrftSystem",
    "inSpecificAccountProfitsAccountAccountNumber",
    "inSpecificAccountProfitsAccountPrftSystem",
    "inTrxDcdRuleId",
    "inTrxDcdRulePrftSystem",
    "inTrxDcdRuleSnum",
    "inTrxLanguageDcdLanguageId",
    "inContinueAccountCustomerPositionPosYear",
    "inContinueAccountCustomerPositionAccProdNumber",
    "inContinueCustomerPositionPosYear"
})
public class I0172VProfitabilityImport
    extends BaseImport
{

    @XmlElement(name = "Command")
    protected String command;
    @XmlElement(name = "InCommandIefSuppliedCommand")
    protected String inCommandIefSuppliedCommand;
    @XmlElement(name = "InCriteriaCustomerProfitabilityMonthFrom")
    protected short inCriteriaCustomerProfitabilityMonthFrom;
    @XmlElement(name = "InCriteriaCustomerProfitabilityYearFrom")
    protected short inCriteriaCustomerProfitabilityYearFrom;
    @XmlElement(name = "InCriteriaCustomerProfitabilityMonthTo")
    protected short inCriteriaCustomerProfitabilityMonthTo;
    @XmlElement(name = "InCriteriaCustomerProfitabilityYearTo")
    protected short inCriteriaCustomerProfitabilityYearTo;
    @XmlElement(name = "InSelectedCustomerCustId")
    protected int inSelectedCustomerCustId;
    @XmlElement(name = "InSelectedCustomerCDigit")
    protected short inSelectedCustomerCDigit;
    @XmlElement(name = "InSelectedCustomerPositionAccProdNumber")
    protected double inSelectedCustomerPositionAccProdNumber;
    @XmlElement(name = "InSelectedProfitsAccountAccountNumber")
    protected String inSelectedProfitsAccountAccountNumber;
    @XmlElement(name = "InSelectedProfitsAccountPrftSystem")
    protected short inSelectedProfitsAccountPrftSystem;
    @XmlElement(name = "InSpecificAccountProfitsAccountAccountNumber")
    protected String inSpecificAccountProfitsAccountAccountNumber;
    @XmlElement(name = "InSpecificAccountProfitsAccountPrftSystem")
    protected short inSpecificAccountProfitsAccountPrftSystem;
    @XmlElement(name = "InTrxDcdRuleId")
    protected double inTrxDcdRuleId;
    @XmlElement(name = "InTrxDcdRulePrftSystem")
    protected short inTrxDcdRulePrftSystem;
    @XmlElement(name = "InTrxDcdRuleSnum")
    protected int inTrxDcdRuleSnum;
    @XmlElement(name = "InTrxLanguageDcdLanguageId")
    protected int inTrxLanguageDcdLanguageId;
    @XmlElement(name = "InContinueAccountCustomerPositionPosYear")
    protected short inContinueAccountCustomerPositionPosYear;
    @XmlElement(name = "InContinueAccountCustomerPositionAccProdNumber")
    protected double inContinueAccountCustomerPositionAccProdNumber;
    @XmlElement(name = "InContinueCustomerPositionPosYear")
    protected short inContinueCustomerPositionPosYear;

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
     * Gets the value of the inCommandIefSuppliedCommand property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCommandIefSuppliedCommand() {
        return inCommandIefSuppliedCommand;
    }

    /**
     * Sets the value of the inCommandIefSuppliedCommand property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCommandIefSuppliedCommand(String value) {
        this.inCommandIefSuppliedCommand = value;
    }

    /**
     * Gets the value of the inCriteriaCustomerProfitabilityMonthFrom property.
     * 
     */
    public short getInCriteriaCustomerProfitabilityMonthFrom() {
        return inCriteriaCustomerProfitabilityMonthFrom;
    }

    /**
     * Sets the value of the inCriteriaCustomerProfitabilityMonthFrom property.
     * 
     */
    public void setInCriteriaCustomerProfitabilityMonthFrom(short value) {
        this.inCriteriaCustomerProfitabilityMonthFrom = value;
    }

    /**
     * Gets the value of the inCriteriaCustomerProfitabilityYearFrom property.
     * 
     */
    public short getInCriteriaCustomerProfitabilityYearFrom() {
        return inCriteriaCustomerProfitabilityYearFrom;
    }

    /**
     * Sets the value of the inCriteriaCustomerProfitabilityYearFrom property.
     * 
     */
    public void setInCriteriaCustomerProfitabilityYearFrom(short value) {
        this.inCriteriaCustomerProfitabilityYearFrom = value;
    }

    /**
     * Gets the value of the inCriteriaCustomerProfitabilityMonthTo property.
     * 
     */
    public short getInCriteriaCustomerProfitabilityMonthTo() {
        return inCriteriaCustomerProfitabilityMonthTo;
    }

    /**
     * Sets the value of the inCriteriaCustomerProfitabilityMonthTo property.
     * 
     */
    public void setInCriteriaCustomerProfitabilityMonthTo(short value) {
        this.inCriteriaCustomerProfitabilityMonthTo = value;
    }

    /**
     * Gets the value of the inCriteriaCustomerProfitabilityYearTo property.
     * 
     */
    public short getInCriteriaCustomerProfitabilityYearTo() {
        return inCriteriaCustomerProfitabilityYearTo;
    }

    /**
     * Sets the value of the inCriteriaCustomerProfitabilityYearTo property.
     * 
     */
    public void setInCriteriaCustomerProfitabilityYearTo(short value) {
        this.inCriteriaCustomerProfitabilityYearTo = value;
    }

    /**
     * Gets the value of the inSelectedCustomerCustId property.
     * 
     */
    public int getInSelectedCustomerCustId() {
        return inSelectedCustomerCustId;
    }

    /**
     * Sets the value of the inSelectedCustomerCustId property.
     * 
     */
    public void setInSelectedCustomerCustId(int value) {
        this.inSelectedCustomerCustId = value;
    }

    /**
     * Gets the value of the inSelectedCustomerCDigit property.
     * 
     */
    public short getInSelectedCustomerCDigit() {
        return inSelectedCustomerCDigit;
    }

    /**
     * Sets the value of the inSelectedCustomerCDigit property.
     * 
     */
    public void setInSelectedCustomerCDigit(short value) {
        this.inSelectedCustomerCDigit = value;
    }

    /**
     * Gets the value of the inSelectedCustomerPositionAccProdNumber property.
     * 
     */
    public double getInSelectedCustomerPositionAccProdNumber() {
        return inSelectedCustomerPositionAccProdNumber;
    }

    /**
     * Sets the value of the inSelectedCustomerPositionAccProdNumber property.
     * 
     */
    public void setInSelectedCustomerPositionAccProdNumber(double value) {
        this.inSelectedCustomerPositionAccProdNumber = value;
    }

    /**
     * Gets the value of the inSelectedProfitsAccountAccountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInSelectedProfitsAccountAccountNumber() {
        return inSelectedProfitsAccountAccountNumber;
    }

    /**
     * Sets the value of the inSelectedProfitsAccountAccountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInSelectedProfitsAccountAccountNumber(String value) {
        this.inSelectedProfitsAccountAccountNumber = value;
    }

    /**
     * Gets the value of the inSelectedProfitsAccountPrftSystem property.
     * 
     */
    public short getInSelectedProfitsAccountPrftSystem() {
        return inSelectedProfitsAccountPrftSystem;
    }

    /**
     * Sets the value of the inSelectedProfitsAccountPrftSystem property.
     * 
     */
    public void setInSelectedProfitsAccountPrftSystem(short value) {
        this.inSelectedProfitsAccountPrftSystem = value;
    }

    /**
     * Gets the value of the inSpecificAccountProfitsAccountAccountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInSpecificAccountProfitsAccountAccountNumber() {
        return inSpecificAccountProfitsAccountAccountNumber;
    }

    /**
     * Sets the value of the inSpecificAccountProfitsAccountAccountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInSpecificAccountProfitsAccountAccountNumber(String value) {
        this.inSpecificAccountProfitsAccountAccountNumber = value;
    }

    /**
     * Gets the value of the inSpecificAccountProfitsAccountPrftSystem property.
     * 
     */
    public short getInSpecificAccountProfitsAccountPrftSystem() {
        return inSpecificAccountProfitsAccountPrftSystem;
    }

    /**
     * Sets the value of the inSpecificAccountProfitsAccountPrftSystem property.
     * 
     */
    public void setInSpecificAccountProfitsAccountPrftSystem(short value) {
        this.inSpecificAccountProfitsAccountPrftSystem = value;
    }

    /**
     * Gets the value of the inTrxDcdRuleId property.
     * 
     */
    public double getInTrxDcdRuleId() {
        return inTrxDcdRuleId;
    }

    /**
     * Sets the value of the inTrxDcdRuleId property.
     * 
     */
    public void setInTrxDcdRuleId(double value) {
        this.inTrxDcdRuleId = value;
    }

    /**
     * Gets the value of the inTrxDcdRulePrftSystem property.
     * 
     */
    public short getInTrxDcdRulePrftSystem() {
        return inTrxDcdRulePrftSystem;
    }

    /**
     * Sets the value of the inTrxDcdRulePrftSystem property.
     * 
     */
    public void setInTrxDcdRulePrftSystem(short value) {
        this.inTrxDcdRulePrftSystem = value;
    }

    /**
     * Gets the value of the inTrxDcdRuleSnum property.
     * 
     */
    public int getInTrxDcdRuleSnum() {
        return inTrxDcdRuleSnum;
    }

    /**
     * Sets the value of the inTrxDcdRuleSnum property.
     * 
     */
    public void setInTrxDcdRuleSnum(int value) {
        this.inTrxDcdRuleSnum = value;
    }

    /**
     * Gets the value of the inTrxLanguageDcdLanguageId property.
     * 
     */
    public int getInTrxLanguageDcdLanguageId() {
        return inTrxLanguageDcdLanguageId;
    }

    /**
     * Sets the value of the inTrxLanguageDcdLanguageId property.
     * 
     */
    public void setInTrxLanguageDcdLanguageId(int value) {
        this.inTrxLanguageDcdLanguageId = value;
    }

    /**
     * Gets the value of the inContinueAccountCustomerPositionPosYear property.
     * 
     */
    public short getInContinueAccountCustomerPositionPosYear() {
        return inContinueAccountCustomerPositionPosYear;
    }

    /**
     * Sets the value of the inContinueAccountCustomerPositionPosYear property.
     * 
     */
    public void setInContinueAccountCustomerPositionPosYear(short value) {
        this.inContinueAccountCustomerPositionPosYear = value;
    }

    /**
     * Gets the value of the inContinueAccountCustomerPositionAccProdNumber property.
     * 
     */
    public double getInContinueAccountCustomerPositionAccProdNumber() {
        return inContinueAccountCustomerPositionAccProdNumber;
    }

    /**
     * Sets the value of the inContinueAccountCustomerPositionAccProdNumber property.
     * 
     */
    public void setInContinueAccountCustomerPositionAccProdNumber(double value) {
        this.inContinueAccountCustomerPositionAccProdNumber = value;
    }

    /**
     * Gets the value of the inContinueCustomerPositionPosYear property.
     * 
     */
    public short getInContinueCustomerPositionPosYear() {
        return inContinueCustomerPositionPosYear;
    }

    /**
     * Sets the value of the inContinueCustomerPositionPosYear property.
     * 
     */
    public void setInContinueCustomerPositionPosYear(short value) {
        this.inContinueCustomerPositionPosYear = value;
    }

}
