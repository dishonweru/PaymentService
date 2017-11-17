
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for TradeFinanceAccountRetrieveExport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TradeFinanceAccountRetrieveExport">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}BaseExport">
 *       &lt;sequence>
 *         &lt;element name="OutAdvisingSwiftAllnceBicsBankDescr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutAdvisingSwiftAllnceBicsBic" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutBenefCustNameListSetDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutBeneficiaryCustAddressAddress1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutBeneficiaryCustomerCDigit" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutBeneficiaryCustomerCustId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutBeneficiaryProfitsAccountAccountCd" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutBeneficiaryProfitsAccountAccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutBeneficiaryProfitsAccountPrftSystem" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutCentralBankCodeGenericDetailDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCentralBankCodeGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutClientProfitsExitStateWorkActualMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutClientProfitsExitStateWorkId" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OutClientProfitsExitStateWorkLanguage" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutClientProfitsExitStateWorkMessageType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutClientProfitsExitStateWorkPrftSystem" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutClientProfitsExitStateWorkRoutineSn" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OutClientProfitsExitStateWorkTerminationAction" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutClientProfitsExitStateWorkValruleId" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OutClientProfitsExitStateWorkValruleSnum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutCommandIefSuppliedCommand" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCorrespCustNameListSetDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCorrespondentCustomerCDigit" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutCorrespondentCustomerCustId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutCorrespondentProfitsAccountAccountCd" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutCorrespondentProfitsAccountAccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCorrespondentProfitsAccountPrftSystem" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutCountryGenericDetailDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCountryGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutCurrencyIdCurrency" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutCurrencyShortDescr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustAddressAddress1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustAddressAddressType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutIssuingSwiftAllnceBicsBankDescr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutIssuingSwiftAllnceBicsBic" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutMonitoringUnitCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutMonitoringUnitUnitName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutOpeningUnitCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutOpeningUnitUnitName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutOurCustomerIefSuppliedFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutPrftTransactionIdTransact" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutPrincipalCustAddressAddress1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutPrincipalCustomerCDigit" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutPrincipalCustomerCustId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutPrincipalProfitsAccountAccountCd" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutPrincipalProfitsAccountAccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutPrincipalProfitsAccountPrftSystem" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutPrincipCustNameListSetDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutPrintoutValidationInputVoucherLine" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutProductDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutProductIdProduct" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutTfTypeIefSuppliedFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutTradeFinanceBenefAccCd" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutTradeFinanceBenefAccNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutTradeFinanceBenefAccPrftSys" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutTradeFinanceBenefCommAddr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutTradeFinanceBeneficiaryName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutTradeFinanceComments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutTradeFinanceCorrBankAccCd" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutTradeFinanceCorrBankAccNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutTradeFinanceCorreAccPrftSys" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutTradeFinanceCorrespondentName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutTradeFinancePrincAccPrftSys" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutTradeFinancePrincipalAccCd" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutTradeFinancePrincipalAccNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutTradeFinancePrincipalCommAddr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutTradeFinancePrinicipalName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutTradeFinanceRefNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutTradeFinanceStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutTradeFinanceTfAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutTradeFinanceTfCd" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutTradeFinanceTfConfirmDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutTradeFinanceTfNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutTradeFinanceTfOpenDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutTradeFinanceTfType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutTradeFinanceTmpstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutTrxCountAdvCounter" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutTrxCountTrxCounter" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutTradeFinanceSettlementMode" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TradeFinanceAccountRetrieveExport", propOrder = {
    "outAdvisingSwiftAllnceBicsBankDescr",
    "outAdvisingSwiftAllnceBicsBic",
    "outBenefCustNameListSetDescription",
    "outBeneficiaryCustAddressAddress1",
    "outBeneficiaryCustomerCDigit",
    "outBeneficiaryCustomerCustId",
    "outBeneficiaryProfitsAccountAccountCd",
    "outBeneficiaryProfitsAccountAccountNumber",
    "outBeneficiaryProfitsAccountPrftSystem",
    "outCentralBankCodeGenericDetailDescription",
    "outCentralBankCodeGenericDetailSerialNum",
    "outClientProfitsExitStateWorkActualMessage",
    "outClientProfitsExitStateWorkId",
    "outClientProfitsExitStateWorkLanguage",
    "outClientProfitsExitStateWorkMessageType",
    "outClientProfitsExitStateWorkPrftSystem",
    "outClientProfitsExitStateWorkRoutineSn",
    "outClientProfitsExitStateWorkTerminationAction",
    "outClientProfitsExitStateWorkValruleId",
    "outClientProfitsExitStateWorkValruleSnum",
    "outCommandIefSuppliedCommand",
    "outCorrespCustNameListSetDescription",
    "outCorrespondentCustomerCDigit",
    "outCorrespondentCustomerCustId",
    "outCorrespondentProfitsAccountAccountCd",
    "outCorrespondentProfitsAccountAccountNumber",
    "outCorrespondentProfitsAccountPrftSystem",
    "outCountryGenericDetailDescription",
    "outCountryGenericDetailSerialNum",
    "outCurrencyIdCurrency",
    "outCurrencyShortDescr",
    "outCustAddressAddress1",
    "outCustAddressAddressType",
    "outIssuingSwiftAllnceBicsBankDescr",
    "outIssuingSwiftAllnceBicsBic",
    "outMonitoringUnitCode",
    "outMonitoringUnitUnitName",
    "outOpeningUnitCode",
    "outOpeningUnitUnitName",
    "outOurCustomerIefSuppliedFlag",
    "outPrftTransactionIdTransact",
    "outPrincipalCustAddressAddress1",
    "outPrincipalCustomerCDigit",
    "outPrincipalCustomerCustId",
    "outPrincipalProfitsAccountAccountCd",
    "outPrincipalProfitsAccountAccountNumber",
    "outPrincipalProfitsAccountPrftSystem",
    "outPrincipCustNameListSetDescription",
    "outPrintoutValidationInputVoucherLine",
    "outProductDescription",
    "outProductIdProduct",
    "outTfTypeIefSuppliedFlag",
    "outTradeFinanceBenefAccCd",
    "outTradeFinanceBenefAccNum",
    "outTradeFinanceBenefAccPrftSys",
    "outTradeFinanceBenefCommAddr",
    "outTradeFinanceBeneficiaryName",
    "outTradeFinanceComments",
    "outTradeFinanceCorrBankAccCd",
    "outTradeFinanceCorrBankAccNum",
    "outTradeFinanceCorreAccPrftSys",
    "outTradeFinanceCorrespondentName",
    "outTradeFinancePrincAccPrftSys",
    "outTradeFinancePrincipalAccCd",
    "outTradeFinancePrincipalAccNum",
    "outTradeFinancePrincipalCommAddr",
    "outTradeFinancePrinicipalName",
    "outTradeFinanceRefNo",
    "outTradeFinanceStatus",
    "outTradeFinanceTfAmount",
    "outTradeFinanceTfCd",
    "outTradeFinanceTfConfirmDate",
    "outTradeFinanceTfNumber",
    "outTradeFinanceTfOpenDate",
    "outTradeFinanceTfType",
    "outTradeFinanceTmpstamp",
    "outTrxCountAdvCounter",
    "outTrxCountTrxCounter",
    "outTradeFinanceSettlementMode"
})
public class TradeFinanceAccountRetrieveExport
    extends BaseExport
{

    @XmlElement(name = "OutAdvisingSwiftAllnceBicsBankDescr")
    protected String outAdvisingSwiftAllnceBicsBankDescr;
    @XmlElement(name = "OutAdvisingSwiftAllnceBicsBic")
    protected String outAdvisingSwiftAllnceBicsBic;
    @XmlElement(name = "OutBenefCustNameListSetDescription")
    protected String outBenefCustNameListSetDescription;
    @XmlElement(name = "OutBeneficiaryCustAddressAddress1")
    protected String outBeneficiaryCustAddressAddress1;
    @XmlElement(name = "OutBeneficiaryCustomerCDigit")
    protected short outBeneficiaryCustomerCDigit;
    @XmlElement(name = "OutBeneficiaryCustomerCustId")
    protected int outBeneficiaryCustomerCustId;
    @XmlElement(name = "OutBeneficiaryProfitsAccountAccountCd")
    protected short outBeneficiaryProfitsAccountAccountCd;
    @XmlElement(name = "OutBeneficiaryProfitsAccountAccountNumber")
    protected String outBeneficiaryProfitsAccountAccountNumber;
    @XmlElement(name = "OutBeneficiaryProfitsAccountPrftSystem")
    protected short outBeneficiaryProfitsAccountPrftSystem;
    @XmlElement(name = "OutCentralBankCodeGenericDetailDescription")
    protected String outCentralBankCodeGenericDetailDescription;
    @XmlElement(name = "OutCentralBankCodeGenericDetailSerialNum")
    protected int outCentralBankCodeGenericDetailSerialNum;
    @XmlElement(name = "OutClientProfitsExitStateWorkActualMessage")
    protected String outClientProfitsExitStateWorkActualMessage;
    @XmlElement(name = "OutClientProfitsExitStateWorkId")
    protected double outClientProfitsExitStateWorkId;
    @XmlElement(name = "OutClientProfitsExitStateWorkLanguage")
    protected int outClientProfitsExitStateWorkLanguage;
    @XmlElement(name = "OutClientProfitsExitStateWorkMessageType")
    protected String outClientProfitsExitStateWorkMessageType;
    @XmlElement(name = "OutClientProfitsExitStateWorkPrftSystem")
    protected short outClientProfitsExitStateWorkPrftSystem;
    @XmlElement(name = "OutClientProfitsExitStateWorkRoutineSn")
    protected double outClientProfitsExitStateWorkRoutineSn;
    @XmlElement(name = "OutClientProfitsExitStateWorkTerminationAction")
    protected String outClientProfitsExitStateWorkTerminationAction;
    @XmlElement(name = "OutClientProfitsExitStateWorkValruleId")
    protected double outClientProfitsExitStateWorkValruleId;
    @XmlElement(name = "OutClientProfitsExitStateWorkValruleSnum")
    protected int outClientProfitsExitStateWorkValruleSnum;
    @XmlElement(name = "OutCommandIefSuppliedCommand")
    protected String outCommandIefSuppliedCommand;
    @XmlElement(name = "OutCorrespCustNameListSetDescription")
    protected String outCorrespCustNameListSetDescription;
    @XmlElement(name = "OutCorrespondentCustomerCDigit")
    protected short outCorrespondentCustomerCDigit;
    @XmlElement(name = "OutCorrespondentCustomerCustId")
    protected int outCorrespondentCustomerCustId;
    @XmlElement(name = "OutCorrespondentProfitsAccountAccountCd")
    protected short outCorrespondentProfitsAccountAccountCd;
    @XmlElement(name = "OutCorrespondentProfitsAccountAccountNumber")
    protected String outCorrespondentProfitsAccountAccountNumber;
    @XmlElement(name = "OutCorrespondentProfitsAccountPrftSystem")
    protected short outCorrespondentProfitsAccountPrftSystem;
    @XmlElement(name = "OutCountryGenericDetailDescription")
    protected String outCountryGenericDetailDescription;
    @XmlElement(name = "OutCountryGenericDetailSerialNum")
    protected int outCountryGenericDetailSerialNum;
    @XmlElement(name = "OutCurrencyIdCurrency")
    protected int outCurrencyIdCurrency;
    @XmlElement(name = "OutCurrencyShortDescr")
    protected String outCurrencyShortDescr;
    @XmlElement(name = "OutCustAddressAddress1")
    protected String outCustAddressAddress1;
    @XmlElement(name = "OutCustAddressAddressType")
    protected String outCustAddressAddressType;
    @XmlElement(name = "OutIssuingSwiftAllnceBicsBankDescr")
    protected String outIssuingSwiftAllnceBicsBankDescr;
    @XmlElement(name = "OutIssuingSwiftAllnceBicsBic")
    protected String outIssuingSwiftAllnceBicsBic;
    @XmlElement(name = "OutMonitoringUnitCode")
    protected int outMonitoringUnitCode;
    @XmlElement(name = "OutMonitoringUnitUnitName")
    protected String outMonitoringUnitUnitName;
    @XmlElement(name = "OutOpeningUnitCode")
    protected int outOpeningUnitCode;
    @XmlElement(name = "OutOpeningUnitUnitName")
    protected String outOpeningUnitUnitName;
    @XmlElement(name = "OutOurCustomerIefSuppliedFlag")
    protected String outOurCustomerIefSuppliedFlag;
    @XmlElement(name = "OutPrftTransactionIdTransact")
    protected int outPrftTransactionIdTransact;
    @XmlElement(name = "OutPrincipalCustAddressAddress1")
    protected String outPrincipalCustAddressAddress1;
    @XmlElement(name = "OutPrincipalCustomerCDigit")
    protected short outPrincipalCustomerCDigit;
    @XmlElement(name = "OutPrincipalCustomerCustId")
    protected int outPrincipalCustomerCustId;
    @XmlElement(name = "OutPrincipalProfitsAccountAccountCd")
    protected short outPrincipalProfitsAccountAccountCd;
    @XmlElement(name = "OutPrincipalProfitsAccountAccountNumber")
    protected String outPrincipalProfitsAccountAccountNumber;
    @XmlElement(name = "OutPrincipalProfitsAccountPrftSystem")
    protected short outPrincipalProfitsAccountPrftSystem;
    @XmlElement(name = "OutPrincipCustNameListSetDescription")
    protected String outPrincipCustNameListSetDescription;
    @XmlElement(name = "OutPrintoutValidationInputVoucherLine")
    protected String outPrintoutValidationInputVoucherLine;
    @XmlElement(name = "OutProductDescription")
    protected String outProductDescription;
    @XmlElement(name = "OutProductIdProduct")
    protected int outProductIdProduct;
    @XmlElement(name = "OutTfTypeIefSuppliedFlag")
    protected String outTfTypeIefSuppliedFlag;
    @XmlElement(name = "OutTradeFinanceBenefAccCd")
    protected short outTradeFinanceBenefAccCd;
    @XmlElement(name = "OutTradeFinanceBenefAccNum")
    protected String outTradeFinanceBenefAccNum;
    @XmlElement(name = "OutTradeFinanceBenefAccPrftSys")
    protected short outTradeFinanceBenefAccPrftSys;
    @XmlElement(name = "OutTradeFinanceBenefCommAddr")
    protected String outTradeFinanceBenefCommAddr;
    @XmlElement(name = "OutTradeFinanceBeneficiaryName")
    protected String outTradeFinanceBeneficiaryName;
    @XmlElement(name = "OutTradeFinanceComments")
    protected String outTradeFinanceComments;
    @XmlElement(name = "OutTradeFinanceCorrBankAccCd")
    protected short outTradeFinanceCorrBankAccCd;
    @XmlElement(name = "OutTradeFinanceCorrBankAccNum")
    protected String outTradeFinanceCorrBankAccNum;
    @XmlElement(name = "OutTradeFinanceCorreAccPrftSys")
    protected short outTradeFinanceCorreAccPrftSys;
    @XmlElement(name = "OutTradeFinanceCorrespondentName")
    protected String outTradeFinanceCorrespondentName;
    @XmlElement(name = "OutTradeFinancePrincAccPrftSys")
    protected short outTradeFinancePrincAccPrftSys;
    @XmlElement(name = "OutTradeFinancePrincipalAccCd")
    protected short outTradeFinancePrincipalAccCd;
    @XmlElement(name = "OutTradeFinancePrincipalAccNum")
    protected String outTradeFinancePrincipalAccNum;
    @XmlElement(name = "OutTradeFinancePrincipalCommAddr")
    protected String outTradeFinancePrincipalCommAddr;
    @XmlElement(name = "OutTradeFinancePrinicipalName")
    protected String outTradeFinancePrinicipalName;
    @XmlElement(name = "OutTradeFinanceRefNo")
    protected String outTradeFinanceRefNo;
    @XmlElement(name = "OutTradeFinanceStatus")
    protected String outTradeFinanceStatus;
    @XmlElement(name = "OutTradeFinanceTfAmount", required = true)
    protected BigDecimal outTradeFinanceTfAmount;
    @XmlElement(name = "OutTradeFinanceTfCd")
    protected short outTradeFinanceTfCd;
    @XmlElement(name = "OutTradeFinanceTfConfirmDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outTradeFinanceTfConfirmDate;
    @XmlElement(name = "OutTradeFinanceTfNumber")
    protected String outTradeFinanceTfNumber;
    @XmlElement(name = "OutTradeFinanceTfOpenDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outTradeFinanceTfOpenDate;
    @XmlElement(name = "OutTradeFinanceTfType")
    protected String outTradeFinanceTfType;
    @XmlElement(name = "OutTradeFinanceTmpstamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outTradeFinanceTmpstamp;
    @XmlElement(name = "OutTrxCountAdvCounter")
    protected int outTrxCountAdvCounter;
    @XmlElement(name = "OutTrxCountTrxCounter")
    protected int outTrxCountTrxCounter;
    @XmlElement(name = "OutTradeFinanceSettlementMode")
    protected short outTradeFinanceSettlementMode;

    /**
     * Gets the value of the outAdvisingSwiftAllnceBicsBankDescr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutAdvisingSwiftAllnceBicsBankDescr() {
        return outAdvisingSwiftAllnceBicsBankDescr;
    }

    /**
     * Sets the value of the outAdvisingSwiftAllnceBicsBankDescr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutAdvisingSwiftAllnceBicsBankDescr(String value) {
        this.outAdvisingSwiftAllnceBicsBankDescr = value;
    }

    /**
     * Gets the value of the outAdvisingSwiftAllnceBicsBic property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutAdvisingSwiftAllnceBicsBic() {
        return outAdvisingSwiftAllnceBicsBic;
    }

    /**
     * Sets the value of the outAdvisingSwiftAllnceBicsBic property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutAdvisingSwiftAllnceBicsBic(String value) {
        this.outAdvisingSwiftAllnceBicsBic = value;
    }

    /**
     * Gets the value of the outBenefCustNameListSetDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutBenefCustNameListSetDescription() {
        return outBenefCustNameListSetDescription;
    }

    /**
     * Sets the value of the outBenefCustNameListSetDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutBenefCustNameListSetDescription(String value) {
        this.outBenefCustNameListSetDescription = value;
    }

    /**
     * Gets the value of the outBeneficiaryCustAddressAddress1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutBeneficiaryCustAddressAddress1() {
        return outBeneficiaryCustAddressAddress1;
    }

    /**
     * Sets the value of the outBeneficiaryCustAddressAddress1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutBeneficiaryCustAddressAddress1(String value) {
        this.outBeneficiaryCustAddressAddress1 = value;
    }

    /**
     * Gets the value of the outBeneficiaryCustomerCDigit property.
     * 
     */
    public short getOutBeneficiaryCustomerCDigit() {
        return outBeneficiaryCustomerCDigit;
    }

    /**
     * Sets the value of the outBeneficiaryCustomerCDigit property.
     * 
     */
    public void setOutBeneficiaryCustomerCDigit(short value) {
        this.outBeneficiaryCustomerCDigit = value;
    }

    /**
     * Gets the value of the outBeneficiaryCustomerCustId property.
     * 
     */
    public int getOutBeneficiaryCustomerCustId() {
        return outBeneficiaryCustomerCustId;
    }

    /**
     * Sets the value of the outBeneficiaryCustomerCustId property.
     * 
     */
    public void setOutBeneficiaryCustomerCustId(int value) {
        this.outBeneficiaryCustomerCustId = value;
    }

    /**
     * Gets the value of the outBeneficiaryProfitsAccountAccountCd property.
     * 
     */
    public short getOutBeneficiaryProfitsAccountAccountCd() {
        return outBeneficiaryProfitsAccountAccountCd;
    }

    /**
     * Sets the value of the outBeneficiaryProfitsAccountAccountCd property.
     * 
     */
    public void setOutBeneficiaryProfitsAccountAccountCd(short value) {
        this.outBeneficiaryProfitsAccountAccountCd = value;
    }

    /**
     * Gets the value of the outBeneficiaryProfitsAccountAccountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutBeneficiaryProfitsAccountAccountNumber() {
        return outBeneficiaryProfitsAccountAccountNumber;
    }

    /**
     * Sets the value of the outBeneficiaryProfitsAccountAccountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutBeneficiaryProfitsAccountAccountNumber(String value) {
        this.outBeneficiaryProfitsAccountAccountNumber = value;
    }

    /**
     * Gets the value of the outBeneficiaryProfitsAccountPrftSystem property.
     * 
     */
    public short getOutBeneficiaryProfitsAccountPrftSystem() {
        return outBeneficiaryProfitsAccountPrftSystem;
    }

    /**
     * Sets the value of the outBeneficiaryProfitsAccountPrftSystem property.
     * 
     */
    public void setOutBeneficiaryProfitsAccountPrftSystem(short value) {
        this.outBeneficiaryProfitsAccountPrftSystem = value;
    }

    /**
     * Gets the value of the outCentralBankCodeGenericDetailDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCentralBankCodeGenericDetailDescription() {
        return outCentralBankCodeGenericDetailDescription;
    }

    /**
     * Sets the value of the outCentralBankCodeGenericDetailDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCentralBankCodeGenericDetailDescription(String value) {
        this.outCentralBankCodeGenericDetailDescription = value;
    }

    /**
     * Gets the value of the outCentralBankCodeGenericDetailSerialNum property.
     * 
     */
    public int getOutCentralBankCodeGenericDetailSerialNum() {
        return outCentralBankCodeGenericDetailSerialNum;
    }

    /**
     * Sets the value of the outCentralBankCodeGenericDetailSerialNum property.
     * 
     */
    public void setOutCentralBankCodeGenericDetailSerialNum(int value) {
        this.outCentralBankCodeGenericDetailSerialNum = value;
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
     * Gets the value of the outCommandIefSuppliedCommand property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCommandIefSuppliedCommand() {
        return outCommandIefSuppliedCommand;
    }

    /**
     * Sets the value of the outCommandIefSuppliedCommand property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCommandIefSuppliedCommand(String value) {
        this.outCommandIefSuppliedCommand = value;
    }

    /**
     * Gets the value of the outCorrespCustNameListSetDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCorrespCustNameListSetDescription() {
        return outCorrespCustNameListSetDescription;
    }

    /**
     * Sets the value of the outCorrespCustNameListSetDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCorrespCustNameListSetDescription(String value) {
        this.outCorrespCustNameListSetDescription = value;
    }

    /**
     * Gets the value of the outCorrespondentCustomerCDigit property.
     * 
     */
    public short getOutCorrespondentCustomerCDigit() {
        return outCorrespondentCustomerCDigit;
    }

    /**
     * Sets the value of the outCorrespondentCustomerCDigit property.
     * 
     */
    public void setOutCorrespondentCustomerCDigit(short value) {
        this.outCorrespondentCustomerCDigit = value;
    }

    /**
     * Gets the value of the outCorrespondentCustomerCustId property.
     * 
     */
    public int getOutCorrespondentCustomerCustId() {
        return outCorrespondentCustomerCustId;
    }

    /**
     * Sets the value of the outCorrespondentCustomerCustId property.
     * 
     */
    public void setOutCorrespondentCustomerCustId(int value) {
        this.outCorrespondentCustomerCustId = value;
    }

    /**
     * Gets the value of the outCorrespondentProfitsAccountAccountCd property.
     * 
     */
    public short getOutCorrespondentProfitsAccountAccountCd() {
        return outCorrespondentProfitsAccountAccountCd;
    }

    /**
     * Sets the value of the outCorrespondentProfitsAccountAccountCd property.
     * 
     */
    public void setOutCorrespondentProfitsAccountAccountCd(short value) {
        this.outCorrespondentProfitsAccountAccountCd = value;
    }

    /**
     * Gets the value of the outCorrespondentProfitsAccountAccountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCorrespondentProfitsAccountAccountNumber() {
        return outCorrespondentProfitsAccountAccountNumber;
    }

    /**
     * Sets the value of the outCorrespondentProfitsAccountAccountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCorrespondentProfitsAccountAccountNumber(String value) {
        this.outCorrespondentProfitsAccountAccountNumber = value;
    }

    /**
     * Gets the value of the outCorrespondentProfitsAccountPrftSystem property.
     * 
     */
    public short getOutCorrespondentProfitsAccountPrftSystem() {
        return outCorrespondentProfitsAccountPrftSystem;
    }

    /**
     * Sets the value of the outCorrespondentProfitsAccountPrftSystem property.
     * 
     */
    public void setOutCorrespondentProfitsAccountPrftSystem(short value) {
        this.outCorrespondentProfitsAccountPrftSystem = value;
    }

    /**
     * Gets the value of the outCountryGenericDetailDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCountryGenericDetailDescription() {
        return outCountryGenericDetailDescription;
    }

    /**
     * Sets the value of the outCountryGenericDetailDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCountryGenericDetailDescription(String value) {
        this.outCountryGenericDetailDescription = value;
    }

    /**
     * Gets the value of the outCountryGenericDetailSerialNum property.
     * 
     */
    public int getOutCountryGenericDetailSerialNum() {
        return outCountryGenericDetailSerialNum;
    }

    /**
     * Sets the value of the outCountryGenericDetailSerialNum property.
     * 
     */
    public void setOutCountryGenericDetailSerialNum(int value) {
        this.outCountryGenericDetailSerialNum = value;
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
     * Gets the value of the outCustAddressAddressType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCustAddressAddressType() {
        return outCustAddressAddressType;
    }

    /**
     * Sets the value of the outCustAddressAddressType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCustAddressAddressType(String value) {
        this.outCustAddressAddressType = value;
    }

    /**
     * Gets the value of the outIssuingSwiftAllnceBicsBankDescr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutIssuingSwiftAllnceBicsBankDescr() {
        return outIssuingSwiftAllnceBicsBankDescr;
    }

    /**
     * Sets the value of the outIssuingSwiftAllnceBicsBankDescr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutIssuingSwiftAllnceBicsBankDescr(String value) {
        this.outIssuingSwiftAllnceBicsBankDescr = value;
    }

    /**
     * Gets the value of the outIssuingSwiftAllnceBicsBic property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutIssuingSwiftAllnceBicsBic() {
        return outIssuingSwiftAllnceBicsBic;
    }

    /**
     * Sets the value of the outIssuingSwiftAllnceBicsBic property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutIssuingSwiftAllnceBicsBic(String value) {
        this.outIssuingSwiftAllnceBicsBic = value;
    }

    /**
     * Gets the value of the outMonitoringUnitCode property.
     * 
     */
    public int getOutMonitoringUnitCode() {
        return outMonitoringUnitCode;
    }

    /**
     * Sets the value of the outMonitoringUnitCode property.
     * 
     */
    public void setOutMonitoringUnitCode(int value) {
        this.outMonitoringUnitCode = value;
    }

    /**
     * Gets the value of the outMonitoringUnitUnitName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutMonitoringUnitUnitName() {
        return outMonitoringUnitUnitName;
    }

    /**
     * Sets the value of the outMonitoringUnitUnitName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutMonitoringUnitUnitName(String value) {
        this.outMonitoringUnitUnitName = value;
    }

    /**
     * Gets the value of the outOpeningUnitCode property.
     * 
     */
    public int getOutOpeningUnitCode() {
        return outOpeningUnitCode;
    }

    /**
     * Sets the value of the outOpeningUnitCode property.
     * 
     */
    public void setOutOpeningUnitCode(int value) {
        this.outOpeningUnitCode = value;
    }

    /**
     * Gets the value of the outOpeningUnitUnitName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutOpeningUnitUnitName() {
        return outOpeningUnitUnitName;
    }

    /**
     * Sets the value of the outOpeningUnitUnitName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutOpeningUnitUnitName(String value) {
        this.outOpeningUnitUnitName = value;
    }

    /**
     * Gets the value of the outOurCustomerIefSuppliedFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutOurCustomerIefSuppliedFlag() {
        return outOurCustomerIefSuppliedFlag;
    }

    /**
     * Sets the value of the outOurCustomerIefSuppliedFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutOurCustomerIefSuppliedFlag(String value) {
        this.outOurCustomerIefSuppliedFlag = value;
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
     * Gets the value of the outPrincipalCustAddressAddress1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutPrincipalCustAddressAddress1() {
        return outPrincipalCustAddressAddress1;
    }

    /**
     * Sets the value of the outPrincipalCustAddressAddress1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutPrincipalCustAddressAddress1(String value) {
        this.outPrincipalCustAddressAddress1 = value;
    }

    /**
     * Gets the value of the outPrincipalCustomerCDigit property.
     * 
     */
    public short getOutPrincipalCustomerCDigit() {
        return outPrincipalCustomerCDigit;
    }

    /**
     * Sets the value of the outPrincipalCustomerCDigit property.
     * 
     */
    public void setOutPrincipalCustomerCDigit(short value) {
        this.outPrincipalCustomerCDigit = value;
    }

    /**
     * Gets the value of the outPrincipalCustomerCustId property.
     * 
     */
    public int getOutPrincipalCustomerCustId() {
        return outPrincipalCustomerCustId;
    }

    /**
     * Sets the value of the outPrincipalCustomerCustId property.
     * 
     */
    public void setOutPrincipalCustomerCustId(int value) {
        this.outPrincipalCustomerCustId = value;
    }

    /**
     * Gets the value of the outPrincipalProfitsAccountAccountCd property.
     * 
     */
    public short getOutPrincipalProfitsAccountAccountCd() {
        return outPrincipalProfitsAccountAccountCd;
    }

    /**
     * Sets the value of the outPrincipalProfitsAccountAccountCd property.
     * 
     */
    public void setOutPrincipalProfitsAccountAccountCd(short value) {
        this.outPrincipalProfitsAccountAccountCd = value;
    }

    /**
     * Gets the value of the outPrincipalProfitsAccountAccountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutPrincipalProfitsAccountAccountNumber() {
        return outPrincipalProfitsAccountAccountNumber;
    }

    /**
     * Sets the value of the outPrincipalProfitsAccountAccountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutPrincipalProfitsAccountAccountNumber(String value) {
        this.outPrincipalProfitsAccountAccountNumber = value;
    }

    /**
     * Gets the value of the outPrincipalProfitsAccountPrftSystem property.
     * 
     */
    public short getOutPrincipalProfitsAccountPrftSystem() {
        return outPrincipalProfitsAccountPrftSystem;
    }

    /**
     * Sets the value of the outPrincipalProfitsAccountPrftSystem property.
     * 
     */
    public void setOutPrincipalProfitsAccountPrftSystem(short value) {
        this.outPrincipalProfitsAccountPrftSystem = value;
    }

    /**
     * Gets the value of the outPrincipCustNameListSetDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutPrincipCustNameListSetDescription() {
        return outPrincipCustNameListSetDescription;
    }

    /**
     * Sets the value of the outPrincipCustNameListSetDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutPrincipCustNameListSetDescription(String value) {
        this.outPrincipCustNameListSetDescription = value;
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
     * Gets the value of the outTfTypeIefSuppliedFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutTfTypeIefSuppliedFlag() {
        return outTfTypeIefSuppliedFlag;
    }

    /**
     * Sets the value of the outTfTypeIefSuppliedFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutTfTypeIefSuppliedFlag(String value) {
        this.outTfTypeIefSuppliedFlag = value;
    }

    /**
     * Gets the value of the outTradeFinanceBenefAccCd property.
     * 
     */
    public short getOutTradeFinanceBenefAccCd() {
        return outTradeFinanceBenefAccCd;
    }

    /**
     * Sets the value of the outTradeFinanceBenefAccCd property.
     * 
     */
    public void setOutTradeFinanceBenefAccCd(short value) {
        this.outTradeFinanceBenefAccCd = value;
    }

    /**
     * Gets the value of the outTradeFinanceBenefAccNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutTradeFinanceBenefAccNum() {
        return outTradeFinanceBenefAccNum;
    }

    /**
     * Sets the value of the outTradeFinanceBenefAccNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutTradeFinanceBenefAccNum(String value) {
        this.outTradeFinanceBenefAccNum = value;
    }

    /**
     * Gets the value of the outTradeFinanceBenefAccPrftSys property.
     * 
     */
    public short getOutTradeFinanceBenefAccPrftSys() {
        return outTradeFinanceBenefAccPrftSys;
    }

    /**
     * Sets the value of the outTradeFinanceBenefAccPrftSys property.
     * 
     */
    public void setOutTradeFinanceBenefAccPrftSys(short value) {
        this.outTradeFinanceBenefAccPrftSys = value;
    }

    /**
     * Gets the value of the outTradeFinanceBenefCommAddr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutTradeFinanceBenefCommAddr() {
        return outTradeFinanceBenefCommAddr;
    }

    /**
     * Sets the value of the outTradeFinanceBenefCommAddr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutTradeFinanceBenefCommAddr(String value) {
        this.outTradeFinanceBenefCommAddr = value;
    }

    /**
     * Gets the value of the outTradeFinanceBeneficiaryName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutTradeFinanceBeneficiaryName() {
        return outTradeFinanceBeneficiaryName;
    }

    /**
     * Sets the value of the outTradeFinanceBeneficiaryName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutTradeFinanceBeneficiaryName(String value) {
        this.outTradeFinanceBeneficiaryName = value;
    }

    /**
     * Gets the value of the outTradeFinanceComments property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutTradeFinanceComments() {
        return outTradeFinanceComments;
    }

    /**
     * Sets the value of the outTradeFinanceComments property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutTradeFinanceComments(String value) {
        this.outTradeFinanceComments = value;
    }

    /**
     * Gets the value of the outTradeFinanceCorrBankAccCd property.
     * 
     */
    public short getOutTradeFinanceCorrBankAccCd() {
        return outTradeFinanceCorrBankAccCd;
    }

    /**
     * Sets the value of the outTradeFinanceCorrBankAccCd property.
     * 
     */
    public void setOutTradeFinanceCorrBankAccCd(short value) {
        this.outTradeFinanceCorrBankAccCd = value;
    }

    /**
     * Gets the value of the outTradeFinanceCorrBankAccNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutTradeFinanceCorrBankAccNum() {
        return outTradeFinanceCorrBankAccNum;
    }

    /**
     * Sets the value of the outTradeFinanceCorrBankAccNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutTradeFinanceCorrBankAccNum(String value) {
        this.outTradeFinanceCorrBankAccNum = value;
    }

    /**
     * Gets the value of the outTradeFinanceCorreAccPrftSys property.
     * 
     */
    public short getOutTradeFinanceCorreAccPrftSys() {
        return outTradeFinanceCorreAccPrftSys;
    }

    /**
     * Sets the value of the outTradeFinanceCorreAccPrftSys property.
     * 
     */
    public void setOutTradeFinanceCorreAccPrftSys(short value) {
        this.outTradeFinanceCorreAccPrftSys = value;
    }

    /**
     * Gets the value of the outTradeFinanceCorrespondentName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutTradeFinanceCorrespondentName() {
        return outTradeFinanceCorrespondentName;
    }

    /**
     * Sets the value of the outTradeFinanceCorrespondentName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutTradeFinanceCorrespondentName(String value) {
        this.outTradeFinanceCorrespondentName = value;
    }

    /**
     * Gets the value of the outTradeFinancePrincAccPrftSys property.
     * 
     */
    public short getOutTradeFinancePrincAccPrftSys() {
        return outTradeFinancePrincAccPrftSys;
    }

    /**
     * Sets the value of the outTradeFinancePrincAccPrftSys property.
     * 
     */
    public void setOutTradeFinancePrincAccPrftSys(short value) {
        this.outTradeFinancePrincAccPrftSys = value;
    }

    /**
     * Gets the value of the outTradeFinancePrincipalAccCd property.
     * 
     */
    public short getOutTradeFinancePrincipalAccCd() {
        return outTradeFinancePrincipalAccCd;
    }

    /**
     * Sets the value of the outTradeFinancePrincipalAccCd property.
     * 
     */
    public void setOutTradeFinancePrincipalAccCd(short value) {
        this.outTradeFinancePrincipalAccCd = value;
    }

    /**
     * Gets the value of the outTradeFinancePrincipalAccNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutTradeFinancePrincipalAccNum() {
        return outTradeFinancePrincipalAccNum;
    }

    /**
     * Sets the value of the outTradeFinancePrincipalAccNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutTradeFinancePrincipalAccNum(String value) {
        this.outTradeFinancePrincipalAccNum = value;
    }

    /**
     * Gets the value of the outTradeFinancePrincipalCommAddr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutTradeFinancePrincipalCommAddr() {
        return outTradeFinancePrincipalCommAddr;
    }

    /**
     * Sets the value of the outTradeFinancePrincipalCommAddr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutTradeFinancePrincipalCommAddr(String value) {
        this.outTradeFinancePrincipalCommAddr = value;
    }

    /**
     * Gets the value of the outTradeFinancePrinicipalName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutTradeFinancePrinicipalName() {
        return outTradeFinancePrinicipalName;
    }

    /**
     * Sets the value of the outTradeFinancePrinicipalName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutTradeFinancePrinicipalName(String value) {
        this.outTradeFinancePrinicipalName = value;
    }

    /**
     * Gets the value of the outTradeFinanceRefNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutTradeFinanceRefNo() {
        return outTradeFinanceRefNo;
    }

    /**
     * Sets the value of the outTradeFinanceRefNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutTradeFinanceRefNo(String value) {
        this.outTradeFinanceRefNo = value;
    }

    /**
     * Gets the value of the outTradeFinanceStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutTradeFinanceStatus() {
        return outTradeFinanceStatus;
    }

    /**
     * Sets the value of the outTradeFinanceStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutTradeFinanceStatus(String value) {
        this.outTradeFinanceStatus = value;
    }

    /**
     * Gets the value of the outTradeFinanceTfAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutTradeFinanceTfAmount() {
        return outTradeFinanceTfAmount;
    }

    /**
     * Sets the value of the outTradeFinanceTfAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutTradeFinanceTfAmount(BigDecimal value) {
        this.outTradeFinanceTfAmount = value;
    }

    /**
     * Gets the value of the outTradeFinanceTfCd property.
     * 
     */
    public short getOutTradeFinanceTfCd() {
        return outTradeFinanceTfCd;
    }

    /**
     * Sets the value of the outTradeFinanceTfCd property.
     * 
     */
    public void setOutTradeFinanceTfCd(short value) {
        this.outTradeFinanceTfCd = value;
    }

    /**
     * Gets the value of the outTradeFinanceTfConfirmDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutTradeFinanceTfConfirmDate() {
        return outTradeFinanceTfConfirmDate;
    }

    /**
     * Sets the value of the outTradeFinanceTfConfirmDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutTradeFinanceTfConfirmDate(XMLGregorianCalendar value) {
        this.outTradeFinanceTfConfirmDate = value;
    }

    /**
     * Gets the value of the outTradeFinanceTfNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutTradeFinanceTfNumber() {
        return outTradeFinanceTfNumber;
    }

    /**
     * Sets the value of the outTradeFinanceTfNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutTradeFinanceTfNumber(String value) {
        this.outTradeFinanceTfNumber = value;
    }

    /**
     * Gets the value of the outTradeFinanceTfOpenDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutTradeFinanceTfOpenDate() {
        return outTradeFinanceTfOpenDate;
    }

    /**
     * Sets the value of the outTradeFinanceTfOpenDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutTradeFinanceTfOpenDate(XMLGregorianCalendar value) {
        this.outTradeFinanceTfOpenDate = value;
    }

    /**
     * Gets the value of the outTradeFinanceTfType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutTradeFinanceTfType() {
        return outTradeFinanceTfType;
    }

    /**
     * Sets the value of the outTradeFinanceTfType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutTradeFinanceTfType(String value) {
        this.outTradeFinanceTfType = value;
    }

    /**
     * Gets the value of the outTradeFinanceTmpstamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutTradeFinanceTmpstamp() {
        return outTradeFinanceTmpstamp;
    }

    /**
     * Sets the value of the outTradeFinanceTmpstamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutTradeFinanceTmpstamp(XMLGregorianCalendar value) {
        this.outTradeFinanceTmpstamp = value;
    }

    /**
     * Gets the value of the outTrxCountAdvCounter property.
     * 
     */
    public int getOutTrxCountAdvCounter() {
        return outTrxCountAdvCounter;
    }

    /**
     * Sets the value of the outTrxCountAdvCounter property.
     * 
     */
    public void setOutTrxCountAdvCounter(int value) {
        this.outTrxCountAdvCounter = value;
    }

    /**
     * Gets the value of the outTrxCountTrxCounter property.
     * 
     */
    public int getOutTrxCountTrxCounter() {
        return outTrxCountTrxCounter;
    }

    /**
     * Sets the value of the outTrxCountTrxCounter property.
     * 
     */
    public void setOutTrxCountTrxCounter(int value) {
        this.outTrxCountTrxCounter = value;
    }

    /**
     * Gets the value of the outTradeFinanceSettlementMode property.
     * 
     */
    public short getOutTradeFinanceSettlementMode() {
        return outTradeFinanceSettlementMode;
    }

    /**
     * Sets the value of the outTradeFinanceSettlementMode property.
     * 
     */
    public void setOutTradeFinanceSettlementMode(short value) {
        this.outTradeFinanceSettlementMode = value;
    }

}
