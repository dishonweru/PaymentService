
package com.intrasoft_internatinal.gatewayservice.profitsext;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for CIA0008V_MessageRequestExport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CIA0008V_MessageRequestExport">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}BaseExport">
 *       &lt;sequence>
 *         &lt;element name="OutContinueCmsgRqstDtlCmsgRqstDtlSn" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutSelectedCmsgRqstHdrCmsgRqstHdrSn" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutSelectedCmsgRqstHdrCustomerComments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSelectedCmsgRqstHdrEmailTotals" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutSelectedCmsgRqstHdrEnabledEmails" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSelectedCmsgRqstHdrEnabledSms" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSelectedCmsgRqstHdrInsertDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutSelectedCmsgRqstHdrInsertTmstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutSelectedCmsgRqstHdrInsertUnit" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutSelectedCmsgRqstHdrInsertUser" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSelectedCmsgRqstHdrLastExecutionDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutSelectedCmsgRqstHdrLastExecutionStamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutSelectedCmsgRqstHdrServiceAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSelectedCmsgRqstHdrServiceSystem" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutSelectedCmsgRqstHdrSmsTotals" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutSelectedCmsgRqstHdrUpdateDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutSelectedCmsgRqstHdrUpdateTmstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutSelectedCmsgRqstHdrUpdateUnit" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutSelectedCmsgRqstHdrUpdateUser" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSelectedCustomerCDigit" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutSelectedCustomerCustId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutSelectedCustomerEMail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSelectedCustomerFirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSelectedCustomerMobileTel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSelectedCustomerSurname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSelectedDialogCmsgRqstDtlAccBalGreater" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OutSelectedDialogCmsgRqstDtlAccBalLess" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OutSelectedDialogCmsgRqstDtlAccBalSet" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSelectedDialogCmsgRqstDtlAccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSelectedDialogCmsgRqstDtlAccountSystem" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutSelectedDialogCmsgRqstDtlAccountsAll" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSelectedDialogCmsgRqstDtlChannelId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutSelectedDialogCmsgRqstDtlChannelsAll" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSelectedDialogCmsgRqstDtlCmsgRqstDtlSn" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutSelectedDialogCmsgRqstDtlCmsgRqstDtlSts" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSelectedDialogCmsgRqstDtlEmailMain" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSelectedDialogCmsgRqstDtlEmailOther" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSelectedDialogCmsgRqstDtlEmailSend" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSelectedDialogCmsgRqstDtlEmailStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSelectedDialogCmsgRqstDtlEmailsTotals" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutSelectedDialogCmsgRqstDtlInsertDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutSelectedDialogCmsgRqstDtlInsertTmstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutSelectedDialogCmsgRqstDtlInsertUnit" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutSelectedDialogCmsgRqstDtlInsertUser" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSelectedDialogCmsgRqstDtlJustificationAll" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSelectedDialogCmsgRqstDtlJustificationId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutSelectedDialogCmsgRqstDtlLastExecutionDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutSelectedDialogCmsgRqstDtlLastExecutionStamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutSelectedDialogCmsgRqstDtlMessageComments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSelectedDialogCmsgRqstDtlProductAll" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSelectedDialogCmsgRqstDtlProductId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutSelectedDialogCmsgRqstDtlSmsMain" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSelectedDialogCmsgRqstDtlSmsOther" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSelectedDialogCmsgRqstDtlSmsSend" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSelectedDialogCmsgRqstDtlSmsStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSelectedDialogCmsgRqstDtlSmsTotals" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutSelectedDialogCmsgRqstDtlSpecificTimeEnd" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutSelectedDialogCmsgRqstDtlSpecificTimeFlg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSelectedDialogCmsgRqstDtlSpecificTimeStart" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutSelectedDialogCmsgRqstDtlTransactionAll" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSelectedDialogCmsgRqstDtlTransactionId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutSelectedDialogCmsgRqstDtlTrxAmountGreater" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OutSelectedDialogCmsgRqstDtlTrxAmountLess" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OutSelectedDialogCmsgRqstDtlTrxAmountSet" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSelectedDialogCmsgRqstDtlUpdateDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutSelectedDialogCmsgRqstDtlUpdateTmstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutSelectedDialogCmsgRqstDtlUpdateUnit" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutSelectedDialogCmsgRqstDtlUpdateUser" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSelectedDialogDistrChannelDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSelectedDialogDistrChannelIdChannel" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutSelectedDialogInsertListSetDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSelectedDialogInsertUnitCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutSelectedDialogInsertUnitUnitName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSelectedDialogJustificDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSelectedDialogJustificIdJustific" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutSelectedDialogMessageProfitsAccountAccountCd" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutSelectedDialogMessageProfitsAccountAccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSelectedDialogMessageProfitsAccountPrftSystem" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutSelectedDialogPrftTransactionDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSelectedDialogPrftTransactionIdTransact" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutSelectedDialogProductDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSelectedDialogProductIdProduct" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutSelectedDialogUpdateListSetDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSelectedDialogUpdateUnitCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutSelectedDialogUpdateUnitUnitName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSelectedHdrInsertListSetDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSelectedHdrInsertUnitUnitName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSelectedHdrUpdateListSetDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSelectedHdrUpdateUnitUnitName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSelectedServiceProfitsAccountAccStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSelectedServiceProfitsAccountAccountCd" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutSelectedServiceProfitsAccountAccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSelectedServiceProfitsAccountAccountSerNum" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OutSelectedServiceProfitsAccountAgrMembershipSn" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutSelectedServiceProfitsAccountAgrSn" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutSelectedServiceProfitsAccountAgrUnit" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutSelectedServiceProfitsAccountAgrYear" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutSelectedServiceProfitsAccountCDigit" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutSelectedServiceProfitsAccountCustId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutSelectedServiceProfitsAccountDepAccNumber" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OutSelectedServiceProfitsAccountDepOpenUnit" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutSelectedServiceProfitsAccountIdPackage" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutSelectedServiceProfitsAccountLgAccSn" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OutSelectedServiceProfitsAccountLgOpenUnit" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutSelectedServiceProfitsAccountLimitCurrency" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutSelectedServiceProfitsAccountLnsOpenUnit" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutSelectedServiceProfitsAccountLnsSn" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutSelectedServiceProfitsAccountLnsType" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutSelectedServiceProfitsAccountMonotoringUnit" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutSelectedServiceProfitsAccountMovementCurrency" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutSelectedServiceProfitsAccountPrftSystem" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutSelectedServiceProfitsAccountProductId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutSelectedServiceProfitsAccountTrOpenUnit" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutSelectedServiceProfitsAccountTrSn" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutSelectedServiceProfitsAccountTrType" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutGrpLog" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}ArrayOfCIA0008VOutGrpLogItem" minOccurs="0"/>
 *         &lt;element name="OutGrpRequests" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}ArrayOfCIA0008VOutGrpRequestsItem" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CIA0008V_MessageRequestExport", propOrder = {
    "outContinueCmsgRqstDtlCmsgRqstDtlSn",
    "outSelectedCmsgRqstHdrCmsgRqstHdrSn",
    "outSelectedCmsgRqstHdrCustomerComments",
    "outSelectedCmsgRqstHdrEmailTotals",
    "outSelectedCmsgRqstHdrEnabledEmails",
    "outSelectedCmsgRqstHdrEnabledSms",
    "outSelectedCmsgRqstHdrInsertDt",
    "outSelectedCmsgRqstHdrInsertTmstamp",
    "outSelectedCmsgRqstHdrInsertUnit",
    "outSelectedCmsgRqstHdrInsertUser",
    "outSelectedCmsgRqstHdrLastExecutionDate",
    "outSelectedCmsgRqstHdrLastExecutionStamp",
    "outSelectedCmsgRqstHdrServiceAccount",
    "outSelectedCmsgRqstHdrServiceSystem",
    "outSelectedCmsgRqstHdrSmsTotals",
    "outSelectedCmsgRqstHdrUpdateDt",
    "outSelectedCmsgRqstHdrUpdateTmstamp",
    "outSelectedCmsgRqstHdrUpdateUnit",
    "outSelectedCmsgRqstHdrUpdateUser",
    "outSelectedCustomerCDigit",
    "outSelectedCustomerCustId",
    "outSelectedCustomerEMail",
    "outSelectedCustomerFirstName",
    "outSelectedCustomerMobileTel",
    "outSelectedCustomerSurname",
    "outSelectedDialogCmsgRqstDtlAccBalGreater",
    "outSelectedDialogCmsgRqstDtlAccBalLess",
    "outSelectedDialogCmsgRqstDtlAccBalSet",
    "outSelectedDialogCmsgRqstDtlAccountNumber",
    "outSelectedDialogCmsgRqstDtlAccountSystem",
    "outSelectedDialogCmsgRqstDtlAccountsAll",
    "outSelectedDialogCmsgRqstDtlChannelId",
    "outSelectedDialogCmsgRqstDtlChannelsAll",
    "outSelectedDialogCmsgRqstDtlCmsgRqstDtlSn",
    "outSelectedDialogCmsgRqstDtlCmsgRqstDtlSts",
    "outSelectedDialogCmsgRqstDtlEmailMain",
    "outSelectedDialogCmsgRqstDtlEmailOther",
    "outSelectedDialogCmsgRqstDtlEmailSend",
    "outSelectedDialogCmsgRqstDtlEmailStatus",
    "outSelectedDialogCmsgRqstDtlEmailsTotals",
    "outSelectedDialogCmsgRqstDtlInsertDt",
    "outSelectedDialogCmsgRqstDtlInsertTmstamp",
    "outSelectedDialogCmsgRqstDtlInsertUnit",
    "outSelectedDialogCmsgRqstDtlInsertUser",
    "outSelectedDialogCmsgRqstDtlJustificationAll",
    "outSelectedDialogCmsgRqstDtlJustificationId",
    "outSelectedDialogCmsgRqstDtlLastExecutionDate",
    "outSelectedDialogCmsgRqstDtlLastExecutionStamp",
    "outSelectedDialogCmsgRqstDtlMessageComments",
    "outSelectedDialogCmsgRqstDtlProductAll",
    "outSelectedDialogCmsgRqstDtlProductId",
    "outSelectedDialogCmsgRqstDtlSmsMain",
    "outSelectedDialogCmsgRqstDtlSmsOther",
    "outSelectedDialogCmsgRqstDtlSmsSend",
    "outSelectedDialogCmsgRqstDtlSmsStatus",
    "outSelectedDialogCmsgRqstDtlSmsTotals",
    "outSelectedDialogCmsgRqstDtlSpecificTimeEnd",
    "outSelectedDialogCmsgRqstDtlSpecificTimeFlg",
    "outSelectedDialogCmsgRqstDtlSpecificTimeStart",
    "outSelectedDialogCmsgRqstDtlTransactionAll",
    "outSelectedDialogCmsgRqstDtlTransactionId",
    "outSelectedDialogCmsgRqstDtlTrxAmountGreater",
    "outSelectedDialogCmsgRqstDtlTrxAmountLess",
    "outSelectedDialogCmsgRqstDtlTrxAmountSet",
    "outSelectedDialogCmsgRqstDtlUpdateDt",
    "outSelectedDialogCmsgRqstDtlUpdateTmstamp",
    "outSelectedDialogCmsgRqstDtlUpdateUnit",
    "outSelectedDialogCmsgRqstDtlUpdateUser",
    "outSelectedDialogDistrChannelDescription",
    "outSelectedDialogDistrChannelIdChannel",
    "outSelectedDialogInsertListSetDescription",
    "outSelectedDialogInsertUnitCode",
    "outSelectedDialogInsertUnitUnitName",
    "outSelectedDialogJustificDescription",
    "outSelectedDialogJustificIdJustific",
    "outSelectedDialogMessageProfitsAccountAccountCd",
    "outSelectedDialogMessageProfitsAccountAccountNumber",
    "outSelectedDialogMessageProfitsAccountPrftSystem",
    "outSelectedDialogPrftTransactionDescription",
    "outSelectedDialogPrftTransactionIdTransact",
    "outSelectedDialogProductDescription",
    "outSelectedDialogProductIdProduct",
    "outSelectedDialogUpdateListSetDescription",
    "outSelectedDialogUpdateUnitCode",
    "outSelectedDialogUpdateUnitUnitName",
    "outSelectedHdrInsertListSetDescription",
    "outSelectedHdrInsertUnitUnitName",
    "outSelectedHdrUpdateListSetDescription",
    "outSelectedHdrUpdateUnitUnitName",
    "outSelectedServiceProfitsAccountAccStatus",
    "outSelectedServiceProfitsAccountAccountCd",
    "outSelectedServiceProfitsAccountAccountNumber",
    "outSelectedServiceProfitsAccountAccountSerNum",
    "outSelectedServiceProfitsAccountAgrMembershipSn",
    "outSelectedServiceProfitsAccountAgrSn",
    "outSelectedServiceProfitsAccountAgrUnit",
    "outSelectedServiceProfitsAccountAgrYear",
    "outSelectedServiceProfitsAccountCDigit",
    "outSelectedServiceProfitsAccountCustId",
    "outSelectedServiceProfitsAccountDepAccNumber",
    "outSelectedServiceProfitsAccountDepOpenUnit",
    "outSelectedServiceProfitsAccountIdPackage",
    "outSelectedServiceProfitsAccountLgAccSn",
    "outSelectedServiceProfitsAccountLgOpenUnit",
    "outSelectedServiceProfitsAccountLimitCurrency",
    "outSelectedServiceProfitsAccountLnsOpenUnit",
    "outSelectedServiceProfitsAccountLnsSn",
    "outSelectedServiceProfitsAccountLnsType",
    "outSelectedServiceProfitsAccountMonotoringUnit",
    "outSelectedServiceProfitsAccountMovementCurrency",
    "outSelectedServiceProfitsAccountPrftSystem",
    "outSelectedServiceProfitsAccountProductId",
    "outSelectedServiceProfitsAccountTrOpenUnit",
    "outSelectedServiceProfitsAccountTrSn",
    "outSelectedServiceProfitsAccountTrType",
    "outGrpLog",
    "outGrpRequests"
})
public class CIA0008VMessageRequestExport
    extends BaseExport
{

    @XmlElement(name = "OutContinueCmsgRqstDtlCmsgRqstDtlSn")
    protected int outContinueCmsgRqstDtlCmsgRqstDtlSn;
    @XmlElement(name = "OutSelectedCmsgRqstHdrCmsgRqstHdrSn")
    protected int outSelectedCmsgRqstHdrCmsgRqstHdrSn;
    @XmlElement(name = "OutSelectedCmsgRqstHdrCustomerComments")
    protected String outSelectedCmsgRqstHdrCustomerComments;
    @XmlElement(name = "OutSelectedCmsgRqstHdrEmailTotals")
    protected int outSelectedCmsgRqstHdrEmailTotals;
    @XmlElement(name = "OutSelectedCmsgRqstHdrEnabledEmails")
    protected String outSelectedCmsgRqstHdrEnabledEmails;
    @XmlElement(name = "OutSelectedCmsgRqstHdrEnabledSms")
    protected String outSelectedCmsgRqstHdrEnabledSms;
    @XmlElement(name = "OutSelectedCmsgRqstHdrInsertDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outSelectedCmsgRqstHdrInsertDt;
    @XmlElement(name = "OutSelectedCmsgRqstHdrInsertTmstamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outSelectedCmsgRqstHdrInsertTmstamp;
    @XmlElement(name = "OutSelectedCmsgRqstHdrInsertUnit")
    protected int outSelectedCmsgRqstHdrInsertUnit;
    @XmlElement(name = "OutSelectedCmsgRqstHdrInsertUser")
    protected String outSelectedCmsgRqstHdrInsertUser;
    @XmlElement(name = "OutSelectedCmsgRqstHdrLastExecutionDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outSelectedCmsgRqstHdrLastExecutionDate;
    @XmlElement(name = "OutSelectedCmsgRqstHdrLastExecutionStamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outSelectedCmsgRqstHdrLastExecutionStamp;
    @XmlElement(name = "OutSelectedCmsgRqstHdrServiceAccount")
    protected String outSelectedCmsgRqstHdrServiceAccount;
    @XmlElement(name = "OutSelectedCmsgRqstHdrServiceSystem")
    protected short outSelectedCmsgRqstHdrServiceSystem;
    @XmlElement(name = "OutSelectedCmsgRqstHdrSmsTotals")
    protected int outSelectedCmsgRqstHdrSmsTotals;
    @XmlElement(name = "OutSelectedCmsgRqstHdrUpdateDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outSelectedCmsgRqstHdrUpdateDt;
    @XmlElement(name = "OutSelectedCmsgRqstHdrUpdateTmstamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outSelectedCmsgRqstHdrUpdateTmstamp;
    @XmlElement(name = "OutSelectedCmsgRqstHdrUpdateUnit")
    protected int outSelectedCmsgRqstHdrUpdateUnit;
    @XmlElement(name = "OutSelectedCmsgRqstHdrUpdateUser")
    protected String outSelectedCmsgRqstHdrUpdateUser;
    @XmlElement(name = "OutSelectedCustomerCDigit")
    protected short outSelectedCustomerCDigit;
    @XmlElement(name = "OutSelectedCustomerCustId")
    protected int outSelectedCustomerCustId;
    @XmlElement(name = "OutSelectedCustomerEMail")
    protected String outSelectedCustomerEMail;
    @XmlElement(name = "OutSelectedCustomerFirstName")
    protected String outSelectedCustomerFirstName;
    @XmlElement(name = "OutSelectedCustomerMobileTel")
    protected String outSelectedCustomerMobileTel;
    @XmlElement(name = "OutSelectedCustomerSurname")
    protected String outSelectedCustomerSurname;
    @XmlElement(name = "OutSelectedDialogCmsgRqstDtlAccBalGreater")
    protected double outSelectedDialogCmsgRqstDtlAccBalGreater;
    @XmlElement(name = "OutSelectedDialogCmsgRqstDtlAccBalLess")
    protected double outSelectedDialogCmsgRqstDtlAccBalLess;
    @XmlElement(name = "OutSelectedDialogCmsgRqstDtlAccBalSet")
    protected String outSelectedDialogCmsgRqstDtlAccBalSet;
    @XmlElement(name = "OutSelectedDialogCmsgRqstDtlAccountNumber")
    protected String outSelectedDialogCmsgRqstDtlAccountNumber;
    @XmlElement(name = "OutSelectedDialogCmsgRqstDtlAccountSystem")
    protected short outSelectedDialogCmsgRqstDtlAccountSystem;
    @XmlElement(name = "OutSelectedDialogCmsgRqstDtlAccountsAll")
    protected String outSelectedDialogCmsgRqstDtlAccountsAll;
    @XmlElement(name = "OutSelectedDialogCmsgRqstDtlChannelId")
    protected int outSelectedDialogCmsgRqstDtlChannelId;
    @XmlElement(name = "OutSelectedDialogCmsgRqstDtlChannelsAll")
    protected String outSelectedDialogCmsgRqstDtlChannelsAll;
    @XmlElement(name = "OutSelectedDialogCmsgRqstDtlCmsgRqstDtlSn")
    protected int outSelectedDialogCmsgRqstDtlCmsgRqstDtlSn;
    @XmlElement(name = "OutSelectedDialogCmsgRqstDtlCmsgRqstDtlSts")
    protected String outSelectedDialogCmsgRqstDtlCmsgRqstDtlSts;
    @XmlElement(name = "OutSelectedDialogCmsgRqstDtlEmailMain")
    protected String outSelectedDialogCmsgRqstDtlEmailMain;
    @XmlElement(name = "OutSelectedDialogCmsgRqstDtlEmailOther")
    protected String outSelectedDialogCmsgRqstDtlEmailOther;
    @XmlElement(name = "OutSelectedDialogCmsgRqstDtlEmailSend")
    protected String outSelectedDialogCmsgRqstDtlEmailSend;
    @XmlElement(name = "OutSelectedDialogCmsgRqstDtlEmailStatus")
    protected String outSelectedDialogCmsgRqstDtlEmailStatus;
    @XmlElement(name = "OutSelectedDialogCmsgRqstDtlEmailsTotals")
    protected int outSelectedDialogCmsgRqstDtlEmailsTotals;
    @XmlElement(name = "OutSelectedDialogCmsgRqstDtlInsertDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outSelectedDialogCmsgRqstDtlInsertDt;
    @XmlElement(name = "OutSelectedDialogCmsgRqstDtlInsertTmstamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outSelectedDialogCmsgRqstDtlInsertTmstamp;
    @XmlElement(name = "OutSelectedDialogCmsgRqstDtlInsertUnit")
    protected int outSelectedDialogCmsgRqstDtlInsertUnit;
    @XmlElement(name = "OutSelectedDialogCmsgRqstDtlInsertUser")
    protected String outSelectedDialogCmsgRqstDtlInsertUser;
    @XmlElement(name = "OutSelectedDialogCmsgRqstDtlJustificationAll")
    protected String outSelectedDialogCmsgRqstDtlJustificationAll;
    @XmlElement(name = "OutSelectedDialogCmsgRqstDtlJustificationId")
    protected int outSelectedDialogCmsgRqstDtlJustificationId;
    @XmlElement(name = "OutSelectedDialogCmsgRqstDtlLastExecutionDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outSelectedDialogCmsgRqstDtlLastExecutionDate;
    @XmlElement(name = "OutSelectedDialogCmsgRqstDtlLastExecutionStamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outSelectedDialogCmsgRqstDtlLastExecutionStamp;
    @XmlElement(name = "OutSelectedDialogCmsgRqstDtlMessageComments")
    protected String outSelectedDialogCmsgRqstDtlMessageComments;
    @XmlElement(name = "OutSelectedDialogCmsgRqstDtlProductAll")
    protected String outSelectedDialogCmsgRqstDtlProductAll;
    @XmlElement(name = "OutSelectedDialogCmsgRqstDtlProductId")
    protected int outSelectedDialogCmsgRqstDtlProductId;
    @XmlElement(name = "OutSelectedDialogCmsgRqstDtlSmsMain")
    protected String outSelectedDialogCmsgRqstDtlSmsMain;
    @XmlElement(name = "OutSelectedDialogCmsgRqstDtlSmsOther")
    protected String outSelectedDialogCmsgRqstDtlSmsOther;
    @XmlElement(name = "OutSelectedDialogCmsgRqstDtlSmsSend")
    protected String outSelectedDialogCmsgRqstDtlSmsSend;
    @XmlElement(name = "OutSelectedDialogCmsgRqstDtlSmsStatus")
    protected String outSelectedDialogCmsgRqstDtlSmsStatus;
    @XmlElement(name = "OutSelectedDialogCmsgRqstDtlSmsTotals")
    protected int outSelectedDialogCmsgRqstDtlSmsTotals;
    @XmlElement(name = "OutSelectedDialogCmsgRqstDtlSpecificTimeEnd", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outSelectedDialogCmsgRqstDtlSpecificTimeEnd;
    @XmlElement(name = "OutSelectedDialogCmsgRqstDtlSpecificTimeFlg")
    protected String outSelectedDialogCmsgRqstDtlSpecificTimeFlg;
    @XmlElement(name = "OutSelectedDialogCmsgRqstDtlSpecificTimeStart", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outSelectedDialogCmsgRqstDtlSpecificTimeStart;
    @XmlElement(name = "OutSelectedDialogCmsgRqstDtlTransactionAll")
    protected String outSelectedDialogCmsgRqstDtlTransactionAll;
    @XmlElement(name = "OutSelectedDialogCmsgRqstDtlTransactionId")
    protected int outSelectedDialogCmsgRqstDtlTransactionId;
    @XmlElement(name = "OutSelectedDialogCmsgRqstDtlTrxAmountGreater")
    protected double outSelectedDialogCmsgRqstDtlTrxAmountGreater;
    @XmlElement(name = "OutSelectedDialogCmsgRqstDtlTrxAmountLess")
    protected double outSelectedDialogCmsgRqstDtlTrxAmountLess;
    @XmlElement(name = "OutSelectedDialogCmsgRqstDtlTrxAmountSet")
    protected String outSelectedDialogCmsgRqstDtlTrxAmountSet;
    @XmlElement(name = "OutSelectedDialogCmsgRqstDtlUpdateDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outSelectedDialogCmsgRqstDtlUpdateDt;
    @XmlElement(name = "OutSelectedDialogCmsgRqstDtlUpdateTmstamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outSelectedDialogCmsgRqstDtlUpdateTmstamp;
    @XmlElement(name = "OutSelectedDialogCmsgRqstDtlUpdateUnit")
    protected int outSelectedDialogCmsgRqstDtlUpdateUnit;
    @XmlElement(name = "OutSelectedDialogCmsgRqstDtlUpdateUser")
    protected String outSelectedDialogCmsgRqstDtlUpdateUser;
    @XmlElement(name = "OutSelectedDialogDistrChannelDescription")
    protected String outSelectedDialogDistrChannelDescription;
    @XmlElement(name = "OutSelectedDialogDistrChannelIdChannel")
    protected int outSelectedDialogDistrChannelIdChannel;
    @XmlElement(name = "OutSelectedDialogInsertListSetDescription")
    protected String outSelectedDialogInsertListSetDescription;
    @XmlElement(name = "OutSelectedDialogInsertUnitCode")
    protected int outSelectedDialogInsertUnitCode;
    @XmlElement(name = "OutSelectedDialogInsertUnitUnitName")
    protected String outSelectedDialogInsertUnitUnitName;
    @XmlElement(name = "OutSelectedDialogJustificDescription")
    protected String outSelectedDialogJustificDescription;
    @XmlElement(name = "OutSelectedDialogJustificIdJustific")
    protected int outSelectedDialogJustificIdJustific;
    @XmlElement(name = "OutSelectedDialogMessageProfitsAccountAccountCd")
    protected short outSelectedDialogMessageProfitsAccountAccountCd;
    @XmlElement(name = "OutSelectedDialogMessageProfitsAccountAccountNumber")
    protected String outSelectedDialogMessageProfitsAccountAccountNumber;
    @XmlElement(name = "OutSelectedDialogMessageProfitsAccountPrftSystem")
    protected short outSelectedDialogMessageProfitsAccountPrftSystem;
    @XmlElement(name = "OutSelectedDialogPrftTransactionDescription")
    protected String outSelectedDialogPrftTransactionDescription;
    @XmlElement(name = "OutSelectedDialogPrftTransactionIdTransact")
    protected int outSelectedDialogPrftTransactionIdTransact;
    @XmlElement(name = "OutSelectedDialogProductDescription")
    protected String outSelectedDialogProductDescription;
    @XmlElement(name = "OutSelectedDialogProductIdProduct")
    protected int outSelectedDialogProductIdProduct;
    @XmlElement(name = "OutSelectedDialogUpdateListSetDescription")
    protected String outSelectedDialogUpdateListSetDescription;
    @XmlElement(name = "OutSelectedDialogUpdateUnitCode")
    protected int outSelectedDialogUpdateUnitCode;
    @XmlElement(name = "OutSelectedDialogUpdateUnitUnitName")
    protected String outSelectedDialogUpdateUnitUnitName;
    @XmlElement(name = "OutSelectedHdrInsertListSetDescription")
    protected String outSelectedHdrInsertListSetDescription;
    @XmlElement(name = "OutSelectedHdrInsertUnitUnitName")
    protected String outSelectedHdrInsertUnitUnitName;
    @XmlElement(name = "OutSelectedHdrUpdateListSetDescription")
    protected String outSelectedHdrUpdateListSetDescription;
    @XmlElement(name = "OutSelectedHdrUpdateUnitUnitName")
    protected String outSelectedHdrUpdateUnitUnitName;
    @XmlElement(name = "OutSelectedServiceProfitsAccountAccStatus")
    protected String outSelectedServiceProfitsAccountAccStatus;
    @XmlElement(name = "OutSelectedServiceProfitsAccountAccountCd")
    protected short outSelectedServiceProfitsAccountAccountCd;
    @XmlElement(name = "OutSelectedServiceProfitsAccountAccountNumber")
    protected String outSelectedServiceProfitsAccountAccountNumber;
    @XmlElement(name = "OutSelectedServiceProfitsAccountAccountSerNum")
    protected double outSelectedServiceProfitsAccountAccountSerNum;
    @XmlElement(name = "OutSelectedServiceProfitsAccountAgrMembershipSn")
    protected int outSelectedServiceProfitsAccountAgrMembershipSn;
    @XmlElement(name = "OutSelectedServiceProfitsAccountAgrSn")
    protected int outSelectedServiceProfitsAccountAgrSn;
    @XmlElement(name = "OutSelectedServiceProfitsAccountAgrUnit")
    protected int outSelectedServiceProfitsAccountAgrUnit;
    @XmlElement(name = "OutSelectedServiceProfitsAccountAgrYear")
    protected short outSelectedServiceProfitsAccountAgrYear;
    @XmlElement(name = "OutSelectedServiceProfitsAccountCDigit")
    protected short outSelectedServiceProfitsAccountCDigit;
    @XmlElement(name = "OutSelectedServiceProfitsAccountCustId")
    protected int outSelectedServiceProfitsAccountCustId;
    @XmlElement(name = "OutSelectedServiceProfitsAccountDepAccNumber")
    protected double outSelectedServiceProfitsAccountDepAccNumber;
    @XmlElement(name = "OutSelectedServiceProfitsAccountDepOpenUnit")
    protected int outSelectedServiceProfitsAccountDepOpenUnit;
    @XmlElement(name = "OutSelectedServiceProfitsAccountIdPackage")
    protected int outSelectedServiceProfitsAccountIdPackage;
    @XmlElement(name = "OutSelectedServiceProfitsAccountLgAccSn")
    protected double outSelectedServiceProfitsAccountLgAccSn;
    @XmlElement(name = "OutSelectedServiceProfitsAccountLgOpenUnit")
    protected int outSelectedServiceProfitsAccountLgOpenUnit;
    @XmlElement(name = "OutSelectedServiceProfitsAccountLimitCurrency")
    protected int outSelectedServiceProfitsAccountLimitCurrency;
    @XmlElement(name = "OutSelectedServiceProfitsAccountLnsOpenUnit")
    protected int outSelectedServiceProfitsAccountLnsOpenUnit;
    @XmlElement(name = "OutSelectedServiceProfitsAccountLnsSn")
    protected int outSelectedServiceProfitsAccountLnsSn;
    @XmlElement(name = "OutSelectedServiceProfitsAccountLnsType")
    protected short outSelectedServiceProfitsAccountLnsType;
    @XmlElement(name = "OutSelectedServiceProfitsAccountMonotoringUnit")
    protected int outSelectedServiceProfitsAccountMonotoringUnit;
    @XmlElement(name = "OutSelectedServiceProfitsAccountMovementCurrency")
    protected int outSelectedServiceProfitsAccountMovementCurrency;
    @XmlElement(name = "OutSelectedServiceProfitsAccountPrftSystem")
    protected short outSelectedServiceProfitsAccountPrftSystem;
    @XmlElement(name = "OutSelectedServiceProfitsAccountProductId")
    protected int outSelectedServiceProfitsAccountProductId;
    @XmlElement(name = "OutSelectedServiceProfitsAccountTrOpenUnit")
    protected int outSelectedServiceProfitsAccountTrOpenUnit;
    @XmlElement(name = "OutSelectedServiceProfitsAccountTrSn")
    protected int outSelectedServiceProfitsAccountTrSn;
    @XmlElement(name = "OutSelectedServiceProfitsAccountTrType")
    protected short outSelectedServiceProfitsAccountTrType;
    @XmlElement(name = "OutGrpLog")
    protected ArrayOfCIA0008VOutGrpLogItem outGrpLog;
    @XmlElement(name = "OutGrpRequests")
    protected ArrayOfCIA0008VOutGrpRequestsItem outGrpRequests;

    /**
     * Gets the value of the outContinueCmsgRqstDtlCmsgRqstDtlSn property.
     * 
     */
    public int getOutContinueCmsgRqstDtlCmsgRqstDtlSn() {
        return outContinueCmsgRqstDtlCmsgRqstDtlSn;
    }

    /**
     * Sets the value of the outContinueCmsgRqstDtlCmsgRqstDtlSn property.
     * 
     */
    public void setOutContinueCmsgRqstDtlCmsgRqstDtlSn(int value) {
        this.outContinueCmsgRqstDtlCmsgRqstDtlSn = value;
    }

    /**
     * Gets the value of the outSelectedCmsgRqstHdrCmsgRqstHdrSn property.
     * 
     */
    public int getOutSelectedCmsgRqstHdrCmsgRqstHdrSn() {
        return outSelectedCmsgRqstHdrCmsgRqstHdrSn;
    }

    /**
     * Sets the value of the outSelectedCmsgRqstHdrCmsgRqstHdrSn property.
     * 
     */
    public void setOutSelectedCmsgRqstHdrCmsgRqstHdrSn(int value) {
        this.outSelectedCmsgRqstHdrCmsgRqstHdrSn = value;
    }

    /**
     * Gets the value of the outSelectedCmsgRqstHdrCustomerComments property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSelectedCmsgRqstHdrCustomerComments() {
        return outSelectedCmsgRqstHdrCustomerComments;
    }

    /**
     * Sets the value of the outSelectedCmsgRqstHdrCustomerComments property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSelectedCmsgRqstHdrCustomerComments(String value) {
        this.outSelectedCmsgRqstHdrCustomerComments = value;
    }

    /**
     * Gets the value of the outSelectedCmsgRqstHdrEmailTotals property.
     * 
     */
    public int getOutSelectedCmsgRqstHdrEmailTotals() {
        return outSelectedCmsgRqstHdrEmailTotals;
    }

    /**
     * Sets the value of the outSelectedCmsgRqstHdrEmailTotals property.
     * 
     */
    public void setOutSelectedCmsgRqstHdrEmailTotals(int value) {
        this.outSelectedCmsgRqstHdrEmailTotals = value;
    }

    /**
     * Gets the value of the outSelectedCmsgRqstHdrEnabledEmails property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSelectedCmsgRqstHdrEnabledEmails() {
        return outSelectedCmsgRqstHdrEnabledEmails;
    }

    /**
     * Sets the value of the outSelectedCmsgRqstHdrEnabledEmails property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSelectedCmsgRqstHdrEnabledEmails(String value) {
        this.outSelectedCmsgRqstHdrEnabledEmails = value;
    }

    /**
     * Gets the value of the outSelectedCmsgRqstHdrEnabledSms property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSelectedCmsgRqstHdrEnabledSms() {
        return outSelectedCmsgRqstHdrEnabledSms;
    }

    /**
     * Sets the value of the outSelectedCmsgRqstHdrEnabledSms property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSelectedCmsgRqstHdrEnabledSms(String value) {
        this.outSelectedCmsgRqstHdrEnabledSms = value;
    }

    /**
     * Gets the value of the outSelectedCmsgRqstHdrInsertDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutSelectedCmsgRqstHdrInsertDt() {
        return outSelectedCmsgRqstHdrInsertDt;
    }

    /**
     * Sets the value of the outSelectedCmsgRqstHdrInsertDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutSelectedCmsgRqstHdrInsertDt(XMLGregorianCalendar value) {
        this.outSelectedCmsgRqstHdrInsertDt = value;
    }

    /**
     * Gets the value of the outSelectedCmsgRqstHdrInsertTmstamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutSelectedCmsgRqstHdrInsertTmstamp() {
        return outSelectedCmsgRqstHdrInsertTmstamp;
    }

    /**
     * Sets the value of the outSelectedCmsgRqstHdrInsertTmstamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutSelectedCmsgRqstHdrInsertTmstamp(XMLGregorianCalendar value) {
        this.outSelectedCmsgRqstHdrInsertTmstamp = value;
    }

    /**
     * Gets the value of the outSelectedCmsgRqstHdrInsertUnit property.
     * 
     */
    public int getOutSelectedCmsgRqstHdrInsertUnit() {
        return outSelectedCmsgRqstHdrInsertUnit;
    }

    /**
     * Sets the value of the outSelectedCmsgRqstHdrInsertUnit property.
     * 
     */
    public void setOutSelectedCmsgRqstHdrInsertUnit(int value) {
        this.outSelectedCmsgRqstHdrInsertUnit = value;
    }

    /**
     * Gets the value of the outSelectedCmsgRqstHdrInsertUser property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSelectedCmsgRqstHdrInsertUser() {
        return outSelectedCmsgRqstHdrInsertUser;
    }

    /**
     * Sets the value of the outSelectedCmsgRqstHdrInsertUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSelectedCmsgRqstHdrInsertUser(String value) {
        this.outSelectedCmsgRqstHdrInsertUser = value;
    }

    /**
     * Gets the value of the outSelectedCmsgRqstHdrLastExecutionDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutSelectedCmsgRqstHdrLastExecutionDate() {
        return outSelectedCmsgRqstHdrLastExecutionDate;
    }

    /**
     * Sets the value of the outSelectedCmsgRqstHdrLastExecutionDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutSelectedCmsgRqstHdrLastExecutionDate(XMLGregorianCalendar value) {
        this.outSelectedCmsgRqstHdrLastExecutionDate = value;
    }

    /**
     * Gets the value of the outSelectedCmsgRqstHdrLastExecutionStamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutSelectedCmsgRqstHdrLastExecutionStamp() {
        return outSelectedCmsgRqstHdrLastExecutionStamp;
    }

    /**
     * Sets the value of the outSelectedCmsgRqstHdrLastExecutionStamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutSelectedCmsgRqstHdrLastExecutionStamp(XMLGregorianCalendar value) {
        this.outSelectedCmsgRqstHdrLastExecutionStamp = value;
    }

    /**
     * Gets the value of the outSelectedCmsgRqstHdrServiceAccount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSelectedCmsgRqstHdrServiceAccount() {
        return outSelectedCmsgRqstHdrServiceAccount;
    }

    /**
     * Sets the value of the outSelectedCmsgRqstHdrServiceAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSelectedCmsgRqstHdrServiceAccount(String value) {
        this.outSelectedCmsgRqstHdrServiceAccount = value;
    }

    /**
     * Gets the value of the outSelectedCmsgRqstHdrServiceSystem property.
     * 
     */
    public short getOutSelectedCmsgRqstHdrServiceSystem() {
        return outSelectedCmsgRqstHdrServiceSystem;
    }

    /**
     * Sets the value of the outSelectedCmsgRqstHdrServiceSystem property.
     * 
     */
    public void setOutSelectedCmsgRqstHdrServiceSystem(short value) {
        this.outSelectedCmsgRqstHdrServiceSystem = value;
    }

    /**
     * Gets the value of the outSelectedCmsgRqstHdrSmsTotals property.
     * 
     */
    public int getOutSelectedCmsgRqstHdrSmsTotals() {
        return outSelectedCmsgRqstHdrSmsTotals;
    }

    /**
     * Sets the value of the outSelectedCmsgRqstHdrSmsTotals property.
     * 
     */
    public void setOutSelectedCmsgRqstHdrSmsTotals(int value) {
        this.outSelectedCmsgRqstHdrSmsTotals = value;
    }

    /**
     * Gets the value of the outSelectedCmsgRqstHdrUpdateDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutSelectedCmsgRqstHdrUpdateDt() {
        return outSelectedCmsgRqstHdrUpdateDt;
    }

    /**
     * Sets the value of the outSelectedCmsgRqstHdrUpdateDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutSelectedCmsgRqstHdrUpdateDt(XMLGregorianCalendar value) {
        this.outSelectedCmsgRqstHdrUpdateDt = value;
    }

    /**
     * Gets the value of the outSelectedCmsgRqstHdrUpdateTmstamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutSelectedCmsgRqstHdrUpdateTmstamp() {
        return outSelectedCmsgRqstHdrUpdateTmstamp;
    }

    /**
     * Sets the value of the outSelectedCmsgRqstHdrUpdateTmstamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutSelectedCmsgRqstHdrUpdateTmstamp(XMLGregorianCalendar value) {
        this.outSelectedCmsgRqstHdrUpdateTmstamp = value;
    }

    /**
     * Gets the value of the outSelectedCmsgRqstHdrUpdateUnit property.
     * 
     */
    public int getOutSelectedCmsgRqstHdrUpdateUnit() {
        return outSelectedCmsgRqstHdrUpdateUnit;
    }

    /**
     * Sets the value of the outSelectedCmsgRqstHdrUpdateUnit property.
     * 
     */
    public void setOutSelectedCmsgRqstHdrUpdateUnit(int value) {
        this.outSelectedCmsgRqstHdrUpdateUnit = value;
    }

    /**
     * Gets the value of the outSelectedCmsgRqstHdrUpdateUser property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSelectedCmsgRqstHdrUpdateUser() {
        return outSelectedCmsgRqstHdrUpdateUser;
    }

    /**
     * Sets the value of the outSelectedCmsgRqstHdrUpdateUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSelectedCmsgRqstHdrUpdateUser(String value) {
        this.outSelectedCmsgRqstHdrUpdateUser = value;
    }

    /**
     * Gets the value of the outSelectedCustomerCDigit property.
     * 
     */
    public short getOutSelectedCustomerCDigit() {
        return outSelectedCustomerCDigit;
    }

    /**
     * Sets the value of the outSelectedCustomerCDigit property.
     * 
     */
    public void setOutSelectedCustomerCDigit(short value) {
        this.outSelectedCustomerCDigit = value;
    }

    /**
     * Gets the value of the outSelectedCustomerCustId property.
     * 
     */
    public int getOutSelectedCustomerCustId() {
        return outSelectedCustomerCustId;
    }

    /**
     * Sets the value of the outSelectedCustomerCustId property.
     * 
     */
    public void setOutSelectedCustomerCustId(int value) {
        this.outSelectedCustomerCustId = value;
    }

    /**
     * Gets the value of the outSelectedCustomerEMail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSelectedCustomerEMail() {
        return outSelectedCustomerEMail;
    }

    /**
     * Sets the value of the outSelectedCustomerEMail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSelectedCustomerEMail(String value) {
        this.outSelectedCustomerEMail = value;
    }

    /**
     * Gets the value of the outSelectedCustomerFirstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSelectedCustomerFirstName() {
        return outSelectedCustomerFirstName;
    }

    /**
     * Sets the value of the outSelectedCustomerFirstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSelectedCustomerFirstName(String value) {
        this.outSelectedCustomerFirstName = value;
    }

    /**
     * Gets the value of the outSelectedCustomerMobileTel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSelectedCustomerMobileTel() {
        return outSelectedCustomerMobileTel;
    }

    /**
     * Sets the value of the outSelectedCustomerMobileTel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSelectedCustomerMobileTel(String value) {
        this.outSelectedCustomerMobileTel = value;
    }

    /**
     * Gets the value of the outSelectedCustomerSurname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSelectedCustomerSurname() {
        return outSelectedCustomerSurname;
    }

    /**
     * Sets the value of the outSelectedCustomerSurname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSelectedCustomerSurname(String value) {
        this.outSelectedCustomerSurname = value;
    }

    /**
     * Gets the value of the outSelectedDialogCmsgRqstDtlAccBalGreater property.
     * 
     */
    public double getOutSelectedDialogCmsgRqstDtlAccBalGreater() {
        return outSelectedDialogCmsgRqstDtlAccBalGreater;
    }

    /**
     * Sets the value of the outSelectedDialogCmsgRqstDtlAccBalGreater property.
     * 
     */
    public void setOutSelectedDialogCmsgRqstDtlAccBalGreater(double value) {
        this.outSelectedDialogCmsgRqstDtlAccBalGreater = value;
    }

    /**
     * Gets the value of the outSelectedDialogCmsgRqstDtlAccBalLess property.
     * 
     */
    public double getOutSelectedDialogCmsgRqstDtlAccBalLess() {
        return outSelectedDialogCmsgRqstDtlAccBalLess;
    }

    /**
     * Sets the value of the outSelectedDialogCmsgRqstDtlAccBalLess property.
     * 
     */
    public void setOutSelectedDialogCmsgRqstDtlAccBalLess(double value) {
        this.outSelectedDialogCmsgRqstDtlAccBalLess = value;
    }

    /**
     * Gets the value of the outSelectedDialogCmsgRqstDtlAccBalSet property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSelectedDialogCmsgRqstDtlAccBalSet() {
        return outSelectedDialogCmsgRqstDtlAccBalSet;
    }

    /**
     * Sets the value of the outSelectedDialogCmsgRqstDtlAccBalSet property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSelectedDialogCmsgRqstDtlAccBalSet(String value) {
        this.outSelectedDialogCmsgRqstDtlAccBalSet = value;
    }

    /**
     * Gets the value of the outSelectedDialogCmsgRqstDtlAccountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSelectedDialogCmsgRqstDtlAccountNumber() {
        return outSelectedDialogCmsgRqstDtlAccountNumber;
    }

    /**
     * Sets the value of the outSelectedDialogCmsgRqstDtlAccountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSelectedDialogCmsgRqstDtlAccountNumber(String value) {
        this.outSelectedDialogCmsgRqstDtlAccountNumber = value;
    }

    /**
     * Gets the value of the outSelectedDialogCmsgRqstDtlAccountSystem property.
     * 
     */
    public short getOutSelectedDialogCmsgRqstDtlAccountSystem() {
        return outSelectedDialogCmsgRqstDtlAccountSystem;
    }

    /**
     * Sets the value of the outSelectedDialogCmsgRqstDtlAccountSystem property.
     * 
     */
    public void setOutSelectedDialogCmsgRqstDtlAccountSystem(short value) {
        this.outSelectedDialogCmsgRqstDtlAccountSystem = value;
    }

    /**
     * Gets the value of the outSelectedDialogCmsgRqstDtlAccountsAll property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSelectedDialogCmsgRqstDtlAccountsAll() {
        return outSelectedDialogCmsgRqstDtlAccountsAll;
    }

    /**
     * Sets the value of the outSelectedDialogCmsgRqstDtlAccountsAll property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSelectedDialogCmsgRqstDtlAccountsAll(String value) {
        this.outSelectedDialogCmsgRqstDtlAccountsAll = value;
    }

    /**
     * Gets the value of the outSelectedDialogCmsgRqstDtlChannelId property.
     * 
     */
    public int getOutSelectedDialogCmsgRqstDtlChannelId() {
        return outSelectedDialogCmsgRqstDtlChannelId;
    }

    /**
     * Sets the value of the outSelectedDialogCmsgRqstDtlChannelId property.
     * 
     */
    public void setOutSelectedDialogCmsgRqstDtlChannelId(int value) {
        this.outSelectedDialogCmsgRqstDtlChannelId = value;
    }

    /**
     * Gets the value of the outSelectedDialogCmsgRqstDtlChannelsAll property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSelectedDialogCmsgRqstDtlChannelsAll() {
        return outSelectedDialogCmsgRqstDtlChannelsAll;
    }

    /**
     * Sets the value of the outSelectedDialogCmsgRqstDtlChannelsAll property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSelectedDialogCmsgRqstDtlChannelsAll(String value) {
        this.outSelectedDialogCmsgRqstDtlChannelsAll = value;
    }

    /**
     * Gets the value of the outSelectedDialogCmsgRqstDtlCmsgRqstDtlSn property.
     * 
     */
    public int getOutSelectedDialogCmsgRqstDtlCmsgRqstDtlSn() {
        return outSelectedDialogCmsgRqstDtlCmsgRqstDtlSn;
    }

    /**
     * Sets the value of the outSelectedDialogCmsgRqstDtlCmsgRqstDtlSn property.
     * 
     */
    public void setOutSelectedDialogCmsgRqstDtlCmsgRqstDtlSn(int value) {
        this.outSelectedDialogCmsgRqstDtlCmsgRqstDtlSn = value;
    }

    /**
     * Gets the value of the outSelectedDialogCmsgRqstDtlCmsgRqstDtlSts property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSelectedDialogCmsgRqstDtlCmsgRqstDtlSts() {
        return outSelectedDialogCmsgRqstDtlCmsgRqstDtlSts;
    }

    /**
     * Sets the value of the outSelectedDialogCmsgRqstDtlCmsgRqstDtlSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSelectedDialogCmsgRqstDtlCmsgRqstDtlSts(String value) {
        this.outSelectedDialogCmsgRqstDtlCmsgRqstDtlSts = value;
    }

    /**
     * Gets the value of the outSelectedDialogCmsgRqstDtlEmailMain property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSelectedDialogCmsgRqstDtlEmailMain() {
        return outSelectedDialogCmsgRqstDtlEmailMain;
    }

    /**
     * Sets the value of the outSelectedDialogCmsgRqstDtlEmailMain property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSelectedDialogCmsgRqstDtlEmailMain(String value) {
        this.outSelectedDialogCmsgRqstDtlEmailMain = value;
    }

    /**
     * Gets the value of the outSelectedDialogCmsgRqstDtlEmailOther property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSelectedDialogCmsgRqstDtlEmailOther() {
        return outSelectedDialogCmsgRqstDtlEmailOther;
    }

    /**
     * Sets the value of the outSelectedDialogCmsgRqstDtlEmailOther property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSelectedDialogCmsgRqstDtlEmailOther(String value) {
        this.outSelectedDialogCmsgRqstDtlEmailOther = value;
    }

    /**
     * Gets the value of the outSelectedDialogCmsgRqstDtlEmailSend property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSelectedDialogCmsgRqstDtlEmailSend() {
        return outSelectedDialogCmsgRqstDtlEmailSend;
    }

    /**
     * Sets the value of the outSelectedDialogCmsgRqstDtlEmailSend property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSelectedDialogCmsgRqstDtlEmailSend(String value) {
        this.outSelectedDialogCmsgRqstDtlEmailSend = value;
    }

    /**
     * Gets the value of the outSelectedDialogCmsgRqstDtlEmailStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSelectedDialogCmsgRqstDtlEmailStatus() {
        return outSelectedDialogCmsgRqstDtlEmailStatus;
    }

    /**
     * Sets the value of the outSelectedDialogCmsgRqstDtlEmailStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSelectedDialogCmsgRqstDtlEmailStatus(String value) {
        this.outSelectedDialogCmsgRqstDtlEmailStatus = value;
    }

    /**
     * Gets the value of the outSelectedDialogCmsgRqstDtlEmailsTotals property.
     * 
     */
    public int getOutSelectedDialogCmsgRqstDtlEmailsTotals() {
        return outSelectedDialogCmsgRqstDtlEmailsTotals;
    }

    /**
     * Sets the value of the outSelectedDialogCmsgRqstDtlEmailsTotals property.
     * 
     */
    public void setOutSelectedDialogCmsgRqstDtlEmailsTotals(int value) {
        this.outSelectedDialogCmsgRqstDtlEmailsTotals = value;
    }

    /**
     * Gets the value of the outSelectedDialogCmsgRqstDtlInsertDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutSelectedDialogCmsgRqstDtlInsertDt() {
        return outSelectedDialogCmsgRqstDtlInsertDt;
    }

    /**
     * Sets the value of the outSelectedDialogCmsgRqstDtlInsertDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutSelectedDialogCmsgRqstDtlInsertDt(XMLGregorianCalendar value) {
        this.outSelectedDialogCmsgRqstDtlInsertDt = value;
    }

    /**
     * Gets the value of the outSelectedDialogCmsgRqstDtlInsertTmstamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutSelectedDialogCmsgRqstDtlInsertTmstamp() {
        return outSelectedDialogCmsgRqstDtlInsertTmstamp;
    }

    /**
     * Sets the value of the outSelectedDialogCmsgRqstDtlInsertTmstamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutSelectedDialogCmsgRqstDtlInsertTmstamp(XMLGregorianCalendar value) {
        this.outSelectedDialogCmsgRqstDtlInsertTmstamp = value;
    }

    /**
     * Gets the value of the outSelectedDialogCmsgRqstDtlInsertUnit property.
     * 
     */
    public int getOutSelectedDialogCmsgRqstDtlInsertUnit() {
        return outSelectedDialogCmsgRqstDtlInsertUnit;
    }

    /**
     * Sets the value of the outSelectedDialogCmsgRqstDtlInsertUnit property.
     * 
     */
    public void setOutSelectedDialogCmsgRqstDtlInsertUnit(int value) {
        this.outSelectedDialogCmsgRqstDtlInsertUnit = value;
    }

    /**
     * Gets the value of the outSelectedDialogCmsgRqstDtlInsertUser property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSelectedDialogCmsgRqstDtlInsertUser() {
        return outSelectedDialogCmsgRqstDtlInsertUser;
    }

    /**
     * Sets the value of the outSelectedDialogCmsgRqstDtlInsertUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSelectedDialogCmsgRqstDtlInsertUser(String value) {
        this.outSelectedDialogCmsgRqstDtlInsertUser = value;
    }

    /**
     * Gets the value of the outSelectedDialogCmsgRqstDtlJustificationAll property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSelectedDialogCmsgRqstDtlJustificationAll() {
        return outSelectedDialogCmsgRqstDtlJustificationAll;
    }

    /**
     * Sets the value of the outSelectedDialogCmsgRqstDtlJustificationAll property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSelectedDialogCmsgRqstDtlJustificationAll(String value) {
        this.outSelectedDialogCmsgRqstDtlJustificationAll = value;
    }

    /**
     * Gets the value of the outSelectedDialogCmsgRqstDtlJustificationId property.
     * 
     */
    public int getOutSelectedDialogCmsgRqstDtlJustificationId() {
        return outSelectedDialogCmsgRqstDtlJustificationId;
    }

    /**
     * Sets the value of the outSelectedDialogCmsgRqstDtlJustificationId property.
     * 
     */
    public void setOutSelectedDialogCmsgRqstDtlJustificationId(int value) {
        this.outSelectedDialogCmsgRqstDtlJustificationId = value;
    }

    /**
     * Gets the value of the outSelectedDialogCmsgRqstDtlLastExecutionDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutSelectedDialogCmsgRqstDtlLastExecutionDate() {
        return outSelectedDialogCmsgRqstDtlLastExecutionDate;
    }

    /**
     * Sets the value of the outSelectedDialogCmsgRqstDtlLastExecutionDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutSelectedDialogCmsgRqstDtlLastExecutionDate(XMLGregorianCalendar value) {
        this.outSelectedDialogCmsgRqstDtlLastExecutionDate = value;
    }

    /**
     * Gets the value of the outSelectedDialogCmsgRqstDtlLastExecutionStamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutSelectedDialogCmsgRqstDtlLastExecutionStamp() {
        return outSelectedDialogCmsgRqstDtlLastExecutionStamp;
    }

    /**
     * Sets the value of the outSelectedDialogCmsgRqstDtlLastExecutionStamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutSelectedDialogCmsgRqstDtlLastExecutionStamp(XMLGregorianCalendar value) {
        this.outSelectedDialogCmsgRqstDtlLastExecutionStamp = value;
    }

    /**
     * Gets the value of the outSelectedDialogCmsgRqstDtlMessageComments property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSelectedDialogCmsgRqstDtlMessageComments() {
        return outSelectedDialogCmsgRqstDtlMessageComments;
    }

    /**
     * Sets the value of the outSelectedDialogCmsgRqstDtlMessageComments property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSelectedDialogCmsgRqstDtlMessageComments(String value) {
        this.outSelectedDialogCmsgRqstDtlMessageComments = value;
    }

    /**
     * Gets the value of the outSelectedDialogCmsgRqstDtlProductAll property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSelectedDialogCmsgRqstDtlProductAll() {
        return outSelectedDialogCmsgRqstDtlProductAll;
    }

    /**
     * Sets the value of the outSelectedDialogCmsgRqstDtlProductAll property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSelectedDialogCmsgRqstDtlProductAll(String value) {
        this.outSelectedDialogCmsgRqstDtlProductAll = value;
    }

    /**
     * Gets the value of the outSelectedDialogCmsgRqstDtlProductId property.
     * 
     */
    public int getOutSelectedDialogCmsgRqstDtlProductId() {
        return outSelectedDialogCmsgRqstDtlProductId;
    }

    /**
     * Sets the value of the outSelectedDialogCmsgRqstDtlProductId property.
     * 
     */
    public void setOutSelectedDialogCmsgRqstDtlProductId(int value) {
        this.outSelectedDialogCmsgRqstDtlProductId = value;
    }

    /**
     * Gets the value of the outSelectedDialogCmsgRqstDtlSmsMain property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSelectedDialogCmsgRqstDtlSmsMain() {
        return outSelectedDialogCmsgRqstDtlSmsMain;
    }

    /**
     * Sets the value of the outSelectedDialogCmsgRqstDtlSmsMain property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSelectedDialogCmsgRqstDtlSmsMain(String value) {
        this.outSelectedDialogCmsgRqstDtlSmsMain = value;
    }

    /**
     * Gets the value of the outSelectedDialogCmsgRqstDtlSmsOther property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSelectedDialogCmsgRqstDtlSmsOther() {
        return outSelectedDialogCmsgRqstDtlSmsOther;
    }

    /**
     * Sets the value of the outSelectedDialogCmsgRqstDtlSmsOther property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSelectedDialogCmsgRqstDtlSmsOther(String value) {
        this.outSelectedDialogCmsgRqstDtlSmsOther = value;
    }

    /**
     * Gets the value of the outSelectedDialogCmsgRqstDtlSmsSend property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSelectedDialogCmsgRqstDtlSmsSend() {
        return outSelectedDialogCmsgRqstDtlSmsSend;
    }

    /**
     * Sets the value of the outSelectedDialogCmsgRqstDtlSmsSend property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSelectedDialogCmsgRqstDtlSmsSend(String value) {
        this.outSelectedDialogCmsgRqstDtlSmsSend = value;
    }

    /**
     * Gets the value of the outSelectedDialogCmsgRqstDtlSmsStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSelectedDialogCmsgRqstDtlSmsStatus() {
        return outSelectedDialogCmsgRqstDtlSmsStatus;
    }

    /**
     * Sets the value of the outSelectedDialogCmsgRqstDtlSmsStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSelectedDialogCmsgRqstDtlSmsStatus(String value) {
        this.outSelectedDialogCmsgRqstDtlSmsStatus = value;
    }

    /**
     * Gets the value of the outSelectedDialogCmsgRqstDtlSmsTotals property.
     * 
     */
    public int getOutSelectedDialogCmsgRqstDtlSmsTotals() {
        return outSelectedDialogCmsgRqstDtlSmsTotals;
    }

    /**
     * Sets the value of the outSelectedDialogCmsgRqstDtlSmsTotals property.
     * 
     */
    public void setOutSelectedDialogCmsgRqstDtlSmsTotals(int value) {
        this.outSelectedDialogCmsgRqstDtlSmsTotals = value;
    }

    /**
     * Gets the value of the outSelectedDialogCmsgRqstDtlSpecificTimeEnd property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutSelectedDialogCmsgRqstDtlSpecificTimeEnd() {
        return outSelectedDialogCmsgRqstDtlSpecificTimeEnd;
    }

    /**
     * Sets the value of the outSelectedDialogCmsgRqstDtlSpecificTimeEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutSelectedDialogCmsgRqstDtlSpecificTimeEnd(XMLGregorianCalendar value) {
        this.outSelectedDialogCmsgRqstDtlSpecificTimeEnd = value;
    }

    /**
     * Gets the value of the outSelectedDialogCmsgRqstDtlSpecificTimeFlg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSelectedDialogCmsgRqstDtlSpecificTimeFlg() {
        return outSelectedDialogCmsgRqstDtlSpecificTimeFlg;
    }

    /**
     * Sets the value of the outSelectedDialogCmsgRqstDtlSpecificTimeFlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSelectedDialogCmsgRqstDtlSpecificTimeFlg(String value) {
        this.outSelectedDialogCmsgRqstDtlSpecificTimeFlg = value;
    }

    /**
     * Gets the value of the outSelectedDialogCmsgRqstDtlSpecificTimeStart property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutSelectedDialogCmsgRqstDtlSpecificTimeStart() {
        return outSelectedDialogCmsgRqstDtlSpecificTimeStart;
    }

    /**
     * Sets the value of the outSelectedDialogCmsgRqstDtlSpecificTimeStart property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutSelectedDialogCmsgRqstDtlSpecificTimeStart(XMLGregorianCalendar value) {
        this.outSelectedDialogCmsgRqstDtlSpecificTimeStart = value;
    }

    /**
     * Gets the value of the outSelectedDialogCmsgRqstDtlTransactionAll property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSelectedDialogCmsgRqstDtlTransactionAll() {
        return outSelectedDialogCmsgRqstDtlTransactionAll;
    }

    /**
     * Sets the value of the outSelectedDialogCmsgRqstDtlTransactionAll property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSelectedDialogCmsgRqstDtlTransactionAll(String value) {
        this.outSelectedDialogCmsgRqstDtlTransactionAll = value;
    }

    /**
     * Gets the value of the outSelectedDialogCmsgRqstDtlTransactionId property.
     * 
     */
    public int getOutSelectedDialogCmsgRqstDtlTransactionId() {
        return outSelectedDialogCmsgRqstDtlTransactionId;
    }

    /**
     * Sets the value of the outSelectedDialogCmsgRqstDtlTransactionId property.
     * 
     */
    public void setOutSelectedDialogCmsgRqstDtlTransactionId(int value) {
        this.outSelectedDialogCmsgRqstDtlTransactionId = value;
    }

    /**
     * Gets the value of the outSelectedDialogCmsgRqstDtlTrxAmountGreater property.
     * 
     */
    public double getOutSelectedDialogCmsgRqstDtlTrxAmountGreater() {
        return outSelectedDialogCmsgRqstDtlTrxAmountGreater;
    }

    /**
     * Sets the value of the outSelectedDialogCmsgRqstDtlTrxAmountGreater property.
     * 
     */
    public void setOutSelectedDialogCmsgRqstDtlTrxAmountGreater(double value) {
        this.outSelectedDialogCmsgRqstDtlTrxAmountGreater = value;
    }

    /**
     * Gets the value of the outSelectedDialogCmsgRqstDtlTrxAmountLess property.
     * 
     */
    public double getOutSelectedDialogCmsgRqstDtlTrxAmountLess() {
        return outSelectedDialogCmsgRqstDtlTrxAmountLess;
    }

    /**
     * Sets the value of the outSelectedDialogCmsgRqstDtlTrxAmountLess property.
     * 
     */
    public void setOutSelectedDialogCmsgRqstDtlTrxAmountLess(double value) {
        this.outSelectedDialogCmsgRqstDtlTrxAmountLess = value;
    }

    /**
     * Gets the value of the outSelectedDialogCmsgRqstDtlTrxAmountSet property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSelectedDialogCmsgRqstDtlTrxAmountSet() {
        return outSelectedDialogCmsgRqstDtlTrxAmountSet;
    }

    /**
     * Sets the value of the outSelectedDialogCmsgRqstDtlTrxAmountSet property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSelectedDialogCmsgRqstDtlTrxAmountSet(String value) {
        this.outSelectedDialogCmsgRqstDtlTrxAmountSet = value;
    }

    /**
     * Gets the value of the outSelectedDialogCmsgRqstDtlUpdateDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutSelectedDialogCmsgRqstDtlUpdateDt() {
        return outSelectedDialogCmsgRqstDtlUpdateDt;
    }

    /**
     * Sets the value of the outSelectedDialogCmsgRqstDtlUpdateDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutSelectedDialogCmsgRqstDtlUpdateDt(XMLGregorianCalendar value) {
        this.outSelectedDialogCmsgRqstDtlUpdateDt = value;
    }

    /**
     * Gets the value of the outSelectedDialogCmsgRqstDtlUpdateTmstamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutSelectedDialogCmsgRqstDtlUpdateTmstamp() {
        return outSelectedDialogCmsgRqstDtlUpdateTmstamp;
    }

    /**
     * Sets the value of the outSelectedDialogCmsgRqstDtlUpdateTmstamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutSelectedDialogCmsgRqstDtlUpdateTmstamp(XMLGregorianCalendar value) {
        this.outSelectedDialogCmsgRqstDtlUpdateTmstamp = value;
    }

    /**
     * Gets the value of the outSelectedDialogCmsgRqstDtlUpdateUnit property.
     * 
     */
    public int getOutSelectedDialogCmsgRqstDtlUpdateUnit() {
        return outSelectedDialogCmsgRqstDtlUpdateUnit;
    }

    /**
     * Sets the value of the outSelectedDialogCmsgRqstDtlUpdateUnit property.
     * 
     */
    public void setOutSelectedDialogCmsgRqstDtlUpdateUnit(int value) {
        this.outSelectedDialogCmsgRqstDtlUpdateUnit = value;
    }

    /**
     * Gets the value of the outSelectedDialogCmsgRqstDtlUpdateUser property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSelectedDialogCmsgRqstDtlUpdateUser() {
        return outSelectedDialogCmsgRqstDtlUpdateUser;
    }

    /**
     * Sets the value of the outSelectedDialogCmsgRqstDtlUpdateUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSelectedDialogCmsgRqstDtlUpdateUser(String value) {
        this.outSelectedDialogCmsgRqstDtlUpdateUser = value;
    }

    /**
     * Gets the value of the outSelectedDialogDistrChannelDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSelectedDialogDistrChannelDescription() {
        return outSelectedDialogDistrChannelDescription;
    }

    /**
     * Sets the value of the outSelectedDialogDistrChannelDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSelectedDialogDistrChannelDescription(String value) {
        this.outSelectedDialogDistrChannelDescription = value;
    }

    /**
     * Gets the value of the outSelectedDialogDistrChannelIdChannel property.
     * 
     */
    public int getOutSelectedDialogDistrChannelIdChannel() {
        return outSelectedDialogDistrChannelIdChannel;
    }

    /**
     * Sets the value of the outSelectedDialogDistrChannelIdChannel property.
     * 
     */
    public void setOutSelectedDialogDistrChannelIdChannel(int value) {
        this.outSelectedDialogDistrChannelIdChannel = value;
    }

    /**
     * Gets the value of the outSelectedDialogInsertListSetDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSelectedDialogInsertListSetDescription() {
        return outSelectedDialogInsertListSetDescription;
    }

    /**
     * Sets the value of the outSelectedDialogInsertListSetDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSelectedDialogInsertListSetDescription(String value) {
        this.outSelectedDialogInsertListSetDescription = value;
    }

    /**
     * Gets the value of the outSelectedDialogInsertUnitCode property.
     * 
     */
    public int getOutSelectedDialogInsertUnitCode() {
        return outSelectedDialogInsertUnitCode;
    }

    /**
     * Sets the value of the outSelectedDialogInsertUnitCode property.
     * 
     */
    public void setOutSelectedDialogInsertUnitCode(int value) {
        this.outSelectedDialogInsertUnitCode = value;
    }

    /**
     * Gets the value of the outSelectedDialogInsertUnitUnitName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSelectedDialogInsertUnitUnitName() {
        return outSelectedDialogInsertUnitUnitName;
    }

    /**
     * Sets the value of the outSelectedDialogInsertUnitUnitName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSelectedDialogInsertUnitUnitName(String value) {
        this.outSelectedDialogInsertUnitUnitName = value;
    }

    /**
     * Gets the value of the outSelectedDialogJustificDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSelectedDialogJustificDescription() {
        return outSelectedDialogJustificDescription;
    }

    /**
     * Sets the value of the outSelectedDialogJustificDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSelectedDialogJustificDescription(String value) {
        this.outSelectedDialogJustificDescription = value;
    }

    /**
     * Gets the value of the outSelectedDialogJustificIdJustific property.
     * 
     */
    public int getOutSelectedDialogJustificIdJustific() {
        return outSelectedDialogJustificIdJustific;
    }

    /**
     * Sets the value of the outSelectedDialogJustificIdJustific property.
     * 
     */
    public void setOutSelectedDialogJustificIdJustific(int value) {
        this.outSelectedDialogJustificIdJustific = value;
    }

    /**
     * Gets the value of the outSelectedDialogMessageProfitsAccountAccountCd property.
     * 
     */
    public short getOutSelectedDialogMessageProfitsAccountAccountCd() {
        return outSelectedDialogMessageProfitsAccountAccountCd;
    }

    /**
     * Sets the value of the outSelectedDialogMessageProfitsAccountAccountCd property.
     * 
     */
    public void setOutSelectedDialogMessageProfitsAccountAccountCd(short value) {
        this.outSelectedDialogMessageProfitsAccountAccountCd = value;
    }

    /**
     * Gets the value of the outSelectedDialogMessageProfitsAccountAccountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSelectedDialogMessageProfitsAccountAccountNumber() {
        return outSelectedDialogMessageProfitsAccountAccountNumber;
    }

    /**
     * Sets the value of the outSelectedDialogMessageProfitsAccountAccountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSelectedDialogMessageProfitsAccountAccountNumber(String value) {
        this.outSelectedDialogMessageProfitsAccountAccountNumber = value;
    }

    /**
     * Gets the value of the outSelectedDialogMessageProfitsAccountPrftSystem property.
     * 
     */
    public short getOutSelectedDialogMessageProfitsAccountPrftSystem() {
        return outSelectedDialogMessageProfitsAccountPrftSystem;
    }

    /**
     * Sets the value of the outSelectedDialogMessageProfitsAccountPrftSystem property.
     * 
     */
    public void setOutSelectedDialogMessageProfitsAccountPrftSystem(short value) {
        this.outSelectedDialogMessageProfitsAccountPrftSystem = value;
    }

    /**
     * Gets the value of the outSelectedDialogPrftTransactionDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSelectedDialogPrftTransactionDescription() {
        return outSelectedDialogPrftTransactionDescription;
    }

    /**
     * Sets the value of the outSelectedDialogPrftTransactionDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSelectedDialogPrftTransactionDescription(String value) {
        this.outSelectedDialogPrftTransactionDescription = value;
    }

    /**
     * Gets the value of the outSelectedDialogPrftTransactionIdTransact property.
     * 
     */
    public int getOutSelectedDialogPrftTransactionIdTransact() {
        return outSelectedDialogPrftTransactionIdTransact;
    }

    /**
     * Sets the value of the outSelectedDialogPrftTransactionIdTransact property.
     * 
     */
    public void setOutSelectedDialogPrftTransactionIdTransact(int value) {
        this.outSelectedDialogPrftTransactionIdTransact = value;
    }

    /**
     * Gets the value of the outSelectedDialogProductDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSelectedDialogProductDescription() {
        return outSelectedDialogProductDescription;
    }

    /**
     * Sets the value of the outSelectedDialogProductDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSelectedDialogProductDescription(String value) {
        this.outSelectedDialogProductDescription = value;
    }

    /**
     * Gets the value of the outSelectedDialogProductIdProduct property.
     * 
     */
    public int getOutSelectedDialogProductIdProduct() {
        return outSelectedDialogProductIdProduct;
    }

    /**
     * Sets the value of the outSelectedDialogProductIdProduct property.
     * 
     */
    public void setOutSelectedDialogProductIdProduct(int value) {
        this.outSelectedDialogProductIdProduct = value;
    }

    /**
     * Gets the value of the outSelectedDialogUpdateListSetDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSelectedDialogUpdateListSetDescription() {
        return outSelectedDialogUpdateListSetDescription;
    }

    /**
     * Sets the value of the outSelectedDialogUpdateListSetDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSelectedDialogUpdateListSetDescription(String value) {
        this.outSelectedDialogUpdateListSetDescription = value;
    }

    /**
     * Gets the value of the outSelectedDialogUpdateUnitCode property.
     * 
     */
    public int getOutSelectedDialogUpdateUnitCode() {
        return outSelectedDialogUpdateUnitCode;
    }

    /**
     * Sets the value of the outSelectedDialogUpdateUnitCode property.
     * 
     */
    public void setOutSelectedDialogUpdateUnitCode(int value) {
        this.outSelectedDialogUpdateUnitCode = value;
    }

    /**
     * Gets the value of the outSelectedDialogUpdateUnitUnitName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSelectedDialogUpdateUnitUnitName() {
        return outSelectedDialogUpdateUnitUnitName;
    }

    /**
     * Sets the value of the outSelectedDialogUpdateUnitUnitName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSelectedDialogUpdateUnitUnitName(String value) {
        this.outSelectedDialogUpdateUnitUnitName = value;
    }

    /**
     * Gets the value of the outSelectedHdrInsertListSetDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSelectedHdrInsertListSetDescription() {
        return outSelectedHdrInsertListSetDescription;
    }

    /**
     * Sets the value of the outSelectedHdrInsertListSetDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSelectedHdrInsertListSetDescription(String value) {
        this.outSelectedHdrInsertListSetDescription = value;
    }

    /**
     * Gets the value of the outSelectedHdrInsertUnitUnitName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSelectedHdrInsertUnitUnitName() {
        return outSelectedHdrInsertUnitUnitName;
    }

    /**
     * Sets the value of the outSelectedHdrInsertUnitUnitName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSelectedHdrInsertUnitUnitName(String value) {
        this.outSelectedHdrInsertUnitUnitName = value;
    }

    /**
     * Gets the value of the outSelectedHdrUpdateListSetDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSelectedHdrUpdateListSetDescription() {
        return outSelectedHdrUpdateListSetDescription;
    }

    /**
     * Sets the value of the outSelectedHdrUpdateListSetDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSelectedHdrUpdateListSetDescription(String value) {
        this.outSelectedHdrUpdateListSetDescription = value;
    }

    /**
     * Gets the value of the outSelectedHdrUpdateUnitUnitName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSelectedHdrUpdateUnitUnitName() {
        return outSelectedHdrUpdateUnitUnitName;
    }

    /**
     * Sets the value of the outSelectedHdrUpdateUnitUnitName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSelectedHdrUpdateUnitUnitName(String value) {
        this.outSelectedHdrUpdateUnitUnitName = value;
    }

    /**
     * Gets the value of the outSelectedServiceProfitsAccountAccStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSelectedServiceProfitsAccountAccStatus() {
        return outSelectedServiceProfitsAccountAccStatus;
    }

    /**
     * Sets the value of the outSelectedServiceProfitsAccountAccStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSelectedServiceProfitsAccountAccStatus(String value) {
        this.outSelectedServiceProfitsAccountAccStatus = value;
    }

    /**
     * Gets the value of the outSelectedServiceProfitsAccountAccountCd property.
     * 
     */
    public short getOutSelectedServiceProfitsAccountAccountCd() {
        return outSelectedServiceProfitsAccountAccountCd;
    }

    /**
     * Sets the value of the outSelectedServiceProfitsAccountAccountCd property.
     * 
     */
    public void setOutSelectedServiceProfitsAccountAccountCd(short value) {
        this.outSelectedServiceProfitsAccountAccountCd = value;
    }

    /**
     * Gets the value of the outSelectedServiceProfitsAccountAccountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSelectedServiceProfitsAccountAccountNumber() {
        return outSelectedServiceProfitsAccountAccountNumber;
    }

    /**
     * Sets the value of the outSelectedServiceProfitsAccountAccountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSelectedServiceProfitsAccountAccountNumber(String value) {
        this.outSelectedServiceProfitsAccountAccountNumber = value;
    }

    /**
     * Gets the value of the outSelectedServiceProfitsAccountAccountSerNum property.
     * 
     */
    public double getOutSelectedServiceProfitsAccountAccountSerNum() {
        return outSelectedServiceProfitsAccountAccountSerNum;
    }

    /**
     * Sets the value of the outSelectedServiceProfitsAccountAccountSerNum property.
     * 
     */
    public void setOutSelectedServiceProfitsAccountAccountSerNum(double value) {
        this.outSelectedServiceProfitsAccountAccountSerNum = value;
    }

    /**
     * Gets the value of the outSelectedServiceProfitsAccountAgrMembershipSn property.
     * 
     */
    public int getOutSelectedServiceProfitsAccountAgrMembershipSn() {
        return outSelectedServiceProfitsAccountAgrMembershipSn;
    }

    /**
     * Sets the value of the outSelectedServiceProfitsAccountAgrMembershipSn property.
     * 
     */
    public void setOutSelectedServiceProfitsAccountAgrMembershipSn(int value) {
        this.outSelectedServiceProfitsAccountAgrMembershipSn = value;
    }

    /**
     * Gets the value of the outSelectedServiceProfitsAccountAgrSn property.
     * 
     */
    public int getOutSelectedServiceProfitsAccountAgrSn() {
        return outSelectedServiceProfitsAccountAgrSn;
    }

    /**
     * Sets the value of the outSelectedServiceProfitsAccountAgrSn property.
     * 
     */
    public void setOutSelectedServiceProfitsAccountAgrSn(int value) {
        this.outSelectedServiceProfitsAccountAgrSn = value;
    }

    /**
     * Gets the value of the outSelectedServiceProfitsAccountAgrUnit property.
     * 
     */
    public int getOutSelectedServiceProfitsAccountAgrUnit() {
        return outSelectedServiceProfitsAccountAgrUnit;
    }

    /**
     * Sets the value of the outSelectedServiceProfitsAccountAgrUnit property.
     * 
     */
    public void setOutSelectedServiceProfitsAccountAgrUnit(int value) {
        this.outSelectedServiceProfitsAccountAgrUnit = value;
    }

    /**
     * Gets the value of the outSelectedServiceProfitsAccountAgrYear property.
     * 
     */
    public short getOutSelectedServiceProfitsAccountAgrYear() {
        return outSelectedServiceProfitsAccountAgrYear;
    }

    /**
     * Sets the value of the outSelectedServiceProfitsAccountAgrYear property.
     * 
     */
    public void setOutSelectedServiceProfitsAccountAgrYear(short value) {
        this.outSelectedServiceProfitsAccountAgrYear = value;
    }

    /**
     * Gets the value of the outSelectedServiceProfitsAccountCDigit property.
     * 
     */
    public short getOutSelectedServiceProfitsAccountCDigit() {
        return outSelectedServiceProfitsAccountCDigit;
    }

    /**
     * Sets the value of the outSelectedServiceProfitsAccountCDigit property.
     * 
     */
    public void setOutSelectedServiceProfitsAccountCDigit(short value) {
        this.outSelectedServiceProfitsAccountCDigit = value;
    }

    /**
     * Gets the value of the outSelectedServiceProfitsAccountCustId property.
     * 
     */
    public int getOutSelectedServiceProfitsAccountCustId() {
        return outSelectedServiceProfitsAccountCustId;
    }

    /**
     * Sets the value of the outSelectedServiceProfitsAccountCustId property.
     * 
     */
    public void setOutSelectedServiceProfitsAccountCustId(int value) {
        this.outSelectedServiceProfitsAccountCustId = value;
    }

    /**
     * Gets the value of the outSelectedServiceProfitsAccountDepAccNumber property.
     * 
     */
    public double getOutSelectedServiceProfitsAccountDepAccNumber() {
        return outSelectedServiceProfitsAccountDepAccNumber;
    }

    /**
     * Sets the value of the outSelectedServiceProfitsAccountDepAccNumber property.
     * 
     */
    public void setOutSelectedServiceProfitsAccountDepAccNumber(double value) {
        this.outSelectedServiceProfitsAccountDepAccNumber = value;
    }

    /**
     * Gets the value of the outSelectedServiceProfitsAccountDepOpenUnit property.
     * 
     */
    public int getOutSelectedServiceProfitsAccountDepOpenUnit() {
        return outSelectedServiceProfitsAccountDepOpenUnit;
    }

    /**
     * Sets the value of the outSelectedServiceProfitsAccountDepOpenUnit property.
     * 
     */
    public void setOutSelectedServiceProfitsAccountDepOpenUnit(int value) {
        this.outSelectedServiceProfitsAccountDepOpenUnit = value;
    }

    /**
     * Gets the value of the outSelectedServiceProfitsAccountIdPackage property.
     * 
     */
    public int getOutSelectedServiceProfitsAccountIdPackage() {
        return outSelectedServiceProfitsAccountIdPackage;
    }

    /**
     * Sets the value of the outSelectedServiceProfitsAccountIdPackage property.
     * 
     */
    public void setOutSelectedServiceProfitsAccountIdPackage(int value) {
        this.outSelectedServiceProfitsAccountIdPackage = value;
    }

    /**
     * Gets the value of the outSelectedServiceProfitsAccountLgAccSn property.
     * 
     */
    public double getOutSelectedServiceProfitsAccountLgAccSn() {
        return outSelectedServiceProfitsAccountLgAccSn;
    }

    /**
     * Sets the value of the outSelectedServiceProfitsAccountLgAccSn property.
     * 
     */
    public void setOutSelectedServiceProfitsAccountLgAccSn(double value) {
        this.outSelectedServiceProfitsAccountLgAccSn = value;
    }

    /**
     * Gets the value of the outSelectedServiceProfitsAccountLgOpenUnit property.
     * 
     */
    public int getOutSelectedServiceProfitsAccountLgOpenUnit() {
        return outSelectedServiceProfitsAccountLgOpenUnit;
    }

    /**
     * Sets the value of the outSelectedServiceProfitsAccountLgOpenUnit property.
     * 
     */
    public void setOutSelectedServiceProfitsAccountLgOpenUnit(int value) {
        this.outSelectedServiceProfitsAccountLgOpenUnit = value;
    }

    /**
     * Gets the value of the outSelectedServiceProfitsAccountLimitCurrency property.
     * 
     */
    public int getOutSelectedServiceProfitsAccountLimitCurrency() {
        return outSelectedServiceProfitsAccountLimitCurrency;
    }

    /**
     * Sets the value of the outSelectedServiceProfitsAccountLimitCurrency property.
     * 
     */
    public void setOutSelectedServiceProfitsAccountLimitCurrency(int value) {
        this.outSelectedServiceProfitsAccountLimitCurrency = value;
    }

    /**
     * Gets the value of the outSelectedServiceProfitsAccountLnsOpenUnit property.
     * 
     */
    public int getOutSelectedServiceProfitsAccountLnsOpenUnit() {
        return outSelectedServiceProfitsAccountLnsOpenUnit;
    }

    /**
     * Sets the value of the outSelectedServiceProfitsAccountLnsOpenUnit property.
     * 
     */
    public void setOutSelectedServiceProfitsAccountLnsOpenUnit(int value) {
        this.outSelectedServiceProfitsAccountLnsOpenUnit = value;
    }

    /**
     * Gets the value of the outSelectedServiceProfitsAccountLnsSn property.
     * 
     */
    public int getOutSelectedServiceProfitsAccountLnsSn() {
        return outSelectedServiceProfitsAccountLnsSn;
    }

    /**
     * Sets the value of the outSelectedServiceProfitsAccountLnsSn property.
     * 
     */
    public void setOutSelectedServiceProfitsAccountLnsSn(int value) {
        this.outSelectedServiceProfitsAccountLnsSn = value;
    }

    /**
     * Gets the value of the outSelectedServiceProfitsAccountLnsType property.
     * 
     */
    public short getOutSelectedServiceProfitsAccountLnsType() {
        return outSelectedServiceProfitsAccountLnsType;
    }

    /**
     * Sets the value of the outSelectedServiceProfitsAccountLnsType property.
     * 
     */
    public void setOutSelectedServiceProfitsAccountLnsType(short value) {
        this.outSelectedServiceProfitsAccountLnsType = value;
    }

    /**
     * Gets the value of the outSelectedServiceProfitsAccountMonotoringUnit property.
     * 
     */
    public int getOutSelectedServiceProfitsAccountMonotoringUnit() {
        return outSelectedServiceProfitsAccountMonotoringUnit;
    }

    /**
     * Sets the value of the outSelectedServiceProfitsAccountMonotoringUnit property.
     * 
     */
    public void setOutSelectedServiceProfitsAccountMonotoringUnit(int value) {
        this.outSelectedServiceProfitsAccountMonotoringUnit = value;
    }

    /**
     * Gets the value of the outSelectedServiceProfitsAccountMovementCurrency property.
     * 
     */
    public int getOutSelectedServiceProfitsAccountMovementCurrency() {
        return outSelectedServiceProfitsAccountMovementCurrency;
    }

    /**
     * Sets the value of the outSelectedServiceProfitsAccountMovementCurrency property.
     * 
     */
    public void setOutSelectedServiceProfitsAccountMovementCurrency(int value) {
        this.outSelectedServiceProfitsAccountMovementCurrency = value;
    }

    /**
     * Gets the value of the outSelectedServiceProfitsAccountPrftSystem property.
     * 
     */
    public short getOutSelectedServiceProfitsAccountPrftSystem() {
        return outSelectedServiceProfitsAccountPrftSystem;
    }

    /**
     * Sets the value of the outSelectedServiceProfitsAccountPrftSystem property.
     * 
     */
    public void setOutSelectedServiceProfitsAccountPrftSystem(short value) {
        this.outSelectedServiceProfitsAccountPrftSystem = value;
    }

    /**
     * Gets the value of the outSelectedServiceProfitsAccountProductId property.
     * 
     */
    public int getOutSelectedServiceProfitsAccountProductId() {
        return outSelectedServiceProfitsAccountProductId;
    }

    /**
     * Sets the value of the outSelectedServiceProfitsAccountProductId property.
     * 
     */
    public void setOutSelectedServiceProfitsAccountProductId(int value) {
        this.outSelectedServiceProfitsAccountProductId = value;
    }

    /**
     * Gets the value of the outSelectedServiceProfitsAccountTrOpenUnit property.
     * 
     */
    public int getOutSelectedServiceProfitsAccountTrOpenUnit() {
        return outSelectedServiceProfitsAccountTrOpenUnit;
    }

    /**
     * Sets the value of the outSelectedServiceProfitsAccountTrOpenUnit property.
     * 
     */
    public void setOutSelectedServiceProfitsAccountTrOpenUnit(int value) {
        this.outSelectedServiceProfitsAccountTrOpenUnit = value;
    }

    /**
     * Gets the value of the outSelectedServiceProfitsAccountTrSn property.
     * 
     */
    public int getOutSelectedServiceProfitsAccountTrSn() {
        return outSelectedServiceProfitsAccountTrSn;
    }

    /**
     * Sets the value of the outSelectedServiceProfitsAccountTrSn property.
     * 
     */
    public void setOutSelectedServiceProfitsAccountTrSn(int value) {
        this.outSelectedServiceProfitsAccountTrSn = value;
    }

    /**
     * Gets the value of the outSelectedServiceProfitsAccountTrType property.
     * 
     */
    public short getOutSelectedServiceProfitsAccountTrType() {
        return outSelectedServiceProfitsAccountTrType;
    }

    /**
     * Sets the value of the outSelectedServiceProfitsAccountTrType property.
     * 
     */
    public void setOutSelectedServiceProfitsAccountTrType(short value) {
        this.outSelectedServiceProfitsAccountTrType = value;
    }

    /**
     * Gets the value of the outGrpLog property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCIA0008VOutGrpLogItem }
     *     
     */
    public ArrayOfCIA0008VOutGrpLogItem getOutGrpLog() {
        return outGrpLog;
    }

    /**
     * Sets the value of the outGrpLog property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCIA0008VOutGrpLogItem }
     *     
     */
    public void setOutGrpLog(ArrayOfCIA0008VOutGrpLogItem value) {
        this.outGrpLog = value;
    }

    /**
     * Gets the value of the outGrpRequests property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCIA0008VOutGrpRequestsItem }
     *     
     */
    public ArrayOfCIA0008VOutGrpRequestsItem getOutGrpRequests() {
        return outGrpRequests;
    }

    /**
     * Sets the value of the outGrpRequests property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCIA0008VOutGrpRequestsItem }
     *     
     */
    public void setOutGrpRequests(ArrayOfCIA0008VOutGrpRequestsItem value) {
        this.outGrpRequests = value;
    }

}
