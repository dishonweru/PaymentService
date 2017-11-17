
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for CustomerPositionAndDrawdownImport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomerPositionAndDrawdownImport">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}BaseImport">
 *       &lt;sequence>
 *         &lt;element name="InApplicationCommentsCustomerApplicationInsertCmnts" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InApplicationCommentsCustomerApplicationRequestForecast" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InApplicationTypeIefSuppliedFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCardNumberCharSuppliedChar16" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCommandIefSuppliedCommand" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InConfirmCustListSetDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InConfirmCustomerCDigit" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InConfirmCustomerCustId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InConfirmCustomerCustType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InContinueCustomerCustId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InContinueCustomerApplicationInternalSn" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="InContinueSearchCustPositionEntrySn" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InContinueSearchCustPositionTmstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InCustomerCDigit" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InCustomerCustId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InCustomerEntryStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCustomerFirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InIncludeAccsAsCobenefIefSuppliedFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InIncludeAccsOfGrpCompanyIefSuppliedFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InReqAmntCustomerApplicationRequestAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InRequestIefSuppliedAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InSelectedCustomerCustId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InSelectedLimitProductIdProduct" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InSelectedLoanProfitsAccountAccountCd" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InSelectedLoanProfitsAccountAccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InSelectedLoanProfitsAccountCDigit" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InSelectedLoanProfitsAccountCustId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InSelectedLoanProfitsAccountMonotoringUnit" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InSelectedLoanProfitsAccountMovementCurrency" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InSelectedLoanProfitsAccountPrftSystem" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InSelectedProfitsAccountAccountCd" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InSelectedProfitsAccountAccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InSelectedProfitsAccountCDigit" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InSelectedProfitsAccountCustId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InSelectedProfitsAccountMonotoringUnit" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InSelectedProfitsAccountMovementCurrency" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InSelectedProfitsAccountPrftSystem" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InTrxPrftTransactionIdTransact" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InTrxTerminalTerminalNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InContinueCustomerApplicationApplicationId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InContinueCustomerApplicationCustId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InContinueCustomerApplicationUnitCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InGrpApplicDetails" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}ArrayOfInGrpApplicDetailsItem" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerPositionAndDrawdownImport", propOrder = {
    "inApplicationCommentsCustomerApplicationInsertCmnts",
    "inApplicationCommentsCustomerApplicationRequestForecast",
    "inApplicationTypeIefSuppliedFlag",
    "inCardNumberCharSuppliedChar16",
    "inCommandIefSuppliedCommand",
    "inConfirmCustListSetDescription",
    "inConfirmCustomerCDigit",
    "inConfirmCustomerCustId",
    "inConfirmCustomerCustType",
    "inContinueCustomerCustId",
    "inContinueCustomerApplicationInternalSn",
    "inContinueSearchCustPositionEntrySn",
    "inContinueSearchCustPositionTmstamp",
    "inCustomerCDigit",
    "inCustomerCustId",
    "inCustomerEntryStatus",
    "inCustomerFirstName",
    "inIncludeAccsAsCobenefIefSuppliedFlag",
    "inIncludeAccsOfGrpCompanyIefSuppliedFlag",
    "inReqAmntCustomerApplicationRequestAmn",
    "inRequestIefSuppliedAmount",
    "inSelectedCustomerCustId",
    "inSelectedLimitProductIdProduct",
    "inSelectedLoanProfitsAccountAccountCd",
    "inSelectedLoanProfitsAccountAccountNumber",
    "inSelectedLoanProfitsAccountCDigit",
    "inSelectedLoanProfitsAccountCustId",
    "inSelectedLoanProfitsAccountMonotoringUnit",
    "inSelectedLoanProfitsAccountMovementCurrency",
    "inSelectedLoanProfitsAccountPrftSystem",
    "inSelectedProfitsAccountAccountCd",
    "inSelectedProfitsAccountAccountNumber",
    "inSelectedProfitsAccountCDigit",
    "inSelectedProfitsAccountCustId",
    "inSelectedProfitsAccountMonotoringUnit",
    "inSelectedProfitsAccountMovementCurrency",
    "inSelectedProfitsAccountPrftSystem",
    "inTrxPrftTransactionIdTransact",
    "inTrxTerminalTerminalNumber",
    "inContinueCustomerApplicationApplicationId",
    "inContinueCustomerApplicationCustId",
    "inContinueCustomerApplicationUnitCode",
    "inGrpApplicDetails"
})
public class CustomerPositionAndDrawdownImport
    extends BaseImport
{

    @XmlElement(name = "InApplicationCommentsCustomerApplicationInsertCmnts")
    protected String inApplicationCommentsCustomerApplicationInsertCmnts;
    @XmlElement(name = "InApplicationCommentsCustomerApplicationRequestForecast")
    protected String inApplicationCommentsCustomerApplicationRequestForecast;
    @XmlElement(name = "InApplicationTypeIefSuppliedFlag")
    protected String inApplicationTypeIefSuppliedFlag;
    @XmlElement(name = "InCardNumberCharSuppliedChar16")
    protected String inCardNumberCharSuppliedChar16;
    @XmlElement(name = "InCommandIefSuppliedCommand")
    protected String inCommandIefSuppliedCommand;
    @XmlElement(name = "InConfirmCustListSetDescription")
    protected String inConfirmCustListSetDescription;
    @XmlElement(name = "InConfirmCustomerCDigit")
    protected short inConfirmCustomerCDigit;
    @XmlElement(name = "InConfirmCustomerCustId")
    protected int inConfirmCustomerCustId;
    @XmlElement(name = "InConfirmCustomerCustType")
    protected String inConfirmCustomerCustType;
    @XmlElement(name = "InContinueCustomerCustId")
    protected int inContinueCustomerCustId;
    @XmlElement(name = "InContinueCustomerApplicationInternalSn")
    protected double inContinueCustomerApplicationInternalSn;
    @XmlElement(name = "InContinueSearchCustPositionEntrySn")
    protected int inContinueSearchCustPositionEntrySn;
    @XmlElement(name = "InContinueSearchCustPositionTmstamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inContinueSearchCustPositionTmstamp;
    @XmlElement(name = "InCustomerCDigit")
    protected short inCustomerCDigit;
    @XmlElement(name = "InCustomerCustId")
    protected int inCustomerCustId;
    @XmlElement(name = "InCustomerEntryStatus")
    protected String inCustomerEntryStatus;
    @XmlElement(name = "InCustomerFirstName")
    protected String inCustomerFirstName;
    @XmlElement(name = "InIncludeAccsAsCobenefIefSuppliedFlag")
    protected String inIncludeAccsAsCobenefIefSuppliedFlag;
    @XmlElement(name = "InIncludeAccsOfGrpCompanyIefSuppliedFlag")
    protected String inIncludeAccsOfGrpCompanyIefSuppliedFlag;
    @XmlElement(name = "InReqAmntCustomerApplicationRequestAmn", required = true)
    protected BigDecimal inReqAmntCustomerApplicationRequestAmn;
    @XmlElement(name = "InRequestIefSuppliedAmount", required = true)
    protected BigDecimal inRequestIefSuppliedAmount;
    @XmlElement(name = "InSelectedCustomerCustId")
    protected int inSelectedCustomerCustId;
    @XmlElement(name = "InSelectedLimitProductIdProduct")
    protected int inSelectedLimitProductIdProduct;
    @XmlElement(name = "InSelectedLoanProfitsAccountAccountCd")
    protected short inSelectedLoanProfitsAccountAccountCd;
    @XmlElement(name = "InSelectedLoanProfitsAccountAccountNumber")
    protected String inSelectedLoanProfitsAccountAccountNumber;
    @XmlElement(name = "InSelectedLoanProfitsAccountCDigit")
    protected short inSelectedLoanProfitsAccountCDigit;
    @XmlElement(name = "InSelectedLoanProfitsAccountCustId")
    protected int inSelectedLoanProfitsAccountCustId;
    @XmlElement(name = "InSelectedLoanProfitsAccountMonotoringUnit")
    protected int inSelectedLoanProfitsAccountMonotoringUnit;
    @XmlElement(name = "InSelectedLoanProfitsAccountMovementCurrency")
    protected int inSelectedLoanProfitsAccountMovementCurrency;
    @XmlElement(name = "InSelectedLoanProfitsAccountPrftSystem")
    protected short inSelectedLoanProfitsAccountPrftSystem;
    @XmlElement(name = "InSelectedProfitsAccountAccountCd")
    protected short inSelectedProfitsAccountAccountCd;
    @XmlElement(name = "InSelectedProfitsAccountAccountNumber")
    protected String inSelectedProfitsAccountAccountNumber;
    @XmlElement(name = "InSelectedProfitsAccountCDigit")
    protected short inSelectedProfitsAccountCDigit;
    @XmlElement(name = "InSelectedProfitsAccountCustId")
    protected int inSelectedProfitsAccountCustId;
    @XmlElement(name = "InSelectedProfitsAccountMonotoringUnit")
    protected int inSelectedProfitsAccountMonotoringUnit;
    @XmlElement(name = "InSelectedProfitsAccountMovementCurrency")
    protected int inSelectedProfitsAccountMovementCurrency;
    @XmlElement(name = "InSelectedProfitsAccountPrftSystem")
    protected short inSelectedProfitsAccountPrftSystem;
    @XmlElement(name = "InTrxPrftTransactionIdTransact")
    protected int inTrxPrftTransactionIdTransact;
    @XmlElement(name = "InTrxTerminalTerminalNumber")
    protected String inTrxTerminalTerminalNumber;
    @XmlElement(name = "InContinueCustomerApplicationApplicationId")
    protected String inContinueCustomerApplicationApplicationId;
    @XmlElement(name = "InContinueCustomerApplicationCustId")
    protected int inContinueCustomerApplicationCustId;
    @XmlElement(name = "InContinueCustomerApplicationUnitCode")
    protected int inContinueCustomerApplicationUnitCode;
    @XmlElement(name = "InGrpApplicDetails")
    protected ArrayOfInGrpApplicDetailsItem inGrpApplicDetails;

    /**
     * Gets the value of the inApplicationCommentsCustomerApplicationInsertCmnts property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInApplicationCommentsCustomerApplicationInsertCmnts() {
        return inApplicationCommentsCustomerApplicationInsertCmnts;
    }

    /**
     * Sets the value of the inApplicationCommentsCustomerApplicationInsertCmnts property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInApplicationCommentsCustomerApplicationInsertCmnts(String value) {
        this.inApplicationCommentsCustomerApplicationInsertCmnts = value;
    }

    /**
     * Gets the value of the inApplicationCommentsCustomerApplicationRequestForecast property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInApplicationCommentsCustomerApplicationRequestForecast() {
        return inApplicationCommentsCustomerApplicationRequestForecast;
    }

    /**
     * Sets the value of the inApplicationCommentsCustomerApplicationRequestForecast property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInApplicationCommentsCustomerApplicationRequestForecast(String value) {
        this.inApplicationCommentsCustomerApplicationRequestForecast = value;
    }

    /**
     * Gets the value of the inApplicationTypeIefSuppliedFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInApplicationTypeIefSuppliedFlag() {
        return inApplicationTypeIefSuppliedFlag;
    }

    /**
     * Sets the value of the inApplicationTypeIefSuppliedFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInApplicationTypeIefSuppliedFlag(String value) {
        this.inApplicationTypeIefSuppliedFlag = value;
    }

    /**
     * Gets the value of the inCardNumberCharSuppliedChar16 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCardNumberCharSuppliedChar16() {
        return inCardNumberCharSuppliedChar16;
    }

    /**
     * Sets the value of the inCardNumberCharSuppliedChar16 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCardNumberCharSuppliedChar16(String value) {
        this.inCardNumberCharSuppliedChar16 = value;
    }

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
     * Gets the value of the inConfirmCustListSetDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInConfirmCustListSetDescription() {
        return inConfirmCustListSetDescription;
    }

    /**
     * Sets the value of the inConfirmCustListSetDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInConfirmCustListSetDescription(String value) {
        this.inConfirmCustListSetDescription = value;
    }

    /**
     * Gets the value of the inConfirmCustomerCDigit property.
     * 
     */
    public short getInConfirmCustomerCDigit() {
        return inConfirmCustomerCDigit;
    }

    /**
     * Sets the value of the inConfirmCustomerCDigit property.
     * 
     */
    public void setInConfirmCustomerCDigit(short value) {
        this.inConfirmCustomerCDigit = value;
    }

    /**
     * Gets the value of the inConfirmCustomerCustId property.
     * 
     */
    public int getInConfirmCustomerCustId() {
        return inConfirmCustomerCustId;
    }

    /**
     * Sets the value of the inConfirmCustomerCustId property.
     * 
     */
    public void setInConfirmCustomerCustId(int value) {
        this.inConfirmCustomerCustId = value;
    }

    /**
     * Gets the value of the inConfirmCustomerCustType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInConfirmCustomerCustType() {
        return inConfirmCustomerCustType;
    }

    /**
     * Sets the value of the inConfirmCustomerCustType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInConfirmCustomerCustType(String value) {
        this.inConfirmCustomerCustType = value;
    }

    /**
     * Gets the value of the inContinueCustomerCustId property.
     * 
     */
    public int getInContinueCustomerCustId() {
        return inContinueCustomerCustId;
    }

    /**
     * Sets the value of the inContinueCustomerCustId property.
     * 
     */
    public void setInContinueCustomerCustId(int value) {
        this.inContinueCustomerCustId = value;
    }

    /**
     * Gets the value of the inContinueCustomerApplicationInternalSn property.
     * 
     */
    public double getInContinueCustomerApplicationInternalSn() {
        return inContinueCustomerApplicationInternalSn;
    }

    /**
     * Sets the value of the inContinueCustomerApplicationInternalSn property.
     * 
     */
    public void setInContinueCustomerApplicationInternalSn(double value) {
        this.inContinueCustomerApplicationInternalSn = value;
    }

    /**
     * Gets the value of the inContinueSearchCustPositionEntrySn property.
     * 
     */
    public int getInContinueSearchCustPositionEntrySn() {
        return inContinueSearchCustPositionEntrySn;
    }

    /**
     * Sets the value of the inContinueSearchCustPositionEntrySn property.
     * 
     */
    public void setInContinueSearchCustPositionEntrySn(int value) {
        this.inContinueSearchCustPositionEntrySn = value;
    }

    /**
     * Gets the value of the inContinueSearchCustPositionTmstamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInContinueSearchCustPositionTmstamp() {
        return inContinueSearchCustPositionTmstamp;
    }

    /**
     * Sets the value of the inContinueSearchCustPositionTmstamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInContinueSearchCustPositionTmstamp(XMLGregorianCalendar value) {
        this.inContinueSearchCustPositionTmstamp = value;
    }

    /**
     * Gets the value of the inCustomerCDigit property.
     * 
     */
    public short getInCustomerCDigit() {
        return inCustomerCDigit;
    }

    /**
     * Sets the value of the inCustomerCDigit property.
     * 
     */
    public void setInCustomerCDigit(short value) {
        this.inCustomerCDigit = value;
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
     * Gets the value of the inCustomerEntryStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCustomerEntryStatus() {
        return inCustomerEntryStatus;
    }

    /**
     * Sets the value of the inCustomerEntryStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCustomerEntryStatus(String value) {
        this.inCustomerEntryStatus = value;
    }

    /**
     * Gets the value of the inCustomerFirstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCustomerFirstName() {
        return inCustomerFirstName;
    }

    /**
     * Sets the value of the inCustomerFirstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCustomerFirstName(String value) {
        this.inCustomerFirstName = value;
    }

    /**
     * Gets the value of the inIncludeAccsAsCobenefIefSuppliedFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInIncludeAccsAsCobenefIefSuppliedFlag() {
        return inIncludeAccsAsCobenefIefSuppliedFlag;
    }

    /**
     * Sets the value of the inIncludeAccsAsCobenefIefSuppliedFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInIncludeAccsAsCobenefIefSuppliedFlag(String value) {
        this.inIncludeAccsAsCobenefIefSuppliedFlag = value;
    }

    /**
     * Gets the value of the inIncludeAccsOfGrpCompanyIefSuppliedFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInIncludeAccsOfGrpCompanyIefSuppliedFlag() {
        return inIncludeAccsOfGrpCompanyIefSuppliedFlag;
    }

    /**
     * Sets the value of the inIncludeAccsOfGrpCompanyIefSuppliedFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInIncludeAccsOfGrpCompanyIefSuppliedFlag(String value) {
        this.inIncludeAccsOfGrpCompanyIefSuppliedFlag = value;
    }

    /**
     * Gets the value of the inReqAmntCustomerApplicationRequestAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInReqAmntCustomerApplicationRequestAmn() {
        return inReqAmntCustomerApplicationRequestAmn;
    }

    /**
     * Sets the value of the inReqAmntCustomerApplicationRequestAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInReqAmntCustomerApplicationRequestAmn(BigDecimal value) {
        this.inReqAmntCustomerApplicationRequestAmn = value;
    }

    /**
     * Gets the value of the inRequestIefSuppliedAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInRequestIefSuppliedAmount() {
        return inRequestIefSuppliedAmount;
    }

    /**
     * Sets the value of the inRequestIefSuppliedAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInRequestIefSuppliedAmount(BigDecimal value) {
        this.inRequestIefSuppliedAmount = value;
    }

    /**
     * Gets the value of the inSelectedCustomerCustId property.
     * 
     */
    public int getInSelectedCustomerCustId() {
        return inSelectedCustomerCustId;
    }

    /**
     * Sets the value of the inSelectedCustomerCustId property.
     * 
     */
    public void setInSelectedCustomerCustId(int value) {
        this.inSelectedCustomerCustId = value;
    }

    /**
     * Gets the value of the inSelectedLimitProductIdProduct property.
     * 
     */
    public int getInSelectedLimitProductIdProduct() {
        return inSelectedLimitProductIdProduct;
    }

    /**
     * Sets the value of the inSelectedLimitProductIdProduct property.
     * 
     */
    public void setInSelectedLimitProductIdProduct(int value) {
        this.inSelectedLimitProductIdProduct = value;
    }

    /**
     * Gets the value of the inSelectedLoanProfitsAccountAccountCd property.
     * 
     */
    public short getInSelectedLoanProfitsAccountAccountCd() {
        return inSelectedLoanProfitsAccountAccountCd;
    }

    /**
     * Sets the value of the inSelectedLoanProfitsAccountAccountCd property.
     * 
     */
    public void setInSelectedLoanProfitsAccountAccountCd(short value) {
        this.inSelectedLoanProfitsAccountAccountCd = value;
    }

    /**
     * Gets the value of the inSelectedLoanProfitsAccountAccountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInSelectedLoanProfitsAccountAccountNumber() {
        return inSelectedLoanProfitsAccountAccountNumber;
    }

    /**
     * Sets the value of the inSelectedLoanProfitsAccountAccountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInSelectedLoanProfitsAccountAccountNumber(String value) {
        this.inSelectedLoanProfitsAccountAccountNumber = value;
    }

    /**
     * Gets the value of the inSelectedLoanProfitsAccountCDigit property.
     * 
     */
    public short getInSelectedLoanProfitsAccountCDigit() {
        return inSelectedLoanProfitsAccountCDigit;
    }

    /**
     * Sets the value of the inSelectedLoanProfitsAccountCDigit property.
     * 
     */
    public void setInSelectedLoanProfitsAccountCDigit(short value) {
        this.inSelectedLoanProfitsAccountCDigit = value;
    }

    /**
     * Gets the value of the inSelectedLoanProfitsAccountCustId property.
     * 
     */
    public int getInSelectedLoanProfitsAccountCustId() {
        return inSelectedLoanProfitsAccountCustId;
    }

    /**
     * Sets the value of the inSelectedLoanProfitsAccountCustId property.
     * 
     */
    public void setInSelectedLoanProfitsAccountCustId(int value) {
        this.inSelectedLoanProfitsAccountCustId = value;
    }

    /**
     * Gets the value of the inSelectedLoanProfitsAccountMonotoringUnit property.
     * 
     */
    public int getInSelectedLoanProfitsAccountMonotoringUnit() {
        return inSelectedLoanProfitsAccountMonotoringUnit;
    }

    /**
     * Sets the value of the inSelectedLoanProfitsAccountMonotoringUnit property.
     * 
     */
    public void setInSelectedLoanProfitsAccountMonotoringUnit(int value) {
        this.inSelectedLoanProfitsAccountMonotoringUnit = value;
    }

    /**
     * Gets the value of the inSelectedLoanProfitsAccountMovementCurrency property.
     * 
     */
    public int getInSelectedLoanProfitsAccountMovementCurrency() {
        return inSelectedLoanProfitsAccountMovementCurrency;
    }

    /**
     * Sets the value of the inSelectedLoanProfitsAccountMovementCurrency property.
     * 
     */
    public void setInSelectedLoanProfitsAccountMovementCurrency(int value) {
        this.inSelectedLoanProfitsAccountMovementCurrency = value;
    }

    /**
     * Gets the value of the inSelectedLoanProfitsAccountPrftSystem property.
     * 
     */
    public short getInSelectedLoanProfitsAccountPrftSystem() {
        return inSelectedLoanProfitsAccountPrftSystem;
    }

    /**
     * Sets the value of the inSelectedLoanProfitsAccountPrftSystem property.
     * 
     */
    public void setInSelectedLoanProfitsAccountPrftSystem(short value) {
        this.inSelectedLoanProfitsAccountPrftSystem = value;
    }

    /**
     * Gets the value of the inSelectedProfitsAccountAccountCd property.
     * 
     */
    public short getInSelectedProfitsAccountAccountCd() {
        return inSelectedProfitsAccountAccountCd;
    }

    /**
     * Sets the value of the inSelectedProfitsAccountAccountCd property.
     * 
     */
    public void setInSelectedProfitsAccountAccountCd(short value) {
        this.inSelectedProfitsAccountAccountCd = value;
    }

    /**
     * Gets the value of the inSelectedProfitsAccountAccountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInSelectedProfitsAccountAccountNumber() {
        return inSelectedProfitsAccountAccountNumber;
    }

    /**
     * Sets the value of the inSelectedProfitsAccountAccountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInSelectedProfitsAccountAccountNumber(String value) {
        this.inSelectedProfitsAccountAccountNumber = value;
    }

    /**
     * Gets the value of the inSelectedProfitsAccountCDigit property.
     * 
     */
    public short getInSelectedProfitsAccountCDigit() {
        return inSelectedProfitsAccountCDigit;
    }

    /**
     * Sets the value of the inSelectedProfitsAccountCDigit property.
     * 
     */
    public void setInSelectedProfitsAccountCDigit(short value) {
        this.inSelectedProfitsAccountCDigit = value;
    }

    /**
     * Gets the value of the inSelectedProfitsAccountCustId property.
     * 
     */
    public int getInSelectedProfitsAccountCustId() {
        return inSelectedProfitsAccountCustId;
    }

    /**
     * Sets the value of the inSelectedProfitsAccountCustId property.
     * 
     */
    public void setInSelectedProfitsAccountCustId(int value) {
        this.inSelectedProfitsAccountCustId = value;
    }

    /**
     * Gets the value of the inSelectedProfitsAccountMonotoringUnit property.
     * 
     */
    public int getInSelectedProfitsAccountMonotoringUnit() {
        return inSelectedProfitsAccountMonotoringUnit;
    }

    /**
     * Sets the value of the inSelectedProfitsAccountMonotoringUnit property.
     * 
     */
    public void setInSelectedProfitsAccountMonotoringUnit(int value) {
        this.inSelectedProfitsAccountMonotoringUnit = value;
    }

    /**
     * Gets the value of the inSelectedProfitsAccountMovementCurrency property.
     * 
     */
    public int getInSelectedProfitsAccountMovementCurrency() {
        return inSelectedProfitsAccountMovementCurrency;
    }

    /**
     * Sets the value of the inSelectedProfitsAccountMovementCurrency property.
     * 
     */
    public void setInSelectedProfitsAccountMovementCurrency(int value) {
        this.inSelectedProfitsAccountMovementCurrency = value;
    }

    /**
     * Gets the value of the inSelectedProfitsAccountPrftSystem property.
     * 
     */
    public short getInSelectedProfitsAccountPrftSystem() {
        return inSelectedProfitsAccountPrftSystem;
    }

    /**
     * Sets the value of the inSelectedProfitsAccountPrftSystem property.
     * 
     */
    public void setInSelectedProfitsAccountPrftSystem(short value) {
        this.inSelectedProfitsAccountPrftSystem = value;
    }

    /**
     * Gets the value of the inTrxPrftTransactionIdTransact property.
     * 
     */
    public int getInTrxPrftTransactionIdTransact() {
        return inTrxPrftTransactionIdTransact;
    }

    /**
     * Sets the value of the inTrxPrftTransactionIdTransact property.
     * 
     */
    public void setInTrxPrftTransactionIdTransact(int value) {
        this.inTrxPrftTransactionIdTransact = value;
    }

    /**
     * Gets the value of the inTrxTerminalTerminalNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInTrxTerminalTerminalNumber() {
        return inTrxTerminalTerminalNumber;
    }

    /**
     * Sets the value of the inTrxTerminalTerminalNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInTrxTerminalTerminalNumber(String value) {
        this.inTrxTerminalTerminalNumber = value;
    }

    /**
     * Gets the value of the inContinueCustomerApplicationApplicationId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInContinueCustomerApplicationApplicationId() {
        return inContinueCustomerApplicationApplicationId;
    }

    /**
     * Sets the value of the inContinueCustomerApplicationApplicationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInContinueCustomerApplicationApplicationId(String value) {
        this.inContinueCustomerApplicationApplicationId = value;
    }

    /**
     * Gets the value of the inContinueCustomerApplicationCustId property.
     * 
     */
    public int getInContinueCustomerApplicationCustId() {
        return inContinueCustomerApplicationCustId;
    }

    /**
     * Sets the value of the inContinueCustomerApplicationCustId property.
     * 
     */
    public void setInContinueCustomerApplicationCustId(int value) {
        this.inContinueCustomerApplicationCustId = value;
    }

    /**
     * Gets the value of the inContinueCustomerApplicationUnitCode property.
     * 
     */
    public int getInContinueCustomerApplicationUnitCode() {
        return inContinueCustomerApplicationUnitCode;
    }

    /**
     * Sets the value of the inContinueCustomerApplicationUnitCode property.
     * 
     */
    public void setInContinueCustomerApplicationUnitCode(int value) {
        this.inContinueCustomerApplicationUnitCode = value;
    }

    /**
     * Gets the value of the inGrpApplicDetails property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfInGrpApplicDetailsItem }
     *     
     */
    public ArrayOfInGrpApplicDetailsItem getInGrpApplicDetails() {
        return inGrpApplicDetails;
    }

    /**
     * Sets the value of the inGrpApplicDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfInGrpApplicDetailsItem }
     *     
     */
    public void setInGrpApplicDetails(ArrayOfInGrpApplicDetailsItem value) {
        this.inGrpApplicDetails = value;
    }

}
