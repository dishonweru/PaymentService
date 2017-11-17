
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for X2230VSafeDepositExtraitExport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="X2230VSafeDepositExtraitExport">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}BaseExport">
 *       &lt;sequence>
 *         &lt;element name="OutCustCardInfoCardNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustCardInfoEndDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutCustCardInfoStartDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutCustCardInfoTmstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutCustomerCustId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutCustomerCustStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustomerCustType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustomerShortName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustomerListSetDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutProductDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutProductIdProduct" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutProductProductType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutProductTmstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutProductValidityDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutRentalCurrInfoCurrencyIdCurrency" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutRentalCurrInfoCurrencyNationalFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutRentalCurrInfoCurrencyShortDescr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutRentalIefSuppliedAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutSafeDepositBoxSdbStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSdbRentalRental" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutSdbRentalRentalCurrency" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutSdbRentalRentalStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSelectedBankemployeeFirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSelectedBankemployeeId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSelectedBankemployeeLastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSelectedJustificDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSelectedJustificIdJustific" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutSelectedPrftTransactionDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSelectedPrftTransactionIdTransact" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutSelectedUnitCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutSelectedUnitUnitName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrp" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}ArrayOfX2230VOutGrpItem" minOccurs="0"/>
 *         &lt;element name="OutGrpSrvLog" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}ArrayOfX2230VOutGrpSrvLogItem" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "X2230VSafeDepositExtraitExport", propOrder = {
    "outCustCardInfoCardNo",
    "outCustCardInfoEndDate",
    "outCustCardInfoStartDate",
    "outCustCardInfoTmstamp",
    "outCustomerCustId",
    "outCustomerCustStatus",
    "outCustomerCustType",
    "outCustomerShortName",
    "outCustomerListSetDescription",
    "outProductDescription",
    "outProductIdProduct",
    "outProductProductType",
    "outProductTmstamp",
    "outProductValidityDate",
    "outRentalCurrInfoCurrencyIdCurrency",
    "outRentalCurrInfoCurrencyNationalFlag",
    "outRentalCurrInfoCurrencyShortDescr",
    "outRentalIefSuppliedAmount",
    "outSafeDepositBoxSdbStatus",
    "outSdbRentalRental",
    "outSdbRentalRentalCurrency",
    "outSdbRentalRentalStatus",
    "outSelectedBankemployeeFirstName",
    "outSelectedBankemployeeId",
    "outSelectedBankemployeeLastName",
    "outSelectedJustificDescription",
    "outSelectedJustificIdJustific",
    "outSelectedPrftTransactionDescription",
    "outSelectedPrftTransactionIdTransact",
    "outSelectedUnitCode",
    "outSelectedUnitUnitName",
    "outGrp",
    "outGrpSrvLog"
})
public class X2230VSafeDepositExtraitExport
    extends BaseExport
{

    @XmlElement(name = "OutCustCardInfoCardNo")
    protected String outCustCardInfoCardNo;
    @XmlElement(name = "OutCustCardInfoEndDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outCustCardInfoEndDate;
    @XmlElement(name = "OutCustCardInfoStartDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outCustCardInfoStartDate;
    @XmlElement(name = "OutCustCardInfoTmstamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outCustCardInfoTmstamp;
    @XmlElement(name = "OutCustomerCustId")
    protected int outCustomerCustId;
    @XmlElement(name = "OutCustomerCustStatus")
    protected String outCustomerCustStatus;
    @XmlElement(name = "OutCustomerCustType")
    protected String outCustomerCustType;
    @XmlElement(name = "OutCustomerShortName")
    protected String outCustomerShortName;
    @XmlElement(name = "OutCustomerListSetDescription")
    protected String outCustomerListSetDescription;
    @XmlElement(name = "OutProductDescription")
    protected String outProductDescription;
    @XmlElement(name = "OutProductIdProduct")
    protected int outProductIdProduct;
    @XmlElement(name = "OutProductProductType")
    protected String outProductProductType;
    @XmlElement(name = "OutProductTmstamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outProductTmstamp;
    @XmlElement(name = "OutProductValidityDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outProductValidityDate;
    @XmlElement(name = "OutRentalCurrInfoCurrencyIdCurrency")
    protected int outRentalCurrInfoCurrencyIdCurrency;
    @XmlElement(name = "OutRentalCurrInfoCurrencyNationalFlag")
    protected String outRentalCurrInfoCurrencyNationalFlag;
    @XmlElement(name = "OutRentalCurrInfoCurrencyShortDescr")
    protected String outRentalCurrInfoCurrencyShortDescr;
    @XmlElement(name = "OutRentalIefSuppliedAmount", required = true)
    protected BigDecimal outRentalIefSuppliedAmount;
    @XmlElement(name = "OutSafeDepositBoxSdbStatus")
    protected String outSafeDepositBoxSdbStatus;
    @XmlElement(name = "OutSdbRentalRental", required = true)
    protected BigDecimal outSdbRentalRental;
    @XmlElement(name = "OutSdbRentalRentalCurrency")
    protected int outSdbRentalRentalCurrency;
    @XmlElement(name = "OutSdbRentalRentalStatus")
    protected String outSdbRentalRentalStatus;
    @XmlElement(name = "OutSelectedBankemployeeFirstName")
    protected String outSelectedBankemployeeFirstName;
    @XmlElement(name = "OutSelectedBankemployeeId")
    protected String outSelectedBankemployeeId;
    @XmlElement(name = "OutSelectedBankemployeeLastName")
    protected String outSelectedBankemployeeLastName;
    @XmlElement(name = "OutSelectedJustificDescription")
    protected String outSelectedJustificDescription;
    @XmlElement(name = "OutSelectedJustificIdJustific")
    protected int outSelectedJustificIdJustific;
    @XmlElement(name = "OutSelectedPrftTransactionDescription")
    protected String outSelectedPrftTransactionDescription;
    @XmlElement(name = "OutSelectedPrftTransactionIdTransact")
    protected int outSelectedPrftTransactionIdTransact;
    @XmlElement(name = "OutSelectedUnitCode")
    protected int outSelectedUnitCode;
    @XmlElement(name = "OutSelectedUnitUnitName")
    protected String outSelectedUnitUnitName;
    @XmlElement(name = "OutGrp")
    protected ArrayOfX2230VOutGrpItem outGrp;
    @XmlElement(name = "OutGrpSrvLog")
    protected ArrayOfX2230VOutGrpSrvLogItem outGrpSrvLog;

    /**
     * Gets the value of the outCustCardInfoCardNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCustCardInfoCardNo() {
        return outCustCardInfoCardNo;
    }

    /**
     * Sets the value of the outCustCardInfoCardNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCustCardInfoCardNo(String value) {
        this.outCustCardInfoCardNo = value;
    }

    /**
     * Gets the value of the outCustCardInfoEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutCustCardInfoEndDate() {
        return outCustCardInfoEndDate;
    }

    /**
     * Sets the value of the outCustCardInfoEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutCustCardInfoEndDate(XMLGregorianCalendar value) {
        this.outCustCardInfoEndDate = value;
    }

    /**
     * Gets the value of the outCustCardInfoStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutCustCardInfoStartDate() {
        return outCustCardInfoStartDate;
    }

    /**
     * Sets the value of the outCustCardInfoStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutCustCardInfoStartDate(XMLGregorianCalendar value) {
        this.outCustCardInfoStartDate = value;
    }

    /**
     * Gets the value of the outCustCardInfoTmstamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutCustCardInfoTmstamp() {
        return outCustCardInfoTmstamp;
    }

    /**
     * Sets the value of the outCustCardInfoTmstamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutCustCardInfoTmstamp(XMLGregorianCalendar value) {
        this.outCustCardInfoTmstamp = value;
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
     * Gets the value of the outCustomerCustStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCustomerCustStatus() {
        return outCustomerCustStatus;
    }

    /**
     * Sets the value of the outCustomerCustStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCustomerCustStatus(String value) {
        this.outCustomerCustStatus = value;
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
     * Gets the value of the outCustomerShortName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCustomerShortName() {
        return outCustomerShortName;
    }

    /**
     * Sets the value of the outCustomerShortName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCustomerShortName(String value) {
        this.outCustomerShortName = value;
    }

    /**
     * Gets the value of the outCustomerListSetDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCustomerListSetDescription() {
        return outCustomerListSetDescription;
    }

    /**
     * Sets the value of the outCustomerListSetDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCustomerListSetDescription(String value) {
        this.outCustomerListSetDescription = value;
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
     * Gets the value of the outProductProductType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutProductProductType() {
        return outProductProductType;
    }

    /**
     * Sets the value of the outProductProductType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutProductProductType(String value) {
        this.outProductProductType = value;
    }

    /**
     * Gets the value of the outProductTmstamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutProductTmstamp() {
        return outProductTmstamp;
    }

    /**
     * Sets the value of the outProductTmstamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutProductTmstamp(XMLGregorianCalendar value) {
        this.outProductTmstamp = value;
    }

    /**
     * Gets the value of the outProductValidityDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutProductValidityDate() {
        return outProductValidityDate;
    }

    /**
     * Sets the value of the outProductValidityDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutProductValidityDate(XMLGregorianCalendar value) {
        this.outProductValidityDate = value;
    }

    /**
     * Gets the value of the outRentalCurrInfoCurrencyIdCurrency property.
     * 
     */
    public int getOutRentalCurrInfoCurrencyIdCurrency() {
        return outRentalCurrInfoCurrencyIdCurrency;
    }

    /**
     * Sets the value of the outRentalCurrInfoCurrencyIdCurrency property.
     * 
     */
    public void setOutRentalCurrInfoCurrencyIdCurrency(int value) {
        this.outRentalCurrInfoCurrencyIdCurrency = value;
    }

    /**
     * Gets the value of the outRentalCurrInfoCurrencyNationalFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutRentalCurrInfoCurrencyNationalFlag() {
        return outRentalCurrInfoCurrencyNationalFlag;
    }

    /**
     * Sets the value of the outRentalCurrInfoCurrencyNationalFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutRentalCurrInfoCurrencyNationalFlag(String value) {
        this.outRentalCurrInfoCurrencyNationalFlag = value;
    }

    /**
     * Gets the value of the outRentalCurrInfoCurrencyShortDescr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutRentalCurrInfoCurrencyShortDescr() {
        return outRentalCurrInfoCurrencyShortDescr;
    }

    /**
     * Sets the value of the outRentalCurrInfoCurrencyShortDescr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutRentalCurrInfoCurrencyShortDescr(String value) {
        this.outRentalCurrInfoCurrencyShortDescr = value;
    }

    /**
     * Gets the value of the outRentalIefSuppliedAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutRentalIefSuppliedAmount() {
        return outRentalIefSuppliedAmount;
    }

    /**
     * Sets the value of the outRentalIefSuppliedAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutRentalIefSuppliedAmount(BigDecimal value) {
        this.outRentalIefSuppliedAmount = value;
    }

    /**
     * Gets the value of the outSafeDepositBoxSdbStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSafeDepositBoxSdbStatus() {
        return outSafeDepositBoxSdbStatus;
    }

    /**
     * Sets the value of the outSafeDepositBoxSdbStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSafeDepositBoxSdbStatus(String value) {
        this.outSafeDepositBoxSdbStatus = value;
    }

    /**
     * Gets the value of the outSdbRentalRental property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutSdbRentalRental() {
        return outSdbRentalRental;
    }

    /**
     * Sets the value of the outSdbRentalRental property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutSdbRentalRental(BigDecimal value) {
        this.outSdbRentalRental = value;
    }

    /**
     * Gets the value of the outSdbRentalRentalCurrency property.
     * 
     */
    public int getOutSdbRentalRentalCurrency() {
        return outSdbRentalRentalCurrency;
    }

    /**
     * Sets the value of the outSdbRentalRentalCurrency property.
     * 
     */
    public void setOutSdbRentalRentalCurrency(int value) {
        this.outSdbRentalRentalCurrency = value;
    }

    /**
     * Gets the value of the outSdbRentalRentalStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSdbRentalRentalStatus() {
        return outSdbRentalRentalStatus;
    }

    /**
     * Sets the value of the outSdbRentalRentalStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSdbRentalRentalStatus(String value) {
        this.outSdbRentalRentalStatus = value;
    }

    /**
     * Gets the value of the outSelectedBankemployeeFirstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSelectedBankemployeeFirstName() {
        return outSelectedBankemployeeFirstName;
    }

    /**
     * Sets the value of the outSelectedBankemployeeFirstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSelectedBankemployeeFirstName(String value) {
        this.outSelectedBankemployeeFirstName = value;
    }

    /**
     * Gets the value of the outSelectedBankemployeeId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSelectedBankemployeeId() {
        return outSelectedBankemployeeId;
    }

    /**
     * Sets the value of the outSelectedBankemployeeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSelectedBankemployeeId(String value) {
        this.outSelectedBankemployeeId = value;
    }

    /**
     * Gets the value of the outSelectedBankemployeeLastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSelectedBankemployeeLastName() {
        return outSelectedBankemployeeLastName;
    }

    /**
     * Sets the value of the outSelectedBankemployeeLastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSelectedBankemployeeLastName(String value) {
        this.outSelectedBankemployeeLastName = value;
    }

    /**
     * Gets the value of the outSelectedJustificDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSelectedJustificDescription() {
        return outSelectedJustificDescription;
    }

    /**
     * Sets the value of the outSelectedJustificDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSelectedJustificDescription(String value) {
        this.outSelectedJustificDescription = value;
    }

    /**
     * Gets the value of the outSelectedJustificIdJustific property.
     * 
     */
    public int getOutSelectedJustificIdJustific() {
        return outSelectedJustificIdJustific;
    }

    /**
     * Sets the value of the outSelectedJustificIdJustific property.
     * 
     */
    public void setOutSelectedJustificIdJustific(int value) {
        this.outSelectedJustificIdJustific = value;
    }

    /**
     * Gets the value of the outSelectedPrftTransactionDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSelectedPrftTransactionDescription() {
        return outSelectedPrftTransactionDescription;
    }

    /**
     * Sets the value of the outSelectedPrftTransactionDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSelectedPrftTransactionDescription(String value) {
        this.outSelectedPrftTransactionDescription = value;
    }

    /**
     * Gets the value of the outSelectedPrftTransactionIdTransact property.
     * 
     */
    public int getOutSelectedPrftTransactionIdTransact() {
        return outSelectedPrftTransactionIdTransact;
    }

    /**
     * Sets the value of the outSelectedPrftTransactionIdTransact property.
     * 
     */
    public void setOutSelectedPrftTransactionIdTransact(int value) {
        this.outSelectedPrftTransactionIdTransact = value;
    }

    /**
     * Gets the value of the outSelectedUnitCode property.
     * 
     */
    public int getOutSelectedUnitCode() {
        return outSelectedUnitCode;
    }

    /**
     * Sets the value of the outSelectedUnitCode property.
     * 
     */
    public void setOutSelectedUnitCode(int value) {
        this.outSelectedUnitCode = value;
    }

    /**
     * Gets the value of the outSelectedUnitUnitName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSelectedUnitUnitName() {
        return outSelectedUnitUnitName;
    }

    /**
     * Sets the value of the outSelectedUnitUnitName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSelectedUnitUnitName(String value) {
        this.outSelectedUnitUnitName = value;
    }

    /**
     * Gets the value of the outGrp property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfX2230VOutGrpItem }
     *     
     */
    public ArrayOfX2230VOutGrpItem getOutGrp() {
        return outGrp;
    }

    /**
     * Sets the value of the outGrp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfX2230VOutGrpItem }
     *     
     */
    public void setOutGrp(ArrayOfX2230VOutGrpItem value) {
        this.outGrp = value;
    }

    /**
     * Gets the value of the outGrpSrvLog property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfX2230VOutGrpSrvLogItem }
     *     
     */
    public ArrayOfX2230VOutGrpSrvLogItem getOutGrpSrvLog() {
        return outGrpSrvLog;
    }

    /**
     * Sets the value of the outGrpSrvLog property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfX2230VOutGrpSrvLogItem }
     *     
     */
    public void setOutGrpSrvLog(ArrayOfX2230VOutGrpSrvLogItem value) {
        this.outGrpSrvLog = value;
    }

}
