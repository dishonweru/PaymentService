
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for Adds01OutPrintingGrpItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Adds01OutPrintingGrpItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OutPrintingGrpOutPrintCurrencyDisplayedDecimalPlaces" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutPrintingGrpOutPrintCurrencyIdCurrency" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutPrintingGrpOutPrintCurrencyShortDescr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutPrintingGrpOutPrintGrpAuthorizeIefSuppliedActionEntryDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutPrintingGrpOutPrintGrpAuthorizeTeamInformationAuthorizationType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutPrintingGrpOutPrintGrpAuthorizeTeamInformationEncroachTolerance" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutPrintingGrpOutPrintGrpAuthorizeTeamInformationRequiredProfile1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutPrintingGrpOutPrintGrpAuthorizeTeamInformationRequiredProfile2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutPrintingGrpOutPrintGrpCustAddressAddress1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutPrintingGrpOutPrintGrpCustAddressAddress2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutPrintingGrpOutPrintGrpCustAddressCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutPrintingGrpOutPrintGrpCustAddressZipCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutPrintingGrpOutPrintGrpCustNameLnsSuppliedName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutPrintingGrpOutPrintGrpCustomerCDigit" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutPrintingGrpOutPrintGrpCustomerCustId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutPrintingGrpOutPrintGrpCustomerMarketingReminder" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutPrintingGrpOutPrintGrpDepUnclearTransAvailabilityDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutPrintingGrpOutPrintGrpDepUnclearTransAvailabilityDate_Str" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutPrintingGrpOutPrintGrpDepositAccountDesignation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutPrintingGrpOutPrintGrpDepositsPrftTransactionDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutPrintingGrpOutPrintGrpDepositsPrftTransactionIdTransact" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutPrintingGrpOutPrintGrpDepositsProductDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutPrintingGrpOutPrintGrpDepositsProductIdProduct" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutPrintingGrpOutPrintGrpFdValeurBalanceValueDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutPrintingGrpOutPrintGrpFdValeurBalanceValueDate_Str" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutPrintingGrpOutPrintGrpFxFtRecordingProductionTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutPrintingGrpOutPrintGrpFxFtRecordingProductionTime_Str" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutPrintingGrpOutPrintGrpFxFtRecordingTrxSn" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutPrintingGrpOutPrintGrpFxFtRecordingTunInternalSn" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutPrintingGrpOutPrintGrpGenericDetailDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutPrintingGrpOutPrintGrpMailNameLnsSuppliedName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutPrintingGrpOutPrintGrpPrftTransactionDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutPrintingGrpOutPrintGrpPrftTransactionIdTransact" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutPrintingGrpOutPrintThirdpartyTemplatField12Seperat" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutPrintingGrpOutPrintThirdpartyTemplatField34Seperat" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutPrintingGrpOutPrintThirdpartyTemplatFormat1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutPrintingGrpOutPrintThirdpartyTemplatFormat2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutPrintingGrpOutPrintThirdpartyTemplatFormat3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutPrintingGrpOutPrintThirdpartyTemplatFormat4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutPrintingGrpOutPrintThirdpartyTemplatMandatoryFlag1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutPrintingGrpOutPrintThirdpartyTemplatMandatoryFlag2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutPrintingGrpOutPrintThirdpartyTemplatMandatoryFlag3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutPrintingGrpOutPrintThirdpartyTemplatMandatoryFlag4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutPrintingGrpOutPrintThirdpartyTemplatPrompt1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutPrintingGrpOutPrintThirdpartyTemplatPrompt2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutPrintingGrpOutPrintThirdpartyTemplatPrompt3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutPrintingGrpOutPrintThirdpartyTemplatPrompt4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutPrintingGrpOutPrintThirdpartyTemplatSize1" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutPrintingGrpOutPrintThirdpartyTemplatSize2" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutPrintingGrpOutPrintThirdpartyTemplatSize3" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutPrintingGrpOutPrintThirdpartyTemplatSize4" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutPrintingGrpOutPrintThirdpartyTemplatValidAlgorInd1" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutPrintingGrpOutPrintThirdpartyTemplatValidAlgorInd2" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutPrintingGrpOutPrintThirdpartyTemplatValidAlgorInd3" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutPrintingGrpOutPrintThirdpartyTemplatValidAlgorInd4" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutPrintingGrpOutPrintGrpFxFtRecordingComments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Adds01OutPrintingGrpItem", propOrder = {
    "outPrintingGrpOutPrintCurrencyDisplayedDecimalPlaces",
    "outPrintingGrpOutPrintCurrencyIdCurrency",
    "outPrintingGrpOutPrintCurrencyShortDescr",
    "outPrintingGrpOutPrintGrpAuthorizeIefSuppliedActionEntryDesc",
    "outPrintingGrpOutPrintGrpAuthorizeTeamInformationAuthorizationType",
    "outPrintingGrpOutPrintGrpAuthorizeTeamInformationEncroachTolerance",
    "outPrintingGrpOutPrintGrpAuthorizeTeamInformationRequiredProfile1",
    "outPrintingGrpOutPrintGrpAuthorizeTeamInformationRequiredProfile2",
    "outPrintingGrpOutPrintGrpCustAddressAddress1",
    "outPrintingGrpOutPrintGrpCustAddressAddress2",
    "outPrintingGrpOutPrintGrpCustAddressCity",
    "outPrintingGrpOutPrintGrpCustAddressZipCode",
    "outPrintingGrpOutPrintGrpCustNameLnsSuppliedName",
    "outPrintingGrpOutPrintGrpCustomerCDigit",
    "outPrintingGrpOutPrintGrpCustomerCustId",
    "outPrintingGrpOutPrintGrpCustomerMarketingReminder",
    "outPrintingGrpOutPrintGrpDepUnclearTransAvailabilityDate",
    "outPrintingGrpOutPrintGrpDepUnclearTransAvailabilityDateStr",
    "outPrintingGrpOutPrintGrpDepositAccountDesignation",
    "outPrintingGrpOutPrintGrpDepositsPrftTransactionDescription",
    "outPrintingGrpOutPrintGrpDepositsPrftTransactionIdTransact",
    "outPrintingGrpOutPrintGrpDepositsProductDescription",
    "outPrintingGrpOutPrintGrpDepositsProductIdProduct",
    "outPrintingGrpOutPrintGrpFdValeurBalanceValueDate",
    "outPrintingGrpOutPrintGrpFdValeurBalanceValueDateStr",
    "outPrintingGrpOutPrintGrpFxFtRecordingProductionTime",
    "outPrintingGrpOutPrintGrpFxFtRecordingProductionTimeStr",
    "outPrintingGrpOutPrintGrpFxFtRecordingTrxSn",
    "outPrintingGrpOutPrintGrpFxFtRecordingTunInternalSn",
    "outPrintingGrpOutPrintGrpGenericDetailDescription",
    "outPrintingGrpOutPrintGrpMailNameLnsSuppliedName",
    "outPrintingGrpOutPrintGrpPrftTransactionDescription",
    "outPrintingGrpOutPrintGrpPrftTransactionIdTransact",
    "outPrintingGrpOutPrintThirdpartyTemplatField12Seperat",
    "outPrintingGrpOutPrintThirdpartyTemplatField34Seperat",
    "outPrintingGrpOutPrintThirdpartyTemplatFormat1",
    "outPrintingGrpOutPrintThirdpartyTemplatFormat2",
    "outPrintingGrpOutPrintThirdpartyTemplatFormat3",
    "outPrintingGrpOutPrintThirdpartyTemplatFormat4",
    "outPrintingGrpOutPrintThirdpartyTemplatMandatoryFlag1",
    "outPrintingGrpOutPrintThirdpartyTemplatMandatoryFlag2",
    "outPrintingGrpOutPrintThirdpartyTemplatMandatoryFlag3",
    "outPrintingGrpOutPrintThirdpartyTemplatMandatoryFlag4",
    "outPrintingGrpOutPrintThirdpartyTemplatPrompt1",
    "outPrintingGrpOutPrintThirdpartyTemplatPrompt2",
    "outPrintingGrpOutPrintThirdpartyTemplatPrompt3",
    "outPrintingGrpOutPrintThirdpartyTemplatPrompt4",
    "outPrintingGrpOutPrintThirdpartyTemplatSize1",
    "outPrintingGrpOutPrintThirdpartyTemplatSize2",
    "outPrintingGrpOutPrintThirdpartyTemplatSize3",
    "outPrintingGrpOutPrintThirdpartyTemplatSize4",
    "outPrintingGrpOutPrintThirdpartyTemplatValidAlgorInd1",
    "outPrintingGrpOutPrintThirdpartyTemplatValidAlgorInd2",
    "outPrintingGrpOutPrintThirdpartyTemplatValidAlgorInd3",
    "outPrintingGrpOutPrintThirdpartyTemplatValidAlgorInd4",
    "outPrintingGrpOutPrintGrpFxFtRecordingComments"
})
public class Adds01OutPrintingGrpItem {

    @XmlElement(name = "OutPrintingGrpOutPrintCurrencyDisplayedDecimalPlaces")
    protected short outPrintingGrpOutPrintCurrencyDisplayedDecimalPlaces;
    @XmlElement(name = "OutPrintingGrpOutPrintCurrencyIdCurrency")
    protected int outPrintingGrpOutPrintCurrencyIdCurrency;
    @XmlElement(name = "OutPrintingGrpOutPrintCurrencyShortDescr")
    protected String outPrintingGrpOutPrintCurrencyShortDescr;
    @XmlElement(name = "OutPrintingGrpOutPrintGrpAuthorizeIefSuppliedActionEntryDesc")
    protected String outPrintingGrpOutPrintGrpAuthorizeIefSuppliedActionEntryDesc;
    @XmlElement(name = "OutPrintingGrpOutPrintGrpAuthorizeTeamInformationAuthorizationType")
    protected String outPrintingGrpOutPrintGrpAuthorizeTeamInformationAuthorizationType;
    @XmlElement(name = "OutPrintingGrpOutPrintGrpAuthorizeTeamInformationEncroachTolerance", required = true)
    protected BigDecimal outPrintingGrpOutPrintGrpAuthorizeTeamInformationEncroachTolerance;
    @XmlElement(name = "OutPrintingGrpOutPrintGrpAuthorizeTeamInformationRequiredProfile1")
    protected String outPrintingGrpOutPrintGrpAuthorizeTeamInformationRequiredProfile1;
    @XmlElement(name = "OutPrintingGrpOutPrintGrpAuthorizeTeamInformationRequiredProfile2")
    protected String outPrintingGrpOutPrintGrpAuthorizeTeamInformationRequiredProfile2;
    @XmlElement(name = "OutPrintingGrpOutPrintGrpCustAddressAddress1")
    protected String outPrintingGrpOutPrintGrpCustAddressAddress1;
    @XmlElement(name = "OutPrintingGrpOutPrintGrpCustAddressAddress2")
    protected String outPrintingGrpOutPrintGrpCustAddressAddress2;
    @XmlElement(name = "OutPrintingGrpOutPrintGrpCustAddressCity")
    protected String outPrintingGrpOutPrintGrpCustAddressCity;
    @XmlElement(name = "OutPrintingGrpOutPrintGrpCustAddressZipCode")
    protected String outPrintingGrpOutPrintGrpCustAddressZipCode;
    @XmlElement(name = "OutPrintingGrpOutPrintGrpCustNameLnsSuppliedName")
    protected String outPrintingGrpOutPrintGrpCustNameLnsSuppliedName;
    @XmlElement(name = "OutPrintingGrpOutPrintGrpCustomerCDigit")
    protected short outPrintingGrpOutPrintGrpCustomerCDigit;
    @XmlElement(name = "OutPrintingGrpOutPrintGrpCustomerCustId")
    protected int outPrintingGrpOutPrintGrpCustomerCustId;
    @XmlElement(name = "OutPrintingGrpOutPrintGrpCustomerMarketingReminder")
    protected String outPrintingGrpOutPrintGrpCustomerMarketingReminder;
    @XmlElement(name = "OutPrintingGrpOutPrintGrpDepUnclearTransAvailabilityDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outPrintingGrpOutPrintGrpDepUnclearTransAvailabilityDate;
    @XmlElement(name = "OutPrintingGrpOutPrintGrpDepUnclearTransAvailabilityDate_Str")
    protected String outPrintingGrpOutPrintGrpDepUnclearTransAvailabilityDateStr;
    @XmlElement(name = "OutPrintingGrpOutPrintGrpDepositAccountDesignation")
    protected String outPrintingGrpOutPrintGrpDepositAccountDesignation;
    @XmlElement(name = "OutPrintingGrpOutPrintGrpDepositsPrftTransactionDescription")
    protected String outPrintingGrpOutPrintGrpDepositsPrftTransactionDescription;
    @XmlElement(name = "OutPrintingGrpOutPrintGrpDepositsPrftTransactionIdTransact")
    protected int outPrintingGrpOutPrintGrpDepositsPrftTransactionIdTransact;
    @XmlElement(name = "OutPrintingGrpOutPrintGrpDepositsProductDescription")
    protected String outPrintingGrpOutPrintGrpDepositsProductDescription;
    @XmlElement(name = "OutPrintingGrpOutPrintGrpDepositsProductIdProduct")
    protected int outPrintingGrpOutPrintGrpDepositsProductIdProduct;
    @XmlElement(name = "OutPrintingGrpOutPrintGrpFdValeurBalanceValueDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outPrintingGrpOutPrintGrpFdValeurBalanceValueDate;
    @XmlElement(name = "OutPrintingGrpOutPrintGrpFdValeurBalanceValueDate_Str")
    protected String outPrintingGrpOutPrintGrpFdValeurBalanceValueDateStr;
    @XmlElement(name = "OutPrintingGrpOutPrintGrpFxFtRecordingProductionTime", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outPrintingGrpOutPrintGrpFxFtRecordingProductionTime;
    @XmlElement(name = "OutPrintingGrpOutPrintGrpFxFtRecordingProductionTime_Str")
    protected String outPrintingGrpOutPrintGrpFxFtRecordingProductionTimeStr;
    @XmlElement(name = "OutPrintingGrpOutPrintGrpFxFtRecordingTrxSn")
    protected int outPrintingGrpOutPrintGrpFxFtRecordingTrxSn;
    @XmlElement(name = "OutPrintingGrpOutPrintGrpFxFtRecordingTunInternalSn")
    protected short outPrintingGrpOutPrintGrpFxFtRecordingTunInternalSn;
    @XmlElement(name = "OutPrintingGrpOutPrintGrpGenericDetailDescription")
    protected String outPrintingGrpOutPrintGrpGenericDetailDescription;
    @XmlElement(name = "OutPrintingGrpOutPrintGrpMailNameLnsSuppliedName")
    protected String outPrintingGrpOutPrintGrpMailNameLnsSuppliedName;
    @XmlElement(name = "OutPrintingGrpOutPrintGrpPrftTransactionDescription")
    protected String outPrintingGrpOutPrintGrpPrftTransactionDescription;
    @XmlElement(name = "OutPrintingGrpOutPrintGrpPrftTransactionIdTransact")
    protected int outPrintingGrpOutPrintGrpPrftTransactionIdTransact;
    @XmlElement(name = "OutPrintingGrpOutPrintThirdpartyTemplatField12Seperat")
    protected String outPrintingGrpOutPrintThirdpartyTemplatField12Seperat;
    @XmlElement(name = "OutPrintingGrpOutPrintThirdpartyTemplatField34Seperat")
    protected String outPrintingGrpOutPrintThirdpartyTemplatField34Seperat;
    @XmlElement(name = "OutPrintingGrpOutPrintThirdpartyTemplatFormat1")
    protected String outPrintingGrpOutPrintThirdpartyTemplatFormat1;
    @XmlElement(name = "OutPrintingGrpOutPrintThirdpartyTemplatFormat2")
    protected String outPrintingGrpOutPrintThirdpartyTemplatFormat2;
    @XmlElement(name = "OutPrintingGrpOutPrintThirdpartyTemplatFormat3")
    protected String outPrintingGrpOutPrintThirdpartyTemplatFormat3;
    @XmlElement(name = "OutPrintingGrpOutPrintThirdpartyTemplatFormat4")
    protected String outPrintingGrpOutPrintThirdpartyTemplatFormat4;
    @XmlElement(name = "OutPrintingGrpOutPrintThirdpartyTemplatMandatoryFlag1")
    protected String outPrintingGrpOutPrintThirdpartyTemplatMandatoryFlag1;
    @XmlElement(name = "OutPrintingGrpOutPrintThirdpartyTemplatMandatoryFlag2")
    protected String outPrintingGrpOutPrintThirdpartyTemplatMandatoryFlag2;
    @XmlElement(name = "OutPrintingGrpOutPrintThirdpartyTemplatMandatoryFlag3")
    protected String outPrintingGrpOutPrintThirdpartyTemplatMandatoryFlag3;
    @XmlElement(name = "OutPrintingGrpOutPrintThirdpartyTemplatMandatoryFlag4")
    protected String outPrintingGrpOutPrintThirdpartyTemplatMandatoryFlag4;
    @XmlElement(name = "OutPrintingGrpOutPrintThirdpartyTemplatPrompt1")
    protected String outPrintingGrpOutPrintThirdpartyTemplatPrompt1;
    @XmlElement(name = "OutPrintingGrpOutPrintThirdpartyTemplatPrompt2")
    protected String outPrintingGrpOutPrintThirdpartyTemplatPrompt2;
    @XmlElement(name = "OutPrintingGrpOutPrintThirdpartyTemplatPrompt3")
    protected String outPrintingGrpOutPrintThirdpartyTemplatPrompt3;
    @XmlElement(name = "OutPrintingGrpOutPrintThirdpartyTemplatPrompt4")
    protected String outPrintingGrpOutPrintThirdpartyTemplatPrompt4;
    @XmlElement(name = "OutPrintingGrpOutPrintThirdpartyTemplatSize1")
    protected short outPrintingGrpOutPrintThirdpartyTemplatSize1;
    @XmlElement(name = "OutPrintingGrpOutPrintThirdpartyTemplatSize2")
    protected short outPrintingGrpOutPrintThirdpartyTemplatSize2;
    @XmlElement(name = "OutPrintingGrpOutPrintThirdpartyTemplatSize3")
    protected short outPrintingGrpOutPrintThirdpartyTemplatSize3;
    @XmlElement(name = "OutPrintingGrpOutPrintThirdpartyTemplatSize4")
    protected short outPrintingGrpOutPrintThirdpartyTemplatSize4;
    @XmlElement(name = "OutPrintingGrpOutPrintThirdpartyTemplatValidAlgorInd1")
    protected short outPrintingGrpOutPrintThirdpartyTemplatValidAlgorInd1;
    @XmlElement(name = "OutPrintingGrpOutPrintThirdpartyTemplatValidAlgorInd2")
    protected short outPrintingGrpOutPrintThirdpartyTemplatValidAlgorInd2;
    @XmlElement(name = "OutPrintingGrpOutPrintThirdpartyTemplatValidAlgorInd3")
    protected short outPrintingGrpOutPrintThirdpartyTemplatValidAlgorInd3;
    @XmlElement(name = "OutPrintingGrpOutPrintThirdpartyTemplatValidAlgorInd4")
    protected short outPrintingGrpOutPrintThirdpartyTemplatValidAlgorInd4;
    @XmlElement(name = "OutPrintingGrpOutPrintGrpFxFtRecordingComments")
    protected String outPrintingGrpOutPrintGrpFxFtRecordingComments;

    /**
     * Gets the value of the outPrintingGrpOutPrintCurrencyDisplayedDecimalPlaces property.
     * 
     */
    public short getOutPrintingGrpOutPrintCurrencyDisplayedDecimalPlaces() {
        return outPrintingGrpOutPrintCurrencyDisplayedDecimalPlaces;
    }

    /**
     * Sets the value of the outPrintingGrpOutPrintCurrencyDisplayedDecimalPlaces property.
     * 
     */
    public void setOutPrintingGrpOutPrintCurrencyDisplayedDecimalPlaces(short value) {
        this.outPrintingGrpOutPrintCurrencyDisplayedDecimalPlaces = value;
    }

    /**
     * Gets the value of the outPrintingGrpOutPrintCurrencyIdCurrency property.
     * 
     */
    public int getOutPrintingGrpOutPrintCurrencyIdCurrency() {
        return outPrintingGrpOutPrintCurrencyIdCurrency;
    }

    /**
     * Sets the value of the outPrintingGrpOutPrintCurrencyIdCurrency property.
     * 
     */
    public void setOutPrintingGrpOutPrintCurrencyIdCurrency(int value) {
        this.outPrintingGrpOutPrintCurrencyIdCurrency = value;
    }

    /**
     * Gets the value of the outPrintingGrpOutPrintCurrencyShortDescr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutPrintingGrpOutPrintCurrencyShortDescr() {
        return outPrintingGrpOutPrintCurrencyShortDescr;
    }

    /**
     * Sets the value of the outPrintingGrpOutPrintCurrencyShortDescr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutPrintingGrpOutPrintCurrencyShortDescr(String value) {
        this.outPrintingGrpOutPrintCurrencyShortDescr = value;
    }

    /**
     * Gets the value of the outPrintingGrpOutPrintGrpAuthorizeIefSuppliedActionEntryDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutPrintingGrpOutPrintGrpAuthorizeIefSuppliedActionEntryDesc() {
        return outPrintingGrpOutPrintGrpAuthorizeIefSuppliedActionEntryDesc;
    }

    /**
     * Sets the value of the outPrintingGrpOutPrintGrpAuthorizeIefSuppliedActionEntryDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutPrintingGrpOutPrintGrpAuthorizeIefSuppliedActionEntryDesc(String value) {
        this.outPrintingGrpOutPrintGrpAuthorizeIefSuppliedActionEntryDesc = value;
    }

    /**
     * Gets the value of the outPrintingGrpOutPrintGrpAuthorizeTeamInformationAuthorizationType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutPrintingGrpOutPrintGrpAuthorizeTeamInformationAuthorizationType() {
        return outPrintingGrpOutPrintGrpAuthorizeTeamInformationAuthorizationType;
    }

    /**
     * Sets the value of the outPrintingGrpOutPrintGrpAuthorizeTeamInformationAuthorizationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutPrintingGrpOutPrintGrpAuthorizeTeamInformationAuthorizationType(String value) {
        this.outPrintingGrpOutPrintGrpAuthorizeTeamInformationAuthorizationType = value;
    }

    /**
     * Gets the value of the outPrintingGrpOutPrintGrpAuthorizeTeamInformationEncroachTolerance property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutPrintingGrpOutPrintGrpAuthorizeTeamInformationEncroachTolerance() {
        return outPrintingGrpOutPrintGrpAuthorizeTeamInformationEncroachTolerance;
    }

    /**
     * Sets the value of the outPrintingGrpOutPrintGrpAuthorizeTeamInformationEncroachTolerance property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutPrintingGrpOutPrintGrpAuthorizeTeamInformationEncroachTolerance(BigDecimal value) {
        this.outPrintingGrpOutPrintGrpAuthorizeTeamInformationEncroachTolerance = value;
    }

    /**
     * Gets the value of the outPrintingGrpOutPrintGrpAuthorizeTeamInformationRequiredProfile1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutPrintingGrpOutPrintGrpAuthorizeTeamInformationRequiredProfile1() {
        return outPrintingGrpOutPrintGrpAuthorizeTeamInformationRequiredProfile1;
    }

    /**
     * Sets the value of the outPrintingGrpOutPrintGrpAuthorizeTeamInformationRequiredProfile1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutPrintingGrpOutPrintGrpAuthorizeTeamInformationRequiredProfile1(String value) {
        this.outPrintingGrpOutPrintGrpAuthorizeTeamInformationRequiredProfile1 = value;
    }

    /**
     * Gets the value of the outPrintingGrpOutPrintGrpAuthorizeTeamInformationRequiredProfile2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutPrintingGrpOutPrintGrpAuthorizeTeamInformationRequiredProfile2() {
        return outPrintingGrpOutPrintGrpAuthorizeTeamInformationRequiredProfile2;
    }

    /**
     * Sets the value of the outPrintingGrpOutPrintGrpAuthorizeTeamInformationRequiredProfile2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutPrintingGrpOutPrintGrpAuthorizeTeamInformationRequiredProfile2(String value) {
        this.outPrintingGrpOutPrintGrpAuthorizeTeamInformationRequiredProfile2 = value;
    }

    /**
     * Gets the value of the outPrintingGrpOutPrintGrpCustAddressAddress1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutPrintingGrpOutPrintGrpCustAddressAddress1() {
        return outPrintingGrpOutPrintGrpCustAddressAddress1;
    }

    /**
     * Sets the value of the outPrintingGrpOutPrintGrpCustAddressAddress1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutPrintingGrpOutPrintGrpCustAddressAddress1(String value) {
        this.outPrintingGrpOutPrintGrpCustAddressAddress1 = value;
    }

    /**
     * Gets the value of the outPrintingGrpOutPrintGrpCustAddressAddress2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutPrintingGrpOutPrintGrpCustAddressAddress2() {
        return outPrintingGrpOutPrintGrpCustAddressAddress2;
    }

    /**
     * Sets the value of the outPrintingGrpOutPrintGrpCustAddressAddress2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutPrintingGrpOutPrintGrpCustAddressAddress2(String value) {
        this.outPrintingGrpOutPrintGrpCustAddressAddress2 = value;
    }

    /**
     * Gets the value of the outPrintingGrpOutPrintGrpCustAddressCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutPrintingGrpOutPrintGrpCustAddressCity() {
        return outPrintingGrpOutPrintGrpCustAddressCity;
    }

    /**
     * Sets the value of the outPrintingGrpOutPrintGrpCustAddressCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutPrintingGrpOutPrintGrpCustAddressCity(String value) {
        this.outPrintingGrpOutPrintGrpCustAddressCity = value;
    }

    /**
     * Gets the value of the outPrintingGrpOutPrintGrpCustAddressZipCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutPrintingGrpOutPrintGrpCustAddressZipCode() {
        return outPrintingGrpOutPrintGrpCustAddressZipCode;
    }

    /**
     * Sets the value of the outPrintingGrpOutPrintGrpCustAddressZipCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutPrintingGrpOutPrintGrpCustAddressZipCode(String value) {
        this.outPrintingGrpOutPrintGrpCustAddressZipCode = value;
    }

    /**
     * Gets the value of the outPrintingGrpOutPrintGrpCustNameLnsSuppliedName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutPrintingGrpOutPrintGrpCustNameLnsSuppliedName() {
        return outPrintingGrpOutPrintGrpCustNameLnsSuppliedName;
    }

    /**
     * Sets the value of the outPrintingGrpOutPrintGrpCustNameLnsSuppliedName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutPrintingGrpOutPrintGrpCustNameLnsSuppliedName(String value) {
        this.outPrintingGrpOutPrintGrpCustNameLnsSuppliedName = value;
    }

    /**
     * Gets the value of the outPrintingGrpOutPrintGrpCustomerCDigit property.
     * 
     */
    public short getOutPrintingGrpOutPrintGrpCustomerCDigit() {
        return outPrintingGrpOutPrintGrpCustomerCDigit;
    }

    /**
     * Sets the value of the outPrintingGrpOutPrintGrpCustomerCDigit property.
     * 
     */
    public void setOutPrintingGrpOutPrintGrpCustomerCDigit(short value) {
        this.outPrintingGrpOutPrintGrpCustomerCDigit = value;
    }

    /**
     * Gets the value of the outPrintingGrpOutPrintGrpCustomerCustId property.
     * 
     */
    public int getOutPrintingGrpOutPrintGrpCustomerCustId() {
        return outPrintingGrpOutPrintGrpCustomerCustId;
    }

    /**
     * Sets the value of the outPrintingGrpOutPrintGrpCustomerCustId property.
     * 
     */
    public void setOutPrintingGrpOutPrintGrpCustomerCustId(int value) {
        this.outPrintingGrpOutPrintGrpCustomerCustId = value;
    }

    /**
     * Gets the value of the outPrintingGrpOutPrintGrpCustomerMarketingReminder property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutPrintingGrpOutPrintGrpCustomerMarketingReminder() {
        return outPrintingGrpOutPrintGrpCustomerMarketingReminder;
    }

    /**
     * Sets the value of the outPrintingGrpOutPrintGrpCustomerMarketingReminder property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutPrintingGrpOutPrintGrpCustomerMarketingReminder(String value) {
        this.outPrintingGrpOutPrintGrpCustomerMarketingReminder = value;
    }

    /**
     * Gets the value of the outPrintingGrpOutPrintGrpDepUnclearTransAvailabilityDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutPrintingGrpOutPrintGrpDepUnclearTransAvailabilityDate() {
        return outPrintingGrpOutPrintGrpDepUnclearTransAvailabilityDate;
    }

    /**
     * Sets the value of the outPrintingGrpOutPrintGrpDepUnclearTransAvailabilityDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutPrintingGrpOutPrintGrpDepUnclearTransAvailabilityDate(XMLGregorianCalendar value) {
        this.outPrintingGrpOutPrintGrpDepUnclearTransAvailabilityDate = value;
    }

    /**
     * Gets the value of the outPrintingGrpOutPrintGrpDepUnclearTransAvailabilityDateStr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutPrintingGrpOutPrintGrpDepUnclearTransAvailabilityDateStr() {
        return outPrintingGrpOutPrintGrpDepUnclearTransAvailabilityDateStr;
    }

    /**
     * Sets the value of the outPrintingGrpOutPrintGrpDepUnclearTransAvailabilityDateStr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutPrintingGrpOutPrintGrpDepUnclearTransAvailabilityDateStr(String value) {
        this.outPrintingGrpOutPrintGrpDepUnclearTransAvailabilityDateStr = value;
    }

    /**
     * Gets the value of the outPrintingGrpOutPrintGrpDepositAccountDesignation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutPrintingGrpOutPrintGrpDepositAccountDesignation() {
        return outPrintingGrpOutPrintGrpDepositAccountDesignation;
    }

    /**
     * Sets the value of the outPrintingGrpOutPrintGrpDepositAccountDesignation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutPrintingGrpOutPrintGrpDepositAccountDesignation(String value) {
        this.outPrintingGrpOutPrintGrpDepositAccountDesignation = value;
    }

    /**
     * Gets the value of the outPrintingGrpOutPrintGrpDepositsPrftTransactionDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutPrintingGrpOutPrintGrpDepositsPrftTransactionDescription() {
        return outPrintingGrpOutPrintGrpDepositsPrftTransactionDescription;
    }

    /**
     * Sets the value of the outPrintingGrpOutPrintGrpDepositsPrftTransactionDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutPrintingGrpOutPrintGrpDepositsPrftTransactionDescription(String value) {
        this.outPrintingGrpOutPrintGrpDepositsPrftTransactionDescription = value;
    }

    /**
     * Gets the value of the outPrintingGrpOutPrintGrpDepositsPrftTransactionIdTransact property.
     * 
     */
    public int getOutPrintingGrpOutPrintGrpDepositsPrftTransactionIdTransact() {
        return outPrintingGrpOutPrintGrpDepositsPrftTransactionIdTransact;
    }

    /**
     * Sets the value of the outPrintingGrpOutPrintGrpDepositsPrftTransactionIdTransact property.
     * 
     */
    public void setOutPrintingGrpOutPrintGrpDepositsPrftTransactionIdTransact(int value) {
        this.outPrintingGrpOutPrintGrpDepositsPrftTransactionIdTransact = value;
    }

    /**
     * Gets the value of the outPrintingGrpOutPrintGrpDepositsProductDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutPrintingGrpOutPrintGrpDepositsProductDescription() {
        return outPrintingGrpOutPrintGrpDepositsProductDescription;
    }

    /**
     * Sets the value of the outPrintingGrpOutPrintGrpDepositsProductDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutPrintingGrpOutPrintGrpDepositsProductDescription(String value) {
        this.outPrintingGrpOutPrintGrpDepositsProductDescription = value;
    }

    /**
     * Gets the value of the outPrintingGrpOutPrintGrpDepositsProductIdProduct property.
     * 
     */
    public int getOutPrintingGrpOutPrintGrpDepositsProductIdProduct() {
        return outPrintingGrpOutPrintGrpDepositsProductIdProduct;
    }

    /**
     * Sets the value of the outPrintingGrpOutPrintGrpDepositsProductIdProduct property.
     * 
     */
    public void setOutPrintingGrpOutPrintGrpDepositsProductIdProduct(int value) {
        this.outPrintingGrpOutPrintGrpDepositsProductIdProduct = value;
    }

    /**
     * Gets the value of the outPrintingGrpOutPrintGrpFdValeurBalanceValueDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutPrintingGrpOutPrintGrpFdValeurBalanceValueDate() {
        return outPrintingGrpOutPrintGrpFdValeurBalanceValueDate;
    }

    /**
     * Sets the value of the outPrintingGrpOutPrintGrpFdValeurBalanceValueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutPrintingGrpOutPrintGrpFdValeurBalanceValueDate(XMLGregorianCalendar value) {
        this.outPrintingGrpOutPrintGrpFdValeurBalanceValueDate = value;
    }

    /**
     * Gets the value of the outPrintingGrpOutPrintGrpFdValeurBalanceValueDateStr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutPrintingGrpOutPrintGrpFdValeurBalanceValueDateStr() {
        return outPrintingGrpOutPrintGrpFdValeurBalanceValueDateStr;
    }

    /**
     * Sets the value of the outPrintingGrpOutPrintGrpFdValeurBalanceValueDateStr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutPrintingGrpOutPrintGrpFdValeurBalanceValueDateStr(String value) {
        this.outPrintingGrpOutPrintGrpFdValeurBalanceValueDateStr = value;
    }

    /**
     * Gets the value of the outPrintingGrpOutPrintGrpFxFtRecordingProductionTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutPrintingGrpOutPrintGrpFxFtRecordingProductionTime() {
        return outPrintingGrpOutPrintGrpFxFtRecordingProductionTime;
    }

    /**
     * Sets the value of the outPrintingGrpOutPrintGrpFxFtRecordingProductionTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutPrintingGrpOutPrintGrpFxFtRecordingProductionTime(XMLGregorianCalendar value) {
        this.outPrintingGrpOutPrintGrpFxFtRecordingProductionTime = value;
    }

    /**
     * Gets the value of the outPrintingGrpOutPrintGrpFxFtRecordingProductionTimeStr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutPrintingGrpOutPrintGrpFxFtRecordingProductionTimeStr() {
        return outPrintingGrpOutPrintGrpFxFtRecordingProductionTimeStr;
    }

    /**
     * Sets the value of the outPrintingGrpOutPrintGrpFxFtRecordingProductionTimeStr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutPrintingGrpOutPrintGrpFxFtRecordingProductionTimeStr(String value) {
        this.outPrintingGrpOutPrintGrpFxFtRecordingProductionTimeStr = value;
    }

    /**
     * Gets the value of the outPrintingGrpOutPrintGrpFxFtRecordingTrxSn property.
     * 
     */
    public int getOutPrintingGrpOutPrintGrpFxFtRecordingTrxSn() {
        return outPrintingGrpOutPrintGrpFxFtRecordingTrxSn;
    }

    /**
     * Sets the value of the outPrintingGrpOutPrintGrpFxFtRecordingTrxSn property.
     * 
     */
    public void setOutPrintingGrpOutPrintGrpFxFtRecordingTrxSn(int value) {
        this.outPrintingGrpOutPrintGrpFxFtRecordingTrxSn = value;
    }

    /**
     * Gets the value of the outPrintingGrpOutPrintGrpFxFtRecordingTunInternalSn property.
     * 
     */
    public short getOutPrintingGrpOutPrintGrpFxFtRecordingTunInternalSn() {
        return outPrintingGrpOutPrintGrpFxFtRecordingTunInternalSn;
    }

    /**
     * Sets the value of the outPrintingGrpOutPrintGrpFxFtRecordingTunInternalSn property.
     * 
     */
    public void setOutPrintingGrpOutPrintGrpFxFtRecordingTunInternalSn(short value) {
        this.outPrintingGrpOutPrintGrpFxFtRecordingTunInternalSn = value;
    }

    /**
     * Gets the value of the outPrintingGrpOutPrintGrpGenericDetailDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutPrintingGrpOutPrintGrpGenericDetailDescription() {
        return outPrintingGrpOutPrintGrpGenericDetailDescription;
    }

    /**
     * Sets the value of the outPrintingGrpOutPrintGrpGenericDetailDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutPrintingGrpOutPrintGrpGenericDetailDescription(String value) {
        this.outPrintingGrpOutPrintGrpGenericDetailDescription = value;
    }

    /**
     * Gets the value of the outPrintingGrpOutPrintGrpMailNameLnsSuppliedName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutPrintingGrpOutPrintGrpMailNameLnsSuppliedName() {
        return outPrintingGrpOutPrintGrpMailNameLnsSuppliedName;
    }

    /**
     * Sets the value of the outPrintingGrpOutPrintGrpMailNameLnsSuppliedName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutPrintingGrpOutPrintGrpMailNameLnsSuppliedName(String value) {
        this.outPrintingGrpOutPrintGrpMailNameLnsSuppliedName = value;
    }

    /**
     * Gets the value of the outPrintingGrpOutPrintGrpPrftTransactionDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutPrintingGrpOutPrintGrpPrftTransactionDescription() {
        return outPrintingGrpOutPrintGrpPrftTransactionDescription;
    }

    /**
     * Sets the value of the outPrintingGrpOutPrintGrpPrftTransactionDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutPrintingGrpOutPrintGrpPrftTransactionDescription(String value) {
        this.outPrintingGrpOutPrintGrpPrftTransactionDescription = value;
    }

    /**
     * Gets the value of the outPrintingGrpOutPrintGrpPrftTransactionIdTransact property.
     * 
     */
    public int getOutPrintingGrpOutPrintGrpPrftTransactionIdTransact() {
        return outPrintingGrpOutPrintGrpPrftTransactionIdTransact;
    }

    /**
     * Sets the value of the outPrintingGrpOutPrintGrpPrftTransactionIdTransact property.
     * 
     */
    public void setOutPrintingGrpOutPrintGrpPrftTransactionIdTransact(int value) {
        this.outPrintingGrpOutPrintGrpPrftTransactionIdTransact = value;
    }

    /**
     * Gets the value of the outPrintingGrpOutPrintThirdpartyTemplatField12Seperat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutPrintingGrpOutPrintThirdpartyTemplatField12Seperat() {
        return outPrintingGrpOutPrintThirdpartyTemplatField12Seperat;
    }

    /**
     * Sets the value of the outPrintingGrpOutPrintThirdpartyTemplatField12Seperat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutPrintingGrpOutPrintThirdpartyTemplatField12Seperat(String value) {
        this.outPrintingGrpOutPrintThirdpartyTemplatField12Seperat = value;
    }

    /**
     * Gets the value of the outPrintingGrpOutPrintThirdpartyTemplatField34Seperat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutPrintingGrpOutPrintThirdpartyTemplatField34Seperat() {
        return outPrintingGrpOutPrintThirdpartyTemplatField34Seperat;
    }

    /**
     * Sets the value of the outPrintingGrpOutPrintThirdpartyTemplatField34Seperat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutPrintingGrpOutPrintThirdpartyTemplatField34Seperat(String value) {
        this.outPrintingGrpOutPrintThirdpartyTemplatField34Seperat = value;
    }

    /**
     * Gets the value of the outPrintingGrpOutPrintThirdpartyTemplatFormat1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutPrintingGrpOutPrintThirdpartyTemplatFormat1() {
        return outPrintingGrpOutPrintThirdpartyTemplatFormat1;
    }

    /**
     * Sets the value of the outPrintingGrpOutPrintThirdpartyTemplatFormat1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutPrintingGrpOutPrintThirdpartyTemplatFormat1(String value) {
        this.outPrintingGrpOutPrintThirdpartyTemplatFormat1 = value;
    }

    /**
     * Gets the value of the outPrintingGrpOutPrintThirdpartyTemplatFormat2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutPrintingGrpOutPrintThirdpartyTemplatFormat2() {
        return outPrintingGrpOutPrintThirdpartyTemplatFormat2;
    }

    /**
     * Sets the value of the outPrintingGrpOutPrintThirdpartyTemplatFormat2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutPrintingGrpOutPrintThirdpartyTemplatFormat2(String value) {
        this.outPrintingGrpOutPrintThirdpartyTemplatFormat2 = value;
    }

    /**
     * Gets the value of the outPrintingGrpOutPrintThirdpartyTemplatFormat3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutPrintingGrpOutPrintThirdpartyTemplatFormat3() {
        return outPrintingGrpOutPrintThirdpartyTemplatFormat3;
    }

    /**
     * Sets the value of the outPrintingGrpOutPrintThirdpartyTemplatFormat3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutPrintingGrpOutPrintThirdpartyTemplatFormat3(String value) {
        this.outPrintingGrpOutPrintThirdpartyTemplatFormat3 = value;
    }

    /**
     * Gets the value of the outPrintingGrpOutPrintThirdpartyTemplatFormat4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutPrintingGrpOutPrintThirdpartyTemplatFormat4() {
        return outPrintingGrpOutPrintThirdpartyTemplatFormat4;
    }

    /**
     * Sets the value of the outPrintingGrpOutPrintThirdpartyTemplatFormat4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutPrintingGrpOutPrintThirdpartyTemplatFormat4(String value) {
        this.outPrintingGrpOutPrintThirdpartyTemplatFormat4 = value;
    }

    /**
     * Gets the value of the outPrintingGrpOutPrintThirdpartyTemplatMandatoryFlag1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutPrintingGrpOutPrintThirdpartyTemplatMandatoryFlag1() {
        return outPrintingGrpOutPrintThirdpartyTemplatMandatoryFlag1;
    }

    /**
     * Sets the value of the outPrintingGrpOutPrintThirdpartyTemplatMandatoryFlag1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutPrintingGrpOutPrintThirdpartyTemplatMandatoryFlag1(String value) {
        this.outPrintingGrpOutPrintThirdpartyTemplatMandatoryFlag1 = value;
    }

    /**
     * Gets the value of the outPrintingGrpOutPrintThirdpartyTemplatMandatoryFlag2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutPrintingGrpOutPrintThirdpartyTemplatMandatoryFlag2() {
        return outPrintingGrpOutPrintThirdpartyTemplatMandatoryFlag2;
    }

    /**
     * Sets the value of the outPrintingGrpOutPrintThirdpartyTemplatMandatoryFlag2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutPrintingGrpOutPrintThirdpartyTemplatMandatoryFlag2(String value) {
        this.outPrintingGrpOutPrintThirdpartyTemplatMandatoryFlag2 = value;
    }

    /**
     * Gets the value of the outPrintingGrpOutPrintThirdpartyTemplatMandatoryFlag3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutPrintingGrpOutPrintThirdpartyTemplatMandatoryFlag3() {
        return outPrintingGrpOutPrintThirdpartyTemplatMandatoryFlag3;
    }

    /**
     * Sets the value of the outPrintingGrpOutPrintThirdpartyTemplatMandatoryFlag3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutPrintingGrpOutPrintThirdpartyTemplatMandatoryFlag3(String value) {
        this.outPrintingGrpOutPrintThirdpartyTemplatMandatoryFlag3 = value;
    }

    /**
     * Gets the value of the outPrintingGrpOutPrintThirdpartyTemplatMandatoryFlag4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutPrintingGrpOutPrintThirdpartyTemplatMandatoryFlag4() {
        return outPrintingGrpOutPrintThirdpartyTemplatMandatoryFlag4;
    }

    /**
     * Sets the value of the outPrintingGrpOutPrintThirdpartyTemplatMandatoryFlag4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutPrintingGrpOutPrintThirdpartyTemplatMandatoryFlag4(String value) {
        this.outPrintingGrpOutPrintThirdpartyTemplatMandatoryFlag4 = value;
    }

    /**
     * Gets the value of the outPrintingGrpOutPrintThirdpartyTemplatPrompt1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutPrintingGrpOutPrintThirdpartyTemplatPrompt1() {
        return outPrintingGrpOutPrintThirdpartyTemplatPrompt1;
    }

    /**
     * Sets the value of the outPrintingGrpOutPrintThirdpartyTemplatPrompt1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutPrintingGrpOutPrintThirdpartyTemplatPrompt1(String value) {
        this.outPrintingGrpOutPrintThirdpartyTemplatPrompt1 = value;
    }

    /**
     * Gets the value of the outPrintingGrpOutPrintThirdpartyTemplatPrompt2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutPrintingGrpOutPrintThirdpartyTemplatPrompt2() {
        return outPrintingGrpOutPrintThirdpartyTemplatPrompt2;
    }

    /**
     * Sets the value of the outPrintingGrpOutPrintThirdpartyTemplatPrompt2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutPrintingGrpOutPrintThirdpartyTemplatPrompt2(String value) {
        this.outPrintingGrpOutPrintThirdpartyTemplatPrompt2 = value;
    }

    /**
     * Gets the value of the outPrintingGrpOutPrintThirdpartyTemplatPrompt3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutPrintingGrpOutPrintThirdpartyTemplatPrompt3() {
        return outPrintingGrpOutPrintThirdpartyTemplatPrompt3;
    }

    /**
     * Sets the value of the outPrintingGrpOutPrintThirdpartyTemplatPrompt3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutPrintingGrpOutPrintThirdpartyTemplatPrompt3(String value) {
        this.outPrintingGrpOutPrintThirdpartyTemplatPrompt3 = value;
    }

    /**
     * Gets the value of the outPrintingGrpOutPrintThirdpartyTemplatPrompt4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutPrintingGrpOutPrintThirdpartyTemplatPrompt4() {
        return outPrintingGrpOutPrintThirdpartyTemplatPrompt4;
    }

    /**
     * Sets the value of the outPrintingGrpOutPrintThirdpartyTemplatPrompt4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutPrintingGrpOutPrintThirdpartyTemplatPrompt4(String value) {
        this.outPrintingGrpOutPrintThirdpartyTemplatPrompt4 = value;
    }

    /**
     * Gets the value of the outPrintingGrpOutPrintThirdpartyTemplatSize1 property.
     * 
     */
    public short getOutPrintingGrpOutPrintThirdpartyTemplatSize1() {
        return outPrintingGrpOutPrintThirdpartyTemplatSize1;
    }

    /**
     * Sets the value of the outPrintingGrpOutPrintThirdpartyTemplatSize1 property.
     * 
     */
    public void setOutPrintingGrpOutPrintThirdpartyTemplatSize1(short value) {
        this.outPrintingGrpOutPrintThirdpartyTemplatSize1 = value;
    }

    /**
     * Gets the value of the outPrintingGrpOutPrintThirdpartyTemplatSize2 property.
     * 
     */
    public short getOutPrintingGrpOutPrintThirdpartyTemplatSize2() {
        return outPrintingGrpOutPrintThirdpartyTemplatSize2;
    }

    /**
     * Sets the value of the outPrintingGrpOutPrintThirdpartyTemplatSize2 property.
     * 
     */
    public void setOutPrintingGrpOutPrintThirdpartyTemplatSize2(short value) {
        this.outPrintingGrpOutPrintThirdpartyTemplatSize2 = value;
    }

    /**
     * Gets the value of the outPrintingGrpOutPrintThirdpartyTemplatSize3 property.
     * 
     */
    public short getOutPrintingGrpOutPrintThirdpartyTemplatSize3() {
        return outPrintingGrpOutPrintThirdpartyTemplatSize3;
    }

    /**
     * Sets the value of the outPrintingGrpOutPrintThirdpartyTemplatSize3 property.
     * 
     */
    public void setOutPrintingGrpOutPrintThirdpartyTemplatSize3(short value) {
        this.outPrintingGrpOutPrintThirdpartyTemplatSize3 = value;
    }

    /**
     * Gets the value of the outPrintingGrpOutPrintThirdpartyTemplatSize4 property.
     * 
     */
    public short getOutPrintingGrpOutPrintThirdpartyTemplatSize4() {
        return outPrintingGrpOutPrintThirdpartyTemplatSize4;
    }

    /**
     * Sets the value of the outPrintingGrpOutPrintThirdpartyTemplatSize4 property.
     * 
     */
    public void setOutPrintingGrpOutPrintThirdpartyTemplatSize4(short value) {
        this.outPrintingGrpOutPrintThirdpartyTemplatSize4 = value;
    }

    /**
     * Gets the value of the outPrintingGrpOutPrintThirdpartyTemplatValidAlgorInd1 property.
     * 
     */
    public short getOutPrintingGrpOutPrintThirdpartyTemplatValidAlgorInd1() {
        return outPrintingGrpOutPrintThirdpartyTemplatValidAlgorInd1;
    }

    /**
     * Sets the value of the outPrintingGrpOutPrintThirdpartyTemplatValidAlgorInd1 property.
     * 
     */
    public void setOutPrintingGrpOutPrintThirdpartyTemplatValidAlgorInd1(short value) {
        this.outPrintingGrpOutPrintThirdpartyTemplatValidAlgorInd1 = value;
    }

    /**
     * Gets the value of the outPrintingGrpOutPrintThirdpartyTemplatValidAlgorInd2 property.
     * 
     */
    public short getOutPrintingGrpOutPrintThirdpartyTemplatValidAlgorInd2() {
        return outPrintingGrpOutPrintThirdpartyTemplatValidAlgorInd2;
    }

    /**
     * Sets the value of the outPrintingGrpOutPrintThirdpartyTemplatValidAlgorInd2 property.
     * 
     */
    public void setOutPrintingGrpOutPrintThirdpartyTemplatValidAlgorInd2(short value) {
        this.outPrintingGrpOutPrintThirdpartyTemplatValidAlgorInd2 = value;
    }

    /**
     * Gets the value of the outPrintingGrpOutPrintThirdpartyTemplatValidAlgorInd3 property.
     * 
     */
    public short getOutPrintingGrpOutPrintThirdpartyTemplatValidAlgorInd3() {
        return outPrintingGrpOutPrintThirdpartyTemplatValidAlgorInd3;
    }

    /**
     * Sets the value of the outPrintingGrpOutPrintThirdpartyTemplatValidAlgorInd3 property.
     * 
     */
    public void setOutPrintingGrpOutPrintThirdpartyTemplatValidAlgorInd3(short value) {
        this.outPrintingGrpOutPrintThirdpartyTemplatValidAlgorInd3 = value;
    }

    /**
     * Gets the value of the outPrintingGrpOutPrintThirdpartyTemplatValidAlgorInd4 property.
     * 
     */
    public short getOutPrintingGrpOutPrintThirdpartyTemplatValidAlgorInd4() {
        return outPrintingGrpOutPrintThirdpartyTemplatValidAlgorInd4;
    }

    /**
     * Sets the value of the outPrintingGrpOutPrintThirdpartyTemplatValidAlgorInd4 property.
     * 
     */
    public void setOutPrintingGrpOutPrintThirdpartyTemplatValidAlgorInd4(short value) {
        this.outPrintingGrpOutPrintThirdpartyTemplatValidAlgorInd4 = value;
    }

    /**
     * Gets the value of the outPrintingGrpOutPrintGrpFxFtRecordingComments property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutPrintingGrpOutPrintGrpFxFtRecordingComments() {
        return outPrintingGrpOutPrintGrpFxFtRecordingComments;
    }

    /**
     * Sets the value of the outPrintingGrpOutPrintGrpFxFtRecordingComments property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutPrintingGrpOutPrintGrpFxFtRecordingComments(String value) {
        this.outPrintingGrpOutPrintGrpFxFtRecordingComments = value;
    }

}
