
package com.intrasoft_internatinal.gatewayservice.profitsext;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for FTRSC2_InterbankOutgoingOrderValueDateExport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FTRSC2_InterbankOutgoingOrderValueDateExport">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}BaseImport">
 *       &lt;sequence>
 *         &lt;element name="Command" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCommandIefSuppliedCommand" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCurrencyIdCurrency" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InCurrencyShortDescr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCustomerCustId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InDateIefSuppliedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InDaysSpecialAgrWorkValueDaysSpread" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InJustificIdJustific" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InOutgoingOrdersAccWithBankSwif" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InOutgoingOrdersAccountWithInsti" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InOutgoingOrdersBankToBank" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InOutgoingOrdersIntermBankSwift" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InOutgoingOrdersOrderValueDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InOutgoingOrdersPayeeSwiftAddres" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InOutgoingOrdersSenderToReceiver" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InOutgoingOrdersStpFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InParameterIefSuppliedChar25" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InPrftTransactionIdTransact" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InProductIdProduct" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
@XmlType(name = "FTRSC2_InterbankOutgoingOrderValueDateExport", propOrder = {
    "command",
    "inCommandIefSuppliedCommand",
    "inCurrencyIdCurrency",
    "inCurrencyShortDescr",
    "inCustomerCustId",
    "inDateIefSuppliedDate",
    "inDaysSpecialAgrWorkValueDaysSpread",
    "inJustificIdJustific",
    "inOutgoingOrdersAccWithBankSwif",
    "inOutgoingOrdersAccountWithInsti",
    "inOutgoingOrdersBankToBank",
    "inOutgoingOrdersIntermBankSwift",
    "inOutgoingOrdersOrderValueDate",
    "inOutgoingOrdersPayeeSwiftAddres",
    "inOutgoingOrdersSenderToReceiver",
    "inOutgoingOrdersStpFlag",
    "inParameterIefSuppliedChar25",
    "inPrftTransactionIdTransact",
    "inProductIdProduct",
    "inProxyTrxRecoveryReferenceNumber"
})
public class FTRSC2InterbankOutgoingOrderValueDateExport
    extends BaseImport
{

    @XmlElement(name = "Command")
    protected String command;
    @XmlElement(name = "InCommandIefSuppliedCommand")
    protected String inCommandIefSuppliedCommand;
    @XmlElement(name = "InCurrencyIdCurrency")
    protected int inCurrencyIdCurrency;
    @XmlElement(name = "InCurrencyShortDescr")
    protected String inCurrencyShortDescr;
    @XmlElement(name = "InCustomerCustId")
    protected int inCustomerCustId;
    @XmlElement(name = "InDateIefSuppliedDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inDateIefSuppliedDate;
    @XmlElement(name = "InDaysSpecialAgrWorkValueDaysSpread")
    protected short inDaysSpecialAgrWorkValueDaysSpread;
    @XmlElement(name = "InJustificIdJustific")
    protected int inJustificIdJustific;
    @XmlElement(name = "InOutgoingOrdersAccWithBankSwif")
    protected String inOutgoingOrdersAccWithBankSwif;
    @XmlElement(name = "InOutgoingOrdersAccountWithInsti")
    protected String inOutgoingOrdersAccountWithInsti;
    @XmlElement(name = "InOutgoingOrdersBankToBank")
    protected String inOutgoingOrdersBankToBank;
    @XmlElement(name = "InOutgoingOrdersIntermBankSwift")
    protected String inOutgoingOrdersIntermBankSwift;
    @XmlElement(name = "InOutgoingOrdersOrderValueDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inOutgoingOrdersOrderValueDate;
    @XmlElement(name = "InOutgoingOrdersPayeeSwiftAddres")
    protected String inOutgoingOrdersPayeeSwiftAddres;
    @XmlElement(name = "InOutgoingOrdersSenderToReceiver")
    protected String inOutgoingOrdersSenderToReceiver;
    @XmlElement(name = "InOutgoingOrdersStpFlag")
    protected String inOutgoingOrdersStpFlag;
    @XmlElement(name = "InParameterIefSuppliedChar25")
    protected String inParameterIefSuppliedChar25;
    @XmlElement(name = "InPrftTransactionIdTransact")
    protected int inPrftTransactionIdTransact;
    @XmlElement(name = "InProductIdProduct")
    protected int inProductIdProduct;
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
     * Gets the value of the inDateIefSuppliedDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInDateIefSuppliedDate() {
        return inDateIefSuppliedDate;
    }

    /**
     * Sets the value of the inDateIefSuppliedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInDateIefSuppliedDate(XMLGregorianCalendar value) {
        this.inDateIefSuppliedDate = value;
    }

    /**
     * Gets the value of the inDaysSpecialAgrWorkValueDaysSpread property.
     * 
     */
    public short getInDaysSpecialAgrWorkValueDaysSpread() {
        return inDaysSpecialAgrWorkValueDaysSpread;
    }

    /**
     * Sets the value of the inDaysSpecialAgrWorkValueDaysSpread property.
     * 
     */
    public void setInDaysSpecialAgrWorkValueDaysSpread(short value) {
        this.inDaysSpecialAgrWorkValueDaysSpread = value;
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
     * Gets the value of the inOutgoingOrdersAccountWithInsti property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInOutgoingOrdersAccountWithInsti() {
        return inOutgoingOrdersAccountWithInsti;
    }

    /**
     * Sets the value of the inOutgoingOrdersAccountWithInsti property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInOutgoingOrdersAccountWithInsti(String value) {
        this.inOutgoingOrdersAccountWithInsti = value;
    }

    /**
     * Gets the value of the inOutgoingOrdersBankToBank property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInOutgoingOrdersBankToBank() {
        return inOutgoingOrdersBankToBank;
    }

    /**
     * Sets the value of the inOutgoingOrdersBankToBank property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInOutgoingOrdersBankToBank(String value) {
        this.inOutgoingOrdersBankToBank = value;
    }

    /**
     * Gets the value of the inOutgoingOrdersIntermBankSwift property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInOutgoingOrdersIntermBankSwift() {
        return inOutgoingOrdersIntermBankSwift;
    }

    /**
     * Sets the value of the inOutgoingOrdersIntermBankSwift property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInOutgoingOrdersIntermBankSwift(String value) {
        this.inOutgoingOrdersIntermBankSwift = value;
    }

    /**
     * Gets the value of the inOutgoingOrdersOrderValueDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInOutgoingOrdersOrderValueDate() {
        return inOutgoingOrdersOrderValueDate;
    }

    /**
     * Sets the value of the inOutgoingOrdersOrderValueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInOutgoingOrdersOrderValueDate(XMLGregorianCalendar value) {
        this.inOutgoingOrdersOrderValueDate = value;
    }

    /**
     * Gets the value of the inOutgoingOrdersPayeeSwiftAddres property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInOutgoingOrdersPayeeSwiftAddres() {
        return inOutgoingOrdersPayeeSwiftAddres;
    }

    /**
     * Sets the value of the inOutgoingOrdersPayeeSwiftAddres property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInOutgoingOrdersPayeeSwiftAddres(String value) {
        this.inOutgoingOrdersPayeeSwiftAddres = value;
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
     * Gets the value of the inOutgoingOrdersStpFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInOutgoingOrdersStpFlag() {
        return inOutgoingOrdersStpFlag;
    }

    /**
     * Sets the value of the inOutgoingOrdersStpFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInOutgoingOrdersStpFlag(String value) {
        this.inOutgoingOrdersStpFlag = value;
    }

    /**
     * Gets the value of the inParameterIefSuppliedChar25 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInParameterIefSuppliedChar25() {
        return inParameterIefSuppliedChar25;
    }

    /**
     * Sets the value of the inParameterIefSuppliedChar25 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInParameterIefSuppliedChar25(String value) {
        this.inParameterIefSuppliedChar25 = value;
    }

    /**
     * Gets the value of the inPrftTransactionIdTransact property.
     * 
     */
    public int getInPrftTransactionIdTransact() {
        return inPrftTransactionIdTransact;
    }

    /**
     * Sets the value of the inPrftTransactionIdTransact property.
     * 
     */
    public void setInPrftTransactionIdTransact(int value) {
        this.inPrftTransactionIdTransact = value;
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
