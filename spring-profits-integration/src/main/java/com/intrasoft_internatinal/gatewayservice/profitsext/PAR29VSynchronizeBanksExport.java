
package com.intrasoft_internatinal.gatewayservice.profitsext;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for PAR29V_SynchronizeBanksExport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PAR29V_SynchronizeBanksExport">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}BaseExport">
 *       &lt;sequence>
 *         &lt;element name="Command" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OurLendMmGlgAccountAccountId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutBorrowAccGlgAccountAccountId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutBorrowMmGlgAccountAccountId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutChangeIefSuppliedFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutClearingAgentDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCntryGenericDetailParameterType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCntryGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutCntryGenericDetailShortDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCollaborationBanksAccCdAlgUsed" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCollaborationBanksAchBankCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCollaborationBanksAcv" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCollaborationBanksAgentCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutCollaborationBanksAtmDiasCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCollaborationBanksBankId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutCollaborationBanksBankName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCollaborationBanksBbanAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCollaborationBanksBbanForCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCollaborationBanksBbanPrintFormat" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCollaborationBanksBbanUnit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCollaborationBanksBilateralAgr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCollaborationBanksBorrowAccountAcc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCollaborationBanksBorrowAccountMm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCollaborationBanksChqCdAlgUsed" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCollaborationBanksCntryIsoCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCollaborationBanksCollLetterChk" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCollaborationBanksCountryCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCollaborationBanksDhsseBankdrftFlg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCollaborationBanksDhssePrivchqFlg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCollaborationBanksDhsseTravchqFlg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCollaborationBanksDiasBankCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCollaborationBanksDiascheqBuyeronly" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCollaborationBanksDomCentralBank" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCollaborationBanksDtfCorresCustCd" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutCollaborationBanksDtfCorresCustId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutCollaborationBanksEntryComments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCollaborationBanksEntryStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCollaborationBanksLendAccountAcc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCollaborationBanksLendAccountMm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCollaborationBanksMchBankCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCollaborationBanksNormalCheques" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCollaborationBanksOurBankFlg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCollaborationBanksPostalDraft" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCollaborationBanksSwiftAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCollaborationBanksTmstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutCountersCntr" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OutCountersCounterType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustomerCDigit" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutCustomerCustId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutDistrChannelDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutDistrChannelIdChannel" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutIefSuppliedActionEntry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutIefSuppliedActionEntryDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutIefSuppliedSrvStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutLendAccGlgAccountAccountId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSameSwiftAddressCollaborationBanksBankId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGrpSrvLog" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}ArrayOfPAR29VOutGrpSrvLogItem" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PAR29V_SynchronizeBanksExport", propOrder = {
    "command",
    "ourLendMmGlgAccountAccountId",
    "outBorrowAccGlgAccountAccountId",
    "outBorrowMmGlgAccountAccountId",
    "outChangeIefSuppliedFlag",
    "outClearingAgentDescription",
    "outCntryGenericDetailParameterType",
    "outCntryGenericDetailSerialNum",
    "outCntryGenericDetailShortDescription",
    "outCollaborationBanksAccCdAlgUsed",
    "outCollaborationBanksAchBankCode",
    "outCollaborationBanksAcv",
    "outCollaborationBanksAgentCode",
    "outCollaborationBanksAtmDiasCode",
    "outCollaborationBanksBankId",
    "outCollaborationBanksBankName",
    "outCollaborationBanksBbanAccount",
    "outCollaborationBanksBbanForCd",
    "outCollaborationBanksBbanPrintFormat",
    "outCollaborationBanksBbanUnit",
    "outCollaborationBanksBilateralAgr",
    "outCollaborationBanksBorrowAccountAcc",
    "outCollaborationBanksBorrowAccountMm",
    "outCollaborationBanksChqCdAlgUsed",
    "outCollaborationBanksCntryIsoCode",
    "outCollaborationBanksCollLetterChk",
    "outCollaborationBanksCountryCode",
    "outCollaborationBanksDhsseBankdrftFlg",
    "outCollaborationBanksDhssePrivchqFlg",
    "outCollaborationBanksDhsseTravchqFlg",
    "outCollaborationBanksDiasBankCode",
    "outCollaborationBanksDiascheqBuyeronly",
    "outCollaborationBanksDomCentralBank",
    "outCollaborationBanksDtfCorresCustCd",
    "outCollaborationBanksDtfCorresCustId",
    "outCollaborationBanksEntryComments",
    "outCollaborationBanksEntryStatus",
    "outCollaborationBanksLendAccountAcc",
    "outCollaborationBanksLendAccountMm",
    "outCollaborationBanksMchBankCode",
    "outCollaborationBanksNormalCheques",
    "outCollaborationBanksOurBankFlg",
    "outCollaborationBanksPostalDraft",
    "outCollaborationBanksSwiftAddress",
    "outCollaborationBanksTmstamp",
    "outCountersCntr",
    "outCountersCounterType",
    "outCustomerCDigit",
    "outCustomerCustId",
    "outDistrChannelDescription",
    "outDistrChannelIdChannel",
    "outIefSuppliedActionEntry",
    "outIefSuppliedActionEntryDesc",
    "outIefSuppliedSrvStatus",
    "outLendAccGlgAccountAccountId",
    "outSameSwiftAddressCollaborationBanksBankId",
    "outGrpSrvLog"
})
public class PAR29VSynchronizeBanksExport
    extends BaseExport
{

    @XmlElement(name = "Command")
    protected String command;
    @XmlElement(name = "OurLendMmGlgAccountAccountId")
    protected String ourLendMmGlgAccountAccountId;
    @XmlElement(name = "OutBorrowAccGlgAccountAccountId")
    protected String outBorrowAccGlgAccountAccountId;
    @XmlElement(name = "OutBorrowMmGlgAccountAccountId")
    protected String outBorrowMmGlgAccountAccountId;
    @XmlElement(name = "OutChangeIefSuppliedFlag")
    protected String outChangeIefSuppliedFlag;
    @XmlElement(name = "OutClearingAgentDescription")
    protected String outClearingAgentDescription;
    @XmlElement(name = "OutCntryGenericDetailParameterType")
    protected String outCntryGenericDetailParameterType;
    @XmlElement(name = "OutCntryGenericDetailSerialNum")
    protected int outCntryGenericDetailSerialNum;
    @XmlElement(name = "OutCntryGenericDetailShortDescription")
    protected String outCntryGenericDetailShortDescription;
    @XmlElement(name = "OutCollaborationBanksAccCdAlgUsed")
    protected String outCollaborationBanksAccCdAlgUsed;
    @XmlElement(name = "OutCollaborationBanksAchBankCode")
    protected String outCollaborationBanksAchBankCode;
    @XmlElement(name = "OutCollaborationBanksAcv")
    protected String outCollaborationBanksAcv;
    @XmlElement(name = "OutCollaborationBanksAgentCode")
    protected int outCollaborationBanksAgentCode;
    @XmlElement(name = "OutCollaborationBanksAtmDiasCode")
    protected String outCollaborationBanksAtmDiasCode;
    @XmlElement(name = "OutCollaborationBanksBankId")
    protected int outCollaborationBanksBankId;
    @XmlElement(name = "OutCollaborationBanksBankName")
    protected String outCollaborationBanksBankName;
    @XmlElement(name = "OutCollaborationBanksBbanAccount")
    protected String outCollaborationBanksBbanAccount;
    @XmlElement(name = "OutCollaborationBanksBbanForCd")
    protected String outCollaborationBanksBbanForCd;
    @XmlElement(name = "OutCollaborationBanksBbanPrintFormat")
    protected String outCollaborationBanksBbanPrintFormat;
    @XmlElement(name = "OutCollaborationBanksBbanUnit")
    protected String outCollaborationBanksBbanUnit;
    @XmlElement(name = "OutCollaborationBanksBilateralAgr")
    protected String outCollaborationBanksBilateralAgr;
    @XmlElement(name = "OutCollaborationBanksBorrowAccountAcc")
    protected String outCollaborationBanksBorrowAccountAcc;
    @XmlElement(name = "OutCollaborationBanksBorrowAccountMm")
    protected String outCollaborationBanksBorrowAccountMm;
    @XmlElement(name = "OutCollaborationBanksChqCdAlgUsed")
    protected String outCollaborationBanksChqCdAlgUsed;
    @XmlElement(name = "OutCollaborationBanksCntryIsoCode")
    protected String outCollaborationBanksCntryIsoCode;
    @XmlElement(name = "OutCollaborationBanksCollLetterChk")
    protected String outCollaborationBanksCollLetterChk;
    @XmlElement(name = "OutCollaborationBanksCountryCode")
    protected String outCollaborationBanksCountryCode;
    @XmlElement(name = "OutCollaborationBanksDhsseBankdrftFlg")
    protected String outCollaborationBanksDhsseBankdrftFlg;
    @XmlElement(name = "OutCollaborationBanksDhssePrivchqFlg")
    protected String outCollaborationBanksDhssePrivchqFlg;
    @XmlElement(name = "OutCollaborationBanksDhsseTravchqFlg")
    protected String outCollaborationBanksDhsseTravchqFlg;
    @XmlElement(name = "OutCollaborationBanksDiasBankCode")
    protected String outCollaborationBanksDiasBankCode;
    @XmlElement(name = "OutCollaborationBanksDiascheqBuyeronly")
    protected String outCollaborationBanksDiascheqBuyeronly;
    @XmlElement(name = "OutCollaborationBanksDomCentralBank")
    protected String outCollaborationBanksDomCentralBank;
    @XmlElement(name = "OutCollaborationBanksDtfCorresCustCd")
    protected short outCollaborationBanksDtfCorresCustCd;
    @XmlElement(name = "OutCollaborationBanksDtfCorresCustId")
    protected int outCollaborationBanksDtfCorresCustId;
    @XmlElement(name = "OutCollaborationBanksEntryComments")
    protected String outCollaborationBanksEntryComments;
    @XmlElement(name = "OutCollaborationBanksEntryStatus")
    protected String outCollaborationBanksEntryStatus;
    @XmlElement(name = "OutCollaborationBanksLendAccountAcc")
    protected String outCollaborationBanksLendAccountAcc;
    @XmlElement(name = "OutCollaborationBanksLendAccountMm")
    protected String outCollaborationBanksLendAccountMm;
    @XmlElement(name = "OutCollaborationBanksMchBankCode")
    protected String outCollaborationBanksMchBankCode;
    @XmlElement(name = "OutCollaborationBanksNormalCheques")
    protected String outCollaborationBanksNormalCheques;
    @XmlElement(name = "OutCollaborationBanksOurBankFlg")
    protected String outCollaborationBanksOurBankFlg;
    @XmlElement(name = "OutCollaborationBanksPostalDraft")
    protected String outCollaborationBanksPostalDraft;
    @XmlElement(name = "OutCollaborationBanksSwiftAddress")
    protected String outCollaborationBanksSwiftAddress;
    @XmlElement(name = "OutCollaborationBanksTmstamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outCollaborationBanksTmstamp;
    @XmlElement(name = "OutCountersCntr")
    protected double outCountersCntr;
    @XmlElement(name = "OutCountersCounterType")
    protected String outCountersCounterType;
    @XmlElement(name = "OutCustomerCDigit")
    protected short outCustomerCDigit;
    @XmlElement(name = "OutCustomerCustId")
    protected int outCustomerCustId;
    @XmlElement(name = "OutDistrChannelDescription")
    protected String outDistrChannelDescription;
    @XmlElement(name = "OutDistrChannelIdChannel")
    protected int outDistrChannelIdChannel;
    @XmlElement(name = "OutIefSuppliedActionEntry")
    protected String outIefSuppliedActionEntry;
    @XmlElement(name = "OutIefSuppliedActionEntryDesc")
    protected String outIefSuppliedActionEntryDesc;
    @XmlElement(name = "OutIefSuppliedSrvStatus")
    protected String outIefSuppliedSrvStatus;
    @XmlElement(name = "OutLendAccGlgAccountAccountId")
    protected String outLendAccGlgAccountAccountId;
    @XmlElement(name = "OutSameSwiftAddressCollaborationBanksBankId")
    protected int outSameSwiftAddressCollaborationBanksBankId;
    @XmlElement(name = "OutGrpSrvLog")
    protected ArrayOfPAR29VOutGrpSrvLogItem outGrpSrvLog;

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
     * Gets the value of the ourLendMmGlgAccountAccountId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOurLendMmGlgAccountAccountId() {
        return ourLendMmGlgAccountAccountId;
    }

    /**
     * Sets the value of the ourLendMmGlgAccountAccountId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOurLendMmGlgAccountAccountId(String value) {
        this.ourLendMmGlgAccountAccountId = value;
    }

    /**
     * Gets the value of the outBorrowAccGlgAccountAccountId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutBorrowAccGlgAccountAccountId() {
        return outBorrowAccGlgAccountAccountId;
    }

    /**
     * Sets the value of the outBorrowAccGlgAccountAccountId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutBorrowAccGlgAccountAccountId(String value) {
        this.outBorrowAccGlgAccountAccountId = value;
    }

    /**
     * Gets the value of the outBorrowMmGlgAccountAccountId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutBorrowMmGlgAccountAccountId() {
        return outBorrowMmGlgAccountAccountId;
    }

    /**
     * Sets the value of the outBorrowMmGlgAccountAccountId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutBorrowMmGlgAccountAccountId(String value) {
        this.outBorrowMmGlgAccountAccountId = value;
    }

    /**
     * Gets the value of the outChangeIefSuppliedFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutChangeIefSuppliedFlag() {
        return outChangeIefSuppliedFlag;
    }

    /**
     * Sets the value of the outChangeIefSuppliedFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutChangeIefSuppliedFlag(String value) {
        this.outChangeIefSuppliedFlag = value;
    }

    /**
     * Gets the value of the outClearingAgentDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutClearingAgentDescription() {
        return outClearingAgentDescription;
    }

    /**
     * Sets the value of the outClearingAgentDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutClearingAgentDescription(String value) {
        this.outClearingAgentDescription = value;
    }

    /**
     * Gets the value of the outCntryGenericDetailParameterType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCntryGenericDetailParameterType() {
        return outCntryGenericDetailParameterType;
    }

    /**
     * Sets the value of the outCntryGenericDetailParameterType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCntryGenericDetailParameterType(String value) {
        this.outCntryGenericDetailParameterType = value;
    }

    /**
     * Gets the value of the outCntryGenericDetailSerialNum property.
     * 
     */
    public int getOutCntryGenericDetailSerialNum() {
        return outCntryGenericDetailSerialNum;
    }

    /**
     * Sets the value of the outCntryGenericDetailSerialNum property.
     * 
     */
    public void setOutCntryGenericDetailSerialNum(int value) {
        this.outCntryGenericDetailSerialNum = value;
    }

    /**
     * Gets the value of the outCntryGenericDetailShortDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCntryGenericDetailShortDescription() {
        return outCntryGenericDetailShortDescription;
    }

    /**
     * Sets the value of the outCntryGenericDetailShortDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCntryGenericDetailShortDescription(String value) {
        this.outCntryGenericDetailShortDescription = value;
    }

    /**
     * Gets the value of the outCollaborationBanksAccCdAlgUsed property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCollaborationBanksAccCdAlgUsed() {
        return outCollaborationBanksAccCdAlgUsed;
    }

    /**
     * Sets the value of the outCollaborationBanksAccCdAlgUsed property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCollaborationBanksAccCdAlgUsed(String value) {
        this.outCollaborationBanksAccCdAlgUsed = value;
    }

    /**
     * Gets the value of the outCollaborationBanksAchBankCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCollaborationBanksAchBankCode() {
        return outCollaborationBanksAchBankCode;
    }

    /**
     * Sets the value of the outCollaborationBanksAchBankCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCollaborationBanksAchBankCode(String value) {
        this.outCollaborationBanksAchBankCode = value;
    }

    /**
     * Gets the value of the outCollaborationBanksAcv property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCollaborationBanksAcv() {
        return outCollaborationBanksAcv;
    }

    /**
     * Sets the value of the outCollaborationBanksAcv property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCollaborationBanksAcv(String value) {
        this.outCollaborationBanksAcv = value;
    }

    /**
     * Gets the value of the outCollaborationBanksAgentCode property.
     * 
     */
    public int getOutCollaborationBanksAgentCode() {
        return outCollaborationBanksAgentCode;
    }

    /**
     * Sets the value of the outCollaborationBanksAgentCode property.
     * 
     */
    public void setOutCollaborationBanksAgentCode(int value) {
        this.outCollaborationBanksAgentCode = value;
    }

    /**
     * Gets the value of the outCollaborationBanksAtmDiasCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCollaborationBanksAtmDiasCode() {
        return outCollaborationBanksAtmDiasCode;
    }

    /**
     * Sets the value of the outCollaborationBanksAtmDiasCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCollaborationBanksAtmDiasCode(String value) {
        this.outCollaborationBanksAtmDiasCode = value;
    }

    /**
     * Gets the value of the outCollaborationBanksBankId property.
     * 
     */
    public int getOutCollaborationBanksBankId() {
        return outCollaborationBanksBankId;
    }

    /**
     * Sets the value of the outCollaborationBanksBankId property.
     * 
     */
    public void setOutCollaborationBanksBankId(int value) {
        this.outCollaborationBanksBankId = value;
    }

    /**
     * Gets the value of the outCollaborationBanksBankName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCollaborationBanksBankName() {
        return outCollaborationBanksBankName;
    }

    /**
     * Sets the value of the outCollaborationBanksBankName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCollaborationBanksBankName(String value) {
        this.outCollaborationBanksBankName = value;
    }

    /**
     * Gets the value of the outCollaborationBanksBbanAccount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCollaborationBanksBbanAccount() {
        return outCollaborationBanksBbanAccount;
    }

    /**
     * Sets the value of the outCollaborationBanksBbanAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCollaborationBanksBbanAccount(String value) {
        this.outCollaborationBanksBbanAccount = value;
    }

    /**
     * Gets the value of the outCollaborationBanksBbanForCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCollaborationBanksBbanForCd() {
        return outCollaborationBanksBbanForCd;
    }

    /**
     * Sets the value of the outCollaborationBanksBbanForCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCollaborationBanksBbanForCd(String value) {
        this.outCollaborationBanksBbanForCd = value;
    }

    /**
     * Gets the value of the outCollaborationBanksBbanPrintFormat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCollaborationBanksBbanPrintFormat() {
        return outCollaborationBanksBbanPrintFormat;
    }

    /**
     * Sets the value of the outCollaborationBanksBbanPrintFormat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCollaborationBanksBbanPrintFormat(String value) {
        this.outCollaborationBanksBbanPrintFormat = value;
    }

    /**
     * Gets the value of the outCollaborationBanksBbanUnit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCollaborationBanksBbanUnit() {
        return outCollaborationBanksBbanUnit;
    }

    /**
     * Sets the value of the outCollaborationBanksBbanUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCollaborationBanksBbanUnit(String value) {
        this.outCollaborationBanksBbanUnit = value;
    }

    /**
     * Gets the value of the outCollaborationBanksBilateralAgr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCollaborationBanksBilateralAgr() {
        return outCollaborationBanksBilateralAgr;
    }

    /**
     * Sets the value of the outCollaborationBanksBilateralAgr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCollaborationBanksBilateralAgr(String value) {
        this.outCollaborationBanksBilateralAgr = value;
    }

    /**
     * Gets the value of the outCollaborationBanksBorrowAccountAcc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCollaborationBanksBorrowAccountAcc() {
        return outCollaborationBanksBorrowAccountAcc;
    }

    /**
     * Sets the value of the outCollaborationBanksBorrowAccountAcc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCollaborationBanksBorrowAccountAcc(String value) {
        this.outCollaborationBanksBorrowAccountAcc = value;
    }

    /**
     * Gets the value of the outCollaborationBanksBorrowAccountMm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCollaborationBanksBorrowAccountMm() {
        return outCollaborationBanksBorrowAccountMm;
    }

    /**
     * Sets the value of the outCollaborationBanksBorrowAccountMm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCollaborationBanksBorrowAccountMm(String value) {
        this.outCollaborationBanksBorrowAccountMm = value;
    }

    /**
     * Gets the value of the outCollaborationBanksChqCdAlgUsed property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCollaborationBanksChqCdAlgUsed() {
        return outCollaborationBanksChqCdAlgUsed;
    }

    /**
     * Sets the value of the outCollaborationBanksChqCdAlgUsed property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCollaborationBanksChqCdAlgUsed(String value) {
        this.outCollaborationBanksChqCdAlgUsed = value;
    }

    /**
     * Gets the value of the outCollaborationBanksCntryIsoCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCollaborationBanksCntryIsoCode() {
        return outCollaborationBanksCntryIsoCode;
    }

    /**
     * Sets the value of the outCollaborationBanksCntryIsoCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCollaborationBanksCntryIsoCode(String value) {
        this.outCollaborationBanksCntryIsoCode = value;
    }

    /**
     * Gets the value of the outCollaborationBanksCollLetterChk property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCollaborationBanksCollLetterChk() {
        return outCollaborationBanksCollLetterChk;
    }

    /**
     * Sets the value of the outCollaborationBanksCollLetterChk property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCollaborationBanksCollLetterChk(String value) {
        this.outCollaborationBanksCollLetterChk = value;
    }

    /**
     * Gets the value of the outCollaborationBanksCountryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCollaborationBanksCountryCode() {
        return outCollaborationBanksCountryCode;
    }

    /**
     * Sets the value of the outCollaborationBanksCountryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCollaborationBanksCountryCode(String value) {
        this.outCollaborationBanksCountryCode = value;
    }

    /**
     * Gets the value of the outCollaborationBanksDhsseBankdrftFlg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCollaborationBanksDhsseBankdrftFlg() {
        return outCollaborationBanksDhsseBankdrftFlg;
    }

    /**
     * Sets the value of the outCollaborationBanksDhsseBankdrftFlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCollaborationBanksDhsseBankdrftFlg(String value) {
        this.outCollaborationBanksDhsseBankdrftFlg = value;
    }

    /**
     * Gets the value of the outCollaborationBanksDhssePrivchqFlg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCollaborationBanksDhssePrivchqFlg() {
        return outCollaborationBanksDhssePrivchqFlg;
    }

    /**
     * Sets the value of the outCollaborationBanksDhssePrivchqFlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCollaborationBanksDhssePrivchqFlg(String value) {
        this.outCollaborationBanksDhssePrivchqFlg = value;
    }

    /**
     * Gets the value of the outCollaborationBanksDhsseTravchqFlg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCollaborationBanksDhsseTravchqFlg() {
        return outCollaborationBanksDhsseTravchqFlg;
    }

    /**
     * Sets the value of the outCollaborationBanksDhsseTravchqFlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCollaborationBanksDhsseTravchqFlg(String value) {
        this.outCollaborationBanksDhsseTravchqFlg = value;
    }

    /**
     * Gets the value of the outCollaborationBanksDiasBankCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCollaborationBanksDiasBankCode() {
        return outCollaborationBanksDiasBankCode;
    }

    /**
     * Sets the value of the outCollaborationBanksDiasBankCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCollaborationBanksDiasBankCode(String value) {
        this.outCollaborationBanksDiasBankCode = value;
    }

    /**
     * Gets the value of the outCollaborationBanksDiascheqBuyeronly property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCollaborationBanksDiascheqBuyeronly() {
        return outCollaborationBanksDiascheqBuyeronly;
    }

    /**
     * Sets the value of the outCollaborationBanksDiascheqBuyeronly property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCollaborationBanksDiascheqBuyeronly(String value) {
        this.outCollaborationBanksDiascheqBuyeronly = value;
    }

    /**
     * Gets the value of the outCollaborationBanksDomCentralBank property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCollaborationBanksDomCentralBank() {
        return outCollaborationBanksDomCentralBank;
    }

    /**
     * Sets the value of the outCollaborationBanksDomCentralBank property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCollaborationBanksDomCentralBank(String value) {
        this.outCollaborationBanksDomCentralBank = value;
    }

    /**
     * Gets the value of the outCollaborationBanksDtfCorresCustCd property.
     * 
     */
    public short getOutCollaborationBanksDtfCorresCustCd() {
        return outCollaborationBanksDtfCorresCustCd;
    }

    /**
     * Sets the value of the outCollaborationBanksDtfCorresCustCd property.
     * 
     */
    public void setOutCollaborationBanksDtfCorresCustCd(short value) {
        this.outCollaborationBanksDtfCorresCustCd = value;
    }

    /**
     * Gets the value of the outCollaborationBanksDtfCorresCustId property.
     * 
     */
    public int getOutCollaborationBanksDtfCorresCustId() {
        return outCollaborationBanksDtfCorresCustId;
    }

    /**
     * Sets the value of the outCollaborationBanksDtfCorresCustId property.
     * 
     */
    public void setOutCollaborationBanksDtfCorresCustId(int value) {
        this.outCollaborationBanksDtfCorresCustId = value;
    }

    /**
     * Gets the value of the outCollaborationBanksEntryComments property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCollaborationBanksEntryComments() {
        return outCollaborationBanksEntryComments;
    }

    /**
     * Sets the value of the outCollaborationBanksEntryComments property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCollaborationBanksEntryComments(String value) {
        this.outCollaborationBanksEntryComments = value;
    }

    /**
     * Gets the value of the outCollaborationBanksEntryStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCollaborationBanksEntryStatus() {
        return outCollaborationBanksEntryStatus;
    }

    /**
     * Sets the value of the outCollaborationBanksEntryStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCollaborationBanksEntryStatus(String value) {
        this.outCollaborationBanksEntryStatus = value;
    }

    /**
     * Gets the value of the outCollaborationBanksLendAccountAcc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCollaborationBanksLendAccountAcc() {
        return outCollaborationBanksLendAccountAcc;
    }

    /**
     * Sets the value of the outCollaborationBanksLendAccountAcc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCollaborationBanksLendAccountAcc(String value) {
        this.outCollaborationBanksLendAccountAcc = value;
    }

    /**
     * Gets the value of the outCollaborationBanksLendAccountMm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCollaborationBanksLendAccountMm() {
        return outCollaborationBanksLendAccountMm;
    }

    /**
     * Sets the value of the outCollaborationBanksLendAccountMm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCollaborationBanksLendAccountMm(String value) {
        this.outCollaborationBanksLendAccountMm = value;
    }

    /**
     * Gets the value of the outCollaborationBanksMchBankCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCollaborationBanksMchBankCode() {
        return outCollaborationBanksMchBankCode;
    }

    /**
     * Sets the value of the outCollaborationBanksMchBankCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCollaborationBanksMchBankCode(String value) {
        this.outCollaborationBanksMchBankCode = value;
    }

    /**
     * Gets the value of the outCollaborationBanksNormalCheques property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCollaborationBanksNormalCheques() {
        return outCollaborationBanksNormalCheques;
    }

    /**
     * Sets the value of the outCollaborationBanksNormalCheques property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCollaborationBanksNormalCheques(String value) {
        this.outCollaborationBanksNormalCheques = value;
    }

    /**
     * Gets the value of the outCollaborationBanksOurBankFlg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCollaborationBanksOurBankFlg() {
        return outCollaborationBanksOurBankFlg;
    }

    /**
     * Sets the value of the outCollaborationBanksOurBankFlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCollaborationBanksOurBankFlg(String value) {
        this.outCollaborationBanksOurBankFlg = value;
    }

    /**
     * Gets the value of the outCollaborationBanksPostalDraft property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCollaborationBanksPostalDraft() {
        return outCollaborationBanksPostalDraft;
    }

    /**
     * Sets the value of the outCollaborationBanksPostalDraft property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCollaborationBanksPostalDraft(String value) {
        this.outCollaborationBanksPostalDraft = value;
    }

    /**
     * Gets the value of the outCollaborationBanksSwiftAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCollaborationBanksSwiftAddress() {
        return outCollaborationBanksSwiftAddress;
    }

    /**
     * Sets the value of the outCollaborationBanksSwiftAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCollaborationBanksSwiftAddress(String value) {
        this.outCollaborationBanksSwiftAddress = value;
    }

    /**
     * Gets the value of the outCollaborationBanksTmstamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutCollaborationBanksTmstamp() {
        return outCollaborationBanksTmstamp;
    }

    /**
     * Sets the value of the outCollaborationBanksTmstamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutCollaborationBanksTmstamp(XMLGregorianCalendar value) {
        this.outCollaborationBanksTmstamp = value;
    }

    /**
     * Gets the value of the outCountersCntr property.
     * 
     */
    public double getOutCountersCntr() {
        return outCountersCntr;
    }

    /**
     * Sets the value of the outCountersCntr property.
     * 
     */
    public void setOutCountersCntr(double value) {
        this.outCountersCntr = value;
    }

    /**
     * Gets the value of the outCountersCounterType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCountersCounterType() {
        return outCountersCounterType;
    }

    /**
     * Sets the value of the outCountersCounterType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCountersCounterType(String value) {
        this.outCountersCounterType = value;
    }

    /**
     * Gets the value of the outCustomerCDigit property.
     * 
     */
    public short getOutCustomerCDigit() {
        return outCustomerCDigit;
    }

    /**
     * Sets the value of the outCustomerCDigit property.
     * 
     */
    public void setOutCustomerCDigit(short value) {
        this.outCustomerCDigit = value;
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
     * Gets the value of the outDistrChannelDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutDistrChannelDescription() {
        return outDistrChannelDescription;
    }

    /**
     * Sets the value of the outDistrChannelDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutDistrChannelDescription(String value) {
        this.outDistrChannelDescription = value;
    }

    /**
     * Gets the value of the outDistrChannelIdChannel property.
     * 
     */
    public int getOutDistrChannelIdChannel() {
        return outDistrChannelIdChannel;
    }

    /**
     * Sets the value of the outDistrChannelIdChannel property.
     * 
     */
    public void setOutDistrChannelIdChannel(int value) {
        this.outDistrChannelIdChannel = value;
    }

    /**
     * Gets the value of the outIefSuppliedActionEntry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutIefSuppliedActionEntry() {
        return outIefSuppliedActionEntry;
    }

    /**
     * Sets the value of the outIefSuppliedActionEntry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutIefSuppliedActionEntry(String value) {
        this.outIefSuppliedActionEntry = value;
    }

    /**
     * Gets the value of the outIefSuppliedActionEntryDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutIefSuppliedActionEntryDesc() {
        return outIefSuppliedActionEntryDesc;
    }

    /**
     * Sets the value of the outIefSuppliedActionEntryDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutIefSuppliedActionEntryDesc(String value) {
        this.outIefSuppliedActionEntryDesc = value;
    }

    /**
     * Gets the value of the outIefSuppliedSrvStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutIefSuppliedSrvStatus() {
        return outIefSuppliedSrvStatus;
    }

    /**
     * Sets the value of the outIefSuppliedSrvStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutIefSuppliedSrvStatus(String value) {
        this.outIefSuppliedSrvStatus = value;
    }

    /**
     * Gets the value of the outLendAccGlgAccountAccountId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutLendAccGlgAccountAccountId() {
        return outLendAccGlgAccountAccountId;
    }

    /**
     * Sets the value of the outLendAccGlgAccountAccountId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutLendAccGlgAccountAccountId(String value) {
        this.outLendAccGlgAccountAccountId = value;
    }

    /**
     * Gets the value of the outSameSwiftAddressCollaborationBanksBankId property.
     * 
     */
    public int getOutSameSwiftAddressCollaborationBanksBankId() {
        return outSameSwiftAddressCollaborationBanksBankId;
    }

    /**
     * Sets the value of the outSameSwiftAddressCollaborationBanksBankId property.
     * 
     */
    public void setOutSameSwiftAddressCollaborationBanksBankId(int value) {
        this.outSameSwiftAddressCollaborationBanksBankId = value;
    }

    /**
     * Gets the value of the outGrpSrvLog property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPAR29VOutGrpSrvLogItem }
     *     
     */
    public ArrayOfPAR29VOutGrpSrvLogItem getOutGrpSrvLog() {
        return outGrpSrvLog;
    }

    /**
     * Sets the value of the outGrpSrvLog property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPAR29VOutGrpSrvLogItem }
     *     
     */
    public void setOutGrpSrvLog(ArrayOfPAR29VOutGrpSrvLogItem value) {
        this.outGrpSrvLog = value;
    }

}
