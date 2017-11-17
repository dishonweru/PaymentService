
package com.intrasoft_internatinal.gatewayservice.profitsext;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for CMS3601VNewCardApplicationManagementImport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CMS3601VNewCardApplicationManagementImport">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}BaseImport">
 *       &lt;sequence>
 *         &lt;element name="Command" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InAuthResultTeamInformationAuthorizationResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InAuthResultTeamInformationSuper1Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InAuthResultTeamInformationSuper2Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InAuthorGrantedIefSuppliedFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCartypGenericDetailDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCartypGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InCmsCardApplApplicationSn" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="InCmsCardApplCardAtmbin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCmsCardApplCardCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InCmsCardApplCardNameLatin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCmsCardApplCardSn" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="InCmsCardApplCardSurnameLatin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCmsCardApplComments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCmsCardApplCreationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InCmsCardApplCreationUnit" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InCmsCardApplCreationUser" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCmsCardApplEmail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCmsCardApplEntryStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCmsCardApplExpAccCd" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InCmsCardApplExpAccNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCmsCardApplExpAccPrfsys" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InCmsCardApplExpTmstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InCmsCardApplExpTunDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InCmsCardApplExpTunUnit" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InCmsCardApplExpTunUsr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCmsCardApplExpTunUsrIntSn" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InCmsCardApplExpTunUsrSn" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InCmsCardApplExpiryDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InCmsCardApplFathernameLatin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCmsCardApplFinalizationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InCmsCardApplMobile" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCmsCardApplPinIssuanceFlg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCmsCardApplTmstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InCmsCardApplTunAprvDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InCmsCardApplTunAprvUnit" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InCmsCardApplTunAprvUsr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCmsCardApplTunAprvUsrInSn" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InCmsCardApplTunAprvUsrSn" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InCmsCardApplTunDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InCmsCardApplTunUnit" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InCmsCardApplTunUsr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCmsCardApplTunUsrIntSn" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InCmsCardApplTunUsrSn" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InCmsLimitHdCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCommandIefSuppliedCommand" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCustAddressAddress1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCustAddressAddress2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCustAddressAddressType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCustAddressCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCustAddressCommunicationAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCustAddressEntryComments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCustAddressEntryStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCustAddressFaxNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCustAddressLatinInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCustAddressMailBox" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCustAddressPtsInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCustAddressRegion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCustAddressSegmFlags" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCustAddressSerialNum" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InCustAddressTelephone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCustAddressTmstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InCustAddressZipCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCustomerCDigit" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InCustomerCustId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InDeltypGenericDetailDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InDeltypGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InFirst8DigitsCharSuppliedChar8" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InParametersInTerminalTerminalNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InParametersInTrxCountTrxCounter" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InParametersInUnitClearingHouseFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InPrftTransactionDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InPrftTransactionIdTransact" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InSelectedProfitsAccountAccountCd" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InSelectedProfitsAccountAccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InSelectedProfitsAccountPrftSystem" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InSsSecurityCmcbPrftSystem" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InSsSecurityCmcbTranCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InGrpAccounts" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}ArrayOfCMS3601VInGrpAccountsItem" minOccurs="0"/>
 *         &lt;element name="InGrpPermittedTransactions" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}ArrayOfCMS3601VInGrpPermittedTransactionsItem" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CMS3601VNewCardApplicationManagementImport", propOrder = {
    "command",
    "inAuthResultTeamInformationAuthorizationResult",
    "inAuthResultTeamInformationSuper1Code",
    "inAuthResultTeamInformationSuper2Code",
    "inAuthorGrantedIefSuppliedFlag",
    "inCartypGenericDetailDescription",
    "inCartypGenericDetailSerialNum",
    "inCmsCardApplApplicationSn",
    "inCmsCardApplCardAtmbin",
    "inCmsCardApplCardCount",
    "inCmsCardApplCardNameLatin",
    "inCmsCardApplCardSn",
    "inCmsCardApplCardSurnameLatin",
    "inCmsCardApplComments",
    "inCmsCardApplCreationDate",
    "inCmsCardApplCreationUnit",
    "inCmsCardApplCreationUser",
    "inCmsCardApplEmail",
    "inCmsCardApplEntryStatus",
    "inCmsCardApplExpAccCd",
    "inCmsCardApplExpAccNumber",
    "inCmsCardApplExpAccPrfsys",
    "inCmsCardApplExpTmstamp",
    "inCmsCardApplExpTunDate",
    "inCmsCardApplExpTunUnit",
    "inCmsCardApplExpTunUsr",
    "inCmsCardApplExpTunUsrIntSn",
    "inCmsCardApplExpTunUsrSn",
    "inCmsCardApplExpiryDate",
    "inCmsCardApplFathernameLatin",
    "inCmsCardApplFinalizationDate",
    "inCmsCardApplMobile",
    "inCmsCardApplPinIssuanceFlg",
    "inCmsCardApplTmstamp",
    "inCmsCardApplTunAprvDate",
    "inCmsCardApplTunAprvUnit",
    "inCmsCardApplTunAprvUsr",
    "inCmsCardApplTunAprvUsrInSn",
    "inCmsCardApplTunAprvUsrSn",
    "inCmsCardApplTunDate",
    "inCmsCardApplTunUnit",
    "inCmsCardApplTunUsr",
    "inCmsCardApplTunUsrIntSn",
    "inCmsCardApplTunUsrSn",
    "inCmsLimitHdCode",
    "inCommandIefSuppliedCommand",
    "inCustAddressAddress1",
    "inCustAddressAddress2",
    "inCustAddressAddressType",
    "inCustAddressCity",
    "inCustAddressCommunicationAddress",
    "inCustAddressEntryComments",
    "inCustAddressEntryStatus",
    "inCustAddressFaxNo",
    "inCustAddressLatinInd",
    "inCustAddressMailBox",
    "inCustAddressPtsInd",
    "inCustAddressRegion",
    "inCustAddressSegmFlags",
    "inCustAddressSerialNum",
    "inCustAddressTelephone",
    "inCustAddressTmstamp",
    "inCustAddressZipCode",
    "inCustomerCDigit",
    "inCustomerCustId",
    "inDeltypGenericDetailDescription",
    "inDeltypGenericDetailSerialNum",
    "inFirst8DigitsCharSuppliedChar8",
    "inParametersInTerminalTerminalNumber",
    "inParametersInTrxCountTrxCounter",
    "inParametersInUnitClearingHouseFlag",
    "inPrftTransactionDescription",
    "inPrftTransactionIdTransact",
    "inSelectedProfitsAccountAccountCd",
    "inSelectedProfitsAccountAccountNumber",
    "inSelectedProfitsAccountPrftSystem",
    "inSsSecurityCmcbPrftSystem",
    "inSsSecurityCmcbTranCode",
    "inGrpAccounts",
    "inGrpPermittedTransactions"
})
public class CMS3601VNewCardApplicationManagementImport
    extends BaseImport
{

    @XmlElement(name = "Command")
    protected String command;
    @XmlElement(name = "InAuthResultTeamInformationAuthorizationResult")
    protected String inAuthResultTeamInformationAuthorizationResult;
    @XmlElement(name = "InAuthResultTeamInformationSuper1Code")
    protected String inAuthResultTeamInformationSuper1Code;
    @XmlElement(name = "InAuthResultTeamInformationSuper2Code")
    protected String inAuthResultTeamInformationSuper2Code;
    @XmlElement(name = "InAuthorGrantedIefSuppliedFlag")
    protected String inAuthorGrantedIefSuppliedFlag;
    @XmlElement(name = "InCartypGenericDetailDescription")
    protected String inCartypGenericDetailDescription;
    @XmlElement(name = "InCartypGenericDetailSerialNum")
    protected int inCartypGenericDetailSerialNum;
    @XmlElement(name = "InCmsCardApplApplicationSn")
    protected double inCmsCardApplApplicationSn;
    @XmlElement(name = "InCmsCardApplCardAtmbin")
    protected String inCmsCardApplCardAtmbin;
    @XmlElement(name = "InCmsCardApplCardCount")
    protected int inCmsCardApplCardCount;
    @XmlElement(name = "InCmsCardApplCardNameLatin")
    protected String inCmsCardApplCardNameLatin;
    @XmlElement(name = "InCmsCardApplCardSn")
    protected double inCmsCardApplCardSn;
    @XmlElement(name = "InCmsCardApplCardSurnameLatin")
    protected String inCmsCardApplCardSurnameLatin;
    @XmlElement(name = "InCmsCardApplComments")
    protected String inCmsCardApplComments;
    @XmlElement(name = "InCmsCardApplCreationDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inCmsCardApplCreationDate;
    @XmlElement(name = "InCmsCardApplCreationUnit")
    protected int inCmsCardApplCreationUnit;
    @XmlElement(name = "InCmsCardApplCreationUser")
    protected String inCmsCardApplCreationUser;
    @XmlElement(name = "InCmsCardApplEmail")
    protected String inCmsCardApplEmail;
    @XmlElement(name = "InCmsCardApplEntryStatus")
    protected String inCmsCardApplEntryStatus;
    @XmlElement(name = "InCmsCardApplExpAccCd")
    protected short inCmsCardApplExpAccCd;
    @XmlElement(name = "InCmsCardApplExpAccNumber")
    protected String inCmsCardApplExpAccNumber;
    @XmlElement(name = "InCmsCardApplExpAccPrfsys")
    protected short inCmsCardApplExpAccPrfsys;
    @XmlElement(name = "InCmsCardApplExpTmstamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inCmsCardApplExpTmstamp;
    @XmlElement(name = "InCmsCardApplExpTunDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inCmsCardApplExpTunDate;
    @XmlElement(name = "InCmsCardApplExpTunUnit")
    protected int inCmsCardApplExpTunUnit;
    @XmlElement(name = "InCmsCardApplExpTunUsr")
    protected String inCmsCardApplExpTunUsr;
    @XmlElement(name = "InCmsCardApplExpTunUsrIntSn")
    protected short inCmsCardApplExpTunUsrIntSn;
    @XmlElement(name = "InCmsCardApplExpTunUsrSn")
    protected int inCmsCardApplExpTunUsrSn;
    @XmlElement(name = "InCmsCardApplExpiryDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inCmsCardApplExpiryDate;
    @XmlElement(name = "InCmsCardApplFathernameLatin")
    protected String inCmsCardApplFathernameLatin;
    @XmlElement(name = "InCmsCardApplFinalizationDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inCmsCardApplFinalizationDate;
    @XmlElement(name = "InCmsCardApplMobile")
    protected String inCmsCardApplMobile;
    @XmlElement(name = "InCmsCardApplPinIssuanceFlg")
    protected String inCmsCardApplPinIssuanceFlg;
    @XmlElement(name = "InCmsCardApplTmstamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inCmsCardApplTmstamp;
    @XmlElement(name = "InCmsCardApplTunAprvDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inCmsCardApplTunAprvDate;
    @XmlElement(name = "InCmsCardApplTunAprvUnit")
    protected int inCmsCardApplTunAprvUnit;
    @XmlElement(name = "InCmsCardApplTunAprvUsr")
    protected String inCmsCardApplTunAprvUsr;
    @XmlElement(name = "InCmsCardApplTunAprvUsrInSn")
    protected short inCmsCardApplTunAprvUsrInSn;
    @XmlElement(name = "InCmsCardApplTunAprvUsrSn")
    protected int inCmsCardApplTunAprvUsrSn;
    @XmlElement(name = "InCmsCardApplTunDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inCmsCardApplTunDate;
    @XmlElement(name = "InCmsCardApplTunUnit")
    protected int inCmsCardApplTunUnit;
    @XmlElement(name = "InCmsCardApplTunUsr")
    protected String inCmsCardApplTunUsr;
    @XmlElement(name = "InCmsCardApplTunUsrIntSn")
    protected short inCmsCardApplTunUsrIntSn;
    @XmlElement(name = "InCmsCardApplTunUsrSn")
    protected int inCmsCardApplTunUsrSn;
    @XmlElement(name = "InCmsLimitHdCode")
    protected String inCmsLimitHdCode;
    @XmlElement(name = "InCommandIefSuppliedCommand")
    protected String inCommandIefSuppliedCommand;
    @XmlElement(name = "InCustAddressAddress1")
    protected String inCustAddressAddress1;
    @XmlElement(name = "InCustAddressAddress2")
    protected String inCustAddressAddress2;
    @XmlElement(name = "InCustAddressAddressType")
    protected String inCustAddressAddressType;
    @XmlElement(name = "InCustAddressCity")
    protected String inCustAddressCity;
    @XmlElement(name = "InCustAddressCommunicationAddress")
    protected String inCustAddressCommunicationAddress;
    @XmlElement(name = "InCustAddressEntryComments")
    protected String inCustAddressEntryComments;
    @XmlElement(name = "InCustAddressEntryStatus")
    protected String inCustAddressEntryStatus;
    @XmlElement(name = "InCustAddressFaxNo")
    protected String inCustAddressFaxNo;
    @XmlElement(name = "InCustAddressLatinInd")
    protected String inCustAddressLatinInd;
    @XmlElement(name = "InCustAddressMailBox")
    protected String inCustAddressMailBox;
    @XmlElement(name = "InCustAddressPtsInd")
    protected String inCustAddressPtsInd;
    @XmlElement(name = "InCustAddressRegion")
    protected String inCustAddressRegion;
    @XmlElement(name = "InCustAddressSegmFlags")
    protected String inCustAddressSegmFlags;
    @XmlElement(name = "InCustAddressSerialNum")
    protected short inCustAddressSerialNum;
    @XmlElement(name = "InCustAddressTelephone")
    protected String inCustAddressTelephone;
    @XmlElement(name = "InCustAddressTmstamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inCustAddressTmstamp;
    @XmlElement(name = "InCustAddressZipCode")
    protected String inCustAddressZipCode;
    @XmlElement(name = "InCustomerCDigit")
    protected short inCustomerCDigit;
    @XmlElement(name = "InCustomerCustId")
    protected int inCustomerCustId;
    @XmlElement(name = "InDeltypGenericDetailDescription")
    protected String inDeltypGenericDetailDescription;
    @XmlElement(name = "InDeltypGenericDetailSerialNum")
    protected int inDeltypGenericDetailSerialNum;
    @XmlElement(name = "InFirst8DigitsCharSuppliedChar8")
    protected String inFirst8DigitsCharSuppliedChar8;
    @XmlElement(name = "InParametersInTerminalTerminalNumber")
    protected String inParametersInTerminalTerminalNumber;
    @XmlElement(name = "InParametersInTrxCountTrxCounter")
    protected int inParametersInTrxCountTrxCounter;
    @XmlElement(name = "InParametersInUnitClearingHouseFlag")
    protected String inParametersInUnitClearingHouseFlag;
    @XmlElement(name = "InPrftTransactionDescription")
    protected String inPrftTransactionDescription;
    @XmlElement(name = "InPrftTransactionIdTransact")
    protected int inPrftTransactionIdTransact;
    @XmlElement(name = "InSelectedProfitsAccountAccountCd")
    protected short inSelectedProfitsAccountAccountCd;
    @XmlElement(name = "InSelectedProfitsAccountAccountNumber")
    protected String inSelectedProfitsAccountAccountNumber;
    @XmlElement(name = "InSelectedProfitsAccountPrftSystem")
    protected short inSelectedProfitsAccountPrftSystem;
    @XmlElement(name = "InSsSecurityCmcbPrftSystem")
    protected short inSsSecurityCmcbPrftSystem;
    @XmlElement(name = "InSsSecurityCmcbTranCode")
    protected String inSsSecurityCmcbTranCode;
    @XmlElement(name = "InGrpAccounts")
    protected ArrayOfCMS3601VInGrpAccountsItem inGrpAccounts;
    @XmlElement(name = "InGrpPermittedTransactions")
    protected ArrayOfCMS3601VInGrpPermittedTransactionsItem inGrpPermittedTransactions;

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
     * Gets the value of the inAuthResultTeamInformationAuthorizationResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInAuthResultTeamInformationAuthorizationResult() {
        return inAuthResultTeamInformationAuthorizationResult;
    }

    /**
     * Sets the value of the inAuthResultTeamInformationAuthorizationResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInAuthResultTeamInformationAuthorizationResult(String value) {
        this.inAuthResultTeamInformationAuthorizationResult = value;
    }

    /**
     * Gets the value of the inAuthResultTeamInformationSuper1Code property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInAuthResultTeamInformationSuper1Code() {
        return inAuthResultTeamInformationSuper1Code;
    }

    /**
     * Sets the value of the inAuthResultTeamInformationSuper1Code property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInAuthResultTeamInformationSuper1Code(String value) {
        this.inAuthResultTeamInformationSuper1Code = value;
    }

    /**
     * Gets the value of the inAuthResultTeamInformationSuper2Code property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInAuthResultTeamInformationSuper2Code() {
        return inAuthResultTeamInformationSuper2Code;
    }

    /**
     * Sets the value of the inAuthResultTeamInformationSuper2Code property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInAuthResultTeamInformationSuper2Code(String value) {
        this.inAuthResultTeamInformationSuper2Code = value;
    }

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
     * Gets the value of the inCartypGenericDetailDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCartypGenericDetailDescription() {
        return inCartypGenericDetailDescription;
    }

    /**
     * Sets the value of the inCartypGenericDetailDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCartypGenericDetailDescription(String value) {
        this.inCartypGenericDetailDescription = value;
    }

    /**
     * Gets the value of the inCartypGenericDetailSerialNum property.
     * 
     */
    public int getInCartypGenericDetailSerialNum() {
        return inCartypGenericDetailSerialNum;
    }

    /**
     * Sets the value of the inCartypGenericDetailSerialNum property.
     * 
     */
    public void setInCartypGenericDetailSerialNum(int value) {
        this.inCartypGenericDetailSerialNum = value;
    }

    /**
     * Gets the value of the inCmsCardApplApplicationSn property.
     * 
     */
    public double getInCmsCardApplApplicationSn() {
        return inCmsCardApplApplicationSn;
    }

    /**
     * Sets the value of the inCmsCardApplApplicationSn property.
     * 
     */
    public void setInCmsCardApplApplicationSn(double value) {
        this.inCmsCardApplApplicationSn = value;
    }

    /**
     * Gets the value of the inCmsCardApplCardAtmbin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCmsCardApplCardAtmbin() {
        return inCmsCardApplCardAtmbin;
    }

    /**
     * Sets the value of the inCmsCardApplCardAtmbin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCmsCardApplCardAtmbin(String value) {
        this.inCmsCardApplCardAtmbin = value;
    }

    /**
     * Gets the value of the inCmsCardApplCardCount property.
     * 
     */
    public int getInCmsCardApplCardCount() {
        return inCmsCardApplCardCount;
    }

    /**
     * Sets the value of the inCmsCardApplCardCount property.
     * 
     */
    public void setInCmsCardApplCardCount(int value) {
        this.inCmsCardApplCardCount = value;
    }

    /**
     * Gets the value of the inCmsCardApplCardNameLatin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCmsCardApplCardNameLatin() {
        return inCmsCardApplCardNameLatin;
    }

    /**
     * Sets the value of the inCmsCardApplCardNameLatin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCmsCardApplCardNameLatin(String value) {
        this.inCmsCardApplCardNameLatin = value;
    }

    /**
     * Gets the value of the inCmsCardApplCardSn property.
     * 
     */
    public double getInCmsCardApplCardSn() {
        return inCmsCardApplCardSn;
    }

    /**
     * Sets the value of the inCmsCardApplCardSn property.
     * 
     */
    public void setInCmsCardApplCardSn(double value) {
        this.inCmsCardApplCardSn = value;
    }

    /**
     * Gets the value of the inCmsCardApplCardSurnameLatin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCmsCardApplCardSurnameLatin() {
        return inCmsCardApplCardSurnameLatin;
    }

    /**
     * Sets the value of the inCmsCardApplCardSurnameLatin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCmsCardApplCardSurnameLatin(String value) {
        this.inCmsCardApplCardSurnameLatin = value;
    }

    /**
     * Gets the value of the inCmsCardApplComments property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCmsCardApplComments() {
        return inCmsCardApplComments;
    }

    /**
     * Sets the value of the inCmsCardApplComments property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCmsCardApplComments(String value) {
        this.inCmsCardApplComments = value;
    }

    /**
     * Gets the value of the inCmsCardApplCreationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInCmsCardApplCreationDate() {
        return inCmsCardApplCreationDate;
    }

    /**
     * Sets the value of the inCmsCardApplCreationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInCmsCardApplCreationDate(XMLGregorianCalendar value) {
        this.inCmsCardApplCreationDate = value;
    }

    /**
     * Gets the value of the inCmsCardApplCreationUnit property.
     * 
     */
    public int getInCmsCardApplCreationUnit() {
        return inCmsCardApplCreationUnit;
    }

    /**
     * Sets the value of the inCmsCardApplCreationUnit property.
     * 
     */
    public void setInCmsCardApplCreationUnit(int value) {
        this.inCmsCardApplCreationUnit = value;
    }

    /**
     * Gets the value of the inCmsCardApplCreationUser property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCmsCardApplCreationUser() {
        return inCmsCardApplCreationUser;
    }

    /**
     * Sets the value of the inCmsCardApplCreationUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCmsCardApplCreationUser(String value) {
        this.inCmsCardApplCreationUser = value;
    }

    /**
     * Gets the value of the inCmsCardApplEmail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCmsCardApplEmail() {
        return inCmsCardApplEmail;
    }

    /**
     * Sets the value of the inCmsCardApplEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCmsCardApplEmail(String value) {
        this.inCmsCardApplEmail = value;
    }

    /**
     * Gets the value of the inCmsCardApplEntryStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCmsCardApplEntryStatus() {
        return inCmsCardApplEntryStatus;
    }

    /**
     * Sets the value of the inCmsCardApplEntryStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCmsCardApplEntryStatus(String value) {
        this.inCmsCardApplEntryStatus = value;
    }

    /**
     * Gets the value of the inCmsCardApplExpAccCd property.
     * 
     */
    public short getInCmsCardApplExpAccCd() {
        return inCmsCardApplExpAccCd;
    }

    /**
     * Sets the value of the inCmsCardApplExpAccCd property.
     * 
     */
    public void setInCmsCardApplExpAccCd(short value) {
        this.inCmsCardApplExpAccCd = value;
    }

    /**
     * Gets the value of the inCmsCardApplExpAccNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCmsCardApplExpAccNumber() {
        return inCmsCardApplExpAccNumber;
    }

    /**
     * Sets the value of the inCmsCardApplExpAccNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCmsCardApplExpAccNumber(String value) {
        this.inCmsCardApplExpAccNumber = value;
    }

    /**
     * Gets the value of the inCmsCardApplExpAccPrfsys property.
     * 
     */
    public short getInCmsCardApplExpAccPrfsys() {
        return inCmsCardApplExpAccPrfsys;
    }

    /**
     * Sets the value of the inCmsCardApplExpAccPrfsys property.
     * 
     */
    public void setInCmsCardApplExpAccPrfsys(short value) {
        this.inCmsCardApplExpAccPrfsys = value;
    }

    /**
     * Gets the value of the inCmsCardApplExpTmstamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInCmsCardApplExpTmstamp() {
        return inCmsCardApplExpTmstamp;
    }

    /**
     * Sets the value of the inCmsCardApplExpTmstamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInCmsCardApplExpTmstamp(XMLGregorianCalendar value) {
        this.inCmsCardApplExpTmstamp = value;
    }

    /**
     * Gets the value of the inCmsCardApplExpTunDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInCmsCardApplExpTunDate() {
        return inCmsCardApplExpTunDate;
    }

    /**
     * Sets the value of the inCmsCardApplExpTunDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInCmsCardApplExpTunDate(XMLGregorianCalendar value) {
        this.inCmsCardApplExpTunDate = value;
    }

    /**
     * Gets the value of the inCmsCardApplExpTunUnit property.
     * 
     */
    public int getInCmsCardApplExpTunUnit() {
        return inCmsCardApplExpTunUnit;
    }

    /**
     * Sets the value of the inCmsCardApplExpTunUnit property.
     * 
     */
    public void setInCmsCardApplExpTunUnit(int value) {
        this.inCmsCardApplExpTunUnit = value;
    }

    /**
     * Gets the value of the inCmsCardApplExpTunUsr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCmsCardApplExpTunUsr() {
        return inCmsCardApplExpTunUsr;
    }

    /**
     * Sets the value of the inCmsCardApplExpTunUsr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCmsCardApplExpTunUsr(String value) {
        this.inCmsCardApplExpTunUsr = value;
    }

    /**
     * Gets the value of the inCmsCardApplExpTunUsrIntSn property.
     * 
     */
    public short getInCmsCardApplExpTunUsrIntSn() {
        return inCmsCardApplExpTunUsrIntSn;
    }

    /**
     * Sets the value of the inCmsCardApplExpTunUsrIntSn property.
     * 
     */
    public void setInCmsCardApplExpTunUsrIntSn(short value) {
        this.inCmsCardApplExpTunUsrIntSn = value;
    }

    /**
     * Gets the value of the inCmsCardApplExpTunUsrSn property.
     * 
     */
    public int getInCmsCardApplExpTunUsrSn() {
        return inCmsCardApplExpTunUsrSn;
    }

    /**
     * Sets the value of the inCmsCardApplExpTunUsrSn property.
     * 
     */
    public void setInCmsCardApplExpTunUsrSn(int value) {
        this.inCmsCardApplExpTunUsrSn = value;
    }

    /**
     * Gets the value of the inCmsCardApplExpiryDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInCmsCardApplExpiryDate() {
        return inCmsCardApplExpiryDate;
    }

    /**
     * Sets the value of the inCmsCardApplExpiryDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInCmsCardApplExpiryDate(XMLGregorianCalendar value) {
        this.inCmsCardApplExpiryDate = value;
    }

    /**
     * Gets the value of the inCmsCardApplFathernameLatin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCmsCardApplFathernameLatin() {
        return inCmsCardApplFathernameLatin;
    }

    /**
     * Sets the value of the inCmsCardApplFathernameLatin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCmsCardApplFathernameLatin(String value) {
        this.inCmsCardApplFathernameLatin = value;
    }

    /**
     * Gets the value of the inCmsCardApplFinalizationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInCmsCardApplFinalizationDate() {
        return inCmsCardApplFinalizationDate;
    }

    /**
     * Sets the value of the inCmsCardApplFinalizationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInCmsCardApplFinalizationDate(XMLGregorianCalendar value) {
        this.inCmsCardApplFinalizationDate = value;
    }

    /**
     * Gets the value of the inCmsCardApplMobile property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCmsCardApplMobile() {
        return inCmsCardApplMobile;
    }

    /**
     * Sets the value of the inCmsCardApplMobile property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCmsCardApplMobile(String value) {
        this.inCmsCardApplMobile = value;
    }

    /**
     * Gets the value of the inCmsCardApplPinIssuanceFlg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCmsCardApplPinIssuanceFlg() {
        return inCmsCardApplPinIssuanceFlg;
    }

    /**
     * Sets the value of the inCmsCardApplPinIssuanceFlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCmsCardApplPinIssuanceFlg(String value) {
        this.inCmsCardApplPinIssuanceFlg = value;
    }

    /**
     * Gets the value of the inCmsCardApplTmstamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInCmsCardApplTmstamp() {
        return inCmsCardApplTmstamp;
    }

    /**
     * Sets the value of the inCmsCardApplTmstamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInCmsCardApplTmstamp(XMLGregorianCalendar value) {
        this.inCmsCardApplTmstamp = value;
    }

    /**
     * Gets the value of the inCmsCardApplTunAprvDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInCmsCardApplTunAprvDate() {
        return inCmsCardApplTunAprvDate;
    }

    /**
     * Sets the value of the inCmsCardApplTunAprvDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInCmsCardApplTunAprvDate(XMLGregorianCalendar value) {
        this.inCmsCardApplTunAprvDate = value;
    }

    /**
     * Gets the value of the inCmsCardApplTunAprvUnit property.
     * 
     */
    public int getInCmsCardApplTunAprvUnit() {
        return inCmsCardApplTunAprvUnit;
    }

    /**
     * Sets the value of the inCmsCardApplTunAprvUnit property.
     * 
     */
    public void setInCmsCardApplTunAprvUnit(int value) {
        this.inCmsCardApplTunAprvUnit = value;
    }

    /**
     * Gets the value of the inCmsCardApplTunAprvUsr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCmsCardApplTunAprvUsr() {
        return inCmsCardApplTunAprvUsr;
    }

    /**
     * Sets the value of the inCmsCardApplTunAprvUsr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCmsCardApplTunAprvUsr(String value) {
        this.inCmsCardApplTunAprvUsr = value;
    }

    /**
     * Gets the value of the inCmsCardApplTunAprvUsrInSn property.
     * 
     */
    public short getInCmsCardApplTunAprvUsrInSn() {
        return inCmsCardApplTunAprvUsrInSn;
    }

    /**
     * Sets the value of the inCmsCardApplTunAprvUsrInSn property.
     * 
     */
    public void setInCmsCardApplTunAprvUsrInSn(short value) {
        this.inCmsCardApplTunAprvUsrInSn = value;
    }

    /**
     * Gets the value of the inCmsCardApplTunAprvUsrSn property.
     * 
     */
    public int getInCmsCardApplTunAprvUsrSn() {
        return inCmsCardApplTunAprvUsrSn;
    }

    /**
     * Sets the value of the inCmsCardApplTunAprvUsrSn property.
     * 
     */
    public void setInCmsCardApplTunAprvUsrSn(int value) {
        this.inCmsCardApplTunAprvUsrSn = value;
    }

    /**
     * Gets the value of the inCmsCardApplTunDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInCmsCardApplTunDate() {
        return inCmsCardApplTunDate;
    }

    /**
     * Sets the value of the inCmsCardApplTunDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInCmsCardApplTunDate(XMLGregorianCalendar value) {
        this.inCmsCardApplTunDate = value;
    }

    /**
     * Gets the value of the inCmsCardApplTunUnit property.
     * 
     */
    public int getInCmsCardApplTunUnit() {
        return inCmsCardApplTunUnit;
    }

    /**
     * Sets the value of the inCmsCardApplTunUnit property.
     * 
     */
    public void setInCmsCardApplTunUnit(int value) {
        this.inCmsCardApplTunUnit = value;
    }

    /**
     * Gets the value of the inCmsCardApplTunUsr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCmsCardApplTunUsr() {
        return inCmsCardApplTunUsr;
    }

    /**
     * Sets the value of the inCmsCardApplTunUsr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCmsCardApplTunUsr(String value) {
        this.inCmsCardApplTunUsr = value;
    }

    /**
     * Gets the value of the inCmsCardApplTunUsrIntSn property.
     * 
     */
    public short getInCmsCardApplTunUsrIntSn() {
        return inCmsCardApplTunUsrIntSn;
    }

    /**
     * Sets the value of the inCmsCardApplTunUsrIntSn property.
     * 
     */
    public void setInCmsCardApplTunUsrIntSn(short value) {
        this.inCmsCardApplTunUsrIntSn = value;
    }

    /**
     * Gets the value of the inCmsCardApplTunUsrSn property.
     * 
     */
    public int getInCmsCardApplTunUsrSn() {
        return inCmsCardApplTunUsrSn;
    }

    /**
     * Sets the value of the inCmsCardApplTunUsrSn property.
     * 
     */
    public void setInCmsCardApplTunUsrSn(int value) {
        this.inCmsCardApplTunUsrSn = value;
    }

    /**
     * Gets the value of the inCmsLimitHdCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCmsLimitHdCode() {
        return inCmsLimitHdCode;
    }

    /**
     * Sets the value of the inCmsLimitHdCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCmsLimitHdCode(String value) {
        this.inCmsLimitHdCode = value;
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
     * Gets the value of the inCustAddressAddress1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCustAddressAddress1() {
        return inCustAddressAddress1;
    }

    /**
     * Sets the value of the inCustAddressAddress1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCustAddressAddress1(String value) {
        this.inCustAddressAddress1 = value;
    }

    /**
     * Gets the value of the inCustAddressAddress2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCustAddressAddress2() {
        return inCustAddressAddress2;
    }

    /**
     * Sets the value of the inCustAddressAddress2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCustAddressAddress2(String value) {
        this.inCustAddressAddress2 = value;
    }

    /**
     * Gets the value of the inCustAddressAddressType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCustAddressAddressType() {
        return inCustAddressAddressType;
    }

    /**
     * Sets the value of the inCustAddressAddressType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCustAddressAddressType(String value) {
        this.inCustAddressAddressType = value;
    }

    /**
     * Gets the value of the inCustAddressCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCustAddressCity() {
        return inCustAddressCity;
    }

    /**
     * Sets the value of the inCustAddressCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCustAddressCity(String value) {
        this.inCustAddressCity = value;
    }

    /**
     * Gets the value of the inCustAddressCommunicationAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCustAddressCommunicationAddress() {
        return inCustAddressCommunicationAddress;
    }

    /**
     * Sets the value of the inCustAddressCommunicationAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCustAddressCommunicationAddress(String value) {
        this.inCustAddressCommunicationAddress = value;
    }

    /**
     * Gets the value of the inCustAddressEntryComments property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCustAddressEntryComments() {
        return inCustAddressEntryComments;
    }

    /**
     * Sets the value of the inCustAddressEntryComments property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCustAddressEntryComments(String value) {
        this.inCustAddressEntryComments = value;
    }

    /**
     * Gets the value of the inCustAddressEntryStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCustAddressEntryStatus() {
        return inCustAddressEntryStatus;
    }

    /**
     * Sets the value of the inCustAddressEntryStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCustAddressEntryStatus(String value) {
        this.inCustAddressEntryStatus = value;
    }

    /**
     * Gets the value of the inCustAddressFaxNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCustAddressFaxNo() {
        return inCustAddressFaxNo;
    }

    /**
     * Sets the value of the inCustAddressFaxNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCustAddressFaxNo(String value) {
        this.inCustAddressFaxNo = value;
    }

    /**
     * Gets the value of the inCustAddressLatinInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCustAddressLatinInd() {
        return inCustAddressLatinInd;
    }

    /**
     * Sets the value of the inCustAddressLatinInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCustAddressLatinInd(String value) {
        this.inCustAddressLatinInd = value;
    }

    /**
     * Gets the value of the inCustAddressMailBox property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCustAddressMailBox() {
        return inCustAddressMailBox;
    }

    /**
     * Sets the value of the inCustAddressMailBox property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCustAddressMailBox(String value) {
        this.inCustAddressMailBox = value;
    }

    /**
     * Gets the value of the inCustAddressPtsInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCustAddressPtsInd() {
        return inCustAddressPtsInd;
    }

    /**
     * Sets the value of the inCustAddressPtsInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCustAddressPtsInd(String value) {
        this.inCustAddressPtsInd = value;
    }

    /**
     * Gets the value of the inCustAddressRegion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCustAddressRegion() {
        return inCustAddressRegion;
    }

    /**
     * Sets the value of the inCustAddressRegion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCustAddressRegion(String value) {
        this.inCustAddressRegion = value;
    }

    /**
     * Gets the value of the inCustAddressSegmFlags property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCustAddressSegmFlags() {
        return inCustAddressSegmFlags;
    }

    /**
     * Sets the value of the inCustAddressSegmFlags property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCustAddressSegmFlags(String value) {
        this.inCustAddressSegmFlags = value;
    }

    /**
     * Gets the value of the inCustAddressSerialNum property.
     * 
     */
    public short getInCustAddressSerialNum() {
        return inCustAddressSerialNum;
    }

    /**
     * Sets the value of the inCustAddressSerialNum property.
     * 
     */
    public void setInCustAddressSerialNum(short value) {
        this.inCustAddressSerialNum = value;
    }

    /**
     * Gets the value of the inCustAddressTelephone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCustAddressTelephone() {
        return inCustAddressTelephone;
    }

    /**
     * Sets the value of the inCustAddressTelephone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCustAddressTelephone(String value) {
        this.inCustAddressTelephone = value;
    }

    /**
     * Gets the value of the inCustAddressTmstamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInCustAddressTmstamp() {
        return inCustAddressTmstamp;
    }

    /**
     * Sets the value of the inCustAddressTmstamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInCustAddressTmstamp(XMLGregorianCalendar value) {
        this.inCustAddressTmstamp = value;
    }

    /**
     * Gets the value of the inCustAddressZipCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCustAddressZipCode() {
        return inCustAddressZipCode;
    }

    /**
     * Sets the value of the inCustAddressZipCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCustAddressZipCode(String value) {
        this.inCustAddressZipCode = value;
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
     * Gets the value of the inDeltypGenericDetailDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInDeltypGenericDetailDescription() {
        return inDeltypGenericDetailDescription;
    }

    /**
     * Sets the value of the inDeltypGenericDetailDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInDeltypGenericDetailDescription(String value) {
        this.inDeltypGenericDetailDescription = value;
    }

    /**
     * Gets the value of the inDeltypGenericDetailSerialNum property.
     * 
     */
    public int getInDeltypGenericDetailSerialNum() {
        return inDeltypGenericDetailSerialNum;
    }

    /**
     * Sets the value of the inDeltypGenericDetailSerialNum property.
     * 
     */
    public void setInDeltypGenericDetailSerialNum(int value) {
        this.inDeltypGenericDetailSerialNum = value;
    }

    /**
     * Gets the value of the inFirst8DigitsCharSuppliedChar8 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInFirst8DigitsCharSuppliedChar8() {
        return inFirst8DigitsCharSuppliedChar8;
    }

    /**
     * Sets the value of the inFirst8DigitsCharSuppliedChar8 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInFirst8DigitsCharSuppliedChar8(String value) {
        this.inFirst8DigitsCharSuppliedChar8 = value;
    }

    /**
     * Gets the value of the inParametersInTerminalTerminalNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInParametersInTerminalTerminalNumber() {
        return inParametersInTerminalTerminalNumber;
    }

    /**
     * Sets the value of the inParametersInTerminalTerminalNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInParametersInTerminalTerminalNumber(String value) {
        this.inParametersInTerminalTerminalNumber = value;
    }

    /**
     * Gets the value of the inParametersInTrxCountTrxCounter property.
     * 
     */
    public int getInParametersInTrxCountTrxCounter() {
        return inParametersInTrxCountTrxCounter;
    }

    /**
     * Sets the value of the inParametersInTrxCountTrxCounter property.
     * 
     */
    public void setInParametersInTrxCountTrxCounter(int value) {
        this.inParametersInTrxCountTrxCounter = value;
    }

    /**
     * Gets the value of the inParametersInUnitClearingHouseFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInParametersInUnitClearingHouseFlag() {
        return inParametersInUnitClearingHouseFlag;
    }

    /**
     * Sets the value of the inParametersInUnitClearingHouseFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInParametersInUnitClearingHouseFlag(String value) {
        this.inParametersInUnitClearingHouseFlag = value;
    }

    /**
     * Gets the value of the inPrftTransactionDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInPrftTransactionDescription() {
        return inPrftTransactionDescription;
    }

    /**
     * Sets the value of the inPrftTransactionDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInPrftTransactionDescription(String value) {
        this.inPrftTransactionDescription = value;
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
     * Gets the value of the inSelectedProfitsAccountAccountCd property.
     * 
     */
    public short getInSelectedProfitsAccountAccountCd() {
        return inSelectedProfitsAccountAccountCd;
    }

    /**
     * Sets the value of the inSelectedProfitsAccountAccountCd property.
     * 
     */
    public void setInSelectedProfitsAccountAccountCd(short value) {
        this.inSelectedProfitsAccountAccountCd = value;
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
     * Gets the value of the inSsSecurityCmcbPrftSystem property.
     * 
     */
    public short getInSsSecurityCmcbPrftSystem() {
        return inSsSecurityCmcbPrftSystem;
    }

    /**
     * Sets the value of the inSsSecurityCmcbPrftSystem property.
     * 
     */
    public void setInSsSecurityCmcbPrftSystem(short value) {
        this.inSsSecurityCmcbPrftSystem = value;
    }

    /**
     * Gets the value of the inSsSecurityCmcbTranCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInSsSecurityCmcbTranCode() {
        return inSsSecurityCmcbTranCode;
    }

    /**
     * Sets the value of the inSsSecurityCmcbTranCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInSsSecurityCmcbTranCode(String value) {
        this.inSsSecurityCmcbTranCode = value;
    }

    /**
     * Gets the value of the inGrpAccounts property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCMS3601VInGrpAccountsItem }
     *     
     */
    public ArrayOfCMS3601VInGrpAccountsItem getInGrpAccounts() {
        return inGrpAccounts;
    }

    /**
     * Sets the value of the inGrpAccounts property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCMS3601VInGrpAccountsItem }
     *     
     */
    public void setInGrpAccounts(ArrayOfCMS3601VInGrpAccountsItem value) {
        this.inGrpAccounts = value;
    }

    /**
     * Gets the value of the inGrpPermittedTransactions property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCMS3601VInGrpPermittedTransactionsItem }
     *     
     */
    public ArrayOfCMS3601VInGrpPermittedTransactionsItem getInGrpPermittedTransactions() {
        return inGrpPermittedTransactions;
    }

    /**
     * Sets the value of the inGrpPermittedTransactions property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCMS3601VInGrpPermittedTransactionsItem }
     *     
     */
    public void setInGrpPermittedTransactions(ArrayOfCMS3601VInGrpPermittedTransactionsItem value) {
        this.inGrpPermittedTransactions = value;
    }

}
