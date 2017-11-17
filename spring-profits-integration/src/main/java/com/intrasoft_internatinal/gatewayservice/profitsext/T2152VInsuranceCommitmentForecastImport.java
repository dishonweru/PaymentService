
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for T2152VInsuranceCommitmentForecastImport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="T2152VInsuranceCommitmentForecastImport">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}BaseImport">
 *       &lt;sequence>
 *         &lt;element name="InCommandIefSuppliedCommand" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCoinsuredGrp" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}ArrayOfInCoinsuredGrpItem" minOccurs="0"/>
 *         &lt;element name="InCustomerCustId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InInsuredAmountIefSuppliedNumber184" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InInterestRateIefSuppliedRate84" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InIssCommitmentExpirationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InIssCommitmentRenewalDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InIssProductProductIdProduct" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InLoadingPercentIefSuppliedNumber96" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InLoanTermIefSuppliedNumber3" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InReinstatementValueIefSuppliedNumber184" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InLoanAccountDrawdownFstDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InCurrencyIdCurrency" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InCurrencyShortDescr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCurrencyIsoCode" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "T2152VInsuranceCommitmentForecastImport", propOrder = {
    "inCommandIefSuppliedCommand",
    "inCoinsuredGrp",
    "inCustomerCustId",
    "inInsuredAmountIefSuppliedNumber184",
    "inInterestRateIefSuppliedRate84",
    "inIssCommitmentExpirationDate",
    "inIssCommitmentRenewalDate",
    "inIssProductProductIdProduct",
    "inLoadingPercentIefSuppliedNumber96",
    "inLoanTermIefSuppliedNumber3",
    "inReinstatementValueIefSuppliedNumber184",
    "inLoanAccountDrawdownFstDt",
    "inCurrencyIdCurrency",
    "inCurrencyShortDescr",
    "inCurrencyIsoCode"
})
public class T2152VInsuranceCommitmentForecastImport
    extends BaseImport
{

    @XmlElement(name = "InCommandIefSuppliedCommand")
    protected String inCommandIefSuppliedCommand;
    @XmlElement(name = "InCoinsuredGrp")
    protected ArrayOfInCoinsuredGrpItem inCoinsuredGrp;
    @XmlElement(name = "InCustomerCustId")
    protected int inCustomerCustId;
    @XmlElement(name = "InInsuredAmountIefSuppliedNumber184", required = true)
    protected BigDecimal inInsuredAmountIefSuppliedNumber184;
    @XmlElement(name = "InInterestRateIefSuppliedRate84", required = true)
    protected BigDecimal inInterestRateIefSuppliedRate84;
    @XmlElement(name = "InIssCommitmentExpirationDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inIssCommitmentExpirationDate;
    @XmlElement(name = "InIssCommitmentRenewalDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inIssCommitmentRenewalDate;
    @XmlElement(name = "InIssProductProductIdProduct")
    protected int inIssProductProductIdProduct;
    @XmlElement(name = "InLoadingPercentIefSuppliedNumber96", required = true)
    protected BigDecimal inLoadingPercentIefSuppliedNumber96;
    @XmlElement(name = "InLoanTermIefSuppliedNumber3")
    protected short inLoanTermIefSuppliedNumber3;
    @XmlElement(name = "InReinstatementValueIefSuppliedNumber184", required = true)
    protected BigDecimal inReinstatementValueIefSuppliedNumber184;
    @XmlElement(name = "InLoanAccountDrawdownFstDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inLoanAccountDrawdownFstDt;
    @XmlElement(name = "InCurrencyIdCurrency")
    protected int inCurrencyIdCurrency;
    @XmlElement(name = "InCurrencyShortDescr")
    protected String inCurrencyShortDescr;
    @XmlElement(name = "InCurrencyIsoCode")
    protected short inCurrencyIsoCode;

    /**
     * Gets the value of the inCommandIefSuppliedCommand property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCommandIefSuppliedCommand() {
        return inCommandIefSuppliedCommand;
    }

    /**
     * Sets the value of the inCommandIefSuppliedCommand property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCommandIefSuppliedCommand(String value) {
        this.inCommandIefSuppliedCommand = value;
    }

    /**
     * Gets the value of the inCoinsuredGrp property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfInCoinsuredGrpItem }
     *     
     */
    public ArrayOfInCoinsuredGrpItem getInCoinsuredGrp() {
        return inCoinsuredGrp;
    }

    /**
     * Sets the value of the inCoinsuredGrp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfInCoinsuredGrpItem }
     *     
     */
    public void setInCoinsuredGrp(ArrayOfInCoinsuredGrpItem value) {
        this.inCoinsuredGrp = value;
    }

    /**
     * Gets the value of the inCustomerCustId property.
     * 
     */
    public int getInCustomerCustId() {
        return inCustomerCustId;
    }

    /**
     * Sets the value of the inCustomerCustId property.
     * 
     */
    public void setInCustomerCustId(int value) {
        this.inCustomerCustId = value;
    }

    /**
     * Gets the value of the inInsuredAmountIefSuppliedNumber184 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInInsuredAmountIefSuppliedNumber184() {
        return inInsuredAmountIefSuppliedNumber184;
    }

    /**
     * Sets the value of the inInsuredAmountIefSuppliedNumber184 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInInsuredAmountIefSuppliedNumber184(BigDecimal value) {
        this.inInsuredAmountIefSuppliedNumber184 = value;
    }

    /**
     * Gets the value of the inInterestRateIefSuppliedRate84 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInInterestRateIefSuppliedRate84() {
        return inInterestRateIefSuppliedRate84;
    }

    /**
     * Sets the value of the inInterestRateIefSuppliedRate84 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInInterestRateIefSuppliedRate84(BigDecimal value) {
        this.inInterestRateIefSuppliedRate84 = value;
    }

    /**
     * Gets the value of the inIssCommitmentExpirationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInIssCommitmentExpirationDate() {
        return inIssCommitmentExpirationDate;
    }

    /**
     * Sets the value of the inIssCommitmentExpirationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInIssCommitmentExpirationDate(XMLGregorianCalendar value) {
        this.inIssCommitmentExpirationDate = value;
    }

    /**
     * Gets the value of the inIssCommitmentRenewalDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInIssCommitmentRenewalDate() {
        return inIssCommitmentRenewalDate;
    }

    /**
     * Sets the value of the inIssCommitmentRenewalDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInIssCommitmentRenewalDate(XMLGregorianCalendar value) {
        this.inIssCommitmentRenewalDate = value;
    }

    /**
     * Gets the value of the inIssProductProductIdProduct property.
     * 
     */
    public int getInIssProductProductIdProduct() {
        return inIssProductProductIdProduct;
    }

    /**
     * Sets the value of the inIssProductProductIdProduct property.
     * 
     */
    public void setInIssProductProductIdProduct(int value) {
        this.inIssProductProductIdProduct = value;
    }

    /**
     * Gets the value of the inLoadingPercentIefSuppliedNumber96 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInLoadingPercentIefSuppliedNumber96() {
        return inLoadingPercentIefSuppliedNumber96;
    }

    /**
     * Sets the value of the inLoadingPercentIefSuppliedNumber96 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInLoadingPercentIefSuppliedNumber96(BigDecimal value) {
        this.inLoadingPercentIefSuppliedNumber96 = value;
    }

    /**
     * Gets the value of the inLoanTermIefSuppliedNumber3 property.
     * 
     */
    public short getInLoanTermIefSuppliedNumber3() {
        return inLoanTermIefSuppliedNumber3;
    }

    /**
     * Sets the value of the inLoanTermIefSuppliedNumber3 property.
     * 
     */
    public void setInLoanTermIefSuppliedNumber3(short value) {
        this.inLoanTermIefSuppliedNumber3 = value;
    }

    /**
     * Gets the value of the inReinstatementValueIefSuppliedNumber184 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInReinstatementValueIefSuppliedNumber184() {
        return inReinstatementValueIefSuppliedNumber184;
    }

    /**
     * Sets the value of the inReinstatementValueIefSuppliedNumber184 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInReinstatementValueIefSuppliedNumber184(BigDecimal value) {
        this.inReinstatementValueIefSuppliedNumber184 = value;
    }

    /**
     * Gets the value of the inLoanAccountDrawdownFstDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInLoanAccountDrawdownFstDt() {
        return inLoanAccountDrawdownFstDt;
    }

    /**
     * Sets the value of the inLoanAccountDrawdownFstDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInLoanAccountDrawdownFstDt(XMLGregorianCalendar value) {
        this.inLoanAccountDrawdownFstDt = value;
    }

    /**
     * Gets the value of the inCurrencyIdCurrency property.
     * 
     */
    public int getInCurrencyIdCurrency() {
        return inCurrencyIdCurrency;
    }

    /**
     * Sets the value of the inCurrencyIdCurrency property.
     * 
     */
    public void setInCurrencyIdCurrency(int value) {
        this.inCurrencyIdCurrency = value;
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
     * Gets the value of the inCurrencyIsoCode property.
     * 
     */
    public short getInCurrencyIsoCode() {
        return inCurrencyIsoCode;
    }

    /**
     * Sets the value of the inCurrencyIsoCode property.
     * 
     */
    public void setInCurrencyIsoCode(short value) {
        this.inCurrencyIsoCode = value;
    }

}
