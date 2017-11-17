
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for P0831VStrongRoomVaultManipulationImport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="P0831VStrongRoomVaultManipulationImport">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}BaseImport">
 *       &lt;sequence>
 *         &lt;element name="Command" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InAuthGrantedIefSuppliedFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InClientLogMntRecordingAuthorizer1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InClientLogMntRecordingAuthorizer2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InClientLogMntRecordingPrftSystem" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InClientLogMntRecordingReversalFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InClientLogMntRecordingTerminalNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InClientLogMntRecordingTrxCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InContinueIefSuppliedNum6" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InExecuteTrxVaultLogProcessDetail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InExecuteTrxVaultLogProcessReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InExecuteTrxVaultWorkItemProcessAction" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InExecuteTrxVaultWorkItemProcessReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InFilterCustomerCustId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InFilterDateVaultWorkCheckDtFrom" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InFilterDateVaultWorkCheckDtTo" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InFilterDateVaultWorkCreationDtFrom" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InFilterDateVaultWorkCreationDtTo" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InFilterDateVaultWorkRemovalDtFrom" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InFilterDateVaultWorkRemovalDtTo" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InFilterDateVaultWorkReturnedDtFrom" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InFilterDateVaultWorkReturnedDtTo" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InFilterItemTypeGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InFilterProfitsAccountAccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InFilterProfitsAccountPrftSystem" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InFilterUsrCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InGrpParametersInGrmTerminalTerminalNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InGrpParametersInGrmTrxCountTrxCounter" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InJustificIdJustific" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InLogDateFromIefSuppliedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InLogDateToIefSuppliedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InPrftTransactionIdTransact" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InProcessLogVaultLogItemUser" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InProcessLogVaultLogTrxUnit" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InProcessLogVaultLogTrxUser" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InProcessLogVaultLogVaultItemSn" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="InProcessLogVaultLogVaultUnit" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InProductIdProduct" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InSelectedItemTypeGenericDetailDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InSelectedItemTypeGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InSelectedItemVaultItemSn" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="InSelectedUnitCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InSelectedVaultItemAccountCd" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InSelectedVaultItemCheckedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InSelectedVaultItemCustId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InSelectedVaultItemEntryStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InSelectedVaultItemInsertDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InSelectedVaultItemInsertUnit" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InSelectedVaultItemInsertUser" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InSelectedVaultItemInsertedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InSelectedVaultItemItemDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InSelectedVaultItemItemDetails" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InSelectedVaultItemItemStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InSelectedVaultItemItemValue" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InSelectedVaultItemProfitsAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InSelectedVaultItemProfitsSystem" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InSelectedVaultItemRemovalDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InSelectedVaultItemResponsibleUser" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InSelectedVaultItemReturnedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InSelectedVaultItemSn" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="InSelectedVaultItemTmstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InSelectedVaultItemUpdateDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InSelectedVaultItemUpdateUnit" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InSelectedVaultItemUpdateUser" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InSelectedVaultItemVaultLocation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InSelectedVaultItemVaultUnit" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InShowAllUnitsIefSuppliedFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InShowItemAllIefSuppliedChar1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InShowItemInIefSuppliedChar1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InShowItemRemovedIefSuppliedChar1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InTransLogAllIefSuppliedChar1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InTransLogAmountsIefSuppliedChar1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InTransLogItemsIefSuppliedChar1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InTransLogSelectedIefSuppliedChar1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InShowUnitsAllIefSuppliedChar1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "P0831VStrongRoomVaultManipulationImport", propOrder = {
    "command",
    "inAuthGrantedIefSuppliedFlag",
    "inClientLogMntRecordingAuthorizer1",
    "inClientLogMntRecordingAuthorizer2",
    "inClientLogMntRecordingPrftSystem",
    "inClientLogMntRecordingReversalFlag",
    "inClientLogMntRecordingTerminalNumber",
    "inClientLogMntRecordingTrxCode",
    "inContinueIefSuppliedNum6",
    "inExecuteTrxVaultLogProcessDetail",
    "inExecuteTrxVaultLogProcessReason",
    "inExecuteTrxVaultWorkItemProcessAction",
    "inExecuteTrxVaultWorkItemProcessReason",
    "inFilterCustomerCustId",
    "inFilterDateVaultWorkCheckDtFrom",
    "inFilterDateVaultWorkCheckDtTo",
    "inFilterDateVaultWorkCreationDtFrom",
    "inFilterDateVaultWorkCreationDtTo",
    "inFilterDateVaultWorkRemovalDtFrom",
    "inFilterDateVaultWorkRemovalDtTo",
    "inFilterDateVaultWorkReturnedDtFrom",
    "inFilterDateVaultWorkReturnedDtTo",
    "inFilterItemTypeGenericDetailSerialNum",
    "inFilterProfitsAccountAccountNumber",
    "inFilterProfitsAccountPrftSystem",
    "inFilterUsrCode",
    "inGrpParametersInGrmTerminalTerminalNumber",
    "inGrpParametersInGrmTrxCountTrxCounter",
    "inJustificIdJustific",
    "inLogDateFromIefSuppliedDate",
    "inLogDateToIefSuppliedDate",
    "inPrftTransactionIdTransact",
    "inProcessLogVaultLogItemUser",
    "inProcessLogVaultLogTrxUnit",
    "inProcessLogVaultLogTrxUser",
    "inProcessLogVaultLogVaultItemSn",
    "inProcessLogVaultLogVaultUnit",
    "inProductIdProduct",
    "inSelectedItemTypeGenericDetailDescription",
    "inSelectedItemTypeGenericDetailSerialNum",
    "inSelectedItemVaultItemSn",
    "inSelectedUnitCode",
    "inSelectedVaultItemAccountCd",
    "inSelectedVaultItemCheckedDate",
    "inSelectedVaultItemCustId",
    "inSelectedVaultItemEntryStatus",
    "inSelectedVaultItemInsertDate",
    "inSelectedVaultItemInsertUnit",
    "inSelectedVaultItemInsertUser",
    "inSelectedVaultItemInsertedDate",
    "inSelectedVaultItemItemDescription",
    "inSelectedVaultItemItemDetails",
    "inSelectedVaultItemItemStatus",
    "inSelectedVaultItemItemValue",
    "inSelectedVaultItemProfitsAccount",
    "inSelectedVaultItemProfitsSystem",
    "inSelectedVaultItemRemovalDate",
    "inSelectedVaultItemResponsibleUser",
    "inSelectedVaultItemReturnedDate",
    "inSelectedVaultItemSn",
    "inSelectedVaultItemTmstamp",
    "inSelectedVaultItemUpdateDate",
    "inSelectedVaultItemUpdateUnit",
    "inSelectedVaultItemUpdateUser",
    "inSelectedVaultItemVaultLocation",
    "inSelectedVaultItemVaultUnit",
    "inShowAllUnitsIefSuppliedFlag",
    "inShowItemAllIefSuppliedChar1",
    "inShowItemInIefSuppliedChar1",
    "inShowItemRemovedIefSuppliedChar1",
    "inTransLogAllIefSuppliedChar1",
    "inTransLogAmountsIefSuppliedChar1",
    "inTransLogItemsIefSuppliedChar1",
    "inTransLogSelectedIefSuppliedChar1",
    "inShowUnitsAllIefSuppliedChar1"
})
public class P0831VStrongRoomVaultManipulationImport
    extends BaseImport
{

    @XmlElement(name = "Command")
    protected String command;
    @XmlElement(name = "InAuthGrantedIefSuppliedFlag")
    protected String inAuthGrantedIefSuppliedFlag;
    @XmlElement(name = "InClientLogMntRecordingAuthorizer1")
    protected String inClientLogMntRecordingAuthorizer1;
    @XmlElement(name = "InClientLogMntRecordingAuthorizer2")
    protected String inClientLogMntRecordingAuthorizer2;
    @XmlElement(name = "InClientLogMntRecordingPrftSystem")
    protected short inClientLogMntRecordingPrftSystem;
    @XmlElement(name = "InClientLogMntRecordingReversalFlag")
    protected String inClientLogMntRecordingReversalFlag;
    @XmlElement(name = "InClientLogMntRecordingTerminalNumber")
    protected String inClientLogMntRecordingTerminalNumber;
    @XmlElement(name = "InClientLogMntRecordingTrxCode")
    protected int inClientLogMntRecordingTrxCode;
    @XmlElement(name = "InContinueIefSuppliedNum6")
    protected int inContinueIefSuppliedNum6;
    @XmlElement(name = "InExecuteTrxVaultLogProcessDetail")
    protected String inExecuteTrxVaultLogProcessDetail;
    @XmlElement(name = "InExecuteTrxVaultLogProcessReason")
    protected String inExecuteTrxVaultLogProcessReason;
    @XmlElement(name = "InExecuteTrxVaultWorkItemProcessAction")
    protected String inExecuteTrxVaultWorkItemProcessAction;
    @XmlElement(name = "InExecuteTrxVaultWorkItemProcessReason")
    protected String inExecuteTrxVaultWorkItemProcessReason;
    @XmlElement(name = "InFilterCustomerCustId")
    protected int inFilterCustomerCustId;
    @XmlElement(name = "InFilterDateVaultWorkCheckDtFrom", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inFilterDateVaultWorkCheckDtFrom;
    @XmlElement(name = "InFilterDateVaultWorkCheckDtTo", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inFilterDateVaultWorkCheckDtTo;
    @XmlElement(name = "InFilterDateVaultWorkCreationDtFrom", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inFilterDateVaultWorkCreationDtFrom;
    @XmlElement(name = "InFilterDateVaultWorkCreationDtTo", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inFilterDateVaultWorkCreationDtTo;
    @XmlElement(name = "InFilterDateVaultWorkRemovalDtFrom", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inFilterDateVaultWorkRemovalDtFrom;
    @XmlElement(name = "InFilterDateVaultWorkRemovalDtTo", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inFilterDateVaultWorkRemovalDtTo;
    @XmlElement(name = "InFilterDateVaultWorkReturnedDtFrom", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inFilterDateVaultWorkReturnedDtFrom;
    @XmlElement(name = "InFilterDateVaultWorkReturnedDtTo", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inFilterDateVaultWorkReturnedDtTo;
    @XmlElement(name = "InFilterItemTypeGenericDetailSerialNum")
    protected int inFilterItemTypeGenericDetailSerialNum;
    @XmlElement(name = "InFilterProfitsAccountAccountNumber")
    protected String inFilterProfitsAccountAccountNumber;
    @XmlElement(name = "InFilterProfitsAccountPrftSystem")
    protected short inFilterProfitsAccountPrftSystem;
    @XmlElement(name = "InFilterUsrCode")
    protected String inFilterUsrCode;
    @XmlElement(name = "InGrpParametersInGrmTerminalTerminalNumber")
    protected String inGrpParametersInGrmTerminalTerminalNumber;
    @XmlElement(name = "InGrpParametersInGrmTrxCountTrxCounter")
    protected int inGrpParametersInGrmTrxCountTrxCounter;
    @XmlElement(name = "InJustificIdJustific")
    protected int inJustificIdJustific;
    @XmlElement(name = "InLogDateFromIefSuppliedDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inLogDateFromIefSuppliedDate;
    @XmlElement(name = "InLogDateToIefSuppliedDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inLogDateToIefSuppliedDate;
    @XmlElement(name = "InPrftTransactionIdTransact")
    protected int inPrftTransactionIdTransact;
    @XmlElement(name = "InProcessLogVaultLogItemUser")
    protected String inProcessLogVaultLogItemUser;
    @XmlElement(name = "InProcessLogVaultLogTrxUnit")
    protected int inProcessLogVaultLogTrxUnit;
    @XmlElement(name = "InProcessLogVaultLogTrxUser")
    protected String inProcessLogVaultLogTrxUser;
    @XmlElement(name = "InProcessLogVaultLogVaultItemSn")
    protected double inProcessLogVaultLogVaultItemSn;
    @XmlElement(name = "InProcessLogVaultLogVaultUnit")
    protected int inProcessLogVaultLogVaultUnit;
    @XmlElement(name = "InProductIdProduct")
    protected int inProductIdProduct;
    @XmlElement(name = "InSelectedItemTypeGenericDetailDescription")
    protected String inSelectedItemTypeGenericDetailDescription;
    @XmlElement(name = "InSelectedItemTypeGenericDetailSerialNum")
    protected int inSelectedItemTypeGenericDetailSerialNum;
    @XmlElement(name = "InSelectedItemVaultItemSn")
    protected double inSelectedItemVaultItemSn;
    @XmlElement(name = "InSelectedUnitCode")
    protected int inSelectedUnitCode;
    @XmlElement(name = "InSelectedVaultItemAccountCd")
    protected short inSelectedVaultItemAccountCd;
    @XmlElement(name = "InSelectedVaultItemCheckedDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inSelectedVaultItemCheckedDate;
    @XmlElement(name = "InSelectedVaultItemCustId")
    protected int inSelectedVaultItemCustId;
    @XmlElement(name = "InSelectedVaultItemEntryStatus")
    protected String inSelectedVaultItemEntryStatus;
    @XmlElement(name = "InSelectedVaultItemInsertDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inSelectedVaultItemInsertDate;
    @XmlElement(name = "InSelectedVaultItemInsertUnit")
    protected int inSelectedVaultItemInsertUnit;
    @XmlElement(name = "InSelectedVaultItemInsertUser")
    protected String inSelectedVaultItemInsertUser;
    @XmlElement(name = "InSelectedVaultItemInsertedDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inSelectedVaultItemInsertedDate;
    @XmlElement(name = "InSelectedVaultItemItemDescription")
    protected String inSelectedVaultItemItemDescription;
    @XmlElement(name = "InSelectedVaultItemItemDetails")
    protected String inSelectedVaultItemItemDetails;
    @XmlElement(name = "InSelectedVaultItemItemStatus")
    protected String inSelectedVaultItemItemStatus;
    @XmlElement(name = "InSelectedVaultItemItemValue", required = true)
    protected BigDecimal inSelectedVaultItemItemValue;
    @XmlElement(name = "InSelectedVaultItemProfitsAccount")
    protected String inSelectedVaultItemProfitsAccount;
    @XmlElement(name = "InSelectedVaultItemProfitsSystem")
    protected short inSelectedVaultItemProfitsSystem;
    @XmlElement(name = "InSelectedVaultItemRemovalDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inSelectedVaultItemRemovalDate;
    @XmlElement(name = "InSelectedVaultItemResponsibleUser")
    protected String inSelectedVaultItemResponsibleUser;
    @XmlElement(name = "InSelectedVaultItemReturnedDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inSelectedVaultItemReturnedDate;
    @XmlElement(name = "InSelectedVaultItemSn")
    protected double inSelectedVaultItemSn;
    @XmlElement(name = "InSelectedVaultItemTmstamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inSelectedVaultItemTmstamp;
    @XmlElement(name = "InSelectedVaultItemUpdateDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inSelectedVaultItemUpdateDate;
    @XmlElement(name = "InSelectedVaultItemUpdateUnit")
    protected int inSelectedVaultItemUpdateUnit;
    @XmlElement(name = "InSelectedVaultItemUpdateUser")
    protected String inSelectedVaultItemUpdateUser;
    @XmlElement(name = "InSelectedVaultItemVaultLocation")
    protected String inSelectedVaultItemVaultLocation;
    @XmlElement(name = "InSelectedVaultItemVaultUnit")
    protected int inSelectedVaultItemVaultUnit;
    @XmlElement(name = "InShowAllUnitsIefSuppliedFlag")
    protected String inShowAllUnitsIefSuppliedFlag;
    @XmlElement(name = "InShowItemAllIefSuppliedChar1")
    protected String inShowItemAllIefSuppliedChar1;
    @XmlElement(name = "InShowItemInIefSuppliedChar1")
    protected String inShowItemInIefSuppliedChar1;
    @XmlElement(name = "InShowItemRemovedIefSuppliedChar1")
    protected String inShowItemRemovedIefSuppliedChar1;
    @XmlElement(name = "InTransLogAllIefSuppliedChar1")
    protected String inTransLogAllIefSuppliedChar1;
    @XmlElement(name = "InTransLogAmountsIefSuppliedChar1")
    protected String inTransLogAmountsIefSuppliedChar1;
    @XmlElement(name = "InTransLogItemsIefSuppliedChar1")
    protected String inTransLogItemsIefSuppliedChar1;
    @XmlElement(name = "InTransLogSelectedIefSuppliedChar1")
    protected String inTransLogSelectedIefSuppliedChar1;
    @XmlElement(name = "InShowUnitsAllIefSuppliedChar1")
    protected String inShowUnitsAllIefSuppliedChar1;

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
     * Gets the value of the inAuthGrantedIefSuppliedFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInAuthGrantedIefSuppliedFlag() {
        return inAuthGrantedIefSuppliedFlag;
    }

    /**
     * Sets the value of the inAuthGrantedIefSuppliedFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInAuthGrantedIefSuppliedFlag(String value) {
        this.inAuthGrantedIefSuppliedFlag = value;
    }

    /**
     * Gets the value of the inClientLogMntRecordingAuthorizer1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInClientLogMntRecordingAuthorizer1() {
        return inClientLogMntRecordingAuthorizer1;
    }

    /**
     * Sets the value of the inClientLogMntRecordingAuthorizer1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInClientLogMntRecordingAuthorizer1(String value) {
        this.inClientLogMntRecordingAuthorizer1 = value;
    }

    /**
     * Gets the value of the inClientLogMntRecordingAuthorizer2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInClientLogMntRecordingAuthorizer2() {
        return inClientLogMntRecordingAuthorizer2;
    }

    /**
     * Sets the value of the inClientLogMntRecordingAuthorizer2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInClientLogMntRecordingAuthorizer2(String value) {
        this.inClientLogMntRecordingAuthorizer2 = value;
    }

    /**
     * Gets the value of the inClientLogMntRecordingPrftSystem property.
     * 
     */
    public short getInClientLogMntRecordingPrftSystem() {
        return inClientLogMntRecordingPrftSystem;
    }

    /**
     * Sets the value of the inClientLogMntRecordingPrftSystem property.
     * 
     */
    public void setInClientLogMntRecordingPrftSystem(short value) {
        this.inClientLogMntRecordingPrftSystem = value;
    }

    /**
     * Gets the value of the inClientLogMntRecordingReversalFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInClientLogMntRecordingReversalFlag() {
        return inClientLogMntRecordingReversalFlag;
    }

    /**
     * Sets the value of the inClientLogMntRecordingReversalFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInClientLogMntRecordingReversalFlag(String value) {
        this.inClientLogMntRecordingReversalFlag = value;
    }

    /**
     * Gets the value of the inClientLogMntRecordingTerminalNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInClientLogMntRecordingTerminalNumber() {
        return inClientLogMntRecordingTerminalNumber;
    }

    /**
     * Sets the value of the inClientLogMntRecordingTerminalNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInClientLogMntRecordingTerminalNumber(String value) {
        this.inClientLogMntRecordingTerminalNumber = value;
    }

    /**
     * Gets the value of the inClientLogMntRecordingTrxCode property.
     * 
     */
    public int getInClientLogMntRecordingTrxCode() {
        return inClientLogMntRecordingTrxCode;
    }

    /**
     * Sets the value of the inClientLogMntRecordingTrxCode property.
     * 
     */
    public void setInClientLogMntRecordingTrxCode(int value) {
        this.inClientLogMntRecordingTrxCode = value;
    }

    /**
     * Gets the value of the inContinueIefSuppliedNum6 property.
     * 
     */
    public int getInContinueIefSuppliedNum6() {
        return inContinueIefSuppliedNum6;
    }

    /**
     * Sets the value of the inContinueIefSuppliedNum6 property.
     * 
     */
    public void setInContinueIefSuppliedNum6(int value) {
        this.inContinueIefSuppliedNum6 = value;
    }

    /**
     * Gets the value of the inExecuteTrxVaultLogProcessDetail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInExecuteTrxVaultLogProcessDetail() {
        return inExecuteTrxVaultLogProcessDetail;
    }

    /**
     * Sets the value of the inExecuteTrxVaultLogProcessDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInExecuteTrxVaultLogProcessDetail(String value) {
        this.inExecuteTrxVaultLogProcessDetail = value;
    }

    /**
     * Gets the value of the inExecuteTrxVaultLogProcessReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInExecuteTrxVaultLogProcessReason() {
        return inExecuteTrxVaultLogProcessReason;
    }

    /**
     * Sets the value of the inExecuteTrxVaultLogProcessReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInExecuteTrxVaultLogProcessReason(String value) {
        this.inExecuteTrxVaultLogProcessReason = value;
    }

    /**
     * Gets the value of the inExecuteTrxVaultWorkItemProcessAction property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInExecuteTrxVaultWorkItemProcessAction() {
        return inExecuteTrxVaultWorkItemProcessAction;
    }

    /**
     * Sets the value of the inExecuteTrxVaultWorkItemProcessAction property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInExecuteTrxVaultWorkItemProcessAction(String value) {
        this.inExecuteTrxVaultWorkItemProcessAction = value;
    }

    /**
     * Gets the value of the inExecuteTrxVaultWorkItemProcessReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInExecuteTrxVaultWorkItemProcessReason() {
        return inExecuteTrxVaultWorkItemProcessReason;
    }

    /**
     * Sets the value of the inExecuteTrxVaultWorkItemProcessReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInExecuteTrxVaultWorkItemProcessReason(String value) {
        this.inExecuteTrxVaultWorkItemProcessReason = value;
    }

    /**
     * Gets the value of the inFilterCustomerCustId property.
     * 
     */
    public int getInFilterCustomerCustId() {
        return inFilterCustomerCustId;
    }

    /**
     * Sets the value of the inFilterCustomerCustId property.
     * 
     */
    public void setInFilterCustomerCustId(int value) {
        this.inFilterCustomerCustId = value;
    }

    /**
     * Gets the value of the inFilterDateVaultWorkCheckDtFrom property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInFilterDateVaultWorkCheckDtFrom() {
        return inFilterDateVaultWorkCheckDtFrom;
    }

    /**
     * Sets the value of the inFilterDateVaultWorkCheckDtFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInFilterDateVaultWorkCheckDtFrom(XMLGregorianCalendar value) {
        this.inFilterDateVaultWorkCheckDtFrom = value;
    }

    /**
     * Gets the value of the inFilterDateVaultWorkCheckDtTo property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInFilterDateVaultWorkCheckDtTo() {
        return inFilterDateVaultWorkCheckDtTo;
    }

    /**
     * Sets the value of the inFilterDateVaultWorkCheckDtTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInFilterDateVaultWorkCheckDtTo(XMLGregorianCalendar value) {
        this.inFilterDateVaultWorkCheckDtTo = value;
    }

    /**
     * Gets the value of the inFilterDateVaultWorkCreationDtFrom property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInFilterDateVaultWorkCreationDtFrom() {
        return inFilterDateVaultWorkCreationDtFrom;
    }

    /**
     * Sets the value of the inFilterDateVaultWorkCreationDtFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInFilterDateVaultWorkCreationDtFrom(XMLGregorianCalendar value) {
        this.inFilterDateVaultWorkCreationDtFrom = value;
    }

    /**
     * Gets the value of the inFilterDateVaultWorkCreationDtTo property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInFilterDateVaultWorkCreationDtTo() {
        return inFilterDateVaultWorkCreationDtTo;
    }

    /**
     * Sets the value of the inFilterDateVaultWorkCreationDtTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInFilterDateVaultWorkCreationDtTo(XMLGregorianCalendar value) {
        this.inFilterDateVaultWorkCreationDtTo = value;
    }

    /**
     * Gets the value of the inFilterDateVaultWorkRemovalDtFrom property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInFilterDateVaultWorkRemovalDtFrom() {
        return inFilterDateVaultWorkRemovalDtFrom;
    }

    /**
     * Sets the value of the inFilterDateVaultWorkRemovalDtFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInFilterDateVaultWorkRemovalDtFrom(XMLGregorianCalendar value) {
        this.inFilterDateVaultWorkRemovalDtFrom = value;
    }

    /**
     * Gets the value of the inFilterDateVaultWorkRemovalDtTo property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInFilterDateVaultWorkRemovalDtTo() {
        return inFilterDateVaultWorkRemovalDtTo;
    }

    /**
     * Sets the value of the inFilterDateVaultWorkRemovalDtTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInFilterDateVaultWorkRemovalDtTo(XMLGregorianCalendar value) {
        this.inFilterDateVaultWorkRemovalDtTo = value;
    }

    /**
     * Gets the value of the inFilterDateVaultWorkReturnedDtFrom property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInFilterDateVaultWorkReturnedDtFrom() {
        return inFilterDateVaultWorkReturnedDtFrom;
    }

    /**
     * Sets the value of the inFilterDateVaultWorkReturnedDtFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInFilterDateVaultWorkReturnedDtFrom(XMLGregorianCalendar value) {
        this.inFilterDateVaultWorkReturnedDtFrom = value;
    }

    /**
     * Gets the value of the inFilterDateVaultWorkReturnedDtTo property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInFilterDateVaultWorkReturnedDtTo() {
        return inFilterDateVaultWorkReturnedDtTo;
    }

    /**
     * Sets the value of the inFilterDateVaultWorkReturnedDtTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInFilterDateVaultWorkReturnedDtTo(XMLGregorianCalendar value) {
        this.inFilterDateVaultWorkReturnedDtTo = value;
    }

    /**
     * Gets the value of the inFilterItemTypeGenericDetailSerialNum property.
     * 
     */
    public int getInFilterItemTypeGenericDetailSerialNum() {
        return inFilterItemTypeGenericDetailSerialNum;
    }

    /**
     * Sets the value of the inFilterItemTypeGenericDetailSerialNum property.
     * 
     */
    public void setInFilterItemTypeGenericDetailSerialNum(int value) {
        this.inFilterItemTypeGenericDetailSerialNum = value;
    }

    /**
     * Gets the value of the inFilterProfitsAccountAccountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInFilterProfitsAccountAccountNumber() {
        return inFilterProfitsAccountAccountNumber;
    }

    /**
     * Sets the value of the inFilterProfitsAccountAccountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInFilterProfitsAccountAccountNumber(String value) {
        this.inFilterProfitsAccountAccountNumber = value;
    }

    /**
     * Gets the value of the inFilterProfitsAccountPrftSystem property.
     * 
     */
    public short getInFilterProfitsAccountPrftSystem() {
        return inFilterProfitsAccountPrftSystem;
    }

    /**
     * Sets the value of the inFilterProfitsAccountPrftSystem property.
     * 
     */
    public void setInFilterProfitsAccountPrftSystem(short value) {
        this.inFilterProfitsAccountPrftSystem = value;
    }

    /**
     * Gets the value of the inFilterUsrCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInFilterUsrCode() {
        return inFilterUsrCode;
    }

    /**
     * Sets the value of the inFilterUsrCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInFilterUsrCode(String value) {
        this.inFilterUsrCode = value;
    }

    /**
     * Gets the value of the inGrpParametersInGrmTerminalTerminalNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInGrpParametersInGrmTerminalTerminalNumber() {
        return inGrpParametersInGrmTerminalTerminalNumber;
    }

    /**
     * Sets the value of the inGrpParametersInGrmTerminalTerminalNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInGrpParametersInGrmTerminalTerminalNumber(String value) {
        this.inGrpParametersInGrmTerminalTerminalNumber = value;
    }

    /**
     * Gets the value of the inGrpParametersInGrmTrxCountTrxCounter property.
     * 
     */
    public int getInGrpParametersInGrmTrxCountTrxCounter() {
        return inGrpParametersInGrmTrxCountTrxCounter;
    }

    /**
     * Sets the value of the inGrpParametersInGrmTrxCountTrxCounter property.
     * 
     */
    public void setInGrpParametersInGrmTrxCountTrxCounter(int value) {
        this.inGrpParametersInGrmTrxCountTrxCounter = value;
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
     * Gets the value of the inLogDateFromIefSuppliedDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInLogDateFromIefSuppliedDate() {
        return inLogDateFromIefSuppliedDate;
    }

    /**
     * Sets the value of the inLogDateFromIefSuppliedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInLogDateFromIefSuppliedDate(XMLGregorianCalendar value) {
        this.inLogDateFromIefSuppliedDate = value;
    }

    /**
     * Gets the value of the inLogDateToIefSuppliedDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInLogDateToIefSuppliedDate() {
        return inLogDateToIefSuppliedDate;
    }

    /**
     * Sets the value of the inLogDateToIefSuppliedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInLogDateToIefSuppliedDate(XMLGregorianCalendar value) {
        this.inLogDateToIefSuppliedDate = value;
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
     * Gets the value of the inProcessLogVaultLogItemUser property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInProcessLogVaultLogItemUser() {
        return inProcessLogVaultLogItemUser;
    }

    /**
     * Sets the value of the inProcessLogVaultLogItemUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInProcessLogVaultLogItemUser(String value) {
        this.inProcessLogVaultLogItemUser = value;
    }

    /**
     * Gets the value of the inProcessLogVaultLogTrxUnit property.
     * 
     */
    public int getInProcessLogVaultLogTrxUnit() {
        return inProcessLogVaultLogTrxUnit;
    }

    /**
     * Sets the value of the inProcessLogVaultLogTrxUnit property.
     * 
     */
    public void setInProcessLogVaultLogTrxUnit(int value) {
        this.inProcessLogVaultLogTrxUnit = value;
    }

    /**
     * Gets the value of the inProcessLogVaultLogTrxUser property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInProcessLogVaultLogTrxUser() {
        return inProcessLogVaultLogTrxUser;
    }

    /**
     * Sets the value of the inProcessLogVaultLogTrxUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInProcessLogVaultLogTrxUser(String value) {
        this.inProcessLogVaultLogTrxUser = value;
    }

    /**
     * Gets the value of the inProcessLogVaultLogVaultItemSn property.
     * 
     */
    public double getInProcessLogVaultLogVaultItemSn() {
        return inProcessLogVaultLogVaultItemSn;
    }

    /**
     * Sets the value of the inProcessLogVaultLogVaultItemSn property.
     * 
     */
    public void setInProcessLogVaultLogVaultItemSn(double value) {
        this.inProcessLogVaultLogVaultItemSn = value;
    }

    /**
     * Gets the value of the inProcessLogVaultLogVaultUnit property.
     * 
     */
    public int getInProcessLogVaultLogVaultUnit() {
        return inProcessLogVaultLogVaultUnit;
    }

    /**
     * Sets the value of the inProcessLogVaultLogVaultUnit property.
     * 
     */
    public void setInProcessLogVaultLogVaultUnit(int value) {
        this.inProcessLogVaultLogVaultUnit = value;
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
     * Gets the value of the inSelectedItemTypeGenericDetailDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInSelectedItemTypeGenericDetailDescription() {
        return inSelectedItemTypeGenericDetailDescription;
    }

    /**
     * Sets the value of the inSelectedItemTypeGenericDetailDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInSelectedItemTypeGenericDetailDescription(String value) {
        this.inSelectedItemTypeGenericDetailDescription = value;
    }

    /**
     * Gets the value of the inSelectedItemTypeGenericDetailSerialNum property.
     * 
     */
    public int getInSelectedItemTypeGenericDetailSerialNum() {
        return inSelectedItemTypeGenericDetailSerialNum;
    }

    /**
     * Sets the value of the inSelectedItemTypeGenericDetailSerialNum property.
     * 
     */
    public void setInSelectedItemTypeGenericDetailSerialNum(int value) {
        this.inSelectedItemTypeGenericDetailSerialNum = value;
    }

    /**
     * Gets the value of the inSelectedItemVaultItemSn property.
     * 
     */
    public double getInSelectedItemVaultItemSn() {
        return inSelectedItemVaultItemSn;
    }

    /**
     * Sets the value of the inSelectedItemVaultItemSn property.
     * 
     */
    public void setInSelectedItemVaultItemSn(double value) {
        this.inSelectedItemVaultItemSn = value;
    }

    /**
     * Gets the value of the inSelectedUnitCode property.
     * 
     */
    public int getInSelectedUnitCode() {
        return inSelectedUnitCode;
    }

    /**
     * Sets the value of the inSelectedUnitCode property.
     * 
     */
    public void setInSelectedUnitCode(int value) {
        this.inSelectedUnitCode = value;
    }

    /**
     * Gets the value of the inSelectedVaultItemAccountCd property.
     * 
     */
    public short getInSelectedVaultItemAccountCd() {
        return inSelectedVaultItemAccountCd;
    }

    /**
     * Sets the value of the inSelectedVaultItemAccountCd property.
     * 
     */
    public void setInSelectedVaultItemAccountCd(short value) {
        this.inSelectedVaultItemAccountCd = value;
    }

    /**
     * Gets the value of the inSelectedVaultItemCheckedDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInSelectedVaultItemCheckedDate() {
        return inSelectedVaultItemCheckedDate;
    }

    /**
     * Sets the value of the inSelectedVaultItemCheckedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInSelectedVaultItemCheckedDate(XMLGregorianCalendar value) {
        this.inSelectedVaultItemCheckedDate = value;
    }

    /**
     * Gets the value of the inSelectedVaultItemCustId property.
     * 
     */
    public int getInSelectedVaultItemCustId() {
        return inSelectedVaultItemCustId;
    }

    /**
     * Sets the value of the inSelectedVaultItemCustId property.
     * 
     */
    public void setInSelectedVaultItemCustId(int value) {
        this.inSelectedVaultItemCustId = value;
    }

    /**
     * Gets the value of the inSelectedVaultItemEntryStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInSelectedVaultItemEntryStatus() {
        return inSelectedVaultItemEntryStatus;
    }

    /**
     * Sets the value of the inSelectedVaultItemEntryStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInSelectedVaultItemEntryStatus(String value) {
        this.inSelectedVaultItemEntryStatus = value;
    }

    /**
     * Gets the value of the inSelectedVaultItemInsertDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInSelectedVaultItemInsertDate() {
        return inSelectedVaultItemInsertDate;
    }

    /**
     * Sets the value of the inSelectedVaultItemInsertDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInSelectedVaultItemInsertDate(XMLGregorianCalendar value) {
        this.inSelectedVaultItemInsertDate = value;
    }

    /**
     * Gets the value of the inSelectedVaultItemInsertUnit property.
     * 
     */
    public int getInSelectedVaultItemInsertUnit() {
        return inSelectedVaultItemInsertUnit;
    }

    /**
     * Sets the value of the inSelectedVaultItemInsertUnit property.
     * 
     */
    public void setInSelectedVaultItemInsertUnit(int value) {
        this.inSelectedVaultItemInsertUnit = value;
    }

    /**
     * Gets the value of the inSelectedVaultItemInsertUser property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInSelectedVaultItemInsertUser() {
        return inSelectedVaultItemInsertUser;
    }

    /**
     * Sets the value of the inSelectedVaultItemInsertUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInSelectedVaultItemInsertUser(String value) {
        this.inSelectedVaultItemInsertUser = value;
    }

    /**
     * Gets the value of the inSelectedVaultItemInsertedDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInSelectedVaultItemInsertedDate() {
        return inSelectedVaultItemInsertedDate;
    }

    /**
     * Sets the value of the inSelectedVaultItemInsertedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInSelectedVaultItemInsertedDate(XMLGregorianCalendar value) {
        this.inSelectedVaultItemInsertedDate = value;
    }

    /**
     * Gets the value of the inSelectedVaultItemItemDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInSelectedVaultItemItemDescription() {
        return inSelectedVaultItemItemDescription;
    }

    /**
     * Sets the value of the inSelectedVaultItemItemDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInSelectedVaultItemItemDescription(String value) {
        this.inSelectedVaultItemItemDescription = value;
    }

    /**
     * Gets the value of the inSelectedVaultItemItemDetails property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInSelectedVaultItemItemDetails() {
        return inSelectedVaultItemItemDetails;
    }

    /**
     * Sets the value of the inSelectedVaultItemItemDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInSelectedVaultItemItemDetails(String value) {
        this.inSelectedVaultItemItemDetails = value;
    }

    /**
     * Gets the value of the inSelectedVaultItemItemStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInSelectedVaultItemItemStatus() {
        return inSelectedVaultItemItemStatus;
    }

    /**
     * Sets the value of the inSelectedVaultItemItemStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInSelectedVaultItemItemStatus(String value) {
        this.inSelectedVaultItemItemStatus = value;
    }

    /**
     * Gets the value of the inSelectedVaultItemItemValue property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInSelectedVaultItemItemValue() {
        return inSelectedVaultItemItemValue;
    }

    /**
     * Sets the value of the inSelectedVaultItemItemValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInSelectedVaultItemItemValue(BigDecimal value) {
        this.inSelectedVaultItemItemValue = value;
    }

    /**
     * Gets the value of the inSelectedVaultItemProfitsAccount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInSelectedVaultItemProfitsAccount() {
        return inSelectedVaultItemProfitsAccount;
    }

    /**
     * Sets the value of the inSelectedVaultItemProfitsAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInSelectedVaultItemProfitsAccount(String value) {
        this.inSelectedVaultItemProfitsAccount = value;
    }

    /**
     * Gets the value of the inSelectedVaultItemProfitsSystem property.
     * 
     */
    public short getInSelectedVaultItemProfitsSystem() {
        return inSelectedVaultItemProfitsSystem;
    }

    /**
     * Sets the value of the inSelectedVaultItemProfitsSystem property.
     * 
     */
    public void setInSelectedVaultItemProfitsSystem(short value) {
        this.inSelectedVaultItemProfitsSystem = value;
    }

    /**
     * Gets the value of the inSelectedVaultItemRemovalDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInSelectedVaultItemRemovalDate() {
        return inSelectedVaultItemRemovalDate;
    }

    /**
     * Sets the value of the inSelectedVaultItemRemovalDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInSelectedVaultItemRemovalDate(XMLGregorianCalendar value) {
        this.inSelectedVaultItemRemovalDate = value;
    }

    /**
     * Gets the value of the inSelectedVaultItemResponsibleUser property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInSelectedVaultItemResponsibleUser() {
        return inSelectedVaultItemResponsibleUser;
    }

    /**
     * Sets the value of the inSelectedVaultItemResponsibleUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInSelectedVaultItemResponsibleUser(String value) {
        this.inSelectedVaultItemResponsibleUser = value;
    }

    /**
     * Gets the value of the inSelectedVaultItemReturnedDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInSelectedVaultItemReturnedDate() {
        return inSelectedVaultItemReturnedDate;
    }

    /**
     * Sets the value of the inSelectedVaultItemReturnedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInSelectedVaultItemReturnedDate(XMLGregorianCalendar value) {
        this.inSelectedVaultItemReturnedDate = value;
    }

    /**
     * Gets the value of the inSelectedVaultItemSn property.
     * 
     */
    public double getInSelectedVaultItemSn() {
        return inSelectedVaultItemSn;
    }

    /**
     * Sets the value of the inSelectedVaultItemSn property.
     * 
     */
    public void setInSelectedVaultItemSn(double value) {
        this.inSelectedVaultItemSn = value;
    }

    /**
     * Gets the value of the inSelectedVaultItemTmstamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInSelectedVaultItemTmstamp() {
        return inSelectedVaultItemTmstamp;
    }

    /**
     * Sets the value of the inSelectedVaultItemTmstamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInSelectedVaultItemTmstamp(XMLGregorianCalendar value) {
        this.inSelectedVaultItemTmstamp = value;
    }

    /**
     * Gets the value of the inSelectedVaultItemUpdateDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInSelectedVaultItemUpdateDate() {
        return inSelectedVaultItemUpdateDate;
    }

    /**
     * Sets the value of the inSelectedVaultItemUpdateDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInSelectedVaultItemUpdateDate(XMLGregorianCalendar value) {
        this.inSelectedVaultItemUpdateDate = value;
    }

    /**
     * Gets the value of the inSelectedVaultItemUpdateUnit property.
     * 
     */
    public int getInSelectedVaultItemUpdateUnit() {
        return inSelectedVaultItemUpdateUnit;
    }

    /**
     * Sets the value of the inSelectedVaultItemUpdateUnit property.
     * 
     */
    public void setInSelectedVaultItemUpdateUnit(int value) {
        this.inSelectedVaultItemUpdateUnit = value;
    }

    /**
     * Gets the value of the inSelectedVaultItemUpdateUser property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInSelectedVaultItemUpdateUser() {
        return inSelectedVaultItemUpdateUser;
    }

    /**
     * Sets the value of the inSelectedVaultItemUpdateUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInSelectedVaultItemUpdateUser(String value) {
        this.inSelectedVaultItemUpdateUser = value;
    }

    /**
     * Gets the value of the inSelectedVaultItemVaultLocation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInSelectedVaultItemVaultLocation() {
        return inSelectedVaultItemVaultLocation;
    }

    /**
     * Sets the value of the inSelectedVaultItemVaultLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInSelectedVaultItemVaultLocation(String value) {
        this.inSelectedVaultItemVaultLocation = value;
    }

    /**
     * Gets the value of the inSelectedVaultItemVaultUnit property.
     * 
     */
    public int getInSelectedVaultItemVaultUnit() {
        return inSelectedVaultItemVaultUnit;
    }

    /**
     * Sets the value of the inSelectedVaultItemVaultUnit property.
     * 
     */
    public void setInSelectedVaultItemVaultUnit(int value) {
        this.inSelectedVaultItemVaultUnit = value;
    }

    /**
     * Gets the value of the inShowAllUnitsIefSuppliedFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInShowAllUnitsIefSuppliedFlag() {
        return inShowAllUnitsIefSuppliedFlag;
    }

    /**
     * Sets the value of the inShowAllUnitsIefSuppliedFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInShowAllUnitsIefSuppliedFlag(String value) {
        this.inShowAllUnitsIefSuppliedFlag = value;
    }

    /**
     * Gets the value of the inShowItemAllIefSuppliedChar1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInShowItemAllIefSuppliedChar1() {
        return inShowItemAllIefSuppliedChar1;
    }

    /**
     * Sets the value of the inShowItemAllIefSuppliedChar1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInShowItemAllIefSuppliedChar1(String value) {
        this.inShowItemAllIefSuppliedChar1 = value;
    }

    /**
     * Gets the value of the inShowItemInIefSuppliedChar1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInShowItemInIefSuppliedChar1() {
        return inShowItemInIefSuppliedChar1;
    }

    /**
     * Sets the value of the inShowItemInIefSuppliedChar1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInShowItemInIefSuppliedChar1(String value) {
        this.inShowItemInIefSuppliedChar1 = value;
    }

    /**
     * Gets the value of the inShowItemRemovedIefSuppliedChar1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInShowItemRemovedIefSuppliedChar1() {
        return inShowItemRemovedIefSuppliedChar1;
    }

    /**
     * Sets the value of the inShowItemRemovedIefSuppliedChar1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInShowItemRemovedIefSuppliedChar1(String value) {
        this.inShowItemRemovedIefSuppliedChar1 = value;
    }

    /**
     * Gets the value of the inTransLogAllIefSuppliedChar1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInTransLogAllIefSuppliedChar1() {
        return inTransLogAllIefSuppliedChar1;
    }

    /**
     * Sets the value of the inTransLogAllIefSuppliedChar1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInTransLogAllIefSuppliedChar1(String value) {
        this.inTransLogAllIefSuppliedChar1 = value;
    }

    /**
     * Gets the value of the inTransLogAmountsIefSuppliedChar1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInTransLogAmountsIefSuppliedChar1() {
        return inTransLogAmountsIefSuppliedChar1;
    }

    /**
     * Sets the value of the inTransLogAmountsIefSuppliedChar1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInTransLogAmountsIefSuppliedChar1(String value) {
        this.inTransLogAmountsIefSuppliedChar1 = value;
    }

    /**
     * Gets the value of the inTransLogItemsIefSuppliedChar1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInTransLogItemsIefSuppliedChar1() {
        return inTransLogItemsIefSuppliedChar1;
    }

    /**
     * Sets the value of the inTransLogItemsIefSuppliedChar1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInTransLogItemsIefSuppliedChar1(String value) {
        this.inTransLogItemsIefSuppliedChar1 = value;
    }

    /**
     * Gets the value of the inTransLogSelectedIefSuppliedChar1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInTransLogSelectedIefSuppliedChar1() {
        return inTransLogSelectedIefSuppliedChar1;
    }

    /**
     * Sets the value of the inTransLogSelectedIefSuppliedChar1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInTransLogSelectedIefSuppliedChar1(String value) {
        this.inTransLogSelectedIefSuppliedChar1 = value;
    }

    /**
     * Gets the value of the inShowUnitsAllIefSuppliedChar1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInShowUnitsAllIefSuppliedChar1() {
        return inShowUnitsAllIefSuppliedChar1;
    }

    /**
     * Sets the value of the inShowUnitsAllIefSuppliedChar1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInShowUnitsAllIefSuppliedChar1(String value) {
        this.inShowUnitsAllIefSuppliedChar1 = value;
    }

}
