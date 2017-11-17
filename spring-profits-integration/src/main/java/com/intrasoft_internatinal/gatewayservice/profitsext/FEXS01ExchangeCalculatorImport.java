
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FEXS01_ExchangeCalculatorImport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FEXS01_ExchangeCalculatorImport">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}BaseImport">
 *       &lt;sequence>
 *         &lt;element name="Command" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InTrxAmountIefSuppliedPayableAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InSEExhangeNNotesRateTableExchNotesFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InBEExhangeNNotesRateTableExchNotesFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InBuy1Sell0IefSuppliedFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InSoldCurrencyIdCurrency" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InBoughtCurrencyIdCurrency" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InPostIefSuppliedFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InProxyTrxRecoveryReferenceNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InProxyTrxRecoveryIdChannel" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InTerminalTerminalNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InUnitRateCategoryGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FEXS01_ExchangeCalculatorImport", propOrder = {
    "command",
    "inTrxAmountIefSuppliedPayableAmount",
    "inSEExhangeNNotesRateTableExchNotesFlag",
    "inBEExhangeNNotesRateTableExchNotesFlag",
    "inBuy1Sell0IefSuppliedFlag",
    "inSoldCurrencyIdCurrency",
    "inBoughtCurrencyIdCurrency",
    "inPostIefSuppliedFlag",
    "inProxyTrxRecoveryReferenceNumber",
    "inProxyTrxRecoveryIdChannel",
    "inTerminalTerminalNumber",
    "inUnitRateCategoryGenericDetailSerialNum"
})
public class FEXS01ExchangeCalculatorImport
    extends BaseImport
{

    @XmlElement(name = "Command")
    protected String command;
    @XmlElement(name = "InTrxAmountIefSuppliedPayableAmount", required = true)
    protected BigDecimal inTrxAmountIefSuppliedPayableAmount;
    @XmlElement(name = "InSEExhangeNNotesRateTableExchNotesFlag")
    protected String inSEExhangeNNotesRateTableExchNotesFlag;
    @XmlElement(name = "InBEExhangeNNotesRateTableExchNotesFlag")
    protected String inBEExhangeNNotesRateTableExchNotesFlag;
    @XmlElement(name = "InBuy1Sell0IefSuppliedFlag")
    protected String inBuy1Sell0IefSuppliedFlag;
    @XmlElement(name = "InSoldCurrencyIdCurrency")
    protected int inSoldCurrencyIdCurrency;
    @XmlElement(name = "InBoughtCurrencyIdCurrency")
    protected int inBoughtCurrencyIdCurrency;
    @XmlElement(name = "InPostIefSuppliedFlag")
    protected String inPostIefSuppliedFlag;
    @XmlElement(name = "InProxyTrxRecoveryReferenceNumber")
    protected String inProxyTrxRecoveryReferenceNumber;
    @XmlElement(name = "InProxyTrxRecoveryIdChannel")
    protected int inProxyTrxRecoveryIdChannel;
    @XmlElement(name = "InTerminalTerminalNumber")
    protected String inTerminalTerminalNumber;
    @XmlElement(name = "InUnitRateCategoryGenericDetailSerialNum")
    protected int inUnitRateCategoryGenericDetailSerialNum;

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
     * Gets the value of the inTrxAmountIefSuppliedPayableAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInTrxAmountIefSuppliedPayableAmount() {
        return inTrxAmountIefSuppliedPayableAmount;
    }

    /**
     * Sets the value of the inTrxAmountIefSuppliedPayableAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInTrxAmountIefSuppliedPayableAmount(BigDecimal value) {
        this.inTrxAmountIefSuppliedPayableAmount = value;
    }

    /**
     * Gets the value of the inSEExhangeNNotesRateTableExchNotesFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInSEExhangeNNotesRateTableExchNotesFlag() {
        return inSEExhangeNNotesRateTableExchNotesFlag;
    }

    /**
     * Sets the value of the inSEExhangeNNotesRateTableExchNotesFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInSEExhangeNNotesRateTableExchNotesFlag(String value) {
        this.inSEExhangeNNotesRateTableExchNotesFlag = value;
    }

    /**
     * Gets the value of the inBEExhangeNNotesRateTableExchNotesFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInBEExhangeNNotesRateTableExchNotesFlag() {
        return inBEExhangeNNotesRateTableExchNotesFlag;
    }

    /**
     * Sets the value of the inBEExhangeNNotesRateTableExchNotesFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInBEExhangeNNotesRateTableExchNotesFlag(String value) {
        this.inBEExhangeNNotesRateTableExchNotesFlag = value;
    }

    /**
     * Gets the value of the inBuy1Sell0IefSuppliedFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInBuy1Sell0IefSuppliedFlag() {
        return inBuy1Sell0IefSuppliedFlag;
    }

    /**
     * Sets the value of the inBuy1Sell0IefSuppliedFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInBuy1Sell0IefSuppliedFlag(String value) {
        this.inBuy1Sell0IefSuppliedFlag = value;
    }

    /**
     * Gets the value of the inSoldCurrencyIdCurrency property.
     * 
     */
    public int getInSoldCurrencyIdCurrency() {
        return inSoldCurrencyIdCurrency;
    }

    /**
     * Sets the value of the inSoldCurrencyIdCurrency property.
     * 
     */
    public void setInSoldCurrencyIdCurrency(int value) {
        this.inSoldCurrencyIdCurrency = value;
    }

    /**
     * Gets the value of the inBoughtCurrencyIdCurrency property.
     * 
     */
    public int getInBoughtCurrencyIdCurrency() {
        return inBoughtCurrencyIdCurrency;
    }

    /**
     * Sets the value of the inBoughtCurrencyIdCurrency property.
     * 
     */
    public void setInBoughtCurrencyIdCurrency(int value) {
        this.inBoughtCurrencyIdCurrency = value;
    }

    /**
     * Gets the value of the inPostIefSuppliedFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInPostIefSuppliedFlag() {
        return inPostIefSuppliedFlag;
    }

    /**
     * Sets the value of the inPostIefSuppliedFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInPostIefSuppliedFlag(String value) {
        this.inPostIefSuppliedFlag = value;
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

    /**
     * Gets the value of the inProxyTrxRecoveryIdChannel property.
     * 
     */
    public int getInProxyTrxRecoveryIdChannel() {
        return inProxyTrxRecoveryIdChannel;
    }

    /**
     * Sets the value of the inProxyTrxRecoveryIdChannel property.
     * 
     */
    public void setInProxyTrxRecoveryIdChannel(int value) {
        this.inProxyTrxRecoveryIdChannel = value;
    }

    /**
     * Gets the value of the inTerminalTerminalNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInTerminalTerminalNumber() {
        return inTerminalTerminalNumber;
    }

    /**
     * Sets the value of the inTerminalTerminalNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInTerminalTerminalNumber(String value) {
        this.inTerminalTerminalNumber = value;
    }

    /**
     * Gets the value of the inUnitRateCategoryGenericDetailSerialNum property.
     * 
     */
    public int getInUnitRateCategoryGenericDetailSerialNum() {
        return inUnitRateCategoryGenericDetailSerialNum;
    }

    /**
     * Sets the value of the inUnitRateCategoryGenericDetailSerialNum property.
     * 
     */
    public void setInUnitRateCategoryGenericDetailSerialNum(int value) {
        this.inUnitRateCategoryGenericDetailSerialNum = value;
    }

}
