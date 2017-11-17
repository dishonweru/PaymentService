
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for L0494VOutGrpAccountsItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="L0494VOutGrpAccountsItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OutGrpAccountsOutGrmAccBalancesLoanAccountDrvWorkAccountBal" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpAccountsOutGrmAccBalancesLoanAccountDrvWorkNrmAccountBal" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpAccountsOutGrmAccBalancesLoanAccountDrvWorkOvAccBookBal" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpAccountsOutGrmAccBalancesLoanAccountDrvWorkOvAccountBal" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpAccountsOutGrmAccCustomerAlertMsg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpAccountsOutGrmAccCustomerCDigit" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutGrpAccountsOutGrmAccCustomerCustId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGrpAccountsOutGrmAccLimitCurrencyIdCurrency" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGrpAccountsOutGrmAccLimitCurrencyShortDescr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpAccountsOutGrmAccLoanAccountAccLimitAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpAccountsOutGrmAccLoanAccountAccMechanism" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpAccountsOutGrmAccLoanAccountAccStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpAccountsOutGrmAccLoanAccountLoanStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpAccountsOutGrmAccMonitoringUnitCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGrpAccountsOutGrmAccMonitoringUnitUnitName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpAccountsOutGrmAccMovementCurrencyIdCurrency" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGrpAccountsOutGrmAccMovementCurrencyShortDescr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpAccountsOutGrmAccNameListSetDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpAccountsOutGrmAccProductDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpAccountsOutGrmAccProductIdProduct" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGrpAccountsOutGrmAccProfitsAccountAccountCd" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutGrpAccountsOutGrmAccProfitsAccountAccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpAccountsOutGrmAccProfitsAccountPrftSystem" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "L0494VOutGrpAccountsItem", propOrder = {
    "outGrpAccountsOutGrmAccBalancesLoanAccountDrvWorkAccountBal",
    "outGrpAccountsOutGrmAccBalancesLoanAccountDrvWorkNrmAccountBal",
    "outGrpAccountsOutGrmAccBalancesLoanAccountDrvWorkOvAccBookBal",
    "outGrpAccountsOutGrmAccBalancesLoanAccountDrvWorkOvAccountBal",
    "outGrpAccountsOutGrmAccCustomerAlertMsg",
    "outGrpAccountsOutGrmAccCustomerCDigit",
    "outGrpAccountsOutGrmAccCustomerCustId",
    "outGrpAccountsOutGrmAccLimitCurrencyIdCurrency",
    "outGrpAccountsOutGrmAccLimitCurrencyShortDescr",
    "outGrpAccountsOutGrmAccLoanAccountAccLimitAmn",
    "outGrpAccountsOutGrmAccLoanAccountAccMechanism",
    "outGrpAccountsOutGrmAccLoanAccountAccStatus",
    "outGrpAccountsOutGrmAccLoanAccountLoanStatus",
    "outGrpAccountsOutGrmAccMonitoringUnitCode",
    "outGrpAccountsOutGrmAccMonitoringUnitUnitName",
    "outGrpAccountsOutGrmAccMovementCurrencyIdCurrency",
    "outGrpAccountsOutGrmAccMovementCurrencyShortDescr",
    "outGrpAccountsOutGrmAccNameListSetDescription",
    "outGrpAccountsOutGrmAccProductDescription",
    "outGrpAccountsOutGrmAccProductIdProduct",
    "outGrpAccountsOutGrmAccProfitsAccountAccountCd",
    "outGrpAccountsOutGrmAccProfitsAccountAccountNumber",
    "outGrpAccountsOutGrmAccProfitsAccountPrftSystem"
})
public class L0494VOutGrpAccountsItem {

    @XmlElement(name = "OutGrpAccountsOutGrmAccBalancesLoanAccountDrvWorkAccountBal", required = true)
    protected BigDecimal outGrpAccountsOutGrmAccBalancesLoanAccountDrvWorkAccountBal;
    @XmlElement(name = "OutGrpAccountsOutGrmAccBalancesLoanAccountDrvWorkNrmAccountBal", required = true)
    protected BigDecimal outGrpAccountsOutGrmAccBalancesLoanAccountDrvWorkNrmAccountBal;
    @XmlElement(name = "OutGrpAccountsOutGrmAccBalancesLoanAccountDrvWorkOvAccBookBal", required = true)
    protected BigDecimal outGrpAccountsOutGrmAccBalancesLoanAccountDrvWorkOvAccBookBal;
    @XmlElement(name = "OutGrpAccountsOutGrmAccBalancesLoanAccountDrvWorkOvAccountBal", required = true)
    protected BigDecimal outGrpAccountsOutGrmAccBalancesLoanAccountDrvWorkOvAccountBal;
    @XmlElement(name = "OutGrpAccountsOutGrmAccCustomerAlertMsg")
    protected String outGrpAccountsOutGrmAccCustomerAlertMsg;
    @XmlElement(name = "OutGrpAccountsOutGrmAccCustomerCDigit")
    protected short outGrpAccountsOutGrmAccCustomerCDigit;
    @XmlElement(name = "OutGrpAccountsOutGrmAccCustomerCustId")
    protected int outGrpAccountsOutGrmAccCustomerCustId;
    @XmlElement(name = "OutGrpAccountsOutGrmAccLimitCurrencyIdCurrency")
    protected int outGrpAccountsOutGrmAccLimitCurrencyIdCurrency;
    @XmlElement(name = "OutGrpAccountsOutGrmAccLimitCurrencyShortDescr")
    protected String outGrpAccountsOutGrmAccLimitCurrencyShortDescr;
    @XmlElement(name = "OutGrpAccountsOutGrmAccLoanAccountAccLimitAmn", required = true)
    protected BigDecimal outGrpAccountsOutGrmAccLoanAccountAccLimitAmn;
    @XmlElement(name = "OutGrpAccountsOutGrmAccLoanAccountAccMechanism")
    protected String outGrpAccountsOutGrmAccLoanAccountAccMechanism;
    @XmlElement(name = "OutGrpAccountsOutGrmAccLoanAccountAccStatus")
    protected String outGrpAccountsOutGrmAccLoanAccountAccStatus;
    @XmlElement(name = "OutGrpAccountsOutGrmAccLoanAccountLoanStatus")
    protected String outGrpAccountsOutGrmAccLoanAccountLoanStatus;
    @XmlElement(name = "OutGrpAccountsOutGrmAccMonitoringUnitCode")
    protected int outGrpAccountsOutGrmAccMonitoringUnitCode;
    @XmlElement(name = "OutGrpAccountsOutGrmAccMonitoringUnitUnitName")
    protected String outGrpAccountsOutGrmAccMonitoringUnitUnitName;
    @XmlElement(name = "OutGrpAccountsOutGrmAccMovementCurrencyIdCurrency")
    protected int outGrpAccountsOutGrmAccMovementCurrencyIdCurrency;
    @XmlElement(name = "OutGrpAccountsOutGrmAccMovementCurrencyShortDescr")
    protected String outGrpAccountsOutGrmAccMovementCurrencyShortDescr;
    @XmlElement(name = "OutGrpAccountsOutGrmAccNameListSetDescription")
    protected String outGrpAccountsOutGrmAccNameListSetDescription;
    @XmlElement(name = "OutGrpAccountsOutGrmAccProductDescription")
    protected String outGrpAccountsOutGrmAccProductDescription;
    @XmlElement(name = "OutGrpAccountsOutGrmAccProductIdProduct")
    protected int outGrpAccountsOutGrmAccProductIdProduct;
    @XmlElement(name = "OutGrpAccountsOutGrmAccProfitsAccountAccountCd")
    protected short outGrpAccountsOutGrmAccProfitsAccountAccountCd;
    @XmlElement(name = "OutGrpAccountsOutGrmAccProfitsAccountAccountNumber")
    protected String outGrpAccountsOutGrmAccProfitsAccountAccountNumber;
    @XmlElement(name = "OutGrpAccountsOutGrmAccProfitsAccountPrftSystem")
    protected short outGrpAccountsOutGrmAccProfitsAccountPrftSystem;

    /**
     * Gets the value of the outGrpAccountsOutGrmAccBalancesLoanAccountDrvWorkAccountBal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpAccountsOutGrmAccBalancesLoanAccountDrvWorkAccountBal() {
        return outGrpAccountsOutGrmAccBalancesLoanAccountDrvWorkAccountBal;
    }

    /**
     * Sets the value of the outGrpAccountsOutGrmAccBalancesLoanAccountDrvWorkAccountBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpAccountsOutGrmAccBalancesLoanAccountDrvWorkAccountBal(BigDecimal value) {
        this.outGrpAccountsOutGrmAccBalancesLoanAccountDrvWorkAccountBal = value;
    }

    /**
     * Gets the value of the outGrpAccountsOutGrmAccBalancesLoanAccountDrvWorkNrmAccountBal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpAccountsOutGrmAccBalancesLoanAccountDrvWorkNrmAccountBal() {
        return outGrpAccountsOutGrmAccBalancesLoanAccountDrvWorkNrmAccountBal;
    }

    /**
     * Sets the value of the outGrpAccountsOutGrmAccBalancesLoanAccountDrvWorkNrmAccountBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpAccountsOutGrmAccBalancesLoanAccountDrvWorkNrmAccountBal(BigDecimal value) {
        this.outGrpAccountsOutGrmAccBalancesLoanAccountDrvWorkNrmAccountBal = value;
    }

    /**
     * Gets the value of the outGrpAccountsOutGrmAccBalancesLoanAccountDrvWorkOvAccBookBal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpAccountsOutGrmAccBalancesLoanAccountDrvWorkOvAccBookBal() {
        return outGrpAccountsOutGrmAccBalancesLoanAccountDrvWorkOvAccBookBal;
    }

    /**
     * Sets the value of the outGrpAccountsOutGrmAccBalancesLoanAccountDrvWorkOvAccBookBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpAccountsOutGrmAccBalancesLoanAccountDrvWorkOvAccBookBal(BigDecimal value) {
        this.outGrpAccountsOutGrmAccBalancesLoanAccountDrvWorkOvAccBookBal = value;
    }

    /**
     * Gets the value of the outGrpAccountsOutGrmAccBalancesLoanAccountDrvWorkOvAccountBal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpAccountsOutGrmAccBalancesLoanAccountDrvWorkOvAccountBal() {
        return outGrpAccountsOutGrmAccBalancesLoanAccountDrvWorkOvAccountBal;
    }

    /**
     * Sets the value of the outGrpAccountsOutGrmAccBalancesLoanAccountDrvWorkOvAccountBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpAccountsOutGrmAccBalancesLoanAccountDrvWorkOvAccountBal(BigDecimal value) {
        this.outGrpAccountsOutGrmAccBalancesLoanAccountDrvWorkOvAccountBal = value;
    }

    /**
     * Gets the value of the outGrpAccountsOutGrmAccCustomerAlertMsg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpAccountsOutGrmAccCustomerAlertMsg() {
        return outGrpAccountsOutGrmAccCustomerAlertMsg;
    }

    /**
     * Sets the value of the outGrpAccountsOutGrmAccCustomerAlertMsg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpAccountsOutGrmAccCustomerAlertMsg(String value) {
        this.outGrpAccountsOutGrmAccCustomerAlertMsg = value;
    }

    /**
     * Gets the value of the outGrpAccountsOutGrmAccCustomerCDigit property.
     * 
     */
    public short getOutGrpAccountsOutGrmAccCustomerCDigit() {
        return outGrpAccountsOutGrmAccCustomerCDigit;
    }

    /**
     * Sets the value of the outGrpAccountsOutGrmAccCustomerCDigit property.
     * 
     */
    public void setOutGrpAccountsOutGrmAccCustomerCDigit(short value) {
        this.outGrpAccountsOutGrmAccCustomerCDigit = value;
    }

    /**
     * Gets the value of the outGrpAccountsOutGrmAccCustomerCustId property.
     * 
     */
    public int getOutGrpAccountsOutGrmAccCustomerCustId() {
        return outGrpAccountsOutGrmAccCustomerCustId;
    }

    /**
     * Sets the value of the outGrpAccountsOutGrmAccCustomerCustId property.
     * 
     */
    public void setOutGrpAccountsOutGrmAccCustomerCustId(int value) {
        this.outGrpAccountsOutGrmAccCustomerCustId = value;
    }

    /**
     * Gets the value of the outGrpAccountsOutGrmAccLimitCurrencyIdCurrency property.
     * 
     */
    public int getOutGrpAccountsOutGrmAccLimitCurrencyIdCurrency() {
        return outGrpAccountsOutGrmAccLimitCurrencyIdCurrency;
    }

    /**
     * Sets the value of the outGrpAccountsOutGrmAccLimitCurrencyIdCurrency property.
     * 
     */
    public void setOutGrpAccountsOutGrmAccLimitCurrencyIdCurrency(int value) {
        this.outGrpAccountsOutGrmAccLimitCurrencyIdCurrency = value;
    }

    /**
     * Gets the value of the outGrpAccountsOutGrmAccLimitCurrencyShortDescr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpAccountsOutGrmAccLimitCurrencyShortDescr() {
        return outGrpAccountsOutGrmAccLimitCurrencyShortDescr;
    }

    /**
     * Sets the value of the outGrpAccountsOutGrmAccLimitCurrencyShortDescr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpAccountsOutGrmAccLimitCurrencyShortDescr(String value) {
        this.outGrpAccountsOutGrmAccLimitCurrencyShortDescr = value;
    }

    /**
     * Gets the value of the outGrpAccountsOutGrmAccLoanAccountAccLimitAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpAccountsOutGrmAccLoanAccountAccLimitAmn() {
        return outGrpAccountsOutGrmAccLoanAccountAccLimitAmn;
    }

    /**
     * Sets the value of the outGrpAccountsOutGrmAccLoanAccountAccLimitAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpAccountsOutGrmAccLoanAccountAccLimitAmn(BigDecimal value) {
        this.outGrpAccountsOutGrmAccLoanAccountAccLimitAmn = value;
    }

    /**
     * Gets the value of the outGrpAccountsOutGrmAccLoanAccountAccMechanism property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpAccountsOutGrmAccLoanAccountAccMechanism() {
        return outGrpAccountsOutGrmAccLoanAccountAccMechanism;
    }

    /**
     * Sets the value of the outGrpAccountsOutGrmAccLoanAccountAccMechanism property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpAccountsOutGrmAccLoanAccountAccMechanism(String value) {
        this.outGrpAccountsOutGrmAccLoanAccountAccMechanism = value;
    }

    /**
     * Gets the value of the outGrpAccountsOutGrmAccLoanAccountAccStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpAccountsOutGrmAccLoanAccountAccStatus() {
        return outGrpAccountsOutGrmAccLoanAccountAccStatus;
    }

    /**
     * Sets the value of the outGrpAccountsOutGrmAccLoanAccountAccStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpAccountsOutGrmAccLoanAccountAccStatus(String value) {
        this.outGrpAccountsOutGrmAccLoanAccountAccStatus = value;
    }

    /**
     * Gets the value of the outGrpAccountsOutGrmAccLoanAccountLoanStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpAccountsOutGrmAccLoanAccountLoanStatus() {
        return outGrpAccountsOutGrmAccLoanAccountLoanStatus;
    }

    /**
     * Sets the value of the outGrpAccountsOutGrmAccLoanAccountLoanStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpAccountsOutGrmAccLoanAccountLoanStatus(String value) {
        this.outGrpAccountsOutGrmAccLoanAccountLoanStatus = value;
    }

    /**
     * Gets the value of the outGrpAccountsOutGrmAccMonitoringUnitCode property.
     * 
     */
    public int getOutGrpAccountsOutGrmAccMonitoringUnitCode() {
        return outGrpAccountsOutGrmAccMonitoringUnitCode;
    }

    /**
     * Sets the value of the outGrpAccountsOutGrmAccMonitoringUnitCode property.
     * 
     */
    public void setOutGrpAccountsOutGrmAccMonitoringUnitCode(int value) {
        this.outGrpAccountsOutGrmAccMonitoringUnitCode = value;
    }

    /**
     * Gets the value of the outGrpAccountsOutGrmAccMonitoringUnitUnitName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpAccountsOutGrmAccMonitoringUnitUnitName() {
        return outGrpAccountsOutGrmAccMonitoringUnitUnitName;
    }

    /**
     * Sets the value of the outGrpAccountsOutGrmAccMonitoringUnitUnitName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpAccountsOutGrmAccMonitoringUnitUnitName(String value) {
        this.outGrpAccountsOutGrmAccMonitoringUnitUnitName = value;
    }

    /**
     * Gets the value of the outGrpAccountsOutGrmAccMovementCurrencyIdCurrency property.
     * 
     */
    public int getOutGrpAccountsOutGrmAccMovementCurrencyIdCurrency() {
        return outGrpAccountsOutGrmAccMovementCurrencyIdCurrency;
    }

    /**
     * Sets the value of the outGrpAccountsOutGrmAccMovementCurrencyIdCurrency property.
     * 
     */
    public void setOutGrpAccountsOutGrmAccMovementCurrencyIdCurrency(int value) {
        this.outGrpAccountsOutGrmAccMovementCurrencyIdCurrency = value;
    }

    /**
     * Gets the value of the outGrpAccountsOutGrmAccMovementCurrencyShortDescr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpAccountsOutGrmAccMovementCurrencyShortDescr() {
        return outGrpAccountsOutGrmAccMovementCurrencyShortDescr;
    }

    /**
     * Sets the value of the outGrpAccountsOutGrmAccMovementCurrencyShortDescr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpAccountsOutGrmAccMovementCurrencyShortDescr(String value) {
        this.outGrpAccountsOutGrmAccMovementCurrencyShortDescr = value;
    }

    /**
     * Gets the value of the outGrpAccountsOutGrmAccNameListSetDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpAccountsOutGrmAccNameListSetDescription() {
        return outGrpAccountsOutGrmAccNameListSetDescription;
    }

    /**
     * Sets the value of the outGrpAccountsOutGrmAccNameListSetDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpAccountsOutGrmAccNameListSetDescription(String value) {
        this.outGrpAccountsOutGrmAccNameListSetDescription = value;
    }

    /**
     * Gets the value of the outGrpAccountsOutGrmAccProductDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpAccountsOutGrmAccProductDescription() {
        return outGrpAccountsOutGrmAccProductDescription;
    }

    /**
     * Sets the value of the outGrpAccountsOutGrmAccProductDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpAccountsOutGrmAccProductDescription(String value) {
        this.outGrpAccountsOutGrmAccProductDescription = value;
    }

    /**
     * Gets the value of the outGrpAccountsOutGrmAccProductIdProduct property.
     * 
     */
    public int getOutGrpAccountsOutGrmAccProductIdProduct() {
        return outGrpAccountsOutGrmAccProductIdProduct;
    }

    /**
     * Sets the value of the outGrpAccountsOutGrmAccProductIdProduct property.
     * 
     */
    public void setOutGrpAccountsOutGrmAccProductIdProduct(int value) {
        this.outGrpAccountsOutGrmAccProductIdProduct = value;
    }

    /**
     * Gets the value of the outGrpAccountsOutGrmAccProfitsAccountAccountCd property.
     * 
     */
    public short getOutGrpAccountsOutGrmAccProfitsAccountAccountCd() {
        return outGrpAccountsOutGrmAccProfitsAccountAccountCd;
    }

    /**
     * Sets the value of the outGrpAccountsOutGrmAccProfitsAccountAccountCd property.
     * 
     */
    public void setOutGrpAccountsOutGrmAccProfitsAccountAccountCd(short value) {
        this.outGrpAccountsOutGrmAccProfitsAccountAccountCd = value;
    }

    /**
     * Gets the value of the outGrpAccountsOutGrmAccProfitsAccountAccountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpAccountsOutGrmAccProfitsAccountAccountNumber() {
        return outGrpAccountsOutGrmAccProfitsAccountAccountNumber;
    }

    /**
     * Sets the value of the outGrpAccountsOutGrmAccProfitsAccountAccountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpAccountsOutGrmAccProfitsAccountAccountNumber(String value) {
        this.outGrpAccountsOutGrmAccProfitsAccountAccountNumber = value;
    }

    /**
     * Gets the value of the outGrpAccountsOutGrmAccProfitsAccountPrftSystem property.
     * 
     */
    public short getOutGrpAccountsOutGrmAccProfitsAccountPrftSystem() {
        return outGrpAccountsOutGrmAccProfitsAccountPrftSystem;
    }

    /**
     * Sets the value of the outGrpAccountsOutGrmAccProfitsAccountPrftSystem property.
     * 
     */
    public void setOutGrpAccountsOutGrmAccProfitsAccountPrftSystem(short value) {
        this.outGrpAccountsOutGrmAccProfitsAccountPrftSystem = value;
    }

}
