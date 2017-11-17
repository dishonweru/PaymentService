
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for J2117V_ThirdPartyCollectionReversalExport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="J2117V_ThirdPartyCollectionReversalExport">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}BaseExport">
 *       &lt;sequence>
 *         &lt;element name="OutCpAgreementCpAgreementDescr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCpCommitmentAccCustomerCd" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutCpCommitmentAccCustomerId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutCpOlPaymentBenefAddress1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCpOlPaymentBenefAddress2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCpOlPaymentBenefCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCpOlPaymentBenefCountry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCpOlPaymentBenefName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCpOlPaymentBenefTelephone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCpOlPaymentBenefZipCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCpOlPaymentDataField1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCpOlPaymentDataField2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCpOlPaymentDataField3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCpOlPaymentDataField4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCpParVoucherRunVoucherLine" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCpPrftTransactionDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCpPrftTransactionIdTransact" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutCpThirdpartTemplPrompt1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCpThirdpartTemplPrompt2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCpThirdpartTemplPrompt3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCpThirdpartTemplPrompt4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCrOrganCustomerCDigit" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutCrOrganCustomerCustId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutCrOrganLnsSuppliedName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCurrentPrintLineDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutCurrentPrintLineTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutDepParVoucherRunVoucherLine" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutDepSuccessfulTransactionWorkTrxUsrSn" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutDrCustCpOlCollectionBenefAddress1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutDrCustCpOlCollectionBenefAddress2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutDrCustCpOlCollectionBenefCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutDrCustCpOlCollectionBenefCountry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutDrCustCpOlCollectionBenefName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutDrCustCpOlCollectionBenefTelephone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutDrCustCpOlCollectionBenefZipCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutDrCustCpOlCollectionDataField1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutDrCustCpOlCollectionDataField2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutDrCustCpOlCollectionDataField3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutDrCustCpOlCollectionDataField4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutDrCustCurrencyIdCurrency" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutDrCustCurrencyShortDescr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutDrCustDepTrxjustTrnType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutDrCustDepositAccountAccountNumber" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OutDrCustDepositAccountDesignation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutDrCustTrxCountTrxCounter" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutIefSuppliedActionEntryDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutIefSuppliedSrvStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutReversingCpTrxRecordingITrxDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutReversingCpTrxRecordingITrxSn" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutReversingCpTrxRecordingITrxUnit" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutReversingCpTrxRecordingITrxUsr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutServiceJustificDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutServiceJustificIdJustific" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutServiceProductDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutServiceProductIdProduct" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutServiceTrxjustSourceTrnType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutTrxCountTrxCounter" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutTrxRecordingAccAmount1" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutTrxRecordingAccAmount15" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutTrxRecordingAccAmount17" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutTrxRecordingAccAmount18" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutTrxRecordingAccAmount31" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutTrxRecordingOValueDate1" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutTrxRecordingUserTotalAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "J2117V_ThirdPartyCollectionReversalExport", propOrder = {
    "outCpAgreementCpAgreementDescr",
    "outCpCommitmentAccCustomerCd",
    "outCpCommitmentAccCustomerId",
    "outCpOlPaymentBenefAddress1",
    "outCpOlPaymentBenefAddress2",
    "outCpOlPaymentBenefCity",
    "outCpOlPaymentBenefCountry",
    "outCpOlPaymentBenefName",
    "outCpOlPaymentBenefTelephone",
    "outCpOlPaymentBenefZipCode",
    "outCpOlPaymentDataField1",
    "outCpOlPaymentDataField2",
    "outCpOlPaymentDataField3",
    "outCpOlPaymentDataField4",
    "outCpParVoucherRunVoucherLine",
    "outCpPrftTransactionDescription",
    "outCpPrftTransactionIdTransact",
    "outCpThirdpartTemplPrompt1",
    "outCpThirdpartTemplPrompt2",
    "outCpThirdpartTemplPrompt3",
    "outCpThirdpartTemplPrompt4",
    "outCrOrganCustomerCDigit",
    "outCrOrganCustomerCustId",
    "outCrOrganLnsSuppliedName",
    "outCurrentPrintLineDate",
    "outCurrentPrintLineTime",
    "outDepParVoucherRunVoucherLine",
    "outDepSuccessfulTransactionWorkTrxUsrSn",
    "outDrCustCpOlCollectionBenefAddress1",
    "outDrCustCpOlCollectionBenefAddress2",
    "outDrCustCpOlCollectionBenefCity",
    "outDrCustCpOlCollectionBenefCountry",
    "outDrCustCpOlCollectionBenefName",
    "outDrCustCpOlCollectionBenefTelephone",
    "outDrCustCpOlCollectionBenefZipCode",
    "outDrCustCpOlCollectionDataField1",
    "outDrCustCpOlCollectionDataField2",
    "outDrCustCpOlCollectionDataField3",
    "outDrCustCpOlCollectionDataField4",
    "outDrCustCurrencyIdCurrency",
    "outDrCustCurrencyShortDescr",
    "outDrCustDepTrxjustTrnType",
    "outDrCustDepositAccountAccountNumber",
    "outDrCustDepositAccountDesignation",
    "outDrCustTrxCountTrxCounter",
    "outIefSuppliedActionEntryDesc",
    "outIefSuppliedSrvStatus",
    "outReversingCpTrxRecordingITrxDate",
    "outReversingCpTrxRecordingITrxSn",
    "outReversingCpTrxRecordingITrxUnit",
    "outReversingCpTrxRecordingITrxUsr",
    "outServiceJustificDescription",
    "outServiceJustificIdJustific",
    "outServiceProductDescription",
    "outServiceProductIdProduct",
    "outServiceTrxjustSourceTrnType",
    "outTrxCountTrxCounter",
    "outTrxRecordingAccAmount1",
    "outTrxRecordingAccAmount15",
    "outTrxRecordingAccAmount17",
    "outTrxRecordingAccAmount18",
    "outTrxRecordingAccAmount31",
    "outTrxRecordingOValueDate1",
    "outTrxRecordingUserTotalAmn"
})
public class J2117VThirdPartyCollectionReversalExport
    extends BaseExport
{

    @XmlElement(name = "OutCpAgreementCpAgreementDescr")
    protected String outCpAgreementCpAgreementDescr;
    @XmlElement(name = "OutCpCommitmentAccCustomerCd")
    protected short outCpCommitmentAccCustomerCd;
    @XmlElement(name = "OutCpCommitmentAccCustomerId")
    protected int outCpCommitmentAccCustomerId;
    @XmlElement(name = "OutCpOlPaymentBenefAddress1")
    protected String outCpOlPaymentBenefAddress1;
    @XmlElement(name = "OutCpOlPaymentBenefAddress2")
    protected String outCpOlPaymentBenefAddress2;
    @XmlElement(name = "OutCpOlPaymentBenefCity")
    protected String outCpOlPaymentBenefCity;
    @XmlElement(name = "OutCpOlPaymentBenefCountry")
    protected String outCpOlPaymentBenefCountry;
    @XmlElement(name = "OutCpOlPaymentBenefName")
    protected String outCpOlPaymentBenefName;
    @XmlElement(name = "OutCpOlPaymentBenefTelephone")
    protected String outCpOlPaymentBenefTelephone;
    @XmlElement(name = "OutCpOlPaymentBenefZipCode")
    protected String outCpOlPaymentBenefZipCode;
    @XmlElement(name = "OutCpOlPaymentDataField1")
    protected String outCpOlPaymentDataField1;
    @XmlElement(name = "OutCpOlPaymentDataField2")
    protected String outCpOlPaymentDataField2;
    @XmlElement(name = "OutCpOlPaymentDataField3")
    protected String outCpOlPaymentDataField3;
    @XmlElement(name = "OutCpOlPaymentDataField4")
    protected String outCpOlPaymentDataField4;
    @XmlElement(name = "OutCpParVoucherRunVoucherLine")
    protected String outCpParVoucherRunVoucherLine;
    @XmlElement(name = "OutCpPrftTransactionDescription")
    protected String outCpPrftTransactionDescription;
    @XmlElement(name = "OutCpPrftTransactionIdTransact")
    protected int outCpPrftTransactionIdTransact;
    @XmlElement(name = "OutCpThirdpartTemplPrompt1")
    protected String outCpThirdpartTemplPrompt1;
    @XmlElement(name = "OutCpThirdpartTemplPrompt2")
    protected String outCpThirdpartTemplPrompt2;
    @XmlElement(name = "OutCpThirdpartTemplPrompt3")
    protected String outCpThirdpartTemplPrompt3;
    @XmlElement(name = "OutCpThirdpartTemplPrompt4")
    protected String outCpThirdpartTemplPrompt4;
    @XmlElement(name = "OutCrOrganCustomerCDigit")
    protected short outCrOrganCustomerCDigit;
    @XmlElement(name = "OutCrOrganCustomerCustId")
    protected int outCrOrganCustomerCustId;
    @XmlElement(name = "OutCrOrganLnsSuppliedName")
    protected String outCrOrganLnsSuppliedName;
    @XmlElement(name = "OutCurrentPrintLineDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outCurrentPrintLineDate;
    @XmlElement(name = "OutCurrentPrintLineTime", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outCurrentPrintLineTime;
    @XmlElement(name = "OutDepParVoucherRunVoucherLine")
    protected String outDepParVoucherRunVoucherLine;
    @XmlElement(name = "OutDepSuccessfulTransactionWorkTrxUsrSn")
    protected int outDepSuccessfulTransactionWorkTrxUsrSn;
    @XmlElement(name = "OutDrCustCpOlCollectionBenefAddress1")
    protected String outDrCustCpOlCollectionBenefAddress1;
    @XmlElement(name = "OutDrCustCpOlCollectionBenefAddress2")
    protected String outDrCustCpOlCollectionBenefAddress2;
    @XmlElement(name = "OutDrCustCpOlCollectionBenefCity")
    protected String outDrCustCpOlCollectionBenefCity;
    @XmlElement(name = "OutDrCustCpOlCollectionBenefCountry")
    protected String outDrCustCpOlCollectionBenefCountry;
    @XmlElement(name = "OutDrCustCpOlCollectionBenefName")
    protected String outDrCustCpOlCollectionBenefName;
    @XmlElement(name = "OutDrCustCpOlCollectionBenefTelephone")
    protected String outDrCustCpOlCollectionBenefTelephone;
    @XmlElement(name = "OutDrCustCpOlCollectionBenefZipCode")
    protected String outDrCustCpOlCollectionBenefZipCode;
    @XmlElement(name = "OutDrCustCpOlCollectionDataField1")
    protected String outDrCustCpOlCollectionDataField1;
    @XmlElement(name = "OutDrCustCpOlCollectionDataField2")
    protected String outDrCustCpOlCollectionDataField2;
    @XmlElement(name = "OutDrCustCpOlCollectionDataField3")
    protected String outDrCustCpOlCollectionDataField3;
    @XmlElement(name = "OutDrCustCpOlCollectionDataField4")
    protected String outDrCustCpOlCollectionDataField4;
    @XmlElement(name = "OutDrCustCurrencyIdCurrency")
    protected int outDrCustCurrencyIdCurrency;
    @XmlElement(name = "OutDrCustCurrencyShortDescr")
    protected String outDrCustCurrencyShortDescr;
    @XmlElement(name = "OutDrCustDepTrxjustTrnType")
    protected String outDrCustDepTrxjustTrnType;
    @XmlElement(name = "OutDrCustDepositAccountAccountNumber")
    protected double outDrCustDepositAccountAccountNumber;
    @XmlElement(name = "OutDrCustDepositAccountDesignation")
    protected String outDrCustDepositAccountDesignation;
    @XmlElement(name = "OutDrCustTrxCountTrxCounter")
    protected int outDrCustTrxCountTrxCounter;
    @XmlElement(name = "OutIefSuppliedActionEntryDesc")
    protected String outIefSuppliedActionEntryDesc;
    @XmlElement(name = "OutIefSuppliedSrvStatus")
    protected String outIefSuppliedSrvStatus;
    @XmlElement(name = "OutReversingCpTrxRecordingITrxDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outReversingCpTrxRecordingITrxDate;
    @XmlElement(name = "OutReversingCpTrxRecordingITrxSn")
    protected int outReversingCpTrxRecordingITrxSn;
    @XmlElement(name = "OutReversingCpTrxRecordingITrxUnit")
    protected int outReversingCpTrxRecordingITrxUnit;
    @XmlElement(name = "OutReversingCpTrxRecordingITrxUsr")
    protected String outReversingCpTrxRecordingITrxUsr;
    @XmlElement(name = "OutServiceJustificDescription")
    protected String outServiceJustificDescription;
    @XmlElement(name = "OutServiceJustificIdJustific")
    protected int outServiceJustificIdJustific;
    @XmlElement(name = "OutServiceProductDescription")
    protected String outServiceProductDescription;
    @XmlElement(name = "OutServiceProductIdProduct")
    protected int outServiceProductIdProduct;
    @XmlElement(name = "OutServiceTrxjustSourceTrnType")
    protected String outServiceTrxjustSourceTrnType;
    @XmlElement(name = "OutTrxCountTrxCounter")
    protected int outTrxCountTrxCounter;
    @XmlElement(name = "OutTrxRecordingAccAmount1", required = true)
    protected BigDecimal outTrxRecordingAccAmount1;
    @XmlElement(name = "OutTrxRecordingAccAmount15", required = true)
    protected BigDecimal outTrxRecordingAccAmount15;
    @XmlElement(name = "OutTrxRecordingAccAmount17", required = true)
    protected BigDecimal outTrxRecordingAccAmount17;
    @XmlElement(name = "OutTrxRecordingAccAmount18", required = true)
    protected BigDecimal outTrxRecordingAccAmount18;
    @XmlElement(name = "OutTrxRecordingAccAmount31", required = true)
    protected BigDecimal outTrxRecordingAccAmount31;
    @XmlElement(name = "OutTrxRecordingOValueDate1", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outTrxRecordingOValueDate1;
    @XmlElement(name = "OutTrxRecordingUserTotalAmn", required = true)
    protected BigDecimal outTrxRecordingUserTotalAmn;

    /**
     * Gets the value of the outCpAgreementCpAgreementDescr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCpAgreementCpAgreementDescr() {
        return outCpAgreementCpAgreementDescr;
    }

    /**
     * Sets the value of the outCpAgreementCpAgreementDescr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCpAgreementCpAgreementDescr(String value) {
        this.outCpAgreementCpAgreementDescr = value;
    }

    /**
     * Gets the value of the outCpCommitmentAccCustomerCd property.
     * 
     */
    public short getOutCpCommitmentAccCustomerCd() {
        return outCpCommitmentAccCustomerCd;
    }

    /**
     * Sets the value of the outCpCommitmentAccCustomerCd property.
     * 
     */
    public void setOutCpCommitmentAccCustomerCd(short value) {
        this.outCpCommitmentAccCustomerCd = value;
    }

    /**
     * Gets the value of the outCpCommitmentAccCustomerId property.
     * 
     */
    public int getOutCpCommitmentAccCustomerId() {
        return outCpCommitmentAccCustomerId;
    }

    /**
     * Sets the value of the outCpCommitmentAccCustomerId property.
     * 
     */
    public void setOutCpCommitmentAccCustomerId(int value) {
        this.outCpCommitmentAccCustomerId = value;
    }

    /**
     * Gets the value of the outCpOlPaymentBenefAddress1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCpOlPaymentBenefAddress1() {
        return outCpOlPaymentBenefAddress1;
    }

    /**
     * Sets the value of the outCpOlPaymentBenefAddress1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCpOlPaymentBenefAddress1(String value) {
        this.outCpOlPaymentBenefAddress1 = value;
    }

    /**
     * Gets the value of the outCpOlPaymentBenefAddress2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCpOlPaymentBenefAddress2() {
        return outCpOlPaymentBenefAddress2;
    }

    /**
     * Sets the value of the outCpOlPaymentBenefAddress2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCpOlPaymentBenefAddress2(String value) {
        this.outCpOlPaymentBenefAddress2 = value;
    }

    /**
     * Gets the value of the outCpOlPaymentBenefCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCpOlPaymentBenefCity() {
        return outCpOlPaymentBenefCity;
    }

    /**
     * Sets the value of the outCpOlPaymentBenefCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCpOlPaymentBenefCity(String value) {
        this.outCpOlPaymentBenefCity = value;
    }

    /**
     * Gets the value of the outCpOlPaymentBenefCountry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCpOlPaymentBenefCountry() {
        return outCpOlPaymentBenefCountry;
    }

    /**
     * Sets the value of the outCpOlPaymentBenefCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCpOlPaymentBenefCountry(String value) {
        this.outCpOlPaymentBenefCountry = value;
    }

    /**
     * Gets the value of the outCpOlPaymentBenefName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCpOlPaymentBenefName() {
        return outCpOlPaymentBenefName;
    }

    /**
     * Sets the value of the outCpOlPaymentBenefName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCpOlPaymentBenefName(String value) {
        this.outCpOlPaymentBenefName = value;
    }

    /**
     * Gets the value of the outCpOlPaymentBenefTelephone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCpOlPaymentBenefTelephone() {
        return outCpOlPaymentBenefTelephone;
    }

    /**
     * Sets the value of the outCpOlPaymentBenefTelephone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCpOlPaymentBenefTelephone(String value) {
        this.outCpOlPaymentBenefTelephone = value;
    }

    /**
     * Gets the value of the outCpOlPaymentBenefZipCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCpOlPaymentBenefZipCode() {
        return outCpOlPaymentBenefZipCode;
    }

    /**
     * Sets the value of the outCpOlPaymentBenefZipCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCpOlPaymentBenefZipCode(String value) {
        this.outCpOlPaymentBenefZipCode = value;
    }

    /**
     * Gets the value of the outCpOlPaymentDataField1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCpOlPaymentDataField1() {
        return outCpOlPaymentDataField1;
    }

    /**
     * Sets the value of the outCpOlPaymentDataField1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCpOlPaymentDataField1(String value) {
        this.outCpOlPaymentDataField1 = value;
    }

    /**
     * Gets the value of the outCpOlPaymentDataField2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCpOlPaymentDataField2() {
        return outCpOlPaymentDataField2;
    }

    /**
     * Sets the value of the outCpOlPaymentDataField2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCpOlPaymentDataField2(String value) {
        this.outCpOlPaymentDataField2 = value;
    }

    /**
     * Gets the value of the outCpOlPaymentDataField3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCpOlPaymentDataField3() {
        return outCpOlPaymentDataField3;
    }

    /**
     * Sets the value of the outCpOlPaymentDataField3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCpOlPaymentDataField3(String value) {
        this.outCpOlPaymentDataField3 = value;
    }

    /**
     * Gets the value of the outCpOlPaymentDataField4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCpOlPaymentDataField4() {
        return outCpOlPaymentDataField4;
    }

    /**
     * Sets the value of the outCpOlPaymentDataField4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCpOlPaymentDataField4(String value) {
        this.outCpOlPaymentDataField4 = value;
    }

    /**
     * Gets the value of the outCpParVoucherRunVoucherLine property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCpParVoucherRunVoucherLine() {
        return outCpParVoucherRunVoucherLine;
    }

    /**
     * Sets the value of the outCpParVoucherRunVoucherLine property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCpParVoucherRunVoucherLine(String value) {
        this.outCpParVoucherRunVoucherLine = value;
    }

    /**
     * Gets the value of the outCpPrftTransactionDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCpPrftTransactionDescription() {
        return outCpPrftTransactionDescription;
    }

    /**
     * Sets the value of the outCpPrftTransactionDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCpPrftTransactionDescription(String value) {
        this.outCpPrftTransactionDescription = value;
    }

    /**
     * Gets the value of the outCpPrftTransactionIdTransact property.
     * 
     */
    public int getOutCpPrftTransactionIdTransact() {
        return outCpPrftTransactionIdTransact;
    }

    /**
     * Sets the value of the outCpPrftTransactionIdTransact property.
     * 
     */
    public void setOutCpPrftTransactionIdTransact(int value) {
        this.outCpPrftTransactionIdTransact = value;
    }

    /**
     * Gets the value of the outCpThirdpartTemplPrompt1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCpThirdpartTemplPrompt1() {
        return outCpThirdpartTemplPrompt1;
    }

    /**
     * Sets the value of the outCpThirdpartTemplPrompt1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCpThirdpartTemplPrompt1(String value) {
        this.outCpThirdpartTemplPrompt1 = value;
    }

    /**
     * Gets the value of the outCpThirdpartTemplPrompt2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCpThirdpartTemplPrompt2() {
        return outCpThirdpartTemplPrompt2;
    }

    /**
     * Sets the value of the outCpThirdpartTemplPrompt2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCpThirdpartTemplPrompt2(String value) {
        this.outCpThirdpartTemplPrompt2 = value;
    }

    /**
     * Gets the value of the outCpThirdpartTemplPrompt3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCpThirdpartTemplPrompt3() {
        return outCpThirdpartTemplPrompt3;
    }

    /**
     * Sets the value of the outCpThirdpartTemplPrompt3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCpThirdpartTemplPrompt3(String value) {
        this.outCpThirdpartTemplPrompt3 = value;
    }

    /**
     * Gets the value of the outCpThirdpartTemplPrompt4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCpThirdpartTemplPrompt4() {
        return outCpThirdpartTemplPrompt4;
    }

    /**
     * Sets the value of the outCpThirdpartTemplPrompt4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCpThirdpartTemplPrompt4(String value) {
        this.outCpThirdpartTemplPrompt4 = value;
    }

    /**
     * Gets the value of the outCrOrganCustomerCDigit property.
     * 
     */
    public short getOutCrOrganCustomerCDigit() {
        return outCrOrganCustomerCDigit;
    }

    /**
     * Sets the value of the outCrOrganCustomerCDigit property.
     * 
     */
    public void setOutCrOrganCustomerCDigit(short value) {
        this.outCrOrganCustomerCDigit = value;
    }

    /**
     * Gets the value of the outCrOrganCustomerCustId property.
     * 
     */
    public int getOutCrOrganCustomerCustId() {
        return outCrOrganCustomerCustId;
    }

    /**
     * Sets the value of the outCrOrganCustomerCustId property.
     * 
     */
    public void setOutCrOrganCustomerCustId(int value) {
        this.outCrOrganCustomerCustId = value;
    }

    /**
     * Gets the value of the outCrOrganLnsSuppliedName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCrOrganLnsSuppliedName() {
        return outCrOrganLnsSuppliedName;
    }

    /**
     * Sets the value of the outCrOrganLnsSuppliedName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCrOrganLnsSuppliedName(String value) {
        this.outCrOrganLnsSuppliedName = value;
    }

    /**
     * Gets the value of the outCurrentPrintLineDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutCurrentPrintLineDate() {
        return outCurrentPrintLineDate;
    }

    /**
     * Sets the value of the outCurrentPrintLineDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutCurrentPrintLineDate(XMLGregorianCalendar value) {
        this.outCurrentPrintLineDate = value;
    }

    /**
     * Gets the value of the outCurrentPrintLineTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutCurrentPrintLineTime() {
        return outCurrentPrintLineTime;
    }

    /**
     * Sets the value of the outCurrentPrintLineTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutCurrentPrintLineTime(XMLGregorianCalendar value) {
        this.outCurrentPrintLineTime = value;
    }

    /**
     * Gets the value of the outDepParVoucherRunVoucherLine property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutDepParVoucherRunVoucherLine() {
        return outDepParVoucherRunVoucherLine;
    }

    /**
     * Sets the value of the outDepParVoucherRunVoucherLine property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutDepParVoucherRunVoucherLine(String value) {
        this.outDepParVoucherRunVoucherLine = value;
    }

    /**
     * Gets the value of the outDepSuccessfulTransactionWorkTrxUsrSn property.
     * 
     */
    public int getOutDepSuccessfulTransactionWorkTrxUsrSn() {
        return outDepSuccessfulTransactionWorkTrxUsrSn;
    }

    /**
     * Sets the value of the outDepSuccessfulTransactionWorkTrxUsrSn property.
     * 
     */
    public void setOutDepSuccessfulTransactionWorkTrxUsrSn(int value) {
        this.outDepSuccessfulTransactionWorkTrxUsrSn = value;
    }

    /**
     * Gets the value of the outDrCustCpOlCollectionBenefAddress1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutDrCustCpOlCollectionBenefAddress1() {
        return outDrCustCpOlCollectionBenefAddress1;
    }

    /**
     * Sets the value of the outDrCustCpOlCollectionBenefAddress1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutDrCustCpOlCollectionBenefAddress1(String value) {
        this.outDrCustCpOlCollectionBenefAddress1 = value;
    }

    /**
     * Gets the value of the outDrCustCpOlCollectionBenefAddress2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutDrCustCpOlCollectionBenefAddress2() {
        return outDrCustCpOlCollectionBenefAddress2;
    }

    /**
     * Sets the value of the outDrCustCpOlCollectionBenefAddress2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutDrCustCpOlCollectionBenefAddress2(String value) {
        this.outDrCustCpOlCollectionBenefAddress2 = value;
    }

    /**
     * Gets the value of the outDrCustCpOlCollectionBenefCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutDrCustCpOlCollectionBenefCity() {
        return outDrCustCpOlCollectionBenefCity;
    }

    /**
     * Sets the value of the outDrCustCpOlCollectionBenefCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutDrCustCpOlCollectionBenefCity(String value) {
        this.outDrCustCpOlCollectionBenefCity = value;
    }

    /**
     * Gets the value of the outDrCustCpOlCollectionBenefCountry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutDrCustCpOlCollectionBenefCountry() {
        return outDrCustCpOlCollectionBenefCountry;
    }

    /**
     * Sets the value of the outDrCustCpOlCollectionBenefCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutDrCustCpOlCollectionBenefCountry(String value) {
        this.outDrCustCpOlCollectionBenefCountry = value;
    }

    /**
     * Gets the value of the outDrCustCpOlCollectionBenefName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutDrCustCpOlCollectionBenefName() {
        return outDrCustCpOlCollectionBenefName;
    }

    /**
     * Sets the value of the outDrCustCpOlCollectionBenefName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutDrCustCpOlCollectionBenefName(String value) {
        this.outDrCustCpOlCollectionBenefName = value;
    }

    /**
     * Gets the value of the outDrCustCpOlCollectionBenefTelephone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutDrCustCpOlCollectionBenefTelephone() {
        return outDrCustCpOlCollectionBenefTelephone;
    }

    /**
     * Sets the value of the outDrCustCpOlCollectionBenefTelephone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutDrCustCpOlCollectionBenefTelephone(String value) {
        this.outDrCustCpOlCollectionBenefTelephone = value;
    }

    /**
     * Gets the value of the outDrCustCpOlCollectionBenefZipCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutDrCustCpOlCollectionBenefZipCode() {
        return outDrCustCpOlCollectionBenefZipCode;
    }

    /**
     * Sets the value of the outDrCustCpOlCollectionBenefZipCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutDrCustCpOlCollectionBenefZipCode(String value) {
        this.outDrCustCpOlCollectionBenefZipCode = value;
    }

    /**
     * Gets the value of the outDrCustCpOlCollectionDataField1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutDrCustCpOlCollectionDataField1() {
        return outDrCustCpOlCollectionDataField1;
    }

    /**
     * Sets the value of the outDrCustCpOlCollectionDataField1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutDrCustCpOlCollectionDataField1(String value) {
        this.outDrCustCpOlCollectionDataField1 = value;
    }

    /**
     * Gets the value of the outDrCustCpOlCollectionDataField2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutDrCustCpOlCollectionDataField2() {
        return outDrCustCpOlCollectionDataField2;
    }

    /**
     * Sets the value of the outDrCustCpOlCollectionDataField2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutDrCustCpOlCollectionDataField2(String value) {
        this.outDrCustCpOlCollectionDataField2 = value;
    }

    /**
     * Gets the value of the outDrCustCpOlCollectionDataField3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutDrCustCpOlCollectionDataField3() {
        return outDrCustCpOlCollectionDataField3;
    }

    /**
     * Sets the value of the outDrCustCpOlCollectionDataField3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutDrCustCpOlCollectionDataField3(String value) {
        this.outDrCustCpOlCollectionDataField3 = value;
    }

    /**
     * Gets the value of the outDrCustCpOlCollectionDataField4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutDrCustCpOlCollectionDataField4() {
        return outDrCustCpOlCollectionDataField4;
    }

    /**
     * Sets the value of the outDrCustCpOlCollectionDataField4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutDrCustCpOlCollectionDataField4(String value) {
        this.outDrCustCpOlCollectionDataField4 = value;
    }

    /**
     * Gets the value of the outDrCustCurrencyIdCurrency property.
     * 
     */
    public int getOutDrCustCurrencyIdCurrency() {
        return outDrCustCurrencyIdCurrency;
    }

    /**
     * Sets the value of the outDrCustCurrencyIdCurrency property.
     * 
     */
    public void setOutDrCustCurrencyIdCurrency(int value) {
        this.outDrCustCurrencyIdCurrency = value;
    }

    /**
     * Gets the value of the outDrCustCurrencyShortDescr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutDrCustCurrencyShortDescr() {
        return outDrCustCurrencyShortDescr;
    }

    /**
     * Sets the value of the outDrCustCurrencyShortDescr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutDrCustCurrencyShortDescr(String value) {
        this.outDrCustCurrencyShortDescr = value;
    }

    /**
     * Gets the value of the outDrCustDepTrxjustTrnType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutDrCustDepTrxjustTrnType() {
        return outDrCustDepTrxjustTrnType;
    }

    /**
     * Sets the value of the outDrCustDepTrxjustTrnType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutDrCustDepTrxjustTrnType(String value) {
        this.outDrCustDepTrxjustTrnType = value;
    }

    /**
     * Gets the value of the outDrCustDepositAccountAccountNumber property.
     * 
     */
    public double getOutDrCustDepositAccountAccountNumber() {
        return outDrCustDepositAccountAccountNumber;
    }

    /**
     * Sets the value of the outDrCustDepositAccountAccountNumber property.
     * 
     */
    public void setOutDrCustDepositAccountAccountNumber(double value) {
        this.outDrCustDepositAccountAccountNumber = value;
    }

    /**
     * Gets the value of the outDrCustDepositAccountDesignation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutDrCustDepositAccountDesignation() {
        return outDrCustDepositAccountDesignation;
    }

    /**
     * Sets the value of the outDrCustDepositAccountDesignation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutDrCustDepositAccountDesignation(String value) {
        this.outDrCustDepositAccountDesignation = value;
    }

    /**
     * Gets the value of the outDrCustTrxCountTrxCounter property.
     * 
     */
    public int getOutDrCustTrxCountTrxCounter() {
        return outDrCustTrxCountTrxCounter;
    }

    /**
     * Sets the value of the outDrCustTrxCountTrxCounter property.
     * 
     */
    public void setOutDrCustTrxCountTrxCounter(int value) {
        this.outDrCustTrxCountTrxCounter = value;
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
     * Gets the value of the outReversingCpTrxRecordingITrxDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutReversingCpTrxRecordingITrxDate() {
        return outReversingCpTrxRecordingITrxDate;
    }

    /**
     * Sets the value of the outReversingCpTrxRecordingITrxDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutReversingCpTrxRecordingITrxDate(XMLGregorianCalendar value) {
        this.outReversingCpTrxRecordingITrxDate = value;
    }

    /**
     * Gets the value of the outReversingCpTrxRecordingITrxSn property.
     * 
     */
    public int getOutReversingCpTrxRecordingITrxSn() {
        return outReversingCpTrxRecordingITrxSn;
    }

    /**
     * Sets the value of the outReversingCpTrxRecordingITrxSn property.
     * 
     */
    public void setOutReversingCpTrxRecordingITrxSn(int value) {
        this.outReversingCpTrxRecordingITrxSn = value;
    }

    /**
     * Gets the value of the outReversingCpTrxRecordingITrxUnit property.
     * 
     */
    public int getOutReversingCpTrxRecordingITrxUnit() {
        return outReversingCpTrxRecordingITrxUnit;
    }

    /**
     * Sets the value of the outReversingCpTrxRecordingITrxUnit property.
     * 
     */
    public void setOutReversingCpTrxRecordingITrxUnit(int value) {
        this.outReversingCpTrxRecordingITrxUnit = value;
    }

    /**
     * Gets the value of the outReversingCpTrxRecordingITrxUsr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutReversingCpTrxRecordingITrxUsr() {
        return outReversingCpTrxRecordingITrxUsr;
    }

    /**
     * Sets the value of the outReversingCpTrxRecordingITrxUsr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutReversingCpTrxRecordingITrxUsr(String value) {
        this.outReversingCpTrxRecordingITrxUsr = value;
    }

    /**
     * Gets the value of the outServiceJustificDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutServiceJustificDescription() {
        return outServiceJustificDescription;
    }

    /**
     * Sets the value of the outServiceJustificDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutServiceJustificDescription(String value) {
        this.outServiceJustificDescription = value;
    }

    /**
     * Gets the value of the outServiceJustificIdJustific property.
     * 
     */
    public int getOutServiceJustificIdJustific() {
        return outServiceJustificIdJustific;
    }

    /**
     * Sets the value of the outServiceJustificIdJustific property.
     * 
     */
    public void setOutServiceJustificIdJustific(int value) {
        this.outServiceJustificIdJustific = value;
    }

    /**
     * Gets the value of the outServiceProductDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutServiceProductDescription() {
        return outServiceProductDescription;
    }

    /**
     * Sets the value of the outServiceProductDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutServiceProductDescription(String value) {
        this.outServiceProductDescription = value;
    }

    /**
     * Gets the value of the outServiceProductIdProduct property.
     * 
     */
    public int getOutServiceProductIdProduct() {
        return outServiceProductIdProduct;
    }

    /**
     * Sets the value of the outServiceProductIdProduct property.
     * 
     */
    public void setOutServiceProductIdProduct(int value) {
        this.outServiceProductIdProduct = value;
    }

    /**
     * Gets the value of the outServiceTrxjustSourceTrnType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutServiceTrxjustSourceTrnType() {
        return outServiceTrxjustSourceTrnType;
    }

    /**
     * Sets the value of the outServiceTrxjustSourceTrnType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutServiceTrxjustSourceTrnType(String value) {
        this.outServiceTrxjustSourceTrnType = value;
    }

    /**
     * Gets the value of the outTrxCountTrxCounter property.
     * 
     */
    public int getOutTrxCountTrxCounter() {
        return outTrxCountTrxCounter;
    }

    /**
     * Sets the value of the outTrxCountTrxCounter property.
     * 
     */
    public void setOutTrxCountTrxCounter(int value) {
        this.outTrxCountTrxCounter = value;
    }

    /**
     * Gets the value of the outTrxRecordingAccAmount1 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutTrxRecordingAccAmount1() {
        return outTrxRecordingAccAmount1;
    }

    /**
     * Sets the value of the outTrxRecordingAccAmount1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutTrxRecordingAccAmount1(BigDecimal value) {
        this.outTrxRecordingAccAmount1 = value;
    }

    /**
     * Gets the value of the outTrxRecordingAccAmount15 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutTrxRecordingAccAmount15() {
        return outTrxRecordingAccAmount15;
    }

    /**
     * Sets the value of the outTrxRecordingAccAmount15 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutTrxRecordingAccAmount15(BigDecimal value) {
        this.outTrxRecordingAccAmount15 = value;
    }

    /**
     * Gets the value of the outTrxRecordingAccAmount17 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutTrxRecordingAccAmount17() {
        return outTrxRecordingAccAmount17;
    }

    /**
     * Sets the value of the outTrxRecordingAccAmount17 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutTrxRecordingAccAmount17(BigDecimal value) {
        this.outTrxRecordingAccAmount17 = value;
    }

    /**
     * Gets the value of the outTrxRecordingAccAmount18 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutTrxRecordingAccAmount18() {
        return outTrxRecordingAccAmount18;
    }

    /**
     * Sets the value of the outTrxRecordingAccAmount18 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutTrxRecordingAccAmount18(BigDecimal value) {
        this.outTrxRecordingAccAmount18 = value;
    }

    /**
     * Gets the value of the outTrxRecordingAccAmount31 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutTrxRecordingAccAmount31() {
        return outTrxRecordingAccAmount31;
    }

    /**
     * Sets the value of the outTrxRecordingAccAmount31 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutTrxRecordingAccAmount31(BigDecimal value) {
        this.outTrxRecordingAccAmount31 = value;
    }

    /**
     * Gets the value of the outTrxRecordingOValueDate1 property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutTrxRecordingOValueDate1() {
        return outTrxRecordingOValueDate1;
    }

    /**
     * Sets the value of the outTrxRecordingOValueDate1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutTrxRecordingOValueDate1(XMLGregorianCalendar value) {
        this.outTrxRecordingOValueDate1 = value;
    }

    /**
     * Gets the value of the outTrxRecordingUserTotalAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutTrxRecordingUserTotalAmn() {
        return outTrxRecordingUserTotalAmn;
    }

    /**
     * Sets the value of the outTrxRecordingUserTotalAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutTrxRecordingUserTotalAmn(BigDecimal value) {
        this.outTrxRecordingUserTotalAmn = value;
    }

}
