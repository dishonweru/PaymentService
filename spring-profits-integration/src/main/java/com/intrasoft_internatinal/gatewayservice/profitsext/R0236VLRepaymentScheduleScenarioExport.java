
package com.intrasoft_internatinal.gatewayservice.profitsext;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for R0236VL_RepaymentScheduleScenarioExport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="R0236VL_RepaymentScheduleScenarioExport">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}BaseExport">
 *       &lt;sequence>
 *         &lt;element name="Command" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCategoryCategoryCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGenericHeaderParameterType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutHissuProdPermRestrIndHissuProdPermPermissibleInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutHloanIntCapitalFlg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutHloanLoanType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutHprodCurrPermRestrIndHprodCurrencyPermRestrInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutHprodIntPermRestrIndHprodInterestPermRestrInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutHprodPermPermRestrIndHprodPermissiblesPermRestrInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutHprodSubsPermRestrIndHprodSubsidyPermRestrInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutHprodUnitPermRestrIndHprodUnitPermRestrInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSelectedGenericHeaderParameterType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpLog" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}ArrayOfR0236VLOutGrpLogItem" minOccurs="0"/>
 *         &lt;element name="OutGrpPermCurrency" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}ArrayOfR0236VLOutGrpPermCurrencyItem" minOccurs="0"/>
 *         &lt;element name="OutGrpPermHissu" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}ArrayOfR0236VLOutGrpPermHissuItem" minOccurs="0"/>
 *         &lt;element name="OutGrpPermInterest" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}ArrayOfR0236VLOutGrpPermInterestItem" minOccurs="0"/>
 *         &lt;element name="OutGrpPermSubsidy" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}ArrayOfR0236VLOutGrpPermSubsidyItem" minOccurs="0"/>
 *         &lt;element name="OutGrpPermUnit" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}ArrayOfR0236VLOutGrpPermUnitItem" minOccurs="0"/>
 *         &lt;element name="OutGrpPermissibles" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}ArrayOfR0236VLOutGrpPermissiblesItem" minOccurs="0"/>
 *         &lt;element name="OutGrpPermittedValues" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}ArrayOfR0236VLOutGrpPermittedValuesItem" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "R0236VL_RepaymentScheduleScenarioExport", propOrder = {
    "command",
    "outCategoryCategoryCode",
    "outGenericHeaderParameterType",
    "outHissuProdPermRestrIndHissuProdPermPermissibleInd",
    "outHloanIntCapitalFlg",
    "outHloanLoanType",
    "outHprodCurrPermRestrIndHprodCurrencyPermRestrInd",
    "outHprodIntPermRestrIndHprodInterestPermRestrInd",
    "outHprodPermPermRestrIndHprodPermissiblesPermRestrInd",
    "outHprodSubsPermRestrIndHprodSubsidyPermRestrInd",
    "outHprodUnitPermRestrIndHprodUnitPermRestrInd",
    "outSelectedGenericHeaderParameterType",
    "outGrpLog",
    "outGrpPermCurrency",
    "outGrpPermHissu",
    "outGrpPermInterest",
    "outGrpPermSubsidy",
    "outGrpPermUnit",
    "outGrpPermissibles",
    "outGrpPermittedValues"
})
public class R0236VLRepaymentScheduleScenarioExport
    extends BaseExport
{

    @XmlElement(name = "Command")
    protected String command;
    @XmlElement(name = "OutCategoryCategoryCode")
    protected String outCategoryCategoryCode;
    @XmlElement(name = "OutGenericHeaderParameterType")
    protected String outGenericHeaderParameterType;
    @XmlElement(name = "OutHissuProdPermRestrIndHissuProdPermPermissibleInd")
    protected String outHissuProdPermRestrIndHissuProdPermPermissibleInd;
    @XmlElement(name = "OutHloanIntCapitalFlg")
    protected String outHloanIntCapitalFlg;
    @XmlElement(name = "OutHloanLoanType")
    protected String outHloanLoanType;
    @XmlElement(name = "OutHprodCurrPermRestrIndHprodCurrencyPermRestrInd")
    protected String outHprodCurrPermRestrIndHprodCurrencyPermRestrInd;
    @XmlElement(name = "OutHprodIntPermRestrIndHprodInterestPermRestrInd")
    protected String outHprodIntPermRestrIndHprodInterestPermRestrInd;
    @XmlElement(name = "OutHprodPermPermRestrIndHprodPermissiblesPermRestrInd")
    protected String outHprodPermPermRestrIndHprodPermissiblesPermRestrInd;
    @XmlElement(name = "OutHprodSubsPermRestrIndHprodSubsidyPermRestrInd")
    protected String outHprodSubsPermRestrIndHprodSubsidyPermRestrInd;
    @XmlElement(name = "OutHprodUnitPermRestrIndHprodUnitPermRestrInd")
    protected String outHprodUnitPermRestrIndHprodUnitPermRestrInd;
    @XmlElement(name = "OutSelectedGenericHeaderParameterType")
    protected String outSelectedGenericHeaderParameterType;
    @XmlElement(name = "OutGrpLog")
    protected ArrayOfR0236VLOutGrpLogItem outGrpLog;
    @XmlElement(name = "OutGrpPermCurrency")
    protected ArrayOfR0236VLOutGrpPermCurrencyItem outGrpPermCurrency;
    @XmlElement(name = "OutGrpPermHissu")
    protected ArrayOfR0236VLOutGrpPermHissuItem outGrpPermHissu;
    @XmlElement(name = "OutGrpPermInterest")
    protected ArrayOfR0236VLOutGrpPermInterestItem outGrpPermInterest;
    @XmlElement(name = "OutGrpPermSubsidy")
    protected ArrayOfR0236VLOutGrpPermSubsidyItem outGrpPermSubsidy;
    @XmlElement(name = "OutGrpPermUnit")
    protected ArrayOfR0236VLOutGrpPermUnitItem outGrpPermUnit;
    @XmlElement(name = "OutGrpPermissibles")
    protected ArrayOfR0236VLOutGrpPermissiblesItem outGrpPermissibles;
    @XmlElement(name = "OutGrpPermittedValues")
    protected ArrayOfR0236VLOutGrpPermittedValuesItem outGrpPermittedValues;

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
     * Gets the value of the outCategoryCategoryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCategoryCategoryCode() {
        return outCategoryCategoryCode;
    }

    /**
     * Sets the value of the outCategoryCategoryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCategoryCategoryCode(String value) {
        this.outCategoryCategoryCode = value;
    }

    /**
     * Gets the value of the outGenericHeaderParameterType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGenericHeaderParameterType() {
        return outGenericHeaderParameterType;
    }

    /**
     * Sets the value of the outGenericHeaderParameterType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGenericHeaderParameterType(String value) {
        this.outGenericHeaderParameterType = value;
    }

    /**
     * Gets the value of the outHissuProdPermRestrIndHissuProdPermPermissibleInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutHissuProdPermRestrIndHissuProdPermPermissibleInd() {
        return outHissuProdPermRestrIndHissuProdPermPermissibleInd;
    }

    /**
     * Sets the value of the outHissuProdPermRestrIndHissuProdPermPermissibleInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutHissuProdPermRestrIndHissuProdPermPermissibleInd(String value) {
        this.outHissuProdPermRestrIndHissuProdPermPermissibleInd = value;
    }

    /**
     * Gets the value of the outHloanIntCapitalFlg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutHloanIntCapitalFlg() {
        return outHloanIntCapitalFlg;
    }

    /**
     * Sets the value of the outHloanIntCapitalFlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutHloanIntCapitalFlg(String value) {
        this.outHloanIntCapitalFlg = value;
    }

    /**
     * Gets the value of the outHloanLoanType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutHloanLoanType() {
        return outHloanLoanType;
    }

    /**
     * Sets the value of the outHloanLoanType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutHloanLoanType(String value) {
        this.outHloanLoanType = value;
    }

    /**
     * Gets the value of the outHprodCurrPermRestrIndHprodCurrencyPermRestrInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutHprodCurrPermRestrIndHprodCurrencyPermRestrInd() {
        return outHprodCurrPermRestrIndHprodCurrencyPermRestrInd;
    }

    /**
     * Sets the value of the outHprodCurrPermRestrIndHprodCurrencyPermRestrInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutHprodCurrPermRestrIndHprodCurrencyPermRestrInd(String value) {
        this.outHprodCurrPermRestrIndHprodCurrencyPermRestrInd = value;
    }

    /**
     * Gets the value of the outHprodIntPermRestrIndHprodInterestPermRestrInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutHprodIntPermRestrIndHprodInterestPermRestrInd() {
        return outHprodIntPermRestrIndHprodInterestPermRestrInd;
    }

    /**
     * Sets the value of the outHprodIntPermRestrIndHprodInterestPermRestrInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutHprodIntPermRestrIndHprodInterestPermRestrInd(String value) {
        this.outHprodIntPermRestrIndHprodInterestPermRestrInd = value;
    }

    /**
     * Gets the value of the outHprodPermPermRestrIndHprodPermissiblesPermRestrInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutHprodPermPermRestrIndHprodPermissiblesPermRestrInd() {
        return outHprodPermPermRestrIndHprodPermissiblesPermRestrInd;
    }

    /**
     * Sets the value of the outHprodPermPermRestrIndHprodPermissiblesPermRestrInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutHprodPermPermRestrIndHprodPermissiblesPermRestrInd(String value) {
        this.outHprodPermPermRestrIndHprodPermissiblesPermRestrInd = value;
    }

    /**
     * Gets the value of the outHprodSubsPermRestrIndHprodSubsidyPermRestrInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutHprodSubsPermRestrIndHprodSubsidyPermRestrInd() {
        return outHprodSubsPermRestrIndHprodSubsidyPermRestrInd;
    }

    /**
     * Sets the value of the outHprodSubsPermRestrIndHprodSubsidyPermRestrInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutHprodSubsPermRestrIndHprodSubsidyPermRestrInd(String value) {
        this.outHprodSubsPermRestrIndHprodSubsidyPermRestrInd = value;
    }

    /**
     * Gets the value of the outHprodUnitPermRestrIndHprodUnitPermRestrInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutHprodUnitPermRestrIndHprodUnitPermRestrInd() {
        return outHprodUnitPermRestrIndHprodUnitPermRestrInd;
    }

    /**
     * Sets the value of the outHprodUnitPermRestrIndHprodUnitPermRestrInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutHprodUnitPermRestrIndHprodUnitPermRestrInd(String value) {
        this.outHprodUnitPermRestrIndHprodUnitPermRestrInd = value;
    }

    /**
     * Gets the value of the outSelectedGenericHeaderParameterType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSelectedGenericHeaderParameterType() {
        return outSelectedGenericHeaderParameterType;
    }

    /**
     * Sets the value of the outSelectedGenericHeaderParameterType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSelectedGenericHeaderParameterType(String value) {
        this.outSelectedGenericHeaderParameterType = value;
    }

    /**
     * Gets the value of the outGrpLog property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfR0236VLOutGrpLogItem }
     *     
     */
    public ArrayOfR0236VLOutGrpLogItem getOutGrpLog() {
        return outGrpLog;
    }

    /**
     * Sets the value of the outGrpLog property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfR0236VLOutGrpLogItem }
     *     
     */
    public void setOutGrpLog(ArrayOfR0236VLOutGrpLogItem value) {
        this.outGrpLog = value;
    }

    /**
     * Gets the value of the outGrpPermCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfR0236VLOutGrpPermCurrencyItem }
     *     
     */
    public ArrayOfR0236VLOutGrpPermCurrencyItem getOutGrpPermCurrency() {
        return outGrpPermCurrency;
    }

    /**
     * Sets the value of the outGrpPermCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfR0236VLOutGrpPermCurrencyItem }
     *     
     */
    public void setOutGrpPermCurrency(ArrayOfR0236VLOutGrpPermCurrencyItem value) {
        this.outGrpPermCurrency = value;
    }

    /**
     * Gets the value of the outGrpPermHissu property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfR0236VLOutGrpPermHissuItem }
     *     
     */
    public ArrayOfR0236VLOutGrpPermHissuItem getOutGrpPermHissu() {
        return outGrpPermHissu;
    }

    /**
     * Sets the value of the outGrpPermHissu property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfR0236VLOutGrpPermHissuItem }
     *     
     */
    public void setOutGrpPermHissu(ArrayOfR0236VLOutGrpPermHissuItem value) {
        this.outGrpPermHissu = value;
    }

    /**
     * Gets the value of the outGrpPermInterest property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfR0236VLOutGrpPermInterestItem }
     *     
     */
    public ArrayOfR0236VLOutGrpPermInterestItem getOutGrpPermInterest() {
        return outGrpPermInterest;
    }

    /**
     * Sets the value of the outGrpPermInterest property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfR0236VLOutGrpPermInterestItem }
     *     
     */
    public void setOutGrpPermInterest(ArrayOfR0236VLOutGrpPermInterestItem value) {
        this.outGrpPermInterest = value;
    }

    /**
     * Gets the value of the outGrpPermSubsidy property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfR0236VLOutGrpPermSubsidyItem }
     *     
     */
    public ArrayOfR0236VLOutGrpPermSubsidyItem getOutGrpPermSubsidy() {
        return outGrpPermSubsidy;
    }

    /**
     * Sets the value of the outGrpPermSubsidy property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfR0236VLOutGrpPermSubsidyItem }
     *     
     */
    public void setOutGrpPermSubsidy(ArrayOfR0236VLOutGrpPermSubsidyItem value) {
        this.outGrpPermSubsidy = value;
    }

    /**
     * Gets the value of the outGrpPermUnit property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfR0236VLOutGrpPermUnitItem }
     *     
     */
    public ArrayOfR0236VLOutGrpPermUnitItem getOutGrpPermUnit() {
        return outGrpPermUnit;
    }

    /**
     * Sets the value of the outGrpPermUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfR0236VLOutGrpPermUnitItem }
     *     
     */
    public void setOutGrpPermUnit(ArrayOfR0236VLOutGrpPermUnitItem value) {
        this.outGrpPermUnit = value;
    }

    /**
     * Gets the value of the outGrpPermissibles property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfR0236VLOutGrpPermissiblesItem }
     *     
     */
    public ArrayOfR0236VLOutGrpPermissiblesItem getOutGrpPermissibles() {
        return outGrpPermissibles;
    }

    /**
     * Sets the value of the outGrpPermissibles property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfR0236VLOutGrpPermissiblesItem }
     *     
     */
    public void setOutGrpPermissibles(ArrayOfR0236VLOutGrpPermissiblesItem value) {
        this.outGrpPermissibles = value;
    }

    /**
     * Gets the value of the outGrpPermittedValues property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfR0236VLOutGrpPermittedValuesItem }
     *     
     */
    public ArrayOfR0236VLOutGrpPermittedValuesItem getOutGrpPermittedValues() {
        return outGrpPermittedValues;
    }

    /**
     * Sets the value of the outGrpPermittedValues property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfR0236VLOutGrpPermittedValuesItem }
     *     
     */
    public void setOutGrpPermittedValues(ArrayOfR0236VLOutGrpPermittedValuesItem value) {
        this.outGrpPermittedValues = value;
    }

}
