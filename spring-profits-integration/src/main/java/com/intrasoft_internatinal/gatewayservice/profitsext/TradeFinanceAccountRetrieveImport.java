
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for TradeFinanceAccountRetrieveImport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TradeFinanceAccountRetrieveImport">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}BaseImport">
 *       &lt;sequence>
 *         &lt;element name="ProfitsAccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProfitsAccountCd" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InGrpParametersOutGrmWorkDatesProductionDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InGrpParametersInGrmUnitCategoryGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InGrpParametersInGrmTerminalTerminalNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InGrpParametersInGrmTrxCountTrxCounter" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InAdvisingSwiftAllnceBicsBankDescr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InAdvisingSwiftAllnceBicsBic" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InBenefCustNameListSetDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InBeneficiaryCustAddressAddress1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InBeneficiaryCustomerCDigit" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InBeneficiaryCustomerCustId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InBeneficiaryProfitsAccountAccountCd" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InBeneficiaryProfitsAccountAccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InBeneficiaryProfitsAccountPrftSystem" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InCentralBankCodeGenericDetailDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCentralBankCodeGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InCommandIefSuppliedCommand" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCorrespCustNameListSetDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCorrespondentCustomerCDigit" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InCorrespondentCustomerCustId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InCorrespondentProfitsAccountAccountCd" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InCorrespondentProfitsAccountAccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCorrespondentProfitsAccountPrftSystem" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InCountryGenericDetailDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCountryGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InCurrencyIdCurrency" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InCurrencyShortDescr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCustomerCustId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InIssuingSwiftAllnceBicsBankDescr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InIssuingSwiftAllnceBicsBic" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InJustificIdJustific" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InMonitoringUnitCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InMonitoringUnitUnitName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InOpeningUnitCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InOpeningUnitUnitName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InPrftTransactionIdTransact" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InPrincipalCustAddressAddress1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InPrincipalCustomerCDigit" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InPrincipalCustomerCustId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InPrincipalProfitsAccountAccountCd" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InPrincipalProfitsAccountAccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InPrincipalProfitsAccountPrftSystem" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InPrincipCustNameListSetDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InProductDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InProductIdProduct" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InTfTypeIefSuppliedFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InTradeFinanceBenefAccCd" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InTradeFinanceBenefAccNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InTradeFinanceBenefAccPrftSys" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InTradeFinanceBenefCommAddr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InTradeFinanceBeneficiaryName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InTradeFinanceComments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InTradeFinanceCorrBankAccCd" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InTradeFinanceCorrBankAccNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InTradeFinanceCorreAccPrftSys" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InTradeFinanceCorrespondentName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InTradeFinancePrincAccPrftSys" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InTradeFinancePrincipalCommAddr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InTradeFinancePrinicipalName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InTradeFinanceRefNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InTradeFinanceStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InTradeFinanceTfAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InTradeFinanceTfCd" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InTradeFinanceTfConfirmDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InTradeFinanceTfNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InTradeFinanceTfOpenDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InTradeFinanceTfType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InTradeFinanceTmpstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InTradeFinanceSettlementMode" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TradeFinanceAccountRetrieveImport", propOrder = {
    "profitsAccountNumber",
    "profitsAccountCd",
    "inGrpParametersOutGrmWorkDatesProductionDate",
    "inGrpParametersInGrmUnitCategoryGenericDetailSerialNum",
    "inGrpParametersInGrmTerminalTerminalNumber",
    "inGrpParametersInGrmTrxCountTrxCounter",
    "inAdvisingSwiftAllnceBicsBankDescr",
    "inAdvisingSwiftAllnceBicsBic",
    "inBenefCustNameListSetDescription",
    "inBeneficiaryCustAddressAddress1",
    "inBeneficiaryCustomerCDigit",
    "inBeneficiaryCustomerCustId",
    "inBeneficiaryProfitsAccountAccountCd",
    "inBeneficiaryProfitsAccountAccountNumber",
    "inBeneficiaryProfitsAccountPrftSystem",
    "inCentralBankCodeGenericDetailDescription",
    "inCentralBankCodeGenericDetailSerialNum",
    "inCommandIefSuppliedCommand",
    "inCorrespCustNameListSetDescription",
    "inCorrespondentCustomerCDigit",
    "inCorrespondentCustomerCustId",
    "inCorrespondentProfitsAccountAccountCd",
    "inCorrespondentProfitsAccountAccountNumber",
    "inCorrespondentProfitsAccountPrftSystem",
    "inCountryGenericDetailDescription",
    "inCountryGenericDetailSerialNum",
    "inCurrencyIdCurrency",
    "inCurrencyShortDescr",
    "inCustomerCustId",
    "inIssuingSwiftAllnceBicsBankDescr",
    "inIssuingSwiftAllnceBicsBic",
    "inJustificIdJustific",
    "inMonitoringUnitCode",
    "inMonitoringUnitUnitName",
    "inOpeningUnitCode",
    "inOpeningUnitUnitName",
    "inPrftTransactionIdTransact",
    "inPrincipalCustAddressAddress1",
    "inPrincipalCustomerCDigit",
    "inPrincipalCustomerCustId",
    "inPrincipalProfitsAccountAccountCd",
    "inPrincipalProfitsAccountAccountNumber",
    "inPrincipalProfitsAccountPrftSystem",
    "inPrincipCustNameListSetDescription",
    "inProductDescription",
    "inProductIdProduct",
    "inTfTypeIefSuppliedFlag",
    "inTradeFinanceBenefAccCd",
    "inTradeFinanceBenefAccNum",
    "inTradeFinanceBenefAccPrftSys",
    "inTradeFinanceBenefCommAddr",
    "inTradeFinanceBeneficiaryName",
    "inTradeFinanceComments",
    "inTradeFinanceCorrBankAccCd",
    "inTradeFinanceCorrBankAccNum",
    "inTradeFinanceCorreAccPrftSys",
    "inTradeFinanceCorrespondentName",
    "inTradeFinancePrincAccPrftSys",
    "inTradeFinancePrincipalCommAddr",
    "inTradeFinancePrinicipalName",
    "inTradeFinanceRefNo",
    "inTradeFinanceStatus",
    "inTradeFinanceTfAmount",
    "inTradeFinanceTfCd",
    "inTradeFinanceTfConfirmDate",
    "inTradeFinanceTfNumber",
    "inTradeFinanceTfOpenDate",
    "inTradeFinanceTfType",
    "inTradeFinanceTmpstamp",
    "inTradeFinanceSettlementMode"
})
public class TradeFinanceAccountRetrieveImport
    extends BaseImport
{

    @XmlElement(name = "ProfitsAccountNumber")
    protected String profitsAccountNumber;
    @XmlElement(name = "ProfitsAccountCd")
    protected short profitsAccountCd;
    @XmlElement(name = "InGrpParametersOutGrmWorkDatesProductionDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inGrpParametersOutGrmWorkDatesProductionDate;
    @XmlElement(name = "InGrpParametersInGrmUnitCategoryGenericDetailSerialNum")
    protected int inGrpParametersInGrmUnitCategoryGenericDetailSerialNum;
    @XmlElement(name = "InGrpParametersInGrmTerminalTerminalNumber")
    protected String inGrpParametersInGrmTerminalTerminalNumber;
    @XmlElement(name = "InGrpParametersInGrmTrxCountTrxCounter")
    protected int inGrpParametersInGrmTrxCountTrxCounter;
    @XmlElement(name = "InAdvisingSwiftAllnceBicsBankDescr")
    protected String inAdvisingSwiftAllnceBicsBankDescr;
    @XmlElement(name = "InAdvisingSwiftAllnceBicsBic")
    protected String inAdvisingSwiftAllnceBicsBic;
    @XmlElement(name = "InBenefCustNameListSetDescription")
    protected String inBenefCustNameListSetDescription;
    @XmlElement(name = "InBeneficiaryCustAddressAddress1")
    protected String inBeneficiaryCustAddressAddress1;
    @XmlElement(name = "InBeneficiaryCustomerCDigit")
    protected short inBeneficiaryCustomerCDigit;
    @XmlElement(name = "InBeneficiaryCustomerCustId")
    protected int inBeneficiaryCustomerCustId;
    @XmlElement(name = "InBeneficiaryProfitsAccountAccountCd")
    protected short inBeneficiaryProfitsAccountAccountCd;
    @XmlElement(name = "InBeneficiaryProfitsAccountAccountNumber")
    protected String inBeneficiaryProfitsAccountAccountNumber;
    @XmlElement(name = "InBeneficiaryProfitsAccountPrftSystem")
    protected short inBeneficiaryProfitsAccountPrftSystem;
    @XmlElement(name = "InCentralBankCodeGenericDetailDescription")
    protected String inCentralBankCodeGenericDetailDescription;
    @XmlElement(name = "InCentralBankCodeGenericDetailSerialNum")
    protected int inCentralBankCodeGenericDetailSerialNum;
    @XmlElement(name = "InCommandIefSuppliedCommand")
    protected String inCommandIefSuppliedCommand;
    @XmlElement(name = "InCorrespCustNameListSetDescription")
    protected String inCorrespCustNameListSetDescription;
    @XmlElement(name = "InCorrespondentCustomerCDigit")
    protected short inCorrespondentCustomerCDigit;
    @XmlElement(name = "InCorrespondentCustomerCustId")
    protected int inCorrespondentCustomerCustId;
    @XmlElement(name = "InCorrespondentProfitsAccountAccountCd")
    protected short inCorrespondentProfitsAccountAccountCd;
    @XmlElement(name = "InCorrespondentProfitsAccountAccountNumber")
    protected String inCorrespondentProfitsAccountAccountNumber;
    @XmlElement(name = "InCorrespondentProfitsAccountPrftSystem")
    protected short inCorrespondentProfitsAccountPrftSystem;
    @XmlElement(name = "InCountryGenericDetailDescription")
    protected String inCountryGenericDetailDescription;
    @XmlElement(name = "InCountryGenericDetailSerialNum")
    protected int inCountryGenericDetailSerialNum;
    @XmlElement(name = "InCurrencyIdCurrency")
    protected int inCurrencyIdCurrency;
    @XmlElement(name = "InCurrencyShortDescr")
    protected String inCurrencyShortDescr;
    @XmlElement(name = "InCustomerCustId")
    protected int inCustomerCustId;
    @XmlElement(name = "InIssuingSwiftAllnceBicsBankDescr")
    protected String inIssuingSwiftAllnceBicsBankDescr;
    @XmlElement(name = "InIssuingSwiftAllnceBicsBic")
    protected String inIssuingSwiftAllnceBicsBic;
    @XmlElement(name = "InJustificIdJustific")
    protected int inJustificIdJustific;
    @XmlElement(name = "InMonitoringUnitCode")
    protected int inMonitoringUnitCode;
    @XmlElement(name = "InMonitoringUnitUnitName")
    protected String inMonitoringUnitUnitName;
    @XmlElement(name = "InOpeningUnitCode")
    protected int inOpeningUnitCode;
    @XmlElement(name = "InOpeningUnitUnitName")
    protected String inOpeningUnitUnitName;
    @XmlElement(name = "InPrftTransactionIdTransact")
    protected int inPrftTransactionIdTransact;
    @XmlElement(name = "InPrincipalCustAddressAddress1")
    protected String inPrincipalCustAddressAddress1;
    @XmlElement(name = "InPrincipalCustomerCDigit")
    protected short inPrincipalCustomerCDigit;
    @XmlElement(name = "InPrincipalCustomerCustId")
    protected int inPrincipalCustomerCustId;
    @XmlElement(name = "InPrincipalProfitsAccountAccountCd")
    protected short inPrincipalProfitsAccountAccountCd;
    @XmlElement(name = "InPrincipalProfitsAccountAccountNumber")
    protected String inPrincipalProfitsAccountAccountNumber;
    @XmlElement(name = "InPrincipalProfitsAccountPrftSystem")
    protected short inPrincipalProfitsAccountPrftSystem;
    @XmlElement(name = "InPrincipCustNameListSetDescription")
    protected String inPrincipCustNameListSetDescription;
    @XmlElement(name = "InProductDescription")
    protected String inProductDescription;
    @XmlElement(name = "InProductIdProduct")
    protected int inProductIdProduct;
    @XmlElement(name = "InTfTypeIefSuppliedFlag")
    protected String inTfTypeIefSuppliedFlag;
    @XmlElement(name = "InTradeFinanceBenefAccCd")
    protected short inTradeFinanceBenefAccCd;
    @XmlElement(name = "InTradeFinanceBenefAccNum")
    protected String inTradeFinanceBenefAccNum;
    @XmlElement(name = "InTradeFinanceBenefAccPrftSys")
    protected short inTradeFinanceBenefAccPrftSys;
    @XmlElement(name = "InTradeFinanceBenefCommAddr")
    protected String inTradeFinanceBenefCommAddr;
    @XmlElement(name = "InTradeFinanceBeneficiaryName")
    protected String inTradeFinanceBeneficiaryName;
    @XmlElement(name = "InTradeFinanceComments")
    protected String inTradeFinanceComments;
    @XmlElement(name = "InTradeFinanceCorrBankAccCd")
    protected short inTradeFinanceCorrBankAccCd;
    @XmlElement(name = "InTradeFinanceCorrBankAccNum")
    protected String inTradeFinanceCorrBankAccNum;
    @XmlElement(name = "InTradeFinanceCorreAccPrftSys")
    protected short inTradeFinanceCorreAccPrftSys;
    @XmlElement(name = "InTradeFinanceCorrespondentName")
    protected String inTradeFinanceCorrespondentName;
    @XmlElement(name = "InTradeFinancePrincAccPrftSys")
    protected short inTradeFinancePrincAccPrftSys;
    @XmlElement(name = "InTradeFinancePrincipalCommAddr")
    protected String inTradeFinancePrincipalCommAddr;
    @XmlElement(name = "InTradeFinancePrinicipalName")
    protected String inTradeFinancePrinicipalName;
    @XmlElement(name = "InTradeFinanceRefNo")
    protected String inTradeFinanceRefNo;
    @XmlElement(name = "InTradeFinanceStatus")
    protected String inTradeFinanceStatus;
    @XmlElement(name = "InTradeFinanceTfAmount", required = true)
    protected BigDecimal inTradeFinanceTfAmount;
    @XmlElement(name = "InTradeFinanceTfCd")
    protected short inTradeFinanceTfCd;
    @XmlElement(name = "InTradeFinanceTfConfirmDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inTradeFinanceTfConfirmDate;
    @XmlElement(name = "InTradeFinanceTfNumber")
    protected String inTradeFinanceTfNumber;
    @XmlElement(name = "InTradeFinanceTfOpenDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inTradeFinanceTfOpenDate;
    @XmlElement(name = "InTradeFinanceTfType")
    protected String inTradeFinanceTfType;
    @XmlElement(name = "InTradeFinanceTmpstamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inTradeFinanceTmpstamp;
    @XmlElement(name = "InTradeFinanceSettlementMode")
    protected short inTradeFinanceSettlementMode;

    /**
     * Gets the value of the profitsAccountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProfitsAccountNumber() {
        return profitsAccountNumber;
    }

    /**
     * Sets the value of the profitsAccountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProfitsAccountNumber(String value) {
        this.profitsAccountNumber = value;
    }

    /**
     * Gets the value of the profitsAccountCd property.
     * 
     */
    public short getProfitsAccountCd() {
        return profitsAccountCd;
    }

    /**
     * Sets the value of the profitsAccountCd property.
     * 
     */
    public void setProfitsAccountCd(short value) {
        this.profitsAccountCd = value;
    }

    /**
     * Gets the value of the inGrpParametersOutGrmWorkDatesProductionDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInGrpParametersOutGrmWorkDatesProductionDate() {
        return inGrpParametersOutGrmWorkDatesProductionDate;
    }

    /**
     * Sets the value of the inGrpParametersOutGrmWorkDatesProductionDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInGrpParametersOutGrmWorkDatesProductionDate(XMLGregorianCalendar value) {
        this.inGrpParametersOutGrmWorkDatesProductionDate = value;
    }

    /**
     * Gets the value of the inGrpParametersInGrmUnitCategoryGenericDetailSerialNum property.
     * 
     */
    public int getInGrpParametersInGrmUnitCategoryGenericDetailSerialNum() {
        return inGrpParametersInGrmUnitCategoryGenericDetailSerialNum;
    }

    /**
     * Sets the value of the inGrpParametersInGrmUnitCategoryGenericDetailSerialNum property.
     * 
     */
    public void setInGrpParametersInGrmUnitCategoryGenericDetailSerialNum(int value) {
        this.inGrpParametersInGrmUnitCategoryGenericDetailSerialNum = value;
    }

    /**
     * Gets the value of the inGrpParametersInGrmTerminalTerminalNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInGrpParametersInGrmTerminalTerminalNumber() {
        return inGrpParametersInGrmTerminalTerminalNumber;
    }

    /**
     * Sets the value of the inGrpParametersInGrmTerminalTerminalNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInGrpParametersInGrmTerminalTerminalNumber(String value) {
        this.inGrpParametersInGrmTerminalTerminalNumber = value;
    }

    /**
     * Gets the value of the inGrpParametersInGrmTrxCountTrxCounter property.
     * 
     */
    public int getInGrpParametersInGrmTrxCountTrxCounter() {
        return inGrpParametersInGrmTrxCountTrxCounter;
    }

    /**
     * Sets the value of the inGrpParametersInGrmTrxCountTrxCounter property.
     * 
     */
    public void setInGrpParametersInGrmTrxCountTrxCounter(int value) {
        this.inGrpParametersInGrmTrxCountTrxCounter = value;
    }

    /**
     * Gets the value of the inAdvisingSwiftAllnceBicsBankDescr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInAdvisingSwiftAllnceBicsBankDescr() {
        return inAdvisingSwiftAllnceBicsBankDescr;
    }

    /**
     * Sets the value of the inAdvisingSwiftAllnceBicsBankDescr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInAdvisingSwiftAllnceBicsBankDescr(String value) {
        this.inAdvisingSwiftAllnceBicsBankDescr = value;
    }

    /**
     * Gets the value of the inAdvisingSwiftAllnceBicsBic property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInAdvisingSwiftAllnceBicsBic() {
        return inAdvisingSwiftAllnceBicsBic;
    }

    /**
     * Sets the value of the inAdvisingSwiftAllnceBicsBic property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInAdvisingSwiftAllnceBicsBic(String value) {
        this.inAdvisingSwiftAllnceBicsBic = value;
    }

    /**
     * Gets the value of the inBenefCustNameListSetDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInBenefCustNameListSetDescription() {
        return inBenefCustNameListSetDescription;
    }

    /**
     * Sets the value of the inBenefCustNameListSetDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInBenefCustNameListSetDescription(String value) {
        this.inBenefCustNameListSetDescription = value;
    }

    /**
     * Gets the value of the inBeneficiaryCustAddressAddress1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInBeneficiaryCustAddressAddress1() {
        return inBeneficiaryCustAddressAddress1;
    }

    /**
     * Sets the value of the inBeneficiaryCustAddressAddress1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInBeneficiaryCustAddressAddress1(String value) {
        this.inBeneficiaryCustAddressAddress1 = value;
    }

    /**
     * Gets the value of the inBeneficiaryCustomerCDigit property.
     * 
     */
    public short getInBeneficiaryCustomerCDigit() {
        return inBeneficiaryCustomerCDigit;
    }

    /**
     * Sets the value of the inBeneficiaryCustomerCDigit property.
     * 
     */
    public void setInBeneficiaryCustomerCDigit(short value) {
        this.inBeneficiaryCustomerCDigit = value;
    }

    /**
     * Gets the value of the inBeneficiaryCustomerCustId property.
     * 
     */
    public int getInBeneficiaryCustomerCustId() {
        return inBeneficiaryCustomerCustId;
    }

    /**
     * Sets the value of the inBeneficiaryCustomerCustId property.
     * 
     */
    public void setInBeneficiaryCustomerCustId(int value) {
        this.inBeneficiaryCustomerCustId = value;
    }

    /**
     * Gets the value of the inBeneficiaryProfitsAccountAccountCd property.
     * 
     */
    public short getInBeneficiaryProfitsAccountAccountCd() {
        return inBeneficiaryProfitsAccountAccountCd;
    }

    /**
     * Sets the value of the inBeneficiaryProfitsAccountAccountCd property.
     * 
     */
    public void setInBeneficiaryProfitsAccountAccountCd(short value) {
        this.inBeneficiaryProfitsAccountAccountCd = value;
    }

    /**
     * Gets the value of the inBeneficiaryProfitsAccountAccountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInBeneficiaryProfitsAccountAccountNumber() {
        return inBeneficiaryProfitsAccountAccountNumber;
    }

    /**
     * Sets the value of the inBeneficiaryProfitsAccountAccountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInBeneficiaryProfitsAccountAccountNumber(String value) {
        this.inBeneficiaryProfitsAccountAccountNumber = value;
    }

    /**
     * Gets the value of the inBeneficiaryProfitsAccountPrftSystem property.
     * 
     */
    public short getInBeneficiaryProfitsAccountPrftSystem() {
        return inBeneficiaryProfitsAccountPrftSystem;
    }

    /**
     * Sets the value of the inBeneficiaryProfitsAccountPrftSystem property.
     * 
     */
    public void setInBeneficiaryProfitsAccountPrftSystem(short value) {
        this.inBeneficiaryProfitsAccountPrftSystem = value;
    }

    /**
     * Gets the value of the inCentralBankCodeGenericDetailDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCentralBankCodeGenericDetailDescription() {
        return inCentralBankCodeGenericDetailDescription;
    }

    /**
     * Sets the value of the inCentralBankCodeGenericDetailDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCentralBankCodeGenericDetailDescription(String value) {
        this.inCentralBankCodeGenericDetailDescription = value;
    }

    /**
     * Gets the value of the inCentralBankCodeGenericDetailSerialNum property.
     * 
     */
    public int getInCentralBankCodeGenericDetailSerialNum() {
        return inCentralBankCodeGenericDetailSerialNum;
    }

    /**
     * Sets the value of the inCentralBankCodeGenericDetailSerialNum property.
     * 
     */
    public void setInCentralBankCodeGenericDetailSerialNum(int value) {
        this.inCentralBankCodeGenericDetailSerialNum = value;
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
     * Gets the value of the inCorrespCustNameListSetDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCorrespCustNameListSetDescription() {
        return inCorrespCustNameListSetDescription;
    }

    /**
     * Sets the value of the inCorrespCustNameListSetDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCorrespCustNameListSetDescription(String value) {
        this.inCorrespCustNameListSetDescription = value;
    }

    /**
     * Gets the value of the inCorrespondentCustomerCDigit property.
     * 
     */
    public short getInCorrespondentCustomerCDigit() {
        return inCorrespondentCustomerCDigit;
    }

    /**
     * Sets the value of the inCorrespondentCustomerCDigit property.
     * 
     */
    public void setInCorrespondentCustomerCDigit(short value) {
        this.inCorrespondentCustomerCDigit = value;
    }

    /**
     * Gets the value of the inCorrespondentCustomerCustId property.
     * 
     */
    public int getInCorrespondentCustomerCustId() {
        return inCorrespondentCustomerCustId;
    }

    /**
     * Sets the value of the inCorrespondentCustomerCustId property.
     * 
     */
    public void setInCorrespondentCustomerCustId(int value) {
        this.inCorrespondentCustomerCustId = value;
    }

    /**
     * Gets the value of the inCorrespondentProfitsAccountAccountCd property.
     * 
     */
    public short getInCorrespondentProfitsAccountAccountCd() {
        return inCorrespondentProfitsAccountAccountCd;
    }

    /**
     * Sets the value of the inCorrespondentProfitsAccountAccountCd property.
     * 
     */
    public void setInCorrespondentProfitsAccountAccountCd(short value) {
        this.inCorrespondentProfitsAccountAccountCd = value;
    }

    /**
     * Gets the value of the inCorrespondentProfitsAccountAccountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCorrespondentProfitsAccountAccountNumber() {
        return inCorrespondentProfitsAccountAccountNumber;
    }

    /**
     * Sets the value of the inCorrespondentProfitsAccountAccountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCorrespondentProfitsAccountAccountNumber(String value) {
        this.inCorrespondentProfitsAccountAccountNumber = value;
    }

    /**
     * Gets the value of the inCorrespondentProfitsAccountPrftSystem property.
     * 
     */
    public short getInCorrespondentProfitsAccountPrftSystem() {
        return inCorrespondentProfitsAccountPrftSystem;
    }

    /**
     * Sets the value of the inCorrespondentProfitsAccountPrftSystem property.
     * 
     */
    public void setInCorrespondentProfitsAccountPrftSystem(short value) {
        this.inCorrespondentProfitsAccountPrftSystem = value;
    }

    /**
     * Gets the value of the inCountryGenericDetailDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCountryGenericDetailDescription() {
        return inCountryGenericDetailDescription;
    }

    /**
     * Sets the value of the inCountryGenericDetailDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCountryGenericDetailDescription(String value) {
        this.inCountryGenericDetailDescription = value;
    }

    /**
     * Gets the value of the inCountryGenericDetailSerialNum property.
     * 
     */
    public int getInCountryGenericDetailSerialNum() {
        return inCountryGenericDetailSerialNum;
    }

    /**
     * Sets the value of the inCountryGenericDetailSerialNum property.
     * 
     */
    public void setInCountryGenericDetailSerialNum(int value) {
        this.inCountryGenericDetailSerialNum = value;
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
     * Gets the value of the inIssuingSwiftAllnceBicsBankDescr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInIssuingSwiftAllnceBicsBankDescr() {
        return inIssuingSwiftAllnceBicsBankDescr;
    }

    /**
     * Sets the value of the inIssuingSwiftAllnceBicsBankDescr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInIssuingSwiftAllnceBicsBankDescr(String value) {
        this.inIssuingSwiftAllnceBicsBankDescr = value;
    }

    /**
     * Gets the value of the inIssuingSwiftAllnceBicsBic property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInIssuingSwiftAllnceBicsBic() {
        return inIssuingSwiftAllnceBicsBic;
    }

    /**
     * Sets the value of the inIssuingSwiftAllnceBicsBic property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInIssuingSwiftAllnceBicsBic(String value) {
        this.inIssuingSwiftAllnceBicsBic = value;
    }

    /**
     * Gets the value of the inJustificIdJustific property.
     * 
     */
    public int getInJustificIdJustific() {
        return inJustificIdJustific;
    }

    /**
     * Sets the value of the inJustificIdJustific property.
     * 
     */
    public void setInJustificIdJustific(int value) {
        this.inJustificIdJustific = value;
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
     * Gets the value of the inMonitoringUnitUnitName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInMonitoringUnitUnitName() {
        return inMonitoringUnitUnitName;
    }

    /**
     * Sets the value of the inMonitoringUnitUnitName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInMonitoringUnitUnitName(String value) {
        this.inMonitoringUnitUnitName = value;
    }

    /**
     * Gets the value of the inOpeningUnitCode property.
     * 
     */
    public int getInOpeningUnitCode() {
        return inOpeningUnitCode;
    }

    /**
     * Sets the value of the inOpeningUnitCode property.
     * 
     */
    public void setInOpeningUnitCode(int value) {
        this.inOpeningUnitCode = value;
    }

    /**
     * Gets the value of the inOpeningUnitUnitName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInOpeningUnitUnitName() {
        return inOpeningUnitUnitName;
    }

    /**
     * Sets the value of the inOpeningUnitUnitName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInOpeningUnitUnitName(String value) {
        this.inOpeningUnitUnitName = value;
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
     * Gets the value of the inPrincipalCustAddressAddress1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInPrincipalCustAddressAddress1() {
        return inPrincipalCustAddressAddress1;
    }

    /**
     * Sets the value of the inPrincipalCustAddressAddress1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInPrincipalCustAddressAddress1(String value) {
        this.inPrincipalCustAddressAddress1 = value;
    }

    /**
     * Gets the value of the inPrincipalCustomerCDigit property.
     * 
     */
    public short getInPrincipalCustomerCDigit() {
        return inPrincipalCustomerCDigit;
    }

    /**
     * Sets the value of the inPrincipalCustomerCDigit property.
     * 
     */
    public void setInPrincipalCustomerCDigit(short value) {
        this.inPrincipalCustomerCDigit = value;
    }

    /**
     * Gets the value of the inPrincipalCustomerCustId property.
     * 
     */
    public int getInPrincipalCustomerCustId() {
        return inPrincipalCustomerCustId;
    }

    /**
     * Sets the value of the inPrincipalCustomerCustId property.
     * 
     */
    public void setInPrincipalCustomerCustId(int value) {
        this.inPrincipalCustomerCustId = value;
    }

    /**
     * Gets the value of the inPrincipalProfitsAccountAccountCd property.
     * 
     */
    public short getInPrincipalProfitsAccountAccountCd() {
        return inPrincipalProfitsAccountAccountCd;
    }

    /**
     * Sets the value of the inPrincipalProfitsAccountAccountCd property.
     * 
     */
    public void setInPrincipalProfitsAccountAccountCd(short value) {
        this.inPrincipalProfitsAccountAccountCd = value;
    }

    /**
     * Gets the value of the inPrincipalProfitsAccountAccountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInPrincipalProfitsAccountAccountNumber() {
        return inPrincipalProfitsAccountAccountNumber;
    }

    /**
     * Sets the value of the inPrincipalProfitsAccountAccountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInPrincipalProfitsAccountAccountNumber(String value) {
        this.inPrincipalProfitsAccountAccountNumber = value;
    }

    /**
     * Gets the value of the inPrincipalProfitsAccountPrftSystem property.
     * 
     */
    public short getInPrincipalProfitsAccountPrftSystem() {
        return inPrincipalProfitsAccountPrftSystem;
    }

    /**
     * Sets the value of the inPrincipalProfitsAccountPrftSystem property.
     * 
     */
    public void setInPrincipalProfitsAccountPrftSystem(short value) {
        this.inPrincipalProfitsAccountPrftSystem = value;
    }

    /**
     * Gets the value of the inPrincipCustNameListSetDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInPrincipCustNameListSetDescription() {
        return inPrincipCustNameListSetDescription;
    }

    /**
     * Sets the value of the inPrincipCustNameListSetDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInPrincipCustNameListSetDescription(String value) {
        this.inPrincipCustNameListSetDescription = value;
    }

    /**
     * Gets the value of the inProductDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInProductDescription() {
        return inProductDescription;
    }

    /**
     * Sets the value of the inProductDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInProductDescription(String value) {
        this.inProductDescription = value;
    }

    /**
     * Gets the value of the inProductIdProduct property.
     * 
     */
    public int getInProductIdProduct() {
        return inProductIdProduct;
    }

    /**
     * Sets the value of the inProductIdProduct property.
     * 
     */
    public void setInProductIdProduct(int value) {
        this.inProductIdProduct = value;
    }

    /**
     * Gets the value of the inTfTypeIefSuppliedFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInTfTypeIefSuppliedFlag() {
        return inTfTypeIefSuppliedFlag;
    }

    /**
     * Sets the value of the inTfTypeIefSuppliedFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInTfTypeIefSuppliedFlag(String value) {
        this.inTfTypeIefSuppliedFlag = value;
    }

    /**
     * Gets the value of the inTradeFinanceBenefAccCd property.
     * 
     */
    public short getInTradeFinanceBenefAccCd() {
        return inTradeFinanceBenefAccCd;
    }

    /**
     * Sets the value of the inTradeFinanceBenefAccCd property.
     * 
     */
    public void setInTradeFinanceBenefAccCd(short value) {
        this.inTradeFinanceBenefAccCd = value;
    }

    /**
     * Gets the value of the inTradeFinanceBenefAccNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInTradeFinanceBenefAccNum() {
        return inTradeFinanceBenefAccNum;
    }

    /**
     * Sets the value of the inTradeFinanceBenefAccNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInTradeFinanceBenefAccNum(String value) {
        this.inTradeFinanceBenefAccNum = value;
    }

    /**
     * Gets the value of the inTradeFinanceBenefAccPrftSys property.
     * 
     */
    public short getInTradeFinanceBenefAccPrftSys() {
        return inTradeFinanceBenefAccPrftSys;
    }

    /**
     * Sets the value of the inTradeFinanceBenefAccPrftSys property.
     * 
     */
    public void setInTradeFinanceBenefAccPrftSys(short value) {
        this.inTradeFinanceBenefAccPrftSys = value;
    }

    /**
     * Gets the value of the inTradeFinanceBenefCommAddr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInTradeFinanceBenefCommAddr() {
        return inTradeFinanceBenefCommAddr;
    }

    /**
     * Sets the value of the inTradeFinanceBenefCommAddr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInTradeFinanceBenefCommAddr(String value) {
        this.inTradeFinanceBenefCommAddr = value;
    }

    /**
     * Gets the value of the inTradeFinanceBeneficiaryName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInTradeFinanceBeneficiaryName() {
        return inTradeFinanceBeneficiaryName;
    }

    /**
     * Sets the value of the inTradeFinanceBeneficiaryName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInTradeFinanceBeneficiaryName(String value) {
        this.inTradeFinanceBeneficiaryName = value;
    }

    /**
     * Gets the value of the inTradeFinanceComments property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInTradeFinanceComments() {
        return inTradeFinanceComments;
    }

    /**
     * Sets the value of the inTradeFinanceComments property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInTradeFinanceComments(String value) {
        this.inTradeFinanceComments = value;
    }

    /**
     * Gets the value of the inTradeFinanceCorrBankAccCd property.
     * 
     */
    public short getInTradeFinanceCorrBankAccCd() {
        return inTradeFinanceCorrBankAccCd;
    }

    /**
     * Sets the value of the inTradeFinanceCorrBankAccCd property.
     * 
     */
    public void setInTradeFinanceCorrBankAccCd(short value) {
        this.inTradeFinanceCorrBankAccCd = value;
    }

    /**
     * Gets the value of the inTradeFinanceCorrBankAccNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInTradeFinanceCorrBankAccNum() {
        return inTradeFinanceCorrBankAccNum;
    }

    /**
     * Sets the value of the inTradeFinanceCorrBankAccNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInTradeFinanceCorrBankAccNum(String value) {
        this.inTradeFinanceCorrBankAccNum = value;
    }

    /**
     * Gets the value of the inTradeFinanceCorreAccPrftSys property.
     * 
     */
    public short getInTradeFinanceCorreAccPrftSys() {
        return inTradeFinanceCorreAccPrftSys;
    }

    /**
     * Sets the value of the inTradeFinanceCorreAccPrftSys property.
     * 
     */
    public void setInTradeFinanceCorreAccPrftSys(short value) {
        this.inTradeFinanceCorreAccPrftSys = value;
    }

    /**
     * Gets the value of the inTradeFinanceCorrespondentName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInTradeFinanceCorrespondentName() {
        return inTradeFinanceCorrespondentName;
    }

    /**
     * Sets the value of the inTradeFinanceCorrespondentName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInTradeFinanceCorrespondentName(String value) {
        this.inTradeFinanceCorrespondentName = value;
    }

    /**
     * Gets the value of the inTradeFinancePrincAccPrftSys property.
     * 
     */
    public short getInTradeFinancePrincAccPrftSys() {
        return inTradeFinancePrincAccPrftSys;
    }

    /**
     * Sets the value of the inTradeFinancePrincAccPrftSys property.
     * 
     */
    public void setInTradeFinancePrincAccPrftSys(short value) {
        this.inTradeFinancePrincAccPrftSys = value;
    }

    /**
     * Gets the value of the inTradeFinancePrincipalCommAddr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInTradeFinancePrincipalCommAddr() {
        return inTradeFinancePrincipalCommAddr;
    }

    /**
     * Sets the value of the inTradeFinancePrincipalCommAddr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInTradeFinancePrincipalCommAddr(String value) {
        this.inTradeFinancePrincipalCommAddr = value;
    }

    /**
     * Gets the value of the inTradeFinancePrinicipalName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInTradeFinancePrinicipalName() {
        return inTradeFinancePrinicipalName;
    }

    /**
     * Sets the value of the inTradeFinancePrinicipalName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInTradeFinancePrinicipalName(String value) {
        this.inTradeFinancePrinicipalName = value;
    }

    /**
     * Gets the value of the inTradeFinanceRefNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInTradeFinanceRefNo() {
        return inTradeFinanceRefNo;
    }

    /**
     * Sets the value of the inTradeFinanceRefNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInTradeFinanceRefNo(String value) {
        this.inTradeFinanceRefNo = value;
    }

    /**
     * Gets the value of the inTradeFinanceStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInTradeFinanceStatus() {
        return inTradeFinanceStatus;
    }

    /**
     * Sets the value of the inTradeFinanceStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInTradeFinanceStatus(String value) {
        this.inTradeFinanceStatus = value;
    }

    /**
     * Gets the value of the inTradeFinanceTfAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInTradeFinanceTfAmount() {
        return inTradeFinanceTfAmount;
    }

    /**
     * Sets the value of the inTradeFinanceTfAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInTradeFinanceTfAmount(BigDecimal value) {
        this.inTradeFinanceTfAmount = value;
    }

    /**
     * Gets the value of the inTradeFinanceTfCd property.
     * 
     */
    public short getInTradeFinanceTfCd() {
        return inTradeFinanceTfCd;
    }

    /**
     * Sets the value of the inTradeFinanceTfCd property.
     * 
     */
    public void setInTradeFinanceTfCd(short value) {
        this.inTradeFinanceTfCd = value;
    }

    /**
     * Gets the value of the inTradeFinanceTfConfirmDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInTradeFinanceTfConfirmDate() {
        return inTradeFinanceTfConfirmDate;
    }

    /**
     * Sets the value of the inTradeFinanceTfConfirmDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInTradeFinanceTfConfirmDate(XMLGregorianCalendar value) {
        this.inTradeFinanceTfConfirmDate = value;
    }

    /**
     * Gets the value of the inTradeFinanceTfNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInTradeFinanceTfNumber() {
        return inTradeFinanceTfNumber;
    }

    /**
     * Sets the value of the inTradeFinanceTfNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInTradeFinanceTfNumber(String value) {
        this.inTradeFinanceTfNumber = value;
    }

    /**
     * Gets the value of the inTradeFinanceTfOpenDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInTradeFinanceTfOpenDate() {
        return inTradeFinanceTfOpenDate;
    }

    /**
     * Sets the value of the inTradeFinanceTfOpenDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInTradeFinanceTfOpenDate(XMLGregorianCalendar value) {
        this.inTradeFinanceTfOpenDate = value;
    }

    /**
     * Gets the value of the inTradeFinanceTfType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInTradeFinanceTfType() {
        return inTradeFinanceTfType;
    }

    /**
     * Sets the value of the inTradeFinanceTfType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInTradeFinanceTfType(String value) {
        this.inTradeFinanceTfType = value;
    }

    /**
     * Gets the value of the inTradeFinanceTmpstamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInTradeFinanceTmpstamp() {
        return inTradeFinanceTmpstamp;
    }

    /**
     * Sets the value of the inTradeFinanceTmpstamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInTradeFinanceTmpstamp(XMLGregorianCalendar value) {
        this.inTradeFinanceTmpstamp = value;
    }

    /**
     * Gets the value of the inTradeFinanceSettlementMode property.
     * 
     */
    public short getInTradeFinanceSettlementMode() {
        return inTradeFinanceSettlementMode;
    }

    /**
     * Sets the value of the inTradeFinanceSettlementMode property.
     * 
     */
    public void setInTradeFinanceSettlementMode(short value) {
        this.inTradeFinanceSettlementMode = value;
    }

}
