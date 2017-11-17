
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for P0831VStrongRoomVaultManipulationExport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="P0831VStrongRoomVaultManipulationExport">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}BaseExport">
 *       &lt;sequence>
 *         &lt;element name="OutAccMovementCurrencyShortDescr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutContinueIefSuppliedNum6" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutCustListSetDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustomerCDigit" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutCustomerCustId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutCustomerCustType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutItemResponsibleUsrVaultWorkBankemployeeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutLogTrxBankemployeeVaultWorkBankemployeeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutLogTrxUnitCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutLogTrxUnitUnitName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutLogVaultBankemployeeVaultWorkBankemployeeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutLogVaultUnitCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutLogVaultUnitUnitName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutProcessedVaultItemAccountCd" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutProcessedVaultItemCheckedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutProcessedVaultItemCustId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutProcessedVaultItemEntryStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutProcessedVaultItemInsertDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutProcessedVaultItemInsertUnit" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutProcessedVaultItemInsertUser" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutProcessedVaultItemInsertedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutProcessedVaultItemItemDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutProcessedVaultItemItemDetails" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutProcessedVaultItemItemStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutProcessedVaultItemItemValue" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutProcessedVaultItemProfitsAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutProcessedVaultItemProfitsSystem" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutProcessedVaultItemRemovalDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutProcessedVaultItemResponsibleUser" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutProcessedVaultItemReturnedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutProcessedVaultItemSn" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OutProcessedVaultItemTmstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutProcessedVaultItemUpdateDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutProcessedVaultItemUpdateUnit" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutProcessedVaultItemUpdateUser" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutProcessedVaultItemVaultLocation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutProcessedVaultItemVaultUnit" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutSelectedVaultItemAccountCd" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutSelectedVaultItemCheckedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutSelectedVaultItemCustId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutSelectedVaultItemEntryStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSelectedVaultItemInsertDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutSelectedVaultItemInsertUnit" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutSelectedVaultItemInsertUser" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSelectedVaultItemInsertedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutSelectedVaultItemItemDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSelectedVaultItemItemDetails" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSelectedVaultItemItemStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSelectedVaultItemItemValue" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutSelectedVaultItemProfitsAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSelectedVaultItemProfitsSystem" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutSelectedVaultItemRemovalDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutSelectedVaultItemResponsibleUser" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSelectedVaultItemReturnedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutSelectedVaultItemSn" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OutSelectedVaultItemTmstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutSelectedVaultItemUpdateDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutSelectedVaultItemUpdateUnit" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutSelectedVaultItemUpdateUser" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSelectedVaultItemVaultLocation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSelectedVaultItemVaultUnit" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutTeamInformationAuthorizationType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutTeamInformationEvaluationResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutTeamInformationRequiredProfile1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutTeamInformationRequiredProfile2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutVaultLogCashAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutVaultLogCashCurrency" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutVaultLogItemDaysInVault" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OutVaultLogItemDaysNotinVault" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OutVaultLogItemUser" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutVaultLogProcessDetail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutVaultLogProcessReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutVaultLogVaultAccessType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutVaultLogVaultItemSn" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OutVaultLogVaultTrxType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutVaultLogVaultUnit" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutVaultTotalAmntIefSuppliedAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpUnit" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}ArrayOfP0831VOutGrpUnitItem" minOccurs="0"/>
 *         &lt;element name="OutGrpVaultItem" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}ArrayOfP0831VOutGrpVaultItemItem" minOccurs="0"/>
 *         &lt;element name="OutGrpVaultLog" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}ArrayOfP0831VOutGrpVaultLogItem" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "P0831VStrongRoomVaultManipulationExport", propOrder = {
    "outAccMovementCurrencyShortDescr",
    "outContinueIefSuppliedNum6",
    "outCustListSetDescription",
    "outCustomerCDigit",
    "outCustomerCustId",
    "outCustomerCustType",
    "outItemResponsibleUsrVaultWorkBankemployeeName",
    "outLogTrxBankemployeeVaultWorkBankemployeeName",
    "outLogTrxUnitCode",
    "outLogTrxUnitUnitName",
    "outLogVaultBankemployeeVaultWorkBankemployeeName",
    "outLogVaultUnitCode",
    "outLogVaultUnitUnitName",
    "outProcessedVaultItemAccountCd",
    "outProcessedVaultItemCheckedDate",
    "outProcessedVaultItemCustId",
    "outProcessedVaultItemEntryStatus",
    "outProcessedVaultItemInsertDate",
    "outProcessedVaultItemInsertUnit",
    "outProcessedVaultItemInsertUser",
    "outProcessedVaultItemInsertedDate",
    "outProcessedVaultItemItemDescription",
    "outProcessedVaultItemItemDetails",
    "outProcessedVaultItemItemStatus",
    "outProcessedVaultItemItemValue",
    "outProcessedVaultItemProfitsAccount",
    "outProcessedVaultItemProfitsSystem",
    "outProcessedVaultItemRemovalDate",
    "outProcessedVaultItemResponsibleUser",
    "outProcessedVaultItemReturnedDate",
    "outProcessedVaultItemSn",
    "outProcessedVaultItemTmstamp",
    "outProcessedVaultItemUpdateDate",
    "outProcessedVaultItemUpdateUnit",
    "outProcessedVaultItemUpdateUser",
    "outProcessedVaultItemVaultLocation",
    "outProcessedVaultItemVaultUnit",
    "outSelectedVaultItemAccountCd",
    "outSelectedVaultItemCheckedDate",
    "outSelectedVaultItemCustId",
    "outSelectedVaultItemEntryStatus",
    "outSelectedVaultItemInsertDate",
    "outSelectedVaultItemInsertUnit",
    "outSelectedVaultItemInsertUser",
    "outSelectedVaultItemInsertedDate",
    "outSelectedVaultItemItemDescription",
    "outSelectedVaultItemItemDetails",
    "outSelectedVaultItemItemStatus",
    "outSelectedVaultItemItemValue",
    "outSelectedVaultItemProfitsAccount",
    "outSelectedVaultItemProfitsSystem",
    "outSelectedVaultItemRemovalDate",
    "outSelectedVaultItemResponsibleUser",
    "outSelectedVaultItemReturnedDate",
    "outSelectedVaultItemSn",
    "outSelectedVaultItemTmstamp",
    "outSelectedVaultItemUpdateDate",
    "outSelectedVaultItemUpdateUnit",
    "outSelectedVaultItemUpdateUser",
    "outSelectedVaultItemVaultLocation",
    "outSelectedVaultItemVaultUnit",
    "outTeamInformationAuthorizationType",
    "outTeamInformationEvaluationResult",
    "outTeamInformationRequiredProfile1",
    "outTeamInformationRequiredProfile2",
    "outVaultLogCashAmount",
    "outVaultLogCashCurrency",
    "outVaultLogItemDaysInVault",
    "outVaultLogItemDaysNotinVault",
    "outVaultLogItemUser",
    "outVaultLogProcessDetail",
    "outVaultLogProcessReason",
    "outVaultLogVaultAccessType",
    "outVaultLogVaultItemSn",
    "outVaultLogVaultTrxType",
    "outVaultLogVaultUnit",
    "outVaultTotalAmntIefSuppliedAmount",
    "outGrpUnit",
    "outGrpVaultItem",
    "outGrpVaultLog"
})
public class P0831VStrongRoomVaultManipulationExport
    extends BaseExport
{

    @XmlElement(name = "OutAccMovementCurrencyShortDescr")
    protected String outAccMovementCurrencyShortDescr;
    @XmlElement(name = "OutContinueIefSuppliedNum6")
    protected int outContinueIefSuppliedNum6;
    @XmlElement(name = "OutCustListSetDescription")
    protected String outCustListSetDescription;
    @XmlElement(name = "OutCustomerCDigit")
    protected short outCustomerCDigit;
    @XmlElement(name = "OutCustomerCustId")
    protected int outCustomerCustId;
    @XmlElement(name = "OutCustomerCustType")
    protected String outCustomerCustType;
    @XmlElement(name = "OutItemResponsibleUsrVaultWorkBankemployeeName")
    protected String outItemResponsibleUsrVaultWorkBankemployeeName;
    @XmlElement(name = "OutLogTrxBankemployeeVaultWorkBankemployeeName")
    protected String outLogTrxBankemployeeVaultWorkBankemployeeName;
    @XmlElement(name = "OutLogTrxUnitCode")
    protected int outLogTrxUnitCode;
    @XmlElement(name = "OutLogTrxUnitUnitName")
    protected String outLogTrxUnitUnitName;
    @XmlElement(name = "OutLogVaultBankemployeeVaultWorkBankemployeeName")
    protected String outLogVaultBankemployeeVaultWorkBankemployeeName;
    @XmlElement(name = "OutLogVaultUnitCode")
    protected int outLogVaultUnitCode;
    @XmlElement(name = "OutLogVaultUnitUnitName")
    protected String outLogVaultUnitUnitName;
    @XmlElement(name = "OutProcessedVaultItemAccountCd")
    protected short outProcessedVaultItemAccountCd;
    @XmlElement(name = "OutProcessedVaultItemCheckedDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outProcessedVaultItemCheckedDate;
    @XmlElement(name = "OutProcessedVaultItemCustId")
    protected int outProcessedVaultItemCustId;
    @XmlElement(name = "OutProcessedVaultItemEntryStatus")
    protected String outProcessedVaultItemEntryStatus;
    @XmlElement(name = "OutProcessedVaultItemInsertDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outProcessedVaultItemInsertDate;
    @XmlElement(name = "OutProcessedVaultItemInsertUnit")
    protected int outProcessedVaultItemInsertUnit;
    @XmlElement(name = "OutProcessedVaultItemInsertUser")
    protected String outProcessedVaultItemInsertUser;
    @XmlElement(name = "OutProcessedVaultItemInsertedDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outProcessedVaultItemInsertedDate;
    @XmlElement(name = "OutProcessedVaultItemItemDescription")
    protected String outProcessedVaultItemItemDescription;
    @XmlElement(name = "OutProcessedVaultItemItemDetails")
    protected String outProcessedVaultItemItemDetails;
    @XmlElement(name = "OutProcessedVaultItemItemStatus")
    protected String outProcessedVaultItemItemStatus;
    @XmlElement(name = "OutProcessedVaultItemItemValue", required = true)
    protected BigDecimal outProcessedVaultItemItemValue;
    @XmlElement(name = "OutProcessedVaultItemProfitsAccount")
    protected String outProcessedVaultItemProfitsAccount;
    @XmlElement(name = "OutProcessedVaultItemProfitsSystem")
    protected short outProcessedVaultItemProfitsSystem;
    @XmlElement(name = "OutProcessedVaultItemRemovalDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outProcessedVaultItemRemovalDate;
    @XmlElement(name = "OutProcessedVaultItemResponsibleUser")
    protected String outProcessedVaultItemResponsibleUser;
    @XmlElement(name = "OutProcessedVaultItemReturnedDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outProcessedVaultItemReturnedDate;
    @XmlElement(name = "OutProcessedVaultItemSn")
    protected double outProcessedVaultItemSn;
    @XmlElement(name = "OutProcessedVaultItemTmstamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outProcessedVaultItemTmstamp;
    @XmlElement(name = "OutProcessedVaultItemUpdateDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outProcessedVaultItemUpdateDate;
    @XmlElement(name = "OutProcessedVaultItemUpdateUnit")
    protected int outProcessedVaultItemUpdateUnit;
    @XmlElement(name = "OutProcessedVaultItemUpdateUser")
    protected String outProcessedVaultItemUpdateUser;
    @XmlElement(name = "OutProcessedVaultItemVaultLocation")
    protected String outProcessedVaultItemVaultLocation;
    @XmlElement(name = "OutProcessedVaultItemVaultUnit")
    protected int outProcessedVaultItemVaultUnit;
    @XmlElement(name = "OutSelectedVaultItemAccountCd")
    protected short outSelectedVaultItemAccountCd;
    @XmlElement(name = "OutSelectedVaultItemCheckedDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outSelectedVaultItemCheckedDate;
    @XmlElement(name = "OutSelectedVaultItemCustId")
    protected int outSelectedVaultItemCustId;
    @XmlElement(name = "OutSelectedVaultItemEntryStatus")
    protected String outSelectedVaultItemEntryStatus;
    @XmlElement(name = "OutSelectedVaultItemInsertDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outSelectedVaultItemInsertDate;
    @XmlElement(name = "OutSelectedVaultItemInsertUnit")
    protected int outSelectedVaultItemInsertUnit;
    @XmlElement(name = "OutSelectedVaultItemInsertUser")
    protected String outSelectedVaultItemInsertUser;
    @XmlElement(name = "OutSelectedVaultItemInsertedDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outSelectedVaultItemInsertedDate;
    @XmlElement(name = "OutSelectedVaultItemItemDescription")
    protected String outSelectedVaultItemItemDescription;
    @XmlElement(name = "OutSelectedVaultItemItemDetails")
    protected String outSelectedVaultItemItemDetails;
    @XmlElement(name = "OutSelectedVaultItemItemStatus")
    protected String outSelectedVaultItemItemStatus;
    @XmlElement(name = "OutSelectedVaultItemItemValue", required = true)
    protected BigDecimal outSelectedVaultItemItemValue;
    @XmlElement(name = "OutSelectedVaultItemProfitsAccount")
    protected String outSelectedVaultItemProfitsAccount;
    @XmlElement(name = "OutSelectedVaultItemProfitsSystem")
    protected short outSelectedVaultItemProfitsSystem;
    @XmlElement(name = "OutSelectedVaultItemRemovalDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outSelectedVaultItemRemovalDate;
    @XmlElement(name = "OutSelectedVaultItemResponsibleUser")
    protected String outSelectedVaultItemResponsibleUser;
    @XmlElement(name = "OutSelectedVaultItemReturnedDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outSelectedVaultItemReturnedDate;
    @XmlElement(name = "OutSelectedVaultItemSn")
    protected double outSelectedVaultItemSn;
    @XmlElement(name = "OutSelectedVaultItemTmstamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outSelectedVaultItemTmstamp;
    @XmlElement(name = "OutSelectedVaultItemUpdateDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outSelectedVaultItemUpdateDate;
    @XmlElement(name = "OutSelectedVaultItemUpdateUnit")
    protected int outSelectedVaultItemUpdateUnit;
    @XmlElement(name = "OutSelectedVaultItemUpdateUser")
    protected String outSelectedVaultItemUpdateUser;
    @XmlElement(name = "OutSelectedVaultItemVaultLocation")
    protected String outSelectedVaultItemVaultLocation;
    @XmlElement(name = "OutSelectedVaultItemVaultUnit")
    protected int outSelectedVaultItemVaultUnit;
    @XmlElement(name = "OutTeamInformationAuthorizationType")
    protected String outTeamInformationAuthorizationType;
    @XmlElement(name = "OutTeamInformationEvaluationResult")
    protected String outTeamInformationEvaluationResult;
    @XmlElement(name = "OutTeamInformationRequiredProfile1")
    protected String outTeamInformationRequiredProfile1;
    @XmlElement(name = "OutTeamInformationRequiredProfile2")
    protected String outTeamInformationRequiredProfile2;
    @XmlElement(name = "OutVaultLogCashAmount", required = true)
    protected BigDecimal outVaultLogCashAmount;
    @XmlElement(name = "OutVaultLogCashCurrency")
    protected int outVaultLogCashCurrency;
    @XmlElement(name = "OutVaultLogItemDaysInVault")
    protected double outVaultLogItemDaysInVault;
    @XmlElement(name = "OutVaultLogItemDaysNotinVault")
    protected double outVaultLogItemDaysNotinVault;
    @XmlElement(name = "OutVaultLogItemUser")
    protected String outVaultLogItemUser;
    @XmlElement(name = "OutVaultLogProcessDetail")
    protected String outVaultLogProcessDetail;
    @XmlElement(name = "OutVaultLogProcessReason")
    protected String outVaultLogProcessReason;
    @XmlElement(name = "OutVaultLogVaultAccessType")
    protected String outVaultLogVaultAccessType;
    @XmlElement(name = "OutVaultLogVaultItemSn")
    protected double outVaultLogVaultItemSn;
    @XmlElement(name = "OutVaultLogVaultTrxType")
    protected String outVaultLogVaultTrxType;
    @XmlElement(name = "OutVaultLogVaultUnit")
    protected int outVaultLogVaultUnit;
    @XmlElement(name = "OutVaultTotalAmntIefSuppliedAmount", required = true)
    protected BigDecimal outVaultTotalAmntIefSuppliedAmount;
    @XmlElement(name = "OutGrpUnit")
    protected ArrayOfP0831VOutGrpUnitItem outGrpUnit;
    @XmlElement(name = "OutGrpVaultItem")
    protected ArrayOfP0831VOutGrpVaultItemItem outGrpVaultItem;
    @XmlElement(name = "OutGrpVaultLog")
    protected ArrayOfP0831VOutGrpVaultLogItem outGrpVaultLog;

    /**
     * Gets the value of the outAccMovementCurrencyShortDescr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutAccMovementCurrencyShortDescr() {
        return outAccMovementCurrencyShortDescr;
    }

    /**
     * Sets the value of the outAccMovementCurrencyShortDescr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutAccMovementCurrencyShortDescr(String value) {
        this.outAccMovementCurrencyShortDescr = value;
    }

    /**
     * Gets the value of the outContinueIefSuppliedNum6 property.
     * 
     */
    public int getOutContinueIefSuppliedNum6() {
        return outContinueIefSuppliedNum6;
    }

    /**
     * Sets the value of the outContinueIefSuppliedNum6 property.
     * 
     */
    public void setOutContinueIefSuppliedNum6(int value) {
        this.outContinueIefSuppliedNum6 = value;
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
     * Gets the value of the outCustomerCustType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCustomerCustType() {
        return outCustomerCustType;
    }

    /**
     * Sets the value of the outCustomerCustType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCustomerCustType(String value) {
        this.outCustomerCustType = value;
    }

    /**
     * Gets the value of the outItemResponsibleUsrVaultWorkBankemployeeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutItemResponsibleUsrVaultWorkBankemployeeName() {
        return outItemResponsibleUsrVaultWorkBankemployeeName;
    }

    /**
     * Sets the value of the outItemResponsibleUsrVaultWorkBankemployeeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutItemResponsibleUsrVaultWorkBankemployeeName(String value) {
        this.outItemResponsibleUsrVaultWorkBankemployeeName = value;
    }

    /**
     * Gets the value of the outLogTrxBankemployeeVaultWorkBankemployeeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutLogTrxBankemployeeVaultWorkBankemployeeName() {
        return outLogTrxBankemployeeVaultWorkBankemployeeName;
    }

    /**
     * Sets the value of the outLogTrxBankemployeeVaultWorkBankemployeeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutLogTrxBankemployeeVaultWorkBankemployeeName(String value) {
        this.outLogTrxBankemployeeVaultWorkBankemployeeName = value;
    }

    /**
     * Gets the value of the outLogTrxUnitCode property.
     * 
     */
    public int getOutLogTrxUnitCode() {
        return outLogTrxUnitCode;
    }

    /**
     * Sets the value of the outLogTrxUnitCode property.
     * 
     */
    public void setOutLogTrxUnitCode(int value) {
        this.outLogTrxUnitCode = value;
    }

    /**
     * Gets the value of the outLogTrxUnitUnitName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutLogTrxUnitUnitName() {
        return outLogTrxUnitUnitName;
    }

    /**
     * Sets the value of the outLogTrxUnitUnitName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutLogTrxUnitUnitName(String value) {
        this.outLogTrxUnitUnitName = value;
    }

    /**
     * Gets the value of the outLogVaultBankemployeeVaultWorkBankemployeeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutLogVaultBankemployeeVaultWorkBankemployeeName() {
        return outLogVaultBankemployeeVaultWorkBankemployeeName;
    }

    /**
     * Sets the value of the outLogVaultBankemployeeVaultWorkBankemployeeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutLogVaultBankemployeeVaultWorkBankemployeeName(String value) {
        this.outLogVaultBankemployeeVaultWorkBankemployeeName = value;
    }

    /**
     * Gets the value of the outLogVaultUnitCode property.
     * 
     */
    public int getOutLogVaultUnitCode() {
        return outLogVaultUnitCode;
    }

    /**
     * Sets the value of the outLogVaultUnitCode property.
     * 
     */
    public void setOutLogVaultUnitCode(int value) {
        this.outLogVaultUnitCode = value;
    }

    /**
     * Gets the value of the outLogVaultUnitUnitName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutLogVaultUnitUnitName() {
        return outLogVaultUnitUnitName;
    }

    /**
     * Sets the value of the outLogVaultUnitUnitName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutLogVaultUnitUnitName(String value) {
        this.outLogVaultUnitUnitName = value;
    }

    /**
     * Gets the value of the outProcessedVaultItemAccountCd property.
     * 
     */
    public short getOutProcessedVaultItemAccountCd() {
        return outProcessedVaultItemAccountCd;
    }

    /**
     * Sets the value of the outProcessedVaultItemAccountCd property.
     * 
     */
    public void setOutProcessedVaultItemAccountCd(short value) {
        this.outProcessedVaultItemAccountCd = value;
    }

    /**
     * Gets the value of the outProcessedVaultItemCheckedDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutProcessedVaultItemCheckedDate() {
        return outProcessedVaultItemCheckedDate;
    }

    /**
     * Sets the value of the outProcessedVaultItemCheckedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutProcessedVaultItemCheckedDate(XMLGregorianCalendar value) {
        this.outProcessedVaultItemCheckedDate = value;
    }

    /**
     * Gets the value of the outProcessedVaultItemCustId property.
     * 
     */
    public int getOutProcessedVaultItemCustId() {
        return outProcessedVaultItemCustId;
    }

    /**
     * Sets the value of the outProcessedVaultItemCustId property.
     * 
     */
    public void setOutProcessedVaultItemCustId(int value) {
        this.outProcessedVaultItemCustId = value;
    }

    /**
     * Gets the value of the outProcessedVaultItemEntryStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutProcessedVaultItemEntryStatus() {
        return outProcessedVaultItemEntryStatus;
    }

    /**
     * Sets the value of the outProcessedVaultItemEntryStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutProcessedVaultItemEntryStatus(String value) {
        this.outProcessedVaultItemEntryStatus = value;
    }

    /**
     * Gets the value of the outProcessedVaultItemInsertDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutProcessedVaultItemInsertDate() {
        return outProcessedVaultItemInsertDate;
    }

    /**
     * Sets the value of the outProcessedVaultItemInsertDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutProcessedVaultItemInsertDate(XMLGregorianCalendar value) {
        this.outProcessedVaultItemInsertDate = value;
    }

    /**
     * Gets the value of the outProcessedVaultItemInsertUnit property.
     * 
     */
    public int getOutProcessedVaultItemInsertUnit() {
        return outProcessedVaultItemInsertUnit;
    }

    /**
     * Sets the value of the outProcessedVaultItemInsertUnit property.
     * 
     */
    public void setOutProcessedVaultItemInsertUnit(int value) {
        this.outProcessedVaultItemInsertUnit = value;
    }

    /**
     * Gets the value of the outProcessedVaultItemInsertUser property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutProcessedVaultItemInsertUser() {
        return outProcessedVaultItemInsertUser;
    }

    /**
     * Sets the value of the outProcessedVaultItemInsertUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutProcessedVaultItemInsertUser(String value) {
        this.outProcessedVaultItemInsertUser = value;
    }

    /**
     * Gets the value of the outProcessedVaultItemInsertedDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutProcessedVaultItemInsertedDate() {
        return outProcessedVaultItemInsertedDate;
    }

    /**
     * Sets the value of the outProcessedVaultItemInsertedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutProcessedVaultItemInsertedDate(XMLGregorianCalendar value) {
        this.outProcessedVaultItemInsertedDate = value;
    }

    /**
     * Gets the value of the outProcessedVaultItemItemDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutProcessedVaultItemItemDescription() {
        return outProcessedVaultItemItemDescription;
    }

    /**
     * Sets the value of the outProcessedVaultItemItemDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutProcessedVaultItemItemDescription(String value) {
        this.outProcessedVaultItemItemDescription = value;
    }

    /**
     * Gets the value of the outProcessedVaultItemItemDetails property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutProcessedVaultItemItemDetails() {
        return outProcessedVaultItemItemDetails;
    }

    /**
     * Sets the value of the outProcessedVaultItemItemDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutProcessedVaultItemItemDetails(String value) {
        this.outProcessedVaultItemItemDetails = value;
    }

    /**
     * Gets the value of the outProcessedVaultItemItemStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutProcessedVaultItemItemStatus() {
        return outProcessedVaultItemItemStatus;
    }

    /**
     * Sets the value of the outProcessedVaultItemItemStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutProcessedVaultItemItemStatus(String value) {
        this.outProcessedVaultItemItemStatus = value;
    }

    /**
     * Gets the value of the outProcessedVaultItemItemValue property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutProcessedVaultItemItemValue() {
        return outProcessedVaultItemItemValue;
    }

    /**
     * Sets the value of the outProcessedVaultItemItemValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutProcessedVaultItemItemValue(BigDecimal value) {
        this.outProcessedVaultItemItemValue = value;
    }

    /**
     * Gets the value of the outProcessedVaultItemProfitsAccount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutProcessedVaultItemProfitsAccount() {
        return outProcessedVaultItemProfitsAccount;
    }

    /**
     * Sets the value of the outProcessedVaultItemProfitsAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutProcessedVaultItemProfitsAccount(String value) {
        this.outProcessedVaultItemProfitsAccount = value;
    }

    /**
     * Gets the value of the outProcessedVaultItemProfitsSystem property.
     * 
     */
    public short getOutProcessedVaultItemProfitsSystem() {
        return outProcessedVaultItemProfitsSystem;
    }

    /**
     * Sets the value of the outProcessedVaultItemProfitsSystem property.
     * 
     */
    public void setOutProcessedVaultItemProfitsSystem(short value) {
        this.outProcessedVaultItemProfitsSystem = value;
    }

    /**
     * Gets the value of the outProcessedVaultItemRemovalDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutProcessedVaultItemRemovalDate() {
        return outProcessedVaultItemRemovalDate;
    }

    /**
     * Sets the value of the outProcessedVaultItemRemovalDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutProcessedVaultItemRemovalDate(XMLGregorianCalendar value) {
        this.outProcessedVaultItemRemovalDate = value;
    }

    /**
     * Gets the value of the outProcessedVaultItemResponsibleUser property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutProcessedVaultItemResponsibleUser() {
        return outProcessedVaultItemResponsibleUser;
    }

    /**
     * Sets the value of the outProcessedVaultItemResponsibleUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutProcessedVaultItemResponsibleUser(String value) {
        this.outProcessedVaultItemResponsibleUser = value;
    }

    /**
     * Gets the value of the outProcessedVaultItemReturnedDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutProcessedVaultItemReturnedDate() {
        return outProcessedVaultItemReturnedDate;
    }

    /**
     * Sets the value of the outProcessedVaultItemReturnedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutProcessedVaultItemReturnedDate(XMLGregorianCalendar value) {
        this.outProcessedVaultItemReturnedDate = value;
    }

    /**
     * Gets the value of the outProcessedVaultItemSn property.
     * 
     */
    public double getOutProcessedVaultItemSn() {
        return outProcessedVaultItemSn;
    }

    /**
     * Sets the value of the outProcessedVaultItemSn property.
     * 
     */
    public void setOutProcessedVaultItemSn(double value) {
        this.outProcessedVaultItemSn = value;
    }

    /**
     * Gets the value of the outProcessedVaultItemTmstamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutProcessedVaultItemTmstamp() {
        return outProcessedVaultItemTmstamp;
    }

    /**
     * Sets the value of the outProcessedVaultItemTmstamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutProcessedVaultItemTmstamp(XMLGregorianCalendar value) {
        this.outProcessedVaultItemTmstamp = value;
    }

    /**
     * Gets the value of the outProcessedVaultItemUpdateDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutProcessedVaultItemUpdateDate() {
        return outProcessedVaultItemUpdateDate;
    }

    /**
     * Sets the value of the outProcessedVaultItemUpdateDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutProcessedVaultItemUpdateDate(XMLGregorianCalendar value) {
        this.outProcessedVaultItemUpdateDate = value;
    }

    /**
     * Gets the value of the outProcessedVaultItemUpdateUnit property.
     * 
     */
    public int getOutProcessedVaultItemUpdateUnit() {
        return outProcessedVaultItemUpdateUnit;
    }

    /**
     * Sets the value of the outProcessedVaultItemUpdateUnit property.
     * 
     */
    public void setOutProcessedVaultItemUpdateUnit(int value) {
        this.outProcessedVaultItemUpdateUnit = value;
    }

    /**
     * Gets the value of the outProcessedVaultItemUpdateUser property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutProcessedVaultItemUpdateUser() {
        return outProcessedVaultItemUpdateUser;
    }

    /**
     * Sets the value of the outProcessedVaultItemUpdateUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutProcessedVaultItemUpdateUser(String value) {
        this.outProcessedVaultItemUpdateUser = value;
    }

    /**
     * Gets the value of the outProcessedVaultItemVaultLocation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutProcessedVaultItemVaultLocation() {
        return outProcessedVaultItemVaultLocation;
    }

    /**
     * Sets the value of the outProcessedVaultItemVaultLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutProcessedVaultItemVaultLocation(String value) {
        this.outProcessedVaultItemVaultLocation = value;
    }

    /**
     * Gets the value of the outProcessedVaultItemVaultUnit property.
     * 
     */
    public int getOutProcessedVaultItemVaultUnit() {
        return outProcessedVaultItemVaultUnit;
    }

    /**
     * Sets the value of the outProcessedVaultItemVaultUnit property.
     * 
     */
    public void setOutProcessedVaultItemVaultUnit(int value) {
        this.outProcessedVaultItemVaultUnit = value;
    }

    /**
     * Gets the value of the outSelectedVaultItemAccountCd property.
     * 
     */
    public short getOutSelectedVaultItemAccountCd() {
        return outSelectedVaultItemAccountCd;
    }

    /**
     * Sets the value of the outSelectedVaultItemAccountCd property.
     * 
     */
    public void setOutSelectedVaultItemAccountCd(short value) {
        this.outSelectedVaultItemAccountCd = value;
    }

    /**
     * Gets the value of the outSelectedVaultItemCheckedDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutSelectedVaultItemCheckedDate() {
        return outSelectedVaultItemCheckedDate;
    }

    /**
     * Sets the value of the outSelectedVaultItemCheckedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutSelectedVaultItemCheckedDate(XMLGregorianCalendar value) {
        this.outSelectedVaultItemCheckedDate = value;
    }

    /**
     * Gets the value of the outSelectedVaultItemCustId property.
     * 
     */
    public int getOutSelectedVaultItemCustId() {
        return outSelectedVaultItemCustId;
    }

    /**
     * Sets the value of the outSelectedVaultItemCustId property.
     * 
     */
    public void setOutSelectedVaultItemCustId(int value) {
        this.outSelectedVaultItemCustId = value;
    }

    /**
     * Gets the value of the outSelectedVaultItemEntryStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSelectedVaultItemEntryStatus() {
        return outSelectedVaultItemEntryStatus;
    }

    /**
     * Sets the value of the outSelectedVaultItemEntryStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSelectedVaultItemEntryStatus(String value) {
        this.outSelectedVaultItemEntryStatus = value;
    }

    /**
     * Gets the value of the outSelectedVaultItemInsertDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutSelectedVaultItemInsertDate() {
        return outSelectedVaultItemInsertDate;
    }

    /**
     * Sets the value of the outSelectedVaultItemInsertDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutSelectedVaultItemInsertDate(XMLGregorianCalendar value) {
        this.outSelectedVaultItemInsertDate = value;
    }

    /**
     * Gets the value of the outSelectedVaultItemInsertUnit property.
     * 
     */
    public int getOutSelectedVaultItemInsertUnit() {
        return outSelectedVaultItemInsertUnit;
    }

    /**
     * Sets the value of the outSelectedVaultItemInsertUnit property.
     * 
     */
    public void setOutSelectedVaultItemInsertUnit(int value) {
        this.outSelectedVaultItemInsertUnit = value;
    }

    /**
     * Gets the value of the outSelectedVaultItemInsertUser property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSelectedVaultItemInsertUser() {
        return outSelectedVaultItemInsertUser;
    }

    /**
     * Sets the value of the outSelectedVaultItemInsertUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSelectedVaultItemInsertUser(String value) {
        this.outSelectedVaultItemInsertUser = value;
    }

    /**
     * Gets the value of the outSelectedVaultItemInsertedDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutSelectedVaultItemInsertedDate() {
        return outSelectedVaultItemInsertedDate;
    }

    /**
     * Sets the value of the outSelectedVaultItemInsertedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutSelectedVaultItemInsertedDate(XMLGregorianCalendar value) {
        this.outSelectedVaultItemInsertedDate = value;
    }

    /**
     * Gets the value of the outSelectedVaultItemItemDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSelectedVaultItemItemDescription() {
        return outSelectedVaultItemItemDescription;
    }

    /**
     * Sets the value of the outSelectedVaultItemItemDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSelectedVaultItemItemDescription(String value) {
        this.outSelectedVaultItemItemDescription = value;
    }

    /**
     * Gets the value of the outSelectedVaultItemItemDetails property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSelectedVaultItemItemDetails() {
        return outSelectedVaultItemItemDetails;
    }

    /**
     * Sets the value of the outSelectedVaultItemItemDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSelectedVaultItemItemDetails(String value) {
        this.outSelectedVaultItemItemDetails = value;
    }

    /**
     * Gets the value of the outSelectedVaultItemItemStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSelectedVaultItemItemStatus() {
        return outSelectedVaultItemItemStatus;
    }

    /**
     * Sets the value of the outSelectedVaultItemItemStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSelectedVaultItemItemStatus(String value) {
        this.outSelectedVaultItemItemStatus = value;
    }

    /**
     * Gets the value of the outSelectedVaultItemItemValue property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutSelectedVaultItemItemValue() {
        return outSelectedVaultItemItemValue;
    }

    /**
     * Sets the value of the outSelectedVaultItemItemValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutSelectedVaultItemItemValue(BigDecimal value) {
        this.outSelectedVaultItemItemValue = value;
    }

    /**
     * Gets the value of the outSelectedVaultItemProfitsAccount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSelectedVaultItemProfitsAccount() {
        return outSelectedVaultItemProfitsAccount;
    }

    /**
     * Sets the value of the outSelectedVaultItemProfitsAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSelectedVaultItemProfitsAccount(String value) {
        this.outSelectedVaultItemProfitsAccount = value;
    }

    /**
     * Gets the value of the outSelectedVaultItemProfitsSystem property.
     * 
     */
    public short getOutSelectedVaultItemProfitsSystem() {
        return outSelectedVaultItemProfitsSystem;
    }

    /**
     * Sets the value of the outSelectedVaultItemProfitsSystem property.
     * 
     */
    public void setOutSelectedVaultItemProfitsSystem(short value) {
        this.outSelectedVaultItemProfitsSystem = value;
    }

    /**
     * Gets the value of the outSelectedVaultItemRemovalDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutSelectedVaultItemRemovalDate() {
        return outSelectedVaultItemRemovalDate;
    }

    /**
     * Sets the value of the outSelectedVaultItemRemovalDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutSelectedVaultItemRemovalDate(XMLGregorianCalendar value) {
        this.outSelectedVaultItemRemovalDate = value;
    }

    /**
     * Gets the value of the outSelectedVaultItemResponsibleUser property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSelectedVaultItemResponsibleUser() {
        return outSelectedVaultItemResponsibleUser;
    }

    /**
     * Sets the value of the outSelectedVaultItemResponsibleUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSelectedVaultItemResponsibleUser(String value) {
        this.outSelectedVaultItemResponsibleUser = value;
    }

    /**
     * Gets the value of the outSelectedVaultItemReturnedDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutSelectedVaultItemReturnedDate() {
        return outSelectedVaultItemReturnedDate;
    }

    /**
     * Sets the value of the outSelectedVaultItemReturnedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutSelectedVaultItemReturnedDate(XMLGregorianCalendar value) {
        this.outSelectedVaultItemReturnedDate = value;
    }

    /**
     * Gets the value of the outSelectedVaultItemSn property.
     * 
     */
    public double getOutSelectedVaultItemSn() {
        return outSelectedVaultItemSn;
    }

    /**
     * Sets the value of the outSelectedVaultItemSn property.
     * 
     */
    public void setOutSelectedVaultItemSn(double value) {
        this.outSelectedVaultItemSn = value;
    }

    /**
     * Gets the value of the outSelectedVaultItemTmstamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutSelectedVaultItemTmstamp() {
        return outSelectedVaultItemTmstamp;
    }

    /**
     * Sets the value of the outSelectedVaultItemTmstamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutSelectedVaultItemTmstamp(XMLGregorianCalendar value) {
        this.outSelectedVaultItemTmstamp = value;
    }

    /**
     * Gets the value of the outSelectedVaultItemUpdateDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutSelectedVaultItemUpdateDate() {
        return outSelectedVaultItemUpdateDate;
    }

    /**
     * Sets the value of the outSelectedVaultItemUpdateDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutSelectedVaultItemUpdateDate(XMLGregorianCalendar value) {
        this.outSelectedVaultItemUpdateDate = value;
    }

    /**
     * Gets the value of the outSelectedVaultItemUpdateUnit property.
     * 
     */
    public int getOutSelectedVaultItemUpdateUnit() {
        return outSelectedVaultItemUpdateUnit;
    }

    /**
     * Sets the value of the outSelectedVaultItemUpdateUnit property.
     * 
     */
    public void setOutSelectedVaultItemUpdateUnit(int value) {
        this.outSelectedVaultItemUpdateUnit = value;
    }

    /**
     * Gets the value of the outSelectedVaultItemUpdateUser property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSelectedVaultItemUpdateUser() {
        return outSelectedVaultItemUpdateUser;
    }

    /**
     * Sets the value of the outSelectedVaultItemUpdateUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSelectedVaultItemUpdateUser(String value) {
        this.outSelectedVaultItemUpdateUser = value;
    }

    /**
     * Gets the value of the outSelectedVaultItemVaultLocation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSelectedVaultItemVaultLocation() {
        return outSelectedVaultItemVaultLocation;
    }

    /**
     * Sets the value of the outSelectedVaultItemVaultLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSelectedVaultItemVaultLocation(String value) {
        this.outSelectedVaultItemVaultLocation = value;
    }

    /**
     * Gets the value of the outSelectedVaultItemVaultUnit property.
     * 
     */
    public int getOutSelectedVaultItemVaultUnit() {
        return outSelectedVaultItemVaultUnit;
    }

    /**
     * Sets the value of the outSelectedVaultItemVaultUnit property.
     * 
     */
    public void setOutSelectedVaultItemVaultUnit(int value) {
        this.outSelectedVaultItemVaultUnit = value;
    }

    /**
     * Gets the value of the outTeamInformationAuthorizationType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutTeamInformationAuthorizationType() {
        return outTeamInformationAuthorizationType;
    }

    /**
     * Sets the value of the outTeamInformationAuthorizationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutTeamInformationAuthorizationType(String value) {
        this.outTeamInformationAuthorizationType = value;
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
     * Gets the value of the outVaultLogCashAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutVaultLogCashAmount() {
        return outVaultLogCashAmount;
    }

    /**
     * Sets the value of the outVaultLogCashAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutVaultLogCashAmount(BigDecimal value) {
        this.outVaultLogCashAmount = value;
    }

    /**
     * Gets the value of the outVaultLogCashCurrency property.
     * 
     */
    public int getOutVaultLogCashCurrency() {
        return outVaultLogCashCurrency;
    }

    /**
     * Sets the value of the outVaultLogCashCurrency property.
     * 
     */
    public void setOutVaultLogCashCurrency(int value) {
        this.outVaultLogCashCurrency = value;
    }

    /**
     * Gets the value of the outVaultLogItemDaysInVault property.
     * 
     */
    public double getOutVaultLogItemDaysInVault() {
        return outVaultLogItemDaysInVault;
    }

    /**
     * Sets the value of the outVaultLogItemDaysInVault property.
     * 
     */
    public void setOutVaultLogItemDaysInVault(double value) {
        this.outVaultLogItemDaysInVault = value;
    }

    /**
     * Gets the value of the outVaultLogItemDaysNotinVault property.
     * 
     */
    public double getOutVaultLogItemDaysNotinVault() {
        return outVaultLogItemDaysNotinVault;
    }

    /**
     * Sets the value of the outVaultLogItemDaysNotinVault property.
     * 
     */
    public void setOutVaultLogItemDaysNotinVault(double value) {
        this.outVaultLogItemDaysNotinVault = value;
    }

    /**
     * Gets the value of the outVaultLogItemUser property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutVaultLogItemUser() {
        return outVaultLogItemUser;
    }

    /**
     * Sets the value of the outVaultLogItemUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutVaultLogItemUser(String value) {
        this.outVaultLogItemUser = value;
    }

    /**
     * Gets the value of the outVaultLogProcessDetail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutVaultLogProcessDetail() {
        return outVaultLogProcessDetail;
    }

    /**
     * Sets the value of the outVaultLogProcessDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutVaultLogProcessDetail(String value) {
        this.outVaultLogProcessDetail = value;
    }

    /**
     * Gets the value of the outVaultLogProcessReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutVaultLogProcessReason() {
        return outVaultLogProcessReason;
    }

    /**
     * Sets the value of the outVaultLogProcessReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutVaultLogProcessReason(String value) {
        this.outVaultLogProcessReason = value;
    }

    /**
     * Gets the value of the outVaultLogVaultAccessType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutVaultLogVaultAccessType() {
        return outVaultLogVaultAccessType;
    }

    /**
     * Sets the value of the outVaultLogVaultAccessType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutVaultLogVaultAccessType(String value) {
        this.outVaultLogVaultAccessType = value;
    }

    /**
     * Gets the value of the outVaultLogVaultItemSn property.
     * 
     */
    public double getOutVaultLogVaultItemSn() {
        return outVaultLogVaultItemSn;
    }

    /**
     * Sets the value of the outVaultLogVaultItemSn property.
     * 
     */
    public void setOutVaultLogVaultItemSn(double value) {
        this.outVaultLogVaultItemSn = value;
    }

    /**
     * Gets the value of the outVaultLogVaultTrxType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutVaultLogVaultTrxType() {
        return outVaultLogVaultTrxType;
    }

    /**
     * Sets the value of the outVaultLogVaultTrxType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutVaultLogVaultTrxType(String value) {
        this.outVaultLogVaultTrxType = value;
    }

    /**
     * Gets the value of the outVaultLogVaultUnit property.
     * 
     */
    public int getOutVaultLogVaultUnit() {
        return outVaultLogVaultUnit;
    }

    /**
     * Sets the value of the outVaultLogVaultUnit property.
     * 
     */
    public void setOutVaultLogVaultUnit(int value) {
        this.outVaultLogVaultUnit = value;
    }

    /**
     * Gets the value of the outVaultTotalAmntIefSuppliedAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutVaultTotalAmntIefSuppliedAmount() {
        return outVaultTotalAmntIefSuppliedAmount;
    }

    /**
     * Sets the value of the outVaultTotalAmntIefSuppliedAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutVaultTotalAmntIefSuppliedAmount(BigDecimal value) {
        this.outVaultTotalAmntIefSuppliedAmount = value;
    }

    /**
     * Gets the value of the outGrpUnit property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfP0831VOutGrpUnitItem }
     *     
     */
    public ArrayOfP0831VOutGrpUnitItem getOutGrpUnit() {
        return outGrpUnit;
    }

    /**
     * Sets the value of the outGrpUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfP0831VOutGrpUnitItem }
     *     
     */
    public void setOutGrpUnit(ArrayOfP0831VOutGrpUnitItem value) {
        this.outGrpUnit = value;
    }

    /**
     * Gets the value of the outGrpVaultItem property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfP0831VOutGrpVaultItemItem }
     *     
     */
    public ArrayOfP0831VOutGrpVaultItemItem getOutGrpVaultItem() {
        return outGrpVaultItem;
    }

    /**
     * Sets the value of the outGrpVaultItem property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfP0831VOutGrpVaultItemItem }
     *     
     */
    public void setOutGrpVaultItem(ArrayOfP0831VOutGrpVaultItemItem value) {
        this.outGrpVaultItem = value;
    }

    /**
     * Gets the value of the outGrpVaultLog property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfP0831VOutGrpVaultLogItem }
     *     
     */
    public ArrayOfP0831VOutGrpVaultLogItem getOutGrpVaultLog() {
        return outGrpVaultLog;
    }

    /**
     * Sets the value of the outGrpVaultLog property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfP0831VOutGrpVaultLogItem }
     *     
     */
    public void setOutGrpVaultLog(ArrayOfP0831VOutGrpVaultLogItem value) {
        this.outGrpVaultLog = value;
    }

}
