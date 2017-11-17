
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for L0705V_LoginUserExport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="L0705V_LoginUserExport">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}BaseExport">
 *       &lt;sequence>
 *         &lt;element name="OutCanamParmsFilename" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCollaborationBanksAchBankCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCollaborationBanksChqCdAlgUsed" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutExpirationIefSuppliedActionEntryDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutExpirationIefSuppliedSrvStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutIefSuppliedActionEntry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutIefSuppliedCommand" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutIefSuppliedSrvStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutLogPathGenericDetailDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutLoginIefSuppliedCommand" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutParametersOutBankParametersAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutParametersOutBankParametersBankCode" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutParametersOutBankParametersBankName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutParametersOutBankParametersConstTblCurrency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutParametersOutBankParametersCurrTrxDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutParametersOutBankParametersDomesticCurrency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutParametersOutBankParametersEncryptFlg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutParametersOutBankParametersEuroEchoDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutParametersOutBankParametersIbanFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutParametersOutBankParametersLoginUnitFlg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutParametersOutBankParametersMaxAmntRateTbl" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutParametersOutBankParametersMaxAmntSrs" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutParametersOutBankParametersRateTblCurrency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutParametersOutBankParametersRateUsage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutParametersOutBankParametersTaxRegNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutParametersOutBankemployeeFirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutParametersOutBankemployeeLastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutParametersOutDistrChannelIdChannel" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutParametersOutProfile1UnitCategoryPerRoleId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutParametersOutProfile1UnitCategoryPerRolePtjCheckOvercome" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutParametersOutProfile2UnitCategoryPerRoleId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutParametersOutProfile2UnitCategoryPerRolePtjCheckOvercome" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutParametersOutProfile3UnitCategoryPerRoleId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutParametersOutProfile3UnitCategoryPerRolePtjCheckOvercome" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutParametersOutTerminalTerminalNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutParametersOutTrxCountTrxCounter" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutParametersOutUnitClearingHouseFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutParametersOutUnitCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutParametersOutUnitHldWorkPermit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutParametersOutUnitUnitName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutParametersOutUnitCategoryGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutParametersOutUsrCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutParametersOutUsrGlLevel" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutParametersOutUsrPassword" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutProofLoggedUserCashTillNo" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutRemainIefSuppliedCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutUnitRateTableCategoryGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutUnsuccessfullLoginIefSuppliedActionEntryDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutUnsuccessfullLoginIefSuppliedSrvStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpAgrTrx" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}ArrayOfL0705VOutGrpAgrTrxItem" minOccurs="0"/>
 *         &lt;element name="OutGrpCisTrx" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}ArrayOfL0705VOutGrpCisTrxItem" minOccurs="0"/>
 *         &lt;element name="OutGrpDepTrx" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}ArrayOfL0705VOutGrpDepTrxItem" minOccurs="0"/>
 *         &lt;element name="OutGrpFtTrx" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}ArrayOfL0705VOutGrpFtTrxItem" minOccurs="0"/>
 *         &lt;element name="OutGrpFxTrx" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}ArrayOfL0705VOutGrpFxTrxItem" minOccurs="0"/>
 *         &lt;element name="OutGrpLnsTrx" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}ArrayOfL0705VOutGrpLnsTrxItem" minOccurs="0"/>
 *         &lt;element name="OutGrpPrfTrx" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}ArrayOfL0705VOutGrpPrfTrxItem" minOccurs="0"/>
 *         &lt;element name="OutGrpSystem" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}ArrayOfL0705VOutGrpSystemItem" minOccurs="0"/>
 *         &lt;element name="OutGrpTppTrx" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}ArrayOfL0705VOutGrpTppTrxItem" minOccurs="0"/>
 *         &lt;element name="OutGrpUwTrx" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}ArrayOfL0705VOutGrpUwTrxItem" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "L0705V_LoginUserExport", propOrder = {
    "outCanamParmsFilename",
    "outCollaborationBanksAchBankCode",
    "outCollaborationBanksChqCdAlgUsed",
    "outExpirationIefSuppliedActionEntryDesc",
    "outExpirationIefSuppliedSrvStatus",
    "outIefSuppliedActionEntry",
    "outIefSuppliedCommand",
    "outIefSuppliedSrvStatus",
    "outLogPathGenericDetailDescription",
    "outLoginIefSuppliedCommand",
    "outParametersOutBankParametersAddress",
    "outParametersOutBankParametersBankCode",
    "outParametersOutBankParametersBankName",
    "outParametersOutBankParametersConstTblCurrency",
    "outParametersOutBankParametersCurrTrxDate",
    "outParametersOutBankParametersDomesticCurrency",
    "outParametersOutBankParametersEncryptFlg",
    "outParametersOutBankParametersEuroEchoDesc",
    "outParametersOutBankParametersIbanFlag",
    "outParametersOutBankParametersLoginUnitFlg",
    "outParametersOutBankParametersMaxAmntRateTbl",
    "outParametersOutBankParametersMaxAmntSrs",
    "outParametersOutBankParametersRateTblCurrency",
    "outParametersOutBankParametersRateUsage",
    "outParametersOutBankParametersTaxRegNo",
    "outParametersOutBankemployeeFirstName",
    "outParametersOutBankemployeeLastName",
    "outParametersOutDistrChannelIdChannel",
    "outParametersOutProfile1UnitCategoryPerRoleId",
    "outParametersOutProfile1UnitCategoryPerRolePtjCheckOvercome",
    "outParametersOutProfile2UnitCategoryPerRoleId",
    "outParametersOutProfile2UnitCategoryPerRolePtjCheckOvercome",
    "outParametersOutProfile3UnitCategoryPerRoleId",
    "outParametersOutProfile3UnitCategoryPerRolePtjCheckOvercome",
    "outParametersOutTerminalTerminalNumber",
    "outParametersOutTrxCountTrxCounter",
    "outParametersOutUnitClearingHouseFlag",
    "outParametersOutUnitCode",
    "outParametersOutUnitHldWorkPermit",
    "outParametersOutUnitUnitName",
    "outParametersOutUnitCategoryGenericDetailSerialNum",
    "outParametersOutUsrCode",
    "outParametersOutUsrGlLevel",
    "outParametersOutUsrPassword",
    "outProofLoggedUserCashTillNo",
    "outRemainIefSuppliedCount",
    "outUnitRateTableCategoryGenericDetailSerialNum",
    "outUnsuccessfullLoginIefSuppliedActionEntryDesc",
    "outUnsuccessfullLoginIefSuppliedSrvStatus",
    "outGrpAgrTrx",
    "outGrpCisTrx",
    "outGrpDepTrx",
    "outGrpFtTrx",
    "outGrpFxTrx",
    "outGrpLnsTrx",
    "outGrpPrfTrx",
    "outGrpSystem",
    "outGrpTppTrx",
    "outGrpUwTrx"
})
public class L0705VLoginUserExport
    extends BaseExport
{

    @XmlElement(name = "OutCanamParmsFilename")
    protected String outCanamParmsFilename;
    @XmlElement(name = "OutCollaborationBanksAchBankCode")
    protected String outCollaborationBanksAchBankCode;
    @XmlElement(name = "OutCollaborationBanksChqCdAlgUsed")
    protected String outCollaborationBanksChqCdAlgUsed;
    @XmlElement(name = "OutExpirationIefSuppliedActionEntryDesc")
    protected String outExpirationIefSuppliedActionEntryDesc;
    @XmlElement(name = "OutExpirationIefSuppliedSrvStatus")
    protected String outExpirationIefSuppliedSrvStatus;
    @XmlElement(name = "OutIefSuppliedActionEntry")
    protected String outIefSuppliedActionEntry;
    @XmlElement(name = "OutIefSuppliedCommand")
    protected String outIefSuppliedCommand;
    @XmlElement(name = "OutIefSuppliedSrvStatus")
    protected String outIefSuppliedSrvStatus;
    @XmlElement(name = "OutLogPathGenericDetailDescription")
    protected String outLogPathGenericDetailDescription;
    @XmlElement(name = "OutLoginIefSuppliedCommand")
    protected String outLoginIefSuppliedCommand;
    @XmlElement(name = "OutParametersOutBankParametersAddress")
    protected String outParametersOutBankParametersAddress;
    @XmlElement(name = "OutParametersOutBankParametersBankCode")
    protected short outParametersOutBankParametersBankCode;
    @XmlElement(name = "OutParametersOutBankParametersBankName")
    protected String outParametersOutBankParametersBankName;
    @XmlElement(name = "OutParametersOutBankParametersConstTblCurrency")
    protected String outParametersOutBankParametersConstTblCurrency;
    @XmlElement(name = "OutParametersOutBankParametersCurrTrxDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outParametersOutBankParametersCurrTrxDate;
    @XmlElement(name = "OutParametersOutBankParametersDomesticCurrency")
    protected String outParametersOutBankParametersDomesticCurrency;
    @XmlElement(name = "OutParametersOutBankParametersEncryptFlg")
    protected String outParametersOutBankParametersEncryptFlg;
    @XmlElement(name = "OutParametersOutBankParametersEuroEchoDesc")
    protected String outParametersOutBankParametersEuroEchoDesc;
    @XmlElement(name = "OutParametersOutBankParametersIbanFlag")
    protected String outParametersOutBankParametersIbanFlag;
    @XmlElement(name = "OutParametersOutBankParametersLoginUnitFlg")
    protected String outParametersOutBankParametersLoginUnitFlg;
    @XmlElement(name = "OutParametersOutBankParametersMaxAmntRateTbl", required = true)
    protected BigDecimal outParametersOutBankParametersMaxAmntRateTbl;
    @XmlElement(name = "OutParametersOutBankParametersMaxAmntSrs", required = true)
    protected BigDecimal outParametersOutBankParametersMaxAmntSrs;
    @XmlElement(name = "OutParametersOutBankParametersRateTblCurrency")
    protected String outParametersOutBankParametersRateTblCurrency;
    @XmlElement(name = "OutParametersOutBankParametersRateUsage")
    protected String outParametersOutBankParametersRateUsage;
    @XmlElement(name = "OutParametersOutBankParametersTaxRegNo")
    protected String outParametersOutBankParametersTaxRegNo;
    @XmlElement(name = "OutParametersOutBankemployeeFirstName")
    protected String outParametersOutBankemployeeFirstName;
    @XmlElement(name = "OutParametersOutBankemployeeLastName")
    protected String outParametersOutBankemployeeLastName;
    @XmlElement(name = "OutParametersOutDistrChannelIdChannel")
    protected int outParametersOutDistrChannelIdChannel;
    @XmlElement(name = "OutParametersOutProfile1UnitCategoryPerRoleId")
    protected String outParametersOutProfile1UnitCategoryPerRoleId;
    @XmlElement(name = "OutParametersOutProfile1UnitCategoryPerRolePtjCheckOvercome")
    protected String outParametersOutProfile1UnitCategoryPerRolePtjCheckOvercome;
    @XmlElement(name = "OutParametersOutProfile2UnitCategoryPerRoleId")
    protected String outParametersOutProfile2UnitCategoryPerRoleId;
    @XmlElement(name = "OutParametersOutProfile2UnitCategoryPerRolePtjCheckOvercome")
    protected String outParametersOutProfile2UnitCategoryPerRolePtjCheckOvercome;
    @XmlElement(name = "OutParametersOutProfile3UnitCategoryPerRoleId")
    protected String outParametersOutProfile3UnitCategoryPerRoleId;
    @XmlElement(name = "OutParametersOutProfile3UnitCategoryPerRolePtjCheckOvercome")
    protected String outParametersOutProfile3UnitCategoryPerRolePtjCheckOvercome;
    @XmlElement(name = "OutParametersOutTerminalTerminalNumber")
    protected String outParametersOutTerminalTerminalNumber;
    @XmlElement(name = "OutParametersOutTrxCountTrxCounter")
    protected int outParametersOutTrxCountTrxCounter;
    @XmlElement(name = "OutParametersOutUnitClearingHouseFlag")
    protected String outParametersOutUnitClearingHouseFlag;
    @XmlElement(name = "OutParametersOutUnitCode")
    protected int outParametersOutUnitCode;
    @XmlElement(name = "OutParametersOutUnitHldWorkPermit")
    protected String outParametersOutUnitHldWorkPermit;
    @XmlElement(name = "OutParametersOutUnitUnitName")
    protected String outParametersOutUnitUnitName;
    @XmlElement(name = "OutParametersOutUnitCategoryGenericDetailSerialNum")
    protected int outParametersOutUnitCategoryGenericDetailSerialNum;
    @XmlElement(name = "OutParametersOutUsrCode")
    protected String outParametersOutUsrCode;
    @XmlElement(name = "OutParametersOutUsrGlLevel")
    protected short outParametersOutUsrGlLevel;
    @XmlElement(name = "OutParametersOutUsrPassword")
    protected String outParametersOutUsrPassword;
    @XmlElement(name = "OutProofLoggedUserCashTillNo")
    protected int outProofLoggedUserCashTillNo;
    @XmlElement(name = "OutRemainIefSuppliedCount")
    protected int outRemainIefSuppliedCount;
    @XmlElement(name = "OutUnitRateTableCategoryGenericDetailSerialNum")
    protected int outUnitRateTableCategoryGenericDetailSerialNum;
    @XmlElement(name = "OutUnsuccessfullLoginIefSuppliedActionEntryDesc")
    protected String outUnsuccessfullLoginIefSuppliedActionEntryDesc;
    @XmlElement(name = "OutUnsuccessfullLoginIefSuppliedSrvStatus")
    protected String outUnsuccessfullLoginIefSuppliedSrvStatus;
    @XmlElement(name = "OutGrpAgrTrx")
    protected ArrayOfL0705VOutGrpAgrTrxItem outGrpAgrTrx;
    @XmlElement(name = "OutGrpCisTrx")
    protected ArrayOfL0705VOutGrpCisTrxItem outGrpCisTrx;
    @XmlElement(name = "OutGrpDepTrx")
    protected ArrayOfL0705VOutGrpDepTrxItem outGrpDepTrx;
    @XmlElement(name = "OutGrpFtTrx")
    protected ArrayOfL0705VOutGrpFtTrxItem outGrpFtTrx;
    @XmlElement(name = "OutGrpFxTrx")
    protected ArrayOfL0705VOutGrpFxTrxItem outGrpFxTrx;
    @XmlElement(name = "OutGrpLnsTrx")
    protected ArrayOfL0705VOutGrpLnsTrxItem outGrpLnsTrx;
    @XmlElement(name = "OutGrpPrfTrx")
    protected ArrayOfL0705VOutGrpPrfTrxItem outGrpPrfTrx;
    @XmlElement(name = "OutGrpSystem")
    protected ArrayOfL0705VOutGrpSystemItem outGrpSystem;
    @XmlElement(name = "OutGrpTppTrx")
    protected ArrayOfL0705VOutGrpTppTrxItem outGrpTppTrx;
    @XmlElement(name = "OutGrpUwTrx")
    protected ArrayOfL0705VOutGrpUwTrxItem outGrpUwTrx;

    /**
     * Gets the value of the outCanamParmsFilename property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCanamParmsFilename() {
        return outCanamParmsFilename;
    }

    /**
     * Sets the value of the outCanamParmsFilename property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCanamParmsFilename(String value) {
        this.outCanamParmsFilename = value;
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
     * Gets the value of the outExpirationIefSuppliedActionEntryDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutExpirationIefSuppliedActionEntryDesc() {
        return outExpirationIefSuppliedActionEntryDesc;
    }

    /**
     * Sets the value of the outExpirationIefSuppliedActionEntryDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutExpirationIefSuppliedActionEntryDesc(String value) {
        this.outExpirationIefSuppliedActionEntryDesc = value;
    }

    /**
     * Gets the value of the outExpirationIefSuppliedSrvStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutExpirationIefSuppliedSrvStatus() {
        return outExpirationIefSuppliedSrvStatus;
    }

    /**
     * Sets the value of the outExpirationIefSuppliedSrvStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutExpirationIefSuppliedSrvStatus(String value) {
        this.outExpirationIefSuppliedSrvStatus = value;
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
     * Gets the value of the outIefSuppliedCommand property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutIefSuppliedCommand() {
        return outIefSuppliedCommand;
    }

    /**
     * Sets the value of the outIefSuppliedCommand property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutIefSuppliedCommand(String value) {
        this.outIefSuppliedCommand = value;
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
     * Gets the value of the outLogPathGenericDetailDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutLogPathGenericDetailDescription() {
        return outLogPathGenericDetailDescription;
    }

    /**
     * Sets the value of the outLogPathGenericDetailDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutLogPathGenericDetailDescription(String value) {
        this.outLogPathGenericDetailDescription = value;
    }

    /**
     * Gets the value of the outLoginIefSuppliedCommand property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutLoginIefSuppliedCommand() {
        return outLoginIefSuppliedCommand;
    }

    /**
     * Sets the value of the outLoginIefSuppliedCommand property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutLoginIefSuppliedCommand(String value) {
        this.outLoginIefSuppliedCommand = value;
    }

    /**
     * Gets the value of the outParametersOutBankParametersAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutParametersOutBankParametersAddress() {
        return outParametersOutBankParametersAddress;
    }

    /**
     * Sets the value of the outParametersOutBankParametersAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutParametersOutBankParametersAddress(String value) {
        this.outParametersOutBankParametersAddress = value;
    }

    /**
     * Gets the value of the outParametersOutBankParametersBankCode property.
     * 
     */
    public short getOutParametersOutBankParametersBankCode() {
        return outParametersOutBankParametersBankCode;
    }

    /**
     * Sets the value of the outParametersOutBankParametersBankCode property.
     * 
     */
    public void setOutParametersOutBankParametersBankCode(short value) {
        this.outParametersOutBankParametersBankCode = value;
    }

    /**
     * Gets the value of the outParametersOutBankParametersBankName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutParametersOutBankParametersBankName() {
        return outParametersOutBankParametersBankName;
    }

    /**
     * Sets the value of the outParametersOutBankParametersBankName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutParametersOutBankParametersBankName(String value) {
        this.outParametersOutBankParametersBankName = value;
    }

    /**
     * Gets the value of the outParametersOutBankParametersConstTblCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutParametersOutBankParametersConstTblCurrency() {
        return outParametersOutBankParametersConstTblCurrency;
    }

    /**
     * Sets the value of the outParametersOutBankParametersConstTblCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutParametersOutBankParametersConstTblCurrency(String value) {
        this.outParametersOutBankParametersConstTblCurrency = value;
    }

    /**
     * Gets the value of the outParametersOutBankParametersCurrTrxDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutParametersOutBankParametersCurrTrxDate() {
        return outParametersOutBankParametersCurrTrxDate;
    }

    /**
     * Sets the value of the outParametersOutBankParametersCurrTrxDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutParametersOutBankParametersCurrTrxDate(XMLGregorianCalendar value) {
        this.outParametersOutBankParametersCurrTrxDate = value;
    }

    /**
     * Gets the value of the outParametersOutBankParametersDomesticCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutParametersOutBankParametersDomesticCurrency() {
        return outParametersOutBankParametersDomesticCurrency;
    }

    /**
     * Sets the value of the outParametersOutBankParametersDomesticCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutParametersOutBankParametersDomesticCurrency(String value) {
        this.outParametersOutBankParametersDomesticCurrency = value;
    }

    /**
     * Gets the value of the outParametersOutBankParametersEncryptFlg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutParametersOutBankParametersEncryptFlg() {
        return outParametersOutBankParametersEncryptFlg;
    }

    /**
     * Sets the value of the outParametersOutBankParametersEncryptFlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutParametersOutBankParametersEncryptFlg(String value) {
        this.outParametersOutBankParametersEncryptFlg = value;
    }

    /**
     * Gets the value of the outParametersOutBankParametersEuroEchoDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutParametersOutBankParametersEuroEchoDesc() {
        return outParametersOutBankParametersEuroEchoDesc;
    }

    /**
     * Sets the value of the outParametersOutBankParametersEuroEchoDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutParametersOutBankParametersEuroEchoDesc(String value) {
        this.outParametersOutBankParametersEuroEchoDesc = value;
    }

    /**
     * Gets the value of the outParametersOutBankParametersIbanFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutParametersOutBankParametersIbanFlag() {
        return outParametersOutBankParametersIbanFlag;
    }

    /**
     * Sets the value of the outParametersOutBankParametersIbanFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutParametersOutBankParametersIbanFlag(String value) {
        this.outParametersOutBankParametersIbanFlag = value;
    }

    /**
     * Gets the value of the outParametersOutBankParametersLoginUnitFlg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutParametersOutBankParametersLoginUnitFlg() {
        return outParametersOutBankParametersLoginUnitFlg;
    }

    /**
     * Sets the value of the outParametersOutBankParametersLoginUnitFlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutParametersOutBankParametersLoginUnitFlg(String value) {
        this.outParametersOutBankParametersLoginUnitFlg = value;
    }

    /**
     * Gets the value of the outParametersOutBankParametersMaxAmntRateTbl property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutParametersOutBankParametersMaxAmntRateTbl() {
        return outParametersOutBankParametersMaxAmntRateTbl;
    }

    /**
     * Sets the value of the outParametersOutBankParametersMaxAmntRateTbl property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutParametersOutBankParametersMaxAmntRateTbl(BigDecimal value) {
        this.outParametersOutBankParametersMaxAmntRateTbl = value;
    }

    /**
     * Gets the value of the outParametersOutBankParametersMaxAmntSrs property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutParametersOutBankParametersMaxAmntSrs() {
        return outParametersOutBankParametersMaxAmntSrs;
    }

    /**
     * Sets the value of the outParametersOutBankParametersMaxAmntSrs property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutParametersOutBankParametersMaxAmntSrs(BigDecimal value) {
        this.outParametersOutBankParametersMaxAmntSrs = value;
    }

    /**
     * Gets the value of the outParametersOutBankParametersRateTblCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutParametersOutBankParametersRateTblCurrency() {
        return outParametersOutBankParametersRateTblCurrency;
    }

    /**
     * Sets the value of the outParametersOutBankParametersRateTblCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutParametersOutBankParametersRateTblCurrency(String value) {
        this.outParametersOutBankParametersRateTblCurrency = value;
    }

    /**
     * Gets the value of the outParametersOutBankParametersRateUsage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutParametersOutBankParametersRateUsage() {
        return outParametersOutBankParametersRateUsage;
    }

    /**
     * Sets the value of the outParametersOutBankParametersRateUsage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutParametersOutBankParametersRateUsage(String value) {
        this.outParametersOutBankParametersRateUsage = value;
    }

    /**
     * Gets the value of the outParametersOutBankParametersTaxRegNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutParametersOutBankParametersTaxRegNo() {
        return outParametersOutBankParametersTaxRegNo;
    }

    /**
     * Sets the value of the outParametersOutBankParametersTaxRegNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutParametersOutBankParametersTaxRegNo(String value) {
        this.outParametersOutBankParametersTaxRegNo = value;
    }

    /**
     * Gets the value of the outParametersOutBankemployeeFirstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutParametersOutBankemployeeFirstName() {
        return outParametersOutBankemployeeFirstName;
    }

    /**
     * Sets the value of the outParametersOutBankemployeeFirstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutParametersOutBankemployeeFirstName(String value) {
        this.outParametersOutBankemployeeFirstName = value;
    }

    /**
     * Gets the value of the outParametersOutBankemployeeLastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutParametersOutBankemployeeLastName() {
        return outParametersOutBankemployeeLastName;
    }

    /**
     * Sets the value of the outParametersOutBankemployeeLastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutParametersOutBankemployeeLastName(String value) {
        this.outParametersOutBankemployeeLastName = value;
    }

    /**
     * Gets the value of the outParametersOutDistrChannelIdChannel property.
     * 
     */
    public int getOutParametersOutDistrChannelIdChannel() {
        return outParametersOutDistrChannelIdChannel;
    }

    /**
     * Sets the value of the outParametersOutDistrChannelIdChannel property.
     * 
     */
    public void setOutParametersOutDistrChannelIdChannel(int value) {
        this.outParametersOutDistrChannelIdChannel = value;
    }

    /**
     * Gets the value of the outParametersOutProfile1UnitCategoryPerRoleId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutParametersOutProfile1UnitCategoryPerRoleId() {
        return outParametersOutProfile1UnitCategoryPerRoleId;
    }

    /**
     * Sets the value of the outParametersOutProfile1UnitCategoryPerRoleId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutParametersOutProfile1UnitCategoryPerRoleId(String value) {
        this.outParametersOutProfile1UnitCategoryPerRoleId = value;
    }

    /**
     * Gets the value of the outParametersOutProfile1UnitCategoryPerRolePtjCheckOvercome property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutParametersOutProfile1UnitCategoryPerRolePtjCheckOvercome() {
        return outParametersOutProfile1UnitCategoryPerRolePtjCheckOvercome;
    }

    /**
     * Sets the value of the outParametersOutProfile1UnitCategoryPerRolePtjCheckOvercome property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutParametersOutProfile1UnitCategoryPerRolePtjCheckOvercome(String value) {
        this.outParametersOutProfile1UnitCategoryPerRolePtjCheckOvercome = value;
    }

    /**
     * Gets the value of the outParametersOutProfile2UnitCategoryPerRoleId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutParametersOutProfile2UnitCategoryPerRoleId() {
        return outParametersOutProfile2UnitCategoryPerRoleId;
    }

    /**
     * Sets the value of the outParametersOutProfile2UnitCategoryPerRoleId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutParametersOutProfile2UnitCategoryPerRoleId(String value) {
        this.outParametersOutProfile2UnitCategoryPerRoleId = value;
    }

    /**
     * Gets the value of the outParametersOutProfile2UnitCategoryPerRolePtjCheckOvercome property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutParametersOutProfile2UnitCategoryPerRolePtjCheckOvercome() {
        return outParametersOutProfile2UnitCategoryPerRolePtjCheckOvercome;
    }

    /**
     * Sets the value of the outParametersOutProfile2UnitCategoryPerRolePtjCheckOvercome property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutParametersOutProfile2UnitCategoryPerRolePtjCheckOvercome(String value) {
        this.outParametersOutProfile2UnitCategoryPerRolePtjCheckOvercome = value;
    }

    /**
     * Gets the value of the outParametersOutProfile3UnitCategoryPerRoleId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutParametersOutProfile3UnitCategoryPerRoleId() {
        return outParametersOutProfile3UnitCategoryPerRoleId;
    }

    /**
     * Sets the value of the outParametersOutProfile3UnitCategoryPerRoleId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutParametersOutProfile3UnitCategoryPerRoleId(String value) {
        this.outParametersOutProfile3UnitCategoryPerRoleId = value;
    }

    /**
     * Gets the value of the outParametersOutProfile3UnitCategoryPerRolePtjCheckOvercome property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutParametersOutProfile3UnitCategoryPerRolePtjCheckOvercome() {
        return outParametersOutProfile3UnitCategoryPerRolePtjCheckOvercome;
    }

    /**
     * Sets the value of the outParametersOutProfile3UnitCategoryPerRolePtjCheckOvercome property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutParametersOutProfile3UnitCategoryPerRolePtjCheckOvercome(String value) {
        this.outParametersOutProfile3UnitCategoryPerRolePtjCheckOvercome = value;
    }

    /**
     * Gets the value of the outParametersOutTerminalTerminalNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutParametersOutTerminalTerminalNumber() {
        return outParametersOutTerminalTerminalNumber;
    }

    /**
     * Sets the value of the outParametersOutTerminalTerminalNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutParametersOutTerminalTerminalNumber(String value) {
        this.outParametersOutTerminalTerminalNumber = value;
    }

    /**
     * Gets the value of the outParametersOutTrxCountTrxCounter property.
     * 
     */
    public int getOutParametersOutTrxCountTrxCounter() {
        return outParametersOutTrxCountTrxCounter;
    }

    /**
     * Sets the value of the outParametersOutTrxCountTrxCounter property.
     * 
     */
    public void setOutParametersOutTrxCountTrxCounter(int value) {
        this.outParametersOutTrxCountTrxCounter = value;
    }

    /**
     * Gets the value of the outParametersOutUnitClearingHouseFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutParametersOutUnitClearingHouseFlag() {
        return outParametersOutUnitClearingHouseFlag;
    }

    /**
     * Sets the value of the outParametersOutUnitClearingHouseFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutParametersOutUnitClearingHouseFlag(String value) {
        this.outParametersOutUnitClearingHouseFlag = value;
    }

    /**
     * Gets the value of the outParametersOutUnitCode property.
     * 
     */
    public int getOutParametersOutUnitCode() {
        return outParametersOutUnitCode;
    }

    /**
     * Sets the value of the outParametersOutUnitCode property.
     * 
     */
    public void setOutParametersOutUnitCode(int value) {
        this.outParametersOutUnitCode = value;
    }

    /**
     * Gets the value of the outParametersOutUnitHldWorkPermit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutParametersOutUnitHldWorkPermit() {
        return outParametersOutUnitHldWorkPermit;
    }

    /**
     * Sets the value of the outParametersOutUnitHldWorkPermit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutParametersOutUnitHldWorkPermit(String value) {
        this.outParametersOutUnitHldWorkPermit = value;
    }

    /**
     * Gets the value of the outParametersOutUnitUnitName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutParametersOutUnitUnitName() {
        return outParametersOutUnitUnitName;
    }

    /**
     * Sets the value of the outParametersOutUnitUnitName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutParametersOutUnitUnitName(String value) {
        this.outParametersOutUnitUnitName = value;
    }

    /**
     * Gets the value of the outParametersOutUnitCategoryGenericDetailSerialNum property.
     * 
     */
    public int getOutParametersOutUnitCategoryGenericDetailSerialNum() {
        return outParametersOutUnitCategoryGenericDetailSerialNum;
    }

    /**
     * Sets the value of the outParametersOutUnitCategoryGenericDetailSerialNum property.
     * 
     */
    public void setOutParametersOutUnitCategoryGenericDetailSerialNum(int value) {
        this.outParametersOutUnitCategoryGenericDetailSerialNum = value;
    }

    /**
     * Gets the value of the outParametersOutUsrCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutParametersOutUsrCode() {
        return outParametersOutUsrCode;
    }

    /**
     * Sets the value of the outParametersOutUsrCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutParametersOutUsrCode(String value) {
        this.outParametersOutUsrCode = value;
    }

    /**
     * Gets the value of the outParametersOutUsrGlLevel property.
     * 
     */
    public short getOutParametersOutUsrGlLevel() {
        return outParametersOutUsrGlLevel;
    }

    /**
     * Sets the value of the outParametersOutUsrGlLevel property.
     * 
     */
    public void setOutParametersOutUsrGlLevel(short value) {
        this.outParametersOutUsrGlLevel = value;
    }

    /**
     * Gets the value of the outParametersOutUsrPassword property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutParametersOutUsrPassword() {
        return outParametersOutUsrPassword;
    }

    /**
     * Sets the value of the outParametersOutUsrPassword property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutParametersOutUsrPassword(String value) {
        this.outParametersOutUsrPassword = value;
    }

    /**
     * Gets the value of the outProofLoggedUserCashTillNo property.
     * 
     */
    public int getOutProofLoggedUserCashTillNo() {
        return outProofLoggedUserCashTillNo;
    }

    /**
     * Sets the value of the outProofLoggedUserCashTillNo property.
     * 
     */
    public void setOutProofLoggedUserCashTillNo(int value) {
        this.outProofLoggedUserCashTillNo = value;
    }

    /**
     * Gets the value of the outRemainIefSuppliedCount property.
     * 
     */
    public int getOutRemainIefSuppliedCount() {
        return outRemainIefSuppliedCount;
    }

    /**
     * Sets the value of the outRemainIefSuppliedCount property.
     * 
     */
    public void setOutRemainIefSuppliedCount(int value) {
        this.outRemainIefSuppliedCount = value;
    }

    /**
     * Gets the value of the outUnitRateTableCategoryGenericDetailSerialNum property.
     * 
     */
    public int getOutUnitRateTableCategoryGenericDetailSerialNum() {
        return outUnitRateTableCategoryGenericDetailSerialNum;
    }

    /**
     * Sets the value of the outUnitRateTableCategoryGenericDetailSerialNum property.
     * 
     */
    public void setOutUnitRateTableCategoryGenericDetailSerialNum(int value) {
        this.outUnitRateTableCategoryGenericDetailSerialNum = value;
    }

    /**
     * Gets the value of the outUnsuccessfullLoginIefSuppliedActionEntryDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutUnsuccessfullLoginIefSuppliedActionEntryDesc() {
        return outUnsuccessfullLoginIefSuppliedActionEntryDesc;
    }

    /**
     * Sets the value of the outUnsuccessfullLoginIefSuppliedActionEntryDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutUnsuccessfullLoginIefSuppliedActionEntryDesc(String value) {
        this.outUnsuccessfullLoginIefSuppliedActionEntryDesc = value;
    }

    /**
     * Gets the value of the outUnsuccessfullLoginIefSuppliedSrvStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutUnsuccessfullLoginIefSuppliedSrvStatus() {
        return outUnsuccessfullLoginIefSuppliedSrvStatus;
    }

    /**
     * Sets the value of the outUnsuccessfullLoginIefSuppliedSrvStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutUnsuccessfullLoginIefSuppliedSrvStatus(String value) {
        this.outUnsuccessfullLoginIefSuppliedSrvStatus = value;
    }

    /**
     * Gets the value of the outGrpAgrTrx property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfL0705VOutGrpAgrTrxItem }
     *     
     */
    public ArrayOfL0705VOutGrpAgrTrxItem getOutGrpAgrTrx() {
        return outGrpAgrTrx;
    }

    /**
     * Sets the value of the outGrpAgrTrx property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfL0705VOutGrpAgrTrxItem }
     *     
     */
    public void setOutGrpAgrTrx(ArrayOfL0705VOutGrpAgrTrxItem value) {
        this.outGrpAgrTrx = value;
    }

    /**
     * Gets the value of the outGrpCisTrx property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfL0705VOutGrpCisTrxItem }
     *     
     */
    public ArrayOfL0705VOutGrpCisTrxItem getOutGrpCisTrx() {
        return outGrpCisTrx;
    }

    /**
     * Sets the value of the outGrpCisTrx property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfL0705VOutGrpCisTrxItem }
     *     
     */
    public void setOutGrpCisTrx(ArrayOfL0705VOutGrpCisTrxItem value) {
        this.outGrpCisTrx = value;
    }

    /**
     * Gets the value of the outGrpDepTrx property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfL0705VOutGrpDepTrxItem }
     *     
     */
    public ArrayOfL0705VOutGrpDepTrxItem getOutGrpDepTrx() {
        return outGrpDepTrx;
    }

    /**
     * Sets the value of the outGrpDepTrx property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfL0705VOutGrpDepTrxItem }
     *     
     */
    public void setOutGrpDepTrx(ArrayOfL0705VOutGrpDepTrxItem value) {
        this.outGrpDepTrx = value;
    }

    /**
     * Gets the value of the outGrpFtTrx property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfL0705VOutGrpFtTrxItem }
     *     
     */
    public ArrayOfL0705VOutGrpFtTrxItem getOutGrpFtTrx() {
        return outGrpFtTrx;
    }

    /**
     * Sets the value of the outGrpFtTrx property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfL0705VOutGrpFtTrxItem }
     *     
     */
    public void setOutGrpFtTrx(ArrayOfL0705VOutGrpFtTrxItem value) {
        this.outGrpFtTrx = value;
    }

    /**
     * Gets the value of the outGrpFxTrx property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfL0705VOutGrpFxTrxItem }
     *     
     */
    public ArrayOfL0705VOutGrpFxTrxItem getOutGrpFxTrx() {
        return outGrpFxTrx;
    }

    /**
     * Sets the value of the outGrpFxTrx property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfL0705VOutGrpFxTrxItem }
     *     
     */
    public void setOutGrpFxTrx(ArrayOfL0705VOutGrpFxTrxItem value) {
        this.outGrpFxTrx = value;
    }

    /**
     * Gets the value of the outGrpLnsTrx property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfL0705VOutGrpLnsTrxItem }
     *     
     */
    public ArrayOfL0705VOutGrpLnsTrxItem getOutGrpLnsTrx() {
        return outGrpLnsTrx;
    }

    /**
     * Sets the value of the outGrpLnsTrx property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfL0705VOutGrpLnsTrxItem }
     *     
     */
    public void setOutGrpLnsTrx(ArrayOfL0705VOutGrpLnsTrxItem value) {
        this.outGrpLnsTrx = value;
    }

    /**
     * Gets the value of the outGrpPrfTrx property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfL0705VOutGrpPrfTrxItem }
     *     
     */
    public ArrayOfL0705VOutGrpPrfTrxItem getOutGrpPrfTrx() {
        return outGrpPrfTrx;
    }

    /**
     * Sets the value of the outGrpPrfTrx property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfL0705VOutGrpPrfTrxItem }
     *     
     */
    public void setOutGrpPrfTrx(ArrayOfL0705VOutGrpPrfTrxItem value) {
        this.outGrpPrfTrx = value;
    }

    /**
     * Gets the value of the outGrpSystem property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfL0705VOutGrpSystemItem }
     *     
     */
    public ArrayOfL0705VOutGrpSystemItem getOutGrpSystem() {
        return outGrpSystem;
    }

    /**
     * Sets the value of the outGrpSystem property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfL0705VOutGrpSystemItem }
     *     
     */
    public void setOutGrpSystem(ArrayOfL0705VOutGrpSystemItem value) {
        this.outGrpSystem = value;
    }

    /**
     * Gets the value of the outGrpTppTrx property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfL0705VOutGrpTppTrxItem }
     *     
     */
    public ArrayOfL0705VOutGrpTppTrxItem getOutGrpTppTrx() {
        return outGrpTppTrx;
    }

    /**
     * Sets the value of the outGrpTppTrx property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfL0705VOutGrpTppTrxItem }
     *     
     */
    public void setOutGrpTppTrx(ArrayOfL0705VOutGrpTppTrxItem value) {
        this.outGrpTppTrx = value;
    }

    /**
     * Gets the value of the outGrpUwTrx property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfL0705VOutGrpUwTrxItem }
     *     
     */
    public ArrayOfL0705VOutGrpUwTrxItem getOutGrpUwTrx() {
        return outGrpUwTrx;
    }

    /**
     * Sets the value of the outGrpUwTrx property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfL0705VOutGrpUwTrxItem }
     *     
     */
    public void setOutGrpUwTrx(ArrayOfL0705VOutGrpUwTrxItem value) {
        this.outGrpUwTrx = value;
    }

}
