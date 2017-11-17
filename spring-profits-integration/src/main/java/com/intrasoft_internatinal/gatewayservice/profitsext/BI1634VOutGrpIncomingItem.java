
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for BI1634VOutGrpIncomingItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BI1634VOutGrpIncomingItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OutGrpIncomingOutGrmAaIefSuppliedNumber4" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutGrpIncomingOutGrmAcccodeDescCharSuppliedChar100" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpIncomingOutGrmBillBillAccountNumb" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpIncomingOutGrmBillBillAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpIncomingOutGrmBillBillCheckDigit" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutGrpIncomingOutGrmBillBillIssueDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutGrpIncomingOutGrmBillBillIssueDate_Str" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpIncomingOutGrmChqTypeCharSuppliedChar20" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpIncomingOutGrmClearingErrCharSuppliedChar100" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpIncomingOutGrmClearingStsCharSuppliedChar20" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpIncomingOutGrmDhsseIncomingDhsseIncomingAccCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpIncomingOutGrmDhsseIncomingDhsseIncomingAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpIncomingOutGrmDhsseIncomingDhsseIncomingBuyBankCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpIncomingOutGrmDhsseIncomingDhsseIncomingBuyBranch" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpIncomingOutGrmDhsseIncomingDhsseIncomingChqNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpIncomingOutGrmDhsseIncomingDhsseIncomingCorrSendDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutGrpIncomingOutGrmDhsseIncomingDhsseIncomingCorrSendDate_Str" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpIncomingOutGrmDhsseIncomingDhsseIncomingCorrSettleDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutGrpIncomingOutGrmDhsseIncomingDhsseIncomingCorrSettleDate_Str" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpIncomingOutGrmDhsseIncomingDhsseIncomingDhsseRef" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpIncomingOutGrmDhsseIncomingDhsseIncomingEntryStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpIncomingOutGrmDhsseIncomingDhsseIncomingFilename" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpIncomingOutGrmDhsseIncomingDhsseIncomingIbanCd" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutGrpIncomingOutGrmDhsseIncomingDhsseIncomingIbanCntry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpIncomingOutGrmDhsseIncomingDhsseIncomingIbanDigits" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpIncomingOutGrmDhsseIncomingDhsseIncomingIdJustific" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGrpIncomingOutGrmDhsseIncomingDhsseIncomingIdentifier" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGrpIncomingOutGrmDhsseIncomingDhsseIncomingIncludeInFile" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpIncomingOutGrmDhsseIncomingDhsseIncomingIssDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpIncomingOutGrmDhsseIncomingDhsseIncomingOnlTmstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutGrpIncomingOutGrmDhsseIncomingDhsseIncomingOnlTmstamp_Str" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpIncomingOutGrmDhsseIncomingDhsseIncomingOnlTunDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutGrpIncomingOutGrmDhsseIncomingDhsseIncomingOnlTunDate_Str" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpIncomingOutGrmDhsseIncomingDhsseIncomingOnlTunInternalSn" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutGrpIncomingOutGrmDhsseIncomingDhsseIncomingOnlTunUnit" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGrpIncomingOutGrmDhsseIncomingDhsseIncomingOnlTunUsr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpIncomingOutGrmDhsseIncomingDhsseIncomingOnlTunUsrSn" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGrpIncomingOutGrmDhsseIncomingDhsseIncomingOverdrawnFlg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpIncomingOutGrmDhsseIncomingDhsseIncomingPayAccno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpIncomingOutGrmDhsseIncomingDhsseIncomingPayBranch" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpIncomingOutGrmDhsseIncomingDhsseIncomingPayCurrency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpIncomingOutGrmDhsseIncomingDhsseIncomingRepresentationFlg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpIncomingOutGrmDhsseIncomingDhsseIncomingSettleRef" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpIncomingOutGrmDhsseIncomingDhsseIncomingTranCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpIncomingOutGrmDhsseIncomingDhsseIncomingTranDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpIncomingOutGrmSelectIefSuppliedSelectChar" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpIncomingOutGrmDhsseIncomingDhsseIncomingFileData" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpIncomingOutGrmDhsseIncomingDhsseIncomingUpdatedFileData" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BI1634VOutGrpIncomingItem", propOrder = {
    "outGrpIncomingOutGrmAaIefSuppliedNumber4",
    "outGrpIncomingOutGrmAcccodeDescCharSuppliedChar100",
    "outGrpIncomingOutGrmBillBillAccountNumb",
    "outGrpIncomingOutGrmBillBillAmount",
    "outGrpIncomingOutGrmBillBillCheckDigit",
    "outGrpIncomingOutGrmBillBillIssueDate",
    "outGrpIncomingOutGrmBillBillIssueDateStr",
    "outGrpIncomingOutGrmChqTypeCharSuppliedChar20",
    "outGrpIncomingOutGrmClearingErrCharSuppliedChar100",
    "outGrpIncomingOutGrmClearingStsCharSuppliedChar20",
    "outGrpIncomingOutGrmDhsseIncomingDhsseIncomingAccCode",
    "outGrpIncomingOutGrmDhsseIncomingDhsseIncomingAmount",
    "outGrpIncomingOutGrmDhsseIncomingDhsseIncomingBuyBankCode",
    "outGrpIncomingOutGrmDhsseIncomingDhsseIncomingBuyBranch",
    "outGrpIncomingOutGrmDhsseIncomingDhsseIncomingChqNo",
    "outGrpIncomingOutGrmDhsseIncomingDhsseIncomingCorrSendDate",
    "outGrpIncomingOutGrmDhsseIncomingDhsseIncomingCorrSendDateStr",
    "outGrpIncomingOutGrmDhsseIncomingDhsseIncomingCorrSettleDate",
    "outGrpIncomingOutGrmDhsseIncomingDhsseIncomingCorrSettleDateStr",
    "outGrpIncomingOutGrmDhsseIncomingDhsseIncomingDhsseRef",
    "outGrpIncomingOutGrmDhsseIncomingDhsseIncomingEntryStatus",
    "outGrpIncomingOutGrmDhsseIncomingDhsseIncomingFilename",
    "outGrpIncomingOutGrmDhsseIncomingDhsseIncomingIbanCd",
    "outGrpIncomingOutGrmDhsseIncomingDhsseIncomingIbanCntry",
    "outGrpIncomingOutGrmDhsseIncomingDhsseIncomingIbanDigits",
    "outGrpIncomingOutGrmDhsseIncomingDhsseIncomingIdJustific",
    "outGrpIncomingOutGrmDhsseIncomingDhsseIncomingIdentifier",
    "outGrpIncomingOutGrmDhsseIncomingDhsseIncomingIncludeInFile",
    "outGrpIncomingOutGrmDhsseIncomingDhsseIncomingIssDate",
    "outGrpIncomingOutGrmDhsseIncomingDhsseIncomingOnlTmstamp",
    "outGrpIncomingOutGrmDhsseIncomingDhsseIncomingOnlTmstampStr",
    "outGrpIncomingOutGrmDhsseIncomingDhsseIncomingOnlTunDate",
    "outGrpIncomingOutGrmDhsseIncomingDhsseIncomingOnlTunDateStr",
    "outGrpIncomingOutGrmDhsseIncomingDhsseIncomingOnlTunInternalSn",
    "outGrpIncomingOutGrmDhsseIncomingDhsseIncomingOnlTunUnit",
    "outGrpIncomingOutGrmDhsseIncomingDhsseIncomingOnlTunUsr",
    "outGrpIncomingOutGrmDhsseIncomingDhsseIncomingOnlTunUsrSn",
    "outGrpIncomingOutGrmDhsseIncomingDhsseIncomingOverdrawnFlg",
    "outGrpIncomingOutGrmDhsseIncomingDhsseIncomingPayAccno",
    "outGrpIncomingOutGrmDhsseIncomingDhsseIncomingPayBranch",
    "outGrpIncomingOutGrmDhsseIncomingDhsseIncomingPayCurrency",
    "outGrpIncomingOutGrmDhsseIncomingDhsseIncomingRepresentationFlg",
    "outGrpIncomingOutGrmDhsseIncomingDhsseIncomingSettleRef",
    "outGrpIncomingOutGrmDhsseIncomingDhsseIncomingTranCode",
    "outGrpIncomingOutGrmDhsseIncomingDhsseIncomingTranDate",
    "outGrpIncomingOutGrmSelectIefSuppliedSelectChar",
    "outGrpIncomingOutGrmDhsseIncomingDhsseIncomingFileData",
    "outGrpIncomingOutGrmDhsseIncomingDhsseIncomingUpdatedFileData"
})
public class BI1634VOutGrpIncomingItem {

    @XmlElement(name = "OutGrpIncomingOutGrmAaIefSuppliedNumber4")
    protected short outGrpIncomingOutGrmAaIefSuppliedNumber4;
    @XmlElement(name = "OutGrpIncomingOutGrmAcccodeDescCharSuppliedChar100")
    protected String outGrpIncomingOutGrmAcccodeDescCharSuppliedChar100;
    @XmlElement(name = "OutGrpIncomingOutGrmBillBillAccountNumb")
    protected String outGrpIncomingOutGrmBillBillAccountNumb;
    @XmlElement(name = "OutGrpIncomingOutGrmBillBillAmount", required = true)
    protected BigDecimal outGrpIncomingOutGrmBillBillAmount;
    @XmlElement(name = "OutGrpIncomingOutGrmBillBillCheckDigit")
    protected short outGrpIncomingOutGrmBillBillCheckDigit;
    @XmlElement(name = "OutGrpIncomingOutGrmBillBillIssueDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outGrpIncomingOutGrmBillBillIssueDate;
    @XmlElement(name = "OutGrpIncomingOutGrmBillBillIssueDate_Str")
    protected String outGrpIncomingOutGrmBillBillIssueDateStr;
    @XmlElement(name = "OutGrpIncomingOutGrmChqTypeCharSuppliedChar20")
    protected String outGrpIncomingOutGrmChqTypeCharSuppliedChar20;
    @XmlElement(name = "OutGrpIncomingOutGrmClearingErrCharSuppliedChar100")
    protected String outGrpIncomingOutGrmClearingErrCharSuppliedChar100;
    @XmlElement(name = "OutGrpIncomingOutGrmClearingStsCharSuppliedChar20")
    protected String outGrpIncomingOutGrmClearingStsCharSuppliedChar20;
    @XmlElement(name = "OutGrpIncomingOutGrmDhsseIncomingDhsseIncomingAccCode")
    protected String outGrpIncomingOutGrmDhsseIncomingDhsseIncomingAccCode;
    @XmlElement(name = "OutGrpIncomingOutGrmDhsseIncomingDhsseIncomingAmount")
    protected String outGrpIncomingOutGrmDhsseIncomingDhsseIncomingAmount;
    @XmlElement(name = "OutGrpIncomingOutGrmDhsseIncomingDhsseIncomingBuyBankCode")
    protected String outGrpIncomingOutGrmDhsseIncomingDhsseIncomingBuyBankCode;
    @XmlElement(name = "OutGrpIncomingOutGrmDhsseIncomingDhsseIncomingBuyBranch")
    protected String outGrpIncomingOutGrmDhsseIncomingDhsseIncomingBuyBranch;
    @XmlElement(name = "OutGrpIncomingOutGrmDhsseIncomingDhsseIncomingChqNo")
    protected String outGrpIncomingOutGrmDhsseIncomingDhsseIncomingChqNo;
    @XmlElement(name = "OutGrpIncomingOutGrmDhsseIncomingDhsseIncomingCorrSendDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outGrpIncomingOutGrmDhsseIncomingDhsseIncomingCorrSendDate;
    @XmlElement(name = "OutGrpIncomingOutGrmDhsseIncomingDhsseIncomingCorrSendDate_Str")
    protected String outGrpIncomingOutGrmDhsseIncomingDhsseIncomingCorrSendDateStr;
    @XmlElement(name = "OutGrpIncomingOutGrmDhsseIncomingDhsseIncomingCorrSettleDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outGrpIncomingOutGrmDhsseIncomingDhsseIncomingCorrSettleDate;
    @XmlElement(name = "OutGrpIncomingOutGrmDhsseIncomingDhsseIncomingCorrSettleDate_Str")
    protected String outGrpIncomingOutGrmDhsseIncomingDhsseIncomingCorrSettleDateStr;
    @XmlElement(name = "OutGrpIncomingOutGrmDhsseIncomingDhsseIncomingDhsseRef")
    protected String outGrpIncomingOutGrmDhsseIncomingDhsseIncomingDhsseRef;
    @XmlElement(name = "OutGrpIncomingOutGrmDhsseIncomingDhsseIncomingEntryStatus")
    protected String outGrpIncomingOutGrmDhsseIncomingDhsseIncomingEntryStatus;
    @XmlElement(name = "OutGrpIncomingOutGrmDhsseIncomingDhsseIncomingFilename")
    protected String outGrpIncomingOutGrmDhsseIncomingDhsseIncomingFilename;
    @XmlElement(name = "OutGrpIncomingOutGrmDhsseIncomingDhsseIncomingIbanCd")
    protected short outGrpIncomingOutGrmDhsseIncomingDhsseIncomingIbanCd;
    @XmlElement(name = "OutGrpIncomingOutGrmDhsseIncomingDhsseIncomingIbanCntry")
    protected String outGrpIncomingOutGrmDhsseIncomingDhsseIncomingIbanCntry;
    @XmlElement(name = "OutGrpIncomingOutGrmDhsseIncomingDhsseIncomingIbanDigits")
    protected String outGrpIncomingOutGrmDhsseIncomingDhsseIncomingIbanDigits;
    @XmlElement(name = "OutGrpIncomingOutGrmDhsseIncomingDhsseIncomingIdJustific")
    protected int outGrpIncomingOutGrmDhsseIncomingDhsseIncomingIdJustific;
    @XmlElement(name = "OutGrpIncomingOutGrmDhsseIncomingDhsseIncomingIdentifier")
    protected int outGrpIncomingOutGrmDhsseIncomingDhsseIncomingIdentifier;
    @XmlElement(name = "OutGrpIncomingOutGrmDhsseIncomingDhsseIncomingIncludeInFile")
    protected String outGrpIncomingOutGrmDhsseIncomingDhsseIncomingIncludeInFile;
    @XmlElement(name = "OutGrpIncomingOutGrmDhsseIncomingDhsseIncomingIssDate")
    protected String outGrpIncomingOutGrmDhsseIncomingDhsseIncomingIssDate;
    @XmlElement(name = "OutGrpIncomingOutGrmDhsseIncomingDhsseIncomingOnlTmstamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outGrpIncomingOutGrmDhsseIncomingDhsseIncomingOnlTmstamp;
    @XmlElement(name = "OutGrpIncomingOutGrmDhsseIncomingDhsseIncomingOnlTmstamp_Str")
    protected String outGrpIncomingOutGrmDhsseIncomingDhsseIncomingOnlTmstampStr;
    @XmlElement(name = "OutGrpIncomingOutGrmDhsseIncomingDhsseIncomingOnlTunDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outGrpIncomingOutGrmDhsseIncomingDhsseIncomingOnlTunDate;
    @XmlElement(name = "OutGrpIncomingOutGrmDhsseIncomingDhsseIncomingOnlTunDate_Str")
    protected String outGrpIncomingOutGrmDhsseIncomingDhsseIncomingOnlTunDateStr;
    @XmlElement(name = "OutGrpIncomingOutGrmDhsseIncomingDhsseIncomingOnlTunInternalSn")
    protected short outGrpIncomingOutGrmDhsseIncomingDhsseIncomingOnlTunInternalSn;
    @XmlElement(name = "OutGrpIncomingOutGrmDhsseIncomingDhsseIncomingOnlTunUnit")
    protected int outGrpIncomingOutGrmDhsseIncomingDhsseIncomingOnlTunUnit;
    @XmlElement(name = "OutGrpIncomingOutGrmDhsseIncomingDhsseIncomingOnlTunUsr")
    protected String outGrpIncomingOutGrmDhsseIncomingDhsseIncomingOnlTunUsr;
    @XmlElement(name = "OutGrpIncomingOutGrmDhsseIncomingDhsseIncomingOnlTunUsrSn")
    protected int outGrpIncomingOutGrmDhsseIncomingDhsseIncomingOnlTunUsrSn;
    @XmlElement(name = "OutGrpIncomingOutGrmDhsseIncomingDhsseIncomingOverdrawnFlg")
    protected String outGrpIncomingOutGrmDhsseIncomingDhsseIncomingOverdrawnFlg;
    @XmlElement(name = "OutGrpIncomingOutGrmDhsseIncomingDhsseIncomingPayAccno")
    protected String outGrpIncomingOutGrmDhsseIncomingDhsseIncomingPayAccno;
    @XmlElement(name = "OutGrpIncomingOutGrmDhsseIncomingDhsseIncomingPayBranch")
    protected String outGrpIncomingOutGrmDhsseIncomingDhsseIncomingPayBranch;
    @XmlElement(name = "OutGrpIncomingOutGrmDhsseIncomingDhsseIncomingPayCurrency")
    protected String outGrpIncomingOutGrmDhsseIncomingDhsseIncomingPayCurrency;
    @XmlElement(name = "OutGrpIncomingOutGrmDhsseIncomingDhsseIncomingRepresentationFlg")
    protected String outGrpIncomingOutGrmDhsseIncomingDhsseIncomingRepresentationFlg;
    @XmlElement(name = "OutGrpIncomingOutGrmDhsseIncomingDhsseIncomingSettleRef")
    protected String outGrpIncomingOutGrmDhsseIncomingDhsseIncomingSettleRef;
    @XmlElement(name = "OutGrpIncomingOutGrmDhsseIncomingDhsseIncomingTranCode")
    protected String outGrpIncomingOutGrmDhsseIncomingDhsseIncomingTranCode;
    @XmlElement(name = "OutGrpIncomingOutGrmDhsseIncomingDhsseIncomingTranDate")
    protected String outGrpIncomingOutGrmDhsseIncomingDhsseIncomingTranDate;
    @XmlElement(name = "OutGrpIncomingOutGrmSelectIefSuppliedSelectChar")
    protected String outGrpIncomingOutGrmSelectIefSuppliedSelectChar;
    @XmlElement(name = "OutGrpIncomingOutGrmDhsseIncomingDhsseIncomingFileData")
    protected String outGrpIncomingOutGrmDhsseIncomingDhsseIncomingFileData;
    @XmlElement(name = "OutGrpIncomingOutGrmDhsseIncomingDhsseIncomingUpdatedFileData")
    protected String outGrpIncomingOutGrmDhsseIncomingDhsseIncomingUpdatedFileData;

    /**
     * Gets the value of the outGrpIncomingOutGrmAaIefSuppliedNumber4 property.
     * 
     */
    public short getOutGrpIncomingOutGrmAaIefSuppliedNumber4() {
        return outGrpIncomingOutGrmAaIefSuppliedNumber4;
    }

    /**
     * Sets the value of the outGrpIncomingOutGrmAaIefSuppliedNumber4 property.
     * 
     */
    public void setOutGrpIncomingOutGrmAaIefSuppliedNumber4(short value) {
        this.outGrpIncomingOutGrmAaIefSuppliedNumber4 = value;
    }

    /**
     * Gets the value of the outGrpIncomingOutGrmAcccodeDescCharSuppliedChar100 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpIncomingOutGrmAcccodeDescCharSuppliedChar100() {
        return outGrpIncomingOutGrmAcccodeDescCharSuppliedChar100;
    }

    /**
     * Sets the value of the outGrpIncomingOutGrmAcccodeDescCharSuppliedChar100 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpIncomingOutGrmAcccodeDescCharSuppliedChar100(String value) {
        this.outGrpIncomingOutGrmAcccodeDescCharSuppliedChar100 = value;
    }

    /**
     * Gets the value of the outGrpIncomingOutGrmBillBillAccountNumb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpIncomingOutGrmBillBillAccountNumb() {
        return outGrpIncomingOutGrmBillBillAccountNumb;
    }

    /**
     * Sets the value of the outGrpIncomingOutGrmBillBillAccountNumb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpIncomingOutGrmBillBillAccountNumb(String value) {
        this.outGrpIncomingOutGrmBillBillAccountNumb = value;
    }

    /**
     * Gets the value of the outGrpIncomingOutGrmBillBillAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpIncomingOutGrmBillBillAmount() {
        return outGrpIncomingOutGrmBillBillAmount;
    }

    /**
     * Sets the value of the outGrpIncomingOutGrmBillBillAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpIncomingOutGrmBillBillAmount(BigDecimal value) {
        this.outGrpIncomingOutGrmBillBillAmount = value;
    }

    /**
     * Gets the value of the outGrpIncomingOutGrmBillBillCheckDigit property.
     * 
     */
    public short getOutGrpIncomingOutGrmBillBillCheckDigit() {
        return outGrpIncomingOutGrmBillBillCheckDigit;
    }

    /**
     * Sets the value of the outGrpIncomingOutGrmBillBillCheckDigit property.
     * 
     */
    public void setOutGrpIncomingOutGrmBillBillCheckDigit(short value) {
        this.outGrpIncomingOutGrmBillBillCheckDigit = value;
    }

    /**
     * Gets the value of the outGrpIncomingOutGrmBillBillIssueDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutGrpIncomingOutGrmBillBillIssueDate() {
        return outGrpIncomingOutGrmBillBillIssueDate;
    }

    /**
     * Sets the value of the outGrpIncomingOutGrmBillBillIssueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutGrpIncomingOutGrmBillBillIssueDate(XMLGregorianCalendar value) {
        this.outGrpIncomingOutGrmBillBillIssueDate = value;
    }

    /**
     * Gets the value of the outGrpIncomingOutGrmBillBillIssueDateStr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpIncomingOutGrmBillBillIssueDateStr() {
        return outGrpIncomingOutGrmBillBillIssueDateStr;
    }

    /**
     * Sets the value of the outGrpIncomingOutGrmBillBillIssueDateStr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpIncomingOutGrmBillBillIssueDateStr(String value) {
        this.outGrpIncomingOutGrmBillBillIssueDateStr = value;
    }

    /**
     * Gets the value of the outGrpIncomingOutGrmChqTypeCharSuppliedChar20 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpIncomingOutGrmChqTypeCharSuppliedChar20() {
        return outGrpIncomingOutGrmChqTypeCharSuppliedChar20;
    }

    /**
     * Sets the value of the outGrpIncomingOutGrmChqTypeCharSuppliedChar20 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpIncomingOutGrmChqTypeCharSuppliedChar20(String value) {
        this.outGrpIncomingOutGrmChqTypeCharSuppliedChar20 = value;
    }

    /**
     * Gets the value of the outGrpIncomingOutGrmClearingErrCharSuppliedChar100 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpIncomingOutGrmClearingErrCharSuppliedChar100() {
        return outGrpIncomingOutGrmClearingErrCharSuppliedChar100;
    }

    /**
     * Sets the value of the outGrpIncomingOutGrmClearingErrCharSuppliedChar100 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpIncomingOutGrmClearingErrCharSuppliedChar100(String value) {
        this.outGrpIncomingOutGrmClearingErrCharSuppliedChar100 = value;
    }

    /**
     * Gets the value of the outGrpIncomingOutGrmClearingStsCharSuppliedChar20 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpIncomingOutGrmClearingStsCharSuppliedChar20() {
        return outGrpIncomingOutGrmClearingStsCharSuppliedChar20;
    }

    /**
     * Sets the value of the outGrpIncomingOutGrmClearingStsCharSuppliedChar20 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpIncomingOutGrmClearingStsCharSuppliedChar20(String value) {
        this.outGrpIncomingOutGrmClearingStsCharSuppliedChar20 = value;
    }

    /**
     * Gets the value of the outGrpIncomingOutGrmDhsseIncomingDhsseIncomingAccCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpIncomingOutGrmDhsseIncomingDhsseIncomingAccCode() {
        return outGrpIncomingOutGrmDhsseIncomingDhsseIncomingAccCode;
    }

    /**
     * Sets the value of the outGrpIncomingOutGrmDhsseIncomingDhsseIncomingAccCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpIncomingOutGrmDhsseIncomingDhsseIncomingAccCode(String value) {
        this.outGrpIncomingOutGrmDhsseIncomingDhsseIncomingAccCode = value;
    }

    /**
     * Gets the value of the outGrpIncomingOutGrmDhsseIncomingDhsseIncomingAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpIncomingOutGrmDhsseIncomingDhsseIncomingAmount() {
        return outGrpIncomingOutGrmDhsseIncomingDhsseIncomingAmount;
    }

    /**
     * Sets the value of the outGrpIncomingOutGrmDhsseIncomingDhsseIncomingAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpIncomingOutGrmDhsseIncomingDhsseIncomingAmount(String value) {
        this.outGrpIncomingOutGrmDhsseIncomingDhsseIncomingAmount = value;
    }

    /**
     * Gets the value of the outGrpIncomingOutGrmDhsseIncomingDhsseIncomingBuyBankCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpIncomingOutGrmDhsseIncomingDhsseIncomingBuyBankCode() {
        return outGrpIncomingOutGrmDhsseIncomingDhsseIncomingBuyBankCode;
    }

    /**
     * Sets the value of the outGrpIncomingOutGrmDhsseIncomingDhsseIncomingBuyBankCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpIncomingOutGrmDhsseIncomingDhsseIncomingBuyBankCode(String value) {
        this.outGrpIncomingOutGrmDhsseIncomingDhsseIncomingBuyBankCode = value;
    }

    /**
     * Gets the value of the outGrpIncomingOutGrmDhsseIncomingDhsseIncomingBuyBranch property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpIncomingOutGrmDhsseIncomingDhsseIncomingBuyBranch() {
        return outGrpIncomingOutGrmDhsseIncomingDhsseIncomingBuyBranch;
    }

    /**
     * Sets the value of the outGrpIncomingOutGrmDhsseIncomingDhsseIncomingBuyBranch property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpIncomingOutGrmDhsseIncomingDhsseIncomingBuyBranch(String value) {
        this.outGrpIncomingOutGrmDhsseIncomingDhsseIncomingBuyBranch = value;
    }

    /**
     * Gets the value of the outGrpIncomingOutGrmDhsseIncomingDhsseIncomingChqNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpIncomingOutGrmDhsseIncomingDhsseIncomingChqNo() {
        return outGrpIncomingOutGrmDhsseIncomingDhsseIncomingChqNo;
    }

    /**
     * Sets the value of the outGrpIncomingOutGrmDhsseIncomingDhsseIncomingChqNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpIncomingOutGrmDhsseIncomingDhsseIncomingChqNo(String value) {
        this.outGrpIncomingOutGrmDhsseIncomingDhsseIncomingChqNo = value;
    }

    /**
     * Gets the value of the outGrpIncomingOutGrmDhsseIncomingDhsseIncomingCorrSendDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutGrpIncomingOutGrmDhsseIncomingDhsseIncomingCorrSendDate() {
        return outGrpIncomingOutGrmDhsseIncomingDhsseIncomingCorrSendDate;
    }

    /**
     * Sets the value of the outGrpIncomingOutGrmDhsseIncomingDhsseIncomingCorrSendDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutGrpIncomingOutGrmDhsseIncomingDhsseIncomingCorrSendDate(XMLGregorianCalendar value) {
        this.outGrpIncomingOutGrmDhsseIncomingDhsseIncomingCorrSendDate = value;
    }

    /**
     * Gets the value of the outGrpIncomingOutGrmDhsseIncomingDhsseIncomingCorrSendDateStr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpIncomingOutGrmDhsseIncomingDhsseIncomingCorrSendDateStr() {
        return outGrpIncomingOutGrmDhsseIncomingDhsseIncomingCorrSendDateStr;
    }

    /**
     * Sets the value of the outGrpIncomingOutGrmDhsseIncomingDhsseIncomingCorrSendDateStr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpIncomingOutGrmDhsseIncomingDhsseIncomingCorrSendDateStr(String value) {
        this.outGrpIncomingOutGrmDhsseIncomingDhsseIncomingCorrSendDateStr = value;
    }

    /**
     * Gets the value of the outGrpIncomingOutGrmDhsseIncomingDhsseIncomingCorrSettleDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutGrpIncomingOutGrmDhsseIncomingDhsseIncomingCorrSettleDate() {
        return outGrpIncomingOutGrmDhsseIncomingDhsseIncomingCorrSettleDate;
    }

    /**
     * Sets the value of the outGrpIncomingOutGrmDhsseIncomingDhsseIncomingCorrSettleDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutGrpIncomingOutGrmDhsseIncomingDhsseIncomingCorrSettleDate(XMLGregorianCalendar value) {
        this.outGrpIncomingOutGrmDhsseIncomingDhsseIncomingCorrSettleDate = value;
    }

    /**
     * Gets the value of the outGrpIncomingOutGrmDhsseIncomingDhsseIncomingCorrSettleDateStr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpIncomingOutGrmDhsseIncomingDhsseIncomingCorrSettleDateStr() {
        return outGrpIncomingOutGrmDhsseIncomingDhsseIncomingCorrSettleDateStr;
    }

    /**
     * Sets the value of the outGrpIncomingOutGrmDhsseIncomingDhsseIncomingCorrSettleDateStr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpIncomingOutGrmDhsseIncomingDhsseIncomingCorrSettleDateStr(String value) {
        this.outGrpIncomingOutGrmDhsseIncomingDhsseIncomingCorrSettleDateStr = value;
    }

    /**
     * Gets the value of the outGrpIncomingOutGrmDhsseIncomingDhsseIncomingDhsseRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpIncomingOutGrmDhsseIncomingDhsseIncomingDhsseRef() {
        return outGrpIncomingOutGrmDhsseIncomingDhsseIncomingDhsseRef;
    }

    /**
     * Sets the value of the outGrpIncomingOutGrmDhsseIncomingDhsseIncomingDhsseRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpIncomingOutGrmDhsseIncomingDhsseIncomingDhsseRef(String value) {
        this.outGrpIncomingOutGrmDhsseIncomingDhsseIncomingDhsseRef = value;
    }

    /**
     * Gets the value of the outGrpIncomingOutGrmDhsseIncomingDhsseIncomingEntryStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpIncomingOutGrmDhsseIncomingDhsseIncomingEntryStatus() {
        return outGrpIncomingOutGrmDhsseIncomingDhsseIncomingEntryStatus;
    }

    /**
     * Sets the value of the outGrpIncomingOutGrmDhsseIncomingDhsseIncomingEntryStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpIncomingOutGrmDhsseIncomingDhsseIncomingEntryStatus(String value) {
        this.outGrpIncomingOutGrmDhsseIncomingDhsseIncomingEntryStatus = value;
    }

    /**
     * Gets the value of the outGrpIncomingOutGrmDhsseIncomingDhsseIncomingFilename property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpIncomingOutGrmDhsseIncomingDhsseIncomingFilename() {
        return outGrpIncomingOutGrmDhsseIncomingDhsseIncomingFilename;
    }

    /**
     * Sets the value of the outGrpIncomingOutGrmDhsseIncomingDhsseIncomingFilename property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpIncomingOutGrmDhsseIncomingDhsseIncomingFilename(String value) {
        this.outGrpIncomingOutGrmDhsseIncomingDhsseIncomingFilename = value;
    }

    /**
     * Gets the value of the outGrpIncomingOutGrmDhsseIncomingDhsseIncomingIbanCd property.
     * 
     */
    public short getOutGrpIncomingOutGrmDhsseIncomingDhsseIncomingIbanCd() {
        return outGrpIncomingOutGrmDhsseIncomingDhsseIncomingIbanCd;
    }

    /**
     * Sets the value of the outGrpIncomingOutGrmDhsseIncomingDhsseIncomingIbanCd property.
     * 
     */
    public void setOutGrpIncomingOutGrmDhsseIncomingDhsseIncomingIbanCd(short value) {
        this.outGrpIncomingOutGrmDhsseIncomingDhsseIncomingIbanCd = value;
    }

    /**
     * Gets the value of the outGrpIncomingOutGrmDhsseIncomingDhsseIncomingIbanCntry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpIncomingOutGrmDhsseIncomingDhsseIncomingIbanCntry() {
        return outGrpIncomingOutGrmDhsseIncomingDhsseIncomingIbanCntry;
    }

    /**
     * Sets the value of the outGrpIncomingOutGrmDhsseIncomingDhsseIncomingIbanCntry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpIncomingOutGrmDhsseIncomingDhsseIncomingIbanCntry(String value) {
        this.outGrpIncomingOutGrmDhsseIncomingDhsseIncomingIbanCntry = value;
    }

    /**
     * Gets the value of the outGrpIncomingOutGrmDhsseIncomingDhsseIncomingIbanDigits property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpIncomingOutGrmDhsseIncomingDhsseIncomingIbanDigits() {
        return outGrpIncomingOutGrmDhsseIncomingDhsseIncomingIbanDigits;
    }

    /**
     * Sets the value of the outGrpIncomingOutGrmDhsseIncomingDhsseIncomingIbanDigits property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpIncomingOutGrmDhsseIncomingDhsseIncomingIbanDigits(String value) {
        this.outGrpIncomingOutGrmDhsseIncomingDhsseIncomingIbanDigits = value;
    }

    /**
     * Gets the value of the outGrpIncomingOutGrmDhsseIncomingDhsseIncomingIdJustific property.
     * 
     */
    public int getOutGrpIncomingOutGrmDhsseIncomingDhsseIncomingIdJustific() {
        return outGrpIncomingOutGrmDhsseIncomingDhsseIncomingIdJustific;
    }

    /**
     * Sets the value of the outGrpIncomingOutGrmDhsseIncomingDhsseIncomingIdJustific property.
     * 
     */
    public void setOutGrpIncomingOutGrmDhsseIncomingDhsseIncomingIdJustific(int value) {
        this.outGrpIncomingOutGrmDhsseIncomingDhsseIncomingIdJustific = value;
    }

    /**
     * Gets the value of the outGrpIncomingOutGrmDhsseIncomingDhsseIncomingIdentifier property.
     * 
     */
    public int getOutGrpIncomingOutGrmDhsseIncomingDhsseIncomingIdentifier() {
        return outGrpIncomingOutGrmDhsseIncomingDhsseIncomingIdentifier;
    }

    /**
     * Sets the value of the outGrpIncomingOutGrmDhsseIncomingDhsseIncomingIdentifier property.
     * 
     */
    public void setOutGrpIncomingOutGrmDhsseIncomingDhsseIncomingIdentifier(int value) {
        this.outGrpIncomingOutGrmDhsseIncomingDhsseIncomingIdentifier = value;
    }

    /**
     * Gets the value of the outGrpIncomingOutGrmDhsseIncomingDhsseIncomingIncludeInFile property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpIncomingOutGrmDhsseIncomingDhsseIncomingIncludeInFile() {
        return outGrpIncomingOutGrmDhsseIncomingDhsseIncomingIncludeInFile;
    }

    /**
     * Sets the value of the outGrpIncomingOutGrmDhsseIncomingDhsseIncomingIncludeInFile property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpIncomingOutGrmDhsseIncomingDhsseIncomingIncludeInFile(String value) {
        this.outGrpIncomingOutGrmDhsseIncomingDhsseIncomingIncludeInFile = value;
    }

    /**
     * Gets the value of the outGrpIncomingOutGrmDhsseIncomingDhsseIncomingIssDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpIncomingOutGrmDhsseIncomingDhsseIncomingIssDate() {
        return outGrpIncomingOutGrmDhsseIncomingDhsseIncomingIssDate;
    }

    /**
     * Sets the value of the outGrpIncomingOutGrmDhsseIncomingDhsseIncomingIssDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpIncomingOutGrmDhsseIncomingDhsseIncomingIssDate(String value) {
        this.outGrpIncomingOutGrmDhsseIncomingDhsseIncomingIssDate = value;
    }

    /**
     * Gets the value of the outGrpIncomingOutGrmDhsseIncomingDhsseIncomingOnlTmstamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutGrpIncomingOutGrmDhsseIncomingDhsseIncomingOnlTmstamp() {
        return outGrpIncomingOutGrmDhsseIncomingDhsseIncomingOnlTmstamp;
    }

    /**
     * Sets the value of the outGrpIncomingOutGrmDhsseIncomingDhsseIncomingOnlTmstamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutGrpIncomingOutGrmDhsseIncomingDhsseIncomingOnlTmstamp(XMLGregorianCalendar value) {
        this.outGrpIncomingOutGrmDhsseIncomingDhsseIncomingOnlTmstamp = value;
    }

    /**
     * Gets the value of the outGrpIncomingOutGrmDhsseIncomingDhsseIncomingOnlTmstampStr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpIncomingOutGrmDhsseIncomingDhsseIncomingOnlTmstampStr() {
        return outGrpIncomingOutGrmDhsseIncomingDhsseIncomingOnlTmstampStr;
    }

    /**
     * Sets the value of the outGrpIncomingOutGrmDhsseIncomingDhsseIncomingOnlTmstampStr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpIncomingOutGrmDhsseIncomingDhsseIncomingOnlTmstampStr(String value) {
        this.outGrpIncomingOutGrmDhsseIncomingDhsseIncomingOnlTmstampStr = value;
    }

    /**
     * Gets the value of the outGrpIncomingOutGrmDhsseIncomingDhsseIncomingOnlTunDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutGrpIncomingOutGrmDhsseIncomingDhsseIncomingOnlTunDate() {
        return outGrpIncomingOutGrmDhsseIncomingDhsseIncomingOnlTunDate;
    }

    /**
     * Sets the value of the outGrpIncomingOutGrmDhsseIncomingDhsseIncomingOnlTunDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutGrpIncomingOutGrmDhsseIncomingDhsseIncomingOnlTunDate(XMLGregorianCalendar value) {
        this.outGrpIncomingOutGrmDhsseIncomingDhsseIncomingOnlTunDate = value;
    }

    /**
     * Gets the value of the outGrpIncomingOutGrmDhsseIncomingDhsseIncomingOnlTunDateStr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpIncomingOutGrmDhsseIncomingDhsseIncomingOnlTunDateStr() {
        return outGrpIncomingOutGrmDhsseIncomingDhsseIncomingOnlTunDateStr;
    }

    /**
     * Sets the value of the outGrpIncomingOutGrmDhsseIncomingDhsseIncomingOnlTunDateStr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpIncomingOutGrmDhsseIncomingDhsseIncomingOnlTunDateStr(String value) {
        this.outGrpIncomingOutGrmDhsseIncomingDhsseIncomingOnlTunDateStr = value;
    }

    /**
     * Gets the value of the outGrpIncomingOutGrmDhsseIncomingDhsseIncomingOnlTunInternalSn property.
     * 
     */
    public short getOutGrpIncomingOutGrmDhsseIncomingDhsseIncomingOnlTunInternalSn() {
        return outGrpIncomingOutGrmDhsseIncomingDhsseIncomingOnlTunInternalSn;
    }

    /**
     * Sets the value of the outGrpIncomingOutGrmDhsseIncomingDhsseIncomingOnlTunInternalSn property.
     * 
     */
    public void setOutGrpIncomingOutGrmDhsseIncomingDhsseIncomingOnlTunInternalSn(short value) {
        this.outGrpIncomingOutGrmDhsseIncomingDhsseIncomingOnlTunInternalSn = value;
    }

    /**
     * Gets the value of the outGrpIncomingOutGrmDhsseIncomingDhsseIncomingOnlTunUnit property.
     * 
     */
    public int getOutGrpIncomingOutGrmDhsseIncomingDhsseIncomingOnlTunUnit() {
        return outGrpIncomingOutGrmDhsseIncomingDhsseIncomingOnlTunUnit;
    }

    /**
     * Sets the value of the outGrpIncomingOutGrmDhsseIncomingDhsseIncomingOnlTunUnit property.
     * 
     */
    public void setOutGrpIncomingOutGrmDhsseIncomingDhsseIncomingOnlTunUnit(int value) {
        this.outGrpIncomingOutGrmDhsseIncomingDhsseIncomingOnlTunUnit = value;
    }

    /**
     * Gets the value of the outGrpIncomingOutGrmDhsseIncomingDhsseIncomingOnlTunUsr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpIncomingOutGrmDhsseIncomingDhsseIncomingOnlTunUsr() {
        return outGrpIncomingOutGrmDhsseIncomingDhsseIncomingOnlTunUsr;
    }

    /**
     * Sets the value of the outGrpIncomingOutGrmDhsseIncomingDhsseIncomingOnlTunUsr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpIncomingOutGrmDhsseIncomingDhsseIncomingOnlTunUsr(String value) {
        this.outGrpIncomingOutGrmDhsseIncomingDhsseIncomingOnlTunUsr = value;
    }

    /**
     * Gets the value of the outGrpIncomingOutGrmDhsseIncomingDhsseIncomingOnlTunUsrSn property.
     * 
     */
    public int getOutGrpIncomingOutGrmDhsseIncomingDhsseIncomingOnlTunUsrSn() {
        return outGrpIncomingOutGrmDhsseIncomingDhsseIncomingOnlTunUsrSn;
    }

    /**
     * Sets the value of the outGrpIncomingOutGrmDhsseIncomingDhsseIncomingOnlTunUsrSn property.
     * 
     */
    public void setOutGrpIncomingOutGrmDhsseIncomingDhsseIncomingOnlTunUsrSn(int value) {
        this.outGrpIncomingOutGrmDhsseIncomingDhsseIncomingOnlTunUsrSn = value;
    }

    /**
     * Gets the value of the outGrpIncomingOutGrmDhsseIncomingDhsseIncomingOverdrawnFlg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpIncomingOutGrmDhsseIncomingDhsseIncomingOverdrawnFlg() {
        return outGrpIncomingOutGrmDhsseIncomingDhsseIncomingOverdrawnFlg;
    }

    /**
     * Sets the value of the outGrpIncomingOutGrmDhsseIncomingDhsseIncomingOverdrawnFlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpIncomingOutGrmDhsseIncomingDhsseIncomingOverdrawnFlg(String value) {
        this.outGrpIncomingOutGrmDhsseIncomingDhsseIncomingOverdrawnFlg = value;
    }

    /**
     * Gets the value of the outGrpIncomingOutGrmDhsseIncomingDhsseIncomingPayAccno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpIncomingOutGrmDhsseIncomingDhsseIncomingPayAccno() {
        return outGrpIncomingOutGrmDhsseIncomingDhsseIncomingPayAccno;
    }

    /**
     * Sets the value of the outGrpIncomingOutGrmDhsseIncomingDhsseIncomingPayAccno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpIncomingOutGrmDhsseIncomingDhsseIncomingPayAccno(String value) {
        this.outGrpIncomingOutGrmDhsseIncomingDhsseIncomingPayAccno = value;
    }

    /**
     * Gets the value of the outGrpIncomingOutGrmDhsseIncomingDhsseIncomingPayBranch property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpIncomingOutGrmDhsseIncomingDhsseIncomingPayBranch() {
        return outGrpIncomingOutGrmDhsseIncomingDhsseIncomingPayBranch;
    }

    /**
     * Sets the value of the outGrpIncomingOutGrmDhsseIncomingDhsseIncomingPayBranch property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpIncomingOutGrmDhsseIncomingDhsseIncomingPayBranch(String value) {
        this.outGrpIncomingOutGrmDhsseIncomingDhsseIncomingPayBranch = value;
    }

    /**
     * Gets the value of the outGrpIncomingOutGrmDhsseIncomingDhsseIncomingPayCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpIncomingOutGrmDhsseIncomingDhsseIncomingPayCurrency() {
        return outGrpIncomingOutGrmDhsseIncomingDhsseIncomingPayCurrency;
    }

    /**
     * Sets the value of the outGrpIncomingOutGrmDhsseIncomingDhsseIncomingPayCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpIncomingOutGrmDhsseIncomingDhsseIncomingPayCurrency(String value) {
        this.outGrpIncomingOutGrmDhsseIncomingDhsseIncomingPayCurrency = value;
    }

    /**
     * Gets the value of the outGrpIncomingOutGrmDhsseIncomingDhsseIncomingRepresentationFlg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpIncomingOutGrmDhsseIncomingDhsseIncomingRepresentationFlg() {
        return outGrpIncomingOutGrmDhsseIncomingDhsseIncomingRepresentationFlg;
    }

    /**
     * Sets the value of the outGrpIncomingOutGrmDhsseIncomingDhsseIncomingRepresentationFlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpIncomingOutGrmDhsseIncomingDhsseIncomingRepresentationFlg(String value) {
        this.outGrpIncomingOutGrmDhsseIncomingDhsseIncomingRepresentationFlg = value;
    }

    /**
     * Gets the value of the outGrpIncomingOutGrmDhsseIncomingDhsseIncomingSettleRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpIncomingOutGrmDhsseIncomingDhsseIncomingSettleRef() {
        return outGrpIncomingOutGrmDhsseIncomingDhsseIncomingSettleRef;
    }

    /**
     * Sets the value of the outGrpIncomingOutGrmDhsseIncomingDhsseIncomingSettleRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpIncomingOutGrmDhsseIncomingDhsseIncomingSettleRef(String value) {
        this.outGrpIncomingOutGrmDhsseIncomingDhsseIncomingSettleRef = value;
    }

    /**
     * Gets the value of the outGrpIncomingOutGrmDhsseIncomingDhsseIncomingTranCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpIncomingOutGrmDhsseIncomingDhsseIncomingTranCode() {
        return outGrpIncomingOutGrmDhsseIncomingDhsseIncomingTranCode;
    }

    /**
     * Sets the value of the outGrpIncomingOutGrmDhsseIncomingDhsseIncomingTranCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpIncomingOutGrmDhsseIncomingDhsseIncomingTranCode(String value) {
        this.outGrpIncomingOutGrmDhsseIncomingDhsseIncomingTranCode = value;
    }

    /**
     * Gets the value of the outGrpIncomingOutGrmDhsseIncomingDhsseIncomingTranDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpIncomingOutGrmDhsseIncomingDhsseIncomingTranDate() {
        return outGrpIncomingOutGrmDhsseIncomingDhsseIncomingTranDate;
    }

    /**
     * Sets the value of the outGrpIncomingOutGrmDhsseIncomingDhsseIncomingTranDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpIncomingOutGrmDhsseIncomingDhsseIncomingTranDate(String value) {
        this.outGrpIncomingOutGrmDhsseIncomingDhsseIncomingTranDate = value;
    }

    /**
     * Gets the value of the outGrpIncomingOutGrmSelectIefSuppliedSelectChar property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpIncomingOutGrmSelectIefSuppliedSelectChar() {
        return outGrpIncomingOutGrmSelectIefSuppliedSelectChar;
    }

    /**
     * Sets the value of the outGrpIncomingOutGrmSelectIefSuppliedSelectChar property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpIncomingOutGrmSelectIefSuppliedSelectChar(String value) {
        this.outGrpIncomingOutGrmSelectIefSuppliedSelectChar = value;
    }

    /**
     * Gets the value of the outGrpIncomingOutGrmDhsseIncomingDhsseIncomingFileData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpIncomingOutGrmDhsseIncomingDhsseIncomingFileData() {
        return outGrpIncomingOutGrmDhsseIncomingDhsseIncomingFileData;
    }

    /**
     * Sets the value of the outGrpIncomingOutGrmDhsseIncomingDhsseIncomingFileData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpIncomingOutGrmDhsseIncomingDhsseIncomingFileData(String value) {
        this.outGrpIncomingOutGrmDhsseIncomingDhsseIncomingFileData = value;
    }

    /**
     * Gets the value of the outGrpIncomingOutGrmDhsseIncomingDhsseIncomingUpdatedFileData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpIncomingOutGrmDhsseIncomingDhsseIncomingUpdatedFileData() {
        return outGrpIncomingOutGrmDhsseIncomingDhsseIncomingUpdatedFileData;
    }

    /**
     * Sets the value of the outGrpIncomingOutGrmDhsseIncomingDhsseIncomingUpdatedFileData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpIncomingOutGrmDhsseIncomingDhsseIncomingUpdatedFileData(String value) {
        this.outGrpIncomingOutGrmDhsseIncomingDhsseIncomingUpdatedFileData = value;
    }

}
