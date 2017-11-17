
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for DTF099V_ElectronicFundsTransferExport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DTF099V_ElectronicFundsTransferExport">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}BaseExport">
 *       &lt;sequence>
 *         &lt;element name="OutIpsMessageHeaderBenefCustId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutIpsMessageHeaderBenefFullname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutIpsMessageHeaderBenefResident" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutIpsMessageHeaderChargeBearer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutIpsMessageHeaderChargesAccSystem" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutIpsMessageHeaderChargesAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutIpsMessageHeaderChargesDiscount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutIpsMessageHeaderChargesJustific" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutIpsMessageHeaderClearingSystem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutIpsMessageHeaderCollectedAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutIpsMessageHeaderComboJustific" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutIpsMessageHeaderComboTransaction" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutIpsMessageHeaderComments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutIpsMessageHeaderCommissionDiscount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutIpsMessageHeaderCompleteMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutIpsMessageHeaderCreditBicAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutIpsMessageHeaderDealerRefNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutIpsMessageHeaderDealerUsr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutIpsMessageHeaderDebitBicAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutIpsMessageHeaderExpenseJustific" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutIpsMessageHeaderExpenseProdDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutIpsMessageHeaderExternalIdRef" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutIpsMessageHeaderFkOrderCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutIpsMessageHeaderGenericAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutIpsMessageHeaderIssuerCustId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutIpsMessageHeaderIssuerFullname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutIpsMessageHeaderIssuerProdDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutIpsMessageHeaderIssuerResident" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutIpsMessageHeaderItemSerialNumber" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OutIpsMessageHeaderJustificId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutIpsMessageHeaderOrderAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutIpsMessageHeaderOrderCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutIpsMessageHeaderOrderCommission" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutIpsMessageHeaderOrderCurrency" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutIpsMessageHeaderOrderExpense" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutIpsMessageHeaderOrderFileLine" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutIpsMessageHeaderOrderFilename" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutIpsMessageHeaderOrderStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutIpsMessageHeaderOrderTimestamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutIpsMessageHeaderOrderType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutIpsMessageHeaderPrftAccSystem" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutIpsMessageHeaderPrftAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutIpsMessageHeaderProcessResults" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutIpsMessageHeaderRejectionCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutIpsMessageHeaderRemittanceInfo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutIpsMessageHeaderServiceProduct" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutIpsMessageHeaderSettlementAmnt" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutIpsMessageHeaderTrxCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutIpsMessageHeaderTrxDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutIpsMessageHeaderTrxUnit" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutStatusIefSuppliedActionEntryDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutStatusIefSuppliedActionEntryMsg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSuccessfulTransactionWorkSuccessfulTransactionWorkAdviceCounter" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutSuccessfulTransactionWorkSuccessfulTransactionWorkAdviceTitle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSuccessfulTransactionWorkSuccessfulTransactionWorkDatetimestamp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSuccessfulTransactionWorkSuccessfulTransactionWorkTrxDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutSuccessfulTransactionWorkSuccessfulTransactionWorkTrxUnit" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutSuccessfulTransactionWorkSuccessfulTransactionWorkTrxUser" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSuccessfulTransactionWorkSuccessfulTransactionWorkTrxUsrSn" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutSuccessfulTransactionWorkSuccessfulTransactionWorkTunInternalSn" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutValidationDatafieldsResultIefSuppliedChar1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpErrorMsgDatafields" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}ArrayOfDTF099VOutGrpErrorMsgDatafieldsItem" minOccurs="0"/>
 *         &lt;element name="OutGrpMessageErrors" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}ArrayOfDTF099VOutGrpMessageErrorsItem" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DTF099V_ElectronicFundsTransferExport", propOrder = {
    "outIpsMessageHeaderBenefCustId",
    "outIpsMessageHeaderBenefFullname",
    "outIpsMessageHeaderBenefResident",
    "outIpsMessageHeaderChargeBearer",
    "outIpsMessageHeaderChargesAccSystem",
    "outIpsMessageHeaderChargesAccount",
    "outIpsMessageHeaderChargesDiscount",
    "outIpsMessageHeaderChargesJustific",
    "outIpsMessageHeaderClearingSystem",
    "outIpsMessageHeaderCollectedAmount",
    "outIpsMessageHeaderComboJustific",
    "outIpsMessageHeaderComboTransaction",
    "outIpsMessageHeaderComments",
    "outIpsMessageHeaderCommissionDiscount",
    "outIpsMessageHeaderCompleteMessage",
    "outIpsMessageHeaderCreditBicAddress",
    "outIpsMessageHeaderDealerRefNo",
    "outIpsMessageHeaderDealerUsr",
    "outIpsMessageHeaderDebitBicAddress",
    "outIpsMessageHeaderExpenseJustific",
    "outIpsMessageHeaderExpenseProdDate",
    "outIpsMessageHeaderExternalIdRef",
    "outIpsMessageHeaderFkOrderCode",
    "outIpsMessageHeaderGenericAccount",
    "outIpsMessageHeaderIssuerCustId",
    "outIpsMessageHeaderIssuerFullname",
    "outIpsMessageHeaderIssuerProdDate",
    "outIpsMessageHeaderIssuerResident",
    "outIpsMessageHeaderItemSerialNumber",
    "outIpsMessageHeaderJustificId",
    "outIpsMessageHeaderOrderAmount",
    "outIpsMessageHeaderOrderCode",
    "outIpsMessageHeaderOrderCommission",
    "outIpsMessageHeaderOrderCurrency",
    "outIpsMessageHeaderOrderExpense",
    "outIpsMessageHeaderOrderFileLine",
    "outIpsMessageHeaderOrderFilename",
    "outIpsMessageHeaderOrderStatus",
    "outIpsMessageHeaderOrderTimestamp",
    "outIpsMessageHeaderOrderType",
    "outIpsMessageHeaderPrftAccSystem",
    "outIpsMessageHeaderPrftAccount",
    "outIpsMessageHeaderProcessResults",
    "outIpsMessageHeaderRejectionCode",
    "outIpsMessageHeaderRemittanceInfo",
    "outIpsMessageHeaderServiceProduct",
    "outIpsMessageHeaderSettlementAmnt",
    "outIpsMessageHeaderTrxCode",
    "outIpsMessageHeaderTrxDate",
    "outIpsMessageHeaderTrxUnit",
    "outStatusIefSuppliedActionEntryDesc",
    "outStatusIefSuppliedActionEntryMsg",
    "outSuccessfulTransactionWorkSuccessfulTransactionWorkAdviceCounter",
    "outSuccessfulTransactionWorkSuccessfulTransactionWorkAdviceTitle",
    "outSuccessfulTransactionWorkSuccessfulTransactionWorkDatetimestamp",
    "outSuccessfulTransactionWorkSuccessfulTransactionWorkTrxDate",
    "outSuccessfulTransactionWorkSuccessfulTransactionWorkTrxUnit",
    "outSuccessfulTransactionWorkSuccessfulTransactionWorkTrxUser",
    "outSuccessfulTransactionWorkSuccessfulTransactionWorkTrxUsrSn",
    "outSuccessfulTransactionWorkSuccessfulTransactionWorkTunInternalSn",
    "outValidationDatafieldsResultIefSuppliedChar1",
    "outGrpErrorMsgDatafields",
    "outGrpMessageErrors"
})
public class DTF099VElectronicFundsTransferExport
    extends BaseExport
{

    @XmlElement(name = "OutIpsMessageHeaderBenefCustId")
    protected int outIpsMessageHeaderBenefCustId;
    @XmlElement(name = "OutIpsMessageHeaderBenefFullname")
    protected String outIpsMessageHeaderBenefFullname;
    @XmlElement(name = "OutIpsMessageHeaderBenefResident")
    protected String outIpsMessageHeaderBenefResident;
    @XmlElement(name = "OutIpsMessageHeaderChargeBearer")
    protected String outIpsMessageHeaderChargeBearer;
    @XmlElement(name = "OutIpsMessageHeaderChargesAccSystem")
    protected short outIpsMessageHeaderChargesAccSystem;
    @XmlElement(name = "OutIpsMessageHeaderChargesAccount")
    protected String outIpsMessageHeaderChargesAccount;
    @XmlElement(name = "OutIpsMessageHeaderChargesDiscount", required = true)
    protected BigDecimal outIpsMessageHeaderChargesDiscount;
    @XmlElement(name = "OutIpsMessageHeaderChargesJustific")
    protected int outIpsMessageHeaderChargesJustific;
    @XmlElement(name = "OutIpsMessageHeaderClearingSystem")
    protected String outIpsMessageHeaderClearingSystem;
    @XmlElement(name = "OutIpsMessageHeaderCollectedAmount", required = true)
    protected BigDecimal outIpsMessageHeaderCollectedAmount;
    @XmlElement(name = "OutIpsMessageHeaderComboJustific")
    protected int outIpsMessageHeaderComboJustific;
    @XmlElement(name = "OutIpsMessageHeaderComboTransaction")
    protected int outIpsMessageHeaderComboTransaction;
    @XmlElement(name = "OutIpsMessageHeaderComments")
    protected String outIpsMessageHeaderComments;
    @XmlElement(name = "OutIpsMessageHeaderCommissionDiscount", required = true)
    protected BigDecimal outIpsMessageHeaderCommissionDiscount;
    @XmlElement(name = "OutIpsMessageHeaderCompleteMessage")
    protected String outIpsMessageHeaderCompleteMessage;
    @XmlElement(name = "OutIpsMessageHeaderCreditBicAddress")
    protected String outIpsMessageHeaderCreditBicAddress;
    @XmlElement(name = "OutIpsMessageHeaderDealerRefNo")
    protected String outIpsMessageHeaderDealerRefNo;
    @XmlElement(name = "OutIpsMessageHeaderDealerUsr")
    protected String outIpsMessageHeaderDealerUsr;
    @XmlElement(name = "OutIpsMessageHeaderDebitBicAddress")
    protected String outIpsMessageHeaderDebitBicAddress;
    @XmlElement(name = "OutIpsMessageHeaderExpenseJustific")
    protected int outIpsMessageHeaderExpenseJustific;
    @XmlElement(name = "OutIpsMessageHeaderExpenseProdDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outIpsMessageHeaderExpenseProdDate;
    @XmlElement(name = "OutIpsMessageHeaderExternalIdRef")
    protected String outIpsMessageHeaderExternalIdRef;
    @XmlElement(name = "OutIpsMessageHeaderFkOrderCode")
    protected String outIpsMessageHeaderFkOrderCode;
    @XmlElement(name = "OutIpsMessageHeaderGenericAccount")
    protected String outIpsMessageHeaderGenericAccount;
    @XmlElement(name = "OutIpsMessageHeaderIssuerCustId")
    protected int outIpsMessageHeaderIssuerCustId;
    @XmlElement(name = "OutIpsMessageHeaderIssuerFullname")
    protected String outIpsMessageHeaderIssuerFullname;
    @XmlElement(name = "OutIpsMessageHeaderIssuerProdDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outIpsMessageHeaderIssuerProdDate;
    @XmlElement(name = "OutIpsMessageHeaderIssuerResident")
    protected String outIpsMessageHeaderIssuerResident;
    @XmlElement(name = "OutIpsMessageHeaderItemSerialNumber")
    protected double outIpsMessageHeaderItemSerialNumber;
    @XmlElement(name = "OutIpsMessageHeaderJustificId")
    protected int outIpsMessageHeaderJustificId;
    @XmlElement(name = "OutIpsMessageHeaderOrderAmount", required = true)
    protected BigDecimal outIpsMessageHeaderOrderAmount;
    @XmlElement(name = "OutIpsMessageHeaderOrderCode")
    protected String outIpsMessageHeaderOrderCode;
    @XmlElement(name = "OutIpsMessageHeaderOrderCommission", required = true)
    protected BigDecimal outIpsMessageHeaderOrderCommission;
    @XmlElement(name = "OutIpsMessageHeaderOrderCurrency")
    protected int outIpsMessageHeaderOrderCurrency;
    @XmlElement(name = "OutIpsMessageHeaderOrderExpense", required = true)
    protected BigDecimal outIpsMessageHeaderOrderExpense;
    @XmlElement(name = "OutIpsMessageHeaderOrderFileLine")
    protected int outIpsMessageHeaderOrderFileLine;
    @XmlElement(name = "OutIpsMessageHeaderOrderFilename")
    protected String outIpsMessageHeaderOrderFilename;
    @XmlElement(name = "OutIpsMessageHeaderOrderStatus")
    protected String outIpsMessageHeaderOrderStatus;
    @XmlElement(name = "OutIpsMessageHeaderOrderTimestamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outIpsMessageHeaderOrderTimestamp;
    @XmlElement(name = "OutIpsMessageHeaderOrderType")
    protected String outIpsMessageHeaderOrderType;
    @XmlElement(name = "OutIpsMessageHeaderPrftAccSystem")
    protected short outIpsMessageHeaderPrftAccSystem;
    @XmlElement(name = "OutIpsMessageHeaderPrftAccount")
    protected String outIpsMessageHeaderPrftAccount;
    @XmlElement(name = "OutIpsMessageHeaderProcessResults")
    protected String outIpsMessageHeaderProcessResults;
    @XmlElement(name = "OutIpsMessageHeaderRejectionCode")
    protected String outIpsMessageHeaderRejectionCode;
    @XmlElement(name = "OutIpsMessageHeaderRemittanceInfo")
    protected String outIpsMessageHeaderRemittanceInfo;
    @XmlElement(name = "OutIpsMessageHeaderServiceProduct")
    protected int outIpsMessageHeaderServiceProduct;
    @XmlElement(name = "OutIpsMessageHeaderSettlementAmnt", required = true)
    protected BigDecimal outIpsMessageHeaderSettlementAmnt;
    @XmlElement(name = "OutIpsMessageHeaderTrxCode")
    protected int outIpsMessageHeaderTrxCode;
    @XmlElement(name = "OutIpsMessageHeaderTrxDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outIpsMessageHeaderTrxDate;
    @XmlElement(name = "OutIpsMessageHeaderTrxUnit")
    protected int outIpsMessageHeaderTrxUnit;
    @XmlElement(name = "OutStatusIefSuppliedActionEntryDesc")
    protected String outStatusIefSuppliedActionEntryDesc;
    @XmlElement(name = "OutStatusIefSuppliedActionEntryMsg")
    protected String outStatusIefSuppliedActionEntryMsg;
    @XmlElement(name = "OutSuccessfulTransactionWorkSuccessfulTransactionWorkAdviceCounter")
    protected int outSuccessfulTransactionWorkSuccessfulTransactionWorkAdviceCounter;
    @XmlElement(name = "OutSuccessfulTransactionWorkSuccessfulTransactionWorkAdviceTitle")
    protected String outSuccessfulTransactionWorkSuccessfulTransactionWorkAdviceTitle;
    @XmlElement(name = "OutSuccessfulTransactionWorkSuccessfulTransactionWorkDatetimestamp")
    protected String outSuccessfulTransactionWorkSuccessfulTransactionWorkDatetimestamp;
    @XmlElement(name = "OutSuccessfulTransactionWorkSuccessfulTransactionWorkTrxDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outSuccessfulTransactionWorkSuccessfulTransactionWorkTrxDate;
    @XmlElement(name = "OutSuccessfulTransactionWorkSuccessfulTransactionWorkTrxUnit")
    protected int outSuccessfulTransactionWorkSuccessfulTransactionWorkTrxUnit;
    @XmlElement(name = "OutSuccessfulTransactionWorkSuccessfulTransactionWorkTrxUser")
    protected String outSuccessfulTransactionWorkSuccessfulTransactionWorkTrxUser;
    @XmlElement(name = "OutSuccessfulTransactionWorkSuccessfulTransactionWorkTrxUsrSn")
    protected int outSuccessfulTransactionWorkSuccessfulTransactionWorkTrxUsrSn;
    @XmlElement(name = "OutSuccessfulTransactionWorkSuccessfulTransactionWorkTunInternalSn")
    protected short outSuccessfulTransactionWorkSuccessfulTransactionWorkTunInternalSn;
    @XmlElement(name = "OutValidationDatafieldsResultIefSuppliedChar1")
    protected String outValidationDatafieldsResultIefSuppliedChar1;
    @XmlElement(name = "OutGrpErrorMsgDatafields")
    protected ArrayOfDTF099VOutGrpErrorMsgDatafieldsItem outGrpErrorMsgDatafields;
    @XmlElement(name = "OutGrpMessageErrors")
    protected ArrayOfDTF099VOutGrpMessageErrorsItem outGrpMessageErrors;

    /**
     * Gets the value of the outIpsMessageHeaderBenefCustId property.
     * 
     */
    public int getOutIpsMessageHeaderBenefCustId() {
        return outIpsMessageHeaderBenefCustId;
    }

    /**
     * Sets the value of the outIpsMessageHeaderBenefCustId property.
     * 
     */
    public void setOutIpsMessageHeaderBenefCustId(int value) {
        this.outIpsMessageHeaderBenefCustId = value;
    }

    /**
     * Gets the value of the outIpsMessageHeaderBenefFullname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutIpsMessageHeaderBenefFullname() {
        return outIpsMessageHeaderBenefFullname;
    }

    /**
     * Sets the value of the outIpsMessageHeaderBenefFullname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutIpsMessageHeaderBenefFullname(String value) {
        this.outIpsMessageHeaderBenefFullname = value;
    }

    /**
     * Gets the value of the outIpsMessageHeaderBenefResident property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutIpsMessageHeaderBenefResident() {
        return outIpsMessageHeaderBenefResident;
    }

    /**
     * Sets the value of the outIpsMessageHeaderBenefResident property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutIpsMessageHeaderBenefResident(String value) {
        this.outIpsMessageHeaderBenefResident = value;
    }

    /**
     * Gets the value of the outIpsMessageHeaderChargeBearer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutIpsMessageHeaderChargeBearer() {
        return outIpsMessageHeaderChargeBearer;
    }

    /**
     * Sets the value of the outIpsMessageHeaderChargeBearer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutIpsMessageHeaderChargeBearer(String value) {
        this.outIpsMessageHeaderChargeBearer = value;
    }

    /**
     * Gets the value of the outIpsMessageHeaderChargesAccSystem property.
     * 
     */
    public short getOutIpsMessageHeaderChargesAccSystem() {
        return outIpsMessageHeaderChargesAccSystem;
    }

    /**
     * Sets the value of the outIpsMessageHeaderChargesAccSystem property.
     * 
     */
    public void setOutIpsMessageHeaderChargesAccSystem(short value) {
        this.outIpsMessageHeaderChargesAccSystem = value;
    }

    /**
     * Gets the value of the outIpsMessageHeaderChargesAccount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutIpsMessageHeaderChargesAccount() {
        return outIpsMessageHeaderChargesAccount;
    }

    /**
     * Sets the value of the outIpsMessageHeaderChargesAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutIpsMessageHeaderChargesAccount(String value) {
        this.outIpsMessageHeaderChargesAccount = value;
    }

    /**
     * Gets the value of the outIpsMessageHeaderChargesDiscount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutIpsMessageHeaderChargesDiscount() {
        return outIpsMessageHeaderChargesDiscount;
    }

    /**
     * Sets the value of the outIpsMessageHeaderChargesDiscount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutIpsMessageHeaderChargesDiscount(BigDecimal value) {
        this.outIpsMessageHeaderChargesDiscount = value;
    }

    /**
     * Gets the value of the outIpsMessageHeaderChargesJustific property.
     * 
     */
    public int getOutIpsMessageHeaderChargesJustific() {
        return outIpsMessageHeaderChargesJustific;
    }

    /**
     * Sets the value of the outIpsMessageHeaderChargesJustific property.
     * 
     */
    public void setOutIpsMessageHeaderChargesJustific(int value) {
        this.outIpsMessageHeaderChargesJustific = value;
    }

    /**
     * Gets the value of the outIpsMessageHeaderClearingSystem property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutIpsMessageHeaderClearingSystem() {
        return outIpsMessageHeaderClearingSystem;
    }

    /**
     * Sets the value of the outIpsMessageHeaderClearingSystem property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutIpsMessageHeaderClearingSystem(String value) {
        this.outIpsMessageHeaderClearingSystem = value;
    }

    /**
     * Gets the value of the outIpsMessageHeaderCollectedAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutIpsMessageHeaderCollectedAmount() {
        return outIpsMessageHeaderCollectedAmount;
    }

    /**
     * Sets the value of the outIpsMessageHeaderCollectedAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutIpsMessageHeaderCollectedAmount(BigDecimal value) {
        this.outIpsMessageHeaderCollectedAmount = value;
    }

    /**
     * Gets the value of the outIpsMessageHeaderComboJustific property.
     * 
     */
    public int getOutIpsMessageHeaderComboJustific() {
        return outIpsMessageHeaderComboJustific;
    }

    /**
     * Sets the value of the outIpsMessageHeaderComboJustific property.
     * 
     */
    public void setOutIpsMessageHeaderComboJustific(int value) {
        this.outIpsMessageHeaderComboJustific = value;
    }

    /**
     * Gets the value of the outIpsMessageHeaderComboTransaction property.
     * 
     */
    public int getOutIpsMessageHeaderComboTransaction() {
        return outIpsMessageHeaderComboTransaction;
    }

    /**
     * Sets the value of the outIpsMessageHeaderComboTransaction property.
     * 
     */
    public void setOutIpsMessageHeaderComboTransaction(int value) {
        this.outIpsMessageHeaderComboTransaction = value;
    }

    /**
     * Gets the value of the outIpsMessageHeaderComments property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutIpsMessageHeaderComments() {
        return outIpsMessageHeaderComments;
    }

    /**
     * Sets the value of the outIpsMessageHeaderComments property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutIpsMessageHeaderComments(String value) {
        this.outIpsMessageHeaderComments = value;
    }

    /**
     * Gets the value of the outIpsMessageHeaderCommissionDiscount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutIpsMessageHeaderCommissionDiscount() {
        return outIpsMessageHeaderCommissionDiscount;
    }

    /**
     * Sets the value of the outIpsMessageHeaderCommissionDiscount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutIpsMessageHeaderCommissionDiscount(BigDecimal value) {
        this.outIpsMessageHeaderCommissionDiscount = value;
    }

    /**
     * Gets the value of the outIpsMessageHeaderCompleteMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutIpsMessageHeaderCompleteMessage() {
        return outIpsMessageHeaderCompleteMessage;
    }

    /**
     * Sets the value of the outIpsMessageHeaderCompleteMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutIpsMessageHeaderCompleteMessage(String value) {
        this.outIpsMessageHeaderCompleteMessage = value;
    }

    /**
     * Gets the value of the outIpsMessageHeaderCreditBicAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutIpsMessageHeaderCreditBicAddress() {
        return outIpsMessageHeaderCreditBicAddress;
    }

    /**
     * Sets the value of the outIpsMessageHeaderCreditBicAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutIpsMessageHeaderCreditBicAddress(String value) {
        this.outIpsMessageHeaderCreditBicAddress = value;
    }

    /**
     * Gets the value of the outIpsMessageHeaderDealerRefNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutIpsMessageHeaderDealerRefNo() {
        return outIpsMessageHeaderDealerRefNo;
    }

    /**
     * Sets the value of the outIpsMessageHeaderDealerRefNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutIpsMessageHeaderDealerRefNo(String value) {
        this.outIpsMessageHeaderDealerRefNo = value;
    }

    /**
     * Gets the value of the outIpsMessageHeaderDealerUsr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutIpsMessageHeaderDealerUsr() {
        return outIpsMessageHeaderDealerUsr;
    }

    /**
     * Sets the value of the outIpsMessageHeaderDealerUsr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutIpsMessageHeaderDealerUsr(String value) {
        this.outIpsMessageHeaderDealerUsr = value;
    }

    /**
     * Gets the value of the outIpsMessageHeaderDebitBicAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutIpsMessageHeaderDebitBicAddress() {
        return outIpsMessageHeaderDebitBicAddress;
    }

    /**
     * Sets the value of the outIpsMessageHeaderDebitBicAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutIpsMessageHeaderDebitBicAddress(String value) {
        this.outIpsMessageHeaderDebitBicAddress = value;
    }

    /**
     * Gets the value of the outIpsMessageHeaderExpenseJustific property.
     * 
     */
    public int getOutIpsMessageHeaderExpenseJustific() {
        return outIpsMessageHeaderExpenseJustific;
    }

    /**
     * Sets the value of the outIpsMessageHeaderExpenseJustific property.
     * 
     */
    public void setOutIpsMessageHeaderExpenseJustific(int value) {
        this.outIpsMessageHeaderExpenseJustific = value;
    }

    /**
     * Gets the value of the outIpsMessageHeaderExpenseProdDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutIpsMessageHeaderExpenseProdDate() {
        return outIpsMessageHeaderExpenseProdDate;
    }

    /**
     * Sets the value of the outIpsMessageHeaderExpenseProdDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutIpsMessageHeaderExpenseProdDate(XMLGregorianCalendar value) {
        this.outIpsMessageHeaderExpenseProdDate = value;
    }

    /**
     * Gets the value of the outIpsMessageHeaderExternalIdRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutIpsMessageHeaderExternalIdRef() {
        return outIpsMessageHeaderExternalIdRef;
    }

    /**
     * Sets the value of the outIpsMessageHeaderExternalIdRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutIpsMessageHeaderExternalIdRef(String value) {
        this.outIpsMessageHeaderExternalIdRef = value;
    }

    /**
     * Gets the value of the outIpsMessageHeaderFkOrderCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutIpsMessageHeaderFkOrderCode() {
        return outIpsMessageHeaderFkOrderCode;
    }

    /**
     * Sets the value of the outIpsMessageHeaderFkOrderCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutIpsMessageHeaderFkOrderCode(String value) {
        this.outIpsMessageHeaderFkOrderCode = value;
    }

    /**
     * Gets the value of the outIpsMessageHeaderGenericAccount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutIpsMessageHeaderGenericAccount() {
        return outIpsMessageHeaderGenericAccount;
    }

    /**
     * Sets the value of the outIpsMessageHeaderGenericAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutIpsMessageHeaderGenericAccount(String value) {
        this.outIpsMessageHeaderGenericAccount = value;
    }

    /**
     * Gets the value of the outIpsMessageHeaderIssuerCustId property.
     * 
     */
    public int getOutIpsMessageHeaderIssuerCustId() {
        return outIpsMessageHeaderIssuerCustId;
    }

    /**
     * Sets the value of the outIpsMessageHeaderIssuerCustId property.
     * 
     */
    public void setOutIpsMessageHeaderIssuerCustId(int value) {
        this.outIpsMessageHeaderIssuerCustId = value;
    }

    /**
     * Gets the value of the outIpsMessageHeaderIssuerFullname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutIpsMessageHeaderIssuerFullname() {
        return outIpsMessageHeaderIssuerFullname;
    }

    /**
     * Sets the value of the outIpsMessageHeaderIssuerFullname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutIpsMessageHeaderIssuerFullname(String value) {
        this.outIpsMessageHeaderIssuerFullname = value;
    }

    /**
     * Gets the value of the outIpsMessageHeaderIssuerProdDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutIpsMessageHeaderIssuerProdDate() {
        return outIpsMessageHeaderIssuerProdDate;
    }

    /**
     * Sets the value of the outIpsMessageHeaderIssuerProdDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutIpsMessageHeaderIssuerProdDate(XMLGregorianCalendar value) {
        this.outIpsMessageHeaderIssuerProdDate = value;
    }

    /**
     * Gets the value of the outIpsMessageHeaderIssuerResident property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutIpsMessageHeaderIssuerResident() {
        return outIpsMessageHeaderIssuerResident;
    }

    /**
     * Sets the value of the outIpsMessageHeaderIssuerResident property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutIpsMessageHeaderIssuerResident(String value) {
        this.outIpsMessageHeaderIssuerResident = value;
    }

    /**
     * Gets the value of the outIpsMessageHeaderItemSerialNumber property.
     * 
     */
    public double getOutIpsMessageHeaderItemSerialNumber() {
        return outIpsMessageHeaderItemSerialNumber;
    }

    /**
     * Sets the value of the outIpsMessageHeaderItemSerialNumber property.
     * 
     */
    public void setOutIpsMessageHeaderItemSerialNumber(double value) {
        this.outIpsMessageHeaderItemSerialNumber = value;
    }

    /**
     * Gets the value of the outIpsMessageHeaderJustificId property.
     * 
     */
    public int getOutIpsMessageHeaderJustificId() {
        return outIpsMessageHeaderJustificId;
    }

    /**
     * Sets the value of the outIpsMessageHeaderJustificId property.
     * 
     */
    public void setOutIpsMessageHeaderJustificId(int value) {
        this.outIpsMessageHeaderJustificId = value;
    }

    /**
     * Gets the value of the outIpsMessageHeaderOrderAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutIpsMessageHeaderOrderAmount() {
        return outIpsMessageHeaderOrderAmount;
    }

    /**
     * Sets the value of the outIpsMessageHeaderOrderAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutIpsMessageHeaderOrderAmount(BigDecimal value) {
        this.outIpsMessageHeaderOrderAmount = value;
    }

    /**
     * Gets the value of the outIpsMessageHeaderOrderCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutIpsMessageHeaderOrderCode() {
        return outIpsMessageHeaderOrderCode;
    }

    /**
     * Sets the value of the outIpsMessageHeaderOrderCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutIpsMessageHeaderOrderCode(String value) {
        this.outIpsMessageHeaderOrderCode = value;
    }

    /**
     * Gets the value of the outIpsMessageHeaderOrderCommission property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutIpsMessageHeaderOrderCommission() {
        return outIpsMessageHeaderOrderCommission;
    }

    /**
     * Sets the value of the outIpsMessageHeaderOrderCommission property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutIpsMessageHeaderOrderCommission(BigDecimal value) {
        this.outIpsMessageHeaderOrderCommission = value;
    }

    /**
     * Gets the value of the outIpsMessageHeaderOrderCurrency property.
     * 
     */
    public int getOutIpsMessageHeaderOrderCurrency() {
        return outIpsMessageHeaderOrderCurrency;
    }

    /**
     * Sets the value of the outIpsMessageHeaderOrderCurrency property.
     * 
     */
    public void setOutIpsMessageHeaderOrderCurrency(int value) {
        this.outIpsMessageHeaderOrderCurrency = value;
    }

    /**
     * Gets the value of the outIpsMessageHeaderOrderExpense property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutIpsMessageHeaderOrderExpense() {
        return outIpsMessageHeaderOrderExpense;
    }

    /**
     * Sets the value of the outIpsMessageHeaderOrderExpense property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutIpsMessageHeaderOrderExpense(BigDecimal value) {
        this.outIpsMessageHeaderOrderExpense = value;
    }

    /**
     * Gets the value of the outIpsMessageHeaderOrderFileLine property.
     * 
     */
    public int getOutIpsMessageHeaderOrderFileLine() {
        return outIpsMessageHeaderOrderFileLine;
    }

    /**
     * Sets the value of the outIpsMessageHeaderOrderFileLine property.
     * 
     */
    public void setOutIpsMessageHeaderOrderFileLine(int value) {
        this.outIpsMessageHeaderOrderFileLine = value;
    }

    /**
     * Gets the value of the outIpsMessageHeaderOrderFilename property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutIpsMessageHeaderOrderFilename() {
        return outIpsMessageHeaderOrderFilename;
    }

    /**
     * Sets the value of the outIpsMessageHeaderOrderFilename property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutIpsMessageHeaderOrderFilename(String value) {
        this.outIpsMessageHeaderOrderFilename = value;
    }

    /**
     * Gets the value of the outIpsMessageHeaderOrderStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutIpsMessageHeaderOrderStatus() {
        return outIpsMessageHeaderOrderStatus;
    }

    /**
     * Sets the value of the outIpsMessageHeaderOrderStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutIpsMessageHeaderOrderStatus(String value) {
        this.outIpsMessageHeaderOrderStatus = value;
    }

    /**
     * Gets the value of the outIpsMessageHeaderOrderTimestamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutIpsMessageHeaderOrderTimestamp() {
        return outIpsMessageHeaderOrderTimestamp;
    }

    /**
     * Sets the value of the outIpsMessageHeaderOrderTimestamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutIpsMessageHeaderOrderTimestamp(XMLGregorianCalendar value) {
        this.outIpsMessageHeaderOrderTimestamp = value;
    }

    /**
     * Gets the value of the outIpsMessageHeaderOrderType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutIpsMessageHeaderOrderType() {
        return outIpsMessageHeaderOrderType;
    }

    /**
     * Sets the value of the outIpsMessageHeaderOrderType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutIpsMessageHeaderOrderType(String value) {
        this.outIpsMessageHeaderOrderType = value;
    }

    /**
     * Gets the value of the outIpsMessageHeaderPrftAccSystem property.
     * 
     */
    public short getOutIpsMessageHeaderPrftAccSystem() {
        return outIpsMessageHeaderPrftAccSystem;
    }

    /**
     * Sets the value of the outIpsMessageHeaderPrftAccSystem property.
     * 
     */
    public void setOutIpsMessageHeaderPrftAccSystem(short value) {
        this.outIpsMessageHeaderPrftAccSystem = value;
    }

    /**
     * Gets the value of the outIpsMessageHeaderPrftAccount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutIpsMessageHeaderPrftAccount() {
        return outIpsMessageHeaderPrftAccount;
    }

    /**
     * Sets the value of the outIpsMessageHeaderPrftAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutIpsMessageHeaderPrftAccount(String value) {
        this.outIpsMessageHeaderPrftAccount = value;
    }

    /**
     * Gets the value of the outIpsMessageHeaderProcessResults property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutIpsMessageHeaderProcessResults() {
        return outIpsMessageHeaderProcessResults;
    }

    /**
     * Sets the value of the outIpsMessageHeaderProcessResults property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutIpsMessageHeaderProcessResults(String value) {
        this.outIpsMessageHeaderProcessResults = value;
    }

    /**
     * Gets the value of the outIpsMessageHeaderRejectionCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutIpsMessageHeaderRejectionCode() {
        return outIpsMessageHeaderRejectionCode;
    }

    /**
     * Sets the value of the outIpsMessageHeaderRejectionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutIpsMessageHeaderRejectionCode(String value) {
        this.outIpsMessageHeaderRejectionCode = value;
    }

    /**
     * Gets the value of the outIpsMessageHeaderRemittanceInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutIpsMessageHeaderRemittanceInfo() {
        return outIpsMessageHeaderRemittanceInfo;
    }

    /**
     * Sets the value of the outIpsMessageHeaderRemittanceInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutIpsMessageHeaderRemittanceInfo(String value) {
        this.outIpsMessageHeaderRemittanceInfo = value;
    }

    /**
     * Gets the value of the outIpsMessageHeaderServiceProduct property.
     * 
     */
    public int getOutIpsMessageHeaderServiceProduct() {
        return outIpsMessageHeaderServiceProduct;
    }

    /**
     * Sets the value of the outIpsMessageHeaderServiceProduct property.
     * 
     */
    public void setOutIpsMessageHeaderServiceProduct(int value) {
        this.outIpsMessageHeaderServiceProduct = value;
    }

    /**
     * Gets the value of the outIpsMessageHeaderSettlementAmnt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutIpsMessageHeaderSettlementAmnt() {
        return outIpsMessageHeaderSettlementAmnt;
    }

    /**
     * Sets the value of the outIpsMessageHeaderSettlementAmnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutIpsMessageHeaderSettlementAmnt(BigDecimal value) {
        this.outIpsMessageHeaderSettlementAmnt = value;
    }

    /**
     * Gets the value of the outIpsMessageHeaderTrxCode property.
     * 
     */
    public int getOutIpsMessageHeaderTrxCode() {
        return outIpsMessageHeaderTrxCode;
    }

    /**
     * Sets the value of the outIpsMessageHeaderTrxCode property.
     * 
     */
    public void setOutIpsMessageHeaderTrxCode(int value) {
        this.outIpsMessageHeaderTrxCode = value;
    }

    /**
     * Gets the value of the outIpsMessageHeaderTrxDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutIpsMessageHeaderTrxDate() {
        return outIpsMessageHeaderTrxDate;
    }

    /**
     * Sets the value of the outIpsMessageHeaderTrxDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutIpsMessageHeaderTrxDate(XMLGregorianCalendar value) {
        this.outIpsMessageHeaderTrxDate = value;
    }

    /**
     * Gets the value of the outIpsMessageHeaderTrxUnit property.
     * 
     */
    public int getOutIpsMessageHeaderTrxUnit() {
        return outIpsMessageHeaderTrxUnit;
    }

    /**
     * Sets the value of the outIpsMessageHeaderTrxUnit property.
     * 
     */
    public void setOutIpsMessageHeaderTrxUnit(int value) {
        this.outIpsMessageHeaderTrxUnit = value;
    }

    /**
     * Gets the value of the outStatusIefSuppliedActionEntryDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutStatusIefSuppliedActionEntryDesc() {
        return outStatusIefSuppliedActionEntryDesc;
    }

    /**
     * Sets the value of the outStatusIefSuppliedActionEntryDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutStatusIefSuppliedActionEntryDesc(String value) {
        this.outStatusIefSuppliedActionEntryDesc = value;
    }

    /**
     * Gets the value of the outStatusIefSuppliedActionEntryMsg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutStatusIefSuppliedActionEntryMsg() {
        return outStatusIefSuppliedActionEntryMsg;
    }

    /**
     * Sets the value of the outStatusIefSuppliedActionEntryMsg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutStatusIefSuppliedActionEntryMsg(String value) {
        this.outStatusIefSuppliedActionEntryMsg = value;
    }

    /**
     * Gets the value of the outSuccessfulTransactionWorkSuccessfulTransactionWorkAdviceCounter property.
     * 
     */
    public int getOutSuccessfulTransactionWorkSuccessfulTransactionWorkAdviceCounter() {
        return outSuccessfulTransactionWorkSuccessfulTransactionWorkAdviceCounter;
    }

    /**
     * Sets the value of the outSuccessfulTransactionWorkSuccessfulTransactionWorkAdviceCounter property.
     * 
     */
    public void setOutSuccessfulTransactionWorkSuccessfulTransactionWorkAdviceCounter(int value) {
        this.outSuccessfulTransactionWorkSuccessfulTransactionWorkAdviceCounter = value;
    }

    /**
     * Gets the value of the outSuccessfulTransactionWorkSuccessfulTransactionWorkAdviceTitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSuccessfulTransactionWorkSuccessfulTransactionWorkAdviceTitle() {
        return outSuccessfulTransactionWorkSuccessfulTransactionWorkAdviceTitle;
    }

    /**
     * Sets the value of the outSuccessfulTransactionWorkSuccessfulTransactionWorkAdviceTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSuccessfulTransactionWorkSuccessfulTransactionWorkAdviceTitle(String value) {
        this.outSuccessfulTransactionWorkSuccessfulTransactionWorkAdviceTitle = value;
    }

    /**
     * Gets the value of the outSuccessfulTransactionWorkSuccessfulTransactionWorkDatetimestamp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSuccessfulTransactionWorkSuccessfulTransactionWorkDatetimestamp() {
        return outSuccessfulTransactionWorkSuccessfulTransactionWorkDatetimestamp;
    }

    /**
     * Sets the value of the outSuccessfulTransactionWorkSuccessfulTransactionWorkDatetimestamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSuccessfulTransactionWorkSuccessfulTransactionWorkDatetimestamp(String value) {
        this.outSuccessfulTransactionWorkSuccessfulTransactionWorkDatetimestamp = value;
    }

    /**
     * Gets the value of the outSuccessfulTransactionWorkSuccessfulTransactionWorkTrxDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutSuccessfulTransactionWorkSuccessfulTransactionWorkTrxDate() {
        return outSuccessfulTransactionWorkSuccessfulTransactionWorkTrxDate;
    }

    /**
     * Sets the value of the outSuccessfulTransactionWorkSuccessfulTransactionWorkTrxDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutSuccessfulTransactionWorkSuccessfulTransactionWorkTrxDate(XMLGregorianCalendar value) {
        this.outSuccessfulTransactionWorkSuccessfulTransactionWorkTrxDate = value;
    }

    /**
     * Gets the value of the outSuccessfulTransactionWorkSuccessfulTransactionWorkTrxUnit property.
     * 
     */
    public int getOutSuccessfulTransactionWorkSuccessfulTransactionWorkTrxUnit() {
        return outSuccessfulTransactionWorkSuccessfulTransactionWorkTrxUnit;
    }

    /**
     * Sets the value of the outSuccessfulTransactionWorkSuccessfulTransactionWorkTrxUnit property.
     * 
     */
    public void setOutSuccessfulTransactionWorkSuccessfulTransactionWorkTrxUnit(int value) {
        this.outSuccessfulTransactionWorkSuccessfulTransactionWorkTrxUnit = value;
    }

    /**
     * Gets the value of the outSuccessfulTransactionWorkSuccessfulTransactionWorkTrxUser property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSuccessfulTransactionWorkSuccessfulTransactionWorkTrxUser() {
        return outSuccessfulTransactionWorkSuccessfulTransactionWorkTrxUser;
    }

    /**
     * Sets the value of the outSuccessfulTransactionWorkSuccessfulTransactionWorkTrxUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSuccessfulTransactionWorkSuccessfulTransactionWorkTrxUser(String value) {
        this.outSuccessfulTransactionWorkSuccessfulTransactionWorkTrxUser = value;
    }

    /**
     * Gets the value of the outSuccessfulTransactionWorkSuccessfulTransactionWorkTrxUsrSn property.
     * 
     */
    public int getOutSuccessfulTransactionWorkSuccessfulTransactionWorkTrxUsrSn() {
        return outSuccessfulTransactionWorkSuccessfulTransactionWorkTrxUsrSn;
    }

    /**
     * Sets the value of the outSuccessfulTransactionWorkSuccessfulTransactionWorkTrxUsrSn property.
     * 
     */
    public void setOutSuccessfulTransactionWorkSuccessfulTransactionWorkTrxUsrSn(int value) {
        this.outSuccessfulTransactionWorkSuccessfulTransactionWorkTrxUsrSn = value;
    }

    /**
     * Gets the value of the outSuccessfulTransactionWorkSuccessfulTransactionWorkTunInternalSn property.
     * 
     */
    public short getOutSuccessfulTransactionWorkSuccessfulTransactionWorkTunInternalSn() {
        return outSuccessfulTransactionWorkSuccessfulTransactionWorkTunInternalSn;
    }

    /**
     * Sets the value of the outSuccessfulTransactionWorkSuccessfulTransactionWorkTunInternalSn property.
     * 
     */
    public void setOutSuccessfulTransactionWorkSuccessfulTransactionWorkTunInternalSn(short value) {
        this.outSuccessfulTransactionWorkSuccessfulTransactionWorkTunInternalSn = value;
    }

    /**
     * Gets the value of the outValidationDatafieldsResultIefSuppliedChar1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutValidationDatafieldsResultIefSuppliedChar1() {
        return outValidationDatafieldsResultIefSuppliedChar1;
    }

    /**
     * Sets the value of the outValidationDatafieldsResultIefSuppliedChar1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutValidationDatafieldsResultIefSuppliedChar1(String value) {
        this.outValidationDatafieldsResultIefSuppliedChar1 = value;
    }

    /**
     * Gets the value of the outGrpErrorMsgDatafields property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDTF099VOutGrpErrorMsgDatafieldsItem }
     *     
     */
    public ArrayOfDTF099VOutGrpErrorMsgDatafieldsItem getOutGrpErrorMsgDatafields() {
        return outGrpErrorMsgDatafields;
    }

    /**
     * Sets the value of the outGrpErrorMsgDatafields property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDTF099VOutGrpErrorMsgDatafieldsItem }
     *     
     */
    public void setOutGrpErrorMsgDatafields(ArrayOfDTF099VOutGrpErrorMsgDatafieldsItem value) {
        this.outGrpErrorMsgDatafields = value;
    }

    /**
     * Gets the value of the outGrpMessageErrors property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDTF099VOutGrpMessageErrorsItem }
     *     
     */
    public ArrayOfDTF099VOutGrpMessageErrorsItem getOutGrpMessageErrors() {
        return outGrpMessageErrors;
    }

    /**
     * Sets the value of the outGrpMessageErrors property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDTF099VOutGrpMessageErrorsItem }
     *     
     */
    public void setOutGrpMessageErrors(ArrayOfDTF099VOutGrpMessageErrorsItem value) {
        this.outGrpMessageErrors = value;
    }

}
