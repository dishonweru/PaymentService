
package com.intrasoft_internatinal.gatewayservice.profitsext;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for CIA0008V_MessageRequestImport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CIA0008V_MessageRequestImport">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}BaseImport">
 *       &lt;sequence>
 *         &lt;element name="Command" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCommandIefSuppliedCommand" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InContinueCmsgRqstDtlCmsgRqstDtlSn" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InCreateLogMntRecordingAuthorizer1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCreateLogMntRecordingAuthorizer2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCreateLogMntRecordingChannelId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InCreateLogMntRecordingPrftSystem" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InCreateLogMntRecordingReversalFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCreateLogMntRecordingTerminalNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCreateLogMntRecordingTrxCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InCreateLogMntRecordingTrxDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InCreateLogMntRecordingTrxUnit" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InCreateLogMntRecordingTrxUser" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InProcessCustomerCDigit" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InProcessCustomerCustId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InProcessDetailCmsgRqstDtlAccBalGreater" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="InProcessDetailCmsgRqstDtlAccBalLess" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="InProcessDetailCmsgRqstDtlAccBalSet" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InProcessDetailCmsgRqstDtlAccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InProcessDetailCmsgRqstDtlAccountSystem" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InProcessDetailCmsgRqstDtlAccountsAll" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InProcessDetailCmsgRqstDtlChannelId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InProcessDetailCmsgRqstDtlChannelsAll" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InProcessDetailCmsgRqstDtlCmsgRqstDtlSn" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InProcessDetailCmsgRqstDtlCmsgRqstDtlSts" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InProcessDetailCmsgRqstDtlEmailMain" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InProcessDetailCmsgRqstDtlEmailOther" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InProcessDetailCmsgRqstDtlEmailSend" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InProcessDetailCmsgRqstDtlEmailStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InProcessDetailCmsgRqstDtlEmailsTotals" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InProcessDetailCmsgRqstDtlInsertDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InProcessDetailCmsgRqstDtlInsertTmstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InProcessDetailCmsgRqstDtlInsertUnit" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InProcessDetailCmsgRqstDtlInsertUser" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InProcessDetailCmsgRqstDtlJustificationAll" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InProcessDetailCmsgRqstDtlJustificationId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InProcessDetailCmsgRqstDtlLastExecutionDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InProcessDetailCmsgRqstDtlLastExecutionStamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InProcessDetailCmsgRqstDtlMessageComments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InProcessDetailCmsgRqstDtlProductAll" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InProcessDetailCmsgRqstDtlProductId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InProcessDetailCmsgRqstDtlSmsMain" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InProcessDetailCmsgRqstDtlSmsOther" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InProcessDetailCmsgRqstDtlSmsSend" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InProcessDetailCmsgRqstDtlSmsStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InProcessDetailCmsgRqstDtlSmsTotals" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InProcessDetailCmsgRqstDtlSpecificTimeEnd" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InProcessDetailCmsgRqstDtlSpecificTimeFlg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InProcessDetailCmsgRqstDtlSpecificTimeStart" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InProcessDetailCmsgRqstDtlTransactionAll" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InProcessDetailCmsgRqstDtlTransactionId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InProcessDetailCmsgRqstDtlTrxAmountGreater" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="InProcessDetailCmsgRqstDtlTrxAmountLess" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="InProcessDetailCmsgRqstDtlTrxAmountSet" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InProcessDetailCmsgRqstDtlUpdateDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InProcessDetailCmsgRqstDtlUpdateTmstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InProcessDetailCmsgRqstDtlUpdateUnit" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InProcessDetailCmsgRqstDtlUpdateUser" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InProcessHeaderCmsgRqstHdrCmsgRqstHdrSn" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InProcessHeaderCmsgRqstHdrCustomerComments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InProcessHeaderCmsgRqstHdrEnabledEmails" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InProcessHeaderCmsgRqstHdrEnabledSms" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InProcessHeaderCmsgRqstHdrInsertDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InProcessHeaderCmsgRqstHdrInsertTmstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InProcessHeaderCmsgRqstHdrInsertUnit" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InProcessHeaderCmsgRqstHdrInsertUser" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InProcessHeaderCmsgRqstHdrServiceAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InProcessHeaderCmsgRqstHdrServiceSystem" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InProcessHeaderCmsgRqstHdrUpdateDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InProcessHeaderCmsgRqstHdrUpdateTmstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InProcessHeaderCmsgRqstHdrUpdateUnit" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InProcessHeaderCmsgRqstHdrUpdateUser" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InProcessServiceProfitsAccountAccountCd" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InProcessServiceProfitsAccountAccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InProcessServiceProfitsAccountPrftSystem" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InTrxPrftTransactionIdTransact" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CIA0008V_MessageRequestImport", propOrder = {
    "command",
    "inCommandIefSuppliedCommand",
    "inContinueCmsgRqstDtlCmsgRqstDtlSn",
    "inCreateLogMntRecordingAuthorizer1",
    "inCreateLogMntRecordingAuthorizer2",
    "inCreateLogMntRecordingChannelId",
    "inCreateLogMntRecordingPrftSystem",
    "inCreateLogMntRecordingReversalFlag",
    "inCreateLogMntRecordingTerminalNumber",
    "inCreateLogMntRecordingTrxCode",
    "inCreateLogMntRecordingTrxDate",
    "inCreateLogMntRecordingTrxUnit",
    "inCreateLogMntRecordingTrxUser",
    "inProcessCustomerCDigit",
    "inProcessCustomerCustId",
    "inProcessDetailCmsgRqstDtlAccBalGreater",
    "inProcessDetailCmsgRqstDtlAccBalLess",
    "inProcessDetailCmsgRqstDtlAccBalSet",
    "inProcessDetailCmsgRqstDtlAccountNumber",
    "inProcessDetailCmsgRqstDtlAccountSystem",
    "inProcessDetailCmsgRqstDtlAccountsAll",
    "inProcessDetailCmsgRqstDtlChannelId",
    "inProcessDetailCmsgRqstDtlChannelsAll",
    "inProcessDetailCmsgRqstDtlCmsgRqstDtlSn",
    "inProcessDetailCmsgRqstDtlCmsgRqstDtlSts",
    "inProcessDetailCmsgRqstDtlEmailMain",
    "inProcessDetailCmsgRqstDtlEmailOther",
    "inProcessDetailCmsgRqstDtlEmailSend",
    "inProcessDetailCmsgRqstDtlEmailStatus",
    "inProcessDetailCmsgRqstDtlEmailsTotals",
    "inProcessDetailCmsgRqstDtlInsertDt",
    "inProcessDetailCmsgRqstDtlInsertTmstamp",
    "inProcessDetailCmsgRqstDtlInsertUnit",
    "inProcessDetailCmsgRqstDtlInsertUser",
    "inProcessDetailCmsgRqstDtlJustificationAll",
    "inProcessDetailCmsgRqstDtlJustificationId",
    "inProcessDetailCmsgRqstDtlLastExecutionDate",
    "inProcessDetailCmsgRqstDtlLastExecutionStamp",
    "inProcessDetailCmsgRqstDtlMessageComments",
    "inProcessDetailCmsgRqstDtlProductAll",
    "inProcessDetailCmsgRqstDtlProductId",
    "inProcessDetailCmsgRqstDtlSmsMain",
    "inProcessDetailCmsgRqstDtlSmsOther",
    "inProcessDetailCmsgRqstDtlSmsSend",
    "inProcessDetailCmsgRqstDtlSmsStatus",
    "inProcessDetailCmsgRqstDtlSmsTotals",
    "inProcessDetailCmsgRqstDtlSpecificTimeEnd",
    "inProcessDetailCmsgRqstDtlSpecificTimeFlg",
    "inProcessDetailCmsgRqstDtlSpecificTimeStart",
    "inProcessDetailCmsgRqstDtlTransactionAll",
    "inProcessDetailCmsgRqstDtlTransactionId",
    "inProcessDetailCmsgRqstDtlTrxAmountGreater",
    "inProcessDetailCmsgRqstDtlTrxAmountLess",
    "inProcessDetailCmsgRqstDtlTrxAmountSet",
    "inProcessDetailCmsgRqstDtlUpdateDt",
    "inProcessDetailCmsgRqstDtlUpdateTmstamp",
    "inProcessDetailCmsgRqstDtlUpdateUnit",
    "inProcessDetailCmsgRqstDtlUpdateUser",
    "inProcessHeaderCmsgRqstHdrCmsgRqstHdrSn",
    "inProcessHeaderCmsgRqstHdrCustomerComments",
    "inProcessHeaderCmsgRqstHdrEnabledEmails",
    "inProcessHeaderCmsgRqstHdrEnabledSms",
    "inProcessHeaderCmsgRqstHdrInsertDt",
    "inProcessHeaderCmsgRqstHdrInsertTmstamp",
    "inProcessHeaderCmsgRqstHdrInsertUnit",
    "inProcessHeaderCmsgRqstHdrInsertUser",
    "inProcessHeaderCmsgRqstHdrServiceAccount",
    "inProcessHeaderCmsgRqstHdrServiceSystem",
    "inProcessHeaderCmsgRqstHdrUpdateDt",
    "inProcessHeaderCmsgRqstHdrUpdateTmstamp",
    "inProcessHeaderCmsgRqstHdrUpdateUnit",
    "inProcessHeaderCmsgRqstHdrUpdateUser",
    "inProcessServiceProfitsAccountAccountCd",
    "inProcessServiceProfitsAccountAccountNumber",
    "inProcessServiceProfitsAccountPrftSystem",
    "inTrxPrftTransactionIdTransact"
})
public class CIA0008VMessageRequestImport
    extends BaseImport
{

    @XmlElement(name = "Command")
    protected String command;
    @XmlElement(name = "InCommandIefSuppliedCommand")
    protected String inCommandIefSuppliedCommand;
    @XmlElement(name = "InContinueCmsgRqstDtlCmsgRqstDtlSn")
    protected int inContinueCmsgRqstDtlCmsgRqstDtlSn;
    @XmlElement(name = "InCreateLogMntRecordingAuthorizer1")
    protected String inCreateLogMntRecordingAuthorizer1;
    @XmlElement(name = "InCreateLogMntRecordingAuthorizer2")
    protected String inCreateLogMntRecordingAuthorizer2;
    @XmlElement(name = "InCreateLogMntRecordingChannelId")
    protected int inCreateLogMntRecordingChannelId;
    @XmlElement(name = "InCreateLogMntRecordingPrftSystem")
    protected short inCreateLogMntRecordingPrftSystem;
    @XmlElement(name = "InCreateLogMntRecordingReversalFlag")
    protected String inCreateLogMntRecordingReversalFlag;
    @XmlElement(name = "InCreateLogMntRecordingTerminalNumber")
    protected String inCreateLogMntRecordingTerminalNumber;
    @XmlElement(name = "InCreateLogMntRecordingTrxCode")
    protected int inCreateLogMntRecordingTrxCode;
    @XmlElement(name = "InCreateLogMntRecordingTrxDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inCreateLogMntRecordingTrxDate;
    @XmlElement(name = "InCreateLogMntRecordingTrxUnit")
    protected int inCreateLogMntRecordingTrxUnit;
    @XmlElement(name = "InCreateLogMntRecordingTrxUser")
    protected String inCreateLogMntRecordingTrxUser;
    @XmlElement(name = "InProcessCustomerCDigit")
    protected short inProcessCustomerCDigit;
    @XmlElement(name = "InProcessCustomerCustId")
    protected int inProcessCustomerCustId;
    @XmlElement(name = "InProcessDetailCmsgRqstDtlAccBalGreater")
    protected double inProcessDetailCmsgRqstDtlAccBalGreater;
    @XmlElement(name = "InProcessDetailCmsgRqstDtlAccBalLess")
    protected double inProcessDetailCmsgRqstDtlAccBalLess;
    @XmlElement(name = "InProcessDetailCmsgRqstDtlAccBalSet")
    protected String inProcessDetailCmsgRqstDtlAccBalSet;
    @XmlElement(name = "InProcessDetailCmsgRqstDtlAccountNumber")
    protected String inProcessDetailCmsgRqstDtlAccountNumber;
    @XmlElement(name = "InProcessDetailCmsgRqstDtlAccountSystem")
    protected short inProcessDetailCmsgRqstDtlAccountSystem;
    @XmlElement(name = "InProcessDetailCmsgRqstDtlAccountsAll")
    protected String inProcessDetailCmsgRqstDtlAccountsAll;
    @XmlElement(name = "InProcessDetailCmsgRqstDtlChannelId")
    protected int inProcessDetailCmsgRqstDtlChannelId;
    @XmlElement(name = "InProcessDetailCmsgRqstDtlChannelsAll")
    protected String inProcessDetailCmsgRqstDtlChannelsAll;
    @XmlElement(name = "InProcessDetailCmsgRqstDtlCmsgRqstDtlSn")
    protected int inProcessDetailCmsgRqstDtlCmsgRqstDtlSn;
    @XmlElement(name = "InProcessDetailCmsgRqstDtlCmsgRqstDtlSts")
    protected String inProcessDetailCmsgRqstDtlCmsgRqstDtlSts;
    @XmlElement(name = "InProcessDetailCmsgRqstDtlEmailMain")
    protected String inProcessDetailCmsgRqstDtlEmailMain;
    @XmlElement(name = "InProcessDetailCmsgRqstDtlEmailOther")
    protected String inProcessDetailCmsgRqstDtlEmailOther;
    @XmlElement(name = "InProcessDetailCmsgRqstDtlEmailSend")
    protected String inProcessDetailCmsgRqstDtlEmailSend;
    @XmlElement(name = "InProcessDetailCmsgRqstDtlEmailStatus")
    protected String inProcessDetailCmsgRqstDtlEmailStatus;
    @XmlElement(name = "InProcessDetailCmsgRqstDtlEmailsTotals")
    protected int inProcessDetailCmsgRqstDtlEmailsTotals;
    @XmlElement(name = "InProcessDetailCmsgRqstDtlInsertDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inProcessDetailCmsgRqstDtlInsertDt;
    @XmlElement(name = "InProcessDetailCmsgRqstDtlInsertTmstamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inProcessDetailCmsgRqstDtlInsertTmstamp;
    @XmlElement(name = "InProcessDetailCmsgRqstDtlInsertUnit")
    protected int inProcessDetailCmsgRqstDtlInsertUnit;
    @XmlElement(name = "InProcessDetailCmsgRqstDtlInsertUser")
    protected String inProcessDetailCmsgRqstDtlInsertUser;
    @XmlElement(name = "InProcessDetailCmsgRqstDtlJustificationAll")
    protected String inProcessDetailCmsgRqstDtlJustificationAll;
    @XmlElement(name = "InProcessDetailCmsgRqstDtlJustificationId")
    protected int inProcessDetailCmsgRqstDtlJustificationId;
    @XmlElement(name = "InProcessDetailCmsgRqstDtlLastExecutionDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inProcessDetailCmsgRqstDtlLastExecutionDate;
    @XmlElement(name = "InProcessDetailCmsgRqstDtlLastExecutionStamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inProcessDetailCmsgRqstDtlLastExecutionStamp;
    @XmlElement(name = "InProcessDetailCmsgRqstDtlMessageComments")
    protected String inProcessDetailCmsgRqstDtlMessageComments;
    @XmlElement(name = "InProcessDetailCmsgRqstDtlProductAll")
    protected String inProcessDetailCmsgRqstDtlProductAll;
    @XmlElement(name = "InProcessDetailCmsgRqstDtlProductId")
    protected int inProcessDetailCmsgRqstDtlProductId;
    @XmlElement(name = "InProcessDetailCmsgRqstDtlSmsMain")
    protected String inProcessDetailCmsgRqstDtlSmsMain;
    @XmlElement(name = "InProcessDetailCmsgRqstDtlSmsOther")
    protected String inProcessDetailCmsgRqstDtlSmsOther;
    @XmlElement(name = "InProcessDetailCmsgRqstDtlSmsSend")
    protected String inProcessDetailCmsgRqstDtlSmsSend;
    @XmlElement(name = "InProcessDetailCmsgRqstDtlSmsStatus")
    protected String inProcessDetailCmsgRqstDtlSmsStatus;
    @XmlElement(name = "InProcessDetailCmsgRqstDtlSmsTotals")
    protected int inProcessDetailCmsgRqstDtlSmsTotals;
    @XmlElement(name = "InProcessDetailCmsgRqstDtlSpecificTimeEnd", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inProcessDetailCmsgRqstDtlSpecificTimeEnd;
    @XmlElement(name = "InProcessDetailCmsgRqstDtlSpecificTimeFlg")
    protected String inProcessDetailCmsgRqstDtlSpecificTimeFlg;
    @XmlElement(name = "InProcessDetailCmsgRqstDtlSpecificTimeStart", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inProcessDetailCmsgRqstDtlSpecificTimeStart;
    @XmlElement(name = "InProcessDetailCmsgRqstDtlTransactionAll")
    protected String inProcessDetailCmsgRqstDtlTransactionAll;
    @XmlElement(name = "InProcessDetailCmsgRqstDtlTransactionId")
    protected int inProcessDetailCmsgRqstDtlTransactionId;
    @XmlElement(name = "InProcessDetailCmsgRqstDtlTrxAmountGreater")
    protected double inProcessDetailCmsgRqstDtlTrxAmountGreater;
    @XmlElement(name = "InProcessDetailCmsgRqstDtlTrxAmountLess")
    protected double inProcessDetailCmsgRqstDtlTrxAmountLess;
    @XmlElement(name = "InProcessDetailCmsgRqstDtlTrxAmountSet")
    protected String inProcessDetailCmsgRqstDtlTrxAmountSet;
    @XmlElement(name = "InProcessDetailCmsgRqstDtlUpdateDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inProcessDetailCmsgRqstDtlUpdateDt;
    @XmlElement(name = "InProcessDetailCmsgRqstDtlUpdateTmstamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inProcessDetailCmsgRqstDtlUpdateTmstamp;
    @XmlElement(name = "InProcessDetailCmsgRqstDtlUpdateUnit")
    protected int inProcessDetailCmsgRqstDtlUpdateUnit;
    @XmlElement(name = "InProcessDetailCmsgRqstDtlUpdateUser")
    protected String inProcessDetailCmsgRqstDtlUpdateUser;
    @XmlElement(name = "InProcessHeaderCmsgRqstHdrCmsgRqstHdrSn")
    protected int inProcessHeaderCmsgRqstHdrCmsgRqstHdrSn;
    @XmlElement(name = "InProcessHeaderCmsgRqstHdrCustomerComments")
    protected String inProcessHeaderCmsgRqstHdrCustomerComments;
    @XmlElement(name = "InProcessHeaderCmsgRqstHdrEnabledEmails")
    protected String inProcessHeaderCmsgRqstHdrEnabledEmails;
    @XmlElement(name = "InProcessHeaderCmsgRqstHdrEnabledSms")
    protected String inProcessHeaderCmsgRqstHdrEnabledSms;
    @XmlElement(name = "InProcessHeaderCmsgRqstHdrInsertDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inProcessHeaderCmsgRqstHdrInsertDt;
    @XmlElement(name = "InProcessHeaderCmsgRqstHdrInsertTmstamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inProcessHeaderCmsgRqstHdrInsertTmstamp;
    @XmlElement(name = "InProcessHeaderCmsgRqstHdrInsertUnit")
    protected int inProcessHeaderCmsgRqstHdrInsertUnit;
    @XmlElement(name = "InProcessHeaderCmsgRqstHdrInsertUser")
    protected String inProcessHeaderCmsgRqstHdrInsertUser;
    @XmlElement(name = "InProcessHeaderCmsgRqstHdrServiceAccount")
    protected String inProcessHeaderCmsgRqstHdrServiceAccount;
    @XmlElement(name = "InProcessHeaderCmsgRqstHdrServiceSystem")
    protected short inProcessHeaderCmsgRqstHdrServiceSystem;
    @XmlElement(name = "InProcessHeaderCmsgRqstHdrUpdateDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inProcessHeaderCmsgRqstHdrUpdateDt;
    @XmlElement(name = "InProcessHeaderCmsgRqstHdrUpdateTmstamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inProcessHeaderCmsgRqstHdrUpdateTmstamp;
    @XmlElement(name = "InProcessHeaderCmsgRqstHdrUpdateUnit")
    protected int inProcessHeaderCmsgRqstHdrUpdateUnit;
    @XmlElement(name = "InProcessHeaderCmsgRqstHdrUpdateUser")
    protected String inProcessHeaderCmsgRqstHdrUpdateUser;
    @XmlElement(name = "InProcessServiceProfitsAccountAccountCd")
    protected short inProcessServiceProfitsAccountAccountCd;
    @XmlElement(name = "InProcessServiceProfitsAccountAccountNumber")
    protected String inProcessServiceProfitsAccountAccountNumber;
    @XmlElement(name = "InProcessServiceProfitsAccountPrftSystem")
    protected short inProcessServiceProfitsAccountPrftSystem;
    @XmlElement(name = "InTrxPrftTransactionIdTransact")
    protected int inTrxPrftTransactionIdTransact;

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
     * Gets the value of the inContinueCmsgRqstDtlCmsgRqstDtlSn property.
     * 
     */
    public int getInContinueCmsgRqstDtlCmsgRqstDtlSn() {
        return inContinueCmsgRqstDtlCmsgRqstDtlSn;
    }

    /**
     * Sets the value of the inContinueCmsgRqstDtlCmsgRqstDtlSn property.
     * 
     */
    public void setInContinueCmsgRqstDtlCmsgRqstDtlSn(int value) {
        this.inContinueCmsgRqstDtlCmsgRqstDtlSn = value;
    }

    /**
     * Gets the value of the inCreateLogMntRecordingAuthorizer1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCreateLogMntRecordingAuthorizer1() {
        return inCreateLogMntRecordingAuthorizer1;
    }

    /**
     * Sets the value of the inCreateLogMntRecordingAuthorizer1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCreateLogMntRecordingAuthorizer1(String value) {
        this.inCreateLogMntRecordingAuthorizer1 = value;
    }

    /**
     * Gets the value of the inCreateLogMntRecordingAuthorizer2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCreateLogMntRecordingAuthorizer2() {
        return inCreateLogMntRecordingAuthorizer2;
    }

    /**
     * Sets the value of the inCreateLogMntRecordingAuthorizer2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCreateLogMntRecordingAuthorizer2(String value) {
        this.inCreateLogMntRecordingAuthorizer2 = value;
    }

    /**
     * Gets the value of the inCreateLogMntRecordingChannelId property.
     * 
     */
    public int getInCreateLogMntRecordingChannelId() {
        return inCreateLogMntRecordingChannelId;
    }

    /**
     * Sets the value of the inCreateLogMntRecordingChannelId property.
     * 
     */
    public void setInCreateLogMntRecordingChannelId(int value) {
        this.inCreateLogMntRecordingChannelId = value;
    }

    /**
     * Gets the value of the inCreateLogMntRecordingPrftSystem property.
     * 
     */
    public short getInCreateLogMntRecordingPrftSystem() {
        return inCreateLogMntRecordingPrftSystem;
    }

    /**
     * Sets the value of the inCreateLogMntRecordingPrftSystem property.
     * 
     */
    public void setInCreateLogMntRecordingPrftSystem(short value) {
        this.inCreateLogMntRecordingPrftSystem = value;
    }

    /**
     * Gets the value of the inCreateLogMntRecordingReversalFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCreateLogMntRecordingReversalFlag() {
        return inCreateLogMntRecordingReversalFlag;
    }

    /**
     * Sets the value of the inCreateLogMntRecordingReversalFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCreateLogMntRecordingReversalFlag(String value) {
        this.inCreateLogMntRecordingReversalFlag = value;
    }

    /**
     * Gets the value of the inCreateLogMntRecordingTerminalNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCreateLogMntRecordingTerminalNumber() {
        return inCreateLogMntRecordingTerminalNumber;
    }

    /**
     * Sets the value of the inCreateLogMntRecordingTerminalNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCreateLogMntRecordingTerminalNumber(String value) {
        this.inCreateLogMntRecordingTerminalNumber = value;
    }

    /**
     * Gets the value of the inCreateLogMntRecordingTrxCode property.
     * 
     */
    public int getInCreateLogMntRecordingTrxCode() {
        return inCreateLogMntRecordingTrxCode;
    }

    /**
     * Sets the value of the inCreateLogMntRecordingTrxCode property.
     * 
     */
    public void setInCreateLogMntRecordingTrxCode(int value) {
        this.inCreateLogMntRecordingTrxCode = value;
    }

    /**
     * Gets the value of the inCreateLogMntRecordingTrxDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInCreateLogMntRecordingTrxDate() {
        return inCreateLogMntRecordingTrxDate;
    }

    /**
     * Sets the value of the inCreateLogMntRecordingTrxDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInCreateLogMntRecordingTrxDate(XMLGregorianCalendar value) {
        this.inCreateLogMntRecordingTrxDate = value;
    }

    /**
     * Gets the value of the inCreateLogMntRecordingTrxUnit property.
     * 
     */
    public int getInCreateLogMntRecordingTrxUnit() {
        return inCreateLogMntRecordingTrxUnit;
    }

    /**
     * Sets the value of the inCreateLogMntRecordingTrxUnit property.
     * 
     */
    public void setInCreateLogMntRecordingTrxUnit(int value) {
        this.inCreateLogMntRecordingTrxUnit = value;
    }

    /**
     * Gets the value of the inCreateLogMntRecordingTrxUser property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCreateLogMntRecordingTrxUser() {
        return inCreateLogMntRecordingTrxUser;
    }

    /**
     * Sets the value of the inCreateLogMntRecordingTrxUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCreateLogMntRecordingTrxUser(String value) {
        this.inCreateLogMntRecordingTrxUser = value;
    }

    /**
     * Gets the value of the inProcessCustomerCDigit property.
     * 
     */
    public short getInProcessCustomerCDigit() {
        return inProcessCustomerCDigit;
    }

    /**
     * Sets the value of the inProcessCustomerCDigit property.
     * 
     */
    public void setInProcessCustomerCDigit(short value) {
        this.inProcessCustomerCDigit = value;
    }

    /**
     * Gets the value of the inProcessCustomerCustId property.
     * 
     */
    public int getInProcessCustomerCustId() {
        return inProcessCustomerCustId;
    }

    /**
     * Sets the value of the inProcessCustomerCustId property.
     * 
     */
    public void setInProcessCustomerCustId(int value) {
        this.inProcessCustomerCustId = value;
    }

    /**
     * Gets the value of the inProcessDetailCmsgRqstDtlAccBalGreater property.
     * 
     */
    public double getInProcessDetailCmsgRqstDtlAccBalGreater() {
        return inProcessDetailCmsgRqstDtlAccBalGreater;
    }

    /**
     * Sets the value of the inProcessDetailCmsgRqstDtlAccBalGreater property.
     * 
     */
    public void setInProcessDetailCmsgRqstDtlAccBalGreater(double value) {
        this.inProcessDetailCmsgRqstDtlAccBalGreater = value;
    }

    /**
     * Gets the value of the inProcessDetailCmsgRqstDtlAccBalLess property.
     * 
     */
    public double getInProcessDetailCmsgRqstDtlAccBalLess() {
        return inProcessDetailCmsgRqstDtlAccBalLess;
    }

    /**
     * Sets the value of the inProcessDetailCmsgRqstDtlAccBalLess property.
     * 
     */
    public void setInProcessDetailCmsgRqstDtlAccBalLess(double value) {
        this.inProcessDetailCmsgRqstDtlAccBalLess = value;
    }

    /**
     * Gets the value of the inProcessDetailCmsgRqstDtlAccBalSet property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInProcessDetailCmsgRqstDtlAccBalSet() {
        return inProcessDetailCmsgRqstDtlAccBalSet;
    }

    /**
     * Sets the value of the inProcessDetailCmsgRqstDtlAccBalSet property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInProcessDetailCmsgRqstDtlAccBalSet(String value) {
        this.inProcessDetailCmsgRqstDtlAccBalSet = value;
    }

    /**
     * Gets the value of the inProcessDetailCmsgRqstDtlAccountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInProcessDetailCmsgRqstDtlAccountNumber() {
        return inProcessDetailCmsgRqstDtlAccountNumber;
    }

    /**
     * Sets the value of the inProcessDetailCmsgRqstDtlAccountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInProcessDetailCmsgRqstDtlAccountNumber(String value) {
        this.inProcessDetailCmsgRqstDtlAccountNumber = value;
    }

    /**
     * Gets the value of the inProcessDetailCmsgRqstDtlAccountSystem property.
     * 
     */
    public short getInProcessDetailCmsgRqstDtlAccountSystem() {
        return inProcessDetailCmsgRqstDtlAccountSystem;
    }

    /**
     * Sets the value of the inProcessDetailCmsgRqstDtlAccountSystem property.
     * 
     */
    public void setInProcessDetailCmsgRqstDtlAccountSystem(short value) {
        this.inProcessDetailCmsgRqstDtlAccountSystem = value;
    }

    /**
     * Gets the value of the inProcessDetailCmsgRqstDtlAccountsAll property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInProcessDetailCmsgRqstDtlAccountsAll() {
        return inProcessDetailCmsgRqstDtlAccountsAll;
    }

    /**
     * Sets the value of the inProcessDetailCmsgRqstDtlAccountsAll property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInProcessDetailCmsgRqstDtlAccountsAll(String value) {
        this.inProcessDetailCmsgRqstDtlAccountsAll = value;
    }

    /**
     * Gets the value of the inProcessDetailCmsgRqstDtlChannelId property.
     * 
     */
    public int getInProcessDetailCmsgRqstDtlChannelId() {
        return inProcessDetailCmsgRqstDtlChannelId;
    }

    /**
     * Sets the value of the inProcessDetailCmsgRqstDtlChannelId property.
     * 
     */
    public void setInProcessDetailCmsgRqstDtlChannelId(int value) {
        this.inProcessDetailCmsgRqstDtlChannelId = value;
    }

    /**
     * Gets the value of the inProcessDetailCmsgRqstDtlChannelsAll property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInProcessDetailCmsgRqstDtlChannelsAll() {
        return inProcessDetailCmsgRqstDtlChannelsAll;
    }

    /**
     * Sets the value of the inProcessDetailCmsgRqstDtlChannelsAll property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInProcessDetailCmsgRqstDtlChannelsAll(String value) {
        this.inProcessDetailCmsgRqstDtlChannelsAll = value;
    }

    /**
     * Gets the value of the inProcessDetailCmsgRqstDtlCmsgRqstDtlSn property.
     * 
     */
    public int getInProcessDetailCmsgRqstDtlCmsgRqstDtlSn() {
        return inProcessDetailCmsgRqstDtlCmsgRqstDtlSn;
    }

    /**
     * Sets the value of the inProcessDetailCmsgRqstDtlCmsgRqstDtlSn property.
     * 
     */
    public void setInProcessDetailCmsgRqstDtlCmsgRqstDtlSn(int value) {
        this.inProcessDetailCmsgRqstDtlCmsgRqstDtlSn = value;
    }

    /**
     * Gets the value of the inProcessDetailCmsgRqstDtlCmsgRqstDtlSts property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInProcessDetailCmsgRqstDtlCmsgRqstDtlSts() {
        return inProcessDetailCmsgRqstDtlCmsgRqstDtlSts;
    }

    /**
     * Sets the value of the inProcessDetailCmsgRqstDtlCmsgRqstDtlSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInProcessDetailCmsgRqstDtlCmsgRqstDtlSts(String value) {
        this.inProcessDetailCmsgRqstDtlCmsgRqstDtlSts = value;
    }

    /**
     * Gets the value of the inProcessDetailCmsgRqstDtlEmailMain property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInProcessDetailCmsgRqstDtlEmailMain() {
        return inProcessDetailCmsgRqstDtlEmailMain;
    }

    /**
     * Sets the value of the inProcessDetailCmsgRqstDtlEmailMain property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInProcessDetailCmsgRqstDtlEmailMain(String value) {
        this.inProcessDetailCmsgRqstDtlEmailMain = value;
    }

    /**
     * Gets the value of the inProcessDetailCmsgRqstDtlEmailOther property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInProcessDetailCmsgRqstDtlEmailOther() {
        return inProcessDetailCmsgRqstDtlEmailOther;
    }

    /**
     * Sets the value of the inProcessDetailCmsgRqstDtlEmailOther property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInProcessDetailCmsgRqstDtlEmailOther(String value) {
        this.inProcessDetailCmsgRqstDtlEmailOther = value;
    }

    /**
     * Gets the value of the inProcessDetailCmsgRqstDtlEmailSend property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInProcessDetailCmsgRqstDtlEmailSend() {
        return inProcessDetailCmsgRqstDtlEmailSend;
    }

    /**
     * Sets the value of the inProcessDetailCmsgRqstDtlEmailSend property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInProcessDetailCmsgRqstDtlEmailSend(String value) {
        this.inProcessDetailCmsgRqstDtlEmailSend = value;
    }

    /**
     * Gets the value of the inProcessDetailCmsgRqstDtlEmailStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInProcessDetailCmsgRqstDtlEmailStatus() {
        return inProcessDetailCmsgRqstDtlEmailStatus;
    }

    /**
     * Sets the value of the inProcessDetailCmsgRqstDtlEmailStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInProcessDetailCmsgRqstDtlEmailStatus(String value) {
        this.inProcessDetailCmsgRqstDtlEmailStatus = value;
    }

    /**
     * Gets the value of the inProcessDetailCmsgRqstDtlEmailsTotals property.
     * 
     */
    public int getInProcessDetailCmsgRqstDtlEmailsTotals() {
        return inProcessDetailCmsgRqstDtlEmailsTotals;
    }

    /**
     * Sets the value of the inProcessDetailCmsgRqstDtlEmailsTotals property.
     * 
     */
    public void setInProcessDetailCmsgRqstDtlEmailsTotals(int value) {
        this.inProcessDetailCmsgRqstDtlEmailsTotals = value;
    }

    /**
     * Gets the value of the inProcessDetailCmsgRqstDtlInsertDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInProcessDetailCmsgRqstDtlInsertDt() {
        return inProcessDetailCmsgRqstDtlInsertDt;
    }

    /**
     * Sets the value of the inProcessDetailCmsgRqstDtlInsertDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInProcessDetailCmsgRqstDtlInsertDt(XMLGregorianCalendar value) {
        this.inProcessDetailCmsgRqstDtlInsertDt = value;
    }

    /**
     * Gets the value of the inProcessDetailCmsgRqstDtlInsertTmstamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInProcessDetailCmsgRqstDtlInsertTmstamp() {
        return inProcessDetailCmsgRqstDtlInsertTmstamp;
    }

    /**
     * Sets the value of the inProcessDetailCmsgRqstDtlInsertTmstamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInProcessDetailCmsgRqstDtlInsertTmstamp(XMLGregorianCalendar value) {
        this.inProcessDetailCmsgRqstDtlInsertTmstamp = value;
    }

    /**
     * Gets the value of the inProcessDetailCmsgRqstDtlInsertUnit property.
     * 
     */
    public int getInProcessDetailCmsgRqstDtlInsertUnit() {
        return inProcessDetailCmsgRqstDtlInsertUnit;
    }

    /**
     * Sets the value of the inProcessDetailCmsgRqstDtlInsertUnit property.
     * 
     */
    public void setInProcessDetailCmsgRqstDtlInsertUnit(int value) {
        this.inProcessDetailCmsgRqstDtlInsertUnit = value;
    }

    /**
     * Gets the value of the inProcessDetailCmsgRqstDtlInsertUser property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInProcessDetailCmsgRqstDtlInsertUser() {
        return inProcessDetailCmsgRqstDtlInsertUser;
    }

    /**
     * Sets the value of the inProcessDetailCmsgRqstDtlInsertUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInProcessDetailCmsgRqstDtlInsertUser(String value) {
        this.inProcessDetailCmsgRqstDtlInsertUser = value;
    }

    /**
     * Gets the value of the inProcessDetailCmsgRqstDtlJustificationAll property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInProcessDetailCmsgRqstDtlJustificationAll() {
        return inProcessDetailCmsgRqstDtlJustificationAll;
    }

    /**
     * Sets the value of the inProcessDetailCmsgRqstDtlJustificationAll property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInProcessDetailCmsgRqstDtlJustificationAll(String value) {
        this.inProcessDetailCmsgRqstDtlJustificationAll = value;
    }

    /**
     * Gets the value of the inProcessDetailCmsgRqstDtlJustificationId property.
     * 
     */
    public int getInProcessDetailCmsgRqstDtlJustificationId() {
        return inProcessDetailCmsgRqstDtlJustificationId;
    }

    /**
     * Sets the value of the inProcessDetailCmsgRqstDtlJustificationId property.
     * 
     */
    public void setInProcessDetailCmsgRqstDtlJustificationId(int value) {
        this.inProcessDetailCmsgRqstDtlJustificationId = value;
    }

    /**
     * Gets the value of the inProcessDetailCmsgRqstDtlLastExecutionDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInProcessDetailCmsgRqstDtlLastExecutionDate() {
        return inProcessDetailCmsgRqstDtlLastExecutionDate;
    }

    /**
     * Sets the value of the inProcessDetailCmsgRqstDtlLastExecutionDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInProcessDetailCmsgRqstDtlLastExecutionDate(XMLGregorianCalendar value) {
        this.inProcessDetailCmsgRqstDtlLastExecutionDate = value;
    }

    /**
     * Gets the value of the inProcessDetailCmsgRqstDtlLastExecutionStamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInProcessDetailCmsgRqstDtlLastExecutionStamp() {
        return inProcessDetailCmsgRqstDtlLastExecutionStamp;
    }

    /**
     * Sets the value of the inProcessDetailCmsgRqstDtlLastExecutionStamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInProcessDetailCmsgRqstDtlLastExecutionStamp(XMLGregorianCalendar value) {
        this.inProcessDetailCmsgRqstDtlLastExecutionStamp = value;
    }

    /**
     * Gets the value of the inProcessDetailCmsgRqstDtlMessageComments property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInProcessDetailCmsgRqstDtlMessageComments() {
        return inProcessDetailCmsgRqstDtlMessageComments;
    }

    /**
     * Sets the value of the inProcessDetailCmsgRqstDtlMessageComments property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInProcessDetailCmsgRqstDtlMessageComments(String value) {
        this.inProcessDetailCmsgRqstDtlMessageComments = value;
    }

    /**
     * Gets the value of the inProcessDetailCmsgRqstDtlProductAll property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInProcessDetailCmsgRqstDtlProductAll() {
        return inProcessDetailCmsgRqstDtlProductAll;
    }

    /**
     * Sets the value of the inProcessDetailCmsgRqstDtlProductAll property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInProcessDetailCmsgRqstDtlProductAll(String value) {
        this.inProcessDetailCmsgRqstDtlProductAll = value;
    }

    /**
     * Gets the value of the inProcessDetailCmsgRqstDtlProductId property.
     * 
     */
    public int getInProcessDetailCmsgRqstDtlProductId() {
        return inProcessDetailCmsgRqstDtlProductId;
    }

    /**
     * Sets the value of the inProcessDetailCmsgRqstDtlProductId property.
     * 
     */
    public void setInProcessDetailCmsgRqstDtlProductId(int value) {
        this.inProcessDetailCmsgRqstDtlProductId = value;
    }

    /**
     * Gets the value of the inProcessDetailCmsgRqstDtlSmsMain property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInProcessDetailCmsgRqstDtlSmsMain() {
        return inProcessDetailCmsgRqstDtlSmsMain;
    }

    /**
     * Sets the value of the inProcessDetailCmsgRqstDtlSmsMain property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInProcessDetailCmsgRqstDtlSmsMain(String value) {
        this.inProcessDetailCmsgRqstDtlSmsMain = value;
    }

    /**
     * Gets the value of the inProcessDetailCmsgRqstDtlSmsOther property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInProcessDetailCmsgRqstDtlSmsOther() {
        return inProcessDetailCmsgRqstDtlSmsOther;
    }

    /**
     * Sets the value of the inProcessDetailCmsgRqstDtlSmsOther property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInProcessDetailCmsgRqstDtlSmsOther(String value) {
        this.inProcessDetailCmsgRqstDtlSmsOther = value;
    }

    /**
     * Gets the value of the inProcessDetailCmsgRqstDtlSmsSend property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInProcessDetailCmsgRqstDtlSmsSend() {
        return inProcessDetailCmsgRqstDtlSmsSend;
    }

    /**
     * Sets the value of the inProcessDetailCmsgRqstDtlSmsSend property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInProcessDetailCmsgRqstDtlSmsSend(String value) {
        this.inProcessDetailCmsgRqstDtlSmsSend = value;
    }

    /**
     * Gets the value of the inProcessDetailCmsgRqstDtlSmsStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInProcessDetailCmsgRqstDtlSmsStatus() {
        return inProcessDetailCmsgRqstDtlSmsStatus;
    }

    /**
     * Sets the value of the inProcessDetailCmsgRqstDtlSmsStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInProcessDetailCmsgRqstDtlSmsStatus(String value) {
        this.inProcessDetailCmsgRqstDtlSmsStatus = value;
    }

    /**
     * Gets the value of the inProcessDetailCmsgRqstDtlSmsTotals property.
     * 
     */
    public int getInProcessDetailCmsgRqstDtlSmsTotals() {
        return inProcessDetailCmsgRqstDtlSmsTotals;
    }

    /**
     * Sets the value of the inProcessDetailCmsgRqstDtlSmsTotals property.
     * 
     */
    public void setInProcessDetailCmsgRqstDtlSmsTotals(int value) {
        this.inProcessDetailCmsgRqstDtlSmsTotals = value;
    }

    /**
     * Gets the value of the inProcessDetailCmsgRqstDtlSpecificTimeEnd property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInProcessDetailCmsgRqstDtlSpecificTimeEnd() {
        return inProcessDetailCmsgRqstDtlSpecificTimeEnd;
    }

    /**
     * Sets the value of the inProcessDetailCmsgRqstDtlSpecificTimeEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInProcessDetailCmsgRqstDtlSpecificTimeEnd(XMLGregorianCalendar value) {
        this.inProcessDetailCmsgRqstDtlSpecificTimeEnd = value;
    }

    /**
     * Gets the value of the inProcessDetailCmsgRqstDtlSpecificTimeFlg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInProcessDetailCmsgRqstDtlSpecificTimeFlg() {
        return inProcessDetailCmsgRqstDtlSpecificTimeFlg;
    }

    /**
     * Sets the value of the inProcessDetailCmsgRqstDtlSpecificTimeFlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInProcessDetailCmsgRqstDtlSpecificTimeFlg(String value) {
        this.inProcessDetailCmsgRqstDtlSpecificTimeFlg = value;
    }

    /**
     * Gets the value of the inProcessDetailCmsgRqstDtlSpecificTimeStart property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInProcessDetailCmsgRqstDtlSpecificTimeStart() {
        return inProcessDetailCmsgRqstDtlSpecificTimeStart;
    }

    /**
     * Sets the value of the inProcessDetailCmsgRqstDtlSpecificTimeStart property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInProcessDetailCmsgRqstDtlSpecificTimeStart(XMLGregorianCalendar value) {
        this.inProcessDetailCmsgRqstDtlSpecificTimeStart = value;
    }

    /**
     * Gets the value of the inProcessDetailCmsgRqstDtlTransactionAll property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInProcessDetailCmsgRqstDtlTransactionAll() {
        return inProcessDetailCmsgRqstDtlTransactionAll;
    }

    /**
     * Sets the value of the inProcessDetailCmsgRqstDtlTransactionAll property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInProcessDetailCmsgRqstDtlTransactionAll(String value) {
        this.inProcessDetailCmsgRqstDtlTransactionAll = value;
    }

    /**
     * Gets the value of the inProcessDetailCmsgRqstDtlTransactionId property.
     * 
     */
    public int getInProcessDetailCmsgRqstDtlTransactionId() {
        return inProcessDetailCmsgRqstDtlTransactionId;
    }

    /**
     * Sets the value of the inProcessDetailCmsgRqstDtlTransactionId property.
     * 
     */
    public void setInProcessDetailCmsgRqstDtlTransactionId(int value) {
        this.inProcessDetailCmsgRqstDtlTransactionId = value;
    }

    /**
     * Gets the value of the inProcessDetailCmsgRqstDtlTrxAmountGreater property.
     * 
     */
    public double getInProcessDetailCmsgRqstDtlTrxAmountGreater() {
        return inProcessDetailCmsgRqstDtlTrxAmountGreater;
    }

    /**
     * Sets the value of the inProcessDetailCmsgRqstDtlTrxAmountGreater property.
     * 
     */
    public void setInProcessDetailCmsgRqstDtlTrxAmountGreater(double value) {
        this.inProcessDetailCmsgRqstDtlTrxAmountGreater = value;
    }

    /**
     * Gets the value of the inProcessDetailCmsgRqstDtlTrxAmountLess property.
     * 
     */
    public double getInProcessDetailCmsgRqstDtlTrxAmountLess() {
        return inProcessDetailCmsgRqstDtlTrxAmountLess;
    }

    /**
     * Sets the value of the inProcessDetailCmsgRqstDtlTrxAmountLess property.
     * 
     */
    public void setInProcessDetailCmsgRqstDtlTrxAmountLess(double value) {
        this.inProcessDetailCmsgRqstDtlTrxAmountLess = value;
    }

    /**
     * Gets the value of the inProcessDetailCmsgRqstDtlTrxAmountSet property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInProcessDetailCmsgRqstDtlTrxAmountSet() {
        return inProcessDetailCmsgRqstDtlTrxAmountSet;
    }

    /**
     * Sets the value of the inProcessDetailCmsgRqstDtlTrxAmountSet property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInProcessDetailCmsgRqstDtlTrxAmountSet(String value) {
        this.inProcessDetailCmsgRqstDtlTrxAmountSet = value;
    }

    /**
     * Gets the value of the inProcessDetailCmsgRqstDtlUpdateDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInProcessDetailCmsgRqstDtlUpdateDt() {
        return inProcessDetailCmsgRqstDtlUpdateDt;
    }

    /**
     * Sets the value of the inProcessDetailCmsgRqstDtlUpdateDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInProcessDetailCmsgRqstDtlUpdateDt(XMLGregorianCalendar value) {
        this.inProcessDetailCmsgRqstDtlUpdateDt = value;
    }

    /**
     * Gets the value of the inProcessDetailCmsgRqstDtlUpdateTmstamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInProcessDetailCmsgRqstDtlUpdateTmstamp() {
        return inProcessDetailCmsgRqstDtlUpdateTmstamp;
    }

    /**
     * Sets the value of the inProcessDetailCmsgRqstDtlUpdateTmstamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInProcessDetailCmsgRqstDtlUpdateTmstamp(XMLGregorianCalendar value) {
        this.inProcessDetailCmsgRqstDtlUpdateTmstamp = value;
    }

    /**
     * Gets the value of the inProcessDetailCmsgRqstDtlUpdateUnit property.
     * 
     */
    public int getInProcessDetailCmsgRqstDtlUpdateUnit() {
        return inProcessDetailCmsgRqstDtlUpdateUnit;
    }

    /**
     * Sets the value of the inProcessDetailCmsgRqstDtlUpdateUnit property.
     * 
     */
    public void setInProcessDetailCmsgRqstDtlUpdateUnit(int value) {
        this.inProcessDetailCmsgRqstDtlUpdateUnit = value;
    }

    /**
     * Gets the value of the inProcessDetailCmsgRqstDtlUpdateUser property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInProcessDetailCmsgRqstDtlUpdateUser() {
        return inProcessDetailCmsgRqstDtlUpdateUser;
    }

    /**
     * Sets the value of the inProcessDetailCmsgRqstDtlUpdateUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInProcessDetailCmsgRqstDtlUpdateUser(String value) {
        this.inProcessDetailCmsgRqstDtlUpdateUser = value;
    }

    /**
     * Gets the value of the inProcessHeaderCmsgRqstHdrCmsgRqstHdrSn property.
     * 
     */
    public int getInProcessHeaderCmsgRqstHdrCmsgRqstHdrSn() {
        return inProcessHeaderCmsgRqstHdrCmsgRqstHdrSn;
    }

    /**
     * Sets the value of the inProcessHeaderCmsgRqstHdrCmsgRqstHdrSn property.
     * 
     */
    public void setInProcessHeaderCmsgRqstHdrCmsgRqstHdrSn(int value) {
        this.inProcessHeaderCmsgRqstHdrCmsgRqstHdrSn = value;
    }

    /**
     * Gets the value of the inProcessHeaderCmsgRqstHdrCustomerComments property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInProcessHeaderCmsgRqstHdrCustomerComments() {
        return inProcessHeaderCmsgRqstHdrCustomerComments;
    }

    /**
     * Sets the value of the inProcessHeaderCmsgRqstHdrCustomerComments property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInProcessHeaderCmsgRqstHdrCustomerComments(String value) {
        this.inProcessHeaderCmsgRqstHdrCustomerComments = value;
    }

    /**
     * Gets the value of the inProcessHeaderCmsgRqstHdrEnabledEmails property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInProcessHeaderCmsgRqstHdrEnabledEmails() {
        return inProcessHeaderCmsgRqstHdrEnabledEmails;
    }

    /**
     * Sets the value of the inProcessHeaderCmsgRqstHdrEnabledEmails property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInProcessHeaderCmsgRqstHdrEnabledEmails(String value) {
        this.inProcessHeaderCmsgRqstHdrEnabledEmails = value;
    }

    /**
     * Gets the value of the inProcessHeaderCmsgRqstHdrEnabledSms property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInProcessHeaderCmsgRqstHdrEnabledSms() {
        return inProcessHeaderCmsgRqstHdrEnabledSms;
    }

    /**
     * Sets the value of the inProcessHeaderCmsgRqstHdrEnabledSms property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInProcessHeaderCmsgRqstHdrEnabledSms(String value) {
        this.inProcessHeaderCmsgRqstHdrEnabledSms = value;
    }

    /**
     * Gets the value of the inProcessHeaderCmsgRqstHdrInsertDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInProcessHeaderCmsgRqstHdrInsertDt() {
        return inProcessHeaderCmsgRqstHdrInsertDt;
    }

    /**
     * Sets the value of the inProcessHeaderCmsgRqstHdrInsertDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInProcessHeaderCmsgRqstHdrInsertDt(XMLGregorianCalendar value) {
        this.inProcessHeaderCmsgRqstHdrInsertDt = value;
    }

    /**
     * Gets the value of the inProcessHeaderCmsgRqstHdrInsertTmstamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInProcessHeaderCmsgRqstHdrInsertTmstamp() {
        return inProcessHeaderCmsgRqstHdrInsertTmstamp;
    }

    /**
     * Sets the value of the inProcessHeaderCmsgRqstHdrInsertTmstamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInProcessHeaderCmsgRqstHdrInsertTmstamp(XMLGregorianCalendar value) {
        this.inProcessHeaderCmsgRqstHdrInsertTmstamp = value;
    }

    /**
     * Gets the value of the inProcessHeaderCmsgRqstHdrInsertUnit property.
     * 
     */
    public int getInProcessHeaderCmsgRqstHdrInsertUnit() {
        return inProcessHeaderCmsgRqstHdrInsertUnit;
    }

    /**
     * Sets the value of the inProcessHeaderCmsgRqstHdrInsertUnit property.
     * 
     */
    public void setInProcessHeaderCmsgRqstHdrInsertUnit(int value) {
        this.inProcessHeaderCmsgRqstHdrInsertUnit = value;
    }

    /**
     * Gets the value of the inProcessHeaderCmsgRqstHdrInsertUser property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInProcessHeaderCmsgRqstHdrInsertUser() {
        return inProcessHeaderCmsgRqstHdrInsertUser;
    }

    /**
     * Sets the value of the inProcessHeaderCmsgRqstHdrInsertUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInProcessHeaderCmsgRqstHdrInsertUser(String value) {
        this.inProcessHeaderCmsgRqstHdrInsertUser = value;
    }

    /**
     * Gets the value of the inProcessHeaderCmsgRqstHdrServiceAccount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInProcessHeaderCmsgRqstHdrServiceAccount() {
        return inProcessHeaderCmsgRqstHdrServiceAccount;
    }

    /**
     * Sets the value of the inProcessHeaderCmsgRqstHdrServiceAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInProcessHeaderCmsgRqstHdrServiceAccount(String value) {
        this.inProcessHeaderCmsgRqstHdrServiceAccount = value;
    }

    /**
     * Gets the value of the inProcessHeaderCmsgRqstHdrServiceSystem property.
     * 
     */
    public short getInProcessHeaderCmsgRqstHdrServiceSystem() {
        return inProcessHeaderCmsgRqstHdrServiceSystem;
    }

    /**
     * Sets the value of the inProcessHeaderCmsgRqstHdrServiceSystem property.
     * 
     */
    public void setInProcessHeaderCmsgRqstHdrServiceSystem(short value) {
        this.inProcessHeaderCmsgRqstHdrServiceSystem = value;
    }

    /**
     * Gets the value of the inProcessHeaderCmsgRqstHdrUpdateDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInProcessHeaderCmsgRqstHdrUpdateDt() {
        return inProcessHeaderCmsgRqstHdrUpdateDt;
    }

    /**
     * Sets the value of the inProcessHeaderCmsgRqstHdrUpdateDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInProcessHeaderCmsgRqstHdrUpdateDt(XMLGregorianCalendar value) {
        this.inProcessHeaderCmsgRqstHdrUpdateDt = value;
    }

    /**
     * Gets the value of the inProcessHeaderCmsgRqstHdrUpdateTmstamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInProcessHeaderCmsgRqstHdrUpdateTmstamp() {
        return inProcessHeaderCmsgRqstHdrUpdateTmstamp;
    }

    /**
     * Sets the value of the inProcessHeaderCmsgRqstHdrUpdateTmstamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInProcessHeaderCmsgRqstHdrUpdateTmstamp(XMLGregorianCalendar value) {
        this.inProcessHeaderCmsgRqstHdrUpdateTmstamp = value;
    }

    /**
     * Gets the value of the inProcessHeaderCmsgRqstHdrUpdateUnit property.
     * 
     */
    public int getInProcessHeaderCmsgRqstHdrUpdateUnit() {
        return inProcessHeaderCmsgRqstHdrUpdateUnit;
    }

    /**
     * Sets the value of the inProcessHeaderCmsgRqstHdrUpdateUnit property.
     * 
     */
    public void setInProcessHeaderCmsgRqstHdrUpdateUnit(int value) {
        this.inProcessHeaderCmsgRqstHdrUpdateUnit = value;
    }

    /**
     * Gets the value of the inProcessHeaderCmsgRqstHdrUpdateUser property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInProcessHeaderCmsgRqstHdrUpdateUser() {
        return inProcessHeaderCmsgRqstHdrUpdateUser;
    }

    /**
     * Sets the value of the inProcessHeaderCmsgRqstHdrUpdateUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInProcessHeaderCmsgRqstHdrUpdateUser(String value) {
        this.inProcessHeaderCmsgRqstHdrUpdateUser = value;
    }

    /**
     * Gets the value of the inProcessServiceProfitsAccountAccountCd property.
     * 
     */
    public short getInProcessServiceProfitsAccountAccountCd() {
        return inProcessServiceProfitsAccountAccountCd;
    }

    /**
     * Sets the value of the inProcessServiceProfitsAccountAccountCd property.
     * 
     */
    public void setInProcessServiceProfitsAccountAccountCd(short value) {
        this.inProcessServiceProfitsAccountAccountCd = value;
    }

    /**
     * Gets the value of the inProcessServiceProfitsAccountAccountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInProcessServiceProfitsAccountAccountNumber() {
        return inProcessServiceProfitsAccountAccountNumber;
    }

    /**
     * Sets the value of the inProcessServiceProfitsAccountAccountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInProcessServiceProfitsAccountAccountNumber(String value) {
        this.inProcessServiceProfitsAccountAccountNumber = value;
    }

    /**
     * Gets the value of the inProcessServiceProfitsAccountPrftSystem property.
     * 
     */
    public short getInProcessServiceProfitsAccountPrftSystem() {
        return inProcessServiceProfitsAccountPrftSystem;
    }

    /**
     * Sets the value of the inProcessServiceProfitsAccountPrftSystem property.
     * 
     */
    public void setInProcessServiceProfitsAccountPrftSystem(short value) {
        this.inProcessServiceProfitsAccountPrftSystem = value;
    }

    /**
     * Gets the value of the inTrxPrftTransactionIdTransact property.
     * 
     */
    public int getInTrxPrftTransactionIdTransact() {
        return inTrxPrftTransactionIdTransact;
    }

    /**
     * Sets the value of the inTrxPrftTransactionIdTransact property.
     * 
     */
    public void setInTrxPrftTransactionIdTransact(int value) {
        this.inTrxPrftTransactionIdTransact = value;
    }

}
