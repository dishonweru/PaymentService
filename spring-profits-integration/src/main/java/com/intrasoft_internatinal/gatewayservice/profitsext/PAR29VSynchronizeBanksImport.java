
package com.intrasoft_internatinal.gatewayservice.profitsext;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for PAR29V_SynchronizeBanksImport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PAR29V_SynchronizeBanksImport">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}BaseImport">
 *       &lt;sequence>
 *         &lt;element name="Command" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InBorrowAccGlgAccountAccountId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InBorrowMmGlgAccountAccountId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCntryGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InIgnoreBicIefSuppliedFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InInsertCollaborationBanksAccCdAlgUsed" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InInsertCollaborationBanksAchBankCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InInsertCollaborationBanksAcv" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InInsertCollaborationBanksAgentCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InInsertCollaborationBanksAtmDiasCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InInsertCollaborationBanksBankId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InInsertCollaborationBanksBankName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InInsertCollaborationBanksBbanAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InInsertCollaborationBanksBbanForCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InInsertCollaborationBanksBbanPrintFormat" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InInsertCollaborationBanksBbanUnit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InInsertCollaborationBanksBilateralAgr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InInsertCollaborationBanksBorrowAccountAcc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InInsertCollaborationBanksBorrowAccountMm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InInsertCollaborationBanksChqCdAlgUsed" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InInsertCollaborationBanksCntryIsoCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InInsertCollaborationBanksCollLetterChk" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InInsertCollaborationBanksCorrBankFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InInsertCollaborationBanksCountryCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InInsertCollaborationBanksDhsseBankdrftFlg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InInsertCollaborationBanksDhssePrivchqFlg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InInsertCollaborationBanksDhsseTravchqFlg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InInsertCollaborationBanksDiasBankCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InInsertCollaborationBanksDiascheqBuyeronly" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InInsertCollaborationBanksDomCentralBank" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InInsertCollaborationBanksDtfCorresCustCd" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InInsertCollaborationBanksDtfCorresCustId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InInsertCollaborationBanksEntryComments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InInsertCollaborationBanksEntryStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InInsertCollaborationBanksLendAccountAcc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InInsertCollaborationBanksLendAccountMm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InInsertCollaborationBanksMchBankCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InInsertCollaborationBanksNormalCheques" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InInsertCollaborationBanksOurBankFlg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InInsertCollaborationBanksPostalDraft" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InInsertCollaborationBanksSwiftAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InInsertCollaborationBanksTmstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InInsertDistrChannelIdChannel" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InJustificIdJustific" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InLendAccGlgAccountAccountId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InLendMmGlgAccountAccountId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InProductIdProduct" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InRetrieveCollaborationBanksBankId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InTrxLogClientMntRecordingAuthorizer1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InTrxLogClientMntRecordingAuthorizer2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InTrxLogClientMntRecordingChannelId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InTrxLogClientMntRecordingPrftSystem" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InTrxLogClientMntRecordingReversalFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InTrxLogClientMntRecordingTerminalNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InTrxLogClientMntRecordingTrxCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InTrxLogClientMntRecordingTrxDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InTrxLogClientMntRecordingTrxUnit" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InTrxLogClientMntRecordingTrxUser" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PAR29V_SynchronizeBanksImport", propOrder = {
    "command",
    "inBorrowAccGlgAccountAccountId",
    "inBorrowMmGlgAccountAccountId",
    "inCntryGenericDetailSerialNum",
    "inIgnoreBicIefSuppliedFlag",
    "inInsertCollaborationBanksAccCdAlgUsed",
    "inInsertCollaborationBanksAchBankCode",
    "inInsertCollaborationBanksAcv",
    "inInsertCollaborationBanksAgentCode",
    "inInsertCollaborationBanksAtmDiasCode",
    "inInsertCollaborationBanksBankId",
    "inInsertCollaborationBanksBankName",
    "inInsertCollaborationBanksBbanAccount",
    "inInsertCollaborationBanksBbanForCd",
    "inInsertCollaborationBanksBbanPrintFormat",
    "inInsertCollaborationBanksBbanUnit",
    "inInsertCollaborationBanksBilateralAgr",
    "inInsertCollaborationBanksBorrowAccountAcc",
    "inInsertCollaborationBanksBorrowAccountMm",
    "inInsertCollaborationBanksChqCdAlgUsed",
    "inInsertCollaborationBanksCntryIsoCode",
    "inInsertCollaborationBanksCollLetterChk",
    "inInsertCollaborationBanksCorrBankFlag",
    "inInsertCollaborationBanksCountryCode",
    "inInsertCollaborationBanksDhsseBankdrftFlg",
    "inInsertCollaborationBanksDhssePrivchqFlg",
    "inInsertCollaborationBanksDhsseTravchqFlg",
    "inInsertCollaborationBanksDiasBankCode",
    "inInsertCollaborationBanksDiascheqBuyeronly",
    "inInsertCollaborationBanksDomCentralBank",
    "inInsertCollaborationBanksDtfCorresCustCd",
    "inInsertCollaborationBanksDtfCorresCustId",
    "inInsertCollaborationBanksEntryComments",
    "inInsertCollaborationBanksEntryStatus",
    "inInsertCollaborationBanksLendAccountAcc",
    "inInsertCollaborationBanksLendAccountMm",
    "inInsertCollaborationBanksMchBankCode",
    "inInsertCollaborationBanksNormalCheques",
    "inInsertCollaborationBanksOurBankFlg",
    "inInsertCollaborationBanksPostalDraft",
    "inInsertCollaborationBanksSwiftAddress",
    "inInsertCollaborationBanksTmstamp",
    "inInsertDistrChannelIdChannel",
    "inJustificIdJustific",
    "inLendAccGlgAccountAccountId",
    "inLendMmGlgAccountAccountId",
    "inProductIdProduct",
    "inRetrieveCollaborationBanksBankId",
    "inTrxLogClientMntRecordingAuthorizer1",
    "inTrxLogClientMntRecordingAuthorizer2",
    "inTrxLogClientMntRecordingChannelId",
    "inTrxLogClientMntRecordingPrftSystem",
    "inTrxLogClientMntRecordingReversalFlag",
    "inTrxLogClientMntRecordingTerminalNumber",
    "inTrxLogClientMntRecordingTrxCode",
    "inTrxLogClientMntRecordingTrxDate",
    "inTrxLogClientMntRecordingTrxUnit",
    "inTrxLogClientMntRecordingTrxUser"
})
public class PAR29VSynchronizeBanksImport
    extends BaseImport
{

    @XmlElement(name = "Command")
    protected String command;
    @XmlElement(name = "InBorrowAccGlgAccountAccountId")
    protected String inBorrowAccGlgAccountAccountId;
    @XmlElement(name = "InBorrowMmGlgAccountAccountId")
    protected String inBorrowMmGlgAccountAccountId;
    @XmlElement(name = "InCntryGenericDetailSerialNum")
    protected int inCntryGenericDetailSerialNum;
    @XmlElement(name = "InIgnoreBicIefSuppliedFlag")
    protected String inIgnoreBicIefSuppliedFlag;
    @XmlElement(name = "InInsertCollaborationBanksAccCdAlgUsed")
    protected String inInsertCollaborationBanksAccCdAlgUsed;
    @XmlElement(name = "InInsertCollaborationBanksAchBankCode")
    protected String inInsertCollaborationBanksAchBankCode;
    @XmlElement(name = "InInsertCollaborationBanksAcv")
    protected String inInsertCollaborationBanksAcv;
    @XmlElement(name = "InInsertCollaborationBanksAgentCode")
    protected int inInsertCollaborationBanksAgentCode;
    @XmlElement(name = "InInsertCollaborationBanksAtmDiasCode")
    protected String inInsertCollaborationBanksAtmDiasCode;
    @XmlElement(name = "InInsertCollaborationBanksBankId")
    protected int inInsertCollaborationBanksBankId;
    @XmlElement(name = "InInsertCollaborationBanksBankName")
    protected String inInsertCollaborationBanksBankName;
    @XmlElement(name = "InInsertCollaborationBanksBbanAccount")
    protected String inInsertCollaborationBanksBbanAccount;
    @XmlElement(name = "InInsertCollaborationBanksBbanForCd")
    protected String inInsertCollaborationBanksBbanForCd;
    @XmlElement(name = "InInsertCollaborationBanksBbanPrintFormat")
    protected String inInsertCollaborationBanksBbanPrintFormat;
    @XmlElement(name = "InInsertCollaborationBanksBbanUnit")
    protected String inInsertCollaborationBanksBbanUnit;
    @XmlElement(name = "InInsertCollaborationBanksBilateralAgr")
    protected String inInsertCollaborationBanksBilateralAgr;
    @XmlElement(name = "InInsertCollaborationBanksBorrowAccountAcc")
    protected String inInsertCollaborationBanksBorrowAccountAcc;
    @XmlElement(name = "InInsertCollaborationBanksBorrowAccountMm")
    protected String inInsertCollaborationBanksBorrowAccountMm;
    @XmlElement(name = "InInsertCollaborationBanksChqCdAlgUsed")
    protected String inInsertCollaborationBanksChqCdAlgUsed;
    @XmlElement(name = "InInsertCollaborationBanksCntryIsoCode")
    protected String inInsertCollaborationBanksCntryIsoCode;
    @XmlElement(name = "InInsertCollaborationBanksCollLetterChk")
    protected String inInsertCollaborationBanksCollLetterChk;
    @XmlElement(name = "InInsertCollaborationBanksCorrBankFlag")
    protected String inInsertCollaborationBanksCorrBankFlag;
    @XmlElement(name = "InInsertCollaborationBanksCountryCode")
    protected String inInsertCollaborationBanksCountryCode;
    @XmlElement(name = "InInsertCollaborationBanksDhsseBankdrftFlg")
    protected String inInsertCollaborationBanksDhsseBankdrftFlg;
    @XmlElement(name = "InInsertCollaborationBanksDhssePrivchqFlg")
    protected String inInsertCollaborationBanksDhssePrivchqFlg;
    @XmlElement(name = "InInsertCollaborationBanksDhsseTravchqFlg")
    protected String inInsertCollaborationBanksDhsseTravchqFlg;
    @XmlElement(name = "InInsertCollaborationBanksDiasBankCode")
    protected String inInsertCollaborationBanksDiasBankCode;
    @XmlElement(name = "InInsertCollaborationBanksDiascheqBuyeronly")
    protected String inInsertCollaborationBanksDiascheqBuyeronly;
    @XmlElement(name = "InInsertCollaborationBanksDomCentralBank")
    protected String inInsertCollaborationBanksDomCentralBank;
    @XmlElement(name = "InInsertCollaborationBanksDtfCorresCustCd")
    protected short inInsertCollaborationBanksDtfCorresCustCd;
    @XmlElement(name = "InInsertCollaborationBanksDtfCorresCustId")
    protected int inInsertCollaborationBanksDtfCorresCustId;
    @XmlElement(name = "InInsertCollaborationBanksEntryComments")
    protected String inInsertCollaborationBanksEntryComments;
    @XmlElement(name = "InInsertCollaborationBanksEntryStatus")
    protected String inInsertCollaborationBanksEntryStatus;
    @XmlElement(name = "InInsertCollaborationBanksLendAccountAcc")
    protected String inInsertCollaborationBanksLendAccountAcc;
    @XmlElement(name = "InInsertCollaborationBanksLendAccountMm")
    protected String inInsertCollaborationBanksLendAccountMm;
    @XmlElement(name = "InInsertCollaborationBanksMchBankCode")
    protected String inInsertCollaborationBanksMchBankCode;
    @XmlElement(name = "InInsertCollaborationBanksNormalCheques")
    protected String inInsertCollaborationBanksNormalCheques;
    @XmlElement(name = "InInsertCollaborationBanksOurBankFlg")
    protected String inInsertCollaborationBanksOurBankFlg;
    @XmlElement(name = "InInsertCollaborationBanksPostalDraft")
    protected String inInsertCollaborationBanksPostalDraft;
    @XmlElement(name = "InInsertCollaborationBanksSwiftAddress")
    protected String inInsertCollaborationBanksSwiftAddress;
    @XmlElement(name = "InInsertCollaborationBanksTmstamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inInsertCollaborationBanksTmstamp;
    @XmlElement(name = "InInsertDistrChannelIdChannel")
    protected int inInsertDistrChannelIdChannel;
    @XmlElement(name = "InJustificIdJustific")
    protected int inJustificIdJustific;
    @XmlElement(name = "InLendAccGlgAccountAccountId")
    protected String inLendAccGlgAccountAccountId;
    @XmlElement(name = "InLendMmGlgAccountAccountId")
    protected String inLendMmGlgAccountAccountId;
    @XmlElement(name = "InProductIdProduct")
    protected int inProductIdProduct;
    @XmlElement(name = "InRetrieveCollaborationBanksBankId")
    protected int inRetrieveCollaborationBanksBankId;
    @XmlElement(name = "InTrxLogClientMntRecordingAuthorizer1")
    protected String inTrxLogClientMntRecordingAuthorizer1;
    @XmlElement(name = "InTrxLogClientMntRecordingAuthorizer2")
    protected String inTrxLogClientMntRecordingAuthorizer2;
    @XmlElement(name = "InTrxLogClientMntRecordingChannelId")
    protected int inTrxLogClientMntRecordingChannelId;
    @XmlElement(name = "InTrxLogClientMntRecordingPrftSystem")
    protected short inTrxLogClientMntRecordingPrftSystem;
    @XmlElement(name = "InTrxLogClientMntRecordingReversalFlag")
    protected String inTrxLogClientMntRecordingReversalFlag;
    @XmlElement(name = "InTrxLogClientMntRecordingTerminalNumber")
    protected String inTrxLogClientMntRecordingTerminalNumber;
    @XmlElement(name = "InTrxLogClientMntRecordingTrxCode")
    protected int inTrxLogClientMntRecordingTrxCode;
    @XmlElement(name = "InTrxLogClientMntRecordingTrxDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inTrxLogClientMntRecordingTrxDate;
    @XmlElement(name = "InTrxLogClientMntRecordingTrxUnit")
    protected int inTrxLogClientMntRecordingTrxUnit;
    @XmlElement(name = "InTrxLogClientMntRecordingTrxUser")
    protected String inTrxLogClientMntRecordingTrxUser;

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
     * Gets the value of the inBorrowAccGlgAccountAccountId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInBorrowAccGlgAccountAccountId() {
        return inBorrowAccGlgAccountAccountId;
    }

    /**
     * Sets the value of the inBorrowAccGlgAccountAccountId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInBorrowAccGlgAccountAccountId(String value) {
        this.inBorrowAccGlgAccountAccountId = value;
    }

    /**
     * Gets the value of the inBorrowMmGlgAccountAccountId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInBorrowMmGlgAccountAccountId() {
        return inBorrowMmGlgAccountAccountId;
    }

    /**
     * Sets the value of the inBorrowMmGlgAccountAccountId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInBorrowMmGlgAccountAccountId(String value) {
        this.inBorrowMmGlgAccountAccountId = value;
    }

    /**
     * Gets the value of the inCntryGenericDetailSerialNum property.
     * 
     */
    public int getInCntryGenericDetailSerialNum() {
        return inCntryGenericDetailSerialNum;
    }

    /**
     * Sets the value of the inCntryGenericDetailSerialNum property.
     * 
     */
    public void setInCntryGenericDetailSerialNum(int value) {
        this.inCntryGenericDetailSerialNum = value;
    }

    /**
     * Gets the value of the inIgnoreBicIefSuppliedFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInIgnoreBicIefSuppliedFlag() {
        return inIgnoreBicIefSuppliedFlag;
    }

    /**
     * Sets the value of the inIgnoreBicIefSuppliedFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInIgnoreBicIefSuppliedFlag(String value) {
        this.inIgnoreBicIefSuppliedFlag = value;
    }

    /**
     * Gets the value of the inInsertCollaborationBanksAccCdAlgUsed property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInInsertCollaborationBanksAccCdAlgUsed() {
        return inInsertCollaborationBanksAccCdAlgUsed;
    }

    /**
     * Sets the value of the inInsertCollaborationBanksAccCdAlgUsed property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInInsertCollaborationBanksAccCdAlgUsed(String value) {
        this.inInsertCollaborationBanksAccCdAlgUsed = value;
    }

    /**
     * Gets the value of the inInsertCollaborationBanksAchBankCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInInsertCollaborationBanksAchBankCode() {
        return inInsertCollaborationBanksAchBankCode;
    }

    /**
     * Sets the value of the inInsertCollaborationBanksAchBankCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInInsertCollaborationBanksAchBankCode(String value) {
        this.inInsertCollaborationBanksAchBankCode = value;
    }

    /**
     * Gets the value of the inInsertCollaborationBanksAcv property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInInsertCollaborationBanksAcv() {
        return inInsertCollaborationBanksAcv;
    }

    /**
     * Sets the value of the inInsertCollaborationBanksAcv property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInInsertCollaborationBanksAcv(String value) {
        this.inInsertCollaborationBanksAcv = value;
    }

    /**
     * Gets the value of the inInsertCollaborationBanksAgentCode property.
     * 
     */
    public int getInInsertCollaborationBanksAgentCode() {
        return inInsertCollaborationBanksAgentCode;
    }

    /**
     * Sets the value of the inInsertCollaborationBanksAgentCode property.
     * 
     */
    public void setInInsertCollaborationBanksAgentCode(int value) {
        this.inInsertCollaborationBanksAgentCode = value;
    }

    /**
     * Gets the value of the inInsertCollaborationBanksAtmDiasCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInInsertCollaborationBanksAtmDiasCode() {
        return inInsertCollaborationBanksAtmDiasCode;
    }

    /**
     * Sets the value of the inInsertCollaborationBanksAtmDiasCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInInsertCollaborationBanksAtmDiasCode(String value) {
        this.inInsertCollaborationBanksAtmDiasCode = value;
    }

    /**
     * Gets the value of the inInsertCollaborationBanksBankId property.
     * 
     */
    public int getInInsertCollaborationBanksBankId() {
        return inInsertCollaborationBanksBankId;
    }

    /**
     * Sets the value of the inInsertCollaborationBanksBankId property.
     * 
     */
    public void setInInsertCollaborationBanksBankId(int value) {
        this.inInsertCollaborationBanksBankId = value;
    }

    /**
     * Gets the value of the inInsertCollaborationBanksBankName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInInsertCollaborationBanksBankName() {
        return inInsertCollaborationBanksBankName;
    }

    /**
     * Sets the value of the inInsertCollaborationBanksBankName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInInsertCollaborationBanksBankName(String value) {
        this.inInsertCollaborationBanksBankName = value;
    }

    /**
     * Gets the value of the inInsertCollaborationBanksBbanAccount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInInsertCollaborationBanksBbanAccount() {
        return inInsertCollaborationBanksBbanAccount;
    }

    /**
     * Sets the value of the inInsertCollaborationBanksBbanAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInInsertCollaborationBanksBbanAccount(String value) {
        this.inInsertCollaborationBanksBbanAccount = value;
    }

    /**
     * Gets the value of the inInsertCollaborationBanksBbanForCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInInsertCollaborationBanksBbanForCd() {
        return inInsertCollaborationBanksBbanForCd;
    }

    /**
     * Sets the value of the inInsertCollaborationBanksBbanForCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInInsertCollaborationBanksBbanForCd(String value) {
        this.inInsertCollaborationBanksBbanForCd = value;
    }

    /**
     * Gets the value of the inInsertCollaborationBanksBbanPrintFormat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInInsertCollaborationBanksBbanPrintFormat() {
        return inInsertCollaborationBanksBbanPrintFormat;
    }

    /**
     * Sets the value of the inInsertCollaborationBanksBbanPrintFormat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInInsertCollaborationBanksBbanPrintFormat(String value) {
        this.inInsertCollaborationBanksBbanPrintFormat = value;
    }

    /**
     * Gets the value of the inInsertCollaborationBanksBbanUnit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInInsertCollaborationBanksBbanUnit() {
        return inInsertCollaborationBanksBbanUnit;
    }

    /**
     * Sets the value of the inInsertCollaborationBanksBbanUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInInsertCollaborationBanksBbanUnit(String value) {
        this.inInsertCollaborationBanksBbanUnit = value;
    }

    /**
     * Gets the value of the inInsertCollaborationBanksBilateralAgr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInInsertCollaborationBanksBilateralAgr() {
        return inInsertCollaborationBanksBilateralAgr;
    }

    /**
     * Sets the value of the inInsertCollaborationBanksBilateralAgr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInInsertCollaborationBanksBilateralAgr(String value) {
        this.inInsertCollaborationBanksBilateralAgr = value;
    }

    /**
     * Gets the value of the inInsertCollaborationBanksBorrowAccountAcc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInInsertCollaborationBanksBorrowAccountAcc() {
        return inInsertCollaborationBanksBorrowAccountAcc;
    }

    /**
     * Sets the value of the inInsertCollaborationBanksBorrowAccountAcc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInInsertCollaborationBanksBorrowAccountAcc(String value) {
        this.inInsertCollaborationBanksBorrowAccountAcc = value;
    }

    /**
     * Gets the value of the inInsertCollaborationBanksBorrowAccountMm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInInsertCollaborationBanksBorrowAccountMm() {
        return inInsertCollaborationBanksBorrowAccountMm;
    }

    /**
     * Sets the value of the inInsertCollaborationBanksBorrowAccountMm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInInsertCollaborationBanksBorrowAccountMm(String value) {
        this.inInsertCollaborationBanksBorrowAccountMm = value;
    }

    /**
     * Gets the value of the inInsertCollaborationBanksChqCdAlgUsed property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInInsertCollaborationBanksChqCdAlgUsed() {
        return inInsertCollaborationBanksChqCdAlgUsed;
    }

    /**
     * Sets the value of the inInsertCollaborationBanksChqCdAlgUsed property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInInsertCollaborationBanksChqCdAlgUsed(String value) {
        this.inInsertCollaborationBanksChqCdAlgUsed = value;
    }

    /**
     * Gets the value of the inInsertCollaborationBanksCntryIsoCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInInsertCollaborationBanksCntryIsoCode() {
        return inInsertCollaborationBanksCntryIsoCode;
    }

    /**
     * Sets the value of the inInsertCollaborationBanksCntryIsoCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInInsertCollaborationBanksCntryIsoCode(String value) {
        this.inInsertCollaborationBanksCntryIsoCode = value;
    }

    /**
     * Gets the value of the inInsertCollaborationBanksCollLetterChk property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInInsertCollaborationBanksCollLetterChk() {
        return inInsertCollaborationBanksCollLetterChk;
    }

    /**
     * Sets the value of the inInsertCollaborationBanksCollLetterChk property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInInsertCollaborationBanksCollLetterChk(String value) {
        this.inInsertCollaborationBanksCollLetterChk = value;
    }

    /**
     * Gets the value of the inInsertCollaborationBanksCorrBankFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInInsertCollaborationBanksCorrBankFlag() {
        return inInsertCollaborationBanksCorrBankFlag;
    }

    /**
     * Sets the value of the inInsertCollaborationBanksCorrBankFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInInsertCollaborationBanksCorrBankFlag(String value) {
        this.inInsertCollaborationBanksCorrBankFlag = value;
    }

    /**
     * Gets the value of the inInsertCollaborationBanksCountryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInInsertCollaborationBanksCountryCode() {
        return inInsertCollaborationBanksCountryCode;
    }

    /**
     * Sets the value of the inInsertCollaborationBanksCountryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInInsertCollaborationBanksCountryCode(String value) {
        this.inInsertCollaborationBanksCountryCode = value;
    }

    /**
     * Gets the value of the inInsertCollaborationBanksDhsseBankdrftFlg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInInsertCollaborationBanksDhsseBankdrftFlg() {
        return inInsertCollaborationBanksDhsseBankdrftFlg;
    }

    /**
     * Sets the value of the inInsertCollaborationBanksDhsseBankdrftFlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInInsertCollaborationBanksDhsseBankdrftFlg(String value) {
        this.inInsertCollaborationBanksDhsseBankdrftFlg = value;
    }

    /**
     * Gets the value of the inInsertCollaborationBanksDhssePrivchqFlg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInInsertCollaborationBanksDhssePrivchqFlg() {
        return inInsertCollaborationBanksDhssePrivchqFlg;
    }

    /**
     * Sets the value of the inInsertCollaborationBanksDhssePrivchqFlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInInsertCollaborationBanksDhssePrivchqFlg(String value) {
        this.inInsertCollaborationBanksDhssePrivchqFlg = value;
    }

    /**
     * Gets the value of the inInsertCollaborationBanksDhsseTravchqFlg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInInsertCollaborationBanksDhsseTravchqFlg() {
        return inInsertCollaborationBanksDhsseTravchqFlg;
    }

    /**
     * Sets the value of the inInsertCollaborationBanksDhsseTravchqFlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInInsertCollaborationBanksDhsseTravchqFlg(String value) {
        this.inInsertCollaborationBanksDhsseTravchqFlg = value;
    }

    /**
     * Gets the value of the inInsertCollaborationBanksDiasBankCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInInsertCollaborationBanksDiasBankCode() {
        return inInsertCollaborationBanksDiasBankCode;
    }

    /**
     * Sets the value of the inInsertCollaborationBanksDiasBankCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInInsertCollaborationBanksDiasBankCode(String value) {
        this.inInsertCollaborationBanksDiasBankCode = value;
    }

    /**
     * Gets the value of the inInsertCollaborationBanksDiascheqBuyeronly property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInInsertCollaborationBanksDiascheqBuyeronly() {
        return inInsertCollaborationBanksDiascheqBuyeronly;
    }

    /**
     * Sets the value of the inInsertCollaborationBanksDiascheqBuyeronly property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInInsertCollaborationBanksDiascheqBuyeronly(String value) {
        this.inInsertCollaborationBanksDiascheqBuyeronly = value;
    }

    /**
     * Gets the value of the inInsertCollaborationBanksDomCentralBank property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInInsertCollaborationBanksDomCentralBank() {
        return inInsertCollaborationBanksDomCentralBank;
    }

    /**
     * Sets the value of the inInsertCollaborationBanksDomCentralBank property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInInsertCollaborationBanksDomCentralBank(String value) {
        this.inInsertCollaborationBanksDomCentralBank = value;
    }

    /**
     * Gets the value of the inInsertCollaborationBanksDtfCorresCustCd property.
     * 
     */
    public short getInInsertCollaborationBanksDtfCorresCustCd() {
        return inInsertCollaborationBanksDtfCorresCustCd;
    }

    /**
     * Sets the value of the inInsertCollaborationBanksDtfCorresCustCd property.
     * 
     */
    public void setInInsertCollaborationBanksDtfCorresCustCd(short value) {
        this.inInsertCollaborationBanksDtfCorresCustCd = value;
    }

    /**
     * Gets the value of the inInsertCollaborationBanksDtfCorresCustId property.
     * 
     */
    public int getInInsertCollaborationBanksDtfCorresCustId() {
        return inInsertCollaborationBanksDtfCorresCustId;
    }

    /**
     * Sets the value of the inInsertCollaborationBanksDtfCorresCustId property.
     * 
     */
    public void setInInsertCollaborationBanksDtfCorresCustId(int value) {
        this.inInsertCollaborationBanksDtfCorresCustId = value;
    }

    /**
     * Gets the value of the inInsertCollaborationBanksEntryComments property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInInsertCollaborationBanksEntryComments() {
        return inInsertCollaborationBanksEntryComments;
    }

    /**
     * Sets the value of the inInsertCollaborationBanksEntryComments property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInInsertCollaborationBanksEntryComments(String value) {
        this.inInsertCollaborationBanksEntryComments = value;
    }

    /**
     * Gets the value of the inInsertCollaborationBanksEntryStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInInsertCollaborationBanksEntryStatus() {
        return inInsertCollaborationBanksEntryStatus;
    }

    /**
     * Sets the value of the inInsertCollaborationBanksEntryStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInInsertCollaborationBanksEntryStatus(String value) {
        this.inInsertCollaborationBanksEntryStatus = value;
    }

    /**
     * Gets the value of the inInsertCollaborationBanksLendAccountAcc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInInsertCollaborationBanksLendAccountAcc() {
        return inInsertCollaborationBanksLendAccountAcc;
    }

    /**
     * Sets the value of the inInsertCollaborationBanksLendAccountAcc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInInsertCollaborationBanksLendAccountAcc(String value) {
        this.inInsertCollaborationBanksLendAccountAcc = value;
    }

    /**
     * Gets the value of the inInsertCollaborationBanksLendAccountMm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInInsertCollaborationBanksLendAccountMm() {
        return inInsertCollaborationBanksLendAccountMm;
    }

    /**
     * Sets the value of the inInsertCollaborationBanksLendAccountMm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInInsertCollaborationBanksLendAccountMm(String value) {
        this.inInsertCollaborationBanksLendAccountMm = value;
    }

    /**
     * Gets the value of the inInsertCollaborationBanksMchBankCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInInsertCollaborationBanksMchBankCode() {
        return inInsertCollaborationBanksMchBankCode;
    }

    /**
     * Sets the value of the inInsertCollaborationBanksMchBankCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInInsertCollaborationBanksMchBankCode(String value) {
        this.inInsertCollaborationBanksMchBankCode = value;
    }

    /**
     * Gets the value of the inInsertCollaborationBanksNormalCheques property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInInsertCollaborationBanksNormalCheques() {
        return inInsertCollaborationBanksNormalCheques;
    }

    /**
     * Sets the value of the inInsertCollaborationBanksNormalCheques property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInInsertCollaborationBanksNormalCheques(String value) {
        this.inInsertCollaborationBanksNormalCheques = value;
    }

    /**
     * Gets the value of the inInsertCollaborationBanksOurBankFlg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInInsertCollaborationBanksOurBankFlg() {
        return inInsertCollaborationBanksOurBankFlg;
    }

    /**
     * Sets the value of the inInsertCollaborationBanksOurBankFlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInInsertCollaborationBanksOurBankFlg(String value) {
        this.inInsertCollaborationBanksOurBankFlg = value;
    }

    /**
     * Gets the value of the inInsertCollaborationBanksPostalDraft property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInInsertCollaborationBanksPostalDraft() {
        return inInsertCollaborationBanksPostalDraft;
    }

    /**
     * Sets the value of the inInsertCollaborationBanksPostalDraft property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInInsertCollaborationBanksPostalDraft(String value) {
        this.inInsertCollaborationBanksPostalDraft = value;
    }

    /**
     * Gets the value of the inInsertCollaborationBanksSwiftAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInInsertCollaborationBanksSwiftAddress() {
        return inInsertCollaborationBanksSwiftAddress;
    }

    /**
     * Sets the value of the inInsertCollaborationBanksSwiftAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInInsertCollaborationBanksSwiftAddress(String value) {
        this.inInsertCollaborationBanksSwiftAddress = value;
    }

    /**
     * Gets the value of the inInsertCollaborationBanksTmstamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInInsertCollaborationBanksTmstamp() {
        return inInsertCollaborationBanksTmstamp;
    }

    /**
     * Sets the value of the inInsertCollaborationBanksTmstamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInInsertCollaborationBanksTmstamp(XMLGregorianCalendar value) {
        this.inInsertCollaborationBanksTmstamp = value;
    }

    /**
     * Gets the value of the inInsertDistrChannelIdChannel property.
     * 
     */
    public int getInInsertDistrChannelIdChannel() {
        return inInsertDistrChannelIdChannel;
    }

    /**
     * Sets the value of the inInsertDistrChannelIdChannel property.
     * 
     */
    public void setInInsertDistrChannelIdChannel(int value) {
        this.inInsertDistrChannelIdChannel = value;
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
     * Gets the value of the inLendAccGlgAccountAccountId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInLendAccGlgAccountAccountId() {
        return inLendAccGlgAccountAccountId;
    }

    /**
     * Sets the value of the inLendAccGlgAccountAccountId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInLendAccGlgAccountAccountId(String value) {
        this.inLendAccGlgAccountAccountId = value;
    }

    /**
     * Gets the value of the inLendMmGlgAccountAccountId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInLendMmGlgAccountAccountId() {
        return inLendMmGlgAccountAccountId;
    }

    /**
     * Sets the value of the inLendMmGlgAccountAccountId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInLendMmGlgAccountAccountId(String value) {
        this.inLendMmGlgAccountAccountId = value;
    }

    /**
     * Gets the value of the inProductIdProduct property.
     * 
     */
    public int getInProductIdProduct() {
        return inProductIdProduct;
    }

    /**
     * Sets the value of the inProductIdProduct property.
     * 
     */
    public void setInProductIdProduct(int value) {
        this.inProductIdProduct = value;
    }

    /**
     * Gets the value of the inRetrieveCollaborationBanksBankId property.
     * 
     */
    public int getInRetrieveCollaborationBanksBankId() {
        return inRetrieveCollaborationBanksBankId;
    }

    /**
     * Sets the value of the inRetrieveCollaborationBanksBankId property.
     * 
     */
    public void setInRetrieveCollaborationBanksBankId(int value) {
        this.inRetrieveCollaborationBanksBankId = value;
    }

    /**
     * Gets the value of the inTrxLogClientMntRecordingAuthorizer1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInTrxLogClientMntRecordingAuthorizer1() {
        return inTrxLogClientMntRecordingAuthorizer1;
    }

    /**
     * Sets the value of the inTrxLogClientMntRecordingAuthorizer1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInTrxLogClientMntRecordingAuthorizer1(String value) {
        this.inTrxLogClientMntRecordingAuthorizer1 = value;
    }

    /**
     * Gets the value of the inTrxLogClientMntRecordingAuthorizer2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInTrxLogClientMntRecordingAuthorizer2() {
        return inTrxLogClientMntRecordingAuthorizer2;
    }

    /**
     * Sets the value of the inTrxLogClientMntRecordingAuthorizer2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInTrxLogClientMntRecordingAuthorizer2(String value) {
        this.inTrxLogClientMntRecordingAuthorizer2 = value;
    }

    /**
     * Gets the value of the inTrxLogClientMntRecordingChannelId property.
     * 
     */
    public int getInTrxLogClientMntRecordingChannelId() {
        return inTrxLogClientMntRecordingChannelId;
    }

    /**
     * Sets the value of the inTrxLogClientMntRecordingChannelId property.
     * 
     */
    public void setInTrxLogClientMntRecordingChannelId(int value) {
        this.inTrxLogClientMntRecordingChannelId = value;
    }

    /**
     * Gets the value of the inTrxLogClientMntRecordingPrftSystem property.
     * 
     */
    public short getInTrxLogClientMntRecordingPrftSystem() {
        return inTrxLogClientMntRecordingPrftSystem;
    }

    /**
     * Sets the value of the inTrxLogClientMntRecordingPrftSystem property.
     * 
     */
    public void setInTrxLogClientMntRecordingPrftSystem(short value) {
        this.inTrxLogClientMntRecordingPrftSystem = value;
    }

    /**
     * Gets the value of the inTrxLogClientMntRecordingReversalFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInTrxLogClientMntRecordingReversalFlag() {
        return inTrxLogClientMntRecordingReversalFlag;
    }

    /**
     * Sets the value of the inTrxLogClientMntRecordingReversalFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInTrxLogClientMntRecordingReversalFlag(String value) {
        this.inTrxLogClientMntRecordingReversalFlag = value;
    }

    /**
     * Gets the value of the inTrxLogClientMntRecordingTerminalNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInTrxLogClientMntRecordingTerminalNumber() {
        return inTrxLogClientMntRecordingTerminalNumber;
    }

    /**
     * Sets the value of the inTrxLogClientMntRecordingTerminalNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInTrxLogClientMntRecordingTerminalNumber(String value) {
        this.inTrxLogClientMntRecordingTerminalNumber = value;
    }

    /**
     * Gets the value of the inTrxLogClientMntRecordingTrxCode property.
     * 
     */
    public int getInTrxLogClientMntRecordingTrxCode() {
        return inTrxLogClientMntRecordingTrxCode;
    }

    /**
     * Sets the value of the inTrxLogClientMntRecordingTrxCode property.
     * 
     */
    public void setInTrxLogClientMntRecordingTrxCode(int value) {
        this.inTrxLogClientMntRecordingTrxCode = value;
    }

    /**
     * Gets the value of the inTrxLogClientMntRecordingTrxDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInTrxLogClientMntRecordingTrxDate() {
        return inTrxLogClientMntRecordingTrxDate;
    }

    /**
     * Sets the value of the inTrxLogClientMntRecordingTrxDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInTrxLogClientMntRecordingTrxDate(XMLGregorianCalendar value) {
        this.inTrxLogClientMntRecordingTrxDate = value;
    }

    /**
     * Gets the value of the inTrxLogClientMntRecordingTrxUnit property.
     * 
     */
    public int getInTrxLogClientMntRecordingTrxUnit() {
        return inTrxLogClientMntRecordingTrxUnit;
    }

    /**
     * Sets the value of the inTrxLogClientMntRecordingTrxUnit property.
     * 
     */
    public void setInTrxLogClientMntRecordingTrxUnit(int value) {
        this.inTrxLogClientMntRecordingTrxUnit = value;
    }

    /**
     * Gets the value of the inTrxLogClientMntRecordingTrxUser property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInTrxLogClientMntRecordingTrxUser() {
        return inTrxLogClientMntRecordingTrxUser;
    }

    /**
     * Sets the value of the inTrxLogClientMntRecordingTrxUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInTrxLogClientMntRecordingTrxUser(String value) {
        this.inTrxLogClientMntRecordingTrxUser = value;
    }

}
