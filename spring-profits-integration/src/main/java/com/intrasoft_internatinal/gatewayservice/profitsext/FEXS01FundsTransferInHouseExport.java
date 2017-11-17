
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for FEXS01_FundsTransferInHouseExport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FEXS01_FundsTransferInHouseExport">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}BaseExport">
 *       &lt;sequence>
 *         &lt;element name="WithdrawnAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="WithdrawnCurrency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DepositAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="DepositCurrency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BeneficiaryName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Commission" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="CommisionCurrency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Expenses" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="ExpencesCurrency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ExchangeRate" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="BankTransactionDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FEXS01_FundsTransferInHouseExport", propOrder = {
    "withdrawnAmount",
    "withdrawnCurrency",
    "depositAmount",
    "depositCurrency",
    "beneficiaryName",
    "commission",
    "commisionCurrency",
    "expenses",
    "expencesCurrency",
    "exchangeRate",
    "bankTransactionDate"
})
public class FEXS01FundsTransferInHouseExport
    extends BaseExport
{

    @XmlElement(name = "WithdrawnAmount", required = true)
    protected BigDecimal withdrawnAmount;
    @XmlElement(name = "WithdrawnCurrency")
    protected String withdrawnCurrency;
    @XmlElement(name = "DepositAmount", required = true)
    protected BigDecimal depositAmount;
    @XmlElement(name = "DepositCurrency")
    protected String depositCurrency;
    @XmlElement(name = "BeneficiaryName")
    protected String beneficiaryName;
    @XmlElement(name = "Commission", required = true)
    protected BigDecimal commission;
    @XmlElement(name = "CommisionCurrency")
    protected String commisionCurrency;
    @XmlElement(name = "Expenses", required = true)
    protected BigDecimal expenses;
    @XmlElement(name = "ExpencesCurrency")
    protected String expencesCurrency;
    @XmlElement(name = "ExchangeRate", required = true)
    protected BigDecimal exchangeRate;
    @XmlElement(name = "BankTransactionDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar bankTransactionDate;

    /**
     * Gets the value of the withdrawnAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getWithdrawnAmount() {
        return withdrawnAmount;
    }

    /**
     * Sets the value of the withdrawnAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setWithdrawnAmount(BigDecimal value) {
        this.withdrawnAmount = value;
    }

    /**
     * Gets the value of the withdrawnCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWithdrawnCurrency() {
        return withdrawnCurrency;
    }

    /**
     * Sets the value of the withdrawnCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWithdrawnCurrency(String value) {
        this.withdrawnCurrency = value;
    }

    /**
     * Gets the value of the depositAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDepositAmount() {
        return depositAmount;
    }

    /**
     * Sets the value of the depositAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDepositAmount(BigDecimal value) {
        this.depositAmount = value;
    }

    /**
     * Gets the value of the depositCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepositCurrency() {
        return depositCurrency;
    }

    /**
     * Sets the value of the depositCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepositCurrency(String value) {
        this.depositCurrency = value;
    }

    /**
     * Gets the value of the beneficiaryName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBeneficiaryName() {
        return beneficiaryName;
    }

    /**
     * Sets the value of the beneficiaryName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBeneficiaryName(String value) {
        this.beneficiaryName = value;
    }

    /**
     * Gets the value of the commission property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCommission() {
        return commission;
    }

    /**
     * Sets the value of the commission property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCommission(BigDecimal value) {
        this.commission = value;
    }

    /**
     * Gets the value of the commisionCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommisionCurrency() {
        return commisionCurrency;
    }

    /**
     * Sets the value of the commisionCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommisionCurrency(String value) {
        this.commisionCurrency = value;
    }

    /**
     * Gets the value of the expenses property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getExpenses() {
        return expenses;
    }

    /**
     * Sets the value of the expenses property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setExpenses(BigDecimal value) {
        this.expenses = value;
    }

    /**
     * Gets the value of the expencesCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpencesCurrency() {
        return expencesCurrency;
    }

    /**
     * Sets the value of the expencesCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpencesCurrency(String value) {
        this.expencesCurrency = value;
    }

    /**
     * Gets the value of the exchangeRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getExchangeRate() {
        return exchangeRate;
    }

    /**
     * Sets the value of the exchangeRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setExchangeRate(BigDecimal value) {
        this.exchangeRate = value;
    }

    /**
     * Gets the value of the bankTransactionDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBankTransactionDate() {
        return bankTransactionDate;
    }

    /**
     * Sets the value of the bankTransactionDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBankTransactionDate(XMLGregorianCalendar value) {
        this.bankTransactionDate = value;
    }

}
