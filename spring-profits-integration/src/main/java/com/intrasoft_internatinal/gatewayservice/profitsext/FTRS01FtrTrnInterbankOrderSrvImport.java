
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for FTRS01_FtrTrnInterbankOrderSrvImport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FTRS01_FtrTrnInterbankOrderSrvImport">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}BaseImport">
 *       &lt;sequence>
 *         &lt;element name="Command" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InIefSuppliedCommand" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCorrespondentCustomerCustId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InCorrespondentProfitsAccountAccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCorrespondentProfitsAccountAccountCd" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InOrderAmountIefSuppliedPayableAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InOrderCurrencyIdCurrency" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InOrderingCustomerCustId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InOrderingProfitsAccountAccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InOrderingProfitsAccountAccountCd" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InOrderingCommentsGenericDetailDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InOutgoingOrdersAccWithBankSwif" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InOutgoingOrdersBenefAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InOutgoingOrdersBenefName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InOutgoingOrdersBenefAddress1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InOutgoingOrdersBenefAddress2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InOutgoingOrdersBenefCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InOutgoingOrdersBenefCountry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InOutgoingOrdersBenefZipCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InOutgoingOrdersBenefPhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InOutgoingOrdersFbCharges" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InOutgoingOrdersSenderToReceiver" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InPaymentBankParametersCurrTrxDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InProductIdProduct" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InJustificIdJustific" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InAuthorIefSuppliedFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InProxyTrxRecoveryReferenceNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FTRS01_FtrTrnInterbankOrderSrvImport", propOrder = {
    "command",
    "inIefSuppliedCommand",
    "inCorrespondentCustomerCustId",
    "inCorrespondentProfitsAccountAccountNumber",
    "inCorrespondentProfitsAccountAccountCd",
    "inOrderAmountIefSuppliedPayableAmount",
    "inOrderCurrencyIdCurrency",
    "inOrderingCustomerCustId",
    "inOrderingProfitsAccountAccountNumber",
    "inOrderingProfitsAccountAccountCd",
    "inOrderingCommentsGenericDetailDescription",
    "inOutgoingOrdersAccWithBankSwif",
    "inOutgoingOrdersBenefAccount",
    "inOutgoingOrdersBenefName",
    "inOutgoingOrdersBenefAddress1",
    "inOutgoingOrdersBenefAddress2",
    "inOutgoingOrdersBenefCity",
    "inOutgoingOrdersBenefCountry",
    "inOutgoingOrdersBenefZipCode",
    "inOutgoingOrdersBenefPhone",
    "inOutgoingOrdersFbCharges",
    "inOutgoingOrdersSenderToReceiver",
    "inPaymentBankParametersCurrTrxDate",
    "inProductIdProduct",
    "inJustificIdJustific",
    "inAuthorIefSuppliedFlag",
    "inProxyTrxRecoveryReferenceNumber"
})
public class FTRS01FtrTrnInterbankOrderSrvImport
    extends BaseImport
{

    @XmlElement(name = "Command")
    protected String command;
    @XmlElement(name = "InIefSuppliedCommand")
    protected String inIefSuppliedCommand;
    @XmlElement(name = "InCorrespondentCustomerCustId")
    protected int inCorrespondentCustomerCustId;
    @XmlElement(name = "InCorrespondentProfitsAccountAccountNumber")
    protected String inCorrespondentProfitsAccountAccountNumber;
    @XmlElement(name = "InCorrespondentProfitsAccountAccountCd")
    protected short inCorrespondentProfitsAccountAccountCd;
    @XmlElement(name = "InOrderAmountIefSuppliedPayableAmount", required = true)
    protected BigDecimal inOrderAmountIefSuppliedPayableAmount;
    @XmlElement(name = "InOrderCurrencyIdCurrency")
    protected int inOrderCurrencyIdCurrency;
    @XmlElement(name = "InOrderingCustomerCustId")
    protected int inOrderingCustomerCustId;
    @XmlElement(name = "InOrderingProfitsAccountAccountNumber")
    protected String inOrderingProfitsAccountAccountNumber;
    @XmlElement(name = "InOrderingProfitsAccountAccountCd")
    protected short inOrderingProfitsAccountAccountCd;
    @XmlElement(name = "InOrderingCommentsGenericDetailDescription")
    protected String inOrderingCommentsGenericDetailDescription;
    @XmlElement(name = "InOutgoingOrdersAccWithBankSwif")
    protected String inOutgoingOrdersAccWithBankSwif;
    @XmlElement(name = "InOutgoingOrdersBenefAccount")
    protected String inOutgoingOrdersBenefAccount;
    @XmlElement(name = "InOutgoingOrdersBenefName")
    protected String inOutgoingOrdersBenefName;
    @XmlElement(name = "InOutgoingOrdersBenefAddress1")
    protected String inOutgoingOrdersBenefAddress1;
    @XmlElement(name = "InOutgoingOrdersBenefAddress2")
    protected String inOutgoingOrdersBenefAddress2;
    @XmlElement(name = "InOutgoingOrdersBenefCity")
    protected String inOutgoingOrdersBenefCity;
    @XmlElement(name = "InOutgoingOrdersBenefCountry")
    protected String inOutgoingOrdersBenefCountry;
    @XmlElement(name = "InOutgoingOrdersBenefZipCode")
    protected String inOutgoingOrdersBenefZipCode;
    @XmlElement(name = "InOutgoingOrdersBenefPhone")
    protected String inOutgoingOrdersBenefPhone;
    @XmlElement(name = "InOutgoingOrdersFbCharges")
    protected String inOutgoingOrdersFbCharges;
    @XmlElement(name = "InOutgoingOrdersSenderToReceiver")
    protected String inOutgoingOrdersSenderToReceiver;
    @XmlElement(name = "InPaymentBankParametersCurrTrxDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inPaymentBankParametersCurrTrxDate;
    @XmlElement(name = "InProductIdProduct")
    protected int inProductIdProduct;
    @XmlElement(name = "InJustificIdJustific")
    protected int inJustificIdJustific;
    @XmlElement(name = "InAuthorIefSuppliedFlag")
    protected String inAuthorIefSuppliedFlag;
    @XmlElement(name = "InProxyTrxRecoveryReferenceNumber")
    protected String inProxyTrxRecoveryReferenceNumber;

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
     * Gets the value of the inIefSuppliedCommand property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInIefSuppliedCommand() {
        return inIefSuppliedCommand;
    }

    /**
     * Sets the value of the inIefSuppliedCommand property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInIefSuppliedCommand(String value) {
        this.inIefSuppliedCommand = value;
    }

    /**
     * Gets the value of the inCorrespondentCustomerCustId property.
     * 
     */
    public int getInCorrespondentCustomerCustId() {
        return inCorrespondentCustomerCustId;
    }

    /**
     * Sets the value of the inCorrespondentCustomerCustId property.
     * 
     */
    public void setInCorrespondentCustomerCustId(int value) {
        this.inCorrespondentCustomerCustId = value;
    }

    /**
     * Gets the value of the inCorrespondentProfitsAccountAccountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCorrespondentProfitsAccountAccountNumber() {
        return inCorrespondentProfitsAccountAccountNumber;
    }

    /**
     * Sets the value of the inCorrespondentProfitsAccountAccountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCorrespondentProfitsAccountAccountNumber(String value) {
        this.inCorrespondentProfitsAccountAccountNumber = value;
    }

    /**
     * Gets the value of the inCorrespondentProfitsAccountAccountCd property.
     * 
     */
    public short getInCorrespondentProfitsAccountAccountCd() {
        return inCorrespondentProfitsAccountAccountCd;
    }

    /**
     * Sets the value of the inCorrespondentProfitsAccountAccountCd property.
     * 
     */
    public void setInCorrespondentProfitsAccountAccountCd(short value) {
        this.inCorrespondentProfitsAccountAccountCd = value;
    }

    /**
     * Gets the value of the inOrderAmountIefSuppliedPayableAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInOrderAmountIefSuppliedPayableAmount() {
        return inOrderAmountIefSuppliedPayableAmount;
    }

    /**
     * Sets the value of the inOrderAmountIefSuppliedPayableAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInOrderAmountIefSuppliedPayableAmount(BigDecimal value) {
        this.inOrderAmountIefSuppliedPayableAmount = value;
    }

    /**
     * Gets the value of the inOrderCurrencyIdCurrency property.
     * 
     */
    public int getInOrderCurrencyIdCurrency() {
        return inOrderCurrencyIdCurrency;
    }

    /**
     * Sets the value of the inOrderCurrencyIdCurrency property.
     * 
     */
    public void setInOrderCurrencyIdCurrency(int value) {
        this.inOrderCurrencyIdCurrency = value;
    }

    /**
     * Gets the value of the inOrderingCustomerCustId property.
     * 
     */
    public int getInOrderingCustomerCustId() {
        return inOrderingCustomerCustId;
    }

    /**
     * Sets the value of the inOrderingCustomerCustId property.
     * 
     */
    public void setInOrderingCustomerCustId(int value) {
        this.inOrderingCustomerCustId = value;
    }

    /**
     * Gets the value of the inOrderingProfitsAccountAccountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInOrderingProfitsAccountAccountNumber() {
        return inOrderingProfitsAccountAccountNumber;
    }

    /**
     * Sets the value of the inOrderingProfitsAccountAccountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInOrderingProfitsAccountAccountNumber(String value) {
        this.inOrderingProfitsAccountAccountNumber = value;
    }

    /**
     * Gets the value of the inOrderingProfitsAccountAccountCd property.
     * 
     */
    public short getInOrderingProfitsAccountAccountCd() {
        return inOrderingProfitsAccountAccountCd;
    }

    /**
     * Sets the value of the inOrderingProfitsAccountAccountCd property.
     * 
     */
    public void setInOrderingProfitsAccountAccountCd(short value) {
        this.inOrderingProfitsAccountAccountCd = value;
    }

    /**
     * Gets the value of the inOrderingCommentsGenericDetailDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInOrderingCommentsGenericDetailDescription() {
        return inOrderingCommentsGenericDetailDescription;
    }

    /**
     * Sets the value of the inOrderingCommentsGenericDetailDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInOrderingCommentsGenericDetailDescription(String value) {
        this.inOrderingCommentsGenericDetailDescription = value;
    }

    /**
     * Gets the value of the inOutgoingOrdersAccWithBankSwif property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInOutgoingOrdersAccWithBankSwif() {
        return inOutgoingOrdersAccWithBankSwif;
    }

    /**
     * Sets the value of the inOutgoingOrdersAccWithBankSwif property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInOutgoingOrdersAccWithBankSwif(String value) {
        this.inOutgoingOrdersAccWithBankSwif = value;
    }

    /**
     * Gets the value of the inOutgoingOrdersBenefAccount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInOutgoingOrdersBenefAccount() {
        return inOutgoingOrdersBenefAccount;
    }

    /**
     * Sets the value of the inOutgoingOrdersBenefAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInOutgoingOrdersBenefAccount(String value) {
        this.inOutgoingOrdersBenefAccount = value;
    }

    /**
     * Gets the value of the inOutgoingOrdersBenefName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInOutgoingOrdersBenefName() {
        return inOutgoingOrdersBenefName;
    }

    /**
     * Sets the value of the inOutgoingOrdersBenefName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInOutgoingOrdersBenefName(String value) {
        this.inOutgoingOrdersBenefName = value;
    }

    /**
     * Gets the value of the inOutgoingOrdersBenefAddress1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInOutgoingOrdersBenefAddress1() {
        return inOutgoingOrdersBenefAddress1;
    }

    /**
     * Sets the value of the inOutgoingOrdersBenefAddress1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInOutgoingOrdersBenefAddress1(String value) {
        this.inOutgoingOrdersBenefAddress1 = value;
    }

    /**
     * Gets the value of the inOutgoingOrdersBenefAddress2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInOutgoingOrdersBenefAddress2() {
        return inOutgoingOrdersBenefAddress2;
    }

    /**
     * Sets the value of the inOutgoingOrdersBenefAddress2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInOutgoingOrdersBenefAddress2(String value) {
        this.inOutgoingOrdersBenefAddress2 = value;
    }

    /**
     * Gets the value of the inOutgoingOrdersBenefCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInOutgoingOrdersBenefCity() {
        return inOutgoingOrdersBenefCity;
    }

    /**
     * Sets the value of the inOutgoingOrdersBenefCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInOutgoingOrdersBenefCity(String value) {
        this.inOutgoingOrdersBenefCity = value;
    }

    /**
     * Gets the value of the inOutgoingOrdersBenefCountry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInOutgoingOrdersBenefCountry() {
        return inOutgoingOrdersBenefCountry;
    }

    /**
     * Sets the value of the inOutgoingOrdersBenefCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInOutgoingOrdersBenefCountry(String value) {
        this.inOutgoingOrdersBenefCountry = value;
    }

    /**
     * Gets the value of the inOutgoingOrdersBenefZipCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInOutgoingOrdersBenefZipCode() {
        return inOutgoingOrdersBenefZipCode;
    }

    /**
     * Sets the value of the inOutgoingOrdersBenefZipCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInOutgoingOrdersBenefZipCode(String value) {
        this.inOutgoingOrdersBenefZipCode = value;
    }

    /**
     * Gets the value of the inOutgoingOrdersBenefPhone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInOutgoingOrdersBenefPhone() {
        return inOutgoingOrdersBenefPhone;
    }

    /**
     * Sets the value of the inOutgoingOrdersBenefPhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInOutgoingOrdersBenefPhone(String value) {
        this.inOutgoingOrdersBenefPhone = value;
    }

    /**
     * Gets the value of the inOutgoingOrdersFbCharges property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInOutgoingOrdersFbCharges() {
        return inOutgoingOrdersFbCharges;
    }

    /**
     * Sets the value of the inOutgoingOrdersFbCharges property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInOutgoingOrdersFbCharges(String value) {
        this.inOutgoingOrdersFbCharges = value;
    }

    /**
     * Gets the value of the inOutgoingOrdersSenderToReceiver property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInOutgoingOrdersSenderToReceiver() {
        return inOutgoingOrdersSenderToReceiver;
    }

    /**
     * Sets the value of the inOutgoingOrdersSenderToReceiver property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInOutgoingOrdersSenderToReceiver(String value) {
        this.inOutgoingOrdersSenderToReceiver = value;
    }

    /**
     * Gets the value of the inPaymentBankParametersCurrTrxDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInPaymentBankParametersCurrTrxDate() {
        return inPaymentBankParametersCurrTrxDate;
    }

    /**
     * Sets the value of the inPaymentBankParametersCurrTrxDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInPaymentBankParametersCurrTrxDate(XMLGregorianCalendar value) {
        this.inPaymentBankParametersCurrTrxDate = value;
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
     * Gets the value of the inAuthorIefSuppliedFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInAuthorIefSuppliedFlag() {
        return inAuthorIefSuppliedFlag;
    }

    /**
     * Sets the value of the inAuthorIefSuppliedFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInAuthorIefSuppliedFlag(String value) {
        this.inAuthorIefSuppliedFlag = value;
    }

    /**
     * Gets the value of the inProxyTrxRecoveryReferenceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInProxyTrxRecoveryReferenceNumber() {
        return inProxyTrxRecoveryReferenceNumber;
    }

    /**
     * Sets the value of the inProxyTrxRecoveryReferenceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInProxyTrxRecoveryReferenceNumber(String value) {
        this.inProxyTrxRecoveryReferenceNumber = value;
    }

}
