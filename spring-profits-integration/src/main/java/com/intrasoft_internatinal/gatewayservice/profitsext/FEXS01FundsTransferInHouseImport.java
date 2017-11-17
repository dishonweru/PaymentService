
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FEXS01_FundsTransferInHouseImport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FEXS01_FundsTransferInHouseImport">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}BaseImport">
 *       &lt;sequence>
 *         &lt;element name="CustomerCustId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="CustomerCDigit" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="DebitProfitsAccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DebitProfitsAccountCd" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="DebitProfitsAccountPrftSystem" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="DeditComment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DebitAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="CreditProfitsAccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CreditProfitsAccountCd" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="CreditProfitsAccountPrftSystem" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="CreditComment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CreditAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FEXS01_FundsTransferInHouseImport", propOrder = {
    "customerCustId",
    "customerCDigit",
    "debitProfitsAccountNumber",
    "debitProfitsAccountCd",
    "debitProfitsAccountPrftSystem",
    "deditComment",
    "debitAmount",
    "creditProfitsAccountNumber",
    "creditProfitsAccountCd",
    "creditProfitsAccountPrftSystem",
    "creditComment",
    "creditAmount"
})
public class FEXS01FundsTransferInHouseImport
    extends BaseImport
{

    @XmlElement(name = "CustomerCustId")
    protected int customerCustId;
    @XmlElement(name = "CustomerCDigit")
    protected short customerCDigit;
    @XmlElement(name = "DebitProfitsAccountNumber")
    protected String debitProfitsAccountNumber;
    @XmlElement(name = "DebitProfitsAccountCd")
    protected short debitProfitsAccountCd;
    @XmlElement(name = "DebitProfitsAccountPrftSystem")
    protected int debitProfitsAccountPrftSystem;
    @XmlElement(name = "DeditComment")
    protected String deditComment;
    @XmlElement(name = "DebitAmount", required = true)
    protected BigDecimal debitAmount;
    @XmlElement(name = "CreditProfitsAccountNumber")
    protected String creditProfitsAccountNumber;
    @XmlElement(name = "CreditProfitsAccountCd")
    protected short creditProfitsAccountCd;
    @XmlElement(name = "CreditProfitsAccountPrftSystem")
    protected int creditProfitsAccountPrftSystem;
    @XmlElement(name = "CreditComment")
    protected String creditComment;
    @XmlElement(name = "CreditAmount", required = true)
    protected BigDecimal creditAmount;

    /**
     * Gets the value of the customerCustId property.
     * 
     */
    public int getCustomerCustId() {
        return customerCustId;
    }

    /**
     * Sets the value of the customerCustId property.
     * 
     */
    public void setCustomerCustId(int value) {
        this.customerCustId = value;
    }

    /**
     * Gets the value of the customerCDigit property.
     * 
     */
    public short getCustomerCDigit() {
        return customerCDigit;
    }

    /**
     * Sets the value of the customerCDigit property.
     * 
     */
    public void setCustomerCDigit(short value) {
        this.customerCDigit = value;
    }

    /**
     * Gets the value of the debitProfitsAccountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDebitProfitsAccountNumber() {
        return debitProfitsAccountNumber;
    }

    /**
     * Sets the value of the debitProfitsAccountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDebitProfitsAccountNumber(String value) {
        this.debitProfitsAccountNumber = value;
    }

    /**
     * Gets the value of the debitProfitsAccountCd property.
     * 
     */
    public short getDebitProfitsAccountCd() {
        return debitProfitsAccountCd;
    }

    /**
     * Sets the value of the debitProfitsAccountCd property.
     * 
     */
    public void setDebitProfitsAccountCd(short value) {
        this.debitProfitsAccountCd = value;
    }

    /**
     * Gets the value of the debitProfitsAccountPrftSystem property.
     * 
     */
    public int getDebitProfitsAccountPrftSystem() {
        return debitProfitsAccountPrftSystem;
    }

    /**
     * Sets the value of the debitProfitsAccountPrftSystem property.
     * 
     */
    public void setDebitProfitsAccountPrftSystem(int value) {
        this.debitProfitsAccountPrftSystem = value;
    }

    /**
     * Gets the value of the deditComment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeditComment() {
        return deditComment;
    }

    /**
     * Sets the value of the deditComment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeditComment(String value) {
        this.deditComment = value;
    }

    /**
     * Gets the value of the debitAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDebitAmount() {
        return debitAmount;
    }

    /**
     * Sets the value of the debitAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDebitAmount(BigDecimal value) {
        this.debitAmount = value;
    }

    /**
     * Gets the value of the creditProfitsAccountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditProfitsAccountNumber() {
        return creditProfitsAccountNumber;
    }

    /**
     * Sets the value of the creditProfitsAccountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditProfitsAccountNumber(String value) {
        this.creditProfitsAccountNumber = value;
    }

    /**
     * Gets the value of the creditProfitsAccountCd property.
     * 
     */
    public short getCreditProfitsAccountCd() {
        return creditProfitsAccountCd;
    }

    /**
     * Sets the value of the creditProfitsAccountCd property.
     * 
     */
    public void setCreditProfitsAccountCd(short value) {
        this.creditProfitsAccountCd = value;
    }

    /**
     * Gets the value of the creditProfitsAccountPrftSystem property.
     * 
     */
    public int getCreditProfitsAccountPrftSystem() {
        return creditProfitsAccountPrftSystem;
    }

    /**
     * Sets the value of the creditProfitsAccountPrftSystem property.
     * 
     */
    public void setCreditProfitsAccountPrftSystem(int value) {
        this.creditProfitsAccountPrftSystem = value;
    }

    /**
     * Gets the value of the creditComment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditComment() {
        return creditComment;
    }

    /**
     * Sets the value of the creditComment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditComment(String value) {
        this.creditComment = value;
    }

    /**
     * Gets the value of the creditAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCreditAmount() {
        return creditAmount;
    }

    /**
     * Sets the value of the creditAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCreditAmount(BigDecimal value) {
        this.creditAmount = value;
    }

}
