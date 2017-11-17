
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for FEXS01_FundsTransferWithExchangeExport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FEXS01_FundsTransferWithExchangeExport">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}BaseExport">
 *       &lt;sequence>
 *         &lt;element name="OutAlertCustomerAlertMsg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutAvailabilityWorkDatesProductionDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutCharCurrencyIdCurrency" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutCharCurrencyShortDescr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutComCurrencyIdCurrency" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutComCurrencyShortDescr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustCustAddressAddress1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustCustAddressAddress2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustCustAddressCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustCustAddressTelephone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustCustAddressZipCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustListSetDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustomerAlertMsg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustomerCustId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutDomComchataxIefSuppliedFinalCharges" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutDomComchataxIefSuppliedFinalCommission" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutDomComchataxIefSuppliedGenAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutDomCurrencyIdCurrency" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutDomCurrencyShortDescr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutFwdSwapContractsContractDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutFwdSwapContractsCurrencyRate" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutFwdSwapContractsDealerRefNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutFwdSwapContractsEntryComments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutFwdSwapContractsEntryStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutFwdSwapContractsMaturityDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutFwdSwapContractsNotificationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutFwdSwapContractsOrgSourceAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutFwdSwapContractsOrgTargetAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutFwdSwapContractsReferenceNo" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutFwdSwapContractsSourceUtilBal" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutFwdSwapContractsSourceValueDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutFwdSwapContractsStartDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutFwdSwapContractsTargetAvailDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutFwdSwapContractsTargetValueDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutFwdSwapContractsWayOfUtilization" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutParVoucherRunVoucherLine" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutPayFlgIefSuppliedFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutRoundingFxFtRecordingAccAmount29" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutRoundingFxFtRecordingAccAmount30" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutRoundingFxFtRecordingAccAmount43" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutRoundingFxFtRecordingAccAmount44" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutSourceIefSuppliedPayableAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutSourceRateWorkDatesProductionDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutStatusIefSuppliedActionEntryDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutStatusIefSuppliedSrvStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSuccessfulTransactionWorkAdviceCounter" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutSuccessfulTransactionWorkAdviceTitle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSuccessfulTransactionWorkDatetimestamp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSuccessfulTransactionWorkTrxDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutSuccessfulTransactionWorkTrxUnit" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutSuccessfulTransactionWorkTrxUser" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSuccessfulTransactionWorkTrxUsrSn" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutSuccessfulTransactionWorkTunInternalSn" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutTargetIefSuppliedPayableAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutTaxCharTotIefSuppliedFinalCharges" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutTaxCharTotIefSuppliedFinalCommission" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutTaxCharTotIefSuppliedGenAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutTaxCharTotIefSuppliedRate" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutTaxCurrencyIdCurrency" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutTaxCurrencyShortDescr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutTrxTrxCountTrxCounter" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutValueWorkDatesProductionDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutAuthGrp" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}ArrayOfFEXS01OutAuthGrpItem" minOccurs="0"/>
 *         &lt;element name="OutDetailGroup" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}ArrayOfFEXS01OutDetailGroupItem" minOccurs="0"/>
 *         &lt;element name="OutGrpCustomerActAppr" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}ArrayOfFEXS01OutGrpCustomerActApprItem" minOccurs="0"/>
 *         &lt;element name="OutGrpUserTotal" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}ArrayOfFEXS01OutGrpUserTotalItem" minOccurs="0"/>
 *         &lt;element name="DebitCurrency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CreditCurrency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BeneficiaryName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CommisionCurrency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ExpencesCurrency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BankTransactionDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FEXS01_FundsTransferWithExchangeExport", propOrder = {
    "outAlertCustomerAlertMsg",
    "outAvailabilityWorkDatesProductionDate",
    "outCharCurrencyIdCurrency",
    "outCharCurrencyShortDescr",
    "outComCurrencyIdCurrency",
    "outComCurrencyShortDescr",
    "outCustCustAddressAddress1",
    "outCustCustAddressAddress2",
    "outCustCustAddressCity",
    "outCustCustAddressTelephone",
    "outCustCustAddressZipCode",
    "outCustListSetDescription",
    "outCustomerAlertMsg",
    "outCustomerCustId",
    "outDomComchataxIefSuppliedFinalCharges",
    "outDomComchataxIefSuppliedFinalCommission",
    "outDomComchataxIefSuppliedGenAmount",
    "outDomCurrencyIdCurrency",
    "outDomCurrencyShortDescr",
    "outFwdSwapContractsContractDate",
    "outFwdSwapContractsCurrencyRate",
    "outFwdSwapContractsDealerRefNo",
    "outFwdSwapContractsEntryComments",
    "outFwdSwapContractsEntryStatus",
    "outFwdSwapContractsMaturityDate",
    "outFwdSwapContractsNotificationDate",
    "outFwdSwapContractsOrgSourceAmount",
    "outFwdSwapContractsOrgTargetAmount",
    "outFwdSwapContractsReferenceNo",
    "outFwdSwapContractsSourceUtilBal",
    "outFwdSwapContractsSourceValueDate",
    "outFwdSwapContractsStartDate",
    "outFwdSwapContractsTargetAvailDate",
    "outFwdSwapContractsTargetValueDate",
    "outFwdSwapContractsWayOfUtilization",
    "outParVoucherRunVoucherLine",
    "outPayFlgIefSuppliedFlag",
    "outRoundingFxFtRecordingAccAmount29",
    "outRoundingFxFtRecordingAccAmount30",
    "outRoundingFxFtRecordingAccAmount43",
    "outRoundingFxFtRecordingAccAmount44",
    "outSourceIefSuppliedPayableAmount",
    "outSourceRateWorkDatesProductionDate",
    "outStatusIefSuppliedActionEntryDesc",
    "outStatusIefSuppliedSrvStatus",
    "outSuccessfulTransactionWorkAdviceCounter",
    "outSuccessfulTransactionWorkAdviceTitle",
    "outSuccessfulTransactionWorkDatetimestamp",
    "outSuccessfulTransactionWorkTrxDate",
    "outSuccessfulTransactionWorkTrxUnit",
    "outSuccessfulTransactionWorkTrxUser",
    "outSuccessfulTransactionWorkTrxUsrSn",
    "outSuccessfulTransactionWorkTunInternalSn",
    "outTargetIefSuppliedPayableAmount",
    "outTaxCharTotIefSuppliedFinalCharges",
    "outTaxCharTotIefSuppliedFinalCommission",
    "outTaxCharTotIefSuppliedGenAmount",
    "outTaxCharTotIefSuppliedRate",
    "outTaxCurrencyIdCurrency",
    "outTaxCurrencyShortDescr",
    "outTrxTrxCountTrxCounter",
    "outValueWorkDatesProductionDate",
    "outAuthGrp",
    "outDetailGroup",
    "outGrpCustomerActAppr",
    "outGrpUserTotal",
    "debitCurrency",
    "creditCurrency",
    "beneficiaryName",
    "commisionCurrency",
    "expencesCurrency",
    "bankTransactionDate"
})
public class FEXS01FundsTransferWithExchangeExport
    extends BaseExport
{

    @XmlElement(name = "OutAlertCustomerAlertMsg")
    protected String outAlertCustomerAlertMsg;
    @XmlElement(name = "OutAvailabilityWorkDatesProductionDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outAvailabilityWorkDatesProductionDate;
    @XmlElement(name = "OutCharCurrencyIdCurrency")
    protected int outCharCurrencyIdCurrency;
    @XmlElement(name = "OutCharCurrencyShortDescr")
    protected String outCharCurrencyShortDescr;
    @XmlElement(name = "OutComCurrencyIdCurrency")
    protected int outComCurrencyIdCurrency;
    @XmlElement(name = "OutComCurrencyShortDescr")
    protected String outComCurrencyShortDescr;
    @XmlElement(name = "OutCustCustAddressAddress1")
    protected String outCustCustAddressAddress1;
    @XmlElement(name = "OutCustCustAddressAddress2")
    protected String outCustCustAddressAddress2;
    @XmlElement(name = "OutCustCustAddressCity")
    protected String outCustCustAddressCity;
    @XmlElement(name = "OutCustCustAddressTelephone")
    protected String outCustCustAddressTelephone;
    @XmlElement(name = "OutCustCustAddressZipCode")
    protected String outCustCustAddressZipCode;
    @XmlElement(name = "OutCustListSetDescription")
    protected String outCustListSetDescription;
    @XmlElement(name = "OutCustomerAlertMsg")
    protected String outCustomerAlertMsg;
    @XmlElement(name = "OutCustomerCustId")
    protected int outCustomerCustId;
    @XmlElement(name = "OutDomComchataxIefSuppliedFinalCharges", required = true)
    protected BigDecimal outDomComchataxIefSuppliedFinalCharges;
    @XmlElement(name = "OutDomComchataxIefSuppliedFinalCommission", required = true)
    protected BigDecimal outDomComchataxIefSuppliedFinalCommission;
    @XmlElement(name = "OutDomComchataxIefSuppliedGenAmount", required = true)
    protected BigDecimal outDomComchataxIefSuppliedGenAmount;
    @XmlElement(name = "OutDomCurrencyIdCurrency")
    protected int outDomCurrencyIdCurrency;
    @XmlElement(name = "OutDomCurrencyShortDescr")
    protected String outDomCurrencyShortDescr;
    @XmlElement(name = "OutFwdSwapContractsContractDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outFwdSwapContractsContractDate;
    @XmlElement(name = "OutFwdSwapContractsCurrencyRate", required = true)
    protected BigDecimal outFwdSwapContractsCurrencyRate;
    @XmlElement(name = "OutFwdSwapContractsDealerRefNo")
    protected String outFwdSwapContractsDealerRefNo;
    @XmlElement(name = "OutFwdSwapContractsEntryComments")
    protected String outFwdSwapContractsEntryComments;
    @XmlElement(name = "OutFwdSwapContractsEntryStatus")
    protected String outFwdSwapContractsEntryStatus;
    @XmlElement(name = "OutFwdSwapContractsMaturityDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outFwdSwapContractsMaturityDate;
    @XmlElement(name = "OutFwdSwapContractsNotificationDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outFwdSwapContractsNotificationDate;
    @XmlElement(name = "OutFwdSwapContractsOrgSourceAmount", required = true)
    protected BigDecimal outFwdSwapContractsOrgSourceAmount;
    @XmlElement(name = "OutFwdSwapContractsOrgTargetAmount", required = true)
    protected BigDecimal outFwdSwapContractsOrgTargetAmount;
    @XmlElement(name = "OutFwdSwapContractsReferenceNo")
    protected int outFwdSwapContractsReferenceNo;
    @XmlElement(name = "OutFwdSwapContractsSourceUtilBal", required = true)
    protected BigDecimal outFwdSwapContractsSourceUtilBal;
    @XmlElement(name = "OutFwdSwapContractsSourceValueDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outFwdSwapContractsSourceValueDate;
    @XmlElement(name = "OutFwdSwapContractsStartDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outFwdSwapContractsStartDate;
    @XmlElement(name = "OutFwdSwapContractsTargetAvailDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outFwdSwapContractsTargetAvailDate;
    @XmlElement(name = "OutFwdSwapContractsTargetValueDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outFwdSwapContractsTargetValueDate;
    @XmlElement(name = "OutFwdSwapContractsWayOfUtilization")
    protected String outFwdSwapContractsWayOfUtilization;
    @XmlElement(name = "OutParVoucherRunVoucherLine")
    protected String outParVoucherRunVoucherLine;
    @XmlElement(name = "OutPayFlgIefSuppliedFlag")
    protected String outPayFlgIefSuppliedFlag;
    @XmlElement(name = "OutRoundingFxFtRecordingAccAmount29", required = true)
    protected BigDecimal outRoundingFxFtRecordingAccAmount29;
    @XmlElement(name = "OutRoundingFxFtRecordingAccAmount30", required = true)
    protected BigDecimal outRoundingFxFtRecordingAccAmount30;
    @XmlElement(name = "OutRoundingFxFtRecordingAccAmount43", required = true)
    protected BigDecimal outRoundingFxFtRecordingAccAmount43;
    @XmlElement(name = "OutRoundingFxFtRecordingAccAmount44", required = true)
    protected BigDecimal outRoundingFxFtRecordingAccAmount44;
    @XmlElement(name = "OutSourceIefSuppliedPayableAmount", required = true)
    protected BigDecimal outSourceIefSuppliedPayableAmount;
    @XmlElement(name = "OutSourceRateWorkDatesProductionDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outSourceRateWorkDatesProductionDate;
    @XmlElement(name = "OutStatusIefSuppliedActionEntryDesc")
    protected String outStatusIefSuppliedActionEntryDesc;
    @XmlElement(name = "OutStatusIefSuppliedSrvStatus")
    protected String outStatusIefSuppliedSrvStatus;
    @XmlElement(name = "OutSuccessfulTransactionWorkAdviceCounter")
    protected int outSuccessfulTransactionWorkAdviceCounter;
    @XmlElement(name = "OutSuccessfulTransactionWorkAdviceTitle")
    protected String outSuccessfulTransactionWorkAdviceTitle;
    @XmlElement(name = "OutSuccessfulTransactionWorkDatetimestamp")
    protected String outSuccessfulTransactionWorkDatetimestamp;
    @XmlElement(name = "OutSuccessfulTransactionWorkTrxDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outSuccessfulTransactionWorkTrxDate;
    @XmlElement(name = "OutSuccessfulTransactionWorkTrxUnit")
    protected int outSuccessfulTransactionWorkTrxUnit;
    @XmlElement(name = "OutSuccessfulTransactionWorkTrxUser")
    protected String outSuccessfulTransactionWorkTrxUser;
    @XmlElement(name = "OutSuccessfulTransactionWorkTrxUsrSn")
    protected int outSuccessfulTransactionWorkTrxUsrSn;
    @XmlElement(name = "OutSuccessfulTransactionWorkTunInternalSn")
    protected short outSuccessfulTransactionWorkTunInternalSn;
    @XmlElement(name = "OutTargetIefSuppliedPayableAmount", required = true)
    protected BigDecimal outTargetIefSuppliedPayableAmount;
    @XmlElement(name = "OutTaxCharTotIefSuppliedFinalCharges", required = true)
    protected BigDecimal outTaxCharTotIefSuppliedFinalCharges;
    @XmlElement(name = "OutTaxCharTotIefSuppliedFinalCommission", required = true)
    protected BigDecimal outTaxCharTotIefSuppliedFinalCommission;
    @XmlElement(name = "OutTaxCharTotIefSuppliedGenAmount", required = true)
    protected BigDecimal outTaxCharTotIefSuppliedGenAmount;
    @XmlElement(name = "OutTaxCharTotIefSuppliedRate", required = true)
    protected BigDecimal outTaxCharTotIefSuppliedRate;
    @XmlElement(name = "OutTaxCurrencyIdCurrency")
    protected int outTaxCurrencyIdCurrency;
    @XmlElement(name = "OutTaxCurrencyShortDescr")
    protected String outTaxCurrencyShortDescr;
    @XmlElement(name = "OutTrxTrxCountTrxCounter")
    protected int outTrxTrxCountTrxCounter;
    @XmlElement(name = "OutValueWorkDatesProductionDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outValueWorkDatesProductionDate;
    @XmlElement(name = "OutAuthGrp")
    protected ArrayOfFEXS01OutAuthGrpItem outAuthGrp;
    @XmlElement(name = "OutDetailGroup")
    protected ArrayOfFEXS01OutDetailGroupItem outDetailGroup;
    @XmlElement(name = "OutGrpCustomerActAppr")
    protected ArrayOfFEXS01OutGrpCustomerActApprItem outGrpCustomerActAppr;
    @XmlElement(name = "OutGrpUserTotal")
    protected ArrayOfFEXS01OutGrpUserTotalItem outGrpUserTotal;
    @XmlElement(name = "DebitCurrency")
    protected String debitCurrency;
    @XmlElement(name = "CreditCurrency")
    protected String creditCurrency;
    @XmlElement(name = "BeneficiaryName")
    protected String beneficiaryName;
    @XmlElement(name = "CommisionCurrency")
    protected String commisionCurrency;
    @XmlElement(name = "ExpencesCurrency")
    protected String expencesCurrency;
    @XmlElement(name = "BankTransactionDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar bankTransactionDate;

    /**
     * Gets the value of the outAlertCustomerAlertMsg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutAlertCustomerAlertMsg() {
        return outAlertCustomerAlertMsg;
    }

    /**
     * Sets the value of the outAlertCustomerAlertMsg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutAlertCustomerAlertMsg(String value) {
        this.outAlertCustomerAlertMsg = value;
    }

    /**
     * Gets the value of the outAvailabilityWorkDatesProductionDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutAvailabilityWorkDatesProductionDate() {
        return outAvailabilityWorkDatesProductionDate;
    }

    /**
     * Sets the value of the outAvailabilityWorkDatesProductionDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutAvailabilityWorkDatesProductionDate(XMLGregorianCalendar value) {
        this.outAvailabilityWorkDatesProductionDate = value;
    }

    /**
     * Gets the value of the outCharCurrencyIdCurrency property.
     * 
     */
    public int getOutCharCurrencyIdCurrency() {
        return outCharCurrencyIdCurrency;
    }

    /**
     * Sets the value of the outCharCurrencyIdCurrency property.
     * 
     */
    public void setOutCharCurrencyIdCurrency(int value) {
        this.outCharCurrencyIdCurrency = value;
    }

    /**
     * Gets the value of the outCharCurrencyShortDescr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCharCurrencyShortDescr() {
        return outCharCurrencyShortDescr;
    }

    /**
     * Sets the value of the outCharCurrencyShortDescr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCharCurrencyShortDescr(String value) {
        this.outCharCurrencyShortDescr = value;
    }

    /**
     * Gets the value of the outComCurrencyIdCurrency property.
     * 
     */
    public int getOutComCurrencyIdCurrency() {
        return outComCurrencyIdCurrency;
    }

    /**
     * Sets the value of the outComCurrencyIdCurrency property.
     * 
     */
    public void setOutComCurrencyIdCurrency(int value) {
        this.outComCurrencyIdCurrency = value;
    }

    /**
     * Gets the value of the outComCurrencyShortDescr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutComCurrencyShortDescr() {
        return outComCurrencyShortDescr;
    }

    /**
     * Sets the value of the outComCurrencyShortDescr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutComCurrencyShortDescr(String value) {
        this.outComCurrencyShortDescr = value;
    }

    /**
     * Gets the value of the outCustCustAddressAddress1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCustCustAddressAddress1() {
        return outCustCustAddressAddress1;
    }

    /**
     * Sets the value of the outCustCustAddressAddress1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCustCustAddressAddress1(String value) {
        this.outCustCustAddressAddress1 = value;
    }

    /**
     * Gets the value of the outCustCustAddressAddress2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCustCustAddressAddress2() {
        return outCustCustAddressAddress2;
    }

    /**
     * Sets the value of the outCustCustAddressAddress2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCustCustAddressAddress2(String value) {
        this.outCustCustAddressAddress2 = value;
    }

    /**
     * Gets the value of the outCustCustAddressCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCustCustAddressCity() {
        return outCustCustAddressCity;
    }

    /**
     * Sets the value of the outCustCustAddressCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCustCustAddressCity(String value) {
        this.outCustCustAddressCity = value;
    }

    /**
     * Gets the value of the outCustCustAddressTelephone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCustCustAddressTelephone() {
        return outCustCustAddressTelephone;
    }

    /**
     * Sets the value of the outCustCustAddressTelephone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCustCustAddressTelephone(String value) {
        this.outCustCustAddressTelephone = value;
    }

    /**
     * Gets the value of the outCustCustAddressZipCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCustCustAddressZipCode() {
        return outCustCustAddressZipCode;
    }

    /**
     * Sets the value of the outCustCustAddressZipCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCustCustAddressZipCode(String value) {
        this.outCustCustAddressZipCode = value;
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
     * Gets the value of the outDomComchataxIefSuppliedFinalCharges property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutDomComchataxIefSuppliedFinalCharges() {
        return outDomComchataxIefSuppliedFinalCharges;
    }

    /**
     * Sets the value of the outDomComchataxIefSuppliedFinalCharges property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutDomComchataxIefSuppliedFinalCharges(BigDecimal value) {
        this.outDomComchataxIefSuppliedFinalCharges = value;
    }

    /**
     * Gets the value of the outDomComchataxIefSuppliedFinalCommission property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutDomComchataxIefSuppliedFinalCommission() {
        return outDomComchataxIefSuppliedFinalCommission;
    }

    /**
     * Sets the value of the outDomComchataxIefSuppliedFinalCommission property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutDomComchataxIefSuppliedFinalCommission(BigDecimal value) {
        this.outDomComchataxIefSuppliedFinalCommission = value;
    }

    /**
     * Gets the value of the outDomComchataxIefSuppliedGenAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutDomComchataxIefSuppliedGenAmount() {
        return outDomComchataxIefSuppliedGenAmount;
    }

    /**
     * Sets the value of the outDomComchataxIefSuppliedGenAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutDomComchataxIefSuppliedGenAmount(BigDecimal value) {
        this.outDomComchataxIefSuppliedGenAmount = value;
    }

    /**
     * Gets the value of the outDomCurrencyIdCurrency property.
     * 
     */
    public int getOutDomCurrencyIdCurrency() {
        return outDomCurrencyIdCurrency;
    }

    /**
     * Sets the value of the outDomCurrencyIdCurrency property.
     * 
     */
    public void setOutDomCurrencyIdCurrency(int value) {
        this.outDomCurrencyIdCurrency = value;
    }

    /**
     * Gets the value of the outDomCurrencyShortDescr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutDomCurrencyShortDescr() {
        return outDomCurrencyShortDescr;
    }

    /**
     * Sets the value of the outDomCurrencyShortDescr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutDomCurrencyShortDescr(String value) {
        this.outDomCurrencyShortDescr = value;
    }

    /**
     * Gets the value of the outFwdSwapContractsContractDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutFwdSwapContractsContractDate() {
        return outFwdSwapContractsContractDate;
    }

    /**
     * Sets the value of the outFwdSwapContractsContractDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutFwdSwapContractsContractDate(XMLGregorianCalendar value) {
        this.outFwdSwapContractsContractDate = value;
    }

    /**
     * Gets the value of the outFwdSwapContractsCurrencyRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutFwdSwapContractsCurrencyRate() {
        return outFwdSwapContractsCurrencyRate;
    }

    /**
     * Sets the value of the outFwdSwapContractsCurrencyRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutFwdSwapContractsCurrencyRate(BigDecimal value) {
        this.outFwdSwapContractsCurrencyRate = value;
    }

    /**
     * Gets the value of the outFwdSwapContractsDealerRefNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutFwdSwapContractsDealerRefNo() {
        return outFwdSwapContractsDealerRefNo;
    }

    /**
     * Sets the value of the outFwdSwapContractsDealerRefNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutFwdSwapContractsDealerRefNo(String value) {
        this.outFwdSwapContractsDealerRefNo = value;
    }

    /**
     * Gets the value of the outFwdSwapContractsEntryComments property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutFwdSwapContractsEntryComments() {
        return outFwdSwapContractsEntryComments;
    }

    /**
     * Sets the value of the outFwdSwapContractsEntryComments property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutFwdSwapContractsEntryComments(String value) {
        this.outFwdSwapContractsEntryComments = value;
    }

    /**
     * Gets the value of the outFwdSwapContractsEntryStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutFwdSwapContractsEntryStatus() {
        return outFwdSwapContractsEntryStatus;
    }

    /**
     * Sets the value of the outFwdSwapContractsEntryStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutFwdSwapContractsEntryStatus(String value) {
        this.outFwdSwapContractsEntryStatus = value;
    }

    /**
     * Gets the value of the outFwdSwapContractsMaturityDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutFwdSwapContractsMaturityDate() {
        return outFwdSwapContractsMaturityDate;
    }

    /**
     * Sets the value of the outFwdSwapContractsMaturityDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutFwdSwapContractsMaturityDate(XMLGregorianCalendar value) {
        this.outFwdSwapContractsMaturityDate = value;
    }

    /**
     * Gets the value of the outFwdSwapContractsNotificationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutFwdSwapContractsNotificationDate() {
        return outFwdSwapContractsNotificationDate;
    }

    /**
     * Sets the value of the outFwdSwapContractsNotificationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutFwdSwapContractsNotificationDate(XMLGregorianCalendar value) {
        this.outFwdSwapContractsNotificationDate = value;
    }

    /**
     * Gets the value of the outFwdSwapContractsOrgSourceAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutFwdSwapContractsOrgSourceAmount() {
        return outFwdSwapContractsOrgSourceAmount;
    }

    /**
     * Sets the value of the outFwdSwapContractsOrgSourceAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutFwdSwapContractsOrgSourceAmount(BigDecimal value) {
        this.outFwdSwapContractsOrgSourceAmount = value;
    }

    /**
     * Gets the value of the outFwdSwapContractsOrgTargetAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutFwdSwapContractsOrgTargetAmount() {
        return outFwdSwapContractsOrgTargetAmount;
    }

    /**
     * Sets the value of the outFwdSwapContractsOrgTargetAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutFwdSwapContractsOrgTargetAmount(BigDecimal value) {
        this.outFwdSwapContractsOrgTargetAmount = value;
    }

    /**
     * Gets the value of the outFwdSwapContractsReferenceNo property.
     * 
     */
    public int getOutFwdSwapContractsReferenceNo() {
        return outFwdSwapContractsReferenceNo;
    }

    /**
     * Sets the value of the outFwdSwapContractsReferenceNo property.
     * 
     */
    public void setOutFwdSwapContractsReferenceNo(int value) {
        this.outFwdSwapContractsReferenceNo = value;
    }

    /**
     * Gets the value of the outFwdSwapContractsSourceUtilBal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutFwdSwapContractsSourceUtilBal() {
        return outFwdSwapContractsSourceUtilBal;
    }

    /**
     * Sets the value of the outFwdSwapContractsSourceUtilBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutFwdSwapContractsSourceUtilBal(BigDecimal value) {
        this.outFwdSwapContractsSourceUtilBal = value;
    }

    /**
     * Gets the value of the outFwdSwapContractsSourceValueDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutFwdSwapContractsSourceValueDate() {
        return outFwdSwapContractsSourceValueDate;
    }

    /**
     * Sets the value of the outFwdSwapContractsSourceValueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutFwdSwapContractsSourceValueDate(XMLGregorianCalendar value) {
        this.outFwdSwapContractsSourceValueDate = value;
    }

    /**
     * Gets the value of the outFwdSwapContractsStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutFwdSwapContractsStartDate() {
        return outFwdSwapContractsStartDate;
    }

    /**
     * Sets the value of the outFwdSwapContractsStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutFwdSwapContractsStartDate(XMLGregorianCalendar value) {
        this.outFwdSwapContractsStartDate = value;
    }

    /**
     * Gets the value of the outFwdSwapContractsTargetAvailDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutFwdSwapContractsTargetAvailDate() {
        return outFwdSwapContractsTargetAvailDate;
    }

    /**
     * Sets the value of the outFwdSwapContractsTargetAvailDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutFwdSwapContractsTargetAvailDate(XMLGregorianCalendar value) {
        this.outFwdSwapContractsTargetAvailDate = value;
    }

    /**
     * Gets the value of the outFwdSwapContractsTargetValueDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutFwdSwapContractsTargetValueDate() {
        return outFwdSwapContractsTargetValueDate;
    }

    /**
     * Sets the value of the outFwdSwapContractsTargetValueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutFwdSwapContractsTargetValueDate(XMLGregorianCalendar value) {
        this.outFwdSwapContractsTargetValueDate = value;
    }

    /**
     * Gets the value of the outFwdSwapContractsWayOfUtilization property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutFwdSwapContractsWayOfUtilization() {
        return outFwdSwapContractsWayOfUtilization;
    }

    /**
     * Sets the value of the outFwdSwapContractsWayOfUtilization property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutFwdSwapContractsWayOfUtilization(String value) {
        this.outFwdSwapContractsWayOfUtilization = value;
    }

    /**
     * Gets the value of the outParVoucherRunVoucherLine property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutParVoucherRunVoucherLine() {
        return outParVoucherRunVoucherLine;
    }

    /**
     * Sets the value of the outParVoucherRunVoucherLine property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutParVoucherRunVoucherLine(String value) {
        this.outParVoucherRunVoucherLine = value;
    }

    /**
     * Gets the value of the outPayFlgIefSuppliedFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutPayFlgIefSuppliedFlag() {
        return outPayFlgIefSuppliedFlag;
    }

    /**
     * Sets the value of the outPayFlgIefSuppliedFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutPayFlgIefSuppliedFlag(String value) {
        this.outPayFlgIefSuppliedFlag = value;
    }

    /**
     * Gets the value of the outRoundingFxFtRecordingAccAmount29 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutRoundingFxFtRecordingAccAmount29() {
        return outRoundingFxFtRecordingAccAmount29;
    }

    /**
     * Sets the value of the outRoundingFxFtRecordingAccAmount29 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutRoundingFxFtRecordingAccAmount29(BigDecimal value) {
        this.outRoundingFxFtRecordingAccAmount29 = value;
    }

    /**
     * Gets the value of the outRoundingFxFtRecordingAccAmount30 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutRoundingFxFtRecordingAccAmount30() {
        return outRoundingFxFtRecordingAccAmount30;
    }

    /**
     * Sets the value of the outRoundingFxFtRecordingAccAmount30 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutRoundingFxFtRecordingAccAmount30(BigDecimal value) {
        this.outRoundingFxFtRecordingAccAmount30 = value;
    }

    /**
     * Gets the value of the outRoundingFxFtRecordingAccAmount43 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutRoundingFxFtRecordingAccAmount43() {
        return outRoundingFxFtRecordingAccAmount43;
    }

    /**
     * Sets the value of the outRoundingFxFtRecordingAccAmount43 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutRoundingFxFtRecordingAccAmount43(BigDecimal value) {
        this.outRoundingFxFtRecordingAccAmount43 = value;
    }

    /**
     * Gets the value of the outRoundingFxFtRecordingAccAmount44 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutRoundingFxFtRecordingAccAmount44() {
        return outRoundingFxFtRecordingAccAmount44;
    }

    /**
     * Sets the value of the outRoundingFxFtRecordingAccAmount44 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutRoundingFxFtRecordingAccAmount44(BigDecimal value) {
        this.outRoundingFxFtRecordingAccAmount44 = value;
    }

    /**
     * Gets the value of the outSourceIefSuppliedPayableAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutSourceIefSuppliedPayableAmount() {
        return outSourceIefSuppliedPayableAmount;
    }

    /**
     * Sets the value of the outSourceIefSuppliedPayableAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutSourceIefSuppliedPayableAmount(BigDecimal value) {
        this.outSourceIefSuppliedPayableAmount = value;
    }

    /**
     * Gets the value of the outSourceRateWorkDatesProductionDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutSourceRateWorkDatesProductionDate() {
        return outSourceRateWorkDatesProductionDate;
    }

    /**
     * Sets the value of the outSourceRateWorkDatesProductionDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutSourceRateWorkDatesProductionDate(XMLGregorianCalendar value) {
        this.outSourceRateWorkDatesProductionDate = value;
    }

    /**
     * Gets the value of the outStatusIefSuppliedActionEntryDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutStatusIefSuppliedActionEntryDesc() {
        return outStatusIefSuppliedActionEntryDesc;
    }

    /**
     * Sets the value of the outStatusIefSuppliedActionEntryDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutStatusIefSuppliedActionEntryDesc(String value) {
        this.outStatusIefSuppliedActionEntryDesc = value;
    }

    /**
     * Gets the value of the outStatusIefSuppliedSrvStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutStatusIefSuppliedSrvStatus() {
        return outStatusIefSuppliedSrvStatus;
    }

    /**
     * Sets the value of the outStatusIefSuppliedSrvStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutStatusIefSuppliedSrvStatus(String value) {
        this.outStatusIefSuppliedSrvStatus = value;
    }

    /**
     * Gets the value of the outSuccessfulTransactionWorkAdviceCounter property.
     * 
     */
    public int getOutSuccessfulTransactionWorkAdviceCounter() {
        return outSuccessfulTransactionWorkAdviceCounter;
    }

    /**
     * Sets the value of the outSuccessfulTransactionWorkAdviceCounter property.
     * 
     */
    public void setOutSuccessfulTransactionWorkAdviceCounter(int value) {
        this.outSuccessfulTransactionWorkAdviceCounter = value;
    }

    /**
     * Gets the value of the outSuccessfulTransactionWorkAdviceTitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSuccessfulTransactionWorkAdviceTitle() {
        return outSuccessfulTransactionWorkAdviceTitle;
    }

    /**
     * Sets the value of the outSuccessfulTransactionWorkAdviceTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSuccessfulTransactionWorkAdviceTitle(String value) {
        this.outSuccessfulTransactionWorkAdviceTitle = value;
    }

    /**
     * Gets the value of the outSuccessfulTransactionWorkDatetimestamp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSuccessfulTransactionWorkDatetimestamp() {
        return outSuccessfulTransactionWorkDatetimestamp;
    }

    /**
     * Sets the value of the outSuccessfulTransactionWorkDatetimestamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSuccessfulTransactionWorkDatetimestamp(String value) {
        this.outSuccessfulTransactionWorkDatetimestamp = value;
    }

    /**
     * Gets the value of the outSuccessfulTransactionWorkTrxDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutSuccessfulTransactionWorkTrxDate() {
        return outSuccessfulTransactionWorkTrxDate;
    }

    /**
     * Sets the value of the outSuccessfulTransactionWorkTrxDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutSuccessfulTransactionWorkTrxDate(XMLGregorianCalendar value) {
        this.outSuccessfulTransactionWorkTrxDate = value;
    }

    /**
     * Gets the value of the outSuccessfulTransactionWorkTrxUnit property.
     * 
     */
    public int getOutSuccessfulTransactionWorkTrxUnit() {
        return outSuccessfulTransactionWorkTrxUnit;
    }

    /**
     * Sets the value of the outSuccessfulTransactionWorkTrxUnit property.
     * 
     */
    public void setOutSuccessfulTransactionWorkTrxUnit(int value) {
        this.outSuccessfulTransactionWorkTrxUnit = value;
    }

    /**
     * Gets the value of the outSuccessfulTransactionWorkTrxUser property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSuccessfulTransactionWorkTrxUser() {
        return outSuccessfulTransactionWorkTrxUser;
    }

    /**
     * Sets the value of the outSuccessfulTransactionWorkTrxUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSuccessfulTransactionWorkTrxUser(String value) {
        this.outSuccessfulTransactionWorkTrxUser = value;
    }

    /**
     * Gets the value of the outSuccessfulTransactionWorkTrxUsrSn property.
     * 
     */
    public int getOutSuccessfulTransactionWorkTrxUsrSn() {
        return outSuccessfulTransactionWorkTrxUsrSn;
    }

    /**
     * Sets the value of the outSuccessfulTransactionWorkTrxUsrSn property.
     * 
     */
    public void setOutSuccessfulTransactionWorkTrxUsrSn(int value) {
        this.outSuccessfulTransactionWorkTrxUsrSn = value;
    }

    /**
     * Gets the value of the outSuccessfulTransactionWorkTunInternalSn property.
     * 
     */
    public short getOutSuccessfulTransactionWorkTunInternalSn() {
        return outSuccessfulTransactionWorkTunInternalSn;
    }

    /**
     * Sets the value of the outSuccessfulTransactionWorkTunInternalSn property.
     * 
     */
    public void setOutSuccessfulTransactionWorkTunInternalSn(short value) {
        this.outSuccessfulTransactionWorkTunInternalSn = value;
    }

    /**
     * Gets the value of the outTargetIefSuppliedPayableAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutTargetIefSuppliedPayableAmount() {
        return outTargetIefSuppliedPayableAmount;
    }

    /**
     * Sets the value of the outTargetIefSuppliedPayableAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutTargetIefSuppliedPayableAmount(BigDecimal value) {
        this.outTargetIefSuppliedPayableAmount = value;
    }

    /**
     * Gets the value of the outTaxCharTotIefSuppliedFinalCharges property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutTaxCharTotIefSuppliedFinalCharges() {
        return outTaxCharTotIefSuppliedFinalCharges;
    }

    /**
     * Sets the value of the outTaxCharTotIefSuppliedFinalCharges property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutTaxCharTotIefSuppliedFinalCharges(BigDecimal value) {
        this.outTaxCharTotIefSuppliedFinalCharges = value;
    }

    /**
     * Gets the value of the outTaxCharTotIefSuppliedFinalCommission property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutTaxCharTotIefSuppliedFinalCommission() {
        return outTaxCharTotIefSuppliedFinalCommission;
    }

    /**
     * Sets the value of the outTaxCharTotIefSuppliedFinalCommission property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutTaxCharTotIefSuppliedFinalCommission(BigDecimal value) {
        this.outTaxCharTotIefSuppliedFinalCommission = value;
    }

    /**
     * Gets the value of the outTaxCharTotIefSuppliedGenAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutTaxCharTotIefSuppliedGenAmount() {
        return outTaxCharTotIefSuppliedGenAmount;
    }

    /**
     * Sets the value of the outTaxCharTotIefSuppliedGenAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutTaxCharTotIefSuppliedGenAmount(BigDecimal value) {
        this.outTaxCharTotIefSuppliedGenAmount = value;
    }

    /**
     * Gets the value of the outTaxCharTotIefSuppliedRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutTaxCharTotIefSuppliedRate() {
        return outTaxCharTotIefSuppliedRate;
    }

    /**
     * Sets the value of the outTaxCharTotIefSuppliedRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutTaxCharTotIefSuppliedRate(BigDecimal value) {
        this.outTaxCharTotIefSuppliedRate = value;
    }

    /**
     * Gets the value of the outTaxCurrencyIdCurrency property.
     * 
     */
    public int getOutTaxCurrencyIdCurrency() {
        return outTaxCurrencyIdCurrency;
    }

    /**
     * Sets the value of the outTaxCurrencyIdCurrency property.
     * 
     */
    public void setOutTaxCurrencyIdCurrency(int value) {
        this.outTaxCurrencyIdCurrency = value;
    }

    /**
     * Gets the value of the outTaxCurrencyShortDescr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutTaxCurrencyShortDescr() {
        return outTaxCurrencyShortDescr;
    }

    /**
     * Sets the value of the outTaxCurrencyShortDescr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutTaxCurrencyShortDescr(String value) {
        this.outTaxCurrencyShortDescr = value;
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
     * Gets the value of the outValueWorkDatesProductionDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutValueWorkDatesProductionDate() {
        return outValueWorkDatesProductionDate;
    }

    /**
     * Sets the value of the outValueWorkDatesProductionDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutValueWorkDatesProductionDate(XMLGregorianCalendar value) {
        this.outValueWorkDatesProductionDate = value;
    }

    /**
     * Gets the value of the outAuthGrp property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfFEXS01OutAuthGrpItem }
     *     
     */
    public ArrayOfFEXS01OutAuthGrpItem getOutAuthGrp() {
        return outAuthGrp;
    }

    /**
     * Sets the value of the outAuthGrp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfFEXS01OutAuthGrpItem }
     *     
     */
    public void setOutAuthGrp(ArrayOfFEXS01OutAuthGrpItem value) {
        this.outAuthGrp = value;
    }

    /**
     * Gets the value of the outDetailGroup property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfFEXS01OutDetailGroupItem }
     *     
     */
    public ArrayOfFEXS01OutDetailGroupItem getOutDetailGroup() {
        return outDetailGroup;
    }

    /**
     * Sets the value of the outDetailGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfFEXS01OutDetailGroupItem }
     *     
     */
    public void setOutDetailGroup(ArrayOfFEXS01OutDetailGroupItem value) {
        this.outDetailGroup = value;
    }

    /**
     * Gets the value of the outGrpCustomerActAppr property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfFEXS01OutGrpCustomerActApprItem }
     *     
     */
    public ArrayOfFEXS01OutGrpCustomerActApprItem getOutGrpCustomerActAppr() {
        return outGrpCustomerActAppr;
    }

    /**
     * Sets the value of the outGrpCustomerActAppr property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfFEXS01OutGrpCustomerActApprItem }
     *     
     */
    public void setOutGrpCustomerActAppr(ArrayOfFEXS01OutGrpCustomerActApprItem value) {
        this.outGrpCustomerActAppr = value;
    }

    /**
     * Gets the value of the outGrpUserTotal property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfFEXS01OutGrpUserTotalItem }
     *     
     */
    public ArrayOfFEXS01OutGrpUserTotalItem getOutGrpUserTotal() {
        return outGrpUserTotal;
    }

    /**
     * Sets the value of the outGrpUserTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfFEXS01OutGrpUserTotalItem }
     *     
     */
    public void setOutGrpUserTotal(ArrayOfFEXS01OutGrpUserTotalItem value) {
        this.outGrpUserTotal = value;
    }

    /**
     * Gets the value of the debitCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDebitCurrency() {
        return debitCurrency;
    }

    /**
     * Sets the value of the debitCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDebitCurrency(String value) {
        this.debitCurrency = value;
    }

    /**
     * Gets the value of the creditCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditCurrency() {
        return creditCurrency;
    }

    /**
     * Sets the value of the creditCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditCurrency(String value) {
        this.creditCurrency = value;
    }

    /**
     * Gets the value of the beneficiaryName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBeneficiaryName() {
        return beneficiaryName;
    }

    /**
     * Sets the value of the beneficiaryName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBeneficiaryName(String value) {
        this.beneficiaryName = value;
    }

    /**
     * Gets the value of the commisionCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommisionCurrency() {
        return commisionCurrency;
    }

    /**
     * Sets the value of the commisionCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommisionCurrency(String value) {
        this.commisionCurrency = value;
    }

    /**
     * Gets the value of the expencesCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpencesCurrency() {
        return expencesCurrency;
    }

    /**
     * Sets the value of the expencesCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpencesCurrency(String value) {
        this.expencesCurrency = value;
    }

    /**
     * Gets the value of the bankTransactionDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBankTransactionDate() {
        return bankTransactionDate;
    }

    /**
     * Sets the value of the bankTransactionDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBankTransactionDate(XMLGregorianCalendar value) {
        this.bankTransactionDate = value;
    }

}
