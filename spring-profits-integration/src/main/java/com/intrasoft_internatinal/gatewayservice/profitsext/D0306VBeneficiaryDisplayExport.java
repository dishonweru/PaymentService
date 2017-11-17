
package com.intrasoft_internatinal.gatewayservice.profitsext;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for D0306V_BeneficiaryDisplayExport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="D0306V_BeneficiaryDisplayExport">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}BaseExport">
 *       &lt;sequence>
 *         &lt;element name="OutAccUnitCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutCurrencyIdCurrency" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutCurrencyShortDescr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustomerCustId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutCustomerLnsSuppliedName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutDepositAccountAccountNumber" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OutDepositAccountAccountType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutDepositAccountCDigit" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutDepositAccountCobenefCount" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutDepositAccountCobenefCountIns" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutDepositAccountDesignation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutDepositAccountEntryStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutDepositAccountSecretAccFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutIefSuppliedActionEntryDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutIefSuppliedCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutIefSuppliedSrvStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutLogDepMntRecordingTrxUsrSn" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutPrintLineDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutPrintLineTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutPrnPrftTransactionDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutPrnPrftTransactionIdTransact" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutProductDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutProductIdProduct" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutStatusIefSuppliedActionEntryDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutStatusIefSuppliedSrvStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutUpdatedBeneficiaryBeneficiarySn" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutUpdatedBeneficiaryMandateInstruct" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCobGrp" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}ArrayOfD0306VOutCobGrpItem" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "D0306V_BeneficiaryDisplayExport", propOrder = {
    "outAccUnitCode",
    "outCurrencyIdCurrency",
    "outCurrencyShortDescr",
    "outCustomerCustId",
    "outCustomerLnsSuppliedName",
    "outDepositAccountAccountNumber",
    "outDepositAccountAccountType",
    "outDepositAccountCDigit",
    "outDepositAccountCobenefCount",
    "outDepositAccountCobenefCountIns",
    "outDepositAccountDesignation",
    "outDepositAccountEntryStatus",
    "outDepositAccountSecretAccFlag",
    "outIefSuppliedActionEntryDesc",
    "outIefSuppliedCount",
    "outIefSuppliedSrvStatus",
    "outLogDepMntRecordingTrxUsrSn",
    "outPrintLineDate",
    "outPrintLineTime",
    "outPrnPrftTransactionDescription",
    "outPrnPrftTransactionIdTransact",
    "outProductDescription",
    "outProductIdProduct",
    "outStatusIefSuppliedActionEntryDesc",
    "outStatusIefSuppliedSrvStatus",
    "outUpdatedBeneficiaryBeneficiarySn",
    "outUpdatedBeneficiaryMandateInstruct",
    "outCobGrp"
})
public class D0306VBeneficiaryDisplayExport
    extends BaseExport
{

    @XmlElement(name = "OutAccUnitCode")
    protected int outAccUnitCode;
    @XmlElement(name = "OutCurrencyIdCurrency")
    protected int outCurrencyIdCurrency;
    @XmlElement(name = "OutCurrencyShortDescr")
    protected String outCurrencyShortDescr;
    @XmlElement(name = "OutCustomerCustId")
    protected int outCustomerCustId;
    @XmlElement(name = "OutCustomerLnsSuppliedName")
    protected String outCustomerLnsSuppliedName;
    @XmlElement(name = "OutDepositAccountAccountNumber")
    protected double outDepositAccountAccountNumber;
    @XmlElement(name = "OutDepositAccountAccountType")
    protected String outDepositAccountAccountType;
    @XmlElement(name = "OutDepositAccountCDigit")
    protected short outDepositAccountCDigit;
    @XmlElement(name = "OutDepositAccountCobenefCount")
    protected short outDepositAccountCobenefCount;
    @XmlElement(name = "OutDepositAccountCobenefCountIns")
    protected short outDepositAccountCobenefCountIns;
    @XmlElement(name = "OutDepositAccountDesignation")
    protected String outDepositAccountDesignation;
    @XmlElement(name = "OutDepositAccountEntryStatus")
    protected String outDepositAccountEntryStatus;
    @XmlElement(name = "OutDepositAccountSecretAccFlag")
    protected String outDepositAccountSecretAccFlag;
    @XmlElement(name = "OutIefSuppliedActionEntryDesc")
    protected String outIefSuppliedActionEntryDesc;
    @XmlElement(name = "OutIefSuppliedCount")
    protected int outIefSuppliedCount;
    @XmlElement(name = "OutIefSuppliedSrvStatus")
    protected String outIefSuppliedSrvStatus;
    @XmlElement(name = "OutLogDepMntRecordingTrxUsrSn")
    protected int outLogDepMntRecordingTrxUsrSn;
    @XmlElement(name = "OutPrintLineDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outPrintLineDate;
    @XmlElement(name = "OutPrintLineTime", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outPrintLineTime;
    @XmlElement(name = "OutPrnPrftTransactionDescription")
    protected String outPrnPrftTransactionDescription;
    @XmlElement(name = "OutPrnPrftTransactionIdTransact")
    protected int outPrnPrftTransactionIdTransact;
    @XmlElement(name = "OutProductDescription")
    protected String outProductDescription;
    @XmlElement(name = "OutProductIdProduct")
    protected int outProductIdProduct;
    @XmlElement(name = "OutStatusIefSuppliedActionEntryDesc")
    protected String outStatusIefSuppliedActionEntryDesc;
    @XmlElement(name = "OutStatusIefSuppliedSrvStatus")
    protected String outStatusIefSuppliedSrvStatus;
    @XmlElement(name = "OutUpdatedBeneficiaryBeneficiarySn")
    protected short outUpdatedBeneficiaryBeneficiarySn;
    @XmlElement(name = "OutUpdatedBeneficiaryMandateInstruct")
    protected String outUpdatedBeneficiaryMandateInstruct;
    @XmlElement(name = "OutCobGrp")
    protected ArrayOfD0306VOutCobGrpItem outCobGrp;

    /**
     * Gets the value of the outAccUnitCode property.
     * 
     */
    public int getOutAccUnitCode() {
        return outAccUnitCode;
    }

    /**
     * Sets the value of the outAccUnitCode property.
     * 
     */
    public void setOutAccUnitCode(int value) {
        this.outAccUnitCode = value;
    }

    /**
     * Gets the value of the outCurrencyIdCurrency property.
     * 
     */
    public int getOutCurrencyIdCurrency() {
        return outCurrencyIdCurrency;
    }

    /**
     * Sets the value of the outCurrencyIdCurrency property.
     * 
     */
    public void setOutCurrencyIdCurrency(int value) {
        this.outCurrencyIdCurrency = value;
    }

    /**
     * Gets the value of the outCurrencyShortDescr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCurrencyShortDescr() {
        return outCurrencyShortDescr;
    }

    /**
     * Sets the value of the outCurrencyShortDescr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCurrencyShortDescr(String value) {
        this.outCurrencyShortDescr = value;
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
     * Gets the value of the outCustomerLnsSuppliedName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCustomerLnsSuppliedName() {
        return outCustomerLnsSuppliedName;
    }

    /**
     * Sets the value of the outCustomerLnsSuppliedName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCustomerLnsSuppliedName(String value) {
        this.outCustomerLnsSuppliedName = value;
    }

    /**
     * Gets the value of the outDepositAccountAccountNumber property.
     * 
     */
    public double getOutDepositAccountAccountNumber() {
        return outDepositAccountAccountNumber;
    }

    /**
     * Sets the value of the outDepositAccountAccountNumber property.
     * 
     */
    public void setOutDepositAccountAccountNumber(double value) {
        this.outDepositAccountAccountNumber = value;
    }

    /**
     * Gets the value of the outDepositAccountAccountType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutDepositAccountAccountType() {
        return outDepositAccountAccountType;
    }

    /**
     * Sets the value of the outDepositAccountAccountType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutDepositAccountAccountType(String value) {
        this.outDepositAccountAccountType = value;
    }

    /**
     * Gets the value of the outDepositAccountCDigit property.
     * 
     */
    public short getOutDepositAccountCDigit() {
        return outDepositAccountCDigit;
    }

    /**
     * Sets the value of the outDepositAccountCDigit property.
     * 
     */
    public void setOutDepositAccountCDigit(short value) {
        this.outDepositAccountCDigit = value;
    }

    /**
     * Gets the value of the outDepositAccountCobenefCount property.
     * 
     */
    public short getOutDepositAccountCobenefCount() {
        return outDepositAccountCobenefCount;
    }

    /**
     * Sets the value of the outDepositAccountCobenefCount property.
     * 
     */
    public void setOutDepositAccountCobenefCount(short value) {
        this.outDepositAccountCobenefCount = value;
    }

    /**
     * Gets the value of the outDepositAccountCobenefCountIns property.
     * 
     */
    public short getOutDepositAccountCobenefCountIns() {
        return outDepositAccountCobenefCountIns;
    }

    /**
     * Sets the value of the outDepositAccountCobenefCountIns property.
     * 
     */
    public void setOutDepositAccountCobenefCountIns(short value) {
        this.outDepositAccountCobenefCountIns = value;
    }

    /**
     * Gets the value of the outDepositAccountDesignation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutDepositAccountDesignation() {
        return outDepositAccountDesignation;
    }

    /**
     * Sets the value of the outDepositAccountDesignation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutDepositAccountDesignation(String value) {
        this.outDepositAccountDesignation = value;
    }

    /**
     * Gets the value of the outDepositAccountEntryStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutDepositAccountEntryStatus() {
        return outDepositAccountEntryStatus;
    }

    /**
     * Sets the value of the outDepositAccountEntryStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutDepositAccountEntryStatus(String value) {
        this.outDepositAccountEntryStatus = value;
    }

    /**
     * Gets the value of the outDepositAccountSecretAccFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutDepositAccountSecretAccFlag() {
        return outDepositAccountSecretAccFlag;
    }

    /**
     * Sets the value of the outDepositAccountSecretAccFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutDepositAccountSecretAccFlag(String value) {
        this.outDepositAccountSecretAccFlag = value;
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
     * Gets the value of the outIefSuppliedCount property.
     * 
     */
    public int getOutIefSuppliedCount() {
        return outIefSuppliedCount;
    }

    /**
     * Sets the value of the outIefSuppliedCount property.
     * 
     */
    public void setOutIefSuppliedCount(int value) {
        this.outIefSuppliedCount = value;
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
     * Gets the value of the outLogDepMntRecordingTrxUsrSn property.
     * 
     */
    public int getOutLogDepMntRecordingTrxUsrSn() {
        return outLogDepMntRecordingTrxUsrSn;
    }

    /**
     * Sets the value of the outLogDepMntRecordingTrxUsrSn property.
     * 
     */
    public void setOutLogDepMntRecordingTrxUsrSn(int value) {
        this.outLogDepMntRecordingTrxUsrSn = value;
    }

    /**
     * Gets the value of the outPrintLineDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutPrintLineDate() {
        return outPrintLineDate;
    }

    /**
     * Sets the value of the outPrintLineDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutPrintLineDate(XMLGregorianCalendar value) {
        this.outPrintLineDate = value;
    }

    /**
     * Gets the value of the outPrintLineTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutPrintLineTime() {
        return outPrintLineTime;
    }

    /**
     * Sets the value of the outPrintLineTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutPrintLineTime(XMLGregorianCalendar value) {
        this.outPrintLineTime = value;
    }

    /**
     * Gets the value of the outPrnPrftTransactionDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutPrnPrftTransactionDescription() {
        return outPrnPrftTransactionDescription;
    }

    /**
     * Sets the value of the outPrnPrftTransactionDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutPrnPrftTransactionDescription(String value) {
        this.outPrnPrftTransactionDescription = value;
    }

    /**
     * Gets the value of the outPrnPrftTransactionIdTransact property.
     * 
     */
    public int getOutPrnPrftTransactionIdTransact() {
        return outPrnPrftTransactionIdTransact;
    }

    /**
     * Sets the value of the outPrnPrftTransactionIdTransact property.
     * 
     */
    public void setOutPrnPrftTransactionIdTransact(int value) {
        this.outPrnPrftTransactionIdTransact = value;
    }

    /**
     * Gets the value of the outProductDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutProductDescription() {
        return outProductDescription;
    }

    /**
     * Sets the value of the outProductDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutProductDescription(String value) {
        this.outProductDescription = value;
    }

    /**
     * Gets the value of the outProductIdProduct property.
     * 
     */
    public int getOutProductIdProduct() {
        return outProductIdProduct;
    }

    /**
     * Sets the value of the outProductIdProduct property.
     * 
     */
    public void setOutProductIdProduct(int value) {
        this.outProductIdProduct = value;
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
     * Gets the value of the outStatusIefSuppliedSrvStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutStatusIefSuppliedSrvStatus() {
        return outStatusIefSuppliedSrvStatus;
    }

    /**
     * Sets the value of the outStatusIefSuppliedSrvStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutStatusIefSuppliedSrvStatus(String value) {
        this.outStatusIefSuppliedSrvStatus = value;
    }

    /**
     * Gets the value of the outUpdatedBeneficiaryBeneficiarySn property.
     * 
     */
    public short getOutUpdatedBeneficiaryBeneficiarySn() {
        return outUpdatedBeneficiaryBeneficiarySn;
    }

    /**
     * Sets the value of the outUpdatedBeneficiaryBeneficiarySn property.
     * 
     */
    public void setOutUpdatedBeneficiaryBeneficiarySn(short value) {
        this.outUpdatedBeneficiaryBeneficiarySn = value;
    }

    /**
     * Gets the value of the outUpdatedBeneficiaryMandateInstruct property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutUpdatedBeneficiaryMandateInstruct() {
        return outUpdatedBeneficiaryMandateInstruct;
    }

    /**
     * Sets the value of the outUpdatedBeneficiaryMandateInstruct property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutUpdatedBeneficiaryMandateInstruct(String value) {
        this.outUpdatedBeneficiaryMandateInstruct = value;
    }

    /**
     * Gets the value of the outCobGrp property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfD0306VOutCobGrpItem }
     *     
     */
    public ArrayOfD0306VOutCobGrpItem getOutCobGrp() {
        return outCobGrp;
    }

    /**
     * Sets the value of the outCobGrp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfD0306VOutCobGrpItem }
     *     
     */
    public void setOutCobGrp(ArrayOfD0306VOutCobGrpItem value) {
        this.outCobGrp = value;
    }

}
