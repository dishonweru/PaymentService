
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for BillsReverseChequePurchaseImport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BillsReverseChequePurchaseImport">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}BaseImport">
 *       &lt;sequence>
 *         &lt;element name="InAuthorGrantedIefSuppliedFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InBilerGenericDetailDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InBilerGenericDetailParameterType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InBilerGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InBillBillAccountNumb" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InBillBillAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InBillBillBarcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InBillBillBranchCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InBillBillCarrierId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InBillBillCarrierName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InBillBillCarrierNotes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InBillBillCarrierTitle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InBillBillChargesOnacc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InBillBillCheckDigit" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InBillBillClrtypeFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InBillBillCollAccCd" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InBillBillCollAccNumb" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InBillBillCollCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InBillBillCollJustif" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InBillBillCollPrfsys" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InBillBillCollSn" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="InBillBillCollTmstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InBillBillCraccAvldays" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InBillBillCrAccCd" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InBillBillCraccIntdays" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InBillBillCraccJustif" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InBillBillCrAccNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InBillBillCraccPrfsys" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InBillBillDebaccCd" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InBillBillDebaccJust" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InBillBillDebaccNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InBillBillDebaccPrfsys" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InBillBillEntryStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InBillBillExpaccCd" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InBillBillExpaccNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InBillBillExpaccPrfsys" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InBillBillExpDbJust" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InBillBillExpInterdate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InBillBillExpInterdays" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InBillBillFinalDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InBillBillIbanCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InBillBillInsDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InBillBillIssueDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InBillBillJustificId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InBillBillNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InBillBillOwnbankFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InBillBillPrftTransId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InBillBillProductId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InBillBillRejectedFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InBillBillRejectNotes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InBillBillSendtoclrCnt" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InBillBillSerialNum" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="InBillBillSpecialChars" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InBillBillStatusFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InBillBillTmstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InBillBillTraceflowFlg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InBillBillTypeFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InBillBillUpdDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InBillBillUpdUser" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InBillBillValidateFlg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InBillCollTrxDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InBillCollTrxUnit" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InBillCollTrxUsr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InBillCollTrxUsrSn" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InBillCollTunIntSn" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InBillCrDepTrxDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InBillCrDepTrxUnit" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InBillCrDepTrxUsr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InBillCrDepTrxUsrSn" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InBillCrDepTunIntSn" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InBillCrLnsTmstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InBillCrLnsTrxDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InBillCrLnsTrxIntSn" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InBillCrLnsTrxSn" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InBillCrLnsTrxUnit" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InBillCrLnsTrxUsr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InBillDebDepTrxDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InBillDebDepTrxUnit" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InBillDebDepTrxUsr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InBillDebDepTrxUsrSn" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InBillDebDepTunIntSn" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InBillDebLnsTmstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InBillDebLnsTrxDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InBillDebLnsTrxIntSn" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InBillDebLnsTrxSn" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InBillDebLnsTrxUnit" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InBillDebLnsTrxUsr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InBillExpDepTrxDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InBillExpDepTrxUnit" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InBillExpDepTrxUsr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InBillExpDepTrxUsrSn" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InBillExpDepTunIntSn" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InBillExpLnsTmstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InBillExpLnsTrxDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InBillExpLnsTrxIntSn" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InBillExpLnsTrxSn" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InBillExpLnsTrxUnit" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InBillExpLnsTrxUsr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InBillJustificJustificDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InBillJustificJustificIdJustific" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InBillPrftTrxPrftTransactionDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InBillPrftTrxPrftTransactionIdTransact" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InBillProductIdProduct" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InBillProductProductDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InBillProductProductIdProduct" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InCancelTypeIefSuppliedFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCollaborationBankBankId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InCommandIefSuppliedCommand" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCustomerCDigit" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InCustomerCustId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InCustomerFirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCustomerSurname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InInfoBillBillAccountNumb" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InInfoBillBillAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InInfoBillBillBarcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InInfoBillBillBranchCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InInfoBillBillCarrierId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InInfoBillBillCarrierName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InInfoBillBillCarrierNotes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InInfoBillBillCarrierTitle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InInfoBillBillChargesOnacc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InInfoBillBillCheckDigit" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InInfoBillBillClrtypeFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InInfoBillBillCollAccCd" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InInfoBillBillCollAccNumb" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InInfoBillBillCollCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InInfoBillBillCollJustif" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InInfoBillBillCollPrfsys" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InInfoBillBillCollSn" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="InInfoBillBillCollTmstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InInfoBillBillCraccAvldays" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InInfoBillBillCrAccCd" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InInfoBillBillCraccIntdays" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InInfoBillBillCraccJustif" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InInfoBillBillCrAccNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InInfoBillBillCraccPrfsys" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InInfoBillBillDebaccCd" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InInfoBillBillDebaccJust" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InInfoBillBillDebaccNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InInfoBillBillDebaccPrfsys" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InInfoBillBillEntryStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InInfoBillBillExpaccCd" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InInfoBillBillExpaccNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InInfoBillBillExpaccPrfsys" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InInfoBillBillExpDbJust" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InInfoBillBillExpInterdate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InInfoBillBillExpInterdays" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InInfoBillBillFinalDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InInfoBillBillIbanCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InInfoBillBillInsDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InInfoBillBillIssueDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InInfoBillBillJustificId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InInfoBillBillNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InInfoBillBillOwnbankFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InInfoBillBillPrftTransId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InInfoBillBillProductId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InInfoBillBillRejectedFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InInfoBillBillRejectNotes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InInfoBillBillSendtoclrCnt" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InInfoBillBillSerialNum" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="InInfoBillBillSpecialChars" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InInfoBillBillStatusFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InInfoBillBillTmstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InInfoBillBillTraceflowFlg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InInfoBillBillTypeFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InInfoBillBillUpdDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InInfoBillBillUpdUser" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InInfoBillBillValidateFlg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InInfoBillCollTrxDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InInfoBillCollTrxUnit" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InInfoBillCollTrxUsr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InInfoBillCollTrxUsrSn" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InInfoBillCollTunIntSn" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InInfoBillCrDepTrxDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InInfoBillCrDepTrxUnit" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InInfoBillCrDepTrxUsr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InInfoBillCrDepTrxUsrSn" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InInfoBillCrDepTunIntSn" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InInfoBillCrLnsTmstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InInfoBillCrLnsTrxDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InInfoBillCrLnsTrxIntSn" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InInfoBillCrLnsTrxSn" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InInfoBillCrLnsTrxUnit" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InInfoBillCrLnsTrxUsr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InInfoBillDebDepTrxDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InInfoBillDebDepTrxUnit" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InInfoBillDebDepTrxUsr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InInfoBillDebDepTrxUsrSn" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InInfoBillDebDepTunIntSn" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InInfoBillDebLnsTmstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InInfoBillDebLnsTrxDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InInfoBillDebLnsTrxIntSn" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InInfoBillDebLnsTrxSn" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InInfoBillDebLnsTrxUnit" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InInfoBillDebLnsTrxUsr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InInfoBillExpDepTrxDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InInfoBillExpDepTrxUnit" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InInfoBillExpDepTrxUsr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InInfoBillExpDepTrxUsrSn" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InInfoBillExpDepTunIntSn" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InInfoBillExpLnsTmstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InInfoBillExpLnsTrxDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InInfoBillExpLnsTrxIntSn" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InInfoBillExpLnsTrxSn" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InInfoBillExpLnsTrxUnit" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InInfoBillExpLnsTrxUsr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InJustificDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InJustificIdJustific" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InPrftTransactionIdTransact" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InTrxCurrencyIdCurrency" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InTrxSsSecurityCmcbPrftSystem" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InTrxTeamInformationSuper1Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InTrxTeamInformationSuper2Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InTrxTerminalTerminalNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BillsReverseChequePurchaseImport", propOrder = {
    "inAuthorGrantedIefSuppliedFlag",
    "inBilerGenericDetailDescription",
    "inBilerGenericDetailParameterType",
    "inBilerGenericDetailSerialNum",
    "inBillBillAccountNumb",
    "inBillBillAmount",
    "inBillBillBarcode",
    "inBillBillBranchCode",
    "inBillBillCarrierId",
    "inBillBillCarrierName",
    "inBillBillCarrierNotes",
    "inBillBillCarrierTitle",
    "inBillBillChargesOnacc",
    "inBillBillCheckDigit",
    "inBillBillClrtypeFlag",
    "inBillBillCollAccCd",
    "inBillBillCollAccNumb",
    "inBillBillCollCode",
    "inBillBillCollJustif",
    "inBillBillCollPrfsys",
    "inBillBillCollSn",
    "inBillBillCollTmstamp",
    "inBillBillCraccAvldays",
    "inBillBillCrAccCd",
    "inBillBillCraccIntdays",
    "inBillBillCraccJustif",
    "inBillBillCrAccNumber",
    "inBillBillCraccPrfsys",
    "inBillBillDebaccCd",
    "inBillBillDebaccJust",
    "inBillBillDebaccNumber",
    "inBillBillDebaccPrfsys",
    "inBillBillEntryStatus",
    "inBillBillExpaccCd",
    "inBillBillExpaccNumber",
    "inBillBillExpaccPrfsys",
    "inBillBillExpDbJust",
    "inBillBillExpInterdate",
    "inBillBillExpInterdays",
    "inBillBillFinalDate",
    "inBillBillIbanCode",
    "inBillBillInsDate",
    "inBillBillIssueDate",
    "inBillBillJustificId",
    "inBillBillNumber",
    "inBillBillOwnbankFlag",
    "inBillBillPrftTransId",
    "inBillBillProductId",
    "inBillBillRejectedFlag",
    "inBillBillRejectNotes",
    "inBillBillSendtoclrCnt",
    "inBillBillSerialNum",
    "inBillBillSpecialChars",
    "inBillBillStatusFlag",
    "inBillBillTmstamp",
    "inBillBillTraceflowFlg",
    "inBillBillTypeFlag",
    "inBillBillUpdDate",
    "inBillBillUpdUser",
    "inBillBillValidateFlg",
    "inBillCollTrxDate",
    "inBillCollTrxUnit",
    "inBillCollTrxUsr",
    "inBillCollTrxUsrSn",
    "inBillCollTunIntSn",
    "inBillCrDepTrxDate",
    "inBillCrDepTrxUnit",
    "inBillCrDepTrxUsr",
    "inBillCrDepTrxUsrSn",
    "inBillCrDepTunIntSn",
    "inBillCrLnsTmstamp",
    "inBillCrLnsTrxDate",
    "inBillCrLnsTrxIntSn",
    "inBillCrLnsTrxSn",
    "inBillCrLnsTrxUnit",
    "inBillCrLnsTrxUsr",
    "inBillDebDepTrxDate",
    "inBillDebDepTrxUnit",
    "inBillDebDepTrxUsr",
    "inBillDebDepTrxUsrSn",
    "inBillDebDepTunIntSn",
    "inBillDebLnsTmstamp",
    "inBillDebLnsTrxDate",
    "inBillDebLnsTrxIntSn",
    "inBillDebLnsTrxSn",
    "inBillDebLnsTrxUnit",
    "inBillDebLnsTrxUsr",
    "inBillExpDepTrxDate",
    "inBillExpDepTrxUnit",
    "inBillExpDepTrxUsr",
    "inBillExpDepTrxUsrSn",
    "inBillExpDepTunIntSn",
    "inBillExpLnsTmstamp",
    "inBillExpLnsTrxDate",
    "inBillExpLnsTrxIntSn",
    "inBillExpLnsTrxSn",
    "inBillExpLnsTrxUnit",
    "inBillExpLnsTrxUsr",
    "inBillJustificJustificDescription",
    "inBillJustificJustificIdJustific",
    "inBillPrftTrxPrftTransactionDescription",
    "inBillPrftTrxPrftTransactionIdTransact",
    "inBillProductIdProduct",
    "inBillProductProductDescription",
    "inBillProductProductIdProduct",
    "inCancelTypeIefSuppliedFlag",
    "inCollaborationBankBankId",
    "inCommandIefSuppliedCommand",
    "inCustomerCDigit",
    "inCustomerCustId",
    "inCustomerFirstName",
    "inCustomerSurname",
    "inInfoBillBillAccountNumb",
    "inInfoBillBillAmount",
    "inInfoBillBillBarcode",
    "inInfoBillBillBranchCode",
    "inInfoBillBillCarrierId",
    "inInfoBillBillCarrierName",
    "inInfoBillBillCarrierNotes",
    "inInfoBillBillCarrierTitle",
    "inInfoBillBillChargesOnacc",
    "inInfoBillBillCheckDigit",
    "inInfoBillBillClrtypeFlag",
    "inInfoBillBillCollAccCd",
    "inInfoBillBillCollAccNumb",
    "inInfoBillBillCollCode",
    "inInfoBillBillCollJustif",
    "inInfoBillBillCollPrfsys",
    "inInfoBillBillCollSn",
    "inInfoBillBillCollTmstamp",
    "inInfoBillBillCraccAvldays",
    "inInfoBillBillCrAccCd",
    "inInfoBillBillCraccIntdays",
    "inInfoBillBillCraccJustif",
    "inInfoBillBillCrAccNumber",
    "inInfoBillBillCraccPrfsys",
    "inInfoBillBillDebaccCd",
    "inInfoBillBillDebaccJust",
    "inInfoBillBillDebaccNumber",
    "inInfoBillBillDebaccPrfsys",
    "inInfoBillBillEntryStatus",
    "inInfoBillBillExpaccCd",
    "inInfoBillBillExpaccNumber",
    "inInfoBillBillExpaccPrfsys",
    "inInfoBillBillExpDbJust",
    "inInfoBillBillExpInterdate",
    "inInfoBillBillExpInterdays",
    "inInfoBillBillFinalDate",
    "inInfoBillBillIbanCode",
    "inInfoBillBillInsDate",
    "inInfoBillBillIssueDate",
    "inInfoBillBillJustificId",
    "inInfoBillBillNumber",
    "inInfoBillBillOwnbankFlag",
    "inInfoBillBillPrftTransId",
    "inInfoBillBillProductId",
    "inInfoBillBillRejectedFlag",
    "inInfoBillBillRejectNotes",
    "inInfoBillBillSendtoclrCnt",
    "inInfoBillBillSerialNum",
    "inInfoBillBillSpecialChars",
    "inInfoBillBillStatusFlag",
    "inInfoBillBillTmstamp",
    "inInfoBillBillTraceflowFlg",
    "inInfoBillBillTypeFlag",
    "inInfoBillBillUpdDate",
    "inInfoBillBillUpdUser",
    "inInfoBillBillValidateFlg",
    "inInfoBillCollTrxDate",
    "inInfoBillCollTrxUnit",
    "inInfoBillCollTrxUsr",
    "inInfoBillCollTrxUsrSn",
    "inInfoBillCollTunIntSn",
    "inInfoBillCrDepTrxDate",
    "inInfoBillCrDepTrxUnit",
    "inInfoBillCrDepTrxUsr",
    "inInfoBillCrDepTrxUsrSn",
    "inInfoBillCrDepTunIntSn",
    "inInfoBillCrLnsTmstamp",
    "inInfoBillCrLnsTrxDate",
    "inInfoBillCrLnsTrxIntSn",
    "inInfoBillCrLnsTrxSn",
    "inInfoBillCrLnsTrxUnit",
    "inInfoBillCrLnsTrxUsr",
    "inInfoBillDebDepTrxDate",
    "inInfoBillDebDepTrxUnit",
    "inInfoBillDebDepTrxUsr",
    "inInfoBillDebDepTrxUsrSn",
    "inInfoBillDebDepTunIntSn",
    "inInfoBillDebLnsTmstamp",
    "inInfoBillDebLnsTrxDate",
    "inInfoBillDebLnsTrxIntSn",
    "inInfoBillDebLnsTrxSn",
    "inInfoBillDebLnsTrxUnit",
    "inInfoBillDebLnsTrxUsr",
    "inInfoBillExpDepTrxDate",
    "inInfoBillExpDepTrxUnit",
    "inInfoBillExpDepTrxUsr",
    "inInfoBillExpDepTrxUsrSn",
    "inInfoBillExpDepTunIntSn",
    "inInfoBillExpLnsTmstamp",
    "inInfoBillExpLnsTrxDate",
    "inInfoBillExpLnsTrxIntSn",
    "inInfoBillExpLnsTrxSn",
    "inInfoBillExpLnsTrxUnit",
    "inInfoBillExpLnsTrxUsr",
    "inJustificDescription",
    "inJustificIdJustific",
    "inPrftTransactionIdTransact",
    "inTrxCurrencyIdCurrency",
    "inTrxSsSecurityCmcbPrftSystem",
    "inTrxTeamInformationSuper1Code",
    "inTrxTeamInformationSuper2Code",
    "inTrxTerminalTerminalNumber"
})
public class BillsReverseChequePurchaseImport
    extends BaseImport
{

    @XmlElement(name = "InAuthorGrantedIefSuppliedFlag")
    protected String inAuthorGrantedIefSuppliedFlag;
    @XmlElement(name = "InBilerGenericDetailDescription")
    protected String inBilerGenericDetailDescription;
    @XmlElement(name = "InBilerGenericDetailParameterType")
    protected String inBilerGenericDetailParameterType;
    @XmlElement(name = "InBilerGenericDetailSerialNum")
    protected int inBilerGenericDetailSerialNum;
    @XmlElement(name = "InBillBillAccountNumb")
    protected String inBillBillAccountNumb;
    @XmlElement(name = "InBillBillAmount", required = true)
    protected BigDecimal inBillBillAmount;
    @XmlElement(name = "InBillBillBarcode")
    protected String inBillBillBarcode;
    @XmlElement(name = "InBillBillBranchCode")
    protected String inBillBillBranchCode;
    @XmlElement(name = "InBillBillCarrierId")
    protected String inBillBillCarrierId;
    @XmlElement(name = "InBillBillCarrierName")
    protected String inBillBillCarrierName;
    @XmlElement(name = "InBillBillCarrierNotes")
    protected String inBillBillCarrierNotes;
    @XmlElement(name = "InBillBillCarrierTitle")
    protected String inBillBillCarrierTitle;
    @XmlElement(name = "InBillBillChargesOnacc")
    protected String inBillBillChargesOnacc;
    @XmlElement(name = "InBillBillCheckDigit")
    protected short inBillBillCheckDigit;
    @XmlElement(name = "InBillBillClrtypeFlag")
    protected String inBillBillClrtypeFlag;
    @XmlElement(name = "InBillBillCollAccCd")
    protected short inBillBillCollAccCd;
    @XmlElement(name = "InBillBillCollAccNumb")
    protected String inBillBillCollAccNumb;
    @XmlElement(name = "InBillBillCollCode")
    protected String inBillBillCollCode;
    @XmlElement(name = "InBillBillCollJustif")
    protected int inBillBillCollJustif;
    @XmlElement(name = "InBillBillCollPrfsys")
    protected short inBillBillCollPrfsys;
    @XmlElement(name = "InBillBillCollSn")
    protected double inBillBillCollSn;
    @XmlElement(name = "InBillBillCollTmstamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inBillBillCollTmstamp;
    @XmlElement(name = "InBillBillCraccAvldays")
    protected short inBillBillCraccAvldays;
    @XmlElement(name = "InBillBillCrAccCd")
    protected short inBillBillCrAccCd;
    @XmlElement(name = "InBillBillCraccIntdays")
    protected short inBillBillCraccIntdays;
    @XmlElement(name = "InBillBillCraccJustif")
    protected int inBillBillCraccJustif;
    @XmlElement(name = "InBillBillCrAccNumber")
    protected String inBillBillCrAccNumber;
    @XmlElement(name = "InBillBillCraccPrfsys")
    protected short inBillBillCraccPrfsys;
    @XmlElement(name = "InBillBillDebaccCd")
    protected short inBillBillDebaccCd;
    @XmlElement(name = "InBillBillDebaccJust")
    protected int inBillBillDebaccJust;
    @XmlElement(name = "InBillBillDebaccNumber")
    protected String inBillBillDebaccNumber;
    @XmlElement(name = "InBillBillDebaccPrfsys")
    protected short inBillBillDebaccPrfsys;
    @XmlElement(name = "InBillBillEntryStatus")
    protected String inBillBillEntryStatus;
    @XmlElement(name = "InBillBillExpaccCd")
    protected short inBillBillExpaccCd;
    @XmlElement(name = "InBillBillExpaccNumber")
    protected String inBillBillExpaccNumber;
    @XmlElement(name = "InBillBillExpaccPrfsys")
    protected short inBillBillExpaccPrfsys;
    @XmlElement(name = "InBillBillExpDbJust")
    protected int inBillBillExpDbJust;
    @XmlElement(name = "InBillBillExpInterdate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inBillBillExpInterdate;
    @XmlElement(name = "InBillBillExpInterdays")
    protected short inBillBillExpInterdays;
    @XmlElement(name = "InBillBillFinalDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inBillBillFinalDate;
    @XmlElement(name = "InBillBillIbanCode")
    protected String inBillBillIbanCode;
    @XmlElement(name = "InBillBillInsDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inBillBillInsDate;
    @XmlElement(name = "InBillBillIssueDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inBillBillIssueDate;
    @XmlElement(name = "InBillBillJustificId")
    protected int inBillBillJustificId;
    @XmlElement(name = "InBillBillNumber")
    protected String inBillBillNumber;
    @XmlElement(name = "InBillBillOwnbankFlag")
    protected String inBillBillOwnbankFlag;
    @XmlElement(name = "InBillBillPrftTransId")
    protected int inBillBillPrftTransId;
    @XmlElement(name = "InBillBillProductId")
    protected int inBillBillProductId;
    @XmlElement(name = "InBillBillRejectedFlag")
    protected String inBillBillRejectedFlag;
    @XmlElement(name = "InBillBillRejectNotes")
    protected String inBillBillRejectNotes;
    @XmlElement(name = "InBillBillSendtoclrCnt")
    protected short inBillBillSendtoclrCnt;
    @XmlElement(name = "InBillBillSerialNum")
    protected double inBillBillSerialNum;
    @XmlElement(name = "InBillBillSpecialChars")
    protected String inBillBillSpecialChars;
    @XmlElement(name = "InBillBillStatusFlag")
    protected String inBillBillStatusFlag;
    @XmlElement(name = "InBillBillTmstamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inBillBillTmstamp;
    @XmlElement(name = "InBillBillTraceflowFlg")
    protected String inBillBillTraceflowFlg;
    @XmlElement(name = "InBillBillTypeFlag")
    protected String inBillBillTypeFlag;
    @XmlElement(name = "InBillBillUpdDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inBillBillUpdDate;
    @XmlElement(name = "InBillBillUpdUser")
    protected String inBillBillUpdUser;
    @XmlElement(name = "InBillBillValidateFlg")
    protected String inBillBillValidateFlg;
    @XmlElement(name = "InBillCollTrxDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inBillCollTrxDate;
    @XmlElement(name = "InBillCollTrxUnit")
    protected int inBillCollTrxUnit;
    @XmlElement(name = "InBillCollTrxUsr")
    protected String inBillCollTrxUsr;
    @XmlElement(name = "InBillCollTrxUsrSn")
    protected int inBillCollTrxUsrSn;
    @XmlElement(name = "InBillCollTunIntSn")
    protected short inBillCollTunIntSn;
    @XmlElement(name = "InBillCrDepTrxDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inBillCrDepTrxDate;
    @XmlElement(name = "InBillCrDepTrxUnit")
    protected int inBillCrDepTrxUnit;
    @XmlElement(name = "InBillCrDepTrxUsr")
    protected String inBillCrDepTrxUsr;
    @XmlElement(name = "InBillCrDepTrxUsrSn")
    protected int inBillCrDepTrxUsrSn;
    @XmlElement(name = "InBillCrDepTunIntSn")
    protected short inBillCrDepTunIntSn;
    @XmlElement(name = "InBillCrLnsTmstamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inBillCrLnsTmstamp;
    @XmlElement(name = "InBillCrLnsTrxDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inBillCrLnsTrxDate;
    @XmlElement(name = "InBillCrLnsTrxIntSn")
    protected short inBillCrLnsTrxIntSn;
    @XmlElement(name = "InBillCrLnsTrxSn")
    protected int inBillCrLnsTrxSn;
    @XmlElement(name = "InBillCrLnsTrxUnit")
    protected int inBillCrLnsTrxUnit;
    @XmlElement(name = "InBillCrLnsTrxUsr")
    protected String inBillCrLnsTrxUsr;
    @XmlElement(name = "InBillDebDepTrxDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inBillDebDepTrxDate;
    @XmlElement(name = "InBillDebDepTrxUnit")
    protected int inBillDebDepTrxUnit;
    @XmlElement(name = "InBillDebDepTrxUsr")
    protected String inBillDebDepTrxUsr;
    @XmlElement(name = "InBillDebDepTrxUsrSn")
    protected int inBillDebDepTrxUsrSn;
    @XmlElement(name = "InBillDebDepTunIntSn")
    protected short inBillDebDepTunIntSn;
    @XmlElement(name = "InBillDebLnsTmstamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inBillDebLnsTmstamp;
    @XmlElement(name = "InBillDebLnsTrxDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inBillDebLnsTrxDate;
    @XmlElement(name = "InBillDebLnsTrxIntSn")
    protected short inBillDebLnsTrxIntSn;
    @XmlElement(name = "InBillDebLnsTrxSn")
    protected int inBillDebLnsTrxSn;
    @XmlElement(name = "InBillDebLnsTrxUnit")
    protected int inBillDebLnsTrxUnit;
    @XmlElement(name = "InBillDebLnsTrxUsr")
    protected String inBillDebLnsTrxUsr;
    @XmlElement(name = "InBillExpDepTrxDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inBillExpDepTrxDate;
    @XmlElement(name = "InBillExpDepTrxUnit")
    protected int inBillExpDepTrxUnit;
    @XmlElement(name = "InBillExpDepTrxUsr")
    protected String inBillExpDepTrxUsr;
    @XmlElement(name = "InBillExpDepTrxUsrSn")
    protected int inBillExpDepTrxUsrSn;
    @XmlElement(name = "InBillExpDepTunIntSn")
    protected short inBillExpDepTunIntSn;
    @XmlElement(name = "InBillExpLnsTmstamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inBillExpLnsTmstamp;
    @XmlElement(name = "InBillExpLnsTrxDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inBillExpLnsTrxDate;
    @XmlElement(name = "InBillExpLnsTrxIntSn")
    protected short inBillExpLnsTrxIntSn;
    @XmlElement(name = "InBillExpLnsTrxSn")
    protected int inBillExpLnsTrxSn;
    @XmlElement(name = "InBillExpLnsTrxUnit")
    protected int inBillExpLnsTrxUnit;
    @XmlElement(name = "InBillExpLnsTrxUsr")
    protected String inBillExpLnsTrxUsr;
    @XmlElement(name = "InBillJustificJustificDescription")
    protected String inBillJustificJustificDescription;
    @XmlElement(name = "InBillJustificJustificIdJustific")
    protected int inBillJustificJustificIdJustific;
    @XmlElement(name = "InBillPrftTrxPrftTransactionDescription")
    protected String inBillPrftTrxPrftTransactionDescription;
    @XmlElement(name = "InBillPrftTrxPrftTransactionIdTransact")
    protected int inBillPrftTrxPrftTransactionIdTransact;
    @XmlElement(name = "InBillProductIdProduct")
    protected int inBillProductIdProduct;
    @XmlElement(name = "InBillProductProductDescription")
    protected String inBillProductProductDescription;
    @XmlElement(name = "InBillProductProductIdProduct")
    protected int inBillProductProductIdProduct;
    @XmlElement(name = "InCancelTypeIefSuppliedFlag")
    protected String inCancelTypeIefSuppliedFlag;
    @XmlElement(name = "InCollaborationBankBankId")
    protected int inCollaborationBankBankId;
    @XmlElement(name = "InCommandIefSuppliedCommand")
    protected String inCommandIefSuppliedCommand;
    @XmlElement(name = "InCustomerCDigit")
    protected short inCustomerCDigit;
    @XmlElement(name = "InCustomerCustId")
    protected int inCustomerCustId;
    @XmlElement(name = "InCustomerFirstName")
    protected String inCustomerFirstName;
    @XmlElement(name = "InCustomerSurname")
    protected String inCustomerSurname;
    @XmlElement(name = "InInfoBillBillAccountNumb")
    protected String inInfoBillBillAccountNumb;
    @XmlElement(name = "InInfoBillBillAmount", required = true)
    protected BigDecimal inInfoBillBillAmount;
    @XmlElement(name = "InInfoBillBillBarcode")
    protected String inInfoBillBillBarcode;
    @XmlElement(name = "InInfoBillBillBranchCode")
    protected String inInfoBillBillBranchCode;
    @XmlElement(name = "InInfoBillBillCarrierId")
    protected String inInfoBillBillCarrierId;
    @XmlElement(name = "InInfoBillBillCarrierName")
    protected String inInfoBillBillCarrierName;
    @XmlElement(name = "InInfoBillBillCarrierNotes")
    protected String inInfoBillBillCarrierNotes;
    @XmlElement(name = "InInfoBillBillCarrierTitle")
    protected String inInfoBillBillCarrierTitle;
    @XmlElement(name = "InInfoBillBillChargesOnacc")
    protected String inInfoBillBillChargesOnacc;
    @XmlElement(name = "InInfoBillBillCheckDigit")
    protected short inInfoBillBillCheckDigit;
    @XmlElement(name = "InInfoBillBillClrtypeFlag")
    protected String inInfoBillBillClrtypeFlag;
    @XmlElement(name = "InInfoBillBillCollAccCd")
    protected short inInfoBillBillCollAccCd;
    @XmlElement(name = "InInfoBillBillCollAccNumb")
    protected String inInfoBillBillCollAccNumb;
    @XmlElement(name = "InInfoBillBillCollCode")
    protected String inInfoBillBillCollCode;
    @XmlElement(name = "InInfoBillBillCollJustif")
    protected int inInfoBillBillCollJustif;
    @XmlElement(name = "InInfoBillBillCollPrfsys")
    protected short inInfoBillBillCollPrfsys;
    @XmlElement(name = "InInfoBillBillCollSn")
    protected double inInfoBillBillCollSn;
    @XmlElement(name = "InInfoBillBillCollTmstamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inInfoBillBillCollTmstamp;
    @XmlElement(name = "InInfoBillBillCraccAvldays")
    protected short inInfoBillBillCraccAvldays;
    @XmlElement(name = "InInfoBillBillCrAccCd")
    protected short inInfoBillBillCrAccCd;
    @XmlElement(name = "InInfoBillBillCraccIntdays")
    protected short inInfoBillBillCraccIntdays;
    @XmlElement(name = "InInfoBillBillCraccJustif")
    protected int inInfoBillBillCraccJustif;
    @XmlElement(name = "InInfoBillBillCrAccNumber")
    protected String inInfoBillBillCrAccNumber;
    @XmlElement(name = "InInfoBillBillCraccPrfsys")
    protected short inInfoBillBillCraccPrfsys;
    @XmlElement(name = "InInfoBillBillDebaccCd")
    protected short inInfoBillBillDebaccCd;
    @XmlElement(name = "InInfoBillBillDebaccJust")
    protected int inInfoBillBillDebaccJust;
    @XmlElement(name = "InInfoBillBillDebaccNumber")
    protected String inInfoBillBillDebaccNumber;
    @XmlElement(name = "InInfoBillBillDebaccPrfsys")
    protected short inInfoBillBillDebaccPrfsys;
    @XmlElement(name = "InInfoBillBillEntryStatus")
    protected String inInfoBillBillEntryStatus;
    @XmlElement(name = "InInfoBillBillExpaccCd")
    protected short inInfoBillBillExpaccCd;
    @XmlElement(name = "InInfoBillBillExpaccNumber")
    protected String inInfoBillBillExpaccNumber;
    @XmlElement(name = "InInfoBillBillExpaccPrfsys")
    protected short inInfoBillBillExpaccPrfsys;
    @XmlElement(name = "InInfoBillBillExpDbJust")
    protected int inInfoBillBillExpDbJust;
    @XmlElement(name = "InInfoBillBillExpInterdate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inInfoBillBillExpInterdate;
    @XmlElement(name = "InInfoBillBillExpInterdays")
    protected short inInfoBillBillExpInterdays;
    @XmlElement(name = "InInfoBillBillFinalDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inInfoBillBillFinalDate;
    @XmlElement(name = "InInfoBillBillIbanCode")
    protected String inInfoBillBillIbanCode;
    @XmlElement(name = "InInfoBillBillInsDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inInfoBillBillInsDate;
    @XmlElement(name = "InInfoBillBillIssueDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inInfoBillBillIssueDate;
    @XmlElement(name = "InInfoBillBillJustificId")
    protected int inInfoBillBillJustificId;
    @XmlElement(name = "InInfoBillBillNumber")
    protected String inInfoBillBillNumber;
    @XmlElement(name = "InInfoBillBillOwnbankFlag")
    protected String inInfoBillBillOwnbankFlag;
    @XmlElement(name = "InInfoBillBillPrftTransId")
    protected int inInfoBillBillPrftTransId;
    @XmlElement(name = "InInfoBillBillProductId")
    protected int inInfoBillBillProductId;
    @XmlElement(name = "InInfoBillBillRejectedFlag")
    protected String inInfoBillBillRejectedFlag;
    @XmlElement(name = "InInfoBillBillRejectNotes")
    protected String inInfoBillBillRejectNotes;
    @XmlElement(name = "InInfoBillBillSendtoclrCnt")
    protected short inInfoBillBillSendtoclrCnt;
    @XmlElement(name = "InInfoBillBillSerialNum")
    protected double inInfoBillBillSerialNum;
    @XmlElement(name = "InInfoBillBillSpecialChars")
    protected String inInfoBillBillSpecialChars;
    @XmlElement(name = "InInfoBillBillStatusFlag")
    protected String inInfoBillBillStatusFlag;
    @XmlElement(name = "InInfoBillBillTmstamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inInfoBillBillTmstamp;
    @XmlElement(name = "InInfoBillBillTraceflowFlg")
    protected String inInfoBillBillTraceflowFlg;
    @XmlElement(name = "InInfoBillBillTypeFlag")
    protected String inInfoBillBillTypeFlag;
    @XmlElement(name = "InInfoBillBillUpdDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inInfoBillBillUpdDate;
    @XmlElement(name = "InInfoBillBillUpdUser")
    protected String inInfoBillBillUpdUser;
    @XmlElement(name = "InInfoBillBillValidateFlg")
    protected String inInfoBillBillValidateFlg;
    @XmlElement(name = "InInfoBillCollTrxDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inInfoBillCollTrxDate;
    @XmlElement(name = "InInfoBillCollTrxUnit")
    protected int inInfoBillCollTrxUnit;
    @XmlElement(name = "InInfoBillCollTrxUsr")
    protected String inInfoBillCollTrxUsr;
    @XmlElement(name = "InInfoBillCollTrxUsrSn")
    protected int inInfoBillCollTrxUsrSn;
    @XmlElement(name = "InInfoBillCollTunIntSn")
    protected short inInfoBillCollTunIntSn;
    @XmlElement(name = "InInfoBillCrDepTrxDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inInfoBillCrDepTrxDate;
    @XmlElement(name = "InInfoBillCrDepTrxUnit")
    protected int inInfoBillCrDepTrxUnit;
    @XmlElement(name = "InInfoBillCrDepTrxUsr")
    protected String inInfoBillCrDepTrxUsr;
    @XmlElement(name = "InInfoBillCrDepTrxUsrSn")
    protected int inInfoBillCrDepTrxUsrSn;
    @XmlElement(name = "InInfoBillCrDepTunIntSn")
    protected short inInfoBillCrDepTunIntSn;
    @XmlElement(name = "InInfoBillCrLnsTmstamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inInfoBillCrLnsTmstamp;
    @XmlElement(name = "InInfoBillCrLnsTrxDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inInfoBillCrLnsTrxDate;
    @XmlElement(name = "InInfoBillCrLnsTrxIntSn")
    protected short inInfoBillCrLnsTrxIntSn;
    @XmlElement(name = "InInfoBillCrLnsTrxSn")
    protected int inInfoBillCrLnsTrxSn;
    @XmlElement(name = "InInfoBillCrLnsTrxUnit")
    protected int inInfoBillCrLnsTrxUnit;
    @XmlElement(name = "InInfoBillCrLnsTrxUsr")
    protected String inInfoBillCrLnsTrxUsr;
    @XmlElement(name = "InInfoBillDebDepTrxDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inInfoBillDebDepTrxDate;
    @XmlElement(name = "InInfoBillDebDepTrxUnit")
    protected int inInfoBillDebDepTrxUnit;
    @XmlElement(name = "InInfoBillDebDepTrxUsr")
    protected String inInfoBillDebDepTrxUsr;
    @XmlElement(name = "InInfoBillDebDepTrxUsrSn")
    protected int inInfoBillDebDepTrxUsrSn;
    @XmlElement(name = "InInfoBillDebDepTunIntSn")
    protected short inInfoBillDebDepTunIntSn;
    @XmlElement(name = "InInfoBillDebLnsTmstamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inInfoBillDebLnsTmstamp;
    @XmlElement(name = "InInfoBillDebLnsTrxDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inInfoBillDebLnsTrxDate;
    @XmlElement(name = "InInfoBillDebLnsTrxIntSn")
    protected short inInfoBillDebLnsTrxIntSn;
    @XmlElement(name = "InInfoBillDebLnsTrxSn")
    protected int inInfoBillDebLnsTrxSn;
    @XmlElement(name = "InInfoBillDebLnsTrxUnit")
    protected int inInfoBillDebLnsTrxUnit;
    @XmlElement(name = "InInfoBillDebLnsTrxUsr")
    protected String inInfoBillDebLnsTrxUsr;
    @XmlElement(name = "InInfoBillExpDepTrxDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inInfoBillExpDepTrxDate;
    @XmlElement(name = "InInfoBillExpDepTrxUnit")
    protected int inInfoBillExpDepTrxUnit;
    @XmlElement(name = "InInfoBillExpDepTrxUsr")
    protected String inInfoBillExpDepTrxUsr;
    @XmlElement(name = "InInfoBillExpDepTrxUsrSn")
    protected int inInfoBillExpDepTrxUsrSn;
    @XmlElement(name = "InInfoBillExpDepTunIntSn")
    protected short inInfoBillExpDepTunIntSn;
    @XmlElement(name = "InInfoBillExpLnsTmstamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inInfoBillExpLnsTmstamp;
    @XmlElement(name = "InInfoBillExpLnsTrxDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inInfoBillExpLnsTrxDate;
    @XmlElement(name = "InInfoBillExpLnsTrxIntSn")
    protected short inInfoBillExpLnsTrxIntSn;
    @XmlElement(name = "InInfoBillExpLnsTrxSn")
    protected int inInfoBillExpLnsTrxSn;
    @XmlElement(name = "InInfoBillExpLnsTrxUnit")
    protected int inInfoBillExpLnsTrxUnit;
    @XmlElement(name = "InInfoBillExpLnsTrxUsr")
    protected String inInfoBillExpLnsTrxUsr;
    @XmlElement(name = "InJustificDescription")
    protected String inJustificDescription;
    @XmlElement(name = "InJustificIdJustific")
    protected int inJustificIdJustific;
    @XmlElement(name = "InPrftTransactionIdTransact")
    protected int inPrftTransactionIdTransact;
    @XmlElement(name = "InTrxCurrencyIdCurrency")
    protected int inTrxCurrencyIdCurrency;
    @XmlElement(name = "InTrxSsSecurityCmcbPrftSystem")
    protected short inTrxSsSecurityCmcbPrftSystem;
    @XmlElement(name = "InTrxTeamInformationSuper1Code")
    protected String inTrxTeamInformationSuper1Code;
    @XmlElement(name = "InTrxTeamInformationSuper2Code")
    protected String inTrxTeamInformationSuper2Code;
    @XmlElement(name = "InTrxTerminalTerminalNumber")
    protected String inTrxTerminalTerminalNumber;

    /**
     * Gets the value of the inAuthorGrantedIefSuppliedFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInAuthorGrantedIefSuppliedFlag() {
        return inAuthorGrantedIefSuppliedFlag;
    }

    /**
     * Sets the value of the inAuthorGrantedIefSuppliedFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInAuthorGrantedIefSuppliedFlag(String value) {
        this.inAuthorGrantedIefSuppliedFlag = value;
    }

    /**
     * Gets the value of the inBilerGenericDetailDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInBilerGenericDetailDescription() {
        return inBilerGenericDetailDescription;
    }

    /**
     * Sets the value of the inBilerGenericDetailDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInBilerGenericDetailDescription(String value) {
        this.inBilerGenericDetailDescription = value;
    }

    /**
     * Gets the value of the inBilerGenericDetailParameterType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInBilerGenericDetailParameterType() {
        return inBilerGenericDetailParameterType;
    }

    /**
     * Sets the value of the inBilerGenericDetailParameterType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInBilerGenericDetailParameterType(String value) {
        this.inBilerGenericDetailParameterType = value;
    }

    /**
     * Gets the value of the inBilerGenericDetailSerialNum property.
     * 
     */
    public int getInBilerGenericDetailSerialNum() {
        return inBilerGenericDetailSerialNum;
    }

    /**
     * Sets the value of the inBilerGenericDetailSerialNum property.
     * 
     */
    public void setInBilerGenericDetailSerialNum(int value) {
        this.inBilerGenericDetailSerialNum = value;
    }

    /**
     * Gets the value of the inBillBillAccountNumb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInBillBillAccountNumb() {
        return inBillBillAccountNumb;
    }

    /**
     * Sets the value of the inBillBillAccountNumb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInBillBillAccountNumb(String value) {
        this.inBillBillAccountNumb = value;
    }

    /**
     * Gets the value of the inBillBillAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInBillBillAmount() {
        return inBillBillAmount;
    }

    /**
     * Sets the value of the inBillBillAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInBillBillAmount(BigDecimal value) {
        this.inBillBillAmount = value;
    }

    /**
     * Gets the value of the inBillBillBarcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInBillBillBarcode() {
        return inBillBillBarcode;
    }

    /**
     * Sets the value of the inBillBillBarcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInBillBillBarcode(String value) {
        this.inBillBillBarcode = value;
    }

    /**
     * Gets the value of the inBillBillBranchCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInBillBillBranchCode() {
        return inBillBillBranchCode;
    }

    /**
     * Sets the value of the inBillBillBranchCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInBillBillBranchCode(String value) {
        this.inBillBillBranchCode = value;
    }

    /**
     * Gets the value of the inBillBillCarrierId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInBillBillCarrierId() {
        return inBillBillCarrierId;
    }

    /**
     * Sets the value of the inBillBillCarrierId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInBillBillCarrierId(String value) {
        this.inBillBillCarrierId = value;
    }

    /**
     * Gets the value of the inBillBillCarrierName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInBillBillCarrierName() {
        return inBillBillCarrierName;
    }

    /**
     * Sets the value of the inBillBillCarrierName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInBillBillCarrierName(String value) {
        this.inBillBillCarrierName = value;
    }

    /**
     * Gets the value of the inBillBillCarrierNotes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInBillBillCarrierNotes() {
        return inBillBillCarrierNotes;
    }

    /**
     * Sets the value of the inBillBillCarrierNotes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInBillBillCarrierNotes(String value) {
        this.inBillBillCarrierNotes = value;
    }

    /**
     * Gets the value of the inBillBillCarrierTitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInBillBillCarrierTitle() {
        return inBillBillCarrierTitle;
    }

    /**
     * Sets the value of the inBillBillCarrierTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInBillBillCarrierTitle(String value) {
        this.inBillBillCarrierTitle = value;
    }

    /**
     * Gets the value of the inBillBillChargesOnacc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInBillBillChargesOnacc() {
        return inBillBillChargesOnacc;
    }

    /**
     * Sets the value of the inBillBillChargesOnacc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInBillBillChargesOnacc(String value) {
        this.inBillBillChargesOnacc = value;
    }

    /**
     * Gets the value of the inBillBillCheckDigit property.
     * 
     */
    public short getInBillBillCheckDigit() {
        return inBillBillCheckDigit;
    }

    /**
     * Sets the value of the inBillBillCheckDigit property.
     * 
     */
    public void setInBillBillCheckDigit(short value) {
        this.inBillBillCheckDigit = value;
    }

    /**
     * Gets the value of the inBillBillClrtypeFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInBillBillClrtypeFlag() {
        return inBillBillClrtypeFlag;
    }

    /**
     * Sets the value of the inBillBillClrtypeFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInBillBillClrtypeFlag(String value) {
        this.inBillBillClrtypeFlag = value;
    }

    /**
     * Gets the value of the inBillBillCollAccCd property.
     * 
     */
    public short getInBillBillCollAccCd() {
        return inBillBillCollAccCd;
    }

    /**
     * Sets the value of the inBillBillCollAccCd property.
     * 
     */
    public void setInBillBillCollAccCd(short value) {
        this.inBillBillCollAccCd = value;
    }

    /**
     * Gets the value of the inBillBillCollAccNumb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInBillBillCollAccNumb() {
        return inBillBillCollAccNumb;
    }

    /**
     * Sets the value of the inBillBillCollAccNumb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInBillBillCollAccNumb(String value) {
        this.inBillBillCollAccNumb = value;
    }

    /**
     * Gets the value of the inBillBillCollCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInBillBillCollCode() {
        return inBillBillCollCode;
    }

    /**
     * Sets the value of the inBillBillCollCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInBillBillCollCode(String value) {
        this.inBillBillCollCode = value;
    }

    /**
     * Gets the value of the inBillBillCollJustif property.
     * 
     */
    public int getInBillBillCollJustif() {
        return inBillBillCollJustif;
    }

    /**
     * Sets the value of the inBillBillCollJustif property.
     * 
     */
    public void setInBillBillCollJustif(int value) {
        this.inBillBillCollJustif = value;
    }

    /**
     * Gets the value of the inBillBillCollPrfsys property.
     * 
     */
    public short getInBillBillCollPrfsys() {
        return inBillBillCollPrfsys;
    }

    /**
     * Sets the value of the inBillBillCollPrfsys property.
     * 
     */
    public void setInBillBillCollPrfsys(short value) {
        this.inBillBillCollPrfsys = value;
    }

    /**
     * Gets the value of the inBillBillCollSn property.
     * 
     */
    public double getInBillBillCollSn() {
        return inBillBillCollSn;
    }

    /**
     * Sets the value of the inBillBillCollSn property.
     * 
     */
    public void setInBillBillCollSn(double value) {
        this.inBillBillCollSn = value;
    }

    /**
     * Gets the value of the inBillBillCollTmstamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInBillBillCollTmstamp() {
        return inBillBillCollTmstamp;
    }

    /**
     * Sets the value of the inBillBillCollTmstamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInBillBillCollTmstamp(XMLGregorianCalendar value) {
        this.inBillBillCollTmstamp = value;
    }

    /**
     * Gets the value of the inBillBillCraccAvldays property.
     * 
     */
    public short getInBillBillCraccAvldays() {
        return inBillBillCraccAvldays;
    }

    /**
     * Sets the value of the inBillBillCraccAvldays property.
     * 
     */
    public void setInBillBillCraccAvldays(short value) {
        this.inBillBillCraccAvldays = value;
    }

    /**
     * Gets the value of the inBillBillCrAccCd property.
     * 
     */
    public short getInBillBillCrAccCd() {
        return inBillBillCrAccCd;
    }

    /**
     * Sets the value of the inBillBillCrAccCd property.
     * 
     */
    public void setInBillBillCrAccCd(short value) {
        this.inBillBillCrAccCd = value;
    }

    /**
     * Gets the value of the inBillBillCraccIntdays property.
     * 
     */
    public short getInBillBillCraccIntdays() {
        return inBillBillCraccIntdays;
    }

    /**
     * Sets the value of the inBillBillCraccIntdays property.
     * 
     */
    public void setInBillBillCraccIntdays(short value) {
        this.inBillBillCraccIntdays = value;
    }

    /**
     * Gets the value of the inBillBillCraccJustif property.
     * 
     */
    public int getInBillBillCraccJustif() {
        return inBillBillCraccJustif;
    }

    /**
     * Sets the value of the inBillBillCraccJustif property.
     * 
     */
    public void setInBillBillCraccJustif(int value) {
        this.inBillBillCraccJustif = value;
    }

    /**
     * Gets the value of the inBillBillCrAccNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInBillBillCrAccNumber() {
        return inBillBillCrAccNumber;
    }

    /**
     * Sets the value of the inBillBillCrAccNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInBillBillCrAccNumber(String value) {
        this.inBillBillCrAccNumber = value;
    }

    /**
     * Gets the value of the inBillBillCraccPrfsys property.
     * 
     */
    public short getInBillBillCraccPrfsys() {
        return inBillBillCraccPrfsys;
    }

    /**
     * Sets the value of the inBillBillCraccPrfsys property.
     * 
     */
    public void setInBillBillCraccPrfsys(short value) {
        this.inBillBillCraccPrfsys = value;
    }

    /**
     * Gets the value of the inBillBillDebaccCd property.
     * 
     */
    public short getInBillBillDebaccCd() {
        return inBillBillDebaccCd;
    }

    /**
     * Sets the value of the inBillBillDebaccCd property.
     * 
     */
    public void setInBillBillDebaccCd(short value) {
        this.inBillBillDebaccCd = value;
    }

    /**
     * Gets the value of the inBillBillDebaccJust property.
     * 
     */
    public int getInBillBillDebaccJust() {
        return inBillBillDebaccJust;
    }

    /**
     * Sets the value of the inBillBillDebaccJust property.
     * 
     */
    public void setInBillBillDebaccJust(int value) {
        this.inBillBillDebaccJust = value;
    }

    /**
     * Gets the value of the inBillBillDebaccNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInBillBillDebaccNumber() {
        return inBillBillDebaccNumber;
    }

    /**
     * Sets the value of the inBillBillDebaccNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInBillBillDebaccNumber(String value) {
        this.inBillBillDebaccNumber = value;
    }

    /**
     * Gets the value of the inBillBillDebaccPrfsys property.
     * 
     */
    public short getInBillBillDebaccPrfsys() {
        return inBillBillDebaccPrfsys;
    }

    /**
     * Sets the value of the inBillBillDebaccPrfsys property.
     * 
     */
    public void setInBillBillDebaccPrfsys(short value) {
        this.inBillBillDebaccPrfsys = value;
    }

    /**
     * Gets the value of the inBillBillEntryStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInBillBillEntryStatus() {
        return inBillBillEntryStatus;
    }

    /**
     * Sets the value of the inBillBillEntryStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInBillBillEntryStatus(String value) {
        this.inBillBillEntryStatus = value;
    }

    /**
     * Gets the value of the inBillBillExpaccCd property.
     * 
     */
    public short getInBillBillExpaccCd() {
        return inBillBillExpaccCd;
    }

    /**
     * Sets the value of the inBillBillExpaccCd property.
     * 
     */
    public void setInBillBillExpaccCd(short value) {
        this.inBillBillExpaccCd = value;
    }

    /**
     * Gets the value of the inBillBillExpaccNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInBillBillExpaccNumber() {
        return inBillBillExpaccNumber;
    }

    /**
     * Sets the value of the inBillBillExpaccNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInBillBillExpaccNumber(String value) {
        this.inBillBillExpaccNumber = value;
    }

    /**
     * Gets the value of the inBillBillExpaccPrfsys property.
     * 
     */
    public short getInBillBillExpaccPrfsys() {
        return inBillBillExpaccPrfsys;
    }

    /**
     * Sets the value of the inBillBillExpaccPrfsys property.
     * 
     */
    public void setInBillBillExpaccPrfsys(short value) {
        this.inBillBillExpaccPrfsys = value;
    }

    /**
     * Gets the value of the inBillBillExpDbJust property.
     * 
     */
    public int getInBillBillExpDbJust() {
        return inBillBillExpDbJust;
    }

    /**
     * Sets the value of the inBillBillExpDbJust property.
     * 
     */
    public void setInBillBillExpDbJust(int value) {
        this.inBillBillExpDbJust = value;
    }

    /**
     * Gets the value of the inBillBillExpInterdate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInBillBillExpInterdate() {
        return inBillBillExpInterdate;
    }

    /**
     * Sets the value of the inBillBillExpInterdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInBillBillExpInterdate(XMLGregorianCalendar value) {
        this.inBillBillExpInterdate = value;
    }

    /**
     * Gets the value of the inBillBillExpInterdays property.
     * 
     */
    public short getInBillBillExpInterdays() {
        return inBillBillExpInterdays;
    }

    /**
     * Sets the value of the inBillBillExpInterdays property.
     * 
     */
    public void setInBillBillExpInterdays(short value) {
        this.inBillBillExpInterdays = value;
    }

    /**
     * Gets the value of the inBillBillFinalDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInBillBillFinalDate() {
        return inBillBillFinalDate;
    }

    /**
     * Sets the value of the inBillBillFinalDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInBillBillFinalDate(XMLGregorianCalendar value) {
        this.inBillBillFinalDate = value;
    }

    /**
     * Gets the value of the inBillBillIbanCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInBillBillIbanCode() {
        return inBillBillIbanCode;
    }

    /**
     * Sets the value of the inBillBillIbanCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInBillBillIbanCode(String value) {
        this.inBillBillIbanCode = value;
    }

    /**
     * Gets the value of the inBillBillInsDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInBillBillInsDate() {
        return inBillBillInsDate;
    }

    /**
     * Sets the value of the inBillBillInsDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInBillBillInsDate(XMLGregorianCalendar value) {
        this.inBillBillInsDate = value;
    }

    /**
     * Gets the value of the inBillBillIssueDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInBillBillIssueDate() {
        return inBillBillIssueDate;
    }

    /**
     * Sets the value of the inBillBillIssueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInBillBillIssueDate(XMLGregorianCalendar value) {
        this.inBillBillIssueDate = value;
    }

    /**
     * Gets the value of the inBillBillJustificId property.
     * 
     */
    public int getInBillBillJustificId() {
        return inBillBillJustificId;
    }

    /**
     * Sets the value of the inBillBillJustificId property.
     * 
     */
    public void setInBillBillJustificId(int value) {
        this.inBillBillJustificId = value;
    }

    /**
     * Gets the value of the inBillBillNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInBillBillNumber() {
        return inBillBillNumber;
    }

    /**
     * Sets the value of the inBillBillNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInBillBillNumber(String value) {
        this.inBillBillNumber = value;
    }

    /**
     * Gets the value of the inBillBillOwnbankFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInBillBillOwnbankFlag() {
        return inBillBillOwnbankFlag;
    }

    /**
     * Sets the value of the inBillBillOwnbankFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInBillBillOwnbankFlag(String value) {
        this.inBillBillOwnbankFlag = value;
    }

    /**
     * Gets the value of the inBillBillPrftTransId property.
     * 
     */
    public int getInBillBillPrftTransId() {
        return inBillBillPrftTransId;
    }

    /**
     * Sets the value of the inBillBillPrftTransId property.
     * 
     */
    public void setInBillBillPrftTransId(int value) {
        this.inBillBillPrftTransId = value;
    }

    /**
     * Gets the value of the inBillBillProductId property.
     * 
     */
    public int getInBillBillProductId() {
        return inBillBillProductId;
    }

    /**
     * Sets the value of the inBillBillProductId property.
     * 
     */
    public void setInBillBillProductId(int value) {
        this.inBillBillProductId = value;
    }

    /**
     * Gets the value of the inBillBillRejectedFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInBillBillRejectedFlag() {
        return inBillBillRejectedFlag;
    }

    /**
     * Sets the value of the inBillBillRejectedFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInBillBillRejectedFlag(String value) {
        this.inBillBillRejectedFlag = value;
    }

    /**
     * Gets the value of the inBillBillRejectNotes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInBillBillRejectNotes() {
        return inBillBillRejectNotes;
    }

    /**
     * Sets the value of the inBillBillRejectNotes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInBillBillRejectNotes(String value) {
        this.inBillBillRejectNotes = value;
    }

    /**
     * Gets the value of the inBillBillSendtoclrCnt property.
     * 
     */
    public short getInBillBillSendtoclrCnt() {
        return inBillBillSendtoclrCnt;
    }

    /**
     * Sets the value of the inBillBillSendtoclrCnt property.
     * 
     */
    public void setInBillBillSendtoclrCnt(short value) {
        this.inBillBillSendtoclrCnt = value;
    }

    /**
     * Gets the value of the inBillBillSerialNum property.
     * 
     */
    public double getInBillBillSerialNum() {
        return inBillBillSerialNum;
    }

    /**
     * Sets the value of the inBillBillSerialNum property.
     * 
     */
    public void setInBillBillSerialNum(double value) {
        this.inBillBillSerialNum = value;
    }

    /**
     * Gets the value of the inBillBillSpecialChars property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInBillBillSpecialChars() {
        return inBillBillSpecialChars;
    }

    /**
     * Sets the value of the inBillBillSpecialChars property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInBillBillSpecialChars(String value) {
        this.inBillBillSpecialChars = value;
    }

    /**
     * Gets the value of the inBillBillStatusFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInBillBillStatusFlag() {
        return inBillBillStatusFlag;
    }

    /**
     * Sets the value of the inBillBillStatusFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInBillBillStatusFlag(String value) {
        this.inBillBillStatusFlag = value;
    }

    /**
     * Gets the value of the inBillBillTmstamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInBillBillTmstamp() {
        return inBillBillTmstamp;
    }

    /**
     * Sets the value of the inBillBillTmstamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInBillBillTmstamp(XMLGregorianCalendar value) {
        this.inBillBillTmstamp = value;
    }

    /**
     * Gets the value of the inBillBillTraceflowFlg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInBillBillTraceflowFlg() {
        return inBillBillTraceflowFlg;
    }

    /**
     * Sets the value of the inBillBillTraceflowFlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInBillBillTraceflowFlg(String value) {
        this.inBillBillTraceflowFlg = value;
    }

    /**
     * Gets the value of the inBillBillTypeFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInBillBillTypeFlag() {
        return inBillBillTypeFlag;
    }

    /**
     * Sets the value of the inBillBillTypeFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInBillBillTypeFlag(String value) {
        this.inBillBillTypeFlag = value;
    }

    /**
     * Gets the value of the inBillBillUpdDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInBillBillUpdDate() {
        return inBillBillUpdDate;
    }

    /**
     * Sets the value of the inBillBillUpdDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInBillBillUpdDate(XMLGregorianCalendar value) {
        this.inBillBillUpdDate = value;
    }

    /**
     * Gets the value of the inBillBillUpdUser property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInBillBillUpdUser() {
        return inBillBillUpdUser;
    }

    /**
     * Sets the value of the inBillBillUpdUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInBillBillUpdUser(String value) {
        this.inBillBillUpdUser = value;
    }

    /**
     * Gets the value of the inBillBillValidateFlg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInBillBillValidateFlg() {
        return inBillBillValidateFlg;
    }

    /**
     * Sets the value of the inBillBillValidateFlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInBillBillValidateFlg(String value) {
        this.inBillBillValidateFlg = value;
    }

    /**
     * Gets the value of the inBillCollTrxDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInBillCollTrxDate() {
        return inBillCollTrxDate;
    }

    /**
     * Sets the value of the inBillCollTrxDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInBillCollTrxDate(XMLGregorianCalendar value) {
        this.inBillCollTrxDate = value;
    }

    /**
     * Gets the value of the inBillCollTrxUnit property.
     * 
     */
    public int getInBillCollTrxUnit() {
        return inBillCollTrxUnit;
    }

    /**
     * Sets the value of the inBillCollTrxUnit property.
     * 
     */
    public void setInBillCollTrxUnit(int value) {
        this.inBillCollTrxUnit = value;
    }

    /**
     * Gets the value of the inBillCollTrxUsr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInBillCollTrxUsr() {
        return inBillCollTrxUsr;
    }

    /**
     * Sets the value of the inBillCollTrxUsr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInBillCollTrxUsr(String value) {
        this.inBillCollTrxUsr = value;
    }

    /**
     * Gets the value of the inBillCollTrxUsrSn property.
     * 
     */
    public int getInBillCollTrxUsrSn() {
        return inBillCollTrxUsrSn;
    }

    /**
     * Sets the value of the inBillCollTrxUsrSn property.
     * 
     */
    public void setInBillCollTrxUsrSn(int value) {
        this.inBillCollTrxUsrSn = value;
    }

    /**
     * Gets the value of the inBillCollTunIntSn property.
     * 
     */
    public short getInBillCollTunIntSn() {
        return inBillCollTunIntSn;
    }

    /**
     * Sets the value of the inBillCollTunIntSn property.
     * 
     */
    public void setInBillCollTunIntSn(short value) {
        this.inBillCollTunIntSn = value;
    }

    /**
     * Gets the value of the inBillCrDepTrxDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInBillCrDepTrxDate() {
        return inBillCrDepTrxDate;
    }

    /**
     * Sets the value of the inBillCrDepTrxDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInBillCrDepTrxDate(XMLGregorianCalendar value) {
        this.inBillCrDepTrxDate = value;
    }

    /**
     * Gets the value of the inBillCrDepTrxUnit property.
     * 
     */
    public int getInBillCrDepTrxUnit() {
        return inBillCrDepTrxUnit;
    }

    /**
     * Sets the value of the inBillCrDepTrxUnit property.
     * 
     */
    public void setInBillCrDepTrxUnit(int value) {
        this.inBillCrDepTrxUnit = value;
    }

    /**
     * Gets the value of the inBillCrDepTrxUsr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInBillCrDepTrxUsr() {
        return inBillCrDepTrxUsr;
    }

    /**
     * Sets the value of the inBillCrDepTrxUsr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInBillCrDepTrxUsr(String value) {
        this.inBillCrDepTrxUsr = value;
    }

    /**
     * Gets the value of the inBillCrDepTrxUsrSn property.
     * 
     */
    public int getInBillCrDepTrxUsrSn() {
        return inBillCrDepTrxUsrSn;
    }

    /**
     * Sets the value of the inBillCrDepTrxUsrSn property.
     * 
     */
    public void setInBillCrDepTrxUsrSn(int value) {
        this.inBillCrDepTrxUsrSn = value;
    }

    /**
     * Gets the value of the inBillCrDepTunIntSn property.
     * 
     */
    public short getInBillCrDepTunIntSn() {
        return inBillCrDepTunIntSn;
    }

    /**
     * Sets the value of the inBillCrDepTunIntSn property.
     * 
     */
    public void setInBillCrDepTunIntSn(short value) {
        this.inBillCrDepTunIntSn = value;
    }

    /**
     * Gets the value of the inBillCrLnsTmstamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInBillCrLnsTmstamp() {
        return inBillCrLnsTmstamp;
    }

    /**
     * Sets the value of the inBillCrLnsTmstamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInBillCrLnsTmstamp(XMLGregorianCalendar value) {
        this.inBillCrLnsTmstamp = value;
    }

    /**
     * Gets the value of the inBillCrLnsTrxDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInBillCrLnsTrxDate() {
        return inBillCrLnsTrxDate;
    }

    /**
     * Sets the value of the inBillCrLnsTrxDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInBillCrLnsTrxDate(XMLGregorianCalendar value) {
        this.inBillCrLnsTrxDate = value;
    }

    /**
     * Gets the value of the inBillCrLnsTrxIntSn property.
     * 
     */
    public short getInBillCrLnsTrxIntSn() {
        return inBillCrLnsTrxIntSn;
    }

    /**
     * Sets the value of the inBillCrLnsTrxIntSn property.
     * 
     */
    public void setInBillCrLnsTrxIntSn(short value) {
        this.inBillCrLnsTrxIntSn = value;
    }

    /**
     * Gets the value of the inBillCrLnsTrxSn property.
     * 
     */
    public int getInBillCrLnsTrxSn() {
        return inBillCrLnsTrxSn;
    }

    /**
     * Sets the value of the inBillCrLnsTrxSn property.
     * 
     */
    public void setInBillCrLnsTrxSn(int value) {
        this.inBillCrLnsTrxSn = value;
    }

    /**
     * Gets the value of the inBillCrLnsTrxUnit property.
     * 
     */
    public int getInBillCrLnsTrxUnit() {
        return inBillCrLnsTrxUnit;
    }

    /**
     * Sets the value of the inBillCrLnsTrxUnit property.
     * 
     */
    public void setInBillCrLnsTrxUnit(int value) {
        this.inBillCrLnsTrxUnit = value;
    }

    /**
     * Gets the value of the inBillCrLnsTrxUsr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInBillCrLnsTrxUsr() {
        return inBillCrLnsTrxUsr;
    }

    /**
     * Sets the value of the inBillCrLnsTrxUsr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInBillCrLnsTrxUsr(String value) {
        this.inBillCrLnsTrxUsr = value;
    }

    /**
     * Gets the value of the inBillDebDepTrxDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInBillDebDepTrxDate() {
        return inBillDebDepTrxDate;
    }

    /**
     * Sets the value of the inBillDebDepTrxDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInBillDebDepTrxDate(XMLGregorianCalendar value) {
        this.inBillDebDepTrxDate = value;
    }

    /**
     * Gets the value of the inBillDebDepTrxUnit property.
     * 
     */
    public int getInBillDebDepTrxUnit() {
        return inBillDebDepTrxUnit;
    }

    /**
     * Sets the value of the inBillDebDepTrxUnit property.
     * 
     */
    public void setInBillDebDepTrxUnit(int value) {
        this.inBillDebDepTrxUnit = value;
    }

    /**
     * Gets the value of the inBillDebDepTrxUsr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInBillDebDepTrxUsr() {
        return inBillDebDepTrxUsr;
    }

    /**
     * Sets the value of the inBillDebDepTrxUsr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInBillDebDepTrxUsr(String value) {
        this.inBillDebDepTrxUsr = value;
    }

    /**
     * Gets the value of the inBillDebDepTrxUsrSn property.
     * 
     */
    public int getInBillDebDepTrxUsrSn() {
        return inBillDebDepTrxUsrSn;
    }

    /**
     * Sets the value of the inBillDebDepTrxUsrSn property.
     * 
     */
    public void setInBillDebDepTrxUsrSn(int value) {
        this.inBillDebDepTrxUsrSn = value;
    }

    /**
     * Gets the value of the inBillDebDepTunIntSn property.
     * 
     */
    public short getInBillDebDepTunIntSn() {
        return inBillDebDepTunIntSn;
    }

    /**
     * Sets the value of the inBillDebDepTunIntSn property.
     * 
     */
    public void setInBillDebDepTunIntSn(short value) {
        this.inBillDebDepTunIntSn = value;
    }

    /**
     * Gets the value of the inBillDebLnsTmstamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInBillDebLnsTmstamp() {
        return inBillDebLnsTmstamp;
    }

    /**
     * Sets the value of the inBillDebLnsTmstamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInBillDebLnsTmstamp(XMLGregorianCalendar value) {
        this.inBillDebLnsTmstamp = value;
    }

    /**
     * Gets the value of the inBillDebLnsTrxDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInBillDebLnsTrxDate() {
        return inBillDebLnsTrxDate;
    }

    /**
     * Sets the value of the inBillDebLnsTrxDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInBillDebLnsTrxDate(XMLGregorianCalendar value) {
        this.inBillDebLnsTrxDate = value;
    }

    /**
     * Gets the value of the inBillDebLnsTrxIntSn property.
     * 
     */
    public short getInBillDebLnsTrxIntSn() {
        return inBillDebLnsTrxIntSn;
    }

    /**
     * Sets the value of the inBillDebLnsTrxIntSn property.
     * 
     */
    public void setInBillDebLnsTrxIntSn(short value) {
        this.inBillDebLnsTrxIntSn = value;
    }

    /**
     * Gets the value of the inBillDebLnsTrxSn property.
     * 
     */
    public int getInBillDebLnsTrxSn() {
        return inBillDebLnsTrxSn;
    }

    /**
     * Sets the value of the inBillDebLnsTrxSn property.
     * 
     */
    public void setInBillDebLnsTrxSn(int value) {
        this.inBillDebLnsTrxSn = value;
    }

    /**
     * Gets the value of the inBillDebLnsTrxUnit property.
     * 
     */
    public int getInBillDebLnsTrxUnit() {
        return inBillDebLnsTrxUnit;
    }

    /**
     * Sets the value of the inBillDebLnsTrxUnit property.
     * 
     */
    public void setInBillDebLnsTrxUnit(int value) {
        this.inBillDebLnsTrxUnit = value;
    }

    /**
     * Gets the value of the inBillDebLnsTrxUsr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInBillDebLnsTrxUsr() {
        return inBillDebLnsTrxUsr;
    }

    /**
     * Sets the value of the inBillDebLnsTrxUsr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInBillDebLnsTrxUsr(String value) {
        this.inBillDebLnsTrxUsr = value;
    }

    /**
     * Gets the value of the inBillExpDepTrxDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInBillExpDepTrxDate() {
        return inBillExpDepTrxDate;
    }

    /**
     * Sets the value of the inBillExpDepTrxDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInBillExpDepTrxDate(XMLGregorianCalendar value) {
        this.inBillExpDepTrxDate = value;
    }

    /**
     * Gets the value of the inBillExpDepTrxUnit property.
     * 
     */
    public int getInBillExpDepTrxUnit() {
        return inBillExpDepTrxUnit;
    }

    /**
     * Sets the value of the inBillExpDepTrxUnit property.
     * 
     */
    public void setInBillExpDepTrxUnit(int value) {
        this.inBillExpDepTrxUnit = value;
    }

    /**
     * Gets the value of the inBillExpDepTrxUsr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInBillExpDepTrxUsr() {
        return inBillExpDepTrxUsr;
    }

    /**
     * Sets the value of the inBillExpDepTrxUsr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInBillExpDepTrxUsr(String value) {
        this.inBillExpDepTrxUsr = value;
    }

    /**
     * Gets the value of the inBillExpDepTrxUsrSn property.
     * 
     */
    public int getInBillExpDepTrxUsrSn() {
        return inBillExpDepTrxUsrSn;
    }

    /**
     * Sets the value of the inBillExpDepTrxUsrSn property.
     * 
     */
    public void setInBillExpDepTrxUsrSn(int value) {
        this.inBillExpDepTrxUsrSn = value;
    }

    /**
     * Gets the value of the inBillExpDepTunIntSn property.
     * 
     */
    public short getInBillExpDepTunIntSn() {
        return inBillExpDepTunIntSn;
    }

    /**
     * Sets the value of the inBillExpDepTunIntSn property.
     * 
     */
    public void setInBillExpDepTunIntSn(short value) {
        this.inBillExpDepTunIntSn = value;
    }

    /**
     * Gets the value of the inBillExpLnsTmstamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInBillExpLnsTmstamp() {
        return inBillExpLnsTmstamp;
    }

    /**
     * Sets the value of the inBillExpLnsTmstamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInBillExpLnsTmstamp(XMLGregorianCalendar value) {
        this.inBillExpLnsTmstamp = value;
    }

    /**
     * Gets the value of the inBillExpLnsTrxDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInBillExpLnsTrxDate() {
        return inBillExpLnsTrxDate;
    }

    /**
     * Sets the value of the inBillExpLnsTrxDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInBillExpLnsTrxDate(XMLGregorianCalendar value) {
        this.inBillExpLnsTrxDate = value;
    }

    /**
     * Gets the value of the inBillExpLnsTrxIntSn property.
     * 
     */
    public short getInBillExpLnsTrxIntSn() {
        return inBillExpLnsTrxIntSn;
    }

    /**
     * Sets the value of the inBillExpLnsTrxIntSn property.
     * 
     */
    public void setInBillExpLnsTrxIntSn(short value) {
        this.inBillExpLnsTrxIntSn = value;
    }

    /**
     * Gets the value of the inBillExpLnsTrxSn property.
     * 
     */
    public int getInBillExpLnsTrxSn() {
        return inBillExpLnsTrxSn;
    }

    /**
     * Sets the value of the inBillExpLnsTrxSn property.
     * 
     */
    public void setInBillExpLnsTrxSn(int value) {
        this.inBillExpLnsTrxSn = value;
    }

    /**
     * Gets the value of the inBillExpLnsTrxUnit property.
     * 
     */
    public int getInBillExpLnsTrxUnit() {
        return inBillExpLnsTrxUnit;
    }

    /**
     * Sets the value of the inBillExpLnsTrxUnit property.
     * 
     */
    public void setInBillExpLnsTrxUnit(int value) {
        this.inBillExpLnsTrxUnit = value;
    }

    /**
     * Gets the value of the inBillExpLnsTrxUsr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInBillExpLnsTrxUsr() {
        return inBillExpLnsTrxUsr;
    }

    /**
     * Sets the value of the inBillExpLnsTrxUsr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInBillExpLnsTrxUsr(String value) {
        this.inBillExpLnsTrxUsr = value;
    }

    /**
     * Gets the value of the inBillJustificJustificDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInBillJustificJustificDescription() {
        return inBillJustificJustificDescription;
    }

    /**
     * Sets the value of the inBillJustificJustificDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInBillJustificJustificDescription(String value) {
        this.inBillJustificJustificDescription = value;
    }

    /**
     * Gets the value of the inBillJustificJustificIdJustific property.
     * 
     */
    public int getInBillJustificJustificIdJustific() {
        return inBillJustificJustificIdJustific;
    }

    /**
     * Sets the value of the inBillJustificJustificIdJustific property.
     * 
     */
    public void setInBillJustificJustificIdJustific(int value) {
        this.inBillJustificJustificIdJustific = value;
    }

    /**
     * Gets the value of the inBillPrftTrxPrftTransactionDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInBillPrftTrxPrftTransactionDescription() {
        return inBillPrftTrxPrftTransactionDescription;
    }

    /**
     * Sets the value of the inBillPrftTrxPrftTransactionDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInBillPrftTrxPrftTransactionDescription(String value) {
        this.inBillPrftTrxPrftTransactionDescription = value;
    }

    /**
     * Gets the value of the inBillPrftTrxPrftTransactionIdTransact property.
     * 
     */
    public int getInBillPrftTrxPrftTransactionIdTransact() {
        return inBillPrftTrxPrftTransactionIdTransact;
    }

    /**
     * Sets the value of the inBillPrftTrxPrftTransactionIdTransact property.
     * 
     */
    public void setInBillPrftTrxPrftTransactionIdTransact(int value) {
        this.inBillPrftTrxPrftTransactionIdTransact = value;
    }

    /**
     * Gets the value of the inBillProductIdProduct property.
     * 
     */
    public int getInBillProductIdProduct() {
        return inBillProductIdProduct;
    }

    /**
     * Sets the value of the inBillProductIdProduct property.
     * 
     */
    public void setInBillProductIdProduct(int value) {
        this.inBillProductIdProduct = value;
    }

    /**
     * Gets the value of the inBillProductProductDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInBillProductProductDescription() {
        return inBillProductProductDescription;
    }

    /**
     * Sets the value of the inBillProductProductDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInBillProductProductDescription(String value) {
        this.inBillProductProductDescription = value;
    }

    /**
     * Gets the value of the inBillProductProductIdProduct property.
     * 
     */
    public int getInBillProductProductIdProduct() {
        return inBillProductProductIdProduct;
    }

    /**
     * Sets the value of the inBillProductProductIdProduct property.
     * 
     */
    public void setInBillProductProductIdProduct(int value) {
        this.inBillProductProductIdProduct = value;
    }

    /**
     * Gets the value of the inCancelTypeIefSuppliedFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCancelTypeIefSuppliedFlag() {
        return inCancelTypeIefSuppliedFlag;
    }

    /**
     * Sets the value of the inCancelTypeIefSuppliedFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCancelTypeIefSuppliedFlag(String value) {
        this.inCancelTypeIefSuppliedFlag = value;
    }

    /**
     * Gets the value of the inCollaborationBankBankId property.
     * 
     */
    public int getInCollaborationBankBankId() {
        return inCollaborationBankBankId;
    }

    /**
     * Sets the value of the inCollaborationBankBankId property.
     * 
     */
    public void setInCollaborationBankBankId(int value) {
        this.inCollaborationBankBankId = value;
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
     * Gets the value of the inCustomerCDigit property.
     * 
     */
    public short getInCustomerCDigit() {
        return inCustomerCDigit;
    }

    /**
     * Sets the value of the inCustomerCDigit property.
     * 
     */
    public void setInCustomerCDigit(short value) {
        this.inCustomerCDigit = value;
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
     * Gets the value of the inCustomerFirstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCustomerFirstName() {
        return inCustomerFirstName;
    }

    /**
     * Sets the value of the inCustomerFirstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCustomerFirstName(String value) {
        this.inCustomerFirstName = value;
    }

    /**
     * Gets the value of the inCustomerSurname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCustomerSurname() {
        return inCustomerSurname;
    }

    /**
     * Sets the value of the inCustomerSurname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCustomerSurname(String value) {
        this.inCustomerSurname = value;
    }

    /**
     * Gets the value of the inInfoBillBillAccountNumb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInInfoBillBillAccountNumb() {
        return inInfoBillBillAccountNumb;
    }

    /**
     * Sets the value of the inInfoBillBillAccountNumb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInInfoBillBillAccountNumb(String value) {
        this.inInfoBillBillAccountNumb = value;
    }

    /**
     * Gets the value of the inInfoBillBillAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInInfoBillBillAmount() {
        return inInfoBillBillAmount;
    }

    /**
     * Sets the value of the inInfoBillBillAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInInfoBillBillAmount(BigDecimal value) {
        this.inInfoBillBillAmount = value;
    }

    /**
     * Gets the value of the inInfoBillBillBarcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInInfoBillBillBarcode() {
        return inInfoBillBillBarcode;
    }

    /**
     * Sets the value of the inInfoBillBillBarcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInInfoBillBillBarcode(String value) {
        this.inInfoBillBillBarcode = value;
    }

    /**
     * Gets the value of the inInfoBillBillBranchCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInInfoBillBillBranchCode() {
        return inInfoBillBillBranchCode;
    }

    /**
     * Sets the value of the inInfoBillBillBranchCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInInfoBillBillBranchCode(String value) {
        this.inInfoBillBillBranchCode = value;
    }

    /**
     * Gets the value of the inInfoBillBillCarrierId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInInfoBillBillCarrierId() {
        return inInfoBillBillCarrierId;
    }

    /**
     * Sets the value of the inInfoBillBillCarrierId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInInfoBillBillCarrierId(String value) {
        this.inInfoBillBillCarrierId = value;
    }

    /**
     * Gets the value of the inInfoBillBillCarrierName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInInfoBillBillCarrierName() {
        return inInfoBillBillCarrierName;
    }

    /**
     * Sets the value of the inInfoBillBillCarrierName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInInfoBillBillCarrierName(String value) {
        this.inInfoBillBillCarrierName = value;
    }

    /**
     * Gets the value of the inInfoBillBillCarrierNotes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInInfoBillBillCarrierNotes() {
        return inInfoBillBillCarrierNotes;
    }

    /**
     * Sets the value of the inInfoBillBillCarrierNotes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInInfoBillBillCarrierNotes(String value) {
        this.inInfoBillBillCarrierNotes = value;
    }

    /**
     * Gets the value of the inInfoBillBillCarrierTitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInInfoBillBillCarrierTitle() {
        return inInfoBillBillCarrierTitle;
    }

    /**
     * Sets the value of the inInfoBillBillCarrierTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInInfoBillBillCarrierTitle(String value) {
        this.inInfoBillBillCarrierTitle = value;
    }

    /**
     * Gets the value of the inInfoBillBillChargesOnacc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInInfoBillBillChargesOnacc() {
        return inInfoBillBillChargesOnacc;
    }

    /**
     * Sets the value of the inInfoBillBillChargesOnacc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInInfoBillBillChargesOnacc(String value) {
        this.inInfoBillBillChargesOnacc = value;
    }

    /**
     * Gets the value of the inInfoBillBillCheckDigit property.
     * 
     */
    public short getInInfoBillBillCheckDigit() {
        return inInfoBillBillCheckDigit;
    }

    /**
     * Sets the value of the inInfoBillBillCheckDigit property.
     * 
     */
    public void setInInfoBillBillCheckDigit(short value) {
        this.inInfoBillBillCheckDigit = value;
    }

    /**
     * Gets the value of the inInfoBillBillClrtypeFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInInfoBillBillClrtypeFlag() {
        return inInfoBillBillClrtypeFlag;
    }

    /**
     * Sets the value of the inInfoBillBillClrtypeFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInInfoBillBillClrtypeFlag(String value) {
        this.inInfoBillBillClrtypeFlag = value;
    }

    /**
     * Gets the value of the inInfoBillBillCollAccCd property.
     * 
     */
    public short getInInfoBillBillCollAccCd() {
        return inInfoBillBillCollAccCd;
    }

    /**
     * Sets the value of the inInfoBillBillCollAccCd property.
     * 
     */
    public void setInInfoBillBillCollAccCd(short value) {
        this.inInfoBillBillCollAccCd = value;
    }

    /**
     * Gets the value of the inInfoBillBillCollAccNumb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInInfoBillBillCollAccNumb() {
        return inInfoBillBillCollAccNumb;
    }

    /**
     * Sets the value of the inInfoBillBillCollAccNumb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInInfoBillBillCollAccNumb(String value) {
        this.inInfoBillBillCollAccNumb = value;
    }

    /**
     * Gets the value of the inInfoBillBillCollCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInInfoBillBillCollCode() {
        return inInfoBillBillCollCode;
    }

    /**
     * Sets the value of the inInfoBillBillCollCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInInfoBillBillCollCode(String value) {
        this.inInfoBillBillCollCode = value;
    }

    /**
     * Gets the value of the inInfoBillBillCollJustif property.
     * 
     */
    public int getInInfoBillBillCollJustif() {
        return inInfoBillBillCollJustif;
    }

    /**
     * Sets the value of the inInfoBillBillCollJustif property.
     * 
     */
    public void setInInfoBillBillCollJustif(int value) {
        this.inInfoBillBillCollJustif = value;
    }

    /**
     * Gets the value of the inInfoBillBillCollPrfsys property.
     * 
     */
    public short getInInfoBillBillCollPrfsys() {
        return inInfoBillBillCollPrfsys;
    }

    /**
     * Sets the value of the inInfoBillBillCollPrfsys property.
     * 
     */
    public void setInInfoBillBillCollPrfsys(short value) {
        this.inInfoBillBillCollPrfsys = value;
    }

    /**
     * Gets the value of the inInfoBillBillCollSn property.
     * 
     */
    public double getInInfoBillBillCollSn() {
        return inInfoBillBillCollSn;
    }

    /**
     * Sets the value of the inInfoBillBillCollSn property.
     * 
     */
    public void setInInfoBillBillCollSn(double value) {
        this.inInfoBillBillCollSn = value;
    }

    /**
     * Gets the value of the inInfoBillBillCollTmstamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInInfoBillBillCollTmstamp() {
        return inInfoBillBillCollTmstamp;
    }

    /**
     * Sets the value of the inInfoBillBillCollTmstamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInInfoBillBillCollTmstamp(XMLGregorianCalendar value) {
        this.inInfoBillBillCollTmstamp = value;
    }

    /**
     * Gets the value of the inInfoBillBillCraccAvldays property.
     * 
     */
    public short getInInfoBillBillCraccAvldays() {
        return inInfoBillBillCraccAvldays;
    }

    /**
     * Sets the value of the inInfoBillBillCraccAvldays property.
     * 
     */
    public void setInInfoBillBillCraccAvldays(short value) {
        this.inInfoBillBillCraccAvldays = value;
    }

    /**
     * Gets the value of the inInfoBillBillCrAccCd property.
     * 
     */
    public short getInInfoBillBillCrAccCd() {
        return inInfoBillBillCrAccCd;
    }

    /**
     * Sets the value of the inInfoBillBillCrAccCd property.
     * 
     */
    public void setInInfoBillBillCrAccCd(short value) {
        this.inInfoBillBillCrAccCd = value;
    }

    /**
     * Gets the value of the inInfoBillBillCraccIntdays property.
     * 
     */
    public short getInInfoBillBillCraccIntdays() {
        return inInfoBillBillCraccIntdays;
    }

    /**
     * Sets the value of the inInfoBillBillCraccIntdays property.
     * 
     */
    public void setInInfoBillBillCraccIntdays(short value) {
        this.inInfoBillBillCraccIntdays = value;
    }

    /**
     * Gets the value of the inInfoBillBillCraccJustif property.
     * 
     */
    public int getInInfoBillBillCraccJustif() {
        return inInfoBillBillCraccJustif;
    }

    /**
     * Sets the value of the inInfoBillBillCraccJustif property.
     * 
     */
    public void setInInfoBillBillCraccJustif(int value) {
        this.inInfoBillBillCraccJustif = value;
    }

    /**
     * Gets the value of the inInfoBillBillCrAccNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInInfoBillBillCrAccNumber() {
        return inInfoBillBillCrAccNumber;
    }

    /**
     * Sets the value of the inInfoBillBillCrAccNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInInfoBillBillCrAccNumber(String value) {
        this.inInfoBillBillCrAccNumber = value;
    }

    /**
     * Gets the value of the inInfoBillBillCraccPrfsys property.
     * 
     */
    public short getInInfoBillBillCraccPrfsys() {
        return inInfoBillBillCraccPrfsys;
    }

    /**
     * Sets the value of the inInfoBillBillCraccPrfsys property.
     * 
     */
    public void setInInfoBillBillCraccPrfsys(short value) {
        this.inInfoBillBillCraccPrfsys = value;
    }

    /**
     * Gets the value of the inInfoBillBillDebaccCd property.
     * 
     */
    public short getInInfoBillBillDebaccCd() {
        return inInfoBillBillDebaccCd;
    }

    /**
     * Sets the value of the inInfoBillBillDebaccCd property.
     * 
     */
    public void setInInfoBillBillDebaccCd(short value) {
        this.inInfoBillBillDebaccCd = value;
    }

    /**
     * Gets the value of the inInfoBillBillDebaccJust property.
     * 
     */
    public int getInInfoBillBillDebaccJust() {
        return inInfoBillBillDebaccJust;
    }

    /**
     * Sets the value of the inInfoBillBillDebaccJust property.
     * 
     */
    public void setInInfoBillBillDebaccJust(int value) {
        this.inInfoBillBillDebaccJust = value;
    }

    /**
     * Gets the value of the inInfoBillBillDebaccNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInInfoBillBillDebaccNumber() {
        return inInfoBillBillDebaccNumber;
    }

    /**
     * Sets the value of the inInfoBillBillDebaccNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInInfoBillBillDebaccNumber(String value) {
        this.inInfoBillBillDebaccNumber = value;
    }

    /**
     * Gets the value of the inInfoBillBillDebaccPrfsys property.
     * 
     */
    public short getInInfoBillBillDebaccPrfsys() {
        return inInfoBillBillDebaccPrfsys;
    }

    /**
     * Sets the value of the inInfoBillBillDebaccPrfsys property.
     * 
     */
    public void setInInfoBillBillDebaccPrfsys(short value) {
        this.inInfoBillBillDebaccPrfsys = value;
    }

    /**
     * Gets the value of the inInfoBillBillEntryStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInInfoBillBillEntryStatus() {
        return inInfoBillBillEntryStatus;
    }

    /**
     * Sets the value of the inInfoBillBillEntryStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInInfoBillBillEntryStatus(String value) {
        this.inInfoBillBillEntryStatus = value;
    }

    /**
     * Gets the value of the inInfoBillBillExpaccCd property.
     * 
     */
    public short getInInfoBillBillExpaccCd() {
        return inInfoBillBillExpaccCd;
    }

    /**
     * Sets the value of the inInfoBillBillExpaccCd property.
     * 
     */
    public void setInInfoBillBillExpaccCd(short value) {
        this.inInfoBillBillExpaccCd = value;
    }

    /**
     * Gets the value of the inInfoBillBillExpaccNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInInfoBillBillExpaccNumber() {
        return inInfoBillBillExpaccNumber;
    }

    /**
     * Sets the value of the inInfoBillBillExpaccNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInInfoBillBillExpaccNumber(String value) {
        this.inInfoBillBillExpaccNumber = value;
    }

    /**
     * Gets the value of the inInfoBillBillExpaccPrfsys property.
     * 
     */
    public short getInInfoBillBillExpaccPrfsys() {
        return inInfoBillBillExpaccPrfsys;
    }

    /**
     * Sets the value of the inInfoBillBillExpaccPrfsys property.
     * 
     */
    public void setInInfoBillBillExpaccPrfsys(short value) {
        this.inInfoBillBillExpaccPrfsys = value;
    }

    /**
     * Gets the value of the inInfoBillBillExpDbJust property.
     * 
     */
    public int getInInfoBillBillExpDbJust() {
        return inInfoBillBillExpDbJust;
    }

    /**
     * Sets the value of the inInfoBillBillExpDbJust property.
     * 
     */
    public void setInInfoBillBillExpDbJust(int value) {
        this.inInfoBillBillExpDbJust = value;
    }

    /**
     * Gets the value of the inInfoBillBillExpInterdate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInInfoBillBillExpInterdate() {
        return inInfoBillBillExpInterdate;
    }

    /**
     * Sets the value of the inInfoBillBillExpInterdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInInfoBillBillExpInterdate(XMLGregorianCalendar value) {
        this.inInfoBillBillExpInterdate = value;
    }

    /**
     * Gets the value of the inInfoBillBillExpInterdays property.
     * 
     */
    public short getInInfoBillBillExpInterdays() {
        return inInfoBillBillExpInterdays;
    }

    /**
     * Sets the value of the inInfoBillBillExpInterdays property.
     * 
     */
    public void setInInfoBillBillExpInterdays(short value) {
        this.inInfoBillBillExpInterdays = value;
    }

    /**
     * Gets the value of the inInfoBillBillFinalDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInInfoBillBillFinalDate() {
        return inInfoBillBillFinalDate;
    }

    /**
     * Sets the value of the inInfoBillBillFinalDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInInfoBillBillFinalDate(XMLGregorianCalendar value) {
        this.inInfoBillBillFinalDate = value;
    }

    /**
     * Gets the value of the inInfoBillBillIbanCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInInfoBillBillIbanCode() {
        return inInfoBillBillIbanCode;
    }

    /**
     * Sets the value of the inInfoBillBillIbanCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInInfoBillBillIbanCode(String value) {
        this.inInfoBillBillIbanCode = value;
    }

    /**
     * Gets the value of the inInfoBillBillInsDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInInfoBillBillInsDate() {
        return inInfoBillBillInsDate;
    }

    /**
     * Sets the value of the inInfoBillBillInsDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInInfoBillBillInsDate(XMLGregorianCalendar value) {
        this.inInfoBillBillInsDate = value;
    }

    /**
     * Gets the value of the inInfoBillBillIssueDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInInfoBillBillIssueDate() {
        return inInfoBillBillIssueDate;
    }

    /**
     * Sets the value of the inInfoBillBillIssueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInInfoBillBillIssueDate(XMLGregorianCalendar value) {
        this.inInfoBillBillIssueDate = value;
    }

    /**
     * Gets the value of the inInfoBillBillJustificId property.
     * 
     */
    public int getInInfoBillBillJustificId() {
        return inInfoBillBillJustificId;
    }

    /**
     * Sets the value of the inInfoBillBillJustificId property.
     * 
     */
    public void setInInfoBillBillJustificId(int value) {
        this.inInfoBillBillJustificId = value;
    }

    /**
     * Gets the value of the inInfoBillBillNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInInfoBillBillNumber() {
        return inInfoBillBillNumber;
    }

    /**
     * Sets the value of the inInfoBillBillNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInInfoBillBillNumber(String value) {
        this.inInfoBillBillNumber = value;
    }

    /**
     * Gets the value of the inInfoBillBillOwnbankFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInInfoBillBillOwnbankFlag() {
        return inInfoBillBillOwnbankFlag;
    }

    /**
     * Sets the value of the inInfoBillBillOwnbankFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInInfoBillBillOwnbankFlag(String value) {
        this.inInfoBillBillOwnbankFlag = value;
    }

    /**
     * Gets the value of the inInfoBillBillPrftTransId property.
     * 
     */
    public int getInInfoBillBillPrftTransId() {
        return inInfoBillBillPrftTransId;
    }

    /**
     * Sets the value of the inInfoBillBillPrftTransId property.
     * 
     */
    public void setInInfoBillBillPrftTransId(int value) {
        this.inInfoBillBillPrftTransId = value;
    }

    /**
     * Gets the value of the inInfoBillBillProductId property.
     * 
     */
    public int getInInfoBillBillProductId() {
        return inInfoBillBillProductId;
    }

    /**
     * Sets the value of the inInfoBillBillProductId property.
     * 
     */
    public void setInInfoBillBillProductId(int value) {
        this.inInfoBillBillProductId = value;
    }

    /**
     * Gets the value of the inInfoBillBillRejectedFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInInfoBillBillRejectedFlag() {
        return inInfoBillBillRejectedFlag;
    }

    /**
     * Sets the value of the inInfoBillBillRejectedFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInInfoBillBillRejectedFlag(String value) {
        this.inInfoBillBillRejectedFlag = value;
    }

    /**
     * Gets the value of the inInfoBillBillRejectNotes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInInfoBillBillRejectNotes() {
        return inInfoBillBillRejectNotes;
    }

    /**
     * Sets the value of the inInfoBillBillRejectNotes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInInfoBillBillRejectNotes(String value) {
        this.inInfoBillBillRejectNotes = value;
    }

    /**
     * Gets the value of the inInfoBillBillSendtoclrCnt property.
     * 
     */
    public short getInInfoBillBillSendtoclrCnt() {
        return inInfoBillBillSendtoclrCnt;
    }

    /**
     * Sets the value of the inInfoBillBillSendtoclrCnt property.
     * 
     */
    public void setInInfoBillBillSendtoclrCnt(short value) {
        this.inInfoBillBillSendtoclrCnt = value;
    }

    /**
     * Gets the value of the inInfoBillBillSerialNum property.
     * 
     */
    public double getInInfoBillBillSerialNum() {
        return inInfoBillBillSerialNum;
    }

    /**
     * Sets the value of the inInfoBillBillSerialNum property.
     * 
     */
    public void setInInfoBillBillSerialNum(double value) {
        this.inInfoBillBillSerialNum = value;
    }

    /**
     * Gets the value of the inInfoBillBillSpecialChars property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInInfoBillBillSpecialChars() {
        return inInfoBillBillSpecialChars;
    }

    /**
     * Sets the value of the inInfoBillBillSpecialChars property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInInfoBillBillSpecialChars(String value) {
        this.inInfoBillBillSpecialChars = value;
    }

    /**
     * Gets the value of the inInfoBillBillStatusFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInInfoBillBillStatusFlag() {
        return inInfoBillBillStatusFlag;
    }

    /**
     * Sets the value of the inInfoBillBillStatusFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInInfoBillBillStatusFlag(String value) {
        this.inInfoBillBillStatusFlag = value;
    }

    /**
     * Gets the value of the inInfoBillBillTmstamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInInfoBillBillTmstamp() {
        return inInfoBillBillTmstamp;
    }

    /**
     * Sets the value of the inInfoBillBillTmstamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInInfoBillBillTmstamp(XMLGregorianCalendar value) {
        this.inInfoBillBillTmstamp = value;
    }

    /**
     * Gets the value of the inInfoBillBillTraceflowFlg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInInfoBillBillTraceflowFlg() {
        return inInfoBillBillTraceflowFlg;
    }

    /**
     * Sets the value of the inInfoBillBillTraceflowFlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInInfoBillBillTraceflowFlg(String value) {
        this.inInfoBillBillTraceflowFlg = value;
    }

    /**
     * Gets the value of the inInfoBillBillTypeFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInInfoBillBillTypeFlag() {
        return inInfoBillBillTypeFlag;
    }

    /**
     * Sets the value of the inInfoBillBillTypeFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInInfoBillBillTypeFlag(String value) {
        this.inInfoBillBillTypeFlag = value;
    }

    /**
     * Gets the value of the inInfoBillBillUpdDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInInfoBillBillUpdDate() {
        return inInfoBillBillUpdDate;
    }

    /**
     * Sets the value of the inInfoBillBillUpdDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInInfoBillBillUpdDate(XMLGregorianCalendar value) {
        this.inInfoBillBillUpdDate = value;
    }

    /**
     * Gets the value of the inInfoBillBillUpdUser property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInInfoBillBillUpdUser() {
        return inInfoBillBillUpdUser;
    }

    /**
     * Sets the value of the inInfoBillBillUpdUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInInfoBillBillUpdUser(String value) {
        this.inInfoBillBillUpdUser = value;
    }

    /**
     * Gets the value of the inInfoBillBillValidateFlg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInInfoBillBillValidateFlg() {
        return inInfoBillBillValidateFlg;
    }

    /**
     * Sets the value of the inInfoBillBillValidateFlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInInfoBillBillValidateFlg(String value) {
        this.inInfoBillBillValidateFlg = value;
    }

    /**
     * Gets the value of the inInfoBillCollTrxDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInInfoBillCollTrxDate() {
        return inInfoBillCollTrxDate;
    }

    /**
     * Sets the value of the inInfoBillCollTrxDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInInfoBillCollTrxDate(XMLGregorianCalendar value) {
        this.inInfoBillCollTrxDate = value;
    }

    /**
     * Gets the value of the inInfoBillCollTrxUnit property.
     * 
     */
    public int getInInfoBillCollTrxUnit() {
        return inInfoBillCollTrxUnit;
    }

    /**
     * Sets the value of the inInfoBillCollTrxUnit property.
     * 
     */
    public void setInInfoBillCollTrxUnit(int value) {
        this.inInfoBillCollTrxUnit = value;
    }

    /**
     * Gets the value of the inInfoBillCollTrxUsr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInInfoBillCollTrxUsr() {
        return inInfoBillCollTrxUsr;
    }

    /**
     * Sets the value of the inInfoBillCollTrxUsr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInInfoBillCollTrxUsr(String value) {
        this.inInfoBillCollTrxUsr = value;
    }

    /**
     * Gets the value of the inInfoBillCollTrxUsrSn property.
     * 
     */
    public int getInInfoBillCollTrxUsrSn() {
        return inInfoBillCollTrxUsrSn;
    }

    /**
     * Sets the value of the inInfoBillCollTrxUsrSn property.
     * 
     */
    public void setInInfoBillCollTrxUsrSn(int value) {
        this.inInfoBillCollTrxUsrSn = value;
    }

    /**
     * Gets the value of the inInfoBillCollTunIntSn property.
     * 
     */
    public short getInInfoBillCollTunIntSn() {
        return inInfoBillCollTunIntSn;
    }

    /**
     * Sets the value of the inInfoBillCollTunIntSn property.
     * 
     */
    public void setInInfoBillCollTunIntSn(short value) {
        this.inInfoBillCollTunIntSn = value;
    }

    /**
     * Gets the value of the inInfoBillCrDepTrxDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInInfoBillCrDepTrxDate() {
        return inInfoBillCrDepTrxDate;
    }

    /**
     * Sets the value of the inInfoBillCrDepTrxDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInInfoBillCrDepTrxDate(XMLGregorianCalendar value) {
        this.inInfoBillCrDepTrxDate = value;
    }

    /**
     * Gets the value of the inInfoBillCrDepTrxUnit property.
     * 
     */
    public int getInInfoBillCrDepTrxUnit() {
        return inInfoBillCrDepTrxUnit;
    }

    /**
     * Sets the value of the inInfoBillCrDepTrxUnit property.
     * 
     */
    public void setInInfoBillCrDepTrxUnit(int value) {
        this.inInfoBillCrDepTrxUnit = value;
    }

    /**
     * Gets the value of the inInfoBillCrDepTrxUsr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInInfoBillCrDepTrxUsr() {
        return inInfoBillCrDepTrxUsr;
    }

    /**
     * Sets the value of the inInfoBillCrDepTrxUsr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInInfoBillCrDepTrxUsr(String value) {
        this.inInfoBillCrDepTrxUsr = value;
    }

    /**
     * Gets the value of the inInfoBillCrDepTrxUsrSn property.
     * 
     */
    public int getInInfoBillCrDepTrxUsrSn() {
        return inInfoBillCrDepTrxUsrSn;
    }

    /**
     * Sets the value of the inInfoBillCrDepTrxUsrSn property.
     * 
     */
    public void setInInfoBillCrDepTrxUsrSn(int value) {
        this.inInfoBillCrDepTrxUsrSn = value;
    }

    /**
     * Gets the value of the inInfoBillCrDepTunIntSn property.
     * 
     */
    public short getInInfoBillCrDepTunIntSn() {
        return inInfoBillCrDepTunIntSn;
    }

    /**
     * Sets the value of the inInfoBillCrDepTunIntSn property.
     * 
     */
    public void setInInfoBillCrDepTunIntSn(short value) {
        this.inInfoBillCrDepTunIntSn = value;
    }

    /**
     * Gets the value of the inInfoBillCrLnsTmstamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInInfoBillCrLnsTmstamp() {
        return inInfoBillCrLnsTmstamp;
    }

    /**
     * Sets the value of the inInfoBillCrLnsTmstamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInInfoBillCrLnsTmstamp(XMLGregorianCalendar value) {
        this.inInfoBillCrLnsTmstamp = value;
    }

    /**
     * Gets the value of the inInfoBillCrLnsTrxDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInInfoBillCrLnsTrxDate() {
        return inInfoBillCrLnsTrxDate;
    }

    /**
     * Sets the value of the inInfoBillCrLnsTrxDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInInfoBillCrLnsTrxDate(XMLGregorianCalendar value) {
        this.inInfoBillCrLnsTrxDate = value;
    }

    /**
     * Gets the value of the inInfoBillCrLnsTrxIntSn property.
     * 
     */
    public short getInInfoBillCrLnsTrxIntSn() {
        return inInfoBillCrLnsTrxIntSn;
    }

    /**
     * Sets the value of the inInfoBillCrLnsTrxIntSn property.
     * 
     */
    public void setInInfoBillCrLnsTrxIntSn(short value) {
        this.inInfoBillCrLnsTrxIntSn = value;
    }

    /**
     * Gets the value of the inInfoBillCrLnsTrxSn property.
     * 
     */
    public int getInInfoBillCrLnsTrxSn() {
        return inInfoBillCrLnsTrxSn;
    }

    /**
     * Sets the value of the inInfoBillCrLnsTrxSn property.
     * 
     */
    public void setInInfoBillCrLnsTrxSn(int value) {
        this.inInfoBillCrLnsTrxSn = value;
    }

    /**
     * Gets the value of the inInfoBillCrLnsTrxUnit property.
     * 
     */
    public int getInInfoBillCrLnsTrxUnit() {
        return inInfoBillCrLnsTrxUnit;
    }

    /**
     * Sets the value of the inInfoBillCrLnsTrxUnit property.
     * 
     */
    public void setInInfoBillCrLnsTrxUnit(int value) {
        this.inInfoBillCrLnsTrxUnit = value;
    }

    /**
     * Gets the value of the inInfoBillCrLnsTrxUsr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInInfoBillCrLnsTrxUsr() {
        return inInfoBillCrLnsTrxUsr;
    }

    /**
     * Sets the value of the inInfoBillCrLnsTrxUsr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInInfoBillCrLnsTrxUsr(String value) {
        this.inInfoBillCrLnsTrxUsr = value;
    }

    /**
     * Gets the value of the inInfoBillDebDepTrxDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInInfoBillDebDepTrxDate() {
        return inInfoBillDebDepTrxDate;
    }

    /**
     * Sets the value of the inInfoBillDebDepTrxDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInInfoBillDebDepTrxDate(XMLGregorianCalendar value) {
        this.inInfoBillDebDepTrxDate = value;
    }

    /**
     * Gets the value of the inInfoBillDebDepTrxUnit property.
     * 
     */
    public int getInInfoBillDebDepTrxUnit() {
        return inInfoBillDebDepTrxUnit;
    }

    /**
     * Sets the value of the inInfoBillDebDepTrxUnit property.
     * 
     */
    public void setInInfoBillDebDepTrxUnit(int value) {
        this.inInfoBillDebDepTrxUnit = value;
    }

    /**
     * Gets the value of the inInfoBillDebDepTrxUsr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInInfoBillDebDepTrxUsr() {
        return inInfoBillDebDepTrxUsr;
    }

    /**
     * Sets the value of the inInfoBillDebDepTrxUsr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInInfoBillDebDepTrxUsr(String value) {
        this.inInfoBillDebDepTrxUsr = value;
    }

    /**
     * Gets the value of the inInfoBillDebDepTrxUsrSn property.
     * 
     */
    public int getInInfoBillDebDepTrxUsrSn() {
        return inInfoBillDebDepTrxUsrSn;
    }

    /**
     * Sets the value of the inInfoBillDebDepTrxUsrSn property.
     * 
     */
    public void setInInfoBillDebDepTrxUsrSn(int value) {
        this.inInfoBillDebDepTrxUsrSn = value;
    }

    /**
     * Gets the value of the inInfoBillDebDepTunIntSn property.
     * 
     */
    public short getInInfoBillDebDepTunIntSn() {
        return inInfoBillDebDepTunIntSn;
    }

    /**
     * Sets the value of the inInfoBillDebDepTunIntSn property.
     * 
     */
    public void setInInfoBillDebDepTunIntSn(short value) {
        this.inInfoBillDebDepTunIntSn = value;
    }

    /**
     * Gets the value of the inInfoBillDebLnsTmstamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInInfoBillDebLnsTmstamp() {
        return inInfoBillDebLnsTmstamp;
    }

    /**
     * Sets the value of the inInfoBillDebLnsTmstamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInInfoBillDebLnsTmstamp(XMLGregorianCalendar value) {
        this.inInfoBillDebLnsTmstamp = value;
    }

    /**
     * Gets the value of the inInfoBillDebLnsTrxDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInInfoBillDebLnsTrxDate() {
        return inInfoBillDebLnsTrxDate;
    }

    /**
     * Sets the value of the inInfoBillDebLnsTrxDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInInfoBillDebLnsTrxDate(XMLGregorianCalendar value) {
        this.inInfoBillDebLnsTrxDate = value;
    }

    /**
     * Gets the value of the inInfoBillDebLnsTrxIntSn property.
     * 
     */
    public short getInInfoBillDebLnsTrxIntSn() {
        return inInfoBillDebLnsTrxIntSn;
    }

    /**
     * Sets the value of the inInfoBillDebLnsTrxIntSn property.
     * 
     */
    public void setInInfoBillDebLnsTrxIntSn(short value) {
        this.inInfoBillDebLnsTrxIntSn = value;
    }

    /**
     * Gets the value of the inInfoBillDebLnsTrxSn property.
     * 
     */
    public int getInInfoBillDebLnsTrxSn() {
        return inInfoBillDebLnsTrxSn;
    }

    /**
     * Sets the value of the inInfoBillDebLnsTrxSn property.
     * 
     */
    public void setInInfoBillDebLnsTrxSn(int value) {
        this.inInfoBillDebLnsTrxSn = value;
    }

    /**
     * Gets the value of the inInfoBillDebLnsTrxUnit property.
     * 
     */
    public int getInInfoBillDebLnsTrxUnit() {
        return inInfoBillDebLnsTrxUnit;
    }

    /**
     * Sets the value of the inInfoBillDebLnsTrxUnit property.
     * 
     */
    public void setInInfoBillDebLnsTrxUnit(int value) {
        this.inInfoBillDebLnsTrxUnit = value;
    }

    /**
     * Gets the value of the inInfoBillDebLnsTrxUsr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInInfoBillDebLnsTrxUsr() {
        return inInfoBillDebLnsTrxUsr;
    }

    /**
     * Sets the value of the inInfoBillDebLnsTrxUsr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInInfoBillDebLnsTrxUsr(String value) {
        this.inInfoBillDebLnsTrxUsr = value;
    }

    /**
     * Gets the value of the inInfoBillExpDepTrxDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInInfoBillExpDepTrxDate() {
        return inInfoBillExpDepTrxDate;
    }

    /**
     * Sets the value of the inInfoBillExpDepTrxDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInInfoBillExpDepTrxDate(XMLGregorianCalendar value) {
        this.inInfoBillExpDepTrxDate = value;
    }

    /**
     * Gets the value of the inInfoBillExpDepTrxUnit property.
     * 
     */
    public int getInInfoBillExpDepTrxUnit() {
        return inInfoBillExpDepTrxUnit;
    }

    /**
     * Sets the value of the inInfoBillExpDepTrxUnit property.
     * 
     */
    public void setInInfoBillExpDepTrxUnit(int value) {
        this.inInfoBillExpDepTrxUnit = value;
    }

    /**
     * Gets the value of the inInfoBillExpDepTrxUsr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInInfoBillExpDepTrxUsr() {
        return inInfoBillExpDepTrxUsr;
    }

    /**
     * Sets the value of the inInfoBillExpDepTrxUsr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInInfoBillExpDepTrxUsr(String value) {
        this.inInfoBillExpDepTrxUsr = value;
    }

    /**
     * Gets the value of the inInfoBillExpDepTrxUsrSn property.
     * 
     */
    public int getInInfoBillExpDepTrxUsrSn() {
        return inInfoBillExpDepTrxUsrSn;
    }

    /**
     * Sets the value of the inInfoBillExpDepTrxUsrSn property.
     * 
     */
    public void setInInfoBillExpDepTrxUsrSn(int value) {
        this.inInfoBillExpDepTrxUsrSn = value;
    }

    /**
     * Gets the value of the inInfoBillExpDepTunIntSn property.
     * 
     */
    public short getInInfoBillExpDepTunIntSn() {
        return inInfoBillExpDepTunIntSn;
    }

    /**
     * Sets the value of the inInfoBillExpDepTunIntSn property.
     * 
     */
    public void setInInfoBillExpDepTunIntSn(short value) {
        this.inInfoBillExpDepTunIntSn = value;
    }

    /**
     * Gets the value of the inInfoBillExpLnsTmstamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInInfoBillExpLnsTmstamp() {
        return inInfoBillExpLnsTmstamp;
    }

    /**
     * Sets the value of the inInfoBillExpLnsTmstamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInInfoBillExpLnsTmstamp(XMLGregorianCalendar value) {
        this.inInfoBillExpLnsTmstamp = value;
    }

    /**
     * Gets the value of the inInfoBillExpLnsTrxDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInInfoBillExpLnsTrxDate() {
        return inInfoBillExpLnsTrxDate;
    }

    /**
     * Sets the value of the inInfoBillExpLnsTrxDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInInfoBillExpLnsTrxDate(XMLGregorianCalendar value) {
        this.inInfoBillExpLnsTrxDate = value;
    }

    /**
     * Gets the value of the inInfoBillExpLnsTrxIntSn property.
     * 
     */
    public short getInInfoBillExpLnsTrxIntSn() {
        return inInfoBillExpLnsTrxIntSn;
    }

    /**
     * Sets the value of the inInfoBillExpLnsTrxIntSn property.
     * 
     */
    public void setInInfoBillExpLnsTrxIntSn(short value) {
        this.inInfoBillExpLnsTrxIntSn = value;
    }

    /**
     * Gets the value of the inInfoBillExpLnsTrxSn property.
     * 
     */
    public int getInInfoBillExpLnsTrxSn() {
        return inInfoBillExpLnsTrxSn;
    }

    /**
     * Sets the value of the inInfoBillExpLnsTrxSn property.
     * 
     */
    public void setInInfoBillExpLnsTrxSn(int value) {
        this.inInfoBillExpLnsTrxSn = value;
    }

    /**
     * Gets the value of the inInfoBillExpLnsTrxUnit property.
     * 
     */
    public int getInInfoBillExpLnsTrxUnit() {
        return inInfoBillExpLnsTrxUnit;
    }

    /**
     * Sets the value of the inInfoBillExpLnsTrxUnit property.
     * 
     */
    public void setInInfoBillExpLnsTrxUnit(int value) {
        this.inInfoBillExpLnsTrxUnit = value;
    }

    /**
     * Gets the value of the inInfoBillExpLnsTrxUsr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInInfoBillExpLnsTrxUsr() {
        return inInfoBillExpLnsTrxUsr;
    }

    /**
     * Sets the value of the inInfoBillExpLnsTrxUsr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInInfoBillExpLnsTrxUsr(String value) {
        this.inInfoBillExpLnsTrxUsr = value;
    }

    /**
     * Gets the value of the inJustificDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInJustificDescription() {
        return inJustificDescription;
    }

    /**
     * Sets the value of the inJustificDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInJustificDescription(String value) {
        this.inJustificDescription = value;
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
     * Gets the value of the inTrxCurrencyIdCurrency property.
     * 
     */
    public int getInTrxCurrencyIdCurrency() {
        return inTrxCurrencyIdCurrency;
    }

    /**
     * Sets the value of the inTrxCurrencyIdCurrency property.
     * 
     */
    public void setInTrxCurrencyIdCurrency(int value) {
        this.inTrxCurrencyIdCurrency = value;
    }

    /**
     * Gets the value of the inTrxSsSecurityCmcbPrftSystem property.
     * 
     */
    public short getInTrxSsSecurityCmcbPrftSystem() {
        return inTrxSsSecurityCmcbPrftSystem;
    }

    /**
     * Sets the value of the inTrxSsSecurityCmcbPrftSystem property.
     * 
     */
    public void setInTrxSsSecurityCmcbPrftSystem(short value) {
        this.inTrxSsSecurityCmcbPrftSystem = value;
    }

    /**
     * Gets the value of the inTrxTeamInformationSuper1Code property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInTrxTeamInformationSuper1Code() {
        return inTrxTeamInformationSuper1Code;
    }

    /**
     * Sets the value of the inTrxTeamInformationSuper1Code property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInTrxTeamInformationSuper1Code(String value) {
        this.inTrxTeamInformationSuper1Code = value;
    }

    /**
     * Gets the value of the inTrxTeamInformationSuper2Code property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInTrxTeamInformationSuper2Code() {
        return inTrxTeamInformationSuper2Code;
    }

    /**
     * Sets the value of the inTrxTeamInformationSuper2Code property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInTrxTeamInformationSuper2Code(String value) {
        this.inTrxTeamInformationSuper2Code = value;
    }

    /**
     * Gets the value of the inTrxTerminalTerminalNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInTrxTerminalTerminalNumber() {
        return inTrxTerminalTerminalNumber;
    }

    /**
     * Sets the value of the inTrxTerminalTerminalNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInTrxTerminalTerminalNumber(String value) {
        this.inTrxTerminalTerminalNumber = value;
    }

}
