
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for CMS3604VCustomerCardsListExport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CMS3604VCustomerCardsListExport">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}BaseExport">
 *       &lt;sequence>
 *         &lt;element name="OutMntRecordingAuthorizer1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutMntRecordingAuthorizer2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutMntRecordingChannelId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutMntRecordingGrpSubscript" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutMntRecordingIdJustific" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutMntRecordingIdProduct" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutMntRecordingPrftSystem" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutMntRecordingReversalFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutMntRecordingTerminalNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutMntRecordingTmstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutMntRecordingTrxCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutMntRecordingTrxDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutMntRecordingTrxDetails" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutMntRecordingTrxUnit" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutMntRecordingTrxUser" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutMntRecordingTrxUsrSn" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutTeamInformationAccountCode" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OutTeamInformationAuthorizationResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutTeamInformationChargeDiscount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutTeamInformationCommissionDiscount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutTeamInformationCustomerCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutTeamInformationCustomerSurname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutTeamInformationEvaluationResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutTeamInformationJustificationDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutTeamInformationJustificationId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutTeamInformationProductDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutTeamInformationProductId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutTeamInformationRequiredProfile1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutTeamInformationRequiredProfile2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutTeamInformationTransactionDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutTeamInformationTransactionId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutTeamInformationTrsAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutTeamInformationUnitCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutTeamInformationUserCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutTeamInformationUserProfile1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutTeamInformationUserProfile2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutTeamInformationUserProfile3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrp" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}ArrayOfCMS3604VOutGrpItem" minOccurs="0"/>
 *         &lt;element name="OutCmsCardApplApplicationSn" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OutCmsCardApplEntryStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCmsCardApplEmail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCmsCardApplMobile" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCmsCardApplExpiryDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutCmsCardApplCreationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutCmsCardApplCreationUnit" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutCmsCardApplCreationUser" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCmsCardApplFinalizationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutCmsCardApplTunDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutCmsCardApplTunUnit" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutCmsCardApplTunUsr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCmsCardApplTunUsrSn" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutCmsCardApplTunUsrIntSn" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutCmsCardApplTunAprvDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutCmsCardApplTunAprvUnit" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutCmsCardApplTunAprvUsr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCmsCardApplTunAprvUsrSn" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutCmsCardApplTunAprvUsrInSn" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutCmsCardApplCardSurnameLatin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCmsCardApplCardNameLatin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCmsCardApplFathernameLatin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCmsCardApplCardSn" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OutCmsCardApplCardAtmbin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCmsCardApplCardCount" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OutCmsCardApplPinIssuanceFlg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCmsCardApplTmstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutCmsCardApplExpAccNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCmsCardApplExpAccCd" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutCmsCardApplExpAccPrfsys" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutCmsCardApplExpTunDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutCmsCardApplExpTunUnit" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutCmsCardApplExpTunUsr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCmsCardApplExpTunUsrSn" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutCmsCardApplExpTunUsrIntSn" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutCmsCardApplExpTmstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutCmsCardApplComments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCmsCardApplCardReissueFlg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CMS3604VCustomerCardsListExport", propOrder = {
    "outMntRecordingAuthorizer1",
    "outMntRecordingAuthorizer2",
    "outMntRecordingChannelId",
    "outMntRecordingGrpSubscript",
    "outMntRecordingIdJustific",
    "outMntRecordingIdProduct",
    "outMntRecordingPrftSystem",
    "outMntRecordingReversalFlag",
    "outMntRecordingTerminalNumber",
    "outMntRecordingTmstamp",
    "outMntRecordingTrxCode",
    "outMntRecordingTrxDate",
    "outMntRecordingTrxDetails",
    "outMntRecordingTrxUnit",
    "outMntRecordingTrxUser",
    "outMntRecordingTrxUsrSn",
    "outTeamInformationAccountCode",
    "outTeamInformationAuthorizationResult",
    "outTeamInformationChargeDiscount",
    "outTeamInformationCommissionDiscount",
    "outTeamInformationCustomerCode",
    "outTeamInformationCustomerSurname",
    "outTeamInformationEvaluationResult",
    "outTeamInformationJustificationDescription",
    "outTeamInformationJustificationId",
    "outTeamInformationProductDescription",
    "outTeamInformationProductId",
    "outTeamInformationRequiredProfile1",
    "outTeamInformationRequiredProfile2",
    "outTeamInformationTransactionDescription",
    "outTeamInformationTransactionId",
    "outTeamInformationTrsAmount",
    "outTeamInformationUnitCode",
    "outTeamInformationUserCode",
    "outTeamInformationUserProfile1",
    "outTeamInformationUserProfile2",
    "outTeamInformationUserProfile3",
    "outGrp",
    "outCmsCardApplApplicationSn",
    "outCmsCardApplEntryStatus",
    "outCmsCardApplEmail",
    "outCmsCardApplMobile",
    "outCmsCardApplExpiryDate",
    "outCmsCardApplCreationDate",
    "outCmsCardApplCreationUnit",
    "outCmsCardApplCreationUser",
    "outCmsCardApplFinalizationDate",
    "outCmsCardApplTunDate",
    "outCmsCardApplTunUnit",
    "outCmsCardApplTunUsr",
    "outCmsCardApplTunUsrSn",
    "outCmsCardApplTunUsrIntSn",
    "outCmsCardApplTunAprvDate",
    "outCmsCardApplTunAprvUnit",
    "outCmsCardApplTunAprvUsr",
    "outCmsCardApplTunAprvUsrSn",
    "outCmsCardApplTunAprvUsrInSn",
    "outCmsCardApplCardSurnameLatin",
    "outCmsCardApplCardNameLatin",
    "outCmsCardApplFathernameLatin",
    "outCmsCardApplCardSn",
    "outCmsCardApplCardAtmbin",
    "outCmsCardApplCardCount",
    "outCmsCardApplPinIssuanceFlg",
    "outCmsCardApplTmstamp",
    "outCmsCardApplExpAccNumber",
    "outCmsCardApplExpAccCd",
    "outCmsCardApplExpAccPrfsys",
    "outCmsCardApplExpTunDate",
    "outCmsCardApplExpTunUnit",
    "outCmsCardApplExpTunUsr",
    "outCmsCardApplExpTunUsrSn",
    "outCmsCardApplExpTunUsrIntSn",
    "outCmsCardApplExpTmstamp",
    "outCmsCardApplComments",
    "outCmsCardApplCardReissueFlg"
})
public class CMS3604VCustomerCardsListExport
    extends BaseExport
{

    @XmlElement(name = "OutMntRecordingAuthorizer1")
    protected String outMntRecordingAuthorizer1;
    @XmlElement(name = "OutMntRecordingAuthorizer2")
    protected String outMntRecordingAuthorizer2;
    @XmlElement(name = "OutMntRecordingChannelId")
    protected int outMntRecordingChannelId;
    @XmlElement(name = "OutMntRecordingGrpSubscript")
    protected short outMntRecordingGrpSubscript;
    @XmlElement(name = "OutMntRecordingIdJustific")
    protected int outMntRecordingIdJustific;
    @XmlElement(name = "OutMntRecordingIdProduct")
    protected int outMntRecordingIdProduct;
    @XmlElement(name = "OutMntRecordingPrftSystem")
    protected short outMntRecordingPrftSystem;
    @XmlElement(name = "OutMntRecordingReversalFlag")
    protected String outMntRecordingReversalFlag;
    @XmlElement(name = "OutMntRecordingTerminalNumber")
    protected String outMntRecordingTerminalNumber;
    @XmlElement(name = "OutMntRecordingTmstamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outMntRecordingTmstamp;
    @XmlElement(name = "OutMntRecordingTrxCode")
    protected int outMntRecordingTrxCode;
    @XmlElement(name = "OutMntRecordingTrxDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outMntRecordingTrxDate;
    @XmlElement(name = "OutMntRecordingTrxDetails")
    protected String outMntRecordingTrxDetails;
    @XmlElement(name = "OutMntRecordingTrxUnit")
    protected int outMntRecordingTrxUnit;
    @XmlElement(name = "OutMntRecordingTrxUser")
    protected String outMntRecordingTrxUser;
    @XmlElement(name = "OutMntRecordingTrxUsrSn")
    protected int outMntRecordingTrxUsrSn;
    @XmlElement(name = "OutTeamInformationAccountCode")
    protected double outTeamInformationAccountCode;
    @XmlElement(name = "OutTeamInformationAuthorizationResult")
    protected String outTeamInformationAuthorizationResult;
    @XmlElement(name = "OutTeamInformationChargeDiscount", required = true)
    protected BigDecimal outTeamInformationChargeDiscount;
    @XmlElement(name = "OutTeamInformationCommissionDiscount", required = true)
    protected BigDecimal outTeamInformationCommissionDiscount;
    @XmlElement(name = "OutTeamInformationCustomerCode")
    protected int outTeamInformationCustomerCode;
    @XmlElement(name = "OutTeamInformationCustomerSurname")
    protected String outTeamInformationCustomerSurname;
    @XmlElement(name = "OutTeamInformationEvaluationResult")
    protected String outTeamInformationEvaluationResult;
    @XmlElement(name = "OutTeamInformationJustificationDescription")
    protected String outTeamInformationJustificationDescription;
    @XmlElement(name = "OutTeamInformationJustificationId")
    protected int outTeamInformationJustificationId;
    @XmlElement(name = "OutTeamInformationProductDescription")
    protected String outTeamInformationProductDescription;
    @XmlElement(name = "OutTeamInformationProductId")
    protected int outTeamInformationProductId;
    @XmlElement(name = "OutTeamInformationRequiredProfile1")
    protected String outTeamInformationRequiredProfile1;
    @XmlElement(name = "OutTeamInformationRequiredProfile2")
    protected String outTeamInformationRequiredProfile2;
    @XmlElement(name = "OutTeamInformationTransactionDescription")
    protected String outTeamInformationTransactionDescription;
    @XmlElement(name = "OutTeamInformationTransactionId")
    protected int outTeamInformationTransactionId;
    @XmlElement(name = "OutTeamInformationTrsAmount", required = true)
    protected BigDecimal outTeamInformationTrsAmount;
    @XmlElement(name = "OutTeamInformationUnitCode")
    protected int outTeamInformationUnitCode;
    @XmlElement(name = "OutTeamInformationUserCode")
    protected String outTeamInformationUserCode;
    @XmlElement(name = "OutTeamInformationUserProfile1")
    protected String outTeamInformationUserProfile1;
    @XmlElement(name = "OutTeamInformationUserProfile2")
    protected String outTeamInformationUserProfile2;
    @XmlElement(name = "OutTeamInformationUserProfile3")
    protected String outTeamInformationUserProfile3;
    @XmlElement(name = "OutGrp")
    protected ArrayOfCMS3604VOutGrpItem outGrp;
    @XmlElement(name = "OutCmsCardApplApplicationSn")
    protected double outCmsCardApplApplicationSn;
    @XmlElement(name = "OutCmsCardApplEntryStatus")
    protected String outCmsCardApplEntryStatus;
    @XmlElement(name = "OutCmsCardApplEmail")
    protected String outCmsCardApplEmail;
    @XmlElement(name = "OutCmsCardApplMobile")
    protected String outCmsCardApplMobile;
    @XmlElement(name = "OutCmsCardApplExpiryDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outCmsCardApplExpiryDate;
    @XmlElement(name = "OutCmsCardApplCreationDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outCmsCardApplCreationDate;
    @XmlElement(name = "OutCmsCardApplCreationUnit")
    protected int outCmsCardApplCreationUnit;
    @XmlElement(name = "OutCmsCardApplCreationUser")
    protected String outCmsCardApplCreationUser;
    @XmlElement(name = "OutCmsCardApplFinalizationDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outCmsCardApplFinalizationDate;
    @XmlElement(name = "OutCmsCardApplTunDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outCmsCardApplTunDate;
    @XmlElement(name = "OutCmsCardApplTunUnit")
    protected int outCmsCardApplTunUnit;
    @XmlElement(name = "OutCmsCardApplTunUsr")
    protected String outCmsCardApplTunUsr;
    @XmlElement(name = "OutCmsCardApplTunUsrSn")
    protected int outCmsCardApplTunUsrSn;
    @XmlElement(name = "OutCmsCardApplTunUsrIntSn")
    protected short outCmsCardApplTunUsrIntSn;
    @XmlElement(name = "OutCmsCardApplTunAprvDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outCmsCardApplTunAprvDate;
    @XmlElement(name = "OutCmsCardApplTunAprvUnit")
    protected int outCmsCardApplTunAprvUnit;
    @XmlElement(name = "OutCmsCardApplTunAprvUsr")
    protected String outCmsCardApplTunAprvUsr;
    @XmlElement(name = "OutCmsCardApplTunAprvUsrSn")
    protected int outCmsCardApplTunAprvUsrSn;
    @XmlElement(name = "OutCmsCardApplTunAprvUsrInSn")
    protected short outCmsCardApplTunAprvUsrInSn;
    @XmlElement(name = "OutCmsCardApplCardSurnameLatin")
    protected String outCmsCardApplCardSurnameLatin;
    @XmlElement(name = "OutCmsCardApplCardNameLatin")
    protected String outCmsCardApplCardNameLatin;
    @XmlElement(name = "OutCmsCardApplFathernameLatin")
    protected String outCmsCardApplFathernameLatin;
    @XmlElement(name = "OutCmsCardApplCardSn")
    protected double outCmsCardApplCardSn;
    @XmlElement(name = "OutCmsCardApplCardAtmbin")
    protected String outCmsCardApplCardAtmbin;
    @XmlElement(name = "OutCmsCardApplCardCount")
    protected double outCmsCardApplCardCount;
    @XmlElement(name = "OutCmsCardApplPinIssuanceFlg")
    protected String outCmsCardApplPinIssuanceFlg;
    @XmlElement(name = "OutCmsCardApplTmstamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outCmsCardApplTmstamp;
    @XmlElement(name = "OutCmsCardApplExpAccNumber")
    protected String outCmsCardApplExpAccNumber;
    @XmlElement(name = "OutCmsCardApplExpAccCd")
    protected short outCmsCardApplExpAccCd;
    @XmlElement(name = "OutCmsCardApplExpAccPrfsys")
    protected short outCmsCardApplExpAccPrfsys;
    @XmlElement(name = "OutCmsCardApplExpTunDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outCmsCardApplExpTunDate;
    @XmlElement(name = "OutCmsCardApplExpTunUnit")
    protected int outCmsCardApplExpTunUnit;
    @XmlElement(name = "OutCmsCardApplExpTunUsr")
    protected String outCmsCardApplExpTunUsr;
    @XmlElement(name = "OutCmsCardApplExpTunUsrSn")
    protected int outCmsCardApplExpTunUsrSn;
    @XmlElement(name = "OutCmsCardApplExpTunUsrIntSn")
    protected short outCmsCardApplExpTunUsrIntSn;
    @XmlElement(name = "OutCmsCardApplExpTmstamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outCmsCardApplExpTmstamp;
    @XmlElement(name = "OutCmsCardApplComments")
    protected String outCmsCardApplComments;
    @XmlElement(name = "OutCmsCardApplCardReissueFlg")
    protected String outCmsCardApplCardReissueFlg;

    /**
     * Gets the value of the outMntRecordingAuthorizer1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutMntRecordingAuthorizer1() {
        return outMntRecordingAuthorizer1;
    }

    /**
     * Sets the value of the outMntRecordingAuthorizer1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutMntRecordingAuthorizer1(String value) {
        this.outMntRecordingAuthorizer1 = value;
    }

    /**
     * Gets the value of the outMntRecordingAuthorizer2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutMntRecordingAuthorizer2() {
        return outMntRecordingAuthorizer2;
    }

    /**
     * Sets the value of the outMntRecordingAuthorizer2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutMntRecordingAuthorizer2(String value) {
        this.outMntRecordingAuthorizer2 = value;
    }

    /**
     * Gets the value of the outMntRecordingChannelId property.
     * 
     */
    public int getOutMntRecordingChannelId() {
        return outMntRecordingChannelId;
    }

    /**
     * Sets the value of the outMntRecordingChannelId property.
     * 
     */
    public void setOutMntRecordingChannelId(int value) {
        this.outMntRecordingChannelId = value;
    }

    /**
     * Gets the value of the outMntRecordingGrpSubscript property.
     * 
     */
    public short getOutMntRecordingGrpSubscript() {
        return outMntRecordingGrpSubscript;
    }

    /**
     * Sets the value of the outMntRecordingGrpSubscript property.
     * 
     */
    public void setOutMntRecordingGrpSubscript(short value) {
        this.outMntRecordingGrpSubscript = value;
    }

    /**
     * Gets the value of the outMntRecordingIdJustific property.
     * 
     */
    public int getOutMntRecordingIdJustific() {
        return outMntRecordingIdJustific;
    }

    /**
     * Sets the value of the outMntRecordingIdJustific property.
     * 
     */
    public void setOutMntRecordingIdJustific(int value) {
        this.outMntRecordingIdJustific = value;
    }

    /**
     * Gets the value of the outMntRecordingIdProduct property.
     * 
     */
    public int getOutMntRecordingIdProduct() {
        return outMntRecordingIdProduct;
    }

    /**
     * Sets the value of the outMntRecordingIdProduct property.
     * 
     */
    public void setOutMntRecordingIdProduct(int value) {
        this.outMntRecordingIdProduct = value;
    }

    /**
     * Gets the value of the outMntRecordingPrftSystem property.
     * 
     */
    public short getOutMntRecordingPrftSystem() {
        return outMntRecordingPrftSystem;
    }

    /**
     * Sets the value of the outMntRecordingPrftSystem property.
     * 
     */
    public void setOutMntRecordingPrftSystem(short value) {
        this.outMntRecordingPrftSystem = value;
    }

    /**
     * Gets the value of the outMntRecordingReversalFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutMntRecordingReversalFlag() {
        return outMntRecordingReversalFlag;
    }

    /**
     * Sets the value of the outMntRecordingReversalFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutMntRecordingReversalFlag(String value) {
        this.outMntRecordingReversalFlag = value;
    }

    /**
     * Gets the value of the outMntRecordingTerminalNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutMntRecordingTerminalNumber() {
        return outMntRecordingTerminalNumber;
    }

    /**
     * Sets the value of the outMntRecordingTerminalNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutMntRecordingTerminalNumber(String value) {
        this.outMntRecordingTerminalNumber = value;
    }

    /**
     * Gets the value of the outMntRecordingTmstamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutMntRecordingTmstamp() {
        return outMntRecordingTmstamp;
    }

    /**
     * Sets the value of the outMntRecordingTmstamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutMntRecordingTmstamp(XMLGregorianCalendar value) {
        this.outMntRecordingTmstamp = value;
    }

    /**
     * Gets the value of the outMntRecordingTrxCode property.
     * 
     */
    public int getOutMntRecordingTrxCode() {
        return outMntRecordingTrxCode;
    }

    /**
     * Sets the value of the outMntRecordingTrxCode property.
     * 
     */
    public void setOutMntRecordingTrxCode(int value) {
        this.outMntRecordingTrxCode = value;
    }

    /**
     * Gets the value of the outMntRecordingTrxDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutMntRecordingTrxDate() {
        return outMntRecordingTrxDate;
    }

    /**
     * Sets the value of the outMntRecordingTrxDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutMntRecordingTrxDate(XMLGregorianCalendar value) {
        this.outMntRecordingTrxDate = value;
    }

    /**
     * Gets the value of the outMntRecordingTrxDetails property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutMntRecordingTrxDetails() {
        return outMntRecordingTrxDetails;
    }

    /**
     * Sets the value of the outMntRecordingTrxDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutMntRecordingTrxDetails(String value) {
        this.outMntRecordingTrxDetails = value;
    }

    /**
     * Gets the value of the outMntRecordingTrxUnit property.
     * 
     */
    public int getOutMntRecordingTrxUnit() {
        return outMntRecordingTrxUnit;
    }

    /**
     * Sets the value of the outMntRecordingTrxUnit property.
     * 
     */
    public void setOutMntRecordingTrxUnit(int value) {
        this.outMntRecordingTrxUnit = value;
    }

    /**
     * Gets the value of the outMntRecordingTrxUser property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutMntRecordingTrxUser() {
        return outMntRecordingTrxUser;
    }

    /**
     * Sets the value of the outMntRecordingTrxUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutMntRecordingTrxUser(String value) {
        this.outMntRecordingTrxUser = value;
    }

    /**
     * Gets the value of the outMntRecordingTrxUsrSn property.
     * 
     */
    public int getOutMntRecordingTrxUsrSn() {
        return outMntRecordingTrxUsrSn;
    }

    /**
     * Sets the value of the outMntRecordingTrxUsrSn property.
     * 
     */
    public void setOutMntRecordingTrxUsrSn(int value) {
        this.outMntRecordingTrxUsrSn = value;
    }

    /**
     * Gets the value of the outTeamInformationAccountCode property.
     * 
     */
    public double getOutTeamInformationAccountCode() {
        return outTeamInformationAccountCode;
    }

    /**
     * Sets the value of the outTeamInformationAccountCode property.
     * 
     */
    public void setOutTeamInformationAccountCode(double value) {
        this.outTeamInformationAccountCode = value;
    }

    /**
     * Gets the value of the outTeamInformationAuthorizationResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutTeamInformationAuthorizationResult() {
        return outTeamInformationAuthorizationResult;
    }

    /**
     * Sets the value of the outTeamInformationAuthorizationResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutTeamInformationAuthorizationResult(String value) {
        this.outTeamInformationAuthorizationResult = value;
    }

    /**
     * Gets the value of the outTeamInformationChargeDiscount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutTeamInformationChargeDiscount() {
        return outTeamInformationChargeDiscount;
    }

    /**
     * Sets the value of the outTeamInformationChargeDiscount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutTeamInformationChargeDiscount(BigDecimal value) {
        this.outTeamInformationChargeDiscount = value;
    }

    /**
     * Gets the value of the outTeamInformationCommissionDiscount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutTeamInformationCommissionDiscount() {
        return outTeamInformationCommissionDiscount;
    }

    /**
     * Sets the value of the outTeamInformationCommissionDiscount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutTeamInformationCommissionDiscount(BigDecimal value) {
        this.outTeamInformationCommissionDiscount = value;
    }

    /**
     * Gets the value of the outTeamInformationCustomerCode property.
     * 
     */
    public int getOutTeamInformationCustomerCode() {
        return outTeamInformationCustomerCode;
    }

    /**
     * Sets the value of the outTeamInformationCustomerCode property.
     * 
     */
    public void setOutTeamInformationCustomerCode(int value) {
        this.outTeamInformationCustomerCode = value;
    }

    /**
     * Gets the value of the outTeamInformationCustomerSurname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutTeamInformationCustomerSurname() {
        return outTeamInformationCustomerSurname;
    }

    /**
     * Sets the value of the outTeamInformationCustomerSurname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutTeamInformationCustomerSurname(String value) {
        this.outTeamInformationCustomerSurname = value;
    }

    /**
     * Gets the value of the outTeamInformationEvaluationResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutTeamInformationEvaluationResult() {
        return outTeamInformationEvaluationResult;
    }

    /**
     * Sets the value of the outTeamInformationEvaluationResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutTeamInformationEvaluationResult(String value) {
        this.outTeamInformationEvaluationResult = value;
    }

    /**
     * Gets the value of the outTeamInformationJustificationDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutTeamInformationJustificationDescription() {
        return outTeamInformationJustificationDescription;
    }

    /**
     * Sets the value of the outTeamInformationJustificationDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutTeamInformationJustificationDescription(String value) {
        this.outTeamInformationJustificationDescription = value;
    }

    /**
     * Gets the value of the outTeamInformationJustificationId property.
     * 
     */
    public int getOutTeamInformationJustificationId() {
        return outTeamInformationJustificationId;
    }

    /**
     * Sets the value of the outTeamInformationJustificationId property.
     * 
     */
    public void setOutTeamInformationJustificationId(int value) {
        this.outTeamInformationJustificationId = value;
    }

    /**
     * Gets the value of the outTeamInformationProductDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutTeamInformationProductDescription() {
        return outTeamInformationProductDescription;
    }

    /**
     * Sets the value of the outTeamInformationProductDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutTeamInformationProductDescription(String value) {
        this.outTeamInformationProductDescription = value;
    }

    /**
     * Gets the value of the outTeamInformationProductId property.
     * 
     */
    public int getOutTeamInformationProductId() {
        return outTeamInformationProductId;
    }

    /**
     * Sets the value of the outTeamInformationProductId property.
     * 
     */
    public void setOutTeamInformationProductId(int value) {
        this.outTeamInformationProductId = value;
    }

    /**
     * Gets the value of the outTeamInformationRequiredProfile1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutTeamInformationRequiredProfile1() {
        return outTeamInformationRequiredProfile1;
    }

    /**
     * Sets the value of the outTeamInformationRequiredProfile1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutTeamInformationRequiredProfile1(String value) {
        this.outTeamInformationRequiredProfile1 = value;
    }

    /**
     * Gets the value of the outTeamInformationRequiredProfile2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutTeamInformationRequiredProfile2() {
        return outTeamInformationRequiredProfile2;
    }

    /**
     * Sets the value of the outTeamInformationRequiredProfile2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutTeamInformationRequiredProfile2(String value) {
        this.outTeamInformationRequiredProfile2 = value;
    }

    /**
     * Gets the value of the outTeamInformationTransactionDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutTeamInformationTransactionDescription() {
        return outTeamInformationTransactionDescription;
    }

    /**
     * Sets the value of the outTeamInformationTransactionDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutTeamInformationTransactionDescription(String value) {
        this.outTeamInformationTransactionDescription = value;
    }

    /**
     * Gets the value of the outTeamInformationTransactionId property.
     * 
     */
    public int getOutTeamInformationTransactionId() {
        return outTeamInformationTransactionId;
    }

    /**
     * Sets the value of the outTeamInformationTransactionId property.
     * 
     */
    public void setOutTeamInformationTransactionId(int value) {
        this.outTeamInformationTransactionId = value;
    }

    /**
     * Gets the value of the outTeamInformationTrsAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutTeamInformationTrsAmount() {
        return outTeamInformationTrsAmount;
    }

    /**
     * Sets the value of the outTeamInformationTrsAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutTeamInformationTrsAmount(BigDecimal value) {
        this.outTeamInformationTrsAmount = value;
    }

    /**
     * Gets the value of the outTeamInformationUnitCode property.
     * 
     */
    public int getOutTeamInformationUnitCode() {
        return outTeamInformationUnitCode;
    }

    /**
     * Sets the value of the outTeamInformationUnitCode property.
     * 
     */
    public void setOutTeamInformationUnitCode(int value) {
        this.outTeamInformationUnitCode = value;
    }

    /**
     * Gets the value of the outTeamInformationUserCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutTeamInformationUserCode() {
        return outTeamInformationUserCode;
    }

    /**
     * Sets the value of the outTeamInformationUserCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutTeamInformationUserCode(String value) {
        this.outTeamInformationUserCode = value;
    }

    /**
     * Gets the value of the outTeamInformationUserProfile1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutTeamInformationUserProfile1() {
        return outTeamInformationUserProfile1;
    }

    /**
     * Sets the value of the outTeamInformationUserProfile1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutTeamInformationUserProfile1(String value) {
        this.outTeamInformationUserProfile1 = value;
    }

    /**
     * Gets the value of the outTeamInformationUserProfile2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutTeamInformationUserProfile2() {
        return outTeamInformationUserProfile2;
    }

    /**
     * Sets the value of the outTeamInformationUserProfile2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutTeamInformationUserProfile2(String value) {
        this.outTeamInformationUserProfile2 = value;
    }

    /**
     * Gets the value of the outTeamInformationUserProfile3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutTeamInformationUserProfile3() {
        return outTeamInformationUserProfile3;
    }

    /**
     * Sets the value of the outTeamInformationUserProfile3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutTeamInformationUserProfile3(String value) {
        this.outTeamInformationUserProfile3 = value;
    }

    /**
     * Gets the value of the outGrp property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCMS3604VOutGrpItem }
     *     
     */
    public ArrayOfCMS3604VOutGrpItem getOutGrp() {
        return outGrp;
    }

    /**
     * Sets the value of the outGrp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCMS3604VOutGrpItem }
     *     
     */
    public void setOutGrp(ArrayOfCMS3604VOutGrpItem value) {
        this.outGrp = value;
    }

    /**
     * Gets the value of the outCmsCardApplApplicationSn property.
     * 
     */
    public double getOutCmsCardApplApplicationSn() {
        return outCmsCardApplApplicationSn;
    }

    /**
     * Sets the value of the outCmsCardApplApplicationSn property.
     * 
     */
    public void setOutCmsCardApplApplicationSn(double value) {
        this.outCmsCardApplApplicationSn = value;
    }

    /**
     * Gets the value of the outCmsCardApplEntryStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCmsCardApplEntryStatus() {
        return outCmsCardApplEntryStatus;
    }

    /**
     * Sets the value of the outCmsCardApplEntryStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCmsCardApplEntryStatus(String value) {
        this.outCmsCardApplEntryStatus = value;
    }

    /**
     * Gets the value of the outCmsCardApplEmail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCmsCardApplEmail() {
        return outCmsCardApplEmail;
    }

    /**
     * Sets the value of the outCmsCardApplEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCmsCardApplEmail(String value) {
        this.outCmsCardApplEmail = value;
    }

    /**
     * Gets the value of the outCmsCardApplMobile property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCmsCardApplMobile() {
        return outCmsCardApplMobile;
    }

    /**
     * Sets the value of the outCmsCardApplMobile property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCmsCardApplMobile(String value) {
        this.outCmsCardApplMobile = value;
    }

    /**
     * Gets the value of the outCmsCardApplExpiryDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutCmsCardApplExpiryDate() {
        return outCmsCardApplExpiryDate;
    }

    /**
     * Sets the value of the outCmsCardApplExpiryDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutCmsCardApplExpiryDate(XMLGregorianCalendar value) {
        this.outCmsCardApplExpiryDate = value;
    }

    /**
     * Gets the value of the outCmsCardApplCreationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutCmsCardApplCreationDate() {
        return outCmsCardApplCreationDate;
    }

    /**
     * Sets the value of the outCmsCardApplCreationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutCmsCardApplCreationDate(XMLGregorianCalendar value) {
        this.outCmsCardApplCreationDate = value;
    }

    /**
     * Gets the value of the outCmsCardApplCreationUnit property.
     * 
     */
    public int getOutCmsCardApplCreationUnit() {
        return outCmsCardApplCreationUnit;
    }

    /**
     * Sets the value of the outCmsCardApplCreationUnit property.
     * 
     */
    public void setOutCmsCardApplCreationUnit(int value) {
        this.outCmsCardApplCreationUnit = value;
    }

    /**
     * Gets the value of the outCmsCardApplCreationUser property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCmsCardApplCreationUser() {
        return outCmsCardApplCreationUser;
    }

    /**
     * Sets the value of the outCmsCardApplCreationUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCmsCardApplCreationUser(String value) {
        this.outCmsCardApplCreationUser = value;
    }

    /**
     * Gets the value of the outCmsCardApplFinalizationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutCmsCardApplFinalizationDate() {
        return outCmsCardApplFinalizationDate;
    }

    /**
     * Sets the value of the outCmsCardApplFinalizationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutCmsCardApplFinalizationDate(XMLGregorianCalendar value) {
        this.outCmsCardApplFinalizationDate = value;
    }

    /**
     * Gets the value of the outCmsCardApplTunDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutCmsCardApplTunDate() {
        return outCmsCardApplTunDate;
    }

    /**
     * Sets the value of the outCmsCardApplTunDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutCmsCardApplTunDate(XMLGregorianCalendar value) {
        this.outCmsCardApplTunDate = value;
    }

    /**
     * Gets the value of the outCmsCardApplTunUnit property.
     * 
     */
    public int getOutCmsCardApplTunUnit() {
        return outCmsCardApplTunUnit;
    }

    /**
     * Sets the value of the outCmsCardApplTunUnit property.
     * 
     */
    public void setOutCmsCardApplTunUnit(int value) {
        this.outCmsCardApplTunUnit = value;
    }

    /**
     * Gets the value of the outCmsCardApplTunUsr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCmsCardApplTunUsr() {
        return outCmsCardApplTunUsr;
    }

    /**
     * Sets the value of the outCmsCardApplTunUsr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCmsCardApplTunUsr(String value) {
        this.outCmsCardApplTunUsr = value;
    }

    /**
     * Gets the value of the outCmsCardApplTunUsrSn property.
     * 
     */
    public int getOutCmsCardApplTunUsrSn() {
        return outCmsCardApplTunUsrSn;
    }

    /**
     * Sets the value of the outCmsCardApplTunUsrSn property.
     * 
     */
    public void setOutCmsCardApplTunUsrSn(int value) {
        this.outCmsCardApplTunUsrSn = value;
    }

    /**
     * Gets the value of the outCmsCardApplTunUsrIntSn property.
     * 
     */
    public short getOutCmsCardApplTunUsrIntSn() {
        return outCmsCardApplTunUsrIntSn;
    }

    /**
     * Sets the value of the outCmsCardApplTunUsrIntSn property.
     * 
     */
    public void setOutCmsCardApplTunUsrIntSn(short value) {
        this.outCmsCardApplTunUsrIntSn = value;
    }

    /**
     * Gets the value of the outCmsCardApplTunAprvDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutCmsCardApplTunAprvDate() {
        return outCmsCardApplTunAprvDate;
    }

    /**
     * Sets the value of the outCmsCardApplTunAprvDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutCmsCardApplTunAprvDate(XMLGregorianCalendar value) {
        this.outCmsCardApplTunAprvDate = value;
    }

    /**
     * Gets the value of the outCmsCardApplTunAprvUnit property.
     * 
     */
    public int getOutCmsCardApplTunAprvUnit() {
        return outCmsCardApplTunAprvUnit;
    }

    /**
     * Sets the value of the outCmsCardApplTunAprvUnit property.
     * 
     */
    public void setOutCmsCardApplTunAprvUnit(int value) {
        this.outCmsCardApplTunAprvUnit = value;
    }

    /**
     * Gets the value of the outCmsCardApplTunAprvUsr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCmsCardApplTunAprvUsr() {
        return outCmsCardApplTunAprvUsr;
    }

    /**
     * Sets the value of the outCmsCardApplTunAprvUsr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCmsCardApplTunAprvUsr(String value) {
        this.outCmsCardApplTunAprvUsr = value;
    }

    /**
     * Gets the value of the outCmsCardApplTunAprvUsrSn property.
     * 
     */
    public int getOutCmsCardApplTunAprvUsrSn() {
        return outCmsCardApplTunAprvUsrSn;
    }

    /**
     * Sets the value of the outCmsCardApplTunAprvUsrSn property.
     * 
     */
    public void setOutCmsCardApplTunAprvUsrSn(int value) {
        this.outCmsCardApplTunAprvUsrSn = value;
    }

    /**
     * Gets the value of the outCmsCardApplTunAprvUsrInSn property.
     * 
     */
    public short getOutCmsCardApplTunAprvUsrInSn() {
        return outCmsCardApplTunAprvUsrInSn;
    }

    /**
     * Sets the value of the outCmsCardApplTunAprvUsrInSn property.
     * 
     */
    public void setOutCmsCardApplTunAprvUsrInSn(short value) {
        this.outCmsCardApplTunAprvUsrInSn = value;
    }

    /**
     * Gets the value of the outCmsCardApplCardSurnameLatin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCmsCardApplCardSurnameLatin() {
        return outCmsCardApplCardSurnameLatin;
    }

    /**
     * Sets the value of the outCmsCardApplCardSurnameLatin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCmsCardApplCardSurnameLatin(String value) {
        this.outCmsCardApplCardSurnameLatin = value;
    }

    /**
     * Gets the value of the outCmsCardApplCardNameLatin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCmsCardApplCardNameLatin() {
        return outCmsCardApplCardNameLatin;
    }

    /**
     * Sets the value of the outCmsCardApplCardNameLatin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCmsCardApplCardNameLatin(String value) {
        this.outCmsCardApplCardNameLatin = value;
    }

    /**
     * Gets the value of the outCmsCardApplFathernameLatin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCmsCardApplFathernameLatin() {
        return outCmsCardApplFathernameLatin;
    }

    /**
     * Sets the value of the outCmsCardApplFathernameLatin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCmsCardApplFathernameLatin(String value) {
        this.outCmsCardApplFathernameLatin = value;
    }

    /**
     * Gets the value of the outCmsCardApplCardSn property.
     * 
     */
    public double getOutCmsCardApplCardSn() {
        return outCmsCardApplCardSn;
    }

    /**
     * Sets the value of the outCmsCardApplCardSn property.
     * 
     */
    public void setOutCmsCardApplCardSn(double value) {
        this.outCmsCardApplCardSn = value;
    }

    /**
     * Gets the value of the outCmsCardApplCardAtmbin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCmsCardApplCardAtmbin() {
        return outCmsCardApplCardAtmbin;
    }

    /**
     * Sets the value of the outCmsCardApplCardAtmbin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCmsCardApplCardAtmbin(String value) {
        this.outCmsCardApplCardAtmbin = value;
    }

    /**
     * Gets the value of the outCmsCardApplCardCount property.
     * 
     */
    public double getOutCmsCardApplCardCount() {
        return outCmsCardApplCardCount;
    }

    /**
     * Sets the value of the outCmsCardApplCardCount property.
     * 
     */
    public void setOutCmsCardApplCardCount(double value) {
        this.outCmsCardApplCardCount = value;
    }

    /**
     * Gets the value of the outCmsCardApplPinIssuanceFlg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCmsCardApplPinIssuanceFlg() {
        return outCmsCardApplPinIssuanceFlg;
    }

    /**
     * Sets the value of the outCmsCardApplPinIssuanceFlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCmsCardApplPinIssuanceFlg(String value) {
        this.outCmsCardApplPinIssuanceFlg = value;
    }

    /**
     * Gets the value of the outCmsCardApplTmstamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutCmsCardApplTmstamp() {
        return outCmsCardApplTmstamp;
    }

    /**
     * Sets the value of the outCmsCardApplTmstamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutCmsCardApplTmstamp(XMLGregorianCalendar value) {
        this.outCmsCardApplTmstamp = value;
    }

    /**
     * Gets the value of the outCmsCardApplExpAccNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCmsCardApplExpAccNumber() {
        return outCmsCardApplExpAccNumber;
    }

    /**
     * Sets the value of the outCmsCardApplExpAccNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCmsCardApplExpAccNumber(String value) {
        this.outCmsCardApplExpAccNumber = value;
    }

    /**
     * Gets the value of the outCmsCardApplExpAccCd property.
     * 
     */
    public short getOutCmsCardApplExpAccCd() {
        return outCmsCardApplExpAccCd;
    }

    /**
     * Sets the value of the outCmsCardApplExpAccCd property.
     * 
     */
    public void setOutCmsCardApplExpAccCd(short value) {
        this.outCmsCardApplExpAccCd = value;
    }

    /**
     * Gets the value of the outCmsCardApplExpAccPrfsys property.
     * 
     */
    public short getOutCmsCardApplExpAccPrfsys() {
        return outCmsCardApplExpAccPrfsys;
    }

    /**
     * Sets the value of the outCmsCardApplExpAccPrfsys property.
     * 
     */
    public void setOutCmsCardApplExpAccPrfsys(short value) {
        this.outCmsCardApplExpAccPrfsys = value;
    }

    /**
     * Gets the value of the outCmsCardApplExpTunDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutCmsCardApplExpTunDate() {
        return outCmsCardApplExpTunDate;
    }

    /**
     * Sets the value of the outCmsCardApplExpTunDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutCmsCardApplExpTunDate(XMLGregorianCalendar value) {
        this.outCmsCardApplExpTunDate = value;
    }

    /**
     * Gets the value of the outCmsCardApplExpTunUnit property.
     * 
     */
    public int getOutCmsCardApplExpTunUnit() {
        return outCmsCardApplExpTunUnit;
    }

    /**
     * Sets the value of the outCmsCardApplExpTunUnit property.
     * 
     */
    public void setOutCmsCardApplExpTunUnit(int value) {
        this.outCmsCardApplExpTunUnit = value;
    }

    /**
     * Gets the value of the outCmsCardApplExpTunUsr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCmsCardApplExpTunUsr() {
        return outCmsCardApplExpTunUsr;
    }

    /**
     * Sets the value of the outCmsCardApplExpTunUsr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCmsCardApplExpTunUsr(String value) {
        this.outCmsCardApplExpTunUsr = value;
    }

    /**
     * Gets the value of the outCmsCardApplExpTunUsrSn property.
     * 
     */
    public int getOutCmsCardApplExpTunUsrSn() {
        return outCmsCardApplExpTunUsrSn;
    }

    /**
     * Sets the value of the outCmsCardApplExpTunUsrSn property.
     * 
     */
    public void setOutCmsCardApplExpTunUsrSn(int value) {
        this.outCmsCardApplExpTunUsrSn = value;
    }

    /**
     * Gets the value of the outCmsCardApplExpTunUsrIntSn property.
     * 
     */
    public short getOutCmsCardApplExpTunUsrIntSn() {
        return outCmsCardApplExpTunUsrIntSn;
    }

    /**
     * Sets the value of the outCmsCardApplExpTunUsrIntSn property.
     * 
     */
    public void setOutCmsCardApplExpTunUsrIntSn(short value) {
        this.outCmsCardApplExpTunUsrIntSn = value;
    }

    /**
     * Gets the value of the outCmsCardApplExpTmstamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutCmsCardApplExpTmstamp() {
        return outCmsCardApplExpTmstamp;
    }

    /**
     * Sets the value of the outCmsCardApplExpTmstamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutCmsCardApplExpTmstamp(XMLGregorianCalendar value) {
        this.outCmsCardApplExpTmstamp = value;
    }

    /**
     * Gets the value of the outCmsCardApplComments property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCmsCardApplComments() {
        return outCmsCardApplComments;
    }

    /**
     * Sets the value of the outCmsCardApplComments property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCmsCardApplComments(String value) {
        this.outCmsCardApplComments = value;
    }

    /**
     * Gets the value of the outCmsCardApplCardReissueFlg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCmsCardApplCardReissueFlg() {
        return outCmsCardApplCardReissueFlg;
    }

    /**
     * Sets the value of the outCmsCardApplCardReissueFlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCmsCardApplCardReissueFlg(String value) {
        this.outCmsCardApplCardReissueFlg = value;
    }

}
