
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DealerSpecialRatesMaintenanceImport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DealerSpecialRatesMaintenanceImport">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}BaseImport">
 *       &lt;sequence>
 *         &lt;element name="Command" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InParametersInTerminalTerminalNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InAuthorGrantedIefSuppliedFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCommIefSuppliedChar6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCurrencyShortDescr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InDealerSpecialRateAnaggelia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InDealerSpecialRateCurrencyRate" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InDealerSpecialRateDealerRefNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InDealerSpecialRateEntryComments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InDealerSpecialRatePenaltyAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InDealerSpecialRateSourceAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InDealerSpecialRateTargetAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InDealerUsrCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InIefSuppliedFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InRequestUnitCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InServiceTrxjustFxType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InSourceCurrencyIdCurrency" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InSourceCurrencyShortDescr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InTargetCurrencyIdCurrency" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InTargetCurrencyShortDescr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DealerSpecialRatesMaintenanceImport", propOrder = {
    "command",
    "inParametersInTerminalTerminalNumber",
    "inAuthorGrantedIefSuppliedFlag",
    "inCommIefSuppliedChar6",
    "inCurrencyShortDescr",
    "inDealerSpecialRateAnaggelia",
    "inDealerSpecialRateCurrencyRate",
    "inDealerSpecialRateDealerRefNo",
    "inDealerSpecialRateEntryComments",
    "inDealerSpecialRatePenaltyAmount",
    "inDealerSpecialRateSourceAmount",
    "inDealerSpecialRateTargetAmount",
    "inDealerUsrCode",
    "inIefSuppliedFlag",
    "inRequestUnitCode",
    "inServiceTrxjustFxType",
    "inSourceCurrencyIdCurrency",
    "inSourceCurrencyShortDescr",
    "inTargetCurrencyIdCurrency",
    "inTargetCurrencyShortDescr"
})
public class DealerSpecialRatesMaintenanceImport
    extends BaseImport
{

    @XmlElement(name = "Command")
    protected String command;
    @XmlElement(name = "InParametersInTerminalTerminalNumber")
    protected String inParametersInTerminalTerminalNumber;
    @XmlElement(name = "InAuthorGrantedIefSuppliedFlag")
    protected String inAuthorGrantedIefSuppliedFlag;
    @XmlElement(name = "InCommIefSuppliedChar6")
    protected String inCommIefSuppliedChar6;
    @XmlElement(name = "InCurrencyShortDescr")
    protected String inCurrencyShortDescr;
    @XmlElement(name = "InDealerSpecialRateAnaggelia")
    protected String inDealerSpecialRateAnaggelia;
    @XmlElement(name = "InDealerSpecialRateCurrencyRate", required = true)
    protected BigDecimal inDealerSpecialRateCurrencyRate;
    @XmlElement(name = "InDealerSpecialRateDealerRefNo")
    protected String inDealerSpecialRateDealerRefNo;
    @XmlElement(name = "InDealerSpecialRateEntryComments")
    protected String inDealerSpecialRateEntryComments;
    @XmlElement(name = "InDealerSpecialRatePenaltyAmount", required = true)
    protected BigDecimal inDealerSpecialRatePenaltyAmount;
    @XmlElement(name = "InDealerSpecialRateSourceAmount", required = true)
    protected BigDecimal inDealerSpecialRateSourceAmount;
    @XmlElement(name = "InDealerSpecialRateTargetAmount", required = true)
    protected BigDecimal inDealerSpecialRateTargetAmount;
    @XmlElement(name = "InDealerUsrCode")
    protected String inDealerUsrCode;
    @XmlElement(name = "InIefSuppliedFlag")
    protected String inIefSuppliedFlag;
    @XmlElement(name = "InRequestUnitCode")
    protected int inRequestUnitCode;
    @XmlElement(name = "InServiceTrxjustFxType")
    protected String inServiceTrxjustFxType;
    @XmlElement(name = "InSourceCurrencyIdCurrency")
    protected int inSourceCurrencyIdCurrency;
    @XmlElement(name = "InSourceCurrencyShortDescr")
    protected String inSourceCurrencyShortDescr;
    @XmlElement(name = "InTargetCurrencyIdCurrency")
    protected int inTargetCurrencyIdCurrency;
    @XmlElement(name = "InTargetCurrencyShortDescr")
    protected String inTargetCurrencyShortDescr;

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
     * Gets the value of the inParametersInTerminalTerminalNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInParametersInTerminalTerminalNumber() {
        return inParametersInTerminalTerminalNumber;
    }

    /**
     * Sets the value of the inParametersInTerminalTerminalNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInParametersInTerminalTerminalNumber(String value) {
        this.inParametersInTerminalTerminalNumber = value;
    }

    /**
     * Gets the value of the inAuthorGrantedIefSuppliedFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInAuthorGrantedIefSuppliedFlag() {
        return inAuthorGrantedIefSuppliedFlag;
    }

    /**
     * Sets the value of the inAuthorGrantedIefSuppliedFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInAuthorGrantedIefSuppliedFlag(String value) {
        this.inAuthorGrantedIefSuppliedFlag = value;
    }

    /**
     * Gets the value of the inCommIefSuppliedChar6 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCommIefSuppliedChar6() {
        return inCommIefSuppliedChar6;
    }

    /**
     * Sets the value of the inCommIefSuppliedChar6 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCommIefSuppliedChar6(String value) {
        this.inCommIefSuppliedChar6 = value;
    }

    /**
     * Gets the value of the inCurrencyShortDescr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCurrencyShortDescr() {
        return inCurrencyShortDescr;
    }

    /**
     * Sets the value of the inCurrencyShortDescr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCurrencyShortDescr(String value) {
        this.inCurrencyShortDescr = value;
    }

    /**
     * Gets the value of the inDealerSpecialRateAnaggelia property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInDealerSpecialRateAnaggelia() {
        return inDealerSpecialRateAnaggelia;
    }

    /**
     * Sets the value of the inDealerSpecialRateAnaggelia property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInDealerSpecialRateAnaggelia(String value) {
        this.inDealerSpecialRateAnaggelia = value;
    }

    /**
     * Gets the value of the inDealerSpecialRateCurrencyRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInDealerSpecialRateCurrencyRate() {
        return inDealerSpecialRateCurrencyRate;
    }

    /**
     * Sets the value of the inDealerSpecialRateCurrencyRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInDealerSpecialRateCurrencyRate(BigDecimal value) {
        this.inDealerSpecialRateCurrencyRate = value;
    }

    /**
     * Gets the value of the inDealerSpecialRateDealerRefNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInDealerSpecialRateDealerRefNo() {
        return inDealerSpecialRateDealerRefNo;
    }

    /**
     * Sets the value of the inDealerSpecialRateDealerRefNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInDealerSpecialRateDealerRefNo(String value) {
        this.inDealerSpecialRateDealerRefNo = value;
    }

    /**
     * Gets the value of the inDealerSpecialRateEntryComments property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInDealerSpecialRateEntryComments() {
        return inDealerSpecialRateEntryComments;
    }

    /**
     * Sets the value of the inDealerSpecialRateEntryComments property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInDealerSpecialRateEntryComments(String value) {
        this.inDealerSpecialRateEntryComments = value;
    }

    /**
     * Gets the value of the inDealerSpecialRatePenaltyAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInDealerSpecialRatePenaltyAmount() {
        return inDealerSpecialRatePenaltyAmount;
    }

    /**
     * Sets the value of the inDealerSpecialRatePenaltyAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInDealerSpecialRatePenaltyAmount(BigDecimal value) {
        this.inDealerSpecialRatePenaltyAmount = value;
    }

    /**
     * Gets the value of the inDealerSpecialRateSourceAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInDealerSpecialRateSourceAmount() {
        return inDealerSpecialRateSourceAmount;
    }

    /**
     * Sets the value of the inDealerSpecialRateSourceAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInDealerSpecialRateSourceAmount(BigDecimal value) {
        this.inDealerSpecialRateSourceAmount = value;
    }

    /**
     * Gets the value of the inDealerSpecialRateTargetAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInDealerSpecialRateTargetAmount() {
        return inDealerSpecialRateTargetAmount;
    }

    /**
     * Sets the value of the inDealerSpecialRateTargetAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInDealerSpecialRateTargetAmount(BigDecimal value) {
        this.inDealerSpecialRateTargetAmount = value;
    }

    /**
     * Gets the value of the inDealerUsrCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInDealerUsrCode() {
        return inDealerUsrCode;
    }

    /**
     * Sets the value of the inDealerUsrCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInDealerUsrCode(String value) {
        this.inDealerUsrCode = value;
    }

    /**
     * Gets the value of the inIefSuppliedFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInIefSuppliedFlag() {
        return inIefSuppliedFlag;
    }

    /**
     * Sets the value of the inIefSuppliedFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInIefSuppliedFlag(String value) {
        this.inIefSuppliedFlag = value;
    }

    /**
     * Gets the value of the inRequestUnitCode property.
     * 
     */
    public int getInRequestUnitCode() {
        return inRequestUnitCode;
    }

    /**
     * Sets the value of the inRequestUnitCode property.
     * 
     */
    public void setInRequestUnitCode(int value) {
        this.inRequestUnitCode = value;
    }

    /**
     * Gets the value of the inServiceTrxjustFxType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInServiceTrxjustFxType() {
        return inServiceTrxjustFxType;
    }

    /**
     * Sets the value of the inServiceTrxjustFxType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInServiceTrxjustFxType(String value) {
        this.inServiceTrxjustFxType = value;
    }

    /**
     * Gets the value of the inSourceCurrencyIdCurrency property.
     * 
     */
    public int getInSourceCurrencyIdCurrency() {
        return inSourceCurrencyIdCurrency;
    }

    /**
     * Sets the value of the inSourceCurrencyIdCurrency property.
     * 
     */
    public void setInSourceCurrencyIdCurrency(int value) {
        this.inSourceCurrencyIdCurrency = value;
    }

    /**
     * Gets the value of the inSourceCurrencyShortDescr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInSourceCurrencyShortDescr() {
        return inSourceCurrencyShortDescr;
    }

    /**
     * Sets the value of the inSourceCurrencyShortDescr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInSourceCurrencyShortDescr(String value) {
        this.inSourceCurrencyShortDescr = value;
    }

    /**
     * Gets the value of the inTargetCurrencyIdCurrency property.
     * 
     */
    public int getInTargetCurrencyIdCurrency() {
        return inTargetCurrencyIdCurrency;
    }

    /**
     * Sets the value of the inTargetCurrencyIdCurrency property.
     * 
     */
    public void setInTargetCurrencyIdCurrency(int value) {
        this.inTargetCurrencyIdCurrency = value;
    }

    /**
     * Gets the value of the inTargetCurrencyShortDescr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInTargetCurrencyShortDescr() {
        return inTargetCurrencyShortDescr;
    }

    /**
     * Sets the value of the inTargetCurrencyShortDescr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInTargetCurrencyShortDescr(String value) {
        this.inTargetCurrencyShortDescr = value;
    }

}
